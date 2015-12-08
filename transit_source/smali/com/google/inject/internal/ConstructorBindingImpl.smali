.class final Lcom/google/inject/internal/ConstructorBindingImpl;
.super Lcom/google/inject/internal/BindingImpl;
.source "ConstructorBindingImpl.java"

# interfaces
.implements Lcom/google/inject/spi/ConstructorBinding;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/inject/internal/ConstructorBindingImpl$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/inject/internal/BindingImpl",
        "<TT;>;",
        "Lcom/google/inject/spi/ConstructorBinding",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final constructorInjectionPoint:Lcom/google/inject/spi/InjectionPoint;

.field private final factory:Lcom/google/inject/internal/ConstructorBindingImpl$Factory;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/ConstructorBindingImpl$Factory",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/inject/Key;Ljava/lang/Object;Lcom/google/inject/internal/Scoping;Lcom/google/inject/spi/InjectionPoint;Ljava/util/Set;)V
    .locals 4
    .param p2, "source"    # Ljava/lang/Object;
    .param p3, "scoping"    # Lcom/google/inject/internal/Scoping;
    .param p4, "constructorInjectionPoint"    # Lcom/google/inject/spi/InjectionPoint;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Key",
            "<TT;>;",
            "Ljava/lang/Object;",
            "Lcom/google/inject/internal/Scoping;",
            "Lcom/google/inject/spi/InjectionPoint;",
            "Ljava/util/Set",
            "<",
            "Lcom/google/inject/spi/InjectionPoint;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/inject/internal/ConstructorBindingImpl;, "Lcom/google/inject/internal/ConstructorBindingImpl<TT;>;"
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<TT;>;"
    .local p5, "injectionPoints":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/inject/spi/InjectionPoint;>;"
    const/4 v3, 0x0

    .line 56
    invoke-direct {p0, p2, p1, p3}, Lcom/google/inject/internal/BindingImpl;-><init>(Ljava/lang/Object;Lcom/google/inject/Key;Lcom/google/inject/internal/Scoping;)V

    .line 57
    new-instance v1, Lcom/google/inject/internal/ConstructorBindingImpl$Factory;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p1}, Lcom/google/inject/internal/ConstructorBindingImpl$Factory;-><init>(ZLcom/google/inject/Key;)V

    iput-object v1, p0, Lcom/google/inject/internal/ConstructorBindingImpl;->factory:Lcom/google/inject/internal/ConstructorBindingImpl$Factory;

    .line 58
    new-instance v1, Lcom/google/inject/internal/DefaultConstructionProxyFactory;

    invoke-direct {v1, p4}, Lcom/google/inject/internal/DefaultConstructionProxyFactory;-><init>(Lcom/google/inject/spi/InjectionPoint;)V

    invoke-virtual {v1}, Lcom/google/inject/internal/DefaultConstructionProxyFactory;->create()Lcom/google/inject/internal/ConstructionProxy;

    move-result-object v0

    .line 60
    .local v0, "constructionProxy":Lcom/google/inject/internal/ConstructionProxy;, "Lcom/google/inject/internal/ConstructionProxy<TT;>;"
    iput-object p4, p0, Lcom/google/inject/internal/ConstructorBindingImpl;->constructorInjectionPoint:Lcom/google/inject/spi/InjectionPoint;

    .line 61
    iget-object v1, p0, Lcom/google/inject/internal/ConstructorBindingImpl;->factory:Lcom/google/inject/internal/ConstructorBindingImpl$Factory;

    new-instance v2, Lcom/google/inject/internal/ConstructorInjector;

    invoke-direct {v2, p5, v0, v3, v3}, Lcom/google/inject/internal/ConstructorInjector;-><init>(Ljava/util/Set;Lcom/google/inject/internal/ConstructionProxy;[Lcom/google/inject/internal/SingleParameterInjector;Lcom/google/inject/internal/MembersInjectorImpl;)V

    # setter for: Lcom/google/inject/internal/ConstructorBindingImpl$Factory;->constructorInjector:Lcom/google/inject/internal/ConstructorInjector;
    invoke-static {v1, v2}, Lcom/google/inject/internal/ConstructorBindingImpl$Factory;->access$002(Lcom/google/inject/internal/ConstructorBindingImpl$Factory;Lcom/google/inject/internal/ConstructorInjector;)Lcom/google/inject/internal/ConstructorInjector;

    .line 63
    return-void
.end method

.method private constructor <init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Key;Ljava/lang/Object;Lcom/google/inject/internal/InternalFactory;Lcom/google/inject/internal/Scoping;Lcom/google/inject/internal/ConstructorBindingImpl$Factory;Lcom/google/inject/spi/InjectionPoint;)V
    .locals 0
    .param p1, "injector"    # Lcom/google/inject/internal/InjectorImpl;
    .param p3, "source"    # Ljava/lang/Object;
    .param p5, "scoping"    # Lcom/google/inject/internal/Scoping;
    .param p7, "constructorInjectionPoint"    # Lcom/google/inject/spi/InjectionPoint;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/InjectorImpl;",
            "Lcom/google/inject/Key",
            "<TT;>;",
            "Ljava/lang/Object;",
            "Lcom/google/inject/internal/InternalFactory",
            "<+TT;>;",
            "Lcom/google/inject/internal/Scoping;",
            "Lcom/google/inject/internal/ConstructorBindingImpl$Factory",
            "<TT;>;",
            "Lcom/google/inject/spi/InjectionPoint;",
            ")V"
        }
    .end annotation

    .prologue
    .line 49
    .local p0, "this":Lcom/google/inject/internal/ConstructorBindingImpl;, "Lcom/google/inject/internal/ConstructorBindingImpl<TT;>;"
    .local p2, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<TT;>;"
    .local p4, "scopedFactory":Lcom/google/inject/internal/InternalFactory;, "Lcom/google/inject/internal/InternalFactory<+TT;>;"
    .local p6, "factory":Lcom/google/inject/internal/ConstructorBindingImpl$Factory;, "Lcom/google/inject/internal/ConstructorBindingImpl$Factory<TT;>;"
    invoke-direct/range {p0 .. p5}, Lcom/google/inject/internal/BindingImpl;-><init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Key;Ljava/lang/Object;Lcom/google/inject/internal/InternalFactory;Lcom/google/inject/internal/Scoping;)V

    .line 50
    iput-object p6, p0, Lcom/google/inject/internal/ConstructorBindingImpl;->factory:Lcom/google/inject/internal/ConstructorBindingImpl$Factory;

    .line 51
    iput-object p7, p0, Lcom/google/inject/internal/ConstructorBindingImpl;->constructorInjectionPoint:Lcom/google/inject/spi/InjectionPoint;

    .line 52
    return-void
.end method

.method static create(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Key;Lcom/google/inject/spi/InjectionPoint;Ljava/lang/Object;Lcom/google/inject/internal/Scoping;Lcom/google/inject/internal/Errors;Z)Lcom/google/inject/internal/ConstructorBindingImpl;
    .locals 17
    .param p0, "injector"    # Lcom/google/inject/internal/InjectorImpl;
    .param p2, "constructorInjector"    # Lcom/google/inject/spi/InjectionPoint;
    .param p3, "source"    # Ljava/lang/Object;
    .param p4, "scoping"    # Lcom/google/inject/internal/Scoping;
    .param p5, "errors"    # Lcom/google/inject/internal/Errors;
    .param p6, "failIfNotLinked"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/internal/InjectorImpl;",
            "Lcom/google/inject/Key",
            "<TT;>;",
            "Lcom/google/inject/spi/InjectionPoint;",
            "Ljava/lang/Object;",
            "Lcom/google/inject/internal/Scoping;",
            "Lcom/google/inject/internal/Errors;",
            "Z)",
            "Lcom/google/inject/internal/ConstructorBindingImpl",
            "<TT;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/ErrorsException;
        }
    .end annotation

    .prologue
    .line 74
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<TT;>;"
    invoke-virtual/range {p5 .. p5}, Lcom/google/inject/internal/Errors;->size()I

    move-result v14

    .line 77
    .local v14, "numErrors":I
    if-nez p2, :cond_4

    invoke-virtual/range {p1 .. p1}, Lcom/google/inject/Key;->getTypeLiteral()Lcom/google/inject/TypeLiteral;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/inject/TypeLiteral;->getRawType()Ljava/lang/Class;

    move-result-object v15

    .line 82
    .local v15, "rawType":Ljava/lang/Class;, "Ljava/lang/Class<-TT;>;"
    :goto_0
    invoke-virtual {v15}, Ljava/lang/Class;->getModifiers()I

    move-result v4

    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 83
    move-object/from16 v0, p5

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lcom/google/inject/internal/Errors;->missingImplementation(Lcom/google/inject/Key;)Lcom/google/inject/internal/Errors;

    .line 87
    :cond_0
    invoke-static {v15}, Lcom/google/inject/internal/util/$Classes;->isInnerClass(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 88
    move-object/from16 v0, p5

    invoke-virtual {v0, v15}, Lcom/google/inject/internal/Errors;->cannotInjectInnerClass(Ljava/lang/Class;)Lcom/google/inject/internal/Errors;

    .line 91
    :cond_1
    move-object/from16 v0, p5

    invoke-virtual {v0, v14}, Lcom/google/inject/internal/Errors;->throwIfNewErrors(I)V

    .line 94
    if-nez p2, :cond_2

    .line 96
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lcom/google/inject/Key;->getTypeLiteral()Lcom/google/inject/TypeLiteral;

    move-result-object v4

    invoke-static {v4}, Lcom/google/inject/spi/InjectionPoint;->forConstructorOf(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/spi/InjectionPoint;
    :try_end_0
    .catch Lcom/google/inject/ConfigurationException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object p2

    .line 103
    :cond_2
    invoke-virtual/range {p4 .. p4}, Lcom/google/inject/internal/Scoping;->isExplicitlyScoped()Z

    move-result v4

    if-nez v4, :cond_3

    .line 104
    invoke-virtual/range {p2 .. p2}, Lcom/google/inject/spi/InjectionPoint;->getMember()Ljava/lang/reflect/Member;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/reflect/Member;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v12

    .line 105
    .local v12, "annotatedType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    move-object/from16 v0, p5

    invoke-static {v0, v12}, Lcom/google/inject/internal/Annotations;->findScopeAnnotation(Lcom/google/inject/internal/Errors;Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v16

    .line 106
    .local v16, "scopeAnnotation":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    if-eqz v16, :cond_3

    .line 107
    invoke-static/range {v16 .. v16}, Lcom/google/inject/internal/Scoping;->forAnnotation(Ljava/lang/Class;)Lcom/google/inject/internal/Scoping;

    move-result-object v4

    move-object/from16 v0, p5

    invoke-virtual {v0, v15}, Lcom/google/inject/internal/Errors;->withSource(Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v5

    move-object/from16 v0, p0

    invoke-static {v4, v0, v5}, Lcom/google/inject/internal/Scoping;->makeInjectable(Lcom/google/inject/internal/Scoping;Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/Scoping;

    move-result-object p4

    .line 112
    .end local v12    # "annotatedType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v16    # "scopeAnnotation":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    :cond_3
    move-object/from16 v0, p5

    invoke-virtual {v0, v14}, Lcom/google/inject/internal/Errors;->throwIfNewErrors(I)V

    .line 114
    new-instance v10, Lcom/google/inject/internal/ConstructorBindingImpl$Factory;

    move/from16 v0, p6

    move-object/from16 v1, p1

    invoke-direct {v10, v0, v1}, Lcom/google/inject/internal/ConstructorBindingImpl$Factory;-><init>(ZLcom/google/inject/Key;)V

    .line 115
    .local v10, "factoryFactory":Lcom/google/inject/internal/ConstructorBindingImpl$Factory;, "Lcom/google/inject/internal/ConstructorBindingImpl$Factory<TT;>;"
    move-object/from16 v0, p1

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    invoke-static {v0, v1, v10, v2, v3}, Lcom/google/inject/internal/Scoping;->scope(Lcom/google/inject/Key;Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/internal/InternalFactory;Ljava/lang/Object;Lcom/google/inject/internal/Scoping;)Lcom/google/inject/internal/InternalFactory;

    move-result-object v8

    .line 118
    .local v8, "scopedFactory":Lcom/google/inject/internal/InternalFactory;, "Lcom/google/inject/internal/InternalFactory<+TT;>;"
    new-instance v4, Lcom/google/inject/internal/ConstructorBindingImpl;

    move-object/from16 v5, p0

    move-object/from16 v6, p1

    move-object/from16 v7, p3

    move-object/from16 v9, p4

    move-object/from16 v11, p2

    invoke-direct/range {v4 .. v11}, Lcom/google/inject/internal/ConstructorBindingImpl;-><init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Key;Ljava/lang/Object;Lcom/google/inject/internal/InternalFactory;Lcom/google/inject/internal/Scoping;Lcom/google/inject/internal/ConstructorBindingImpl$Factory;Lcom/google/inject/spi/InjectionPoint;)V

    return-object v4

    .line 77
    .end local v8    # "scopedFactory":Lcom/google/inject/internal/InternalFactory;, "Lcom/google/inject/internal/InternalFactory<+TT;>;"
    .end local v10    # "factoryFactory":Lcom/google/inject/internal/ConstructorBindingImpl$Factory;, "Lcom/google/inject/internal/ConstructorBindingImpl$Factory<TT;>;"
    .end local v15    # "rawType":Ljava/lang/Class;, "Ljava/lang/Class<-TT;>;"
    :cond_4
    invoke-virtual/range {p2 .. p2}, Lcom/google/inject/spi/InjectionPoint;->getDeclaringType()Lcom/google/inject/TypeLiteral;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/inject/TypeLiteral;->getRawType()Ljava/lang/Class;

    move-result-object v15

    goto/16 :goto_0

    .line 97
    .restart local v15    # "rawType":Ljava/lang/Class;, "Ljava/lang/Class<-TT;>;"
    :catch_0
    move-exception v13

    .line 98
    .local v13, "e":Lcom/google/inject/ConfigurationException;
    invoke-virtual {v13}, Lcom/google/inject/ConfigurationException;->getErrorMessages()Ljava/util/Collection;

    move-result-object v4

    move-object/from16 v0, p5

    invoke-virtual {v0, v4}, Lcom/google/inject/internal/Errors;->merge(Ljava/util/Collection;)Lcom/google/inject/internal/Errors;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/inject/internal/Errors;->toException()Lcom/google/inject/internal/ErrorsException;

    move-result-object v4

    throw v4
.end method


# virtual methods
.method public acceptTargetVisitor(Lcom/google/inject/spi/BindingTargetVisitor;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/spi/BindingTargetVisitor",
            "<-TT;TV;>;)TV;"
        }
    .end annotation

    .prologue
    .line 162
    .local p0, "this":Lcom/google/inject/internal/ConstructorBindingImpl;, "Lcom/google/inject/internal/ConstructorBindingImpl<TT;>;"
    .local p1, "visitor":Lcom/google/inject/spi/BindingTargetVisitor;, "Lcom/google/inject/spi/BindingTargetVisitor<-TT;TV;>;"
    iget-object v0, p0, Lcom/google/inject/internal/ConstructorBindingImpl;->factory:Lcom/google/inject/internal/ConstructorBindingImpl$Factory;

    # getter for: Lcom/google/inject/internal/ConstructorBindingImpl$Factory;->constructorInjector:Lcom/google/inject/internal/ConstructorInjector;
    invoke-static {v0}, Lcom/google/inject/internal/ConstructorBindingImpl$Factory;->access$000(Lcom/google/inject/internal/ConstructorBindingImpl$Factory;)Lcom/google/inject/internal/ConstructorInjector;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "not initialized"

    invoke-static {v0, v1}, Lcom/google/inject/internal/util/$Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 163
    invoke-interface {p1, p0}, Lcom/google/inject/spi/BindingTargetVisitor;->visit(Lcom/google/inject/spi/ConstructorBinding;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 162
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public applyTo(Lcom/google/inject/Binder;)V
    .locals 5
    .param p1, "binder"    # Lcom/google/inject/Binder;

    .prologue
    .line 202
    .local p0, "this":Lcom/google/inject/internal/ConstructorBindingImpl;, "Lcom/google/inject/internal/ConstructorBindingImpl<TT;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/ConstructorBindingImpl;->getConstructor()Lcom/google/inject/spi/InjectionPoint;

    move-result-object v0

    .line 203
    .local v0, "constructor":Lcom/google/inject/spi/InjectionPoint;
    invoke-virtual {p0}, Lcom/google/inject/internal/ConstructorBindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/inject/internal/ConstructorBindingImpl;->getSource()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/google/inject/Binder;->withSource(Ljava/lang/Object;)Lcom/google/inject/Binder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/inject/internal/ConstructorBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v3

    invoke-interface {v1, v3}, Lcom/google/inject/Binder;->bind(Lcom/google/inject/Key;)Lcom/google/inject/binder/LinkedBindingBuilder;

    move-result-object v3

    invoke-virtual {p0}, Lcom/google/inject/internal/ConstructorBindingImpl;->getConstructor()Lcom/google/inject/spi/InjectionPoint;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/inject/spi/InjectionPoint;->getMember()Ljava/lang/reflect/Member;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Constructor;

    invoke-virtual {v0}, Lcom/google/inject/spi/InjectionPoint;->getDeclaringType()Lcom/google/inject/TypeLiteral;

    move-result-object v4

    invoke-interface {v3, v1, v4}, Lcom/google/inject/binder/LinkedBindingBuilder;->toConstructor(Ljava/lang/reflect/Constructor;Lcom/google/inject/TypeLiteral;)Lcom/google/inject/binder/ScopedBindingBuilder;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/google/inject/internal/Scoping;->applyTo(Lcom/google/inject/binder/ScopedBindingBuilder;)V

    .line 205
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    .local p0, "this":Lcom/google/inject/internal/ConstructorBindingImpl;, "Lcom/google/inject/internal/ConstructorBindingImpl<TT;>;"
    const/4 v1, 0x0

    .line 217
    instance-of v2, p1, Lcom/google/inject/internal/ConstructorBindingImpl;

    if-eqz v2, :cond_0

    move-object v0, p1

    .line 218
    check-cast v0, Lcom/google/inject/internal/ConstructorBindingImpl;

    .line 219
    .local v0, "o":Lcom/google/inject/internal/ConstructorBindingImpl;, "Lcom/google/inject/internal/ConstructorBindingImpl<*>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/ConstructorBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/inject/internal/ConstructorBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/inject/Key;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/google/inject/internal/ConstructorBindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/inject/internal/ConstructorBindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/inject/internal/Scoping;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/inject/internal/ConstructorBindingImpl;->constructorInjectionPoint:Lcom/google/inject/spi/InjectionPoint;

    iget-object v3, v0, Lcom/google/inject/internal/ConstructorBindingImpl;->constructorInjectionPoint:Lcom/google/inject/spi/InjectionPoint;

    invoke-static {v2, v3}, Lcom/google/inject/internal/util/$Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x1

    .line 223
    .end local v0    # "o":Lcom/google/inject/internal/ConstructorBindingImpl;, "Lcom/google/inject/internal/ConstructorBindingImpl<*>;"
    :cond_0
    return v1
.end method

.method public getConstructor()Lcom/google/inject/spi/InjectionPoint;
    .locals 2

    .prologue
    .line 167
    .local p0, "this":Lcom/google/inject/internal/ConstructorBindingImpl;, "Lcom/google/inject/internal/ConstructorBindingImpl<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/ConstructorBindingImpl;->factory:Lcom/google/inject/internal/ConstructorBindingImpl$Factory;

    # getter for: Lcom/google/inject/internal/ConstructorBindingImpl$Factory;->constructorInjector:Lcom/google/inject/internal/ConstructorInjector;
    invoke-static {v0}, Lcom/google/inject/internal/ConstructorBindingImpl$Factory;->access$000(Lcom/google/inject/internal/ConstructorBindingImpl$Factory;)Lcom/google/inject/internal/ConstructorInjector;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Binding is not ready"

    invoke-static {v0, v1}, Lcom/google/inject/internal/util/$Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 168
    iget-object v0, p0, Lcom/google/inject/internal/ConstructorBindingImpl;->factory:Lcom/google/inject/internal/ConstructorBindingImpl$Factory;

    # getter for: Lcom/google/inject/internal/ConstructorBindingImpl$Factory;->constructorInjector:Lcom/google/inject/internal/ConstructorInjector;
    invoke-static {v0}, Lcom/google/inject/internal/ConstructorBindingImpl$Factory;->access$000(Lcom/google/inject/internal/ConstructorBindingImpl$Factory;)Lcom/google/inject/internal/ConstructorInjector;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/inject/internal/ConstructorInjector;->getConstructionProxy()Lcom/google/inject/internal/ConstructionProxy;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/inject/internal/ConstructionProxy;->getInjectionPoint()Lcom/google/inject/spi/InjectionPoint;

    move-result-object v0

    return-object v0

    .line 167
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getDependencies()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/google/inject/spi/Dependency",
            "<*>;>;"
        }
    .end annotation

    .prologue
    .line 184
    .local p0, "this":Lcom/google/inject/internal/ConstructorBindingImpl;, "Lcom/google/inject/internal/ConstructorBindingImpl<TT;>;"
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableSet$Builder;

    invoke-direct {v0}, Lcom/google/inject/internal/util/$ImmutableSet$Builder;-><init>()V

    invoke-virtual {p0}, Lcom/google/inject/internal/ConstructorBindingImpl;->getConstructor()Lcom/google/inject/spi/InjectionPoint;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/inject/internal/util/$ImmutableSet$Builder;->add(Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableSet$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/inject/internal/ConstructorBindingImpl;->getInjectableMembers()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/inject/internal/util/$ImmutableSet$Builder;->addAll(Ljava/lang/Iterable;)Lcom/google/inject/internal/util/$ImmutableSet$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/inject/internal/util/$ImmutableSet$Builder;->build()Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    invoke-static {v0}, Lcom/google/inject/spi/Dependency;->forInjectionPoints(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getInjectableMembers()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/google/inject/spi/InjectionPoint;",
            ">;"
        }
    .end annotation

    .prologue
    .line 172
    .local p0, "this":Lcom/google/inject/internal/ConstructorBindingImpl;, "Lcom/google/inject/internal/ConstructorBindingImpl<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/ConstructorBindingImpl;->factory:Lcom/google/inject/internal/ConstructorBindingImpl$Factory;

    # getter for: Lcom/google/inject/internal/ConstructorBindingImpl$Factory;->constructorInjector:Lcom/google/inject/internal/ConstructorInjector;
    invoke-static {v0}, Lcom/google/inject/internal/ConstructorBindingImpl$Factory;->access$000(Lcom/google/inject/internal/ConstructorBindingImpl$Factory;)Lcom/google/inject/internal/ConstructorInjector;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Binding is not ready"

    invoke-static {v0, v1}, Lcom/google/inject/internal/util/$Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 173
    iget-object v0, p0, Lcom/google/inject/internal/ConstructorBindingImpl;->factory:Lcom/google/inject/internal/ConstructorBindingImpl$Factory;

    # getter for: Lcom/google/inject/internal/ConstructorBindingImpl$Factory;->constructorInjector:Lcom/google/inject/internal/ConstructorInjector;
    invoke-static {v0}, Lcom/google/inject/internal/ConstructorBindingImpl$Factory;->access$000(Lcom/google/inject/internal/ConstructorBindingImpl$Factory;)Lcom/google/inject/internal/ConstructorInjector;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/inject/internal/ConstructorInjector;->getInjectableMembers()Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    return-object v0

    .line 172
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method getInternalConstructor()Lcom/google/inject/spi/InjectionPoint;
    .locals 1

    .prologue
    .line 136
    .local p0, "this":Lcom/google/inject/internal/ConstructorBindingImpl;, "Lcom/google/inject/internal/ConstructorBindingImpl<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/ConstructorBindingImpl;->factory:Lcom/google/inject/internal/ConstructorBindingImpl$Factory;

    # getter for: Lcom/google/inject/internal/ConstructorBindingImpl$Factory;->constructorInjector:Lcom/google/inject/internal/ConstructorInjector;
    invoke-static {v0}, Lcom/google/inject/internal/ConstructorBindingImpl$Factory;->access$000(Lcom/google/inject/internal/ConstructorBindingImpl$Factory;)Lcom/google/inject/internal/ConstructorInjector;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 137
    iget-object v0, p0, Lcom/google/inject/internal/ConstructorBindingImpl;->factory:Lcom/google/inject/internal/ConstructorBindingImpl$Factory;

    # getter for: Lcom/google/inject/internal/ConstructorBindingImpl$Factory;->constructorInjector:Lcom/google/inject/internal/ConstructorInjector;
    invoke-static {v0}, Lcom/google/inject/internal/ConstructorBindingImpl$Factory;->access$000(Lcom/google/inject/internal/ConstructorBindingImpl$Factory;)Lcom/google/inject/internal/ConstructorInjector;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/inject/internal/ConstructorInjector;->getConstructionProxy()Lcom/google/inject/internal/ConstructionProxy;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/inject/internal/ConstructionProxy;->getInjectionPoint()Lcom/google/inject/spi/InjectionPoint;

    move-result-object v0

    .line 139
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/inject/internal/ConstructorBindingImpl;->constructorInjectionPoint:Lcom/google/inject/spi/InjectionPoint;

    goto :goto_0
.end method

.method getInternalDependencies()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/google/inject/spi/Dependency",
            "<*>;>;"
        }
    .end annotation

    .prologue
    .line 145
    .local p0, "this":Lcom/google/inject/internal/ConstructorBindingImpl;, "Lcom/google/inject/internal/ConstructorBindingImpl<TT;>;"
    invoke-static {}, Lcom/google/inject/internal/util/$ImmutableSet;->builder()Lcom/google/inject/internal/util/$ImmutableSet$Builder;

    move-result-object v0

    .line 146
    .local v0, "builder":Lcom/google/inject/internal/util/$ImmutableSet$Builder;, "Lcom/google/inject/internal/util/$ImmutableSet$Builder<Lcom/google/inject/spi/InjectionPoint;>;"
    iget-object v1, p0, Lcom/google/inject/internal/ConstructorBindingImpl;->factory:Lcom/google/inject/internal/ConstructorBindingImpl$Factory;

    # getter for: Lcom/google/inject/internal/ConstructorBindingImpl$Factory;->constructorInjector:Lcom/google/inject/internal/ConstructorInjector;
    invoke-static {v1}, Lcom/google/inject/internal/ConstructorBindingImpl$Factory;->access$000(Lcom/google/inject/internal/ConstructorBindingImpl$Factory;)Lcom/google/inject/internal/ConstructorInjector;

    move-result-object v1

    if-nez v1, :cond_0

    .line 147
    iget-object v1, p0, Lcom/google/inject/internal/ConstructorBindingImpl;->constructorInjectionPoint:Lcom/google/inject/spi/InjectionPoint;

    invoke-virtual {v0, v1}, Lcom/google/inject/internal/util/$ImmutableSet$Builder;->add(Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableSet$Builder;

    .line 151
    :try_start_0
    iget-object v1, p0, Lcom/google/inject/internal/ConstructorBindingImpl;->constructorInjectionPoint:Lcom/google/inject/spi/InjectionPoint;

    invoke-virtual {v1}, Lcom/google/inject/spi/InjectionPoint;->getDeclaringType()Lcom/google/inject/TypeLiteral;

    move-result-object v1

    invoke-static {v1}, Lcom/google/inject/spi/InjectionPoint;->forInstanceMethodsAndFields(Lcom/google/inject/TypeLiteral;)Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/inject/internal/util/$ImmutableSet$Builder;->addAll(Ljava/lang/Iterable;)Lcom/google/inject/internal/util/$ImmutableSet$Builder;
    :try_end_0
    .catch Lcom/google/inject/ConfigurationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 158
    :goto_0
    invoke-virtual {v0}, Lcom/google/inject/internal/util/$ImmutableSet$Builder;->build()Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v1

    invoke-static {v1}, Lcom/google/inject/spi/Dependency;->forInjectionPoints(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    return-object v1

    .line 154
    :cond_0
    invoke-virtual {p0}, Lcom/google/inject/internal/ConstructorBindingImpl;->getConstructor()Lcom/google/inject/spi/InjectionPoint;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/inject/internal/util/$ImmutableSet$Builder;->add(Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableSet$Builder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/inject/internal/ConstructorBindingImpl;->getInjectableMembers()Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/inject/internal/util/$ImmutableSet$Builder;->addAll(Ljava/lang/Iterable;)Lcom/google/inject/internal/util/$ImmutableSet$Builder;

    goto :goto_0

    .line 152
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 229
    .local p0, "this":Lcom/google/inject/internal/ConstructorBindingImpl;, "Lcom/google/inject/internal/ConstructorBindingImpl<TT;>;"
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/inject/internal/ConstructorBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/google/inject/internal/ConstructorBindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/inject/internal/ConstructorBindingImpl;->constructorInjectionPoint:Lcom/google/inject/spi/InjectionPoint;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/inject/internal/util/$Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public initialize(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/internal/Errors;)V
    .locals 3
    .param p1, "injector"    # Lcom/google/inject/internal/InjectorImpl;
    .param p2, "errors"    # Lcom/google/inject/internal/Errors;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/ErrorsException;
        }
    .end annotation

    .prologue
    .line 124
    .local p0, "this":Lcom/google/inject/internal/ConstructorBindingImpl;, "Lcom/google/inject/internal/ConstructorBindingImpl<TT;>;"
    iget-object v1, p0, Lcom/google/inject/internal/ConstructorBindingImpl;->factory:Lcom/google/inject/internal/ConstructorBindingImpl$Factory;

    iget-object v0, p1, Lcom/google/inject/internal/InjectorImpl;->options:Lcom/google/inject/internal/InjectorImpl$InjectorOptions;

    iget-boolean v0, v0, Lcom/google/inject/internal/InjectorImpl$InjectorOptions;->disableCircularProxies:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    # setter for: Lcom/google/inject/internal/ConstructorBindingImpl$Factory;->allowCircularProxy:Z
    invoke-static {v1, v0}, Lcom/google/inject/internal/ConstructorBindingImpl$Factory;->access$102(Lcom/google/inject/internal/ConstructorBindingImpl$Factory;Z)Z

    .line 125
    iget-object v0, p0, Lcom/google/inject/internal/ConstructorBindingImpl;->factory:Lcom/google/inject/internal/ConstructorBindingImpl$Factory;

    iget-object v1, p1, Lcom/google/inject/internal/InjectorImpl;->constructors:Lcom/google/inject/internal/ConstructorInjectorStore;

    iget-object v2, p0, Lcom/google/inject/internal/ConstructorBindingImpl;->constructorInjectionPoint:Lcom/google/inject/spi/InjectionPoint;

    invoke-virtual {v1, v2, p2}, Lcom/google/inject/internal/ConstructorInjectorStore;->get(Lcom/google/inject/spi/InjectionPoint;Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/ConstructorInjector;

    move-result-object v1

    # setter for: Lcom/google/inject/internal/ConstructorBindingImpl$Factory;->constructorInjector:Lcom/google/inject/internal/ConstructorInjector;
    invoke-static {v0, v1}, Lcom/google/inject/internal/ConstructorBindingImpl$Factory;->access$002(Lcom/google/inject/internal/ConstructorBindingImpl$Factory;Lcom/google/inject/internal/ConstructorInjector;)Lcom/google/inject/internal/ConstructorInjector;

    .line 127
    return-void

    .line 124
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method isInitialized()Z
    .locals 1

    .prologue
    .line 131
    .local p0, "this":Lcom/google/inject/internal/ConstructorBindingImpl;, "Lcom/google/inject/internal/ConstructorBindingImpl<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/ConstructorBindingImpl;->factory:Lcom/google/inject/internal/ConstructorBindingImpl$Factory;

    # getter for: Lcom/google/inject/internal/ConstructorBindingImpl$Factory;->constructorInjector:Lcom/google/inject/internal/ConstructorInjector;
    invoke-static {v0}, Lcom/google/inject/internal/ConstructorBindingImpl$Factory;->access$000(Lcom/google/inject/internal/ConstructorBindingImpl$Factory;)Lcom/google/inject/internal/ConstructorInjector;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 208
    .local p0, "this":Lcom/google/inject/internal/ConstructorBindingImpl;, "Lcom/google/inject/internal/ConstructorBindingImpl<TT;>;"
    new-instance v0, Lcom/google/inject/internal/util/$ToStringBuilder;

    const-class v1, Lcom/google/inject/spi/ConstructorBinding;

    invoke-direct {v0, v1}, Lcom/google/inject/internal/util/$ToStringBuilder;-><init>(Ljava/lang/Class;)V

    const-string v1, "key"

    invoke-virtual {p0}, Lcom/google/inject/internal/ConstructorBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ToStringBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ToStringBuilder;

    move-result-object v0

    const-string v1, "source"

    invoke-virtual {p0}, Lcom/google/inject/internal/ConstructorBindingImpl;->getSource()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ToStringBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ToStringBuilder;

    move-result-object v0

    const-string v1, "scope"

    invoke-virtual {p0}, Lcom/google/inject/internal/ConstructorBindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ToStringBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ToStringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/inject/internal/util/$ToStringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected withKey(Lcom/google/inject/Key;)Lcom/google/inject/internal/BindingImpl;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Key",
            "<TT;>;)",
            "Lcom/google/inject/internal/BindingImpl",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 196
    .local p0, "this":Lcom/google/inject/internal/ConstructorBindingImpl;, "Lcom/google/inject/internal/ConstructorBindingImpl<TT;>;"
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<TT;>;"
    new-instance v0, Lcom/google/inject/internal/ConstructorBindingImpl;

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/inject/internal/ConstructorBindingImpl;->getSource()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lcom/google/inject/internal/ConstructorBindingImpl;->factory:Lcom/google/inject/internal/ConstructorBindingImpl$Factory;

    invoke-virtual {p0}, Lcom/google/inject/internal/ConstructorBindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v5

    iget-object v6, p0, Lcom/google/inject/internal/ConstructorBindingImpl;->factory:Lcom/google/inject/internal/ConstructorBindingImpl$Factory;

    iget-object v7, p0, Lcom/google/inject/internal/ConstructorBindingImpl;->constructorInjectionPoint:Lcom/google/inject/spi/InjectionPoint;

    move-object v2, p1

    invoke-direct/range {v0 .. v7}, Lcom/google/inject/internal/ConstructorBindingImpl;-><init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Key;Ljava/lang/Object;Lcom/google/inject/internal/InternalFactory;Lcom/google/inject/internal/Scoping;Lcom/google/inject/internal/ConstructorBindingImpl$Factory;Lcom/google/inject/spi/InjectionPoint;)V

    return-object v0
.end method

.method protected withScoping(Lcom/google/inject/internal/Scoping;)Lcom/google/inject/internal/BindingImpl;
    .locals 8
    .param p1, "scoping"    # Lcom/google/inject/internal/Scoping;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/Scoping;",
            ")",
            "Lcom/google/inject/internal/BindingImpl",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 191
    .local p0, "this":Lcom/google/inject/internal/ConstructorBindingImpl;, "Lcom/google/inject/internal/ConstructorBindingImpl<TT;>;"
    new-instance v0, Lcom/google/inject/internal/ConstructorBindingImpl;

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/inject/internal/ConstructorBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/inject/internal/ConstructorBindingImpl;->getSource()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lcom/google/inject/internal/ConstructorBindingImpl;->factory:Lcom/google/inject/internal/ConstructorBindingImpl$Factory;

    iget-object v6, p0, Lcom/google/inject/internal/ConstructorBindingImpl;->factory:Lcom/google/inject/internal/ConstructorBindingImpl$Factory;

    iget-object v7, p0, Lcom/google/inject/internal/ConstructorBindingImpl;->constructorInjectionPoint:Lcom/google/inject/spi/InjectionPoint;

    move-object v5, p1

    invoke-direct/range {v0 .. v7}, Lcom/google/inject/internal/ConstructorBindingImpl;-><init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Key;Ljava/lang/Object;Lcom/google/inject/internal/InternalFactory;Lcom/google/inject/internal/Scoping;Lcom/google/inject/internal/ConstructorBindingImpl$Factory;Lcom/google/inject/spi/InjectionPoint;)V

    return-object v0
.end method
