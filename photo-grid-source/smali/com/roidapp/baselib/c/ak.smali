.class final Lcom/roidapp/baselib/c/ak;
.super Ljava/util/concurrent/AbstractExecutorService;
.source "SourceFile"


# static fields
.field private static final n:Lcom/roidapp/baselib/c/ag;

.field private static final o:Ljava/lang/RuntimePermission;


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final b:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/concurrent/locks/ReentrantLock;

.field private final d:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Lcom/roidapp/baselib/c/am;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/concurrent/locks/Condition;

.field private f:I

.field private g:J

.field private volatile h:Ljava/util/concurrent/ThreadFactory;

.field private volatile i:Lcom/roidapp/baselib/c/ag;

.field private volatile j:J

.field private volatile k:Z

.field private volatile l:I

.field private volatile m:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 229
    new-instance v0, Lcom/roidapp/baselib/c/al;

    invoke-direct {v0}, Lcom/roidapp/baselib/c/al;-><init>()V

    sput-object v0, Lcom/roidapp/baselib/c/ak;->n:Lcom/roidapp/baselib/c/ag;

    .line 240
    new-instance v0, Ljava/lang/RuntimePermission;

    const-string v1, "modifyThread"

    invoke-direct {v0, v1}, Ljava/lang/RuntimePermission;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/roidapp/baselib/c/ak;->o:Ljava/lang/RuntimePermission;

    return-void
.end method

.method public constructor <init>(IILjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/concurrent/TimeUnit;",
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Ljava/lang/Runnable;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 758
    invoke-static {}, Ljava/util/concurrent/Executors;->defaultThreadFactory()Ljava/util/concurrent/ThreadFactory;

    move-result-object v5

    sget-object v6, Lcom/roidapp/baselib/c/ak;->n:Lcom/roidapp/baselib/c/ag;

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/baselib/c/ak;-><init>(IILjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;Lcom/roidapp/baselib/c/ag;)V

    .line 759
    return-void
.end method

.method private constructor <init>(IILjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;Lcom/roidapp/baselib/c/ag;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/concurrent/TimeUnit;",
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Ljava/lang/Runnable;",
            ">;",
            "Ljava/util/concurrent/ThreadFactory;",
            "Lcom/roidapp/baselib/c/ag;",
            ")V"
        }
    .end annotation

    .prologue
    const-wide/16 v2, 0xa

    .line 843
    invoke-direct {p0}, Ljava/util/concurrent/AbstractExecutorService;-><init>()V

    .line 91
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 16112
    const/high16 v1, -0x20000000

    .line 91
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/roidapp/baselib/c/ak;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 166
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/c/ak;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 171
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/c/ak;->d:Ljava/util/HashSet;

    .line 176
    iget-object v0, p0, Lcom/roidapp/baselib/c/ak;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/baselib/c/ak;->e:Ljava/util/concurrent/locks/Condition;

    .line 844
    if-ltz p1, :cond_0

    if-lez p2, :cond_0

    if-lt p2, p1, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v0, v2, v0

    if-gez v0, :cond_1

    .line 845
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 846
    :cond_1
    if-eqz p4, :cond_2

    if-eqz p5, :cond_2

    if-nez p6, :cond_3

    .line 847
    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 848
    :cond_3
    iput p1, p0, Lcom/roidapp/baselib/c/ak;->l:I

    .line 849
    iput p2, p0, Lcom/roidapp/baselib/c/ak;->m:I

    .line 850
    iput-object p4, p0, Lcom/roidapp/baselib/c/ak;->b:Ljava/util/concurrent/BlockingQueue;

    .line 851
    invoke-virtual {p3, v2, v3}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roidapp/baselib/c/ak;->j:J

    .line 852
    iput-object p5, p0, Lcom/roidapp/baselib/c/ak;->h:Ljava/util/concurrent/ThreadFactory;

    .line 853
    iput-object p6, p0, Lcom/roidapp/baselib/c/ak;->i:Lcom/roidapp/baselib/c/ag;

    .line 854
    return-void
.end method

.method private a(Lcom/roidapp/baselib/c/am;Z)V
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 595
    if-eqz p2, :cond_0

    .line 596
    invoke-direct {p0}, Lcom/roidapp/baselib/c/ak;->c()V

    .line 598
    :cond_0
    iget-object v2, p0, Lcom/roidapp/baselib/c/ak;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 599
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 601
    :try_start_0
    iget-wide v4, p0, Lcom/roidapp/baselib/c/ak;->g:J

    iget-wide v6, p1, Lcom/roidapp/baselib/c/am;->c:J

    add-long/2addr v4, v6

    iput-wide v4, p0, Lcom/roidapp/baselib/c/ak;->g:J

    .line 602
    iget-object v0, p0, Lcom/roidapp/baselib/c/ak;->d:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 604
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 607
    invoke-direct {p0}, Lcom/roidapp/baselib/c/ak;->d()V

    .line 609
    iget-object v0, p0, Lcom/roidapp/baselib/c/ak;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    .line 610
    const/high16 v0, 0x20000000

    invoke-static {v2, v0}, Lcom/roidapp/baselib/c/ak;->a(II)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 611
    if-nez p2, :cond_4

    .line 612
    iget-boolean v0, p0, Lcom/roidapp/baselib/c/ak;->k:Z

    if-eqz v0, :cond_3

    move v0, v1

    .line 613
    :goto_0
    if-nez v0, :cond_1

    iget-object v3, p0, Lcom/roidapp/baselib/c/ak;->b:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v3}, Ljava/util/concurrent/BlockingQueue;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    .line 614
    const/4 v0, 0x1

    .line 11108
    :cond_1
    const v3, 0x1fffffff

    and-int/2addr v2, v3

    .line 615
    if-lt v2, v0, :cond_4

    .line 620
    :cond_2
    :goto_1
    return-void

    .line 604
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0

    .line 612
    :cond_3
    iget v0, p0, Lcom/roidapp/baselib/c/ak;->l:I

    goto :goto_0

    .line 618
    :cond_4
    const/4 v0, 0x0

    invoke-direct {p0, v0, v1}, Lcom/roidapp/baselib/c/ak;->a(Ljava/lang/Runnable;Z)Z

    goto :goto_1
.end method

.method private a(Ljava/lang/Runnable;)V
    .locals 1

    .prologue
    .line 468
    iget-object v0, p0, Lcom/roidapp/baselib/c/ak;->i:Lcom/roidapp/baselib/c/ag;

    invoke-interface {v0, p1, p0}, Lcom/roidapp/baselib/c/ag;->a(Ljava/lang/Runnable;Lcom/roidapp/baselib/c/ak;)V

    .line 469
    return-void
.end method

.method private a(Z)V
    .locals 5

    .prologue
    .line 421
    iget-object v1, p0, Lcom/roidapp/baselib/c/ak;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 422
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 424
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/baselib/c/ak;->d:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/c/am;

    .line 425
    iget-object v3, v0, Lcom/roidapp/baselib/c/am;->a:Ljava/lang/Thread;

    .line 426
    invoke-virtual {v3}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/am;->a()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v4

    if-eqz v4, :cond_1

    .line 428
    :try_start_1
    invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 5309
    const/4 v3, 0x1

    :try_start_2
    invoke-virtual {v0, v3}, Lcom/roidapp/baselib/c/am;->release(I)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 434
    :cond_1
    :goto_0
    if-eqz p1, :cond_0

    .line 438
    :cond_2
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 439
    return-void

    .line 431
    :catch_0
    move-exception v3

    .line 6309
    const/4 v3, 0x1

    :try_start_3
    invoke-virtual {v0, v3}, Lcom/roidapp/baselib/c/am;->release(I)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 438
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0

    .line 431
    :catchall_1
    move-exception v2

    .line 7309
    const/4 v3, 0x1

    :try_start_4
    invoke-virtual {v0, v3}, Lcom/roidapp/baselib/c/am;->release(I)Z

    .line 431
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0
.end method

.method private a(I)Z
    .locals 2

    .prologue
    .line 142
    iget-object v0, p0, Lcom/roidapp/baselib/c/ak;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    add-int/lit8 v1, p1, -0x1

    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    return v0
.end method

.method private static a(II)Z
    .locals 1

    .prologue
    .line 120
    if-ge p0, p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Ljava/lang/Runnable;Z)Z
    .locals 7

    .prologue
    const v6, 0x1fffffff

    const/4 v0, 0x0

    const/high16 v5, -0x20000000

    .line 525
    :cond_0
    iget-object v1, p0, Lcom/roidapp/baselib/c/ak;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    .line 8104
    and-int v3, v1, v5

    .line 529
    if-ltz v3, :cond_9

    if-nez v3, :cond_1

    if-nez p1, :cond_1

    iget-object v2, p0, Lcom/roidapp/baselib/c/ak;->b:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v2}, Ljava/util/concurrent/BlockingQueue;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_9

    .line 581
    :cond_1
    :goto_0
    return v0

    .line 8135
    :cond_2
    iget-object v1, p0, Lcom/roidapp/baselib/c/ak;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    add-int/lit8 v4, v2, 0x1

    invoke-virtual {v1, v2, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v1

    .line 536
    if-nez v1, :cond_4

    .line 538
    iget-object v1, p0, Lcom/roidapp/baselib/c/ak;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    .line 9104
    and-int v2, v1, v5

    .line 539
    if-ne v2, v3, :cond_0

    move v2, v1

    .line 8108
    :goto_1
    and-int v4, v2, v6

    .line 534
    if-ge v4, v6, :cond_1

    if-eqz p2, :cond_3

    iget v1, p0, Lcom/roidapp/baselib/c/ak;->l:I

    :goto_2
    if-lt v4, v1, :cond_2

    goto :goto_0

    :cond_3
    iget v1, p0, Lcom/roidapp/baselib/c/ak;->m:I

    goto :goto_2

    .line 545
    :cond_4
    new-instance v1, Lcom/roidapp/baselib/c/am;

    invoke-direct {v1, p0, p1}, Lcom/roidapp/baselib/c/am;-><init>(Lcom/roidapp/baselib/c/ak;Ljava/lang/Runnable;)V

    .line 546
    iget-object v2, v1, Lcom/roidapp/baselib/c/am;->a:Ljava/lang/Thread;

    .line 548
    iget-object v3, p0, Lcom/roidapp/baselib/c/ak;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 549
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 554
    :try_start_0
    iget-object v4, p0, Lcom/roidapp/baselib/c/ak;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v4

    .line 10104
    and-int/2addr v4, v5

    .line 557
    if-eqz v2, :cond_5

    if-ltz v4, :cond_6

    if-nez v4, :cond_5

    if-eqz p1, :cond_6

    .line 558
    :cond_5
    invoke-direct {p0}, Lcom/roidapp/baselib/c/ak;->c()V

    .line 559
    invoke-direct {p0}, Lcom/roidapp/baselib/c/ak;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 569
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_0

    .line 563
    :cond_6
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/baselib/c/ak;->d:Ljava/util/HashSet;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 565
    iget-object v0, p0, Lcom/roidapp/baselib/c/ak;->d:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v0

    .line 566
    iget v1, p0, Lcom/roidapp/baselib/c/ak;->f:I

    if-le v0, v1, :cond_7

    .line 567
    iput v0, p0, Lcom/roidapp/baselib/c/ak;->f:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 569
    :cond_7
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 572
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 578
    iget-object v0, p0, Lcom/roidapp/baselib/c/ak;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    .line 11104
    and-int/2addr v0, v5

    .line 578
    const/high16 v1, 0x20000000

    if-ne v0, v1, :cond_8

    invoke-virtual {v2}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_8

    .line 579
    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 581
    :cond_8
    const/4 v0, 0x1

    goto :goto_0

    .line 569
    :catchall_0
    move-exception v0

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0

    :cond_9
    move v2, v1

    goto :goto_1
.end method

.method private b(I)V
    .locals 3

    .prologue
    .line 329
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/c/ak;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    .line 330
    invoke-static {v0, p1}, Lcom/roidapp/baselib/c/ak;->b(II)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/roidapp/baselib/c/ak;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2108
    const v2, 0x1fffffff

    and-int/2addr v2, v0

    .line 2112
    or-int/2addr v2, p1

    .line 330
    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 333
    :cond_1
    return-void
.end method

.method private static b(II)Z
    .locals 1

    .prologue
    .line 124
    if-lt p0, p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private c()V
    .locals 1

    .prologue
    .line 150
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/c/ak;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/roidapp/baselib/c/ak;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 151
    return-void
.end method

.method private d()V
    .locals 6

    .prologue
    const/high16 v5, 0x40000000    # 2.0f

    const/4 v1, 0x1

    .line 342
    :goto_0
    iget-object v0, p0, Lcom/roidapp/baselib/c/ak;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    .line 2128
    if-gez v2, :cond_1

    move v0, v1

    .line 343
    :goto_1
    if-nez v0, :cond_0

    invoke-static {v2, v5}, Lcom/roidapp/baselib/c/ak;->b(II)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3104
    const/high16 v0, -0x20000000

    and-int/2addr v0, v2

    .line 343
    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/baselib/c/ak;->b:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 363
    :cond_0
    :goto_2
    return-void

    .line 2128
    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    .line 3108
    :cond_2
    const v0, 0x1fffffff

    and-int/2addr v0, v2

    .line 345
    if-eqz v0, :cond_3

    .line 346
    invoke-direct {p0, v1}, Lcom/roidapp/baselib/c/ak;->a(Z)V

    goto :goto_2

    .line 350
    :cond_3
    iget-object v3, p0, Lcom/roidapp/baselib/c/ak;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 351
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 353
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/baselib/c/ak;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3112
    const/high16 v4, 0x40000000    # 2.0f

    .line 353
    invoke-virtual {v0, v2, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 357
    iget-object v0, p0, Lcom/roidapp/baselib/c/ak;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 4112
    const/high16 v1, 0x60000000

    .line 357
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 358
    iget-object v0, p0, Lcom/roidapp/baselib/c/ak;->e:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 363
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_2

    :cond_4
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
.end method

.method private e()V
    .locals 4

    .prologue
    .line 378
    invoke-static {}, Ljava/lang/System;->getSecurityManager()Ljava/lang/SecurityManager;

    move-result-object v1

    .line 379
    if-eqz v1, :cond_1

    .line 380
    sget-object v0, Lcom/roidapp/baselib/c/ak;->o:Ljava/lang/RuntimePermission;

    invoke-virtual {v1, v0}, Ljava/lang/SecurityManager;->checkPermission(Ljava/security/Permission;)V

    .line 381
    iget-object v2, p0, Lcom/roidapp/baselib/c/ak;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 382
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 384
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/baselib/c/ak;->d:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/c/am;

    .line 385
    iget-object v0, v0, Lcom/roidapp/baselib/c/am;->a:Ljava/lang/Thread;

    invoke-virtual {v1, v0}, Ljava/lang/SecurityManager;->checkAccess(Ljava/lang/Thread;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 387
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0

    :cond_0
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 390
    :cond_1
    return-void
.end method

.method private f()V
    .locals 1

    .prologue
    .line 446
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/roidapp/baselib/c/ak;->a(Z)V

    .line 447
    return-void
.end method

.method private g()Ljava/lang/Runnable;
    .locals 10

    .prologue
    const/4 v5, 0x0

    const/4 v2, 0x1

    const/high16 v9, -0x20000000

    const/4 v1, 0x0

    .line 630
    move v0, v1

    .line 633
    :cond_0
    :goto_0
    iget-object v3, p0, Lcom/roidapp/baselib/c/ak;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v3

    .line 12104
    and-int v6, v3, v9

    .line 637
    if-ltz v6, :cond_4

    const/high16 v4, 0x20000000

    if-ge v6, v4, :cond_1

    iget-object v4, p0, Lcom/roidapp/baselib/c/ak;->b:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v4}, Ljava/util/concurrent/BlockingQueue;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_4

    .line 638
    :cond_1
    invoke-direct {p0}, Lcom/roidapp/baselib/c/ak;->c()V

    move-object v0, v5

    .line 661
    :cond_2
    :goto_1
    return-object v0

    .line 652
    :cond_3
    iget-object v3, p0, Lcom/roidapp/baselib/c/ak;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v3

    .line 13104
    and-int v4, v3, v9

    .line 653
    if-ne v4, v6, :cond_0

    .line 12108
    :cond_4
    const v4, 0x1fffffff

    and-int v7, v3, v4

    .line 646
    iget-boolean v4, p0, Lcom/roidapp/baselib/c/ak;->k:Z

    if-nez v4, :cond_5

    iget v4, p0, Lcom/roidapp/baselib/c/ak;->l:I

    if-le v7, v4, :cond_7

    :cond_5
    move v4, v2

    .line 648
    :goto_2
    iget v8, p0, Lcom/roidapp/baselib/c/ak;->m:I

    if-gt v7, v8, :cond_6

    if-eqz v0, :cond_8

    if-eqz v4, :cond_8

    .line 650
    :cond_6
    invoke-direct {p0, v3}, Lcom/roidapp/baselib/c/ak;->a(I)Z

    move-result v3

    if-eqz v3, :cond_3

    move-object v0, v5

    .line 651
    goto :goto_1

    :cond_7
    move v4, v1

    .line 646
    goto :goto_2

    .line 659
    :cond_8
    if-eqz v4, :cond_9

    :try_start_0
    iget-object v0, p0, Lcom/roidapp/baselib/c/ak;->b:Ljava/util/concurrent/BlockingQueue;

    iget-wide v6, p0, Lcom/roidapp/baselib/c/ak;->j:J

    sget-object v3, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v6, v7, v3}, Ljava/util/concurrent/BlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    .line 660
    :goto_3
    if-nez v0, :cond_2

    move v0, v2

    .line 665
    goto :goto_0

    .line 659
    :cond_9
    iget-object v0, p0, Lcom/roidapp/baselib/c/ak;->b:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    .line 664
    :catch_0
    move-exception v0

    move v0, v1

    .line 666
    goto :goto_0
.end method


# virtual methods
.method public final a()Ljava/util/concurrent/ThreadFactory;
    .locals 1

    .prologue
    .line 1011
    iget-object v0, p0, Lcom/roidapp/baselib/c/ak;->h:Ljava/util/concurrent/ThreadFactory;

    return-object v0
.end method

.method final a(Lcom/roidapp/baselib/c/am;)V
    .locals 8

    .prologue
    const-wide/16 v6, 0x1

    const/4 v1, 0x0

    const/4 v4, 0x1

    .line 696
    iget-object v0, p1, Lcom/roidapp/baselib/c/am;->b:Ljava/lang/Runnable;

    .line 697
    iput-object v1, p1, Lcom/roidapp/baselib/c/am;->b:Ljava/lang/Runnable;

    .line 700
    :goto_0
    if-nez v0, :cond_0

    :try_start_0
    invoke-direct {p0}, Lcom/roidapp/baselib/c/ak;->g()Ljava/lang/Runnable;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 13301
    :cond_0
    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Lcom/roidapp/baselib/c/am;->acquire(I)V

    .line 13456
    iget-object v2, p0, Lcom/roidapp/baselib/c/ak;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    const/high16 v3, 0x20000000

    invoke-static {v2, v3}, Lcom/roidapp/baselib/c/ak;->a(II)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/roidapp/baselib/c/ak;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    const/high16 v3, 0x20000000

    invoke-static {v2, v3}, Lcom/roidapp/baselib/c/ak;->b(II)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 13457
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 707
    :cond_1
    :try_start_1
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 722
    :try_start_2
    iget-wide v2, p1, Lcom/roidapp/baselib/c/am;->c:J

    add-long/2addr v2, v6

    iput-wide v2, p1, Lcom/roidapp/baselib/c/am;->c:J

    .line 14309
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/roidapp/baselib/c/am;->release(I)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object v0, v1

    .line 724
    goto :goto_0

    .line 710
    :catch_0
    move-exception v0

    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 718
    :catchall_0
    move-exception v0

    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 721
    :catchall_1
    move-exception v0

    .line 722
    :try_start_5
    iget-wide v2, p1, Lcom/roidapp/baselib/c/am;->c:J

    add-long/2addr v2, v6

    iput-wide v2, p1, Lcom/roidapp/baselib/c/am;->c:J

    .line 15309
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lcom/roidapp/baselib/c/am;->release(I)Z

    .line 723
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 728
    :catchall_2
    move-exception v0

    invoke-direct {p0, p1, v4}, Lcom/roidapp/baselib/c/ak;->a(Lcom/roidapp/baselib/c/am;Z)V

    throw v0

    .line 713
    :catch_1
    move-exception v0

    :try_start_6
    throw v0

    .line 714
    :catch_2
    move-exception v0

    .line 716
    new-instance v1, Ljava/lang/Error;

    invoke-direct {v1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 728
    :cond_2
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/roidapp/baselib/c/ak;->a(Lcom/roidapp/baselib/c/am;Z)V

    .line 729
    return-void
.end method

.method public final awaitTermination(JLjava/util/concurrent/TimeUnit;)Z
    .locals 7

    .prologue
    .line 966
    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    .line 967
    iget-object v2, p0, Lcom/roidapp/baselib/c/ak;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 968
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 971
    :goto_0
    :try_start_0
    iget-object v3, p0, Lcom/roidapp/baselib/c/ak;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v3

    const/high16 v4, 0x60000000

    invoke-static {v3, v4}, Lcom/roidapp/baselib/c/ak;->b(II)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v3

    if-eqz v3, :cond_0

    .line 978
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    const/4 v0, 0x1

    :goto_1
    return v0

    .line 973
    :cond_0
    const-wide/16 v4, 0x0

    cmp-long v3, v0, v4

    if-gtz v3, :cond_1

    .line 978
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    const/4 v0, 0x0

    goto :goto_1

    .line 975
    :cond_1
    :try_start_1
    iget-object v3, p0, Lcom/roidapp/baselib/c/ak;->e:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v3, v0, v1}, Ljava/util/concurrent/locks/Condition;->awaitNanos(J)J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-wide v0

    goto :goto_0

    .line 978
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
.end method

.method public final b()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 1137
    iget-wide v0, p0, Lcom/roidapp/baselib/c/ak;->j:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    .line 1138
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Core threads must have nonzero keep alive times"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1139
    :cond_0
    iget-boolean v0, p0, Lcom/roidapp/baselib/c/ak;->k:Z

    if-eq v4, v0, :cond_1

    .line 1140
    iput-boolean v4, p0, Lcom/roidapp/baselib/c/ak;->k:Z

    .line 1142
    invoke-direct {p0}, Lcom/roidapp/baselib/c/ak;->f()V

    .line 1144
    :cond_1
    return-void
.end method

.method public final execute(Ljava/lang/Runnable;)V
    .locals 6

    .prologue
    const v5, 0x1fffffff

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 870
    if-nez p1, :cond_0

    .line 871
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 883
    :cond_0
    iget-object v2, p0, Lcom/roidapp/baselib/c/ak;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    .line 17108
    and-int v3, v2, v5

    .line 884
    iget v4, p0, Lcom/roidapp/baselib/c/ak;->l:I

    if-ge v3, v4, :cond_3

    .line 885
    invoke-direct {p0, p1, v0}, Lcom/roidapp/baselib/c/ak;->a(Ljava/lang/Runnable;Z)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 897
    :cond_1
    :goto_0
    return-void

    .line 887
    :cond_2
    iget-object v2, p0, Lcom/roidapp/baselib/c/ak;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    .line 17128
    :cond_3
    if-gez v2, :cond_4

    move v2, v0

    .line 889
    :goto_1
    if-eqz v2, :cond_7

    iget-object v2, p0, Lcom/roidapp/baselib/c/ak;->b:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v2, p1}, Ljava/util/concurrent/BlockingQueue;->offer(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 890
    iget-object v2, p0, Lcom/roidapp/baselib/c/ak;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    .line 18128
    if-gez v2, :cond_5

    .line 891
    :goto_2
    if-nez v0, :cond_6

    .line 18235
    iget-object v0, p0, Lcom/roidapp/baselib/c/ak;->b:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->remove(Ljava/lang/Object;)Z

    move-result v0

    .line 18236
    invoke-direct {p0}, Lcom/roidapp/baselib/c/ak;->d()V

    .line 891
    if-eqz v0, :cond_6

    .line 892
    invoke-direct {p0, p1}, Lcom/roidapp/baselib/c/ak;->a(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_4
    move v2, v1

    .line 17128
    goto :goto_1

    :cond_5
    move v0, v1

    .line 18128
    goto :goto_2

    .line 19108
    :cond_6
    and-int v0, v2, v5

    .line 893
    if-nez v0, :cond_1

    .line 894
    const/4 v0, 0x0

    invoke-direct {p0, v0, v1}, Lcom/roidapp/baselib/c/ak;->a(Ljava/lang/Runnable;Z)Z

    goto :goto_0

    .line 895
    :cond_7
    invoke-direct {p0, p1, v1}, Lcom/roidapp/baselib/c/ak;->a(Ljava/lang/Runnable;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 896
    invoke-direct {p0, p1}, Lcom/roidapp/baselib/c/ak;->a(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method protected final finalize()V
    .locals 0

    .prologue
    .line 986
    invoke-virtual {p0}, Lcom/roidapp/baselib/c/ak;->shutdown()V

    .line 987
    return-void
.end method

.method public final isShutdown()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 947
    iget-object v2, p0, Lcom/roidapp/baselib/c/ak;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    .line 21128
    if-gez v2, :cond_0

    move v2, v0

    .line 947
    :goto_0
    if-nez v2, :cond_1

    :goto_1
    return v0

    :cond_0
    move v2, v1

    .line 21128
    goto :goto_0

    :cond_1
    move v0, v1

    .line 947
    goto :goto_1
.end method

.method public final isTerminated()Z
    .locals 2

    .prologue
    .line 962
    iget-object v0, p0, Lcom/roidapp/baselib/c/ak;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/high16 v1, 0x60000000

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/ak;->b(II)Z

    move-result v0

    return v0
.end method

.method public final shutdown()V
    .locals 2

    .prologue
    .line 906
    iget-object v1, p0, Lcom/roidapp/baselib/c/ak;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 907
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 909
    :try_start_0
    invoke-direct {p0}, Lcom/roidapp/baselib/c/ak;->e()V

    .line 910
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/roidapp/baselib/c/ak;->b(I)V

    .line 19446
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/roidapp/baselib/c/ak;->a(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 914
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 916
    invoke-direct {p0}, Lcom/roidapp/baselib/c/ak;->d()V

    .line 917
    return-void

    .line 914
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
.end method

.method public final shutdownNow()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 932
    iget-object v2, p0, Lcom/roidapp/baselib/c/ak;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 933
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 935
    :try_start_0
    invoke-direct {p0}, Lcom/roidapp/baselib/c/ak;->e()V

    .line 936
    const/high16 v0, 0x20000000

    invoke-direct {p0, v0}, Lcom/roidapp/baselib/c/ak;->b(I)V

    .line 20396
    iget-object v3, p0, Lcom/roidapp/baselib/c/ak;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 20397
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 20399
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/baselib/c/ak;->d:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/c/am;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20401
    :try_start_2
    iget-object v0, v0, Lcom/roidapp/baselib/c/am;->a:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 20404
    :catch_0
    move-exception v0

    goto :goto_0

    .line 20406
    :cond_0
    :try_start_3
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 20493
    iget-object v3, p0, Lcom/roidapp/baselib/c/ak;->b:Ljava/util/concurrent/BlockingQueue;

    .line 20494
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 20495
    invoke-interface {v3, v4}, Ljava/util/concurrent/BlockingQueue;->drainTo(Ljava/util/Collection;)I

    .line 20496
    invoke-interface {v3}, Ljava/util/concurrent/BlockingQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 20497
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Runnable;

    invoke-interface {v3, v0}, Ljava/util/concurrent/BlockingQueue;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Runnable;

    array-length v5, v0

    :goto_1
    if-ge v1, v5, :cond_2

    aget-object v6, v0, v1

    .line 20498
    invoke-interface {v3, v6}, Ljava/util/concurrent/BlockingQueue;->remove(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 20499
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20497
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 20406
    :catchall_0
    move-exception v0

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 940
    :catchall_1
    move-exception v0

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0

    :cond_2
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 942
    invoke-direct {p0}, Lcom/roidapp/baselib/c/ak;->d()V

    .line 943
    return-object v4
.end method

.method public final toString()Ljava/lang/String;
    .locals 10

    .prologue
    const/4 v2, 0x0

    .line 1368
    iget-object v3, p0, Lcom/roidapp/baselib/c/ak;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 1369
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 1371
    :try_start_0
    iget-wide v0, p0, Lcom/roidapp/baselib/c/ak;->g:J

    .line 1373
    iget-object v4, p0, Lcom/roidapp/baselib/c/ak;->d:Ljava/util/HashSet;

    invoke-virtual {v4}, Ljava/util/HashSet;->size()I

    move-result v6

    .line 1374
    iget-object v4, p0, Lcom/roidapp/baselib/c/ak;->d:Ljava/util/HashSet;

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move-wide v4, v0

    move v1, v2

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/c/am;

    .line 1375
    iget-wide v8, v0, Lcom/roidapp/baselib/c/am;->c:J

    add-long/2addr v4, v8

    .line 1376
    invoke-virtual {v0}, Lcom/roidapp/baselib/c/am;->b()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_3

    .line 1377
    add-int/lit8 v0, v1, 0x1

    :goto_1
    move v1, v0

    .line 1378
    goto :goto_0

    .line 1380
    :cond_0
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 1382
    iget-object v0, p0, Lcom/roidapp/baselib/c/ak;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    .line 1383
    invoke-static {v0, v2}, Lcom/roidapp/baselib/c/ak;->a(II)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v0, "Running"

    .line 1384
    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", pool size = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", active threads = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", queued tasks = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/baselib/c/ak;->b:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v1}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", completed tasks = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1380
    :catchall_0
    move-exception v0

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0

    .line 1383
    :cond_1
    const/high16 v2, 0x60000000

    invoke-static {v0, v2}, Lcom/roidapp/baselib/c/ak;->b(II)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "Terminated"

    goto :goto_2

    :cond_2
    const-string v0, "Shutting down"

    goto :goto_2

    :cond_3
    move v0, v1

    goto :goto_1
.end method
