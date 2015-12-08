.class public Lrrrrrr/ccrcrr;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static b044A044Aъъ044A044A:I = 0x2

.field public static b044Aъъъ044A044A:I = 0x2d

.field public static bъ044Aъъ044A044A:I = 0x1


# instance fields
.field private final a:[B

.field private final b:J

.field public final synthetic bХ0425ХХХ0425:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

.field private final c:J

.field private final d:I

.field private final e:J


# direct methods
.method public constructor <init>(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;JJ[BIJ)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lrrrrrr/ccrcrr;->bХ0425ХХХ0425:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p6, p0, Lrrrrrr/ccrcrr;->a:[B

    iput-wide p2, p0, Lrrrrrr/ccrcrr;->b:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget v0, Lrrrrrr/ccrcrr;->b044Aъъъ044A044A:I

    sget v1, Lrrrrrr/ccrcrr;->bъ044Aъъ044A044A:I

    add-int/2addr v1, v0

    mul-int/2addr v0, v1

    sget v1, Lrrrrrr/ccrcrr;->b044A044Aъъ044A044A:I

    rem-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0xf

    sput v0, Lrrrrrr/ccrcrr;->b044Aъъъ044A044A:I

    invoke-static {}, Lrrrrrr/ccrcrr;->bъъ044Aъ044A044A()I

    move-result v0

    sput v0, Lrrrrrr/ccrcrr;->bъ044Aъъ044A044A:I

    :pswitch_0
    :try_start_1
    iput-wide p4, p0, Lrrrrrr/ccrcrr;->c:J

    iput p7, p0, Lrrrrrr/ccrcrr;->d:I

    iput-wide p8, p0, Lrrrrrr/ccrcrr;->e:J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-void

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

.method public static bъъ044Aъ044A044A()I
    .locals 1

    const/16 v0, 0x20

    return v0
.end method


# virtual methods
.method public run()V
    .locals 8

    iget-object v0, p0, Lrrrrrr/ccrcrr;->bХ0425ХХХ0425:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-static {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->b04110411Б0411Б0411(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lrrrrrr/ccrcrr;->bХ0425ХХХ0425:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-static {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->bББ04110411Б0411(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lrrrrrr/ccrcrr;->bХ0425ХХХ0425:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-static {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->b0411Б04110411Б0411(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget-wide v0, p0, Lrrrrrr/ccrcrr;->b:J

    iget-wide v2, p0, Lrrrrrr/ccrcrr;->c:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    iget-object v0, p0, Lrrrrrr/ccrcrr;->bХ0425ХХХ0425:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-static {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->bБ041104110411Б0411(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/utils/RuntimeInfo;->areHapticsEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lrrrrrr/ccrcrr;->bХ0425ХХХ0425:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-static {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->b0411041104110411Б0411(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)Lcom/immersion/content/EndpointWarp;

    move-result-object v1

    iget-object v2, p0, Lrrrrrr/ccrcrr;->a:[B

    iget-object v0, p0, Lrrrrrr/ccrcrr;->a:[B

    array-length v3, v0

    iget-wide v4, p0, Lrrrrrr/ccrcrr;->e:J

    iget v0, p0, Lrrrrrr/ccrcrr;->d:I

    int-to-long v6, v0

    invoke-virtual/range {v1 .. v7}, Lcom/immersion/content/EndpointWarp;->update([BIJJ)V

    :cond_0
    iget-object v0, p0, Lrrrrrr/ccrcrr;->bХ0425ХХХ0425:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-static {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->bББББ04110411(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_1
    iget-object v0, p0, Lrrrrrr/ccrcrr;->bХ0425ХХХ0425:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    iget-object v2, p0, Lrrrrrr/ccrcrr;->bХ0425ХХХ0425:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-static {v2}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->bББ0411ББ0411(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)I

    move-result v2

    invoke-static {v0, v2}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->b0411БББ04110411(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;I)I

    iget-object v0, p0, Lrrrrrr/ccrcrr;->bХ0425ХХХ0425:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    iget-object v2, p0, Lrrrrrr/ccrcrr;->bХ0425ХХХ0425:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-static {v2}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->b04110411ББ04110411(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)I

    move-result v2

    invoke-static {v0, v2}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->bБ0411ББ04110411(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;I)I

    iget-object v0, p0, Lrrrrrr/ccrcrr;->bХ0425ХХХ0425:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->bББ0411Б04110411(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;J)J

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    iget-object v0, p0, Lrrrrrr/ccrcrr;->bХ0425ХХХ0425:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-static {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->bБ0411Б04110411Б(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lrrrrrr/ccrcrr;->bХ0425ХХХ0425:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-static {v1}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->b0411Б0411Б04110411(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_2
    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method
