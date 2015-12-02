.class public Lcom/qihoo/security/floatview/ui/f;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/floatview/ui/b;
.implements Lcom/qihoo/security/ui/opti/sysclear/rocket/a;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/os/Vibrator;

.field private c:Lcom/qihoo/security/floatview/ui/e;

.field private d:Lcom/qihoo/security/floatview/ui/g;

.field private e:Lcom/qihoo/security/floatview/ui/d;

.field private f:Lcom/qihoo/security/floatview/ui/a;

.field private g:Lcom/qihoo/security/floatview/ui/i;

.field private h:Lcom/qihoo/security/floatview/ui/h;

.field private i:Landroid/widget/ImageView;

.field private j:Landroid/view/WindowManager;

.field private k:I

.field private l:I

.field private m:I

.field private final n:I

.field private final o:I

.field private p:Landroid/graphics/Rect;

.field private q:Z

.field private r:Z

.field private s:Z

.field private t:Ljava/lang/String;

.field private u:Z

.field private final v:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/qihoo/security/floatview/ui/a;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->a:Landroid/content/Context;

    .line 49
    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->b:Landroid/os/Vibrator;

    .line 50
    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->c:Lcom/qihoo/security/floatview/ui/e;

    .line 51
    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->d:Lcom/qihoo/security/floatview/ui/g;

    .line 52
    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->e:Lcom/qihoo/security/floatview/ui/d;

    .line 53
    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->f:Lcom/qihoo/security/floatview/ui/a;

    .line 54
    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->g:Lcom/qihoo/security/floatview/ui/i;

    .line 55
    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->h:Lcom/qihoo/security/floatview/ui/h;

    .line 57
    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->j:Landroid/view/WindowManager;

    .line 59
    iput v1, p0, Lcom/qihoo/security/floatview/ui/f;->k:I

    .line 60
    iput v1, p0, Lcom/qihoo/security/floatview/ui/f;->l:I

    .line 61
    iput v1, p0, Lcom/qihoo/security/floatview/ui/f;->m:I

    .line 64
    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->p:Landroid/graphics/Rect;

    .line 65
    iput-boolean v1, p0, Lcom/qihoo/security/floatview/ui/f;->q:Z

    .line 66
    iput-boolean v1, p0, Lcom/qihoo/security/floatview/ui/f;->r:Z

    .line 67
    iput-boolean v1, p0, Lcom/qihoo/security/floatview/ui/f;->s:Z

    .line 69
    iput-boolean v1, p0, Lcom/qihoo/security/floatview/ui/f;->u:Z

    .line 70
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->v:Landroid/os/Handler;

    .line 75
    iput-object p1, p0, Lcom/qihoo/security/floatview/ui/f;->a:Landroid/content/Context;

    .line 76
    iput-object p2, p0, Lcom/qihoo/security/floatview/ui/f;->f:Lcom/qihoo/security/floatview/ui/a;

    .line 77
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->f:Lcom/qihoo/security/floatview/ui/a;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/a;->getMemoryUsageView()Lcom/qihoo/security/floatview/ui/i;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->g:Lcom/qihoo/security/floatview/ui/i;

    .line 78
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 79
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 80
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v1, p0, Lcom/qihoo/security/floatview/ui/f;->n:I

    .line 81
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v0, p0, Lcom/qihoo/security/floatview/ui/f;->o:I

    .line 82
    return-void
.end method

.method private a(Landroid/content/Context;)I
    .locals 3

    .prologue
    .line 758
    iget v0, p0, Lcom/qihoo/security/floatview/ui/f;->m:I

    if-nez v0, :cond_0

    .line 760
    :try_start_0
    const-string/jumbo v0, "com.android.internal.R$dimen"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 761
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    .line 762
    const-string/jumbo v2, "status_bar_height"

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 763
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 764
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/floatview/ui/f;->m:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 771
    :cond_0
    :goto_0
    iget v0, p0, Lcom/qihoo/security/floatview/ui/f;->m:I

    return v0

    .line 765
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/floatview/ui/f;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 46
    iput-object p1, p0, Lcom/qihoo/security/floatview/ui/f;->t:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lcom/qihoo/security/floatview/ui/f;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/f;->j()V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 288
    iget-boolean v0, p0, Lcom/qihoo/security/floatview/ui/f;->s:Z

    if-eqz v0, :cond_1

    .line 322
    :cond_0
    :goto_0
    return-void

    .line 291
    :cond_1
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/f;->h()Lcom/qihoo/security/floatview/ui/g;

    .line 292
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->d:Lcom/qihoo/security/floatview/ui/g;

    if-eqz v0, :cond_0

    .line 293
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->d:Lcom/qihoo/security/floatview/ui/g;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/g;->getBackView()Landroid/view/View;

    move-result-object v0

    .line 294
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/f;->d:Lcom/qihoo/security/floatview/ui/g;

    invoke-virtual {v1, p1}, Lcom/qihoo/security/floatview/ui/g;->setTipText(Ljava/lang/String;)V

    .line 295
    new-instance v1, Landroid/view/animation/AlphaAnimation;

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v1, v2, v3}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 296
    new-instance v2, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 297
    const-wide/16 v2, 0x2bc

    invoke-virtual {v1, v2, v3}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 298
    new-instance v2, Lcom/qihoo/security/floatview/ui/f$2;

    invoke-direct {v2, p0}, Lcom/qihoo/security/floatview/ui/f$2;-><init>(Lcom/qihoo/security/floatview/ui/f;)V

    invoke-virtual {v1, v2}, Landroid/view/animation/AlphaAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 318
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 319
    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 320
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->d:Lcom/qihoo/security/floatview/ui/g;

    invoke-virtual {v0, v4}, Lcom/qihoo/security/floatview/ui/g;->setVisibility(I)V

    goto :goto_0
.end method

.method private a(Z)V
    .locals 9

    .prologue
    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 412
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->e:Lcom/qihoo/security/floatview/ui/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->e:Lcom/qihoo/security/floatview/ui/d;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/d;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 413
    if-eqz p1, :cond_1

    .line 414
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    move v3, v1

    move v5, v1

    move v6, v2

    move v7, v1

    move v8, v2

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    .line 416
    new-instance v3, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v3, v4, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 417
    new-instance v2, Landroid/view/animation/AnimationSet;

    invoke-direct {v2, v1}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 418
    const-wide/16 v4, 0x3c

    invoke-virtual {v2, v4, v5}, Landroid/view/animation/AnimationSet;->setDuration(J)V

    .line 419
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v2, v1}, Landroid/view/animation/AnimationSet;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 420
    invoke-virtual {v2, v0}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 421
    invoke-virtual {v2, v3}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 422
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->e:Lcom/qihoo/security/floatview/ui/d;

    const v1, 0x7f0b0111

    invoke-virtual {v0, v1}, Lcom/qihoo/security/floatview/ui/d;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 423
    invoke-virtual {v0, v2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 424
    new-instance v0, Lcom/qihoo/security/floatview/ui/f$5;

    invoke-direct {v0, p0}, Lcom/qihoo/security/floatview/ui/f$5;-><init>(Lcom/qihoo/security/floatview/ui/f;)V

    invoke-virtual {v2, v0}, Landroid/view/animation/AnimationSet;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 442
    :cond_0
    :goto_0
    return-void

    .line 439
    :cond_1
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/f;->k()V

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/floatview/ui/f;Z)Z
    .locals 0

    .prologue
    .line 46
    iput-boolean p1, p0, Lcom/qihoo/security/floatview/ui/f;->u:Z

    return p1
.end method

.method static synthetic b(Lcom/qihoo/security/floatview/ui/f;)Lcom/qihoo/security/floatview/ui/g;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->d:Lcom/qihoo/security/floatview/ui/g;

    return-object v0
.end method

.method private b(II)V
    .locals 3

    .prologue
    .line 92
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->h:Lcom/qihoo/security/floatview/ui/h;

    if-nez v0, :cond_0

    .line 98
    :goto_0
    return-void

    .line 95
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->h:Lcom/qihoo/security/floatview/ui/h;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/h;->getDrawableWidth()I

    move-result v0

    neg-int v0, v0

    shr-int/lit8 v0, v0, 0x1

    .line 96
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/f;->h:Lcom/qihoo/security/floatview/ui/h;

    invoke-virtual {v1}, Lcom/qihoo/security/floatview/ui/h;->getDrawableHeight()I

    move-result v1

    neg-int v1, v1

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/f;->f:Lcom/qihoo/security/floatview/ui/a;

    invoke-virtual {v2}, Lcom/qihoo/security/floatview/ui/a;->getMeasuredHeight()I

    move-result v2

    add-int/2addr v1, v2

    .line 97
    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/f;->h:Lcom/qihoo/security/floatview/ui/h;

    add-int/2addr v0, p1

    int-to-float v0, v0

    add-int/2addr v1, p2

    int-to-float v1, v1

    invoke-virtual {v2, v0, v1}, Lcom/qihoo/security/floatview/ui/h;->a(FF)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/qihoo/security/floatview/ui/f;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0, p1}, Lcom/qihoo/security/floatview/ui/f;->a(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/floatview/ui/f;Z)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0, p1}, Lcom/qihoo/security/floatview/ui/f;->a(Z)V

    return-void
.end method

.method private b(Z)V
    .locals 4

    .prologue
    const/16 v1, 0x8

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 448
    if-eqz p1, :cond_2

    .line 449
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/f;->g()Lcom/qihoo/security/floatview/ui/e;

    .line 450
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->c:Lcom/qihoo/security/floatview/ui/e;

    if-eqz v0, :cond_1

    .line 451
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->a:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 452
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f08003e

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    .line 453
    invoke-direct {p0, v0}, Lcom/qihoo/security/floatview/ui/f;->d(I)V

    .line 455
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->i:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 456
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->c:Lcom/qihoo/security/floatview/ui/e;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/floatview/ui/e;->setVisibility(I)V

    .line 457
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->c:Lcom/qihoo/security/floatview/ui/e;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/floatview/ui/e;->a(Z)V

    .line 458
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->c:Lcom/qihoo/security/floatview/ui/e;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/floatview/ui/e;->b(Z)V

    .line 466
    :cond_1
    :goto_0
    return-void

    .line 460
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->c:Lcom/qihoo/security/floatview/ui/e;

    if-eqz v0, :cond_1

    .line 461
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->i:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 462
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->c:Lcom/qihoo/security/floatview/ui/e;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/floatview/ui/e;->setVisibility(I)V

    .line 463
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->c:Lcom/qihoo/security/floatview/ui/e;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/e;->a()V

    goto :goto_0
.end method

.method private c(II)Lcom/qihoo/security/floatview/ui/d;
    .locals 7

    .prologue
    const/4 v1, -0x2

    .line 357
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->e:Lcom/qihoo/security/floatview/ui/d;

    if-nez v0, :cond_0

    .line 358
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/f;->d()Landroid/content/Context;

    move-result-object v0

    .line 359
    new-instance v2, Lcom/qihoo/security/floatview/ui/d;

    invoke-direct {v2, v0}, Lcom/qihoo/security/floatview/ui/d;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/qihoo/security/floatview/ui/f;->e:Lcom/qihoo/security/floatview/ui/d;

    .line 360
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/f;->v()Landroid/view/WindowManager;

    move-result-object v6

    .line 361
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    const/16 v3, 0x7d3

    const/16 v4, 0x8

    const/4 v5, -0x3

    move v2, v1

    invoke-direct/range {v0 .. v5}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    .line 365
    const/16 v1, 0x33

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 366
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 367
    iput p2, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 368
    const/4 v1, 0x1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 369
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/f;->e:Lcom/qihoo/security/floatview/ui/d;

    invoke-interface {v6, v1, v0}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 371
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->e:Lcom/qihoo/security/floatview/ui/d;

    return-object v0
.end method

.method static synthetic c(Lcom/qihoo/security/floatview/ui/f;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/f;->i()V

    return-void
.end method

.method static synthetic c(Lcom/qihoo/security/floatview/ui/f;Z)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0, p1}, Lcom/qihoo/security/floatview/ui/f;->b(Z)V

    return-void
.end method

.method private c(Z)V
    .locals 1

    .prologue
    .line 505
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->c:Lcom/qihoo/security/floatview/ui/e;

    if-eqz v0, :cond_0

    .line 506
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->c:Lcom/qihoo/security/floatview/ui/e;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/floatview/ui/e;->a(Z)V

    .line 508
    :cond_0
    return-void
.end method

.method private d(I)V
    .locals 1

    .prologue
    .line 696
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->i:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 697
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->i:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 699
    :cond_0
    return-void
.end method

.method private d(II)V
    .locals 3

    .prologue
    .line 472
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->c:Lcom/qihoo/security/floatview/ui/e;

    if-eqz v0, :cond_0

    .line 473
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->c:Lcom/qihoo/security/floatview/ui/e;

    int-to-float v1, p1

    int-to-float v2, p2

    invoke-virtual {v0, v1, v2, p0}, Lcom/qihoo/security/floatview/ui/e;->a(FFLcom/qihoo/security/ui/opti/sysclear/rocket/a;)V

    .line 475
    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/qihoo/security/floatview/ui/f;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/f;->k()V

    return-void
.end method

.method static synthetic d(Lcom/qihoo/security/floatview/ui/f;Z)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0, p1}, Lcom/qihoo/security/floatview/ui/f;->e(Z)V

    return-void
.end method

.method private d(Z)V
    .locals 2

    .prologue
    .line 511
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->c:Lcom/qihoo/security/floatview/ui/e;

    if-eqz v0, :cond_0

    .line 512
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->c:Lcom/qihoo/security/floatview/ui/e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/floatview/ui/e;->b(Z)V

    .line 514
    :cond_0
    return-void
.end method

.method static synthetic e(Lcom/qihoo/security/floatview/ui/f;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->t:Ljava/lang/String;

    return-object v0
.end method

.method private e(Z)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 531
    if-eqz p1, :cond_3

    .line 532
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->h:Lcom/qihoo/security/floatview/ui/h;

    if-nez v0, :cond_0

    .line 533
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/f;->o()V

    .line 535
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->h:Lcom/qihoo/security/floatview/ui/h;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/floatview/ui/h;->setVisibility(I)V

    .line 536
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->g:Lcom/qihoo/security/floatview/ui/i;

    if-eqz v0, :cond_2

    .line 537
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-ge v0, v1, :cond_1

    .line 538
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->g:Lcom/qihoo/security/floatview/ui/i;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/floatview/ui/i;->setMemoryAlpha(F)V

    .line 540
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->g:Lcom/qihoo/security/floatview/ui/i;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/qihoo/security/floatview/ui/i;->setVisibility(I)V

    .line 550
    :cond_2
    :goto_0
    return-void

    .line 543
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->g:Lcom/qihoo/security/floatview/ui/i;

    if-eqz v0, :cond_4

    .line 544
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->g:Lcom/qihoo/security/floatview/ui/i;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/floatview/ui/i;->setVisibility(I)V

    .line 546
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->h:Lcom/qihoo/security/floatview/ui/h;

    if-eqz v0, :cond_2

    .line 547
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->h:Lcom/qihoo/security/floatview/ui/h;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/qihoo/security/floatview/ui/h;->setVisibility(I)V

    goto :goto_0
.end method

.method static synthetic f(Lcom/qihoo/security/floatview/ui/f;)Z
    .locals 1

    .prologue
    .line 46
    iget-boolean v0, p0, Lcom/qihoo/security/floatview/ui/f;->s:Z

    return v0
.end method

.method static synthetic g(Lcom/qihoo/security/floatview/ui/f;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->v:Landroid/os/Handler;

    return-object v0
.end method

.method private g()Lcom/qihoo/security/floatview/ui/e;
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 221
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/f;->d()Landroid/content/Context;

    move-result-object v0

    .line 222
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/f;->c:Lcom/qihoo/security/floatview/ui/e;

    if-nez v1, :cond_0

    .line 223
    new-instance v1, Lcom/qihoo/security/floatview/ui/e;

    invoke-direct {v1, v0}, Lcom/qihoo/security/floatview/ui/e;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/qihoo/security/floatview/ui/f;->c:Lcom/qihoo/security/floatview/ui/e;

    .line 224
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/f;->v()Landroid/view/WindowManager;

    move-result-object v1

    .line 225
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Display;->getWidth()I

    move-result v2

    .line 226
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/Display;->getHeight()I

    move-result v3

    .line 228
    new-instance v4, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v4}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 229
    const/16 v5, 0x428

    iput v5, v4, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 231
    const/16 v5, 0x7d2

    iput v5, v4, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 232
    const/4 v5, 0x1

    iput v5, v4, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 233
    const/16 v5, 0x33

    iput v5, v4, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 234
    iput v6, v4, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 235
    iput v6, v4, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 236
    iput v2, v4, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 237
    invoke-direct {p0, v0}, Lcom/qihoo/security/floatview/ui/f;->a(Landroid/content/Context;)I

    move-result v2

    sub-int v2, v3, v2

    iput v2, v4, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 238
    new-instance v2, Landroid/widget/ImageView;

    invoke-direct {v2, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/qihoo/security/floatview/ui/f;->i:Landroid/widget/ImageView;

    .line 239
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->i:Landroid/widget/ImageView;

    invoke-interface {v1, v0, v4}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 240
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->c:Lcom/qihoo/security/floatview/ui/e;

    invoke-interface {v1, v0, v4}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 242
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->c:Lcom/qihoo/security/floatview/ui/e;

    return-object v0
.end method

.method private h()Lcom/qihoo/security/floatview/ui/g;
    .locals 5

    .prologue
    const/4 v4, -0x2

    .line 257
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->d:Lcom/qihoo/security/floatview/ui/g;

    if-nez v0, :cond_0

    .line 258
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/f;->d()Landroid/content/Context;

    move-result-object v0

    .line 259
    new-instance v1, Lcom/qihoo/security/floatview/ui/g;

    invoke-direct {v1, v0}, Lcom/qihoo/security/floatview/ui/g;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/qihoo/security/floatview/ui/f;->d:Lcom/qihoo/security/floatview/ui/g;

    .line 260
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/f;->v()Landroid/view/WindowManager;

    move-result-object v1

    .line 261
    new-instance v2, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v2}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 262
    const/16 v3, 0x428

    iput v3, v2, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 264
    const/16 v3, 0x7d2

    iput v3, v2, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 265
    const/4 v3, 0x1

    iput v3, v2, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 266
    const/16 v3, 0x31

    iput v3, v2, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 267
    iput v4, v2, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 268
    iput v4, v2, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 269
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 270
    const v3, 0x7f09006b

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, v2, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 271
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->d:Lcom/qihoo/security/floatview/ui/g;

    invoke-interface {v1, v0, v2}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 273
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->d:Lcom/qihoo/security/floatview/ui/g;

    return-object v0
.end method

.method private i()V
    .locals 2

    .prologue
    .line 277
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->d:Lcom/qihoo/security/floatview/ui/g;

    if-eqz v0, :cond_0

    .line 278
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/f;->v()Landroid/view/WindowManager;

    move-result-object v0

    .line 279
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/f;->d:Lcom/qihoo/security/floatview/ui/g;

    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V

    .line 280
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->d:Lcom/qihoo/security/floatview/ui/g;

    .line 282
    :cond_0
    return-void
.end method

.method private j()V
    .locals 4

    .prologue
    .line 328
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->d:Lcom/qihoo/security/floatview/ui/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->d:Lcom/qihoo/security/floatview/ui/g;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/g;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 329
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 330
    new-instance v1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 331
    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 332
    new-instance v1, Lcom/qihoo/security/floatview/ui/f$3;

    invoke-direct {v1, p0}, Lcom/qihoo/security/floatview/ui/f$3;-><init>(Lcom/qihoo/security/floatview/ui/f;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 346
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/f;->d:Lcom/qihoo/security/floatview/ui/g;

    invoke-virtual {v1}, Lcom/qihoo/security/floatview/ui/g;->getBackView()Landroid/view/View;

    move-result-object v1

    .line 347
    if-eqz v1, :cond_0

    .line 348
    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 351
    :cond_0
    return-void
.end method

.method private k()V
    .locals 2

    .prologue
    .line 378
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->e:Lcom/qihoo/security/floatview/ui/d;

    if-eqz v0, :cond_0

    .line 379
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/f;->v()Landroid/view/WindowManager;

    move-result-object v0

    .line 380
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/f;->e:Lcom/qihoo/security/floatview/ui/d;

    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V

    .line 381
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->e:Lcom/qihoo/security/floatview/ui/d;

    .line 383
    :cond_0
    return-void
.end method

.method private l()V
    .locals 4

    .prologue
    .line 389
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->a:Landroid/content/Context;

    .line 390
    const-string/jumbo v1, "skf_firsttip"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v1

    .line 391
    if-eqz v1, :cond_0

    .line 393
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/f;->f:Lcom/qihoo/security/floatview/ui/a;

    invoke-virtual {v1}, Lcom/qihoo/security/floatview/ui/a;->getWindowLayoutParams()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    .line 394
    iget v2, p0, Lcom/qihoo/security/floatview/ui/f;->n:I

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 395
    iget v2, p0, Lcom/qihoo/security/floatview/ui/f;->o:I

    div-int/lit8 v2, v2, 0x3

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 396
    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/f;->f:Lcom/qihoo/security/floatview/ui/a;

    invoke-virtual {v2, v1}, Lcom/qihoo/security/floatview/ui/a;->setWindowLayoutParams(Landroid/view/WindowManager$LayoutParams;)V

    .line 397
    iget v2, v1, Landroid/view/WindowManager$LayoutParams;->x:I

    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->y:I

    invoke-direct {p0, v2, v1}, Lcom/qihoo/security/floatview/ui/f;->c(II)Lcom/qihoo/security/floatview/ui/d;

    .line 398
    const-string/jumbo v1, "skf_firsttip"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 399
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->f:Lcom/qihoo/security/floatview/ui/a;

    new-instance v1, Lcom/qihoo/security/floatview/ui/f$4;

    invoke-direct {v1, p0}, Lcom/qihoo/security/floatview/ui/f$4;-><init>(Lcom/qihoo/security/floatview/ui/f;)V

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/floatview/ui/a;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 406
    :cond_0
    return-void
.end method

.method private m()V
    .locals 4

    .prologue
    .line 481
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->c:Lcom/qihoo/security/floatview/ui/e;

    if-eqz v0, :cond_0

    .line 482
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->i:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->i:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    .line 483
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->i:Landroid/widget/ImageView;

    const-string/jumbo v1, "alpha"

    const/4 v2, 0x2

    new-array v2, v2, [F

    fill-array-data v2, :array_0

    invoke-static {v0, v1, v2}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v0

    .line 484
    new-instance v1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/k;->a(Landroid/view/animation/Interpolator;)V

    .line 485
    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 486
    new-instance v1, Lcom/qihoo/security/floatview/ui/f$6;

    invoke-direct {v1, p0}, Lcom/qihoo/security/floatview/ui/f$6;-><init>(Lcom/qihoo/security/floatview/ui/f;)V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 493
    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->a()V

    .line 499
    :cond_0
    :goto_0
    return-void

    .line 495
    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/qihoo/security/floatview/ui/f;->b(Z)V

    goto :goto_0

    .line 483
    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method private n()Z
    .locals 8

    .prologue
    const/4 v0, 0x0

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    .line 520
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/f;->f:Lcom/qihoo/security/floatview/ui/a;

    if-nez v1, :cond_1

    .line 523
    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/f;->f:Lcom/qihoo/security/floatview/ui/a;

    invoke-virtual {v1}, Lcom/qihoo/security/floatview/ui/a;->getCurX()I

    move-result v1

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/f;->f:Lcom/qihoo/security/floatview/ui/a;

    invoke-virtual {v2}, Lcom/qihoo/security/floatview/ui/a;->getDownX()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-double v2, v1

    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/f;->f:Lcom/qihoo/security/floatview/ui/a;

    invoke-virtual {v1}, Lcom/qihoo/security/floatview/ui/a;->getCurY()I

    move-result v1

    iget-object v4, p0, Lcom/qihoo/security/floatview/ui/f;->f:Lcom/qihoo/security/floatview/ui/a;

    invoke-virtual {v4}, Lcom/qihoo/security/floatview/ui/a;->getDownY()I

    move-result v4

    sub-int/2addr v1, v4

    int-to-double v4, v1

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v4

    add-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    cmpl-double v1, v2, v4

    if-ltz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method private o()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 553
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/f;->d()Landroid/content/Context;

    move-result-object v0

    .line 554
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 555
    const v2, 0x7f090067

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    iput v2, p0, Lcom/qihoo/security/floatview/ui/f;->k:I

    .line 556
    const v2, 0x7f090068

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    iput v2, p0, Lcom/qihoo/security/floatview/ui/f;->l:I

    .line 557
    new-instance v2, Lcom/qihoo/security/floatview/ui/h;

    invoke-direct {v2, v0}, Lcom/qihoo/security/floatview/ui/h;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/qihoo/security/floatview/ui/f;->h:Lcom/qihoo/security/floatview/ui/h;

    .line 558
    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/f;->h:Lcom/qihoo/security/floatview/ui/h;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Lcom/qihoo/security/floatview/ui/h;->setVisibility(I)V

    .line 560
    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/f;->h:Lcom/qihoo/security/floatview/ui/h;

    const v3, 0x7f0200fb

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/qihoo/security/floatview/ui/h;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 561
    new-instance v1, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v1}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 562
    const/16 v2, 0x428

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 564
    const/16 v2, 0x7d2

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 565
    const/4 v2, 0x1

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 566
    const/16 v2, 0x33

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 567
    iput v4, v1, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 568
    iput v4, v1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 569
    iget v2, p0, Lcom/qihoo/security/floatview/ui/f;->n:I

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 570
    iget v2, p0, Lcom/qihoo/security/floatview/ui/f;->o:I

    invoke-direct {p0, v0}, Lcom/qihoo/security/floatview/ui/f;->a(Landroid/content/Context;)I

    move-result v0

    sub-int v0, v2, v0

    iput v0, v1, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 571
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/f;->v()Landroid/view/WindowManager;

    move-result-object v0

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/f;->h:Lcom/qihoo/security/floatview/ui/h;

    invoke-interface {v0, v2, v1}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 572
    return-void
.end method

.method private p()Z
    .locals 5

    .prologue
    .line 577
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->f:Lcom/qihoo/security/floatview/ui/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->f:Lcom/qihoo/security/floatview/ui/a;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/a;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 578
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/f;->r()Landroid/graphics/Rect;

    move-result-object v0

    .line 579
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/f;->f:Lcom/qihoo/security/floatview/ui/a;

    invoke-virtual {v1}, Lcom/qihoo/security/floatview/ui/a;->getWindowLayoutParams()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    .line 580
    iget v2, v1, Landroid/view/WindowManager$LayoutParams;->y:I

    iget v3, p0, Lcom/qihoo/security/floatview/ui/f;->l:I

    add-int/2addr v2, v3

    .line 581
    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 582
    iget v3, p0, Lcom/qihoo/security/floatview/ui/f;->k:I

    add-int/2addr v3, v1

    .line 583
    iget v4, v0, Landroid/graphics/Rect;->top:I

    if-le v2, v4, :cond_0

    iget v2, v0, Landroid/graphics/Rect;->left:I

    if-le v3, v2, :cond_0

    iget v0, v0, Landroid/graphics/Rect;->right:I

    if-ge v1, v0, :cond_0

    .line 584
    const/4 v0, 0x1

    .line 587
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private q()V
    .locals 5

    .prologue
    .line 594
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->f:Lcom/qihoo/security/floatview/ui/a;

    if-eqz v0, :cond_0

    .line 595
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->f:Lcom/qihoo/security/floatview/ui/a;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/a;->getWindowLayoutParams()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    .line 596
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/f;->h:Lcom/qihoo/security/floatview/ui/h;

    invoke-virtual {v1}, Lcom/qihoo/security/floatview/ui/h;->getDrawableHeight()I

    move-result v1

    neg-int v1, v1

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/f;->f:Lcom/qihoo/security/floatview/ui/a;

    invoke-virtual {v2}, Lcom/qihoo/security/floatview/ui/a;->getMeasuredHeight()I

    move-result v2

    add-int/2addr v1, v2

    .line 597
    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/f;->h:Lcom/qihoo/security/floatview/ui/h;

    invoke-virtual {v2}, Lcom/qihoo/security/floatview/ui/h;->getDrawableWidth()I

    move-result v2

    neg-int v2, v2

    iget-object v3, p0, Lcom/qihoo/security/floatview/ui/f;->f:Lcom/qihoo/security/floatview/ui/a;

    invoke-virtual {v3}, Lcom/qihoo/security/floatview/ui/a;->getMeasuredWidth()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    shr-int/2addr v2, v3

    shr-int/lit8 v2, v2, 0x1

    .line 598
    iget-object v3, p0, Lcom/qihoo/security/floatview/ui/f;->c:Lcom/qihoo/security/floatview/ui/e;

    invoke-virtual {v3}, Lcom/qihoo/security/floatview/ui/e;->getMeasuredHeight()I

    move-result v3

    iget-object v4, p0, Lcom/qihoo/security/floatview/ui/f;->h:Lcom/qihoo/security/floatview/ui/h;

    invoke-virtual {v4}, Lcom/qihoo/security/floatview/ui/h;->getDrawableHeight()I

    move-result v4

    sub-int/2addr v3, v4

    .line 599
    iget v4, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    add-int/2addr v1, v4

    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 600
    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    add-int/2addr v0, v2

    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/floatview/ui/f;->d(II)V

    .line 601
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->h:Lcom/qihoo/security/floatview/ui/h;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/qihoo/security/floatview/ui/h;->setVisibility(I)V

    .line 602
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/f;->t()V

    .line 604
    :cond_0
    return-void
.end method

.method private r()Landroid/graphics/Rect;
    .locals 5

    .prologue
    .line 610
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->p:Landroid/graphics/Rect;

    if-nez v0, :cond_0

    .line 611
    iget v0, p0, Lcom/qihoo/security/floatview/ui/f;->n:I

    .line 612
    iget v1, p0, Lcom/qihoo/security/floatview/ui/f;->o:I

    .line 613
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/f;->d()Landroid/content/Context;

    move-result-object v2

    .line 614
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 615
    const v3, 0x7f090069

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    .line 616
    const v4, 0x7f09006a

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    .line 617
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    iput-object v4, p0, Lcom/qihoo/security/floatview/ui/f;->p:Landroid/graphics/Rect;

    .line 618
    iget-object v4, p0, Lcom/qihoo/security/floatview/ui/f;->p:Landroid/graphics/Rect;

    sub-int v2, v1, v2

    iput v2, v4, Landroid/graphics/Rect;->top:I

    .line 619
    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/f;->p:Landroid/graphics/Rect;

    iput v1, v2, Landroid/graphics/Rect;->bottom:I

    .line 620
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/f;->p:Landroid/graphics/Rect;

    sub-int/2addr v0, v3

    div-int/lit8 v0, v0, 0x2

    iput v0, v1, Landroid/graphics/Rect;->left:I

    .line 621
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->p:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/f;->p:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, v3

    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 623
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->p:Landroid/graphics/Rect;

    return-object v0
.end method

.method private s()V
    .locals 3

    .prologue
    .line 627
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->b:Landroid/os/Vibrator;

    if-nez v0, :cond_0

    .line 628
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/f;->d()Landroid/content/Context;

    move-result-object v0

    .line 629
    const-string/jumbo v1, "vibrator"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Vibrator;

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->b:Landroid/os/Vibrator;

    .line 631
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->b:Landroid/os/Vibrator;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/qihoo/security/floatview/ui/f;->r:Z

    if-nez v0, :cond_1

    .line 632
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/floatview/ui/f;->r:Z

    .line 633
    const/4 v0, 0x2

    new-array v0, v0, [J

    fill-array-data v0, :array_0

    .line 634
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/f;->b:Landroid/os/Vibrator;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/os/Vibrator;->vibrate([JI)V

    .line 636
    :cond_1
    return-void

    .line 633
    nop

    :array_0
    .array-data 8
        0xc8
        0x1388
    .end array-data
.end method

.method private t()V
    .locals 1

    .prologue
    .line 639
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/floatview/ui/f;->r:Z

    .line 640
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->b:Landroid/os/Vibrator;

    if-eqz v0, :cond_0

    .line 641
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->b:Landroid/os/Vibrator;

    invoke-virtual {v0}, Landroid/os/Vibrator;->cancel()V

    .line 643
    :cond_0
    return-void
.end method

.method private u()V
    .locals 2

    .prologue
    .line 705
    iget-boolean v0, p0, Lcom/qihoo/security/floatview/ui/f;->s:Z

    if-eqz v0, :cond_0

    .line 745
    :goto_0
    return-void

    .line 708
    :cond_0
    new-instance v0, Lcom/qihoo/security/opti/a/b;

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/f;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/opti/a/b;-><init>(Landroid/content/Context;)V

    .line 709
    new-instance v1, Lcom/qihoo/security/floatview/ui/f$8;

    invoke-direct {v1, p0}, Lcom/qihoo/security/floatview/ui/f$8;-><init>(Lcom/qihoo/security/floatview/ui/f;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/a/b;->a(Lcom/qihoo/security/opti/a/b$a;)V

    .line 744
    invoke-virtual {v0}, Lcom/qihoo/security/opti/a/b;->b()V

    goto :goto_0
.end method

.method private v()Landroid/view/WindowManager;
    .locals 2

    .prologue
    .line 748
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->j:Landroid/view/WindowManager;

    if-nez v0, :cond_0

    .line 749
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/f;->d()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->j:Landroid/view/WindowManager;

    .line 751
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->j:Landroid/view/WindowManager;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 192
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/qihoo/security/floatview/ui/f;->a(Z)V

    .line 193
    return-void
.end method

.method public a(I)V
    .locals 1

    .prologue
    .line 197
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 198
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/f;->f()V

    .line 200
    :cond_0
    return-void
.end method

.method public a(II)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 104
    iget-boolean v0, p0, Lcom/qihoo/security/floatview/ui/f;->u:Z

    if-eqz v0, :cond_1

    .line 105
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/f;->n()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 106
    iget-boolean v0, p0, Lcom/qihoo/security/floatview/ui/f;->q:Z

    if-nez v0, :cond_0

    .line 107
    iput-boolean v2, p0, Lcom/qihoo/security/floatview/ui/f;->q:Z

    .line 108
    invoke-direct {p0, v2}, Lcom/qihoo/security/floatview/ui/f;->b(Z)V

    .line 109
    invoke-direct {p0, v2}, Lcom/qihoo/security/floatview/ui/f;->e(Z)V

    .line 111
    :cond_0
    iget-boolean v0, p0, Lcom/qihoo/security/floatview/ui/f;->q:Z

    if-eqz v0, :cond_1

    .line 112
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/f;->p()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 113
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/f;->s()V

    .line 114
    invoke-direct {p0, v1}, Lcom/qihoo/security/floatview/ui/f;->c(Z)V

    .line 118
    :goto_0
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/floatview/ui/f;->b(II)V

    .line 127
    :cond_1
    :goto_1
    return-void

    .line 116
    :cond_2
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/f;->t()V

    goto :goto_0

    .line 121
    :cond_3
    iput-boolean v1, p0, Lcom/qihoo/security/floatview/ui/f;->q:Z

    .line 122
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/f;->t()V

    .line 123
    invoke-direct {p0, v1}, Lcom/qihoo/security/floatview/ui/f;->e(Z)V

    .line 124
    invoke-direct {p0, v1}, Lcom/qihoo/security/floatview/ui/f;->b(Z)V

    goto :goto_1
.end method

.method public a(IIZ)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 134
    .line 135
    iget-boolean v2, p0, Lcom/qihoo/security/floatview/ui/f;->u:Z

    if-eqz v2, :cond_1

    .line 136
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/f;->t()V

    .line 137
    if-nez p3, :cond_0

    iget-boolean v2, p0, Lcom/qihoo/security/floatview/ui/f;->q:Z

    if-eqz v2, :cond_0

    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/f;->p()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 138
    invoke-direct {p0, v0}, Lcom/qihoo/security/floatview/ui/f;->e(Z)V

    .line 139
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/f;->q()V

    .line 146
    :goto_0
    iput-boolean v1, p0, Lcom/qihoo/security/floatview/ui/f;->q:Z

    .line 148
    :goto_1
    return v0

    .line 142
    :cond_0
    invoke-direct {p0, v1}, Lcom/qihoo/security/floatview/ui/f;->e(Z)V

    .line 143
    invoke-direct {p0, v1}, Lcom/qihoo/security/floatview/ui/f;->b(Z)V

    move v0, v1

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_1
.end method

.method public b()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 153
    iput-boolean v3, p0, Lcom/qihoo/security/floatview/ui/f;->s:Z

    .line 156
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->f:Lcom/qihoo/security/floatview/ui/a;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/a;->getWindowLayoutParams()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    .line 157
    if-eqz v0, :cond_1

    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    if-ltz v1, :cond_0

    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    iget v2, p0, Lcom/qihoo/security/floatview/ui/f;->n:I

    if-ge v1, v2, :cond_0

    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    if-ltz v1, :cond_0

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    iget v1, p0, Lcom/qihoo/security/floatview/ui/f;->o:I

    if-lt v0, v1, :cond_1

    .line 158
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->f:Lcom/qihoo/security/floatview/ui/a;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/a;->l()V

    .line 162
    :cond_1
    iget-boolean v0, p0, Lcom/qihoo/security/floatview/ui/f;->u:Z

    if-nez v0, :cond_3

    .line 163
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->f:Lcom/qihoo/security/floatview/ui/a;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/a;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 164
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->v:Landroid/os/Handler;

    new-instance v1, Lcom/qihoo/security/floatview/ui/f$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/floatview/ui/f$1;-><init>(Lcom/qihoo/security/floatview/ui/f;)V

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 179
    :cond_2
    :goto_0
    return-void

    .line 172
    :cond_3
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/f;->l()V

    .line 175
    invoke-direct {p0, v3}, Lcom/qihoo/security/floatview/ui/f;->e(Z)V

    .line 177
    invoke-direct {p0, v3}, Lcom/qihoo/security/floatview/ui/f;->b(Z)V

    goto :goto_0
.end method

.method public b(I)V
    .locals 1

    .prologue
    .line 204
    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    .line 205
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/f;->e()V

    .line 211
    :cond_0
    :goto_0
    return-void

    .line 206
    :cond_1
    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    .line 207
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->c:Lcom/qihoo/security/floatview/ui/e;

    if-eqz v0, :cond_0

    .line 208
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->c:Lcom/qihoo/security/floatview/ui/e;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/e;->b()V

    goto :goto_0
.end method

.method public c()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 183
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/floatview/ui/f;->s:Z

    .line 184
    invoke-direct {p0, v1}, Lcom/qihoo/security/floatview/ui/f;->a(Z)V

    .line 185
    invoke-direct {p0, v1}, Lcom/qihoo/security/floatview/ui/f;->e(Z)V

    .line 186
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/f;->t()V

    .line 187
    invoke-direct {p0, v1}, Lcom/qihoo/security/floatview/ui/f;->b(Z)V

    .line 188
    return-void
.end method

.method public c(I)V
    .locals 0

    .prologue
    .line 215
    return-void
.end method

.method public d()Landroid/content/Context;
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->a:Landroid/content/Context;

    return-object v0
.end method

.method public e()V
    .locals 2

    .prologue
    .line 650
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/f;->m()V

    .line 653
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->f:Lcom/qihoo/security/floatview/ui/a;

    if-eqz v0, :cond_0

    .line 654
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/f;->f:Lcom/qihoo/security/floatview/ui/a;

    iget-boolean v0, p0, Lcom/qihoo/security/floatview/ui/f;->s:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v1, v0}, Lcom/qihoo/security/floatview/ui/a;->b(Z)V

    .line 657
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->v:Landroid/os/Handler;

    new-instance v1, Lcom/qihoo/security/floatview/ui/f$7;

    invoke-direct {v1, p0}, Lcom/qihoo/security/floatview/ui/f$7;-><init>(Lcom/qihoo/security/floatview/ui/f;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 669
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->t:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 670
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->t:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/qihoo/security/floatview/ui/f;->a(Ljava/lang/String;)V

    .line 671
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->t:Ljava/lang/String;

    .line 673
    :cond_1
    return-void

    .line 654
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public f()V
    .locals 2

    .prologue
    .line 680
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/qihoo/security/floatview/ui/f;->d(Z)V

    .line 683
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->a:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 684
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f08003f

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    .line 685
    invoke-direct {p0, v0}, Lcom/qihoo/security/floatview/ui/f;->d(I)V

    .line 689
    :cond_0
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/f;->u()V

    .line 690
    return-void
.end method
