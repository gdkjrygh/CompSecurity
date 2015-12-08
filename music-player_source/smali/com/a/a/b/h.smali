.class public final Lcom/a/a/b/h;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/a/a/b/a/h;


# instance fields
.field private A:Z

.field private b:Landroid/content/Context;

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:Landroid/graphics/Bitmap$CompressFormat;

.field private h:I

.field private i:Lcom/a/a/b/g/a;

.field private j:Ljava/util/concurrent/Executor;

.field private k:Ljava/util/concurrent/Executor;

.field private l:Z

.field private m:Z

.field private n:I

.field private o:I

.field private p:Z

.field private q:Lcom/a/a/b/a/h;

.field private r:I

.field private s:I

.field private t:I

.field private u:Lcom/a/a/a/b/a;

.field private v:Lcom/a/a/a/a/b;

.field private w:Lcom/a/a/a/a/b/a;

.field private x:Lcom/a/a/b/d/c;

.field private y:Lcom/a/a/b/b/d;

.field private z:Lcom/a/a/b/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/a/a/b/a/h;->a:Lcom/a/a/b/a/h;

    sput-object v0, Lcom/a/a/b/h;->a:Lcom/a/a/b/a/h;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const/4 v2, 0x0

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v1, p0, Lcom/a/a/b/h;->c:I

    iput v1, p0, Lcom/a/a/b/h;->d:I

    iput v1, p0, Lcom/a/a/b/h;->e:I

    iput v1, p0, Lcom/a/a/b/h;->f:I

    iput-object v2, p0, Lcom/a/a/b/h;->g:Landroid/graphics/Bitmap$CompressFormat;

    iput v1, p0, Lcom/a/a/b/h;->h:I

    iput-object v2, p0, Lcom/a/a/b/h;->i:Lcom/a/a/b/g/a;

    iput-object v2, p0, Lcom/a/a/b/h;->j:Ljava/util/concurrent/Executor;

    iput-object v2, p0, Lcom/a/a/b/h;->k:Ljava/util/concurrent/Executor;

    iput-boolean v1, p0, Lcom/a/a/b/h;->l:Z

    iput-boolean v1, p0, Lcom/a/a/b/h;->m:Z

    const/4 v0, 0x3

    iput v0, p0, Lcom/a/a/b/h;->n:I

    const/4 v0, 0x4

    iput v0, p0, Lcom/a/a/b/h;->o:I

    iput-boolean v1, p0, Lcom/a/a/b/h;->p:Z

    sget-object v0, Lcom/a/a/b/h;->a:Lcom/a/a/b/a/h;

    iput-object v0, p0, Lcom/a/a/b/h;->q:Lcom/a/a/b/a/h;

    iput v1, p0, Lcom/a/a/b/h;->r:I

    iput v1, p0, Lcom/a/a/b/h;->s:I

    iput v1, p0, Lcom/a/a/b/h;->t:I

    iput-object v2, p0, Lcom/a/a/b/h;->u:Lcom/a/a/a/b/a;

    iput-object v2, p0, Lcom/a/a/b/h;->v:Lcom/a/a/a/a/b;

    iput-object v2, p0, Lcom/a/a/b/h;->w:Lcom/a/a/a/a/b/a;

    iput-object v2, p0, Lcom/a/a/b/h;->x:Lcom/a/a/b/d/c;

    iput-object v2, p0, Lcom/a/a/b/h;->z:Lcom/a/a/b/d;

    iput-boolean v1, p0, Lcom/a/a/b/h;->A:Z

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/b/h;->b:Landroid/content/Context;

    return-void
.end method

.method static synthetic a(Lcom/a/a/b/h;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/h;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Lcom/a/a/b/h;)I
    .locals 1

    iget v0, p0, Lcom/a/a/b/h;->c:I

    return v0
.end method

.method static synthetic c(Lcom/a/a/b/h;)I
    .locals 1

    iget v0, p0, Lcom/a/a/b/h;->d:I

    return v0
.end method

.method static synthetic d(Lcom/a/a/b/h;)I
    .locals 1

    iget v0, p0, Lcom/a/a/b/h;->e:I

    return v0
.end method

.method static synthetic e(Lcom/a/a/b/h;)I
    .locals 1

    iget v0, p0, Lcom/a/a/b/h;->f:I

    return v0
.end method

.method static synthetic f(Lcom/a/a/b/h;)Landroid/graphics/Bitmap$CompressFormat;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/h;->g:Landroid/graphics/Bitmap$CompressFormat;

    return-object v0
.end method

.method static synthetic g(Lcom/a/a/b/h;)I
    .locals 1

    iget v0, p0, Lcom/a/a/b/h;->h:I

    return v0
.end method

.method static synthetic h(Lcom/a/a/b/h;)Lcom/a/a/b/g/a;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/h;->i:Lcom/a/a/b/g/a;

    return-object v0
.end method

.method static synthetic i(Lcom/a/a/b/h;)Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/h;->j:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method static synthetic j(Lcom/a/a/b/h;)Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/h;->k:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method static synthetic k(Lcom/a/a/b/h;)I
    .locals 1

    iget v0, p0, Lcom/a/a/b/h;->n:I

    return v0
.end method

.method static synthetic l(Lcom/a/a/b/h;)I
    .locals 1

    iget v0, p0, Lcom/a/a/b/h;->o:I

    return v0
.end method

.method static synthetic m(Lcom/a/a/b/h;)Lcom/a/a/b/a/h;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/h;->q:Lcom/a/a/b/a/h;

    return-object v0
.end method

.method static synthetic n(Lcom/a/a/b/h;)Lcom/a/a/a/a/b;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/h;->v:Lcom/a/a/a/a/b;

    return-object v0
.end method

.method static synthetic o(Lcom/a/a/b/h;)Lcom/a/a/a/b/a;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/h;->u:Lcom/a/a/a/b/a;

    return-object v0
.end method

.method static synthetic p(Lcom/a/a/b/h;)Lcom/a/a/b/d;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/h;->z:Lcom/a/a/b/d;

    return-object v0
.end method

.method static synthetic q(Lcom/a/a/b/h;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/a/a/b/h;->A:Z

    return v0
.end method

.method static synthetic r(Lcom/a/a/b/h;)Lcom/a/a/b/d/c;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/h;->x:Lcom/a/a/b/d/c;

    return-object v0
.end method

.method static synthetic s(Lcom/a/a/b/h;)Lcom/a/a/b/b/d;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/h;->y:Lcom/a/a/b/b/d;

    return-object v0
.end method

.method static synthetic t(Lcom/a/a/b/h;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/a/a/b/h;->l:Z

    return v0
.end method

.method static synthetic u(Lcom/a/a/b/h;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/a/a/b/h;->m:Z

    return v0
.end method


# virtual methods
.method public final a()Lcom/a/a/b/h;
    .locals 1

    const/16 v0, 0x1e0

    iput v0, p0, Lcom/a/a/b/h;->c:I

    const/16 v0, 0x320

    iput v0, p0, Lcom/a/a/b/h;->d:I

    return-object p0
.end method

.method public final a(Landroid/graphics/Bitmap$CompressFormat;)Lcom/a/a/b/h;
    .locals 1

    const/16 v0, 0x1e0

    iput v0, p0, Lcom/a/a/b/h;->e:I

    const/16 v0, 0x320

    iput v0, p0, Lcom/a/a/b/h;->f:I

    iput-object p1, p0, Lcom/a/a/b/h;->g:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v0, 0x4b

    iput v0, p0, Lcom/a/a/b/h;->h:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/a/a/b/h;->i:Lcom/a/a/b/g/a;

    return-object p0
.end method

.method public final a(Lcom/a/a/a/a/b/a;)Lcom/a/a/b/h;
    .locals 2

    iget-object v0, p0, Lcom/a/a/b/h;->v:Lcom/a/a/a/a/b;

    if-eqz v0, :cond_0

    const-string v0, "discCache() and discCacheFileNameGenerator() calls overlap each other"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/a/a/c/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iput-object p1, p0, Lcom/a/a/b/h;->w:Lcom/a/a/a/a/b/a;

    return-object p0
.end method

.method public final a(Lcom/a/a/a/b/a;)Lcom/a/a/b/h;
    .locals 2

    iget v0, p0, Lcom/a/a/b/h;->r:I

    if-eqz v0, :cond_0

    const-string v0, "memoryCache() and memoryCacheSize() calls overlap each other"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/a/a/c/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iput-object p1, p0, Lcom/a/a/b/h;->u:Lcom/a/a/a/b/a;

    return-object p0
.end method

.method public final a(Lcom/a/a/b/a/h;)Lcom/a/a/b/h;
    .locals 2

    iget-object v0, p0, Lcom/a/a/b/h;->j:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/a/a/b/h;->k:Ljava/util/concurrent/Executor;

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, "threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/a/a/c/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    iput-object p1, p0, Lcom/a/a/b/h;->q:Lcom/a/a/b/a/h;

    return-object p0
.end method

.method public final a(Lcom/a/a/b/d/c;)Lcom/a/a/b/h;
    .locals 0

    iput-object p1, p0, Lcom/a/a/b/h;->x:Lcom/a/a/b/d/c;

    return-object p0
.end method

.method public final b()Lcom/a/a/b/h;
    .locals 2

    iget-object v0, p0, Lcom/a/a/b/h;->j:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/a/a/b/h;->k:Ljava/util/concurrent/Executor;

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, "threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/a/a/c/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x2

    iput v0, p0, Lcom/a/a/b/h;->n:I

    return-object p0
.end method

.method public final c()Lcom/a/a/b/h;
    .locals 2

    iget-object v0, p0, Lcom/a/a/b/h;->j:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/a/a/b/h;->k:Ljava/util/concurrent/Executor;

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, "threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/a/a/c/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x5

    iput v0, p0, Lcom/a/a/b/h;->o:I

    return-object p0
.end method

.method public final d()Lcom/a/a/b/h;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/a/a/b/h;->p:Z

    return-object p0
.end method

.method public final e()Lcom/a/a/b/h;
    .locals 2

    iget-object v0, p0, Lcom/a/a/b/h;->v:Lcom/a/a/a/a/b;

    if-nez v0, :cond_0

    iget v0, p0, Lcom/a/a/b/h;->t:I

    if-lez v0, :cond_1

    :cond_0
    const-string v0, "discCache(), discCacheSize() and discCacheFileCount calls overlap each other"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/a/a/c/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    const/high16 v0, 0x3200000

    iput v0, p0, Lcom/a/a/b/h;->s:I

    return-object p0
.end method

.method public final f()Lcom/a/a/b/g;
    .locals 5

    const/4 v4, 0x1

    iget-object v0, p0, Lcom/a/a/b/h;->j:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_8

    iget v0, p0, Lcom/a/a/b/h;->n:I

    iget v1, p0, Lcom/a/a/b/h;->o:I

    iget-object v2, p0, Lcom/a/a/b/h;->q:Lcom/a/a/b/a/h;

    invoke-static {v0, v1, v2}, Lcom/a/a/b/a;->a(IILcom/a/a/b/a/h;)Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/b/h;->j:Ljava/util/concurrent/Executor;

    :goto_0
    iget-object v0, p0, Lcom/a/a/b/h;->k:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_9

    iget v0, p0, Lcom/a/a/b/h;->n:I

    iget v1, p0, Lcom/a/a/b/h;->o:I

    iget-object v2, p0, Lcom/a/a/b/h;->q:Lcom/a/a/b/a/h;

    invoke-static {v0, v1, v2}, Lcom/a/a/b/a;->a(IILcom/a/a/b/a/h;)Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/b/h;->k:Ljava/util/concurrent/Executor;

    :goto_1
    iget-object v0, p0, Lcom/a/a/b/h;->v:Lcom/a/a/a/a/b;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/a/a/b/h;->w:Lcom/a/a/a/a/b/a;

    if-nez v0, :cond_0

    new-instance v0, Lcom/a/a/a/a/b/b;

    invoke-direct {v0}, Lcom/a/a/a/a/b/b;-><init>()V

    iput-object v0, p0, Lcom/a/a/b/h;->w:Lcom/a/a/a/a/b/a;

    :cond_0
    iget-object v0, p0, Lcom/a/a/b/h;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/a/a/b/h;->w:Lcom/a/a/a/a/b/a;

    iget v2, p0, Lcom/a/a/b/h;->s:I

    iget v3, p0, Lcom/a/a/b/h;->t:I

    if-lez v2, :cond_a

    invoke-static {v0}, Lcom/a/a/c/h;->a(Landroid/content/Context;)Ljava/io/File;

    move-result-object v3

    new-instance v0, Lcom/a/a/a/a/a/b;

    invoke-direct {v0, v3, v1, v2}, Lcom/a/a/a/a/a/b;-><init>(Ljava/io/File;Lcom/a/a/a/a/b/a;I)V

    :goto_2
    iput-object v0, p0, Lcom/a/a/b/h;->v:Lcom/a/a/a/a/b;

    :cond_1
    iget-object v0, p0, Lcom/a/a/b/h;->u:Lcom/a/a/a/b/a;

    if-nez v0, :cond_3

    iget v0, p0, Lcom/a/a/b/h;->r:I

    if-nez v0, :cond_2

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v0

    const-wide/16 v2, 0x8

    div-long/2addr v0, v2

    long-to-int v0, v0

    :cond_2
    new-instance v1, Lcom/a/a/a/b/a/b;

    invoke-direct {v1, v0}, Lcom/a/a/a/b/a/b;-><init>(I)V

    iput-object v1, p0, Lcom/a/a/b/h;->u:Lcom/a/a/a/b/a;

    :cond_3
    iget-boolean v0, p0, Lcom/a/a/b/h;->p:Z

    if-eqz v0, :cond_4

    new-instance v0, Lcom/a/a/a/b/a/a;

    iget-object v1, p0, Lcom/a/a/b/h;->u:Lcom/a/a/a/b/a;

    invoke-static {}, Lcom/a/a/c/f;->a()Ljava/util/Comparator;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/a/a/a/b/a/a;-><init>(Lcom/a/a/a/b/a;Ljava/util/Comparator;)V

    iput-object v0, p0, Lcom/a/a/b/h;->u:Lcom/a/a/a/b/a;

    :cond_4
    iget-object v0, p0, Lcom/a/a/b/h;->x:Lcom/a/a/b/d/c;

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/a/a/b/h;->b:Landroid/content/Context;

    new-instance v1, Lcom/a/a/b/d/a;

    invoke-direct {v1, v0}, Lcom/a/a/b/d/a;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/a/a/b/h;->x:Lcom/a/a/b/d/c;

    :cond_5
    iget-object v0, p0, Lcom/a/a/b/h;->y:Lcom/a/a/b/b/d;

    if-nez v0, :cond_6

    iget-boolean v0, p0, Lcom/a/a/b/h;->A:Z

    new-instance v1, Lcom/a/a/b/b/a;

    invoke-direct {v1, v0}, Lcom/a/a/b/b/a;-><init>(Z)V

    iput-object v1, p0, Lcom/a/a/b/h;->y:Lcom/a/a/b/b/d;

    :cond_6
    iget-object v0, p0, Lcom/a/a/b/h;->z:Lcom/a/a/b/d;

    if-nez v0, :cond_7

    new-instance v0, Lcom/a/a/b/e;

    invoke-direct {v0}, Lcom/a/a/b/e;-><init>()V

    invoke-virtual {v0}, Lcom/a/a/b/e;->d()Lcom/a/a/b/d;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/b/h;->z:Lcom/a/a/b/d;

    :cond_7
    new-instance v0, Lcom/a/a/b/g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/a/a/b/g;-><init>(Lcom/a/a/b/h;B)V

    return-object v0

    :cond_8
    iput-boolean v4, p0, Lcom/a/a/b/h;->l:Z

    goto/16 :goto_0

    :cond_9
    iput-boolean v4, p0, Lcom/a/a/b/h;->m:Z

    goto/16 :goto_1

    :cond_a
    if-lez v3, :cond_b

    invoke-static {v0}, Lcom/a/a/c/h;->a(Landroid/content/Context;)Ljava/io/File;

    move-result-object v2

    new-instance v0, Lcom/a/a/a/a/a/a;

    invoke-direct {v0, v2, v1, v3}, Lcom/a/a/a/a/a/a;-><init>(Ljava/io/File;Lcom/a/a/a/a/b/a;I)V

    goto :goto_2

    :cond_b
    invoke-static {v0, v4}, Lcom/a/a/c/h;->a(Landroid/content/Context;Z)Ljava/io/File;

    move-result-object v2

    new-instance v0, Lcom/a/a/a/a/a/c;

    invoke-direct {v0, v2, v1}, Lcom/a/a/a/a/a/c;-><init>(Ljava/io/File;Lcom/a/a/a/a/b/a;)V

    goto :goto_2
.end method
