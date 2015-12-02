.class Lcom/facebook/push/mqtt/bi;
.super Lcom/facebook/inject/d;
.source "MqttPushModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/push/mqtt/ap;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/push/mqtt/ax;


# direct methods
.method private constructor <init>(Lcom/facebook/push/mqtt/ax;)V
    .locals 0

    .prologue
    .line 338
    iput-object p1, p0, Lcom/facebook/push/mqtt/bi;->a:Lcom/facebook/push/mqtt/ax;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/push/mqtt/ax;Lcom/facebook/push/mqtt/ay;)V
    .locals 0

    .prologue
    .line 338
    invoke-direct {p0, p1}, Lcom/facebook/push/mqtt/bi;-><init>(Lcom/facebook/push/mqtt/ax;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/push/mqtt/ap;
    .locals 5

    .prologue
    .line 341
    new-instance v4, Lcom/facebook/push/mqtt/ap;

    const-class v0, Ljava/util/concurrent/ScheduledExecutorService;

    const-class v1, Lcom/facebook/common/executors/ForUiThreadWakeup;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/push/mqtt/bi;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    const-class v1, Lcom/facebook/push/mqtt/abtest/a;

    invoke-virtual {p0, v1}, Lcom/facebook/push/mqtt/bi;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/push/mqtt/abtest/a;

    const-class v2, Lcom/facebook/analytics/cj;

    invoke-virtual {p0, v2}, Lcom/facebook/push/mqtt/bi;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/analytics/cj;

    const-class v3, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v3}, Lcom/facebook/push/mqtt/bi;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/common/time/a;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/facebook/push/mqtt/ap;-><init>(Ljava/util/concurrent/ScheduledExecutorService;Lcom/facebook/push/mqtt/abtest/a;Lcom/facebook/analytics/cj;Lcom/facebook/common/time/a;)V

    return-object v4
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 338
    invoke-virtual {p0}, Lcom/facebook/push/mqtt/bi;->a()Lcom/facebook/push/mqtt/ap;

    move-result-object v0

    return-object v0
.end method
