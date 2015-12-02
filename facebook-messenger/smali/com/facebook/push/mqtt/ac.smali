.class Lcom/facebook/push/mqtt/ac;
.super Ljava/lang/Object;
.source "MqttConnectionManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/push/mqtt/aa;


# direct methods
.method constructor <init>(Lcom/facebook/push/mqtt/aa;)V
    .locals 0

    .prologue
    .line 691
    iput-object p1, p0, Lcom/facebook/push/mqtt/ac;->a:Lcom/facebook/push/mqtt/aa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 694
    iget-object v0, p0, Lcom/facebook/push/mqtt/ac;->a:Lcom/facebook/push/mqtt/aa;

    iget-object v0, v0, Lcom/facebook/push/mqtt/aa;->a:Lcom/facebook/push/mqtt/v;

    invoke-static {v0}, Lcom/facebook/push/mqtt/v;->b(Lcom/facebook/push/mqtt/v;)Lcom/facebook/mqtt/b;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/push/mqtt/ac;->a:Lcom/facebook/push/mqtt/aa;

    invoke-static {v1}, Lcom/facebook/push/mqtt/aa;->a(Lcom/facebook/push/mqtt/aa;)Lcom/facebook/mqtt/b;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 695
    iget-object v0, p0, Lcom/facebook/push/mqtt/ac;->a:Lcom/facebook/push/mqtt/aa;

    iget-object v0, v0, Lcom/facebook/push/mqtt/aa;->a:Lcom/facebook/push/mqtt/v;

    sget-object v1, Lcom/facebook/push/mqtt/ag;->CONNECT_FAILED:Lcom/facebook/push/mqtt/ag;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/facebook/push/mqtt/v;->a(Lcom/facebook/push/mqtt/v;Lcom/facebook/push/mqtt/ag;Ljava/lang/String;)V

    .line 697
    :cond_0
    return-void
.end method
