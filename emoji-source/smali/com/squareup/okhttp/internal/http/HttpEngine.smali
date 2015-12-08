.class public Lcom/squareup/okhttp/internal/http/HttpEngine;
.super Ljava/lang/Object;
.source "HttpEngine.java"


# static fields
.field private static final GATEWAY_TIMEOUT_RESPONSE:Ljava/net/CacheResponse;

.field public static final HTTP_CONTINUE:I = 0x64


# instance fields
.field private automaticallyReleaseConnectionToPool:Z

.field private cacheRequest:Ljava/net/CacheRequest;

.field private cacheResponse:Ljava/net/CacheResponse;

.field private cachedResponseBody:Ljava/io/InputStream;

.field private cachedResponseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

.field protected final client:Lcom/squareup/okhttp/OkHttpClient;

.field connected:Z

.field protected connection:Lcom/squareup/okhttp/Connection;

.field private connectionReleased:Z

.field protected final method:Ljava/lang/String;

.field protected final policy:Lcom/squareup/okhttp/internal/http/Policy;

.field private requestBodyOut:Ljava/io/OutputStream;

.field final requestHeaders:Lcom/squareup/okhttp/internal/http/RequestHeaders;

.field private responseBodyIn:Ljava/io/InputStream;

.field responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

.field private responseSource:Lcom/squareup/okhttp/ResponseSource;

.field private responseTransferIn:Ljava/io/InputStream;

.field protected routeSelector:Lcom/squareup/okhttp/internal/http/RouteSelector;

.field sentRequestMillis:J

.field private transparentGzip:Z

.field private transport:Lcom/squareup/okhttp/internal/http/Transport;

.field final uri:Ljava/net/URI;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 79
    new-instance v0, Lcom/squareup/okhttp/internal/http/HttpEngine$1;

    invoke-direct {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine$1;-><init>()V

    sput-object v0, Lcom/squareup/okhttp/internal/http/HttpEngine;->GATEWAY_TIMEOUT_RESPONSE:Ljava/net/CacheResponse;

    return-void
.end method

.method public constructor <init>(Lcom/squareup/okhttp/OkHttpClient;Lcom/squareup/okhttp/internal/http/Policy;Ljava/lang/String;Lcom/squareup/okhttp/internal/http/RawHeaders;Lcom/squareup/okhttp/Connection;Lcom/squareup/okhttp/internal/http/RetryableOutputStream;)V
    .locals 4
    .param p1, "client"    # Lcom/squareup/okhttp/OkHttpClient;
    .param p2, "policy"    # Lcom/squareup/okhttp/internal/http/Policy;
    .param p3, "method"    # Ljava/lang/String;
    .param p4, "requestHeaders"    # Lcom/squareup/okhttp/internal/http/RawHeaders;
    .param p5, "connection"    # Lcom/squareup/okhttp/Connection;
    .param p6, "requestBodyOut"    # Lcom/squareup/okhttp/internal/http/RetryableOutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 154
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 111
    const-wide/16 v2, -0x1

    iput-wide v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->sentRequestMillis:J

    .line 155
    iput-object p1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    .line 156
    iput-object p2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->policy:Lcom/squareup/okhttp/internal/http/Policy;

    .line 157
    iput-object p3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->method:Ljava/lang/String;

    .line 158
    iput-object p5, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    .line 159
    iput-object p6, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestBodyOut:Ljava/io/OutputStream;

    .line 162
    :try_start_0
    invoke-static {}, Lcom/squareup/okhttp/internal/Platform;->get()Lcom/squareup/okhttp/internal/Platform;

    move-result-object v1

    invoke-interface {p2}, Lcom/squareup/okhttp/internal/http/Policy;->getURL()Ljava/net/URL;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/squareup/okhttp/internal/Platform;->toUriLenient(Ljava/net/URL;)Ljava/net/URI;

    move-result-object v1

    iput-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->uri:Ljava/net/URI;
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 167
    new-instance v1, Lcom/squareup/okhttp/internal/http/RequestHeaders;

    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->uri:Ljava/net/URI;

    new-instance v3, Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-direct {v3, p4}, Lcom/squareup/okhttp/internal/http/RawHeaders;-><init>(Lcom/squareup/okhttp/internal/http/RawHeaders;)V

    invoke-direct {v1, v2, v3}, Lcom/squareup/okhttp/internal/http/RequestHeaders;-><init>(Ljava/net/URI;Lcom/squareup/okhttp/internal/http/RawHeaders;)V

    iput-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestHeaders:Lcom/squareup/okhttp/internal/http/RequestHeaders;

    .line 168
    return-void

    .line 163
    :catch_0
    move-exception v0

    .line 164
    .local v0, "e":Ljava/net/URISyntaxException;
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, Ljava/net/URISyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static getDefaultUserAgent()Ljava/lang/String;
    .locals 3

    .prologue
    .line 596
    const-string v1, "http.agent"

    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 597
    .local v0, "agent":Ljava/lang/String;
    if-eqz v0, :cond_0

    .end local v0    # "agent":Ljava/lang/String;
    :goto_0
    return-object v0

    .restart local v0    # "agent":Ljava/lang/String;
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Java"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "java.version"

    invoke-static {v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static getOriginAddress(Ljava/net/URL;)Ljava/lang/String;
    .locals 4
    .param p0, "url"    # Ljava/net/URL;

    .prologue
    .line 601
    invoke-virtual {p0}, Ljava/net/URL;->getPort()I

    move-result v0

    .line 602
    .local v0, "port":I
    invoke-virtual {p0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v1

    .line 603
    .local v1, "result":Ljava/lang/String;
    if-lez v0, :cond_0

    invoke-virtual {p0}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/squareup/okhttp/internal/Util;->getDefaultPort(Ljava/lang/String;)I

    move-result v2

    if-eq v0, v2, :cond_0

    .line 604
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 606
    :cond_0
    return-object v1
.end method

.method private initContentStream(Ljava/io/InputStream;)V
    .locals 1
    .param p1, "transferStream"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 457
    iput-object p1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseTransferIn:Ljava/io/InputStream;

    .line 458
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->transparentGzip:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->isContentEncodingGzip()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 466
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->stripContentEncoding()V

    .line 467
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->stripContentLength()V

    .line 468
    new-instance v0, Ljava/util/zip/GZIPInputStream;

    invoke-direct {v0, p1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseBodyIn:Ljava/io/InputStream;

    .line 472
    :goto_0
    return-void

    .line 470
    :cond_0
    iput-object p1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseBodyIn:Ljava/io/InputStream;

    goto :goto_0
.end method

.method private initResponseSource()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 218
    sget-object v6, Lcom/squareup/okhttp/ResponseSource;->NETWORK:Lcom/squareup/okhttp/ResponseSource;

    iput-object v6, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseSource:Lcom/squareup/okhttp/ResponseSource;

    .line 219
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->policy:Lcom/squareup/okhttp/internal/http/Policy;

    invoke-interface {v6}, Lcom/squareup/okhttp/internal/http/Policy;->getUseCaches()Z

    move-result v6

    if-nez v6, :cond_1

    .line 251
    :cond_0
    :goto_0
    return-void

    .line 221
    :cond_1
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v6}, Lcom/squareup/okhttp/OkHttpClient;->getOkResponseCache()Lcom/squareup/okhttp/OkResponseCache;

    move-result-object v4

    .line 222
    .local v4, "responseCache":Lcom/squareup/okhttp/OkResponseCache;
    if-eqz v4, :cond_0

    .line 224
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->uri:Ljava/net/URI;

    iget-object v7, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->method:Ljava/lang/String;

    iget-object v8, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestHeaders:Lcom/squareup/okhttp/internal/http/RequestHeaders;

    .line 225
    invoke-virtual {v8}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->getHeaders()Lcom/squareup/okhttp/internal/http/RawHeaders;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual {v8, v9}, Lcom/squareup/okhttp/internal/http/RawHeaders;->toMultimap(Z)Ljava/util/Map;

    move-result-object v8

    .line 224
    invoke-interface {v4, v6, v7, v8}, Lcom/squareup/okhttp/OkResponseCache;->get(Ljava/net/URI;Ljava/lang/String;Ljava/util/Map;)Ljava/net/CacheResponse;

    move-result-object v0

    .line 226
    .local v0, "candidate":Ljava/net/CacheResponse;
    if-eqz v0, :cond_0

    .line 228
    invoke-virtual {v0}, Ljava/net/CacheResponse;->getHeaders()Ljava/util/Map;

    move-result-object v5

    .line 229
    .local v5, "responseHeadersMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    invoke-virtual {v0}, Ljava/net/CacheResponse;->getBody()Ljava/io/InputStream;

    move-result-object v6

    iput-object v6, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cachedResponseBody:Ljava/io/InputStream;

    .line 230
    invoke-virtual {p0, v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->acceptCacheResponseType(Ljava/net/CacheResponse;)Z

    move-result v6

    if-eqz v6, :cond_2

    if-eqz v5, :cond_2

    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cachedResponseBody:Ljava/io/InputStream;

    if-nez v6, :cond_3

    .line 233
    :cond_2
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cachedResponseBody:Ljava/io/InputStream;

    invoke-static {v6}, Lcom/squareup/okhttp/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    goto :goto_0

    .line 237
    :cond_3
    const/4 v6, 0x1

    invoke-static {v5, v6}, Lcom/squareup/okhttp/internal/http/RawHeaders;->fromMultimap(Ljava/util/Map;Z)Lcom/squareup/okhttp/internal/http/RawHeaders;

    move-result-object v1

    .line 238
    .local v1, "rawResponseHeaders":Lcom/squareup/okhttp/internal/http/RawHeaders;
    new-instance v6, Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    iget-object v7, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->uri:Ljava/net/URI;

    invoke-direct {v6, v7, v1}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;-><init>(Ljava/net/URI;Lcom/squareup/okhttp/internal/http/RawHeaders;)V

    iput-object v6, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cachedResponseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    .line 239
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 240
    .local v2, "now":J
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cachedResponseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    iget-object v7, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestHeaders:Lcom/squareup/okhttp/internal/http/RequestHeaders;

    invoke-virtual {v6, v2, v3, v7}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->chooseResponseSource(JLcom/squareup/okhttp/internal/http/RequestHeaders;)Lcom/squareup/okhttp/ResponseSource;

    move-result-object v6

    iput-object v6, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseSource:Lcom/squareup/okhttp/ResponseSource;

    .line 241
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseSource:Lcom/squareup/okhttp/ResponseSource;

    sget-object v7, Lcom/squareup/okhttp/ResponseSource;->CACHE:Lcom/squareup/okhttp/ResponseSource;

    if-ne v6, v7, :cond_4

    .line 242
    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cacheResponse:Ljava/net/CacheResponse;

    .line 243
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cachedResponseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    iget-object v7, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cachedResponseBody:Ljava/io/InputStream;

    invoke-direct {p0, v6, v7}, Lcom/squareup/okhttp/internal/http/HttpEngine;->setResponse(Lcom/squareup/okhttp/internal/http/ResponseHeaders;Ljava/io/InputStream;)V

    goto :goto_0

    .line 244
    :cond_4
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseSource:Lcom/squareup/okhttp/ResponseSource;

    sget-object v7, Lcom/squareup/okhttp/ResponseSource;->CONDITIONAL_CACHE:Lcom/squareup/okhttp/ResponseSource;

    if-ne v6, v7, :cond_5

    .line 245
    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cacheResponse:Ljava/net/CacheResponse;

    goto :goto_0

    .line 246
    :cond_5
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseSource:Lcom/squareup/okhttp/ResponseSource;

    sget-object v7, Lcom/squareup/okhttp/ResponseSource;->NETWORK:Lcom/squareup/okhttp/ResponseSource;

    if-ne v6, v7, :cond_6

    .line 247
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cachedResponseBody:Ljava/io/InputStream;

    invoke-static {v6}, Lcom/squareup/okhttp/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    goto :goto_0

    .line 249
    :cond_6
    new-instance v6, Ljava/lang/AssertionError;

    invoke-direct {v6}, Ljava/lang/AssertionError;-><init>()V

    throw v6
.end method

.method private maybeCache()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 401
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->policy:Lcom/squareup/okhttp/internal/http/Policy;

    invoke-interface {v2}, Lcom/squareup/okhttp/internal/http/Policy;->getUseCaches()Z

    move-result v2

    if-nez v2, :cond_1

    .line 415
    :cond_0
    :goto_0
    return-void

    .line 402
    :cond_1
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v2}, Lcom/squareup/okhttp/OkHttpClient;->getOkResponseCache()Lcom/squareup/okhttp/OkResponseCache;

    move-result-object v1

    .line 403
    .local v1, "responseCache":Lcom/squareup/okhttp/OkResponseCache;
    if-eqz v1, :cond_0

    .line 405
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->policy:Lcom/squareup/okhttp/internal/http/Policy;

    invoke-interface {v2}, Lcom/squareup/okhttp/internal/http/Policy;->getHttpConnectionToCache()Ljava/net/HttpURLConnection;

    move-result-object v0

    .line 408
    .local v0, "connectionToCache":Ljava/net/HttpURLConnection;
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestHeaders:Lcom/squareup/okhttp/internal/http/RequestHeaders;

    invoke-virtual {v2, v3}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->isCacheable(Lcom/squareup/okhttp/internal/http/RequestHeaders;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 409
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getRequestMethod()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->uri:Ljava/net/URI;

    invoke-interface {v1, v2, v3}, Lcom/squareup/okhttp/OkResponseCache;->maybeRemove(Ljava/lang/String;Ljava/net/URI;)V

    goto :goto_0

    .line 414
    :cond_2
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->uri:Ljava/net/URI;

    invoke-interface {v1, v2, v0}, Lcom/squareup/okhttp/OkResponseCache;->put(Ljava/net/URI;Ljava/net/URLConnection;)Ljava/net/CacheRequest;

    move-result-object v2

    iput-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cacheRequest:Ljava/net/CacheRequest;

    goto :goto_0
.end method

.method private prepareRawRequestHeaders()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 509
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestHeaders:Lcom/squareup/okhttp/internal/http/RequestHeaders;

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->getHeaders()Lcom/squareup/okhttp/internal/http/RawHeaders;

    move-result-object v1

    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getRequestLine()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/squareup/okhttp/internal/http/RawHeaders;->setRequestLine(Ljava/lang/String;)V

    .line 511
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestHeaders:Lcom/squareup/okhttp/internal/http/RequestHeaders;

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->getUserAgent()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    .line 512
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestHeaders:Lcom/squareup/okhttp/internal/http/RequestHeaders;

    invoke-static {}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getDefaultUserAgent()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->setUserAgent(Ljava/lang/String;)V

    .line 515
    :cond_0
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestHeaders:Lcom/squareup/okhttp/internal/http/RequestHeaders;

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->getHost()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    .line 516
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestHeaders:Lcom/squareup/okhttp/internal/http/RequestHeaders;

    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->policy:Lcom/squareup/okhttp/internal/http/Policy;

    invoke-interface {v4}, Lcom/squareup/okhttp/internal/http/Policy;->getURL()Ljava/net/URL;

    move-result-object v4

    invoke-static {v4}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getOriginAddress(Ljava/net/URL;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->setHost(Ljava/lang/String;)V

    .line 519
    :cond_1
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    invoke-virtual {v1}, Lcom/squareup/okhttp/Connection;->getHttpMinorVersion()I

    move-result v1

    if-eqz v1, :cond_3

    :cond_2
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestHeaders:Lcom/squareup/okhttp/internal/http/RequestHeaders;

    .line 520
    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->getConnection()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    .line 521
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestHeaders:Lcom/squareup/okhttp/internal/http/RequestHeaders;

    const-string v4, "Keep-Alive"

    invoke-virtual {v1, v4}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->setConnection(Ljava/lang/String;)V

    .line 524
    :cond_3
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestHeaders:Lcom/squareup/okhttp/internal/http/RequestHeaders;

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->getAcceptEncoding()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    .line 525
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->transparentGzip:Z

    .line 526
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestHeaders:Lcom/squareup/okhttp/internal/http/RequestHeaders;

    const-string v4, "gzip"

    invoke-virtual {v1, v4}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->setAcceptEncoding(Ljava/lang/String;)V

    .line 529
    :cond_4
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->hasRequestBody()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestHeaders:Lcom/squareup/okhttp/internal/http/RequestHeaders;

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->getContentType()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    .line 530
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestHeaders:Lcom/squareup/okhttp/internal/http/RequestHeaders;

    const-string v4, "application/x-www-form-urlencoded"

    invoke-virtual {v1, v4}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->setContentType(Ljava/lang/String;)V

    .line 533
    :cond_5
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->policy:Lcom/squareup/okhttp/internal/http/Policy;

    invoke-interface {v1}, Lcom/squareup/okhttp/internal/http/Policy;->getIfModifiedSince()J

    move-result-wide v2

    .line 534
    .local v2, "ifModifiedSince":J
    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-eqz v1, :cond_6

    .line 535
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestHeaders:Lcom/squareup/okhttp/internal/http/RequestHeaders;

    new-instance v4, Ljava/util/Date;

    invoke-direct {v4, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v4}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->setIfModifiedSince(Ljava/util/Date;)V

    .line 538
    :cond_6
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v1}, Lcom/squareup/okhttp/OkHttpClient;->getCookieHandler()Ljava/net/CookieHandler;

    move-result-object v0

    .line 539
    .local v0, "cookieHandler":Ljava/net/CookieHandler;
    if-eqz v0, :cond_7

    .line 540
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestHeaders:Lcom/squareup/okhttp/internal/http/RequestHeaders;

    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->uri:Ljava/net/URI;

    iget-object v5, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestHeaders:Lcom/squareup/okhttp/internal/http/RequestHeaders;

    .line 541
    invoke-virtual {v5}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->getHeaders()Lcom/squareup/okhttp/internal/http/RawHeaders;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Lcom/squareup/okhttp/internal/http/RawHeaders;->toMultimap(Z)Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Ljava/net/CookieHandler;->get(Ljava/net/URI;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    .line 540
    invoke-virtual {v1, v4}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->addCookies(Ljava/util/Map;)V

    .line 543
    :cond_7
    return-void
.end method

.method public static requestPath(Ljava/net/URL;)Ljava/lang/String;
    .locals 3
    .param p0, "url"    # Ljava/net/URL;

    .prologue
    .line 571
    invoke-virtual {p0}, Ljava/net/URL;->getFile()Ljava/lang/String;

    move-result-object v0

    .line 572
    .local v0, "fileOnly":Ljava/lang/String;
    if-nez v0, :cond_1

    .line 573
    const-string v0, "/"

    .line 577
    .end local v0    # "fileOnly":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object v0

    .line 574
    .restart local v0    # "fileOnly":Ljava/lang/String;
    :cond_1
    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 575
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private requestString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 557
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->policy:Lcom/squareup/okhttp/internal/http/Policy;

    invoke-interface {v1}, Lcom/squareup/okhttp/internal/http/Policy;->getURL()Ljava/net/URL;

    move-result-object v0

    .line 558
    .local v0, "url":Ljava/net/URL;
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->includeAuthorityInRequestLine()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 559
    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v1

    .line 561
    :goto_0
    return-object v1

    :cond_0
    invoke-static {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestPath(Ljava/net/URL;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method

.method private sendSocketRequest()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 254
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    if-nez v0, :cond_0

    .line 255
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->connect()V

    .line 258
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->transport:Lcom/squareup/okhttp/internal/http/Transport;

    if-eqz v0, :cond_1

    .line 259
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 262
    :cond_1
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    invoke-virtual {v0, p0}, Lcom/squareup/okhttp/Connection;->newTransport(Lcom/squareup/okhttp/internal/http/HttpEngine;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/okhttp/internal/http/Transport;

    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->transport:Lcom/squareup/okhttp/internal/http/Transport;

    .line 264
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->hasRequestBody()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestBodyOut:Ljava/io/OutputStream;

    if-nez v0, :cond_2

    .line 267
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->transport:Lcom/squareup/okhttp/internal/http/Transport;

    invoke-interface {v0}, Lcom/squareup/okhttp/internal/http/Transport;->createRequestBody()Ljava/io/OutputStream;

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestBodyOut:Ljava/io/OutputStream;

    .line 269
    :cond_2
    return-void
.end method

.method private setResponse(Lcom/squareup/okhttp/internal/http/ResponseHeaders;Ljava/io/InputStream;)V
    .locals 1
    .param p1, "headers"    # Lcom/squareup/okhttp/internal/http/ResponseHeaders;
    .param p2, "body"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 332
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseBodyIn:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    .line 333
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 335
    :cond_0
    iput-object p1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    .line 336
    if-eqz p2, :cond_1

    .line 337
    invoke-direct {p0, p2}, Lcom/squareup/okhttp/internal/http/HttpEngine;->initContentStream(Ljava/io/InputStream;)V

    .line 339
    :cond_1
    return-void
.end method


# virtual methods
.method protected acceptCacheResponseType(Ljava/net/CacheResponse;)Z
    .locals 1
    .param p1, "cacheResponse"    # Ljava/net/CacheResponse;

    .prologue
    .line 396
    const/4 v0, 0x1

    return v0
.end method

.method public final automaticallyReleaseConnectionToPool()V
    .locals 2

    .prologue
    .line 424
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->automaticallyReleaseConnectionToPool:Z

    .line 425
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connectionReleased:Z

    if-eqz v0, :cond_0

    .line 426
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->getConnectionPool()Lcom/squareup/okhttp/ConnectionPool;

    move-result-object v0

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/ConnectionPool;->recycle(Lcom/squareup/okhttp/Connection;)V

    .line 427
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    .line 429
    :cond_0
    return-void
.end method

.method protected final connect()V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 273
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    if-eqz v2, :cond_1

    .line 305
    :cond_0
    :goto_0
    return-void

    .line 276
    :cond_1
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->routeSelector:Lcom/squareup/okhttp/internal/http/RouteSelector;

    if-nez v2, :cond_4

    .line 277
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->uri:Ljava/net/URI;

    invoke-virtual {v2}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v1

    .line 278
    .local v1, "uriHost":Ljava/lang/String;
    if-nez v1, :cond_2

    .line 279
    new-instance v2, Ljava/net/UnknownHostException;

    iget-object v5, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->uri:Ljava/net/URI;

    invoke-virtual {v5}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v5}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 281
    :cond_2
    const/4 v3, 0x0

    .line 282
    .local v3, "sslSocketFactory":Ljavax/net/ssl/SSLSocketFactory;
    const/4 v4, 0x0

    .line 283
    .local v4, "hostnameVerifier":Ljavax/net/ssl/HostnameVerifier;
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->uri:Ljava/net/URI;

    invoke-virtual {v2}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v2

    const-string v5, "https"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 284
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v2}, Lcom/squareup/okhttp/OkHttpClient;->getSslSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v3

    .line 285
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v2}, Lcom/squareup/okhttp/OkHttpClient;->getHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v4

    .line 287
    :cond_3
    new-instance v0, Lcom/squareup/okhttp/Address;

    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->uri:Ljava/net/URI;

    invoke-static {v2}, Lcom/squareup/okhttp/internal/Util;->getEffectivePort(Ljava/net/URI;)I

    move-result v2

    iget-object v5, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    .line 288
    invoke-virtual {v5}, Lcom/squareup/okhttp/OkHttpClient;->getAuthenticator()Lcom/squareup/okhttp/OkAuthenticator;

    move-result-object v5

    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v6}, Lcom/squareup/okhttp/OkHttpClient;->getProxy()Ljava/net/Proxy;

    move-result-object v6

    iget-object v7, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v7}, Lcom/squareup/okhttp/OkHttpClient;->getTransports()Ljava/util/List;

    move-result-object v7

    invoke-direct/range {v0 .. v7}, Lcom/squareup/okhttp/Address;-><init>(Ljava/lang/String;ILjavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lcom/squareup/okhttp/OkAuthenticator;Ljava/net/Proxy;Ljava/util/List;)V

    .line 289
    .local v0, "address":Lcom/squareup/okhttp/Address;
    new-instance v5, Lcom/squareup/okhttp/internal/http/RouteSelector;

    iget-object v7, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->uri:Ljava/net/URI;

    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v2}, Lcom/squareup/okhttp/OkHttpClient;->getProxySelector()Ljava/net/ProxySelector;

    move-result-object v8

    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    .line 290
    invoke-virtual {v2}, Lcom/squareup/okhttp/OkHttpClient;->getConnectionPool()Lcom/squareup/okhttp/ConnectionPool;

    move-result-object v9

    sget-object v10, Lcom/squareup/okhttp/internal/Dns;->DEFAULT:Lcom/squareup/okhttp/internal/Dns;

    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v2}, Lcom/squareup/okhttp/OkHttpClient;->getRoutesDatabase()Lcom/squareup/okhttp/RouteDatabase;

    move-result-object v11

    move-object v6, v0

    invoke-direct/range {v5 .. v11}, Lcom/squareup/okhttp/internal/http/RouteSelector;-><init>(Lcom/squareup/okhttp/Address;Ljava/net/URI;Ljava/net/ProxySelector;Lcom/squareup/okhttp/ConnectionPool;Lcom/squareup/okhttp/internal/Dns;Lcom/squareup/okhttp/RouteDatabase;)V

    iput-object v5, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->routeSelector:Lcom/squareup/okhttp/internal/http/RouteSelector;

    .line 292
    .end local v0    # "address":Lcom/squareup/okhttp/Address;
    .end local v1    # "uriHost":Ljava/lang/String;
    .end local v3    # "sslSocketFactory":Ljavax/net/ssl/SSLSocketFactory;
    .end local v4    # "hostnameVerifier":Ljavax/net/ssl/HostnameVerifier;
    :cond_4
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->routeSelector:Lcom/squareup/okhttp/internal/http/RouteSelector;

    iget-object v5, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->method:Ljava/lang/String;

    invoke-virtual {v2, v5}, Lcom/squareup/okhttp/internal/http/RouteSelector;->next(Ljava/lang/String;)Lcom/squareup/okhttp/Connection;

    move-result-object v2

    iput-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    .line 293
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    invoke-virtual {v2}, Lcom/squareup/okhttp/Connection;->isConnected()Z

    move-result v2

    if-nez v2, :cond_6

    .line 294
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    iget-object v5, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v5}, Lcom/squareup/okhttp/OkHttpClient;->getConnectTimeout()I

    move-result v5

    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v6}, Lcom/squareup/okhttp/OkHttpClient;->getReadTimeout()I

    move-result v6

    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getTunnelConfig()Lcom/squareup/okhttp/TunnelRequest;

    move-result-object v7

    invoke-virtual {v2, v5, v6, v7}, Lcom/squareup/okhttp/Connection;->connect(IILcom/squareup/okhttp/TunnelRequest;)V

    .line 295
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v2}, Lcom/squareup/okhttp/OkHttpClient;->getConnectionPool()Lcom/squareup/okhttp/ConnectionPool;

    move-result-object v2

    iget-object v5, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    invoke-virtual {v2, v5}, Lcom/squareup/okhttp/ConnectionPool;->maybeShare(Lcom/squareup/okhttp/Connection;)V

    .line 296
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v2}, Lcom/squareup/okhttp/OkHttpClient;->getRoutesDatabase()Lcom/squareup/okhttp/RouteDatabase;

    move-result-object v2

    iget-object v5, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    invoke-virtual {v5}, Lcom/squareup/okhttp/Connection;->getRoute()Lcom/squareup/okhttp/Route;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/squareup/okhttp/RouteDatabase;->connected(Lcom/squareup/okhttp/Route;)V

    .line 300
    :cond_5
    :goto_1
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    invoke-virtual {p0, v2}, Lcom/squareup/okhttp/internal/http/HttpEngine;->connected(Lcom/squareup/okhttp/Connection;)V

    .line 301
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    invoke-virtual {v2}, Lcom/squareup/okhttp/Connection;->getRoute()Lcom/squareup/okhttp/Route;

    move-result-object v2

    invoke-virtual {v2}, Lcom/squareup/okhttp/Route;->getProxy()Ljava/net/Proxy;

    move-result-object v2

    iget-object v5, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v5}, Lcom/squareup/okhttp/OkHttpClient;->getProxy()Ljava/net/Proxy;

    move-result-object v5

    if-eq v2, v5, :cond_0

    .line 303
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestHeaders:Lcom/squareup/okhttp/internal/http/RequestHeaders;

    invoke-virtual {v2}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->getHeaders()Lcom/squareup/okhttp/internal/http/RawHeaders;

    move-result-object v2

    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getRequestLine()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/squareup/okhttp/internal/http/RawHeaders;->setRequestLine(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 297
    :cond_6
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    invoke-virtual {v2}, Lcom/squareup/okhttp/Connection;->isSpdy()Z

    move-result v2

    if-nez v2, :cond_5

    .line 298
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    iget-object v5, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v5}, Lcom/squareup/okhttp/OkHttpClient;->getReadTimeout()I

    move-result v5

    invoke-virtual {v2, v5}, Lcom/squareup/okhttp/Connection;->updateReadTimeout(I)V

    goto :goto_1
.end method

.method protected connected(Lcom/squareup/okhttp/Connection;)V
    .locals 2
    .param p1, "connection"    # Lcom/squareup/okhttp/Connection;

    .prologue
    .line 312
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->policy:Lcom/squareup/okhttp/internal/http/Policy;

    invoke-virtual {p1}, Lcom/squareup/okhttp/Connection;->getRoute()Lcom/squareup/okhttp/Route;

    move-result-object v1

    invoke-virtual {v1}, Lcom/squareup/okhttp/Route;->getProxy()Ljava/net/Proxy;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/squareup/okhttp/internal/http/Policy;->setSelectedProxy(Ljava/net/Proxy;)V

    .line 313
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connected:Z

    .line 314
    return-void
.end method

.method public final getCacheResponse()Ljava/net/CacheResponse;
    .locals 1

    .prologue
    .line 383
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cacheResponse:Ljava/net/CacheResponse;

    return-object v0
.end method

.method public final getConnection()Lcom/squareup/okhttp/Connection;
    .locals 1

    .prologue
    .line 387
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    return-object v0
.end method

.method public final getRequestBody()Ljava/io/OutputStream;
    .locals 1

    .prologue
    .line 347
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseSource:Lcom/squareup/okhttp/ResponseSource;

    if-nez v0, :cond_0

    .line 348
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 350
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestBodyOut:Ljava/io/OutputStream;

    return-object v0
.end method

.method public final getRequestHeaders()Lcom/squareup/okhttp/internal/http/RequestHeaders;
    .locals 1

    .prologue
    .line 358
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestHeaders:Lcom/squareup/okhttp/internal/http/RequestHeaders;

    return-object v0
.end method

.method getRequestLine()Ljava/lang/String;
    .locals 3

    .prologue
    .line 551
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    .line 552
    invoke-virtual {v1}, Lcom/squareup/okhttp/Connection;->getHttpMinorVersion()I

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    const-string v0, "HTTP/1.1"

    .line 553
    .local v0, "protocol":Ljava/lang/String;
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->method:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1

    .line 552
    .end local v0    # "protocol":Ljava/lang/String;
    :cond_1
    const-string v0, "HTTP/1.0"

    goto :goto_0
.end method

.method public final getResponseBody()Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 376
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    if-nez v0, :cond_0

    .line 377
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 379
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseBodyIn:Ljava/io/InputStream;

    return-object v0
.end method

.method public final getResponseCode()I
    .locals 1

    .prologue
    .line 369
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    if-nez v0, :cond_0

    .line 370
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 372
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->getHeaders()Lcom/squareup/okhttp/internal/http/RawHeaders;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/RawHeaders;->getResponseCode()I

    move-result v0

    return v0
.end method

.method public final getResponseHeaders()Lcom/squareup/okhttp/internal/http/ResponseHeaders;
    .locals 1

    .prologue
    .line 362
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    if-nez v0, :cond_0

    .line 363
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 365
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    return-object v0
.end method

.method protected getTunnelConfig()Lcom/squareup/okhttp/TunnelRequest;
    .locals 1

    .prologue
    .line 677
    const/4 v0, 0x0

    return-object v0
.end method

.method public getUri()Ljava/net/URI;
    .locals 1

    .prologue
    .line 171
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->uri:Ljava/net/URI;

    return-object v0
.end method

.method hasRequestBody()Z
    .locals 2

    .prologue
    .line 342
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->method:Ljava/lang/String;

    const-string v1, "POST"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->method:Ljava/lang/String;

    const-string v1, "PUT"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->method:Ljava/lang/String;

    const-string v1, "PATCH"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final hasResponse()Z
    .locals 1

    .prologue
    .line 354
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final hasResponseBody()Z
    .locals 8

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 479
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    invoke-virtual {v3}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->getHeaders()Lcom/squareup/okhttp/internal/http/RawHeaders;

    move-result-object v3

    invoke-virtual {v3}, Lcom/squareup/okhttp/internal/http/RawHeaders;->getResponseCode()I

    move-result v0

    .line 482
    .local v0, "responseCode":I
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->method:Ljava/lang/String;

    const-string v4, "HEAD"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 499
    :cond_0
    :goto_0
    return v1

    .line 486
    :cond_1
    const/16 v3, 0x64

    if-lt v0, v3, :cond_2

    const/16 v3, 0xc8

    if-lt v0, v3, :cond_3

    :cond_2
    const/16 v3, 0xcc

    if-eq v0, v3, :cond_3

    const/16 v3, 0x130

    if-eq v0, v3, :cond_3

    move v1, v2

    .line 489
    goto :goto_0

    .line 495
    :cond_3
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    invoke-virtual {v3}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->getContentLength()J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v3, v4, v6

    if-nez v3, :cond_4

    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    invoke-virtual {v3}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->isChunked()Z

    move-result v3

    if-eqz v3, :cond_0

    :cond_4
    move v1, v2

    .line 496
    goto :goto_0
.end method

.method protected includeAuthorityInRequestLine()Z
    .locals 2

    .prologue
    .line 590
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->policy:Lcom/squareup/okhttp/internal/http/Policy;

    .line 591
    invoke-interface {v0}, Lcom/squareup/okhttp/internal/http/Policy;->usingProxy()Z

    move-result v0

    .line 592
    :goto_0
    return v0

    .line 591
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    .line 592
    invoke-virtual {v0}, Lcom/squareup/okhttp/Connection;->getRoute()Lcom/squareup/okhttp/Route;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/Route;->getProxy()Ljava/net/Proxy;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final readResponse()V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 614
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->hasResponse()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 615
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseSource:Lcom/squareup/okhttp/ResponseSource;

    invoke-virtual {v3, v4}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->setResponseSource(Lcom/squareup/okhttp/ResponseSource;)V

    .line 674
    :cond_0
    :goto_0
    return-void

    .line 619
    :cond_1
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseSource:Lcom/squareup/okhttp/ResponseSource;

    if-nez v3, :cond_2

    .line 620
    new-instance v3, Ljava/lang/IllegalStateException;

    const-string v4, "readResponse() without sendRequest()"

    invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 623
    :cond_2
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseSource:Lcom/squareup/okhttp/ResponseSource;

    invoke-virtual {v3}, Lcom/squareup/okhttp/ResponseSource;->requiresConnection()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 627
    iget-wide v4, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->sentRequestMillis:J

    const-wide/16 v6, -0x1

    cmp-long v3, v4, v6

    if-nez v3, :cond_4

    .line 628
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestBodyOut:Ljava/io/OutputStream;

    instance-of v3, v3, Lcom/squareup/okhttp/internal/http/RetryableOutputStream;

    if-eqz v3, :cond_3

    .line 629
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestBodyOut:Ljava/io/OutputStream;

    check-cast v3, Lcom/squareup/okhttp/internal/http/RetryableOutputStream;

    invoke-virtual {v3}, Lcom/squareup/okhttp/internal/http/RetryableOutputStream;->contentLength()I

    move-result v1

    .line 630
    .local v1, "contentLength":I
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestHeaders:Lcom/squareup/okhttp/internal/http/RequestHeaders;

    int-to-long v4, v1

    invoke-virtual {v3, v4, v5}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->setContentLength(J)V

    .line 632
    .end local v1    # "contentLength":I
    :cond_3
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->transport:Lcom/squareup/okhttp/internal/http/Transport;

    invoke-interface {v3}, Lcom/squareup/okhttp/internal/http/Transport;->writeRequestHeaders()V

    .line 635
    :cond_4
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestBodyOut:Ljava/io/OutputStream;

    if-eqz v3, :cond_5

    .line 636
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestBodyOut:Ljava/io/OutputStream;

    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V

    .line 637
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestBodyOut:Ljava/io/OutputStream;

    instance-of v3, v3, Lcom/squareup/okhttp/internal/http/RetryableOutputStream;

    if-eqz v3, :cond_5

    .line 638
    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->transport:Lcom/squareup/okhttp/internal/http/Transport;

    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestBodyOut:Ljava/io/OutputStream;

    check-cast v3, Lcom/squareup/okhttp/internal/http/RetryableOutputStream;

    invoke-interface {v4, v3}, Lcom/squareup/okhttp/internal/http/Transport;->writeRequestBody(Lcom/squareup/okhttp/internal/http/RetryableOutputStream;)V

    .line 642
    :cond_5
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->transport:Lcom/squareup/okhttp/internal/http/Transport;

    invoke-interface {v3}, Lcom/squareup/okhttp/internal/http/Transport;->flushRequest()V

    .line 644
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->transport:Lcom/squareup/okhttp/internal/http/Transport;

    invoke-interface {v3}, Lcom/squareup/okhttp/internal/http/Transport;->readResponseHeaders()Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    move-result-object v3

    iput-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    .line 645
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    iget-wide v4, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->sentRequestMillis:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-virtual {v3, v4, v5, v6, v7}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->setLocalTimestamps(JJ)V

    .line 646
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseSource:Lcom/squareup/okhttp/ResponseSource;

    invoke-virtual {v3, v4}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->setResponseSource(Lcom/squareup/okhttp/ResponseSource;)V

    .line 648
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseSource:Lcom/squareup/okhttp/ResponseSource;

    sget-object v4, Lcom/squareup/okhttp/ResponseSource;->CONDITIONAL_CACHE:Lcom/squareup/okhttp/ResponseSource;

    if-ne v3, v4, :cond_7

    .line 649
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cachedResponseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    invoke-virtual {v3, v4}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->validate(Lcom/squareup/okhttp/internal/http/ResponseHeaders;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 650
    const/4 v3, 0x0

    invoke-virtual {p0, v3}, Lcom/squareup/okhttp/internal/http/HttpEngine;->release(Z)V

    .line 651
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cachedResponseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    invoke-virtual {v3, v4}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->combine(Lcom/squareup/okhttp/internal/http/ResponseHeaders;)Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    move-result-object v0

    .line 652
    .local v0, "combinedHeaders":Lcom/squareup/okhttp/internal/http/ResponseHeaders;
    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    .line 658
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v3}, Lcom/squareup/okhttp/OkHttpClient;->getOkResponseCache()Lcom/squareup/okhttp/OkResponseCache;

    move-result-object v2

    .line 659
    .local v2, "responseCache":Lcom/squareup/okhttp/OkResponseCache;
    invoke-interface {v2}, Lcom/squareup/okhttp/OkResponseCache;->trackConditionalCacheHit()V

    .line 660
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cacheResponse:Ljava/net/CacheResponse;

    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->policy:Lcom/squareup/okhttp/internal/http/Policy;

    invoke-interface {v4}, Lcom/squareup/okhttp/internal/http/Policy;->getHttpConnectionToCache()Ljava/net/HttpURLConnection;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lcom/squareup/okhttp/OkResponseCache;->update(Ljava/net/CacheResponse;Ljava/net/HttpURLConnection;)V

    .line 662
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cachedResponseBody:Ljava/io/InputStream;

    invoke-direct {p0, v3}, Lcom/squareup/okhttp/internal/http/HttpEngine;->initContentStream(Ljava/io/InputStream;)V

    goto/16 :goto_0

    .line 665
    .end local v0    # "combinedHeaders":Lcom/squareup/okhttp/internal/http/ResponseHeaders;
    .end local v2    # "responseCache":Lcom/squareup/okhttp/OkResponseCache;
    :cond_6
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cachedResponseBody:Ljava/io/InputStream;

    invoke-static {v3}, Lcom/squareup/okhttp/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    .line 669
    :cond_7
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->hasResponseBody()Z

    move-result v3

    if-eqz v3, :cond_8

    .line 670
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->maybeCache()V

    .line 673
    :cond_8
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->transport:Lcom/squareup/okhttp/internal/http/Transport;

    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cacheRequest:Ljava/net/CacheRequest;

    invoke-interface {v3, v4}, Lcom/squareup/okhttp/internal/http/Transport;->getTransferStream(Ljava/net/CacheRequest;)Ljava/io/InputStream;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/squareup/okhttp/internal/http/HttpEngine;->initContentStream(Ljava/io/InputStream;)V

    goto/16 :goto_0
.end method

.method public receiveHeaders(Lcom/squareup/okhttp/internal/http/RawHeaders;)V
    .locals 3
    .param p1, "headers"    # Lcom/squareup/okhttp/internal/http/RawHeaders;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 681
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v1}, Lcom/squareup/okhttp/OkHttpClient;->getCookieHandler()Ljava/net/CookieHandler;

    move-result-object v0

    .line 682
    .local v0, "cookieHandler":Ljava/net/CookieHandler;
    if-eqz v0, :cond_0

    .line 683
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->uri:Ljava/net/URI;

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Lcom/squareup/okhttp/internal/http/RawHeaders;->toMultimap(Z)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/net/CookieHandler;->put(Ljava/net/URI;Ljava/util/Map;)V

    .line 685
    :cond_0
    return-void
.end method

.method public final release(Z)V
    .locals 4
    .param p1, "streamCanceled"    # Z

    .prologue
    const/4 v3, 0x0

    .line 438
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseBodyIn:Ljava/io/InputStream;

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cachedResponseBody:Ljava/io/InputStream;

    if-ne v0, v1, :cond_0

    .line 439
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseBodyIn:Ljava/io/InputStream;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    .line 442
    :cond_0
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connectionReleased:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    if-eqz v0, :cond_2

    .line 443
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connectionReleased:Z

    .line 445
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->transport:Lcom/squareup/okhttp/internal/http/Transport;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->transport:Lcom/squareup/okhttp/internal/http/Transport;

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestBodyOut:Ljava/io/OutputStream;

    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseTransferIn:Ljava/io/InputStream;

    .line 446
    invoke-interface {v0, p1, v1, v2}, Lcom/squareup/okhttp/internal/http/Transport;->makeReusable(ZLjava/io/OutputStream;Ljava/io/InputStream;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 447
    :cond_1
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    .line 448
    iput-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    .line 454
    :cond_2
    :goto_0
    return-void

    .line 449
    :cond_3
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->automaticallyReleaseConnectionToPool:Z

    if-eqz v0, :cond_2

    .line 450
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->getConnectionPool()Lcom/squareup/okhttp/ConnectionPool;

    move-result-object v0

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/ConnectionPool;->recycle(Lcom/squareup/okhttp/Connection;)V

    .line 451
    iput-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    goto :goto_0
.end method

.method public final sendRequest()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 180
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseSource:Lcom/squareup/okhttp/ResponseSource;

    if-eqz v2, :cond_1

    .line 211
    :cond_0
    :goto_0
    return-void

    .line 184
    :cond_1
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->prepareRawRequestHeaders()V

    .line 185
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->initResponseSource()V

    .line 186
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v2}, Lcom/squareup/okhttp/OkHttpClient;->getOkResponseCache()Lcom/squareup/okhttp/OkResponseCache;

    move-result-object v1

    .line 187
    .local v1, "responseCache":Lcom/squareup/okhttp/OkResponseCache;
    if-eqz v1, :cond_2

    .line 188
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseSource:Lcom/squareup/okhttp/ResponseSource;

    invoke-interface {v1, v2}, Lcom/squareup/okhttp/OkResponseCache;->trackResponse(Lcom/squareup/okhttp/ResponseSource;)V

    .line 195
    :cond_2
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestHeaders:Lcom/squareup/okhttp/internal/http/RequestHeaders;

    invoke-virtual {v2}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->isOnlyIfCached()Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseSource:Lcom/squareup/okhttp/ResponseSource;

    invoke-virtual {v2}, Lcom/squareup/okhttp/ResponseSource;->requiresConnection()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 196
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseSource:Lcom/squareup/okhttp/ResponseSource;

    sget-object v3, Lcom/squareup/okhttp/ResponseSource;->CONDITIONAL_CACHE:Lcom/squareup/okhttp/ResponseSource;

    if-ne v2, v3, :cond_3

    .line 197
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cachedResponseBody:Ljava/io/InputStream;

    invoke-static {v2}, Lcom/squareup/okhttp/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    .line 199
    :cond_3
    sget-object v2, Lcom/squareup/okhttp/ResponseSource;->CACHE:Lcom/squareup/okhttp/ResponseSource;

    iput-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseSource:Lcom/squareup/okhttp/ResponseSource;

    .line 200
    sget-object v2, Lcom/squareup/okhttp/internal/http/HttpEngine;->GATEWAY_TIMEOUT_RESPONSE:Ljava/net/CacheResponse;

    iput-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cacheResponse:Ljava/net/CacheResponse;

    .line 201
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cacheResponse:Ljava/net/CacheResponse;

    invoke-virtual {v2}, Ljava/net/CacheResponse;->getHeaders()Ljava/util/Map;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v2, v3}, Lcom/squareup/okhttp/internal/http/RawHeaders;->fromMultimap(Ljava/util/Map;Z)Lcom/squareup/okhttp/internal/http/RawHeaders;

    move-result-object v0

    .line 202
    .local v0, "rawResponseHeaders":Lcom/squareup/okhttp/internal/http/RawHeaders;
    new-instance v2, Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->uri:Ljava/net/URI;

    invoke-direct {v2, v3, v0}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;-><init>(Ljava/net/URI;Lcom/squareup/okhttp/internal/http/RawHeaders;)V

    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->cacheResponse:Ljava/net/CacheResponse;

    invoke-virtual {v3}, Ljava/net/CacheResponse;->getBody()Ljava/io/InputStream;

    move-result-object v3

    invoke-direct {p0, v2, v3}, Lcom/squareup/okhttp/internal/http/HttpEngine;->setResponse(Lcom/squareup/okhttp/internal/http/ResponseHeaders;Ljava/io/InputStream;)V

    .line 205
    .end local v0    # "rawResponseHeaders":Lcom/squareup/okhttp/internal/http/RawHeaders;
    :cond_4
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseSource:Lcom/squareup/okhttp/ResponseSource;

    invoke-virtual {v2}, Lcom/squareup/okhttp/ResponseSource;->requiresConnection()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 206
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->sendSocketRequest()V

    goto :goto_0

    .line 207
    :cond_5
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    if-eqz v2, :cond_0

    .line 208
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v2}, Lcom/squareup/okhttp/OkHttpClient;->getConnectionPool()Lcom/squareup/okhttp/ConnectionPool;

    move-result-object v2

    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    invoke-virtual {v2, v3}, Lcom/squareup/okhttp/ConnectionPool;->recycle(Lcom/squareup/okhttp/Connection;)V

    .line 209
    const/4 v2, 0x0

    iput-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    goto :goto_0
.end method

.method public writingRequestHeaders()V
    .locals 4

    .prologue
    .line 321
    iget-wide v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->sentRequestMillis:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 322
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 324
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->sentRequestMillis:J

    .line 325
    return-void
.end method
