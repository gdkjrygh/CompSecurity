.class final Lcom/google/inject/internal/DeferredLookups;
.super Ljava/lang/Object;
.source "DeferredLookups.java"

# interfaces
.implements Lcom/google/inject/internal/Lookups;


# instance fields
.field private final injector:Lcom/google/inject/internal/InjectorImpl;

.field private final lookups:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/spi/Element;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/inject/internal/InjectorImpl;)V
    .locals 1
    .param p1, "injector"    # Lcom/google/inject/internal/InjectorImpl;

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    invoke-static {}, Lcom/google/inject/internal/util/$Lists;->newArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/DeferredLookups;->lookups:Ljava/util/List;

    .line 40
    iput-object p1, p0, Lcom/google/inject/internal/DeferredLookups;->injector:Lcom/google/inject/internal/InjectorImpl;

    .line 41
    return-void
.end method


# virtual methods
.method public getMembersInjector(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/MembersInjector;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/TypeLiteral",
            "<TT;>;)",
            "Lcom/google/inject/MembersInjector",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 58
    .local p1, "type":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<TT;>;"
    new-instance v0, Lcom/google/inject/spi/MembersInjectorLookup;

    invoke-direct {v0, p1, p1}, Lcom/google/inject/spi/MembersInjectorLookup;-><init>(Ljava/lang/Object;Lcom/google/inject/TypeLiteral;)V

    .line 59
    .local v0, "lookup":Lcom/google/inject/spi/MembersInjectorLookup;, "Lcom/google/inject/spi/MembersInjectorLookup<TT;>;"
    iget-object v1, p0, Lcom/google/inject/internal/DeferredLookups;->lookups:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    invoke-virtual {v0}, Lcom/google/inject/spi/MembersInjectorLookup;->getMembersInjector()Lcom/google/inject/MembersInjector;

    move-result-object v1

    return-object v1
.end method

.method public getProvider(Lcom/google/inject/Key;)Lcom/google/inject/Provider;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/Key",
            "<TT;>;)",
            "Lcom/google/inject/Provider",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 52
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<TT;>;"
    new-instance v0, Lcom/google/inject/spi/ProviderLookup;

    invoke-direct {v0, p1, p1}, Lcom/google/inject/spi/ProviderLookup;-><init>(Ljava/lang/Object;Lcom/google/inject/Key;)V

    .line 53
    .local v0, "lookup":Lcom/google/inject/spi/ProviderLookup;, "Lcom/google/inject/spi/ProviderLookup<TT;>;"
    iget-object v1, p0, Lcom/google/inject/internal/DeferredLookups;->lookups:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    invoke-virtual {v0}, Lcom/google/inject/spi/ProviderLookup;->getProvider()Lcom/google/inject/Provider;

    move-result-object v1

    return-object v1
.end method

.method initialize(Lcom/google/inject/internal/Errors;)V
    .locals 3
    .param p1, "errors"    # Lcom/google/inject/internal/Errors;

    .prologue
    .line 47
    iget-object v0, p0, Lcom/google/inject/internal/DeferredLookups;->injector:Lcom/google/inject/internal/InjectorImpl;

    iget-object v1, p0, Lcom/google/inject/internal/DeferredLookups;->injector:Lcom/google/inject/internal/InjectorImpl;

    iput-object v1, v0, Lcom/google/inject/internal/InjectorImpl;->lookups:Lcom/google/inject/internal/Lookups;

    .line 48
    new-instance v0, Lcom/google/inject/internal/LookupProcessor;

    invoke-direct {v0, p1}, Lcom/google/inject/internal/LookupProcessor;-><init>(Lcom/google/inject/internal/Errors;)V

    iget-object v1, p0, Lcom/google/inject/internal/DeferredLookups;->injector:Lcom/google/inject/internal/InjectorImpl;

    iget-object v2, p0, Lcom/google/inject/internal/DeferredLookups;->lookups:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/LookupProcessor;->process(Lcom/google/inject/internal/InjectorImpl;Ljava/util/List;)V

    .line 49
    return-void
.end method
