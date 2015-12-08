.class final Lcom/google/inject/internal/Initializer;
.super Ljava/lang/Object;
.source "Initializer.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/inject/internal/Initializer$InjectableReference;
    }
.end annotation


# instance fields
.field private final creatingThread:Ljava/lang/Thread;

.field private final pendingInjection:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Object;",
            "Lcom/google/inject/internal/Initializer$InjectableReference",
            "<*>;>;"
        }
    .end annotation
.end field

.field private final ready:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method constructor <init>()V
    .locals 2

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/Initializer;->creatingThread:Ljava/lang/Thread;

    .line 41
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lcom/google/inject/internal/Initializer;->ready:Ljava/util/concurrent/CountDownLatch;

    .line 44
    invoke-static {}, Lcom/google/inject/internal/util/$Maps;->newIdentityHashMap()Ljava/util/IdentityHashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/Initializer;->pendingInjection:Ljava/util/Map;

    .line 105
    return-void
.end method

.method static synthetic access$000(Lcom/google/inject/internal/Initializer;)Ljava/util/concurrent/CountDownLatch;
    .locals 1
    .param p0, "x0"    # Lcom/google/inject/internal/Initializer;

    .prologue
    .line 36
    iget-object v0, p0, Lcom/google/inject/internal/Initializer;->ready:Ljava/util/concurrent/CountDownLatch;

    return-object v0
.end method

.method static synthetic access$100(Lcom/google/inject/internal/Initializer;)Ljava/lang/Thread;
    .locals 1
    .param p0, "x0"    # Lcom/google/inject/internal/Initializer;

    .prologue
    .line 36
    iget-object v0, p0, Lcom/google/inject/internal/Initializer;->creatingThread:Ljava/lang/Thread;

    return-object v0
.end method

.method static synthetic access$200(Lcom/google/inject/internal/Initializer;)Ljava/util/Map;
    .locals 1
    .param p0, "x0"    # Lcom/google/inject/internal/Initializer;

    .prologue
    .line 36
    iget-object v0, p0, Lcom/google/inject/internal/Initializer;->pendingInjection:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method injectAll(Lcom/google/inject/internal/Errors;)V
    .locals 6
    .param p1, "errors"    # Lcom/google/inject/internal/Errors;

    .prologue
    .line 90
    iget-object v3, p0, Lcom/google/inject/internal/Initializer;->pendingInjection:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-static {v3}, Lcom/google/inject/internal/util/$Lists;->newArrayList(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/inject/internal/Initializer$InjectableReference;

    .line 92
    .local v2, "reference":Lcom/google/inject/internal/Initializer$InjectableReference;, "Lcom/google/inject/internal/Initializer$InjectableReference<*>;"
    :try_start_0
    invoke-virtual {v2, p1}, Lcom/google/inject/internal/Initializer$InjectableReference;->get(Lcom/google/inject/internal/Errors;)Ljava/lang/Object;
    :try_end_0
    .catch Lcom/google/inject/internal/ErrorsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 93
    :catch_0
    move-exception v0

    .line 94
    .local v0, "e":Lcom/google/inject/internal/ErrorsException;
    invoke-virtual {v0}, Lcom/google/inject/internal/ErrorsException;->getErrors()Lcom/google/inject/internal/Errors;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/google/inject/internal/Errors;->merge(Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/Errors;

    goto :goto_0

    .line 98
    .end local v0    # "e":Lcom/google/inject/internal/ErrorsException;
    .end local v2    # "reference":Lcom/google/inject/internal/Initializer$InjectableReference;, "Lcom/google/inject/internal/Initializer$InjectableReference<*>;"
    :cond_0
    iget-object v3, p0, Lcom/google/inject/internal/Initializer;->pendingInjection:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    .line 99
    new-instance v3, Ljava/lang/AssertionError;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Failed to satisfy "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/google/inject/internal/Initializer;->pendingInjection:Ljava/util/Map;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v3

    .line 102
    :cond_1
    iget-object v3, p0, Lcom/google/inject/internal/Initializer;->ready:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v3}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 103
    return-void
.end method

.method requestInjection(Lcom/google/inject/internal/InjectorImpl;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Set;)Lcom/google/inject/internal/Initializable;
    .locals 2
    .param p1, "injector"    # Lcom/google/inject/internal/InjectorImpl;
    .param p3, "source"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/internal/InjectorImpl;",
            "TT;",
            "Ljava/lang/Object;",
            "Ljava/util/Set",
            "<",
            "Lcom/google/inject/spi/InjectionPoint;",
            ">;)",
            "Lcom/google/inject/internal/Initializable",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 55
    .local p2, "instance":Ljava/lang/Object;, "TT;"
    .local p4, "injectionPoints":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/inject/spi/InjectionPoint;>;"
    invoke-static {p3}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    if-eqz p2, :cond_0

    invoke-interface {p4}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p1, Lcom/google/inject/internal/InjectorImpl;->membersInjectorStore:Lcom/google/inject/internal/MembersInjectorStore;

    invoke-virtual {v1}, Lcom/google/inject/internal/MembersInjectorStore;->hasTypeListeners()Z

    move-result v1

    if-nez v1, :cond_1

    .line 60
    :cond_0
    invoke-static {p2}, Lcom/google/inject/internal/Initializables;->of(Ljava/lang/Object;)Lcom/google/inject/internal/Initializable;

    move-result-object v0

    .line 65
    :goto_0
    return-object v0

    .line 63
    :cond_1
    new-instance v0, Lcom/google/inject/internal/Initializer$InjectableReference;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/inject/internal/Initializer$InjectableReference;-><init>(Lcom/google/inject/internal/Initializer;Lcom/google/inject/internal/InjectorImpl;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 64
    .local v0, "initializable":Lcom/google/inject/internal/Initializer$InjectableReference;, "Lcom/google/inject/internal/Initializer$InjectableReference<TT;>;"
    iget-object v1, p0, Lcom/google/inject/internal/Initializer;->pendingInjection:Ljava/util/Map;

    invoke-interface {v1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method validateOustandingInjections(Lcom/google/inject/internal/Errors;)V
    .locals 4
    .param p1, "errors"    # Lcom/google/inject/internal/Errors;

    .prologue
    .line 73
    iget-object v3, p0, Lcom/google/inject/internal/Initializer;->pendingInjection:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/inject/internal/Initializer$InjectableReference;

    .line 75
    .local v2, "reference":Lcom/google/inject/internal/Initializer$InjectableReference;, "Lcom/google/inject/internal/Initializer$InjectableReference<*>;"
    :try_start_0
    invoke-virtual {v2, p1}, Lcom/google/inject/internal/Initializer$InjectableReference;->validate(Lcom/google/inject/internal/Errors;)V
    :try_end_0
    .catch Lcom/google/inject/internal/ErrorsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 76
    :catch_0
    move-exception v0

    .line 77
    .local v0, "e":Lcom/google/inject/internal/ErrorsException;
    invoke-virtual {v0}, Lcom/google/inject/internal/ErrorsException;->getErrors()Lcom/google/inject/internal/Errors;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/google/inject/internal/Errors;->merge(Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/Errors;

    goto :goto_0

    .line 80
    .end local v0    # "e":Lcom/google/inject/internal/ErrorsException;
    .end local v2    # "reference":Lcom/google/inject/internal/Initializer$InjectableReference;, "Lcom/google/inject/internal/Initializer$InjectableReference<*>;"
    :cond_0
    return-void
.end method
