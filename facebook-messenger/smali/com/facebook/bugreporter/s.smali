.class Lcom/facebook/bugreporter/s;
.super Lcom/facebook/inject/d;
.source "BugReporterModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/bugreporter/m;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/bugreporter/o;


# direct methods
.method private constructor <init>(Lcom/facebook/bugreporter/o;)V
    .locals 0

    .prologue
    .line 102
    iput-object p1, p0, Lcom/facebook/bugreporter/s;->a:Lcom/facebook/bugreporter/o;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/bugreporter/o;Lcom/facebook/bugreporter/p;)V
    .locals 0

    .prologue
    .line 102
    invoke-direct {p0, p1}, Lcom/facebook/bugreporter/s;-><init>(Lcom/facebook/bugreporter/o;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/bugreporter/m;
    .locals 4

    .prologue
    .line 106
    new-instance v2, Lcom/facebook/bugreporter/m;

    invoke-virtual {p0}, Lcom/facebook/bugreporter/s;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Ljava/util/concurrent/ExecutorService;

    const-class v3, Lcom/facebook/common/executors/DefaultExecutorService;

    invoke-virtual {p0, v1, v3}, Lcom/facebook/bugreporter/s;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Executor;

    invoke-direct {v2, v0, v1}, Lcom/facebook/bugreporter/m;-><init>(Landroid/content/Context;Ljava/util/concurrent/Executor;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 102
    invoke-virtual {p0}, Lcom/facebook/bugreporter/s;->a()Lcom/facebook/bugreporter/m;

    move-result-object v0

    return-object v0
.end method
