.class public Lcom/roidapp/cloudlib/sns/topic/TriangleView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private final a:Landroid/graphics/Paint;

.field private final b:Landroid/graphics/Path;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    .line 20
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 16
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/TriangleView;->a:Landroid/graphics/Paint;

    .line 17
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/TriangleView;->b:Landroid/graphics/Path;

    .line 21
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/TriangleView;->a:Landroid/graphics/Paint;

    const v1, -0xe1442f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 22
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/TriangleView;->a:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/TriangleView;->a:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 24
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/TriangleView;->b:Landroid/graphics/Path;

    sget-object v1, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    invoke-virtual {v0, v1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 25
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/TriangleView;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 29
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/TriangleView;->invalidate()V

    .line 30
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 34
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/TriangleView;->getWidth()I

    move-result v0

    .line 35
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/TriangleView;->getHeight()I

    move-result v1

    .line 37
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/topic/TriangleView;->b:Landroid/graphics/Path;

    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 38
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/topic/TriangleView;->b:Landroid/graphics/Path;

    int-to-float v3, v1

    invoke-virtual {v2, v5, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 39
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/topic/TriangleView;->b:Landroid/graphics/Path;

    int-to-float v3, v0

    int-to-float v4, v1

    invoke-virtual {v2, v3, v4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 40
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/topic/TriangleView;->b:Landroid/graphics/Path;

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-virtual {v2, v0, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 41
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/TriangleView;->b:Landroid/graphics/Path;

    int-to-float v1, v1

    invoke-virtual {v0, v5, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 42
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/TriangleView;->b:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 43
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/TriangleView;->b:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/TriangleView;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 44
    return-void
.end method
