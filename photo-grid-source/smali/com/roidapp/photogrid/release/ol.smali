.class public final Lcom/roidapp/photogrid/release/ol;
.super Lcom/roidapp/photogrid/release/oi;
.source "SourceFile"


# instance fields
.field private A:I

.field private B:F

.field private final C:I

.field private r:Lcom/roidapp/photogrid/release/mm;

.field private s:I

.field private t:I

.field private u:I

.field private v:I

.field private w:I

.field private x:I

.field private y:Landroid/graphics/Bitmap;

.field private z:I


# direct methods
.method public constructor <init>(Landroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/mm;Lcom/roidapp/photogrid/release/az;)V
    .locals 1

    .prologue
    .line 44
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/oi;-><init>()V

    .line 359
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/photogrid/release/ol;->u:I

    .line 363
    const/16 v0, 0x500

    iput v0, p0, Lcom/roidapp/photogrid/release/ol;->C:I

    .line 45
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    .line 46
    iput-object p2, p0, Lcom/roidapp/photogrid/release/ol;->c:[Lcom/roidapp/photogrid/release/ig;

    .line 47
    iput-object p3, p0, Lcom/roidapp/photogrid/release/ol;->d:Lcom/roidapp/photogrid/release/ml;

    .line 48
    iput-object p4, p0, Lcom/roidapp/photogrid/release/ol;->g:Lcom/roidapp/photogrid/release/PhotoView;

    .line 49
    iput-object p5, p0, Lcom/roidapp/photogrid/release/ol;->r:Lcom/roidapp/photogrid/release/mm;

    .line 51
    iput-object p6, p0, Lcom/roidapp/photogrid/release/ol;->h:Lcom/roidapp/photogrid/release/az;

    .line 52
    return-void
.end method

.method private a(FIILandroid/graphics/Bitmap;)V
    .locals 24

    .prologue
    .line 366
    const/4 v12, 0x0

    const/4 v11, 0x0

    .line 367
    const/4 v10, 0x0

    const/4 v9, 0x0

    const/4 v8, 0x0

    const/4 v7, 0x0

    .line 369
    new-instance v14, Landroid/graphics/Canvas;

    move-object/from16 v0, p4

    invoke-direct {v14, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 370
    new-instance v2, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v3, 0x0

    const/4 v4, 0x7

    invoke-direct {v2, v3, v4}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v14, v2}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 376
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    .line 377
    move/from16 v0, p2

    move-object/from16 v1, p0

    iput v0, v1, Lcom/roidapp/photogrid/release/ol;->s:I

    .line 378
    move/from16 v0, p3

    move-object/from16 v1, p0

    iput v0, v1, Lcom/roidapp/photogrid/release/ol;->t:I

    .line 381
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v3, v3

    mul-float v3, v3, p1

    float-to-int v3, v3

    .line 382
    int-to-float v3, v3

    const/high16 v4, 0x44a00000    # 1280.0f

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    invoke-virtual {v5}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v4, v5

    div-float/2addr v3, v4

    move-object/from16 v0, p0

    iput v3, v0, Lcom/roidapp/photogrid/release/ol;->B:F

    .line 385
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->A()I

    move-result v3

    move-object/from16 v0, p0

    iput v3, v0, Lcom/roidapp/photogrid/release/ol;->u:I

    .line 386
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->x()I

    move-result v3

    move-object/from16 v0, p0

    iput v3, v0, Lcom/roidapp/photogrid/release/ol;->v:I

    .line 387
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->y()I

    move-result v3

    move-object/from16 v0, p0

    iput v3, v0, Lcom/roidapp/photogrid/release/ol;->w:I

    .line 388
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->z()I

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Lcom/roidapp/photogrid/release/ol;->x:I

    .line 391
    move-object/from16 v0, p0

    invoke-direct {v0, v14}, Lcom/roidapp/photogrid/release/ol;->a(Landroid/graphics/Canvas;)V

    .line 395
    const/16 v2, 0x23

    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lcom/roidapp/photogrid/release/ol;->c(I)V

    .line 398
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/ol;->g:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoView;->e()Ljava/util/List;

    move-result-object v15

    .line 400
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0205c8

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    check-cast v2, Landroid/graphics/drawable/NinePatchDrawable;

    .line 401
    new-instance v16, Ljava/util/HashMap;

    invoke-direct/range {v16 .. v16}, Ljava/util/HashMap;-><init>()V

    .line 402
    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    move v13, v3

    :goto_0
    if-ltz v13, :cond_f

    .line 403
    invoke-interface {v15, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/roidapp/photogrid/release/ao;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    invoke-virtual {v3, v4}, Lcom/roidapp/photogrid/release/ao;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/release/ao;

    move-result-object v4

    .line 404
    instance-of v3, v4, Lcom/roidapp/photogrid/release/qz;

    if-eqz v3, :cond_3

    .line 405
    const/4 v6, 0x1

    move-object v3, v4

    .line 407
    check-cast v3, Lcom/roidapp/photogrid/release/qz;

    .line 409
    iget-object v5, v3, Lcom/roidapp/photogrid/release/qz;->T:Ljava/lang/String;

    move-object/from16 v0, v16

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 410
    iget-object v5, v3, Lcom/roidapp/photogrid/release/qz;->T:Ljava/lang/String;

    move-object/from16 v0, v16

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 411
    iget-object v11, v3, Lcom/roidapp/photogrid/release/qz;->T:Ljava/lang/String;

    add-int/lit8 v5, v5, 0x1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v0, v16

    invoke-virtual {v0, v11, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    :goto_1
    const-string v5, "text"

    iget-object v11, v3, Lcom/roidapp/photogrid/release/qz;->T:Ljava/lang/String;

    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 418
    const-string v5, ".thanksgiving"

    iget-object v11, v3, Lcom/roidapp/photogrid/release/qz;->T:Ljava/lang/String;

    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    const-string v5, ".givethanks"

    iget-object v11, v3, Lcom/roidapp/photogrid/release/qz;->T:Ljava/lang/String;

    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 420
    :cond_0
    const/4 v5, 0x1

    sput-boolean v5, Lcom/roidapp/photogrid/common/az;->F:Z

    .line 425
    :cond_1
    iget v5, v3, Lcom/roidapp/photogrid/release/qz;->j:F

    mul-float v5, v5, p1

    iput v5, v3, Lcom/roidapp/photogrid/release/qz;->j:F

    .line 426
    iget v5, v3, Lcom/roidapp/photogrid/release/qz;->k:F

    mul-float v5, v5, p1

    iput v5, v3, Lcom/roidapp/photogrid/release/qz;->k:F

    .line 427
    move/from16 v0, p2

    iput v0, v3, Lcom/roidapp/photogrid/release/qz;->c:I

    .line 428
    move/from16 v0, p3

    iput v0, v3, Lcom/roidapp/photogrid/release/qz;->d:I

    .line 429
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/qz;->g()V

    .line 430
    invoke-virtual {v3, v14}, Lcom/roidapp/photogrid/release/qz;->a(Landroid/graphics/Canvas;)V

    move v3, v8

    move v5, v9

    move v8, v6

    move v9, v12

    move v6, v10

    .line 531
    :goto_2
    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ao;->a()V

    .line 402
    add-int/lit8 v4, v13, -0x1

    move v13, v4

    move v10, v6

    move v11, v8

    move v12, v9

    move v9, v5

    move v8, v3

    goto/16 :goto_0

    .line 413
    :cond_2
    iget-object v5, v3, Lcom/roidapp/photogrid/release/qz;->T:Ljava/lang/String;

    const/4 v11, 0x1

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    move-object/from16 v0, v16

    invoke-virtual {v0, v5, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 431
    :cond_3
    instance-of v3, v4, Lcom/roidapp/photogrid/release/ps;

    if-eqz v3, :cond_a

    .line 432
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v3, v4, Lcom/roidapp/photogrid/release/ao;->g:Ljava/lang/String;

    iget v5, v4, Lcom/roidapp/photogrid/release/ao;->q:I

    int-to-double v0, v5

    move-wide/from16 v18, v0

    const-wide/high16 v20, 0x4010000000000000L    # 4.0

    iget v5, v4, Lcom/roidapp/photogrid/release/ao;->h:F

    float-to-double v0, v5

    move-wide/from16 v22, v0

    mul-double v20, v20, v22

    iget v5, v4, Lcom/roidapp/photogrid/release/ao;->i:F

    float-to-double v0, v5

    move-wide/from16 v22, v0

    mul-double v20, v20, v22

    sub-double v18, v18, v20

    move/from16 v0, p1

    float-to-double v0, v0

    move-wide/from16 v20, v0

    mul-double v18, v18, v20

    move-wide/from16 v0, v18

    double-to-int v5, v0

    invoke-static {v3, v5}, Lcom/roidapp/photogrid/release/rf;->a(Ljava/lang/String;I)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 434
    if-nez v5, :cond_5

    .line 608
    :cond_4
    :goto_3
    return-void

    .line 438
    :cond_5
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/imagelib/filter/aa;->g()Z

    move-result v3

    if-eqz v3, :cond_6

    .line 439
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    mul-int/lit8 v3, v3, 0x2

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    sget-object v17, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    move-object/from16 v0, v17

    invoke-static {v3, v6, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 440
    if-eqz v3, :cond_6

    .line 441
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    .line 445
    :cond_6
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    .line 446
    sget v3, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v17, 0x8

    move/from16 v0, v17

    if-ne v3, v0, :cond_8

    .line 447
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    invoke-static {v3}, Lcom/roidapp/photogrid/filter/b;->b(Landroid/content/Context;)Lcom/roidapp/imagelib/e/b;

    move-result-object v17

    move-object v3, v4

    check-cast v3, Lcom/roidapp/photogrid/release/ps;

    iget-object v3, v3, Lcom/roidapp/photogrid/release/ps;->H:Lcom/roidapp/photogrid/release/ig;

    move-object/from16 v0, v17

    invoke-static {v0, v5, v3}, Lcom/roidapp/photogrid/filter/b;->a(Lcom/roidapp/imagelib/e/b;Landroid/graphics/Bitmap;Lcom/roidapp/photogrid/release/ig;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 453
    :goto_4
    if-eqz v3, :cond_4

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v5

    if-nez v5, :cond_4

    .line 456
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    .line 457
    if-ge v5, v6, :cond_7

    .line 458
    int-to-float v6, v6

    int-to-float v5, v5

    div-float v5, v6, v5

    .line 459
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    .line 3590
    invoke-static {v3, v5, v5}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/graphics/Bitmap;FF)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 460
    if-eqz v3, :cond_4

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v5

    if-nez v5, :cond_4

    :cond_7
    move-object v6, v3

    .line 464
    iget v5, v4, Lcom/roidapp/photogrid/release/ao;->i:F

    move-object v3, v4

    .line 465
    check-cast v3, Lcom/roidapp/photogrid/release/ps;

    const/16 v17, 0x1

    move/from16 v0, v17

    iput-boolean v0, v3, Lcom/roidapp/photogrid/release/ps;->J:Z

    .line 466
    mul-float v3, v5, p1

    iget v0, v4, Lcom/roidapp/photogrid/release/ao;->h:F

    move/from16 v17, v0

    mul-float v3, v3, v17

    iput v3, v4, Lcom/roidapp/photogrid/release/ao;->i:F

    move-object v3, v4

    .line 467
    check-cast v3, Lcom/roidapp/photogrid/release/ps;

    mul-float v5, v5, p1

    iput v5, v3, Lcom/roidapp/photogrid/release/ps;->P:F

    move-object v3, v4

    .line 468
    check-cast v3, Lcom/roidapp/photogrid/release/ps;

    move-object v5, v4

    check-cast v5, Lcom/roidapp/photogrid/release/ps;

    iget v5, v5, Lcom/roidapp/photogrid/release/ps;->N:F

    mul-float v5, v5, p1

    iput v5, v3, Lcom/roidapp/photogrid/release/ps;->N:F

    move-object v3, v4

    .line 469
    check-cast v3, Lcom/roidapp/photogrid/release/ps;

    move-object v5, v4

    check-cast v5, Lcom/roidapp/photogrid/release/ps;

    iget v5, v5, Lcom/roidapp/photogrid/release/ps;->O:F

    mul-float v5, v5, p1

    iput v5, v3, Lcom/roidapp/photogrid/release/ps;->O:F

    .line 470
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-float v5, v3

    move-object v3, v4

    check-cast v3, Lcom/roidapp/photogrid/release/ps;

    iget v3, v3, Lcom/roidapp/photogrid/release/ps;->N:F

    div-float/2addr v5, v3

    .line 471
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-float v0, v3

    move/from16 v17, v0

    move-object v3, v4

    check-cast v3, Lcom/roidapp/photogrid/release/ps;

    iget v3, v3, Lcom/roidapp/photogrid/release/ps;->O:F

    div-float v17, v17, v3

    .line 472
    cmpl-float v3, v5, v17

    if-lez v3, :cond_9

    move-object v3, v4

    .line 473
    check-cast v3, Lcom/roidapp/photogrid/release/ps;

    iput v5, v3, Lcom/roidapp/photogrid/release/ps;->Q:F

    .line 477
    :goto_5
    move/from16 v0, p3

    iput v0, v4, Lcom/roidapp/photogrid/release/ao;->d:I

    .line 478
    move/from16 v0, p2

    iput v0, v4, Lcom/roidapp/photogrid/release/ao;->c:I

    .line 479
    iget v3, v4, Lcom/roidapp/photogrid/release/ao;->j:F

    mul-float v3, v3, p1

    iput v3, v4, Lcom/roidapp/photogrid/release/ao;->j:F

    .line 480
    iget v3, v4, Lcom/roidapp/photogrid/release/ao;->k:F

    mul-float v3, v3, p1

    iput v3, v4, Lcom/roidapp/photogrid/release/ao;->k:F

    move-object v3, v4

    .line 482
    check-cast v3, Lcom/roidapp/photogrid/release/ps;

    invoke-virtual {v3, v2}, Lcom/roidapp/photogrid/release/ps;->a(Landroid/graphics/drawable/NinePatchDrawable;)V

    move-object v3, v4

    .line 483
    check-cast v3, Lcom/roidapp/photogrid/release/ps;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    invoke-virtual {v5}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->densityDpi:I

    const/16 v17, 0x1

    move/from16 v0, v17

    invoke-virtual {v3, v5, v0}, Lcom/roidapp/photogrid/release/ps;->a(IZ)V

    move-object v3, v4

    .line 484
    check-cast v3, Lcom/roidapp/photogrid/release/ps;

    iget v5, v4, Lcom/roidapp/photogrid/release/ao;->i:F

    invoke-virtual {v3, v5}, Lcom/roidapp/photogrid/release/ps;->c(F)V

    move-object v3, v4

    .line 485
    check-cast v3, Lcom/roidapp/photogrid/release/ps;

    const/4 v5, 0x1

    invoke-virtual {v3, v6, v5}, Lcom/roidapp/photogrid/release/ps;->a(Landroid/graphics/Bitmap;Z)V

    move-object v3, v4

    .line 487
    check-cast v3, Lcom/roidapp/photogrid/release/ps;

    invoke-virtual {v3, v14}, Lcom/roidapp/photogrid/release/ps;->a(Landroid/graphics/Canvas;)V

    move v3, v8

    move v5, v9

    move v6, v10

    move v8, v11

    move v9, v12

    .line 488
    goto/16 :goto_2

    .line 449
    :cond_8
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    invoke-static {v3}, Lcom/roidapp/photogrid/filter/b;->a(Landroid/content/Context;)Lcom/roidapp/imagelib/e/b;

    move-result-object v17

    move-object v3, v4

    check-cast v3, Lcom/roidapp/photogrid/release/ps;

    iget-object v3, v3, Lcom/roidapp/photogrid/release/ps;->H:Lcom/roidapp/photogrid/release/ig;

    move-object/from16 v0, v17

    invoke-static {v0, v5, v3}, Lcom/roidapp/photogrid/filter/b;->a(Lcom/roidapp/imagelib/e/b;Landroid/graphics/Bitmap;Lcom/roidapp/photogrid/release/ig;)Landroid/graphics/Bitmap;

    move-result-object v3

    goto/16 :goto_4

    :cond_9
    move-object v3, v4

    .line 475
    check-cast v3, Lcom/roidapp/photogrid/release/ps;

    move/from16 v0, v17

    iput v0, v3, Lcom/roidapp/photogrid/release/ps;->Q:F

    goto :goto_5

    .line 489
    :cond_a
    const/4 v9, 0x1

    move-object v3, v4

    .line 490
    check-cast v3, Lcom/roidapp/photogrid/release/ra;

    .line 492
    iget v5, v3, Lcom/roidapp/photogrid/release/ra;->ad:F

    mul-float v5, v5, p1

    iput v5, v3, Lcom/roidapp/photogrid/release/ra;->ad:F

    .line 493
    iget v5, v3, Lcom/roidapp/photogrid/release/ra;->ah:F

    move/from16 v0, p1

    invoke-virtual {v3, v5, v0}, Lcom/roidapp/photogrid/release/ra;->e(FF)V

    .line 494
    iget v5, v3, Lcom/roidapp/photogrid/release/ra;->Y:F

    mul-float v5, v5, p1

    iput v5, v3, Lcom/roidapp/photogrid/release/ra;->Y:F

    .line 495
    iget v5, v3, Lcom/roidapp/photogrid/release/ra;->Z:F

    mul-float v5, v5, p1

    iput v5, v3, Lcom/roidapp/photogrid/release/ra;->Z:F

    .line 496
    iget v5, v3, Lcom/roidapp/photogrid/release/ra;->ai:F

    mul-float v5, v5, p1

    iput v5, v3, Lcom/roidapp/photogrid/release/ra;->ai:F

    .line 498
    iget v5, v3, Lcom/roidapp/photogrid/release/ra;->av:F

    mul-float v5, v5, p1

    iput v5, v3, Lcom/roidapp/photogrid/release/ra;->av:F

    .line 499
    iget v5, v3, Lcom/roidapp/photogrid/release/ra;->aw:F

    mul-float v5, v5, p1

    iput v5, v3, Lcom/roidapp/photogrid/release/ra;->aw:F

    .line 500
    iget v5, v3, Lcom/roidapp/photogrid/release/ra;->aa:F

    mul-float v5, v5, p1

    iput v5, v3, Lcom/roidapp/photogrid/release/ra;->aa:F

    .line 501
    iget v5, v3, Lcom/roidapp/photogrid/release/ra;->d:I

    int-to-float v5, v5

    mul-float v5, v5, p1

    float-to-int v5, v5

    iput v5, v3, Lcom/roidapp/photogrid/release/ra;->d:I

    .line 502
    iget v5, v3, Lcom/roidapp/photogrid/release/ra;->c:I

    int-to-float v5, v5

    mul-float v5, v5, p1

    float-to-int v5, v5

    iput v5, v3, Lcom/roidapp/photogrid/release/ra;->c:I

    .line 503
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ra;->i()V

    .line 506
    move/from16 v0, p2

    move/from16 v1, p3

    if-le v0, v1, :cond_b

    .line 507
    move/from16 v0, p2

    int-to-float v5, v0

    const/high16 v6, 0x44a00000    # 1280.0f

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    invoke-virtual {v7}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v7

    iget v7, v7, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v6, v7

    div-float/2addr v5, v6

    invoke-virtual {v3, v5}, Lcom/roidapp/photogrid/release/ra;->e(F)V

    .line 512
    :goto_6
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ra;->k()V

    .line 516
    iget-object v5, v3, Lcom/roidapp/photogrid/release/ra;->b:Landroid/graphics/Matrix;

    iget v6, v3, Lcom/roidapp/photogrid/release/ra;->h:F

    iget v7, v3, Lcom/roidapp/photogrid/release/ra;->h:F

    iget-object v8, v3, Lcom/roidapp/photogrid/release/ra;->o:[F

    const/16 v10, 0x10

    aget v8, v8, v10

    iget-object v10, v3, Lcom/roidapp/photogrid/release/ra;->o:[F

    const/16 v12, 0x11

    aget v10, v10, v12

    invoke-virtual {v5, v6, v7, v8, v10}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 517
    iget-object v5, v3, Lcom/roidapp/photogrid/release/ra;->G:Landroid/graphics/Matrix;

    iget v6, v3, Lcom/roidapp/photogrid/release/ra;->h:F

    iget v7, v3, Lcom/roidapp/photogrid/release/ra;->h:F

    iget-object v8, v3, Lcom/roidapp/photogrid/release/ra;->o:[F

    const/16 v10, 0x10

    aget v8, v8, v10

    iget-object v10, v3, Lcom/roidapp/photogrid/release/ra;->o:[F

    const/16 v12, 0x11

    aget v10, v10, v12

    invoke-virtual {v5, v6, v7, v8, v10}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 518
    iget-object v5, v3, Lcom/roidapp/photogrid/release/ra;->H:Landroid/graphics/Matrix;

    iget v6, v3, Lcom/roidapp/photogrid/release/ra;->h:F

    iget v7, v3, Lcom/roidapp/photogrid/release/ra;->h:F

    iget-object v8, v3, Lcom/roidapp/photogrid/release/ra;->o:[F

    const/16 v10, 0x10

    aget v8, v8, v10

    iget-object v10, v3, Lcom/roidapp/photogrid/release/ra;->o:[F

    const/16 v12, 0x11

    aget v10, v10, v12

    invoke-virtual {v5, v6, v7, v8, v10}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 520
    iget v5, v4, Lcom/roidapp/photogrid/release/ao;->l:F

    invoke-virtual {v3, v5}, Lcom/roidapp/photogrid/release/ra;->b(F)V

    .line 522
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ra;->e()[F

    move-result-object v5

    .line 523
    iget-object v6, v3, Lcom/roidapp/photogrid/release/ra;->H:Landroid/graphics/Matrix;

    iget-object v7, v3, Lcom/roidapp/photogrid/release/ra;->r:[F

    const/4 v8, 0x0

    aget v7, v7, v8

    mul-float v7, v7, p1

    const/4 v8, 0x0

    aget v8, v5, v8

    sub-float/2addr v7, v8

    iget-object v8, v3, Lcom/roidapp/photogrid/release/ra;->r:[F

    const/4 v10, 0x1

    aget v8, v8, v10

    mul-float v8, v8, p1

    const/4 v10, 0x1

    aget v10, v5, v10

    sub-float/2addr v8, v10

    invoke-virtual {v6, v7, v8}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 524
    iget-object v6, v3, Lcom/roidapp/photogrid/release/ra;->G:Landroid/graphics/Matrix;

    iget-object v7, v3, Lcom/roidapp/photogrid/release/ra;->r:[F

    const/4 v8, 0x0

    aget v7, v7, v8

    mul-float v7, v7, p1

    const/4 v8, 0x0

    aget v8, v5, v8

    sub-float/2addr v7, v8

    iget-object v8, v3, Lcom/roidapp/photogrid/release/ra;->r:[F

    const/4 v10, 0x1

    aget v8, v8, v10

    mul-float v8, v8, p1

    const/4 v10, 0x1

    aget v5, v5, v10

    sub-float v5, v8, v5

    invoke-virtual {v6, v7, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 525
    iget-boolean v8, v3, Lcom/roidapp/photogrid/release/ra;->ag:Z

    .line 526
    iget v5, v3, Lcom/roidapp/photogrid/release/ra;->af:I

    const/16 v6, -0x15

    if-eq v5, v6, :cond_c

    const/4 v5, 0x1

    .line 527
    :goto_7
    iget v6, v3, Lcom/roidapp/photogrid/release/ra;->ae:I

    const/high16 v7, -0x1000000

    if-eq v6, v7, :cond_d

    const/4 v6, 0x1

    .line 528
    :goto_8
    iget v7, v3, Lcom/roidapp/photogrid/release/ra;->P:I

    const/4 v10, 0x2

    if-eq v7, v10, :cond_e

    const/4 v7, 0x1

    .line 529
    :goto_9
    invoke-virtual {v3, v14}, Lcom/roidapp/photogrid/release/ra;->a(Landroid/graphics/Canvas;)V

    move v3, v8

    move v8, v11

    goto/16 :goto_2

    .line 509
    :cond_b
    move/from16 v0, p3

    int-to-float v5, v0

    const/high16 v6, 0x44a00000    # 1280.0f

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    invoke-virtual {v7}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v7

    iget v7, v7, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v6, v7

    div-float/2addr v5, v6

    invoke-virtual {v3, v5}, Lcom/roidapp/photogrid/release/ra;->e(F)V

    goto/16 :goto_6

    .line 526
    :cond_c
    const/4 v5, 0x0

    goto :goto_7

    .line 527
    :cond_d
    const/4 v6, 0x0

    goto :goto_8

    .line 528
    :cond_e
    const/4 v7, 0x0

    goto :goto_9

    .line 535
    :cond_f
    move-object/from16 v0, p0

    move/from16 v1, p1

    invoke-direct {v0, v14, v1}, Lcom/roidapp/photogrid/release/ol;->a(Landroid/graphics/Canvas;F)V

    .line 537
    if-eqz v12, :cond_10

    .line 538
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    const-string v3, "FreeActivity/Save/HasText"

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 540
    :cond_10
    if-eqz v11, :cond_12

    .line 542
    const-string v2, ""

    .line 543
    invoke-virtual/range {v16 .. v16}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move-object v4, v2

    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 544
    move-object/from16 v0, v16

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 545
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v6, "/"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, ":"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object v4, v2

    .line 547
    goto :goto_a

    .line 549
    :cond_11
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "FreeActivity/Save/HasSticker"

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 551
    :cond_12
    if-eqz v9, :cond_13

    .line 552
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    const-string v3, "FreeActivity/Save/HasTextBorder"

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 554
    :cond_13
    if-eqz v8, :cond_14

    .line 555
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    const-string v3, "FreeActivity/Save/HasTextShadow"

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 558
    :cond_14
    if-eqz v10, :cond_15

    .line 559
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    const-string v3, "FreeActivity/Save/HasTextBackground"

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 561
    :cond_15
    if-eqz v7, :cond_16

    .line 562
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    const-string v3, "FreeActivity/Save/HasTextColor"

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 564
    :cond_16
    sget-boolean v2, Lcom/roidapp/photogrid/common/az;->C:Z

    if-eqz v2, :cond_18

    .line 565
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    const-string v3, "FreeActivity/Save/Background/Image"

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 571
    :goto_b
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    check-cast v2, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->R()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/photogrid/release/ol;->d()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 573
    move/from16 v0, p2

    int-to-float v2, v0

    const v3, 0x3e4ccccd    # 0.2f

    mul-float/2addr v2, v3

    .line 574
    move/from16 v0, p2

    move/from16 v1, p3

    if-le v0, v1, :cond_17

    .line 575
    move/from16 v0, p3

    int-to-float v2, v0

    const v3, 0x3e4ccccd    # 0.2f

    mul-float/2addr v2, v3

    .line 591
    :cond_17
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    const v4, 0x7f020608

    invoke-static {v3, v4, v2}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;IF)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 593
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    if-le v4, v5, :cond_19

    .line 594
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v2, v4

    .line 598
    :goto_c
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    .line 4590
    invoke-static {v3, v2, v2}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/graphics/Bitmap;FF)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 600
    move/from16 v0, p2

    move/from16 v1, p3

    if-le v0, v1, :cond_1a

    .line 601
    move/from16 v0, p3

    int-to-float v2, v0

    .line 605
    :goto_d
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    sub-int v4, p2, v4

    int-to-float v4, v4

    const v5, 0x3ca3d70a    # 0.02f

    mul-float/2addr v5, v2

    sub-float/2addr v4, v5

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    sub-int v5, p3, v5

    int-to-float v5, v5

    const v6, 0x3ca3d70a    # 0.02f

    mul-float/2addr v2, v6

    sub-float v2, v5, v2

    const/4 v5, 0x0

    invoke-virtual {v14, v3, v4, v2, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 606
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    goto/16 :goto_3

    .line 567
    :cond_18
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "FreeActivity/Save/Background/position: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ih;->x()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/PattenIndex0: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ih;->y()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/PattenIndex1: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ih;->z()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_b

    .line 596
    :cond_19
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v2, v4

    goto :goto_c

    .line 603
    :cond_1a
    move/from16 v0, p2

    int-to-float v2, v0

    goto :goto_d
.end method

.method private static a(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 838
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 839
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 842
    :cond_0
    return-void
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 11

    .prologue
    const/high16 v10, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    const/high16 v9, 0x40000000    # 2.0f

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 651
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->C:Z

    if-nez v0, :cond_4

    .line 653
    iget v0, p0, Lcom/roidapp/photogrid/release/ol;->v:I

    const/16 v2, -0x14

    if-eq v0, v2, :cond_0

    .line 654
    iget v0, p0, Lcom/roidapp/photogrid/release/ol;->v:I

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 690
    :goto_0
    return-void

    .line 656
    :cond_0
    const/4 v0, 0x2

    new-array v0, v0, [I

    iget v2, p0, Lcom/roidapp/photogrid/release/ol;->w:I

    aput v2, v0, v6

    iget v2, p0, Lcom/roidapp/photogrid/release/ol;->x:I

    aput v2, v0, v7

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ol;->a([I)V

    .line 657
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 658
    new-instance v5, Landroid/graphics/Paint;

    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    .line 659
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 660
    iget v0, p0, Lcom/roidapp/photogrid/release/ol;->s:I

    int-to-float v3, v0

    iget v0, p0, Lcom/roidapp/photogrid/release/ol;->t:I

    int-to-float v4, v0

    move-object v0, p1

    move v2, v1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 661
    iget v0, p0, Lcom/roidapp/photogrid/release/ol;->u:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 662
    new-array v0, v6, [I

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ol;->a([I)V

    .line 663
    iput v7, p0, Lcom/roidapp/photogrid/release/ol;->u:I

    .line 665
    :cond_1
    const/4 v0, -0x1

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 666
    new-instance v0, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v1, 0x6

    invoke-direct {v0, v6, v1}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    move v0, v6

    .line 667
    :goto_1
    iget v1, p0, Lcom/roidapp/photogrid/release/ol;->A:I

    if-ge v0, v1, :cond_3

    move v1, v6

    .line 668
    :goto_2
    iget v2, p0, Lcom/roidapp/photogrid/release/ol;->z:I

    if-ge v1, v2, :cond_2

    .line 669
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    mul-int/2addr v3, v1

    int-to-float v3, v3

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    mul-int/2addr v4, v0

    int-to-float v4, v4

    const/4 v5, 0x0

    invoke-virtual {p1, v2, v3, v4, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 668
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 667
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 672
    :cond_3
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 673
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ol;->a(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 678
    :cond_4
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aB()Ljava/lang/String;

    move-result-object v1

    .line 679
    if-nez v1, :cond_6

    .line 680
    const/4 v0, 0x2

    new-array v0, v0, [I

    iget v1, p0, Lcom/roidapp/photogrid/release/ol;->w:I

    aput v1, v0, v6

    iget v1, p0, Lcom/roidapp/photogrid/release/ol;->x:I

    aput v1, v0, v7

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ol;->a([I)V

    .line 685
    :cond_5
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 5706
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 5707
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    .line 5708
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    .line 5711
    iget v0, p0, Lcom/roidapp/photogrid/release/ol;->s:I

    int-to-float v0, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/ol;->t:I

    int-to-float v4, v4

    div-float/2addr v0, v4

    .line 5712
    int-to-float v4, v2

    int-to-float v5, v3

    div-float/2addr v4, v5

    .line 5713
    cmpl-float v0, v0, v4

    if-lez v0, :cond_b

    .line 5714
    iget v0, p0, Lcom/roidapp/photogrid/release/ol;->s:I

    int-to-float v0, v0

    mul-float/2addr v0, v10

    int-to-float v4, v2

    div-float/2addr v0, v4

    .line 5719
    :goto_3
    invoke-virtual {v1, v0, v0}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 5720
    neg-int v2, v2

    int-to-float v2, v2

    div-float/2addr v2, v9

    mul-float/2addr v2, v0

    iget v4, p0, Lcom/roidapp/photogrid/release/ol;->s:I

    int-to-float v4, v4

    div-float/2addr v4, v9

    add-float/2addr v2, v4

    neg-int v3, v3

    int-to-float v3, v3

    div-float/2addr v3, v9

    mul-float/2addr v0, v3

    iget v3, p0, Lcom/roidapp/photogrid/release/ol;->t:I

    int-to-float v3, v3

    div-float/2addr v3, v9

    add-float/2addr v0, v3

    invoke-virtual {v1, v2, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 5721
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 687
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 688
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ol;->a(Landroid/graphics/Bitmap;)V

    goto/16 :goto_0

    .line 4740
    :cond_6
    if-eqz v1, :cond_5

    .line 4743
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 4744
    iput-boolean v7, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 4745
    invoke-static {v1, v2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 4747
    iget v0, v2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 4748
    iget v3, v2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 4751
    if-lez v0, :cond_7

    if-gtz v3, :cond_8

    .line 4752
    :cond_7
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "save bg create decodeBitmap null createBgSingle"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4758
    :cond_8
    iget v4, p0, Lcom/roidapp/photogrid/release/ol;->s:I

    int-to-float v4, v4

    iget v5, p0, Lcom/roidapp/photogrid/release/ol;->t:I

    int-to-float v5, v5

    div-float/2addr v4, v5

    .line 4759
    int-to-float v5, v0

    int-to-float v8, v3

    div-float/2addr v5, v8

    .line 4761
    cmpl-float v4, v5, v4

    if-lez v4, :cond_a

    .line 4762
    iget v0, p0, Lcom/roidapp/photogrid/release/ol;->t:I

    div-int v0, v3, v0

    .line 4768
    :goto_4
    if-gtz v0, :cond_9

    move v0, v7

    .line 4771
    :cond_9
    iput v0, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 4772
    iput-boolean v6, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 4773
    invoke-static {v1, v2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    .line 4774
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    if-nez v0, :cond_5

    .line 4775
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "save bg create decodeBitmap null createBgSingle1"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4764
    :cond_a
    iget v3, p0, Lcom/roidapp/photogrid/release/ol;->s:I

    div-int/2addr v0, v3

    goto :goto_4

    .line 5716
    :cond_b
    iget v0, p0, Lcom/roidapp/photogrid/release/ol;->t:I

    int-to-float v0, v0

    mul-float/2addr v0, v10

    int-to-float v4, v3

    div-float/2addr v0, v4

    goto :goto_3
.end method

.method private a(Landroid/graphics/Canvas;F)V
    .locals 4

    .prologue
    .line 614
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ol;->h:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v0

    .line 615
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-gtz v1, :cond_1

    .line 627
    :cond_0
    :goto_0
    return-void

    .line 618
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    const-string v2, "FreeActivity/Save/HasDoodle"

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 619
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 620
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 621
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 622
    const/4 v2, 0x0

    const/16 v3, 0x1f

    invoke-virtual {p1, v2, v1, v3}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;I)I

    .line 623
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ay;

    .line 624
    invoke-virtual {v0, p1, p2, v1}, Lcom/roidapp/photogrid/release/ay;->a(Landroid/graphics/Canvas;FLandroid/graphics/Paint;)V

    goto :goto_1

    .line 626
    :cond_2
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ol;)V
    .locals 1

    .prologue
    .line 42
    const/16 v0, 0xf

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ol;->c(I)V

    return-void
.end method

.method private varargs a([I)V
    .locals 4

    .prologue
    const/4 v3, 0x2

    const/4 v2, 0x1

    .line 796
    :try_start_0
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 797
    const/4 v1, 0x0

    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 799
    array-length v1, p1

    if-ne v1, v2, :cond_1

    .line 800
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v2

    iget-object v2, v2, Lcom/roidapp/baselib/c/p;->d:[I

    const/4 v3, 0x0

    aget v3, p1, v3

    aget v2, v2, v3

    .line 6482
    const/4 v3, 0x0

    invoke-static {v1, v2, v0, v3}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 800
    iput-object v1, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    .line 809
    :goto_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    if-nez v1, :cond_0

    .line 810
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v2

    iget-object v2, v2, Lcom/roidapp/baselib/c/p;->j:[[I

    const/4 v3, 0x4

    aget-object v2, v2, v3

    const/4 v3, 0x4

    aget v2, v2, v3

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    invoke-static {v1, v2, v0, v3}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    .line 813
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    if-nez v0, :cond_4

    .line 814
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "mBgBase==null-2  throw oom"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 831
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 832
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ol;->a(Landroid/graphics/Bitmap;)V

    .line 833
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "save create bg oom"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 802
    :cond_1
    const/4 v1, 0x0

    :try_start_1
    aget v1, p1, v1

    if-lt v1, v3, :cond_2

    const/4 v1, 0x0

    aget v1, p1, v1

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v2

    iget-object v2, v2, Lcom/roidapp/baselib/c/p;->j:[[I

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    if-le v1, v2, :cond_3

    .line 803
    :cond_2
    const/4 v1, 0x0

    const/4 v2, 0x2

    aput v2, p1, v1

    .line 804
    const/4 v1, 0x1

    const/4 v2, 0x0

    aput v2, p1, v1

    .line 806
    :cond_3
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {}, Lcom/roidapp/baselib/c/p;->a()Lcom/roidapp/baselib/c/p;

    move-result-object v2

    iget-object v2, v2, Lcom/roidapp/baselib/c/p;->j:[[I

    const/4 v3, 0x0

    aget v3, p1, v3

    aget-object v2, v2, v3

    const/4 v3, 0x1

    aget v3, p1, v3

    aget v2, v2, v3

    .line 7482
    const/4 v3, 0x0

    invoke-static {v1, v2, v0, v3}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 806
    iput-object v1, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    goto :goto_0

    .line 816
    :cond_4
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    iget v1, p0, Lcom/roidapp/photogrid/release/ol;->B:F

    .line 7590
    invoke-static {v0, v1, v1}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/graphics/Bitmap;FF)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 816
    iput-object v0, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    .line 819
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    if-nez v0, :cond_5

    .line 820
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "mBgBase==null-3  throw oom"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 822
    :cond_5
    iget v0, p0, Lcom/roidapp/photogrid/release/ol;->s:I

    iget v1, p0, Lcom/roidapp/photogrid/release/ol;->t:I

    if-le v0, v1, :cond_8

    .line 823
    iget v0, p0, Lcom/roidapp/photogrid/release/ol;->s:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    rem-int/2addr v0, v1

    if-eqz v0, :cond_6

    iget v0, p0, Lcom/roidapp/photogrid/release/ol;->s:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    div-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    :goto_1
    iput v0, p0, Lcom/roidapp/photogrid/release/ol;->z:I

    .line 824
    iget v0, p0, Lcom/roidapp/photogrid/release/ol;->t:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    rem-int/2addr v0, v1

    if-eqz v0, :cond_7

    iget v0, p0, Lcom/roidapp/photogrid/release/ol;->t:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    div-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    :goto_2
    iput v0, p0, Lcom/roidapp/photogrid/release/ol;->A:I

    .line 829
    :goto_3
    const/16 v0, 0x14

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ol;->c(I)V

    .line 834
    return-void

    .line 823
    :cond_6
    iget v0, p0, Lcom/roidapp/photogrid/release/ol;->s:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    div-int/2addr v0, v1

    goto :goto_1

    .line 824
    :cond_7
    iget v0, p0, Lcom/roidapp/photogrid/release/ol;->t:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    div-int/2addr v0, v1

    goto :goto_2

    .line 826
    :cond_8
    iget v0, p0, Lcom/roidapp/photogrid/release/ol;->s:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    rem-int/2addr v0, v1

    if-eqz v0, :cond_9

    iget v0, p0, Lcom/roidapp/photogrid/release/ol;->s:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    div-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    :goto_4
    iput v0, p0, Lcom/roidapp/photogrid/release/ol;->z:I

    .line 827
    iget v0, p0, Lcom/roidapp/photogrid/release/ol;->t:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    rem-int/2addr v0, v1

    if-eqz v0, :cond_a

    iget v0, p0, Lcom/roidapp/photogrid/release/ol;->t:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    div-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    :goto_5
    iput v0, p0, Lcom/roidapp/photogrid/release/ol;->A:I

    goto :goto_3

    .line 826
    :cond_9
    iget v0, p0, Lcom/roidapp/photogrid/release/ol;->s:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    div-int/2addr v0, v1

    goto :goto_4

    .line 827
    :cond_a
    iget v0, p0, Lcom/roidapp/photogrid/release/ol;->t:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ol;->y:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    div-int/2addr v0, v1
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_5
.end method

.method private a(IIZ)[Ljava/lang/String;
    .locals 12

    .prologue
    .line 149
    const/4 v2, 0x0

    .line 150
    const/4 v1, 0x0

    .line 152
    :try_start_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    .line 153
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ap;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 154
    if-eqz p3, :cond_f

    .line 155
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ap;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    move-object v4, v0

    .line 156
    :goto_0
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 157
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 158
    invoke-virtual {v7}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_0

    .line 159
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x13

    if-ne v0, v3, :cond_6

    .line 160
    new-instance v0, Lcom/roidapp/photogrid/common/ae;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    invoke-direct {v0, v3, v7}, Lcom/roidapp/photogrid/common/ae;-><init>(Landroid/content/ContentResolver;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_4

    .line 162
    :try_start_1
    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/ae;->a()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_4

    .line 174
    :cond_0
    const/16 v0, 0x14

    :try_start_2
    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ol;->c(I)V

    .line 177
    const/4 v0, 0x1

    if-ne p2, v0, :cond_7

    .line 178
    const-string v3, ".png"

    .line 179
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    move-object v5, v0

    .line 184
    :goto_1
    const/16 v0, 0x19

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ol;->c(I)V

    .line 185
    new-instance v0, Ljava/io/File;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "PhotoGrid_"

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v10

    invoke-virtual {v8, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_4

    .line 187
    :try_start_3
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_4

    .line 202
    :cond_1
    :goto_2
    :try_start_4
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_4

    move-result-object v3

    .line 203
    const/16 v1, 0x1e

    :try_start_5
    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/ol;->c(I)V

    .line 204
    const/4 v1, 0x0

    .line 205
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->canWrite()Z

    move-result v4

    if-nez v4, :cond_a

    .line 206
    :cond_2
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_5 .. :try_end_5} :catch_8

    const/16 v8, 0x12

    if-le v4, v8, :cond_9

    .line 208
    :try_start_6
    new-instance v4, Lcom/roidapp/photogrid/common/ae;

    iget-object v8, p0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    invoke-virtual {v8}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v8

    invoke-direct {v4, v8, v0}, Lcom/roidapp/photogrid/common/ae;-><init>(Landroid/content/ContentResolver;Ljava/io/File;)V

    .line 209
    invoke-virtual {v4}, Lcom/roidapp/photogrid/common/ae;->b()Ljava/io/OutputStream;

    move-result-object v1

    .line 210
    if-nez v1, :cond_8

    .line 211
    new-instance v0, Ljava/io/IOException;

    const-string v4, "4.4 IOException"

    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6 .. :try_end_6} :catch_8

    .line 214
    :catch_0
    move-exception v0

    :try_start_7
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 215
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v4

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "/"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    const v8, 0x7f07002e

    invoke-virtual {v4, v8}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 216
    new-instance v0, Ljava/io/File;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "PhotoGrid_"

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v10

    invoke-virtual {v8, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v0, v4, v6}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_7 .. :try_end_7} :catch_8

    .line 218
    :try_start_8
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_7
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_8 .. :try_end_8} :catch_8

    .line 223
    :try_start_9
    iget-object v6, p0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    invoke-static {v6, v4}, Lcom/roidapp/photogrid/release/ap;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 225
    if-eqz v1, :cond_3

    .line 227
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V

    .line 228
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 231
    :cond_3
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v4, v0

    move-object v0, v1

    .line 239
    :goto_3
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ol;->r:Lcom/roidapp/photogrid/release/mm;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/mm;->j:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 240
    int-to-float v6, p1

    iget v7, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    int-to-float v7, v7

    div-float/2addr v6, v7

    .line 241
    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    int-to-float v1, v1

    mul-float/2addr v1, v6

    float-to-int v7, v1

    .line 242
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    sget-object v1, Lcom/roidapp/photogrid/common/az;->c:Landroid/graphics/Bitmap$Config;

    invoke-static {p1, v7, v1}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_9 .. :try_end_9} :catch_8

    move-result-object v1

    .line 243
    if-nez v1, :cond_b

    .line 244
    if-eqz v0, :cond_4

    .line 245
    :try_start_a
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 247
    :cond_4
    invoke-static {v3}, Lcom/roidapp/photogrid/release/ol;->a(Ljava/lang/String;)V

    .line 248
    new-instance v0, Ljava/lang/OutOfMemoryError;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "save createBitmap oom width:"

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " height:"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_a .. :try_end_a} :catch_8

    .line 269
    :catch_1
    move-exception v0

    .line 270
    :goto_4
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_5

    .line 271
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 274
    :cond_5
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ol;->d:Lcom/roidapp/photogrid/release/ml;

    const/16 v2, 0xf

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    .line 275
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 276
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 277
    const-string v2, "No space"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_e

    .line 278
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "3"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, ""

    aput-object v2, v0, v1

    .line 281
    :goto_5
    return-object v0

    .line 164
    :catch_2
    move-exception v0

    :try_start_b
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 166
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v5, "2"

    aput-object v5, v0, v3

    const/4 v3, 0x1

    aput-object v4, v0, v3

    goto :goto_5

    .line 269
    :catch_3
    move-exception v0

    move-object v1, v2

    goto :goto_4

    .line 170
    :cond_6
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v5, "2"

    aput-object v5, v0, v3

    const/4 v3, 0x1

    aput-object v4, v0, v3
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_b .. :try_end_b} :catch_4

    goto :goto_5

    .line 283
    :catch_4
    move-exception v0

    .line 284
    :goto_6
    invoke-static {v1}, Lcom/roidapp/photogrid/release/ol;->a(Ljava/lang/String;)V

    .line 285
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 286
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "do save oom"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 181
    :cond_7
    :try_start_c
    const-string v3, ".jpg"

    .line 182
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    move-object v5, v0

    goto/16 :goto_1

    .line 189
    :catch_5
    move-exception v3

    invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V

    .line 190
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x12

    if-gt v3, v4, :cond_1

    .line 191
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "/"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    const v4, 0x7f07002e

    invoke-virtual {v3, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 192
    new-instance v0, Ljava/io/File;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v8, "PhotoGrid_"

    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v8

    invoke-virtual {v4, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_c .. :try_end_c} :catch_4

    .line 194
    :try_start_d
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_6
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_d .. :try_end_d} :catch_4

    .line 199
    :try_start_e
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    invoke-static {v4, v3}, Lcom/roidapp/photogrid/release/ap;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 196
    :catch_6
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 197
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "1"

    aput-object v4, v0, v3

    const/4 v3, 0x1

    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v3
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_e .. :try_end_e} :catch_4

    goto/16 :goto_5

    :cond_8
    move-object v4, v0

    move-object v0, v1

    .line 232
    goto/16 :goto_3

    .line 220
    :catch_7
    move-exception v0

    :try_start_f
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 221
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v4, "1"

    aput-object v4, v0, v1

    const/4 v1, 0x1

    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v1

    goto/16 :goto_5

    .line 283
    :catch_8
    move-exception v0

    move-object v1, v3

    goto/16 :goto_6

    .line 234
    :cond_9
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v4, "1"

    aput-object v4, v0, v1

    const/4 v1, 0x1

    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v1

    goto/16 :goto_5

    .line 237
    :cond_a
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_f .. :try_end_f} :catch_8

    move-object v4, v0

    move-object v0, v1

    goto/16 :goto_3

    .line 250
    :cond_b
    const/16 v2, 0x20

    :try_start_10
    invoke-direct {p0, v2}, Lcom/roidapp/photogrid/release/ol;->c(I)V

    .line 251
    invoke-direct {p0, v6, p1, v7, v1}, Lcom/roidapp/photogrid/release/ol;->a(FIILandroid/graphics/Bitmap;)V

    .line 252
    const/16 v2, 0x28

    invoke-direct {p0, v2}, Lcom/roidapp/photogrid/release/ol;->c(I)V

    .line 253
    const/16 v2, 0x64

    invoke-virtual {v1, v5, v2, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 254
    const/16 v2, 0x50

    invoke-direct {p0, v2}, Lcom/roidapp/photogrid/release/ol;->c(I)V

    .line 255
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 256
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 258
    const/16 v0, 0x55

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ol;->c(I)V

    .line 259
    if-eqz v1, :cond_c

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_c

    .line 260
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 261
    const/4 v1, 0x0

    .line 263
    :cond_c
    const/16 v0, 0x5a

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ol;->c(I)V

    .line 265
    const/4 v0, 0x2

    if-ne p2, v0, :cond_d

    .line 266
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    .line 3220
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v5, 0x5

    if-le v2, v5, :cond_d

    .line 3223
    invoke-static {}, Lcom/roidapp/photogrid/common/bp;->a()Lcom/roidapp/photogrid/common/bp;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/bp;->a(Ljava/lang/String;)V

    .line 268
    :cond_d
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v5, "0"

    aput-object v5, v0, v2

    const/4 v2, 0x1

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v2
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_10 .. :try_end_10} :catch_8

    goto/16 :goto_5

    .line 280
    :cond_e
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ol;->q:Landroid/os/Handler;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/common/c;->a(Landroid/os/Handler;Ljava/lang/Throwable;)V

    .line 281
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "-1"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, ""

    aput-object v2, v0, v1

    goto/16 :goto_5

    :cond_f
    move-object v4, v0

    goto/16 :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ol;I)[Ljava/lang/String;
    .locals 2

    .prologue
    .line 42
    const/4 v0, 0x2

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1}, Lcom/roidapp/photogrid/release/ol;->a(IIZ)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ol;II)[Ljava/lang/String;
    .locals 1

    .prologue
    .line 42
    .line 8145
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/roidapp/photogrid/release/ol;->a(IIZ)[Ljava/lang/String;

    move-result-object v0

    .line 42
    return-object v0
.end method

.method private c(I)V
    .locals 2

    .prologue
    .line 845
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ol;->d:Lcom/roidapp/photogrid/release/ml;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 846
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 56
    const/16 v0, 0xa

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ol;->c(I)V

    .line 57
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/photogrid/release/om;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/om;-><init>(Lcom/roidapp/photogrid/release/ol;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 142
    return-void
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 852
    iput p1, p0, Lcom/roidapp/photogrid/release/ol;->o:I

    .line 855
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ol;->g:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_0

    .line 856
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ol;->g:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->a()V

    .line 858
    :cond_0
    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ol;->b(I)V

    .line 859
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ol;->r:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/mm;->f()V

    .line 860
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->q()V

    .line 865
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ol;->b(I)V

    .line 866
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/photogrid/release/on;

    invoke-direct {v1, p0, p1}, Lcom/roidapp/photogrid/release/on;-><init>(Lcom/roidapp/photogrid/release/ol;I)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 932
    return-void
.end method
