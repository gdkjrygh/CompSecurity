.class public Lroboguice/inject/ContextScopedRoboInjector;
.super Ljava/lang/Object;
.source "ContextScopedRoboInjector.java"

# interfaces
.implements Lroboguice/inject/RoboInjector;


# instance fields
.field protected context:Landroid/content/Context;

.field protected delegate:Lcom/google/inject/Injector;

.field protected scope:Lroboguice/inject/ContextScope;

.field protected viewListener:Lroboguice/inject/ViewListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/inject/Injector;Lroboguice/inject/ViewListener;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "applicationInjector"    # Lcom/google/inject/Injector;
    .param p3, "viewListener"    # Lroboguice/inject/ViewListener;

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p2, p0, Lroboguice/inject/ContextScopedRoboInjector;->delegate:Lcom/google/inject/Injector;

    .line 25
    iput-object p1, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    .line 26
    iput-object p3, p0, Lroboguice/inject/ContextScopedRoboInjector;->viewListener:Lroboguice/inject/ViewListener;

    .line 27
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->delegate:Lcom/google/inject/Injector;

    const-class v1, Lroboguice/inject/ContextScope;

    invoke-interface {v0, v1}, Lcom/google/inject/Injector;->getInstance(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lroboguice/inject/ContextScope;

    iput-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    .line 28
    return-void
.end method


# virtual methods
.method public createChildInjector(Ljava/lang/Iterable;)Lcom/google/inject/Injector;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable",
            "<+",
            "Lcom/google/inject/Module;",
            ">;)",
            "Lcom/google/inject/Injector;"
        }
    .end annotation

    .prologue
    .line 32
    .local p1, "modules":Ljava/lang/Iterable;, "Ljava/lang/Iterable<+Lcom/google/inject/Module;>;"
    const-class v1, Lroboguice/inject/ContextScope;

    monitor-enter v1

    .line 33
    :try_start_0
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lroboguice/inject/ContextScope;->enter(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 35
    :try_start_1
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->delegate:Lcom/google/inject/Injector;

    invoke-interface {v0, p1}, Lcom/google/inject/Injector;->createChildInjector(Ljava/lang/Iterable;)Lcom/google/inject/Injector;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 37
    :try_start_2
    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    throw v0

    .line 39
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method

.method public varargs createChildInjector([Lcom/google/inject/Module;)Lcom/google/inject/Injector;
    .locals 4
    .param p1, "modules"    # [Lcom/google/inject/Module;

    .prologue
    .line 44
    const-class v1, Lroboguice/inject/ContextScope;

    monitor-enter v1

    .line 45
    :try_start_0
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lroboguice/inject/ContextScope;->enter(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 47
    :try_start_1
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->delegate:Lcom/google/inject/Injector;

    invoke-interface {v0, p1}, Lcom/google/inject/Injector;->createChildInjector([Lcom/google/inject/Module;)Lcom/google/inject/Injector;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 49
    :try_start_2
    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    throw v0

    .line 51
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method

.method public findBindingsByType(Lcom/google/inject/TypeLiteral;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/TypeLiteral",
            "<TT;>;)",
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/Binding",
            "<TT;>;>;"
        }
    .end annotation

    .prologue
    .line 56
    .local p1, "type":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<TT;>;"
    const-class v1, Lroboguice/inject/ContextScope;

    monitor-enter v1

    .line 57
    :try_start_0
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lroboguice/inject/ContextScope;->enter(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 59
    :try_start_1
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->delegate:Lcom/google/inject/Injector;

    invoke-interface {v0, p1}, Lcom/google/inject/Injector;->findBindingsByType(Lcom/google/inject/TypeLiteral;)Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 61
    :try_start_2
    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    throw v0

    .line 63
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method

.method public getAllBindings()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Lcom/google/inject/Key",
            "<*>;",
            "Lcom/google/inject/Binding",
            "<*>;>;"
        }
    .end annotation

    .prologue
    .line 68
    const-class v1, Lroboguice/inject/ContextScope;

    monitor-enter v1

    .line 69
    :try_start_0
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lroboguice/inject/ContextScope;->enter(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 71
    :try_start_1
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->delegate:Lcom/google/inject/Injector;

    invoke-interface {v0}, Lcom/google/inject/Injector;->getAllBindings()Ljava/util/Map;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 73
    :try_start_2
    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    throw v0

    .line 75
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method

.method public getBinding(Lcom/google/inject/Key;)Lcom/google/inject/Binding;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/Key",
            "<TT;>;)",
            "Lcom/google/inject/Binding",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 80
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<TT;>;"
    const-class v1, Lroboguice/inject/ContextScope;

    monitor-enter v1

    .line 81
    :try_start_0
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lroboguice/inject/ContextScope;->enter(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 83
    :try_start_1
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->delegate:Lcom/google/inject/Injector;

    invoke-interface {v0, p1}, Lcom/google/inject/Injector;->getBinding(Lcom/google/inject/Key;)Lcom/google/inject/Binding;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 85
    :try_start_2
    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    throw v0

    .line 87
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method

.method public getBinding(Ljava/lang/Class;)Lcom/google/inject/Binding;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Lcom/google/inject/Binding",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 92
    .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    const-class v1, Lroboguice/inject/ContextScope;

    monitor-enter v1

    .line 93
    :try_start_0
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lroboguice/inject/ContextScope;->enter(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 95
    :try_start_1
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->delegate:Lcom/google/inject/Injector;

    invoke-interface {v0, p1}, Lcom/google/inject/Injector;->getBinding(Ljava/lang/Class;)Lcom/google/inject/Binding;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 97
    :try_start_2
    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    throw v0

    .line 99
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method

.method public getBindings()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Lcom/google/inject/Key",
            "<*>;",
            "Lcom/google/inject/Binding",
            "<*>;>;"
        }
    .end annotation

    .prologue
    .line 104
    const-class v1, Lroboguice/inject/ContextScope;

    monitor-enter v1

    .line 105
    :try_start_0
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lroboguice/inject/ContextScope;->enter(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 107
    :try_start_1
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->delegate:Lcom/google/inject/Injector;

    invoke-interface {v0}, Lcom/google/inject/Injector;->getBindings()Ljava/util/Map;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 109
    :try_start_2
    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    throw v0

    .line 111
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method

.method public getExistingBinding(Lcom/google/inject/Key;)Lcom/google/inject/Binding;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/Key",
            "<TT;>;)",
            "Lcom/google/inject/Binding",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 116
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<TT;>;"
    const-class v1, Lroboguice/inject/ContextScope;

    monitor-enter v1

    .line 117
    :try_start_0
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lroboguice/inject/ContextScope;->enter(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 119
    :try_start_1
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->delegate:Lcom/google/inject/Injector;

    invoke-interface {v0, p1}, Lcom/google/inject/Injector;->getExistingBinding(Lcom/google/inject/Key;)Lcom/google/inject/Binding;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 121
    :try_start_2
    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    throw v0

    .line 123
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method

.method public getInstance(Lcom/google/inject/Key;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/Key",
            "<TT;>;)TT;"
        }
    .end annotation

    .prologue
    .line 128
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<TT;>;"
    const-class v1, Lroboguice/inject/ContextScope;

    monitor-enter v1

    .line 129
    :try_start_0
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lroboguice/inject/ContextScope;->enter(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 131
    :try_start_1
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->delegate:Lcom/google/inject/Injector;

    invoke-interface {v0, p1}, Lcom/google/inject/Injector;->getInstance(Lcom/google/inject/Key;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 133
    :try_start_2
    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    throw v0

    .line 135
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method

.method public getInstance(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation

    .prologue
    .line 140
    .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    const-class v1, Lroboguice/inject/ContextScope;

    monitor-enter v1

    .line 141
    :try_start_0
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lroboguice/inject/ContextScope;->enter(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 143
    :try_start_1
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->delegate:Lcom/google/inject/Injector;

    invoke-interface {v0, p1}, Lcom/google/inject/Injector;->getInstance(Ljava/lang/Class;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 145
    :try_start_2
    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    throw v0

    .line 147
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method

.method public getMembersInjector(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/MembersInjector;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/TypeLiteral",
            "<TT;>;)",
            "Lcom/google/inject/MembersInjector",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 164
    .local p1, "typeLiteral":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<TT;>;"
    const-class v1, Lroboguice/inject/ContextScope;

    monitor-enter v1

    .line 165
    :try_start_0
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lroboguice/inject/ContextScope;->enter(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 167
    :try_start_1
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->delegate:Lcom/google/inject/Injector;

    invoke-interface {v0, p1}, Lcom/google/inject/Injector;->getMembersInjector(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/MembersInjector;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 169
    :try_start_2
    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    throw v0

    .line 171
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method

.method public getMembersInjector(Ljava/lang/Class;)Lcom/google/inject/MembersInjector;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Lcom/google/inject/MembersInjector",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 152
    .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    const-class v1, Lroboguice/inject/ContextScope;

    monitor-enter v1

    .line 153
    :try_start_0
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lroboguice/inject/ContextScope;->enter(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 155
    :try_start_1
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->delegate:Lcom/google/inject/Injector;

    invoke-interface {v0, p1}, Lcom/google/inject/Injector;->getMembersInjector(Ljava/lang/Class;)Lcom/google/inject/MembersInjector;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 157
    :try_start_2
    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    throw v0

    .line 159
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method

.method public getParent()Lcom/google/inject/Injector;
    .locals 4

    .prologue
    .line 176
    const-class v1, Lroboguice/inject/ContextScope;

    monitor-enter v1

    .line 177
    :try_start_0
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lroboguice/inject/ContextScope;->enter(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 179
    :try_start_1
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->delegate:Lcom/google/inject/Injector;

    invoke-interface {v0}, Lcom/google/inject/Injector;->getParent()Lcom/google/inject/Injector;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 181
    :try_start_2
    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    throw v0

    .line 183
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method

.method public getProvider(Lcom/google/inject/Key;)Lcom/google/inject/Provider;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/Key",
            "<TT;>;)",
            "Lcom/google/inject/Provider",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 188
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<TT;>;"
    const-class v1, Lroboguice/inject/ContextScope;

    monitor-enter v1

    .line 189
    :try_start_0
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lroboguice/inject/ContextScope;->enter(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 191
    :try_start_1
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->delegate:Lcom/google/inject/Injector;

    invoke-interface {v0, p1}, Lcom/google/inject/Injector;->getProvider(Lcom/google/inject/Key;)Lcom/google/inject/Provider;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 193
    :try_start_2
    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    throw v0

    .line 195
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method

.method public getProvider(Ljava/lang/Class;)Lcom/google/inject/Provider;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Lcom/google/inject/Provider",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 200
    .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    const-class v1, Lroboguice/inject/ContextScope;

    monitor-enter v1

    .line 201
    :try_start_0
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lroboguice/inject/ContextScope;->enter(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 203
    :try_start_1
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->delegate:Lcom/google/inject/Injector;

    invoke-interface {v0, p1}, Lcom/google/inject/Injector;->getProvider(Ljava/lang/Class;)Lcom/google/inject/Provider;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 205
    :try_start_2
    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    throw v0

    .line 207
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method

.method public getScopeBindings()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Lcom/google/inject/Scope;",
            ">;"
        }
    .end annotation

    .prologue
    .line 212
    const-class v1, Lroboguice/inject/ContextScope;

    monitor-enter v1

    .line 213
    :try_start_0
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lroboguice/inject/ContextScope;->enter(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 215
    :try_start_1
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->delegate:Lcom/google/inject/Injector;

    invoke-interface {v0}, Lcom/google/inject/Injector;->getScopeBindings()Ljava/util/Map;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 217
    :try_start_2
    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    throw v0

    .line 219
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method

.method public getTypeConverterBindings()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/google/inject/spi/TypeConverterBinding;",
            ">;"
        }
    .end annotation

    .prologue
    .line 224
    const-class v1, Lroboguice/inject/ContextScope;

    monitor-enter v1

    .line 225
    :try_start_0
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lroboguice/inject/ContextScope;->enter(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 227
    :try_start_1
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->delegate:Lcom/google/inject/Injector;

    invoke-interface {v0}, Lcom/google/inject/Injector;->getTypeConverterBindings()Ljava/util/Set;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 229
    :try_start_2
    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    throw v0

    .line 231
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method

.method public injectMembers(Ljava/lang/Object;)V
    .locals 0
    .param p1, "instance"    # Ljava/lang/Object;

    .prologue
    .line 236
    invoke-virtual {p0, p1}, Lroboguice/inject/ContextScopedRoboInjector;->injectMembersWithoutViews(Ljava/lang/Object;)V

    .line 237
    return-void
.end method

.method public injectMembersWithoutViews(Ljava/lang/Object;)V
    .locals 4
    .param p1, "instance"    # Ljava/lang/Object;

    .prologue
    .line 240
    const-class v1, Lroboguice/inject/ContextScope;

    monitor-enter v1

    .line 241
    :try_start_0
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lroboguice/inject/ContextScope;->enter(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 243
    :try_start_1
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->delegate:Lcom/google/inject/Injector;

    invoke-interface {v0, p1}, Lcom/google/inject/Injector;->injectMembers(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 245
    :try_start_2
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    .line 247
    monitor-exit v1

    .line 248
    return-void

    .line 245
    :catchall_0
    move-exception v0

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    throw v0

    .line 247
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method

.method public injectViewMembers(Landroid/app/Activity;)V
    .locals 4
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 252
    const-class v1, Lroboguice/inject/ContextScope;

    monitor-enter v1

    .line 253
    :try_start_0
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lroboguice/inject/ContextScope;->enter(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 255
    :try_start_1
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    if-eq v0, p1, :cond_0

    .line 256
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v2, "internal error, how did you get here?"

    invoke-direct {v0, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 260
    :catchall_0
    move-exception v0

    :try_start_2
    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    throw v0

    .line 262
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    .line 258
    :cond_0
    :try_start_3
    invoke-static {p1}, Lroboguice/inject/ViewListener$ViewMembersInjector;->injectViews(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 260
    :try_start_4
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    .line 262
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 263
    return-void
.end method

.method public injectViewMembers(Landroid/support/v4/app/Fragment;)V
    .locals 4
    .param p1, "fragment"    # Landroid/support/v4/app/Fragment;

    .prologue
    .line 267
    const-class v1, Lroboguice/inject/ContextScope;

    monitor-enter v1

    .line 268
    :try_start_0
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lroboguice/inject/ContextScope;->enter(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 270
    :try_start_1
    invoke-static {p1}, Lroboguice/inject/ViewListener$ViewMembersInjector;->injectViews(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 272
    :try_start_2
    iget-object v0, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    .line 274
    monitor-exit v1

    .line 275
    return-void

    .line 272
    :catchall_0
    move-exception v0

    iget-object v2, p0, Lroboguice/inject/ContextScopedRoboInjector;->scope:Lroboguice/inject/ContextScope;

    iget-object v3, p0, Lroboguice/inject/ContextScopedRoboInjector;->context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lroboguice/inject/ContextScope;->exit(Landroid/content/Context;)V

    throw v0

    .line 274
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method
