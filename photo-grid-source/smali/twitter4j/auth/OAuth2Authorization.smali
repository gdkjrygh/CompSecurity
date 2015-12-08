.class public Ltwitter4j/auth/OAuth2Authorization;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ltwitter4j/auth/Authorization;
.implements Ltwitter4j/auth/OAuth2Support;


# static fields
.field private static final serialVersionUID:J = 0x3b5315c6f22864f1L


# instance fields
.field private final conf:Ltwitter4j/conf/Configuration;

.field private consumerKey:Ljava/lang/String;

.field private consumerSecret:Ljava/lang/String;

.field private http:Ltwitter4j/internal/http/HttpClientWrapper;

.field private token:Ltwitter4j/auth/OAuth2Token;


# direct methods
.method public constructor <init>(Ltwitter4j/conf/Configuration;)V
    .locals 2

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Ltwitter4j/auth/OAuth2Authorization;->conf:Ltwitter4j/conf/Configuration;

    .line 45
    invoke-interface {p1}, Ltwitter4j/conf/Configuration;->getOAuthConsumerKey()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ltwitter4j/conf/Configuration;->getOAuthConsumerSecret()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ltwitter4j/auth/OAuth2Authorization;->setOAuthConsumer(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    new-instance v0, Ltwitter4j/internal/http/HttpClientWrapper;

    invoke-direct {v0, p1}, Ltwitter4j/internal/http/HttpClientWrapper;-><init>(Ltwitter4j/internal/http/HttpClientWrapperConfiguration;)V

    iput-object v0, p0, Ltwitter4j/auth/OAuth2Authorization;->http:Ltwitter4j/internal/http/HttpClientWrapper;

    .line 47
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 133
    if-eqz p1, :cond_0

    instance-of v1, p1, Ltwitter4j/auth/OAuth2Authorization;

    if-nez v1, :cond_1

    .line 148
    :cond_0
    :goto_0
    return v0

    .line 137
    :cond_1
    check-cast p1, Ltwitter4j/auth/OAuth2Authorization;

    .line 138
    iget-object v1, p0, Ltwitter4j/auth/OAuth2Authorization;->consumerKey:Ljava/lang/String;

    if-eqz v1, :cond_5

    iget-object v1, p0, Ltwitter4j/auth/OAuth2Authorization;->consumerKey:Ljava/lang/String;

    iget-object v2, p1, Ltwitter4j/auth/OAuth2Authorization;->consumerKey:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 141
    :cond_2
    iget-object v1, p0, Ltwitter4j/auth/OAuth2Authorization;->consumerSecret:Ljava/lang/String;

    if-eqz v1, :cond_6

    iget-object v1, p0, Ltwitter4j/auth/OAuth2Authorization;->consumerSecret:Ljava/lang/String;

    iget-object v2, p1, Ltwitter4j/auth/OAuth2Authorization;->consumerSecret:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 144
    :cond_3
    iget-object v1, p0, Ltwitter4j/auth/OAuth2Authorization;->token:Ltwitter4j/auth/OAuth2Token;

    if-eqz v1, :cond_7

    iget-object v1, p0, Ltwitter4j/auth/OAuth2Authorization;->token:Ltwitter4j/auth/OAuth2Token;

    iget-object v2, p1, Ltwitter4j/auth/OAuth2Authorization;->token:Ltwitter4j/auth/OAuth2Token;

    invoke-virtual {v1, v2}, Ltwitter4j/auth/OAuth2Token;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 148
    :cond_4
    const/4 v0, 0x1

    goto :goto_0

    .line 138
    :cond_5
    iget-object v1, p1, Ltwitter4j/auth/OAuth2Authorization;->consumerKey:Ljava/lang/String;

    if-eqz v1, :cond_2

    goto :goto_0

    .line 141
    :cond_6
    iget-object v1, p1, Ltwitter4j/auth/OAuth2Authorization;->consumerSecret:Ljava/lang/String;

    if-eqz v1, :cond_3

    goto :goto_0

    .line 144
    :cond_7
    iget-object v1, p1, Ltwitter4j/auth/OAuth2Authorization;->token:Ltwitter4j/auth/OAuth2Token;

    if-eqz v1, :cond_4

    goto :goto_0
.end method

.method public getAuthorizationHeader(Ltwitter4j/internal/http/HttpRequest;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 108
    iget-object v0, p0, Ltwitter4j/auth/OAuth2Authorization;->token:Ltwitter4j/auth/OAuth2Token;

    if-nez v0, :cond_0

    .line 109
    const-string v0, ""

    .line 111
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ltwitter4j/auth/OAuth2Authorization;->consumerKey:Ljava/lang/String;

    const-string v3, "UTF-8"

    invoke-static {v2, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Ltwitter4j/auth/OAuth2Authorization;->consumerSecret:Ljava/lang/String;

    const-string v3, "UTF-8"

    invoke-static {v2, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 119
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Basic "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-static {v0}, Ltwitter4j/internal/http/BASE64Encoder;->encode([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 122
    :goto_1
    return-object v0

    :cond_0
    iget-object v0, p0, Ltwitter4j/auth/OAuth2Authorization;->token:Ltwitter4j/auth/OAuth2Token;

    invoke-virtual {v0}, Ltwitter4j/auth/OAuth2Token;->generateAuthorizationHeader()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public getOAuth2Token()Ltwitter4j/auth/OAuth2Token;
    .locals 5

    .prologue
    .line 57
    iget-object v0, p0, Ltwitter4j/auth/OAuth2Authorization;->token:Ltwitter4j/auth/OAuth2Token;

    if-eqz v0, :cond_0

    .line 58
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "OAuth 2 Bearer Token is already available."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 61
    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Ltwitter4j/internal/http/HttpParameter;

    .line 62
    const/4 v1, 0x0

    new-instance v2, Ltwitter4j/internal/http/HttpParameter;

    const-string v3, "grant_type"

    const-string v4, "client_credentials"

    invoke-direct {v2, v3, v4}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    .line 64
    iget-object v1, p0, Ltwitter4j/auth/OAuth2Authorization;->http:Ltwitter4j/internal/http/HttpClientWrapper;

    iget-object v2, p0, Ltwitter4j/auth/OAuth2Authorization;->conf:Ltwitter4j/conf/Configuration;

    invoke-interface {v2}, Ltwitter4j/conf/Configuration;->getOAuth2TokenURL()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0, p0}, Ltwitter4j/internal/http/HttpClientWrapper;->post(Ljava/lang/String;[Ltwitter4j/internal/http/HttpParameter;Ltwitter4j/auth/Authorization;)Ltwitter4j/internal/http/HttpResponse;

    move-result-object v0

    .line 65
    invoke-virtual {v0}, Ltwitter4j/internal/http/HttpResponse;->getStatusCode()I

    move-result v1

    const/16 v2, 0xc8

    if-eq v1, v2, :cond_1

    .line 66
    new-instance v1, Ltwitter4j/TwitterException;

    const-string v2, "Obtaining OAuth 2 Bearer Token failed."

    invoke-direct {v1, v2, v0}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/String;Ltwitter4j/internal/http/HttpResponse;)V

    throw v1

    .line 68
    :cond_1
    new-instance v1, Ltwitter4j/auth/OAuth2Token;

    invoke-direct {v1, v0}, Ltwitter4j/auth/OAuth2Token;-><init>(Ltwitter4j/internal/http/HttpResponse;)V

    iput-object v1, p0, Ltwitter4j/auth/OAuth2Authorization;->token:Ltwitter4j/auth/OAuth2Token;

    .line 69
    iget-object v0, p0, Ltwitter4j/auth/OAuth2Authorization;->token:Ltwitter4j/auth/OAuth2Token;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 153
    iget-object v0, p0, Ltwitter4j/auth/OAuth2Authorization;->consumerKey:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ltwitter4j/auth/OAuth2Authorization;->consumerKey:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    .line 154
    :goto_0
    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Ltwitter4j/auth/OAuth2Authorization;->consumerSecret:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Ltwitter4j/auth/OAuth2Authorization;->consumerSecret:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v0, v2

    .line 155
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Ltwitter4j/auth/OAuth2Authorization;->token:Ltwitter4j/auth/OAuth2Token;

    if-eqz v2, :cond_0

    iget-object v1, p0, Ltwitter4j/auth/OAuth2Authorization;->token:Ltwitter4j/auth/OAuth2Token;

    invoke-virtual {v1}, Ltwitter4j/auth/OAuth2Token;->hashCode()I

    move-result v1

    :cond_0
    add-int/2addr v0, v1

    .line 156
    return v0

    :cond_1
    move v0, v1

    .line 153
    goto :goto_0

    :cond_2
    move v0, v1

    .line 154
    goto :goto_1
.end method

.method public invalidateOAuth2Token()V
    .locals 5

    .prologue
    .line 79
    iget-object v0, p0, Ltwitter4j/auth/OAuth2Authorization;->token:Ltwitter4j/auth/OAuth2Token;

    if-nez v0, :cond_0

    .line 80
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "OAuth 2 Bearer Token is not available."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 83
    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Ltwitter4j/internal/http/HttpParameter;

    .line 84
    const/4 v1, 0x0

    new-instance v2, Ltwitter4j/internal/http/HttpParameter;

    const-string v3, "access_token"

    iget-object v4, p0, Ltwitter4j/auth/OAuth2Authorization;->token:Ltwitter4j/auth/OAuth2Token;

    invoke-virtual {v4}, Ltwitter4j/auth/OAuth2Token;->getAccessToken()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    .line 86
    iget-object v1, p0, Ltwitter4j/auth/OAuth2Authorization;->token:Ltwitter4j/auth/OAuth2Token;

    .line 90
    const/4 v2, 0x0

    :try_start_0
    iput-object v2, p0, Ltwitter4j/auth/OAuth2Authorization;->token:Ltwitter4j/auth/OAuth2Token;

    .line 92
    iget-object v2, p0, Ltwitter4j/auth/OAuth2Authorization;->http:Ltwitter4j/internal/http/HttpClientWrapper;

    iget-object v3, p0, Ltwitter4j/auth/OAuth2Authorization;->conf:Ltwitter4j/conf/Configuration;

    invoke-interface {v3}, Ltwitter4j/conf/Configuration;->getOAuth2InvalidateTokenURL()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0, p0}, Ltwitter4j/internal/http/HttpClientWrapper;->post(Ljava/lang/String;[Ltwitter4j/internal/http/HttpParameter;Ltwitter4j/auth/Authorization;)Ltwitter4j/internal/http/HttpResponse;

    move-result-object v0

    .line 93
    invoke-virtual {v0}, Ltwitter4j/internal/http/HttpResponse;->getStatusCode()I

    move-result v2

    const/16 v3, 0xc8

    if-eq v2, v3, :cond_1

    .line 94
    new-instance v2, Ltwitter4j/TwitterException;

    const-string v3, "Invalidating OAuth 2 Bearer Token failed."

    invoke-direct {v2, v3, v0}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/String;Ltwitter4j/internal/http/HttpResponse;)V

    throw v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    :catchall_0
    move-exception v0

    .line 101
    iput-object v1, p0, Ltwitter4j/auth/OAuth2Authorization;->token:Ltwitter4j/auth/OAuth2Token;

    throw v0

    .line 100
    :cond_1
    return-void
.end method

.method public isEnabled()Z
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Ltwitter4j/auth/OAuth2Authorization;->token:Ltwitter4j/auth/OAuth2Token;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setOAuth2Token(Ltwitter4j/auth/OAuth2Token;)V
    .locals 0

    .prologue
    .line 74
    iput-object p1, p0, Ltwitter4j/auth/OAuth2Authorization;->token:Ltwitter4j/auth/OAuth2Token;

    .line 75
    return-void
.end method

.method public setOAuthConsumer(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 51
    if-eqz p1, :cond_0

    :goto_0
    iput-object p1, p0, Ltwitter4j/auth/OAuth2Authorization;->consumerKey:Ljava/lang/String;

    .line 52
    if-eqz p2, :cond_1

    :goto_1
    iput-object p2, p0, Ltwitter4j/auth/OAuth2Authorization;->consumerSecret:Ljava/lang/String;

    .line 53
    return-void

    .line 51
    :cond_0
    const-string p1, ""

    goto :goto_0

    .line 52
    :cond_1
    const-string p2, ""

    goto :goto_1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 161
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "OAuth2Authorization{consumerKey=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ltwitter4j/auth/OAuth2Authorization;->consumerKey:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", consumerSecret=\'******************************************\', token="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v0, p0, Ltwitter4j/auth/OAuth2Authorization;->token:Ltwitter4j/auth/OAuth2Token;

    if-nez v0, :cond_0

    const-string v0, "null"

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Ltwitter4j/auth/OAuth2Authorization;->token:Ltwitter4j/auth/OAuth2Token;

    invoke-virtual {v0}, Ltwitter4j/auth/OAuth2Token;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
