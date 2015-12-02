.class Lcom/facebook/base/c/ag;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/common/executors/n;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/base/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/base/c/a;)V
    .locals 0

    .prologue
    .line 784
    iput-object p1, p0, Lcom/facebook/base/c/ag;->a:Lcom/facebook/base/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 784
    invoke-direct {p0, p1}, Lcom/facebook/base/c/ag;-><init>(Lcom/facebook/base/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/executors/n;
    .locals 3

    .prologue
    .line 788
    new-instance v1, Lcom/facebook/common/executors/n;

    const-class v0, Ljava/util/concurrent/ExecutorService;

    const-class v2, Lcom/facebook/common/executors/DefaultExecutorService;

    invoke-virtual {p0, v0, v2}, Lcom/facebook/base/c/ag;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ExecutorService;

    invoke-direct {v1, v0}, Lcom/facebook/common/executors/n;-><init>(Ljava/util/concurrent/ExecutorService;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 784
    invoke-virtual {p0}, Lcom/facebook/base/c/ag;->a()Lcom/facebook/common/executors/n;

    move-result-object v0

    return-object v0
.end method
