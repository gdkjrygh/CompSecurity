.class Lcom/google/inject/internal/InjectorShell$Builder;
.super Ljava/lang/Object;
.source "InjectorShell.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/InjectorShell;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Builder"
.end annotation


# instance fields
.field private final elements:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/spi/Element;",
            ">;"
        }
    .end annotation
.end field

.field private final modules:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/Module;",
            ">;"
        }
    .end annotation
.end field

.field private options:Lcom/google/inject/internal/InjectorImpl$InjectorOptions;

.field private parent:Lcom/google/inject/internal/InjectorImpl;

.field private privateElements:Lcom/google/inject/internal/PrivateElementsImpl;

.field private stage:Lcom/google/inject/Stage;

.field private state:Lcom/google/inject/internal/State;


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    invoke-static {}, Lcom/google/inject/internal/util/$Lists;->newArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/InjectorShell$Builder;->elements:Ljava/util/List;

    .line 69
    invoke-static {}, Lcom/google/inject/internal/util/$Lists;->newArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/InjectorShell$Builder;->modules:Ljava/util/List;

    return-void
.end method

.method private getState()Lcom/google/inject/internal/State;
    .locals 2

    .prologue
    .line 196
    iget-object v0, p0, Lcom/google/inject/internal/InjectorShell$Builder;->state:Lcom/google/inject/internal/State;

    if-nez v0, :cond_0

    .line 197
    new-instance v0, Lcom/google/inject/internal/InheritingState;

    sget-object v1, Lcom/google/inject/internal/State;->NONE:Lcom/google/inject/internal/State;

    invoke-direct {v0, v1}, Lcom/google/inject/internal/InheritingState;-><init>(Lcom/google/inject/internal/State;)V

    iput-object v0, p0, Lcom/google/inject/internal/InjectorShell$Builder;->state:Lcom/google/inject/internal/State;

    .line 199
    :cond_0
    iget-object v0, p0, Lcom/google/inject/internal/InjectorShell$Builder;->state:Lcom/google/inject/internal/State;

    return-object v0
.end method


# virtual methods
.method addModules(Ljava/lang/Iterable;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable",
            "<+",
            "Lcom/google/inject/Module;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 101
    .local p1, "modules":Ljava/lang/Iterable;, "Ljava/lang/Iterable<+Lcom/google/inject/Module;>;"
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/inject/Module;

    .line 102
    .local v1, "module":Lcom/google/inject/Module;
    iget-object v2, p0, Lcom/google/inject/internal/InjectorShell$Builder;->modules:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 104
    .end local v1    # "module":Lcom/google/inject/Module;
    :cond_0
    return-void
.end method

.method build(Lcom/google/inject/internal/Initializer;Lcom/google/inject/internal/ProcessedBindingData;Lcom/google/inject/internal/util/$Stopwatch;Lcom/google/inject/internal/Errors;)Ljava/util/List;
    .locals 16
    .param p1, "initializer"    # Lcom/google/inject/internal/Initializer;
    .param p2, "bindingData"    # Lcom/google/inject/internal/ProcessedBindingData;
    .param p3, "stopwatch"    # Lcom/google/inject/internal/util/$Stopwatch;
    .param p4, "errors"    # Lcom/google/inject/internal/Errors;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/Initializer;",
            "Lcom/google/inject/internal/ProcessedBindingData;",
            "Lcom/google/inject/internal/util/$Stopwatch;",
            "Lcom/google/inject/internal/Errors;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/internal/InjectorShell;",
            ">;"
        }
    .end annotation

    .prologue
    .line 125
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/google/inject/internal/InjectorShell$Builder;->stage:Lcom/google/inject/Stage;

    if-eqz v11, :cond_4

    const/4 v11, 0x1

    :goto_0
    const-string v12, "Stage not initialized"

    invoke-static {v11, v12}, Lcom/google/inject/internal/util/$Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 126
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/google/inject/internal/InjectorShell$Builder;->privateElements:Lcom/google/inject/internal/PrivateElementsImpl;

    if-eqz v11, :cond_0

    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/google/inject/internal/InjectorShell$Builder;->parent:Lcom/google/inject/internal/InjectorImpl;

    if-eqz v11, :cond_5

    :cond_0
    const/4 v11, 0x1

    :goto_1
    const-string v12, "PrivateElements with no parent"

    invoke-static {v11, v12}, Lcom/google/inject/internal/util/$Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 127
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/google/inject/internal/InjectorShell$Builder;->state:Lcom/google/inject/internal/State;

    if-eqz v11, :cond_6

    const/4 v11, 0x1

    :goto_2
    const-string v12, "no state. Did you remember to lock() ?"

    invoke-static {v11, v12}, Lcom/google/inject/internal/util/$Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 130
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/google/inject/internal/InjectorShell$Builder;->parent:Lcom/google/inject/internal/InjectorImpl;

    if-nez v11, :cond_1

    .line 131
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/google/inject/internal/InjectorShell$Builder;->modules:Ljava/util/List;

    const/4 v12, 0x0

    new-instance v13, Lcom/google/inject/internal/InjectorShell$RootModule;

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/google/inject/internal/InjectorShell$Builder;->stage:Lcom/google/inject/Stage;

    const/4 v15, 0x0

    invoke-direct {v13, v14, v15}, Lcom/google/inject/internal/InjectorShell$RootModule;-><init>(Lcom/google/inject/Stage;Lcom/google/inject/internal/InjectorShell$1;)V

    invoke-interface {v11, v12, v13}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 133
    :cond_1
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/google/inject/internal/InjectorShell$Builder;->elements:Ljava/util/List;

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/google/inject/internal/InjectorShell$Builder;->stage:Lcom/google/inject/Stage;

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/google/inject/internal/InjectorShell$Builder;->modules:Ljava/util/List;

    invoke-static {v12, v13}, Lcom/google/inject/spi/Elements;->getElements(Lcom/google/inject/Stage;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 136
    new-instance v9, Lcom/google/inject/internal/InjectorOptionsProcessor;

    move-object/from16 v0, p4

    invoke-direct {v9, v0}, Lcom/google/inject/internal/InjectorOptionsProcessor;-><init>(Lcom/google/inject/internal/Errors;)V

    .line 137
    .local v9, "optionsProcessor":Lcom/google/inject/internal/InjectorOptionsProcessor;
    const/4 v11, 0x0

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/google/inject/internal/InjectorShell$Builder;->elements:Ljava/util/List;

    invoke-virtual {v9, v11, v12}, Lcom/google/inject/internal/InjectorOptionsProcessor;->process(Lcom/google/inject/internal/InjectorImpl;Ljava/util/List;)V

    .line 138
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/google/inject/internal/InjectorShell$Builder;->stage:Lcom/google/inject/Stage;

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/google/inject/internal/InjectorShell$Builder;->options:Lcom/google/inject/internal/InjectorImpl$InjectorOptions;

    invoke-virtual {v9, v11, v12}, Lcom/google/inject/internal/InjectorOptionsProcessor;->getOptions(Lcom/google/inject/Stage;Lcom/google/inject/internal/InjectorImpl$InjectorOptions;)Lcom/google/inject/internal/InjectorImpl$InjectorOptions;

    move-result-object v11

    move-object/from16 v0, p0

    iput-object v11, v0, Lcom/google/inject/internal/InjectorShell$Builder;->options:Lcom/google/inject/internal/InjectorImpl$InjectorOptions;

    .line 140
    new-instance v6, Lcom/google/inject/internal/InjectorImpl;

    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/google/inject/internal/InjectorShell$Builder;->parent:Lcom/google/inject/internal/InjectorImpl;

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/google/inject/internal/InjectorShell$Builder;->state:Lcom/google/inject/internal/State;

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/google/inject/internal/InjectorShell$Builder;->options:Lcom/google/inject/internal/InjectorImpl$InjectorOptions;

    invoke-direct {v6, v11, v12, v13}, Lcom/google/inject/internal/InjectorImpl;-><init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/internal/State;Lcom/google/inject/internal/InjectorImpl$InjectorOptions;)V

    .line 141
    .local v6, "injector":Lcom/google/inject/internal/InjectorImpl;
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/google/inject/internal/InjectorShell$Builder;->privateElements:Lcom/google/inject/internal/PrivateElementsImpl;

    if-eqz v11, :cond_2

    .line 142
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/google/inject/internal/InjectorShell$Builder;->privateElements:Lcom/google/inject/internal/PrivateElementsImpl;

    invoke-virtual {v11, v6}, Lcom/google/inject/internal/PrivateElementsImpl;->initInjector(Lcom/google/inject/Injector;)V

    .line 146
    :cond_2
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/google/inject/internal/InjectorShell$Builder;->parent:Lcom/google/inject/internal/InjectorImpl;

    if-nez v11, :cond_3

    .line 147
    new-instance v11, Lcom/google/inject/internal/TypeConverterBindingProcessor;

    move-object/from16 v0, p4

    invoke-direct {v11, v0}, Lcom/google/inject/internal/TypeConverterBindingProcessor;-><init>(Lcom/google/inject/internal/Errors;)V

    invoke-virtual {v11, v6}, Lcom/google/inject/internal/TypeConverterBindingProcessor;->prepareBuiltInConverters(Lcom/google/inject/internal/InjectorImpl;)V

    .line 150
    :cond_3
    const-string v11, "Module execution"

    move-object/from16 v0, p3

    invoke-virtual {v0, v11}, Lcom/google/inject/internal/util/$Stopwatch;->resetAndLog(Ljava/lang/String;)V

    .line 152
    new-instance v11, Lcom/google/inject/internal/MessageProcessor;

    move-object/from16 v0, p4

    invoke-direct {v11, v0}, Lcom/google/inject/internal/MessageProcessor;-><init>(Lcom/google/inject/internal/Errors;)V

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/google/inject/internal/InjectorShell$Builder;->elements:Ljava/util/List;

    invoke-virtual {v11, v6, v12}, Lcom/google/inject/internal/MessageProcessor;->process(Lcom/google/inject/internal/InjectorImpl;Ljava/util/List;)V

    .line 160
    new-instance v11, Lcom/google/inject/internal/TypeListenerBindingProcessor;

    move-object/from16 v0, p4

    invoke-direct {v11, v0}, Lcom/google/inject/internal/TypeListenerBindingProcessor;-><init>(Lcom/google/inject/internal/Errors;)V

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/google/inject/internal/InjectorShell$Builder;->elements:Ljava/util/List;

    invoke-virtual {v11, v6, v12}, Lcom/google/inject/internal/TypeListenerBindingProcessor;->process(Lcom/google/inject/internal/InjectorImpl;Ljava/util/List;)V

    .line 161
    iget-object v11, v6, Lcom/google/inject/internal/InjectorImpl;->state:Lcom/google/inject/internal/State;

    invoke-interface {v11}, Lcom/google/inject/internal/State;->getTypeListenerBindings()Ljava/util/List;

    move-result-object v8

    .line 162
    .local v8, "listenerBindings":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/spi/TypeListenerBinding;>;"
    new-instance v11, Lcom/google/inject/internal/MembersInjectorStore;

    invoke-direct {v11, v6, v8}, Lcom/google/inject/internal/MembersInjectorStore;-><init>(Lcom/google/inject/internal/InjectorImpl;Ljava/util/List;)V

    iput-object v11, v6, Lcom/google/inject/internal/InjectorImpl;->membersInjectorStore:Lcom/google/inject/internal/MembersInjectorStore;

    .line 163
    const-string v11, "TypeListeners creation"

    move-object/from16 v0, p3

    invoke-virtual {v0, v11}, Lcom/google/inject/internal/util/$Stopwatch;->resetAndLog(Ljava/lang/String;)V

    .line 165
    new-instance v11, Lcom/google/inject/internal/ScopeBindingProcessor;

    move-object/from16 v0, p4

    invoke-direct {v11, v0}, Lcom/google/inject/internal/ScopeBindingProcessor;-><init>(Lcom/google/inject/internal/Errors;)V

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/google/inject/internal/InjectorShell$Builder;->elements:Ljava/util/List;

    invoke-virtual {v11, v6, v12}, Lcom/google/inject/internal/ScopeBindingProcessor;->process(Lcom/google/inject/internal/InjectorImpl;Ljava/util/List;)V

    .line 166
    const-string v11, "Scopes creation"

    move-object/from16 v0, p3

    invoke-virtual {v0, v11}, Lcom/google/inject/internal/util/$Stopwatch;->resetAndLog(Ljava/lang/String;)V

    .line 168
    new-instance v11, Lcom/google/inject/internal/TypeConverterBindingProcessor;

    move-object/from16 v0, p4

    invoke-direct {v11, v0}, Lcom/google/inject/internal/TypeConverterBindingProcessor;-><init>(Lcom/google/inject/internal/Errors;)V

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/google/inject/internal/InjectorShell$Builder;->elements:Ljava/util/List;

    invoke-virtual {v11, v6, v12}, Lcom/google/inject/internal/TypeConverterBindingProcessor;->process(Lcom/google/inject/internal/InjectorImpl;Ljava/util/List;)V

    .line 169
    const-string v11, "Converters creation"

    move-object/from16 v0, p3

    invoke-virtual {v0, v11}, Lcom/google/inject/internal/util/$Stopwatch;->resetAndLog(Ljava/lang/String;)V

    .line 171
    # invokes: Lcom/google/inject/internal/InjectorShell;->bindInjector(Lcom/google/inject/internal/InjectorImpl;)V
    invoke-static {v6}, Lcom/google/inject/internal/InjectorShell;->access$100(Lcom/google/inject/internal/InjectorImpl;)V

    .line 172
    # invokes: Lcom/google/inject/internal/InjectorShell;->bindLogger(Lcom/google/inject/internal/InjectorImpl;)V
    invoke-static {v6}, Lcom/google/inject/internal/InjectorShell;->access$200(Lcom/google/inject/internal/InjectorImpl;)V

    .line 177
    new-instance v11, Lcom/google/inject/internal/BindingProcessor;

    move-object/from16 v0, p4

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct {v11, v0, v1, v2}, Lcom/google/inject/internal/BindingProcessor;-><init>(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/Initializer;Lcom/google/inject/internal/ProcessedBindingData;)V

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/google/inject/internal/InjectorShell$Builder;->elements:Ljava/util/List;

    invoke-virtual {v11, v6, v12}, Lcom/google/inject/internal/BindingProcessor;->process(Lcom/google/inject/internal/InjectorImpl;Ljava/util/List;)V

    .line 178
    new-instance v11, Lcom/google/inject/internal/UntargettedBindingProcessor;

    move-object/from16 v0, p4

    move-object/from16 v1, p2

    invoke-direct {v11, v0, v1}, Lcom/google/inject/internal/UntargettedBindingProcessor;-><init>(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/ProcessedBindingData;)V

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/google/inject/internal/InjectorShell$Builder;->elements:Ljava/util/List;

    invoke-virtual {v11, v6, v12}, Lcom/google/inject/internal/UntargettedBindingProcessor;->process(Lcom/google/inject/internal/InjectorImpl;Ljava/util/List;)V

    .line 179
    const-string v11, "Binding creation"

    move-object/from16 v0, p3

    invoke-virtual {v0, v11}, Lcom/google/inject/internal/util/$Stopwatch;->resetAndLog(Ljava/lang/String;)V

    .line 181
    invoke-static {}, Lcom/google/inject/internal/util/$Lists;->newArrayList()Ljava/util/ArrayList;

    move-result-object v7

    .line 182
    .local v7, "injectorShells":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/internal/InjectorShell;>;"
    new-instance v11, Lcom/google/inject/internal/InjectorShell;

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/google/inject/internal/InjectorShell$Builder;->elements:Ljava/util/List;

    const/4 v13, 0x0

    move-object/from16 v0, p0

    invoke-direct {v11, v0, v12, v6, v13}, Lcom/google/inject/internal/InjectorShell;-><init>(Lcom/google/inject/internal/InjectorShell$Builder;Ljava/util/List;Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/internal/InjectorShell$1;)V

    invoke-interface {v7, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 185
    new-instance v10, Lcom/google/inject/internal/PrivateElementProcessor;

    move-object/from16 v0, p4

    invoke-direct {v10, v0}, Lcom/google/inject/internal/PrivateElementProcessor;-><init>(Lcom/google/inject/internal/Errors;)V

    .line 186
    .local v10, "processor":Lcom/google/inject/internal/PrivateElementProcessor;
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/google/inject/internal/InjectorShell$Builder;->elements:Ljava/util/List;

    invoke-virtual {v10, v6, v11}, Lcom/google/inject/internal/PrivateElementProcessor;->process(Lcom/google/inject/internal/InjectorImpl;Ljava/util/List;)V

    .line 187
    invoke-virtual {v10}, Lcom/google/inject/internal/PrivateElementProcessor;->getInjectorShellBuilders()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .local v5, "i$":Ljava/util/Iterator;
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/inject/internal/InjectorShell$Builder;

    .line 188
    .local v4, "builder":Lcom/google/inject/internal/InjectorShell$Builder;
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/google/inject/internal/InjectorShell$Builder;->build(Lcom/google/inject/internal/Initializer;Lcom/google/inject/internal/ProcessedBindingData;Lcom/google/inject/internal/util/$Stopwatch;Lcom/google/inject/internal/Errors;)Ljava/util/List;

    move-result-object v11

    invoke-interface {v7, v11}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_3

    .line 125
    .end local v4    # "builder":Lcom/google/inject/internal/InjectorShell$Builder;
    .end local v5    # "i$":Ljava/util/Iterator;
    .end local v6    # "injector":Lcom/google/inject/internal/InjectorImpl;
    .end local v7    # "injectorShells":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/internal/InjectorShell;>;"
    .end local v8    # "listenerBindings":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/spi/TypeListenerBinding;>;"
    .end local v9    # "optionsProcessor":Lcom/google/inject/internal/InjectorOptionsProcessor;
    .end local v10    # "processor":Lcom/google/inject/internal/PrivateElementProcessor;
    :cond_4
    const/4 v11, 0x0

    goto/16 :goto_0

    .line 126
    :cond_5
    const/4 v11, 0x0

    goto/16 :goto_1

    .line 127
    :cond_6
    const/4 v11, 0x0

    goto/16 :goto_2

    .line 190
    .restart local v5    # "i$":Ljava/util/Iterator;
    .restart local v6    # "injector":Lcom/google/inject/internal/InjectorImpl;
    .restart local v7    # "injectorShells":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/internal/InjectorShell;>;"
    .restart local v8    # "listenerBindings":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/spi/TypeListenerBinding;>;"
    .restart local v9    # "optionsProcessor":Lcom/google/inject/internal/InjectorOptionsProcessor;
    .restart local v10    # "processor":Lcom/google/inject/internal/PrivateElementProcessor;
    :cond_7
    const-string v11, "Private environment creation"

    move-object/from16 v0, p3

    invoke-virtual {v0, v11}, Lcom/google/inject/internal/util/$Stopwatch;->resetAndLog(Ljava/lang/String;)V

    .line 192
    return-object v7
.end method

.method getStage()Lcom/google/inject/Stage;
    .locals 1

    .prologue
    .line 107
    iget-object v0, p0, Lcom/google/inject/internal/InjectorShell$Builder;->options:Lcom/google/inject/internal/InjectorImpl$InjectorOptions;

    iget-object v0, v0, Lcom/google/inject/internal/InjectorImpl$InjectorOptions;->stage:Lcom/google/inject/Stage;

    return-object v0
.end method

.method lock()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 112
    invoke-direct {p0}, Lcom/google/inject/internal/InjectorShell$Builder;->getState()Lcom/google/inject/internal/State;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/inject/internal/State;->lock()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method parent(Lcom/google/inject/internal/InjectorImpl;)Lcom/google/inject/internal/InjectorShell$Builder;
    .locals 2
    .param p1, "parent"    # Lcom/google/inject/internal/InjectorImpl;

    .prologue
    .line 87
    iput-object p1, p0, Lcom/google/inject/internal/InjectorShell$Builder;->parent:Lcom/google/inject/internal/InjectorImpl;

    .line 88
    new-instance v0, Lcom/google/inject/internal/InheritingState;

    iget-object v1, p1, Lcom/google/inject/internal/InjectorImpl;->state:Lcom/google/inject/internal/State;

    invoke-direct {v0, v1}, Lcom/google/inject/internal/InheritingState;-><init>(Lcom/google/inject/internal/State;)V

    iput-object v0, p0, Lcom/google/inject/internal/InjectorShell$Builder;->state:Lcom/google/inject/internal/State;

    .line 89
    iget-object v0, p1, Lcom/google/inject/internal/InjectorImpl;->options:Lcom/google/inject/internal/InjectorImpl$InjectorOptions;

    iput-object v0, p0, Lcom/google/inject/internal/InjectorShell$Builder;->options:Lcom/google/inject/internal/InjectorImpl$InjectorOptions;

    .line 90
    iget-object v0, p0, Lcom/google/inject/internal/InjectorShell$Builder;->options:Lcom/google/inject/internal/InjectorImpl$InjectorOptions;

    iget-object v0, v0, Lcom/google/inject/internal/InjectorImpl$InjectorOptions;->stage:Lcom/google/inject/Stage;

    iput-object v0, p0, Lcom/google/inject/internal/InjectorShell$Builder;->stage:Lcom/google/inject/Stage;

    .line 91
    return-object p0
.end method

.method privateElements(Lcom/google/inject/spi/PrivateElements;)Lcom/google/inject/internal/InjectorShell$Builder;
    .locals 2
    .param p1, "privateElements"    # Lcom/google/inject/spi/PrivateElements;

    .prologue
    .line 95
    move-object v0, p1

    check-cast v0, Lcom/google/inject/internal/PrivateElementsImpl;

    iput-object v0, p0, Lcom/google/inject/internal/InjectorShell$Builder;->privateElements:Lcom/google/inject/internal/PrivateElementsImpl;

    .line 96
    iget-object v0, p0, Lcom/google/inject/internal/InjectorShell$Builder;->elements:Ljava/util/List;

    invoke-interface {p1}, Lcom/google/inject/spi/PrivateElements;->getElements()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 97
    return-object p0
.end method

.method stage(Lcom/google/inject/Stage;)Lcom/google/inject/internal/InjectorShell$Builder;
    .locals 0
    .param p1, "stage"    # Lcom/google/inject/Stage;

    .prologue
    .line 82
    iput-object p1, p0, Lcom/google/inject/internal/InjectorShell$Builder;->stage:Lcom/google/inject/Stage;

    .line 83
    return-object p0
.end method
