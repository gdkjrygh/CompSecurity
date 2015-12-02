.class Lcom/facebook/push/mqtt/bg;
.super Lcom/facebook/inject/d;
.source "MqttPushModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/push/mqtt/ai;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/push/mqtt/ax;


# direct methods
.method private constructor <init>(Lcom/facebook/push/mqtt/ax;)V
    .locals 0

    .prologue
    .line 198
    iput-object p1, p0, Lcom/facebook/push/mqtt/bg;->a:Lcom/facebook/push/mqtt/ax;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/push/mqtt/ax;Lcom/facebook/push/mqtt/ay;)V
    .locals 0

    .prologue
    .line 198
    invoke-direct {p0, p1}, Lcom/facebook/push/mqtt/bg;-><init>(Lcom/facebook/push/mqtt/ax;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/push/mqtt/ai;
    .locals 10

    .prologue
    .line 203
    new-instance v0, Lcom/facebook/push/mqtt/ai;

    invoke-virtual {p0}, Lcom/facebook/push/mqtt/bg;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    invoke-interface {v1, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/facebook/common/v/a;

    invoke-virtual {p0, v2}, Lcom/facebook/push/mqtt/bg;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/v/a;

    const-class v3, Lcom/facebook/common/v/d;

    invoke-virtual {p0, v3}, Lcom/facebook/push/mqtt/bg;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/common/v/d;

    const-class v4, Lcom/facebook/push/mqtt/v;

    invoke-virtual {p0, v4}, Lcom/facebook/push/mqtt/bg;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/push/mqtt/v;

    const-class v5, Lcom/facebook/common/executors/a;

    invoke-virtual {p0, v5}, Lcom/facebook/push/mqtt/bg;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/common/executors/a;

    const-class v6, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v6}, Lcom/facebook/push/mqtt/bg;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/prefs/shared/d;

    const-class v7, Ljava/lang/Boolean;

    const-class v8, Lcom/facebook/push/annotations/IsDeviceForegroundEnabled;

    invoke-virtual {p0, v7, v8}, Lcom/facebook/push/mqtt/bg;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v7

    const-class v8, Ljava/util/concurrent/ExecutorService;

    const-class v9, Lcom/facebook/analytics/module/DefaultSingleThreadExecutor;

    invoke-virtual {p0, v8, v9}, Lcom/facebook/push/mqtt/bg;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/concurrent/ExecutorService;

    invoke-direct/range {v0 .. v8}, Lcom/facebook/push/mqtt/ai;-><init>(Landroid/content/Context;Lcom/facebook/common/v/a;Lcom/facebook/common/v/d;Lcom/facebook/push/mqtt/v;Lcom/facebook/common/executors/a;Lcom/facebook/prefs/shared/d;Ljavax/inject/a;Ljava/util/concurrent/ExecutorService;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 198
    invoke-virtual {p0}, Lcom/facebook/push/mqtt/bg;->a()Lcom/facebook/push/mqtt/ai;

    move-result-object v0

    return-object v0
.end method
