.class public Lcom/google/inject/internal/ProviderMethod;
.super Ljava/lang/Object;
.source "ProviderMethod.java"

# interfaces
.implements Lcom/google/inject/spi/ProviderWithDependencies;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/inject/spi/ProviderWithDependencies",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final dependencies:Lcom/google/inject/internal/util/$ImmutableSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$ImmutableSet",
            "<",
            "Lcom/google/inject/spi/Dependency",
            "<*>;>;"
        }
    .end annotation
.end field

.field private final exposed:Z

.field private final instance:Ljava/lang/Object;

.field private final key:Lcom/google/inject/Key;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/Key",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final method:Ljava/lang/reflect/Method;

.field private final parameterProviders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/Provider",
            "<*>;>;"
        }
    .end annotation
.end field

.field private final scopeAnnotation:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/inject/Key;Ljava/lang/reflect/Method;Ljava/lang/Object;Lcom/google/inject/internal/util/$ImmutableSet;Ljava/util/List;Ljava/lang/Class;)V
    .locals 1
    .param p2, "method"    # Ljava/lang/reflect/Method;
    .param p3, "instance"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Key",
            "<TT;>;",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/Object;",
            "Lcom/google/inject/internal/util/$ImmutableSet",
            "<",
            "Lcom/google/inject/spi/Dependency",
            "<*>;>;",
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/Provider",
            "<*>;>;",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 54
    .local p0, "this":Lcom/google/inject/internal/ProviderMethod;, "Lcom/google/inject/internal/ProviderMethod<TT;>;"
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<TT;>;"
    .local p4, "dependencies":Lcom/google/inject/internal/util/$ImmutableSet;, "Lcom/google/inject/internal/util/$ImmutableSet<Lcom/google/inject/spi/Dependency<*>;>;"
    .local p5, "parameterProviders":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/Provider<*>;>;"
    .local p6, "scopeAnnotation":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Lcom/google/inject/internal/ProviderMethod;->key:Lcom/google/inject/Key;

    .line 56
    iput-object p6, p0, Lcom/google/inject/internal/ProviderMethod;->scopeAnnotation:Ljava/lang/Class;

    .line 57
    iput-object p3, p0, Lcom/google/inject/internal/ProviderMethod;->instance:Ljava/lang/Object;

    .line 58
    iput-object p4, p0, Lcom/google/inject/internal/ProviderMethod;->dependencies:Lcom/google/inject/internal/util/$ImmutableSet;

    .line 59
    iput-object p2, p0, Lcom/google/inject/internal/ProviderMethod;->method:Ljava/lang/reflect/Method;

    .line 60
    iput-object p5, p0, Lcom/google/inject/internal/ProviderMethod;->parameterProviders:Ljava/util/List;

    .line 61
    const-class v0, Lcom/google/inject/Exposed;

    invoke-virtual {p2, v0}, Ljava/lang/reflect/Method;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/inject/internal/ProviderMethod;->exposed:Z

    .line 63
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 64
    return-void
.end method


# virtual methods
.method public configure(Lcom/google/inject/Binder;)V
    .locals 2
    .param p1, "binder"    # Lcom/google/inject/Binder;

    .prologue
    .line 80
    .local p0, "this":Lcom/google/inject/internal/ProviderMethod;, "Lcom/google/inject/internal/ProviderMethod<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/ProviderMethod;->method:Ljava/lang/reflect/Method;

    invoke-interface {p1, v0}, Lcom/google/inject/Binder;->withSource(Ljava/lang/Object;)Lcom/google/inject/Binder;

    move-result-object p1

    .line 82
    iget-object v0, p0, Lcom/google/inject/internal/ProviderMethod;->scopeAnnotation:Ljava/lang/Class;

    if-eqz v0, :cond_1

    .line 83
    iget-object v0, p0, Lcom/google/inject/internal/ProviderMethod;->key:Lcom/google/inject/Key;

    invoke-interface {p1, v0}, Lcom/google/inject/Binder;->bind(Lcom/google/inject/Key;)Lcom/google/inject/binder/LinkedBindingBuilder;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/inject/binder/LinkedBindingBuilder;->toProvider(Lcom/google/inject/Provider;)Lcom/google/inject/binder/ScopedBindingBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/inject/internal/ProviderMethod;->scopeAnnotation:Ljava/lang/Class;

    invoke-interface {v0, v1}, Lcom/google/inject/binder/ScopedBindingBuilder;->in(Ljava/lang/Class;)V

    .line 88
    :goto_0
    iget-boolean v0, p0, Lcom/google/inject/internal/ProviderMethod;->exposed:Z

    if-eqz v0, :cond_0

    .line 91
    check-cast p1, Lcom/google/inject/PrivateBinder;

    .end local p1    # "binder":Lcom/google/inject/Binder;
    iget-object v0, p0, Lcom/google/inject/internal/ProviderMethod;->key:Lcom/google/inject/Key;

    invoke-interface {p1, v0}, Lcom/google/inject/PrivateBinder;->expose(Lcom/google/inject/Key;)V

    .line 93
    :cond_0
    return-void

    .line 85
    .restart local p1    # "binder":Lcom/google/inject/Binder;
    :cond_1
    iget-object v0, p0, Lcom/google/inject/internal/ProviderMethod;->key:Lcom/google/inject/Key;

    invoke-interface {p1, v0}, Lcom/google/inject/Binder;->bind(Lcom/google/inject/Key;)Lcom/google/inject/binder/LinkedBindingBuilder;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/inject/binder/LinkedBindingBuilder;->toProvider(Lcom/google/inject/Provider;)Lcom/google/inject/binder/ScopedBindingBuilder;

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    .local p0, "this":Lcom/google/inject/internal/ProviderMethod;, "Lcom/google/inject/internal/ProviderMethod<TT;>;"
    const/4 v1, 0x0

    .line 123
    instance-of v2, p1, Lcom/google/inject/internal/ProviderMethod;

    if-eqz v2, :cond_0

    move-object v0, p1

    .line 124
    check-cast v0, Lcom/google/inject/internal/ProviderMethod;

    .line 125
    .local v0, "o":Lcom/google/inject/internal/ProviderMethod;
    iget-object v2, p0, Lcom/google/inject/internal/ProviderMethod;->method:Ljava/lang/reflect/Method;

    iget-object v3, v0, Lcom/google/inject/internal/ProviderMethod;->method:Ljava/lang/reflect/Method;

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Method;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/inject/internal/ProviderMethod;->instance:Ljava/lang/Object;

    iget-object v3, v0, Lcom/google/inject/internal/ProviderMethod;->instance:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x1

    .line 128
    .end local v0    # "o":Lcom/google/inject/internal/ProviderMethod;
    :cond_0
    return v1
.end method

.method public get()Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 96
    .local p0, "this":Lcom/google/inject/internal/ProviderMethod;, "Lcom/google/inject/internal/ProviderMethod<TT;>;"
    iget-object v4, p0, Lcom/google/inject/internal/ProviderMethod;->parameterProviders:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    new-array v2, v4, [Ljava/lang/Object;

    .line 97
    .local v2, "parameters":[Ljava/lang/Object;
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    array-length v4, v2

    if-ge v1, v4, :cond_0

    .line 98
    iget-object v4, p0, Lcom/google/inject/internal/ProviderMethod;->parameterProviders:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/inject/Provider;

    invoke-interface {v4}, Lcom/google/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v1

    .line 97
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 104
    :cond_0
    :try_start_0
    iget-object v4, p0, Lcom/google/inject/internal/ProviderMethod;->method:Ljava/lang/reflect/Method;

    iget-object v5, p0, Lcom/google/inject/internal/ProviderMethod;->instance:Ljava/lang/Object;

    invoke-virtual {v4, v5, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v3

    .line 105
    .local v3, "result":Ljava/lang/Object;, "TT;"
    return-object v3

    .line 106
    .end local v3    # "result":Ljava/lang/Object;, "TT;"
    :catch_0
    move-exception v0

    .line 107
    .local v0, "e":Ljava/lang/IllegalAccessException;
    new-instance v4, Ljava/lang/AssertionError;

    invoke-direct {v4, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v4

    .line 108
    .end local v0    # "e":Ljava/lang/IllegalAccessException;
    :catch_1
    move-exception v0

    .line 109
    .local v0, "e":Ljava/lang/reflect/InvocationTargetException;
    invoke-static {v0}, Lcom/google/inject/internal/Exceptions;->throwCleanly(Ljava/lang/reflect/InvocationTargetException;)Ljava/lang/RuntimeException;

    move-result-object v4

    throw v4
.end method

.method public getDependencies()Ljava/util/Set;
    .locals 1
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
    .line 114
    .local p0, "this":Lcom/google/inject/internal/ProviderMethod;, "Lcom/google/inject/internal/ProviderMethod<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/ProviderMethod;->dependencies:Lcom/google/inject/internal/util/$ImmutableSet;

    return-object v0
.end method

.method public getInstance()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 76
    .local p0, "this":Lcom/google/inject/internal/ProviderMethod;, "Lcom/google/inject/internal/ProviderMethod<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/ProviderMethod;->instance:Ljava/lang/Object;

    return-object v0
.end method

.method public getKey()Lcom/google/inject/Key;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/Key",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 67
    .local p0, "this":Lcom/google/inject/internal/ProviderMethod;, "Lcom/google/inject/internal/ProviderMethod<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/ProviderMethod;->key:Lcom/google/inject/Key;

    return-object v0
.end method

.method public getMethod()Ljava/lang/reflect/Method;
    .locals 1

    .prologue
    .line 71
    .local p0, "this":Lcom/google/inject/internal/ProviderMethod;, "Lcom/google/inject/internal/ProviderMethod<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/ProviderMethod;->method:Ljava/lang/reflect/Method;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 137
    .local p0, "this":Lcom/google/inject/internal/ProviderMethod;, "Lcom/google/inject/internal/ProviderMethod<TT;>;"
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/inject/internal/ProviderMethod;->method:Ljava/lang/reflect/Method;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/inject/internal/util/$Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 118
    .local p0, "this":Lcom/google/inject/internal/ProviderMethod;, "Lcom/google/inject/internal/ProviderMethod<TT;>;"
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "@Provides "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/inject/internal/ProviderMethod;->method:Ljava/lang/reflect/Method;

    invoke-static {v1}, Lcom/google/inject/internal/util/$StackTraceElements;->forMember(Ljava/lang/reflect/Member;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
