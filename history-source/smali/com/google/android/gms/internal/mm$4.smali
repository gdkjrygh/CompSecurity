.class Lcom/google/android/gms/internal/mm$4;
.super Lcom/google/android/gms/internal/mm$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/mm;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/q;Lcom/google/android/gms/internal/mm$b;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/mm$a",
        "<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic Vp:Lcom/google/android/gms/internal/mm;

.field final synthetic Vs:Lcom/google/android/gms/internal/mm$b;

.field final synthetic Vt:Lcom/google/android/gms/fitness/request/q;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/mm;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/internal/mm$b;Lcom/google/android/gms/fitness/request/q;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mm$4;->Vp:Lcom/google/android/gms/internal/mm;

    iput-object p3, p0, Lcom/google/android/gms/internal/mm$4;->Vs:Lcom/google/android/gms/internal/mm$b;

    iput-object p4, p0, Lcom/google/android/gms/internal/mm$4;->Vt:Lcom/google/android/gms/fitness/request/q;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/mm$a;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

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

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/mm$4;->a(Lcom/google/android/gms/internal/lu;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/lu;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/mm$d;

    iget-object v1, p0, Lcom/google/android/gms/internal/mm$4;->Vs:Lcom/google/android/gms/internal/mm$b;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lcom/google/android/gms/internal/mm$d;-><init>(Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/internal/mm$b;Lcom/google/android/gms/internal/mm$1;)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/lu;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Lcom/google/android/gms/internal/lu;->jM()Lcom/google/android/gms/internal/lz;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/mm$4;->Vt:Lcom/google/android/gms/fitness/request/q;

    invoke-interface {v2, v3, v0, v1}, Lcom/google/android/gms/internal/lz;->a(Lcom/google/android/gms/fitness/request/q;Lcom/google/android/gms/internal/md;Ljava/lang/String;)V

    return-void
.end method

.method protected b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;
    .locals 0

    return-object p1
.end method

.method protected synthetic c(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/mm$4;->b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    return-object v0
.end method
