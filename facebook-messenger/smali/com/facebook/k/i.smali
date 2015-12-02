.class Lcom/facebook/k/i;
.super Lcom/facebook/inject/d;
.source "PowerManagementModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/k/j;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/k/e;


# direct methods
.method private constructor <init>(Lcom/facebook/k/e;)V
    .locals 0

    .prologue
    .line 58
    iput-object p1, p0, Lcom/facebook/k/i;->a:Lcom/facebook/k/e;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/k/e;Lcom/facebook/k/f;)V
    .locals 0

    .prologue
    .line 58
    invoke-direct {p0, p1}, Lcom/facebook/k/i;-><init>(Lcom/facebook/k/e;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/k/j;
    .locals 7

    .prologue
    .line 62
    new-instance v0, Lcom/facebook/k/j;

    const-class v1, Landroid/support/v4/a/e;

    invoke-virtual {p0, v1}, Lcom/facebook/k/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/a/e;

    const-class v2, Lcom/facebook/common/hardware/f;

    invoke-virtual {p0, v2}, Lcom/facebook/k/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/hardware/f;

    const-class v3, Ljava/util/concurrent/ScheduledExecutorService;

    const-class v4, Lcom/facebook/common/executors/ForUiThreadWakeup;

    invoke-virtual {p0, v3, v4}, Lcom/facebook/k/i;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/ScheduledExecutorService;

    const-class v4, Lcom/facebook/common/hardware/k;

    invoke-virtual {p0, v4}, Lcom/facebook/k/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/common/hardware/k;

    const-class v5, Lcom/facebook/base/broadcast/j;

    const-class v6, Lcom/facebook/base/broadcast/CrossFbAppBroadcast;

    invoke-virtual {p0, v5, v6}, Lcom/facebook/k/i;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/base/broadcast/j;

    const-class v6, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v6}, Lcom/facebook/k/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/common/time/a;

    invoke-direct/range {v0 .. v6}, Lcom/facebook/k/j;-><init>(Landroid/support/v4/a/e;Lcom/facebook/common/hardware/f;Ljava/util/concurrent/ScheduledExecutorService;Lcom/facebook/common/hardware/k;Lcom/facebook/base/broadcast/j;Lcom/facebook/common/time/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 58
    invoke-virtual {p0}, Lcom/facebook/k/i;->a()Lcom/facebook/k/j;

    move-result-object v0

    return-object v0
.end method
