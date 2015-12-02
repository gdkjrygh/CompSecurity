.class public Lcom/facebook/base/broadcast/g;
.super Ljava/lang/Object;
.source "BaseFbBroadcastManager.java"

# interfaces
.implements Lcom/facebook/base/broadcast/l;


# instance fields
.field final synthetic a:Lcom/facebook/base/broadcast/b;

.field private final b:Lcom/facebook/c/k;

.field private final c:Landroid/content/IntentFilter;

.field private final d:Landroid/os/Handler;

.field private e:Z


# direct methods
.method public constructor <init>(Lcom/facebook/base/broadcast/b;Ljava/util/Map;Landroid/content/IntentFilter;Landroid/os/Handler;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/c/b;",
            ">;",
            "Landroid/content/IntentFilter;",
            "Landroid/os/Handler;",
            ")V"
        }
    .end annotation

    .prologue
    .line 48
    iput-object p1, p0, Lcom/facebook/base/broadcast/g;->a:Lcom/facebook/base/broadcast/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/base/broadcast/g;->e:Z

    .line 50
    if-eqz p4, :cond_1

    invoke-virtual {p1}, Lcom/facebook/base/broadcast/b;->b()Z

    move-result v0

    if-nez v0, :cond_1

    .line 51
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v1

    .line 53
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 54
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    new-instance v4, Lcom/facebook/base/broadcast/e;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/b;

    const/4 v5, 0x0

    invoke-direct {v4, v0, p4, v5}, Lcom/facebook/base/broadcast/e;-><init>(Lcom/facebook/c/b;Landroid/os/Handler;Lcom/facebook/base/broadcast/c;)V

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object p2, v1

    .line 60
    :cond_1
    new-instance v0, Lcom/facebook/base/broadcast/h;

    invoke-direct {v0, p0, p2, p1}, Lcom/facebook/base/broadcast/h;-><init>(Lcom/facebook/base/broadcast/g;Ljava/util/Map;Lcom/facebook/base/broadcast/b;)V

    iput-object v0, p0, Lcom/facebook/base/broadcast/g;->b:Lcom/facebook/c/k;

    .line 66
    iput-object p3, p0, Lcom/facebook/base/broadcast/g;->c:Landroid/content/IntentFilter;

    .line 67
    iput-object p4, p0, Lcom/facebook/base/broadcast/g;->d:Landroid/os/Handler;

    .line 68
    return-void
.end method


# virtual methods
.method public declared-synchronized a()Z
    .locals 1

    .prologue
    .line 71
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/base/broadcast/g;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b()V
    .locals 4

    .prologue
    .line 76
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/base/broadcast/g;->e:Z

    if-eqz v0, :cond_0

    .line 77
    iget-object v0, p0, Lcom/facebook/base/broadcast/g;->a:Lcom/facebook/base/broadcast/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Called registerBroadcastReceiver twice."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    :goto_0
    monitor-exit p0

    return-void

    .line 81
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/base/broadcast/g;->c:Landroid/content/IntentFilter;

    .line 82
    if-nez v0, :cond_2

    .line 83
    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    .line 84
    iget-object v0, p0, Lcom/facebook/base/broadcast/g;->b:Lcom/facebook/c/k;

    invoke-virtual {v0}, Lcom/facebook/c/k;->b()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 85
    invoke-virtual {v1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 76
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_1
    move-object v0, v1

    .line 88
    :cond_2
    :try_start_2
    iget-object v1, p0, Lcom/facebook/base/broadcast/g;->a:Lcom/facebook/base/broadcast/b;

    iget-object v2, p0, Lcom/facebook/base/broadcast/g;->b:Lcom/facebook/c/k;

    iget-object v3, p0, Lcom/facebook/base/broadcast/g;->d:Landroid/os/Handler;

    invoke-virtual {v1, v2, v0, v3}, Lcom/facebook/base/broadcast/b;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Landroid/os/Handler;)V

    .line 89
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/base/broadcast/g;->e:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method public declared-synchronized c()V
    .locals 2

    .prologue
    .line 94
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/base/broadcast/g;->e:Z

    if-eqz v0, :cond_0

    .line 95
    iget-object v0, p0, Lcom/facebook/base/broadcast/g;->a:Lcom/facebook/base/broadcast/b;

    iget-object v1, p0, Lcom/facebook/base/broadcast/g;->b:Lcom/facebook/c/k;

    invoke-virtual {v0, v1}, Lcom/facebook/base/broadcast/b;->a(Landroid/content/BroadcastReceiver;)V

    .line 96
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/base/broadcast/g;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    :cond_0
    monitor-exit p0

    return-void

    .line 94
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
