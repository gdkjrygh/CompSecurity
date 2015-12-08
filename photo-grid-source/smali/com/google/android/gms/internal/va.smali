.class final Lcom/google/android/gms/internal/va;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/l;


# instance fields
.field public final a:I

.field public final b:Lcom/google/android/gms/common/api/h;

.field public final c:Lcom/google/android/gms/common/api/l;

.field final synthetic d:Lcom/google/android/gms/internal/uz;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/uz;ILcom/google/android/gms/common/api/h;Lcom/google/android/gms/common/api/l;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/va;->d:Lcom/google/android/gms/internal/uz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/android/gms/internal/va;->a:I

    iput-object p3, p0, Lcom/google/android/gms/internal/va;->b:Lcom/google/android/gms/common/api/h;

    iput-object p4, p0, Lcom/google/android/gms/internal/va;->c:Lcom/google/android/gms/common/api/l;

    invoke-virtual {p3, p0}, Lcom/google/android/gms/common/api/h;->a(Lcom/google/android/gms/common/api/l;)V

    return-void
.end method


# virtual methods
.method public final onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/va;->d:Lcom/google/android/gms/internal/uz;

    invoke-static {v0}, Lcom/google/android/gms/internal/uz;->e(Lcom/google/android/gms/internal/uz;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/vb;

    iget-object v2, p0, Lcom/google/android/gms/internal/va;->d:Lcom/google/android/gms/internal/uz;

    iget v3, p0, Lcom/google/android/gms/internal/va;->a:I

    invoke-direct {v1, v2, v3, p1}, Lcom/google/android/gms/internal/vb;-><init>(Lcom/google/android/gms/internal/uz;ILcom/google/android/gms/common/ConnectionResult;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
