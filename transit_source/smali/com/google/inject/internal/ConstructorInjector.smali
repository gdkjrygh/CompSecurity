.class final Lcom/google/inject/internal/ConstructorInjector;
.super Ljava/lang/Object;
.source "ConstructorInjector.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final constructionProxy:Lcom/google/inject/internal/ConstructionProxy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/ConstructionProxy",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final injectableMembers:Lcom/google/inject/internal/util/$ImmutableSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$ImmutableSet",
            "<",
            "Lcom/google/inject/spi/InjectionPoint;",
            ">;"
        }
    .end annotation
.end field

.field private final membersInjector:Lcom/google/inject/internal/MembersInjectorImpl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/MembersInjectorImpl",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final parameterInjectors:[Lcom/google/inject/internal/SingleParameterInjector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lcom/google/inject/internal/SingleParameterInjector",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/Set;Lcom/google/inject/internal/ConstructionProxy;[Lcom/google/inject/internal/SingleParameterInjector;Lcom/google/inject/internal/MembersInjectorImpl;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Lcom/google/inject/spi/InjectionPoint;",
            ">;",
            "Lcom/google/inject/internal/ConstructionProxy",
            "<TT;>;[",
            "Lcom/google/inject/internal/SingleParameterInjector",
            "<*>;",
            "Lcom/google/inject/internal/MembersInjectorImpl",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 40
    .local p0, "this":Lcom/google/inject/internal/ConstructorInjector;, "Lcom/google/inject/internal/ConstructorInjector<TT;>;"
    .local p1, "injectableMembers":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/inject/spi/InjectionPoint;>;"
    .local p2, "constructionProxy":Lcom/google/inject/internal/ConstructionProxy;, "Lcom/google/inject/internal/ConstructionProxy<TT;>;"
    .local p3, "parameterInjectors":[Lcom/google/inject/internal/SingleParameterInjector;, "[Lcom/google/inject/internal/SingleParameterInjector<*>;"
    .local p4, "membersInjector":Lcom/google/inject/internal/MembersInjectorImpl;, "Lcom/google/inject/internal/MembersInjectorImpl<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    invoke-static {p1}, Lcom/google/inject/internal/util/$ImmutableSet;->copyOf(Ljava/lang/Iterable;)Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/ConstructorInjector;->injectableMembers:Lcom/google/inject/internal/util/$ImmutableSet;

    .line 42
    iput-object p2, p0, Lcom/google/inject/internal/ConstructorInjector;->constructionProxy:Lcom/google/inject/internal/ConstructionProxy;

    .line 43
    iput-object p3, p0, Lcom/google/inject/internal/ConstructorInjector;->parameterInjectors:[Lcom/google/inject/internal/SingleParameterInjector;

    .line 44
    iput-object p4, p0, Lcom/google/inject/internal/ConstructorInjector;->membersInjector:Lcom/google/inject/internal/MembersInjectorImpl;

    .line 45
    return-void
.end method


# virtual methods
.method construct(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/InternalContext;Ljava/lang/Class;Z)Ljava/lang/Object;
    .locals 7
    .param p1, "errors"    # Lcom/google/inject/internal/Errors;
    .param p2, "context"    # Lcom/google/inject/internal/InternalContext;
    .param p4, "allowProxy"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/Errors;",
            "Lcom/google/inject/internal/InternalContext;",
            "Ljava/lang/Class",
            "<*>;Z)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/ErrorsException;
        }
    .end annotation

    .prologue
    .line 61
    .local p0, "this":Lcom/google/inject/internal/ConstructorInjector;, "Lcom/google/inject/internal/ConstructorInjector<TT;>;"
    .local p3, "expectedType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {p2, p0}, Lcom/google/inject/internal/InternalContext;->getConstructionContext(Ljava/lang/Object;)Lcom/google/inject/internal/ConstructionContext;

    move-result-object v1

    .line 64
    .local v1, "constructionContext":Lcom/google/inject/internal/ConstructionContext;, "Lcom/google/inject/internal/ConstructionContext<TT;>;"
    invoke-virtual {v1}, Lcom/google/inject/internal/ConstructionContext;->isConstructing()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 65
    if-nez p4, :cond_0

    .line 66
    invoke-virtual {p1, p3}, Lcom/google/inject/internal/Errors;->circularProxiesDisabled(Ljava/lang/Class;)Lcom/google/inject/internal/Errors;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/inject/internal/Errors;->toException()Lcom/google/inject/internal/ErrorsException;

    move-result-object v5

    throw v5

    .line 69
    :cond_0
    invoke-virtual {v1, p1, p3}, Lcom/google/inject/internal/ConstructionContext;->createProxy(Lcom/google/inject/internal/Errors;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    .line 105
    :cond_1
    :goto_0
    return-object v3

    .line 75
    :cond_2
    invoke-virtual {v1}, Lcom/google/inject/internal/ConstructionContext;->getCurrentReference()Ljava/lang/Object;

    move-result-object v3

    .line 76
    .local v3, "t":Ljava/lang/Object;, "TT;"
    if-nez v3, :cond_1

    .line 82
    :try_start_0
    invoke-virtual {v1}, Lcom/google/inject/internal/ConstructionContext;->startConstruction()V
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 84
    :try_start_1
    iget-object v5, p0, Lcom/google/inject/internal/ConstructorInjector;->parameterInjectors:[Lcom/google/inject/internal/SingleParameterInjector;

    invoke-static {p1, p2, v5}, Lcom/google/inject/internal/SingleParameterInjector;->getAll(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/InternalContext;[Lcom/google/inject/internal/SingleParameterInjector;)[Ljava/lang/Object;

    move-result-object v2

    .line 85
    .local v2, "parameters":[Ljava/lang/Object;
    iget-object v5, p0, Lcom/google/inject/internal/ConstructorInjector;->constructionProxy:Lcom/google/inject/internal/ConstructionProxy;

    invoke-interface {v5, v2}, Lcom/google/inject/internal/ConstructionProxy;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 86
    invoke-virtual {v1, v3}, Lcom/google/inject/internal/ConstructionContext;->setProxyDelegates(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 88
    :try_start_2
    invoke-virtual {v1}, Lcom/google/inject/internal/ConstructionContext;->finishConstruction()V

    .line 92
    invoke-virtual {v1, v3}, Lcom/google/inject/internal/ConstructionContext;->setCurrentReference(Ljava/lang/Object;)V

    .line 94
    iget-object v5, p0, Lcom/google/inject/internal/ConstructorInjector;->membersInjector:Lcom/google/inject/internal/MembersInjectorImpl;

    const/4 v6, 0x0

    invoke-virtual {v5, v3, p1, p2, v6}, Lcom/google/inject/internal/MembersInjectorImpl;->injectMembers(Ljava/lang/Object;Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/InternalContext;Z)V

    .line 95
    iget-object v5, p0, Lcom/google/inject/internal/ConstructorInjector;->membersInjector:Lcom/google/inject/internal/MembersInjectorImpl;

    invoke-virtual {v5, v3, p1}, Lcom/google/inject/internal/MembersInjectorImpl;->notifyListeners(Ljava/lang/Object;Lcom/google/inject/internal/Errors;)V
    :try_end_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 105
    invoke-virtual {v1}, Lcom/google/inject/internal/ConstructionContext;->removeCurrentReference()V

    goto :goto_0

    .line 88
    .end local v2    # "parameters":[Ljava/lang/Object;
    :catchall_0
    move-exception v5

    :try_start_3
    invoke-virtual {v1}, Lcom/google/inject/internal/ConstructionContext;->finishConstruction()V

    throw v5
    :try_end_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 98
    :catch_0
    move-exception v4

    .line 99
    .local v4, "userException":Ljava/lang/reflect/InvocationTargetException;
    :try_start_4
    invoke-virtual {v4}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {v4}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 102
    .local v0, "cause":Ljava/lang/Throwable;
    :goto_1
    iget-object v5, p0, Lcom/google/inject/internal/ConstructorInjector;->constructionProxy:Lcom/google/inject/internal/ConstructionProxy;

    invoke-interface {v5}, Lcom/google/inject/internal/ConstructionProxy;->getInjectionPoint()Lcom/google/inject/spi/InjectionPoint;

    move-result-object v5

    invoke-virtual {p1, v5}, Lcom/google/inject/internal/Errors;->withSource(Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v5

    invoke-virtual {v5, v0}, Lcom/google/inject/internal/Errors;->errorInjectingConstructor(Ljava/lang/Throwable;)Lcom/google/inject/internal/Errors;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/inject/internal/Errors;->toException()Lcom/google/inject/internal/ErrorsException;

    move-result-object v5

    throw v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 105
    .end local v0    # "cause":Ljava/lang/Throwable;
    .end local v4    # "userException":Ljava/lang/reflect/InvocationTargetException;
    :catchall_1
    move-exception v5

    invoke-virtual {v1}, Lcom/google/inject/internal/ConstructionContext;->removeCurrentReference()V

    throw v5

    .restart local v4    # "userException":Ljava/lang/reflect/InvocationTargetException;
    :cond_3
    move-object v0, v4

    .line 99
    goto :goto_1
.end method

.method getConstructionProxy()Lcom/google/inject/internal/ConstructionProxy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/internal/ConstructionProxy",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 52
    .local p0, "this":Lcom/google/inject/internal/ConstructorInjector;, "Lcom/google/inject/internal/ConstructorInjector<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/ConstructorInjector;->constructionProxy:Lcom/google/inject/internal/ConstructionProxy;

    return-object v0
.end method

.method public getInjectableMembers()Lcom/google/inject/internal/util/$ImmutableSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/internal/util/$ImmutableSet",
            "<",
            "Lcom/google/inject/spi/InjectionPoint;",
            ">;"
        }
    .end annotation

    .prologue
    .line 48
    .local p0, "this":Lcom/google/inject/internal/ConstructorInjector;, "Lcom/google/inject/internal/ConstructorInjector<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/ConstructorInjector;->injectableMembers:Lcom/google/inject/internal/util/$ImmutableSet;

    return-object v0
.end method
