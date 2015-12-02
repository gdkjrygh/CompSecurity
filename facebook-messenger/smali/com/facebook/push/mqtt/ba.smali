.class Lcom/facebook/push/mqtt/ba;
.super Lcom/facebook/inject/d;
.source "MqttPushModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/push/mqtt/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/push/mqtt/ax;


# direct methods
.method private constructor <init>(Lcom/facebook/push/mqtt/ax;)V
    .locals 0

    .prologue
    .line 325
    iput-object p1, p0, Lcom/facebook/push/mqtt/ba;->a:Lcom/facebook/push/mqtt/ax;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/push/mqtt/ax;Lcom/facebook/push/mqtt/ay;)V
    .locals 0

    .prologue
    .line 325
    invoke-direct {p0, p1}, Lcom/facebook/push/mqtt/ba;-><init>(Lcom/facebook/push/mqtt/ax;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/push/mqtt/d;
    .locals 5

    .prologue
    .line 329
    new-instance v4, Lcom/facebook/push/mqtt/d;

    invoke-virtual {p0}, Lcom/facebook/push/mqtt/ba;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v1}, Lcom/facebook/push/mqtt/ba;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/time/a;

    const-class v2, Ljava/util/concurrent/ScheduledExecutorService;

    const-class v3, Lcom/facebook/common/executors/ForUiThreadWakeup;

    invoke-virtual {p0, v2, v3}, Lcom/facebook/push/mqtt/ba;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/ScheduledExecutorService;

    const-class v3, Lcom/facebook/push/mqtt/abtest/a;

    invoke-virtual {p0, v3}, Lcom/facebook/push/mqtt/ba;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/push/mqtt/abtest/a;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/facebook/push/mqtt/d;-><init>(Landroid/content/Context;Lcom/facebook/common/time/a;Ljava/util/concurrent/ScheduledExecutorService;Lcom/facebook/push/mqtt/abtest/a;)V

    return-object v4
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 325
    invoke-virtual {p0}, Lcom/facebook/push/mqtt/ba;->a()Lcom/facebook/push/mqtt/d;

    move-result-object v0

    return-object v0
.end method
