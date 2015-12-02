.class public Lcom/facebook/mqtt/messages/c;
.super Lcom/facebook/mqtt/messages/l;
.source "ConnectMqttMessage.java"


# direct methods
.method public constructor <init>(Lcom/facebook/mqtt/messages/h;Lcom/facebook/mqtt/messages/f;Lcom/facebook/mqtt/messages/d;)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/mqtt/messages/l;-><init>(Lcom/facebook/mqtt/messages/h;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 14
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/mqtt/messages/f;
    .locals 1

    .prologue
    .line 18
    invoke-super {p0}, Lcom/facebook/mqtt/messages/l;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/mqtt/messages/f;

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 8
    invoke-virtual {p0}, Lcom/facebook/mqtt/messages/c;->a()Lcom/facebook/mqtt/messages/f;

    move-result-object v0

    return-object v0
.end method

.method public c()Lcom/facebook/mqtt/messages/d;
    .locals 1

    .prologue
    .line 23
    invoke-super {p0}, Lcom/facebook/mqtt/messages/l;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/mqtt/messages/d;

    return-object v0
.end method

.method public synthetic d()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 8
    invoke-virtual {p0}, Lcom/facebook/mqtt/messages/c;->c()Lcom/facebook/mqtt/messages/d;

    move-result-object v0

    return-object v0
.end method
