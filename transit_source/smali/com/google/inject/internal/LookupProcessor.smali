.class final Lcom/google/inject/internal/LookupProcessor;
.super Lcom/google/inject/internal/AbstractProcessor;
.source "LookupProcessor.java"


# direct methods
.method constructor <init>(Lcom/google/inject/internal/Errors;)V
    .locals 0
    .param p1, "errors"    # Lcom/google/inject/internal/Errors;

    .prologue
    .line 33
    invoke-direct {p0, p1}, Lcom/google/inject/internal/AbstractProcessor;-><init>(Lcom/google/inject/internal/Errors;)V

    .line 34
    return-void
.end method


# virtual methods
.method public visit(Lcom/google/inject/spi/MembersInjectorLookup;)Ljava/lang/Boolean;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/spi/MembersInjectorLookup",
            "<TT;>;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    .prologue
    .line 38
    .local p1, "lookup":Lcom/google/inject/spi/MembersInjectorLookup;, "Lcom/google/inject/spi/MembersInjectorLookup<TT;>;"
    :try_start_0
    iget-object v2, p0, Lcom/google/inject/internal/LookupProcessor;->injector:Lcom/google/inject/internal/InjectorImpl;

    iget-object v2, v2, Lcom/google/inject/internal/InjectorImpl;->membersInjectorStore:Lcom/google/inject/internal/MembersInjectorStore;

    invoke-virtual {p1}, Lcom/google/inject/spi/MembersInjectorLookup;->getType()Lcom/google/inject/TypeLiteral;

    move-result-object v3

    iget-object v4, p0, Lcom/google/inject/internal/LookupProcessor;->errors:Lcom/google/inject/internal/Errors;

    invoke-virtual {v2, v3, v4}, Lcom/google/inject/internal/MembersInjectorStore;->get(Lcom/google/inject/TypeLiteral;Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/MembersInjectorImpl;

    move-result-object v1

    .line 40
    .local v1, "membersInjector":Lcom/google/inject/MembersInjector;, "Lcom/google/inject/MembersInjector<TT;>;"
    invoke-virtual {p1, v1}, Lcom/google/inject/spi/MembersInjectorLookup;->initializeDelegate(Lcom/google/inject/MembersInjector;)V
    :try_end_0
    .catch Lcom/google/inject/internal/ErrorsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .end local v1    # "membersInjector":Lcom/google/inject/MembersInjector;, "Lcom/google/inject/MembersInjector<TT;>;"
    :goto_0
    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    return-object v2

    .line 41
    :catch_0
    move-exception v0

    .line 42
    .local v0, "e":Lcom/google/inject/internal/ErrorsException;
    iget-object v2, p0, Lcom/google/inject/internal/LookupProcessor;->errors:Lcom/google/inject/internal/Errors;

    invoke-virtual {v0}, Lcom/google/inject/internal/ErrorsException;->getErrors()Lcom/google/inject/internal/Errors;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/inject/internal/Errors;->merge(Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/Errors;

    goto :goto_0
.end method

.method public visit(Lcom/google/inject/spi/ProviderLookup;)Ljava/lang/Boolean;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/spi/ProviderLookup",
            "<TT;>;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    .prologue
    .line 51
    .local p1, "lookup":Lcom/google/inject/spi/ProviderLookup;, "Lcom/google/inject/spi/ProviderLookup<TT;>;"
    :try_start_0
    iget-object v2, p0, Lcom/google/inject/internal/LookupProcessor;->injector:Lcom/google/inject/internal/InjectorImpl;

    invoke-virtual {p1}, Lcom/google/inject/spi/ProviderLookup;->getKey()Lcom/google/inject/Key;

    move-result-object v3

    iget-object v4, p0, Lcom/google/inject/internal/LookupProcessor;->errors:Lcom/google/inject/internal/Errors;

    invoke-virtual {v2, v3, v4}, Lcom/google/inject/internal/InjectorImpl;->getProviderOrThrow(Lcom/google/inject/Key;Lcom/google/inject/internal/Errors;)Lcom/google/inject/Provider;

    move-result-object v1

    .line 52
    .local v1, "provider":Lcom/google/inject/Provider;, "Lcom/google/inject/Provider<TT;>;"
    invoke-virtual {p1, v1}, Lcom/google/inject/spi/ProviderLookup;->initializeDelegate(Lcom/google/inject/Provider;)V
    :try_end_0
    .catch Lcom/google/inject/internal/ErrorsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .end local v1    # "provider":Lcom/google/inject/Provider;, "Lcom/google/inject/Provider<TT;>;"
    :goto_0
    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    return-object v2

    .line 53
    :catch_0
    move-exception v0

    .line 54
    .local v0, "e":Lcom/google/inject/internal/ErrorsException;
    iget-object v2, p0, Lcom/google/inject/internal/LookupProcessor;->errors:Lcom/google/inject/internal/Errors;

    invoke-virtual {v0}, Lcom/google/inject/internal/ErrorsException;->getErrors()Lcom/google/inject/internal/Errors;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/inject/internal/Errors;->merge(Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/Errors;

    goto :goto_0
.end method

.method public bridge synthetic visit(Lcom/google/inject/spi/MembersInjectorLookup;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/spi/MembersInjectorLookup;

    .prologue
    .line 30
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/LookupProcessor;->visit(Lcom/google/inject/spi/MembersInjectorLookup;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic visit(Lcom/google/inject/spi/ProviderLookup;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/spi/ProviderLookup;

    .prologue
    .line 30
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/LookupProcessor;->visit(Lcom/google/inject/spi/ProviderLookup;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
