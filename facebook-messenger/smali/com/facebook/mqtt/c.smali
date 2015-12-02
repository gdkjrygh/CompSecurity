.class Lcom/facebook/mqtt/c;
.super Ljava/lang/Object;
.source "MqttClient.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/mqtt/b;


# direct methods
.method constructor <init>(Lcom/facebook/mqtt/b;)V
    .locals 0

    .prologue
    .line 223
    iput-object p1, p0, Lcom/facebook/mqtt/c;->a:Lcom/facebook/mqtt/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 226
    iget-object v0, p0, Lcom/facebook/mqtt/c;->a:Lcom/facebook/mqtt/b;

    invoke-static {v0}, Lcom/facebook/mqtt/b;->a(Lcom/facebook/mqtt/b;)V

    .line 227
    return-void
.end method
