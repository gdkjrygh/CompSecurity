.class public Lcom/bumptech/glide/b/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;

.field private static final b:Landroid/graphics/Bitmap$Config;


# instance fields
.field private c:[I

.field private d:Ljava/nio/ByteBuffer;

.field private final e:[B

.field private f:[S

.field private g:[B

.field private h:[B

.field private i:[B

.field private j:[I

.field private k:I

.field private l:[B

.field private m:Lcom/bumptech/glide/b/d;

.field private n:Lcom/bumptech/glide/b/b;

.field private o:Landroid/graphics/Bitmap;

.field private p:Z

.field private q:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 57
    const-class v0, Lcom/bumptech/glide/b/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/bumptech/glide/b/a;->a:Ljava/lang/String;

    .line 104
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    sput-object v0, Lcom/bumptech/glide/b/a;->b:Landroid/graphics/Bitmap$Config;

    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/b/b;)V
    .locals 1

    .prologue
    .line 154
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    const/16 v0, 0x100

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/bumptech/glide/b/a;->e:[B

    .line 155
    iput-object p1, p0, Lcom/bumptech/glide/b/a;->n:Lcom/bumptech/glide/b/b;

    .line 156
    new-instance v0, Lcom/bumptech/glide/b/d;

    invoke-direct {v0}, Lcom/bumptech/glide/b/d;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/b/a;->m:Lcom/bumptech/glide/b/d;

    .line 157
    return-void
.end method

.method private a(Lcom/bumptech/glide/b/c;Lcom/bumptech/glide/b/c;)Landroid/graphics/Bitmap;
    .locals 25

    .prologue
    .line 426
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/bumptech/glide/b/a;->m:Lcom/bumptech/glide/b/d;

    iget v4, v1, Lcom/bumptech/glide/b/d;->f:I

    .line 427
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/bumptech/glide/b/a;->m:Lcom/bumptech/glide/b/d;

    iget v8, v1, Lcom/bumptech/glide/b/d;->g:I

    .line 430
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/bumptech/glide/b/a;->j:[I

    .line 433
    if-eqz p2, :cond_1

    move-object/from16 v0, p2

    iget v1, v0, Lcom/bumptech/glide/b/c;->g:I

    if-lez v1, :cond_1

    .line 436
    move-object/from16 v0, p2

    iget v1, v0, Lcom/bumptech/glide/b/c;->g:I

    const/4 v3, 0x2

    if-ne v1, v3, :cond_8

    .line 438
    const/4 v1, 0x0

    .line 439
    move-object/from16 v0, p1

    iget-boolean v3, v0, Lcom/bumptech/glide/b/c;->f:Z

    if-nez v3, :cond_0

    .line 440
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/bumptech/glide/b/a;->m:Lcom/bumptech/glide/b/d;

    iget v1, v1, Lcom/bumptech/glide/b/d;->l:I

    .line 442
    :cond_0
    invoke-static {v2, v1}, Ljava/util/Arrays;->fill([II)V

    .line 1524
    :cond_1
    :goto_0
    if-eqz p1, :cond_2

    .line 1526
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/bumptech/glide/b/a;->d:Ljava/nio/ByteBuffer;

    move-object/from16 v0, p1

    iget v3, v0, Lcom/bumptech/glide/b/c;->j:I

    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 1529
    :cond_2
    if-nez p1, :cond_9

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/bumptech/glide/b/a;->m:Lcom/bumptech/glide/b/d;

    iget v1, v1, Lcom/bumptech/glide/b/d;->f:I

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/bumptech/glide/b/a;->m:Lcom/bumptech/glide/b/d;

    iget v3, v3, Lcom/bumptech/glide/b/d;->g:I

    mul-int/2addr v1, v3

    .line 1533
    :goto_1
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/bumptech/glide/b/a;->i:[B

    if-eqz v3, :cond_3

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/bumptech/glide/b/a;->i:[B

    array-length v3, v3

    if-ge v3, v1, :cond_4

    .line 1535
    :cond_3
    new-array v3, v1, [B

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/bumptech/glide/b/a;->i:[B

    .line 1537
    :cond_4
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/bumptech/glide/b/a;->f:[S

    if-nez v3, :cond_5

    .line 1538
    const/16 v3, 0x1000

    new-array v3, v3, [S

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/bumptech/glide/b/a;->f:[S

    .line 1540
    :cond_5
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/bumptech/glide/b/a;->g:[B

    if-nez v3, :cond_6

    .line 1541
    const/16 v3, 0x1000

    new-array v3, v3, [B

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/bumptech/glide/b/a;->g:[B

    .line 1543
    :cond_6
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/bumptech/glide/b/a;->h:[B

    if-nez v3, :cond_7

    .line 1544
    const/16 v3, 0x1001

    new-array v3, v3, [B

    move-object/from16 v0, p0

    iput-object v3, v0, Lcom/bumptech/glide/b/a;->h:[B

    .line 1548
    :cond_7
    invoke-direct/range {p0 .. p0}, Lcom/bumptech/glide/b/a;->h()I

    move-result v19

    .line 1549
    const/4 v3, 0x1

    shl-int v20, v3, v19

    .line 1550
    add-int/lit8 v21, v20, 0x1

    .line 1551
    add-int/lit8 v6, v20, 0x2

    .line 1552
    const/4 v13, -0x1

    .line 1553
    add-int/lit8 v3, v19, 0x1

    .line 1554
    const/4 v5, 0x1

    shl-int/2addr v5, v3

    add-int/lit8 v5, v5, -0x1

    .line 1555
    const/4 v7, 0x0

    :goto_2
    move/from16 v0, v20

    if-ge v7, v0, :cond_a

    .line 1557
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/bumptech/glide/b/a;->f:[S

    const/4 v10, 0x0

    aput-short v10, v9, v7

    .line 1558
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/bumptech/glide/b/a;->g:[B

    int-to-byte v10, v7

    aput-byte v10, v9, v7

    .line 1555
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 443
    :cond_8
    move-object/from16 v0, p2

    iget v1, v0, Lcom/bumptech/glide/b/c;->g:I

    const/4 v3, 0x3

    if-ne v1, v3, :cond_1

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/bumptech/glide/b/a;->o:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_1

    .line 445
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/bumptech/glide/b/a;->o:Landroid/graphics/Bitmap;

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v7, v4

    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    goto/16 :goto_0

    .line 1529
    :cond_9
    move-object/from16 v0, p1

    iget v1, v0, Lcom/bumptech/glide/b/c;->c:I

    move-object/from16 v0, p1

    iget v3, v0, Lcom/bumptech/glide/b/c;->d:I

    mul-int/2addr v1, v3

    goto/16 :goto_1

    .line 1562
    :cond_a
    const/4 v7, 0x0

    .line 1563
    const/4 v10, 0x0

    move v11, v7

    move v14, v7

    move v9, v7

    move v12, v3

    move v15, v5

    move/from16 v16, v6

    move v3, v7

    move v5, v7

    move v6, v7

    :goto_3
    if-ge v10, v1, :cond_b

    .line 1565
    if-nez v5, :cond_d

    .line 1567
    invoke-direct/range {p0 .. p0}, Lcom/bumptech/glide/b/a;->i()I

    move-result v5

    .line 1568
    if-gtz v5, :cond_c

    .line 1569
    const/4 v3, 0x3

    move-object/from16 v0, p0

    iput v3, v0, Lcom/bumptech/glide/b/a;->q:I

    :cond_b
    move v3, v6

    .line 1645
    :goto_4
    if-ge v3, v1, :cond_13

    .line 1646
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/bumptech/glide/b/a;->i:[B

    const/4 v6, 0x0

    aput-byte v6, v5, v3

    .line 1645
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 1572
    :cond_c
    const/4 v3, 0x0

    .line 1575
    :cond_d
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/bumptech/glide/b/a;->e:[B

    move-object/from16 v17, v0

    aget-byte v17, v17, v3

    move/from16 v0, v17

    and-int/lit16 v0, v0, 0xff

    move/from16 v17, v0

    shl-int v17, v17, v9

    add-int v7, v7, v17

    .line 1576
    add-int/lit8 v9, v9, 0x8

    .line 1577
    add-int/lit8 v17, v3, 0x1

    .line 1578
    add-int/lit8 v18, v5, -0x1

    move v3, v12

    move v5, v15

    move v12, v14

    move/from16 v24, v9

    move v9, v7

    move v7, v6

    move/from16 v6, v16

    move/from16 v16, v24

    .line 1580
    :goto_5
    move/from16 v0, v16

    if-lt v0, v3, :cond_20

    .line 1582
    and-int v14, v9, v5

    .line 1583
    shr-int v15, v9, v3

    .line 1584
    sub-int v16, v16, v3

    .line 1587
    move/from16 v0, v20

    if-ne v14, v0, :cond_e

    .line 1589
    add-int/lit8 v3, v19, 0x1

    .line 1590
    const/4 v5, 0x1

    shl-int/2addr v5, v3

    add-int/lit8 v5, v5, -0x1

    .line 1591
    add-int/lit8 v6, v20, 0x2

    .line 1592
    const/4 v14, -0x1

    move v9, v15

    move v13, v14

    .line 1593
    goto :goto_5

    .line 1596
    :cond_e
    if-le v14, v6, :cond_f

    .line 1597
    const/4 v9, 0x3

    move-object/from16 v0, p0

    iput v9, v0, Lcom/bumptech/glide/b/a;->q:I

    move v14, v12

    move/from16 v9, v16

    move v12, v3

    move/from16 v16, v6

    move/from16 v3, v17

    move v6, v7

    move v7, v15

    move v15, v5

    move/from16 v5, v18

    .line 1598
    goto :goto_3

    .line 1601
    :cond_f
    move/from16 v0, v21

    if-eq v14, v0, :cond_1f

    .line 1605
    const/4 v9, -0x1

    if-ne v13, v9, :cond_10

    .line 1606
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/bumptech/glide/b/a;->h:[B

    add-int/lit8 v9, v11, 0x1

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/bumptech/glide/b/a;->g:[B

    aget-byte v13, v13, v14

    aput-byte v13, v12, v11

    move v11, v9

    move v12, v14

    move v13, v14

    move v9, v15

    .line 1609
    goto :goto_5

    .line 1612
    :cond_10
    if-lt v14, v6, :cond_1e

    .line 1613
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/bumptech/glide/b/a;->h:[B

    move-object/from16 v22, v0

    add-int/lit8 v9, v11, 0x1

    int-to-byte v12, v12

    aput-byte v12, v22, v11

    move v11, v9

    move v12, v13

    .line 1616
    :goto_6
    move/from16 v0, v20

    if-lt v12, v0, :cond_11

    .line 1617
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/bumptech/glide/b/a;->h:[B

    move-object/from16 v22, v0

    add-int/lit8 v9, v11, 0x1

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/bumptech/glide/b/a;->g:[B

    move-object/from16 v23, v0

    aget-byte v23, v23, v12

    aput-byte v23, v22, v11

    .line 1618
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/bumptech/glide/b/a;->f:[S

    aget-short v11, v11, v12

    move v12, v11

    move v11, v9

    goto :goto_6

    .line 1620
    :cond_11
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/bumptech/glide/b/a;->g:[B

    aget-byte v9, v9, v12

    and-int/lit16 v12, v9, 0xff

    .line 1621
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/bumptech/glide/b/a;->h:[B

    move-object/from16 v22, v0

    add-int/lit8 v9, v11, 0x1

    int-to-byte v0, v12

    move/from16 v23, v0

    aput-byte v23, v22, v11

    .line 1624
    const/16 v11, 0x1000

    if-ge v6, v11, :cond_12

    .line 1625
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/bumptech/glide/b/a;->f:[S

    int-to-short v13, v13

    aput-short v13, v11, v6

    .line 1626
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/bumptech/glide/b/a;->g:[B

    int-to-byte v13, v12

    aput-byte v13, v11, v6

    .line 1627
    add-int/lit8 v6, v6, 0x1

    .line 1628
    and-int v11, v6, v5

    if-nez v11, :cond_12

    const/16 v11, 0x1000

    if-ge v6, v11, :cond_12

    .line 1629
    add-int/lit8 v3, v3, 0x1

    .line 1630
    add-int/2addr v5, v6

    :cond_12
    move v11, v10

    .line 1635
    :goto_7
    if-lez v9, :cond_1d

    .line 1637
    add-int/lit8 v10, v9, -0x1

    .line 1638
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/bumptech/glide/b/a;->i:[B

    add-int/lit8 v9, v7, 0x1

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/bumptech/glide/b/a;->h:[B

    move-object/from16 v22, v0

    aget-byte v22, v22, v10

    aput-byte v22, v13, v7

    .line 1639
    add-int/lit8 v7, v11, 0x1

    move v11, v7

    move v7, v9

    move v9, v10

    goto :goto_7

    .line 453
    :cond_13
    const/4 v6, 0x1

    .line 454
    const/16 v5, 0x8

    .line 455
    const/4 v3, 0x0

    .line 456
    const/4 v1, 0x0

    :goto_8
    move-object/from16 v0, p1

    iget v7, v0, Lcom/bumptech/glide/b/c;->d:I

    if-ge v1, v7, :cond_18

    .line 458
    move-object/from16 v0, p1

    iget-boolean v7, v0, Lcom/bumptech/glide/b/c;->e:Z

    if-eqz v7, :cond_1c

    .line 459
    move-object/from16 v0, p1

    iget v7, v0, Lcom/bumptech/glide/b/c;->d:I

    if-lt v3, v7, :cond_14

    .line 460
    add-int/lit8 v6, v6, 0x1

    .line 461
    packed-switch v6, :pswitch_data_0

    .line 478
    :cond_14
    :goto_9
    add-int v7, v3, v5

    move/from16 v24, v3

    move v3, v7

    move/from16 v7, v24

    .line 480
    :goto_a
    move-object/from16 v0, p1

    iget v9, v0, Lcom/bumptech/glide/b/c;->b:I

    add-int/2addr v7, v9

    .line 481
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/bumptech/glide/b/a;->m:Lcom/bumptech/glide/b/d;

    iget v9, v9, Lcom/bumptech/glide/b/d;->g:I

    if-ge v7, v9, :cond_17

    .line 482
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/bumptech/glide/b/a;->m:Lcom/bumptech/glide/b/d;

    iget v9, v9, Lcom/bumptech/glide/b/d;->f:I

    mul-int v10, v7, v9

    .line 484
    move-object/from16 v0, p1

    iget v7, v0, Lcom/bumptech/glide/b/c;->a:I

    add-int v9, v10, v7

    .line 486
    move-object/from16 v0, p1

    iget v7, v0, Lcom/bumptech/glide/b/c;->c:I

    add-int/2addr v7, v9

    .line 487
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/bumptech/glide/b/a;->m:Lcom/bumptech/glide/b/d;

    iget v11, v11, Lcom/bumptech/glide/b/d;->f:I

    add-int/2addr v11, v10

    if-ge v11, v7, :cond_15

    .line 489
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/bumptech/glide/b/a;->m:Lcom/bumptech/glide/b/d;

    iget v7, v7, Lcom/bumptech/glide/b/d;->f:I

    add-int/2addr v7, v10

    .line 492
    :cond_15
    move-object/from16 v0, p1

    iget v10, v0, Lcom/bumptech/glide/b/c;->c:I

    mul-int/2addr v10, v1

    .line 493
    :goto_b
    if-ge v9, v7, :cond_17

    .line 495
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/bumptech/glide/b/a;->i:[B

    add-int/lit8 v11, v10, 0x1

    aget-byte v10, v12, v10

    and-int/lit16 v10, v10, 0xff

    .line 496
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/bumptech/glide/b/a;->c:[I

    aget v10, v12, v10

    .line 497
    if-eqz v10, :cond_16

    .line 498
    aput v10, v2, v9

    .line 500
    :cond_16
    add-int/lit8 v9, v9, 0x1

    move v10, v11

    .line 501
    goto :goto_b

    .line 463
    :pswitch_0
    const/4 v3, 0x4

    .line 464
    goto :goto_9

    .line 466
    :pswitch_1
    const/4 v3, 0x2

    .line 467
    const/4 v5, 0x4

    .line 468
    goto :goto_9

    .line 470
    :pswitch_2
    const/4 v3, 0x1

    .line 471
    const/4 v5, 0x2

    goto :goto_9

    .line 456
    :cond_17
    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    .line 506
    :cond_18
    move-object/from16 v0, p0

    iget-boolean v1, v0, Lcom/bumptech/glide/b/a;->p:Z

    if-eqz v1, :cond_1b

    move-object/from16 v0, p1

    iget v1, v0, Lcom/bumptech/glide/b/c;->g:I

    if-eqz v1, :cond_19

    move-object/from16 v0, p1

    iget v1, v0, Lcom/bumptech/glide/b/c;->g:I

    const/4 v3, 0x1

    if-ne v1, v3, :cond_1b

    .line 508
    :cond_19
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/bumptech/glide/b/a;->o:Landroid/graphics/Bitmap;

    if-nez v1, :cond_1a

    .line 509
    invoke-direct/range {p0 .. p0}, Lcom/bumptech/glide/b/a;->j()Landroid/graphics/Bitmap;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/bumptech/glide/b/a;->o:Landroid/graphics/Bitmap;

    .line 511
    :cond_1a
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/bumptech/glide/b/a;->o:Landroid/graphics/Bitmap;

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v7, v4

    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    .line 515
    :cond_1b
    invoke-direct/range {p0 .. p0}, Lcom/bumptech/glide/b/a;->j()Landroid/graphics/Bitmap;

    move-result-object v1

    .line 516
    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v7, v4

    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    .line 517
    return-object v1

    :cond_1c
    move v7, v1

    goto/16 :goto_a

    :cond_1d
    move v10, v11

    move v13, v14

    move v11, v9

    move v9, v15

    goto/16 :goto_5

    :cond_1e
    move v12, v14

    goto/16 :goto_6

    :cond_1f
    move v14, v12

    move/from16 v9, v16

    move v12, v3

    move/from16 v16, v6

    move/from16 v3, v17

    move v6, v7

    move v7, v15

    move v15, v5

    move/from16 v5, v18

    goto/16 :goto_3

    :cond_20
    move v14, v12

    move v15, v5

    move/from16 v5, v18

    move v12, v3

    move/from16 v3, v17

    move/from16 v24, v16

    move/from16 v16, v6

    move v6, v7

    move v7, v9

    move/from16 v9, v24

    goto/16 :goto_3

    .line 461
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private h()I
    .locals 2

    .prologue
    .line 654
    const/4 v0, 0x0

    .line 656
    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/b/a;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    and-int/lit16 v0, v0, 0xff

    .line 660
    :goto_0
    return v0

    .line 658
    :catch_0
    move-exception v1

    const/4 v1, 0x1

    iput v1, p0, Lcom/bumptech/glide/b/a;->q:I

    goto :goto_0
.end method

.method private i()I
    .locals 5

    .prologue
    .line 669
    invoke-direct {p0}, Lcom/bumptech/glide/b/a;->h()I

    move-result v1

    .line 670
    const/4 v0, 0x0

    .line 671
    if-lez v1, :cond_0

    .line 674
    :goto_0
    if-ge v0, v1, :cond_0

    .line 675
    sub-int v2, v1, v0

    .line 676
    :try_start_0
    iget-object v3, p0, Lcom/bumptech/glide/b/a;->d:Ljava/nio/ByteBuffer;

    iget-object v4, p0, Lcom/bumptech/glide/b/a;->e:[B

    invoke-virtual {v3, v4, v0, v2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 678
    add-int/2addr v0, v2

    goto :goto_0

    .line 680
    :catch_0
    move-exception v1

    .line 681
    sget-object v2, Lcom/bumptech/glide/b/a;->a:Ljava/lang/String;

    const-string v3, "Error Reading Block"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 682
    const/4 v1, 0x1

    iput v1, p0, Lcom/bumptech/glide/b/a;->q:I

    .line 685
    :cond_0
    return v0
.end method

.method private j()Landroid/graphics/Bitmap;
    .locals 4

    .prologue
    .line 689
    iget-object v0, p0, Lcom/bumptech/glide/b/a;->n:Lcom/bumptech/glide/b/b;

    iget-object v1, p0, Lcom/bumptech/glide/b/a;->m:Lcom/bumptech/glide/b/d;

    iget v1, v1, Lcom/bumptech/glide/b/d;->f:I

    iget-object v2, p0, Lcom/bumptech/glide/b/a;->m:Lcom/bumptech/glide/b/d;

    iget v2, v2, Lcom/bumptech/glide/b/d;->g:I

    sget-object v3, Lcom/bumptech/glide/b/a;->b:Landroid/graphics/Bitmap$Config;

    invoke-interface {v0, v1, v2, v3}, Lcom/bumptech/glide/b/b;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 690
    if-nez v0, :cond_0

    .line 691
    iget-object v0, p0, Lcom/bumptech/glide/b/a;->m:Lcom/bumptech/glide/b/d;

    iget v0, v0, Lcom/bumptech/glide/b/d;->f:I

    iget-object v1, p0, Lcom/bumptech/glide/b/a;->m:Lcom/bumptech/glide/b/d;

    iget v1, v1, Lcom/bumptech/glide/b/d;->g:I

    sget-object v2, Lcom/bumptech/glide/b/a;->b:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 1699
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xc

    if-lt v1, v2, :cond_1

    .line 1700
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->setHasAlpha(Z)V

    .line 694
    :cond_1
    return-object v0
.end method


# virtual methods
.method public final a(I)I
    .locals 2

    .prologue
    .line 197
    const/4 v0, -0x1

    .line 198
    if-ltz p1, :cond_0

    iget-object v1, p0, Lcom/bumptech/glide/b/a;->m:Lcom/bumptech/glide/b/d;

    iget v1, v1, Lcom/bumptech/glide/b/d;->c:I

    if-ge p1, v1, :cond_0

    .line 199
    iget-object v0, p0, Lcom/bumptech/glide/b/a;->m:Lcom/bumptech/glide/b/d;

    iget-object v0, v0, Lcom/bumptech/glide/b/d;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/b/c;

    iget v0, v0, Lcom/bumptech/glide/b/c;->i:I

    .line 201
    :cond_0
    return v0
.end method

.method public final a()V
    .locals 2

    .prologue
    .line 187
    iget v0, p0, Lcom/bumptech/glide/b/a;->k:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lcom/bumptech/glide/b/a;->m:Lcom/bumptech/glide/b/d;

    iget v1, v1, Lcom/bumptech/glide/b/d;->c:I

    rem-int/2addr v0, v1

    iput v0, p0, Lcom/bumptech/glide/b/a;->k:I

    .line 188
    return-void
.end method

.method public final a(Lcom/bumptech/glide/b/d;[B)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 358
    iput-object p1, p0, Lcom/bumptech/glide/b/a;->m:Lcom/bumptech/glide/b/d;

    .line 359
    iput-object p2, p0, Lcom/bumptech/glide/b/a;->l:[B

    .line 360
    iput v2, p0, Lcom/bumptech/glide/b/a;->q:I

    .line 361
    const/4 v0, -0x1

    iput v0, p0, Lcom/bumptech/glide/b/a;->k:I

    .line 363
    invoke-static {p2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/b/a;->d:Ljava/nio/ByteBuffer;

    .line 364
    iget-object v0, p0, Lcom/bumptech/glide/b/a;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 365
    iget-object v0, p0, Lcom/bumptech/glide/b/a;->d:Ljava/nio/ByteBuffer;

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 369
    iput-boolean v2, p0, Lcom/bumptech/glide/b/a;->p:Z

    .line 370
    iget-object v0, p1, Lcom/bumptech/glide/b/d;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/b/c;

    .line 371
    iget v0, v0, Lcom/bumptech/glide/b/c;->g:I

    const/4 v2, 0x3

    if-ne v0, v2, :cond_0

    .line 372
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/b/a;->p:Z

    .line 378
    :cond_1
    iget v0, p1, Lcom/bumptech/glide/b/d;->f:I

    iget v1, p1, Lcom/bumptech/glide/b/d;->g:I

    mul-int/2addr v0, v1

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/bumptech/glide/b/a;->i:[B

    .line 379
    iget v0, p1, Lcom/bumptech/glide/b/d;->f:I

    iget v1, p1, Lcom/bumptech/glide/b/d;->g:I

    mul-int/2addr v0, v1

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/bumptech/glide/b/a;->j:[I

    .line 380
    return-void
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 208
    iget-object v0, p0, Lcom/bumptech/glide/b/a;->m:Lcom/bumptech/glide/b/d;

    iget v0, v0, Lcom/bumptech/glide/b/d;->c:I

    if-lez v0, :cond_0

    iget v0, p0, Lcom/bumptech/glide/b/a;->k:I

    if-gez v0, :cond_1

    .line 209
    :cond_0
    const/4 v0, -0x1

    .line 212
    :goto_0
    return v0

    :cond_1
    iget v0, p0, Lcom/bumptech/glide/b/a;->k:I

    invoke-virtual {p0, v0}, Lcom/bumptech/glide/b/a;->a(I)I

    move-result v0

    goto :goto_0
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 221
    iget-object v0, p0, Lcom/bumptech/glide/b/a;->m:Lcom/bumptech/glide/b/d;

    iget v0, v0, Lcom/bumptech/glide/b/d;->c:I

    return v0
.end method

.method public final d()I
    .locals 1

    .prologue
    .line 230
    iget v0, p0, Lcom/bumptech/glide/b/a;->k:I

    return v0
.end method

.method public final e()I
    .locals 1

    .prologue
    .line 243
    iget-object v0, p0, Lcom/bumptech/glide/b/a;->m:Lcom/bumptech/glide/b/d;

    iget v0, v0, Lcom/bumptech/glide/b/d;->m:I

    return v0
.end method

.method public final declared-synchronized f()Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    const/4 v2, 0x0

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 252
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/b/a;->m:Lcom/bumptech/glide/b/d;

    iget v0, v0, Lcom/bumptech/glide/b/d;->c:I

    if-lez v0, :cond_0

    iget v0, p0, Lcom/bumptech/glide/b/a;->k:I

    if-gez v0, :cond_2

    .line 253
    :cond_0
    sget-object v0, Lcom/bumptech/glide/b/a;->a:Ljava/lang/String;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 254
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "unable to decode frame, frameCount="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/bumptech/glide/b/a;->m:Lcom/bumptech/glide/b/d;

    iget v1, v1, Lcom/bumptech/glide/b/d;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " framePointer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/bumptech/glide/b/a;->k:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 256
    :cond_1
    const/4 v0, 0x1

    iput v0, p0, Lcom/bumptech/glide/b/a;->q:I

    .line 258
    :cond_2
    iget v0, p0, Lcom/bumptech/glide/b/a;->q:I

    if-eq v0, v4, :cond_3

    iget v0, p0, Lcom/bumptech/glide/b/a;->q:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_5

    .line 259
    :cond_3
    sget-object v0, Lcom/bumptech/glide/b/a;->a:Ljava/lang/String;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 260
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unable to decode frame, status="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/bumptech/glide/b/a;->q:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    move-object v0, v2

    .line 306
    :goto_0
    monitor-exit p0

    return-object v0

    .line 264
    :cond_5
    const/4 v0, 0x0

    :try_start_1
    iput v0, p0, Lcom/bumptech/glide/b/a;->q:I

    .line 266
    iget-object v0, p0, Lcom/bumptech/glide/b/a;->m:Lcom/bumptech/glide/b/d;

    iget-object v0, v0, Lcom/bumptech/glide/b/d;->e:Ljava/util/List;

    iget v1, p0, Lcom/bumptech/glide/b/a;->k:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/b/c;

    .line 268
    iget v1, p0, Lcom/bumptech/glide/b/a;->k:I

    add-int/lit8 v1, v1, -0x1

    .line 269
    if-ltz v1, :cond_b

    .line 270
    iget-object v4, p0, Lcom/bumptech/glide/b/a;->m:Lcom/bumptech/glide/b/d;

    iget-object v4, v4, Lcom/bumptech/glide/b/d;->e:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bumptech/glide/b/c;

    move-object v4, v1

    .line 274
    :goto_1
    iget-object v1, v0, Lcom/bumptech/glide/b/c;->k:[I

    if-nez v1, :cond_8

    .line 275
    iget-object v1, p0, Lcom/bumptech/glide/b/a;->m:Lcom/bumptech/glide/b/d;

    iget-object v1, v1, Lcom/bumptech/glide/b/d;->a:[I

    iput-object v1, p0, Lcom/bumptech/glide/b/a;->c:[I

    .line 284
    :cond_6
    :goto_2
    iget-boolean v1, v0, Lcom/bumptech/glide/b/c;->f:Z

    if-eqz v1, :cond_7

    .line 285
    iget-object v1, p0, Lcom/bumptech/glide/b/a;->c:[I

    iget v3, v0, Lcom/bumptech/glide/b/c;->h:I

    aget v1, v1, v3

    .line 287
    iget-object v3, p0, Lcom/bumptech/glide/b/a;->c:[I

    iget v5, v0, Lcom/bumptech/glide/b/c;->h:I

    const/4 v6, 0x0

    aput v6, v3, v5

    move v3, v1

    .line 289
    :cond_7
    iget-object v1, p0, Lcom/bumptech/glide/b/a;->c:[I

    if-nez v1, :cond_9

    .line 290
    sget-object v0, Lcom/bumptech/glide/b/a;->a:Ljava/lang/String;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 294
    const/4 v0, 0x1

    iput v0, p0, Lcom/bumptech/glide/b/a;->q:I

    move-object v0, v2

    .line 295
    goto :goto_0

    .line 277
    :cond_8
    iget-object v1, v0, Lcom/bumptech/glide/b/c;->k:[I

    iput-object v1, p0, Lcom/bumptech/glide/b/a;->c:[I

    .line 278
    iget-object v1, p0, Lcom/bumptech/glide/b/a;->m:Lcom/bumptech/glide/b/d;

    iget v1, v1, Lcom/bumptech/glide/b/d;->j:I

    iget v5, v0, Lcom/bumptech/glide/b/c;->h:I

    if-ne v1, v5, :cond_6

    .line 279
    iget-object v1, p0, Lcom/bumptech/glide/b/a;->m:Lcom/bumptech/glide/b/d;

    const/4 v5, 0x0

    iput v5, v1, Lcom/bumptech/glide/b/d;->l:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    .line 252
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 299
    :cond_9
    :try_start_2
    invoke-direct {p0, v0, v4}, Lcom/bumptech/glide/b/a;->a(Lcom/bumptech/glide/b/c;Lcom/bumptech/glide/b/c;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 302
    iget-boolean v2, v0, Lcom/bumptech/glide/b/c;->f:Z

    if-eqz v2, :cond_a

    .line 303
    iget-object v2, p0, Lcom/bumptech/glide/b/a;->c:[I

    iget v0, v0, Lcom/bumptech/glide/b/c;->h:I

    aput v3, v2, v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_a
    move-object v0, v1

    .line 306
    goto :goto_0

    :cond_b
    move-object v4, v2

    goto :goto_1
.end method

.method public final g()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 347
    iput-object v2, p0, Lcom/bumptech/glide/b/a;->m:Lcom/bumptech/glide/b/d;

    .line 348
    iput-object v2, p0, Lcom/bumptech/glide/b/a;->l:[B

    .line 349
    iput-object v2, p0, Lcom/bumptech/glide/b/a;->i:[B

    .line 350
    iput-object v2, p0, Lcom/bumptech/glide/b/a;->j:[I

    .line 351
    iget-object v0, p0, Lcom/bumptech/glide/b/a;->o:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 352
    iget-object v0, p0, Lcom/bumptech/glide/b/a;->n:Lcom/bumptech/glide/b/b;

    iget-object v1, p0, Lcom/bumptech/glide/b/a;->o:Landroid/graphics/Bitmap;

    invoke-interface {v0, v1}, Lcom/bumptech/glide/b/b;->a(Landroid/graphics/Bitmap;)V

    .line 354
    :cond_0
    iput-object v2, p0, Lcom/bumptech/glide/b/a;->o:Landroid/graphics/Bitmap;

    .line 355
    return-void
.end method
