.class public Lkik/android/widget/CameraPreviewView;
.super Landroid/view/SurfaceView;
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
    .line 28
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lkik/android/widget/CameraPreviewView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 29
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 33
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lkik/android/widget/CameraPreviewView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 34
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    const/4 v0, -0x1

    .line 19
    invoke-direct {p0, p1, p2, p3}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 14
    iput v0, p0, Lkik/android/widget/CameraPreviewView;->a:I

    .line 15
    iput v0, p0, Lkik/android/widget/CameraPreviewView;->b:I

    .line 21
    invoke-virtual {p0}, Lkik/android/widget/CameraPreviewView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    .line 23
    const/4 v1, 0x3

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->setType(I)V

    .line 24
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 55
    iget v0, p0, Lkik/android/widget/CameraPreviewView;->a:I

    return v0
.end method

.method public final a(II)V
    .locals 2

    .prologue
    .line 39
    const/4 v0, 0x0

    .line 42
    iget v1, p0, Lkik/android/widget/CameraPreviewView;->b:I

    if-ne v1, p2, :cond_0

    iget v1, p0, Lkik/android/widget/CameraPreviewView;->a:I

    if-eq v1, p1, :cond_1

    .line 43
    :cond_0
    const/4 v0, 0x1

    .line 45
    :cond_1
    iput p2, p0, Lkik/android/widget/CameraPreviewView;->b:I

    .line 46
    iput p1, p0, Lkik/android/widget/CameraPreviewView;->a:I

    .line 48
    if-eqz v0, :cond_2

    .line 49
    invoke-virtual {p0}, Lkik/android/widget/CameraPreviewView;->requestLayout()V

    .line 51
    :cond_2
    return-void
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 60
    iget v0, p0, Lkik/android/widget/CameraPreviewView;->b:I

    return v0
.end method

.method protected onMeasure(II)V
    .locals 5

    .prologue
    .line 66
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 67
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 68
    iget v2, p0, Lkik/android/widget/CameraPreviewView;->a:I

    if-ltz v2, :cond_1

    iget v2, p0, Lkik/android/widget/CameraPreviewView;->b:I

    if-ltz v2, :cond_1

    .line 69
    iget v2, p0, Lkik/android/widget/CameraPreviewView;->a:I

    int-to-float v2, v2

    iget v3, p0, Lkik/android/widget/CameraPreviewView;->b:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    .line 70
    int-to-float v3, v1

    int-to-float v4, v0

    div-float/2addr v3, v4

    .line 71
    cmpl-float v3, v3, v2

    if-lez v3, :cond_0

    .line 72
    int-to-float v1, v0

    mul-float/2addr v1, v2

    float-to-double v2, v1

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-int v1, v2

    .line 77
    :goto_0
    invoke-virtual {p0, v1, v0}, Lkik/android/widget/CameraPreviewView;->setMeasuredDimension(II)V

    .line 82
    :goto_1
    return-void

    .line 75
    :cond_0
    int-to-float v0, v1

    div-float/2addr v0, v2

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-int v0, v2

    goto :goto_0

    .line 80
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/view/SurfaceView;->onMeasure(II)V

    goto :goto_1
.end method
