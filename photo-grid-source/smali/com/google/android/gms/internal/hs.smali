.class public final Lcom/google/android/gms/internal/hs;
.super Lcom/google/android/gms/internal/rr;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/rr",
        "<",
        "Lcom/google/android/gms/internal/bg;",
        ">;"
    }
.end annotation


# instance fields
.field private final d:Ljava/lang/Object;

.field private e:Lcom/google/android/gms/internal/hm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/hm",
            "<",
            "Lcom/google/android/gms/internal/bg;",
            ">;"
        }
    .end annotation
.end field

.field private f:Z

.field private g:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/hm;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/hm",
            "<",
            "Lcom/google/android/gms/internal/bg;",
            ">;)V"
        }
    .end annotation

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/internal/rr;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/hs;->d:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/hs;->e:Lcom/google/android/gms/internal/hm;

    iput-boolean v1, p0, Lcom/google/android/gms/internal/hs;->f:Z

    iput v1, p0, Lcom/google/android/gms/internal/hs;->g:I

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/hs;)Lcom/google/android/gms/internal/hm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->e:Lcom/google/android/gms/internal/hm;

    return-object v0
.end method

.method private f()V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/hs;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget v0, p0, Lcom/google/android/gms/internal/hs;->g:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/bl;->a(Z)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/hs;->f:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/google/android/gms/internal/hs;->g:I

    if-nez v0, :cond_1

    const-string v0, "No reference is left (including root). Cleaning up engine."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->v(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/hv;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/hv;-><init>(Lcom/google/android/gms/internal/hs;)V

    new-instance v2, Lcom/google/android/gms/internal/rp;

    invoke-direct {v2}, Lcom/google/android/gms/internal/rp;-><init>()V

    invoke-virtual {p0, v0, v2}, Lcom/google/android/gms/internal/hs;->a(Lcom/google/android/gms/internal/rq;Lcom/google/android/gms/internal/ro;)V

    :goto_1
    monitor-exit v1

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const-string v0, "There are still references to the engine. Not destroying."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->v(Ljava/lang/String;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ho;
    .locals 4

    new-instance v1, Lcom/google/android/gms/internal/ho;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ho;-><init>(Lcom/google/android/gms/internal/hs;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/hs;->d:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/ht;

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ht;-><init>(Lcom/google/android/gms/internal/hs;Lcom/google/android/gms/internal/ho;)V

    new-instance v3, Lcom/google/android/gms/internal/hu;

    invoke-direct {v3, p0, v1}, Lcom/google/android/gms/internal/hu;-><init>(Lcom/google/android/gms/internal/hs;Lcom/google/android/gms/internal/ho;)V

    invoke-virtual {p0, v0, v3}, Lcom/google/android/gms/internal/hs;->a(Lcom/google/android/gms/internal/rq;Lcom/google/android/gms/internal/ro;)V

    iget v0, p0, Lcom/google/android/gms/internal/hs;->g:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/bl;->a(Z)V

    iget v0, p0, Lcom/google/android/gms/internal/hs;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/hs;->g:I

    monitor-exit v2

    return-object v1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected final b()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/hs;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget v0, p0, Lcom/google/android/gms/internal/hs;->g:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/bl;->a(Z)V

    const-string v0, "Releasing 1 reference for JS Engine"

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->v(Ljava/lang/String;)V

    iget v0, p0, Lcom/google/android/gms/internal/hs;->g:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/hs;->g:I

    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->f()V

    monitor-exit v1

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final c()V
    .locals 3

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/google/android/gms/internal/hs;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget v2, p0, Lcom/google/android/gms/internal/hs;->g:I

    if-ltz v2, :cond_0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/bl;->a(Z)V

    const-string v0, "Releasing root reference. JS Engine will be destroyed once other references are released."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->v(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/hs;->f:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->f()V

    monitor-exit v1

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
