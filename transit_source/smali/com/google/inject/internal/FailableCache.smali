.class public abstract Lcom/google/inject/internal/FailableCache;
.super Ljava/lang/Object;
.source "FailableCache.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final delegate:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<TK;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 31
    .local p0, "this":Lcom/google/inject/internal/FailableCache;, "Lcom/google/inject/internal/FailableCache<TK;TV;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v0, Lcom/google/inject/internal/util/$MapMaker;

    invoke-direct {v0}, Lcom/google/inject/internal/util/$MapMaker;-><init>()V

    new-instance v1, Lcom/google/inject/internal/FailableCache$1;

    invoke-direct {v1, p0}, Lcom/google/inject/internal/FailableCache$1;-><init>(Lcom/google/inject/internal/FailableCache;)V

    invoke-virtual {v0, v1}, Lcom/google/inject/internal/util/$MapMaker;->makeComputingMap(Lcom/google/inject/internal/util/$Function;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/FailableCache;->delegate:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method protected abstract create(Ljava/lang/Object;Lcom/google/inject/internal/Errors;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Lcom/google/inject/internal/Errors;",
            ")TV;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/ErrorsException;
        }
    .end annotation
.end method

.method public get(Ljava/lang/Object;Lcom/google/inject/internal/Errors;)Ljava/lang/Object;
    .locals 3
    .param p2, "errors"    # Lcom/google/inject/internal/Errors;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Lcom/google/inject/internal/Errors;",
            ")TV;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/ErrorsException;
        }
    .end annotation

    .prologue
    .line 50
    .local p0, "this":Lcom/google/inject/internal/FailableCache;, "Lcom/google/inject/internal/FailableCache<TK;TV;>;"
    .local p1, "key":Ljava/lang/Object;, "TK;"
    iget-object v2, p0, Lcom/google/inject/internal/FailableCache;->delegate:Ljava/util/Map;

    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 51
    .local v1, "resultOrError":Ljava/lang/Object;
    instance-of v2, v1, Lcom/google/inject/internal/Errors;

    if-eqz v2, :cond_0

    .line 52
    check-cast v1, Lcom/google/inject/internal/Errors;

    .end local v1    # "resultOrError":Ljava/lang/Object;
    invoke-virtual {p2, v1}, Lcom/google/inject/internal/Errors;->merge(Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/Errors;

    .line 53
    invoke-virtual {p2}, Lcom/google/inject/internal/Errors;->toException()Lcom/google/inject/internal/ErrorsException;

    move-result-object v2

    throw v2

    .line 56
    .restart local v1    # "resultOrError":Ljava/lang/Object;
    :cond_0
    move-object v0, v1

    .line 57
    .local v0, "result":Ljava/lang/Object;, "TV;"
    return-object v0
.end method

.method remove(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)Z"
        }
    .end annotation

    .prologue
    .line 62
    .local p0, "this":Lcom/google/inject/internal/FailableCache;, "Lcom/google/inject/internal/FailableCache<TK;TV;>;"
    .local p1, "key":Ljava/lang/Object;, "TK;"
    iget-object v0, p0, Lcom/google/inject/internal/FailableCache;->delegate:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
