.class public abstract Lcom/android/core/AsyncTask;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/core/AsyncTask$4;,
        Lcom/android/core/AsyncTask$a;,
        Lcom/android/core/AsyncTask$d;,
        Lcom/android/core/AsyncTask$b;,
        Lcom/android/core/AsyncTask$Status;,
        Lcom/android/core/AsyncTask$c;
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

.field private static final c:Ljava/util/concurrent/ThreadFactory;

.field private static final d:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:Lcom/android/core/AsyncTask$b;

.field private static volatile f:Ljava/util/concurrent/Executor;


# instance fields
.field private final g:Lcom/android/core/AsyncTask$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/core/AsyncTask$d",
            "<TParams;TResult;>;"
        }
    .end annotation
.end field

.field private final h:Ljava/util/concurrent/FutureTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/FutureTask",
            "<TResult;>;"
        }
    .end annotation
.end field

.field private volatile i:Lcom/android/core/AsyncTask$Status;

.field private final j:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .prologue
    const/4 v9, 0x0

    .line 172
    new-instance v0, Lcom/android/core/AsyncTask$1;

    invoke-direct {v0}, Lcom/android/core/AsyncTask$1;-><init>()V

    sput-object v0, Lcom/android/core/AsyncTask;->c:Ljava/util/concurrent/ThreadFactory;

    .line 181
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    sput-object v0, Lcom/android/core/AsyncTask;->d:Ljava/util/concurrent/BlockingQueue;

    .line 186
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v2, 0x5

    const/16 v3, 0x80

    const-wide/16 v4, 0x1

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    sget-object v7, Lcom/android/core/AsyncTask;->d:Ljava/util/concurrent/BlockingQueue;

    sget-object v8, Lcom/android/core/AsyncTask;->c:Ljava/util/concurrent/ThreadFactory;

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    sput-object v1, Lcom/android/core/AsyncTask;->a:Ljava/util/concurrent/Executor;

    .line 193
    new-instance v0, Lcom/android/core/AsyncTask$c;

    invoke-direct {v0, v9}, Lcom/android/core/AsyncTask$c;-><init>(Lcom/android/core/AsyncTask$1;)V

    sput-object v0, Lcom/android/core/AsyncTask;->b:Ljava/util/concurrent/Executor;

    .line 198
    new-instance v0, Lcom/android/core/AsyncTask$b;

    invoke-direct {v0, v9}, Lcom/android/core/AsyncTask$b;-><init>(Lcom/android/core/AsyncTask$1;)V

    sput-object v0, Lcom/android/core/AsyncTask;->e:Lcom/android/core/AsyncTask$b;

    .line 200
    sget-object v0, Lcom/android/core/AsyncTask;->b:Ljava/util/concurrent/Executor;

    sput-object v0, Lcom/android/core/AsyncTask;->f:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 268
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 204
    sget-object v0, Lcom/android/core/AsyncTask$Status;->PENDING:Lcom/android/core/AsyncTask$Status;

    iput-object v0, p0, Lcom/android/core/AsyncTask;->i:Lcom/android/core/AsyncTask$Status;

    .line 206
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lcom/android/core/AsyncTask;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 269
    new-instance v0, Lcom/android/core/AsyncTask$2;

    invoke-direct {v0, p0}, Lcom/android/core/AsyncTask$2;-><init>(Lcom/android/core/AsyncTask;)V

    iput-object v0, p0, Lcom/android/core/AsyncTask;->g:Lcom/android/core/AsyncTask$d;

    .line 280
    new-instance v0, Lcom/android/core/AsyncTask$3;

    iget-object v1, p0, Lcom/android/core/AsyncTask;->g:Lcom/android/core/AsyncTask$d;

    invoke-direct {v0, p0, v1}, Lcom/android/core/AsyncTask$3;-><init>(Lcom/android/core/AsyncTask;Ljava/util/concurrent/Callable;)V

    iput-object v0, p0, Lcom/android/core/AsyncTask;->h:Ljava/util/concurrent/FutureTask;

    .line 298
    return-void
.end method

.method static synthetic a(Lcom/android/core/AsyncTask;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 165
    invoke-direct {p0, p1}, Lcom/android/core/AsyncTask;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/android/core/AsyncTask;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .prologue
    .line 165
    iget-object v0, p0, Lcom/android/core/AsyncTask;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method static synthetic b(Lcom/android/core/AsyncTask;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 165
    invoke-direct {p0, p1}, Lcom/android/core/AsyncTask;->c(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic c(Lcom/android/core/AsyncTask;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 165
    invoke-direct {p0, p1}, Lcom/android/core/AsyncTask;->e(Ljava/lang/Object;)V

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
    .line 301
    iget-object v0, p0, Lcom/android/core/AsyncTask;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    .line 302
    if-nez v0, :cond_0

    .line 303
    invoke-direct {p0, p1}, Lcom/android/core/AsyncTask;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
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

    .line 309
    sget-object v0, Lcom/android/core/AsyncTask;->e:Lcom/android/core/AsyncTask$b;

    new-instance v1, Lcom/android/core/AsyncTask$a;

    new-array v2, v4, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-direct {v1, p0, v2}, Lcom/android/core/AsyncTask$a;-><init>(Lcom/android/core/AsyncTask;[Ljava/lang/Object;)V

    invoke-virtual {v0, v4, v1}, Lcom/android/core/AsyncTask$b;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 310
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 311
    return-object p1
.end method

.method private e(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    .prologue
    .line 624
    invoke-virtual {p0}, Lcom/android/core/AsyncTask;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 625
    invoke-virtual {p0, p1}, Lcom/android/core/AsyncTask;->b(Ljava/lang/Object;)V

    .line 629
    :goto_0
    sget-object v0, Lcom/android/core/AsyncTask$Status;->FINISHED:Lcom/android/core/AsyncTask$Status;

    iput-object v0, p0, Lcom/android/core/AsyncTask;->i:Lcom/android/core/AsyncTask$Status;

    .line 630
    return-void

    .line 627
    :cond_0
    invoke-virtual {p0, p1}, Lcom/android/core/AsyncTask;->a(Ljava/lang/Object;)V

    goto :goto_0
.end method


# virtual methods
.method public final varargs a(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lcom/android/core/AsyncTask;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "[TParams;)",
            "Lcom/android/core/AsyncTask",
            "<TParams;TProgress;TResult;>;"
        }
    .end annotation

    .prologue
    .line 573
    iget-object v0, p0, Lcom/android/core/AsyncTask;->i:Lcom/android/core/AsyncTask$Status;

    sget-object v1, Lcom/android/core/AsyncTask$Status;->PENDING:Lcom/android/core/AsyncTask$Status;

    if-eq v0, v1, :cond_0

    .line 574
    sget-object v0, Lcom/android/core/AsyncTask$4;->a:[I

    iget-object v1, p0, Lcom/android/core/AsyncTask;->i:Lcom/android/core/AsyncTask$Status;

    invoke-virtual {v1}, Lcom/android/core/AsyncTask$Status;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 585
    :cond_0
    sget-object v0, Lcom/android/core/AsyncTask$Status;->RUNNING:Lcom/android/core/AsyncTask$Status;

    iput-object v0, p0, Lcom/android/core/AsyncTask;->i:Lcom/android/core/AsyncTask$Status;

    .line 587
    invoke-virtual {p0}, Lcom/android/core/AsyncTask;->a()V

    .line 589
    iget-object v0, p0, Lcom/android/core/AsyncTask;->g:Lcom/android/core/AsyncTask$d;

    iput-object p2, v0, Lcom/android/core/AsyncTask$d;->b:[Ljava/lang/Object;

    .line 590
    iget-object v0, p0, Lcom/android/core/AsyncTask;->h:Ljava/util/concurrent/FutureTask;

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 592
    return-object p0

    .line 576
    :pswitch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "Cannot execute task: the task is already running."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 578
    :pswitch_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "Cannot execute task: the task has already been executed (a task can be executed only once)"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 574
    :pswitch_data_0
    .packed-switch 0x1
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
    .line 348
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
    .line 368
    return-void
.end method

.method protected b()V
    .locals 0

    .prologue
    .line 420
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
    .line 401
    invoke-virtual {p0}, Lcom/android/core/AsyncTask;->b()V

    .line 402
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
    .line 381
    return-void
.end method

.method public final varargs c([Ljava/lang/Object;)Lcom/android/core/AsyncTask;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TParams;)",
            "Lcom/android/core/AsyncTask",
            "<TParams;TProgress;TResult;>;"
        }
    .end annotation

    .prologue
    .line 537
    sget-object v0, Lcom/android/core/AsyncTask;->f:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lcom/android/core/AsyncTask;->a(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lcom/android/core/AsyncTask;

    move-result-object v0

    return-object v0
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 433
    iget-object v0, p0, Lcom/android/core/AsyncTask;->h:Ljava/util/concurrent/FutureTask;

    invoke-virtual {v0}, Ljava/util/concurrent/FutureTask;->isCancelled()Z

    move-result v0

    return v0
.end method

.method protected final varargs d([Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TProgress;)V"
        }
    .end annotation

    .prologue
    .line 618
    invoke-virtual {p0}, Lcom/android/core/AsyncTask;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 619
    sget-object v0, Lcom/android/core/AsyncTask;->e:Lcom/android/core/AsyncTask$b;

    const/4 v1, 0x2

    new-instance v2, Lcom/android/core/AsyncTask$a;

    invoke-direct {v2, p0, p1}, Lcom/android/core/AsyncTask$a;-><init>(Lcom/android/core/AsyncTask;[Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, Lcom/android/core/AsyncTask$b;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 621
    :cond_0
    return-void
.end method
