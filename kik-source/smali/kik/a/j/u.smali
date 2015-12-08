.class public Lkik/a/j/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/j/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/a/j/u$c;,
        Lkik/a/j/u$b;,
        Lkik/a/j/u$a;,
        Lkik/a/j/u$e;,
        Lkik/a/j/u$d;,
        Lkik/a/j/u$f;,
        Lkik/a/j/u$g;
    }
.end annotation


# static fields
.field private static final a:Lorg/c/b;


# instance fields
.field private b:Ljava/util/concurrent/ScheduledExecutorService;

.field private c:Ljava/util/concurrent/ScheduledFuture;

.field private d:Z

.field private e:Ljava/lang/Object;

.field private f:Lkik/a/e/x;

.field private g:Lkik/a/e/f;

.field private h:Lcom/kik/g/f;

.field private i:Ljava/util/Map;

.field private j:Ljava/util/Map;

.field private final k:Lcom/kik/g/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 42
    const-string v0, "IXDataManager"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/a/j/u;->a:Lorg/c/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 311
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lkik/a/j/u;->e:Ljava/lang/Object;

    .line 300
    new-instance v0, Lkik/a/j/v;

    invoke-direct {v0, p0}, Lkik/a/j/v;-><init>(Lkik/a/j/u;)V

    iput-object v0, p0, Lkik/a/j/u;->k:Lcom/kik/g/i;

    .line 312
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lkik/a/j/u;->h:Lcom/kik/g/f;

    .line 313
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lkik/a/j/u;->j:Ljava/util/Map;

    .line 314
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lkik/a/j/u;->i:Ljava/util/Map;

    .line 315
    return-void
.end method

.method static synthetic a(Lkik/a/j/u;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lkik/a/j/u;->j:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic a(Lkik/a/j/u;Ljava/lang/String;Ljava/util/Map;)V
    .locals 4

    .prologue
    .line 39
    iget-object v0, p0, Lkik/a/j/u;->f:Lkik/a/e/x;

    invoke-interface {v0, p1}, Lkik/a/e/x;->b(Ljava/lang/String;)Lcom/kik/g/p;

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkik/a/d/ab;

    iget-object v3, p0, Lkik/a/j/u;->f:Lkik/a/e/x;

    invoke-virtual {v1}, Lkik/a/d/ab;->c()[B

    move-result-object v1

    invoke-interface {v3, p1, v0, v1}, Lkik/a/e/x;->b(Ljava/lang/String;Ljava/lang/String;[B)Lcom/kik/g/p;

    goto :goto_0

    :cond_0
    return-void
.end method

.method static synthetic a(Lkik/a/j/u;Ljava/lang/String;Lkik/a/d/ab;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v3, 0x0

    .line 39
    if-eqz p2, :cond_0

    iget-object v0, p0, Lkik/a/j/u;->f:Lkik/a/e/x;

    new-array v1, v1, [Lkik/a/d/ab;

    aput-object p2, v1, v3

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/x;->b(Ljava/util/List;)Lcom/kik/g/p;

    iget-object v0, p0, Lkik/a/j/u;->f:Lkik/a/e/x;

    const/4 v1, 0x0

    invoke-virtual {p2}, Lkik/a/d/ab;->c()[B

    move-result-object v2

    invoke-interface {v0, p1, v1, v2}, Lkik/a/e/x;->b(Ljava/lang/String;Ljava/lang/String;[B)Lcom/kik/g/p;

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lkik/a/j/u;->f:Lkik/a/e/x;

    new-array v1, v1, [Lkik/a/d/ab;

    new-instance v2, Lkik/a/d/ab;

    invoke-direct {v2, p1}, Lkik/a/d/ab;-><init>(Ljava/lang/String;)V

    aput-object v2, v1, v3

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/x;->b(Ljava/util/List;)Lcom/kik/g/p;

    goto :goto_0
.end method

.method static synthetic b(Lkik/a/j/u;)Lkik/a/e/f;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lkik/a/j/u;->g:Lkik/a/e/f;

    return-object v0
.end method

.method static synthetic c(Lkik/a/j/u;)V
    .locals 3

    .prologue
    .line 39
    iget-object v1, p0, Lkik/a/j/u;->e:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lkik/a/j/u;->d:Z

    if-eqz v0, :cond_0

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/a/j/u;->d:Z

    iget-object v0, p0, Lkik/a/j/u;->f:Lkik/a/e/x;

    invoke-interface {v0}, Lkik/a/e/x;->b()Lcom/kik/g/p;

    move-result-object v0

    new-instance v2, Lkik/a/j/x;

    invoke-direct {v2, p0}, Lkik/a/j/x;-><init>(Lkik/a/j/u;)V

    invoke-virtual {v0, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic d(Lkik/a/j/u;)V
    .locals 12

    .prologue
    const-wide v4, 0x7fffffffffffffffL

    .line 39
    iget-object v0, p0, Lkik/a/j/u;->c:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/a/j/u;->c:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    iput-object v1, p0, Lkik/a/j/u;->c:Ljava/util/concurrent/ScheduledFuture;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledFuture;->isCancelled()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    :cond_0
    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v8

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lkik/a/j/u;->i:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v11

    move-wide v2, v4

    :cond_1
    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    cmp-long v0, v6, v2

    if-gtz v0, :cond_2

    move-wide v2, v6

    :cond_2
    cmp-long v0, v6, v8

    if-gtz v0, :cond_1

    invoke-interface {v10, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v6, p0, Lkik/a/j/u;->i:Ljava/util/Map;

    invoke-interface {v6, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    cmp-long v0, v2, v4

    if-gez v0, :cond_5

    iget-object v0, p0, Lkik/a/j/u;->b:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lkik/a/j/w;

    invoke-direct {v1, p0}, Lkik/a/j/w;-><init>(Lkik/a/j/u;)V

    sub-long/2addr v2, v8

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lkik/a/j/u;->c:Ljava/util/concurrent/ScheduledFuture;

    :cond_5
    return-void
.end method

.method static synthetic e(Lkik/a/j/u;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lkik/a/j/u;->i:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic f(Lkik/a/j/u;)Z
    .locals 1

    .prologue
    .line 39
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/a/j/u;->d:Z

    return v0
.end method

.method static synthetic g(Lkik/a/j/u;)Lkik/a/e/x;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lkik/a/j/u;->f:Lkik/a/e/x;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Lcom/kik/g/p;
    .locals 3

    .prologue
    .line 527
    if-nez p1, :cond_0

    .line 528
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Must provide a primary key"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 530
    :cond_0
    const-string v0, "^[_a-z0-9]{2,253}$"

    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 531
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Primary key must match ^[_a-z0-9]{2,253}$"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 533
    :cond_1
    if-eqz p2, :cond_2

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xfd

    if-le v0, v1, :cond_3

    .line 534
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Sub key must be less than 253 and more than 2 characters. Illegal value of: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 538
    :cond_3
    iget-object v0, p0, Lkik/a/j/u;->f:Lkik/a/e/x;

    invoke-interface {v0, p1, p2}, Lkik/a/e/x;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/a/j/u$c;

    invoke-direct {v1, p0, p1, p2}, Lkik/a/j/u$c;-><init>(Lkik/a/j/u;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/kik/g/s;->a(Lcom/kik/g/p;Ljava/util/concurrent/Callable;)Lcom/kik/g/p;

    move-result-object v0

    .line 544
    new-instance v1, Lkik/a/j/u$g;

    invoke-direct {v1, p3}, Lkik/a/j/u$g;-><init>(Ljava/lang/Class;)V

    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lcom/kik/g/as;Ljava/lang/Long;)Lcom/kik/g/p;
    .locals 7

    .prologue
    .line 556
    invoke-virtual {p0, p1, p2, p3}, Lkik/a/j/u;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Lcom/kik/g/p;

    move-result-object v6

    new-instance v0, Lkik/a/j/y;

    move-object v1, p0

    move-object v2, p4

    move-object v3, p1

    move-object v4, p2

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lkik/a/j/y;-><init>(Lkik/a/j/u;Lcom/kik/g/as;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    invoke-static {v6, v0}, Lcom/kik/g/s;->a(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;[BLjava/lang/Long;)Lcom/kik/g/p;
    .locals 3

    .prologue
    .line 608
    if-nez p3, :cond_0

    .line 611
    new-instance v0, Lkik/a/d/ab;

    invoke-direct {v0, p1, p2}, Lkik/a/d/ab;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 617
    :goto_0
    const/4 v1, 0x1

    new-array v1, v1, [Lkik/a/d/ab;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0, p4}, Lkik/a/j/u;->a(Ljava/util/List;Ljava/lang/Long;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/a/j/aa;

    invoke-direct {v1, p0}, Lkik/a/j/aa;-><init>(Lkik/a/j/u;)V

    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0

    .line 614
    :cond_0
    new-instance v0, Lkik/a/d/ab;

    invoke-direct {v0, p1, p2, p3}, Lkik/a/d/ab;-><init>(Ljava/lang/String;Ljava/lang/String;[B)V

    goto :goto_0
.end method

.method public final a(Ljava/util/List;)Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 635
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lkik/a/j/u;->a(Ljava/util/List;Ljava/lang/Long;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/util/List;Ljava/lang/Long;)Lcom/kik/g/p;
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 649
    new-instance v3, Lcom/kik/g/p;

    invoke-direct {v3}, Lcom/kik/g/p;-><init>()V

    .line 652
    const/4 v0, 0x0

    :try_start_0
    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Object;)Lcom/kik/g/p;

    move-result-object v0

    .line 654
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move-object v2, v0

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/ab;

    .line 656
    iget-object v5, p0, Lkik/a/j/u;->f:Lkik/a/e/x;

    invoke-virtual {v0}, Lkik/a/d/ab;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lkik/a/d/ab;->b()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lkik/a/d/ab;->d()Z

    move-result v8

    if-eqz v8, :cond_0

    move-object v0, v1

    :goto_1
    invoke-interface {v5, v6, v7, v0}, Lkik/a/e/x;->a(Ljava/lang/String;Ljava/lang/String;[B)Lcom/kik/g/p;

    move-result-object v0

    .line 661
    invoke-static {v2, v0}, Lcom/kik/g/s;->a(Lcom/kik/g/p;Lcom/kik/g/p;)Lcom/kik/g/aq;

    move-result-object v0

    move-object v2, v0

    .line 662
    goto :goto_0

    .line 656
    :cond_0
    invoke-virtual {v0}, Lkik/a/d/ab;->c()[B

    move-result-object v0

    goto :goto_1

    .line 664
    :cond_1
    new-instance v0, Lkik/a/j/ab;

    invoke-direct {v0, p0, p2, p1, v3}, Lkik/a/j/ab;-><init>(Lkik/a/j/u;Ljava/lang/Long;Ljava/util/List;Lcom/kik/g/p;)V

    invoke-virtual {v2, v0}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 742
    :goto_2
    return-object v3

    .line 738
    :catch_0
    move-exception v0

    .line 739
    invoke-virtual {v3, v0}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_2
.end method

.method public final a(Lkik/a/e/x;Lkik/a/e/f;)V
    .locals 3

    .prologue
    .line 325
    iput-object p1, p0, Lkik/a/j/u;->f:Lkik/a/e/x;

    .line 326
    iput-object p2, p0, Lkik/a/j/u;->g:Lkik/a/e/f;

    .line 328
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lkik/a/j/u;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 330
    iget-object v0, p0, Lkik/a/j/u;->h:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/a/j/u;->g:Lkik/a/e/f;

    invoke-interface {v1}, Lkik/a/e/f;->b()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/a/j/u;->k:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 331
    return-void
.end method

.method public final b()Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 457
    iget-object v0, p0, Lkik/a/j/u;->f:Lkik/a/e/x;

    invoke-interface {v0}, Lkik/a/e/x;->a()Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Lcom/b/a/n;)Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 584
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lkik/a/j/u;->b(Ljava/lang/String;Ljava/lang/String;Lcom/b/a/n;Ljava/lang/Long;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Lcom/b/a/n;Ljava/lang/Long;)Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 600
    invoke-static {p3}, Lkik/a/h/g;->a(Lcom/b/a/n;)[B

    move-result-object v0

    .line 602
    invoke-virtual {p0, p1, p2, v0, p4}, Lkik/a/j/u;->a(Ljava/lang/String;Ljava/lang/String;[BLjava/lang/Long;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public final c(Ljava/lang/String;Ljava/lang/Class;)Lcom/kik/g/p;
    .locals 2

    .prologue
    .line 471
    if-nez p1, :cond_0

    .line 472
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Must provide a primary key"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 474
    :cond_0
    const-string v0, "^[_a-z0-9]{2,253}$"

    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 475
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Primary key must match ^[_a-z0-9]{2,253}$"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 479
    :cond_1
    iget-object v0, p0, Lkik/a/j/u;->f:Lkik/a/e/x;

    invoke-interface {v0, p1}, Lkik/a/e/x;->a(Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/a/j/u$b;

    invoke-direct {v1, p0, p1}, Lkik/a/j/u$b;-><init>(Lkik/a/j/u;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/kik/g/s;->a(Lcom/kik/g/p;Ljava/util/concurrent/Callable;)Lcom/kik/g/p;

    move-result-object v0

    .line 485
    new-instance v1, Lkik/a/j/u$g;

    invoke-direct {v1, p2}, Lkik/a/j/u$g;-><init>(Ljava/lang/Class;)V

    invoke-static {v1}, Lcom/kik/g/s;->a(Lcom/kik/g/as;)Lcom/kik/g/as;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public c()V
    .locals 1

    .prologue
    .line 382
    iget-object v0, p0, Lkik/a/j/u;->b:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V

    .line 384
    iget-object v0, p0, Lkik/a/j/u;->h:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 385
    iget-object v0, p0, Lkik/a/j/u;->f:Lkik/a/e/x;

    invoke-interface {v0}, Lkik/a/e/x;->c()V

    .line 386
    return-void
.end method

.method public final d(Ljava/lang/String;Ljava/lang/Class;)Lcom/kik/g/p;
    .locals 2

    .prologue
    .line 499
    if-nez p1, :cond_0

    .line 500
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Must provide a primary key"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 502
    :cond_0
    const-string v0, "^[_a-z0-9]{2,253}$"

    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 503
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Primary key must match ^[_a-z0-9]{2,253}$"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 507
    :cond_1
    iget-object v0, p0, Lkik/a/j/u;->f:Lkik/a/e/x;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lkik/a/e/x;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/a/j/u$a;

    invoke-direct {v1, p0, p1}, Lkik/a/j/u$a;-><init>(Lkik/a/j/u;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/kik/g/s;->a(Lcom/kik/g/p;Ljava/util/concurrent/Callable;)Lcom/kik/g/p;

    move-result-object v0

    .line 513
    new-instance v1, Lkik/a/j/u$g;

    invoke-direct {v1, p2}, Lkik/a/j/u$g;-><init>(Ljava/lang/Class;)V

    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method protected final d()Lkik/a/e/x;
    .locals 1

    .prologue
    .line 319
    iget-object v0, p0, Lkik/a/j/u;->f:Lkik/a/e/x;

    return-object v0
.end method
