.class public Lcom/qihoo/security/widget/material/a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/widget/material/a$a;,
        Lcom/qihoo/security/widget/material/a$b;
    }
.end annotation


# instance fields
.field private A:Lcom/qihoo/security/widget/material/a$b;

.field private B:Landroid/content/Context;

.field private C:Landroid/view/View$OnClickListener;

.field private final D:Lcom/nineoldandroids/util/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nineoldandroids/util/c",
            "<",
            "Lcom/qihoo/security/widget/material/a;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private final E:Lcom/nineoldandroids/util/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nineoldandroids/util/c",
            "<",
            "Lcom/qihoo/security/widget/material/a;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private a:Landroid/view/View;

.field private final b:Landroid/graphics/Paint;

.field private final c:Landroid/graphics/Rect;

.field private d:I

.field private e:Z

.field private f:Z

.field private g:I

.field private h:I

.field private i:I

.field private j:Z

.field private k:I

.field private l:Z

.field private m:Landroid/graphics/drawable/Drawable;

.field private n:Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private o:Z

.field private p:Z

.field private q:Z

.field private r:F

.field private s:Landroid/widget/AdapterView;

.field private t:Lcom/nineoldandroids/a/c;

.field private u:Lcom/nineoldandroids/a/k;

.field private final v:Landroid/graphics/Point;

.field private w:Landroid/graphics/Point;

.field private x:Z

.field private y:Z

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/qihoo/security/widget/material/a;->b:Landroid/graphics/Paint;

    .line 62
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/material/a;->c:Landroid/graphics/Rect;

    .line 92
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/material/a;->v:Landroid/graphics/Point;

    .line 93
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/material/a;->w:Landroid/graphics/Point;

    .line 431
    new-instance v0, Lcom/qihoo/security/widget/material/a$3;

    const-class v1, Ljava/lang/Float;

    const-string/jumbo v2, "radius"

    invoke-direct {v0, p0, v1, v2}, Lcom/qihoo/security/widget/material/a$3;-><init>(Lcom/qihoo/security/widget/material/a;Ljava/lang/Class;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/qihoo/security/widget/material/a;->D:Lcom/nineoldandroids/util/c;

    .line 453
    new-instance v0, Lcom/qihoo/security/widget/material/a$4;

    const-class v1, Ljava/lang/Integer;

    const-string/jumbo v2, "rippleAlpha"

    invoke-direct {v0, p0, v1, v2}, Lcom/qihoo/security/widget/material/a$4;-><init>(Lcom/qihoo/security/widget/material/a;Ljava/lang/Class;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/qihoo/security/widget/material/a;->E:Lcom/nineoldandroids/util/c;

    .line 700
    return-void
.end method

.method static a(Landroid/content/res/Resources;F)F
    .locals 2

    .prologue
    .line 560
    const/4 v0, 0x1

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-static {v0, p1, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/qihoo/security/widget/material/a;)Landroid/view/View;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->a:Landroid/view/View;

    return-object v0
.end method

.method private a(Ljava/lang/Runnable;)V
    .locals 9

    .prologue
    const/4 v8, 0x2

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 270
    iget-boolean v0, p0, Lcom/qihoo/security/widget/material/a;->x:Z

    if-eqz v0, :cond_0

    .line 310
    :goto_0
    return-void

    .line 274
    :cond_0
    invoke-direct {p0}, Lcom/qihoo/security/widget/material/a;->f()F

    move-result v0

    .line 276
    invoke-direct {p0}, Lcom/qihoo/security/widget/material/a;->e()V

    .line 278
    new-instance v1, Lcom/nineoldandroids/a/c;

    invoke-direct {v1}, Lcom/nineoldandroids/a/c;-><init>()V

    iput-object v1, p0, Lcom/qihoo/security/widget/material/a;->t:Lcom/nineoldandroids/a/c;

    .line 279
    iget-object v1, p0, Lcom/qihoo/security/widget/material/a;->t:Lcom/nineoldandroids/a/c;

    new-instance v2, Lcom/qihoo/security/widget/material/a$2;

    invoke-direct {v2, p0, p1}, Lcom/qihoo/security/widget/material/a$2;-><init>(Lcom/qihoo/security/widget/material/a;Ljava/lang/Runnable;)V

    invoke-virtual {v1, v2}, Lcom/nineoldandroids/a/c;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 293
    iget-object v1, p0, Lcom/qihoo/security/widget/material/a;->D:Lcom/nineoldandroids/util/c;

    new-array v2, v8, [F

    iget v3, p0, Lcom/qihoo/security/widget/material/a;->r:F

    aput v3, v2, v6

    aput v0, v2, v7

    invoke-static {p0, v1, v2}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Lcom/nineoldandroids/util/c;[F)Lcom/nineoldandroids/a/k;

    move-result-object v1

    .line 294
    iget v2, p0, Lcom/qihoo/security/widget/material/a;->h:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 295
    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Lcom/nineoldandroids/a/k;->a(Landroid/view/animation/Interpolator;)V

    .line 296
    iget-object v2, p0, Lcom/qihoo/security/widget/material/a;->E:Lcom/nineoldandroids/util/c;

    new-array v3, v8, [I

    iget v4, p0, Lcom/qihoo/security/widget/material/a;->i:I

    aput v4, v3, v6

    aput v6, v3, v7

    invoke-static {p0, v2, v3}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Lcom/nineoldandroids/util/c;[I)Lcom/nineoldandroids/a/k;

    move-result-object v2

    .line 297
    iget v3, p0, Lcom/qihoo/security/widget/material/a;->k:I

    int-to-long v4, v3

    invoke-virtual {v2, v4, v5}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 298
    new-instance v3, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v3}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v2, v3}, Lcom/nineoldandroids/a/k;->a(Landroid/view/animation/Interpolator;)V

    .line 299
    iget v3, p0, Lcom/qihoo/security/widget/material/a;->h:I

    iget v4, p0, Lcom/qihoo/security/widget/material/a;->k:I

    sub-int/2addr v3, v4

    add-int/lit8 v3, v3, -0x32

    int-to-long v4, v3

    invoke-virtual {v2, v4, v5}, Lcom/nineoldandroids/a/k;->a(J)V

    .line 301
    iget-boolean v3, p0, Lcom/qihoo/security/widget/material/a;->l:Z

    if-eqz v3, :cond_1

    .line 302
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->t:Lcom/nineoldandroids/a/c;

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/c;->a(Lcom/nineoldandroids/a/a;)Lcom/nineoldandroids/a/c$b;

    .line 309
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->t:Lcom/nineoldandroids/a/c;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/c;->a()V

    goto :goto_0

    .line 303
    :cond_1
    invoke-direct {p0}, Lcom/qihoo/security/widget/material/a;->j()F

    move-result v3

    cmpl-float v0, v3, v0

    if-lez v0, :cond_2

    .line 304
    const-wide/16 v0, 0x0

    invoke-virtual {v2, v0, v1}, Lcom/nineoldandroids/a/k;->a(J)V

    .line 305
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->t:Lcom/nineoldandroids/a/c;

    invoke-virtual {v0, v2}, Lcom/nineoldandroids/a/c;->a(Lcom/nineoldandroids/a/a;)Lcom/nineoldandroids/a/c$b;

    goto :goto_1

    .line 307
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->t:Lcom/nineoldandroids/a/c;

    new-array v3, v8, [Lcom/nineoldandroids/a/a;

    aput-object v1, v3, v6

    aput-object v2, v3, v7

    invoke-virtual {v0, v3}, Lcom/nineoldandroids/a/c;->a([Lcom/nineoldandroids/a/a;)V

    goto :goto_1
.end method

.method static synthetic a(Lcom/qihoo/security/widget/material/a;Z)Z
    .locals 0

    .prologue
    .line 38
    iput-boolean p1, p0, Lcom/qihoo/security/widget/material/a;->y:Z

    return p1
.end method

.method private b()Landroid/content/res/Resources;
    .locals 1

    .prologue
    .line 117
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->B:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method

.method private b(Landroid/graphics/Canvas;)V
    .locals 1

    .prologue
    .line 421
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->a:Landroid/view/View;

    instance-of v0, v0, Lcom/qihoo/security/widget/material/b;

    if-eqz v0, :cond_0

    .line 422
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->a:Landroid/view/View;

    check-cast v0, Lcom/qihoo/security/widget/material/b;

    .line 423
    invoke-interface {v0, p1}, Lcom/qihoo/security/widget/material/b;->a(Landroid/graphics/Canvas;)V

    .line 426
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/widget/material/a;)Z
    .locals 1

    .prologue
    .line 38
    iget-boolean v0, p0, Lcom/qihoo/security/widget/material/a;->l:Z

    return v0
.end method

.method static synthetic c(Lcom/qihoo/security/widget/material/a;)I
    .locals 1

    .prologue
    .line 38
    iget v0, p0, Lcom/qihoo/security/widget/material/a;->i:I

    return v0
.end method

.method private c()V
    .locals 2

    .prologue
    .line 247
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->A:Lcom/qihoo/security/widget/material/a$b;

    if-eqz v0, :cond_0

    .line 248
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->a:Landroid/view/View;

    iget-object v1, p0, Lcom/qihoo/security/widget/material/a;->A:Lcom/qihoo/security/widget/material/a$b;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 249
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/widget/material/a;->y:Z

    .line 251
    :cond_0
    return-void
.end method

.method private d()V
    .locals 6

    .prologue
    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    .line 254
    iget-boolean v0, p0, Lcom/qihoo/security/widget/material/a;->x:Z

    if-eqz v0, :cond_0

    .line 267
    :goto_0
    return-void

    .line 258
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->u:Lcom/nineoldandroids/a/k;

    if-eqz v0, :cond_1

    .line 259
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->u:Lcom/nineoldandroids/a/k;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->b()V

    .line 261
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-double v0, v0

    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    iget-object v2, p0, Lcom/qihoo/security/widget/material/a;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-double v2, v2

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    const-wide v2, 0x3ff3333340000000L    # 1.2000000476837158

    mul-double/2addr v0, v2

    double-to-float v0, v0

    .line 263
    iget-object v1, p0, Lcom/qihoo/security/widget/material/a;->D:Lcom/nineoldandroids/util/c;

    const/4 v2, 0x2

    new-array v2, v2, [F

    const/4 v3, 0x0

    iget v4, p0, Lcom/qihoo/security/widget/material/a;->g:I

    int-to-float v4, v4

    aput v4, v2, v3

    const/4 v3, 0x1

    aput v0, v2, v3

    invoke-static {p0, v1, v2}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Lcom/nineoldandroids/util/c;[F)Lcom/nineoldandroids/a/k;

    move-result-object v0

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v2, v3}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/widget/material/a;->u:Lcom/nineoldandroids/a/k;

    .line 265
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->u:Lcom/nineoldandroids/a/k;

    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/k;->a(Landroid/view/animation/Interpolator;)V

    .line 266
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->u:Lcom/nineoldandroids/a/k;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->a()V

    goto :goto_0
.end method

.method static synthetic d(Lcom/qihoo/security/widget/material/a;)Z
    .locals 1

    .prologue
    .line 38
    iget-boolean v0, p0, Lcom/qihoo/security/widget/material/a;->j:Z

    return v0
.end method

.method static synthetic e(Lcom/qihoo/security/widget/material/a;)F
    .locals 1

    .prologue
    .line 38
    invoke-direct {p0}, Lcom/qihoo/security/widget/material/a;->j()F

    move-result v0

    return v0
.end method

.method private e()V
    .locals 1

    .prologue
    .line 313
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->t:Lcom/nineoldandroids/a/c;

    if-eqz v0, :cond_0

    .line 314
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->t:Lcom/nineoldandroids/a/c;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/c;->b()V

    .line 315
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->t:Lcom/nineoldandroids/a/c;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/c;->g()V

    .line 318
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->u:Lcom/nineoldandroids/a/k;

    if-eqz v0, :cond_1

    .line 319
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->u:Lcom/nineoldandroids/a/k;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->b()V

    .line 321
    :cond_1
    return-void
.end method

.method private f()F
    .locals 8

    .prologue
    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    .line 324
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    .line 325
    iget-object v1, p0, Lcom/qihoo/security/widget/material/a;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    .line 327
    div-int/lit8 v2, v0, 0x2

    .line 328
    div-int/lit8 v3, v1, 0x2

    .line 330
    iget-object v4, p0, Lcom/qihoo/security/widget/material/a;->v:Landroid/graphics/Point;

    iget v4, v4, Landroid/graphics/Point;->x:I

    if-le v2, v4, :cond_0

    iget-object v2, p0, Lcom/qihoo/security/widget/material/a;->v:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->x:I

    sub-int/2addr v0, v2

    int-to-float v0, v0

    .line 331
    :goto_0
    iget-object v2, p0, Lcom/qihoo/security/widget/material/a;->v:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->y:I

    if-le v3, v2, :cond_1

    iget-object v2, p0, Lcom/qihoo/security/widget/material/a;->v:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->y:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    .line 333
    :goto_1
    float-to-double v2, v0

    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    float-to-double v0, v1

    invoke-static {v0, v1, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    const v1, 0x3f99999a    # 1.2f

    mul-float/2addr v0, v1

    return v0

    .line 330
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->v:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    goto :goto_0

    .line 331
    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/widget/material/a;->v:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    goto :goto_1
.end method

.method static synthetic f(Lcom/qihoo/security/widget/material/a;)Z
    .locals 1

    .prologue
    .line 38
    iget-boolean v0, p0, Lcom/qihoo/security/widget/material/a;->f:Z

    return v0
.end method

.method private g()Landroid/widget/AdapterView;
    .locals 2

    .prologue
    .line 353
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->s:Landroid/widget/AdapterView;

    if-eqz v0, :cond_0

    .line 354
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->s:Landroid/widget/AdapterView;

    .line 360
    :goto_0
    return-object v0

    .line 356
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 358
    :goto_1
    instance-of v1, v0, Landroid/widget/AdapterView;

    if-eqz v1, :cond_1

    .line 359
    check-cast v0, Landroid/widget/AdapterView;

    iput-object v0, p0, Lcom/qihoo/security/widget/material/a;->s:Landroid/widget/AdapterView;

    .line 360
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->s:Landroid/widget/AdapterView;

    goto :goto_0

    .line 363
    :cond_1
    :try_start_0
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_1

    .line 364
    :catch_0
    move-exception v0

    .line 365
    new-instance v0, Ljava/lang/RuntimeException;

    const-string/jumbo v1, "Could not find a parent AdapterView"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static synthetic g(Lcom/qihoo/security/widget/material/a;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Lcom/qihoo/security/widget/material/a;->d()V

    return-void
.end method

.method static synthetic h(Lcom/qihoo/security/widget/material/a;)Landroid/view/View$OnClickListener;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->C:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method private h()V
    .locals 2

    .prologue
    .line 372
    iget-boolean v0, p0, Lcom/qihoo/security/widget/material/a;->n:Z

    if-eqz v0, :cond_0

    .line 373
    invoke-direct {p0}, Lcom/qihoo/security/widget/material/a;->g()Landroid/widget/AdapterView;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/widget/material/a;->a:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->getPositionForView(Landroid/view/View;)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/material/a;->z:I

    .line 375
    :cond_0
    return-void
.end method

.method private i()Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 378
    iget-boolean v0, p0, Lcom/qihoo/security/widget/material/a;->n:Z

    if-eqz v0, :cond_2

    .line 379
    invoke-direct {p0}, Lcom/qihoo/security/widget/material/a;->g()Landroid/widget/AdapterView;

    move-result-object v0

    iget-object v2, p0, Lcom/qihoo/security/widget/material/a;->a:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/widget/AdapterView;->getPositionForView(Landroid/view/View;)I

    move-result v2

    .line 380
    iget v0, p0, Lcom/qihoo/security/widget/material/a;->z:I

    if-eq v2, v0, :cond_1

    const/4 v0, 0x1

    .line 381
    :goto_0
    iput v2, p0, Lcom/qihoo/security/widget/material/a;->z:I

    .line 382
    if-eqz v0, :cond_0

    .line 383
    invoke-direct {p0}, Lcom/qihoo/security/widget/material/a;->c()V

    .line 384
    invoke-direct {p0}, Lcom/qihoo/security/widget/material/a;->e()V

    .line 385
    iget-object v2, p0, Lcom/qihoo/security/widget/material/a;->a:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->setPressed(Z)V

    .line 386
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/qihoo/security/widget/material/a;->a(F)V

    .line 390
    :cond_0
    :goto_1
    return v0

    :cond_1
    move v0, v1

    .line 380
    goto :goto_0

    :cond_2
    move v0, v1

    .line 390
    goto :goto_1
.end method

.method private j()F
    .locals 1

    .prologue
    .line 445
    iget v0, p0, Lcom/qihoo/security/widget/material/a;->r:F

    return v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 467
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->b:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    move-result v0

    return v0
.end method

.method public a(F)V
    .locals 1

    .prologue
    .line 449
    iput p1, p0, Lcom/qihoo/security/widget/material/a;->r:F

    .line 450
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 451
    return-void
.end method

.method protected a(IIII)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 394
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->c:Landroid/graphics/Rect;

    invoke-virtual {v0, v1, v1, p1, p2}, Landroid/graphics/Rect;->set(IIII)V

    .line 395
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->m:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/qihoo/security/widget/material/a;->c:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 396
    return-void
.end method

.method public a(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/view/View;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 125
    iput-object p1, p0, Lcom/qihoo/security/widget/material/a;->B:Landroid/content/Context;

    .line 126
    iput-object p4, p0, Lcom/qihoo/security/widget/material/a;->a:Landroid/view/View;

    .line 128
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->a:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 129
    sget-object v0, Lcom/qihoo/security/lite/a$a;->MaterialRippleLayout:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 130
    const/high16 v1, -0x1000000

    invoke-virtual {v0, v4, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/widget/material/a;->d:I

    .line 131
    invoke-direct {p0}, Lcom/qihoo/security/widget/material/a;->b()Landroid/content/res/Resources;

    move-result-object v1

    const/high16 v2, 0x420c0000    # 35.0f

    invoke-static {v1, v2}, Lcom/qihoo/security/widget/material/a;->a(Landroid/content/res/Resources;F)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v0, v5, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/widget/material/a;->g:I

    .line 133
    const/4 v1, 0x2

    invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/qihoo/security/widget/material/a;->e:Z

    .line 134
    const/4 v1, 0x6

    invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/qihoo/security/widget/material/a;->f:Z

    .line 135
    const/4 v1, 0x4

    const/16 v2, 0x96

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/widget/material/a;->h:I

    .line 136
    iput v4, p0, Lcom/qihoo/security/widget/material/a;->h:I

    .line 137
    const/high16 v1, 0x437f0000    # 255.0f

    const/4 v2, 0x3

    const v3, 0x3dcccccd    # 0.1f

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    mul-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, p0, Lcom/qihoo/security/widget/material/a;->i:I

    .line 138
    const/16 v1, 0x8

    invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/qihoo/security/widget/material/a;->j:Z

    .line 139
    const/4 v1, 0x5

    const/16 v2, 0x32

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/widget/material/a;->k:I

    .line 140
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v2, 0x7

    invoke-virtual {v0, v2, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    iput-object v1, p0, Lcom/qihoo/security/widget/material/a;->m:Landroid/graphics/drawable/Drawable;

    .line 142
    const/16 v1, 0x9

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/qihoo/security/widget/material/a;->l:Z

    .line 145
    const/16 v1, 0xb

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/qihoo/security/widget/material/a;->o:Z

    .line 147
    const/16 v1, 0xc

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/qihoo/security/widget/material/a;->p:Z

    .line 149
    const/16 v1, 0xd

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/qihoo/security/widget/material/a;->q:Z

    .line 152
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 154
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->b:Landroid/graphics/Paint;

    iget v1, p0, Lcom/qihoo/security/widget/material/a;->d:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 155
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->b:Landroid/graphics/Paint;

    iget v1, p0, Lcom/qihoo/security/widget/material/a;->i:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 156
    return-void
.end method

.method public a(Landroid/graphics/Canvas;)V
    .locals 4

    .prologue
    .line 402
    invoke-direct {p0}, Lcom/qihoo/security/widget/material/a;->i()Z

    move-result v0

    .line 403
    iget-boolean v1, p0, Lcom/qihoo/security/widget/material/a;->e:Z

    if-eqz v1, :cond_2

    .line 404
    if-nez v0, :cond_0

    .line 405
    iget-object v1, p0, Lcom/qihoo/security/widget/material/a;->m:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 407
    :cond_0
    invoke-direct {p0, p1}, Lcom/qihoo/security/widget/material/a;->b(Landroid/graphics/Canvas;)V

    .line 408
    if-nez v0, :cond_1

    .line 409
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->v:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lcom/qihoo/security/widget/material/a;->v:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lcom/qihoo/security/widget/material/a;->r:F

    iget-object v3, p0, Lcom/qihoo/security/widget/material/a;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 418
    :cond_1
    :goto_0
    return-void

    .line 412
    :cond_2
    if-nez v0, :cond_3

    .line 413
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->m:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 414
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->v:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lcom/qihoo/security/widget/material/a;->v:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    iget v2, p0, Lcom/qihoo/security/widget/material/a;->r:F

    iget-object v3, p0, Lcom/qihoo/security/widget/material/a;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 416
    :cond_3
    invoke-direct {p0, p1}, Lcom/qihoo/security/widget/material/a;->b(Landroid/graphics/Canvas;)V

    goto :goto_0
.end method

.method public a(Landroid/view/View$OnClickListener;)V
    .locals 0

    .prologue
    .line 722
    iput-object p1, p0, Lcom/qihoo/security/widget/material/a;->C:Landroid/view/View$OnClickListener;

    .line 723
    return-void
.end method

.method public a(Ljava/lang/Integer;)V
    .locals 2

    .prologue
    .line 471
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->b:Landroid/graphics/Paint;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 472
    iget-object v0, p0, Lcom/qihoo/security/widget/material/a;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 473
    return-void
.end method

.method public a(Landroid/view/MotionEvent;ZZ)Z
    .locals 7

    .prologue
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v0, 0x1

    .line 160
    if-nez p3, :cond_0

    .line 243
    :goto_0
    return p2

    .line 164
    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/widget/material/a;->c:Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Rect;->contains(II)Z

    move-result v1

    .line 166
    if-eqz v1, :cond_1

    .line 167
    iget-object v2, p0, Lcom/qihoo/security/widget/material/a;->w:Landroid/graphics/Point;

    iget-object v3, p0, Lcom/qihoo/security/widget/material/a;->v:Landroid/graphics/Point;

    iget v3, v3, Landroid/graphics/Point;->x:I

    iget-object v4, p0, Lcom/qihoo/security/widget/material/a;->v:Landroid/graphics/Point;

    iget v4, v4, Landroid/graphics/Point;->y:I

    invoke-virtual {v2, v3, v4}, Landroid/graphics/Point;->set(II)V

    .line 168
    iget-object v2, p0, Lcom/qihoo/security/widget/material/a;->v:Landroid/graphics/Point;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v2, v3, v4}, Landroid/graphics/Point;->set(II)V

    .line 170
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    .line 171
    packed-switch v2, :pswitch_data_0

    :cond_2
    :goto_1
    move p2, v0

    .line 243
    goto :goto_0

    .line 174
    :pswitch_0
    iget-boolean v2, p0, Lcom/qihoo/security/widget/material/a;->y:Z

    if-eqz v2, :cond_3

    .line 175
    iget-object v2, p0, Lcom/qihoo/security/widget/material/a;->a:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->setPressed(Z)V

    .line 176
    iget-object v2, p0, Lcom/qihoo/security/widget/material/a;->a:Landroid/view/View;

    new-instance v3, Lcom/qihoo/security/widget/material/a$1;

    invoke-direct {v3, p0}, Lcom/qihoo/security/widget/material/a$1;-><init>(Lcom/qihoo/security/widget/material/a;)V

    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v4

    int-to-long v4, v4

    invoke-virtual {v2, v3, v4, v5}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 190
    :cond_3
    if-eqz v1, :cond_4

    .line 191
    new-instance v1, Lcom/qihoo/security/widget/material/a$a;

    invoke-direct {v1, p0, v6}, Lcom/qihoo/security/widget/material/a$a;-><init>(Lcom/qihoo/security/widget/material/a;Lcom/qihoo/security/widget/material/a$1;)V

    invoke-direct {p0, v1}, Lcom/qihoo/security/widget/material/a;->a(Ljava/lang/Runnable;)V

    .line 193
    :cond_4
    invoke-direct {p0}, Lcom/qihoo/security/widget/material/a;->c()V

    goto :goto_1

    .line 196
    :pswitch_1
    invoke-direct {p0}, Lcom/qihoo/security/widget/material/a;->h()V

    .line 197
    iput-boolean v5, p0, Lcom/qihoo/security/widget/material/a;->x:Z

    .line 204
    iget-object v1, p0, Lcom/qihoo/security/widget/material/a;->a:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setPressed(Z)V

    .line 205
    iget-boolean v1, p0, Lcom/qihoo/security/widget/material/a;->f:Z

    if-eqz v1, :cond_2

    .line 206
    invoke-direct {p0}, Lcom/qihoo/security/widget/material/a;->d()V

    goto :goto_1

    .line 211
    :pswitch_2
    iget-boolean v1, p0, Lcom/qihoo/security/widget/material/a;->n:Z

    if-eqz v1, :cond_5

    .line 213
    iget-object v1, p0, Lcom/qihoo/security/widget/material/a;->v:Landroid/graphics/Point;

    iget-object v2, p0, Lcom/qihoo/security/widget/material/a;->w:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->x:I

    iget-object v3, p0, Lcom/qihoo/security/widget/material/a;->w:Landroid/graphics/Point;

    iget v3, v3, Landroid/graphics/Point;->y:I

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Point;->set(II)V

    .line 214
    new-instance v1, Landroid/graphics/Point;

    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    iput-object v1, p0, Lcom/qihoo/security/widget/material/a;->w:Landroid/graphics/Point;

    .line 216
    :cond_5
    iget-boolean v1, p0, Lcom/qihoo/security/widget/material/a;->f:Z

    if-eqz v1, :cond_7

    .line 217
    iget-boolean v1, p0, Lcom/qihoo/security/widget/material/a;->y:Z

    if-nez v1, :cond_6

    .line 218
    invoke-direct {p0, v6}, Lcom/qihoo/security/widget/material/a;->a(Ljava/lang/Runnable;)V

    .line 223
    :cond_6
    :goto_2
    invoke-direct {p0}, Lcom/qihoo/security/widget/material/a;->c()V

    goto :goto_1

    .line 221
    :cond_7
    iget-object v1, p0, Lcom/qihoo/security/widget/material/a;->a:Landroid/view/View;

    invoke-virtual {v1, v5}, Landroid/view/View;->setPressed(Z)V

    goto :goto_2

    .line 226
    :pswitch_3
    iget-boolean v2, p0, Lcom/qihoo/security/widget/material/a;->f:Z

    if-eqz v2, :cond_8

    .line 227
    if-eqz v1, :cond_a

    iget-boolean v2, p0, Lcom/qihoo/security/widget/material/a;->x:Z

    if-nez v2, :cond_a

    .line 228
    iget-object v2, p0, Lcom/qihoo/security/widget/material/a;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    .line 234
    :cond_8
    :goto_3
    if-nez v1, :cond_2

    .line 235
    invoke-direct {p0}, Lcom/qihoo/security/widget/material/a;->c()V

    .line 236
    iget-object v1, p0, Lcom/qihoo/security/widget/material/a;->u:Lcom/nineoldandroids/a/k;

    if-eqz v1, :cond_9

    .line 237
    iget-object v1, p0, Lcom/qihoo/security/widget/material/a;->u:Lcom/nineoldandroids/a/k;

    invoke-virtual {v1}, Lcom/nineoldandroids/a/k;->b()V

    .line 239
    :cond_9
    iput-boolean v0, p0, Lcom/qihoo/security/widget/material/a;->x:Z

    goto/16 :goto_1

    .line 229
    :cond_a
    if-nez v1, :cond_8

    .line 230
    invoke-direct {p0, v6}, Lcom/qihoo/security/widget/material/a;->a(Ljava/lang/Runnable;)V

    goto :goto_3

    .line 171
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method
