.class Lcom/google/inject/internal/BindingProcessor$1;
.super Lcom/google/inject/internal/AbstractBindingProcessor$Processor;
.source "BindingProcessor.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/inject/internal/BindingProcessor;->visit(Lcom/google/inject/Binding;)Ljava/lang/Boolean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/inject/internal/AbstractBindingProcessor$Processor",
        "<TT;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/inject/internal/BindingProcessor;


# direct methods
.method constructor <init>(Lcom/google/inject/internal/BindingProcessor;Lcom/google/inject/internal/BindingImpl;)V
    .locals 0

    .prologue
    .line 68
    .local p2, "x0":Lcom/google/inject/internal/BindingImpl;, "Lcom/google/inject/internal/BindingImpl<TT;>;"
    iput-object p1, p0, Lcom/google/inject/internal/BindingProcessor$1;->this$0:Lcom/google/inject/internal/BindingProcessor;

    invoke-direct {p0, p1, p2}, Lcom/google/inject/internal/AbstractBindingProcessor$Processor;-><init>(Lcom/google/inject/internal/AbstractBindingProcessor;Lcom/google/inject/internal/BindingImpl;)V

    return-void
.end method


# virtual methods
.method public visit(Lcom/google/inject/spi/ConstructorBinding;)Ljava/lang/Boolean;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/spi/ConstructorBinding",
            "<+TT;>;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    .prologue
    .line 70
    .local p1, "binding":Lcom/google/inject/spi/ConstructorBinding;, "Lcom/google/inject/spi/ConstructorBinding<+TT;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/BindingProcessor$1;->prepareBinding()V

    .line 72
    :try_start_0
    iget-object v0, p0, Lcom/google/inject/internal/BindingProcessor$1;->this$0:Lcom/google/inject/internal/BindingProcessor;

    iget-object v0, v0, Lcom/google/inject/internal/BindingProcessor;->injector:Lcom/google/inject/internal/InjectorImpl;

    iget-object v1, p0, Lcom/google/inject/internal/BindingProcessor$1;->key:Lcom/google/inject/Key;

    invoke-interface {p1}, Lcom/google/inject/spi/ConstructorBinding;->getConstructor()Lcom/google/inject/spi/InjectionPoint;

    move-result-object v2

    iget-object v3, p0, Lcom/google/inject/internal/BindingProcessor$1;->source:Ljava/lang/Object;

    iget-object v4, p0, Lcom/google/inject/internal/BindingProcessor$1;->scoping:Lcom/google/inject/internal/Scoping;

    iget-object v5, p0, Lcom/google/inject/internal/BindingProcessor$1;->this$0:Lcom/google/inject/internal/BindingProcessor;

    iget-object v5, v5, Lcom/google/inject/internal/BindingProcessor;->errors:Lcom/google/inject/internal/Errors;

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lcom/google/inject/internal/ConstructorBindingImpl;->create(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Key;Lcom/google/inject/spi/InjectionPoint;Ljava/lang/Object;Lcom/google/inject/internal/Scoping;Lcom/google/inject/internal/Errors;Z)Lcom/google/inject/internal/ConstructorBindingImpl;

    move-result-object v8

    .line 74
    .local v8, "onInjector":Lcom/google/inject/internal/ConstructorBindingImpl;, "Lcom/google/inject/internal/ConstructorBindingImpl<TT;>;"
    invoke-virtual {p0, v8}, Lcom/google/inject/internal/BindingProcessor$1;->scheduleInitialization(Lcom/google/inject/internal/BindingImpl;)V

    .line 75
    iget-object v0, p0, Lcom/google/inject/internal/BindingProcessor$1;->this$0:Lcom/google/inject/internal/BindingProcessor;

    invoke-virtual {v0, v8}, Lcom/google/inject/internal/BindingProcessor;->putBinding(Lcom/google/inject/internal/BindingImpl;)V
    :try_end_0
    .catch Lcom/google/inject/internal/ErrorsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    .end local v8    # "onInjector":Lcom/google/inject/internal/ConstructorBindingImpl;, "Lcom/google/inject/internal/ConstructorBindingImpl<TT;>;"
    :goto_0
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 76
    :catch_0
    move-exception v7

    .line 77
    .local v7, "e":Lcom/google/inject/internal/ErrorsException;
    iget-object v0, p0, Lcom/google/inject/internal/BindingProcessor$1;->this$0:Lcom/google/inject/internal/BindingProcessor;

    iget-object v0, v0, Lcom/google/inject/internal/BindingProcessor;->errors:Lcom/google/inject/internal/Errors;

    invoke-virtual {v7}, Lcom/google/inject/internal/ErrorsException;->getErrors()Lcom/google/inject/internal/Errors;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/inject/internal/Errors;->merge(Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/Errors;

    .line 78
    iget-object v0, p0, Lcom/google/inject/internal/BindingProcessor$1;->this$0:Lcom/google/inject/internal/BindingProcessor;

    iget-object v1, p0, Lcom/google/inject/internal/BindingProcessor$1;->this$0:Lcom/google/inject/internal/BindingProcessor;

    iget-object v2, p0, Lcom/google/inject/internal/BindingProcessor$1;->this$0:Lcom/google/inject/internal/BindingProcessor;

    iget-object v2, v2, Lcom/google/inject/internal/BindingProcessor;->injector:Lcom/google/inject/internal/InjectorImpl;

    iget-object v3, p0, Lcom/google/inject/internal/BindingProcessor$1;->key:Lcom/google/inject/Key;

    iget-object v4, p0, Lcom/google/inject/internal/BindingProcessor$1;->source:Ljava/lang/Object;

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/inject/internal/BindingProcessor;->invalidBinding(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Key;Ljava/lang/Object;)Lcom/google/inject/internal/UntargettedBindingImpl;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/inject/internal/BindingProcessor;->putBinding(Lcom/google/inject/internal/BindingImpl;)V

    goto :goto_0
.end method

.method public visit(Lcom/google/inject/spi/ConvertedConstantBinding;)Ljava/lang/Boolean;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/spi/ConvertedConstantBinding",
            "<+TT;>;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    .prologue
    .line 149
    .local p1, "binding":Lcom/google/inject/spi/ConvertedConstantBinding;, "Lcom/google/inject/spi/ConvertedConstantBinding<+TT;>;"
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot apply a non-module element"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public visit(Lcom/google/inject/spi/ExposedBinding;)Ljava/lang/Boolean;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/spi/ExposedBinding",
            "<+TT;>;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    .prologue
    .line 145
    .local p1, "binding":Lcom/google/inject/spi/ExposedBinding;, "Lcom/google/inject/spi/ExposedBinding<+TT;>;"
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot apply a non-module element"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public visit(Lcom/google/inject/spi/InstanceBinding;)Ljava/lang/Boolean;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/spi/InstanceBinding",
            "<+TT;>;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    .prologue
    .line 84
    .local p1, "binding":Lcom/google/inject/spi/InstanceBinding;, "Lcom/google/inject/spi/InstanceBinding<+TT;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/BindingProcessor$1;->prepareBinding()V

    .line 85
    invoke-interface {p1}, Lcom/google/inject/spi/InstanceBinding;->getInjectionPoints()Ljava/util/Set;

    move-result-object v5

    .line 86
    .local v5, "injectionPoints":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/inject/spi/InjectionPoint;>;"
    invoke-interface {p1}, Lcom/google/inject/spi/InstanceBinding;->getInstance()Ljava/lang/Object;

    move-result-object v6

    .line 87
    .local v6, "instance":Ljava/lang/Object;, "TT;"
    iget-object v0, p0, Lcom/google/inject/internal/BindingProcessor$1;->this$0:Lcom/google/inject/internal/BindingProcessor;

    # getter for: Lcom/google/inject/internal/BindingProcessor;->initializer:Lcom/google/inject/internal/Initializer;
    invoke-static {v0}, Lcom/google/inject/internal/BindingProcessor;->access$000(Lcom/google/inject/internal/BindingProcessor;)Lcom/google/inject/internal/Initializer;

    move-result-object v0

    iget-object v1, p0, Lcom/google/inject/internal/BindingProcessor$1;->this$0:Lcom/google/inject/internal/BindingProcessor;

    iget-object v1, v1, Lcom/google/inject/internal/BindingProcessor;->injector:Lcom/google/inject/internal/InjectorImpl;

    iget-object v2, p0, Lcom/google/inject/internal/BindingProcessor$1;->source:Ljava/lang/Object;

    invoke-virtual {v0, v1, v6, v2, v5}, Lcom/google/inject/internal/Initializer;->requestInjection(Lcom/google/inject/internal/InjectorImpl;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Set;)Lcom/google/inject/internal/Initializable;

    move-result-object v8

    .line 89
    .local v8, "ref":Lcom/google/inject/internal/Initializable;, "Lcom/google/inject/internal/Initializable<TT;>;"
    new-instance v7, Lcom/google/inject/internal/ConstantFactory;

    invoke-direct {v7, v8}, Lcom/google/inject/internal/ConstantFactory;-><init>(Lcom/google/inject/internal/Initializable;)V

    .line 90
    .local v7, "factory":Lcom/google/inject/internal/ConstantFactory;, "Lcom/google/inject/internal/ConstantFactory<+TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/BindingProcessor$1;->key:Lcom/google/inject/Key;

    iget-object v1, p0, Lcom/google/inject/internal/BindingProcessor$1;->this$0:Lcom/google/inject/internal/BindingProcessor;

    iget-object v1, v1, Lcom/google/inject/internal/BindingProcessor;->injector:Lcom/google/inject/internal/InjectorImpl;

    iget-object v2, p0, Lcom/google/inject/internal/BindingProcessor$1;->source:Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/inject/internal/BindingProcessor$1;->scoping:Lcom/google/inject/internal/Scoping;

    invoke-static {v0, v1, v7, v2, v3}, Lcom/google/inject/internal/Scoping;->scope(Lcom/google/inject/Key;Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/internal/InternalFactory;Ljava/lang/Object;Lcom/google/inject/internal/Scoping;)Lcom/google/inject/internal/InternalFactory;

    move-result-object v4

    .line 92
    .local v4, "scopedFactory":Lcom/google/inject/internal/InternalFactory;, "Lcom/google/inject/internal/InternalFactory<+TT;>;"
    iget-object v9, p0, Lcom/google/inject/internal/BindingProcessor$1;->this$0:Lcom/google/inject/internal/BindingProcessor;

    new-instance v0, Lcom/google/inject/internal/InstanceBindingImpl;

    iget-object v1, p0, Lcom/google/inject/internal/BindingProcessor$1;->this$0:Lcom/google/inject/internal/BindingProcessor;

    iget-object v1, v1, Lcom/google/inject/internal/BindingProcessor;->injector:Lcom/google/inject/internal/InjectorImpl;

    iget-object v2, p0, Lcom/google/inject/internal/BindingProcessor$1;->key:Lcom/google/inject/Key;

    iget-object v3, p0, Lcom/google/inject/internal/BindingProcessor$1;->source:Ljava/lang/Object;

    invoke-direct/range {v0 .. v6}, Lcom/google/inject/internal/InstanceBindingImpl;-><init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Key;Ljava/lang/Object;Lcom/google/inject/internal/InternalFactory;Ljava/util/Set;Ljava/lang/Object;)V

    invoke-virtual {v9, v0}, Lcom/google/inject/internal/BindingProcessor;->putBinding(Lcom/google/inject/internal/BindingImpl;)V

    .line 94
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public visit(Lcom/google/inject/spi/LinkedKeyBinding;)Ljava/lang/Boolean;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/spi/LinkedKeyBinding",
            "<+TT;>;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    .prologue
    .line 125
    .local p1, "binding":Lcom/google/inject/spi/LinkedKeyBinding;, "Lcom/google/inject/spi/LinkedKeyBinding<+TT;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/BindingProcessor$1;->prepareBinding()V

    .line 126
    invoke-interface {p1}, Lcom/google/inject/spi/LinkedKeyBinding;->getLinkedKey()Lcom/google/inject/Key;

    move-result-object v6

    .line 127
    .local v6, "linkedKey":Lcom/google/inject/Key;, "Lcom/google/inject/Key<+TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/BindingProcessor$1;->key:Lcom/google/inject/Key;

    invoke-virtual {v0, v6}, Lcom/google/inject/Key;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 128
    iget-object v0, p0, Lcom/google/inject/internal/BindingProcessor$1;->this$0:Lcom/google/inject/internal/BindingProcessor;

    iget-object v0, v0, Lcom/google/inject/internal/BindingProcessor;->errors:Lcom/google/inject/internal/Errors;

    invoke-virtual {v0}, Lcom/google/inject/internal/Errors;->recursiveBinding()Lcom/google/inject/internal/Errors;

    .line 131
    :cond_0
    new-instance v7, Lcom/google/inject/internal/FactoryProxy;

    iget-object v0, p0, Lcom/google/inject/internal/BindingProcessor$1;->this$0:Lcom/google/inject/internal/BindingProcessor;

    iget-object v0, v0, Lcom/google/inject/internal/BindingProcessor;->injector:Lcom/google/inject/internal/InjectorImpl;

    iget-object v1, p0, Lcom/google/inject/internal/BindingProcessor$1;->key:Lcom/google/inject/Key;

    iget-object v2, p0, Lcom/google/inject/internal/BindingProcessor$1;->source:Ljava/lang/Object;

    invoke-direct {v7, v0, v1, v6, v2}, Lcom/google/inject/internal/FactoryProxy;-><init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Key;Lcom/google/inject/Key;Ljava/lang/Object;)V

    .line 132
    .local v7, "factory":Lcom/google/inject/internal/FactoryProxy;, "Lcom/google/inject/internal/FactoryProxy<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/BindingProcessor$1;->this$0:Lcom/google/inject/internal/BindingProcessor;

    iget-object v0, v0, Lcom/google/inject/internal/BindingProcessor;->bindingData:Lcom/google/inject/internal/ProcessedBindingData;

    invoke-virtual {v0, v7}, Lcom/google/inject/internal/ProcessedBindingData;->addCreationListener(Lcom/google/inject/internal/CreationListener;)V

    .line 133
    iget-object v0, p0, Lcom/google/inject/internal/BindingProcessor$1;->key:Lcom/google/inject/Key;

    iget-object v1, p0, Lcom/google/inject/internal/BindingProcessor$1;->this$0:Lcom/google/inject/internal/BindingProcessor;

    iget-object v1, v1, Lcom/google/inject/internal/BindingProcessor;->injector:Lcom/google/inject/internal/InjectorImpl;

    iget-object v2, p0, Lcom/google/inject/internal/BindingProcessor$1;->source:Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/inject/internal/BindingProcessor$1;->scoping:Lcom/google/inject/internal/Scoping;

    invoke-static {v0, v1, v7, v2, v3}, Lcom/google/inject/internal/Scoping;->scope(Lcom/google/inject/Key;Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/internal/InternalFactory;Ljava/lang/Object;Lcom/google/inject/internal/Scoping;)Lcom/google/inject/internal/InternalFactory;

    move-result-object v4

    .line 135
    .local v4, "scopedFactory":Lcom/google/inject/internal/InternalFactory;, "Lcom/google/inject/internal/InternalFactory<+TT;>;"
    iget-object v8, p0, Lcom/google/inject/internal/BindingProcessor$1;->this$0:Lcom/google/inject/internal/BindingProcessor;

    new-instance v0, Lcom/google/inject/internal/LinkedBindingImpl;

    iget-object v1, p0, Lcom/google/inject/internal/BindingProcessor$1;->this$0:Lcom/google/inject/internal/BindingProcessor;

    iget-object v1, v1, Lcom/google/inject/internal/BindingProcessor;->injector:Lcom/google/inject/internal/InjectorImpl;

    iget-object v2, p0, Lcom/google/inject/internal/BindingProcessor$1;->key:Lcom/google/inject/Key;

    iget-object v3, p0, Lcom/google/inject/internal/BindingProcessor$1;->source:Ljava/lang/Object;

    iget-object v5, p0, Lcom/google/inject/internal/BindingProcessor$1;->scoping:Lcom/google/inject/internal/Scoping;

    invoke-direct/range {v0 .. v6}, Lcom/google/inject/internal/LinkedBindingImpl;-><init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Key;Ljava/lang/Object;Lcom/google/inject/internal/InternalFactory;Lcom/google/inject/internal/Scoping;Lcom/google/inject/Key;)V

    invoke-virtual {v8, v0}, Lcom/google/inject/internal/BindingProcessor;->putBinding(Lcom/google/inject/internal/BindingImpl;)V

    .line 137
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public visit(Lcom/google/inject/spi/ProviderBinding;)Ljava/lang/Boolean;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/spi/ProviderBinding",
            "<+TT;>;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    .prologue
    .line 153
    .local p1, "binding":Lcom/google/inject/spi/ProviderBinding;, "Lcom/google/inject/spi/ProviderBinding<+TT;>;"
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot apply a non-module element"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public visit(Lcom/google/inject/spi/ProviderInstanceBinding;)Ljava/lang/Boolean;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/spi/ProviderInstanceBinding",
            "<+TT;>;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    .prologue
    .line 98
    .local p1, "binding":Lcom/google/inject/spi/ProviderInstanceBinding;, "Lcom/google/inject/spi/ProviderInstanceBinding<+TT;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/BindingProcessor$1;->prepareBinding()V

    .line 99
    invoke-interface {p1}, Lcom/google/inject/spi/ProviderInstanceBinding;->getProviderInstance()Lcom/google/inject/Provider;

    move-result-object v6

    .line 100
    .local v6, "provider":Lcom/google/inject/Provider;, "Lcom/google/inject/Provider<+TT;>;"
    invoke-interface {p1}, Lcom/google/inject/spi/ProviderInstanceBinding;->getInjectionPoints()Ljava/util/Set;

    move-result-object v7

    .line 101
    .local v7, "injectionPoints":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/inject/spi/InjectionPoint;>;"
    iget-object v0, p0, Lcom/google/inject/internal/BindingProcessor$1;->this$0:Lcom/google/inject/internal/BindingProcessor;

    # getter for: Lcom/google/inject/internal/BindingProcessor;->initializer:Lcom/google/inject/internal/Initializer;
    invoke-static {v0}, Lcom/google/inject/internal/BindingProcessor;->access$000(Lcom/google/inject/internal/BindingProcessor;)Lcom/google/inject/internal/Initializer;

    move-result-object v0

    iget-object v1, p0, Lcom/google/inject/internal/BindingProcessor$1;->this$0:Lcom/google/inject/internal/BindingProcessor;

    iget-object v1, v1, Lcom/google/inject/internal/BindingProcessor;->injector:Lcom/google/inject/internal/InjectorImpl;

    iget-object v2, p0, Lcom/google/inject/internal/BindingProcessor$1;->source:Ljava/lang/Object;

    invoke-virtual {v0, v1, v6, v2, v7}, Lcom/google/inject/internal/Initializer;->requestInjection(Lcom/google/inject/internal/InjectorImpl;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Set;)Lcom/google/inject/internal/Initializable;

    move-result-object v9

    .line 103
    .local v9, "initializable":Lcom/google/inject/internal/Initializable;, "Lcom/google/inject/internal/Initializable<Lcom/google/inject/Provider<+TT;>;>;"
    new-instance v8, Lcom/google/inject/internal/InternalFactoryToProviderAdapter;

    iget-object v0, p0, Lcom/google/inject/internal/BindingProcessor$1;->source:Ljava/lang/Object;

    invoke-direct {v8, v9, v0}, Lcom/google/inject/internal/InternalFactoryToProviderAdapter;-><init>(Lcom/google/inject/internal/Initializable;Ljava/lang/Object;)V

    .line 104
    .local v8, "factory":Lcom/google/inject/internal/InternalFactory;, "Lcom/google/inject/internal/InternalFactory<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/BindingProcessor$1;->key:Lcom/google/inject/Key;

    iget-object v1, p0, Lcom/google/inject/internal/BindingProcessor$1;->this$0:Lcom/google/inject/internal/BindingProcessor;

    iget-object v1, v1, Lcom/google/inject/internal/BindingProcessor;->injector:Lcom/google/inject/internal/InjectorImpl;

    iget-object v2, p0, Lcom/google/inject/internal/BindingProcessor$1;->source:Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/inject/internal/BindingProcessor$1;->scoping:Lcom/google/inject/internal/Scoping;

    invoke-static {v0, v1, v8, v2, v3}, Lcom/google/inject/internal/Scoping;->scope(Lcom/google/inject/Key;Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/internal/InternalFactory;Ljava/lang/Object;Lcom/google/inject/internal/Scoping;)Lcom/google/inject/internal/InternalFactory;

    move-result-object v4

    .line 106
    .local v4, "scopedFactory":Lcom/google/inject/internal/InternalFactory;, "Lcom/google/inject/internal/InternalFactory<+TT;>;"
    iget-object v10, p0, Lcom/google/inject/internal/BindingProcessor$1;->this$0:Lcom/google/inject/internal/BindingProcessor;

    new-instance v0, Lcom/google/inject/internal/ProviderInstanceBindingImpl;

    iget-object v1, p0, Lcom/google/inject/internal/BindingProcessor$1;->this$0:Lcom/google/inject/internal/BindingProcessor;

    iget-object v1, v1, Lcom/google/inject/internal/BindingProcessor;->injector:Lcom/google/inject/internal/InjectorImpl;

    iget-object v2, p0, Lcom/google/inject/internal/BindingProcessor$1;->key:Lcom/google/inject/Key;

    iget-object v3, p0, Lcom/google/inject/internal/BindingProcessor$1;->source:Ljava/lang/Object;

    iget-object v5, p0, Lcom/google/inject/internal/BindingProcessor$1;->scoping:Lcom/google/inject/internal/Scoping;

    invoke-direct/range {v0 .. v7}, Lcom/google/inject/internal/ProviderInstanceBindingImpl;-><init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Key;Ljava/lang/Object;Lcom/google/inject/internal/InternalFactory;Lcom/google/inject/internal/Scoping;Lcom/google/inject/Provider;Ljava/util/Set;)V

    invoke-virtual {v10, v0}, Lcom/google/inject/internal/BindingProcessor;->putBinding(Lcom/google/inject/internal/BindingImpl;)V

    .line 108
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public visit(Lcom/google/inject/spi/ProviderKeyBinding;)Ljava/lang/Boolean;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/spi/ProviderKeyBinding",
            "<+TT;>;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    .prologue
    .line 112
    .local p1, "binding":Lcom/google/inject/spi/ProviderKeyBinding;, "Lcom/google/inject/spi/ProviderKeyBinding<+TT;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/BindingProcessor$1;->prepareBinding()V

    .line 113
    invoke-interface {p1}, Lcom/google/inject/spi/ProviderKeyBinding;->getProviderKey()Lcom/google/inject/Key;

    move-result-object v6

    .line 114
    .local v6, "providerKey":Lcom/google/inject/Key;, "Lcom/google/inject/Key<+Ljavax/inject/Provider<+TT;>;>;"
    new-instance v7, Lcom/google/inject/internal/BoundProviderFactory;

    iget-object v0, p0, Lcom/google/inject/internal/BindingProcessor$1;->this$0:Lcom/google/inject/internal/BindingProcessor;

    iget-object v0, v0, Lcom/google/inject/internal/BindingProcessor;->injector:Lcom/google/inject/internal/InjectorImpl;

    iget-object v1, p0, Lcom/google/inject/internal/BindingProcessor$1;->source:Ljava/lang/Object;

    invoke-direct {v7, v0, v6, v1}, Lcom/google/inject/internal/BoundProviderFactory;-><init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Key;Ljava/lang/Object;)V

    .line 116
    .local v7, "boundProviderFactory":Lcom/google/inject/internal/BoundProviderFactory;, "Lcom/google/inject/internal/BoundProviderFactory<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/BindingProcessor$1;->this$0:Lcom/google/inject/internal/BindingProcessor;

    iget-object v0, v0, Lcom/google/inject/internal/BindingProcessor;->bindingData:Lcom/google/inject/internal/ProcessedBindingData;

    invoke-virtual {v0, v7}, Lcom/google/inject/internal/ProcessedBindingData;->addCreationListener(Lcom/google/inject/internal/CreationListener;)V

    .line 117
    iget-object v0, p0, Lcom/google/inject/internal/BindingProcessor$1;->key:Lcom/google/inject/Key;

    iget-object v1, p0, Lcom/google/inject/internal/BindingProcessor$1;->this$0:Lcom/google/inject/internal/BindingProcessor;

    iget-object v1, v1, Lcom/google/inject/internal/BindingProcessor;->injector:Lcom/google/inject/internal/InjectorImpl;

    iget-object v2, p0, Lcom/google/inject/internal/BindingProcessor$1;->source:Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/inject/internal/BindingProcessor$1;->scoping:Lcom/google/inject/internal/Scoping;

    invoke-static {v0, v1, v7, v2, v3}, Lcom/google/inject/internal/Scoping;->scope(Lcom/google/inject/Key;Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/internal/InternalFactory;Ljava/lang/Object;Lcom/google/inject/internal/Scoping;)Lcom/google/inject/internal/InternalFactory;

    move-result-object v4

    .line 119
    .local v4, "scopedFactory":Lcom/google/inject/internal/InternalFactory;, "Lcom/google/inject/internal/InternalFactory<+TT;>;"
    iget-object v8, p0, Lcom/google/inject/internal/BindingProcessor$1;->this$0:Lcom/google/inject/internal/BindingProcessor;

    new-instance v0, Lcom/google/inject/internal/LinkedProviderBindingImpl;

    iget-object v1, p0, Lcom/google/inject/internal/BindingProcessor$1;->this$0:Lcom/google/inject/internal/BindingProcessor;

    iget-object v1, v1, Lcom/google/inject/internal/BindingProcessor;->injector:Lcom/google/inject/internal/InjectorImpl;

    iget-object v2, p0, Lcom/google/inject/internal/BindingProcessor$1;->key:Lcom/google/inject/Key;

    iget-object v3, p0, Lcom/google/inject/internal/BindingProcessor$1;->source:Ljava/lang/Object;

    iget-object v5, p0, Lcom/google/inject/internal/BindingProcessor$1;->scoping:Lcom/google/inject/internal/Scoping;

    invoke-direct/range {v0 .. v6}, Lcom/google/inject/internal/LinkedProviderBindingImpl;-><init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Key;Ljava/lang/Object;Lcom/google/inject/internal/InternalFactory;Lcom/google/inject/internal/Scoping;Lcom/google/inject/Key;)V

    invoke-virtual {v8, v0}, Lcom/google/inject/internal/BindingProcessor;->putBinding(Lcom/google/inject/internal/BindingImpl;)V

    .line 121
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public visit(Lcom/google/inject/spi/UntargettedBinding;)Ljava/lang/Boolean;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/spi/UntargettedBinding",
            "<+TT;>;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    .prologue
    .line 141
    .local p1, "untargetted":Lcom/google/inject/spi/UntargettedBinding;, "Lcom/google/inject/spi/UntargettedBinding<+TT;>;"
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic visit(Lcom/google/inject/spi/ConstructorBinding;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/spi/ConstructorBinding;

    .prologue
    .line 68
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/BindingProcessor$1;->visit(Lcom/google/inject/spi/ConstructorBinding;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic visit(Lcom/google/inject/spi/ConvertedConstantBinding;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/spi/ConvertedConstantBinding;

    .prologue
    .line 68
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/BindingProcessor$1;->visit(Lcom/google/inject/spi/ConvertedConstantBinding;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic visit(Lcom/google/inject/spi/ExposedBinding;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/spi/ExposedBinding;

    .prologue
    .line 68
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/BindingProcessor$1;->visit(Lcom/google/inject/spi/ExposedBinding;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic visit(Lcom/google/inject/spi/InstanceBinding;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/spi/InstanceBinding;

    .prologue
    .line 68
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/BindingProcessor$1;->visit(Lcom/google/inject/spi/InstanceBinding;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic visit(Lcom/google/inject/spi/LinkedKeyBinding;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/spi/LinkedKeyBinding;

    .prologue
    .line 68
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/BindingProcessor$1;->visit(Lcom/google/inject/spi/LinkedKeyBinding;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic visit(Lcom/google/inject/spi/ProviderBinding;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/spi/ProviderBinding;

    .prologue
    .line 68
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/BindingProcessor$1;->visit(Lcom/google/inject/spi/ProviderBinding;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic visit(Lcom/google/inject/spi/ProviderInstanceBinding;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/spi/ProviderInstanceBinding;

    .prologue
    .line 68
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/BindingProcessor$1;->visit(Lcom/google/inject/spi/ProviderInstanceBinding;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic visit(Lcom/google/inject/spi/ProviderKeyBinding;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/spi/ProviderKeyBinding;

    .prologue
    .line 68
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/BindingProcessor$1;->visit(Lcom/google/inject/spi/ProviderKeyBinding;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic visit(Lcom/google/inject/spi/UntargettedBinding;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/spi/UntargettedBinding;

    .prologue
    .line 68
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/BindingProcessor$1;->visit(Lcom/google/inject/spi/UntargettedBinding;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected visitOther(Lcom/google/inject/Binding;)Ljava/lang/Boolean;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Binding",
            "<+TT;>;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    .prologue
    .line 158
    .local p1, "binding":Lcom/google/inject/Binding;, "Lcom/google/inject/Binding<+TT;>;"
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "BindingProcessor should override all visitations"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected bridge synthetic visitOther(Lcom/google/inject/Binding;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/Binding;

    .prologue
    .line 68
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/BindingProcessor$1;->visitOther(Lcom/google/inject/Binding;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
