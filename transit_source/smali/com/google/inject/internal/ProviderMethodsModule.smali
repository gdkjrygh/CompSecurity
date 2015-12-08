.class public final Lcom/google/inject/internal/ProviderMethodsModule;
.super Ljava/lang/Object;
.source "ProviderMethodsModule.java"

# interfaces
.implements Lcom/google/inject/Module;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/inject/internal/ProviderMethodsModule$LogProvider;
    }
.end annotation


# instance fields
.field private final delegate:Ljava/lang/Object;

.field private final typeLiteral:Lcom/google/inject/TypeLiteral;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/TypeLiteral",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/lang/Object;)V
    .locals 1
    .param p1, "delegate"    # Ljava/lang/Object;

    .prologue
    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    const-string v0, "delegate"

    invoke-static {p1, v0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/ProviderMethodsModule;->delegate:Ljava/lang/Object;

    .line 50
    iget-object v0, p0, Lcom/google/inject/internal/ProviderMethodsModule;->delegate:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/google/inject/TypeLiteral;->get(Ljava/lang/Class;)Lcom/google/inject/TypeLiteral;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/ProviderMethodsModule;->typeLiteral:Lcom/google/inject/TypeLiteral;

    .line 51
    return-void
.end method

.method public static forModule(Lcom/google/inject/Module;)Lcom/google/inject/Module;
    .locals 1
    .param p0, "module"    # Lcom/google/inject/Module;

    .prologue
    .line 57
    invoke-static {p0}, Lcom/google/inject/internal/ProviderMethodsModule;->forObject(Ljava/lang/Object;)Lcom/google/inject/Module;

    move-result-object v0

    return-object v0
.end method

.method public static forObject(Ljava/lang/Object;)Lcom/google/inject/Module;
    .locals 1
    .param p0, "object"    # Ljava/lang/Object;

    .prologue
    .line 66
    instance-of v0, p0, Lcom/google/inject/internal/ProviderMethodsModule;

    if-eqz v0, :cond_0

    .line 67
    sget-object v0, Lcom/google/inject/util/Modules;->EMPTY_MODULE:Lcom/google/inject/Module;

    .line 70
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/inject/internal/ProviderMethodsModule;

    invoke-direct {v0, p0}, Lcom/google/inject/internal/ProviderMethodsModule;-><init>(Ljava/lang/Object;)V

    goto :goto_0
.end method


# virtual methods
.method public declared-synchronized configure(Lcom/google/inject/Binder;)V
    .locals 3
    .param p1, "binder"    # Lcom/google/inject/Binder;

    .prologue
    .line 73
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/ProviderMethodsModule;->getProviderMethods(Lcom/google/inject/Binder;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/inject/internal/ProviderMethod;

    .line 74
    .local v1, "providerMethod":Lcom/google/inject/internal/ProviderMethod;, "Lcom/google/inject/internal/ProviderMethod<*>;"
    invoke-virtual {v1, p1}, Lcom/google/inject/internal/ProviderMethod;->configure(Lcom/google/inject/Binder;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 73
    .end local v0    # "i$":Ljava/util/Iterator;
    .end local v1    # "providerMethod":Lcom/google/inject/internal/ProviderMethod;, "Lcom/google/inject/internal/ProviderMethod<*>;"
    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2

    .line 76
    .restart local v0    # "i$":Ljava/util/Iterator;
    :cond_0
    monitor-exit p0

    return-void
.end method

.method createProviderMethod(Lcom/google/inject/Binder;Ljava/lang/reflect/Method;)Lcom/google/inject/internal/ProviderMethod;
    .locals 20
    .param p1, "binder"    # Lcom/google/inject/Binder;
    .param p2, "method"    # Ljava/lang/reflect/Method;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/Binder;",
            "Ljava/lang/reflect/Method;",
            ")",
            "Lcom/google/inject/internal/ProviderMethod",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 91
    invoke-interface/range {p1 .. p2}, Lcom/google/inject/Binder;->withSource(Ljava/lang/Object;)Lcom/google/inject/Binder;

    move-result-object p1

    .line 92
    new-instance v11, Lcom/google/inject/internal/Errors;

    move-object/from16 v0, p2

    invoke-direct {v11, v0}, Lcom/google/inject/internal/Errors;-><init>(Ljava/lang/Object;)V

    .line 95
    .local v11, "errors":Lcom/google/inject/internal/Errors;
    invoke-static {}, Lcom/google/inject/internal/util/$Lists;->newArrayList()Ljava/util/ArrayList;

    move-result-object v10

    .line 96
    .local v10, "dependencies":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/spi/Dependency<*>;>;"
    invoke-static {}, Lcom/google/inject/internal/util/$Lists;->newArrayList()Ljava/util/ArrayList;

    move-result-object v8

    .line 97
    .local v8, "parameterProviders":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/Provider<*>;>;"
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/inject/internal/ProviderMethodsModule;->typeLiteral:Lcom/google/inject/TypeLiteral;

    move-object/from16 v0, p2

    invoke-virtual {v3, v0}, Lcom/google/inject/TypeLiteral;->getParameterTypes(Ljava/lang/reflect/Member;)Ljava/util/List;

    move-result-object v18

    .line 98
    .local v18, "parameterTypes":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/TypeLiteral<*>;>;"
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v17

    .line 99
    .local v17, "parameterAnnotations":[[Ljava/lang/annotation/Annotation;
    const/4 v12, 0x0

    .local v12, "i":I
    :goto_0
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->size()I

    move-result v3

    if-ge v12, v3, :cond_1

    .line 100
    move-object/from16 v0, v18

    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/inject/TypeLiteral;

    aget-object v5, v17, v12

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-virtual {v0, v11, v3, v1, v5}, Lcom/google/inject/internal/ProviderMethodsModule;->getKey(Lcom/google/inject/internal/Errors;Lcom/google/inject/TypeLiteral;Ljava/lang/reflect/Member;[Ljava/lang/annotation/Annotation;)Lcom/google/inject/Key;

    move-result-object v14

    .line 101
    .local v14, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<*>;"
    const-class v3, Ljava/util/logging/Logger;

    invoke-static {v3}, Lcom/google/inject/Key;->get(Ljava/lang/Class;)Lcom/google/inject/Key;

    move-result-object v3

    invoke-virtual {v14, v3}, Lcom/google/inject/Key;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 105
    const-class v3, Ljava/util/logging/Logger;

    invoke-static {}, Lcom/google/inject/internal/UniqueAnnotations;->create()Ljava/lang/annotation/Annotation;

    move-result-object v5

    invoke-static {v3, v5}, Lcom/google/inject/Key;->get(Ljava/lang/Class;Ljava/lang/annotation/Annotation;)Lcom/google/inject/Key;

    move-result-object v15

    .line 106
    .local v15, "loggerKey":Lcom/google/inject/Key;, "Lcom/google/inject/Key<Ljava/util/logging/Logger;>;"
    move-object/from16 v0, p1

    invoke-interface {v0, v15}, Lcom/google/inject/Binder;->bind(Lcom/google/inject/Key;)Lcom/google/inject/binder/LinkedBindingBuilder;

    move-result-object v3

    new-instance v5, Lcom/google/inject/internal/ProviderMethodsModule$LogProvider;

    move-object/from16 v0, p2

    invoke-direct {v5, v0}, Lcom/google/inject/internal/ProviderMethodsModule$LogProvider;-><init>(Ljava/lang/reflect/Method;)V

    invoke-interface {v3, v5}, Lcom/google/inject/binder/LinkedBindingBuilder;->toProvider(Lcom/google/inject/Provider;)Lcom/google/inject/binder/ScopedBindingBuilder;

    .line 107
    move-object v14, v15

    .line 109
    .end local v15    # "loggerKey":Lcom/google/inject/Key;, "Lcom/google/inject/Key<Ljava/util/logging/Logger;>;"
    :cond_0
    invoke-static {v14}, Lcom/google/inject/spi/Dependency;->get(Lcom/google/inject/Key;)Lcom/google/inject/spi/Dependency;

    move-result-object v3

    invoke-interface {v10, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 110
    move-object/from16 v0, p1

    invoke-interface {v0, v14}, Lcom/google/inject/Binder;->getProvider(Lcom/google/inject/Key;)Lcom/google/inject/Provider;

    move-result-object v3

    invoke-interface {v8, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    .line 114
    .end local v14    # "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<*>;"
    :cond_1
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/inject/internal/ProviderMethodsModule;->typeLiteral:Lcom/google/inject/TypeLiteral;

    move-object/from16 v0, p2

    invoke-virtual {v3, v0}, Lcom/google/inject/TypeLiteral;->getReturnType(Ljava/lang/reflect/Method;)Lcom/google/inject/TypeLiteral;

    move-result-object v19

    .line 116
    .local v19, "returnType":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<TT;>;"
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v3

    move-object/from16 v0, p0

    move-object/from16 v1, v19

    move-object/from16 v2, p2

    invoke-virtual {v0, v11, v1, v2, v3}, Lcom/google/inject/internal/ProviderMethodsModule;->getKey(Lcom/google/inject/internal/Errors;Lcom/google/inject/TypeLiteral;Ljava/lang/reflect/Member;[Ljava/lang/annotation/Annotation;)Lcom/google/inject/Key;

    move-result-object v4

    .line 117
    .local v4, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<TT;>;"
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v3

    invoke-static {v11, v3}, Lcom/google/inject/internal/Annotations;->findScopeAnnotation(Lcom/google/inject/internal/Errors;[Ljava/lang/annotation/Annotation;)Ljava/lang/Class;

    move-result-object v9

    .line 120
    .local v9, "scopeAnnotation":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    invoke-virtual {v11}, Lcom/google/inject/internal/Errors;->getMessages()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    .local v13, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lcom/google/inject/spi/Message;

    .line 121
    .local v16, "message":Lcom/google/inject/spi/Message;
    move-object/from16 v0, p1

    move-object/from16 v1, v16

    invoke-interface {v0, v1}, Lcom/google/inject/Binder;->addError(Lcom/google/inject/spi/Message;)V

    goto :goto_1

    .line 124
    .end local v16    # "message":Lcom/google/inject/spi/Message;
    :cond_2
    new-instance v3, Lcom/google/inject/internal/ProviderMethod;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/inject/internal/ProviderMethodsModule;->delegate:Ljava/lang/Object;

    invoke-static {v10}, Lcom/google/inject/internal/util/$ImmutableSet;->copyOf(Ljava/lang/Iterable;)Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v7

    move-object/from16 v5, p2

    invoke-direct/range {v3 .. v9}, Lcom/google/inject/internal/ProviderMethod;-><init>(Lcom/google/inject/Key;Ljava/lang/reflect/Method;Ljava/lang/Object;Lcom/google/inject/internal/util/$ImmutableSet;Ljava/util/List;Ljava/lang/Class;)V

    return-object v3
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    .line 134
    instance-of v0, p1, Lcom/google/inject/internal/ProviderMethodsModule;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/inject/internal/ProviderMethodsModule;

    .end local p1    # "o":Ljava/lang/Object;
    iget-object v0, p1, Lcom/google/inject/internal/ProviderMethodsModule;->delegate:Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/inject/internal/ProviderMethodsModule;->delegate:Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method getKey(Lcom/google/inject/internal/Errors;Lcom/google/inject/TypeLiteral;Ljava/lang/reflect/Member;[Ljava/lang/annotation/Annotation;)Lcom/google/inject/Key;
    .locals 2
    .param p1, "errors"    # Lcom/google/inject/internal/Errors;
    .param p3, "member"    # Ljava/lang/reflect/Member;
    .param p4, "annotations"    # [Ljava/lang/annotation/Annotation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/internal/Errors;",
            "Lcom/google/inject/TypeLiteral",
            "<TT;>;",
            "Ljava/lang/reflect/Member;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            ")",
            "Lcom/google/inject/Key",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 129
    .local p2, "type":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<TT;>;"
    invoke-static {p1, p3, p4}, Lcom/google/inject/internal/Annotations;->findBindingAnnotation(Lcom/google/inject/internal/Errors;Ljava/lang/reflect/Member;[Ljava/lang/annotation/Annotation;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    .line 130
    .local v0, "bindingAnnotation":Ljava/lang/annotation/Annotation;
    if-nez v0, :cond_0

    invoke-static {p2}, Lcom/google/inject/Key;->get(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/Key;

    move-result-object v1

    :goto_0
    return-object v1

    :cond_0
    invoke-static {p2, v0}, Lcom/google/inject/Key;->get(Lcom/google/inject/TypeLiteral;Ljava/lang/annotation/Annotation;)Lcom/google/inject/Key;

    move-result-object v1

    goto :goto_0
.end method

.method public getProviderMethods(Lcom/google/inject/Binder;)Ljava/util/List;
    .locals 7
    .param p1, "binder"    # Lcom/google/inject/Binder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Binder;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/internal/ProviderMethod",
            "<*>;>;"
        }
    .end annotation

    .prologue
    .line 79
    invoke-static {}, Lcom/google/inject/internal/util/$Lists;->newArrayList()Ljava/util/ArrayList;

    move-result-object v5

    .line 80
    .local v5, "result":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/internal/ProviderMethod<*>;>;"
    iget-object v6, p0, Lcom/google/inject/internal/ProviderMethodsModule;->delegate:Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .local v1, "c":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :goto_0
    const-class v6, Ljava/lang/Object;

    if-eq v1, v6, :cond_2

    .line 81
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    .local v0, "arr$":[Ljava/lang/reflect/Method;
    array-length v3, v0

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_1
    if-ge v2, v3, :cond_1

    aget-object v4, v0, v2

    .line 82
    .local v4, "method":Ljava/lang/reflect/Method;
    const-class v6, Lcom/google/inject/Provides;

    invoke-virtual {v4, v6}, Ljava/lang/reflect/Method;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 83
    invoke-virtual {p0, p1, v4}, Lcom/google/inject/internal/ProviderMethodsModule;->createProviderMethod(Lcom/google/inject/Binder;Ljava/lang/reflect/Method;)Lcom/google/inject/internal/ProviderMethod;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 81
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 80
    .end local v4    # "method":Ljava/lang/reflect/Method;
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    .line 87
    .end local v0    # "arr$":[Ljava/lang/reflect/Method;
    .end local v2    # "i$":I
    .end local v3    # "len$":I
    :cond_2
    return-object v5
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Lcom/google/inject/internal/ProviderMethodsModule;->delegate:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
