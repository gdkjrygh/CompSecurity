.class public final Lcom/squareup/okhttp/internal/http/HttpTransport;
.super Ljava/lang/Object;
.source "HttpTransport.java"

# interfaces
.implements Lcom/squareup/okhttp/internal/http/Transport;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;,
        Lcom/squareup/okhttp/internal/http/HttpTransport$FixedLengthInputStream;,
        Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedOutputStream;,
        Lcom/squareup/okhttp/internal/http/HttpTransport$FixedLengthOutputStream;
    }
.end annotation


# static fields
.field public static final DEFAULT_CHUNK_LENGTH:I = 0x400

.field private static final DISCARD_STREAM_TIMEOUT_MILLIS:I = 0x64


# instance fields
.field private final httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

.field private requestOut:Ljava/io/OutputStream;

.field private final socketIn:Ljava/io/InputStream;

.field private final socketOut:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>(Lcom/squareup/okhttp/internal/http/HttpEngine;Ljava/io/OutputStream;Ljava/io/InputStream;)V
    .locals 0
    .param p1, "httpEngine"    # Lcom/squareup/okhttp/internal/http/HttpEngine;
    .param p2, "outputStream"    # Ljava/io/OutputStream;
    .param p3, "inputStream"    # Ljava/io/InputStream;

    .prologue
    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    .line 56
    iput-object p2, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->socketOut:Ljava/io/OutputStream;

    .line 57
    iput-object p2, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->requestOut:Ljava/io/OutputStream;

    .line 58
    iput-object p3, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->socketIn:Ljava/io/InputStream;

    .line 59
    return-void
.end method

.method static synthetic access$200(Lcom/squareup/okhttp/internal/http/HttpEngine;Ljava/io/InputStream;)Z
    .locals 1
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/http/HttpEngine;
    .param p1, "x1"    # Ljava/io/InputStream;

    .prologue
    .line 32
    invoke-static {p0, p1}, Lcom/squareup/okhttp/internal/http/HttpTransport;->discardStream(Lcom/squareup/okhttp/internal/http/HttpEngine;Ljava/io/InputStream;)Z

    move-result v0

    return v0
.end method

.method static synthetic access$300(Lcom/squareup/okhttp/internal/http/HttpTransport;)Lcom/squareup/okhttp/internal/http/HttpEngine;
    .locals 1
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/http/HttpTransport;

    .prologue
    .line 32
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    return-object v0
.end method

.method static synthetic access$400(Lcom/squareup/okhttp/internal/http/HttpTransport;)Ljava/io/InputStream;
    .locals 1
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/http/HttpTransport;

    .prologue
    .line 32
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->socketIn:Ljava/io/InputStream;

    return-object v0
.end method

.method private static discardStream(Lcom/squareup/okhttp/internal/http/HttpEngine;Ljava/io/InputStream;)Z
    .locals 6
    .param p0, "httpEngine"    # Lcom/squareup/okhttp/internal/http/HttpEngine;
    .param p1, "responseBodyIn"    # Ljava/io/InputStream;

    .prologue
    const/4 v4, 0x0

    .line 186
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    .line 187
    .local v0, "connection":Lcom/squareup/okhttp/Connection;
    if-nez v0, :cond_1

    .line 200
    :cond_0
    :goto_0
    return v4

    .line 188
    :cond_1
    invoke-virtual {v0}, Lcom/squareup/okhttp/Connection;->getSocket()Ljava/net/Socket;

    move-result-object v2

    .line 189
    .local v2, "socket":Ljava/net/Socket;
    if-eqz v2, :cond_0

    .line 191
    :try_start_0
    invoke-virtual {v2}, Ljava/net/Socket;->getSoTimeout()I

    move-result v3

    .line 192
    .local v3, "socketTimeout":I
    const/16 v5, 0x64

    invoke-virtual {v2, v5}, Ljava/net/Socket;->setSoTimeout(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 194
    :try_start_1
    invoke-static {p1}, Lcom/squareup/okhttp/internal/Util;->skipAll(Ljava/io/InputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 195
    const/4 v5, 0x1

    .line 197
    :try_start_2
    invoke-virtual {v2, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    move v4, v5

    goto :goto_0

    :catchall_0
    move-exception v5

    invoke-virtual {v2, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    throw v5
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 199
    .end local v3    # "socketTimeout":I
    :catch_0
    move-exception v1

    .line 200
    .local v1, "e":Ljava/io/IOException;
    goto :goto_0
.end method


# virtual methods
.method public createRequestBody()Ljava/io/OutputStream;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const-wide/16 v10, -0x1

    const/4 v8, 0x0

    .line 62
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v6, v6, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestHeaders:Lcom/squareup/okhttp/internal/http/RequestHeaders;

    invoke-virtual {v6}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->isChunked()Z

    move-result v1

    .line 63
    .local v1, "chunked":Z
    if-nez v1, :cond_0

    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v6, v6, Lcom/squareup/okhttp/internal/http/HttpEngine;->policy:Lcom/squareup/okhttp/internal/http/Policy;

    .line 64
    invoke-interface {v6}, Lcom/squareup/okhttp/internal/http/Policy;->getChunkLength()I

    move-result v6

    if-lez v6, :cond_0

    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v6, v6, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    .line 65
    invoke-virtual {v6}, Lcom/squareup/okhttp/Connection;->getHttpMinorVersion()I

    move-result v6

    if-eqz v6, :cond_0

    .line 66
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v6, v6, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestHeaders:Lcom/squareup/okhttp/internal/http/RequestHeaders;

    invoke-virtual {v6}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->setChunked()V

    .line 67
    const/4 v1, 0x1

    .line 71
    :cond_0
    if-eqz v1, :cond_2

    .line 72
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v6, v6, Lcom/squareup/okhttp/internal/http/HttpEngine;->policy:Lcom/squareup/okhttp/internal/http/Policy;

    invoke-interface {v6}, Lcom/squareup/okhttp/internal/http/Policy;->getChunkLength()I

    move-result v0

    .line 73
    .local v0, "chunkLength":I
    const/4 v6, -0x1

    if-ne v0, v6, :cond_1

    .line 74
    const/16 v0, 0x400

    .line 76
    :cond_1
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpTransport;->writeRequestHeaders()V

    .line 77
    new-instance v6, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedOutputStream;

    iget-object v7, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->requestOut:Ljava/io/OutputStream;

    invoke-direct {v6, v7, v0, v8}, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedOutputStream;-><init>(Ljava/io/OutputStream;ILcom/squareup/okhttp/internal/http/HttpTransport$1;)V

    .line 103
    .end local v0    # "chunkLength":I
    :goto_0
    return-object v6

    .line 81
    :cond_2
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v6, v6, Lcom/squareup/okhttp/internal/http/HttpEngine;->policy:Lcom/squareup/okhttp/internal/http/Policy;

    invoke-interface {v6}, Lcom/squareup/okhttp/internal/http/Policy;->getFixedContentLength()J

    move-result-wide v4

    .line 82
    .local v4, "fixedContentLength":J
    cmp-long v6, v4, v10

    if-eqz v6, :cond_3

    .line 83
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v6, v6, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestHeaders:Lcom/squareup/okhttp/internal/http/RequestHeaders;

    invoke-virtual {v6, v4, v5}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->setContentLength(J)V

    .line 84
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpTransport;->writeRequestHeaders()V

    .line 85
    new-instance v6, Lcom/squareup/okhttp/internal/http/HttpTransport$FixedLengthOutputStream;

    iget-object v7, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->requestOut:Ljava/io/OutputStream;

    invoke-direct {v6, v7, v4, v5, v8}, Lcom/squareup/okhttp/internal/http/HttpTransport$FixedLengthOutputStream;-><init>(Ljava/io/OutputStream;JLcom/squareup/okhttp/internal/http/HttpTransport$1;)V

    goto :goto_0

    .line 88
    :cond_3
    iget-object v6, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v6, v6, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestHeaders:Lcom/squareup/okhttp/internal/http/RequestHeaders;

    invoke-virtual {v6}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->getContentLength()J

    move-result-wide v2

    .line 89
    .local v2, "contentLength":J
    const-wide/32 v6, 0x7fffffff

    cmp-long v6, v2, v6

    if-lez v6, :cond_4

    .line 90
    new-instance v6, Ljava/lang/IllegalArgumentException;

    const-string v7, "Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2 GiB."

    invoke-direct {v6, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v6

    .line 95
    :cond_4
    cmp-long v6, v2, v10

    if-eqz v6, :cond_5

    .line 96
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpTransport;->writeRequestHeaders()V

    .line 97
    new-instance v6, Lcom/squareup/okhttp/internal/http/RetryableOutputStream;

    long-to-int v7, v2

    invoke-direct {v6, v7}, Lcom/squareup/okhttp/internal/http/RetryableOutputStream;-><init>(I)V

    goto :goto_0

    .line 103
    :cond_5
    new-instance v6, Lcom/squareup/okhttp/internal/http/RetryableOutputStream;

    invoke-direct {v6}, Lcom/squareup/okhttp/internal/http/RetryableOutputStream;-><init>()V

    goto :goto_0
.end method

.method public flushRequest()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 107
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->requestOut:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 108
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->socketOut:Ljava/io/OutputStream;

    iput-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->requestOut:Ljava/io/OutputStream;

    .line 109
    return-void
.end method

.method public getTransferStream(Ljava/net/CacheRequest;)Ljava/io/InputStream;
    .locals 6
    .param p1, "cacheRequest"    # Ljava/net/CacheRequest;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 205
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->hasResponseBody()Z

    move-result v0

    if-nez v0, :cond_0

    .line 206
    new-instance v0, Lcom/squareup/okhttp/internal/http/HttpTransport$FixedLengthInputStream;

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->socketIn:Ljava/io/InputStream;

    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    const-wide/16 v4, 0x0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lcom/squareup/okhttp/internal/http/HttpTransport$FixedLengthInputStream;-><init>(Ljava/io/InputStream;Ljava/net/CacheRequest;Lcom/squareup/okhttp/internal/http/HttpEngine;J)V

    .line 221
    :goto_0
    return-object v0

    .line 209
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v0, v0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->isChunked()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 210
    new-instance v0, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->socketIn:Ljava/io/InputStream;

    invoke-direct {v0, v1, p1, p0}, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;-><init>(Ljava/io/InputStream;Ljava/net/CacheRequest;Lcom/squareup/okhttp/internal/http/HttpTransport;)V

    goto :goto_0

    .line 213
    :cond_1
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v0, v0, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->getContentLength()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_2

    .line 214
    new-instance v0, Lcom/squareup/okhttp/internal/http/HttpTransport$FixedLengthInputStream;

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->socketIn:Ljava/io/InputStream;

    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v2, v2, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    .line 215
    invoke-virtual {v2}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->getContentLength()J

    move-result-wide v4

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lcom/squareup/okhttp/internal/http/HttpTransport$FixedLengthInputStream;-><init>(Ljava/io/InputStream;Ljava/net/CacheRequest;Lcom/squareup/okhttp/internal/http/HttpEngine;J)V

    goto :goto_0

    .line 221
    :cond_2
    new-instance v0, Lcom/squareup/okhttp/internal/http/UnknownLengthHttpInputStream;

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->socketIn:Ljava/io/InputStream;

    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-direct {v0, v1, p1, v2}, Lcom/squareup/okhttp/internal/http/UnknownLengthHttpInputStream;-><init>(Ljava/io/InputStream;Ljava/net/CacheRequest;Lcom/squareup/okhttp/internal/http/HttpEngine;)V

    goto :goto_0
.end method

.method public makeReusable(ZLjava/io/OutputStream;Ljava/io/InputStream;)Z
    .locals 2
    .param p1, "streamCanceled"    # Z
    .param p2, "requestBodyOut"    # Ljava/io/OutputStream;
    .param p3, "responseBodyIn"    # Ljava/io/InputStream;

    .prologue
    const/4 v0, 0x0

    .line 146
    if-eqz p1, :cond_1

    .line 173
    .end local p2    # "requestBodyOut":Ljava/io/OutputStream;
    :cond_0
    :goto_0
    return v0

    .line 151
    .restart local p2    # "requestBodyOut":Ljava/io/OutputStream;
    :cond_1
    if-eqz p2, :cond_2

    check-cast p2, Lcom/squareup/okhttp/internal/AbstractOutputStream;

    .end local p2    # "requestBodyOut":Ljava/io/OutputStream;
    invoke-virtual {p2}, Lcom/squareup/okhttp/internal/AbstractOutputStream;->isClosed()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 156
    :cond_2
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v1, v1, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestHeaders:Lcom/squareup/okhttp/internal/http/RequestHeaders;

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->hasConnectionClose()Z

    move-result v1

    if-nez v1, :cond_0

    .line 161
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v1, v1, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v1, v1, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->hasConnectionClose()Z

    move-result v1

    if-nez v1, :cond_0

    .line 165
    :cond_3
    instance-of v1, p3, Lcom/squareup/okhttp/internal/http/UnknownLengthHttpInputStream;

    if-nez v1, :cond_0

    .line 169
    if-eqz p3, :cond_4

    .line 170
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-static {v0, p3}, Lcom/squareup/okhttp/internal/http/HttpTransport;->discardStream(Lcom/squareup/okhttp/internal/http/HttpEngine;Ljava/io/InputStream;)Z

    move-result v0

    goto :goto_0

    .line 173
    :cond_4
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public readResponseHeaders()Lcom/squareup/okhttp/internal/http/ResponseHeaders;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 135
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->socketIn:Ljava/io/InputStream;

    invoke-static {v2}, Lcom/squareup/okhttp/internal/http/RawHeaders;->fromBytes(Ljava/io/InputStream;)Lcom/squareup/okhttp/internal/http/RawHeaders;

    move-result-object v1

    .line 136
    .local v1, "rawHeaders":Lcom/squareup/okhttp/internal/http/RawHeaders;
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v2, v2, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/RawHeaders;->getHttpMinorVersion()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/squareup/okhttp/Connection;->setHttpMinorVersion(I)V

    .line 137
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v2, v1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->receiveHeaders(Lcom/squareup/okhttp/internal/http/RawHeaders;)V

    .line 139
    new-instance v0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v2, v2, Lcom/squareup/okhttp/internal/http/HttpEngine;->uri:Ljava/net/URI;

    invoke-direct {v0, v2, v1}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;-><init>(Ljava/net/URI;Lcom/squareup/okhttp/internal/http/RawHeaders;)V

    .line 140
    .local v0, "headers":Lcom/squareup/okhttp/internal/http/ResponseHeaders;
    const-string v2, "http/1.1"

    invoke-virtual {v0, v2}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->setTransport(Ljava/lang/String;)V

    .line 141
    return-object v0
.end method

.method public writeRequestBody(Lcom/squareup/okhttp/internal/http/RetryableOutputStream;)V
    .locals 1
    .param p1, "requestBody"    # Lcom/squareup/okhttp/internal/http/RetryableOutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 112
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->requestOut:Ljava/io/OutputStream;

    invoke-virtual {p1, v0}, Lcom/squareup/okhttp/internal/http/RetryableOutputStream;->writeToSocket(Ljava/io/OutputStream;)V

    .line 113
    return-void
.end method

.method public writeRequestHeaders()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 128
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v2}, Lcom/squareup/okhttp/internal/http/HttpEngine;->writingRequestHeaders()V

    .line 129
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v2, v2, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestHeaders:Lcom/squareup/okhttp/internal/http/RequestHeaders;

    invoke-virtual {v2}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->getHeaders()Lcom/squareup/okhttp/internal/http/RawHeaders;

    move-result-object v1

    .line 130
    .local v1, "headersToSend":Lcom/squareup/okhttp/internal/http/RawHeaders;
    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/RawHeaders;->toBytes()[B

    move-result-object v0

    .line 131
    .local v0, "bytes":[B
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpTransport;->requestOut:Ljava/io/OutputStream;

    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V

    .line 132
    return-void
.end method
