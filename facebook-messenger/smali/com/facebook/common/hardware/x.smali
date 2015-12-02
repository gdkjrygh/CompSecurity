.class Lcom/facebook/common/hardware/x;
.super Landroid/content/BroadcastReceiver;
.source "SystemBatteryStateManager.java"


# instance fields
.field final synthetic a:Lcom/facebook/common/hardware/u;


# direct methods
.method constructor <init>(Lcom/facebook/common/hardware/u;)V
    .locals 0

    .prologue
    .line 50
    iput-object p1, p0, Lcom/facebook/common/hardware/x;->a:Lcom/facebook/common/hardware/u;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 53
    iget-object v0, p0, Lcom/facebook/common/hardware/x;->a:Lcom/facebook/common/hardware/u;

    invoke-static {v0}, Lcom/facebook/common/hardware/u;->a(Lcom/facebook/common/hardware/u;)Ljava/util/Map;

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

    check-cast v0, Lcom/facebook/common/hardware/b;

    .line 54
    invoke-interface {v0}, Lcom/facebook/common/hardware/b;->c()V

    goto :goto_0

    .line 56
    :cond_0
    return-void
.end method
