.class Lcom/facebook/push/mqtt/aa;
.super Ljava/lang/Object;
.source "MqttConnectionManager.java"

# interfaces
.implements Lcom/facebook/mqtt/o;


# instance fields
.field final synthetic a:Lcom/facebook/push/mqtt/v;

.field private final b:Lcom/facebook/mqtt/b;


# direct methods
.method public constructor <init>(Lcom/facebook/push/mqtt/v;Lcom/facebook/mqtt/b;)V
    .locals 0

    .prologue
    .line 664
    iput-object p1, p0, Lcom/facebook/push/mqtt/aa;->a:Lcom/facebook/push/mqtt/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 665
    iput-object p2, p0, Lcom/facebook/push/mqtt/aa;->b:Lcom/facebook/mqtt/b;

    .line 666
    return-void
.end method

.method static synthetic a(Lcom/facebook/push/mqtt/aa;)Lcom/facebook/mqtt/b;
    .locals 1

    .prologue
    .line 660
    iget-object v0, p0, Lcom/facebook/push/mqtt/aa;->b:Lcom/facebook/mqtt/b;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 670
    invoke-static {}, Lcom/facebook/push/mqtt/v;->i()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "connectionEstablished"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 672
    iget-object v0, p0, Lcom/facebook/push/mqtt/aa;->a:Lcom/facebook/push/mqtt/v;

    invoke-static {v0}, Lcom/facebook/push/mqtt/v;->e(Lcom/facebook/push/mqtt/v;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/facebook/push/mqtt/ab;

    invoke-direct {v1, p0}, Lcom/facebook/push/mqtt/ab;-><init>(Lcom/facebook/push/mqtt/aa;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 686
    return-void
.end method

.method public a(I)V
    .locals 0

    .prologue
    .line 725
    return-void
.end method

.method public a(Lcom/facebook/mqtt/a;)V
    .locals 2

    .prologue
    .line 690
    invoke-static {}, Lcom/facebook/push/mqtt/v;->i()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "connectionFailed"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 691
    iget-object v0, p0, Lcom/facebook/push/mqtt/aa;->a:Lcom/facebook/push/mqtt/v;

    invoke-static {v0}, Lcom/facebook/push/mqtt/v;->e(Lcom/facebook/push/mqtt/v;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/facebook/push/mqtt/ac;

    invoke-direct {v1, p0}, Lcom/facebook/push/mqtt/ac;-><init>(Lcom/facebook/push/mqtt/aa;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 699
    return-void
.end method

.method public a(Lcom/facebook/mqtt/messages/l;)V
    .locals 5

    .prologue
    .line 741
    invoke-static {}, Lcom/facebook/push/mqtt/v;->i()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "messageReceived %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/l;->e()Lcom/facebook/mqtt/messages/k;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/mqtt/messages/k;->toInt()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 742
    iget-object v0, p0, Lcom/facebook/push/mqtt/aa;->a:Lcom/facebook/push/mqtt/v;

    invoke-static {v0}, Lcom/facebook/push/mqtt/v;->e(Lcom/facebook/push/mqtt/v;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/facebook/push/mqtt/af;

    invoke-direct {v1, p0, p1}, Lcom/facebook/push/mqtt/af;-><init>(Lcom/facebook/push/mqtt/aa;Lcom/facebook/mqtt/messages/l;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 750
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 703
    invoke-static {}, Lcom/facebook/push/mqtt/v;->i()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "connectionLost"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 705
    iget-object v0, p0, Lcom/facebook/push/mqtt/aa;->a:Lcom/facebook/push/mqtt/v;

    invoke-static {v0}, Lcom/facebook/push/mqtt/v;->e(Lcom/facebook/push/mqtt/v;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/facebook/push/mqtt/ad;

    invoke-direct {v1, p0, p1}, Lcom/facebook/push/mqtt/ad;-><init>(Lcom/facebook/push/mqtt/aa;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 713
    return-void
.end method

.method public a(Ljava/lang/String;[BIZ)V
    .locals 1

    .prologue
    .line 720
    iget-object v0, p0, Lcom/facebook/push/mqtt/aa;->a:Lcom/facebook/push/mqtt/v;

    invoke-static {v0}, Lcom/facebook/push/mqtt/v;->f(Lcom/facebook/push/mqtt/v;)Lcom/facebook/push/mqtt/MqttPushService;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/facebook/push/mqtt/MqttPushService;->a(Ljava/lang/String;[B)V

    .line 721
    return-void
.end method

.method public b(I)V
    .locals 2

    .prologue
    .line 729
    iget-object v0, p0, Lcom/facebook/push/mqtt/aa;->a:Lcom/facebook/push/mqtt/v;

    invoke-static {v0}, Lcom/facebook/push/mqtt/v;->e(Lcom/facebook/push/mqtt/v;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/facebook/push/mqtt/ae;

    invoke-direct {v1, p0, p1}, Lcom/facebook/push/mqtt/ae;-><init>(Lcom/facebook/push/mqtt/aa;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 737
    return-void
.end method
