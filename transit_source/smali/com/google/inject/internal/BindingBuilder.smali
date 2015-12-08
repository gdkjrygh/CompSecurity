.class public Lcom/google/inject/internal/BindingBuilder;
.super Lcom/google/inject/internal/AbstractBindingBuilder;
.source "BindingBuilder.java"

# interfaces
.implements Lcom/google/inject/binder/AnnotatedBindingBuilder;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/inject/internal/AbstractBindingBuilder",
        "<TT;>;",
        "Lcom/google/inject/binder/AnnotatedBindingBuilder",
        "<TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/inject/Binder;Ljava/util/List;Ljava/lang/Object;Lcom/google/inject/Key;)V
    .locals 0
    .param p1, "binder"    # Lcom/google/inject/Binder;
    .param p3, "source"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Binder;",
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/spi/Element;",
            ">;",
            "Ljava/lang/Object;",
            "Lcom/google/inject/Key",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 45
    .local p0, "this":Lcom/google/inject/internal/BindingBuilder;, "Lcom/google/inject/internal/BindingBuilder<TT;>;"
    .local p2, "elements":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/spi/Element;>;"
    .local p4, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<TT;>;"
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/inject/internal/AbstractBindingBuilder;-><init>(Lcom/google/inject/Binder;Ljava/util/List;Ljava/lang/Object;Lcom/google/inject/Key;)V

    .line 46
    return-void
.end method

.method private copyErrorsToBinder(Lcom/google/inject/ConfigurationException;)V
    .locals 3
    .param p1, "e"    # Lcom/google/inject/ConfigurationException;

    .prologue
    .line 174
    .local p0, "this":Lcom/google/inject/internal/BindingBuilder;, "Lcom/google/inject/internal/BindingBuilder<TT;>;"
    invoke-virtual {p1}, Lcom/google/inject/ConfigurationException;->getErrorMessages()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/inject/spi/Message;

    .line 175
    .local v1, "message":Lcom/google/inject/spi/Message;
    iget-object v2, p0, Lcom/google/inject/internal/BindingBuilder;->binder:Lcom/google/inject/Binder;

    invoke-interface {v2, v1}, Lcom/google/inject/Binder;->addError(Lcom/google/inject/spi/Message;)V

    goto :goto_0

    .line 177
    .end local v1    # "message":Lcom/google/inject/spi/Message;
    :cond_0
    return-void
.end method


# virtual methods
.method public bridge synthetic annotatedWith(Ljava/lang/Class;)Lcom/google/inject/binder/LinkedBindingBuilder;
    .locals 1
    .param p1, "x0"    # Ljava/lang/Class;

    .prologue
    .line 41
    .local p0, "this":Lcom/google/inject/internal/BindingBuilder;, "Lcom/google/inject/internal/BindingBuilder<TT;>;"
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/BindingBuilder;->annotatedWith(Ljava/lang/Class;)Lcom/google/inject/internal/BindingBuilder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic annotatedWith(Ljava/lang/annotation/Annotation;)Lcom/google/inject/binder/LinkedBindingBuilder;
    .locals 1
    .param p1, "x0"    # Ljava/lang/annotation/Annotation;

    .prologue
    .line 41
    .local p0, "this":Lcom/google/inject/internal/BindingBuilder;, "Lcom/google/inject/internal/BindingBuilder<TT;>;"
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/BindingBuilder;->annotatedWith(Ljava/lang/annotation/Annotation;)Lcom/google/inject/internal/BindingBuilder;

    move-result-object v0

    return-object v0
.end method

.method public annotatedWith(Ljava/lang/Class;)Lcom/google/inject/internal/BindingBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Lcom/google/inject/internal/BindingBuilder",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 49
    .local p0, "this":Lcom/google/inject/internal/BindingBuilder;, "Lcom/google/inject/internal/BindingBuilder<TT;>;"
    .local p1, "annotationType":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/BindingBuilder;->annotatedWithInternal(Ljava/lang/Class;)Lcom/google/inject/internal/BindingImpl;

    .line 50
    return-object p0
.end method

.method public annotatedWith(Ljava/lang/annotation/Annotation;)Lcom/google/inject/internal/BindingBuilder;
    .locals 0
    .param p1, "annotation"    # Ljava/lang/annotation/Annotation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/annotation/Annotation;",
            ")",
            "Lcom/google/inject/internal/BindingBuilder",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 54
    .local p0, "this":Lcom/google/inject/internal/BindingBuilder;, "Lcom/google/inject/internal/BindingBuilder<TT;>;"
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/BindingBuilder;->annotatedWithInternal(Ljava/lang/annotation/Annotation;)Lcom/google/inject/internal/BindingImpl;

    .line 55
    return-object p0
.end method

.method public bridge synthetic to(Lcom/google/inject/Key;)Lcom/google/inject/binder/ScopedBindingBuilder;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/Key;

    .prologue
    .line 41
    .local p0, "this":Lcom/google/inject/internal/BindingBuilder;, "Lcom/google/inject/internal/BindingBuilder<TT;>;"
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/BindingBuilder;->to(Lcom/google/inject/Key;)Lcom/google/inject/internal/BindingBuilder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic to(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/binder/ScopedBindingBuilder;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/TypeLiteral;

    .prologue
    .line 41
    .local p0, "this":Lcom/google/inject/internal/BindingBuilder;, "Lcom/google/inject/internal/BindingBuilder<TT;>;"
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/BindingBuilder;->to(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/internal/BindingBuilder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic to(Ljava/lang/Class;)Lcom/google/inject/binder/ScopedBindingBuilder;
    .locals 1
    .param p1, "x0"    # Ljava/lang/Class;

    .prologue
    .line 41
    .local p0, "this":Lcom/google/inject/internal/BindingBuilder;, "Lcom/google/inject/internal/BindingBuilder<TT;>;"
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/BindingBuilder;->to(Ljava/lang/Class;)Lcom/google/inject/internal/BindingBuilder;

    move-result-object v0

    return-object v0
.end method

.method public to(Lcom/google/inject/Key;)Lcom/google/inject/internal/BindingBuilder;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Key",
            "<+TT;>;)",
            "Lcom/google/inject/internal/BindingBuilder",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 67
    .local p0, "this":Lcom/google/inject/internal/BindingBuilder;, "Lcom/google/inject/internal/BindingBuilder<TT;>;"
    .local p1, "linkedKey":Lcom/google/inject/Key;, "Lcom/google/inject/Key<+TT;>;"
    const-string v1, "linkedKey"

    invoke-static {p1, v1}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    invoke-virtual {p0}, Lcom/google/inject/internal/BindingBuilder;->checkNotTargetted()V

    .line 69
    invoke-virtual {p0}, Lcom/google/inject/internal/BindingBuilder;->getBinding()Lcom/google/inject/internal/BindingImpl;

    move-result-object v0

    .line 70
    .local v0, "base":Lcom/google/inject/internal/BindingImpl;, "Lcom/google/inject/internal/BindingImpl<TT;>;"
    new-instance v1, Lcom/google/inject/internal/LinkedBindingImpl;

    invoke-virtual {v0}, Lcom/google/inject/internal/BindingImpl;->getSource()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/inject/internal/BindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/inject/internal/BindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4, p1}, Lcom/google/inject/internal/LinkedBindingImpl;-><init>(Ljava/lang/Object;Lcom/google/inject/Key;Lcom/google/inject/internal/Scoping;Lcom/google/inject/Key;)V

    invoke-virtual {p0, v1}, Lcom/google/inject/internal/BindingBuilder;->setBinding(Lcom/google/inject/internal/BindingImpl;)Lcom/google/inject/internal/BindingImpl;

    .line 72
    return-object p0
.end method

.method public to(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/internal/BindingBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/TypeLiteral",
            "<+TT;>;)",
            "Lcom/google/inject/internal/BindingBuilder",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 63
    .local p0, "this":Lcom/google/inject/internal/BindingBuilder;, "Lcom/google/inject/internal/BindingBuilder<TT;>;"
    .local p1, "implementation":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<+TT;>;"
    invoke-static {p1}, Lcom/google/inject/Key;->get(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/Key;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/inject/internal/BindingBuilder;->to(Lcom/google/inject/Key;)Lcom/google/inject/internal/BindingBuilder;

    move-result-object v0

    return-object v0
.end method

.method public to(Ljava/lang/Class;)Lcom/google/inject/internal/BindingBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+TT;>;)",
            "Lcom/google/inject/internal/BindingBuilder",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 59
    .local p0, "this":Lcom/google/inject/internal/BindingBuilder;, "Lcom/google/inject/internal/BindingBuilder<TT;>;"
    .local p1, "implementation":Ljava/lang/Class;, "Ljava/lang/Class<+TT;>;"
    invoke-static {p1}, Lcom/google/inject/Key;->get(Ljava/lang/Class;)Lcom/google/inject/Key;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/inject/internal/BindingBuilder;->to(Lcom/google/inject/Key;)Lcom/google/inject/internal/BindingBuilder;

    move-result-object v0

    return-object v0
.end method

.method public toConstructor(Ljava/lang/reflect/Constructor;)Lcom/google/inject/binder/ScopedBindingBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:TT;>(",
            "Ljava/lang/reflect/Constructor",
            "<TS;>;)",
            "Lcom/google/inject/binder/ScopedBindingBuilder;"
        }
    .end annotation

    .prologue
    .line 138
    .local p0, "this":Lcom/google/inject/internal/BindingBuilder;, "Lcom/google/inject/internal/BindingBuilder<TT;>;"
    .local p1, "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<TS;>;"
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/google/inject/TypeLiteral;->get(Ljava/lang/Class;)Lcom/google/inject/TypeLiteral;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/inject/internal/BindingBuilder;->toConstructor(Ljava/lang/reflect/Constructor;Lcom/google/inject/TypeLiteral;)Lcom/google/inject/binder/ScopedBindingBuilder;

    move-result-object v0

    return-object v0
.end method

.method public toConstructor(Ljava/lang/reflect/Constructor;Lcom/google/inject/TypeLiteral;)Lcom/google/inject/binder/ScopedBindingBuilder;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:TT;>(",
            "Ljava/lang/reflect/Constructor",
            "<TS;>;",
            "Lcom/google/inject/TypeLiteral",
            "<+TS;>;)",
            "Lcom/google/inject/binder/ScopedBindingBuilder;"
        }
    .end annotation

    .prologue
    .line 143
    .local p0, "this":Lcom/google/inject/internal/BindingBuilder;, "Lcom/google/inject/internal/BindingBuilder<TT;>;"
    .local p1, "constructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<TS;>;"
    .local p2, "type":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<+TS;>;"
    const-string v0, "constructor"

    invoke-static {p1, v0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    const-string v0, "type"

    invoke-static {p2, v0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    invoke-virtual {p0}, Lcom/google/inject/internal/BindingBuilder;->checkNotTargetted()V

    .line 147
    invoke-virtual {p0}, Lcom/google/inject/internal/BindingBuilder;->getBinding()Lcom/google/inject/internal/BindingImpl;

    move-result-object v6

    .line 151
    .local v6, "base":Lcom/google/inject/internal/BindingImpl;, "Lcom/google/inject/internal/BindingImpl<TT;>;"
    :try_start_0
    invoke-static {p2}, Lcom/google/inject/spi/InjectionPoint;->forInstanceMethodsAndFields(Lcom/google/inject/TypeLiteral;)Ljava/util/Set;
    :try_end_0
    .catch Lcom/google/inject/ConfigurationException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    .line 159
    .local v5, "injectionPoints":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/inject/spi/InjectionPoint;>;"
    :goto_0
    :try_start_1
    invoke-static {p1, p2}, Lcom/google/inject/spi/InjectionPoint;->forConstructor(Ljava/lang/reflect/Constructor;Lcom/google/inject/TypeLiteral;)Lcom/google/inject/spi/InjectionPoint;

    move-result-object v4

    .line 160
    .local v4, "constructorPoint":Lcom/google/inject/spi/InjectionPoint;
    new-instance v0, Lcom/google/inject/internal/ConstructorBindingImpl;

    invoke-virtual {v6}, Lcom/google/inject/internal/BindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v1

    invoke-virtual {v6}, Lcom/google/inject/internal/BindingImpl;->getSource()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v6}, Lcom/google/inject/internal/BindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v3

    invoke-direct/range {v0 .. v5}, Lcom/google/inject/internal/ConstructorBindingImpl;-><init>(Lcom/google/inject/Key;Ljava/lang/Object;Lcom/google/inject/internal/Scoping;Lcom/google/inject/spi/InjectionPoint;Ljava/util/Set;)V

    invoke-virtual {p0, v0}, Lcom/google/inject/internal/BindingBuilder;->setBinding(Lcom/google/inject/internal/BindingImpl;)Lcom/google/inject/internal/BindingImpl;
    :try_end_1
    .catch Lcom/google/inject/ConfigurationException; {:try_start_1 .. :try_end_1} :catch_1

    .line 166
    .end local v4    # "constructorPoint":Lcom/google/inject/spi/InjectionPoint;
    :goto_1
    return-object p0

    .line 152
    .end local v5    # "injectionPoints":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/inject/spi/InjectionPoint;>;"
    :catch_0
    move-exception v7

    .line 153
    .local v7, "e":Lcom/google/inject/ConfigurationException;
    invoke-direct {p0, v7}, Lcom/google/inject/internal/BindingBuilder;->copyErrorsToBinder(Lcom/google/inject/ConfigurationException;)V

    .line 154
    invoke-virtual {v7}, Lcom/google/inject/ConfigurationException;->getPartialValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Set;

    .restart local v5    # "injectionPoints":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/inject/spi/InjectionPoint;>;"
    goto :goto_0

    .line 162
    .end local v7    # "e":Lcom/google/inject/ConfigurationException;
    :catch_1
    move-exception v7

    .line 163
    .restart local v7    # "e":Lcom/google/inject/ConfigurationException;
    invoke-direct {p0, v7}, Lcom/google/inject/internal/BindingBuilder;->copyErrorsToBinder(Lcom/google/inject/ConfigurationException;)V

    goto :goto_1
.end method

.method public toInstance(Ljava/lang/Object;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 76
    .local p0, "this":Lcom/google/inject/internal/BindingBuilder;, "Lcom/google/inject/internal/BindingBuilder<TT;>;"
    .local p1, "instance":Ljava/lang/Object;, "TT;"
    invoke-virtual {p0}, Lcom/google/inject/internal/BindingBuilder;->checkNotTargetted()V

    .line 80
    if-eqz p1, :cond_0

    .line 82
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/google/inject/spi/InjectionPoint;->forInstanceMethodsAndFields(Ljava/lang/Class;)Ljava/util/Set;
    :try_end_0
    .catch Lcom/google/inject/ConfigurationException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    .line 92
    .local v4, "injectionPoints":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/inject/spi/InjectionPoint;>;"
    :goto_0
    invoke-virtual {p0}, Lcom/google/inject/internal/BindingBuilder;->getBinding()Lcom/google/inject/internal/BindingImpl;

    move-result-object v6

    .line 93
    .local v6, "base":Lcom/google/inject/internal/BindingImpl;, "Lcom/google/inject/internal/BindingImpl<TT;>;"
    new-instance v0, Lcom/google/inject/internal/InstanceBindingImpl;

    invoke-virtual {v6}, Lcom/google/inject/internal/BindingImpl;->getSource()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v6}, Lcom/google/inject/internal/BindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v2

    sget-object v3, Lcom/google/inject/internal/Scoping;->EAGER_SINGLETON:Lcom/google/inject/internal/Scoping;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/inject/internal/InstanceBindingImpl;-><init>(Ljava/lang/Object;Lcom/google/inject/Key;Lcom/google/inject/internal/Scoping;Ljava/util/Set;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/google/inject/internal/BindingBuilder;->setBinding(Lcom/google/inject/internal/BindingImpl;)Lcom/google/inject/internal/BindingImpl;

    .line 95
    return-void

    .line 83
    .end local v4    # "injectionPoints":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/inject/spi/InjectionPoint;>;"
    .end local v6    # "base":Lcom/google/inject/internal/BindingImpl;, "Lcom/google/inject/internal/BindingImpl<TT;>;"
    :catch_0
    move-exception v7

    .line 84
    .local v7, "e":Lcom/google/inject/ConfigurationException;
    invoke-direct {p0, v7}, Lcom/google/inject/internal/BindingBuilder;->copyErrorsToBinder(Lcom/google/inject/ConfigurationException;)V

    .line 85
    invoke-virtual {v7}, Lcom/google/inject/ConfigurationException;->getPartialValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Set;

    .line 86
    .restart local v4    # "injectionPoints":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/inject/spi/InjectionPoint;>;"
    goto :goto_0

    .line 88
    .end local v4    # "injectionPoints":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/inject/spi/InjectionPoint;>;"
    .end local v7    # "e":Lcom/google/inject/ConfigurationException;
    :cond_0
    iget-object v0, p0, Lcom/google/inject/internal/BindingBuilder;->binder:Lcom/google/inject/Binder;

    const-string v1, "Binding to null instances is not allowed. Use toProvider(Providers.of(null)) if this is your intended behaviour."

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {v0, v1, v2}, Lcom/google/inject/Binder;->addError(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    invoke-static {}, Lcom/google/inject/internal/util/$ImmutableSet;->of()Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v4

    .restart local v4    # "injectionPoints":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/inject/spi/InjectionPoint;>;"
    goto :goto_0
.end method

.method public bridge synthetic toProvider(Lcom/google/inject/Key;)Lcom/google/inject/binder/ScopedBindingBuilder;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/Key;

    .prologue
    .line 41
    .local p0, "this":Lcom/google/inject/internal/BindingBuilder;, "Lcom/google/inject/internal/BindingBuilder<TT;>;"
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/BindingBuilder;->toProvider(Lcom/google/inject/Key;)Lcom/google/inject/internal/BindingBuilder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toProvider(Lcom/google/inject/Provider;)Lcom/google/inject/binder/ScopedBindingBuilder;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/Provider;

    .prologue
    .line 41
    .local p0, "this":Lcom/google/inject/internal/BindingBuilder;, "Lcom/google/inject/internal/BindingBuilder<TT;>;"
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/BindingBuilder;->toProvider(Lcom/google/inject/Provider;)Lcom/google/inject/internal/BindingBuilder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toProvider(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/binder/ScopedBindingBuilder;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/TypeLiteral;

    .prologue
    .line 41
    .local p0, "this":Lcom/google/inject/internal/BindingBuilder;, "Lcom/google/inject/internal/BindingBuilder<TT;>;"
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/BindingBuilder;->toProvider(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/internal/BindingBuilder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toProvider(Ljava/lang/Class;)Lcom/google/inject/binder/ScopedBindingBuilder;
    .locals 1
    .param p1, "x0"    # Ljava/lang/Class;

    .prologue
    .line 41
    .local p0, "this":Lcom/google/inject/internal/BindingBuilder;, "Lcom/google/inject/internal/BindingBuilder<TT;>;"
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/BindingBuilder;->toProvider(Ljava/lang/Class;)Lcom/google/inject/internal/BindingBuilder;

    move-result-object v0

    return-object v0
.end method

.method public toProvider(Lcom/google/inject/Key;)Lcom/google/inject/internal/BindingBuilder;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Key",
            "<+",
            "Ljavax/inject/Provider",
            "<+TT;>;>;)",
            "Lcom/google/inject/internal/BindingBuilder",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 128
    .local p0, "this":Lcom/google/inject/internal/BindingBuilder;, "Lcom/google/inject/internal/BindingBuilder<TT;>;"
    .local p1, "providerKey":Lcom/google/inject/Key;, "Lcom/google/inject/Key<+Ljavax/inject/Provider<+TT;>;>;"
    const-string v1, "providerKey"

    invoke-static {p1, v1}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    invoke-virtual {p0}, Lcom/google/inject/internal/BindingBuilder;->checkNotTargetted()V

    .line 131
    invoke-virtual {p0}, Lcom/google/inject/internal/BindingBuilder;->getBinding()Lcom/google/inject/internal/BindingImpl;

    move-result-object v0

    .line 132
    .local v0, "base":Lcom/google/inject/internal/BindingImpl;, "Lcom/google/inject/internal/BindingImpl<TT;>;"
    new-instance v1, Lcom/google/inject/internal/LinkedProviderBindingImpl;

    invoke-virtual {v0}, Lcom/google/inject/internal/BindingImpl;->getSource()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/inject/internal/BindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/inject/internal/BindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4, p1}, Lcom/google/inject/internal/LinkedProviderBindingImpl;-><init>(Ljava/lang/Object;Lcom/google/inject/Key;Lcom/google/inject/internal/Scoping;Lcom/google/inject/Key;)V

    invoke-virtual {p0, v1}, Lcom/google/inject/internal/BindingBuilder;->setBinding(Lcom/google/inject/internal/BindingImpl;)Lcom/google/inject/internal/BindingImpl;

    .line 134
    return-object p0
.end method

.method public toProvider(Lcom/google/inject/Provider;)Lcom/google/inject/internal/BindingBuilder;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Provider",
            "<+TT;>;)",
            "Lcom/google/inject/internal/BindingBuilder",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 98
    .local p0, "this":Lcom/google/inject/internal/BindingBuilder;, "Lcom/google/inject/internal/BindingBuilder<TT;>;"
    .local p1, "provider":Lcom/google/inject/Provider;, "Lcom/google/inject/Provider<+TT;>;"
    const-string v0, "provider"

    invoke-static {p1, v0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    invoke-virtual {p0}, Lcom/google/inject/internal/BindingBuilder;->checkNotTargetted()V

    .line 104
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/google/inject/spi/InjectionPoint;->forInstanceMethodsAndFields(Ljava/lang/Class;)Ljava/util/Set;
    :try_end_0
    .catch Lcom/google/inject/ConfigurationException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    .line 110
    .local v4, "injectionPoints":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/inject/spi/InjectionPoint;>;"
    :goto_0
    invoke-virtual {p0}, Lcom/google/inject/internal/BindingBuilder;->getBinding()Lcom/google/inject/internal/BindingImpl;

    move-result-object v6

    .line 111
    .local v6, "base":Lcom/google/inject/internal/BindingImpl;, "Lcom/google/inject/internal/BindingImpl<TT;>;"
    new-instance v0, Lcom/google/inject/internal/ProviderInstanceBindingImpl;

    invoke-virtual {v6}, Lcom/google/inject/internal/BindingImpl;->getSource()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v6}, Lcom/google/inject/internal/BindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v2

    invoke-virtual {v6}, Lcom/google/inject/internal/BindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v3

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/inject/internal/ProviderInstanceBindingImpl;-><init>(Ljava/lang/Object;Lcom/google/inject/Key;Lcom/google/inject/internal/Scoping;Ljava/util/Set;Lcom/google/inject/Provider;)V

    invoke-virtual {p0, v0}, Lcom/google/inject/internal/BindingBuilder;->setBinding(Lcom/google/inject/internal/BindingImpl;)Lcom/google/inject/internal/BindingImpl;

    .line 113
    return-object p0

    .line 105
    .end local v4    # "injectionPoints":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/inject/spi/InjectionPoint;>;"
    .end local v6    # "base":Lcom/google/inject/internal/BindingImpl;, "Lcom/google/inject/internal/BindingImpl<TT;>;"
    :catch_0
    move-exception v7

    .line 106
    .local v7, "e":Lcom/google/inject/ConfigurationException;
    invoke-direct {p0, v7}, Lcom/google/inject/internal/BindingBuilder;->copyErrorsToBinder(Lcom/google/inject/ConfigurationException;)V

    .line 107
    invoke-virtual {v7}, Lcom/google/inject/ConfigurationException;->getPartialValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Set;

    .restart local v4    # "injectionPoints":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/inject/spi/InjectionPoint;>;"
    goto :goto_0
.end method

.method public toProvider(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/internal/BindingBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/TypeLiteral",
            "<+",
            "Ljavax/inject/Provider",
            "<+TT;>;>;)",
            "Lcom/google/inject/internal/BindingBuilder",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 123
    .local p0, "this":Lcom/google/inject/internal/BindingBuilder;, "Lcom/google/inject/internal/BindingBuilder<TT;>;"
    .local p1, "providerType":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<+Ljavax/inject/Provider<+TT;>;>;"
    invoke-static {p1}, Lcom/google/inject/Key;->get(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/Key;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/inject/internal/BindingBuilder;->toProvider(Lcom/google/inject/Key;)Lcom/google/inject/internal/BindingBuilder;

    move-result-object v0

    return-object v0
.end method

.method public toProvider(Ljava/lang/Class;)Lcom/google/inject/internal/BindingBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljavax/inject/Provider",
            "<+TT;>;>;)",
            "Lcom/google/inject/internal/BindingBuilder",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 118
    .local p0, "this":Lcom/google/inject/internal/BindingBuilder;, "Lcom/google/inject/internal/BindingBuilder<TT;>;"
    .local p1, "providerType":Ljava/lang/Class;, "Ljava/lang/Class<+Ljavax/inject/Provider<+TT;>;>;"
    invoke-static {p1}, Lcom/google/inject/Key;->get(Ljava/lang/Class;)Lcom/google/inject/Key;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/inject/internal/BindingBuilder;->toProvider(Lcom/google/inject/Key;)Lcom/google/inject/internal/BindingBuilder;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 170
    .local p0, "this":Lcom/google/inject/internal/BindingBuilder;, "Lcom/google/inject/internal/BindingBuilder<TT;>;"
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BindingBuilder<"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/inject/internal/BindingBuilder;->getBinding()Lcom/google/inject/internal/BindingImpl;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/inject/internal/BindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/inject/Key;->getTypeLiteral()Lcom/google/inject/TypeLiteral;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
