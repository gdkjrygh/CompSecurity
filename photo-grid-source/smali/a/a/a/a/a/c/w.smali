.class public final La/a/a/a/a/c/w;
.super Ljava/util/concurrent/ThreadPoolExecutor;
.source "SourceFile"


# static fields
.field private static final a:I

.field private static final b:I

.field private static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 36
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    .line 37
    sput v0, La/a/a/a/a/c/w;->a:I

    add-int/lit8 v0, v0, 0x1

    sput v0, La/a/a/a/a/c/w;->b:I

    .line 38
    sget v0, La/a/a/a/a/c/w;->a:I

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x1

    sput v0, La/a/a/a/a/c/w;->c:I

    return-void
.end method

.method private constructor <init>(IILjava/util/concurrent/TimeUnit;La/a/a/a/a/c/m;Ljava/util/concurrent/ThreadFactory;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Runnable;",
            ":",
            "La/a/a/a/a/c/l;",
            ":",
            "La/a/a/a/a/c/y;",
            ":",
            "La/a/a/a/a/c/u;",
            ">(II",
            "Ljava/util/concurrent/TimeUnit;",
            "La/a/a/a/a/c/m",
            "<TT;>;",
            "Ljava/util/concurrent/ThreadFactory;",
            ")V"
        }
    .end annotation

    .prologue
    .line 48
    const-wide/16 v4, 0x1

    move-object v1, p0

    move v2, p1

    move v3, p2

    move-object v6, p3

    move-object v7, p4

    move-object v8, p5

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 50
    invoke-virtual {p0}, La/a/a/a/a/c/w;->prestartAllCoreThreads()I

    .line 51
    return-void
.end method

.method public static a()La/a/a/a/a/c/w;
    .locals 6

    .prologue
    .line 81
    sget v1, La/a/a/a/a/c/w;->b:I

    sget v2, La/a/a/a/a/c/w;->c:I

    .line 1061
    new-instance v0, La/a/a/a/a/c/w;

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v4, La/a/a/a/a/c/m;

    invoke-direct {v4}, La/a/a/a/a/c/m;-><init>()V

    new-instance v5, La/a/a/a/a/c/x;

    invoke-direct {v5}, La/a/a/a/a/c/x;-><init>()V

    invoke-direct/range {v0 .. v5}, La/a/a/a/a/c/w;-><init>(IILjava/util/concurrent/TimeUnit;La/a/a/a/a/c/m;Ljava/util/concurrent/ThreadFactory;)V

    .line 81
    return-object v0
.end method


# virtual methods
.method protected final afterExecute(Ljava/lang/Runnable;Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 106
    move-object v0, p1

    check-cast v0, La/a/a/a/a/c/y;

    .line 107
    const/4 v1, 0x1

    invoke-interface {v0, v1}, La/a/a/a/a/c/y;->a(Z)V

    .line 108
    invoke-interface {v0, p2}, La/a/a/a/a/c/y;->a(Ljava/lang/Throwable;)V

    .line 1118
    invoke-super {p0}, Ljava/util/concurrent/ThreadPoolExecutor;->getQueue()Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    check-cast v0, La/a/a/a/a/c/m;

    .line 110
    invoke-virtual {v0}, La/a/a/a/a/c/m;->a()V

    .line 112
    invoke-super {p0, p1, p2}, Ljava/util/concurrent/ThreadPoolExecutor;->afterExecute(Ljava/lang/Runnable;Ljava/lang/Throwable;)V

    .line 113
    return-void
.end method

.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    .prologue
    .line 96
    invoke-static {p1}, La/a/a/a/a/c/v;->b(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 97
    invoke-super {p0, p1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 101
    :goto_0
    return-void

    .line 99
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, La/a/a/a/a/c/w;->newTaskFor(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/RunnableFuture;

    move-result-object v0

    invoke-super {p0, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public final bridge synthetic getQueue()Ljava/util/concurrent/BlockingQueue;
    .locals 1

    .prologue
    .line 34
    .line 2118
    invoke-super {p0}, Ljava/util/concurrent/ThreadPoolExecutor;->getQueue()Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    check-cast v0, La/a/a/a/a/c/m;

    .line 34
    return-object v0
.end method

.method protected final newTaskFor(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/RunnableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Runnable;",
            "TT;)",
            "Ljava/util/concurrent/RunnableFuture",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 86
    new-instance v0, La/a/a/a/a/c/t;

    invoke-direct {v0, p1, p2}, La/a/a/a/a/c/t;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    return-object v0
.end method

.method protected final newTaskFor(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/RunnableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable",
            "<TT;>;)",
            "Ljava/util/concurrent/RunnableFuture",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 91
    new-instance v0, La/a/a/a/a/c/t;

    invoke-direct {v0, p1}, La/a/a/a/a/c/t;-><init>(Ljava/util/concurrent/Callable;)V

    return-object v0
.end method
