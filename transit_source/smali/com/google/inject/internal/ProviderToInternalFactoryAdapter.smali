.class final Lcom/google/inject/internal/ProviderToInternalFactoryAdapter;
.super Ljava/lang/Object;
.source "ProviderToInternalFactoryAdapter.java"

# interfaces
.implements Lcom/google/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/inject/Provider",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final injector:Lcom/google/inject/internal/InjectorImpl;

.field private final internalFactory:Lcom/google/inject/internal/InternalFactory;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/InternalFactory",
            "<+TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/internal/InternalFactory;)V
    .locals 0
    .param p1, "injector"    # Lcom/google/inject/internal/InjectorImpl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/InjectorImpl;",
            "Lcom/google/inject/internal/InternalFactory",
            "<+TT;>;)V"
        }
    .end annotation

    .prologue
    .line 32
    .local p0, "this":Lcom/google/inject/internal/ProviderToInternalFactoryAdapter;, "Lcom/google/inject/internal/ProviderToInternalFactoryAdapter<TT;>;"
    .local p2, "internalFactory":Lcom/google/inject/internal/InternalFactory;, "Lcom/google/inject/internal/InternalFactory<+TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/google/inject/internal/ProviderToInternalFactoryAdapter;->injector:Lcom/google/inject/internal/InjectorImpl;

    .line 34
    iput-object p2, p0, Lcom/google/inject/internal/ProviderToInternalFactoryAdapter;->internalFactory:Lcom/google/inject/internal/InternalFactory;

    .line 35
    return-void
.end method

.method static synthetic access$000(Lcom/google/inject/internal/ProviderToInternalFactoryAdapter;)Lcom/google/inject/internal/InternalFactory;
    .locals 1
    .param p0, "x0"    # Lcom/google/inject/internal/ProviderToInternalFactoryAdapter;

    .prologue
    .line 26
    iget-object v0, p0, Lcom/google/inject/internal/ProviderToInternalFactoryAdapter;->internalFactory:Lcom/google/inject/internal/InternalFactory;

    return-object v0
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 38
    .local p0, "this":Lcom/google/inject/internal/ProviderToInternalFactoryAdapter;, "Lcom/google/inject/internal/ProviderToInternalFactoryAdapter<TT;>;"
    new-instance v1, Lcom/google/inject/internal/Errors;

    invoke-direct {v1}, Lcom/google/inject/internal/Errors;-><init>()V

    .line 40
    .local v1, "errors":Lcom/google/inject/internal/Errors;
    :try_start_0
    iget-object v3, p0, Lcom/google/inject/internal/ProviderToInternalFactoryAdapter;->injector:Lcom/google/inject/internal/InjectorImpl;

    new-instance v4, Lcom/google/inject/internal/ProviderToInternalFactoryAdapter$1;

    invoke-direct {v4, p0, v1}, Lcom/google/inject/internal/ProviderToInternalFactoryAdapter$1;-><init>(Lcom/google/inject/internal/ProviderToInternalFactoryAdapter;Lcom/google/inject/internal/Errors;)V

    invoke-virtual {v3, v4}, Lcom/google/inject/internal/InjectorImpl;->callInContext(Lcom/google/inject/internal/ContextualCallable;)Ljava/lang/Object;

    move-result-object v2

    .line 49
    .local v2, "t":Ljava/lang/Object;, "TT;"
    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lcom/google/inject/internal/Errors;->throwIfNewErrors(I)V
    :try_end_0
    .catch Lcom/google/inject/internal/ErrorsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    return-object v2

    .line 51
    .end local v2    # "t":Ljava/lang/Object;, "TT;"
    :catch_0
    move-exception v0

    .line 52
    .local v0, "e":Lcom/google/inject/internal/ErrorsException;
    new-instance v3, Lcom/google/inject/ProvisionException;

    invoke-virtual {v0}, Lcom/google/inject/internal/ErrorsException;->getErrors()Lcom/google/inject/internal/Errors;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/google/inject/internal/Errors;->merge(Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/Errors;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/inject/internal/Errors;->getMessages()Ljava/util/List;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/google/inject/ProvisionException;-><init>(Ljava/lang/Iterable;)V

    throw v3
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 57
    .local p0, "this":Lcom/google/inject/internal/ProviderToInternalFactoryAdapter;, "Lcom/google/inject/internal/ProviderToInternalFactoryAdapter<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/ProviderToInternalFactoryAdapter;->internalFactory:Lcom/google/inject/internal/InternalFactory;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
