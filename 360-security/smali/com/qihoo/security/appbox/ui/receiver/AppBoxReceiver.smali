.class public Lcom/qihoo/security/appbox/ui/receiver/AppBoxReceiver;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/appbox/ui/receiver/AppBoxReceiver$a;
    }
.end annotation


# instance fields
.field private a:Lcom/qihoo/security/appbox/ui/receiver/AppBoxReceiver$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 46
    return-void
.end method

.method public constructor <init>(Lcom/qihoo/security/appbox/ui/receiver/AppBoxReceiver$a;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 49
    iput-object p1, p0, Lcom/qihoo/security/appbox/ui/receiver/AppBoxReceiver;->a:Lcom/qihoo/security/appbox/ui/receiver/AppBoxReceiver$a;

    .line 50
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 77
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 78
    const-string/jumbo v1, "_qihoo_AppBox_APPLICATION_INSTALL"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 79
    const-string/jumbo v1, "_qihoo_AppBox_APPLICATION_UNINSTALL"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 80
    const-string/jumbo v1, "_qihoo_AppBox_APPLICATION_REFRESH"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 81
    const-string/jumbo v1, "com.qihoo.security.lite.PERMISSION"

    const/4 v2, 0x0

    invoke-virtual {p1, p0, v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 82
    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .prologue
    .line 54
    const-string/jumbo v0, "packageName"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 55
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    .line 61
    const-string/jumbo v2, "_qihoo_AppBox_APPLICATION_INSTALL"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 62
    iget-object v1, p0, Lcom/qihoo/security/appbox/ui/receiver/AppBoxReceiver;->a:Lcom/qihoo/security/appbox/ui/receiver/AppBoxReceiver$a;

    if-eqz v1, :cond_0

    .line 63
    iget-object v1, p0, Lcom/qihoo/security/appbox/ui/receiver/AppBoxReceiver;->a:Lcom/qihoo/security/appbox/ui/receiver/AppBoxReceiver$a;

    invoke-interface {v1, v0}, Lcom/qihoo/security/appbox/ui/receiver/AppBoxReceiver$a;->b(Ljava/lang/String;)V

    .line 74
    :cond_0
    :goto_0
    return-void

    .line 65
    :cond_1
    const-string/jumbo v2, "_qihoo_AppBox_APPLICATION_UNINSTALL"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 66
    iget-object v1, p0, Lcom/qihoo/security/appbox/ui/receiver/AppBoxReceiver;->a:Lcom/qihoo/security/appbox/ui/receiver/AppBoxReceiver$a;

    if-eqz v1, :cond_0

    .line 67
    iget-object v1, p0, Lcom/qihoo/security/appbox/ui/receiver/AppBoxReceiver;->a:Lcom/qihoo/security/appbox/ui/receiver/AppBoxReceiver$a;

    invoke-interface {v1, v0}, Lcom/qihoo/security/appbox/ui/receiver/AppBoxReceiver$a;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 69
    :cond_2
    const-string/jumbo v0, "_qihoo_AppBox_APPLICATION_REFRESH"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 70
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/receiver/AppBoxReceiver;->a:Lcom/qihoo/security/appbox/ui/receiver/AppBoxReceiver$a;

    if-eqz v0, :cond_0

    .line 71
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/receiver/AppBoxReceiver;->a:Lcom/qihoo/security/appbox/ui/receiver/AppBoxReceiver$a;

    invoke-interface {v0}, Lcom/qihoo/security/appbox/ui/receiver/AppBoxReceiver$a;->g()V

    goto :goto_0
.end method
