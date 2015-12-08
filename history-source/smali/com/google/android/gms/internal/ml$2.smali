.class Lcom/google/android/gms/internal/ml$2;
.super Lcom/google/android/gms/internal/lu$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ml;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/af;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Vl:Lcom/google/android/gms/internal/ml;

.field final synthetic Vm:Lcom/google/android/gms/fitness/request/af;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ml;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/af;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ml$2;->Vl:Lcom/google/android/gms/internal/ml;

    iput-object p3, p0, Lcom/google/android/gms/internal/ml$2;->Vm:Lcom/google/android/gms/fitness/request/af;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/lu$c;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

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

    check-cast p1, Lcom/google/android/gms/internal/lu;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ml$2;->a(Lcom/google/android/gms/internal/lu;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/lu;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/lu$b;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/lu$b;-><init>(Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/lu;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Lcom/google/android/gms/internal/lu;->jM()Lcom/google/android/gms/internal/lz;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ml$2;->Vm:Lcom/google/android/gms/fitness/request/af;

    invoke-interface {v2, v3, v0, v1}, Lcom/google/android/gms/internal/lz;->a(Lcom/google/android/gms/fitness/request/af;Lcom/google/android/gms/internal/md;Ljava/lang/String;)V

    return-void
.end method
