.class final Lcom/google/inject/internal/WeakKeySet;
.super Ljava/lang/Object;
.source "WeakKeySet.java"


# instance fields
.field private backingSet:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public add(Lcom/google/inject/Key;Ljava/lang/Object;)V
    .locals 3
    .param p2, "source"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Key",
            "<*>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .prologue
    .line 44
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<*>;"
    iget-object v2, p0, Lcom/google/inject/internal/WeakKeySet;->backingSet:Ljava/util/Map;

    if-nez v2, :cond_0

    .line 45
    invoke-static {}, Lcom/google/inject/internal/util/$Maps;->newHashMap()Ljava/util/HashMap;

    move-result-object v2

    iput-object v2, p0, Lcom/google/inject/internal/WeakKeySet;->backingSet:Ljava/util/Map;

    .line 49
    :cond_0
    instance-of v2, p2, Ljava/lang/Class;

    if-nez v2, :cond_1

    sget-object v2, Lcom/google/inject/internal/util/$SourceProvider;->UNKNOWN_SOURCE:Ljava/lang/Object;

    if-ne p2, v2, :cond_2

    .line 50
    :cond_1
    const/4 p2, 0x0

    .line 52
    .end local p2    # "source":Ljava/lang/Object;
    :cond_2
    invoke-virtual {p1}, Lcom/google/inject/Key;->toString()Ljava/lang/String;

    move-result-object v0

    .line 53
    .local v0, "k":Ljava/lang/String;
    iget-object v2, p0, Lcom/google/inject/internal/WeakKeySet;->backingSet:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    .line 54
    .local v1, "sources":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/Object;>;"
    if-nez v1, :cond_3

    .line 55
    invoke-static {}, Lcom/google/inject/internal/util/$Sets;->newLinkedHashSet()Ljava/util/LinkedHashSet;

    move-result-object v1

    .line 56
    iget-object v2, p0, Lcom/google/inject/internal/WeakKeySet;->backingSet:Ljava/util/Map;

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    :cond_3
    invoke-static {p2}, Lcom/google/inject/internal/Errors;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 59
    return-void
.end method

.method public contains(Lcom/google/inject/Key;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Key",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 64
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<*>;"
    iget-object v0, p0, Lcom/google/inject/internal/WeakKeySet;->backingSet:Ljava/util/Map;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/inject/internal/WeakKeySet;->backingSet:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/google/inject/Key;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getSources(Lcom/google/inject/Key;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Key",
            "<*>;)",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 68
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<*>;"
    iget-object v0, p0, Lcom/google/inject/internal/WeakKeySet;->backingSet:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/google/inject/Key;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method
