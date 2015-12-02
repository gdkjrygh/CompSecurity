.class public Lcom/qihoo/security/widget/CircleImageView;
.super Landroid/widget/ImageView;
.source "360Security"


# static fields
.field private static final a:Landroid/widget/ImageView$ScaleType;

.field private static final b:Landroid/graphics/Bitmap$Config;


# instance fields
.field private final c:Landroid/graphics/RectF;

.field private final d:Landroid/graphics/RectF;

.field private final e:Landroid/graphics/Matrix;

.field private final f:Landroid/graphics/Paint;

.field private final g:Landroid/graphics/Paint;

.field private h:I

.field private i:I

.field private j:Landroid/graphics/Paint$Style;

.field private k:Landroid/graphics/Bitmap;

.field private l:Landroid/graphics/BitmapShader;

.field private m:I

.field private n:I

.field private o:F

.field private p:F

.field private q:Landroid/graphics/ColorFilter;

.field private r:Z

.field private s:Z

.field private t:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    sput-object v0, Lcom/qihoo/security/widget/CircleImageView;->a:Landroid/widget/ImageView$ScaleType;

    .line 30
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    sput-object v0, Lcom/qihoo/security/widget/CircleImageView;->b:Landroid/graphics/Bitmap$Config;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 65
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 39
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->c:Landroid/graphics/RectF;

    .line 40
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->d:Landroid/graphics/RectF;

    .line 42
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->e:Landroid/graphics/Matrix;

    .line 43
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->f:Landroid/graphics/Paint;

    .line 44
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->g:Landroid/graphics/Paint;

    .line 46
    const/high16 v0, -0x1000000

    iput v0, p0, Lcom/qihoo/security/widget/CircleImageView;->h:I

    .line 47
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/widget/CircleImageView;->i:I

    .line 48
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    iput-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->j:Landroid/graphics/Paint$Style;

    .line 67
    invoke-direct {p0}, Lcom/qihoo/security/widget/CircleImageView;->a()V

    .line 68
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 71
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/qihoo/security/widget/CircleImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 72
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .prologue
    const/high16 v3, -0x1000000

    const/4 v2, 0x0

    .line 75
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 39
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->c:Landroid/graphics/RectF;

    .line 40
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->d:Landroid/graphics/RectF;

    .line 42
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->e:Landroid/graphics/Matrix;

    .line 43
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->f:Landroid/graphics/Paint;

    .line 44
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->g:Landroid/graphics/Paint;

    .line 46
    iput v3, p0, Lcom/qihoo/security/widget/CircleImageView;->h:I

    .line 47
    iput v2, p0, Lcom/qihoo/security/widget/CircleImageView;->i:I

    .line 48
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    iput-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->j:Landroid/graphics/Paint$Style;

    .line 77
    sget-object v0, Lcom/qihoo/security/lite/a$a;->CircleImageView:[I

    invoke-virtual {p1, p2, v0, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 79
    invoke-virtual {v1, v2, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/CircleImageView;->i:I

    .line 80
    const/4 v0, 0x1

    invoke-virtual {v1, v0, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/CircleImageView;->h:I

    .line 81
    const/4 v0, 0x3

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/widget/CircleImageView;->t:Z

    .line 82
    const/4 v0, 0x2

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    :goto_0
    iput-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->j:Landroid/graphics/Paint$Style;

    .line 85
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 87
    invoke-direct {p0}, Lcom/qihoo/security/widget/CircleImageView;->a()V

    .line 88
    return-void

    .line 82
    :cond_0
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    goto :goto_0
.end method

.method private a(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 234
    if-nez p1, :cond_0

    .line 257
    :goto_0
    return-object v0

    .line 238
    :cond_0
    instance-of v1, p1, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v1, :cond_1

    .line 239
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0

    .line 245
    :cond_1
    :try_start_0
    instance-of v1, p1, Landroid/graphics/drawable/ColorDrawable;

    if-eqz v1, :cond_2

    .line 246
    const/4 v1, 0x2

    const/4 v2, 0x2

    sget-object v3, Lcom/qihoo/security/widget/CircleImageView;->b:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 252
    :goto_1
    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 253
    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v2}, Landroid/graphics/Canvas;->getWidth()I

    move-result v5

    invoke-virtual {v2}, Landroid/graphics/Canvas;->getHeight()I

    move-result v6

    invoke-virtual {p1, v3, v4, v5, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 254
    invoke-virtual {p1, v2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    move-object v0, v1

    .line 255
    goto :goto_0

    .line 248
    :cond_2
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    sget-object v3, Lcom/qihoo/security/widget/CircleImageView;->b:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    goto :goto_1

    .line 256
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method private a()V
    .locals 1

    .prologue
    .line 91
    sget-object v0, Lcom/qihoo/security/widget/CircleImageView;->a:Landroid/widget/ImageView$ScaleType;

    invoke-super {p0, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 92
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/widget/CircleImageView;->r:Z

    .line 94
    iget-boolean v0, p0, Lcom/qihoo/security/widget/CircleImageView;->s:Z

    if-eqz v0, :cond_0

    .line 95
    invoke-direct {p0}, Lcom/qihoo/security/widget/CircleImageView;->b()V

    .line 96
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/widget/CircleImageView;->s:Z

    .line 98
    :cond_0
    return-void
.end method

.method private b()V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x1

    const/high16 v4, 0x40000000    # 2.0f

    .line 262
    iget-boolean v0, p0, Lcom/qihoo/security/widget/CircleImageView;->r:Z

    if-nez v0, :cond_1

    .line 263
    iput-boolean v5, p0, Lcom/qihoo/security/widget/CircleImageView;->s:Z

    .line 295
    :cond_0
    :goto_0
    return-void

    .line 267
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->k:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 271
    new-instance v0, Landroid/graphics/BitmapShader;

    iget-object v1, p0, Lcom/qihoo/security/widget/CircleImageView;->k:Landroid/graphics/Bitmap;

    sget-object v2, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    sget-object v3, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct {v0, v1, v2, v3}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    iput-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->l:Landroid/graphics/BitmapShader;

    .line 273
    iget-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->f:Landroid/graphics/Paint;

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 274
    iget-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->f:Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/qihoo/security/widget/CircleImageView;->l:Landroid/graphics/BitmapShader;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 276
    iget-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->g:Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/qihoo/security/widget/CircleImageView;->j:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 277
    iget-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->g:Landroid/graphics/Paint;

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 278
    iget-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->g:Landroid/graphics/Paint;

    iget v1, p0, Lcom/qihoo/security/widget/CircleImageView;->h:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 279
    iget-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->g:Landroid/graphics/Paint;

    iget v1, p0, Lcom/qihoo/security/widget/CircleImageView;->i:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 281
    iget-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/CircleImageView;->n:I

    .line 282
    iget-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/CircleImageView;->m:I

    .line 284
    iget-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->d:Landroid/graphics/RectF;

    invoke-virtual {p0}, Lcom/qihoo/security/widget/CircleImageView;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p0}, Lcom/qihoo/security/widget/CircleImageView;->getHeight()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v6, v6, v1, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 285
    iget-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->d:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    iget v1, p0, Lcom/qihoo/security/widget/CircleImageView;->i:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    div-float/2addr v0, v4

    iget-object v1, p0, Lcom/qihoo/security/widget/CircleImageView;->d:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    iget v2, p0, Lcom/qihoo/security/widget/CircleImageView;->i:I

    int-to-float v2, v2

    sub-float/2addr v1, v2

    div-float/2addr v1, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/CircleImageView;->p:F

    .line 287
    iget-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->c:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/qihoo/security/widget/CircleImageView;->d:Landroid/graphics/RectF;

    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 288
    iget-boolean v0, p0, Lcom/qihoo/security/widget/CircleImageView;->t:Z

    if-nez v0, :cond_2

    .line 289
    iget-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->c:Landroid/graphics/RectF;

    iget v1, p0, Lcom/qihoo/security/widget/CircleImageView;->i:I

    int-to-float v1, v1

    iget v2, p0, Lcom/qihoo/security/widget/CircleImageView;->i:I

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/RectF;->inset(FF)V

    .line 291
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->c:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    div-float/2addr v0, v4

    iget-object v1, p0, Lcom/qihoo/security/widget/CircleImageView;->c:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    div-float/2addr v1, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/CircleImageView;->o:F

    .line 292
    invoke-direct {p0}, Lcom/qihoo/security/widget/CircleImageView;->c()V

    .line 294
    invoke-virtual {p0}, Lcom/qihoo/security/widget/CircleImageView;->invalidate()V

    goto/16 :goto_0
.end method

.method private c()V
    .locals 9

    .prologue
    const/high16 v7, 0x40000000    # 2.0f

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v0, 0x0

    const/high16 v5, 0x3f000000    # 0.5f

    .line 299
    .line 302
    iget-object v1, p0, Lcom/qihoo/security/widget/CircleImageView;->e:Landroid/graphics/Matrix;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 304
    iget v1, p0, Lcom/qihoo/security/widget/CircleImageView;->m:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/qihoo/security/widget/CircleImageView;->c:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v2

    mul-float/2addr v1, v2

    iget-object v2, p0, Lcom/qihoo/security/widget/CircleImageView;->c:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v2

    iget v3, p0, Lcom/qihoo/security/widget/CircleImageView;->n:I

    int-to-float v3, v3

    mul-float/2addr v2, v3

    cmpl-float v1, v1, v2

    if-lez v1, :cond_0

    .line 305
    iget-object v1, p0, Lcom/qihoo/security/widget/CircleImageView;->c:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v1

    iget v2, p0, Lcom/qihoo/security/widget/CircleImageView;->n:I

    int-to-float v2, v2

    div-float v2, v1, v2

    .line 306
    iget-object v1, p0, Lcom/qihoo/security/widget/CircleImageView;->c:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    iget v3, p0, Lcom/qihoo/security/widget/CircleImageView;->m:I

    int-to-float v3, v3

    mul-float/2addr v3, v2

    sub-float/2addr v1, v3

    mul-float/2addr v1, v5

    .line 312
    :goto_0
    sget-object v3, Lcom/qihoo/security/widget/CircleImageView;->a:Landroid/widget/ImageView$ScaleType;

    sget-object v4, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v3, v4}, Landroid/widget/ImageView$ScaleType;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 313
    iget-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->e:Landroid/graphics/Matrix;

    invoke-virtual {v0, v6, v6}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 314
    iget-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->e:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/qihoo/security/widget/CircleImageView;->c:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    iget v2, p0, Lcom/qihoo/security/widget/CircleImageView;->m:I

    int-to-float v2, v2

    sub-float/2addr v1, v2

    div-float/2addr v1, v7

    iget-object v2, p0, Lcom/qihoo/security/widget/CircleImageView;->c:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    add-float/2addr v1, v2

    iget-object v2, p0, Lcom/qihoo/security/widget/CircleImageView;->c:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v2

    iget v3, p0, Lcom/qihoo/security/widget/CircleImageView;->n:I

    int-to-float v3, v3

    sub-float/2addr v2, v3

    div-float/2addr v2, v7

    iget-object v3, p0, Lcom/qihoo/security/widget/CircleImageView;->c:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->top:F

    add-float/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 320
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->l:Landroid/graphics/BitmapShader;

    iget-object v1, p0, Lcom/qihoo/security/widget/CircleImageView;->e:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/BitmapShader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 321
    return-void

    .line 308
    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/widget/CircleImageView;->c:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    iget v2, p0, Lcom/qihoo/security/widget/CircleImageView;->m:I

    int-to-float v2, v2

    div-float v2, v1, v2

    .line 309
    iget-object v1, p0, Lcom/qihoo/security/widget/CircleImageView;->c:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v1

    iget v3, p0, Lcom/qihoo/security/widget/CircleImageView;->n:I

    int-to-float v3, v3

    mul-float/2addr v3, v2

    sub-float/2addr v1, v3

    mul-float/2addr v1, v5

    move v8, v1

    move v1, v0

    move v0, v8

    goto :goto_0

    .line 317
    :cond_1
    iget-object v3, p0, Lcom/qihoo/security/widget/CircleImageView;->e:Landroid/graphics/Matrix;

    invoke-virtual {v3, v2, v2}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 318
    iget-object v2, p0, Lcom/qihoo/security/widget/CircleImageView;->e:Landroid/graphics/Matrix;

    add-float/2addr v1, v5

    float-to-int v1, v1

    int-to-float v1, v1

    iget-object v3, p0, Lcom/qihoo/security/widget/CircleImageView;->c:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->left:F

    add-float/2addr v1, v3

    add-float/2addr v0, v5

    float-to-int v0, v0

    int-to-float v0, v0

    iget-object v3, p0, Lcom/qihoo/security/widget/CircleImageView;->c:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->top:F

    add-float/2addr v0, v3

    invoke-virtual {v2, v1, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto :goto_1
.end method


# virtual methods
.method public getBorderColor()I
    .locals 1

    .prologue
    .line 138
    iget v0, p0, Lcom/qihoo/security/widget/CircleImageView;->h:I

    return v0
.end method

.method public getBorderStyle()Landroid/graphics/Paint$Style;
    .locals 1

    .prologue
    .line 156
    iget-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->j:Landroid/graphics/Paint$Style;

    return-object v0
.end method

.method public getBorderWidth()I
    .locals 1

    .prologue
    .line 169
    iget v0, p0, Lcom/qihoo/security/widget/CircleImageView;->i:I

    return v0
.end method

.method public getScaleType()Landroid/widget/ImageView$ScaleType;
    .locals 1

    .prologue
    .line 102
    sget-object v0, Lcom/qihoo/security/widget/CircleImageView;->a:Landroid/widget/ImageView$ScaleType;

    return-object v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .prologue
    .line 121
    invoke-virtual {p0}, Lcom/qihoo/security/widget/CircleImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    .line 129
    :goto_0
    return-void

    .line 125
    :cond_0
    iget v0, p0, Lcom/qihoo/security/widget/CircleImageView;->i:I

    if-eqz v0, :cond_1

    .line 126
    invoke-virtual {p0}, Lcom/qihoo/security/widget/CircleImageView;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-virtual {p0}, Lcom/qihoo/security/widget/CircleImageView;->getHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    iget v2, p0, Lcom/qihoo/security/widget/CircleImageView;->p:F

    iget-object v3, p0, Lcom/qihoo/security/widget/CircleImageView;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 128
    :cond_1
    invoke-virtual {p0}, Lcom/qihoo/security/widget/CircleImageView;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-virtual {p0}, Lcom/qihoo/security/widget/CircleImageView;->getHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    iget v2, p0, Lcom/qihoo/security/widget/CircleImageView;->o:F

    iget-object v3, p0, Lcom/qihoo/security/widget/CircleImageView;->f:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto :goto_0
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .prologue
    .line 133
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ImageView;->onSizeChanged(IIII)V

    .line 134
    invoke-direct {p0}, Lcom/qihoo/security/widget/CircleImageView;->b()V

    .line 135
    return-void
.end method

.method public setAdjustViewBounds(Z)V
    .locals 2

    .prologue
    .line 114
    if-eqz p1, :cond_0

    .line 115
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v1, "adjustViewBounds not supported."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 117
    :cond_0
    return-void
.end method

.method public setBorderColor(I)V
    .locals 2

    .prologue
    .line 142
    iget v0, p0, Lcom/qihoo/security/widget/CircleImageView;->h:I

    if-ne p1, v0, :cond_0

    .line 149
    :goto_0
    return-void

    .line 146
    :cond_0
    iput p1, p0, Lcom/qihoo/security/widget/CircleImageView;->h:I

    .line 147
    iget-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->g:Landroid/graphics/Paint;

    iget v1, p0, Lcom/qihoo/security/widget/CircleImageView;->h:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 148
    invoke-virtual {p0}, Lcom/qihoo/security/widget/CircleImageView;->invalidate()V

    goto :goto_0
.end method

.method public setBorderColorResource(I)V
    .locals 1

    .prologue
    .line 152
    invoke-virtual {p0}, Lcom/qihoo/security/widget/CircleImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/CircleImageView;->setBorderColor(I)V

    .line 153
    return-void
.end method

.method public setBorderOverlay(Z)V
    .locals 1

    .prologue
    .line 186
    iget-boolean v0, p0, Lcom/qihoo/security/widget/CircleImageView;->t:Z

    if-ne p1, v0, :cond_0

    .line 192
    :goto_0
    return-void

    .line 190
    :cond_0
    iput-boolean p1, p0, Lcom/qihoo/security/widget/CircleImageView;->t:Z

    .line 191
    invoke-direct {p0}, Lcom/qihoo/security/widget/CircleImageView;->b()V

    goto :goto_0
.end method

.method public setBorderStyle(Landroid/graphics/Paint$Style;)V
    .locals 1

    .prologue
    .line 160
    iget-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->j:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint$Style;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 166
    :goto_0
    return-void

    .line 164
    :cond_0
    iput-object p1, p0, Lcom/qihoo/security/widget/CircleImageView;->j:Landroid/graphics/Paint$Style;

    .line 165
    invoke-direct {p0}, Lcom/qihoo/security/widget/CircleImageView;->b()V

    goto :goto_0
.end method

.method public setBorderWidth(I)V
    .locals 1

    .prologue
    .line 173
    iget v0, p0, Lcom/qihoo/security/widget/CircleImageView;->i:I

    if-ne p1, v0, :cond_0

    .line 179
    :goto_0
    return-void

    .line 177
    :cond_0
    iput p1, p0, Lcom/qihoo/security/widget/CircleImageView;->i:I

    .line 178
    invoke-direct {p0}, Lcom/qihoo/security/widget/CircleImageView;->b()V

    goto :goto_0
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 2

    .prologue
    .line 224
    iget-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->q:Landroid/graphics/ColorFilter;

    if-ne p1, v0, :cond_0

    .line 231
    :goto_0
    return-void

    .line 228
    :cond_0
    iput-object p1, p0, Lcom/qihoo/security/widget/CircleImageView;->q:Landroid/graphics/ColorFilter;

    .line 229
    iget-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->f:Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/qihoo/security/widget/CircleImageView;->q:Landroid/graphics/ColorFilter;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 230
    invoke-virtual {p0}, Lcom/qihoo/security/widget/CircleImageView;->invalidate()V

    goto :goto_0
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .prologue
    .line 196
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 197
    iput-object p1, p0, Lcom/qihoo/security/widget/CircleImageView;->k:Landroid/graphics/Bitmap;

    .line 198
    invoke-direct {p0}, Lcom/qihoo/security/widget/CircleImageView;->b()V

    .line 199
    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .prologue
    .line 203
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 204
    invoke-direct {p0, p1}, Lcom/qihoo/security/widget/CircleImageView;->a(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->k:Landroid/graphics/Bitmap;

    .line 205
    invoke-direct {p0}, Lcom/qihoo/security/widget/CircleImageView;->b()V

    .line 206
    return-void
.end method

.method public setImageResource(I)V
    .locals 1

    .prologue
    .line 210
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 211
    invoke-virtual {p0}, Lcom/qihoo/security/widget/CircleImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/widget/CircleImageView;->a(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->k:Landroid/graphics/Bitmap;

    .line 212
    invoke-direct {p0}, Lcom/qihoo/security/widget/CircleImageView;->b()V

    .line 213
    return-void
.end method

.method public setImageURI(Landroid/net/Uri;)V
    .locals 1

    .prologue
    .line 217
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageURI(Landroid/net/Uri;)V

    .line 218
    invoke-virtual {p0}, Lcom/qihoo/security/widget/CircleImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/widget/CircleImageView;->a(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/widget/CircleImageView;->k:Landroid/graphics/Bitmap;

    .line 219
    invoke-direct {p0}, Lcom/qihoo/security/widget/CircleImageView;->b()V

    .line 220
    return-void
.end method

.method public setScaleType(Landroid/widget/ImageView$ScaleType;)V
    .locals 4

    .prologue
    .line 107
    sget-object v0, Lcom/qihoo/security/widget/CircleImageView;->a:Landroid/widget/ImageView$ScaleType;

    if-eq p1, v0, :cond_0

    .line 108
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v1, "ScaleType %s not supported."

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 110
    :cond_0
    return-void
.end method
