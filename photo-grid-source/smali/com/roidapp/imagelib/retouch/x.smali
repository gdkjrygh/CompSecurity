.class public final Lcom/roidapp/imagelib/retouch/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# static fields
.field private static final i:[F

.field private static final j:Landroid/view/animation/Interpolator;


# instance fields
.field private final a:Landroid/support/v4/view/GestureDetectorCompat;

.field private final b:Landroid/view/ScaleGestureDetector;

.field private final c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/widget/ImageView;",
            ">;"
        }
    .end annotation
.end field

.field private d:Landroid/widget/ImageView$ScaleType;

.field private e:Landroid/graphics/RectF;

.field private f:Landroid/graphics/Matrix;

.field private g:Landroid/graphics/Matrix;

.field private h:Landroid/graphics/Matrix;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 33
    const/16 v0, 0x9

    new-array v0, v0, [F

    sput-object v0, Lcom/roidapp/imagelib/retouch/x;->i:[F

    .line 40
    new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    sput-object v0, Lcom/roidapp/imagelib/retouch/x;->j:Landroid/view/animation/Interpolator;

    return-void
.end method

.method public constructor <init>(Landroid/widget/ImageView;)V
    .locals 3

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/x;->e:Landroid/graphics/RectF;

    .line 29
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/x;->f:Landroid/graphics/Matrix;

    .line 30
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/x;->g:Landroid/graphics/Matrix;

    .line 31
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/x;->h:Landroid/graphics/Matrix;

    .line 43
    new-instance v0, Landroid/support/v4/view/GestureDetectorCompat;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lcom/roidapp/imagelib/retouch/y;

    invoke-direct {v2, p0}, Lcom/roidapp/imagelib/retouch/y;-><init>(Lcom/roidapp/imagelib/retouch/x;)V

    invoke-direct {v0, v1, v2}, Landroid/support/v4/view/GestureDetectorCompat;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/x;->a:Landroid/support/v4/view/GestureDetectorCompat;

    .line 76
    new-instance v0, Landroid/view/ScaleGestureDetector;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lcom/roidapp/imagelib/retouch/z;

    invoke-direct {v2, p0}, Lcom/roidapp/imagelib/retouch/z;-><init>(Lcom/roidapp/imagelib/retouch/x;)V

    invoke-direct {v0, v1, v2}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/x;->b:Landroid/view/ScaleGestureDetector;

    .line 101
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/x;->c:Ljava/lang/ref/WeakReference;

    .line 102
    invoke-virtual {p1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/x;->d:Landroid/widget/ImageView$ScaleType;

    .line 1111
    if-eqz p1, :cond_0

    .line 1112
    sget-object v0, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView$ScaleType;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1113
    sget-object v0, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 104
    :cond_0
    return-void
.end method

.method private static a(Landroid/widget/ImageView;)I
    .locals 2

    .prologue
    .line 166
    if-nez p0, :cond_0

    .line 167
    const/4 v0, 0x0

    .line 168
    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0}, Landroid/widget/ImageView;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/ImageView;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/widget/ImageView;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/imagelib/retouch/x;)Landroid/graphics/Matrix;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/x;->h:Landroid/graphics/Matrix;

    return-object v0
.end method

.method private a(Landroid/graphics/Matrix;)Landroid/graphics/RectF;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 145
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/x;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 147
    if-eqz v0, :cond_0

    .line 148
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 149
    if-eqz v0, :cond_0

    .line 150
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/x;->e:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v1, v3, v3, v2, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 152
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/x;->e:Landroid/graphics/RectF;

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 153
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/x;->e:Landroid/graphics/RectF;

    .line 156
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static b(Landroid/widget/ImageView;)I
    .locals 2

    .prologue
    .line 172
    if-nez p0, :cond_0

    .line 173
    const/4 v0, 0x0

    .line 174
    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0}, Landroid/widget/ImageView;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/ImageView;->getPaddingTop()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/widget/ImageView;->getPaddingBottom()I

    move-result v1

    sub-int/2addr v0, v1

    goto :goto_0
.end method

.method private b(Landroid/graphics/Matrix;)V
    .locals 1

    .prologue
    .line 314
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/x;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 315
    if-nez v0, :cond_0

    .line 320
    :goto_0
    return-void

    .line 319
    :cond_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/imagelib/retouch/x;)V
    .locals 1

    .prologue
    .line 21
    .line 2178
    invoke-direct {p0}, Lcom/roidapp/imagelib/retouch/x;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2179
    invoke-direct {p0}, Lcom/roidapp/imagelib/retouch/x;->d()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/retouch/x;->b(Landroid/graphics/Matrix;)V

    .line 21
    :cond_0
    return-void
.end method

.method static synthetic c()Landroid/view/animation/Interpolator;
    .locals 1

    .prologue
    .line 21
    sget-object v0, Lcom/roidapp/imagelib/retouch/x;->j:Landroid/view/animation/Interpolator;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/imagelib/retouch/x;)Ljava/lang/ref/WeakReference;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/x;->c:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method private d()Landroid/graphics/Matrix;
    .locals 2

    .prologue
    .line 160
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/x;->g:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/x;->f:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 161
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/x;->g:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/x;->h:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 162
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/x;->g:Landroid/graphics/Matrix;

    return-object v0
.end method

.method private e()Z
    .locals 9

    .prologue
    const/4 v1, 0x0

    const/high16 v8, 0x40000000    # 2.0f

    const/4 v2, 0x0

    .line 184
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/x;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 185
    if-nez v0, :cond_0

    move v0, v1

    .line 236
    :goto_0
    return v0

    .line 189
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/imagelib/retouch/x;->d()Landroid/graphics/Matrix;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/roidapp/imagelib/retouch/x;->a(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    move-result-object v3

    .line 190
    if-nez v3, :cond_1

    move v0, v1

    .line 191
    goto :goto_0

    .line 194
    :cond_1
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v1

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v4

    .line 197
    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/x;->b(Landroid/widget/ImageView;)I

    move-result v5

    .line 198
    int-to-float v6, v5

    cmpg-float v6, v1, v6

    if-gtz v6, :cond_3

    .line 199
    sget-object v6, Lcom/roidapp/imagelib/retouch/aa;->a:[I

    iget-object v7, p0, Lcom/roidapp/imagelib/retouch/x;->d:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v7}, Landroid/widget/ImageView$ScaleType;->ordinal()I

    move-result v7

    aget v6, v6, v7

    packed-switch v6, :pswitch_data_0

    .line 207
    int-to-float v5, v5

    sub-float v1, v5, v1

    div-float/2addr v1, v8

    iget v5, v3, Landroid/graphics/RectF;->top:F

    sub-float/2addr v1, v5

    .line 216
    :goto_1
    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/x;->a(Landroid/widget/ImageView;)I

    move-result v0

    .line 217
    int-to-float v5, v0

    cmpg-float v5, v4, v5

    if-gtz v5, :cond_5

    .line 218
    sget-object v2, Lcom/roidapp/imagelib/retouch/aa;->a:[I

    iget-object v5, p0, Lcom/roidapp/imagelib/retouch/x;->d:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v5}, Landroid/widget/ImageView$ScaleType;->ordinal()I

    move-result v5

    aget v2, v2, v5

    packed-switch v2, :pswitch_data_1

    .line 226
    int-to-float v0, v0

    sub-float/2addr v0, v4

    div-float/2addr v0, v8

    iget v2, v3, Landroid/graphics/RectF;->left:F

    sub-float v2, v0, v2

    .line 235
    :cond_2
    :goto_2
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/x;->h:Landroid/graphics/Matrix;

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 236
    const/4 v0, 0x1

    goto :goto_0

    .line 201
    :pswitch_0
    iget v1, v3, Landroid/graphics/RectF;->top:F

    neg-float v1, v1

    .line 202
    goto :goto_1

    .line 204
    :pswitch_1
    int-to-float v5, v5

    sub-float v1, v5, v1

    iget v5, v3, Landroid/graphics/RectF;->top:F

    sub-float/2addr v1, v5

    .line 205
    goto :goto_1

    .line 210
    :cond_3
    iget v1, v3, Landroid/graphics/RectF;->top:F

    cmpl-float v1, v1, v2

    if-lez v1, :cond_4

    .line 211
    iget v1, v3, Landroid/graphics/RectF;->top:F

    neg-float v1, v1

    goto :goto_1

    .line 212
    :cond_4
    iget v1, v3, Landroid/graphics/RectF;->bottom:F

    int-to-float v6, v5

    cmpg-float v1, v1, v6

    if-gez v1, :cond_7

    .line 213
    int-to-float v1, v5

    iget v5, v3, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v1, v5

    goto :goto_1

    .line 220
    :pswitch_2
    iget v0, v3, Landroid/graphics/RectF;->left:F

    neg-float v2, v0

    .line 221
    goto :goto_2

    .line 223
    :pswitch_3
    int-to-float v0, v0

    sub-float/2addr v0, v4

    iget v2, v3, Landroid/graphics/RectF;->left:F

    sub-float v2, v0, v2

    .line 224
    goto :goto_2

    .line 229
    :cond_5
    iget v4, v3, Landroid/graphics/RectF;->left:F

    cmpl-float v4, v4, v2

    if-lez v4, :cond_6

    .line 230
    iget v0, v3, Landroid/graphics/RectF;->left:F

    neg-float v2, v0

    goto :goto_2

    .line 231
    :cond_6
    iget v4, v3, Landroid/graphics/RectF;->right:F

    int-to-float v5, v0

    cmpg-float v4, v4, v5

    if-gez v4, :cond_2

    .line 232
    int-to-float v0, v0

    iget v2, v3, Landroid/graphics/RectF;->right:F

    sub-float v2, v0, v2

    goto :goto_2

    :cond_7
    move v1, v2

    goto :goto_1

    .line 199
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch

    .line 218
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method


# virtual methods
.method public final a()V
    .locals 10

    .prologue
    const/4 v9, 0x0

    const/high16 v8, 0x40000000    # 2.0f

    .line 122
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/x;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 124
    if-eqz v0, :cond_0

    .line 125
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 1244
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/x;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 1245
    if-eqz v0, :cond_0

    if-nez v1, :cond_1

    .line 1246
    :cond_0
    :goto_0
    return-void

    .line 1249
    :cond_1
    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/x;->a(Landroid/widget/ImageView;)I

    move-result v2

    int-to-float v2, v2

    .line 1250
    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/x;->b(Landroid/widget/ImageView;)I

    move-result v0

    int-to-float v0, v0

    .line 1251
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    .line 1252
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    .line 1254
    iget-object v4, p0, Lcom/roidapp/imagelib/retouch/x;->f:Landroid/graphics/Matrix;

    invoke-virtual {v4}, Landroid/graphics/Matrix;->reset()V

    .line 1256
    int-to-float v4, v3

    div-float v4, v2, v4

    .line 1257
    int-to-float v5, v1

    div-float v5, v0, v5

    .line 1259
    iget-object v6, p0, Lcom/roidapp/imagelib/retouch/x;->d:Landroid/widget/ImageView$ScaleType;

    sget-object v7, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    if-ne v6, v7, :cond_2

    .line 1260
    iget-object v4, p0, Lcom/roidapp/imagelib/retouch/x;->f:Landroid/graphics/Matrix;

    int-to-float v3, v3

    sub-float/2addr v2, v3

    div-float/2addr v2, v8

    int-to-float v1, v1

    sub-float/2addr v0, v1

    div-float/2addr v0, v8

    invoke-virtual {v4, v2, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 1308
    :goto_1
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/x;->h:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 1309
    invoke-direct {p0}, Lcom/roidapp/imagelib/retouch/x;->d()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/retouch/x;->b(Landroid/graphics/Matrix;)V

    .line 1310
    invoke-direct {p0}, Lcom/roidapp/imagelib/retouch/x;->e()Z

    goto :goto_0

    .line 1263
    :cond_2
    iget-object v6, p0, Lcom/roidapp/imagelib/retouch/x;->d:Landroid/widget/ImageView$ScaleType;

    sget-object v7, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    if-ne v6, v7, :cond_3

    .line 1264
    invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F

    move-result v4

    .line 1265
    iget-object v5, p0, Lcom/roidapp/imagelib/retouch/x;->f:Landroid/graphics/Matrix;

    invoke-virtual {v5, v4, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 1266
    iget-object v5, p0, Lcom/roidapp/imagelib/retouch/x;->f:Landroid/graphics/Matrix;

    int-to-float v3, v3

    mul-float/2addr v3, v4

    sub-float/2addr v2, v3

    div-float/2addr v2, v8

    int-to-float v1, v1

    mul-float/2addr v1, v4

    sub-float/2addr v0, v1

    div-float/2addr v0, v8

    invoke-virtual {v5, v2, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto :goto_1

    .line 1269
    :cond_3
    iget-object v6, p0, Lcom/roidapp/imagelib/retouch/x;->d:Landroid/widget/ImageView$ScaleType;

    sget-object v7, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    if-ne v6, v7, :cond_4

    .line 1270
    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    move-result v4

    invoke-static {v6, v4}, Ljava/lang/Math;->min(FF)F

    move-result v4

    .line 1271
    iget-object v5, p0, Lcom/roidapp/imagelib/retouch/x;->f:Landroid/graphics/Matrix;

    invoke-virtual {v5, v4, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 1272
    iget-object v5, p0, Lcom/roidapp/imagelib/retouch/x;->f:Landroid/graphics/Matrix;

    int-to-float v3, v3

    mul-float/2addr v3, v4

    sub-float/2addr v2, v3

    div-float/2addr v2, v8

    int-to-float v1, v1

    mul-float/2addr v1, v4

    sub-float/2addr v0, v1

    div-float/2addr v0, v8

    invoke-virtual {v5, v2, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto :goto_1

    .line 1276
    :cond_4
    new-instance v4, Landroid/graphics/RectF;

    int-to-float v3, v3

    int-to-float v1, v1

    invoke-direct {v4, v9, v9, v3, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 1277
    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1, v9, v9, v2, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 1279
    sget-object v0, Lcom/roidapp/imagelib/retouch/aa;->a:[I

    iget-object v2, p0, Lcom/roidapp/imagelib/retouch/x;->d:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v2}, Landroid/widget/ImageView$ScaleType;->ordinal()I

    move-result v2

    aget v0, v0, v2

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 1285
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/x;->f:Landroid/graphics/Matrix;

    sget-object v2, Landroid/graphics/Matrix$ScaleToFit;->START:Landroid/graphics/Matrix$ScaleToFit;

    invoke-virtual {v0, v4, v1, v2}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    goto :goto_1

    .line 1281
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/x;->f:Landroid/graphics/Matrix;

    sget-object v2, Landroid/graphics/Matrix$ScaleToFit;->CENTER:Landroid/graphics/Matrix$ScaleToFit;

    invoke-virtual {v0, v4, v1, v2}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    goto :goto_1

    .line 1289
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/x;->f:Landroid/graphics/Matrix;

    sget-object v2, Landroid/graphics/Matrix$ScaleToFit;->END:Landroid/graphics/Matrix$ScaleToFit;

    invoke-virtual {v0, v4, v1, v2}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    goto/16 :goto_1

    .line 1293
    :pswitch_3
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/x;->f:Landroid/graphics/Matrix;

    sget-object v2, Landroid/graphics/Matrix$ScaleToFit;->FILL:Landroid/graphics/Matrix$ScaleToFit;

    invoke-virtual {v0, v4, v1, v2}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    goto/16 :goto_1

    .line 1279
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_3
    .end packed-switch
.end method

.method public final b()F
    .locals 2

    .prologue
    .line 134
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/x;->h:Landroid/graphics/Matrix;

    sget-object v1, Lcom/roidapp/imagelib/retouch/x;->i:[F

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 135
    sget-object v0, Lcom/roidapp/imagelib/retouch/x;->i:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    return v0
.end method

.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    .prologue
    .line 324
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    .line 325
    packed-switch v0, :pswitch_data_0

    .line 339
    :cond_0
    :goto_0
    :pswitch_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 341
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/x;->b:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0, p2}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 345
    :goto_1
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/x;->a:Landroid/support/v4/view/GestureDetectorCompat;

    invoke-virtual {v0, p2}, Landroid/support/v4/view/GestureDetectorCompat;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 348
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 328
    :pswitch_1
    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/x;->b()F

    move-result v0

    .line 329
    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 2140
    invoke-direct {p0}, Lcom/roidapp/imagelib/retouch/x;->e()Z

    .line 2141
    invoke-direct {p0}, Lcom/roidapp/imagelib/retouch/x;->d()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/retouch/x;->a(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    move-result-object v0

    .line 331
    if-eqz v0, :cond_0

    .line 332
    new-instance v1, Lcom/roidapp/imagelib/retouch/ab;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/x;->b()F

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    move-result v0

    invoke-direct {v1, p0, v2, v3, v0}, Lcom/roidapp/imagelib/retouch/ab;-><init>(Lcom/roidapp/imagelib/retouch/x;FFF)V

    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    .line 325
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
