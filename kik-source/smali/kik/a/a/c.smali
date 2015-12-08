.class public final Lkik/a/a/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final n:Lorg/c/b;


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Lkik/a/e/a;

.field private final c:Lkik/a/a/l;

.field private d:Ljava/util/Set;

.field private e:Ljava/util/Map;

.field private f:Ljava/util/Map;

.field private g:Lcom/kik/g/k;

.field private h:Lkik/a/h/b;

.field private i:Ljava/util/concurrent/ScheduledExecutorService;

.field private j:Ljava/util/concurrent/ScheduledFuture;

.field private k:Lcom/kik/g/f;

.field private final l:Lkik/a/e/k;

.field private m:Lcom/kik/g/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 69
    const-string v0, "abLogger"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/a/a/c;->n:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Lkik/a/e/a;Lkik/a/a/l;Lkik/a/e/k;)V
    .locals 8

    .prologue
    const/4 v7, 0x2

    const/4 v6, 0x0

    const/4 v5, 0x1

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lkik/a/a/c;->a:Ljava/lang/Object;

    .line 73
    iput-object p1, p0, Lkik/a/a/c;->b:Lkik/a/e/a;

    .line 74
    iput-object p2, p0, Lkik/a/a/c;->c:Lkik/a/a/l;

    .line 75
    iput-object p3, p0, Lkik/a/a/c;->l:Lkik/a/e/k;

    .line 76
    invoke-static {v5}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lkik/a/a/c;->i:Ljava/util/concurrent/ScheduledExecutorService;

    .line 78
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lkik/a/a/c;->g:Lcom/kik/g/k;

    .line 80
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lkik/a/a/c;->d:Ljava/util/Set;

    .line 81
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lkik/a/a/c;->e:Ljava/util/Map;

    .line 83
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lkik/a/a/c;->k:Lcom/kik/g/f;

    .line 86
    iget-object v0, p0, Lkik/a/a/c;->d:Ljava/util/Set;

    new-instance v1, Lkik/a/a/b;

    const-string v2, "ab_test_experiment"

    new-array v3, v7, [Ljava/lang/String;

    const-string v4, "ab_test_experiment_variant_a"

    aput-object v4, v3, v6

    const-string v4, "ab_test_experiment_variant_b"

    aput-object v4, v3, v5

    invoke-direct {v1, v2, v3}, Lkik/a/a/b;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 87
    iget-object v0, p0, Lkik/a/a/c;->d:Ljava/util/Set;

    new-instance v1, Lkik/a/a/b;

    const-string v2, "should_always_see_this"

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "all"

    aput-object v4, v3, v6

    invoke-direct {v1, v2, v3}, Lkik/a/a/b;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 88
    iget-object v0, p0, Lkik/a/a/c;->d:Ljava/util/Set;

    new-instance v1, Lkik/a/a/b;

    const-string v2, "browser_button_removal"

    new-array v3, v7, [Ljava/lang/String;

    const-string v4, "hide"

    aput-object v4, v3, v6

    const-string v4, "show"

    aput-object v4, v3, v5

    invoke-direct {v1, v2, v3}, Lkik/a/a/b;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 90
    iget-object v0, p0, Lkik/a/a/c;->b:Lkik/a/e/a;

    invoke-interface {v0}, Lkik/a/e/a;->a()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/a/a/c;->a(Ljava/util/List;)V

    iget-object v0, p0, Lkik/a/a/c;->b:Lkik/a/e/a;

    invoke-interface {v0}, Lkik/a/e/a;->b()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/a/a/c;->b(Ljava/util/List;)V

    .line 93
    iget-object v0, p0, Lkik/a/a/c;->k:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/a/a/c;->c:Lkik/a/a/l;

    invoke-interface {v1}, Lkik/a/a/l;->a()Lcom/kik/g/e;

    move-result-object v1

    new-instance v2, Lkik/a/a/d;

    invoke-direct {v2, p0}, Lkik/a/a/d;-><init>(Lkik/a/a/c;)V

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 106
    iget-object v0, p0, Lkik/a/a/c;->k:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/a/a/c;->l:Lkik/a/e/k;

    invoke-interface {v1}, Lkik/a/e/k;->a()Lcom/kik/g/e;

    move-result-object v1

    new-instance v2, Lkik/a/a/e;

    invoke-direct {v2, p0}, Lkik/a/a/e;-><init>(Lkik/a/a/c;)V

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 120
    iget-object v0, p0, Lkik/a/a/c;->k:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/a/a/c;->b:Lkik/a/e/a;

    invoke-interface {v1}, Lkik/a/e/a;->g()Lcom/kik/g/e;

    move-result-object v1

    new-instance v2, Lkik/a/a/f;

    invoke-direct {v2, p0}, Lkik/a/a/f;-><init>(Lkik/a/a/c;)V

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 127
    return-void
.end method

.method static synthetic a(Lkik/a/a/c;Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    .prologue
    .line 37
    iput-object p1, p0, Lkik/a/a/c;->e:Ljava/util/Map;

    return-object p1
.end method

.method static synthetic a(Lkik/a/a/c;)Lkik/a/a/l;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lkik/a/a/c;->c:Lkik/a/a/l;

    return-object v0
.end method

.method private a(Ljava/util/List;)V
    .locals 5

    .prologue
    .line 274
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 276
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/a/a;

    .line 277
    invoke-virtual {v0}, Lkik/a/a/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lkik/a/a/a;->b()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v3, v4}, Lkik/a/a/c;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 278
    invoke-virtual {v0}, Lkik/a/a/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 282
    :cond_1
    iput-object v1, p0, Lkik/a/a/c;->e:Ljava/util/Map;

    .line 283
    iget-object v0, p0, Lkik/a/a/c;->g:Lcom/kik/g/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 284
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 259
    iget-object v0, p0, Lkik/a/a/c;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/a/b;

    .line 260
    invoke-virtual {v0}, Lkik/a/a/b;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 261
    invoke-virtual {v0}, Lkik/a/a/b;->b()[Ljava/lang/String;

    move-result-object v3

    array-length v4, v3

    move v0, v1

    :goto_0
    if-ge v0, v4, :cond_0

    aget-object v5, v3, v0

    .line 262
    invoke-virtual {v5, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 263
    const/4 v0, 0x1

    .line 269
    :goto_1
    return v0

    .line 261
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    move v0, v1

    .line 269
    goto :goto_1
.end method

.method static synthetic a(Lkik/a/a/c;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0, p1, p2}, Lkik/a/a/c;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private b(Ljava/util/List;)V
    .locals 5

    .prologue
    .line 288
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 290
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/a/a;

    .line 291
    invoke-virtual {v0}, Lkik/a/a/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lkik/a/a/a;->b()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v3, v4}, Lkik/a/a/c;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 292
    invoke-virtual {v0}, Lkik/a/a/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 296
    :cond_1
    iput-object v1, p0, Lkik/a/a/c;->f:Ljava/util/Map;

    .line 297
    iget-object v0, p0, Lkik/a/a/c;->g:Lcom/kik/g/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 298
    return-void
.end method

.method static synthetic b(Lkik/a/a/c;)V
    .locals 10

    .prologue
    const/4 v0, 0x1

    .line 37
    iget-object v1, p0, Lkik/a/a/c;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lkik/a/a/c;->b:Lkik/a/e/a;

    invoke-interface {v2}, Lkik/a/e/a;->e()J

    move-result-wide v2

    iget-object v4, p0, Lkik/a/a/c;->b:Lkik/a/e/a;

    invoke-interface {v4}, Lkik/a/e/a;->f()J

    move-result-wide v4

    iget-object v6, p0, Lkik/a/a/c;->c:Lkik/a/a/l;

    invoke-interface {v6}, Lkik/a/a/l;->b()J

    move-result-wide v6

    const-wide/16 v8, 0x0

    cmp-long v8, v4, v8

    if-eqz v8, :cond_1

    cmp-long v4, v6, v4

    if-ltz v4, :cond_1

    :cond_0
    :goto_0
    if-nez v0, :cond_2

    monitor-exit v1

    :goto_1
    return-void

    :cond_1
    sub-long v2, v6, v2

    iget-object v4, p0, Lkik/a/a/c;->b:Lkik/a/e/a;

    invoke-interface {v4}, Lkik/a/e/a;->d()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-gez v2, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lkik/a/a/c;->m:Lcom/kik/g/p;

    if-eqz v0, :cond_3

    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_3
    :try_start_1
    iget-object v0, p0, Lkik/a/a/c;->h:Lkik/a/h/b;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lkik/a/a/c;->h:Lkik/a/h/b;

    invoke-virtual {v0}, Lkik/a/h/b;->d()Z

    move-result v0

    if-eqz v0, :cond_4

    monitor-exit v1

    goto :goto_1

    :cond_4
    invoke-direct {p0}, Lkik/a/a/c;->i()V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1
.end method

.method static synthetic c(Lkik/a/a/c;)V
    .locals 6

    .prologue
    const-wide/16 v4, 0x0

    .line 37
    iget-object v0, p0, Lkik/a/a/c;->b:Lkik/a/e/a;

    invoke-interface {v0}, Lkik/a/e/a;->f()J

    move-result-wide v0

    cmp-long v0, v0, v4

    if-nez v0, :cond_0

    iget-object v0, p0, Lkik/a/a/c;->c:Lkik/a/a/l;

    invoke-interface {v0}, Lkik/a/a/l;->b()J

    move-result-wide v0

    iget-object v2, p0, Lkik/a/a/c;->b:Lkik/a/e/a;

    iget-object v3, p0, Lkik/a/a/c;->b:Lkik/a/e/a;

    invoke-interface {v3, v0, v1}, Lkik/a/e/a;->b(J)J

    move-result-wide v0

    invoke-interface {v2, v0, v1}, Lkik/a/e/a;->c(J)V

    :cond_0
    invoke-direct {p0}, Lkik/a/a/c;->h()V

    iget-object v0, p0, Lkik/a/a/c;->b:Lkik/a/e/a;

    invoke-interface {v0}, Lkik/a/e/a;->f()J

    move-result-wide v0

    cmp-long v2, v0, v4

    if-eqz v2, :cond_1

    iget-object v2, p0, Lkik/a/a/c;->c:Lkik/a/a/l;

    invoke-interface {v2}, Lkik/a/a/l;->b()J

    move-result-wide v2

    iget-object v4, p0, Lkik/a/a/c;->i:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v5, Lkik/a/a/g;

    invoke-direct {v5, p0}, Lkik/a/a/g;-><init>(Lkik/a/a/c;)V

    sub-long/2addr v0, v2

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v4, v5, v0, v1, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lkik/a/a/c;->j:Ljava/util/concurrent/ScheduledFuture;

    :cond_1
    return-void
.end method

.method static synthetic d(Lkik/a/a/c;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lkik/a/a/c;->a:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic e(Lkik/a/a/c;)Lcom/kik/g/k;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lkik/a/a/c;->g:Lcom/kik/g/k;

    return-object v0
.end method

.method static synthetic f(Lkik/a/a/c;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lkik/a/a/c;->e:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic g(Lkik/a/a/c;)Lkik/a/e/a;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lkik/a/a/c;->b:Lkik/a/e/a;

    return-object v0
.end method

.method static synthetic h(Lkik/a/a/c;)Ljava/util/ArrayList;
    .locals 4

    .prologue
    .line 37
    new-instance v1, Ljava/util/ArrayList;

    iget-object v0, p0, Lkik/a/a/c;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lkik/a/a/c;->f:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/a/a;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/a/a;

    invoke-virtual {v0}, Lkik/a/a/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Lkik/a/a/c;->b(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object v2
.end method

.method private h()V
    .locals 2

    .prologue
    .line 218
    iget-object v0, p0, Lkik/a/a/c;->j:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    .line 219
    iget-object v0, p0, Lkik/a/a/c;->j:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 220
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/a/a/c;->j:Ljava/util/concurrent/ScheduledFuture;

    .line 222
    :cond_0
    return-void
.end method

.method static synthetic i(Lkik/a/a/c;)Lkik/a/h/b;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lkik/a/a/c;->h:Lkik/a/h/b;

    return-object v0
.end method

.method private i()V
    .locals 3

    .prologue
    .line 386
    iget-object v1, p0, Lkik/a/a/c;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 387
    :try_start_0
    iget-object v0, p0, Lkik/a/a/c;->c:Lkik/a/a/l;

    invoke-interface {v0}, Lkik/a/a/l;->d()Lcom/kik/g/p;

    move-result-object v0

    iput-object v0, p0, Lkik/a/a/c;->m:Lcom/kik/g/p;

    .line 390
    iget-object v0, p0, Lkik/a/a/c;->m:Lcom/kik/g/p;

    new-instance v2, Lkik/a/a/i;

    invoke-direct {v2, p0}, Lkik/a/a/i;-><init>(Lkik/a/a/c;)V

    invoke-virtual {v0, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 472
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic j(Lkik/a/a/c;)V
    .locals 5

    .prologue
    .line 37
    iget-object v0, p0, Lkik/a/a/c;->h:Lkik/a/h/b;

    if-nez v0, :cond_0

    new-instance v0, Lkik/a/h/b;

    const/4 v1, 0x3

    const-wide/16 v2, 0x1388

    const/high16 v4, 0x3fc00000    # 1.5f

    invoke-direct {v0, v1, v2, v3, v4}, Lkik/a/h/b;-><init>(IJF)V

    iput-object v0, p0, Lkik/a/a/c;->h:Lkik/a/h/b;

    :cond_0
    iget-object v0, p0, Lkik/a/a/c;->k:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/a/a/c;->h:Lkik/a/h/b;

    invoke-virtual {v1}, Lkik/a/h/b;->e()Lcom/kik/g/e;

    move-result-object v1

    new-instance v2, Lkik/a/a/h;

    invoke-direct {v2, p0}, Lkik/a/a/h;-><init>(Lkik/a/a/c;)V

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    return-void
.end method

.method static synthetic k(Lkik/a/a/c;)Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/a/a/c;->m:Lcom/kik/g/p;

    return-object v0
.end method


# virtual methods
.method public final a()J
    .locals 2

    .prologue
    .line 131
    iget-object v0, p0, Lkik/a/a/c;->b:Lkik/a/e/a;

    invoke-interface {v0}, Lkik/a/e/a;->e()J

    move-result-wide v0

    return-wide v0
.end method

.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 136
    iget-object v0, p0, Lkik/a/a/c;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/a/a;

    .line 137
    if-eqz v0, :cond_0

    .line 138
    invoke-virtual {v0}, Lkik/a/a/a;->b()Ljava/lang/String;

    move-result-object v0

    .line 146
    :goto_0
    return-object v0

    .line 141
    :cond_0
    iget-object v0, p0, Lkik/a/a/c;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/a/a;

    .line 142
    if-eqz v0, :cond_1

    .line 143
    invoke-virtual {v0}, Lkik/a/a/a;->b()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 146
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(Lkik/a/a/a;)V
    .locals 3

    .prologue
    .line 179
    iget-object v0, p0, Lkik/a/a/c;->f:Ljava/util/Map;

    invoke-virtual {p1}, Lkik/a/a/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    iget-object v0, p0, Lkik/a/a/c;->b:Lkik/a/e/a;

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lkik/a/a/c;->f:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0, v1}, Lkik/a/e/a;->b(Ljava/util/List;)Z

    .line 181
    iget-object v0, p0, Lkik/a/a/c;->g:Lcom/kik/g/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 182
    return-void
.end method

.method public final b()Ljava/util/List;
    .locals 2

    .prologue
    .line 151
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lkik/a/a/c;->d:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public final b(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 168
    iget-object v0, p0, Lkik/a/a/c;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final c()Ljava/util/List;
    .locals 2

    .prologue
    .line 156
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lkik/a/a/c;->e:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 158
    return-object v0
.end method

.method public final c(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 186
    iget-object v0, p0, Lkik/a/a/c;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    iget-object v0, p0, Lkik/a/a/c;->b:Lkik/a/e/a;

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lkik/a/a/c;->f:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0, v1}, Lkik/a/e/a;->b(Ljava/util/List;)Z

    .line 188
    iget-object v0, p0, Lkik/a/a/c;->g:Lcom/kik/g/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 189
    return-void
.end method

.method public final d()V
    .locals 0

    .prologue
    .line 163
    invoke-direct {p0}, Lkik/a/a/c;->i()V

    .line 164
    return-void
.end method

.method public final e()Ljava/util/List;
    .locals 2

    .prologue
    .line 173
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lkik/a/a/c;->f:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 174
    return-object v0
.end method

.method public final f()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 193
    iget-object v0, p0, Lkik/a/a/c;->g:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final g()V
    .locals 1

    .prologue
    .line 477
    iget-object v0, p0, Lkik/a/a/c;->k:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 478
    iget-object v0, p0, Lkik/a/a/c;->b:Lkik/a/e/a;

    invoke-interface {v0}, Lkik/a/e/a;->c()V

    .line 479
    invoke-direct {p0}, Lkik/a/a/c;->h()V

    .line 480
    return-void
.end method
