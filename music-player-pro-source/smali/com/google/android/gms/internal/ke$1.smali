.class Lcom/google/android/gms/internal/ke$1;
.super Lcom/google/android/gms/internal/kf$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ke;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Nv:Lcom/google/android/gms/internal/ke;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ke;Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ke$1;->Nv:Lcom/google/android/gms/internal/ke;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/kf$a;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

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

    check-cast p1, Lcom/google/android/gms/internal/kg;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ke$1;->a(Lcom/google/android/gms/internal/kg;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/kg;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->hw()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ki;

    new-instance v1, Lcom/google/android/gms/internal/ke$a;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ke$a;-><init>(Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ki;->a(Lcom/google/android/gms/internal/kh;)V

    return-void
.end method
