.class public Lkik/android/widget/CardPopUpContainer;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Landroid/util/DisplayMetrics;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 24
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lkik/android/widget/CardPopUpContainer;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 25
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 30
    invoke-virtual {p0}, Lkik/android/widget/CardPopUpContainer;->getPaddingBottom()I

    move-result v0

    iput v0, p0, Lkik/android/widget/CardPopUpContainer;->a:I

    .line 31
    invoke-virtual {p0}, Lkik/android/widget/CardPopUpContainer;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/CardPopUpContainer;->b:Landroid/util/DisplayMetrics;

    .line 32
    return-void
.end method


# virtual methods
.method protected onMeasure(II)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 37
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    .line 38
    iget-object v3, p0, Lkik/android/widget/CardPopUpContainer;->b:Landroid/util/DisplayMetrics;

    iget v3, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float v3, v3

    const v4, 0x3f333333    # 0.7f

    mul-float/2addr v3, v4

    float-to-int v3, v3

    if-ge v2, v3, :cond_2

    move v2, v1

    :goto_0
    if-nez v2, :cond_3

    :goto_1
    if-eqz v1, :cond_0

    iget v0, p0, Lkik/android/widget/CardPopUpContainer;->a:I

    :cond_0
    invoke-virtual {p0}, Lkik/android/widget/CardPopUpContainer;->getPaddingBottom()I

    move-result v1

    if-eq v1, v0, :cond_1

    invoke-virtual {p0}, Lkik/android/widget/CardPopUpContainer;->getPaddingLeft()I

    move-result v1

    invoke-virtual {p0}, Lkik/android/widget/CardPopUpContainer;->getPaddingTop()I

    move-result v2

    invoke-virtual {p0}, Lkik/android/widget/CardPopUpContainer;->getPaddingRight()I

    move-result v3

    invoke-virtual {p0, v1, v2, v3, v0}, Lkik/android/widget/CardPopUpContainer;->setPadding(IIII)V

    .line 39
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/widget/RelativeLayout;->onMeasure(II)V

    .line 40
    return-void

    :cond_2
    move v2, v0

    .line 38
    goto :goto_0

    :cond_3
    move v1, v0

    goto :goto_1
.end method
