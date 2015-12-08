.class final Ltwitter4j/internal/async/DispatcherImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltwitter4j/internal/async/Dispatcher;


# instance fields
.field private active:Z

.field private final q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private threads:[Ltwitter4j/internal/async/ExecuteThread;

.field final ticket:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ltwitter4j/conf/Configuration;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Ltwitter4j/internal/async/DispatcherImpl;->q:Ljava/util/List;

    .line 58
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ltwitter4j/internal/async/DispatcherImpl;->ticket:Ljava/lang/Object;

    .line 80
    iput-boolean v4, p0, Ltwitter4j/internal/async/DispatcherImpl;->active:Z

    .line 33
    invoke-interface {p1}, Ltwitter4j/conf/Configuration;->getAsyncNumThreads()I

    move-result v0

    new-array v0, v0, [Ltwitter4j/internal/async/ExecuteThread;

    iput-object v0, p0, Ltwitter4j/internal/async/DispatcherImpl;->threads:[Ltwitter4j/internal/async/ExecuteThread;

    .line 34
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Ltwitter4j/internal/async/DispatcherImpl;->threads:[Ltwitter4j/internal/async/ExecuteThread;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    .line 35
    iget-object v1, p0, Ltwitter4j/internal/async/DispatcherImpl;->threads:[Ltwitter4j/internal/async/ExecuteThread;

    new-instance v2, Ltwitter4j/internal/async/ExecuteThread;

    const-string v3, "Twitter4J Async Dispatcher"

    invoke-direct {v2, v3, p0, v0}, Ltwitter4j/internal/async/ExecuteThread;-><init>(Ljava/lang/String;Ltwitter4j/internal/async/DispatcherImpl;I)V

    aput-object v2, v1, v0

    .line 36
    iget-object v1, p0, Ltwitter4j/internal/async/DispatcherImpl;->threads:[Ltwitter4j/internal/async/ExecuteThread;

    aget-object v1, v1, v0

    invoke-virtual {v1, v4}, Ltwitter4j/internal/async/ExecuteThread;->setDaemon(Z)V

    .line 37
    iget-object v1, p0, Ltwitter4j/internal/async/DispatcherImpl;->threads:[Ltwitter4j/internal/async/ExecuteThread;

    aget-object v1, v1, v0

    invoke-virtual {v1}, Ltwitter4j/internal/async/ExecuteThread;->start()V

    .line 34
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 39
    :cond_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    new-instance v1, Ltwitter4j/internal/async/DispatcherImpl$1;

    invoke-direct {v1, p0}, Ltwitter4j/internal/async/DispatcherImpl$1;-><init>(Ltwitter4j/internal/async/DispatcherImpl;)V

    invoke-virtual {v0, v1}, Ljava/lang/Runtime;->addShutdownHook(Ljava/lang/Thread;)V

    .line 46
    return-void
.end method

.method static synthetic access$000(Ltwitter4j/internal/async/DispatcherImpl;)Z
    .locals 1

    .prologue
    .line 28
    iget-boolean v0, p0, Ltwitter4j/internal/async/DispatcherImpl;->active:Z

    return v0
.end method


# virtual methods
.method public final declared-synchronized invokeLater(Ljava/lang/Runnable;)V
    .locals 2

    .prologue
    .line 50
    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Ltwitter4j/internal/async/DispatcherImpl;->q:Ljava/util/List;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 51
    :try_start_1
    iget-object v0, p0, Ltwitter4j/internal/async/DispatcherImpl;->q:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 52
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    :try_start_2
    iget-object v1, p0, Ltwitter4j/internal/async/DispatcherImpl;->ticket:Ljava/lang/Object;

    monitor-enter v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 54
    :try_start_3
    iget-object v0, p0, Ltwitter4j/internal/async/DispatcherImpl;->ticket:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 55
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    monitor-exit p0

    return-void

    .line 52
    :catchall_0
    move-exception v0

    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 50
    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0

    .line 55
    :catchall_2
    move-exception v0

    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :try_start_7
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1
.end method

.method public final poll()Ljava/lang/Runnable;
    .locals 3

    .prologue
    .line 61
    :goto_0
    iget-boolean v0, p0, Ltwitter4j/internal/async/DispatcherImpl;->active:Z

    if-eqz v0, :cond_1

    .line 62
    iget-object v1, p0, Ltwitter4j/internal/async/DispatcherImpl;->q:Ljava/util/List;

    monitor-enter v1

    .line 63
    :try_start_0
    iget-object v0, p0, Ltwitter4j/internal/async/DispatcherImpl;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 64
    iget-object v0, p0, Ltwitter4j/internal/async/DispatcherImpl;->q:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    .line 65
    if-eqz v0, :cond_0

    .line 66
    monitor-exit v1

    .line 77
    :goto_1
    return-object v0

    .line 69
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 70
    iget-object v1, p0, Ltwitter4j/internal/async/DispatcherImpl;->ticket:Ljava/lang/Object;

    monitor-enter v1

    .line 72
    :try_start_1
    iget-object v0, p0, Ltwitter4j/internal/async/DispatcherImpl;->ticket:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    :goto_2
    :try_start_2
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 69
    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0

    .line 77
    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2
.end method

.method public final declared-synchronized shutdown()V
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 84
    monitor-enter p0

    :try_start_0
    iget-boolean v1, p0, Ltwitter4j/internal/async/DispatcherImpl;->active:Z

    if-eqz v1, :cond_1

    .line 85
    const/4 v1, 0x0

    iput-boolean v1, p0, Ltwitter4j/internal/async/DispatcherImpl;->active:Z

    .line 86
    iget-object v1, p0, Ltwitter4j/internal/async/DispatcherImpl;->threads:[Ltwitter4j/internal/async/ExecuteThread;

    array-length v2, v1

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    .line 87
    invoke-virtual {v3}, Ltwitter4j/internal/async/ExecuteThread;->shutdown()V

    .line 86
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 89
    :cond_0
    iget-object v1, p0, Ltwitter4j/internal/async/DispatcherImpl;->ticket:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 90
    :try_start_1
    iget-object v0, p0, Ltwitter4j/internal/async/DispatcherImpl;->ticket:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 91
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    :cond_1
    monitor-exit p0

    return-void

    .line 91
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 84
    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0
.end method
