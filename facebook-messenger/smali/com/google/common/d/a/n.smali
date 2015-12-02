.class Lcom/google/common/d/a/n;
.super Lcom/google/common/d/a/a;
.source "Futures.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<I:",
        "Ljava/lang/Object;",
        "O:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/d/a/a",
        "<TO;>;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field private a:Lcom/google/common/base/Function;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/base/Function",
            "<-TI;+",
            "Lcom/google/common/d/a/s",
            "<+TO;>;>;"
        }
    .end annotation
.end field

.field private b:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<+TI;>;"
        }
    .end annotation
.end field

.field private volatile c:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<+TO;>;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method private constructor <init>(Lcom/google/common/base/Function;Lcom/google/common/d/a/s;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/base/Function",
            "<-TI;+",
            "Lcom/google/common/d/a/s",
            "<+TO;>;>;",
            "Lcom/google/common/d/a/s",
            "<+TI;>;)V"
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    .line 695
    invoke-direct {p0}, Lcom/google/common/d/a/a;-><init>()V

    .line 689
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    iput-object v0, p0, Lcom/google/common/d/a/n;->d:Ljava/util/concurrent/BlockingQueue;

    .line 691
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lcom/google/common/d/a/n;->e:Ljava/util/concurrent/CountDownLatch;

    .line 696
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/base/Function;

    iput-object v0, p0, Lcom/google/common/d/a/n;->a:Lcom/google/common/base/Function;

    .line 697
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/d/a/s;

    iput-object v0, p0, Lcom/google/common/d/a/n;->b:Lcom/google/common/d/a/s;

    .line 698
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/common/base/Function;Lcom/google/common/d/a/s;Lcom/google/common/d/a/j;)V
    .locals 0

    .prologue
    .line 682
    invoke-direct {p0, p1, p2}, Lcom/google/common/d/a/n;-><init>(Lcom/google/common/base/Function;Lcom/google/common/d/a/s;)V

    return-void
.end method

.method static synthetic a(Lcom/google/common/d/a/n;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;
    .locals 0

    .prologue
    .line 682
    iput-object p1, p0, Lcom/google/common/d/a/n;->c:Lcom/google/common/d/a/s;

    return-object p1
.end method

.method private a(Ljava/util/concurrent/Future;Z)V
    .locals 0
    .param p1    # Ljava/util/concurrent/Future;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Future",
            "<*>;Z)V"
        }
    .end annotation

    .prologue
    .line 803
    if-eqz p1, :cond_0

    .line 804
    invoke-interface {p1, p2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 806
    :cond_0
    return-void
.end method


# virtual methods
.method public cancel(Z)Z
    .locals 2

    .prologue
    .line 790
    invoke-super {p0, p1}, Lcom/google/common/d/a/a;->cancel(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 793
    iget-object v0, p0, Lcom/google/common/d/a/n;->d:Ljava/util/concurrent/BlockingQueue;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/d/a/ad;->a(Ljava/util/concurrent/BlockingQueue;Ljava/lang/Object;)V

    .line 794
    iget-object v0, p0, Lcom/google/common/d/a/n;->b:Lcom/google/common/d/a/s;

    invoke-direct {p0, v0, p1}, Lcom/google/common/d/a/n;->a(Ljava/util/concurrent/Future;Z)V

    .line 795
    iget-object v0, p0, Lcom/google/common/d/a/n;->c:Lcom/google/common/d/a/s;

    invoke-direct {p0, v0, p1}, Lcom/google/common/d/a/n;->a(Ljava/util/concurrent/Future;Z)V

    .line 796
    const/4 v0, 0x1

    .line 798
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TO;"
        }
    .end annotation

    .prologue
    .line 707
    invoke-virtual {p0}, Lcom/google/common/d/a/n;->isDone()Z

    move-result v0

    if-nez v0, :cond_1

    .line 712
    iget-object v0, p0, Lcom/google/common/d/a/n;->b:Lcom/google/common/d/a/s;

    .line 713
    if-eqz v0, :cond_0

    .line 714
    invoke-interface {v0}, Lcom/google/common/d/a/s;->get()Ljava/lang/Object;

    .line 720
    :cond_0
    iget-object v0, p0, Lcom/google/common/d/a/n;->e:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V

    .line 727
    iget-object v0, p0, Lcom/google/common/d/a/n;->c:Lcom/google/common/d/a/s;

    .line 728
    if-eqz v0, :cond_1

    .line 729
    invoke-interface {v0}, Lcom/google/common/d/a/s;->get()Ljava/lang/Object;

    .line 732
    :cond_1
    invoke-super {p0}, Lcom/google/common/d/a/a;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TO;"
        }
    .end annotation

    .prologue
    const-wide/16 v5, 0x0

    .line 743
    invoke-virtual {p0}, Lcom/google/common/d/a/n;->isDone()Z

    move-result v0

    if-nez v0, :cond_3

    .line 746
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    if-eq p3, v0, :cond_0

    .line 747
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide p1

    .line 748
    sget-object p3, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 755
    :cond_0
    iget-object v0, p0, Lcom/google/common/d/a/n;->b:Lcom/google/common/d/a/s;

    .line 756
    if-eqz v0, :cond_1

    .line 757
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    .line 758
    invoke-interface {v0, p1, p2, p3}, Lcom/google/common/d/a/s;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 759
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    sub-long v0, v3, v1

    invoke-static {v5, v6, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    sub-long/2addr p1, v0

    .line 765
    :cond_1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    .line 766
    iget-object v2, p0, Lcom/google/common/d/a/n;->e:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v2, p1, p2, p3}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 767
    new-instance v0, Ljava/util/concurrent/TimeoutException;

    invoke-direct {v0}, Ljava/util/concurrent/TimeoutException;-><init>()V

    throw v0

    .line 769
    :cond_2
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    sub-long v0, v2, v0

    invoke-static {v5, v6, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    sub-long/2addr p1, v0

    .line 776
    iget-object v0, p0, Lcom/google/common/d/a/n;->c:Lcom/google/common/d/a/s;

    .line 777
    if-eqz v0, :cond_3

    .line 778
    invoke-interface {v0, p1, p2, p3}, Lcom/google/common/d/a/s;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 781
    :cond_3
    invoke-super {p0, p1, p2, p3}, Lcom/google/common/d/a/a;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public run()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 813
    :try_start_0
    iget-object v0, p0, Lcom/google/common/d/a/n;->b:Lcom/google/common/d/a/s;

    invoke-static {v0}, Lcom/google/common/d/a/ad;->a(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/UndeclaredThrowableException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 826
    :try_start_1
    iget-object v1, p0, Lcom/google/common/d/a/n;->a:Lcom/google/common/base/Function;

    invoke-interface {v1, v0}, Lcom/google/common/base/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/d/a/s;

    iput-object v0, p0, Lcom/google/common/d/a/n;->c:Lcom/google/common/d/a/s;

    .line 828
    invoke-virtual {p0}, Lcom/google/common/d/a/n;->isCancelled()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 834
    iget-object v1, p0, Lcom/google/common/d/a/n;->d:Ljava/util/concurrent/BlockingQueue;

    invoke-static {v1}, Lcom/google/common/d/a/ad;->a(Ljava/util/concurrent/BlockingQueue;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-interface {v0, v1}, Lcom/google/common/d/a/s;->cancel(Z)Z

    .line 836
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/common/d/a/n;->c:Lcom/google/common/d/a/s;
    :try_end_1
    .catch Ljava/lang/reflect/UndeclaredThrowableException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 874
    iput-object v3, p0, Lcom/google/common/d/a/n;->a:Lcom/google/common/base/Function;

    .line 875
    iput-object v3, p0, Lcom/google/common/d/a/n;->b:Lcom/google/common/d/a/s;

    .line 877
    iget-object v0, p0, Lcom/google/common/d/a/n;->e:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 879
    :goto_0
    return-void

    .line 814
    :catch_0
    move-exception v0

    .line 818
    const/4 v0, 0x0

    :try_start_2
    invoke-virtual {p0, v0}, Lcom/google/common/d/a/n;->cancel(Z)Z
    :try_end_2
    .catch Ljava/lang/reflect/UndeclaredThrowableException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 874
    iput-object v3, p0, Lcom/google/common/d/a/n;->a:Lcom/google/common/base/Function;

    .line 875
    iput-object v3, p0, Lcom/google/common/d/a/n;->b:Lcom/google/common/d/a/s;

    .line 877
    iget-object v0, p0, Lcom/google/common/d/a/n;->e:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    goto :goto_0

    .line 820
    :catch_1
    move-exception v0

    .line 822
    :try_start_3
    invoke-virtual {v0}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/common/d/a/n;->a_(Ljava/lang/Throwable;)Z
    :try_end_3
    .catch Ljava/lang/reflect/UndeclaredThrowableException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 874
    iput-object v3, p0, Lcom/google/common/d/a/n;->a:Lcom/google/common/base/Function;

    .line 875
    iput-object v3, p0, Lcom/google/common/d/a/n;->b:Lcom/google/common/d/a/s;

    .line 877
    iget-object v0, p0, Lcom/google/common/d/a/n;->e:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    goto :goto_0

    .line 839
    :cond_0
    :try_start_4
    new-instance v1, Lcom/google/common/d/a/o;

    invoke-direct {v1, p0, v0}, Lcom/google/common/d/a/o;-><init>(Lcom/google/common/d/a/n;Lcom/google/common/d/a/s;)V

    invoke-static {}, Lcom/google/common/d/a/w;->a()Lcom/google/common/d/a/u;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/common/d/a/s;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    :try_end_4
    .catch Ljava/lang/reflect/UndeclaredThrowableException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 874
    iput-object v3, p0, Lcom/google/common/d/a/n;->a:Lcom/google/common/base/Function;

    .line 875
    iput-object v3, p0, Lcom/google/common/d/a/n;->b:Lcom/google/common/d/a/s;

    .line 877
    iget-object v0, p0, Lcom/google/common/d/a/n;->e:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    goto :goto_0

    .line 862
    :catch_2
    move-exception v0

    .line 864
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/reflect/UndeclaredThrowableException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/common/d/a/n;->a_(Ljava/lang/Throwable;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 874
    iput-object v3, p0, Lcom/google/common/d/a/n;->a:Lcom/google/common/base/Function;

    .line 875
    iput-object v3, p0, Lcom/google/common/d/a/n;->b:Lcom/google/common/d/a/s;

    .line 877
    iget-object v0, p0, Lcom/google/common/d/a/n;->e:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    goto :goto_0

    .line 865
    :catch_3
    move-exception v0

    .line 868
    :try_start_6
    invoke-virtual {p0, v0}, Lcom/google/common/d/a/n;->a_(Ljava/lang/Throwable;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 874
    iput-object v3, p0, Lcom/google/common/d/a/n;->a:Lcom/google/common/base/Function;

    .line 875
    iput-object v3, p0, Lcom/google/common/d/a/n;->b:Lcom/google/common/d/a/s;

    .line 877
    iget-object v0, p0, Lcom/google/common/d/a/n;->e:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    goto :goto_0

    .line 869
    :catch_4
    move-exception v0

    .line 871
    :try_start_7
    invoke-virtual {p0, v0}, Lcom/google/common/d/a/n;->a_(Ljava/lang/Throwable;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 874
    iput-object v3, p0, Lcom/google/common/d/a/n;->a:Lcom/google/common/base/Function;

    .line 875
    iput-object v3, p0, Lcom/google/common/d/a/n;->b:Lcom/google/common/d/a/s;

    .line 877
    iget-object v0, p0, Lcom/google/common/d/a/n;->e:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    goto :goto_0

    .line 874
    :catchall_0
    move-exception v0

    iput-object v3, p0, Lcom/google/common/d/a/n;->a:Lcom/google/common/base/Function;

    .line 875
    iput-object v3, p0, Lcom/google/common/d/a/n;->b:Lcom/google/common/d/a/s;

    .line 877
    iget-object v1, p0, Lcom/google/common/d/a/n;->e:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    throw v0
.end method
