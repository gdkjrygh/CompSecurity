.class final Lcom/google/android/gms/internal/uf;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/k;
.implements Lcom/google/android/gms/common/api/l;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/tu;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/tu;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/uf;->a:Lcom/google/android/gms/internal/tu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/tu;B)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/uf;-><init>(Lcom/google/android/gms/internal/tu;)V

    return-void
.end method


# virtual methods
.method public final onConnected(Landroid/os/Bundle;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/uf;->a:Lcom/google/android/gms/internal/tu;

    invoke-static {v0}, Lcom/google/android/gms/internal/tu;->e(Lcom/google/android/gms/internal/tu;)Lcom/google/android/gms/internal/xi;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ty;

    iget-object v2, p0, Lcom/google/android/gms/internal/uf;->a:Lcom/google/android/gms/internal/tu;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ty;-><init>(Lcom/google/android/gms/internal/tu;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/xi;->a(Lcom/google/android/gms/common/internal/bc;)V

    return-void
.end method

.method public final onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/uf;->a:Lcom/google/android/gms/internal/tu;

    invoke-static {v0}, Lcom/google/android/gms/internal/tu;->b(Lcom/google/android/gms/internal/tu;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/uf;->a:Lcom/google/android/gms/internal/tu;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/tu;->b(Lcom/google/android/gms/internal/tu;Lcom/google/android/gms/common/ConnectionResult;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/uf;->a:Lcom/google/android/gms/internal/tu;

    invoke-static {v0}, Lcom/google/android/gms/internal/tu;->h(Lcom/google/android/gms/internal/tu;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/uf;->a:Lcom/google/android/gms/internal/tu;

    invoke-static {v0}, Lcom/google/android/gms/internal/tu;->i(Lcom/google/android/gms/internal/tu;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/uf;->a:Lcom/google/android/gms/internal/tu;

    invoke-static {v0}, Lcom/google/android/gms/internal/tu;->b(Lcom/google/android/gms/internal/tu;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/uf;->a:Lcom/google/android/gms/internal/tu;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/tu;->a(Lcom/google/android/gms/internal/tu;Lcom/google/android/gms/common/ConnectionResult;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/uf;->a:Lcom/google/android/gms/internal/tu;

    invoke-static {v1}, Lcom/google/android/gms/internal/tu;->b(Lcom/google/android/gms/internal/tu;)Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public final onConnectionSuspended(I)V
    .locals 0

    return-void
.end method
