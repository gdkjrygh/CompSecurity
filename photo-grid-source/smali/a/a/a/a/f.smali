.class public La/a/a/a/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static volatile a:La/a/a/a/f;

.field static final b:La/a/a/a/s;


# instance fields
.field final c:La/a/a/a/s;

.field final d:Z

.field private final e:Landroid/content/Context;

.field private final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<+",
            "La/a/a/a/p;",
            ">;",
            "La/a/a/a/p;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/concurrent/ExecutorService;

.field private final h:Landroid/os/Handler;

.field private final i:La/a/a/a/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/a/a/a/l",
            "<",
            "La/a/a/a/f;",
            ">;"
        }
    .end annotation
.end field

.field private final j:La/a/a/a/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/a/a/a/l",
            "<*>;"
        }
    .end annotation
.end field

.field private final k:La/a/a/a/a/b/x;

.field private l:La/a/a/a/a;

.field private m:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private n:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 56
    new-instance v0, La/a/a/a/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La/a/a/a/e;-><init>(B)V

    sput-object v0, La/a/a/a/f;->b:La/a/a/a/s;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Ljava/util/Map;La/a/a/a/a/c/w;Landroid/os/Handler;La/a/a/a/s;ZLa/a/a/a/l;La/a/a/a/a/b/x;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<+",
            "La/a/a/a/p;",
            ">;",
            "La/a/a/a/p;",
            ">;",
            "La/a/a/a/a/c/w;",
            "Landroid/os/Handler;",
            "La/a/a/a/s;",
            "Z",
            "La/a/a/a/l;",
            "La/a/a/a/a/b/x;",
            ")V"
        }
    .end annotation

    .prologue
    .line 275
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 276
    iput-object p1, p0, La/a/a/a/f;->e:Landroid/content/Context;

    .line 277
    iput-object p2, p0, La/a/a/a/f;->f:Ljava/util/Map;

    .line 278
    iput-object p3, p0, La/a/a/a/f;->g:Ljava/util/concurrent/ExecutorService;

    .line 279
    iput-object p4, p0, La/a/a/a/f;->h:Landroid/os/Handler;

    .line 280
    iput-object p5, p0, La/a/a/a/f;->c:La/a/a/a/s;

    .line 281
    iput-boolean p6, p0, La/a/a/a/f;->d:Z

    .line 282
    iput-object p7, p0, La/a/a/a/f;->i:La/a/a/a/l;

    .line 283
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, La/a/a/a/f;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 284
    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v0

    .line 1582
    new-instance v1, La/a/a/a/h;

    invoke-direct {v1, p0, v0}, La/a/a/a/h;-><init>(La/a/a/a/f;I)V

    .line 284
    iput-object v1, p0, La/a/a/a/f;->j:La/a/a/a/l;

    .line 285
    iput-object p8, p0, La/a/a/a/f;->k:La/a/a/a/a/b/x;

    .line 286
    return-void
.end method

.method public static varargs a(Landroid/content/Context;[La/a/a/a/p;)La/a/a/a/f;
    .locals 10

    .prologue
    const/4 v1, 0x0

    .line 300
    sget-object v0, La/a/a/a/f;->a:La/a/a/a/f;

    if-nez v0, :cond_6

    .line 301
    const-class v2, La/a/a/a/f;

    monitor-enter v2

    .line 302
    :try_start_0
    sget-object v0, La/a/a/a/f;->a:La/a/a/a/f;

    if-nez v0, :cond_5

    .line 303
    new-instance v0, La/a/a/a/i;

    invoke-direct {v0, p0}, La/a/a/a/i;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, La/a/a/a/i;->a([La/a/a/a/p;)La/a/a/a/i;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/a/i;->a()La/a/a/a/f;

    move-result-object v3

    .line 2331
    sput-object v3, La/a/a/a/f;->a:La/a/a/a/f;

    .line 2355
    iget-object v0, v3, La/a/a/a/f;->e:Landroid/content/Context;

    .line 2480
    instance-of v4, v0, Landroid/app/Activity;

    if-eqz v4, :cond_0

    .line 2481
    check-cast v0, Landroid/app/Activity;

    .line 2355
    :goto_0
    invoke-virtual {v3, v0}, La/a/a/a/f;->a(Landroid/app/Activity;)La/a/a/a/f;

    .line 2356
    new-instance v0, La/a/a/a/a;

    iget-object v4, v3, La/a/a/a/f;->e:Landroid/content/Context;

    invoke-direct {v0, v4}, La/a/a/a/a;-><init>(Landroid/content/Context;)V

    iput-object v0, v3, La/a/a/a/f;->l:La/a/a/a/a;

    .line 2357
    iget-object v0, v3, La/a/a/a/f;->l:La/a/a/a/a;

    new-instance v4, La/a/a/a/g;

    invoke-direct {v4, v3}, La/a/a/a/g;-><init>(La/a/a/a/f;)V

    invoke-virtual {v0, v4}, La/a/a/a/a;->a(La/a/a/a/d;)Z

    .line 2375
    iget-object v4, v3, La/a/a/a/f;->e:Landroid/content/Context;

    .line 3605
    new-instance v0, La/a/a/a/k;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageCodePath()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v5}, La/a/a/a/k;-><init>(Ljava/lang/String;)V

    .line 4492
    iget-object v5, v3, La/a/a/a/f;->g:Ljava/util/concurrent/ExecutorService;

    .line 3608
    invoke-interface {v5, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    .line 4503
    iget-object v5, v3, La/a/a/a/f;->f:Ljava/util/Map;

    invoke-interface {v5}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v5

    .line 3399
    new-instance v6, La/a/a/a/t;

    invoke-direct {v6, v0, v5}, La/a/a/a/t;-><init>(Ljava/util/concurrent/Future;Ljava/util/Collection;)V

    .line 3400
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 3401
    invoke-static {v7}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 3405
    sget-object v0, La/a/a/a/l;->d:La/a/a/a/l;

    iget-object v5, v3, La/a/a/a/f;->k:La/a/a/a/a/b/x;

    invoke-virtual {v6, v4, v3, v0, v5}, La/a/a/a/t;->a(Landroid/content/Context;La/a/a/a/f;La/a/a/a/l;La/a/a/a/a/b/x;)V

    .line 3406
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/a/a/a/p;

    .line 3407
    iget-object v8, v3, La/a/a/a/f;->j:La/a/a/a/l;

    iget-object v9, v3, La/a/a/a/f;->k:La/a/a/a/a/b/x;

    invoke-virtual {v0, v4, v3, v8, v9}, La/a/a/a/p;->a(Landroid/content/Context;La/a/a/a/f;La/a/a/a/l;La/a/a/a/a/b/x;)V

    goto :goto_1

    .line 305
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    move-object v0, v1

    .line 2483
    goto :goto_0

    .line 3412
    :cond_1
    :try_start_1
    invoke-virtual {v6}, La/a/a/a/t;->t()V

    .line 3416
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v0

    const/4 v4, 0x3

    invoke-interface {v0, v4}, La/a/a/a/s;->a(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3417
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Initializing io.fabric.sdk.android:fabric [Version: 1.3.6.79], with the following kits:\n"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object v1, v0

    .line 3426
    :cond_2
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/a/a/a/p;

    .line 3427
    iget-object v5, v0, La/a/a/a/p;->f:La/a/a/a/o;

    iget-object v7, v6, La/a/a/a/t;->f:La/a/a/a/o;

    invoke-virtual {v5, v7}, La/a/a/a/o;->a(La/a/a/a/a/c/y;)V

    .line 3429
    iget-object v5, v3, La/a/a/a/f;->f:Ljava/util/Map;

    invoke-static {v5, v0}, La/a/a/a/f;->a(Ljava/util/Map;La/a/a/a/p;)V

    .line 3431
    invoke-virtual {v0}, La/a/a/a/p;->t()V

    .line 3433
    if-eqz v1, :cond_3

    .line 3434
    invoke-virtual {v0}, La/a/a/a/p;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, " [Version: "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v0}, La/a/a/a/p;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, "]\n"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 3441
    :cond_4
    if-eqz v1, :cond_5

    .line 3442
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 305
    :cond_5
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 307
    :cond_6
    sget-object v0, La/a/a/a/f;->a:La/a/a/a/f;

    return-object v0
.end method

.method public static a(Ljava/lang/Class;)La/a/a/a/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "La/a/a/a/p;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation

    .prologue
    .line 7264
    sget-object v0, La/a/a/a/f;->a:La/a/a/a/f;

    if-nez v0, :cond_0

    .line 7265
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Must Initialize Fabric before using singleton()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 7267
    :cond_0
    sget-object v0, La/a/a/a/f;->a:La/a/a/a/f;

    .line 516
    iget-object v0, v0, La/a/a/a/f;->f:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/a/a/a/p;

    return-object v0
.end method

.method static synthetic a(Ljava/util/Collection;)Ljava/util/Map;
    .locals 2

    .prologue
    .line 7561
    new-instance v0, Ljava/util/HashMap;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 7564
    invoke-static {v0, p0}, La/a/a/a/f;->a(Ljava/util/Map;Ljava/util/Collection;)V

    .line 48
    return-object v0
.end method

.method static synthetic a(La/a/a/a/f;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, La/a/a/a/f;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method private static a(Ljava/util/Map;La/a/a/a/p;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<+",
            "La/a/a/a/p;",
            ">;",
            "La/a/a/a/p;",
            ">;",
            "La/a/a/a/p;",
            ")V"
        }
    .end annotation

    .prologue
    .line 452
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, La/a/a/a/a/c/n;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, La/a/a/a/a/c/n;

    .line 453
    if-eqz v0, :cond_4

    .line 454
    invoke-interface {v0}, La/a/a/a/a/c/n;->a()[Ljava/lang/Class;

    move-result-object v2

    .line 455
    array-length v3, v2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_4

    aget-object v4, v2, v1

    .line 456
    invoke-virtual {v4}, Ljava/lang/Class;->isInterface()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 458
    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/a/a/a/p;

    .line 459
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 460
    iget-object v6, p1, La/a/a/a/p;->f:La/a/a/a/o;

    iget-object v0, v0, La/a/a/a/p;->f:La/a/a/a/o;

    invoke-virtual {v6, v0}, La/a/a/a/o;->a(La/a/a/a/a/c/y;)V

    goto :goto_1

    .line 466
    :cond_1
    invoke-interface {p0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/a/a/a/p;

    .line 467
    if-nez v0, :cond_2

    .line 468
    new-instance v0, La/a/a/a/a/c/z;

    const-string v1, "Referenced Kit was null, does the kit exist?"

    invoke-direct {v0, v1}, La/a/a/a/a/c/z;-><init>(Ljava/lang/String;)V

    throw v0

    .line 472
    :cond_2
    iget-object v5, p1, La/a/a/a/p;->f:La/a/a/a/o;

    invoke-interface {p0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/a/a/a/p;

    iget-object v0, v0, La/a/a/a/p;->f:La/a/a/a/o;

    invoke-virtual {v5, v0}, La/a/a/a/o;->a(La/a/a/a/a/c/y;)V

    .line 455
    :cond_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 477
    :cond_4
    return-void
.end method

.method private static a(Ljava/util/Map;Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<+",
            "La/a/a/a/p;",
            ">;",
            "La/a/a/a/p;",
            ">;",
            "Ljava/util/Collection",
            "<+",
            "La/a/a/a/p;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 572
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/a/a/a/p;

    .line 573
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-interface {p0, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 575
    instance-of v2, v0, La/a/a/a/q;

    if-eqz v2, :cond_0

    .line 576
    check-cast v0, La/a/a/a/q;

    invoke-interface {v0}, La/a/a/a/q;->c()Ljava/util/Collection;

    move-result-object v0

    invoke-static {p0, v0}, La/a/a/a/f;->a(Ljava/util/Map;Ljava/util/Collection;)V

    goto :goto_0

    .line 579
    :cond_1
    return-void
.end method

.method static synthetic b(La/a/a/a/f;)La/a/a/a/l;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, La/a/a/a/f;->i:La/a/a/a/l;

    return-object v0
.end method

.method public static d()La/a/a/a/s;
    .locals 1

    .prologue
    .line 523
    sget-object v0, La/a/a/a/f;->a:La/a/a/a/f;

    if-nez v0, :cond_0

    .line 524
    sget-object v0, La/a/a/a/f;->b:La/a/a/a/s;

    .line 526
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, La/a/a/a/f;->a:La/a/a/a/f;

    iget-object v0, v0, La/a/a/a/f;->c:La/a/a/a/s;

    goto :goto_0
.end method

.method public static e()Z
    .locals 1

    .prologue
    .line 533
    sget-object v0, La/a/a/a/f;->a:La/a/a/a/f;

    if-nez v0, :cond_0

    .line 534
    const/4 v0, 0x0

    .line 536
    :goto_0
    return v0

    :cond_0
    sget-object v0, La/a/a/a/f;->a:La/a/a/a/f;

    iget-boolean v0, v0, La/a/a/a/f;->d:Z

    goto :goto_0
.end method


# virtual methods
.method public final a(Landroid/app/Activity;)La/a/a/a/f;
    .locals 1

    .prologue
    .line 339
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, La/a/a/a/f;->m:Ljava/lang/ref/WeakReference;

    .line 340
    return-object p0
.end method

.method public final a()Landroid/app/Activity;
    .locals 1

    .prologue
    .line 348
    iget-object v0, p0, La/a/a/a/f;->m:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 349
    iget-object v0, p0, La/a/a/a/f;->m:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    .line 351
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b()La/a/a/a/a;
    .locals 1

    .prologue
    .line 488
    iget-object v0, p0, La/a/a/a/f;->l:La/a/a/a/a;

    return-object v0
.end method

.method public final c()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .prologue
    .line 492
    iget-object v0, p0, La/a/a/a/f;->g:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method
