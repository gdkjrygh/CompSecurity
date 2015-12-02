.class public Lcom/facebook/mqtt/messages/l;
.super Ljava/lang/Object;
.source "MqttMessage.java"


# instance fields
.field private final a:Lcom/facebook/mqtt/messages/h;

.field private final b:Ljava/lang/Object;

.field private final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/facebook/mqtt/messages/h;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/facebook/mqtt/messages/l;->a:Lcom/facebook/mqtt/messages/h;

    .line 17
    iput-object p2, p0, Lcom/facebook/mqtt/messages/l;->b:Ljava/lang/Object;

    .line 18
    iput-object p3, p0, Lcom/facebook/mqtt/messages/l;->c:Ljava/lang/Object;

    .line 19
    return-void
.end method


# virtual methods
.method public b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/facebook/mqtt/messages/l;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public d()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/facebook/mqtt/messages/l;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public e()Lcom/facebook/mqtt/messages/k;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/facebook/mqtt/messages/l;->a:Lcom/facebook/mqtt/messages/h;

    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/h;->a()Lcom/facebook/mqtt/messages/k;

    move-result-object v0

    return-object v0
.end method

.method public f()Lcom/facebook/mqtt/messages/h;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/facebook/mqtt/messages/l;->a:Lcom/facebook/mqtt/messages/h;

    return-object v0
.end method
