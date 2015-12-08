.class Ltwitter4j/media/TwitgooUpload;
.super Ltwitter4j/media/AbstractImageUploadImpl;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ltwitter4j/conf/Configuration;Ltwitter4j/auth/OAuthAuthorization;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0, p1, p2}, Ltwitter4j/media/AbstractImageUploadImpl;-><init>(Ltwitter4j/conf/Configuration;Ltwitter4j/auth/OAuthAuthorization;)V

    .line 33
    return-void
.end method


# virtual methods
.method protected postUpload()Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v5, -0x1

    .line 38
    iget-object v0, p0, Ltwitter4j/media/TwitgooUpload;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    invoke-virtual {v0}, Ltwitter4j/internal/http/HttpResponse;->getStatusCode()I

    move-result v0

    .line 39
    const/16 v1, 0xc8

    if-eq v0, v1, :cond_0

    .line 40
    new-instance v0, Ltwitter4j/TwitterException;

    const-string v1, "Twitgoo image upload returned invalid status code"

    iget-object v2, p0, Ltwitter4j/media/TwitgooUpload;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    invoke-direct {v0, v1, v2}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/String;Ltwitter4j/internal/http/HttpResponse;)V

    throw v0

    .line 42
    :cond_0
    iget-object v0, p0, Ltwitter4j/media/TwitgooUpload;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    invoke-virtual {v0}, Ltwitter4j/internal/http/HttpResponse;->asString()Ljava/lang/String;

    move-result-object v0

    .line 43
    const-string v1, "<rsp status=\"ok\">"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 44
    const-string v1, "<mediaurl>"

    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    .line 46
    if-eq v2, v5, :cond_2

    .line 47
    const-string v3, "</mediaurl>"

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v4, v2

    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v3

    .line 48
    if-eq v3, v5, :cond_2

    .line 49
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v2

    invoke-virtual {v0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 52
    :cond_1
    const-string v1, "<rsp status=\"fail\">"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 53
    const-string v1, "msg=\""

    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    .line 55
    if-eq v2, v5, :cond_2

    .line 56
    const-string v3, "\""

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v4, v2

    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v3

    .line 57
    if-eq v3, v5, :cond_2

    .line 58
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v2

    invoke-virtual {v0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 59
    new-instance v1, Ltwitter4j/TwitterException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Invalid Twitgoo response: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 64
    :cond_2
    new-instance v0, Ltwitter4j/TwitterException;

    const-string v1, "Unknown Twitgoo response"

    iget-object v2, p0, Ltwitter4j/media/TwitgooUpload;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    invoke-direct {v0, v1, v2}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/String;Ltwitter4j/internal/http/HttpResponse;)V

    throw v0
.end method

.method protected preUpload()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 69
    const-string v0, "http://twitgoo.com/api/uploadAndPost"

    iput-object v0, p0, Ltwitter4j/media/TwitgooUpload;->uploadUrl:Ljava/lang/String;

    .line 70
    const-string v0, "https://api.twitter.com/1/account/verify_credentials.json"

    invoke-virtual {p0, v0}, Ltwitter4j/media/TwitgooUpload;->generateVerifyCredentialsAuthorizationHeader(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 72
    iget-object v1, p0, Ltwitter4j/media/TwitgooUpload;->headers:Ljava/util/Map;

    const-string v2, "X-Auth-Service-Provider"

    const-string v3, "https://api.twitter.com/1/account/verify_credentials.json"

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    iget-object v1, p0, Ltwitter4j/media/TwitgooUpload;->headers:Ljava/util/Map;

    const-string v2, "X-Verify-Credentials-Authorization"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    const/4 v0, 0x2

    new-array v0, v0, [Ltwitter4j/internal/http/HttpParameter;

    new-instance v1, Ltwitter4j/internal/http/HttpParameter;

    const-string v2, "no_twitter_post"

    const-string v3, "1"

    invoke-direct {v1, v2, v3}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v1, v0, v4

    iget-object v1, p0, Ltwitter4j/media/TwitgooUpload;->image:Ltwitter4j/internal/http/HttpParameter;

    aput-object v1, v0, v5

    .line 79
    iget-object v1, p0, Ltwitter4j/media/TwitgooUpload;->message:Ltwitter4j/internal/http/HttpParameter;

    if-eqz v1, :cond_0

    .line 80
    new-array v1, v5, [Ltwitter4j/internal/http/HttpParameter;

    iget-object v2, p0, Ltwitter4j/media/TwitgooUpload;->message:Ltwitter4j/internal/http/HttpParameter;

    aput-object v2, v1, v4

    invoke-virtual {p0, v1, v0}, Ltwitter4j/media/TwitgooUpload;->appendHttpParameters([Ltwitter4j/internal/http/HttpParameter;[Ltwitter4j/internal/http/HttpParameter;)[Ltwitter4j/internal/http/HttpParameter;

    move-result-object v0

    .line 84
    :cond_0
    iput-object v0, p0, Ltwitter4j/media/TwitgooUpload;->postParameter:[Ltwitter4j/internal/http/HttpParameter;

    .line 85
    return-void
.end method
