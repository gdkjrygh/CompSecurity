.class public abstract Lcom/immersion/hapticmediasdk/HapticContentSDK;
.super Ljava/lang/Object;


# static fields
.field public static final INACCESSIBLE_URL:I = -0x2

.field public static final INVALID:I = -0x1

.field public static final MALFORMED_URL:I = -0x4

.field public static final PERMISSION_DENIED:I = -0x3

.field public static final SDKMODE_MEDIAPLAYBACK:I = 0x0

.field public static final SUCCESS:I = 0x0

.field public static final UNSUPPORTED_PROTOCOL:I = -0x5

.field private static final a:Ljava/lang/String; = "HapticContentSDK"

.field public static final b044404440444ф04440444:I = 0x2710

.field public static b044604460446ццц:I = 0x19

.field public static b0446цц0446цц:I = 0x1

.field public static final bф04440444ф04440444:I = 0x5dc

.field public static bц0446ц0446цц:I = 0x2

.field public static bццц0446цц:I


# instance fields
.field private b:Landroid/os/HandlerThread;

.field private c:Landroid/os/Handler;

.field private d:Landroid/content/Context;

.field private e:Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;

.field public mDisposed:Z

.field public mMediaTaskManager:Lcom/immersion/hapticmediasdk/MediaTaskManager;

.field public mSDKStatus:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;


# direct methods
.method public constructor <init>(ILandroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->NOT_INITIALIZED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->mSDKStatus:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->mDisposed:Z

    iput-object p2, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->d:Landroid/content/Context;

    sget v0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b044604460446ццц:I

    sget v1, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b0446цц0446цц:I

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b044604460446ццц:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/HapticContentSDK;->bц0446ц0446цц:I

    rem-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/HapticContentSDK;->bццц0446цц:I

    if-eq v0, v1, :cond_0

    const/16 v0, 0x18

    sput v0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b044604460446ццц:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b04460446ц0446цц()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->bццц0446цц:I

    :cond_0
    new-instance v0, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;

    invoke-direct {v0}, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;-><init>()V

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->e:Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;

    return-void
.end method

.method public static b04460446ц0446цц()I
    .locals 1

    const/16 v0, 0x60

    return v0
.end method

.method public static bцц04460446цц()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method


# virtual methods
.method public bБ04110411Б04110411()I
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.permission.VIBRATE"

    iget-object v2, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->d:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "SDK Monitor"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b:Landroid/os/HandlerThread;

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    new-instance v0, Landroid/os/Handler;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v1, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->c:Landroid/os/Handler;

    new-instance v0, Lcom/immersion/hapticmediasdk/MediaTaskManager;

    iget-object v1, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->c:Landroid/os/Handler;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    sget v2, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b044604460446ццц:I

    sget v3, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b0446цц0446цц:I

    add-int/2addr v3, v2

    mul-int/2addr v2, v3

    sget v3, Lcom/immersion/hapticmediasdk/HapticContentSDK;->bц0446ц0446цц:I

    rem-int/2addr v2, v3

    packed-switch v2, :pswitch_data_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b04460446ц0446цц()I

    move-result v2

    sput v2, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b044604460446ццц:I

    const/16 v2, 0x5d

    sput v2, Lcom/immersion/hapticmediasdk/HapticContentSDK;->bццц0446цц:I

    :pswitch_0
    :try_start_2
    iget-object v2, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->d:Landroid/content/Context;

    iget-object v3, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->e:Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;

    invoke-direct {v0, v1, v2, v3}, Lcom/immersion/hapticmediasdk/MediaTaskManager;-><init>(Landroid/os/Handler;Landroid/content/Context;Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;)V

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->mMediaTaskManager:Lcom/immersion/hapticmediasdk/MediaTaskManager;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    :try_start_3
    const-string v0, "HapticContentSDK"

    const-string v1, "Failed to create a Haptic Content SDK instance.Vibrate permission denied."

    invoke-static {v0, v1}, Lcom/immersion/hapticmediasdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    const/4 v0, -0x3

    goto :goto_0

    :catch_0
    move-exception v0

    throw v0

    :catch_1
    move-exception v0

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final dispose()V
    .locals 3

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/immersion/hapticmediasdk/HapticContentSDK;->getSDKStatus()Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    move-result-object v0

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->DISPOSED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->mMediaTaskManager:Lcom/immersion/hapticmediasdk/MediaTaskManager;

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->NOT_INITIALIZED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    invoke-virtual {v0, v1}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->transitToState(Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;)I

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    iput-object v2, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b:Landroid/os/HandlerThread;

    iput-object v2, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->mMediaTaskManager:Lcom/immersion/hapticmediasdk/MediaTaskManager;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->mDisposed:Z

    :cond_0
    return-void
.end method

.method public finalize()V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lcom/immersion/hapticmediasdk/HapticContentSDK;->dispose()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void

    :catchall_0
    move-exception v0

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    throw v0

    :catch_0
    move-exception v0

    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0
.end method

.method public final getSDKStatus()Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;
    .locals 1

    iget-boolean v0, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->mDisposed:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->DISPOSED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->mMediaTaskManager:Lcom/immersion/hapticmediasdk/MediaTaskManager;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->getSDKStatus()Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    move-result-object v0

    goto :goto_0
.end method

.method public final getVersion()Ljava/lang/String;
    .locals 0

    :goto_0
    goto/32 :goto_0
.end method

.method public final mute()I
    .locals 2

    sget v0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b044604460446ццц:I

    sget v1, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b0446цц0446цц:I

    add-int/2addr v1, v0

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/HapticContentSDK;->bц0446ц0446цц:I

    rem-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x10

    sput v0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b044604460446ццц:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b04460446ц0446цц()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->bццц0446цц:I

    :pswitch_0
    :try_start_0
    invoke-virtual {p0}, Lcom/immersion/hapticmediasdk/HapticContentSDK;->getSDKStatus()Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    move-result-object v0

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->DISPOSED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eq v0, v1, :cond_0

    :try_start_1
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->e:Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;->mute()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0

    :catch_0
    move-exception v0

    throw v0

    :catch_1
    move-exception v0

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public abstract openHaptics(Ljava/lang/String;)I
.end method

.method public final pause()I
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/immersion/hapticmediasdk/HapticContentSDK;->getSDKStatus()Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    move-result-object v0

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->DISPOSED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-eq v0, v1, :cond_0

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED_DUE_TO_ERROR:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-ne v0, v1, :cond_1

    :goto_0
    const/4 v0, 0x0

    :try_start_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/16 v0, 0x15

    sput v0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b044604460446ццц:I

    :cond_0
    const/4 v0, -0x1

    :goto_1
    return v0

    :cond_1
    :try_start_2
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->mMediaTaskManager:Lcom/immersion/hapticmediasdk/MediaTaskManager;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :try_start_3
    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PAUSED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    invoke-virtual {v0, v1}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->transitToState(Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;)I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    move-result v0

    goto :goto_1

    :catch_1
    move-exception v0

    throw v0

    :catch_2
    move-exception v0

    throw v0
.end method

.method public final play()I
    .locals 4

    :try_start_0
    invoke-virtual {p0}, Lcom/immersion/hapticmediasdk/HapticContentSDK;->getSDKStatus()Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    move-result-object v0

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->INITIALIZED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-eq v0, v1, :cond_0

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne v0, v1, :cond_2

    :cond_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->mMediaTaskManager:Lcom/immersion/hapticmediasdk/MediaTaskManager;

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v2, v3}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->setMediaTimestamp(J)V

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->mMediaTaskManager:Lcom/immersion/hapticmediasdk/MediaTaskManager;

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PLAYING:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b04460446ц0446цц()I

    move-result v2

    sget v3, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b0446цц0446цц:I

    add-int/2addr v2, v3

    invoke-static {}, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b04460446ц0446цц()I

    move-result v3

    mul-int/2addr v2, v3

    invoke-static {}, Lcom/immersion/hapticmediasdk/HapticContentSDK;->bцц04460446цц()I

    move-result v3

    rem-int/2addr v2, v3

    sget v3, Lcom/immersion/hapticmediasdk/HapticContentSDK;->bццц0446цц:I

    if-eq v2, v3, :cond_1

    invoke-static {}, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b04460446ц0446цц()I

    move-result v2

    sput v2, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b044604460446ццц:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b04460446ц0446цц()I

    move-result v2

    sput v2, Lcom/immersion/hapticmediasdk/HapticContentSDK;->bццц0446цц:I

    :cond_1
    :try_start_1
    invoke-virtual {v0, v1}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->transitToState(Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    :goto_0
    return v0

    :cond_2
    const/4 v0, -0x1

    goto :goto_0

    :catch_0
    move-exception v0

    throw v0

    :catch_1
    move-exception v0

    throw v0
.end method

.method public final resume()I
    .locals 2

    invoke-virtual {p0}, Lcom/immersion/hapticmediasdk/HapticContentSDK;->getSDKStatus()Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    move-result-object v0

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PAUSED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-eq v0, v1, :cond_0

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PLAYING:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-eq v0, v1, :cond_0

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne v0, v1, :cond_1

    :goto_0
    goto/32 :goto_0

    :cond_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->mMediaTaskManager:Lcom/immersion/hapticmediasdk/MediaTaskManager;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->setMediaReferenceTime()V

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->mMediaTaskManager:Lcom/immersion/hapticmediasdk/MediaTaskManager;

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PLAYING:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    invoke-virtual {v0, v1}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->transitToState(Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;)I

    move-result v0

    :goto_1
    return v0

    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method

.method public final seek(I)I
    .locals 3

    invoke-virtual {p0}, Lcom/immersion/hapticmediasdk/HapticContentSDK;->getSDKStatus()Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    move-result-object v0

    sget v1, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b044604460446ццц:I

    sget v2, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b0446цц0446цц:I

    add-int/2addr v2, v1

    mul-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/HapticContentSDK;->bц0446ц0446цц:I

    rem-int/2addr v1, v2

    packed-switch v1, :pswitch_data_0

    const/16 v1, 0x38

    sput v1, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b044604460446ццц:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b04460446ц0446цц()I

    move-result v1

    sput v1, Lcom/immersion/hapticmediasdk/HapticContentSDK;->bццц0446цц:I

    :pswitch_0
    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->DISPOSED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-eq v0, v1, :cond_0

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->NOT_INITIALIZED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-eq v0, v1, :cond_0

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED_DUE_TO_ERROR:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0

    :cond_1
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->mMediaTaskManager:Lcom/immersion/hapticmediasdk/MediaTaskManager;

    invoke-virtual {v0, p1}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->SeekTo(I)I

    move-result v0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final stop()I
    .locals 2

    invoke-virtual {p0}, Lcom/immersion/hapticmediasdk/HapticContentSDK;->getSDKStatus()Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    move-result-object v0

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->DISPOSED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-eq v0, v1, :cond_0

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->NOT_INITIALIZED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0

    :cond_1
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->mMediaTaskManager:Lcom/immersion/hapticmediasdk/MediaTaskManager;

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    invoke-virtual {v0, v1}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->transitToState(Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;)I

    move-result v0

    goto :goto_0
.end method

.method public final unmute()I
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/immersion/hapticmediasdk/HapticContentSDK;->getSDKStatus()Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    move-result-object v0

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->DISPOSED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->e:Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;->unmute()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0

    :catch_0
    move-exception v0

    throw v0
.end method

.method public final update(J)I
    .locals 3

    invoke-virtual {p0}, Lcom/immersion/hapticmediasdk/HapticContentSDK;->getSDKStatus()Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    move-result-object v0

    sget v1, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b044604460446ццц:I

    sget v2, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b0446цц0446цц:I

    add-int/2addr v2, v1

    mul-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/HapticContentSDK;->bц0446ц0446цц:I

    rem-int/2addr v1, v2

    packed-switch v1, :pswitch_data_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b04460446ц0446цц()I

    move-result v1

    sput v1, Lcom/immersion/hapticmediasdk/HapticContentSDK;->b044604460446ццц:I

    const/16 v1, 0x62

    sput v1, Lcom/immersion/hapticmediasdk/HapticContentSDK;->bццц0446цц:I

    :pswitch_0
    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PLAYING:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-eq v0, v1, :cond_0

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PAUSED_DUE_TO_TIMEOUT:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne v0, v1, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->mMediaTaskManager:Lcom/immersion/hapticmediasdk/MediaTaskManager;

    invoke-virtual {v0, p1, p2}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->setMediaTimestamp(J)V

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->mMediaTaskManager:Lcom/immersion/hapticmediasdk/MediaTaskManager;

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PLAYING:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    invoke-virtual {v0, v1}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->transitToState(Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;)I

    move-result v0

    :goto_0
    return v0

    :cond_1
    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PAUSED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-eq v0, v1, :cond_2

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PAUSED_DUE_TO_BUFFERING:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne v0, v1, :cond_3

    :cond_2
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/HapticContentSDK;->mMediaTaskManager:Lcom/immersion/hapticmediasdk/MediaTaskManager;

    invoke-virtual {v0, p1, p2}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->setMediaTimestamp(J)V

    const/4 v0, 0x0

    goto :goto_0

    :cond_3
    const/4 v0, -0x1

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
