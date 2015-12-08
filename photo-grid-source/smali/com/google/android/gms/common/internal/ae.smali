.class public final Lcom/google/android/gms/common/internal/ae;
.super Lcom/google/android/gms/common/internal/ax;


# instance fields
.field private a:Lcom/google/android/gms/common/internal/aa;

.field private final b:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/internal/aa;I)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/ax;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/internal/ae;->a:Lcom/google/android/gms/common/internal/aa;

    iput p2, p0, Lcom/google/android/gms/common/internal/ae;->b:I

    return-void
.end method


# virtual methods
.method public final a(ILandroid/os/Bundle;)V
    .locals 7

    .prologue
    .line 0
    iget-object v0, p0, Lcom/google/android/gms/common/internal/ae;->a:Lcom/google/android/gms/common/internal/aa;

    const-string v1, "onAccountValidationComplete can be called only once per call to validateAccount"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/bl;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/common/internal/ae;->a:Lcom/google/android/gms/common/internal/aa;

    iget v1, p0, Lcom/google/android/gms/common/internal/ae;->b:I

    .line 1000
    iget-object v2, v0, Lcom/google/android/gms/common/internal/aa;->b:Landroid/os/Handler;

    iget-object v3, v0, Lcom/google/android/gms/common/internal/aa;->b:Landroid/os/Handler;

    const/4 v4, 0x5

    const/4 v5, -0x1

    new-instance v6, Lcom/google/android/gms/common/internal/aj;

    invoke-direct {v6, v0, p1, p2}, Lcom/google/android/gms/common/internal/aj;-><init>(Lcom/google/android/gms/common/internal/aa;ILandroid/os/Bundle;)V

    invoke-virtual {v3, v4, v1, v5, v6}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 2000
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/common/internal/ae;->a:Lcom/google/android/gms/common/internal/aa;

    .line 0
    return-void
.end method

.method public final a(ILandroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 7

    .prologue
    .line 0
    iget-object v0, p0, Lcom/google/android/gms/common/internal/ae;->a:Lcom/google/android/gms/common/internal/aa;

    const-string v1, "onPostInitComplete can be called only once per call to getRemoteService"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/bl;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/common/internal/ae;->a:Lcom/google/android/gms/common/internal/aa;

    iget v1, p0, Lcom/google/android/gms/common/internal/ae;->b:I

    .line 3000
    iget-object v2, v0, Lcom/google/android/gms/common/internal/aa;->b:Landroid/os/Handler;

    iget-object v3, v0, Lcom/google/android/gms/common/internal/aa;->b:Landroid/os/Handler;

    const/4 v4, 0x1

    const/4 v5, -0x1

    new-instance v6, Lcom/google/android/gms/common/internal/ah;

    invoke-direct {v6, v0, p1, p2, p3}, Lcom/google/android/gms/common/internal/ah;-><init>(Lcom/google/android/gms/common/internal/aa;ILandroid/os/IBinder;Landroid/os/Bundle;)V

    invoke-virtual {v3, v4, v1, v5, v6}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 4000
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/common/internal/ae;->a:Lcom/google/android/gms/common/internal/aa;

    .line 0
    return-void
.end method
