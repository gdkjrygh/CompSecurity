.class Lcom/facebook/push/mqtt/w;
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
    .line 88
    iput-object p1, p0, Lcom/facebook/push/mqtt/w;->a:Lcom/facebook/push/mqtt/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/facebook/push/mqtt/w;->a:Lcom/facebook/push/mqtt/v;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/v;->a()V

    .line 92
    return-void
.end method
