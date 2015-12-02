.class public Lcom/qihoo/security/widget/shadow/d;
.super Landroid/view/View;
.source "360Security"


# instance fields
.field protected a:Lcom/qihoo/security/widget/shadow/a;

.field protected b:Lcom/qihoo/security/widget/shadow/e;

.field protected c:I

.field protected d:I

.field protected e:I

.field protected f:I

.field protected g:J

.field protected h:Z


# direct methods
.method protected constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 34
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/widget/shadow/d;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 35
    invoke-virtual {p0}, Lcom/qihoo/security/widget/shadow/d;->a()V

    .line 36
    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 39
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/qihoo/security/widget/shadow/d;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 40
    invoke-virtual {p0}, Lcom/qihoo/security/widget/shadow/d;->a()V

    .line 41
    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 45
    invoke-virtual {p0}, Lcom/qihoo/security/widget/shadow/d;->a()V

    .line 46
    return-void
.end method

.method private a(I)Lcom/qihoo/security/widget/shadow/ZDepth;
    .locals 2

    .prologue
    .line 138
    packed-switch p1, :pswitch_data_0

    .line 152
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v1, "unknown zDepth value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 140
    :pswitch_0
    sget-object v0, Lcom/qihoo/security/widget/shadow/ZDepth;->Depth0:Lcom/qihoo/security/widget/shadow/ZDepth;

    .line 150
    :goto_0
    return-object v0

    .line 142
    :pswitch_1
    sget-object v0, Lcom/qihoo/security/widget/shadow/ZDepth;->Depth1:Lcom/qihoo/security/widget/shadow/ZDepth;

    goto :goto_0

    .line 144
    :pswitch_2
    sget-object v0, Lcom/qihoo/security/widget/shadow/ZDepth;->Depth2:Lcom/qihoo/security/widget/shadow/ZDepth;

    goto :goto_0

    .line 146
    :pswitch_3
    sget-object v0, Lcom/qihoo/security/widget/shadow/ZDepth;->Depth3:Lcom/qihoo/security/widget/shadow/ZDepth;

    goto :goto_0

    .line 148
    :pswitch_4
    sget-object v0, Lcom/qihoo/security/widget/shadow/ZDepth;->Depth4:Lcom/qihoo/security/widget/shadow/ZDepth;

    goto :goto_0

    .line 150
    :pswitch_5
    sget-object v0, Lcom/qihoo/security/widget/shadow/ZDepth;->Depth5:Lcom/qihoo/security/widget/shadow/ZDepth;

    goto :goto_0

    .line 138
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method


# virtual methods
.method protected a(Lcom/qihoo/security/widget/shadow/ZDepth;)I
    .locals 4

    .prologue
    .line 85
    invoke-virtual {p0}, Lcom/qihoo/security/widget/shadow/d;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/qihoo/security/widget/shadow/ZDepth;->getBlurTopShadowPx(Landroid/content/Context;)F

    move-result v0

    .line 86
    invoke-virtual {p0}, Lcom/qihoo/security/widget/shadow/d;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/qihoo/security/widget/shadow/ZDepth;->getOffsetYTopShadowPx(Landroid/content/Context;)F

    move-result v1

    .line 87
    invoke-virtual {p0}, Lcom/qihoo/security/widget/shadow/d;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/qihoo/security/widget/shadow/ZDepth;->getBlurBottomShadowPx(Landroid/content/Context;)F

    move-result v2

    .line 88
    invoke-virtual {p0}, Lcom/qihoo/security/widget/shadow/d;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/qihoo/security/widget/shadow/ZDepth;->getOffsetYBottomShadowPx(Landroid/content/Context;)F

    move-result v3

    .line 90
    add-float/2addr v0, v1

    .line 91
    add-float v1, v2, v3

    .line 93
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    float-to-int v0, v0

    return v0
.end method

.method protected a()V
    .locals 2

    .prologue
    .line 50
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/shadow/d;->setWillNotDraw(Z)V

    .line 51
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 52
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/widget/shadow/d;->setLayerType(ILandroid/graphics/Paint;)V

    .line 54
    :cond_0
    return-void
.end method

.method protected b(Lcom/qihoo/security/widget/shadow/ZDepth;)V
    .locals 17

    .prologue
    .line 207
    invoke-virtual/range {p1 .. p1}, Lcom/qihoo/security/widget/shadow/ZDepth;->getAlphaTopShadow()I

    move-result v2

    .line 208
    invoke-virtual/range {p1 .. p1}, Lcom/qihoo/security/widget/shadow/ZDepth;->getAlphaBottomShadow()I

    move-result v3

    .line 209
    invoke-virtual/range {p0 .. p0}, Lcom/qihoo/security/widget/shadow/d;->getContext()Landroid/content/Context;

    move-result-object v4

    move-object/from16 v0, p1

    invoke-virtual {v0, v4}, Lcom/qihoo/security/widget/shadow/ZDepth;->getOffsetYTopShadowPx(Landroid/content/Context;)F

    move-result v4

    .line 210
    invoke-virtual/range {p0 .. p0}, Lcom/qihoo/security/widget/shadow/d;->getContext()Landroid/content/Context;

    move-result-object v5

    move-object/from16 v0, p1

    invoke-virtual {v0, v5}, Lcom/qihoo/security/widget/shadow/ZDepth;->getOffsetYBottomShadowPx(Landroid/content/Context;)F

    move-result v5

    .line 211
    invoke-virtual/range {p0 .. p0}, Lcom/qihoo/security/widget/shadow/d;->getContext()Landroid/content/Context;

    move-result-object v6

    move-object/from16 v0, p1

    invoke-virtual {v0, v6}, Lcom/qihoo/security/widget/shadow/ZDepth;->getBlurTopShadowPx(Landroid/content/Context;)F

    move-result v6

    .line 212
    invoke-virtual/range {p0 .. p0}, Lcom/qihoo/security/widget/shadow/d;->getContext()Landroid/content/Context;

    move-result-object v7

    move-object/from16 v0, p1

    invoke-virtual {v0, v7}, Lcom/qihoo/security/widget/shadow/ZDepth;->getBlurBottomShadowPx(Landroid/content/Context;)F

    move-result v7

    .line 214
    move-object/from16 v0, p0

    iget-boolean v8, v0, Lcom/qihoo/security/widget/shadow/d;->h:Z

    if-nez v8, :cond_0

    .line 215
    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/qihoo/security/widget/shadow/d;->b:Lcom/qihoo/security/widget/shadow/e;

    iput v2, v8, Lcom/qihoo/security/widget/shadow/e;->a:I

    .line 216
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/widget/shadow/d;->b:Lcom/qihoo/security/widget/shadow/e;

    iput v3, v2, Lcom/qihoo/security/widget/shadow/e;->b:I

    .line 217
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/widget/shadow/d;->b:Lcom/qihoo/security/widget/shadow/e;

    iput v4, v2, Lcom/qihoo/security/widget/shadow/e;->c:F

    .line 218
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/widget/shadow/d;->b:Lcom/qihoo/security/widget/shadow/e;

    iput v5, v2, Lcom/qihoo/security/widget/shadow/e;->d:F

    .line 219
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/widget/shadow/d;->b:Lcom/qihoo/security/widget/shadow/e;

    iput v6, v2, Lcom/qihoo/security/widget/shadow/e;->e:F

    .line 220
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/widget/shadow/d;->b:Lcom/qihoo/security/widget/shadow/e;

    iput v7, v2, Lcom/qihoo/security/widget/shadow/e;->f:F

    .line 222
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/widget/shadow/d;->a:Lcom/qihoo/security/widget/shadow/a;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/qihoo/security/widget/shadow/d;->b:Lcom/qihoo/security/widget/shadow/e;

    move-object/from16 v0, p0

    iget v4, v0, Lcom/qihoo/security/widget/shadow/d;->c:I

    move-object/from16 v0, p0

    iget v5, v0, Lcom/qihoo/security/widget/shadow/d;->d:I

    invoke-virtual/range {p0 .. p0}, Lcom/qihoo/security/widget/shadow/d;->getWidth()I

    move-result v6

    move-object/from16 v0, p0

    iget v7, v0, Lcom/qihoo/security/widget/shadow/d;->e:I

    sub-int/2addr v6, v7

    invoke-virtual/range {p0 .. p0}, Lcom/qihoo/security/widget/shadow/d;->getHeight()I

    move-result v7

    move-object/from16 v0, p0

    iget v8, v0, Lcom/qihoo/security/widget/shadow/d;->f:I

    sub-int/2addr v7, v8

    invoke-interface/range {v2 .. v7}, Lcom/qihoo/security/widget/shadow/a;->a(Lcom/qihoo/security/widget/shadow/e;IIII)V

    .line 224
    invoke-virtual/range {p0 .. p0}, Lcom/qihoo/security/widget/shadow/d;->invalidate()V

    .line 276
    :goto_0
    return-void

    .line 228
    :cond_0
    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/qihoo/security/widget/shadow/d;->b:Lcom/qihoo/security/widget/shadow/e;

    iget v8, v8, Lcom/qihoo/security/widget/shadow/e;->a:I

    .line 229
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/qihoo/security/widget/shadow/d;->b:Lcom/qihoo/security/widget/shadow/e;

    iget v9, v9, Lcom/qihoo/security/widget/shadow/e;->b:I

    .line 230
    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/qihoo/security/widget/shadow/d;->b:Lcom/qihoo/security/widget/shadow/e;

    iget v10, v10, Lcom/qihoo/security/widget/shadow/e;->c:F

    .line 231
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/qihoo/security/widget/shadow/d;->b:Lcom/qihoo/security/widget/shadow/e;

    iget v11, v11, Lcom/qihoo/security/widget/shadow/e;->d:F

    .line 232
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/qihoo/security/widget/shadow/d;->b:Lcom/qihoo/security/widget/shadow/e;

    iget v12, v12, Lcom/qihoo/security/widget/shadow/e;->e:F

    .line 233
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/qihoo/security/widget/shadow/d;->b:Lcom/qihoo/security/widget/shadow/e;

    iget v13, v13, Lcom/qihoo/security/widget/shadow/e;->f:F

    .line 235
    const-string/jumbo v14, "alphaTopShadow"

    const/4 v15, 0x2

    new-array v15, v15, [I

    const/16 v16, 0x0

    aput v8, v15, v16

    const/4 v8, 0x1

    aput v2, v15, v8

    invoke-static {v14, v15}, Lcom/nineoldandroids/a/m;->a(Ljava/lang/String;[I)Lcom/nineoldandroids/a/m;

    move-result-object v2

    .line 237
    const-string/jumbo v8, "alphaBottomShadow"

    const/4 v14, 0x2

    new-array v14, v14, [I

    const/4 v15, 0x0

    aput v9, v14, v15

    const/4 v9, 0x1

    aput v3, v14, v9

    invoke-static {v8, v14}, Lcom/nineoldandroids/a/m;->a(Ljava/lang/String;[I)Lcom/nineoldandroids/a/m;

    move-result-object v3

    .line 239
    const-string/jumbo v8, "offsetTopShadow"

    const/4 v9, 0x2

    new-array v9, v9, [F

    const/4 v14, 0x0

    aput v10, v9, v14

    const/4 v10, 0x1

    aput v4, v9, v10

    invoke-static {v8, v9}, Lcom/nineoldandroids/a/m;->a(Ljava/lang/String;[F)Lcom/nineoldandroids/a/m;

    move-result-object v4

    .line 241
    const-string/jumbo v8, "offsetBottomShadow"

    const/4 v9, 0x2

    new-array v9, v9, [F

    const/4 v10, 0x0

    aput v11, v9, v10

    const/4 v10, 0x1

    aput v5, v9, v10

    invoke-static {v8, v9}, Lcom/nineoldandroids/a/m;->a(Ljava/lang/String;[F)Lcom/nineoldandroids/a/m;

    move-result-object v5

    .line 243
    const-string/jumbo v8, "blurTopShadow"

    const/4 v9, 0x2

    new-array v9, v9, [F

    const/4 v10, 0x0

    aput v12, v9, v10

    const/4 v10, 0x1

    aput v6, v9, v10

    invoke-static {v8, v9}, Lcom/nineoldandroids/a/m;->a(Ljava/lang/String;[F)Lcom/nineoldandroids/a/m;

    move-result-object v6

    .line 245
    const-string/jumbo v8, "blurBottomShadow"

    const/4 v9, 0x2

    new-array v9, v9, [F

    const/4 v10, 0x0

    aput v13, v9, v10

    const/4 v10, 0x1

    aput v7, v9, v10

    invoke-static {v8, v9}, Lcom/nineoldandroids/a/m;->a(Ljava/lang/String;[F)Lcom/nineoldandroids/a/m;

    move-result-object v7

    .line 248
    const/4 v8, 0x6

    new-array v8, v8, [Lcom/nineoldandroids/a/m;

    const/4 v9, 0x0

    aput-object v2, v8, v9

    const/4 v2, 0x1

    aput-object v3, v8, v2

    const/4 v2, 0x2

    aput-object v4, v8, v2

    const/4 v2, 0x3

    aput-object v5, v8, v2

    const/4 v2, 0x4

    aput-object v6, v8, v2

    const/4 v2, 0x5

    aput-object v7, v8, v2

    invoke-static {v8}, Lcom/nineoldandroids/a/o;->a([Lcom/nineoldandroids/a/m;)Lcom/nineoldandroids/a/o;

    move-result-object v2

    .line 250
    move-object/from16 v0, p0

    iget-wide v4, v0, Lcom/qihoo/security/widget/shadow/d;->g:J

    invoke-virtual {v2, v4, v5}, Lcom/nineoldandroids/a/o;->d(J)Lcom/nineoldandroids/a/o;

    .line 251
    new-instance v3, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v3}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v2, v3}, Lcom/nineoldandroids/a/o;->a(Landroid/view/animation/Interpolator;)V

    .line 252
    new-instance v3, Lcom/qihoo/security/widget/shadow/d$1;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lcom/qihoo/security/widget/shadow/d$1;-><init>(Lcom/qihoo/security/widget/shadow/d;)V

    invoke-virtual {v2, v3}, Lcom/nineoldandroids/a/o;->a(Lcom/nineoldandroids/a/o$b;)V

    .line 275
    invoke-virtual {v2}, Lcom/nineoldandroids/a/o;->a()V

    goto/16 :goto_0
.end method

.method protected getZDepthPaddingBottom()I
    .locals 1

    .prologue
    .line 109
    iget v0, p0, Lcom/qihoo/security/widget/shadow/d;->f:I

    return v0
.end method

.method protected getZDepthPaddingLeft()I
    .locals 1

    .prologue
    .line 97
    iget v0, p0, Lcom/qihoo/security/widget/shadow/d;->c:I

    return v0
.end method

.method protected getZDepthPaddingRight()I
    .locals 1

    .prologue
    .line 105
    iget v0, p0, Lcom/qihoo/security/widget/shadow/d;->e:I

    return v0
.end method

.method protected getZDepthPaddingTop()I
    .locals 1

    .prologue
    .line 101
    iget v0, p0, Lcom/qihoo/security/widget/shadow/d;->d:I

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .prologue
    .line 201
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 202
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/d;->a:Lcom/qihoo/security/widget/shadow/a;

    invoke-interface {v0, p1}, Lcom/qihoo/security/widget/shadow/a;->a(Landroid/graphics/Canvas;)V

    .line 203
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 7

    .prologue
    .line 191
    sub-int v4, p4, p2

    .line 192
    sub-int v5, p5, p3

    .line 194
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/d;->a:Lcom/qihoo/security/widget/shadow/a;

    iget-object v1, p0, Lcom/qihoo/security/widget/shadow/d;->b:Lcom/qihoo/security/widget/shadow/e;

    iget v2, p0, Lcom/qihoo/security/widget/shadow/d;->c:I

    iget v3, p0, Lcom/qihoo/security/widget/shadow/d;->d:I

    iget v6, p0, Lcom/qihoo/security/widget/shadow/d;->e:I

    sub-int/2addr v4, v6

    iget v6, p0, Lcom/qihoo/security/widget/shadow/d;->f:I

    sub-int/2addr v5, v6

    invoke-interface/range {v0 .. v5}, Lcom/qihoo/security/widget/shadow/a;->a(Lcom/qihoo/security/widget/shadow/e;IIII)V

    .line 196
    return-void
.end method

.method protected onMeasure(II)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 158
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    .line 159
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 161
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    .line 162
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v4

    .line 164
    sparse-switch v3, :sswitch_data_0

    .line 175
    :goto_0
    :sswitch_0
    sparse-switch v4, :sswitch_data_1

    .line 186
    :goto_1
    :sswitch_1
    invoke-static {v2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-static {v0, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-super {p0, v1, v0}, Landroid/view/View;->onMeasure(II)V

    .line 187
    return-void

    :sswitch_2
    move v2, v1

    .line 171
    goto :goto_0

    :sswitch_3
    move v0, v1

    .line 182
    goto :goto_1

    .line 164
    nop

    :sswitch_data_0
    .sparse-switch
        -0x80000000 -> :sswitch_2
        0x0 -> :sswitch_2
        0x40000000 -> :sswitch_0
    .end sparse-switch

    .line 175
    :sswitch_data_1
    .sparse-switch
        -0x80000000 -> :sswitch_3
        0x0 -> :sswitch_3
        0x40000000 -> :sswitch_1
    .end sparse-switch
.end method

.method protected setShape(I)V
    .locals 2

    .prologue
    .line 113
    packed-switch p1, :pswitch_data_0

    .line 123
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v1, "unknown shape value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 115
    :pswitch_0
    new-instance v0, Lcom/qihoo/security/widget/shadow/c;

    invoke-direct {v0}, Lcom/qihoo/security/widget/shadow/c;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/shadow/d;->a:Lcom/qihoo/security/widget/shadow/a;

    .line 125
    :goto_0
    return-void

    .line 119
    :pswitch_1
    new-instance v0, Lcom/qihoo/security/widget/shadow/b;

    invoke-direct {v0}, Lcom/qihoo/security/widget/shadow/b;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/shadow/d;->a:Lcom/qihoo/security/widget/shadow/a;

    goto :goto_0

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method protected setZDepth(I)V
    .locals 1

    .prologue
    .line 128
    invoke-direct {p0, p1}, Lcom/qihoo/security/widget/shadow/d;->a(I)Lcom/qihoo/security/widget/shadow/ZDepth;

    move-result-object v0

    .line 129
    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/shadow/d;->setZDepth(Lcom/qihoo/security/widget/shadow/ZDepth;)V

    .line 130
    return-void
.end method

.method protected setZDepth(Lcom/qihoo/security/widget/shadow/ZDepth;)V
    .locals 2

    .prologue
    .line 133
    new-instance v0, Lcom/qihoo/security/widget/shadow/e;

    invoke-direct {v0}, Lcom/qihoo/security/widget/shadow/e;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/widget/shadow/d;->b:Lcom/qihoo/security/widget/shadow/e;

    .line 134
    iget-object v0, p0, Lcom/qihoo/security/widget/shadow/d;->b:Lcom/qihoo/security/widget/shadow/e;

    invoke-virtual {p0}, Lcom/qihoo/security/widget/shadow/d;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/qihoo/security/widget/shadow/e;->a(Landroid/content/Context;Lcom/qihoo/security/widget/shadow/ZDepth;)V

    .line 135
    return-void
.end method

.method protected setZDepthAnimDuration(J)V
    .locals 1

    .prologue
    .line 61
    iput-wide p1, p0, Lcom/qihoo/security/widget/shadow/d;->g:J

    .line 62
    return-void
.end method

.method protected setZDepthDoAnimation(Z)V
    .locals 0

    .prologue
    .line 57
    iput-boolean p1, p0, Lcom/qihoo/security/widget/shadow/d;->h:Z

    .line 58
    return-void
.end method

.method protected setZDepthPaddingBottom(I)V
    .locals 1

    .prologue
    .line 80
    invoke-direct {p0, p1}, Lcom/qihoo/security/widget/shadow/d;->a(I)Lcom/qihoo/security/widget/shadow/ZDepth;

    move-result-object v0

    .line 81
    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/shadow/d;->a(Lcom/qihoo/security/widget/shadow/ZDepth;)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/shadow/d;->f:I

    .line 82
    return-void
.end method

.method protected setZDepthPaddingLeft(I)V
    .locals 1

    .prologue
    .line 65
    invoke-direct {p0, p1}, Lcom/qihoo/security/widget/shadow/d;->a(I)Lcom/qihoo/security/widget/shadow/ZDepth;

    move-result-object v0

    .line 66
    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/shadow/d;->a(Lcom/qihoo/security/widget/shadow/ZDepth;)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/shadow/d;->c:I

    .line 67
    return-void
.end method

.method protected setZDepthPaddingRight(I)V
    .locals 1

    .prologue
    .line 75
    invoke-direct {p0, p1}, Lcom/qihoo/security/widget/shadow/d;->a(I)Lcom/qihoo/security/widget/shadow/ZDepth;

    move-result-object v0

    .line 76
    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/shadow/d;->a(Lcom/qihoo/security/widget/shadow/ZDepth;)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/shadow/d;->e:I

    .line 77
    return-void
.end method

.method protected setZDepthPaddingTop(I)V
    .locals 1

    .prologue
    .line 70
    invoke-direct {p0, p1}, Lcom/qihoo/security/widget/shadow/d;->a(I)Lcom/qihoo/security/widget/shadow/ZDepth;

    move-result-object v0

    .line 71
    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/shadow/d;->a(Lcom/qihoo/security/widget/shadow/ZDepth;)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/widget/shadow/d;->d:I

    .line 72
    return-void
.end method
