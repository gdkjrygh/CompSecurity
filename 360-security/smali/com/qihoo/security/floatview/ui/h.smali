.class public Lcom/qihoo/security/floatview/ui/h;
.super Landroid/view/View;
.source "360Security"


# instance fields
.field private a:Landroid/graphics/drawable/Drawable;

.field private b:F

.field private c:F

.field private d:Landroid/graphics/Rect;

.field private e:Landroid/graphics/Rect;

.field private f:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 27
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/h;->d:Landroid/graphics/Rect;

    .line 28
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/h;->e:Landroid/graphics/Rect;

    .line 29
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/h;->f:Landroid/graphics/Rect;

    .line 30
    return-void
.end method


# virtual methods
.method public a(FF)V
    .locals 5

    .prologue
    .line 54
    const/4 v0, 0x0

    invoke-static {p2, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    float-to-int v0, v0

    .line 55
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/h;->getMeasuredHeight()I

    move-result v1

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/h;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    sub-int/2addr v1, v2

    .line 56
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 57
    float-to-int v1, p1

    .line 58
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/h;->getDrawableWidth()I

    move-result v2

    add-int/2addr v2, v1

    .line 60
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/h;->getDrawableHeight()I

    move-result v3

    add-int/2addr v3, v0

    .line 61
    iget-object v4, p0, Lcom/qihoo/security/floatview/ui/h;->e:Landroid/graphics/Rect;

    invoke-virtual {v4, v1, v0, v2, v3}, Landroid/graphics/Rect;->set(IIII)V

    .line 62
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/h;->f:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->setEmpty()V

    .line 63
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/h;->f:Landroid/graphics/Rect;

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/h;->d:Landroid/graphics/Rect;

    invoke-virtual {v1, v2}, Landroid/graphics/Rect;->union(Landroid/graphics/Rect;)V

    .line 64
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/h;->f:Landroid/graphics/Rect;

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/h;->e:Landroid/graphics/Rect;

    invoke-virtual {v1, v2}, Landroid/graphics/Rect;->union(Landroid/graphics/Rect;)V

    .line 65
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/h;->f:Landroid/graphics/Rect;

    invoke-virtual {p0, v1}, Lcom/qihoo/security/floatview/ui/h;->invalidate(Landroid/graphics/Rect;)V

    .line 66
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/h;->d:Landroid/graphics/Rect;

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/h;->e:Landroid/graphics/Rect;

    invoke-virtual {v1, v2}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 67
    iput p1, p0, Lcom/qihoo/security/floatview/ui/h;->b:F

    .line 68
    int-to-float v0, v0

    iput v0, p0, Lcom/qihoo/security/floatview/ui/h;->c:F

    .line 69
    return-void
.end method

.method public getDrawableHeight()I
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/h;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 41
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/h;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    .line 43
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getDrawableWidth()I
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/h;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 34
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/h;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    .line 36
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .prologue
    .line 73
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 74
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 75
    iget v0, p0, Lcom/qihoo/security/floatview/ui/h;->b:F

    iget v1, p0, Lcom/qihoo/security/floatview/ui/h;->c:F

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 76
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/h;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 77
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 79
    return-void
.end method

.method public setDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 47
    iput-object p1, p0, Lcom/qihoo/security/floatview/ui/h;->a:Landroid/graphics/drawable/Drawable;

    .line 48
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/h;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 49
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/h;->a:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/h;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/h;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    invoke-virtual {v0, v3, v3, v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 51
    :cond_0
    return-void
.end method
