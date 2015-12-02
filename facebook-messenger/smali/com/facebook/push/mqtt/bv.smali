.class Lcom/facebook/push/mqtt/bv;
.super Lcom/facebook/push/mqtt/k;
.source "MqttPushService.java"


# instance fields
.field final synthetic a:Lcom/facebook/push/mqtt/MqttPushService;


# direct methods
.method private constructor <init>(Lcom/facebook/push/mqtt/MqttPushService;)V
    .locals 0

    .prologue
    .line 482
    iput-object p1, p0, Lcom/facebook/push/mqtt/bv;->a:Lcom/facebook/push/mqtt/MqttPushService;

    invoke-direct {p0}, Lcom/facebook/push/mqtt/k;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/push/mqtt/MqttPushService;Lcom/facebook/push/mqtt/bq;)V
    .locals 0

    .prologue
    .line 482
    invoke-direct {p0, p1}, Lcom/facebook/push/mqtt/bv;-><init>(Lcom/facebook/push/mqtt/MqttPushService;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 3

    .prologue
    .line 501
    invoke-static {p2}, Lcom/facebook/common/w/n;->c(Ljava/lang/String;)[B

    move-result-object v0

    .line 502
    invoke-static {p3}, Lcom/facebook/mqtt/x;->fromInt(I)Lcom/facebook/mqtt/x;

    move-result-object v1

    .line 503
    iget-object v2, p0, Lcom/facebook/push/mqtt/bv;->a:Lcom/facebook/push/mqtt/MqttPushService;

    invoke-static {v2}, Lcom/facebook/push/mqtt/MqttPushService;->b(Lcom/facebook/push/mqtt/MqttPushService;)Lcom/facebook/push/mqtt/v;

    move-result-object v2

    invoke-virtual {v2, p1, v0, v1}, Lcom/facebook/push/mqtt/v;->a(Ljava/lang/String;[BLcom/facebook/mqtt/x;)I

    move-result v0

    return v0
.end method

.method public a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/mqtt/messages/SubscribeTopic;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 519
    iget-object v0, p0, Lcom/facebook/push/mqtt/bv;->a:Lcom/facebook/push/mqtt/MqttPushService;

    invoke-static {v0}, Lcom/facebook/push/mqtt/MqttPushService;->b(Lcom/facebook/push/mqtt/MqttPushService;)Lcom/facebook/push/mqtt/v;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/push/mqtt/v;->a(Ljava/util/Collection;)V

    .line 520
    return-void
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 486
    iget-object v0, p0, Lcom/facebook/push/mqtt/bv;->a:Lcom/facebook/push/mqtt/MqttPushService;

    invoke-static {v0}, Lcom/facebook/push/mqtt/MqttPushService;->b(Lcom/facebook/push/mqtt/MqttPushService;)Lcom/facebook/push/mqtt/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/v;->d()Z

    move-result v0

    return v0
.end method

.method public a(J)Z
    .locals 1

    .prologue
    .line 496
    iget-object v0, p0, Lcom/facebook/push/mqtt/bv;->a:Lcom/facebook/push/mqtt/MqttPushService;

    invoke-static {v0}, Lcom/facebook/push/mqtt/MqttPushService;->b(Lcom/facebook/push/mqtt/MqttPushService;)Lcom/facebook/push/mqtt/v;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/facebook/push/mqtt/v;->a(J)Z

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;J)Z
    .locals 2

    .prologue
    .line 509
    invoke-static {p2}, Lcom/facebook/common/w/n;->c(Ljava/lang/String;)[B

    move-result-object v0

    .line 511
    :try_start_0
    iget-object v1, p0, Lcom/facebook/push/mqtt/bv;->a:Lcom/facebook/push/mqtt/MqttPushService;

    invoke-static {v1}, Lcom/facebook/push/mqtt/MqttPushService;->b(Lcom/facebook/push/mqtt/MqttPushService;)Lcom/facebook/push/mqtt/v;

    move-result-object v1

    invoke-virtual {v1, p1, v0, p3, p4}, Lcom/facebook/push/mqtt/v;->a(Ljava/lang/String;[BJ)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 512
    :catch_0
    move-exception v0

    .line 513
    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public b(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/mqtt/messages/SubscribeTopic;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 524
    iget-object v0, p0, Lcom/facebook/push/mqtt/bv;->a:Lcom/facebook/push/mqtt/MqttPushService;

    invoke-static {v0}, Lcom/facebook/push/mqtt/MqttPushService;->b(Lcom/facebook/push/mqtt/MqttPushService;)Lcom/facebook/push/mqtt/v;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/push/mqtt/v;->b(Ljava/util/Collection;)V

    .line 525
    return-void
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 491
    iget-object v0, p0, Lcom/facebook/push/mqtt/bv;->a:Lcom/facebook/push/mqtt/MqttPushService;

    invoke-static {v0}, Lcom/facebook/push/mqtt/MqttPushService;->b(Lcom/facebook/push/mqtt/MqttPushService;)Lcom/facebook/push/mqtt/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/v;->e()Z

    move-result v0

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 529
    iget-object v0, p0, Lcom/facebook/push/mqtt/bv;->a:Lcom/facebook/push/mqtt/MqttPushService;

    invoke-static {v0}, Lcom/facebook/push/mqtt/MqttPushService;->c(Lcom/facebook/push/mqtt/MqttPushService;)Lcom/facebook/push/mqtt/bu;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/bu;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
