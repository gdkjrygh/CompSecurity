.class public Lcom/roidapp/imagelib/retouch/Magnifier;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:F

.field private e:Landroid/graphics/RectF;

.field private f:Landroid/graphics/RectF;

.field private g:Landroid/graphics/Path;

.field private h:Landroid/graphics/Bitmap;

.field private i:Landroid/graphics/RectF;

.field private j:I

.field private k:I

.field private l:Landroid/graphics/Paint;

.field private m:Landroid/graphics/Paint;

.field private n:F

.field private o:F

.field private p:I

.field private q:Landroid/graphics/PointF;

.field private r:F

.field private s:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 48
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 45
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->s:Landroid/graphics/Matrix;

    .line 50
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/support/v4/view/ViewCompat;->setLayerType(Landroid/view/View;ILandroid/graphics/Paint;)V

    .line 51
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 52
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->a:I

    .line 53
    invoke-direct {p0}, Lcom/roidapp/imagelib/retouch/Magnifier;->b()V

    .line 54
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    .line 57
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 45
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->s:Landroid/graphics/Matrix;

    .line 59
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/support/v4/view/ViewCompat;->setLayerType(Landroid/view/View;ILandroid/graphics/Paint;)V

    .line 60
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 61
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->a:I

    .line 62
    invoke-direct {p0}, Lcom/roidapp/imagelib/retouch/Magnifier;->b()V

    .line 64
    return-void
.end method

.method private b()V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/high16 v6, 0x40000000    # 2.0f

    const/16 v5, 0xff

    const/4 v4, 0x0

    const/high16 v3, 0x40a00000    # 5.0f

    .line 67
    iget v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->a:I

    int-to-float v0, v0

    const v1, 0x3e19999a    # 0.15f

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->b:I

    .line 68
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->b:I

    mul-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    iget v2, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->b:I

    mul-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    invoke-direct {v0, v4, v4, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->e:Landroid/graphics/RectF;

    .line 69
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->b:I

    mul-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    add-float/2addr v1, v3

    iget v2, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->b:I

    mul-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    add-float/2addr v2, v3

    invoke-direct {v0, v4, v4, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->f:Landroid/graphics/RectF;

    .line 70
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->g:Landroid/graphics/Path;

    .line 71
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->g:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->e:Landroid/graphics/RectF;

    sget-object v2, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 72
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->i:Landroid/graphics/RectF;

    .line 74
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->l:Landroid/graphics/Paint;

    .line 75
    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/Magnifier;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/imagelib/d;->a:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    .line 76
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->l:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 77
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->l:Landroid/graphics/Paint;

    const/high16 v1, 0x40800000    # 4.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 78
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->l:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 79
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->l:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 81
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->m:Landroid/graphics/Paint;

    .line 82
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->m:Landroid/graphics/Paint;

    invoke-virtual {v0, v5, v5, v5, v5}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 83
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->m:Landroid/graphics/Paint;

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 84
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->m:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 85
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->m:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 87
    iget v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->b:I

    mul-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    mul-float/2addr v0, v6

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->c:I

    .line 88
    iget v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->b:I

    int-to-float v0, v0

    mul-float/2addr v0, v6

    add-float/2addr v0, v3

    iput v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->n:F

    .line 89
    iget v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->b:I

    int-to-float v0, v0

    mul-float/2addr v0, v6

    add-float/2addr v0, v3

    iput v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->o:F

    .line 90
    const/high16 v0, -0x1000000

    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/retouch/Magnifier;->setBackgroundColor(I)V

    .line 91
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 94
    iget v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->b:I

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x5

    return v0
.end method

.method public final a(F)V
    .locals 0

    .prologue
    .line 118
    iput p1, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->r:F

    .line 119
    return-void
.end method

.method public final a(Landroid/graphics/Bitmap;)V
    .locals 2

    .prologue
    .line 98
    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->h:Landroid/graphics/Bitmap;

    .line 99
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->j:I

    .line 100
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->k:I

    .line 101
    iget v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->j:I

    iget v1, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->k:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->p:I

    .line 102
    iget v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->p:I

    int-to-float v0, v0

    iget v1, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->b:I

    mul-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    div-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 103
    iget v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->c:I

    int-to-float v0, v0

    iget v1, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->p:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->d:F

    .line 107
    :goto_0
    return-void

    .line 105
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->d:F

    goto :goto_0
.end method

.method public final a(Landroid/graphics/PointF;)V
    .locals 3

    .prologue
    .line 110
    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->q:Landroid/graphics/PointF;

    .line 111
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->i:Landroid/graphics/RectF;

    iget v1, p1, Landroid/graphics/PointF;->x:F

    iget v2, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->b:I

    int-to-float v2, v2

    sub-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 112
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->i:Landroid/graphics/RectF;

    iget v1, p1, Landroid/graphics/PointF;->x:F

    iget v2, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->b:I

    int-to-float v2, v2

    add-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 113
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->i:Landroid/graphics/RectF;

    iget v1, p1, Landroid/graphics/PointF;->y:F

    iget v2, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->b:I

    int-to-float v2, v2

    sub-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 114
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->i:Landroid/graphics/RectF;

    iget v1, p1, Landroid/graphics/PointF;->y:F

    iget v2, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->b:I

    int-to-float v2, v2

    add-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 115
    return-void
.end method

.method public final b(F)V
    .locals 1

    .prologue
    .line 122
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    .line 123
    iput p1, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->d:F

    .line 125
    :cond_0
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .prologue
    .line 129
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 131
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->h:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 132
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 133
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->s:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 134
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->s:Landroid/graphics/Matrix;

    iget v1, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->d:F

    iget v2, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->d:F

    iget-object v3, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->q:Landroid/graphics/PointF;

    iget v3, v3, Landroid/graphics/PointF;->x:F

    iget-object v4, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->q:Landroid/graphics/PointF;

    iget v4, v4, Landroid/graphics/PointF;->y:F

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 135
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->s:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->i:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    neg-float v1, v1

    iget-object v2, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->i:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    neg-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 136
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->h:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->s:Landroid/graphics/Matrix;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 137
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 139
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 141
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->i:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    neg-float v0, v0

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->i:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->top:F

    neg-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 142
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->q:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->q:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    iget v2, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->r:F

    iget-object v3, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->l:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 143
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 146
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->f:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/Magnifier;->m:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 147
    return-void
.end method
