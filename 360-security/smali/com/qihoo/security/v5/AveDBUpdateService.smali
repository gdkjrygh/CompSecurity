.class public Lcom/qihoo/security/v5/AveDBUpdateService;
.super Landroid/app/Service;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/v5/AveDBUpdateService$1;,
        Lcom/qihoo/security/v5/AveDBUpdateService$a;,
        Lcom/qihoo/security/v5/AveDBUpdateService$b;
    }
.end annotation


# static fields
.field private static a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/qihoo/security/v5/AveDBUpdateService$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private b:Lcom/qihoo/security/v5/AveDBUpdateService$b;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 17
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 59
    new-instance v0, Lcom/qihoo/security/v5/AveDBUpdateService$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/v5/AveDBUpdateService$b;-><init>(Lcom/qihoo/security/v5/AveDBUpdateService;Lcom/qihoo/security/v5/AveDBUpdateService$1;)V

    iput-object v0, p0, Lcom/qihoo/security/v5/AveDBUpdateService;->b:Lcom/qihoo/security/v5/AveDBUpdateService$b;

    .line 126
    return-void
.end method

.method public static a()V
    .locals 1

    .prologue
    .line 123
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/v5/c;->b(Landroid/content/Context;)I

    .line 124
    return-void
.end method

.method public static a(Lcom/qihoo/security/v5/AveDBUpdateService$a;)V
    .locals 3

    .prologue
    .line 115
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/qihoo/security/v5/AveDBUpdateService;->a:Ljava/lang/ref/WeakReference;

    .line 116
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 117
    new-instance v1, Landroid/content/Intent;

    const-string/jumbo v2, "com.qihoo.security.action.ACTION_CHECK_UPDATE"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 118
    const-class v2, Lcom/qihoo/security/v5/AveDBUpdateService;

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 119
    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 120
    return-void
.end method

.method static synthetic b()Ljava/lang/ref/WeakReference;
    .locals 1

    .prologue
    .line 17
    sget-object v0, Lcom/qihoo/security/v5/AveDBUpdateService;->a:Ljava/lang/ref/WeakReference;

    return-object v0
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 63
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 2

    .prologue
    .line 68
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 69
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 70
    const-string/jumbo v1, "com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_BEGIN"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 71
    const-string/jumbo v1, "com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_END"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 72
    const-string/jumbo v1, "com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_INI"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 73
    const-string/jumbo v1, "com.qihoo.antivirus.update.action.DATA_FILE_PROGRESS"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 74
    const-string/jumbo v1, "com.qihoo.antivirus.update.action.ERROR"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 75
    const-string/jumbo v1, "com.qihoo.antivirus.update.action.UPDATE_CHECK_OVER"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 76
    iget-object v1, p0, Lcom/qihoo/security/v5/AveDBUpdateService;->b:Lcom/qihoo/security/v5/AveDBUpdateService$b;

    invoke-virtual {p0, v1, v0}, Lcom/qihoo/security/v5/AveDBUpdateService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 77
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 81
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 82
    iget-object v0, p0, Lcom/qihoo/security/v5/AveDBUpdateService;->b:Lcom/qihoo/security/v5/AveDBUpdateService$b;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/v5/AveDBUpdateService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 83
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 4

    .prologue
    .line 87
    if-eqz p1, :cond_0

    const-string/jumbo v0, "com.qihoo.security.action.ACTION_CHECK_UPDATE"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 88
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 89
    const-string/jumbo v1, "i18ntype"

    const/16 v2, 0x3e9

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    const/4 v1, 0x3

    const-string/jumbo v2, "1.0.8.3742"

    invoke-static {p0, v1, v2, v0}, Lcom/qihoo/security/v5/c;->a(Landroid/content/Context;ILjava/lang/String;Ljava/util/HashMap;)I

    move-result v1

    .line 92
    sget-object v0, Lcom/qihoo/security/v5/AveDBUpdateService;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/v5/AveDBUpdateService$a;

    .line 93
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 94
    const-string/jumbo v3, "errorResult"

    invoke-virtual {v2, v3, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 95
    packed-switch v1, :pswitch_data_0

    .line 105
    :pswitch_0
    if-eqz v0, :cond_0

    .line 106
    invoke-interface {v0, v2}, Lcom/qihoo/security/v5/AveDBUpdateService$a;->c(Landroid/os/Bundle;)V

    .line 111
    :cond_0
    :goto_0
    :pswitch_1
    const/4 v0, 0x2

    return v0

    .line 100
    :pswitch_2
    if-eqz v0, :cond_0

    .line 101
    invoke-interface {v0, v2}, Lcom/qihoo/security/v5/AveDBUpdateService$a;->c(Landroid/os/Bundle;)V

    goto :goto_0

    .line 95
    nop

    :pswitch_data_0
    .packed-switch -0x3
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
