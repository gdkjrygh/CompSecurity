.class public Lcom/facebook/mqtt/messages/p;
.super Lcom/facebook/mqtt/messages/l;
.source "SubAckMqttMessage.java"


# direct methods
.method public constructor <init>(Lcom/facebook/mqtt/messages/h;Lcom/facebook/mqtt/messages/j;Lcom/facebook/mqtt/messages/q;)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/mqtt/messages/l;-><init>(Lcom/facebook/mqtt/messages/h;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 14
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/mqtt/messages/j;
    .locals 1

    .prologue
    .line 18
    invoke-super {p0}, Lcom/facebook/mqtt/messages/l;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/mqtt/messages/j;

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 8
    invoke-virtual {p0}, Lcom/facebook/mqtt/messages/p;->a()Lcom/facebook/mqtt/messages/j;

    move-result-object v0

    return-object v0
.end method

.method public c()Lcom/facebook/mqtt/messages/q;
    .locals 1

    .prologue
    .line 23
    invoke-super {p0}, Lcom/facebook/mqtt/messages/l;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/mqtt/messages/q;

    return-object v0
.end method

.method public synthetic d()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 8
    invoke-virtual {p0}, Lcom/facebook/mqtt/messages/p;->c()Lcom/facebook/mqtt/messages/q;

    move-result-object v0

    return-object v0
.end method
