.class Lcom/google/android/gms/internal/ia$4;
.super Lcom/google/android/gms/internal/ia$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ia;->remove(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic UB:Ljava/lang/String;

.field final synthetic Uv:Lcom/google/android/gms/internal/ia;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ia;Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/ia$4;->Uv:Lcom/google/android/gms/internal/ia;

    iput-object p2, p0, Lcom/google/android/gms/internal/ia$4;->UB:Ljava/lang/String;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ia$b;-><init>(Lcom/google/android/gms/internal/ia$1;)V

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

    check-cast p1, Lcom/google/android/gms/plus/internal/e;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ia$4;->a(Lcom/google/android/gms/plus/internal/e;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/plus/internal/e;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ia$4;->UB:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/plus/internal/e;->removeMoment(Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/common/api/Status;->Bv:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ia$4;->a(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
