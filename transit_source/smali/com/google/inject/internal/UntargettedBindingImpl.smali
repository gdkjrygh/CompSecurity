.class final Lcom/google/inject/internal/UntargettedBindingImpl;
.super Lcom/google/inject/internal/BindingImpl;
.source "UntargettedBindingImpl.java"

# interfaces
.implements Lcom/google/inject/spi/UntargettedBinding;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/inject/internal/BindingImpl",
        "<TT;>;",
        "Lcom/google/inject/spi/UntargettedBinding",
        "<TT;>;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Key;Ljava/lang/Object;)V
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
            ")V"
        }
    .end annotation

    .prologue
    .line 30
    .local p0, "this":Lcom/google/inject/internal/UntargettedBindingImpl;, "Lcom/google/inject/internal/UntargettedBindingImpl<TT;>;"
    .local p2, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<TT;>;"
    new-instance v4, Lcom/google/inject/internal/UntargettedBindingImpl$1;

    invoke-direct {v4}, Lcom/google/inject/internal/UntargettedBindingImpl$1;-><init>()V

    sget-object v5, Lcom/google/inject/internal/Scoping;->UNSCOPED:Lcom/google/inject/internal/Scoping;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/inject/internal/BindingImpl;-><init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Key;Ljava/lang/Object;Lcom/google/inject/internal/InternalFactory;Lcom/google/inject/internal/Scoping;)V

    .line 35
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lcom/google/inject/Key;Lcom/google/inject/internal/Scoping;)V
    .locals 0
    .param p1, "source"    # Ljava/lang/Object;
    .param p3, "scoping"    # Lcom/google/inject/internal/Scoping;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lcom/google/inject/Key",
            "<TT;>;",
            "Lcom/google/inject/internal/Scoping;",
            ")V"
        }
    .end annotation

    .prologue
    .line 38
    .local p0, "this":Lcom/google/inject/internal/UntargettedBindingImpl;, "Lcom/google/inject/internal/UntargettedBindingImpl<TT;>;"
    .local p2, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<TT;>;"
    invoke-direct {p0, p1, p2, p3}, Lcom/google/inject/internal/BindingImpl;-><init>(Ljava/lang/Object;Lcom/google/inject/Key;Lcom/google/inject/internal/Scoping;)V

    .line 39
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
    .line 42
    .local p0, "this":Lcom/google/inject/internal/UntargettedBindingImpl;, "Lcom/google/inject/internal/UntargettedBindingImpl<TT;>;"
    .local p1, "visitor":Lcom/google/inject/spi/BindingTargetVisitor;, "Lcom/google/inject/spi/BindingTargetVisitor<-TT;TV;>;"
    invoke-interface {p1, p0}, Lcom/google/inject/spi/BindingTargetVisitor;->visit(Lcom/google/inject/spi/UntargettedBinding;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public applyTo(Lcom/google/inject/Binder;)V
    .locals 3
    .param p1, "binder"    # Lcom/google/inject/Binder;

    .prologue
    .line 54
    .local p0, "this":Lcom/google/inject/internal/UntargettedBindingImpl;, "Lcom/google/inject/internal/UntargettedBindingImpl<TT;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/UntargettedBindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/inject/internal/UntargettedBindingImpl;->getSource()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/google/inject/Binder;->withSource(Ljava/lang/Object;)Lcom/google/inject/Binder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/inject/internal/UntargettedBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/google/inject/Binder;->bind(Lcom/google/inject/Key;)Lcom/google/inject/binder/LinkedBindingBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/inject/internal/Scoping;->applyTo(Lcom/google/inject/binder/ScopedBindingBuilder;)V

    .line 55
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    .local p0, "this":Lcom/google/inject/internal/UntargettedBindingImpl;, "Lcom/google/inject/internal/UntargettedBindingImpl<TT;>;"
    const/4 v1, 0x0

    .line 66
    instance-of v2, p1, Lcom/google/inject/internal/UntargettedBindingImpl;

    if-eqz v2, :cond_0

    move-object v0, p1

    .line 67
    check-cast v0, Lcom/google/inject/internal/UntargettedBindingImpl;

    .line 68
    .local v0, "o":Lcom/google/inject/internal/UntargettedBindingImpl;, "Lcom/google/inject/internal/UntargettedBindingImpl<*>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/UntargettedBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/inject/internal/UntargettedBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/inject/Key;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/google/inject/internal/UntargettedBindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/inject/internal/UntargettedBindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/inject/internal/Scoping;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x1

    .line 71
    .end local v0    # "o":Lcom/google/inject/internal/UntargettedBindingImpl;, "Lcom/google/inject/internal/UntargettedBindingImpl<*>;"
    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 77
    .local p0, "this":Lcom/google/inject/internal/UntargettedBindingImpl;, "Lcom/google/inject/internal/UntargettedBindingImpl<TT;>;"
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/inject/internal/UntargettedBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/google/inject/internal/UntargettedBindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/inject/internal/util/$Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 58
    .local p0, "this":Lcom/google/inject/internal/UntargettedBindingImpl;, "Lcom/google/inject/internal/UntargettedBindingImpl<TT;>;"
    new-instance v0, Lcom/google/inject/internal/util/$ToStringBuilder;

    const-class v1, Lcom/google/inject/spi/UntargettedBinding;

    invoke-direct {v0, v1}, Lcom/google/inject/internal/util/$ToStringBuilder;-><init>(Ljava/lang/Class;)V

    const-string v1, "key"

    invoke-virtual {p0}, Lcom/google/inject/internal/UntargettedBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ToStringBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ToStringBuilder;

    move-result-object v0

    const-string v1, "source"

    invoke-virtual {p0}, Lcom/google/inject/internal/UntargettedBindingImpl;->getSource()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ToStringBuilder;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ToStringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/inject/internal/util/$ToStringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public withKey(Lcom/google/inject/Key;)Lcom/google/inject/internal/BindingImpl;
    .locals 3
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
    .line 50
    .local p0, "this":Lcom/google/inject/internal/UntargettedBindingImpl;, "Lcom/google/inject/internal/UntargettedBindingImpl<TT;>;"
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<TT;>;"
    new-instance v0, Lcom/google/inject/internal/UntargettedBindingImpl;

    invoke-virtual {p0}, Lcom/google/inject/internal/UntargettedBindingImpl;->getSource()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/inject/internal/UntargettedBindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v2

    invoke-direct {v0, v1, p1, v2}, Lcom/google/inject/internal/UntargettedBindingImpl;-><init>(Ljava/lang/Object;Lcom/google/inject/Key;Lcom/google/inject/internal/Scoping;)V

    return-object v0
.end method

.method public withScoping(Lcom/google/inject/internal/Scoping;)Lcom/google/inject/internal/BindingImpl;
    .locals 3
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
    .line 46
    .local p0, "this":Lcom/google/inject/internal/UntargettedBindingImpl;, "Lcom/google/inject/internal/UntargettedBindingImpl<TT;>;"
    new-instance v0, Lcom/google/inject/internal/UntargettedBindingImpl;

    invoke-virtual {p0}, Lcom/google/inject/internal/UntargettedBindingImpl;->getSource()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/inject/internal/UntargettedBindingImpl;->getKey()Lcom/google/inject/Key;

    move-result-object v2

    invoke-direct {v0, v1, v2, p1}, Lcom/google/inject/internal/UntargettedBindingImpl;-><init>(Ljava/lang/Object;Lcom/google/inject/Key;Lcom/google/inject/internal/Scoping;)V

    return-object v0
.end method
