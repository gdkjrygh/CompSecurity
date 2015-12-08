.class Lcom/google/android/gms/drive/internal/u$1;
.super Lcom/google/android/gms/drive/internal/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/u;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/MetadataChangeSet;Lcom/google/android/gms/drive/Contents;IZLjava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/drive/internal/q",
        "<",
        "Lcom/google/android/gms/drive/DriveFolder$DriveFileResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic IM:Lcom/google/android/gms/drive/Contents;

.field final synthetic Jd:Lcom/google/android/gms/drive/MetadataChangeSet;

.field final synthetic Jf:I

.field final synthetic Jg:Z

.field final synthetic Jh:Ljava/lang/String;

.field final synthetic Ji:Lcom/google/android/gms/drive/internal/u;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/u;Lcom/google/android/gms/drive/Contents;Lcom/google/android/gms/drive/MetadataChangeSet;IZLjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/u$1;->Ji:Lcom/google/android/gms/drive/internal/u;

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/u$1;->IM:Lcom/google/android/gms/drive/Contents;

    iput-object p3, p0, Lcom/google/android/gms/drive/internal/u$1;->Jd:Lcom/google/android/gms/drive/MetadataChangeSet;

    iput p4, p0, Lcom/google/android/gms/drive/internal/u$1;->Jf:I

    iput-boolean p5, p0, Lcom/google/android/gms/drive/internal/u$1;->Jg:Z

    iput-object p6, p0, Lcom/google/android/gms/drive/internal/u$1;->Jh:Ljava/lang/String;

    invoke-direct {p0}, Lcom/google/android/gms/drive/internal/q;-><init>()V

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

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/u$1;->a(Lcom/google/android/gms/drive/internal/r;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/drive/internal/r;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/u$1;->IM:Lcom/google/android/gms/drive/Contents;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/u$1;->IM:Lcom/google/android/gms/drive/Contents;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->close()V

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/r;->gp()Lcom/google/android/gms/drive/internal/aa;

    move-result-object v7

    new-instance v0, Lcom/google/android/gms/drive/internal/CreateFileRequest;

    iget-object v1, p0, Lcom/google/android/gms/drive/internal/u$1;->Ji:Lcom/google/android/gms/drive/internal/u;

    invoke-virtual {v1}, Lcom/google/android/gms/drive/internal/u;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/u$1;->Jd:Lcom/google/android/gms/drive/MetadataChangeSet;

    invoke-virtual {v2}, Lcom/google/android/gms/drive/MetadataChangeSet;->gm()Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/drive/internal/u$1;->IM:Lcom/google/android/gms/drive/Contents;

    iget v4, p0, Lcom/google/android/gms/drive/internal/u$1;->Jf:I

    iget-boolean v5, p0, Lcom/google/android/gms/drive/internal/u$1;->Jg:Z

    iget-object v6, p0, Lcom/google/android/gms/drive/internal/u$1;->Jh:Ljava/lang/String;

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/drive/internal/CreateFileRequest;-><init>(Lcom/google/android/gms/drive/DriveId;Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;Lcom/google/android/gms/drive/Contents;IZLjava/lang/String;)V

    new-instance v1, Lcom/google/android/gms/drive/internal/u$a;

    invoke-direct {v1, p0}, Lcom/google/android/gms/drive/internal/u$a;-><init>(Lcom/google/android/gms/common/api/a$d;)V

    invoke-interface {v7, v0, v1}, Lcom/google/android/gms/drive/internal/aa;->a(Lcom/google/android/gms/drive/internal/CreateFileRequest;Lcom/google/android/gms/drive/internal/ab;)V

    return-void
.end method

.method public synthetic c(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/u$1;->s(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/drive/DriveFolder$DriveFileResult;

    move-result-object v0

    return-object v0
.end method

.method public s(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/drive/DriveFolder$DriveFileResult;
    .locals 2

    new-instance v0, Lcom/google/android/gms/drive/internal/u$d;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/drive/internal/u$d;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/DriveFile;)V

    return-object v0
.end method
