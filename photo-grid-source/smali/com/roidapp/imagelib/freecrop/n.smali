.class public final Lcom/roidapp/imagelib/freecrop/n;
.super Lcom/roidapp/imagelib/freecrop/l;
.source "SourceFile"


# instance fields
.field private G:Landroid/graphics/Path;

.field private H:Landroid/graphics/Paint;

.field private I:Lcom/roidapp/imagelib/freecrop/a;

.field private J:Lcom/roidapp/imagelib/freecrop/a;

.field private K:F

.field private L:F

.field private M:I

.field private N:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/graphics/Bitmap;II)V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 35
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/roidapp/imagelib/freecrop/l;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap;II)V

    .line 22
    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/n;->I:Lcom/roidapp/imagelib/freecrop/a;

    .line 23
    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/n;->J:Lcom/roidapp/imagelib/freecrop/a;

    .line 1055
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/n;->H:Landroid/graphics/Paint;

    .line 1056
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/n;->H:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 1057
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/n;->H:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 37
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    const/high16 v1, 0x3f800000    # 1.0f

    .line 49
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/n;->x:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 50
    iput v1, p0, Lcom/roidapp/imagelib/freecrop/n;->D:F

    .line 51
    iput v1, p0, Lcom/roidapp/imagelib/freecrop/n;->E:F

    .line 52
    return-void
.end method

.method public final a(II)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 145
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/n;->I:Lcom/roidapp/imagelib/freecrop/a;

    if-eqz v0, :cond_0

    .line 146
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/n;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 147
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/n;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 149
    new-instance v2, Landroid/graphics/RectF;

    int-to-float v0, v0

    int-to-float v1, v1

    invoke-direct {v2, v4, v4, v0, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 151
    new-instance v0, Landroid/graphics/RectF;

    int-to-float v1, p1

    int-to-float v3, p2

    invoke-direct {v0, v4, v4, v1, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 152
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/n;->v:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 153
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/n;->I:Lcom/roidapp/imagelib/freecrop/a;

    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/n;->t:Landroid/graphics/Matrix;

    invoke-virtual {v1, v3, v2, v0}, Lcom/roidapp/imagelib/freecrop/a;->a(Landroid/graphics/Matrix;Landroid/graphics/RectF;Landroid/graphics/RectF;)V

    .line 155
    :cond_0
    return-void
.end method

.method public final a(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Z)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 158
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 159
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/imagelib/freecrop/l;->a(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Z)V

    .line 160
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 162
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/n;->G:Landroid/graphics/Path;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/n;->G:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 163
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    .line 165
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 166
    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/n;->h()Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 167
    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/n;->k()Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 169
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/n;->G:Landroid/graphics/Path;

    sget-object v2, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 170
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 171
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V

    .line 172
    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/n;->l()F

    move-result v0

    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/n;->m()F

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 173
    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/n;->g()F

    move-result v0

    invoke-virtual {p1, v0, v3, v3}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 175
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/n;->i:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/n;->l:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 176
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 178
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/n;->G:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/n;->H:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 180
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 183
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 184
    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/n;->h()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 185
    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/n;->k()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 186
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/n;->I:Lcom/roidapp/imagelib/freecrop/a;

    invoke-virtual {v0, p1}, Lcom/roidapp/imagelib/freecrop/a;->a(Landroid/graphics/Canvas;)V

    .line 187
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 189
    :cond_0
    return-void
.end method

.method public final a(Landroid/graphics/Path;)V
    .locals 0

    .prologue
    .line 45
    iput-object p1, p0, Lcom/roidapp/imagelib/freecrop/n;->G:Landroid/graphics/Path;

    .line 46
    return-void
.end method

.method public final a(Lcom/roidapp/imagelib/freecrop/FreeCropView;)V
    .locals 1

    .prologue
    .line 40
    invoke-super {p0, p1}, Lcom/roidapp/imagelib/freecrop/l;->a(Lcom/roidapp/imagelib/freecrop/FreeCropView;)V

    .line 41
    new-instance v0, Lcom/roidapp/imagelib/freecrop/a;

    invoke-direct {v0, p1, p0}, Lcom/roidapp/imagelib/freecrop/a;-><init>(Landroid/view/View;Lcom/roidapp/imagelib/freecrop/l;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/n;->I:Lcom/roidapp/imagelib/freecrop/a;

    .line 42
    return-void
.end method

.method public final a(FF)Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    .line 100
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/n;->I:Lcom/roidapp/imagelib/freecrop/a;

    .line 101
    if-eqz v0, :cond_2

    iget-object v2, v0, Lcom/roidapp/imagelib/freecrop/a;->b:Landroid/graphics/RectF;

    if-eqz v2, :cond_2

    .line 102
    invoke-virtual {v0, p1, p2}, Lcom/roidapp/imagelib/freecrop/a;->a(FF)I

    move-result v2

    .line 103
    if-eqz v2, :cond_0

    .line 104
    iput v2, p0, Lcom/roidapp/imagelib/freecrop/n;->M:I

    .line 105
    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/n;->i()Landroid/graphics/Matrix;

    move-result-object v3

    invoke-static {p1, p2, v3}, Lcom/roidapp/imagelib/freecrop/a;->a(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v3

    .line 106
    iget v4, v3, Landroid/graphics/PointF;->x:F

    iput v4, p0, Lcom/roidapp/imagelib/freecrop/n;->K:F

    .line 107
    iget v3, v3, Landroid/graphics/PointF;->y:F

    iput v3, p0, Lcom/roidapp/imagelib/freecrop/n;->L:F

    .line 108
    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/n;->J:Lcom/roidapp/imagelib/freecrop/a;

    .line 110
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/n;->J:Lcom/roidapp/imagelib/freecrop/a;

    const/4 v0, 0x5

    if-ne v2, v0, :cond_1

    sget v0, Lcom/roidapp/imagelib/freecrop/b;->b:I

    :goto_0
    invoke-virtual {v3, v0}, Lcom/roidapp/imagelib/freecrop/a;->a(I)V

    .line 116
    :cond_0
    iput-boolean v1, p0, Lcom/roidapp/imagelib/freecrop/n;->N:Z

    move v0, v1

    .line 117
    :goto_1
    return v0

    .line 110
    :cond_1
    sget v0, Lcom/roidapp/imagelib/freecrop/b;->c:I

    goto :goto_0

    .line 115
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public final a(FFFF)Z
    .locals 10

    .prologue
    .line 130
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/n;->J:Lcom/roidapp/imagelib/freecrop/a;

    if-eqz v0, :cond_1

    .line 131
    iget-boolean v0, p0, Lcom/roidapp/imagelib/freecrop/n;->m:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/imagelib/freecrop/n;->N:Z

    if-eqz v0, :cond_0

    .line 132
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/n;->J:Lcom/roidapp/imagelib/freecrop/a;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/roidapp/imagelib/freecrop/a;->a(FFFF)V

    .line 133
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/imagelib/freecrop/n;->N:Z

    .line 135
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/n;->i()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-static {p1, p2, v0}, Lcom/roidapp/imagelib/freecrop/a;->a(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v9

    .line 136
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/n;->J:Lcom/roidapp/imagelib/freecrop/a;

    iget-boolean v1, p0, Lcom/roidapp/imagelib/freecrop/n;->m:Z

    iget v2, p0, Lcom/roidapp/imagelib/freecrop/n;->M:I

    iget v3, v9, Landroid/graphics/PointF;->x:F

    iget v4, p0, Lcom/roidapp/imagelib/freecrop/n;->K:F

    sub-float/2addr v3, v4

    iget v4, v9, Landroid/graphics/PointF;->y:F

    iget v5, p0, Lcom/roidapp/imagelib/freecrop/n;->L:F

    sub-float/2addr v4, v5

    move v5, p1

    move v6, p2

    move v7, p3

    move v8, p4

    invoke-virtual/range {v0 .. v8}, Lcom/roidapp/imagelib/freecrop/a;->a(ZIFFFFFF)V

    .line 138
    iget v0, v9, Landroid/graphics/PointF;->x:F

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/n;->K:F

    .line 139
    iget v0, v9, Landroid/graphics/PointF;->y:F

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/n;->L:F

    .line 141
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public final c()Z
    .locals 7

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 61
    invoke-super {p0}, Lcom/roidapp/imagelib/freecrop/l;->c()Z

    .line 62
    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, p0, Lcom/roidapp/imagelib/freecrop/n;->g:Landroid/graphics/RectF;

    .line 63
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/n;->G:Landroid/graphics/Path;

    if-nez v2, :cond_1

    .line 93
    :cond_0
    :goto_0
    return v0

    .line 65
    :cond_1
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/n;->G:Landroid/graphics/Path;

    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/n;->x:Landroid/graphics/Matrix;

    invoke-virtual {v2, v3}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 66
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/n;->G:Landroid/graphics/Path;

    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/n;->g:Landroid/graphics/RectF;

    invoke-virtual {v2, v3, v0}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 67
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 68
    const/high16 v3, -0x1000000

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 69
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 71
    :try_start_0
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/n;->g:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    iput v3, p0, Lcom/roidapp/imagelib/freecrop/n;->d:I

    .line 72
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/n;->g:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    iput v3, p0, Lcom/roidapp/imagelib/freecrop/n;->e:I

    .line 73
    iget v3, p0, Lcom/roidapp/imagelib/freecrop/n;->d:I

    iget v4, p0, Lcom/roidapp/imagelib/freecrop/n;->e:I

    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v4, v5}, Lcom/roidapp/imagelib/b/c;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    iput-object v3, p0, Lcom/roidapp/imagelib/freecrop/n;->f:Landroid/graphics/Bitmap;

    .line 74
    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/n;->f:Landroid/graphics/Bitmap;

    if-eqz v3, :cond_0

    .line 76
    new-instance v3, Landroid/graphics/Canvas;

    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/n;->f:Landroid/graphics/Bitmap;

    invoke-direct {v3, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 77
    new-instance v4, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v5, 0x0

    const/4 v6, 0x3

    invoke-direct {v4, v5, v6}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v3, v4}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 79
    new-instance v4, Landroid/graphics/Matrix;

    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    .line 80
    iget-object v5, p0, Lcom/roidapp/imagelib/freecrop/n;->g:Landroid/graphics/RectF;

    iget v5, v5, Landroid/graphics/RectF;->left:F

    neg-float v5, v5

    iget-object v6, p0, Lcom/roidapp/imagelib/freecrop/n;->g:Landroid/graphics/RectF;

    iget v6, v6, Landroid/graphics/RectF;->top:F

    neg-float v6, v6

    invoke-virtual {v4, v5, v6}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 81
    iget-object v5, p0, Lcom/roidapp/imagelib/freecrop/n;->G:Landroid/graphics/Path;

    invoke-virtual {v5, v4}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 82
    iget-object v4, p0, Lcom/roidapp/imagelib/freecrop/n;->G:Landroid/graphics/Path;

    invoke-virtual {v3, v4, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move v0, v1

    .line 93
    goto :goto_0

    .line 84
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 85
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 86
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/n;->f:Landroid/graphics/Bitmap;

    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 89
    :catch_1
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 90
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/n;->f:Landroid/graphics/Bitmap;

    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    goto/16 :goto_0
.end method

.method public final d()Z
    .locals 2

    .prologue
    .line 121
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/n;->J:Lcom/roidapp/imagelib/freecrop/a;

    if-eqz v0, :cond_0

    .line 122
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/n;->J:Lcom/roidapp/imagelib/freecrop/a;

    sget v1, Lcom/roidapp/imagelib/freecrop/b;->a:I

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/freecrop/a;->a(I)V

    .line 124
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/n;->J:Lcom/roidapp/imagelib/freecrop/a;

    .line 125
    const/4 v0, 0x1

    return v0
.end method
