package app.lawnchair.lawnicons.api

import app.lawnchair.lawnicons.model.GitHubContributor
import retrofit2.http.GET

interface GitHubContributorsAPI {

    @GET("repos/yfunk/lawnicons-refilled/contributors")
    suspend fun getContributors(): List<GitHubContributor>
}
