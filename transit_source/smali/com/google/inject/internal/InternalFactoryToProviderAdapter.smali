.class final Lcom/google/inject/internal/InternalFactoryToProviderAdapter;
.super Ljava/lang/Object;
.source "InternalFactoryToProviderAdapter.java"

# interfaces
.implements Lcom/google/inject/internal/InternalFactory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/inject/internal/InternalFactory",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final initializable:Lcom/google/inject/internal/Initializable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/Initializable",
            "<",
            "Lcom/google/inject/Provider",
            "<+TT;>;>;"
        }
    .end annotation
.end field

.field private final source:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/inject/internal/Initializable;Ljava/lang/Object;)V
    .locals 1
    .param p2, "source"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/Initializable",
            "<",
            "Lcom/google/inject/Provider",
            "<+TT;>;>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .prologue
    .line 32
    .local p0, "this":Lcom/google/inject/internal/InternalFactoryToProviderAdapter;, "Lcom/google/inject/internal/InternalFactoryToProviderAdapter<TT;>;"
    .local p1, "initializable":Lcom/google/inject/internal/Initializable;, "Lcom/google/inject/internal/Initializable<Lcom/google/inject/Provider<+TT;>;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const-string v0, "provider"

    invoke-static {p1, v0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/internal/Initializable;

    iput-object v0, p0, Lcom/google/inject/internal/InternalFactoryToProviderAdapter;->initializable:Lcom/google/inject/internal/Initializable;

    .line 34
    const-string v0, "source"

    invoke-static {p2, v0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/InternalFactoryToProviderAdapter;->source:Ljava/lang/Object;

    .line 35
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
    .line 40
    .local p0, "this":Lcom/google/inject/internal/InternalFactoryToProviderAdapter;, "Lcom/google/inject/internal/InternalFactoryToProviderAdapter<TT;>;"
    .local p3, "dependency":Lcom/google/inject/spi/Dependency;, "Lcom/google/inject/spi/Dependency<*>;"
    :try_start_0
    iget-object v1, p0, Lcom/google/inject/internal/InternalFactoryToProviderAdapter;->initializable:Lcom/google/inject/internal/Initializable;

    invoke-interface {v1, p1}, Lcom/google/inject/internal/Initializable;->get(Lcom/google/inject/internal/Errors;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/inject/Provider;

    invoke-interface {v1}, Lcom/google/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/google/inject/internal/InternalFactoryToProviderAdapter;->source:Ljava/lang/Object;

    invoke-virtual {p1, v1, v2, p3}, Lcom/google/inject/internal/Errors;->checkForNull(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/inject/spi/Dependency;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    return-object v1

    .line 41
    :catch_0
    move-exception v0

    .line 42
    .local v0, "userException":Ljava/lang/RuntimeException;
    iget-object v1, p0, Lcom/google/inject/internal/InternalFactoryToProviderAdapter;->source:Ljava/lang/Object;

    invoke-virtual {p1, v1}, Lcom/google/inject/internal/Errors;->withSource(Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/inject/internal/Errors;->errorInProvider(Ljava/lang/RuntimeException;)Lcom/google/inject/internal/Errors;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/inject/internal/Errors;->toException()Lcom/google/inject/internal/ErrorsException;

    move-result-object v1

    throw v1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 47
    .local p0, "this":Lcom/google/inject/internal/InternalFactoryToProviderAdapter;, "Lcom/google/inject/internal/InternalFactoryToProviderAdapter<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/InternalFactoryToProviderAdapter;->initializable:Lcom/google/inject/internal/Initializable;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
