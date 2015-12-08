.class public final Lcom/roidapp/photogrid/release/mq;
.super Lcom/roidapp/photogrid/release/mm;
.source "SourceFile"


# instance fields
.field private L:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/release/hv;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLandroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/az;)V
    .locals 7

    .prologue
    const v1, 0x3f2aaaab

    const v2, 0x3f19999a    # 0.6f

    const/high16 v3, 0x3f100000    # 0.5625f

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    .line 32
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/mm;-><init>()V

    .line 30
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, p0, Lcom/roidapp/photogrid/release/mq;->L:Ljava/util/ArrayList;

    .line 33
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/mq;->F:Z

    .line 34
    iput-object p2, p0, Lcom/roidapp/photogrid/release/mq;->h:Landroid/app/Activity;

    .line 35
    iput-object p3, p0, Lcom/roidapp/photogrid/release/mq;->i:[Lcom/roidapp/photogrid/release/ig;

    .line 36
    iput-object p4, p0, Lcom/roidapp/photogrid/release/mq;->l:Lcom/roidapp/photogrid/release/ml;

    .line 37
    iput-object p5, p0, Lcom/roidapp/photogrid/release/mq;->D:Lcom/roidapp/photogrid/release/PhotoView;

    .line 38
    iput-object p6, p0, Lcom/roidapp/photogrid/release/mq;->E:Lcom/roidapp/photogrid/release/az;

    .line 39
    invoke-virtual {p2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v4

    const/4 v5, -0x1

    invoke-virtual {v4, v5}, Landroid/view/Window;->setFormat(I)V

    .line 40
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    .line 41
    if-eqz p1, :cond_2

    .line 42
    invoke-virtual {v4, v6}, Lcom/roidapp/photogrid/release/ih;->g(Z)V

    .line 43
    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Lcom/roidapp/photogrid/release/ih;->d(Z)V

    .line 44
    invoke-virtual {v4, v6}, Lcom/roidapp/photogrid/release/ih;->c(I)V

    .line 45
    invoke-virtual {v4, v0}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    .line 46
    invoke-virtual {v4, v6}, Lcom/roidapp/photogrid/release/ih;->e(Z)V

    .line 47
    invoke-virtual {v4, v6}, Lcom/roidapp/photogrid/release/ih;->f(Z)V

    .line 48
    invoke-virtual {v4, v6}, Lcom/roidapp/photogrid/release/ih;->i(I)V

    .line 1065
    iget-object v5, p0, Lcom/roidapp/photogrid/release/mq;->h:Landroid/app/Activity;

    invoke-virtual {v5}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v5, p0, Lcom/roidapp/photogrid/release/mq;->x:I

    .line 1066
    iget-object v5, p0, Lcom/roidapp/photogrid/release/mq;->h:Landroid/app/Activity;

    invoke-virtual {v5}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v5, p0, Lcom/roidapp/photogrid/release/mq;->w:I

    .line 1067
    iget v5, p0, Lcom/roidapp/photogrid/release/mq;->x:I

    iget v6, p0, Lcom/roidapp/photogrid/release/mq;->w:I

    if-ge v5, v6, :cond_0

    .line 1068
    iget v5, p0, Lcom/roidapp/photogrid/release/mq;->x:I

    .line 1069
    iget v6, p0, Lcom/roidapp/photogrid/release/mq;->w:I

    iput v6, p0, Lcom/roidapp/photogrid/release/mq;->x:I

    .line 1070
    iput v5, p0, Lcom/roidapp/photogrid/release/mq;->w:I

    .line 1072
    :cond_0
    iget-object v5, p0, Lcom/roidapp/photogrid/release/mq;->h:Landroid/app/Activity;

    invoke-virtual {v5}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f0900dd

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    .line 1073
    iget v6, p0, Lcom/roidapp/photogrid/release/mq;->x:I

    int-to-float v6, v6

    sub-float v5, v6, v5

    sget v6, Lcom/roidapp/photogrid/common/az;->g:I

    int-to-float v6, v6

    sub-float/2addr v5, v6

    .line 1074
    iget v6, p0, Lcom/roidapp/photogrid/release/mq;->w:I

    int-to-float v6, v6

    div-float v5, v6, v5

    .line 1077
    const/high16 v6, 0x3f400000    # 0.75f

    cmpg-float v6, v6, v5

    if-gez v6, :cond_4

    cmpg-float v6, v5, v0

    if-gtz v6, :cond_4

    .line 1090
    :cond_1
    :goto_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    .line 52
    :cond_2
    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ih;->w()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 53
    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ih;->w()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/mq;->z:Ljava/util/List;

    .line 56
    :cond_3
    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ih;->x()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/mq;->s:I

    .line 57
    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ih;->y()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/mq;->t:I

    .line 58
    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ih;->z()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/mq;->u:I

    .line 60
    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ih;->m()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/mq;->A:Ljava/util/List;

    .line 1096
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    packed-switch v0, :pswitch_data_0

    .line 1120
    :goto_1
    return-void

    .line 1079
    :cond_4
    const v6, 0x3f36db6e

    cmpg-float v6, v6, v5

    if-gez v6, :cond_5

    const/high16 v6, 0x3f400000    # 0.75f

    cmpg-float v6, v5, v6

    if-gtz v6, :cond_5

    .line 1080
    const/high16 v0, 0x3f400000    # 0.75f

    goto :goto_0

    .line 1081
    :cond_5
    cmpg-float v6, v1, v5

    if-gez v6, :cond_6

    const v6, 0x3f36db6e

    cmpg-float v6, v5, v6

    if-gtz v6, :cond_6

    .line 1082
    const v0, 0x3f36db6e

    goto :goto_0

    .line 1083
    :cond_6
    cmpg-float v6, v2, v5

    if-gez v6, :cond_7

    cmpg-float v6, v5, v1

    if-gtz v6, :cond_7

    move v0, v1

    .line 1084
    goto :goto_0

    .line 1085
    :cond_7
    cmpg-float v1, v3, v5

    if-gez v1, :cond_8

    cmpg-float v1, v5, v2

    if-gtz v1, :cond_8

    move v0, v2

    .line 1086
    goto :goto_0

    .line 1087
    :cond_8
    cmpg-float v1, v5, v3

    if-gtz v1, :cond_1

    move v0, v3

    .line 1088
    goto :goto_0

    .line 1098
    :pswitch_0
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->q:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/mq;->B:[I

    goto :goto_1

    .line 1101
    :pswitch_1
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->r:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/mq;->B:[I

    goto :goto_1

    .line 1104
    :pswitch_2
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->s:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/mq;->B:[I

    goto :goto_1

    .line 1107
    :pswitch_3
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->t:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/mq;->B:[I

    goto :goto_1

    .line 1110
    :pswitch_4
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->u:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/mq;->B:[I

    goto :goto_1

    .line 1113
    :pswitch_5
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->v:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/mq;->B:[I

    goto :goto_1

    .line 1116
    :pswitch_6
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->w:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/mq;->B:[I

    goto :goto_1

    .line 1119
    :pswitch_7
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->x:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/mq;->B:[I

    goto/16 :goto_1

    .line 1122
    :pswitch_8
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->y:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/mq;->B:[I

    goto/16 :goto_1

    .line 1096
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/mq;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->L:Ljava/util/ArrayList;

    return-object v0
.end method

.method private m()V
    .locals 11

    .prologue
    const/4 v3, 0x0

    .line 295
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->z:Ljava/util/List;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 296
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 297
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    .line 307
    iput-boolean v3, v0, Lcom/roidapp/photogrid/release/ao;->f:Z

    .line 308
    iget-object v2, p0, Lcom/roidapp/photogrid/release/mq;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/release/PhotoView;->a(Lcom/roidapp/photogrid/release/ao;)V

    goto :goto_0

    .line 310
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->h:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i()V

    .line 312
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 316
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->A:Ljava/util/List;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->A:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 317
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->E:Lcom/roidapp/photogrid/release/az;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 318
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/mq;->A:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 320
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->A:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 324
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v2, v3

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    .line 325
    instance-of v1, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v1, :cond_6

    move-object v1, v0

    .line 326
    check-cast v1, Lcom/roidapp/photogrid/release/ra;

    .line 327
    iget v5, v1, Lcom/roidapp/photogrid/release/ra;->j:F

    .line 328
    iget v6, v1, Lcom/roidapp/photogrid/release/ra;->k:F

    .line 330
    iget-object v7, p0, Lcom/roidapp/photogrid/release/mq;->j:Landroid/view/ViewGroup;

    invoke-virtual {v7}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    iget v7, v7, Landroid/view/ViewGroup$LayoutParams;->width:I

    int-to-float v7, v7

    iget v8, v1, Lcom/roidapp/photogrid/release/ra;->c:I

    int-to-float v8, v8

    div-float/2addr v7, v8

    .line 331
    iget-object v8, p0, Lcom/roidapp/photogrid/release/mq;->j:Landroid/view/ViewGroup;

    invoke-virtual {v8}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    iget v8, v8, Landroid/view/ViewGroup$LayoutParams;->height:I

    int-to-float v8, v8

    iget v9, v1, Lcom/roidapp/photogrid/release/ra;->d:I

    int-to-float v9, v9

    div-float/2addr v8, v9

    .line 333
    mul-float v9, v5, v7

    .line 334
    mul-float/2addr v8, v6

    .line 336
    iget-object v10, p0, Lcom/roidapp/photogrid/release/mq;->j:Landroid/view/ViewGroup;

    invoke-virtual {v10}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v10

    iget v10, v10, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v10, v1, Lcom/roidapp/photogrid/release/ra;->c:I

    .line 337
    iget-object v10, p0, Lcom/roidapp/photogrid/release/mq;->j:Landroid/view/ViewGroup;

    invoke-virtual {v10}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v10

    iget v10, v10, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v10, v1, Lcom/roidapp/photogrid/release/ra;->d:I

    .line 338
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ra;->i()V

    .line 341
    neg-float v5, v5

    neg-float v6, v6

    invoke-virtual {v1, v5, v6}, Lcom/roidapp/photogrid/release/ra;->b(FF)V

    .line 343
    iget v5, v1, Lcom/roidapp/photogrid/release/ra;->h:F

    .line 344
    mul-float/2addr v5, v7

    iget v6, v1, Lcom/roidapp/photogrid/release/ra;->l:F

    invoke-virtual {v1, v5, v6, v9, v8}, Lcom/roidapp/photogrid/release/ra;->b(FFFF)V

    move-object v1, v0

    .line 345
    check-cast v1, Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ra;->j()V

    .line 346
    iput-boolean v3, v0, Lcom/roidapp/photogrid/release/ao;->f:Z

    .line 359
    :cond_4
    :goto_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->l:Lcom/roidapp/photogrid/release/ml;

    add-int/lit8 v1, v2, 0x15

    invoke-virtual {v0, v1, v3}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 360
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    .line 361
    goto :goto_2

    .line 314
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->h:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i()V

    goto/16 :goto_1

    .line 347
    :cond_6
    instance-of v1, v0, Lcom/roidapp/photogrid/release/qz;

    if-eqz v1, :cond_4

    .line 349
    check-cast v0, Lcom/roidapp/photogrid/release/qz;

    .line 351
    iget v1, v0, Lcom/roidapp/photogrid/release/qz;->c:I

    if-lez v1, :cond_7

    iget v1, v0, Lcom/roidapp/photogrid/release/qz;->d:I

    if-lez v1, :cond_7

    .line 352
    iget v1, v0, Lcom/roidapp/photogrid/release/qz;->j:F

    iget-object v5, p0, Lcom/roidapp/photogrid/release/mq;->j:Landroid/view/ViewGroup;

    invoke-virtual {v5}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    iget v5, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    int-to-float v5, v5

    iget v6, v0, Lcom/roidapp/photogrid/release/qz;->c:I

    int-to-float v6, v6

    div-float/2addr v5, v6

    mul-float/2addr v1, v5

    iput v1, v0, Lcom/roidapp/photogrid/release/qz;->j:F

    .line 353
    iget v1, v0, Lcom/roidapp/photogrid/release/qz;->k:F

    iget-object v5, p0, Lcom/roidapp/photogrid/release/mq;->j:Landroid/view/ViewGroup;

    invoke-virtual {v5}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    iget v5, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    int-to-float v5, v5

    iget v6, v0, Lcom/roidapp/photogrid/release/qz;->d:I

    int-to-float v6, v6

    div-float/2addr v5, v6

    mul-float/2addr v1, v5

    iput v1, v0, Lcom/roidapp/photogrid/release/qz;->k:F

    .line 355
    :cond_7
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mq;->j:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v1, v0, Lcom/roidapp/photogrid/release/qz;->c:I

    .line 356
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mq;->j:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v1, v0, Lcom/roidapp/photogrid/release/qz;->d:I

    .line 357
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/qz;->g()V

    goto :goto_3

    .line 363
    :cond_8
    return-void
.end method

.method private n()V
    .locals 7

    .prologue
    .line 370
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/mq;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v1, v1

    if-eq v0, v1, :cond_0

    .line 372
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->i()V

    .line 374
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->h:Landroid/app/Activity;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/mq;->B:[I

    iget v2, p0, Lcom/roidapp/photogrid/release/mq;->m:I

    aget v1, v1, v2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/mq;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v2, v2

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;II)[Lcom/roidapp/photogrid/release/lc;

    move-result-object v1

    .line 375
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aD()Z

    move-result v2

    .line 377
    const/4 v0, 0x0

    :goto_0
    iget-object v3, p0, Lcom/roidapp/photogrid/release/mq;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v3, v3

    if-ge v0, v3, :cond_0

    .line 378
    new-instance v3, Lcom/roidapp/photogrid/release/ps;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/mq;->h:Landroid/app/Activity;

    invoke-direct {v3, v4}, Lcom/roidapp/photogrid/release/ps;-><init>(Landroid/content/Context;)V

    .line 382
    invoke-virtual {v3, v2}, Lcom/roidapp/photogrid/release/ps;->a(Z)V

    .line 385
    iget-object v4, p0, Lcom/roidapp/photogrid/release/mq;->j:Landroid/view/ViewGroup;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    iget v4, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v4, v3, Lcom/roidapp/photogrid/release/ps;->c:I

    .line 386
    iget-object v4, p0, Lcom/roidapp/photogrid/release/mq;->j:Landroid/view/ViewGroup;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    iget v4, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v4, v3, Lcom/roidapp/photogrid/release/ps;->d:I

    .line 388
    aget-object v4, v1, v0

    .line 389
    iput-object v4, v3, Lcom/roidapp/photogrid/release/ps;->I:Lcom/roidapp/photogrid/release/lc;

    .line 391
    iget-object v5, p0, Lcom/roidapp/photogrid/release/mq;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v5, v5, v0

    iput-object v5, v3, Lcom/roidapp/photogrid/release/ps;->H:Lcom/roidapp/photogrid/release/ig;

    .line 393
    iget v5, v4, Lcom/roidapp/photogrid/release/lc;->o:I

    .line 3384
    iget v6, v3, Lcom/roidapp/photogrid/release/ps;->l:F

    int-to-float v5, v5

    add-float/2addr v5, v6

    iput v5, v3, Lcom/roidapp/photogrid/release/ps;->l:F

    .line 394
    iget v5, v3, Lcom/roidapp/photogrid/release/ps;->m:F

    iget v4, v4, Lcom/roidapp/photogrid/release/lc;->o:I

    int-to-float v4, v4

    add-float/2addr v4, v5

    iput v4, v3, Lcom/roidapp/photogrid/release/ps;->m:F

    .line 396
    const/high16 v4, -0x40800000    # -1.0f

    iput v4, v3, Lcom/roidapp/photogrid/release/ps;->u:F

    .line 397
    iget-object v4, p0, Lcom/roidapp/photogrid/release/mq;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v4, v3}, Lcom/roidapp/photogrid/release/PhotoView;->a(Lcom/roidapp/photogrid/release/ao;)V

    .line 377
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 435
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    .line 436
    check-cast v0, Lcom/roidapp/photogrid/release/ps;

    .line 439
    iget-object v2, p0, Lcom/roidapp/photogrid/release/mq;->L:Ljava/util/ArrayList;

    new-instance v3, Lcom/roidapp/photogrid/release/hv;

    iget v4, p0, Lcom/roidapp/photogrid/release/mq;->w:I

    iget v5, p0, Lcom/roidapp/photogrid/release/mq;->w:I

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ps;->H:Lcom/roidapp/photogrid/release/ig;

    invoke-direct {v3, v4, v5, v0}, Lcom/roidapp/photogrid/release/hv;-><init>(IILcom/roidapp/photogrid/release/ig;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 442
    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 10

    .prologue
    const/4 v9, 0x1

    .line 258
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xa

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 1131
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->t()F

    move-result v3

    .line 1134
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v0, p0, Lcom/roidapp/photogrid/release/mq;->x:I

    .line 1135
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/roidapp/photogrid/release/mq;->w:I

    .line 1136
    iget v0, p0, Lcom/roidapp/photogrid/release/mq;->x:I

    iget v1, p0, Lcom/roidapp/photogrid/release/mq;->w:I

    if-ge v0, v1, :cond_0

    .line 1137
    iget v0, p0, Lcom/roidapp/photogrid/release/mq;->x:I

    .line 1138
    iget v1, p0, Lcom/roidapp/photogrid/release/mq;->w:I

    iput v1, p0, Lcom/roidapp/photogrid/release/mq;->x:I

    .line 1139
    iput v0, p0, Lcom/roidapp/photogrid/release/mq;->w:I

    .line 1142
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0900dd

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    .line 1143
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f090058

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    .line 1144
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f090057

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    .line 1147
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0900cb

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v6

    .line 1148
    sget v0, Lcom/roidapp/photogrid/common/az;->g:I

    .line 1149
    iget v0, p0, Lcom/roidapp/photogrid/release/mq;->x:I

    int-to-float v0, v0

    sub-float/2addr v0, v4

    sget v2, Lcom/roidapp/photogrid/common/az;->g:I

    int-to-float v2, v2

    sub-float/2addr v0, v2

    sub-float/2addr v0, v6

    float-to-int v2, v0

    .line 1153
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->h:Landroid/app/Activity;

    const v7, 0x7f0d0085

    invoke-virtual {v0, v7}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v7

    .line 1154
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->r()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1155
    if-eqz v7, :cond_1

    .line 1156
    const/16 v0, 0x8

    invoke-virtual {v7, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1160
    :cond_1
    iget v0, p0, Lcom/roidapp/photogrid/release/mq;->w:I

    move v1, v0

    .line 1211
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->h:Landroid/app/Activity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v3, 0x7f03000b

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/mq;->j:Landroid/view/ViewGroup;

    .line 1212
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v3, -0x1

    const/4 v4, -0x1

    invoke-direct {v0, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 1214
    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 1215
    iput v2, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 1216
    iget-object v3, p0, Lcom/roidapp/photogrid/release/mq;->j:Landroid/view/ViewGroup;

    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1217
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v3, -0x2

    const/4 v4, -0x2

    invoke-direct {v0, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 1218
    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 1219
    iput v2, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 1220
    iget-object v3, p0, Lcom/roidapp/photogrid/release/mq;->D:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v3, :cond_2

    .line 1222
    iget-object v3, p0, Lcom/roidapp/photogrid/release/mq;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/PhotoView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1225
    :cond_2
    iget-object v3, p0, Lcom/roidapp/photogrid/release/mq;->E:Lcom/roidapp/photogrid/release/az;

    if-eqz v3, :cond_3

    .line 1226
    iget-object v3, p0, Lcom/roidapp/photogrid/release/mq;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/az;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1227
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->j:Landroid/view/ViewGroup;

    const v3, 0x7f0d0061

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/mq;->k:Landroid/widget/RelativeLayout;

    .line 1228
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 1230
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 1231
    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1233
    iget v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    sput v1, Lcom/roidapp/photogrid/common/az;->p:I

    .line 1234
    iget v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    sput v1, Lcom/roidapp/photogrid/common/az;->o:I

    .line 1235
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mq;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1236
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->removeAllViews()V

    .line 1237
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->j:Landroid/view/ViewGroup;

    const v1, 0x7f0d0060

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/mq;->p:Landroid/widget/LinearLayout;

    .line 1238
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 260
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xc

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 1625
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->q:Lcom/roidapp/photogrid/release/an;

    if-nez v0, :cond_5

    .line 1626
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v0, p0, Lcom/roidapp/photogrid/release/mq;->n:I

    .line 1627
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v0, p0, Lcom/roidapp/photogrid/release/mq;->o:I

    .line 1628
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aB()Ljava/lang/String;

    move-result-object v0

    .line 1629
    if-nez v0, :cond_c

    .line 1630
    const/4 v1, 0x0

    sput-boolean v1, Lcom/roidapp/photogrid/common/az;->C:Z

    .line 1631
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ih;->v(Z)V

    .line 1638
    :cond_4
    :goto_1
    sget-boolean v1, Lcom/roidapp/photogrid/common/az;->C:Z

    if-eqz v1, :cond_d

    .line 1639
    new-instance v1, Lcom/roidapp/photogrid/release/an;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/mq;->h:Landroid/app/Activity;

    iget v3, p0, Lcom/roidapp/photogrid/release/mq;->n:I

    iget v4, p0, Lcom/roidapp/photogrid/release/mq;->o:I

    invoke-direct {v1, v2, v3, v4, v0}, Lcom/roidapp/photogrid/release/an;-><init>(Landroid/content/Context;IILjava/lang/String;)V

    iput-object v1, p0, Lcom/roidapp/photogrid/release/mq;->q:Lcom/roidapp/photogrid/release/an;

    .line 1640
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->q:Lcom/roidapp/photogrid/release/an;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/an;->b()V

    .line 1641
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->q:Lcom/roidapp/photogrid/release/an;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/an;->a(Z)V

    .line 1642
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->q:Lcom/roidapp/photogrid/release/an;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/an;->b(Z)V

    .line 262
    :cond_5
    :goto_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x14

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 263
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/mq;->m()V

    .line 264
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x1e

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 265
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/mq;->n()V

    .line 266
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x23

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 2447
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/photogrid/release/mr;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/mr;-><init>(Lcom/roidapp/photogrid/release/mq;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 286
    :goto_3
    return-void

    .line 1162
    :cond_6
    if-eqz v7, :cond_7

    .line 1163
    invoke-static {}, Lcom/roidapp/photogrid/common/a;->a()Lcom/roidapp/photogrid/common/a;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->h:Landroid/app/Activity;

    const-string v2, "free"

    const/4 v8, 0x1

    invoke-static {v0, v2, v8}, Lcom/roidapp/photogrid/common/a;->a(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->h:Landroid/app/Activity;

    invoke-static {v0}, Lcom/roidapp/photogrid/a/m;->a(Landroid/content/Context;)I

    move-result v0

    if-eq v0, v9, :cond_9

    .line 1164
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->B:Z

    if-nez v0, :cond_8

    .line 1165
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1167
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->h:Landroid/app/Activity;

    instance-of v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_7

    .line 1168
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->h:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 1169
    iget-boolean v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->F:Z

    if-eqz v2, :cond_7

    .line 1170
    const/4 v2, 0x0

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->F:Z

    .line 1171
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->C()V

    .line 1182
    :cond_7
    :goto_4
    if-eqz v7, :cond_a

    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_a

    .line 1183
    const v0, 0x7f0d0086

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 1184
    if-eqz v0, :cond_e

    .line 1185
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1186
    if-lez v0, :cond_e

    .line 1187
    int-to-float v0, v0

    .line 1194
    :goto_5
    iget v1, p0, Lcom/roidapp/photogrid/release/mq;->x:I

    int-to-float v1, v1

    sub-float/2addr v1, v4

    sub-float/2addr v1, v5

    sub-float v0, v1, v0

    sub-float/2addr v0, v6

    sget v1, Lcom/roidapp/photogrid/common/az;->g:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    float-to-int v1, v0

    .line 1196
    iget v0, p0, Lcom/roidapp/photogrid/release/mq;->w:I

    int-to-float v0, v0

    int-to-float v2, v1

    div-float/2addr v0, v2

    .line 1197
    cmpg-float v0, v3, v0

    if-gez v0, :cond_b

    .line 1199
    int-to-float v0, v1

    mul-float/2addr v0, v3

    float-to-int v0, v0

    move v2, v1

    move v1, v0

    goto/16 :goto_0

    .line 1175
    :cond_8
    const/16 v0, 0x8

    invoke-virtual {v7, v0}, Landroid/view/View;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_4

    .line 278
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 279
    const/16 v0, 0x8e

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/mq;->d(I)V

    goto :goto_3

    .line 1178
    :cond_9
    const/16 v0, 0x8

    :try_start_1
    invoke-virtual {v7, v0}, Landroid/view/View;->setVisibility(I)V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_4

    .line 280
    :catch_1
    move-exception v0

    .line 281
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 282
    const/16 v1, 0x8e

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/mq;->d(I)V

    .line 283
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mq;->K:Landroid/os/Handler;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/common/c;->a(Landroid/os/Handler;Ljava/lang/Throwable;)V

    goto/16 :goto_3

    .line 1191
    :cond_a
    const/4 v0, 0x0

    goto :goto_5

    .line 1201
    :cond_b
    :try_start_2
    iget v0, p0, Lcom/roidapp/photogrid/release/mq;->w:I

    .line 1202
    int-to-float v1, v0

    div-float/2addr v1, v3

    float-to-int v1, v1

    move v2, v1

    move v1, v0

    goto/16 :goto_0

    .line 1632
    :cond_c
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/rf;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 1633
    const/4 v1, 0x0

    sput-boolean v1, Lcom/roidapp/photogrid/common/az;->C:Z

    .line 1634
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ih;->v(Z)V

    .line 1635
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ih;->h(Ljava/lang/String;)V

    .line 1636
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ih;->i(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 1644
    :cond_d
    new-instance v0, Lcom/roidapp/photogrid/release/an;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/mq;->h:Landroid/app/Activity;

    iget v2, p0, Lcom/roidapp/photogrid/release/mq;->n:I

    iget v3, p0, Lcom/roidapp/photogrid/release/mq;->o:I

    invoke-direct {v0, v1, v2, v3}, Lcom/roidapp/photogrid/release/an;-><init>(Landroid/content/Context;II)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/mq;->q:Lcom/roidapp/photogrid/release/an;

    .line 1645
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->q:Lcom/roidapp/photogrid/release/an;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/an;->b()V

    .line 1646
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->q:Lcom/roidapp/photogrid/release/an;

    const/4 v1, 0x0

    iget v2, p0, Lcom/roidapp/photogrid/release/mq;->s:I

    iget v3, p0, Lcom/roidapp/photogrid/release/mq;->t:I

    iget v4, p0, Lcom/roidapp/photogrid/release/mq;->u:I

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/release/an;->a(IIII)V

    .line 1647
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->q:Lcom/roidapp/photogrid/release/an;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/an;->a(Z)V

    .line 1648
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->q:Lcom/roidapp/photogrid/release/an;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/an;->b(Z)V
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto/16 :goto_2

    :cond_e
    move v0, v1

    goto/16 :goto_5
.end method

.method public final a(Landroid/widget/RelativeLayout;Landroid/view/View$OnTouchListener;)V
    .locals 10

    .prologue
    .line 656
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/mq;->H:Z

    if-eqz v0, :cond_0

    .line 703
    :goto_0
    return-void

    .line 659
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->q:Lcom/roidapp/photogrid/release/an;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->p:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    if-nez v0, :cond_2

    .line 660
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 661
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->q:Lcom/roidapp/photogrid/release/an;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/an;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 662
    if-eqz v0, :cond_1

    .line 663
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 665
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->p:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/mq;->q:Lcom/roidapp/photogrid/release/an;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 667
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x50

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 676
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aM()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 677
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->r(Z)V

    .line 3589
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->f()Ljava/util/List;

    move-result-object v4

    .line 3590
    const/4 v0, 0x0

    move v3, v0

    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_4

    .line 3591
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    move-object v1, v0

    .line 3593
    check-cast v1, Lcom/roidapp/photogrid/release/ps;

    .line 3594
    iget-object v2, p0, Lcom/roidapp/photogrid/release/mq;->h:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v5, 0x7f0205c8

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    check-cast v2, Landroid/graphics/drawable/NinePatchDrawable;

    .line 3595
    iget-object v5, v1, Lcom/roidapp/photogrid/release/ps;->H:Lcom/roidapp/photogrid/release/ig;

    .line 3596
    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ps;->a(Landroid/graphics/drawable/NinePatchDrawable;)V

    .line 3597
    invoke-virtual {v5}, Lcom/roidapp/photogrid/release/ig;->d()Ljava/lang/String;

    move-result-object v2

    .line 3600
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mq;->L:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/hv;

    iget-object v5, v1, Lcom/roidapp/photogrid/release/hv;->a:Landroid/graphics/Bitmap;

    .line 3602
    if-eqz v5, :cond_3

    .line 3603
    iput-object v2, v0, Lcom/roidapp/photogrid/release/ao;->g:Ljava/lang/String;

    move-object v1, v0

    .line 3604
    check-cast v1, Lcom/roidapp/photogrid/release/ps;

    const/4 v2, 0x0

    invoke-virtual {v1, v5, v2}, Lcom/roidapp/photogrid/release/ps;->a(Landroid/graphics/Bitmap;Z)V

    .line 3605
    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/ao;->f:Z

    .line 3590
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    .line 3607
    :cond_3
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 3608
    const/16 v1, 0x2bf

    iput v1, v0, Landroid/os/Message;->what:I

    .line 3609
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mq;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, v3

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 3610
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mq;->K:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 683
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 684
    if-eqz v0, :cond_5

    .line 685
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 687
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->k:Landroid/widget/RelativeLayout;

    if-nez v0, :cond_e

    .line 688
    const-string v0, "191"

    iget-object v1, p0, Lcom/roidapp/photogrid/release/mq;->h:Landroid/app/Activity;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    goto/16 :goto_0

    .line 4498
    :cond_6
    const/4 v0, 0x0

    .line 4499
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mq;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->f()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v2, v0

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    .line 4504
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mq;->L:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/hv;

    iget-object v4, v1, Lcom/roidapp/photogrid/release/hv;->a:Landroid/graphics/Bitmap;

    .line 4507
    if-eqz v4, :cond_a

    .line 4509
    check-cast v0, Lcom/roidapp/photogrid/release/ps;

    .line 4510
    iget-object v5, v0, Lcom/roidapp/photogrid/release/ps;->H:Lcom/roidapp/photogrid/release/ig;

    .line 4511
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mq;->L:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/hv;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/hv;->d:Ljava/lang/String;

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ps;->g:Ljava/lang/String;

    .line 4515
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ps;->h()Landroid/graphics/drawable/NinePatchDrawable;

    move-result-object v1

    if-nez v1, :cond_7

    .line 4516
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mq;->h:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v6, 0x7f0205c8

    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    check-cast v1, Landroid/graphics/drawable/NinePatchDrawable;

    .line 4517
    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ps;->a(Landroid/graphics/drawable/NinePatchDrawable;)V

    .line 4522
    :cond_7
    iget-boolean v1, v5, Lcom/roidapp/photogrid/release/ig;->z:Z

    if-eqz v1, :cond_8

    .line 4523
    const/4 v1, 0x0

    iput-boolean v1, v5, Lcom/roidapp/photogrid/release/ig;->z:Z

    .line 4528
    const/high16 v1, -0x40800000    # -1.0f

    iput v1, v0, Lcom/roidapp/photogrid/release/ps;->u:F

    .line 4531
    :cond_8
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mq;->j:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v5, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 4532
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mq;->j:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v6, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 4534
    iget v1, v0, Lcom/roidapp/photogrid/release/ps;->u:F

    const/high16 v7, -0x40800000    # -1.0f

    cmpl-float v1, v1, v7

    if-nez v1, :cond_c

    .line 4536
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    if-le v1, v7, :cond_b

    .line 4537
    iget-object v1, v0, Lcom/roidapp/photogrid/release/ps;->I:Lcom/roidapp/photogrid/release/lc;

    iget v1, v1, Lcom/roidapp/photogrid/release/lc;->n:F

    iget v7, v0, Lcom/roidapp/photogrid/release/ps;->d:I

    int-to-float v7, v7

    mul-float/2addr v1, v7

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    int-to-float v7, v7

    const/high16 v8, 0x41800000    # 16.0f

    iget v9, v0, Lcom/roidapp/photogrid/release/ps;->i:F

    mul-float/2addr v8, v9

    add-float/2addr v7, v8

    div-float/2addr v1, v7

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    div-int/2addr v7, v8

    div-int/lit8 v7, v7, 0xa

    add-int/lit8 v7, v7, 0x1

    int-to-float v7, v7

    mul-float/2addr v1, v7

    .line 4543
    :goto_3
    iput v1, v0, Lcom/roidapp/photogrid/release/ps;->u:F

    .line 4544
    iput v1, v0, Lcom/roidapp/photogrid/release/ps;->h:F

    .line 4555
    :cond_9
    :goto_4
    int-to-float v1, v5

    iget v7, v0, Lcom/roidapp/photogrid/release/ps;->c:I

    int-to-float v7, v7

    div-float/2addr v1, v7

    .line 4556
    int-to-float v7, v6

    iget v8, v0, Lcom/roidapp/photogrid/release/ps;->d:I

    int-to-float v8, v8

    div-float/2addr v7, v8

    .line 4557
    iget v8, v0, Lcom/roidapp/photogrid/release/ps;->j:F

    mul-float/2addr v1, v8

    .line 4558
    iget v8, v0, Lcom/roidapp/photogrid/release/ps;->k:F

    mul-float/2addr v7, v8

    .line 4559
    const/4 v8, 0x0

    iput v8, v0, Lcom/roidapp/photogrid/release/ps;->j:F

    .line 4560
    const/4 v8, 0x0

    iput v8, v0, Lcom/roidapp/photogrid/release/ps;->k:F

    .line 4561
    invoke-virtual {v0, v1, v7}, Lcom/roidapp/photogrid/release/ps;->b(FF)V

    .line 4564
    iput v5, v0, Lcom/roidapp/photogrid/release/ps;->c:I

    .line 4565
    iput v6, v0, Lcom/roidapp/photogrid/release/ps;->d:I

    .line 4568
    const/4 v1, 0x0

    invoke-virtual {v0, v4, v1}, Lcom/roidapp/photogrid/release/ps;->a(Landroid/graphics/Bitmap;Z)V

    .line 4569
    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/ps;->f:Z

    .line 4581
    :cond_a
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    .line 4582
    goto/16 :goto_2

    .line 4540
    :cond_b
    iget-object v1, v0, Lcom/roidapp/photogrid/release/ps;->I:Lcom/roidapp/photogrid/release/lc;

    iget v1, v1, Lcom/roidapp/photogrid/release/lc;->n:F

    iget v7, v0, Lcom/roidapp/photogrid/release/ps;->c:I

    int-to-float v7, v7

    mul-float/2addr v1, v7

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    int-to-float v7, v7

    const/high16 v8, 0x41800000    # 16.0f

    iget v9, v0, Lcom/roidapp/photogrid/release/ps;->i:F

    mul-float/2addr v8, v9

    add-float/2addr v7, v8

    div-float/2addr v1, v7

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    div-int/2addr v7, v8

    div-int/lit8 v7, v7, 0xa

    add-int/lit8 v7, v7, 0x1

    int-to-float v7, v7

    mul-float/2addr v1, v7

    goto :goto_3

    .line 4547
    :cond_c
    iget v1, v0, Lcom/roidapp/photogrid/release/ps;->c:I

    if-ne v1, v5, :cond_d

    iget v1, v0, Lcom/roidapp/photogrid/release/ps;->d:I

    if-eq v1, v6, :cond_9

    .line 4548
    :cond_d
    int-to-float v1, v5

    iget v7, p0, Lcom/roidapp/photogrid/release/mq;->w:I

    int-to-float v7, v7

    div-float/2addr v1, v7

    .line 4549
    iget v7, v0, Lcom/roidapp/photogrid/release/ps;->u:F

    mul-float/2addr v1, v7

    iput v1, v0, Lcom/roidapp/photogrid/release/ps;->h:F

    goto :goto_4

    .line 691
    :cond_e
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->k:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/mq;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 693
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 694
    if-eqz v0, :cond_f

    .line 695
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mq;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 697
    :cond_f
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->k:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/mq;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 698
    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 699
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/roidapp/photogrid/release/mq;->h:Landroid/app/Activity;

    invoke-virtual {v4}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f09010a

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 700
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 701
    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->removeAllViews()V

    .line 702
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->j:Landroid/view/ViewGroup;

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    goto/16 :goto_0
.end method

.method public final b(Z)I
    .locals 1

    .prologue
    .line 753
    const/4 v0, 0x0

    return v0
.end method

.method public final b()V
    .locals 3

    .prologue
    .line 707
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/mq;->H:Z

    .line 708
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->j:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 709
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 4719
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->L:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    .line 4720
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mq;->L:Ljava/util/ArrayList;

    monitor-enter v1

    .line 4721
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->L:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/hv;

    .line 4722
    if-eqz v0, :cond_1

    .line 4723
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/hv;->b()V

    goto :goto_0

    .line 4728
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 4727
    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->L:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4728
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    return-void
.end method

.method public final b(II)V
    .locals 0

    .prologue
    .line 761
    return-void
.end method

.method public final b(IZ)V
    .locals 0

    .prologue
    .line 784
    return-void
.end method

.method public final c(I)V
    .locals 0

    .prologue
    .line 773
    return-void
.end method

.method public final c(II)V
    .locals 0

    .prologue
    .line 767
    return-void
.end method

.method public final c(Z)V
    .locals 2

    .prologue
    .line 245
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->D:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_1

    .line 246
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->f()Ljava/util/List;

    move-result-object v0

    .line 247
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    .line 248
    check-cast v0, Lcom/roidapp/photogrid/release/ps;

    .line 249
    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/release/ps;->b(Z)V

    goto :goto_0

    .line 251
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    .line 253
    :cond_1
    return-void
.end method

.method public final f()V
    .locals 2

    .prologue
    .line 733
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->A:Ljava/util/List;

    if-nez v0, :cond_0

    .line 734
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/mq;->A:Ljava/util/List;

    .line 736
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->D:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_2

    .line 737
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->z:Ljava/util/List;

    if-nez v0, :cond_1

    .line 738
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/mq;->z:Ljava/util/List;

    .line 740
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->z:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/mq;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->e()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 741
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/mq;->z:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->j(Ljava/util/List;)V

    .line 743
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->E:Lcom/roidapp/photogrid/release/az;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 744
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->A:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/mq;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 745
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/mq;->A:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->e(Ljava/util/List;)V

    .line 746
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mq;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 748
    :cond_3
    return-void
.end method
