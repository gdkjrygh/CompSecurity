.class Lcom/facebook/push/mqtt/ce;
.super Lcom/facebook/base/broadcast/q;
.source "MqttPushServiceManager.java"


# instance fields
.field final synthetic a:Lcom/google/common/a/fi;

.field final synthetic b:Lcom/facebook/push/mqtt/ca;


# direct methods
.method constructor <init>(Lcom/facebook/push/mqtt/ca;Landroid/content/Context;Landroid/content/IntentFilter;Lcom/google/common/a/fi;)V
    .locals 0

    .prologue
    .line 164
    iput-object p1, p0, Lcom/facebook/push/mqtt/ce;->b:Lcom/facebook/push/mqtt/ca;

    iput-object p4, p0, Lcom/facebook/push/mqtt/ce;->a:Lcom/google/common/a/fi;

    invoke-direct {p0, p2, p3}, Lcom/facebook/base/broadcast/q;-><init>(Landroid/content/Context;Landroid/content/IntentFilter;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 167
    sget-object v0, Lcom/facebook/push/mqtt/ca;->a:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 168
    iget-object v0, p0, Lcom/facebook/push/mqtt/ce;->b:Lcom/facebook/push/mqtt/ca;

    invoke-static {v0}, Lcom/facebook/push/mqtt/ca;->c(Lcom/facebook/push/mqtt/ca;)V

    .line 177
    :cond_0
    :goto_0
    return-void

    .line 169
    :cond_1
    iget-object v0, p0, Lcom/facebook/push/mqtt/ce;->a:Lcom/google/common/a/fi;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/common/a/fi;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 170
    iget-object v0, p0, Lcom/facebook/push/mqtt/ce;->b:Lcom/facebook/push/mqtt/ca;

    invoke-static {v0}, Lcom/facebook/push/mqtt/ca;->a(Lcom/facebook/push/mqtt/ca;)V

    goto :goto_0

    .line 171
    :cond_2
    const-string v0, "com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 173
    const-string v0, "event"

    const/4 v1, -0x1

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Lcom/facebook/push/mqtt/cj;->fromValue(I)Lcom/facebook/push/mqtt/cj;

    move-result-object v0

    .line 175
    iget-object v1, p0, Lcom/facebook/push/mqtt/ce;->b:Lcom/facebook/push/mqtt/ca;

    invoke-static {v1, v0}, Lcom/facebook/push/mqtt/ca;->a(Lcom/facebook/push/mqtt/ca;Lcom/facebook/push/mqtt/cj;)V

    goto :goto_0
.end method
