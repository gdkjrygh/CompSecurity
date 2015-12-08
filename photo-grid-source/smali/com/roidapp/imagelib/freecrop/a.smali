.class public final Lcom/roidapp/imagelib/freecrop/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Landroid/view/View;

.field public b:Landroid/graphics/RectF;

.field public c:Landroid/graphics/Matrix;

.field private d:Landroid/graphics/RectF;

.field private e:Landroid/graphics/Bitmap;

.field private f:Z

.field private g:F

.field private h:Z

.field private i:Z

.field private j:Landroid/graphics/drawable/Drawable;

.field private k:Landroid/graphics/drawable/Drawable;

.field private final l:Landroid/graphics/Paint;

.field private final m:Landroid/graphics/Paint;

.field private final n:Landroid/graphics/Paint;

.field private o:Lcom/roidapp/imagelib/freecrop/l;

.field private p:F

.field private q:F

.field private r:I

.field private s:I


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/roidapp/imagelib/freecrop/l;)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-boolean v1, p0, Lcom/roidapp/imagelib/freecrop/a;->f:Z

    .line 38
    iput-boolean v1, p0, Lcom/roidapp/imagelib/freecrop/a;->h:Z

    .line 42
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/a;->l:Landroid/graphics/Paint;

    .line 43
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/a;->m:Landroid/graphics/Paint;

    .line 44
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/a;->n:Landroid/graphics/Paint;

    .line 47
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/a;->q:F

    .line 48
    iput v1, p0, Lcom/roidapp/imagelib/freecrop/a;->r:I

    .line 54
    sget v0, Lcom/roidapp/imagelib/freecrop/b;->a:I

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/a;->s:I

    .line 57
    iput-object p1, p0, Lcom/roidapp/imagelib/freecrop/a;->a:Landroid/view/View;

    .line 58
    iput-object p2, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    .line 1063
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/a;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 1064
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/a;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 1065
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/a;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 1066
    if-le v0, v1, :cond_0

    :goto_0
    iput v0, p0, Lcom/roidapp/imagelib/freecrop/a;->r:I

    .line 1067
    sget v0, Lcom/roidapp/imagelib/f;->at:I

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/a;->j:Landroid/graphics/drawable/Drawable;

    .line 1068
    sget v0, Lcom/roidapp/imagelib/f;->av:I

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/a;->k:Landroid/graphics/drawable/Drawable;

    .line 60
    return-void

    :cond_0
    move v0, v1

    .line 1066
    goto :goto_0
.end method

.method private static a(Landroid/graphics/PointF;Landroid/graphics/PointF;)F
    .locals 13

    .prologue
    const/high16 v12, 0x43340000    # 180.0f

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    const/4 v6, 0x0

    .line 322
    iget v4, p0, Landroid/graphics/PointF;->x:F

    iget v5, p1, Landroid/graphics/PointF;->x:F

    sub-float v7, v4, v5

    .line 323
    iget v4, p0, Landroid/graphics/PointF;->y:F

    iget v5, p1, Landroid/graphics/PointF;->y:F

    sub-float v8, v4, v5

    .line 325
    float-to-double v4, v7

    mul-float v9, v7, v7

    mul-float v10, v8, v8

    add-float/2addr v9, v10

    float-to-double v10, v9

    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v10

    div-double/2addr v4, v10

    .line 326
    cmpl-double v9, v4, v0

    if-lez v9, :cond_0

    .line 331
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Math;->asin(D)D

    move-result-wide v0

    const-wide v2, 0x4066800000000000L    # 180.0

    mul-double/2addr v0, v2

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    div-double/2addr v0, v2

    double-to-float v0, v0

    .line 332
    cmpl-float v1, v7, v6

    if-ltz v1, :cond_1

    cmpg-float v1, v8, v6

    if-gtz v1, :cond_1

    .line 333
    const/high16 v1, 0x43b40000    # 360.0f

    sub-float v0, v1, v0

    .line 341
    :goto_1
    return v0

    .line 328
    :cond_0
    cmpg-double v0, v4, v2

    if-gez v0, :cond_5

    move-wide v0, v2

    .line 329
    goto :goto_0

    .line 334
    :cond_1
    cmpg-float v1, v7, v6

    if-gtz v1, :cond_2

    cmpg-float v1, v8, v6

    if-gtz v1, :cond_2

    .line 335
    neg-float v0, v0

    goto :goto_1

    .line 336
    :cond_2
    cmpg-float v1, v7, v6

    if-gtz v1, :cond_3

    cmpl-float v1, v8, v6

    if-ltz v1, :cond_3

    .line 337
    add-float/2addr v0, v12

    goto :goto_1

    .line 338
    :cond_3
    cmpl-float v1, v7, v6

    if-ltz v1, :cond_4

    cmpl-float v1, v8, v6

    if-ltz v1, :cond_4

    .line 339
    add-float/2addr v0, v12

    goto :goto_1

    :cond_4
    move v0, v6

    goto :goto_1

    :cond_5
    move-wide v0, v4

    goto :goto_0
.end method

.method public static a(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 351
    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 352
    aput p0, v0, v2

    .line 353
    aput p1, v0, v3

    .line 354
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 355
    new-instance v1, Landroid/graphics/PointF;

    aget v2, v0, v2

    aget v0, v0, v3

    invoke-direct {v1, v2, v0}, Landroid/graphics/PointF;-><init>(FF)V

    return-object v1
.end method

.method private a()Z
    .locals 5

    .prologue
    .line 174
    new-instance v0, Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 175
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/freecrop/l;->k()Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 176
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/freecrop/l;->h()Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 177
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v1

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v2

    cmpl-float v1, v1, v2

    if-lez v1, :cond_0

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    .line 178
    :goto_0
    iget v1, p0, Lcom/roidapp/imagelib/freecrop/a;->r:I

    int-to-float v1, v1

    const/high16 v2, 0x3fc00000    # 1.5f

    mul-float/2addr v1, v2

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 179
    const/4 v0, 0x1

    .line 181
    :goto_1
    return v0

    .line 177
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    goto :goto_0

    .line 181
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method private static b(FFFF)F
    .locals 2

    .prologue
    .line 345
    sub-float v0, p0, p2

    .line 346
    sub-float v1, p1, p3

    .line 347
    mul-float/2addr v0, v0

    mul-float/2addr v1, v1

    add-float/2addr v0, v1

    invoke-static {v0}, Landroid/util/FloatMath;->sqrt(F)F

    move-result v0

    return v0
.end method

.method private b()Z
    .locals 5

    .prologue
    .line 185
    new-instance v0, Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 186
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/freecrop/l;->k()Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 187
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/freecrop/l;->h()Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 188
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v1

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v2

    cmpl-float v1, v1, v2

    if-lez v1, :cond_0

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    .line 189
    :goto_0
    iget v1, p0, Lcom/roidapp/imagelib/freecrop/a;->r:I

    int-to-float v1, v1

    const v2, 0x3dcccccd    # 0.1f

    mul-float/2addr v1, v2

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 190
    const/4 v0, 0x1

    .line 192
    :goto_1
    return v0

    .line 188
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    goto :goto_0

    .line 192
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method private c()Landroid/graphics/Rect;
    .locals 5

    .prologue
    .line 197
    new-instance v0, Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 199
    new-instance v1, Landroid/graphics/Rect;

    iget v2, v0, Landroid/graphics/RectF;->left:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iget v3, v0, Landroid/graphics/RectF;->top:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    iget v4, v0, Landroid/graphics/RectF;->right:F

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-direct {v1, v2, v3, v4, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v1
.end method


# virtual methods
.method public final a(FF)I
    .locals 8

    .prologue
    const/high16 v4, 0x40000000    # 2.0f

    const/high16 v7, 0x41f00000    # 30.0f

    .line 208
    invoke-direct {p0}, Lcom/roidapp/imagelib/freecrop/a;->c()Landroid/graphics/Rect;

    .line 210
    const/4 v0, 0x0

    .line 212
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->right:F

    add-float/2addr v1, v2

    div-float/2addr v1, v4

    .line 213
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    add-float/2addr v2, v3

    div-float/2addr v2, v4

    .line 214
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    if-eqz v3, :cond_2

    .line 215
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v3}, Lcom/roidapp/imagelib/freecrop/l;->i()Landroid/graphics/Matrix;

    move-result-object v3

    invoke-static {p1, p2, v3}, Lcom/roidapp/imagelib/freecrop/a;->a(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v3

    .line 217
    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v4}, Lcom/roidapp/imagelib/freecrop/l;->k()Landroid/graphics/Matrix;

    move-result-object v4

    invoke-static {v1, v2, v4}, Lcom/roidapp/imagelib/freecrop/a;->a(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v1

    .line 218
    new-instance v2, Landroid/graphics/PointF;

    iget v4, v3, Landroid/graphics/PointF;->x:F

    iget v3, v3, Landroid/graphics/PointF;->y:F

    invoke-direct {v2, v4, v3}, Landroid/graphics/PointF;-><init>(FF)V

    new-instance v3, Landroid/graphics/PointF;

    iget v4, v1, Landroid/graphics/PointF;->x:F

    iget v1, v1, Landroid/graphics/PointF;->y:F

    invoke-direct {v3, v4, v1}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-static {v2, v3}, Lcom/roidapp/imagelib/freecrop/a;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    move-result v1

    iput v1, p0, Lcom/roidapp/imagelib/freecrop/a;->p:F

    .line 220
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 221
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v2}, Lcom/roidapp/imagelib/freecrop/l;->k()Landroid/graphics/Matrix;

    move-result-object v2

    invoke-virtual {v1, v2, v1}, Landroid/graphics/Matrix;->setConcat(Landroid/graphics/Matrix;Landroid/graphics/Matrix;)Z

    .line 222
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v2}, Lcom/roidapp/imagelib/freecrop/l;->h()Landroid/graphics/Matrix;

    move-result-object v2

    invoke-virtual {v1, v2, v1}, Landroid/graphics/Matrix;->setConcat(Landroid/graphics/Matrix;Landroid/graphics/Matrix;)Z

    .line 223
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->top:F

    invoke-static {v2, v3, v1}, Lcom/roidapp/imagelib/freecrop/a;->a(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v2

    .line 224
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->top:F

    invoke-static {v3, v4, v1}, Lcom/roidapp/imagelib/freecrop/a;->a(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v3

    .line 225
    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->right:F

    iget-object v5, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v5, v5, Landroid/graphics/RectF;->bottom:F

    invoke-static {v4, v5, v1}, Lcom/roidapp/imagelib/freecrop/a;->a(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v4

    .line 226
    iget-object v5, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v5, v5, Landroid/graphics/RectF;->left:F

    iget-object v6, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v6, v6, Landroid/graphics/RectF;->bottom:F

    invoke-static {v5, v6, v1}, Lcom/roidapp/imagelib/freecrop/a;->a(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v5

    .line 228
    iget v6, v2, Landroid/graphics/PointF;->x:F

    iget v2, v2, Landroid/graphics/PointF;->y:F

    invoke-static {p1, p2, v6, v2}, Lcom/roidapp/imagelib/freecrop/a;->b(FFFF)F

    move-result v2

    cmpg-float v2, v2, v7

    if-gez v2, :cond_3

    .line 229
    const/4 v0, 0x1

    .line 237
    :cond_0
    :goto_0
    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    .line 238
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 264
    if-nez v0, :cond_1

    invoke-virtual {v2, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 265
    const/4 v0, 0x5

    .line 268
    :cond_1
    const/4 v1, 0x0

    iput v1, p0, Lcom/roidapp/imagelib/freecrop/a;->q:F

    .line 271
    :cond_2
    return v0

    .line 230
    :cond_3
    iget v2, v3, Landroid/graphics/PointF;->x:F

    iget v3, v3, Landroid/graphics/PointF;->y:F

    invoke-static {p1, p2, v2, v3}, Lcom/roidapp/imagelib/freecrop/a;->b(FFFF)F

    move-result v2

    cmpg-float v2, v2, v7

    if-gez v2, :cond_4

    .line 231
    const/4 v0, 0x2

    goto :goto_0

    .line 232
    :cond_4
    iget v2, v4, Landroid/graphics/PointF;->x:F

    iget v3, v4, Landroid/graphics/PointF;->y:F

    invoke-static {p1, p2, v2, v3}, Lcom/roidapp/imagelib/freecrop/a;->b(FFFF)F

    move-result v2

    cmpg-float v2, v2, v7

    if-gez v2, :cond_5

    .line 233
    const/4 v0, 0x4

    goto :goto_0

    .line 234
    :cond_5
    iget v2, v5, Landroid/graphics/PointF;->x:F

    iget v3, v5, Landroid/graphics/PointF;->y:F

    invoke-static {p1, p2, v2, v3}, Lcom/roidapp/imagelib/freecrop/a;->b(FFFF)F

    move-result v2

    cmpg-float v2, v2, v7

    if-gez v2, :cond_0

    .line 235
    const/4 v0, 0x3

    goto :goto_0
.end method

.method public final a(FFFF)V
    .locals 2

    .prologue
    .line 203
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0, p1, p2}, Landroid/graphics/PointF;-><init>(FF)V

    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1, p3, p4}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-static {v0, v1}, Lcom/roidapp/imagelib/freecrop/a;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/a;->p:F

    .line 204
    return-void
.end method

.method public final a(I)V
    .locals 1

    .prologue
    .line 167
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/a;->s:I

    if-eq p1, v0, :cond_0

    .line 168
    iput p1, p0, Lcom/roidapp/imagelib/freecrop/a;->s:I

    .line 169
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/a;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 171
    :cond_0
    return-void
.end method

.method public final a(Landroid/graphics/Canvas;)V
    .locals 12

    .prologue
    const/high16 v8, 0x40000000    # 2.0f

    const/high16 v11, 0x3f800000    # 1.0f

    .line 76
    iget-boolean v0, p0, Lcom/roidapp/imagelib/freecrop/a;->i:Z

    if-eqz v0, :cond_1

    .line 164
    :cond_0
    :goto_0
    return-void

    .line 80
    :cond_1
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 81
    new-instance v1, Landroid/graphics/RectF;

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    invoke-direct {v1, v2}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    sget-object v2, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 82
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/a;->n:Landroid/graphics/Paint;

    const v2, -0x77ffff01

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 84
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/a;->n:Landroid/graphics/Paint;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 85
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/a;->n:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 88
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/a;->s:I

    sget v1, Lcom/roidapp/imagelib/freecrop/b;->a:I

    if-eq v0, v1, :cond_2

    iget v0, p0, Lcom/roidapp/imagelib/freecrop/a;->s:I

    sget v1, Lcom/roidapp/imagelib/freecrop/b;->c:I

    if-ne v0, v1, :cond_0

    .line 89
    :cond_2
    iget-boolean v0, p0, Lcom/roidapp/imagelib/freecrop/a;->h:Z

    if-eqz v0, :cond_3

    .line 90
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/a;->j:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    .line 91
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/a;->j:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    .line 93
    const-wide v2, 0x3fe921fb54442d18L    # 0.7853981633974483

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v4

    float-to-double v4, v4

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double/2addr v4, v6

    mul-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-int v2, v2

    .line 94
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->left:F

    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v4

    div-float/2addr v4, v8

    add-float/2addr v3, v4

    int-to-float v4, v2

    add-float/2addr v3, v4

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    sub-float v0, v3, v0

    float-to-int v0, v0

    .line 95
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->top:F

    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v4

    div-float/2addr v4, v8

    add-float/2addr v3, v4

    int-to-float v2, v2

    sub-float v2, v3, v2

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    sub-float v1, v2, v1

    float-to-int v1, v1

    .line 96
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/a;->j:Landroid/graphics/drawable/Drawable;

    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/a;->j:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    add-int/2addr v3, v0

    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/a;->j:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    add-int/2addr v4, v1

    invoke-virtual {v2, v0, v1, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 98
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/a;->j:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    goto/16 :goto_0

    .line 100
    :cond_3
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    float-to-int v0, v0

    .line 101
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->right:F

    float-to-int v1, v1

    .line 102
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    float-to-int v2, v2

    .line 103
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    float-to-int v3, v3

    .line 105
    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/a;->j:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    .line 106
    iget-object v5, p0, Lcom/roidapp/imagelib/freecrop/a;->j:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v5

    div-int/lit8 v5, v5, 0x2

    .line 127
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 128
    iget-object v6, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    if-eqz v6, :cond_4

    .line 129
    iget-object v6, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v6}, Lcom/roidapp/imagelib/freecrop/l;->n()F

    move-result v6

    iget-object v7, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    iget v7, v7, Lcom/roidapp/imagelib/freecrop/l;->D:F

    mul-float/2addr v6, v7

    div-float v6, v11, v6

    iget-object v7, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v7}, Lcom/roidapp/imagelib/freecrop/l;->n()F

    move-result v7

    iget-object v8, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    iget v8, v8, Lcom/roidapp/imagelib/freecrop/l;->E:F

    mul-float/2addr v7, v8

    div-float v7, v11, v7

    int-to-float v8, v0

    int-to-float v9, v2

    invoke-virtual {p1, v6, v7, v8, v9}, Landroid/graphics/Canvas;->scale(FFFF)V

    .line 130
    :cond_4
    iget-object v6, p0, Lcom/roidapp/imagelib/freecrop/a;->j:Landroid/graphics/drawable/Drawable;

    sub-int v7, v0, v4

    sub-int v8, v2, v5

    add-int v9, v0, v4

    add-int v10, v2, v5

    invoke-virtual {v6, v7, v8, v9, v10}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 132
    iget-object v6, p0, Lcom/roidapp/imagelib/freecrop/a;->j:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v6, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 133
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 135
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 136
    iget-object v6, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    if-eqz v6, :cond_5

    .line 137
    iget-object v6, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v6}, Lcom/roidapp/imagelib/freecrop/l;->n()F

    move-result v6

    iget-object v7, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    iget v7, v7, Lcom/roidapp/imagelib/freecrop/l;->D:F

    mul-float/2addr v6, v7

    div-float v6, v11, v6

    iget-object v7, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v7}, Lcom/roidapp/imagelib/freecrop/l;->n()F

    move-result v7

    iget-object v8, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    iget v8, v8, Lcom/roidapp/imagelib/freecrop/l;->E:F

    mul-float/2addr v7, v8

    div-float v7, v11, v7

    int-to-float v8, v1

    int-to-float v9, v2

    invoke-virtual {p1, v6, v7, v8, v9}, Landroid/graphics/Canvas;->scale(FFFF)V

    .line 138
    :cond_5
    iget-object v6, p0, Lcom/roidapp/imagelib/freecrop/a;->j:Landroid/graphics/drawable/Drawable;

    sub-int v7, v1, v4

    sub-int v8, v2, v5

    add-int v9, v1, v4

    add-int/2addr v2, v5

    invoke-virtual {v6, v7, v8, v9, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 140
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/a;->j:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 142
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 144
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 145
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    if-eqz v2, :cond_6

    .line 146
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v2}, Lcom/roidapp/imagelib/freecrop/l;->n()F

    move-result v2

    iget-object v6, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    iget v6, v6, Lcom/roidapp/imagelib/freecrop/l;->D:F

    mul-float/2addr v2, v6

    div-float v2, v11, v2

    iget-object v6, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v6}, Lcom/roidapp/imagelib/freecrop/l;->n()F

    move-result v6

    iget-object v7, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    iget v7, v7, Lcom/roidapp/imagelib/freecrop/l;->E:F

    mul-float/2addr v6, v7

    div-float v6, v11, v6

    int-to-float v7, v0

    int-to-float v8, v3

    invoke-virtual {p1, v2, v6, v7, v8}, Landroid/graphics/Canvas;->scale(FFFF)V

    .line 147
    :cond_6
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/a;->j:Landroid/graphics/drawable/Drawable;

    sub-int v6, v0, v4

    sub-int v7, v3, v5

    add-int/2addr v0, v4

    add-int v4, v3, v5

    invoke-virtual {v2, v6, v7, v0, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 149
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/a;->j:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 150
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 152
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/a;->k:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    .line 153
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/a;->k:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    .line 154
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 155
    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    if-eqz v4, :cond_7

    .line 156
    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v4}, Lcom/roidapp/imagelib/freecrop/l;->n()F

    move-result v4

    iget-object v5, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    iget v5, v5, Lcom/roidapp/imagelib/freecrop/l;->D:F

    mul-float/2addr v4, v5

    div-float v4, v11, v4

    iget-object v5, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v5}, Lcom/roidapp/imagelib/freecrop/l;->n()F

    move-result v5

    iget-object v6, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    iget v6, v6, Lcom/roidapp/imagelib/freecrop/l;->E:F

    mul-float/2addr v5, v6

    div-float v5, v11, v5

    int-to-float v6, v1

    int-to-float v7, v3

    invoke-virtual {p1, v4, v5, v6, v7}, Landroid/graphics/Canvas;->scale(FFFF)V

    .line 157
    :cond_7
    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/a;->k:Landroid/graphics/drawable/Drawable;

    sub-int v5, v1, v0

    sub-int v6, v3, v2

    add-int/2addr v0, v1

    add-int v1, v3, v2

    invoke-virtual {v4, v5, v6, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 159
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/a;->k:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 160
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    goto/16 :goto_0
.end method

.method public final a(Landroid/graphics/Matrix;Landroid/graphics/RectF;Landroid/graphics/RectF;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/high16 v3, 0x40400000    # 3.0f

    const/16 v2, 0x32

    .line 557
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0, p1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/a;->c:Landroid/graphics/Matrix;

    .line 559
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/a;->e:Landroid/graphics/Bitmap;

    .line 560
    iput-object p3, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    .line 561
    iput-object p2, p0, Lcom/roidapp/imagelib/freecrop/a;->d:Landroid/graphics/RectF;

    .line 562
    iput-boolean v4, p0, Lcom/roidapp/imagelib/freecrop/a;->f:Z

    .line 564
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v1

    div-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/a;->g:F

    .line 566
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/a;->l:Landroid/graphics/Paint;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1, v2, v2, v2}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 567
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    if-eqz v0, :cond_0

    .line 568
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/a;->n:Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/freecrop/l;->n()F

    move-result v1

    div-float v1, v3, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 571
    :goto_0
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/a;->n:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 572
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/a;->n:Landroid/graphics/Paint;

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 574
    sget v0, Lcom/roidapp/imagelib/freecrop/b;->a:I

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/a;->s:I

    .line 575
    return-void

    .line 570
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/a;->n:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    goto :goto_0
.end method

.method public final a(ZIFFFFFF)V
    .locals 10

    .prologue
    .line 277
    invoke-direct {p0}, Lcom/roidapp/imagelib/freecrop/a;->c()Landroid/graphics/Rect;

    .line 278
    if-eqz p1, :cond_5

    .line 1359
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    if-eqz v2, :cond_2

    .line 1360
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    add-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    .line 1361
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->top:F

    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    add-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    .line 1362
    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v4}, Lcom/roidapp/imagelib/freecrop/l;->i()Landroid/graphics/Matrix;

    move-result-object v4

    move/from16 v0, p6

    invoke-static {p5, v0, v4}, Lcom/roidapp/imagelib/freecrop/a;->a(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v4

    .line 1363
    iget-object v5, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v5}, Lcom/roidapp/imagelib/freecrop/l;->i()Landroid/graphics/Matrix;

    move-result-object v5

    move/from16 v0, p7

    move/from16 v1, p8

    invoke-static {v0, v1, v5}, Lcom/roidapp/imagelib/freecrop/a;->a(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v5

    .line 1364
    iget-object v6, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v6}, Lcom/roidapp/imagelib/freecrop/l;->k()Landroid/graphics/Matrix;

    move-result-object v6

    invoke-static {v2, v3, v6}, Lcom/roidapp/imagelib/freecrop/a;->a(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v3

    .line 1365
    new-instance v2, Landroid/graphics/PointF;

    iget v6, v4, Landroid/graphics/PointF;->x:F

    iget v7, v4, Landroid/graphics/PointF;->y:F

    invoke-direct {v2, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    new-instance v6, Landroid/graphics/PointF;

    iget v7, v5, Landroid/graphics/PointF;->x:F

    iget v8, v5, Landroid/graphics/PointF;->y:F

    invoke-direct {v6, v7, v8}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-static {v2, v6}, Lcom/roidapp/imagelib/freecrop/a;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    move-result v2

    .line 1366
    iget v6, p0, Lcom/roidapp/imagelib/freecrop/a;->p:F

    sub-float/2addr v6, v2

    .line 1368
    iget-object v7, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    iget v8, v3, Landroid/graphics/PointF;->x:F

    iget v9, v3, Landroid/graphics/PointF;->y:F

    invoke-virtual {v7, v6, v8, v9}, Lcom/roidapp/imagelib/freecrop/l;->c(FFF)V

    .line 1370
    iput v2, p0, Lcom/roidapp/imagelib/freecrop/a;->p:F

    .line 1372
    iget v2, v4, Landroid/graphics/PointF;->x:F

    iget v4, v4, Landroid/graphics/PointF;->y:F

    iget v6, v5, Landroid/graphics/PointF;->x:F

    iget v5, v5, Landroid/graphics/PointF;->y:F

    invoke-static {v2, v4, v6, v5}, Lcom/roidapp/imagelib/freecrop/a;->b(FFFF)F

    move-result v4

    .line 1373
    iget v2, p0, Lcom/roidapp/imagelib/freecrop/a;->q:F

    const/4 v5, 0x0

    cmpl-float v2, v2, v5

    if-eqz v2, :cond_1

    .line 1374
    iget v2, p0, Lcom/roidapp/imagelib/freecrop/a;->q:F

    div-float v2, v4, v2

    .line 1375
    const/high16 v5, 0x3f800000    # 1.0f

    cmpl-float v5, v2, v5

    if-lez v5, :cond_3

    .line 1376
    invoke-direct {p0}, Lcom/roidapp/imagelib/freecrop/a;->a()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 1377
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1378
    :cond_0
    iget-object v5, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    iget v6, v3, Landroid/graphics/PointF;->x:F

    iget v3, v3, Landroid/graphics/PointF;->y:F

    invoke-virtual {v5, v2, v2, v6, v3}, Lcom/roidapp/imagelib/freecrop/l;->b(FFFF)V

    .line 1390
    :cond_1
    :goto_0
    iput v4, p0, Lcom/roidapp/imagelib/freecrop/a;->q:F

    .line 319
    :cond_2
    :goto_1
    return-void

    .line 1383
    :cond_3
    invoke-direct {p0}, Lcom/roidapp/imagelib/freecrop/a;->b()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 1384
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1385
    :cond_4
    iget-object v5, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    iget v6, v3, Landroid/graphics/PointF;->x:F

    iget v3, v3, Landroid/graphics/PointF;->y:F

    invoke-virtual {v5, v2, v2, v6, v3}, Lcom/roidapp/imagelib/freecrop/l;->b(FFFF)V

    goto :goto_0

    .line 281
    :cond_5
    if-eqz p2, :cond_2

    .line 283
    const/4 v2, 0x5

    if-ne p2, v2, :cond_6

    .line 1459
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v2, p3, p4}, Lcom/roidapp/imagelib/freecrop/l;->b(FF)V

    .line 1460
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/a;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    goto :goto_1

    .line 286
    :cond_6
    const/4 v2, 0x4

    if-ne v2, p2, :cond_b

    .line 2421
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    if-eqz v2, :cond_2

    .line 2422
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    add-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    .line 2423
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->top:F

    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    add-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    .line 2424
    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v4}, Lcom/roidapp/imagelib/freecrop/l;->i()Landroid/graphics/Matrix;

    move-result-object v4

    move/from16 v0, p6

    invoke-static {p5, v0, v4}, Lcom/roidapp/imagelib/freecrop/a;->a(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v4

    .line 2425
    iget-object v5, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v5}, Lcom/roidapp/imagelib/freecrop/l;->k()Landroid/graphics/Matrix;

    move-result-object v5

    invoke-static {v2, v3, v5}, Lcom/roidapp/imagelib/freecrop/a;->a(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v3

    .line 2426
    new-instance v2, Landroid/graphics/PointF;

    iget v5, v4, Landroid/graphics/PointF;->x:F

    iget v6, v4, Landroid/graphics/PointF;->y:F

    invoke-direct {v2, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    new-instance v5, Landroid/graphics/PointF;

    iget v6, v3, Landroid/graphics/PointF;->x:F

    iget v7, v3, Landroid/graphics/PointF;->y:F

    invoke-direct {v5, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-static {v2, v5}, Lcom/roidapp/imagelib/freecrop/a;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    move-result v2

    .line 2427
    iget v5, p0, Lcom/roidapp/imagelib/freecrop/a;->p:F

    sub-float/2addr v5, v2

    .line 2429
    iget-object v6, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    iget v7, v3, Landroid/graphics/PointF;->x:F

    iget v8, v3, Landroid/graphics/PointF;->y:F

    invoke-virtual {v6, v5, v7, v8}, Lcom/roidapp/imagelib/freecrop/l;->c(FFF)V

    .line 2431
    iput v2, p0, Lcom/roidapp/imagelib/freecrop/a;->p:F

    .line 2433
    iget v2, v4, Landroid/graphics/PointF;->x:F

    iget v4, v4, Landroid/graphics/PointF;->y:F

    iget v5, v3, Landroid/graphics/PointF;->x:F

    iget v6, v3, Landroid/graphics/PointF;->y:F

    invoke-static {v2, v4, v5, v6}, Lcom/roidapp/imagelib/freecrop/a;->b(FFFF)F

    move-result v4

    .line 2435
    iget v2, p0, Lcom/roidapp/imagelib/freecrop/a;->q:F

    const/4 v5, 0x0

    cmpl-float v2, v2, v5

    if-eqz v2, :cond_8

    .line 2436
    iget v2, p0, Lcom/roidapp/imagelib/freecrop/a;->q:F

    div-float v2, v4, v2

    .line 2437
    const/high16 v5, 0x3f800000    # 1.0f

    cmpl-float v5, v2, v5

    if-lez v5, :cond_9

    .line 2438
    invoke-direct {p0}, Lcom/roidapp/imagelib/freecrop/a;->a()Z

    move-result v5

    if-eqz v5, :cond_7

    .line 2439
    const/high16 v2, 0x3f800000    # 1.0f

    .line 2440
    :cond_7
    iget-object v5, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    iget v6, v3, Landroid/graphics/PointF;->x:F

    iget v3, v3, Landroid/graphics/PointF;->y:F

    invoke-virtual {v5, v2, v2, v6, v3}, Lcom/roidapp/imagelib/freecrop/l;->b(FFFF)V

    .line 2452
    :cond_8
    :goto_2
    iput v4, p0, Lcom/roidapp/imagelib/freecrop/a;->q:F

    goto/16 :goto_1

    .line 2445
    :cond_9
    invoke-direct {p0}, Lcom/roidapp/imagelib/freecrop/a;->b()Z

    move-result v5

    if-eqz v5, :cond_a

    .line 2446
    const/high16 v2, 0x3f800000    # 1.0f

    .line 2447
    :cond_a
    iget-object v5, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    iget v6, v3, Landroid/graphics/PointF;->x:F

    iget v3, v3, Landroid/graphics/PointF;->y:F

    invoke-virtual {v5, v2, v2, v6, v3}, Lcom/roidapp/imagelib/freecrop/l;->b(FFFF)V

    goto :goto_2

    .line 289
    :cond_b
    const/4 v2, 0x1

    if-eq v2, p2, :cond_c

    const/4 v2, 0x2

    if-eq v2, p2, :cond_c

    const/4 v2, 0x3

    if-ne v2, p2, :cond_2

    .line 3395
    :cond_c
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    if-eqz v2, :cond_2

    .line 3396
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    add-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    .line 3397
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->top:F

    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    add-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    .line 3398
    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v4}, Lcom/roidapp/imagelib/freecrop/l;->i()Landroid/graphics/Matrix;

    move-result-object v4

    move/from16 v0, p6

    invoke-static {p5, v0, v4}, Lcom/roidapp/imagelib/freecrop/a;->a(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v4

    .line 3399
    iget-object v5, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    invoke-virtual {v5}, Lcom/roidapp/imagelib/freecrop/l;->k()Landroid/graphics/Matrix;

    move-result-object v5

    invoke-static {v2, v3, v5}, Lcom/roidapp/imagelib/freecrop/a;->a(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v3

    .line 3401
    iget v2, v4, Landroid/graphics/PointF;->x:F

    iget v4, v4, Landroid/graphics/PointF;->y:F

    iget v5, v3, Landroid/graphics/PointF;->x:F

    iget v6, v3, Landroid/graphics/PointF;->y:F

    invoke-static {v2, v4, v5, v6}, Lcom/roidapp/imagelib/freecrop/a;->b(FFFF)F

    move-result v4

    .line 3403
    iget v2, p0, Lcom/roidapp/imagelib/freecrop/a;->q:F

    const/4 v5, 0x0

    cmpl-float v2, v2, v5

    if-eqz v2, :cond_e

    .line 3404
    iget v2, p0, Lcom/roidapp/imagelib/freecrop/a;->q:F

    div-float v2, v4, v2

    .line 3405
    const/high16 v5, 0x3f800000    # 1.0f

    cmpl-float v5, v2, v5

    if-lez v5, :cond_f

    .line 3406
    invoke-direct {p0}, Lcom/roidapp/imagelib/freecrop/a;->a()Z

    move-result v5

    if-eqz v5, :cond_d

    .line 3407
    const/high16 v2, 0x3f800000    # 1.0f

    .line 3408
    :cond_d
    iget-object v5, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    iget v6, v3, Landroid/graphics/PointF;->x:F

    iget v3, v3, Landroid/graphics/PointF;->y:F

    invoke-virtual {v5, v2, v2, v6, v3}, Lcom/roidapp/imagelib/freecrop/l;->b(FFFF)V

    .line 3415
    :cond_e
    :goto_3
    iput v4, p0, Lcom/roidapp/imagelib/freecrop/a;->q:F

    goto/16 :goto_1

    .line 3410
    :cond_f
    invoke-direct {p0}, Lcom/roidapp/imagelib/freecrop/a;->b()Z

    move-result v5

    if-eqz v5, :cond_10

    .line 3411
    const/high16 v2, 0x3f800000    # 1.0f

    .line 3412
    :cond_10
    iget-object v5, p0, Lcom/roidapp/imagelib/freecrop/a;->o:Lcom/roidapp/imagelib/freecrop/l;

    iget v6, v3, Landroid/graphics/PointF;->x:F

    iget v3, v3, Landroid/graphics/PointF;->y:F

    invoke-virtual {v5, v2, v2, v6, v3}, Lcom/roidapp/imagelib/freecrop/l;->b(FFFF)V

    goto :goto_3
.end method
