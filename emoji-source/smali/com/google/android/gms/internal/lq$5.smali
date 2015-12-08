.class Lcom/google/android/gms/internal/lq$5;
.super Lcom/google/android/gms/wallet/Wallet$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/lq;->notifyTransactionStatus(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic akG:Lcom/google/android/gms/internal/lq;

.field final synthetic akL:Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/lq;Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/lq$5;->akG:Lcom/google/android/gms/internal/lq;

    iput-object p2, p0, Lcom/google/android/gms/internal/lq$5;->akL:Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;

    invoke-direct {p0}, Lcom/google/android/gms/wallet/Wallet$b;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/Api$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/internal/lr;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/lq$5;->a(Lcom/google/android/gms/internal/lr;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/lr;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/lq$5;->akL:Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/lr;->a(Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;)V

    sget-object v0, Lcom/google/android/gms/common/api/Status;->En:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/lq$5;->b(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
