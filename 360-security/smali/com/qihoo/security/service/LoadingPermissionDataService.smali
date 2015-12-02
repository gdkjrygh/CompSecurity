.class public Lcom/qihoo/security/service/LoadingPermissionDataService;
.super Lcom/qihoo/security/app/UiProcessService;
.source "360Security"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Lcom/qihoo/security/app/UiProcessService;-><init>()V

    return-void
.end method

.method private a()V
    .locals 3

    .prologue
    .line 153
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_1

    .line 161
    :cond_0
    :goto_0
    return-void

    .line 156
    :cond_1
    invoke-static {}, Lcom/qihoo/security/h/c;->a()Lcom/qihoo/security/h/c;

    move-result-object v0

    .line 157
    invoke-virtual {v0}, Lcom/qihoo/security/h/c;->b()I

    move-result v1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_0

    .line 158
    invoke-virtual {v0}, Lcom/qihoo/security/h/c;->c()V

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/service/LoadingPermissionDataService;)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Lcom/qihoo/security/service/LoadingPermissionDataService;->a()V

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 47
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 0

    .prologue
    .line 40
    invoke-super {p0}, Lcom/qihoo/security/app/UiProcessService;->onCreate()V

    .line 43
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .prologue
    .line 54
    invoke-super {p0}, Lcom/qihoo/security/app/UiProcessService;->onDestroy()V

    .line 55
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 66
    invoke-super {p0, p1, p2, p3}, Lcom/qihoo/security/app/UiProcessService;->onStartCommand(Landroid/content/Intent;II)I

    .line 71
    if-nez p1, :cond_0

    .line 72
    invoke-virtual {p0}, Lcom/qihoo/security/service/LoadingPermissionDataService;->stopSelf()V

    .line 149
    :goto_0
    return v2

    .line 79
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 81
    const-string/jumbo v1, "com.qihoo360.mobilesafe.shield.loading"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 85
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/qihoo/security/service/LoadingPermissionDataService$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/service/LoadingPermissionDataService$1;-><init>(Lcom/qihoo/security/service/LoadingPermissionDataService;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 94
    :cond_1
    const-string/jumbo v1, "com.qihoo360.mobilesafe.shield.pkgadd"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 95
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/qihoo/security/service/LoadingPermissionDataService$2;

    invoke-direct {v1, p0, p1}, Lcom/qihoo/security/service/LoadingPermissionDataService$2;-><init>(Lcom/qihoo/security/service/LoadingPermissionDataService;Landroid/content/Intent;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 148
    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/qihoo/security/service/LoadingPermissionDataService;->stopSelf()V

    goto :goto_0

    .line 108
    :cond_3
    const-string/jumbo v1, "com.qihoo360.mobilesafe.shield.pkgremoved"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 109
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/qihoo/security/service/LoadingPermissionDataService$3;

    invoke-direct {v1, p0, p1}, Lcom/qihoo/security/service/LoadingPermissionDataService$3;-><init>(Lcom/qihoo/security/service/LoadingPermissionDataService;Landroid/content/Intent;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_1

    .line 122
    :cond_4
    const-string/jumbo v1, "com.qihoo360.mobilesafe.shield.updatefile"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 123
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/qihoo/security/service/LoadingPermissionDataService$4;

    invoke-direct {v1, p0, p1}, Lcom/qihoo/security/service/LoadingPermissionDataService$4;-><init>(Lcom/qihoo/security/service/LoadingPermissionDataService;Landroid/content/Intent;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 138
    :cond_5
    const-string/jumbo v1, "com.qihoo360.mobilesafe.shield.pkgsavailable"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 139
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/qihoo/security/service/LoadingPermissionDataService$5;

    invoke-direct {v1, p0, p1}, Lcom/qihoo/security/service/LoadingPermissionDataService$5;-><init>(Lcom/qihoo/security/service/LoadingPermissionDataService;Landroid/content/Intent;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_1
.end method

.method public onUnbind(Landroid/content/Intent;)Z
    .locals 1

    .prologue
    .line 61
    invoke-super {p0, p1}, Lcom/qihoo/security/app/UiProcessService;->onUnbind(Landroid/content/Intent;)Z

    move-result v0

    return v0
.end method
