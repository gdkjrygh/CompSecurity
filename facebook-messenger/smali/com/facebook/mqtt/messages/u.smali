.class public Lcom/facebook/mqtt/messages/u;
.super Lcom/facebook/mqtt/messages/l;
.source "UnsubAckMqttMessage.java"


# direct methods
.method public constructor <init>(Lcom/facebook/mqtt/messages/h;Lcom/facebook/mqtt/messages/j;)V
    .locals 1

    .prologue
    .line 11
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/mqtt/messages/l;-><init>(Lcom/facebook/mqtt/messages/h;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 12
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/mqtt/messages/j;
    .locals 1

    .prologue
    .line 16
    invoke-super {p0}, Lcom/facebook/mqtt/messages/l;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/mqtt/messages/j;

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 8
    invoke-virtual {p0}, Lcom/facebook/mqtt/messages/u;->a()Lcom/facebook/mqtt/messages/j;

    move-result-object v0

    return-object v0
.end method
