.class final Lcom/google/inject/internal/InternalContext;
.super Ljava/lang/Object;
.source "InternalContext.java"


# instance fields
.field private constructionContexts:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Object;",
            "Lcom/google/inject/internal/ConstructionContext",
            "<*>;>;"
        }
    .end annotation
.end field

.field private dependency:Lcom/google/inject/spi/Dependency;


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    invoke-static {}, Lcom/google/inject/internal/util/$Maps;->newHashMap()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/InternalContext;->constructionContexts:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public getConstructionContext(Ljava/lang/Object;)Lcom/google/inject/internal/ConstructionContext;
    .locals 2
    .param p1, "key"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/inject/internal/ConstructionContext",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 36
    iget-object v1, p0, Lcom/google/inject/internal/InternalContext;->constructionContexts:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/internal/ConstructionContext;

    .line 38
    .local v0, "constructionContext":Lcom/google/inject/internal/ConstructionContext;, "Lcom/google/inject/internal/ConstructionContext<TT;>;"
    if-nez v0, :cond_0

    .line 39
    new-instance v0, Lcom/google/inject/internal/ConstructionContext;

    .end local v0    # "constructionContext":Lcom/google/inject/internal/ConstructionContext;, "Lcom/google/inject/internal/ConstructionContext<TT;>;"
    invoke-direct {v0}, Lcom/google/inject/internal/ConstructionContext;-><init>()V

    .line 40
    .restart local v0    # "constructionContext":Lcom/google/inject/internal/ConstructionContext;, "Lcom/google/inject/internal/ConstructionContext<TT;>;"
    iget-object v1, p0, Lcom/google/inject/internal/InternalContext;->constructionContexts:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    :cond_0
    return-object v0
.end method

.method public getDependency()Lcom/google/inject/spi/Dependency;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/google/inject/internal/InternalContext;->dependency:Lcom/google/inject/spi/Dependency;

    return-object v0
.end method

.method public setDependency(Lcom/google/inject/spi/Dependency;)Lcom/google/inject/spi/Dependency;
    .locals 1
    .param p1, "dependency"    # Lcom/google/inject/spi/Dependency;

    .prologue
    .line 50
    iget-object v0, p0, Lcom/google/inject/internal/InternalContext;->dependency:Lcom/google/inject/spi/Dependency;

    .line 51
    .local v0, "previous":Lcom/google/inject/spi/Dependency;
    iput-object p1, p0, Lcom/google/inject/internal/InternalContext;->dependency:Lcom/google/inject/spi/Dependency;

    .line 52
    return-object v0
.end method
