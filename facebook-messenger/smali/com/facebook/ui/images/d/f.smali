.class public Lcom/facebook/ui/images/d/f;
.super Ljava/lang/Object;
.source "CropRegionRectConstraints.java"


# instance fields
.field private final a:Landroid/graphics/RectF;

.field private final b:F


# direct methods
.method public constructor <init>(Landroid/graphics/RectF;F)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/facebook/ui/images/d/f;->a:Landroid/graphics/RectF;

    .line 21
    iput p2, p0, Lcom/facebook/ui/images/d/f;->b:F

    .line 22
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 4

    .prologue
    .line 38
    const-string v0, ":"

    invoke-static {v0}, Lcom/google/common/base/Joiner;->on(Ljava/lang/String;)Lcom/google/common/base/Joiner;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/ui/images/d/f;->a:Landroid/graphics/RectF;

    iget v2, p0, Lcom/facebook/ui/images/d/f;->b:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/common/base/Joiner;->join(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/graphics/Rect;Landroid/graphics/Rect;)V
    .locals 11

    .prologue
    const/4 v10, 0x0

    .line 50
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v4

    .line 51
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v5

    .line 52
    iget v0, p1, Landroid/graphics/Rect;->left:I

    .line 53
    iget v6, p1, Landroid/graphics/Rect;->top:I

    .line 54
    int-to-float v1, v4

    iget-object v2, p0, Lcom/facebook/ui/images/d/f;->a:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    mul-float/2addr v1, v2

    int-to-float v2, v0

    add-float/2addr v1, v2

    float-to-int v3, v1

    .line 55
    int-to-float v1, v4

    iget-object v2, p0, Lcom/facebook/ui/images/d/f;->a:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->right:F

    mul-float/2addr v1, v2

    int-to-float v0, v0

    add-float/2addr v0, v1

    float-to-int v2, v0

    .line 56
    int-to-float v0, v5

    iget-object v1, p0, Lcom/facebook/ui/images/d/f;->a:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->top:F

    mul-float/2addr v0, v1

    int-to-float v1, v6

    add-float/2addr v0, v1

    float-to-int v1, v0

    .line 57
    int-to-float v0, v5

    iget-object v7, p0, Lcom/facebook/ui/images/d/f;->a:Landroid/graphics/RectF;

    iget v7, v7, Landroid/graphics/RectF;->bottom:F

    mul-float/2addr v0, v7

    int-to-float v6, v6

    add-float/2addr v0, v6

    float-to-int v0, v0

    .line 59
    iget v6, p0, Lcom/facebook/ui/images/d/f;->b:F

    const/4 v7, 0x0

    cmpl-float v6, v6, v7

    if-eqz v6, :cond_0

    .line 60
    sub-int v6, v2, v3

    .line 61
    sub-int v7, v0, v1

    .line 62
    int-to-float v8, v6

    int-to-float v9, v7

    div-float/2addr v8, v9

    .line 63
    iget v9, p0, Lcom/facebook/ui/images/d/f;->b:F

    cmpl-float v8, v8, v9

    if-lez v8, :cond_1

    .line 65
    int-to-float v4, v6

    iget v6, p0, Lcom/facebook/ui/images/d/f;->b:F

    div-float/2addr v4, v6

    float-to-int v4, v4

    .line 66
    sub-int v6, v4, v7

    .line 67
    div-int/lit8 v6, v6, 0x2

    .line 68
    sub-int/2addr v1, v6

    invoke-static {v10, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 69
    add-int/2addr v0, v6

    invoke-static {v5, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 71
    sub-int v6, v0, v1

    sub-int/2addr v4, v6

    .line 72
    if-lez v4, :cond_0

    .line 74
    sub-int/2addr v1, v4

    invoke-static {v10, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 75
    add-int/2addr v0, v4

    invoke-static {v5, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 94
    :cond_0
    :goto_0
    invoke-virtual {p2, v3, v1, v2, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 95
    return-void

    .line 80
    :cond_1
    int-to-float v5, v7

    iget v7, p0, Lcom/facebook/ui/images/d/f;->b:F

    mul-float/2addr v5, v7

    float-to-int v5, v5

    .line 81
    sub-int v6, v5, v6

    .line 82
    div-int/lit8 v6, v6, 0x2

    .line 83
    sub-int/2addr v3, v6

    invoke-static {v10, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 84
    add-int/2addr v2, v6

    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 86
    sub-int v6, v2, v3

    sub-int/2addr v5, v6

    .line 87
    if-lez v5, :cond_0

    .line 88
    sub-int/2addr v3, v5

    invoke-static {v10, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 89
    add-int/2addr v2, v5

    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    goto :goto_0
.end method
