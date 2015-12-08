.class public final Lcom/google/android/gms/common/internal/af;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field final synthetic a:Lcom/google/android/gms/common/internal/aa;

.field private final b:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/internal/aa;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/internal/af;->a:Lcom/google/android/gms/common/internal/aa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/android/gms/common/internal/af;->b:I

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 7

    .prologue
    .line 0
    const-string v0, "Expecting a valid IBinder"

    invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/bl;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/common/internal/af;->a:Lcom/google/android/gms/common/internal/aa;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/ba;->a(Landroid/os/IBinder;)Lcom/google/android/gms/common/internal/az;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/aa;->a(Lcom/google/android/gms/common/internal/aa;Lcom/google/android/gms/common/internal/az;)Lcom/google/android/gms/common/internal/az;

    iget-object v0, p0, Lcom/google/android/gms/common/internal/af;->a:Lcom/google/android/gms/common/internal/aa;

    iget v1, p0, Lcom/google/android/gms/common/internal/af;->b:I

    .line 1000
    iget-object v2, v0, Lcom/google/android/gms/common/internal/aa;->b:Landroid/os/Handler;

    iget-object v3, v0, Lcom/google/android/gms/common/internal/aa;->b:Landroid/os/Handler;

    const/4 v4, 0x6

    const/4 v5, -0x1

    new-instance v6, Lcom/google/android/gms/common/internal/ai;

    invoke-direct {v6, v0}, Lcom/google/android/gms/common/internal/ai;-><init>(Lcom/google/android/gms/common/internal/aa;)V

    invoke-virtual {v3, v4, v1, v5, v6}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 0
    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/common/internal/af;->a:Lcom/google/android/gms/common/internal/aa;

    iget-object v0, v0, Lcom/google/android/gms/common/internal/aa;->b:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/common/internal/af;->a:Lcom/google/android/gms/common/internal/aa;

    iget-object v1, v1, Lcom/google/android/gms/common/internal/aa;->b:Landroid/os/Handler;

    const/4 v2, 0x4

    iget v3, p0, Lcom/google/android/gms/common/internal/af;->b:I

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method
