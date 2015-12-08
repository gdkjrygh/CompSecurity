.class final Lcom/google/android/gms/internal/un;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/l;


# instance fields
.field final synthetic a:Lcom/google/android/gms/common/api/a;

.field final synthetic b:I

.field final synthetic c:Lcom/google/android/gms/internal/uj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/uj;Lcom/google/android/gms/common/api/a;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/un;->c:Lcom/google/android/gms/internal/uj;

    iput-object p2, p0, Lcom/google/android/gms/internal/un;->a:Lcom/google/android/gms/common/api/a;

    iput p3, p0, Lcom/google/android/gms/internal/un;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/un;->c:Lcom/google/android/gms/internal/uj;

    invoke-static {v0}, Lcom/google/android/gms/internal/uj;->b(Lcom/google/android/gms/internal/uj;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/un;->c:Lcom/google/android/gms/internal/uj;

    invoke-static {v0}, Lcom/google/android/gms/internal/uj;->c(Lcom/google/android/gms/internal/uj;)Lcom/google/android/gms/internal/uu;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/un;->a:Lcom/google/android/gms/common/api/a;

    iget v2, p0, Lcom/google/android/gms/internal/un;->b:I

    invoke-interface {v0, p1, v1, v2}, Lcom/google/android/gms/internal/uu;->a(Lcom/google/android/gms/common/ConnectionResult;Lcom/google/android/gms/common/api/a;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/internal/un;->c:Lcom/google/android/gms/internal/uj;

    invoke-static {v0}, Lcom/google/android/gms/internal/uj;->b(Lcom/google/android/gms/internal/uj;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/un;->c:Lcom/google/android/gms/internal/uj;

    invoke-static {v1}, Lcom/google/android/gms/internal/uj;->b(Lcom/google/android/gms/internal/uj;)Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method
