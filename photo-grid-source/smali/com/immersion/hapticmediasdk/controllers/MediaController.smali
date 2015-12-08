.class public Lcom/immersion/hapticmediasdk/controllers/MediaController;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/lang/String; = "MediaController"

.field private static final b:I = 0x3e8

.field public static b04460446ццц0446:I = 0x23

.field public static b0446ц0446цц0446:I = 0x1

.field public static bц04460446цц0446:I = 0x2

.field public static bцц0446цц0446:I = 0x0

.field private static final c:I = 0xc8


# instance fields
.field private d:Ljava/util/concurrent/atomic/AtomicInteger;

.field private e:Ljava/util/concurrent/atomic/AtomicInteger;

.field private f:Landroid/os/Handler;

.field private g:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

.field private h:Lcom/immersion/hapticmediasdk/utils/Profiler;

.field private i:Lcom/immersion/hapticmediasdk/MediaTaskManager;

.field private j:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/os/Looper;Lcom/immersion/hapticmediasdk/MediaTaskManager;)V
    .locals 3

    :try_start_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Lcom/immersion/hapticmediasdk/utils/Profiler;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b0446ц0446цц0446:I

    add-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    mul-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bц04460446цц0446:I

    rem-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bцц0446цц0446:I

    if-eq v1, v2, :cond_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b044604460446цц0446()I

    move-result v1

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b044604460446цц0446()I

    move-result v1

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bцц0446цц0446:I

    :cond_0
    :try_start_1
    invoke-direct {v0}, Lcom/immersion/hapticmediasdk/utils/Profiler;-><init>()V

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->h:Lcom/immersion/hapticmediasdk/utils/Profiler;

    new-instance v0, Lrrrrrr/rcrrrr;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    invoke-direct {v0, p0}, Lrrrrrr/rcrrrr;-><init>(Lcom/immersion/hapticmediasdk/controllers/MediaController;)V

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->j:Ljava/lang/Runnable;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    iput-object p2, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->i:Lcom/immersion/hapticmediasdk/MediaTaskManager;

    new-instance v0, Lrrrrrr/crrrrr;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    :try_start_4
    invoke-direct {v0, p0, p1}, Lrrrrrr/crrrrr;-><init>(Lcom/immersion/hapticmediasdk/controllers/MediaController;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->f:Landroid/os/Handler;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    return-void

    :catch_0
    move-exception v0

    throw v0

    :catch_1
    move-exception v0

    throw v0
.end method

.method private a()I
    .locals 1

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->g:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->pauseHapticPlayback()V

    const/4 v0, 0x0

    return v0
.end method

.method private a(I)V
    .locals 2

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->i:Lcom/immersion/hapticmediasdk/MediaTaskManager;

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PAUSED_DUE_TO_BUFFERING:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    invoke-virtual {v0, v1}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->transitToState(Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;)I

    return-void
.end method

.method private a(IJ)V
    .locals 4

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->g:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b0446ц0446цц0446:I

    add-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    mul-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bц04460446цц0446:I

    rem-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bцц0446цц0446:I

    if-eq v1, v2, :cond_0

    const/16 v1, 0xa

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    const/4 v1, 0x4

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bцц0446цц0446:I

    :cond_0
    invoke-virtual {v0, p1, p2, p3}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->playHapticForPlaybackPosition(IJ)V

    return-void
.end method

.method private a(Landroid/os/Message;)V
    .locals 5

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "haptic_download_exception"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    instance-of v1, v0, Lcom/immersion/hapticmediasdk/models/HttpUnsuccessfulException;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/immersion/hapticmediasdk/models/HttpUnsuccessfulException;

    const-string v2, "MediaController"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "caught HttpUnsuccessfulExcetion http status code = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v1}, Lcom/immersion/hapticmediasdk/models/HttpUnsuccessfulException;->getHttpStatusCode()I

    move-result v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/immersion/hapticmediasdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const-string v1, "MediaController"

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    sget v3, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b0446ц0446цц0446:I

    add-int/2addr v2, v3

    sget v3, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    mul-int/2addr v2, v3

    sget v3, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bц04460446цц0446:I

    rem-int/2addr v2, v3

    sget v3, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bцц0446цц0446:I

    if-eq v2, v3, :cond_1

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b044604460446цц0446()I

    move-result v2

    sput v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    const/16 v2, 0x62

    sput v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bцц0446цц0446:I

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "HapticDownloadError: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/immersion/hapticmediasdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->i:Lcom/immersion/hapticmediasdk/MediaTaskManager;

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED_DUE_TO_ERROR:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    invoke-virtual {v0, v1}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->transitToState(Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;)I

    return-void
.end method

.method private a(Z)V
    .locals 6

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->g:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->isStarted()Z

    move-result v0

    :cond_0
    if-eqz p1, :cond_2

    if-nez v0, :cond_1

    :goto_0
    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->g:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->g:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    const-wide/16 v4, 0xc8

    invoke-virtual {v0, v4, v5}, Ljava/lang/Object;->wait(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->g:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->isStarted()Z

    move-result v0

    add-int/lit8 v1, v1, 0x1

    if-nez p1, :cond_0

    const/4 v2, 0x5

    if-lt v1, v2, :cond_0

    :cond_1
    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :cond_2
    if-eqz v0, :cond_1

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method public static synthetic b043B043Bлллл(Lcom/immersion/hapticmediasdk/controllers/MediaController;IJ)V
    .locals 2

    sget v0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b0446ц0446цц0446:I

    add-int/2addr v1, v0

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bц04460446цц0446:I

    rem-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x4f

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    const/16 v0, 0x4a

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bцц0446цц0446:I

    :pswitch_0
    :try_start_0
    invoke-direct {p0, p1, p2, p3}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->a(IJ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic b043Bл043Bллл(Lcom/immersion/hapticmediasdk/controllers/MediaController;Landroid/os/Message;)V
    .locals 2

    sget v0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b0446ц0446цц0446:I

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bц04460446цц0446:I

    rem-int/2addr v0, v1

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bц0446ц0446ц0446()I

    move-result v1

    if-eq v0, v1, :cond_0

    const/16 v0, 0x1f

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    const/4 v0, 0x2

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bцц0446цц0446:I

    :cond_0
    invoke-direct {p0, p1}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->a(Landroid/os/Message;)V

    return-void
.end method

.method public static synthetic b043Bллллл(Lcom/immersion/hapticmediasdk/controllers/MediaController;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 2

    sget v0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b0446ц0446цц0446:I

    add-int/2addr v1, v0

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bц04460446цц0446:I

    rem-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x1f

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    const/16 v0, 0x49

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bцц0446цц0446:I

    :pswitch_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public static b044604460446цц0446()I
    .locals 1

    const/4 v0, 0x5

    return v0
.end method

.method public static b04460446ц0446ц0446()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public static synthetic bБ04110411041104110411(Lcom/immersion/hapticmediasdk/controllers/MediaController;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->d:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b0446ц0446цц0446:I

    add-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    mul-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bц04460446цц0446:I

    rem-int/2addr v1, v2

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bц0446ц0446ц0446()I

    move-result v2

    if-eq v1, v2, :cond_0

    const/16 v1, 0x14

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    const/16 v1, 0x4e

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bцц0446цц0446:I

    :cond_0
    return-object v0

    :catch_0
    move-exception v0

    throw v0
.end method

.method public static synthetic bл043B043Bллл(Lcom/immersion/hapticmediasdk/controllers/MediaController;)Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;
    .locals 2

    sget v0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b0446ц0446цц0446:I

    add-int/2addr v1, v0

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bц04460446цц0446:I

    rem-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x5d

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b044604460446цц0446()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bцц0446цц0446:I

    :pswitch_0
    :try_start_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->g:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic bл043Bлллл(Lcom/immersion/hapticmediasdk/controllers/MediaController;)Lcom/immersion/hapticmediasdk/MediaTaskManager;
    .locals 3

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->i:Lcom/immersion/hapticmediasdk/MediaTaskManager;

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b0446ц0446цц0446:I

    add-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    mul-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bц04460446цц0446:I

    rem-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bцц0446цц0446:I

    if-eq v1, v2, :cond_0

    const/16 v1, 0x34

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    const/16 v1, 0x49

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bцц0446цц0446:I

    :cond_0
    return-object v0
.end method

.method public static synthetic bлл043Bллл(Lcom/immersion/hapticmediasdk/controllers/MediaController;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->a(I)V

    return-void
.end method

.method public static bц0446ц0446ц0446()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public getControlHandler()Landroid/os/Handler;
    .locals 2

    sget v0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b0446ц0446цц0446:I

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bц04460446цц0446:I

    rem-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bцц0446цц0446:I

    if-eq v0, v1, :cond_0

    const/16 v0, 0x61

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    const/16 v0, 0x2d

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bцц0446цц0446:I

    :cond_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->f:Landroid/os/Handler;

    return-object v0
.end method

.method public getCurrentPosition()I
    .locals 2

    sget v0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b0446ц0446цц0446:I

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bц04460446цц0446:I

    rem-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bцц0446цц0446:I

    if-eq v0, v1, :cond_0

    const/16 v0, 0x33

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    const/16 v0, 0x3f

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bцц0446цц0446:I

    :cond_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->i:Lcom/immersion/hapticmediasdk/MediaTaskManager;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->getMediaTimestamp()J

    move-result-wide v0

    long-to-int v0, v0

    return v0
.end method

.method public getReferenceTimeForCurrentPosition()J
    .locals 2

    sget v0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b0446ц0446цц0446:I

    add-int/2addr v1, v0

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bц04460446цц0446:I

    rem-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b044604460446цц0446()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    const/16 v0, 0x26

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bцц0446цц0446:I

    :pswitch_0
    :try_start_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->i:Lcom/immersion/hapticmediasdk/MediaTaskManager;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->getMediaReferenceTime()J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    return-wide v0

    :catch_0
    move-exception v0

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public initHapticPlayback(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->g:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->g:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->start()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget v0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b0446ц0446цц0446:I

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bц04460446цц0446:I

    rem-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bцц0446цц0446:I

    if-eq v0, v1, :cond_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b044604460446цц0446()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    const/16 v0, 0x18

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bцц0446цц0446:I

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    invoke-direct {p0, v0}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->a(Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_0
    move-exception v0

    throw v0

    :catch_1
    move-exception v0

    throw v0
.end method

.method public isPlaying()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->i:Lcom/immersion/hapticmediasdk/MediaTaskManager;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->getSDKStatus()Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    move-result-object v0

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PLAYING:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    throw v0
.end method

.method public onDestroy(Landroid/os/Handler;)V
    .locals 3

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->g:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->g:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->quitHapticPlayback()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->a(Z)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->g:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    :cond_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->i:Lcom/immersion/hapticmediasdk/MediaTaskManager;

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b0446ц0446цц0446:I

    add-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    mul-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bц04460446цц0446:I

    rem-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bцц0446цц0446:I

    if-eq v1, v2, :cond_1

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b044604460446цц0446()I

    move-result v1

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    const/16 v1, 0x1d

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bцц0446цц0446:I

    :cond_1
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onPause()I
    .locals 3

    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->a()I

    move-result v0

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b0446ц0446цц0446:I

    add-int/2addr v2, v1

    mul-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bц04460446цц0446:I

    rem-int/2addr v1, v2

    packed-switch v1, :pswitch_data_0

    const/16 v1, 0x27

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    const/16 v1, 0x49

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bцц0446цц0446:I

    :pswitch_0
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onPrepared()I
    .locals 1

    invoke-virtual {p0}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->prepareHapticPlayback()I

    move-result v0

    return v0
.end method

.method public playbackStarted()V
    .locals 4

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->g:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->g:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b0446ц0446цц0446:I

    add-int/2addr v2, v1

    mul-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bц04460446цц0446:I

    rem-int/2addr v1, v2

    packed-switch v1, :pswitch_data_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b044604460446цц0446()I

    move-result v1

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b044604460446цц0446()I

    move-result v1

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bцц0446цц0446:I

    :pswitch_0
    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->getHandler()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->j:Ljava/lang/Runnable;

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_0
    return-void

    :cond_0
    const-string v0, "MediaController"

    const-string v1, "Can\'t start periodic sync since haptic playback thread stopped."

    invoke-static {v0, v1}, Lcom/immersion/hapticmediasdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public prepareHapticPlayback()I
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->h:Lcom/immersion/hapticmediasdk/utils/Profiler;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/utils/Profiler;->startTiming()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->g:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    iget-object v1, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v1

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    sget v3, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b0446ц0446цц0446:I

    add-int/2addr v3, v2

    mul-int/2addr v2, v3

    sget v3, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bц04460446цц0446:I

    rem-int/2addr v2, v3

    packed-switch v2, :pswitch_data_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b044604460446цц0446()I

    move-result v2

    sput v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    const/16 v2, 0x62

    sput v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bцц0446цц0446:I

    :pswitch_0
    :try_start_2
    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->prepareHapticPlayback(II)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    const/4 v0, 0x0

    return v0

    :catch_0
    move-exception v0

    throw v0

    :catch_1
    move-exception v0

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public seekTo(I)V
    .locals 3

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    if-lez p1, :cond_1

    :goto_0
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->g:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->g:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->getHandler()Landroid/os/Handler;

    move-result-object v0

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b0446ц0446цц0446:I

    add-int/2addr v2, v1

    mul-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bц04460446цц0446:I

    rem-int/2addr v1, v2

    packed-switch v1, :pswitch_data_0

    const/16 v1, 0x42

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    const/4 v1, 0x5

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bцц0446цц0446:I

    :pswitch_0
    iget-object v1, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->j:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->g:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->removePlaybackCallbacks()V

    :cond_0
    return-void

    :cond_1
    const/4 p1, 0x0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public setRequestBufferPosition(I)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->d:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b044604460446цц0446()I

    move-result v1

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b0446ц0446цц0446:I

    add-int/2addr v2, v1

    mul-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bц04460446цц0446:I

    rem-int/2addr v1, v2

    packed-switch v1, :pswitch_data_0

    const/16 v1, 0x8

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b044604460446цц0446()I

    move-result v1

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bцц0446цц0446:I

    :pswitch_0
    :try_start_1
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v0

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public stopHapticPlayback()I
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->g:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->stopHapticPlayback()V

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->g:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b0446ц0446цц0446:I

    add-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    mul-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bц04460446цц0446:I

    rem-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bцц0446цц0446:I

    if-eq v1, v2, :cond_0

    const/16 v1, 0x30

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b04460446ццц0446:I

    const/16 v1, 0x3f

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bцц0446цц0446:I

    :cond_0
    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->getHandler()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->j:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return v3
.end method

.method public waitHapticStopped()V
    .locals 6

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->g:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->isStopped()Z

    move-result v1

    const/4 v0, 0x0

    :goto_0
    if-nez v1, :cond_0

    const/4 v1, 0x5

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->g:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->g:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    const-wide/16 v4, 0xc8

    invoke-virtual {v2, v4, v5}, Ljava/lang/Object;->wait(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v1, p0, Lcom/immersion/hapticmediasdk/controllers/MediaController;->g:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-virtual {v1}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->isStopped()Z

    move-result v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :cond_0
    return-void

    :catch_0
    move-exception v2

    goto :goto_1
.end method
