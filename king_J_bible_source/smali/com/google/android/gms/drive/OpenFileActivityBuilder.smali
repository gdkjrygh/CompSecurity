.class public Lcom/google/android/gms/drive/OpenFileActivityBuilder;
.super Ljava/lang/Object;


# static fields
.field public static final EXTRA_RESPONSE_DRIVE_ID:Ljava/lang/String; = "response_drive_id"


# instance fields
.field private EB:Ljava/lang/String;

.field private EC:Lcom/google/android/gms/drive/DriveId;

.field private EQ:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build(Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/content/IntentSender;
    .locals 5
    .param p1, "apiClient"    # Lcom/google/android/gms/common/api/GoogleApiClient;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/drive/OpenFileActivityBuilder;->EQ:[Ljava/lang/String;

    const-string v1, "setMimeType(String[]) must be called on this builder before calling build()"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/fq;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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

    :try_start_0
    new-instance v1, Lcom/google/android/gms/drive/internal/OpenFileIntentSenderRequest;

    iget-object v2, p0, Lcom/google/android/gms/drive/OpenFileActivityBuilder;->EB:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/drive/OpenFileActivityBuilder;->EQ:[Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/drive/OpenFileActivityBuilder;->EC:Lcom/google/android/gms/drive/DriveId;

    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/gms/drive/internal/OpenFileIntentSenderRequest;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/google/android/gms/drive/DriveId;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/drive/internal/u;->a(Lcom/google/android/gms/drive/internal/OpenFileIntentSenderRequest;)Landroid/content/IntentSender;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unable to connect Drive Play Service"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public setActivityStartFolder(Lcom/google/android/gms/drive/DriveId;)Lcom/google/android/gms/drive/OpenFileActivityBuilder;
    .locals 1
    .param p1, "folder"    # Lcom/google/android/gms/drive/DriveId;

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/internal/fq;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/DriveId;

    iput-object v0, p0, Lcom/google/android/gms/drive/OpenFileActivityBuilder;->EC:Lcom/google/android/gms/drive/DriveId;

    return-object p0
.end method

.method public setActivityTitle(Ljava/lang/String;)Lcom/google/android/gms/drive/OpenFileActivityBuilder;
    .locals 1
    .param p1, "title"    # Ljava/lang/String;

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/internal/fq;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/drive/OpenFileActivityBuilder;->EB:Ljava/lang/String;

    return-object p0
.end method

.method public setMimeType([Ljava/lang/String;)Lcom/google/android/gms/drive/OpenFileActivityBuilder;
    .locals 2
    .param p1, "mimeTypes"    # [Ljava/lang/String;

    .prologue
    if-eqz p1, :cond_0

    array-length v0, p1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "mimeTypes may not be null and must contain at least one value"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/fq;->b(ZLjava/lang/Object;)V

    iput-object p1, p0, Lcom/google/android/gms/drive/OpenFileActivityBuilder;->EQ:[Ljava/lang/String;

    return-object p0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
