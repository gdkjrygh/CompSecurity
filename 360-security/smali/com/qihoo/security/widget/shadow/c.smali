.class public Lcom/qihoo/security/widget/shadow/c;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/widget/shadow/a;


# instance fields
.field private final a:Landroid/graphics/drawable/ShapeDrawable;

.field private final b:Landroid/graphics/drawable/ShapeDrawable;

.field private final c:Landroid/graphics/Rect;

.field private final d:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/shadow/c;->c:Landroid/graphics/Rect;

    .line 20
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/shadow/c;->d:Landroid/graphics/Rect;

    .line 21
    new-instance v0, Landroid/graphics/drawable/ShapeDrawable;

    new-instance v1, Landroid/graphics/drawable/shapes/RectShape;

    invoke-direct {v1}, Landroid/graphics/drawable/shapes/RectShape;-><init>()V

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    iput-object v0, p0, Lcom/qihoo/security/widget/shadow/c;->a:Landroid/graphics/drawable/ShapeDrawable;

    .line 22
    new-instance v0, Landroid/graphics/drawable/ShapeDrawable;

    new-instance v1, Landroid/graphics/drawable/shapes/RectShape;

    invoke-direct {v1}, Landroid/graphics/drawable/shapes/RectShape;-><init>()V

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    iput-object v0, p0, Lcom/qihoo/security/widget/shadow/c;->b:Landroid/graphics/drawable/ShapeDrawable;

    .line 23
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Canvas;)V
    .locals 2

    .prologue
    .line 55
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/c;->d:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/qihoo/security/widget/shadow/c;->b:Landroid/graphics/drawable/ShapeDrawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 56
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/c;->c:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/qihoo/security/widget/shadow/c;->a:Landroid/graphics/drawable/ShapeDrawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 57
    return-void
.end method

.method public a(Lcom/qihoo/security/widget/shadow/e;IIII)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x0

    const/4 v4, 0x0

    .line 27
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/c;->c:Landroid/graphics/Rect;

    iput p2, v0, Landroid/graphics/Rect;->left:I

    .line 28
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/c;->c:Landroid/graphics/Rect;

    int-to-float v1, p3

    iget v2, p1, Lcom/qihoo/security/widget/shadow/e;->c:F

    add-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, v0, Landroid/graphics/Rect;->top:I

    .line 29
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/c;->c:Landroid/graphics/Rect;

    iput p4, v0, Landroid/graphics/Rect;->right:I

    .line 30
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/c;->c:Landroid/graphics/Rect;

    int-to-float v1, p5

    iget v2, p1, Lcom/qihoo/security/widget/shadow/e;->c:F

    add-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 32
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/c;->d:Landroid/graphics/Rect;

    iput p2, v0, Landroid/graphics/Rect;->left:I

    .line 33
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/c;->d:Landroid/graphics/Rect;

    int-to-float v1, p3

    iget v2, p1, Lcom/qihoo/security/widget/shadow/e;->d:F

    add-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, v0, Landroid/graphics/Rect;->top:I

    .line 34
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/c;->d:Landroid/graphics/Rect;

    iput p4, v0, Landroid/graphics/Rect;->right:I

    .line 35
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/c;->d:Landroid/graphics/Rect;

    int-to-float v1, p5

    iget v2, p1, Lcom/qihoo/security/widget/shadow/e;->d:F

    add-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 37
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/c;->a:Landroid/graphics/drawable/ShapeDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v0

    iget v1, p1, Lcom/qihoo/security/widget/shadow/e;->a:I

    invoke-static {v1, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 38
    iget v0, p1, Lcom/qihoo/security/widget/shadow/e;->e:F

    cmpg-float v0, v5, v0

    if-gez v0, :cond_0

    .line 39
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/c;->a:Landroid/graphics/drawable/ShapeDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v0

    new-instance v1, Landroid/graphics/BlurMaskFilter;

    iget v2, p1, Lcom/qihoo/security/widget/shadow/e;->e:F

    sget-object v3, Landroid/graphics/BlurMaskFilter$Blur;->NORMAL:Landroid/graphics/BlurMaskFilter$Blur;

    invoke-direct {v1, v2, v3}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    .line 44
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/c;->b:Landroid/graphics/drawable/ShapeDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v0

    iget v1, p1, Lcom/qihoo/security/widget/shadow/e;->b:I

    invoke-static {v1, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 45
    iget v0, p1, Lcom/qihoo/security/widget/shadow/e;->f:F

    cmpg-float v0, v5, v0

    if-gez v0, :cond_1

    .line 46
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/c;->b:Landroid/graphics/drawable/ShapeDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v0

    new-instance v1, Landroid/graphics/BlurMaskFilter;

    iget v2, p1, Lcom/qihoo/security/widget/shadow/e;->f:F

    sget-object v3, Landroid/graphics/BlurMaskFilter$Blur;->NORMAL:Landroid/graphics/BlurMaskFilter$Blur;

    invoke-direct {v1, v2, v3}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    .line 51
    :goto_1
    return-void

    .line 41
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/c;->a:Landroid/graphics/drawable/ShapeDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    goto :goto_0

    .line 49
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/c;->b:Landroid/graphics/drawable/ShapeDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    goto :goto_1
.end method
