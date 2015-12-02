.class public Lcom/facebook/mqtt/messages/a;
.super Lcom/facebook/mqtt/messages/l;
.source "ConnAckMqttMessage.java"


# direct methods
.method public constructor <init>(Lcom/facebook/mqtt/messages/h;Lcom/facebook/mqtt/messages/b;)V
    .locals 1

    .prologue
    .line 18
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/mqtt/messages/l;-><init>(Lcom/facebook/mqtt/messages/h;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 19
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/mqtt/messages/b;
    .locals 1

    .prologue
    .line 23
    invoke-super {p0}, Lcom/facebook/mqtt/messages/l;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/mqtt/messages/b;

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 8
    invoke-virtual {p0}, Lcom/facebook/mqtt/messages/a;->a()Lcom/facebook/mqtt/messages/b;

    move-result-object v0

    return-object v0
.end method
