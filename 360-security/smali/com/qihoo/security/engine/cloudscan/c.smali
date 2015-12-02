.class public Lcom/qihoo/security/engine/cloudscan/c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/qihoo/security/services/a;


# instance fields
.field final a:Landroid/content/Context;

.field final b:Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;

.field final c:Ljava/lang/String;

.field volatile d:I

.field volatile e:Z

.field final f:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v0, p0, Lcom/qihoo/security/engine/cloudscan/c;->d:I

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/c;->e:Z

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/c;->f:Ljava/util/HashMap;

    iput-object p1, p0, Lcom/qihoo/security/engine/cloudscan/c;->a:Landroid/content/Context;

    new-instance v0, Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;

    invoke-direct {v0, p1}, Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/c;->b:Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/c;->a:Landroid/content/Context;

    const-string/jumbo v1, "cloud.cache"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/c;->c:Ljava/lang/String;

    return-void
.end method

.method private a(Lcom/qihoo/security/engine/FileInfo;)Z
    .locals 11

    const/4 v10, 0x5

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v4, p1, Lcom/qihoo/security/engine/FileInfo;->filePath:Ljava/lang/String;

    const-string/jumbo v0, "mounted"

    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/c;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/common/e/b;->c(Landroid/content/Context;)B

    move-result v0

    iget-object v3, p0, Lcom/qihoo/security/engine/cloudscan/c;->a:Landroid/content/Context;

    invoke-static {v3}, Lcom/qihoo360/common/e/b;->b(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_5

    iget v3, p1, Lcom/qihoo/security/engine/FileInfo;->fileType:I

    if-ne v3, v1, :cond_1

    iget-object v3, p1, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    iget-boolean v3, v3, Lcom/qihoo/security/engine/ApkInfo;->isInstalled:Z

    if-eqz v3, :cond_1

    const-string/jumbo v3, ".zip"

    invoke-virtual {v4, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    :cond_0
    :goto_0
    return v2

    :cond_1
    new-instance v5, Lcom/qihoo/security/engine/cloudscan/SampleDetector;

    invoke-direct {v5}, Lcom/qihoo/security/engine/cloudscan/SampleDetector;-><init>()V

    invoke-virtual {v5, v4}, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->Create(Ljava/lang/String;)I

    move-result v3

    if-nez v3, :cond_5

    iget-object v3, p0, Lcom/qihoo/security/engine/cloudscan/c;->b:Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;

    invoke-virtual {v5, v3}, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->SetHttpClient(Lcom/qihoo/security/engine/cloudscan/ICloudHttpClient;)I

    const-string/jumbo v3, "9"

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v3, v0}, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->SetOption(Ljava/lang/String;Ljava/lang/String;)I

    const-string/jumbo v0, "202"

    iget-object v3, p0, Lcom/qihoo/security/engine/cloudscan/c;->c:Ljava/lang/String;

    invoke-virtual {v5, v0, v3}, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->SetOption(Ljava/lang/String;Ljava/lang/String;)I

    iget v0, p1, Lcom/qihoo/security/engine/FileInfo;->fileType:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    :cond_2
    :goto_1
    :pswitch_1
    sget-object v6, Lcom/qihoo/security/engine/cloudscan/NetQuery;->COMMON_OPTIONS:[Ljava/lang/String;

    array-length v7, v6

    move v3, v2

    :goto_2
    if-lt v3, v7, :cond_6

    new-instance v0, Ljava/io/File;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v3

    const-string/jumbo v6, "360/.Tmp"

    invoke-direct {v0, v3, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    const-string/jumbo v3, "805"

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v3, v0}, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->SetOption(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/c;->f:Ljava/util/HashMap;

    const-string/jumbo v3, "802"

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string/jumbo v3, "802"

    invoke-virtual {v5, v3, v0}, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->SetOption(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    iget-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/c;->e:Z

    if-nez v0, :cond_8

    invoke-virtual {v5}, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->DoDetection()I

    move-result v0

    if-nez v0, :cond_8

    iget v0, p1, Lcom/qihoo/security/engine/FileInfo;->fileType:I

    if-ne v0, v10, :cond_4

    :try_start_0
    invoke-static {}, Lcom/qihoo/security/engine/c/a;->a()Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/common/utils/FileUtil;->deleteDirectory(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    :goto_3
    move v0, v1

    :goto_4
    invoke-virtual {v5}, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->Destroy()V

    move v2, v0

    :cond_5
    if-eqz p1, :cond_0

    iget v0, p1, Lcom/qihoo/security/engine/FileInfo;->fileType:I

    if-ne v0, v10, :cond_0

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    goto/16 :goto_0

    :pswitch_2
    sget-boolean v0, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    if-nez v0, :cond_2

    goto/16 :goto_0

    :pswitch_3
    sget-boolean v0, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    if-eqz v0, :cond_0

    const-string/jumbo v0, "804"

    const-string/jumbo v3, "7"

    invoke-virtual {v5, v0, v3}, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->SetOption(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/c;->f:Ljava/util/HashMap;

    const-string/jumbo v3, "814"

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    const-string/jumbo v3, "814"

    invoke-virtual {v5, v3, v0}, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->SetOption(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_1

    :cond_6
    aget-object v8, v6, v3

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/c;->f:Ljava/util/HashMap;

    invoke-virtual {v0, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_7

    :goto_5
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto/16 :goto_2

    :cond_7
    invoke-virtual {v5, v8, v0}, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->SetOption(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_5

    :catch_0
    move-exception v0

    goto :goto_3

    :cond_8
    move v0, v2

    goto :goto_4

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method


# virtual methods
.method public a(I)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Ljava/io/File;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    const-string/jumbo v2, "360/.Tmp"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    :try_start_0
    invoke-static {v0}, Lcom/qihoo360/common/utils/FileUtil;->deleteDirectory(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    const/4 v0, 0x0

    return v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public a(IILjava/lang/String;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x0

    return v0
.end method

.method public a(ILcom/qihoo/security/services/ScanResult;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x1

    return v0
.end method

.method public a(ILcom/qihoo/security/services/ScanResult;Lcom/qihoo/security/services/b;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const v0, -0x7fffbfff

    return v0
.end method

.method public a(ILjava/lang/String;Ljava/lang/String;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const-string/jumbo v0, "11"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/c;->a:Landroid/content/Context;

    invoke-static {v0, p3}, Lcom/qihoo/security/env/QVSEnv$a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/c;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    return v0
.end method

.method public a(ILjava/util/List;)I
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/services/ScanResult;",
            ">;)I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v3, 0x1

    const/4 v2, 0x0

    const/4 v0, 0x2

    iput v0, p0, Lcom/qihoo/security/engine/cloudscan/c;->d:I

    const-string/jumbo v0, "1"

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/c;->f:Ljava/util/HashMap;

    const-string/jumbo v4, "702"

    invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v1, v2

    :goto_0
    iput-boolean v2, p0, Lcom/qihoo/security/engine/cloudscan/c;->e:Z

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v4, v2

    :cond_0
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_3

    :cond_1
    iput v3, p0, Lcom/qihoo/security/engine/cloudscan/c;->d:I

    if-eqz v4, :cond_5

    :goto_2
    return v2

    :cond_2
    move v1, v3

    goto :goto_0

    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/ScanResult;

    iget-boolean v6, p0, Lcom/qihoo/security/engine/cloudscan/c;->e:Z

    if-nez v6, :cond_1

    if-eqz v1, :cond_4

    iget-object v6, v0, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v6, v6, Lcom/qihoo/security/engine/FileInfo;->filePath:Ljava/lang/String;

    const-string/jumbo v7, "/system"

    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_0

    :cond_4
    iget-object v0, v0, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    invoke-direct {p0, v0}, Lcom/qihoo/security/engine/cloudscan/c;->a(Lcom/qihoo/security/engine/FileInfo;)Z

    move-result v0

    or-int/2addr v0, v4

    move v4, v0

    goto :goto_1

    :cond_5
    const v2, -0x7fffbffb

    goto :goto_2
.end method

.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Lcom/qihoo/security/services/ScanResult;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    return-void
.end method

.method public a(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    return-void
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public b(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x0

    return v0
.end method

.method public b(ILcom/qihoo/security/services/ScanResult;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const v0, -0x7fffbfff

    return v0
.end method

.method public c(I)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v1, 0x0

    const/4 v0, 0x1

    iput v0, p0, Lcom/qihoo/security/engine/cloudscan/c;->d:I

    iput-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/c;->e:Z

    return v1
.end method

.method public d(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/engine/cloudscan/c;->d:I

    return v0
.end method

.method public e(I)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v1, 0x0

    const/4 v0, 0x1

    iput v0, p0, Lcom/qihoo/security/engine/cloudscan/c;->d:I

    iput-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/c;->e:Z

    return v1
.end method

.method public f(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/c;->e:Z

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/c;->b:Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;->Cancel()Z

    const/4 v0, 0x0

    return v0
.end method

.method public g(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const v0, -0x7fffbfff

    return v0
.end method

.method public h(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/c;->d:I

    return v0
.end method

.method public i(I)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const-string/jumbo v0, "Sample"

    return-object v0
.end method

.method public j(I)Landroid/os/IBinder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method
