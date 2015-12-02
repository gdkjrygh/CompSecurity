.class Lcom/a/a/aq;
.super Landroid/os/Handler;
.source "ValueAnimator.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 570
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/a/a/al;)V
    .locals 0

    .prologue
    .line 570
    invoke-direct {p0}, Lcom/a/a/aq;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 12

    .prologue
    .line 585
    const/4 v3, 0x1

    .line 586
    invoke-static {}, Lcom/a/a/ak;->m()Ljava/lang/ThreadLocal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 587
    invoke-static {}, Lcom/a/a/ak;->n()Ljava/lang/ThreadLocal;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    .line 588
    iget v2, p1, Landroid/os/Message;->what:I

    packed-switch v2, :pswitch_data_0

    .line 682
    :cond_0
    :goto_0
    return-void

    .line 592
    :pswitch_0
    invoke-static {}, Lcom/a/a/ak;->o()Ljava/lang/ThreadLocal;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    .line 593
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-gtz v4, :cond_1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lez v4, :cond_f

    .line 594
    :cond_1
    const/4 v3, 0x0

    move v5, v3

    .line 601
    :cond_2
    :goto_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_4

    .line 602
    invoke-virtual {v2}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    .line 604
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 605
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v7

    .line 606
    const/4 v4, 0x0

    move v6, v4

    :goto_2
    if-ge v6, v7, :cond_2

    .line 607
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/a/a/ak;

    .line 609
    invoke-static {v4}, Lcom/a/a/ak;->a(Lcom/a/a/ak;)J

    move-result-wide v8

    const-wide/16 v10, 0x0

    cmp-long v8, v8, v10

    if-nez v8, :cond_3

    .line 610
    invoke-static {v4}, Lcom/a/a/ak;->b(Lcom/a/a/ak;)V

    .line 606
    :goto_3
    add-int/lit8 v4, v6, 0x1

    move v6, v4

    goto :goto_2

    .line 612
    :cond_3
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :pswitch_1
    move v5, v3

    .line 620
    :cond_4
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v7

    .line 621
    invoke-static {}, Lcom/a/a/ak;->p()Ljava/lang/ThreadLocal;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    .line 622
    invoke-static {}, Lcom/a/a/ak;->q()Ljava/lang/ThreadLocal;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    .line 626
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v9

    .line 627
    const/4 v4, 0x0

    move v6, v4

    :goto_4
    if-ge v6, v9, :cond_6

    .line 628
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/a/a/ak;

    .line 629
    invoke-static {v4, v7, v8}, Lcom/a/a/ak;->a(Lcom/a/a/ak;J)Z

    move-result v10

    if-eqz v10, :cond_5

    .line 630
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 627
    :cond_5
    add-int/lit8 v4, v6, 0x1

    move v6, v4

    goto :goto_4

    .line 633
    :cond_6
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v9

    .line 634
    if-lez v9, :cond_8

    .line 635
    const/4 v4, 0x0

    move v6, v4

    :goto_5
    if-ge v6, v9, :cond_7

    .line 636
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/a/a/ak;

    .line 637
    invoke-static {v4}, Lcom/a/a/ak;->b(Lcom/a/a/ak;)V

    .line 638
    const/4 v10, 0x1

    invoke-static {v4, v10}, Lcom/a/a/ak;->a(Lcom/a/a/ak;Z)Z

    .line 639
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 635
    add-int/lit8 v4, v6, 0x1

    move v6, v4

    goto :goto_5

    .line 641
    :cond_7
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 646
    :cond_8
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    .line 647
    const/4 v4, 0x0

    .line 648
    :goto_6
    if-ge v4, v6, :cond_b

    .line 649
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/a/a/ak;

    .line 650
    invoke-virtual {v2, v7, v8}, Lcom/a/a/ak;->e(J)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 651
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 653
    :cond_9
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ne v9, v6, :cond_a

    .line 654
    add-int/lit8 v2, v4, 0x1

    move v4, v6

    :goto_7
    move v6, v4

    move v4, v2

    .line 666
    goto :goto_6

    .line 663
    :cond_a
    add-int/lit8 v6, v6, -0x1

    .line 664
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move v2, v4

    move v4, v6

    goto :goto_7

    .line 667
    :cond_b
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_d

    .line 668
    const/4 v2, 0x0

    move v4, v2

    :goto_8
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v4, v2, :cond_c

    .line 669
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/a/a/ak;

    invoke-static {v2}, Lcom/a/a/ak;->c(Lcom/a/a/ak;)V

    .line 668
    add-int/lit8 v2, v4, 0x1

    move v4, v2

    goto :goto_8

    .line 671
    :cond_c
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 676
    :cond_d
    if-eqz v5, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 677
    :cond_e
    const/4 v0, 0x1

    const-wide/16 v1, 0x0

    invoke-static {}, Lcom/a/a/ak;->r()J

    move-result-wide v3

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v5

    sub-long/2addr v5, v7

    sub-long/2addr v3, v5

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    invoke-virtual {p0, v0, v1, v2}, Lcom/a/a/aq;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_0

    :cond_f
    move v5, v3

    goto/16 :goto_1

    .line 588
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
