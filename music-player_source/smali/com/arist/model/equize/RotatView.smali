.class public Lcom/arist/model/equize/RotatView;
.super Landroid/view/View;

# interfaces
.implements Lcom/arist/model/skin/m;


# instance fields
.field private a:Landroid/graphics/drawable/Drawable;

.field private b:Landroid/graphics/drawable/Drawable;

.field private c:Landroid/graphics/drawable/Drawable;

.field private d:Landroid/graphics/drawable/Drawable;

.field private e:Landroid/graphics/drawable/Drawable;

.field private f:I

.field private g:I

.field private h:I

.field private i:Landroid/graphics/Point;

.field private j:Z

.field private k:Lcom/arist/model/equize/l;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    const/4 v4, 0x0

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 v0, 0xe

    iput v0, p0, Lcom/arist/model/equize/RotatView;->f:I

    const/16 v0, -0x78

    iput v0, p0, Lcom/arist/model/equize/RotatView;->h:I

    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/arist/model/equize/RotatView;->i:Landroid/graphics/Point;

    invoke-virtual {p0}, Lcom/arist/model/equize/RotatView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f07001c

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/arist/model/equize/RotatView;->f:I

    invoke-virtual {p0}, Lcom/arist/model/equize/RotatView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f02001a

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/model/equize/RotatView;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lcom/arist/model/equize/RotatView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f02001b

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/model/equize/RotatView;->c:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lcom/arist/model/equize/RotatView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f02004d

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/model/equize/RotatView;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lcom/arist/model/equize/RotatView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f02004e

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/model/equize/RotatView;->d:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lcom/arist/model/equize/RotatView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f02007d

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/model/equize/RotatView;->e:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lcom/arist/model/equize/RotatView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f07001a

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    invoke-virtual {p0}, Lcom/arist/model/equize/RotatView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07001b

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    mul-int/lit8 v2, v1, 0x2

    add-int/2addr v2, v0

    iget v3, p0, Lcom/arist/model/equize/RotatView;->f:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    iput v2, p0, Lcom/arist/model/equize/RotatView;->g:I

    iget-object v2, p0, Lcom/arist/model/equize/RotatView;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2, v4, v4, v0, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v0, p0, Lcom/arist/model/equize/RotatView;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v4, v4, v1, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v0, p0, Lcom/arist/model/equize/RotatView;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    iget v2, p0, Lcom/arist/model/equize/RotatView;->f:I

    add-int/2addr v2, v1

    iget v3, p0, Lcom/arist/model/equize/RotatView;->f:I

    add-int/2addr v3, v1

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Rect;->offset(II)V

    iget-object v0, p0, Lcom/arist/model/equize/RotatView;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    iget v2, p0, Lcom/arist/model/equize/RotatView;->g:I

    sub-int v1, v2, v1

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {v0, v1, v4}, Landroid/graphics/Rect;->offset(II)V

    iget-object v0, p0, Lcom/arist/model/equize/RotatView;->c:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/arist/model/equize/RotatView;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->copyBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    iget-object v0, p0, Lcom/arist/model/equize/RotatView;->e:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/arist/model/equize/RotatView;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->copyBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    iget-object v0, p0, Lcom/arist/model/equize/RotatView;->d:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/arist/model/equize/RotatView;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->copyBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 2

    const/high16 v0, 0x43700000    # 240.0f

    mul-float/2addr v0, p1

    const/high16 v1, 0x42f00000    # 120.0f

    sub-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/arist/model/equize/RotatView;->h:I

    invoke-virtual {p0}, Lcom/arist/model/equize/RotatView;->invalidate()V

    return-void
.end method

.method public final a(I)V
    .locals 3

    const/4 v2, 0x1

    iget-object v0, p0, Lcom/arist/model/equize/RotatView;->d:Landroid/graphics/drawable/Drawable;

    new-instance v1, Landroid/graphics/LightingColorFilter;

    invoke-direct {v1, p1, v2}, Landroid/graphics/LightingColorFilter;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    iget-object v0, p0, Lcom/arist/model/equize/RotatView;->e:Landroid/graphics/drawable/Drawable;

    new-instance v1, Landroid/graphics/LightingColorFilter;

    invoke-direct {v1, p1, v2}, Landroid/graphics/LightingColorFilter;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void
.end method

.method public final a(Lcom/arist/model/equize/l;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/equize/RotatView;->k:Lcom/arist/model/equize/l;

    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 1

    invoke-static {}, Lcom/arist/model/skin/b;->a()Lcom/arist/model/skin/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/arist/model/skin/b;->a(Lcom/arist/model/skin/m;)V

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    invoke-static {}, Lcom/arist/model/skin/b;->a()Lcom/arist/model/skin/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/arist/model/skin/b;->b(Lcom/arist/model/skin/m;)V

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    const/16 v2, -0x78

    iget-boolean v0, p0, Lcom/arist/model/equize/RotatView;->j:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/equize/RotatView;->c:Landroid/graphics/drawable/Drawable;

    :goto_0
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Lcom/arist/model/equize/RotatView;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v3, v0

    move v1, v2

    :goto_1
    const/16 v0, 0x78

    if-le v1, v0, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget v0, p0, Lcom/arist/model/equize/RotatView;->h:I

    int-to-float v0, v0

    invoke-virtual {p1, v0, v3, v3}, Landroid/graphics/Canvas;->rotate(FFF)V

    iget-object v0, p0, Lcom/arist/model/equize/RotatView;->e:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/arist/model/equize/RotatView;->a:Landroid/graphics/drawable/Drawable;

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    int-to-float v0, v1

    invoke-virtual {p1, v0, v3, v3}, Landroid/graphics/Canvas;->rotate(FFF)V

    iget v0, p0, Lcom/arist/model/equize/RotatView;->h:I

    if-eq v0, v2, :cond_2

    iget v0, p0, Lcom/arist/model/equize/RotatView;->h:I

    if-gt v1, v0, :cond_2

    iget-object v0, p0, Lcom/arist/model/equize/RotatView;->d:Landroid/graphics/drawable/Drawable;

    :goto_2
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    add-int/lit8 v0, v1, 0x1e

    move v1, v0

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/arist/model/equize/RotatView;->b:Landroid/graphics/drawable/Drawable;

    goto :goto_2
.end method

.method protected onMeasure(II)V
    .locals 2

    iget v0, p0, Lcom/arist/model/equize/RotatView;->g:I

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-super {p0, v0, v0}, Landroid/view/View;->onMeasure(II)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 11

    const/4 v1, 0x1

    const/4 v0, 0x0

    const/4 v10, 0x0

    invoke-virtual {p0}, Lcom/arist/model/equize/RotatView;->isEnabled()Z

    move-result v2

    if-nez v2, :cond_0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    :goto_1
    invoke-virtual {p0}, Lcom/arist/model/equize/RotatView;->invalidate()V

    move v0, v1

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lcom/arist/model/equize/RotatView;->i:Landroid/graphics/Point;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    float-to-int v2, v2

    iput v2, v0, Landroid/graphics/Point;->x:I

    iget-object v0, p0, Lcom/arist/model/equize/RotatView;->i:Landroid/graphics/Point;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    float-to-int v2, v2

    iput v2, v0, Landroid/graphics/Point;->y:I

    iput-boolean v1, p0, Lcom/arist/model/equize/RotatView;->j:Z

    goto :goto_1

    :pswitch_1
    iget v2, p0, Lcom/arist/model/equize/RotatView;->h:I

    iget v0, p0, Lcom/arist/model/equize/RotatView;->g:I

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    iget v3, p0, Lcom/arist/model/equize/RotatView;->g:I

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    iget-object v4, p0, Lcom/arist/model/equize/RotatView;->i:Landroid/graphics/Point;

    iget v4, v4, Landroid/graphics/Point;->x:I

    int-to-float v4, v4

    iget-object v5, p0, Lcom/arist/model/equize/RotatView;->i:Landroid/graphics/Point;

    iget v5, v5, Landroid/graphics/Point;->y:I

    int-to-float v5, v5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v7

    sub-float/2addr v4, v0

    sub-float/2addr v5, v3

    sub-float/2addr v6, v0

    sub-float v3, v7, v3

    mul-float v0, v4, v4

    mul-float v7, v5, v5

    add-float/2addr v0, v7

    float-to-double v8, v0

    invoke-static {v8, v9}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v8

    double-to-float v0, v8

    mul-float v7, v6, v6

    mul-float v8, v3, v3

    add-float/2addr v7, v8

    float-to-double v8, v7

    invoke-static {v8, v9}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v8

    double-to-float v7, v8

    mul-float/2addr v0, v7

    cmpl-float v7, v0, v10

    if-nez v7, :cond_2

    const/16 v0, -0xb4

    :goto_2
    add-int/2addr v0, v2

    iput v0, p0, Lcom/arist/model/equize/RotatView;->h:I

    const/16 v0, 0x78

    const/16 v2, -0x78

    iget v3, p0, Lcom/arist/model/equize/RotatView;->h:I

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/arist/model/equize/RotatView;->h:I

    iget-object v0, p0, Lcom/arist/model/equize/RotatView;->k:Lcom/arist/model/equize/l;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arist/model/equize/RotatView;->k:Lcom/arist/model/equize/l;

    iget v2, p0, Lcom/arist/model/equize/RotatView;->h:I

    add-int/lit8 v2, v2, 0x78

    int-to-float v2, v2

    const/high16 v3, 0x43700000    # 240.0f

    div-float/2addr v2, v3

    invoke-interface {v0, p0, v2}, Lcom/arist/model/equize/l;->a(Lcom/arist/model/equize/RotatView;F)V

    :cond_1
    iget-object v0, p0, Lcom/arist/model/equize/RotatView;->i:Landroid/graphics/Point;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    float-to-int v2, v2

    iput v2, v0, Landroid/graphics/Point;->x:I

    iget-object v0, p0, Lcom/arist/model/equize/RotatView;->i:Landroid/graphics/Point;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    float-to-int v2, v2

    iput v2, v0, Landroid/graphics/Point;->y:I

    goto/16 :goto_1

    :cond_2
    mul-float v7, v4, v6

    mul-float v8, v5, v3

    add-float/2addr v7, v8

    div-float v0, v7, v0

    float-to-double v8, v0

    invoke-static {v8, v9}, Ljava/lang/Math;->acos(D)D

    move-result-wide v8

    double-to-float v0, v8

    float-to-double v8, v0

    invoke-static {v8, v9}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v8

    double-to-float v0, v8

    new-instance v7, Landroid/graphics/PointF;

    invoke-direct {v7, v4, v5}, Landroid/graphics/PointF;-><init>(FF)V

    new-instance v4, Landroid/graphics/PointF;

    invoke-direct {v4, v6, v3}, Landroid/graphics/PointF;-><init>(FF)V

    iget v3, v7, Landroid/graphics/PointF;->x:F

    iget v5, v4, Landroid/graphics/PointF;->y:F

    mul-float/2addr v3, v5

    iget v5, v7, Landroid/graphics/PointF;->y:F

    iget v4, v4, Landroid/graphics/PointF;->x:F

    mul-float/2addr v4, v5

    sub-float/2addr v3, v4

    cmpg-float v3, v3, v10

    if-gez v3, :cond_3

    neg-float v0, v0

    :cond_3
    float-to-int v0, v0

    goto :goto_2

    :pswitch_2
    iput-boolean v0, p0, Lcom/arist/model/equize/RotatView;->j:Z

    goto/16 :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
