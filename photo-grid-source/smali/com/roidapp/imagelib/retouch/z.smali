.class final Lcom/roidapp/imagelib/retouch/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ScaleGestureDetector$OnScaleGestureListener;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/retouch/x;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/retouch/x;)V
    .locals 0

    .prologue
    .line 76
    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/z;->a:Lcom/roidapp/imagelib/retouch/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onScale(Landroid/view/ScaleGestureDetector;)Z
    .locals 4

    .prologue
    .line 79
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getScaleFactor()F

    move-result v0

    .line 80
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 81
    :cond_0
    const/4 v0, 0x0

    .line 88
    :goto_0
    return v0

    .line 83
    :cond_1
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/z;->a:Lcom/roidapp/imagelib/retouch/x;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/retouch/x;->b()F

    move-result v1

    .line 84
    mul-float/2addr v1, v0

    const/high16 v2, 0x40a00000    # 5.0f

    cmpl-float v1, v1, v2

    if-gtz v1, :cond_2

    .line 85
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/z;->a:Lcom/roidapp/imagelib/retouch/x;

    invoke-static {v1}, Lcom/roidapp/imagelib/retouch/x;->a(Lcom/roidapp/imagelib/retouch/x;)Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusY()F

    move-result v3

    invoke-virtual {v1, v0, v0, v2, v3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 86
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/z;->a:Lcom/roidapp/imagelib/retouch/x;

    invoke-static {v0}, Lcom/roidapp/imagelib/retouch/x;->b(Lcom/roidapp/imagelib/retouch/x;)V

    .line 88
    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final onScaleBegin(Landroid/view/ScaleGestureDetector;)Z
    .locals 1

    .prologue
    .line 93
    const/4 v0, 0x1

    return v0
.end method

.method public final onScaleEnd(Landroid/view/ScaleGestureDetector;)V
    .locals 0

    .prologue
    .line 99
    return-void
.end method
