.class public abstract Landroid/support/v7/widget/aa;
.super Landroid/support/v7/widget/bd;
.source "SourceFile"


# instance fields
.field private final a:F

.field protected final b:Landroid/view/animation/LinearInterpolator;

.field protected final c:Landroid/view/animation/DecelerateInterpolator;

.field protected d:Landroid/graphics/PointF;

.field protected e:I

.field protected f:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 90
    invoke-direct {p0}, Landroid/support/v7/widget/bd;-><init>()V

    .line 78
    new-instance v0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/aa;->b:Landroid/view/animation/LinearInterpolator;

    .line 80
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/aa;->c:Landroid/view/animation/DecelerateInterpolator;

    .line 88
    iput v1, p0, Landroid/support/v7/widget/aa;->e:I

    iput v1, p0, Landroid/support/v7/widget/aa;->f:I

    .line 91
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 9156
    const/high16 v1, 0x41c80000    # 25.0f

    iget v0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float v0, v0

    div-float v0, v1, v0

    .line 91
    iput v0, p0, Landroid/support/v7/widget/aa;->a:F

    .line 92
    return-void
.end method

.method private static a(II)I
    .locals 2

    .prologue
    .line 251
    .line 252
    sub-int v0, p0, p1

    .line 253
    mul-int v1, p0, v0

    if-gtz v1, :cond_0

    .line 254
    const/4 v0, 0x0

    .line 256
    :cond_0
    return v0
.end method

.method private static a(IIIII)I
    .locals 2

    .prologue
    .line 265
    packed-switch p4, :pswitch_data_0

    .line 281
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 267
    :pswitch_0
    sub-int v0, p2, p0

    .line 284
    :cond_0
    :goto_0
    return v0

    .line 269
    :pswitch_1
    sub-int v0, p3, p1

    goto :goto_0

    .line 271
    :pswitch_2
    sub-int v0, p2, p0

    .line 272
    if-gtz v0, :cond_0

    .line 275
    sub-int v0, p3, p1

    .line 276
    if-ltz v0, :cond_0

    .line 284
    const/4 v0, 0x0

    goto :goto_0

    .line 265
    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private d(I)I
    .locals 2

    .prologue
    .line 187
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Landroid/support/v7/widget/aa;->a:F

    mul-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    return v0
.end method


# virtual methods
.method public abstract a(I)Landroid/graphics/PointF;
.end method

.method protected final a()V
    .locals 1

    .prologue
    .line 144
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/widget/aa;->f:I

    iput v0, p0, Landroid/support/v7/widget/aa;->e:I

    .line 145
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/widget/aa;->d:Landroid/graphics/PointF;

    .line 146
    return-void
.end method

.method protected final a(IILandroid/support/v7/widget/be;)V
    .locals 8

    .prologue
    const v7, 0x461c4000    # 10000.0f

    const/4 v2, 0x0

    const v6, 0x3f99999a    # 1.2f

    .line 121
    invoke-virtual {p0}, Landroid/support/v7/widget/aa;->g()I

    move-result v0

    if-nez v0, :cond_1

    .line 122
    invoke-virtual {p0}, Landroid/support/v7/widget/aa;->c()V

    .line 11234
    :cond_0
    :goto_0
    return-void

    .line 130
    :cond_1
    iget v0, p0, Landroid/support/v7/widget/aa;->e:I

    invoke-static {v0, p1}, Landroid/support/v7/widget/aa;->a(II)I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/aa;->e:I

    .line 131
    iget v0, p0, Landroid/support/v7/widget/aa;->f:I

    invoke-static {v0, p2}, Landroid/support/v7/widget/aa;->a(II)I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/aa;->f:I

    .line 133
    iget v0, p0, Landroid/support/v7/widget/aa;->e:I

    if-nez v0, :cond_0

    iget v0, p0, Landroid/support/v7/widget/aa;->f:I

    if-nez v0, :cond_0

    .line 11226
    invoke-virtual {p0}, Landroid/support/v7/widget/aa;->f()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/aa;->a(I)Landroid/graphics/PointF;

    move-result-object v0

    .line 11227
    if-eqz v0, :cond_2

    iget v1, v0, Landroid/graphics/PointF;->x:F

    cmpl-float v1, v1, v2

    if-nez v1, :cond_3

    iget v1, v0, Landroid/graphics/PointF;->y:F

    cmpl-float v1, v1, v2

    if-nez v1, :cond_3

    .line 11228
    :cond_2
    const-string v0, "LinearSmoothScroller"

    const-string v1, "To support smooth scrolling, you should override \nLayoutManager#computeScrollVectorForPosition.\nFalling back to instant scroll"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 11231
    invoke-virtual {p0}, Landroid/support/v7/widget/aa;->f()I

    move-result v0

    .line 11232
    invoke-virtual {p0}, Landroid/support/v7/widget/aa;->c()V

    .line 11233
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/aa;->c(I)V

    goto :goto_0

    .line 11637
    :cond_3
    iget v1, v0, Landroid/graphics/PointF;->x:F

    iget v2, v0, Landroid/graphics/PointF;->x:F

    mul-float/2addr v1, v2

    iget v2, v0, Landroid/graphics/PointF;->y:F

    iget v3, v0, Landroid/graphics/PointF;->y:F

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    float-to-double v2, v1

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    .line 11639
    iget v1, v0, Landroid/graphics/PointF;->x:F

    float-to-double v4, v1

    div-double/2addr v4, v2

    double-to-float v1, v4

    iput v1, v0, Landroid/graphics/PointF;->x:F

    .line 11640
    iget v1, v0, Landroid/graphics/PointF;->y:F

    float-to-double v4, v1

    div-double v2, v4, v2

    double-to-float v1, v2

    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 11237
    iput-object v0, p0, Landroid/support/v7/widget/aa;->d:Landroid/graphics/PointF;

    .line 11239
    iget v1, v0, Landroid/graphics/PointF;->x:F

    mul-float/2addr v1, v7

    float-to-int v1, v1

    iput v1, p0, Landroid/support/v7/widget/aa;->e:I

    .line 11240
    iget v0, v0, Landroid/graphics/PointF;->y:F

    mul-float/2addr v0, v7

    float-to-int v0, v0

    iput v0, p0, Landroid/support/v7/widget/aa;->f:I

    .line 11241
    const/16 v0, 0x2710

    invoke-direct {p0, v0}, Landroid/support/v7/widget/aa;->d(I)I

    move-result v0

    .line 11245
    iget v1, p0, Landroid/support/v7/widget/aa;->e:I

    int-to-float v1, v1

    mul-float/2addr v1, v6

    float-to-int v1, v1

    iget v2, p0, Landroid/support/v7/widget/aa;->f:I

    int-to-float v2, v2

    mul-float/2addr v2, v6

    float-to-int v2, v2

    int-to-float v0, v0

    mul-float/2addr v0, v6

    float-to-int v0, v0

    iget-object v3, p0, Landroid/support/v7/widget/aa;->b:Landroid/view/animation/LinearInterpolator;

    invoke-virtual {p3, v1, v2, v0, v3}, Landroid/support/v7/widget/be;->a(IIILandroid/view/animation/Interpolator;)V

    goto/16 :goto_0
.end method

.method protected final a(Landroid/view/View;Landroid/support/v7/widget/be;)V
    .locals 10

    .prologue
    const/4 v2, 0x1

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v9, 0x0

    .line 107
    .line 9200
    iget-object v0, p0, Landroid/support/v7/widget/aa;->d:Landroid/graphics/PointF;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/aa;->d:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    cmpl-float v0, v0, v9

    if-nez v0, :cond_4

    :cond_0
    move v1, v4

    .line 9324
    :goto_0
    invoke-virtual {p0}, Landroid/support/v7/widget/aa;->b()Landroid/support/v7/widget/au;

    move-result-object v5

    .line 9325
    invoke-virtual {v5}, Landroid/support/v7/widget/au;->g()Z

    move-result v0

    if-nez v0, :cond_6

    move v1, v4

    .line 10214
    :goto_1
    iget-object v0, p0, Landroid/support/v7/widget/aa;->d:Landroid/graphics/PointF;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/widget/aa;->d:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    cmpl-float v0, v0, v9

    if-nez v0, :cond_7

    :cond_1
    move v2, v4

    .line 10299
    :cond_2
    :goto_2
    invoke-virtual {p0}, Landroid/support/v7/widget/aa;->b()Landroid/support/v7/widget/au;

    move-result-object v3

    .line 10300
    invoke-virtual {v3}, Landroid/support/v7/widget/au;->h()Z

    move-result v0

    if-nez v0, :cond_8

    .line 109
    :goto_3
    mul-int v0, v1, v1

    mul-int v2, v4, v4

    add-int/2addr v0, v2

    int-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    double-to-int v0, v2

    .line 11173
    invoke-direct {p0, v0}, Landroid/support/v7/widget/aa;->d(I)I

    move-result v0

    int-to-double v2, v0

    const-wide v6, 0x3fd57a786c22680aL    # 0.3356

    div-double/2addr v2, v6

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v0, v2

    .line 111
    if-lez v0, :cond_3

    .line 112
    neg-int v1, v1

    neg-int v2, v4

    iget-object v3, p0, Landroid/support/v7/widget/aa;->c:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {p2, v1, v2, v0, v3}, Landroid/support/v7/widget/be;->a(IIILandroid/view/animation/Interpolator;)V

    .line 114
    :cond_3
    return-void

    .line 9200
    :cond_4
    iget-object v0, p0, Landroid/support/v7/widget/aa;->d:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    cmpl-float v0, v0, v9

    if-lez v0, :cond_5

    move v1, v2

    goto :goto_0

    :cond_5
    move v1, v3

    goto :goto_0

    .line 9328
    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    .line 9330
    invoke-static {p1}, Landroid/support/v7/widget/au;->h(Landroid/view/View;)I

    move-result v6

    iget v7, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->leftMargin:I

    sub-int/2addr v6, v7

    .line 9331
    invoke-static {p1}, Landroid/support/v7/widget/au;->j(Landroid/view/View;)I

    move-result v7

    iget v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->rightMargin:I

    add-int/2addr v0, v7

    .line 9332
    invoke-virtual {v5}, Landroid/support/v7/widget/au;->u()I

    move-result v7

    .line 9333
    invoke-virtual {v5}, Landroid/support/v7/widget/au;->s()I

    move-result v8

    invoke-virtual {v5}, Landroid/support/v7/widget/au;->w()I

    move-result v5

    sub-int v5, v8, v5

    .line 9334
    invoke-static {v6, v0, v7, v5, v1}, Landroid/support/v7/widget/aa;->a(IIIII)I

    move-result v0

    move v1, v0

    goto :goto_1

    .line 10214
    :cond_7
    iget-object v0, p0, Landroid/support/v7/widget/aa;->d:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    cmpl-float v0, v0, v9

    if-gtz v0, :cond_2

    move v2, v3

    goto :goto_2

    .line 10303
    :cond_8
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    .line 10305
    invoke-static {p1}, Landroid/support/v7/widget/au;->i(Landroid/view/View;)I

    move-result v4

    iget v5, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->topMargin:I

    sub-int/2addr v4, v5

    .line 10306
    invoke-static {p1}, Landroid/support/v7/widget/au;->k(Landroid/view/View;)I

    move-result v5

    iget v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->bottomMargin:I

    add-int/2addr v0, v5

    .line 10307
    invoke-virtual {v3}, Landroid/support/v7/widget/au;->v()I

    move-result v5

    .line 10308
    invoke-virtual {v3}, Landroid/support/v7/widget/au;->t()I

    move-result v6

    invoke-virtual {v3}, Landroid/support/v7/widget/au;->x()I

    move-result v3

    sub-int v3, v6, v3

    .line 10309
    invoke-static {v4, v0, v5, v3, v2}, Landroid/support/v7/widget/aa;->a(IIIII)I

    move-result v4

    goto/16 :goto_3
.end method
