.class Lcom/facebook/mqtt/i;
.super Ljava/lang/Object;
.source "MqttClient.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/facebook/mqtt/b;


# direct methods
.method constructor <init>(Lcom/facebook/mqtt/b;I)V
    .locals 0

    .prologue
    .line 770
    iput-object p1, p0, Lcom/facebook/mqtt/i;->b:Lcom/facebook/mqtt/b;

    iput p2, p0, Lcom/facebook/mqtt/i;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 773
    iget-object v0, p0, Lcom/facebook/mqtt/i;->b:Lcom/facebook/mqtt/b;

    iget v1, p0, Lcom/facebook/mqtt/i;->a:I

    invoke-static {v0, v1}, Lcom/facebook/mqtt/b;->a(Lcom/facebook/mqtt/b;I)V

    .line 774
    return-void
.end method
