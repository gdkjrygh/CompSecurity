.class abstract Landroid/support/v4/a/i;
.super Ljava/lang/Object;
.source "ModernAsyncTask.java"


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
.field private static final a:Ljava/util/concurrent/ThreadFactory;

.field private static final b:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Landroid/support/v4/a/o;

.field public static final d:Ljava/util/concurrent/Executor;

.field private static volatile e:Ljava/util/concurrent/Executor;


# instance fields
.field private final f:Landroid/support/v4/a/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/a/q",
            "<TParams;TResult;>;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/concurrent/FutureTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/FutureTask",
            "<TResult;>;"
        }
    .end annotation
.end field

.field private volatile h:Landroid/support/v4/a/p;

.field private final i:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    .line 54
    new-instance v0, Landroid/support/v4/a/j;

    invoke-direct {v0}, Landroid/support/v4/a/j;-><init>()V

    sput-object v0, Landroid/support/v4/a/i;->a:Ljava/util/concurrent/ThreadFactory;

    .line 62
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    sput-object v0, Landroid/support/v4/a/i;->b:Ljava/util/concurrent/BlockingQueue;

    .line 68
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v1, 0x5

    const/16 v2, 0x80

    const-wide/16 v3, 0x1

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    sget-object v6, Landroid/support/v4/a/i;->b:Ljava/util/concurrent/BlockingQueue;

    sget-object v7, Landroid/support/v4/a/i;->a:Ljava/util/concurrent/ThreadFactory;

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    sput-object v0, Landroid/support/v4/a/i;->d:Ljava/util/concurrent/Executor;

    .line 75
    new-instance v0, Landroid/support/v4/a/o;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid/support/v4/a/o;-><init>(Landroid/support/v4/a/j;)V

    sput-object v0, Landroid/support/v4/a/i;->c:Landroid/support/v4/a/o;

    .line 77
    sget-object v0, Landroid/support/v4/a/i;->d:Ljava/util/concurrent/Executor;

    sput-object v0, Landroid/support/v4/a/i;->e:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    sget-object v0, Landroid/support/v4/a/p;->PENDING:Landroid/support/v4/a/p;

    iput-object v0, p0, Landroid/support/v4/a/i;->h:Landroid/support/v4/a/p;

    .line 83
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Landroid/support/v4/a/i;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 118
    new-instance v0, Landroid/support/v4/a/k;

    invoke-direct {v0, p0}, Landroid/support/v4/a/k;-><init>(Landroid/support/v4/a/i;)V

    iput-object v0, p0, Landroid/support/v4/a/i;->f:Landroid/support/v4/a/q;

    .line 127
    new-instance v0, Landroid/support/v4/a/l;

    iget-object v1, p0, Landroid/support/v4/a/i;->f:Landroid/support/v4/a/q;

    invoke-direct {v0, p0, v1}, Landroid/support/v4/a/l;-><init>(Landroid/support/v4/a/i;Ljava/util/concurrent/Callable;)V

    iput-object v0, p0, Landroid/support/v4/a/i;->g:Ljava/util/concurrent/FutureTask;

    .line 147
    return-void
.end method

.method static synthetic a(Landroid/support/v4/a/i;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 47
    invoke-direct {p0, p1}, Landroid/support/v4/a/i;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Landroid/support/v4/a/i;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Landroid/support/v4/a/i;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method static synthetic b(Landroid/support/v4/a/i;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0, p1}, Landroid/support/v4/a/i;->c(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic c(Landroid/support/v4/a/i;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0, p1}, Landroid/support/v4/a/i;->e(Ljava/lang/Object;)V

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
    .line 150
    iget-object v0, p0, Landroid/support/v4/a/i;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    .line 151
    if-nez v0, :cond_0

    .line 152
    invoke-direct {p0, p1}, Landroid/support/v4/a/i;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
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

    .line 157
    sget-object v0, Landroid/support/v4/a/i;->c:Landroid/support/v4/a/o;

    new-instance v1, Landroid/support/v4/a/n;

    new-array v2, v4, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-direct {v1, p0, v2}, Landroid/support/v4/a/n;-><init>(Landroid/support/v4/a/i;[Ljava/lang/Object;)V

    invoke-virtual {v0, v4, v1}, Landroid/support/v4/a/o;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 159
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 160
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
    .line 458
    invoke-virtual {p0}, Landroid/support/v4/a/i;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 459
    invoke-virtual {p0, p1}, Landroid/support/v4/a/i;->b(Ljava/lang/Object;)V

    .line 463
    :goto_0
    sget-object v0, Landroid/support/v4/a/p;->FINISHED:Landroid/support/v4/a/p;

    iput-object v0, p0, Landroid/support/v4/a/i;->h:Landroid/support/v4/a/p;

    .line 464
    return-void

    .line 461
    :cond_0
    invoke-virtual {p0, p1}, Landroid/support/v4/a/i;->a(Ljava/lang/Object;)V

    goto :goto_0
.end method


# virtual methods
.method public final varargs a(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/support/v4/a/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "[TParams;)",
            "Landroid/support/v4/a/i",
            "<TParams;TProgress;TResult;>;"
        }
    .end annotation

    .prologue
    .line 406
    iget-object v0, p0, Landroid/support/v4/a/i;->h:Landroid/support/v4/a/p;

    sget-object v1, Landroid/support/v4/a/p;->PENDING:Landroid/support/v4/a/p;

    if-eq v0, v1, :cond_0

    .line 407
    sget-object v0, Landroid/support/v4/a/m;->a:[I

    iget-object v1, p0, Landroid/support/v4/a/i;->h:Landroid/support/v4/a/p;

    invoke-virtual {v1}, Landroid/support/v4/a/p;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 418
    :cond_0
    sget-object v0, Landroid/support/v4/a/p;->RUNNING:Landroid/support/v4/a/p;

    iput-object v0, p0, Landroid/support/v4/a/i;->h:Landroid/support/v4/a/p;

    .line 420
    invoke-virtual {p0}, Landroid/support/v4/a/i;->b()V

    .line 422
    iget-object v0, p0, Landroid/support/v4/a/i;->f:Landroid/support/v4/a/q;

    iput-object p2, v0, Landroid/support/v4/a/q;->b:[Ljava/lang/Object;

    .line 423
    iget-object v0, p0, Landroid/support/v4/a/i;->g:Ljava/util/concurrent/FutureTask;

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 425
    return-object p0

    .line 409
    :pswitch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot execute task: the task is already running."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 412
    :pswitch_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot execute task: the task has already been executed (a task can be executed only once)"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 407
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
    .line 260
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
    .line 213
    return-void
.end method

.method public final a(Z)Z
    .locals 1

    .prologue
    .line 306
    iget-object v0, p0, Landroid/support/v4/a/i;->g:Ljava/util/concurrent/FutureTask;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z

    move-result v0

    return v0
.end method

.method protected b()V
    .locals 0

    .prologue
    .line 197
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
    .line 244
    invoke-virtual {p0}, Landroid/support/v4/a/i;->a()V

    .line 245
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
    .line 226
    return-void
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 273
    iget-object v0, p0, Landroid/support/v4/a/i;->g:Ljava/util/concurrent/FutureTask;

    invoke-virtual {v0}, Ljava/util/concurrent/FutureTask;->isCancelled()Z

    move-result v0

    return v0
.end method
