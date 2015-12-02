.class public Lcom/facebook/push/mqtt/MqttReceiver;
.super Landroid/app/IntentService;
.source "MqttReceiver.java"


# instance fields
.field private a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/push/mqtt/av;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/facebook/push/mqtt/ch;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 23
    const-string v0, "MqttReceiver"

    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    .line 24
    return-void
.end method

.method static a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 40
    invoke-static {p0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/push/mqtt/ch;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/mqtt/ch;

    .line 42
    iget-object v0, v0, Lcom/facebook/push/mqtt/ch;->a:Lcom/facebook/common/hardware/o;

    invoke-virtual {v0}, Lcom/facebook/common/hardware/o;->a()V

    .line 45
    const-class v0, Lcom/facebook/push/mqtt/MqttReceiver;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 46
    invoke-virtual {p0, p1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 47
    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 2

    .prologue
    .line 28
    invoke-super {p0}, Landroid/app/IntentService;->onCreate()V

    .line 30
    invoke-static {p0}, Lcom/facebook/base/a/g;->a(Landroid/content/Context;)V

    .line 31
    invoke-static {p0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 32
    const-class v0, Lcom/facebook/push/mqtt/ch;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/mqtt/ch;

    iput-object v0, p0, Lcom/facebook/push/mqtt/MqttReceiver;->b:Lcom/facebook/push/mqtt/ch;

    .line 33
    const-class v0, Lcom/facebook/push/mqtt/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/push/mqtt/MqttReceiver;->a:Ljava/util/Set;

    .line 34
    return-void
.end method

.method public final onHandleIntent(Landroid/content/Intent;)V
    .locals 4

    .prologue
    .line 52
    if-eqz p1, :cond_0

    :try_start_0
    const-string v0, "com.facebook.push.mqtt.ACTION_MQTT_PUBLISH_ARRIVED"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 54
    const-string v0, "topic_name"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 55
    const-string v0, "payload"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    move-result-object v2

    .line 56
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttReceiver;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/mqtt/av;

    .line 57
    invoke-interface {v0, v1, v2}, Lcom/facebook/push/mqtt/av;->a(Ljava/lang/String;[B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 67
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/facebook/push/mqtt/MqttReceiver;->b:Lcom/facebook/push/mqtt/ch;

    iget-object v1, v1, Lcom/facebook/push/mqtt/ch;->a:Lcom/facebook/common/hardware/o;

    invoke-virtual {v1}, Lcom/facebook/common/hardware/o;->b()V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/push/mqtt/MqttReceiver;->b:Lcom/facebook/push/mqtt/ch;

    iget-object v0, v0, Lcom/facebook/push/mqtt/ch;->a:Lcom/facebook/common/hardware/o;

    invoke-virtual {v0}, Lcom/facebook/common/hardware/o;->b()V

    .line 69
    return-void
.end method
