.class final Lcom/google/inject/internal/ScopeBindingProcessor;
.super Lcom/google/inject/internal/AbstractProcessor;
.source "ScopeBindingProcessor.java"


# direct methods
.method constructor <init>(Lcom/google/inject/internal/Errors;)V
    .locals 0
    .param p1, "errors"    # Lcom/google/inject/internal/Errors;

    .prologue
    .line 33
    invoke-direct {p0, p1}, Lcom/google/inject/internal/AbstractProcessor;-><init>(Lcom/google/inject/internal/Errors;)V

    .line 34
    return-void
.end method


# virtual methods
.method public visit(Lcom/google/inject/spi/ScopeBinding;)Ljava/lang/Boolean;
    .locals 5
    .param p1, "command"    # Lcom/google/inject/spi/ScopeBinding;

    .prologue
    .line 37
    invoke-virtual {p1}, Lcom/google/inject/spi/ScopeBinding;->getScope()Lcom/google/inject/Scope;

    move-result-object v2

    .line 38
    .local v2, "scope":Lcom/google/inject/Scope;
    invoke-virtual {p1}, Lcom/google/inject/spi/ScopeBinding;->getAnnotationType()Ljava/lang/Class;

    move-result-object v0

    .line 40
    .local v0, "annotationType":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    invoke-static {v0}, Lcom/google/inject/internal/Annotations;->isScopeAnnotation(Ljava/lang/Class;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 41
    iget-object v3, p0, Lcom/google/inject/internal/ScopeBindingProcessor;->errors:Lcom/google/inject/internal/Errors;

    invoke-virtual {v3, v0}, Lcom/google/inject/internal/Errors;->withSource(Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/inject/internal/Errors;->missingScopeAnnotation()Lcom/google/inject/internal/Errors;

    .line 45
    :cond_0
    invoke-static {v0}, Lcom/google/inject/internal/Annotations;->isRetainedAtRuntime(Ljava/lang/Class;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 46
    iget-object v3, p0, Lcom/google/inject/internal/ScopeBindingProcessor;->errors:Lcom/google/inject/internal/Errors;

    invoke-virtual {v3, v0}, Lcom/google/inject/internal/Errors;->withSource(Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v3

    invoke-virtual {p1}, Lcom/google/inject/spi/ScopeBinding;->getSource()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/inject/internal/Errors;->missingRuntimeRetention(Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    .line 51
    :cond_1
    iget-object v3, p0, Lcom/google/inject/internal/ScopeBindingProcessor;->injector:Lcom/google/inject/internal/InjectorImpl;

    iget-object v4, v3, Lcom/google/inject/internal/InjectorImpl;->state:Lcom/google/inject/internal/State;

    const-string v3, "annotation type"

    invoke-static {v0, v3}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    invoke-interface {v4, v3}, Lcom/google/inject/internal/State;->getScope(Ljava/lang/Class;)Lcom/google/inject/Scope;

    move-result-object v1

    .line 52
    .local v1, "existing":Lcom/google/inject/Scope;
    if-eqz v1, :cond_2

    .line 53
    iget-object v3, p0, Lcom/google/inject/internal/ScopeBindingProcessor;->errors:Lcom/google/inject/internal/Errors;

    invoke-virtual {v3, v1, v0, v2}, Lcom/google/inject/internal/Errors;->duplicateScopes(Lcom/google/inject/Scope;Ljava/lang/Class;Lcom/google/inject/Scope;)Lcom/google/inject/internal/Errors;

    .line 58
    :goto_0
    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    return-object v3

    .line 55
    :cond_2
    iget-object v3, p0, Lcom/google/inject/internal/ScopeBindingProcessor;->injector:Lcom/google/inject/internal/InjectorImpl;

    iget-object v4, v3, Lcom/google/inject/internal/InjectorImpl;->state:Lcom/google/inject/internal/State;

    const-string v3, "scope"

    invoke-static {v2, v3}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/inject/Scope;

    invoke-interface {v4, v0, v3}, Lcom/google/inject/internal/State;->putAnnotation(Ljava/lang/Class;Lcom/google/inject/Scope;)V

    goto :goto_0
.end method

.method public bridge synthetic visit(Lcom/google/inject/spi/ScopeBinding;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/spi/ScopeBinding;

    .prologue
    .line 30
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/ScopeBindingProcessor;->visit(Lcom/google/inject/spi/ScopeBinding;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
