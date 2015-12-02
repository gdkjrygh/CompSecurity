.class public Lcom/qihoo/security/booster/widget/BoosterRocketView;
.super Landroid/widget/ImageView;
.source "360Security"


# instance fields
.field private a:Landroid/graphics/Paint;

.field private final b:Landroid/graphics/Path;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 22
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/booster/widget/BoosterRocketView;->b:Landroid/graphics/Path;

    .line 26
    invoke-direct {p0, p1}, Lcom/qihoo/security/booster/widget/BoosterRocketView;->a(Landroid/content/Context;)V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 30
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 22
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/booster/widget/BoosterRocketView;->b:Landroid/graphics/Path;

    .line 31
    invoke-direct {p0, p1}, Lcom/qihoo/security/booster/widget/BoosterRocketView;->a(Landroid/content/Context;)V

    .line 32
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 22
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/booster/widget/BoosterRocketView;->b:Landroid/graphics/Path;

    .line 36
    invoke-direct {p0, p1}, Lcom/qihoo/security/booster/widget/BoosterRocketView;->a(Landroid/content/Context;)V

    .line 37
    return-void
.end method

.method private a()V
    .locals 2

    .prologue
    .line 49
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 50
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/booster/widget/BoosterRocketView;->setLayerType(ILandroid/graphics/Paint;)V

    .line 52
    :cond_0
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 40
    invoke-direct {p0}, Lcom/qihoo/security/booster/widget/BoosterRocketView;->a()V

    .line 41
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/booster/widget/BoosterRocketView;->a:Landroid/graphics/Paint;

    .line 42
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/BoosterRocketView;->a:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/qihoo/security/booster/widget/BoosterRocketView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f080056

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 43
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/BoosterRocketView;->a:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 45
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 72
    invoke-virtual {p0}, Lcom/qihoo/security/booster/widget/BoosterRocketView;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/qihoo/security/booster/widget/BoosterRocketView;->getHeight()I

    move-result v1

    invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 73
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/BoosterRocketView;->b:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 74
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/BoosterRocketView;->b:Landroid/graphics/Path;

    invoke-virtual {p0}, Lcom/qihoo/security/booster/widget/BoosterRocketView;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    invoke-virtual {p0}, Lcom/qihoo/security/booster/widget/BoosterRocketView;->getHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    invoke-virtual {p0}, Lcom/qihoo/security/booster/widget/BoosterRocketView;->getWidth()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    add-int/lit8 v3, v3, 0x1

    int-to-float v3, v3

    sget-object v4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 75
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/BoosterRocketView;->b:Landroid/graphics/Path;

    sget-object v1, Landroid/graphics/Region$Op;->REPLACE:Landroid/graphics/Region$Op;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 78
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 82
    return-void
.end method
