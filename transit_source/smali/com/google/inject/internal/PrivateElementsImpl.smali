.class public final Lcom/google/inject/internal/PrivateElementsImpl;
.super Ljava/lang/Object;
.source "PrivateElementsImpl.java"

# interfaces
.implements Lcom/google/inject/spi/PrivateElements;


# instance fields
.field private elements:Lcom/google/inject/internal/util/$ImmutableList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$ImmutableList",
            "<",
            "Lcom/google/inject/spi/Element;",
            ">;"
        }
    .end annotation
.end field

.field private elementsMutable:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/spi/Element;",
            ">;"
        }
    .end annotation
.end field

.field private exposedKeysToSources:Lcom/google/inject/internal/util/$ImmutableMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$ImmutableMap",
            "<",
            "Lcom/google/inject/Key",
            "<*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private exposureBuilders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/internal/ExposureBuilder",
            "<*>;>;"
        }
    .end annotation
.end field

.field private injector:Lcom/google/inject/Injector;

.field private final source:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1
    .param p1, "source"    # Ljava/lang/Object;

    .prologue
    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    invoke-static {}, Lcom/google/inject/internal/util/$Lists;->newArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/PrivateElementsImpl;->elementsMutable:Ljava/util/List;

    .line 52
    invoke-static {}, Lcom/google/inject/internal/util/$Lists;->newArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/PrivateElementsImpl;->exposureBuilders:Ljava/util/List;

    .line 62
    const-string v0, "source"

    invoke-static {p1, v0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/PrivateElementsImpl;->source:Ljava/lang/Object;

    .line 63
    return-void
.end method


# virtual methods
.method public acceptVisitor(Lcom/google/inject/spi/ElementVisitor;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/spi/ElementVisitor",
            "<TT;>;)TT;"
        }
    .end annotation

    .prologue
    .line 101
    .local p1, "visitor":Lcom/google/inject/spi/ElementVisitor;, "Lcom/google/inject/spi/ElementVisitor<TT;>;"
    invoke-interface {p1, p0}, Lcom/google/inject/spi/ElementVisitor;->visit(Lcom/google/inject/spi/PrivateElements;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public addExposureBuilder(Lcom/google/inject/internal/ExposureBuilder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/ExposureBuilder",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 109
    .local p1, "exposureBuilder":Lcom/google/inject/internal/ExposureBuilder;, "Lcom/google/inject/internal/ExposureBuilder<*>;"
    iget-object v0, p0, Lcom/google/inject/internal/PrivateElementsImpl;->exposureBuilders:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 110
    return-void
.end method

.method public applyTo(Lcom/google/inject/Binder;)V
    .locals 6
    .param p1, "binder"    # Lcom/google/inject/Binder;

    .prologue
    .line 113
    iget-object v4, p0, Lcom/google/inject/internal/PrivateElementsImpl;->source:Ljava/lang/Object;

    invoke-interface {p1, v4}, Lcom/google/inject/Binder;->withSource(Ljava/lang/Object;)Lcom/google/inject/Binder;

    move-result-object v4

    invoke-interface {v4}, Lcom/google/inject/Binder;->newPrivateBinder()Lcom/google/inject/PrivateBinder;

    move-result-object v3

    .line 115
    .local v3, "privateBinder":Lcom/google/inject/PrivateBinder;
    invoke-virtual {p0}, Lcom/google/inject/internal/PrivateElementsImpl;->getElements()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/spi/Element;

    .line 116
    .local v0, "element":Lcom/google/inject/spi/Element;
    invoke-interface {v0, v3}, Lcom/google/inject/spi/Element;->applyTo(Lcom/google/inject/Binder;)V

    goto :goto_0

    .line 119
    .end local v0    # "element":Lcom/google/inject/spi/Element;
    :cond_0
    invoke-virtual {p0}, Lcom/google/inject/internal/PrivateElementsImpl;->getExposedKeys()Ljava/util/Set;

    .line 120
    iget-object v4, p0, Lcom/google/inject/internal/PrivateElementsImpl;->exposedKeysToSources:Lcom/google/inject/internal/util/$ImmutableMap;

    invoke-virtual {v4}, Lcom/google/inject/internal/util/$ImmutableMap;->entrySet()Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/inject/internal/util/$ImmutableSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 121
    .local v1, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Lcom/google/inject/Key<*>;Ljava/lang/Object;>;"
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4}, Lcom/google/inject/PrivateBinder;->withSource(Ljava/lang/Object;)Lcom/google/inject/PrivateBinder;

    move-result-object v5

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/inject/Key;

    invoke-interface {v5, v4}, Lcom/google/inject/PrivateBinder;->expose(Lcom/google/inject/Key;)V

    goto :goto_1

    .line 123
    .end local v1    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Lcom/google/inject/Key<*>;Ljava/lang/Object;>;"
    :cond_1
    return-void
.end method

.method public getElements()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/spi/Element;",
            ">;"
        }
    .end annotation

    .prologue
    .line 70
    iget-object v0, p0, Lcom/google/inject/internal/PrivateElementsImpl;->elements:Lcom/google/inject/internal/util/$ImmutableList;

    if-nez v0, :cond_0

    .line 71
    iget-object v0, p0, Lcom/google/inject/internal/PrivateElementsImpl;->elementsMutable:Ljava/util/List;

    invoke-static {v0}, Lcom/google/inject/internal/util/$ImmutableList;->copyOf(Ljava/lang/Iterable;)Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/PrivateElementsImpl;->elements:Lcom/google/inject/internal/util/$ImmutableList;

    .line 72
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/inject/internal/PrivateElementsImpl;->elementsMutable:Ljava/util/List;

    .line 75
    :cond_0
    iget-object v0, p0, Lcom/google/inject/internal/PrivateElementsImpl;->elements:Lcom/google/inject/internal/util/$ImmutableList;

    return-object v0
.end method

.method public getElementsMutable()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/spi/Element;",
            ">;"
        }
    .end annotation

    .prologue
    .line 105
    iget-object v0, p0, Lcom/google/inject/internal/PrivateElementsImpl;->elementsMutable:Ljava/util/List;

    return-object v0
.end method

.method public getExposedKeys()Ljava/util/Set;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/google/inject/Key",
            "<*>;>;"
        }
    .end annotation

    .prologue
    .line 88
    iget-object v3, p0, Lcom/google/inject/internal/PrivateElementsImpl;->exposedKeysToSources:Lcom/google/inject/internal/util/$ImmutableMap;

    if-nez v3, :cond_1

    .line 89
    invoke-static {}, Lcom/google/inject/internal/util/$Maps;->newLinkedHashMap()Ljava/util/LinkedHashMap;

    move-result-object v0

    .line 90
    .local v0, "exposedKeysToSourcesMutable":Ljava/util/Map;, "Ljava/util/Map<Lcom/google/inject/Key<*>;Ljava/lang/Object;>;"
    iget-object v3, p0, Lcom/google/inject/internal/PrivateElementsImpl;->exposureBuilders:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/inject/internal/ExposureBuilder;

    .line 91
    .local v1, "exposureBuilder":Lcom/google/inject/internal/ExposureBuilder;, "Lcom/google/inject/internal/ExposureBuilder<*>;"
    invoke-virtual {v1}, Lcom/google/inject/internal/ExposureBuilder;->getKey()Lcom/google/inject/Key;

    move-result-object v3

    invoke-virtual {v1}, Lcom/google/inject/internal/ExposureBuilder;->getSource()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 93
    .end local v1    # "exposureBuilder":Lcom/google/inject/internal/ExposureBuilder;, "Lcom/google/inject/internal/ExposureBuilder<*>;"
    :cond_0
    invoke-static {v0}, Lcom/google/inject/internal/util/$ImmutableMap;->copyOf(Ljava/util/Map;)Lcom/google/inject/internal/util/$ImmutableMap;

    move-result-object v3

    iput-object v3, p0, Lcom/google/inject/internal/PrivateElementsImpl;->exposedKeysToSources:Lcom/google/inject/internal/util/$ImmutableMap;

    .line 94
    const/4 v3, 0x0

    iput-object v3, p0, Lcom/google/inject/internal/PrivateElementsImpl;->exposureBuilders:Ljava/util/List;

    .line 97
    .end local v0    # "exposedKeysToSourcesMutable":Ljava/util/Map;, "Ljava/util/Map<Lcom/google/inject/Key<*>;Ljava/lang/Object;>;"
    .end local v2    # "i$":Ljava/util/Iterator;
    :cond_1
    iget-object v3, p0, Lcom/google/inject/internal/PrivateElementsImpl;->exposedKeysToSources:Lcom/google/inject/internal/util/$ImmutableMap;

    invoke-virtual {v3}, Lcom/google/inject/internal/util/$ImmutableMap;->keySet()Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v3

    return-object v3
.end method

.method public getExposedSource(Lcom/google/inject/Key;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Key",
            "<*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .prologue
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<*>;"
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 126
    invoke-virtual {p0}, Lcom/google/inject/internal/PrivateElementsImpl;->getExposedKeys()Ljava/util/Set;

    .line 127
    iget-object v1, p0, Lcom/google/inject/internal/PrivateElementsImpl;->exposedKeysToSources:Lcom/google/inject/internal/util/$ImmutableMap;

    invoke-virtual {v1, p1}, Lcom/google/inject/internal/util/$ImmutableMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 128
    .local v0, "source":Ljava/lang/Object;
    if-eqz v0, :cond_0

    move v1, v2

    :goto_0
    const-string v4, "%s not exposed by %s."

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    aput-object p1, v5, v3

    aput-object p0, v5, v2

    invoke-static {v1, v4, v5}, Lcom/google/inject/internal/util/$Preconditions;->checkArgument(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 129
    return-object v0

    :cond_0
    move v1, v3

    .line 128
    goto :goto_0
.end method

.method public getInjector()Lcom/google/inject/Injector;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lcom/google/inject/internal/PrivateElementsImpl;->injector:Lcom/google/inject/Injector;

    return-object v0
.end method

.method public getSource()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/google/inject/internal/PrivateElementsImpl;->source:Ljava/lang/Object;

    return-object v0
.end method

.method public initInjector(Lcom/google/inject/Injector;)V
    .locals 2
    .param p1, "injector"    # Lcom/google/inject/Injector;

    .prologue
    .line 83
    iget-object v0, p0, Lcom/google/inject/internal/PrivateElementsImpl;->injector:Lcom/google/inject/Injector;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "injector already initialized"

    invoke-static {v0, v1}, Lcom/google/inject/internal/util/$Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 84
    const-string v0, "injector"

    invoke-static {p1, v0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/Injector;

    iput-object v0, p0, Lcom/google/inject/internal/PrivateElementsImpl;->injector:Lcom/google/inject/Injector;

    .line 85
    return-void

    .line 83
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 133
    new-instance v0, Lcom/google/inject/internal/util/$ToStringBuilder;

    const-class v1, Lcom/google/inject/spi/PrivateElements;

    invoke-direct {v0, v1}, Lcom/google/inject/internal/util/$ToStringBuilder;-><init>(Ljava/lang/Class;)V

    const-string v1, "exposedKeys"

    invoke-virtual {p0}, Lcom/google/inject/internal/PrivateElementsImpl;->getExposedKeys()Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ToStringBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ToStringBuilder;

    move-result-object v0

    const-string v1, "source"

    invoke-virtual {p0}, Lcom/google/inject/internal/PrivateElementsImpl;->getSource()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ToStringBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ToStringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/inject/internal/util/$ToStringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
