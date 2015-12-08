.class final Lcom/google/inject/internal/PrivateElementProcessor;
.super Lcom/google/inject/internal/AbstractProcessor;
.source "PrivateElementProcessor.java"


# instance fields
.field private final injectorShellBuilders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/internal/InjectorShell$Builder;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/inject/internal/Errors;)V
    .locals 1
    .param p1, "errors"    # Lcom/google/inject/internal/Errors;

    .prologue
    .line 33
    invoke-direct {p0, p1}, Lcom/google/inject/internal/AbstractProcessor;-><init>(Lcom/google/inject/internal/Errors;)V

    .line 30
    invoke-static {}, Lcom/google/inject/internal/util/$Lists;->newArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/PrivateElementProcessor;->injectorShellBuilders:Ljava/util/List;

    .line 34
    return-void
.end method


# virtual methods
.method public getInjectorShellBuilders()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/internal/InjectorShell$Builder;",
            ">;"
        }
    .end annotation

    .prologue
    .line 45
    iget-object v0, p0, Lcom/google/inject/internal/PrivateElementProcessor;->injectorShellBuilders:Ljava/util/List;

    return-object v0
.end method

.method public visit(Lcom/google/inject/spi/PrivateElements;)Ljava/lang/Boolean;
    .locals 3
    .param p1, "privateElements"    # Lcom/google/inject/spi/PrivateElements;

    .prologue
    .line 37
    new-instance v1, Lcom/google/inject/internal/InjectorShell$Builder;

    invoke-direct {v1}, Lcom/google/inject/internal/InjectorShell$Builder;-><init>()V

    iget-object v2, p0, Lcom/google/inject/internal/PrivateElementProcessor;->injector:Lcom/google/inject/internal/InjectorImpl;

    invoke-virtual {v1, v2}, Lcom/google/inject/internal/InjectorShell$Builder;->parent(Lcom/google/inject/internal/InjectorImpl;)Lcom/google/inject/internal/InjectorShell$Builder;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/inject/internal/InjectorShell$Builder;->privateElements(Lcom/google/inject/spi/PrivateElements;)Lcom/google/inject/internal/InjectorShell$Builder;

    move-result-object v0

    .line 40
    .local v0, "builder":Lcom/google/inject/internal/InjectorShell$Builder;
    iget-object v1, p0, Lcom/google/inject/internal/PrivateElementProcessor;->injectorShellBuilders:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic visit(Lcom/google/inject/spi/PrivateElements;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/spi/PrivateElements;

    .prologue
    .line 28
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/PrivateElementProcessor;->visit(Lcom/google/inject/spi/PrivateElements;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
