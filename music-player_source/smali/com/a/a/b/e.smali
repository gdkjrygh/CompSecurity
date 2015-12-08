.class public final Lcom/a/a/b/e;
.super Ljava/lang/Object;


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:Landroid/graphics/drawable/Drawable;

.field private e:Landroid/graphics/drawable/Drawable;

.field private f:Landroid/graphics/drawable/Drawable;

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:Lcom/a/a/b/a/e;

.field private k:Landroid/graphics/BitmapFactory$Options;

.field private l:I

.field private m:Z

.field private n:Ljava/lang/Object;

.field private o:Lcom/a/a/b/g/a;

.field private p:Lcom/a/a/b/g/a;

.field private q:Lcom/a/a/b/c/a;

.field private r:Landroid/os/Handler;

.field private s:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v1, p0, Lcom/a/a/b/e;->a:I

    iput v1, p0, Lcom/a/a/b/e;->b:I

    iput v1, p0, Lcom/a/a/b/e;->c:I

    iput-object v2, p0, Lcom/a/a/b/e;->d:Landroid/graphics/drawable/Drawable;

    iput-object v2, p0, Lcom/a/a/b/e;->e:Landroid/graphics/drawable/Drawable;

    iput-object v2, p0, Lcom/a/a/b/e;->f:Landroid/graphics/drawable/Drawable;

    iput-boolean v1, p0, Lcom/a/a/b/e;->g:Z

    iput-boolean v1, p0, Lcom/a/a/b/e;->h:Z

    iput-boolean v1, p0, Lcom/a/a/b/e;->i:Z

    sget-object v0, Lcom/a/a/b/a/e;->b:Lcom/a/a/b/a/e;

    iput-object v0, p0, Lcom/a/a/b/e;->j:Lcom/a/a/b/a/e;

    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    iput-object v0, p0, Lcom/a/a/b/e;->k:Landroid/graphics/BitmapFactory$Options;

    iput v1, p0, Lcom/a/a/b/e;->l:I

    iput-boolean v1, p0, Lcom/a/a/b/e;->m:Z

    iput-object v2, p0, Lcom/a/a/b/e;->n:Ljava/lang/Object;

    iput-object v2, p0, Lcom/a/a/b/e;->o:Lcom/a/a/b/g/a;

    iput-object v2, p0, Lcom/a/a/b/e;->p:Lcom/a/a/b/g/a;

    new-instance v0, Lcom/a/a/b/c/b;

    invoke-direct {v0}, Lcom/a/a/b/c/b;-><init>()V

    iput-object v0, p0, Lcom/a/a/b/e;->q:Lcom/a/a/b/c/a;

    iput-object v2, p0, Lcom/a/a/b/e;->r:Landroid/os/Handler;

    iput-boolean v1, p0, Lcom/a/a/b/e;->s:Z

    iget-object v0, p0, Lcom/a/a/b/e;->k:Landroid/graphics/BitmapFactory$Options;

    iput-boolean v3, v0, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z

    iget-object v0, p0, Lcom/a/a/b/e;->k:Landroid/graphics/BitmapFactory$Options;

    iput-boolean v3, v0, Landroid/graphics/BitmapFactory$Options;->inInputShareable:Z

    return-void
.end method

.method static synthetic a(Lcom/a/a/b/e;)I
    .locals 1

    iget v0, p0, Lcom/a/a/b/e;->a:I

    return v0
.end method

.method static synthetic b(Lcom/a/a/b/e;)I
    .locals 1

    iget v0, p0, Lcom/a/a/b/e;->b:I

    return v0
.end method

.method static synthetic c(Lcom/a/a/b/e;)I
    .locals 1

    iget v0, p0, Lcom/a/a/b/e;->c:I

    return v0
.end method

.method static synthetic d(Lcom/a/a/b/e;)Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/e;->d:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method static synthetic e(Lcom/a/a/b/e;)Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/e;->e:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method static synthetic f(Lcom/a/a/b/e;)Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/e;->f:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method static synthetic g(Lcom/a/a/b/e;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/a/a/b/e;->g:Z

    return v0
.end method

.method static synthetic h(Lcom/a/a/b/e;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/a/a/b/e;->h:Z

    return v0
.end method

.method static synthetic i(Lcom/a/a/b/e;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/a/a/b/e;->i:Z

    return v0
.end method

.method static synthetic j(Lcom/a/a/b/e;)Lcom/a/a/b/a/e;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/e;->j:Lcom/a/a/b/a/e;

    return-object v0
.end method

.method static synthetic k(Lcom/a/a/b/e;)Landroid/graphics/BitmapFactory$Options;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/e;->k:Landroid/graphics/BitmapFactory$Options;

    return-object v0
.end method

.method static synthetic l(Lcom/a/a/b/e;)I
    .locals 1

    iget v0, p0, Lcom/a/a/b/e;->l:I

    return v0
.end method

.method static synthetic m(Lcom/a/a/b/e;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/a/a/b/e;->m:Z

    return v0
.end method

.method static synthetic n(Lcom/a/a/b/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/e;->n:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic o(Lcom/a/a/b/e;)Lcom/a/a/b/g/a;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/e;->o:Lcom/a/a/b/g/a;

    return-object v0
.end method

.method static synthetic p(Lcom/a/a/b/e;)Lcom/a/a/b/g/a;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/e;->p:Lcom/a/a/b/g/a;

    return-object v0
.end method

.method static synthetic q(Lcom/a/a/b/e;)Lcom/a/a/b/c/a;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/e;->q:Lcom/a/a/b/c/a;

    return-object v0
.end method

.method static synthetic r(Lcom/a/a/b/e;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/a/a/b/e;->r:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic s(Lcom/a/a/b/e;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/a/a/b/e;->s:Z

    return v0
.end method


# virtual methods
.method public final a()Lcom/a/a/b/e;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/a/a/b/e;->h:Z

    return-object p0
.end method

.method public final a(I)Lcom/a/a/b/e;
    .locals 0

    iput p1, p0, Lcom/a/a/b/e;->a:I

    return-object p0
.end method

.method public final a(Landroid/graphics/Bitmap$Config;)Lcom/a/a/b/e;
    .locals 2

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "bitmapConfig can\'t be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/a/a/b/e;->k:Landroid/graphics/BitmapFactory$Options;

    iput-object p1, v0, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    return-object p0
.end method

.method public final a(Lcom/a/a/b/a/e;)Lcom/a/a/b/e;
    .locals 0

    iput-object p1, p0, Lcom/a/a/b/e;->j:Lcom/a/a/b/a/e;

    return-object p0
.end method

.method public final a(Lcom/a/a/b/d;)Lcom/a/a/b/e;
    .locals 1

    invoke-static {p1}, Lcom/a/a/b/d;->a(Lcom/a/a/b/d;)I

    move-result v0

    iput v0, p0, Lcom/a/a/b/e;->a:I

    invoke-static {p1}, Lcom/a/a/b/d;->b(Lcom/a/a/b/d;)I

    move-result v0

    iput v0, p0, Lcom/a/a/b/e;->b:I

    invoke-static {p1}, Lcom/a/a/b/d;->c(Lcom/a/a/b/d;)I

    move-result v0

    iput v0, p0, Lcom/a/a/b/e;->c:I

    invoke-static {p1}, Lcom/a/a/b/d;->d(Lcom/a/a/b/d;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/b/e;->d:Landroid/graphics/drawable/Drawable;

    invoke-static {p1}, Lcom/a/a/b/d;->e(Lcom/a/a/b/d;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/b/e;->e:Landroid/graphics/drawable/Drawable;

    invoke-static {p1}, Lcom/a/a/b/d;->f(Lcom/a/a/b/d;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/b/e;->f:Landroid/graphics/drawable/Drawable;

    invoke-static {p1}, Lcom/a/a/b/d;->g(Lcom/a/a/b/d;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/a/a/b/e;->g:Z

    invoke-static {p1}, Lcom/a/a/b/d;->h(Lcom/a/a/b/d;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/a/a/b/e;->h:Z

    invoke-static {p1}, Lcom/a/a/b/d;->i(Lcom/a/a/b/d;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/a/a/b/e;->i:Z

    invoke-static {p1}, Lcom/a/a/b/d;->j(Lcom/a/a/b/d;)Lcom/a/a/b/a/e;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/b/e;->j:Lcom/a/a/b/a/e;

    invoke-static {p1}, Lcom/a/a/b/d;->k(Lcom/a/a/b/d;)Landroid/graphics/BitmapFactory$Options;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/b/e;->k:Landroid/graphics/BitmapFactory$Options;

    invoke-static {p1}, Lcom/a/a/b/d;->l(Lcom/a/a/b/d;)I

    move-result v0

    iput v0, p0, Lcom/a/a/b/e;->l:I

    invoke-static {p1}, Lcom/a/a/b/d;->m(Lcom/a/a/b/d;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/a/a/b/e;->m:Z

    invoke-static {p1}, Lcom/a/a/b/d;->n(Lcom/a/a/b/d;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/b/e;->n:Ljava/lang/Object;

    invoke-static {p1}, Lcom/a/a/b/d;->o(Lcom/a/a/b/d;)Lcom/a/a/b/g/a;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/b/e;->o:Lcom/a/a/b/g/a;

    invoke-static {p1}, Lcom/a/a/b/d;->p(Lcom/a/a/b/d;)Lcom/a/a/b/g/a;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/b/e;->p:Lcom/a/a/b/g/a;

    invoke-static {p1}, Lcom/a/a/b/d;->q(Lcom/a/a/b/d;)Lcom/a/a/b/c/a;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/b/e;->q:Lcom/a/a/b/c/a;

    invoke-static {p1}, Lcom/a/a/b/d;->r(Lcom/a/a/b/d;)Landroid/os/Handler;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/b/e;->r:Landroid/os/Handler;

    invoke-static {p1}, Lcom/a/a/b/d;->s(Lcom/a/a/b/d;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/a/a/b/e;->s:Z

    return-object p0
.end method

.method public final b()Lcom/a/a/b/e;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/a/a/b/e;->i:Z

    return-object p0
.end method

.method public final b(I)Lcom/a/a/b/e;
    .locals 0

    iput p1, p0, Lcom/a/a/b/e;->b:I

    return-object p0
.end method

.method public final c()Lcom/a/a/b/e;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/a/a/b/e;->m:Z

    return-object p0
.end method

.method public final c(I)Lcom/a/a/b/e;
    .locals 0

    iput p1, p0, Lcom/a/a/b/e;->c:I

    return-object p0
.end method

.method public final d()Lcom/a/a/b/d;
    .locals 2

    new-instance v0, Lcom/a/a/b/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/a/a/b/d;-><init>(Lcom/a/a/b/e;B)V

    return-object v0
.end method
