.class public Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static final ROCKET_ANIMATION_ID_FIRE:I = 0x2

.field public static final ROCKET_ANIMATION_ID_LAUNCH_1:I = 0x3

.field public static final ROCKET_ANIMATION_ID_LAUNCH_2:I = 0x4

.field public static final ROCKET_ANIMATION_ID_VIBRATE:I = 0x1

.field private static q:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

.field private static r:Z


# instance fields
.field a:Lcom/nineoldandroids/a/c;

.field b:Landroid/view/View;

.field private c:F

.field private d:F

.field private e:F

.field private f:Lcom/nineoldandroids/a/k;

.field private g:Landroid/graphics/drawable/BitmapDrawable;

.field private h:Landroid/graphics/drawable/BitmapDrawable;

.field private i:Landroid/content/Context;

.field private j:Lcom/nineoldandroids/a/o$b;

.field private k:Lcom/qihoo/security/ui/opti/sysclear/rocket/a;

.field private l:Landroid/graphics/Rect;

.field private m:Landroid/graphics/Rect;

.field private n:Z

.field private o:Landroid/graphics/Rect;

.field private p:Z

.field private s:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 79
    const/4 v0, 0x0

    sput-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->q:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    .line 81
    const/4 v0, 0x0

    sput-boolean v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->r:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->c:F

    .line 40
    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->d:F

    .line 43
    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->e:F

    .line 46
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->f:Lcom/nineoldandroids/a/k;

    .line 49
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->g:Landroid/graphics/drawable/BitmapDrawable;

    .line 52
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->h:Landroid/graphics/drawable/BitmapDrawable;

    .line 54
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->i:Landroid/content/Context;

    .line 57
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->j:Lcom/nineoldandroids/a/o$b;

    .line 60
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->k:Lcom/qihoo/security/ui/opti/sysclear/rocket/a;

    .line 63
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->l:Landroid/graphics/Rect;

    .line 66
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->m:Landroid/graphics/Rect;

    .line 69
    iput-boolean v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->n:Z

    .line 72
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->o:Landroid/graphics/Rect;

    .line 75
    iput-boolean v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->p:Z

    .line 77
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->a:Lcom/nineoldandroids/a/c;

    .line 85
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->i:Landroid/content/Context;

    .line 86
    iput-boolean p2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->p:Z

    .line 87
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->a()V

    .line 88
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;)Lcom/nineoldandroids/a/k;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->f:Lcom/nineoldandroids/a/k;

    return-object v0
.end method

.method private a()V
    .locals 6

    .prologue
    const/high16 v4, 0x42700000    # 60.0f

    const/4 v5, 0x0

    .line 146
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->i:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 147
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->s:F

    .line 148
    iget-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->p:Z

    if-eqz v0, :cond_0

    .line 149
    const v0, 0x7f0200fb

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->g:Landroid/graphics/drawable/BitmapDrawable;

    .line 150
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->g:Landroid/graphics/drawable/BitmapDrawable;

    const/high16 v2, 0x42180000    # 38.0f

    iget v3, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->s:F

    mul-float/2addr v2, v3

    float-to-int v2, v2

    const/high16 v3, 0x42d00000    # 104.0f

    iget v4, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->s:F

    mul-float/2addr v3, v4

    float-to-int v3, v3

    invoke-virtual {v0, v5, v5, v2, v3}, Landroid/graphics/drawable/BitmapDrawable;->setBounds(IIII)V

    .line 155
    :goto_0
    const v0, 0x7f02013e

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->h:Landroid/graphics/drawable/BitmapDrawable;

    .line 156
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->h:Landroid/graphics/drawable/BitmapDrawable;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->h:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/BitmapDrawable;->getIntrinsicWidth()I

    move-result v1

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->h:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v2}, Landroid/graphics/drawable/BitmapDrawable;->getIntrinsicHeight()I

    move-result v2

    invoke-virtual {v0, v5, v5, v1, v2}, Landroid/graphics/drawable/BitmapDrawable;->setBounds(IIII)V

    .line 158
    return-void

    .line 152
    :cond_0
    const v0, 0x7f02004f

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->g:Landroid/graphics/drawable/BitmapDrawable;

    .line 153
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->g:Landroid/graphics/drawable/BitmapDrawable;

    iget v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->s:F

    mul-float/2addr v2, v4

    float-to-int v2, v2

    iget v3, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->s:F

    mul-float/2addr v3, v4

    float-to-int v3, v3

    invoke-virtual {v0, v5, v5, v2, v3}, Landroid/graphics/drawable/BitmapDrawable;->setBounds(IIII)V

    goto :goto_0
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 433
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 434
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->g:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 435
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->h:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/BitmapDrawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    .line 436
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v1

    sub-int v1, v2, v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    .line 437
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v0, v0

    const/high16 v2, 0x41c80000    # 25.0f

    iget v3, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->s:F

    mul-float/2addr v2, v3

    sub-float/2addr v0, v2

    .line 439
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 440
    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 442
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->l:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->h:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/BitmapDrawable;->getIntrinsicHeight()I

    move-result v1

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 443
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->l:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->l:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    int-to-float v1, v1

    iget v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->e:F

    sub-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, v0, Landroid/graphics/Rect;->top:I

    .line 444
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->l:Landroid/graphics/Rect;

    iput v4, v0, Landroid/graphics/Rect;->left:I

    .line 445
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->l:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->h:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/BitmapDrawable;->getIntrinsicWidth()I

    move-result v1

    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 447
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->m:Landroid/graphics/Rect;

    iput v4, v0, Landroid/graphics/Rect;->top:I

    .line 448
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->m:Landroid/graphics/Rect;

    iput v4, v0, Landroid/graphics/Rect;->left:I

    .line 449
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->m:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->m:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->top:I

    int-to-float v1, v1

    iget v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->e:F

    add-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 450
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->m:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->m:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->l:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v2

    add-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 452
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->h:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->l:Landroid/graphics/Rect;

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->m:Landroid/graphics/Rect;

    const/4 v3, 0x0

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 453
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 455
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;Z)Z
    .locals 0

    .prologue
    .line 30
    iput-boolean p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->n:Z

    return p1
.end method

.method private b()Lcom/nineoldandroids/a/a$a;
    .locals 1

    .prologue
    .line 274
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket$1;-><init>(Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;)V

    return-object v0
.end method

.method private c()Lcom/nineoldandroids/a/a$a;
    .locals 1

    .prologue
    .line 314
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket$2;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket$2;-><init>(Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;)V

    return-object v0
.end method

.method private d()Lcom/nineoldandroids/a/a$a;
    .locals 1

    .prologue
    .line 359
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket$3;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket$3;-><init>(Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;)V

    return-object v0
.end method

.method public static destroy()V
    .locals 1

    .prologue
    .line 535
    sget-boolean v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->r:Z

    if-eqz v0, :cond_0

    .line 536
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->q:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->destroySelf()V

    .line 537
    const/4 v0, 0x0

    sput-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->q:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    .line 538
    const/4 v0, 0x0

    sput-boolean v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->r:Z

    .line 540
    :cond_0
    return-void
.end method

.method public static draw(Landroid/graphics/Canvas;)V
    .locals 1

    .prologue
    .line 510
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->q:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    if-eqz v0, :cond_0

    .line 511
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->q:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->drawSeft(Landroid/graphics/Canvas;)V

    .line 513
    :cond_0
    return-void
.end method

.method private e()Lcom/nineoldandroids/a/a$a;
    .locals 1

    .prologue
    .line 398
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket$4;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket$4;-><init>(Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;)V

    return-object v0
.end method

.method private f()Z
    .locals 1

    .prologue
    .line 477
    const/4 v0, 0x1

    return v0
.end method

.method private g()Z
    .locals 1

    .prologue
    .line 481
    const/4 v0, 0x1

    return v0
.end method

.method public static getRocketWidth()I
    .locals 2

    .prologue
    .line 543
    const/4 v0, 0x0

    .line 544
    sget-object v1, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->q:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    if-eqz v1, :cond_0

    sget-object v1, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->q:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    iget-object v1, v1, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->g:Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v1, :cond_0

    .line 545
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->q:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->g:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    .line 547
    :cond_0
    return v0
.end method

.method public static init(Landroid/content/Context;ZLandroid/graphics/Rect;Lcom/nineoldandroids/a/o$b;Lcom/qihoo/security/ui/opti/sysclear/rocket/a;)V
    .locals 1

    .prologue
    .line 486
    sget-boolean v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->r:Z

    if-nez v0, :cond_0

    .line 487
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    invoke-direct {v0, p0, p1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;-><init>(Landroid/content/Context;Z)V

    sput-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->q:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    .line 488
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->q:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    if-eqz v0, :cond_0

    .line 489
    const/4 v0, 0x1

    sput-boolean v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->r:Z

    .line 490
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->q:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    invoke-virtual {v0, p2}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->setBounds(Landroid/graphics/Rect;)V

    .line 491
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->q:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    invoke-virtual {v0, p3}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->setAnimatorUpdateListener(Lcom/nineoldandroids/a/o$b;)V

    .line 492
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->q:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    invoke-virtual {v0, p4}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->setRocketAnimationListener(Lcom/qihoo/security/ui/opti/sysclear/rocket/a;)V

    .line 495
    :cond_0
    return-void
.end method

.method public static launch(FFZLandroid/view/View;)V
    .locals 1

    .prologue
    .line 498
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->q:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    if-eqz v0, :cond_0

    .line 499
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->q:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->setX(F)V

    .line 500
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->q:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->setY(F)V

    .line 501
    if-eqz p2, :cond_1

    .line 502
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->q:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->fireFloatIcon()V

    .line 507
    :cond_0
    :goto_0
    return-void

    .line 504
    :cond_1
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->q:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    invoke-virtual {v0, p3}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->fireRocket(Landroid/view/View;)V

    goto :goto_0
.end method


# virtual methods
.method public destroySelf()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 516
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->a:Lcom/nineoldandroids/a/c;

    if-eqz v0, :cond_0

    .line 517
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->a:Lcom/nineoldandroids/a/c;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/c;->b()V

    .line 518
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->a:Lcom/nineoldandroids/a/c;

    .line 520
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->f:Lcom/nineoldandroids/a/k;

    if-eqz v0, :cond_1

    .line 521
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->f:Lcom/nineoldandroids/a/k;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->b()V

    .line 522
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->f:Lcom/nineoldandroids/a/k;

    .line 524
    :cond_1
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->g:Landroid/graphics/drawable/BitmapDrawable;

    .line 525
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->h:Landroid/graphics/drawable/BitmapDrawable;

    .line 526
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->i:Landroid/content/Context;

    .line 527
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->j:Lcom/nineoldandroids/a/o$b;

    .line 528
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->k:Lcom/qihoo/security/ui/opti/sysclear/rocket/a;

    .line 529
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->l:Landroid/graphics/Rect;

    .line 530
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->m:Landroid/graphics/Rect;

    .line 531
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->o:Landroid/graphics/Rect;

    .line 532
    return-void
.end method

.method public drawSeft(Landroid/graphics/Canvas;)V
    .locals 2

    .prologue
    .line 461
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->g:Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->h:Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_2

    .line 462
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 463
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->c:F

    iget v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->d:F

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 464
    iget-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->n:Z

    if-eqz v0, :cond_0

    .line 465
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->a(Landroid/graphics/Canvas;)V

    .line 468
    :cond_0
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 469
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->g:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/BitmapDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 472
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 474
    :cond_2
    return-void
.end method

.method public fireFloatIcon()V
    .locals 9

    .prologue
    .line 165
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 166
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 167
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    .line 170
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->g:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/BitmapDrawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    .line 171
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 172
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    .line 175
    iget v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->c:F

    .line 176
    iget v3, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->d:F

    .line 182
    iget-object v4, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->h:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v4}, Landroid/graphics/drawable/BitmapDrawable;->getIntrinsicHeight()I

    move-result v4

    int-to-float v4, v4

    .line 184
    mul-int/lit8 v0, v0, 0x4

    div-int/lit8 v0, v0, 0xb

    int-to-float v0, v0

    .line 185
    new-instance v5, Lcom/nineoldandroids/a/c;

    invoke-direct {v5}, Lcom/nineoldandroids/a/c;-><init>()V

    iput-object v5, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->a:Lcom/nineoldandroids/a/c;

    .line 188
    const-string/jumbo v5, "x"

    const/4 v6, 0x2

    new-array v6, v6, [F

    const/4 v7, 0x0

    const/high16 v8, 0x40400000    # 3.0f

    sub-float v8, v2, v8

    aput v8, v6, v7

    const/4 v7, 0x1

    const/high16 v8, 0x40c00000    # 6.0f

    add-float/2addr v2, v8

    aput v2, v6, v7

    invoke-static {v5, v6}, Lcom/nineoldandroids/a/m;->a(Ljava/lang/String;[F)Lcom/nineoldandroids/a/m;

    move-result-object v2

    .line 189
    const/4 v5, 0x1

    new-array v5, v5, [Lcom/nineoldandroids/a/m;

    const/4 v6, 0x0

    aput-object v2, v5, v6

    invoke-static {p0, v5}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;[Lcom/nineoldandroids/a/m;)Lcom/nineoldandroids/a/k;

    move-result-object v2

    const-wide/16 v6, 0xc8

    invoke-virtual {v2, v6, v7}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    move-result-object v2

    iput-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->f:Lcom/nineoldandroids/a/k;

    .line 190
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->f:Lcom/nineoldandroids/a/k;

    new-instance v5, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v5}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v2, v5}, Lcom/nineoldandroids/a/k;->a(Landroid/view/animation/Interpolator;)V

    .line 191
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->f:Lcom/nineoldandroids/a/k;

    const/4 v5, 0x2

    invoke-virtual {v2, v5}, Lcom/nineoldandroids/a/k;->b(I)V

    .line 192
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->f:Lcom/nineoldandroids/a/k;

    const/4 v5, -0x1

    invoke-virtual {v2, v5}, Lcom/nineoldandroids/a/k;->a(I)V

    .line 193
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->f:Lcom/nineoldandroids/a/k;

    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->getAnimatorUpdateListener()Lcom/nineoldandroids/a/o$b;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/o$b;)V

    .line 194
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->f:Lcom/nineoldandroids/a/k;

    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->e()Lcom/nineoldandroids/a/a$a;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 195
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->a:Lcom/nineoldandroids/a/c;

    iget-object v5, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->f:Lcom/nineoldandroids/a/k;

    invoke-virtual {v2, v5}, Lcom/nineoldandroids/a/c;->a(Lcom/nineoldandroids/a/a;)Lcom/nineoldandroids/a/c$b;

    .line 198
    const-string/jumbo v2, "JetSmokeOffset"

    const/4 v5, 0x2

    new-array v5, v5, [F

    const/4 v6, 0x0

    const/4 v7, 0x0

    aput v7, v5, v6

    const/4 v6, 0x1

    aput v4, v5, v6

    invoke-static {v2, v5}, Lcom/nineoldandroids/a/m;->a(Ljava/lang/String;[F)Lcom/nineoldandroids/a/m;

    move-result-object v2

    .line 199
    const/4 v5, 0x1

    new-array v5, v5, [Lcom/nineoldandroids/a/m;

    const/4 v6, 0x0

    aput-object v2, v5, v6

    invoke-static {p0, v5}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;[Lcom/nineoldandroids/a/m;)Lcom/nineoldandroids/a/k;

    move-result-object v2

    const-wide/16 v6, 0x12c

    invoke-virtual {v2, v6, v7}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    move-result-object v2

    .line 200
    new-instance v5, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v5}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v2, v5}, Lcom/nineoldandroids/a/k;->a(Landroid/view/animation/Interpolator;)V

    .line 201
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->getAnimatorUpdateListener()Lcom/nineoldandroids/a/o$b;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/o$b;)V

    .line 202
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->d()Lcom/nineoldandroids/a/a$a;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 203
    iget-object v5, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->a:Lcom/nineoldandroids/a/c;

    invoke-virtual {v5, v2}, Lcom/nineoldandroids/a/c;->a(Lcom/nineoldandroids/a/a;)Lcom/nineoldandroids/a/c$b;

    move-result-object v5

    const-wide/16 v6, 0xc8

    invoke-virtual {v5, v6, v7}, Lcom/nineoldandroids/a/c$b;->a(J)Lcom/nineoldandroids/a/c$b;

    .line 206
    const-string/jumbo v5, "y"

    const/4 v6, 0x2

    new-array v6, v6, [F

    const/4 v7, 0x0

    aput v3, v6, v7

    const/4 v3, 0x1

    aput v0, v6, v3

    invoke-static {v5, v6}, Lcom/nineoldandroids/a/m;->a(Ljava/lang/String;[F)Lcom/nineoldandroids/a/m;

    move-result-object v3

    .line 208
    const/4 v5, 0x1

    new-array v5, v5, [Lcom/nineoldandroids/a/m;

    const/4 v6, 0x0

    aput-object v3, v5, v6

    invoke-static {p0, v5}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;[Lcom/nineoldandroids/a/m;)Lcom/nineoldandroids/a/k;

    move-result-object v3

    const-wide/16 v6, 0x12c

    invoke-virtual {v3, v6, v7}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    move-result-object v3

    .line 209
    new-instance v5, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v5}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v3, v5}, Lcom/nineoldandroids/a/k;->a(Landroid/view/animation/Interpolator;)V

    .line 210
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->getAnimatorUpdateListener()Lcom/nineoldandroids/a/o$b;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/o$b;)V

    .line 211
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->b()Lcom/nineoldandroids/a/a$a;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 212
    iget-object v5, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->a:Lcom/nineoldandroids/a/c;

    invoke-virtual {v5, v3}, Lcom/nineoldandroids/a/c;->a(Lcom/nineoldandroids/a/a;)Lcom/nineoldandroids/a/c$b;

    move-result-object v5

    const-wide/16 v6, 0x3e8

    invoke-virtual {v5, v6, v7}, Lcom/nineoldandroids/a/c$b;->a(J)Lcom/nineoldandroids/a/c$b;

    move-result-object v5

    invoke-virtual {v5, v2}, Lcom/nineoldandroids/a/c$b;->b(Lcom/nineoldandroids/a/a;)Lcom/nineoldandroids/a/c$b;

    .line 215
    const-string/jumbo v2, "y"

    const/4 v5, 0x2

    new-array v5, v5, [F

    const/4 v6, 0x0

    aput v0, v5, v6

    const/4 v0, 0x1

    int-to-float v1, v1

    add-float/2addr v1, v4

    neg-float v1, v1

    aput v1, v5, v0

    invoke-static {v2, v5}, Lcom/nineoldandroids/a/m;->a(Ljava/lang/String;[F)Lcom/nineoldandroids/a/m;

    move-result-object v0

    .line 216
    const/4 v1, 0x1

    new-array v1, v1, [Lcom/nineoldandroids/a/m;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-static {p0, v1}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;[Lcom/nineoldandroids/a/m;)Lcom/nineoldandroids/a/k;

    move-result-object v0

    const-wide/16 v4, 0x12c

    invoke-virtual {v0, v4, v5}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    move-result-object v0

    .line 217
    new-instance v1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/k;->a(Landroid/view/animation/Interpolator;)V

    .line 218
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->getAnimatorUpdateListener()Lcom/nineoldandroids/a/o$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/o$b;)V

    .line 219
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->c()Lcom/nineoldandroids/a/a$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 221
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->a:Lcom/nineoldandroids/a/c;

    invoke-virtual {v1, v0}, Lcom/nineoldandroids/a/c;->a(Lcom/nineoldandroids/a/a;)Lcom/nineoldandroids/a/c$b;

    move-result-object v0

    const-wide/16 v4, 0x0

    invoke-virtual {v0, v4, v5}, Lcom/nineoldandroids/a/c$b;->a(J)Lcom/nineoldandroids/a/c$b;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/nineoldandroids/a/c$b;->b(Lcom/nineoldandroids/a/a;)Lcom/nineoldandroids/a/c$b;

    .line 223
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->a:Lcom/nineoldandroids/a/c;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/c;->a()V

    .line 224
    return-void
.end method

.method public fireRocket(Landroid/view/View;)V
    .locals 9

    .prologue
    const/4 v8, 0x2

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 230
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 231
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->b:Landroid/view/View;

    .line 232
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    .line 235
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->g:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/BitmapDrawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    .line 236
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v2

    .line 239
    iget v3, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->d:F

    .line 244
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->h:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/BitmapDrawable;->getIntrinsicHeight()I

    move-result v1

    int-to-float v4, v1

    .line 246
    mul-int/lit8 v0, v0, 0x4

    div-int/lit8 v0, v0, 0xb

    int-to-float v0, v0

    .line 247
    new-instance v0, Lcom/nineoldandroids/a/c;

    invoke-direct {v0}, Lcom/nineoldandroids/a/c;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->a:Lcom/nineoldandroids/a/c;

    .line 250
    const-string/jumbo v0, "JetSmokeOffset"

    new-array v1, v8, [F

    const/4 v5, 0x0

    aput v5, v1, v6

    aput v4, v1, v7

    invoke-static {v0, v1}, Lcom/nineoldandroids/a/m;->a(Ljava/lang/String;[F)Lcom/nineoldandroids/a/m;

    move-result-object v0

    .line 251
    new-array v1, v7, [Lcom/nineoldandroids/a/m;

    aput-object v0, v1, v6

    invoke-static {p0, v1}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;[Lcom/nineoldandroids/a/m;)Lcom/nineoldandroids/a/k;

    move-result-object v5

    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->i:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/app/a;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x12c

    :goto_0
    invoke-virtual {v5, v0, v1}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    move-result-object v5

    .line 253
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v5, v0}, Lcom/nineoldandroids/a/k;->a(Landroid/view/animation/Interpolator;)V

    .line 254
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->getAnimatorUpdateListener()Lcom/nineoldandroids/a/o$b;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/o$b;)V

    .line 255
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->d()Lcom/nineoldandroids/a/a$a;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 259
    const-string/jumbo v0, "y"

    new-array v1, v8, [F

    aput v3, v1, v6

    int-to-float v2, v2

    add-float/2addr v2, v4

    neg-float v2, v2

    aput v2, v1, v7

    invoke-static {v0, v1}, Lcom/nineoldandroids/a/m;->a(Ljava/lang/String;[F)Lcom/nineoldandroids/a/m;

    move-result-object v0

    .line 260
    new-array v1, v7, [Lcom/nineoldandroids/a/m;

    aput-object v0, v1, v6

    invoke-static {p0, v1}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;[Lcom/nineoldandroids/a/m;)Lcom/nineoldandroids/a/k;

    move-result-object v2

    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->i:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/app/a;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-wide/16 v0, 0x1f4

    :goto_1
    invoke-virtual {v2, v0, v1}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    move-result-object v0

    .line 262
    new-instance v1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/k;->a(Landroid/view/animation/Interpolator;)V

    .line 263
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->getAnimatorUpdateListener()Lcom/nineoldandroids/a/o$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/o$b;)V

    .line 264
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->c()Lcom/nineoldandroids/a/a$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 265
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->a:Lcom/nineoldandroids/a/c;

    invoke-virtual {v1, v0}, Lcom/nineoldandroids/a/c;->a(Lcom/nineoldandroids/a/a;)Lcom/nineoldandroids/a/c$b;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/nineoldandroids/a/c$b;->b(Lcom/nineoldandroids/a/a;)Lcom/nineoldandroids/a/c$b;

    .line 267
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->a:Lcom/nineoldandroids/a/c;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/c;->a()V

    .line 268
    return-void

    .line 251
    :cond_0
    const-wide/16 v0, 0x258

    goto :goto_0

    .line 260
    :cond_1
    const-wide/16 v0, 0x3e8

    goto :goto_1
.end method

.method public getAnimatorUpdateListener()Lcom/nineoldandroids/a/o$b;
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->j:Lcom/nineoldandroids/a/o$b;

    return-object v0
.end method

.method public getBounds()Landroid/graphics/Rect;
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->o:Landroid/graphics/Rect;

    return-object v0
.end method

.method public getJetSmokeOffset()F
    .locals 1

    .prologue
    .line 111
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->e:F

    return v0
.end method

.method public getRocketAnimationListener()Lcom/qihoo/security/ui/opti/sysclear/rocket/a;
    .locals 1

    .prologue
    .line 138
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->k:Lcom/qihoo/security/ui/opti/sysclear/rocket/a;

    return-object v0
.end method

.method public getX()F
    .locals 1

    .prologue
    .line 95
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->c:F

    return v0
.end method

.method public getY()F
    .locals 1

    .prologue
    .line 103
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->d:F

    return v0
.end method

.method public setAnimatorUpdateListener(Lcom/nineoldandroids/a/o$b;)V
    .locals 0

    .prologue
    .line 134
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->j:Lcom/nineoldandroids/a/o$b;

    .line 135
    return-void
.end method

.method public setBounds(Landroid/graphics/Rect;)V
    .locals 2

    .prologue
    .line 115
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->o:Landroid/graphics/Rect;

    if-nez v0, :cond_0

    .line 116
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->o:Landroid/graphics/Rect;

    .line 123
    :goto_0
    return-void

    .line 118
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->o:Landroid/graphics/Rect;

    iget v1, p1, Landroid/graphics/Rect;->left:I

    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 119
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->o:Landroid/graphics/Rect;

    iget v1, p1, Landroid/graphics/Rect;->top:I

    iput v1, v0, Landroid/graphics/Rect;->top:I

    .line 120
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->o:Landroid/graphics/Rect;

    iget v1, p1, Landroid/graphics/Rect;->right:I

    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 121
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->o:Landroid/graphics/Rect;

    iget v1, p1, Landroid/graphics/Rect;->bottom:I

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    goto :goto_0
.end method

.method public setJetSmokeOffset(F)V
    .locals 0

    .prologue
    .line 107
    iput p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->e:F

    .line 108
    return-void
.end method

.method public setRocketAnimationListener(Lcom/qihoo/security/ui/opti/sysclear/rocket/a;)V
    .locals 0

    .prologue
    .line 142
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->k:Lcom/qihoo/security/ui/opti/sysclear/rocket/a;

    .line 143
    return-void
.end method

.method public setX(F)V
    .locals 0

    .prologue
    .line 91
    iput p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->c:F

    .line 92
    return-void
.end method

.method public setY(F)V
    .locals 0

    .prologue
    .line 99
    iput p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->d:F

    .line 100
    return-void
.end method
