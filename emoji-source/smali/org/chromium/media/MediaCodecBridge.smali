.class Lorg/chromium/media/MediaCodecBridge;
.super Ljava/lang/Object;
.source "MediaCodecBridge.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/media/MediaCodecBridge$1;,
        Lorg/chromium/media/MediaCodecBridge$DequeueOutputResult;,
        Lorg/chromium/media/MediaCodecBridge$CodecInfo;,
        Lorg/chromium/media/MediaCodecBridge$DequeueInputResult;
    }
.end annotation

.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "media"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final MAX_ADAPTIVE_PLAYBACK_HEIGHT:I = 0x438

.field private static final MAX_ADAPTIVE_PLAYBACK_WIDTH:I = 0x780

.field private static final MAX_PRESENTATION_TIMESTAMP_SHIFT_US:J = 0x186a0L

.field private static final MEDIA_CODEC_DECODER:I = 0x0

.field private static final MEDIA_CODEC_DEQUEUE_INPUT_AGAIN_LATER:I = 0x1

.field private static final MEDIA_CODEC_DEQUEUE_OUTPUT_AGAIN_LATER:I = 0x2

.field private static final MEDIA_CODEC_ENCODER:I = 0x1

.field private static final MEDIA_CODEC_ERROR:I = 0x9

.field private static final MEDIA_CODEC_INPUT_END_OF_STREAM:I = 0x5

.field private static final MEDIA_CODEC_NO_KEY:I = 0x7

.field private static final MEDIA_CODEC_OK:I = 0x0

.field private static final MEDIA_CODEC_OUTPUT_BUFFERS_CHANGED:I = 0x3

.field private static final MEDIA_CODEC_OUTPUT_END_OF_STREAM:I = 0x6

.field private static final MEDIA_CODEC_OUTPUT_FORMAT_CHANGED:I = 0x4

.field private static final MEDIA_CODEC_STOPPED:I = 0x8

.field private static final TAG:Ljava/lang/String; = "MediaCodecBridge"


# instance fields
.field private mAdaptivePlaybackSupported:Z

.field private mAudioTrack:Landroid/media/AudioTrack;

.field private mFlushed:Z

.field private mInputBuffers:[Ljava/nio/ByteBuffer;

.field private mLastPresentationTimeUs:J

.field private mMediaCodec:Landroid/media/MediaCodec;

.field private mMime:Ljava/lang/String;

.field private mOutputBuffers:[Ljava/nio/ByteBuffer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    const-class v0, Lorg/chromium/media/MediaCodecBridge;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/media/MediaCodecBridge;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>(Landroid/media/MediaCodec;Ljava/lang/String;Z)V
    .locals 2
    .param p1, "mediaCodec"    # Landroid/media/MediaCodec;
    .param p2, "mime"    # Ljava/lang/String;
    .param p3, "adaptivePlaybackSupported"    # Z

    .prologue
    .line 230
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 231
    sget-boolean v0, Lorg/chromium/media/MediaCodecBridge;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 232
    :cond_0
    iput-object p1, p0, Lorg/chromium/media/MediaCodecBridge;->mMediaCodec:Landroid/media/MediaCodec;

    .line 233
    iput-object p2, p0, Lorg/chromium/media/MediaCodecBridge;->mMime:Ljava/lang/String;

    .line 234
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/chromium/media/MediaCodecBridge;->mLastPresentationTimeUs:J

    .line 235
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/chromium/media/MediaCodecBridge;->mFlushed:Z

    .line 236
    iput-boolean p3, p0, Lorg/chromium/media/MediaCodecBridge;->mAdaptivePlaybackSupported:Z

    .line 237
    return-void
.end method

.method private static codecSupportsAdaptivePlayback(Landroid/media/MediaCodec;Ljava/lang/String;)Z
    .locals 6
    .param p0, "mediaCodec"    # Landroid/media/MediaCodec;
    .param p1, "mime"    # Ljava/lang/String;

    .prologue
    const/4 v3, 0x0

    .line 549
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x13

    if-lt v4, v5, :cond_0

    if-nez p0, :cond_1

    .line 563
    :cond_0
    :goto_0
    return v3

    .line 553
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Landroid/media/MediaCodec;->getCodecInfo()Landroid/media/MediaCodecInfo;

    move-result-object v2

    .line 554
    .local v2, "info":Landroid/media/MediaCodecInfo;
    invoke-virtual {v2}, Landroid/media/MediaCodecInfo;->isEncoder()Z

    move-result v4

    if-nez v4, :cond_0

    .line 557
    invoke-virtual {v2, p1}, Landroid/media/MediaCodecInfo;->getCapabilitiesForType(Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;

    move-result-object v0

    .line 558
    .local v0, "capabilities":Landroid/media/MediaCodecInfo$CodecCapabilities;
    if-eqz v0, :cond_0

    const-string v4, "adaptive-playback"

    invoke-virtual {v0, v4}, Landroid/media/MediaCodecInfo$CodecCapabilities;->isFeatureSupported(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v4

    if-eqz v4, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    .line 560
    .end local v0    # "capabilities":Landroid/media/MediaCodecInfo$CodecCapabilities;
    .end local v2    # "info":Landroid/media/MediaCodecInfo;
    :catch_0
    move-exception v1

    .line 561
    .local v1, "e":Ljava/lang/IllegalArgumentException;
    const-string v4, "MediaCodecBridge"

    const-string v5, "Cannot retrieve codec information"

    invoke-static {v4, v5, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method private configureAudio(Landroid/media/MediaFormat;Landroid/media/MediaCrypto;IZ)Z
    .locals 11
    .param p1, "format"    # Landroid/media/MediaFormat;
    .param p2, "crypto"    # Landroid/media/MediaCrypto;
    .param p3, "flags"    # I
    .param p4, "playAudio"    # Z
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    const/4 v10, 0x1

    const/4 v9, 0x0

    .line 588
    :try_start_0
    iget-object v0, p0, Lorg/chromium/media/MediaCodecBridge;->mMediaCodec:Landroid/media/MediaCodec;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, p2, p3}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 589
    if-eqz p4, :cond_0

    .line 590
    const-string v0, "sample-rate"

    invoke-virtual {p1, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v2

    .line 591
    .local v2, "sampleRate":I
    const-string v0, "channel-count"

    invoke-virtual {p1, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v7

    .line 592
    .local v7, "channelCount":I
    invoke-direct {p0, v7}, Lorg/chromium/media/MediaCodecBridge;->getAudioFormat(I)I

    move-result v3

    .line 595
    .local v3, "channelConfig":I
    const/4 v0, 0x2

    invoke-static {v2, v3, v0}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    move-result v5

    .line 597
    .local v5, "minBufferSize":I
    new-instance v0, Landroid/media/AudioTrack;

    const/4 v1, 0x3

    const/4 v4, 0x2

    const/4 v6, 0x1

    invoke-direct/range {v0 .. v6}, Landroid/media/AudioTrack;-><init>(IIIIII)V

    iput-object v0, p0, Lorg/chromium/media/MediaCodecBridge;->mAudioTrack:Landroid/media/AudioTrack;

    .line 599
    iget-object v0, p0, Lorg/chromium/media/MediaCodecBridge;->mAudioTrack:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getState()I

    move-result v0

    if-nez v0, :cond_0

    .line 600
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/chromium/media/MediaCodecBridge;->mAudioTrack:Landroid/media/AudioTrack;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    move v0, v9

    .line 608
    .end local v2    # "sampleRate":I
    .end local v3    # "channelConfig":I
    .end local v5    # "minBufferSize":I
    .end local v7    # "channelCount":I
    :goto_0
    return v0

    :cond_0
    move v0, v10

    .line 604
    goto :goto_0

    .line 605
    :catch_0
    move-exception v8

    .line 606
    .local v8, "e":Ljava/lang/IllegalStateException;
    const-string v0, "MediaCodecBridge"

    const-string v1, "Cannot configure the audio codec"

    invoke-static {v0, v1, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move v0, v9

    .line 608
    goto :goto_0
.end method

.method private configureVideo(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)Z
    .locals 3
    .param p1, "format"    # Landroid/media/MediaFormat;
    .param p2, "surface"    # Landroid/view/Surface;
    .param p3, "crypto"    # Landroid/media/MediaCrypto;
    .param p4, "flags"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 508
    :try_start_0
    iget-boolean v1, p0, Lorg/chromium/media/MediaCodecBridge;->mAdaptivePlaybackSupported:Z

    if-eqz v1, :cond_0

    .line 509
    const-string v1, "max-width"

    const/16 v2, 0x780

    invoke-virtual {p1, v1, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 510
    const-string v1, "max-height"

    const/16 v2, 0x438

    invoke-virtual {p1, v1, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 512
    :cond_0
    iget-object v1, p0, Lorg/chromium/media/MediaCodecBridge;->mMediaCodec:Landroid/media/MediaCodec;

    invoke-virtual {v1, p1, p2, p3, p4}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 513
    const/4 v1, 0x1

    .line 517
    :goto_0
    return v1

    .line 514
    :catch_0
    move-exception v0

    .line 515
    .local v0, "e":Ljava/lang/IllegalStateException;
    const-string v1, "MediaCodecBridge"

    const-string v2, "Cannot configure the video codec"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 517
    const/4 v1, 0x0

    goto :goto_0
.end method

.method private static create(Ljava/lang/String;ZI)Lorg/chromium/media/MediaCodecBridge;
    .locals 9
    .param p0, "mime"    # Ljava/lang/String;
    .param p1, "isSecure"    # Z
    .param p2, "direction"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    const/4 v5, 0x0

    .line 243
    if-eqz p1, :cond_1

    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x12

    if-ge v6, v7, :cond_1

    .line 280
    :cond_0
    :goto_0
    return-object v5

    .line 246
    :cond_1
    const/4 v4, 0x0

    .line 247
    .local v4, "mediaCodec":Landroid/media/MediaCodec;
    const/4 v0, 0x0

    .line 250
    .local v0, "adaptivePlaybackSupported":Z
    :try_start_0
    const-string v6, "video"

    invoke-virtual {p0, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    if-eqz p1, :cond_3

    if-nez p2, :cond_3

    .line 251
    invoke-static {p0}, Lorg/chromium/media/MediaCodecBridge;->getDecoderNameForMime(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 252
    .local v1, "decoderName":Ljava/lang/String;
    if-eqz v1, :cond_0

    .line 255
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x13

    if-lt v6, v7, :cond_2

    .line 259
    invoke-static {v1}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object v3

    .line 260
    .local v3, "insecureCodec":Landroid/media/MediaCodec;
    invoke-static {v3, p0}, Lorg/chromium/media/MediaCodecBridge;->codecSupportsAdaptivePlayback(Landroid/media/MediaCodec;Ljava/lang/String;)Z

    move-result v0

    .line 261
    invoke-virtual {v3}, Landroid/media/MediaCodec;->release()V

    .line 263
    .end local v3    # "insecureCodec":Landroid/media/MediaCodec;
    :cond_2
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ".secure"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    .line 277
    .end local v1    # "decoderName":Ljava/lang/String;
    :goto_1
    if-eqz v4, :cond_0

    .line 280
    new-instance v5, Lorg/chromium/media/MediaCodecBridge;

    invoke-direct {v5, v4, p0, v0}, Lorg/chromium/media/MediaCodecBridge;-><init>(Landroid/media/MediaCodec;Ljava/lang/String;Z)V

    goto :goto_0

    .line 265
    :cond_3
    const/4 v6, 0x1

    if-ne p2, v6, :cond_4

    .line 266
    :try_start_1
    invoke-static {p0}, Landroid/media/MediaCodec;->createEncoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object v4

    goto :goto_1

    .line 268
    :cond_4
    invoke-static {p0}, Landroid/media/MediaCodec;->createDecoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object v4

    .line 269
    invoke-static {v4, p0}, Lorg/chromium/media/MediaCodecBridge;->codecSupportsAdaptivePlayback(Landroid/media/MediaCodec;Ljava/lang/String;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result v0

    goto :goto_1

    .line 272
    :catch_0
    move-exception v2

    .line 273
    .local v2, "e":Ljava/lang/Exception;
    const-string v6, "MediaCodecBridge"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Failed to create MediaCodec: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, ", isSecure: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, ", direction: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method

.method private static createAudioFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;
    .locals 1
    .param p0, "mime"    # Ljava/lang/String;
    .param p1, "sampleRate"    # I
    .param p2, "channelCount"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 522
    invoke-static {p0, p1, p2}, Landroid/media/MediaFormat;->createAudioFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    move-result-object v0

    return-object v0
.end method

.method private static createVideoDecoderFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;
    .locals 1
    .param p0, "mime"    # Ljava/lang/String;
    .param p1, "width"    # I
    .param p2, "height"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 527
    invoke-static {p0, p1, p2}, Landroid/media/MediaFormat;->createVideoFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    move-result-object v0

    return-object v0
.end method

.method private static createVideoEncoderFormat(Ljava/lang/String;IIIIII)Landroid/media/MediaFormat;
    .locals 2
    .param p0, "mime"    # Ljava/lang/String;
    .param p1, "width"    # I
    .param p2, "height"    # I
    .param p3, "bitRate"    # I
    .param p4, "frameRate"    # I
    .param p5, "iFrameInterval"    # I
    .param p6, "colorFormat"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 533
    invoke-static {p0, p1, p2}, Landroid/media/MediaFormat;->createVideoFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    move-result-object v0

    .line 534
    .local v0, "format":Landroid/media/MediaFormat;
    const-string v1, "bitrate"

    invoke-virtual {v0, v1, p3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 535
    const-string v1, "frame-rate"

    invoke-virtual {v0, v1, p4}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 536
    const-string v1, "i-frame-interval"

    invoke-virtual {v0, v1, p5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 537
    const-string v1, "color-format"

    invoke-virtual {v0, v1, p6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 538
    return-object v0
.end method

.method private dequeueInputBuffer(J)Lorg/chromium/media/MediaCodecBridge$DequeueInputResult;
    .locals 7
    .param p1, "timeoutUs"    # J
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 313
    const/16 v3, 0x9

    .line 314
    .local v3, "status":I
    const/4 v1, -0x1

    .line 316
    .local v1, "index":I
    :try_start_0
    iget-object v4, p0, Lorg/chromium/media/MediaCodecBridge;->mMediaCodec:Landroid/media/MediaCodec;

    invoke-virtual {v4, p1, p2}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    .line 317
    .local v2, "indexOrStatus":I
    if-ltz v2, :cond_1

    .line 318
    const/4 v3, 0x0

    .line 319
    move v1, v2

    .line 330
    .end local v2    # "indexOrStatus":I
    :cond_0
    :goto_0
    new-instance v4, Lorg/chromium/media/MediaCodecBridge$DequeueInputResult;

    const/4 v5, 0x0

    invoke-direct {v4, v3, v1, v5}, Lorg/chromium/media/MediaCodecBridge$DequeueInputResult;-><init>(IILorg/chromium/media/MediaCodecBridge$1;)V

    return-object v4

    .line 320
    .restart local v2    # "indexOrStatus":I
    :cond_1
    const/4 v4, -0x1

    if-ne v2, v4, :cond_2

    .line 321
    :try_start_1
    const-string v4, "MediaCodecBridge"

    const-string v5, "dequeueInputBuffer: MediaCodec.INFO_TRY_AGAIN_LATER"

    invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 322
    const/4 v3, 0x1

    goto :goto_0

    .line 324
    :cond_2
    const-string v4, "MediaCodecBridge"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Unexpected index_or_status: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 325
    sget-boolean v4, Lorg/chromium/media/MediaCodecBridge;->$assertionsDisabled:Z

    if-nez v4, :cond_0

    new-instance v4, Ljava/lang/AssertionError;

    invoke-direct {v4}, Ljava/lang/AssertionError;-><init>()V

    throw v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 327
    .end local v2    # "indexOrStatus":I
    :catch_0
    move-exception v0

    .line 328
    .local v0, "e":Ljava/lang/Exception;
    const-string v4, "MediaCodecBridge"

    const-string v5, "Failed to dequeue input buffer"

    invoke-static {v4, v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method private dequeueOutputBuffer(J)Lorg/chromium/media/MediaCodecBridge$DequeueOutputResult;
    .locals 13
    .param p1, "timeoutUs"    # J
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 470
    new-instance v11, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {v11}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 471
    .local v11, "info":Landroid/media/MediaCodec$BufferInfo;
    const/16 v2, 0x9

    .line 472
    .local v2, "status":I
    const/4 v3, -0x1

    .line 474
    .local v3, "index":I
    :try_start_0
    iget-object v1, p0, Lorg/chromium/media/MediaCodecBridge;->mMediaCodec:Landroid/media/MediaCodec;

    invoke-virtual {v1, v11, p1, p2}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    move-result v10

    .line 475
    .local v10, "indexOrStatus":I
    iget-wide v4, v11, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-wide v6, p0, Lorg/chromium/media/MediaCodecBridge;->mLastPresentationTimeUs:J

    cmp-long v1, v4, v6

    if-gez v1, :cond_0

    .line 479
    iget-wide v4, p0, Lorg/chromium/media/MediaCodecBridge;->mLastPresentationTimeUs:J

    iput-wide v4, v11, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 481
    :cond_0
    iget-wide v4, v11, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iput-wide v4, p0, Lorg/chromium/media/MediaCodecBridge;->mLastPresentationTimeUs:J
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 483
    if-ltz v10, :cond_2

    .line 484
    const/4 v2, 0x0

    .line 485
    move v3, v10

    .line 500
    .end local v10    # "indexOrStatus":I
    :cond_1
    :goto_0
    new-instance v1, Lorg/chromium/media/MediaCodecBridge$DequeueOutputResult;

    iget v4, v11, Landroid/media/MediaCodec$BufferInfo;->flags:I

    iget v5, v11, Landroid/media/MediaCodec$BufferInfo;->offset:I

    iget-wide v6, v11, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget v8, v11, Landroid/media/MediaCodec$BufferInfo;->size:I

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v9}, Lorg/chromium/media/MediaCodecBridge$DequeueOutputResult;-><init>(IIIIJILorg/chromium/media/MediaCodecBridge$1;)V

    return-object v1

    .line 486
    .restart local v10    # "indexOrStatus":I
    :cond_2
    const/4 v1, -0x3

    if-ne v10, v1, :cond_3

    .line 487
    const/4 v2, 0x3

    goto :goto_0

    .line 488
    :cond_3
    const/4 v1, -0x2

    if-ne v10, v1, :cond_4

    .line 489
    const/4 v2, 0x4

    goto :goto_0

    .line 490
    :cond_4
    const/4 v1, -0x1

    if-ne v10, v1, :cond_5

    .line 491
    const/4 v2, 0x2

    goto :goto_0

    .line 493
    :cond_5
    :try_start_1
    const-string v1, "MediaCodecBridge"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Unexpected index_or_status: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 494
    sget-boolean v1, Lorg/chromium/media/MediaCodecBridge;->$assertionsDisabled:Z

    if-nez v1, :cond_1

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    .line 496
    .end local v10    # "indexOrStatus":I
    :catch_0
    move-exception v0

    .line 497
    .local v0, "e":Ljava/lang/IllegalStateException;
    const-string v1, "MediaCodecBridge"

    const-string v4, "Failed to dequeue output buffer"

    invoke-static {v1, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method private flush()I
    .locals 3
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 336
    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lorg/chromium/media/MediaCodecBridge;->mFlushed:Z

    .line 337
    iget-object v1, p0, Lorg/chromium/media/MediaCodecBridge;->mAudioTrack:Landroid/media/AudioTrack;

    if-eqz v1, :cond_0

    .line 339
    iget-object v1, p0, Lorg/chromium/media/MediaCodecBridge;->mAudioTrack:Landroid/media/AudioTrack;

    invoke-virtual {v1}, Landroid/media/AudioTrack;->pause()V

    .line 340
    iget-object v1, p0, Lorg/chromium/media/MediaCodecBridge;->mAudioTrack:Landroid/media/AudioTrack;

    invoke-virtual {v1}, Landroid/media/AudioTrack;->flush()V

    .line 342
    :cond_0
    iget-object v1, p0, Lorg/chromium/media/MediaCodecBridge;->mMediaCodec:Landroid/media/MediaCodec;

    invoke-virtual {v1}, Landroid/media/MediaCodec;->flush()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 347
    const/4 v1, 0x0

    :goto_0
    return v1

    .line 343
    :catch_0
    move-exception v0

    .line 344
    .local v0, "e":Ljava/lang/IllegalStateException;
    const-string v1, "MediaCodecBridge"

    const-string v2, "Failed to flush MediaCodec"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 345
    const/16 v1, 0x9

    goto :goto_0
.end method

.method private getAudioFormat(I)I
    .locals 1
    .param p1, "channelCount"    # I

    .prologue
    .line 660
    packed-switch p1, :pswitch_data_0

    .line 672
    :pswitch_0
    const/4 v0, 0x1

    :goto_0
    return v0

    .line 662
    :pswitch_1
    const/4 v0, 0x4

    goto :goto_0

    .line 664
    :pswitch_2
    const/16 v0, 0xc

    goto :goto_0

    .line 666
    :pswitch_3
    const/16 v0, 0xcc

    goto :goto_0

    .line 668
    :pswitch_4
    const/16 v0, 0xfc

    goto :goto_0

    .line 670
    :pswitch_5
    const/16 v0, 0x3fc

    goto :goto_0

    .line 660
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_4
        :pswitch_0
        :pswitch_5
    .end packed-switch
.end method

.method private static getCodecsInfo()[Lorg/chromium/media/MediaCodecBridge$CodecInfo;
    .locals 15
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 160
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 161
    .local v5, "encoderInfoMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Lorg/chromium/media/MediaCodecBridge$CodecInfo;>;"
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 162
    .local v3, "decoderInfoMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Lorg/chromium/media/MediaCodecBridge$CodecInfo;>;"
    invoke-static {}, Landroid/media/MediaCodecList;->getCodecCount()I

    move-result v2

    .line 163
    .local v2, "count":I
    const/4 v6, 0x0

    .local v6, "i":I
    :goto_0
    if-ge v6, v2, :cond_4

    .line 164
    invoke-static {v6}, Landroid/media/MediaCodecList;->getCodecInfoAt(I)Landroid/media/MediaCodecInfo;

    move-result-object v7

    .line 165
    .local v7, "info":Landroid/media/MediaCodecInfo;
    invoke-virtual {v7}, Landroid/media/MediaCodecInfo;->isEncoder()Z

    move-result v11

    if-eqz v11, :cond_1

    const/4 v4, 0x1

    .line 167
    .local v4, "direction":I
    :goto_1
    invoke-virtual {v7}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    move-result-object v1

    .line 168
    .local v1, "codecString":Ljava/lang/String;
    invoke-virtual {v7}, Landroid/media/MediaCodecInfo;->getSupportedTypes()[Ljava/lang/String;

    move-result-object v10

    .line 169
    .local v10, "supportedTypes":[Ljava/lang/String;
    const/4 v8, 0x0

    .local v8, "j":I
    :goto_2
    array-length v11, v10

    if-ge v8, v11, :cond_3

    .line 170
    invoke-virtual {v7}, Landroid/media/MediaCodecInfo;->isEncoder()Z

    move-result v11

    if-eqz v11, :cond_2

    move-object v9, v5

    .line 171
    .local v9, "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Lorg/chromium/media/MediaCodecBridge$CodecInfo;>;"
    :goto_3
    aget-object v11, v10, v8

    invoke-interface {v9, v11}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_0

    .line 172
    aget-object v11, v10, v8

    new-instance v12, Lorg/chromium/media/MediaCodecBridge$CodecInfo;

    aget-object v13, v10, v8

    const/4 v14, 0x0

    invoke-direct {v12, v13, v1, v4, v14}, Lorg/chromium/media/MediaCodecBridge$CodecInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ILorg/chromium/media/MediaCodecBridge$1;)V

    invoke-interface {v9, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    :cond_0
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 165
    .end local v1    # "codecString":Ljava/lang/String;
    .end local v4    # "direction":I
    .end local v8    # "j":I
    .end local v9    # "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Lorg/chromium/media/MediaCodecBridge$CodecInfo;>;"
    .end local v10    # "supportedTypes":[Ljava/lang/String;
    :cond_1
    const/4 v4, 0x0

    goto :goto_1

    .restart local v1    # "codecString":Ljava/lang/String;
    .restart local v4    # "direction":I
    .restart local v8    # "j":I
    .restart local v10    # "supportedTypes":[Ljava/lang/String;
    :cond_2
    move-object v9, v3

    .line 170
    goto :goto_3

    .line 163
    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 177
    .end local v1    # "codecString":Ljava/lang/String;
    .end local v4    # "direction":I
    .end local v7    # "info":Landroid/media/MediaCodecInfo;
    .end local v8    # "j":I
    .end local v10    # "supportedTypes":[Ljava/lang/String;
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v11

    invoke-interface {v5}, Ljava/util/Map;->size()I

    move-result v12

    add-int/2addr v11, v12

    invoke-direct {v0, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 179
    .local v0, "codecInfos":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lorg/chromium/media/MediaCodecBridge$CodecInfo;>;"
    invoke-interface {v5}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v11

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 180
    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v11

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 181
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v11

    new-array v11, v11, [Lorg/chromium/media/MediaCodecBridge$CodecInfo;

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v11

    check-cast v11, [Lorg/chromium/media/MediaCodecBridge$CodecInfo;

    return-object v11
.end method

.method private static getDecoderNameForMime(Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .param p0, "mime"    # Ljava/lang/String;

    .prologue
    .line 211
    invoke-static {}, Landroid/media/MediaCodecList;->getCodecCount()I

    move-result v0

    .line 212
    .local v0, "count":I
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    if-ge v1, v0, :cond_3

    .line 213
    invoke-static {v1}, Landroid/media/MediaCodecList;->getCodecInfoAt(I)Landroid/media/MediaCodecInfo;

    move-result-object v2

    .line 214
    .local v2, "info":Landroid/media/MediaCodecInfo;
    invoke-virtual {v2}, Landroid/media/MediaCodecInfo;->isEncoder()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 212
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 218
    :cond_1
    invoke-virtual {v2}, Landroid/media/MediaCodecInfo;->getSupportedTypes()[Ljava/lang/String;

    move-result-object v4

    .line 219
    .local v4, "supportedTypes":[Ljava/lang/String;
    const/4 v3, 0x0

    .local v3, "j":I
    :goto_1
    array-length v5, v4

    if-ge v3, v5, :cond_0

    .line 220
    aget-object v5, v4, v3

    invoke-virtual {v5, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 221
    invoke-virtual {v2}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    move-result-object v5

    .line 226
    .end local v2    # "info":Landroid/media/MediaCodecInfo;
    .end local v3    # "j":I
    .end local v4    # "supportedTypes":[Ljava/lang/String;
    :goto_2
    return-object v5

    .line 219
    .restart local v2    # "info":Landroid/media/MediaCodecInfo;
    .restart local v3    # "j":I
    .restart local v4    # "supportedTypes":[Ljava/lang/String;
    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 226
    .end local v2    # "info":Landroid/media/MediaCodecInfo;
    .end local v3    # "j":I
    .end local v4    # "supportedTypes":[Ljava/lang/String;
    :cond_3
    const/4 v5, 0x0

    goto :goto_2
.end method

.method private static getDefaultCodecName(Ljava/lang/String;I)Ljava/lang/String;
    .locals 6
    .param p0, "mime"    # Ljava/lang/String;
    .param p1, "direction"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 190
    const-string v0, ""

    .line 191
    .local v0, "codecName":Ljava/lang/String;
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x12

    if-lt v3, v4, :cond_0

    .line 193
    const/4 v2, 0x0

    .line 194
    .local v2, "mediaCodec":Landroid/media/MediaCodec;
    const/4 v3, 0x1

    if-ne p1, v3, :cond_1

    .line 195
    :try_start_0
    invoke-static {p0}, Landroid/media/MediaCodec;->createEncoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object v2

    .line 199
    :goto_0
    invoke-virtual {v2}, Landroid/media/MediaCodec;->getName()Ljava/lang/String;

    move-result-object v0

    .line 200
    invoke-virtual {v2}, Landroid/media/MediaCodec;->release()V

    .line 206
    .end local v2    # "mediaCodec":Landroid/media/MediaCodec;
    :cond_0
    :goto_1
    return-object v0

    .line 197
    .restart local v2    # "mediaCodec":Landroid/media/MediaCodec;
    :cond_1
    invoke-static {p0}, Landroid/media/MediaCodec;->createDecoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    goto :goto_0

    .line 201
    :catch_0
    move-exception v1

    .line 202
    .local v1, "e":Ljava/lang/Exception;
    const-string v3, "MediaCodecBridge"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getDefaultCodecName: Failed to create MediaCodec: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ", direction: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method

.method private getInputBuffer(I)Ljava/nio/ByteBuffer;
    .locals 1
    .param p1, "index"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 370
    iget-object v0, p0, Lorg/chromium/media/MediaCodecBridge;->mInputBuffers:[Ljava/nio/ByteBuffer;

    aget-object v0, v0, p1

    return-object v0
.end method

.method private getInputBuffersCount()I
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 380
    iget-object v0, p0, Lorg/chromium/media/MediaCodecBridge;->mInputBuffers:[Ljava/nio/ByteBuffer;

    array-length v0, v0

    return v0
.end method

.method private getOutputBuffer(I)Ljava/nio/ByteBuffer;
    .locals 1
    .param p1, "index"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 375
    iget-object v0, p0, Lorg/chromium/media/MediaCodecBridge;->mOutputBuffers:[Ljava/nio/ByteBuffer;

    aget-object v0, v0, p1

    return-object v0
.end method

.method private getOutputBuffers()Z
    .locals 3
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 397
    :try_start_0
    iget-object v1, p0, Lorg/chromium/media/MediaCodecBridge;->mMediaCodec:Landroid/media/MediaCodec;

    invoke-virtual {v1}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v1

    iput-object v1, p0, Lorg/chromium/media/MediaCodecBridge;->mOutputBuffers:[Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 402
    const/4 v1, 0x1

    :goto_0
    return v1

    .line 398
    :catch_0
    move-exception v0

    .line 399
    .local v0, "e":Ljava/lang/IllegalStateException;
    const-string v1, "MediaCodecBridge"

    const-string v2, "Cannot get output buffers"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 400
    const/4 v1, 0x0

    goto :goto_0
.end method

.method private getOutputBuffersCapacity()I
    .locals 2
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 390
    iget-object v0, p0, Lorg/chromium/media/MediaCodecBridge;->mOutputBuffers:[Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/chromium/media/MediaCodecBridge;->mOutputBuffers:[Ljava/nio/ByteBuffer;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method private getOutputBuffersCount()I
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 385
    iget-object v0, p0, Lorg/chromium/media/MediaCodecBridge;->mOutputBuffers:[Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/chromium/media/MediaCodecBridge;->mOutputBuffers:[Ljava/nio/ByteBuffer;

    array-length v0, v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method private getOutputHeight()I
    .locals 2
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 360
    iget-object v0, p0, Lorg/chromium/media/MediaCodecBridge;->mMediaCodec:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    move-result-object v0

    const-string v1, "height"

    invoke-virtual {v0, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method private getOutputWidth()I
    .locals 2
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 365
    iget-object v0, p0, Lorg/chromium/media/MediaCodecBridge;->mMediaCodec:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    move-result-object v0

    const-string v1, "width"

    invoke-virtual {v0, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method private isAdaptivePlaybackSupported(II)Z
    .locals 2
    .param p1, "width"    # I
    .param p2, "height"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 543
    iget-boolean v1, p0, Lorg/chromium/media/MediaCodecBridge;->mAdaptivePlaybackSupported:Z

    if-nez v1, :cond_1

    .line 545
    :cond_0
    :goto_0
    return v0

    :cond_1
    const/16 v1, 0x780

    if-gt p1, v1, :cond_0

    const/16 v1, 0x438

    if-gt p2, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method private playOutputBuffer([B)J
    .locals 4
    .param p1, "buf"    # [B
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 620
    iget-object v1, p0, Lorg/chromium/media/MediaCodecBridge;->mAudioTrack:Landroid/media/AudioTrack;

    if-nez v1, :cond_0

    .line 621
    const-wide/16 v2, 0x0

    .line 640
    :goto_0
    return-wide v2

    .line 624
    :cond_0
    const/4 v1, 0x3

    iget-object v2, p0, Lorg/chromium/media/MediaCodecBridge;->mAudioTrack:Landroid/media/AudioTrack;

    invoke-virtual {v2}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v2

    if-eq v1, v2, :cond_1

    .line 625
    iget-object v1, p0, Lorg/chromium/media/MediaCodecBridge;->mAudioTrack:Landroid/media/AudioTrack;

    invoke-virtual {v1}, Landroid/media/AudioTrack;->play()V

    .line 627
    :cond_1
    iget-object v1, p0, Lorg/chromium/media/MediaCodecBridge;->mAudioTrack:Landroid/media/AudioTrack;

    const/4 v2, 0x0

    array-length v3, p1

    invoke-virtual {v1, p1, v2, v3}, Landroid/media/AudioTrack;->write([BII)I

    move-result v0

    .line 628
    .local v0, "size":I
    array-length v1, p1

    if-eq v1, v0, :cond_2

    .line 629
    const-string v1, "MediaCodecBridge"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to send all data to audio output, expected size: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    array-length v3, p1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", actual size: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 640
    :cond_2
    iget-object v1, p0, Lorg/chromium/media/MediaCodecBridge;->mAudioTrack:Landroid/media/AudioTrack;

    invoke-virtual {v1}, Landroid/media/AudioTrack;->getPlaybackHeadPosition()I

    move-result v1

    int-to-long v2, v1

    goto :goto_0
.end method

.method private queueInputBuffer(IIIJI)I
    .locals 8
    .param p1, "index"    # I
    .param p2, "offset"    # I
    .param p3, "size"    # I
    .param p4, "presentationTimeUs"    # J
    .param p6, "flags"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 408
    invoke-direct {p0, p4, p5}, Lorg/chromium/media/MediaCodecBridge;->resetLastPresentationTimeIfNeeded(J)V

    .line 410
    :try_start_0
    iget-object v0, p0, Lorg/chromium/media/MediaCodecBridge;->mMediaCodec:Landroid/media/MediaCodec;

    move v1, p1

    move v2, p2

    move v3, p3

    move-wide v4, p4

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 415
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 411
    :catch_0
    move-exception v7

    .line 412
    .local v7, "e":Ljava/lang/Exception;
    const-string v0, "MediaCodecBridge"

    const-string v1, "Failed to queue input buffer"

    invoke-static {v0, v1, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 413
    const/16 v0, 0x9

    goto :goto_0
.end method

.method private queueSecureInputBuffer(II[B[B[I[IIJ)I
    .locals 12
    .param p1, "index"    # I
    .param p2, "offset"    # I
    .param p3, "iv"    # [B
    .param p4, "keyId"    # [B
    .param p5, "numBytesOfClearData"    # [I
    .param p6, "numBytesOfEncryptedData"    # [I
    .param p7, "numSubSamples"    # I
    .param p8, "presentationTimeUs"    # J
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 436
    move-wide/from16 v0, p8

    invoke-direct {p0, v0, v1}, Lorg/chromium/media/MediaCodecBridge;->resetLastPresentationTimeIfNeeded(J)V

    .line 438
    :try_start_0
    new-instance v2, Landroid/media/MediaCodec$CryptoInfo;

    invoke-direct {v2}, Landroid/media/MediaCodec$CryptoInfo;-><init>()V

    .line 439
    .local v2, "cryptoInfo":Landroid/media/MediaCodec$CryptoInfo;
    const/4 v8, 0x1

    move/from16 v3, p7

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p4

    move-object v7, p3

    invoke-virtual/range {v2 .. v8}, Landroid/media/MediaCodec$CryptoInfo;->set(I[I[I[B[BI)V

    .line 441
    iget-object v4, p0, Lorg/chromium/media/MediaCodecBridge;->mMediaCodec:Landroid/media/MediaCodec;

    const/4 v10, 0x0

    move v5, p1

    move v6, p2

    move-object v7, v2

    move-wide/from16 v8, p8

    invoke-virtual/range {v4 .. v10}, Landroid/media/MediaCodec;->queueSecureInputBuffer(IILandroid/media/MediaCodec$CryptoInfo;JI)V
    :try_end_0
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 454
    const/4 v3, 0x0

    .end local v2    # "cryptoInfo":Landroid/media/MediaCodec$CryptoInfo;
    :goto_0
    return v3

    .line 442
    :catch_0
    move-exception v11

    .line 443
    .local v11, "e":Landroid/media/MediaCodec$CryptoException;
    const-string v3, "MediaCodecBridge"

    const-string v4, "Failed to queue secure input buffer"

    invoke-static {v3, v4, v11}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 444
    invoke-virtual {v11}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    .line 445
    const-string v3, "MediaCodecBridge"

    const-string v4, "MediaCodec.CryptoException.ERROR_NO_KEY"

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 446
    const/4 v3, 0x7

    goto :goto_0

    .line 448
    :cond_0
    const-string v3, "MediaCodecBridge"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "MediaCodec.CryptoException with error code "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v11}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 449
    const/16 v3, 0x9

    goto :goto_0

    .line 450
    .end local v11    # "e":Landroid/media/MediaCodec$CryptoException;
    :catch_1
    move-exception v11

    .line 451
    .local v11, "e":Ljava/lang/IllegalStateException;
    const-string v3, "MediaCodecBridge"

    const-string v4, "Failed to queue secure input buffer"

    invoke-static {v3, v4, v11}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 452
    const/16 v3, 0x9

    goto :goto_0
.end method

.method private release()V
    .locals 3
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 286
    :try_start_0
    iget-object v1, p0, Lorg/chromium/media/MediaCodecBridge;->mMediaCodec:Landroid/media/MediaCodec;

    invoke-virtual {v1}, Landroid/media/MediaCodec;->release()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 292
    :goto_0
    const/4 v1, 0x0

    iput-object v1, p0, Lorg/chromium/media/MediaCodecBridge;->mMediaCodec:Landroid/media/MediaCodec;

    .line 293
    iget-object v1, p0, Lorg/chromium/media/MediaCodecBridge;->mAudioTrack:Landroid/media/AudioTrack;

    if-eqz v1, :cond_0

    .line 294
    iget-object v1, p0, Lorg/chromium/media/MediaCodecBridge;->mAudioTrack:Landroid/media/AudioTrack;

    invoke-virtual {v1}, Landroid/media/AudioTrack;->release()V

    .line 296
    :cond_0
    return-void

    .line 287
    :catch_0
    move-exception v0

    .line 290
    .local v0, "e":Ljava/lang/IllegalStateException;
    const-string v1, "MediaCodecBridge"

    const-string v2, "Cannot release media codec"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method private releaseOutputBuffer(IZ)V
    .locals 3
    .param p1, "index"    # I
    .param p2, "render"    # Z
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 460
    :try_start_0
    iget-object v1, p0, Lorg/chromium/media/MediaCodecBridge;->mMediaCodec:Landroid/media/MediaCodec;

    invoke-virtual {v1, p1, p2}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 465
    :goto_0
    return-void

    .line 461
    :catch_0
    move-exception v0

    .line 463
    .local v0, "e":Ljava/lang/IllegalStateException;
    const-string v1, "MediaCodecBridge"

    const-string v2, "Failed to release output buffer"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method private requestKeyFrameSoon()V
    .locals 3
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 427
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 428
    .local v0, "b":Landroid/os/Bundle;
    const-string v1, "request-sync"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 429
    iget-object v1, p0, Lorg/chromium/media/MediaCodecBridge;->mMediaCodec:Landroid/media/MediaCodec;

    invoke-virtual {v1, v0}, Landroid/media/MediaCodec;->setParameters(Landroid/os/Bundle;)V

    .line 430
    return-void
.end method

.method private resetLastPresentationTimeIfNeeded(J)V
    .locals 5
    .param p1, "presentationTimeUs"    # J

    .prologue
    .line 652
    iget-boolean v0, p0, Lorg/chromium/media/MediaCodecBridge;->mFlushed:Z

    if-eqz v0, :cond_0

    .line 653
    const-wide/32 v0, 0x186a0

    sub-long v0, p1, v0

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iput-wide v0, p0, Lorg/chromium/media/MediaCodecBridge;->mLastPresentationTimeUs:J

    .line 655
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/chromium/media/MediaCodecBridge;->mFlushed:Z

    .line 657
    :cond_0
    return-void
.end method

.method private static setCodecSpecificData(Landroid/media/MediaFormat;I[B)V
    .locals 2
    .param p0, "format"    # Landroid/media/MediaFormat;
    .param p1, "index"    # I
    .param p2, "bytes"    # [B
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 568
    const/4 v0, 0x0

    .line 569
    .local v0, "name":Ljava/lang/String;
    if-nez p1, :cond_2

    .line 570
    const-string v0, "csd-0"

    .line 574
    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    .line 575
    invoke-static {p2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/media/MediaFormat;->setByteBuffer(Ljava/lang/String;Ljava/nio/ByteBuffer;)V

    .line 577
    :cond_1
    return-void

    .line 571
    :cond_2
    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    .line 572
    const-string v0, "csd-1"

    goto :goto_0
.end method

.method private static setFrameHasADTSHeader(Landroid/media/MediaFormat;)V
    .locals 2
    .param p0, "format"    # Landroid/media/MediaFormat;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 581
    const-string v0, "is-adts"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 582
    return-void
.end method

.method private setVideoBitrate(I)V
    .locals 2
    .param p1, "bps"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 420
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 421
    .local v0, "b":Landroid/os/Bundle;
    const-string v1, "video-bitrate"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 422
    iget-object v1, p0, Lorg/chromium/media/MediaCodecBridge;->mMediaCodec:Landroid/media/MediaCodec;

    invoke-virtual {v1, v0}, Landroid/media/MediaCodec;->setParameters(Landroid/os/Bundle;)V

    .line 423
    return-void
.end method

.method private setVolume(D)V
    .locals 3
    .param p1, "volume"    # D
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 646
    iget-object v0, p0, Lorg/chromium/media/MediaCodecBridge;->mAudioTrack:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    .line 647
    iget-object v0, p0, Lorg/chromium/media/MediaCodecBridge;->mAudioTrack:Landroid/media/AudioTrack;

    double-to-float v1, p1

    double-to-float v2, p1

    invoke-virtual {v0, v1, v2}, Landroid/media/AudioTrack;->setStereoVolume(FF)I

    .line 649
    :cond_0
    return-void
.end method

.method private start()Z
    .locals 3
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 302
    :try_start_0
    iget-object v1, p0, Lorg/chromium/media/MediaCodecBridge;->mMediaCodec:Landroid/media/MediaCodec;

    invoke-virtual {v1}, Landroid/media/MediaCodec;->start()V

    .line 303
    iget-object v1, p0, Lorg/chromium/media/MediaCodecBridge;->mMediaCodec:Landroid/media/MediaCodec;

    invoke-virtual {v1}, Landroid/media/MediaCodec;->getInputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v1

    iput-object v1, p0, Lorg/chromium/media/MediaCodecBridge;->mInputBuffers:[Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 308
    const/4 v1, 0x1

    :goto_0
    return v1

    .line 304
    :catch_0
    move-exception v0

    .line 305
    .local v0, "e":Ljava/lang/IllegalStateException;
    const-string v1, "MediaCodecBridge"

    const-string v2, "Cannot start the media codec"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 306
    const/4 v1, 0x0

    goto :goto_0
.end method

.method private stop()V
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 352
    iget-object v0, p0, Lorg/chromium/media/MediaCodecBridge;->mMediaCodec:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V

    .line 353
    iget-object v0, p0, Lorg/chromium/media/MediaCodecBridge;->mAudioTrack:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    .line 354
    iget-object v0, p0, Lorg/chromium/media/MediaCodecBridge;->mAudioTrack:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    .line 356
    :cond_0
    return-void
.end method
