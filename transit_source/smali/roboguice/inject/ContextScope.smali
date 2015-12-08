.class public Lroboguice/inject/ContextScope;
.super Ljava/lang/Object;
.source "ContextScope.java"

# interfaces
.implements Lcom/google/inject/Scope;


# instance fields
.field protected application:Landroid/app/Application;

.field protected applicationScopedObjects:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/inject/Key",
            "<*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field protected contextThreadLocal:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal",
            "<",
            "Ljava/util/Stack",
            "<",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/content/Context;",
            ">;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 1
    .param p1, "application"    # Landroid/app/Application;

    .prologue
    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Lroboguice/inject/ContextScope;->contextThreadLocal:Ljava/lang/ThreadLocal;

    .line 56
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lroboguice/inject/ContextScope;->applicationScopedObjects:Ljava/util/Map;

    .line 60
    iput-object p1, p0, Lroboguice/inject/ContextScope;->application:Landroid/app/Application;

    .line 61
    invoke-virtual {p0, p1}, Lroboguice/inject/ContextScope;->enter(Landroid/content/Context;)V

    .line 62
    return-void
.end method


# virtual methods
.method public enter(Landroid/content/Context;)V
    .locals 5
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 76
    const-class v4, Lroboguice/inject/ContextScope;

    monitor-enter v4

    .line 78
    :try_start_0
    invoke-virtual {p0}, Lroboguice/inject/ContextScope;->getContextStack()Ljava/util/Stack;

    move-result-object v2

    .line 79
    .local v2, "stack":Ljava/util/Stack;, "Ljava/util/Stack<Ljava/lang/ref/WeakReference<Landroid/content/Context;>;>;"
    invoke-virtual {p0, p1}, Lroboguice/inject/ContextScope;->getScopedObjectMap(Landroid/content/Context;)Ljava/util/Map;

    move-result-object v1

    .line 82
    .local v1, "map":Ljava/util/Map;, "Ljava/util/Map<Lcom/google/inject/Key<*>;Ljava/lang/Object;>;"
    new-instance v3, Ljava/lang/ref/WeakReference;

    invoke-direct {v3, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 87
    .local v0, "c":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_0
    invoke-static {v0}, Lcom/google/inject/Key;->get(Ljava/lang/Class;)Lcom/google/inject/Key;

    move-result-object v3

    invoke-interface {v1, v3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    .line 89
    const-class v3, Ljava/lang/Object;

    if-ne v0, v3, :cond_0

    .line 90
    monitor-exit v4

    .line 92
    return-void

    .line 90
    .end local v0    # "c":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v1    # "map":Ljava/util/Map;, "Ljava/util/Map<Lcom/google/inject/Key<*>;Ljava/lang/Object;>;"
    .end local v2    # "stack":Ljava/util/Stack;, "Ljava/util/Stack<Ljava/lang/ref/WeakReference<Landroid/content/Context;>;>;"
    :catchall_0
    move-exception v3

    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v3
.end method

.method public exit(Landroid/content/Context;)V
    .locals 7
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 95
    const-class v3, Lroboguice/inject/ContextScope;

    monitor-enter v3

    .line 96
    :try_start_0
    invoke-virtual {p0}, Lroboguice/inject/ContextScope;->getContextStack()Ljava/util/Stack;

    move-result-object v1

    .line 97
    .local v1, "stack":Ljava/util/Stack;, "Ljava/util/Stack<Ljava/lang/ref/WeakReference<Landroid/content/Context;>;>;"
    invoke-virtual {v1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    .line 98
    .local v0, "c":Landroid/content/Context;
    if-eqz v0, :cond_0

    if-eq v0, p1, :cond_0

    .line 99
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v4, "Scope for %s must be opened before it can be closed"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object p1, v5, v6

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 100
    .end local v0    # "c":Landroid/content/Context;
    .end local v1    # "stack":Ljava/util/Stack;, "Ljava/util/Stack<Ljava/lang/ref/WeakReference<Landroid/content/Context;>;>;"
    :catchall_0
    move-exception v2

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2

    .restart local v0    # "c":Landroid/content/Context;
    .restart local v1    # "stack":Ljava/util/Stack;, "Ljava/util/Stack<Ljava/lang/ref/WeakReference<Landroid/content/Context;>;>;"
    :cond_0
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    return-void
.end method

.method public getContextStack()Ljava/util/Stack;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Stack",
            "<",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/content/Context;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 128
    iget-object v1, p0, Lroboguice/inject/ContextScope;->contextThreadLocal:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Stack;

    .line 129
    .local v0, "stack":Ljava/util/Stack;, "Ljava/util/Stack<Ljava/lang/ref/WeakReference<Landroid/content/Context;>;>;"
    if-nez v0, :cond_0

    .line 130
    new-instance v0, Ljava/util/Stack;

    .end local v0    # "stack":Ljava/util/Stack;, "Ljava/util/Stack<Ljava/lang/ref/WeakReference<Landroid/content/Context;>;>;"
    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    .line 131
    .restart local v0    # "stack":Ljava/util/Stack;, "Ljava/util/Stack<Ljava/lang/ref/WeakReference<Landroid/content/Context;>;>;"
    iget-object v1, p0, Lroboguice/inject/ContextScope;->contextThreadLocal:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 133
    :cond_0
    return-object v0
.end method

.method protected getScopedObjectMap(Landroid/content/Context;)Ljava/util/Map;
    .locals 5
    .param p1, "origContext"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/Map",
            "<",
            "Lcom/google/inject/Key",
            "<*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 137
    move-object v0, p1

    .line 138
    .local v0, "context":Landroid/content/Context;
    :goto_0
    instance-of v1, v0, Lroboguice/util/RoboContext;

    if-nez v1, :cond_0

    instance-of v1, v0, Landroid/app/Application;

    if-nez v1, :cond_0

    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_0

    .line 139
    check-cast v0, Landroid/content/ContextWrapper;

    .end local v0    # "context":Landroid/content/Context;
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    .restart local v0    # "context":Landroid/content/Context;
    goto :goto_0

    .line 142
    :cond_0
    instance-of v1, v0, Landroid/app/Application;

    if-eqz v1, :cond_1

    .line 143
    iget-object v1, p0, Lroboguice/inject/ContextScope;->applicationScopedObjects:Ljava/util/Map;

    .line 149
    .end local v0    # "context":Landroid/content/Context;
    :goto_1
    return-object v1

    .line 146
    .restart local v0    # "context":Landroid/content/Context;
    :cond_1
    instance-of v1, v0, Lroboguice/util/RoboContext;

    if-nez v1, :cond_2

    .line 147
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "%s does not appear to be a RoboGuice context (instanceof RoboContext)"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 149
    :cond_2
    check-cast v0, Lroboguice/util/RoboContext;

    .end local v0    # "context":Landroid/content/Context;
    invoke-interface {v0}, Lroboguice/util/RoboContext;->getScopedObjectMap()Ljava/util/Map;

    move-result-object v1

    goto :goto_1
.end method

.method public scope(Lcom/google/inject/Key;Lcom/google/inject/Provider;)Lcom/google/inject/Provider;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/Key",
            "<TT;>;",
            "Lcom/google/inject/Provider",
            "<TT;>;)",
            "Lcom/google/inject/Provider",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 104
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<TT;>;"
    .local p2, "unscoped":Lcom/google/inject/Provider;, "Lcom/google/inject/Provider<TT;>;"
    new-instance v0, Lroboguice/inject/ContextScope$1;

    invoke-direct {v0, p0, p1, p2}, Lroboguice/inject/ContextScope$1;-><init>(Lroboguice/inject/ContextScope;Lcom/google/inject/Key;Lcom/google/inject/Provider;)V

    return-object v0
.end method
