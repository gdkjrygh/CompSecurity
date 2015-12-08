.class public Lcom/roidapp/imagelib/facedetector/LoadImageView;
.super Landroid/widget/ImageView;
.source "SourceFile"


# instance fields
.field private a:Landroid/graphics/Bitmap;

.field private b:Landroid/graphics/Matrix;

.field private c:Landroid/graphics/Matrix;

.field private d:Landroid/graphics/Matrix;

.field private e:Landroid/graphics/Matrix;

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:Landroid/graphics/drawable/Drawable;

.field private l:Landroid/graphics/drawable/Drawable;

.field private m:I

.field private n:F

.field private o:F

.field private p:F

.field private q:F

.field private r:F

.field private s:F

.field private t:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 52
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 28
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->c:Landroid/graphics/Matrix;

    .line 30
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->e:Landroid/graphics/Matrix;

    .line 32
    const/16 v0, 0x32

    iput v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->f:I

    .line 53
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/facedetector/LoadImageView;->a(Landroid/content/Context;)V

    .line 54
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 57
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 28
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->c:Landroid/graphics/Matrix;

    .line 30
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->e:Landroid/graphics/Matrix;

    .line 32
    const/16 v0, 0x32

    iput v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->f:I

    .line 58
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/facedetector/LoadImageView;->a(Landroid/content/Context;)V

    .line 59
    return-void
.end method

.method private static a(Landroid/graphics/PointF;Landroid/graphics/PointF;)F
    .locals 13

    .prologue
    const/high16 v12, 0x43340000    # 180.0f

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    const/4 v6, 0x0

    .line 317
    iget v4, p0, Landroid/graphics/PointF;->x:F

    iget v5, p1, Landroid/graphics/PointF;->x:F

    sub-float v7, v4, v5

    .line 318
    iget v4, p0, Landroid/graphics/PointF;->y:F

    iget v5, p1, Landroid/graphics/PointF;->y:F

    sub-float v8, v4, v5

    .line 320
    float-to-double v4, v7

    mul-float v9, v7, v7

    mul-float v10, v8, v8

    add-float/2addr v9, v10

    float-to-double v10, v9

    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v10

    div-double/2addr v4, v10

    .line 321
    cmpl-double v9, v4, v0

    if-lez v9, :cond_0

    .line 326
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Math;->asin(D)D

    move-result-wide v0

    const-wide v2, 0x4066800000000000L    # 180.0

    mul-double/2addr v0, v2

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    div-double/2addr v0, v2

    double-to-float v0, v0

    .line 327
    cmpl-float v1, v7, v6

    if-ltz v1, :cond_1

    cmpg-float v1, v8, v6

    if-gtz v1, :cond_1

    .line 328
    const/high16 v1, 0x43b40000    # 360.0f

    sub-float v0, v1, v0

    .line 336
    :goto_1
    return v0

    .line 323
    :cond_0
    cmpg-double v0, v4, v2

    if-gez v0, :cond_5

    move-wide v0, v2

    .line 324
    goto :goto_0

    .line 329
    :cond_1
    cmpg-float v1, v7, v6

    if-gtz v1, :cond_2

    cmpg-float v1, v8, v6

    if-gtz v1, :cond_2

    .line 330
    neg-float v0, v0

    goto :goto_1

    .line 331
    :cond_2
    cmpg-float v1, v7, v6

    if-gtz v1, :cond_3

    cmpl-float v1, v8, v6

    if-ltz v1, :cond_3

    .line 332
    add-float/2addr v0, v12

    goto :goto_1

    .line 333
    :cond_3
    cmpl-float v1, v7, v6

    if-ltz v1, :cond_4

    cmpl-float v1, v8, v6

    if-ltz v1, :cond_4

    .line 334
    add-float/2addr v0, v12

    goto :goto_1

    :cond_4
    move v0, v6

    goto :goto_1

    :cond_5
    move-wide v0, v4

    goto :goto_0
.end method

.method private static a(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 284
    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 285
    aput p0, v0, v2

    .line 286
    aput p1, v0, v3

    .line 287
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 288
    new-instance v1, Landroid/graphics/PointF;

    aget v2, v0, v2

    aget v0, v0, v3

    invoke-direct {v1, v2, v0}, Landroid/graphics/PointF;-><init>(FF)V

    return-object v1
.end method

.method private a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 63
    invoke-virtual {p0}, Lcom/roidapp/imagelib/facedetector/LoadImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 64
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v1, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->g:I

    .line 65
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->h:I

    .line 67
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/imagelib/f;->c:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->l:Landroid/graphics/drawable/Drawable;

    .line 68
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/imagelib/f;->av:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->k:Landroid/graphics/drawable/Drawable;

    .line 69
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->q:F

    .line 70
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->t:F

    .line 71
    return-void
.end method

.method private static a(FFLandroid/graphics/RectF;)Z
    .locals 1

    .prologue
    .line 277
    iget v0, p2, Landroid/graphics/RectF;->left:F

    cmpl-float v0, p0, v0

    if-lez v0, :cond_0

    iget v0, p2, Landroid/graphics/RectF;->right:F

    cmpg-float v0, p0, v0

    if-gez v0, :cond_0

    iget v0, p2, Landroid/graphics/RectF;->top:F

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    iget v0, p2, Landroid/graphics/RectF;->bottom:F

    cmpg-float v0, p1, v0

    if-gez v0, :cond_0

    .line 278
    const/4 v0, 0x1

    .line 280
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()F
    .locals 1

    .prologue
    .line 74
    iget v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->t:F

    return v0
.end method

.method public final a(Landroid/graphics/Bitmap;[F)V
    .locals 11

    .prologue
    const/4 v10, 0x0

    const/4 v9, 0x0

    const/high16 v8, 0x40000000    # 2.0f

    .line 85
    iput-object p1, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->a:Landroid/graphics/Bitmap;

    .line 86
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 87
    iget-object v1, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 89
    iget v2, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->g:I

    int-to-float v2, v2

    int-to-float v3, v0

    div-float/2addr v2, v3

    iget v3, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->h:I

    int-to-float v3, v3

    int-to-float v4, v1

    div-float/2addr v3, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v2

    .line 90
    iget v3, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->g:I

    int-to-float v3, v3

    div-float/2addr v3, v8

    int-to-float v4, v0

    mul-float/2addr v4, v2

    div-float/2addr v4, v8

    sub-float/2addr v3, v4

    .line 91
    iget v4, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->h:I

    int-to-float v4, v4

    div-float/2addr v4, v8

    int-to-float v5, v1

    mul-float/2addr v5, v2

    div-float/2addr v5, v8

    sub-float/2addr v4, v5

    .line 93
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    iput-object v5, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->b:Landroid/graphics/Matrix;

    .line 94
    iget-object v5, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->b:Landroid/graphics/Matrix;

    invoke-virtual {v5, v2, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 95
    iget-object v2, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->b:Landroid/graphics/Matrix;

    invoke-virtual {v2, v9}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 96
    iget-object v2, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->b:Landroid/graphics/Matrix;

    invoke-virtual {v2, v3, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 97
    iget-object v2, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->b:Landroid/graphics/Matrix;

    iget-object v3, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->c:Landroid/graphics/Matrix;

    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 1105
    iget-object v2, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    .line 1106
    iget-object v3, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    .line 1109
    int-to-float v4, v0

    float-to-double v4, v4

    const-wide v6, 0x3fe3333333333333L    # 0.6

    mul-double/2addr v4, v6

    double-to-float v4, v4

    int-to-float v5, v2

    div-float/2addr v4, v5

    int-to-float v5, v1

    const v6, 0x3f19999a    # 0.6f

    mul-float/2addr v5, v6

    int-to-float v6, v3

    div-float/2addr v5, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    move-result v4

    .line 1110
    int-to-float v0, v0

    div-float/2addr v0, v8

    int-to-float v5, v2

    mul-float/2addr v5, v4

    div-float/2addr v5, v8

    sub-float/2addr v0, v5

    .line 1111
    int-to-float v1, v1

    div-float/2addr v1, v8

    int-to-float v5, v3

    mul-float/2addr v5, v4

    div-float/2addr v5, v8

    sub-float/2addr v1, v5

    .line 1113
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    iput-object v5, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->d:Landroid/graphics/Matrix;

    .line 1114
    if-eqz p2, :cond_0

    .line 1115
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->d:Landroid/graphics/Matrix;

    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->setValues([F)V

    .line 1116
    const/16 v0, 0x9

    aget v0, p2, v0

    iput v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->q:F

    .line 1125
    :goto_0
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v10, v10, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 1127
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->k:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->i:I

    .line 1128
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->k:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->j:I

    .line 1134
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    iget v0, v0, Landroid/graphics/Rect;->right:I

    int-to-float v0, v0

    iget-object v1, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->d:Landroid/graphics/Matrix;

    invoke-static {v0, v1, v2}, Lcom/roidapp/imagelib/facedetector/LoadImageView;->a(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v0

    .line 1135
    iget v1, v0, Landroid/graphics/PointF;->x:F

    iget v0, v0, Landroid/graphics/PointF;->y:F

    iget-object v2, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->b:Landroid/graphics/Matrix;

    invoke-static {v1, v0, v2}, Lcom/roidapp/imagelib/facedetector/LoadImageView;->a(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v0

    .line 1136
    iget-object v1, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->k:Landroid/graphics/drawable/Drawable;

    iget v2, v0, Landroid/graphics/PointF;->x:F

    float-to-int v2, v2

    iget v3, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->i:I

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    iget v3, v0, Landroid/graphics/PointF;->y:F

    float-to-int v3, v3

    iget v4, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->j:I

    div-int/lit8 v4, v4, 0x2

    sub-int/2addr v3, v4

    iget v4, v0, Landroid/graphics/PointF;->x:F

    float-to-int v4, v4

    iget v5, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->i:I

    div-int/lit8 v5, v5, 0x2

    add-int/2addr v4, v5

    iget v0, v0, Landroid/graphics/PointF;->y:F

    float-to-int v0, v0

    iget v5, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->j:I

    div-int/lit8 v5, v5, 0x2

    add-int/2addr v0, v5

    invoke-virtual {v1, v2, v3, v4, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 102
    return-void

    .line 1118
    :cond_0
    iget-object v5, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->d:Landroid/graphics/Matrix;

    invoke-virtual {v5, v4, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 1119
    iget-object v4, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->d:Landroid/graphics/Matrix;

    invoke-virtual {v4, v9}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 1120
    iget-object v4, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->d:Landroid/graphics/Matrix;

    invoke-virtual {v4, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 1121
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->d:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->e:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    goto :goto_0
.end method

.method public final b()[F
    .locals 3

    .prologue
    .line 78
    const/16 v0, 0xa

    new-array v0, v0, [F

    .line 79
    iget-object v1, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->d:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->getValues([F)V

    .line 80
    const/16 v1, 0x9

    iget v2, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->q:F

    aput v2, v0, v1

    .line 81
    return-object v0
.end method

.method public final c()Landroid/graphics/Bitmap;
    .locals 14

    .prologue
    const/4 v13, 0x1

    const/4 v12, -0x1

    const/4 v1, 0x0

    const/4 v11, 0x0

    const/4 v10, 0x0

    .line 146
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->a:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_4

    .line 147
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    .line 148
    iget-object v2, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    .line 150
    new-instance v3, Landroid/graphics/RectF;

    int-to-float v0, v0

    int-to-float v2, v2

    invoke-direct {v3, v10, v10, v0, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 151
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->d:Landroid/graphics/Matrix;

    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 152
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v0

    float-to-int v2, v0

    .line 153
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v0

    float-to-int v4, v0

    .line 154
    new-instance v5, Landroid/graphics/Rect;

    iget v0, v3, Landroid/graphics/RectF;->left:F

    float-to-int v0, v0

    iget v6, v3, Landroid/graphics/RectF;->top:F

    float-to-int v6, v6

    iget v7, v3, Landroid/graphics/RectF;->right:F

    float-to-int v7, v7

    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    float-to-int v3, v3

    invoke-direct {v5, v0, v6, v7, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 155
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v4, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 157
    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 158
    new-instance v6, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v7, 0x3

    invoke-direct {v6, v11, v7}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v3, v6}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 160
    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    .line 161
    invoke-virtual {v6, v13}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 162
    invoke-virtual {v6, v13}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 163
    invoke-virtual {v6, v12}, Landroid/graphics/Paint;->setColor(I)V

    .line 166
    new-instance v6, Landroid/graphics/Rect;

    invoke-direct {v6, v11, v11, v2, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 167
    invoke-virtual {v3, v12}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 168
    iget-object v7, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v3, v7, v5, v6, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 169
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 184
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 2098
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_0
    move-object v2, v1

    .line 186
    :goto_0
    const/16 v4, 0x280

    if-le v3, v4, :cond_1

    .line 187
    invoke-static {v0}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 189
    :cond_1
    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 190
    const/high16 v0, 0x43b40000    # 360.0f

    iget v4, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->q:F

    sub-float/2addr v0, v4

    invoke-virtual {v3, v0}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 191
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    .line 192
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    .line 193
    new-instance v0, Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    int-to-float v6, v6

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    int-to-float v7, v7

    invoke-direct {v0, v10, v10, v6, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 195
    invoke-virtual {v3, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 196
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v6

    float-to-int v6, v6

    .line 197
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    float-to-int v7, v0

    .line 198
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v6, v7, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 199
    new-instance v8, Landroid/graphics/Canvas;

    invoke-direct {v8, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 200
    new-instance v9, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v10, 0x3

    invoke-direct {v9, v11, v10}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v8, v9}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 202
    invoke-virtual {v3}, Landroid/graphics/Matrix;->reset()V

    .line 203
    div-int/lit8 v9, v6, 0x2

    div-int/lit8 v10, v4, 0x2

    sub-int/2addr v9, v10

    int-to-float v9, v9

    div-int/lit8 v10, v7, 0x2

    div-int/lit8 v11, v5, 0x2

    sub-int/2addr v10, v11

    int-to-float v10, v10

    invoke-virtual {v3, v9, v10}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 204
    const/high16 v9, 0x43b40000    # 360.0f

    iget v10, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->q:F

    sub-float/2addr v9, v10

    div-int/lit8 v10, v6, 0x2

    int-to-float v10, v10

    div-int/lit8 v11, v7, 0x2

    int-to-float v11, v11

    invoke-virtual {v3, v9, v10, v11}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 205
    invoke-virtual {v8, v12}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 206
    invoke-virtual {v8, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 207
    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 210
    mul-int v1, v6, v7

    int-to-double v2, v1

    mul-int v1, v4, v5

    int-to-double v4, v1

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    double-to-float v1, v2

    iput v1, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->t:F

    .line 216
    :goto_1
    return-object v0

    .line 2101
    :cond_2
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    .line 2102
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    .line 2104
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 2107
    const/16 v6, 0x280

    if-gt v5, v6, :cond_3

    move-object v2, v0

    .line 2108
    goto/16 :goto_0

    .line 2111
    :cond_3
    int-to-double v6, v5

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v6, v8

    const-wide/high16 v8, 0x4084000000000000L    # 640.0

    div-double/2addr v6, v8

    .line 2112
    int-to-double v4, v4

    div-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    double-to-int v4, v4

    .line 2113
    int-to-double v8, v2

    div-double v6, v8, v6

    invoke-static {v6, v7}, Ljava/lang/Math;->floor(D)D

    move-result-wide v6

    double-to-int v2, v6

    .line 2115
    invoke-static {v0, v2, v4, v13}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v2

    goto/16 :goto_0

    :cond_4
    move-object v0, v1

    .line 216
    goto :goto_1
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .prologue
    .line 222
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 223
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->a:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 224
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->a:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->b:Landroid/graphics/Matrix;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 226
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 227
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->b:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 228
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->d:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 229
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 230
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 232
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 233
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->k:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 234
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 237
    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 11

    .prologue
    const/4 v10, 0x0

    .line 241
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    .line 244
    packed-switch v0, :pswitch_data_0

    .line 272
    :cond_0
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 248
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    .line 249
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    .line 2292
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 2293
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    .line 2294
    iget-object v4, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->d:Landroid/graphics/Matrix;

    if-eqz v4, :cond_2

    iget-object v4, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->b:Landroid/graphics/Matrix;

    if-eqz v4, :cond_2

    .line 2295
    iget-object v4, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->d:Landroid/graphics/Matrix;

    iget-object v5, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->e:Landroid/graphics/Matrix;

    invoke-virtual {v4, v5}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 2296
    new-instance v4, Landroid/graphics/RectF;

    iget v5, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->f:I

    int-to-float v5, v5

    iget v6, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->f:I

    int-to-float v6, v6

    iget-object v7, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v7}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v7

    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    move-result v7

    iget v8, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->f:I

    sub-int/2addr v7, v8

    int-to-float v7, v7

    iget-object v8, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v8}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v8

    invoke-virtual {v8}, Landroid/graphics/Rect;->height()I

    move-result v8

    iget v9, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->f:I

    sub-int/2addr v8, v9

    int-to-float v8, v8

    invoke-direct {v4, v5, v6, v7, v8}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 2297
    iget-object v5, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->d:Landroid/graphics/Matrix;

    invoke-virtual {v5, v4}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 2298
    iget-object v5, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->b:Landroid/graphics/Matrix;

    invoke-virtual {v5, v4}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 2299
    invoke-static {v0, v3, v4}, Lcom/roidapp/imagelib/facedetector/LoadImageView;->a(FFLandroid/graphics/RectF;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 2300
    sget v0, Lcom/roidapp/imagelib/facedetector/g;->b:I

    .line 251
    :goto_1
    iput v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->m:I

    .line 253
    iput v1, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->n:F

    .line 254
    iput v2, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->o:F

    .line 2391
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->l:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->c:Landroid/graphics/Matrix;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->d:Landroid/graphics/Matrix;

    if-eqz v0, :cond_0

    .line 2393
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v0

    int-to-float v0, v0

    .line 2394
    iget-object v3, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v3

    invoke-virtual {v3}, Landroid/graphics/Rect;->centerY()I

    move-result v3

    int-to-float v3, v3

    .line 2395
    iget-object v4, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->c:Landroid/graphics/Matrix;

    invoke-static {v1, v2, v4}, Lcom/roidapp/imagelib/facedetector/LoadImageView;->a(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v1

    .line 2397
    iget-object v2, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->d:Landroid/graphics/Matrix;

    invoke-static {v0, v3, v2}, Lcom/roidapp/imagelib/facedetector/LoadImageView;->a(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v0

    .line 2398
    invoke-static {v1, v0}, Lcom/roidapp/imagelib/facedetector/LoadImageView;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->p:F

    .line 2399
    iput v10, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->r:F

    goto/16 :goto_0

    .line 2302
    :cond_1
    new-instance v4, Landroid/graphics/RectF;

    iget-object v5, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->k:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 2303
    invoke-static {v0, v3, v4}, Lcom/roidapp/imagelib/facedetector/LoadImageView;->a(FFLandroid/graphics/RectF;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2304
    sget v0, Lcom/roidapp/imagelib/facedetector/g;->c:I

    goto :goto_1

    .line 2307
    :cond_2
    sget v0, Lcom/roidapp/imagelib/facedetector/g;->a:I

    goto :goto_1

    .line 261
    :pswitch_1
    iget v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->m:I

    .line 3365
    iget-object v1, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->c:Landroid/graphics/Matrix;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->d:Landroid/graphics/Matrix;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->l:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->k:Landroid/graphics/drawable/Drawable;

    if-nez v1, :cond_4

    .line 262
    :cond_3
    :goto_2
    invoke-virtual {p0}, Lcom/roidapp/imagelib/facedetector/LoadImageView;->invalidate()V

    goto/16 :goto_0

    .line 3367
    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    .line 3368
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    .line 3369
    iget-object v3, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->c:Landroid/graphics/Matrix;

    invoke-static {v1, v2, v3}, Lcom/roidapp/imagelib/facedetector/LoadImageView;->a(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v3

    .line 3370
    iget v4, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->n:F

    iget v5, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->o:F

    iget-object v6, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->c:Landroid/graphics/Matrix;

    invoke-static {v4, v5, v6}, Lcom/roidapp/imagelib/facedetector/LoadImageView;->a(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v4

    .line 3371
    iget v5, v3, Landroid/graphics/PointF;->x:F

    iget v6, v4, Landroid/graphics/PointF;->x:F

    sub-float/2addr v5, v6

    .line 3372
    iget v3, v3, Landroid/graphics/PointF;->y:F

    iget v4, v4, Landroid/graphics/PointF;->y:F

    sub-float/2addr v3, v4

    .line 3374
    sget v4, Lcom/roidapp/imagelib/facedetector/g;->b:I

    if-ne v0, v4, :cond_5

    .line 3375
    iget-object v4, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->d:Landroid/graphics/Matrix;

    invoke-virtual {v4, v5, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 3377
    :cond_5
    sget v3, Lcom/roidapp/imagelib/facedetector/g;->c:I

    if-ne v0, v3, :cond_7

    .line 4341
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v0

    int-to-float v0, v0

    .line 4342
    iget-object v3, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v3

    invoke-virtual {v3}, Landroid/graphics/Rect;->centerY()I

    move-result v3

    int-to-float v3, v3

    .line 4343
    iget-object v4, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->c:Landroid/graphics/Matrix;

    invoke-static {v1, v2, v4}, Lcom/roidapp/imagelib/facedetector/LoadImageView;->a(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v4

    .line 4344
    iget-object v5, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->d:Landroid/graphics/Matrix;

    invoke-static {v0, v3, v5}, Lcom/roidapp/imagelib/facedetector/LoadImageView;->a(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v0

    .line 4345
    invoke-static {v4, v0}, Lcom/roidapp/imagelib/facedetector/LoadImageView;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    move-result v3

    .line 4346
    iget v5, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->p:F

    sub-float/2addr v5, v3

    .line 4347
    iget-object v6, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->d:Landroid/graphics/Matrix;

    iget v7, v0, Landroid/graphics/PointF;->x:F

    iget v8, v0, Landroid/graphics/PointF;->y:F

    invoke-virtual {v6, v5, v7, v8}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 4348
    iput v3, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->p:F

    .line 4349
    iget v3, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->q:F

    add-float/2addr v3, v5

    iput v3, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->q:F

    .line 4350
    iget v3, v4, Landroid/graphics/PointF;->x:F

    iget v4, v4, Landroid/graphics/PointF;->y:F

    iget v5, v0, Landroid/graphics/PointF;->x:F

    iget v6, v0, Landroid/graphics/PointF;->y:F

    .line 5311
    sub-float/2addr v3, v5

    .line 5312
    sub-float/2addr v4, v6

    .line 5313
    mul-float/2addr v3, v3

    mul-float/2addr v4, v4

    add-float/2addr v3, v4

    invoke-static {v3}, Landroid/util/FloatMath;->sqrt(F)F

    move-result v3

    .line 4351
    iget v4, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->r:F

    cmpl-float v4, v4, v10

    if-eqz v4, :cond_6

    .line 4352
    iget v4, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->r:F

    div-float v4, v3, v4

    .line 4353
    const/high16 v5, 0x3f800000    # 1.0f

    cmpl-float v5, v4, v5

    if-lez v5, :cond_8

    .line 4354
    iget-object v5, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->d:Landroid/graphics/Matrix;

    iget v6, v0, Landroid/graphics/PointF;->x:F

    iget v0, v0, Landroid/graphics/PointF;->y:F

    invoke-virtual {v5, v4, v4, v6, v0}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 4358
    :goto_3
    iget v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->s:F

    mul-float/2addr v0, v4

    iput v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->s:F

    .line 4360
    :cond_6
    iput v3, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->r:F

    .line 3382
    :cond_7
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    iget v0, v0, Landroid/graphics/Rect;->right:I

    int-to-float v0, v0

    iget-object v3, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v3

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    int-to-float v3, v3

    iget-object v4, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->d:Landroid/graphics/Matrix;

    invoke-static {v0, v3, v4}, Lcom/roidapp/imagelib/facedetector/LoadImageView;->a(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v0

    .line 3383
    iget v3, v0, Landroid/graphics/PointF;->x:F

    iget v0, v0, Landroid/graphics/PointF;->y:F

    iget-object v4, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->b:Landroid/graphics/Matrix;

    invoke-static {v3, v0, v4}, Lcom/roidapp/imagelib/facedetector/LoadImageView;->a(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v0

    .line 3384
    iget-object v3, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->k:Landroid/graphics/drawable/Drawable;

    iget v4, v0, Landroid/graphics/PointF;->x:F

    float-to-int v4, v4

    iget v5, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->i:I

    div-int/lit8 v5, v5, 0x2

    sub-int/2addr v4, v5

    iget v5, v0, Landroid/graphics/PointF;->y:F

    float-to-int v5, v5

    iget v6, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->j:I

    div-int/lit8 v6, v6, 0x2

    sub-int/2addr v5, v6

    iget v6, v0, Landroid/graphics/PointF;->x:F

    float-to-int v6, v6

    iget v7, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->i:I

    div-int/lit8 v7, v7, 0x2

    add-int/2addr v6, v7

    iget v0, v0, Landroid/graphics/PointF;->y:F

    float-to-int v0, v0

    iget v7, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->j:I

    div-int/lit8 v7, v7, 0x2

    add-int/2addr v0, v7

    invoke-virtual {v3, v4, v5, v6, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 3386
    iput v1, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->n:F

    .line 3387
    iput v2, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->o:F

    goto/16 :goto_2

    .line 4356
    :cond_8
    iget-object v5, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->d:Landroid/graphics/Matrix;

    iget v6, v0, Landroid/graphics/PointF;->x:F

    iget v0, v0, Landroid/graphics/PointF;->y:F

    invoke-virtual {v5, v4, v4, v6, v0}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    goto :goto_3

    .line 267
    :pswitch_2
    sget v0, Lcom/roidapp/imagelib/facedetector/g;->a:I

    iput v0, p0, Lcom/roidapp/imagelib/facedetector/LoadImageView;->m:I

    goto/16 :goto_0

    .line 244
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
