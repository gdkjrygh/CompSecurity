.class public Lcom/qihoo/security/services/DeepScanService;
.super Landroid/app/Service;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/services/DeepScanService$a;
    }
.end annotation


# static fields
.field public static final TAG:Ljava/lang/String; = "DeepScanService"

.field static a:Z


# instance fields
.field final b:Lcom/qihoo/security/services/IDeepScan$a;

.field final c:Lcom/qihoo/security/services/DeepScanService$a;

.field final d:Lcom/qihoo/security/engine/b/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-boolean v0, Lcom/qihoo/security/services/DeepScanService;->a:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    new-instance v0, Lcom/qihoo/security/services/DeepScanService$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/services/DeepScanService$1;-><init>(Lcom/qihoo/security/services/DeepScanService;)V

    iput-object v0, p0, Lcom/qihoo/security/services/DeepScanService;->b:Lcom/qihoo/security/services/IDeepScan$a;

    new-instance v0, Lcom/qihoo/security/services/DeepScanService$a;

    invoke-direct {v0, p0, p0}, Lcom/qihoo/security/services/DeepScanService$a;-><init>(Lcom/qihoo/security/services/DeepScanService;Lcom/qihoo/security/services/DeepScanService;)V

    iput-object v0, p0, Lcom/qihoo/security/services/DeepScanService;->c:Lcom/qihoo/security/services/DeepScanService$a;

    new-instance v0, Lcom/qihoo/security/engine/b/c;

    iget-object v1, p0, Lcom/qihoo/security/services/DeepScanService;->c:Lcom/qihoo/security/services/DeepScanService$a;

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/engine/b/c;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/qihoo/security/services/DeepScanService;->d:Lcom/qihoo/security/engine/b/c;

    return-void
.end method

.method public static scanAll(Lcom/qihoo/security/services/IDeepScan;Z)V
    .locals 4

    if-eqz p0, :cond_0

    :try_start_0
    sput-boolean p1, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lcom/qihoo/security/services/DeepScanItem;

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/qihoo/security/services/DeepScanItem;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/qihoo/security/services/DeepScanItem;

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/qihoo/security/services/DeepScanItem;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {p0, v0, p1}, Lcom/qihoo/security/services/IDeepScan;->a(Ljava/util/List;Z)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static scanInstalledApps(Lcom/qihoo/security/services/IDeepScan;Z)V
    .locals 3

    if-eqz p0, :cond_0

    :try_start_0
    sput-boolean p1, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    new-instance v0, Lcom/qihoo/security/services/DeepScanItem;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/services/DeepScanItem;-><init>(ILjava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {p0, v1, p1}, Lcom/qihoo/security/services/IDeepScan;->a(Ljava/util/List;Z)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static scanPackage(Lcom/qihoo/security/services/IDeepScan;Ljava/lang/String;Z)V
    .locals 1

    if-eqz p0, :cond_0

    :try_start_0
    sput-boolean p2, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    invoke-interface {p0, p1, p2}, Lcom/qihoo/security/services/IDeepScan;->a(Ljava/lang/String;Z)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static scanPackageList(Lcom/qihoo/security/services/IDeepScan;Ljava/util/List;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/services/IDeepScan;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    if-eqz p0, :cond_0

    :try_start_0
    sput-boolean p2, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_1
    return-void

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p0, v0, p2}, Lcom/qihoo/security/services/IDeepScan;->a(Ljava/lang/String;Z)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method public static scanPath(Lcom/qihoo/security/services/IDeepScan;Ljava/lang/String;Z)V
    .locals 2

    if-eqz p0, :cond_0

    :try_start_0
    sput-boolean p2, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    new-instance v0, Lcom/qihoo/security/services/DeepScanItem;

    const/4 v1, 0x4

    invoke-direct {v0, v1, p1}, Lcom/qihoo/security/services/DeepScanItem;-><init>(ILjava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {p0, v1, p2}, Lcom/qihoo/security/services/IDeepScan;->a(Ljava/util/List;Z)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    const/4 v0, 0x0

    sput-boolean v0, Lcom/qihoo/security/services/DeepScanService;->a:Z

    iget-object v0, p0, Lcom/qihoo/security/services/DeepScanService;->b:Lcom/qihoo/security/services/IDeepScan$a;

    return-object v0
.end method

.method public onCreate()V
    .locals 4

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    iget-object v0, p0, Lcom/qihoo/security/services/DeepScanService;->d:Lcom/qihoo/security/engine/b/c;

    new-instance v1, Lcom/qihoo/security/services/d;

    invoke-virtual {p0}, Lcom/qihoo/security/services/DeepScanService;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/qihoo/security/services/DeepScanService;->c:Lcom/qihoo/security/services/DeepScanService$a;

    invoke-direct {v1, v2, v3}, Lcom/qihoo/security/services/d;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    iput-object v1, v0, Lcom/qihoo/security/engine/b/c;->e:Lcom/qihoo/security/services/d;

    const-string/jumbo v0, "cloudscan-jni-1.0.5.2002"

    invoke-static {p0, v0}, Lcom/qihoo360/common/utils/NativeLoader;->load(Landroid/content/Context;Ljava/lang/String;)Z

    return-void
.end method

.method public onDestroy()V
    .locals 4

    const/4 v1, 0x1

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    sput-boolean v1, Lcom/qihoo/security/services/DeepScanService;->a:Z

    iget-object v0, p0, Lcom/qihoo/security/services/DeepScanService;->c:Lcom/qihoo/security/services/DeepScanService$a;

    const-wide/16 v2, 0x1770

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/services/DeepScanService$a;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method
