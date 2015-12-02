.class public Lcom/qihoo/security/ui/opti/sysclear/rocket/d;
.super Landroid/graphics/drawable/Drawable;
.source "360Security"

# interfaces
.implements Lcom/nineoldandroids/a/o$b;


# instance fields
.field protected a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;",
            ">;"
        }
    .end annotation
.end field

.field private b:Landroid/content/Context;

.field private c:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 26
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 18
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/d;->a:Ljava/util/ArrayList;

    .line 20
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/d;->c:J

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 22
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 18
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/d;->a:Ljava/util/ArrayList;

    .line 20
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/d;->c:J

    .line 23
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/d;->b:Landroid/content/Context;

    .line 24
    return-void
.end method

.method private c()Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;
    .locals 3

    .prologue
    .line 141
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/d;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;

    .line 142
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->isDied()Z

    move-result v2

    if-eqz v2, :cond_0

    instance-of v2, v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;

    if-eqz v2, :cond_0

    .line 143
    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;

    .line 146
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private d()Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;
    .locals 3

    .prologue
    .line 150
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/d;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;

    .line 151
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->isDied()Z

    move-result v2

    if-eqz v2, :cond_0

    instance-of v2, v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;

    if-nez v2, :cond_0

    .line 155
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Landroid/graphics/drawable/Drawable;FFFFIFI)Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 170
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/d;->c()Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;

    move-result-object v0

    .line 171
    if-nez v0, :cond_0

    .line 172
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;

    invoke-direct {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;-><init>()V

    .line 173
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/d;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    :cond_0
    neg-float v1, p3

    .line 176
    invoke-virtual {v0, p5}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->setAngle(F)V

    .line 177
    invoke-virtual {v0, p2}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->setPx(F)V

    .line 178
    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->setPy(F)V

    .line 179
    invoke-virtual {v0, p7}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->setScale(F)V

    .line 180
    invoke-virtual {v0, p4}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->setRadius(F)V

    .line 181
    invoke-virtual {v0, p6}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->setAlpha(I)V

    .line 182
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    invoke-virtual {p1, v4, v4, v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 183
    invoke-virtual {v0, p1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->setImage(Landroid/graphics/drawable/Drawable;)V

    .line 184
    invoke-virtual {v0, v4}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->setDied(Z)V

    .line 187
    const-string/jumbo v1, "angle"

    const/4 v2, 0x2

    new-array v2, v2, [F

    aput p5, v2, v4

    const/high16 v3, 0x43b40000    # 360.0f

    sub-float v3, p5, v3

    aput v3, v2, v5

    invoke-static {v1, v2}, Lcom/nineoldandroids/a/m;->a(Ljava/lang/String;[F)Lcom/nineoldandroids/a/m;

    move-result-object v1

    .line 188
    new-array v2, v5, [Lcom/nineoldandroids/a/m;

    aput-object v1, v2, v4

    invoke-static {v0, v2}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;[Lcom/nineoldandroids/a/m;)Lcom/nineoldandroids/a/k;

    move-result-object v1

    int-to-long v2, p8

    invoke-virtual {v1, v2, v3}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    move-result-object v1

    .line 189
    invoke-virtual {v1, p0}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/o$b;)V

    .line 190
    new-instance v2, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v2}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Lcom/nineoldandroids/a/k;->a(Landroid/view/animation/Interpolator;)V

    .line 191
    invoke-virtual {v1, v5}, Lcom/nineoldandroids/a/k;->b(I)V

    .line 192
    const/4 v2, -0x1

    invoke-virtual {v1, v2}, Lcom/nineoldandroids/a/k;->a(I)V

    .line 193
    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Stellar;->setAnimator(Lcom/nineoldandroids/a/a;)V

    .line 195
    return-object v0
.end method

.method public a(Landroid/graphics/drawable/Drawable;FFFIFFFI)Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;
    .locals 10

    .prologue
    .line 85
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/d;->d()Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;

    move-result-object v2

    .line 86
    if-nez v2, :cond_0

    .line 87
    new-instance v2, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;

    invoke-direct {v2}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;-><init>()V

    .line 88
    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/d;->a:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    :cond_0
    invoke-virtual {v2, p2}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->setX(F)V

    .line 91
    invoke-virtual {v2, p3}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->setY(F)V

    .line 92
    invoke-virtual {v2, p4}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->setAngle(F)V

    .line 94
    neg-float v4, p3

    .line 95
    float-to-double v6, p4

    const-wide v8, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v6, v8

    const-wide v8, 0x4066800000000000L    # 180.0

    div-double/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->tan(D)D

    move-result-wide v6

    double-to-float v6, v6

    .line 96
    mul-float v3, v6, p2

    sub-float v7, v4, v3

    .line 97
    const/4 v5, 0x0

    .line 98
    const/4 v3, 0x0

    .line 99
    const/high16 v8, 0x43b40000    # 360.0f

    rem-float v8, p4, v8

    const/4 v9, 0x0

    cmpl-float v8, v8, v9

    if-nez v8, :cond_2

    .line 101
    const/16 p7, 0x0

    .line 102
    const/4 v3, 0x0

    move v5, v3

    move v3, v4

    .line 123
    :goto_0
    const/4 v6, 0x0

    cmpl-float v6, v5, v6

    if-eqz v6, :cond_1

    .line 124
    mul-float v3, v5, p7

    add-float/2addr v3, v7

    .line 126
    :cond_1
    invoke-virtual {v2, p1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->setImage(Landroid/graphics/drawable/Drawable;)V

    .line 127
    const/4 v5, 0x0

    invoke-virtual {v2, v5}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->setDied(Z)V

    .line 128
    invoke-virtual {v2, p5}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->setAlpha(I)V

    .line 129
    move/from16 v0, p6

    invoke-virtual {v2, v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->setScale(F)V

    .line 131
    const-string/jumbo v5, "x"

    const/4 v6, 0x2

    new-array v6, v6, [F

    const/4 v7, 0x0

    aput p2, v6, v7

    const/4 v7, 0x1

    aput p7, v6, v7

    invoke-static {v5, v6}, Lcom/nineoldandroids/a/m;->a(Ljava/lang/String;[F)Lcom/nineoldandroids/a/m;

    move-result-object v5

    .line 132
    const-string/jumbo v6, "y"

    const/4 v7, 0x2

    new-array v7, v7, [F

    const/4 v8, 0x0

    neg-float v4, v4

    aput v4, v7, v8

    const/4 v4, 0x1

    neg-float v3, v3

    aput v3, v7, v4

    invoke-static {v6, v7}, Lcom/nineoldandroids/a/m;->a(Ljava/lang/String;[F)Lcom/nineoldandroids/a/m;

    move-result-object v3

    .line 133
    const/4 v4, 0x2

    new-array v4, v4, [Lcom/nineoldandroids/a/m;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const/4 v5, 0x1

    aput-object v3, v4, v5

    invoke-static {v2, v4}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;[Lcom/nineoldandroids/a/m;)Lcom/nineoldandroids/a/k;

    move-result-object v3

    move/from16 v0, p9

    int-to-long v4, v0

    invoke-virtual {v3, v4, v5}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    move-result-object v3

    .line 134
    invoke-virtual {v3, p0}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/o$b;)V

    .line 135
    invoke-virtual {v2, v3}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->setAnimator(Lcom/nineoldandroids/a/a;)V

    .line 137
    return-object v2

    .line 103
    :cond_2
    const/high16 v8, 0x43340000    # 180.0f

    rem-float v8, p4, v8

    const/4 v9, 0x0

    cmpl-float v8, v8, v9

    if-nez v8, :cond_3

    .line 106
    const/4 v3, 0x0

    move v5, v3

    move v3, v4

    goto :goto_0

    .line 107
    :cond_3
    const/high16 v8, 0x43870000    # 270.0f

    rem-float v8, p4, v8

    const/4 v9, 0x0

    cmpl-float v8, v8, v9

    if-nez v8, :cond_4

    .line 109
    const/4 v3, 0x0

    .line 110
    const/4 v5, 0x0

    move/from16 p7, p2

    goto :goto_0

    .line 111
    :cond_4
    const/high16 v8, 0x42b40000    # 90.0f

    rem-float v8, p4, v8

    const/4 v9, 0x0

    cmpl-float v8, v8, v9

    if-nez v8, :cond_5

    .line 113
    move/from16 v0, p8

    neg-float v3, v0

    .line 114
    const/4 v5, 0x0

    move/from16 p7, p2

    goto :goto_0

    .line 115
    :cond_5
    const/high16 v8, 0x43b40000    # 360.0f

    rem-float v8, p4, v8

    const/high16 v9, 0x42b40000    # 90.0f

    cmpg-float v8, v8, v9

    if-gez v8, :cond_6

    .line 116
    const/16 p7, 0x0

    move v5, v6

    goto/16 :goto_0

    .line 117
    :cond_6
    const/high16 v8, 0x43b40000    # 360.0f

    rem-float v8, p4, v8

    const/high16 v9, 0x43870000    # 270.0f

    cmpg-float v8, v8, v9

    if-gez v8, :cond_7

    move v5, v6

    .line 118
    goto/16 :goto_0

    .line 119
    :cond_7
    const/high16 v8, 0x43b40000    # 360.0f

    rem-float v8, p4, v8

    const/high16 v9, 0x43b40000    # 360.0f

    cmpg-float v8, v8, v9

    if-gez v8, :cond_8

    .line 120
    const/16 p7, 0x0

    move v5, v6

    goto/16 :goto_0

    :cond_8
    move/from16 p7, v5

    move v5, v6

    goto/16 :goto_0
.end method

.method public a()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;",
            ">;"
        }
    .end annotation

    .prologue
    .line 199
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/d;->a:Ljava/util/ArrayList;

    return-object v0
.end method

.method protected a(Landroid/graphics/Canvas;)V
    .locals 4

    .prologue
    .line 203
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/d;->a()Ljava/util/ArrayList;

    move-result-object v0

    .line 204
    if-eqz v0, :cond_1

    .line 205
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/d;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    .line 206
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;

    .line 207
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->isDied()Z

    move-result v3

    if-nez v3, :cond_0

    .line 208
    invoke-virtual {v0, p1, v1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->draw(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V

    goto :goto_0

    .line 212
    :cond_1
    return-void
.end method

.method public a(Lcom/nineoldandroids/a/o;)V
    .locals 6

    .prologue
    .line 65
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 66
    iget-wide v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/d;->c:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0xa

    cmp-long v2, v2, v4

    if-lez v2, :cond_0

    .line 67
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/d;->invalidateSelf()V

    .line 68
    iput-wide v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/d;->c:J

    .line 70
    :cond_0
    return-void
.end method

.method public b()V
    .locals 4

    .prologue
    .line 215
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/d;->a()Ljava/util/ArrayList;

    move-result-object v1

    .line 216
    if-eqz v1, :cond_2

    .line 217
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;

    .line 218
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->isDied()Z

    move-result v3

    if-nez v3, :cond_0

    .line 219
    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Star;->getAnimator()Lcom/nineoldandroids/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/nineoldandroids/a/a;->b()V

    goto :goto_0

    .line 222
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 224
    :cond_2
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 0

    .prologue
    .line 31
    invoke-virtual {p0, p1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/d;->a(Landroid/graphics/Canvas;)V

    .line 32
    return-void
.end method

.method public getOpacity()I
    .locals 1

    .prologue
    .line 45
    const/4 v0, 0x0

    return v0
.end method

.method public setAlpha(I)V
    .locals 0

    .prologue
    .line 37
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .prologue
    .line 41
    return-void
.end method
