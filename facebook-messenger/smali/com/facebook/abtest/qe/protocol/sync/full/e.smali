.class public final Lcom/facebook/abtest/qe/protocol/sync/full/e;
.super Lcom/facebook/inject/d;
.source "SyncQuickExperimentMetaInfoResultHelperAutoProvider.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/abtest/qe/protocol/sync/full/d;",
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
.method public a()Lcom/facebook/abtest/qe/protocol/sync/full/d;
    .locals 2

    .prologue
    .line 13
    new-instance v1, Lcom/facebook/abtest/qe/protocol/sync/full/d;

    const-class v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p0, v0}, Lcom/facebook/abtest/qe/protocol/sync/full/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-direct {v1, v0}, Lcom/facebook/abtest/qe/protocol/sync/full/d;-><init>(Lcom/fasterxml/jackson/databind/ObjectMapper;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 8
    invoke-virtual {p0}, Lcom/facebook/abtest/qe/protocol/sync/full/e;->a()Lcom/facebook/abtest/qe/protocol/sync/full/d;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 19
    instance-of v0, p1, Lcom/facebook/abtest/qe/protocol/sync/full/e;

    return v0
.end method
