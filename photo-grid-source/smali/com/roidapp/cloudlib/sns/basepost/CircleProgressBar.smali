.class public Lcom/roidapp/cloudlib/sns/basepost/CircleProgressBar;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private a:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 20
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 12
    const/16 v0, 0x10

    iput v0, p0, Lcom/roidapp/cloudlib/sns/basepost/CircleProgressBar;->a:I

    .line 22
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 12
    const/16 v0, 0x10

    iput v0, p0, Lcom/roidapp/cloudlib/sns/basepost/CircleProgressBar;->a:I

    .line 29
    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 11

    .prologue
    const/16 v9, 0x53

    const/4 v4, 0x1

    const/high16 v2, -0x3d4c0000    # -90.0f

    const/16 v3, 0xb5

    const/4 v10, 0x0

    .line 42
    invoke-super {p0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 44
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/CircleProgressBar;->getWidth()I

    move-result v6

    .line 45
    new-instance v5, Landroid/graphics/Paint;

    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    .line 46
    new-instance v7, Landroid/graphics/Paint;

    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 49
    iget v0, p0, Lcom/roidapp/cloudlib/sns/basepost/CircleProgressBar;->a:I

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 50
    add-int/lit16 v8, v0, -0x168

    .line 52
    invoke-static {v3, v3, v3}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    invoke-virtual {v7, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 54
    const/16 v1, 0xff

    invoke-static {v1, v9, v9}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 60
    new-instance v1, Landroid/graphics/RectF;

    int-to-float v3, v6

    int-to-float v9, v6

    invoke-direct {v1, v10, v10, v3, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    int-to-float v3, v0

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 61
    new-instance v1, Landroid/graphics/RectF;

    int-to-float v0, v6

    int-to-float v3, v6

    invoke-direct {v1, v10, v10, v0, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    int-to-float v3, v8

    move-object v0, p1

    move-object v5, v7

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 62
    return-void
.end method
