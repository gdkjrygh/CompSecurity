.class public final Lcom/facebook/abtest/qe/c/d;
.super Lcom/facebook/inject/d;
.source "QuickExperimentDbSupplierAutoProvider.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/abtest/qe/c/c;",
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
.method public a()Lcom/facebook/abtest/qe/c/c;
    .locals 5

    .prologue
    .line 13
    new-instance v4, Lcom/facebook/abtest/qe/c/c;

    invoke-virtual {p0}, Lcom/facebook/abtest/qe/c/d;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/facebook/common/executors/a;

    invoke-virtual {p0, v1}, Lcom/facebook/abtest/qe/c/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/executors/a;

    const-class v2, Lcom/facebook/d/b/a;

    invoke-virtual {p0, v2}, Lcom/facebook/abtest/qe/c/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/d/b/a;

    const-class v3, Lcom/facebook/abtest/qe/c/a;

    invoke-virtual {p0, v3}, Lcom/facebook/abtest/qe/c/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/abtest/qe/c/a;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/facebook/abtest/qe/c/c;-><init>(Landroid/content/Context;Lcom/facebook/common/executors/a;Lcom/facebook/d/b/a;Lcom/facebook/abtest/qe/c/a;)V

    return-object v4
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 8
    invoke-virtual {p0}, Lcom/facebook/abtest/qe/c/d;->a()Lcom/facebook/abtest/qe/c/c;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 22
    instance-of v0, p1, Lcom/facebook/abtest/qe/c/d;

    return v0
.end method
