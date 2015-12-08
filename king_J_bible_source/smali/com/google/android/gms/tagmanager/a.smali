.class Lcom/google/android/gms/tagmanager/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/tagmanager/a$a;
    }
.end annotation


# static fields
.field private static Wx:Lcom/google/android/gms/tagmanager/a;

.field private static sf:Ljava/lang/Object;


# instance fields
.field private volatile Ws:J

.field private volatile Wt:J

.field private volatile Wu:J

.field private final Wv:Lcom/google/android/gms/internal/gl;

.field private Ww:Lcom/google/android/gms/tagmanager/a$a;

.field private volatile mClosed:Z

.field private final mContext:Landroid/content/Context;

.field private final qY:Ljava/lang/Thread;

.field private volatile sh:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/tagmanager/a;->sf:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    invoke-static {}, Lcom/google/android/gms/internal/gn;->ft()Lcom/google/android/gms/internal/gl;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/gms/tagmanager/a;-><init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/a$a;Lcom/google/android/gms/internal/gl;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/a$a;Lcom/google/android/gms/internal/gl;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/32 v0, 0xdbba0

    iput-wide v0, p0, Lcom/google/android/gms/tagmanager/a;->Ws:J

    const-wide/16 v0, 0x7530

    iput-wide v0, p0, Lcom/google/android/gms/tagmanager/a;->Wt:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/tagmanager/a;->mClosed:Z

    new-instance v0, Lcom/google/android/gms/tagmanager/a$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/tagmanager/a$1;-><init>(Lcom/google/android/gms/tagmanager/a;)V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/a;->Ww:Lcom/google/android/gms/tagmanager/a$a;

    iput-object p3, p0, Lcom/google/android/gms/tagmanager/a;->Wv:Lcom/google/android/gms/internal/gl;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/a;->mContext:Landroid/content/Context;

    :goto_0
    if-eqz p2, :cond_0

    iput-object p2, p0, Lcom/google/android/gms/tagmanager/a;->Ww:Lcom/google/android/gms/tagmanager/a$a;

    :cond_0
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/google/android/gms/tagmanager/a$2;

    invoke-direct {v1, p0}, Lcom/google/android/gms/tagmanager/a$2;-><init>(Lcom/google/android/gms/tagmanager/a;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/a;->qY:Ljava/lang/Thread;

    return-void

    :cond_1
    iput-object p1, p0, Lcom/google/android/gms/tagmanager/a;->mContext:Landroid/content/Context;

    goto :goto_0
.end method

.method static E(Landroid/content/Context;)Lcom/google/android/gms/tagmanager/a;
    .locals 2

    sget-object v0, Lcom/google/android/gms/tagmanager/a;->Wx:Lcom/google/android/gms/tagmanager/a;

    if-nez v0, :cond_1

    sget-object v1, Lcom/google/android/gms/tagmanager/a;->sf:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/tagmanager/a;->Wx:Lcom/google/android/gms/tagmanager/a;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/tagmanager/a;

    invoke-direct {v0, p0}, Lcom/google/android/gms/tagmanager/a;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/google/android/gms/tagmanager/a;->Wx:Lcom/google/android/gms/tagmanager/a;

    sget-object v0, Lcom/google/android/gms/tagmanager/a;->Wx:Lcom/google/android/gms/tagmanager/a;

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/a;->start()V

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sget-object v0, Lcom/google/android/gms/tagmanager/a;->Wx:Lcom/google/android/gms/tagmanager/a;

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method static synthetic a(Lcom/google/android/gms/tagmanager/a;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/a;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/tagmanager/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/a;->jU()V

    return-void
.end method

.method private jU()V
    .locals 2

    const/16 v0, 0xa

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    :goto_0
    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/a;->mClosed:Z

    if-nez v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/a;->Ww:Lcom/google/android/gms/tagmanager/a$a;

    invoke-interface {v0}, Lcom/google/android/gms/tagmanager/a$a;->jW()Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/a;->sh:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    iget-wide v0, p0, Lcom/google/android/gms/tagmanager/a;->Ws:J

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "sleep interrupted in AdvertiserDataPoller thread; continuing"

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->x(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private jV()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/a;->Wv:Lcom/google/android/gms/internal/gl;

    invoke-interface {v0}, Lcom/google/android/gms/internal/gl;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/gms/tagmanager/a;->Wu:J

    sub-long/2addr v0, v2

    iget-wide v2, p0, Lcom/google/android/gms/tagmanager/a;->Wt:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/a;->interrupt()V

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/a;->Wv:Lcom/google/android/gms/internal/gl;

    invoke-interface {v0}, Lcom/google/android/gms/internal/gl;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/tagmanager/a;->Wu:J

    goto :goto_0
.end method


# virtual methods
.method interrupt()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/a;->qY:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method

.method public isLimitAdTrackingEnabled()Z
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/a;->jV()V

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/a;->sh:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/a;->sh:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->isLimitAdTrackingEnabled()Z

    move-result v0

    goto :goto_0
.end method

.method public jT()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/a;->jV()V

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/a;->sh:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/a;->sh:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method start()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/a;->qY:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method
