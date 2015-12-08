.class public final Lc/a/a/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lc/a/a/g;

.field private static final b:Lc/a/a/a/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 53
    sget-object v0, Lc/a/a/g;->a:Lc/a/a/g;

    sput-object v0, Lc/a/a/i;->a:Lc/a/a/g;

    .line 58
    new-instance v0, Lc/a/a/a/a;

    invoke-direct {v0}, Lc/a/a/a/a;-><init>()V

    sput-object v0, Lc/a/a/i;->b:Lc/a/a/a/a;

    return-void
.end method

.method public static a(Ljava/lang/Object;Ljava/lang/Appendable;Lc/a/a/g;)V
    .locals 16

    .prologue
    .line 445
    move-object/from16 v3, p0

    :goto_0
    if-nez v3, :cond_0

    .line 446
    const-string v2, "null"

    move-object/from16 v0, p1

    invoke-interface {v0, v2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 626
    :goto_1
    return-void

    .line 450
    :cond_0
    instance-of v2, v3, Ljava/lang/String;

    if-eqz v2, :cond_2

    move-object v2, v3

    .line 451
    check-cast v2, Ljava/lang/String;

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Lc/a/a/g;->b(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 452
    check-cast v3, Ljava/lang/String;

    move-object/from16 v0, p1

    invoke-interface {v0, v3}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_1

    .line 454
    :cond_1
    const/16 v2, 0x22

    move-object/from16 v0, p1

    invoke-interface {v0, v2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 455
    check-cast v3, Ljava/lang/String;

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-static {v3, v0, v1}, Lc/a/a/i;->a(Ljava/lang/String;Ljava/lang/Appendable;Lc/a/a/g;)V

    .line 456
    const/16 v2, 0x22

    move-object/from16 v0, p1

    invoke-interface {v0, v2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_1

    .line 461
    :cond_2
    instance-of v2, v3, Ljava/lang/Number;

    if-eqz v2, :cond_7

    .line 462
    instance-of v2, v3, Ljava/lang/Double;

    if-eqz v2, :cond_4

    move-object v2, v3

    .line 463
    check-cast v2, Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->isInfinite()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 464
    const-string v2, "null"

    move-object/from16 v0, p1

    invoke-interface {v0, v2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_1

    .line 466
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-interface {v0, v2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_1

    .line 467
    :cond_4
    instance-of v2, v3, Ljava/lang/Float;

    if-eqz v2, :cond_6

    move-object v2, v3

    .line 468
    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->isInfinite()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 469
    const-string v2, "null"

    move-object/from16 v0, p1

    invoke-interface {v0, v2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_1

    .line 471
    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-interface {v0, v2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_1

    .line 473
    :cond_6
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-interface {v0, v2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_1

    .line 478
    :cond_7
    instance-of v2, v3, Ljava/lang/Boolean;

    if-eqz v2, :cond_8

    .line 479
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-interface {v0, v2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto/16 :goto_1

    .line 480
    :cond_8
    instance-of v2, v3, Lc/a/a/e;

    if-eqz v2, :cond_a

    .line 481
    instance-of v2, v3, Lc/a/a/f;

    if-eqz v2, :cond_9

    .line 482
    check-cast v3, Lc/a/a/f;

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-interface {v3, v0, v1}, Lc/a/a/f;->a(Ljava/lang/Appendable;Lc/a/a/g;)V

    goto/16 :goto_1

    .line 484
    :cond_9
    check-cast v3, Lc/a/a/e;

    move-object/from16 v0, p1

    invoke-interface {v3, v0}, Lc/a/a/e;->a(Ljava/lang/Appendable;)V

    goto/16 :goto_1

    .line 485
    :cond_a
    instance-of v2, v3, Lc/a/a/b;

    if-eqz v2, :cond_c

    .line 486
    instance-of v2, v3, Lc/a/a/c;

    if-eqz v2, :cond_b

    .line 487
    check-cast v3, Lc/a/a/c;

    move-object/from16 v0, p2

    invoke-interface {v3, v0}, Lc/a/a/c;->a(Lc/a/a/g;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-interface {v0, v2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto/16 :goto_1

    .line 489
    :cond_b
    check-cast v3, Lc/a/a/b;

    invoke-interface {v3}, Lc/a/a/b;->a()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-interface {v0, v2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto/16 :goto_1

    .line 490
    :cond_c
    instance-of v2, v3, Ljava/util/Map;

    if-eqz v2, :cond_d

    .line 491
    check-cast v3, Ljava/util/Map;

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-static {v3, v0, v1}, Lc/a/a/d;->a(Ljava/util/Map;Ljava/lang/Appendable;Lc/a/a/g;)V

    goto/16 :goto_1

    .line 492
    :cond_d
    instance-of v2, v3, Ljava/lang/Iterable;

    if-eqz v2, :cond_e

    .line 493
    check-cast v3, Ljava/lang/Iterable;

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-static {v3, v0, v1}, Lc/a/a/a;->a(Ljava/lang/Iterable;Ljava/lang/Appendable;Lc/a/a/g;)V

    goto/16 :goto_1

    .line 494
    :cond_e
    instance-of v2, v3, Ljava/util/Date;

    if-eqz v2, :cond_f

    .line 495
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    goto/16 :goto_0

    .line 496
    :cond_f
    instance-of v2, v3, Ljava/lang/Enum;

    if-eqz v2, :cond_11

    .line 498
    check-cast v3, Ljava/lang/Enum;

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    .line 499
    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Lc/a/a/g;->b(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_10

    .line 500
    move-object/from16 v0, p1

    invoke-interface {v0, v2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto/16 :goto_1

    .line 502
    :cond_10
    const/16 v3, 0x22

    move-object/from16 v0, p1

    invoke-interface {v0, v3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 503
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-static {v2, v0, v1}, Lc/a/a/i;->a(Ljava/lang/String;Ljava/lang/Appendable;Lc/a/a/g;)V

    .line 504
    const/16 v2, 0x22

    move-object/from16 v0, p1

    invoke-interface {v0, v2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto/16 :goto_1

    .line 507
    :cond_11
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    move-result v2

    if-eqz v2, :cond_23

    .line 508
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    .line 509
    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v2

    .line 511
    const/16 v4, 0x5b

    move-object/from16 v0, p1

    invoke-interface {v0, v4}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 512
    const/4 v4, 0x0

    .line 514
    invoke-virtual {v2}, Ljava/lang/Class;->isPrimitive()Z

    move-result v5

    if-eqz v5, :cond_20

    .line 515
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v2, v5, :cond_13

    .line 516
    check-cast v3, [I

    array-length v5, v3

    const/4 v2, 0x0

    move v15, v2

    move v2, v4

    move v4, v15

    :goto_2
    if-ge v4, v5, :cond_22

    aget v6, v3, v4

    .line 517
    if-eqz v2, :cond_12

    .line 518
    const/16 v7, 0x2c

    move-object/from16 v0, p1

    invoke-interface {v0, v7}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 521
    :goto_3
    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v0, p1

    invoke-interface {v0, v6}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 516
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 520
    :cond_12
    const/4 v2, 0x1

    goto :goto_3

    .line 523
    :cond_13
    sget-object v5, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne v2, v5, :cond_15

    .line 524
    check-cast v3, [S

    array-length v5, v3

    const/4 v2, 0x0

    move v15, v2

    move v2, v4

    move v4, v15

    :goto_4
    if-ge v4, v5, :cond_22

    aget-short v6, v3, v4

    .line 525
    if-eqz v2, :cond_14

    .line 526
    const/16 v7, 0x2c

    move-object/from16 v0, p1

    invoke-interface {v0, v7}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 529
    :goto_5
    invoke-static {v6}, Ljava/lang/Short;->toString(S)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v0, p1

    invoke-interface {v0, v6}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 524
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    .line 528
    :cond_14
    const/4 v2, 0x1

    goto :goto_5

    .line 531
    :cond_15
    sget-object v5, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne v2, v5, :cond_17

    .line 532
    check-cast v3, [B

    array-length v5, v3

    const/4 v2, 0x0

    move v15, v2

    move v2, v4

    move v4, v15

    :goto_6
    if-ge v4, v5, :cond_22

    aget-byte v6, v3, v4

    .line 533
    if-eqz v2, :cond_16

    .line 534
    const/16 v7, 0x2c

    move-object/from16 v0, p1

    invoke-interface {v0, v7}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 537
    :goto_7
    invoke-static {v6}, Ljava/lang/Byte;->toString(B)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v0, p1

    invoke-interface {v0, v6}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 532
    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    .line 536
    :cond_16
    const/4 v2, 0x1

    goto :goto_7

    .line 539
    :cond_17
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v2, v5, :cond_19

    .line 540
    check-cast v3, [J

    array-length v5, v3

    const/4 v2, 0x0

    move v15, v2

    move v2, v4

    move v4, v15

    :goto_8
    if-ge v4, v5, :cond_22

    aget-wide v6, v3, v4

    .line 541
    if-eqz v2, :cond_18

    .line 542
    const/16 v8, 0x2c

    move-object/from16 v0, p1

    invoke-interface {v0, v8}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 545
    :goto_9
    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v0, p1

    invoke-interface {v0, v6}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 540
    add-int/lit8 v4, v4, 0x1

    goto :goto_8

    .line 544
    :cond_18
    const/4 v2, 0x1

    goto :goto_9

    .line 547
    :cond_19
    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v2, v5, :cond_1b

    .line 548
    check-cast v3, [F

    array-length v5, v3

    const/4 v2, 0x0

    move v15, v2

    move v2, v4

    move v4, v15

    :goto_a
    if-ge v4, v5, :cond_22

    aget v6, v3, v4

    .line 549
    if-eqz v2, :cond_1a

    .line 550
    const/16 v7, 0x2c

    move-object/from16 v0, p1

    invoke-interface {v0, v7}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 553
    :goto_b
    invoke-static {v6}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v0, p1

    invoke-interface {v0, v6}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 548
    add-int/lit8 v4, v4, 0x1

    goto :goto_a

    .line 552
    :cond_1a
    const/4 v2, 0x1

    goto :goto_b

    .line 555
    :cond_1b
    sget-object v5, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v2, v5, :cond_1d

    .line 556
    check-cast v3, [D

    array-length v5, v3

    const/4 v2, 0x0

    move v15, v2

    move v2, v4

    move v4, v15

    :goto_c
    if-ge v4, v5, :cond_22

    aget-wide v6, v3, v4

    .line 557
    if-eqz v2, :cond_1c

    .line 558
    const/16 v8, 0x2c

    move-object/from16 v0, p1

    invoke-interface {v0, v8}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 561
    :goto_d
    invoke-static {v6, v7}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v0, p1

    invoke-interface {v0, v6}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 556
    add-int/lit8 v4, v4, 0x1

    goto :goto_c

    .line 560
    :cond_1c
    const/4 v2, 0x1

    goto :goto_d

    .line 563
    :cond_1d
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v2, v5, :cond_22

    .line 564
    check-cast v3, [Z

    array-length v5, v3

    const/4 v2, 0x0

    move v15, v2

    move v2, v4

    move v4, v15

    :goto_e
    if-ge v4, v5, :cond_22

    aget-boolean v6, v3, v4

    .line 565
    if-eqz v2, :cond_1e

    .line 566
    const/16 v7, 0x2c

    move-object/from16 v0, p1

    invoke-interface {v0, v7}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 569
    :goto_f
    if-eqz v6, :cond_1f

    .line 570
    const-string v6, "true"

    move-object/from16 v0, p1

    invoke-interface {v0, v6}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 564
    :goto_10
    add-int/lit8 v4, v4, 0x1

    goto :goto_e

    .line 568
    :cond_1e
    const/4 v2, 0x1

    goto :goto_f

    .line 572
    :cond_1f
    const-string v6, "false"

    move-object/from16 v0, p1

    invoke-interface {v0, v6}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_10

    .line 576
    :cond_20
    check-cast v3, [Ljava/lang/Object;

    array-length v5, v3

    const/4 v2, 0x0

    move v15, v2

    move v2, v4

    move v4, v15

    :goto_11
    if-ge v4, v5, :cond_22

    aget-object v6, v3, v4

    .line 577
    if-eqz v2, :cond_21

    .line 578
    const/16 v7, 0x2c

    move-object/from16 v0, p1

    invoke-interface {v0, v7}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 581
    :goto_12
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-static {v6, v0, v1}, Lc/a/a/i;->a(Ljava/lang/Object;Ljava/lang/Appendable;Lc/a/a/g;)V

    .line 576
    add-int/lit8 v4, v4, 0x1

    goto :goto_11

    .line 580
    :cond_21
    const/4 v2, 0x1

    goto :goto_12

    .line 584
    :cond_22
    const/16 v2, 0x5d

    move-object/from16 v0, p1

    invoke-interface {v0, v2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto/16 :goto_1

    .line 587
    :cond_23
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    .line 588
    const/4 v4, 0x0

    .line 589
    invoke-virtual {v6}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v7

    .line 590
    const/16 v2, 0x7b

    move-object/from16 v0, p1

    invoke-interface {v0, v2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 591
    array-length v8, v7

    const/4 v2, 0x0

    move v15, v2

    move v2, v4

    move v4, v15

    :goto_13
    if-ge v4, v8, :cond_2b

    aget-object v9, v7, v4

    .line 592
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v5

    .line 593
    and-int/lit16 v10, v5, 0x98

    if-gtz v10, :cond_24

    .line 594
    and-int/lit8 v5, v5, 0x1

    if-lez v5, :cond_25

    .line 597
    invoke-virtual {v9, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 617
    :goto_14
    if-eqz v2, :cond_2a

    .line 618
    const/16 v10, 0x2c

    move-object/from16 v0, p1

    invoke-interface {v0, v10}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 621
    :goto_15
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-static {v9, v5, v0, v1}, Lc/a/a/d;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Appendable;Lc/a/a/g;)V

    .line 591
    :cond_24
    add-int/lit8 v4, v4, 0x1

    goto :goto_13

    .line 599
    :cond_25
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v11

    add-int/lit8 v5, v11, 0x3

    new-array v12, v5, [C

    const/4 v5, 0x0

    const/16 v13, 0x67

    aput-char v13, v12, v5

    const/4 v5, 0x1

    const/16 v13, 0x65

    aput-char v13, v12, v5

    const/4 v5, 0x2

    const/16 v13, 0x74

    aput-char v13, v12, v5

    const/4 v5, 0x0

    invoke-virtual {v10, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v13, 0x61

    if-lt v5, v13, :cond_26

    const/16 v13, 0x7a

    if-gt v5, v13, :cond_26

    add-int/lit8 v5, v5, -0x20

    int-to-char v5, v5

    :cond_26
    const/4 v13, 0x3

    aput-char v5, v12, v13

    const/4 v5, 0x1

    :goto_16
    if-ge v5, v11, :cond_27

    add-int/lit8 v13, v5, 0x3

    invoke-virtual {v10, v5}, Ljava/lang/String;->charAt(I)C

    move-result v14

    aput-char v14, v12, v13

    add-int/lit8 v5, v5, 0x1

    goto :goto_16

    :cond_27
    new-instance v10, Ljava/lang/String;

    invoke-direct {v10, v12}, Ljava/lang/String;-><init>([C)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 600
    const/4 v5, 0x0

    .line 603
    const/4 v11, 0x0

    :try_start_1
    new-array v11, v11, [Ljava/lang/Class;

    invoke-virtual {v6, v10, v11}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v5

    .line 606
    :goto_17
    if-nez v5, :cond_29

    .line 607
    :try_start_2
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v10

    .line 608
    sget-object v11, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-eq v10, v11, :cond_28

    const-class v11, Ljava/lang/Boolean;

    if-ne v10, v11, :cond_29

    .line 609
    :cond_28
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lc/a/a/h;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 610
    const/4 v10, 0x0

    new-array v10, v10, [Ljava/lang/Class;

    invoke-virtual {v6, v5, v10}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 613
    :cond_29
    if-eqz v5, :cond_24

    .line 614
    const/4 v10, 0x0

    new-array v10, v10, [Ljava/lang/Object;

    invoke-virtual {v5, v3, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    goto/16 :goto_14

    .line 620
    :cond_2a
    const/4 v2, 0x1

    goto :goto_15

    .line 623
    :cond_2b
    const/16 v2, 0x7d

    move-object/from16 v0, p1

    invoke-interface {v0, v2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_1

    .line 624
    :catch_0
    move-exception v2

    .line 625
    new-instance v3, Ljava/lang/RuntimeException;

    invoke-direct {v3, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v3

    :catch_1
    move-exception v10

    goto :goto_17
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Appendable;Lc/a/a/g;)V
    .locals 0

    .prologue
    .line 691
    if-nez p0, :cond_0

    .line 694
    :goto_0
    return-void

    .line 693
    :cond_0
    invoke-virtual {p2, p0, p1}, Lc/a/a/g;->a(Ljava/lang/String;Ljava/lang/Appendable;)V

    goto :goto_0
.end method
