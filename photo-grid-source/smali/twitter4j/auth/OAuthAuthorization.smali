.class public Ltwitter4j/auth/OAuthAuthorization;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ltwitter4j/auth/Authorization;
.implements Ltwitter4j/auth/OAuthSupport;


# static fields
.field private static final HMAC_SHA1:Ljava/lang/String; = "HmacSHA1"

.field private static final OAUTH_SIGNATURE_METHOD:Ltwitter4j/internal/http/HttpParameter;

.field private static RAND:Ljava/util/Random; = null

.field private static transient http:Ltwitter4j/internal/http/HttpClientWrapper; = null

.field private static final logger:Ltwitter4j/internal/logging/Logger;

.field private static final serialVersionUID:J = -0x3c9fc4eaff57b01aL


# instance fields
.field private final conf:Ltwitter4j/conf/Configuration;

.field private consumerKey:Ljava/lang/String;

.field private consumerSecret:Ljava/lang/String;

.field private oauthToken:Ltwitter4j/auth/OAuthToken;

.field private realm:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 45
    new-instance v0, Ltwitter4j/internal/http/HttpParameter;

    const-string v1, "oauth_signature_method"

    const-string v2, "HMAC-SHA1"

    invoke-direct {v0, v1, v2}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ltwitter4j/auth/OAuthAuthorization;->OAUTH_SIGNATURE_METHOD:Ltwitter4j/internal/http/HttpParameter;

    .line 46
    const-class v0, Ltwitter4j/auth/OAuthAuthorization;

    invoke-static {v0}, Ltwitter4j/internal/logging/Logger;->getLogger(Ljava/lang/Class;)Ltwitter4j/internal/logging/Logger;

    move-result-object v0

    sput-object v0, Ltwitter4j/auth/OAuthAuthorization;->logger:Ltwitter4j/internal/logging/Logger;

    .line 271
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    sput-object v0, Ltwitter4j/auth/OAuthAuthorization;->RAND:Ljava/util/Random;

    return-void
.end method

.method public constructor <init>(Ltwitter4j/conf/Configuration;)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    const-string v0, ""

    iput-object v0, p0, Ltwitter4j/auth/OAuthAuthorization;->consumerKey:Ljava/lang/String;

    .line 51
    iput-object v1, p0, Ltwitter4j/auth/OAuthAuthorization;->realm:Ljava/lang/String;

    .line 53
    iput-object v1, p0, Ltwitter4j/auth/OAuthAuthorization;->oauthToken:Ltwitter4j/auth/OAuthToken;

    .line 61
    iput-object p1, p0, Ltwitter4j/auth/OAuthAuthorization;->conf:Ltwitter4j/conf/Configuration;

    .line 62
    new-instance v0, Ltwitter4j/internal/http/HttpClientWrapper;

    invoke-direct {v0, p1}, Ltwitter4j/internal/http/HttpClientWrapper;-><init>(Ltwitter4j/internal/http/HttpClientWrapperConfiguration;)V

    sput-object v0, Ltwitter4j/auth/OAuthAuthorization;->http:Ltwitter4j/internal/http/HttpClientWrapper;

    .line 63
    invoke-interface {p1}, Ltwitter4j/conf/Configuration;->getOAuthConsumerKey()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ltwitter4j/conf/Configuration;->getOAuthConsumerSecret()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ltwitter4j/auth/OAuthAuthorization;->setOAuthConsumer(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    invoke-interface {p1}, Ltwitter4j/conf/Configuration;->getOAuthAccessToken()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ltwitter4j/conf/Configuration;->getOAuthAccessTokenSecret()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 65
    new-instance v0, Ltwitter4j/auth/AccessToken;

    invoke-interface {p1}, Ltwitter4j/conf/Configuration;->getOAuthAccessToken()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Ltwitter4j/conf/Configuration;->getOAuthAccessTokenSecret()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ltwitter4j/auth/AccessToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ltwitter4j/auth/OAuthAuthorization;->setOAuthAccessToken(Ltwitter4j/auth/AccessToken;)V

    .line 67
    :cond_0
    return-void
.end method

.method static constructRequestURL(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .prologue
    const/16 v5, 0x8

    const/4 v3, -0x1

    const/4 v4, 0x0

    .line 445
    const-string v0, "?"

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    .line 446
    if-eq v3, v0, :cond_0

    .line 447
    invoke-virtual {p0, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    .line 449
    :cond_0
    const-string v0, "/"

    invoke-virtual {p0, v0, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v1

    .line 450
    invoke-virtual {p0, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 451
    const-string v2, ":"

    invoke-virtual {v0, v2, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v2

    .line 452
    if-eq v3, v2, :cond_1

    .line 454
    const-string v3, "http://"

    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v3, ":80"

    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 456
    invoke-virtual {v0, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 462
    :cond_1
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 464
    return-object v0

    .line 457
    :cond_2
    const-string v3, "https://"

    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, ":443"

    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 459
    invoke-virtual {v0, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static encodeParameters(Ljava/util/List;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ltwitter4j/internal/http/HttpParameter;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 402
    const-string v0, "&"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Ltwitter4j/auth/OAuthAuthorization;->encodeParameters(Ljava/util/List;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static encodeParameters(Ljava/util/List;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ltwitter4j/internal/http/HttpParameter;",
            ">;",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 406
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 407
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltwitter4j/internal/http/HttpParameter;

    .line 408
    invoke-virtual {v0}, Ltwitter4j/internal/http/HttpParameter;->isFile()Z

    move-result v3

    if-nez v3, :cond_0

    .line 409
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-eqz v3, :cond_2

    .line 410
    if-eqz p2, :cond_1

    .line 411
    const-string v3, "\""

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    :cond_1
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 415
    :cond_2
    invoke-virtual {v0}, Ltwitter4j/internal/http/HttpParameter;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ltwitter4j/internal/http/HttpParameter;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    if-eqz p2, :cond_3

    .line 417
    const-string v3, "\""

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 419
    :cond_3
    invoke-virtual {v0}, Ltwitter4j/internal/http/HttpParameter;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ltwitter4j/internal/http/HttpParameter;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 422
    :cond_4
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-eqz v0, :cond_5

    .line 423
    if-eqz p2, :cond_5

    .line 424
    const-string v0, "\""

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 427
    :cond_5
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private ensureTokenIsAvailable()V
    .locals 2

    .prologue
    .line 76
    iget-object v0, p0, Ltwitter4j/auth/OAuthAuthorization;->oauthToken:Ltwitter4j/auth/OAuthToken;

    if-nez v0, :cond_0

    .line 77
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No Token available."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 79
    :cond_0
    return-void
.end method

.method static normalizeAuthorizationHeaders(Ljava/util/List;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ltwitter4j/internal/http/HttpParameter;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 385
    invoke-static {p0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 386
    invoke-static {p0}, Ltwitter4j/auth/OAuthAuthorization;->encodeParameters(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static normalizeRequestParameters(Ljava/util/List;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ltwitter4j/internal/http/HttpParameter;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 380
    invoke-static {p0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 381
    invoke-static {p0}, Ltwitter4j/auth/OAuthAuthorization;->encodeParameters(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static normalizeRequestParameters([Ltwitter4j/internal/http/HttpParameter;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 376
    invoke-static {p0}, Ltwitter4j/auth/OAuthAuthorization;->toParamList([Ltwitter4j/internal/http/HttpParameter;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ltwitter4j/auth/OAuthAuthorization;->normalizeRequestParameters(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private parseGetParameters(Ljava/lang/String;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ltwitter4j/internal/http/HttpParameter;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 247
    const-string v1, "?"

    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    .line 248
    const/4 v2, -0x1

    if-eq v2, v1, :cond_1

    .line 249
    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "&"

    invoke-static {v1, v2}, Ltwitter4j/internal/util/z_T4JInternalStringUtil;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 251
    :try_start_0
    array-length v2, v1

    :goto_0
    if-ge v0, v2, :cond_1

    aget-object v3, v1, v0

    .line 252
    const-string v4, "="

    invoke-static {v3, v4}, Ltwitter4j/internal/util/z_T4JInternalStringUtil;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 253
    array-length v4, v3

    const/4 v5, 0x2

    if-ne v4, v5, :cond_0

    .line 254
    new-instance v4, Ltwitter4j/internal/http/HttpParameter;

    const/4 v5, 0x0

    aget-object v5, v3, v5

    const-string v6, "UTF-8"

    invoke-static {v5, v6}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    aget-object v3, v3, v6

    const-string v6, "UTF-8"

    invoke-static {v3, v6}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v5, v3}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 251
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 259
    :cond_0
    new-instance v4, Ltwitter4j/internal/http/HttpParameter;

    const/4 v5, 0x0

    aget-object v3, v3, v5

    const-string v5, "UTF-8"

    invoke-static {v3, v5}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v5, ""

    invoke-direct {v4, v3, v5}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 269
    :cond_1
    return-void
.end method

.method static toParamList([Ltwitter4j/internal/http/HttpParameter;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ltwitter4j/internal/http/HttpParameter;",
            ")",
            "Ljava/util/List",
            "<",
            "Ltwitter4j/internal/http/HttpParameter;",
            ">;"
        }
    .end annotation

    .prologue
    .line 390
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 391
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 392
    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 476
    if-ne p0, p1, :cond_1

    .line 488
    :cond_0
    :goto_0
    return v0

    .line 477
    :cond_1
    instance-of v2, p1, Ltwitter4j/auth/OAuthSupport;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    .line 479
    :cond_2
    check-cast p1, Ltwitter4j/auth/OAuthAuthorization;

    .line 481
    iget-object v2, p0, Ltwitter4j/auth/OAuthAuthorization;->consumerKey:Ljava/lang/String;

    if-eqz v2, :cond_4

    iget-object v2, p0, Ltwitter4j/auth/OAuthAuthorization;->consumerKey:Ljava/lang/String;

    iget-object v3, p1, Ltwitter4j/auth/OAuthAuthorization;->consumerKey:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :cond_3
    move v0, v1

    .line 482
    goto :goto_0

    .line 481
    :cond_4
    iget-object v2, p1, Ltwitter4j/auth/OAuthAuthorization;->consumerKey:Ljava/lang/String;

    if-nez v2, :cond_3

    .line 483
    :cond_5
    iget-object v2, p0, Ltwitter4j/auth/OAuthAuthorization;->consumerSecret:Ljava/lang/String;

    if-eqz v2, :cond_7

    iget-object v2, p0, Ltwitter4j/auth/OAuthAuthorization;->consumerSecret:Ljava/lang/String;

    iget-object v3, p1, Ltwitter4j/auth/OAuthAuthorization;->consumerSecret:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    :cond_6
    move v0, v1

    .line 484
    goto :goto_0

    .line 483
    :cond_7
    iget-object v2, p1, Ltwitter4j/auth/OAuthAuthorization;->consumerSecret:Ljava/lang/String;

    if-nez v2, :cond_6

    .line 485
    :cond_8
    iget-object v2, p0, Ltwitter4j/auth/OAuthAuthorization;->oauthToken:Ltwitter4j/auth/OAuthToken;

    if-eqz v2, :cond_9

    iget-object v2, p0, Ltwitter4j/auth/OAuthAuthorization;->oauthToken:Ltwitter4j/auth/OAuthToken;

    iget-object v3, p1, Ltwitter4j/auth/OAuthAuthorization;->oauthToken:Ltwitter4j/auth/OAuthToken;

    invoke-virtual {v2, v3}, Ltwitter4j/auth/OAuthToken;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :goto_1
    move v0, v1

    .line 486
    goto :goto_0

    .line 485
    :cond_9
    iget-object v2, p1, Ltwitter4j/auth/OAuthAuthorization;->oauthToken:Ltwitter4j/auth/OAuthToken;

    if-eqz v2, :cond_0

    goto :goto_1
.end method

.method generateAuthorizationHeader(Ljava/lang/String;Ljava/lang/String;[Ltwitter4j/internal/http/HttpParameter;Ljava/lang/String;Ljava/lang/String;Ltwitter4j/auth/OAuthToken;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 211
    if-nez p3, :cond_0

    .line 212
    const/4 v0, 0x0

    new-array p3, v0, [Ltwitter4j/internal/http/HttpParameter;

    .line 214
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 215
    new-instance v1, Ltwitter4j/internal/http/HttpParameter;

    const-string v2, "oauth_consumer_key"

    iget-object v3, p0, Ltwitter4j/auth/OAuthAuthorization;->consumerKey:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 216
    sget-object v1, Ltwitter4j/auth/OAuthAuthorization;->OAUTH_SIGNATURE_METHOD:Ltwitter4j/internal/http/HttpParameter;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 217
    new-instance v1, Ltwitter4j/internal/http/HttpParameter;

    const-string v2, "oauth_timestamp"

    invoke-direct {v1, v2, p5}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 218
    new-instance v1, Ltwitter4j/internal/http/HttpParameter;

    const-string v2, "oauth_nonce"

    invoke-direct {v1, v2, p4}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 219
    new-instance v1, Ltwitter4j/internal/http/HttpParameter;

    const-string v2, "oauth_version"

    const-string v3, "1.0"

    invoke-direct {v1, v2, v3}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 220
    if-eqz p6, :cond_1

    .line 221
    new-instance v1, Ltwitter4j/internal/http/HttpParameter;

    const-string v2, "oauth_token"

    invoke-virtual {p6}, Ltwitter4j/auth/OAuthToken;->getToken()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 223
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    array-length v3, p3

    add-int/2addr v2, v3

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 224
    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 225
    invoke-static {p3}, Ltwitter4j/internal/http/HttpParameter;->containsFile([Ltwitter4j/internal/http/HttpParameter;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 226
    invoke-static {p3}, Ltwitter4j/auth/OAuthAuthorization;->toParamList([Ltwitter4j/internal/http/HttpParameter;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 228
    :cond_2
    invoke-direct {p0, p2, v1}, Ltwitter4j/auth/OAuthAuthorization;->parseGetParameters(Ljava/lang/String;Ljava/util/List;)V

    .line 229
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, "&"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p2}, Ltwitter4j/auth/OAuthAuthorization;->constructRequestURL(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ltwitter4j/internal/http/HttpParameter;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "&"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 231
    invoke-static {v1}, Ltwitter4j/auth/OAuthAuthorization;->normalizeRequestParameters(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ltwitter4j/internal/http/HttpParameter;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 233
    sget-object v2, Ltwitter4j/auth/OAuthAuthorization;->logger:Ltwitter4j/internal/logging/Logger;

    const-string v3, "OAuth base string: "

    invoke-virtual {v2, v3, v1}, Ltwitter4j/internal/logging/Logger;->debug(Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    invoke-virtual {p0, v1, p6}, Ltwitter4j/auth/OAuthAuthorization;->generateSignature(Ljava/lang/String;Ltwitter4j/auth/OAuthToken;)Ljava/lang/String;

    move-result-object v1

    .line 235
    sget-object v2, Ltwitter4j/auth/OAuthAuthorization;->logger:Ltwitter4j/internal/logging/Logger;

    const-string v3, "OAuth signature: "

    invoke-virtual {v2, v3, v1}, Ltwitter4j/internal/logging/Logger;->debug(Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    new-instance v2, Ltwitter4j/internal/http/HttpParameter;

    const-string v3, "oauth_signature"

    invoke-direct {v2, v3, v1}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 240
    iget-object v1, p0, Ltwitter4j/auth/OAuthAuthorization;->realm:Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 241
    new-instance v1, Ltwitter4j/internal/http/HttpParameter;

    const-string v2, "realm"

    iget-object v3, p0, Ltwitter4j/auth/OAuthAuthorization;->realm:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 243
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "OAuth "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, ","

    const/4 v3, 0x1

    invoke-static {v0, v2, v3}, Ltwitter4j/auth/OAuthAuthorization;->encodeParameters(Ljava/util/List;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method generateAuthorizationHeader(Ljava/lang/String;Ljava/lang/String;[Ltwitter4j/internal/http/HttpParameter;Ltwitter4j/auth/OAuthToken;)Ljava/lang/String;
    .locals 7

    .prologue
    .line 278
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    .line 279
    sget-object v2, Ltwitter4j/auth/OAuthAuthorization;->RAND:Ljava/util/Random;

    invoke-virtual {v2}, Ljava/util/Random;->nextInt()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v2, v0

    .line 280
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v6, p4

    invoke-virtual/range {v0 .. v6}, Ltwitter4j/auth/OAuthAuthorization;->generateAuthorizationHeader(Ljava/lang/String;Ljava/lang/String;[Ltwitter4j/internal/http/HttpParameter;Ljava/lang/String;Ljava/lang/String;Ltwitter4j/auth/OAuthToken;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public generateOAuthSignatureHttpParams(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Ltwitter4j/internal/http/HttpParameter;",
            ">;"
        }
    .end annotation

    .prologue
    .line 284
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    .line 285
    sget-object v2, Ltwitter4j/auth/OAuthAuthorization;->RAND:Ljava/util/Random;

    invoke-virtual {v2}, Ljava/util/Random;->nextInt()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v2, v0

    .line 287
    new-instance v4, Ljava/util/ArrayList;

    const/4 v5, 0x5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 288
    new-instance v5, Ltwitter4j/internal/http/HttpParameter;

    const-string v6, "oauth_consumer_key"

    iget-object v7, p0, Ltwitter4j/auth/OAuthAuthorization;->consumerKey:Ljava/lang/String;

    invoke-direct {v5, v6, v7}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 289
    sget-object v5, Ltwitter4j/auth/OAuthAuthorization;->OAUTH_SIGNATURE_METHOD:Ltwitter4j/internal/http/HttpParameter;

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 290
    new-instance v5, Ltwitter4j/internal/http/HttpParameter;

    const-string v6, "oauth_timestamp"

    invoke-direct {v5, v6, v0, v1}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;J)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 291
    new-instance v0, Ltwitter4j/internal/http/HttpParameter;

    const-string v1, "oauth_nonce"

    invoke-direct {v0, v1, v2, v3}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;J)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 292
    new-instance v0, Ltwitter4j/internal/http/HttpParameter;

    const-string v1, "oauth_version"

    const-string v2, "1.0"

    invoke-direct {v0, v1, v2}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 293
    iget-object v0, p0, Ltwitter4j/auth/OAuthAuthorization;->oauthToken:Ltwitter4j/auth/OAuthToken;

    if-eqz v0, :cond_0

    .line 294
    new-instance v0, Ltwitter4j/internal/http/HttpParameter;

    const-string v1, "oauth_token"

    iget-object v2, p0, Ltwitter4j/auth/OAuthAuthorization;->oauthToken:Ltwitter4j/auth/OAuthToken;

    invoke-virtual {v2}, Ltwitter4j/auth/OAuthToken;->getToken()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 297
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 298
    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 299
    invoke-direct {p0, p2, v0}, Ltwitter4j/auth/OAuthAuthorization;->parseGetParameters(Ljava/lang/String;Ljava/util/List;)V

    .line 301
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "&"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p2}, Ltwitter4j/auth/OAuthAuthorization;->constructRequestURL(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ltwitter4j/internal/http/HttpParameter;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "&"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 303
    invoke-static {v0}, Ltwitter4j/auth/OAuthAuthorization;->normalizeRequestParameters(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ltwitter4j/internal/http/HttpParameter;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 306
    iget-object v1, p0, Ltwitter4j/auth/OAuthAuthorization;->oauthToken:Ltwitter4j/auth/OAuthToken;

    invoke-virtual {p0, v0, v1}, Ltwitter4j/auth/OAuthAuthorization;->generateSignature(Ljava/lang/String;Ltwitter4j/auth/OAuthToken;)Ljava/lang/String;

    move-result-object v0

    .line 308
    new-instance v1, Ltwitter4j/internal/http/HttpParameter;

    const-string v2, "oauth_signature"

    invoke-direct {v1, v2, v0}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 310
    return-object v4
.end method

.method generateSignature(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 352
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Ltwitter4j/auth/OAuthAuthorization;->generateSignature(Ljava/lang/String;Ltwitter4j/auth/OAuthToken;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method generateSignature(Ljava/lang/String;Ltwitter4j/auth/OAuthToken;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 324
    :try_start_0
    const-string v0, "HmacSHA1"

    invoke-static {v0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object v1

    .line 326
    if-nez p2, :cond_1

    .line 327
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ltwitter4j/auth/OAuthAuthorization;->consumerSecret:Ljava/lang/String;

    invoke-static {v2}, Ltwitter4j/internal/http/HttpParameter;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "&"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 328
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    const-string v3, "HmacSHA1"

    invoke-direct {v0, v2, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 337
    :cond_0
    :goto_0
    invoke-virtual {v1, v0}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 338
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljavax/crypto/Mac;->doFinal([B)[B
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 346
    invoke-static {v0}, Ltwitter4j/internal/http/BASE64Encoder;->encode([B)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 330
    :cond_1
    :try_start_1
    invoke-virtual {p2}, Ltwitter4j/auth/OAuthToken;->getSecretKeySpec()Ljavax/crypto/spec/SecretKeySpec;

    move-result-object v0

    .line 331
    if-nez v0, :cond_0

    .line 332
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ltwitter4j/auth/OAuthAuthorization;->consumerSecret:Ljava/lang/String;

    invoke-static {v2}, Ltwitter4j/internal/http/HttpParameter;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "&"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Ltwitter4j/auth/OAuthToken;->getTokenSecret()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ltwitter4j/internal/http/HttpParameter;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 333
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    const-string v3, "HmacSHA1"

    invoke-direct {v0, v2, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 334
    invoke-virtual {p2, v0}, Ltwitter4j/auth/OAuthToken;->setSecretKeySpec(Ljavax/crypto/spec/SecretKeySpec;)V
    :try_end_1
    .catch Ljava/security/InvalidKeyException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 339
    :catch_0
    move-exception v0

    .line 340
    sget-object v1, Ltwitter4j/auth/OAuthAuthorization;->logger:Ltwitter4j/internal/logging/Logger;

    const-string v2, "Failed initialize \"Message Authentication Code\" (MAC)"

    invoke-virtual {v1, v2, v0}, Ltwitter4j/internal/logging/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 341
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    .line 342
    :catch_1
    move-exception v0

    .line 343
    sget-object v1, Ltwitter4j/auth/OAuthAuthorization;->logger:Ltwitter4j/internal/logging/Logger;

    const-string v2, "Failed to get HmacSHA1 \"Message Authentication Code\" (MAC)"

    invoke-virtual {v1, v2, v0}, Ltwitter4j/internal/logging/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 344
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method

.method public getAuthorizationHeader(Ltwitter4j/internal/http/HttpRequest;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 72
    invoke-virtual {p1}, Ltwitter4j/internal/http/HttpRequest;->getMethod()Ltwitter4j/internal/http/RequestMethod;

    move-result-object v0

    invoke-virtual {v0}, Ltwitter4j/internal/http/RequestMethod;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ltwitter4j/internal/http/HttpRequest;->getURL()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ltwitter4j/internal/http/HttpRequest;->getParameters()[Ltwitter4j/internal/http/HttpParameter;

    move-result-object v2

    iget-object v3, p0, Ltwitter4j/auth/OAuthAuthorization;->oauthToken:Ltwitter4j/auth/OAuthToken;

    invoke-virtual {p0, v0, v1, v2, v3}, Ltwitter4j/auth/OAuthAuthorization;->generateAuthorizationHeader(Ljava/lang/String;Ljava/lang/String;[Ltwitter4j/internal/http/HttpParameter;Ltwitter4j/auth/OAuthToken;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getOAuthAccessToken()Ltwitter4j/auth/AccessToken;
    .locals 3

    .prologue
    .line 131
    invoke-direct {p0}, Ltwitter4j/auth/OAuthAuthorization;->ensureTokenIsAvailable()V

    .line 132
    iget-object v0, p0, Ltwitter4j/auth/OAuthAuthorization;->oauthToken:Ltwitter4j/auth/OAuthToken;

    instance-of v0, v0, Ltwitter4j/auth/AccessToken;

    if-eqz v0, :cond_0

    .line 133
    iget-object v0, p0, Ltwitter4j/auth/OAuthAuthorization;->oauthToken:Ltwitter4j/auth/OAuthToken;

    check-cast v0, Ltwitter4j/auth/AccessToken;

    .line 136
    :goto_0
    return-object v0

    .line 135
    :cond_0
    new-instance v0, Ltwitter4j/auth/AccessToken;

    sget-object v1, Ltwitter4j/auth/OAuthAuthorization;->http:Ltwitter4j/internal/http/HttpClientWrapper;

    iget-object v2, p0, Ltwitter4j/auth/OAuthAuthorization;->conf:Ltwitter4j/conf/Configuration;

    invoke-interface {v2}, Ltwitter4j/conf/Configuration;->getOAuthAccessTokenURL()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, p0}, Ltwitter4j/internal/http/HttpClientWrapper;->post(Ljava/lang/String;Ltwitter4j/auth/Authorization;)Ltwitter4j/internal/http/HttpResponse;

    move-result-object v1

    invoke-direct {v0, v1}, Ltwitter4j/auth/AccessToken;-><init>(Ltwitter4j/internal/http/HttpResponse;)V

    iput-object v0, p0, Ltwitter4j/auth/OAuthAuthorization;->oauthToken:Ltwitter4j/auth/OAuthToken;

    .line 136
    iget-object v0, p0, Ltwitter4j/auth/OAuthAuthorization;->oauthToken:Ltwitter4j/auth/OAuthToken;

    check-cast v0, Ltwitter4j/auth/AccessToken;

    goto :goto_0
.end method

.method public getOAuthAccessToken(Ljava/lang/String;)Ltwitter4j/auth/AccessToken;
    .locals 7

    .prologue
    .line 144
    invoke-direct {p0}, Ltwitter4j/auth/OAuthAuthorization;->ensureTokenIsAvailable()V

    .line 145
    new-instance v0, Ltwitter4j/auth/AccessToken;

    sget-object v1, Ltwitter4j/auth/OAuthAuthorization;->http:Ltwitter4j/internal/http/HttpClientWrapper;

    iget-object v2, p0, Ltwitter4j/auth/OAuthAuthorization;->conf:Ltwitter4j/conf/Configuration;

    invoke-interface {v2}, Ltwitter4j/conf/Configuration;->getOAuthAccessTokenURL()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ltwitter4j/internal/http/HttpParameter;

    const/4 v4, 0x0

    new-instance v5, Ltwitter4j/internal/http/HttpParameter;

    const-string v6, "oauth_verifier"

    invoke-direct {v5, v6, p1}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3, p0}, Ltwitter4j/internal/http/HttpClientWrapper;->post(Ljava/lang/String;[Ltwitter4j/internal/http/HttpParameter;Ltwitter4j/auth/Authorization;)Ltwitter4j/internal/http/HttpResponse;

    move-result-object v1

    invoke-direct {v0, v1}, Ltwitter4j/auth/AccessToken;-><init>(Ltwitter4j/internal/http/HttpResponse;)V

    iput-object v0, p0, Ltwitter4j/auth/OAuthAuthorization;->oauthToken:Ltwitter4j/auth/OAuthToken;

    .line 147
    iget-object v0, p0, Ltwitter4j/auth/OAuthAuthorization;->oauthToken:Ltwitter4j/auth/OAuthToken;

    check-cast v0, Ltwitter4j/auth/AccessToken;

    return-object v0
.end method

.method public getOAuthAccessToken(Ljava/lang/String;Ljava/lang/String;)Ltwitter4j/auth/AccessToken;
    .locals 8

    .prologue
    .line 174
    :try_start_0
    iget-object v0, p0, Ltwitter4j/auth/OAuthAuthorization;->conf:Ltwitter4j/conf/Configuration;

    invoke-interface {v0}, Ltwitter4j/conf/Configuration;->getOAuthAccessTokenURL()Ljava/lang/String;

    move-result-object v0

    .line 175
    const-string v1, "http://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_0

    .line 178
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "https://"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x7

    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 180
    :cond_0
    new-instance v1, Ltwitter4j/auth/AccessToken;

    sget-object v2, Ltwitter4j/auth/OAuthAuthorization;->http:Ltwitter4j/internal/http/HttpClientWrapper;

    const/4 v3, 0x3

    new-array v3, v3, [Ltwitter4j/internal/http/HttpParameter;

    const/4 v4, 0x0

    new-instance v5, Ltwitter4j/internal/http/HttpParameter;

    const-string v6, "x_auth_username"

    invoke-direct {v5, v6, p1}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v5, v3, v4

    const/4 v4, 0x1

    new-instance v5, Ltwitter4j/internal/http/HttpParameter;

    const-string v6, "x_auth_password"

    invoke-direct {v5, v6, p2}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v5, v3, v4

    const/4 v4, 0x2

    new-instance v5, Ltwitter4j/internal/http/HttpParameter;

    const-string v6, "x_auth_mode"

    const-string v7, "client_auth"

    invoke-direct {v5, v6, v7}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v5, v3, v4

    invoke-virtual {v2, v0, v3, p0}, Ltwitter4j/internal/http/HttpClientWrapper;->post(Ljava/lang/String;[Ltwitter4j/internal/http/HttpParameter;Ltwitter4j/auth/Authorization;)Ltwitter4j/internal/http/HttpResponse;

    move-result-object v0

    invoke-direct {v1, v0}, Ltwitter4j/auth/AccessToken;-><init>(Ltwitter4j/internal/http/HttpResponse;)V

    iput-object v1, p0, Ltwitter4j/auth/OAuthAuthorization;->oauthToken:Ltwitter4j/auth/OAuthToken;

    .line 185
    iget-object v0, p0, Ltwitter4j/auth/OAuthAuthorization;->oauthToken:Ltwitter4j/auth/OAuthToken;

    check-cast v0, Ltwitter4j/auth/AccessToken;
    :try_end_0
    .catch Ltwitter4j/TwitterException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 186
    :catch_0
    move-exception v0

    .line 187
    new-instance v1, Ltwitter4j/TwitterException;

    const-string v2, "The screen name / password combination seems to be invalid."

    invoke-virtual {v0}, Ltwitter4j/TwitterException;->getStatusCode()I

    move-result v3

    invoke-direct {v1, v2, v0, v3}, Ltwitter4j/TwitterException;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    throw v1
.end method

.method public getOAuthAccessToken(Ltwitter4j/auth/RequestToken;)Ltwitter4j/auth/AccessToken;
    .locals 1

    .prologue
    .line 155
    iput-object p1, p0, Ltwitter4j/auth/OAuthAuthorization;->oauthToken:Ltwitter4j/auth/OAuthToken;

    .line 156
    invoke-virtual {p0}, Ltwitter4j/auth/OAuthAuthorization;->getOAuthAccessToken()Ltwitter4j/auth/AccessToken;

    move-result-object v0

    return-object v0
.end method

.method public getOAuthAccessToken(Ltwitter4j/auth/RequestToken;Ljava/lang/String;)Ltwitter4j/auth/AccessToken;
    .locals 1

    .prologue
    .line 164
    iput-object p1, p0, Ltwitter4j/auth/OAuthAuthorization;->oauthToken:Ltwitter4j/auth/OAuthToken;

    .line 165
    invoke-virtual {p0, p2}, Ltwitter4j/auth/OAuthAuthorization;->getOAuthAccessToken(Ljava/lang/String;)Ltwitter4j/auth/AccessToken;

    move-result-object v0

    return-object v0
.end method

.method public getOAuthRequestToken()Ltwitter4j/auth/RequestToken;
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 96
    invoke-virtual {p0, v0, v0}, Ltwitter4j/auth/OAuthAuthorization;->getOAuthRequestToken(Ljava/lang/String;Ljava/lang/String;)Ltwitter4j/auth/RequestToken;

    move-result-object v0

    return-object v0
.end method

.method public getOAuthRequestToken(Ljava/lang/String;)Ltwitter4j/auth/RequestToken;
    .locals 1

    .prologue
    .line 104
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Ltwitter4j/auth/OAuthAuthorization;->getOAuthRequestToken(Ljava/lang/String;Ljava/lang/String;)Ltwitter4j/auth/RequestToken;

    move-result-object v0

    return-object v0
.end method

.method public getOAuthRequestToken(Ljava/lang/String;Ljava/lang/String;)Ltwitter4j/auth/RequestToken;
    .locals 5

    .prologue
    .line 112
    iget-object v0, p0, Ltwitter4j/auth/OAuthAuthorization;->oauthToken:Ltwitter4j/auth/OAuthToken;

    instance-of v0, v0, Ltwitter4j/auth/AccessToken;

    if-eqz v0, :cond_0

    .line 113
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Access token already available."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 115
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 116
    if-eqz p1, :cond_1

    .line 117
    new-instance v1, Ltwitter4j/internal/http/HttpParameter;

    const-string v2, "oauth_callback"

    invoke-direct {v1, v2, p1}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 119
    :cond_1
    if-eqz p2, :cond_2

    .line 120
    new-instance v1, Ltwitter4j/internal/http/HttpParameter;

    const-string v2, "x_auth_access_type"

    invoke-direct {v1, v2, p2}, Ltwitter4j/internal/http/HttpParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 122
    :cond_2
    new-instance v1, Ltwitter4j/auth/RequestToken;

    sget-object v2, Ltwitter4j/auth/OAuthAuthorization;->http:Ltwitter4j/internal/http/HttpClientWrapper;

    iget-object v3, p0, Ltwitter4j/auth/OAuthAuthorization;->conf:Ltwitter4j/conf/Configuration;

    invoke-interface {v3}, Ltwitter4j/conf/Configuration;->getOAuthRequestTokenURL()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    new-array v4, v4, [Ltwitter4j/internal/http/HttpParameter;

    invoke-interface {v0, v4}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ltwitter4j/internal/http/HttpParameter;

    invoke-virtual {v2, v3, v0, p0}, Ltwitter4j/internal/http/HttpClientWrapper;->post(Ljava/lang/String;[Ltwitter4j/internal/http/HttpParameter;Ltwitter4j/auth/Authorization;)Ltwitter4j/internal/http/HttpResponse;

    move-result-object v0

    invoke-direct {v1, v0, p0}, Ltwitter4j/auth/RequestToken;-><init>(Ltwitter4j/internal/http/HttpResponse;Ltwitter4j/auth/OAuthSupport;)V

    iput-object v1, p0, Ltwitter4j/auth/OAuthAuthorization;->oauthToken:Ltwitter4j/auth/OAuthToken;

    .line 123
    iget-object v0, p0, Ltwitter4j/auth/OAuthAuthorization;->oauthToken:Ltwitter4j/auth/OAuthToken;

    check-cast v0, Ltwitter4j/auth/RequestToken;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 493
    iget-object v0, p0, Ltwitter4j/auth/OAuthAuthorization;->consumerKey:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ltwitter4j/auth/OAuthAuthorization;->consumerKey:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    .line 494
    :goto_0
    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Ltwitter4j/auth/OAuthAuthorization;->consumerSecret:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Ltwitter4j/auth/OAuthAuthorization;->consumerSecret:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v0, v2

    .line 495
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Ltwitter4j/auth/OAuthAuthorization;->oauthToken:Ltwitter4j/auth/OAuthToken;

    if-eqz v2, :cond_0

    iget-object v1, p0, Ltwitter4j/auth/OAuthAuthorization;->oauthToken:Ltwitter4j/auth/OAuthToken;

    invoke-virtual {v1}, Ltwitter4j/auth/OAuthToken;->hashCode()I

    move-result v1

    :cond_0
    add-int/2addr v0, v1

    .line 496
    return v0

    :cond_1
    move v0, v1

    .line 493
    goto :goto_0

    :cond_2
    move v0, v1

    .line 494
    goto :goto_1
.end method

.method public isEnabled()Z
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Ltwitter4j/auth/OAuthAuthorization;->oauthToken:Ltwitter4j/auth/OAuthToken;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ltwitter4j/auth/OAuthAuthorization;->oauthToken:Ltwitter4j/auth/OAuthToken;

    instance-of v0, v0, Ltwitter4j/auth/AccessToken;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setOAuthAccessToken(Ltwitter4j/auth/AccessToken;)V
    .locals 0

    .prologue
    .line 196
    iput-object p1, p0, Ltwitter4j/auth/OAuthAuthorization;->oauthToken:Ltwitter4j/auth/OAuthToken;

    .line 197
    return-void
.end method

.method public setOAuthConsumer(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 469
    if-eqz p1, :cond_0

    :goto_0
    iput-object p1, p0, Ltwitter4j/auth/OAuthAuthorization;->consumerKey:Ljava/lang/String;

    .line 470
    if-eqz p2, :cond_1

    :goto_1
    iput-object p2, p0, Ltwitter4j/auth/OAuthAuthorization;->consumerSecret:Ljava/lang/String;

    .line 471
    return-void

    .line 469
    :cond_0
    const-string p1, ""

    goto :goto_0

    .line 470
    :cond_1
    const-string p2, ""

    goto :goto_1
.end method

.method public setOAuthRealm(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 206
    iput-object p1, p0, Ltwitter4j/auth/OAuthAuthorization;->realm:Ljava/lang/String;

    .line 207
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 501
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "OAuthAuthorization{consumerKey=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ltwitter4j/auth/OAuthAuthorization;->consumerKey:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", consumerSecret=\'******************************************\', oauthToken="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltwitter4j/auth/OAuthAuthorization;->oauthToken:Ltwitter4j/auth/OAuthToken;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
