.class Lcom/facebook/push/mqtt/al;
.super Lcom/facebook/base/broadcast/q;
.source "MqttForegroundStateSender.java"


# instance fields
.field final synthetic a:Lcom/facebook/push/mqtt/ai;


# direct methods
.method constructor <init>(Lcom/facebook/push/mqtt/ai;Landroid/content/Context;Landroid/content/IntentFilter;)V
    .locals 0

    .prologue
    .line 106
    iput-object p1, p0, Lcom/facebook/push/mqtt/al;->a:Lcom/facebook/push/mqtt/ai;

    invoke-direct {p0, p2, p3}, Lcom/facebook/base/broadcast/q;-><init>(Landroid/content/Context;Landroid/content/IntentFilter;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 109
    sget-object v0, Lcom/facebook/common/v/a;->a:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/facebook/common/v/d;->a:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 111
    :cond_0
    iget-object v0, p0, Lcom/facebook/push/mqtt/al;->a:Lcom/facebook/push/mqtt/ai;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/ai;->b()V

    .line 113
    :cond_1
    return-void
.end method
