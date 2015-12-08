.class public final Lcom/roidapp/photogrid/release/na;
.super Lcom/roidapp/photogrid/release/mm;
.source "SourceFile"


# direct methods
.method public constructor <init>(ZLandroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/az;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 43
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/mm;-><init>()V

    .line 45
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/na;->F:Z

    .line 48
    iput-object p2, p0, Lcom/roidapp/photogrid/release/na;->h:Landroid/app/Activity;

    .line 49
    iput-object p3, p0, Lcom/roidapp/photogrid/release/na;->i:[Lcom/roidapp/photogrid/release/ig;

    .line 50
    iput-object p4, p0, Lcom/roidapp/photogrid/release/na;->l:Lcom/roidapp/photogrid/release/ml;

    .line 51
    iput-object p5, p0, Lcom/roidapp/photogrid/release/na;->D:Lcom/roidapp/photogrid/release/PhotoView;

    .line 52
    iput-object p6, p0, Lcom/roidapp/photogrid/release/na;->E:Lcom/roidapp/photogrid/release/az;

    .line 53
    invoke-virtual {p2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setFormat(I)V

    .line 54
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    .line 56
    if-eqz p1, :cond_1

    .line 57
    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->d(Z)V

    .line 59
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v1

    if-ne v1, v4, :cond_5

    .line 60
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ax()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 61
    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, v3

    iput-boolean v3, v1, Lcom/roidapp/photogrid/release/ig;->B:Z

    .line 66
    :goto_0
    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    .line 67
    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->c(I)V

    .line 72
    :cond_0
    :goto_1
    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->f(Z)V

    .line 74
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aI()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 75
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v1

    iget-object v1, v1, Lcom/roidapp/photogrid/common/aj;->a:[I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/na;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    aget v1, v1, v2

    .line 76
    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->k(I)V

    .line 77
    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->i(I)V

    .line 78
    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->r(I)V

    .line 84
    :goto_2
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->A()I

    move-result v1

    if-eqz v1, :cond_7

    .line 85
    const v1, 0x3fb9999a    # 1.45f

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    .line 89
    :goto_3
    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/ih;->f(F)V

    .line 93
    :cond_1
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_2

    .line 94
    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, v3

    iput-boolean v3, v1, Lcom/roidapp/photogrid/release/ig;->B:Z

    .line 97
    :cond_2
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->w()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 98
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->w()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/photogrid/release/na;->z:Ljava/util/List;

    .line 107
    :cond_3
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->I()I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/na;->m:I

    .line 108
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->x()I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/na;->s:I

    .line 109
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->A()I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/na;->r:I

    .line 110
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->y()I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/na;->t:I

    .line 111
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->z()I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/na;->u:I

    .line 113
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->m()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/photogrid/release/na;->A:Ljava/util/List;

    .line 114
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->be()Z

    move-result v1

    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/na;->I:Z

    .line 115
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->bd()I

    move-result v0

    div-int/lit8 v0, v0, 0x5

    iput v0, p0, Lcom/roidapp/photogrid/release/na;->J:I

    .line 117
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->b:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/na;->B:[I

    .line 118
    return-void

    .line 63
    :cond_4
    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, v3

    iput-boolean v4, v1, Lcom/roidapp/photogrid/release/ig;->B:Z

    goto/16 :goto_0

    .line 68
    :cond_5
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    .line 69
    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, v3

    iput-boolean v3, v1, Lcom/roidapp/photogrid/release/ig;->B:Z

    .line 70
    const/4 v1, -0x2

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->c(I)V

    goto/16 :goto_1

    .line 80
    :cond_6
    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->i(I)V

    .line 81
    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->r(I)V

    goto/16 :goto_2

    .line 87
    :cond_7
    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    goto :goto_3
.end method

.method private a(Landroid/widget/RelativeLayout;)V
    .locals 6

    .prologue
    .line 551
    :try_start_0
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->j:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/na;->p:Landroid/widget/LinearLayout;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/na;->h:Landroid/app/Activity;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/na;->i:[Lcom/roidapp/photogrid/release/ig;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/na;->y:Ljava/util/ArrayList;

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/view/View;Landroid/widget/RelativeLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 557
    :goto_0
    return-void

    .line 553
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserException;->printStackTrace()V

    goto :goto_0

    .line 555
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/na;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/na;->n()V

    return-void
.end method

.method private d(II)V
    .locals 13

    .prologue
    .line 452
    iget-object v4, p0, Lcom/roidapp/photogrid/release/na;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v5, v4

    const/4 v0, 0x0

    move v3, v0

    :goto_0
    if-ge v3, v5, :cond_c

    aget-object v0, v4, v3

    .line 453
    iget-object v6, v0, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    .line 455
    if-nez v6, :cond_0

    .line 456
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "data null"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 462
    :cond_0
    int-to-float v0, p1

    iget v1, v6, Lcom/roidapp/photogrid/release/lc;->j:F

    mul-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 463
    int-to-float v0, p2

    iget v1, v6, Lcom/roidapp/photogrid/release/lc;->k:F

    mul-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v7

    .line 464
    int-to-float v0, p1

    iget v1, v6, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    add-int/2addr v0, v2

    .line 465
    int-to-float v1, p2

    iget v8, v6, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v1, v8

    const/high16 v8, 0x42c80000    # 100.0f

    div-float/2addr v1, v8

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    add-int/2addr v1, v7

    .line 467
    iget-boolean v8, v6, Lcom/roidapp/photogrid/release/lc;->f:Z

    if-eqz v8, :cond_6

    .line 468
    new-instance v8, Landroid/graphics/Path;

    invoke-direct {v8}, Landroid/graphics/Path;-><init>()V

    .line 469
    iget-object v0, v6, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    .line 470
    iget v1, v0, Landroid/graphics/PointF;->x:F

    int-to-float v9, p1

    mul-float/2addr v1, v9

    const/high16 v9, 0x42c80000    # 100.0f

    div-float/2addr v1, v9

    int-to-float v9, v2

    add-float/2addr v1, v9

    iget v0, v0, Landroid/graphics/PointF;->y:F

    int-to-float v9, p2

    mul-float/2addr v0, v9

    const/high16 v9, 0x42c80000    # 100.0f

    div-float/2addr v0, v9

    int-to-float v9, v7

    add-float/2addr v0, v9

    invoke-virtual {v8, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 472
    const/4 v0, 0x1

    move v1, v0

    :goto_1
    iget-object v0, v6, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 473
    iget-object v0, v6, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    .line 474
    iget v9, v0, Landroid/graphics/PointF;->x:F

    int-to-float v10, p1

    mul-float/2addr v9, v10

    const/high16 v10, 0x42c80000    # 100.0f

    div-float/2addr v9, v10

    int-to-float v10, v2

    add-float/2addr v9, v10

    iget v0, v0, Landroid/graphics/PointF;->y:F

    int-to-float v10, p2

    mul-float/2addr v0, v10

    const/high16 v10, 0x42c80000    # 100.0f

    div-float/2addr v0, v10

    int-to-float v10, v7

    add-float/2addr v0, v10

    invoke-virtual {v8, v9, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 472
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 476
    :cond_1
    invoke-virtual {v8}, Landroid/graphics/Path;->close()V

    .line 477
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 478
    const/4 v1, 0x1

    invoke-virtual {v8, v0, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 479
    iget-object v1, v6, Lcom/roidapp/photogrid/release/lc;->p:Landroid/graphics/Region;

    new-instance v2, Landroid/graphics/Region;

    iget v7, v0, Landroid/graphics/RectF;->left:F

    float-to-int v7, v7

    iget v9, v0, Landroid/graphics/RectF;->top:F

    float-to-int v9, v9

    iget v10, v0, Landroid/graphics/RectF;->right:F

    float-to-int v10, v10

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    float-to-int v0, v0

    invoke-direct {v2, v7, v9, v10, v0}, Landroid/graphics/Region;-><init>(IIII)V

    invoke-virtual {v1, v8, v2}, Landroid/graphics/Region;->setPath(Landroid/graphics/Path;Landroid/graphics/Region;)Z

    .line 485
    :goto_2
    new-instance v7, Landroid/graphics/Path;

    invoke-direct {v7}, Landroid/graphics/Path;-><init>()V

    .line 487
    iget-object v8, v6, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 488
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    .line 489
    iget-object v0, v6, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    iget v10, v0, Landroid/graphics/PointF;->x:F

    .line 490
    iget-object v0, v6, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    iget v11, v0, Landroid/graphics/PointF;->y:F

    .line 492
    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 493
    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 495
    cmpg-float v2, v1, v10

    if-gez v2, :cond_7

    .line 496
    int-to-float v2, p1

    mul-float/2addr v1, v2

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v1, v2

    .line 500
    :goto_3
    cmpg-float v2, v0, v11

    if-gez v2, :cond_8

    .line 501
    int-to-float v2, p2

    mul-float/2addr v0, v2

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v0, v2

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v0, v2

    .line 508
    :goto_4
    const/4 v2, 0x0

    cmpg-float v2, v1, v2

    if-gez v2, :cond_2

    .line 509
    const/4 v1, 0x0

    .line 511
    :cond_2
    const/4 v2, 0x0

    cmpg-float v2, v0, v2

    if-gez v2, :cond_3

    .line 512
    const/4 v0, 0x0

    .line 514
    :cond_3
    invoke-virtual {v7, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 516
    const/4 v0, 0x1

    move v2, v0

    :goto_5
    if-ge v2, v9, :cond_b

    .line 517
    invoke-interface {v8, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    .line 518
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 519
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 521
    cmpg-float v12, v1, v10

    if-gez v12, :cond_9

    .line 522
    int-to-float v12, p1

    mul-float/2addr v1, v12

    const/high16 v12, 0x42c80000    # 100.0f

    div-float/2addr v1, v12

    const/high16 v12, 0x3f800000    # 1.0f

    sub-float/2addr v1, v12

    .line 526
    :goto_6
    cmpg-float v12, v0, v11

    if-gez v12, :cond_a

    .line 527
    int-to-float v12, p2

    mul-float/2addr v0, v12

    const/high16 v12, 0x42c80000    # 100.0f

    div-float/2addr v0, v12

    const/high16 v12, 0x3f800000    # 1.0f

    sub-float/2addr v0, v12

    .line 532
    :goto_7
    const/4 v12, 0x0

    cmpg-float v12, v1, v12

    if-gez v12, :cond_4

    .line 533
    const/4 v1, 0x0

    .line 535
    :cond_4
    const/4 v12, 0x0

    cmpg-float v12, v0, v12

    if-gez v12, :cond_5

    .line 536
    const/4 v0, 0x0

    .line 538
    :cond_5
    invoke-virtual {v7, v1, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 516
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_5

    .line 481
    :cond_6
    iget-object v8, v6, Lcom/roidapp/photogrid/release/lc;->p:Landroid/graphics/Region;

    invoke-virtual {v8, v2, v7, v0, v1}, Landroid/graphics/Region;->set(IIII)Z

    goto/16 :goto_2

    .line 498
    :cond_7
    int-to-float v2, p1

    mul-float/2addr v1, v2

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x3f800000    # 1.0f

    add-float/2addr v1, v2

    goto :goto_3

    .line 503
    :cond_8
    int-to-float v2, p2

    mul-float/2addr v0, v2

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v0, v2

    const/high16 v2, 0x3f800000    # 1.0f

    add-float/2addr v0, v2

    goto :goto_4

    .line 524
    :cond_9
    int-to-float v12, p1

    mul-float/2addr v1, v12

    const/high16 v12, 0x42c80000    # 100.0f

    div-float/2addr v1, v12

    const/high16 v12, 0x3f800000    # 1.0f

    add-float/2addr v1, v12

    goto :goto_6

    .line 529
    :cond_a
    int-to-float v12, p2

    mul-float/2addr v0, v12

    const/high16 v12, 0x42c80000    # 100.0f

    div-float/2addr v0, v12

    const/high16 v12, 0x3f800000    # 1.0f

    add-float/2addr v0, v12

    goto :goto_7

    .line 540
    :cond_b
    invoke-virtual {v7}, Landroid/graphics/Path;->close()V

    .line 541
    iput-object v7, v6, Lcom/roidapp/photogrid/release/lc;->a:Landroid/graphics/Path;

    .line 452
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto/16 :goto_0

    .line 543
    :cond_c
    return-void
.end method

.method private m()V
    .locals 11

    .prologue
    const/4 v10, 0x0

    .line 565
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->D:Lcom/roidapp/photogrid/release/PhotoView;

    if-nez v0, :cond_1

    .line 641
    :cond_0
    return-void

    .line 570
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->z:Ljava/util/List;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_8

    .line 571
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_4

    .line 572
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    .line 577
    instance-of v2, v0, Lcom/roidapp/photogrid/release/ps;

    if-nez v2, :cond_2

    .line 580
    iput-boolean v10, v0, Lcom/roidapp/photogrid/release/ao;->f:Z

    .line 581
    iget-object v2, p0, Lcom/roidapp/photogrid/release/na;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/release/PhotoView;->a(Lcom/roidapp/photogrid/release/ao;)V

    goto :goto_0

    .line 583
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->h:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i()V

    .line 586
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 590
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->A:Ljava/util/List;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->A:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 591
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->E:Lcom/roidapp/photogrid/release/az;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_5

    .line 592
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->A:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 594
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->A:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 599
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 600
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v3, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 603
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_7
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    .line 604
    instance-of v1, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v1, :cond_9

    move-object v1, v0

    .line 605
    check-cast v1, Lcom/roidapp/photogrid/release/ra;

    .line 606
    iget v5, v1, Lcom/roidapp/photogrid/release/ra;->j:F

    .line 607
    iget v6, v1, Lcom/roidapp/photogrid/release/ra;->k:F

    .line 611
    int-to-float v7, v2

    iget v8, v1, Lcom/roidapp/photogrid/release/ra;->c:I

    int-to-float v8, v8

    div-float/2addr v7, v8

    .line 612
    int-to-float v8, v3

    iget v9, v1, Lcom/roidapp/photogrid/release/ra;->d:I

    int-to-float v9, v9

    div-float/2addr v8, v9

    .line 614
    mul-float v9, v5, v7

    .line 615
    mul-float/2addr v8, v6

    .line 617
    iput v2, v1, Lcom/roidapp/photogrid/release/ra;->c:I

    .line 618
    iput v3, v1, Lcom/roidapp/photogrid/release/ra;->d:I

    .line 619
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ra;->i()V

    .line 622
    neg-float v5, v5

    neg-float v6, v6

    invoke-virtual {v1, v5, v6}, Lcom/roidapp/photogrid/release/ra;->b(FF)V

    .line 624
    iget v5, v1, Lcom/roidapp/photogrid/release/ra;->h:F

    .line 625
    mul-float/2addr v5, v7

    iget v6, v1, Lcom/roidapp/photogrid/release/ra;->l:F

    invoke-virtual {v1, v5, v6, v9, v8}, Lcom/roidapp/photogrid/release/ra;->b(FFFF)V

    move-object v1, v0

    .line 626
    check-cast v1, Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ra;->j()V

    .line 627
    iput-boolean v10, v0, Lcom/roidapp/photogrid/release/ao;->f:Z

    goto :goto_2

    .line 588
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->h:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i()V

    goto/16 :goto_1

    .line 628
    :cond_9
    instance-of v1, v0, Lcom/roidapp/photogrid/release/qz;

    if-eqz v1, :cond_7

    .line 630
    check-cast v0, Lcom/roidapp/photogrid/release/qz;

    .line 632
    iget v1, v0, Lcom/roidapp/photogrid/release/qz;->c:I

    if-lez v1, :cond_a

    iget v1, v0, Lcom/roidapp/photogrid/release/qz;->d:I

    if-lez v1, :cond_a

    .line 633
    iget v1, v0, Lcom/roidapp/photogrid/release/qz;->j:F

    int-to-float v5, v2

    iget v6, v0, Lcom/roidapp/photogrid/release/qz;->c:I

    int-to-float v6, v6

    div-float/2addr v5, v6

    mul-float/2addr v1, v5

    iput v1, v0, Lcom/roidapp/photogrid/release/qz;->j:F

    .line 634
    iget v1, v0, Lcom/roidapp/photogrid/release/qz;->k:F

    int-to-float v5, v3

    iget v6, v0, Lcom/roidapp/photogrid/release/qz;->d:I

    int-to-float v6, v6

    div-float/2addr v5, v6

    mul-float/2addr v1, v5

    iput v1, v0, Lcom/roidapp/photogrid/release/qz;->k:F

    .line 636
    :cond_a
    iput v2, v0, Lcom/roidapp/photogrid/release/qz;->c:I

    .line 637
    iput v3, v0, Lcom/roidapp/photogrid/release/qz;->d:I

    .line 638
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/qz;->g()V

    goto :goto_2
.end method

.method private n()V
    .locals 3

    .prologue
    .line 729
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->y:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 730
    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->y:Ljava/util/ArrayList;

    monitor-enter v1

    .line 731
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ic;

    .line 732
    if-eqz v0, :cond_0

    .line 733
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ic;->a()V

    goto :goto_0

    .line 738
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 737
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 738
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 740
    :cond_2
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 11

    .prologue
    const/high16 v10, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    const/4 v9, 0x1

    .line 246
    :try_start_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/na;->n()V

    .line 247
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xb

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 1121
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->j:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 1122
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 1125
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 1127
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v4

    .line 1128
    new-instance v5, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v5}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 1129
    const/4 v0, 0x1

    iput-boolean v0, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 1130
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->i:[Lcom/roidapp/photogrid/release/ig;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->i:[Lcom/roidapp/photogrid/release/ig;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    move-object v3, v0

    .line 1131
    :goto_0
    invoke-static {v3, v5}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 1132
    iget v0, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    int-to-float v1, v0

    .line 1133
    iget v0, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    int-to-float v0, v0

    .line 1134
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v6

    invoke-virtual {v6}, Lcom/roidapp/photogrid/release/ih;->t()F

    .line 1135
    cmpl-float v6, v1, v2

    if-nez v6, :cond_1

    cmpl-float v6, v0, v2

    if-eqz v6, :cond_3

    .line 1138
    :cond_1
    invoke-static {v3}, Lcom/roidapp/photogrid/common/bb;->a(Ljava/lang/String;)I

    move-result v3

    div-int/lit8 v3, v3, 0x5a

    rem-int/lit8 v3, v3, 0x2

    if-ne v3, v9, :cond_2

    .line 1139
    iget v0, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    int-to-float v1, v0

    .line 1140
    iget v0, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    int-to-float v0, v0

    .line 1143
    :cond_2
    const/4 v3, 0x0

    aget-object v3, v4, v3

    iget v3, v3, Lcom/roidapp/photogrid/release/ig;->q:I

    rem-int/lit16 v3, v3, 0xb4

    if-eqz v3, :cond_b

    .line 1144
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    div-float/2addr v0, v1

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    .line 1153
    :cond_3
    :goto_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->t()F

    move-result v3

    .line 1156
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v0, p0, Lcom/roidapp/photogrid/release/na;->x:I

    .line 1157
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/roidapp/photogrid/release/na;->w:I

    .line 1158
    iget v0, p0, Lcom/roidapp/photogrid/release/na;->x:I

    iget v1, p0, Lcom/roidapp/photogrid/release/na;->w:I

    if-ge v0, v1, :cond_4

    .line 1159
    iget v0, p0, Lcom/roidapp/photogrid/release/na;->x:I

    .line 1160
    iget v1, p0, Lcom/roidapp/photogrid/release/na;->w:I

    iput v1, p0, Lcom/roidapp/photogrid/release/na;->x:I

    .line 1161
    iput v0, p0, Lcom/roidapp/photogrid/release/na;->w:I

    .line 1165
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0900dd

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    .line 1166
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f090058

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    .line 1167
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f090057

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    .line 1169
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->h:Landroid/app/Activity;

    const v6, 0x7f0d0085

    invoke-virtual {v0, v6}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    .line 1170
    if-eqz v6, :cond_5

    .line 1171
    invoke-static {}, Lcom/roidapp/photogrid/common/a;->a()Lcom/roidapp/photogrid/common/a;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->h:Landroid/app/Activity;

    const-string v7, "grid"

    const/4 v8, 0x1

    invoke-static {v0, v7, v8}, Lcom/roidapp/photogrid/common/a;->a(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->h:Landroid/app/Activity;

    invoke-static {v0}, Lcom/roidapp/photogrid/a/m;->a(Landroid/content/Context;)I

    move-result v0

    if-eq v0, v9, :cond_e

    .line 1172
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->B:Z

    if-nez v0, :cond_d

    .line 1173
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1175
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->h:Landroid/app/Activity;

    instance-of v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_5

    .line 1176
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->h:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 1177
    iget-boolean v7, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->F:Z

    if-eqz v7, :cond_5

    .line 1178
    const/4 v7, 0x0

    iput-boolean v7, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->F:Z

    .line 1179
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->C()V

    .line 1189
    :cond_5
    :goto_2
    if-eqz v6, :cond_f

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_f

    .line 1190
    const v0, 0x7f0d0086

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 1191
    if-eqz v0, :cond_16

    .line 1192
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1193
    if-lez v0, :cond_16

    .line 1194
    int-to-float v0, v0

    .line 1203
    :goto_3
    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->h:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0900cb

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    .line 1204
    iget v2, p0, Lcom/roidapp/photogrid/release/na;->x:I

    int-to-float v2, v2

    sub-float/2addr v2, v4

    sub-float/2addr v2, v5

    sub-float v0, v2, v0

    sub-float/2addr v0, v1

    sget v1, Lcom/roidapp/photogrid/common/az;->g:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    float-to-int v1, v0

    .line 1207
    iget v0, p0, Lcom/roidapp/photogrid/release/na;->w:I

    int-to-float v0, v0

    int-to-float v2, v1

    div-float/2addr v0, v2

    .line 1208
    cmpg-float v0, v3, v0

    if-gez v0, :cond_10

    .line 1210
    int-to-float v0, v1

    mul-float/2addr v0, v3

    float-to-int v0, v0

    .line 1215
    :goto_4
    int-to-float v0, v0

    iget v2, p0, Lcom/roidapp/photogrid/release/na;->C:F

    mul-float/2addr v0, v2

    float-to-int v2, v0

    .line 1216
    int-to-float v0, v1

    iget v1, p0, Lcom/roidapp/photogrid/release/na;->C:F

    mul-float/2addr v0, v1

    float-to-int v1, v0

    .line 1218
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->h:Landroid/app/Activity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v3, 0x7f03000c

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/na;->j:Landroid/view/ViewGroup;

    .line 1219
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v3, -0x1

    const/4 v4, -0x1

    invoke-direct {v0, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 1220
    iput v2, v0, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 1221
    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 1222
    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->j:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1224
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->j:Landroid/view/ViewGroup;

    const v1, 0x7f0d0061

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/na;->k:Landroid/widget/RelativeLayout;

    .line 1226
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->j:Landroid/view/ViewGroup;

    const v1, 0x7f0d0060

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/na;->p:Landroid/widget/LinearLayout;

    .line 1227
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 1239
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/na;->q:Lcom/roidapp/photogrid/release/an;

    .line 249
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xc

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 250
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1333
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aL()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_11

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aM()Z

    move-result v0

    if-eqz v0, :cond_11

    .line 1334
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->y:Ljava/util/ArrayList;

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->aL()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/rf;->a(Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 1335
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->k(Ljava/lang/String;)V

    .line 1336
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->r(Z)V

    .line 251
    :goto_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xd

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 252
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->k:Landroid/widget/RelativeLayout;

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/na;->a(Landroid/widget/RelativeLayout;)V

    .line 253
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xe

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 1424
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v0, p0, Lcom/roidapp/photogrid/release/na;->n:I

    .line 1425
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v0, p0, Lcom/roidapp/photogrid/release/na;->o:I

    .line 1426
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->q:Lcom/roidapp/photogrid/release/an;

    if-nez v0, :cond_7

    .line 1427
    new-instance v0, Lcom/roidapp/photogrid/release/an;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->h:Landroid/app/Activity;

    iget v2, p0, Lcom/roidapp/photogrid/release/na;->n:I

    iget v3, p0, Lcom/roidapp/photogrid/release/na;->o:I

    invoke-direct {v0, v1, v2, v3}, Lcom/roidapp/photogrid/release/an;-><init>(Landroid/content/Context;II)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/na;->q:Lcom/roidapp/photogrid/release/an;

    .line 1428
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->q:Lcom/roidapp/photogrid/release/an;

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->B()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/an;->c(Z)V

    .line 1429
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->be()Z

    move-result v0

    if-eqz v0, :cond_12

    .line 1435
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->q:Lcom/roidapp/photogrid/release/an;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/an;->b(Z)V

    .line 1436
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->h:Landroid/app/Activity;

    if-eqz v0, :cond_6

    .line 1437
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->h:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->bd()I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(IZ)V

    .line 1441
    :cond_6
    :goto_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->q:Lcom/roidapp/photogrid/release/an;

    iget v1, p0, Lcom/roidapp/photogrid/release/na;->r:I

    iget v2, p0, Lcom/roidapp/photogrid/release/na;->s:I

    iget v3, p0, Lcom/roidapp/photogrid/release/na;->t:I

    iget v4, p0, Lcom/roidapp/photogrid/release/na;->u:I

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/release/an;->a(IIII)V

    .line 255
    :cond_7
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xf

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 257
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x10

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 262
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x11

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 2407
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 2408
    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->D:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v1, :cond_8

    .line 2409
    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/PhotoView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2411
    :cond_8
    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->E:Lcom/roidapp/photogrid/release/az;

    if-eqz v1, :cond_9

    .line 2412
    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/az;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 264
    :cond_9
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x12

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 265
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/na;->m()V

    .line 266
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x13

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 267
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/release/na;->d(II)V

    .line 268
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x14

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 269
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->j:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 3354
    new-instance v2, Ljava/lang/Thread;

    new-instance v3, Lcom/roidapp/photogrid/release/nb;

    invoke-direct {v3, p0, v0, v1}, Lcom/roidapp/photogrid/release/nb;-><init>(Lcom/roidapp/photogrid/release/na;II)V

    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 293
    :goto_7
    return-void

    .line 1130
    :cond_a
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->i:[Lcom/roidapp/photogrid/release/ig;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ig;->e()Ljava/lang/String;

    move-result-object v0

    move-object v3, v0

    goto/16 :goto_0

    .line 1147
    :cond_b
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    div-float v0, v1, v0

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/ih;->b(F)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1

    .line 270
    :catch_0
    move-exception v0

    .line 271
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/na;->n()V

    .line 272
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_15

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "bg create decodeBitmap null"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "sticker create bitmap null"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_15

    .line 273
    :cond_c
    iget v1, p0, Lcom/roidapp/photogrid/release/na;->C:F

    cmpl-float v1, v1, v10

    if-nez v1, :cond_13

    .line 274
    const/high16 v0, 0x3f400000    # 0.75f

    iput v0, p0, Lcom/roidapp/photogrid/release/na;->C:F

    .line 275
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->K:Landroid/os/Handler;

    invoke-virtual {v0, v9}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_7

    .line 1183
    :cond_d
    const/16 v0, 0x8

    :try_start_1
    invoke-virtual {v6, v0}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_2

    .line 1186
    :cond_e
    const/16 v0, 0x8

    invoke-virtual {v6, v0}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_2

    :cond_f
    move v0, v2

    .line 1199
    goto/16 :goto_3

    .line 1212
    :cond_10
    iget v0, p0, Lcom/roidapp/photogrid/release/na;->w:I

    .line 1213
    int-to-float v1, v0

    div-float/2addr v1, v3

    float-to-int v1, v1

    goto/16 :goto_4

    .line 1338
    :cond_11
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->h:Landroid/app/Activity;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->y:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/na;->B:[I

    iget v3, p0, Lcom/roidapp/photogrid/release/na;->m:I

    iget-object v4, p0, Lcom/roidapp/photogrid/release/na;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v4, v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;Ljava/util/ArrayList;[III)V

    goto/16 :goto_5

    .line 1439
    :cond_12
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->q:Lcom/roidapp/photogrid/release/an;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/an;->b(Z)V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_6

    .line 277
    :cond_13
    iget v1, p0, Lcom/roidapp/photogrid/release/na;->C:F

    const/high16 v2, 0x3f400000    # 0.75f

    cmpl-float v1, v1, v2

    if-nez v1, :cond_14

    .line 278
    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lcom/roidapp/photogrid/release/na;->C:F

    .line 279
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->K:Landroid/os/Handler;

    invoke-virtual {v0, v9}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_7

    .line 282
    :cond_14
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 283
    iput v10, p0, Lcom/roidapp/photogrid/release/na;->C:F

    .line 284
    const/16 v0, 0x8e

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/na;->d(I)V

    goto/16 :goto_7

    .line 288
    :cond_15
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 289
    iput v10, p0, Lcom/roidapp/photogrid/release/na;->C:F

    .line 290
    const/16 v0, 0x8f

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/na;->d(I)V

    goto/16 :goto_7

    :cond_16
    move v0, v1

    goto/16 :goto_3
.end method

.method public final a(Landroid/widget/RelativeLayout;Landroid/view/View$OnTouchListener;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 645
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/na;->H:Z

    if-eqz v0, :cond_1

    .line 696
    :cond_0
    :goto_0
    return-void

    .line 651
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->q:Lcom/roidapp/photogrid/release/an;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    if-nez v0, :cond_2

    .line 652
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->p:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->q:Lcom/roidapp/photogrid/release/an;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 654
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x4b

    invoke-virtual {v0, v1, v3}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 656
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v1, v1

    if-ne v0, v1, :cond_0

    move v2, v3

    .line 657
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-ge v2, v0, :cond_3

    .line 658
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->k:Landroid/widget/RelativeLayout;

    add-int/lit8 v1, v2, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/if;

    .line 659
    if-nez v0, :cond_8

    .line 660
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/na;->a()V

    .line 674
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->E:Lcom/roidapp/photogrid/release/az;

    if-eqz v0, :cond_5

    .line 675
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 676
    if-eqz v0, :cond_4

    .line 677
    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 679
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->j:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 682
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->D:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_7

    .line 683
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 684
    if-eqz v0, :cond_6

    .line 685
    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 687
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->j:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 690
    :cond_7
    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 691
    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->h:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f09010a

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v0, v3, v3, v3, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 692
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 693
    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->removeAllViews()V

    .line 694
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->j:Landroid/view/ViewGroup;

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 695
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p2}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    goto/16 :goto_0

    .line 663
    :cond_8
    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 664
    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 665
    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/if;->b(Landroid/graphics/Bitmap;)V

    .line 666
    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/if;->a(Landroid/graphics/Bitmap;)V

    .line 667
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->l:Lcom/roidapp/photogrid/release/ml;

    mul-int/lit8 v1, v2, 0x2

    add-int/lit8 v1, v1, 0x4c

    invoke-virtual {v0, v1, v3}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 657
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto/16 :goto_1
.end method

.method public final b(Z)I
    .locals 1

    .prologue
    .line 745
    const/4 v0, 0x0

    return v0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 700
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/na;->H:Z

    .line 701
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->j:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 702
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 704
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/na;->n()V

    .line 705
    return-void
.end method

.method public final b(II)V
    .locals 0

    .prologue
    .line 752
    return-void
.end method

.method public final b(IZ)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    const/4 v4, 0x0

    .line 813
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->y:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 841
    :cond_0
    :goto_0
    return-void

    .line 816
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->j:Landroid/view/ViewGroup;

    add-int/lit8 v1, p1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/if;

    .line 817
    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    .line 818
    iget-object v2, p0, Lcom/roidapp/photogrid/release/na;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput-boolean p2, v2, Lcom/roidapp/photogrid/release/ig;->B:Z

    .line 820
    iget-object v2, p0, Lcom/roidapp/photogrid/release/na;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    const/high16 v3, 0x3f800000    # 1.0f

    iput v3, v2, Lcom/roidapp/photogrid/release/ig;->v:F

    .line 821
    iget-object v2, p0, Lcom/roidapp/photogrid/release/na;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput v4, v2, Lcom/roidapp/photogrid/release/ig;->t:F

    .line 822
    iget-object v2, p0, Lcom/roidapp/photogrid/release/na;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput v4, v2, Lcom/roidapp/photogrid/release/ig;->u:F

    .line 823
    iget-object v2, p0, Lcom/roidapp/photogrid/release/na;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput v5, v2, Lcom/roidapp/photogrid/release/ig;->p:I

    .line 824
    iget-object v2, p0, Lcom/roidapp/photogrid/release/na;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput v5, v2, Lcom/roidapp/photogrid/release/ig;->x:I

    .line 825
    iget-object v2, p0, Lcom/roidapp/photogrid/release/na;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput v6, v2, Lcom/roidapp/photogrid/release/ig;->r:I

    .line 826
    iget-object v2, p0, Lcom/roidapp/photogrid/release/na;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput v6, v2, Lcom/roidapp/photogrid/release/ig;->s:I

    .line 834
    iget-object v2, p0, Lcom/roidapp/photogrid/release/na;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput-object v2, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    .line 835
    iget-object v1, v1, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/if;->a(Landroid/graphics/Bitmap;)V

    goto :goto_0
.end method

.method public final c(I)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 782
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->k:Landroid/widget/RelativeLayout;

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/na;->a(Landroid/widget/RelativeLayout;)V

    .line 783
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/release/na;->d(II)V

    .line 785
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v1, v1

    if-ne v0, v1, :cond_0

    move v2, v3

    .line 786
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-ge v2, v0, :cond_0

    .line 787
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->k:Landroid/widget/RelativeLayout;

    add-int/lit8 v1, v2, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/if;

    .line 788
    if-nez v0, :cond_1

    .line 793
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/na;->a()V

    .line 804
    :cond_0
    return-void

    .line 797
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 798
    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 799
    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/if;->b(Landroid/graphics/Bitmap;)V

    .line 800
    if-ne p1, v4, :cond_2

    move v1, v4

    :goto_1
    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/if;->D:Z

    .line 801
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/if;->invalidate()V

    .line 786
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :cond_2
    move v1, v3

    .line 800
    goto :goto_1
.end method

.method public final c(II)V
    .locals 0

    .prologue
    .line 758
    return-void
.end method

.method public final f()V
    .locals 2

    .prologue
    .line 709
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->A:Ljava/util/List;

    if-nez v0, :cond_0

    .line 710
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/na;->A:Ljava/util/List;

    .line 712
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->D:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_2

    .line 713
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->z:Ljava/util/List;

    if-nez v0, :cond_1

    .line 714
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/na;->z:Ljava/util/List;

    .line 716
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->z:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->e()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 717
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->z:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->j(Ljava/util/List;)V

    .line 719
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->E:Lcom/roidapp/photogrid/release/az;

    if-eqz v0, :cond_3

    .line 720
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->A:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 721
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/na;->A:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->e(Ljava/util/List;)V

    .line 722
    iget-object v0, p0, Lcom/roidapp/photogrid/release/na;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 724
    :cond_3
    return-void
.end method

.method public final l()V
    .locals 0

    .prologue
    .line 417
    invoke-super {p0}, Lcom/roidapp/photogrid/release/mm;->l()V

    .line 418
    return-void
.end method
