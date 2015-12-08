.class Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;
.super Lcom/google/inject/internal/BindingImpl;
.source "InjectorImpl.java"

# interfaces
.implements Lcom/google/inject/spi/ConvertedConstantBinding;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/InjectorImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ConvertedConstantBindingImpl"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/inject/internal/BindingImpl",
        "<TT;>;",
        "Lcom/google/inject/spi/ConvertedConstantBinding",
        "<TT;>;"
    }
.end annotation


# instance fields
.field final originalBinding:Lcom/google/inject/Binding;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/Binding",
            "<",
            "Ljava/lang/String;",
            ">;"
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

.field final typeConverterBinding:Lcom/google/inject/spi/TypeConverterBinding;

.field final value:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Key;Ljava/lang/Object;Lcom/google/inject/Binding;Lcom/google/inject/spi/TypeConverterBinding;)V
    .locals 6
    .param p1, "injector"    # Lcom/google/inject/internal/InjectorImpl;
    .param p5, "typeConverterBinding"    # Lcom/google/inject/spi/TypeConverterBinding;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/InjectorImpl;",
            "Lcom/google/inject/Key",
            "<TT;>;TT;",
            "Lcom/google/inject/Binding",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/inject/spi/TypeConverterBinding;",
            ")V"
        }
    .end annotation

    .prologue
    .line 443
    .local p0, "this":Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;, "Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl<TT;>;"
    .local p2, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<TT;>;"
    .local p3, "value":Ljava/lang/Object;, "TT;"
    .local p4, "originalBinding":Lcom/google/inject/Binding;, "Lcom/google/inject/Binding<Ljava/lang/String;>;"
    invoke-interface {p4}, Lcom/google/inject/Binding;->getSource()Ljava/lang/Object;

    move-result-object v3

    new-instance v4, Lcom/google/inject/internal/ConstantFactory;

    invoke-static {p3}, Lcom/google/inject/internal/Initializables;->of(Ljava/lang/Object;)Lcom/google/inject/internal/Initializable;

    move-result-object v0

    invoke-direct {v4, v0}, Lcom/google/inject/internal/ConstantFactory;-><init>(Lcom/google/inject/internal/Initializable;)V

    sget-object v5, Lcom/google/inject/internal/Scoping;->UNSCOPED:Lcom/google/inject/internal/Scoping;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/inject/internal/BindingImpl;-><init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Key;Ljava/lang/Object;Lcom/google/inject/internal/InternalFactory;Lcom/google/inject/internal/Scoping;)V

    .line 445
    iput-object p3, p0, Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;->value:Ljava/lang/Object;

    .line 446
    invoke-static {p3}, Lcom/google/inject/util/Providers;->of(Ljava/lang/Object;)Lcom/google/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;->provider:Lcom/google/inject/Provider;

    .line 447
    iput-object p4, p0, Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;->originalBinding:Lcom/google/inject/Binding;

    .line 448
    iput-object p5, p0, Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;->typeConverterBinding:Lcom/google/inject/spi/TypeConverterBinding;

    .line 449
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
    .line 456
    .local p0, "this":Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;, "Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl<TT;>;"
    .local p1, "visitor":Lcom/google/inject/spi/BindingTargetVisitor;, "Lcom/google/inject/spi/BindingTargetVisitor<-TT;TV;>;"
    invoke-interface {p1, p0}, Lcom/google/inject/spi/BindingTargetVisitor;->visit(Lcom/google/inject/spi/ConvertedConstantBinding;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public applyTo(Lcom/google/inject/Binder;)V
    .locals 2
    .param p1, "binder"    # Lcom/google/inject/Binder;

    .prologue
    .line 476
    .local p0, "this":Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;, "Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl<TT;>;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This element represents a synthetic binding."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    .local p0, "this":Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;, "Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl<TT;>;"
    const/4 v1, 0x0

    .line 489
    instance-of v2, p1, Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;

    if-eqz v2, :cond_0

    move-object v0, p1

    .line 490
    check-cast v0, Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;

    .line 491
    .local v0, "o":Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;, "Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl<*>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/inject/Key;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/inject/internal/Scoping;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;->value:Ljava/lang/Object;

    iget-object v3, v0, Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;->value:Ljava/lang/Object;

    invoke-static {v2, v3}, Lcom/google/inject/internal/util/$Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x1

    .line 495
    .end local v0    # "o":Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;, "Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl<*>;"
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
    .line 472
    .local p0, "this":Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;, "Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl<TT;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;->getSourceKey()Lcom/google/inject/Key;

    move-result-object v0

    invoke-static {v0}, Lcom/google/inject/spi/Dependency;->get(Lcom/google/inject/Key;)Lcom/google/inject/spi/Dependency;

    move-result-object v0

    invoke-static {v0}, Lcom/google/inject/internal/util/$ImmutableSet;->of(Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

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
    .line 452
    .local p0, "this":Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;, "Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;->provider:Lcom/google/inject/Provider;

    return-object v0
.end method

.method public getSourceKey()Lcom/google/inject/Key;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/Key",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 468
    .local p0, "this":Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;, "Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;->originalBinding:Lcom/google/inject/Binding;

    invoke-interface {v0}, Lcom/google/inject/Binding;->getKey()Lcom/google/inject/Key;

    move-result-object v0

    return-object v0
.end method

.method public getTypeConverterBinding()Lcom/google/inject/spi/TypeConverterBinding;
    .locals 1

    .prologue
    .line 464
    .local p0, "this":Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;, "Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;->typeConverterBinding:Lcom/google/inject/spi/TypeConverterBinding;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 460
    .local p0, "this":Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;, "Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;->value:Ljava/lang/Object;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 501
    .local p0, "this":Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;, "Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl<TT;>;"
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;->value:Ljava/lang/Object;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/inject/internal/util/$Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 480
    .local p0, "this":Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;, "Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl<TT;>;"
    new-instance v0, Lcom/google/inject/internal/util/$ToStringBuilder;

    const-class v1, Lcom/google/inject/spi/ConvertedConstantBinding;

    invoke-direct {v0, v1}, Lcom/google/inject/internal/util/$ToStringBuilder;-><init>(Ljava/lang/Class;)V

    const-string v1, "key"

    invoke-virtual {p0}, Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ToStringBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ToStringBuilder;

    move-result-object v0

    const-string v1, "sourceKey"

    invoke-virtual {p0}, Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;->getSourceKey()Lcom/google/inject/Key;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ToStringBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ToStringBuilder;

    move-result-object v0

    const-string v1, "value"

    iget-object v2, p0, Lcom/google/inject/internal/InjectorImpl$ConvertedConstantBindingImpl;->value:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ToStringBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ToStringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/inject/internal/util/$ToStringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
