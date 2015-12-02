.class public Lcom/qihoo/security/notify/NotificationActivity;
.super Lcom/qihoo/security/app/BaseActivity;
.source "360Security"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    const/high16 v4, 0x10000000

    const/16 v3, 0x4e21

    .line 38
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 44
    invoke-virtual {p0}, Lcom/qihoo/security/notify/NotificationActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 45
    if-nez v0, :cond_0

    .line 46
    invoke-virtual {p0}, Lcom/qihoo/security/notify/NotificationActivity;->finish()V

    .line 86
    :goto_0
    return-void

    .line 50
    :cond_0
    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    .line 52
    const-string/jumbo v2, "com.qihoo.security.action.function.NOTIFICATION"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 57
    iget-object v1, p0, Lcom/qihoo/security/notify/NotificationActivity;->p:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/service/SecurityService;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 58
    const-string/jumbo v1, "com.qihoo.security.action.function.notification"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 59
    invoke-virtual {p0, v0}, Lcom/qihoo/security/notify/NotificationActivity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 85
    :cond_1
    :goto_1
    invoke-virtual {p0}, Lcom/qihoo/security/notify/NotificationActivity;->finish()V

    goto :goto_0

    .line 60
    :cond_2
    const-string/jumbo v2, "com.qihoo.security.action.function.LANGUAGE_AUTO_DOWN_FINISH"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 61
    const/16 v1, 0x59e3

    invoke-static {v1}, Lcom/qihoo/security/support/b;->c(I)V

    .line 62
    const-string/jumbo v1, "locale"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 63
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/d;->a(Ljava/lang/String;)V

    .line 65
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/notify/NotificationActivity;->p:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 66
    invoke-virtual {v0, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 67
    const-string/jumbo v1, "com.qihoo.security.action.function.LANGUAGE_AUTO_DOWN_FINISH"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 68
    iget-object v1, p0, Lcom/qihoo/security/notify/NotificationActivity;->p:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_1

    .line 69
    :cond_3
    const-string/jumbo v2, "com.qihoo.security.action.function.MAIN"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 70
    invoke-static {v3}, Lcom/qihoo/security/support/b;->c(I)V

    .line 71
    invoke-static {v3}, Lcom/qihoo/security/support/b;->a(I)V

    .line 72
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/notify/NotificationActivity;->p:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/lite/AppEnterActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 73
    invoke-virtual {v0, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 74
    const/high16 v1, 0x200000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 75
    const-string/jumbo v1, "android.intent.action.MAIN"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 76
    const-string/jumbo v1, "android.intent.category.LAUNCHER"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 77
    const-string/jumbo v1, "from"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 78
    iget-object v1, p0, Lcom/qihoo/security/notify/NotificationActivity;->p:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_1

    .line 79
    :cond_4
    const-string/jumbo v2, "com.qihoo.security.notify.ACTION_SAFE_APP"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 80
    const-string/jumbo v1, "pkg_name"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 81
    iget-object v2, p0, Lcom/qihoo/security/notify/NotificationActivity;->p:Landroid/content/Context;

    invoke-static {v2, v1}, Lcom/qihoo360/mobilesafe/b/i;->f(Landroid/content/Context;Ljava/lang/String;)V

    .line 82
    iget-object v1, p0, Lcom/qihoo/security/notify/NotificationActivity;->p:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;Landroid/content/Intent;)V

    goto/16 :goto_1
.end method
