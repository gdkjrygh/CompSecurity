.class public Lkik/android/widget/ICSCameraPreviewView;
.super Landroid/view/TextureView;
.source "SourceFile"

# interfaces
.implements Lkik/android/widget/a;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xe
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 22
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lkik/android/widget/ICSCameraPreviewView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 27
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lkik/android/widget/ICSCameraPreviewView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 32
    invoke-direct {p0, p1, p2, p3}, Landroid/view/TextureView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 16
    iput v0, p0, Lkik/android/widget/ICSCameraPreviewView;->a:I

    .line 17
    iput v0, p0, Lkik/android/widget/ICSCameraPreviewView;->b:I

    .line 35
    const v0, 0x3f800054    # 1.00001f

    invoke-virtual {p0, v0}, Lkik/android/widget/ICSCameraPreviewView;->setScaleX(F)V

    .line 36
    iput-object p1, p0, Lkik/android/widget/ICSCameraPreviewView;->c:Landroid/content/Context;

    .line 37
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 81
    iget v0, p0, Lkik/android/widget/ICSCameraPreviewView;->b:I

    return v0
.end method

.method public final a(II)V
    .locals 2

    .prologue
    .line 41
    const/4 v0, 0x0

    .line 44
    iget v1, p0, Lkik/android/widget/ICSCameraPreviewView;->b:I

    if-ne v1, p2, :cond_0

    iget v1, p0, Lkik/android/widget/ICSCameraPreviewView;->a:I

    if-eq v1, p1, :cond_1

    .line 45
    :cond_0
    const/4 v0, 0x1

    .line 47
    :cond_1
    iput p2, p0, Lkik/android/widget/ICSCameraPreviewView;->b:I

    .line 48
    iput p1, p0, Lkik/android/widget/ICSCameraPreviewView;->a:I

    .line 50
    if-eqz v0, :cond_2

    .line 51
    invoke-virtual {p0}, Lkik/android/widget/ICSCameraPreviewView;->requestLayout()V

    .line 53
    :cond_2
    return-void
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 86
    iget v0, p0, Lkik/android/widget/ICSCameraPreviewView;->a:I

    return v0
.end method

.method protected onMeasure(II)V
    .locals 6

    .prologue
    .line 58
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 59
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 60
    iget v2, p0, Lkik/android/widget/ICSCameraPreviewView;->a:I

    if-ltz v2, :cond_1

    iget v2, p0, Lkik/android/widget/ICSCameraPreviewView;->b:I

    if-ltz v2, :cond_1

    .line 61
    iget v2, p0, Lkik/android/widget/ICSCameraPreviewView;->a:I

    int-to-float v2, v2

    iget v3, p0, Lkik/android/widget/ICSCameraPreviewView;->b:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    .line 62
    int-to-float v3, v0

    int-to-float v4, v1

    div-float/2addr v3, v4

    .line 63
    cmpg-float v3, v3, v2

    if-gez v3, :cond_0

    .line 67
    iget-object v0, p0, Lkik/android/widget/ICSCameraPreviewView;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 68
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-double v4, v0

    int-to-float v0, v1

    mul-float/2addr v0, v2

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    double-to-int v0, v0

    .line 71
    :cond_0
    int-to-float v1, v0

    div-float/2addr v1, v2

    float-to-double v2, v1

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-int v1, v2

    .line 72
    invoke-virtual {p0, v0, v1}, Lkik/android/widget/ICSCameraPreviewView;->setMeasuredDimension(II)V

    .line 77
    :goto_0
    return-void

    .line 75
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/view/TextureView;->onMeasure(II)V

    goto :goto_0
.end method
