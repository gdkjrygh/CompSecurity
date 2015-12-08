.class final Lcom/google/inject/internal/BoundProviderFactory;
.super Ljava/lang/Object;
.source "BoundProviderFactory.java"

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

.field private providerFactory:Lcom/google/inject/internal/InternalFactory;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/InternalFactory",
            "<+",
            "Ljavax/inject/Provider",
            "<+TT;>;>;"
        }
    .end annotation
.end field

.field final providerKey:Lcom/google/inject/Key;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/Key",
            "<+",
            "Ljavax/inject/Provider",
            "<+TT;>;>;"
        }
    .end annotation
.end field

.field final source:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Key;Ljava/lang/Object;)V
    .locals 0
    .param p1, "injector"    # Lcom/google/inject/internal/InjectorImpl;
    .param p3, "source"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/InjectorImpl;",
            "Lcom/google/inject/Key",
            "<+",
            "Ljavax/inject/Provider",
            "<+TT;>;>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .prologue
    .line 36
    .local p0, "this":Lcom/google/inject/internal/BoundProviderFactory;, "Lcom/google/inject/internal/BoundProviderFactory<TT;>;"
    .local p2, "providerKey":Lcom/google/inject/Key;, "Lcom/google/inject/Key<+Ljavax/inject/Provider<+TT;>;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/google/inject/internal/BoundProviderFactory;->injector:Lcom/google/inject/internal/InjectorImpl;

    .line 38
    iput-object p2, p0, Lcom/google/inject/internal/BoundProviderFactory;->providerKey:Lcom/google/inject/Key;

    .line 39
    iput-object p3, p0, Lcom/google/inject/internal/BoundProviderFactory;->source:Ljava/lang/Object;

    .line 40
    return-void
.end method


# virtual methods
.method public get(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/InternalContext;Lcom/google/inject/spi/Dependency;Z)Ljava/lang/Object;
    .locals 4
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
    .line 52
    .local p0, "this":Lcom/google/inject/internal/BoundProviderFactory;, "Lcom/google/inject/internal/BoundProviderFactory<TT;>;"
    .local p3, "dependency":Lcom/google/inject/spi/Dependency;, "Lcom/google/inject/spi/Dependency<*>;"
    iget-object v2, p0, Lcom/google/inject/internal/BoundProviderFactory;->providerKey:Lcom/google/inject/Key;

    invoke-virtual {p1, v2}, Lcom/google/inject/internal/Errors;->withSource(Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object p1

    .line 53
    iget-object v2, p0, Lcom/google/inject/internal/BoundProviderFactory;->providerFactory:Lcom/google/inject/internal/InternalFactory;

    const/4 v3, 0x1

    invoke-interface {v2, p1, p2, p3, v3}, Lcom/google/inject/internal/InternalFactory;->get(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/InternalContext;Lcom/google/inject/spi/Dependency;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/inject/Provider;

    .line 55
    .local v0, "provider":Ljavax/inject/Provider;, "Ljavax/inject/Provider<+TT;>;"
    :try_start_0
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lcom/google/inject/internal/BoundProviderFactory;->source:Ljava/lang/Object;

    invoke-virtual {p1, v2, v3, p3}, Lcom/google/inject/internal/Errors;->checkForNull(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/inject/spi/Dependency;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    return-object v2

    .line 56
    :catch_0
    move-exception v1

    .line 57
    .local v1, "userException":Ljava/lang/RuntimeException;
    invoke-virtual {p1, v1}, Lcom/google/inject/internal/Errors;->errorInProvider(Ljava/lang/RuntimeException;)Lcom/google/inject/internal/Errors;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/inject/internal/Errors;->toException()Lcom/google/inject/internal/ErrorsException;

    move-result-object v2

    throw v2
.end method

.method public notify(Lcom/google/inject/internal/Errors;)V
    .locals 5
    .param p1, "errors"    # Lcom/google/inject/internal/Errors;

    .prologue
    .line 44
    .local p0, "this":Lcom/google/inject/internal/BoundProviderFactory;, "Lcom/google/inject/internal/BoundProviderFactory<TT;>;"
    :try_start_0
    iget-object v1, p0, Lcom/google/inject/internal/BoundProviderFactory;->injector:Lcom/google/inject/internal/InjectorImpl;

    iget-object v2, p0, Lcom/google/inject/internal/BoundProviderFactory;->providerKey:Lcom/google/inject/Key;

    iget-object v3, p0, Lcom/google/inject/internal/BoundProviderFactory;->source:Ljava/lang/Object;

    invoke-virtual {p1, v3}, Lcom/google/inject/internal/Errors;->withSource(Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v3

    sget-object v4, Lcom/google/inject/internal/InjectorImpl$JitLimitation;->NEW_OR_EXISTING_JIT:Lcom/google/inject/internal/InjectorImpl$JitLimitation;

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/inject/internal/InjectorImpl;->getInternalFactory(Lcom/google/inject/Key;Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/InjectorImpl$JitLimitation;)Lcom/google/inject/internal/InternalFactory;

    move-result-object v1

    iput-object v1, p0, Lcom/google/inject/internal/BoundProviderFactory;->providerFactory:Lcom/google/inject/internal/InternalFactory;
    :try_end_0
    .catch Lcom/google/inject/internal/ErrorsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    :goto_0
    return-void

    .line 45
    :catch_0
    move-exception v0

    .line 46
    .local v0, "e":Lcom/google/inject/internal/ErrorsException;
    invoke-virtual {v0}, Lcom/google/inject/internal/ErrorsException;->getErrors()Lcom/google/inject/internal/Errors;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/google/inject/internal/Errors;->merge(Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/Errors;

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 62
    .local p0, "this":Lcom/google/inject/internal/BoundProviderFactory;, "Lcom/google/inject/internal/BoundProviderFactory<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/BoundProviderFactory;->providerKey:Lcom/google/inject/Key;

    invoke-virtual {v0}, Lcom/google/inject/Key;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
