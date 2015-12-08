.class Lcom/google/android/gms/drive/internal/s$1;
.super Lcom/google/android/gms/drive/internal/s$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/s;->openContents(Lcom/google/android/gms/common/api/GoogleApiClient;ILcom/google/android/gms/drive/DriveFile$DownloadProgressListener;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Ja:I

.field final synthetic Jb:Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;

.field final synthetic Jc:Lcom/google/android/gms/drive/internal/s;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/s;ILcom/google/android/gms/drive/DriveFile$DownloadProgressListener;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/s$1;->Jc:Lcom/google/android/gms/drive/internal/s;

    iput p2, p0, Lcom/google/android/gms/drive/internal/s$1;->Ja:I

    iput-object p3, p0, Lcom/google/android/gms/drive/internal/s$1;->Jb:Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/drive/internal/s$d;-><init>(Lcom/google/android/gms/drive/internal/s;Lcom/google/android/gms/drive/internal/s$1;)V

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

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/s$1;->a(Lcom/google/android/gms/drive/internal/r;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/drive/internal/r;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/r;->gp()Lcom/google/android/gms/drive/internal/aa;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/drive/internal/OpenContentsRequest;

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/s$1;->Jc:Lcom/google/android/gms/drive/internal/s;

    invoke-virtual {v2}, Lcom/google/android/gms/drive/internal/s;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    move-result-object v2

    iget v3, p0, Lcom/google/android/gms/drive/internal/s$1;->Ja:I

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/drive/internal/OpenContentsRequest;-><init>(Lcom/google/android/gms/drive/DriveId;I)V

    new-instance v2, Lcom/google/android/gms/drive/internal/s$c;

    iget-object v3, p0, Lcom/google/android/gms/drive/internal/s$1;->Jb:Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;

    invoke-direct {v2, p0, v3}, Lcom/google/android/gms/drive/internal/s$c;-><init>(Lcom/google/android/gms/common/api/a$d;Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;)V

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/drive/internal/aa;->a(Lcom/google/android/gms/drive/internal/OpenContentsRequest;Lcom/google/android/gms/drive/internal/ab;)V

    return-void
.end method
