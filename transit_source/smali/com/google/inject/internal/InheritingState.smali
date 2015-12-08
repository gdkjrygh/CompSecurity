.class final Lcom/google/inject/internal/InheritingState;
.super Ljava/lang/Object;
.source "InheritingState.java"

# interfaces
.implements Lcom/google/inject/internal/State;


# instance fields
.field private final blacklistedKeys:Lcom/google/inject/internal/WeakKeySet;

.field private final converters:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/spi/TypeConverterBinding;",
            ">;"
        }
    .end annotation
.end field

.field private final explicitBindings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/inject/Key",
            "<*>;",
            "Lcom/google/inject/Binding",
            "<*>;>;"
        }
    .end annotation
.end field

.field private final explicitBindingsMutable:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/inject/Key",
            "<*>;",
            "Lcom/google/inject/Binding",
            "<*>;>;"
        }
    .end annotation
.end field

.field private final listenerBindings:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/spi/TypeListenerBinding;",
            ">;"
        }
    .end annotation
.end field

.field private final lock:Ljava/lang/Object;

.field private final parent:Lcom/google/inject/internal/State;

.field private final scopes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Lcom/google/inject/Scope;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/inject/internal/State;)V
    .locals 1
    .param p1, "parent"    # Lcom/google/inject/internal/State;

    .prologue
    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    invoke-static {}, Lcom/google/inject/internal/util/$Maps;->newLinkedHashMap()Ljava/util/LinkedHashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/InheritingState;->explicitBindingsMutable:Ljava/util/Map;

    .line 45
    iget-object v0, p0, Lcom/google/inject/internal/InheritingState;->explicitBindingsMutable:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/InheritingState;->explicitBindings:Ljava/util/Map;

    .line 47
    invoke-static {}, Lcom/google/inject/internal/util/$Maps;->newHashMap()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/InheritingState;->scopes:Ljava/util/Map;

    .line 48
    invoke-static {}, Lcom/google/inject/internal/util/$Lists;->newArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/InheritingState;->converters:Ljava/util/List;

    .line 52
    invoke-static {}, Lcom/google/inject/internal/util/$Lists;->newArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/InheritingState;->listenerBindings:Ljava/util/List;

    .line 53
    new-instance v0, Lcom/google/inject/internal/WeakKeySet;

    invoke-direct {v0}, Lcom/google/inject/internal/WeakKeySet;-><init>()V

    iput-object v0, p0, Lcom/google/inject/internal/InheritingState;->blacklistedKeys:Lcom/google/inject/internal/WeakKeySet;

    .line 57
    const-string v0, "parent"

    invoke-static {p1, v0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/internal/State;

    iput-object v0, p0, Lcom/google/inject/internal/InheritingState;->parent:Lcom/google/inject/internal/State;

    .line 58
    sget-object v0, Lcom/google/inject/internal/State;->NONE:Lcom/google/inject/internal/State;

    if-ne p1, v0, :cond_0

    move-object v0, p0

    :goto_0
    iput-object v0, p0, Lcom/google/inject/internal/InheritingState;->lock:Ljava/lang/Object;

    .line 59
    return-void

    .line 58
    :cond_0
    invoke-interface {p1}, Lcom/google/inject/internal/State;->lock()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public addConverter(Lcom/google/inject/spi/TypeConverterBinding;)V
    .locals 1
    .param p1, "typeConverterBinding"    # Lcom/google/inject/spi/TypeConverterBinding;

    .prologue
    .line 93
    iget-object v0, p0, Lcom/google/inject/internal/InheritingState;->converters:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 94
    return-void
.end method

.method public addTypeListener(Lcom/google/inject/spi/TypeListenerBinding;)V
    .locals 1
    .param p1, "listenerBinding"    # Lcom/google/inject/spi/TypeListenerBinding;

    .prologue
    .line 126
    iget-object v0, p0, Lcom/google/inject/internal/InheritingState;->listenerBindings:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 127
    return-void
.end method

.method public blacklist(Lcom/google/inject/Key;Ljava/lang/Object;)V
    .locals 1
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
    .line 139
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<*>;"
    iget-object v0, p0, Lcom/google/inject/internal/InheritingState;->parent:Lcom/google/inject/internal/State;

    invoke-interface {v0, p1, p2}, Lcom/google/inject/internal/State;->blacklist(Lcom/google/inject/Key;Ljava/lang/Object;)V

    .line 140
    iget-object v0, p0, Lcom/google/inject/internal/InheritingState;->blacklistedKeys:Lcom/google/inject/internal/WeakKeySet;

    invoke-virtual {v0, p1, p2}, Lcom/google/inject/internal/WeakKeySet;->add(Lcom/google/inject/Key;Ljava/lang/Object;)V

    .line 141
    return-void
.end method

.method public getConverter(Ljava/lang/String;Lcom/google/inject/TypeLiteral;Lcom/google/inject/internal/Errors;Ljava/lang/Object;)Lcom/google/inject/spi/TypeConverterBinding;
    .locals 8
    .param p1, "stringValue"    # Ljava/lang/String;
    .param p3, "errors"    # Lcom/google/inject/internal/Errors;
    .param p4, "source"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/inject/TypeLiteral",
            "<*>;",
            "Lcom/google/inject/internal/Errors;",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/inject/spi/TypeConverterBinding;"
        }
    .end annotation

    .prologue
    .line 98
    .local p2, "type":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<*>;"
    const/4 v4, 0x0

    .line 99
    .local v4, "matchingConverter":Lcom/google/inject/spi/TypeConverterBinding;
    move-object v7, p0

    .local v7, "s":Lcom/google/inject/internal/State;
    :goto_0
    sget-object v0, Lcom/google/inject/internal/State;->NONE:Lcom/google/inject/internal/State;

    if-eq v7, v0, :cond_3

    .line 100
    invoke-interface {v7}, Lcom/google/inject/internal/State;->getConvertersThisLevel()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .local v6, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/inject/spi/TypeConverterBinding;

    .line 101
    .local v5, "converter":Lcom/google/inject/spi/TypeConverterBinding;
    invoke-virtual {v5}, Lcom/google/inject/spi/TypeConverterBinding;->getTypeMatcher()Lcom/google/inject/matcher/Matcher;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/google/inject/matcher/Matcher;->matches(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 102
    if-eqz v4, :cond_1

    move-object v0, p3

    move-object v1, p1

    move-object v2, p4

    move-object v3, p2

    .line 103
    invoke-virtual/range {v0 .. v5}, Lcom/google/inject/internal/Errors;->ambiguousTypeConversion(Ljava/lang/String;Ljava/lang/Object;Lcom/google/inject/TypeLiteral;Lcom/google/inject/spi/TypeConverterBinding;Lcom/google/inject/spi/TypeConverterBinding;)Lcom/google/inject/internal/Errors;

    .line 105
    :cond_1
    move-object v4, v5

    goto :goto_1

    .line 99
    .end local v5    # "converter":Lcom/google/inject/spi/TypeConverterBinding;
    :cond_2
    invoke-interface {v7}, Lcom/google/inject/internal/State;->parent()Lcom/google/inject/internal/State;

    move-result-object v7

    goto :goto_0

    .line 109
    .end local v6    # "i$":Ljava/util/Iterator;
    :cond_3
    return-object v4
.end method

.method public getConvertersThisLevel()Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable",
            "<",
            "Lcom/google/inject/spi/TypeConverterBinding;",
            ">;"
        }
    .end annotation

    .prologue
    .line 89
    iget-object v0, p0, Lcom/google/inject/internal/InheritingState;->converters:Ljava/util/List;

    return-object v0
.end method

.method public getExplicitBinding(Lcom/google/inject/Key;)Lcom/google/inject/internal/BindingImpl;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/Key",
            "<TT;>;)",
            "Lcom/google/inject/internal/BindingImpl",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 67
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<TT;>;"
    iget-object v1, p0, Lcom/google/inject/internal/InheritingState;->explicitBindings:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/Binding;

    .line 68
    .local v0, "binding":Lcom/google/inject/Binding;, "Lcom/google/inject/Binding<*>;"
    if-eqz v0, :cond_0

    check-cast v0, Lcom/google/inject/internal/BindingImpl;

    .end local v0    # "binding":Lcom/google/inject/Binding;, "Lcom/google/inject/Binding<*>;"
    :goto_0
    return-object v0

    .restart local v0    # "binding":Lcom/google/inject/Binding;, "Lcom/google/inject/Binding<*>;"
    :cond_0
    iget-object v1, p0, Lcom/google/inject/internal/InheritingState;->parent:Lcom/google/inject/internal/State;

    invoke-interface {v1, p1}, Lcom/google/inject/internal/State;->getExplicitBinding(Lcom/google/inject/Key;)Lcom/google/inject/internal/BindingImpl;

    move-result-object v0

    goto :goto_0
.end method

.method public getExplicitBindingsThisLevel()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Lcom/google/inject/Key",
            "<*>;",
            "Lcom/google/inject/Binding",
            "<*>;>;"
        }
    .end annotation

    .prologue
    .line 72
    iget-object v0, p0, Lcom/google/inject/internal/InheritingState;->explicitBindings:Ljava/util/Map;

    return-object v0
.end method

.method public getScope(Ljava/lang/Class;)Lcom/google/inject/Scope;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Lcom/google/inject/Scope;"
        }
    .end annotation

    .prologue
    .line 80
    .local p1, "annotationType":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    iget-object v1, p0, Lcom/google/inject/internal/InheritingState;->scopes:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/Scope;

    .line 81
    .local v0, "scope":Lcom/google/inject/Scope;
    if-eqz v0, :cond_0

    .end local v0    # "scope":Lcom/google/inject/Scope;
    :goto_0
    return-object v0

    .restart local v0    # "scope":Lcom/google/inject/Scope;
    :cond_0
    iget-object v1, p0, Lcom/google/inject/internal/InheritingState;->parent:Lcom/google/inject/internal/State;

    invoke-interface {v1, p1}, Lcom/google/inject/internal/State;->getScope(Ljava/lang/Class;)Lcom/google/inject/Scope;

    move-result-object v0

    goto :goto_0
.end method

.method public getScopes()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Lcom/google/inject/Scope;",
            ">;"
        }
    .end annotation

    .prologue
    .line 156
    iget-object v0, p0, Lcom/google/inject/internal/InheritingState;->scopes:Ljava/util/Map;

    return-object v0
.end method

.method public getSourcesForBlacklistedKey(Lcom/google/inject/Key;)Ljava/util/Set;
    .locals 1
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
    .line 148
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<*>;"
    iget-object v0, p0, Lcom/google/inject/internal/InheritingState;->blacklistedKeys:Lcom/google/inject/internal/WeakKeySet;

    invoke-virtual {v0, p1}, Lcom/google/inject/internal/WeakKeySet;->getSources(Lcom/google/inject/Key;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getTypeListenerBindings()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/spi/TypeListenerBinding;",
            ">;"
        }
    .end annotation

    .prologue
    .line 130
    iget-object v2, p0, Lcom/google/inject/internal/InheritingState;->parent:Lcom/google/inject/internal/State;

    invoke-interface {v2}, Lcom/google/inject/internal/State;->getTypeListenerBindings()Ljava/util/List;

    move-result-object v0

    .line 131
    .local v0, "parentBindings":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/spi/TypeListenerBinding;>;"
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 133
    .local v1, "result":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/spi/TypeListenerBinding;>;"
    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 134
    iget-object v2, p0, Lcom/google/inject/internal/InheritingState;->listenerBindings:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 135
    return-object v1
.end method

.method public isBlacklisted(Lcom/google/inject/Key;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Key",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 144
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<*>;"
    iget-object v0, p0, Lcom/google/inject/internal/InheritingState;->blacklistedKeys:Lcom/google/inject/internal/WeakKeySet;

    invoke-virtual {v0, p1}, Lcom/google/inject/internal/WeakKeySet;->contains(Lcom/google/inject/Key;)Z

    move-result v0

    return v0
.end method

.method public lock()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 152
    iget-object v0, p0, Lcom/google/inject/internal/InheritingState;->lock:Ljava/lang/Object;

    return-object v0
.end method

.method public parent()Lcom/google/inject/internal/State;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/google/inject/internal/InheritingState;->parent:Lcom/google/inject/internal/State;

    return-object v0
.end method

.method public putAnnotation(Ljava/lang/Class;Lcom/google/inject/Scope;)V
    .locals 1
    .param p2, "scope"    # Lcom/google/inject/Scope;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Lcom/google/inject/Scope;",
            ")V"
        }
    .end annotation

    .prologue
    .line 85
    .local p1, "annotationType":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    iget-object v0, p0, Lcom/google/inject/internal/InheritingState;->scopes:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    return-void
.end method

.method public putBinding(Lcom/google/inject/Key;Lcom/google/inject/internal/BindingImpl;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Key",
            "<*>;",
            "Lcom/google/inject/internal/BindingImpl",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 76
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<*>;"
    .local p2, "binding":Lcom/google/inject/internal/BindingImpl;, "Lcom/google/inject/internal/BindingImpl<*>;"
    iget-object v0, p0, Lcom/google/inject/internal/InheritingState;->explicitBindingsMutable:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    return-void
.end method
