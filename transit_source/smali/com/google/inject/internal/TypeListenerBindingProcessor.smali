.class final Lcom/google/inject/internal/TypeListenerBindingProcessor;
.super Lcom/google/inject/internal/AbstractProcessor;
.source "TypeListenerBindingProcessor.java"


# direct methods
.method constructor <init>(Lcom/google/inject/internal/Errors;)V
    .locals 0
    .param p1, "errors"    # Lcom/google/inject/internal/Errors;

    .prologue
    .line 29
    invoke-direct {p0, p1}, Lcom/google/inject/internal/AbstractProcessor;-><init>(Lcom/google/inject/internal/Errors;)V

    .line 30
    return-void
.end method


# virtual methods
.method public visit(Lcom/google/inject/spi/TypeListenerBinding;)Ljava/lang/Boolean;
    .locals 1
    .param p1, "binding"    # Lcom/google/inject/spi/TypeListenerBinding;

    .prologue
    .line 33
    iget-object v0, p0, Lcom/google/inject/internal/TypeListenerBindingProcessor;->injector:Lcom/google/inject/internal/InjectorImpl;

    iget-object v0, v0, Lcom/google/inject/internal/InjectorImpl;->state:Lcom/google/inject/internal/State;

    invoke-interface {v0, p1}, Lcom/google/inject/internal/State;->addTypeListener(Lcom/google/inject/spi/TypeListenerBinding;)V

    .line 34
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic visit(Lcom/google/inject/spi/TypeListenerBinding;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/spi/TypeListenerBinding;

    .prologue
    .line 26
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/TypeListenerBindingProcessor;->visit(Lcom/google/inject/spi/TypeListenerBinding;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
