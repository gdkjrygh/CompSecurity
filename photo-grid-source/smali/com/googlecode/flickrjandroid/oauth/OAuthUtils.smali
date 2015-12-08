.class public Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final DEFAULT_CONTENT_CHARSET:Ljava/lang/String; = "ISO-8859-1"

.field public static final ENC:Ljava/lang/String; = "UTF-8"

.field private static final HMAC_SHA1:Ljava/lang/String; = "HmacSHA1"

.field private static final NAME_VALUE_SEPARATOR:Ljava/lang/String; = "="

.field private static final PARAMETER_SEPARATOR:Ljava/lang/String; = "&"

.field public static final REQUEST_METHOD_GET:Ljava/lang/String; = "GET"

.field public static final REQUEST_METHOD_POST:Ljava/lang/String; = "POST"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static addBasicOAuthParams(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/Parameter;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 93
    invoke-static {p0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthNonce(Ljava/util/List;)V

    .line 94
    invoke-static {p0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthTimestamp(Ljava/util/List;)V

    .line 95
    invoke-static {p0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthSignatureMethod(Ljava/util/List;)V

    .line 96
    invoke-static {p0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthVersion(Ljava/util/List;)V

    .line 97
    return-void
.end method

.method private static addOAuthNonce(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/Parameter;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 204
    new-instance v0, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v1, "oauth_nonce"

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 205
    return-void
.end method

.method public static addOAuthParams(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/Parameter;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 50
    invoke-static {p2}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addBasicOAuthParams(Ljava/util/List;)V

    .line 51
    invoke-static {p0, p1, p2}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->signPost(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 52
    return-void
.end method

.method private static addOAuthSignatureMethod(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/Parameter;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 208
    new-instance v0, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v1, "oauth_signature_method"

    const-string v2, "HMAC-SHA1"

    invoke-direct {v0, v1, v2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 209
    return-void
.end method

.method private static addOAuthTimestamp(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/Parameter;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 212
    new-instance v0, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v1, "oauth_timestamp"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 213
    return-void
.end method

.method public static addOAuthToken(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/Parameter;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 55
    invoke-static {}, Lcom/googlecode/flickrjandroid/RequestContext;->getRequestContext()Lcom/googlecode/flickrjandroid/RequestContext;

    move-result-object v0

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/RequestContext;->getOAuth()Lcom/googlecode/flickrjandroid/oauth/OAuth;

    move-result-object v0

    .line 56
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuth;->getToken()Lcom/googlecode/flickrjandroid/oauth/OAuthToken;

    move-result-object v1

    if-nez v1, :cond_1

    .line 57
    :cond_0
    new-instance v0, Lcom/googlecode/flickrjandroid/oauth/OAuthException;

    const-string v1, "OAuth token not set"

    invoke-direct {v0, v1}, Lcom/googlecode/flickrjandroid/oauth/OAuthException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 58
    :cond_1
    new-instance v1, Lcom/googlecode/flickrjandroid/oauth/OAuthTokenParameter;

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuth;->getToken()Lcom/googlecode/flickrjandroid/oauth/OAuthToken;

    move-result-object v0

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->getOauthToken()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthTokenParameter;-><init>(Ljava/lang/Object;)V

    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    return-void
.end method

.method private static addOAuthVersion(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/Parameter;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 216
    new-instance v0, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v1, "oauth_version"

    const-string v2, "1.0"

    invoke-direct {v0, v1, v2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 217
    return-void
.end method

.method public static decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 196
    .line 197
    if-eqz p1, :cond_0

    .line 196
    :goto_0
    :try_start_0
    invoke-static {p0, p1}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 197
    :cond_0
    const-string p1, "ISO-8859-1"
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 198
    :catch_0
    move-exception v0

    .line 199
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static format(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/Parameter;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 177
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 178
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 191
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 178
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/googlecode/flickrjandroid/Parameter;

    .line 179
    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/Parameter;->getValue()Ljava/lang/Object;

    move-result-object v3

    .line 180
    instance-of v4, v0, Lcom/googlecode/flickrjandroid/uploader/ImageParameter;

    if-nez v4, :cond_0

    .line 181
    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/Parameter;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/googlecode/flickrjandroid/util/UrlUtilities;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 182
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 183
    if-eqz v0, :cond_3

    invoke-static {v0}, Lcom/googlecode/flickrjandroid/util/UrlUtilities;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 184
    :goto_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-lez v3, :cond_2

    .line 185
    const-string v3, "&"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    :cond_2
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    const-string v3, "="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 183
    :cond_3
    const-string v0, ""

    goto :goto_1
.end method

.method public static getRequestBaseString(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/Parameter;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 125
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 126
    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 127
    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 128
    invoke-static {p1}, Lcom/googlecode/flickrjandroid/util/UrlUtilities;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 129
    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 131
    new-instance v1, Lcom/googlecode/flickrjandroid/oauth/a;

    invoke-direct {v1}, Lcom/googlecode/flickrjandroid/oauth/a;-><init>()V

    invoke-static {p2, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 151
    const-string v1, "UTF-8"

    invoke-static {p2, v1}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->format(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/googlecode/flickrjandroid/util/UrlUtilities;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getSignature(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/Parameter;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 104
    :try_start_0
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, p2}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->getRequestBaseString(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    .line 106
    invoke-static {v0, p3, p4}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->hmacsha1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_3

    move-result-object v0

    return-object v0

    .line 107
    :catch_0
    move-exception v0

    .line 108
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-direct {v1, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 109
    :catch_1
    move-exception v0

    .line 110
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-direct {v1, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 111
    :catch_2
    move-exception v0

    .line 112
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-direct {v1, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 113
    :catch_3
    move-exception v0

    .line 114
    new-instance v1, Lcom/googlecode/flickrjandroid/FlickrException;

    invoke-direct {v1, v0}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static getSignature(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/Parameter;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 121
    const-string v0, "GET"

    invoke-static {v0, p0, p1, p2, p3}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->getSignature(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static hasSigned()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 85
    invoke-static {}, Lcom/googlecode/flickrjandroid/RequestContext;->getRequestContext()Lcom/googlecode/flickrjandroid/RequestContext;

    move-result-object v1

    invoke-virtual {v1}, Lcom/googlecode/flickrjandroid/RequestContext;->getOAuth()Lcom/googlecode/flickrjandroid/oauth/OAuth;

    move-result-object v1

    .line 86
    if-nez v1, :cond_1

    .line 89
    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-virtual {v1}, Lcom/googlecode/flickrjandroid/oauth/OAuth;->getToken()Lcom/googlecode/flickrjandroid/oauth/OAuthToken;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static hmacsha1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 156
    const-string v0, "HmacSHA1"

    invoke-static {v0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object v0

    .line 157
    if-nez p2, :cond_0

    .line 158
    const-string p2, ""

    .line 160
    :cond_0
    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, "&"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    const-string v3, "HmacSHA1"

    invoke-direct {v1, v2, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 161
    invoke-virtual {v0, v1}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 162
    const-string v1, "UTF-8"

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/crypto/Mac;->doFinal([B)[B

    move-result-object v0

    .line 164
    new-instance v1, Ljava/lang/String;

    invoke-static {v0}, Lcom/googlecode/flickrjandroid/util/Base64;->encode([B)[B

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    return-object v1
.end method

.method public static sign(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/Parameter;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 70
    invoke-static {}, Lcom/googlecode/flickrjandroid/RequestContext;->getRequestContext()Lcom/googlecode/flickrjandroid/RequestContext;

    move-result-object v0

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/RequestContext;->getOAuth()Lcom/googlecode/flickrjandroid/oauth/OAuth;

    move-result-object v0

    .line 72
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuth;->getToken()Lcom/googlecode/flickrjandroid/oauth/OAuthToken;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 73
    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuth;->getToken()Lcom/googlecode/flickrjandroid/oauth/OAuthToken;

    move-result-object v0

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->getOauthTokenSecret()Ljava/lang/String;

    move-result-object v0

    .line 75
    :goto_0
    invoke-static {p0, p1, p3, p2, v0}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->getSignature(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 81
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "oauth_signature"

    invoke-direct {v1, v2, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    return-void

    .line 73
    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method public static signGet(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/Parameter;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 62
    const-string v0, "GET"

    invoke-static {v0, p1, p0, p2}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->sign(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 63
    return-void
.end method

.method public static signPost(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/Parameter;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 66
    const-string v0, "POST"

    invoke-static {v0, p1, p0, p2}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->sign(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 67
    return-void
.end method
