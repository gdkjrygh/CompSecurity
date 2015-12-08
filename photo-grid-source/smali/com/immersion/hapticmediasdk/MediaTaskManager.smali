.class public Lcom/immersion/hapticmediasdk/MediaTaskManager;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final a:Ljava/lang/String; = "MediaTaskManager"

.field public static b04150415ЕЕЕЕ:I = 0x2

.field public static bЕ04150415ЕЕЕ:I = 0x0

.field public static bЕ0415ЕЕЕЕ:I = 0x1

.field public static bС04210421042104210421:I = 0x25


# instance fields
.field private final b:Ljava/lang/Object;

.field private final c:Ljava/lang/Object;

.field private d:J

.field private e:J

.field private f:Landroid/os/Handler;

.field private volatile g:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

.field private h:Lcom/immersion/hapticmediasdk/controllers/MediaController;

.field private i:Ljava/lang/String;

.field private j:Z

.field private k:Landroid/content/Context;

.field private l:Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Landroid/content/Context;Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;)V
    .locals 2

    sget v0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bС04210421042104210421:I

    sget v1, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕ0415ЕЕЕЕ:I

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bС04210421042104210421:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/MediaTaskManager;->b04150415ЕЕЕЕ:I

    rem-int/2addr v0, v1

    invoke-static {}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->b0415ЕЕЕЕЕ()I

    move-result v1

    if-eq v0, v1, :cond_0

    const/16 v0, 0x2f

    sput v0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bС04210421042104210421:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕЕ0415ЕЕЕ()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕ0415ЕЕЕЕ:I

    :cond_0
    :try_start_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->b:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->c:Ljava/lang/Object;

    sget-object v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->NOT_INITIALIZED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    iput-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->g:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    iput-object p1, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->f:Landroid/os/Handler;

    iput-object p2, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->k:Landroid/content/Context;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    iput-object p3, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->l:Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    return-void

    :catch_0
    move-exception v0

    throw v0

    :catch_1
    move-exception v0

    throw v0
.end method

.method private a()I
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->f:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->h:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->d()I

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MediaTaskManager"

    const-string v1, "Could not dispose haptics, reset anyway."

    invoke-static {v0, v1}, Lcom/immersion/hapticmediasdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    const/4 v0, 0x0

    :try_start_1
    iput-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->i:Ljava/lang/String;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->d:J

    sget-object v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->NOT_INITIALIZED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->g:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    sget v0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bС04210421042104210421:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->b0415Е0415ЕЕЕ()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/MediaTaskManager;->b04150415ЕЕЕЕ:I

    rem-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕЕ0415ЕЕЕ()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bС04210421042104210421:I

    const/16 v0, 0x37

    sput v0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕ0415ЕЕЕЕ:I

    :pswitch_0
    const/4 v0, 0x0

    return v0

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

.method private a(Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;)I
    .locals 6

    sget v0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bС04210421042104210421:I

    sget v1, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕ0415ЕЕЕЕ:I

    add-int/2addr v1, v0

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/MediaTaskManager;->b04150415ЕЕЕЕ:I

    rem-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x13

    sput v0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bС04210421042104210421:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕЕ0415ЕЕЕ()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕ0415ЕЕЕЕ:I

    :pswitch_0
    :try_start_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->f:Landroid/os/Handler;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iput-object p1, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->g:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->i:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/immersion/hapticmediasdk/controllers/MediaController;

    iget-object v1, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->f:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lcom/immersion/hapticmediasdk/controllers/MediaController;-><init>(Landroid/os/Looper;Lcom/immersion/hapticmediasdk/MediaTaskManager;)V

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->h:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->h:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->getControlHandler()Landroid/os/Handler;

    move-result-object v3

    new-instance v0, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    iget-object v1, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->k:Landroid/content/Context;

    iget-object v2, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->i:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    iget-boolean v4, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->j:Z

    iget-object v5, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->l:Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;

    invoke-direct/range {v0 .. v5}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Handler;ZLcom/immersion/hapticmediasdk/utils/RuntimeInfo;)V

    iget-object v1, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->h:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    invoke-virtual {v1, v0}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->initHapticPlayback(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x4

    goto :goto_0

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

.method private b()I
    .locals 4

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->f:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->h:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->onPrepared()I

    move-result v0

    if-nez v0, :cond_0

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PLAYING:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    iput-object v1, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->g:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    iget-object v1, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->f:Landroid/os/Handler;

    sget v2, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bС04210421042104210421:I

    sget v3, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕ0415ЕЕЕЕ:I

    add-int/2addr v3, v2

    mul-int/2addr v2, v3

    sget v3, Lcom/immersion/hapticmediasdk/MediaTaskManager;->b04150415ЕЕЕЕ:I

    rem-int/2addr v2, v3

    packed-switch v2, :pswitch_data_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕЕ0415ЕЕЕ()I

    move-result v2

    sput v2, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bС04210421042104210421:I

    const/16 v2, 0x44

    sput v2, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕ04150415ЕЕЕ:I

    :pswitch_0
    const-wide/16 v2, 0x5dc

    invoke-virtual {v1, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public static b0415Е0415ЕЕЕ()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static b0415ЕЕЕЕЕ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public static bЕЕ0415ЕЕЕ()I
    .locals 1

    const/16 v0, 0x36

    return v0
.end method

.method private c()I
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->f:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->d:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget v0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bС04210421042104210421:I

    sget v1, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕ0415ЕЕЕЕ:I

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bС04210421042104210421:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/MediaTaskManager;->b04150415ЕЕЕЕ:I

    rem-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕ04150415ЕЕЕ:I

    if-eq v0, v1, :cond_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕЕ0415ЕЕЕ()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bС04210421042104210421:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕЕ0415ЕЕЕ()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕ04150415ЕЕЕ:I

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->h:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->stopHapticPlayback()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    if-nez v0, :cond_1

    :try_start_2
    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    iput-object v1, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->g:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :cond_1
    return v0

    :catch_0
    move-exception v0

    throw v0

    :catch_1
    move-exception v0

    throw v0
.end method

.method private d()I
    .locals 3

    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->c()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v1, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->h:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    iget-object v2, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->f:Landroid/os/Handler;

    invoke-virtual {v1, v2}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->onDestroy(Landroid/os/Handler;)V

    sget v1, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bС04210421042104210421:I

    sget v2, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕ0415ЕЕЕЕ:I

    add-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bС04210421042104210421:I

    mul-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/MediaTaskManager;->b04150415ЕЕЕЕ:I

    rem-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕ04150415ЕЕЕ:I

    if-eq v1, v2, :cond_0

    const/16 v1, 0x50

    sput v1, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bС04210421042104210421:I

    const/16 v1, 0x2c

    sput v1, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕ04150415ЕЕЕ:I

    :cond_0
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->h:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    :cond_1
    return v0
.end method

.method private e()I
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->f:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->h:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->onPause()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    goto/32 :goto_0

    :catch_0
    move-exception v0

    throw v0

    :catch_1
    move-exception v0

    throw v0

    :cond_0
    return v0
.end method

.method private f()I
    .locals 4

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->f:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->f:Landroid/os/Handler;

    const-wide/16 v2, 0x5dc

    invoke-virtual {v0, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    invoke-static {}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕЕ0415ЕЕЕ()I

    move-result v1

    sget v2, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕ0415ЕЕЕЕ:I

    add-int/2addr v1, v2

    invoke-static {}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕЕ0415ЕЕЕ()I

    move-result v2

    mul-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/MediaTaskManager;->b04150415ЕЕЕЕ:I

    rem-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕ04150415ЕЕЕ:I

    if-eq v1, v2, :cond_0

    const/16 v1, 0x46

    sput v1, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bС04210421042104210421:I

    const/16 v1, 0x32

    sput v1, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕ04150415ЕЕЕ:I

    :cond_0
    :goto_0
    return v0

    :cond_1
    const/4 v0, -0x1

    goto :goto_0
.end method

.method private g()I
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->h:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->onPause()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-nez v0, :cond_1

    sget v1, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bС04210421042104210421:I

    sget v2, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕ0415ЕЕЕЕ:I

    add-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bС04210421042104210421:I

    mul-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/MediaTaskManager;->b04150415ЕЕЕЕ:I

    rem-int/2addr v1, v2

    invoke-static {}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->b0415ЕЕЕЕЕ()I

    move-result v2

    if-eq v1, v2, :cond_0

    const/16 v1, 0x40

    sput v1, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bС04210421042104210421:I

    const/16 v1, 0x20

    sput v1, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕ04150415ЕЕЕ:I

    :cond_0
    :try_start_1
    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PAUSED_DUE_TO_TIMEOUT:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    iput-object v1, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->g:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :cond_1
    return v0

    :catch_0
    move-exception v0

    throw v0
.end method

.method private h()I
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->h:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->onPause()I

    move-result v0

    if-nez v0, :cond_0

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PAUSED_DUE_TO_BUFFERING:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    iput-object v1, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->g:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    sget v1, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bС04210421042104210421:I

    sget v2, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕ0415ЕЕЕЕ:I

    add-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bС04210421042104210421:I

    mul-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/MediaTaskManager;->b04150415ЕЕЕЕ:I

    rem-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕ04150415ЕЕЕ:I

    if-eq v1, v2, :cond_1

    const/16 v1, 0x1d

    sput v1, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bС04210421042104210421:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕЕ0415ЕЕЕ()I

    move-result v1

    sput v1, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕ04150415ЕЕЕ:I

    :cond_1
    return v0

    :catch_0
    move-exception v0

    throw v0
.end method

.method private i()I
    .locals 2

    sget v0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bС04210421042104210421:I

    sget v1, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕ0415ЕЕЕЕ:I

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bС04210421042104210421:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/MediaTaskManager;->b04150415ЕЕЕЕ:I

    rem-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕ04150415ЕЕЕ:I

    if-eq v0, v1, :cond_0

    const/16 v0, 0x4e

    sput v0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bС04210421042104210421:I

    const/16 v0, 0xe

    sput v0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕ04150415ЕЕЕ:I

    :cond_0
    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->b()I

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->f()I

    move-result v0

    :cond_1
    return v0
.end method


# virtual methods
.method public SeekTo(I)I
    .locals 2

    invoke-static {}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕЕ0415ЕЕЕ()I

    move-result v0

    invoke-static {}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->b0415Е0415ЕЕЕ()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/MediaTaskManager;->b04150415ЕЕЕЕ:I

    rem-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0xa

    sput v0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bС04210421042104210421:I

    const/4 v0, 0x6

    sput v0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕ0415ЕЕЕЕ:I

    :pswitch_0
    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->setMediaTimestamp(J)V

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->h:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    invoke-virtual {v0, p1}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->seekTo(I)V

    invoke-virtual {p0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->getSDKStatus()Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    move-result-object v0

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PLAYING:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->h:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->prepareHapticPlayback()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public getMediaReferenceTime()J
    .locals 4

    iget-object v1, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-wide v2, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->e:J

    monitor-exit v1

    return-wide v2

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getMediaTimestamp()J
    .locals 4

    iget-object v1, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-wide v2, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->d:J

    monitor-exit v1

    return-wide v2

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getSDKStatus()Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;
    .locals 2

    iget-object v1, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->g:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public run()V
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    sget v0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bС04210421042104210421:I

    sget v1, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕ0415ЕЕЕЕ:I

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bС04210421042104210421:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/MediaTaskManager;->b04150415ЕЕЕЕ:I

    rem-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕ04150415ЕЕЕ:I

    if-eq v0, v1, :cond_0

    const/16 v0, 0x5b

    sput v0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bС04210421042104210421:I

    const/16 v0, 0x1e

    sput v0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->bЕ04150415ЕЕЕ:I

    :cond_0
    sget-object v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PAUSED_DUE_TO_TIMEOUT:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    invoke-virtual {p0, v0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->transitToState(Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;)I

    return-void
.end method

.method public setHapticsUrl(Ljava/lang/String;Z)V
    .locals 2

    iget-object v1, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput-object p1, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->i:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->j:Z

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setMediaReferenceTime()V
    .locals 4

    iget-object v1, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->g:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    sget-object v2, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->h:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->waitHapticStopped()V

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->e:J

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setMediaTimestamp(J)V
    .locals 5

    iget-object v1, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->g:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    sget-object v2, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->h:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->waitHapticStopped()V

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->e:J

    iput-wide p1, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->d:J

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public transitToState(Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;)I
    .locals 6

    const/4 v1, 0x0

    const/4 v0, -0x1

    iget-object v2, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->b:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    sget-object v3, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->NOT_INITIALIZED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne p1, v3, :cond_0

    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->a()I

    move-result v0

    monitor-exit v2

    :goto_0
    return v0

    :cond_0
    sget-object v3, Lrrrrrr/crccrr;->b042504250425ХХ0425:[I

    iget-object v4, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->g:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    invoke-virtual {v4}, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->ordinal()I

    move-result v4

    aget v3, v3, v4

    packed-switch v3, :pswitch_data_0

    :cond_1
    :goto_1
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :pswitch_0
    :try_start_1
    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->INITIALIZED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne p1, v1, :cond_1

    invoke-direct {p0, p1}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->a(Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;)I

    move-result v0

    goto :goto_1

    :pswitch_1
    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PLAYING:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne p1, v1, :cond_4

    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->i()I

    move-result v0

    goto :goto_1

    :cond_2
    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED_DUE_TO_ERROR:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne p1, v1, :cond_1

    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->c()I

    move-result v0

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED_DUE_TO_ERROR:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    iput-object v1, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->g:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    goto :goto_1

    :cond_3
    sget-object v3, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PLAYING:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne p1, v3, :cond_e

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->h:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    iget-wide v4, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->d:J

    long-to-int v1, v4

    invoke-virtual {v0, v1}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->setRequestBufferPosition(I)V

    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->i()I

    move-result v0

    goto :goto_1

    :cond_4
    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne p1, v1, :cond_5

    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->c()I

    move-result v0

    goto :goto_1

    :cond_5
    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED_DUE_TO_ERROR:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne p1, v1, :cond_1

    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->c()I

    move-result v0

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED_DUE_TO_ERROR:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    iput-object v1, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->g:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    goto :goto_1

    :pswitch_2
    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PLAYING:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne p1, v1, :cond_6

    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->f()I

    move-result v0

    goto :goto_1

    :cond_6
    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PAUSED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne p1, v1, :cond_7

    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->e()I

    move-result v0

    goto :goto_1

    :cond_7
    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PAUSED_DUE_TO_TIMEOUT:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne p1, v1, :cond_9

    const-string v0, "MediaTaskManager"

    const-string v1, "Haptic playback is paused due to update time-out. Call update() to resume playback"

    invoke-static {v0, v1}, Lcom/immersion/hapticmediasdk/utils/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->g()I

    move-result v0

    goto :goto_1

    :pswitch_3
    sget-object v3, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PLAYING:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne p1, v3, :cond_8

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->h:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    iget-wide v4, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->d:J

    long-to-int v1, v4

    invoke-virtual {v0, v1}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->setRequestBufferPosition(I)V

    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->i()I

    move-result v0

    goto :goto_1

    :cond_8
    sget-object v3, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PAUSED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne p1, v3, :cond_b

    move v0, v1

    goto/16 :goto_1

    :cond_9
    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PAUSED_DUE_TO_BUFFERING:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne p1, v1, :cond_a

    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->h()I

    move-result v0

    const-string v1, "MediaTaskManager"

    const-string v3, "Haptic playback is paused due to slow data buffering..."

    invoke-static {v1, v3}, Lcom/immersion/hapticmediasdk/utils/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_a
    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne p1, v1, :cond_2

    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->c()I

    move-result v0

    goto/16 :goto_1

    :cond_b
    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne p1, v1, :cond_c

    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->c()I

    move-result v0

    goto/16 :goto_1

    :cond_c
    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED_DUE_TO_ERROR:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne p1, v1, :cond_1

    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->c()I

    move-result v0

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED_DUE_TO_ERROR:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    iput-object v1, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->g:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    goto/16 :goto_1

    :pswitch_4
    sget-object v3, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PAUSED_DUE_TO_TIMEOUT:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne p1, v3, :cond_3

    move v0, v1

    goto/16 :goto_1

    :cond_d
    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED_DUE_TO_ERROR:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne p1, v1, :cond_1

    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->c()I

    move-result v0

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED_DUE_TO_ERROR:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    iput-object v1, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->g:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    goto/16 :goto_1

    :pswitch_5
    sget-object v3, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PAUSED_DUE_TO_BUFFERING:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne p1, v3, :cond_11

    move v0, v1

    goto/16 :goto_1

    :cond_e
    sget-object v3, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PAUSED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne p1, v3, :cond_f

    sget-object v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PAUSED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->g:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    move v0, v1

    goto/16 :goto_1

    :cond_f
    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne p1, v1, :cond_d

    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->c()I

    move-result v0

    goto/16 :goto_1

    :cond_10
    sget-object v3, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PAUSED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne p1, v3, :cond_12

    sget-object v0, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PAUSED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->g:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    move v0, v1

    goto/16 :goto_1

    :pswitch_6
    sget-object v3, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PLAYING:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne p1, v3, :cond_14

    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->i()I

    move-result v0

    goto/16 :goto_1

    :cond_11
    sget-object v3, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PLAYING:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne p1, v3, :cond_10

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->h:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    iget-wide v4, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->d:J

    long-to-int v1, v4

    invoke-virtual {v0, v1}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->setRequestBufferPosition(I)V

    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->i()I

    move-result v0

    goto/16 :goto_1

    :cond_12
    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne p1, v1, :cond_13

    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->c()I

    move-result v0

    goto/16 :goto_1

    :cond_13
    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED_DUE_TO_ERROR:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne p1, v1, :cond_1

    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->c()I

    move-result v0

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED_DUE_TO_ERROR:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    iput-object v1, p0, Lcom/immersion/hapticmediasdk/MediaTaskManager;->g:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    goto/16 :goto_1

    :cond_14
    sget-object v3, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->STOPPED:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v3, :cond_1

    move v0, v1

    goto/16 :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method
