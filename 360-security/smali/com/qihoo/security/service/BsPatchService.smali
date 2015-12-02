.class public Lcom/qihoo/security/service/BsPatchService;
.super Lcom/qihoo/security/app/UiProcessService;
.source "360Security"


# static fields
.field private static final c:Ljava/lang/String;


# instance fields
.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 31
    const-class v0, Lcom/qihoo/security/service/BsPatchService;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/service/BsPatchService;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/qihoo/security/app/UiProcessService;-><init>()V

    .line 33
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/service/BsPatchService;->d:Z

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/service/BsPatchService;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/qihoo/security/service/BsPatchService;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Lcom/qihoo/security/service/BsPatchService;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/qihoo/security/service/BsPatchService;->b:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 113
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 0

    .prologue
    .line 37
    invoke-super {p0}, Lcom/qihoo/security/app/UiProcessService;->onCreate()V

    .line 41
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .prologue
    .line 118
    invoke-super {p0}, Lcom/qihoo/security/app/UiProcessService;->onDestroy()V

    .line 123
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 45
    invoke-super {p0, p1, p2, p3}, Lcom/qihoo/security/app/UiProcessService;->onStartCommand(Landroid/content/Intent;II)I

    .line 51
    if-nez p1, :cond_1

    .line 108
    :cond_0
    :goto_0
    return v5

    .line 56
    :cond_1
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 59
    iget-boolean v1, p0, Lcom/qihoo/security/service/BsPatchService;->d:Z

    if-nez v1, :cond_0

    .line 60
    iput-boolean v5, p0, Lcom/qihoo/security/service/BsPatchService;->d:Z

    .line 61
    const-string/jumbo v1, "com.qihoo.security.action.ACTION_BSPATCH"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 65
    const-string/jumbo v0, "target_path"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 66
    const-string/jumbo v1, "patch_path"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 67
    if-eqz v0, :cond_3

    if-eqz v1, :cond_3

    const-string/jumbo v2, ".patch"

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 71
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 73
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Ljava/io/File;->canWrite()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 74
    new-instance v3, Ljava/lang/Thread;

    new-instance v4, Lcom/qihoo/security/service/BsPatchService$1;

    invoke-direct {v4, p0, v2, v0, v1}, Lcom/qihoo/security/service/BsPatchService$1;-><init>(Lcom/qihoo/security/service/BsPatchService;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v3, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 94
    :cond_2
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    const v1, 0x7f0c018c

    const v2, 0x7f020143

    invoke-virtual {v0, v1, v2}, Lcom/qihoo360/mobilesafe/b/q;->a(II)V

    .line 96
    invoke-virtual {p0}, Lcom/qihoo/security/service/BsPatchService;->stopSelf()V

    goto :goto_0

    .line 100
    :cond_3
    invoke-virtual {p0}, Lcom/qihoo/security/service/BsPatchService;->stopSelf()V

    goto :goto_0

    .line 104
    :cond_4
    invoke-virtual {p0}, Lcom/qihoo/security/service/BsPatchService;->stopSelf()V

    goto :goto_0
.end method
