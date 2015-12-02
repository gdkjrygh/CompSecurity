.class public abstract Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$a;,
        Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$b;,
        Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;,
        Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$c;
    }
.end annotation

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
.field public static final a:Ljava/util/concurrent/Executor;

.field public static final b:Ljava/util/concurrent/Executor;

.field private static final c:I

.field private static final d:I

.field private static final e:I

.field private static final f:Ljava/util/concurrent/ThreadFactory;

.field private static final g:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private static final h:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$b;

.field private static volatile i:Ljava/util/concurrent/Executor;

.field private static synthetic o:[I


# instance fields
.field private final j:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$c",
            "<TParams;TResult;>;"
        }
    .end annotation
.end field

.field private final k:Ljava/util/concurrent/FutureTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/FutureTask",
            "<TResult;>;"
        }
    .end annotation
.end field

.field private volatile l:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

.field private final m:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final n:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    .line 195
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    sput v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->c:I

    .line 196
    sget v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->c:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->d:I

    .line 197
    sget v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->c:I

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->e:I

    .line 200
    new-instance v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$1;

    invoke-direct {v0}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$1;-><init>()V

    sput-object v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->f:Ljava/util/concurrent/ThreadFactory;

    .line 208
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    sput-object v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->g:Ljava/util/concurrent/BlockingQueue;

    .line 213
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    sget v2, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->d:I

    sget v3, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->e:I

    .line 214
    const-wide/16 v4, 0x1

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    sget-object v7, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->g:Ljava/util/concurrent/BlockingQueue;

    sget-object v8, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->f:Ljava/util/concurrent/ThreadFactory;

    .line 213
    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    sput-object v1, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->a:Ljava/util/concurrent/Executor;

    .line 220
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->b:Ljava/util/concurrent/Executor;

    .line 225
    new-instance v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$b;-><init>(Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$b;)V

    sput-object v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->h:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$b;

    .line 227
    sget-object v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->b:Ljava/util/concurrent/Executor;

    sput-object v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->i:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 268
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 231
    sget-object v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;->PENDING:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->l:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

    .line 233
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 234
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 269
    new-instance v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$2;

    invoke-direct {v0, p0}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$2;-><init>(Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;)V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->j:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$c;

    .line 278
    new-instance v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$3;

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->j:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$c;

    invoke-direct {v0, p0, v1}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$3;-><init>(Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;Ljava/util/concurrent/Callable;)V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->k:Ljava/util/concurrent/FutureTask;

    .line 292
    return-void
.end method

.method static synthetic a(Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .prologue
    .line 234
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 628
    invoke-direct {p0, p1}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->e(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic b(Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 301
    invoke-direct {p0, p1}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 294
    invoke-direct {p0, p1}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->c(Ljava/lang/Object;)V

    return-void
.end method

.method private c(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    .prologue
    .line 295
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    .line 296
    if-nez v0, :cond_0

    .line 297
    invoke-direct {p0, p1}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    :cond_0
    return-void
.end method

.method private d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)TResult;"
        }
    .end annotation

    .prologue
    const/4 v4, 0x1

    .line 303
    sget-object v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->h:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$b;

    new-instance v1, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$a;

    new-array v2, v4, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-direct {v1, p0, v2}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$a;-><init>(Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;[Ljava/lang/Object;)V

    invoke-virtual {v0, v4, v1}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$b;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 304
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 305
    return-object p1
.end method

.method static synthetic d()[I
    .locals 3

    .prologue
    .line 192
    sget-object v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->o:[I

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;->values()[Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;->FINISHED:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

    invoke-virtual {v1}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_2

    :goto_1
    :try_start_1
    sget-object v1, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;->PENDING:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

    invoke-virtual {v1}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :goto_2
    :try_start_2
    sget-object v1, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;->RUNNING:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

    invoke-virtual {v1}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_0

    :goto_3
    sput-object v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->o:[I

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_3

    :catch_1
    move-exception v1

    goto :goto_2

    :catch_2
    move-exception v1

    goto :goto_1
.end method

.method private e(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    .prologue
    .line 629
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 630
    invoke-virtual {p0, p1}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->b(Ljava/lang/Object;)V

    .line 634
    :goto_0
    sget-object v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;->FINISHED:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->l:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

    .line 635
    return-void

    .line 632
    :cond_0
    invoke-virtual {p0, p1}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->a(Ljava/lang/Object;)V

    goto :goto_0
.end method


# virtual methods
.method public final varargs a(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "[TParams;)",
            "Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19",
            "<TParams;TProgress;TResult;>;"
        }
    .end annotation

    .prologue
    .line 576
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->l:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

    sget-object v1, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;->PENDING:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

    if-eq v0, v1, :cond_0

    .line 577
    invoke-static {}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->d()[I

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->l:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

    invoke-virtual {v1}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 586
    :cond_0
    sget-object v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;->RUNNING:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->l:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

    .line 588
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->a()V

    .line 590
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->j:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$c;

    iput-object p2, v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$c;->b:[Ljava/lang/Object;

    .line 591
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->k:Ljava/util/concurrent/FutureTask;

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 593
    return-object p0

    .line 579
    :pswitch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "Cannot execute task: the task is already running."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 581
    :pswitch_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "Cannot execute task: the task has already been executed (a task can be executed only once)"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 577
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method protected varargs abstract a([Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TParams;)TResult;"
        }
    .end annotation
.end method

.method protected a()V
    .locals 0

    .prologue
    .line 342
    return-void
.end method

.method protected a(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    .prologue
    .line 363
    return-void
.end method

.method protected b()V
    .locals 0

    .prologue
    .line 417
    return-void
.end method

.method protected b(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    .prologue
    .line 398
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->b()V

    .line 399
    return-void
.end method

.method protected varargs b([Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TProgress;)V"
        }
    .end annotation

    .prologue
    .line 377
    return-void
.end method

.method protected final varargs c([Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TProgress;)V"
        }
    .end annotation

    .prologue
    .line 623
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 624
    sget-object v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->h:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$b;

    const/4 v1, 0x2

    new-instance v2, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$a;

    invoke-direct {v2, p0, p1}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$a;-><init>(Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;[Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$b;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 626
    :cond_0
    return-void
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 430
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method
