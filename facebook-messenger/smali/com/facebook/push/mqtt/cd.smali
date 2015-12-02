.class Lcom/facebook/push/mqtt/cd;
.super Ljava/lang/Object;
.source "MqttPushServiceManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/push/mqtt/ca;


# direct methods
.method constructor <init>(Lcom/facebook/push/mqtt/ca;)V
    .locals 0

    .prologue
    .line 107
    iput-object p1, p0, Lcom/facebook/push/mqtt/cd;->a:Lcom/facebook/push/mqtt/ca;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 110
    iget-object v0, p0, Lcom/facebook/push/mqtt/cd;->a:Lcom/facebook/push/mqtt/ca;

    invoke-static {v0}, Lcom/facebook/push/mqtt/ca;->b(Lcom/facebook/push/mqtt/ca;)V

    .line 111
    return-void
.end method
