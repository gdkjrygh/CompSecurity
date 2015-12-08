.class public abstract Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/concurrent/ThreadFactory;

.field private static final b:Ljava/util/concurrent/BlockingQueue;

.field private static final c:Lcom/cleanmaster/ui/app/market/loader/g;

.field private static volatile d:Ljava/util/concurrent/Executor;

.field public static final e:Ljava/util/concurrent/Executor;


# instance fields
.field private final f:Lcom/cleanmaster/ui/app/market/loader/h;

.field private final g:Ljava/util/concurrent/FutureTask;

.field private volatile h:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;

.field private final i:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    .line 165
    new-instance v0, Lcom/cleanmaster/ui/app/market/loader/b;

    invoke-direct {v0}, Lcom/cleanmaster/ui/app/market/loader/b;-><init>()V

    sput-object v0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->a:Ljava/util/concurrent/ThreadFactory;

    .line 173
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    sput-object v0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->b:Ljava/util/concurrent/BlockingQueue;

    .line 179
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v2, 0x3

    const/16 v3, 0x80

    const-wide/16 v4, 0x1

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    sget-object v7, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->b:Ljava/util/concurrent/BlockingQueue;

    sget-object v8, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->a:Ljava/util/concurrent/ThreadFactory;

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    sput-object v1, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->e:Ljava/util/concurrent/Executor;

    .line 188
    new-instance v0, Lcom/cleanmaster/ui/app/market/loader/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/cleanmaster/ui/app/market/loader/g;-><init>(B)V

    sput-object v0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->c:Lcom/cleanmaster/ui/app/market/loader/g;

    .line 190
    sget-object v0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->e:Ljava/util/concurrent/Executor;

    sput-object v0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->d:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 231
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 194
    sget-object v0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;->PENDING:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->h:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;

    .line 196
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 232
    new-instance v0, Lcom/cleanmaster/ui/app/market/loader/c;

    invoke-direct {v0, p0}, Lcom/cleanmaster/ui/app/market/loader/c;-><init>(Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;)V

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->f:Lcom/cleanmaster/ui/app/market/loader/h;

    .line 241
    new-instance v0, Lcom/cleanmaster/ui/app/market/loader/d;

    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->f:Lcom/cleanmaster/ui/app/market/loader/h;

    invoke-direct {v0, p0, v1}, Lcom/cleanmaster/ui/app/market/loader/d;-><init>(Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;Ljava/util/concurrent/Callable;)V

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->g:Ljava/util/concurrent/FutureTask;

    .line 261
    return-void
.end method

.method static synthetic a(Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 158
    invoke-direct {p0, p1}, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .prologue
    .line 158
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method static synthetic b(Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 158
    invoke-direct {p0, p1}, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->c(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic c(Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 158
    invoke-direct {p0, p1}, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->e(Ljava/lang/Object;)V

    return-void
.end method

.method private c(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 264
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    .line 265
    if-nez v0, :cond_0

    .line 266
    invoke-direct {p0, p1}, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    :cond_0
    return-void
.end method

.method private d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 271
    sget-object v0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->c:Lcom/cleanmaster/ui/app/market/loader/g;

    new-instance v1, Lcom/cleanmaster/ui/app/market/loader/f;

    new-array v2, v4, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-direct {v1, p0, v2}, Lcom/cleanmaster/ui/app/market/loader/f;-><init>(Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;[Ljava/lang/Object;)V

    invoke-virtual {v0, v4, v1}, Lcom/cleanmaster/ui/app/market/loader/g;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 273
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 274
    return-object p1
.end method

.method private e(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 572
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 573
    invoke-virtual {p0, p1}, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->b(Ljava/lang/Object;)V

    .line 577
    :goto_0
    sget-object v0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;->FINISHED:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->h:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;

    .line 578
    return-void

    .line 575
    :cond_0
    invoke-virtual {p0, p1}, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->a(Ljava/lang/Object;)V

    goto :goto_0
.end method


# virtual methods
.method public final varargs a(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;
    .locals 2

    .prologue
    .line 520
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->h:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;

    sget-object v1, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;->PENDING:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;

    if-eq v0, v1, :cond_0

    .line 521
    sget-object v0, Lcom/cleanmaster/ui/app/market/loader/e;->a:[I

    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->h:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;

    invoke-virtual {v1}, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 532
    :cond_0
    sget-object v0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;->RUNNING:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->h:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;

    .line 534
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->d()V

    .line 536
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->f:Lcom/cleanmaster/ui/app/market/loader/h;

    iput-object p2, v0, Lcom/cleanmaster/ui/app/market/loader/h;->b:[Ljava/lang/Object;

    .line 537
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->g:Ljava/util/concurrent/FutureTask;

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 539
    return-object p0

    .line 523
    :pswitch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot execute task: the task is already running."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 526
    :pswitch_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot execute task: the task has already been executed (a task can be executed only once)"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 521
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method protected varargs abstract a([Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method protected a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 327
    return-void
.end method

.method public final a(Z)Z
    .locals 1

    .prologue
    .line 420
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->g:Ljava/util/concurrent/FutureTask;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z

    move-result v0

    return v0
.end method

.method protected b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 358
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->e()V

    .line 359
    return-void
.end method

.method protected varargs b([Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 340
    return-void
.end method

.method public final c()Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;
    .locals 1

    .prologue
    .line 283
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->h:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;

    return-object v0
.end method

.method public final varargs c([Ljava/lang/Object;)Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;
    .locals 1

    .prologue
    .line 484
    sget-object v0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->d:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->a(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;

    move-result-object v0

    return-object v0
.end method

.method protected d()V
    .locals 0

    .prologue
    .line 311
    return-void
.end method

.method protected e()V
    .locals 0

    .prologue
    .line 374
    return-void
.end method

.method public final f()Z
    .locals 1

    .prologue
    .line 387
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->g:Ljava/util/concurrent/FutureTask;

    invoke-virtual {v0}, Ljava/util/concurrent/FutureTask;->isCancelled()Z

    move-result v0

    return v0
.end method
