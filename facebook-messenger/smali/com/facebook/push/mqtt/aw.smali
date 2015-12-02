.class public Lcom/facebook/push/mqtt/aw;
.super Ljava/lang/Object;
.source "MqttPushManager.java"

# interfaces
.implements Lcom/facebook/push/f;


# instance fields
.field private final a:Lcom/facebook/push/mqtt/ca;


# direct methods
.method public constructor <init>(Lcom/facebook/push/mqtt/ca;)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/facebook/push/mqtt/aw;->a:Lcom/facebook/push/mqtt/ca;

    .line 17
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 26
    iget-object v0, p0, Lcom/facebook/push/mqtt/aw;->a:Lcom/facebook/push/mqtt/ca;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/push/mqtt/ca;->a(Z)V

    .line 27
    return-void
.end method

.method public b()V
    .locals 0

    .prologue
    .line 31
    invoke-virtual {p0}, Lcom/facebook/push/mqtt/aw;->a()V

    .line 32
    return-void
.end method

.method public c()V
    .locals 2

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/push/mqtt/aw;->a:Lcom/facebook/push/mqtt/ca;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/push/mqtt/ca;->a(Z)V

    .line 37
    return-void
.end method
