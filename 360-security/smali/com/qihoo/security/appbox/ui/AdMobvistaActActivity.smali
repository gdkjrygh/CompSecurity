.class public Lcom/qihoo/security/appbox/ui/AdMobvistaActActivity;
.super Lcom/mobvista/sdk/m/core/AdMobvistaAct;
.source "360Security"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;-><init>()V

    return-void
.end method


# virtual methods
.method public finish()V
    .locals 3

    .prologue
    .line 20
    invoke-virtual {p0}, Lcom/qihoo/security/appbox/ui/AdMobvistaActActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    const-string/jumbo v1, "com.qihoo.security.lite.ACTION_APPBOX_SHORTCUT"

    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 22
    invoke-virtual {p0}, Lcom/qihoo/security/appbox/ui/AdMobvistaActActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/qihoo/security/appbox/ui/AdMobvistaActActivity;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 24
    :cond_0
    invoke-super {p0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->finish()V

    .line 25
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 13
    invoke-super {p0, p1}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->onCreate(Landroid/os/Bundle;)V

    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/service/d;->a(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 16
    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    .line 29
    invoke-super {p0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->onDestroy()V

    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/service/d;->b(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 31
    return-void
.end method
