.class Lcom/facebook/base/broadcast/p;
.super Landroid/content/BroadcastReceiver;
.source "SafeBroadcastReceiver.java"


# instance fields
.field final synthetic a:Lcom/facebook/base/broadcast/o;


# direct methods
.method constructor <init>(Lcom/facebook/base/broadcast/o;)V
    .locals 0

    .prologue
    .line 33
    iput-object p1, p0, Lcom/facebook/base/broadcast/p;->a:Lcom/facebook/base/broadcast/o;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/base/broadcast/p;->a:Lcom/facebook/base/broadcast/o;

    invoke-static {v0}, Lcom/facebook/base/broadcast/o;->a(Lcom/facebook/base/broadcast/o;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 37
    invoke-static {}, Lcom/facebook/base/broadcast/o;->b()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Called onReceive after it was unregistered."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 41
    :goto_0
    return-void

    .line 40
    :cond_0
    iget-object v0, p0, Lcom/facebook/base/broadcast/p;->a:Lcom/facebook/base/broadcast/o;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/base/broadcast/o;->a(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_0
.end method
