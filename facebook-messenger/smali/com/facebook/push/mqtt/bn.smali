.class Lcom/facebook/push/mqtt/bn;
.super Lcom/facebook/inject/d;
.source "MqttPushModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/push/mqtt/ca;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/push/mqtt/ax;


# direct methods
.method private constructor <init>(Lcom/facebook/push/mqtt/ax;)V
    .locals 0

    .prologue
    .line 247
    iput-object p1, p0, Lcom/facebook/push/mqtt/bn;->a:Lcom/facebook/push/mqtt/ax;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/push/mqtt/ax;Lcom/facebook/push/mqtt/ay;)V
    .locals 0

    .prologue
    .line 247
    invoke-direct {p0, p1}, Lcom/facebook/push/mqtt/bn;-><init>(Lcom/facebook/push/mqtt/ax;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/push/mqtt/ca;
    .locals 11

    .prologue
    .line 251
    new-instance v0, Lcom/facebook/push/mqtt/ca;

    invoke-virtual {p0}, Lcom/facebook/push/mqtt/bn;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    invoke-interface {v1, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v2}, Lcom/facebook/push/mqtt/bn;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/time/a;

    const-class v3, Ljava/util/concurrent/ScheduledExecutorService;

    const-class v4, Lcom/facebook/common/executors/ForUiThreadWakeup;

    invoke-virtual {p0, v3, v4}, Lcom/facebook/push/mqtt/bn;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/ScheduledExecutorService;

    const-class v4, Lcom/facebook/push/mqtt/v;

    invoke-virtual {p0, v4}, Lcom/facebook/push/mqtt/bn;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/push/mqtt/v;

    const-class v5, Lcom/facebook/common/v/a;

    invoke-virtual {p0, v5}, Lcom/facebook/push/mqtt/bn;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/common/v/a;

    const-class v6, Lcom/facebook/common/v/d;

    invoke-virtual {p0, v6}, Lcom/facebook/push/mqtt/bn;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/common/v/d;

    const-class v7, Lcom/facebook/push/mqtt/ar;

    const-class v8, Lcom/facebook/push/annotations/HighestMqttPersistence;

    invoke-virtual {p0, v7, v8}, Lcom/facebook/push/mqtt/bn;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v7

    const-class v8, Ljava/lang/String;

    const-class v9, Lcom/facebook/auth/annotations/LoggedInUserId;

    invoke-virtual {p0, v8, v9}, Lcom/facebook/push/mqtt/bn;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v8

    const-class v9, Lcom/facebook/push/mqtt/m;

    const-class v10, Lcom/facebook/push/mqtt/MqttTopicList;

    invoke-virtual {p0, v9, v10}, Lcom/facebook/push/mqtt/bn;->c(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v9

    const-class v10, Lcom/facebook/push/mqtt/i;

    invoke-virtual {p0, v10}, Lcom/facebook/push/mqtt/bn;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v10

    invoke-direct/range {v0 .. v10}, Lcom/facebook/push/mqtt/ca;-><init>(Landroid/content/Context;Lcom/facebook/common/time/a;Ljava/util/concurrent/ScheduledExecutorService;Lcom/facebook/push/mqtt/v;Lcom/facebook/common/v/a;Lcom/facebook/common/v/d;Ljavax/inject/a;Ljavax/inject/a;Ljava/util/Set;Ljava/util/Set;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 247
    invoke-virtual {p0}, Lcom/facebook/push/mqtt/bn;->a()Lcom/facebook/push/mqtt/ca;

    move-result-object v0

    return-object v0
.end method
