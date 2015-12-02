.class Lcom/facebook/orca/common/ui/titlebar/q;
.super Lcom/facebook/base/broadcast/q;
.source "TitleBar.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/common/ui/titlebar/TitleBar;


# direct methods
.method constructor <init>(Lcom/facebook/orca/common/ui/titlebar/TitleBar;Landroid/content/Context;Landroid/content/IntentFilter;)V
    .locals 0

    .prologue
    .line 148
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/q;->a:Lcom/facebook/orca/common/ui/titlebar/TitleBar;

    invoke-direct {p0, p2, p3}, Lcom/facebook/base/broadcast/q;-><init>(Landroid/content/Context;Landroid/content/IntentFilter;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 151
    const-string v0, "com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 152
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/q;->a:Lcom/facebook/orca/common/ui/titlebar/TitleBar;

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->invalidate()V

    .line 161
    :cond_0
    :goto_0
    return-void

    .line 153
    :cond_1
    const-string v0, "com.facebook.mqtt.ACTION_MQTT_CONFIG_CHANGED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "com.facebook.orca.login.AuthStateMachineMonitor.LOGIN_COMPLETE"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "com.facebook.orca.login.AuthStateMachineMonitor.LOGOUT_COMPLETE"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 157
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/q;->a:Lcom/facebook/orca/common/ui/titlebar/TitleBar;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->a(Lcom/facebook/orca/common/ui/titlebar/TitleBar;)V

    goto :goto_0

    .line 158
    :cond_3
    const-string v0, "com.facebook.orca.fbwebrtc.CALL_STATUS_AND_DURATION_UPDATE"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 159
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/q;->a:Lcom/facebook/orca/common/ui/titlebar/TitleBar;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->b(Lcom/facebook/orca/common/ui/titlebar/TitleBar;)V

    goto :goto_0
.end method
