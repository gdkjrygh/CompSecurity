.class final Lcom/google/android/gms/internal/hj;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/rq;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/rq",
        "<",
        "Lcom/google/android/gms/internal/bg;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/hs;

.field final synthetic b:Lcom/google/android/gms/internal/ha;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ha;Lcom/google/android/gms/internal/hs;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/hj;->b:Lcom/google/android/gms/internal/ha;

    iput-object p2, p0, Lcom/google/android/gms/internal/hj;->a:Lcom/google/android/gms/internal/hs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 0
    .line 1000
    iget-object v0, p0, Lcom/google/android/gms/internal/hj;->b:Lcom/google/android/gms/internal/ha;

    invoke-static {v0}, Lcom/google/android/gms/internal/ha;->c(Lcom/google/android/gms/internal/ha;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/hj;->b:Lcom/google/android/gms/internal/ha;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ha;->a(Lcom/google/android/gms/internal/ha;I)I

    iget-object v0, p0, Lcom/google/android/gms/internal/hj;->b:Lcom/google/android/gms/internal/ha;

    invoke-static {v0}, Lcom/google/android/gms/internal/ha;->g(Lcom/google/android/gms/internal/ha;)Lcom/google/android/gms/internal/hs;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hj;->a:Lcom/google/android/gms/internal/hs;

    iget-object v2, p0, Lcom/google/android/gms/internal/hj;->b:Lcom/google/android/gms/internal/ha;

    invoke-static {v2}, Lcom/google/android/gms/internal/ha;->g(Lcom/google/android/gms/internal/ha;)Lcom/google/android/gms/internal/hs;

    move-result-object v2

    if-eq v0, v2, :cond_0

    const-string v0, "New JS engine is loaded, marking previous one as destroyable."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->v(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/hj;->b:Lcom/google/android/gms/internal/ha;

    invoke-static {v0}, Lcom/google/android/gms/internal/ha;->g(Lcom/google/android/gms/internal/ha;)Lcom/google/android/gms/internal/hs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hs;->c()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/hj;->b:Lcom/google/android/gms/internal/ha;

    iget-object v2, p0, Lcom/google/android/gms/internal/hj;->a:Lcom/google/android/gms/internal/hs;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ha;->a(Lcom/google/android/gms/internal/ha;Lcom/google/android/gms/internal/hs;)Lcom/google/android/gms/internal/hs;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
