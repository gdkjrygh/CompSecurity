.class Lcom/facebook/push/mqtt/bs;
.super Ljava/lang/Object;
.source "MqttPushService.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/push/mqtt/MqttPushService;


# direct methods
.method constructor <init>(Lcom/facebook/push/mqtt/MqttPushService;)V
    .locals 0

    .prologue
    .line 316
    iput-object p1, p0, Lcom/facebook/push/mqtt/bs;->a:Lcom/facebook/push/mqtt/MqttPushService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 319
    iget-object v0, p0, Lcom/facebook/push/mqtt/bs;->a:Lcom/facebook/push/mqtt/MqttPushService;

    invoke-static {v0}, Lcom/facebook/push/mqtt/MqttPushService;->a(Lcom/facebook/push/mqtt/MqttPushService;)Z

    .line 320
    return-void
.end method
