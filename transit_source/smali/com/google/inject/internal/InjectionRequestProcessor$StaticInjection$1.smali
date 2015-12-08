.class Lcom/google/inject/internal/InjectionRequestProcessor$StaticInjection$1;
.super Ljava/lang/Object;
.source "InjectionRequestProcessor.java"

# interfaces
.implements Lcom/google/inject/internal/ContextualCallable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/inject/internal/InjectionRequestProcessor$StaticInjection;->injectMembers()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/inject/internal/ContextualCallable",
        "<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Lcom/google/inject/internal/InjectionRequestProcessor$StaticInjection;


# direct methods
.method constructor <init>(Lcom/google/inject/internal/InjectionRequestProcessor$StaticInjection;)V
    .locals 0

    .prologue
    .line 110
    iput-object p1, p0, Lcom/google/inject/internal/InjectionRequestProcessor$StaticInjection$1;->this$1:Lcom/google/inject/internal/InjectionRequestProcessor$StaticInjection;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic call(Lcom/google/inject/internal/InternalContext;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/internal/InternalContext;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/ErrorsException;
        }
    .end annotation

    .prologue
    .line 110
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/InjectionRequestProcessor$StaticInjection$1;->call(Lcom/google/inject/internal/InternalContext;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public call(Lcom/google/inject/internal/InternalContext;)Ljava/lang/Void;
    .locals 5
    .param p1, "context"    # Lcom/google/inject/internal/InternalContext;

    .prologue
    const/4 v4, 0x0

    .line 112
    iget-object v2, p0, Lcom/google/inject/internal/InjectionRequestProcessor$StaticInjection$1;->this$1:Lcom/google/inject/internal/InjectionRequestProcessor$StaticInjection;

    iget-object v2, v2, Lcom/google/inject/internal/InjectionRequestProcessor$StaticInjection;->memberInjectors:Lcom/google/inject/internal/util/$ImmutableList;

    invoke-virtual {v2}, Lcom/google/inject/internal/util/$ImmutableList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/inject/internal/SingleMemberInjector;

    .line 115
    .local v1, "memberInjector":Lcom/google/inject/internal/SingleMemberInjector;
    iget-object v2, p0, Lcom/google/inject/internal/InjectionRequestProcessor$StaticInjection$1;->this$1:Lcom/google/inject/internal/InjectionRequestProcessor$StaticInjection;

    iget-object v2, v2, Lcom/google/inject/internal/InjectionRequestProcessor$StaticInjection;->injector:Lcom/google/inject/internal/InjectorImpl;

    iget-object v2, v2, Lcom/google/inject/internal/InjectorImpl;->options:Lcom/google/inject/internal/InjectorImpl$InjectorOptions;

    iget-object v2, v2, Lcom/google/inject/internal/InjectorImpl$InjectorOptions;->stage:Lcom/google/inject/Stage;

    sget-object v3, Lcom/google/inject/Stage;->TOOL:Lcom/google/inject/Stage;

    if-ne v2, v3, :cond_1

    invoke-interface {v1}, Lcom/google/inject/internal/SingleMemberInjector;->getInjectionPoint()Lcom/google/inject/spi/InjectionPoint;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/inject/spi/InjectionPoint;->isToolable()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 116
    :cond_1
    iget-object v2, p0, Lcom/google/inject/internal/InjectionRequestProcessor$StaticInjection$1;->this$1:Lcom/google/inject/internal/InjectionRequestProcessor$StaticInjection;

    iget-object v2, v2, Lcom/google/inject/internal/InjectionRequestProcessor$StaticInjection;->this$0:Lcom/google/inject/internal/InjectionRequestProcessor;

    iget-object v2, v2, Lcom/google/inject/internal/InjectionRequestProcessor;->errors:Lcom/google/inject/internal/Errors;

    invoke-interface {v1, v2, p1, v4}, Lcom/google/inject/internal/SingleMemberInjector;->inject(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/InternalContext;Ljava/lang/Object;)V

    goto :goto_0

    .line 119
    .end local v1    # "memberInjector":Lcom/google/inject/internal/SingleMemberInjector;
    :cond_2
    return-object v4
.end method
