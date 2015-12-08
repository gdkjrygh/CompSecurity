.class public final Lcom/roidapp/photogrid/release/nc;
.super Lcom/roidapp/photogrid/release/mm;
.source "SourceFile"


# direct methods
.method public constructor <init>(ZLandroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/az;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    const/4 v3, 0x0

    .line 43
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/mm;-><init>()V

    .line 45
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/nc;->F:Z

    .line 48
    iput-object p2, p0, Lcom/roidapp/photogrid/release/nc;->h:Landroid/app/Activity;

    .line 49
    iput-object p3, p0, Lcom/roidapp/photogrid/release/nc;->i:[Lcom/roidapp/photogrid/release/ig;

    .line 50
    iput-object p4, p0, Lcom/roidapp/photogrid/release/nc;->l:Lcom/roidapp/photogrid/release/ml;

    .line 51
    iput-object p5, p0, Lcom/roidapp/photogrid/release/nc;->D:Lcom/roidapp/photogrid/release/PhotoView;

    .line 52
    iput-object p6, p0, Lcom/roidapp/photogrid/release/nc;->E:Lcom/roidapp/photogrid/release/az;

    .line 53
    invoke-virtual {p2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setFormat(I)V

    .line 54
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    .line 56
    if-eqz p1, :cond_0

    .line 57
    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->d(Z)V

    .line 59
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ax()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 60
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, v3

    iput-boolean v3, v1, Lcom/roidapp/photogrid/release/ig;->B:Z

    .line 65
    :goto_0
    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    .line 66
    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->c(I)V

    .line 68
    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->f(Z)V

    .line 70
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aI()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 71
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v1

    iget-object v1, v1, Lcom/roidapp/photogrid/common/aj;->a:[I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/nc;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    aget v1, v1, v2

    .line 72
    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/ih;->k(I)V

    .line 73
    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->i(I)V

    .line 74
    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->r(I)V

    .line 80
    :goto_1
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->A()I

    move-result v1

    if-eqz v1, :cond_5

    .line 81
    const v1, 0x3fb9999a    # 1.45f

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    .line 85
    :goto_2
    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->f(F)V

    .line 90
    :cond_0
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_1

    .line 91
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, v3

    iput-boolean v3, v1, Lcom/roidapp/photogrid/release/ig;->B:Z

    .line 94
    :cond_1
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->w()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 95
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->w()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/photogrid/release/nc;->z:Ljava/util/List;

    .line 104
    :cond_2
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->I()I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/nc;->m:I

    .line 105
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->x()I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/nc;->s:I

    .line 106
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->A()I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/nc;->r:I

    .line 107
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->y()I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/nc;->t:I

    .line 108
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->z()I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/nc;->u:I

    .line 110
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->m()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/photogrid/release/nc;->A:Ljava/util/List;

    .line 111
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->be()Z

    move-result v1

    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/nc;->I:Z

    .line 112
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->bd()I

    move-result v0

    div-int/lit8 v0, v0, 0x5

    iput v0, p0, Lcom/roidapp/photogrid/release/nc;->J:I

    .line 114
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->b:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/nc;->B:[I

    .line 115
    return-void

    .line 62
    :cond_3
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, v3

    iput-boolean v5, v1, Lcom/roidapp/photogrid/release/ig;->B:Z

    goto/16 :goto_0

    .line 76
    :cond_4
    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->i(I)V

    .line 77
    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->r(I)V

    goto :goto_1

    .line 83
    :cond_5
    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    goto :goto_2
.end method

.method private a(Landroid/widget/RelativeLayout;)V
    .locals 6

    .prologue
    .line 548
    :try_start_0
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->j:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/nc;->p:Landroid/widget/LinearLayout;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/nc;->h:Landroid/app/Activity;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/nc;->i:[Lcom/roidapp/photogrid/release/ig;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/nc;->y:Ljava/util/ArrayList;

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/view/View;Landroid/widget/RelativeLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 554
    :goto_0
    return-void

    .line 550
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserException;->printStackTrace()V

    goto :goto_0

    .line 552
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/nc;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/nc;->n()V

    return-void
.end method

.method private d(II)V
    .locals 13

    .prologue
    .line 449
    iget-object v4, p0, Lcom/roidapp/photogrid/release/nc;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v5, v4

    const/4 v0, 0x0

    move v3, v0

    :goto_0
    if-ge v3, v5, :cond_c

    aget-object v0, v4, v3

    .line 450
    iget-object v6, v0, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    .line 452
    if-nez v6, :cond_0

    .line 453
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "data null"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 459
    :cond_0
    int-to-float v0, p1

    iget v1, v6, Lcom/roidapp/photogrid/release/lc;->j:F

    mul-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 460
    int-to-float v0, p2

    iget v1, v6, Lcom/roidapp/photogrid/release/lc;->k:F

    mul-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v7

    .line 461
    int-to-float v0, p1

    iget v1, v6, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    add-int/2addr v0, v2

    .line 462
    int-to-float v1, p2

    iget v8, v6, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v1, v8

    const/high16 v8, 0x42c80000    # 100.0f

    div-float/2addr v1, v8

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    add-int/2addr v1, v7

    .line 464
    iget-boolean v8, v6, Lcom/roidapp/photogrid/release/lc;->f:Z

    if-eqz v8, :cond_6

    .line 465
    new-instance v8, Landroid/graphics/Path;

    invoke-direct {v8}, Landroid/graphics/Path;-><init>()V

    .line 466
    iget-object v0, v6, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    .line 467
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

    .line 469
    const/4 v0, 0x1

    move v1, v0

    :goto_1
    iget-object v0, v6, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 470
    iget-object v0, v6, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    .line 471
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

    .line 469
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 473
    :cond_1
    invoke-virtual {v8}, Landroid/graphics/Path;->close()V

    .line 474
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 475
    const/4 v1, 0x1

    invoke-virtual {v8, v0, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 476
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

    .line 482
    :goto_2
    new-instance v7, Landroid/graphics/Path;

    invoke-direct {v7}, Landroid/graphics/Path;-><init>()V

    .line 484
    iget-object v8, v6, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 485
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    .line 486
    iget-object v0, v6, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    iget v10, v0, Landroid/graphics/PointF;->x:F

    .line 487
    iget-object v0, v6, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    iget v11, v0, Landroid/graphics/PointF;->y:F

    .line 489
    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 490
    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 492
    cmpg-float v2, v1, v10

    if-gez v2, :cond_7

    .line 493
    int-to-float v2, p1

    mul-float/2addr v1, v2

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v1, v2

    .line 497
    :goto_3
    cmpg-float v2, v0, v11

    if-gez v2, :cond_8

    .line 498
    int-to-float v2, p2

    mul-float/2addr v0, v2

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v0, v2

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v0, v2

    .line 505
    :goto_4
    const/4 v2, 0x0

    cmpg-float v2, v1, v2

    if-gez v2, :cond_2

    .line 506
    const/4 v1, 0x0

    .line 508
    :cond_2
    const/4 v2, 0x0

    cmpg-float v2, v0, v2

    if-gez v2, :cond_3

    .line 509
    const/4 v0, 0x0

    .line 511
    :cond_3
    invoke-virtual {v7, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 513
    const/4 v0, 0x1

    move v2, v0

    :goto_5
    if-ge v2, v9, :cond_b

    .line 514
    invoke-interface {v8, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    .line 515
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 516
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 518
    cmpg-float v12, v1, v10

    if-gez v12, :cond_9

    .line 519
    int-to-float v12, p1

    mul-float/2addr v1, v12

    const/high16 v12, 0x42c80000    # 100.0f

    div-float/2addr v1, v12

    const/high16 v12, 0x3f800000    # 1.0f

    sub-float/2addr v1, v12

    .line 523
    :goto_6
    cmpg-float v12, v0, v11

    if-gez v12, :cond_a

    .line 524
    int-to-float v12, p2

    mul-float/2addr v0, v12

    const/high16 v12, 0x42c80000    # 100.0f

    div-float/2addr v0, v12

    const/high16 v12, 0x3f800000    # 1.0f

    sub-float/2addr v0, v12

    .line 529
    :goto_7
    const/4 v12, 0x0

    cmpg-float v12, v1, v12

    if-gez v12, :cond_4

    .line 530
    const/4 v1, 0x0

    .line 532
    :cond_4
    const/4 v12, 0x0

    cmpg-float v12, v0, v12

    if-gez v12, :cond_5

    .line 533
    const/4 v0, 0x0

    .line 535
    :cond_5
    invoke-virtual {v7, v1, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 513
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_5

    .line 478
    :cond_6
    iget-object v8, v6, Lcom/roidapp/photogrid/release/lc;->p:Landroid/graphics/Region;

    invoke-virtual {v8, v2, v7, v0, v1}, Landroid/graphics/Region;->set(IIII)Z

    goto/16 :goto_2

    .line 495
    :cond_7
    int-to-float v2, p1

    mul-float/2addr v1, v2

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x3f800000    # 1.0f

    add-float/2addr v1, v2

    goto :goto_3

    .line 500
    :cond_8
    int-to-float v2, p2

    mul-float/2addr v0, v2

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v0, v2

    const/high16 v2, 0x3f800000    # 1.0f

    add-float/2addr v0, v2

    goto :goto_4

    .line 521
    :cond_9
    int-to-float v12, p1

    mul-float/2addr v1, v12

    const/high16 v12, 0x42c80000    # 100.0f

    div-float/2addr v1, v12

    const/high16 v12, 0x3f800000    # 1.0f

    add-float/2addr v1, v12

    goto :goto_6

    .line 526
    :cond_a
    int-to-float v12, p2

    mul-float/2addr v0, v12

    const/high16 v12, 0x42c80000    # 100.0f

    div-float/2addr v0, v12

    const/high16 v12, 0x3f800000    # 1.0f

    add-float/2addr v0, v12

    goto :goto_7

    .line 537
    :cond_b
    invoke-virtual {v7}, Landroid/graphics/Path;->close()V

    .line 538
    iput-object v7, v6, Lcom/roidapp/photogrid/release/lc;->a:Landroid/graphics/Path;

    .line 449
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto/16 :goto_0

    .line 540
    :cond_c
    return-void
.end method

.method private m()V
    .locals 11

    .prologue
    const/4 v10, 0x0

    .line 562
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->D:Lcom/roidapp/photogrid/release/PhotoView;

    if-nez v0, :cond_1

    .line 638
    :cond_0
    return-void

    .line 567
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->z:Ljava/util/List;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_8

    .line 568
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_4

    .line 569
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->z:Ljava/util/List;

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

    .line 574
    instance-of v2, v0, Lcom/roidapp/photogrid/release/ps;

    if-nez v2, :cond_2

    .line 577
    iput-boolean v10, v0, Lcom/roidapp/photogrid/release/ao;->f:Z

    .line 578
    iget-object v2, p0, Lcom/roidapp/photogrid/release/nc;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/release/PhotoView;->a(Lcom/roidapp/photogrid/release/ao;)V

    goto :goto_0

    .line 580
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->h:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i()V

    .line 583
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 587
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->A:Ljava/util/List;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->A:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 588
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->E:Lcom/roidapp/photogrid/release/az;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_5

    .line 589
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->A:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 591
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->A:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 596
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 597
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v3, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 600
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->D:Lcom/roidapp/photogrid/release/PhotoView;

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

    .line 601
    instance-of v1, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v1, :cond_9

    move-object v1, v0

    .line 602
    check-cast v1, Lcom/roidapp/photogrid/release/ra;

    .line 603
    iget v5, v1, Lcom/roidapp/photogrid/release/ra;->j:F

    .line 604
    iget v6, v1, Lcom/roidapp/photogrid/release/ra;->k:F

    .line 608
    int-to-float v7, v2

    iget v8, v1, Lcom/roidapp/photogrid/release/ra;->c:I

    int-to-float v8, v8

    div-float/2addr v7, v8

    .line 609
    int-to-float v8, v3

    iget v9, v1, Lcom/roidapp/photogrid/release/ra;->d:I

    int-to-float v9, v9

    div-float/2addr v8, v9

    .line 611
    mul-float v9, v5, v7

    .line 612
    mul-float/2addr v8, v6

    .line 614
    iput v2, v1, Lcom/roidapp/photogrid/release/ra;->c:I

    .line 615
    iput v3, v1, Lcom/roidapp/photogrid/release/ra;->d:I

    .line 616
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ra;->i()V

    .line 619
    neg-float v5, v5

    neg-float v6, v6

    invoke-virtual {v1, v5, v6}, Lcom/roidapp/photogrid/release/ra;->b(FF)V

    .line 621
    iget v5, v1, Lcom/roidapp/photogrid/release/ra;->h:F

    .line 622
    mul-float/2addr v5, v7

    iget v6, v1, Lcom/roidapp/photogrid/release/ra;->l:F

    invoke-virtual {v1, v5, v6, v9, v8}, Lcom/roidapp/photogrid/release/ra;->b(FFFF)V

    move-object v1, v0

    .line 623
    check-cast v1, Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ra;->j()V

    .line 624
    iput-boolean v10, v0, Lcom/roidapp/photogrid/release/ao;->f:Z

    goto :goto_2

    .line 585
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->h:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i()V

    goto/16 :goto_1

    .line 625
    :cond_9
    instance-of v1, v0, Lcom/roidapp/photogrid/release/qz;

    if-eqz v1, :cond_7

    .line 627
    check-cast v0, Lcom/roidapp/photogrid/release/qz;

    .line 629
    iget v1, v0, Lcom/roidapp/photogrid/release/qz;->c:I

    if-lez v1, :cond_a

    iget v1, v0, Lcom/roidapp/photogrid/release/qz;->d:I

    if-lez v1, :cond_a

    .line 630
    iget v1, v0, Lcom/roidapp/photogrid/release/qz;->j:F

    int-to-float v5, v2

    iget v6, v0, Lcom/roidapp/photogrid/release/qz;->c:I

    int-to-float v6, v6

    div-float/2addr v5, v6

    mul-float/2addr v1, v5

    iput v1, v0, Lcom/roidapp/photogrid/release/qz;->j:F

    .line 631
    iget v1, v0, Lcom/roidapp/photogrid/release/qz;->k:F

    int-to-float v5, v3

    iget v6, v0, Lcom/roidapp/photogrid/release/qz;->d:I

    int-to-float v6, v6

    div-float/2addr v5, v6

    mul-float/2addr v1, v5

    iput v1, v0, Lcom/roidapp/photogrid/release/qz;->k:F

    .line 633
    :cond_a
    iput v2, v0, Lcom/roidapp/photogrid/release/qz;->c:I

    .line 634
    iput v3, v0, Lcom/roidapp/photogrid/release/qz;->d:I

    .line 635
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/qz;->g()V

    goto :goto_2
.end method

.method private n()V
    .locals 3

    .prologue
    .line 726
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->y:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 727
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->y:Ljava/util/ArrayList;

    monitor-enter v1

    .line 728
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->y:Ljava/util/ArrayList;

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

    .line 729
    if-eqz v0, :cond_0

    .line 730
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ic;->a()V

    goto :goto_0

    .line 735
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 734
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 735
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 737
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

    .line 243
    :try_start_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/nc;->n()V

    .line 244
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xb

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 1118
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->j:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 1119
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 1122
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 1124
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v4

    .line 1125
    new-instance v5, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v5}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 1126
    const/4 v0, 0x1

    iput-boolean v0, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 1127
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->i:[Lcom/roidapp/photogrid/release/ig;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->i:[Lcom/roidapp/photogrid/release/ig;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    move-object v3, v0

    .line 1128
    :goto_0
    invoke-static {v3, v5}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 1129
    iget v0, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    int-to-float v1, v0

    .line 1130
    iget v0, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    int-to-float v0, v0

    .line 1131
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v6

    invoke-virtual {v6}, Lcom/roidapp/photogrid/release/ih;->t()F

    .line 1132
    cmpl-float v6, v1, v2

    if-nez v6, :cond_1

    cmpl-float v6, v0, v2

    if-eqz v6, :cond_3

    .line 1135
    :cond_1
    invoke-static {v3}, Lcom/roidapp/photogrid/common/bb;->a(Ljava/lang/String;)I

    move-result v3

    div-int/lit8 v3, v3, 0x5a

    rem-int/lit8 v3, v3, 0x2

    if-ne v3, v9, :cond_2

    .line 1136
    iget v0, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    int-to-float v1, v0

    .line 1137
    iget v0, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    int-to-float v0, v0

    .line 1140
    :cond_2
    const/4 v3, 0x0

    aget-object v3, v4, v3

    iget v3, v3, Lcom/roidapp/photogrid/release/ig;->q:I

    rem-int/lit16 v3, v3, 0xb4

    if-eqz v3, :cond_b

    .line 1141
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    div-float/2addr v0, v1

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    .line 1150
    :cond_3
    :goto_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->t()F

    move-result v3

    .line 1153
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v0, p0, Lcom/roidapp/photogrid/release/nc;->x:I

    .line 1154
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/roidapp/photogrid/release/nc;->w:I

    .line 1155
    iget v0, p0, Lcom/roidapp/photogrid/release/nc;->x:I

    iget v1, p0, Lcom/roidapp/photogrid/release/nc;->w:I

    if-ge v0, v1, :cond_4

    .line 1156
    iget v0, p0, Lcom/roidapp/photogrid/release/nc;->x:I

    .line 1157
    iget v1, p0, Lcom/roidapp/photogrid/release/nc;->w:I

    iput v1, p0, Lcom/roidapp/photogrid/release/nc;->x:I

    .line 1158
    iput v0, p0, Lcom/roidapp/photogrid/release/nc;->w:I

    .line 1162
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0900dd

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    .line 1163
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f090058

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    .line 1164
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f090057

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    .line 1166
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->h:Landroid/app/Activity;

    const v6, 0x7f0d0085

    invoke-virtual {v0, v6}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    .line 1167
    if-eqz v6, :cond_5

    .line 1168
    invoke-static {}, Lcom/roidapp/photogrid/common/a;->a()Lcom/roidapp/photogrid/common/a;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->h:Landroid/app/Activity;

    const-string v7, "grid"

    const/4 v8, 0x1

    invoke-static {v0, v7, v8}, Lcom/roidapp/photogrid/common/a;->a(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->h:Landroid/app/Activity;

    invoke-static {v0}, Lcom/roidapp/photogrid/a/m;->a(Landroid/content/Context;)I

    move-result v0

    if-eq v0, v9, :cond_e

    .line 1169
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->B:Z

    if-nez v0, :cond_d

    .line 1170
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1172
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->h:Landroid/app/Activity;

    instance-of v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_5

    .line 1173
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->h:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 1174
    iget-boolean v7, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->F:Z

    if-eqz v7, :cond_5

    .line 1175
    const/4 v7, 0x0

    iput-boolean v7, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->F:Z

    .line 1176
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->C()V

    .line 1186
    :cond_5
    :goto_2
    if-eqz v6, :cond_f

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_f

    .line 1187
    const v0, 0x7f0d0086

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 1188
    if-eqz v0, :cond_16

    .line 1189
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1190
    if-lez v0, :cond_16

    .line 1191
    int-to-float v0, v0

    .line 1200
    :goto_3
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->h:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0900cb

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    .line 1201
    iget v2, p0, Lcom/roidapp/photogrid/release/nc;->x:I

    int-to-float v2, v2

    sub-float/2addr v2, v4

    sub-float/2addr v2, v5

    sub-float v0, v2, v0

    sub-float/2addr v0, v1

    sget v1, Lcom/roidapp/photogrid/common/az;->g:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    float-to-int v1, v0

    .line 1204
    iget v0, p0, Lcom/roidapp/photogrid/release/nc;->w:I

    int-to-float v0, v0

    int-to-float v2, v1

    div-float/2addr v0, v2

    .line 1205
    cmpg-float v0, v3, v0

    if-gez v0, :cond_10

    .line 1207
    int-to-float v0, v1

    mul-float/2addr v0, v3

    float-to-int v0, v0

    .line 1212
    :goto_4
    int-to-float v0, v0

    iget v2, p0, Lcom/roidapp/photogrid/release/nc;->C:F

    mul-float/2addr v0, v2

    float-to-int v2, v0

    .line 1213
    int-to-float v0, v1

    iget v1, p0, Lcom/roidapp/photogrid/release/nc;->C:F

    mul-float/2addr v0, v1

    float-to-int v1, v0

    .line 1215
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->h:Landroid/app/Activity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v3, 0x7f03000c

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/nc;->j:Landroid/view/ViewGroup;

    .line 1216
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v3, -0x1

    const/4 v4, -0x1

    invoke-direct {v0, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 1217
    iput v2, v0, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 1218
    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 1219
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->j:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1221
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->j:Landroid/view/ViewGroup;

    const v1, 0x7f0d0061

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/nc;->k:Landroid/widget/RelativeLayout;

    .line 1223
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->j:Landroid/view/ViewGroup;

    const v1, 0x7f0d0060

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/nc;->p:Landroid/widget/LinearLayout;

    .line 1224
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 1236
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/nc;->q:Lcom/roidapp/photogrid/release/an;

    .line 246
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xc

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 247
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1330
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

    .line 1331
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->y:Ljava/util/ArrayList;

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->aL()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/rf;->a(Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 1332
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->k(Ljava/lang/String;)V

    .line 1333
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->r(Z)V

    .line 248
    :goto_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xd

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 249
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->k:Landroid/widget/RelativeLayout;

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/nc;->a(Landroid/widget/RelativeLayout;)V

    .line 250
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xe

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 1421
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v0, p0, Lcom/roidapp/photogrid/release/nc;->n:I

    .line 1422
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v0, p0, Lcom/roidapp/photogrid/release/nc;->o:I

    .line 1423
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->q:Lcom/roidapp/photogrid/release/an;

    if-nez v0, :cond_7

    .line 1424
    new-instance v0, Lcom/roidapp/photogrid/release/an;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->h:Landroid/app/Activity;

    iget v2, p0, Lcom/roidapp/photogrid/release/nc;->n:I

    iget v3, p0, Lcom/roidapp/photogrid/release/nc;->o:I

    invoke-direct {v0, v1, v2, v3}, Lcom/roidapp/photogrid/release/an;-><init>(Landroid/content/Context;II)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/nc;->q:Lcom/roidapp/photogrid/release/an;

    .line 1425
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->q:Lcom/roidapp/photogrid/release/an;

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->B()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/an;->c(Z)V

    .line 1426
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->be()Z

    move-result v0

    if-eqz v0, :cond_12

    .line 1432
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->q:Lcom/roidapp/photogrid/release/an;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/an;->b(Z)V

    .line 1433
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->h:Landroid/app/Activity;

    if-eqz v0, :cond_6

    .line 1434
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->h:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->bd()I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(IZ)V

    .line 1438
    :cond_6
    :goto_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->q:Lcom/roidapp/photogrid/release/an;

    iget v1, p0, Lcom/roidapp/photogrid/release/nc;->r:I

    iget v2, p0, Lcom/roidapp/photogrid/release/nc;->s:I

    iget v3, p0, Lcom/roidapp/photogrid/release/nc;->t:I

    iget v4, p0, Lcom/roidapp/photogrid/release/nc;->u:I

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/release/an;->a(IIII)V

    .line 252
    :cond_7
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xf

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 254
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x10

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 259
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x11

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 2404
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 2405
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->D:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v1, :cond_8

    .line 2406
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/PhotoView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2408
    :cond_8
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->E:Lcom/roidapp/photogrid/release/az;

    if-eqz v1, :cond_9

    .line 2409
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/az;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 261
    :cond_9
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x12

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 262
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/nc;->m()V

    .line 263
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x13

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 264
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/release/nc;->d(II)V

    .line 265
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x14

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 266
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->j:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 3351
    new-instance v2, Ljava/lang/Thread;

    new-instance v3, Lcom/roidapp/photogrid/release/nd;

    invoke-direct {v3, p0, v0, v1}, Lcom/roidapp/photogrid/release/nd;-><init>(Lcom/roidapp/photogrid/release/nc;II)V

    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 290
    :goto_7
    return-void

    .line 1127
    :cond_a
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->i:[Lcom/roidapp/photogrid/release/ig;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ig;->e()Ljava/lang/String;

    move-result-object v0

    move-object v3, v0

    goto/16 :goto_0

    .line 1144
    :cond_b
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    div-float v0, v1, v0

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/ih;->b(F)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1

    .line 267
    :catch_0
    move-exception v0

    .line 268
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/nc;->n()V

    .line 269
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

    .line 270
    :cond_c
    iget v1, p0, Lcom/roidapp/photogrid/release/nc;->C:F

    cmpl-float v1, v1, v10

    if-nez v1, :cond_13

    .line 271
    const/high16 v0, 0x3f400000    # 0.75f

    iput v0, p0, Lcom/roidapp/photogrid/release/nc;->C:F

    .line 272
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->K:Landroid/os/Handler;

    invoke-virtual {v0, v9}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_7

    .line 1180
    :cond_d
    const/16 v0, 0x8

    :try_start_1
    invoke-virtual {v6, v0}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_2

    .line 1183
    :cond_e
    const/16 v0, 0x8

    invoke-virtual {v6, v0}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_2

    :cond_f
    move v0, v2

    .line 1196
    goto/16 :goto_3

    .line 1209
    :cond_10
    iget v0, p0, Lcom/roidapp/photogrid/release/nc;->w:I

    .line 1210
    int-to-float v1, v0

    div-float/2addr v1, v3

    float-to-int v1, v1

    goto/16 :goto_4

    .line 1335
    :cond_11
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->h:Landroid/app/Activity;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->y:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/nc;->B:[I

    iget v3, p0, Lcom/roidapp/photogrid/release/nc;->m:I

    iget-object v4, p0, Lcom/roidapp/photogrid/release/nc;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v4, v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;Ljava/util/ArrayList;[III)V

    goto/16 :goto_5

    .line 1436
    :cond_12
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->q:Lcom/roidapp/photogrid/release/an;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/an;->b(Z)V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_6

    .line 274
    :cond_13
    iget v1, p0, Lcom/roidapp/photogrid/release/nc;->C:F

    const/high16 v2, 0x3f400000    # 0.75f

    cmpl-float v1, v1, v2

    if-nez v1, :cond_14

    .line 275
    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lcom/roidapp/photogrid/release/nc;->C:F

    .line 276
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->K:Landroid/os/Handler;

    invoke-virtual {v0, v9}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_7

    .line 279
    :cond_14
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 280
    iput v10, p0, Lcom/roidapp/photogrid/release/nc;->C:F

    .line 281
    const/16 v0, 0x8e

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/nc;->d(I)V

    goto/16 :goto_7

    .line 285
    :cond_15
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 286
    iput v10, p0, Lcom/roidapp/photogrid/release/nc;->C:F

    .line 287
    const/16 v0, 0x8f

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/nc;->d(I)V

    goto/16 :goto_7

    :cond_16
    move v0, v1

    goto/16 :goto_3
.end method

.method public final a(Landroid/widget/RelativeLayout;Landroid/view/View$OnTouchListener;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 642
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/nc;->H:Z

    if-eqz v0, :cond_1

    .line 693
    :cond_0
    :goto_0
    return-void

    .line 648
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->q:Lcom/roidapp/photogrid/release/an;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    if-nez v0, :cond_2

    .line 649
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->p:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->q:Lcom/roidapp/photogrid/release/an;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 651
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x4b

    invoke-virtual {v0, v1, v3}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 653
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v1, v1

    if-ne v0, v1, :cond_0

    move v2, v3

    .line 654
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-ge v2, v0, :cond_3

    .line 655
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->k:Landroid/widget/RelativeLayout;

    add-int/lit8 v1, v2, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/if;

    .line 656
    if-nez v0, :cond_8

    .line 657
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/nc;->a()V

    .line 671
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->E:Lcom/roidapp/photogrid/release/az;

    if-eqz v0, :cond_5

    .line 672
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 673
    if-eqz v0, :cond_4

    .line 674
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 676
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->j:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 679
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->D:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_7

    .line 680
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 681
    if-eqz v0, :cond_6

    .line 682
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 684
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->j:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 687
    :cond_7
    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 688
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->h:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f09010a

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v0, v3, v3, v3, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 689
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 690
    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->removeAllViews()V

    .line 691
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->j:Landroid/view/ViewGroup;

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 692
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p2}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    goto/16 :goto_0

    .line 660
    :cond_8
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 661
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 662
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/if;->b(Landroid/graphics/Bitmap;)V

    .line 663
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/if;->a(Landroid/graphics/Bitmap;)V

    .line 664
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->l:Lcom/roidapp/photogrid/release/ml;

    mul-int/lit8 v1, v2, 0x2

    add-int/lit8 v1, v1, 0x4c

    invoke-virtual {v0, v1, v3}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 654
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto/16 :goto_1
.end method

.method public final b(Z)I
    .locals 1

    .prologue
    .line 742
    const/4 v0, 0x0

    return v0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 697
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/nc;->H:Z

    .line 698
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->j:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 699
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 701
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/nc;->n()V

    .line 702
    return-void
.end method

.method public final b(II)V
    .locals 0

    .prologue
    .line 749
    return-void
.end method

.method public final b(IZ)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    const/4 v4, 0x0

    .line 810
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->y:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 838
    :cond_0
    :goto_0
    return-void

    .line 813
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->j:Landroid/view/ViewGroup;

    add-int/lit8 v1, p1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/if;

    .line 814
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    .line 815
    iget-object v2, p0, Lcom/roidapp/photogrid/release/nc;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput-boolean p2, v2, Lcom/roidapp/photogrid/release/ig;->B:Z

    .line 817
    iget-object v2, p0, Lcom/roidapp/photogrid/release/nc;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    const/high16 v3, 0x3f800000    # 1.0f

    iput v3, v2, Lcom/roidapp/photogrid/release/ig;->v:F

    .line 818
    iget-object v2, p0, Lcom/roidapp/photogrid/release/nc;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput v4, v2, Lcom/roidapp/photogrid/release/ig;->t:F

    .line 819
    iget-object v2, p0, Lcom/roidapp/photogrid/release/nc;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput v4, v2, Lcom/roidapp/photogrid/release/ig;->u:F

    .line 820
    iget-object v2, p0, Lcom/roidapp/photogrid/release/nc;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput v5, v2, Lcom/roidapp/photogrid/release/ig;->p:I

    .line 821
    iget-object v2, p0, Lcom/roidapp/photogrid/release/nc;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput v5, v2, Lcom/roidapp/photogrid/release/ig;->x:I

    .line 822
    iget-object v2, p0, Lcom/roidapp/photogrid/release/nc;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput v6, v2, Lcom/roidapp/photogrid/release/ig;->r:I

    .line 823
    iget-object v2, p0, Lcom/roidapp/photogrid/release/nc;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput v6, v2, Lcom/roidapp/photogrid/release/ig;->s:I

    .line 831
    iget-object v2, p0, Lcom/roidapp/photogrid/release/nc;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput-object v2, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    .line 832
    iget-object v1, v1, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/if;->a(Landroid/graphics/Bitmap;)V

    goto :goto_0
.end method

.method public final c(I)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 779
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->k:Landroid/widget/RelativeLayout;

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/nc;->a(Landroid/widget/RelativeLayout;)V

    .line 780
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/release/nc;->d(II)V

    .line 782
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v1, v1

    if-ne v0, v1, :cond_0

    move v2, v3

    .line 783
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-ge v2, v0, :cond_0

    .line 784
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->k:Landroid/widget/RelativeLayout;

    add-int/lit8 v1, v2, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/if;

    .line 785
    if-nez v0, :cond_1

    .line 790
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/nc;->a()V

    .line 801
    :cond_0
    return-void

    .line 794
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 795
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 796
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/if;->b(Landroid/graphics/Bitmap;)V

    .line 797
    if-ne p1, v4, :cond_2

    move v1, v4

    :goto_1
    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/if;->D:Z

    .line 798
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/if;->invalidate()V

    .line 783
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :cond_2
    move v1, v3

    .line 797
    goto :goto_1
.end method

.method public final c(II)V
    .locals 0

    .prologue
    .line 755
    return-void
.end method

.method public final f()V
    .locals 2

    .prologue
    .line 706
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->A:Ljava/util/List;

    if-nez v0, :cond_0

    .line 707
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/nc;->A:Ljava/util/List;

    .line 709
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->D:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_2

    .line 710
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->z:Ljava/util/List;

    if-nez v0, :cond_1

    .line 711
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/nc;->z:Ljava/util/List;

    .line 713
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->z:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->e()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 714
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->z:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->j(Ljava/util/List;)V

    .line 716
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->E:Lcom/roidapp/photogrid/release/az;

    if-eqz v0, :cond_3

    .line 717
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->A:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 718
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/nc;->A:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->e(Ljava/util/List;)V

    .line 719
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nc;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 721
    :cond_3
    return-void
.end method

.method public final l()V
    .locals 0

    .prologue
    .line 414
    invoke-super {p0}, Lcom/roidapp/photogrid/release/mm;->l()V

    .line 415
    return-void
.end method
