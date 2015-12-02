.class Lcom/facebook/base/broadcast/r;
.super Landroid/content/BroadcastReceiver;
.source "SafeLocalBroadcastReceiver.java"


# instance fields
.field final synthetic a:Lcom/facebook/base/broadcast/q;


# direct methods
.method constructor <init>(Lcom/facebook/base/broadcast/q;)V
    .locals 0

    .prologue
    .line 35
    iput-object p1, p0, Lcom/facebook/base/broadcast/r;->a:Lcom/facebook/base/broadcast/q;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 38
    iget-object v0, p0, Lcom/facebook/base/broadcast/r;->a:Lcom/facebook/base/broadcast/q;

    invoke-static {v0}, Lcom/facebook/base/broadcast/q;->a(Lcom/facebook/base/broadcast/q;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 39
    invoke-static {}, Lcom/facebook/base/broadcast/q;->c()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Called onReceive after it was unregistered."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 43
    :goto_0
    return-void

    .line 42
    :cond_0
    iget-object v0, p0, Lcom/facebook/base/broadcast/r;->a:Lcom/facebook/base/broadcast/q;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/base/broadcast/q;->a(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_0
.end method
