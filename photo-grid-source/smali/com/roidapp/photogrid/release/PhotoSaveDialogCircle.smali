.class public Lcom/roidapp/photogrid/release/PhotoSaveDialogCircle;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private a:F

.field private b:F

.field private c:I


# direct methods
.method public constructor <init>(Landroid/content/Context;FF)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 25
    iput p2, p0, Lcom/roidapp/photogrid/release/PhotoSaveDialogCircle;->a:F

    .line 26
    iput p3, p0, Lcom/roidapp/photogrid/release/PhotoSaveDialogCircle;->b:F

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 31
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 0

    .prologue
    .line 41
    iput p1, p0, Lcom/roidapp/photogrid/release/PhotoSaveDialogCircle;->c:I

    .line 42
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 10

    .prologue
    const/high16 v2, 0x43870000    # 270.0f

    const/16 v8, 0xd9

    const/16 v3, 0xb5

    const/4 v4, 0x1

    const/4 v9, 0x0

    .line 47
    new-instance v5, Landroid/graphics/Paint;

    invoke-direct {v5, v4}, Landroid/graphics/Paint;-><init>(I)V

    .line 48
    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6, v4}, Landroid/graphics/Paint;-><init>(I)V

    .line 50
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoSaveDialogCircle;->a:F

    iget v1, p0, Lcom/roidapp/photogrid/release/PhotoSaveDialogCircle;->b:F

    div-float/2addr v0, v1

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 51
    rsub-int v7, v0, 0x168

    .line 53
    invoke-static {v3, v3, v3}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 54
    const/16 v1, 0x5a

    if-gt v0, v1, :cond_0

    .line 55
    const/16 v1, 0xff

    const/16 v3, 0x53

    const/16 v8, 0x53

    invoke-static {v1, v3, v8}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 61
    :goto_0
    new-instance v1, Landroid/graphics/RectF;

    iget v3, p0, Lcom/roidapp/photogrid/release/PhotoSaveDialogCircle;->c:I

    int-to-float v3, v3

    iget v8, p0, Lcom/roidapp/photogrid/release/PhotoSaveDialogCircle;->c:I

    int-to-float v8, v8

    invoke-direct {v1, v9, v9, v3, v8}, Landroid/graphics/RectF;-><init>(FFFF)V

    neg-int v0, v0

    int-to-float v3, v0

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 62
    new-instance v1, Landroid/graphics/RectF;

    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoSaveDialogCircle;->c:I

    int-to-float v0, v0

    iget v3, p0, Lcom/roidapp/photogrid/release/PhotoSaveDialogCircle;->c:I

    int-to-float v3, v3

    invoke-direct {v1, v9, v9, v0, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    int-to-float v3, v7

    move-object v0, p1

    move-object v5, v6

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 63
    invoke-super {p0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 64
    return-void

    .line 57
    :cond_0
    invoke-static {v8, v8, v8}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_0
.end method
