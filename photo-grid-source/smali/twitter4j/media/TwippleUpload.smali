.class Ltwitter4j/media/TwippleUpload;
.super Ltwitter4j/media/AbstractImageUploadImpl;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ltwitter4j/conf/Configuration;Ltwitter4j/auth/OAuthAuthorization;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0, p1, p2}, Ltwitter4j/media/AbstractImageUploadImpl;-><init>(Ltwitter4j/conf/Configuration;Ltwitter4j/auth/OAuthAuthorization;)V

    .line 32
    return-void
.end method


# virtual methods
.method protected postUpload()Ljava/lang/String;
    .locals 4

    .prologue
    .line 36
    iget-object v0, p0, Ltwitter4j/media/TwippleUpload;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    invoke-virtual {v0}, Ltwitter4j/internal/http/HttpResponse;->getStatusCode()I

    move-result v0

    .line 37
    const/16 v1, 0xc8

    if-eq v0, v1, :cond_0

    .line 38
    new-instance v0, Ltwitter4j/TwitterException;

    const-string v1, "Twipple image upload returned invalid status code"

    iget-object v2, p0, Ltwitter4j/media/TwippleUpload;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    invoke-direct {v0, v1, v2}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/String;Ltwitter4j/internal/http/HttpResponse;)V

    throw v0

    .line 41
    :cond_0
    iget-object v0, p0, Ltwitter4j/media/TwippleUpload;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    invoke-virtual {v0}, Ltwitter4j/internal/http/HttpResponse;->asString()Ljava/lang/String;

    move-result-object v0

    .line 42
    const-string v1, "<rsp stat=\"fail\">"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 43
    const-string v1, "msg"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, 0x5

    const-string v2, "\""

    invoke-virtual {v0, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 44
    new-instance v1, Ltwitter4j/TwitterException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Twipple image upload failed with this error message: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Ltwitter4j/media/TwippleUpload;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    invoke-direct {v1, v0, v2}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/String;Ltwitter4j/internal/http/HttpResponse;)V

    throw v1

    .line 46
    :cond_1
    const-string v1, "<rsp stat=\"ok\">"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 47
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

    .line 50
    :cond_2
    new-instance v0, Ltwitter4j/TwitterException;

    const-string v1, "Unknown Twipple response"

    iget-object v2, p0, Ltwitter4j/media/TwippleUpload;->httpResponse:Ltwitter4j/internal/http/HttpResponse;

    invoke-direct {v0, v1, v2}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/String;Ltwitter4j/internal/http/HttpResponse;)V

    throw v0
.end method

.method protected preUpload()V
    .locals 5

    .prologue
    .line 55
    const-string v0, "http://p.twipple.jp/api/upload"

    iput-object v0, p0, Ltwitter4j/media/TwippleUpload;->uploadUrl:Ljava/lang/String;

    .line 56
    const-string v0, "https://api.twitter.com/1.1/account/verify_credentials.json"

    invoke-virtual {p0, v0}, Ltwitter4j/media/TwippleUpload;->generateVerifyCredentialsAuthorizationURL(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 58
    const/4 v1, 0x2

    new-array v1, v1, [Ltwitter4j/internal/http/HttpParameter;

    const/4 v2, 0x0

    new-instance v3, Ltwitter4j/internal/http/HttpParameter;

    const-string v4, "verify_url"

    invoke-direct {v3, v4, v0}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v3, v1, v2

    const/4 v0, 0x1

    iget-object v2, p0, Ltwitter4j/media/TwippleUpload;->image:Ltwitter4j/internal/http/HttpParameter;

    aput-object v2, v1, v0

    iput-object v1, p0, Ltwitter4j/media/TwippleUpload;->postParameter:[Ltwitter4j/internal/http/HttpParameter;

    .line 61
    return-void
.end method
