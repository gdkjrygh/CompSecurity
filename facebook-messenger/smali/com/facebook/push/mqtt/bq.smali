.class Lcom/facebook/push/mqtt/bq;
.super Landroid/content/BroadcastReceiver;
.source "MqttPushService.java"


# instance fields
.field final synthetic a:Lcom/facebook/push/mqtt/MqttPushService;


# direct methods
.method constructor <init>(Lcom/facebook/push/mqtt/MqttPushService;)V
    .locals 0

    .prologue
    .line 176
    iput-object p1, p0, Lcom/facebook/push/mqtt/bq;->a:Lcom/facebook/push/mqtt/MqttPushService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 179
    iget-object v0, p0, Lcom/facebook/push/mqtt/bq;->a:Lcom/facebook/push/mqtt/MqttPushService;

    invoke-static {v0, p2}, Lcom/facebook/push/mqtt/MqttPushService;->a(Lcom/facebook/push/mqtt/MqttPushService;Landroid/content/Intent;)V

    .line 180
    return-void
.end method
