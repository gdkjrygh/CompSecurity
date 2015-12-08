.class final Lcom/google/inject/internal/Scoping$3;
.super Lcom/google/inject/internal/Scoping;
.source "Scoping.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/Scoping;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 78
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/inject/internal/Scoping;-><init>(Lcom/google/inject/internal/Scoping$1;)V

    return-void
.end method


# virtual methods
.method public acceptVisitor(Lcom/google/inject/spi/BindingScopingVisitor;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/spi/BindingScopingVisitor",
            "<TV;>;)TV;"
        }
    .end annotation

    .prologue
    .line 80
    .local p1, "visitor":Lcom/google/inject/spi/BindingScopingVisitor;, "Lcom/google/inject/spi/BindingScopingVisitor<TV;>;"
    sget-object v0, Lcom/google/inject/Scopes;->SINGLETON:Lcom/google/inject/Scope;

    invoke-interface {p1, v0}, Lcom/google/inject/spi/BindingScopingVisitor;->visitScope(Lcom/google/inject/Scope;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public applyTo(Lcom/google/inject/binder/ScopedBindingBuilder;)V
    .locals 1
    .param p1, "scopedBindingBuilder"    # Lcom/google/inject/binder/ScopedBindingBuilder;

    .prologue
    .line 92
    sget-object v0, Lcom/google/inject/Scopes;->SINGLETON:Lcom/google/inject/Scope;

    invoke-interface {p1, v0}, Lcom/google/inject/binder/ScopedBindingBuilder;->in(Lcom/google/inject/Scope;)V

    .line 93
    return-void
.end method

.method public getScopeInstance()Lcom/google/inject/Scope;
    .locals 1

    .prologue
    .line 84
    sget-object v0, Lcom/google/inject/Scopes;->SINGLETON:Lcom/google/inject/Scope;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 88
    sget-object v0, Lcom/google/inject/Scopes;->SINGLETON:Lcom/google/inject/Scope;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
