.class Lcom/google/android/gms/drive/internal/x$2;
.super Lcom/google/android/gms/drive/internal/q$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/x;->setFileUploadPreferences(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/FileUploadPreferences;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Qq:Lcom/google/android/gms/drive/internal/x;

.field final synthetic Qr:Lcom/google/android/gms/drive/internal/FileUploadPreferencesImpl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/x;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/internal/FileUploadPreferencesImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/x$2;->Qq:Lcom/google/android/gms/drive/internal/x;

    iput-object p3, p0, Lcom/google/android/gms/drive/internal/x$2;->Qr:Lcom/google/android/gms/drive/internal/FileUploadPreferencesImpl;

    invoke-direct {p0, p2}, Lcom/google/android/gms/drive/internal/q$a;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

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

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/x$2;->a(Lcom/google/android/gms/drive/internal/r;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/drive/internal/r;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/r;->iG()Lcom/google/android/gms/drive/internal/ae;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/drive/internal/SetFileUploadPreferencesRequest;

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/x$2;->Qr:Lcom/google/android/gms/drive/internal/FileUploadPreferencesImpl;

    invoke-direct {v1, v2}, Lcom/google/android/gms/drive/internal/SetFileUploadPreferencesRequest;-><init>(Lcom/google/android/gms/drive/internal/FileUploadPreferencesImpl;)V

    new-instance v2, Lcom/google/android/gms/drive/internal/bg;

    invoke-direct {v2, p0}, Lcom/google/android/gms/drive/internal/bg;-><init>(Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/drive/internal/ae;->a(Lcom/google/android/gms/drive/internal/SetFileUploadPreferencesRequest;Lcom/google/android/gms/drive/internal/af;)V

    return-void
.end method
