.class public final Lcom/roidapp/photogrid/release/mw;
.super Lcom/roidapp/photogrid/release/mm;
.source "SourceFile"


# direct methods
.method public constructor <init>(ZLandroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/az;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 44
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/mm;-><init>()V

    .line 46
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/mw;->F:Z

    .line 49
    iput-object p2, p0, Lcom/roidapp/photogrid/release/mw;->h:Landroid/app/Activity;

    .line 50
    iput-object p3, p0, Lcom/roidapp/photogrid/release/mw;->i:[Lcom/roidapp/photogrid/release/ig;

    .line 51
    iput-object p4, p0, Lcom/roidapp/photogrid/release/mw;->l:Lcom/roidapp/photogrid/release/ml;

    .line 52
    iput-object p5, p0, Lcom/roidapp/photogrid/release/mw;->D:Lcom/roidapp/photogrid/release/PhotoView;

    .line 53
    iput-object p6, p0, Lcom/roidapp/photogrid/release/mw;->E:Lcom/roidapp/photogrid/release/az;

    .line 54
    invoke-virtual {p2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setFormat(I)V

    .line 55
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    .line 57
    if-eqz p1, :cond_0

    .line 58
    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->d(Z)V

    .line 59
    const/4 v1, -0x2

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->c(I)V

    .line 60
    const v1, 0x3fe38e39

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    .line 61
    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    .line 62
    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->d(F)V

    .line 63
    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->f(F)V

    .line 65
    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->d(I)V

    .line 68
    invoke-static {p2}, Lcom/roidapp/photogrid/common/bc;->a(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 69
    const/16 v1, 0x16

    invoke-virtual {p4, v1}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    .line 73
    :cond_0
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->w()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 74
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->w()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/photogrid/release/mw;->z:Ljava/util/List;

    .line 80
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, v3

    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/roidapp/photogrid/release/ig;->B:Z

    .line 87
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->I()I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/mw;->m:I

    .line 88
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->x()I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/mw;->s:I

    .line 89
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->A()I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/mw;->r:I

    .line 90
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->y()I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/mw;->t:I

    .line 91
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->z()I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/mw;->u:I

    .line 93
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->m()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/mw;->A:Ljava/util/List;

    .line 95
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->b:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/mw;->B:[I

    .line 96
    return-void
.end method

.method private a(Landroid/widget/RelativeLayout;)V
    .locals 6

    .prologue
    .line 492
    :try_start_0
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->j:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/mw;->p:Landroid/widget/LinearLayout;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/mw;->h:Landroid/app/Activity;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/mw;->i:[Lcom/roidapp/photogrid/release/ig;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/mw;->y:Ljava/util/ArrayList;

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/view/View;Landroid/widget/RelativeLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 498
    :goto_0
    return-void

    .line 494
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserException;->printStackTrace()V

    goto :goto_0

    .line 496
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/mw;)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/mw;->m()V

    return-void
.end method

.method private d(II)V
    .locals 13

    .prologue
    .line 393
    iget-object v4, p0, Lcom/roidapp/photogrid/release/mw;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v5, v4

    const/4 v0, 0x0

    move v3, v0

    :goto_0
    if-ge v3, v5, :cond_c

    aget-object v0, v4, v3

    .line 394
    iget-object v6, v0, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    .line 396
    if-nez v6, :cond_0

    .line 397
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "data null"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 403
    :cond_0
    int-to-float v0, p1

    iget v1, v6, Lcom/roidapp/photogrid/release/lc;->j:F

    mul-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 404
    int-to-float v0, p2

    iget v1, v6, Lcom/roidapp/photogrid/release/lc;->k:F

    mul-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v7

    .line 405
    int-to-float v0, p1

    iget v1, v6, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    add-int/2addr v0, v2

    .line 406
    int-to-float v1, p2

    iget v8, v6, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v1, v8

    const/high16 v8, 0x42c80000    # 100.0f

    div-float/2addr v1, v8

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    add-int/2addr v1, v7

    .line 408
    iget-boolean v8, v6, Lcom/roidapp/photogrid/release/lc;->f:Z

    if-eqz v8, :cond_6

    .line 409
    new-instance v8, Landroid/graphics/Path;

    invoke-direct {v8}, Landroid/graphics/Path;-><init>()V

    .line 410
    iget-object v0, v6, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    .line 411
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

    .line 413
    const/4 v0, 0x1

    move v1, v0

    :goto_1
    iget-object v0, v6, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 414
    iget-object v0, v6, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    .line 415
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

    .line 413
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 417
    :cond_1
    invoke-virtual {v8}, Landroid/graphics/Path;->close()V

    .line 418
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 419
    const/4 v1, 0x1

    invoke-virtual {v8, v0, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 420
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

    .line 426
    :goto_2
    new-instance v7, Landroid/graphics/Path;

    invoke-direct {v7}, Landroid/graphics/Path;-><init>()V

    .line 428
    iget-object v8, v6, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 429
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    .line 430
    iget-object v0, v6, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    iget v10, v0, Landroid/graphics/PointF;->x:F

    .line 431
    iget-object v0, v6, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    iget v11, v0, Landroid/graphics/PointF;->y:F

    .line 433
    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 434
    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 436
    cmpg-float v2, v1, v10

    if-gez v2, :cond_7

    .line 437
    int-to-float v2, p1

    mul-float/2addr v1, v2

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v1, v2

    .line 441
    :goto_3
    cmpg-float v2, v0, v11

    if-gez v2, :cond_8

    .line 442
    int-to-float v2, p2

    mul-float/2addr v0, v2

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v0, v2

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v0, v2

    .line 449
    :goto_4
    const/4 v2, 0x0

    cmpg-float v2, v1, v2

    if-gez v2, :cond_2

    .line 450
    const/4 v1, 0x0

    .line 452
    :cond_2
    const/4 v2, 0x0

    cmpg-float v2, v0, v2

    if-gez v2, :cond_3

    .line 453
    const/4 v0, 0x0

    .line 455
    :cond_3
    invoke-virtual {v7, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 457
    const/4 v0, 0x1

    move v2, v0

    :goto_5
    if-ge v2, v9, :cond_b

    .line 458
    invoke-interface {v8, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    .line 459
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 460
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 462
    cmpg-float v12, v1, v10

    if-gez v12, :cond_9

    .line 463
    int-to-float v12, p1

    mul-float/2addr v1, v12

    const/high16 v12, 0x42c80000    # 100.0f

    div-float/2addr v1, v12

    const/high16 v12, 0x3f800000    # 1.0f

    sub-float/2addr v1, v12

    .line 467
    :goto_6
    cmpg-float v12, v0, v11

    if-gez v12, :cond_a

    .line 468
    int-to-float v12, p2

    mul-float/2addr v0, v12

    const/high16 v12, 0x42c80000    # 100.0f

    div-float/2addr v0, v12

    const/high16 v12, 0x3f800000    # 1.0f

    sub-float/2addr v0, v12

    .line 473
    :goto_7
    const/4 v12, 0x0

    cmpg-float v12, v1, v12

    if-gez v12, :cond_4

    .line 474
    const/4 v1, 0x0

    .line 476
    :cond_4
    const/4 v12, 0x0

    cmpg-float v12, v0, v12

    if-gez v12, :cond_5

    .line 477
    const/4 v0, 0x0

    .line 479
    :cond_5
    invoke-virtual {v7, v1, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 457
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_5

    .line 422
    :cond_6
    iget-object v8, v6, Lcom/roidapp/photogrid/release/lc;->p:Landroid/graphics/Region;

    invoke-virtual {v8, v2, v7, v0, v1}, Landroid/graphics/Region;->set(IIII)Z

    goto/16 :goto_2

    .line 439
    :cond_7
    int-to-float v2, p1

    mul-float/2addr v1, v2

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x3f800000    # 1.0f

    add-float/2addr v1, v2

    goto :goto_3

    .line 444
    :cond_8
    int-to-float v2, p2

    mul-float/2addr v0, v2

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v0, v2

    const/high16 v2, 0x3f800000    # 1.0f

    add-float/2addr v0, v2

    goto :goto_4

    .line 465
    :cond_9
    int-to-float v12, p1

    mul-float/2addr v1, v12

    const/high16 v12, 0x42c80000    # 100.0f

    div-float/2addr v1, v12

    const/high16 v12, 0x3f800000    # 1.0f

    add-float/2addr v1, v12

    goto :goto_6

    .line 470
    :cond_a
    int-to-float v12, p2

    mul-float/2addr v0, v12

    const/high16 v12, 0x42c80000    # 100.0f

    div-float/2addr v0, v12

    const/high16 v12, 0x3f800000    # 1.0f

    add-float/2addr v0, v12

    goto :goto_7

    .line 481
    :cond_b
    invoke-virtual {v7}, Landroid/graphics/Path;->close()V

    .line 482
    iput-object v7, v6, Lcom/roidapp/photogrid/release/lc;->a:Landroid/graphics/Path;

    .line 393
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto/16 :goto_0

    .line 484
    :cond_c
    return-void
.end method

.method private m()V
    .locals 3

    .prologue
    .line 634
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->y:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 635
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->y:Ljava/util/ArrayList;

    monitor-enter v1

    .line 636
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->y:Ljava/util/ArrayList;

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

    .line 637
    if-eqz v0, :cond_0

    .line 638
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ic;->a()V

    goto :goto_0

    .line 643
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 642
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 643
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 645
    :cond_2
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 11

    .prologue
    const/4 v2, 0x0

    const/high16 v10, 0x3f800000    # 1.0f

    const/4 v9, 0x1

    .line 231
    :try_start_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/mw;->m()V

    .line 232
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xb

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 1099
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->j:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 1100
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 1103
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 1105
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v4

    .line 1106
    new-instance v5, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v5}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 1107
    const/4 v0, 0x1

    iput-boolean v0, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 1108
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->i:[Lcom/roidapp/photogrid/release/ig;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->i:[Lcom/roidapp/photogrid/release/ig;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    move-object v3, v0

    .line 1109
    :goto_0
    invoke-static {v3, v5}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 1110
    iget v0, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    int-to-float v1, v0

    .line 1111
    iget v0, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    int-to-float v0, v0

    .line 1112
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v6

    invoke-virtual {v6}, Lcom/roidapp/photogrid/release/ih;->t()F

    .line 1113
    cmpl-float v6, v1, v2

    if-nez v6, :cond_1

    cmpl-float v6, v0, v2

    if-eqz v6, :cond_3

    .line 1116
    :cond_1
    invoke-static {v3}, Lcom/roidapp/photogrid/common/bb;->a(Ljava/lang/String;)I

    move-result v3

    div-int/lit8 v3, v3, 0x5a

    rem-int/lit8 v3, v3, 0x2

    if-ne v3, v9, :cond_2

    .line 1117
    iget v0, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    int-to-float v1, v0

    .line 1118
    iget v0, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    int-to-float v0, v0

    .line 1121
    :cond_2
    const/4 v3, 0x0

    aget-object v3, v4, v3

    iget v3, v3, Lcom/roidapp/photogrid/release/ig;->q:I

    rem-int/lit16 v3, v3, 0xb4

    if-eqz v3, :cond_c

    .line 1122
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    div-float/2addr v0, v1

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    .line 1131
    :cond_3
    :goto_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->t()F

    move-result v3

    .line 1134
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v0, p0, Lcom/roidapp/photogrid/release/mw;->x:I

    .line 1135
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/roidapp/photogrid/release/mw;->w:I

    .line 1136
    iget v0, p0, Lcom/roidapp/photogrid/release/mw;->x:I

    iget v1, p0, Lcom/roidapp/photogrid/release/mw;->w:I

    if-ge v0, v1, :cond_4

    .line 1137
    iget v0, p0, Lcom/roidapp/photogrid/release/mw;->x:I

    .line 1138
    iget v1, p0, Lcom/roidapp/photogrid/release/mw;->w:I

    iput v1, p0, Lcom/roidapp/photogrid/release/mw;->x:I

    .line 1139
    iput v0, p0, Lcom/roidapp/photogrid/release/mw;->w:I

    .line 1143
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0900dd

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    .line 1144
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f090058

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    .line 1145
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f090057

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    .line 1147
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->h:Landroid/app/Activity;

    const v6, 0x7f0d0085

    invoke-virtual {v0, v6}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    .line 1148
    if-eqz v6, :cond_5

    .line 1149
    invoke-static {}, Lcom/roidapp/photogrid/common/a;->a()Lcom/roidapp/photogrid/common/a;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->h:Landroid/app/Activity;

    const-string v7, "grid"

    const/4 v8, 0x1

    invoke-static {v0, v7, v8}, Lcom/roidapp/photogrid/common/a;->a(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_f

    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->h:Landroid/app/Activity;

    invoke-static {v0}, Lcom/roidapp/photogrid/a/m;->a(Landroid/content/Context;)I

    move-result v0

    if-eq v0, v9, :cond_f

    .line 1150
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->B:Z

    if-nez v0, :cond_e

    .line 1151
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1153
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->h:Landroid/app/Activity;

    instance-of v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_5

    .line 1154
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->h:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 1155
    iget-boolean v7, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->F:Z

    if-eqz v7, :cond_5

    .line 1156
    const/4 v7, 0x0

    iput-boolean v7, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->F:Z

    .line 1157
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->C()V

    .line 1167
    :cond_5
    :goto_2
    if-eqz v6, :cond_10

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_10

    .line 1168
    const v0, 0x7f0d0086

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 1169
    if-eqz v0, :cond_16

    .line 1170
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1171
    if-lez v0, :cond_16

    .line 1172
    int-to-float v0, v0

    .line 1180
    :goto_3
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->h:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0900cb

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    .line 1181
    iget v2, p0, Lcom/roidapp/photogrid/release/mw;->x:I

    int-to-float v2, v2

    sub-float/2addr v2, v4

    sub-float/2addr v2, v5

    sub-float v0, v2, v0

    sub-float/2addr v0, v1

    sget v1, Lcom/roidapp/photogrid/common/az;->g:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    float-to-int v1, v0

    .line 1184
    iget v0, p0, Lcom/roidapp/photogrid/release/mw;->w:I

    int-to-float v0, v0

    int-to-float v2, v1

    div-float/2addr v0, v2

    .line 1185
    cmpg-float v0, v3, v0

    if-gez v0, :cond_11

    .line 1187
    int-to-float v0, v1

    mul-float/2addr v0, v3

    float-to-int v0, v0

    .line 1192
    :goto_4
    int-to-float v0, v0

    iget v2, p0, Lcom/roidapp/photogrid/release/mw;->C:F

    mul-float/2addr v0, v2

    float-to-int v2, v0

    .line 1193
    int-to-float v0, v1

    iget v1, p0, Lcom/roidapp/photogrid/release/mw;->C:F

    mul-float/2addr v0, v1

    float-to-int v1, v0

    .line 1195
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->h:Landroid/app/Activity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v3, 0x7f03000c

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/mw;->j:Landroid/view/ViewGroup;

    .line 1196
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v3, -0x1

    const/4 v4, -0x1

    invoke-direct {v0, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 1197
    iput v2, v0, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 1198
    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 1199
    iget-object v3, p0, Lcom/roidapp/photogrid/release/mw;->j:Landroid/view/ViewGroup;

    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1201
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->j:Landroid/view/ViewGroup;

    const v3, 0x7f0d0061

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/mw;->k:Landroid/widget/RelativeLayout;

    .line 1202
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 1203
    iput v2, v0, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 1204
    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 1205
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 1206
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1208
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->j:Landroid/view/ViewGroup;

    const v1, 0x7f0d0060

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/mw;->p:Landroid/widget/LinearLayout;

    .line 1209
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 1221
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->B()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1222
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->p:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1224
    :cond_6
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/mw;->q:Lcom/roidapp/photogrid/release/an;

    .line 234
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xc

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 235
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1288
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aL()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_12

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aM()Z

    move-result v0

    if-eqz v0, :cond_12

    .line 1289
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->y:Ljava/util/ArrayList;

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->aL()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/rf;->a(Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 1290
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->k(Ljava/lang/String;)V

    .line 1291
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->r(Z)V

    .line 236
    :goto_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xd

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 237
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->k:Landroid/widget/RelativeLayout;

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/mw;->a(Landroid/widget/RelativeLayout;)V

    .line 238
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xe

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 1374
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v0, p0, Lcom/roidapp/photogrid/release/mw;->n:I

    .line 1375
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v0, p0, Lcom/roidapp/photogrid/release/mw;->o:I

    .line 1376
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->q:Lcom/roidapp/photogrid/release/an;

    if-nez v0, :cond_7

    .line 1377
    new-instance v0, Lcom/roidapp/photogrid/release/an;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->h:Landroid/app/Activity;

    iget v2, p0, Lcom/roidapp/photogrid/release/mw;->n:I

    iget v3, p0, Lcom/roidapp/photogrid/release/mw;->o:I

    invoke-direct {v0, v1, v2, v3}, Lcom/roidapp/photogrid/release/an;-><init>(Landroid/content/Context;II)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/mw;->q:Lcom/roidapp/photogrid/release/an;

    .line 1378
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->q:Lcom/roidapp/photogrid/release/an;

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->B()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/an;->c(Z)V

    .line 1381
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->q:Lcom/roidapp/photogrid/release/an;

    iget v1, p0, Lcom/roidapp/photogrid/release/mw;->r:I

    iget v2, p0, Lcom/roidapp/photogrid/release/mw;->s:I

    iget v3, p0, Lcom/roidapp/photogrid/release/mw;->t:I

    iget v4, p0, Lcom/roidapp/photogrid/release/mw;->u:I

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/release/an;->a(IIII)V

    .line 240
    :cond_7
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xf

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 242
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x10

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 247
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x11

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 2362
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 2363
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->D:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v1, :cond_8

    .line 2364
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/PhotoView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2366
    :cond_8
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->E:Lcom/roidapp/photogrid/release/az;

    if-eqz v1, :cond_9

    .line 2367
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/az;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 249
    :cond_9
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x12

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 2505
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 2507
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 2508
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->h:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f080003

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v1

    .line 2509
    array-length v2, v1

    invoke-virtual {v0, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    aget-object v0, v1, v0

    .line 2510
    new-instance v1, Lcom/roidapp/photogrid/release/ra;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/mw;->h:Landroid/app/Activity;

    const/4 v3, 0x1

    invoke-direct {v1, v2, v0, v3}, Lcom/roidapp/photogrid/release/ra;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 2511
    const/16 v0, 0xff

    iput v0, v1, Lcom/roidapp/photogrid/release/ra;->aj:I

    .line 2512
    iget v0, p0, Lcom/roidapp/photogrid/release/mw;->n:I

    iput v0, v1, Lcom/roidapp/photogrid/release/ra;->c:I

    .line 2513
    iget v0, p0, Lcom/roidapp/photogrid/release/mw;->o:I

    iput v0, v1, Lcom/roidapp/photogrid/release/ra;->d:I

    .line 2514
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, v1, Lcom/roidapp/photogrid/release/ra;->au:F

    .line 2515
    const/high16 v0, 0x40000000    # 2.0f

    iput v0, v1, Lcom/roidapp/photogrid/release/ra;->av:F

    .line 2516
    const/high16 v0, 0x40000000    # 2.0f

    iput v0, v1, Lcom/roidapp/photogrid/release/ra;->aw:F

    .line 2517
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v2, 0x7f0a0000

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    int-to-float v0, v0

    iput v0, v1, Lcom/roidapp/photogrid/release/ra;->ad:F

    .line 2518
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x2

    iput v0, v1, Lcom/roidapp/photogrid/release/ra;->P:I

    .line 2519
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x2

    iput v0, v1, Lcom/roidapp/photogrid/release/ra;->ar:I

    .line 2520
    const/4 v0, 0x1

    iput-boolean v0, v1, Lcom/roidapp/photogrid/release/ra;->ag:Z

    .line 2521
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, v1, Lcom/roidapp/photogrid/release/ra;->ah:F

    .line 2522
    const/4 v0, -0x1

    iput v0, v1, Lcom/roidapp/photogrid/release/ra;->ae:I

    .line 2523
    const/high16 v0, -0x1000000

    iput v0, v1, Lcom/roidapp/photogrid/release/ra;->ax:I

    .line 2524
    const/16 v0, -0x15

    iput v0, v1, Lcom/roidapp/photogrid/release/ra;->af:I

    .line 2525
    sget-object v0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    iput-object v0, v1, Lcom/roidapp/photogrid/release/ra;->J:Landroid/graphics/Typeface;

    .line 2526
    iget-object v0, v1, Lcom/roidapp/photogrid/release/ra;->J:Landroid/graphics/Typeface;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ra;->a(Landroid/graphics/Typeface;)I

    move-result v0

    iput v0, v1, Lcom/roidapp/photogrid/release/ra;->M:I

    .line 2527
    sget-object v0, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ra;->a(Landroid/text/Layout$Alignment;)V

    .line 2528
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ra;->g()V

    .line 2534
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ra;->e()[F

    move-result-object v0

    .line 2535
    const/4 v2, 0x1

    const/high16 v3, 0x40200000    # 2.5f

    iget-object v4, p0, Lcom/roidapp/photogrid/release/mw;->h:Landroid/app/Activity;

    invoke-virtual {v4}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    invoke-static {v2, v3, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v2

    float-to-int v2, v2

    .line 2536
    iget v3, v1, Lcom/roidapp/photogrid/release/ra;->c:I

    int-to-double v4, v3

    const-wide v6, 0x3fdfa1cac0800000L    # 0.49424999998882413

    mul-double/2addr v4, v6

    const/4 v3, 0x0

    aget v3, v0, v3

    float-to-double v6, v3

    sub-double/2addr v4, v6

    double-to-int v3, v4

    .line 2539
    iget v4, v1, Lcom/roidapp/photogrid/release/ra;->d:I

    iget v5, v1, Lcom/roidapp/photogrid/release/ra;->d:I

    int-to-float v5, v5

    iget v6, v1, Lcom/roidapp/photogrid/release/ra;->c:I

    int-to-float v6, v6

    const v7, 0x40166666    # 2.35f

    div-float/2addr v6, v7

    sub-float/2addr v5, v6

    float-to-int v5, v5

    div-int/lit8 v5, v5, 0x2

    sub-int/2addr v4, v5

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ra;->d()I

    move-result v5

    div-int/lit8 v5, v5, 0x2

    sub-int/2addr v4, v5

    const/4 v5, 0x1

    aget v0, v0, v5

    float-to-int v0, v0

    sub-int v0, v4, v0

    sub-int/2addr v0, v2

    .line 2541
    int-to-float v2, v3

    int-to-float v0, v0

    invoke-virtual {v1, v2, v0}, Lcom/roidapp/photogrid/release/ra;->b(FF)V

    .line 2543
    const/4 v0, 0x1

    iput-boolean v0, v1, Lcom/roidapp/photogrid/release/ra;->f:Z

    .line 2544
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoView;->a(Lcom/roidapp/photogrid/release/ao;)V

    .line 251
    :cond_a
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x13

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 252
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/release/mw;->d(II)V

    .line 253
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x14

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 254
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->j:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 3309
    new-instance v2, Ljava/lang/Thread;

    new-instance v3, Lcom/roidapp/photogrid/release/mx;

    invoke-direct {v3, p0, v0, v1}, Lcom/roidapp/photogrid/release/mx;-><init>(Lcom/roidapp/photogrid/release/mw;II)V

    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 278
    :goto_6
    return-void

    .line 1108
    :cond_b
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->i:[Lcom/roidapp/photogrid/release/ig;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ig;->e()Ljava/lang/String;

    move-result-object v0

    move-object v3, v0

    goto/16 :goto_0

    .line 1125
    :cond_c
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    div-float v0, v1, v0

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/ih;->b(F)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1

    .line 255
    :catch_0
    move-exception v0

    .line 256
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/mw;->m()V

    .line 257
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_15

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "bg create decodeBitmap null"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "sticker create bitmap null"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_15

    .line 258
    :cond_d
    iget v1, p0, Lcom/roidapp/photogrid/release/mw;->C:F

    cmpl-float v1, v1, v10

    if-nez v1, :cond_13

    .line 259
    const/high16 v0, 0x3f400000    # 0.75f

    iput v0, p0, Lcom/roidapp/photogrid/release/mw;->C:F

    .line 260
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->K:Landroid/os/Handler;

    invoke-virtual {v0, v9}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_6

    .line 1161
    :cond_e
    const/16 v0, 0x8

    :try_start_1
    invoke-virtual {v6, v0}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_2

    .line 1164
    :cond_f
    const/16 v0, 0x8

    invoke-virtual {v6, v0}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_2

    :cond_10
    move v0, v2

    .line 1177
    goto/16 :goto_3

    .line 1189
    :cond_11
    iget v0, p0, Lcom/roidapp/photogrid/release/mw;->w:I

    .line 1190
    int-to-float v1, v0

    div-float/2addr v1, v3

    float-to-int v1, v1

    goto/16 :goto_4

    .line 1293
    :cond_12
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->h:Landroid/app/Activity;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->y:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/mw;->B:[I

    iget v3, p0, Lcom/roidapp/photogrid/release/mw;->m:I

    iget-object v4, p0, Lcom/roidapp/photogrid/release/mw;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v4, v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;Ljava/util/ArrayList;[III)V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_5

    .line 262
    :cond_13
    iget v1, p0, Lcom/roidapp/photogrid/release/mw;->C:F

    const/high16 v2, 0x3f400000    # 0.75f

    cmpl-float v1, v1, v2

    if-nez v1, :cond_14

    .line 263
    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lcom/roidapp/photogrid/release/mw;->C:F

    .line 264
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->K:Landroid/os/Handler;

    invoke-virtual {v0, v9}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_6

    .line 267
    :cond_14
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 268
    iput v10, p0, Lcom/roidapp/photogrid/release/mw;->C:F

    .line 269
    const/16 v0, 0x8e

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/mw;->d(I)V

    goto/16 :goto_6

    .line 273
    :cond_15
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 274
    iput v10, p0, Lcom/roidapp/photogrid/release/mw;->C:F

    .line 275
    const/16 v0, 0x8f

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/mw;->d(I)V

    goto/16 :goto_6

    :cond_16
    move v0, v1

    goto/16 :goto_3
.end method

.method public final a(Landroid/widget/RelativeLayout;Landroid/view/View$OnTouchListener;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 550
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/mw;->H:Z

    if-eqz v0, :cond_1

    .line 601
    :cond_0
    :goto_0
    return-void

    .line 556
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->q:Lcom/roidapp/photogrid/release/an;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    if-nez v0, :cond_2

    .line 557
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->p:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->q:Lcom/roidapp/photogrid/release/an;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 559
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x4b

    invoke-virtual {v0, v1, v3}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 561
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v1, v1

    if-ne v0, v1, :cond_0

    move v2, v3

    .line 562
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-ge v2, v0, :cond_3

    .line 563
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->k:Landroid/widget/RelativeLayout;

    add-int/lit8 v1, v2, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/if;

    .line 564
    if-nez v0, :cond_8

    .line 565
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/mw;->a()V

    .line 579
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->E:Lcom/roidapp/photogrid/release/az;

    if-eqz v0, :cond_5

    .line 580
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 581
    if-eqz v0, :cond_4

    .line 582
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 584
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->j:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 587
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->D:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_7

    .line 588
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 589
    if-eqz v0, :cond_6

    .line 590
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 592
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->j:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 595
    :cond_7
    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 596
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->h:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f09010a

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v0, v3, v3, v3, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 597
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 598
    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->removeAllViews()V

    .line 599
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->j:Landroid/view/ViewGroup;

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    goto/16 :goto_0

    .line 568
    :cond_8
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 569
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 570
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/if;->b(Landroid/graphics/Bitmap;)V

    .line 571
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/if;->a(Landroid/graphics/Bitmap;)V

    .line 572
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->l:Lcom/roidapp/photogrid/release/ml;

    mul-int/lit8 v1, v2, 0x2

    add-int/lit8 v1, v1, 0x4c

    invoke-virtual {v0, v1, v3}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 562
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto/16 :goto_1
.end method

.method public final b(Z)I
    .locals 1

    .prologue
    .line 650
    const/4 v0, 0x0

    return v0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 605
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/mw;->H:Z

    .line 606
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->j:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 607
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 609
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/mw;->m()V

    .line 610
    return-void
.end method

.method public final b(II)V
    .locals 0

    .prologue
    .line 657
    return-void
.end method

.method public final b(IZ)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    const/4 v4, 0x0

    .line 718
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->y:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 746
    :cond_0
    :goto_0
    return-void

    .line 721
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->j:Landroid/view/ViewGroup;

    add-int/lit8 v1, p1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/if;

    .line 722
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    .line 723
    iget-object v2, p0, Lcom/roidapp/photogrid/release/mw;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput-boolean p2, v2, Lcom/roidapp/photogrid/release/ig;->B:Z

    .line 725
    iget-object v2, p0, Lcom/roidapp/photogrid/release/mw;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    const/high16 v3, 0x3f800000    # 1.0f

    iput v3, v2, Lcom/roidapp/photogrid/release/ig;->v:F

    .line 726
    iget-object v2, p0, Lcom/roidapp/photogrid/release/mw;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput v4, v2, Lcom/roidapp/photogrid/release/ig;->t:F

    .line 727
    iget-object v2, p0, Lcom/roidapp/photogrid/release/mw;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput v4, v2, Lcom/roidapp/photogrid/release/ig;->u:F

    .line 728
    iget-object v2, p0, Lcom/roidapp/photogrid/release/mw;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput v5, v2, Lcom/roidapp/photogrid/release/ig;->p:I

    .line 729
    iget-object v2, p0, Lcom/roidapp/photogrid/release/mw;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput v5, v2, Lcom/roidapp/photogrid/release/ig;->x:I

    .line 730
    iget-object v2, p0, Lcom/roidapp/photogrid/release/mw;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput v6, v2, Lcom/roidapp/photogrid/release/ig;->r:I

    .line 731
    iget-object v2, p0, Lcom/roidapp/photogrid/release/mw;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput v6, v2, Lcom/roidapp/photogrid/release/ig;->s:I

    .line 739
    iget-object v2, p0, Lcom/roidapp/photogrid/release/mw;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput-object v2, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    .line 740
    iget-object v1, v1, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/if;->a(Landroid/graphics/Bitmap;)V

    goto :goto_0
.end method

.method public final c(I)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 687
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->k:Landroid/widget/RelativeLayout;

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/mw;->a(Landroid/widget/RelativeLayout;)V

    .line 688
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/release/mw;->d(II)V

    .line 690
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v1, v1

    if-ne v0, v1, :cond_0

    move v2, v3

    .line 691
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-ge v2, v0, :cond_0

    .line 692
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->k:Landroid/widget/RelativeLayout;

    add-int/lit8 v1, v2, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/if;

    .line 693
    if-nez v0, :cond_1

    .line 698
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/mw;->a()V

    .line 709
    :cond_0
    return-void

    .line 702
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 703
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 704
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/if;->b(Landroid/graphics/Bitmap;)V

    .line 705
    if-ne p1, v4, :cond_2

    move v1, v4

    :goto_1
    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/if;->D:Z

    .line 706
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/if;->invalidate()V

    .line 691
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :cond_2
    move v1, v3

    .line 705
    goto :goto_1
.end method

.method public final c(II)V
    .locals 0

    .prologue
    .line 663
    return-void
.end method

.method public final f()V
    .locals 2

    .prologue
    .line 614
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->A:Ljava/util/List;

    if-nez v0, :cond_0

    .line 615
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/mw;->A:Ljava/util/List;

    .line 617
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->D:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_2

    .line 618
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->z:Ljava/util/List;

    if-nez v0, :cond_1

    .line 619
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/mw;->z:Ljava/util/List;

    .line 621
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->z:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->e()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 622
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->z:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->j(Ljava/util/List;)V

    .line 624
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->E:Lcom/roidapp/photogrid/release/az;

    if-eqz v0, :cond_3

    .line 625
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->A:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 626
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/mw;->A:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->e(Ljava/util/List;)V

    .line 627
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mw;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 629
    :cond_3
    return-void
.end method
