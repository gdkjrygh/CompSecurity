.class public Lcom/facebook/ui/images/d/m;
.super Ljava/lang/Object;
.source "ScaleGraphicOp.java"

# interfaces
.implements Lcom/facebook/ui/images/d/g;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Lcom/facebook/ui/images/d/n;


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .prologue
    .line 25
    sget-object v0, Lcom/facebook/ui/images/d/n;->DOWNSCALE:Lcom/facebook/ui/images/d/n;

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/ui/images/d/m;-><init>(IILcom/facebook/ui/images/d/n;)V

    .line 26
    return-void
.end method

.method public constructor <init>(IILcom/facebook/ui/images/d/n;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput p1, p0, Lcom/facebook/ui/images/d/m;->a:I

    .line 30
    iput p2, p0, Lcom/facebook/ui/images/d/m;->b:I

    .line 31
    iput-object p3, p0, Lcom/facebook/ui/images/d/m;->c:Lcom/facebook/ui/images/d/n;

    .line 32
    return-void
.end method

.method private a(II)F
    .locals 4

    .prologue
    .line 71
    iget-object v0, p0, Lcom/facebook/ui/images/d/m;->c:Lcom/facebook/ui/images/d/n;

    sget-object v1, Lcom/facebook/ui/images/d/n;->DOWNSCALE:Lcom/facebook/ui/images/d/n;

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    move v1, v0

    .line 72
    :goto_0
    const/high16 v0, -0x40800000    # -1.0f

    .line 73
    if-le p1, p2, :cond_3

    iget v2, p0, Lcom/facebook/ui/images/d/m;->a:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_3

    .line 74
    if-eqz v1, :cond_2

    iget v1, p0, Lcom/facebook/ui/images/d/m;->a:I

    if-le p1, v1, :cond_0

    .line 75
    :goto_1
    iget v0, p0, Lcom/facebook/ui/images/d/m;->a:I

    int-to-float v0, v0

    int-to-float v1, p1

    div-float/2addr v0, v1

    .line 82
    :cond_0
    :goto_2
    return v0

    .line 71
    :cond_1
    const/4 v0, 0x0

    move v1, v0

    goto :goto_0

    .line 74
    :cond_2
    iget v1, p0, Lcom/facebook/ui/images/d/m;->a:I

    if-ge p1, v1, :cond_0

    goto :goto_1

    .line 78
    :cond_3
    if-eqz v1, :cond_4

    iget v1, p0, Lcom/facebook/ui/images/d/m;->b:I

    if-le p2, v1, :cond_0

    .line 79
    :goto_3
    iget v0, p0, Lcom/facebook/ui/images/d/m;->b:I

    int-to-float v0, v0

    int-to-float v1, p2

    div-float/2addr v0, v1

    goto :goto_2

    .line 78
    :cond_4
    iget v1, p0, Lcom/facebook/ui/images/d/m;->b:I

    if-ge p2, v1, :cond_0

    goto :goto_3
.end method


# virtual methods
.method public a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 36
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 37
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    .line 39
    invoke-direct {p0, v3, v4}, Lcom/facebook/ui/images/d/m;->a(II)F

    move-result v0

    .line 40
    const/high16 v2, -0x40800000    # -1.0f

    cmpl-float v2, v0, v2

    if-eqz v2, :cond_0

    .line 41
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 42
    invoke-virtual {v5, v0, v0}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 43
    const/4 v6, 0x1

    move-object v0, p1

    move v2, v1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 47
    :cond_0
    return-object p1
.end method

.method public a(Landroid/graphics/Rect;Landroid/graphics/Rect;)V
    .locals 7

    .prologue
    .line 52
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    .line 53
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v1

    .line 54
    invoke-direct {p0, v0, v1}, Lcom/facebook/ui/images/d/m;->a(II)F

    move-result v0

    .line 55
    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v1, v0, v1

    if-eqz v1, :cond_0

    .line 56
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 57
    invoke-virtual {v1, v0, v0}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 59
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 60
    new-instance v2, Landroid/graphics/RectF;

    iget v3, p1, Landroid/graphics/Rect;->left:I

    int-to-float v3, v3

    iget v4, p1, Landroid/graphics/Rect;->top:I

    int-to-float v4, v4

    iget v5, p1, Landroid/graphics/Rect;->right:I

    int-to-float v5, v5

    iget v6, p1, Landroid/graphics/Rect;->bottom:I

    int-to-float v6, v6

    invoke-direct {v2, v3, v4, v5, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 61
    invoke-virtual {v1, v0, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 63
    iget v1, v0, Landroid/graphics/RectF;->left:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iget v2, v0, Landroid/graphics/RectF;->top:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iget v3, v0, Landroid/graphics/RectF;->right:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-virtual {p2, v1, v2, v3, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 68
    :goto_0
    return-void

    .line 66
    :cond_0
    invoke-virtual {p2, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    goto :goto_0
.end method
