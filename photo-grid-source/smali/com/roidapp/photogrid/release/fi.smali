.class public final Lcom/roidapp/photogrid/release/fi;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field public a:[[I

.field public b:[I

.field public c:[F

.field private d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private e:I

.field private f:I

.field private g:Z

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private i:Z

.field private j:I

.field private k:Landroid/widget/HorizontalScrollView;

.field private l:I

.field private m:I


# direct methods
.method public constructor <init>()V
    .locals 6

    .prologue
    const/16 v5, 0x9

    const/16 v4, 0x8

    const/4 v3, 0x6

    const/4 v2, 0x0

    .line 39
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 42
    iput v2, p0, Lcom/roidapp/photogrid/release/fi;->e:I

    .line 43
    iput v2, p0, Lcom/roidapp/photogrid/release/fi;->f:I

    .line 48
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->v()Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/fi;->i:Z

    .line 50
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->u()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/roidapp/photogrid/release/fi;->e:I

    iput v0, p0, Lcom/roidapp/photogrid/release/fi;->j:I

    .line 519
    const/4 v0, 0x4

    new-array v0, v0, [[I

    new-array v1, v4, [I

    fill-array-data v1, :array_0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    new-array v2, v4, [I

    fill-array-data v2, :array_1

    aput-object v2, v0, v1

    const/4 v1, 0x2

    new-array v2, v5, [I

    fill-array-data v2, :array_2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    new-array v2, v5, [I

    fill-array-data v2, :array_3

    aput-object v2, v0, v1

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fi;->a:[[I

    .line 566
    new-array v0, v3, [I

    fill-array-data v0, :array_4

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fi;->b:[I

    .line 569
    new-array v0, v3, [F

    fill-array-data v0, :array_5

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fi;->c:[F

    .line 578
    return-void

    .line 519
    :array_0
    .array-data 4
        0x7f02041f
        0x7f02034d
        0x7f020352
        0x7f020355
        0x7f02034f
        0x7f020353
        0x7f02034c
        0x7f020200
    .end array-data

    :array_1
    .array-data 4
        0x7f0203aa
        0x7f02034d
        0x7f020350
        0x7f020354
        0x7f02034e
        0x7f020351
        0x7f020356
        0x7f020200
    .end array-data

    :array_2
    .array-data 4
        0x7f02041f
        0x7f02039b
        0x7f02034d
        0x7f020352
        0x7f020355
        0x7f02034f
        0x7f020353
        0x7f02034c
        0x7f020200
    .end array-data

    :array_3
    .array-data 4
        0x7f0203aa
        0x7f02039b
        0x7f02034d
        0x7f020350
        0x7f020354
        0x7f02034e
        0x7f020351
        0x7f020356
        0x7f020200
    .end array-data

    .line 566
    :array_4
    .array-data 4
        0x1
        0x4
        0x7
        0x3
        0x5
        0x10
    .end array-data

    .line 569
    :array_5
    .array-data 4
        0x3f800000    # 1.0f
        0x40400000    # 3.0f
        0x40a00000    # 5.0f
        0x40000000    # 2.0f
        0x40400000    # 3.0f
        0x41100000    # 9.0f
    .end array-data
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/fi;I)I
    .locals 0

    .prologue
    .line 39
    iput p1, p0, Lcom/roidapp/photogrid/release/fi;->f:I

    return p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/fi;)Lcom/roidapp/photogrid/release/PhotoGridActivity;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fi;->d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/fi;II)V
    .locals 11

    .prologue
    const v3, 0x3f2aaaab

    const v4, 0x3f19999a    # 0.6f

    const/high16 v5, 0x3f100000    # 0.5625f

    const/4 v6, 0x0

    const/4 v7, 0x1

    .line 1397
    const/4 v0, 0x0

    .line 1400
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1406
    add-int/lit8 v1, p1, -0x1

    iput v1, p0, Lcom/roidapp/photogrid/release/fi;->j:I

    .line 1410
    add-int/lit8 v1, p2, -0x1

    if-ne p1, v1, :cond_0

    .line 1411
    new-instance v0, Lcom/roidapp/photogrid/release/fl;

    invoke-direct {v0, p0, p2}, Lcom/roidapp/photogrid/release/fl;-><init>(Lcom/roidapp/photogrid/release/fi;I)V

    .line 1435
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fi;->d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v2, "ratio"

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 1436
    new-instance v1, Lcom/roidapp/photogrid/release/as;

    invoke-direct {v1}, Lcom/roidapp/photogrid/release/as;-><init>()V

    .line 1437
    invoke-virtual {v1, v7, v6}, Lcom/roidapp/photogrid/release/as;->setStyle(II)V

    .line 1439
    iget v2, p0, Lcom/roidapp/photogrid/release/fi;->e:I

    invoke-virtual {v1, v0, v2}, Lcom/roidapp/photogrid/release/as;->a(Lcom/roidapp/photogrid/release/fm;I)V

    .line 1440
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fi;->d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v2, "ratio"

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    .line 1441
    :goto_0
    return-void

    .line 1444
    :cond_0
    if-ne p1, v7, :cond_1

    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/fi;->g:Z

    if-nez v1, :cond_1

    .line 1445
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/fi;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v1, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 1446
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/fi;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 1447
    if-ge v1, v0, :cond_12

    .line 1452
    :goto_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/fi;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const v9, 0x7f0900dd

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v8

    .line 1453
    int-to-float v0, v0

    sub-float/2addr v0, v8

    sget v8, Lcom/roidapp/photogrid/common/az;->g:I

    int-to-float v8, v8

    sub-float/2addr v0, v8

    .line 1454
    int-to-float v1, v1

    div-float v0, v1, v0

    .line 1458
    :cond_1
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/fi;->g:Z

    if-eqz v1, :cond_7

    .line 1459
    if-lez p1, :cond_11

    .line 1463
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_2

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_4

    :cond_2
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_4

    .line 1466
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    .line 1467
    if-eqz v0, :cond_3

    array-length v1, v0

    if-eqz v1, :cond_3

    .line 1468
    aget-object v0, v0, v6

    iput-boolean v7, v0, Lcom/roidapp/photogrid/release/ig;->B:Z

    .line 1470
    :cond_3
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v7}, Lcom/roidapp/photogrid/release/ih;->k(I)V

    .line 1472
    :cond_4
    add-int/lit8 v0, p1, -0x1

    .line 1473
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/fi;->i:Z

    if-eqz v1, :cond_6

    .line 1474
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fi;->b:[I

    aget v1, v1, v0

    int-to-float v1, v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/fi;->c:[F

    aget v0, v2, v0

    div-float v0, v1, v0

    .line 1480
    :goto_2
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v2, 0x5

    if-eq v1, v2, :cond_5

    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v2, 0xa

    if-ne v1, v2, :cond_10

    :cond_5
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_10

    .line 1482
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fi;->d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->J()V

    move v2, v0

    move v0, v6

    .line 1511
    :goto_3
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ih;->d(Z)V

    .line 1512
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    .line 1513
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/release/fi;->j:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->c(I)V

    .line 1514
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/fi;->i:Z

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->f(Z)V

    .line 1515
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a([F)V

    .line 1516
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fi;->d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0, v6, v6}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZZ)Z

    goto/16 :goto_0

    .line 1476
    :cond_6
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fi;->c:[F

    aget v1, v1, v0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/fi;->b:[I

    aget v0, v2, v0

    int-to-float v0, v0

    div-float v0, v1, v0

    goto :goto_2

    .line 1486
    :cond_7
    if-ne p1, v7, :cond_e

    .line 1487
    const/high16 v1, 0x3f400000    # 0.75f

    cmpg-float v1, v1, v0

    if-gez v1, :cond_9

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v1, v0, v1

    if-gtz v1, :cond_9

    .line 1488
    const/high16 v2, 0x3f800000    # 1.0f

    :cond_8
    :goto_4
    move v0, v7

    .line 1500
    goto :goto_3

    .line 1489
    :cond_9
    const v1, 0x3f36db6e

    cmpg-float v1, v1, v0

    if-gez v1, :cond_a

    const/high16 v1, 0x3f400000    # 0.75f

    cmpg-float v1, v0, v1

    if-gtz v1, :cond_a

    .line 1490
    const/high16 v2, 0x3f400000    # 0.75f

    goto :goto_4

    .line 1491
    :cond_a
    cmpg-float v1, v3, v0

    if-gez v1, :cond_b

    const v1, 0x3f36db6e

    cmpg-float v1, v0, v1

    if-gtz v1, :cond_b

    .line 1492
    const v2, 0x3f36db6e

    goto :goto_4

    .line 1493
    :cond_b
    cmpg-float v1, v4, v0

    if-gez v1, :cond_c

    cmpg-float v1, v0, v3

    if-gtz v1, :cond_c

    move v2, v3

    .line 1494
    goto :goto_4

    .line 1495
    :cond_c
    cmpg-float v1, v5, v0

    if-gez v1, :cond_d

    cmpg-float v1, v0, v4

    if-gtz v1, :cond_d

    move v2, v4

    .line 1496
    goto :goto_4

    .line 1497
    :cond_d
    cmpg-float v0, v0, v5

    if-gtz v0, :cond_8

    move v2, v5

    .line 1498
    goto :goto_4

    .line 1502
    :cond_e
    add-int/lit8 v0, p1, -0x2

    .line 1503
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/fi;->i:Z

    if-eqz v1, :cond_f

    .line 1504
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fi;->b:[I

    aget v1, v1, v0

    int-to-float v1, v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/fi;->c:[F

    aget v0, v2, v0

    div-float v0, v1, v0

    move v2, v0

    move v0, v6

    goto/16 :goto_3

    .line 1506
    :cond_f
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fi;->c:[F

    aget v1, v1, v0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/fi;->b:[I

    aget v0, v2, v0

    int-to-float v0, v0

    div-float v0, v1, v0

    move v2, v0

    move v0, v6

    goto/16 :goto_3

    :cond_10
    move v2, v0

    move v0, v6

    goto/16 :goto_3

    :cond_11
    move v0, v2

    goto/16 :goto_2

    :cond_12
    move v10, v1

    move v1, v0

    move v0, v10

    goto/16 :goto_1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/fi;Z)Z
    .locals 0

    .prologue
    .line 39
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/fi;->i:Z

    return p1
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/fi;I)I
    .locals 0

    .prologue
    .line 39
    iput p1, p0, Lcom/roidapp/photogrid/release/fi;->e:I

    return p1
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/fi;)Landroid/widget/HorizontalScrollView;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fi;->k:Landroid/widget/HorizontalScrollView;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/fi;)I
    .locals 1

    .prologue
    .line 39
    iget v0, p0, Lcom/roidapp/photogrid/release/fi;->m:I

    return v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/fi;)I
    .locals 1

    .prologue
    .line 39
    iget v0, p0, Lcom/roidapp/photogrid/release/fi;->l:I

    return v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/fi;)I
    .locals 1

    .prologue
    .line 39
    iget v0, p0, Lcom/roidapp/photogrid/release/fi;->e:I

    return v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/release/fi;)Z
    .locals 1

    .prologue
    .line 39
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/fi;->g:Z

    return v0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/release/fi;)Z
    .locals 1

    .prologue
    .line 39
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/fi;->i:Z

    return v0
.end method

.method static synthetic h(Lcom/roidapp/photogrid/release/fi;)Ljava/util/List;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fi;->h:Ljava/util/List;

    return-object v0
.end method

.method static synthetic i(Lcom/roidapp/photogrid/release/fi;)V
    .locals 7

    .prologue
    const/4 v2, 0x0

    .line 39
    .line 2371
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fi;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    .line 2372
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fi;->a:[[I

    iget v1, p0, Lcom/roidapp/photogrid/release/fi;->f:I

    aget-object v4, v0, v1

    move v1, v2

    .line 2373
    :goto_0
    add-int/lit8 v0, v3, -0x1

    if-ge v1, v0, :cond_3

    .line 2374
    const/4 v0, 0x1

    if-le v1, v0, :cond_1

    .line 2375
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fi;->d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    aget v5, v4, v1

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 2376
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fi;->h:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    const v6, 0x7f0d0494

    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2373
    :cond_0
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 2377
    :cond_1
    if-nez v1, :cond_0

    .line 2378
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fi;->h:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    const v5, 0x7f0d04c9

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 2379
    iget-boolean v5, p0, Lcom/roidapp/photogrid/release/fi;->i:Z

    if-eqz v5, :cond_2

    .line 2380
    const v5, 0x7f070198

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(I)V

    .line 2384
    :goto_2
    aget v5, v4, v1

    invoke-virtual {v0, v2, v5, v2, v2}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    goto :goto_1

    .line 2382
    :cond_2
    const v5, 0x7f070247

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(I)V

    goto :goto_2

    .line 39
    :cond_3
    return-void
.end method

.method static synthetic j(Lcom/roidapp/photogrid/release/fi;)I
    .locals 1

    .prologue
    .line 39
    iget v0, p0, Lcom/roidapp/photogrid/release/fi;->j:I

    return v0
.end method


# virtual methods
.method protected final a()V
    .locals 2

    .prologue
    .line 362
    iget v0, p0, Lcom/roidapp/photogrid/release/fi;->e:I

    if-lez v0, :cond_0

    .line 363
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fi;->h:Ljava/util/List;

    iget v1, p0, Lcom/roidapp/photogrid/release/fi;->e:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    const v1, 0x7f0d0493

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 365
    :cond_0
    return-void
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 58
    const-string v0, "FragmentProportion/onAttach"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    move-object v0, p1

    .line 60
    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/fi;->d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 61
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v1, :cond_0

    .line 62
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/fi;->g:Z

    .line 66
    :goto_0
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 67
    return-void

    .line 64
    :cond_0
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/fi;->g:Z

    goto :goto_0
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 13

    .prologue
    .line 82
    const-string v0, "FragmentProportion/onCreateView"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 83
    const v0, 0x7f0300b8

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v5

    .line 1089
    const v0, 0x7f0d02e8

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 1090
    const v1, 0x7f0d0287

    invoke-virtual {v5, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/HorizontalScrollView;

    iput-object v1, p0, Lcom/roidapp/photogrid/release/fi;->k:Landroid/widget/HorizontalScrollView;

    .line 1091
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/roidapp/photogrid/release/fi;->h:Ljava/util/List;

    .line 1092
    const v1, 0x7f0d02e5

    invoke-virtual {v5, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout;

    .line 1097
    new-instance v2, Lcom/roidapp/photogrid/release/fj;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/fj;-><init>(Lcom/roidapp/photogrid/release/fi;)V

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1106
    iget-object v2, p0, Lcom/roidapp/photogrid/release/fi;->d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v2, :cond_b

    .line 1110
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/fi;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0900d4

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v3, v2

    iput v3, p0, Lcom/roidapp/photogrid/release/fi;->l:I

    .line 1111
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/fi;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v2, p0, Lcom/roidapp/photogrid/release/fi;->m:I

    .line 1112
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v4, 0x1

    if-ne v2, v4, :cond_3

    .line 1113
    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1183
    :cond_0
    :goto_0
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/fi;->g:Z

    if-eqz v1, :cond_5

    .line 1184
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/fi;->i:Z

    if-eqz v1, :cond_4

    .line 1185
    const/4 v1, 0x0

    iput v1, p0, Lcom/roidapp/photogrid/release/fi;->f:I

    .line 1186
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fi;->d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070198

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object v2, v1

    .line 1201
    :goto_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fi;->a:[[I

    iget v4, p0, Lcom/roidapp/photogrid/release/fi;->f:I

    aget-object v6, v1, v4

    .line 1202
    array-length v7, v6

    .line 1203
    new-instance v8, Landroid/view/ViewGroup$LayoutParams;

    iget v1, p0, Lcom/roidapp/photogrid/release/fi;->l:I

    invoke-direct {v8, v1, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 1204
    const/4 v1, 0x0

    move v4, v1

    :goto_2
    if-ge v4, v7, :cond_a

    .line 1205
    const/4 v1, 0x0

    .line 1206
    const/4 v3, 0x1

    if-le v4, v3, :cond_7

    add-int/lit8 v3, v7, -0x1

    if-ge v4, v3, :cond_7

    .line 1207
    const v1, 0x7f03012b

    const/4 v3, 0x0

    invoke-virtual {p1, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 1208
    const v1, 0x7f0d0494

    invoke-virtual {v3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 1209
    iget-object v9, p0, Lcom/roidapp/photogrid/release/fi;->d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v9}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    aget v10, v6, v4

    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v9

    .line 1210
    invoke-virtual {v1, v9}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1211
    invoke-virtual {v3, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1212
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1213
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1214
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fi;->h:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v1, v3

    .line 1257
    :cond_1
    :goto_3
    if-eqz v1, :cond_2

    .line 1258
    new-instance v3, Lcom/roidapp/photogrid/release/fk;

    invoke-direct {v3, p0, v7}, Lcom/roidapp/photogrid/release/fk;-><init>(Lcom/roidapp/photogrid/release/fi;I)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1204
    :cond_2
    add-int/lit8 v1, v4, 0x1

    move v4, v1

    goto :goto_2

    .line 1174
    :cond_3
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v2, :cond_0

    .line 1175
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1176
    const v2, 0x7f0d02e6

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 1177
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/fi;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f0900d0

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    .line 1178
    new-instance v4, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v4, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 1179
    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 1188
    :cond_4
    const/4 v1, 0x1

    iput v1, p0, Lcom/roidapp/photogrid/release/fi;->f:I

    .line 1189
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fi;->d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070247

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object v2, v1

    goto/16 :goto_1

    .line 1192
    :cond_5
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/fi;->i:Z

    if-eqz v1, :cond_6

    .line 1193
    const/4 v1, 0x2

    iput v1, p0, Lcom/roidapp/photogrid/release/fi;->f:I

    .line 1194
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fi;->d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070198

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object v2, v1

    goto/16 :goto_1

    .line 1196
    :cond_6
    const/4 v1, 0x3

    iput v1, p0, Lcom/roidapp/photogrid/release/fi;->f:I

    .line 1197
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fi;->d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070247

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object v2, v1

    goto/16 :goto_1

    .line 1216
    :cond_7
    if-nez v4, :cond_8

    .line 1217
    const v1, 0x7f03012c

    const/4 v3, 0x0

    invoke-virtual {p1, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 1218
    const v1, 0x7f0d04c9

    invoke-virtual {v3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 1219
    const/4 v9, 0x0

    const/4 v10, 0x0

    aget v10, v6, v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-virtual {v1, v9, v10, v11, v12}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 1220
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1221
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1222
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1223
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fi;->h:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v1, v3

    .line 1225
    goto/16 :goto_3

    :cond_8
    add-int/lit8 v3, v7, -0x1

    if-ne v4, v3, :cond_9

    .line 1226
    const v1, 0x7f03012c

    const/4 v3, 0x0

    invoke-virtual {p1, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 1230
    const v1, 0x7f0d04c9

    invoke-virtual {v3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 1231
    const/4 v9, 0x0

    add-int/lit8 v10, v7, -0x1

    aget v10, v6, v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-virtual {v1, v9, v10, v11, v12}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 1232
    const v9, 0x7f070117

    invoke-virtual {v1, v9}, Landroid/widget/TextView;->setText(I)V

    .line 1233
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1234
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1235
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fi;->h:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v1, v3

    .line 1236
    goto/16 :goto_3

    :cond_9
    const/4 v3, 0x1

    if-ne v4, v3, :cond_1

    .line 1237
    const v1, 0x7f03012b

    const/4 v3, 0x0

    invoke-virtual {p1, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 1238
    const v1, 0x7f0d0494

    invoke-virtual {v3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 1239
    iget-object v9, p0, Lcom/roidapp/photogrid/release/fi;->d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v9}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    aget v10, v6, v4

    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v9

    .line 1240
    invoke-virtual {v1, v9}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1241
    invoke-virtual {v3, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1242
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1252
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1254
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fi;->h:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v1, v3

    goto/16 :goto_3

    .line 1356
    :cond_a
    iget v0, p0, Lcom/roidapp/photogrid/release/fi;->j:I

    if-lez v0, :cond_b

    .line 1357
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fi;->h:Ljava/util/List;

    iget v1, p0, Lcom/roidapp/photogrid/release/fi;->j:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    const v1, 0x7f0d0493

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 85
    :cond_b
    return-object v5
.end method
