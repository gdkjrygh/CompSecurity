.class Lcom/nineoldandroids/a/o$a;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nineoldandroids/a/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 570
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/nineoldandroids/a/o$a;)V
    .locals 0

    .prologue
    .line 570
    invoke-direct {p0}, Lcom/nineoldandroids/a/o$a;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 12

    .prologue
    .line 585
    const/4 v3, 0x1

    .line 586
    invoke-static {}, Lcom/nineoldandroids/a/o;->q()Ljava/lang/ThreadLocal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 587
    invoke-static {}, Lcom/nineoldandroids/a/o;->r()Ljava/lang/ThreadLocal;

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
    invoke-static {}, Lcom/nineoldandroids/a/o;->s()Ljava/lang/ThreadLocal;

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

    if-gtz v3, :cond_6

    .line 620
    :goto_2
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v8

    .line 621
    invoke-static {}, Lcom/nineoldandroids/a/o;->t()Ljava/lang/ThreadLocal;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    .line 622
    invoke-static {}, Lcom/nineoldandroids/a/o;->u()Ljava/lang/ThreadLocal;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    .line 626
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v7

    .line 627
    const/4 v4, 0x0

    move v6, v4

    :goto_3
    if-lt v6, v7, :cond_8

    .line 633
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v7

    .line 634
    if-lez v7, :cond_3

    .line 635
    const/4 v4, 0x0

    move v6, v4

    :goto_4
    if-lt v6, v7, :cond_a

    .line 641
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 646
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 647
    const/4 v2, 0x0

    move v6, v4

    move v4, v2

    .line 648
    :goto_5
    if-lt v4, v6, :cond_b

    .line 667
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_4

    .line 668
    const/4 v2, 0x0

    move v4, v2

    :goto_6
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lt v4, v2, :cond_e

    .line 671
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 676
    :cond_4
    if-eqz v5, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 677
    :cond_5
    const/4 v0, 0x1

    const-wide/16 v2, 0x0

    invoke-static {}, Lcom/nineoldandroids/a/o;->v()J

    move-result-wide v4

    .line 678
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v6

    sub-long/2addr v6, v8

    sub-long/2addr v4, v6

    .line 677
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    invoke-virtual {p0, v0, v2, v3}, Lcom/nineoldandroids/a/o$a;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_0

    .line 603
    :cond_6
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

    :goto_7
    if-ge v6, v7, :cond_2

    .line 607
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/nineoldandroids/a/o;

    .line 609
    invoke-static {v4}, Lcom/nineoldandroids/a/o;->a(Lcom/nineoldandroids/a/o;)J

    move-result-wide v8

    const-wide/16 v10, 0x0

    cmp-long v8, v8, v10

    if-nez v8, :cond_7

    .line 610
    invoke-static {v4}, Lcom/nineoldandroids/a/o;->b(Lcom/nineoldandroids/a/o;)V

    .line 606
    :goto_8
    add-int/lit8 v4, v6, 0x1

    move v6, v4

    goto :goto_7

    .line 612
    :cond_7
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 628
    :cond_8
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/nineoldandroids/a/o;

    .line 629
    invoke-static {v4, v8, v9}, Lcom/nineoldandroids/a/o;->a(Lcom/nineoldandroids/a/o;J)Z

    move-result v10

    if-eqz v10, :cond_9

    .line 630
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 627
    :cond_9
    add-int/lit8 v4, v6, 0x1

    move v6, v4

    goto/16 :goto_3

    .line 636
    :cond_a
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/nineoldandroids/a/o;

    .line 637
    invoke-static {v4}, Lcom/nineoldandroids/a/o;->b(Lcom/nineoldandroids/a/o;)V

    .line 638
    const/4 v10, 0x1

    invoke-static {v4, v10}, Lcom/nineoldandroids/a/o;->a(Lcom/nineoldandroids/a/o;Z)V

    .line 639
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 635
    add-int/lit8 v4, v6, 0x1

    move v6, v4

    goto/16 :goto_4

    .line 649
    :cond_b
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/nineoldandroids/a/o;

    .line 650
    invoke-virtual {v2, v8, v9}, Lcom/nineoldandroids/a/o;->f(J)Z

    move-result v7

    if-eqz v7, :cond_c

    .line 651
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 653
    :cond_c
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ne v7, v6, :cond_d

    .line 654
    add-int/lit8 v2, v4, 0x1

    move v4, v2

    .line 655
    goto/16 :goto_5

    .line 663
    :cond_d
    add-int/lit8 v6, v6, -0x1

    .line 664
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto/16 :goto_5

    .line 669
    :cond_e
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/nineoldandroids/a/o;

    invoke-static {v2}, Lcom/nineoldandroids/a/o;->c(Lcom/nineoldandroids/a/o;)V

    .line 668
    add-int/lit8 v2, v4, 0x1

    move v4, v2

    goto/16 :goto_6

    :cond_f
    move v5, v3

    goto/16 :goto_1

    :pswitch_1
    move v5, v3

    goto/16 :goto_2

    .line 588
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
