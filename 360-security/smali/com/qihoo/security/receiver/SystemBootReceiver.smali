.class public Lcom/qihoo/security/receiver/SystemBootReceiver;
.super Lcom/qihoo/security/receiver/BootReceiver;
.source "360Security"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Lcom/qihoo/security/receiver/BootReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 19
    invoke-super {p0, p1, p2}, Lcom/qihoo/security/receiver/BootReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    .line 20
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 24
    const-string/jumbo v1, "android.intent.action.BOOT_COMPLETED"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 28
    invoke-static {p1}, Lcom/qihoo/security/app/DaemonMain;->a(Landroid/content/Context;)V

    .line 29
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

    .line 31
    sget-boolean v0, Lcom/qihoo/security/service/SecurityService;->a:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 32
    invoke-static {p1}, Lcom/qihoo360/mobilesafe/b/a;->g(Landroid/content/Context;)V

    .line 36
    :cond_0
    return-void
.end method
