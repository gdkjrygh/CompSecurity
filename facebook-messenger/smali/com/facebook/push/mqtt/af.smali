.class Lcom/facebook/push/mqtt/af;
.super Ljava/lang/Object;
.source "MqttConnectionManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/mqtt/messages/l;

.field final synthetic b:Lcom/facebook/push/mqtt/aa;


# direct methods
.method constructor <init>(Lcom/facebook/push/mqtt/aa;Lcom/facebook/mqtt/messages/l;)V
    .locals 0

    .prologue
    .line 742
    iput-object p1, p0, Lcom/facebook/push/mqtt/af;->b:Lcom/facebook/push/mqtt/aa;

    iput-object p2, p0, Lcom/facebook/push/mqtt/af;->a:Lcom/facebook/mqtt/messages/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 745
    iget-object v0, p0, Lcom/facebook/push/mqtt/af;->b:Lcom/facebook/push/mqtt/aa;

    iget-object v0, v0, Lcom/facebook/push/mqtt/aa;->a:Lcom/facebook/push/mqtt/v;

    invoke-static {v0}, Lcom/facebook/push/mqtt/v;->b(Lcom/facebook/push/mqtt/v;)Lcom/facebook/mqtt/b;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/push/mqtt/af;->b:Lcom/facebook/push/mqtt/aa;

    invoke-static {v1}, Lcom/facebook/push/mqtt/aa;->a(Lcom/facebook/push/mqtt/aa;)Lcom/facebook/mqtt/b;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 746
    iget-object v0, p0, Lcom/facebook/push/mqtt/af;->b:Lcom/facebook/push/mqtt/aa;

    iget-object v0, v0, Lcom/facebook/push/mqtt/aa;->a:Lcom/facebook/push/mqtt/v;

    iget-object v1, p0, Lcom/facebook/push/mqtt/af;->a:Lcom/facebook/mqtt/messages/l;

    invoke-static {v0, v1}, Lcom/facebook/push/mqtt/v;->a(Lcom/facebook/push/mqtt/v;Lcom/facebook/mqtt/messages/l;)V

    .line 748
    :cond_0
    return-void
.end method
