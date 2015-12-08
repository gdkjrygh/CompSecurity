.class public final Lcom/kik/g/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 25
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    sput-object v0, Lcom/kik/g/s;->a:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method

.method public static a(Lcom/kik/g/p;Lcom/kik/g/p;)Lcom/kik/g/aq;
    .locals 4

    .prologue
    .line 344
    new-instance v0, Lcom/kik/g/u;

    invoke-direct {v0}, Lcom/kik/g/u;-><init>()V

    invoke-static {p1, v0}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lcom/kik/g/aq;

    invoke-direct {v1}, Lcom/kik/g/aq;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Lcom/kik/g/z;

    invoke-direct {v3, v2, v1}, Lcom/kik/g/z;-><init>(Ljava/util/List;Lcom/kik/g/aq;)V

    invoke-virtual {p0, v3}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    invoke-virtual {v0, v3}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    return-object v1
.end method

.method public static a(Lcom/kik/g/as;)Lcom/kik/g/as;
    .locals 1

    .prologue
    .line 686
    new-instance v0, Lcom/kik/g/ae;

    invoke-direct {v0, p0}, Lcom/kik/g/ae;-><init>(Lcom/kik/g/as;)V

    return-object v0
.end method

.method public static a(Lcom/kik/g/e;)Lcom/kik/g/p;
    .locals 4

    .prologue
    .line 34
    invoke-static {p0}, Lcom/kik/g/s;->b(Lcom/kik/g/e;)Lcom/kik/g/p;

    move-result-object v0

    .line 36
    const-wide/16 v2, 0x61a8

    invoke-static {v0, v2, v3}, Lcom/kik/g/s;->a(Lcom/kik/g/p;J)Lcom/kik/g/p;

    .line 38
    return-object v0
.end method

.method public static a(Lcom/kik/g/p;)Lcom/kik/g/p;
    .locals 2

    .prologue
    .line 177
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 179
    new-instance v1, Lcom/kik/g/ak;

    invoke-direct {v1, v0}, Lcom/kik/g/ak;-><init>(Lcom/kik/g/p;)V

    invoke-virtual {p0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 199
    return-object v0
.end method

.method public static a(Lcom/kik/g/p;J)Lcom/kik/g/p;
    .locals 3

    .prologue
    .line 243
    if-nez p0, :cond_0

    .line 244
    new-instance p0, Lcom/kik/g/p;

    invoke-direct {p0}, Lcom/kik/g/p;-><init>()V

    .line 248
    :cond_0
    sget-object v0, Lcom/kik/g/s;->a:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/kik/g/am;

    invoke-direct {v1, p0}, Lcom/kik/g/am;-><init>(Lcom/kik/g/p;)V

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, p1, p2, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    .line 258
    new-instance v1, Lcom/kik/g/an;

    invoke-direct {v1, v0}, Lcom/kik/g/an;-><init>(Ljava/util/concurrent/ScheduledFuture;)V

    invoke-virtual {p0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 266
    return-object p0
.end method

.method public static a(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;
    .locals 2

    .prologue
    .line 592
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 595
    new-instance v1, Lcom/kik/g/ab;

    invoke-direct {v1, v0, p1}, Lcom/kik/g/ab;-><init>(Lcom/kik/g/p;Lcom/kik/g/as;)V

    invoke-virtual {p0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 619
    return-object v0
.end method

.method public static a(Lcom/kik/g/p;Lcom/kik/g/p;Z)Lcom/kik/g/p;
    .locals 2

    .prologue
    .line 435
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 437
    new-instance v1, Lcom/kik/g/x;

    invoke-direct {v1, p1, v0, p2}, Lcom/kik/g/x;-><init>(Lcom/kik/g/p;Lcom/kik/g/p;Z)V

    invoke-virtual {p0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 473
    new-instance v1, Lcom/kik/g/y;

    invoke-direct {v1, p0, v0, p2}, Lcom/kik/g/y;-><init>(Lcom/kik/g/p;Lcom/kik/g/p;Z)V

    invoke-virtual {p1, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 509
    return-object v0
.end method

.method public static a(Lcom/kik/g/p;Ljava/util/concurrent/Callable;)Lcom/kik/g/p;
    .locals 2

    .prologue
    .line 551
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 553
    new-instance v1, Lcom/kik/g/aa;

    invoke-direct {v1, v0, p1}, Lcom/kik/g/aa;-><init>(Lcom/kik/g/p;Ljava/util/concurrent/Callable;)V

    .line 576
    invoke-virtual {p0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 578
    return-object v0
.end method

.method public static a(Lcom/kik/g/p;Ljava/util/concurrent/ExecutorService;)Lcom/kik/g/p;
    .locals 2

    .prologue
    .line 745
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 747
    new-instance v1, Lcom/kik/g/af;

    invoke-direct {v1, p1, v0}, Lcom/kik/g/af;-><init>(Ljava/util/concurrent/ExecutorService;Lcom/kik/g/p;)V

    invoke-virtual {p0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 782
    return-object v0
.end method

.method public static a(Ljava/lang/Object;)Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 153
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 155
    invoke-virtual {v0, p0}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 157
    return-object v0
.end method

.method public static a(Ljava/lang/Throwable;)Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 168
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 170
    invoke-virtual {v0, p0}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 172
    return-object v0
.end method

.method public static a(Ljava/util/List;)Lcom/kik/g/p;
    .locals 11

    .prologue
    const/4 v10, 0x0

    const/4 v7, 0x0

    .line 391
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 392
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 393
    new-instance v6, Lcom/kik/g/p;

    invoke-direct {v6}, Lcom/kik/g/p;-><init>()V

    .line 396
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move v2, v7

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/kik/g/p;

    .line 397
    add-int/lit8 v8, v2, 0x1

    .line 399
    invoke-interface {v1, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 401
    if-eqz v3, :cond_0

    .line 402
    new-instance v0, Lcom/kik/g/w;

    move-object v5, p0

    invoke-direct/range {v0 .. v6}, Lcom/kik/g/w;-><init>(Ljava/util/List;ILcom/kik/g/p;Ljava/util/List;Ljava/util/List;Lcom/kik/g/p;)V

    invoke-virtual {v3, v0}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    move v2, v8

    goto :goto_0

    .line 416
    :cond_0
    invoke-interface {v1, v2, v10}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 417
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {v4, v2, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    move v2, v8

    .line 419
    goto :goto_0

    .line 421
    :cond_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ne v0, v2, :cond_2

    .line 422
    invoke-virtual {v6, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 425
    :cond_2
    return-object v6
.end method

.method public static b(Lcom/kik/g/e;)Lcom/kik/g/p;
    .locals 4

    .prologue
    .line 43
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 44
    new-instance v1, Lcom/kik/g/f;

    invoke-direct {v1}, Lcom/kik/g/f;-><init>()V

    .line 45
    new-instance v2, Lcom/kik/g/t;

    invoke-direct {v2, v0}, Lcom/kik/g/t;-><init>(Lcom/kik/g/p;)V

    .line 53
    new-instance v3, Lcom/kik/g/ac;

    invoke-direct {v3, v1, p0, v2}, Lcom/kik/g/ac;-><init>(Lcom/kik/g/f;Lcom/kik/g/e;Lcom/kik/g/i;)V

    invoke-virtual {v0, v3}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 61
    invoke-virtual {v1, p0, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 63
    return-object v0
.end method

.method public static b(Lcom/kik/g/p;)Lcom/kik/g/p;
    .locals 2

    .prologue
    .line 204
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 206
    if-eqz p0, :cond_0

    .line 207
    new-instance v1, Lcom/kik/g/al;

    invoke-direct {v1, v0}, Lcom/kik/g/al;-><init>(Lcom/kik/g/p;)V

    invoke-virtual {p0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 231
    :goto_0
    return-object v0

    .line 228
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;
    .locals 2

    .prologue
    .line 633
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 636
    new-instance v1, Lcom/kik/g/ad;

    invoke-direct {v1, v0, p1}, Lcom/kik/g/ad;-><init>(Lcom/kik/g/p;Lcom/kik/g/as;)V

    invoke-virtual {p0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 664
    return-object v0
.end method

.method public static b(Lcom/kik/g/p;Lcom/kik/g/p;)Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 362
    if-eqz p0, :cond_0

    .line 363
    new-instance v0, Lcom/kik/g/v;

    invoke-direct {v0, p1}, Lcom/kik/g/v;-><init>(Lcom/kik/g/p;)V

    invoke-virtual {p0, v0}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 386
    :goto_0
    return-object p1

    .line 383
    :cond_0
    const/4 p1, 0x0

    goto :goto_0
.end method

.method public static b(Lcom/kik/g/p;J)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 796
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 798
    new-instance v0, Lcom/kik/g/aj;

    invoke-direct {v0, v1}, Lcom/kik/g/aj;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 808
    monitor-enter v1

    .line 809
    :try_start_0
    invoke-virtual {p0}, Lcom/kik/g/p;->g()Z

    move-result v0

    if-nez v0, :cond_0

    .line 810
    invoke-virtual {v1, p1, p2}, Ljava/lang/Object;->wait(J)V

    .line 812
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 814
    invoke-virtual {p0}, Lcom/kik/g/p;->f()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 812
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public static c(Lcom/kik/g/p;)Lcom/kik/g/p;
    .locals 4

    .prologue
    .line 279
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    invoke-static {p0, v0}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    .line 280
    const-wide/16 v2, 0x64

    invoke-static {v0, v2, v3}, Lcom/kik/g/s;->a(Lcom/kik/g/p;J)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public static c(Lcom/kik/g/p;Lcom/kik/g/p;)Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 430
    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lcom/kik/g/s;->a(Lcom/kik/g/p;Lcom/kik/g/p;Z)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method
