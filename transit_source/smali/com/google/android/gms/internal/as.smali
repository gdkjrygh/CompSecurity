.class public final Lcom/google/android/gms/internal/as;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/at$a;


# instance fields
.field private final dZ:Lcom/google/android/gms/internal/aw;

.field private final eJ:Ljava/lang/Object;

.field private final em:Lcom/google/android/gms/internal/v;

.field private final fd:Ljava/lang/String;

.field private final fe:J

.field private final ff:Lcom/google/android/gms/internal/ao;

.field private final fg:Lcom/google/android/gms/internal/x;

.field private fh:Lcom/google/android/gms/internal/ax;

.field private fi:I

.field private final mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/aw;Lcom/google/android/gms/internal/ap;Lcom/google/android/gms/internal/ao;Lcom/google/android/gms/internal/v;Lcom/google/android/gms/internal/x;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/as;->eJ:Ljava/lang/Object;

    const/4 v0, -0x2

    iput v0, p0, Lcom/google/android/gms/internal/as;->fi:I

    iput-object p1, p0, Lcom/google/android/gms/internal/as;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/as;->fd:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/as;->dZ:Lcom/google/android/gms/internal/aw;

    iget-wide v0, p4, Lcom/google/android/gms/internal/ap;->eV:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-wide v0, p4, Lcom/google/android/gms/internal/ap;->eV:J

    :goto_0
    iput-wide v0, p0, Lcom/google/android/gms/internal/as;->fe:J

    iput-object p5, p0, Lcom/google/android/gms/internal/as;->ff:Lcom/google/android/gms/internal/ao;

    iput-object p6, p0, Lcom/google/android/gms/internal/as;->em:Lcom/google/android/gms/internal/v;

    iput-object p7, p0, Lcom/google/android/gms/internal/as;->fg:Lcom/google/android/gms/internal/x;

    return-void

    :cond_0
    const-wide/16 v0, 0x2710

    goto :goto_0
.end method

.method private P()Lcom/google/android/gms/internal/ax;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Instantiating mediation adapter: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/as;->fd:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->o(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/as;->dZ:Lcom/google/android/gms/internal/aw;

    iget-object v1, p0, Lcom/google/android/gms/internal/as;->fd:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/aw;->g(Ljava/lang/String;)Lcom/google/android/gms/internal/ax;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not instantiate mediation adapter: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/as;->fd:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/cn;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/as;Lcom/google/android/gms/internal/ax;)Lcom/google/android/gms/internal/ax;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/as;->fh:Lcom/google/android/gms/internal/ax;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/as;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/as;->eJ:Ljava/lang/Object;

    return-object v0
.end method

.method private a(JJJJ)V
    .locals 2

    :goto_0
    iget v0, p0, Lcom/google/android/gms/internal/as;->fi:I

    const/4 v1, -0x2

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    invoke-direct/range {p0 .. p8}, Lcom/google/android/gms/internal/as;->b(JJJJ)V

    goto :goto_0
.end method

.method private a(Lcom/google/android/gms/internal/ar;)V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/as;->fg:Lcom/google/android/gms/internal/x;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/x;->ex:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/as;->fh:Lcom/google/android/gms/internal/ax;

    iget-object v1, p0, Lcom/google/android/gms/internal/as;->mContext:Landroid/content/Context;

    invoke-static {v1}, Lcom/google/android/gms/dynamic/c;->g(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/b;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/as;->em:Lcom/google/android/gms/internal/v;

    iget-object v3, p0, Lcom/google/android/gms/internal/as;->ff:Lcom/google/android/gms/internal/ao;

    iget-object v3, v3, Lcom/google/android/gms/internal/ao;->eS:Ljava/lang/String;

    invoke-interface {v0, v1, v2, v3, p1}, Lcom/google/android/gms/internal/ax;->a(Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/internal/v;Ljava/lang/String;Lcom/google/android/gms/internal/ay;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/as;->fh:Lcom/google/android/gms/internal/ax;

    iget-object v1, p0, Lcom/google/android/gms/internal/as;->mContext:Landroid/content/Context;

    invoke-static {v1}, Lcom/google/android/gms/dynamic/c;->g(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/b;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/as;->fg:Lcom/google/android/gms/internal/x;

    iget-object v3, p0, Lcom/google/android/gms/internal/as;->em:Lcom/google/android/gms/internal/v;

    iget-object v4, p0, Lcom/google/android/gms/internal/as;->ff:Lcom/google/android/gms/internal/ao;

    iget-object v4, v4, Lcom/google/android/gms/internal/ao;->eS:Ljava/lang/String;

    move-object v5, p1

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/ax;->a(Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/internal/x;Lcom/google/android/gms/internal/v;Ljava/lang/String;Lcom/google/android/gms/internal/ay;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Could not request ad from mediation adapter."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/cn;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/as;->d(I)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/as;Lcom/google/android/gms/internal/ar;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/as;->a(Lcom/google/android/gms/internal/ar;)V

    return-void
.end method

.method static synthetic b(Lcom/google/android/gms/internal/as;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/as;->fi:I

    return v0
.end method

.method private b(JJJJ)V
    .locals 7

    const-wide/16 v5, 0x0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sub-long v2, v0, p1

    sub-long v2, p3, v2

    sub-long/2addr v0, p5

    sub-long v0, p7, v0

    cmp-long v4, v2, v5

    if-lez v4, :cond_0

    cmp-long v4, v0, v5

    if-gtz v4, :cond_1

    :cond_0
    const-string v0, "Timed out waiting for adapter."

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->o(Ljava/lang/String;)V

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/internal/as;->fi:I

    :goto_0
    return-void

    :cond_1
    :try_start_0
    iget-object v4, p0, Lcom/google/android/gms/internal/as;->eJ:Ljava/lang/Object;

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Ljava/lang/Object;->wait(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/as;->fi:I

    goto :goto_0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/as;)Lcom/google/android/gms/internal/ax;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/as;->P()Lcom/google/android/gms/internal/ax;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/as;)Lcom/google/android/gms/internal/ax;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/as;->fh:Lcom/google/android/gms/internal/ax;

    return-object v0
.end method


# virtual methods
.method public b(JJ)Lcom/google/android/gms/internal/at;
    .locals 11

    iget-object v9, p0, Lcom/google/android/gms/internal/as;->eJ:Ljava/lang/Object;

    monitor-enter v9

    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    new-instance v10, Lcom/google/android/gms/internal/ar;

    invoke-direct {v10}, Lcom/google/android/gms/internal/ar;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/cm;->hO:Landroid/os/Handler;

    new-instance v3, Lcom/google/android/gms/internal/as$1;

    invoke-direct {v3, p0, v10}, Lcom/google/android/gms/internal/as$1;-><init>(Lcom/google/android/gms/internal/as;Lcom/google/android/gms/internal/ar;)V

    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    iget-wide v3, p0, Lcom/google/android/gms/internal/as;->fe:J

    move-object v0, p0

    move-wide v5, p1

    move-wide v7, p3

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/as;->a(JJJJ)V

    new-instance v0, Lcom/google/android/gms/internal/at;

    iget-object v1, p0, Lcom/google/android/gms/internal/as;->ff:Lcom/google/android/gms/internal/ao;

    iget-object v2, p0, Lcom/google/android/gms/internal/as;->fh:Lcom/google/android/gms/internal/ax;

    iget-object v3, p0, Lcom/google/android/gms/internal/as;->fd:Ljava/lang/String;

    iget v5, p0, Lcom/google/android/gms/internal/as;->fi:I

    move-object v4, v10

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/at;-><init>(Lcom/google/android/gms/internal/ao;Lcom/google/android/gms/internal/ax;Ljava/lang/String;Lcom/google/android/gms/internal/ar;I)V

    monitor-exit v9

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public cancel()V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/as;->eJ:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/as;->fh:Lcom/google/android/gms/internal/ax;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/as;->fh:Lcom/google/android/gms/internal/ax;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ax;->destroy()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    const/4 v0, -0x1

    :try_start_1
    iput v0, p0, Lcom/google/android/gms/internal/as;->fi:I

    iget-object v0, p0, Lcom/google/android/gms/internal/as;->eJ:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    monitor-exit v1

    return-void

    :catch_0
    move-exception v0

    const-string v2, "Could not destroy mediation adapter."

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/cn;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public d(I)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/as;->eJ:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput p1, p0, Lcom/google/android/gms/internal/as;->fi:I

    iget-object v0, p0, Lcom/google/android/gms/internal/as;->eJ:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
