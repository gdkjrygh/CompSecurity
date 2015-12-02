.class Lcom/facebook/orca/chatheads/r;
.super Lcom/facebook/base/broadcast/q;
.source "ChatHeadService.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/ChatHeadService;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/ChatHeadService;Landroid/content/Context;Landroid/content/IntentFilter;)V
    .locals 0

    .prologue
    .line 207
    iput-object p1, p0, Lcom/facebook/orca/chatheads/r;->a:Lcom/facebook/orca/chatheads/ChatHeadService;

    invoke-direct {p0, p2, p3}, Lcom/facebook/base/broadcast/q;-><init>(Landroid/content/Context;Landroid/content/IntentFilter;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 210
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 211
    const-string v1, "com.facebook.orca.login.AuthStateMachineMonitor.LOGOUT_COMPLETE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 212
    iget-object v0, p0, Lcom/facebook/orca/chatheads/r;->a:Lcom/facebook/orca/chatheads/ChatHeadService;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ChatHeadService;->e(Lcom/facebook/orca/chatheads/ChatHeadService;)V

    .line 214
    :cond_0
    return-void
.end method
