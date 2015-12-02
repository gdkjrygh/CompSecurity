.class Lcom/facebook/mqtt/e;
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
    .line 267
    iput-object p1, p0, Lcom/facebook/mqtt/e;->c:Lcom/facebook/mqtt/b;

    iput-object p2, p0, Lcom/facebook/mqtt/e;->a:Ljava/util/List;

    iput p3, p0, Lcom/facebook/mqtt/e;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 270
    iget-object v0, p0, Lcom/facebook/mqtt/e;->c:Lcom/facebook/mqtt/b;

    iget-object v1, p0, Lcom/facebook/mqtt/e;->a:Ljava/util/List;

    iget v2, p0, Lcom/facebook/mqtt/e;->b:I

    invoke-static {v0, v1, v2}, Lcom/facebook/mqtt/b;->b(Lcom/facebook/mqtt/b;Ljava/util/List;I)V

    .line 271
    return-void
.end method
