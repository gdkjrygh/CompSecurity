.class Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;
.super Lcom/squareup/okhttp/internal/http/AbstractHttpInputStream;
.source "HttpTransport.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/http/HttpTransport;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ChunkedInputStream"
.end annotation


# static fields
.field private static final NO_CHUNK_YET:I = -0x1


# instance fields
.field private bytesRemainingInChunk:I

.field private hasMoreChunks:Z

.field private final transport:Lcom/squareup/okhttp/internal/http/HttpTransport;


# direct methods
.method constructor <init>(Ljava/io/InputStream;Ljava/net/CacheRequest;Lcom/squareup/okhttp/internal/http/HttpTransport;)V
    .locals 1
    .param p1, "is"    # Ljava/io/InputStream;
    .param p2, "cacheRequest"    # Ljava/net/CacheRequest;
    .param p3, "transport"    # Lcom/squareup/okhttp/internal/http/HttpTransport;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 428
    # getter for: Lcom/squareup/okhttp/internal/http/HttpTransport;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;
    invoke-static {p3}, Lcom/squareup/okhttp/internal/http/HttpTransport;->access$300(Lcom/squareup/okhttp/internal/http/HttpTransport;)Lcom/squareup/okhttp/internal/http/HttpEngine;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2}, Lcom/squareup/okhttp/internal/http/AbstractHttpInputStream;-><init>(Ljava/io/InputStream;Lcom/squareup/okhttp/internal/http/HttpEngine;Ljava/net/CacheRequest;)V

    .line 423
    const/4 v0, -0x1

    iput v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->bytesRemainingInChunk:I

    .line 424
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->hasMoreChunks:Z

    .line 429
    iput-object p3, p0, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->transport:Lcom/squareup/okhttp/internal/http/HttpTransport;

    .line 430
    return-void
.end method

.method private readChunkSize()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    const/4 v5, -0x1

    .line 457
    iget v4, p0, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->bytesRemainingInChunk:I

    if-eq v4, v5, :cond_0

    .line 458
    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->in:Ljava/io/InputStream;

    invoke-static {v4}, Lcom/squareup/okhttp/internal/Util;->readAsciiLine(Ljava/io/InputStream;)Ljava/lang/String;

    .line 460
    :cond_0
    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->in:Ljava/io/InputStream;

    invoke-static {v4}, Lcom/squareup/okhttp/internal/Util;->readAsciiLine(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v0

    .line 461
    .local v0, "chunkSizeString":Ljava/lang/String;
    const-string v4, ";"

    invoke-virtual {v0, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    .line 462
    .local v2, "index":I
    if-eq v2, v5, :cond_1

    .line 463
    invoke-virtual {v0, v6, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 466
    :cond_1
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x10

    invoke-static {v4, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v4

    iput v4, p0, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->bytesRemainingInChunk:I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 470
    iget v4, p0, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->bytesRemainingInChunk:I

    if-nez v4, :cond_2

    .line 471
    iput-boolean v6, p0, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->hasMoreChunks:Z

    .line 472
    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v4, v4, Lcom/squareup/okhttp/internal/http/HttpEngine;->responseHeaders:Lcom/squareup/okhttp/internal/http/ResponseHeaders;

    invoke-virtual {v4}, Lcom/squareup/okhttp/internal/http/ResponseHeaders;->getHeaders()Lcom/squareup/okhttp/internal/http/RawHeaders;

    move-result-object v3

    .line 473
    .local v3, "rawResponseHeaders":Lcom/squareup/okhttp/internal/http/RawHeaders;
    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->transport:Lcom/squareup/okhttp/internal/http/HttpTransport;

    # getter for: Lcom/squareup/okhttp/internal/http/HttpTransport;->socketIn:Ljava/io/InputStream;
    invoke-static {v4}, Lcom/squareup/okhttp/internal/http/HttpTransport;->access$400(Lcom/squareup/okhttp/internal/http/HttpTransport;)Ljava/io/InputStream;

    move-result-object v4

    invoke-static {v4, v3}, Lcom/squareup/okhttp/internal/http/RawHeaders;->readHeaders(Ljava/io/InputStream;Lcom/squareup/okhttp/internal/http/RawHeaders;)V

    .line 474
    iget-object v4, p0, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v4, v3}, Lcom/squareup/okhttp/internal/http/HttpEngine;->receiveHeaders(Lcom/squareup/okhttp/internal/http/RawHeaders;)V

    .line 475
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->endOfInput()V

    .line 477
    .end local v3    # "rawResponseHeaders":Lcom/squareup/okhttp/internal/http/RawHeaders;
    :cond_2
    return-void

    .line 467
    :catch_0
    move-exception v1

    .line 468
    .local v1, "e":Ljava/lang/NumberFormatException;
    new-instance v4, Ljava/net/ProtocolException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Expected a hex chunk size but was "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v4
.end method


# virtual methods
.method public available()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 480
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->checkNotClosed()V

    .line 481
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->hasMoreChunks:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->bytesRemainingInChunk:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 482
    :cond_0
    const/4 v0, 0x0

    .line 484
    :goto_0
    return v0

    :cond_1
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    iget v1, p0, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->bytesRemainingInChunk:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_0
.end method

.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 488
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->closed:Z

    if-eqz v0, :cond_0

    .line 495
    :goto_0
    return-void

    .line 491
    :cond_0
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->hasMoreChunks:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    # invokes: Lcom/squareup/okhttp/internal/http/HttpTransport;->discardStream(Lcom/squareup/okhttp/internal/http/HttpEngine;Ljava/io/InputStream;)Z
    invoke-static {v0, p0}, Lcom/squareup/okhttp/internal/http/HttpTransport;->access$200(Lcom/squareup/okhttp/internal/http/HttpEngine;Ljava/io/InputStream;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 492
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->unexpectedEndOfInput()V

    .line 494
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->closed:Z

    goto :goto_0
.end method

.method public read([BII)I
    .locals 4
    .param p1, "buffer"    # [B
    .param p2, "offset"    # I
    .param p3, "count"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v1, -0x1

    .line 433
    array-length v2, p1

    invoke-static {v2, p2, p3}, Lcom/squareup/okhttp/internal/Util;->checkOffsetAndCount(III)V

    .line 434
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->checkNotClosed()V

    .line 436
    iget-boolean v2, p0, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->hasMoreChunks:Z

    if-nez v2, :cond_0

    move v0, v1

    .line 452
    :goto_0
    return v0

    .line 439
    :cond_0
    iget v2, p0, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->bytesRemainingInChunk:I

    if-eqz v2, :cond_1

    iget v2, p0, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->bytesRemainingInChunk:I

    if-ne v2, v1, :cond_2

    .line 440
    :cond_1
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->readChunkSize()V

    .line 441
    iget-boolean v2, p0, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->hasMoreChunks:Z

    if-nez v2, :cond_2

    move v0, v1

    .line 442
    goto :goto_0

    .line 445
    :cond_2
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->in:Ljava/io/InputStream;

    iget v3, p0, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->bytesRemainingInChunk:I

    invoke-static {p3, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-virtual {v2, p1, p2, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    .line 446
    .local v0, "read":I
    if-ne v0, v1, :cond_3

    .line 447
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->unexpectedEndOfInput()V

    .line 448
    new-instance v1, Ljava/io/IOException;

    const-string v2, "unexpected end of stream"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 450
    :cond_3
    iget v1, p0, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->bytesRemainingInChunk:I

    sub-int/2addr v1, v0

    iput v1, p0, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->bytesRemainingInChunk:I

    .line 451
    invoke-virtual {p0, p1, p2, v0}, Lcom/squareup/okhttp/internal/http/HttpTransport$ChunkedInputStream;->cacheWrite([BII)V

    goto :goto_0
.end method
