.class final Lcom/google/inject/internal/MembersInjectorStore;
.super Ljava/lang/Object;
.source "MembersInjectorStore.java"


# instance fields
.field private final cache:Lcom/google/inject/internal/FailableCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/FailableCache",
            "<",
            "Lcom/google/inject/TypeLiteral",
            "<*>;",
            "Lcom/google/inject/internal/MembersInjectorImpl",
            "<*>;>;"
        }
    .end annotation
.end field

.field private final injector:Lcom/google/inject/internal/InjectorImpl;

.field private final typeListenerBindings:Lcom/google/inject/internal/util/$ImmutableList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$ImmutableList",
            "<",
            "Lcom/google/inject/spi/TypeListenerBinding;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/inject/internal/InjectorImpl;Ljava/util/List;)V
    .locals 1
    .param p1, "injector"    # Lcom/google/inject/internal/InjectorImpl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/InjectorImpl;",
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/spi/TypeListenerBinding;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 47
    .local p2, "typeListenerBindings":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/spi/TypeListenerBinding;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    new-instance v0, Lcom/google/inject/internal/MembersInjectorStore$1;

    invoke-direct {v0, p0}, Lcom/google/inject/internal/MembersInjectorStore$1;-><init>(Lcom/google/inject/internal/MembersInjectorStore;)V

    iput-object v0, p0, Lcom/google/inject/internal/MembersInjectorStore;->cache:Lcom/google/inject/internal/FailableCache;

    .line 48
    iput-object p1, p0, Lcom/google/inject/internal/MembersInjectorStore;->injector:Lcom/google/inject/internal/InjectorImpl;

    .line 49
    invoke-static {p2}, Lcom/google/inject/internal/util/$ImmutableList;->copyOf(Ljava/lang/Iterable;)Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/MembersInjectorStore;->typeListenerBindings:Lcom/google/inject/internal/util/$ImmutableList;

    .line 50
    return-void
.end method

.method static synthetic access$000(Lcom/google/inject/internal/MembersInjectorStore;Lcom/google/inject/TypeLiteral;Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/MembersInjectorImpl;
    .locals 1
    .param p0, "x0"    # Lcom/google/inject/internal/MembersInjectorStore;
    .param p1, "x1"    # Lcom/google/inject/TypeLiteral;
    .param p2, "x2"    # Lcom/google/inject/internal/Errors;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/ErrorsException;
        }
    .end annotation

    .prologue
    .line 34
    invoke-direct {p0, p1, p2}, Lcom/google/inject/internal/MembersInjectorStore;->createWithListeners(Lcom/google/inject/TypeLiteral;Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/MembersInjectorImpl;

    move-result-object v0

    return-object v0
.end method

.method private createWithListeners(Lcom/google/inject/TypeLiteral;Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/MembersInjectorImpl;
    .locals 9
    .param p2, "errors"    # Lcom/google/inject/internal/Errors;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/TypeLiteral",
            "<TT;>;",
            "Lcom/google/inject/internal/Errors;",
            ")",
            "Lcom/google/inject/internal/MembersInjectorImpl",
            "<TT;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/ErrorsException;
        }
    .end annotation

    .prologue
    .line 86
    .local p1, "type":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<TT;>;"
    invoke-virtual {p2}, Lcom/google/inject/internal/Errors;->size()I

    move-result v5

    .line 90
    .local v5, "numErrorsBefore":I
    :try_start_0
    invoke-static {p1}, Lcom/google/inject/spi/InjectionPoint;->forInstanceMethodsAndFields(Lcom/google/inject/TypeLiteral;)Ljava/util/Set;
    :try_end_0
    .catch Lcom/google/inject/ConfigurationException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v3

    .line 95
    .local v3, "injectionPoints":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/inject/spi/InjectionPoint;>;"
    :goto_0
    invoke-virtual {p0, v3, p2}, Lcom/google/inject/internal/MembersInjectorStore;->getInjectors(Ljava/util/Set;Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v4

    .line 96
    .local v4, "injectors":Lcom/google/inject/internal/util/$ImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList<Lcom/google/inject/internal/SingleMemberInjector;>;"
    invoke-virtual {p2, v5}, Lcom/google/inject/internal/Errors;->throwIfNewErrors(I)V

    .line 98
    new-instance v1, Lcom/google/inject/internal/EncounterImpl;

    iget-object v7, p0, Lcom/google/inject/internal/MembersInjectorStore;->injector:Lcom/google/inject/internal/InjectorImpl;

    iget-object v7, v7, Lcom/google/inject/internal/InjectorImpl;->lookups:Lcom/google/inject/internal/Lookups;

    invoke-direct {v1, p2, v7}, Lcom/google/inject/internal/EncounterImpl;-><init>(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/Lookups;)V

    .line 99
    .local v1, "encounter":Lcom/google/inject/internal/EncounterImpl;, "Lcom/google/inject/internal/EncounterImpl<TT;>;"
    iget-object v7, p0, Lcom/google/inject/internal/MembersInjectorStore;->typeListenerBindings:Lcom/google/inject/internal/util/$ImmutableList;

    invoke-virtual {v7}, Lcom/google/inject/internal/util/$ImmutableList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/inject/spi/TypeListenerBinding;

    .line 100
    .local v6, "typeListener":Lcom/google/inject/spi/TypeListenerBinding;
    invoke-virtual {v6}, Lcom/google/inject/spi/TypeListenerBinding;->getTypeMatcher()Lcom/google/inject/matcher/Matcher;

    move-result-object v7

    invoke-interface {v7, p1}, Lcom/google/inject/matcher/Matcher;->matches(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 102
    :try_start_1
    invoke-virtual {v6}, Lcom/google/inject/spi/TypeListenerBinding;->getListener()Lcom/google/inject/spi/TypeListener;

    move-result-object v7

    invoke-interface {v7, p1, v1}, Lcom/google/inject/spi/TypeListener;->hear(Lcom/google/inject/TypeLiteral;Lcom/google/inject/spi/TypeEncounter;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 103
    :catch_0
    move-exception v0

    .line 104
    .local v0, "e":Ljava/lang/RuntimeException;
    invoke-virtual {p2, v6, p1, v0}, Lcom/google/inject/internal/Errors;->errorNotifyingTypeListener(Lcom/google/inject/spi/TypeListenerBinding;Lcom/google/inject/TypeLiteral;Ljava/lang/Throwable;)Lcom/google/inject/internal/Errors;

    goto :goto_1

    .line 91
    .end local v0    # "e":Ljava/lang/RuntimeException;
    .end local v1    # "encounter":Lcom/google/inject/internal/EncounterImpl;, "Lcom/google/inject/internal/EncounterImpl<TT;>;"
    .end local v2    # "i$":Ljava/util/Iterator;
    .end local v3    # "injectionPoints":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/inject/spi/InjectionPoint;>;"
    .end local v4    # "injectors":Lcom/google/inject/internal/util/$ImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList<Lcom/google/inject/internal/SingleMemberInjector;>;"
    .end local v6    # "typeListener":Lcom/google/inject/spi/TypeListenerBinding;
    :catch_1
    move-exception v0

    .line 92
    .local v0, "e":Lcom/google/inject/ConfigurationException;
    invoke-virtual {v0}, Lcom/google/inject/ConfigurationException;->getErrorMessages()Ljava/util/Collection;

    move-result-object v7

    invoke-virtual {p2, v7}, Lcom/google/inject/internal/Errors;->merge(Ljava/util/Collection;)Lcom/google/inject/internal/Errors;

    .line 93
    invoke-virtual {v0}, Lcom/google/inject/ConfigurationException;->getPartialValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Set;

    .restart local v3    # "injectionPoints":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/inject/spi/InjectionPoint;>;"
    goto :goto_0

    .line 108
    .end local v0    # "e":Lcom/google/inject/ConfigurationException;
    .restart local v1    # "encounter":Lcom/google/inject/internal/EncounterImpl;, "Lcom/google/inject/internal/EncounterImpl<TT;>;"
    .restart local v2    # "i$":Ljava/util/Iterator;
    .restart local v4    # "injectors":Lcom/google/inject/internal/util/$ImmutableList;, "Lcom/google/inject/internal/util/$ImmutableList<Lcom/google/inject/internal/SingleMemberInjector;>;"
    :cond_1
    invoke-virtual {v1}, Lcom/google/inject/internal/EncounterImpl;->invalidate()V

    .line 109
    invoke-virtual {p2, v5}, Lcom/google/inject/internal/Errors;->throwIfNewErrors(I)V

    .line 111
    new-instance v7, Lcom/google/inject/internal/MembersInjectorImpl;

    iget-object v8, p0, Lcom/google/inject/internal/MembersInjectorStore;->injector:Lcom/google/inject/internal/InjectorImpl;

    invoke-direct {v7, v8, p1, v1, v4}, Lcom/google/inject/internal/MembersInjectorImpl;-><init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/TypeLiteral;Lcom/google/inject/internal/EncounterImpl;Lcom/google/inject/internal/util/$ImmutableList;)V

    return-object v7
.end method


# virtual methods
.method public get(Lcom/google/inject/TypeLiteral;Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/MembersInjectorImpl;
    .locals 1
    .param p2, "errors"    # Lcom/google/inject/internal/Errors;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/TypeLiteral",
            "<TT;>;",
            "Lcom/google/inject/internal/Errors;",
            ")",
            "Lcom/google/inject/internal/MembersInjectorImpl",
            "<TT;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/ErrorsException;
        }
    .end annotation

    .prologue
    .line 65
    .local p1, "key":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/MembersInjectorStore;->cache:Lcom/google/inject/internal/FailableCache;

    invoke-virtual {v0, p1, p2}, Lcom/google/inject/internal/FailableCache;->get(Ljava/lang/Object;Lcom/google/inject/internal/Errors;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/internal/MembersInjectorImpl;

    return-object v0
.end method

.method getInjectors(Ljava/util/Set;Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/util/$ImmutableList;
    .locals 6
    .param p2, "errors"    # Lcom/google/inject/internal/Errors;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Lcom/google/inject/spi/InjectionPoint;",
            ">;",
            "Lcom/google/inject/internal/Errors;",
            ")",
            "Lcom/google/inject/internal/util/$ImmutableList",
            "<",
            "Lcom/google/inject/internal/SingleMemberInjector;",
            ">;"
        }
    .end annotation

    .prologue
    .line 119
    .local p1, "injectionPoints":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/inject/spi/InjectionPoint;>;"
    invoke-static {}, Lcom/google/inject/internal/util/$Lists;->newArrayList()Ljava/util/ArrayList;

    move-result-object v4

    .line 120
    .local v4, "injectors":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/internal/SingleMemberInjector;>;"
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/inject/spi/InjectionPoint;

    .line 122
    .local v2, "injectionPoint":Lcom/google/inject/spi/InjectionPoint;
    :try_start_0
    invoke-virtual {v2}, Lcom/google/inject/spi/InjectionPoint;->isOptional()Z

    move-result v5

    if-eqz v5, :cond_0

    new-instance v0, Lcom/google/inject/internal/Errors;

    invoke-direct {v0, v2}, Lcom/google/inject/internal/Errors;-><init>(Ljava/lang/Object;)V

    .line 125
    .local v0, "errorsForMember":Lcom/google/inject/internal/Errors;
    :goto_1
    invoke-virtual {v2}, Lcom/google/inject/spi/InjectionPoint;->getMember()Ljava/lang/reflect/Member;

    move-result-object v5

    instance-of v5, v5, Ljava/lang/reflect/Field;

    if-eqz v5, :cond_1

    new-instance v3, Lcom/google/inject/internal/SingleFieldInjector;

    iget-object v5, p0, Lcom/google/inject/internal/MembersInjectorStore;->injector:Lcom/google/inject/internal/InjectorImpl;

    invoke-direct {v3, v5, v2, v0}, Lcom/google/inject/internal/SingleFieldInjector;-><init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/spi/InjectionPoint;Lcom/google/inject/internal/Errors;)V

    .line 128
    .local v3, "injector":Lcom/google/inject/internal/SingleMemberInjector;
    :goto_2
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 129
    .end local v0    # "errorsForMember":Lcom/google/inject/internal/Errors;
    .end local v3    # "injector":Lcom/google/inject/internal/SingleMemberInjector;
    :catch_0
    move-exception v5

    goto :goto_0

    .line 122
    :cond_0
    invoke-virtual {p2, v2}, Lcom/google/inject/internal/Errors;->withSource(Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    goto :goto_1

    .line 125
    .restart local v0    # "errorsForMember":Lcom/google/inject/internal/Errors;
    :cond_1
    new-instance v3, Lcom/google/inject/internal/SingleMethodInjector;

    iget-object v5, p0, Lcom/google/inject/internal/MembersInjectorStore;->injector:Lcom/google/inject/internal/InjectorImpl;

    invoke-direct {v3, v5, v2, v0}, Lcom/google/inject/internal/SingleMethodInjector;-><init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/spi/InjectionPoint;Lcom/google/inject/internal/Errors;)V
    :try_end_0
    .catch Lcom/google/inject/internal/ErrorsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 133
    .end local v0    # "errorsForMember":Lcom/google/inject/internal/Errors;
    .end local v2    # "injectionPoint":Lcom/google/inject/spi/InjectionPoint;
    :cond_2
    invoke-static {v4}, Lcom/google/inject/internal/util/$ImmutableList;->copyOf(Ljava/lang/Iterable;)Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v5

    return-object v5
.end method

.method public hasTypeListeners()Z
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/google/inject/internal/MembersInjectorStore;->typeListenerBindings:Lcom/google/inject/internal/util/$ImmutableList;

    invoke-virtual {v0}, Lcom/google/inject/internal/util/$ImmutableList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method remove(Lcom/google/inject/TypeLiteral;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/TypeLiteral",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 78
    .local p1, "type":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<*>;"
    iget-object v0, p0, Lcom/google/inject/internal/MembersInjectorStore;->cache:Lcom/google/inject/internal/FailableCache;

    invoke-virtual {v0, p1}, Lcom/google/inject/internal/FailableCache;->remove(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
