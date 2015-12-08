.class public Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;
.super Lcom/immersion/hapticmediasdk/HapticContentSDK;


# static fields
.field private static final a:Ljava/lang/String; = "HapticContentSDK"

.field public static b044A044Aъъ044Aъ:I = 0x1

.field public static b044Aъъъ044Aъ:I = 0xd

.field public static bъ044Aъъ044Aъ:I = 0x0

.field public static bъъ044Aъ044Aъ:I = 0x2


# instance fields
.field private b:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0, v0, p1}, Lcom/immersion/hapticmediasdk/HapticContentSDK;-><init>(ILandroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v0, 0x190

    sget v1, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->b044Aъъъ044Aъ:I

    sget v2, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->b044A044Aъъ044Aъ:I

    add-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->b044Aъъъ044Aъ:I

    mul-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->bъъ044Aъ044Aъ:I

    rem-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->bъ044Aъъ044Aъ:I

    if-eq v1, v2, :cond_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->b044Aъ044Aъ044Aъ()I

    move-result v1

    sput v1, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->b044Aъъъ044Aъ:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->b044Aъ044Aъ044Aъ()I

    move-result v1

    sput v1, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->bъ044Aъъ044Aъ:I

    :cond_0
    :try_start_1
    iput v0, p0, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->b:I
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

.method private a(Ljava/lang/String;)Z
    .locals 6

    const/4 v0, 0x0

    const-string v1, "https"

    const-string v2, "http"

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :try_start_0
    new-instance v2, Lrrrrrr/rrccrr;

    invoke-direct {v2, p0, v1}, Lrrrrrr/rrccrr;-><init>(Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_1

    new-instance v1, Ljava/lang/Thread;

    const-string v3, "ping url"

    invoke-direct {v1, v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    monitor-enter v2

    const/16 v1, -0x64

    :try_start_1
    iput v1, p0, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->b:I

    :goto_0
    iget v1, p0, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->b:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-gez v1, :cond_0

    const-wide/16 v4, 0x64

    :try_start_2
    invoke-virtual {v2, v4, v5}, Ljava/lang/Object;->wait(J)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0

    :cond_0
    const/16 v1, 0xc8

    :try_start_3
    iget v3, p0, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->b:I

    if-gt v1, v3, :cond_1

    iget v1, p0, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->b:I

    const/16 v3, 0x18f

    if-gt v1, v3, :cond_1

    const/4 v0, 0x1

    :cond_1
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_1
    return v0

    :catch_1
    move-exception v1

    const-string v2, "HapticContentSDK"

    invoke-virtual {v1}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/immersion/hapticmediasdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0
.end method

.method private b(Ljava/lang/String;)I
    .locals 3

    const/4 v0, -0x4

    if-nez p1, :cond_0

    const-string v1, "HapticContentSDK"

    const-string v2, "invalid local hapt file url: null"

    invoke-static {v1, v2}, Lcom/immersion/hapticmediasdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return v0

    :cond_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->canRead()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->mMediaTaskManager:Lcom/immersion/hapticmediasdk/MediaTaskManager;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->setHapticsUrl(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->mMediaTaskManager:Lcom/immersion/hapticmediasdk/MediaTaskManager;

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->INITIALIZED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    invoke-virtual {v0, v1}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->transitToState(Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;)I

    move-result v0

    goto :goto_0

    :cond_1
    const-string v0, "HapticContentSDK"

    const-string v1, "could not access local hapt file: permission denied"

    invoke-static {v0, v1}, Lcom/immersion/hapticmediasdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, -0x3

    goto :goto_0

    :cond_2
    const-string v1, "HapticContentSDK"

    const-string v2, "invalid local hapt file url: directory"

    invoke-static {v1, v2}, Lcom/immersion/hapticmediasdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static b044A044A044Aъ044Aъ()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public static b044Aъ044Aъ044Aъ()I
    .locals 1

    const/16 v0, 0x3d

    return v0
.end method

.method public static synthetic bллл043B043Bл(Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;I)I
    .locals 2

    invoke-static {}, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->b044Aъ044Aъ044Aъ()I

    move-result v0

    sget v1, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->b044A044Aъъ044Aъ:I

    add-int/2addr v0, v1

    invoke-static {}, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->b044Aъ044Aъ044Aъ()I

    move-result v1

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->bъъ044Aъ044Aъ:I

    rem-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->bъ044Aъъ044Aъ:I

    if-eq v0, v1, :cond_0

    const/4 v0, 0x4

    sput v0, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->b044Aъъъ044Aъ:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->b044Aъ044Aъ044Aъ()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->bъ044Aъъ044Aъ:I

    :cond_0
    :try_start_0
    iput p1, p0, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->b:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception v0

    throw v0
.end method

.method public static bъ044A044Aъ044Aъ()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public openHaptics(Ljava/lang/String;)I
    .locals 2

    invoke-virtual {p0}, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->getSDKStatus()Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    move-result-object v0

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-eq v0, v1, :cond_0

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->NOT_INITIALIZED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-eq v0, v1, :cond_0

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->INITIALIZED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-eq v0, v1, :cond_0

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED_DUE_TO_ERROR:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne v0, v1, :cond_7

    :cond_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->mMediaTaskManager:Lcom/immersion/hapticmediasdk/MediaTaskManager;

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->NOT_INITIALIZED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    invoke-virtual {v0, v1}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->transitToState(Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;)I

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    return v0

    :cond_1
    invoke-static {p1}, Landroid/webkit/URLUtil;->isFileUrl(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-direct {p0, p1}, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->b(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_2
    invoke-static {p1}, Landroid/webkit/URLUtil;->isValidUrl(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-direct {p0, p1}, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->b(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_3
    invoke-static {p1}, Landroid/webkit/URLUtil;->isHttpUrl(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-static {p1}, Landroid/webkit/URLUtil;->isHttpsUrl(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_4
    invoke-direct {p0, p1}, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "HapticContentSDK"

    const-string v1, "could not access hapt file url: Inaccessible URL"

    invoke-static {v0, v1}, Lcom/immersion/hapticmediasdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, -0x2

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->mMediaTaskManager:Lcom/immersion/hapticmediasdk/MediaTaskManager;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->setHapticsUrl(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/MediaPlaybackSDK;->mMediaTaskManager:Lcom/immersion/hapticmediasdk/MediaTaskManager;

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->INITIALIZED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    invoke-virtual {v0, v1}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->transitToState(Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;)I

    move-result v0

    goto :goto_0

    :cond_6
    const-string v0, "HapticContentSDK"

    const-string v1, "could not access hapt file url: unsupposted protocol"

    invoke-static {v0, v1}, Lcom/immersion/hapticmediasdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, -0x5

    goto :goto_0

    :cond_7
    const/4 v0, -0x1

    goto :goto_0
.end method
