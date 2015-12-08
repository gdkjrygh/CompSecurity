.class public Lcom/roidapp/photogrid/release/aq;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field protected a:Landroid/content/Context;

.field protected b:Lcom/roidapp/photogrid/release/lc;

.field protected c:Lcom/roidapp/photogrid/release/ig;

.field protected d:Landroid/graphics/Bitmap;

.field protected e:Landroid/graphics/Bitmap;

.field protected f:I

.field protected g:I

.field protected h:Z

.field protected i:F

.field protected j:F

.field protected k:F

.field protected l:F

.field protected m:Z

.field protected n:J

.field protected o:F

.field protected p:I

.field protected q:I

.field protected r:F

.field protected s:Z

.field protected t:Z

.field protected u:F

.field protected v:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 54
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 30
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/roidapp/photogrid/release/aq;->r:F

    .line 32
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/aq;->s:Z

    .line 55
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xa

    if-le v0, v1, :cond_0

    .line 56
    invoke-static {p0}, Lcom/roidapp/photogrid/common/bl;->a(Landroid/view/View;)V

    .line 58
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 94
    iget-object v0, p0, Lcom/roidapp/photogrid/release/aq;->c:Lcom/roidapp/photogrid/release/ig;

    iget v1, p0, Lcom/roidapp/photogrid/release/aq;->u:F

    iput v1, v0, Lcom/roidapp/photogrid/release/ig;->t:F

    .line 95
    iget-object v0, p0, Lcom/roidapp/photogrid/release/aq;->c:Lcom/roidapp/photogrid/release/ig;

    iget v1, p0, Lcom/roidapp/photogrid/release/aq;->v:F

    iput v1, v0, Lcom/roidapp/photogrid/release/ig;->u:F

    .line 96
    return-void
.end method

.method public final a(F)V
    .locals 2

    .prologue
    .line 225
    iget-object v0, p0, Lcom/roidapp/photogrid/release/aq;->c:Lcom/roidapp/photogrid/release/ig;

    iget v1, v0, Lcom/roidapp/photogrid/release/ig;->p:I

    int-to-float v1, v1

    add-float/2addr v1, p1

    float-to-int v1, v1

    iput v1, v0, Lcom/roidapp/photogrid/release/ig;->p:I

    .line 226
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/aq;->invalidate()V

    .line 227
    return-void
.end method

.method public final a(FFFF)V
    .locals 3

    .prologue
    .line 88
    iget-object v0, p0, Lcom/roidapp/photogrid/release/aq;->c:Lcom/roidapp/photogrid/release/ig;

    iget v1, v0, Lcom/roidapp/photogrid/release/ig;->t:F

    sub-float v2, p3, p1

    float-to-int v2, v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    iput v1, v0, Lcom/roidapp/photogrid/release/ig;->t:F

    .line 89
    iget-object v0, p0, Lcom/roidapp/photogrid/release/aq;->c:Lcom/roidapp/photogrid/release/ig;

    iget v1, v0, Lcom/roidapp/photogrid/release/ig;->u:F

    sub-float v2, p4, p2

    float-to-int v2, v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    iput v1, v0, Lcom/roidapp/photogrid/release/ig;->u:F

    .line 90
    return-void
.end method

.method public final a(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 66
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/aq;->h:Z

    .line 67
    iput-object p1, p0, Lcom/roidapp/photogrid/release/aq;->d:Landroid/graphics/Bitmap;

    .line 68
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/aq;->invalidate()V

    .line 69
    return-void
.end method

.method public final a(Z)Z
    .locals 9

    .prologue
    const/4 v8, 0x4

    const-wide v6, 0x3fb99999a0000000L    # 0.10000000149011612

    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 104
    .line 105
    instance-of v2, p0, Lcom/roidapp/photogrid/release/if;

    if-eqz v2, :cond_4

    .line 106
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/aq;->b()F

    move-result v2

    .line 108
    iget-object v3, p0, Lcom/roidapp/photogrid/release/aq;->c:Lcom/roidapp/photogrid/release/ig;

    iget v3, v3, Lcom/roidapp/photogrid/release/ig;->v:F

    cmpl-float v2, v3, v2

    if-ltz v2, :cond_1

    .line 109
    if-eqz p1, :cond_3

    .line 138
    :cond_0
    :goto_0
    return v0

    .line 115
    :cond_1
    if-eqz p1, :cond_2

    move v0, v1

    .line 116
    goto :goto_0

    .line 118
    :cond_2
    iget-object v2, p0, Lcom/roidapp/photogrid/release/aq;->c:Lcom/roidapp/photogrid/release/ig;

    new-instance v3, Ljava/math/BigDecimal;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/aq;->c:Lcom/roidapp/photogrid/release/ig;

    iget v4, v4, Lcom/roidapp/photogrid/release/ig;->v:F

    float-to-double v4, v4

    invoke-direct {v3, v4, v5}, Ljava/math/BigDecimal;-><init>(D)V

    new-instance v4, Ljava/math/BigDecimal;

    invoke-direct {v4, v6, v7}, Ljava/math/BigDecimal;-><init>(D)V

    invoke-virtual {v3, v4}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v3

    invoke-virtual {v3, v0, v8}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->floatValue()F

    move-result v0

    iput v0, v2, Lcom/roidapp/photogrid/release/ig;->v:F

    move v0, v1

    .line 135
    :cond_3
    :goto_1
    if-nez v0, :cond_0

    .line 136
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/aq;->invalidate()V

    goto :goto_0

    .line 122
    :cond_4
    iget-object v2, p0, Lcom/roidapp/photogrid/release/aq;->c:Lcom/roidapp/photogrid/release/ig;

    iget v2, v2, Lcom/roidapp/photogrid/release/ig;->v:F

    const/high16 v3, 0x40000000    # 2.0f

    cmpl-float v2, v2, v3

    if-ltz v2, :cond_5

    .line 123
    if-eqz p1, :cond_3

    goto :goto_0

    .line 129
    :cond_5
    if-eqz p1, :cond_6

    move v0, v1

    .line 130
    goto :goto_0

    .line 132
    :cond_6
    iget-object v2, p0, Lcom/roidapp/photogrid/release/aq;->c:Lcom/roidapp/photogrid/release/ig;

    new-instance v3, Ljava/math/BigDecimal;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/aq;->c:Lcom/roidapp/photogrid/release/ig;

    iget v4, v4, Lcom/roidapp/photogrid/release/ig;->v:F

    float-to-double v4, v4

    invoke-direct {v3, v4, v5}, Ljava/math/BigDecimal;-><init>(D)V

    new-instance v4, Ljava/math/BigDecimal;

    invoke-direct {v4, v6, v7}, Ljava/math/BigDecimal;-><init>(D)V

    invoke-virtual {v3, v4}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v3

    invoke-virtual {v3, v0, v8}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->floatValue()F

    move-result v0

    iput v0, v2, Lcom/roidapp/photogrid/release/ig;->v:F

    move v0, v1

    goto :goto_1
.end method

.method public final b()F
    .locals 3

    .prologue
    .line 168
    iget-object v0, p0, Lcom/roidapp/photogrid/release/aq;->d:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    .line 169
    const/high16 v0, 0x40000000    # 2.0f

    .line 185
    :goto_0
    return v0

    .line 171
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/aq;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/aq;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 172
    iget v1, p0, Lcom/roidapp/photogrid/release/aq;->f:I

    int-to-float v1, v1

    iget v2, p0, Lcom/roidapp/photogrid/release/aq;->g:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 175
    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 176
    iget v0, p0, Lcom/roidapp/photogrid/release/aq;->g:I

    int-to-float v0, v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/aq;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lcom/roidapp/photogrid/release/aq;->r:F

    mul-float/2addr v1, v2

    div-float/2addr v0, v1

    .line 184
    :goto_1
    const/high16 v1, 0x3f800000    # 1.0f

    add-float/2addr v0, v1

    .line 185
    goto :goto_0

    .line 179
    :cond_1
    iget v0, p0, Lcom/roidapp/photogrid/release/aq;->f:I

    int-to-float v0, v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/aq;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lcom/roidapp/photogrid/release/aq;->r:F

    mul-float/2addr v1, v2

    div-float/2addr v0, v1

    goto :goto_1
.end method

.method public final b(Z)Z
    .locals 8

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 146
    .line 148
    iget-object v2, p0, Lcom/roidapp/photogrid/release/aq;->c:Lcom/roidapp/photogrid/release/ig;

    iget v2, v2, Lcom/roidapp/photogrid/release/ig;->v:F

    const v3, 0x3dcccccd    # 0.1f

    cmpg-float v2, v2, v3

    if-gtz v2, :cond_1

    .line 149
    if-eqz p1, :cond_3

    .line 164
    :cond_0
    :goto_0
    return v0

    .line 155
    :cond_1
    if-eqz p1, :cond_2

    move v0, v1

    .line 156
    goto :goto_0

    .line 158
    :cond_2
    iget-object v2, p0, Lcom/roidapp/photogrid/release/aq;->c:Lcom/roidapp/photogrid/release/ig;

    new-instance v3, Ljava/math/BigDecimal;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/aq;->c:Lcom/roidapp/photogrid/release/ig;

    iget v4, v4, Lcom/roidapp/photogrid/release/ig;->v:F

    float-to-double v4, v4

    invoke-direct {v3, v4, v5}, Ljava/math/BigDecimal;-><init>(D)V

    new-instance v4, Ljava/math/BigDecimal;

    const-wide v6, -0x4046666660000000L    # -0.10000000149011612

    invoke-direct {v4, v6, v7}, Ljava/math/BigDecimal;-><init>(D)V

    invoke-virtual {v3, v4}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v3

    const/4 v4, 0x4

    invoke-virtual {v3, v0, v4}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->floatValue()F

    move-result v0

    iput v0, v2, Lcom/roidapp/photogrid/release/ig;->v:F

    move v0, v1

    .line 161
    :cond_3
    if-nez v0, :cond_0

    .line 162
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/aq;->invalidate()V

    goto :goto_0
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 193
    iget-object v0, p0, Lcom/roidapp/photogrid/release/aq;->c:Lcom/roidapp/photogrid/release/ig;

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v0, Lcom/roidapp/photogrid/release/ig;->v:F

    .line 194
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/aq;->invalidate()V

    .line 195
    return-void
.end method

.method public final c(Z)V
    .locals 3

    .prologue
    .line 201
    if-eqz p1, :cond_0

    .line 202
    iget-object v0, p0, Lcom/roidapp/photogrid/release/aq;->c:Lcom/roidapp/photogrid/release/ig;

    iget v1, v0, Lcom/roidapp/photogrid/release/ig;->t:F

    sget v2, Lcom/roidapp/photogrid/common/az;->e:I

    int-to-float v2, v2

    add-float/2addr v1, v2

    iput v1, v0, Lcom/roidapp/photogrid/release/ig;->t:F

    .line 206
    :goto_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/aq;->invalidate()V

    .line 207
    return-void

    .line 204
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/aq;->c:Lcom/roidapp/photogrid/release/ig;

    iget v1, v0, Lcom/roidapp/photogrid/release/ig;->t:F

    sget v2, Lcom/roidapp/photogrid/common/az;->e:I

    int-to-float v2, v2

    sub-float/2addr v1, v2

    iput v1, v0, Lcom/roidapp/photogrid/release/ig;->t:F

    goto :goto_0
.end method

.method public final d()V
    .locals 2

    .prologue
    .line 233
    iget-object v0, p0, Lcom/roidapp/photogrid/release/aq;->c:Lcom/roidapp/photogrid/release/ig;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/aq;->c:Lcom/roidapp/photogrid/release/ig;

    iget v1, v1, Lcom/roidapp/photogrid/release/ig;->r:I

    neg-int v1, v1

    iput v1, v0, Lcom/roidapp/photogrid/release/ig;->r:I

    .line 234
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/aq;->invalidate()V

    .line 235
    return-void
.end method

.method public final d(Z)V
    .locals 3

    .prologue
    .line 213
    if-eqz p1, :cond_0

    .line 214
    iget-object v0, p0, Lcom/roidapp/photogrid/release/aq;->c:Lcom/roidapp/photogrid/release/ig;

    iget v1, v0, Lcom/roidapp/photogrid/release/ig;->u:F

    sget v2, Lcom/roidapp/photogrid/common/az;->f:I

    int-to-float v2, v2

    add-float/2addr v1, v2

    iput v1, v0, Lcom/roidapp/photogrid/release/ig;->u:F

    .line 218
    :goto_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/aq;->invalidate()V

    .line 219
    return-void

    .line 216
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/aq;->c:Lcom/roidapp/photogrid/release/ig;

    iget v1, v0, Lcom/roidapp/photogrid/release/ig;->u:F

    sget v2, Lcom/roidapp/photogrid/common/az;->f:I

    int-to-float v2, v2

    sub-float/2addr v1, v2

    iput v1, v0, Lcom/roidapp/photogrid/release/ig;->u:F

    goto :goto_0
.end method

.method public final e()V
    .locals 2

    .prologue
    .line 241
    iget-object v0, p0, Lcom/roidapp/photogrid/release/aq;->c:Lcom/roidapp/photogrid/release/ig;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/aq;->c:Lcom/roidapp/photogrid/release/ig;

    iget v1, v1, Lcom/roidapp/photogrid/release/ig;->s:I

    neg-int v1, v1

    iput v1, v0, Lcom/roidapp/photogrid/release/ig;->s:I

    .line 242
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/aq;->invalidate()V

    .line 243
    return-void
.end method

.method public isSelected()Z
    .locals 1

    .prologue
    .line 43
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/aq;->s:Z

    return v0
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 247
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 248
    iget-object v0, p0, Lcom/roidapp/photogrid/release/aq;->e:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/aq;->e:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 249
    iget-object v0, p0, Lcom/roidapp/photogrid/release/aq;->e:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 251
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/aq;->e:Landroid/graphics/Bitmap;

    .line 253
    return-void
.end method

.method public onMeasure(II)V
    .locals 2

    .prologue
    .line 62
    iget v0, p0, Lcom/roidapp/photogrid/release/aq;->f:I

    iget v1, p0, Lcom/roidapp/photogrid/release/aq;->g:I

    invoke-super {p0, v0, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 63
    return-void
.end method

.method public setSelected(Z)V
    .locals 0

    .prologue
    .line 47
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/aq;->s:Z

    .line 48
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/aq;->invalidate()V

    .line 49
    return-void
.end method
