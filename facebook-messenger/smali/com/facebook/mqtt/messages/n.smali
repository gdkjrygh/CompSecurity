.class public Lcom/facebook/mqtt/messages/n;
.super Lcom/facebook/mqtt/messages/l;
.source "PublishMqttMessage.java"


# direct methods
.method public constructor <init>(Lcom/facebook/mqtt/messages/h;Lcom/facebook/mqtt/messages/o;[B)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/mqtt/messages/l;-><init>(Lcom/facebook/mqtt/messages/h;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 14
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/mqtt/messages/o;
    .locals 1

    .prologue
    .line 18
    invoke-super {p0}, Lcom/facebook/mqtt/messages/l;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/mqtt/messages/o;

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 8
    invoke-virtual {p0}, Lcom/facebook/mqtt/messages/n;->a()Lcom/facebook/mqtt/messages/o;

    move-result-object v0

    return-object v0
.end method

.method public c()[B
    .locals 1

    .prologue
    .line 23
    invoke-super {p0}, Lcom/facebook/mqtt/messages/l;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    check-cast v0, [B

    return-object v0
.end method

.method public synthetic d()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 8
    invoke-virtual {p0}, Lcom/facebook/mqtt/messages/n;->c()[B

    move-result-object v0

    return-object v0
.end method
