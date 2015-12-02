.class Lcom/facebook/push/mqtt/aq;
.super Ljava/lang/Object;
.source "MqttOperationManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/push/mqtt/ao;

.field final synthetic b:Lcom/facebook/push/mqtt/ap;


# direct methods
.method constructor <init>(Lcom/facebook/push/mqtt/ap;Lcom/facebook/push/mqtt/ao;)V
    .locals 0

    .prologue
    .line 88
    iput-object p1, p0, Lcom/facebook/push/mqtt/aq;->b:Lcom/facebook/push/mqtt/ap;

    iput-object p2, p0, Lcom/facebook/push/mqtt/aq;->a:Lcom/facebook/push/mqtt/ao;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 91
    iget-object v0, p0, Lcom/facebook/push/mqtt/aq;->b:Lcom/facebook/push/mqtt/ap;

    iget-object v1, p0, Lcom/facebook/push/mqtt/aq;->a:Lcom/facebook/push/mqtt/ao;

    invoke-static {v0, v1}, Lcom/facebook/push/mqtt/ap;->a(Lcom/facebook/push/mqtt/ap;Lcom/facebook/push/mqtt/ao;)V

    .line 92
    return-void
.end method
