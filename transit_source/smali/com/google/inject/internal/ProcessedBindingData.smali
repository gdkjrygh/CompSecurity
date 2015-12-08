.class Lcom/google/inject/internal/ProcessedBindingData;
.super Ljava/lang/Object;
.source "ProcessedBindingData.java"


# instance fields
.field private final creationListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/internal/CreationListener;",
            ">;"
        }
    .end annotation
.end field

.field private final uninitializedBindings:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    invoke-static {}, Lcom/google/inject/internal/util/$Lists;->newArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/ProcessedBindingData;->creationListeners:Ljava/util/List;

    .line 32
    invoke-static {}, Lcom/google/inject/internal/util/$Lists;->newArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/ProcessedBindingData;->uninitializedBindings:Ljava/util/List;

    return-void
.end method


# virtual methods
.method addCreationListener(Lcom/google/inject/internal/CreationListener;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/inject/internal/CreationListener;

    .prologue
    .line 35
    iget-object v0, p0, Lcom/google/inject/internal/ProcessedBindingData;->creationListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    return-void
.end method

.method addUninitializedBinding(Ljava/lang/Runnable;)V
    .locals 1
    .param p1, "runnable"    # Ljava/lang/Runnable;

    .prologue
    .line 39
    iget-object v0, p0, Lcom/google/inject/internal/ProcessedBindingData;->uninitializedBindings:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    return-void
.end method

.method initializeBindings()V
    .locals 3

    .prologue
    .line 43
    iget-object v2, p0, Lcom/google/inject/internal/ProcessedBindingData;->uninitializedBindings:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    .line 44
    .local v1, "initializer":Ljava/lang/Runnable;
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 46
    .end local v1    # "initializer":Ljava/lang/Runnable;
    :cond_0
    return-void
.end method

.method runCreationListeners(Lcom/google/inject/internal/Errors;)V
    .locals 3
    .param p1, "errors"    # Lcom/google/inject/internal/Errors;

    .prologue
    .line 49
    iget-object v2, p0, Lcom/google/inject/internal/ProcessedBindingData;->creationListeners:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/internal/CreationListener;

    .line 50
    .local v0, "creationListener":Lcom/google/inject/internal/CreationListener;
    invoke-interface {v0, p1}, Lcom/google/inject/internal/CreationListener;->notify(Lcom/google/inject/internal/Errors;)V

    goto :goto_0

    .line 52
    .end local v0    # "creationListener":Lcom/google/inject/internal/CreationListener;
    :cond_0
    return-void
.end method
