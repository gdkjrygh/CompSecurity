.class public Lrrrrrr/rcrrrr;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static b04150415Е0415Е0415:I = 0x1

.field public static b0415ЕЕ0415Е0415:I = 0x5c

.field public static bЕ0415Е0415Е0415:I = 0x0

.field public static bЕЕ04150415Е0415:I = 0x2


# instance fields
.field public final synthetic b0417З0417041704170417:Lcom/immersion/hapticmediasdk/controllers/MediaController;


# direct methods
.method public constructor <init>(Lcom/immersion/hapticmediasdk/controllers/MediaController;)V
    .locals 2

    sget v0, Lrrrrrr/rcrrrr;->b0415ЕЕ0415Е0415:I

    sget v1, Lrrrrrr/rcrrrr;->b04150415Е0415Е0415:I

    add-int/2addr v0, v1

    sget v1, Lrrrrrr/rcrrrr;->b0415ЕЕ0415Е0415:I

    mul-int/2addr v0, v1

    sget v1, Lrrrrrr/rcrrrr;->bЕЕ04150415Е0415:I

    rem-int/2addr v0, v1

    sget v1, Lrrrrrr/rcrrrr;->bЕ0415Е0415Е0415:I

    if-eq v0, v1, :cond_0

    const/16 v0, 0xf

    sput v0, Lrrrrrr/rcrrrr;->b0415ЕЕ0415Е0415:I

    const/4 v0, 0x7

    sput v0, Lrrrrrr/rcrrrr;->bЕ0415Е0415Е0415:I

    :cond_0
    :try_start_0
    iput-object p1, p0, Lrrrrrr/rcrrrr;->b0417З0417041704170417:Lcom/immersion/hapticmediasdk/controllers/MediaController;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V
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

.method public static b0415Е04150415Е0415()I
    .locals 1

    const/4 v0, 0x6

    return v0
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lrrrrrr/rcrrrr;->b0417З0417041704170417:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lrrrrrr/rcrrrr;->b0417З0417041704170417:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    invoke-static {v0}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bл043B043Bллл(Lcom/immersion/hapticmediasdk/controllers/MediaController;)Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lrrrrrr/rcrrrr;->b0417З0417041704170417:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    invoke-static {v0}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bл043B043Bллл(Lcom/immersion/hapticmediasdk/controllers/MediaController;)Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    move-result-object v0

    iget-object v1, p0, Lrrrrrr/rcrrrr;->b0417З0417041704170417:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    invoke-virtual {v1}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->getCurrentPosition()I

    move-result v1

    iget-object v2, p0, Lrrrrrr/rcrrrr;->b0417З0417041704170417:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    invoke-virtual {v2}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->getReferenceTimeForCurrentPosition()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->syncUpdate(IJ)V

    iget-object v0, p0, Lrrrrrr/rcrrrr;->b0417З0417041704170417:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    sget v1, Lrrrrrr/rcrrrr;->b0415ЕЕ0415Е0415:I

    sget v2, Lrrrrrr/rcrrrr;->b04150415Е0415Е0415:I

    add-int/2addr v2, v1

    mul-int/2addr v1, v2

    sget v2, Lrrrrrr/rcrrrr;->bЕЕ04150415Е0415:I

    rem-int/2addr v1, v2

    packed-switch v1, :pswitch_data_0

    invoke-static {}, Lrrrrrr/rcrrrr;->b0415Е04150415Е0415()I

    move-result v1

    sput v1, Lrrrrrr/rcrrrr;->b0415ЕЕ0415Е0415:I

    const/16 v1, 0x63

    sput v1, Lrrrrrr/rcrrrr;->bЕ0415Е0415Е0415:I

    :pswitch_0
    invoke-static {v0}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bл043B043Bллл(Lcom/immersion/hapticmediasdk/controllers/MediaController;)Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    move-result-object v0

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->getHandler()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lrrrrrr/rcrrrr;->b0417З0417041704170417:Lcom/immersion/hapticmediasdk/controllers/MediaController;

    invoke-static {v0}, Lcom/immersion/hapticmediasdk/controllers/MediaController;->bл043B043Bллл(Lcom/immersion/hapticmediasdk/controllers/MediaController;)Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    move-result-object v0

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
