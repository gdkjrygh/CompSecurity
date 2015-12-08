.class Lorg/chromium/media/AudioRecordInput;
.super Ljava/lang/Object;
.source "AudioRecordInput.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/media/AudioRecordInput$1;,
        Lorg/chromium/media/AudioRecordInput$AudioRecordThread;
    }
.end annotation

.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "media"
.end annotation


# static fields
.field private static final DEBUG:Z = false

.field private static final HARDWARE_DELAY_MS:I = 0x64

.field private static final TAG:Ljava/lang/String; = "AudioRecordInput"


# instance fields
.field private mAEC:Landroid/media/audiofx/AcousticEchoCanceler;

.field private mAudioRecord:Landroid/media/AudioRecord;

.field private mAudioRecordThread:Lorg/chromium/media/AudioRecordInput$AudioRecordThread;

.field private final mBitsPerSample:I

.field private mBuffer:Ljava/nio/ByteBuffer;

.field private final mChannels:I

.field private final mHardwareDelayBytes:I

.field private final mNativeAudioRecordInputStream:J

.field private final mSampleRate:I

.field private final mUsePlatformAEC:Z


# direct methods
.method private constructor <init>(JIIIIZ)V
    .locals 3
    .param p1, "nativeAudioRecordInputStream"    # J
    .param p3, "sampleRate"    # I
    .param p4, "channels"    # I
    .param p5, "bitsPerSample"    # I
    .param p6, "bytesPerBuffer"    # I
    .param p7, "usePlatformAEC"    # Z

    .prologue
    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    iput-wide p1, p0, Lorg/chromium/media/AudioRecordInput;->mNativeAudioRecordInputStream:J

    .line 107
    iput p3, p0, Lorg/chromium/media/AudioRecordInput;->mSampleRate:I

    .line 108
    iput p4, p0, Lorg/chromium/media/AudioRecordInput;->mChannels:I

    .line 109
    iput p5, p0, Lorg/chromium/media/AudioRecordInput;->mBitsPerSample:I

    .line 110
    mul-int/lit8 v0, p3, 0x64

    div-int/lit16 v0, v0, 0x3e8

    mul-int/2addr v0, p5

    div-int/lit8 v0, v0, 0x8

    iput v0, p0, Lorg/chromium/media/AudioRecordInput;->mHardwareDelayBytes:I

    .line 111
    iput-boolean p7, p0, Lorg/chromium/media/AudioRecordInput;->mUsePlatformAEC:Z

    .line 117
    invoke-static {p6}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lorg/chromium/media/AudioRecordInput;->mBuffer:Ljava/nio/ByteBuffer;

    .line 125
    iget-wide v0, p0, Lorg/chromium/media/AudioRecordInput;->mNativeAudioRecordInputStream:J

    iget-object v2, p0, Lorg/chromium/media/AudioRecordInput;->mBuffer:Ljava/nio/ByteBuffer;

    invoke-direct {p0, v0, v1, v2}, Lorg/chromium/media/AudioRecordInput;->nativeCacheDirectBufferAddress(JLjava/nio/ByteBuffer;)V

    .line 126
    return-void
.end method

.method static synthetic access$000(Lorg/chromium/media/AudioRecordInput;)Landroid/media/AudioRecord;
    .locals 1
    .param p0, "x0"    # Lorg/chromium/media/AudioRecordInput;

    .prologue
    .line 25
    iget-object v0, p0, Lorg/chromium/media/AudioRecordInput;->mAudioRecord:Landroid/media/AudioRecord;

    return-object v0
.end method

.method static synthetic access$100(Lorg/chromium/media/AudioRecordInput;)Ljava/nio/ByteBuffer;
    .locals 1
    .param p0, "x0"    # Lorg/chromium/media/AudioRecordInput;

    .prologue
    .line 25
    iget-object v0, p0, Lorg/chromium/media/AudioRecordInput;->mBuffer:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method static synthetic access$200(Lorg/chromium/media/AudioRecordInput;)J
    .locals 2
    .param p0, "x0"    # Lorg/chromium/media/AudioRecordInput;

    .prologue
    .line 25
    iget-wide v0, p0, Lorg/chromium/media/AudioRecordInput;->mNativeAudioRecordInputStream:J

    return-wide v0
.end method

.method static synthetic access$300(Lorg/chromium/media/AudioRecordInput;)I
    .locals 1
    .param p0, "x0"    # Lorg/chromium/media/AudioRecordInput;

    .prologue
    .line 25
    iget v0, p0, Lorg/chromium/media/AudioRecordInput;->mHardwareDelayBytes:I

    return v0
.end method

.method static synthetic access$400(Lorg/chromium/media/AudioRecordInput;JII)V
    .locals 1
    .param p0, "x0"    # Lorg/chromium/media/AudioRecordInput;
    .param p1, "x1"    # J
    .param p3, "x2"    # I
    .param p4, "x3"    # I

    .prologue
    .line 25
    invoke-direct {p0, p1, p2, p3, p4}, Lorg/chromium/media/AudioRecordInput;->nativeOnData(JII)V

    return-void
.end method

.method private close()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 229
    iget-object v0, p0, Lorg/chromium/media/AudioRecordInput;->mAudioRecordThread:Lorg/chromium/media/AudioRecordInput$AudioRecordThread;

    if-eqz v0, :cond_1

    .line 230
    const-string v0, "AudioRecordInput"

    const-string v1, "close() called before stop()."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 244
    :cond_0
    :goto_0
    return-void

    .line 233
    :cond_1
    iget-object v0, p0, Lorg/chromium/media/AudioRecordInput;->mAudioRecord:Landroid/media/AudioRecord;

    if-eqz v0, :cond_0

    .line 238
    iget-object v0, p0, Lorg/chromium/media/AudioRecordInput;->mAEC:Landroid/media/audiofx/AcousticEchoCanceler;

    if-eqz v0, :cond_2

    .line 239
    iget-object v0, p0, Lorg/chromium/media/AudioRecordInput;->mAEC:Landroid/media/audiofx/AcousticEchoCanceler;

    invoke-virtual {v0}, Landroid/media/audiofx/AcousticEchoCanceler;->release()V

    .line 240
    iput-object v1, p0, Lorg/chromium/media/AudioRecordInput;->mAEC:Landroid/media/audiofx/AcousticEchoCanceler;

    .line 242
    :cond_2
    iget-object v0, p0, Lorg/chromium/media/AudioRecordInput;->mAudioRecord:Landroid/media/AudioRecord;

    invoke-virtual {v0}, Landroid/media/AudioRecord;->release()V

    .line 243
    iput-object v1, p0, Lorg/chromium/media/AudioRecordInput;->mAudioRecord:Landroid/media/AudioRecord;

    goto :goto_0
.end method

.method private static createAudioRecordInput(JIIIIZ)Lorg/chromium/media/AudioRecordInput;
    .locals 10
    .param p0, "nativeAudioRecordInputStream"    # J
    .param p2, "sampleRate"    # I
    .param p3, "channels"    # I
    .param p4, "bitsPerSample"    # I
    .param p5, "bytesPerBuffer"    # I
    .param p6, "usePlatformAEC"    # Z
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 100
    new-instance v1, Lorg/chromium/media/AudioRecordInput;

    move-wide v2, p0

    move v4, p2

    move v5, p3

    move v6, p4

    move v7, p5

    move/from16 v8, p6

    invoke-direct/range {v1 .. v8}, Lorg/chromium/media/AudioRecordInput;-><init>(JIIIIZ)V

    return-object v1
.end method

.method private native nativeCacheDirectBufferAddress(JLjava/nio/ByteBuffer;)V
.end method

.method private native nativeOnData(JII)V
.end method

.method private open()Z
    .locals 11
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    const/4 v10, 0x1

    const/4 v9, 0x0

    .line 131
    iget-object v0, p0, Lorg/chromium/media/AudioRecordInput;->mAudioRecord:Landroid/media/AudioRecord;

    if-eqz v0, :cond_0

    .line 132
    const-string v0, "AudioRecordInput"

    const-string v1, "open() called twice without a close()"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move v0, v9

    .line 199
    :goto_0
    return v0

    .line 136
    :cond_0
    iget v0, p0, Lorg/chromium/media/AudioRecordInput;->mChannels:I

    if-ne v0, v10, :cond_1

    .line 137
    const/16 v3, 0x10

    .line 146
    .local v3, "channelConfig":I
    :goto_1
    iget v0, p0, Lorg/chromium/media/AudioRecordInput;->mBitsPerSample:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    .line 147
    const/4 v4, 0x3

    .line 158
    .local v4, "audioFormat":I
    :goto_2
    iget v0, p0, Lorg/chromium/media/AudioRecordInput;->mSampleRate:I

    invoke-static {v0, v3, v4}, Landroid/media/AudioRecord;->getMinBufferSize(III)I

    move-result v7

    .line 159
    .local v7, "minBufferSize":I
    if-gez v7, :cond_5

    .line 160
    const-string v0, "AudioRecordInput"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getMinBufferSize error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move v0, v9

    .line 161
    goto :goto_0

    .line 138
    .end local v3    # "channelConfig":I
    .end local v4    # "audioFormat":I
    .end local v7    # "minBufferSize":I
    :cond_1
    iget v0, p0, Lorg/chromium/media/AudioRecordInput;->mChannels:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 139
    const/16 v3, 0xc

    .restart local v3    # "channelConfig":I
    goto :goto_1

    .line 141
    .end local v3    # "channelConfig":I
    :cond_2
    const-string v0, "AudioRecordInput"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported number of channels: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lorg/chromium/media/AudioRecordInput;->mChannels:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move v0, v9

    .line 142
    goto :goto_0

    .line 148
    .restart local v3    # "channelConfig":I
    :cond_3
    iget v0, p0, Lorg/chromium/media/AudioRecordInput;->mBitsPerSample:I

    const/16 v1, 0x10

    if-ne v0, v1, :cond_4

    .line 149
    const/4 v4, 0x2

    .restart local v4    # "audioFormat":I
    goto :goto_2

    .line 151
    .end local v4    # "audioFormat":I
    :cond_4
    const-string v0, "AudioRecordInput"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported bits per sample: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lorg/chromium/media/AudioRecordInput;->mBitsPerSample:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move v0, v9

    .line 152
    goto :goto_0

    .line 166
    .restart local v4    # "audioFormat":I
    .restart local v7    # "minBufferSize":I
    :cond_5
    iget-object v0, p0, Lorg/chromium/media/AudioRecordInput;->mBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v0

    invoke-static {v0, v7}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 169
    .local v5, "audioRecordBufferSizeInBytes":I
    :try_start_0
    new-instance v0, Landroid/media/AudioRecord;

    const/4 v1, 0x7

    iget v2, p0, Lorg/chromium/media/AudioRecordInput;->mSampleRate:I

    invoke-direct/range {v0 .. v5}, Landroid/media/AudioRecord;-><init>(IIIII)V

    iput-object v0, p0, Lorg/chromium/media/AudioRecordInput;->mAudioRecord:Landroid/media/AudioRecord;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 179
    invoke-static {}, Landroid/media/audiofx/AcousticEchoCanceler;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 180
    iget-object v0, p0, Lorg/chromium/media/AudioRecordInput;->mAudioRecord:Landroid/media/AudioRecord;

    invoke-virtual {v0}, Landroid/media/AudioRecord;->getAudioSessionId()I

    move-result v0

    invoke-static {v0}, Landroid/media/audiofx/AcousticEchoCanceler;->create(I)Landroid/media/audiofx/AcousticEchoCanceler;

    move-result-object v0

    iput-object v0, p0, Lorg/chromium/media/AudioRecordInput;->mAEC:Landroid/media/audiofx/AcousticEchoCanceler;

    .line 181
    iget-object v0, p0, Lorg/chromium/media/AudioRecordInput;->mAEC:Landroid/media/audiofx/AcousticEchoCanceler;

    if-nez v0, :cond_6

    .line 182
    const-string v0, "AudioRecordInput"

    const-string v1, "AcousticEchoCanceler.create failed"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move v0, v9

    .line 183
    goto/16 :goto_0

    .line 174
    :catch_0
    move-exception v6

    .line 175
    .local v6, "e":Ljava/lang/IllegalArgumentException;
    const-string v0, "AudioRecordInput"

    const-string v1, "AudioRecord failed"

    invoke-static {v0, v1, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move v0, v9

    .line 176
    goto/16 :goto_0

    .line 185
    .end local v6    # "e":Ljava/lang/IllegalArgumentException;
    :cond_6
    iget-object v0, p0, Lorg/chromium/media/AudioRecordInput;->mAEC:Landroid/media/audiofx/AcousticEchoCanceler;

    iget-boolean v1, p0, Lorg/chromium/media/AudioRecordInput;->mUsePlatformAEC:Z

    invoke-virtual {v0, v1}, Landroid/media/audiofx/AcousticEchoCanceler;->setEnabled(Z)I

    move-result v8

    .line 186
    .local v8, "ret":I
    if-eqz v8, :cond_7

    .line 187
    const-string v0, "AudioRecordInput"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setEnabled error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move v0, v9

    .line 188
    goto/16 :goto_0

    .end local v8    # "ret":I
    :cond_7
    move v0, v10

    .line 199
    goto/16 :goto_0
.end method

.method private start()V
    .locals 2
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 204
    iget-object v0, p0, Lorg/chromium/media/AudioRecordInput;->mAudioRecord:Landroid/media/AudioRecord;

    if-nez v0, :cond_1

    .line 205
    const-string v0, "AudioRecordInput"

    const-string v1, "start() called before open()."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 214
    :cond_0
    :goto_0
    return-void

    .line 208
    :cond_1
    iget-object v0, p0, Lorg/chromium/media/AudioRecordInput;->mAudioRecordThread:Lorg/chromium/media/AudioRecordInput$AudioRecordThread;

    if-nez v0, :cond_0

    .line 212
    new-instance v0, Lorg/chromium/media/AudioRecordInput$AudioRecordThread;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lorg/chromium/media/AudioRecordInput$AudioRecordThread;-><init>(Lorg/chromium/media/AudioRecordInput;Lorg/chromium/media/AudioRecordInput$1;)V

    iput-object v0, p0, Lorg/chromium/media/AudioRecordInput;->mAudioRecordThread:Lorg/chromium/media/AudioRecordInput$AudioRecordThread;

    .line 213
    iget-object v0, p0, Lorg/chromium/media/AudioRecordInput;->mAudioRecordThread:Lorg/chromium/media/AudioRecordInput$AudioRecordThread;

    invoke-virtual {v0}, Lorg/chromium/media/AudioRecordInput$AudioRecordThread;->start()V

    goto :goto_0
.end method

.method private stop()V
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 218
    iget-object v0, p0, Lorg/chromium/media/AudioRecordInput;->mAudioRecordThread:Lorg/chromium/media/AudioRecordInput$AudioRecordThread;

    if-nez v0, :cond_0

    .line 224
    :goto_0
    return-void

    .line 222
    :cond_0
    iget-object v0, p0, Lorg/chromium/media/AudioRecordInput;->mAudioRecordThread:Lorg/chromium/media/AudioRecordInput$AudioRecordThread;

    invoke-virtual {v0}, Lorg/chromium/media/AudioRecordInput$AudioRecordThread;->joinRecordThread()V

    .line 223
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/chromium/media/AudioRecordInput;->mAudioRecordThread:Lorg/chromium/media/AudioRecordInput$AudioRecordThread;

    goto :goto_0
.end method
