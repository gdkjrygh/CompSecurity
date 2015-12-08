.class final Lcom/google/inject/internal/ConstructorInjectorStore;
.super Ljava/lang/Object;
.source "ConstructorInjectorStore.java"


# instance fields
.field private final cache:Lcom/google/inject/internal/FailableCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/FailableCache",
            "<",
            "Lcom/google/inject/spi/InjectionPoint;",
            "Lcom/google/inject/internal/ConstructorInjector",
            "<*>;>;"
        }
    .end annotation
.end field

.field private final injector:Lcom/google/inject/internal/InjectorImpl;


# direct methods
.method constructor <init>(Lcom/google/inject/internal/InjectorImpl;)V
    .locals 1
    .param p1, "injector"    # Lcom/google/inject/internal/InjectorImpl;

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Lcom/google/inject/internal/ConstructorInjectorStore$1;

    invoke-direct {v0, p0}, Lcom/google/inject/internal/ConstructorInjectorStore$1;-><init>(Lcom/google/inject/internal/ConstructorInjectorStore;)V

    iput-object v0, p0, Lcom/google/inject/internal/ConstructorInjectorStore;->cache:Lcom/google/inject/internal/FailableCache;

    .line 41
    iput-object p1, p0, Lcom/google/inject/internal/ConstructorInjectorStore;->injector:Lcom/google/inject/internal/InjectorImpl;

    .line 42
    return-void
.end method

.method static synthetic access$000(Lcom/google/inject/internal/ConstructorInjectorStore;Lcom/google/inject/spi/InjectionPoint;Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/ConstructorInjector;
    .locals 1
    .param p0, "x0"    # Lcom/google/inject/internal/ConstructorInjectorStore;
    .param p1, "x1"    # Lcom/google/inject/spi/InjectionPoint;
    .param p2, "x2"    # Lcom/google/inject/internal/Errors;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/ErrorsException;
        }
    .end annotation

    .prologue
    .line 28
    invoke-direct {p0, p1, p2}, Lcom/google/inject/internal/ConstructorInjectorStore;->createConstructor(Lcom/google/inject/spi/InjectionPoint;Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/ConstructorInjector;

    move-result-object v0

    return-object v0
.end method

.method private createConstructor(Lcom/google/inject/spi/InjectionPoint;Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/ConstructorInjector;
    .locals 7
    .param p1, "injectionPoint"    # Lcom/google/inject/spi/InjectionPoint;
    .param p2, "errors"    # Lcom/google/inject/internal/Errors;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/spi/InjectionPoint;",
            "Lcom/google/inject/internal/Errors;",
            ")",
            "Lcom/google/inject/internal/ConstructorInjector",
            "<TT;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/ErrorsException;
        }
    .end annotation

    .prologue
    .line 67
    invoke-virtual {p2}, Lcom/google/inject/internal/Errors;->size()I

    move-result v3

    .line 69
    .local v3, "numErrorsBefore":I
    iget-object v4, p0, Lcom/google/inject/internal/ConstructorInjectorStore;->injector:Lcom/google/inject/internal/InjectorImpl;

    invoke-virtual {p1}, Lcom/google/inject/spi/InjectionPoint;->getDependencies()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v4, v5, p2}, Lcom/google/inject/internal/InjectorImpl;->getParametersInjectors(Ljava/util/List;Lcom/google/inject/internal/Errors;)[Lcom/google/inject/internal/SingleParameterInjector;

    move-result-object v0

    .line 73
    .local v0, "constructorParameterInjectors":[Lcom/google/inject/internal/SingleParameterInjector;, "[Lcom/google/inject/internal/SingleParameterInjector<*>;"
    iget-object v4, p0, Lcom/google/inject/internal/ConstructorInjectorStore;->injector:Lcom/google/inject/internal/InjectorImpl;

    iget-object v4, v4, Lcom/google/inject/internal/InjectorImpl;->membersInjectorStore:Lcom/google/inject/internal/MembersInjectorStore;

    invoke-virtual {p1}, Lcom/google/inject/spi/InjectionPoint;->getDeclaringType()Lcom/google/inject/TypeLiteral;

    move-result-object v5

    invoke-virtual {v4, v5, p2}, Lcom/google/inject/internal/MembersInjectorStore;->get(Lcom/google/inject/TypeLiteral;Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/MembersInjectorImpl;

    move-result-object v2

    .line 84
    .local v2, "membersInjector":Lcom/google/inject/internal/MembersInjectorImpl;, "Lcom/google/inject/internal/MembersInjectorImpl<TT;>;"
    new-instance v1, Lcom/google/inject/internal/DefaultConstructionProxyFactory;

    invoke-direct {v1, p1}, Lcom/google/inject/internal/DefaultConstructionProxyFactory;-><init>(Lcom/google/inject/spi/InjectionPoint;)V

    .line 87
    .local v1, "factory":Lcom/google/inject/internal/ConstructionProxyFactory;, "Lcom/google/inject/internal/ConstructionProxyFactory<TT;>;"
    invoke-virtual {p2, v3}, Lcom/google/inject/internal/Errors;->throwIfNewErrors(I)V

    .line 89
    new-instance v4, Lcom/google/inject/internal/ConstructorInjector;

    invoke-virtual {v2}, Lcom/google/inject/internal/MembersInjectorImpl;->getInjectionPoints()Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v5

    invoke-interface {v1}, Lcom/google/inject/internal/ConstructionProxyFactory;->create()Lcom/google/inject/internal/ConstructionProxy;

    move-result-object v6

    invoke-direct {v4, v5, v6, v0, v2}, Lcom/google/inject/internal/ConstructorInjector;-><init>(Ljava/util/Set;Lcom/google/inject/internal/ConstructionProxy;[Lcom/google/inject/internal/SingleParameterInjector;Lcom/google/inject/internal/MembersInjectorImpl;)V

    return-object v4
.end method


# virtual methods
.method public get(Lcom/google/inject/spi/InjectionPoint;Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/ConstructorInjector;
    .locals 1
    .param p1, "constructorInjector"    # Lcom/google/inject/spi/InjectionPoint;
    .param p2, "errors"    # Lcom/google/inject/internal/Errors;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/spi/InjectionPoint;",
            "Lcom/google/inject/internal/Errors;",
            ")",
            "Lcom/google/inject/internal/ConstructorInjector",
            "<*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/ErrorsException;
        }
    .end annotation

    .prologue
    .line 49
    iget-object v0, p0, Lcom/google/inject/internal/ConstructorInjectorStore;->cache:Lcom/google/inject/internal/FailableCache;

    invoke-virtual {v0, p1, p2}, Lcom/google/inject/internal/FailableCache;->get(Ljava/lang/Object;Lcom/google/inject/internal/Errors;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/internal/ConstructorInjector;

    return-object v0
.end method

.method remove(Lcom/google/inject/spi/InjectionPoint;)Z
    .locals 1
    .param p1, "ip"    # Lcom/google/inject/spi/InjectionPoint;

    .prologue
    .line 62
    iget-object v0, p0, Lcom/google/inject/internal/ConstructorInjectorStore;->cache:Lcom/google/inject/internal/FailableCache;

    invoke-virtual {v0, p1}, Lcom/google/inject/internal/FailableCache;->remove(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
