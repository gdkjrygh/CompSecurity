.class Lcom/google/inject/internal/UntargettedBindingProcessor;
.super Lcom/google/inject/internal/AbstractBindingProcessor;
.source "UntargettedBindingProcessor.java"


# direct methods
.method constructor <init>(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/ProcessedBindingData;)V
    .locals 0
    .param p1, "errors"    # Lcom/google/inject/internal/Errors;
    .param p2, "bindingData"    # Lcom/google/inject/internal/ProcessedBindingData;

    .prologue
    .line 30
    invoke-direct {p0, p1, p2}, Lcom/google/inject/internal/AbstractBindingProcessor;-><init>(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/ProcessedBindingData;)V

    .line 31
    return-void
.end method


# virtual methods
.method public visit(Lcom/google/inject/Binding;)Ljava/lang/Boolean;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/Binding",
            "<TT;>;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    .prologue
    .line 35
    .local p1, "binding":Lcom/google/inject/Binding;, "Lcom/google/inject/Binding<TT;>;"
    new-instance v1, Lcom/google/inject/internal/UntargettedBindingProcessor$1;

    move-object v0, p1

    check-cast v0, Lcom/google/inject/internal/BindingImpl;

    invoke-direct {v1, p0, v0}, Lcom/google/inject/internal/UntargettedBindingProcessor$1;-><init>(Lcom/google/inject/internal/UntargettedBindingProcessor;Lcom/google/inject/internal/BindingImpl;)V

    invoke-interface {p1, v1}, Lcom/google/inject/Binding;->acceptTargetVisitor(Lcom/google/inject/spi/BindingTargetVisitor;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic visit(Lcom/google/inject/Binding;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/Binding;

    .prologue
    .line 27
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/UntargettedBindingProcessor;->visit(Lcom/google/inject/Binding;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
