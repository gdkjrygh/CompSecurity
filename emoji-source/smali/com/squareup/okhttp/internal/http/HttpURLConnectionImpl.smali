.class public Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;
.super Ljava/net/HttpURLConnection;
.source "HttpURLConnectionImpl.java"

# interfaces
.implements Lcom/squareup/okhttp/internal/http/Policy;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl$Retry;
    }
.end annotation


# static fields
.field public static final HTTP_TEMP_REDIRECT:I = 0x133

.field private static final MAX_REDIRECTS:I = 0x14


# instance fields
.field final client:Lcom/squareup/okhttp/OkHttpClient;

.field private fixedContentLength:J

.field protected httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

.field protected httpEngineFailure:Ljava/io/IOException;

.field private final rawRequestHeaders:Lcom/squareup/okhttp/internal/http/RawHeaders;

.field private redirectionCount:I

.field private selectedProxy:Ljava/net/Proxy;


# direct methods
.method public constructor <init>(Ljava/net/URL;Lcom/squareup/okhttp/OkHttpClient;)V
    .locals 2
    .param p1, "url"    # Ljava/net/URL;
    .param p2, "client"    # Lcom/squareup/okhttp/OkHttpClient;

    .prologue
    .line 82
    invoke-direct {p0, p1}, Ljava/net/HttpURLConnection;-><init>(Ljava/net/URL;)V

    .line 73
    new-instance v0, Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-direct {v0}, Lcom/squareup/okhttp/internal/http/RawHeaders;-><init>()V

    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->rawRequestHeaders:Lcom/squareup/okhttp/internal/http/RawHeaders;

    .line 75
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->fixedContentLength:J

    .line 83
    iput-object p2, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->client:Lcom/squareup/okhttp/OkHttpClient;

    .line 84
    return-void
.end method

.method private execute(Z)Z
    .locals 2
    .param p1, "readResponse"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 350
    :try_start_0
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->sendRequest()V

    .line 351
    if-eqz p1, :cond_0

    .line 352
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->readResponse()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 355
    :cond_0
    const/4 v1, 0x1

    .line 358
    :goto_0
    return v1

    .line 356
    :catch_0
    move-exception v0

    .line 357
    .local v0, "e":Ljava/io/IOException;
    invoke-direct {p0, v0}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->handleFailure(Ljava/io/IOException;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 358
    const/4 v1, 0x0

    goto :goto_0

    .line 360
    :cond_1
    throw v0
.end method

.method private getResponse()Lcom/squareup/okhttp/internal/http/HttpEngine;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 290
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->initHttpEngine()V

    .line 292
    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v4}, Lcom/squareup/okhttp/internal/http/HttpEngine;->hasResponse()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 293
    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    .line 304
    :goto_0
    return-object v4

    .line 297
    :cond_0
    :goto_1
    const/4 v4, 0x1

    invoke-direct {p0, v4}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->execute(Z)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 301
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->processResponseHeaders()Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl$Retry;

    move-result-object v2

    .line 302
    .local v2, "retry":Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl$Retry;
    sget-object v4, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl$Retry;->NONE:Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl$Retry;

    if-ne v2, v4, :cond_1

    .line 303
    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v4}, Lcom/squareup/okhttp/internal/http/HttpEngine;->automaticallyReleaseConnectionToPool()V

    .line 304
    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    goto :goto_0

    .line 308
    :cond_1
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->method:Ljava/lang/String;

    .line 309
    .local v3, "retryMethod":Ljava/lang/String;
    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v4}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getRequestBody()Ljava/io/OutputStream;

    move-result-object v0

    .line 314
    .local v0, "requestBody":Ljava/io/OutputStream;
    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v4}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getResponseCode()I

    move-result v1

    .line 315
    .local v1, "responseCode":I
    const/16 v4, 0x12c

    if-eq v1, v4, :cond_2

    const/16 v4, 0x12d

    if-eq v1, v4, :cond_2

    const/16 v4, 0x12e

    if-eq v1, v4, :cond_2

    const/16 v4, 0x12f

    if-ne v1, v4, :cond_3

    .line 319
    :cond_2
    const-string v3, "GET"

    .line 320
    const/4 v0, 0x0

    .line 323
    :cond_3
    if-eqz v0, :cond_4

    instance-of v4, v0, Lcom/squareup/okhttp/internal/http/RetryableOutputStream;

    if-nez v4, :cond_4

    .line 324
    new-instance v4, Ljava/net/HttpRetryException;

    const-string v5, "Cannot retry streamed HTTP body"

    invoke-direct {v4, v5, v1}, Ljava/net/HttpRetryException;-><init>(Ljava/lang/String;I)V

    throw v4

    .line 327
    :cond_4
    sget-object v4, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl$Retry;->DIFFERENT_CONNECTION:Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl$Retry;

    if-ne v2, v4, :cond_5

    .line 328
    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v4}, Lcom/squareup/okhttp/internal/http/HttpEngine;->automaticallyReleaseConnectionToPool()V

    .line 331
    :cond_5
    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Lcom/squareup/okhttp/internal/http/HttpEngine;->release(Z)V

    .line 333
    iget-object v5, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->rawRequestHeaders:Lcom/squareup/okhttp/internal/http/RawHeaders;

    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v4}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getConnection()Lcom/squareup/okhttp/Connection;

    move-result-object v6

    move-object v4, v0

    check-cast v4, Lcom/squareup/okhttp/internal/http/RetryableOutputStream;

    invoke-direct {p0, v3, v5, v6, v4}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->newHttpEngine(Ljava/lang/String;Lcom/squareup/okhttp/internal/http/RawHeaders;Lcom/squareup/okhttp/Connection;Lcom/squareup/okhttp/internal/http/RetryableOutputStream;)Lcom/squareup/okhttp/internal/http/HttpEngine;

    move-result-object v4

    iput-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    .line 336
    if-nez v0, :cond_0

    .line 338
    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v4}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getRequestHeaders()Lcom/squareup/okhttp/internal/http/RequestHeaders;

    move-result-object v4

    invoke-virtual {v4}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->removeContentLength()V

    goto :goto_1
.end method

.method private handleFailure(Ljava/io/IOException;)Z
    .locals 8
    .param p1, "e"    # Ljava/io/IOException;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    const/4 v5, 0x1

    .line 371
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v3, v6, Lcom/squareup/okhttp/internal/http/HttpEngine;->routeSelector:Lcom/squareup/okhttp/internal/http/RouteSelector;

    .line 372
    .local v3, "routeSelector":Lcom/squareup/okhttp/internal/http/RouteSelector;
    if-eqz v3, :cond_0

    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v6, v6, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    if-eqz v6, :cond_0

    .line 373
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v6, v6, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    invoke-virtual {v3, v6, p1}, Lcom/squareup/okhttp/internal/http/RouteSelector;->connectFailed(Lcom/squareup/okhttp/Connection;Ljava/io/IOException;)V

    .line 376
    :cond_0
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v6}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getRequestBody()Ljava/io/OutputStream;

    move-result-object v1

    .line 377
    .local v1, "requestBody":Ljava/io/OutputStream;
    if-eqz v1, :cond_1

    instance-of v6, v1, Lcom/squareup/okhttp/internal/http/RetryableOutputStream;

    if-eqz v6, :cond_5

    :cond_1
    move v0, v5

    .line 379
    .local v0, "canRetryRequestBody":Z
    :goto_0
    if-nez v3, :cond_2

    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v6, v6, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    if-eqz v6, :cond_4

    :cond_2
    if-eqz v3, :cond_3

    .line 380
    invoke-virtual {v3}, Lcom/squareup/okhttp/internal/http/RouteSelector;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 381
    :cond_3
    invoke-direct {p0, p1}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->isRecoverable(Ljava/io/IOException;)Z

    move-result v6

    if-eqz v6, :cond_4

    if-nez v0, :cond_6

    .line 383
    :cond_4
    iput-object p1, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngineFailure:Ljava/io/IOException;

    .line 391
    :goto_1
    return v4

    .end local v0    # "canRetryRequestBody":Z
    :cond_5
    move v0, v4

    .line 377
    goto :goto_0

    .line 387
    .restart local v0    # "canRetryRequestBody":Z
    :cond_6
    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v4, v5}, Lcom/squareup/okhttp/internal/http/HttpEngine;->release(Z)V

    move-object v2, v1

    .line 388
    check-cast v2, Lcom/squareup/okhttp/internal/http/RetryableOutputStream;

    .line 389
    .local v2, "retryableOutputStream":Lcom/squareup/okhttp/internal/http/RetryableOutputStream;
    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->method:Ljava/lang/String;

    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->rawRequestHeaders:Lcom/squareup/okhttp/internal/http/RawHeaders;

    const/4 v7, 0x0

    invoke-direct {p0, v4, v6, v7, v2}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->newHttpEngine(Ljava/lang/String;Lcom/squareup/okhttp/internal/http/RawHeaders;Lcom/squareup/okhttp/Connection;Lcom/squareup/okhttp/internal/http/RetryableOutputStream;)Lcom/squareup/okhttp/internal/http/HttpEngine;

    move-result-object v4

    iput-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    .line 390
    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iput-object v3, v4, Lcom/squareup/okhttp/internal/http/HttpEngine;->routeSelector:Lcom/squareup/okhttp/internal/http/RouteSelector;

    move v4, v5

    .line 391
    goto :goto_1
.end method

.method private initHttpEngine()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 245
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngineFailure:Ljava/io/IOException;

    if-eqz v1, :cond_0

    .line 246
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngineFailure:Ljava/io/IOException;

    throw v1

    .line 247
    :cond_0
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    if-eqz v1, :cond_1

    .line 267
    :goto_0
    return-void

    .line 251
    :cond_1
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->connected:Z

    .line 253
    :try_start_0
    iget-boolean v1, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->doOutput:Z

    if-eqz v1, :cond_2

    .line 254
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->method:Ljava/lang/String;

    const-string v2, "GET"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 256
    const-string v1, "POST"

    iput-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->method:Ljava/lang/String;

    .line 262
    :cond_2
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->method:Ljava/lang/String;

    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->rawRequestHeaders:Lcom/squareup/okhttp/internal/http/RawHeaders;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {p0, v1, v2, v3, v4}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->newHttpEngine(Ljava/lang/String;Lcom/squareup/okhttp/internal/http/RawHeaders;Lcom/squareup/okhttp/Connection;Lcom/squareup/okhttp/internal/http/RetryableOutputStream;)Lcom/squareup/okhttp/internal/http/HttpEngine;

    move-result-object v1

    iput-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 263
    :catch_0
    move-exception v0

    .line 264
    .local v0, "e":Ljava/io/IOException;
    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngineFailure:Ljava/io/IOException;

    .line 265
    throw v0

    .line 257
    .end local v0    # "e":Ljava/io/IOException;
    :cond_3
    :try_start_1
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->method:Ljava/lang/String;

    const-string v2, "POST"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->method:Ljava/lang/String;

    const-string v2, "PUT"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->method:Ljava/lang/String;

    const-string v2, "PATCH"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 259
    new-instance v1, Ljava/net/ProtocolException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->method:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " does not support writing"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
.end method

.method private isRecoverable(Ljava/io/IOException;)Z
    .locals 5
    .param p1, "e"    # Ljava/io/IOException;

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 397
    instance-of v4, p1, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz v4, :cond_0

    .line 398
    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    instance-of v4, v4, Ljava/security/cert/CertificateException;

    if-eqz v4, :cond_0

    move v1, v2

    .line 399
    .local v1, "sslFailure":Z
    :goto_0
    instance-of v0, p1, Ljava/net/ProtocolException;

    .line 400
    .local v0, "protocolFailure":Z
    if-nez v1, :cond_1

    if-nez v0, :cond_1

    :goto_1
    return v2

    .end local v0    # "protocolFailure":Z
    .end local v1    # "sslFailure":Z
    :cond_0
    move v1, v3

    .line 398
    goto :goto_0

    .restart local v0    # "protocolFailure":Z
    .restart local v1    # "sslFailure":Z
    :cond_1
    move v2, v3

    .line 400
    goto :goto_1
.end method

.method private static isValidNonDirectProxy(Ljava/net/Proxy;)Z
    .locals 2
    .param p0, "proxy"    # Ljava/net/Proxy;

    .prologue
    .line 500
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private newHttpEngine(Ljava/lang/String;Lcom/squareup/okhttp/internal/http/RawHeaders;Lcom/squareup/okhttp/Connection;Lcom/squareup/okhttp/internal/http/RetryableOutputStream;)Lcom/squareup/okhttp/internal/http/HttpEngine;
    .locals 7
    .param p1, "method"    # Ljava/lang/String;
    .param p2, "requestHeaders"    # Lcom/squareup/okhttp/internal/http/RawHeaders;
    .param p3, "connection"    # Lcom/squareup/okhttp/Connection;
    .param p4, "requestBody"    # Lcom/squareup/okhttp/internal/http/RetryableOutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 275
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->url:Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v0

    const-string v1, "http"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 276
    new-instance v0, Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->client:Lcom/squareup/okhttp/OkHttpClient;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/squareup/okhttp/internal/http/HttpEngine;-><init>(Lcom/squareup/okhttp/OkHttpClient;Lcom/squareup/okhttp/internal/http/Policy;Ljava/lang/String;Lcom/squareup/okhttp/internal/http/RawHeaders;Lcom/squareup/okhttp/Connection;Lcom/squareup/okhttp/internal/http/RetryableOutputStream;)V

    .line 278
    :goto_0
    return-object v0

    .line 277
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->url:Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v0

    const-string v1, "https"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 278
    new-instance v0, Lcom/squareup/okhttp/internal/http/HttpsEngine;

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->client:Lcom/squareup/okhttp/OkHttpClient;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/squareup/okhttp/internal/http/HttpsEngine;-><init>(Lcom/squareup/okhttp/OkHttpClient;Lcom/squareup/okhttp/internal/http/Policy;Ljava/lang/String;Lcom/squareup/okhttp/internal/http/RawHeaders;Lcom/squareup/okhttp/Connection;Lcom/squareup/okhttp/internal/http/RetryableOutputStream;)V

    goto :goto_0

    .line 280
    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method private processResponseHeaders()Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl$Retry;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 419
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v0, v0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v0, v0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    .line 420
    invoke-virtual {v0}, Lcom/squareup/okhttp/Connection;->getRoute()Lcom/squareup/okhttp/Route;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/Route;->getProxy()Ljava/net/Proxy;

    move-result-object v4

    .line 422
    .local v4, "selectedProxy":Ljava/net/Proxy;
    :goto_0
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->getResponseCode()I

    move-result v9

    .line 423
    .local v9, "responseCode":I
    sparse-switch v9, :sswitch_data_0

    .line 473
    sget-object v0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl$Retry;->NONE:Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl$Retry;

    :goto_1
    return-object v0

    .line 420
    .end local v4    # "selectedProxy":Ljava/net/Proxy;
    .end local v9    # "responseCode":I
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->client:Lcom/squareup/okhttp/OkHttpClient;

    .line 421
    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->getProxy()Ljava/net/Proxy;

    move-result-object v4

    goto :goto_0

    .line 425
    .restart local v4    # "selectedProxy":Ljava/net/Proxy;
    .restart local v9    # "responseCode":I
    :sswitch_0
    invoke-virtual {v4}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-eq v0, v1, :cond_1

    .line 426
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 430
    :cond_1
    :sswitch_1
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->getAuthenticator()Lcom/squareup/okhttp/OkAuthenticator;

    move-result-object v0

    .line 431
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->getResponseCode()I

    move-result v1

    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v2}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getResponseHeaders()Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    move-result-object v2

    invoke-virtual {v2}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->getHeaders()Lcom/squareup/okhttp/internal/http/RawHeaders;

    move-result-object v2

    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->rawRequestHeaders:Lcom/squareup/okhttp/internal/http/RawHeaders;

    iget-object v5, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->url:Ljava/net/URL;

    .line 430
    invoke-static/range {v0 .. v5}, Lcom/squareup/okhttp/internal/http/HttpAuthenticator;->processAuthHeader(Lcom/squareup/okhttp/OkAuthenticator;ILcom/squareup/okhttp/internal/http/RawHeaders;Lcom/squareup/okhttp/internal/http/RawHeaders;Ljava/net/Proxy;Ljava/net/URL;)Z

    move-result v6

    .line 433
    .local v6, "credentialsFound":Z
    if-eqz v6, :cond_2

    sget-object v0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl$Retry;->SAME_CONNECTION:Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl$Retry;

    goto :goto_1

    :cond_2
    sget-object v0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl$Retry;->NONE:Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl$Retry;

    goto :goto_1

    .line 440
    .end local v6    # "credentialsFound":Z
    :sswitch_2
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->getInstanceFollowRedirects()Z

    move-result v0

    if-nez v0, :cond_3

    .line 441
    sget-object v0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl$Retry;->NONE:Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl$Retry;

    goto :goto_1

    .line 443
    :cond_3
    iget v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->redirectionCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->redirectionCount:I

    const/16 v1, 0x14

    if-le v0, v1, :cond_4

    .line 444
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Too many redirects: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->redirectionCount:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 446
    :cond_4
    const/16 v0, 0x133

    if-ne v9, v0, :cond_5

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->method:Ljava/lang/String;

    const-string v1, "GET"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->method:Ljava/lang/String;

    const-string v1, "HEAD"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 449
    sget-object v0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl$Retry;->NONE:Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl$Retry;

    goto/16 :goto_1

    .line 451
    :cond_5
    const-string v0, "Location"

    invoke-virtual {p0, v0}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 452
    .local v7, "location":Ljava/lang/String;
    if-nez v7, :cond_6

    .line 453
    sget-object v0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl$Retry;->NONE:Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl$Retry;

    goto/16 :goto_1

    .line 455
    :cond_6
    iget-object v8, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->url:Ljava/net/URL;

    .line 456
    .local v8, "previousUrl":Ljava/net/URL;
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, v8, v7}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->url:Ljava/net/URL;

    .line 457
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->url:Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v0

    const-string v1, "https"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->url:Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v0

    const-string v1, "http"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 458
    sget-object v0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl$Retry;->NONE:Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl$Retry;

    goto/16 :goto_1

    .line 460
    :cond_7
    invoke-virtual {v8}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->url:Ljava/net/URL;

    invoke-virtual {v1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    .line 461
    .local v12, "sameProtocol":Z
    if-nez v12, :cond_8

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->getFollowProtocolRedirects()Z

    move-result v0

    if-nez v0, :cond_8

    .line 462
    sget-object v0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl$Retry;->NONE:Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl$Retry;

    goto/16 :goto_1

    .line 464
    :cond_8
    invoke-virtual {v8}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->url:Ljava/net/URL;

    invoke-virtual {v1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    .line 465
    .local v10, "sameHost":Z
    invoke-static {v8}, Lcom/squareup/okhttp/internal/Util;->getEffectivePort(Ljava/net/URL;)I

    move-result v0

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->url:Ljava/net/URL;

    invoke-static {v1}, Lcom/squareup/okhttp/internal/Util;->getEffectivePort(Ljava/net/URL;)I

    move-result v1

    if-ne v0, v1, :cond_9

    const/4 v11, 0x1

    .line 466
    .local v11, "samePort":Z
    :goto_2
    if-eqz v10, :cond_a

    if-eqz v11, :cond_a

    if-eqz v12, :cond_a

    .line 467
    sget-object v0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl$Retry;->SAME_CONNECTION:Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl$Retry;

    goto/16 :goto_1

    .line 465
    .end local v11    # "samePort":Z
    :cond_9
    const/4 v11, 0x0

    goto :goto_2

    .line 469
    .restart local v11    # "samePort":Z
    :cond_a
    sget-object v0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl$Retry;->DIFFERENT_CONNECTION:Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl$Retry;

    goto/16 :goto_1

    .line 423
    nop

    :sswitch_data_0
    .sparse-switch
        0x12c -> :sswitch_2
        0x12d -> :sswitch_2
        0x12e -> :sswitch_2
        0x12f -> :sswitch_2
        0x133 -> :sswitch_2
        0x191 -> :sswitch_1
        0x197 -> :sswitch_0
    .end sparse-switch
.end method

.method private setTransports(Ljava/lang/String;Z)V
    .locals 5
    .param p1, "transportsString"    # Ljava/lang/String;
    .param p2, "append"    # Z

    .prologue
    .line 564
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 565
    .local v1, "transportsList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    if-eqz p2, :cond_0

    .line 566
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v2}, Lcom/squareup/okhttp/OkHttpClient;->getTransports()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 568
    :cond_0
    const-string v2, ","

    const/4 v3, -0x1

    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v3

    array-length v4, v3

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v4, :cond_1

    aget-object v0, v3, v2

    .line 569
    .local v0, "transport":Ljava/lang/String;
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 568
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 571
    .end local v0    # "transport":Ljava/lang/String;
    :cond_1
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v2, v1}, Lcom/squareup/okhttp/OkHttpClient;->setTransports(Ljava/util/List;)Lcom/squareup/okhttp/OkHttpClient;

    .line 572
    return-void
.end method


# virtual methods
.method public final addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1, "field"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 536
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->connected:Z

    if-eqz v0, :cond_0

    .line 537
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot add request property after connection is made"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 539
    :cond_0
    if-nez p1, :cond_1

    .line 540
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "field == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 542
    :cond_1
    if-nez p2, :cond_2

    .line 548
    invoke-static {}, Lcom/squareup/okhttp/internal/Platform;->get()Lcom/squareup/okhttp/internal/Platform;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Ignoring header "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " because its value was null."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/internal/Platform;->logW(Ljava/lang/String;)V

    .line 557
    :goto_0
    return-void

    .line 552
    :cond_2
    const-string v0, "X-Android-Transports"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 553
    const/4 v0, 0x1

    invoke-direct {p0, p2, v0}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->setTransports(Ljava/lang/String;Z)V

    goto :goto_0

    .line 555
    :cond_3
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->rawRequestHeaders:Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/okhttp/internal/http/RawHeaders;->add(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final connect()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 87
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->initHttpEngine()V

    .line 90
    :cond_0
    const/4 v1, 0x0

    invoke-direct {p0, v1}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->execute(Z)Z

    move-result v0

    .line 91
    .local v0, "success":Z
    if-eqz v0, :cond_0

    .line 92
    return-void
.end method

.method public final disconnect()V
    .locals 2

    .prologue
    .line 96
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    if-eqz v0, :cond_1

    .line 102
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->hasResponse()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 103
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getResponseBody()Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/okhttp/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    .line 105
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->release(Z)V

    .line 107
    :cond_1
    return-void
.end method

.method public final getChunkLength()I
    .locals 1

    .prologue
    .line 483
    iget v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->chunkLength:I

    return v0
.end method

.method public getConnectTimeout()I
    .locals 1

    .prologue
    .line 233
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->getConnectTimeout()I

    move-result v0

    return v0
.end method

.method public final getErrorStream()Ljava/io/InputStream;
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 115
    :try_start_0
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->getResponse()Lcom/squareup/okhttp/internal/http/HttpEngine;

    move-result-object v1

    .line 116
    .local v1, "response":Lcom/squareup/okhttp/internal/http/HttpEngine;
    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->hasResponseBody()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getResponseCode()I

    move-result v3

    const/16 v4, 0x190

    if-lt v3, v4, :cond_0

    .line 117
    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getResponseBody()Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 121
    .end local v1    # "response":Lcom/squareup/okhttp/internal/http/HttpEngine;
    :cond_0
    :goto_0
    return-object v2

    .line 120
    :catch_0
    move-exception v0

    .line 121
    .local v0, "e":Ljava/io/IOException;
    goto :goto_0
.end method

.method public final getFixedContentLength()J
    .locals 2

    .prologue
    .line 479
    iget-wide v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->fixedContentLength:J

    return-wide v0
.end method

.method public final getHeaderField(I)Ljava/lang/String;
    .locals 2
    .param p1, "position"    # I

    .prologue
    .line 131
    :try_start_0
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->getResponse()Lcom/squareup/okhttp/internal/http/HttpEngine;

    move-result-object v1

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getResponseHeaders()Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    move-result-object v1

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->getHeaders()Lcom/squareup/okhttp/internal/http/RawHeaders;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/squareup/okhttp/internal/http/RawHeaders;->getValue(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 133
    :goto_0
    return-object v1

    .line 132
    :catch_0
    move-exception v0

    .line 133
    .local v0, "e":Ljava/io/IOException;
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public final getHeaderField(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "fieldName"    # Ljava/lang/String;

    .prologue
    .line 144
    :try_start_0
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->getResponse()Lcom/squareup/okhttp/internal/http/HttpEngine;

    move-result-object v2

    invoke-virtual {v2}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getResponseHeaders()Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    move-result-object v2

    invoke-virtual {v2}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->getHeaders()Lcom/squareup/okhttp/internal/http/RawHeaders;

    move-result-object v1

    .line 145
    .local v1, "rawHeaders":Lcom/squareup/okhttp/internal/http/RawHeaders;
    if-nez p1, :cond_0

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/RawHeaders;->getStatusLine()Ljava/lang/String;

    move-result-object v2

    .line 147
    .end local v1    # "rawHeaders":Lcom/squareup/okhttp/internal/http/RawHeaders;
    :goto_0
    return-object v2

    .line 145
    .restart local v1    # "rawHeaders":Lcom/squareup/okhttp/internal/http/RawHeaders;
    :cond_0
    invoke-virtual {v1, p1}, Lcom/squareup/okhttp/internal/http/RawHeaders;->get(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    goto :goto_0

    .line 146
    .end local v1    # "rawHeaders":Lcom/squareup/okhttp/internal/http/RawHeaders;
    :catch_0
    move-exception v0

    .line 147
    .local v0, "e":Ljava/io/IOException;
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public final getHeaderFieldKey(I)Ljava/lang/String;
    .locals 2
    .param p1, "position"    # I

    .prologue
    .line 153
    :try_start_0
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->getResponse()Lcom/squareup/okhttp/internal/http/HttpEngine;

    move-result-object v1

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getResponseHeaders()Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    move-result-object v1

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->getHeaders()Lcom/squareup/okhttp/internal/http/RawHeaders;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/squareup/okhttp/internal/http/RawHeaders;->getFieldName(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 155
    :goto_0
    return-object v1

    .line 154
    :catch_0
    move-exception v0

    .line 155
    .local v0, "e":Ljava/io/IOException;
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public final getHeaderFields()Ljava/util/Map;
    .locals 3
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
    .line 161
    :try_start_0
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->getResponse()Lcom/squareup/okhttp/internal/http/HttpEngine;

    move-result-object v1

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getResponseHeaders()Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    move-result-object v1

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->getHeaders()Lcom/squareup/okhttp/internal/http/RawHeaders;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/squareup/okhttp/internal/http/RawHeaders;->toMultimap(Z)Ljava/util/Map;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 163
    :goto_0
    return-object v1

    .line 162
    :catch_0
    move-exception v0

    .line 163
    .local v0, "e":Ljava/io/IOException;
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v1

    goto :goto_0
.end method

.method public getHttpConnectionToCache()Ljava/net/HttpURLConnection;
    .locals 0

    .prologue
    .line 270
    return-object p0
.end method

.method public getHttpEngine()Lcom/squareup/okhttp/internal/http/HttpEngine;
    .locals 1

    .prologue
    .line 404
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    return-object v0
.end method

.method public final getInputStream()Ljava/io/InputStream;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 176
    iget-boolean v2, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->doInput:Z

    if-nez v2, :cond_0

    .line 177
    new-instance v2, Ljava/net/ProtocolException;

    const-string v3, "This protocol does not support input"

    invoke-direct {v2, v3}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 180
    :cond_0
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->getResponse()Lcom/squareup/okhttp/internal/http/HttpEngine;

    move-result-object v0

    .line 186
    .local v0, "response":Lcom/squareup/okhttp/internal/http/HttpEngine;
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->getResponseCode()I

    move-result v2

    const/16 v3, 0x190

    if-lt v2, v3, :cond_1

    .line 187
    new-instance v2, Ljava/io/FileNotFoundException;

    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->url:Ljava/net/URL;

    invoke-virtual {v3}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 190
    :cond_1
    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getResponseBody()Ljava/io/InputStream;

    move-result-object v1

    .line 191
    .local v1, "result":Ljava/io/InputStream;
    if-nez v1, :cond_2

    .line 192
    new-instance v2, Ljava/net/ProtocolException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "No response body exists; responseCode="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->getResponseCode()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 194
    :cond_2
    return-object v1
.end method

.method public final getOutputStream()Ljava/io/OutputStream;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 198
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->connect()V

    .line 200
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getRequestBody()Ljava/io/OutputStream;

    move-result-object v0

    .line 201
    .local v0, "out":Ljava/io/OutputStream;
    if-nez v0, :cond_0

    .line 202
    new-instance v1, Ljava/net/ProtocolException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "method does not support a request body: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->method:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 203
    :cond_0
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->hasResponse()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 204
    new-instance v1, Ljava/net/ProtocolException;

    const-string v2, "cannot write request body after response has been read"

    invoke-direct {v1, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 207
    :cond_1
    return-object v0
.end method

.method public final getPermission()Ljava/security/Permission;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 211
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->getURL()Ljava/net/URL;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v0

    .line 212
    .local v0, "hostName":Ljava/lang/String;
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->getURL()Ljava/net/URL;

    move-result-object v3

    invoke-static {v3}, Lcom/squareup/okhttp/internal/Util;->getEffectivePort(Ljava/net/URL;)I

    move-result v1

    .line 213
    .local v1, "hostPort":I
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->usingProxy()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 214
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v3}, Lcom/squareup/okhttp/OkHttpClient;->getProxy()Ljava/net/Proxy;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v2

    check-cast v2, Ljava/net/InetSocketAddress;

    .line 215
    .local v2, "proxyAddress":Ljava/net/InetSocketAddress;
    invoke-virtual {v2}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    move-result-object v0

    .line 216
    invoke-virtual {v2}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v1

    .line 218
    .end local v2    # "proxyAddress":Ljava/net/InetSocketAddress;
    :cond_0
    new-instance v3, Ljava/net/SocketPermission;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ":"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "connect, resolve"

    invoke-direct {v3, v4, v5}, Ljava/net/SocketPermission;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v3
.end method

.method public getReadTimeout()I
    .locals 1

    .prologue
    .line 241
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->getReadTimeout()I

    move-result v0

    return v0
.end method

.method public final getRequestProperties()Ljava/util/Map;
    .locals 2
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
    .line 168
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->connected:Z

    if-eqz v0, :cond_0

    .line 169
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot access request header fields after connection is set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 172
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->rawRequestHeaders:Lcom/squareup/okhttp/internal/http/RawHeaders;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/internal/http/RawHeaders;->toMultimap(Z)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final getRequestProperty(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "field"    # Ljava/lang/String;

    .prologue
    .line 222
    if-nez p1, :cond_0

    .line 223
    const/4 v0, 0x0

    .line 225
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->rawRequestHeaders:Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/internal/http/RawHeaders;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final getResponseCode()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 508
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->getResponse()Lcom/squareup/okhttp/internal/http/HttpEngine;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getResponseCode()I

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
    .line 504
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->getResponse()Lcom/squareup/okhttp/internal/http/HttpEngine;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getResponseHeaders()Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->getHeaders()Lcom/squareup/okhttp/internal/http/RawHeaders;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/RawHeaders;->getResponseMessage()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setConnectTimeout(I)V
    .locals 4
    .param p1, "timeoutMillis"    # I

    .prologue
    .line 229
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->client:Lcom/squareup/okhttp/OkHttpClient;

    int-to-long v2, p1

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3, v1}, Lcom/squareup/okhttp/OkHttpClient;->setConnectTimeout(JLjava/util/concurrent/TimeUnit;)V

    .line 230
    return-void
.end method

.method public setFixedLengthStreamingMode(I)V
    .locals 2
    .param p1, "contentLength"    # I

    .prologue
    .line 575
    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->setFixedLengthStreamingMode(J)V

    .line 576
    return-void
.end method

.method public setFixedLengthStreamingMode(J)V
    .locals 3
    .param p1, "contentLength"    # J

    .prologue
    .line 580
    iget-boolean v0, p0, Ljava/net/HttpURLConnection;->connected:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already connected"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 581
    :cond_0
    iget v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->chunkLength:I

    if-lez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already in chunked mode"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 582
    :cond_1
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gez v0, :cond_2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "contentLength < 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 583
    :cond_2
    iput-wide p1, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->fixedContentLength:J

    .line 584
    const-wide/32 v0, 0x7fffffff

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v0, v0

    iput v0, p0, Ljava/net/HttpURLConnection;->fixedContentLength:I

    .line 585
    return-void
.end method

.method public setReadTimeout(I)V
    .locals 4
    .param p1, "timeoutMillis"    # I

    .prologue
    .line 237
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->client:Lcom/squareup/okhttp/OkHttpClient;

    int-to-long v2, p1

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3, v1}, Lcom/squareup/okhttp/OkHttpClient;->setReadTimeout(JLjava/util/concurrent/TimeUnit;)V

    .line 238
    return-void
.end method

.method public final setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1, "field"    # Ljava/lang/String;
    .param p2, "newValue"    # Ljava/lang/String;

    .prologue
    .line 512
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->connected:Z

    if-eqz v0, :cond_0

    .line 513
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot set request property after connection is made"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 515
    :cond_0
    if-nez p1, :cond_1

    .line 516
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "field == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 518
    :cond_1
    if-nez p2, :cond_2

    .line 524
    invoke-static {}, Lcom/squareup/okhttp/internal/Platform;->get()Lcom/squareup/okhttp/internal/Platform;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Ignoring header "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " because its value was null."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/internal/Platform;->logW(Ljava/lang/String;)V

    .line 533
    :goto_0
    return-void

    .line 528
    :cond_2
    const-string v0, "X-Android-Transports"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 529
    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->setTransports(Ljava/lang/String;Z)V

    goto :goto_0

    .line 531
    :cond_3
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->rawRequestHeaders:Lcom/squareup/okhttp/internal/http/RawHeaders;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/okhttp/internal/http/RawHeaders;->set(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final setSelectedProxy(Ljava/net/Proxy;)V
    .locals 0
    .param p1, "proxy"    # Ljava/net/Proxy;

    .prologue
    .line 588
    iput-object p1, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->selectedProxy:Ljava/net/Proxy;

    .line 589
    return-void
.end method

.method public final usingProxy()Z
    .locals 1

    .prologue
    .line 487
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->selectedProxy:Ljava/net/Proxy;

    if-eqz v0, :cond_0

    .line 488
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->selectedProxy:Ljava/net/Proxy;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->isValidNonDirectProxy(Ljava/net/Proxy;)Z

    move-result v0

    .line 496
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->getProxy()Ljava/net/Proxy;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/okhttp/internal/http/HttpURLConnectionImpl;->isValidNonDirectProxy(Ljava/net/Proxy;)Z

    move-result v0

    goto :goto_0
.end method
