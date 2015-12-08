.class public final Lcom/roidapp/photogrid/release/pd;
.super Lcom/roidapp/photogrid/release/oi;
.source "SourceFile"


# instance fields
.field private r:Lcom/roidapp/photogrid/release/mm;


# direct methods
.method public constructor <init>(Landroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/mm;Lcom/roidapp/photogrid/release/az;)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/oi;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/roidapp/photogrid/release/pd;->b:Landroid/app/Activity;

    .line 16
    iput-object p2, p0, Lcom/roidapp/photogrid/release/pd;->c:[Lcom/roidapp/photogrid/release/ig;

    .line 17
    iput-object p3, p0, Lcom/roidapp/photogrid/release/pd;->d:Lcom/roidapp/photogrid/release/ml;

    .line 18
    iput-object p4, p0, Lcom/roidapp/photogrid/release/pd;->g:Lcom/roidapp/photogrid/release/PhotoView;

    .line 19
    iput-object p5, p0, Lcom/roidapp/photogrid/release/pd;->r:Lcom/roidapp/photogrid/release/mm;

    .line 20
    iput-object p6, p0, Lcom/roidapp/photogrid/release/pd;->h:Lcom/roidapp/photogrid/release/az;

    .line 21
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 13

    .prologue
    const/4 v12, 0x1

    const/high16 v8, 0x45800000    # 4096.0f

    const/high16 v11, 0x42c80000    # 100.0f

    const/high16 v10, 0x3f800000    # 1.0f

    const/16 v1, 0x1000

    .line 25
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pd;->r:Lcom/roidapp/photogrid/release/mm;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/mm;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 26
    iget v4, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 27
    iget v5, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 31
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->t()F

    move-result v0

    cmpl-float v0, v0, v10

    if-lez v0, :cond_2

    .line 32
    iget v0, p0, Lcom/roidapp/photogrid/release/pd;->f:I

    int-to-float v0, v0

    int-to-float v2, v5

    div-float/2addr v0, v2

    .line 33
    int-to-float v2, v4

    mul-float/2addr v2, v0

    float-to-int v2, v2

    .line 34
    iget v3, p0, Lcom/roidapp/photogrid/release/pd;->f:I

    .line 36
    iget v6, p0, Lcom/roidapp/photogrid/release/pd;->f:I

    const/16 v7, 0xa00

    if-ne v6, v7, :cond_5

    if-le v2, v1, :cond_5

    .line 38
    int-to-float v0, v4

    div-float v0, v8, v0

    .line 39
    int-to-float v2, v5

    mul-float/2addr v2, v0

    float-to-int v2, v2

    iput v2, p0, Lcom/roidapp/photogrid/release/pd;->f:I

    .line 40
    iget v3, p0, Lcom/roidapp/photogrid/release/pd;->f:I

    move v9, v0

    move v2, v1

    .line 55
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pd;->d:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x8

    invoke-virtual {v0, v1, v12}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 56
    new-instance v0, Lcom/roidapp/photogrid/release/ie;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/pd;->b:Landroid/app/Activity;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/pd;->c:[Lcom/roidapp/photogrid/release/ig;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/pd;->c()I

    move-result v5

    iget-object v6, p0, Lcom/roidapp/photogrid/release/pd;->d:Lcom/roidapp/photogrid/release/ml;

    iget-object v7, p0, Lcom/roidapp/photogrid/release/pd;->g:Lcom/roidapp/photogrid/release/PhotoView;

    iget-object v8, p0, Lcom/roidapp/photogrid/release/pd;->h:Lcom/roidapp/photogrid/release/az;

    invoke-direct/range {v0 .. v8}, Lcom/roidapp/photogrid/release/ie;-><init>(Landroid/content/Context;II[Lcom/roidapp/photogrid/release/ig;ILcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/az;)V

    .line 57
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->B()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ie;->a(Z)V

    .line 58
    invoke-virtual {v0, v9}, Lcom/roidapp/photogrid/release/ie;->a(F)V

    .line 59
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ie;->b(Z)V

    .line 61
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->h()Z

    move-result v1

    if-nez v1, :cond_3

    .line 62
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->n()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ie;->a(Ljava/util/List;)V

    .line 67
    :cond_0
    :goto_1
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

    .line 78
    :cond_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->t()F

    move-result v1

    cmpg-float v1, v1, v10

    if-gez v1, :cond_4

    .line 79
    int-to-float v1, v2

    .line 84
    :goto_2
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->S()F

    move-result v2

    .line 86
    div-float v3, v2, v11

    mul-float/2addr v3, v1

    .line 87
    div-float/2addr v2, v11

    mul-float/2addr v1, v2

    .line 89
    invoke-virtual {v0, v3, v1, v9}, Lcom/roidapp/photogrid/release/ie;->a(FFF)V

    .line 90
    iget-object v1, p0, Lcom/roidapp/photogrid/release/pd;->d:Lcom/roidapp/photogrid/release/ml;

    const/16 v2, 0x15

    invoke-virtual {v1, v2, v12}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 92
    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Lcom/roidapp/photogrid/release/pe;

    invoke-direct {v2, p0, v0}, Lcom/roidapp/photogrid/release/pe;-><init>(Lcom/roidapp/photogrid/release/pd;Lcom/roidapp/photogrid/release/ie;)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 177
    return-void

    .line 44
    :cond_2
    iget v2, p0, Lcom/roidapp/photogrid/release/pd;->f:I

    .line 45
    iget v0, p0, Lcom/roidapp/photogrid/release/pd;->f:I

    int-to-float v0, v0

    int-to-float v3, v4

    div-float/2addr v0, v3

    .line 46
    int-to-float v3, v5

    mul-float/2addr v3, v0

    float-to-int v3, v3

    .line 48
    iget v6, p0, Lcom/roidapp/photogrid/release/pd;->f:I

    const/16 v7, 0xa00

    if-ne v6, v7, :cond_5

    if-le v3, v1, :cond_5

    .line 50
    int-to-float v0, v5

    div-float v0, v8, v0

    .line 51
    int-to-float v2, v4

    mul-float/2addr v2, v0

    float-to-int v2, v2

    iput v2, p0, Lcom/roidapp/photogrid/release/pd;->f:I

    .line 52
    iget v2, p0, Lcom/roidapp/photogrid/release/pd;->f:I

    move v9, v0

    move v3, v1

    goto/16 :goto_0

    .line 63
    :cond_3
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

    goto/16 :goto_1

    .line 81
    :cond_4
    int-to-float v1, v3

    goto :goto_2

    :cond_5
    move v9, v0

    goto/16 :goto_0
.end method

.method public final a(I)V
    .locals 17

    .prologue
    .line 181
    move/from16 v0, p1

    move-object/from16 v1, p0

    iput v0, v1, Lcom/roidapp/photogrid/release/pd;->o:I

    .line 183
    const/4 v2, 0x5

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/pd;->b(I)V

    .line 184
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/pd;->r:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/mm;->f()V

    .line 185
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/pd;->b:Landroid/app/Activity;

    check-cast v2, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->q()V

    .line 186
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/pd;->r:Lcom/roidapp/photogrid/release/mm;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/mm;->j:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    .line 187
    iget v2, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 189
    iget v2, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 191
    move-object/from16 v0, p0

    iget v2, v0, Lcom/roidapp/photogrid/release/pd;->k:I

    packed-switch v2, :pswitch_data_0

    .line 213
    :goto_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->B()Z

    move-result v12

    .line 214
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->A()I

    move-result v13

    .line 215
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->x()I

    move-result v14

    .line 216
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->y()I

    move-result v15

    .line 217
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->z()I

    move-result v16

    .line 220
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->t()F

    move-result v2

    const/high16 v4, 0x3f800000    # 1.0f

    cmpl-float v2, v2, v4

    if-lez v2, :cond_1

    .line 221
    move/from16 v0, p1

    int-to-float v2, v0

    iget v4, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    int-to-float v4, v4

    div-float/2addr v2, v4

    .line 222
    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    int-to-float v3, v3

    mul-float/2addr v3, v2

    float-to-int v4, v3

    move v11, v2

    move/from16 v5, p1

    .line 230
    :goto_1
    const/16 v2, 0x8

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/pd;->b(I)V

    .line 231
    new-instance v2, Lcom/roidapp/photogrid/release/ie;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/pd;->b:Landroid/app/Activity;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/roidapp/photogrid/release/pd;->r:Lcom/roidapp/photogrid/release/mm;

    iget-object v6, v6, Lcom/roidapp/photogrid/release/mm;->i:[Lcom/roidapp/photogrid/release/ig;

    const/4 v7, 0x1

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/roidapp/photogrid/release/pd;->d:Lcom/roidapp/photogrid/release/ml;

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/roidapp/photogrid/release/pd;->g:Lcom/roidapp/photogrid/release/PhotoView;

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/roidapp/photogrid/release/pd;->h:Lcom/roidapp/photogrid/release/az;

    invoke-direct/range {v2 .. v10}, Lcom/roidapp/photogrid/release/ie;-><init>(Landroid/content/Context;II[Lcom/roidapp/photogrid/release/ig;ILcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/az;)V

    .line 232
    invoke-virtual {v2, v12}, Lcom/roidapp/photogrid/release/ie;->a(Z)V

    .line 233
    invoke-virtual {v2, v11}, Lcom/roidapp/photogrid/release/ie;->a(F)V

    .line 234
    if-nez v12, :cond_0

    .line 236
    move/from16 v0, v16

    invoke-virtual {v2, v13, v14, v15, v0}, Lcom/roidapp/photogrid/release/ie;->a(IIII)V

    .line 243
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->t()F

    move-result v3

    const/high16 v6, 0x3f800000    # 1.0f

    cmpg-float v3, v3, v6

    if-gez v3, :cond_2

    .line 244
    int-to-float v3, v4

    .line 248
    :goto_2
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ih;->S()F

    move-result v5

    .line 249
    if-eqz v13, :cond_3

    if-nez v12, :cond_3

    .line 250
    const v4, 0x3c3c6a7f    # 0.0115f

    const/high16 v6, 0x42c80000    # 100.0f

    div-float v6, v5, v6

    add-float/2addr v4, v6

    mul-float/2addr v4, v3

    .line 251
    const v6, 0x3c3c6a7f    # 0.0115f

    const/high16 v7, 0x42c80000    # 100.0f

    div-float/2addr v5, v7

    add-float/2addr v5, v6

    mul-float/2addr v3, v5

    .line 257
    :goto_3
    invoke-virtual {v2, v4, v3, v11}, Lcom/roidapp/photogrid/release/ie;->a(FFF)V

    .line 258
    const/16 v3, 0x15

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/pd;->b(I)V

    .line 259
    new-instance v3, Ljava/lang/Thread;

    new-instance v4, Lcom/roidapp/photogrid/release/pf;

    move-object/from16 v0, p0

    move/from16 v1, p1

    invoke-direct {v4, v0, v2, v1}, Lcom/roidapp/photogrid/release/pf;-><init>(Lcom/roidapp/photogrid/release/pd;Lcom/roidapp/photogrid/release/ie;I)V

    invoke-direct {v3, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    .line 328
    return-void

    .line 193
    :pswitch_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    goto/16 :goto_0

    .line 196
    :pswitch_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    const/high16 v4, 0x3f400000    # 0.75f

    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    goto/16 :goto_0

    .line 199
    :pswitch_2
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    const v4, 0x3f36db6e

    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    goto/16 :goto_0

    .line 202
    :pswitch_3
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    const v4, 0x3f2aaaab

    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    goto/16 :goto_0

    .line 205
    :pswitch_4
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    const v4, 0x3f19999a    # 0.6f

    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    goto/16 :goto_0

    .line 208
    :pswitch_5
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    const/high16 v4, 0x3f100000    # 0.5625f

    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    goto/16 :goto_0

    .line 226
    :cond_1
    move/from16 v0, p1

    int-to-float v2, v0

    iget v4, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    int-to-float v4, v4

    div-float/2addr v2, v4

    .line 227
    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    int-to-float v3, v3

    mul-float/2addr v3, v2

    float-to-int v5, v3

    move v11, v2

    move/from16 v4, p1

    goto/16 :goto_1

    .line 246
    :cond_2
    int-to-float v3, v5

    goto/16 :goto_2

    .line 253
    :cond_3
    const/high16 v4, 0x42c80000    # 100.0f

    div-float v4, v5, v4

    mul-float/2addr v4, v3

    .line 254
    const/high16 v6, 0x42c80000    # 100.0f

    div-float/2addr v5, v6

    mul-float/2addr v3, v5

    goto :goto_3

    .line 191
    nop

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
