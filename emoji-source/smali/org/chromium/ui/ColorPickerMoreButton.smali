.class public Lorg/chromium/ui/ColorPickerMoreButton;
.super Landroid/widget/Button;
.source "ColorPickerMoreButton.java"


# instance fields
.field private mBorderPaint:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 23
    invoke-direct {p0, p1, p2}, Landroid/widget/Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 24
    invoke-virtual {p0}, Lorg/chromium/ui/ColorPickerMoreButton;->init()V

    .line 25
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    .line 28
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 29
    invoke-virtual {p0}, Lorg/chromium/ui/ColorPickerMoreButton;->init()V

    .line 30
    return-void
.end method


# virtual methods
.method public init()V
    .locals 2

    .prologue
    .line 36
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lorg/chromium/ui/ColorPickerMoreButton;->mBorderPaint:Landroid/graphics/Paint;

    .line 37
    iget-object v0, p0, Lorg/chromium/ui/ColorPickerMoreButton;->mBorderPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 38
    iget-object v0, p0, Lorg/chromium/ui/ColorPickerMoreButton;->mBorderPaint:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 40
    iget-object v0, p0, Lorg/chromium/ui/ColorPickerMoreButton;->mBorderPaint:Landroid/graphics/Paint;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 42
    iget-object v0, p0, Lorg/chromium/ui/ColorPickerMoreButton;->mBorderPaint:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 43
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 6
    .param p1, "canvas"    # Landroid/graphics/Canvas;

    .prologue
    const/high16 v2, 0x3fc00000    # 1.5f

    const/high16 v1, 0x3f000000    # 0.5f

    .line 52
    invoke-virtual {p0}, Lorg/chromium/ui/ColorPickerMoreButton;->getWidth()I

    move-result v0

    int-to-float v0, v0

    sub-float v3, v0, v2

    invoke-virtual {p0}, Lorg/chromium/ui/ColorPickerMoreButton;->getHeight()I

    move-result v0

    int-to-float v0, v0

    sub-float v4, v0, v2

    iget-object v5, p0, Lorg/chromium/ui/ColorPickerMoreButton;->mBorderPaint:Landroid/graphics/Paint;

    move-object v0, p1

    move v2, v1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 53
    invoke-super {p0, p1}, Landroid/widget/Button;->onDraw(Landroid/graphics/Canvas;)V

    .line 54
    return-void
.end method
