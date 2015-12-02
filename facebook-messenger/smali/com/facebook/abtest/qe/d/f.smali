.class public final Lcom/facebook/abtest/qe/d/f;
.super Lcom/facebook/inject/d;
.source "QuickExperimentInfoAdapterFactoryAutoProvider.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/abtest/qe/d/e;",
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
.method public a()Lcom/facebook/abtest/qe/d/e;
    .locals 3

    .prologue
    .line 13
    new-instance v2, Lcom/facebook/abtest/qe/d/e;

    const-class v0, Lcom/facebook/abtest/qe/b/a;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/d/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/b/a;

    const-class v1, Lcom/facebook/abtest/qe/e/a;

    invoke-virtual {p0, v1}, Lcom/facebook/abtest/qe/d/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/abtest/qe/e/a;

    invoke-direct {v2, v0, v1}, Lcom/facebook/abtest/qe/d/e;-><init>(Lcom/facebook/abtest/qe/b/a;Lcom/facebook/abtest/qe/e/a;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 8
    invoke-virtual {p0}, Lcom/facebook/abtest/qe/d/f;->a()Lcom/facebook/abtest/qe/d/e;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 20
    instance-of v0, p1, Lcom/facebook/abtest/qe/d/f;

    return v0
.end method
