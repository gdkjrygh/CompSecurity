.class Lcom/facebook/orca/notify/ba;
.super Lcom/facebook/base/broadcast/q;
.source "OrcaNotificationManager.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/notify/av;


# direct methods
.method constructor <init>(Lcom/facebook/orca/notify/av;Landroid/content/Context;Landroid/content/IntentFilter;)V
    .locals 0

    .prologue
    .line 145
    iput-object p1, p0, Lcom/facebook/orca/notify/ba;->a:Lcom/facebook/orca/notify/av;

    invoke-direct {p0, p2, p3}, Lcom/facebook/base/broadcast/q;-><init>(Landroid/content/Context;Landroid/content/IntentFilter;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 148
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 149
    const-string v1, "com.facebook.orca.login.AuthStateMachineMonitor.LOGIN_COMPLETE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 150
    iget-object v0, p0, Lcom/facebook/orca/notify/ba;->a:Lcom/facebook/orca/notify/av;

    invoke-static {v0}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/orca/notify/av;)V

    .line 152
    :cond_0
    return-void
.end method
