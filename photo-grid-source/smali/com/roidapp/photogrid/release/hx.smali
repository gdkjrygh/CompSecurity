.class public final Lcom/roidapp/photogrid/release/hx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/app/AlertDialog;

.field public b:Z

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/hx;->b:Z

    .line 30
    iput-object p1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    .line 31
    return-void
.end method

.method public static a(II)I
    .locals 2

    .prologue
    .line 461
    packed-switch p1, :pswitch_data_0

    .line 475
    const v0, 0x11cc40

    :goto_0
    return v0

    .line 463
    :pswitch_0
    mul-int v0, p0, p0

    goto :goto_0

    .line 465
    :pswitch_1
    int-to-float v0, p0

    const v1, 0x3faaaaab

    mul-float/2addr v0, v1

    int-to-float v1, p0

    mul-float/2addr v0, v1

    float-to-int v0, v0

    goto :goto_0

    .line 467
    :pswitch_2
    int-to-float v0, p0

    const v1, 0x3fb33333    # 1.4f

    mul-float/2addr v0, v1

    int-to-float v1, p0

    mul-float/2addr v0, v1

    float-to-int v0, v0

    goto :goto_0

    .line 469
    :pswitch_3
    int-to-float v0, p0

    const/high16 v1, 0x3fc00000    # 1.5f

    mul-float/2addr v0, v1

    int-to-float v1, p0

    mul-float/2addr v0, v1

    float-to-int v0, v0

    goto :goto_0

    .line 471
    :pswitch_4
    int-to-float v0, p0

    const v1, 0x3fd55555

    mul-float/2addr v0, v1

    int-to-float v1, p0

    mul-float/2addr v0, v1

    float-to-int v0, v0

    goto :goto_0

    .line 473
    :pswitch_5
    int-to-float v0, p0

    const v1, 0x3fe38e39

    mul-float/2addr v0, v1

    int-to-float v1, p0

    mul-float/2addr v0, v1

    float-to-int v0, v0

    goto :goto_0

    .line 461
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method private a(I)V
    .locals 4

    .prologue
    const v3, -0xfe55af

    const/4 v2, -0x1

    const v1, -0x27bedd

    .line 481
    sparse-switch p1, :sswitch_data_0

    .line 517
    :goto_0
    return-void

    .line 483
    :sswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 485
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 486
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 487
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 491
    :sswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 493
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 495
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 496
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 500
    :sswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 501
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 503
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 505
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 509
    :sswitch_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 510
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 511
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 513
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 481
    nop

    :sswitch_data_0
    .sparse-switch
        0x438 -> :sswitch_0
        0x67c -> :sswitch_1
        0x780 -> :sswitch_2
        0x800 -> :sswitch_3
    .end sparse-switch
.end method

.method private static b(Landroid/content/Context;IIZ)Z
    .locals 1

    .prologue
    .line 366
    const/4 v0, 0x0

    .line 367
    sparse-switch p1, :sswitch_data_0

    .line 457
    :goto_0
    return v0

    .line 369
    :sswitch_0
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 371
    :pswitch_0
    if-eqz p3, :cond_0

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->aB(Landroid/content/Context;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->F(Landroid/content/Context;)Z

    move-result v0

    goto :goto_0

    .line 374
    :pswitch_1
    if-eqz p3, :cond_1

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->ad(Landroid/content/Context;)Z

    move-result v0

    goto :goto_0

    :cond_1
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->h(Landroid/content/Context;)Z

    move-result v0

    goto :goto_0

    .line 377
    :pswitch_2
    if-eqz p3, :cond_2

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->al(Landroid/content/Context;)Z

    move-result v0

    goto :goto_0

    :cond_2
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->p(Landroid/content/Context;)Z

    move-result v0

    goto :goto_0

    .line 380
    :pswitch_3
    if-eqz p3, :cond_3

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->at(Landroid/content/Context;)Z

    move-result v0

    goto :goto_0

    :cond_3
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->x(Landroid/content/Context;)Z

    move-result v0

    goto :goto_0

    .line 383
    :pswitch_4
    if-eqz p3, :cond_4

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->aJ(Landroid/content/Context;)Z

    move-result v0

    goto :goto_0

    :cond_4
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->N(Landroid/content/Context;)Z

    move-result v0

    goto :goto_0

    .line 386
    :pswitch_5
    if-eqz p3, :cond_5

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->aR(Landroid/content/Context;)Z

    move-result v0

    goto :goto_0

    :cond_5
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->V(Landroid/content/Context;)Z

    move-result v0

    goto :goto_0

    .line 391
    :sswitch_1
    packed-switch p2, :pswitch_data_1

    goto :goto_0

    .line 393
    :pswitch_6
    if-eqz p3, :cond_6

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->aD(Landroid/content/Context;)Z

    move-result v0

    goto :goto_0

    :cond_6
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->H(Landroid/content/Context;)Z

    move-result v0

    goto :goto_0

    .line 396
    :pswitch_7
    if-eqz p3, :cond_7

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->af(Landroid/content/Context;)Z

    move-result v0

    goto :goto_0

    :cond_7
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->j(Landroid/content/Context;)Z

    move-result v0

    goto :goto_0

    .line 399
    :pswitch_8
    if-eqz p3, :cond_8

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->an(Landroid/content/Context;)Z

    move-result v0

    goto :goto_0

    :cond_8
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->r(Landroid/content/Context;)Z

    move-result v0

    goto :goto_0

    .line 402
    :pswitch_9
    if-eqz p3, :cond_9

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->av(Landroid/content/Context;)Z

    move-result v0

    goto :goto_0

    :cond_9
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->z(Landroid/content/Context;)Z

    move-result v0

    goto :goto_0

    .line 405
    :pswitch_a
    if-eqz p3, :cond_a

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->aL(Landroid/content/Context;)Z

    move-result v0

    goto/16 :goto_0

    :cond_a
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->P(Landroid/content/Context;)Z

    move-result v0

    goto/16 :goto_0

    .line 408
    :pswitch_b
    if-eqz p3, :cond_b

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->aT(Landroid/content/Context;)Z

    move-result v0

    goto/16 :goto_0

    :cond_b
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->X(Landroid/content/Context;)Z

    move-result v0

    goto/16 :goto_0

    .line 413
    :sswitch_2
    packed-switch p2, :pswitch_data_2

    goto/16 :goto_0

    .line 415
    :pswitch_c
    if-eqz p3, :cond_c

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->aF(Landroid/content/Context;)Z

    move-result v0

    goto/16 :goto_0

    :cond_c
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->J(Landroid/content/Context;)Z

    move-result v0

    goto/16 :goto_0

    .line 418
    :pswitch_d
    if-eqz p3, :cond_d

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->ah(Landroid/content/Context;)Z

    move-result v0

    goto/16 :goto_0

    :cond_d
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->l(Landroid/content/Context;)Z

    move-result v0

    goto/16 :goto_0

    .line 421
    :pswitch_e
    if-eqz p3, :cond_e

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->ap(Landroid/content/Context;)Z

    move-result v0

    goto/16 :goto_0

    :cond_e
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->t(Landroid/content/Context;)Z

    move-result v0

    goto/16 :goto_0

    .line 424
    :pswitch_f
    if-eqz p3, :cond_f

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->ax(Landroid/content/Context;)Z

    move-result v0

    goto/16 :goto_0

    :cond_f
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->B(Landroid/content/Context;)Z

    move-result v0

    goto/16 :goto_0

    .line 427
    :pswitch_10
    if-eqz p3, :cond_10

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->aN(Landroid/content/Context;)Z

    move-result v0

    goto/16 :goto_0

    :cond_10
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->R(Landroid/content/Context;)Z

    move-result v0

    goto/16 :goto_0

    .line 430
    :pswitch_11
    if-eqz p3, :cond_11

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->aV(Landroid/content/Context;)Z

    move-result v0

    goto/16 :goto_0

    :cond_11
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->Z(Landroid/content/Context;)Z

    move-result v0

    goto/16 :goto_0

    .line 435
    :sswitch_3
    packed-switch p2, :pswitch_data_3

    goto/16 :goto_0

    .line 437
    :pswitch_12
    if-eqz p3, :cond_12

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->aH(Landroid/content/Context;)Z

    move-result v0

    goto/16 :goto_0

    :cond_12
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->L(Landroid/content/Context;)Z

    move-result v0

    goto/16 :goto_0

    .line 440
    :pswitch_13
    if-eqz p3, :cond_13

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->aj(Landroid/content/Context;)Z

    move-result v0

    goto/16 :goto_0

    :cond_13
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->n(Landroid/content/Context;)Z

    move-result v0

    goto/16 :goto_0

    .line 443
    :pswitch_14
    if-eqz p3, :cond_14

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->ar(Landroid/content/Context;)Z

    move-result v0

    goto/16 :goto_0

    :cond_14
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->v(Landroid/content/Context;)Z

    move-result v0

    goto/16 :goto_0

    .line 446
    :pswitch_15
    if-eqz p3, :cond_15

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->az(Landroid/content/Context;)Z

    move-result v0

    goto/16 :goto_0

    :cond_15
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->D(Landroid/content/Context;)Z

    move-result v0

    goto/16 :goto_0

    .line 449
    :pswitch_16
    if-eqz p3, :cond_16

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->aP(Landroid/content/Context;)Z

    move-result v0

    goto/16 :goto_0

    :cond_16
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->T(Landroid/content/Context;)Z

    move-result v0

    goto/16 :goto_0

    .line 452
    :pswitch_17
    if-eqz p3, :cond_17

    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->aX(Landroid/content/Context;)Z

    move-result v0

    goto/16 :goto_0

    :cond_17
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->ab(Landroid/content/Context;)Z

    move-result v0

    goto/16 :goto_0

    .line 367
    nop

    :sswitch_data_0
    .sparse-switch
        0x438 -> :sswitch_0
        0x67c -> :sswitch_1
        0x780 -> :sswitch_2
        0x800 -> :sswitch_3
    .end sparse-switch

    .line 369
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch

    .line 391
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
    .end packed-switch

    .line 413
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
    .end packed-switch

    .line 435
    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_12
        :pswitch_13
        :pswitch_14
        :pswitch_15
        :pswitch_16
        :pswitch_17
    .end packed-switch
.end method


# virtual methods
.method public final a(Landroid/content/Context;IIZ)I
    .locals 7

    .prologue
    const/16 v5, 0x800

    const/16 v2, 0x780

    const/16 v3, 0x67c

    const/16 v4, 0x438

    const/4 v1, 0x0

    .line 521
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v6, 0x1

    if-ne v0, v6, :cond_0

    .line 522
    const/4 v0, 0x1

    .line 526
    :goto_0
    if-eqz p4, :cond_c

    .line 527
    if-ne p2, v5, :cond_3

    .line 528
    invoke-static {p1, v5, p3, v0}, Lcom/roidapp/photogrid/release/hx;->b(Landroid/content/Context;IIZ)Z

    move-result v3

    if-eqz v3, :cond_1

    move v0, v1

    .line 584
    :goto_1
    return v0

    :cond_0
    move v0, v1

    .line 524
    goto :goto_0

    .line 531
    :cond_1
    invoke-static {p1, v2, p3, v0}, Lcom/roidapp/photogrid/release/hx;->b(Landroid/content/Context;IIZ)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    .line 532
    goto :goto_1

    .line 534
    :cond_2
    invoke-direct {p0, v2}, Lcom/roidapp/photogrid/release/hx;->a(I)V

    move v0, v2

    .line 535
    goto :goto_1

    .line 538
    :cond_3
    if-ne p2, v2, :cond_6

    .line 539
    invoke-static {p1, v2, p3, v0}, Lcom/roidapp/photogrid/release/hx;->b(Landroid/content/Context;IIZ)Z

    move-result v2

    if-eqz v2, :cond_4

    move v0, v1

    .line 540
    goto :goto_1

    .line 542
    :cond_4
    invoke-static {p1, v3, p3, v0}, Lcom/roidapp/photogrid/release/hx;->b(Landroid/content/Context;IIZ)Z

    move-result v0

    if-eqz v0, :cond_5

    move v0, v1

    .line 543
    goto :goto_1

    .line 545
    :cond_5
    invoke-direct {p0, v3}, Lcom/roidapp/photogrid/release/hx;->a(I)V

    move v0, v3

    .line 546
    goto :goto_1

    .line 549
    :cond_6
    if-ne p2, v3, :cond_9

    .line 550
    invoke-static {p1, v3, p3, v0}, Lcom/roidapp/photogrid/release/hx;->b(Landroid/content/Context;IIZ)Z

    move-result v2

    if-eqz v2, :cond_7

    move v0, v1

    .line 551
    goto :goto_1

    .line 553
    :cond_7
    invoke-static {p1, v4, p3, v0}, Lcom/roidapp/photogrid/release/hx;->b(Landroid/content/Context;IIZ)Z

    move-result v0

    if-eqz v0, :cond_8

    move v0, v1

    .line 554
    goto :goto_1

    .line 556
    :cond_8
    invoke-direct {p0, v4}, Lcom/roidapp/photogrid/release/hx;->a(I)V

    move v0, v4

    .line 557
    goto :goto_1

    .line 560
    :cond_9
    if-ne p2, v4, :cond_b

    .line 561
    invoke-static {p1, v4, p3, v0}, Lcom/roidapp/photogrid/release/hx;->b(Landroid/content/Context;IIZ)Z

    move-result v0

    if-nez v0, :cond_a

    .line 562
    invoke-direct {p0, v4}, Lcom/roidapp/photogrid/release/hx;->a(I)V

    :cond_a
    move v0, v1

    .line 564
    goto :goto_1

    :cond_b
    move v0, v1

    .line 566
    goto :goto_1

    .line 569
    :cond_c
    if-eqz v0, :cond_d

    invoke-static {p1}, Lcom/roidapp/photogrid/release/hw;->bb(Landroid/content/Context;)I

    move-result v0

    .line 571
    :goto_2
    invoke-static {v5, p3}, Lcom/roidapp/photogrid/release/hx;->a(II)I

    move-result v6

    if-lt v6, v0, :cond_e

    .line 572
    invoke-direct {p0, v5}, Lcom/roidapp/photogrid/release/hx;->a(I)V

    move v0, v5

    .line 573
    goto :goto_1

    .line 569
    :cond_d
    invoke-static {p1}, Lcom/roidapp/photogrid/release/hw;->aZ(Landroid/content/Context;)I

    move-result v0

    goto :goto_2

    .line 574
    :cond_e
    invoke-static {v2, p3}, Lcom/roidapp/photogrid/release/hx;->a(II)I

    move-result v5

    if-lt v5, v0, :cond_f

    .line 575
    invoke-direct {p0, v2}, Lcom/roidapp/photogrid/release/hx;->a(I)V

    move v0, v2

    .line 576
    goto :goto_1

    .line 577
    :cond_f
    invoke-static {v3, p3}, Lcom/roidapp/photogrid/release/hx;->a(II)I

    move-result v2

    if-lt v2, v0, :cond_10

    .line 578
    invoke-direct {p0, v3}, Lcom/roidapp/photogrid/release/hx;->a(I)V

    move v0, v3

    .line 579
    goto :goto_1

    .line 580
    :cond_10
    invoke-static {v4, p3}, Lcom/roidapp/photogrid/release/hx;->a(II)I

    move-result v2

    if-lt v2, v0, :cond_11

    .line 581
    invoke-direct {p0, v4}, Lcom/roidapp/photogrid/release/hx;->a(I)V

    move v0, v4

    .line 582
    goto/16 :goto_1

    :cond_11
    move v0, v1

    .line 584
    goto/16 :goto_1
.end method

.method public final a()V
    .locals 6

    .prologue
    const v5, 0x71c71c

    const/4 v4, 0x0

    .line 35
    new-instance v1, Landroid/app/AlertDialog$Builder;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-direct {v1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 36
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 37
    const v2, 0x7f03011f

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 38
    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 39
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 40
    invoke-virtual {v1, v4}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 41
    const v2, 0x7f0d026a

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 42
    new-instance v2, Lcom/roidapp/photogrid/release/hy;

    invoke-direct {v2, p0, v0}, Lcom/roidapp/photogrid/release/hy;-><init>(Lcom/roidapp/photogrid/release/hx;Landroid/widget/Button;)V

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 51
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/photogrid/release/hx;->a:Landroid/app/AlertDialog;

    .line 52
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->a:Landroid/app/AlertDialog;

    invoke-virtual {v1, v4}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 53
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->a:Landroid/app/AlertDialog;

    new-instance v2, Lcom/roidapp/photogrid/release/hz;

    invoke-direct {v2, p0, v0}, Lcom/roidapp/photogrid/release/hz;-><init>(Lcom/roidapp/photogrid/release/hx;Landroid/widget/Button;)V

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 66
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->a:Landroid/app/AlertDialog;

    const v1, 0x7f0d049e

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/hx;->d:Landroid/widget/TextView;

    .line 67
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->a:Landroid/app/AlertDialog;

    const v1, 0x7f0d049f

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/hx;->c:Landroid/widget/TextView;

    .line 69
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->a:Landroid/app/AlertDialog;

    const v1, 0x7f0d049c

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/hx;->e:Landroid/widget/TextView;

    .line 70
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->a:Landroid/app/AlertDialog;

    const v1, 0x7f0d049b

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/hx;->f:Landroid/widget/TextView;

    .line 71
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->a:Landroid/app/AlertDialog;

    const v1, 0x7f0d049a

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/hx;->g:Landroid/widget/TextView;

    .line 72
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->a:Landroid/app/AlertDialog;

    const v1, 0x7f0d0499

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/hx;->h:Landroid/widget/TextView;

    .line 74
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 76
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v0, v5}, Lcom/roidapp/photogrid/release/hw;->c(Landroid/content/Context;I)V

    .line 80
    :goto_0
    return-void

    .line 78
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v0, v5}, Lcom/roidapp/photogrid/release/hw;->e(Landroid/content/Context;I)V

    goto :goto_0
.end method

.method public final a(III)V
    .locals 2

    .prologue
    const v1, -0xfe55af

    .line 98
    .line 1124
    sparse-switch p2, :sswitch_data_0

    .line 99
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "P  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "% "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 100
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->c:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 101
    packed-switch p3, :pswitch_data_0

    .line 121
    :goto_1
    return-void

    .line 1126
    :sswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 1129
    :sswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 1132
    :sswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 1135
    :sswitch_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 103
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->d:Landroid/widget/TextView;

    const-string v1, " 1:1 "

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 106
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->d:Landroid/widget/TextView;

    const-string v1, " 3:4 "

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 109
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->d:Landroid/widget/TextView;

    const-string v1, " 5:7 "

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 112
    :pswitch_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->d:Landroid/widget/TextView;

    const-string v1, " 2:3 "

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 115
    :pswitch_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->d:Landroid/widget/TextView;

    const-string v1, " 3:5 "

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 118
    :pswitch_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->d:Landroid/widget/TextView;

    const-string v1, "9:16 "

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 1124
    :sswitch_data_0
    .sparse-switch
        0x438 -> :sswitch_0
        0x67c -> :sswitch_1
        0x780 -> :sswitch_2
        0x800 -> :sswitch_3
    .end sparse-switch

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public final a(Landroid/content/Context;II)V
    .locals 8

    .prologue
    const/16 v7, 0x800

    const/16 v6, 0x780

    const/16 v5, 0x67c

    const/16 v4, 0x438

    const/4 v3, 0x1

    .line 147
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v3, :cond_19

    move v2, v3

    .line 153
    :goto_0
    if-eqz v2, :cond_1a

    invoke-static {p1}, Lcom/roidapp/photogrid/release/hw;->bb(Landroid/content/Context;)I

    move-result v0

    .line 154
    :goto_1
    invoke-static {p2, p3}, Lcom/roidapp/photogrid/release/hx;->a(II)I

    move-result v1

    .line 155
    if-le v1, v0, :cond_0

    .line 157
    if-eqz v2, :cond_1b

    .line 158
    invoke-static {p1, v1}, Lcom/roidapp/photogrid/release/hw;->d(Landroid/content/Context;I)V

    move v0, v1

    .line 165
    :cond_0
    :goto_2
    const/4 v1, 0x5

    invoke-static {v7, v1}, Lcom/roidapp/photogrid/release/hx;->a(II)I

    move-result v1

    if-lt v0, v1, :cond_1

    .line 166
    if-eqz v2, :cond_1c

    .line 167
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->aY(Landroid/content/Context;)V

    .line 172
    :cond_1
    :goto_3
    const/4 v1, 0x4

    invoke-static {v7, v1}, Lcom/roidapp/photogrid/release/hx;->a(II)I

    move-result v1

    if-lt v0, v1, :cond_2

    .line 173
    if-eqz v2, :cond_1d

    .line 174
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->aQ(Landroid/content/Context;)V

    .line 179
    :cond_2
    :goto_4
    const/4 v1, 0x3

    invoke-static {v7, v1}, Lcom/roidapp/photogrid/release/hx;->a(II)I

    move-result v1

    if-lt v0, v1, :cond_3

    .line 180
    if-eqz v2, :cond_1e

    .line 181
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->aA(Landroid/content/Context;)V

    .line 186
    :cond_3
    :goto_5
    const/4 v1, 0x2

    invoke-static {v7, v1}, Lcom/roidapp/photogrid/release/hx;->a(II)I

    move-result v1

    if-lt v0, v1, :cond_4

    .line 187
    if-eqz v2, :cond_1f

    .line 188
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->as(Landroid/content/Context;)V

    .line 193
    :cond_4
    :goto_6
    invoke-static {v7, v3}, Lcom/roidapp/photogrid/release/hx;->a(II)I

    move-result v1

    if-lt v0, v1, :cond_5

    .line 194
    if-eqz v2, :cond_20

    .line 195
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->ak(Landroid/content/Context;)V

    .line 200
    :cond_5
    :goto_7
    const/4 v1, 0x0

    invoke-static {v7, v1}, Lcom/roidapp/photogrid/release/hx;->a(II)I

    move-result v1

    if-lt v0, v1, :cond_6

    .line 201
    if-eqz v2, :cond_21

    .line 202
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->aI(Landroid/content/Context;)V

    .line 209
    :cond_6
    :goto_8
    const/4 v1, 0x5

    invoke-static {v6, v1}, Lcom/roidapp/photogrid/release/hx;->a(II)I

    move-result v1

    if-lt v0, v1, :cond_7

    .line 210
    if-eqz v2, :cond_22

    .line 211
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->aW(Landroid/content/Context;)V

    .line 216
    :cond_7
    :goto_9
    const/4 v1, 0x4

    invoke-static {v6, v1}, Lcom/roidapp/photogrid/release/hx;->a(II)I

    move-result v1

    if-lt v0, v1, :cond_8

    .line 217
    if-eqz v2, :cond_23

    .line 218
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->aO(Landroid/content/Context;)V

    .line 223
    :cond_8
    :goto_a
    const/4 v1, 0x3

    invoke-static {v6, v1}, Lcom/roidapp/photogrid/release/hx;->a(II)I

    move-result v1

    if-lt v0, v1, :cond_9

    .line 224
    if-eqz v2, :cond_24

    .line 225
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->ay(Landroid/content/Context;)V

    .line 230
    :cond_9
    :goto_b
    const/4 v1, 0x2

    invoke-static {v6, v1}, Lcom/roidapp/photogrid/release/hx;->a(II)I

    move-result v1

    if-lt v0, v1, :cond_a

    .line 231
    if-eqz v2, :cond_25

    .line 232
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->aq(Landroid/content/Context;)V

    .line 237
    :cond_a
    :goto_c
    invoke-static {v6, v3}, Lcom/roidapp/photogrid/release/hx;->a(II)I

    move-result v1

    if-lt v0, v1, :cond_b

    .line 238
    if-eqz v2, :cond_26

    .line 239
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->ai(Landroid/content/Context;)V

    .line 244
    :cond_b
    :goto_d
    const/4 v1, 0x0

    invoke-static {v6, v1}, Lcom/roidapp/photogrid/release/hx;->a(II)I

    move-result v1

    if-lt v0, v1, :cond_c

    .line 245
    if-eqz v2, :cond_27

    .line 246
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->aG(Landroid/content/Context;)V

    .line 252
    :cond_c
    :goto_e
    const/4 v1, 0x5

    invoke-static {v5, v1}, Lcom/roidapp/photogrid/release/hx;->a(II)I

    move-result v1

    if-lt v0, v1, :cond_d

    .line 253
    if-eqz v2, :cond_28

    .line 254
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->aU(Landroid/content/Context;)V

    .line 259
    :cond_d
    :goto_f
    const/4 v1, 0x4

    invoke-static {v5, v1}, Lcom/roidapp/photogrid/release/hx;->a(II)I

    move-result v1

    if-lt v0, v1, :cond_e

    .line 260
    if-eqz v2, :cond_29

    .line 261
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->aM(Landroid/content/Context;)V

    .line 266
    :cond_e
    :goto_10
    const/4 v1, 0x3

    invoke-static {v5, v1}, Lcom/roidapp/photogrid/release/hx;->a(II)I

    move-result v1

    if-lt v0, v1, :cond_f

    .line 267
    if-eqz v2, :cond_2a

    .line 268
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->aw(Landroid/content/Context;)V

    .line 273
    :cond_f
    :goto_11
    const/4 v1, 0x2

    invoke-static {v5, v1}, Lcom/roidapp/photogrid/release/hx;->a(II)I

    move-result v1

    if-lt v0, v1, :cond_10

    .line 274
    if-eqz v2, :cond_2b

    .line 275
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->ao(Landroid/content/Context;)V

    .line 280
    :cond_10
    :goto_12
    invoke-static {v5, v3}, Lcom/roidapp/photogrid/release/hx;->a(II)I

    move-result v1

    if-lt v0, v1, :cond_11

    .line 281
    if-eqz v2, :cond_2c

    .line 282
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->ag(Landroid/content/Context;)V

    .line 287
    :cond_11
    :goto_13
    const/4 v1, 0x0

    invoke-static {v5, v1}, Lcom/roidapp/photogrid/release/hx;->a(II)I

    move-result v1

    if-lt v0, v1, :cond_12

    .line 288
    if-eqz v2, :cond_2d

    .line 289
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->aE(Landroid/content/Context;)V

    .line 295
    :cond_12
    :goto_14
    const/4 v1, 0x5

    invoke-static {v4, v1}, Lcom/roidapp/photogrid/release/hx;->a(II)I

    move-result v1

    if-lt v0, v1, :cond_13

    .line 296
    if-eqz v2, :cond_2e

    .line 297
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->aS(Landroid/content/Context;)V

    .line 302
    :cond_13
    :goto_15
    const/4 v1, 0x4

    invoke-static {v4, v1}, Lcom/roidapp/photogrid/release/hx;->a(II)I

    move-result v1

    if-lt v0, v1, :cond_14

    .line 303
    if-eqz v2, :cond_2f

    .line 304
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->aK(Landroid/content/Context;)V

    .line 309
    :cond_14
    :goto_16
    const/4 v1, 0x3

    invoke-static {v4, v1}, Lcom/roidapp/photogrid/release/hx;->a(II)I

    move-result v1

    if-lt v0, v1, :cond_15

    .line 310
    if-eqz v2, :cond_30

    .line 311
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->au(Landroid/content/Context;)V

    .line 316
    :cond_15
    :goto_17
    const/4 v1, 0x2

    invoke-static {v4, v1}, Lcom/roidapp/photogrid/release/hx;->a(II)I

    move-result v1

    if-lt v0, v1, :cond_16

    .line 317
    if-eqz v2, :cond_31

    .line 318
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->am(Landroid/content/Context;)V

    .line 323
    :cond_16
    :goto_18
    invoke-static {v4, v3}, Lcom/roidapp/photogrid/release/hx;->a(II)I

    move-result v1

    if-lt v0, v1, :cond_17

    .line 324
    if-eqz v2, :cond_32

    .line 325
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->ae(Landroid/content/Context;)V

    .line 330
    :cond_17
    :goto_19
    const/4 v1, 0x0

    invoke-static {v4, v1}, Lcom/roidapp/photogrid/release/hx;->a(II)I

    move-result v1

    if-lt v0, v1, :cond_18

    .line 331
    if-eqz v2, :cond_33

    .line 332
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hw;->aC(Landroid/content/Context;)V

    .line 338
    :cond_18
    :goto_1a
    return-void

    .line 150
    :cond_19
    const/4 v0, 0x0

    move v2, v0

    goto/16 :goto_0

    .line 153
    :cond_1a
    invoke-static {p1}, Lcom/roidapp/photogrid/release/hw;->aZ(Landroid/content/Context;)I

    move-result v0

    goto/16 :goto_1

    .line 160
    :cond_1b
    invoke-static {p1, v1}, Lcom/roidapp/photogrid/release/hw;->b(Landroid/content/Context;I)V

    move v0, v1

    goto/16 :goto_2

    .line 169
    :cond_1c
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->ac(Landroid/content/Context;)V

    goto/16 :goto_3

    .line 176
    :cond_1d
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->U(Landroid/content/Context;)V

    goto/16 :goto_4

    .line 183
    :cond_1e
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->E(Landroid/content/Context;)V

    goto/16 :goto_5

    .line 190
    :cond_1f
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->w(Landroid/content/Context;)V

    goto/16 :goto_6

    .line 197
    :cond_20
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->o(Landroid/content/Context;)V

    goto/16 :goto_7

    .line 204
    :cond_21
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->M(Landroid/content/Context;)V

    goto/16 :goto_8

    .line 213
    :cond_22
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->aa(Landroid/content/Context;)V

    goto/16 :goto_9

    .line 220
    :cond_23
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->S(Landroid/content/Context;)V

    goto/16 :goto_a

    .line 227
    :cond_24
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->C(Landroid/content/Context;)V

    goto/16 :goto_b

    .line 234
    :cond_25
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->u(Landroid/content/Context;)V

    goto/16 :goto_c

    .line 241
    :cond_26
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->m(Landroid/content/Context;)V

    goto/16 :goto_d

    .line 248
    :cond_27
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->K(Landroid/content/Context;)V

    goto/16 :goto_e

    .line 256
    :cond_28
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->Y(Landroid/content/Context;)V

    goto/16 :goto_f

    .line 263
    :cond_29
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->Q(Landroid/content/Context;)V

    goto/16 :goto_10

    .line 270
    :cond_2a
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->A(Landroid/content/Context;)V

    goto/16 :goto_11

    .line 277
    :cond_2b
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->s(Landroid/content/Context;)V

    goto/16 :goto_12

    .line 284
    :cond_2c
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->k(Landroid/content/Context;)V

    goto/16 :goto_13

    .line 291
    :cond_2d
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->I(Landroid/content/Context;)V

    goto/16 :goto_14

    .line 299
    :cond_2e
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->W(Landroid/content/Context;)V

    goto/16 :goto_15

    .line 306
    :cond_2f
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->O(Landroid/content/Context;)V

    goto/16 :goto_16

    .line 313
    :cond_30
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->y(Landroid/content/Context;)V

    goto/16 :goto_17

    .line 320
    :cond_31
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->q(Landroid/content/Context;)V

    goto/16 :goto_18

    .line 327
    :cond_32
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->i(Landroid/content/Context;)V

    goto/16 :goto_19

    .line 334
    :cond_33
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hw;->G(Landroid/content/Context;)V

    goto/16 :goto_1a
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->i:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 87
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->a:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->a:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 88
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hx;->a:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 89
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/hx;->a:Landroid/app/AlertDialog;

    .line 92
    :cond_0
    return-void
.end method
