.class public Lyuku/ambilwarna/widget/AmbilWarnaPrefWidgetView;
.super Landroid/view/View;
.source "AmbilWarnaPrefWidgetView.java"


# instance fields
.field paint:Landroid/graphics/Paint;

.field rectSize:F

.field strokeWidth:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    const/high16 v2, 0x3f000000    # 0.5f

    .line 17
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 19
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v0, v1, Landroid/util/DisplayMetrics;->density:F

    .line 20
    .local v0, "density":F
    const/high16 v1, 0x41c00000    # 24.0f

    mul-float/2addr v1, v0

    add-float/2addr v1, v2

    invoke-static {v1}, Landroid/util/FloatMath;->floor(F)F

    move-result v1

    iput v1, p0, Lyuku/ambilwarna/widget/AmbilWarnaPrefWidgetView;->rectSize:F

    .line 21
    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v1, v0

    add-float/2addr v1, v2

    invoke-static {v1}, Landroid/util/FloatMath;->floor(F)F

    move-result v1

    iput v1, p0, Lyuku/ambilwarna/widget/AmbilWarnaPrefWidgetView;->strokeWidth:F

    .line 23
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lyuku/ambilwarna/widget/AmbilWarnaPrefWidgetView;->paint:Landroid/graphics/Paint;

    .line 24
    iget-object v1, p0, Lyuku/ambilwarna/widget/AmbilWarnaPrefWidgetView;->paint:Landroid/graphics/Paint;

    const/4 v2, -0x1

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 25
    iget-object v1, p0, Lyuku/ambilwarna/widget/AmbilWarnaPrefWidgetView;->paint:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 26
    iget-object v1, p0, Lyuku/ambilwarna/widget/AmbilWarnaPrefWidgetView;->paint:Landroid/graphics/Paint;

    iget v2, p0, Lyuku/ambilwarna/widget/AmbilWarnaPrefWidgetView;->strokeWidth:F

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 27
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 6
    .param p1, "canvas"    # Landroid/graphics/Canvas;

    .prologue
    .line 30
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 32
    iget v1, p0, Lyuku/ambilwarna/widget/AmbilWarnaPrefWidgetView;->strokeWidth:F

    iget v2, p0, Lyuku/ambilwarna/widget/AmbilWarnaPrefWidgetView;->strokeWidth:F

    iget v0, p0, Lyuku/ambilwarna/widget/AmbilWarnaPrefWidgetView;->rectSize:F

    iget v3, p0, Lyuku/ambilwarna/widget/AmbilWarnaPrefWidgetView;->strokeWidth:F

    sub-float v3, v0, v3

    iget v0, p0, Lyuku/ambilwarna/widget/AmbilWarnaPrefWidgetView;->rectSize:F

    iget v4, p0, Lyuku/ambilwarna/widget/AmbilWarnaPrefWidgetView;->strokeWidth:F

    sub-float v4, v0, v4

    iget-object v5, p0, Lyuku/ambilwarna/widget/AmbilWarnaPrefWidgetView;->paint:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 33
    return-void
.end method
