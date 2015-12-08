.class public Lkik/android/widget/HeightClampedIconImageView;
.super Lkik/android/widget/IconImageView;
.source "SourceFile"


# instance fields
.field private a:F

.field private b:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 18
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lkik/android/widget/HeightClampedIconImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .prologue
    const v2, 0x3fcccccd    # 1.6f

    .line 23
    invoke-direct {p0, p1, p2, p3}, Lkik/android/widget/IconImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 13
    iput v2, p0, Lkik/android/widget/HeightClampedIconImageView;->a:F

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Lkik/android/widget/HeightClampedIconImageView;->b:F

    .line 24
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v0}, Lkik/android/widget/HeightClampedIconImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 25
    sget-object v0, Lkik/android/ag$b;->c:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 26
    const/4 v1, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    iput v1, p0, Lkik/android/widget/HeightClampedIconImageView;->a:F

    .line 27
    const/4 v1, 0x1

    const/16 v2, 0x10

    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lkik/android/widget/HeightClampedIconImageView;->b:F

    .line 28
    return-void
.end method


# virtual methods
.method protected onMeasure(II)V
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 33
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 34
    iget v0, p0, Lkik/android/widget/HeightClampedIconImageView;->b:F

    float-to-int v1, v0

    .line 35
    invoke-virtual {p0}, Lkik/android/widget/HeightClampedIconImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 39
    if-eqz v0, :cond_1

    .line 41
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    .line 42
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    .line 43
    int-to-float v0, v0

    int-to-float v2, v2

    div-float/2addr v0, v2

    .line 44
    iget v2, p0, Lkik/android/widget/HeightClampedIconImageView;->a:F

    cmpl-float v2, v0, v2

    if-lez v2, :cond_0

    .line 45
    int-to-double v2, v1

    iget v0, p0, Lkik/android/widget/HeightClampedIconImageView;->a:F

    float-to-double v4, v0

    mul-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v0, v2

    .line 50
    :goto_0
    invoke-virtual {p0, v0, v1}, Lkik/android/widget/HeightClampedIconImageView;->setMeasuredDimension(II)V

    .line 56
    :goto_1
    return-void

    .line 48
    :cond_0
    int-to-float v2, v1

    mul-float/2addr v0, v2

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v0, v2

    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {p0, v2, v2}, Lkik/android/widget/HeightClampedIconImageView;->setMeasuredDimension(II)V

    goto :goto_1
.end method
