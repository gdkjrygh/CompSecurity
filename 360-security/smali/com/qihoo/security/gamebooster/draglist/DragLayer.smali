.class public Lcom/qihoo/security/gamebooster/draglist/DragLayer;
.super Landroid/view/View;
.source "360Security"


# instance fields
.field a:Landroid/graphics/Paint;

.field private b:F

.field private c:F

.field private d:Landroid/graphics/Bitmap;

.field private e:F

.field private f:F

.field private g:Landroid/graphics/Rect;

.field private h:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 22
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 15
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->a:Landroid/graphics/Paint;

    .line 18
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->g:Landroid/graphics/Rect;

    .line 19
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->h:Landroid/graphics/Rect;

    .line 23
    return-void
.end method

.method private d(FF)V
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 43
    cmpg-float v1, p1, v0

    if-gez v1, :cond_0

    move p1, v0

    .line 46
    :cond_0
    cmpg-float v1, p2, v0

    if-gez v1, :cond_1

    move p2, v0

    .line 50
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->d:Landroid/graphics/Bitmap;

    if-nez v0, :cond_2

    .line 69
    :goto_0
    return-void

    .line 53
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 54
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    .line 55
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->getMeasuredWidth()I

    move-result v1

    sub-int v0, v1, v0

    .line 56
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 57
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 58
    iget-object v4, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    add-int/2addr v4, v1

    .line 59
    iget-object v5, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    add-int/2addr v5, v2

    .line 60
    if-le v1, v0, :cond_4

    .line 64
    :goto_1
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->getMeasuredHeight()I

    move-result v1

    sub-int/2addr v1, v3

    .line 65
    if-le v2, v1, :cond_3

    .line 68
    :goto_2
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->g:Landroid/graphics/Rect;

    invoke-virtual {v2, v0, v1, v4, v5}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_0

    :cond_3
    move v1, v2

    goto :goto_2

    :cond_4
    move v0, v1

    goto :goto_1
.end method


# virtual methods
.method public a(FF)V
    .locals 1

    .prologue
    .line 33
    iput p1, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->b:F

    .line 34
    iput p2, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->c:F

    .line 36
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->d:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 37
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->d(FF)V

    .line 38
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->g:Landroid/graphics/Rect;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->invalidate(Landroid/graphics/Rect;)V

    .line 40
    :cond_0
    return-void
.end method

.method public b(FF)V
    .locals 2

    .prologue
    .line 73
    iget v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->e:F

    sub-float v0, p1, v0

    iput v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->b:F

    .line 74
    iget v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->f:F

    sub-float v0, p2, v0

    iput v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->c:F

    .line 75
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->h:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->g:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 76
    iget v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->b:F

    iget v1, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->c:F

    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->d(FF)V

    .line 77
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->h:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->g:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->union(Landroid/graphics/Rect;)V

    .line 78
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->h:Landroid/graphics/Rect;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->invalidate(Landroid/graphics/Rect;)V

    .line 79
    return-void
.end method

.method public c(FF)V
    .locals 0

    .prologue
    .line 92
    iput p1, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->e:F

    .line 93
    iput p2, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->f:F

    .line 94
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .prologue
    .line 83
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 84
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->d:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 89
    :cond_0
    :goto_0
    return-void

    .line 88
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->d:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->g:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->g:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    int-to-float v2, v2

    iget-object v3, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    goto :goto_0
.end method

.method public setDragBitmap(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 26
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->d:Landroid/graphics/Bitmap;

    .line 27
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->d:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    .line 28
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->g:Landroid/graphics/Rect;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->invalidate(Landroid/graphics/Rect;)V

    .line 30
    :cond_0
    return-void
.end method
