.class Ltwitter4j/media/MobypictureUpload;
.super Ltwitter4j/media/AbstractImageUploadImpl;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ltwitter4j/conf/Configuration;Ljava/lang/String;Ltwitter4j/auth/OAuthAuthorization;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0, p1, p2, p3}, Ltwitter4j/media/AbstractImageUploadImpl;-><init>(Ltwitter4j/conf/Configuration;Ljava/lang/String;Ltwitter4j/auth/OAuthAuthorization;)V

    .line 35
    return-void
.end method


# virtual methods
.method protected postUpload()Ljava/lang/String;
    .locals 5

    .prologue
    .line 39
    iget-object v0, p0, Ltwitter4j/media/MobypictureUpload;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    invoke-virtual {v0}, Ltwitter4j/internal/http/HttpResponse;->getStatusCode()I

    move-result v0

    .line 40
    const/16 v1, 0xc8

    if-eq v0, v1, :cond_0

    .line 41
    new-instance v0, Ltwitter4j/TwitterException;

    const-string v1, "Mobypic image upload returned invalid status code"

    iget-object v2, p0, Ltwitter4j/media/MobypictureUpload;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    invoke-direct {v0, v1, v2}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/String;Ltwitter4j/internal/http/HttpResponse;)V

    throw v0

    .line 43
    :cond_0
    iget-object v0, p0, Ltwitter4j/media/MobypictureUpload;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    invoke-virtual {v0}, Ltwitter4j/internal/http/HttpResponse;->asString()Ljava/lang/String;

    move-result-object v1

    .line 46
    :try_start_0
    new-instance v0, Ltwitter4j/internal/org/json/JSONObject;

    invoke-direct {v0, v1}, Ltwitter4j/internal/org/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 47
    const-string v2, "media"

    invoke-virtual {v0, v2}, Ltwitter4j/internal/org/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 48
    const-string v2, "media"

    invoke-virtual {v0, v2}, Ltwitter4j/internal/org/json/JSONObject;->getJSONObject(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONObject;

    move-result-object v0

    const-string v2, "mediaurl"

    invoke-virtual {v0, v2}, Ltwitter4j/internal/org/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ltwitter4j/internal/org/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 50
    :catch_0
    move-exception v0

    .line 51
    new-instance v2, Ltwitter4j/TwitterException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Invalid Mobypic response: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1, v0}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 54
    :cond_1
    new-instance v0, Ltwitter4j/TwitterException;

    const-string v1, "Unknown Mobypic response"

    iget-object v2, p0, Ltwitter4j/media/MobypictureUpload;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    invoke-direct {v0, v1, v2}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/String;Ltwitter4j/internal/http/HttpResponse;)V

    throw v0
.end method

.method protected preUpload()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 59
    const-string v0, "https://api.mobypicture.com/2.0/upload.json"

    iput-object v0, p0, Ltwitter4j/media/MobypictureUpload;->uploadUrl:Ljava/lang/String;

    .line 60
    const-string v0, "https://api.twitter.com/1.1/account/verify_credentials.json"

    invoke-virtual {p0, v0}, Ltwitter4j/media/MobypictureUpload;->generateVerifyCredentialsAuthorizationHeader(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 62
    iget-object v1, p0, Ltwitter4j/media/MobypictureUpload;->headers:Ljava/util/Map;

    const-string v2, "X-Auth-Service-Provider"

    const-string v3, "https://api.twitter.com/1.1/account/verify_credentials.json"

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    iget-object v1, p0, Ltwitter4j/media/MobypictureUpload;->headers:Ljava/util/Map;

    const-string v2, "X-Verify-Credentials-Authorization"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    iget-object v0, p0, Ltwitter4j/media/MobypictureUpload;->apiKey:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 66
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No API Key for Mobypic specified. put media.providerAPIKey in twitter4j.properties."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 68
    :cond_0
    const/4 v0, 0x2

    new-array v0, v0, [Ltwitter4j/internal/http/HttpParameter;

    new-instance v1, Ltwitter4j/internal/http/HttpParameter;

    const-string v2, "key"

    iget-object v3, p0, Ltwitter4j/media/MobypictureUpload;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v1, v0, v4

    iget-object v1, p0, Ltwitter4j/media/MobypictureUpload;->image:Ltwitter4j/internal/http/HttpParameter;

    aput-object v1, v0, v5

    .line 71
    iget-object v1, p0, Ltwitter4j/media/MobypictureUpload;->message:Ltwitter4j/internal/http/HttpParameter;

    if-eqz v1, :cond_1

    .line 72
    new-array v1, v5, [Ltwitter4j/internal/http/HttpParameter;

    iget-object v2, p0, Ltwitter4j/media/MobypictureUpload;->message:Ltwitter4j/internal/http/HttpParameter;

    aput-object v2, v1, v4

    invoke-virtual {p0, v1, v0}, Ltwitter4j/media/MobypictureUpload;->appendHttpParameters([Ltwitter4j/internal/http/HttpParameter;[Ltwitter4j/internal/http/HttpParameter;)[Ltwitter4j/internal/http/HttpParameter;

    move-result-object v0

    .line 76
    :cond_1
    iput-object v0, p0, Ltwitter4j/media/MobypictureUpload;->postParameter:[Ltwitter4j/internal/http/HttpParameter;

    .line 77
    return-void
.end method
