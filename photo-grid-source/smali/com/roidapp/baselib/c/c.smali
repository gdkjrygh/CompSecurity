.class public abstract Lcom/roidapp/baselib/c/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Params:",
        "Ljava/lang/Object;",
        "Progress:",
        "Ljava/lang/Object;",
        "Result:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final CORE_POOL_SIZE:I

.field private static final CPU_COUNT:I

.field public static final DUAL_THREAD_EXECUTOR:Ljava/util/concurrent/Executor;

.field public static final EXECUTOR_SHAPE:Ljava/util/concurrent/Executor;

.field private static final KEEP_ALIVE:I = 0x1

.field private static final LOG_TAG:Ljava/lang/String; = "AsyncTask"

.field private static final MAXIMUM_POOL_SIZE:I

.field private static final MESSAGE_POST_PROGRESS:I = 0x2

.field private static final MESSAGE_POST_RESULT:I = 0x1

.field public static final SERIAL_EXECUTOR:Ljava/util/concurrent/Executor;

.field public static final SINGLE_EXECUTOR:Ljava/util/concurrent/Executor;

.field public static final THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

.field private static volatile sDefaultExecutor:Ljava/util/concurrent/Executor;

.field private static final sHandler:Lcom/roidapp/baselib/c/i;

.field private static final sPoolWorkQueue:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private static final sThreadFactory:Ljava/util/concurrent/ThreadFactory;


# instance fields
.field private final mCancelled:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final mFuture:Ljava/util/concurrent/FutureTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/FutureTask",
            "<TResult;>;"
        }
    .end annotation
.end field

.field private volatile mStatus$3c38b363:I

.field private final mTaskInvoked:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final mWorker:Lcom/roidapp/baselib/c/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/roidapp/baselib/c/m",
            "<TParams;TResult;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .prologue
    const/4 v11, 0x2

    const/4 v10, 0x0

    .line 200
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    .line 201
    sput v0, Lcom/roidapp/baselib/c/c;->CPU_COUNT:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/roidapp/baselib/c/c;->CORE_POOL_SIZE:I

    .line 202
    sget v0, Lcom/roidapp/baselib/c/c;->CPU_COUNT:I

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/roidapp/baselib/c/c;->MAXIMUM_POOL_SIZE:I

    .line 205
    new-instance v0, Lcom/roidapp/baselib/c/d;

    invoke-direct {v0}, Lcom/roidapp/baselib/c/d;-><init>()V

    sput-object v0, Lcom/roidapp/baselib/c/c;->sThreadFactory:Ljava/util/concurrent/ThreadFactory;

    .line 213
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    sput-object v0, Lcom/roidapp/baselib/c/c;->sPoolWorkQueue:Ljava/util/concurrent/BlockingQueue;

    .line 219
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    sget v2, Lcom/roidapp/baselib/c/c;->CORE_POOL_SIZE:I

    sget v3, Lcom/roidapp/baselib/c/c;->MAXIMUM_POOL_SIZE:I

    const-wide/16 v4, 0x1

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    sget-object v7, Lcom/roidapp/baselib/c/c;->sPoolWorkQueue:Ljava/util/concurrent/BlockingQueue;

    sget-object v8, Lcom/roidapp/baselib/c/c;->sThreadFactory:Ljava/util/concurrent/ThreadFactory;

    new-instance v9, Ljava/util/concurrent/ThreadPoolExecutor$DiscardOldestPolicy;

    invoke-direct {v9}, Ljava/util/concurrent/ThreadPoolExecutor$DiscardOldestPolicy;-><init>()V

    invoke-direct/range {v1 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;Ljava/util/concurrent/RejectedExecutionHandler;)V

    sput-object v1, Lcom/roidapp/baselib/c/c;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 228
    invoke-static {}, Lcom/roidapp/baselib/c/n;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/roidapp/baselib/c/j;

    invoke-direct {v0, v10}, Lcom/roidapp/baselib/c/j;-><init>(B)V

    :goto_0
    sput-object v0, Lcom/roidapp/baselib/c/c;->SERIAL_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 231
    sget-object v0, Lcom/roidapp/baselib/c/c;->sThreadFactory:Ljava/util/concurrent/ThreadFactory;

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/roidapp/baselib/c/c;->SINGLE_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 233
    sget-object v0, Lcom/roidapp/baselib/c/c;->sThreadFactory:Ljava/util/concurrent/ThreadFactory;

    invoke-static {v11, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/roidapp/baselib/c/c;->EXECUTOR_SHAPE:Ljava/util/concurrent/Executor;

    .line 235
    sget-object v0, Lcom/roidapp/baselib/c/c;->sThreadFactory:Ljava/util/concurrent/ThreadFactory;

    invoke-static {v11, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/roidapp/baselib/c/c;->DUAL_THREAD_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 241
    new-instance v0, Lcom/roidapp/baselib/c/i;

    invoke-direct {v0, v10}, Lcom/roidapp/baselib/c/i;-><init>(B)V

    sput-object v0, Lcom/roidapp/baselib/c/c;->sHandler:Lcom/roidapp/baselib/c/i;

    .line 243
    sget-object v0, Lcom/roidapp/baselib/c/c;->SERIAL_EXECUTOR:Ljava/util/concurrent/Executor;

    sput-object v0, Lcom/roidapp/baselib/c/c;->sDefaultExecutor:Ljava/util/concurrent/Executor;

    return-void

    .line 228
    :cond_0
    sget-object v0, Lcom/roidapp/baselib/c/c;->sThreadFactory:Ljava/util/concurrent/ThreadFactory;

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 311
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 247
    sget v0, Lcom/roidapp/baselib/c/l;->a:I

    iput v0, p0, Lcom/roidapp/baselib/c/c;->mStatus$3c38b363:I

    .line 249
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/c/c;->mCancelled:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 250
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/c/c;->mTaskInvoked:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 312
    new-instance v0, Lcom/roidapp/baselib/c/e;

    invoke-direct {v0, p0}, Lcom/roidapp/baselib/c/e;-><init>(Lcom/roidapp/baselib/c/c;)V

    iput-object v0, p0, Lcom/roidapp/baselib/c/c;->mWorker:Lcom/roidapp/baselib/c/m;

    .line 322
    new-instance v0, Lcom/roidapp/baselib/c/f;

    iget-object v1, p0, Lcom/roidapp/baselib/c/c;->mWorker:Lcom/roidapp/baselib/c/m;

    invoke-direct {v0, p0, v1}, Lcom/roidapp/baselib/c/f;-><init>(Lcom/roidapp/baselib/c/c;Ljava/util/concurrent/Callable;)V

    iput-object v0, p0, Lcom/roidapp/baselib/c/c;->mFuture:Ljava/util/concurrent/FutureTask;

    .line 337
    return-void
.end method

.method static synthetic access$300(Lcom/roidapp/baselib/c/c;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .prologue
    .line 197
    iget-object v0, p0, Lcom/roidapp/baselib/c/c;->mTaskInvoked:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method static synthetic access$400(Lcom/roidapp/baselib/c/c;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 197
    invoke-direct {p0, p1}, Lcom/roidapp/baselib/c/c;->postResult(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$500(Lcom/roidapp/baselib/c/c;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 197
    invoke-direct {p0, p1}, Lcom/roidapp/baselib/c/c;->postResultIfNotInvoked(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic access$600(Lcom/roidapp/baselib/c/c;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 197
    invoke-direct {p0, p1}, Lcom/roidapp/baselib/c/c;->finish(Ljava/lang/Object;)V

    return-void
.end method

.method public static execute(Ljava/lang/Runnable;)V
    .locals 1

    .prologue
    .line 634
    sget-object v0, Lcom/roidapp/baselib/c/c;->sDefaultExecutor:Ljava/util/concurrent/Executor;

    invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 635
    return-void
.end method

.method private finish(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    .prologue
    .line 659
    invoke-virtual {p0}, Lcom/roidapp/baselib/c/c;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 660
    invoke-virtual {p0, p1}, Lcom/roidapp/baselib/c/c;->onCancelled(Ljava/lang/Object;)V

    .line 664
    :goto_0
    sget v0, Lcom/roidapp/baselib/c/l;->c:I

    iput v0, p0, Lcom/roidapp/baselib/c/c;->mStatus$3c38b363:I

    .line 665
    return-void

    .line 662
    :cond_0
    invoke-virtual {p0, p1}, Lcom/roidapp/baselib/c/c;->onPostExecute(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public static init()V
    .locals 1

    .prologue
    .line 300
    sget-object v0, Lcom/roidapp/baselib/c/c;->sHandler:Lcom/roidapp/baselib/c/i;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/i;->getLooper()Landroid/os/Looper;

    .line 301
    return-void
.end method

.method private postResult(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)TResult;"
        }
    .end annotation

    .prologue
    const/4 v4, 0x1

    .line 348
    sget-object v0, Lcom/roidapp/baselib/c/c;->sHandler:Lcom/roidapp/baselib/c/i;

    new-instance v1, Lcom/roidapp/baselib/c/h;

    new-array v2, v4, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-direct {v1, p0, v2}, Lcom/roidapp/baselib/c/h;-><init>(Lcom/roidapp/baselib/c/c;[Ljava/lang/Object;)V

    invoke-virtual {v0, v4, v1}, Lcom/roidapp/baselib/c/i;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 350
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 351
    return-object p1
.end method

.method private postResultIfNotInvoked(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    .prologue
    .line 340
    iget-object v0, p0, Lcom/roidapp/baselib/c/c;->mTaskInvoked:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    .line 341
    if-nez v0, :cond_0

    .line 342
    invoke-direct {p0, p1}, Lcom/roidapp/baselib/c/c;->postResult(Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    :cond_0
    return-void
.end method

.method public static setDefaultExecutor(Ljava/util/concurrent/Executor;)V
    .locals 0

    .prologue
    .line 305
    sput-object p0, Lcom/roidapp/baselib/c/c;->sDefaultExecutor:Ljava/util/concurrent/Executor;

    .line 306
    return-void
.end method


# virtual methods
.method public final cancel(Z)Z
    .locals 2

    .prologue
    .line 497
    iget-object v0, p0, Lcom/roidapp/baselib/c/c;->mCancelled:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 498
    iget-object v0, p0, Lcom/roidapp/baselib/c/c;->mFuture:Ljava/util/concurrent/FutureTask;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z

    move-result v0

    return v0
.end method

.method protected varargs abstract doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TParams;)TResult;"
        }
    .end annotation
.end method

.method public final varargs execute([Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TParams;)",
            "Lcom/roidapp/baselib/c/c",
            "<TParams;TProgress;TResult;>;"
        }
    .end annotation

    .prologue
    .line 565
    sget-object v0, Lcom/roidapp/baselib/c/c;->sDefaultExecutor:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lcom/roidapp/baselib/c/c;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;

    move-result-object v0

    return-object v0
.end method

.method public final varargs executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "[TParams;)",
            "Lcom/roidapp/baselib/c/c",
            "<TParams;TProgress;TResult;>;"
        }
    .end annotation

    .prologue
    .line 603
    iget v0, p0, Lcom/roidapp/baselib/c/c;->mStatus$3c38b363:I

    sget v1, Lcom/roidapp/baselib/c/l;->a:I

    if-eq v0, v1, :cond_0

    .line 604
    sget-object v0, Lcom/roidapp/baselib/c/g;->a:[I

    iget v1, p0, Lcom/roidapp/baselib/c/c;->mStatus$3c38b363:I

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 615
    :cond_0
    sget v0, Lcom/roidapp/baselib/c/l;->b:I

    iput v0, p0, Lcom/roidapp/baselib/c/c;->mStatus$3c38b363:I

    .line 617
    invoke-virtual {p0}, Lcom/roidapp/baselib/c/c;->onPreExecute()V

    .line 619
    iget-object v0, p0, Lcom/roidapp/baselib/c/c;->mWorker:Lcom/roidapp/baselib/c/m;

    iput-object p2, v0, Lcom/roidapp/baselib/c/m;->b:[Ljava/lang/Object;

    .line 620
    iget-object v0, p0, Lcom/roidapp/baselib/c/c;->mFuture:Ljava/util/concurrent/FutureTask;

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 622
    return-object p0

    .line 606
    :pswitch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot execute task: the task is already running."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 609
    :pswitch_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot execute task: the task has already been executed (a task can be executed only once)"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 604
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TResult;"
        }
    .end annotation

    .prologue
    .line 513
    iget-object v0, p0, Lcom/roidapp/baselib/c/c;->mFuture:Ljava/util/concurrent/FutureTask;

    invoke-virtual {v0}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TResult;"
        }
    .end annotation

    .prologue
    .line 533
    iget-object v0, p0, Lcom/roidapp/baselib/c/c;->mFuture:Ljava/util/concurrent/FutureTask;

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/concurrent/FutureTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getStatus$2cfd0ac4()I
    .locals 1

    .prologue
    .line 360
    iget v0, p0, Lcom/roidapp/baselib/c/c;->mStatus$3c38b363:I

    return v0
.end method

.method public final isCancelled()Z
    .locals 1

    .prologue
    .line 464
    iget-object v0, p0, Lcom/roidapp/baselib/c/c;->mCancelled:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method protected onCancelled()V
    .locals 0

    .prologue
    .line 451
    return-void
.end method

.method protected onCancelled(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    .prologue
    .line 435
    invoke-virtual {p0}, Lcom/roidapp/baselib/c/c;->onCancelled()V

    .line 436
    return-void
.end method

.method protected onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    .prologue
    .line 404
    return-void
.end method

.method protected onPreExecute()V
    .locals 0

    .prologue
    .line 388
    return-void
.end method

.method protected varargs onProgressUpdate([Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TProgress;)V"
        }
    .end annotation

    .prologue
    .line 417
    return-void
.end method

.method protected final varargs publishProgress([Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TProgress;)V"
        }
    .end annotation

    .prologue
    .line 652
    invoke-virtual {p0}, Lcom/roidapp/baselib/c/c;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 653
    sget-object v0, Lcom/roidapp/baselib/c/c;->sHandler:Lcom/roidapp/baselib/c/i;

    const/4 v1, 0x2

    new-instance v2, Lcom/roidapp/baselib/c/h;

    invoke-direct {v2, p0, p1}, Lcom/roidapp/baselib/c/h;-><init>(Lcom/roidapp/baselib/c/c;[Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/baselib/c/i;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 656
    :cond_0
    return-void
.end method
