.class Lcom/qihoo/security/clearengine/sdk/ApkScanService$1;
.super Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService$Stub;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/clearengine/sdk/ApkScanService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/clearengine/sdk/ApkScanService;

.field private final b:Ljava/lang/Object;

.field private c:I


# direct methods
.method constructor <init>(Lcom/qihoo/security/clearengine/sdk/ApkScanService;)V
    .locals 1

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo/security/clearengine/sdk/ApkScanService$1;->a:Lcom/qihoo/security/clearengine/sdk/ApkScanService;

    .line 62
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService$Stub;-><init>()V

    .line 64
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/sdk/ApkScanService$1;->b:Ljava/lang/Object;

    .line 66
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/clearengine/sdk/ApkScanService$1;->c:I

    return-void
.end method


# virtual methods
.method public create()I
    .locals 2

    .prologue
    .line 79
    iget-object v1, p0, Lcom/qihoo/security/clearengine/sdk/ApkScanService$1;->b:Ljava/lang/Object;

    monitor-enter v1

    .line 80
    :try_start_0
    iget v0, p0, Lcom/qihoo/security/clearengine/sdk/ApkScanService$1;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/qihoo/security/clearengine/sdk/ApkScanService$1;->c:I

    .line 79
    monitor-exit v1

    .line 85
    const/4 v0, 0x0

    return v0

    .line 79
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public destroy()I
    .locals 2

    .prologue
    .line 90
    iget-object v1, p0, Lcom/qihoo/security/clearengine/sdk/ApkScanService$1;->b:Ljava/lang/Object;

    monitor-enter v1

    .line 91
    :try_start_0
    iget v0, p0, Lcom/qihoo/security/clearengine/sdk/ApkScanService$1;->c:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/qihoo/security/clearengine/sdk/ApkScanService$1;->c:I

    .line 95
    iget v0, p0, Lcom/qihoo/security/clearengine/sdk/ApkScanService$1;->c:I

    if-nez v0, :cond_0

    .line 96
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/ApkScanService$1;->a:Lcom/qihoo/security/clearengine/sdk/ApkScanService;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/sdk/ApkScanService;->b(Lcom/qihoo/security/clearengine/sdk/ApkScanService;)V

    .line 90
    :cond_0
    monitor-exit v1

    .line 99
    const/4 v0, 0x0

    return v0

    .line 90
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public scanApk(Ljava/lang/String;)Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 70
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/ApkScanService$1;->a:Lcom/qihoo/security/clearengine/sdk/ApkScanService;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/sdk/ApkScanService;->a(Lcom/qihoo/security/clearengine/sdk/ApkScanService;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/qihoo/security/clearengine/sdk/ApkScanService;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;

    move-result-object v0

    .line 74
    return-object v0
.end method
