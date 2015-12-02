.class Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;
.super Landroid/view/View;
.source "360Security"


# instance fields
.field private a:Landroid/graphics/Paint;

.field private b:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 17
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 18
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .prologue
    .line 21
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 22
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 24
    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 25
    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 26
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 29
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;->a:Landroid/graphics/Paint;

    .line 30
    return-void
.end method

.method public b(Landroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 37
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;->b:Landroid/graphics/Paint;

    .line 38
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 42
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 43
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;->getLeft()I

    move-result v0

    int-to-float v1, v0

    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;->getRight()I

    move-result v0

    int-to-float v3, v0

    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;->getBottom()I

    move-result v0

    int-to-float v4, v0

    iget-object v5, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;->b:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 44
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;->getLeft()I

    move-result v0

    int-to-float v1, v0

    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;->getRight()I

    move-result v0

    int-to-float v3, v0

    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;->getBottom()I

    move-result v0

    int-to-float v4, v0

    iget-object v5, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Solid;->a:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 45
    return-void
.end method
