.class Lcom/facebook/common/executors/h;
.super Lcom/facebook/inject/d;
.source "ExecutorsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/common/executors/d;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/common/executors/g;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Lcom/facebook/common/executors/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/executors/d;
    .locals 5

    .prologue
    .line 30
    new-instance v3, Lcom/facebook/common/executors/d;

    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/common/executors/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/google/common/d/a/u;

    const-class v2, Lcom/facebook/common/executors/DefaultExecutorService;

    invoke-virtual {p0, v1, v2}, Lcom/facebook/common/executors/h;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/common/d/a/u;

    const-class v2, Ljava/util/concurrent/Executor;

    const-class v4, Lcom/facebook/common/executors/ForUiThread;

    invoke-virtual {p0, v2, v4}, Lcom/facebook/common/executors/h;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/Executor;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/common/executors/d;-><init>(Landroid/content/Context;Lcom/google/common/d/a/u;Ljava/util/concurrent/Executor;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 25
    invoke-virtual {p0}, Lcom/facebook/common/executors/h;->a()Lcom/facebook/common/executors/d;

    move-result-object v0

    return-object v0
.end method
