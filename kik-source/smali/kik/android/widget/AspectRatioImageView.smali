.class public Lkik/android/widget/AspectRatioImageView;
.super Landroid/widget/ImageView;
.source "SourceFile"

# interfaces
.implements Lkik/android/widget/a;


# instance fields
.field private a:I

.field private b:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 14
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lkik/android/widget/AspectRatioImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 15
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 19
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lkik/android/widget/AspectRatioImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 20
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 24
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 9
    iput v0, p0, Lkik/android/widget/AspectRatioImageView;->a:I

    .line 10
    iput v0, p0, Lkik/android/widget/AspectRatioImageView;->b:I

    .line 25
    return-void
.end method


# virtual methods
.method public final a(II)V
    .locals 0

    .prologue
    .line 29
    iput p2, p0, Lkik/android/widget/AspectRatioImageView;->b:I

    .line 30
    iput p1, p0, Lkik/android/widget/AspectRatioImageView;->a:I

    .line 31
    return-void
.end method

.method protected onMeasure(II)V
    .locals 5

    .prologue
    .line 36
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 37
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 38
    iget v2, p0, Lkik/android/widget/AspectRatioImageView;->a:I

    if-ltz v2, :cond_1

    iget v2, p0, Lkik/android/widget/AspectRatioImageView;->b:I

    if-ltz v2, :cond_1

    .line 39
    iget v2, p0, Lkik/android/widget/AspectRatioImageView;->a:I

    int-to-float v2, v2

    iget v3, p0, Lkik/android/widget/AspectRatioImageView;->b:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    .line 40
    int-to-float v3, v1

    int-to-float v4, v0

    div-float/2addr v3, v4

    .line 41
    cmpl-float v3, v3, v2

    if-lez v3, :cond_0

    .line 42
    int-to-float v1, v0

    mul-float/2addr v1, v2

    float-to-double v2, v1

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-int v1, v2

    .line 47
    :goto_0
    invoke-virtual {p0, v1, v0}, Lkik/android/widget/AspectRatioImageView;->setMeasuredDimension(II)V

    .line 52
    :goto_1
    return-void

    .line 45
    :cond_0
    int-to-float v0, v1

    div-float/2addr v0, v2

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-int v0, v2

    goto :goto_0

    .line 50
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/widget/ImageView;->onMeasure(II)V

    goto :goto_1
.end method
