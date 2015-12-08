.class abstract Lcom/google/inject/internal/AbstractProcessor;
.super Lcom/google/inject/spi/DefaultElementVisitor;
.source "AbstractProcessor.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/inject/spi/DefaultElementVisitor",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field protected errors:Lcom/google/inject/internal/Errors;

.field protected injector:Lcom/google/inject/internal/InjectorImpl;


# direct methods
.method protected constructor <init>(Lcom/google/inject/internal/Errors;)V
    .locals 0
    .param p1, "errors"    # Lcom/google/inject/internal/Errors;

    .prologue
    .line 38
    invoke-direct {p0}, Lcom/google/inject/spi/DefaultElementVisitor;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/google/inject/internal/AbstractProcessor;->errors:Lcom/google/inject/internal/Errors;

    .line 40
    return-void
.end method


# virtual methods
.method public process(Lcom/google/inject/internal/InjectorImpl;Ljava/util/List;)V
    .locals 6
    .param p1, "injector"    # Lcom/google/inject/internal/InjectorImpl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/InjectorImpl;",
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/spi/Element;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p2, "elements":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/spi/Element;>;"
    const/4 v5, 0x0

    .line 49
    iget-object v2, p0, Lcom/google/inject/internal/AbstractProcessor;->errors:Lcom/google/inject/internal/Errors;

    .line 50
    .local v2, "errorsAnyElement":Lcom/google/inject/internal/Errors;
    iput-object p1, p0, Lcom/google/inject/internal/AbstractProcessor;->injector:Lcom/google/inject/internal/InjectorImpl;

    .line 52
    :try_start_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .local v3, "i":Ljava/util/Iterator;, "Ljava/util/Iterator<Lcom/google/inject/spi/Element;>;"
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 53
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/inject/spi/Element;

    .line 54
    .local v1, "element":Lcom/google/inject/spi/Element;
    invoke-interface {v1}, Lcom/google/inject/spi/Element;->getSource()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/google/inject/internal/Errors;->withSource(Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v4

    iput-object v4, p0, Lcom/google/inject/internal/AbstractProcessor;->errors:Lcom/google/inject/internal/Errors;

    .line 55
    invoke-interface {v1, p0}, Lcom/google/inject/spi/Element;->acceptVisitor(Lcom/google/inject/spi/ElementVisitor;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    .line 56
    .local v0, "allDone":Ljava/lang/Boolean;
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 57
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 61
    .end local v0    # "allDone":Ljava/lang/Boolean;
    .end local v1    # "element":Lcom/google/inject/spi/Element;
    .end local v3    # "i":Ljava/util/Iterator;, "Ljava/util/Iterator<Lcom/google/inject/spi/Element;>;"
    :catchall_0
    move-exception v4

    iput-object v2, p0, Lcom/google/inject/internal/AbstractProcessor;->errors:Lcom/google/inject/internal/Errors;

    .line 62
    iput-object v5, p0, Lcom/google/inject/internal/AbstractProcessor;->injector:Lcom/google/inject/internal/InjectorImpl;

    throw v4

    .line 61
    .restart local v3    # "i":Ljava/util/Iterator;, "Ljava/util/Iterator<Lcom/google/inject/spi/Element;>;"
    :cond_1
    iput-object v2, p0, Lcom/google/inject/internal/AbstractProcessor;->errors:Lcom/google/inject/internal/Errors;

    .line 62
    iput-object v5, p0, Lcom/google/inject/internal/AbstractProcessor;->injector:Lcom/google/inject/internal/InjectorImpl;

    .line 64
    return-void
.end method

.method public process(Ljava/lang/Iterable;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable",
            "<",
            "Lcom/google/inject/internal/InjectorShell;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 43
    .local p1, "isolatedInjectorBuilders":Ljava/lang/Iterable;, "Ljava/lang/Iterable<Lcom/google/inject/internal/InjectorShell;>;"
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/inject/internal/InjectorShell;

    .line 44
    .local v1, "injectorShell":Lcom/google/inject/internal/InjectorShell;
    invoke-virtual {v1}, Lcom/google/inject/internal/InjectorShell;->getInjector()Lcom/google/inject/internal/InjectorImpl;

    move-result-object v2

    invoke-virtual {v1}, Lcom/google/inject/internal/InjectorShell;->getElements()Ljava/util/List;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Lcom/google/inject/internal/AbstractProcessor;->process(Lcom/google/inject/internal/InjectorImpl;Ljava/util/List;)V

    goto :goto_0

    .line 46
    .end local v1    # "injectorShell":Lcom/google/inject/internal/InjectorShell;
    :cond_0
    return-void
.end method

.method protected visitOther(Lcom/google/inject/spi/Element;)Ljava/lang/Boolean;
    .locals 1
    .param p1, "element"    # Lcom/google/inject/spi/Element;

    .prologue
    .line 68
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic visitOther(Lcom/google/inject/spi/Element;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/spi/Element;

    .prologue
    .line 33
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/AbstractProcessor;->visitOther(Lcom/google/inject/spi/Element;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
