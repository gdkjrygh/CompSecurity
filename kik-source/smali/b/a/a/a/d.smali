.class public Lb/a/a/a/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/a/a/a/d$a;
    }
.end annotation


# static fields
.field static volatile a:Lb/a/a/a/d;

.field static final b:Lb/a/a/a/o;


# instance fields
.field final c:Lb/a/a/a/o;

.field final d:Z

.field private final e:Landroid/content/Context;

.field private final f:Ljava/util/Map;

.field private final g:Ljava/util/concurrent/ExecutorService;

.field private final h:Landroid/os/Handler;

.field private final i:Lb/a/a/a/i;

.field private final j:Lb/a/a/a/i;

.field private final k:Lb/a/a/a/a/b/t;

.field private l:Lb/a/a/a/a;

.field private m:Ljava/lang/ref/WeakReference;

.field private n:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 56
    new-instance v0, Lb/a/a/a/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb/a/a/a/c;-><init>(B)V

    sput-object v0, Lb/a/a/a/d;->b:Lb/a/a/a/o;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Ljava/util/Map;Lb/a/a/a/a/c/p;Landroid/os/Handler;Lb/a/a/a/o;ZLb/a/a/a/i;Lb/a/a/a/a/b/t;)V
    .locals 2

    .prologue
    .line 281
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 282
    iput-object p1, p0, Lb/a/a/a/d;->e:Landroid/content/Context;

    .line 283
    iput-object p2, p0, Lb/a/a/a/d;->f:Ljava/util/Map;

    .line 284
    iput-object p3, p0, Lb/a/a/a/d;->g:Ljava/util/concurrent/ExecutorService;

    .line 285
    iput-object p4, p0, Lb/a/a/a/d;->h:Landroid/os/Handler;

    .line 286
    iput-object p5, p0, Lb/a/a/a/d;->c:Lb/a/a/a/o;

    .line 287
    iput-boolean p6, p0, Lb/a/a/a/d;->d:Z

    .line 288
    iput-object p7, p0, Lb/a/a/a/d;->i:Lb/a/a/a/i;

    .line 289
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lb/a/a/a/d;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 290
    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v0

    new-instance v1, Lb/a/a/a/f;

    invoke-direct {v1, p0, v0}, Lb/a/a/a/f;-><init>(Lb/a/a/a/d;I)V

    iput-object v1, p0, Lb/a/a/a/d;->j:Lb/a/a/a/i;

    .line 291
    iput-object p8, p0, Lb/a/a/a/d;->k:Lb/a/a/a/a/b/t;

    .line 292
    return-void
.end method

.method public static varargs a(Landroid/content/Context;[Lb/a/a/a/l;)Lb/a/a/a/d;
    .locals 10

    .prologue
    const/4 v1, 0x0

    .line 306
    sget-object v0, Lb/a/a/a/d;->a:Lb/a/a/a/d;

    if-nez v0, :cond_6

    .line 307
    const-class v2, Lb/a/a/a/d;

    monitor-enter v2

    .line 308
    :try_start_0
    sget-object v0, Lb/a/a/a/d;->a:Lb/a/a/a/d;

    if-nez v0, :cond_5

    .line 309
    new-instance v0, Lb/a/a/a/d$a;

    invoke-direct {v0, p0}, Lb/a/a/a/d$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Lb/a/a/a/d$a;->a([Lb/a/a/a/l;)Lb/a/a/a/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lb/a/a/a/d$a;->a()Lb/a/a/a/d;

    move-result-object v3

    sput-object v3, Lb/a/a/a/d;->a:Lb/a/a/a/d;

    iget-object v0, v3, Lb/a/a/a/d;->e:Landroid/content/Context;

    instance-of v4, v0, Landroid/app/Activity;

    if-eqz v4, :cond_0

    check-cast v0, Landroid/app/Activity;

    :goto_0
    invoke-virtual {v3, v0}, Lb/a/a/a/d;->a(Landroid/app/Activity;)Lb/a/a/a/d;

    new-instance v0, Lb/a/a/a/a;

    iget-object v4, v3, Lb/a/a/a/d;->e:Landroid/content/Context;

    invoke-direct {v0, v4}, Lb/a/a/a/a;-><init>(Landroid/content/Context;)V

    iput-object v0, v3, Lb/a/a/a/d;->l:Lb/a/a/a/a;

    iget-object v0, v3, Lb/a/a/a/d;->l:Lb/a/a/a/a;

    new-instance v4, Lb/a/a/a/e;

    invoke-direct {v4, v3}, Lb/a/a/a/e;-><init>(Lb/a/a/a/d;)V

    invoke-virtual {v0, v4}, Lb/a/a/a/a;->a(Lb/a/a/a/a$b;)Z

    iget-object v4, v3, Lb/a/a/a/d;->e:Landroid/content/Context;

    new-instance v0, Lb/a/a/a/h;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageCodePath()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v5}, Lb/a/a/a/h;-><init>(Ljava/lang/String;)V

    iget-object v5, v3, Lb/a/a/a/d;->g:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v5, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    iget-object v5, v3, Lb/a/a/a/d;->f:Ljava/util/Map;

    invoke-interface {v5}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v5

    new-instance v6, Lb/a/a/a/p;

    invoke-direct {v6, v0, v5}, Lb/a/a/a/p;-><init>(Ljava/util/concurrent/Future;Ljava/util/Collection;)V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v7}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    sget-object v0, Lb/a/a/a/i;->d:Lb/a/a/a/i;

    iget-object v5, v3, Lb/a/a/a/d;->k:Lb/a/a/a/a/b/t;

    invoke-virtual {v6, v4, v3, v0, v5}, Lb/a/a/a/p;->a(Landroid/content/Context;Lb/a/a/a/d;Lb/a/a/a/i;Lb/a/a/a/a/b/t;)V

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/a/a/l;

    iget-object v8, v3, Lb/a/a/a/d;->j:Lb/a/a/a/i;

    iget-object v9, v3, Lb/a/a/a/d;->k:Lb/a/a/a/a/b/t;

    invoke-virtual {v0, v4, v3, v8, v9}, Lb/a/a/a/l;->a(Landroid/content/Context;Lb/a/a/a/d;Lb/a/a/a/i;Lb/a/a/a/a/b/t;)V

    goto :goto_1

    .line 311
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    move-object v0, v1

    .line 309
    goto :goto_0

    :cond_1
    :try_start_1
    invoke-virtual {v6}, Lb/a/a/a/p;->t()V

    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v0

    const/4 v4, 0x3

    invoke-interface {v0, v4}, Lb/a/a/a/o;->a(I)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Initializing io.fabric.sdk.android:fabric [Version: 1.3.3.56], with the following kits:\n"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object v1, v0

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

    check-cast v0, Lb/a/a/a/l;

    iget-object v5, v0, Lb/a/a/a/l;->f:Lb/a/a/a/k;

    iget-object v7, v6, Lb/a/a/a/p;->f:Lb/a/a/a/k;

    invoke-virtual {v5, v7}, Lb/a/a/a/k;->a(Lb/a/a/a/a/c/q;)V

    iget-object v5, v3, Lb/a/a/a/d;->f:Ljava/util/Map;

    invoke-static {v5, v0}, Lb/a/a/a/d;->a(Ljava/util/Map;Lb/a/a/a/l;)V

    invoke-virtual {v0}, Lb/a/a/a/l;->t()V

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lb/a/a/a/l;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, " [Version: "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v0}, Lb/a/a/a/l;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, "]\n"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_4
    if-eqz v1, :cond_5

    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    .line 311
    :cond_5
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 313
    :cond_6
    sget-object v0, Lb/a/a/a/d;->a:Lb/a/a/a/d;

    return-object v0
.end method

.method public static a(Ljava/lang/Class;)Lb/a/a/a/l;
    .locals 2

    .prologue
    .line 522
    sget-object v0, Lb/a/a/a/d;->a:Lb/a/a/a/d;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Must Initialize Fabric before using singleton()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    sget-object v0, Lb/a/a/a/d;->a:Lb/a/a/a/d;

    iget-object v0, v0, Lb/a/a/a/d;->f:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/a/a/l;

    return-object v0
.end method

.method static synthetic a(Ljava/util/Collection;)Ljava/util/Map;
    .locals 2

    .prologue
    .line 48
    new-instance v0, Ljava/util/HashMap;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    invoke-static {v0, p0}, Lb/a/a/a/d;->a(Ljava/util/Map;Ljava/util/Collection;)V

    return-object v0
.end method

.method static synthetic a(Lb/a/a/a/d;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lb/a/a/a/d;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method private static a(Ljava/util/Map;Lb/a/a/a/l;)V
    .locals 7

    .prologue
    .line 458
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lb/a/a/a/a/c/h;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lb/a/a/a/a/c/h;

    .line 459
    if-eqz v0, :cond_4

    .line 460
    invoke-interface {v0}, Lb/a/a/a/a/c/h;->a()[Ljava/lang/Class;

    move-result-object v2

    .line 461
    array-length v3, v2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_4

    aget-object v4, v2, v1

    .line 462
    invoke-virtual {v4}, Ljava/lang/Class;->isInterface()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 464
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

    check-cast v0, Lb/a/a/a/l;

    .line 465
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 466
    iget-object v6, p1, Lb/a/a/a/l;->f:Lb/a/a/a/k;

    iget-object v0, v0, Lb/a/a/a/l;->f:Lb/a/a/a/k;

    invoke-virtual {v6, v0}, Lb/a/a/a/k;->a(Lb/a/a/a/a/c/q;)V

    goto :goto_1

    .line 472
    :cond_1
    invoke-interface {p0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/a/a/l;

    .line 473
    if-nez v0, :cond_2

    .line 474
    new-instance v0, Lb/a/a/a/a/c/r;

    const-string v1, "Referenced Kit was null, does the kit exist?"

    invoke-direct {v0, v1}, Lb/a/a/a/a/c/r;-><init>(Ljava/lang/String;)V

    throw v0

    .line 478
    :cond_2
    iget-object v5, p1, Lb/a/a/a/l;->f:Lb/a/a/a/k;

    invoke-interface {p0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/a/a/l;

    iget-object v0, v0, Lb/a/a/a/l;->f:Lb/a/a/a/k;

    invoke-virtual {v5, v0}, Lb/a/a/a/k;->a(Lb/a/a/a/a/c/q;)V

    .line 461
    :cond_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 483
    :cond_4
    return-void
.end method

.method private static a(Ljava/util/Map;Ljava/util/Collection;)V
    .locals 3

    .prologue
    .line 578
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/a/a/l;

    .line 579
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-interface {p0, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 581
    instance-of v2, v0, Lb/a/a/a/m;

    if-eqz v2, :cond_0

    .line 582
    check-cast v0, Lb/a/a/a/m;

    invoke-interface {v0}, Lb/a/a/a/m;->c()Ljava/util/Collection;

    move-result-object v0

    invoke-static {p0, v0}, Lb/a/a/a/d;->a(Ljava/util/Map;Ljava/util/Collection;)V

    goto :goto_0

    .line 585
    :cond_1
    return-void
.end method

.method static synthetic b(Lb/a/a/a/d;)Lb/a/a/a/i;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lb/a/a/a/d;->i:Lb/a/a/a/i;

    return-object v0
.end method

.method public static c()Lb/a/a/a/o;
    .locals 1

    .prologue
    .line 529
    sget-object v0, Lb/a/a/a/d;->a:Lb/a/a/a/d;

    if-nez v0, :cond_0

    .line 530
    sget-object v0, Lb/a/a/a/d;->b:Lb/a/a/a/o;

    .line 532
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lb/a/a/a/d;->a:Lb/a/a/a/d;

    iget-object v0, v0, Lb/a/a/a/d;->c:Lb/a/a/a/o;

    goto :goto_0
.end method

.method public static d()Z
    .locals 1

    .prologue
    .line 539
    sget-object v0, Lb/a/a/a/d;->a:Lb/a/a/a/d;

    if-nez v0, :cond_0

    .line 540
    const/4 v0, 0x0

    .line 542
    :goto_0
    return v0

    :cond_0
    sget-object v0, Lb/a/a/a/d;->a:Lb/a/a/a/d;

    iget-boolean v0, v0, Lb/a/a/a/d;->d:Z

    goto :goto_0
.end method


# virtual methods
.method public final a()Landroid/app/Activity;
    .locals 1

    .prologue
    .line 354
    iget-object v0, p0, Lb/a/a/a/d;->m:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 355
    iget-object v0, p0, Lb/a/a/a/d;->m:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    .line 357
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(Landroid/app/Activity;)Lb/a/a/a/d;
    .locals 1

    .prologue
    .line 345
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lb/a/a/a/d;->m:Ljava/lang/ref/WeakReference;

    .line 346
    return-object p0
.end method

.method public final b()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .prologue
    .line 498
    iget-object v0, p0, Lb/a/a/a/d;->g:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method
