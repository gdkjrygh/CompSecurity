.class public final Lcom/google/android/gms/internal/cb;
.super Ljava/lang/Object;


# instance fields
.field private final eJ:Ljava/lang/Object;

.field private fG:Lcom/google/android/gms/internal/cq;

.field private gT:Ljava/lang/String;

.field public final gU:Lcom/google/android/gms/internal/ai;

.field public final gV:Lcom/google/android/gms/internal/ai;

.field private gw:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/cb;->eJ:Ljava/lang/Object;

    const/4 v0, -0x2

    iput v0, p0, Lcom/google/android/gms/internal/cb;->gw:I

    new-instance v0, Lcom/google/android/gms/internal/cb$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/cb$1;-><init>(Lcom/google/android/gms/internal/cb;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/cb;->gU:Lcom/google/android/gms/internal/ai;

    new-instance v0, Lcom/google/android/gms/internal/cb$2;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/cb$2;-><init>(Lcom/google/android/gms/internal/cb;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/cb;->gV:Lcom/google/android/gms/internal/ai;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/cb;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/cb;->gw:I

    return p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/cb;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/cb;->eJ:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/cb;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/cb;->gT:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public aj()Ljava/lang/String;
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/cb;->eJ:Ljava/lang/Object;

    monitor-enter v1

    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/cb;->gT:Ljava/lang/String;

    if-nez v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/cb;->gw:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, -0x2

    if-ne v0, v2, :cond_0

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/cb;->eJ:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    const-string v0, "Ad request service was interrupted."

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    monitor-exit v1

    :goto_1
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/cb;->gT:Ljava/lang/String;

    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public b(Lcom/google/android/gms/internal/cq;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/cb;->eJ:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/cb;->fG:Lcom/google/android/gms/internal/cq;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getErrorCode()I
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/cb;->eJ:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget v0, p0, Lcom/google/android/gms/internal/cb;->gw:I

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
