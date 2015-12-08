.class public final Lbolts/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final a:Ljava/util/concurrent/ExecutorService;

.field public static final b:Ljava/util/concurrent/Executor;

.field private static final c:Ljava/util/concurrent/Executor;


# instance fields
.field private final d:Ljava/lang/Object;

.field private e:Z

.field private f:Z

.field private g:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TTResult;"
        }
    .end annotation
.end field

.field private h:Ljava/lang/Exception;

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lbolts/i",
            "<TTResult;",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 31
    invoke-static {}, Lbolts/f;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lbolts/j;->a:Ljava/util/concurrent/ExecutorService;

    .line 38
    invoke-static {}, Lbolts/f;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    sput-object v0, Lbolts/j;->c:Ljava/util/concurrent/Executor;

    .line 43
    invoke-static {}, Lbolts/a;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    sput-object v0, Lbolts/j;->b:Ljava/util/concurrent/Executor;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lbolts/j;->d:Ljava/lang/Object;

    .line 53
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lbolts/j;->i:Ljava/util/List;

    .line 54
    return-void
.end method

.method private a(Lbolts/i;Ljava/util/concurrent/Executor;)Lbolts/j;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lbolts/i",
            "<TTResult;TTContinuationResult;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lbolts/j",
            "<TTContinuationResult;>;"
        }
    .end annotation

    .prologue
    .line 309
    invoke-static {}, Lbolts/j;->a()Lbolts/q;

    move-result-object v0

    .line 310
    iget-object v1, p0, Lbolts/j;->d:Ljava/lang/Object;

    monitor-enter v1

    .line 311
    :try_start_0
    invoke-direct {p0}, Lbolts/j;->g()Z

    move-result v2

    .line 312
    if-nez v2, :cond_0

    .line 313
    iget-object v3, p0, Lbolts/j;->i:Ljava/util/List;

    new-instance v4, Lbolts/m;

    invoke-direct {v4, p0, v0, p1, p2}, Lbolts/m;-><init>(Lbolts/j;Lbolts/q;Lbolts/i;Ljava/util/concurrent/Executor;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 321
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 322
    if-eqz v2, :cond_1

    .line 323
    invoke-static {v0, p1, p0, p2}, Lbolts/j;->c(Lbolts/q;Lbolts/i;Lbolts/j;Ljava/util/concurrent/Executor;)V

    .line 4540
    :cond_1
    iget-object v0, v0, Lbolts/q;->a:Lbolts/j;

    .line 325
    return-object v0

    .line 321
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public static a(Ljava/lang/Exception;)Lbolts/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Exception;",
            ")",
            "Lbolts/j",
            "<TTResult;>;"
        }
    .end annotation

    .prologue
    .line 137
    invoke-static {}, Lbolts/j;->a()Lbolts/q;

    move-result-object v0

    .line 138
    invoke-virtual {v0, p0}, Lbolts/q;->a(Ljava/lang/Exception;)V

    .line 2540
    iget-object v0, v0, Lbolts/q;->a:Lbolts/j;

    .line 139
    return-object v0
.end method

.method public static a(Ljava/lang/Object;)Lbolts/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(TTResult;)",
            "Lbolts/j",
            "<TTResult;>;"
        }
    .end annotation

    .prologue
    .line 128
    invoke-static {}, Lbolts/j;->a()Lbolts/q;

    move-result-object v0

    .line 129
    invoke-virtual {v0, p0}, Lbolts/q;->a(Ljava/lang/Object;)V

    .line 1540
    iget-object v0, v0, Lbolts/q;->a:Lbolts/j;

    .line 130
    return-object v0
.end method

.method public static a()Lbolts/q;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">()",
            "Lbolts/j",
            "<TTResult;>.bolts/q;"
        }
    .end annotation

    .prologue
    .line 63
    new-instance v0, Lbolts/j;

    invoke-direct {v0}, Lbolts/j;-><init>()V

    .line 64
    new-instance v1, Lbolts/q;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lbolts/q;-><init>(Lbolts/j;B)V

    return-object v1
.end method

.method static synthetic a(Lbolts/j;Ljava/lang/Exception;)Ljava/lang/Exception;
    .locals 0

    .prologue
    .line 27
    iput-object p1, p0, Lbolts/j;->h:Ljava/lang/Exception;

    return-object p1
.end method

.method static synthetic a(Lbolts/j;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lbolts/j;->d:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic a(Lbolts/j;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 27
    iput-object p1, p0, Lbolts/j;->g:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic a(Lbolts/q;Lbolts/i;Lbolts/j;Ljava/util/concurrent/Executor;)V
    .locals 0

    .prologue
    .line 27
    invoke-static {p0, p1, p2, p3}, Lbolts/j;->c(Lbolts/q;Lbolts/i;Lbolts/j;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method private b(Lbolts/i;Ljava/util/concurrent/Executor;)Lbolts/j;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lbolts/i",
            "<TTResult;",
            "Lbolts/j",
            "<TTContinuationResult;>;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lbolts/j",
            "<TTContinuationResult;>;"
        }
    .end annotation

    .prologue
    .line 344
    invoke-static {}, Lbolts/j;->a()Lbolts/q;

    move-result-object v0

    .line 345
    iget-object v1, p0, Lbolts/j;->d:Ljava/lang/Object;

    monitor-enter v1

    .line 346
    :try_start_0
    invoke-direct {p0}, Lbolts/j;->g()Z

    move-result v2

    .line 347
    if-nez v2, :cond_0

    .line 348
    iget-object v3, p0, Lbolts/j;->i:Ljava/util/List;

    new-instance v4, Lbolts/n;

    invoke-direct {v4, p0, v0, p1, p2}, Lbolts/n;-><init>(Lbolts/j;Lbolts/q;Lbolts/i;Ljava/util/concurrent/Executor;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 356
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 357
    if-eqz v2, :cond_1

    .line 358
    invoke-static {v0, p1, p0, p2}, Lbolts/j;->d(Lbolts/q;Lbolts/i;Lbolts/j;Ljava/util/concurrent/Executor;)V

    .line 5540
    :cond_1
    iget-object v0, v0, Lbolts/q;->a:Lbolts/j;

    .line 360
    return-object v0

    .line 356
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method static synthetic b(Lbolts/q;Lbolts/i;Lbolts/j;Ljava/util/concurrent/Executor;)V
    .locals 0

    .prologue
    .line 27
    invoke-static {p0, p1, p2, p3}, Lbolts/j;->d(Lbolts/q;Lbolts/i;Lbolts/j;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method static synthetic b(Lbolts/j;)Z
    .locals 1

    .prologue
    .line 27
    iget-boolean v0, p0, Lbolts/j;->e:Z

    return v0
.end method

.method private static c(Lbolts/q;Lbolts/i;Lbolts/j;Ljava/util/concurrent/Executor;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            "TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lbolts/j",
            "<TTContinuationResult;>.bolts/q;",
            "Lbolts/i",
            "<TTResult;TTContinuationResult;>;",
            "Lbolts/j",
            "<TTResult;>;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    .prologue
    .line 449
    new-instance v0, Lbolts/p;

    invoke-direct {v0, p1, p2, p0}, Lbolts/p;-><init>(Lbolts/i;Lbolts/j;Lbolts/q;)V

    invoke-interface {p3, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 460
    return-void
.end method

.method static synthetic c(Lbolts/j;)Z
    .locals 1

    .prologue
    .line 27
    const/4 v0, 0x1

    iput-boolean v0, p0, Lbolts/j;->e:Z

    return v0
.end method

.method private static d(Lbolts/q;Lbolts/i;Lbolts/j;Ljava/util/concurrent/Executor;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            "TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lbolts/j",
            "<TTContinuationResult;>.bolts/q;",
            "Lbolts/i",
            "<TTResult;",
            "Lbolts/j",
            "<TTContinuationResult;>;>;",
            "Lbolts/j",
            "<TTResult;>;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    .prologue
    .line 482
    new-instance v0, Lbolts/k;

    invoke-direct {v0, p1, p2, p0}, Lbolts/k;-><init>(Lbolts/i;Lbolts/j;Lbolts/q;)V

    invoke-interface {p3, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 509
    return-void
.end method

.method static synthetic d(Lbolts/j;)Z
    .locals 1

    .prologue
    .line 27
    const/4 v0, 0x1

    iput-boolean v0, p0, Lbolts/j;->f:Z

    return v0
.end method

.method static synthetic e(Lbolts/j;)V
    .locals 3

    .prologue
    .line 27
    .line 6512
    iget-object v1, p0, Lbolts/j;->d:Ljava/lang/Object;

    monitor-enter v1

    .line 6513
    :try_start_0
    iget-object v0, p0, Lbolts/j;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbolts/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6515
    :try_start_1
    invoke-interface {v0, p0}, Lbolts/i;->then(Lbolts/j;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 6517
    :catch_0
    move-exception v0

    :try_start_2
    throw v0

    .line 6523
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 6518
    :catch_1
    move-exception v0

    .line 6519
    :try_start_3
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    .line 6522
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lbolts/j;->i:Ljava/util/List;

    .line 6523
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    return-void
.end method

.method public static f()Lbolts/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">()",
            "Lbolts/j",
            "<TTResult;>;"
        }
    .end annotation

    .prologue
    .line 146
    invoke-static {}, Lbolts/j;->a()Lbolts/q;

    move-result-object v0

    .line 147
    invoke-virtual {v0}, Lbolts/q;->b()V

    .line 3540
    iget-object v0, v0, Lbolts/q;->a:Lbolts/j;

    .line 148
    return-object v0
.end method

.method private g()Z
    .locals 2

    .prologue
    .line 72
    iget-object v1, p0, Lbolts/j;->d:Ljava/lang/Object;

    monitor-enter v1

    .line 73
    :try_start_0
    iget-boolean v0, p0, Lbolts/j;->e:Z

    monitor-exit v1

    return v0

    .line 74
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method public final a(Lbolts/i;)Lbolts/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lbolts/i",
            "<TTResult;TTContinuationResult;>;)",
            "Lbolts/j",
            "<TTContinuationResult;>;"
        }
    .end annotation

    .prologue
    .line 334
    sget-object v0, Lbolts/j;->c:Ljava/util/concurrent/Executor;

    invoke-direct {p0, p1, v0}, Lbolts/j;->a(Lbolts/i;Ljava/util/concurrent/Executor;)Lbolts/j;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lbolts/i;)Lbolts/j;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lbolts/i",
            "<TTResult;TTContinuationResult;>;)",
            "Lbolts/j",
            "<TTContinuationResult;>;"
        }
    .end annotation

    .prologue
    .line 398
    sget-object v0, Lbolts/j;->c:Ljava/util/concurrent/Executor;

    .line 6378
    new-instance v1, Lbolts/o;

    invoke-direct {v1, p0, p1}, Lbolts/o;-><init>(Lbolts/j;Lbolts/i;)V

    invoke-direct {p0, v1, v0}, Lbolts/j;->b(Lbolts/i;Ljava/util/concurrent/Executor;)Lbolts/j;

    move-result-object v0

    .line 398
    return-object v0
.end method

.method public final b()Z
    .locals 2

    .prologue
    .line 81
    iget-object v1, p0, Lbolts/j;->d:Ljava/lang/Object;

    monitor-enter v1

    .line 82
    :try_start_0
    iget-boolean v0, p0, Lbolts/j;->f:Z

    monitor-exit v1

    return v0

    .line 83
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final c()Z
    .locals 2

    .prologue
    .line 90
    iget-object v1, p0, Lbolts/j;->d:Ljava/lang/Object;

    monitor-enter v1

    .line 91
    :try_start_0
    iget-object v0, p0, Lbolts/j;->h:Ljava/lang/Exception;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit v1

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 92
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final d()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TTResult;"
        }
    .end annotation

    .prologue
    .line 99
    iget-object v1, p0, Lbolts/j;->d:Ljava/lang/Object;

    monitor-enter v1

    .line 100
    :try_start_0
    iget-object v0, p0, Lbolts/j;->g:Ljava/lang/Object;

    monitor-exit v1

    return-object v0

    .line 101
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final e()Ljava/lang/Exception;
    .locals 2

    .prologue
    .line 108
    iget-object v1, p0, Lbolts/j;->d:Ljava/lang/Object;

    monitor-enter v1

    .line 109
    :try_start_0
    iget-object v0, p0, Lbolts/j;->h:Ljava/lang/Exception;

    monitor-exit v1

    return-object v0

    .line 110
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
