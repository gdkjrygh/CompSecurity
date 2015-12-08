.class public Lkik/android/widget/KikCodeBackgroundImageView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field a:F

.field private b:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 22
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lkik/android/widget/KikCodeBackgroundImageView;->b:Landroid/graphics/Paint;

    .line 24
    iget-object v0, p0, Lkik/android/widget/KikCodeBackgroundImageView;->b:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 25
    iget-object v0, p0, Lkik/android/widget/KikCodeBackgroundImageView;->b:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 26
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    .prologue
    const/high16 v4, 0x40000000    # 2.0f

    const/16 v7, 0xff

    .line 31
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 32
    invoke-virtual {p0}, Lkik/android/widget/KikCodeBackgroundImageView;->getWidth()I

    move-result v0

    .line 33
    invoke-virtual {p0}, Lkik/android/widget/KikCodeBackgroundImageView;->getHeight()I

    move-result v1

    .line 35
    int-to-float v2, v0

    div-float/2addr v2, v4

    .line 36
    int-to-float v3, v1

    div-float/2addr v3, v4

    .line 38
    if-ge v0, v1, :cond_0

    .line 40
    :goto_0
    int-to-float v0, v0

    div-float/2addr v0, v4

    iput v0, p0, Lkik/android/widget/KikCodeBackgroundImageView;->a:F

    .line 43
    iget-object v0, p0, Lkik/android/widget/KikCodeBackgroundImageView;->b:Landroid/graphics/Paint;

    invoke-virtual {v0, v7, v7, v7, v7}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 44
    iget v0, p0, Lkik/android/widget/KikCodeBackgroundImageView;->a:F

    iget-object v1, p0, Lkik/android/widget/KikCodeBackgroundImageView;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v3, v0, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 47
    iget v0, p0, Lkik/android/widget/KikCodeBackgroundImageView;->a:F

    float-to-double v0, v0

    const-wide v4, 0x3fedc28f5c28f5c3L    # 0.93

    mul-double/2addr v0, v4

    double-to-float v0, v0

    .line 50
    iget-object v1, p0, Lkik/android/widget/KikCodeBackgroundImageView;->b:Landroid/graphics/Paint;

    const/16 v4, 0x2e

    const/16 v5, 0x2d

    const/16 v6, 0x30

    invoke-virtual {v1, v7, v4, v5, v6}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 51
    iget-object v1, p0, Lkik/android/widget/KikCodeBackgroundImageView;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v3, v0, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 52
    return-void

    :cond_0
    move v0, v1

    .line 38
    goto :goto_0
.end method
