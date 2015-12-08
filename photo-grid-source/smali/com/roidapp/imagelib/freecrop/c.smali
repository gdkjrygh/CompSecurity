.class public final Lcom/roidapp/imagelib/freecrop/c;
.super Landroid/graphics/Path;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:F

.field private c:[F

.field private d:[F

.field private e:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 20
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/freecrop/c;-><init>(F)V

    .line 21
    return-void
.end method

.method public constructor <init>(F)V
    .locals 3

    .prologue
    const/16 v2, 0xc8

    const/high16 v1, -0x40800000    # -1.0f

    .line 24
    invoke-direct {p0}, Landroid/graphics/Path;-><init>()V

    .line 12
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    .line 13
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/c;->b:F

    .line 14
    new-array v0, v2, [F

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->c:[F

    .line 15
    new-array v0, v2, [F

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->d:[F

    .line 16
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0, v1, v1, v1, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->e:Landroid/graphics/RectF;

    .line 25
    iput p1, p0, Lcom/roidapp/imagelib/freecrop/c;->b:F

    .line 26
    return-void
.end method

.method public static a(FFFF)Z
    .locals 3

    .prologue
    const/high16 v2, 0x42480000    # 50.0f

    .line 42
    sub-float v0, p2, p0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    .line 43
    sub-float v1, p3, p1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    .line 45
    cmpg-float v0, v0, v2

    if-gez v0, :cond_0

    cmpg-float v0, v1, v2

    if-gez v0, :cond_0

    .line 46
    const/4 v0, 0x1

    .line 49
    :goto_0
    return v0

    .line 48
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Landroid/graphics/RectF;)Z
    .locals 2

    .prologue
    const/high16 v1, 0x40a00000    # 5.0f

    .line 66
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/graphics/RectF;->width()F

    move-result v0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    invoke-virtual {p0}, Landroid/graphics/RectF;->height()F

    move-result v0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()F
    .locals 1

    .prologue
    .line 33
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/c;->b:F

    return v0
.end method

.method public final a(F)V
    .locals 0

    .prologue
    .line 29
    iput p1, p0, Lcom/roidapp/imagelib/freecrop/c;->b:F

    .line 30
    return-void
.end method

.method public final a(FFZ)V
    .locals 10

    .prologue
    const/high16 v9, 0x41200000    # 10.0f

    const/high16 v8, 0x40000000    # 2.0f

    const/4 v7, 0x0

    const/4 v1, 0x0

    .line 104
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    const/16 v2, 0x1388

    if-eq v0, v2, :cond_9

    .line 105
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    if-eqz v0, :cond_b

    .line 107
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->c:[F

    iget v2, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    add-int/lit8 v2, v2, -0x1

    aget v0, v0, v2

    iget v2, p0, Lcom/roidapp/imagelib/freecrop/c;->b:F

    mul-float/2addr v2, v0

    .line 108
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->d:[F

    iget v3, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    add-int/lit8 v3, v3, -0x1

    aget v0, v0, v3

    iget v3, p0, Lcom/roidapp/imagelib/freecrop/c;->b:F

    mul-float/2addr v3, v0

    .line 109
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/c;->b:F

    mul-float v4, p1, v0

    .line 110
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/c;->b:F

    mul-float v5, p2, v0

    .line 111
    if-eqz p3, :cond_0

    .line 1054
    sub-float v0, v4, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    .line 1055
    sub-float v6, v5, v3

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v6

    .line 1057
    cmpg-float v0, v0, v9

    if-gez v0, :cond_a

    cmpg-float v0, v6, v9

    if-gez v0, :cond_a

    move v0, v1

    .line 111
    :goto_0
    if-eqz v0, :cond_9

    .line 113
    :cond_0
    add-float v0, v4, v2

    div-float/2addr v0, v8

    add-float v4, v5, v3

    div-float/2addr v4, v8

    invoke-virtual {p0, v2, v3, v0, v4}, Lcom/roidapp/imagelib/freecrop/c;->quadTo(FFFF)V

    .line 115
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->c:[F

    array-length v0, v0

    iget v2, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    if-le v0, v2, :cond_1

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->d:[F

    array-length v0, v0

    iget v2, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    if-gt v0, v2, :cond_2

    .line 117
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->c:[F

    array-length v0, v0

    add-int/lit16 v0, v0, 0xc8

    new-array v0, v0, [F

    .line 118
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/c;->c:[F

    iget v3, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    invoke-static {v2, v1, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 119
    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->c:[F

    .line 120
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->d:[F

    array-length v0, v0

    add-int/lit16 v0, v0, 0xc8

    new-array v0, v0, [F

    .line 121
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/c;->d:[F

    iget v3, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    invoke-static {v2, v1, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 122
    iput-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->d:[F

    .line 124
    :cond_2
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->e:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    cmpg-float v0, v0, v7

    if-ltz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->e:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    cmpg-float v0, p1, v0

    if-gez v0, :cond_4

    :cond_3
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->e:Landroid/graphics/RectF;

    iput p1, v0, Landroid/graphics/RectF;->left:F

    .line 125
    :cond_4
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->e:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->right:F

    cmpl-float v0, p1, v0

    if-lez v0, :cond_5

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->e:Landroid/graphics/RectF;

    iput p1, v0, Landroid/graphics/RectF;->right:F

    .line 126
    :cond_5
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->e:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->top:F

    cmpg-float v0, v0, v7

    if-ltz v0, :cond_6

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->e:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->top:F

    cmpg-float v0, p2, v0

    if-gez v0, :cond_7

    :cond_6
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->e:Landroid/graphics/RectF;

    iput p2, v0, Landroid/graphics/RectF;->top:F

    .line 127
    :cond_7
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->e:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    cmpl-float v0, p2, v0

    if-lez v0, :cond_8

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->e:Landroid/graphics/RectF;

    iput p2, v0, Landroid/graphics/RectF;->bottom:F

    .line 129
    :cond_8
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->c:[F

    iget v1, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    aput p1, v0, v1

    .line 130
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->d:[F

    iget v1, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    aput p2, v0, v1

    .line 131
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    .line 138
    :cond_9
    :goto_1
    return-void

    .line 1060
    :cond_a
    const/4 v0, 0x1

    goto/16 :goto_0

    .line 136
    :cond_b
    invoke-virtual {p0, p1, p2}, Lcom/roidapp/imagelib/freecrop/c;->moveTo(FF)V

    goto :goto_1
.end method

.method public final a([F[F)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 274
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    array-length v0, p1

    array-length v1, p2

    if-ne v0, v1, :cond_0

    array-length v0, p1

    if-lez v0, :cond_0

    array-length v0, p1

    const/16 v1, 0x1388

    if-gt v0, v1, :cond_0

    .line 275
    aget v0, p1, v3

    aget v1, p2, v3

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/imagelib/freecrop/c;->moveTo(FF)V

    .line 276
    :cond_0
    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    array-length v0, p1

    array-length v1, p2

    if-ne v0, v1, :cond_1

    .line 277
    const/4 v0, 0x1

    .line 279
    :goto_0
    array-length v1, p1

    if-lt v0, v1, :cond_2

    .line 282
    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/c;->close()V

    .line 288
    :cond_1
    return-void

    .line 285
    :cond_2
    aget v1, p1, v0

    aget v2, p2, v0

    invoke-virtual {p0, v1, v2, v3}, Lcom/roidapp/imagelib/freecrop/c;->a(FFZ)V

    .line 277
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public final a(FF)Z
    .locals 8

    .prologue
    const/4 v0, 0x0

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    .line 264
    iget v1, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    if-nez v1, :cond_1

    .line 269
    :cond_0
    :goto_0
    return v0

    .line 266
    :cond_1
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/c;->c:[F

    iget v2, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    add-int/lit8 v2, v2, -0x1

    aget v1, v1, v2

    sub-float v1, p1, v1

    float-to-double v2, v1

    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/c;->d:[F

    iget v4, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    add-int/lit8 v4, v4, -0x1

    aget v1, v1, v4

    sub-float v1, p2, v1

    float-to-double v4, v1

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v4

    add-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    iget v1, p0, Lcom/roidapp/imagelib/freecrop/c;->b:F

    float-to-double v4, v1

    mul-double/2addr v2, v4

    const-wide/high16 v4, 0x4049000000000000L    # 50.0

    cmpg-double v1, v2, v4

    if-gez v1, :cond_0

    .line 267
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final b()Landroid/graphics/RectF;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->e:Landroid/graphics/RectF;

    return-object v0
.end method

.method public final c()F
    .locals 5

    .prologue
    .line 143
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    const/4 v1, 0x2

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->c:[F

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->d:[F

    if-eqz v0, :cond_0

    .line 144
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->c:[F

    iget v1, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/c;->c:[F

    iget v2, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    add-int/lit8 v2, v2, -0x2

    aget v1, v1, v2

    sub-float/2addr v0, v1

    float-to-double v0, v0

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/c;->d:[F

    iget v3, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    add-int/lit8 v3, v3, -0x1

    aget v2, v2, v3

    neg-float v2, v2

    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/c;->d:[F

    iget v4, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    add-int/lit8 v4, v4, -0x2

    aget v3, v3, v4

    add-float/2addr v2, v3

    float-to-double v2, v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v0

    double-to-float v0, v0

    .line 147
    :goto_0
    return v0

    .line 146
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final d()[F
    .locals 4

    .prologue
    .line 153
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->c:[F

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->d:[F

    if-eqz v0, :cond_0

    .line 155
    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 156
    const/4 v1, 0x0

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/c;->c:[F

    iget v3, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    add-int/lit8 v3, v3, -0x1

    aget v2, v2, v3

    aput v2, v0, v1

    .line 157
    const/4 v1, 0x1

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/c;->d:[F

    iget v3, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    add-int/lit8 v3, v3, -0x1

    aget v2, v2, v3

    aput v2, v0, v1

    .line 163
    :goto_0
    return-object v0

    .line 161
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e()[F
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 169
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->c:[F

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->d:[F

    if-eqz v0, :cond_0

    .line 171
    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 172
    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/c;->c:[F

    aget v1, v1, v3

    aput v1, v0, v3

    .line 173
    const/4 v1, 0x1

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/c;->d:[F

    aget v2, v2, v3

    aput v2, v0, v1

    .line 179
    :goto_0
    return-object v0

    .line 177
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final f()[F
    .locals 3

    .prologue
    .line 194
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    new-array v1, v0, [F

    .line 195
    const/4 v0, 0x0

    .line 197
    :goto_0
    iget v2, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    if-lt v0, v2, :cond_0

    .line 198
    return-object v1

    .line 199
    :cond_0
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/c;->c:[F

    aget v2, v2, v0

    aput v2, v1, v0

    .line 195
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public final g()[F
    .locals 3

    .prologue
    .line 205
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    new-array v1, v0, [F

    .line 206
    const/4 v0, 0x0

    .line 208
    :goto_0
    iget v2, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    if-lt v0, v2, :cond_0

    .line 209
    return-object v1

    .line 210
    :cond_0
    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/c;->d:[F

    aget v2, v2, v0

    aput v2, v1, v0

    .line 206
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public final h()V
    .locals 3

    .prologue
    .line 226
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    if-eqz v0, :cond_0

    .line 227
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->c:[F

    iget v1, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    iget v1, p0, Lcom/roidapp/imagelib/freecrop/c;->b:F

    mul-float/2addr v0, v1

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/c;->d:[F

    iget v2, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    add-int/lit8 v2, v2, -0x1

    aget v1, v1, v2

    iget v2, p0, Lcom/roidapp/imagelib/freecrop/c;->b:F

    mul-float/2addr v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/imagelib/freecrop/c;->lineTo(FF)V

    .line 228
    :cond_0
    return-void
.end method

.method public final i()I
    .locals 1

    .prologue
    .line 292
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    return v0
.end method

.method public final moveTo(FF)V
    .locals 2

    .prologue
    .line 216
    invoke-virtual {p0}, Lcom/roidapp/imagelib/freecrop/c;->reset()V

    .line 217
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/c;->b:F

    mul-float/2addr v0, p1

    iget v1, p0, Lcom/roidapp/imagelib/freecrop/c;->b:F

    mul-float/2addr v1, p2

    invoke-super {p0, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 218
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    .line 219
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->c:[F

    iget v1, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    aput p1, v0, v1

    .line 220
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->d:[F

    iget v1, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    aput p2, v0, v1

    .line 221
    iget v0, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    .line 222
    return-void
.end method

.method public final reset()V
    .locals 5

    .prologue
    .line 232
    invoke-super {p0}, Landroid/graphics/Path;->reset()V

    .line 233
    iget-object v0, p0, Lcom/roidapp/imagelib/freecrop/c;->e:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/roidapp/imagelib/freecrop/c;->e:Landroid/graphics/RectF;

    iget-object v2, p0, Lcom/roidapp/imagelib/freecrop/c;->e:Landroid/graphics/RectF;

    iget-object v3, p0, Lcom/roidapp/imagelib/freecrop/c;->e:Landroid/graphics/RectF;

    const/high16 v4, -0x40800000    # -1.0f

    iput v4, v3, Landroid/graphics/RectF;->bottom:F

    iput v4, v2, Landroid/graphics/RectF;->top:F

    iput v4, v1, Landroid/graphics/RectF;->right:F

    iput v4, v0, Landroid/graphics/RectF;->left:F

    .line 234
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/imagelib/freecrop/c;->a:I

    .line 235
    return-void
.end method
