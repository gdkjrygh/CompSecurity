.class Lcom/facebook/push/mqtt/aj;
.super Ljava/lang/Object;
.source "MqttForegroundStateSender.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/push/mqtt/ai;


# direct methods
.method constructor <init>(Lcom/facebook/push/mqtt/ai;)V
    .locals 0

    .prologue
    .line 65
    iput-object p1, p0, Lcom/facebook/push/mqtt/aj;->a:Lcom/facebook/push/mqtt/ai;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 68
    iget-object v0, p0, Lcom/facebook/push/mqtt/aj;->a:Lcom/facebook/push/mqtt/ai;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/push/mqtt/ai;->a(Lcom/facebook/push/mqtt/ai;Z)Z

    .line 69
    iget-object v0, p0, Lcom/facebook/push/mqtt/aj;->a:Lcom/facebook/push/mqtt/ai;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/ai;->b()V

    .line 70
    return-void
.end method
