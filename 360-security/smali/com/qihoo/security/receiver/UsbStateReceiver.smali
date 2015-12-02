.class public Lcom/qihoo/security/receiver/UsbStateReceiver;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 28
    const-string/jumbo v0, "android.hardware.usb.action.USB_STATE"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 29
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const-string/jumbo v1, "connected"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 31
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/qihoo/security/opti/b/a;->c(Z)V

    .line 32
    invoke-static {}, Lcom/qihoo/security/opti/b/a;->a()V

    .line 39
    :cond_0
    :goto_0
    return-void

    .line 35
    :cond_1
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/qihoo/security/opti/b/a;->c(Z)V

    .line 36
    invoke-static {}, Lcom/qihoo/security/opti/b/a;->a()V

    goto :goto_0
.end method
