.class public Lkik/android/widget/HeightConstantClampImageView;
.super Landroid/widget/ImageView;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:F

.field private c:D

.field private d:Landroid/widget/ImageView$ScaleType;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 29
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lkik/android/widget/HeightConstantClampImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 31
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .prologue
    const/high16 v2, -0x40800000    # -1.0f

    .line 35
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 22
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/HeightConstantClampImageView;->a:Z

    .line 23
    iput v2, p0, Lkik/android/widget/HeightConstantClampImageView;->b:F

    .line 24
    const-wide v0, 0x3ffc71c71c71c71cL    # 1.7777777777777777

    iput-wide v0, p0, Lkik/android/widget/HeightConstantClampImageView;->c:D

    .line 37
    sget-object v0, Lkik/android/ag$b;->d:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 38
    const/4 v1, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    iput v1, p0, Lkik/android/widget/HeightConstantClampImageView;->b:F

    .line 39
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 40
    return-void
.end method


# virtual methods
.method protected onMeasure(II)V
    .locals 11

    .prologue
    const/4 v10, 0x0

    .line 74
    iget v0, p0, Lkik/android/widget/HeightConstantClampImageView;->b:F

    cmpg-float v0, v0, v10

    if-gez v0, :cond_0

    .line 76
    invoke-super {p0, p1, p2}, Landroid/widget/ImageView;->onMeasure(II)V

    .line 125
    :goto_0
    return-void

    .line 80
    :cond_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 82
    invoke-virtual {p0}, Lkik/android/widget/HeightConstantClampImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 83
    if-eqz v0, :cond_5

    .line 84
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    .line 85
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    .line 87
    int-to-double v4, v3

    int-to-double v6, v2

    div-double/2addr v4, v6

    .line 88
    iget v0, p0, Lkik/android/widget/HeightConstantClampImageView;->b:F

    float-to-double v6, v0

    int-to-double v8, v2

    div-double/2addr v6, v8

    .line 91
    iget-wide v8, p0, Lkik/android/widget/HeightConstantClampImageView;->c:D

    cmpg-double v0, v4, v8

    if-gez v0, :cond_4

    iget-boolean v0, p0, Lkik/android/widget/HeightConstantClampImageView;->a:Z

    if-eqz v0, :cond_4

    .line 92
    iget v0, p0, Lkik/android/widget/HeightConstantClampImageView;->b:F

    iget-wide v4, p0, Lkik/android/widget/HeightConstantClampImageView;->c:D

    double-to-float v4, v4

    mul-float/2addr v0, v4

    .line 93
    iget v4, p0, Lkik/android/widget/HeightConstantClampImageView;->b:F

    const/high16 v5, -0x40800000    # -1.0f

    cmpl-float v4, v4, v5

    if-eqz v4, :cond_1

    int-to-float v4, v1

    cmpl-float v4, v0, v4

    if-lez v4, :cond_1

    int-to-float v0, v1

    .line 96
    :cond_1
    iget-object v1, p0, Lkik/android/widget/HeightConstantClampImageView;->d:Landroid/widget/ImageView$ScaleType;

    if-nez v1, :cond_2

    .line 97
    float-to-double v4, v0

    int-to-double v6, v3

    div-double/2addr v4, v6

    double-to-float v1, v4

    .line 98
    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 99
    invoke-virtual {v3, v1, v1}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 100
    int-to-float v2, v2

    mul-float/2addr v1, v2

    float-to-double v4, v1

    iget v1, p0, Lkik/android/widget/HeightConstantClampImageView;->b:F

    float-to-double v6, v1

    sub-double/2addr v4, v6

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    double-to-int v1, v4

    .line 101
    neg-int v1, v1

    int-to-float v1, v1

    invoke-virtual {v3, v10, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 102
    sget-object v1, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v1}, Lkik/android/widget/HeightConstantClampImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 103
    invoke-virtual {p0, v3}, Lkik/android/widget/HeightConstantClampImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 106
    :cond_2
    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    .line 120
    :cond_3
    :goto_1
    iget v1, p0, Lkik/android/widget/HeightConstantClampImageView;->b:F

    float-to-int v1, v1

    invoke-virtual {p0, v0, v1}, Lkik/android/widget/HeightConstantClampImageView;->setMeasuredDimension(II)V

    goto :goto_0

    .line 112
    :cond_4
    int-to-double v0, v3

    mul-double/2addr v0, v6

    double-to-int v0, v0

    int-to-float v0, v0

    .line 113
    float-to-int v0, v0

    .line 115
    iget-object v1, p0, Lkik/android/widget/HeightConstantClampImageView;->d:Landroid/widget/ImageView$ScaleType;

    if-nez v1, :cond_3

    .line 116
    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v1}, Lkik/android/widget/HeightConstantClampImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    goto :goto_1

    .line 123
    :cond_5
    iget v0, p0, Lkik/android/widget/HeightConstantClampImageView;->b:F

    float-to-int v0, v0

    invoke-virtual {p0, v1, v0}, Lkik/android/widget/HeightConstantClampImageView;->setMeasuredDimension(II)V

    goto/16 :goto_0
.end method
