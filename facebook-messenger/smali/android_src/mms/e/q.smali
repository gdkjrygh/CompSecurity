.class public Landroid_src/mms/e/q;
.super Ljava/lang/Object;
.source "PduHeaders.java"


# instance fields
.field private a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 330
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 325
    const/4 v0, 0x0

    iput-object v0, p0, Landroid_src/mms/e/q;->a:Ljava/util/HashMap;

    .line 331
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroid_src/mms/e/q;->a:Ljava/util/HashMap;

    .line 332
    return-void
.end method


# virtual methods
.method protected a(I)I
    .locals 2

    .prologue
    .line 343
    iget-object v0, p0, Landroid_src/mms/e/q;->a:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 344
    if-nez v0, :cond_0

    .line 345
    const/4 v0, 0x0

    .line 348
    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0
.end method

.method protected a(II)V
    .locals 5

    .prologue
    const/16 v2, 0x81

    const/16 v4, 0xff

    const/16 v0, 0xc0

    const/16 v1, 0xe0

    const/16 v3, 0x80

    .line 364
    packed-switch p2, :pswitch_data_0

    .line 490
    :pswitch_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Invalid header field!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 376
    :pswitch_1
    if-eq v3, p1, :cond_5

    if-eq v2, p1, :cond_5

    .line 378
    new-instance v0, Landroid_src/mms/b;

    const-string v1, "Invalid Octet value!"

    invoke-direct {v0, v1}, Landroid_src/mms/b;-><init>(Ljava/lang/String;)V

    throw v0

    .line 382
    :pswitch_2
    if-eq v3, p1, :cond_5

    if-eq v2, p1, :cond_5

    .line 385
    new-instance v0, Landroid_src/mms/b;

    const-string v1, "Invalid Octet value!"

    invoke-direct {v0, v1}, Landroid_src/mms/b;-><init>(Ljava/lang/String;)V

    throw v0

    .line 389
    :pswitch_3
    if-eq v3, p1, :cond_5

    if-eq v2, p1, :cond_5

    .line 392
    new-instance v0, Landroid_src/mms/b;

    const-string v1, "Invalid Octet value!"

    invoke-direct {v0, v1}, Landroid_src/mms/b;-><init>(Ljava/lang/String;)V

    throw v0

    .line 396
    :pswitch_4
    if-lt p1, v3, :cond_0

    const/16 v0, 0x82

    if-le p1, v0, :cond_5

    .line 398
    :cond_0
    new-instance v0, Landroid_src/mms/b;

    const-string v1, "Invalid Octet value!"

    invoke-direct {v0, v1}, Landroid_src/mms/b;-><init>(Ljava/lang/String;)V

    throw v0

    .line 402
    :pswitch_5
    if-lt p1, v3, :cond_1

    const/16 v0, 0x87

    if-le p1, v0, :cond_5

    .line 404
    :cond_1
    new-instance v0, Landroid_src/mms/b;

    const-string v1, "Invalid Octet value!"

    invoke-direct {v0, v1}, Landroid_src/mms/b;-><init>(Ljava/lang/String;)V

    throw v0

    .line 408
    :pswitch_6
    if-lt p1, v3, :cond_2

    const/16 v0, 0x83

    if-le p1, v0, :cond_5

    .line 411
    :cond_2
    new-instance v0, Landroid_src/mms/b;

    const-string v1, "Invalid Octet value!"

    invoke-direct {v0, v1}, Landroid_src/mms/b;-><init>(Ljava/lang/String;)V

    throw v0

    .line 415
    :pswitch_7
    if-lt p1, v3, :cond_3

    const/16 v0, 0x84

    if-le p1, v0, :cond_5

    .line 417
    :cond_3
    new-instance v0, Landroid_src/mms/b;

    const-string v1, "Invalid Octet value!"

    invoke-direct {v0, v1}, Landroid_src/mms/b;-><init>(Ljava/lang/String;)V

    throw v0

    .line 421
    :pswitch_8
    if-eq v3, p1, :cond_5

    .line 423
    new-instance v0, Landroid_src/mms/b;

    const-string v1, "Invalid Octet value!"

    invoke-direct {v0, v1}, Landroid_src/mms/b;-><init>(Ljava/lang/String;)V

    throw v0

    .line 427
    :pswitch_9
    if-lt p1, v3, :cond_4

    const/16 v0, 0x87

    if-le p1, v0, :cond_5

    .line 430
    :cond_4
    new-instance v0, Landroid_src/mms/b;

    const-string v1, "Invalid Octet value!"

    invoke-direct {v0, v1}, Landroid_src/mms/b;-><init>(Ljava/lang/String;)V

    throw v0

    .line 435
    :pswitch_a
    const/16 v2, 0xc2

    if-le p1, v2, :cond_6

    if-ge p1, v1, :cond_6

    move p1, v0

    .line 492
    :cond_5
    :goto_0
    iget-object v0, p0, Landroid_src/mms/e/q;->a:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 493
    return-void

    .line 438
    :cond_6
    const/16 v2, 0xe3

    if-le p1, v2, :cond_7

    if-gt p1, v4, :cond_7

    move p1, v1

    .line 440
    goto :goto_0

    .line 441
    :cond_7
    if-lt p1, v3, :cond_9

    if-le p1, v3, :cond_8

    if-lt p1, v0, :cond_9

    :cond_8
    if-le p1, v4, :cond_5

    :cond_9
    move p1, v1

    .line 445
    goto :goto_0

    .line 450
    :pswitch_b
    const/16 v2, 0xc1

    if-le p1, v2, :cond_a

    if-ge p1, v1, :cond_a

    move p1, v0

    .line 452
    goto :goto_0

    .line 453
    :cond_a
    const/16 v2, 0xe4

    if-le p1, v2, :cond_b

    if-gt p1, v4, :cond_b

    move p1, v1

    .line 455
    goto :goto_0

    .line 456
    :cond_b
    if-lt p1, v3, :cond_d

    if-le p1, v3, :cond_c

    if-lt p1, v0, :cond_d

    :cond_c
    if-le p1, v4, :cond_5

    :cond_d
    move p1, v1

    .line 460
    goto :goto_0

    .line 465
    :pswitch_c
    const/16 v2, 0xc4

    if-le p1, v2, :cond_e

    if-ge p1, v1, :cond_e

    move p1, v0

    .line 467
    goto :goto_0

    .line 468
    :cond_e
    const/16 v2, 0xeb

    if-le p1, v2, :cond_f

    if-le p1, v4, :cond_11

    :cond_f
    if-lt p1, v3, :cond_11

    const/16 v2, 0x88

    if-le p1, v2, :cond_10

    if-lt p1, v0, :cond_11

    :cond_10
    if-le p1, v4, :cond_5

    :cond_11
    move p1, v1

    .line 474
    goto :goto_0

    .line 478
    :pswitch_d
    const/16 v0, 0x10

    if-lt p1, v0, :cond_12

    const/16 v0, 0x13

    if-le p1, v0, :cond_5

    .line 479
    :cond_12
    const/16 p1, 0x12

    goto :goto_0

    .line 483
    :pswitch_e
    if-lt p1, v3, :cond_13

    const/16 v0, 0x97

    if-le p1, v0, :cond_5

    .line 485
    :cond_13
    new-instance v0, Landroid_src/mms/b;

    const-string v1, "Invalid Octet value!"

    invoke-direct {v0, v1}, Landroid_src/mms/b;-><init>(Ljava/lang/String;)V

    throw v0

    .line 364
    nop

    :pswitch_data_0
    .packed-switch 0x86
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_e
        :pswitch_d
        :pswitch_0
        :pswitch_4
        :pswitch_1
        :pswitch_1
        :pswitch_c
        :pswitch_0
        :pswitch_1
        :pswitch_5
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_a
        :pswitch_0
        :pswitch_2
        :pswitch_6
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_7
        :pswitch_0
        :pswitch_b
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_8
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_9
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method protected a(JI)V
    .locals 3

    .prologue
    .line 703
    sparse-switch p3, :sswitch_data_0

    .line 717
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Invalid header field!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 719
    :sswitch_0
    iget-object v0, p0, Landroid_src/mms/e/q;->a:Ljava/util/HashMap;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 720
    return-void

    .line 703
    nop

    :sswitch_data_0
    .sparse-switch
        0x85 -> :sswitch_0
        0x87 -> :sswitch_0
        0x88 -> :sswitch_0
        0x8e -> :sswitch_0
        0x9d -> :sswitch_0
        0x9f -> :sswitch_0
        0xa1 -> :sswitch_0
        0xad -> :sswitch_0
        0xaf -> :sswitch_0
        0xb3 -> :sswitch_0
    .end sparse-switch
.end method

.method protected a(Landroid_src/mms/e/e;I)V
    .locals 2

    .prologue
    .line 586
    if-nez p1, :cond_0

    .line 587
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 590
    :cond_0
    sparse-switch p2, :sswitch_data_0

    .line 603
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Invalid header field!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 606
    :sswitch_0
    iget-object v0, p0, Landroid_src/mms/e/q;->a:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 607
    return-void

    .line 590
    nop

    :sswitch_data_0
    .sparse-switch
        0x89 -> :sswitch_0
        0x93 -> :sswitch_0
        0x96 -> :sswitch_0
        0x9a -> :sswitch_0
        0xa0 -> :sswitch_0
        0xa4 -> :sswitch_0
        0xa6 -> :sswitch_0
        0xb5 -> :sswitch_0
        0xb6 -> :sswitch_0
    .end sparse-switch
.end method

.method protected a([BI)V
    .locals 2

    .prologue
    .line 520
    if-nez p1, :cond_0

    .line 521
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 524
    :cond_0
    sparse-switch p2, :sswitch_data_0

    .line 539
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Invalid header field!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 541
    :sswitch_0
    iget-object v0, p0, Landroid_src/mms/e/q;->a:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 542
    return-void

    .line 524
    nop

    :sswitch_data_0
    .sparse-switch
        0x83 -> :sswitch_0
        0x84 -> :sswitch_0
        0x8a -> :sswitch_0
        0x8b -> :sswitch_0
        0x98 -> :sswitch_0
        0x9e -> :sswitch_0
        0xb7 -> :sswitch_0
        0xb8 -> :sswitch_0
        0xb9 -> :sswitch_0
        0xbd -> :sswitch_0
        0xbe -> :sswitch_0
    .end sparse-switch
.end method

.method protected a([Landroid_src/mms/e/e;I)V
    .locals 3

    .prologue
    .line 623
    if-nez p1, :cond_0

    .line 624
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 627
    :cond_0
    sparse-switch p2, :sswitch_data_0

    .line 634
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Invalid header field!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 637
    :sswitch_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 638
    const/4 v0, 0x0

    :goto_0
    array-length v2, p1

    if-ge v0, v2, :cond_1

    .line 639
    aget-object v2, p1, v0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 638
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 641
    :cond_1
    iget-object v0, p0, Landroid_src/mms/e/q;->a:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 642
    return-void

    .line 627
    :sswitch_data_0
    .sparse-switch
        0x81 -> :sswitch_0
        0x82 -> :sswitch_0
        0x97 -> :sswitch_0
    .end sparse-switch
.end method

.method protected b(Landroid_src/mms/e/e;I)V
    .locals 3

    .prologue
    .line 653
    if-nez p1, :cond_0

    .line 654
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 657
    :cond_0
    sparse-switch p2, :sswitch_data_0

    .line 663
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Invalid header field!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 666
    :sswitch_0
    iget-object v0, p0, Landroid_src/mms/e/q;->a:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 668
    if-nez v0, :cond_1

    .line 669
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 671
    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 672
    iget-object v1, p0, Landroid_src/mms/e/q;->a:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 673
    return-void

    .line 657
    nop

    :sswitch_data_0
    .sparse-switch
        0x81 -> :sswitch_0
        0x82 -> :sswitch_0
        0x97 -> :sswitch_0
    .end sparse-switch
.end method

.method protected b(I)[B
    .locals 2

    .prologue
    .line 503
    iget-object v0, p0, Landroid_src/mms/e/q;->a:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    check-cast v0, [B

    return-object v0
.end method

.method protected c(I)Landroid_src/mms/e/e;
    .locals 2

    .prologue
    .line 552
    iget-object v0, p0, Landroid_src/mms/e/q;->a:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid_src/mms/e/e;

    return-object v0
.end method

.method protected d(I)[Landroid_src/mms/e/e;
    .locals 2

    .prologue
    .line 563
    iget-object v0, p0, Landroid_src/mms/e/q;->a:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 565
    if-nez v0, :cond_0

    .line 566
    const/4 v0, 0x0

    .line 569
    :goto_0
    return-object v0

    .line 568
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Landroid_src/mms/e/e;

    .line 569
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid_src/mms/e/e;

    goto :goto_0
.end method

.method protected e(I)J
    .locals 2

    .prologue
    .line 684
    iget-object v0, p0, Landroid_src/mms/e/q;->a:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    .line 685
    if-nez v0, :cond_0

    .line 686
    const-wide/16 v0, -0x1

    .line 689
    :goto_0
    return-wide v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_0
.end method
