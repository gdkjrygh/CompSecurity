.class public final Lcom/google/inject/internal/InternalInjectorCreator;
.super Ljava/lang/Object;
.source "InternalInjectorCreator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/inject/internal/InternalInjectorCreator$ToolStageInjector;
    }
.end annotation


# instance fields
.field private final bindingData:Lcom/google/inject/internal/ProcessedBindingData;

.field private final errors:Lcom/google/inject/internal/Errors;

.field private final initializer:Lcom/google/inject/internal/Initializer;

.field private final injectionRequestProcessor:Lcom/google/inject/internal/InjectionRequestProcessor;

.field private final shellBuilder:Lcom/google/inject/internal/InjectorShell$Builder;

.field private shells:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/internal/InjectorShell;",
            ">;"
        }
    .end annotation
.end field

.field private final stopwatch:Lcom/google/inject/internal/util/$Stopwatch;


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    new-instance v0, Lcom/google/inject/internal/util/$Stopwatch;

    invoke-direct {v0}, Lcom/google/inject/internal/util/$Stopwatch;-><init>()V

    iput-object v0, p0, Lcom/google/inject/internal/InternalInjectorCreator;->stopwatch:Lcom/google/inject/internal/util/$Stopwatch;

    .line 61
    new-instance v0, Lcom/google/inject/internal/Errors;

    invoke-direct {v0}, Lcom/google/inject/internal/Errors;-><init>()V

    iput-object v0, p0, Lcom/google/inject/internal/InternalInjectorCreator;->errors:Lcom/google/inject/internal/Errors;

    .line 63
    new-instance v0, Lcom/google/inject/internal/Initializer;

    invoke-direct {v0}, Lcom/google/inject/internal/Initializer;-><init>()V

    iput-object v0, p0, Lcom/google/inject/internal/InternalInjectorCreator;->initializer:Lcom/google/inject/internal/Initializer;

    .line 67
    new-instance v0, Lcom/google/inject/internal/InjectorShell$Builder;

    invoke-direct {v0}, Lcom/google/inject/internal/InjectorShell$Builder;-><init>()V

    iput-object v0, p0, Lcom/google/inject/internal/InternalInjectorCreator;->shellBuilder:Lcom/google/inject/internal/InjectorShell$Builder;

    .line 71
    new-instance v0, Lcom/google/inject/internal/InjectionRequestProcessor;

    iget-object v1, p0, Lcom/google/inject/internal/InternalInjectorCreator;->errors:Lcom/google/inject/internal/Errors;

    iget-object v2, p0, Lcom/google/inject/internal/InternalInjectorCreator;->initializer:Lcom/google/inject/internal/Initializer;

    invoke-direct {v0, v1, v2}, Lcom/google/inject/internal/InjectionRequestProcessor;-><init>(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/Initializer;)V

    iput-object v0, p0, Lcom/google/inject/internal/InternalInjectorCreator;->injectionRequestProcessor:Lcom/google/inject/internal/InjectionRequestProcessor;

    .line 72
    new-instance v0, Lcom/google/inject/internal/ProcessedBindingData;

    invoke-direct {v0}, Lcom/google/inject/internal/ProcessedBindingData;-><init>()V

    iput-object v0, p0, Lcom/google/inject/internal/InternalInjectorCreator;->bindingData:Lcom/google/inject/internal/ProcessedBindingData;

    .line 73
    return-void
.end method

.method private initializeStatically()V
    .locals 5

    .prologue
    .line 122
    iget-object v2, p0, Lcom/google/inject/internal/InternalInjectorCreator;->bindingData:Lcom/google/inject/internal/ProcessedBindingData;

    invoke-virtual {v2}, Lcom/google/inject/internal/ProcessedBindingData;->initializeBindings()V

    .line 123
    iget-object v2, p0, Lcom/google/inject/internal/InternalInjectorCreator;->stopwatch:Lcom/google/inject/internal/util/$Stopwatch;

    const-string v3, "Binding initialization"

    invoke-virtual {v2, v3}, Lcom/google/inject/internal/util/$Stopwatch;->resetAndLog(Ljava/lang/String;)V

    .line 125
    iget-object v2, p0, Lcom/google/inject/internal/InternalInjectorCreator;->shells:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/inject/internal/InjectorShell;

    .line 126
    .local v1, "shell":Lcom/google/inject/internal/InjectorShell;
    invoke-virtual {v1}, Lcom/google/inject/internal/InjectorShell;->getInjector()Lcom/google/inject/internal/InjectorImpl;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/inject/internal/InjectorImpl;->index()V

    goto :goto_0

    .line 128
    .end local v1    # "shell":Lcom/google/inject/internal/InjectorShell;
    :cond_0
    iget-object v2, p0, Lcom/google/inject/internal/InternalInjectorCreator;->stopwatch:Lcom/google/inject/internal/util/$Stopwatch;

    const-string v3, "Binding indexing"

    invoke-virtual {v2, v3}, Lcom/google/inject/internal/util/$Stopwatch;->resetAndLog(Ljava/lang/String;)V

    .line 130
    iget-object v2, p0, Lcom/google/inject/internal/InternalInjectorCreator;->injectionRequestProcessor:Lcom/google/inject/internal/InjectionRequestProcessor;

    iget-object v3, p0, Lcom/google/inject/internal/InternalInjectorCreator;->shells:Ljava/util/List;

    invoke-virtual {v2, v3}, Lcom/google/inject/internal/InjectionRequestProcessor;->process(Ljava/lang/Iterable;)V

    .line 131
    iget-object v2, p0, Lcom/google/inject/internal/InternalInjectorCreator;->stopwatch:Lcom/google/inject/internal/util/$Stopwatch;

    const-string v3, "Collecting injection requests"

    invoke-virtual {v2, v3}, Lcom/google/inject/internal/util/$Stopwatch;->resetAndLog(Ljava/lang/String;)V

    .line 133
    iget-object v2, p0, Lcom/google/inject/internal/InternalInjectorCreator;->bindingData:Lcom/google/inject/internal/ProcessedBindingData;

    iget-object v3, p0, Lcom/google/inject/internal/InternalInjectorCreator;->errors:Lcom/google/inject/internal/Errors;

    invoke-virtual {v2, v3}, Lcom/google/inject/internal/ProcessedBindingData;->runCreationListeners(Lcom/google/inject/internal/Errors;)V

    .line 134
    iget-object v2, p0, Lcom/google/inject/internal/InternalInjectorCreator;->stopwatch:Lcom/google/inject/internal/util/$Stopwatch;

    const-string v3, "Binding validation"

    invoke-virtual {v2, v3}, Lcom/google/inject/internal/util/$Stopwatch;->resetAndLog(Ljava/lang/String;)V

    .line 136
    iget-object v2, p0, Lcom/google/inject/internal/InternalInjectorCreator;->injectionRequestProcessor:Lcom/google/inject/internal/InjectionRequestProcessor;

    invoke-virtual {v2}, Lcom/google/inject/internal/InjectionRequestProcessor;->validate()V

    .line 137
    iget-object v2, p0, Lcom/google/inject/internal/InternalInjectorCreator;->stopwatch:Lcom/google/inject/internal/util/$Stopwatch;

    const-string v3, "Static validation"

    invoke-virtual {v2, v3}, Lcom/google/inject/internal/util/$Stopwatch;->resetAndLog(Ljava/lang/String;)V

    .line 139
    iget-object v2, p0, Lcom/google/inject/internal/InternalInjectorCreator;->initializer:Lcom/google/inject/internal/Initializer;

    iget-object v3, p0, Lcom/google/inject/internal/InternalInjectorCreator;->errors:Lcom/google/inject/internal/Errors;

    invoke-virtual {v2, v3}, Lcom/google/inject/internal/Initializer;->validateOustandingInjections(Lcom/google/inject/internal/Errors;)V

    .line 140
    iget-object v2, p0, Lcom/google/inject/internal/InternalInjectorCreator;->stopwatch:Lcom/google/inject/internal/util/$Stopwatch;

    const-string v3, "Instance member validation"

    invoke-virtual {v2, v3}, Lcom/google/inject/internal/util/$Stopwatch;->resetAndLog(Ljava/lang/String;)V

    .line 142
    new-instance v2, Lcom/google/inject/internal/LookupProcessor;

    iget-object v3, p0, Lcom/google/inject/internal/InternalInjectorCreator;->errors:Lcom/google/inject/internal/Errors;

    invoke-direct {v2, v3}, Lcom/google/inject/internal/LookupProcessor;-><init>(Lcom/google/inject/internal/Errors;)V

    iget-object v3, p0, Lcom/google/inject/internal/InternalInjectorCreator;->shells:Ljava/util/List;

    invoke-virtual {v2, v3}, Lcom/google/inject/internal/LookupProcessor;->process(Ljava/lang/Iterable;)V

    .line 143
    iget-object v2, p0, Lcom/google/inject/internal/InternalInjectorCreator;->shells:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/inject/internal/InjectorShell;

    .line 144
    .restart local v1    # "shell":Lcom/google/inject/internal/InjectorShell;
    invoke-virtual {v1}, Lcom/google/inject/internal/InjectorShell;->getInjector()Lcom/google/inject/internal/InjectorImpl;

    move-result-object v2

    iget-object v2, v2, Lcom/google/inject/internal/InjectorImpl;->lookups:Lcom/google/inject/internal/Lookups;

    check-cast v2, Lcom/google/inject/internal/DeferredLookups;

    iget-object v3, p0, Lcom/google/inject/internal/InternalInjectorCreator;->errors:Lcom/google/inject/internal/Errors;

    invoke-virtual {v2, v3}, Lcom/google/inject/internal/DeferredLookups;->initialize(Lcom/google/inject/internal/Errors;)V

    goto :goto_1

    .line 146
    .end local v1    # "shell":Lcom/google/inject/internal/InjectorShell;
    :cond_1
    iget-object v2, p0, Lcom/google/inject/internal/InternalInjectorCreator;->stopwatch:Lcom/google/inject/internal/util/$Stopwatch;

    const-string v3, "Provider verification"

    invoke-virtual {v2, v3}, Lcom/google/inject/internal/util/$Stopwatch;->resetAndLog(Ljava/lang/String;)V

    .line 148
    iget-object v2, p0, Lcom/google/inject/internal/InternalInjectorCreator;->shells:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/inject/internal/InjectorShell;

    .line 149
    .restart local v1    # "shell":Lcom/google/inject/internal/InjectorShell;
    invoke-virtual {v1}, Lcom/google/inject/internal/InjectorShell;->getElements()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    .line 150
    new-instance v2, Ljava/lang/AssertionError;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Failed to execute "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v1}, Lcom/google/inject/internal/InjectorShell;->getElements()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v2

    .line 154
    .end local v1    # "shell":Lcom/google/inject/internal/InjectorShell;
    :cond_3
    iget-object v2, p0, Lcom/google/inject/internal/InternalInjectorCreator;->errors:Lcom/google/inject/internal/Errors;

    invoke-virtual {v2}, Lcom/google/inject/internal/Errors;->throwCreationExceptionIfErrorsExist()V

    .line 155
    return-void
.end method

.method private injectDynamically()V
    .locals 5

    .prologue
    .line 170
    iget-object v2, p0, Lcom/google/inject/internal/InternalInjectorCreator;->injectionRequestProcessor:Lcom/google/inject/internal/InjectionRequestProcessor;

    invoke-virtual {v2}, Lcom/google/inject/internal/InjectionRequestProcessor;->injectMembers()V

    .line 171
    iget-object v2, p0, Lcom/google/inject/internal/InternalInjectorCreator;->stopwatch:Lcom/google/inject/internal/util/$Stopwatch;

    const-string v3, "Static member injection"

    invoke-virtual {v2, v3}, Lcom/google/inject/internal/util/$Stopwatch;->resetAndLog(Ljava/lang/String;)V

    .line 173
    iget-object v2, p0, Lcom/google/inject/internal/InternalInjectorCreator;->initializer:Lcom/google/inject/internal/Initializer;

    iget-object v3, p0, Lcom/google/inject/internal/InternalInjectorCreator;->errors:Lcom/google/inject/internal/Errors;

    invoke-virtual {v2, v3}, Lcom/google/inject/internal/Initializer;->injectAll(Lcom/google/inject/internal/Errors;)V

    .line 174
    iget-object v2, p0, Lcom/google/inject/internal/InternalInjectorCreator;->stopwatch:Lcom/google/inject/internal/util/$Stopwatch;

    const-string v3, "Instance injection"

    invoke-virtual {v2, v3}, Lcom/google/inject/internal/util/$Stopwatch;->resetAndLog(Ljava/lang/String;)V

    .line 175
    iget-object v2, p0, Lcom/google/inject/internal/InternalInjectorCreator;->errors:Lcom/google/inject/internal/Errors;

    invoke-virtual {v2}, Lcom/google/inject/internal/Errors;->throwCreationExceptionIfErrorsExist()V

    .line 177
    iget-object v2, p0, Lcom/google/inject/internal/InternalInjectorCreator;->shellBuilder:Lcom/google/inject/internal/InjectorShell$Builder;

    invoke-virtual {v2}, Lcom/google/inject/internal/InjectorShell$Builder;->getStage()Lcom/google/inject/Stage;

    move-result-object v2

    sget-object v3, Lcom/google/inject/Stage;->TOOL:Lcom/google/inject/Stage;

    if-eq v2, v3, :cond_1

    .line 178
    iget-object v2, p0, Lcom/google/inject/internal/InternalInjectorCreator;->shells:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/inject/internal/InjectorShell;

    .line 179
    .local v1, "shell":Lcom/google/inject/internal/InjectorShell;
    invoke-virtual {v1}, Lcom/google/inject/internal/InjectorShell;->getInjector()Lcom/google/inject/internal/InjectorImpl;

    move-result-object v2

    iget-object v3, p0, Lcom/google/inject/internal/InternalInjectorCreator;->shellBuilder:Lcom/google/inject/internal/InjectorShell$Builder;

    invoke-virtual {v3}, Lcom/google/inject/internal/InjectorShell$Builder;->getStage()Lcom/google/inject/Stage;

    move-result-object v3

    iget-object v4, p0, Lcom/google/inject/internal/InternalInjectorCreator;->errors:Lcom/google/inject/internal/Errors;

    invoke-virtual {p0, v2, v3, v4}, Lcom/google/inject/internal/InternalInjectorCreator;->loadEagerSingletons(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Stage;Lcom/google/inject/internal/Errors;)V

    goto :goto_0

    .line 181
    .end local v1    # "shell":Lcom/google/inject/internal/InjectorShell;
    :cond_0
    iget-object v2, p0, Lcom/google/inject/internal/InternalInjectorCreator;->stopwatch:Lcom/google/inject/internal/util/$Stopwatch;

    const-string v3, "Preloading singletons"

    invoke-virtual {v2, v3}, Lcom/google/inject/internal/util/$Stopwatch;->resetAndLog(Ljava/lang/String;)V

    .line 183
    .end local v0    # "i$":Ljava/util/Iterator;
    :cond_1
    iget-object v2, p0, Lcom/google/inject/internal/InternalInjectorCreator;->errors:Lcom/google/inject/internal/Errors;

    invoke-virtual {v2}, Lcom/google/inject/internal/Errors;->throwCreationExceptionIfErrorsExist()V

    .line 184
    return-void
.end method

.method private isEagerSingleton(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/internal/BindingImpl;Lcom/google/inject/Stage;)Z
    .locals 2
    .param p1, "injector"    # Lcom/google/inject/internal/InjectorImpl;
    .param p3, "stage"    # Lcom/google/inject/Stage;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/InjectorImpl;",
            "Lcom/google/inject/internal/BindingImpl",
            "<*>;",
            "Lcom/google/inject/Stage;",
            ")Z"
        }
    .end annotation

    .prologue
    .line 222
    .local p2, "binding":Lcom/google/inject/internal/BindingImpl;, "Lcom/google/inject/internal/BindingImpl<*>;"
    invoke-virtual {p2}, Lcom/google/inject/internal/BindingImpl;->getScoping()Lcom/google/inject/internal/Scoping;

    move-result-object v1

    invoke-virtual {v1, p3}, Lcom/google/inject/internal/Scoping;->isEagerSingleton(Lcom/google/inject/Stage;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 223
    const/4 v1, 0x1

    .line 234
    .end local p2    # "binding":Lcom/google/inject/internal/BindingImpl;, "Lcom/google/inject/internal/BindingImpl<*>;"
    :goto_0
    return v1

    .line 229
    .restart local p2    # "binding":Lcom/google/inject/internal/BindingImpl;, "Lcom/google/inject/internal/BindingImpl<*>;"
    :cond_0
    instance-of v1, p2, Lcom/google/inject/internal/LinkedBindingImpl;

    if-eqz v1, :cond_1

    .line 230
    check-cast p2, Lcom/google/inject/internal/LinkedBindingImpl;

    .end local p2    # "binding":Lcom/google/inject/internal/BindingImpl;, "Lcom/google/inject/internal/BindingImpl<*>;"
    invoke-virtual {p2}, Lcom/google/inject/internal/LinkedBindingImpl;->getLinkedKey()Lcom/google/inject/Key;

    move-result-object v0

    .line 231
    .local v0, "linkedBinding":Lcom/google/inject/Key;, "Lcom/google/inject/Key<*>;"
    invoke-virtual {p1, v0}, Lcom/google/inject/internal/InjectorImpl;->getBinding(Lcom/google/inject/Key;)Lcom/google/inject/internal/BindingImpl;

    move-result-object v1

    invoke-direct {p0, p1, v1, p3}, Lcom/google/inject/internal/InternalInjectorCreator;->isEagerSingleton(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/internal/BindingImpl;Lcom/google/inject/Stage;)Z

    move-result v1

    goto :goto_0

    .line 234
    .end local v0    # "linkedBinding":Lcom/google/inject/Key;, "Lcom/google/inject/Key<*>;"
    .restart local p2    # "binding":Lcom/google/inject/internal/BindingImpl;, "Lcom/google/inject/internal/BindingImpl<*>;"
    :cond_1
    const/4 v1, 0x0

    goto :goto_0
.end method

.method private primaryInjector()Lcom/google/inject/Injector;
    .locals 2

    .prologue
    .line 161
    iget-object v0, p0, Lcom/google/inject/internal/InternalInjectorCreator;->shells:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/internal/InjectorShell;

    invoke-virtual {v0}, Lcom/google/inject/internal/InjectorShell;->getInjector()Lcom/google/inject/internal/InjectorImpl;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public addModules(Ljava/lang/Iterable;)Lcom/google/inject/internal/InternalInjectorCreator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable",
            "<+",
            "Lcom/google/inject/Module;",
            ">;)",
            "Lcom/google/inject/internal/InternalInjectorCreator;"
        }
    .end annotation

    .prologue
    .line 91
    .local p1, "modules":Ljava/lang/Iterable;, "Ljava/lang/Iterable<+Lcom/google/inject/Module;>;"
    iget-object v0, p0, Lcom/google/inject/internal/InternalInjectorCreator;->shellBuilder:Lcom/google/inject/internal/InjectorShell$Builder;

    invoke-virtual {v0, p1}, Lcom/google/inject/internal/InjectorShell$Builder;->addModules(Ljava/lang/Iterable;)V

    .line 92
    return-object p0
.end method

.method public build()Lcom/google/inject/Injector;
    .locals 6

    .prologue
    .line 96
    iget-object v0, p0, Lcom/google/inject/internal/InternalInjectorCreator;->shellBuilder:Lcom/google/inject/internal/InjectorShell$Builder;

    if-nez v0, :cond_0

    .line 97
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Already built, builders are not reusable."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 102
    :cond_0
    iget-object v0, p0, Lcom/google/inject/internal/InternalInjectorCreator;->shellBuilder:Lcom/google/inject/internal/InjectorShell$Builder;

    invoke-virtual {v0}, Lcom/google/inject/internal/InjectorShell$Builder;->lock()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 103
    :try_start_0
    iget-object v0, p0, Lcom/google/inject/internal/InternalInjectorCreator;->shellBuilder:Lcom/google/inject/internal/InjectorShell$Builder;

    iget-object v2, p0, Lcom/google/inject/internal/InternalInjectorCreator;->initializer:Lcom/google/inject/internal/Initializer;

    iget-object v3, p0, Lcom/google/inject/internal/InternalInjectorCreator;->bindingData:Lcom/google/inject/internal/ProcessedBindingData;

    iget-object v4, p0, Lcom/google/inject/internal/InternalInjectorCreator;->stopwatch:Lcom/google/inject/internal/util/$Stopwatch;

    iget-object v5, p0, Lcom/google/inject/internal/InternalInjectorCreator;->errors:Lcom/google/inject/internal/Errors;

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/google/inject/internal/InjectorShell$Builder;->build(Lcom/google/inject/internal/Initializer;Lcom/google/inject/internal/ProcessedBindingData;Lcom/google/inject/internal/util/$Stopwatch;Lcom/google/inject/internal/Errors;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/InternalInjectorCreator;->shells:Ljava/util/List;

    .line 104
    iget-object v0, p0, Lcom/google/inject/internal/InternalInjectorCreator;->stopwatch:Lcom/google/inject/internal/util/$Stopwatch;

    const-string v2, "Injector construction"

    invoke-virtual {v0, v2}, Lcom/google/inject/internal/util/$Stopwatch;->resetAndLog(Ljava/lang/String;)V

    .line 106
    invoke-direct {p0}, Lcom/google/inject/internal/InternalInjectorCreator;->initializeStatically()V

    .line 107
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    invoke-direct {p0}, Lcom/google/inject/internal/InternalInjectorCreator;->injectDynamically()V

    .line 111
    iget-object v0, p0, Lcom/google/inject/internal/InternalInjectorCreator;->shellBuilder:Lcom/google/inject/internal/InjectorShell$Builder;

    invoke-virtual {v0}, Lcom/google/inject/internal/InjectorShell$Builder;->getStage()Lcom/google/inject/Stage;

    move-result-object v0

    sget-object v1, Lcom/google/inject/Stage;->TOOL:Lcom/google/inject/Stage;

    if-ne v0, v1, :cond_1

    .line 114
    new-instance v0, Lcom/google/inject/internal/InternalInjectorCreator$ToolStageInjector;

    invoke-direct {p0}, Lcom/google/inject/internal/InternalInjectorCreator;->primaryInjector()Lcom/google/inject/Injector;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/inject/internal/InternalInjectorCreator$ToolStageInjector;-><init>(Lcom/google/inject/Injector;)V

    .line 116
    :goto_0
    return-object v0

    .line 107
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 116
    :cond_1
    invoke-direct {p0}, Lcom/google/inject/internal/InternalInjectorCreator;->primaryInjector()Lcom/google/inject/Injector;

    move-result-object v0

    goto :goto_0
.end method

.method loadEagerSingletons(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/Stage;Lcom/google/inject/internal/Errors;)V
    .locals 6
    .param p1, "injector"    # Lcom/google/inject/internal/InjectorImpl;
    .param p2, "stage"    # Lcom/google/inject/Stage;
    .param p3, "errors"    # Lcom/google/inject/internal/Errors;

    .prologue
    .line 192
    iget-object v4, p1, Lcom/google/inject/internal/InjectorImpl;->state:Lcom/google/inject/internal/State;

    invoke-interface {v4}, Lcom/google/inject/internal/State;->getExplicitBindingsThisLevel()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v4

    iget-object v5, p1, Lcom/google/inject/internal/InjectorImpl;->jitBindings:Ljava/util/Map;

    invoke-interface {v5}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/google/inject/internal/util/$Iterables;->concat(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/lang/Iterable;

    move-result-object v4

    invoke-static {v4}, Lcom/google/inject/internal/util/$ImmutableList;->copyOf(Ljava/lang/Iterable;)Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v1

    .line 195
    .local v1, "candidateBindings":Ljava/lang/Iterable;, "Ljava/lang/Iterable<Lcom/google/inject/internal/BindingImpl<*>;>;"
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .local v3, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/internal/BindingImpl;

    .line 196
    .local v0, "binding":Lcom/google/inject/internal/BindingImpl;, "Lcom/google/inject/internal/BindingImpl<*>;"
    invoke-direct {p0, p1, v0, p2}, Lcom/google/inject/internal/InternalInjectorCreator;->isEagerSingleton(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/internal/BindingImpl;Lcom/google/inject/Stage;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 198
    :try_start_0
    new-instance v4, Lcom/google/inject/internal/InternalInjectorCreator$1;

    invoke-direct {v4, p0, v0, p3}, Lcom/google/inject/internal/InternalInjectorCreator$1;-><init>(Lcom/google/inject/internal/InternalInjectorCreator;Lcom/google/inject/internal/BindingImpl;Lcom/google/inject/internal/Errors;)V

    invoke-virtual {p1, v4}, Lcom/google/inject/internal/InjectorImpl;->callInContext(Lcom/google/inject/internal/ContextualCallable;)Ljava/lang/Object;
    :try_end_0
    .catch Lcom/google/inject/internal/ErrorsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 214
    :catch_0
    move-exception v2

    .line 215
    .local v2, "e":Lcom/google/inject/internal/ErrorsException;
    new-instance v4, Ljava/lang/AssertionError;

    invoke-direct {v4}, Ljava/lang/AssertionError;-><init>()V

    throw v4

    .line 219
    .end local v0    # "binding":Lcom/google/inject/internal/BindingImpl;, "Lcom/google/inject/internal/BindingImpl<*>;"
    .end local v2    # "e":Lcom/google/inject/internal/ErrorsException;
    :cond_1
    return-void
.end method

.method public parentInjector(Lcom/google/inject/internal/InjectorImpl;)Lcom/google/inject/internal/InternalInjectorCreator;
    .locals 1
    .param p1, "parent"    # Lcom/google/inject/internal/InjectorImpl;

    .prologue
    .line 86
    iget-object v0, p0, Lcom/google/inject/internal/InternalInjectorCreator;->shellBuilder:Lcom/google/inject/internal/InjectorShell$Builder;

    invoke-virtual {v0, p1}, Lcom/google/inject/internal/InjectorShell$Builder;->parent(Lcom/google/inject/internal/InjectorImpl;)Lcom/google/inject/internal/InjectorShell$Builder;

    .line 87
    return-object p0
.end method

.method public stage(Lcom/google/inject/Stage;)Lcom/google/inject/internal/InternalInjectorCreator;
    .locals 1
    .param p1, "stage"    # Lcom/google/inject/Stage;

    .prologue
    .line 76
    iget-object v0, p0, Lcom/google/inject/internal/InternalInjectorCreator;->shellBuilder:Lcom/google/inject/internal/InjectorShell$Builder;

    invoke-virtual {v0, p1}, Lcom/google/inject/internal/InjectorShell$Builder;->stage(Lcom/google/inject/Stage;)Lcom/google/inject/internal/InjectorShell$Builder;

    .line 77
    return-object p0
.end method
