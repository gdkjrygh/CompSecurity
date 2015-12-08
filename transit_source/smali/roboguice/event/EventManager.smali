.class public Lroboguice/event/EventManager;
.super Ljava/lang/Object;
.source "EventManager.java"


# annotations
.annotation runtime Lroboguice/inject/ContextSingleton;
.end annotation


# instance fields
.field protected context:Landroid/content/Context;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field

.field protected registrations:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/util/Set",
            "<",
            "Lroboguice/event/EventListener",
            "<*>;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lroboguice/event/EventManager;->registrations:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 3

    .prologue
    .line 137
    iget-object v2, p0, Lroboguice/event/EventManager;->registrations:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 138
    .local v0, "e":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/Class<*>;Ljava/util/Set<Lroboguice/event/EventListener<*>;>;>;"
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->clear()V

    goto :goto_0

    .line 139
    .end local v0    # "e":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/Class<*>;Ljava/util/Set<Lroboguice/event/EventListener<*>;>;>;"
    :cond_0
    iget-object v2, p0, Lroboguice/event/EventManager;->registrations:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->clear()V

    .line 140
    return-void
.end method

.method public fire(Ljava/lang/Object;)V
    .locals 5
    .param p1, "event"    # Ljava/lang/Object;

    .prologue
    .line 123
    iget-object v3, p0, Lroboguice/event/EventManager;->registrations:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Set;

    .line 124
    .local v2, "observers":Ljava/util/Set;, "Ljava/util/Set<Lroboguice/event/EventListener<*>;>;"
    if-nez v2, :cond_0

    .line 133
    :goto_0
    return-void

    .line 128
    :cond_0
    monitor-enter v2

    .line 129
    :try_start_0
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lroboguice/event/EventListener;

    .line 130
    .local v1, "observer":Lroboguice/event/EventListener;
    invoke-interface {v1, p1}, Lroboguice/event/EventListener;->onEvent(Ljava/lang/Object;)V

    goto :goto_1

    .line 131
    .end local v0    # "i$":Ljava/util/Iterator;
    .end local v1    # "observer":Lroboguice/event/EventListener;
    :catchall_0
    move-exception v3

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v3

    .restart local v0    # "i$":Ljava/util/Iterator;
    :cond_1
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method

.method public registerObserver(Ljava/lang/Class;Lroboguice/event/EventListener;)V
    .locals 2
    .param p2, "listener"    # Lroboguice/event/EventListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Lroboguice/event/EventListener;",
            ")V"
        }
    .end annotation

    .prologue
    .line 42
    .local p1, "event":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    iget-object v1, p0, Lroboguice/event/EventManager;->registrations:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    .line 43
    .local v0, "observers":Ljava/util/Set;, "Ljava/util/Set<Lroboguice/event/EventListener<*>;>;"
    if-nez v0, :cond_0

    .line 44
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {v1}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    .line 45
    iget-object v1, p0, Lroboguice/event/EventManager;->registrations:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    :cond_0
    invoke-interface {v0, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 50
    return-void
.end method

.method public registerObserver(Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/Class;)V
    .locals 1
    .param p1, "instance"    # Ljava/lang/Object;
    .param p2, "method"    # Ljava/lang/reflect/Method;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/Class",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 60
    .local p3, "event":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    new-instance v0, Lroboguice/event/eventListener/ObserverMethodListener;

    invoke-direct {v0, p1, p2}, Lroboguice/event/eventListener/ObserverMethodListener;-><init>(Ljava/lang/Object;Ljava/lang/reflect/Method;)V

    invoke-virtual {p0, p3, v0}, Lroboguice/event/EventManager;->registerObserver(Ljava/lang/Class;Lroboguice/event/EventListener;)V

    .line 61
    return-void
.end method

.method public unregisterObserver(Ljava/lang/Class;Lroboguice/event/EventListener;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Lroboguice/event/EventListener",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 72
    .local p1, "event":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    .local p2, "listener":Lroboguice/event/EventListener;, "Lroboguice/event/EventListener<TT;>;"
    iget-object v3, p0, Lroboguice/event/EventManager;->registrations:Ljava/util/Map;

    invoke-interface {v3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    .line 73
    .local v1, "observers":Ljava/util/Set;, "Ljava/util/Set<Lroboguice/event/EventListener<*>;>;"
    if-nez v1, :cond_0

    .line 86
    :goto_0
    return-void

    .line 77
    :cond_0
    monitor-enter v1

    .line 78
    :try_start_0
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<Lroboguice/event/EventListener<*>;>;"
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 79
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lroboguice/event/EventListener;

    .line 80
    .local v2, "registeredListener":Lroboguice/event/EventListener;
    if-ne v2, p2, :cond_1

    .line 81
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 85
    .end local v2    # "registeredListener":Lroboguice/event/EventListener;
    :cond_2
    monitor-exit v1

    goto :goto_0

    .end local v0    # "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<Lroboguice/event/EventListener<*>;>;"
    :catchall_0
    move-exception v3

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v3
.end method

.method public unregisterObserver(Ljava/lang/Object;Ljava/lang/Class;)V
    .locals 6
    .param p1, "instance"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 96
    .local p2, "event":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    iget-object v5, p0, Lroboguice/event/EventManager;->registrations:Ljava/util/Map;

    invoke-interface {v5, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Set;

    .line 97
    .local v4, "observers":Ljava/util/Set;, "Ljava/util/Set<Lroboguice/event/EventListener<*>;>;"
    if-nez v4, :cond_0

    .line 113
    :goto_0
    return-void

    .line 101
    :cond_0
    monitor-enter v4

    .line 102
    :try_start_0
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<Lroboguice/event/EventListener<*>;>;"
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 103
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lroboguice/event/EventListener;

    .line 104
    .local v2, "listener":Lroboguice/event/EventListener;
    instance-of v5, v2, Lroboguice/event/eventListener/ObserverMethodListener;

    if-eqz v5, :cond_1

    .line 105
    move-object v0, v2

    check-cast v0, Lroboguice/event/eventListener/ObserverMethodListener;

    move-object v3, v0

    .line 106
    .local v3, "observer":Lroboguice/event/eventListener/ObserverMethodListener;
    invoke-virtual {v3}, Lroboguice/event/eventListener/ObserverMethodListener;->getInstance()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, p1, :cond_1

    .line 107
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 112
    .end local v2    # "listener":Lroboguice/event/EventListener;
    .end local v3    # "observer":Lroboguice/event/eventListener/ObserverMethodListener;
    :cond_2
    monitor-exit v4

    goto :goto_0

    .end local v1    # "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<Lroboguice/event/EventListener<*>;>;"
    :catchall_0
    move-exception v5

    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v5
.end method
