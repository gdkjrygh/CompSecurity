.class final Lcom/google/inject/internal/InstanceBindingImpl;
.super Lcom/google/inject/internal/BindingImpl;
.source "InstanceBindingImpl.java"

# interfaces
.implements Lcom/google/inject/spi/InstanceBinding;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/inject/internal/BindingImpl",
        "<TT;>;",
        "Lcom/google/inject/spi/InstanceBinding",
        "<TT;>;"
    }
.end annotation


# instance fields
.field final injectionPoints:Lcom/google/inject/internal/util/$ImmutableSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$ImmutableSet",
            "<",
            "Lcom/google/inject/spi/InjectionPoint;",
            ">;"
        }
    .end annotation
.end field

.field final instance:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field final provider:Lcom/google/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/Provider",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Key;Ljava/lang/Object;Lcom/google/inject/internal/InternalFactory;Ljava/util/Set;Ljava/lang/Object;)V
    .locals 6
    .param p1, "injector"    # Lcom/google/inject/internal/InjectorImpl;
    .param p3, "source"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/InjectorImpl;",
            "Lcom/google/inject/Key",
            "<TT;>;",
            "Ljava/lang/Object;",
            "Lcom/google/inject/internal/InternalFactory",
            "<+TT;>;",
            "Ljava/util/Set",
            "<",
            "Lcom/google/inject/spi/InjectionPoint;",
            ">;TT;)V"
        }
    .end annotation

    .prologue
    .line 42
    .local p0, "this":Lcom/google/inject/internal/InstanceBindingImpl;, "Lcom/google/inject/internal/InstanceBindingImpl<TT;>;"
    .local p2, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<TT;>;"
    .local p4, "internalFactory":Lcom/google/inject/internal/InternalFactory;, "Lcom/google/inject/internal/InternalFactory<+TT;>;"
    .local p5, "injectionPoints":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/inject/spi/InjectionPoint;>;"
    .local p6, "instance":Ljava/lang/Object;, "TT;"
    sget-object v5, Lcom/google/inject/internal/Scoping;->EAGER_SINGLETON:Lcom/google/inject/internal/Scoping;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/inject/internal/BindingImpl;-><init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Key;Ljava/lang/Object;Lcom/google/inject/internal/InternalFactory;Lcom/google/inject/internal/Scoping;)V

    .line 43
    invoke-static {p5}, Lcom/google/inject/internal/util/$ImmutableSet;->copyOf(Ljava/lang/Iterable;)Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/InstanceBindingImpl;->injectionPoints:Lcom/google/inject/internal/util/$ImmutableSet;

    .line 44
    iput-object p6, p0, Lcom/google/inject/internal/InstanceBindingImpl;->instance:Ljava/lang/Object;

    .line 45
    invoke-static {p6}, Lcom/google/inject/util/Providers;->of(Ljava/lang/Object;)Lcom/google/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/InstanceBindingImpl;->provider:Lcom/google/inject/Provider;

    .line 46
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lcom/google/inject/Key;Lcom/google/inject/internal/Scoping;Ljava/util/Set;Ljava/lang/Object;)V
    .locals 1
    .param p1, "source"    # Ljava/lang/Object;
    .param p3, "scoping"    # Lcom/google/inject/internal/Scoping;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lcom/google/inject/Key",
            "<TT;>;",
            "Lcom/google/inject/internal/Scoping;",
            "Ljava/util/Set",
            "<",
            "Lcom/google/inject/spi/InjectionPoint;",
            ">;TT;)V"
        }
    .end annotation

    .prologue
    .line 50
    .local p0, "this":Lcom/google/inject/internal/InstanceBindingImpl;, "Lcom/google/inject/internal/InstanceBindingImpl<TT;>;"
    .local p2, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<TT;>;"
    .local p4, "injectionPoints":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/inject/spi/InjectionPoint;>;"
    .local p5, "instance":Ljava/lang/Object;, "TT;"
    invoke-direct {p0, p1, p2, p3}, Lcom/google/inject/internal/BindingImpl;-><init>(Ljava/lang/Object;Lcom/google/inject/Key;Lcom/google/inject/internal/Scoping;)V

    .line 51
    invoke-static {p4}, Lcom/google/inject/internal/util/$ImmutableSet;->copyOf(Ljava/lang/Iterable;)Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/InstanceBindingImpl;->injectionPoints:Lcom/google/inject/internal/util/$ImmutableSet;

    .line 52
    iput-object p5, p0, Lcom/google/inject/internal/InstanceBindingImpl;->instance:Ljava/lang/Object;

    .line 53
    invoke-static {p5}, Lcom/google/inject/util/Providers;->of(Ljava/lang/Object;)Lcom/google/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/InstanceBindingImpl;->provider:Lcom/google/inject/Provider;

    .line 54
    return-void
.end method


# virtual methods
.method public acceptTargetVisitor(Lcom/google/inject/spi/BindingTargetVisitor;)Ljava/lang/Object;
    .locals 1
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
    .line 61
    .local p0, "this":Lcom/google/inject/internal/InstanceBindingImpl;, "Lcom/google/inject/internal/InstanceBindingImpl<TT;>;"
    .local p1, "visitor":Lcom/google/inject/spi/BindingTargetVisitor;, "Lcom/google/inject/spi/BindingTargetVisitor<-TT;TV;>;"
    invoke-interface {p1, p0}, Lcom/google/inject/spi/BindingTargetVisitor;->visit(Lcom/google/inject/spi/InstanceBinding;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public applyTo(Lcom/google/inject/Binder;)V
    .locals 2
    .param p1, "binder"    # Lcom/google/inject/Binder;

    .prologue
    .line 88
    .local p0, "this":Lcom/google/inject/internal/InstanceBindingImpl;, "Lcom/google/inject/internal/InstanceBindingImpl<TT;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/InstanceBindingImpl;->getSource()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/google/inject/Binder;->withSource(Ljava/lang/Object;)Lcom/google/inject/Binder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/inject/internal/InstanceBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/inject/Binder;->bind(Lcom/google/inject/Key;)Lcom/google/inject/binder/LinkedBindingBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/inject/internal/InstanceBindingImpl;->instance:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lcom/google/inject/binder/LinkedBindingBuilder;->toInstance(Ljava/lang/Object;)V

    .line 89
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    .local p0, "this":Lcom/google/inject/internal/InstanceBindingImpl;, "Lcom/google/inject/internal/InstanceBindingImpl<TT;>;"
    const/4 v1, 0x0

    .line 101
    instance-of v2, p1, Lcom/google/inject/internal/InstanceBindingImpl;

    if-eqz v2, :cond_0

    move-object v0, p1

    .line 102
    check-cast v0, Lcom/google/inject/internal/InstanceBindingImpl;

    .line 103
    .local v0, "o":Lcom/google/inject/internal/InstanceBindingImpl;, "Lcom/google/inject/internal/InstanceBindingImpl<*>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/InstanceBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/inject/internal/InstanceBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/inject/Key;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/google/inject/internal/InstanceBindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/inject/internal/InstanceBindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/inject/internal/Scoping;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/inject/internal/InstanceBindingImpl;->instance:Ljava/lang/Object;

    iget-object v3, v0, Lcom/google/inject/internal/InstanceBindingImpl;->instance:Ljava/lang/Object;

    invoke-static {v2, v3}, Lcom/google/inject/internal/util/$Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x1

    .line 107
    .end local v0    # "o":Lcom/google/inject/internal/InstanceBindingImpl;, "Lcom/google/inject/internal/InstanceBindingImpl<*>;"
    :cond_0
    return v1
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
    .line 73
    .local p0, "this":Lcom/google/inject/internal/InstanceBindingImpl;, "Lcom/google/inject/internal/InstanceBindingImpl<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/InstanceBindingImpl;->instance:Ljava/lang/Object;

    instance-of v0, v0, Lcom/google/inject/spi/HasDependencies;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/inject/internal/InstanceBindingImpl;->instance:Ljava/lang/Object;

    check-cast v0, Lcom/google/inject/spi/HasDependencies;

    invoke-interface {v0}, Lcom/google/inject/spi/HasDependencies;->getDependencies()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Lcom/google/inject/internal/util/$ImmutableSet;->copyOf(Ljava/lang/Iterable;)Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/inject/internal/InstanceBindingImpl;->injectionPoints:Lcom/google/inject/internal/util/$ImmutableSet;

    invoke-static {v0}, Lcom/google/inject/spi/Dependency;->forInjectionPoints(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    goto :goto_0
.end method

.method public getInjectionPoints()Ljava/util/Set;
    .locals 1
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
    .line 69
    .local p0, "this":Lcom/google/inject/internal/InstanceBindingImpl;, "Lcom/google/inject/internal/InstanceBindingImpl<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/InstanceBindingImpl;->injectionPoints:Lcom/google/inject/internal/util/$ImmutableSet;

    return-object v0
.end method

.method public getInstance()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 65
    .local p0, "this":Lcom/google/inject/internal/InstanceBindingImpl;, "Lcom/google/inject/internal/InstanceBindingImpl<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/InstanceBindingImpl;->instance:Ljava/lang/Object;

    return-object v0
.end method

.method public getProvider()Lcom/google/inject/Provider;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/Provider",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 57
    .local p0, "this":Lcom/google/inject/internal/InstanceBindingImpl;, "Lcom/google/inject/internal/InstanceBindingImpl<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/InstanceBindingImpl;->provider:Lcom/google/inject/Provider;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 113
    .local p0, "this":Lcom/google/inject/internal/InstanceBindingImpl;, "Lcom/google/inject/internal/InstanceBindingImpl<TT;>;"
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/inject/internal/InstanceBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/google/inject/internal/InstanceBindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/inject/internal/util/$Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 92
    .local p0, "this":Lcom/google/inject/internal/InstanceBindingImpl;, "Lcom/google/inject/internal/InstanceBindingImpl<TT;>;"
    new-instance v0, Lcom/google/inject/internal/util/$ToStringBuilder;

    const-class v1, Lcom/google/inject/spi/InstanceBinding;

    invoke-direct {v0, v1}, Lcom/google/inject/internal/util/$ToStringBuilder;-><init>(Ljava/lang/Class;)V

    const-string v1, "key"

    invoke-virtual {p0}, Lcom/google/inject/internal/InstanceBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ToStringBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ToStringBuilder;

    move-result-object v0

    const-string v1, "source"

    invoke-virtual {p0}, Lcom/google/inject/internal/InstanceBindingImpl;->getSource()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ToStringBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ToStringBuilder;

    move-result-object v0

    const-string v1, "instance"

    iget-object v2, p0, Lcom/google/inject/internal/InstanceBindingImpl;->instance:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ToStringBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ToStringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/inject/internal/util/$ToStringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public withKey(Lcom/google/inject/Key;)Lcom/google/inject/internal/BindingImpl;
    .locals 6
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
    .line 83
    .local p0, "this":Lcom/google/inject/internal/InstanceBindingImpl;, "Lcom/google/inject/internal/InstanceBindingImpl<TT;>;"
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<TT;>;"
    new-instance v0, Lcom/google/inject/internal/InstanceBindingImpl;

    invoke-virtual {p0}, Lcom/google/inject/internal/InstanceBindingImpl;->getSource()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/inject/internal/InstanceBindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v3

    iget-object v4, p0, Lcom/google/inject/internal/InstanceBindingImpl;->injectionPoints:Lcom/google/inject/internal/util/$ImmutableSet;

    iget-object v5, p0, Lcom/google/inject/internal/InstanceBindingImpl;->instance:Ljava/lang/Object;

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/inject/internal/InstanceBindingImpl;-><init>(Ljava/lang/Object;Lcom/google/inject/Key;Lcom/google/inject/internal/Scoping;Ljava/util/Set;Ljava/lang/Object;)V

    return-object v0
.end method

.method public withScoping(Lcom/google/inject/internal/Scoping;)Lcom/google/inject/internal/BindingImpl;
    .locals 6
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
    .line 79
    .local p0, "this":Lcom/google/inject/internal/InstanceBindingImpl;, "Lcom/google/inject/internal/InstanceBindingImpl<TT;>;"
    new-instance v0, Lcom/google/inject/internal/InstanceBindingImpl;

    invoke-virtual {p0}, Lcom/google/inject/internal/InstanceBindingImpl;->getSource()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/inject/internal/InstanceBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v2

    iget-object v4, p0, Lcom/google/inject/internal/InstanceBindingImpl;->injectionPoints:Lcom/google/inject/internal/util/$ImmutableSet;

    iget-object v5, p0, Lcom/google/inject/internal/InstanceBindingImpl;->instance:Ljava/lang/Object;

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/inject/internal/InstanceBindingImpl;-><init>(Ljava/lang/Object;Lcom/google/inject/Key;Lcom/google/inject/internal/Scoping;Ljava/util/Set;Ljava/lang/Object;)V

    return-object v0
.end method
