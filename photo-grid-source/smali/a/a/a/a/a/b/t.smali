.class public final La/a/a/a/a/b/t;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;
    .locals 1

    .prologue
    .line 42
    invoke-static {p0}, La/a/a/a/a/b/t;->c(Ljava/lang/String;)Ljava/util/concurrent/ThreadFactory;

    move-result-object v0

    .line 43
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    .line 44
    invoke-static {p0, v0}, La/a/a/a/a/b/t;->a(Ljava/lang/String;Ljava/util/concurrent/ExecutorService;)V

    .line 45
    return-object v0
.end method

.method private static final a(Ljava/lang/String;Ljava/util/concurrent/ExecutorService;)V
    .locals 5

    .prologue
    .line 86
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 1092
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    new-instance v2, Ljava/lang/Thread;

    new-instance v3, La/a/a/a/a/b/w;

    invoke-direct {v3, p0, p1, v0}, La/a/a/a/a/b/w;-><init>(Ljava/lang/String;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/TimeUnit;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "Crashlytics Shutdown Hook for "

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/Runtime;->addShutdownHook(Ljava/lang/Thread;)V

    .line 88
    return-void
.end method

.method public static b(Ljava/lang/String;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    .prologue
    .line 58
    invoke-static {p0}, La/a/a/a/a/b/t;->c(Ljava/lang/String;)Ljava/util/concurrent/ThreadFactory;

    move-result-object v0

    .line 59
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    .line 61
    invoke-static {p0, v0}, La/a/a/a/a/b/t;->a(Ljava/lang/String;Ljava/util/concurrent/ExecutorService;)V

    .line 62
    return-object v0
.end method

.method private static c(Ljava/lang/String;)Ljava/util/concurrent/ThreadFactory;
    .locals 4

    .prologue
    .line 66
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v2, 0x1

    invoke-direct {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 68
    new-instance v1, La/a/a/a/a/b/u;

    invoke-direct {v1, p0, v0}, La/a/a/a/a/b/u;-><init>(Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicLong;)V

    return-object v1
.end method
