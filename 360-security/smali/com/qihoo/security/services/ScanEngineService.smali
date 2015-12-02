.class public Lcom/qihoo/security/services/ScanEngineService;
.super Landroid/app/Service;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/services/ScanEngineService$a;
    }
.end annotation


# static fields
.field public static final c:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static final d:Ljava/util/concurrent/atomic/AtomicInteger;

.field private static e:Z


# instance fields
.field final a:Lcom/qihoo/security/services/a$a;

.field final b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Lcom/qihoo/security/services/a;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lcom/qihoo/security/services/ScanEngineService$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v1, 0x0

    sput-boolean v1, Lcom/qihoo/security/services/ScanEngineService;->e:Z

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lcom/qihoo/security/services/ScanEngineService;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lcom/qihoo/security/services/ScanEngineService;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    new-instance v0, Lcom/qihoo/security/services/ScanEngineService$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/services/ScanEngineService$1;-><init>(Lcom/qihoo/security/services/ScanEngineService;)V

    iput-object v0, p0, Lcom/qihoo/security/services/ScanEngineService;->a:Lcom/qihoo/security/services/a$a;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/services/ScanEngineService;->b:Landroid/util/SparseArray;

    new-instance v0, Lcom/qihoo/security/services/ScanEngineService$a;

    invoke-direct {v0, p0}, Lcom/qihoo/security/services/ScanEngineService$a;-><init>(Lcom/qihoo/security/services/ScanEngineService;)V

    iput-object v0, p0, Lcom/qihoo/security/services/ScanEngineService;->f:Lcom/qihoo/security/services/ScanEngineService$a;

    return-void
.end method

.method static synthetic a()Z
    .locals 1

    sget-boolean v0, Lcom/qihoo/security/services/ScanEngineService;->e:Z

    return v0
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    const/4 v0, 0x0

    sput-boolean v0, Lcom/qihoo/security/services/ScanEngineService;->e:Z

    iget-object v0, p0, Lcom/qihoo/security/services/ScanEngineService;->a:Lcom/qihoo/security/services/a$a;

    return-object v0
.end method

.method public onCreate()V
    .locals 3

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    iget-object v0, p0, Lcom/qihoo/security/services/ScanEngineService;->b:Landroid/util/SparseArray;

    const/4 v1, 0x1

    new-instance v2, Lcom/qihoo/security/engine/ave/a;

    invoke-direct {v2, p0}, Lcom/qihoo/security/engine/ave/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/qihoo/security/services/ScanEngineService;->b:Landroid/util/SparseArray;

    const/4 v1, 0x2

    new-instance v2, Lcom/qihoo/security/engine/cloudscan/a;

    invoke-direct {v2, p0}, Lcom/qihoo/security/engine/cloudscan/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/qihoo/security/services/ScanEngineService;->b:Landroid/util/SparseArray;

    const/4 v1, 0x6

    new-instance v2, Lcom/qihoo/security/engine/a/d;

    invoke-direct {v2, p0}, Lcom/qihoo/security/engine/a/d;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/qihoo/security/services/ScanEngineService;->b:Landroid/util/SparseArray;

    const/4 v1, 0x7

    new-instance v2, Lcom/qihoo/security/engine/cloudscan/c;

    invoke-direct {v2, p0}, Lcom/qihoo/security/engine/cloudscan/c;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const-string/jumbo v0, "dejavu-2.1.0"

    invoke-static {p0, v0}, Lcom/qihoo360/common/utils/NativeLoader;->load(Landroid/content/Context;Ljava/lang/String;)Z

    const-string/jumbo v0, "qvmwrapper-1.0.2"

    invoke-static {p0, v0}, Lcom/qihoo360/common/utils/NativeLoader;->load(Landroid/content/Context;Ljava/lang/String;)Z

    const-string/jumbo v0, "cloudscan-jni-1.0.5.2002"

    invoke-static {p0, v0}, Lcom/qihoo360/common/utils/NativeLoader;->load(Landroid/content/Context;Ljava/lang/String;)Z

    return-void
.end method

.method public onDestroy()V
    .locals 5

    const/4 v4, 0x1

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/services/ScanEngineService;->b:Landroid/util/SparseArray;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/a;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/qihoo/security/services/a;->b(I)I

    iget-object v0, p0, Lcom/qihoo/security/services/ScanEngineService;->b:Landroid/util/SparseArray;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/a;

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lcom/qihoo/security/services/a;->b(I)I

    iget-object v0, p0, Lcom/qihoo/security/services/ScanEngineService;->b:Landroid/util/SparseArray;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/a;

    const/4 v1, 0x6

    invoke-interface {v0, v1}, Lcom/qihoo/security/services/a;->b(I)I

    iget-object v0, p0, Lcom/qihoo/security/services/ScanEngineService;->b:Landroid/util/SparseArray;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/a;

    const/4 v1, 0x7

    invoke-interface {v0, v1}, Lcom/qihoo/security/services/a;->b(I)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    sput-boolean v4, Lcom/qihoo/security/services/ScanEngineService;->e:Z

    iget-object v0, p0, Lcom/qihoo/security/services/ScanEngineService;->f:Lcom/qihoo/security/services/ScanEngineService$a;

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v4, v2, v3}, Lcom/qihoo/security/services/ScanEngineService$a;->sendEmptyMessageDelayed(IJ)Z

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
