.class Lcom/google/inject/internal/AbstractBindingProcessor$Processor$1;
.super Ljava/lang/Object;
.source "AbstractBindingProcessor.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/inject/internal/AbstractBindingProcessor$Processor;->scheduleInitialization(Lcom/google/inject/internal/BindingImpl;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/google/inject/internal/AbstractBindingProcessor$Processor;

.field final synthetic val$binding:Lcom/google/inject/internal/BindingImpl;


# direct methods
.method constructor <init>(Lcom/google/inject/internal/AbstractBindingProcessor$Processor;Lcom/google/inject/internal/BindingImpl;)V
    .locals 0

    .prologue
    .line 156
    .local p0, "this":Lcom/google/inject/internal/AbstractBindingProcessor$Processor$1;, "Lcom/google/inject/internal/AbstractBindingProcessor$Processor.1;"
    iput-object p1, p0, Lcom/google/inject/internal/AbstractBindingProcessor$Processor$1;->this$1:Lcom/google/inject/internal/AbstractBindingProcessor$Processor;

    iput-object p2, p0, Lcom/google/inject/internal/AbstractBindingProcessor$Processor$1;->val$binding:Lcom/google/inject/internal/BindingImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 159
    .local p0, "this":Lcom/google/inject/internal/AbstractBindingProcessor$Processor$1;, "Lcom/google/inject/internal/AbstractBindingProcessor$Processor.1;"
    :try_start_0
    iget-object v1, p0, Lcom/google/inject/internal/AbstractBindingProcessor$Processor$1;->val$binding:Lcom/google/inject/internal/BindingImpl;

    invoke-virtual {v1}, Lcom/google/inject/internal/BindingImpl;->getInjector()Lcom/google/inject/internal/InjectorImpl;

    move-result-object v1

    iget-object v2, p0, Lcom/google/inject/internal/AbstractBindingProcessor$Processor$1;->val$binding:Lcom/google/inject/internal/BindingImpl;

    iget-object v3, p0, Lcom/google/inject/internal/AbstractBindingProcessor$Processor$1;->this$1:Lcom/google/inject/internal/AbstractBindingProcessor$Processor;

    iget-object v3, v3, Lcom/google/inject/internal/AbstractBindingProcessor$Processor;->this$0:Lcom/google/inject/internal/AbstractBindingProcessor;

    iget-object v3, v3, Lcom/google/inject/internal/AbstractBindingProcessor;->errors:Lcom/google/inject/internal/Errors;

    iget-object v4, p0, Lcom/google/inject/internal/AbstractBindingProcessor$Processor$1;->this$1:Lcom/google/inject/internal/AbstractBindingProcessor$Processor;

    iget-object v4, v4, Lcom/google/inject/internal/AbstractBindingProcessor$Processor;->source:Ljava/lang/Object;

    invoke-virtual {v3, v4}, Lcom/google/inject/internal/Errors;->withSource(Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/google/inject/internal/InjectorImpl;->initializeBinding(Lcom/google/inject/internal/BindingImpl;Lcom/google/inject/internal/Errors;)V
    :try_end_0
    .catch Lcom/google/inject/internal/ErrorsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 163
    :goto_0
    return-void

    .line 160
    :catch_0
    move-exception v0

    .line 161
    .local v0, "e":Lcom/google/inject/internal/ErrorsException;
    iget-object v1, p0, Lcom/google/inject/internal/AbstractBindingProcessor$Processor$1;->this$1:Lcom/google/inject/internal/AbstractBindingProcessor$Processor;

    iget-object v1, v1, Lcom/google/inject/internal/AbstractBindingProcessor$Processor;->this$0:Lcom/google/inject/internal/AbstractBindingProcessor;

    iget-object v1, v1, Lcom/google/inject/internal/AbstractBindingProcessor;->errors:Lcom/google/inject/internal/Errors;

    invoke-virtual {v0}, Lcom/google/inject/internal/ErrorsException;->getErrors()Lcom/google/inject/internal/Errors;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/inject/internal/Errors;->merge(Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/Errors;

    goto :goto_0
.end method
