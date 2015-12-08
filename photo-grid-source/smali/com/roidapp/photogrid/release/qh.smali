.class final Lcom/roidapp/photogrid/release/qh;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/Preference;


# direct methods
.method private constructor <init>(Lcom/roidapp/photogrid/release/Preference;)V
    .locals 0

    .prologue
    .line 457
    iput-object p1, p0, Lcom/roidapp/photogrid/release/qh;->a:Lcom/roidapp/photogrid/release/Preference;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/photogrid/release/Preference;B)V
    .locals 0

    .prologue
    .line 457
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/qh;-><init>(Lcom/roidapp/photogrid/release/Preference;)V

    return-void
.end method


# virtual methods
.method public final areAllItemsEnabled()Z
    .locals 1

    .prologue
    .line 466
    const/4 v0, 0x0

    return v0
.end method

.method public final getCount()I
    .locals 1

    .prologue
    .line 461
    const/16 v0, 0x15

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 490
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 494
    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 8

    .prologue
    const v7, 0x7f07021c

    const v6, 0x7f070149

    const v3, 0x7f070020

    const/16 v5, 0x8

    const/4 v4, 0x0

    .line 502
    if-nez p2, :cond_0

    .line 503
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qh;->a:Lcom/roidapp/photogrid/release/Preference;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f030102

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 505
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 506
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/qg;

    .line 519
    :goto_0
    invoke-virtual {p0, p1}, Lcom/roidapp/photogrid/release/qh;->isEnabled(I)Z

    move-result v1

    if-nez v1, :cond_2

    .line 520
    sparse-switch p1, :sswitch_data_0

    .line 718
    :goto_1
    return-object p2

    .line 508
    :cond_1
    new-instance v1, Lcom/roidapp/photogrid/release/qg;

    invoke-direct {v1}, Lcom/roidapp/photogrid/release/qg;-><init>()V

    .line 509
    const v0, 0x7f0d03fd

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v1, Lcom/roidapp/photogrid/release/qg;->b:Landroid/widget/LinearLayout;

    .line 510
    const v0, 0x7f0d03fe

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/roidapp/photogrid/release/qg;->c:Landroid/widget/TextView;

    .line 512
    const v0, 0x7f0d03ff

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v1, Lcom/roidapp/photogrid/release/qg;->a:Landroid/widget/LinearLayout;

    .line 513
    const v0, 0x7f0d0401

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/roidapp/photogrid/release/qg;->d:Landroid/widget/TextView;

    .line 514
    const v0, 0x7f0d0402

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/roidapp/photogrid/release/qg;->e:Landroid/widget/TextView;

    .line 515
    const v0, 0x7f0d0403

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, v1, Lcom/roidapp/photogrid/release/qg;->f:Landroid/widget/CheckBox;

    .line 516
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object v0, v1

    goto :goto_0

    .line 522
    :sswitch_0
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 523
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->c:Landroid/widget/TextView;

    const v2, 0x7f070215

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 524
    iget-object v0, v0, Lcom/roidapp/photogrid/release/qg;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_1

    .line 527
    :sswitch_1
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 528
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->c:Landroid/widget/TextView;

    const v2, 0x7f070227

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 529
    iget-object v0, v0, Lcom/roidapp/photogrid/release/qg;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_1

    .line 532
    :sswitch_2
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 533
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->c:Landroid/widget/TextView;

    const v2, 0x7f070228

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 534
    iget-object v0, v0, Lcom/roidapp/photogrid/release/qg;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto/16 :goto_1

    .line 537
    :sswitch_3
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 538
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->c:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(I)V

    .line 539
    iget-object v0, v0, Lcom/roidapp/photogrid/release/qg;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto/16 :goto_1

    .line 542
    :sswitch_4
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 543
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->c:Landroid/widget/TextView;

    const v2, 0x7f070216

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 544
    iget-object v0, v0, Lcom/roidapp/photogrid/release/qg;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto/16 :goto_1

    .line 554
    :cond_2
    packed-switch p1, :pswitch_data_0

    :pswitch_0
    goto/16 :goto_1

    .line 556
    :pswitch_1
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 557
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 558
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->d:Landroid/widget/TextView;

    const v2, 0x7f07021f

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 559
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 560
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->f:Landroid/widget/CheckBox;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/qh;->a:Lcom/roidapp/photogrid/release/Preference;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/Preference;->v(Lcom/roidapp/photogrid/release/Preference;)Z

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 561
    iget-object v0, v0, Lcom/roidapp/photogrid/release/qg;->f:Landroid/widget/CheckBox;

    invoke-virtual {v0, v4}, Landroid/widget/CheckBox;->setVisibility(I)V

    goto/16 :goto_1

    .line 572
    :pswitch_2
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 573
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 574
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->d:Landroid/widget/TextView;

    const v2, 0x7f070199

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 575
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 576
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->e:Landroid/widget/TextView;

    const v2, 0x7f07019a

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 577
    iget-object v0, v0, Lcom/roidapp/photogrid/release/qg;->f:Landroid/widget/CheckBox;

    invoke-virtual {v0, v5}, Landroid/widget/CheckBox;->setVisibility(I)V

    goto/16 :goto_1

    .line 580
    :pswitch_3
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 581
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 582
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->d:Landroid/widget/TextView;

    const v2, 0x7f070221

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 583
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 584
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->f:Landroid/widget/CheckBox;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/qh;->a:Lcom/roidapp/photogrid/release/Preference;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/Preference;->w(Lcom/roidapp/photogrid/release/Preference;)Z

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 585
    iget-object v0, v0, Lcom/roidapp/photogrid/release/qg;->f:Landroid/widget/CheckBox;

    invoke-virtual {v0, v4}, Landroid/widget/CheckBox;->setVisibility(I)V

    goto/16 :goto_1

    .line 596
    :pswitch_4
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 597
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 598
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->d:Landroid/widget/TextView;

    const v2, 0x7f07020c

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 599
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 600
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->f:Landroid/widget/CheckBox;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/qh;->a:Lcom/roidapp/photogrid/release/Preference;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/Preference;->x(Lcom/roidapp/photogrid/release/Preference;)Z

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 601
    iget-object v0, v0, Lcom/roidapp/photogrid/release/qg;->f:Landroid/widget/CheckBox;

    invoke-virtual {v0, v4}, Landroid/widget/CheckBox;->setVisibility(I)V

    goto/16 :goto_1

    .line 604
    :pswitch_5
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 605
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 606
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->d:Landroid/widget/TextView;

    const v2, 0x7f070226

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 607
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 608
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->e:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/qh;->a:Lcom/roidapp/photogrid/release/Preference;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/Preference;->y(Lcom/roidapp/photogrid/release/Preference;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 609
    iget-object v0, v0, Lcom/roidapp/photogrid/release/qg;->f:Landroid/widget/CheckBox;

    invoke-virtual {v0, v5}, Landroid/widget/CheckBox;->setVisibility(I)V

    goto/16 :goto_1

    .line 612
    :pswitch_6
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 613
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 614
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->d:Landroid/widget/TextView;

    const v2, 0x7f070223

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 615
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 616
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->f:Landroid/widget/CheckBox;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/qh;->a:Lcom/roidapp/photogrid/release/Preference;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/Preference;->z(Lcom/roidapp/photogrid/release/Preference;)Z

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 617
    iget-object v0, v0, Lcom/roidapp/photogrid/release/qg;->f:Landroid/widget/CheckBox;

    invoke-virtual {v0, v4}, Landroid/widget/CheckBox;->setVisibility(I)V

    goto/16 :goto_1

    .line 620
    :pswitch_7
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 621
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 622
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->d:Landroid/widget/TextView;

    const v2, 0x7f070229

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 623
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 624
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->f:Landroid/widget/CheckBox;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/qh;->a:Lcom/roidapp/photogrid/release/Preference;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/Preference;->A(Lcom/roidapp/photogrid/release/Preference;)Z

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 625
    iget-object v0, v0, Lcom/roidapp/photogrid/release/qg;->f:Landroid/widget/CheckBox;

    invoke-virtual {v0, v4}, Landroid/widget/CheckBox;->setVisibility(I)V

    goto/16 :goto_1

    .line 628
    :pswitch_8
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 629
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 630
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->d:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(I)V

    .line 631
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 632
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->e:Landroid/widget/TextView;

    const v2, 0x7f0701b7

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 633
    iget-object v0, v0, Lcom/roidapp/photogrid/release/qg;->f:Landroid/widget/CheckBox;

    invoke-virtual {v0, v5}, Landroid/widget/CheckBox;->setVisibility(I)V

    goto/16 :goto_1

    .line 636
    :pswitch_9
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 637
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 638
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->d:Landroid/widget/TextView;

    const v2, 0x7f0702fe

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 639
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 640
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->e:Landroid/widget/TextView;

    const v2, 0x7f0702ff

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 641
    iget-object v0, v0, Lcom/roidapp/photogrid/release/qg;->f:Landroid/widget/CheckBox;

    invoke-virtual {v0, v5}, Landroid/widget/CheckBox;->setVisibility(I)V

    goto/16 :goto_1

    .line 652
    :pswitch_a
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 653
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 654
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->d:Landroid/widget/TextView;

    const v2, 0x7f070218

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 655
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 656
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->e:Landroid/widget/TextView;

    const v2, 0x7f070219

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 657
    iget-object v0, v0, Lcom/roidapp/photogrid/release/qg;->f:Landroid/widget/CheckBox;

    invoke-virtual {v0, v5}, Landroid/widget/CheckBox;->setVisibility(I)V

    goto/16 :goto_1

    .line 660
    :pswitch_b
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 661
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 662
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->d:Landroid/widget/TextView;

    const v2, 0x7f07021a

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 663
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 664
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->e:Landroid/widget/TextView;

    const v2, 0x7f07021b

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 665
    iget-object v0, v0, Lcom/roidapp/photogrid/release/qg;->f:Landroid/widget/CheckBox;

    invoke-virtual {v0, v5}, Landroid/widget/CheckBox;->setVisibility(I)V

    goto/16 :goto_1

    .line 668
    :pswitch_c
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 669
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 670
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->d:Landroid/widget/TextView;

    const v2, 0x7f070197

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 671
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 672
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->e:Landroid/widget/TextView;

    const v2, 0x7f070196

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 673
    iget-object v0, v0, Lcom/roidapp/photogrid/release/qg;->f:Landroid/widget/CheckBox;

    invoke-virtual {v0, v5}, Landroid/widget/CheckBox;->setVisibility(I)V

    goto/16 :goto_1

    .line 676
    :pswitch_d
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 677
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 678
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->d:Landroid/widget/TextView;

    const v2, 0x7f070046

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 679
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 680
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->e:Landroid/widget/TextView;

    const v2, 0x7f070047

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 681
    iget-object v0, v0, Lcom/roidapp/photogrid/release/qg;->f:Landroid/widget/CheckBox;

    invoke-virtual {v0, v5}, Landroid/widget/CheckBox;->setVisibility(I)V

    goto/16 :goto_1

    .line 684
    :pswitch_e
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 685
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 686
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->d:Landroid/widget/TextView;

    const v2, 0x7f070225

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 687
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 688
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->e:Landroid/widget/TextView;

    const v2, 0x7f070225

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 689
    iget-object v0, v0, Lcom/roidapp/photogrid/release/qg;->f:Landroid/widget/CheckBox;

    invoke-virtual {v0, v5}, Landroid/widget/CheckBox;->setVisibility(I)V

    goto/16 :goto_1

    .line 692
    :pswitch_f
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 693
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 694
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->d:Landroid/widget/TextView;

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(I)V

    .line 695
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 696
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(I)V

    .line 697
    iget-object v0, v0, Lcom/roidapp/photogrid/release/qg;->f:Landroid/widget/CheckBox;

    invoke-virtual {v0, v5}, Landroid/widget/CheckBox;->setVisibility(I)V

    goto/16 :goto_1

    .line 700
    :pswitch_10
    iget-object v1, p0, Lcom/roidapp/photogrid/release/qh;->a:Lcom/roidapp/photogrid/release/Preference;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/Preference;->a()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 701
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 702
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 703
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->d:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/roidapp/photogrid/release/qh;->a:Lcom/roidapp/photogrid/release/Preference;

    invoke-virtual {v3, v7}, Lcom/roidapp/photogrid/release/Preference;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " debug mode"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 704
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->e:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/qh;->a:Lcom/roidapp/photogrid/release/Preference;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/Preference;->B(Lcom/roidapp/photogrid/release/Preference;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 711
    :goto_2
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 712
    iget-object v0, v0, Lcom/roidapp/photogrid/release/qg;->f:Landroid/widget/CheckBox;

    invoke-virtual {v0, v5}, Landroid/widget/CheckBox;->setVisibility(I)V

    goto/16 :goto_1

    .line 706
    :cond_3
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 707
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 708
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->d:Landroid/widget/TextView;

    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setText(I)V

    .line 709
    iget-object v1, v0, Lcom/roidapp/photogrid/release/qg;->e:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/qh;->a:Lcom/roidapp/photogrid/release/Preference;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/Preference;->B(Lcom/roidapp/photogrid/release/Preference;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 520
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x5 -> :sswitch_1
        0x8 -> :sswitch_2
        0xa -> :sswitch_3
        0xc -> :sswitch_4
    .end sparse-switch

    .line 554
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_0
        :pswitch_5
        :pswitch_6
        :pswitch_0
        :pswitch_7
        :pswitch_0
        :pswitch_8
        :pswitch_0
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
    .end packed-switch
.end method

.method public final isEnabled(I)Z
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 471
    sparse-switch p1, :sswitch_data_0

    .line 483
    const/4 v0, 0x1

    :sswitch_0
    return v0

    .line 471
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x5 -> :sswitch_0
        0x8 -> :sswitch_0
        0xa -> :sswitch_0
        0xc -> :sswitch_0
    .end sparse-switch
.end method
