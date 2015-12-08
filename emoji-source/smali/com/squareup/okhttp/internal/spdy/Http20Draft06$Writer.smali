.class final Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;
.super Ljava/lang/Object;
.source "Http20Draft06.java"

# interfaces
.implements Lcom/squareup/okhttp/internal/spdy/FrameWriter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/spdy/Http20Draft06;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Writer"
.end annotation


# instance fields
.field private final client:Z

.field private final hpackBuffer:Ljava/io/ByteArrayOutputStream;

.field private final hpackWriter:Lcom/squareup/okhttp/internal/spdy/Hpack$Writer;

.field private final out:Ljava/io/DataOutputStream;


# direct methods
.method constructor <init>(Ljava/io/OutputStream;Z)V
    .locals 2
    .param p1, "out"    # Ljava/io/OutputStream;
    .param p2, "client"    # Z

    .prologue
    .line 280
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 281
    new-instance v0, Ljava/io/DataOutputStream;

    invoke-direct {v0, p1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    iput-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;->out:Ljava/io/DataOutputStream;

    .line 282
    iput-boolean p2, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;->client:Z

    .line 283
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;->hpackBuffer:Ljava/io/ByteArrayOutputStream;

    .line 284
    new-instance v0, Lcom/squareup/okhttp/internal/spdy/Hpack$Writer;

    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;->hpackBuffer:Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0, v1}, Lcom/squareup/okhttp/internal/spdy/Hpack$Writer;-><init>(Ljava/io/OutputStream;)V

    iput-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;->hpackWriter:Lcom/squareup/okhttp/internal/spdy/Hpack$Writer;

    .line 285
    return-void
.end method

.method private headers(ZIILjava/util/List;)V
    .locals 8
    .param p1, "outFinished"    # Z
    .param p2, "streamId"    # I
    .param p3, "priority"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZII",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .local p4, "nameValueBlock":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const v7, 0x7fffffff

    const/4 v6, -0x1

    .line 315
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;->hpackBuffer:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 316
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;->hpackWriter:Lcom/squareup/okhttp/internal/spdy/Hpack$Writer;

    invoke-virtual {v3, p4}, Lcom/squareup/okhttp/internal/spdy/Hpack$Writer;->writeHeaders(Ljava/util/List;)V

    .line 317
    const/4 v2, 0x1

    .line 319
    .local v2, "type":I
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;->hpackBuffer:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v1

    .line 320
    .local v1, "length":I
    const/4 v0, 0x4

    .line 321
    .local v0, "flags":I
    if-eqz p1, :cond_0

    or-int/lit8 v0, v0, 0x1

    .line 322
    :cond_0
    if-eq p3, v6, :cond_1

    or-int/lit8 v0, v0, 0x8

    .line 323
    :cond_1
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;->out:Ljava/io/DataOutputStream;

    const v4, 0xffff

    and-int/2addr v4, v1

    shl-int/lit8 v4, v4, 0x10

    or-int/lit16 v4, v4, 0x100

    and-int/lit16 v5, v0, 0xff

    or-int/2addr v4, v5

    invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 324
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;->out:Ljava/io/DataOutputStream;

    and-int v4, p2, v7

    invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 325
    if-eq p3, v6, :cond_2

    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;->out:Ljava/io/DataOutputStream;

    and-int v4, p3, v7

    invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 326
    :cond_2
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;->hpackBuffer:Ljava/io/ByteArrayOutputStream;

    iget-object v4, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;->out:Ljava/io/DataOutputStream;

    invoke-virtual {v3, v4}, Ljava/io/ByteArrayOutputStream;->writeTo(Ljava/io/OutputStream;)V

    .line 327
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 382
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;->out:Ljava/io/DataOutputStream;

    invoke-virtual {v0}, Ljava/io/DataOutputStream;->close()V

    .line 383
    return-void
.end method

.method public declared-synchronized connectionHeader()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 292
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;->client:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 294
    :goto_0
    monitor-exit p0

    return-void

    .line 293
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;->out:Ljava/io/DataOutputStream;

    # getter for: Lcom/squareup/okhttp/internal/spdy/Http20Draft06;->CONNECTION_HEADER:[B
    invoke-static {}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06;->access$000()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->write([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 292
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public data(ZI[B)V
    .locals 6
    .param p1, "outFinished"    # Z
    .param p2, "streamId"    # I
    .param p3, "data"    # [B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 335
    const/4 v4, 0x0

    array-length v5, p3

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;->data(ZI[BII)V

    .line 336
    return-void
.end method

.method public declared-synchronized data(ZI[BII)V
    .locals 5
    .param p1, "outFinished"    # Z
    .param p2, "streamId"    # I
    .param p3, "data"    # [B
    .param p4, "offset"    # I
    .param p5, "byteCount"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 340
    monitor-enter p0

    const/4 v1, 0x0

    .line 341
    .local v1, "type":I
    const/4 v0, 0x0

    .line 342
    .local v0, "flags":I
    if-eqz p1, :cond_0

    or-int/lit8 v0, v0, 0x1

    .line 343
    :cond_0
    :try_start_0
    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;->out:Ljava/io/DataOutputStream;

    const v3, 0xffff

    and-int/2addr v3, p5

    shl-int/lit8 v3, v3, 0x10

    or-int/lit8 v3, v3, 0x0

    and-int/lit16 v4, v0, 0xff

    or-int/2addr v3, v4

    invoke-virtual {v2, v3}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 344
    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;->out:Ljava/io/DataOutputStream;

    const v3, 0x7fffffff

    and-int/2addr v3, p2

    invoke-virtual {v2, v3}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 345
    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;->out:Ljava/io/DataOutputStream;

    invoke-virtual {v2, p3, p4, p5}, Ljava/io/DataOutputStream;->write([BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 346
    monitor-exit p0

    return-void

    .line 340
    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method public declared-synchronized flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 288
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;->out:Ljava/io/DataOutputStream;

    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 289
    monitor-exit p0

    return-void

    .line 288
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized goAway(ILcom/squareup/okhttp/internal/spdy/ErrorCode;)V
    .locals 0
    .param p1, "lastGoodStreamId"    # I
    .param p2, "errorCode"    # Lcom/squareup/okhttp/internal/spdy/ErrorCode;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 374
    monitor-enter p0

    monitor-exit p0

    return-void
.end method

.method public declared-synchronized headers(ILjava/util/List;)V
    .locals 2
    .param p1, "streamId"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 310
    .local p2, "nameValueBlock":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    monitor-enter p0

    const/4 v0, 0x0

    const/4 v1, -0x1

    :try_start_0
    invoke-direct {p0, v0, p1, v1, p2}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;->headers(ZIILjava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 311
    monitor-exit p0

    return-void

    .line 310
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized noop()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 363
    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized ping(ZII)V
    .locals 0
    .param p1, "reply"    # Z
    .param p2, "payload1"    # I
    .param p3, "payload2"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 369
    monitor-enter p0

    monitor-exit p0

    return-void
.end method

.method public declared-synchronized rstStream(ILcom/squareup/okhttp/internal/spdy/ErrorCode;)V
    .locals 2
    .param p1, "streamId"    # I
    .param p2, "errorCode"    # Lcom/squareup/okhttp/internal/spdy/ErrorCode;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 331
    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "TODO"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized settings(Lcom/squareup/okhttp/internal/spdy/Settings;)V
    .locals 7
    .param p1, "settings"    # Lcom/squareup/okhttp/internal/spdy/Settings;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 349
    monitor-enter p0

    const/4 v4, 0x4

    .line 350
    .local v4, "type":I
    :try_start_0
    invoke-virtual {p1}, Lcom/squareup/okhttp/internal/spdy/Settings;->size()I

    move-result v5

    mul-int/lit8 v2, v5, 0x8

    .line 351
    .local v2, "length":I
    const/4 v0, 0x0

    .line 352
    .local v0, "flags":I
    const/4 v3, 0x0

    .line 353
    .local v3, "streamId":I
    iget-object v5, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;->out:Ljava/io/DataOutputStream;

    const v6, 0xffff

    and-int/2addr v6, v2

    shl-int/lit8 v6, v6, 0x10

    or-int/lit16 v6, v6, 0x400

    or-int/lit8 v6, v6, 0x0

    invoke-virtual {v5, v6}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 354
    iget-object v5, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;->out:Ljava/io/DataOutputStream;

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 355
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    const/16 v5, 0xa

    if-ge v1, v5, :cond_1

    .line 356
    invoke-virtual {p1, v1}, Lcom/squareup/okhttp/internal/spdy/Settings;->isSet(I)Z

    move-result v5

    if-nez v5, :cond_0

    .line 355
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 357
    :cond_0
    iget-object v5, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;->out:Ljava/io/DataOutputStream;

    const v6, 0xffffff

    and-int/2addr v6, v1

    invoke-virtual {v5, v6}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 358
    iget-object v5, p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;->out:Ljava/io/DataOutputStream;

    invoke-virtual {p1, v1}, Lcom/squareup/okhttp/internal/spdy/Settings;->get(I)I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/io/DataOutputStream;->writeInt(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 349
    .end local v0    # "flags":I
    .end local v1    # "i":I
    .end local v2    # "length":I
    .end local v3    # "streamId":I
    :catchall_0
    move-exception v5

    monitor-exit p0

    throw v5

    .line 360
    .restart local v0    # "flags":I
    .restart local v1    # "i":I
    .restart local v2    # "length":I
    .restart local v3    # "streamId":I
    :cond_1
    monitor-exit p0

    return-void
.end method

.method public declared-synchronized synReply(ZILjava/util/List;)V
    .locals 1
    .param p1, "outFinished"    # Z
    .param p2, "streamId"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZI",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 305
    .local p3, "nameValueBlock":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    monitor-enter p0

    const/4 v0, -0x1

    :try_start_0
    invoke-direct {p0, p1, p2, v0, p3}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;->headers(ZIILjava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 306
    monitor-exit p0

    return-void

    .line 305
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized synStream(ZZIIIILjava/util/List;)V
    .locals 1
    .param p1, "outFinished"    # Z
    .param p2, "inFinished"    # Z
    .param p3, "streamId"    # I
    .param p4, "associatedStreamId"    # I
    .param p5, "priority"    # I
    .param p6, "slot"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZIIII",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 299
    .local p7, "nameValueBlock":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    monitor-enter p0

    if-eqz p2, :cond_0

    :try_start_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 300
    :cond_0
    :try_start_1
    invoke-direct {p0, p1, p3, p5, p7}, Lcom/squareup/okhttp/internal/spdy/Http20Draft06$Writer;->headers(ZIILjava/util/List;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 301
    monitor-exit p0

    return-void
.end method

.method public declared-synchronized windowUpdate(II)V
    .locals 0
    .param p1, "streamId"    # I
    .param p2, "deltaWindowSize"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 379
    monitor-enter p0

    monitor-exit p0

    return-void
.end method
