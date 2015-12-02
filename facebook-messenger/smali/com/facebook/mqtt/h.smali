.class Lcom/facebook/mqtt/h;
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
    .line 318
    iput-object p1, p0, Lcom/facebook/mqtt/h;->a:Lcom/facebook/mqtt/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 321
    iget-object v0, p0, Lcom/facebook/mqtt/h;->a:Lcom/facebook/mqtt/b;

    sget-object v1, Lcom/facebook/mqtt/m;->DISCONNECT:Lcom/facebook/mqtt/m;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/facebook/mqtt/b;->a(Lcom/facebook/mqtt/b;Lcom/facebook/mqtt/m;Ljava/lang/Throwable;)V

    .line 322
    return-void
.end method
