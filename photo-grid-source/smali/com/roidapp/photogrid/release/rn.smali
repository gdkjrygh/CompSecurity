.class public final Lcom/roidapp/photogrid/release/rn;
.super Lcom/roidapp/photogrid/release/aq;
.source "SourceFile"


# instance fields
.field private w:Landroid/graphics/Matrix;

.field private x:Landroid/graphics/PaintFlagsDrawFilter;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/roidapp/photogrid/release/lc;Lcom/roidapp/photogrid/release/ig;II)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 18
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/aq;-><init>(Landroid/content/Context;)V

    .line 15
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/rn;->w:Landroid/graphics/Matrix;

    .line 16
    new-instance v0, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v1, 0x3

    invoke-direct {v0, v2, v1}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/rn;->x:Landroid/graphics/PaintFlagsDrawFilter;

    .line 19
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xa

    if-le v0, v1, :cond_0

    .line 20
    invoke-static {p0}, Lcom/roidapp/photogrid/common/bl;->a(Landroid/view/View;)V

    .line 22
    :cond_0
    iput-object p1, p0, Lcom/roidapp/photogrid/release/rn;->a:Landroid/content/Context;

    .line 23
    iput-object p2, p0, Lcom/roidapp/photogrid/release/rn;->b:Lcom/roidapp/photogrid/release/lc;

    .line 24
    iput-object p3, p0, Lcom/roidapp/photogrid/release/rn;->c:Lcom/roidapp/photogrid/release/ig;

    .line 25
    iput p4, p0, Lcom/roidapp/photogrid/release/rn;->f:I

    .line 26
    iput p5, p0, Lcom/roidapp/photogrid/release/rn;->g:I

    .line 28
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/rn;->m:Z

    .line 29
    return-void
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .prologue
    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v5, 0x40000000    # 2.0f

    .line 84
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/aq;->onDraw(Landroid/graphics/Canvas;)V

    .line 85
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/rn;->h:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/rn;->d:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/rn;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 102
    :cond_0
    :goto_0
    return-void

    .line 88
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rn;->w:Landroid/graphics/Matrix;

    if-eqz v0, :cond_3

    .line 89
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rn;->d:Landroid/graphics/Bitmap;

    .line 1107
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 90
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rn;->w:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 91
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rn;->w:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/rn;->c:Lcom/roidapp/photogrid/release/ig;

    iget v1, v1, Lcom/roidapp/photogrid/release/ig;->r:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/rn;->c:Lcom/roidapp/photogrid/release/ig;

    iget v2, v2, Lcom/roidapp/photogrid/release/ig;->s:I

    int-to-float v2, v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/rn;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v5

    iget-object v4, p0, Lcom/roidapp/photogrid/release/rn;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v4, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 92
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rn;->w:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/rn;->c:Lcom/roidapp/photogrid/release/ig;

    iget v1, v1, Lcom/roidapp/photogrid/release/ig;->p:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/rn;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v5

    iget-object v3, p0, Lcom/roidapp/photogrid/release/rn;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v5

    invoke-virtual {v0, v1, v2, v3}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 93
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rn;->w:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/rn;->c:Lcom/roidapp/photogrid/release/ig;

    iget v1, v1, Lcom/roidapp/photogrid/release/ig;->v:F

    iget v2, p0, Lcom/roidapp/photogrid/release/rn;->r:F

    mul-float/2addr v1, v2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/rn;->c:Lcom/roidapp/photogrid/release/ig;

    iget v2, v2, Lcom/roidapp/photogrid/release/ig;->v:F

    iget v3, p0, Lcom/roidapp/photogrid/release/rn;->r:F

    mul-float/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 94
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rn;->c:Lcom/roidapp/photogrid/release/ig;

    iget v0, v0, Lcom/roidapp/photogrid/release/ig;->t:F

    iget-object v1, p0, Lcom/roidapp/photogrid/release/rn;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v5

    iget-object v2, p0, Lcom/roidapp/photogrid/release/rn;->c:Lcom/roidapp/photogrid/release/ig;

    iget v2, v2, Lcom/roidapp/photogrid/release/ig;->v:F

    mul-float/2addr v1, v2

    iget v2, p0, Lcom/roidapp/photogrid/release/rn;->r:F

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    iget v1, p0, Lcom/roidapp/photogrid/release/rn;->f:I

    int-to-float v1, v1

    div-float/2addr v1, v5

    add-float/2addr v0, v1

    .line 95
    iget-object v1, p0, Lcom/roidapp/photogrid/release/rn;->c:Lcom/roidapp/photogrid/release/ig;

    iget v1, v1, Lcom/roidapp/photogrid/release/ig;->u:F

    iget-object v2, p0, Lcom/roidapp/photogrid/release/rn;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v5

    iget-object v3, p0, Lcom/roidapp/photogrid/release/rn;->c:Lcom/roidapp/photogrid/release/ig;

    iget v3, v3, Lcom/roidapp/photogrid/release/ig;->v:F

    mul-float/2addr v2, v3

    iget v3, p0, Lcom/roidapp/photogrid/release/rn;->r:F

    mul-float/2addr v2, v3

    sub-float/2addr v1, v2

    iget v2, p0, Lcom/roidapp/photogrid/release/rn;->g:I

    int-to-float v2, v2

    div-float/2addr v2, v5

    add-float/2addr v1, v2

    .line 96
    iget-object v2, p0, Lcom/roidapp/photogrid/release/rn;->w:Landroid/graphics/Matrix;

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 98
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rn;->x:Landroid/graphics/PaintFlagsDrawFilter;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 99
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rn;->d:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/rn;->w:Landroid/graphics/Matrix;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 101
    :cond_3
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/aq;->onDraw(Landroid/graphics/Canvas;)V

    goto/16 :goto_0

    .line 1120
    :cond_4
    iget v1, p0, Lcom/roidapp/photogrid/release/rn;->f:I

    int-to-float v1, v1

    iget v2, p0, Lcom/roidapp/photogrid/release/rn;->g:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 1121
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    .line 1122
    cmpl-float v1, v1, v2

    if-lez v1, :cond_5

    .line 1123
    iget v1, p0, Lcom/roidapp/photogrid/release/rn;->f:I

    int-to-float v1, v1

    mul-float/2addr v1, v4

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float v0, v1, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/rn;->r:F

    goto/16 :goto_1

    .line 1125
    :cond_5
    iget v1, p0, Lcom/roidapp/photogrid/release/rn;->g:I

    int-to-float v1, v1

    mul-float/2addr v1, v4

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    int-to-float v0, v0

    div-float v0, v1, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/rn;->r:F

    goto/16 :goto_1
.end method

.method public final onMeasure(II)V
    .locals 2

    .prologue
    .line 33
    iget v0, p0, Lcom/roidapp/photogrid/release/rn;->f:I

    iget v1, p0, Lcom/roidapp/photogrid/release/rn;->g:I

    invoke-super {p0, v0, v1}, Lcom/roidapp/photogrid/release/aq;->setMeasuredDimension(II)V

    .line 34
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    .line 38
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/rn;->h:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/rn;->m:Z

    if-nez v1, :cond_2

    .line 39
    :cond_0
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/aq;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 80
    :cond_1
    :goto_0
    return v0

    .line 41
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 80
    :pswitch_0
    const/4 v0, 0x0

    goto :goto_0

    .line 43
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/rn;->i:F

    .line 44
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/rn;->j:F

    .line 45
    iget v1, p0, Lcom/roidapp/photogrid/release/rn;->i:F

    iput v1, p0, Lcom/roidapp/photogrid/release/rn;->k:F

    .line 46
    iget v1, p0, Lcom/roidapp/photogrid/release/rn;->j:F

    iput v1, p0, Lcom/roidapp/photogrid/release/rn;->l:F

    goto :goto_0

    .line 49
    :pswitch_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/rn;->k:F

    .line 50
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/rn;->l:F

    .line 51
    iget-object v1, p0, Lcom/roidapp/photogrid/release/rn;->c:Lcom/roidapp/photogrid/release/ig;

    iget v2, v1, Lcom/roidapp/photogrid/release/ig;->t:F

    iget v3, p0, Lcom/roidapp/photogrid/release/rn;->k:F

    iget v4, p0, Lcom/roidapp/photogrid/release/rn;->i:F

    sub-float/2addr v3, v4

    float-to-int v3, v3

    int-to-float v3, v3

    add-float/2addr v2, v3

    iput v2, v1, Lcom/roidapp/photogrid/release/ig;->t:F

    .line 52
    iget-object v1, p0, Lcom/roidapp/photogrid/release/rn;->c:Lcom/roidapp/photogrid/release/ig;

    iget v2, v1, Lcom/roidapp/photogrid/release/ig;->u:F

    iget v3, p0, Lcom/roidapp/photogrid/release/rn;->l:F

    iget v4, p0, Lcom/roidapp/photogrid/release/rn;->j:F

    sub-float/2addr v3, v4

    float-to-int v3, v3

    int-to-float v3, v3

    add-float/2addr v2, v3

    iput v2, v1, Lcom/roidapp/photogrid/release/ig;->u:F

    .line 53
    iget v1, p0, Lcom/roidapp/photogrid/release/rn;->k:F

    iput v1, p0, Lcom/roidapp/photogrid/release/rn;->i:F

    .line 54
    iget v1, p0, Lcom/roidapp/photogrid/release/rn;->l:F

    iput v1, p0, Lcom/roidapp/photogrid/release/rn;->j:F

    .line 55
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/roidapp/photogrid/release/rn;->n:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0xc8

    cmp-long v1, v2, v4

    if-lez v1, :cond_1

    .line 56
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/rn;->invalidate()V

    goto :goto_0

    .line 41
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method
