.class public Lcom/facebook/common/t/a/b;
.super Ljava/lang/Object;
.source "ViewPositionUtil.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/view/View;Landroid/graphics/PointF;)Landroid/graphics/Rect;
    .locals 5
    .param p1    # Landroid/graphics/PointF;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v1, 0x0

    .line 26
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 27
    invoke-virtual {p0, v3}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    .line 28
    const/4 v0, 0x2

    new-array v4, v0, [I

    .line 29
    invoke-virtual {p0, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 30
    if-eqz p1, :cond_0

    iget v0, p1, Landroid/graphics/PointF;->x:F

    float-to-int v0, v0

    move v2, v0

    .line 31
    :goto_0
    if-eqz p1, :cond_1

    iget v0, p1, Landroid/graphics/PointF;->y:F

    float-to-int v0, v0

    .line 32
    :goto_1
    aget v1, v4, v1

    add-int/2addr v1, v2

    const/4 v2, 0x1

    aget v2, v4, v2

    add-int/2addr v0, v2

    invoke-virtual {v3, v1, v0}, Landroid/graphics/Rect;->offsetTo(II)V

    .line 33
    return-object v3

    :cond_0
    move v2, v1

    .line 30
    goto :goto_0

    :cond_1
    move v0, v1

    .line 31
    goto :goto_1
.end method
