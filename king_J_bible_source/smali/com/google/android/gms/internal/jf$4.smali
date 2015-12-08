.class Lcom/google/android/gms/internal/jf$4;
.super Lcom/google/android/gms/wallet/Wallet$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/jf;->changeMaskedWallet(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Nx:I

.field final synthetic acV:Lcom/google/android/gms/internal/jf;

.field final synthetic acY:Ljava/lang/String;

.field final synthetic acZ:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/jf;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/jf$4;->acV:Lcom/google/android/gms/internal/jf;

    iput-object p2, p0, Lcom/google/android/gms/internal/jf$4;->acY:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/jf$4;->acZ:Ljava/lang/String;

    iput p4, p0, Lcom/google/android/gms/internal/jf$4;->Nx:I

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

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/jf$4;->a(Lcom/google/android/gms/internal/jg;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/jg;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/jf$4;->acY:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/jf$4;->acZ:Ljava/lang/String;

    iget v2, p0, Lcom/google/android/gms/internal/jf$4;->Nx:I

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/internal/jg;->d(Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v0, Lcom/google/android/gms/common/api/Status;->Bv:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/jf$4;->a(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
