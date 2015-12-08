.class public final Lcom/b/a/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final synthetic a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 26
    const-class v0, Lcom/b/a/v;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/b/a/v;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/lang/String;IIILcom/b/a/z;Ljava/io/OutputStream;Lcom/b/a/m;)Lcom/b/a/m;
    .locals 13

    .prologue
    .line 416
    move-object/from16 v0, p4

    iget v11, v0, Lcom/b/a/z;->c:I

    .line 417
    move-object/from16 v0, p6

    iget v2, v0, Lcom/b/a/m;->c:I

    .line 418
    add-int v6, v2, p3

    .line 421
    add-int v3, v6, p1

    move-object/from16 v0, p6

    iget-object v4, v0, Lcom/b/a/m;->a:[B

    array-length v4, v4

    if-le v3, v4, :cond_7

    .line 424
    move-object/from16 v0, p6

    iget-object v2, v0, Lcom/b/a/m;->a:[B

    move-object/from16 v0, p6

    iget v3, v0, Lcom/b/a/m;->b:I

    move-object/from16 v0, p6

    iget v4, v0, Lcom/b/a/m;->c:I

    move-object/from16 v0, p6

    iget v5, v0, Lcom/b/a/m;->b:I

    sub-int/2addr v4, v5

    move-object/from16 v0, p5

    invoke-virtual {v0, v2, v3, v4}, Ljava/io/OutputStream;->write([BII)V

    .line 425
    move-object/from16 v0, p6

    iget v10, v0, Lcom/b/a/m;->b:I

    .line 426
    add-int v6, v10, p3

    .line 429
    add-int v2, v6, p1

    move-object/from16 v0, p6

    iget-object v3, v0, Lcom/b/a/m;->a:[B

    array-length v3, v3

    if-le v2, v3, :cond_6

    .line 432
    move-object/from16 v0, p6

    iput v6, v0, Lcom/b/a/m;->c:I

    .line 435
    const/4 v3, 0x0

    move-object/from16 v0, p6

    iget-object v5, v0, Lcom/b/a/m;->a:[B

    move-object/from16 v0, p6

    iget-object v2, v0, Lcom/b/a/m;->a:[B

    array-length v7, v2

    move-object v2, p0

    move v4, p1

    move-object/from16 v8, p4

    move-object/from16 v9, p6

    invoke-static/range {v2 .. v9}, Lcom/b/a/w;->a(Ljava/lang/String;II[BIILcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;

    move-result-object v7

    .line 438
    move-object/from16 v0, p4

    iget v2, v0, Lcom/b/a/z;->c:I

    sub-int/2addr v2, v11

    .line 440
    if-ge v2, p2, :cond_3

    .line 442
    move-object/from16 v0, p4

    iget v3, v0, Lcom/b/a/z;->c:I

    add-int/lit8 v4, p3, -0x1

    add-int/2addr v3, v4

    move-object/from16 v0, p4

    iput v3, v0, Lcom/b/a/z;->c:I

    .line 446
    add-int/lit8 v3, v10, 0x1

    move v5, v2

    move v2, v3

    .line 448
    :goto_0
    add-int/lit8 v6, v4, -0x1

    if-lez v6, :cond_0

    .line 449
    move-object/from16 v0, p6

    iget-object v8, v0, Lcom/b/a/m;->a:[B

    add-int/lit8 v4, v2, 0x1

    and-int/lit8 v9, v5, 0x7f

    or-int/lit16 v9, v9, 0x80

    int-to-byte v9, v9

    aput-byte v9, v8, v2

    .line 448
    ushr-int/lit8 v2, v5, 0x7

    move v5, v2

    move v2, v4

    move v4, v6

    goto :goto_0

    .line 451
    :cond_0
    move-object/from16 v0, p6

    iget-object v4, v0, Lcom/b/a/m;->a:[B

    int-to-byte v5, v5

    aput-byte v5, v4, v2

    .line 454
    move-object/from16 v0, p6

    iget-object v2, v0, Lcom/b/a/m;->a:[B

    move-object/from16 v0, p6

    iget v4, v0, Lcom/b/a/m;->c:I

    sub-int/2addr v4, v3

    move-object/from16 v0, p5

    invoke-virtual {v0, v2, v3, v4}, Ljava/io/OutputStream;->write([BII)V

    .line 456
    move-object/from16 v0, p6

    iget v2, v0, Lcom/b/a/m;->b:I

    move-object/from16 v0, p6

    iput v2, v0, Lcom/b/a/m;->c:I

    .line 458
    sget-boolean v2, Lcom/b/a/v;->a:Z

    if-nez v2, :cond_1

    move-object/from16 v0, p6

    if-ne v7, v0, :cond_1

    new-instance v2, Ljava/lang/AssertionError;

    invoke-direct {v2}, Ljava/lang/AssertionError;-><init>()V

    throw v2

    .line 460
    :cond_1
    move-object/from16 v0, p6

    iget-object v2, v0, Lcom/b/a/m;->d:Lcom/b/a/m;

    move-object/from16 v0, p5

    invoke-static {v2, v0}, Lcom/b/a/v;->a(Lcom/b/a/m;Ljava/io/OutputStream;)V

    .line 546
    :cond_2
    :goto_1
    return-object p6

    .line 466
    :cond_3
    move-object/from16 v0, p4

    iget v3, v0, Lcom/b/a/z;->c:I

    add-int v3, v3, p3

    move-object/from16 v0, p4

    iput v3, v0, Lcom/b/a/z;->c:I

    move v3, v2

    .line 468
    :goto_2
    add-int/lit8 p3, p3, -0x1

    if-lez p3, :cond_4

    .line 469
    move-object/from16 v0, p6

    iget-object v4, v0, Lcom/b/a/m;->a:[B

    add-int/lit8 v2, v10, 0x1

    and-int/lit8 v5, v3, 0x7f

    or-int/lit16 v5, v5, 0x80

    int-to-byte v5, v5

    aput-byte v5, v4, v10

    .line 468
    ushr-int/lit8 v3, v3, 0x7

    move v10, v2

    goto :goto_2

    .line 471
    :cond_4
    move-object/from16 v0, p6

    iget-object v2, v0, Lcom/b/a/m;->a:[B

    int-to-byte v3, v3

    aput-byte v3, v2, v10

    .line 473
    sget-boolean v2, Lcom/b/a/v;->a:Z

    if-nez v2, :cond_5

    move-object/from16 v0, p6

    if-ne v7, v0, :cond_5

    new-instance v2, Ljava/lang/AssertionError;

    invoke-direct {v2}, Ljava/lang/AssertionError;-><init>()V

    throw v2

    .line 475
    :cond_5
    move-object/from16 v0, p6

    move-object/from16 v1, p5

    invoke-static {v0, v1}, Lcom/b/a/v;->a(Lcom/b/a/m;Ljava/io/OutputStream;)V

    goto :goto_1

    :cond_6
    move v2, v10

    .line 482
    :cond_7
    move-object/from16 v0, p6

    iput v6, v0, Lcom/b/a/m;->c:I

    .line 484
    const/4 v3, 0x0

    move-object/from16 v0, p4

    move-object/from16 v1, p6

    invoke-static {p0, v3, p1, v0, v1}, Lcom/b/a/w;->a(Ljava/lang/String;IILcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;

    move-result-object v7

    .line 486
    move-object/from16 v0, p4

    iget v3, v0, Lcom/b/a/z;->c:I

    sub-int/2addr v3, v11

    .line 488
    if-ge v3, p2, :cond_c

    .line 493
    move-object/from16 v0, p6

    if-ne v7, v0, :cond_8

    const/4 v4, 0x2

    move/from16 v0, p3

    if-eq v0, v4, :cond_b

    .line 496
    :cond_8
    move-object/from16 v0, p4

    iget v4, v0, Lcom/b/a/z;->c:I

    add-int/lit8 v5, p3, -0x1

    add-int/2addr v4, v5

    move-object/from16 v0, p4

    iput v4, v0, Lcom/b/a/z;->c:I

    .line 499
    move-object/from16 v0, p6

    iget v4, v0, Lcom/b/a/m;->b:I

    if-eq v2, v4, :cond_9

    .line 500
    move-object/from16 v0, p6

    iget-object v4, v0, Lcom/b/a/m;->a:[B

    move-object/from16 v0, p6

    iget v6, v0, Lcom/b/a/m;->b:I

    move-object/from16 v0, p6

    iget v8, v0, Lcom/b/a/m;->b:I

    sub-int v8, v2, v8

    move-object/from16 v0, p5

    invoke-virtual {v0, v4, v6, v8}, Ljava/io/OutputStream;->write([BII)V

    .line 503
    :cond_9
    add-int/lit8 v4, v2, 0x1

    move v2, v4

    move v12, v3

    move v3, v5

    move v5, v12

    .line 505
    :goto_3
    add-int/lit8 v6, v3, -0x1

    if-lez v6, :cond_a

    .line 506
    move-object/from16 v0, p6

    iget-object v8, v0, Lcom/b/a/m;->a:[B

    add-int/lit8 v3, v2, 0x1

    and-int/lit8 v9, v5, 0x7f

    or-int/lit16 v9, v9, 0x80

    int-to-byte v9, v9

    aput-byte v9, v8, v2

    .line 505
    ushr-int/lit8 v2, v5, 0x7

    move v5, v2

    move v2, v3

    move v3, v6

    goto :goto_3

    .line 508
    :cond_a
    move-object/from16 v0, p6

    iget-object v3, v0, Lcom/b/a/m;->a:[B

    int-to-byte v5, v5

    aput-byte v5, v3, v2

    .line 511
    move-object/from16 v0, p6

    iget-object v2, v0, Lcom/b/a/m;->a:[B

    move-object/from16 v0, p6

    iget v3, v0, Lcom/b/a/m;->c:I

    sub-int/2addr v3, v4

    move-object/from16 v0, p5

    invoke-virtual {v0, v2, v4, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 513
    move-object/from16 v0, p6

    iget v2, v0, Lcom/b/a/m;->b:I

    move-object/from16 v0, p6

    iput v2, v0, Lcom/b/a/m;->c:I

    .line 515
    move-object/from16 v0, p6

    if-eq v7, v0, :cond_2

    .line 518
    move-object/from16 v0, p6

    iget-object v2, v0, Lcom/b/a/m;->d:Lcom/b/a/m;

    move-object/from16 v0, p5

    invoke-static {v2, v0}, Lcom/b/a/v;->a(Lcom/b/a/m;Ljava/io/OutputStream;)V

    goto/16 :goto_1

    .line 525
    :cond_b
    move-object/from16 v0, p6

    iget-object v4, v0, Lcom/b/a/m;->a:[B

    move-object/from16 v0, p6

    iget-object v5, v0, Lcom/b/a/m;->a:[B

    add-int/lit8 v8, v6, -0x1

    move-object/from16 v0, p6

    iget v9, v0, Lcom/b/a/m;->c:I

    sub-int/2addr v9, v6

    invoke-static {v4, v6, v5, v8, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 528
    add-int/lit8 p3, p3, -0x1

    .line 529
    move-object/from16 v0, p6

    iget v4, v0, Lcom/b/a/m;->c:I

    add-int/lit8 v4, v4, -0x1

    move-object/from16 v0, p6

    iput v4, v0, Lcom/b/a/m;->c:I

    .line 533
    :cond_c
    move-object/from16 v0, p4

    iget v4, v0, Lcom/b/a/z;->c:I

    add-int v4, v4, p3

    move-object/from16 v0, p4

    iput v4, v0, Lcom/b/a/z;->c:I

    move v4, v3

    .line 535
    :goto_4
    add-int/lit8 p3, p3, -0x1

    if-lez p3, :cond_d

    .line 536
    move-object/from16 v0, p6

    iget-object v5, v0, Lcom/b/a/m;->a:[B

    add-int/lit8 v3, v2, 0x1

    and-int/lit8 v6, v4, 0x7f

    or-int/lit16 v6, v6, 0x80

    int-to-byte v6, v6

    aput-byte v6, v5, v2

    .line 535
    ushr-int/lit8 v2, v4, 0x7

    move v4, v2

    move v2, v3

    goto :goto_4

    .line 538
    :cond_d
    move-object/from16 v0, p6

    iget-object v3, v0, Lcom/b/a/m;->a:[B

    int-to-byte v4, v4

    aput-byte v4, v3, v2

    .line 540
    move-object/from16 v0, p6

    if-eq v7, v0, :cond_2

    .line 543
    move-object/from16 v0, p6

    move-object/from16 v1, p5

    invoke-static {v0, v1}, Lcom/b/a/v;->a(Lcom/b/a/m;Ljava/io/OutputStream;)V

    goto/16 :goto_1
.end method

.method public static a(Ljava/lang/String;Lcom/b/a/z;Ljava/io/OutputStream;Lcom/b/a/m;)Lcom/b/a/m;
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 556
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    .line 557
    if-nez v1, :cond_2

    .line 559
    iget v0, p3, Lcom/b/a/m;->c:I

    iget-object v1, p3, Lcom/b/a/m;->a:[B

    array-length v1, v1

    if-ne v0, v1, :cond_0

    .line 563
    iget-object v0, p3, Lcom/b/a/m;->a:[B

    iget v1, p3, Lcom/b/a/m;->b:I

    iget v2, p3, Lcom/b/a/m;->c:I

    iget v3, p3, Lcom/b/a/m;->b:I

    sub-int/2addr v2, v3

    invoke-virtual {p2, v0, v1, v2}, Ljava/io/OutputStream;->write([BII)V

    .line 564
    iget v0, p3, Lcom/b/a/m;->b:I

    iput v0, p3, Lcom/b/a/m;->c:I

    .line 568
    :cond_0
    iget-object v0, p3, Lcom/b/a/m;->a:[B

    iget v1, p3, Lcom/b/a/m;->c:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p3, Lcom/b/a/m;->c:I

    aput-byte v6, v0, v1

    .line 570
    iget v0, p1, Lcom/b/a/z;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p1, Lcom/b/a/z;->c:I

    .line 602
    :cond_1
    :goto_0
    return-object p3

    .line 574
    :cond_2
    const/16 v0, 0x2b

    if-ge v1, v0, :cond_4

    .line 577
    iget v2, p1, Lcom/b/a/z;->c:I

    iget v0, p3, Lcom/b/a/m;->c:I

    add-int/lit8 v0, v0, 0x1

    add-int v3, v0, v1

    iget-object v4, p3, Lcom/b/a/m;->a:[B

    array-length v4, v4

    if-le v3, v4, :cond_3

    iget-object v0, p3, Lcom/b/a/m;->a:[B

    iget v3, p3, Lcom/b/a/m;->b:I

    iget v4, p3, Lcom/b/a/m;->c:I

    iget v5, p3, Lcom/b/a/m;->b:I

    sub-int/2addr v4, v5

    invoke-virtual {p2, v0, v3, v4}, Ljava/io/OutputStream;->write([BII)V

    iget v0, p3, Lcom/b/a/m;->b:I

    iput v0, p3, Lcom/b/a/m;->c:I

    iget v0, p3, Lcom/b/a/m;->c:I

    add-int/lit8 v0, v0, 0x1

    :cond_3
    iput v0, p3, Lcom/b/a/m;->c:I

    invoke-static {p0, v6, v1, p1, p3}, Lcom/b/a/w;->a(Ljava/lang/String;IILcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;

    move-result-object v1

    iget-object v3, p3, Lcom/b/a/m;->a:[B

    add-int/lit8 v0, v0, -0x1

    iget v4, p1, Lcom/b/a/z;->c:I

    sub-int v2, v4, v2

    int-to-byte v2, v2

    aput-byte v2, v3, v0

    iget v0, p1, Lcom/b/a/z;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p1, Lcom/b/a/z;->c:I

    if-eq v1, p3, :cond_1

    invoke-static {p3, p2}, Lcom/b/a/v;->a(Lcom/b/a/m;Ljava/io/OutputStream;)V

    goto :goto_0

    .line 580
    :cond_4
    const/16 v0, 0x2ab

    if-ge v1, v0, :cond_5

    .line 583
    const/16 v2, 0x80

    const/4 v3, 0x2

    move-object v0, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-static/range {v0 .. v6}, Lcom/b/a/v;->a(Ljava/lang/String;IIILcom/b/a/z;Ljava/io/OutputStream;Lcom/b/a/m;)Lcom/b/a/m;

    move-result-object p3

    goto :goto_0

    .line 587
    :cond_5
    const/16 v0, 0x2aab

    if-ge v1, v0, :cond_6

    .line 590
    const/16 v2, 0x800

    const/4 v3, 0x3

    move-object v0, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-static/range {v0 .. v6}, Lcom/b/a/v;->a(Ljava/lang/String;IIILcom/b/a/z;Ljava/io/OutputStream;Lcom/b/a/m;)Lcom/b/a/m;

    move-result-object p3

    goto :goto_0

    .line 594
    :cond_6
    const v0, 0x2aaab

    if-ge v1, v0, :cond_7

    .line 597
    const v2, 0x8000

    const/4 v3, 0x4

    move-object v0, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-static/range {v0 .. v6}, Lcom/b/a/v;->a(Ljava/lang/String;IIILcom/b/a/z;Ljava/io/OutputStream;Lcom/b/a/m;)Lcom/b/a/m;

    move-result-object p3

    goto :goto_0

    .line 602
    :cond_7
    const/high16 v2, 0x80000

    const/4 v3, 0x5

    move-object v0, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-static/range {v0 .. v6}, Lcom/b/a/v;->a(Ljava/lang/String;IIILcom/b/a/z;Ljava/io/OutputStream;Lcom/b/a/m;)Lcom/b/a/m;

    move-result-object p3

    goto :goto_0
.end method

.method private static a(Lcom/b/a/m;Ljava/io/OutputStream;)V
    .locals 3

    .prologue
    .line 275
    :cond_0
    iget v0, p0, Lcom/b/a/m;->c:I

    iget v1, p0, Lcom/b/a/m;->b:I

    sub-int/2addr v0, v1

    if-lez v0, :cond_1

    .line 277
    iget-object v1, p0, Lcom/b/a/m;->a:[B

    iget v2, p0, Lcom/b/a/m;->b:I

    invoke-virtual {p1, v1, v2, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 278
    iget v0, p0, Lcom/b/a/m;->b:I

    iput v0, p0, Lcom/b/a/m;->c:I

    .line 281
    :cond_1
    iget-object p0, p0, Lcom/b/a/m;->d:Lcom/b/a/m;

    if-nez p0, :cond_0

    .line 282
    return-void
.end method
