.class public final Lcom/facebook/abtest/qe/b/g;
.super Lcom/facebook/inject/d;
.source "QuickExperimentMemoryCacheAutoProvider.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/abtest/qe/b/a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/abtest/qe/b/a;
    .locals 8

    .prologue
    .line 13
    new-instance v0, Lcom/facebook/abtest/qe/b/a;

    const-class v1, Lcom/facebook/abtest/qe/f/b;

    invoke-virtual {p0, v1}, Lcom/facebook/abtest/qe/b/g;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v1

    const-class v2, Lcom/facebook/abtest/qe/b;

    invoke-virtual {p0, v2}, Lcom/facebook/abtest/qe/b/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/abtest/qe/b;

    const-class v3, Lcom/facebook/abtest/qe/e/a;

    invoke-virtual {p0, v3}, Lcom/facebook/abtest/qe/b/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/abtest/qe/e/a;

    const-class v4, Lcom/facebook/abtest/qe/c/e;

    invoke-virtual {p0, v4}, Lcom/facebook/abtest/qe/b/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/abtest/qe/c/e;

    const-class v5, Lcom/google/common/d/a/u;

    const-class v6, Lcom/facebook/common/executors/DefaultExecutorService;

    invoke-virtual {p0, v5, v6}, Lcom/facebook/abtest/qe/b/g;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/common/d/a/u;

    const-class v6, Lcom/facebook/abtest/qe/g/a;

    invoke-virtual {p0, v6}, Lcom/facebook/abtest/qe/b/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/abtest/qe/g/a;

    const-class v7, Lcom/facebook/common/e/h;

    invoke-virtual {p0, v7}, Lcom/facebook/abtest/qe/b/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/common/e/h;

    invoke-direct/range {v0 .. v7}, Lcom/facebook/abtest/qe/b/a;-><init>(Ljava/util/Set;Lcom/facebook/abtest/qe/b;Lcom/facebook/abtest/qe/e/a;Lcom/facebook/abtest/qe/c/e;Lcom/google/common/d/a/u;Lcom/facebook/abtest/qe/g/a;Lcom/facebook/common/e/h;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 8
    invoke-virtual {p0}, Lcom/facebook/abtest/qe/b/g;->a()Lcom/facebook/abtest/qe/b/a;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 26
    instance-of v0, p1, Lcom/facebook/abtest/qe/b/g;

    return v0
.end method
