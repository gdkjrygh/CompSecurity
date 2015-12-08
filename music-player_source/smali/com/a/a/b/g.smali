.class public final Lcom/a/a/b/g;
.super Ljava/lang/Object;


# instance fields
.field final a:Landroid/content/res/Resources;

.field final b:I

.field final c:I

.field final d:I

.field final e:I

.field final f:Landroid/graphics/Bitmap$CompressFormat;

.field final g:I

.field final h:Lcom/a/a/b/g/a;

.field final i:Ljava/util/concurrent/Executor;

.field final j:Ljava/util/concurrent/Executor;

.field final k:Z

.field final l:Z

.field final m:I

.field final n:I

.field final o:Lcom/a/a/b/a/h;

.field final p:Lcom/a/a/a/b/a;

.field final q:Lcom/a/a/a/a/b;

.field final r:Lcom/a/a/b/d/c;

.field final s:Lcom/a/a/b/b/d;

.field final t:Lcom/a/a/b/d;

.field final u:Z

.field final v:Lcom/a/a/a/a/b;

.field final w:Lcom/a/a/b/d/c;

.field final x:Lcom/a/a/b/d/c;


# direct methods
.method private constructor <init>(Lcom/a/a/b/h;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/a/a/b/h;->a(Lcom/a/a/b/h;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/b/g;->a:Landroid/content/res/Resources;

    invoke-static {p1}, Lcom/a/a/b/h;->b(Lcom/a/a/b/h;)I

    move-result v0

    iput v0, p0, Lcom/a/a/b/g;->b:I

    invoke-static {p1}, Lcom/a/a/b/h;->c(Lcom/a/a/b/h;)I

    move-result v0

    iput v0, p0, Lcom/a/a/b/g;->c:I

    invoke-static {p1}, Lcom/a/a/b/h;->d(Lcom/a/a/b/h;)I

    move-result v0

    iput v0, p0, Lcom/a/a/b/g;->d:I

    invoke-static {p1}, Lcom/a/a/b/h;->e(Lcom/a/a/b/h;)I

    move-result v0

    iput v0, p0, Lcom/a/a/b/g;->e:I

    invoke-static {p1}, Lcom/a/a/b/h;->f(Lcom/a/a/b/h;)Landroid/graphics/Bitmap$CompressFormat;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/b/g;->f:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {p1}, Lcom/a/a/b/h;->g(Lcom/a/a/b/h;)I

    move-result v0

    iput v0, p0, Lcom/a/a/b/g;->g:I

    invoke-static {p1}, Lcom/a/a/b/h;->h(Lcom/a/a/b/h;)Lcom/a/a/b/g/a;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/b/g;->h:Lcom/a/a/b/g/a;

    invoke-static {p1}, Lcom/a/a/b/h;->i(Lcom/a/a/b/h;)Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/b/g;->i:Ljava/util/concurrent/Executor;

    invoke-static {p1}, Lcom/a/a/b/h;->j(Lcom/a/a/b/h;)Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/b/g;->j:Ljava/util/concurrent/Executor;

    invoke-static {p1}, Lcom/a/a/b/h;->k(Lcom/a/a/b/h;)I

    move-result v0

    iput v0, p0, Lcom/a/a/b/g;->m:I

    invoke-static {p1}, Lcom/a/a/b/h;->l(Lcom/a/a/b/h;)I

    move-result v0

    iput v0, p0, Lcom/a/a/b/g;->n:I

    invoke-static {p1}, Lcom/a/a/b/h;->m(Lcom/a/a/b/h;)Lcom/a/a/b/a/h;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/b/g;->o:Lcom/a/a/b/a/h;

    invoke-static {p1}, Lcom/a/a/b/h;->n(Lcom/a/a/b/h;)Lcom/a/a/a/a/b;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/b/g;->q:Lcom/a/a/a/a/b;

    invoke-static {p1}, Lcom/a/a/b/h;->o(Lcom/a/a/b/h;)Lcom/a/a/a/b/a;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/b/g;->p:Lcom/a/a/a/b/a;

    invoke-static {p1}, Lcom/a/a/b/h;->p(Lcom/a/a/b/h;)Lcom/a/a/b/d;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/b/g;->t:Lcom/a/a/b/d;

    invoke-static {p1}, Lcom/a/a/b/h;->q(Lcom/a/a/b/h;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/a/a/b/g;->u:Z

    invoke-static {p1}, Lcom/a/a/b/h;->r(Lcom/a/a/b/h;)Lcom/a/a/b/d/c;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/b/g;->r:Lcom/a/a/b/d/c;

    invoke-static {p1}, Lcom/a/a/b/h;->s(Lcom/a/a/b/h;)Lcom/a/a/b/b/d;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/b/g;->s:Lcom/a/a/b/b/d;

    invoke-static {p1}, Lcom/a/a/b/h;->t(Lcom/a/a/b/h;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/a/a/b/g;->k:Z

    invoke-static {p1}, Lcom/a/a/b/h;->u(Lcom/a/a/b/h;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/a/a/b/g;->l:Z

    new-instance v0, Lcom/a/a/b/d/e;

    iget-object v1, p0, Lcom/a/a/b/g;->r:Lcom/a/a/b/d/c;

    invoke-direct {v0, v1}, Lcom/a/a/b/d/e;-><init>(Lcom/a/a/b/d/c;)V

    iput-object v0, p0, Lcom/a/a/b/g;->w:Lcom/a/a/b/d/c;

    new-instance v0, Lcom/a/a/b/d/g;

    iget-object v1, p0, Lcom/a/a/b/g;->r:Lcom/a/a/b/d/c;

    invoke-direct {v0, v1}, Lcom/a/a/b/d/g;-><init>(Lcom/a/a/b/d/c;)V

    iput-object v0, p0, Lcom/a/a/b/g;->x:Lcom/a/a/b/d/c;

    invoke-static {p1}, Lcom/a/a/b/h;->a(Lcom/a/a/b/h;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/a/a/c/h;->a(Landroid/content/Context;Z)Ljava/io/File;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    const-string v2, "uil-images"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->mkdir()Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    move-object v0, v1

    :cond_1
    new-instance v1, Lcom/a/a/a/a/a/b;

    invoke-direct {v1, v0}, Lcom/a/a/a/a/a/b;-><init>(Ljava/io/File;)V

    iput-object v1, p0, Lcom/a/a/b/g;->v:Lcom/a/a/a/a/b;

    return-void
.end method

.method synthetic constructor <init>(Lcom/a/a/b/h;B)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/a/a/b/g;-><init>(Lcom/a/a/b/h;)V

    return-void
.end method
