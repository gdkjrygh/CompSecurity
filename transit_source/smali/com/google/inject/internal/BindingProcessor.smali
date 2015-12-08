.class final Lcom/google/inject/internal/BindingProcessor;
.super Lcom/google/inject/internal/AbstractBindingProcessor;
.source "BindingProcessor.java"


# instance fields
.field private final initializer:Lcom/google/inject/internal/Initializer;


# direct methods
.method constructor <init>(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/Initializer;Lcom/google/inject/internal/ProcessedBindingData;)V
    .locals 0
    .param p1, "errors"    # Lcom/google/inject/internal/Errors;
    .param p2, "initializer"    # Lcom/google/inject/internal/Initializer;
    .param p3, "bindingData"    # Lcom/google/inject/internal/ProcessedBindingData;

    .prologue
    .line 47
    invoke-direct {p0, p1, p3}, Lcom/google/inject/internal/AbstractBindingProcessor;-><init>(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/ProcessedBindingData;)V

    .line 48
    iput-object p2, p0, Lcom/google/inject/internal/BindingProcessor;->initializer:Lcom/google/inject/internal/Initializer;

    .line 49
    return-void
.end method

.method static synthetic access$000(Lcom/google/inject/internal/BindingProcessor;)Lcom/google/inject/internal/Initializer;
    .locals 1
    .param p0, "x0"    # Lcom/google/inject/internal/BindingProcessor;

    .prologue
    .line 42
    iget-object v0, p0, Lcom/google/inject/internal/BindingProcessor;->initializer:Lcom/google/inject/internal/Initializer;

    return-object v0
.end method

.method private bindExposed(Lcom/google/inject/spi/PrivateElements;Lcom/google/inject/Key;)V
    .locals 6
    .param p1, "privateElements"    # Lcom/google/inject/spi/PrivateElements;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/spi/PrivateElements;",
            "Lcom/google/inject/Key",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 171
    .local p2, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<TT;>;"
    new-instance v4, Lcom/google/inject/internal/ExposedKeyFactory;

    invoke-direct {v4, p2, p1}, Lcom/google/inject/internal/ExposedKeyFactory;-><init>(Lcom/google/inject/Key;Lcom/google/inject/spi/PrivateElements;)V

    .line 172
    .local v4, "exposedKeyFactory":Lcom/google/inject/internal/ExposedKeyFactory;, "Lcom/google/inject/internal/ExposedKeyFactory<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/BindingProcessor;->bindingData:Lcom/google/inject/internal/ProcessedBindingData;

    invoke-virtual {v0, v4}, Lcom/google/inject/internal/ProcessedBindingData;->addCreationListener(Lcom/google/inject/internal/CreationListener;)V

    .line 173
    new-instance v0, Lcom/google/inject/internal/ExposedBindingImpl;

    iget-object v1, p0, Lcom/google/inject/internal/BindingProcessor;->injector:Lcom/google/inject/internal/InjectorImpl;

    invoke-interface {p1, p2}, Lcom/google/inject/spi/PrivateElements;->getExposedSource(Lcom/google/inject/Key;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, p2

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/inject/internal/ExposedBindingImpl;-><init>(Lcom/google/inject/internal/InjectorImpl;Ljava/lang/Object;Lcom/google/inject/Key;Lcom/google/inject/internal/InternalFactory;Lcom/google/inject/spi/PrivateElements;)V

    invoke-virtual {p0, v0}, Lcom/google/inject/internal/BindingProcessor;->putBinding(Lcom/google/inject/internal/BindingImpl;)V

    .line 175
    return-void
.end method


# virtual methods
.method public visit(Lcom/google/inject/Binding;)Ljava/lang/Boolean;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/Binding",
            "<TT;>;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    .prologue
    .local p1, "command":Lcom/google/inject/Binding;, "Lcom/google/inject/Binding<TT;>;"
    const/4 v2, 0x1

    .line 52
    invoke-interface {p1}, Lcom/google/inject/Binding;->getKey()Lcom/google/inject/Key;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/inject/Key;->getTypeLiteral()Lcom/google/inject/TypeLiteral;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/inject/TypeLiteral;->getRawType()Ljava/lang/Class;

    move-result-object v0

    .line 53
    .local v0, "rawType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-class v1, Ljava/lang/Void;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 54
    instance-of v1, p1, Lcom/google/inject/spi/ProviderInstanceBinding;

    if-eqz v1, :cond_0

    check-cast p1, Lcom/google/inject/spi/ProviderInstanceBinding;

    .end local p1    # "command":Lcom/google/inject/Binding;, "Lcom/google/inject/Binding<TT;>;"
    invoke-interface {p1}, Lcom/google/inject/spi/ProviderInstanceBinding;->getProviderInstance()Lcom/google/inject/Provider;

    move-result-object v1

    instance-of v1, v1, Lcom/google/inject/internal/ProviderMethod;

    if-eqz v1, :cond_0

    .line 56
    iget-object v1, p0, Lcom/google/inject/internal/BindingProcessor;->errors:Lcom/google/inject/internal/Errors;

    invoke-virtual {v1}, Lcom/google/inject/internal/Errors;->voidProviderMethod()Lcom/google/inject/internal/Errors;

    .line 60
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 68
    :goto_1
    return-object v1

    .line 58
    :cond_0
    iget-object v1, p0, Lcom/google/inject/internal/BindingProcessor;->errors:Lcom/google/inject/internal/Errors;

    invoke-virtual {v1}, Lcom/google/inject/internal/Errors;->missingConstantValues()Lcom/google/inject/internal/Errors;

    goto :goto_0

    .line 63
    .restart local p1    # "command":Lcom/google/inject/Binding;, "Lcom/google/inject/Binding<TT;>;"
    :cond_1
    const-class v1, Lcom/google/inject/Provider;

    if-ne v0, v1, :cond_2

    .line 64
    iget-object v1, p0, Lcom/google/inject/internal/BindingProcessor;->errors:Lcom/google/inject/internal/Errors;

    invoke-virtual {v1}, Lcom/google/inject/internal/Errors;->bindingToProvider()Lcom/google/inject/internal/Errors;

    .line 65
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    goto :goto_1

    .line 68
    :cond_2
    new-instance v2, Lcom/google/inject/internal/BindingProcessor$1;

    move-object v1, p1

    check-cast v1, Lcom/google/inject/internal/BindingImpl;

    invoke-direct {v2, p0, v1}, Lcom/google/inject/internal/BindingProcessor$1;-><init>(Lcom/google/inject/internal/BindingProcessor;Lcom/google/inject/internal/BindingImpl;)V

    invoke-interface {p1, v2}, Lcom/google/inject/Binding;->acceptTargetVisitor(Lcom/google/inject/spi/BindingTargetVisitor;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    goto :goto_1
.end method

.method public visit(Lcom/google/inject/spi/PrivateElements;)Ljava/lang/Boolean;
    .locals 3
    .param p1, "privateElements"    # Lcom/google/inject/spi/PrivateElements;

    .prologue
    .line 164
    invoke-interface {p1}, Lcom/google/inject/spi/PrivateElements;->getExposedKeys()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/inject/Key;

    .line 165
    .local v1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<*>;"
    invoke-direct {p0, p1, v1}, Lcom/google/inject/internal/BindingProcessor;->bindExposed(Lcom/google/inject/spi/PrivateElements;Lcom/google/inject/Key;)V

    goto :goto_0

    .line 167
    .end local v1    # "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<*>;"
    :cond_0
    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    return-object v2
.end method

.method public bridge synthetic visit(Lcom/google/inject/Binding;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/Binding;

    .prologue
    .line 42
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/BindingProcessor;->visit(Lcom/google/inject/Binding;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic visit(Lcom/google/inject/spi/PrivateElements;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/spi/PrivateElements;

    .prologue
    .line 42
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/BindingProcessor;->visit(Lcom/google/inject/spi/PrivateElements;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
