.class public final Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;
.super Ljavax/net/ssl/HttpsURLConnection;
.source "HttpsURLConnectionImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;
    }
.end annotation


# instance fields
.field private final delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;


# direct methods
.method public constructor <init>(Ljava/net/URL;Lcom/squareup/okhttp/OkHttpClient;)V
    .locals 2
    .param p1, "url"    # Ljava/net/URL;
    .param p2, "client"    # Lcom/squareup/okhttp/OkHttpClient;

    .prologue
    .line 45
    invoke-direct {p0, p1}, Ljavax/net/ssl/HttpsURLConnection;-><init>(Ljava/net/URL;)V

    .line 46
    new-instance v0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;-><init>(Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;Ljava/net/URL;Lcom/squareup/okhttp/OkHttpClient;Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$1;)V

    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    .line 47
    return-void
.end method

.method private getSslSocket()Ljavax/net/ssl/SSLSocket;
    .locals 2

    .prologue
    .line 116
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    iget-object v0, v0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    iget-object v0, v0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-boolean v0, v0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connected:Z

    if-nez v0, :cond_1

    .line 117
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Connection has not yet been established"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 119
    :cond_1
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    iget-object v0, v0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    instance-of v0, v0, Lcom/squareup/okhttp/internal/http/HttpsEngine;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    iget-object v0, v0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    check-cast v0, Lcom/squareup/okhttp/internal/http/HttpsEngine;

    .line 120
    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsEngine;->getSslSocket()Ljavax/net/ssl/SSLSocket;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "field"    # Ljava/lang/String;
    .param p2, "newValue"    # Ljava/lang/String;

    .prologue
    .line 223
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    return-void
.end method

.method public connect()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 161
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->connected:Z

    .line 162
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->connect()V

    .line 163
    return-void
.end method

.method public disconnect()V
    .locals 1

    .prologue
    .line 125
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->disconnect()V

    .line 126
    return-void
.end method

.method public getAllowUserInteraction()Z
    .locals 1

    .prologue
    .line 166
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getAllowUserInteraction()Z

    move-result v0

    return v0
.end method

.method public getCipherSuite()Ljava/lang/String;
    .locals 3

    .prologue
    .line 50
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v2}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getSecureCacheResponse()Ljava/net/SecureCacheResponse;

    move-result-object v0

    .line 51
    .local v0, "cacheResponse":Ljava/net/SecureCacheResponse;
    if-eqz v0, :cond_0

    .line 52
    invoke-virtual {v0}, Ljava/net/SecureCacheResponse;->getCipherSuite()Ljava/lang/String;

    move-result-object v2

    .line 58
    :goto_0
    return-object v2

    .line 54
    :cond_0
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->getSslSocket()Ljavax/net/ssl/SSLSocket;

    move-result-object v1

    .line 55
    .local v1, "sslSocket":Ljavax/net/ssl/SSLSocket;
    if-eqz v1, :cond_1

    .line 56
    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v2

    invoke-interface {v2}, Ljavax/net/ssl/SSLSession;->getCipherSuite()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 58
    :cond_1
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public getConnectTimeout()I
    .locals 1

    .prologue
    .line 307
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getConnectTimeout()I

    move-result v0

    return v0
.end method

.method public getContent()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 170
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getContent()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getContent([Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .param p1, "types"    # [Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 175
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getContent([Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getContentEncoding()Ljava/lang/String;
    .locals 1

    .prologue
    .line 179
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getContentEncoding()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getContentLength()I
    .locals 1

    .prologue
    .line 183
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getContentLength()I

    move-result v0

    return v0
.end method

.method public getContentType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 187
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getContentType()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDate()J
    .locals 2

    .prologue
    .line 191
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getDate()J

    move-result-wide v0

    return-wide v0
.end method

.method public getDefaultUseCaches()Z
    .locals 1

    .prologue
    .line 195
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getDefaultUseCaches()Z

    move-result v0

    return v0
.end method

.method public getDoInput()Z
    .locals 1

    .prologue
    .line 199
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getDoInput()Z

    move-result v0

    return v0
.end method

.method public getDoOutput()Z
    .locals 1

    .prologue
    .line 203
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getDoOutput()Z

    move-result v0

    return v0
.end method

.method public getErrorStream()Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 129
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getErrorStream()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public getExpiration()J
    .locals 2

    .prologue
    .line 207
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getExpiration()J

    move-result-wide v0

    return-wide v0
.end method

.method public getHeaderField(I)Ljava/lang/String;
    .locals 1
    .param p1, "pos"    # I

    .prologue
    .line 211
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getHeaderField(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHeaderField(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "key"    # Ljava/lang/String;

    .prologue
    .line 227
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHeaderFieldDate(Ljava/lang/String;J)J
    .locals 2
    .param p1, "field"    # Ljava/lang/String;
    .param p2, "defaultValue"    # J

    .prologue
    .line 231
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0, p1, p2, p3}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getHeaderFieldDate(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getHeaderFieldInt(Ljava/lang/String;I)I
    .locals 1
    .param p1, "field"    # Ljava/lang/String;
    .param p2, "defaultValue"    # I

    .prologue
    .line 235
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getHeaderFieldInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getHeaderFieldKey(I)Ljava/lang/String;
    .locals 1
    .param p1, "position"    # I

    .prologue
    .line 239
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getHeaderFieldKey(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHeaderFields()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 215
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getHeaderFields()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .prologue
    .line 335
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    iget-object v0, v0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->getHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v0

    return-object v0
.end method

.method public getHttpEngine()Lcom/squareup/okhttp/internal/http/HttpEngine;
    .locals 1

    .prologue
    .line 112
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getHttpEngine()Lcom/squareup/okhttp/internal/http/HttpEngine;

    move-result-object v0

    return-object v0
.end method

.method public getIfModifiedSince()J
    .locals 2

    .prologue
    .line 243
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getIfModifiedSince()J

    move-result-wide v0

    return-wide v0
.end method

.method public getInputStream()Ljava/io/InputStream;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 247
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public getInstanceFollowRedirects()Z
    .locals 1

    .prologue
    .line 153
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getInstanceFollowRedirects()Z

    move-result v0

    return v0
.end method

.method public getLastModified()J
    .locals 2

    .prologue
    .line 251
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getLastModified()J

    move-result-wide v0

    return-wide v0
.end method

.method public getLocalCertificates()[Ljava/security/cert/Certificate;
    .locals 5

    .prologue
    const/4 v3, 0x0

    .line 62
    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v4}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getSecureCacheResponse()Ljava/net/SecureCacheResponse;

    move-result-object v0

    .line 63
    .local v0, "cacheResponse":Ljava/net/SecureCacheResponse;
    if-eqz v0, :cond_1

    .line 64
    invoke-virtual {v0}, Ljava/net/SecureCacheResponse;->getLocalCertificateChain()Ljava/util/List;

    move-result-object v1

    .line 65
    .local v1, "result":Ljava/util/List;, "Ljava/util/List<Ljava/security/cert/Certificate;>;"
    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    new-array v3, v3, [Ljava/security/cert/Certificate;

    invoke-interface {v1, v3}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/security/cert/Certificate;

    .line 71
    .end local v1    # "result":Ljava/util/List;, "Ljava/util/List<Ljava/security/cert/Certificate;>;"
    :cond_0
    :goto_0
    return-object v3

    .line 67
    :cond_1
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->getSslSocket()Ljavax/net/ssl/SSLSocket;

    move-result-object v2

    .line 68
    .local v2, "sslSocket":Ljavax/net/ssl/SSLSocket;
    if-eqz v2, :cond_0

    .line 69
    invoke-virtual {v2}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v3

    invoke-interface {v3}, Ljavax/net/ssl/SSLSession;->getLocalCertificates()[Ljava/security/cert/Certificate;

    move-result-object v3

    goto :goto_0
.end method

.method public getLocalPrincipal()Ljava/security/Principal;
    .locals 3

    .prologue
    .line 100
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v2}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getSecureCacheResponse()Ljava/net/SecureCacheResponse;

    move-result-object v0

    .line 101
    .local v0, "cacheResponse":Ljava/net/SecureCacheResponse;
    if-eqz v0, :cond_0

    .line 102
    invoke-virtual {v0}, Ljava/net/SecureCacheResponse;->getLocalPrincipal()Ljava/security/Principal;

    move-result-object v2

    .line 108
    :goto_0
    return-object v2

    .line 104
    :cond_0
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->getSslSocket()Ljavax/net/ssl/SSLSocket;

    move-result-object v1

    .line 105
    .local v1, "sslSocket":Ljavax/net/ssl/SSLSocket;
    if-eqz v1, :cond_1

    .line 106
    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v2

    invoke-interface {v2}, Ljavax/net/ssl/SSLSession;->getLocalPrincipal()Ljava/security/Principal;

    move-result-object v2

    goto :goto_0

    .line 108
    :cond_1
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public getOutputStream()Ljava/io/OutputStream;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 255
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    return-object v0
.end method

.method public getPeerPrincipal()Ljava/security/Principal;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/net/ssl/SSLPeerUnverifiedException;
        }
    .end annotation

    .prologue
    .line 88
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v2}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getSecureCacheResponse()Ljava/net/SecureCacheResponse;

    move-result-object v0

    .line 89
    .local v0, "cacheResponse":Ljava/net/SecureCacheResponse;
    if-eqz v0, :cond_0

    .line 90
    invoke-virtual {v0}, Ljava/net/SecureCacheResponse;->getPeerPrincipal()Ljava/security/Principal;

    move-result-object v2

    .line 96
    :goto_0
    return-object v2

    .line 92
    :cond_0
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->getSslSocket()Ljavax/net/ssl/SSLSocket;

    move-result-object v1

    .line 93
    .local v1, "sslSocket":Ljavax/net/ssl/SSLSocket;
    if-eqz v1, :cond_1

    .line 94
    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v2

    invoke-interface {v2}, Ljavax/net/ssl/SSLSession;->getPeerPrincipal()Ljava/security/Principal;

    move-result-object v2

    goto :goto_0

    .line 96
    :cond_1
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public getPermission()Ljava/security/Permission;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 259
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getPermission()Ljava/security/Permission;

    move-result-object v0

    return-object v0
.end method

.method public getReadTimeout()I
    .locals 1

    .prologue
    .line 315
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getReadTimeout()I

    move-result v0

    return v0
.end method

.method public getRequestMethod()Ljava/lang/String;
    .locals 1

    .prologue
    .line 133
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getRequestMethod()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getRequestProperties()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 219
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getRequestProperties()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getRequestProperty(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "field"    # Ljava/lang/String;

    .prologue
    .line 263
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getRequestProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getResponseCode()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 137
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getResponseCode()I

    move-result v0

    return v0
.end method

.method public getResponseMessage()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 141
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getResponseMessage()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSSLSocketFactory()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    .prologue
    .line 343
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    iget-object v0, v0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->getSslSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    return-object v0
.end method

.method public getServerCertificates()[Ljava/security/cert/Certificate;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/net/ssl/SSLPeerUnverifiedException;
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 75
    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v4}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getSecureCacheResponse()Ljava/net/SecureCacheResponse;

    move-result-object v0

    .line 76
    .local v0, "cacheResponse":Ljava/net/SecureCacheResponse;
    if-eqz v0, :cond_1

    .line 77
    invoke-virtual {v0}, Ljava/net/SecureCacheResponse;->getServerCertificateChain()Ljava/util/List;

    move-result-object v1

    .line 78
    .local v1, "result":Ljava/util/List;, "Ljava/util/List<Ljava/security/cert/Certificate;>;"
    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    new-array v3, v3, [Ljava/security/cert/Certificate;

    invoke-interface {v1, v3}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/security/cert/Certificate;

    .line 84
    .end local v1    # "result":Ljava/util/List;, "Ljava/util/List<Ljava/security/cert/Certificate;>;"
    :cond_0
    :goto_0
    return-object v3

    .line 80
    :cond_1
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->getSslSocket()Ljavax/net/ssl/SSLSocket;

    move-result-object v2

    .line 81
    .local v2, "sslSocket":Ljavax/net/ssl/SSLSocket;
    if-eqz v2, :cond_0

    .line 82
    invoke-virtual {v2}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v3

    invoke-interface {v3}, Ljavax/net/ssl/SSLSession;->getPeerCertificates()[Ljava/security/cert/Certificate;

    move-result-object v3

    goto :goto_0
.end method

.method public getURL()Ljava/net/URL;
    .locals 1

    .prologue
    .line 267
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getURL()Ljava/net/URL;

    move-result-object v0

    return-object v0
.end method

.method public getUseCaches()Z
    .locals 1

    .prologue
    .line 271
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->getUseCaches()Z

    move-result v0

    return v0
.end method

.method public setAllowUserInteraction(Z)V
    .locals 1
    .param p1, "newValue"    # Z

    .prologue
    .line 275
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->setAllowUserInteraction(Z)V

    .line 276
    return-void
.end method

.method public setChunkedStreamingMode(I)V
    .locals 1
    .param p1, "chunkLength"    # I

    .prologue
    .line 327
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->setChunkedStreamingMode(I)V

    .line 328
    return-void
.end method

.method public setConnectTimeout(I)V
    .locals 1
    .param p1, "timeoutMillis"    # I

    .prologue
    .line 303
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->setConnectTimeout(I)V

    .line 304
    return-void
.end method

.method public setDefaultUseCaches(Z)V
    .locals 1
    .param p1, "newValue"    # Z

    .prologue
    .line 279
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->setDefaultUseCaches(Z)V

    .line 280
    return-void
.end method

.method public setDoInput(Z)V
    .locals 1
    .param p1, "newValue"    # Z

    .prologue
    .line 283
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->setDoInput(Z)V

    .line 284
    return-void
.end method

.method public setDoOutput(Z)V
    .locals 1
    .param p1, "newValue"    # Z

    .prologue
    .line 287
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->setDoOutput(Z)V

    .line 288
    return-void
.end method

.method public setFixedLengthStreamingMode(I)V
    .locals 1
    .param p1, "contentLength"    # I

    .prologue
    .line 323
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->setFixedLengthStreamingMode(I)V

    .line 324
    return-void
.end method

.method public setFixedLengthStreamingMode(J)V
    .locals 1
    .param p1, "contentLength"    # J
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    .line 348
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->setFixedLengthStreamingMode(J)V

    .line 349
    return-void
.end method

.method public setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V
    .locals 1
    .param p1, "hostnameVerifier"    # Ljavax/net/ssl/HostnameVerifier;

    .prologue
    .line 331
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    iget-object v0, v0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/OkHttpClient;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)Lcom/squareup/okhttp/OkHttpClient;

    .line 332
    return-void
.end method

.method public setIfModifiedSince(J)V
    .locals 1
    .param p1, "newValue"    # J

    .prologue
    .line 291
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->setIfModifiedSince(J)V

    .line 292
    return-void
.end method

.method public setInstanceFollowRedirects(Z)V
    .locals 1
    .param p1, "followRedirects"    # Z

    .prologue
    .line 157
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->setInstanceFollowRedirects(Z)V

    .line 158
    return-void
.end method

.method public setReadTimeout(I)V
    .locals 1
    .param p1, "timeoutMillis"    # I

    .prologue
    .line 311
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->setReadTimeout(I)V

    .line 312
    return-void
.end method

.method public setRequestMethod(Ljava/lang/String;)V
    .locals 1
    .param p1, "method"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/ProtocolException;
        }
    .end annotation

    .prologue
    .line 145
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->setRequestMethod(Ljava/lang/String;)V

    .line 146
    return-void
.end method

.method public setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "field"    # Ljava/lang/String;
    .param p2, "newValue"    # Ljava/lang/String;

    .prologue
    .line 295
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    return-void
.end method

.method public setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V
    .locals 1
    .param p1, "sslSocketFactory"    # Ljavax/net/ssl/SSLSocketFactory;

    .prologue
    .line 339
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    iget-object v0, v0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/OkHttpClient;->setSslSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)Lcom/squareup/okhttp/OkHttpClient;

    .line 340
    return-void
.end method

.method public setUseCaches(Z)V
    .locals 1
    .param p1, "newValue"    # Z

    .prologue
    .line 299
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->setUseCaches(Z)V

    .line 300
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 319
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public usingProxy()Z
    .locals 1

    .prologue
    .line 149
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;->delegate:Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl$HttpUrlConnectionDelegate;->usingProxy()Z

    move-result v0

    return v0
.end method
