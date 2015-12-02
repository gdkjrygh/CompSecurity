.class public abstract Lcom/qihoo/security/receiver/BootReceiver;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 23
    if-nez p2, :cond_1

    .line 50
    :cond_0
    :goto_0
    return-void

    .line 38
    :cond_1
    const-string/jumbo v0, "setting_auto_start"

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string/jumbo v0, "license"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 40
    sget-boolean v0, Lcom/qihoo/security/service/SecurityService;->a:Z

    if-nez v0, :cond_0

    .line 41
    invoke-static {p1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 42
    invoke-static {}, Lcom/qihoo/security/v5/UpdateService;->a()V

    goto :goto_0

    .line 45
    :cond_2
    invoke-static {p1}, Lcom/qihoo360/mobilesafe/b/a;->f(Landroid/content/Context;)V

    goto :goto_0
.end method
