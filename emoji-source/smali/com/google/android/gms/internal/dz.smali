.class public final Lcom/google/android/gms/internal/dz;
.super Ljava/lang/Object;


# instance fields
.field private lN:Lcom/google/android/gms/internal/ex;

.field private final ls:Ljava/lang/Object;

.field private pJ:I

.field private qB:Ljava/lang/String;

.field private qC:Lcom/google/android/gms/internal/eb;

.field public final qD:Lcom/google/android/gms/internal/bc;

.field public final qE:Lcom/google/android/gms/internal/bc;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/dz;->ls:Ljava/lang/Object;

    const/4 v0, -0x2

    iput v0, p0, Lcom/google/android/gms/internal/dz;->pJ:I

    new-instance v0, Lcom/google/android/gms/internal/dz$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/dz$1;-><init>(Lcom/google/android/gms/internal/dz;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/dz;->qD:Lcom/google/android/gms/internal/bc;

    new-instance v0, Lcom/google/android/gms/internal/dz$2;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/dz$2;-><init>(Lcom/google/android/gms/internal/dz;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/dz;->qE:Lcom/google/android/gms/internal/bc;

    iput-object p1, p0, Lcom/google/android/gms/internal/dz;->qB:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/dz;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/dz;->pJ:I

    return p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/dz;Lcom/google/android/gms/internal/eb;)Lcom/google/android/gms/internal/eb;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/dz;->qC:Lcom/google/android/gms/internal/eb;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/dz;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/dz;->ls:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/dz;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/dz;->qB:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public b(Lcom/google/android/gms/internal/ex;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/dz;->ls:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/dz;->lN:Lcom/google/android/gms/internal/ex;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public bx()Lcom/google/android/gms/internal/eb;
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/dz;->ls:Ljava/lang/Object;

    monitor-enter v1

    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/dz;->qC:Lcom/google/android/gms/internal/eb;

    if-nez v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/dz;->pJ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, -0x2

    if-ne v0, v2, :cond_0

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/dz;->ls:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    const-string v0, "Ad request service was interrupted."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->D(Ljava/lang/String;)V

    const/4 v0, 0x0

    monitor-exit v1

    :goto_1
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/dz;->qC:Lcom/google/android/gms/internal/eb;

    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public getErrorCode()I
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/dz;->ls:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget v0, p0, Lcom/google/android/gms/internal/dz;->pJ:I

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
