.class Lorg/chromium/media/AudioManagerAndroid;
.super Ljava/lang/Object;
.source "AudioManagerAndroid.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/media/AudioManagerAndroid$AudioDeviceName;,
        Lorg/chromium/media/AudioManagerAndroid$NonThreadSafe;
    }
.end annotation

.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "media"
.end annotation


# static fields
.field private static final DEBUG:Z = false

.field private static final DEFAULT_FRAME_PER_BUFFER:I = 0x100

.field private static final DEFAULT_SAMPLING_RATE:I = 0xac44

.field private static final DEVICE_BLUETOOTH_HEADSET:I = 0x3

.field private static final DEVICE_COUNT:I = 0x4

.field private static final DEVICE_DEFAULT:I = -0x2

.field private static final DEVICE_EARPIECE:I = 0x2

.field private static final DEVICE_INVALID:I = -0x1

.field private static final DEVICE_NAMES:[Ljava/lang/String;

.field private static final DEVICE_SPEAKERPHONE:I = 0x0

.field private static final DEVICE_WIRED_HEADSET:I = 0x1

.field private static final STATE_BLUETOOTH_SCO_INVALID:I = -0x1

.field private static final STATE_BLUETOOTH_SCO_OFF:I = 0x0

.field private static final STATE_BLUETOOTH_SCO_ON:I = 0x1

.field private static final STATE_BLUETOOTH_SCO_TURNING_OFF:I = 0x3

.field private static final STATE_BLUETOOTH_SCO_TURNING_ON:I = 0x2

.field private static final SUPPORTED_AEC_MODELS:[Ljava/lang/String;

.field private static final TAG:Ljava/lang/String; = "AudioManagerAndroid"

.field private static final VALID_DEVICES:[Ljava/lang/Integer;


# instance fields
.field private mAudioDevices:[Z

.field private final mAudioManager:Landroid/media/AudioManager;

.field private mBluetoothHeadsetReceiver:Landroid/content/BroadcastReceiver;

.field private mBluetoothScoReceiver:Landroid/content/BroadcastReceiver;

.field private mBluetoothScoState:I

.field private final mContentResolver:Landroid/content/ContentResolver;

.field private final mContext:Landroid/content/Context;

.field private mCurrentVolume:I

.field private mHasBluetoothPermission:Z

.field private mHasModifyAudioSettingsPermission:Z

.field private mHasRecordAudioPermission:Z

.field private mIsInitialized:Z

.field private final mLock:Ljava/lang/Object;

.field private final mNativeAudioManagerAndroid:J

.field private final mNonThreadSafe:Lorg/chromium/media/AudioManagerAndroid$NonThreadSafe;

.field private mRequestedAudioDevice:I

.field private mSavedAudioMode:I

.field private mSavedIsMicrophoneMute:Z

.field private mSavedIsSpeakerphoneOn:Z

.field private mSettingsObserver:Landroid/database/ContentObserver;

.field private mSettingsObserverThread:Landroid/os/HandlerThread;

.field private mWiredHeadsetReceiver:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 107
    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "GT-I9300"

    aput-object v1, v0, v3

    const-string v1, "GT-I9500"

    aput-object v1, v0, v4

    const-string v1, "GT-N7105"

    aput-object v1, v0, v5

    const-string v1, "Nexus 4"

    aput-object v1, v0, v6

    const-string v1, "Nexus 5"

    aput-object v1, v0, v7

    const/4 v1, 0x5

    const-string v2, "Nexus 7"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "SM-N9005"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "SM-T310"

    aput-object v2, v0, v1

    sput-object v0, Lorg/chromium/media/AudioManagerAndroid;->SUPPORTED_AEC_MODELS:[Ljava/lang/String;

    .line 132
    new-array v0, v7, [Ljava/lang/String;

    const-string v1, "Speakerphone"

    aput-object v1, v0, v3

    const-string v1, "Wired headset"

    aput-object v1, v0, v4

    const-string v1, "Headset earpiece"

    aput-object v1, v0, v5

    const-string v1, "Bluetooth headset"

    aput-object v1, v0, v6

    sput-object v0, Lorg/chromium/media/AudioManagerAndroid;->DEVICE_NAMES:[Ljava/lang/String;

    .line 140
    new-array v0, v7, [Ljava/lang/Integer;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v6

    sput-object v0, Lorg/chromium/media/AudioManagerAndroid;->VALID_DEVICES:[Ljava/lang/Integer;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;J)V
    .locals 4
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "nativeAudioManagerAndroid"    # J

    .prologue
    const/4 v3, 0x0

    const/4 v2, -0x1

    const/4 v1, 0x0

    .line 227
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 168
    iput-boolean v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mHasModifyAudioSettingsPermission:Z

    .line 171
    iput-boolean v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mHasRecordAudioPermission:Z

    .line 174
    iput-boolean v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mHasBluetoothPermission:Z

    .line 176
    const/4 v0, -0x2

    iput v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mSavedAudioMode:I

    .line 181
    iput v2, p0, Lorg/chromium/media/AudioManagerAndroid;->mBluetoothScoState:I

    .line 183
    iput-boolean v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mIsInitialized:Z

    .line 189
    iput v2, p0, Lorg/chromium/media/AudioManagerAndroid;->mRequestedAudioDevice:I

    .line 194
    new-instance v0, Lorg/chromium/media/AudioManagerAndroid$NonThreadSafe;

    invoke-direct {v0}, Lorg/chromium/media/AudioManagerAndroid$NonThreadSafe;-><init>()V

    iput-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mNonThreadSafe:Lorg/chromium/media/AudioManagerAndroid$NonThreadSafe;

    .line 198
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mLock:Ljava/lang/Object;

    .line 201
    const/4 v0, 0x4

    new-array v0, v0, [Z

    iput-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mAudioDevices:[Z

    .line 204
    iput-object v3, p0, Lorg/chromium/media/AudioManagerAndroid;->mSettingsObserver:Landroid/database/ContentObserver;

    .line 205
    iput-object v3, p0, Lorg/chromium/media/AudioManagerAndroid;->mSettingsObserverThread:Landroid/os/HandlerThread;

    .line 228
    iput-object p1, p0, Lorg/chromium/media/AudioManagerAndroid;->mContext:Landroid/content/Context;

    .line 229
    iput-wide p2, p0, Lorg/chromium/media/AudioManagerAndroid;->mNativeAudioManagerAndroid:J

    .line 230
    iget-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mContext:Landroid/content/Context;

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    iput-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mAudioManager:Landroid/media/AudioManager;

    .line 231
    iget-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iput-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mContentResolver:Landroid/content/ContentResolver;

    .line 232
    return-void
.end method

.method static synthetic access$100(Lorg/chromium/media/AudioManagerAndroid;)Ljava/lang/Object;
    .locals 1
    .param p0, "x0"    # Lorg/chromium/media/AudioManagerAndroid;

    .prologue
    .line 36
    iget-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mLock:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$1000(Lorg/chromium/media/AudioManagerAndroid;JZ)V
    .locals 1
    .param p0, "x0"    # Lorg/chromium/media/AudioManagerAndroid;
    .param p1, "x1"    # J
    .param p3, "x2"    # Z

    .prologue
    .line 36
    invoke-direct {p0, p1, p2, p3}, Lorg/chromium/media/AudioManagerAndroid;->nativeSetMute(JZ)V

    return-void
.end method

.method static synthetic access$200(Lorg/chromium/media/AudioManagerAndroid;)[Z
    .locals 1
    .param p0, "x0"    # Lorg/chromium/media/AudioManagerAndroid;

    .prologue
    .line 36
    iget-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mAudioDevices:[Z

    return-object v0
.end method

.method static synthetic access$300(Lorg/chromium/media/AudioManagerAndroid;)Z
    .locals 1
    .param p0, "x0"    # Lorg/chromium/media/AudioManagerAndroid;

    .prologue
    .line 36
    invoke-direct {p0}, Lorg/chromium/media/AudioManagerAndroid;->hasEarpiece()Z

    move-result v0

    return v0
.end method

.method static synthetic access$400(Ljava/lang/String;)V
    .locals 0
    .param p0, "x0"    # Ljava/lang/String;

    .prologue
    .line 36
    invoke-static {p0}, Lorg/chromium/media/AudioManagerAndroid;->loge(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$500(Lorg/chromium/media/AudioManagerAndroid;)Z
    .locals 1
    .param p0, "x0"    # Lorg/chromium/media/AudioManagerAndroid;

    .prologue
    .line 36
    invoke-direct {p0}, Lorg/chromium/media/AudioManagerAndroid;->deviceHasBeenRequested()Z

    move-result v0

    return v0
.end method

.method static synthetic access$600(Lorg/chromium/media/AudioManagerAndroid;)V
    .locals 0
    .param p0, "x0"    # Lorg/chromium/media/AudioManagerAndroid;

    .prologue
    .line 36
    invoke-direct {p0}, Lorg/chromium/media/AudioManagerAndroid;->updateDeviceActivation()V

    return-void
.end method

.method static synthetic access$702(Lorg/chromium/media/AudioManagerAndroid;I)I
    .locals 0
    .param p0, "x0"    # Lorg/chromium/media/AudioManagerAndroid;
    .param p1, "x1"    # I

    .prologue
    .line 36
    iput p1, p0, Lorg/chromium/media/AudioManagerAndroid;->mBluetoothScoState:I

    return p1
.end method

.method static synthetic access$800(Lorg/chromium/media/AudioManagerAndroid;)Landroid/media/AudioManager;
    .locals 1
    .param p0, "x0"    # Lorg/chromium/media/AudioManagerAndroid;

    .prologue
    .line 36
    iget-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mAudioManager:Landroid/media/AudioManager;

    return-object v0
.end method

.method static synthetic access$900(Lorg/chromium/media/AudioManagerAndroid;)J
    .locals 2
    .param p0, "x0"    # Lorg/chromium/media/AudioManagerAndroid;

    .prologue
    .line 36
    iget-wide v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mNativeAudioManagerAndroid:J

    return-wide v0
.end method

.method private checkIfCalledOnValidThread()V
    .locals 0

    .prologue
    .line 550
    return-void
.end method

.method private close()V
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 284
    invoke-direct {p0}, Lorg/chromium/media/AudioManagerAndroid;->checkIfCalledOnValidThread()V

    .line 286
    iget-boolean v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mIsInitialized:Z

    if-nez v0, :cond_0

    .line 294
    :goto_0
    return-void

    .line 289
    :cond_0
    invoke-direct {p0}, Lorg/chromium/media/AudioManagerAndroid;->stopObservingVolumeChanges()V

    .line 290
    invoke-direct {p0}, Lorg/chromium/media/AudioManagerAndroid;->unregisterForWiredHeadsetIntentBroadcast()V

    .line 291
    invoke-direct {p0}, Lorg/chromium/media/AudioManagerAndroid;->unregisterBluetoothIntentsIfNeeded()V

    .line 293
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mIsInitialized:Z

    goto :goto_0
.end method

.method private static createAudioManagerAndroid(Landroid/content/Context;J)Lorg/chromium/media/AudioManagerAndroid;
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "nativeAudioManagerAndroid"    # J
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 224
    new-instance v0, Lorg/chromium/media/AudioManagerAndroid;

    invoke-direct {v0, p0, p1, p2}, Lorg/chromium/media/AudioManagerAndroid;-><init>(Landroid/content/Context;J)V

    return-object v0
.end method

.method private deviceHasBeenRequested()Z
    .locals 3

    .prologue
    .line 971
    iget-object v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mLock:Ljava/lang/Object;

    monitor-enter v1

    .line 972
    :try_start_0
    iget v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mRequestedAudioDevice:I

    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit v1

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 973
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private getAudioInputDeviceNames()[Lorg/chromium/media/AudioManagerAndroid$AudioDeviceName;
    .locals 9
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    const/4 v7, 0x0

    .line 428
    iget-boolean v6, p0, Lorg/chromium/media/AudioManagerAndroid;->mIsInitialized:Z

    if-nez v6, :cond_1

    move-object v1, v7

    .line 452
    :cond_0
    :goto_0
    return-object v1

    .line 430
    :cond_1
    iget-boolean v6, p0, Lorg/chromium/media/AudioManagerAndroid;->mHasModifyAudioSettingsPermission:Z

    if-eqz v6, :cond_2

    iget-boolean v6, p0, Lorg/chromium/media/AudioManagerAndroid;->mHasRecordAudioPermission:Z

    if-nez v6, :cond_3

    .line 431
    :cond_2
    const-string v6, "AudioManagerAndroid"

    const-string v8, "Requires MODIFY_AUDIO_SETTINGS and RECORD_AUDIO"

    invoke-static {v6, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 432
    const-string v6, "AudioManagerAndroid"

    const-string v8, "No audio device will be available for recording"

    invoke-static {v6, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move-object v1, v7

    .line 433
    goto :goto_0

    .line 436
    :cond_3
    const/4 v2, 0x0

    .line 437
    .local v2, "devices":[Z
    iget-object v8, p0, Lorg/chromium/media/AudioManagerAndroid;->mLock:Ljava/lang/Object;

    monitor-enter v8

    .line 438
    :try_start_0
    iget-object v6, p0, Lorg/chromium/media/AudioManagerAndroid;->mAudioDevices:[Z

    invoke-virtual {v6}, [Z->clone()Ljava/lang/Object;

    move-result-object v6

    move-object v0, v6

    check-cast v0, [Z

    move-object v2, v0

    .line 439
    monitor-exit v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 440
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 441
    .local v5, "list":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-static {v2}, Lorg/chromium/media/AudioManagerAndroid;->getNumOfAudioDevices([Z)I

    move-result v6

    new-array v1, v6, [Lorg/chromium/media/AudioManagerAndroid$AudioDeviceName;

    .line 443
    .local v1, "array":[Lorg/chromium/media/AudioManagerAndroid$AudioDeviceName;
    const/4 v3, 0x0

    .line 444
    .local v3, "i":I
    const/4 v4, 0x0

    .local v4, "id":I
    :goto_1
    const/4 v6, 0x4

    if-ge v4, v6, :cond_0

    .line 445
    aget-boolean v6, v2, v4

    if-eqz v6, :cond_4

    .line 446
    new-instance v6, Lorg/chromium/media/AudioManagerAndroid$AudioDeviceName;

    sget-object v8, Lorg/chromium/media/AudioManagerAndroid;->DEVICE_NAMES:[Ljava/lang/String;

    aget-object v8, v8, v4

    invoke-direct {v6, v4, v8, v7}, Lorg/chromium/media/AudioManagerAndroid$AudioDeviceName;-><init>(ILjava/lang/String;Lorg/chromium/media/AudioManagerAndroid$1;)V

    aput-object v6, v1, v3

    .line 447
    sget-object v6, Lorg/chromium/media/AudioManagerAndroid;->DEVICE_NAMES:[Ljava/lang/String;

    aget-object v6, v6, v4

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 448
    add-int/lit8 v3, v3, 0x1

    .line 444
    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 439
    .end local v1    # "array":[Lorg/chromium/media/AudioManagerAndroid$AudioDeviceName;
    .end local v3    # "i":I
    .end local v4    # "id":I
    .end local v5    # "list":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :catchall_0
    move-exception v6

    :try_start_1
    monitor-exit v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v6
.end method

.method private getAudioLowLatencyOutputFrameSize()I
    .locals 3
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 515
    iget-object v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mAudioManager:Landroid/media/AudioManager;

    const-string v2, "android.media.property.OUTPUT_FRAMES_PER_BUFFER"

    invoke-virtual {v1, v2}, Landroid/media/AudioManager;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 517
    .local v0, "framesPerBuffer":Ljava/lang/String;
    if-nez v0, :cond_0

    const/16 v1, 0x100

    :goto_0
    return v1

    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    goto :goto_0
.end method

.method private static getMinInputFrameSize(II)I
    .locals 3
    .param p0, "sampleRate"    # I
    .param p1, "channels"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    const/4 v2, 0x2

    .line 476
    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    .line 477
    const/16 v0, 0x10

    .line 483
    .local v0, "channelConfig":I
    :goto_0
    invoke-static {p0, v0, v2}, Landroid/media/AudioRecord;->getMinBufferSize(III)I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    div-int/2addr v1, p1

    .end local v0    # "channelConfig":I
    :goto_1
    return v1

    .line 478
    :cond_0
    if-ne p1, v2, :cond_1

    .line 479
    const/16 v0, 0xc

    .restart local v0    # "channelConfig":I
    goto :goto_0

    .line 481
    .end local v0    # "channelConfig":I
    :cond_1
    const/4 v1, -0x1

    goto :goto_1
.end method

.method private static getMinOutputFrameSize(II)I
    .locals 3
    .param p0, "sampleRate"    # I
    .param p1, "channels"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    const/4 v2, 0x2

    .line 496
    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    .line 497
    const/4 v0, 0x4

    .line 503
    .local v0, "channelConfig":I
    :goto_0
    invoke-static {p0, v0, v2}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    div-int/2addr v1, p1

    .end local v0    # "channelConfig":I
    :goto_1
    return v1

    .line 498
    :cond_0
    if-ne p1, v2, :cond_1

    .line 499
    const/16 v0, 0xc

    .restart local v0    # "channelConfig":I
    goto :goto_0

    .line 501
    .end local v0    # "channelConfig":I
    :cond_1
    const/4 v1, -0x1

    goto :goto_1
.end method

.method private getNativeOutputSampleRate()I
    .locals 4
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    const v1, 0xac44

    .line 457
    invoke-static {}, Lorg/chromium/media/AudioManagerAndroid;->runningOnJellyBeanMR1OrHigher()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 458
    iget-object v2, p0, Lorg/chromium/media/AudioManagerAndroid;->mAudioManager:Landroid/media/AudioManager;

    const-string v3, "android.media.property.OUTPUT_SAMPLE_RATE"

    invoke-virtual {v2, v3}, Landroid/media/AudioManager;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 460
    .local v0, "sampleRateString":Ljava/lang/String;
    if-nez v0, :cond_1

    .line 463
    .end local v0    # "sampleRateString":Ljava/lang/String;
    :cond_0
    :goto_0
    return v1

    .line 460
    .restart local v0    # "sampleRateString":Ljava/lang/String;
    :cond_1
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    goto :goto_0
.end method

.method private static getNumOfAudioDevices([Z)I
    .locals 3
    .param p0, "devices"    # [Z

    .prologue
    .line 1008
    const/4 v0, 0x0

    .line 1009
    .local v0, "count":I
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    const/4 v2, 0x4

    if-ge v1, v2, :cond_1

    .line 1010
    aget-boolean v2, p0, v1

    if-eqz v2, :cond_0

    .line 1011
    add-int/lit8 v0, v0, 0x1

    .line 1009
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1013
    :cond_1
    return v0
.end method

.method private hasBluetoothHeadset()Z
    .locals 7

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 643
    iget-boolean v5, p0, Lorg/chromium/media/AudioManagerAndroid;->mHasBluetoothPermission:Z

    if-nez v5, :cond_1

    .line 644
    const-string v3, "AudioManagerAndroid"

    const-string v5, "hasBluetoothHeadset() requires BLUETOOTH permission"

    invoke-static {v3, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 680
    :cond_0
    :goto_0
    return v4

    .line 653
    :cond_1
    const/4 v0, 0x0

    .line 654
    .local v0, "btAdapter":Landroid/bluetooth/BluetoothAdapter;
    invoke-static {}, Lorg/chromium/media/AudioManagerAndroid;->runningOnJellyBeanMR2OrHigher()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 657
    iget-object v5, p0, Lorg/chromium/media/AudioManagerAndroid;->mContext:Landroid/content/Context;

    const-string v6, "bluetooth"

    invoke-virtual {v5, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/bluetooth/BluetoothManager;

    .line 660
    .local v1, "btManager":Landroid/bluetooth/BluetoothManager;
    invoke-virtual {v1}, Landroid/bluetooth/BluetoothManager;->getAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    .line 667
    .end local v1    # "btManager":Landroid/bluetooth/BluetoothManager;
    :goto_1
    if-eqz v0, :cond_0

    .line 673
    invoke-virtual {v0, v3}, Landroid/bluetooth/BluetoothAdapter;->getProfileConnectionState(I)I

    move-result v2

    .line 680
    .local v2, "profileConnectionState":I
    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v5

    if-eqz v5, :cond_3

    const/4 v5, 0x2

    if-ne v2, v5, :cond_3

    :goto_2
    move v4, v3

    goto :goto_0

    .line 664
    .end local v2    # "profileConnectionState":I
    :cond_2
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    goto :goto_1

    .restart local v2    # "profileConnectionState":I
    :cond_3
    move v3, v4

    .line 680
    goto :goto_2
.end method

.method private hasEarpiece()Z
    .locals 2

    .prologue
    .line 613
    iget-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.hardware.telephony"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private hasPermission(Ljava/lang/String;)Z
    .locals 3
    .param p1, "permission"    # Ljava/lang/String;

    .prologue
    .line 631
    iget-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mContext:Landroid/content/Context;

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v1

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v2

    invoke-virtual {v0, p1, v1, v2}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private hasWiredHeadset()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 626
    iget-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mAudioManager:Landroid/media/AudioManager;

    invoke-virtual {v0}, Landroid/media/AudioManager;->isWiredHeadsetOn()Z

    move-result v0

    return v0
.end method

.method private init()V
    .locals 4
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    const/4 v3, 0x1

    .line 241
    invoke-direct {p0}, Lorg/chromium/media/AudioManagerAndroid;->checkIfCalledOnValidThread()V

    .line 244
    iget-boolean v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mIsInitialized:Z

    if-eqz v0, :cond_0

    .line 276
    :goto_0
    return-void

    .line 249
    :cond_0
    const-string v0, "android.permission.MODIFY_AUDIO_SETTINGS"

    invoke-direct {p0, v0}, Lorg/chromium/media/AudioManagerAndroid;->hasPermission(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mHasModifyAudioSettingsPermission:Z

    .line 254
    const-string v0, "android.permission.RECORD_AUDIO"

    invoke-direct {p0, v0}, Lorg/chromium/media/AudioManagerAndroid;->hasPermission(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mHasRecordAudioPermission:Z

    .line 261
    iget-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mAudioDevices:[Z

    const/4 v1, 0x2

    invoke-direct {p0}, Lorg/chromium/media/AudioManagerAndroid;->hasEarpiece()Z

    move-result v2

    aput-boolean v2, v0, v1

    .line 262
    iget-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mAudioDevices:[Z

    invoke-direct {p0}, Lorg/chromium/media/AudioManagerAndroid;->hasWiredHeadset()Z

    move-result v1

    aput-boolean v1, v0, v3

    .line 263
    iget-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mAudioDevices:[Z

    const/4 v1, 0x0

    aput-boolean v3, v0, v1

    .line 267
    invoke-direct {p0}, Lorg/chromium/media/AudioManagerAndroid;->registerBluetoothIntentsIfNeeded()V

    .line 271
    invoke-direct {p0}, Lorg/chromium/media/AudioManagerAndroid;->registerForWiredHeadsetIntentBroadcast()V

    .line 273
    iput-boolean v3, p0, Lorg/chromium/media/AudioManagerAndroid;->mIsInitialized:Z

    goto :goto_0
.end method

.method private isAudioLowLatencySupported()Z
    .locals 2
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 509
    iget-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.hardware.audio.low_latency"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private isMicrophoneMute()Z
    .locals 1

    .prologue
    .line 608
    iget-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mAudioManager:Landroid/media/AudioManager;

    invoke-virtual {v0}, Landroid/media/AudioManager;->isMicrophoneMute()Z

    move-result v0

    return v0
.end method

.method private logDeviceInfo()V
    .locals 2

    .prologue
    .line 1039
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Android SDK: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Release: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Brand: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Device: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Id: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build;->ID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Hardware: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Manufacturer: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Model: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Product: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/chromium/media/AudioManagerAndroid;->logd(Ljava/lang/String;)V

    .line 1048
    return-void
.end method

.method private static logd(Ljava/lang/String;)V
    .locals 1
    .param p0, "msg"    # Ljava/lang/String;

    .prologue
    .line 1052
    const-string v0, "AudioManagerAndroid"

    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1053
    return-void
.end method

.method private static loge(Ljava/lang/String;)V
    .locals 1
    .param p0, "msg"    # Ljava/lang/String;

    .prologue
    .line 1057
    const-string v0, "AudioManagerAndroid"

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1058
    return-void
.end method

.method private native nativeSetMute(JZ)V
.end method

.method private registerBluetoothIntentsIfNeeded()V
    .locals 3

    .prologue
    .line 558
    const-string v0, "android.permission.BLUETOOTH"

    invoke-direct {p0, v0}, Lorg/chromium/media/AudioManagerAndroid;->hasPermission(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mHasBluetoothPermission:Z

    .line 567
    iget-boolean v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mHasBluetoothPermission:Z

    if-nez v0, :cond_0

    .line 568
    const-string v0, "AudioManagerAndroid"

    const-string v1, "Requires BLUETOOTH permission"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 577
    :goto_0
    return-void

    .line 571
    :cond_0
    iget-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mAudioDevices:[Z

    const/4 v1, 0x3

    invoke-direct {p0}, Lorg/chromium/media/AudioManagerAndroid;->hasBluetoothHeadset()Z

    move-result v2

    aput-boolean v2, v0, v1

    .line 575
    invoke-direct {p0}, Lorg/chromium/media/AudioManagerAndroid;->registerForBluetoothHeadsetIntentBroadcast()V

    .line 576
    invoke-direct {p0}, Lorg/chromium/media/AudioManagerAndroid;->registerForBluetoothScoIntentBroadcast()V

    goto :goto_0
.end method

.method private registerForBluetoothHeadsetIntentBroadcast()V
    .locals 3

    .prologue
    .line 762
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 766
    .local v0, "filter":Landroid/content/IntentFilter;
    new-instance v1, Lorg/chromium/media/AudioManagerAndroid$2;

    invoke-direct {v1, p0}, Lorg/chromium/media/AudioManagerAndroid$2;-><init>(Lorg/chromium/media/AudioManagerAndroid;)V

    iput-object v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mBluetoothHeadsetReceiver:Landroid/content/BroadcastReceiver;

    .line 818
    iget-object v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lorg/chromium/media/AudioManagerAndroid;->mBluetoothHeadsetReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 819
    return-void
.end method

.method private registerForBluetoothScoIntentBroadcast()V
    .locals 3

    .prologue
    .line 831
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.media.ACTION_SCO_AUDIO_STATE_UPDATED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 835
    .local v0, "filter":Landroid/content/IntentFilter;
    new-instance v1, Lorg/chromium/media/AudioManagerAndroid$3;

    invoke-direct {v1, p0}, Lorg/chromium/media/AudioManagerAndroid$3;-><init>(Lorg/chromium/media/AudioManagerAndroid;)V

    iput-object v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mBluetoothScoReceiver:Landroid/content/BroadcastReceiver;

    .line 866
    iget-object v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lorg/chromium/media/AudioManagerAndroid;->mBluetoothScoReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 867
    return-void
.end method

.method private registerForWiredHeadsetIntentBroadcast()V
    .locals 3

    .prologue
    .line 690
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.HEADSET_PLUG"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 693
    .local v0, "filter":Landroid/content/IntentFilter;
    new-instance v1, Lorg/chromium/media/AudioManagerAndroid$1;

    invoke-direct {v1, p0}, Lorg/chromium/media/AudioManagerAndroid$1;-><init>(Lorg/chromium/media/AudioManagerAndroid;)V

    iput-object v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mWiredHeadsetReceiver:Landroid/content/BroadcastReceiver;

    .line 746
    iget-object v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lorg/chromium/media/AudioManagerAndroid;->mWiredHeadsetReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 747
    return-void
.end method

.method private reportUpdate()V
    .locals 4

    .prologue
    .line 1023
    iget-object v3, p0, Lorg/chromium/media/AudioManagerAndroid;->mLock:Ljava/lang/Object;

    monitor-enter v3

    .line 1024
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1025
    .local v0, "devices":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    const/4 v2, 0x4

    if-ge v1, v2, :cond_1

    .line 1026
    iget-object v2, p0, Lorg/chromium/media/AudioManagerAndroid;->mAudioDevices:[Z

    aget-boolean v2, v2, v1

    if-eqz v2, :cond_0

    .line 1027
    sget-object v2, Lorg/chromium/media/AudioManagerAndroid;->DEVICE_NAMES:[Ljava/lang/String;

    aget-object v2, v2, v1

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1025
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1034
    :cond_1
    monitor-exit v3

    .line 1035
    return-void

    .line 1034
    .end local v0    # "devices":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .end local v1    # "i":I
    :catchall_0
    move-exception v2

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2
.end method

.method private static runningOnJellyBeanMR1OrHigher()Z
    .locals 2

    .prologue
    .line 78
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static runningOnJellyBeanMR2OrHigher()Z
    .locals 2

    .prologue
    .line 82
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static runningOnJellyBeanOrHigher()Z
    .locals 2

    .prologue
    .line 74
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static selectDefaultDevice([Z)I
    .locals 3
    .param p0, "devices"    # [Z

    .prologue
    const/4 v1, 0x3

    const/4 v0, 0x1

    .line 959
    aget-boolean v2, p0, v0

    if-eqz v2, :cond_0

    .line 966
    :goto_0
    return v0

    .line 961
    :cond_0
    aget-boolean v0, p0, v1

    if-eqz v0, :cond_1

    move v0, v1

    .line 964
    goto :goto_0

    .line 966
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private setAudioDevice(I)V
    .locals 2
    .param p1, "device"    # I

    .prologue
    const/4 v1, 0x0

    .line 928
    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    .line 929
    invoke-direct {p0}, Lorg/chromium/media/AudioManagerAndroid;->startBluetoothSco()V

    .line 934
    :goto_0
    packed-switch p1, :pswitch_data_0

    .line 947
    const-string v0, "Invalid audio device selection"

    invoke-static {v0}, Lorg/chromium/media/AudioManagerAndroid;->loge(Ljava/lang/String;)V

    .line 950
    :goto_1
    :pswitch_0
    invoke-direct {p0}, Lorg/chromium/media/AudioManagerAndroid;->reportUpdate()V

    .line 951
    return-void

    .line 931
    :cond_0
    invoke-direct {p0}, Lorg/chromium/media/AudioManagerAndroid;->stopBluetoothSco()V

    goto :goto_0

    .line 938
    :pswitch_1
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lorg/chromium/media/AudioManagerAndroid;->setSpeakerphoneOn(Z)V

    goto :goto_1

    .line 941
    :pswitch_2
    invoke-direct {p0, v1}, Lorg/chromium/media/AudioManagerAndroid;->setSpeakerphoneOn(Z)V

    goto :goto_1

    .line 944
    :pswitch_3
    invoke-direct {p0, v1}, Lorg/chromium/media/AudioManagerAndroid;->setSpeakerphoneOn(Z)V

    goto :goto_1

    .line 934
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_0
    .end packed-switch
.end method

.method private setCommunicationAudioModeOn(Z)V
    .locals 4
    .param p1, "on"    # Z
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    const/4 v3, -0x2

    .line 308
    iget-boolean v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mHasModifyAudioSettingsPermission:Z

    if-nez v1, :cond_0

    .line 309
    const-string v1, "AudioManagerAndroid"

    const-string v2, "MODIFY_AUDIO_SETTINGS is missing => client will run with reduced functionality"

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 369
    :goto_0
    return-void

    .line 314
    :cond_0
    if-eqz p1, :cond_2

    .line 315
    iget v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mSavedAudioMode:I

    if-eq v1, v3, :cond_1

    .line 316
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Audio mode has already been set"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 322
    :cond_1
    :try_start_0
    iget-object v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mAudioManager:Landroid/media/AudioManager;

    invoke-virtual {v1}, Landroid/media/AudioManager;->getMode()I

    move-result v1

    iput v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mSavedAudioMode:I
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 331
    iget-object v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mAudioManager:Landroid/media/AudioManager;

    invoke-virtual {v1}, Landroid/media/AudioManager;->isSpeakerphoneOn()Z

    move-result v1

    iput-boolean v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mSavedIsSpeakerphoneOn:Z

    .line 332
    iget-object v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mAudioManager:Landroid/media/AudioManager;

    invoke-virtual {v1}, Landroid/media/AudioManager;->isMicrophoneMute()Z

    move-result v1

    iput-boolean v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mSavedIsMicrophoneMute:Z

    .line 335
    :try_start_1
    iget-object v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mAudioManager:Landroid/media/AudioManager;

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Landroid/media/AudioManager;->setMode(I)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1

    .line 346
    invoke-direct {p0}, Lorg/chromium/media/AudioManagerAndroid;->startObservingVolumeChanges()V

    goto :goto_0

    .line 323
    :catch_0
    move-exception v0

    .line 324
    .local v0, "e":Ljava/lang/SecurityException;
    invoke-direct {p0}, Lorg/chromium/media/AudioManagerAndroid;->logDeviceInfo()V

    .line 325
    throw v0

    .line 336
    .end local v0    # "e":Ljava/lang/SecurityException;
    :catch_1
    move-exception v0

    .line 337
    .restart local v0    # "e":Ljava/lang/SecurityException;
    invoke-direct {p0}, Lorg/chromium/media/AudioManagerAndroid;->logDeviceInfo()V

    .line 338
    throw v0

    .line 349
    .end local v0    # "e":Ljava/lang/SecurityException;
    :cond_2
    iget v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mSavedAudioMode:I

    if-ne v1, v3, :cond_3

    .line 350
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Audio mode has not yet been set"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 353
    :cond_3
    invoke-direct {p0}, Lorg/chromium/media/AudioManagerAndroid;->stopObservingVolumeChanges()V

    .line 356
    iget-boolean v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mSavedIsMicrophoneMute:Z

    invoke-direct {p0, v1}, Lorg/chromium/media/AudioManagerAndroid;->setMicrophoneMute(Z)V

    .line 357
    iget-boolean v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mSavedIsSpeakerphoneOn:Z

    invoke-direct {p0, v1}, Lorg/chromium/media/AudioManagerAndroid;->setSpeakerphoneOn(Z)V

    .line 362
    :try_start_2
    iget-object v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mAudioManager:Landroid/media/AudioManager;

    iget v2, p0, Lorg/chromium/media/AudioManagerAndroid;->mSavedAudioMode:I

    invoke-virtual {v1, v2}, Landroid/media/AudioManager;->setMode(I)V
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_2

    .line 367
    iput v3, p0, Lorg/chromium/media/AudioManagerAndroid;->mSavedAudioMode:I

    goto :goto_0

    .line 363
    :catch_2
    move-exception v0

    .line 364
    .restart local v0    # "e":Ljava/lang/SecurityException;
    invoke-direct {p0}, Lorg/chromium/media/AudioManagerAndroid;->logDeviceInfo()V

    .line 365
    throw v0
.end method

.method private setDevice(Ljava/lang/String;)Z
    .locals 9
    .param p1, "deviceId"    # Ljava/lang/String;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    const/4 v7, -0x2

    .line 383
    iget-boolean v8, p0, Lorg/chromium/media/AudioManagerAndroid;->mIsInitialized:Z

    if-nez v8, :cond_1

    .line 415
    :cond_0
    :goto_0
    return v5

    .line 385
    :cond_1
    iget-boolean v8, p0, Lorg/chromium/media/AudioManagerAndroid;->mHasModifyAudioSettingsPermission:Z

    if-eqz v8, :cond_2

    iget-boolean v8, p0, Lorg/chromium/media/AudioManagerAndroid;->mHasRecordAudioPermission:Z

    if-nez v8, :cond_3

    .line 386
    :cond_2
    const-string v6, "AudioManagerAndroid"

    const-string v7, "Requires MODIFY_AUDIO_SETTINGS and RECORD_AUDIO"

    invoke-static {v6, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 387
    const-string v6, "AudioManagerAndroid"

    const-string v7, "Selected device will not be available for recording"

    invoke-static {v6, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 391
    :cond_3
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_4

    move v3, v7

    .line 394
    .local v3, "intDeviceId":I
    :goto_1
    if-ne v3, v7, :cond_5

    .line 395
    const/4 v2, 0x0

    .line 396
    .local v2, "devices":[Z
    iget-object v7, p0, Lorg/chromium/media/AudioManagerAndroid;->mLock:Ljava/lang/Object;

    monitor-enter v7

    .line 397
    :try_start_0
    iget-object v5, p0, Lorg/chromium/media/AudioManagerAndroid;->mAudioDevices:[Z

    invoke-virtual {v5}, [Z->clone()Ljava/lang/Object;

    move-result-object v5

    move-object v0, v5

    check-cast v0, [Z

    move-object v2, v0

    .line 398
    const/4 v5, -0x2

    iput v5, p0, Lorg/chromium/media/AudioManagerAndroid;->mRequestedAudioDevice:I

    .line 399
    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 400
    invoke-static {v2}, Lorg/chromium/media/AudioManagerAndroid;->selectDefaultDevice([Z)I

    move-result v1

    .line 401
    .local v1, "defaultDevice":I
    invoke-direct {p0, v1}, Lorg/chromium/media/AudioManagerAndroid;->setAudioDevice(I)V

    move v5, v6

    .line 402
    goto :goto_0

    .line 391
    .end local v1    # "defaultDevice":I
    .end local v2    # "devices":[Z
    .end local v3    # "intDeviceId":I
    :cond_4
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    goto :goto_1

    .line 399
    .restart local v2    # "devices":[Z
    .restart local v3    # "intDeviceId":I
    :catchall_0
    move-exception v5

    :try_start_1
    monitor-exit v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v5

    .line 407
    .end local v2    # "devices":[Z
    :cond_5
    sget-object v7, Lorg/chromium/media/AudioManagerAndroid;->VALID_DEVICES:[Ljava/lang/Integer;

    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    .line 408
    .local v4, "validIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;"
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v4, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    iget-object v7, p0, Lorg/chromium/media/AudioManagerAndroid;->mAudioDevices:[Z

    aget-boolean v7, v7, v3

    if-eqz v7, :cond_0

    .line 411
    iget-object v7, p0, Lorg/chromium/media/AudioManagerAndroid;->mLock:Ljava/lang/Object;

    monitor-enter v7

    .line 412
    :try_start_2
    iput v3, p0, Lorg/chromium/media/AudioManagerAndroid;->mRequestedAudioDevice:I

    .line 413
    monitor-exit v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 414
    invoke-direct {p0, v3}, Lorg/chromium/media/AudioManagerAndroid;->setAudioDevice(I)V

    move v5, v6

    .line 415
    goto :goto_0

    .line 413
    :catchall_1
    move-exception v5

    :try_start_3
    monitor-exit v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v5
.end method

.method private setMicrophoneMute(Z)V
    .locals 2
    .param p1, "on"    # Z

    .prologue
    .line 599
    iget-object v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mAudioManager:Landroid/media/AudioManager;

    invoke-virtual {v1}, Landroid/media/AudioManager;->isMicrophoneMute()Z

    move-result v0

    .line 600
    .local v0, "wasMuted":Z
    if-ne v0, p1, :cond_0

    .line 604
    :goto_0
    return-void

    .line 603
    :cond_0
    iget-object v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mAudioManager:Landroid/media/AudioManager;

    invoke-virtual {v1, p1}, Landroid/media/AudioManager;->setMicrophoneMute(Z)V

    goto :goto_0
.end method

.method private setSpeakerphoneOn(Z)V
    .locals 2
    .param p1, "on"    # Z

    .prologue
    .line 590
    iget-object v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mAudioManager:Landroid/media/AudioManager;

    invoke-virtual {v1}, Landroid/media/AudioManager;->isSpeakerphoneOn()Z

    move-result v0

    .line 591
    .local v0, "wasOn":Z
    if-ne v0, p1, :cond_0

    .line 595
    :goto_0
    return-void

    .line 594
    :cond_0
    iget-object v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mAudioManager:Landroid/media/AudioManager;

    invoke-virtual {v1, p1}, Landroid/media/AudioManager;->setSpeakerphoneOn(Z)V

    goto :goto_0
.end method

.method private static shouldUseAcousticEchoCanceler()Z
    .locals 3
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 524
    invoke-static {}, Lorg/chromium/media/AudioManagerAndroid;->runningOnJellyBeanOrHigher()Z

    move-result v2

    if-nez v2, :cond_1

    .line 539
    .local v0, "supportedModels":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :cond_0
    :goto_0
    return v1

    .line 529
    .end local v0    # "supportedModels":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :cond_1
    sget-object v2, Lorg/chromium/media/AudioManagerAndroid;->SUPPORTED_AEC_MODELS:[Ljava/lang/String;

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 530
    .restart local v0    # "supportedModels":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 539
    invoke-static {}, Landroid/media/audiofx/AcousticEchoCanceler;->isAvailable()Z

    move-result v1

    goto :goto_0
.end method

.method private startBluetoothSco()V
    .locals 3

    .prologue
    const/4 v2, 0x2

    const/4 v1, 0x1

    .line 876
    iget-boolean v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mHasBluetoothPermission:Z

    if-nez v0, :cond_1

    .line 895
    :cond_0
    :goto_0
    return-void

    .line 879
    :cond_1
    iget v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mBluetoothScoState:I

    if-eq v0, v1, :cond_0

    iget v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mBluetoothScoState:I

    if-eq v0, v2, :cond_0

    .line 887
    iget-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mAudioManager:Landroid/media/AudioManager;

    invoke-virtual {v0}, Landroid/media/AudioManager;->isBluetoothScoOn()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 888
    iput v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mBluetoothScoState:I

    goto :goto_0

    .line 893
    :cond_2
    iput v2, p0, Lorg/chromium/media/AudioManagerAndroid;->mBluetoothScoState:I

    .line 894
    iget-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mAudioManager:Landroid/media/AudioManager;

    invoke-virtual {v0}, Landroid/media/AudioManager;->startBluetoothSco()V

    goto :goto_0
.end method

.method private startObservingVolumeChanges()V
    .locals 4

    .prologue
    .line 1063
    iget-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mSettingsObserverThread:Landroid/os/HandlerThread;

    if-eqz v0, :cond_0

    .line 1095
    :goto_0
    return-void

    .line 1065
    :cond_0
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "SettingsObserver"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mSettingsObserverThread:Landroid/os/HandlerThread;

    .line 1066
    iget-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mSettingsObserverThread:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 1068
    new-instance v0, Lorg/chromium/media/AudioManagerAndroid$4;

    new-instance v1, Landroid/os/Handler;

    iget-object v2, p0, Lorg/chromium/media/AudioManagerAndroid;->mSettingsObserverThread:Landroid/os/HandlerThread;

    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {v0, p0, v1}, Lorg/chromium/media/AudioManagerAndroid$4;-><init>(Lorg/chromium/media/AudioManagerAndroid;Landroid/os/Handler;)V

    iput-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mSettingsObserver:Landroid/database/ContentObserver;

    .line 1093
    iget-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mContentResolver:Landroid/content/ContentResolver;

    sget-object v1, Landroid/provider/Settings$System;->CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x1

    iget-object v3, p0, Lorg/chromium/media/AudioManagerAndroid;->mSettingsObserver:Landroid/database/ContentObserver;

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    goto :goto_0
.end method

.method private stopBluetoothSco()V
    .locals 2

    .prologue
    .line 899
    iget-boolean v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mHasBluetoothPermission:Z

    if-nez v0, :cond_1

    .line 916
    :cond_0
    :goto_0
    return-void

    .line 902
    :cond_1
    iget v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mBluetoothScoState:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    iget v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mBluetoothScoState:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 907
    :cond_2
    iget-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mAudioManager:Landroid/media/AudioManager;

    invoke-virtual {v0}, Landroid/media/AudioManager;->isBluetoothScoOn()Z

    move-result v0

    if-nez v0, :cond_3

    .line 909
    const-string v0, "Unable to stop BT SCO since it is already disabled"

    invoke-static {v0}, Lorg/chromium/media/AudioManagerAndroid;->loge(Ljava/lang/String;)V

    goto :goto_0

    .line 914
    :cond_3
    const/4 v0, 0x3

    iput v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mBluetoothScoState:I

    .line 915
    iget-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mAudioManager:Landroid/media/AudioManager;

    invoke-virtual {v0}, Landroid/media/AudioManager;->stopBluetoothSco()V

    goto :goto_0
.end method

.method private stopObservingVolumeChanges()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1100
    iget-object v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mSettingsObserverThread:Landroid/os/HandlerThread;

    if-nez v1, :cond_0

    .line 1113
    :goto_0
    return-void

    .line 1103
    :cond_0
    iget-object v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mContentResolver:Landroid/content/ContentResolver;

    iget-object v2, p0, Lorg/chromium/media/AudioManagerAndroid;->mSettingsObserver:Landroid/database/ContentObserver;

    invoke-virtual {v1, v2}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 1104
    iput-object v3, p0, Lorg/chromium/media/AudioManagerAndroid;->mSettingsObserver:Landroid/database/ContentObserver;

    .line 1106
    iget-object v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mSettingsObserverThread:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->quit()Z

    .line 1108
    :try_start_0
    iget-object v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mSettingsObserverThread:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->join()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1112
    :goto_1
    iput-object v3, p0, Lorg/chromium/media/AudioManagerAndroid;->mSettingsObserverThread:Landroid/os/HandlerThread;

    goto :goto_0

    .line 1109
    :catch_0
    move-exception v0

    .line 1110
    .local v0, "e":Ljava/lang/InterruptedException;
    const-string v1, "AudioManagerAndroid"

    const-string v2, "Thread.join() exception: "

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method

.method private unregisterBluetoothIntentsIfNeeded()V
    .locals 1

    .prologue
    .line 581
    iget-boolean v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mHasBluetoothPermission:Z

    if-eqz v0, :cond_0

    .line 582
    iget-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mAudioManager:Landroid/media/AudioManager;

    invoke-virtual {v0}, Landroid/media/AudioManager;->stopBluetoothSco()V

    .line 583
    invoke-direct {p0}, Lorg/chromium/media/AudioManagerAndroid;->unregisterForBluetoothHeadsetIntentBroadcast()V

    .line 584
    invoke-direct {p0}, Lorg/chromium/media/AudioManagerAndroid;->unregisterForBluetoothScoIntentBroadcast()V

    .line 586
    :cond_0
    return-void
.end method

.method private unregisterForBluetoothHeadsetIntentBroadcast()V
    .locals 2

    .prologue
    .line 822
    iget-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mBluetoothHeadsetReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 823
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mBluetoothHeadsetReceiver:Landroid/content/BroadcastReceiver;

    .line 824
    return-void
.end method

.method private unregisterForBluetoothScoIntentBroadcast()V
    .locals 2

    .prologue
    .line 870
    iget-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mBluetoothScoReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 871
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mBluetoothScoReceiver:Landroid/content/BroadcastReceiver;

    .line 872
    return-void
.end method

.method private unregisterForWiredHeadsetIntentBroadcast()V
    .locals 2

    .prologue
    .line 751
    iget-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lorg/chromium/media/AudioManagerAndroid;->mWiredHeadsetReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 752
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/chromium/media/AudioManagerAndroid;->mWiredHeadsetReceiver:Landroid/content/BroadcastReceiver;

    .line 753
    return-void
.end method

.method private updateDeviceActivation()V
    .locals 6

    .prologue
    .line 982
    const/4 v2, 0x0

    .line 983
    .local v2, "devices":[Z
    const/4 v3, -0x1

    .line 984
    .local v3, "requested":I
    iget-object v5, p0, Lorg/chromium/media/AudioManagerAndroid;->mLock:Ljava/lang/Object;

    monitor-enter v5

    .line 985
    :try_start_0
    iget v3, p0, Lorg/chromium/media/AudioManagerAndroid;->mRequestedAudioDevice:I

    .line 986
    iget-object v4, p0, Lorg/chromium/media/AudioManagerAndroid;->mAudioDevices:[Z

    invoke-virtual {v4}, [Z->clone()Ljava/lang/Object;

    move-result-object v4

    move-object v0, v4

    check-cast v0, [Z

    move-object v2, v0

    .line 987
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 988
    const/4 v4, -0x1

    if-ne v3, v4, :cond_0

    .line 989
    const-string v4, "Unable to activate device since no device is selected"

    invoke-static {v4}, Lorg/chromium/media/AudioManagerAndroid;->loge(Ljava/lang/String;)V

    .line 1004
    :goto_0
    return-void

    .line 987
    :catchall_0
    move-exception v4

    :try_start_1
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v4

    .line 995
    :cond_0
    const/4 v4, -0x2

    if-eq v3, v4, :cond_1

    aget-boolean v4, v2, v3

    if-nez v4, :cond_2

    .line 997
    :cond_1
    invoke-static {v2}, Lorg/chromium/media/AudioManagerAndroid;->selectDefaultDevice([Z)I

    move-result v1

    .line 998
    .local v1, "defaultDevice":I
    invoke-direct {p0, v1}, Lorg/chromium/media/AudioManagerAndroid;->setAudioDevice(I)V

    goto :goto_0

    .line 1002
    .end local v1    # "defaultDevice":I
    :cond_2
    invoke-direct {p0, v3}, Lorg/chromium/media/AudioManagerAndroid;->setAudioDevice(I)V

    goto :goto_0
.end method
