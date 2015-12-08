.class public final Lcom/a/a/b/a;
.super Ljava/lang/Object;


# direct methods
.method public static a(IILcom/a/a/b/a/h;)Ljava/util/concurrent/Executor;
    .locals 9

    sget-object v0, Lcom/a/a/b/a/h;->b:Lcom/a/a/b/a/h;

    if-ne p2, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_1

    new-instance v7, Lcom/a/a/b/a/a/c;

    invoke-direct {v7}, Lcom/a/a/b/a/a/c;-><init>()V

    :goto_1
    check-cast v7, Ljava/util/concurrent/BlockingQueue;

    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    const-wide/16 v4, 0x0

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v8, Lcom/a/a/b/b;

    invoke-direct {v8, p1}, Lcom/a/a/b/b;-><init>(I)V

    move v2, p0

    move v3, p0

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    goto :goto_1
.end method
