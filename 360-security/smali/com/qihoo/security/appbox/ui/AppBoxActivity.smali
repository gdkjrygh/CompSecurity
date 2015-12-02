.class public Lcom/qihoo/security/appbox/ui/AppBoxActivity;
.super Lcom/qihoo/security/app/BaseActivity;
.source "360Security"


# instance fields
.field private y:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 20
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseActivity;-><init>()V

    .line 24
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/appbox/ui/AppBoxActivity;->y:Z

    return-void
.end method


# virtual methods
.method public c(Z)V
    .locals 4

    .prologue
    .line 83
    if-eqz p1, :cond_0

    .line 84
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 88
    const-string/jumbo v1, "appbox_new_function_enable_last_time"

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {p0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 90
    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 28
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 32
    invoke-virtual {p0}, Lcom/qihoo/security/appbox/ui/AppBoxActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f070007

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 33
    invoke-static {}, Lcom/qihoo/security/app/e;->b()V

    .line 35
    :cond_0
    const/16 v0, 0x461

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 36
    const-string/jumbo v0, "com.qihoo.security.lite.ACTION_APPBOX_SHORTCUT"

    invoke-virtual {p0}, Lcom/qihoo/security/appbox/ui/AppBoxActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 37
    const/16 v0, 0x6591

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 38
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/appbox/ui/AppBoxActivity;->y:Z

    .line 39
    invoke-static {}, Lcom/qihoo/security/appbox/core/d;->a()Lcom/qihoo/security/appbox/core/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/core/d;->d()Z

    move-result v0

    .line 40
    invoke-static {}, Lcom/qihoo/security/appbox/core/d;->a()Lcom/qihoo/security/appbox/core/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/appbox/core/d;->c()I

    move-result v1

    .line 42
    const-string/jumbo v2, "last_get_red_dot_show_rule_value"

    invoke-static {p0, v2, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 43
    invoke-virtual {p0, v0}, Lcom/qihoo/security/appbox/ui/AppBoxActivity;->c(Z)V

    .line 55
    :cond_1
    :goto_0
    invoke-static {}, Lcom/qihoo/security/appbox/core/d;->a()Lcom/qihoo/security/appbox/core/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/core/d;->b()Z

    move-result v0

    .line 59
    if-eqz v0, :cond_4

    .line 60
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 61
    iget-boolean v1, p0, Lcom/qihoo/security/appbox/ui/AppBoxActivity;->y:Z

    if-eqz v1, :cond_2

    .line 62
    const-string/jumbo v1, "com.qihoo.security.lite.ACTION_APPBOX_SHORTCUT"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 64
    :cond_2
    invoke-virtual {p0, v0}, Lcom/qihoo/security/appbox/ui/AppBoxActivity;->startActivity(Landroid/content/Intent;)V

    .line 78
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/AppBoxActivity;->p:Landroid/content/Context;

    invoke-static {v0, v3}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;Z)V

    .line 79
    invoke-virtual {p0}, Lcom/qihoo/security/appbox/ui/AppBoxActivity;->finish()V

    .line 80
    return-void

    .line 45
    :cond_3
    invoke-virtual {p0}, Lcom/qihoo/security/appbox/ui/AppBoxActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    const-string/jumbo v1, "current_red_point_is_showing"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    .line 48
    invoke-virtual {p0, v0}, Lcom/qihoo/security/appbox/ui/AppBoxActivity;->c(Z)V

    goto :goto_0

    .line 66
    :cond_4
    invoke-static {p0}, Lcom/qihoo/security/adv/a/c;->a(Landroid/content/Context;)V

    .line 67
    const-string/jumbo v0, "55"

    const-string/jumbo v1, "179046299094879_179857549013754"

    invoke-static {p0, v0, v1}, Lcom/mobvista/sdk/m/core/MobvistaAd;->newAdWallController(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    move-result-object v1

    .line 68
    const/4 v0, 0x0

    .line 69
    if-eqz v1, :cond_5

    .line 70
    invoke-virtual {v1}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->getWallIntent()Landroid/content/Intent;

    move-result-object v0

    .line 72
    :cond_5
    iget-boolean v1, p0, Lcom/qihoo/security/appbox/ui/AppBoxActivity;->y:Z

    if-eqz v1, :cond_6

    .line 73
    const-string/jumbo v1, "com.qihoo.security.lite.ACTION_APPBOX_SHORTCUT"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 75
    :cond_6
    const-class v1, Lcom/qihoo/security/appbox/ui/AdMobvistaActActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 76
    invoke-virtual {p0, v0}, Lcom/qihoo/security/appbox/ui/AppBoxActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_1
.end method
