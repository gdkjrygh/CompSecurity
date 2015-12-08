.class public Lkik/android/scan/ICSScanPreviewView;
.super Lkik/android/widget/ICSCameraPreviewView;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0, p1}, Lkik/android/widget/ICSCameraPreviewView;-><init>(Landroid/content/Context;)V

    .line 23
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0, p1, p2}, Lkik/android/widget/ICSCameraPreviewView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0, p1, p2, p3}, Lkik/android/widget/ICSCameraPreviewView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 18
    return-void
.end method


# virtual methods
.method protected onMeasure(II)V
    .locals 5

    .prologue
    .line 33
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 34
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 35
    invoke-virtual {p0}, Lkik/android/scan/ICSScanPreviewView;->b()I

    move-result v2

    if-ltz v2, :cond_1

    invoke-virtual {p0}, Lkik/android/scan/ICSScanPreviewView;->a()I

    move-result v2

    if-ltz v2, :cond_1

    .line 36
    invoke-virtual {p0}, Lkik/android/scan/ICSScanPreviewView;->b()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p0}, Lkik/android/scan/ICSScanPreviewView;->a()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    .line 37
    int-to-float v3, v1

    int-to-float v4, v0

    div-float/2addr v3, v4

    .line 38
    cmpg-float v3, v3, v2

    if-gez v3, :cond_0

    .line 39
    int-to-float v1, v0

    mul-float/2addr v1, v2

    float-to-double v2, v1

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-int v1, v2

    .line 44
    :goto_0
    invoke-virtual {p0, v1, v0}, Lkik/android/scan/ICSScanPreviewView;->setMeasuredDimension(II)V

    .line 49
    :goto_1
    return-void

    .line 42
    :cond_0
    int-to-float v0, v1

    div-float/2addr v0, v2

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-int v0, v2

    goto :goto_0

    .line 47
    :cond_1
    invoke-super {p0, p1, p2}, Lkik/android/widget/ICSCameraPreviewView;->onMeasure(II)V

    goto :goto_1
.end method
