.class public final Lcom/a/b/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x10
.end annotation


# instance fields
.field private a:Landroid/media/MediaCodec;

.field private b:[Ljava/nio/ByteBuffer;

.field private c:[Ljava/nio/ByteBuffer;

.field private d:Landroid/media/MediaFormat;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:I

.field private m:[B

.field private n:Z

.field private o:Landroid/media/MediaCodec$BufferInfo;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object v1, p0, Lcom/a/b/a;->a:Landroid/media/MediaCodec;

    .line 22
    iput-object v1, p0, Lcom/a/b/a;->b:[Ljava/nio/ByteBuffer;

    .line 23
    iput-object v1, p0, Lcom/a/b/a;->c:[Ljava/nio/ByteBuffer;

    .line 24
    iput-object v1, p0, Lcom/a/b/a;->d:Landroid/media/MediaFormat;

    .line 26
    const-string v0, "AndroidEncoder"

    iput-object v0, p0, Lcom/a/b/a;->e:Ljava/lang/String;

    .line 27
    iput-object v1, p0, Lcom/a/b/a;->f:Ljava/lang/String;

    .line 28
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    iput v0, p0, Lcom/a/b/a;->g:I

    .line 34
    const/4 v0, 0x1

    iput v0, p0, Lcom/a/b/a;->l:I

    .line 36
    iput-object v1, p0, Lcom/a/b/a;->m:[B

    .line 248
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/a/b/a;->n:Z

    .line 249
    new-instance v0, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {v0}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    iput-object v0, p0, Lcom/a/b/a;->o:Landroid/media/MediaCodec$BufferInfo;

    .line 19
    return-void
.end method


# virtual methods
.method public final a([BLcom/a/c/a;[BLcom/a/c/a;)I
    .locals 10

    .prologue
    const/4 v9, 0x1

    const/4 v8, -0x1

    const/4 v7, 0x0

    .line 255
    const/4 v0, 0x0

    :try_start_0
    iput v0, p4, Lcom/a/c/a;->d:I

    .line 256
    const/4 v0, 0x0

    iput v0, p4, Lcom/a/c/a;->a:I

    .line 257
    const/4 v0, 0x0

    iput v0, p4, Lcom/a/c/a;->b:I

    .line 259
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "EncodeFrame In buffer:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p2, Lcom/a/c/a;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", timestamp:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p2, Lcom/a/c/a;->c:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", flag = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p2, Lcom/a/c/a;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 260
    const-string v1, ", outbuffer:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    array-length v1, p3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 261
    iget-boolean v0, p0, Lcom/a/b/a;->n:Z

    if-nez v0, :cond_2

    .line 262
    if-eqz p1, :cond_0

    iget v0, p2, Lcom/a/c/a;->d:I

    if-nez v0, :cond_1

    :cond_0
    iget v0, p2, Lcom/a/c/a;->a:I

    if-ne v8, v0, :cond_2

    .line 264
    :cond_1
    iget-object v0, p0, Lcom/a/b/a;->a:Landroid/media/MediaCodec;

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v2, v3}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    move-result v1

    .line 267
    if-eq v1, v8, :cond_2

    .line 269
    if-ltz v1, :cond_2

    .line 270
    iget v0, p2, Lcom/a/c/a;->a:I

    if-eq v8, v0, :cond_4

    .line 271
    iget-object v0, p0, Lcom/a/b/a;->c:[Ljava/nio/ByteBuffer;

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 272
    iget-object v0, p0, Lcom/a/b/a;->c:[Ljava/nio/ByteBuffer;

    aget-object v0, v0, v1

    .line 273
    iget v2, p2, Lcom/a/c/a;->b:I

    iget v3, p2, Lcom/a/c/a;->d:I

    .line 272
    invoke-virtual {v0, p1, v2, v3}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 279
    :goto_0
    iget-object v0, p0, Lcom/a/b/a;->a:Landroid/media/MediaCodec;

    .line 281
    const/4 v2, 0x0

    .line 282
    iget v3, p2, Lcom/a/c/a;->d:I

    .line 283
    iget-wide v4, p2, Lcom/a/c/a;->c:J

    .line 284
    iget v6, p2, Lcom/a/c/a;->a:I

    if-ne v8, v6, :cond_5

    const/4 v6, 0x4

    .line 279
    :goto_1
    invoke-virtual/range {v0 .. v6}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 290
    :cond_2
    iget-object v0, p0, Lcom/a/b/a;->a:Landroid/media/MediaCodec;

    iget-object v1, p0, Lcom/a/b/a;->o:Landroid/media/MediaCodec$BufferInfo;

    .line 291
    const-wide/16 v2, 0x2710

    .line 290
    invoke-virtual {v0, v1, v2, v3}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    move-result v0

    .line 292
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "encode dequeue output buffer:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 293
    const-string v2, ", buffer flag:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/a/b/a;->o:Landroid/media/MediaCodec$BufferInfo;

    iget v2, v2, Landroid/media/MediaCodec$BufferInfo;->flags:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", size:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 294
    iget-object v2, p0, Lcom/a/b/a;->o:Landroid/media/MediaCodec$BufferInfo;

    iget v2, v2, Landroid/media/MediaCodec$BufferInfo;->size:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 295
    const-string v2, ",mOutBufferInfo.presentationTimeUs:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 296
    iget-object v2, p0, Lcom/a/b/a;->o:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v2, v2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 297
    if-ltz v0, :cond_9

    .line 299
    iget-object v1, p0, Lcom/a/b/a;->b:[Ljava/nio/ByteBuffer;

    aget-object v1, v1, v0

    .line 300
    iget-object v2, p0, Lcom/a/b/a;->o:Landroid/media/MediaCodec$BufferInfo;

    iget v2, v2, Landroid/media/MediaCodec$BufferInfo;->offset:I

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 301
    iget-object v2, p0, Lcom/a/b/a;->o:Landroid/media/MediaCodec$BufferInfo;

    iget v2, v2, Landroid/media/MediaCodec$BufferInfo;->offset:I

    iget-object v3, p0, Lcom/a/b/a;->o:Landroid/media/MediaCodec$BufferInfo;

    iget v3, v3, Landroid/media/MediaCodec$BufferInfo;->size:I

    add-int/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 303
    const/4 v2, 0x0

    iput v2, p4, Lcom/a/c/a;->b:I

    .line 304
    iget-object v2, p0, Lcom/a/b/a;->o:Landroid/media/MediaCodec$BufferInfo;

    iget v2, v2, Landroid/media/MediaCodec$BufferInfo;->size:I

    iput v2, p4, Lcom/a/c/a;->d:I

    .line 306
    iget-object v2, p0, Lcom/a/b/a;->o:Landroid/media/MediaCodec$BufferInfo;

    iget v2, v2, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v2, v2, 0x2

    if-eqz v2, :cond_6

    .line 307
    const/4 v2, 0x2

    iput v2, p4, Lcom/a/c/a;->a:I

    .line 308
    iget v2, p4, Lcom/a/c/a;->d:I

    new-array v2, v2, [B

    iput-object v2, p0, Lcom/a/b/a;->m:[B

    .line 309
    iget-object v2, p0, Lcom/a/b/a;->m:[B

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 311
    iget-object v1, p0, Lcom/a/b/a;->m:[B

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 312
    iget v4, p4, Lcom/a/c/a;->d:I

    .line 311
    invoke-static {v1, v2, p3, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 325
    :goto_2
    iget-object v1, p0, Lcom/a/b/a;->a:Landroid/media/MediaCodec;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    :cond_3
    :goto_3
    move v0, v7

    .line 336
    :goto_4
    return v0

    .line 276
    :cond_4
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/a/b/a;->n:Z

    goto/16 :goto_0

    .line 336
    :catch_0
    move-exception v0

    move v0, v8

    goto :goto_4

    :cond_5
    move v6, v7

    .line 285
    goto/16 :goto_1

    .line 313
    :cond_6
    iget-object v2, p0, Lcom/a/b/a;->o:Landroid/media/MediaCodec$BufferInfo;

    iget v2, v2, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v2, v2, 0x4

    if-eqz v2, :cond_7

    .line 314
    const/4 v1, -0x1

    iput v1, p4, Lcom/a/c/a;->a:I

    goto :goto_2

    .line 316
    :cond_7
    iget-object v2, p0, Lcom/a/b/a;->o:Landroid/media/MediaCodec$BufferInfo;

    iget v2, v2, Landroid/media/MediaCodec$BufferInfo;->flags:I

    if-ne v2, v9, :cond_8

    .line 317
    const/4 v2, 0x1

    iput v2, p4, Lcom/a/c/a;->a:I

    .line 320
    :goto_5
    const/4 v2, 0x0

    iget v3, p4, Lcom/a/c/a;->d:I

    invoke-virtual {v1, p3, v2, v3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    goto :goto_2

    .line 319
    :cond_8
    const/4 v2, 0x0

    iput v2, p4, Lcom/a/c/a;->a:I

    goto :goto_5

    .line 326
    :cond_9
    const/4 v1, -0x3

    if-ne v0, v1, :cond_a

    .line 327
    iget-object v0, p0, Lcom/a/b/a;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/a/b/a;->b:[Ljava/nio/ByteBuffer;

    goto :goto_3

    .line 329
    :cond_a
    const/4 v1, -0x2

    if-ne v0, v1, :cond_3

    .line 330
    iget-object v0, p0, Lcom/a/b/a;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    move-result-object v0

    iput-object v0, p0, Lcom/a/b/a;->d:Landroid/media/MediaFormat;

    .line 331
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "encoder format changed"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/a/b/a;->d:Landroid/media/MediaFormat;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 343
    :try_start_0
    iget-object v0, p0, Lcom/a/b/a;->a:Landroid/media/MediaCodec;

    if-eqz v0, :cond_0

    .line 344
    iget-object v0, p0, Lcom/a/b/a;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V

    .line 345
    iget-object v0, p0, Lcom/a/b/a;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    .line 346
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/a/b/a;->a:Landroid/media/MediaCodec;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 351
    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public final a(Lcom/a/c/c;)Z
    .locals 8

    .prologue
    const/4 v1, 0x1

    const-wide/high16 v6, 0x403c000000000000L    # 28.0

    const/4 v0, 0x0

    .line 81
    :try_start_0
    iget v2, p0, Lcom/a/b/a;->g:I

    const/16 v3, 0x10

    if-ge v2, v3, :cond_1

    .line 153
    :cond_0
    :goto_0
    return v0

    .line 1057
    :cond_1
    iget-object v2, p1, Lcom/a/c/c;->a:Ljava/lang/String;

    if-nez v2, :cond_2

    .line 1058
    iget-object v2, p0, Lcom/a/b/a;->e:Ljava/lang/String;

    const-string v3, "invalid param for mime type"

    invoke-static {v2, v3}, Lcom/a/c/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    move v2, v0

    .line 84
    :goto_1
    if-eqz v2, :cond_0

    .line 87
    iget-object v2, p1, Lcom/a/c/c;->a:Ljava/lang/String;

    invoke-static {v2}, Landroid/media/MediaCodec;->createEncoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object v2

    iput-object v2, p0, Lcom/a/b/a;->a:Landroid/media/MediaCodec;

    .line 88
    iget-object v2, p0, Lcom/a/b/a;->a:Landroid/media/MediaCodec;

    if-nez v2, :cond_7

    .line 89
    iget-object v1, p0, Lcom/a/b/a;->e:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "create encoder failed with mimeType = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 90
    iget-object v3, p1, Lcom/a/c/c;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 89
    invoke-static {v1, v2}, Lcom/a/c/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 153
    :catch_0
    move-exception v1

    goto :goto_0

    .line 1061
    :cond_2
    iget v2, p1, Lcom/a/c/c;->b:I

    if-lez v2, :cond_3

    iget v2, p1, Lcom/a/c/c;->c:I

    if-gtz v2, :cond_4

    .line 1062
    :cond_3
    iget-object v2, p0, Lcom/a/b/a;->e:Ljava/lang/String;

    const-string v3, "invalid param for width/height"

    invoke-static {v2, v3}, Lcom/a/c/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    move v2, v0

    .line 1063
    goto :goto_1

    .line 1066
    :cond_4
    const/4 v2, 0x0

    iget v3, p1, Lcom/a/c/c;->e:I

    int-to-float v3, v3

    cmpl-float v2, v2, v3

    if-ltz v2, :cond_5

    .line 1067
    iget-object v2, p0, Lcom/a/b/a;->e:Ljava/lang/String;

    const-string v3, "invalid param for framerate"

    invoke-static {v2, v3}, Lcom/a/c/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    move v2, v0

    .line 1068
    goto :goto_1

    .line 1070
    :cond_5
    iget v2, p1, Lcom/a/c/c;->d:I

    if-gtz v2, :cond_6

    .line 1071
    iget-object v2, p0, Lcom/a/b/a;->e:Ljava/lang/String;

    const-string v3, "invalid param for bitrate"

    invoke-static {v2, v3}, Lcom/a/c/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    move v2, v0

    .line 1072
    goto :goto_1

    :cond_6
    move v2, v1

    .line 1075
    goto :goto_1

    .line 102
    :cond_7
    iget-object v2, p1, Lcom/a/c/c;->a:Ljava/lang/String;

    iput-object v2, p0, Lcom/a/b/a;->f:Ljava/lang/String;

    .line 103
    iget-object v2, p0, Lcom/a/b/a;->f:Ljava/lang/String;

    const-string v3, "video/"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 104
    iget-object v2, p0, Lcom/a/b/a;->f:Ljava/lang/String;

    .line 105
    iget v3, p1, Lcom/a/c/c;->b:I

    iget v4, p1, Lcom/a/c/c;->c:I

    .line 104
    invoke-static {v2, v3, v4}, Landroid/media/MediaFormat;->createVideoFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    move-result-object v2

    iput-object v2, p0, Lcom/a/b/a;->d:Landroid/media/MediaFormat;

    .line 106
    iget v2, p1, Lcom/a/c/c;->b:I

    int-to-double v2, v2

    iget v4, p1, Lcom/a/c/c;->c:I

    int-to-double v4, v4

    mul-double/2addr v2, v4

    .line 107
    iget v4, p1, Lcom/a/c/c;->e:I

    int-to-double v4, v4

    mul-double/2addr v2, v4

    div-double/2addr v2, v6

    const-wide/high16 v4, 0x4030000000000000L    # 16.0

    mul-double/2addr v2, v4

    div-double/2addr v2, v6

    const-wide/high16 v4, 0x4060000000000000L    # 128.0

    mul-double/2addr v2, v4

    div-double/2addr v2, v6

    double-to-int v2, v2

    .line 106
    iput v2, p1, Lcom/a/c/c;->d:I

    .line 108
    iget-object v2, p0, Lcom/a/b/a;->d:Landroid/media/MediaFormat;

    const-string v3, "bitrate"

    iget v4, p1, Lcom/a/c/c;->d:I

    invoke-virtual {v2, v3, v4}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 109
    iget-object v2, p0, Lcom/a/b/a;->d:Landroid/media/MediaFormat;

    const-string v3, "frame-rate"

    .line 110
    iget v4, p1, Lcom/a/c/c;->e:I

    .line 109
    invoke-virtual {v2, v3, v4}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 111
    iget-object v2, p0, Lcom/a/b/a;->d:Landroid/media/MediaFormat;

    const-string v3, "color-format"

    .line 112
    iget v4, p1, Lcom/a/c/c;->f:I

    .line 111
    invoke-virtual {v2, v3, v4}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 114
    iget-object v2, p0, Lcom/a/b/a;->d:Landroid/media/MediaFormat;

    const-string v3, "bitrate-mode"

    .line 115
    const/4 v4, 0x0

    .line 114
    invoke-virtual {v2, v3, v4}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 118
    iget-object v2, p0, Lcom/a/b/a;->d:Landroid/media/MediaFormat;

    const-string v3, "i-frame-interval"

    .line 119
    iget v4, p0, Lcom/a/b/a;->l:I

    .line 118
    invoke-virtual {v2, v3, v4}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 121
    iget v2, p1, Lcom/a/c/c;->b:I

    iput v2, p0, Lcom/a/b/a;->h:I

    .line 122
    iget v2, p1, Lcom/a/c/c;->c:I

    iput v2, p0, Lcom/a/b/a;->i:I

    .line 123
    iget v2, p1, Lcom/a/c/c;->d:I

    iput v2, p0, Lcom/a/b/a;->k:I

    .line 124
    iget v2, p1, Lcom/a/c/c;->e:I

    iput v2, p0, Lcom/a/b/a;->j:I

    .line 125
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Encoder Video Info: width = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, p0, Lcom/a/b/a;->h:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 126
    const-string v3, ", height = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/a/b/a;->i:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", bitrate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/a/b/a;->k:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 127
    const-string v3, ", FrameRate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/a/b/a;->j:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 138
    :goto_2
    iget-object v2, p0, Lcom/a/b/a;->a:Landroid/media/MediaCodec;

    iget-object v3, p0, Lcom/a/b/a;->d:Landroid/media/MediaFormat;

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 139
    const/4 v6, 0x1

    .line 138
    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 140
    iget-object v2, p0, Lcom/a/b/a;->a:Landroid/media/MediaCodec;

    invoke-virtual {v2}, Landroid/media/MediaCodec;->start()V

    .line 142
    iget-object v2, p0, Lcom/a/b/a;->a:Landroid/media/MediaCodec;

    invoke-virtual {v2}, Landroid/media/MediaCodec;->getInputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, p0, Lcom/a/b/a;->c:[Ljava/nio/ByteBuffer;

    .line 143
    iget-object v2, p0, Lcom/a/b/a;->a:Landroid/media/MediaCodec;

    invoke-virtual {v2}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v2

    iput-object v2, p0, Lcom/a/b/a;->b:[Ljava/nio/ByteBuffer;

    move v0, v1

    .line 150
    goto/16 :goto_0

    .line 129
    :cond_8
    iget-object v2, p0, Lcom/a/b/a;->f:Ljava/lang/String;

    .line 130
    iget v3, p1, Lcom/a/c/c;->h:I

    iget v4, p1, Lcom/a/c/c;->g:I

    .line 129
    invoke-static {v2, v3, v4}, Landroid/media/MediaFormat;->createAudioFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    move-result-object v2

    iput-object v2, p0, Lcom/a/b/a;->d:Landroid/media/MediaFormat;

    .line 131
    iget-object v2, p0, Lcom/a/b/a;->d:Landroid/media/MediaFormat;

    const-string v3, "aac-profile"

    .line 132
    const/4 v4, 0x2

    .line 131
    invoke-virtual {v2, v3, v4}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 133
    iget-object v2, p0, Lcom/a/b/a;->d:Landroid/media/MediaFormat;

    const-string v3, "bitrate"

    iget v4, p1, Lcom/a/c/c;->d:I

    invoke-virtual {v2, v3, v4}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 134
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Encoder Audio Info: samplingrate = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 135
    iget v3, p1, Lcom/a/c/c;->h:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", channels = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Lcom/a/c/c;->g:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2
.end method

.method public final a(Ljava/lang/String;)[I
    .locals 11

    .prologue
    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 160
    :try_start_0
    invoke-static {}, Landroid/media/MediaCodecList;->getCodecCount()I

    move-result v7

    move v6, v4

    move-object v1, v3

    .line 163
    :goto_0
    if-ge v6, v7, :cond_0

    if-eqz v1, :cond_1

    .line 182
    :cond_0
    if-nez v1, :cond_5

    .line 183
    iget-object v0, p0, Lcom/a/b/a;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "can\'t support encoder for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/a/c/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v3

    .line 244
    :goto_1
    return-object v0

    .line 164
    :cond_1
    invoke-static {v6}, Landroid/media/MediaCodecList;->getCodecInfoAt(I)Landroid/media/MediaCodecInfo;

    move-result-object v0

    .line 165
    invoke-virtual {v0}, Landroid/media/MediaCodecInfo;->isEncoder()Z

    move-result v2

    if-eqz v2, :cond_7

    .line 168
    invoke-virtual {v0}, Landroid/media/MediaCodecInfo;->getSupportedTypes()[Ljava/lang/String;

    move-result-object v8

    .line 169
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "EncodeVideoTest Encoder Name:"

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v5, v4

    move v2, v4

    .line 171
    :goto_2
    array-length v9, v8

    if-ge v5, v9, :cond_2

    if-eqz v2, :cond_3

    .line 178
    :cond_2
    if-eqz v2, :cond_7

    .line 163
    :goto_3
    add-int/lit8 v1, v6, 0x1

    move v6, v1

    move-object v1, v0

    goto :goto_0

    .line 173
    :cond_3
    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "EncodeVideoTest Encoder SupportedTypes count:"

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 174
    aget-object v10, v8, v5

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    aget-object v9, v8, v5

    invoke-virtual {v9, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 176
    const/4 v2, 0x1

    .line 171
    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 186
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Found "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " supporting "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 187
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    invoke-virtual {v1, p1}, Landroid/media/MediaCodecInfo;->getCapabilitiesForType(Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;

    move-result-object v1

    move v0, v4

    .line 192
    :goto_4
    iget-object v2, v1, Landroid/media/MediaCodecInfo$CodecCapabilities;->colorFormats:[I

    array-length v2, v2

    if-lt v0, v2, :cond_6

    .line 242
    iget-object v0, v1, Landroid/media/MediaCodecInfo$CodecCapabilities;->colorFormats:[I

    goto :goto_1

    .line 194
    :cond_6
    iget-object v2, v1, Landroid/media/MediaCodecInfo$CodecCapabilities;->colorFormats:[I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 192
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 244
    :catch_0
    move-exception v0

    move-object v0, v3

    goto :goto_1

    :cond_7
    move-object v0, v1

    goto :goto_3
.end method
