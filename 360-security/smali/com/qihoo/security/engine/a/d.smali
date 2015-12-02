.class public Lcom/qihoo/security/engine/a/d;
.super Lcom/qihoo/security/services/a$a;

# interfaces
.implements Lcom/qihoo/security/services/a;


# static fields
.field private static final d:Ljava/lang/String;


# instance fields
.field final a:Landroid/content/Context;

.field volatile b:I

.field c:Z

.field private e:Ljava/lang/String;

.field private f:Lcom/qihoo/security/engine/cloudscan/CacheQuery;

.field private g:Lcom/qihoo/security/engine/cloudscan/NetQuery;

.field private h:Lcom/qihoo/security/engine/a/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/qihoo/security/engine/a/d;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/engine/a/d;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v1, 0x0

    const/4 v0, 0x0

    invoke-direct {p0}, Lcom/qihoo/security/services/a$a;-><init>()V

    iput v1, p0, Lcom/qihoo/security/engine/a/d;->b:I

    iput-object v0, p0, Lcom/qihoo/security/engine/a/d;->e:Ljava/lang/String;

    iput-object v0, p0, Lcom/qihoo/security/engine/a/d;->f:Lcom/qihoo/security/engine/cloudscan/CacheQuery;

    iput-object v0, p0, Lcom/qihoo/security/engine/a/d;->g:Lcom/qihoo/security/engine/cloudscan/NetQuery;

    iput-boolean v1, p0, Lcom/qihoo/security/engine/a/d;->c:Z

    iput-object p1, p0, Lcom/qihoo/security/engine/a/d;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x0

    return v0
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
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const-wide/16 v6, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    const/16 v2, 0xb

    iput v2, p2, Lcom/qihoo/security/services/ScanResult;->state:I

    iget-object v2, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    iget-boolean v2, v2, Lcom/qihoo/security/engine/ApkInfo;->isInstalled:Z

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    iget-boolean v2, p0, Lcom/qihoo/security/engine/a/d;->c:Z

    if-eqz v2, :cond_4

    iget-object v2, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/FileInfo;->adPluginInfo:Lcom/qihoo/security/engine/AdPluginInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/AdPluginInfo;->AdPlugins:[Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;

    if-eqz v2, :cond_0

    iget-object v0, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v0, v0, Lcom/qihoo/security/engine/FileInfo;->adPluginInfo:Lcom/qihoo/security/engine/AdPluginInfo;

    iget-object v2, v0, Lcom/qihoo/security/engine/AdPluginInfo;->AdPlugins:[Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;

    array-length v3, v2

    move v0, v1

    :goto_1
    if-lt v0, v3, :cond_3

    move v0, v1

    goto :goto_0

    :cond_3
    aget-object v4, v2, v0

    iget-object v5, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v5, v5, Lcom/qihoo/security/engine/FileInfo;->adPluginInfo:Lcom/qihoo/security/engine/AdPluginInfo;

    iget v6, v5, Lcom/qihoo/security/engine/AdPluginInfo;->AdAllType:I

    iget v4, v4, Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;->type:I

    or-int/2addr v4, v6

    iput v4, v5, Lcom/qihoo/security/engine/AdPluginInfo;->AdAllType:I

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    new-array v2, v0, [Lcom/qihoo/security/engine/cloudscan/QueryItem;

    new-instance v3, Lcom/qihoo/security/engine/cloudscan/QueryItem;

    iget-object v4, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    invoke-direct {v3, v4, v0, v6, v7}, Lcom/qihoo/security/engine/cloudscan/QueryItem;-><init>(Lcom/qihoo/security/engine/FileInfo;IJ)V

    aput-object v3, v2, v1

    iget-object v3, p0, Lcom/qihoo/security/engine/a/d;->f:Lcom/qihoo/security/engine/cloudscan/CacheQuery;

    if-nez v3, :cond_5

    new-instance v3, Lcom/qihoo/security/engine/cloudscan/CacheQuery;

    iget-object v4, p0, Lcom/qihoo/security/engine/a/d;->a:Landroid/content/Context;

    invoke-direct {v3, v4}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;-><init>(Landroid/content/Context;)V

    iput-object v3, p0, Lcom/qihoo/security/engine/a/d;->f:Lcom/qihoo/security/engine/cloudscan/CacheQuery;

    iget-object v3, p0, Lcom/qihoo/security/engine/a/d;->f:Lcom/qihoo/security/engine/cloudscan/CacheQuery;

    iget-object v4, p0, Lcom/qihoo/security/engine/a/d;->e:Ljava/lang/String;

    invoke-virtual {v3, v4, v6, v7}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->Create(Ljava/lang/String;J)Z

    :cond_5
    iget-object v3, p0, Lcom/qihoo/security/engine/a/d;->f:Lcom/qihoo/security/engine/cloudscan/CacheQuery;

    invoke-virtual {v3, v2}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->Query([Lcom/qihoo/security/engine/cloudscan/QueryItem;)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    iget-object v0, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v0, v0, Lcom/qihoo/security/engine/FileInfo;->adPluginInfo:Lcom/qihoo/security/engine/AdPluginInfo;

    iget-object v2, v0, Lcom/qihoo/security/engine/AdPluginInfo;->AdPlugins:[Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;

    array-length v3, v2

    move v0, v1

    :goto_2
    if-lt v0, v3, :cond_6

    move v0, v1

    goto :goto_0

    :cond_6
    aget-object v4, v2, v0

    iget-object v5, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v5, v5, Lcom/qihoo/security/engine/FileInfo;->adPluginInfo:Lcom/qihoo/security/engine/AdPluginInfo;

    iget v6, v5, Lcom/qihoo/security/engine/AdPluginInfo;->AdAllType:I

    iget v4, v4, Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;->type:I

    or-int/2addr v4, v6

    iput v4, v5, Lcom/qihoo/security/engine/AdPluginInfo;->AdAllType:I

    add-int/lit8 v0, v0, 0x1

    goto :goto_2
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
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x0

    const-string/jumbo v1, "workmode"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string/jumbo v1, "ds"

    invoke-virtual {v1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/qihoo/security/engine/a/d;->c:Z

    iget-object v1, p0, Lcom/qihoo/security/engine/a/d;->h:Lcom/qihoo/security/engine/a/f;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/engine/a/d;->h:Lcom/qihoo/security/engine/a/f;

    invoke-virtual {v1}, Lcom/qihoo/security/engine/a/f;->a()V

    :cond_0
    :goto_0
    return v0

    :cond_1
    iput-boolean v0, p0, Lcom/qihoo/security/engine/a/d;->c:Z

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/qihoo/security/engine/a/d;->g:Lcom/qihoo/security/engine/cloudscan/NetQuery;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/qihoo/security/engine/a/d;->g:Lcom/qihoo/security/engine/cloudscan/NetQuery;

    invoke-virtual {v1, p2, p3}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->SetOption(Ljava/lang/String;Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    const v0, -0x7fffbffb

    goto :goto_0
.end method

.method public a(ILjava/util/List;)I
    .locals 5
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

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/ScanResult;

    iget-object v2, v0, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/FileInfo;->adPluginInfo:Lcom/qihoo/security/engine/AdPluginInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/AdPluginInfo;->AdPlugins:[Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;

    if-eqz v2, :cond_2

    :cond_2
    iget-object v2, v0, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, v2, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/qihoo/security/engine/ApkInfo;->openClassesDex(Z)Lcom/qihoo/security/engine/ClassesDexInfo;

    move-result-object v2

    iget-object v3, p0, Lcom/qihoo/security/engine/a/d;->h:Lcom/qihoo/security/engine/a/f;

    iget-object v4, v0, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v4, v4, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    iget-object v4, v4, Lcom/qihoo/security/engine/ApkInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v3, v4, v2}, Lcom/qihoo/security/engine/a/f;->a(Ljava/lang/String;Lcom/qihoo/security/engine/ClassesDexInfo;)Lcom/qihoo/security/engine/a/e;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/qihoo/security/engine/a/e;->a()Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, v0, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v3, v3, Lcom/qihoo/security/engine/FileInfo;->adPluginInfo:Lcom/qihoo/security/engine/AdPluginInfo;

    invoke-virtual {v2, v3}, Lcom/qihoo/security/engine/a/e;->a(Lcom/qihoo/security/engine/AdPluginInfo;)Z

    :cond_3
    iget-object v0, v0, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v0, v0, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/ApkInfo;->closeClassesDex()V

    goto :goto_0
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
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/qihoo/security/engine/a/d;->a:Landroid/content/Context;

    const-string/jumbo v1, "cloud.cache"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/a/d;->e:Ljava/lang/String;

    iget v0, p0, Lcom/qihoo/security/engine/a/d;->b:I

    if-eqz v0, :cond_0

    const v0, -0x7fff0001

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/a/d;->h:Lcom/qihoo/security/engine/a/f;

    if-nez v0, :cond_1

    new-instance v0, Lcom/qihoo/security/engine/a/f;

    iget-object v1, p0, Lcom/qihoo/security/engine/a/d;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/engine/a/f;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/engine/a/d;->h:Lcom/qihoo/security/engine/a/f;

    iget-object v0, p0, Lcom/qihoo/security/engine/a/d;->h:Lcom/qihoo/security/engine/a/f;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/a/f;->b()V

    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/engine/a/d;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/common/utils/SysInfo;->getIMEI(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string/jumbo v1, "0"

    invoke-static {v1, v0}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->SetGlobalOption(Ljava/lang/String;Ljava/lang/Object;)I

    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/engine/a/d;->g:Lcom/qihoo/security/engine/cloudscan/NetQuery;

    if-nez v0, :cond_2

    new-instance v0, Lcom/qihoo/security/engine/cloudscan/NetQuery;

    iget-object v1, p0, Lcom/qihoo/security/engine/a/d;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/engine/cloudscan/NetQuery;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/engine/a/d;->g:Lcom/qihoo/security/engine/cloudscan/NetQuery;

    iget-object v0, p0, Lcom/qihoo/security/engine/a/d;->g:Lcom/qihoo/security/engine/cloudscan/NetQuery;

    const-string/jumbo v1, "202"

    iget-object v2, p0, Lcom/qihoo/security/engine/a/d;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->SetOption(Ljava/lang/String;Ljava/lang/Object;)Z

    :cond_2
    const/4 v0, 0x1

    iput v0, p0, Lcom/qihoo/security/engine/a/d;->b:I

    const/4 v0, 0x0

    goto :goto_0

    :cond_3
    const-string/jumbo v0, "0"

    const-string/jumbo v1, "0123456789"

    invoke-static {v0, v1}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->SetGlobalOption(Ljava/lang/String;Ljava/lang/Object;)I

    goto :goto_1
.end method

.method public d(I)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v2, 0x0

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/qihoo/security/engine/a/d;->h:Lcom/qihoo/security/engine/a/f;

    iput v2, p0, Lcom/qihoo/security/engine/a/d;->b:I

    iget-object v0, p0, Lcom/qihoo/security/engine/a/d;->f:Lcom/qihoo/security/engine/cloudscan/CacheQuery;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/a/d;->f:Lcom/qihoo/security/engine/cloudscan/CacheQuery;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->Destroy()Z

    iput-object v1, p0, Lcom/qihoo/security/engine/a/d;->f:Lcom/qihoo/security/engine/cloudscan/CacheQuery;

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/a/d;->g:Lcom/qihoo/security/engine/cloudscan/NetQuery;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/engine/a/d;->g:Lcom/qihoo/security/engine/cloudscan/NetQuery;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->Destroy()Z

    iput-object v1, p0, Lcom/qihoo/security/engine/a/d;->g:Lcom/qihoo/security/engine/cloudscan/NetQuery;

    :cond_1
    return v2
.end method

.method public e(I)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget v0, p0, Lcom/qihoo/security/engine/a/d;->b:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    iput v0, p0, Lcom/qihoo/security/engine/a/d;->b:I

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public f(I)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x3

    iput v0, p0, Lcom/qihoo/security/engine/a/d;->b:I

    iget-object v0, p0, Lcom/qihoo/security/engine/a/d;->g:Lcom/qihoo/security/engine/cloudscan/NetQuery;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/a/d;->g:Lcom/qihoo/security/engine/cloudscan/NetQuery;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->Cancel()I

    :cond_0
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

    iget v0, p0, Lcom/qihoo/security/engine/a/d;->b:I

    return v0
.end method

.method public i(I)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const-string/jumbo v0, "ADSCAN"

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
