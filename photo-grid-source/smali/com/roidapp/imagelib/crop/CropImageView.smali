.class public Lcom/roidapp/imagelib/crop/CropImageView;
.super Lcom/roidapp/imagelib/crop/ImageViewTouchBase;
.source "SourceFile"


# instance fields
.field public a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/imagelib/crop/h;",
            ">;"
        }
    .end annotation
.end field

.field b:Lcom/roidapp/imagelib/crop/h;

.field c:F

.field d:F

.field e:I

.field private n:Lcom/roidapp/imagelib/crop/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 45
    invoke-direct {p0, p1, p2}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->a:Ljava/util/ArrayList;

    .line 25
    iput-object v1, p0, Lcom/roidapp/imagelib/crop/CropImageView;->b:Lcom/roidapp/imagelib/crop/h;

    .line 49
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 51
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "setLayerType"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const-class v4, Landroid/graphics/Paint;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 53
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const/4 v3, 0x0

    aput-object v3, v1, v2

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    :cond_0
    :goto_0
    return-void

    .line 59
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/UnsupportedOperationException;->printStackTrace()V

    goto :goto_0

    .line 60
    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    goto :goto_0

    :catch_3
    move-exception v0

    goto :goto_0

    :catch_4
    move-exception v0

    goto :goto_0
.end method

.method private a(Landroid/view/MotionEvent;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v2, 0x0

    .line 104
    move v1, v2

    :goto_0
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 105
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/crop/h;

    .line 1046
    iput-boolean v2, v0, Lcom/roidapp/imagelib/crop/h;->b:Z

    .line 107
    invoke-virtual {v0}, Lcom/roidapp/imagelib/crop/h;->b()V

    .line 104
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 110
    :cond_0
    add-int/lit8 v2, v2, 0x1

    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_2

    .line 111
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/crop/h;

    .line 112
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-virtual {v0, v1, v3}, Lcom/roidapp/imagelib/crop/h;->a(FF)I

    move-result v1

    .line 113
    if-eq v1, v4, :cond_0

    .line 2042
    iget-boolean v1, v0, Lcom/roidapp/imagelib/crop/h;->b:Z

    .line 114
    if-nez v1, :cond_2

    .line 2046
    iput-boolean v4, v0, Lcom/roidapp/imagelib/crop/h;->b:Z

    .line 116
    invoke-virtual {v0}, Lcom/roidapp/imagelib/crop/h;->b()V

    .line 121
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/CropImageView;->invalidate()V

    .line 122
    return-void
.end method

.method private a(Lcom/roidapp/imagelib/crop/h;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 222
    iget-object v1, p1, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    .line 224
    iget v0, v1, Landroid/graphics/Rect;->left:I

    rsub-int/lit8 v0, v0, 0x0

    invoke-static {v6, v0}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 225
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/CropImageView;->getRight()I

    move-result v0

    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/CropImageView;->getLeft()I

    move-result v3

    sub-int/2addr v0, v3

    iget v3, v1, Landroid/graphics/Rect;->right:I

    sub-int/2addr v0, v3

    invoke-static {v6, v0}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 227
    iget v0, v1, Landroid/graphics/Rect;->top:I

    rsub-int/lit8 v0, v0, 0x0

    invoke-static {v6, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 228
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/CropImageView;->getBottom()I

    move-result v4

    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/CropImageView;->getTop()I

    move-result v5

    sub-int/2addr v4, v5

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    sub-int v1, v4, v1

    invoke-static {v6, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 230
    if-eqz v2, :cond_2

    .line 231
    :goto_0
    if-eqz v0, :cond_3

    .line 233
    :goto_1
    if-nez v2, :cond_0

    if-eqz v0, :cond_1

    .line 234
    :cond_0
    int-to-float v1, v2

    int-to-float v0, v0

    invoke-virtual {p0, v1, v0}, Lcom/roidapp/imagelib/crop/CropImageView;->b(FF)V

    .line 236
    :cond_1
    return-void

    :cond_2
    move v2, v3

    .line 230
    goto :goto_0

    :cond_3
    move v0, v1

    .line 231
    goto :goto_1
.end method

.method private b(Lcom/roidapp/imagelib/crop/h;)V
    .locals 10

    .prologue
    const/4 v9, 0x2

    const v4, 0x3f19999a    # 0.6f

    const/4 v8, 0x1

    const/4 v7, 0x0

    .line 285
    iget-object v0, p1, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    .line 287
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    int-to-float v1, v1

    .line 288
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v0, v0

    .line 290
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/CropImageView;->getWidth()I

    move-result v2

    int-to-float v2, v2

    .line 291
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/CropImageView;->getHeight()I

    move-result v3

    int-to-float v3, v3

    .line 293
    div-float v1, v2, v1

    mul-float/2addr v1, v4

    .line 294
    div-float v0, v3, v0

    mul-float/2addr v0, v4

    .line 296
    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 297
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/CropImageView;->b()F

    move-result v1

    mul-float/2addr v0, v1

    .line 298
    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v1

    .line 301
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/CropImageView;->b()F

    move-result v0

    sub-float v0, v1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    div-float/2addr v0, v1

    float-to-double v2, v0

    const-wide v4, 0x3fb999999999999aL    # 0.1

    cmpl-double v0, v2, v4

    if-lez v0, :cond_0

    .line 3251
    iget v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->k:F

    cmpl-float v0, v1, v0

    if-lez v0, :cond_3

    .line 3252
    iget v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->k:F

    .line 3255
    :goto_0
    new-array v2, v9, [F

    iget-object v3, p1, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->centerX()F

    move-result v3

    aput v3, v2, v7

    iget-object v3, p1, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->centerY()F

    move-result v3

    aput v3, v2, v8

    .line 3256
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/CropImageView;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 3258
    new-instance v3, Landroid/graphics/Matrix;

    iget-object v4, p0, Lcom/roidapp/imagelib/crop/CropImageView;->g:Landroid/graphics/Matrix;

    invoke-direct {v3, v4}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 3259
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/CropImageView;->b()F

    move-result v4

    div-float v4, v0, v4

    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/CropImageView;->b()F

    move-result v5

    div-float/2addr v0, v5

    aget v5, v2, v7

    aget v2, v2, v8

    invoke-virtual {v3, v4, v0, v5, v2}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 3260
    new-instance v0, Landroid/graphics/Matrix;

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/CropImageView;->f:Landroid/graphics/Matrix;

    invoke-direct {v0, v2}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 3262
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 3263
    invoke-virtual {v2, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 3264
    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 3266
    new-instance v0, Landroid/graphics/RectF;

    iget-object v3, p1, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->left:F

    iget-object v4, p1, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->top:F

    iget-object v5, p1, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    iget v5, v5, Landroid/graphics/RectF;->right:F

    iget-object v6, p1, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    iget v6, v6, Landroid/graphics/RectF;->bottom:F

    invoke-direct {v0, v3, v4, v5, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 3267
    invoke-virtual {v2, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 3268
    new-instance v2, Landroid/graphics/Rect;

    iget v3, v0, Landroid/graphics/RectF;->left:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    iget v4, v0, Landroid/graphics/RectF;->top:F

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    iget v5, v0, Landroid/graphics/RectF;->right:F

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-direct {v2, v3, v4, v5, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 3270
    iget v0, v2, Landroid/graphics/Rect;->left:I

    rsub-int/lit8 v0, v0, 0x0

    invoke-static {v7, v0}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 3271
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/CropImageView;->getRight()I

    move-result v0

    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/CropImageView;->getLeft()I

    move-result v4

    sub-int/2addr v0, v4

    iget v4, v2, Landroid/graphics/Rect;->right:I

    sub-int/2addr v0, v4

    invoke-static {v7, v0}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 3273
    iget v0, v2, Landroid/graphics/Rect;->top:I

    rsub-int/lit8 v0, v0, 0x0

    invoke-static {v7, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 3274
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/CropImageView;->getBottom()I

    move-result v5

    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/CropImageView;->getTop()I

    move-result v6

    sub-int/2addr v5, v6

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    sub-int v2, v5, v2

    invoke-static {v7, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 3276
    if-eqz v3, :cond_1

    .line 3277
    :goto_1
    if-eqz v0, :cond_2

    .line 3279
    :goto_2
    new-instance v2, Landroid/graphics/Point;

    invoke-direct {v2, v3, v0}, Landroid/graphics/Point;-><init>(II)V

    .line 303
    new-array v0, v9, [F

    iget-object v3, p1, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->centerX()F

    move-result v3

    aput v3, v0, v7

    iget-object v3, p1, Lcom/roidapp/imagelib/crop/h;->e:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->centerY()F

    move-result v3

    aput v3, v0, v8

    .line 304
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/CropImageView;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 305
    aget v3, v0, v7

    aget v0, v0, v8

    invoke-virtual {p0, v1, v3, v0, v2}, Lcom/roidapp/imagelib/crop/CropImageView;->a(FFFLandroid/graphics/Point;)V

    .line 307
    :cond_0
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/crop/CropImageView;->a(Lcom/roidapp/imagelib/crop/h;)V

    .line 309
    return-void

    :cond_1
    move v3, v4

    .line 3276
    goto :goto_1

    :cond_2
    move v0, v2

    .line 3277
    goto :goto_2

    :cond_3
    move v0, v1

    goto/16 :goto_0
.end method


# virtual methods
.method protected final a(FF)V
    .locals 3

    .prologue
    .line 93
    invoke-super {p0, p1, p2}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->a(FF)V

    .line 94
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 95
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/crop/h;

    .line 96
    iget-object v2, v0, Lcom/roidapp/imagelib/crop/h;->f:Landroid/graphics/Matrix;

    invoke-virtual {v2, p1, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 97
    invoke-virtual {v0}, Lcom/roidapp/imagelib/crop/h;->b()V

    .line 94
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 99
    :cond_0
    return-void
.end method

.method protected final a(FFFFF)V
    .locals 4

    .prologue
    .line 66
    invoke-super/range {p0 .. p5}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->a(FFFFF)V

    .line 67
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/crop/h;

    .line 68
    iget-object v2, v0, Lcom/roidapp/imagelib/crop/h;->f:Landroid/graphics/Matrix;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/CropImageView;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 69
    invoke-virtual {v0}, Lcom/roidapp/imagelib/crop/h;->b()V

    goto :goto_0

    .line 71
    :cond_0
    return-void
.end method

.method public final a(Lcom/roidapp/imagelib/crop/a;)V
    .locals 0

    .prologue
    .line 330
    iput-object p1, p0, Lcom/roidapp/imagelib/crop/CropImageView;->n:Lcom/roidapp/imagelib/crop/a;

    .line 331
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .prologue
    .line 313
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/CropImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 314
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 316
    invoke-super {p0, p1}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->onDraw(Landroid/graphics/Canvas;)V

    .line 317
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 318
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/crop/h;

    invoke-virtual {v0, p1}, Lcom/roidapp/imagelib/crop/h;->a(Landroid/graphics/Canvas;)V

    .line 317
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 321
    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 4

    .prologue
    .line 31
    invoke-super/range {p0 .. p5}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->onLayout(ZIIII)V

    .line 32
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->h:Lcom/roidapp/imagelib/crop/t;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/crop/t;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 33
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/crop/h;

    .line 34
    iget-object v2, v0, Lcom/roidapp/imagelib/crop/h;->f:Landroid/graphics/Matrix;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/CropImageView;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 35
    invoke-virtual {v0}, Lcom/roidapp/imagelib/crop/h;->b()V

    goto :goto_0

    .line 41
    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7

    .prologue
    const/4 v5, 0x1

    const/4 v2, 0x0

    .line 126
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/CropImageView;->n:Lcom/roidapp/imagelib/crop/a;

    .line 127
    iget-boolean v0, v1, Lcom/roidapp/imagelib/crop/a;->b:Z

    if-nez v0, :cond_0

    iget-boolean v0, v1, Lcom/roidapp/imagelib/crop/a;->c:Z

    if-eqz v0, :cond_1

    .line 217
    :cond_0
    :goto_0
    return v2

    .line 131
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 202
    :cond_2
    :goto_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_1

    :goto_2
    move v2, v5

    .line 217
    goto :goto_0

    .line 133
    :pswitch_0
    iget-boolean v0, v1, Lcom/roidapp/imagelib/crop/a;->a:Z

    if-eqz v0, :cond_3

    .line 134
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/crop/CropImageView;->a(Landroid/view/MotionEvent;)V

    goto :goto_1

    :cond_3
    move v1, v2

    .line 136
    :goto_3
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 142
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/crop/h;

    .line 143
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/imagelib/crop/h;->a(FF)I

    move-result v2

    .line 144
    if-eq v2, v5, :cond_5

    .line 145
    iput v2, p0, Lcom/roidapp/imagelib/crop/CropImageView;->e:I

    .line 146
    iput-object v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->b:Lcom/roidapp/imagelib/crop/h;

    .line 147
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->c:F

    .line 148
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->d:F

    .line 150
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/CropImageView;->b:Lcom/roidapp/imagelib/crop/h;

    const/16 v0, 0x20

    if-ne v2, v0, :cond_4

    sget v0, Lcom/roidapp/imagelib/crop/i;->b:I

    :goto_4
    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/crop/h;->a(I)V

    goto :goto_1

    :cond_4
    sget v0, Lcom/roidapp/imagelib/crop/i;->c:I

    goto :goto_4

    .line 136
    :cond_5
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_3

    .line 159
    :pswitch_1
    iget-boolean v0, v1, Lcom/roidapp/imagelib/crop/a;->a:Z

    if-eqz v0, :cond_9

    move v3, v2

    .line 160
    :goto_5
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_a

    .line 161
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/crop/h;

    .line 3042
    iget-boolean v4, v0, Lcom/roidapp/imagelib/crop/h;->b:Z

    .line 162
    if-eqz v4, :cond_8

    .line 163
    iput-object v0, v1, Lcom/roidapp/imagelib/crop/a;->d:Lcom/roidapp/imagelib/crop/h;

    move v4, v2

    .line 164
    :goto_6
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v4, v1, :cond_7

    .line 165
    if-eq v4, v3, :cond_6

    .line 169
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/imagelib/crop/h;

    .line 3050
    iput-boolean v5, v1, Lcom/roidapp/imagelib/crop/h;->c:Z

    .line 164
    :cond_6
    add-int/lit8 v1, v4, 0x1

    move v4, v1

    goto :goto_6

    .line 171
    :cond_7
    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/crop/CropImageView;->b(Lcom/roidapp/imagelib/crop/h;)V

    .line 172
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->n:Lcom/roidapp/imagelib/crop/a;

    iput-boolean v2, v0, Lcom/roidapp/imagelib/crop/a;->a:Z

    move v2, v5

    .line 173
    goto/16 :goto_0

    .line 160
    :cond_8
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_5

    .line 176
    :cond_9
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->b:Lcom/roidapp/imagelib/crop/h;

    if-eqz v0, :cond_a

    .line 177
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->b:Lcom/roidapp/imagelib/crop/h;

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/crop/CropImageView;->b(Lcom/roidapp/imagelib/crop/h;)V

    .line 178
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->b:Lcom/roidapp/imagelib/crop/h;

    sget v1, Lcom/roidapp/imagelib/crop/i;->a:I

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/crop/h;->a(I)V

    .line 180
    :cond_a
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->b:Lcom/roidapp/imagelib/crop/h;

    goto/16 :goto_1

    .line 183
    :pswitch_2
    iget-boolean v0, v1, Lcom/roidapp/imagelib/crop/a;->a:Z

    if-eqz v0, :cond_b

    .line 184
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/crop/CropImageView;->a(Landroid/view/MotionEvent;)V

    goto/16 :goto_1

    .line 185
    :cond_b
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->b:Lcom/roidapp/imagelib/crop/h;

    if-eqz v0, :cond_2

    .line 186
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->b:Lcom/roidapp/imagelib/crop/h;

    iget v1, p0, Lcom/roidapp/imagelib/crop/CropImageView;->e:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    iget v4, p0, Lcom/roidapp/imagelib/crop/CropImageView;->c:F

    sub-float/2addr v3, v4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    iget v6, p0, Lcom/roidapp/imagelib/crop/CropImageView;->d:F

    sub-float/2addr v4, v6

    invoke-virtual {v0, v1, v3, v4}, Lcom/roidapp/imagelib/crop/h;->a(IFF)V

    .line 193
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->b:Lcom/roidapp/imagelib/crop/h;

    .line 3239
    iget-object v1, v0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    .line 3240
    iget-object v3, v0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    .line 3241
    iget-object v4, v0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->top:I

    .line 3242
    iget-object v0, v0, Lcom/roidapp/imagelib/crop/h;->d:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 3243
    if-gtz v1, :cond_c

    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/CropImageView;->getRight()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-gt v3, v1, :cond_d

    :cond_c
    if-gtz v4, :cond_e

    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/CropImageView;->getBottom()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-le v0, v1, :cond_e

    :cond_d
    move v2, v5

    .line 193
    :cond_e
    if-nez v2, :cond_f

    .line 194
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->b:Lcom/roidapp/imagelib/crop/h;

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/crop/CropImageView;->a(Lcom/roidapp/imagelib/crop/h;)V

    .line 196
    :cond_f
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->c:F

    .line 197
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/crop/CropImageView;->d:F

    goto/16 :goto_1

    .line 204
    :pswitch_3
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/CropImageView;->a()V

    goto/16 :goto_2

    .line 212
    :pswitch_4
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/CropImageView;->a()V

    goto/16 :goto_2

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch

    .line 202
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
