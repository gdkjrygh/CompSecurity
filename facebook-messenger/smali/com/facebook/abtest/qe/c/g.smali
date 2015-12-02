.class public final Lcom/facebook/abtest/qe/c/g;
.super Lcom/facebook/inject/d;
.source "QuickExperimentStorageAutoProvider.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/abtest/qe/c/e;",
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
.method public a()Lcom/facebook/abtest/qe/c/e;
    .locals 5

    .prologue
    .line 13
    new-instance v4, Lcom/facebook/abtest/qe/c/e;

    const-class v0, Lcom/facebook/common/executors/a;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/c/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/executors/a;

    const-class v1, Lcom/facebook/abtest/qe/c/c;

    invoke-virtual {p0, v1}, Lcom/facebook/abtest/qe/c/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/abtest/qe/c/c;

    const-class v2, Lcom/facebook/abtest/qe/protocol/sync/full/d;

    invoke-virtual {p0, v2}, Lcom/facebook/abtest/qe/c/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/abtest/qe/protocol/sync/full/d;

    const-class v3, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p0, v3}, Lcom/facebook/abtest/qe/c/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/facebook/abtest/qe/c/e;-><init>(Lcom/facebook/common/executors/a;Lcom/facebook/abtest/qe/c/c;Lcom/facebook/abtest/qe/protocol/sync/full/d;Lcom/fasterxml/jackson/databind/ObjectMapper;)V

    return-object v4
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 8
    invoke-virtual {p0}, Lcom/facebook/abtest/qe/c/g;->a()Lcom/facebook/abtest/qe/c/e;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 22
    instance-of v0, p1, Lcom/facebook/abtest/qe/c/g;

    return v0
.end method
