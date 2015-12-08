.class public Lcom/google/android/gms/drive/CreateFileActivityBuilder;
.super Ljava/lang/Object;


# static fields
.field public static final EXTRA_RESPONSE_DRIVE_ID:Ljava/lang/String; = "response_drive_id"


# instance fields
.field private EA:Lcom/google/android/gms/drive/Contents;

.field private EB:Ljava/lang/String;

.field private EC:Lcom/google/android/gms/drive/DriveId;

.field private Ez:Lcom/google/android/gms/drive/MetadataChangeSet;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build(Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/content/IntentSender;
    .locals 6
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->Ez:Lcom/google/android/gms/drive/MetadataChangeSet;

    const-string v1, "Must provide initial metadata to CreateFileActivityBuilder."

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/fq;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->EA:Lcom/google/android/gms/drive/Contents;

    const-string v1, "Must provide initial contents to CreateFileActivityBuilder."

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/fq;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->EA:Lcom/google/android/gms/drive/Contents;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->getParcelFileDescriptor()Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->EA:Lcom/google/android/gms/drive/Contents;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->close()V

    invoke-interface {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    const-string v1, "Client must be connected"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/fq;->a(ZLjava/lang/Object;)V

    sget-object v0, Lcom/google/android/gms/drive/Drive;->wx:Lcom/google/android/gms/common/api/Api$c;

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/internal/n;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/internal/n;->fE()Lcom/google/android/gms/drive/internal/u;

    move-result-object v0

    :try_start_1
    new-instance v1, Lcom/google/android/gms/drive/internal/CreateFileIntentSenderRequest;

    iget-object v2, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->Ez:Lcom/google/android/gms/drive/MetadataChangeSet;

    invoke-virtual {v2}, Lcom/google/android/gms/drive/MetadataChangeSet;->fD()Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->EA:Lcom/google/android/gms/drive/Contents;

    invoke-virtual {v3}, Lcom/google/android/gms/drive/Contents;->fA()I

    move-result v3

    iget-object v4, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->EB:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->EC:Lcom/google/android/gms/drive/DriveId;

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/drive/internal/CreateFileIntentSenderRequest;-><init>(Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;ILjava/lang/String;Lcom/google/android/gms/drive/DriveId;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/drive/internal/u;->a(Lcom/google/android/gms/drive/internal/CreateFileIntentSenderRequest;)Landroid/content/IntentSender;
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unable to connect Drive Play Service"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method public setActivityStartFolder(Lcom/google/android/gms/drive/DriveId;)Lcom/google/android/gms/drive/CreateFileActivityBuilder;
    .locals 1
    .param p1, "folder"    # Lcom/google/android/gms/drive/DriveId;

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/internal/fq;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/DriveId;

    iput-object v0, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->EC:Lcom/google/android/gms/drive/DriveId;

    return-object p0
.end method

.method public setActivityTitle(Ljava/lang/String;)Lcom/google/android/gms/drive/CreateFileActivityBuilder;
    .locals 1
    .param p1, "title"    # Ljava/lang/String;

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/internal/fq;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->EB:Ljava/lang/String;

    return-object p0
.end method

.method public setInitialContents(Lcom/google/android/gms/drive/Contents;)Lcom/google/android/gms/drive/CreateFileActivityBuilder;
    .locals 0
    .param p1, "contents"    # Lcom/google/android/gms/drive/Contents;

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/internal/fq;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .end local p1    # "contents":Lcom/google/android/gms/drive/Contents;
    check-cast p1, Lcom/google/android/gms/drive/Contents;

    .restart local p1    # "contents":Lcom/google/android/gms/drive/Contents;
    iput-object p1, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->EA:Lcom/google/android/gms/drive/Contents;

    return-object p0
.end method

.method public setInitialMetadata(Lcom/google/android/gms/drive/MetadataChangeSet;)Lcom/google/android/gms/drive/CreateFileActivityBuilder;
    .locals 1
    .param p1, "metadataChangeSet"    # Lcom/google/android/gms/drive/MetadataChangeSet;

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/internal/fq;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/MetadataChangeSet;

    iput-object v0, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->Ez:Lcom/google/android/gms/drive/MetadataChangeSet;

    return-object p0
.end method
