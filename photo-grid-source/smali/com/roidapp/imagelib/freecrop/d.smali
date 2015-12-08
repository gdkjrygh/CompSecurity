.class public final Lcom/roidapp/imagelib/freecrop/d;
.super Lcom/roidapp/imagelib/freecrop/l;
.source "SourceFile"


# instance fields
.field private G:Lcom/roidapp/imagelib/freecrop/c;

.field private H:Z

.field private I:Landroid/graphics/drawable/Drawable;

.field private J:Landroid/graphics/drawable/Drawable;

.field private K:Landroid/graphics/Paint;

.field private L:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/graphics/Bitmap;II)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 35
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/roidapp/imagelib/freecrop/l;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap;II)V

    .line 21
    iput-boolean v2, p0, Lcom/roidapp/imagelib/freecrop/d;->H:Z

    .line 24
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->K:Landroid/graphics/Paint;

    .line 1040
    new-instance v0, Lcom/roidapp/imagelib/freecrop/c;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/d;->n()F

    move-result v1

    invoke-direct {v0, v1}, Lcom/roidapp/imagelib/freecrop/c;-><init>(F)V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    .line 1041
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/imagelib/d;->a:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    .line 1042
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/d;->K:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 1043
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->K:Landroid/graphics/Paint;

    const/high16 v1, 0x40800000    # 4.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 1044
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->K:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 1045
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->K:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 1047
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/imagelib/f;->aM:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->J:Landroid/graphics/drawable/Drawable;

    .line 1048
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/imagelib/f;->aq:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->I:Landroid/graphics/drawable/Drawable;

    .line 1049
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->I:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v2, v2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 37
    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Z)V
    .locals 10

    .prologue
    const/4 v2, 0x0

    const/4 v9, 0x1

    const/4 v8, 0x0

    const/high16 v7, 0x40000000    # 2.0f

    .line 170
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 171
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/imagelib/freecrop/l;->a(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Z)V

    .line 172
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 174
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/c;->i()I

    move-result v0

    if-eqz v0, :cond_4

    .line 176
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 177
    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/d;->l()F

    move-result v0

    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/d;->m()F

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 178
    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/d;->g()F

    move-result v0

    invoke-virtual {p1, v0, v2, v2}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 180
    iget-boolean v0, p0, Lcom/roidapp/imagelib/freecrop/d;->H:Z

    if-eqz v0, :cond_0

    .line 181
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 182
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    sget-object v1, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 183
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->i:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/d;->l:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 184
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 187
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/d;->K:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 189
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 191
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->J:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1206
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/c;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->J:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    .line 1208
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/c;->e()[F

    move-result-object v0

    .line 1209
    if-eqz v0, :cond_1

    .line 1211
    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/d;->h()Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 1212
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/d;->J:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v1

    int-to-float v1, v1

    .line 1213
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/d;->J:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v2

    int-to-float v2, v2

    .line 1214
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/d;->J:Landroid/graphics/drawable/Drawable;

    aget v4, v0, v8

    div-float v5, v1, v7

    sub-float/2addr v4, v5

    float-to-int v4, v4

    aget v5, v0, v9

    sub-float v2, v5, v2

    float-to-int v2, v2

    aget v5, v0, v8

    div-float/2addr v1, v7

    add-float/2addr v1, v5

    float-to-int v1, v1

    aget v0, v0, v9

    float-to-int v0, v0

    invoke-virtual {v3, v4, v2, v1, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 194
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->J:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 196
    :cond_2
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->I:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1220
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/c;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->I:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_3

    .line 1221
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/c;->d()[F

    move-result-object v0

    .line 1222
    if-eqz v0, :cond_3

    .line 1224
    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/d;->h()Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 1225
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/d;->I:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v1

    int-to-float v1, v1

    .line 1226
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/d;->I:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v2

    int-to-float v2, v2

    .line 1227
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/d;->I:Landroid/graphics/drawable/Drawable;

    aget v4, v0, v8

    div-float v5, v1, v7

    sub-float/2addr v4, v5

    float-to-int v4, v4

    aget v5, v0, v9

    div-float v6, v2, v7

    sub-float/2addr v5, v6

    float-to-int v5, v5

    aget v6, v0, v8

    div-float/2addr v1, v7

    add-float/2addr v1, v6

    float-to-int v1, v1

    aget v0, v0, v9

    div-float/2addr v2, v7

    add-float/2addr v0, v2

    float-to-int v0, v0

    invoke-virtual {v3, v4, v5, v1, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 1228
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/c;->c()F

    move-result v0

    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/d;->g()F

    move-result v1

    add-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/d;->L:F

    .line 199
    :cond_3
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/d;->L:F

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/d;->I:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Rect;->centerX()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/d;->I:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Rect;->centerY()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 200
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->I:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 203
    :cond_4
    return-void
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 53
    iget-boolean v0, p0, Lcom/roidapp/imagelib/freecrop/d;->H:Z

    return v0
.end method

.method public final a(FF)Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 101
    .line 102
    const/4 v2, 0x2

    new-array v2, v2, [F

    .line 103
    aput p1, v2, v1

    .line 104
    aput p2, v2, v0

    .line 106
    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/d;->i()Landroid/graphics/Matrix;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 107
    invoke-virtual {p0, v2}, Lcom/roidapp/imagelib/freecrop/d;->a([F)V

    .line 109
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    if-eqz v3, :cond_3

    .line 110
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    aget v4, v2, v1

    aget v5, v2, v0

    invoke-virtual {v3, v4, v5}, Lcom/roidapp/imagelib/freecrop/c;->a(FF)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-boolean v3, p0, Lcom/roidapp/imagelib/freecrop/d;->H:Z

    if-eqz v3, :cond_2

    .line 111
    :cond_0
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    aget v4, v2, v1

    aget v2, v2, v0

    invoke-virtual {v3, v4, v2}, Lcom/roidapp/imagelib/freecrop/c;->moveTo(FF)V

    .line 120
    :goto_0
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/d;->I:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_1

    .line 121
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/d;->I:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2, v1, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 123
    :cond_1
    iput-boolean v1, p0, Lcom/roidapp/imagelib/freecrop/d;->H:Z

    .line 124
    return v0

    .line 115
    :cond_2
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    aget v4, v2, v1

    aget v2, v2, v0

    invoke-virtual {v3, v4, v2, v0}, Lcom/roidapp/imagelib/freecrop/c;->a(FFZ)V

    move v0, v1

    .line 116
    goto :goto_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public final a(FFFF)Z
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 155
    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 156
    aput p1, v0, v3

    .line 157
    aput p2, v0, v4

    .line 159
    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/d;->i()Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 160
    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/freecrop/d;->a([F)V

    .line 162
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    if-eqz v1, :cond_0

    .line 163
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    aget v2, v0, v3

    aget v0, v0, v4

    invoke-virtual {v1, v2, v0, v3}, Lcom/roidapp/imagelib/freecrop/c;->a(FFZ)V

    .line 165
    :cond_0
    return v4
.end method

.method public final b()Lcom/roidapp/imagelib/freecrop/c;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    return-object v0
.end method

.method public final c()Z
    .locals 7

    .prologue
    const/4 v1, 0x1

    const/4 v6, 0x0

    const/4 v0, 0x0

    .line 61
    invoke-super {p0}, Lcom/roidapp/imagelib/freecrop/l;->c()Z

    .line 62
    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, p0, Lcom/roidapp/imagelib/freecrop/d;->g:Landroid/graphics/RectF;

    .line 63
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    invoke-virtual {v2}, Lcom/roidapp/imagelib/freecrop/c;->a()F

    move-result v2

    .line 64
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-virtual {v3, v4}, Lcom/roidapp/imagelib/freecrop/c;->a(F)V

    .line 65
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    invoke-virtual {v4}, Lcom/roidapp/imagelib/freecrop/c;->f()[F

    move-result-object v4

    iget-object v5, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    invoke-virtual {v5}, Lcom/roidapp/imagelib/freecrop/c;->g()[F

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/roidapp/imagelib/freecrop/c;->a([F[F)V

    .line 66
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/d;->g:Landroid/graphics/RectF;

    invoke-virtual {v3, v4, v0}, Lcom/roidapp/imagelib/freecrop/c;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 67
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/d;->g:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v3

    cmpg-float v3, v3, v6

    if-lez v3, :cond_0

    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/d;->g:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v3

    cmpg-float v3, v3, v6

    if-gtz v3, :cond_2

    .line 68
    :cond_0
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    invoke-virtual {v1, v2}, Lcom/roidapp/imagelib/freecrop/c;->a(F)V

    .line 96
    :cond_1
    :goto_0
    return v0

    .line 71
    :cond_2
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 72
    const/high16 v3, -0x1000000

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 73
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 75
    :try_start_0
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/d;->g:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    iput v3, p0, Lcom/roidapp/imagelib/freecrop/d;->d:I

    .line 76
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/d;->g:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    iput v3, p0, Lcom/roidapp/imagelib/freecrop/d;->e:I

    .line 77
    iget v3, p0, Lcom/roidapp/imagelib/freecrop/d;->d:I

    iget v4, p0, Lcom/roidapp/imagelib/freecrop/d;->e:I

    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v4, v5}, Lcom/roidapp/imagelib/b/c;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    iput-object v3, p0, Lcom/roidapp/imagelib/freecrop/d;->f:Landroid/graphics/Bitmap;

    .line 78
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/d;->f:Landroid/graphics/Bitmap;

    if-eqz v3, :cond_1

    .line 80
    new-instance v3, Landroid/graphics/Canvas;

    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/d;->f:Landroid/graphics/Bitmap;

    invoke-direct {v3, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 81
    new-instance v4, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v5, 0x0

    const/4 v6, 0x3

    invoke-direct {v4, v5, v6}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v3, v4}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 82
    new-instance v4, Landroid/graphics/Matrix;

    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    .line 83
    iget-object v5, p0, Lcom/roidapp/imagelib/freecrop/d;->g:Landroid/graphics/RectF;

    iget v5, v5, Landroid/graphics/RectF;->left:F

    neg-float v5, v5

    iget-object v6, p0, Lcom/roidapp/imagelib/freecrop/d;->g:Landroid/graphics/RectF;

    iget v6, v6, Landroid/graphics/RectF;->top:F

    neg-float v6, v6

    invoke-virtual {v4, v5, v6}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 84
    iget-object v5, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    invoke-virtual {v5, v4}, Lcom/roidapp/imagelib/freecrop/c;->transform(Landroid/graphics/Matrix;)V

    .line 85
    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    invoke-virtual {v3, v4, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move v0, v1

    .line 96
    goto :goto_0

    .line 87
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 88
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 89
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/d;->f:Landroid/graphics/Bitmap;

    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 92
    :catch_1
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 93
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/d;->f:Landroid/graphics/Bitmap;

    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    goto :goto_0
.end method

.method public final d()Z
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 129
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    if-eqz v0, :cond_0

    .line 131
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/c;->b()Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/imagelib/freecrop/c;->a(Landroid/graphics/RectF;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 133
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/c;->reset()V

    .line 134
    iput-boolean v4, p0, Lcom/roidapp/imagelib/freecrop/d;->H:Z

    .line 148
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->I:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/roidapp/imagelib/freecrop/d;->H:Z

    if-nez v0, :cond_1

    .line 149
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->I:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v4, v5}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 151
    :cond_1
    iget-boolean v0, p0, Lcom/roidapp/imagelib/freecrop/d;->H:Z

    return v0

    .line 138
    :cond_2
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/c;->h()V

    .line 139
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/c;->e()[F

    move-result-object v0

    .line 140
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/freecrop/c;->d()[F

    move-result-object v1

    .line 141
    aget v2, v0, v5

    aget v0, v0, v4

    aget v3, v1, v5

    aget v1, v1, v4

    invoke-static {v2, v0, v3, v1}, Lcom/roidapp/imagelib/freecrop/c;->a(FFFF)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 142
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/d;->G:Lcom/roidapp/imagelib/freecrop/c;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/c;->close()V

    .line 143
    iput-boolean v4, p0, Lcom/roidapp/imagelib/freecrop/d;->H:Z

    goto :goto_0
.end method
