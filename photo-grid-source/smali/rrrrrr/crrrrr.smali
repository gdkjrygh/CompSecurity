.class public Lrrrrrr/crrrrr;
.super Landroid/os/Handler;


# static fields
.field public static b04210421СС04210421:I = 0x0

.field public static b0421С0421С04210421:I = 0x2

.field public static bС0421СС04210421:I = 0x1

.field public static bСС0421С04210421:I = 0x1


# instance fields
.field public final synthetic b0417З0417З0417З:Lcom/immersion/hapticmediasdk/controllers/MediaController;


# direct methods
.method public constructor <init>(Lcom/immersion/hapticmediasdk/controllers/MediaController;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lrrrrrr/crrrrr;->b0417З0417З0417З:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method

.method public static bС04210421С04210421()I
    .locals 1

    const/16 v0, 0x23

    return v0
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    :try_start_0
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lrrrrrr/crrrrr;->b0417З0417З0417З:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    invoke-static {v0}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bБ04110411041104110411(Lcom/immersion/hapticmediasdk/controllers/MediaController;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    iget v1, p1, Landroid/os/Message;->arg1:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lrrrrrr/crrrrr;->b0417З0417З0417З:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    invoke-static {v0}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b043Bллллл(Lcom/immersion/hapticmediasdk/controllers/MediaController;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    iget v1, p1, Landroid/os/Message;->arg2:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-ne v0, v1, :cond_0

    :try_start_1
    iget-object v0, p0, Lrrrrrr/crrrrr;->b0417З0417З0417З:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    invoke-static {v0}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bл043Bлллл(Lcom/immersion/hapticmediasdk/controllers/MediaController;)Lcom/immersion/hapticmediasdk/MediaTaskManager;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    sget v1, Lrrrrrr/crrrrr;->bС0421СС04210421:I

    sget v2, Lrrrrrr/crrrrr;->bСС0421С04210421:I

    add-int/2addr v2, v1

    mul-int/2addr v1, v2

    sget v2, Lrrrrrr/crrrrr;->b0421С0421С04210421:I

    rem-int/2addr v1, v2

    packed-switch v1, :pswitch_data_1

    const/16 v1, 0x37

    sput v1, Lrrrrrr/crrrrr;->bС0421СС04210421:I

    invoke-static {}, Lrrrrrr/crrrrr;->bС04210421С04210421()I

    move-result v1

    sput v1, Lrrrrrr/crrrrr;->b04210421СС04210421:I

    :pswitch_1
    :try_start_2
    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->getSDKStatus()Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    move-result-object v0

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PAUSED_DUE_TO_BUFFERING:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lrrrrrr/crrrrr;->b0417З0417З0417З:Lcom/immersion/hapticmediasdk/controllers/MediaController;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :try_start_3
    invoke-static {v0}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bл043Bлллл(Lcom/immersion/hapticmediasdk/controllers/MediaController;)Lcom/immersion/hapticmediasdk/MediaTaskManager;

    move-result-object v0

    sget-object v1, Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;->PLAYING:Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;

    invoke-virtual {v0, v1}, Lcom/immersion/hapticmediasdk/MediaTaskManager;->transitToState(Lcom/immersion/hapticmediasdk/HapticContentSDK$SDKStatus;)I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    throw v0

    :cond_1
    :try_start_4
    iget-object v0, p0, Lrrrrrr/crrrrr;->b0417З0417З0417З:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    iget-object v1, p0, Lrrrrrr/crrrrr;->b0417З0417З0417З:Lcom/immersion/hapticmediasdk/controllers/MediaController;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :try_start_5
    invoke-static {v1}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bБ04110411041104110411(Lcom/immersion/hapticmediasdk/controllers/MediaController;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b043B043Bлллл(Lcom/immersion/hapticmediasdk/controllers/MediaController;IJ)V

    iget-object v0, p0, Lrrrrrr/crrrrr;->b0417З0417З0417З:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->playbackStarted()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    throw v0

    :pswitch_2
    :try_start_6
    iget-object v0, p0, Lrrrrrr/crrrrr;->b0417З0417З0417З:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, v1}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bлл043Bллл(Lcom/immersion/hapticmediasdk/controllers/MediaController;I)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_0

    :pswitch_3
    :try_start_7
    iget-object v0, p0, Lrrrrrr/crrrrr;->b0417З0417З0417З:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    invoke-static {v0, p1}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->b043Bл043Bллл(Lcom/immersion/hapticmediasdk/controllers/MediaController;Landroid/os/Message;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
        :pswitch_2
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method
