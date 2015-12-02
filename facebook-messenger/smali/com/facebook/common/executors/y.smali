.class Lcom/facebook/common/executors/y;
.super Ljava/lang/Object;
.source "PrioritySerialExecutorImpl.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/common/executors/w;


# direct methods
.method private constructor <init>(Lcom/facebook/common/executors/w;)V
    .locals 0

    .prologue
    .line 86
    iput-object p1, p0, Lcom/facebook/common/executors/y;->a:Lcom/facebook/common/executors/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/common/executors/w;Lcom/facebook/common/executors/x;)V
    .locals 0

    .prologue
    .line 86
    invoke-direct {p0, p1}, Lcom/facebook/common/executors/y;-><init>(Lcom/facebook/common/executors/w;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 90
    :try_start_0
    iget-object v0, p0, Lcom/facebook/common/executors/y;->a:Lcom/facebook/common/executors/w;

    invoke-static {v0}, Lcom/facebook/common/executors/w;->a(Lcom/facebook/common/executors/w;)Ljava/lang/Runnable;

    move-result-object v0

    .line 91
    if-eqz v0, :cond_0

    .line 92
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 95
    :cond_0
    iget-object v1, p0, Lcom/facebook/common/executors/y;->a:Lcom/facebook/common/executors/w;

    monitor-enter v1

    .line 96
    :try_start_1
    iget-object v0, p0, Lcom/facebook/common/executors/y;->a:Lcom/facebook/common/executors/w;

    invoke-virtual {v0}, Lcom/facebook/common/executors/w;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 97
    iget-object v0, p0, Lcom/facebook/common/executors/y;->a:Lcom/facebook/common/executors/w;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/facebook/common/executors/w;->a(Lcom/facebook/common/executors/w;Z)Z

    .line 101
    :goto_0
    monitor-exit v1

    .line 103
    return-void

    .line 99
    :cond_1
    iget-object v0, p0, Lcom/facebook/common/executors/y;->a:Lcom/facebook/common/executors/w;

    invoke-static {v0}, Lcom/facebook/common/executors/w;->b(Lcom/facebook/common/executors/w;)Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 101
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 95
    :catchall_1
    move-exception v0

    iget-object v1, p0, Lcom/facebook/common/executors/y;->a:Lcom/facebook/common/executors/w;

    monitor-enter v1

    .line 96
    :try_start_2
    iget-object v2, p0, Lcom/facebook/common/executors/y;->a:Lcom/facebook/common/executors/w;

    invoke-virtual {v2}, Lcom/facebook/common/executors/w;->a()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 97
    iget-object v2, p0, Lcom/facebook/common/executors/y;->a:Lcom/facebook/common/executors/w;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/facebook/common/executors/w;->a(Lcom/facebook/common/executors/w;Z)Z

    .line 101
    :goto_1
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    throw v0

    .line 99
    :cond_2
    :try_start_3
    iget-object v2, p0, Lcom/facebook/common/executors/y;->a:Lcom/facebook/common/executors/w;

    invoke-static {v2}, Lcom/facebook/common/executors/w;->b(Lcom/facebook/common/executors/w;)Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-interface {v2, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_1

    .line 101
    :catchall_2
    move-exception v0

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw v0
.end method
