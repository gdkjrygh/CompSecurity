.class public Lkik/android/widget/TouchImageView;
.super Landroid/widget/ImageView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/widget/TouchImageView$a;
    }
.end annotation


# instance fields
.field private a:Landroid/graphics/Matrix;

.field private b:I

.field private c:Landroid/graphics/PointF;

.field private d:Landroid/graphics/PointF;

.field private e:F

.field private f:F

.field private g:[F

.field private h:F

.field private i:F

.field private j:F

.field private k:F

.field private l:F

.field private m:F

.field private n:F

.field private o:F

.field private p:F

.field private q:F

.field private r:F

.field private s:Landroid/view/ScaleGestureDetector;

.field private t:Landroid/view/View$OnTouchListener;

.field private u:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    .line 50
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 15
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lkik/android/widget/TouchImageView;->a:Landroid/graphics/Matrix;

    .line 21
    iput v3, p0, Lkik/android/widget/TouchImageView;->b:I

    .line 24
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lkik/android/widget/TouchImageView;->c:Landroid/graphics/PointF;

    .line 25
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lkik/android/widget/TouchImageView;->d:Landroid/graphics/PointF;

    .line 26
    iput v2, p0, Lkik/android/widget/TouchImageView;->e:F

    .line 27
    const/high16 v0, 0x40800000    # 4.0f

    iput v0, p0, Lkik/android/widget/TouchImageView;->f:F

    .line 34
    iput v2, p0, Lkik/android/widget/TouchImageView;->l:F

    .line 51
    const/4 v0, 0x1

    invoke-super {p0, v0}, Landroid/widget/ImageView;->setClickable(Z)V

    iput-object p1, p0, Lkik/android/widget/TouchImageView;->u:Landroid/content/Context;

    new-instance v0, Landroid/view/ScaleGestureDetector;

    new-instance v1, Lkik/android/widget/TouchImageView$a;

    invoke-direct {v1, p0, v3}, Lkik/android/widget/TouchImageView$a;-><init>(Lkik/android/widget/TouchImageView;B)V

    invoke-direct {v0, p1, v1}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    iput-object v0, p0, Lkik/android/widget/TouchImageView;->s:Landroid/view/ScaleGestureDetector;

    iget-object v0, p0, Lkik/android/widget/TouchImageView;->a:Landroid/graphics/Matrix;

    invoke-virtual {v0, v2, v2}, Landroid/graphics/Matrix;->setTranslate(FF)V

    const/16 v0, 0x9

    new-array v0, v0, [F

    iput-object v0, p0, Lkik/android/widget/TouchImageView;->g:[F

    iget-object v0, p0, Lkik/android/widget/TouchImageView;->a:Landroid/graphics/Matrix;

    invoke-virtual {p0, v0}, Lkik/android/widget/TouchImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    sget-object v0, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v0}, Lkik/android/widget/TouchImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    new-instance v0, Lkik/android/widget/eg;

    invoke-direct {v0, p0}, Lkik/android/widget/eg;-><init>(Lkik/android/widget/TouchImageView;)V

    invoke-virtual {p0, v0}, Lkik/android/widget/TouchImageView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 52
    return-void
.end method

.method static synthetic a(Lkik/android/widget/TouchImageView;F)F
    .locals 1

    .prologue
    .line 13
    iget v0, p0, Lkik/android/widget/TouchImageView;->l:F

    mul-float/2addr v0, p1

    iput v0, p0, Lkik/android/widget/TouchImageView;->l:F

    return v0
.end method

.method static synthetic a(Lkik/android/widget/TouchImageView;I)I
    .locals 0

    .prologue
    .line 13
    iput p1, p0, Lkik/android/widget/TouchImageView;->b:I

    return p1
.end method

.method static synthetic a(Lkik/android/widget/TouchImageView;)Landroid/view/View$OnTouchListener;
    .locals 1

    .prologue
    .line 13
    iget-object v0, p0, Lkik/android/widget/TouchImageView;->t:Landroid/view/View$OnTouchListener;

    return-object v0
.end method

.method static synthetic b(Lkik/android/widget/TouchImageView;F)F
    .locals 0

    .prologue
    .line 13
    iput p1, p0, Lkik/android/widget/TouchImageView;->l:F

    return p1
.end method

.method static synthetic b(Lkik/android/widget/TouchImageView;)Landroid/view/ScaleGestureDetector;
    .locals 1

    .prologue
    .line 13
    iget-object v0, p0, Lkik/android/widget/TouchImageView;->s:Landroid/view/ScaleGestureDetector;

    return-object v0
.end method

.method static synthetic c(Lkik/android/widget/TouchImageView;F)F
    .locals 0

    .prologue
    .line 13
    iput p1, p0, Lkik/android/widget/TouchImageView;->m:F

    return p1
.end method

.method static synthetic c(Lkik/android/widget/TouchImageView;)[F
    .locals 1

    .prologue
    .line 13
    iget-object v0, p0, Lkik/android/widget/TouchImageView;->g:[F

    return-object v0
.end method

.method static synthetic d(Lkik/android/widget/TouchImageView;F)F
    .locals 0

    .prologue
    .line 13
    iput p1, p0, Lkik/android/widget/TouchImageView;->n:F

    return p1
.end method

.method static synthetic d(Lkik/android/widget/TouchImageView;)Landroid/graphics/Matrix;
    .locals 1

    .prologue
    .line 13
    iget-object v0, p0, Lkik/android/widget/TouchImageView;->a:Landroid/graphics/Matrix;

    return-object v0
.end method

.method static synthetic e(Lkik/android/widget/TouchImageView;)Landroid/graphics/PointF;
    .locals 1

    .prologue
    .line 13
    iget-object v0, p0, Lkik/android/widget/TouchImageView;->c:Landroid/graphics/PointF;

    return-object v0
.end method

.method static synthetic f(Lkik/android/widget/TouchImageView;)Landroid/graphics/PointF;
    .locals 1

    .prologue
    .line 13
    iget-object v0, p0, Lkik/android/widget/TouchImageView;->d:Landroid/graphics/PointF;

    return-object v0
.end method

.method static synthetic g(Lkik/android/widget/TouchImageView;)I
    .locals 1

    .prologue
    .line 13
    iget v0, p0, Lkik/android/widget/TouchImageView;->b:I

    return v0
.end method

.method static synthetic h(Lkik/android/widget/TouchImageView;)F
    .locals 1

    .prologue
    .line 13
    iget v0, p0, Lkik/android/widget/TouchImageView;->o:F

    return v0
.end method

.method static synthetic i(Lkik/android/widget/TouchImageView;)F
    .locals 1

    .prologue
    .line 13
    iget v0, p0, Lkik/android/widget/TouchImageView;->l:F

    return v0
.end method

.method static synthetic j(Lkik/android/widget/TouchImageView;)F
    .locals 1

    .prologue
    .line 13
    iget v0, p0, Lkik/android/widget/TouchImageView;->p:F

    return v0
.end method

.method static synthetic k(Lkik/android/widget/TouchImageView;)F
    .locals 1

    .prologue
    .line 13
    iget v0, p0, Lkik/android/widget/TouchImageView;->j:F

    return v0
.end method

.method static synthetic l(Lkik/android/widget/TouchImageView;)F
    .locals 1

    .prologue
    .line 13
    iget v0, p0, Lkik/android/widget/TouchImageView;->n:F

    return v0
.end method

.method static synthetic m(Lkik/android/widget/TouchImageView;)F
    .locals 1

    .prologue
    .line 13
    iget v0, p0, Lkik/android/widget/TouchImageView;->k:F

    return v0
.end method

.method static synthetic n(Lkik/android/widget/TouchImageView;)F
    .locals 1

    .prologue
    .line 13
    iget v0, p0, Lkik/android/widget/TouchImageView;->m:F

    return v0
.end method

.method static synthetic o(Lkik/android/widget/TouchImageView;)F
    .locals 1

    .prologue
    .line 13
    iget v0, p0, Lkik/android/widget/TouchImageView;->f:F

    return v0
.end method

.method static synthetic p(Lkik/android/widget/TouchImageView;)F
    .locals 1

    .prologue
    .line 13
    iget v0, p0, Lkik/android/widget/TouchImageView;->e:F

    return v0
.end method

.method static synthetic q(Lkik/android/widget/TouchImageView;)F
    .locals 1

    .prologue
    .line 13
    iget v0, p0, Lkik/android/widget/TouchImageView;->h:F

    return v0
.end method

.method static synthetic r(Lkik/android/widget/TouchImageView;)F
    .locals 1

    .prologue
    .line 13
    iget v0, p0, Lkik/android/widget/TouchImageView;->i:F

    return v0
.end method


# virtual methods
.method protected onMeasure(II)V
    .locals 4

    .prologue
    const/high16 v3, 0x40000000    # 2.0f

    .line 252
    invoke-super {p0, p1, p2}, Landroid/widget/ImageView;->onMeasure(II)V

    .line 253
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lkik/android/widget/TouchImageView;->j:F

    .line 254
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lkik/android/widget/TouchImageView;->k:F

    .line 257
    iget v0, p0, Lkik/android/widget/TouchImageView;->j:F

    iget v1, p0, Lkik/android/widget/TouchImageView;->q:F

    div-float/2addr v0, v1

    .line 258
    iget v1, p0, Lkik/android/widget/TouchImageView;->k:F

    iget v2, p0, Lkik/android/widget/TouchImageView;->r:F

    div-float/2addr v1, v2

    .line 259
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 260
    iget-object v1, p0, Lkik/android/widget/TouchImageView;->a:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0, v0}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 261
    iget-object v1, p0, Lkik/android/widget/TouchImageView;->a:Landroid/graphics/Matrix;

    invoke-virtual {p0, v1}, Lkik/android/widget/TouchImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 262
    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Lkik/android/widget/TouchImageView;->l:F

    .line 265
    iget v1, p0, Lkik/android/widget/TouchImageView;->k:F

    iget v2, p0, Lkik/android/widget/TouchImageView;->r:F

    mul-float/2addr v2, v0

    sub-float/2addr v1, v2

    iput v1, p0, Lkik/android/widget/TouchImageView;->i:F

    .line 266
    iget v1, p0, Lkik/android/widget/TouchImageView;->j:F

    iget v2, p0, Lkik/android/widget/TouchImageView;->q:F

    mul-float/2addr v0, v2

    sub-float v0, v1, v0

    iput v0, p0, Lkik/android/widget/TouchImageView;->h:F

    .line 267
    iget v0, p0, Lkik/android/widget/TouchImageView;->i:F

    div-float/2addr v0, v3

    iput v0, p0, Lkik/android/widget/TouchImageView;->i:F

    .line 268
    iget v0, p0, Lkik/android/widget/TouchImageView;->h:F

    div-float/2addr v0, v3

    iput v0, p0, Lkik/android/widget/TouchImageView;->h:F

    .line 270
    iget-object v0, p0, Lkik/android/widget/TouchImageView;->a:Landroid/graphics/Matrix;

    iget v1, p0, Lkik/android/widget/TouchImageView;->h:F

    iget v2, p0, Lkik/android/widget/TouchImageView;->i:F

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 272
    iget v0, p0, Lkik/android/widget/TouchImageView;->j:F

    iget v1, p0, Lkik/android/widget/TouchImageView;->h:F

    mul-float/2addr v1, v3

    sub-float/2addr v0, v1

    iput v0, p0, Lkik/android/widget/TouchImageView;->o:F

    .line 273
    iget v0, p0, Lkik/android/widget/TouchImageView;->k:F

    iget v1, p0, Lkik/android/widget/TouchImageView;->i:F

    mul-float/2addr v1, v3

    sub-float/2addr v0, v1

    iput v0, p0, Lkik/android/widget/TouchImageView;->p:F

    .line 274
    iget v0, p0, Lkik/android/widget/TouchImageView;->j:F

    iget v1, p0, Lkik/android/widget/TouchImageView;->l:F

    mul-float/2addr v0, v1

    iget v1, p0, Lkik/android/widget/TouchImageView;->j:F

    sub-float/2addr v0, v1

    iget v1, p0, Lkik/android/widget/TouchImageView;->h:F

    mul-float/2addr v1, v3

    iget v2, p0, Lkik/android/widget/TouchImageView;->l:F

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    iput v0, p0, Lkik/android/widget/TouchImageView;->m:F

    .line 275
    iget v0, p0, Lkik/android/widget/TouchImageView;->k:F

    iget v1, p0, Lkik/android/widget/TouchImageView;->l:F

    mul-float/2addr v0, v1

    iget v1, p0, Lkik/android/widget/TouchImageView;->k:F

    sub-float/2addr v0, v1

    iget v1, p0, Lkik/android/widget/TouchImageView;->i:F

    mul-float/2addr v1, v3

    iget v2, p0, Lkik/android/widget/TouchImageView;->l:F

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    iput v0, p0, Lkik/android/widget/TouchImageView;->n:F

    .line 276
    iget-object v0, p0, Lkik/android/widget/TouchImageView;->a:Landroid/graphics/Matrix;

    invoke-virtual {p0, v0}, Lkik/android/widget/TouchImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 277
    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 160
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 161
    if-eqz p1, :cond_0

    .line 162
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lkik/android/widget/TouchImageView;->q:F

    .line 163
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lkik/android/widget/TouchImageView;->r:F

    .line 165
    :cond_0
    return-void
.end method
