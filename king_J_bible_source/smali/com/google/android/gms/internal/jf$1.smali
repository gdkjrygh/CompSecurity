.class Lcom/google/android/gms/internal/jf$1;
.super Lcom/google/android/gms/wallet/Wallet$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/jf;->checkForPreAuthorization(Lcom/google/android/gms/common/api/GoogleApiClient;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Nx:I

.field final synthetic acV:Lcom/google/android/gms/internal/jf;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/jf;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/jf$1;->acV:Lcom/google/android/gms/internal/jf;

    iput p2, p0, Lcom/google/android/gms/internal/jf$1;->Nx:I

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

    check-cast p1, Lcom/google/android/gms/internal/jg;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/jf$1;->a(Lcom/google/android/gms/internal/jg;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/jg;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/jf$1;->Nx:I

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/jg;->cD(I)V

    sget-object v0, Lcom/google/android/gms/common/api/Status;->Bv:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/jf$1;->a(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
