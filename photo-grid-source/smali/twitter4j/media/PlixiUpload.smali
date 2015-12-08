.class Ltwitter4j/media/PlixiUpload;
.super Ltwitter4j/media/AbstractImageUploadImpl;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ltwitter4j/conf/Configuration;Ljava/lang/String;Ltwitter4j/auth/OAuthAuthorization;)V
    .locals 2

    .prologue
    .line 34
    invoke-direct {p0, p1, p2, p3}, Ltwitter4j/media/AbstractImageUploadImpl;-><init>(Ltwitter4j/conf/Configuration;Ljava/lang/String;Ltwitter4j/auth/OAuthAuthorization;)V

    .line 35
    sget-object v0, Ltwitter4j/media/PlixiUpload;->logger:Ltwitter4j/internal/logging/Logger;

    const-string v1, "Lockerz is no longer providing API."

    invoke-virtual {v0, v1}, Ltwitter4j/internal/logging/Logger;->warn(Ljava/lang/String;)V

    .line 36
    const-string v0, "http://api.plixi.com/api/upload.aspx"

    iput-object v0, p0, Ltwitter4j/media/PlixiUpload;->uploadUrl:Ljava/lang/String;

    .line 37
    return-void
.end method


# virtual methods
.method protected postUpload()Ljava/lang/String;
    .locals 4

    .prologue
    .line 41
    iget-object v0, p0, Ltwitter4j/media/PlixiUpload;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    invoke-virtual {v0}, Ltwitter4j/internal/http/HttpResponse;->getStatusCode()I

    move-result v0

    .line 42
    const/16 v1, 0xc9

    if-eq v0, v1, :cond_0

    .line 43
    new-instance v0, Ltwitter4j/TwitterException;

    const-string v1, "Plixi image upload returned invalid status code"

    iget-object v2, p0, Ltwitter4j/media/PlixiUpload;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    invoke-direct {v0, v1, v2}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/String;Ltwitter4j/internal/http/HttpResponse;)V

    throw v0

    .line 45
    :cond_0
    iget-object v0, p0, Ltwitter4j/media/PlixiUpload;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    invoke-virtual {v0}, Ltwitter4j/internal/http/HttpResponse;->asString()Ljava/lang/String;

    move-result-object v0

    .line 47
    const-string v1, "<Error><ErrorCode>"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 48
    const-string v1, "<ErrorCode>"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, 0xb

    const-string v2, "</ErrorCode>"

    invoke-virtual {v0, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 49
    new-instance v1, Ltwitter4j/TwitterException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Plixi image upload failed with this error message: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Ltwitter4j/media/PlixiUpload;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    invoke-direct {v1, v0, v2}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/String;Ltwitter4j/internal/http/HttpResponse;)V

    throw v1

    .line 51
    :cond_1
    const-string v1, "<Status>OK</Status>"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 52
    const-string v1, "<MediaUrl>"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, 0xa

    const-string v2, "</MediaUrl>"

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 55
    :cond_2
    new-instance v0, Ltwitter4j/TwitterException;

    const-string v1, "Unknown Plixi response"

    iget-object v2, p0, Ltwitter4j/media/PlixiUpload;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    invoke-direct {v0, v1, v2}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/String;Ltwitter4j/internal/http/HttpResponse;)V

    throw v0
.end method

.method protected preUpload()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 60
    const-string v0, "https://api.twitter.com/1.1/account/verify_credentials.json"

    invoke-virtual {p0, v0}, Ltwitter4j/media/PlixiUpload;->generateVerifyCredentialsAuthorizationHeader(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 62
    iget-object v1, p0, Ltwitter4j/media/PlixiUpload;->headers:Ljava/util/Map;

    const-string v2, "X-Auth-Service-Provider"

    const-string v3, "https://api.twitter.com/1.1/account/verify_credentials.json"

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    iget-object v1, p0, Ltwitter4j/media/PlixiUpload;->headers:Ljava/util/Map;

    const-string v2, "X-Verify-Credentials-Authorization"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    iget-object v0, p0, Ltwitter4j/media/PlixiUpload;->apiKey:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 66
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No API Key for Plixi specified. put media.providerAPIKey in twitter4j.properties."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 68
    :cond_0
    const/4 v0, 0x2

    new-array v0, v0, [Ltwitter4j/internal/http/HttpParameter;

    new-instance v1, Ltwitter4j/internal/http/HttpParameter;

    const-string v2, "api_key"

    iget-object v3, p0, Ltwitter4j/media/PlixiUpload;->apiKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v1, v0, v4

    iget-object v1, p0, Ltwitter4j/media/PlixiUpload;->image:Ltwitter4j/internal/http/HttpParameter;

    aput-object v1, v0, v5

    .line 72
    iget-object v1, p0, Ltwitter4j/media/PlixiUpload;->message:Ltwitter4j/internal/http/HttpParameter;

    if-eqz v1, :cond_1

    .line 73
    new-array v1, v5, [Ltwitter4j/internal/http/HttpParameter;

    iget-object v2, p0, Ltwitter4j/media/PlixiUpload;->message:Ltwitter4j/internal/http/HttpParameter;

    aput-object v2, v1, v4

    invoke-virtual {p0, v1, v0}, Ltwitter4j/media/PlixiUpload;->appendHttpParameters([Ltwitter4j/internal/http/HttpParameter;[Ltwitter4j/internal/http/HttpParameter;)[Ltwitter4j/internal/http/HttpParameter;

    move-result-object v0

    .line 76
    :cond_1
    iput-object v0, p0, Ltwitter4j/media/PlixiUpload;->postParameter:[Ltwitter4j/internal/http/HttpParameter;

    .line 77
    return-void
.end method
