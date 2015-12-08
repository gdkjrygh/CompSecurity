.class final Lcom/google/android/gms/internal/hk;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ro;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/hs;

.field final synthetic b:Lcom/google/android/gms/internal/ha;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ha;Lcom/google/android/gms/internal/hs;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/hk;->b:Lcom/google/android/gms/internal/ha;

    iput-object p2, p0, Lcom/google/android/gms/internal/hk;->a:Lcom/google/android/gms/internal/hs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/hk;->b:Lcom/google/android/gms/internal/ha;

    invoke-static {v0}, Lcom/google/android/gms/internal/ha;->c(Lcom/google/android/gms/internal/ha;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/hk;->b:Lcom/google/android/gms/internal/ha;

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ha;->a(Lcom/google/android/gms/internal/ha;I)I

    const-string v0, "Failed loading new engine. Marking new engine destroyable."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->v(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/hk;->a:Lcom/google/android/gms/internal/hs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hs;->c()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
