.class public final Lcom/roidapp/photogrid/release/oo;
.super Lcom/roidapp/photogrid/release/oi;
.source "SourceFile"


# instance fields
.field private r:Lcom/roidapp/photogrid/release/mm;


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/release/PhotoGridActivity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/mm;Lcom/roidapp/photogrid/release/az;)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/oi;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/roidapp/photogrid/release/oo;->b:Landroid/app/Activity;

    .line 17
    iput-object p2, p0, Lcom/roidapp/photogrid/release/oo;->c:[Lcom/roidapp/photogrid/release/ig;

    .line 18
    iput-object p3, p0, Lcom/roidapp/photogrid/release/oo;->d:Lcom/roidapp/photogrid/release/ml;

    .line 19
    iput-object p4, p0, Lcom/roidapp/photogrid/release/oo;->g:Lcom/roidapp/photogrid/release/PhotoView;

    .line 20
    iput-object p5, p0, Lcom/roidapp/photogrid/release/oo;->r:Lcom/roidapp/photogrid/release/mm;

    .line 21
    iput-object p6, p0, Lcom/roidapp/photogrid/release/oo;->h:Lcom/roidapp/photogrid/release/az;

    .line 22
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 14

    .prologue
    const v13, 0x3b9d0369

    const/4 v12, 0x0

    const/4 v10, 0x1

    const/16 v1, 0x1000

    const/high16 v11, 0x42c80000    # 100.0f

    .line 26
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oo;->r:Lcom/roidapp/photogrid/release/mm;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/mm;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 27
    iget v4, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 28
    iget v5, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 32
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->t()F

    move-result v0

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v2

    if-lez v0, :cond_3

    .line 33
    iget v0, p0, Lcom/roidapp/photogrid/release/oo;->f:I

    int-to-float v0, v0

    int-to-float v2, v5

    div-float/2addr v0, v2

    .line 34
    int-to-float v2, v4

    mul-float/2addr v2, v0

    float-to-int v2, v2

    .line 35
    iget v3, p0, Lcom/roidapp/photogrid/release/oo;->f:I

    .line 37
    iget v6, p0, Lcom/roidapp/photogrid/release/oo;->f:I

    const/16 v7, 0xa00

    if-ne v6, v7, :cond_7

    if-le v2, v1, :cond_7

    .line 39
    const/high16 v0, 0x45800000    # 4096.0f

    int-to-float v2, v4

    div-float/2addr v0, v2

    .line 40
    int-to-float v2, v5

    mul-float/2addr v2, v0

    float-to-int v2, v2

    iput v2, p0, Lcom/roidapp/photogrid/release/oo;->f:I

    .line 41
    iget v3, p0, Lcom/roidapp/photogrid/release/oo;->f:I

    move v9, v0

    move v2, v1

    .line 56
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oo;->d:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x8

    invoke-virtual {v0, v1, v10}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 57
    new-instance v0, Lcom/roidapp/photogrid/release/ie;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/oo;->b:Landroid/app/Activity;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/oo;->c:[Lcom/roidapp/photogrid/release/ig;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/oo;->c()I

    move-result v5

    iget-object v6, p0, Lcom/roidapp/photogrid/release/oo;->d:Lcom/roidapp/photogrid/release/ml;

    iget-object v7, p0, Lcom/roidapp/photogrid/release/oo;->g:Lcom/roidapp/photogrid/release/PhotoView;

    iget-object v8, p0, Lcom/roidapp/photogrid/release/oo;->h:Lcom/roidapp/photogrid/release/az;

    invoke-direct/range {v0 .. v8}, Lcom/roidapp/photogrid/release/ie;-><init>(Landroid/content/Context;II[Lcom/roidapp/photogrid/release/ig;ILcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/az;)V

    .line 58
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->B()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ie;->a(Z)V

    .line 59
    invoke-virtual {v0, v9}, Lcom/roidapp/photogrid/release/ie;->a(F)V

    .line 60
    iget-object v1, p0, Lcom/roidapp/photogrid/release/oo;->b:Landroid/app/Activity;

    check-cast v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->R()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/oo;->d()Z

    move-result v1

    if-eqz v1, :cond_4

    move v1, v10

    :goto_1
    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ie;->b(Z)V

    .line 63
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v1

    const/4 v4, 0x4

    if-ne v1, v4, :cond_0

    .line 64
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->n()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ie;->a(Ljava/util/List;)V

    .line 67
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->B()Z

    move-result v1

    if-nez v1, :cond_1

    .line 68
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->A()I

    move-result v1

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ih;->x()I

    move-result v4

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v5

    invoke-virtual {v5}, Lcom/roidapp/photogrid/release/ih;->y()I

    move-result v5

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v6

    invoke-virtual {v6}, Lcom/roidapp/photogrid/release/ih;->z()I

    move-result v6

    invoke-virtual {v0, v1, v4, v5, v6}, Lcom/roidapp/photogrid/release/ie;->a(IIII)V

    .line 79
    :cond_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->t()F

    move-result v1

    const/high16 v4, 0x3f800000    # 1.0f

    cmpg-float v1, v1, v4

    if-gez v1, :cond_5

    .line 80
    int-to-float v1, v2

    .line 84
    :goto_2
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->S()F

    move-result v3

    .line 87
    iget-object v2, p0, Lcom/roidapp/photogrid/release/oo;->r:Lcom/roidapp/photogrid/release/mm;

    iget v2, v2, Lcom/roidapp/photogrid/release/mm;->r:I

    if-eqz v2, :cond_6

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->B()Z

    move-result v2

    if-nez v2, :cond_6

    cmpl-float v2, v3, v12

    if-nez v2, :cond_2

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->R()F

    move-result v2

    cmpl-float v2, v2, v12

    if-eqz v2, :cond_6

    .line 88
    :cond_2
    div-float v2, v3, v11

    add-float/2addr v2, v13

    mul-float/2addr v2, v1

    .line 89
    div-float/2addr v3, v11

    add-float/2addr v3, v13

    mul-float/2addr v1, v3

    .line 95
    :goto_3
    invoke-virtual {v0, v2, v1, v9}, Lcom/roidapp/photogrid/release/ie;->a(FFF)V

    .line 102
    iget-object v1, p0, Lcom/roidapp/photogrid/release/oo;->d:Lcom/roidapp/photogrid/release/ml;

    const/16 v2, 0x15

    invoke-virtual {v1, v2, v10}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 103
    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Lcom/roidapp/photogrid/release/op;

    invoke-direct {v2, p0, v0}, Lcom/roidapp/photogrid/release/op;-><init>(Lcom/roidapp/photogrid/release/oo;Lcom/roidapp/photogrid/release/ie;)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 190
    return-void

    .line 45
    :cond_3
    iget v2, p0, Lcom/roidapp/photogrid/release/oo;->f:I

    .line 46
    iget v0, p0, Lcom/roidapp/photogrid/release/oo;->f:I

    int-to-float v0, v0

    int-to-float v3, v4

    div-float/2addr v0, v3

    .line 47
    int-to-float v3, v5

    mul-float/2addr v3, v0

    float-to-int v3, v3

    .line 49
    iget v6, p0, Lcom/roidapp/photogrid/release/oo;->f:I

    const/16 v7, 0xa00

    if-ne v6, v7, :cond_7

    if-le v3, v1, :cond_7

    .line 51
    const/high16 v0, 0x45800000    # 4096.0f

    int-to-float v2, v5

    div-float/2addr v0, v2

    .line 52
    int-to-float v2, v4

    mul-float/2addr v2, v0

    float-to-int v2, v2

    iput v2, p0, Lcom/roidapp/photogrid/release/oo;->f:I

    .line 53
    iget v2, p0, Lcom/roidapp/photogrid/release/oo;->f:I

    move v9, v0

    move v3, v1

    goto/16 :goto_0

    .line 60
    :cond_4
    const/4 v1, 0x0

    goto/16 :goto_1

    .line 82
    :cond_5
    int-to-float v1, v3

    goto :goto_2

    .line 91
    :cond_6
    div-float v2, v3, v11

    mul-float/2addr v2, v1

    .line 92
    div-float/2addr v3, v11

    mul-float/2addr v1, v3

    goto :goto_3

    :cond_7
    move v9, v0

    goto/16 :goto_0
.end method

.method public final a(I)V
    .locals 17

    .prologue
    .line 194
    move/from16 v0, p1

    move-object/from16 v1, p0

    iput v0, v1, Lcom/roidapp/photogrid/release/oo;->o:I

    .line 196
    const/4 v2, 0x5

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/oo;->b(I)V

    .line 197
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/oo;->r:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/mm;->f()V

    .line 198
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/oo;->b:Landroid/app/Activity;

    check-cast v2, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->q()V

    .line 199
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/oo;->r:Lcom/roidapp/photogrid/release/mm;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/mm;->j:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    .line 200
    iget v2, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 202
    iget v2, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 204
    move-object/from16 v0, p0

    iget v2, v0, Lcom/roidapp/photogrid/release/oo;->k:I

    packed-switch v2, :pswitch_data_0

    .line 226
    :goto_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->B()Z

    move-result v12

    .line 227
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->A()I

    move-result v13

    .line 228
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->x()I

    move-result v14

    .line 229
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->y()I

    move-result v15

    .line 230
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->z()I

    move-result v16

    .line 233
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->t()F

    move-result v2

    const/high16 v4, 0x3f800000    # 1.0f

    cmpl-float v2, v2, v4

    if-lez v2, :cond_1

    .line 234
    move/from16 v0, p1

    int-to-float v2, v0

    iget v4, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    int-to-float v4, v4

    div-float/2addr v2, v4

    .line 235
    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    int-to-float v3, v3

    mul-float/2addr v3, v2

    float-to-int v4, v3

    move v11, v2

    move/from16 v5, p1

    .line 243
    :goto_1
    const/16 v2, 0x8

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/oo;->b(I)V

    .line 244
    new-instance v2, Lcom/roidapp/photogrid/release/ie;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/oo;->b:Landroid/app/Activity;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/roidapp/photogrid/release/oo;->r:Lcom/roidapp/photogrid/release/mm;

    iget-object v6, v6, Lcom/roidapp/photogrid/release/mm;->i:[Lcom/roidapp/photogrid/release/ig;

    const/4 v7, 0x1

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/roidapp/photogrid/release/oo;->d:Lcom/roidapp/photogrid/release/ml;

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/roidapp/photogrid/release/oo;->g:Lcom/roidapp/photogrid/release/PhotoView;

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/roidapp/photogrid/release/oo;->h:Lcom/roidapp/photogrid/release/az;

    invoke-direct/range {v2 .. v10}, Lcom/roidapp/photogrid/release/ie;-><init>(Landroid/content/Context;II[Lcom/roidapp/photogrid/release/ig;ILcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/az;)V

    .line 245
    invoke-virtual {v2, v12}, Lcom/roidapp/photogrid/release/ie;->a(Z)V

    .line 246
    invoke-virtual {v2, v11}, Lcom/roidapp/photogrid/release/ie;->a(F)V

    .line 247
    if-nez v12, :cond_0

    .line 249
    move/from16 v0, v16

    invoke-virtual {v2, v13, v14, v15, v0}, Lcom/roidapp/photogrid/release/ie;->a(IIII)V

    .line 256
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->t()F

    move-result v3

    const/high16 v6, 0x3f800000    # 1.0f

    cmpg-float v3, v3, v6

    if-gez v3, :cond_2

    .line 257
    int-to-float v3, v4

    .line 261
    :goto_2
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ih;->S()F

    move-result v5

    .line 262
    if-eqz v13, :cond_3

    if-nez v12, :cond_3

    .line 263
    const v4, 0x3bbc6a7f    # 0.00575f

    const/high16 v6, 0x42c80000    # 100.0f

    div-float v6, v5, v6

    add-float/2addr v4, v6

    mul-float/2addr v4, v3

    .line 264
    const v6, 0x3bbc6a7f    # 0.00575f

    const/high16 v7, 0x42c80000    # 100.0f

    div-float/2addr v5, v7

    add-float/2addr v5, v6

    mul-float/2addr v3, v5

    .line 270
    :goto_3
    invoke-virtual {v2, v4, v3, v11}, Lcom/roidapp/photogrid/release/ie;->a(FFF)V

    .line 271
    const/16 v3, 0x15

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/oo;->b(I)V

    .line 272
    new-instance v3, Ljava/lang/Thread;

    new-instance v4, Lcom/roidapp/photogrid/release/oq;

    move-object/from16 v0, p0

    move/from16 v1, p1

    invoke-direct {v4, v0, v2, v1}, Lcom/roidapp/photogrid/release/oq;-><init>(Lcom/roidapp/photogrid/release/oo;Lcom/roidapp/photogrid/release/ie;I)V

    invoke-direct {v3, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    .line 341
    return-void

    .line 206
    :pswitch_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    goto/16 :goto_0

    .line 209
    :pswitch_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    const/high16 v4, 0x3f400000    # 0.75f

    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    goto/16 :goto_0

    .line 212
    :pswitch_2
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    const v4, 0x3f36db6e

    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    goto/16 :goto_0

    .line 215
    :pswitch_3
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    const v4, 0x3f2aaaab

    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    goto/16 :goto_0

    .line 218
    :pswitch_4
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    const v4, 0x3f19999a    # 0.6f

    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    goto/16 :goto_0

    .line 221
    :pswitch_5
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    const/high16 v4, 0x3f100000    # 0.5625f

    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    goto/16 :goto_0

    .line 239
    :cond_1
    move/from16 v0, p1

    int-to-float v2, v0

    iget v4, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    int-to-float v4, v4

    div-float/2addr v2, v4

    .line 240
    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    int-to-float v3, v3

    mul-float/2addr v3, v2

    float-to-int v5, v3

    move v11, v2

    move/from16 v4, p1

    goto/16 :goto_1

    .line 259
    :cond_2
    int-to-float v3, v5

    goto/16 :goto_2

    .line 266
    :cond_3
    const/high16 v4, 0x42c80000    # 100.0f

    div-float v4, v5, v4

    mul-float/2addr v4, v3

    .line 267
    const/high16 v6, 0x42c80000    # 100.0f

    div-float/2addr v5, v6

    mul-float/2addr v3, v5

    .line 268
    const v5, 0x3f79999a    # 0.975f

    div-float/2addr v11, v5

    goto/16 :goto_3

    .line 204
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
