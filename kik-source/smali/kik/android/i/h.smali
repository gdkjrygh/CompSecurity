.class public Lkik/android/i/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x12
.end annotation


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Landroid/graphics/Point;

.field private e:I

.field private f:I

.field private g:Lcom/kik/g/p;

.field private h:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 36
    const-class v0, Lkik/android/i/h;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkik/android/i/h;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Point;II)V
    .locals 8

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    iput-object v0, p0, Lkik/android/i/h;->g:Lcom/kik/g/p;

    .line 52
    iput-object p1, p0, Lkik/android/i/h;->b:Ljava/lang/String;

    .line 53
    iput-object p2, p0, Lkik/android/i/h;->c:Ljava/lang/String;

    .line 54
    iput p5, p0, Lkik/android/i/h;->e:I

    .line 55
    iput p4, p0, Lkik/android/i/h;->f:I

    .line 56
    const/16 v0, 0x14

    invoke-static {v0}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 58
    iget v0, p0, Lkik/android/i/h;->f:I

    const/16 v1, 0x5a

    if-eq v0, v1, :cond_0

    iget v0, p0, Lkik/android/i/h;->f:I

    const/16 v1, 0x10e

    if-ne v0, v1, :cond_1

    .line 59
    :cond_0
    iget v0, p3, Landroid/graphics/Point;->x:I

    .line 60
    iget v1, p3, Landroid/graphics/Point;->y:I

    iput v1, p3, Landroid/graphics/Point;->x:I

    .line 61
    iput v0, p3, Landroid/graphics/Point;->y:I

    .line 63
    :cond_1
    const/4 v0, 0x0

    iput v0, p0, Lkik/android/i/h;->f:I

    .line 65
    :cond_2
    iget v1, p3, Landroid/graphics/Point;->x:I

    iget v0, p3, Landroid/graphics/Point;->y:I

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v2

    const/16 v3, 0x280

    if-gt v2, v3, :cond_4

    :cond_3
    :goto_0
    new-instance v2, Landroid/graphics/Point;

    invoke-direct {v2, v1, v0}, Landroid/graphics/Point;-><init>(II)V

    iput-object v2, p0, Lkik/android/i/h;->d:Landroid/graphics/Point;

    .line 66
    return-void

    .line 65
    :cond_4
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    int-to-double v4, v0

    int-to-double v6, v2

    div-double/2addr v4, v6

    if-ne v2, v1, :cond_6

    const/16 v1, 0x280

    const-wide/high16 v2, 0x4084000000000000L    # 640.0

    mul-double/2addr v2, v4

    double-to-int v0, v2

    :goto_1
    rem-int/lit8 v2, v1, 0x10

    if-eqz v2, :cond_5

    int-to-float v1, v1

    const/high16 v2, 0x41800000    # 16.0f

    div-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    mul-int/lit8 v1, v1, 0x10

    :cond_5
    rem-int/lit8 v2, v0, 0x10

    if-eqz v2, :cond_3

    int-to-float v0, v0

    const/high16 v2, 0x41800000    # 16.0f

    div-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x10

    goto :goto_0

    :cond_6
    const/16 v0, 0x280

    const-wide/high16 v2, 0x4084000000000000L    # 640.0

    mul-double/2addr v2, v4

    double-to-int v1, v2

    goto :goto_1
.end method

.method private static a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 316
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private b()V
    .locals 4

    .prologue
    .line 305
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lkik/android/i/h;->h:J

    sub-long/2addr v0, v2

    .line 306
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lkik/android/i/h;->g:Lcom/kik/g/p;

    invoke-virtual {v2}, Lcom/kik/g/p;->j()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 307
    :cond_0
    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    throw v0

    .line 309
    :cond_1
    const-wide/32 v2, 0x2bf20

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 310
    new-instance v0, Ljava/util/concurrent/TimeoutException;

    invoke-direct {v0}, Ljava/util/concurrent/TimeoutException;-><init>()V

    throw v0

    .line 312
    :cond_2
    return-void
.end method


# virtual methods
.method public final a()Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lkik/android/i/h;->g:Lcom/kik/g/p;

    return-object v0
.end method

.method public run()V
    .locals 29

    .prologue
    .line 76
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    move-object/from16 v0, p0

    iput-wide v4, v0, Lkik/android/i/h;->h:J

    .line 78
    const/4 v8, 0x0

    const/4 v7, 0x0

    .line 79
    const/4 v4, 0x0

    .line 80
    const/4 v6, 0x0

    .line 81
    new-instance v21, Landroid/media/MediaExtractor;

    invoke-direct/range {v21 .. v21}, Landroid/media/MediaExtractor;-><init>()V

    .line 82
    const/4 v5, 0x0

    .line 84
    const/4 v12, 0x0

    const/4 v11, 0x0

    const/4 v10, 0x0

    .line 85
    new-instance v22, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct/range {v22 .. v22}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 88
    :try_start_0
    const-string v9, "video/avc"

    move-object/from16 v0, p0

    iget-object v13, v0, Lkik/android/i/h;->d:Landroid/graphics/Point;

    iget v13, v13, Landroid/graphics/Point;->x:I

    move-object/from16 v0, p0

    iget-object v14, v0, Lkik/android/i/h;->d:Landroid/graphics/Point;

    iget v14, v14, Landroid/graphics/Point;->y:I

    invoke-static {v9, v13, v14}, Landroid/media/MediaFormat;->createVideoFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    move-result-object v9

    .line 89
    const-string v13, "max-input-size"

    const/4 v14, 0x0

    invoke-virtual {v9, v13, v14}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 90
    const-string v13, "color-format"

    const v14, 0x7f000789

    invoke-virtual {v9, v13, v14}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 91
    const-string v13, "bitrate"

    move-object/from16 v0, p0

    iget v14, v0, Lkik/android/i/h;->e:I

    invoke-virtual {v9, v13, v14}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 92
    const-string v13, "frame-rate"

    const/16 v14, 0x1e

    invoke-virtual {v9, v13, v14}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 93
    const-string v13, "i-frame-interval"

    const/4 v14, 0x1

    invoke-virtual {v9, v13, v14}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 95
    const-string v13, "video/avc"

    invoke-static {v13}, Landroid/media/MediaCodec;->createEncoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v15

    .line 96
    const/4 v7, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x1

    :try_start_1
    invoke-virtual {v15, v9, v7, v13, v14}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 97
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v13, "Configured encoder with format: "

    invoke-direct {v7, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    new-instance v14, Lkik/android/i/e;

    invoke-virtual {v15}, Landroid/media/MediaCodec;->createInputSurface()Landroid/view/Surface;

    move-result-object v7

    invoke-direct {v14, v7}, Lkik/android/i/e;-><init>(Landroid/view/Surface;)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_9
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 99
    :try_start_2
    invoke-virtual {v14}, Lkik/android/i/e;->b()V

    .line 100
    invoke-virtual {v15}, Landroid/media/MediaCodec;->start()V

    .line 102
    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/i/h;->b:Ljava/lang/String;

    move-object/from16 v0, v21

    invoke-virtual {v0, v4}, Landroid/media/MediaExtractor;->setDataSource(Ljava/lang/String;)V

    .line 103
    const/4 v4, 0x1

    move-object/from16 v0, v21

    invoke-static {v0, v4}, Lkik/android/util/ak;->a(Landroid/media/MediaExtractor;Z)I

    move-result v9

    .line 104
    const/4 v4, 0x0

    move-object/from16 v0, v21

    invoke-static {v0, v4}, Lkik/android/util/ak;->a(Landroid/media/MediaExtractor;Z)I

    move-result v7

    .line 105
    move-object/from16 v0, v21

    invoke-virtual {v0, v9}, Landroid/media/MediaExtractor;->selectTrack(I)V

    .line 107
    move-object/from16 v0, v21

    invoke-virtual {v0, v9}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    move-result-object v16

    .line 108
    const-string v4, "mime"

    move-object/from16 v0, v16

    invoke-virtual {v0, v4}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/media/MediaCodec;->createDecoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_a
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-result-object v4

    .line 109
    :try_start_3
    new-instance v13, Lkik/android/i/f;

    invoke-direct {v13}, Lkik/android/i/f;-><init>()V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_b
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 111
    :try_start_4
    invoke-virtual {v13}, Lkik/android/i/f;->b()Landroid/view/Surface;

    move-result-object v6

    const/4 v8, 0x0

    const/16 v17, 0x0

    move-object/from16 v0, v16

    move/from16 v1, v17

    invoke-virtual {v4, v0, v6, v8, v1}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 112
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v8, "Configured decoder with format: "

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v16

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    invoke-virtual {v4}, Landroid/media/MediaCodec;->start()V

    .line 115
    invoke-virtual {v4}, Landroid/media/MediaCodec;->getInputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v23

    .line 116
    invoke-virtual {v15}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_c
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_5
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    move-result-object v6

    move-object/from16 v16, v6

    move/from16 v17, v7

    move/from16 v18, v9

    move/from16 v19, v10

    move/from16 v20, v12

    move-object v12, v5

    .line 118
    :goto_0
    if-nez v20, :cond_18

    .line 119
    :try_start_5
    invoke-direct/range {p0 .. p0}, Lkik/android/i/h;->b()V

    .line 121
    if-nez v11, :cond_2

    .line 123
    const-wide/16 v6, 0x9c4

    invoke-virtual {v4, v6, v7}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    move-result v5

    .line 124
    if-ltz v5, :cond_2

    .line 125
    aget-object v6, v23, v5

    .line 126
    const/4 v7, 0x0

    move-object/from16 v0, v21

    invoke-virtual {v0, v6, v7}, Landroid/media/MediaExtractor;->readSampleData(Ljava/nio/ByteBuffer;I)I

    move-result v7

    .line 127
    if-gez v7, :cond_1

    .line 128
    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x4

    invoke-virtual/range {v4 .. v10}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_f
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_8
    .catchall {:try_start_5 .. :try_end_5} :catchall_7

    .line 130
    const/4 v5, 0x1

    .line 136
    :goto_1
    const/4 v7, 0x1

    .line 143
    const/4 v6, 0x1

    move-object/from16 v8, v16

    move/from16 v9, v17

    move/from16 v10, v19

    move/from16 v11, v20

    move/from16 v16, v7

    move/from16 v7, v18

    move/from16 v28, v6

    move-object v6, v12

    move/from16 v12, v28

    .line 144
    :goto_2
    if-nez v16, :cond_0

    if-eqz v12, :cond_17

    .line 145
    :cond_0
    :try_start_6
    invoke-direct/range {p0 .. p0}, Lkik/android/i/h;->b()V

    .line 149
    const-wide/16 v18, 0x9c4

    move-object/from16 v0, v22

    move-wide/from16 v1, v18

    invoke-virtual {v15, v0, v1, v2}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    move-result v19

    .line 150
    const/16 v17, -0x1

    move/from16 v0, v19

    move/from16 v1, v17

    if-ne v0, v1, :cond_3

    .line 151
    const/4 v12, 0x0

    move/from16 v17, v9

    move/from16 v18, v7

    move-object v9, v8

    move v8, v12

    .line 201
    :goto_3
    const/4 v7, -0x1

    move/from16 v0, v19

    if-ne v0, v7, :cond_2a

    .line 202
    invoke-direct/range {p0 .. p0}, Lkik/android/i/h;->b()V

    .line 207
    const-wide/16 v24, 0x9c4

    move-object/from16 v0, v22

    move-wide/from16 v1, v24

    invoke-virtual {v4, v0, v1, v2}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I
    :try_end_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_e
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_7
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    move-result v12

    .line 212
    const/4 v7, -0x1

    if-ne v12, v7, :cond_11

    .line 214
    const/4 v7, 0x0

    move v12, v8

    move/from16 v16, v7

    move-object v8, v9

    move/from16 v7, v18

    move/from16 v9, v17

    goto :goto_2

    .line 133
    :cond_1
    const/4 v6, 0x0

    :try_start_7
    invoke-virtual/range {v21 .. v21}, Landroid/media/MediaExtractor;->getSampleTime()J

    move-result-wide v8

    const/4 v10, 0x0

    invoke-virtual/range {v4 .. v10}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 134
    invoke-virtual/range {v21 .. v21}, Landroid/media/MediaExtractor;->advance()Z
    :try_end_7
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_7} :catch_f
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_8
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    :cond_2
    move v5, v11

    goto :goto_1

    .line 154
    :cond_3
    const/16 v17, -0x3

    move/from16 v0, v19

    move/from16 v1, v17

    if-ne v0, v1, :cond_4

    .line 155
    :try_start_8
    invoke-virtual {v15}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v8

    move/from16 v17, v9

    move/from16 v18, v7

    move-object v9, v8

    move v8, v12

    .line 156
    goto :goto_3

    .line 158
    :cond_4
    const/16 v17, -0x2

    move/from16 v0, v19

    move/from16 v1, v17

    if-ne v0, v1, :cond_7

    .line 160
    if-eqz v10, :cond_5

    .line 161
    const-string v7, "format changed twice"

    invoke-static {v7}, Lkik/android/i/h;->a(Ljava/lang/String;)V

    .line 163
    :cond_5
    invoke-virtual {v15}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    move-result-object v10

    .line 164
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v17, "encoder output format changed: "

    move-object/from16 v0, v17

    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 167
    new-instance v7, Landroid/media/MediaMuxer;

    move-object/from16 v0, p0

    iget-object v0, v0, Lkik/android/i/h;->c:Ljava/lang/String;

    move-object/from16 v17, v0

    const/16 v18, 0x0

    move-object/from16 v0, v17

    move/from16 v1, v18

    invoke-direct {v7, v0, v1}, Landroid/media/MediaMuxer;-><init>(Ljava/lang/String;I)V
    :try_end_8
    .catch Ljava/lang/InterruptedException; {:try_start_8 .. :try_end_8} :catch_e
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 168
    :try_start_9
    invoke-virtual {v7, v10}, Landroid/media/MediaMuxer;->addTrack(Landroid/media/MediaFormat;)I

    move-result v18

    .line 169
    if-lez v9, :cond_6

    .line 170
    move-object/from16 v0, v21

    invoke-virtual {v0, v9}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    move-result-object v6

    .line 171
    invoke-virtual {v7, v6}, Landroid/media/MediaMuxer;->addTrack(Landroid/media/MediaFormat;)I

    move-result v9

    .line 173
    :cond_6
    move-object/from16 v0, p0

    iget v6, v0, Lkik/android/i/h;->f:I

    invoke-virtual {v7, v6}, Landroid/media/MediaMuxer;->setOrientationHint(I)V

    .line 174
    invoke-virtual {v7}, Landroid/media/MediaMuxer;->start()V
    :try_end_9
    .catch Ljava/lang/InterruptedException; {:try_start_9 .. :try_end_9} :catch_d
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 175
    const/4 v10, 0x1

    move/from16 v17, v9

    move-object v6, v7

    move-object v9, v8

    move v8, v12

    .line 176
    goto/16 :goto_3

    .line 177
    :cond_7
    if-gez v19, :cond_b

    .line 178
    :try_start_a
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v7, "unexpected result from encoder.dequeueOutputBuffer: "

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move/from16 v0, v19

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lkik/android/i/h;->a(Ljava/lang/String;)V
    :try_end_a
    .catch Ljava/lang/InterruptedException; {:try_start_a .. :try_end_a} :catch_e
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_7
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 282
    if-eqz v15, :cond_8

    .line 283
    invoke-virtual {v15}, Landroid/media/MediaCodec;->release()V

    .line 285
    :cond_8
    if-eqz v4, :cond_9

    .line 286
    invoke-virtual {v4}, Landroid/media/MediaCodec;->release()V

    .line 288
    :cond_9
    invoke-virtual {v14}, Lkik/android/i/e;->a()V

    .line 291
    invoke-virtual {v13}, Lkik/android/i/f;->a()V

    .line 294
    if-eqz v6, :cond_a

    .line 295
    invoke-virtual {v6}, Landroid/media/MediaMuxer;->release()V

    .line 301
    :cond_a
    :goto_4
    return-void

    .line 182
    :cond_b
    :try_start_b
    aget-object v11, v8, v19

    .line 183
    if-nez v11, :cond_c

    .line 184
    new-instance v17, Ljava/lang/StringBuilder;

    const-string v18, "encoderOutputBuffer "

    invoke-direct/range {v17 .. v18}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v17

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v17

    const-string v18, " was null"

    invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Lkik/android/i/h;->a(Ljava/lang/String;)V

    .line 187
    :cond_c
    move-object/from16 v0, v22

    iget v0, v0, Landroid/media/MediaCodec$BufferInfo;->size:I

    move/from16 v17, v0

    if-eqz v17, :cond_f

    .line 188
    if-eqz v10, :cond_d

    if-nez v6, :cond_e

    .line 189
    :cond_d
    const-string v17, "muxer hasn\'t started"

    invoke-static/range {v17 .. v17}, Lkik/android/i/h;->a(Ljava/lang/String;)V

    .line 192
    :cond_e
    move-object/from16 v0, v22

    iget v0, v0, Landroid/media/MediaCodec$BufferInfo;->offset:I

    move/from16 v17, v0

    move/from16 v0, v17

    invoke-virtual {v11, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 193
    move-object/from16 v0, v22

    iget v0, v0, Landroid/media/MediaCodec$BufferInfo;->offset:I

    move/from16 v17, v0

    move-object/from16 v0, v22

    iget v0, v0, Landroid/media/MediaCodec$BufferInfo;->size:I

    move/from16 v18, v0

    add-int v17, v17, v18

    move/from16 v0, v17

    invoke-virtual {v11, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 195
    move-object/from16 v0, v22

    invoke-virtual {v6, v7, v11, v0}, Landroid/media/MediaMuxer;->writeSampleData(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    .line 196
    new-instance v11, Ljava/lang/StringBuilder;

    const-string v17, "sent "

    move-object/from16 v0, v17

    invoke-direct {v11, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v22

    iget v0, v0, Landroid/media/MediaCodec$BufferInfo;->size:I

    move/from16 v17, v0

    move/from16 v0, v17

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v17, " bytes to buffer"

    move-object/from16 v0, v17

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    :cond_f
    move-object/from16 v0, v22

    iget v11, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v11, v11, 0x4

    if-eqz v11, :cond_10

    const/4 v11, 0x1

    .line 199
    :goto_5
    const/16 v17, 0x0

    move/from16 v0, v19

    move/from16 v1, v17

    invoke-virtual {v15, v0, v1}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    move/from16 v17, v9

    move/from16 v18, v7

    move-object v9, v8

    move v8, v12

    goto/16 :goto_3

    .line 198
    :cond_10
    const/4 v11, 0x0

    goto :goto_5

    .line 217
    :cond_11
    const/4 v7, -0x3

    if-eq v12, v7, :cond_15

    .line 219
    const/4 v7, -0x2

    if-ne v12, v7, :cond_12

    .line 223
    invoke-virtual {v4}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    move-result-object v7

    .line 224
    new-instance v12, Ljava/lang/StringBuilder;

    const-string v19, "decoder output format changed: "

    move-object/from16 v0, v19

    invoke-direct {v12, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move v12, v8

    move/from16 v7, v18

    move-object v8, v9

    move/from16 v9, v17

    .line 225
    goto/16 :goto_2

    .line 226
    :cond_12
    if-gez v12, :cond_13

    .line 227
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v19, "unexpected result from decoder.dequeueOutputBuffer: "

    move-object/from16 v0, v19

    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lkik/android/i/h;->a(Ljava/lang/String;)V

    move v12, v8

    move/from16 v7, v18

    move-object v8, v9

    move/from16 v9, v17

    goto/16 :goto_2

    .line 230
    :cond_13
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v19, "surface decoder given buffer "

    move-object/from16 v0, v19

    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v19, " (size="

    move-object/from16 v0, v19

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    move-object/from16 v0, v22

    iget v0, v0, Landroid/media/MediaCodec$BufferInfo;->size:I

    move/from16 v19, v0

    move/from16 v0, v19

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v19, ")"

    move-object/from16 v0, v19

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    move-object/from16 v0, v22

    iget v7, v0, Landroid/media/MediaCodec$BufferInfo;->size:I

    if-eqz v7, :cond_16

    const/4 v7, 0x1

    .line 235
    :goto_6
    invoke-virtual {v4, v12, v7}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 236
    if-eqz v7, :cond_14

    .line 238
    invoke-virtual {v13}, Lkik/android/i/f;->c()Z

    move-result v7

    if-eqz v7, :cond_14

    .line 240
    invoke-virtual {v13}, Lkik/android/i/f;->d()V

    .line 243
    move-object/from16 v0, v22

    iget-wide v0, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    move-wide/from16 v24, v0

    const-wide/16 v26, 0x3e8

    mul-long v24, v24, v26

    move-wide/from16 v0, v24

    invoke-virtual {v14, v0, v1}, Lkik/android/i/e;->a(J)V

    .line 244
    invoke-virtual {v14}, Lkik/android/i/e;->c()Z

    .line 248
    :cond_14
    move-object/from16 v0, v22

    iget v7, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v7, v7, 0x4

    if-eqz v7, :cond_15

    .line 250
    invoke-virtual {v15}, Landroid/media/MediaCodec;->signalEndOfInputStream()V
    :try_end_b
    .catch Ljava/lang/InterruptedException; {:try_start_b .. :try_end_b} :catch_e
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_7
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    :cond_15
    move v12, v8

    move/from16 v7, v18

    move-object v8, v9

    move/from16 v9, v17

    .line 255
    goto/16 :goto_2

    .line 234
    :cond_16
    const/4 v7, 0x0

    goto :goto_6

    :cond_17
    move-object/from16 v16, v8

    move/from16 v17, v9

    move/from16 v18, v7

    move/from16 v19, v10

    move/from16 v20, v11

    move-object v12, v6

    move v11, v5

    .line 256
    goto/16 :goto_0

    .line 259
    :cond_18
    if-lez v17, :cond_19

    .line 260
    :try_start_c
    move-object/from16 v0, v21

    move/from16 v1, v17

    invoke-static {v0, v12, v1}, Lkik/android/util/ak;->a(Landroid/media/MediaExtractor;Landroid/media/MediaMuxer;I)V

    .line 264
    :cond_19
    invoke-virtual {v12}, Landroid/media/MediaMuxer;->stop()V

    .line 265
    invoke-virtual {v15}, Landroid/media/MediaCodec;->stop()V

    .line 266
    invoke-virtual {v4}, Landroid/media/MediaCodec;->stop()V

    .line 268
    invoke-direct/range {p0 .. p0}, Lkik/android/i/h;->b()V
    :try_end_c
    .catch Ljava/lang/InterruptedException; {:try_start_c .. :try_end_c} :catch_f
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_8
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 282
    if-eqz v15, :cond_1a

    .line 283
    invoke-virtual {v15}, Landroid/media/MediaCodec;->release()V

    .line 285
    :cond_1a
    if-eqz v4, :cond_1b

    .line 286
    invoke-virtual {v4}, Landroid/media/MediaCodec;->release()V

    .line 288
    :cond_1b
    invoke-virtual {v14}, Lkik/android/i/e;->a()V

    .line 291
    invoke-virtual {v13}, Lkik/android/i/f;->a()V

    .line 294
    if-eqz v12, :cond_1c

    .line 295
    invoke-virtual {v12}, Landroid/media/MediaMuxer;->release()V

    .line 299
    :cond_1c
    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/i/h;->g:Lcom/kik/g/p;

    new-instance v5, Ljava/io/File;

    move-object/from16 v0, p0

    iget-object v6, v0, Lkik/android/i/h;->c:Ljava/lang/String;

    invoke-direct {v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    goto/16 :goto_4

    .line 272
    :catch_0
    move-exception v9

    move-object/from16 v28, v5

    move-object v5, v6

    move-object v6, v4

    move-object/from16 v4, v28

    :goto_7
    :try_start_d
    move-object/from16 v0, p0

    iget-object v9, v0, Lkik/android/i/h;->g:Lcom/kik/g/p;

    invoke-virtual {v9}, Lcom/kik/g/p;->e()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    .line 282
    if-eqz v7, :cond_1d

    .line 283
    invoke-virtual {v7}, Landroid/media/MediaCodec;->release()V

    .line 285
    :cond_1d
    if-eqz v8, :cond_1e

    .line 286
    invoke-virtual {v8}, Landroid/media/MediaCodec;->release()V

    .line 288
    :cond_1e
    if-eqz v6, :cond_1f

    .line 289
    invoke-virtual {v6}, Lkik/android/i/e;->a()V

    .line 291
    :cond_1f
    if-eqz v5, :cond_20

    .line 292
    invoke-virtual {v5}, Lkik/android/i/f;->a()V

    .line 294
    :cond_20
    if-eqz v4, :cond_a

    .line 295
    invoke-virtual {v4}, Landroid/media/MediaMuxer;->release()V

    goto/16 :goto_4

    .line 276
    :catch_1
    move-exception v9

    move-object v13, v6

    move-object v14, v4

    move-object v15, v7

    move-object v6, v5

    move-object v4, v9

    .line 277
    :goto_8
    :try_start_e
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v7, "Transcode failed: "

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 278
    move-object/from16 v0, p0

    iget-object v5, v0, Lkik/android/i/h;->g:Lcom/kik/g/p;

    invoke-virtual {v5, v4}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    .line 282
    if-eqz v15, :cond_21

    .line 283
    invoke-virtual {v15}, Landroid/media/MediaCodec;->release()V

    .line 285
    :cond_21
    if-eqz v8, :cond_22

    .line 286
    invoke-virtual {v8}, Landroid/media/MediaCodec;->release()V

    .line 288
    :cond_22
    if-eqz v14, :cond_23

    .line 289
    invoke-virtual {v14}, Lkik/android/i/e;->a()V

    .line 291
    :cond_23
    if-eqz v13, :cond_24

    .line 292
    invoke-virtual {v13}, Lkik/android/i/f;->a()V

    .line 294
    :cond_24
    if-eqz v6, :cond_a

    .line 295
    invoke-virtual {v6}, Landroid/media/MediaMuxer;->release()V

    goto/16 :goto_4

    .line 282
    :catchall_0
    move-exception v9

    move-object v13, v6

    move-object v14, v4

    move-object v15, v7

    move-object v6, v5

    move-object v4, v9

    :goto_9
    if-eqz v15, :cond_25

    .line 283
    invoke-virtual {v15}, Landroid/media/MediaCodec;->release()V

    .line 285
    :cond_25
    if-eqz v8, :cond_26

    .line 286
    invoke-virtual {v8}, Landroid/media/MediaCodec;->release()V

    .line 288
    :cond_26
    if-eqz v14, :cond_27

    .line 289
    invoke-virtual {v14}, Lkik/android/i/e;->a()V

    .line 291
    :cond_27
    if-eqz v13, :cond_28

    .line 292
    invoke-virtual {v13}, Lkik/android/i/f;->a()V

    .line 294
    :cond_28
    if-eqz v6, :cond_29

    .line 295
    invoke-virtual {v6}, Landroid/media/MediaMuxer;->release()V

    :cond_29
    throw v4

    .line 282
    :catchall_1
    move-exception v7

    move-object v13, v6

    move-object v14, v4

    move-object v4, v7

    move-object v6, v5

    goto :goto_9

    :catchall_2
    move-exception v4

    move-object v13, v6

    move-object v6, v5

    goto :goto_9

    :catchall_3
    move-exception v7

    move-object v13, v6

    move-object v8, v4

    move-object v4, v7

    move-object v6, v5

    goto :goto_9

    :catchall_4
    move-exception v6

    move-object v8, v4

    move-object v4, v6

    move-object v6, v5

    goto :goto_9

    :catchall_5
    move-exception v5

    move-object v6, v7

    move-object v8, v4

    move-object v4, v5

    goto :goto_9

    :catchall_6
    move-exception v5

    move-object v8, v4

    move-object v4, v5

    goto :goto_9

    :catchall_7
    move-exception v5

    move-object v6, v12

    move-object v8, v4

    move-object v4, v5

    goto :goto_9

    :catchall_8
    move-exception v9

    move-object v13, v5

    move-object v14, v6

    move-object v15, v7

    move-object v6, v4

    move-object v4, v9

    goto :goto_9

    :catchall_9
    move-exception v4

    goto :goto_9

    .line 276
    :catch_2
    move-exception v7

    move-object v13, v6

    move-object v14, v4

    move-object v4, v7

    move-object v6, v5

    goto :goto_8

    :catch_3
    move-exception v4

    move-object v13, v6

    move-object v6, v5

    goto/16 :goto_8

    :catch_4
    move-exception v7

    move-object v13, v6

    move-object v8, v4

    move-object v4, v7

    move-object v6, v5

    goto/16 :goto_8

    :catch_5
    move-exception v6

    move-object v8, v4

    move-object v4, v6

    move-object v6, v5

    goto/16 :goto_8

    :catch_6
    move-exception v5

    move-object v6, v7

    move-object v8, v4

    move-object v4, v5

    goto/16 :goto_8

    :catch_7
    move-exception v5

    move-object v8, v4

    move-object v4, v5

    goto/16 :goto_8

    :catch_8
    move-exception v5

    move-object v6, v12

    move-object v8, v4

    move-object v4, v5

    goto/16 :goto_8

    .line 272
    :catch_9
    move-exception v7

    move-object v7, v15

    move-object/from16 v28, v6

    move-object v6, v4

    move-object v4, v5

    move-object/from16 v5, v28

    goto/16 :goto_7

    :catch_a
    move-exception v4

    move-object v4, v5

    move-object v7, v15

    move-object v5, v6

    move-object v6, v14

    goto/16 :goto_7

    :catch_b
    move-exception v7

    move-object v7, v15

    move-object v8, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v14

    goto/16 :goto_7

    :catch_c
    move-exception v6

    move-object v6, v14

    move-object v7, v15

    move-object v8, v4

    move-object v4, v5

    move-object v5, v13

    goto/16 :goto_7

    :catch_d
    move-exception v5

    move-object v5, v13

    move-object v6, v14

    move-object v8, v4

    move-object v4, v7

    move-object v7, v15

    goto/16 :goto_7

    :catch_e
    move-exception v5

    move-object v5, v13

    move-object v7, v15

    move-object v8, v4

    move-object v4, v6

    move-object v6, v14

    goto/16 :goto_7

    :catch_f
    move-exception v5

    move-object v5, v13

    move-object v6, v14

    move-object v7, v15

    move-object v8, v4

    move-object v4, v12

    goto/16 :goto_7

    :cond_2a
    move v12, v8

    move/from16 v7, v18

    move-object v8, v9

    move/from16 v9, v17

    goto/16 :goto_2
.end method
