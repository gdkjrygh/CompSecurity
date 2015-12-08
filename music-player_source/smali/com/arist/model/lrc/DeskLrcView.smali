.class public Lcom/arist/model/lrc/DeskLrcView;
.super Lcom/arist/model/lrc/LrcView;


# instance fields
.field private o:Landroid/graphics/drawable/Drawable;

.field private p:Lcom/arist/model/lrc/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/arist/model/lrc/LrcView;-><init>(Landroid/content/Context;)V

    invoke-direct {p0}, Lcom/arist/model/lrc/DeskLrcView;->d()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/arist/model/lrc/LrcView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-direct {p0}, Lcom/arist/model/lrc/DeskLrcView;->d()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/arist/model/lrc/LrcView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-direct {p0}, Lcom/arist/model/lrc/DeskLrcView;->d()V

    return-void
.end method

.method private d()V
    .locals 2

    new-instance v0, Lcom/arist/model/lrc/a;

    invoke-direct {v0, p0}, Lcom/arist/model/lrc/a;-><init>(Lcom/arist/model/lrc/DeskLrcView;)V

    iput-object v0, p0, Lcom/arist/model/lrc/DeskLrcView;->p:Lcom/arist/model/lrc/a;

    invoke-virtual {p0}, Lcom/arist/model/lrc/DeskLrcView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f02003b

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/model/lrc/DeskLrcView;->o:Landroid/graphics/drawable/Drawable;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/arist/model/lrc/DeskLrcView;->d:I

    return v0
.end method

.method public final a(Lcom/arist/model/lrc/d;)V
    .locals 1

    iget-object v0, p0, Lcom/arist/model/lrc/DeskLrcView;->p:Lcom/arist/model/lrc/a;

    invoke-virtual {v0, p1}, Lcom/arist/model/lrc/a;->a(Lcom/arist/model/lrc/d;)V

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    iget-object v0, p0, Lcom/arist/model/lrc/DeskLrcView;->p:Lcom/arist/model/lrc/a;

    iget-boolean v0, v0, Lcom/arist/model/lrc/a;->a:Z

    if-eqz v0, :cond_0

    const v0, 0x66666666

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    iget-object v0, p0, Lcom/arist/model/lrc/DeskLrcView;->o:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    invoke-super {p0, p1}, Lcom/arist/model/lrc/LrcView;->onDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    const/4 v1, 0x0

    invoke-static {v1, p1}, Lcom/arist/model/lrc/DeskLrcView;->getDefaultSize(II)I

    move-result v0

    invoke-static {v1, p2}, Lcom/arist/model/lrc/DeskLrcView;->getDefaultSize(II)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/arist/model/lrc/DeskLrcView;->setMeasuredDimension(II)V

    iget v0, p0, Lcom/arist/model/lrc/DeskLrcView;->d:I

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-super {p0, p1, v0}, Lcom/arist/model/lrc/LrcView;->onMeasure(II)V

    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 6

    iget-object v0, p0, Lcom/arist/model/lrc/DeskLrcView;->o:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/arist/model/lrc/DeskLrcView;->o:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    sub-int v1, p1, v1

    invoke-virtual {p0}, Lcom/arist/model/lrc/DeskLrcView;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Lcom/arist/model/lrc/DeskLrcView;->getPaddingTop()I

    move-result v2

    invoke-virtual {p0}, Lcom/arist/model/lrc/DeskLrcView;->getPaddingRight()I

    move-result v3

    sub-int v3, p1, v3

    invoke-virtual {p0}, Lcom/arist/model/lrc/DeskLrcView;->getPaddingTop()I

    move-result v4

    iget-object v5, p0, Lcom/arist/model/lrc/DeskLrcView;->o:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v0, p0, Lcom/arist/model/lrc/DeskLrcView;->p:Lcom/arist/model/lrc/a;

    iget-object v1, p0, Lcom/arist/model/lrc/DeskLrcView;->o:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/arist/model/lrc/a;->a(Landroid/graphics/Rect;)V

    invoke-super {p0, p1, p2, p3, p4}, Lcom/arist/model/lrc/LrcView;->onSizeChanged(IIII)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/arist/model/lrc/DeskLrcView;->p:Lcom/arist/model/lrc/a;

    invoke-virtual {v0, p1}, Lcom/arist/model/lrc/a;->a(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method
