.class Lcom/google/android/gms/drive/internal/x$1;
.super Lcom/google/android/gms/drive/internal/x$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/x;->getFileUploadPreferences(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Qq:Lcom/google/android/gms/drive/internal/x;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/x;Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/x$1;->Qq:Lcom/google/android/gms/drive/internal/x;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/drive/internal/x$c;-><init>(Lcom/google/android/gms/drive/internal/x;Lcom/google/android/gms/common/api/GoogleApiClient;)V

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

    check-cast p1, Lcom/google/android/gms/drive/internal/r;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/x$1;->a(Lcom/google/android/gms/drive/internal/r;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/drive/internal/r;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/r;->iG()Lcom/google/android/gms/drive/internal/ae;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/drive/internal/x$a;

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/x$1;->Qq:Lcom/google/android/gms/drive/internal/x;

    const/4 v3, 0x0

    invoke-direct {v1, v2, p0, v3}, Lcom/google/android/gms/drive/internal/x$a;-><init>(Lcom/google/android/gms/drive/internal/x;Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/drive/internal/x$1;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/drive/internal/ae;->h(Lcom/google/android/gms/drive/internal/af;)V

    return-void
.end method
