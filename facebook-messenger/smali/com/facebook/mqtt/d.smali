.class Lcom/facebook/mqtt/d;
.super Ljava/lang/Object;
.source "MqttClient.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:I

.field final synthetic c:Lcom/facebook/mqtt/b;


# direct methods
.method constructor <init>(Lcom/facebook/mqtt/b;Ljava/util/List;I)V
    .locals 0

    .prologue
    .line 250
    iput-object p1, p0, Lcom/facebook/mqtt/d;->c:Lcom/facebook/mqtt/b;

    iput-object p2, p0, Lcom/facebook/mqtt/d;->a:Ljava/util/List;

    iput p3, p0, Lcom/facebook/mqtt/d;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 253
    iget-object v0, p0, Lcom/facebook/mqtt/d;->c:Lcom/facebook/mqtt/b;

    iget-object v1, p0, Lcom/facebook/mqtt/d;->a:Ljava/util/List;

    iget v2, p0, Lcom/facebook/mqtt/d;->b:I

    invoke-static {v0, v1, v2}, Lcom/facebook/mqtt/b;->a(Lcom/facebook/mqtt/b;Ljava/util/List;I)V

    .line 254
    return-void
.end method
