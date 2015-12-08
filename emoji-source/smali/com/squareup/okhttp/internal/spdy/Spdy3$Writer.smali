.class final Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;
.super Ljava/lang/Object;
.source "Spdy3.java"

# interfaces
.implements Lcom/squareup/okhttp/internal/spdy/FrameWriter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/spdy/Spdy3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Writer"
.end annotation


# instance fields
.field private final client:Z

.field private final nameValueBlockBuffer:Ljava/io/ByteArrayOutputStream;

.field private final nameValueBlockOut:Ljava/io/DataOutputStream;

.field private final out:Ljava/io/DataOutputStream;


# direct methods
.method constructor <init>(Ljava/io/OutputStream;Z)V
    .locals 5
    .param p1, "out"    # Ljava/io/OutputStream;
    .param p2, "client"    # Z

    .prologue
    .line 293
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 294
    new-instance v1, Ljava/io/DataOutputStream;

    invoke-direct {v1, p1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    iput-object v1, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    .line 295
    iput-boolean p2, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->client:Z

    .line 297
    new-instance v0, Ljava/util/zip/Deflater;

    invoke-direct {v0}, Ljava/util/zip/Deflater;-><init>()V

    .line 298
    .local v0, "deflater":Ljava/util/zip/Deflater;
    sget-object v1, Lcom/squareup/okhttp/internal/spdy/Spdy3;->DICTIONARY:[B

    invoke-virtual {v0, v1}, Ljava/util/zip/Deflater;->setDictionary([B)V

    .line 299
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v1, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->nameValueBlockBuffer:Ljava/io/ByteArrayOutputStream;

    .line 300
    new-instance v1, Ljava/io/DataOutputStream;

    .line 301
    invoke-static {}, Lcom/squareup/okhttp/internal/Platform;->get()Lcom/squareup/okhttp/internal/Platform;

    move-result-object v2

    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->nameValueBlockBuffer:Ljava/io/ByteArrayOutputStream;

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v0, v4}, Lcom/squareup/okhttp/internal/Platform;->newDeflaterOutputStream(Ljava/io/OutputStream;Ljava/util/zip/Deflater;Z)Ljava/io/OutputStream;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    iput-object v1, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->nameValueBlockOut:Ljava/io/DataOutputStream;

    .line 302
    return-void
.end method

.method private writeNameValueBlockToBuffer(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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
    .line 385
    .local p1, "nameValueBlock":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->nameValueBlockBuffer:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 386
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    div-int/lit8 v0, v2, 0x2

    .line 387
    .local v0, "numberOfPairs":I
    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->nameValueBlockOut:Ljava/io/DataOutputStream;

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 388
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 389
    .local v1, "s":Ljava/lang/String;
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->nameValueBlockOut:Ljava/io/DataOutputStream;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 390
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->nameValueBlockOut:Ljava/io/DataOutputStream;

    const-string v4, "UTF-8"

    invoke-virtual {v1, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->write([B)V

    goto :goto_0

    .line 392
    .end local v1    # "s":Ljava/lang/String;
    :cond_0
    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->nameValueBlockOut:Ljava/io/DataOutputStream;

    invoke-virtual {v2}, Ljava/io/DataOutputStream;->flush()V

    .line 393
    return-void
.end method


# virtual methods
.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 460
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->nameValueBlockOut:Ljava/io/DataOutputStream;

    invoke-static {v0, v1}, Lcom/squareup/okhttp/internal/Util;->closeAll(Ljava/io/Closeable;Ljava/io/Closeable;)V

    .line 461
    return-void
.end method

.method public declared-synchronized connectionHeader()V
    .locals 0

    .prologue
    .line 306
    monitor-enter p0

    monitor-exit p0

    return-void
.end method

.method public declared-synchronized data(ZI[B)V
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
    .line 373
    monitor-enter p0

    const/4 v4, 0x0

    :try_start_0
    array-length v5, p3

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->data(ZI[BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 374
    monitor-exit p0

    return-void

    .line 373
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized data(ZI[BII)V
    .locals 4
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
    .line 378
    monitor-enter p0

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    .line 379
    .local v0, "flags":I
    :goto_0
    :try_start_0
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    const v2, 0x7fffffff

    and-int/2addr v2, p2

    invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 380
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    and-int/lit16 v2, v0, 0xff

    shl-int/lit8 v2, v2, 0x18

    const v3, 0xffffff

    and-int/2addr v3, p5

    or-int/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 381
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    invoke-virtual {v1, p3, p4, p5}, Ljava/io/DataOutputStream;->write([BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 382
    monitor-exit p0

    return-void

    .line 378
    .end local v0    # "flags":I
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .restart local v0    # "flags":I
    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public declared-synchronized flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 309
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 310
    monitor-exit p0

    return-void

    .line 309
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized goAway(ILcom/squareup/okhttp/internal/spdy/ErrorCode;)V
    .locals 5
    .param p1, "lastGoodStreamId"    # I
    .param p2, "errorCode"    # Lcom/squareup/okhttp/internal/spdy/ErrorCode;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 436
    monitor-enter p0

    :try_start_0
    iget v3, p2, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->spdyGoAwayCode:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_0

    new-instance v3, Ljava/lang/IllegalArgumentException;

    invoke-direct {v3}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v3

    monitor-exit p0

    throw v3

    .line 437
    :cond_0
    const/4 v2, 0x7

    .line 438
    .local v2, "type":I
    const/4 v0, 0x0

    .line 439
    .local v0, "flags":I
    const/16 v1, 0x8

    .line 440
    .local v1, "length":I
    :try_start_1
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    const v4, -0x7ffcfff9

    invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 441
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    const/16 v4, 0x8

    invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 442
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    invoke-virtual {v3, p1}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 443
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    iget v4, p2, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->spdyGoAwayCode:I

    invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 444
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    invoke-virtual {v3}, Ljava/io/DataOutputStream;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 445
    monitor-exit p0

    return-void
.end method

.method public declared-synchronized headers(ILjava/util/List;)V
    .locals 5
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
    .line 346
    .local p2, "nameValueBlock":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p2}, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->writeNameValueBlockToBuffer(Ljava/util/List;)V

    .line 347
    const/4 v0, 0x0

    .line 348
    .local v0, "flags":I
    const/16 v2, 0x8

    .line 349
    .local v2, "type":I
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->nameValueBlockBuffer:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v3

    add-int/lit8 v1, v3, 0x4

    .line 351
    .local v1, "length":I
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    const v4, -0x7ffcfff8

    invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 352
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    const v4, 0xffffff

    and-int/2addr v4, v1

    or-int/lit8 v4, v4, 0x0

    invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 353
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    const v4, 0x7fffffff

    and-int/2addr v4, p1

    invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 354
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->nameValueBlockBuffer:Ljava/io/ByteArrayOutputStream;

    iget-object v4, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    invoke-virtual {v3, v4}, Ljava/io/ByteArrayOutputStream;->writeTo(Ljava/io/OutputStream;)V

    .line 355
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    invoke-virtual {v3}, Ljava/io/DataOutputStream;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 356
    monitor-exit p0

    return-void

    .line 346
    .end local v0    # "flags":I
    .end local v1    # "length":I
    .end local v2    # "type":I
    :catchall_0
    move-exception v3

    monitor-exit p0

    throw v3
.end method

.method public declared-synchronized noop()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 413
    monitor-enter p0

    const/4 v2, 0x5

    .line 414
    .local v2, "type":I
    const/4 v1, 0x0

    .line 415
    .local v1, "length":I
    const/4 v0, 0x0

    .line 416
    .local v0, "flags":I
    :try_start_0
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    const v4, -0x7ffcfffb

    invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 417
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 418
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    invoke-virtual {v3}, Ljava/io/DataOutputStream;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 419
    monitor-exit p0

    return-void

    .line 413
    :catchall_0
    move-exception v3

    monitor-exit p0

    throw v3
.end method

.method public declared-synchronized ping(ZII)V
    .locals 7
    .param p1, "reply"    # Z
    .param p2, "payload1"    # I
    .param p3, "payload2"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    const/4 v2, 0x1

    .line 423
    monitor-enter p0

    :try_start_0
    iget-boolean v6, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->client:Z

    rem-int/lit8 v5, p2, 0x2

    if-ne v5, v2, :cond_0

    move v5, v2

    :goto_0
    if-eq v6, v5, :cond_1

    .line 424
    .local v2, "payloadIsReply":Z
    :goto_1
    if-eq p1, v2, :cond_2

    new-instance v4, Ljava/lang/IllegalArgumentException;

    const-string v5, "payload != reply"

    invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 423
    .end local v2    # "payloadIsReply":Z
    :catchall_0
    move-exception v4

    monitor-exit p0

    throw v4

    :cond_0
    move v5, v4

    goto :goto_0

    :cond_1
    move v2, v4

    goto :goto_1

    .line 425
    .restart local v2    # "payloadIsReply":Z
    :cond_2
    const/4 v3, 0x6

    .line 426
    .local v3, "type":I
    const/4 v0, 0x0

    .line 427
    .local v0, "flags":I
    const/4 v1, 0x4

    .line 428
    .local v1, "length":I
    :try_start_1
    iget-object v4, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    const v5, -0x7ffcfffa

    invoke-virtual {v4, v5}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 429
    iget-object v4, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    const/4 v5, 0x4

    invoke-virtual {v4, v5}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 430
    iget-object v4, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    invoke-virtual {v4, p2}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 431
    iget-object v4, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    invoke-virtual {v4}, Ljava/io/DataOutputStream;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 432
    monitor-exit p0

    return-void
.end method

.method public declared-synchronized rstStream(ILcom/squareup/okhttp/internal/spdy/ErrorCode;)V
    .locals 5
    .param p1, "streamId"    # I
    .param p2, "errorCode"    # Lcom/squareup/okhttp/internal/spdy/ErrorCode;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 360
    monitor-enter p0

    :try_start_0
    iget v3, p2, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->spdyRstCode:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_0

    new-instance v3, Ljava/lang/IllegalArgumentException;

    invoke-direct {v3}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v3

    monitor-exit p0

    throw v3

    .line 361
    :cond_0
    const/4 v0, 0x0

    .line 362
    .local v0, "flags":I
    const/4 v2, 0x3

    .line 363
    .local v2, "type":I
    const/16 v1, 0x8

    .line 364
    .local v1, "length":I
    :try_start_1
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    const v4, -0x7ffcfffd

    invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 365
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    const/16 v4, 0x8

    invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 366
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    const v4, 0x7fffffff

    and-int/2addr v4, p1

    invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 367
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    iget v4, p2, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->spdyRstCode:I

    invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 368
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    invoke-virtual {v3}, Ljava/io/DataOutputStream;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 369
    monitor-exit p0

    return-void
.end method

.method public declared-synchronized settings(Lcom/squareup/okhttp/internal/spdy/Settings;)V
    .locals 10
    .param p1, "settings"    # Lcom/squareup/okhttp/internal/spdy/Settings;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const v9, 0xffffff

    .line 396
    monitor-enter p0

    const/4 v5, 0x4

    .line 397
    .local v5, "type":I
    const/4 v0, 0x0

    .line 398
    .local v0, "flags":I
    :try_start_0
    invoke-virtual {p1}, Lcom/squareup/okhttp/internal/spdy/Settings;->size()I

    move-result v4

    .line 399
    .local v4, "size":I
    mul-int/lit8 v6, v4, 0x8

    add-int/lit8 v2, v6, 0x4

    .line 400
    .local v2, "length":I
    iget-object v6, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    const v7, -0x7ffcfffc

    invoke-virtual {v6, v7}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 401
    iget-object v6, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    and-int v7, v2, v9

    or-int/lit8 v7, v7, 0x0

    invoke-virtual {v6, v7}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 402
    iget-object v6, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    invoke-virtual {v6, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 403
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    const/16 v6, 0xa

    if-gt v1, v6, :cond_1

    .line 404
    invoke-virtual {p1, v1}, Lcom/squareup/okhttp/internal/spdy/Settings;->isSet(I)Z

    move-result v6

    if-nez v6, :cond_0

    .line 403
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 405
    :cond_0
    invoke-virtual {p1, v1}, Lcom/squareup/okhttp/internal/spdy/Settings;->flags(I)I

    move-result v3

    .line 406
    .local v3, "settingsFlags":I
    iget-object v6, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    and-int/lit16 v7, v3, 0xff

    shl-int/lit8 v7, v7, 0x18

    and-int v8, v1, v9

    or-int/2addr v7, v8

    invoke-virtual {v6, v7}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 407
    iget-object v6, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    invoke-virtual {p1, v1}, Lcom/squareup/okhttp/internal/spdy/Settings;->get(I)I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/io/DataOutputStream;->writeInt(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 396
    .end local v1    # "i":I
    .end local v2    # "length":I
    .end local v3    # "settingsFlags":I
    .end local v4    # "size":I
    :catchall_0
    move-exception v6

    monitor-exit p0

    throw v6

    .line 409
    .restart local v1    # "i":I
    .restart local v2    # "length":I
    .restart local v4    # "size":I
    :cond_1
    :try_start_1
    iget-object v6, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    invoke-virtual {v6}, Ljava/io/DataOutputStream;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 410
    monitor-exit p0

    return-void
.end method

.method public declared-synchronized synReply(ZILjava/util/List;)V
    .locals 6
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
    .line 332
    .local p3, "nameValueBlock":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p3}, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->writeNameValueBlockToBuffer(Ljava/util/List;)V

    .line 333
    const/4 v2, 0x2

    .line 334
    .local v2, "type":I
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    .line 335
    .local v0, "flags":I
    :goto_0
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->nameValueBlockBuffer:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v3

    add-int/lit8 v1, v3, 0x4

    .line 337
    .local v1, "length":I
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    const v4, -0x7ffcfffe

    invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 338
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    and-int/lit16 v4, v0, 0xff

    shl-int/lit8 v4, v4, 0x18

    const v5, 0xffffff

    and-int/2addr v5, v1

    or-int/2addr v4, v5

    invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 339
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    const v4, 0x7fffffff

    and-int/2addr v4, p2

    invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 340
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->nameValueBlockBuffer:Ljava/io/ByteArrayOutputStream;

    iget-object v4, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    invoke-virtual {v3, v4}, Ljava/io/ByteArrayOutputStream;->writeTo(Ljava/io/OutputStream;)V

    .line 341
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    invoke-virtual {v3}, Ljava/io/DataOutputStream;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 342
    monitor-exit p0

    return-void

    .line 334
    .end local v0    # "flags":I
    .end local v1    # "length":I
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 332
    .end local v2    # "type":I
    :catchall_0
    move-exception v3

    monitor-exit p0

    throw v3
.end method

.method public declared-synchronized synStream(ZZIIIILjava/util/List;)V
    .locals 8
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
    .local p7, "nameValueBlock":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const v7, 0x7fffffff

    const/4 v4, 0x0

    .line 315
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p7}, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->writeNameValueBlockToBuffer(Ljava/util/List;)V

    .line 316
    iget-object v5, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->nameValueBlockBuffer:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v5

    add-int/lit8 v1, v5, 0xa

    .line 317
    .local v1, "length":I
    const/4 v2, 0x1

    .line 318
    .local v2, "type":I
    if-eqz p1, :cond_1

    const/4 v5, 0x1

    :goto_0
    if-eqz p2, :cond_0

    const/4 v4, 0x2

    :cond_0
    or-int v0, v5, v4

    .line 320
    .local v0, "flags":I
    const/4 v3, 0x0

    .line 321
    .local v3, "unused":I
    iget-object v4, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    const v5, -0x7ffcffff

    invoke-virtual {v4, v5}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 322
    iget-object v4, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    and-int/lit16 v5, v0, 0xff

    shl-int/lit8 v5, v5, 0x18

    const v6, 0xffffff

    and-int/2addr v6, v1

    or-int/2addr v5, v6

    invoke-virtual {v4, v5}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 323
    iget-object v4, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    and-int v5, p3, v7

    invoke-virtual {v4, v5}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 324
    iget-object v4, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    and-int v5, p4, v7

    invoke-virtual {v4, v5}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 325
    iget-object v4, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    and-int/lit8 v5, p5, 0x7

    shl-int/lit8 v5, v5, 0xd

    or-int/lit8 v5, v5, 0x0

    and-int/lit16 v6, p6, 0xff

    or-int/2addr v5, v6

    invoke-virtual {v4, v5}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 326
    iget-object v4, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->nameValueBlockBuffer:Ljava/io/ByteArrayOutputStream;

    iget-object v5, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    invoke-virtual {v4, v5}, Ljava/io/ByteArrayOutputStream;->writeTo(Ljava/io/OutputStream;)V

    .line 327
    iget-object v4, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    invoke-virtual {v4}, Ljava/io/DataOutputStream;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 328
    monitor-exit p0

    return-void

    .end local v0    # "flags":I
    .end local v3    # "unused":I
    :cond_1
    move v5, v4

    .line 318
    goto :goto_0

    .line 315
    .end local v1    # "length":I
    .end local v2    # "type":I
    :catchall_0
    move-exception v4

    monitor-exit p0

    throw v4
.end method

.method public declared-synchronized windowUpdate(II)V
    .locals 5
    .param p1, "streamId"    # I
    .param p2, "deltaWindowSize"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 449
    monitor-enter p0

    const/16 v2, 0x9

    .line 450
    .local v2, "type":I
    const/4 v0, 0x0

    .line 451
    .local v0, "flags":I
    const/16 v1, 0x8

    .line 452
    .local v1, "length":I
    :try_start_0
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    const v4, -0x7ffcfff7

    invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 453
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    const/16 v4, 0x8

    invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 454
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    invoke-virtual {v3, p1}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 455
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    invoke-virtual {v3, p2}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 456
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/Spdy3$Writer;->out:Ljava/io/DataOutputStream;

    invoke-virtual {v3}, Ljava/io/DataOutputStream;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 457
    monitor-exit p0

    return-void

    .line 449
    :catchall_0
    move-exception v3

    monitor-exit p0

    throw v3
.end method
