.class final Lcom/google/inject/internal/ConstructionContext;
.super Ljava/lang/Object;
.source "ConstructionContext.java"


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
.field constructing:Z

.field currentReference:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field invocationHandlers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/internal/DelegatingInvocationHandler",
            "<TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 28
    .local p0, "this":Lcom/google/inject/internal/ConstructionContext;, "Lcom/google/inject/internal/ConstructionContext<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createProxy(Lcom/google/inject/internal/Errors;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 5
    .param p1, "errors"    # Lcom/google/inject/internal/Errors;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/Errors;",
            "Ljava/lang/Class",
            "<*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/ErrorsException;
        }
    .end annotation

    .prologue
    .line 65
    .local p0, "this":Lcom/google/inject/internal/ConstructionContext;, "Lcom/google/inject/internal/ConstructionContext<TT;>;"
    .local p2, "expectedType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {p2}, Ljava/lang/Class;->isInterface()Z

    move-result v2

    if-nez v2, :cond_0

    .line 66
    invoke-virtual {p1, p2}, Lcom/google/inject/internal/Errors;->cannotSatisfyCircularDependency(Ljava/lang/Class;)Lcom/google/inject/internal/Errors;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/inject/internal/Errors;->toException()Lcom/google/inject/internal/ErrorsException;

    move-result-object v2

    throw v2

    .line 69
    :cond_0
    iget-object v2, p0, Lcom/google/inject/internal/ConstructionContext;->invocationHandlers:Ljava/util/List;

    if-nez v2, :cond_1

    .line 70
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/google/inject/internal/ConstructionContext;->invocationHandlers:Ljava/util/List;

    .line 73
    :cond_1
    new-instance v1, Lcom/google/inject/internal/DelegatingInvocationHandler;

    invoke-direct {v1}, Lcom/google/inject/internal/DelegatingInvocationHandler;-><init>()V

    .line 74
    .local v1, "invocationHandler":Lcom/google/inject/internal/DelegatingInvocationHandler;, "Lcom/google/inject/internal/DelegatingInvocationHandler<TT;>;"
    iget-object v2, p0, Lcom/google/inject/internal/ConstructionContext;->invocationHandlers:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    invoke-static {p2}, Lcom/google/inject/internal/BytecodeGen;->getClassLoader(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    move-result-object v0

    .line 77
    .local v0, "classLoader":Ljava/lang/ClassLoader;
    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    const/4 v3, 0x1

    const-class v4, Lcom/google/inject/internal/CircularDependencyProxy;

    aput-object v4, v2, v3

    invoke-static {v0, v2, v1}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    return-object v2
.end method

.method public finishConstruction()V
    .locals 1

    .prologue
    .line 56
    .local p0, "this":Lcom/google/inject/internal/ConstructionContext;, "Lcom/google/inject/internal/ConstructionContext<TT;>;"
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/inject/internal/ConstructionContext;->constructing:Z

    .line 57
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/inject/internal/ConstructionContext;->invocationHandlers:Ljava/util/List;

    .line 58
    return-void
.end method

.method public getCurrentReference()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 36
    .local p0, "this":Lcom/google/inject/internal/ConstructionContext;, "Lcom/google/inject/internal/ConstructionContext<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/ConstructionContext;->currentReference:Ljava/lang/Object;

    return-object v0
.end method

.method public isConstructing()Z
    .locals 1

    .prologue
    .line 48
    .local p0, "this":Lcom/google/inject/internal/ConstructionContext;, "Lcom/google/inject/internal/ConstructionContext<TT;>;"
    iget-boolean v0, p0, Lcom/google/inject/internal/ConstructionContext;->constructing:Z

    return v0
.end method

.method public removeCurrentReference()V
    .locals 1

    .prologue
    .line 40
    .local p0, "this":Lcom/google/inject/internal/ConstructionContext;, "Lcom/google/inject/internal/ConstructionContext<TT;>;"
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/inject/internal/ConstructionContext;->currentReference:Ljava/lang/Object;

    .line 41
    return-void
.end method

.method public setCurrentReference(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 44
    .local p0, "this":Lcom/google/inject/internal/ConstructionContext;, "Lcom/google/inject/internal/ConstructionContext<TT;>;"
    .local p1, "currentReference":Ljava/lang/Object;, "TT;"
    iput-object p1, p0, Lcom/google/inject/internal/ConstructionContext;->currentReference:Ljava/lang/Object;

    .line 45
    return-void
.end method

.method public setProxyDelegates(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 82
    .local p0, "this":Lcom/google/inject/internal/ConstructionContext;, "Lcom/google/inject/internal/ConstructionContext<TT;>;"
    .local p1, "delegate":Ljava/lang/Object;, "TT;"
    iget-object v2, p0, Lcom/google/inject/internal/ConstructionContext;->invocationHandlers:Ljava/util/List;

    if-eqz v2, :cond_0

    .line 83
    iget-object v2, p0, Lcom/google/inject/internal/ConstructionContext;->invocationHandlers:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/internal/DelegatingInvocationHandler;

    .line 84
    .local v0, "handler":Lcom/google/inject/internal/DelegatingInvocationHandler;, "Lcom/google/inject/internal/DelegatingInvocationHandler<TT;>;"
    invoke-virtual {v0, p1}, Lcom/google/inject/internal/DelegatingInvocationHandler;->setDelegate(Ljava/lang/Object;)V

    goto :goto_0

    .line 87
    .end local v0    # "handler":Lcom/google/inject/internal/DelegatingInvocationHandler;, "Lcom/google/inject/internal/DelegatingInvocationHandler<TT;>;"
    .end local v1    # "i$":Ljava/util/Iterator;
    :cond_0
    return-void
.end method

.method public startConstruction()V
    .locals 1

    .prologue
    .line 52
    .local p0, "this":Lcom/google/inject/internal/ConstructionContext;, "Lcom/google/inject/internal/ConstructionContext<TT;>;"
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/inject/internal/ConstructionContext;->constructing:Z

    .line 53
    return-void
.end method
