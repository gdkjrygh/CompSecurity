.class Lcom/facebook/push/mqtt/bf;
.super Lcom/facebook/inject/d;
.source "MqttPushModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/push/mqtt/v;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/push/mqtt/ax;


# direct methods
.method private constructor <init>(Lcom/facebook/push/mqtt/ax;)V
    .locals 0

    .prologue
    .line 172
    iput-object p1, p0, Lcom/facebook/push/mqtt/bf;->a:Lcom/facebook/push/mqtt/ax;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/push/mqtt/ax;Lcom/facebook/push/mqtt/ay;)V
    .locals 0

    .prologue
    .line 172
    invoke-direct {p0, p1}, Lcom/facebook/push/mqtt/bf;-><init>(Lcom/facebook/push/mqtt/ax;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/push/mqtt/v;
    .locals 8

    .prologue
    .line 176
    new-instance v0, Lcom/facebook/push/mqtt/v;

    const-class v1, Lcom/facebook/analytics/a;

    invoke-virtual {p0, v1}, Lcom/facebook/push/mqtt/bf;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/analytics/a;

    const-class v2, Lcom/facebook/push/mqtt/u;

    invoke-virtual {p0, v2}, Lcom/facebook/push/mqtt/bf;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/push/mqtt/u;

    const-class v3, Lcom/facebook/push/mqtt/d;

    invoke-virtual {p0, v3}, Lcom/facebook/push/mqtt/bf;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/push/mqtt/d;

    const-class v4, Lcom/facebook/push/mqtt/ap;

    invoke-virtual {p0, v4}, Lcom/facebook/push/mqtt/bf;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/push/mqtt/ap;

    const-class v5, Lcom/facebook/push/mqtt/abtest/a;

    invoke-virtual {p0, v5}, Lcom/facebook/push/mqtt/bf;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/push/mqtt/abtest/a;

    const-class v6, Lcom/facebook/analytics/cj;

    invoke-virtual {p0, v6}, Lcom/facebook/push/mqtt/bf;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/analytics/cj;

    const-class v7, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v7}, Lcom/facebook/push/mqtt/bf;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/common/time/a;

    invoke-direct/range {v0 .. v7}, Lcom/facebook/push/mqtt/v;-><init>(Lcom/facebook/analytics/a;Lcom/facebook/push/mqtt/u;Lcom/facebook/push/mqtt/d;Lcom/facebook/push/mqtt/ap;Lcom/facebook/push/mqtt/abtest/a;Lcom/facebook/analytics/cj;Lcom/facebook/common/time/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 172
    invoke-virtual {p0}, Lcom/facebook/push/mqtt/bf;->a()Lcom/facebook/push/mqtt/v;

    move-result-object v0

    return-object v0
.end method
