.class public Lcom/arist/model/skin/ColorPickerPanelView;
.super Landroid/view/View;


# instance fields
.field private a:F

.field private b:I

.field private c:I

.field private d:Landroid/graphics/Paint;

.field private e:Landroid/graphics/Paint;

.field private f:Landroid/graphics/RectF;

.field private g:Landroid/graphics/RectF;

.field private h:Lcom/arist/model/skin/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/arist/model/skin/ColorPickerPanelView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/arist/model/skin/ColorPickerPanelView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/arist/model/skin/ColorPickerPanelView;->a:F

    const v0, -0x919192

    iput v0, p0, Lcom/arist/model/skin/ColorPickerPanelView;->b:I

    const/high16 v0, -0x1000000

    iput v0, p0, Lcom/arist/model/skin/ColorPickerPanelView;->c:I

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/arist/model/skin/ColorPickerPanelView;->d:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/arist/model/skin/ColorPickerPanelView;->e:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/arist/model/skin/ColorPickerPanelView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    iput v0, p0, Lcom/arist/model/skin/ColorPickerPanelView;->a:F

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/arist/model/skin/ColorPickerPanelView;->c:I

    return v0
.end method

.method public final a(I)V
    .locals 0

    iput p1, p0, Lcom/arist/model/skin/ColorPickerPanelView;->c:I

    invoke-virtual {p0}, Lcom/arist/model/skin/ColorPickerPanelView;->invalidate()V

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerPanelView;->g:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/arist/model/skin/ColorPickerPanelView;->d:Landroid/graphics/Paint;

    iget v2, p0, Lcom/arist/model/skin/ColorPickerPanelView;->b:I

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v1, p0, Lcom/arist/model/skin/ColorPickerPanelView;->f:Landroid/graphics/RectF;

    iget-object v2, p0, Lcom/arist/model/skin/ColorPickerPanelView;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    iget-object v1, p0, Lcom/arist/model/skin/ColorPickerPanelView;->h:Lcom/arist/model/skin/a;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/arist/model/skin/ColorPickerPanelView;->h:Lcom/arist/model/skin/a;

    invoke-virtual {v1, p1}, Lcom/arist/model/skin/a;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    iget-object v1, p0, Lcom/arist/model/skin/ColorPickerPanelView;->e:Landroid/graphics/Paint;

    iget v2, p0, Lcom/arist/model/skin/ColorPickerPanelView;->c:I

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v1, p0, Lcom/arist/model/skin/ColorPickerPanelView;->e:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/arist/model/skin/ColorPickerPanelView;->setMeasuredDimension(II)V

    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 5

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/arist/model/skin/ColorPickerPanelView;->f:Landroid/graphics/RectF;

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerPanelView;->f:Landroid/graphics/RectF;

    invoke-virtual {p0}, Lcom/arist/model/skin/ColorPickerPanelView;->getPaddingLeft()I

    move-result v1

    int-to-float v1, v1

    iput v1, v0, Landroid/graphics/RectF;->left:F

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerPanelView;->f:Landroid/graphics/RectF;

    invoke-virtual {p0}, Lcom/arist/model/skin/ColorPickerPanelView;->getPaddingRight()I

    move-result v1

    sub-int v1, p1, v1

    int-to-float v1, v1

    iput v1, v0, Landroid/graphics/RectF;->right:F

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerPanelView;->f:Landroid/graphics/RectF;

    invoke-virtual {p0}, Lcom/arist/model/skin/ColorPickerPanelView;->getPaddingTop()I

    move-result v1

    int-to-float v1, v1

    iput v1, v0, Landroid/graphics/RectF;->top:F

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerPanelView;->f:Landroid/graphics/RectF;

    invoke-virtual {p0}, Lcom/arist/model/skin/ColorPickerPanelView;->getPaddingBottom()I

    move-result v1

    sub-int v1, p2, v1

    int-to-float v1, v1

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerPanelView;->f:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->left:F

    add-float/2addr v1, v4

    iget v2, v0, Landroid/graphics/RectF;->top:F

    add-float/2addr v2, v4

    iget v3, v0, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v3, v4

    iget v0, v0, Landroid/graphics/RectF;->right:F

    sub-float/2addr v0, v4

    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4, v1, v2, v0, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v4, p0, Lcom/arist/model/skin/ColorPickerPanelView;->g:Landroid/graphics/RectF;

    new-instance v0, Lcom/arist/model/skin/a;

    const/high16 v1, 0x40a00000    # 5.0f

    iget v2, p0, Lcom/arist/model/skin/ColorPickerPanelView;->a:F

    mul-float/2addr v1, v2

    float-to-int v1, v1

    invoke-direct {v0, v1}, Lcom/arist/model/skin/a;-><init>(I)V

    iput-object v0, p0, Lcom/arist/model/skin/ColorPickerPanelView;->h:Lcom/arist/model/skin/a;

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerPanelView;->h:Lcom/arist/model/skin/a;

    iget-object v1, p0, Lcom/arist/model/skin/ColorPickerPanelView;->g:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iget-object v2, p0, Lcom/arist/model/skin/ColorPickerPanelView;->g:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iget-object v3, p0, Lcom/arist/model/skin/ColorPickerPanelView;->g:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    iget-object v4, p0, Lcom/arist/model/skin/ColorPickerPanelView;->g:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/arist/model/skin/a;->setBounds(IIII)V

    return-void
.end method
