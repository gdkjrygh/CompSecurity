.class Lcom/facebook/base/c/s;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/google/common/d/a/u;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/base/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/base/c/a;)V
    .locals 0

    .prologue
    .line 773
    iput-object p1, p0, Lcom/facebook/base/c/s;->a:Lcom/facebook/base/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 773
    invoke-direct {p0, p1}, Lcom/facebook/base/c/s;-><init>(Lcom/facebook/base/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/d/a/u;
    .locals 2

    .prologue
    .line 778
    const-class v0, Ljava/util/concurrent/ExecutorService;

    const-class v1, Lcom/facebook/common/executors/DefaultExecutorService;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/base/c/s;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ExecutorService;

    invoke-static {v0}, Lcom/google/common/d/a/w;->a(Ljava/util/concurrent/ExecutorService;)Lcom/google/common/d/a/u;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 773
    invoke-virtual {p0}, Lcom/facebook/base/c/s;->a()Lcom/google/common/d/a/u;

    move-result-object v0

    return-object v0
.end method
