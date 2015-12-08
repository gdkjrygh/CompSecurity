.class final Lcom/google/inject/internal/SingleParameterInjector;
.super Ljava/lang/Object;
.source "SingleParameterInjector.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final NO_ARGUMENTS:[Ljava/lang/Object;


# instance fields
.field private final dependency:Lcom/google/inject/spi/Dependency;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/spi/Dependency",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final factory:Lcom/google/inject/internal/InternalFactory;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/InternalFactory",
            "<+TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 25
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    sput-object v0, Lcom/google/inject/internal/SingleParameterInjector;->NO_ARGUMENTS:[Ljava/lang/Object;

    return-void
.end method

.method constructor <init>(Lcom/google/inject/spi/Dependency;Lcom/google/inject/internal/InternalFactory;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/spi/Dependency",
            "<TT;>;",
            "Lcom/google/inject/internal/InternalFactory",
            "<+TT;>;)V"
        }
    .end annotation

    .prologue
    .line 30
    .local p0, "this":Lcom/google/inject/internal/SingleParameterInjector;, "Lcom/google/inject/internal/SingleParameterInjector<TT;>;"
    .local p1, "dependency":Lcom/google/inject/spi/Dependency;, "Lcom/google/inject/spi/Dependency<TT;>;"
    .local p2, "factory":Lcom/google/inject/internal/InternalFactory;, "Lcom/google/inject/internal/InternalFactory<+TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/google/inject/internal/SingleParameterInjector;->dependency:Lcom/google/inject/spi/Dependency;

    .line 32
    iput-object p2, p0, Lcom/google/inject/internal/SingleParameterInjector;->factory:Lcom/google/inject/internal/InternalFactory;

    .line 33
    return-void
.end method

.method static getAll(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/InternalContext;[Lcom/google/inject/internal/SingleParameterInjector;)[Ljava/lang/Object;
    .locals 7
    .param p0, "errors"    # Lcom/google/inject/internal/Errors;
    .param p1, "context"    # Lcom/google/inject/internal/InternalContext;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/Errors;",
            "Lcom/google/inject/internal/InternalContext;",
            "[",
            "Lcom/google/inject/internal/SingleParameterInjector",
            "<*>;)[",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/ErrorsException;
        }
    .end annotation

    .prologue
    .line 49
    .local p2, "parameterInjectors":[Lcom/google/inject/internal/SingleParameterInjector;, "[Lcom/google/inject/internal/SingleParameterInjector<*>;"
    if-nez p2, :cond_0

    .line 50
    sget-object v4, Lcom/google/inject/internal/SingleParameterInjector;->NO_ARGUMENTS:[Ljava/lang/Object;

    .line 69
    :goto_0
    return-object v4

    .line 53
    :cond_0
    invoke-virtual {p0}, Lcom/google/inject/internal/Errors;->size()I

    move-result v2

    .line 55
    .local v2, "numErrorsBefore":I
    array-length v5, p2

    .line 56
    .local v5, "size":I
    new-array v4, v5, [Ljava/lang/Object;

    .line 59
    .local v4, "parameters":[Ljava/lang/Object;
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_1
    if-ge v1, v5, :cond_1

    .line 60
    aget-object v3, p2, v1

    .line 62
    .local v3, "parameterInjector":Lcom/google/inject/internal/SingleParameterInjector;, "Lcom/google/inject/internal/SingleParameterInjector<*>;"
    :try_start_0
    invoke-direct {v3, p0, p1}, Lcom/google/inject/internal/SingleParameterInjector;->inject(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/InternalContext;)Ljava/lang/Object;

    move-result-object v6

    aput-object v6, v4, v1
    :try_end_0
    .catch Lcom/google/inject/internal/ErrorsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 63
    :catch_0
    move-exception v0

    .line 64
    .local v0, "e":Lcom/google/inject/internal/ErrorsException;
    invoke-virtual {v0}, Lcom/google/inject/internal/ErrorsException;->getErrors()Lcom/google/inject/internal/Errors;

    move-result-object v6

    invoke-virtual {p0, v6}, Lcom/google/inject/internal/Errors;->merge(Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/Errors;

    goto :goto_2

    .line 68
    .end local v0    # "e":Lcom/google/inject/internal/ErrorsException;
    .end local v3    # "parameterInjector":Lcom/google/inject/internal/SingleParameterInjector;, "Lcom/google/inject/internal/SingleParameterInjector<*>;"
    :cond_1
    invoke-virtual {p0, v2}, Lcom/google/inject/internal/Errors;->throwIfNewErrors(I)V

    goto :goto_0
.end method

.method private inject(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/InternalContext;)Ljava/lang/Object;
    .locals 5
    .param p1, "errors"    # Lcom/google/inject/internal/Errors;
    .param p2, "context"    # Lcom/google/inject/internal/InternalContext;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/Errors;",
            "Lcom/google/inject/internal/InternalContext;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/ErrorsException;
        }
    .end annotation

    .prologue
    .line 36
    .local p0, "this":Lcom/google/inject/internal/SingleParameterInjector;, "Lcom/google/inject/internal/SingleParameterInjector<TT;>;"
    iget-object v1, p0, Lcom/google/inject/internal/SingleParameterInjector;->dependency:Lcom/google/inject/spi/Dependency;

    invoke-virtual {p2, v1}, Lcom/google/inject/internal/InternalContext;->setDependency(Lcom/google/inject/spi/Dependency;)Lcom/google/inject/spi/Dependency;

    move-result-object v0

    .line 38
    .local v0, "previous":Lcom/google/inject/spi/Dependency;
    :try_start_0
    iget-object v1, p0, Lcom/google/inject/internal/SingleParameterInjector;->factory:Lcom/google/inject/internal/InternalFactory;

    iget-object v2, p0, Lcom/google/inject/internal/SingleParameterInjector;->dependency:Lcom/google/inject/spi/Dependency;

    invoke-virtual {p1, v2}, Lcom/google/inject/internal/Errors;->withSource(Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v2

    iget-object v3, p0, Lcom/google/inject/internal/SingleParameterInjector;->dependency:Lcom/google/inject/spi/Dependency;

    const/4 v4, 0x0

    invoke-interface {v1, v2, p2, v3, v4}, Lcom/google/inject/internal/InternalFactory;->get(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/InternalContext;Lcom/google/inject/spi/Dependency;Z)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 40
    invoke-virtual {p2, v0}, Lcom/google/inject/internal/InternalContext;->setDependency(Lcom/google/inject/spi/Dependency;)Lcom/google/inject/spi/Dependency;

    return-object v1

    :catchall_0
    move-exception v1

    invoke-virtual {p2, v0}, Lcom/google/inject/internal/InternalContext;->setDependency(Lcom/google/inject/spi/Dependency;)Lcom/google/inject/spi/Dependency;

    throw v1
.end method
