.class public final Lkik/a/g/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/e/l;


# instance fields
.field private final a:Lkik/a/e/f;

.field private final b:Lkik/a/e/r;

.field private final c:Lkik/a/e/v;

.field private final d:Lcom/kik/g/f;

.field private e:Lcom/kik/g/k;

.field private f:Lcom/kik/g/k;

.field private g:Lcom/kik/g/k;

.field private h:Lcom/kik/g/k;

.field private i:Lcom/kik/g/k;

.field private final j:Ljava/util/Map;

.field private final k:Ljava/util/Map;

.field private final l:Lcom/kik/g/i;

.field private final m:Lcom/kik/g/i;

.field private final n:Lcom/kik/g/i;


# direct methods
.method public constructor <init>(Ljava/util/Map;Lkik/a/e/r;Lkik/a/e/f;Lkik/a/e/v;Ljava/util/concurrent/ExecutorService;)V
    .locals 3

    .prologue
    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lkik/a/g/b;->d:Lcom/kik/g/f;

    .line 60
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lkik/a/g/b;->j:Ljava/util/Map;

    .line 63
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lkik/a/g/b;->k:Ljava/util/Map;

    .line 119
    new-instance v0, Lkik/a/g/c;

    invoke-direct {v0, p0}, Lkik/a/g/c;-><init>(Lkik/a/g/b;)V

    iput-object v0, p0, Lkik/a/g/b;->l:Lcom/kik/g/i;

    .line 140
    new-instance v0, Lkik/a/g/m;

    invoke-direct {v0, p0}, Lkik/a/g/m;-><init>(Lkik/a/g/b;)V

    iput-object v0, p0, Lkik/a/g/b;->m:Lcom/kik/g/i;

    .line 158
    new-instance v0, Lkik/a/g/o;

    invoke-direct {v0, p0}, Lkik/a/g/o;-><init>(Lkik/a/g/b;)V

    iput-object v0, p0, Lkik/a/g/b;->n:Lcom/kik/g/i;

    .line 67
    invoke-direct {p0, p1}, Lkik/a/g/b;->a(Ljava/util/Map;)V

    .line 68
    iput-object p3, p0, Lkik/a/g/b;->a:Lkik/a/e/f;

    .line 69
    iput-object p2, p0, Lkik/a/g/b;->b:Lkik/a/e/r;

    .line 70
    iput-object p4, p0, Lkik/a/g/b;->c:Lkik/a/e/v;

    .line 72
    iget-object v0, p0, Lkik/a/g/b;->d:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/a/g/b;->c:Lkik/a/e/v;

    invoke-interface {v1}, Lkik/a/e/v;->c()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/a/g/b;->l:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 73
    iget-object v0, p0, Lkik/a/g/b;->d:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/a/g/b;->b:Lkik/a/e/r;

    invoke-interface {v1}, Lkik/a/e/r;->f()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/a/g/b;->l:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 74
    iget-object v0, p0, Lkik/a/g/b;->d:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/a/g/b;->b:Lkik/a/e/r;

    invoke-interface {v1}, Lkik/a/e/r;->e()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/a/g/b;->m:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 76
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p5}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/g/b;->e:Lcom/kik/g/k;

    .line 77
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p5}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/g/b;->f:Lcom/kik/g/k;

    .line 78
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p5}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/g/b;->g:Lcom/kik/g/k;

    .line 79
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p5}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/g/b;->h:Lcom/kik/g/k;

    .line 80
    new-instance v0, Lcom/kik/g/a;

    invoke-direct {v0, p0, p5}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lkik/a/g/b;->i:Lcom/kik/g/k;

    .line 81
    return-void
.end method

.method private static a(Ljava/util/List;)Ljava/util/List;
    .locals 3

    .prologue
    .line 503
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 504
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/k;

    .line 505
    invoke-virtual {v0}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 507
    :cond_0
    return-object v1
.end method

.method static synthetic a(Lkik/a/g/b;)Lkik/a/e/v;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lkik/a/g/b;->c:Lkik/a/e/v;

    return-object v0
.end method

.method private a(Ljava/util/Map;)V
    .locals 4

    .prologue
    .line 181
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/k;

    .line 182
    instance-of v1, v0, Lkik/a/d/n;

    if-eqz v1, :cond_0

    .line 183
    check-cast v0, Lkik/a/d/n;

    .line 186
    invoke-virtual {v0}, Lkik/a/d/n;->w()Ljava/util/List;

    move-result-object v1

    .line 188
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 189
    invoke-direct {p0, v0, v1}, Lkik/a/g/b;->a(Lkik/a/d/n;Ljava/lang/String;)V

    goto :goto_0

    .line 193
    :cond_1
    return-void
.end method

.method private a(Lkik/a/d/n;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 257
    invoke-virtual {p1}, Lkik/a/d/n;->p()Z

    move-result v0

    if-nez v0, :cond_0

    .line 267
    :goto_0
    return-void

    .line 260
    :cond_0
    iget-object v0, p0, Lkik/a/g/b;->j:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 261
    iget-object v0, p0, Lkik/a/g/b;->j:Ljava/util/Map;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    :cond_1
    iget-object v0, p0, Lkik/a/g/b;->j:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    .line 265
    monitor-enter v0

    .line 266
    :try_start_0
    invoke-virtual {p1}, Lkik/a/d/n;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 267
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method static synthetic a(Lkik/a/g/b;Lkik/a/d/n;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0, p1, p2}, Lkik/a/g/b;->a(Lkik/a/d/n;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lkik/a/g/b;)Lkik/a/e/r;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lkik/a/g/b;->b:Lkik/a/e/r;

    return-object v0
.end method

.method static synthetic c(Lkik/a/g/b;)Lcom/kik/g/k;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lkik/a/g/b;->i:Lcom/kik/g/k;

    return-object v0
.end method

.method static synthetic d(Lkik/a/g/b;)Lcom/kik/g/k;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lkik/a/g/b;->h:Lcom/kik/g/k;

    return-object v0
.end method

.method static synthetic e(Lkik/a/g/b;)Lcom/kik/g/k;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lkik/a/g/b;->e:Lcom/kik/g/k;

    return-object v0
.end method

.method static synthetic f(Lkik/a/g/b;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lkik/a/g/b;->k:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic g(Lkik/a/g/b;)Lcom/kik/g/k;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lkik/a/g/b;->g:Lcom/kik/g/k;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/g/p;
    .locals 2

    .prologue
    .line 620
    iget-object v0, p0, Lkik/a/g/b;->a:Lkik/a/e/f;

    new-instance v1, Lkik/a/f/f/m;

    invoke-direct {v1, p1, p2}, Lkik/a/f/f/m;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/g/s;->b(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    .line 622
    new-instance v1, Lkik/a/g/j;

    invoke-direct {v1, p0}, Lkik/a/g/j;-><init>(Lkik/a/g/b;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 630
    new-instance v1, Lkik/a/g/k;

    invoke-direct {v1, p0, p1}, Lkik/a/g/k;-><init>(Lkik/a/g/b;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kik/g/p;
    .locals 2

    .prologue
    .line 556
    invoke-static {p1}, Lkik/a/h/i;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 557
    iget-object v0, p0, Lkik/a/g/b;->c:Lkik/a/e/v;

    invoke-static {v0}, Lkik/a/z;->b(Lkik/a/e/v;)Lkik/a/z;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/z;->a()Lkik/a/d/j;

    move-result-object v0

    .line 558
    new-instance v1, Lkik/a/f/f/p;

    invoke-virtual {v0}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, p1, p3, v0}, Lkik/a/f/f/p;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 559
    iget-object v0, p0, Lkik/a/g/b;->a:Lkik/a/e/f;

    invoke-interface {v0, v1}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/g/s;->b(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    .line 560
    new-instance v1, Lkik/a/g/f;

    invoke-direct {v1, p0, p3, p1}, Lkik/a/g/f;-><init>(Lkik/a/g/b;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 578
    new-instance v1, Lkik/a/g/g;

    invoke-direct {v1, p0, p3}, Lkik/a/g/g;-><init>(Lkik/a/g/b;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    .line 607
    :goto_0
    return-object v0

    .line 587
    :cond_0
    new-instance v0, Lkik/a/f/f/o;

    invoke-direct {v0, p2, p3}, Lkik/a/f/f/o;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 588
    iget-object v1, p0, Lkik/a/g/b;->a:Lkik/a/e/f;

    invoke-interface {v1, v0}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/g/s;->b(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    .line 589
    new-instance v1, Lkik/a/g/h;

    invoke-direct {v1, p0, p3, p1}, Lkik/a/g/h;-><init>(Lkik/a/g/b;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 607
    new-instance v1, Lkik/a/g/i;

    invoke-direct {v1, p0, p3}, Lkik/a/g/i;-><init>(Lkik/a/g/b;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/kik/g/p;
    .locals 2

    .prologue
    .line 317
    if-eqz p4, :cond_0

    .line 318
    invoke-static {p1, p2}, Lkik/a/f/f/r;->b(Ljava/lang/String;Ljava/lang/String;)Lkik/a/f/f/r;

    move-result-object v0

    .line 327
    :goto_0
    iget-object v1, p0, Lkik/a/g/b;->a:Lkik/a/e/f;

    invoke-interface {v1, v0}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/g/s;->b(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    .line 329
    new-instance v1, Lkik/a/g/r;

    invoke-direct {v1, p0}, Lkik/a/g/r;-><init>(Lkik/a/g/b;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 338
    return-object v0

    .line 320
    :cond_0
    if-eqz p3, :cond_1

    .line 321
    invoke-static {p1, p2}, Lkik/a/f/f/r;->a(Ljava/lang/String;Ljava/lang/String;)Lkik/a/f/f/r;

    move-result-object v0

    goto :goto_0

    .line 324
    :cond_1
    invoke-static {p1, p2}, Lkik/a/f/f/r;->c(Ljava/lang/String;Ljava/lang/String;)Lkik/a/f/f/r;

    move-result-object v0

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Lkik/a/d/k;Ljava/util/List;)Lcom/kik/g/p;
    .locals 5

    .prologue
    .line 437
    if-nez p2, :cond_0

    const/4 v0, 0x0

    move-object v1, v0

    .line 441
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-interface {p3}, Ljava/util/List;->hashCode()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 442
    iget-object v0, p0, Lkik/a/g/b;->k:Ljava/util/Map;

    invoke-interface {v0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 443
    iget-object v0, p0, Lkik/a/g/b;->k:Ljava/util/Map;

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 444
    new-instance v2, Lkik/a/f/f/n;

    invoke-static {p3}, Lkik/a/g/b;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    invoke-direct {v2, p1, v1, v4, v0}, Lkik/a/f/f/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    move-object v0, v2

    .line 450
    :goto_1
    invoke-virtual {v0}, Lkik/a/f/f/n;->d()Ljava/lang/String;

    move-result-object v1

    .line 451
    iget-object v2, p0, Lkik/a/g/b;->a:Lkik/a/e/f;

    invoke-interface {v2, v0}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/g/s;->b(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    .line 452
    new-instance v2, Lkik/a/g/t;

    invoke-direct {v2, p0, v3, v1}, Lkik/a/g/t;-><init>(Lkik/a/g/b;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 491
    new-instance v1, Lkik/a/g/u;

    invoke-direct {v1, p0, v0}, Lkik/a/g/u;-><init>(Lkik/a/g/b;Lcom/kik/g/p;)V

    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0

    .line 437
    :cond_0
    invoke-virtual {p2}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    goto :goto_0

    .line 447
    :cond_1
    new-instance v0, Lkik/a/f/f/n;

    invoke-static {p3}, Lkik/a/g/b;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, p1, v1, v2}, Lkik/a/f/f/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    goto :goto_1
.end method

.method public final a(Lkik/a/d/n;)Lcom/kik/g/p;
    .locals 2

    .prologue
    .line 656
    new-instance v0, Lkik/a/f/f/q;

    invoke-virtual {p1}, Lkik/a/d/n;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lkik/a/f/f/q;-><init>(Ljava/lang/String;)V

    .line 657
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lkik/a/d/n;->k(Z)V

    .line 658
    iget-object v1, p0, Lkik/a/g/b;->a:Lkik/a/e/f;

    invoke-interface {v1, v0}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/g/s;->b(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    .line 659
    new-instance v1, Lkik/a/g/l;

    invoke-direct {v1, p0}, Lkik/a/g/l;-><init>(Lkik/a/g/b;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 685
    new-instance v1, Lkik/a/g/n;

    invoke-direct {v1, p0, p1}, Lkik/a/g/n;-><init>(Lkik/a/g/b;Lkik/a/d/n;)V

    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lkik/a/d/n;Ljava/util/List;)Lcom/kik/g/p;
    .locals 3

    .prologue
    .line 513
    new-instance v0, Lkik/a/f/f/l;

    invoke-virtual {p1}, Lkik/a/d/n;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Lkik/a/g/b;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lkik/a/f/f/l;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 514
    iget-object v1, p0, Lkik/a/g/b;->a:Lkik/a/e/f;

    invoke-interface {v1, v0}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/g/s;->b(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    .line 515
    new-instance v1, Lkik/a/g/d;

    invoke-direct {v1, p0}, Lkik/a/g/d;-><init>(Lkik/a/g/b;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 544
    new-instance v1, Lkik/a/g/e;

    invoke-direct {v1, p0}, Lkik/a/g/e;-><init>(Lkik/a/g/b;)V

    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public final a()Ljava/util/List;
    .locals 4

    .prologue
    .line 370
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 371
    iget-object v0, p0, Lkik/a/g/b;->b:Lkik/a/e/r;

    invoke-interface {v0}, Lkik/a/e/r;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/k;

    .line 372
    instance-of v3, v0, Lkik/a/d/n;

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Lkik/a/d/k;->l()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 373
    check-cast v0, Lkik/a/d/n;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 376
    :cond_1
    return-object v1
.end method

.method public final a(Lkik/a/d/k;)Ljava/util/Set;
    .locals 2

    .prologue
    .line 363
    iget-object v0, p0, Lkik/a/g/b;->j:Ljava/util/Map;

    invoke-virtual {p1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    .line 364
    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    :goto_0
    return-object v0

    :cond_0
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    move-object v0, v1

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Z)Lkik/a/d/n;
    .locals 2

    .prologue
    .line 382
    if-nez p1, :cond_0

    .line 383
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get group for null identifier"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 385
    :cond_0
    iget-object v0, p0, Lkik/a/g/b;->b:Lkik/a/e/r;

    invoke-interface {v0, p1, p2}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    .line 388
    instance-of v1, v0, Lkik/a/d/n;

    if-nez v1, :cond_1

    .line 389
    const/4 v0, 0x0

    .line 392
    :cond_1
    check-cast v0, Lkik/a/d/n;

    .line 393
    if-nez v0, :cond_2

    if-eqz p2, :cond_2

    .line 394
    invoke-static {p1}, Lkik/a/d/n;->h(Ljava/lang/String;)Lkik/a/d/n;

    move-result-object v0

    .line 395
    iget-object v1, p0, Lkik/a/g/b;->b:Lkik/a/e/r;

    invoke-interface {v1, v0}, Lkik/a/e/r;->a(Lkik/a/d/k;)V

    .line 396
    iget-object v1, p0, Lkik/a/g/b;->b:Lkik/a/e/r;

    invoke-interface {v1}, Lkik/a/e/r;->j()V

    .line 399
    :cond_2
    return-object v0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 405
    iget-object v0, p0, Lkik/a/g/b;->a:Lkik/a/e/f;

    new-instance v1, Lkik/a/f/f/k;

    invoke-direct {v1, p1}, Lkik/a/f/f/k;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/g/s;->b(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    .line 406
    new-instance v1, Lkik/a/g/s;

    invoke-direct {v1, p0}, Lkik/a/g/s;-><init>(Lkik/a/g/b;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 424
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Lcom/kik/g/r;)V
    .locals 3

    .prologue
    .line 273
    iget-object v0, p0, Lkik/a/g/b;->a:Lkik/a/e/f;

    new-instance v1, Lkik/a/f/f/ag;

    invoke-direct {v1, p1, p2}, Lkik/a/f/f/ag;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lkik/a/e/f;->a(Lkik/a/f/f/z;Z)Lcom/kik/g/p;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/g/s;->b(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/a/g/p;

    invoke-direct {v1, p0, p3}, Lkik/a/g/p;-><init>(Lkik/a/g/b;Lcom/kik/g/r;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 298
    return-void
.end method

.method protected final a(Ljava/lang/String;Lkik/a/d/n;)V
    .locals 2

    .prologue
    .line 343
    iget-object v0, p0, Lkik/a/g/b;->j:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    .line 344
    if-eqz v0, :cond_1

    .line 345
    monitor-enter v0

    .line 346
    :try_start_0
    invoke-virtual {p2}, Lkik/a/d/n;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 347
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 348
    iget-object v1, p0, Lkik/a/g/b;->j:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    :cond_0
    monitor-exit v0

    .line 352
    :cond_1
    return-void

    .line 350
    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final a(Lkik/a/e/i;)V
    .locals 3

    .prologue
    .line 86
    iget-object v0, p0, Lkik/a/g/b;->d:Lcom/kik/g/f;

    invoke-interface {p1}, Lkik/a/e/i;->o()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/a/g/b;->n:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 87
    return-void
.end method

.method public final b()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 110
    iget-object v0, p0, Lkik/a/g/b;->e:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/String;)Lcom/kik/g/p;
    .locals 2

    .prologue
    .line 303
    iget-object v0, p0, Lkik/a/g/b;->a:Lkik/a/e/f;

    new-instance v1, Lkik/a/f/f/h;

    invoke-direct {v1, p1}, Lkik/a/f/f/h;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/g/s;->b(Lcom/kik/g/p;)Lcom/kik/g/p;

    move-result-object v0

    .line 304
    new-instance v1, Lkik/a/g/q;

    invoke-direct {v1, p0}, Lkik/a/g/q;-><init>(Lkik/a/g/b;)V

    invoke-static {v0, v1}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lkik/a/d/n;)V
    .locals 0

    .prologue
    .line 198
    invoke-virtual {p0, p1}, Lkik/a/g/b;->c(Lkik/a/d/n;)V

    .line 199
    return-void
.end method

.method public final c()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lkik/a/g/b;->g:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final c(Ljava/lang/String;)Ljava/util/Set;
    .locals 2

    .prologue
    .line 357
    iget-object v0, p0, Lkik/a/g/b;->b:Lkik/a/e/r;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/a/g/b;->a(Lkik/a/d/k;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method protected final c(Lkik/a/d/n;)V
    .locals 6

    .prologue
    .line 212
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 213
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 218
    invoke-virtual {p1}, Lkik/a/d/n;->w()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 220
    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 221
    new-instance v3, Ljava/util/LinkedList;

    invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V

    .line 223
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    if-eq v4, v5, :cond_2

    .line 226
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 227
    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 228
    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 231
    :cond_0
    invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 235
    :cond_1
    invoke-interface {v2, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 239
    :cond_2
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 240
    invoke-direct {p0, p1, v0}, Lkik/a/g/b;->a(Lkik/a/d/n;Ljava/lang/String;)V

    goto :goto_1

    .line 243
    :cond_3
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 244
    invoke-virtual {p0, v0, p1}, Lkik/a/g/b;->a(Ljava/lang/String;Lkik/a/d/n;)V

    goto :goto_2

    .line 250
    :cond_4
    iget-object v0, p0, Lkik/a/g/b;->c:Lkik/a/e/v;

    invoke-interface {v0, p1}, Lkik/a/e/v;->d(Lkik/a/d/k;)V

    .line 253
    return-void
.end method

.method public final d()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Lkik/a/g/b;->h:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lkik/a/g/b;->i:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final f()V
    .locals 1

    .prologue
    .line 697
    iget-object v0, p0, Lkik/a/g/b;->d:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 698
    iget-object v0, p0, Lkik/a/g/b;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 699
    return-void
.end method
