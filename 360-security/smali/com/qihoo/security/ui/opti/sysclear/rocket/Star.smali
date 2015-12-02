.class public Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field protected a:F

.field protected b:F

.field protected c:F

.field protected d:F

.field protected e:I

.field protected f:Z

.field protected g:Lcom/nineoldandroids/a/a;

.field protected h:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->a:F

    .line 14
    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->b:F

    .line 17
    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->c:F

    .line 20
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->d:F

    .line 23
    const/16 v0, 0xff

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->e:I

    .line 26
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->f:Z

    .line 34
    return-void
.end method

.method public constructor <init>(Landroid/graphics/drawable/Drawable;FF)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->a:F

    .line 14
    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->b:F

    .line 17
    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->c:F

    .line 20
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->d:F

    .line 23
    const/16 v0, 0xff

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->e:I

    .line 26
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->f:Z

    .line 37
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->h:Landroid/graphics/drawable/Drawable;

    .line 38
    iput p2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->a:F

    .line 39
    iput p3, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->b:F

    .line 40
    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V
    .locals 4

    .prologue
    .line 43
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->h:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    .line 44
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->h:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 45
    invoke-virtual {p2, v0}, Landroid/graphics/Rect;->intersect(Landroid/graphics/Rect;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 46
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    iget v2, v0, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    .line 47
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    iget v0, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr v0, v2

    int-to-float v0, v0

    .line 48
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 49
    iget v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->a:F

    iget v3, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->b:F

    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 50
    iget v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->c:F

    const/high16 v3, 0x43b40000    # 360.0f

    rem-float/2addr v2, v3

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_0

    .line 51
    const/high16 v2, 0x42b40000    # 90.0f

    iget v3, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->c:F

    sub-float/2addr v2, v3

    invoke-virtual {p1, v2, v1, v0}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 53
    :cond_0
    iget v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->d:F

    const/high16 v3, 0x3f800000    # 1.0f

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_1

    .line 54
    iget v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->d:F

    iget v3, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->d:F

    invoke-virtual {p1, v2, v3, v1, v0}, Landroid/graphics/Canvas;->scale(FFFF)V

    .line 58
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->h:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 60
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 63
    :cond_2
    return-void
.end method

.method public getAlpha()I
    .locals 1

    .prologue
    .line 86
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->e:I

    return v0
.end method

.method public getAngle()F
    .locals 1

    .prologue
    .line 94
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->c:F

    return v0
.end method

.method public getAnimator()Lcom/nineoldandroids/a/a;
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->g:Lcom/nineoldandroids/a/a;

    return-object v0
.end method

.method public getImage()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 98
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->h:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getScale()F
    .locals 1

    .prologue
    .line 140
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->d:F

    return v0
.end method

.method public getX()F
    .locals 1

    .prologue
    .line 66
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->a:F

    return v0
.end method

.method public getY()F
    .locals 1

    .prologue
    .line 74
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->b:F

    return v0
.end method

.method public isDied()Z
    .locals 1

    .prologue
    .line 132
    iget-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->f:Z

    return v0
.end method

.method public setAlpha(I)V
    .locals 0

    .prologue
    .line 82
    iput p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->e:I

    .line 83
    return-void
.end method

.method public setAngle(F)V
    .locals 0

    .prologue
    .line 90
    iput p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->c:F

    .line 91
    return-void
.end method

.method public setAnimator(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 106
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->g:Lcom/nineoldandroids/a/a;

    .line 107
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->g:Lcom/nineoldandroids/a/a;

    new-instance v1, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star$1;-><init>(Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;)V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/a;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 125
    return-void
.end method

.method public setDied(Z)V
    .locals 0

    .prologue
    .line 136
    iput-boolean p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->f:Z

    .line 137
    return-void
.end method

.method public setImage(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .prologue
    .line 102
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->h:Landroid/graphics/drawable/Drawable;

    .line 103
    return-void
.end method

.method public setScale(F)V
    .locals 0

    .prologue
    .line 144
    iput p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->d:F

    .line 145
    return-void
.end method

.method public setX(F)V
    .locals 0

    .prologue
    .line 70
    iput p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->a:F

    .line 71
    return-void
.end method

.method public setY(F)V
    .locals 0

    .prologue
    .line 78
    iput p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->b:F

    .line 79
    return-void
.end method

.method public start()V
    .locals 1

    .prologue
    .line 148
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->g:Lcom/nineoldandroids/a/a;

    if-eqz v0, :cond_0

    .line 149
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->g:Lcom/nineoldandroids/a/a;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/a;->a()V

    .line 151
    :cond_0
    return-void
.end method
