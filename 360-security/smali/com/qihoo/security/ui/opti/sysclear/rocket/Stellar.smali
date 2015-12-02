.class public Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;
.super Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;
.source "360Security"


# instance fields
.field protected i:F

.field protected j:F

.field protected k:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 16
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;-><init>()V

    .line 10
    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->i:F

    .line 11
    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->j:F

    .line 17
    return-void
.end method

.method public constructor <init>(Landroid/graphics/drawable/Drawable;FFFF)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 19
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;-><init>()V

    .line 10
    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->i:F

    .line 11
    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->j:F

    .line 20
    iput p5, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->c:F

    .line 21
    iput p4, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->k:F

    .line 22
    iput p3, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->i:F

    .line 23
    iput p2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->j:F

    .line 24
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->h:Landroid/graphics/drawable/Drawable;

    .line 25
    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V
    .locals 10

    .prologue
    const-wide v8, 0x4066800000000000L    # 180.0

    const-wide v6, 0x400921fb54442d18L    # Math.PI

    .line 30
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->i:F

    float-to-double v0, v0

    iget v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->k:F

    float-to-double v2, v2

    iget v4, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->c:F

    float-to-double v4, v4

    mul-double/2addr v4, v6

    div-double/2addr v4, v8

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    double-to-float v0, v0

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->a:F

    .line 31
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->j:F

    float-to-double v0, v0

    iget v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->k:F

    float-to-double v2, v2

    iget v4, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->c:F

    float-to-double v4, v4

    mul-double/2addr v4, v6

    div-double/2addr v4, v8

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    double-to-float v0, v0

    neg-float v0, v0

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->b:F

    .line 32
    invoke-super {p0, p1, p2}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->draw(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V

    .line 33
    return-void
.end method

.method public getPx()F
    .locals 1

    .prologue
    .line 40
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->i:F

    return v0
.end method

.method public getPy()F
    .locals 1

    .prologue
    .line 48
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->j:F

    return v0
.end method

.method public getRadius()F
    .locals 1

    .prologue
    .line 56
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->k:F

    return v0
.end method

.method public setPx(F)V
    .locals 0

    .prologue
    .line 36
    iput p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->i:F

    .line 37
    return-void
.end method

.method public setPy(F)V
    .locals 0

    .prologue
    .line 44
    iput p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->j:F

    .line 45
    return-void
.end method

.method public setRadius(F)V
    .locals 0

    .prologue
    .line 52
    iput p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->k:F

    .line 53
    return-void
.end method
