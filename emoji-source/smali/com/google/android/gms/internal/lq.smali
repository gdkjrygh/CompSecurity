.class public Lcom/google/android/gms/internal/lq;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/wallet/Payments;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public changeMaskedWallet(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1
    .param p1, "googleApiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "googleTransactionId"    # Ljava/lang/String;
    .param p3, "merchantTransactionId"    # Ljava/lang/String;
    .param p4, "requestCode"    # I

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/lq$4;

    invoke-direct {v0, p0, p2, p3, p4}, Lcom/google/android/gms/internal/lq$4;-><init>(Lcom/google/android/gms/internal/lq;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/a$b;)Lcom/google/android/gms/common/api/a$b;

    return-void
.end method

.method public checkForPreAuthorization(Lcom/google/android/gms/common/api/GoogleApiClient;I)V
    .locals 1
    .param p1, "googleApiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "requestCode"    # I

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/lq$1;

    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/lq$1;-><init>(Lcom/google/android/gms/internal/lq;I)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/a$b;)Lcom/google/android/gms/common/api/a$b;

    return-void
.end method

.method public loadFullWallet(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wallet/FullWalletRequest;I)V
    .locals 1
    .param p1, "googleApiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "request"    # Lcom/google/android/gms/wallet/FullWalletRequest;
    .param p3, "requestCode"    # I

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/lq$3;

    invoke-direct {v0, p0, p2, p3}, Lcom/google/android/gms/internal/lq$3;-><init>(Lcom/google/android/gms/internal/lq;Lcom/google/android/gms/wallet/FullWalletRequest;I)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/a$b;)Lcom/google/android/gms/common/api/a$b;

    return-void
.end method

.method public loadMaskedWallet(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wallet/MaskedWalletRequest;I)V
    .locals 1
    .param p1, "googleApiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "request"    # Lcom/google/android/gms/wallet/MaskedWalletRequest;
    .param p3, "requestCode"    # I

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/lq$2;

    invoke-direct {v0, p0, p2, p3}, Lcom/google/android/gms/internal/lq$2;-><init>(Lcom/google/android/gms/internal/lq;Lcom/google/android/gms/wallet/MaskedWalletRequest;I)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/a$b;)Lcom/google/android/gms/common/api/a$b;

    return-void
.end method

.method public notifyTransactionStatus(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;)V
    .locals 1
    .param p1, "googleApiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "request"    # Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/lq$5;

    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/lq$5;-><init>(Lcom/google/android/gms/internal/lq;Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/a$b;)Lcom/google/android/gms/common/api/a$b;

    return-void
.end method
