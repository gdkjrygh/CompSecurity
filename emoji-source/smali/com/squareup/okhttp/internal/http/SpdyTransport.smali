.class public final Lcom/squareup/okhttp/internal/http/SpdyTransport;
.super Ljava/lang/Object;
.source "SpdyTransport.java"

# interfaces
.implements Lcom/squareup/okhttp/internal/http/Transport;


# instance fields
.field private final httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

.field private final spdyConnection:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

.field private stream:Lcom/squareup/okhttp/internal/spdy/SpdyStream;


# direct methods
.method public constructor <init>(Lcom/squareup/okhttp/internal/http/HttpEngine;Lcom/squareup/okhttp/internal/spdy/SpdyConnection;)V
    .locals 0
    .param p1, "httpEngine"    # Lcom/squareup/okhttp/internal/http/HttpEngine;
    .param p2, "spdyConnection"    # Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    .line 36
    iput-object p2, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport;->spdyConnection:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    .line 37
    return-void
.end method


# virtual methods
.method public createRequestBody()Ljava/io/OutputStream;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 40
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v2, v2, Lcom/squareup/okhttp/internal/http/HttpEngine;->policy:Lcom/squareup/okhttp/internal/http/Policy;

    invoke-interface {v2}, Lcom/squareup/okhttp/internal/http/Policy;->getFixedContentLength()J

    move-result-wide v0

    .line 41
    .local v0, "fixedContentLength":J
    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    .line 42
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v2, v2, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestHeaders:Lcom/squareup/okhttp/internal/http/RequestHeaders;

    invoke-virtual {v2, v0, v1}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->setContentLength(J)V

    .line 45
    :cond_0
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/SpdyTransport;->writeRequestHeaders()V

    .line 46
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport;->stream:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-virtual {v2}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    return-object v2
.end method

.method public flushRequest()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 71
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport;->stream:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 72
    return-void
.end method

.method public getTransferStream(Ljava/net/CacheRequest;)Ljava/io/InputStream;
    .locals 3
    .param p1, "cacheRequest"    # Ljava/net/CacheRequest;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 85
    new-instance v0, Lcom/squareup/okhttp/internal/http/UnknownLengthHttpInputStream;

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport;->stream:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-direct {v0, v1, p1, v2}, Lcom/squareup/okhttp/internal/http/UnknownLengthHttpInputStream;-><init>(Ljava/io/InputStream;Ljava/net/CacheRequest;Lcom/squareup/okhttp/internal/http/HttpEngine;)V

    return-object v0
.end method

.method public makeReusable(ZLjava/io/OutputStream;Ljava/io/InputStream;)Z
    .locals 3
    .param p1, "streamCanceled"    # Z
    .param p2, "requestBodyOut"    # Ljava/io/OutputStream;
    .param p3, "responseBodyIn"    # Ljava/io/InputStream;

    .prologue
    const/4 v0, 0x1

    .line 90
    if-eqz p1, :cond_0

    .line 91
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport;->stream:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    if-eqz v1, :cond_1

    .line 92
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport;->stream:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    sget-object v2, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->CANCEL:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    invoke-virtual {v1, v2}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->closeLater(Lcom/squareup/okhttp/internal/spdy/ErrorCode;)V

    .line 101
    :cond_0
    :goto_0
    return v0

    .line 98
    :cond_1
    const/4 v0, 0x0

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
    .line 75
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport;->stream:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-virtual {v3}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->getResponseHeaders()Ljava/util/List;

    move-result-object v1

    .line 76
    .local v1, "nameValueBlock":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-static {v1}, Lcom/squareup/okhttp/internal/http/RawHeaders;->fromNameValueBlock(Ljava/util/List;)Lcom/squareup/okhttp/internal/http/RawHeaders;

    move-result-object v2

    .line 77
    .local v2, "rawHeaders":Lcom/squareup/okhttp/internal/http/RawHeaders;
    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v3, v2}, Lcom/squareup/okhttp/internal/http/HttpEngine;->receiveHeaders(Lcom/squareup/okhttp/internal/http/RawHeaders;)V

    .line 79
    new-instance v0, Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    iget-object v3, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v3, v3, Lcom/squareup/okhttp/internal/http/HttpEngine;->uri:Ljava/net/URI;

    invoke-direct {v0, v3, v2}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;-><init>(Ljava/net/URI;Lcom/squareup/okhttp/internal/http/RawHeaders;)V

    .line 80
    .local v0, "headers":Lcom/squareup/okhttp/internal/http/ResponseHeaders;
    const-string v3, "spdy/3"

    invoke-virtual {v0, v3}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->setTransport(Ljava/lang/String;)V

    .line 81
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
    .line 67
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public writeRequestHeaders()V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 50
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport;->stream:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    if-eqz v1, :cond_0

    .line 64
    :goto_0
    return-void

    .line 53
    :cond_0
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->writingRequestHeaders()V

    .line 54
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v1, v1, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestHeaders:Lcom/squareup/okhttp/internal/http/RequestHeaders;

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/RequestHeaders;->getHeaders()Lcom/squareup/okhttp/internal/http/RawHeaders;

    move-result-object v0

    .line 55
    .local v0, "requestHeaders":Lcom/squareup/okhttp/internal/http/RawHeaders;
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v1, v1, Lcom/squareup/okhttp/internal/http/HttpEngine;->connection:Lcom/squareup/okhttp/Connection;

    invoke-virtual {v1}, Lcom/squareup/okhttp/Connection;->getHttpMinorVersion()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    const-string v3, "HTTP/1.1"

    .line 56
    .local v3, "version":Ljava/lang/String;
    :goto_1
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v1, v1, Lcom/squareup/okhttp/internal/http/HttpEngine;->policy:Lcom/squareup/okhttp/internal/http/Policy;

    invoke-interface {v1}, Lcom/squareup/okhttp/internal/http/Policy;->getURL()Ljava/net/URL;

    move-result-object v8

    .line 57
    .local v8, "url":Ljava/net/URL;
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v1, v1, Lcom/squareup/okhttp/internal/http/HttpEngine;->method:Ljava/lang/String;

    invoke-static {v8}, Lcom/squareup/okhttp/internal/http/HttpEngine;->requestPath(Ljava/net/URL;)Ljava/lang/String;

    move-result-object v2

    .line 58
    invoke-static {v8}, Lcom/squareup/okhttp/internal/http/HttpEngine;->getOriginAddress(Ljava/net/URL;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v5, v5, Lcom/squareup/okhttp/internal/http/HttpEngine;->uri:Ljava/net/URI;

    invoke-virtual {v5}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v5

    .line 57
    invoke-virtual/range {v0 .. v5}, Lcom/squareup/okhttp/internal/http/RawHeaders;->addSpdyRequestHeaders(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->hasRequestBody()Z

    move-result v6

    .line 60
    .local v6, "hasRequestBody":Z
    const/4 v7, 0x1

    .line 61
    .local v7, "hasResponseBody":Z
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport;->spdyConnection:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/RawHeaders;->toNameValueBlock()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2, v6, v7}, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;->newStream(Ljava/util/List;ZZ)Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    move-result-object v1

    iput-object v1, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport;->stream:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    .line 63
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport;->stream:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/SpdyTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v2, v2, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v2}, Lcom/squareup/okhttp/OkHttpClient;->getReadTimeout()I

    move-result v2

    int-to-long v4, v2

    invoke-virtual {v1, v4, v5}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->setReadTimeout(J)V

    goto :goto_0

    .line 55
    .end local v3    # "version":Ljava/lang/String;
    .end local v6    # "hasRequestBody":Z
    .end local v7    # "hasResponseBody":Z
    .end local v8    # "url":Ljava/net/URL;
    :cond_1
    const-string v3, "HTTP/1.0"

    goto :goto_1
.end method
