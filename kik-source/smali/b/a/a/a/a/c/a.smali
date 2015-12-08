.class public abstract Lb/a/a/a/a/c/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/a/a/a/a/c/a$1;,
        Lb/a/a/a/a/c/a$a;,
        Lb/a/a/a/a/c/a$e;,
        Lb/a/a/a/a/c/a$b;,
        Lb/a/a/a/a/c/a$d;,
        Lb/a/a/a/a/c/a$c;
    }
.end annotation


# static fields
.field private static final a:I

.field public static final b:Ljava/util/concurrent/Executor;

.field public static final c:Ljava/util/concurrent/Executor;

.field private static final d:I

.field private static final e:I

.field private static final f:Ljava/util/concurrent/ThreadFactory;

.field private static final g:Ljava/util/concurrent/BlockingQueue;

.field private static final h:Lb/a/a/a/a/c/a$b;

.field private static volatile i:Ljava/util/concurrent/Executor;


# instance fields
.field private final j:Lb/a/a/a/a/c/a$e;

.field private final k:Ljava/util/concurrent/FutureTask;

.field private volatile l:I

.field private final m:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final n:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    .line 203
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    .line 204
    sput v0, Lb/a/a/a/a/c/a;->a:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lb/a/a/a/a/c/a;->d:I

    .line 205
    sget v0, Lb/a/a/a/a/c/a;->a:I

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x1

    sput v0, Lb/a/a/a/a/c/a;->e:I

    .line 208
    new-instance v0, Lb/a/a/a/a/c/b;

    invoke-direct {v0}, Lb/a/a/a/a/c/b;-><init>()V

    sput-object v0, Lb/a/a/a/a/c/a;->f:Ljava/util/concurrent/ThreadFactory;

    .line 216
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    sput-object v0, Lb/a/a/a/a/c/a;->g:Ljava/util/concurrent/BlockingQueue;

    .line 222
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    sget v2, Lb/a/a/a/a/c/a;->d:I

    sget v3, Lb/a/a/a/a/c/a;->e:I

    const-wide/16 v4, 0x1

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    sget-object v7, Lb/a/a/a/a/c/a;->g:Ljava/util/concurrent/BlockingQueue;

    sget-object v8, Lb/a/a/a/a/c/a;->f:Ljava/util/concurrent/ThreadFactory;

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    sput-object v1, Lb/a/a/a/a/c/a;->b:Ljava/util/concurrent/Executor;

    .line 230
    new-instance v0, Lb/a/a/a/a/c/a$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb/a/a/a/a/c/a$c;-><init>(B)V

    sput-object v0, Lb/a/a/a/a/c/a;->c:Ljava/util/concurrent/Executor;

    .line 235
    new-instance v0, Lb/a/a/a/a/c/a$b;

    invoke-direct {v0}, Lb/a/a/a/a/c/a$b;-><init>()V

    sput-object v0, Lb/a/a/a/a/c/a;->h:Lb/a/a/a/a/c/a$b;

    .line 237
    sget-object v0, Lb/a/a/a/a/c/a;->c:Ljava/util/concurrent/Executor;

    sput-object v0, Lb/a/a/a/a/c/a;->i:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 304
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 241
    sget v0, Lb/a/a/a/a/c/a$d;->a:I

    iput v0, p0, Lb/a/a/a/a/c/a;->l:I

    .line 243
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lb/a/a/a/a/c/a;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 244
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lb/a/a/a/a/c/a;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 305
    new-instance v0, Lb/a/a/a/a/c/c;

    invoke-direct {v0, p0}, Lb/a/a/a/a/c/c;-><init>(Lb/a/a/a/a/c/a;)V

    iput-object v0, p0, Lb/a/a/a/a/c/a;->j:Lb/a/a/a/a/c/a$e;

    .line 315
    new-instance v0, Lb/a/a/a/a/c/d;

    iget-object v1, p0, Lb/a/a/a/a/c/a;->j:Lb/a/a/a/a/c/a$e;

    invoke-direct {v0, p0, v1}, Lb/a/a/a/a/c/d;-><init>(Lb/a/a/a/a/c/a;Ljava/util/concurrent/Callable;)V

    iput-object v0, p0, Lb/a/a/a/a/c/a;->k:Ljava/util/concurrent/FutureTask;

    .line 330
    return-void
.end method

.method static synthetic a(Lb/a/a/a/a/c/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 200
    invoke-direct {p0, p1}, Lb/a/a/a/a/c/a;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lb/a/a/a/a/c/a;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .prologue
    .line 200
    iget-object v0, p0, Lb/a/a/a/a/c/a;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method private b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 341
    sget-object v0, Lb/a/a/a/a/c/a;->h:Lb/a/a/a/a/c/a$b;

    new-instance v1, Lb/a/a/a/a/c/a$a;

    new-array v2, v4, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-direct {v1, p0, v2}, Lb/a/a/a/a/c/a$a;-><init>(Lb/a/a/a/a/c/a;[Ljava/lang/Object;)V

    invoke-virtual {v0, v4, v1}, Lb/a/a/a/a/c/a$b;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 343
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 344
    return-object p1
.end method

.method static synthetic b(Lb/a/a/a/a/c/a;)V
    .locals 1

    .prologue
    .line 200
    iget-object v0, p0, Lb/a/a/a/a/c/a;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lb/a/a/a/a/c/a;->d()V

    :goto_0
    sget v0, Lb/a/a/a/a/c/a$d;->c:I

    iput v0, p0, Lb/a/a/a/a/c/a;->l:I

    return-void

    :cond_0
    invoke-virtual {p0}, Lb/a/a/a/a/c/a;->c()V

    goto :goto_0
.end method

.method static synthetic b(Lb/a/a/a/a/c/a;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 200
    iget-object v0, p0, Lb/a/a/a/a/c/a;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lb/a/a/a/a/c/a;->b(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method protected static varargs i_()V
    .locals 0

    .prologue
    .line 410
    return-void
.end method


# virtual methods
.method public final varargs a(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lb/a/a/a/a/c/a;
    .locals 2

    .prologue
    .line 596
    iget v0, p0, Lb/a/a/a/a/c/a;->l:I

    sget v1, Lb/a/a/a/a/c/a$d;->a:I

    if-eq v0, v1, :cond_0

    .line 597
    sget-object v0, Lb/a/a/a/a/c/a$1;->a:[I

    iget v1, p0, Lb/a/a/a/a/c/a;->l:I

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 609
    :cond_0
    sget v0, Lb/a/a/a/a/c/a$d;->b:I

    iput v0, p0, Lb/a/a/a/a/c/a;->l:I

    .line 611
    invoke-virtual {p0}, Lb/a/a/a/a/c/a;->b()V

    .line 613
    iget-object v0, p0, Lb/a/a/a/a/c/a;->j:Lb/a/a/a/a/c/a$e;

    iput-object p2, v0, Lb/a/a/a/a/c/a$e;->b:[Ljava/lang/Object;

    .line 614
    iget-object v0, p0, Lb/a/a/a/a/c/a;->k:Ljava/util/concurrent/FutureTask;

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 616
    return-object p0

    .line 599
    :pswitch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot execute task: the task is already running."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 602
    :pswitch_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot execute task: the task has already been executed (a task can be executed only once)"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 597
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method protected b()V
    .locals 0

    .prologue
    .line 381
    return-void
.end method

.method protected c()V
    .locals 0

    .prologue
    .line 397
    return-void
.end method

.method protected d()V
    .locals 0

    .prologue
    .line 428
    return-void
.end method

.method protected varargs abstract e()Ljava/lang/Object;
.end method

.method public final h()Z
    .locals 1

    .prologue
    .line 457
    iget-object v0, p0, Lb/a/a/a/a/c/a;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public final h_()I
    .locals 1

    .prologue
    .line 353
    iget v0, p0, Lb/a/a/a/a/c/a;->l:I

    return v0
.end method

.method public final i()Z
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 490
    iget-object v0, p0, Lb/a/a/a/a/c/a;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 491
    iget-object v0, p0, Lb/a/a/a/a/c/a;->k:Ljava/util/concurrent/FutureTask;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z

    move-result v0

    return v0
.end method
