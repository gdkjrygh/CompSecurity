.class public Lcom/google/android/gms/drive/CreateFileActivityBuilder;
.super Ljava/lang/Object;


# static fields
.field public static final EXTRA_RESPONSE_DRIVE_ID:Ljava/lang/String; = "response_drive_id"


# instance fields
.field private final Ol:Lcom/google/android/gms/drive/internal/i;

.field private Om:Lcom/google/android/gms/drive/DriveContents;

.field private On:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/drive/internal/i;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/drive/internal/i;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->Ol:Lcom/google/android/gms/drive/internal/i;

    return-void
.end method


# virtual methods
.method public build(Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/content/IntentSender;
    .locals 2
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->On:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "Must call setInitialDriveContents to CreateFileActivityBuilder."

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/jx;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/drive/Drive;->SCOPE_FILE:Lcom/google/android/gms/common/api/Scope;

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Scope;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/drive/Drive;->Oo:Lcom/google/android/gms/common/api/Scope;

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Scope;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    const/4 v0, 0x1

    :goto_0
    const-string v1, "The apiClient must have suitable scope to create files"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/jx;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->Om:Lcom/google/android/gms/drive/DriveContents;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->Om:Lcom/google/android/gms/drive/DriveContents;

    invoke-interface {v0}, Lcom/google/android/gms/drive/DriveContents;->getParcelFileDescriptor()Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/lh;->a(Landroid/os/ParcelFileDescriptor;)V

    iget-object v0, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->Om:Lcom/google/android/gms/drive/DriveContents;

    invoke-interface {v0}, Lcom/google/android/gms/drive/DriveContents;->is()V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->Ol:Lcom/google/android/gms/drive/internal/i;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/drive/internal/i;->build(Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/content/IntentSender;

    move-result-object v0

    return-object v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setActivityStartFolder(Lcom/google/android/gms/drive/DriveId;)Lcom/google/android/gms/drive/CreateFileActivityBuilder;
    .locals 1
    .param p1, "folder"    # Lcom/google/android/gms/drive/DriveId;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->Ol:Lcom/google/android/gms/drive/internal/i;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/drive/internal/i;->a(Lcom/google/android/gms/drive/DriveId;)V

    return-object p0
.end method

.method public setActivityTitle(Ljava/lang/String;)Lcom/google/android/gms/drive/CreateFileActivityBuilder;
    .locals 1
    .param p1, "title"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->Ol:Lcom/google/android/gms/drive/internal/i;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/drive/internal/i;->bl(Ljava/lang/String;)V

    return-object p0
.end method

.method public setInitialDriveContents(Lcom/google/android/gms/drive/DriveContents;)Lcom/google/android/gms/drive/CreateFileActivityBuilder;
    .locals 3
    .param p1, "driveContents"    # Lcom/google/android/gms/drive/DriveContents;

    .prologue
    const/4 v2, 0x1

    if-eqz p1, :cond_3

    instance-of v0, p1, Lcom/google/android/gms/drive/internal/s;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Only DriveContents obtained from the Drive API are accepted."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-interface {p1}, Lcom/google/android/gms/drive/DriveContents;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-interface {p1}, Lcom/google/android/gms/drive/DriveContents;->it()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "DriveContents are already closed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->Ol:Lcom/google/android/gms/drive/internal/i;

    invoke-interface {p1}, Lcom/google/android/gms/drive/DriveContents;->ir()Lcom/google/android/gms/drive/Contents;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/drive/Contents;->getRequestId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/drive/internal/i;->bq(I)V

    iput-object p1, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->Om:Lcom/google/android/gms/drive/DriveContents;

    :goto_0
    iput-boolean v2, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->On:Z

    return-object p0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->Ol:Lcom/google/android/gms/drive/internal/i;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/drive/internal/i;->bq(I)V

    goto :goto_0
.end method

.method public setInitialMetadata(Lcom/google/android/gms/drive/MetadataChangeSet;)Lcom/google/android/gms/drive/CreateFileActivityBuilder;
    .locals 1
    .param p1, "metadataChangeSet"    # Lcom/google/android/gms/drive/MetadataChangeSet;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->Ol:Lcom/google/android/gms/drive/internal/i;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/drive/internal/i;->a(Lcom/google/android/gms/drive/MetadataChangeSet;)V

    return-object p0
.end method
