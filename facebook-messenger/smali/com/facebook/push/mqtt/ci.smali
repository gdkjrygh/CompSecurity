.class public Lcom/facebook/push/mqtt/ci;
.super Ljava/lang/Object;
.source "PushStateBroadcaster.java"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/facebook/c/j;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/c/j;)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Lcom/facebook/push/mqtt/ci;->a:Landroid/content/Context;

    .line 53
    iput-object p2, p0, Lcom/facebook/push/mqtt/ci;->b:Lcom/facebook/c/j;

    .line 54
    return-void
.end method

.method private a(Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 87
    iget-object v0, p0, Lcom/facebook/push/mqtt/ci;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/a/e;->a(Landroid/content/Context;)Landroid/support/v4/a/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v4/a/e;->a(Landroid/content/Intent;)Z

    .line 90
    iget-object v0, p0, Lcom/facebook/push/mqtt/ci;->b:Lcom/facebook/c/j;

    iget-object v1, p0, Lcom/facebook/push/mqtt/ci;->a:Landroid/content/Context;

    invoke-virtual {v0, p1, v1}, Lcom/facebook/c/j;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 91
    return-void
.end method


# virtual methods
.method a(Lcom/facebook/push/mqtt/cj;)V
    .locals 3

    .prologue
    .line 62
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 63
    const-string v1, "event"

    invoke-virtual {p1}, Lcom/facebook/push/mqtt/cj;->toValue()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 64
    invoke-direct {p0, v0}, Lcom/facebook/push/mqtt/ci;->a(Landroid/content/Intent;)V

    .line 65
    return-void
.end method

.method public a(Ljava/lang/String;[B)V
    .locals 2

    .prologue
    .line 74
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.facebook.push.mqtt.ACTION_MQTT_PUBLISH_ARRIVED"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 75
    const-string v1, "topic_name"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 76
    const-string v1, "payload"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    .line 77
    invoke-direct {p0, v0}, Lcom/facebook/push/mqtt/ci;->a(Landroid/content/Intent;)V

    .line 78
    return-void
.end method
