.class final Lcom/google/inject/internal/FactoryProxy;
.super Ljava/lang/Object;
.source "FactoryProxy.java"

# interfaces
.implements Lcom/google/inject/internal/InternalFactory;
.implements Lcom/google/inject/internal/CreationListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/inject/internal/InternalFactory",
        "<TT;>;",
        "Lcom/google/inject/internal/CreationListener;"
    }
.end annotation


# instance fields
.field private final injector:Lcom/google/inject/internal/InjectorImpl;

.field private final key:Lcom/google/inject/Key;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/Key",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final source:Ljava/lang/Object;

.field private targetFactory:Lcom/google/inject/internal/InternalFactory;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/InternalFactory",
            "<+TT;>;"
        }
    .end annotation
.end field

.field private final targetKey:Lcom/google/inject/Key;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/Key",
            "<+TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Key;Lcom/google/inject/Key;Ljava/lang/Object;)V
    .locals 0
    .param p1, "injector"    # Lcom/google/inject/internal/InjectorImpl;
    .param p4, "source"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/InjectorImpl;",
            "Lcom/google/inject/Key",
            "<TT;>;",
            "Lcom/google/inject/Key",
            "<+TT;>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .prologue
    .line 37
    .local p0, "this":Lcom/google/inject/internal/FactoryProxy;, "Lcom/google/inject/internal/FactoryProxy<TT;>;"
    .local p2, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<TT;>;"
    .local p3, "targetKey":Lcom/google/inject/Key;, "Lcom/google/inject/Key<+TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/google/inject/internal/FactoryProxy;->injector:Lcom/google/inject/internal/InjectorImpl;

    .line 39
    iput-object p2, p0, Lcom/google/inject/internal/FactoryProxy;->key:Lcom/google/inject/Key;

    .line 40
    iput-object p3, p0, Lcom/google/inject/internal/FactoryProxy;->targetKey:Lcom/google/inject/Key;

    .line 41
    iput-object p4, p0, Lcom/google/inject/internal/FactoryProxy;->source:Ljava/lang/Object;

    .line 42
    return-void
.end method


# virtual methods
.method public get(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/InternalContext;Lcom/google/inject/spi/Dependency;Z)Ljava/lang/Object;
    .locals 3
    .param p1, "errors"    # Lcom/google/inject/internal/Errors;
    .param p2, "context"    # Lcom/google/inject/internal/InternalContext;
    .param p4, "linked"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/Errors;",
            "Lcom/google/inject/internal/InternalContext;",
            "Lcom/google/inject/spi/Dependency",
            "<*>;Z)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/ErrorsException;
        }
    .end annotation

    .prologue
    .line 54
    .local p0, "this":Lcom/google/inject/internal/FactoryProxy;, "Lcom/google/inject/internal/FactoryProxy<TT;>;"
    .local p3, "dependency":Lcom/google/inject/spi/Dependency;, "Lcom/google/inject/spi/Dependency<*>;"
    iget-object v0, p0, Lcom/google/inject/internal/FactoryProxy;->targetFactory:Lcom/google/inject/internal/InternalFactory;

    iget-object v1, p0, Lcom/google/inject/internal/FactoryProxy;->targetKey:Lcom/google/inject/Key;

    invoke-virtual {p1, v1}, Lcom/google/inject/internal/Errors;->withSource(Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v0, v1, p2, p3, v2}, Lcom/google/inject/internal/InternalFactory;->get(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/InternalContext;Lcom/google/inject/spi/Dependency;Z)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public notify(Lcom/google/inject/internal/Errors;)V
    .locals 5
    .param p1, "errors"    # Lcom/google/inject/internal/Errors;

    .prologue
    .line 46
    .local p0, "this":Lcom/google/inject/internal/FactoryProxy;, "Lcom/google/inject/internal/FactoryProxy<TT;>;"
    :try_start_0
    iget-object v1, p0, Lcom/google/inject/internal/FactoryProxy;->injector:Lcom/google/inject/internal/InjectorImpl;

    iget-object v2, p0, Lcom/google/inject/internal/FactoryProxy;->targetKey:Lcom/google/inject/Key;

    iget-object v3, p0, Lcom/google/inject/internal/FactoryProxy;->source:Ljava/lang/Object;

    invoke-virtual {p1, v3}, Lcom/google/inject/internal/Errors;->withSource(Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v3

    sget-object v4, Lcom/google/inject/internal/InjectorImpl$JitLimitation;->NEW_OR_EXISTING_JIT:Lcom/google/inject/internal/InjectorImpl$JitLimitation;

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/inject/internal/InjectorImpl;->getInternalFactory(Lcom/google/inject/Key;Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/InjectorImpl$JitLimitation;)Lcom/google/inject/internal/InternalFactory;

    move-result-object v1

    iput-object v1, p0, Lcom/google/inject/internal/FactoryProxy;->targetFactory:Lcom/google/inject/internal/InternalFactory;
    :try_end_0
    .catch Lcom/google/inject/internal/ErrorsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    :goto_0
    return-void

    .line 47
    :catch_0
    move-exception v0

    .line 48
    .local v0, "e":Lcom/google/inject/internal/ErrorsException;
    invoke-virtual {v0}, Lcom/google/inject/internal/ErrorsException;->getErrors()Lcom/google/inject/internal/Errors;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/google/inject/internal/Errors;->merge(Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/Errors;

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 58
    .local p0, "this":Lcom/google/inject/internal/FactoryProxy;, "Lcom/google/inject/internal/FactoryProxy<TT;>;"
    new-instance v0, Lcom/google/inject/internal/util/$ToStringBuilder;

    const-class v1, Lcom/google/inject/internal/FactoryProxy;

    invoke-direct {v0, v1}, Lcom/google/inject/internal/util/$ToStringBuilder;-><init>(Ljava/lang/Class;)V

    const-string v1, "key"

    iget-object v2, p0, Lcom/google/inject/internal/FactoryProxy;->key:Lcom/google/inject/Key;

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ToStringBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ToStringBuilder;

    move-result-object v0

    const-string v1, "provider"

    iget-object v2, p0, Lcom/google/inject/internal/FactoryProxy;->targetFactory:Lcom/google/inject/internal/InternalFactory;

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ToStringBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ToStringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/inject/internal/util/$ToStringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
