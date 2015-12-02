.class Lcom/facebook/push/mqtt/bl;
.super Lcom/facebook/inject/d;
.source "MqttPushModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/push/mqtt/bx;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 349
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/push/mqtt/ay;)V
    .locals 0

    .prologue
    .line 349
    invoke-direct {p0}, Lcom/facebook/push/mqtt/bl;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/push/mqtt/bx;
    .locals 4

    .prologue
    .line 354
    new-instance v3, Lcom/facebook/push/mqtt/bx;

    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/push/mqtt/bl;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/facebook/common/executors/a;

    invoke-virtual {p0, v1}, Lcom/facebook/push/mqtt/bl;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/executors/a;

    const-class v2, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v2}, Lcom/facebook/push/mqtt/bl;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/time/a;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/push/mqtt/bx;-><init>(Landroid/content/Context;Lcom/facebook/common/executors/a;Lcom/facebook/common/time/a;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 349
    invoke-virtual {p0}, Lcom/facebook/push/mqtt/bl;->a()Lcom/facebook/push/mqtt/bx;

    move-result-object v0

    return-object v0
.end method
