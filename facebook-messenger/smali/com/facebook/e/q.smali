.class Lcom/facebook/e/q;
.super Lcom/facebook/inject/d;
.source "DeviceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/e/a/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/e/h;


# direct methods
.method private constructor <init>(Lcom/facebook/e/h;)V
    .locals 0

    .prologue
    .line 118
    iput-object p1, p0, Lcom/facebook/e/q;->a:Lcom/facebook/e/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/e/h;Lcom/facebook/e/i;)V
    .locals 0

    .prologue
    .line 118
    invoke-direct {p0, p1}, Lcom/facebook/e/q;-><init>(Lcom/facebook/e/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/e/a/h;
    .locals 5

    .prologue
    .line 122
    new-instance v3, Lcom/facebook/e/a/h;

    const-class v0, Lcom/facebook/common/hardware/q;

    invoke-virtual {p0, v0}, Lcom/facebook/e/q;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/hardware/q;

    const-class v1, Lcom/facebook/base/broadcast/j;

    const-class v2, Lcom/facebook/base/broadcast/LocalBroadcast;

    invoke-virtual {p0, v1, v2}, Lcom/facebook/e/q;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/base/broadcast/j;

    const-class v2, Ljava/util/concurrent/ScheduledExecutorService;

    const-class v4, Lcom/facebook/common/executors/DefaultExecutorService;

    invoke-virtual {p0, v2, v4}, Lcom/facebook/e/q;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/e/a/h;-><init>(Lcom/facebook/common/hardware/q;Lcom/facebook/base/broadcast/j;Ljava/util/concurrent/ScheduledExecutorService;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 118
    invoke-virtual {p0}, Lcom/facebook/e/q;->a()Lcom/facebook/e/a/h;

    move-result-object v0

    return-object v0
.end method
