.class Lcom/google/android/gms/internal/qg$4;
.super Lcom/google/android/gms/wallet/Wallet$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/qg;->changeMaskedWallet(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic afG:I

.field final synthetic awA:Lcom/google/android/gms/internal/qg;

.field final synthetic awD:Ljava/lang/String;

.field final synthetic awE:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/qg;Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/qg$4;->awA:Lcom/google/android/gms/internal/qg;

    iput-object p3, p0, Lcom/google/android/gms/internal/qg$4;->awD:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/qg$4;->awE:Ljava/lang/String;

    iput p5, p0, Lcom/google/android/gms/internal/qg$4;->afG:I

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

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/qg$4;->a(Lcom/google/android/gms/internal/qh;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/qh;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/qg$4;->awD:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/qg$4;->awE:Ljava/lang/String;

    iget v2, p0, Lcom/google/android/gms/internal/qg$4;->afG:I

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/internal/qh;->d(Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v0, Lcom/google/android/gms/common/api/Status;->Kw:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/qg$4;->b(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
