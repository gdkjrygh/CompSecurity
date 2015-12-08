.class final Lcom/google/inject/internal/SingleFieldInjector;
.super Ljava/lang/Object;
.source "SingleFieldInjector.java"

# interfaces
.implements Lcom/google/inject/internal/SingleMemberInjector;


# instance fields
.field final dependency:Lcom/google/inject/spi/Dependency;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/spi/Dependency",
            "<*>;"
        }
    .end annotation
.end field

.field final factory:Lcom/google/inject/internal/InternalFactory;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/InternalFactory",
            "<*>;"
        }
    .end annotation
.end field

.field final field:Ljava/lang/reflect/Field;

.field final injectionPoint:Lcom/google/inject/spi/InjectionPoint;


# direct methods
.method public constructor <init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/spi/InjectionPoint;Lcom/google/inject/internal/Errors;)V
    .locals 2
    .param p1, "injector"    # Lcom/google/inject/internal/InjectorImpl;
    .param p2, "injectionPoint"    # Lcom/google/inject/spi/InjectionPoint;
    .param p3, "errors"    # Lcom/google/inject/internal/Errors;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/ErrorsException;
        }
    .end annotation

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p2, p0, Lcom/google/inject/internal/SingleFieldInjector;->injectionPoint:Lcom/google/inject/spi/InjectionPoint;

    .line 36
    invoke-virtual {p2}, Lcom/google/inject/spi/InjectionPoint;->getMember()Ljava/lang/reflect/Member;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Field;

    iput-object v0, p0, Lcom/google/inject/internal/SingleFieldInjector;->field:Ljava/lang/reflect/Field;

    .line 37
    invoke-virtual {p2}, Lcom/google/inject/spi/InjectionPoint;->getDependencies()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/spi/Dependency;

    iput-object v0, p0, Lcom/google/inject/internal/SingleFieldInjector;->dependency:Lcom/google/inject/spi/Dependency;

    .line 40
    iget-object v0, p0, Lcom/google/inject/internal/SingleFieldInjector;->field:Ljava/lang/reflect/Field;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 41
    iget-object v0, p0, Lcom/google/inject/internal/SingleFieldInjector;->dependency:Lcom/google/inject/spi/Dependency;

    invoke-virtual {v0}, Lcom/google/inject/spi/Dependency;->getKey()Lcom/google/inject/Key;

    move-result-object v0

    sget-object v1, Lcom/google/inject/internal/InjectorImpl$JitLimitation;->NO_JIT:Lcom/google/inject/internal/InjectorImpl$JitLimitation;

    invoke-virtual {p1, v0, p3, v1}, Lcom/google/inject/internal/InjectorImpl;->getInternalFactory(Lcom/google/inject/Key;Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/InjectorImpl$JitLimitation;)Lcom/google/inject/internal/InternalFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/SingleFieldInjector;->factory:Lcom/google/inject/internal/InternalFactory;

    .line 42
    return-void
.end method


# virtual methods
.method public getInjectionPoint()Lcom/google/inject/spi/InjectionPoint;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/google/inject/internal/SingleFieldInjector;->injectionPoint:Lcom/google/inject/spi/InjectionPoint;

    return-object v0
.end method

.method public inject(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/InternalContext;Ljava/lang/Object;)V
    .locals 6
    .param p1, "errors"    # Lcom/google/inject/internal/Errors;
    .param p2, "context"    # Lcom/google/inject/internal/InternalContext;
    .param p3, "o"    # Ljava/lang/Object;

    .prologue
    .line 49
    iget-object v3, p0, Lcom/google/inject/internal/SingleFieldInjector;->dependency:Lcom/google/inject/spi/Dependency;

    invoke-virtual {p1, v3}, Lcom/google/inject/internal/Errors;->withSource(Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object p1

    .line 51
    iget-object v3, p0, Lcom/google/inject/internal/SingleFieldInjector;->dependency:Lcom/google/inject/spi/Dependency;

    invoke-virtual {p2, v3}, Lcom/google/inject/internal/InternalContext;->setDependency(Lcom/google/inject/spi/Dependency;)Lcom/google/inject/spi/Dependency;

    move-result-object v1

    .line 53
    .local v1, "previous":Lcom/google/inject/spi/Dependency;
    :try_start_0
    iget-object v3, p0, Lcom/google/inject/internal/SingleFieldInjector;->factory:Lcom/google/inject/internal/InternalFactory;

    iget-object v4, p0, Lcom/google/inject/internal/SingleFieldInjector;->dependency:Lcom/google/inject/spi/Dependency;

    const/4 v5, 0x0

    invoke-interface {v3, p1, p2, v4, v5}, Lcom/google/inject/internal/InternalFactory;->get(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/InternalContext;Lcom/google/inject/spi/Dependency;Z)Ljava/lang/Object;

    move-result-object v2

    .line 54
    .local v2, "value":Ljava/lang/Object;
    iget-object v3, p0, Lcom/google/inject/internal/SingleFieldInjector;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v3, p3, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/google/inject/internal/ErrorsException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    invoke-virtual {p2, v1}, Lcom/google/inject/internal/InternalContext;->setDependency(Lcom/google/inject/spi/Dependency;)Lcom/google/inject/spi/Dependency;

    .line 62
    .end local v2    # "value":Ljava/lang/Object;
    :goto_0
    return-void

    .line 55
    :catch_0
    move-exception v0

    .line 56
    .local v0, "e":Lcom/google/inject/internal/ErrorsException;
    :try_start_1
    iget-object v3, p0, Lcom/google/inject/internal/SingleFieldInjector;->injectionPoint:Lcom/google/inject/spi/InjectionPoint;

    invoke-virtual {p1, v3}, Lcom/google/inject/internal/Errors;->withSource(Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/inject/internal/ErrorsException;->getErrors()Lcom/google/inject/internal/Errors;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/inject/internal/Errors;->merge(Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/Errors;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    invoke-virtual {p2, v1}, Lcom/google/inject/internal/InternalContext;->setDependency(Lcom/google/inject/spi/Dependency;)Lcom/google/inject/spi/Dependency;

    goto :goto_0

    .line 57
    .end local v0    # "e":Lcom/google/inject/internal/ErrorsException;
    :catch_1
    move-exception v0

    .line 58
    .local v0, "e":Ljava/lang/IllegalAccessException;
    :try_start_2
    new-instance v3, Ljava/lang/AssertionError;

    invoke-direct {v3, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 60
    .end local v0    # "e":Ljava/lang/IllegalAccessException;
    :catchall_0
    move-exception v3

    invoke-virtual {p2, v1}, Lcom/google/inject/internal/InternalContext;->setDependency(Lcom/google/inject/spi/Dependency;)Lcom/google/inject/spi/Dependency;

    throw v3
.end method
