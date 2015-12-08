.class Lcom/splunk/mint/DataFlusher;
.super Lcom/splunk/mint/BaseExecutor;
.source "DataFlusher.java"

# interfaces
.implements Lcom/splunk/mint/InterfaceExecutor;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Lcom/splunk/mint/BaseExecutor;-><init>()V

    return-void
.end method


# virtual methods
.method public getExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .prologue
    .line 70
    sget-object v0, Lcom/splunk/mint/DataFlusher;->executor:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    .line 71
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/splunk/mint/DataFlusher;->executor:Ljava/util/concurrent/ExecutorService;

    .line 72
    :cond_0
    sget-object v0, Lcom/splunk/mint/DataFlusher;->executor:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public declared-synchronized send()V
    .locals 3

    .prologue
    .line 14
    monitor-enter p0

    :try_start_0
    new-instance v1, Lcom/splunk/mint/LowPriorityThreadFactory;

    invoke-direct {v1}, Lcom/splunk/mint/LowPriorityThreadFactory;-><init>()V

    new-instance v2, Lcom/splunk/mint/DataFlusher$1;

    invoke-direct {v2, p0}, Lcom/splunk/mint/DataFlusher$1;-><init>(Lcom/splunk/mint/DataFlusher;)V

    invoke-virtual {v1, v2}, Lcom/splunk/mint/LowPriorityThreadFactory;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object v0

    .line 63
    .local v0, "t":Ljava/lang/Thread;
    invoke-virtual {p0}, Lcom/splunk/mint/DataFlusher;->getExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 64
    invoke-virtual {p0}, Lcom/splunk/mint/DataFlusher;->getExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    :cond_0
    monitor-exit p0

    return-void

    .line 14
    .end local v0    # "t":Ljava/lang/Thread;
    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method
