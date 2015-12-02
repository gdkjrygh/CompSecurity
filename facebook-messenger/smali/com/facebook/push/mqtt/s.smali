.class public Lcom/facebook/push/mqtt/s;
.super Landroid/content/BroadcastReceiver;
.source "MqttBroadcastReceiver.java"

# interfaces
.implements Lcom/facebook/base/c;


# instance fields
.field private final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/facebook/push/mqtt/s;->a:Landroid/content/Context;

    .line 25
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 29
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "com.facebook.push.mqtt.ACTION_MQTT_PUBLISH_ARRIVED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 30
    iget-object v1, p0, Lcom/facebook/push/mqtt/s;->a:Landroid/content/Context;

    invoke-static {v1}, Landroid/support/v4/a/e;->a(Landroid/content/Context;)Landroid/support/v4/a/e;

    move-result-object v1

    invoke-virtual {v1, p0, v0}, Landroid/support/v4/a/e;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 31
    return-void
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 36
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.facebook.push.mqtt.ACTION_MQTT_PUBLISH_ARRIVED"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 37
    invoke-static {p1, p2}, Lcom/facebook/push/mqtt/MqttReceiver;->a(Landroid/content/Context;Landroid/content/Intent;)V

    .line 39
    :cond_0
    return-void
.end method
