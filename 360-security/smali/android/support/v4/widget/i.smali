.class final Landroid/support/v4/widget/i;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static final a:Landroid/view/animation/Interpolator;


# instance fields
.field private final b:Landroid/graphics/Paint;

.field private final c:Landroid/graphics/RectF;

.field private d:F

.field private e:J

.field private f:J

.field private g:Z

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:Landroid/view/View;

.field private m:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 51
    invoke-static {}, Landroid/support/v4/widget/a;->a()Landroid/support/v4/widget/a;

    move-result-object v0

    sput-object v0, Landroid/support/v4/widget/i;->a:Landroid/view/animation/Interpolator;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Landroid/support/v4/widget/i;->b:Landroid/graphics/Paint;

    .line 54
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Landroid/support/v4/widget/i;->c:Landroid/graphics/RectF;

    .line 67
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroid/support/v4/widget/i;->m:Landroid/graphics/Rect;

    .line 70
    iput-object p1, p0, Landroid/support/v4/widget/i;->l:Landroid/view/View;

    .line 71
    const/high16 v0, -0x4d000000

    iput v0, p0, Landroid/support/v4/widget/i;->h:I

    .line 72
    const/high16 v0, -0x80000000

    iput v0, p0, Landroid/support/v4/widget/i;->i:I

    .line 73
    const/high16 v0, 0x4d000000    # 1.34217728E8f

    iput v0, p0, Landroid/support/v4/widget/i;->j:I

    .line 74
    const/high16 v0, 0x1a000000

    iput v0, p0, Landroid/support/v4/widget/i;->k:I

    .line 75
    return-void
.end method

.method private a(Landroid/graphics/Canvas;FFIF)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 255
    iget-object v0, p0, Landroid/support/v4/widget/i;->b:Landroid/graphics/Paint;

    invoke-virtual {v0, p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 256
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 257
    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 258
    sget-object v0, Landroid/support/v4/widget/i;->a:Landroid/view/animation/Interpolator;

    invoke-interface {v0, p5}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v0

    .line 259
    invoke-virtual {p1, v0, v0}, Landroid/graphics/Canvas;->scale(FF)V

    .line 260
    iget-object v0, p0, Landroid/support/v4/widget/i;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v1, p2, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 261
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 262
    return-void
.end method

.method private a(Landroid/graphics/Canvas;II)V
    .locals 4

    .prologue
    .line 241
    iget-object v0, p0, Landroid/support/v4/widget/i;->b:Landroid/graphics/Paint;

    iget v1, p0, Landroid/support/v4/widget/i;->h:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 242
    int-to-float v0, p2

    int-to-float v1, p3

    int-to-float v2, p2

    iget v3, p0, Landroid/support/v4/widget/i;->d:F

    mul-float/2addr v2, v3

    iget-object v3, p0, Landroid/support/v4/widget/i;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 243
    return-void
.end method


# virtual methods
.method a()V
    .locals 2

    .prologue
    .line 109
    iget-boolean v0, p0, Landroid/support/v4/widget/i;->g:Z

    if-nez v0, :cond_0

    .line 110
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v4/widget/i;->d:F

    .line 111
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Landroid/support/v4/widget/i;->e:J

    .line 112
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/widget/i;->g:Z

    .line 113
    iget-object v0, p0, Landroid/support/v4/widget/i;->l:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    .line 115
    :cond_0
    return-void
.end method

.method a(F)V
    .locals 2

    .prologue
    .line 100
    iput p1, p0, Landroid/support/v4/widget/i;->d:F

    .line 101
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Landroid/support/v4/widget/i;->e:J

    .line 102
    iget-object v0, p0, Landroid/support/v4/widget/i;->l:Landroid/view/View;

    invoke-static {v0}, Landroid/support/v4/view/s;->b(Landroid/view/View;)V

    .line 103
    return-void
.end method

.method a(IIII)V
    .locals 1

    .prologue
    .line 268
    iget-object v0, p0, Landroid/support/v4/widget/i;->m:Landroid/graphics/Rect;

    iput p1, v0, Landroid/graphics/Rect;->left:I

    .line 269
    iget-object v0, p0, Landroid/support/v4/widget/i;->m:Landroid/graphics/Rect;

    iput p2, v0, Landroid/graphics/Rect;->top:I

    .line 270
    iget-object v0, p0, Landroid/support/v4/widget/i;->m:Landroid/graphics/Rect;

    iput p3, v0, Landroid/graphics/Rect;->right:I

    .line 271
    iget-object v0, p0, Landroid/support/v4/widget/i;->m:Landroid/graphics/Rect;

    iput p4, v0, Landroid/graphics/Rect;->bottom:I

    .line 272
    return-void
.end method

.method a(Landroid/graphics/Canvas;)V
    .locals 20

    .prologue
    .line 137
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v4/widget/i;->m:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v3

    .line 138
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v4/widget/i;->m:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v4

    .line 139
    div-int/lit8 v10, v3, 0x2

    .line 140
    div-int/lit8 v11, v4, 0x2

    .line 141
    const/4 v2, 0x0

    .line 142
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    move-result v8

    .line 143
    move-object/from16 v0, p0

    iget-object v5, v0, Landroid/support/v4/widget/i;->m:Landroid/graphics/Rect;

    move-object/from16 v0, p1

    invoke-virtual {v0, v5}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;)Z

    .line 145
    move-object/from16 v0, p0

    iget-boolean v5, v0, Landroid/support/v4/widget/i;->g:Z

    if-nez v5, :cond_0

    move-object/from16 v0, p0

    iget-wide v6, v0, Landroid/support/v4/widget/i;->f:J

    const-wide/16 v12, 0x0

    cmp-long v5, v6, v12

    if-lez v5, :cond_c

    .line 146
    :cond_0
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v6

    .line 147
    move-object/from16 v0, p0

    iget-wide v12, v0, Landroid/support/v4/widget/i;->e:J

    sub-long v12, v6, v12

    const-wide/16 v14, 0x7d0

    rem-long/2addr v12, v14

    .line 148
    move-object/from16 v0, p0

    iget-wide v14, v0, Landroid/support/v4/widget/i;->e:J

    sub-long v14, v6, v14

    const-wide/16 v16, 0x7d0

    div-long v14, v14, v16

    .line 149
    long-to-float v5, v12

    const/high16 v9, 0x41a00000    # 20.0f

    div-float v12, v5, v9

    .line 153
    move-object/from16 v0, p0

    iget-boolean v5, v0, Landroid/support/v4/widget/i;->g:Z

    if-nez v5, :cond_e

    .line 156
    move-object/from16 v0, p0

    iget-wide v0, v0, Landroid/support/v4/widget/i;->f:J

    move-wide/from16 v16, v0

    sub-long v16, v6, v16

    const-wide/16 v18, 0x3e8

    cmp-long v2, v16, v18

    if-ltz v2, :cond_1

    .line 157
    const-wide/16 v2, 0x0

    move-object/from16 v0, p0

    iput-wide v2, v0, Landroid/support/v4/widget/i;->f:J

    .line 238
    :goto_0
    return-void

    .line 164
    :cond_1
    move-object/from16 v0, p0

    iget-wide v0, v0, Landroid/support/v4/widget/i;->f:J

    move-wide/from16 v16, v0

    sub-long v6, v6, v16

    const-wide/16 v16, 0x3e8

    rem-long v6, v6, v16

    .line 165
    long-to-float v2, v6

    const/high16 v5, 0x41200000    # 10.0f

    div-float/2addr v2, v5

    .line 166
    const/high16 v5, 0x42c80000    # 100.0f

    div-float/2addr v2, v5

    .line 168
    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    sget-object v5, Landroid/support/v4/widget/i;->a:Landroid/view/animation/Interpolator;

    invoke-interface {v5, v2}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v2

    mul-float/2addr v2, v3

    .line 169
    move-object/from16 v0, p0

    iget-object v3, v0, Landroid/support/v4/widget/i;->c:Landroid/graphics/RectF;

    int-to-float v5, v10

    sub-float/2addr v5, v2

    const/4 v6, 0x0

    int-to-float v7, v10

    add-float/2addr v2, v7

    int-to-float v4, v4

    invoke-virtual {v3, v5, v6, v2, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 170
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v4/widget/i;->c:Landroid/graphics/RectF;

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v0, p1

    invoke-virtual {v0, v2, v3, v4}, Landroid/graphics/Canvas;->saveLayerAlpha(Landroid/graphics/RectF;II)I

    .line 175
    const/4 v2, 0x1

    move v9, v2

    .line 179
    :goto_1
    const-wide/16 v2, 0x0

    cmp-long v2, v14, v2

    if-nez v2, :cond_8

    .line 180
    move-object/from16 v0, p0

    iget v2, v0, Landroid/support/v4/widget/i;->h:I

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 199
    :goto_2
    const/4 v2, 0x0

    cmpl-float v2, v12, v2

    if-ltz v2, :cond_2

    const/high16 v2, 0x41c80000    # 25.0f

    cmpg-float v2, v12, v2

    if-gtz v2, :cond_2

    .line 200
    const/high16 v2, 0x41c80000    # 25.0f

    add-float/2addr v2, v12

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v2, v3

    const/high16 v3, 0x42c80000    # 100.0f

    div-float v7, v2, v3

    .line 201
    int-to-float v4, v10

    int-to-float v5, v11

    move-object/from16 v0, p0

    iget v6, v0, Landroid/support/v4/widget/i;->h:I

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    invoke-direct/range {v2 .. v7}, Landroid/support/v4/widget/i;->a(Landroid/graphics/Canvas;FFIF)V

    .line 203
    :cond_2
    const/4 v2, 0x0

    cmpl-float v2, v12, v2

    if-ltz v2, :cond_3

    const/high16 v2, 0x42480000    # 50.0f

    cmpg-float v2, v12, v2

    if-gtz v2, :cond_3

    .line 204
    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v2, v12

    const/high16 v3, 0x42c80000    # 100.0f

    div-float v7, v2, v3

    .line 205
    int-to-float v4, v10

    int-to-float v5, v11

    move-object/from16 v0, p0

    iget v6, v0, Landroid/support/v4/widget/i;->i:I

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    invoke-direct/range {v2 .. v7}, Landroid/support/v4/widget/i;->a(Landroid/graphics/Canvas;FFIF)V

    .line 207
    :cond_3
    const/high16 v2, 0x41c80000    # 25.0f

    cmpl-float v2, v12, v2

    if-ltz v2, :cond_4

    const/high16 v2, 0x42960000    # 75.0f

    cmpg-float v2, v12, v2

    if-gtz v2, :cond_4

    .line 208
    const/high16 v2, 0x41c80000    # 25.0f

    sub-float v2, v12, v2

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v2, v3

    const/high16 v3, 0x42c80000    # 100.0f

    div-float v7, v2, v3

    .line 209
    int-to-float v4, v10

    int-to-float v5, v11

    move-object/from16 v0, p0

    iget v6, v0, Landroid/support/v4/widget/i;->j:I

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    invoke-direct/range {v2 .. v7}, Landroid/support/v4/widget/i;->a(Landroid/graphics/Canvas;FFIF)V

    .line 211
    :cond_4
    const/high16 v2, 0x42480000    # 50.0f

    cmpl-float v2, v12, v2

    if-ltz v2, :cond_5

    const/high16 v2, 0x42c80000    # 100.0f

    cmpg-float v2, v12, v2

    if-gtz v2, :cond_5

    .line 212
    const/high16 v2, 0x42480000    # 50.0f

    sub-float v2, v12, v2

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v2, v3

    const/high16 v3, 0x42c80000    # 100.0f

    div-float v7, v2, v3

    .line 213
    int-to-float v4, v10

    int-to-float v5, v11

    move-object/from16 v0, p0

    iget v6, v0, Landroid/support/v4/widget/i;->k:I

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    invoke-direct/range {v2 .. v7}, Landroid/support/v4/widget/i;->a(Landroid/graphics/Canvas;FFIF)V

    .line 215
    :cond_5
    const/high16 v2, 0x42960000    # 75.0f

    cmpl-float v2, v12, v2

    if-ltz v2, :cond_6

    const/high16 v2, 0x42c80000    # 100.0f

    cmpg-float v2, v12, v2

    if-gtz v2, :cond_6

    .line 216
    const/high16 v2, 0x42960000    # 75.0f

    sub-float v2, v12, v2

    const/high16 v3, 0x40000000    # 2.0f

    mul-float/2addr v2, v3

    const/high16 v3, 0x42c80000    # 100.0f

    div-float v7, v2, v3

    .line 217
    int-to-float v4, v10

    int-to-float v5, v11

    move-object/from16 v0, p0

    iget v6, v0, Landroid/support/v4/widget/i;->h:I

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    invoke-direct/range {v2 .. v7}, Landroid/support/v4/widget/i;->a(Landroid/graphics/Canvas;FFIF)V

    .line 219
    :cond_6
    move-object/from16 v0, p0

    iget v2, v0, Landroid/support/v4/widget/i;->d:F

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-lez v2, :cond_d

    if-eqz v9, :cond_d

    .line 224
    move-object/from16 v0, p1

    invoke-virtual {v0, v8}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 225
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    .line 226
    move-object/from16 v0, p0

    iget-object v3, v0, Landroid/support/v4/widget/i;->m:Landroid/graphics/Rect;

    move-object/from16 v0, p1

    invoke-virtual {v0, v3}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;)Z

    .line 227
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v10, v11}, Landroid/support/v4/widget/i;->a(Landroid/graphics/Canvas;II)V

    .line 230
    :goto_3
    move-object/from16 v0, p0

    iget-object v3, v0, Landroid/support/v4/widget/i;->l:Landroid/view/View;

    invoke-static {v3}, Landroid/support/v4/view/s;->b(Landroid/view/View;)V

    move v8, v2

    .line 237
    :cond_7
    :goto_4
    move-object/from16 v0, p1

    invoke-virtual {v0, v8}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto/16 :goto_0

    .line 182
    :cond_8
    const/4 v2, 0x0

    cmpl-float v2, v12, v2

    if-ltz v2, :cond_9

    const/high16 v2, 0x41c80000    # 25.0f

    cmpg-float v2, v12, v2

    if-gez v2, :cond_9

    .line 183
    move-object/from16 v0, p0

    iget v2, v0, Landroid/support/v4/widget/i;->k:I

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Landroid/graphics/Canvas;->drawColor(I)V

    goto/16 :goto_2

    .line 184
    :cond_9
    const/high16 v2, 0x41c80000    # 25.0f

    cmpl-float v2, v12, v2

    if-ltz v2, :cond_a

    const/high16 v2, 0x42480000    # 50.0f

    cmpg-float v2, v12, v2

    if-gez v2, :cond_a

    .line 185
    move-object/from16 v0, p0

    iget v2, v0, Landroid/support/v4/widget/i;->h:I

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Landroid/graphics/Canvas;->drawColor(I)V

    goto/16 :goto_2

    .line 186
    :cond_a
    const/high16 v2, 0x42480000    # 50.0f

    cmpl-float v2, v12, v2

    if-ltz v2, :cond_b

    const/high16 v2, 0x42960000    # 75.0f

    cmpg-float v2, v12, v2

    if-gez v2, :cond_b

    .line 187
    move-object/from16 v0, p0

    iget v2, v0, Landroid/support/v4/widget/i;->i:I

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Landroid/graphics/Canvas;->drawColor(I)V

    goto/16 :goto_2

    .line 189
    :cond_b
    move-object/from16 v0, p0

    iget v2, v0, Landroid/support/v4/widget/i;->j:I

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Landroid/graphics/Canvas;->drawColor(I)V

    goto/16 :goto_2

    .line 233
    :cond_c
    move-object/from16 v0, p0

    iget v2, v0, Landroid/support/v4/widget/i;->d:F

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-lez v2, :cond_7

    move-object/from16 v0, p0

    iget v2, v0, Landroid/support/v4/widget/i;->d:F

    float-to-double v2, v2

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    cmpg-double v2, v2, v4

    if-gtz v2, :cond_7

    .line 234
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v10, v11}, Landroid/support/v4/widget/i;->a(Landroid/graphics/Canvas;II)V

    goto :goto_4

    :cond_d
    move v2, v8

    goto :goto_3

    :cond_e
    move v9, v2

    goto/16 :goto_1
.end method

.method b()V
    .locals 2

    .prologue
    .line 121
    iget-boolean v0, p0, Landroid/support/v4/widget/i;->g:Z

    if-eqz v0, :cond_0

    .line 122
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v4/widget/i;->d:F

    .line 123
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Landroid/support/v4/widget/i;->f:J

    .line 124
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/widget/i;->g:Z

    .line 125
    iget-object v0, p0, Landroid/support/v4/widget/i;->l:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    .line 127
    :cond_0
    return-void
.end method
