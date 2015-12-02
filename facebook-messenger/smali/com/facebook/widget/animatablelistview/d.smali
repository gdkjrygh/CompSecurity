.class public Lcom/facebook/widget/animatablelistview/d;
.super Ljava/lang/Object;
.source "AnimatingListAdapter.java"

# interfaces
.implements Landroid/widget/ListAdapter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Landroid/widget/ListAdapter;"
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/facebook/widget/animatablelistview/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/widget/animatablelistview/q",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<TT;",
            "Lcom/facebook/widget/animatablelistview/a",
            "<TT;>;>;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Landroid/view/View;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/widget/animatablelistview/AnimatingItemView;",
            ">;>;"
        }
    .end annotation
.end field

.field private f:Landroid/database/DataSetObservable;

.field private g:Lcom/facebook/widget/animatablelistview/g;

.field private final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/widget/animatablelistview/j",
            "<TT;>;>;"
        }
    .end annotation
.end field

.field private i:Lcom/facebook/widget/animatablelistview/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/widget/animatablelistview/j",
            "<TT;>;"
        }
    .end annotation
.end field

.field private j:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<TT;>;"
        }
    .end annotation
.end field

.field private k:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<TT;>;"
        }
    .end annotation
.end field

.field private l:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/a/a/b;",
            ">;"
        }
    .end annotation
.end field

.field private m:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/a/a/ar;",
            ">;"
        }
    .end annotation
.end field

.field private n:Z

.field private o:J

.field private p:Lcom/facebook/widget/animatablelistview/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/widget/animatablelistview/k",
            "<TT;>;"
        }
    .end annotation
.end field

.field private q:Lcom/a/a/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 52
    const-class v0, Lcom/facebook/widget/animatablelistview/d;

    sput-object v0, Lcom/facebook/widget/animatablelistview/d;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/widget/animatablelistview/q;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/widget/animatablelistview/q",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    sget-object v0, Lcom/facebook/widget/animatablelistview/g;->STEADY_STATE:Lcom/facebook/widget/animatablelistview/g;

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->g:Lcom/facebook/widget/animatablelistview/g;

    .line 71
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->l:Ljava/util/Set;

    .line 72
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->m:Ljava/util/Set;

    .line 74
    const-wide/16 v0, 0x12c

    iput-wide v0, p0, Lcom/facebook/widget/animatablelistview/d;->o:J

    .line 87
    iput-object p1, p0, Lcom/facebook/widget/animatablelistview/d;->b:Landroid/content/Context;

    .line 88
    iput-object p2, p0, Lcom/facebook/widget/animatablelistview/d;->c:Lcom/facebook/widget/animatablelistview/q;

    .line 89
    new-instance v0, Lcom/google/common/a/hy;

    invoke-direct {v0}, Lcom/google/common/a/hy;-><init>()V

    invoke-virtual {v0}, Lcom/google/common/a/hy;->f()Lcom/google/common/a/hy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/hy;->n()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->d:Ljava/util/Map;

    .line 92
    new-instance v0, Lcom/google/common/a/hy;

    invoke-direct {v0}, Lcom/google/common/a/hy;-><init>()V

    invoke-virtual {v0}, Lcom/google/common/a/hy;->f()Lcom/google/common/a/hy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/hy;->n()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->e:Ljava/util/Map;

    .line 95
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->h:Ljava/util/List;

    .line 96
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->j:Lcom/google/common/a/es;

    .line 97
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->k:Lcom/google/common/a/es;

    .line 98
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->l:Ljava/util/Set;

    invoke-direct {p0}, Lcom/facebook/widget/animatablelistview/d;->h()Lcom/a/a/b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 99
    return-void
.end method

.method private a(Lcom/facebook/widget/animatablelistview/h;)Lcom/a/a/q;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/widget/animatablelistview/h",
            "<TT;>;)",
            "Lcom/a/a/q;"
        }
    .end annotation

    .prologue
    .line 383
    invoke-direct {p0, p1}, Lcom/facebook/widget/animatablelistview/d;->f(Lcom/facebook/widget/animatablelistview/h;)Lcom/facebook/widget/animatablelistview/a;

    move-result-object v0

    .line 384
    const-string v1, "animationOffset"

    const/4 v2, 0x2

    new-array v2, v2, [F

    fill-array-data v2, :array_0

    invoke-static {v0, v1, v2}, Lcom/a/a/q;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/a/a/q;

    move-result-object v1

    .line 386
    iget-wide v2, p0, Lcom/facebook/widget/animatablelistview/d;->o:J

    invoke-virtual {v1, v2, v3}, Lcom/a/a/q;->b(J)Lcom/a/a/q;

    .line 387
    invoke-virtual {p1}, Lcom/facebook/widget/animatablelistview/h;->e()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 388
    invoke-direct {p0, v1, v0}, Lcom/facebook/widget/animatablelistview/d;->a(Lcom/a/a/q;Lcom/facebook/widget/animatablelistview/a;)V

    .line 390
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->m:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/ar;

    .line 391
    invoke-virtual {v1, v0}, Lcom/a/a/q;->a(Lcom/a/a/ar;)V

    goto :goto_0

    .line 393
    :cond_1
    return-object v1

    .line 384
    nop

    :array_0
    .array-data 4
        0x0
        -0x40800000    # -1.0f
    .end array-data
.end method

.method private a(Lcom/a/a/q;Lcom/facebook/widget/animatablelistview/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/a/a/q;",
            "Lcom/facebook/widget/animatablelistview/a",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 468
    new-instance v0, Lcom/facebook/widget/animatablelistview/e;

    invoke-direct {v0, p0, p2}, Lcom/facebook/widget/animatablelistview/e;-><init>(Lcom/facebook/widget/animatablelistview/d;Lcom/facebook/widget/animatablelistview/a;)V

    invoke-virtual {p1, v0}, Lcom/a/a/q;->a(Lcom/a/a/b;)V

    .line 479
    return-void
.end method

.method private b(Lcom/facebook/widget/animatablelistview/h;)Lcom/a/a/q;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/widget/animatablelistview/h",
            "<TT;>;)",
            "Lcom/a/a/q;"
        }
    .end annotation

    .prologue
    .line 397
    invoke-direct {p0, p1}, Lcom/facebook/widget/animatablelistview/d;->f(Lcom/facebook/widget/animatablelistview/h;)Lcom/facebook/widget/animatablelistview/a;

    move-result-object v0

    .line 398
    const-string v1, "animationOffset"

    const/4 v2, 0x2

    new-array v2, v2, [F

    fill-array-data v2, :array_0

    invoke-static {v0, v1, v2}, Lcom/a/a/q;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/a/a/q;

    move-result-object v1

    .line 400
    iget-wide v2, p0, Lcom/facebook/widget/animatablelistview/d;->o:J

    invoke-virtual {v1, v2, v3}, Lcom/a/a/q;->b(J)Lcom/a/a/q;

    .line 401
    invoke-virtual {p1}, Lcom/facebook/widget/animatablelistview/h;->e()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 402
    invoke-direct {p0, v1, v0}, Lcom/facebook/widget/animatablelistview/d;->a(Lcom/a/a/q;Lcom/facebook/widget/animatablelistview/a;)V

    .line 404
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->m:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/ar;

    .line 405
    invoke-virtual {v1, v0}, Lcom/a/a/q;->a(Lcom/a/a/ar;)V

    goto :goto_0

    .line 407
    :cond_1
    return-object v1

    .line 398
    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private c(Lcom/facebook/widget/animatablelistview/h;)Lcom/a/a/q;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/widget/animatablelistview/h",
            "<TT;>;)",
            "Lcom/a/a/q;"
        }
    .end annotation

    .prologue
    .line 411
    invoke-direct {p0, p1}, Lcom/facebook/widget/animatablelistview/d;->f(Lcom/facebook/widget/animatablelistview/h;)Lcom/facebook/widget/animatablelistview/a;

    move-result-object v0

    .line 412
    const-string v1, "animationOffset"

    const/4 v2, 0x2

    new-array v2, v2, [F

    fill-array-data v2, :array_0

    invoke-static {v0, v1, v2}, Lcom/a/a/q;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/a/a/q;

    move-result-object v1

    .line 414
    iget-wide v2, p0, Lcom/facebook/widget/animatablelistview/d;->o:J

    invoke-virtual {v1, v2, v3}, Lcom/a/a/q;->b(J)Lcom/a/a/q;

    .line 415
    invoke-virtual {p1}, Lcom/facebook/widget/animatablelistview/h;->e()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 416
    invoke-direct {p0, v1, v0}, Lcom/facebook/widget/animatablelistview/d;->a(Lcom/a/a/q;Lcom/facebook/widget/animatablelistview/a;)V

    .line 418
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->m:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/ar;

    .line 419
    invoke-virtual {v1, v0}, Lcom/a/a/q;->a(Lcom/a/a/ar;)V

    goto :goto_0

    .line 421
    :cond_1
    return-object v1

    .line 412
    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method private d(Lcom/facebook/widget/animatablelistview/h;)Lcom/a/a/q;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/widget/animatablelistview/h",
            "<TT;>;)",
            "Lcom/a/a/q;"
        }
    .end annotation

    .prologue
    .line 425
    invoke-direct {p0, p1}, Lcom/facebook/widget/animatablelistview/d;->f(Lcom/facebook/widget/animatablelistview/h;)Lcom/facebook/widget/animatablelistview/a;

    move-result-object v0

    .line 426
    const-string v1, "animationOffset"

    const/4 v2, 0x2

    new-array v2, v2, [F

    fill-array-data v2, :array_0

    invoke-static {v0, v1, v2}, Lcom/a/a/q;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/a/a/q;

    move-result-object v1

    .line 428
    iget-wide v2, p0, Lcom/facebook/widget/animatablelistview/d;->o:J

    invoke-virtual {v1, v2, v3}, Lcom/a/a/q;->b(J)Lcom/a/a/q;

    .line 429
    invoke-virtual {p1}, Lcom/facebook/widget/animatablelistview/h;->e()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 430
    invoke-direct {p0, v1, v0}, Lcom/facebook/widget/animatablelistview/d;->a(Lcom/a/a/q;Lcom/facebook/widget/animatablelistview/a;)V

    .line 432
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->m:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/ar;

    .line 433
    invoke-virtual {v1, v0}, Lcom/a/a/q;->a(Lcom/a/a/ar;)V

    goto :goto_0

    .line 435
    :cond_1
    return-object v1

    .line 426
    nop

    :array_0
    .array-data 4
        -0x40800000    # -1.0f
        0x0
    .end array-data
.end method

.method private e(Lcom/facebook/widget/animatablelistview/h;)Lcom/a/a/a;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/widget/animatablelistview/h",
            "<TT;>;)",
            "Lcom/a/a/a;"
        }
    .end annotation

    .prologue
    .line 439
    invoke-direct {p0, p1}, Lcom/facebook/widget/animatablelistview/d;->f(Lcom/facebook/widget/animatablelistview/h;)Lcom/facebook/widget/animatablelistview/a;

    move-result-object v0

    .line 440
    invoke-virtual {p1}, Lcom/facebook/widget/animatablelistview/h;->d()Lcom/a/a/a;

    move-result-object v1

    .line 441
    invoke-virtual {v1, v0}, Lcom/a/a/a;->a(Ljava/lang/Object;)V

    .line 443
    instance-of v0, v1, Lcom/a/a/d;

    if-eqz v0, :cond_1

    move-object v0, v1

    .line 445
    check-cast v0, Lcom/a/a/d;

    invoke-virtual {v0}, Lcom/a/a/d;->h()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/a;

    .line 446
    instance-of v2, v0, Lcom/a/a/q;

    if-eqz v2, :cond_0

    .line 447
    check-cast v0, Lcom/a/a/q;

    .line 448
    iget-object v2, p0, Lcom/facebook/widget/animatablelistview/d;->m:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/a/a/ar;

    .line 449
    invoke-virtual {v0, v2}, Lcom/a/a/q;->a(Lcom/a/a/ar;)V

    goto :goto_0

    .line 453
    :cond_1
    instance-of v0, v1, Lcom/a/a/q;

    if-eqz v0, :cond_2

    move-object v0, v1

    .line 454
    check-cast v0, Lcom/a/a/q;

    .line 455
    iget-object v2, p0, Lcom/facebook/widget/animatablelistview/d;->m:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/a/a/ar;

    .line 456
    invoke-virtual {v0, v2}, Lcom/a/a/q;->a(Lcom/a/a/ar;)V

    goto :goto_1

    .line 459
    :cond_2
    sget-object v0, Lcom/facebook/widget/animatablelistview/d;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unsupported animation: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 460
    const/4 v1, 0x0

    .line 463
    :cond_3
    return-object v1
.end method

.method private e()V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 322
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->g:Lcom/facebook/widget/animatablelistview/g;

    sget-object v2, Lcom/facebook/widget/animatablelistview/g;->STEADY_STATE:Lcom/facebook/widget/animatablelistview/g;

    if-eq v0, v2, :cond_1

    .line 380
    :cond_0
    :goto_0
    return-void

    .line 325
    :cond_1
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 331
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->h:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/animatablelistview/j;

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->i:Lcom/facebook/widget/animatablelistview/j;

    .line 332
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->i:Lcom/facebook/widget/animatablelistview/j;

    invoke-virtual {v0}, Lcom/facebook/widget/animatablelistview/j;->b()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->j:Lcom/google/common/a/es;

    .line 335
    invoke-direct {p0}, Lcom/facebook/widget/animatablelistview/d;->g()V

    .line 336
    invoke-direct {p0}, Lcom/facebook/widget/animatablelistview/d;->i()V

    .line 339
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v2

    .line 341
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->i:Lcom/facebook/widget/animatablelistview/j;

    invoke-virtual {v0}, Lcom/facebook/widget/animatablelistview/j;->a()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/animatablelistview/h;

    .line 342
    invoke-virtual {v0}, Lcom/facebook/widget/animatablelistview/h;->a()Lcom/facebook/widget/animatablelistview/i;

    move-result-object v4

    .line 343
    sget-object v5, Lcom/facebook/widget/animatablelistview/i;->ADD_WITH_ANIMATION_UP:Lcom/facebook/widget/animatablelistview/i;

    if-eq v4, v5, :cond_3

    sget-object v5, Lcom/facebook/widget/animatablelistview/i;->ADD_WITH_ANIMATION_DOWN:Lcom/facebook/widget/animatablelistview/i;

    if-eq v4, v5, :cond_3

    sget-object v5, Lcom/facebook/widget/animatablelistview/i;->REMOVE_WITH_ANIMATION_DOWN:Lcom/facebook/widget/animatablelistview/i;

    if-eq v4, v5, :cond_3

    sget-object v5, Lcom/facebook/widget/animatablelistview/i;->REMOVE_WITH_ANIMATION_UP:Lcom/facebook/widget/animatablelistview/i;

    if-eq v4, v5, :cond_3

    sget-object v5, Lcom/facebook/widget/animatablelistview/i;->CUSTOM:Lcom/facebook/widget/animatablelistview/i;

    if-ne v4, v5, :cond_4

    .line 348
    :cond_3
    const/4 v1, 0x1

    .line 350
    :cond_4
    iget-boolean v5, p0, Lcom/facebook/widget/animatablelistview/d;->n:Z

    if-nez v5, :cond_2

    .line 351
    sget-object v5, Lcom/facebook/widget/animatablelistview/i;->ADD_WITH_ANIMATION_UP:Lcom/facebook/widget/animatablelistview/i;

    if-ne v4, v5, :cond_5

    .line 352
    invoke-direct {p0, v0}, Lcom/facebook/widget/animatablelistview/d;->b(Lcom/facebook/widget/animatablelistview/h;)Lcom/a/a/q;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 353
    :cond_5
    sget-object v5, Lcom/facebook/widget/animatablelistview/i;->ADD_WITH_ANIMATION_DOWN:Lcom/facebook/widget/animatablelistview/i;

    if-ne v4, v5, :cond_6

    .line 354
    invoke-direct {p0, v0}, Lcom/facebook/widget/animatablelistview/d;->a(Lcom/facebook/widget/animatablelistview/h;)Lcom/a/a/q;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 355
    :cond_6
    sget-object v5, Lcom/facebook/widget/animatablelistview/i;->REMOVE_WITH_ANIMATION_DOWN:Lcom/facebook/widget/animatablelistview/i;

    if-ne v4, v5, :cond_7

    .line 356
    invoke-direct {p0, v0}, Lcom/facebook/widget/animatablelistview/d;->c(Lcom/facebook/widget/animatablelistview/h;)Lcom/a/a/q;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 357
    :cond_7
    sget-object v5, Lcom/facebook/widget/animatablelistview/i;->REMOVE_WITH_ANIMATION_UP:Lcom/facebook/widget/animatablelistview/i;

    if-ne v4, v5, :cond_8

    .line 358
    invoke-direct {p0, v0}, Lcom/facebook/widget/animatablelistview/d;->d(Lcom/facebook/widget/animatablelistview/h;)Lcom/a/a/q;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 359
    :cond_8
    sget-object v5, Lcom/facebook/widget/animatablelistview/i;->CUSTOM:Lcom/facebook/widget/animatablelistview/i;

    if-ne v4, v5, :cond_2

    .line 360
    invoke-direct {p0, v0}, Lcom/facebook/widget/animatablelistview/d;->e(Lcom/facebook/widget/animatablelistview/h;)Lcom/a/a/a;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 365
    :cond_9
    if-nez v1, :cond_a

    .line 366
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->i:Lcom/facebook/widget/animatablelistview/j;

    .line 367
    sget-object v0, Lcom/facebook/widget/animatablelistview/g;->STEADY_STATE:Lcom/facebook/widget/animatablelistview/g;

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->g:Lcom/facebook/widget/animatablelistview/g;

    .line 368
    invoke-direct {p0}, Lcom/facebook/widget/animatablelistview/d;->e()V

    goto/16 :goto_0

    .line 369
    :cond_a
    iget-boolean v0, p0, Lcom/facebook/widget/animatablelistview/d;->n:Z

    if-eqz v0, :cond_b

    .line 370
    sget-object v0, Lcom/facebook/widget/animatablelistview/g;->WAITING_FOR_ANIMATION_TO_FINISH:Lcom/facebook/widget/animatablelistview/g;

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->g:Lcom/facebook/widget/animatablelistview/g;

    goto/16 :goto_0

    .line 372
    :cond_b
    new-instance v0, Lcom/a/a/d;

    invoke-direct {v0}, Lcom/a/a/d;-><init>()V

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->q:Lcom/a/a/d;

    .line 373
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->l:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/b;

    .line 374
    iget-object v3, p0, Lcom/facebook/widget/animatablelistview/d;->q:Lcom/a/a/d;

    invoke-virtual {v3, v0}, Lcom/a/a/d;->a(Lcom/a/a/b;)V

    goto :goto_2

    .line 376
    :cond_c
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->q:Lcom/a/a/d;

    invoke-virtual {v0, v2}, Lcom/a/a/d;->a(Ljava/util/Collection;)V

    .line 377
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->q:Lcom/a/a/d;

    invoke-virtual {v0}, Lcom/a/a/d;->a()V

    .line 378
    sget-object v0, Lcom/facebook/widget/animatablelistview/g;->WAITING_FOR_ANIMATION_TO_FINISH:Lcom/facebook/widget/animatablelistview/g;

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->g:Lcom/facebook/widget/animatablelistview/g;

    goto/16 :goto_0
.end method

.method private f(Lcom/facebook/widget/animatablelistview/h;)Lcom/facebook/widget/animatablelistview/a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/widget/animatablelistview/h",
            "<TT;>;)",
            "Lcom/facebook/widget/animatablelistview/a",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 482
    invoke-virtual {p1}, Lcom/facebook/widget/animatablelistview/h;->b()Ljava/lang/Object;

    move-result-object v0

    .line 483
    iget-object v1, p0, Lcom/facebook/widget/animatablelistview/d;->d:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/animatablelistview/a;

    .line 485
    invoke-virtual {p1}, Lcom/facebook/widget/animatablelistview/h;->c()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    .line 486
    invoke-virtual {p1}, Lcom/facebook/widget/animatablelistview/h;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/animatablelistview/a;->a(I)Lcom/facebook/widget/animatablelistview/a;

    move-result-object v0

    .line 488
    :cond_0
    return-object v0
.end method

.method private f()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 504
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->i:Lcom/facebook/widget/animatablelistview/j;

    invoke-virtual {v0}, Lcom/facebook/widget/animatablelistview/j;->c()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->j:Lcom/google/common/a/es;

    .line 505
    invoke-direct {p0}, Lcom/facebook/widget/animatablelistview/d;->g()V

    .line 506
    invoke-direct {p0}, Lcom/facebook/widget/animatablelistview/d;->i()V

    .line 507
    iput-object v1, p0, Lcom/facebook/widget/animatablelistview/d;->i:Lcom/facebook/widget/animatablelistview/j;

    .line 508
    iput-object v1, p0, Lcom/facebook/widget/animatablelistview/d;->q:Lcom/a/a/d;

    .line 509
    sget-object v0, Lcom/facebook/widget/animatablelistview/g;->STEADY_STATE:Lcom/facebook/widget/animatablelistview/g;

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->g:Lcom/facebook/widget/animatablelistview/g;

    .line 510
    invoke-direct {p0}, Lcom/facebook/widget/animatablelistview/d;->e()V

    .line 511
    return-void
.end method

.method private g()V
    .locals 4

    .prologue
    .line 514
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->j:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 515
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->d:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/animatablelistview/a;

    .line 516
    if-nez v0, :cond_0

    .line 517
    new-instance v0, Lcom/facebook/widget/animatablelistview/a;

    invoke-direct {v0}, Lcom/facebook/widget/animatablelistview/a;-><init>()V

    .line 518
    iget-object v3, p0, Lcom/facebook/widget/animatablelistview/d;->d:Ljava/util/Map;

    invoke-interface {v3, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 521
    :cond_1
    return-void
.end method

.method private h()Lcom/a/a/b;
    .locals 1

    .prologue
    .line 524
    new-instance v0, Lcom/facebook/widget/animatablelistview/f;

    invoke-direct {v0, p0}, Lcom/facebook/widget/animatablelistview/f;-><init>(Lcom/facebook/widget/animatablelistview/d;)V

    return-object v0
.end method

.method private declared-synchronized i()V
    .locals 1

    .prologue
    .line 546
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->f:Landroid/database/DataSetObservable;

    if-eqz v0, :cond_0

    .line 547
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->f:Landroid/database/DataSetObservable;

    invoke-virtual {v0}, Landroid/database/DataSetObservable;->notifyChanged()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 549
    :cond_0
    monitor-exit p0

    return-void

    .line 546
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized j()V
    .locals 1

    .prologue
    .line 552
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->f:Landroid/database/DataSetObservable;

    if-eqz v0, :cond_0

    .line 553
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->f:Landroid/database/DataSetObservable;

    invoke-virtual {v0}, Landroid/database/DataSetObservable;->notifyInvalidated()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 555
    :cond_0
    monitor-exit p0

    return-void

    .line 552
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public a()Lcom/facebook/widget/animatablelistview/k;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/widget/animatablelistview/k",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 108
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->p:Lcom/facebook/widget/animatablelistview/k;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Already a pending transaction"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 109
    new-instance v0, Lcom/facebook/widget/animatablelistview/k;

    invoke-direct {v0, p0}, Lcom/facebook/widget/animatablelistview/k;-><init>(Lcom/facebook/widget/animatablelistview/d;)V

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->p:Lcom/facebook/widget/animatablelistview/k;

    .line 110
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->p:Lcom/facebook/widget/animatablelistview/k;

    return-object v0

    .line 108
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/a/a/a;)V
    .locals 2

    .prologue
    .line 492
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->q:Lcom/a/a/d;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->g:Lcom/facebook/widget/animatablelistview/g;

    sget-object v1, Lcom/facebook/widget/animatablelistview/g;->WAITING_FOR_ANIMATION_TO_FINISH:Lcom/facebook/widget/animatablelistview/g;

    if-ne v0, v1, :cond_0

    .line 493
    invoke-direct {p0}, Lcom/facebook/widget/animatablelistview/d;->f()V

    .line 495
    :cond_0
    return-void
.end method

.method a(Lcom/a/a/ar;)V
    .locals 1

    .prologue
    .line 193
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->m:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 194
    return-void
.end method

.method a(Lcom/facebook/widget/animatablelistview/k;Lcom/google/common/a/es;Lcom/google/common/a/es;Lcom/google/common/a/es;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/widget/animatablelistview/k",
            "<*>;",
            "Lcom/google/common/a/es",
            "<TT;>;",
            "Lcom/google/common/a/es",
            "<TT;>;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/widget/animatablelistview/h",
            "<TT;>;>;)V"
        }
    .end annotation

    .prologue
    .line 118
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->p:Lcom/facebook/widget/animatablelistview/k;

    if-ne v0, p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Wrong transaction"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 119
    new-instance v0, Lcom/facebook/widget/animatablelistview/j;

    invoke-direct {v0, p4, p2, p3}, Lcom/facebook/widget/animatablelistview/j;-><init>(Lcom/google/common/a/es;Lcom/google/common/a/es;Lcom/google/common/a/es;)V

    .line 123
    iget-object v1, p0, Lcom/facebook/widget/animatablelistview/d;->h:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    iput-object p3, p0, Lcom/facebook/widget/animatablelistview/d;->k:Lcom/google/common/a/es;

    .line 125
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->p:Lcom/facebook/widget/animatablelistview/k;

    .line 126
    invoke-direct {p0}, Lcom/facebook/widget/animatablelistview/d;->e()V

    .line 127
    return-void

    .line 118
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public areAllItemsEnabled()Z
    .locals 1

    .prologue
    .line 216
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->c:Lcom/facebook/widget/animatablelistview/q;

    invoke-interface {v0}, Lcom/facebook/widget/animatablelistview/q;->b()Z

    move-result v0

    return v0
.end method

.method public b()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 134
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->j:Lcom/google/common/a/es;

    .line 135
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->k:Lcom/google/common/a/es;

    .line 136
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 137
    iput-object v1, p0, Lcom/facebook/widget/animatablelistview/d;->q:Lcom/a/a/d;

    .line 138
    iput-object v1, p0, Lcom/facebook/widget/animatablelistview/d;->p:Lcom/facebook/widget/animatablelistview/k;

    .line 139
    iput-object v1, p0, Lcom/facebook/widget/animatablelistview/d;->i:Lcom/facebook/widget/animatablelistview/j;

    .line 140
    sget-object v0, Lcom/facebook/widget/animatablelistview/g;->STEADY_STATE:Lcom/facebook/widget/animatablelistview/g;

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->g:Lcom/facebook/widget/animatablelistview/g;

    .line 141
    invoke-direct {p0}, Lcom/facebook/widget/animatablelistview/d;->j()V

    .line 142
    return-void
.end method

.method public b(Lcom/a/a/a;)V
    .locals 2

    .prologue
    .line 498
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->q:Lcom/a/a/d;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->g:Lcom/facebook/widget/animatablelistview/g;

    sget-object v1, Lcom/facebook/widget/animatablelistview/g;->WAITING_FOR_ANIMATION_TO_FINISH:Lcom/facebook/widget/animatablelistview/g;

    if-ne v0, v1, :cond_0

    .line 499
    invoke-direct {p0}, Lcom/facebook/widget/animatablelistview/d;->f()V

    .line 501
    :cond_0
    return-void
.end method

.method public c()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 167
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->j:Lcom/google/common/a/es;

    return-object v0
.end method

.method public d()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 178
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->k:Lcom/google/common/a/es;

    return-object v0
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 240
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->j:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .prologue
    .line 245
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->j:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    .line 246
    const/4 v0, 0x0

    .line 248
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->j:Lcom/google/common/a/es;

    invoke-virtual {v0, p1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 253
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->c:Lcom/facebook/widget/animatablelistview/q;

    invoke-virtual {p0, p1}, Lcom/facebook/widget/animatablelistview/d;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/widget/animatablelistview/q;->b(Ljava/lang/Object;)J

    move-result-wide v0

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 2

    .prologue
    .line 231
    invoke-virtual {p0, p1}, Lcom/facebook/widget/animatablelistview/d;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    .line 232
    if-nez v0, :cond_0

    .line 233
    const/4 v0, -0x1

    .line 235
    :goto_0
    return v0

    :cond_0
    iget-object v1, p0, Lcom/facebook/widget/animatablelistview/d;->c:Lcom/facebook/widget/animatablelistview/q;

    invoke-interface {v1, v0}, Lcom/facebook/widget/animatablelistview/q;->c(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 263
    check-cast p2, Lcom/facebook/widget/animatablelistview/AnimatingItemView;

    .line 264
    invoke-virtual {p0, p1}, Lcom/facebook/widget/animatablelistview/d;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    .line 265
    if-nez p2, :cond_1

    .line 266
    new-instance p2, Lcom/facebook/widget/animatablelistview/AnimatingItemView;

    iget-object v1, p0, Lcom/facebook/widget/animatablelistview/d;->b:Landroid/content/Context;

    invoke-direct {p2, v1}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;-><init>(Landroid/content/Context;)V

    .line 267
    iget-object v1, p0, Lcom/facebook/widget/animatablelistview/d;->c:Lcom/facebook/widget/animatablelistview/q;

    invoke-interface {v1, v0, v4, p2}, Lcom/facebook/widget/animatablelistview/q;->a(Ljava/lang/Object;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 268
    invoke-virtual {p2, v1}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->addView(Landroid/view/View;)V

    .line 277
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/facebook/widget/animatablelistview/d;->d:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/animatablelistview/a;

    .line 278
    invoke-virtual {p2, v0}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->setItemInfo(Lcom/facebook/widget/animatablelistview/a;)V

    .line 281
    iget-object v1, p0, Lcom/facebook/widget/animatablelistview/d;->e:Ljava/util/Map;

    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 282
    if-eqz v1, :cond_2

    .line 283
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/widget/animatablelistview/AnimatingItemView;

    .line 284
    invoke-virtual {v2, v4}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->setItemInfo(Lcom/facebook/widget/animatablelistview/a;)V

    goto :goto_1

    .line 270
    :cond_1
    const/4 v1, 0x0

    invoke-virtual {p2, v1}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 271
    iget-object v2, p0, Lcom/facebook/widget/animatablelistview/d;->c:Lcom/facebook/widget/animatablelistview/q;

    invoke-interface {v2, v0, v1, p2}, Lcom/facebook/widget/animatablelistview/q;->a(Ljava/lang/Object;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 272
    if-eq v2, v1, :cond_0

    .line 273
    invoke-virtual {p2}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->removeAllViews()V

    .line 274
    invoke-virtual {p2, v2}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->addView(Landroid/view/View;)V

    goto :goto_0

    .line 289
    :cond_2
    invoke-virtual {v0}, Lcom/facebook/widget/animatablelistview/a;->f()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v2, v1

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 290
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p2, v1}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 291
    instance-of v4, v1, Lcom/facebook/widget/animatablelistview/AnimatingItemView;

    if-eqz v4, :cond_5

    .line 292
    check-cast v1, Lcom/facebook/widget/animatablelistview/AnimatingItemView;

    .line 293
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/animatablelistview/a;

    invoke-virtual {v1, v0}, Lcom/facebook/widget/animatablelistview/AnimatingItemView;->setItemInfo(Lcom/facebook/widget/animatablelistview/a;)V

    .line 294
    if-nez v2, :cond_4

    .line 295
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/google/common/a/hq;->c(I)Ljava/util/ArrayList;

    move-result-object v0

    .line 296
    iget-object v2, p0, Lcom/facebook/widget/animatablelistview/d;->e:Ljava/util/Map;

    invoke-interface {v2, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    :goto_3
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_4
    move-object v2, v0

    .line 300
    goto :goto_2

    .line 301
    :cond_3
    return-object p2

    :cond_4
    move-object v0, v2

    goto :goto_3

    :cond_5
    move-object v0, v2

    goto :goto_4
.end method

.method public getViewTypeCount()I
    .locals 1

    .prologue
    .line 226
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->c:Lcom/facebook/widget/animatablelistview/q;

    invoke-interface {v0}, Lcom/facebook/widget/animatablelistview/q;->a()I

    move-result v0

    return v0
.end method

.method public hasStableIds()Z
    .locals 1

    .prologue
    .line 211
    const/4 v0, 0x1

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 258
    invoke-virtual {p0}, Lcom/facebook/widget/animatablelistview/d;->getCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isEnabled(I)Z
    .locals 2

    .prologue
    .line 221
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->c:Lcom/facebook/widget/animatablelistview/q;

    invoke-virtual {p0, p1}, Lcom/facebook/widget/animatablelistview/d;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/widget/animatablelistview/q;->a(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public declared-synchronized registerDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 1

    .prologue
    .line 559
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->f:Landroid/database/DataSetObservable;

    if-nez v0, :cond_0

    .line 560
    new-instance v0, Landroid/database/DataSetObservable;

    invoke-direct {v0}, Landroid/database/DataSetObservable;-><init>()V

    iput-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->f:Landroid/database/DataSetObservable;

    .line 562
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->f:Landroid/database/DataSetObservable;

    invoke-virtual {v0, p1}, Landroid/database/DataSetObservable;->registerObserver(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 563
    monitor-exit p0

    return-void

    .line 559
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 1

    .prologue
    .line 567
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->f:Landroid/database/DataSetObservable;

    if-eqz v0, :cond_0

    .line 568
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/d;->f:Landroid/database/DataSetObservable;

    invoke-virtual {v0, p1}, Landroid/database/DataSetObservable;->unregisterObserver(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 570
    :cond_0
    monitor-exit p0

    return-void

    .line 567
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
