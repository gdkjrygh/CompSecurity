.class Lcom/facebook/common/hardware/r;
.super Landroid/content/BroadcastReceiver;
.source "ScreenPowerState.java"


# instance fields
.field final synthetic a:Lcom/facebook/common/hardware/q;


# direct methods
.method constructor <init>(Lcom/facebook/common/hardware/q;)V
    .locals 0

    .prologue
    .line 43
    iput-object p1, p0, Lcom/facebook/common/hardware/r;->a:Lcom/facebook/common/hardware/q;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 46
    iget-object v0, p0, Lcom/facebook/common/hardware/r;->a:Lcom/facebook/common/hardware/q;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/common/hardware/q;->a(Lcom/facebook/common/hardware/q;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 47
    iget-object v0, p0, Lcom/facebook/common/hardware/r;->a:Lcom/facebook/common/hardware/q;

    invoke-static {v0}, Lcom/facebook/common/hardware/q;->a(Lcom/facebook/common/hardware/q;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/hardware/t;

    .line 48
    invoke-interface {v0}, Lcom/facebook/common/hardware/t;->a()V

    goto :goto_0

    .line 50
    :cond_0
    return-void
.end method
