.class public Lcom/qihoo/security/booster/widget/StartView;
.super Landroid/widget/ImageView;
.source "360Security"


# instance fields
.field a:Ljava/util/Random;

.field private b:Landroid/graphics/Paint;

.field private c:Landroid/graphics/Path;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 39
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 29
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/booster/widget/StartView;->a:Ljava/util/Random;

    .line 31
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/booster/widget/StartView;->c:Landroid/graphics/Path;

    .line 40
    invoke-direct {p0, p1}, Lcom/qihoo/security/booster/widget/StartView;->a(Landroid/content/Context;)V

    .line 41
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 44
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 29
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/booster/widget/StartView;->a:Ljava/util/Random;

    .line 31
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/booster/widget/StartView;->c:Landroid/graphics/Path;

    .line 45
    invoke-direct {p0, p1}, Lcom/qihoo/security/booster/widget/StartView;->a(Landroid/content/Context;)V

    .line 46
    return-void
.end method

.method private a()V
    .locals 2

    .prologue
    .line 56
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 57
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/booster/widget/StartView;->setLayerType(ILandroid/graphics/Paint;)V

    .line 59
    :cond_0
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 49
    invoke-direct {p0}, Lcom/qihoo/security/booster/widget/StartView;->a()V

    .line 50
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/booster/widget/StartView;->b:Landroid/graphics/Paint;

    .line 51
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/StartView;->b:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/qihoo/security/booster/widget/StartView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f08001f

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 52
    return-void
.end method

.method private getDuration()I
    .locals 6

    .prologue
    .line 144
    const-wide v0, 0x3fe6666666666666L    # 0.7

    iget-object v2, p0, Lcom/qihoo/security/booster/widget/StartView;->a:Ljava/util/Random;

    invoke-virtual {v2}, Ljava/util/Random;->nextFloat()F

    move-result v2

    float-to-double v2, v2

    const-wide v4, 0x3fe999999999999aL    # 0.8

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double/2addr v0, v2

    double-to-int v0, v0

    return v0
.end method

.method private getStarY()F
    .locals 6

    .prologue
    .line 148
    const-wide v0, -0x402ccccccccccccdL    # -0.3

    iget-object v2, p0, Lcom/qihoo/security/booster/widget/StartView;->a:Ljava/util/Random;

    invoke-virtual {v2}, Ljava/util/Random;->nextFloat()F

    move-result v2

    float-to-double v2, v2

    const-wide v4, 0x3ff3333333333333L    # 1.2

    mul-double/2addr v2, v4

    sub-double/2addr v0, v2

    double-to-float v0, v0

    const/high16 v1, 0x442f0000    # 700.0f

    mul-float/2addr v0, v1

    return v0
.end method

.method private getStartSize()I
    .locals 1

    .prologue
    .line 136
    const/4 v0, 0x6

    return v0
.end method

.method private getStartX()F
    .locals 2

    .prologue
    .line 140
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/StartView;->a:Ljava/util/Random;

    invoke-virtual {v0}, Ljava/util/Random;->nextFloat()F

    move-result v0

    invoke-virtual {p0}, Lcom/qihoo/security/booster/widget/StartView;->getWidth()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v0, v1

    return v0
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 123
    invoke-virtual {p0}, Lcom/qihoo/security/booster/widget/StartView;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/qihoo/security/booster/widget/StartView;->getHeight()I

    move-result v1

    invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 124
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/StartView;->c:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 125
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/StartView;->c:Landroid/graphics/Path;

    invoke-virtual {p0}, Lcom/qihoo/security/booster/widget/StartView;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    invoke-virtual {p0}, Lcom/qihoo/security/booster/widget/StartView;->getHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    invoke-virtual {p0}, Lcom/qihoo/security/booster/widget/StartView;->getWidth()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    sget-object v4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 126
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/StartView;->c:Landroid/graphics/Path;

    sget-object v1, Landroid/graphics/Region$Op;->REPLACE:Landroid/graphics/Region$Op;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 128
    invoke-virtual {p0}, Lcom/qihoo/security/booster/widget/StartView;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-virtual {p0}, Lcom/qihoo/security/booster/widget/StartView;->getHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    invoke-virtual {p0}, Lcom/qihoo/security/booster/widget/StartView;->getWidth()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    iget-object v3, p0, Lcom/qihoo/security/booster/widget/StartView;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 129
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 131
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/StartView;->c:Landroid/graphics/Path;

    invoke-virtual {p0}, Lcom/qihoo/security/booster/widget/StartView;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    invoke-virtual {p0}, Lcom/qihoo/security/booster/widget/StartView;->getHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    invoke-virtual {p0}, Lcom/qihoo/security/booster/widget/StartView;->getWidth()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    sget-object v4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 132
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/StartView;->c:Landroid/graphics/Path;

    sget-object v1, Landroid/graphics/Region$Op;->XOR:Landroid/graphics/Region$Op;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 133
    return-void
.end method
