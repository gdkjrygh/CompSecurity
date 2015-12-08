.class public final Lcom/squareup/okhttp/OkHttpClient;
.super Ljava/lang/Object;
.source "OkHttpClient.java"

# interfaces
.implements Ljava/net/URLStreamHandlerFactory;


# static fields
.field private static final DEFAULT_TRANSPORTS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private authenticator:Lcom/squareup/okhttp/OkAuthenticator;

.field private connectTimeout:I

.field private connectionPool:Lcom/squareup/okhttp/ConnectionPool;

.field private cookieHandler:Ljava/net/CookieHandler;

.field private final dispatcher:Lcom/squareup/okhttp/Dispatcher;

.field private followProtocolRedirects:Z

.field private hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

.field private proxy:Ljava/net/Proxy;

.field private proxySelector:Ljava/net/ProxySelector;

.field private readTimeout:I

.field private responseCache:Ljava/net/ResponseCache;

.field private final routeDatabase:Lcom/squareup/okhttp/RouteDatabase;

.field private sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

.field private transports:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 42
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "spdy/3"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "http/1.1"

    aput-object v2, v0, v1

    .line 43
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/okhttp/internal/Util;->immutableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/squareup/okhttp/OkHttpClient;->DEFAULT_TRANSPORTS:Ljava/util/List;

    .line 42
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/squareup/okhttp/OkHttpClient;->followProtocolRedirects:Z

    .line 61
    new-instance v0, Lcom/squareup/okhttp/RouteDatabase;

    invoke-direct {v0}, Lcom/squareup/okhttp/RouteDatabase;-><init>()V

    iput-object v0, p0, Lcom/squareup/okhttp/OkHttpClient;->routeDatabase:Lcom/squareup/okhttp/RouteDatabase;

    .line 62
    new-instance v0, Lcom/squareup/okhttp/Dispatcher;

    invoke-direct {v0}, Lcom/squareup/okhttp/Dispatcher;-><init>()V

    iput-object v0, p0, Lcom/squareup/okhttp/OkHttpClient;->dispatcher:Lcom/squareup/okhttp/Dispatcher;

    .line 63
    return-void
.end method

.method private constructor <init>(Lcom/squareup/okhttp/OkHttpClient;)V
    .locals 1
    .param p1, "copyFrom"    # Lcom/squareup/okhttp/OkHttpClient;

    .prologue
    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/squareup/okhttp/OkHttpClient;->followProtocolRedirects:Z

    .line 66
    iget-object v0, p1, Lcom/squareup/okhttp/OkHttpClient;->routeDatabase:Lcom/squareup/okhttp/RouteDatabase;

    iput-object v0, p0, Lcom/squareup/okhttp/OkHttpClient;->routeDatabase:Lcom/squareup/okhttp/RouteDatabase;

    .line 67
    iget-object v0, p1, Lcom/squareup/okhttp/OkHttpClient;->dispatcher:Lcom/squareup/okhttp/Dispatcher;

    iput-object v0, p0, Lcom/squareup/okhttp/OkHttpClient;->dispatcher:Lcom/squareup/okhttp/Dispatcher;

    .line 68
    return-void
.end method

.method private copyWithDefaults()Lcom/squareup/okhttp/OkHttpClient;
    .locals 2

    .prologue
    .line 357
    new-instance v0, Lcom/squareup/okhttp/OkHttpClient;

    invoke-direct {v0, p0}, Lcom/squareup/okhttp/OkHttpClient;-><init>(Lcom/squareup/okhttp/OkHttpClient;)V

    .line 358
    .local v0, "result":Lcom/squareup/okhttp/OkHttpClient;
    iget-object v1, p0, Lcom/squareup/okhttp/OkHttpClient;->proxy:Ljava/net/Proxy;

    iput-object v1, v0, Lcom/squareup/okhttp/OkHttpClient;->proxy:Ljava/net/Proxy;

    .line 359
    iget-object v1, p0, Lcom/squareup/okhttp/OkHttpClient;->proxySelector:Ljava/net/ProxySelector;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/squareup/okhttp/OkHttpClient;->proxySelector:Ljava/net/ProxySelector;

    :goto_0
    iput-object v1, v0, Lcom/squareup/okhttp/OkHttpClient;->proxySelector:Ljava/net/ProxySelector;

    .line 360
    iget-object v1, p0, Lcom/squareup/okhttp/OkHttpClient;->cookieHandler:Ljava/net/CookieHandler;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/squareup/okhttp/OkHttpClient;->cookieHandler:Ljava/net/CookieHandler;

    :goto_1
    iput-object v1, v0, Lcom/squareup/okhttp/OkHttpClient;->cookieHandler:Ljava/net/CookieHandler;

    .line 361
    iget-object v1, p0, Lcom/squareup/okhttp/OkHttpClient;->responseCache:Ljava/net/ResponseCache;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/squareup/okhttp/OkHttpClient;->responseCache:Ljava/net/ResponseCache;

    :goto_2
    iput-object v1, v0, Lcom/squareup/okhttp/OkHttpClient;->responseCache:Ljava/net/ResponseCache;

    .line 362
    iget-object v1, p0, Lcom/squareup/okhttp/OkHttpClient;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/squareup/okhttp/OkHttpClient;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    .line 364
    :goto_3
    iput-object v1, v0, Lcom/squareup/okhttp/OkHttpClient;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    .line 365
    iget-object v1, p0, Lcom/squareup/okhttp/OkHttpClient;->hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/squareup/okhttp/OkHttpClient;->hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

    :goto_4
    iput-object v1, v0, Lcom/squareup/okhttp/OkHttpClient;->hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

    .line 368
    iget-object v1, p0, Lcom/squareup/okhttp/OkHttpClient;->authenticator:Lcom/squareup/okhttp/OkAuthenticator;

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/squareup/okhttp/OkHttpClient;->authenticator:Lcom/squareup/okhttp/OkAuthenticator;

    :goto_5
    iput-object v1, v0, Lcom/squareup/okhttp/OkHttpClient;->authenticator:Lcom/squareup/okhttp/OkAuthenticator;

    .line 371
    iget-object v1, p0, Lcom/squareup/okhttp/OkHttpClient;->connectionPool:Lcom/squareup/okhttp/ConnectionPool;

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/squareup/okhttp/OkHttpClient;->connectionPool:Lcom/squareup/okhttp/ConnectionPool;

    :goto_6
    iput-object v1, v0, Lcom/squareup/okhttp/OkHttpClient;->connectionPool:Lcom/squareup/okhttp/ConnectionPool;

    .line 372
    iget-boolean v1, p0, Lcom/squareup/okhttp/OkHttpClient;->followProtocolRedirects:Z

    iput-boolean v1, v0, Lcom/squareup/okhttp/OkHttpClient;->followProtocolRedirects:Z

    .line 373
    iget-object v1, p0, Lcom/squareup/okhttp/OkHttpClient;->transports:Ljava/util/List;

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/squareup/okhttp/OkHttpClient;->transports:Ljava/util/List;

    :goto_7
    iput-object v1, v0, Lcom/squareup/okhttp/OkHttpClient;->transports:Ljava/util/List;

    .line 374
    iget v1, p0, Lcom/squareup/okhttp/OkHttpClient;->connectTimeout:I

    iput v1, v0, Lcom/squareup/okhttp/OkHttpClient;->connectTimeout:I

    .line 375
    iget v1, p0, Lcom/squareup/okhttp/OkHttpClient;->readTimeout:I

    iput v1, v0, Lcom/squareup/okhttp/OkHttpClient;->readTimeout:I

    .line 376
    return-object v0

    .line 359
    :cond_0
    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    move-result-object v1

    goto :goto_0

    .line 360
    :cond_1
    invoke-static {}, Ljava/net/CookieHandler;->getDefault()Ljava/net/CookieHandler;

    move-result-object v1

    goto :goto_1

    .line 361
    :cond_2
    invoke-static {}, Ljava/net/ResponseCache;->getDefault()Ljava/net/ResponseCache;

    move-result-object v1

    goto :goto_2

    .line 364
    :cond_3
    invoke-static {}, Ljavax/net/ssl/HttpsURLConnection;->getDefaultSSLSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    goto :goto_3

    .line 365
    :cond_4
    sget-object v1, Lcom/squareup/okhttp/internal/tls/OkHostnameVerifier;->INSTANCE:Lcom/squareup/okhttp/internal/tls/OkHostnameVerifier;

    goto :goto_4

    .line 368
    :cond_5
    sget-object v1, Lcom/squareup/okhttp/internal/http/HttpAuthenticator;->SYSTEM_DEFAULT:Lcom/squareup/okhttp/OkAuthenticator;

    goto :goto_5

    .line 371
    :cond_6
    invoke-static {}, Lcom/squareup/okhttp/ConnectionPool;->getDefault()Lcom/squareup/okhttp/ConnectionPool;

    move-result-object v1

    goto :goto_6

    .line 373
    :cond_7
    sget-object v1, Lcom/squareup/okhttp/OkHttpClient;->DEFAULT_TRANSPORTS:Ljava/util/List;

    goto :goto_7
.end method


# virtual methods
.method cancel(Ljava/lang/Object;)V
    .locals 1
    .param p1, "tag"    # Ljava/lang/Object;

    .prologue
    .line 335
    iget-object v0, p0, Lcom/squareup/okhttp/OkHttpClient;->dispatcher:Lcom/squareup/okhttp/Dispatcher;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/Dispatcher;->cancel(Ljava/lang/Object;)V

    .line 336
    return-void
.end method

.method public createURLStreamHandler(Ljava/lang/String;)Ljava/net/URLStreamHandler;
    .locals 1
    .param p1, "protocol"    # Ljava/lang/String;

    .prologue
    .line 390
    const-string v0, "http"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "https"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 392
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/squareup/okhttp/OkHttpClient$1;

    invoke-direct {v0, p0, p1}, Lcom/squareup/okhttp/OkHttpClient$1;-><init>(Lcom/squareup/okhttp/OkHttpClient;Ljava/lang/String;)V

    goto :goto_0
.end method

.method enqueue(Lcom/squareup/okhttp/Request;Lcom/squareup/okhttp/Response$Receiver;)V
    .locals 2
    .param p1, "request"    # Lcom/squareup/okhttp/Request;
    .param p2, "responseReceiver"    # Lcom/squareup/okhttp/Response$Receiver;

    .prologue
    .line 327
    iget-object v0, p0, Lcom/squareup/okhttp/OkHttpClient;->dispatcher:Lcom/squareup/okhttp/Dispatcher;

    invoke-direct {p0}, Lcom/squareup/okhttp/OkHttpClient;->copyWithDefaults()Lcom/squareup/okhttp/OkHttpClient;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lcom/squareup/okhttp/Dispatcher;->enqueue(Lcom/squareup/okhttp/OkHttpClient;Lcom/squareup/okhttp/Request;Lcom/squareup/okhttp/Response$Receiver;)V

    .line 328
    return-void
.end method

.method public getAuthenticator()Lcom/squareup/okhttp/OkAuthenticator;
    .locals 1

    .prologue
    .line 236
    iget-object v0, p0, Lcom/squareup/okhttp/OkHttpClient;->authenticator:Lcom/squareup/okhttp/OkAuthenticator;

    return-object v0
.end method

.method public getConnectTimeout()I
    .locals 1

    .prologue
    .line 91
    iget v0, p0, Lcom/squareup/okhttp/OkHttpClient;->connectTimeout:I

    return v0
.end method

.method public getConnectionPool()Lcom/squareup/okhttp/ConnectionPool;
    .locals 1

    .prologue
    .line 251
    iget-object v0, p0, Lcom/squareup/okhttp/OkHttpClient;->connectionPool:Lcom/squareup/okhttp/ConnectionPool;

    return-object v0
.end method

.method public getCookieHandler()Ljava/net/CookieHandler;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lcom/squareup/okhttp/OkHttpClient;->cookieHandler:Ljava/net/CookieHandler;

    return-object v0
.end method

.method public getFollowProtocolRedirects()Z
    .locals 1

    .prologue
    .line 267
    iget-boolean v0, p0, Lcom/squareup/okhttp/OkHttpClient;->followProtocolRedirects:Z

    return v0
.end method

.method public getHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .prologue
    .line 220
    iget-object v0, p0, Lcom/squareup/okhttp/OkHttpClient;->hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

    return-object v0
.end method

.method public getOkResponseCache()Lcom/squareup/okhttp/OkResponseCache;
    .locals 2

    .prologue
    .line 183
    iget-object v0, p0, Lcom/squareup/okhttp/OkHttpClient;->responseCache:Ljava/net/ResponseCache;

    instance-of v0, v0, Lcom/squareup/okhttp/HttpResponseCache;

    if-eqz v0, :cond_0

    .line 184
    iget-object v0, p0, Lcom/squareup/okhttp/OkHttpClient;->responseCache:Ljava/net/ResponseCache;

    check-cast v0, Lcom/squareup/okhttp/HttpResponseCache;

    iget-object v0, v0, Lcom/squareup/okhttp/HttpResponseCache;->okResponseCache:Lcom/squareup/okhttp/OkResponseCache;

    .line 188
    :goto_0
    return-object v0

    .line 185
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/OkHttpClient;->responseCache:Ljava/net/ResponseCache;

    if-eqz v0, :cond_1

    .line 186
    new-instance v0, Lcom/squareup/okhttp/internal/http/OkResponseCacheAdapter;

    iget-object v1, p0, Lcom/squareup/okhttp/OkHttpClient;->responseCache:Ljava/net/ResponseCache;

    invoke-direct {v0, v1}, Lcom/squareup/okhttp/internal/http/OkResponseCacheAdapter;-><init>(Ljava/net/ResponseCache;)V

    goto :goto_0

    .line 188
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getProxy()Ljava/net/Proxy;
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/squareup/okhttp/OkHttpClient;->proxy:Ljava/net/Proxy;

    return-object v0
.end method

.method public getProxySelector()Ljava/net/ProxySelector;
    .locals 1

    .prologue
    .line 148
    iget-object v0, p0, Lcom/squareup/okhttp/OkHttpClient;->proxySelector:Ljava/net/ProxySelector;

    return-object v0
.end method

.method public getReadTimeout()I
    .locals 1

    .prologue
    .line 115
    iget v0, p0, Lcom/squareup/okhttp/OkHttpClient;->readTimeout:I

    return v0
.end method

.method public getResponseCache()Ljava/net/ResponseCache;
    .locals 1

    .prologue
    .line 179
    iget-object v0, p0, Lcom/squareup/okhttp/OkHttpClient;->responseCache:Ljava/net/ResponseCache;

    return-object v0
.end method

.method public getRoutesDatabase()Lcom/squareup/okhttp/RouteDatabase;
    .locals 1

    .prologue
    .line 271
    iget-object v0, p0, Lcom/squareup/okhttp/OkHttpClient;->routeDatabase:Lcom/squareup/okhttp/RouteDatabase;

    return-object v0
.end method

.method public getSslSocketFactory()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    .prologue
    .line 204
    iget-object v0, p0, Lcom/squareup/okhttp/OkHttpClient;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    return-object v0
.end method

.method public getTransports()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 317
    iget-object v0, p0, Lcom/squareup/okhttp/OkHttpClient;->transports:Ljava/util/List;

    return-object v0
.end method

.method public open(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    .locals 1
    .param p1, "url"    # Ljava/net/URL;

    .prologue
    .line 339
    iget-object v0, p0, Lcom/squareup/okhttp/OkHttpClient;->proxy:Ljava/net/Proxy;

    invoke-virtual {p0, p1, v0}, Lcom/squareup/okhttp/OkHttpClient;->open(Ljava/net/URL;Ljava/net/Proxy;)Ljava/net/HttpURLConnection;

    move-result-object v0

    return-object v0
.end method

.method open(Ljava/net/URL;Ljava/net/Proxy;)Ljava/net/HttpURLConnection;
    .locals 5
    .param p1, "url"    # Ljava/net/URL;
    .param p2, "proxy"    # Ljava/net/Proxy;

    .prologue
    .line 343
    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v1

    .line 344
    .local v1, "protocol":Ljava/lang/String;
    invoke-direct {p0}, Lcom/squareup/okhttp/OkHttpClient;->copyWithDefaults()Lcom/squareup/okhttp/OkHttpClient;

    move-result-object v0

    .line 345
    .local v0, "copy":Lcom/squareup/okhttp/OkHttpClient;
    iput-object p2, v0, Lcom/squareup/okhttp/OkHttpClient;->proxy:Ljava/net/Proxy;

    .line 347
    const-string v2, "http"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;

    invoke-direct {v2, p1, v0}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;-><init>(Ljava/net/URL;Lcom/squareup/okhttp/OkHttpClient;)V

    .line 348
    :goto_0
    return-object v2

    :cond_0
    const-string v2, "https"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;

    invoke-direct {v2, p1, v0}, Lcom/squareup/okhttp/internal/http/HttpsURLConnectionImpl;-><init>(Ljava/net/URL;Lcom/squareup/okhttp/OkHttpClient;)V

    goto :goto_0

    .line 349
    :cond_1
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unexpected protocol: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public setAuthenticator(Lcom/squareup/okhttp/OkAuthenticator;)Lcom/squareup/okhttp/OkHttpClient;
    .locals 0
    .param p1, "authenticator"    # Lcom/squareup/okhttp/OkAuthenticator;

    .prologue
    .line 231
    iput-object p1, p0, Lcom/squareup/okhttp/OkHttpClient;->authenticator:Lcom/squareup/okhttp/OkAuthenticator;

    .line 232
    return-object p0
.end method

.method public setConnectTimeout(JLjava/util/concurrent/TimeUnit;)V
    .locals 5
    .param p1, "timeout"    # J
    .param p3, "unit"    # Ljava/util/concurrent/TimeUnit;

    .prologue
    .line 76
    const-wide/16 v2, 0x0

    cmp-long v2, p1, v2

    if-gez v2, :cond_0

    .line 77
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "timeout < 0"

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 79
    :cond_0
    if-nez p3, :cond_1

    .line 80
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "unit == null"

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 82
    :cond_1
    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    .line 83
    .local v0, "millis":J
    const-wide/32 v2, 0x7fffffff

    cmp-long v2, v0, v2

    if-lez v2, :cond_2

    .line 84
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "Timeout too large."

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 86
    :cond_2
    long-to-int v2, v0

    iput v2, p0, Lcom/squareup/okhttp/OkHttpClient;->connectTimeout:I

    .line 87
    return-void
.end method

.method public setConnectionPool(Lcom/squareup/okhttp/ConnectionPool;)Lcom/squareup/okhttp/OkHttpClient;
    .locals 0
    .param p1, "connectionPool"    # Lcom/squareup/okhttp/ConnectionPool;

    .prologue
    .line 246
    iput-object p1, p0, Lcom/squareup/okhttp/OkHttpClient;->connectionPool:Lcom/squareup/okhttp/ConnectionPool;

    .line 247
    return-object p0
.end method

.method public setCookieHandler(Ljava/net/CookieHandler;)Lcom/squareup/okhttp/OkHttpClient;
    .locals 0
    .param p1, "cookieHandler"    # Ljava/net/CookieHandler;

    .prologue
    .line 159
    iput-object p1, p0, Lcom/squareup/okhttp/OkHttpClient;->cookieHandler:Ljava/net/CookieHandler;

    .line 160
    return-object p0
.end method

.method public setFollowProtocolRedirects(Z)Lcom/squareup/okhttp/OkHttpClient;
    .locals 0
    .param p1, "followProtocolRedirects"    # Z

    .prologue
    .line 262
    iput-boolean p1, p0, Lcom/squareup/okhttp/OkHttpClient;->followProtocolRedirects:Z

    .line 263
    return-object p0
.end method

.method public setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)Lcom/squareup/okhttp/OkHttpClient;
    .locals 0
    .param p1, "hostnameVerifier"    # Ljavax/net/ssl/HostnameVerifier;

    .prologue
    .line 215
    iput-object p1, p0, Lcom/squareup/okhttp/OkHttpClient;->hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

    .line 216
    return-object p0
.end method

.method public setProxy(Ljava/net/Proxy;)Lcom/squareup/okhttp/OkHttpClient;
    .locals 0
    .param p1, "proxy"    # Ljava/net/Proxy;

    .prologue
    .line 125
    iput-object p1, p0, Lcom/squareup/okhttp/OkHttpClient;->proxy:Ljava/net/Proxy;

    .line 126
    return-object p0
.end method

.method public setProxySelector(Ljava/net/ProxySelector;)Lcom/squareup/okhttp/OkHttpClient;
    .locals 0
    .param p1, "proxySelector"    # Ljava/net/ProxySelector;

    .prologue
    .line 143
    iput-object p1, p0, Lcom/squareup/okhttp/OkHttpClient;->proxySelector:Ljava/net/ProxySelector;

    .line 144
    return-object p0
.end method

.method public setReadTimeout(JLjava/util/concurrent/TimeUnit;)V
    .locals 5
    .param p1, "timeout"    # J
    .param p3, "unit"    # Ljava/util/concurrent/TimeUnit;

    .prologue
    .line 100
    const-wide/16 v2, 0x0

    cmp-long v2, p1, v2

    if-gez v2, :cond_0

    .line 101
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "timeout < 0"

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 103
    :cond_0
    if-nez p3, :cond_1

    .line 104
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "unit == null"

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 106
    :cond_1
    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    .line 107
    .local v0, "millis":J
    const-wide/32 v2, 0x7fffffff

    cmp-long v2, v0, v2

    if-lez v2, :cond_2

    .line 108
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "Timeout too large."

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 110
    :cond_2
    long-to-int v2, v0

    iput v2, p0, Lcom/squareup/okhttp/OkHttpClient;->readTimeout:I

    .line 111
    return-void
.end method

.method public setResponseCache(Ljava/net/ResponseCache;)Lcom/squareup/okhttp/OkHttpClient;
    .locals 0
    .param p1, "responseCache"    # Ljava/net/ResponseCache;

    .prologue
    .line 174
    iput-object p1, p0, Lcom/squareup/okhttp/OkHttpClient;->responseCache:Ljava/net/ResponseCache;

    .line 175
    return-object p0
.end method

.method public setSslSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)Lcom/squareup/okhttp/OkHttpClient;
    .locals 0
    .param p1, "sslSocketFactory"    # Ljavax/net/ssl/SSLSocketFactory;

    .prologue
    .line 199
    iput-object p1, p0, Lcom/squareup/okhttp/OkHttpClient;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    .line 200
    return-object p0
.end method

.method public setTransports(Ljava/util/List;)Lcom/squareup/okhttp/OkHttpClient;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/squareup/okhttp/OkHttpClient;"
        }
    .end annotation

    .prologue
    .line 302
    .local p1, "transports":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-static {p1}, Lcom/squareup/okhttp/internal/Util;->immutableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 303
    const-string v0, "http/1.1"

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 304
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "transports doesn\'t contain http/1.1: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 306
    :cond_0
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 307
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "transports must not contain null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 309
    :cond_1
    const-string v0, ""

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 310
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "transports contains an empty string"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 312
    :cond_2
    iput-object p1, p0, Lcom/squareup/okhttp/OkHttpClient;->transports:Ljava/util/List;

    .line 313
    return-object p0
.end method
