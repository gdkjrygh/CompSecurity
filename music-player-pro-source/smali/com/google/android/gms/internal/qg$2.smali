.class Lcom/google/android/gms/internal/qg$2;
.super Lcom/google/android/gms/wallet/Wallet$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/qg;->loadMaskedWallet(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wallet/MaskedWalletRequest;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic afG:I

.field final synthetic awA:Lcom/google/android/gms/internal/qg;

.field final synthetic awB:Lcom/google/android/gms/wallet/MaskedWalletRequest;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/qg;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wallet/MaskedWalletRequest;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/qg$2;->awA:Lcom/google/android/gms/internal/qg;

    iput-object p3, p0, Lcom/google/android/gms/internal/qg$2;->awB:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iput p4, p0, Lcom/google/android/gms/internal/qg$2;->afG:I

    invoke-direct {p0, p2}, Lcom/google/android/gms/wallet/Wallet$b;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

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

    check-cast p1, Lcom/google/android/gms/internal/qh;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/qg$2;->a(Lcom/google/android/gms/internal/qh;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/qh;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/qg$2;->awB:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iget v1, p0, Lcom/google/android/gms/internal/qg$2;->afG:I

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/qh;->a(Lcom/google/android/gms/wallet/MaskedWalletRequest;I)V

    sget-object v0, Lcom/google/android/gms/common/api/Status;->Kw:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/qg$2;->b(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
