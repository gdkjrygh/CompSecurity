.class Ltwitter4j/media/YFrogUpload;
.super Ltwitter4j/media/AbstractImageUploadImpl;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ltwitter4j/conf/Configuration;Ltwitter4j/auth/OAuthAuthorization;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0, p1, p2}, Ltwitter4j/media/AbstractImageUploadImpl;-><init>(Ltwitter4j/conf/Configuration;Ltwitter4j/auth/OAuthAuthorization;)V

    .line 36
    return-void
.end method


# virtual methods
.method protected postUpload()Ljava/lang/String;
    .locals 4

    .prologue
    .line 40
    iget-object v0, p0, Ltwitter4j/media/YFrogUpload;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    invoke-virtual {v0}, Ltwitter4j/internal/http/HttpResponse;->getStatusCode()I

    move-result v0

    .line 41
    const/16 v1, 0xc8

    if-eq v0, v1, :cond_0

    .line 42
    new-instance v0, Ltwitter4j/TwitterException;

    const-string v1, "YFrog image upload returned invalid status code"

    iget-object v2, p0, Ltwitter4j/media/YFrogUpload;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    invoke-direct {v0, v1, v2}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/String;Ltwitter4j/internal/http/HttpResponse;)V

    throw v0

    .line 45
    :cond_0
    iget-object v0, p0, Ltwitter4j/media/YFrogUpload;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    invoke-virtual {v0}, Ltwitter4j/internal/http/HttpResponse;->asString()Ljava/lang/String;

    move-result-object v0

    .line 46
    const-string v1, "<rsp stat=\"fail\">"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 47
    const-string v1, "msg"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, 0x5

    const-string v2, "\""

    invoke-virtual {v0, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 48
    new-instance v1, Ltwitter4j/TwitterException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "YFrog image upload failed with this error message: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Ltwitter4j/media/YFrogUpload;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    invoke-direct {v1, v0, v2}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/String;Ltwitter4j/internal/http/HttpResponse;)V

    throw v1

    .line 50
    :cond_1
    const-string v1, "<rsp stat=\"ok\">"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 51
    const-string v1, "<mediaurl>"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, 0xa

    const-string v2, "</mediaurl>"

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 54
    :cond_2
    new-instance v0, Ltwitter4j/TwitterException;

    const-string v1, "Unknown YFrog response"

    iget-object v2, p0, Ltwitter4j/media/YFrogUpload;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    invoke-direct {v0, v1, v2}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/String;Ltwitter4j/internal/http/HttpResponse;)V

    throw v0
.end method

.method protected preUpload()V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 59
    const-string v0, "https://yfrog.com/api/xauth_upload"

    iput-object v0, p0, Ltwitter4j/media/YFrogUpload;->uploadUrl:Ljava/lang/String;

    .line 60
    const-string v0, "https://api.twitter.com/1/account/verify_credentials.xml"

    invoke-virtual {p0, v0}, Ltwitter4j/media/YFrogUpload;->generateVerifyCredentialsAuthorizationURL(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 61
    new-instance v0, Ltwitter4j/TwitterFactory;

    invoke-direct {v0}, Ltwitter4j/TwitterFactory;-><init>()V

    iget-object v2, p0, Ltwitter4j/media/YFrogUpload;->oauth:Ltwitter4j/auth/OAuthAuthorization;

    invoke-virtual {v0, v2}, Ltwitter4j/TwitterFactory;->getInstance(Ltwitter4j/auth/Authorization;)Ltwitter4j/Twitter;

    move-result-object v2

    .line 63
    const/4 v0, 0x4

    new-array v0, v0, [Ltwitter4j/internal/http/HttpParameter;

    new-instance v3, Ltwitter4j/internal/http/HttpParameter;

    const-string v4, "auth"

    const-string v5, "oauth"

    invoke-direct {v3, v4, v5}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v3, v0, v6

    new-instance v3, Ltwitter4j/internal/http/HttpParameter;

    const-string v4, "username"

    invoke-interface {v2}, Ltwitter4j/Twitter;->verifyCredentials()Ltwitter4j/User;

    move-result-object v2

    invoke-interface {v2}, Ltwitter4j/User;->getScreenName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v3, v0, v7

    const/4 v2, 0x2

    new-instance v3, Ltwitter4j/internal/http/HttpParameter;

    const-string v4, "verify_url"

    invoke-direct {v3, v4, v1}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v3, v0, v2

    const/4 v1, 0x3

    iget-object v2, p0, Ltwitter4j/media/YFrogUpload;->image:Ltwitter4j/internal/http/HttpParameter;

    aput-object v2, v0, v1

    .line 69
    iget-object v1, p0, Ltwitter4j/media/YFrogUpload;->message:Ltwitter4j/internal/http/HttpParameter;

    if-eqz v1, :cond_0

    .line 70
    new-array v1, v7, [Ltwitter4j/internal/http/HttpParameter;

    iget-object v2, p0, Ltwitter4j/media/YFrogUpload;->message:Ltwitter4j/internal/http/HttpParameter;

    aput-object v2, v1, v6

    invoke-virtual {p0, v1, v0}, Ltwitter4j/media/YFrogUpload;->appendHttpParameters([Ltwitter4j/internal/http/HttpParameter;[Ltwitter4j/internal/http/HttpParameter;)[Ltwitter4j/internal/http/HttpParameter;

    move-result-object v0

    .line 74
    :cond_0
    iput-object v0, p0, Ltwitter4j/media/YFrogUpload;->postParameter:[Ltwitter4j/internal/http/HttpParameter;

    .line 75
    return-void
.end method
