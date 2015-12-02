.class Lcom/facebook/push/mqtt/x;
.super Ljava/lang/Object;
.source "MqttConnectionManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/push/mqtt/v;


# direct methods
.method constructor <init>(Lcom/facebook/push/mqtt/v;)V
    .locals 0

    .prologue
    .line 95
    iput-object p1, p0, Lcom/facebook/push/mqtt/x;->a:Lcom/facebook/push/mqtt/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 98
    invoke-static {}, Lcom/facebook/push/mqtt/v;->i()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "kick runnable"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 99
    iget-object v0, p0, Lcom/facebook/push/mqtt/x;->a:Lcom/facebook/push/mqtt/v;

    invoke-static {v0}, Lcom/facebook/push/mqtt/v;->a(Lcom/facebook/push/mqtt/v;)V

    .line 100
    return-void
.end method
