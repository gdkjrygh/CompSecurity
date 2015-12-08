.class Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl;
.super Lcom/google/inject/internal/BindingImpl;
.source "InjectorImpl.java"

# interfaces
.implements Lcom/google/inject/spi/ProviderBinding;
.implements Lcom/google/inject/spi/HasDependencies;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/InjectorImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ProviderBindingImpl"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/inject/internal/BindingImpl",
        "<",
        "Lcom/google/inject/Provider",
        "<TT;>;>;",
        "Lcom/google/inject/spi/ProviderBinding",
        "<",
        "Lcom/google/inject/Provider",
        "<TT;>;>;",
        "Lcom/google/inject/spi/HasDependencies;"
    }
.end annotation


# instance fields
.field final providedBinding:Lcom/google/inject/internal/BindingImpl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/BindingImpl",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Key;Lcom/google/inject/Binding;)V
    .locals 6
    .param p1, "injector"    # Lcom/google/inject/internal/InjectorImpl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/InjectorImpl;",
            "Lcom/google/inject/Key",
            "<",
            "Lcom/google/inject/Provider",
            "<TT;>;>;",
            "Lcom/google/inject/Binding",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 326
    .local p0, "this":Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl;, "Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl<TT;>;"
    .local p2, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<Lcom/google/inject/Provider<TT;>;>;"
    .local p3, "providedBinding":Lcom/google/inject/Binding;, "Lcom/google/inject/Binding<TT;>;"
    invoke-interface {p3}, Lcom/google/inject/Binding;->getSource()Ljava/lang/Object;

    move-result-object v3

    invoke-static {p3}, Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl;->createInternalFactory(Lcom/google/inject/Binding;)Lcom/google/inject/internal/InternalFactory;

    move-result-object v4

    sget-object v5, Lcom/google/inject/internal/Scoping;->UNSCOPED:Lcom/google/inject/internal/Scoping;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/inject/internal/BindingImpl;-><init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Key;Ljava/lang/Object;Lcom/google/inject/internal/InternalFactory;Lcom/google/inject/internal/Scoping;)V

    .line 328
    check-cast p3, Lcom/google/inject/internal/BindingImpl;

    .end local p3    # "providedBinding":Lcom/google/inject/Binding;, "Lcom/google/inject/Binding<TT;>;"
    iput-object p3, p0, Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl;->providedBinding:Lcom/google/inject/internal/BindingImpl;

    .line 329
    return-void
.end method

.method static createInternalFactory(Lcom/google/inject/Binding;)Lcom/google/inject/internal/InternalFactory;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/Binding",
            "<TT;>;)",
            "Lcom/google/inject/internal/InternalFactory",
            "<",
            "Lcom/google/inject/Provider",
            "<TT;>;>;"
        }
    .end annotation

    .prologue
    .line 332
    .local p0, "providedBinding":Lcom/google/inject/Binding;, "Lcom/google/inject/Binding<TT;>;"
    invoke-interface {p0}, Lcom/google/inject/Binding;->getProvider()Lcom/google/inject/Provider;

    move-result-object v0

    .line 333
    .local v0, "provider":Lcom/google/inject/Provider;, "Lcom/google/inject/Provider<TT;>;"
    new-instance v1, Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl$1;

    invoke-direct {v1, v0}, Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl$1;-><init>(Lcom/google/inject/Provider;)V

    return-object v1
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
            "<-",
            "Lcom/google/inject/Provider",
            "<TT;>;TV;>;)TV;"
        }
    .end annotation

    .prologue
    .line 345
    .local p0, "this":Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl;, "Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl<TT;>;"
    .local p1, "visitor":Lcom/google/inject/spi/BindingTargetVisitor;, "Lcom/google/inject/spi/BindingTargetVisitor<-Lcom/google/inject/Provider<TT;>;TV;>;"
    invoke-interface {p1, p0}, Lcom/google/inject/spi/BindingTargetVisitor;->visit(Lcom/google/inject/spi/ProviderBinding;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public applyTo(Lcom/google/inject/Binder;)V
    .locals 2
    .param p1, "binder"    # Lcom/google/inject/Binder;

    .prologue
    .line 349
    .local p0, "this":Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl;, "Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl<TT;>;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This element represents a synthetic binding."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    .local p0, "this":Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl;, "Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl<TT;>;"
    const/4 v1, 0x0

    .line 365
    instance-of v2, p1, Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl;

    if-eqz v2, :cond_0

    move-object v0, p1

    .line 366
    check-cast v0, Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl;

    .line 367
    .local v0, "o":Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl;, "Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl<*>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/inject/Key;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/inject/internal/Scoping;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl;->providedBinding:Lcom/google/inject/internal/BindingImpl;

    iget-object v3, v0, Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl;->providedBinding:Lcom/google/inject/internal/BindingImpl;

    invoke-static {v2, v3}, Lcom/google/inject/internal/util/$Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x1

    .line 371
    .end local v0    # "o":Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl;, "Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl<*>;"
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
    .line 360
    .local p0, "this":Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl;, "Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl<TT;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl;->getProvidedKey()Lcom/google/inject/Key;

    move-result-object v0

    invoke-static {v0}, Lcom/google/inject/spi/Dependency;->get(Lcom/google/inject/Key;)Lcom/google/inject/spi/Dependency;

    move-result-object v0

    invoke-static {v0}, Lcom/google/inject/internal/util/$ImmutableSet;->of(Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    return-object v0
.end method

.method public getProvidedKey()Lcom/google/inject/Key;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/Key",
            "<+TT;>;"
        }
    .end annotation

    .prologue
    .line 341
    .local p0, "this":Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl;, "Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl;->providedBinding:Lcom/google/inject/internal/BindingImpl;

    invoke-virtual {v0}, Lcom/google/inject/internal/BindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 377
    .local p0, "this":Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl;, "Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl<TT;>;"
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl;->providedBinding:Lcom/google/inject/internal/BindingImpl;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/inject/internal/util/$Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 353
    .local p0, "this":Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl;, "Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl<TT;>;"
    new-instance v0, Lcom/google/inject/internal/util/$ToStringBuilder;

    const-class v1, Lcom/google/inject/spi/ProviderBinding;

    invoke-direct {v0, v1}, Lcom/google/inject/internal/util/$ToStringBuilder;-><init>(Ljava/lang/Class;)V

    const-string v1, "key"

    invoke-virtual {p0}, Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ToStringBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ToStringBuilder;

    move-result-object v0

    const-string v1, "providedKey"

    invoke-virtual {p0}, Lcom/google/inject/internal/InjectorImpl$ProviderBindingImpl;->getProvidedKey()Lcom/google/inject/Key;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ToStringBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ToStringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/inject/internal/util/$ToStringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
