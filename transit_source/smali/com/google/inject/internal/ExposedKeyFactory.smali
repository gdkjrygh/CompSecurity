.class final Lcom/google/inject/internal/ExposedKeyFactory;
.super Ljava/lang/Object;
.source "ExposedKeyFactory.java"

# interfaces
.implements Lcom/google/inject/internal/InternalFactory;
.implements Lcom/google/inject/internal/CreationListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/inject/internal/InternalFactory",
        "<TT;>;",
        "Lcom/google/inject/internal/CreationListener;"
    }
.end annotation


# instance fields
.field private delegate:Lcom/google/inject/internal/BindingImpl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/BindingImpl",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final key:Lcom/google/inject/Key;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/Key",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final privateElements:Lcom/google/inject/spi/PrivateElements;


# direct methods
.method constructor <init>(Lcom/google/inject/Key;Lcom/google/inject/spi/PrivateElements;)V
    .locals 0
    .param p2, "privateElements"    # Lcom/google/inject/spi/PrivateElements;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Key",
            "<TT;>;",
            "Lcom/google/inject/spi/PrivateElements;",
            ")V"
        }
    .end annotation

    .prologue
    .line 32
    .local p0, "this":Lcom/google/inject/internal/ExposedKeyFactory;, "Lcom/google/inject/internal/ExposedKeyFactory<TT;>;"
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/google/inject/internal/ExposedKeyFactory;->key:Lcom/google/inject/Key;

    .line 34
    iput-object p2, p0, Lcom/google/inject/internal/ExposedKeyFactory;->privateElements:Lcom/google/inject/spi/PrivateElements;

    .line 35
    return-void
.end method


# virtual methods
.method public get(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/InternalContext;Lcom/google/inject/spi/Dependency;Z)Ljava/lang/Object;
    .locals 1
    .param p1, "errors"    # Lcom/google/inject/internal/Errors;
    .param p2, "context"    # Lcom/google/inject/internal/InternalContext;
    .param p4, "linked"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/Errors;",
            "Lcom/google/inject/internal/InternalContext;",
            "Lcom/google/inject/spi/Dependency",
            "<*>;Z)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/ErrorsException;
        }
    .end annotation

    .prologue
    .line 54
    .local p0, "this":Lcom/google/inject/internal/ExposedKeyFactory;, "Lcom/google/inject/internal/ExposedKeyFactory<TT;>;"
    .local p3, "dependency":Lcom/google/inject/spi/Dependency;, "Lcom/google/inject/spi/Dependency<*>;"
    iget-object v0, p0, Lcom/google/inject/internal/ExposedKeyFactory;->delegate:Lcom/google/inject/internal/BindingImpl;

    invoke-virtual {v0}, Lcom/google/inject/internal/BindingImpl;->getInternalFactory()Lcom/google/inject/internal/InternalFactory;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/google/inject/internal/InternalFactory;->get(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/InternalContext;Lcom/google/inject/spi/Dependency;Z)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public notify(Lcom/google/inject/internal/Errors;)V
    .locals 4
    .param p1, "errors"    # Lcom/google/inject/internal/Errors;

    .prologue
    .line 38
    .local p0, "this":Lcom/google/inject/internal/ExposedKeyFactory;, "Lcom/google/inject/internal/ExposedKeyFactory<TT;>;"
    iget-object v2, p0, Lcom/google/inject/internal/ExposedKeyFactory;->privateElements:Lcom/google/inject/spi/PrivateElements;

    invoke-interface {v2}, Lcom/google/inject/spi/PrivateElements;->getInjector()Lcom/google/inject/Injector;

    move-result-object v1

    check-cast v1, Lcom/google/inject/internal/InjectorImpl;

    .line 39
    .local v1, "privateInjector":Lcom/google/inject/internal/InjectorImpl;
    iget-object v2, v1, Lcom/google/inject/internal/InjectorImpl;->state:Lcom/google/inject/internal/State;

    iget-object v3, p0, Lcom/google/inject/internal/ExposedKeyFactory;->key:Lcom/google/inject/Key;

    invoke-interface {v2, v3}, Lcom/google/inject/internal/State;->getExplicitBinding(Lcom/google/inject/Key;)Lcom/google/inject/internal/BindingImpl;

    move-result-object v0

    .line 44
    .local v0, "explicitBinding":Lcom/google/inject/internal/BindingImpl;, "Lcom/google/inject/internal/BindingImpl<TT;>;"
    invoke-virtual {v0}, Lcom/google/inject/internal/BindingImpl;->getInternalFactory()Lcom/google/inject/internal/InternalFactory;

    move-result-object v2

    if-ne v2, p0, :cond_0

    .line 45
    invoke-virtual {v0}, Lcom/google/inject/internal/BindingImpl;->getSource()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/google/inject/internal/Errors;->withSource(Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v2

    iget-object v3, p0, Lcom/google/inject/internal/ExposedKeyFactory;->key:Lcom/google/inject/Key;

    invoke-virtual {v2, v3}, Lcom/google/inject/internal/Errors;->exposedButNotBound(Lcom/google/inject/Key;)Lcom/google/inject/internal/Errors;

    .line 50
    :goto_0
    return-void

    .line 49
    :cond_0
    iput-object v0, p0, Lcom/google/inject/internal/ExposedKeyFactory;->delegate:Lcom/google/inject/internal/BindingImpl;

    goto :goto_0
.end method
