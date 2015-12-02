.class public Lcom/mobvista/sdk/m/core/AdMobvistaAct;
.super Landroid/app/Activity;
.source "360Security"

# interfaces
.implements Lcom/mobvista/sdk/m/b/e;


# instance fields
.field private A:Lcom/mobvista/sdk/m/core/b/a;

.field private B:Landroid/widget/RelativeLayout;

.field private C:Lcom/mobvista/sdk/m/core/c/b;

.field private D:Lcom/mobvista/sdk/m/b/a;

.field private E:Z

.field private F:Z

.field private G:Ljava/lang/String;

.field private H:Ljava/lang/String;

.field private I:I

.field private J:I

.field a:I

.field private b:Lcom/mobvista/sdk/m/core/k;

.field private c:Lcom/mobvista/sdk/m/core/j;

.field private d:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

.field private e:Landroid/widget/LinearLayout;

.field private f:Landroid/widget/LinearLayout;

.field private g:Landroid/widget/RelativeLayout;

.field private h:Landroid/widget/RelativeLayout;

.field private i:Landroid/widget/RelativeLayout;

.field private j:I

.field private k:Lcom/mobvista/sdk/m/b/d;

.field private l:Lcom/mobvista/sdk/m/core/b/a;

.field private m:Lcom/mobvista/sdk/m/core/a/b;

.field private n:Landroid/widget/LinearLayout;

.field private o:Lcom/mobvista/sdk/m/core/entity/Campaign;

.field private p:Ljava/util/List;

.field private q:Landroid/widget/ListView;

.field private r:Lcom/mobvista/sdk/m/core/b/a;

.field private s:Landroid/widget/LinearLayout;

.field private t:Landroid/widget/RelativeLayout;

.field private u:Ljava/util/List;

.field private v:Landroid/widget/ListView;

.field private w:Lcom/mobvista/sdk/m/core/b/a;

.field private x:Landroid/widget/RelativeLayout;

.field private y:Ljava/util/List;

.field private z:Landroid/widget/ListView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 58
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 119
    const/4 v0, 0x0

    iput v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->J:I

    .line 929
    const/4 v0, -0x1

    iput v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->a:I

    return-void
.end method

.method private a(Lcom/mobvista/sdk/m/core/entity/CampaignEx;I)Landroid/view/View;
    .locals 12

    .prologue
    const/4 v11, -0x1

    const/high16 v3, 0x41200000    # 10.0f

    const/4 v10, 0x0

    const/4 v9, 0x1

    const/4 v8, -0x2

    .line 520
    const/high16 v0, 0x40800000    # 4.0f

    invoke-static {p0, v0}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v0

    .line 521
    invoke-static {p0, v3}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v1

    .line 522
    mul-int/lit8 v2, v1, 0x2

    sub-int v2, p2, v2

    .line 524
    invoke-static {p0, v3}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v3

    .line 525
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 526
    invoke-virtual {v4, v11}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 527
    int-to-float v3, v3

    invoke-virtual {v4, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 528
    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 529
    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 530
    invoke-virtual {v3, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 531
    invoke-virtual {v3, v1, v1, v1, v1}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 533
    new-instance v1, Landroid/widget/ImageView;

    invoke-direct {v1, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 534
    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getIconUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 535
    invoke-static {}, Lcom/mobvista/sdk/m/a/d/a/d;->a()Lcom/mobvista/sdk/m/a/d/a/d;

    move-result-object v4

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getIconUrl()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lcom/mobvista/sdk/m/core/e;

    invoke-direct {v6, p0, v1}, Lcom/mobvista/sdk/m/core/e;-><init>(Lcom/mobvista/sdk/m/core/AdMobvistaAct;Landroid/widget/ImageView;)V

    invoke-virtual {v4, v5, v6}, Lcom/mobvista/sdk/m/a/d/a/d;->a(Ljava/lang/String;Lcom/mobvista/sdk/m/a/d/a/h;)V

    .line 552
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v4, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 554
    iput v9, v4, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 555
    invoke-virtual {v3, v1, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 557
    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 558
    invoke-virtual {v1}, Landroid/widget/TextView;->setSingleLine()V

    .line 559
    const v4, -0xccff9a

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 560
    const/high16 v4, 0x41600000    # 14.0f

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 561
    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getAppName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 562
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v4, v8, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 565
    iput v9, v4, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 566
    iput v0, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 567
    invoke-virtual {v3, v1, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 569
    new-instance v1, Landroid/widget/RatingBar;

    const/4 v4, 0x0

    const v5, 0x101007d

    invoke-direct {v1, p0, v4, v5}, Landroid/widget/RatingBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 570
    const/4 v4, 0x5

    invoke-virtual {v1, v4}, Landroid/widget/RatingBar;->setNumStars(I)V

    .line 571
    const-wide/high16 v4, 0x4010000000000000L    # 4.0

    new-instance v6, Ljava/util/Random;

    invoke-direct {v6}, Ljava/util/Random;-><init>()V

    invoke-virtual {v6}, Ljava/util/Random;->nextDouble()D

    move-result-wide v6

    add-double/2addr v4, v6

    double-to-float v4, v4

    invoke-virtual {v1, v4}, Landroid/widget/RatingBar;->setRating(F)V

    .line 572
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v4, v8, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 575
    iput v9, v4, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 576
    iput v0, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 577
    invoke-virtual {v3, v1, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 578
    const/16 v4, 0x8

    invoke-virtual {v1, v4}, Landroid/widget/RatingBar;->setVisibility(I)V

    .line 580
    const/high16 v1, 0x40c00000    # 6.0f

    invoke-static {p0, v1}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v1

    .line 581
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 582
    const v5, -0xa86a1b

    invoke-virtual {v4, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 583
    int-to-float v1, v1

    invoke-virtual {v4, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 584
    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 585
    invoke-virtual {v1, v10}, Landroid/widget/TextView;->setClickable(Z)V

    .line 586
    const/16 v5, 0x11

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setGravity(I)V

    .line 587
    invoke-virtual {v1}, Landroid/widget/TextView;->setSingleLine()V

    .line 588
    invoke-virtual {v1, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 589
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 590
    const-string/jumbo v4, "INSTALL"

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 591
    invoke-static {}, Lcom/mobvista/sdk/m/a/f/j;->a()I

    move-result v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setId(I)V

    .line 592
    const/high16 v4, 0x40400000    # 3.0f

    invoke-static {p0, v4}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v4

    .line 593
    invoke-virtual {v1, v10, v4, v10, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 594
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v4, v2, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 596
    iput v9, v4, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 597
    iput v0, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 598
    invoke-virtual {v3, v1, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 600
    new-instance v0, Lcom/mobvista/sdk/m/core/f;

    invoke-direct {v0, p0, p1}, Lcom/mobvista/sdk/m/core/f;-><init>(Lcom/mobvista/sdk/m/core/AdMobvistaAct;Lcom/mobvista/sdk/m/core/entity/CampaignEx;)V

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 609
    return-object v3
.end method

.method private a(Ljava/util/List;)Landroid/widget/ListView;
    .locals 13

    .prologue
    const/4 v12, 0x6

    const/4 v6, 0x1

    const/4 v11, -0x2

    const/high16 v2, 0x41200000    # 10.0f

    const/4 v3, 0x0

    .line 461
    new-instance v4, Landroid/widget/ListView;

    invoke-direct {v4, p0}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 462
    invoke-virtual {v4, v3}, Landroid/widget/ListView;->setCacheColorHint(I)V

    .line 463
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v4, v0}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 464
    invoke-static {p0, v2}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 465
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v4, v0}, Landroid/widget/ListView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    .line 466
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v4, v0}, Landroid/widget/ListView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 469
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->n:Landroid/widget/LinearLayout;

    .line 470
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->n:Landroid/widget/LinearLayout;

    invoke-virtual {v4, v0}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    .line 471
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->n:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 473
    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v12, :cond_3

    .line 474
    new-instance v0, Lcom/mobvista/sdk/m/core/b/a;

    invoke-direct {v0, p0, p1, v6}, Lcom/mobvista/sdk/m/core/b/a;-><init>(Landroid/content/Context;Ljava/util/List;Z)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->l:Lcom/mobvista/sdk/m/core/b/a;

    .line 475
    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 476
    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 477
    invoke-static {p0, v2}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v6

    .line 478
    invoke-static {p0}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;)F

    move-result v0

    .line 479
    iget v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->j:I

    mul-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    sub-float/2addr v0, v1

    mul-int/lit8 v1, v6, 0x2

    int-to-float v1, v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40400000    # 3.0f

    div-float/2addr v0, v1

    float-to-int v7, v0

    .line 480
    const/4 v0, 0x0

    move v2, v3

    .line 481
    :goto_0
    if-ge v2, v12, :cond_2

    .line 482
    rem-int/lit8 v1, v2, 0x3

    .line 483
    div-int/lit8 v8, v2, 0x3

    .line 484
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v9, v7, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 486
    if-nez v1, :cond_1

    .line 487
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 488
    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 489
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v10, -0x1

    invoke-direct {v1, v10, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 492
    if-lez v8, :cond_0

    .line 493
    invoke-virtual {v1, v3, v6, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 495
    :cond_0
    invoke-virtual {v5, v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    move-object v1, v0

    .line 500
    :goto_1
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-direct {p0, v0, v7}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->a(Lcom/mobvista/sdk/m/core/entity/CampaignEx;I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v1, v0, v9}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 481
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    move-object v0, v1

    goto :goto_0

    .line 497
    :cond_1
    invoke-virtual {v9, v6, v3, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    move-object v1, v0

    goto :goto_1

    .line 503
    :cond_2
    invoke-virtual {v4, v5}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    .line 508
    :goto_2
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->l:Lcom/mobvista/sdk/m/core/b/a;

    invoke-virtual {v4, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 509
    return-object v4

    .line 505
    :cond_3
    new-instance v0, Lcom/mobvista/sdk/m/core/b/a;

    invoke-direct {v0, p0, p1, v3}, Lcom/mobvista/sdk/m/core/b/a;-><init>(Landroid/content/Context;Ljava/util/List;Z)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->l:Lcom/mobvista/sdk/m/core/b/a;

    goto :goto_2
.end method

.method static synthetic a(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)Lcom/mobvista/sdk/m/core/entity/Campaign;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->o:Lcom/mobvista/sdk/m/core/entity/Campaign;

    return-object v0
.end method

.method static synthetic a(Lcom/mobvista/sdk/m/core/AdMobvistaAct;Lcom/mobvista/sdk/m/core/entity/Campaign;)Lcom/mobvista/sdk/m/core/entity/Campaign;
    .locals 0

    .prologue
    .line 58
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->o:Lcom/mobvista/sdk/m/core/entity/Campaign;

    return-object p1
.end method

.method private a(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 369
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->m:Lcom/mobvista/sdk/m/core/a/b;

    if-eqz v0, :cond_0

    .line 370
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->m:Lcom/mobvista/sdk/m/core/a/b;

    invoke-virtual {v0, p1}, Lcom/mobvista/sdk/m/core/a/b;->a(Landroid/view/View;)V

    .line 372
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/mobvista/sdk/m/core/AdMobvistaAct;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 58
    invoke-direct {p0, p1}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Lcom/mobvista/sdk/m/core/entity/Campaign;)V
    .locals 12

    .prologue
    const/4 v11, 0x1

    const/4 v10, 0x0

    const/high16 v9, 0x41200000    # 10.0f

    const/4 v8, -0x2

    const/4 v7, -0x1

    .line 164
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->s:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    .line 165
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->s:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v10}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 166
    const/high16 v0, 0x41000000    # 8.0f

    invoke-static {p0, v0}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v0

    .line 167
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->s:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0, v0, v0, v0}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 169
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->s:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 170
    invoke-static {p0, v9}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v1

    .line 171
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 172
    invoke-virtual {v2, v7}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 173
    int-to-float v1, v1

    invoke-virtual {v2, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 174
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->s:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 176
    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 177
    invoke-virtual {v1, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 179
    new-instance v2, Landroid/widget/ImageView;

    invoke-direct {v2, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 180
    const/high16 v3, 0x42800000    # 64.0f

    invoke-static {p0, v3}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v3

    .line 181
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v4, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 183
    invoke-virtual {v1, v2, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 184
    invoke-static {}, Lcom/mobvista/sdk/m/a/d/a/d;->a()Lcom/mobvista/sdk/m/a/d/a/d;

    move-result-object v4

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/Campaign;->getIconUrl()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lcom/mobvista/sdk/m/core/a;

    invoke-direct {v6, p0, v2}, Lcom/mobvista/sdk/m/core/a;-><init>(Lcom/mobvista/sdk/m/core/AdMobvistaAct;Landroid/widget/ImageView;)V

    invoke-virtual {v4, v5, v6}, Lcom/mobvista/sdk/m/a/d/a/d;->a(Ljava/lang/String;Lcom/mobvista/sdk/m/a/d/a/h;)V

    .line 200
    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 201
    invoke-virtual {v2, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 202
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v4, v7, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 204
    invoke-static {p0, v9}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v3

    iput v3, v4, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 205
    invoke-virtual {v1, v2, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 207
    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 208
    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/Campaign;->getAppName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 209
    const/high16 v4, 0x41a00000    # 20.0f

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 210
    const v4, -0xa0ad60

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 211
    invoke-virtual {v3}, Landroid/widget/TextView;->setSingleLine()V

    .line 212
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v4, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 215
    invoke-virtual {v2, v3, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 217
    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 218
    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/Campaign;->getAppDesc()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 219
    const/high16 v4, 0x41600000    # 14.0f

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 220
    const v4, -0x666667

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 221
    const/4 v4, 0x2

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 222
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v4, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 225
    const/16 v5, 0x50

    iput v5, v4, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 226
    invoke-virtual {v2, v3, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 228
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v2, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 231
    const/high16 v3, 0x40a00000    # 5.0f

    invoke-static {p0, v3}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v3

    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 232
    iget-object v3, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->s:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 234
    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 235
    const v2, -0x666667

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 236
    const-string/jumbo v2, "Sponsored"

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 237
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v2, v8, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 240
    const/4 v3, 0x5

    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 241
    iget-object v3, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->s:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 243
    new-instance v1, Landroid/widget/RelativeLayout;

    invoke-direct {v1, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 244
    new-instance v2, Landroid/widget/ImageView;

    invoke-direct {v2, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 245
    sget-object v3, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 246
    invoke-static {p0}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;)F

    move-result v3

    iget v4, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->j:I

    mul-int/lit8 v4, v4, 0x2

    int-to-float v4, v4

    sub-float/2addr v3, v4

    mul-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    sub-float v0, v3, v0

    float-to-int v0, v0

    .line 247
    mul-int/lit16 v3, v0, 0x1a0

    div-int/lit16 v3, v3, 0x31c

    .line 248
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v4, v0, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 249
    invoke-static {p0, v9}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v5

    iput v5, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 250
    iput v11, v4, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 251
    new-instance v5, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v5, v0, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v2, v5}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 252
    invoke-static {}, Lcom/mobvista/sdk/m/a/d/a/d;->a()Lcom/mobvista/sdk/m/a/d/a/d;

    move-result-object v0

    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/Campaign;->getImageUrl()Ljava/lang/String;

    move-result-object v3

    new-instance v5, Lcom/mobvista/sdk/m/core/b;

    invoke-direct {v5, p0, v2}, Lcom/mobvista/sdk/m/core/b;-><init>(Lcom/mobvista/sdk/m/core/AdMobvistaAct;Landroid/widget/ImageView;)V

    invoke-virtual {v0, v3, v5}, Lcom/mobvista/sdk/m/a/d/a/d;->a(Ljava/lang/String;Lcom/mobvista/sdk/m/a/d/a/h;)V

    .line 269
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->s:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 271
    const/high16 v0, 0x40c00000    # 6.0f

    invoke-static {p0, v0}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v0

    .line 272
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 273
    const v2, -0xa86a1b

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 274
    int-to-float v0, v0

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 275
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 276
    const/high16 v2, 0x40c00000    # 6.0f

    invoke-static {p0, v2}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v2

    .line 277
    invoke-virtual {v0, v10, v2, v10, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 278
    const/16 v2, 0x11

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 279
    invoke-virtual {v0}, Landroid/widget/TextView;->setSingleLine()V

    .line 280
    const/high16 v2, 0x41800000    # 16.0f

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 281
    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 282
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 283
    invoke-virtual {p1}, Lcom/mobvista/sdk/m/core/entity/Campaign;->getAdCall()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 285
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v1, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 288
    invoke-static {p0, v9}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v2

    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 289
    iget-object v2, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->s:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 291
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->s:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->a(Landroid/view/View;)V

    .line 294
    :cond_0
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 297
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 298
    iget-boolean v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->E:Z

    if-eqz v0, :cond_1

    .line 338
    :cond_0
    :goto_0
    return-void

    .line 301
    :cond_1
    iput-boolean v2, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->E:Z

    .line 307
    new-instance v0, Lcom/mobvista/sdk/m/core/loader/h;

    invoke-direct {v0, p1}, Lcom/mobvista/sdk/m/core/loader/h;-><init>(Ljava/lang/String;)V

    .line 308
    const/4 v1, 0x0

    invoke-virtual {v0, v2, v1}, Lcom/mobvista/sdk/m/core/loader/h;->a(ILcom/mobvista/sdk/m/a/a/c/d;)V

    .line 309
    new-instance v1, Lcom/mobvista/sdk/m/core/c;

    invoke-direct {v1, p0, p1}, Lcom/mobvista/sdk/m/core/c;-><init>(Lcom/mobvista/sdk/m/core/AdMobvistaAct;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/loader/h;->a(Lcom/mobvista/sdk/m/a/a/c/d;)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)Lcom/mobvista/sdk/m/b/d;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->k:Lcom/mobvista/sdk/m/b/d;

    return-object v0
.end method

.method private b()V
    .locals 4

    .prologue
    .line 342
    new-instance v0, Lcom/mobvista/sdk/m/core/a/b;

    invoke-direct {v0}, Lcom/mobvista/sdk/m/core/a/b;-><init>()V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->m:Lcom/mobvista/sdk/m/core/a/b;

    .line 343
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->m:Lcom/mobvista/sdk/m/core/a/b;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->H:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/a/b;->a([Ljava/lang/Object;)V

    .line 344
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->m:Lcom/mobvista/sdk/m/core/a/b;

    new-instance v1, Lcom/mobvista/sdk/m/core/d;

    invoke-direct {v1, p0}, Lcom/mobvista/sdk/m/core/d;-><init>(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)V

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/a/b;->a(Lcom/mobvista/sdk/m/core/a/a;)V

    .line 366
    return-void
.end method

.method private b(I)V
    .locals 3

    .prologue
    .line 635
    new-instance v0, Landroid/content/Intent;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "com.mobvista.sdk.m.ACTION_ACT_ORDER"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->G:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->I:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 636
    const-string/jumbo v1, "ORDER"

    const-string/jumbo v2, "REFRESH"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 637
    const-string/jumbo v1, "WHICH"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 638
    invoke-virtual {p0, v0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->sendBroadcast(Landroid/content/Intent;)V

    .line 639
    return-void
.end method

.method static synthetic b(Lcom/mobvista/sdk/m/core/AdMobvistaAct;Lcom/mobvista/sdk/m/core/entity/Campaign;)V
    .locals 0

    .prologue
    .line 58
    invoke-direct {p0, p1}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->a(Lcom/mobvista/sdk/m/core/entity/Campaign;)V

    return-void
.end method

.method static synthetic c(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->t:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private c()V
    .locals 5

    .prologue
    const/4 v4, -0x1

    const/4 v3, 0x0

    .line 375
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->C:Lcom/mobvista/sdk/m/core/c/b;

    const/16 v1, 0x14

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->G:Ljava/lang/String;

    invoke-virtual {v0, v1, v3, v2}, Lcom/mobvista/sdk/m/core/c/b;->a(IILjava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 376
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_1

    .line 377
    :cond_0
    invoke-direct {p0, v3}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->b(I)V

    .line 401
    :goto_0
    return-void

    .line 380
    :cond_1
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->p:Ljava/util/List;

    if-eqz v1, :cond_3

    .line 381
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->p:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 385
    :goto_1
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->p:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 386
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getOnlyImpressionURL()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->a(Ljava/lang/String;)V

    .line 388
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->q:Landroid/widget/ListView;

    if-nez v0, :cond_4

    .line 389
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->p:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->a(Ljava/util/List;)Landroid/widget/ListView;

    move-result-object v0

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->q:Landroid/widget/ListView;

    .line 390
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->n:Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->s:Landroid/widget/LinearLayout;

    .line 391
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->o:Lcom/mobvista/sdk/m/core/entity/Campaign;

    if-eqz v0, :cond_2

    .line 392
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->o:Lcom/mobvista/sdk/m/core/entity/Campaign;

    invoke-direct {p0, v0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->a(Lcom/mobvista/sdk/m/core/entity/Campaign;)V

    .line 394
    :cond_2
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->l:Lcom/mobvista/sdk/m/core/b/a;

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->r:Lcom/mobvista/sdk/m/core/b/a;

    .line 395
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->g:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->q:Landroid/widget/ListView;

    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v2, v4, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 400
    :goto_2
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->t:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 383
    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->p:Ljava/util/List;

    goto :goto_1

    .line 398
    :cond_4
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->r:Lcom/mobvista/sdk/m/core/b/a;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/b/a;->notifyDataSetChanged()V

    goto :goto_2
.end method

.method private d()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, -0x1

    .line 404
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->C:Lcom/mobvista/sdk/m/core/c/b;

    const/16 v1, 0x14

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->G:Ljava/lang/String;

    invoke-virtual {v0, v1, v4, v2}, Lcom/mobvista/sdk/m/core/c/b;->a(IILjava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 405
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_1

    .line 406
    :cond_0
    invoke-direct {p0, v4}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->b(I)V

    .line 426
    :goto_0
    return-void

    .line 409
    :cond_1
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->u:Ljava/util/List;

    if-eqz v1, :cond_2

    .line 410
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->u:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 414
    :goto_1
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->u:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 415
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getOnlyImpressionURL()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->a(Ljava/lang/String;)V

    .line 417
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->v:Landroid/widget/ListView;

    if-nez v0, :cond_3

    .line 418
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->u:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->a(Ljava/util/List;)Landroid/widget/ListView;

    move-result-object v0

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->v:Landroid/widget/ListView;

    .line 419
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->l:Lcom/mobvista/sdk/m/core/b/a;

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->w:Lcom/mobvista/sdk/m/core/b/a;

    .line 420
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->h:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->v:Landroid/widget/ListView;

    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v2, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 425
    :goto_2
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->x:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 412
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->u:Ljava/util/List;

    goto :goto_1

    .line 423
    :cond_3
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->w:Lcom/mobvista/sdk/m/core/b/a;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/b/a;->notifyDataSetChanged()V

    goto :goto_2
.end method

.method static synthetic d(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)V
    .locals 0

    .prologue
    .line 58
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->c()V

    return-void
.end method

.method static synthetic e(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->x:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private e()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, -0x1

    .line 429
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->C:Lcom/mobvista/sdk/m/core/c/b;

    const/16 v1, 0x14

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->G:Ljava/lang/String;

    invoke-virtual {v0, v1, v4, v2}, Lcom/mobvista/sdk/m/core/c/b;->a(IILjava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 430
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_1

    .line 431
    :cond_0
    invoke-direct {p0, v4}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->b(I)V

    .line 451
    :goto_0
    return-void

    .line 434
    :cond_1
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->y:Ljava/util/List;

    if-eqz v1, :cond_2

    .line 435
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->y:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 439
    :goto_1
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->y:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 440
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getOnlyImpressionURL()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->a(Ljava/lang/String;)V

    .line 442
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->z:Landroid/widget/ListView;

    if-nez v0, :cond_3

    .line 443
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->y:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->a(Ljava/util/List;)Landroid/widget/ListView;

    move-result-object v0

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->z:Landroid/widget/ListView;

    .line 444
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->l:Lcom/mobvista/sdk/m/core/b/a;

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->A:Lcom/mobvista/sdk/m/core/b/a;

    .line 445
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->i:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->z:Landroid/widget/ListView;

    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v2, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 450
    :goto_2
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->B:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 437
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->y:Ljava/util/List;

    goto :goto_1

    .line 448
    :cond_3
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->A:Lcom/mobvista/sdk/m/core/b/a;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/b/a;->notifyDataSetChanged()V

    goto :goto_2
.end method

.method private f()V
    .locals 0

    .prologue
    .line 454
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->b()V

    .line 455
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->c()V

    .line 456
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->d()V

    .line 457
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->e()V

    .line 458
    return-void
.end method

.method static synthetic f(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)V
    .locals 0

    .prologue
    .line 58
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->d()V

    return-void
.end method

.method static synthetic g(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->B:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private g()V
    .locals 3

    .prologue
    .line 613
    new-instance v0, Landroid/content/Intent;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "com.mobvista.sdk.m.ACTION_ACT_ORDER"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->G:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->I:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 614
    const-string/jumbo v1, "ORDER"

    const-string/jumbo v2, "UNREGIST"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 615
    const-string/jumbo v1, "UNREGIST_KEY"

    iget v2, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->I:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 616
    invoke-virtual {p0, v0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->sendBroadcast(Landroid/content/Intent;)V

    .line 617
    return-void
.end method

.method private h()V
    .locals 13

    .prologue
    const/4 v12, 0x1

    const/16 v11, 0x11

    const/4 v1, 0x0

    const/4 v10, -0x2

    const/4 v9, -0x1

    .line 642
    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 643
    invoke-virtual {v2, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 644
    new-instance v0, Landroid/widget/RelativeLayout;

    invoke-direct {v0, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 645
    invoke-static {p0}, Lcom/mobvista/sdk/m/a/d/a/k;->a(Landroid/content/Context;)Lcom/mobvista/sdk/m/a/d/a/k;

    move-result-object v3

    const-string/jumbo v4, "bg_titlebar.jpg"

    invoke-virtual {v3, v4}, Lcom/mobvista/sdk/m/a/d/a/k;->a(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 646
    invoke-static {p0}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;)F

    move-result v3

    const/high16 v4, 0x43650000    # 229.0f

    mul-float/2addr v3, v4

    const/high16 v4, 0x44340000    # 720.0f

    div-float/2addr v3, v4

    float-to-int v3, v3

    .line 647
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v4, v9, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 649
    invoke-virtual {v2, v0, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 652
    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 653
    invoke-virtual {v3, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 654
    const/16 v4, 0x10

    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 655
    new-instance v4, Landroid/widget/TextView;

    invoke-direct {v4, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 656
    invoke-static {p0}, Lcom/mobvista/sdk/m/a/d/a/k;->a(Landroid/content/Context;)Lcom/mobvista/sdk/m/a/d/a/k;

    move-result-object v5

    const-string/jumbo v6, "img_back.png"

    invoke-virtual {v5, v6}, Lcom/mobvista/sdk/m/a/d/a/k;->a(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 657
    const/high16 v5, 0x41c00000    # 24.0f

    invoke-static {p0, v5}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v5

    .line 658
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v6, v5, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 659
    const/high16 v5, 0x41700000    # 15.0f

    invoke-static {p0, v5}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v5

    iput v5, v6, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 660
    invoke-virtual {v3, v4, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 661
    new-instance v4, Landroid/widget/ImageView;

    invoke-direct {v4, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 662
    invoke-static {p0}, Lcom/mobvista/sdk/m/a/d/a/k;->a(Landroid/content/Context;)Lcom/mobvista/sdk/m/a/d/a/k;

    move-result-object v5

    const-string/jumbo v6, "img_logo.png"

    invoke-virtual {v5, v6}, Lcom/mobvista/sdk/m/a/d/a/k;->a(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 663
    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 664
    const/high16 v6, 0x41a40000    # 20.5f

    invoke-static {p0, v6}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v6

    .line 665
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v7

    .line 666
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v5

    mul-int/2addr v5, v6

    div-int/2addr v5, v7

    .line 667
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v7, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 668
    const/high16 v5, 0x41a00000    # 20.0f

    invoke-static {p0, v5}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v5

    iput v5, v7, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 669
    invoke-virtual {v3, v4, v7}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 670
    const/high16 v4, 0x42480000    # 50.0f

    invoke-static {p0, v4}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v4

    .line 671
    new-instance v5, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v5, v10, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 672
    const/16 v4, 0xa

    invoke-virtual {v5, v4, v9}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 673
    invoke-virtual {v0, v3, v5}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 674
    new-instance v4, Lcom/mobvista/sdk/m/core/g;

    invoke-direct {v4, p0}, Lcom/mobvista/sdk/m/core/g;-><init>(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)V

    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 684
    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v3, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->e:Landroid/widget/LinearLayout;

    .line 685
    iget-object v3, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 686
    new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v3, v9, v10}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 688
    const/16 v4, 0xc

    invoke-virtual {v3, v4, v9}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 690
    iget-object v4, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v4, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 691
    const/4 v0, 0x3

    new-array v3, v0, [Ljava/lang/String;

    const-string/jumbo v0, "FEATURED"

    aput-object v0, v3, v1

    const-string/jumbo v0, "GAMES"

    aput-object v0, v3, v12

    const/4 v0, 0x2

    const-string/jumbo v4, "APPS"

    aput-object v4, v3, v0

    .line 692
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v4, v9, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 695
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, v4, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    move v0, v1

    .line 696
    :goto_0
    const/4 v5, 0x3

    if-ge v0, v5, :cond_0

    .line 697
    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 699
    new-instance v6, Lcom/mobvista/sdk/m/core/h;

    invoke-direct {v6, p0, v0}, Lcom/mobvista/sdk/m/core/h;-><init>(Lcom/mobvista/sdk/m/core/AdMobvistaAct;I)V

    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 709
    iget-object v6, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v6, v5, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 710
    invoke-virtual {v5, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 711
    new-instance v6, Landroid/widget/TextView;

    invoke-direct {v6, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 712
    invoke-virtual {v6}, Landroid/widget/TextView;->setSingleLine()V

    .line 713
    sget-object v7, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 714
    aget-object v7, v3, v0

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 715
    invoke-virtual {v6, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 716
    const/high16 v7, 0x41600000    # 14.0f

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 717
    invoke-virtual {v6, v12}, Landroid/widget/TextView;->setGravity(I)V

    .line 718
    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 720
    new-instance v6, Landroid/widget/TextView;

    invoke-direct {v6, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 721
    const/4 v7, 0x4

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setVisibility(I)V

    .line 722
    invoke-static {p0}, Lcom/mobvista/sdk/m/a/d/a/k;->a(Landroid/content/Context;)Lcom/mobvista/sdk/m/a/d/a/k;

    move-result-object v7

    const-string/jumbo v8, "img_line_title.jpg"

    invoke-virtual {v7, v8}, Lcom/mobvista/sdk/m/a/d/a/k;->a(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 724
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v8, 0x40e00000    # 7.0f

    invoke-static {p0, v8}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v8

    invoke-direct {v7, v9, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 727
    const/high16 v8, 0x41000000    # 8.0f

    invoke-static {p0, v8}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v8

    iput v8, v7, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 728
    invoke-virtual {v5, v6, v7}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 696
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 732
    :cond_0
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->f:Landroid/widget/LinearLayout;

    .line 733
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->f:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 734
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v3, v9, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 737
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, v3, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    move v0, v1

    .line 738
    :goto_1
    const/4 v4, 0x3

    if-ge v0, v4, :cond_1

    .line 739
    new-instance v4, Landroid/widget/RelativeLayout;

    invoke-direct {v4, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 740
    const/4 v5, 0x4

    invoke-virtual {v4, v5}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 741
    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 742
    invoke-static {p0}, Lcom/mobvista/sdk/m/a/d/a/k;->a(Landroid/content/Context;)Lcom/mobvista/sdk/m/a/d/a/k;

    move-result-object v6

    const-string/jumbo v7, "img_sanjiao.png"

    invoke-virtual {v6, v7}, Lcom/mobvista/sdk/m/a/d/a/k;->a(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 744
    invoke-virtual {v4, v11}, Landroid/widget/RelativeLayout;->setGravity(I)V

    .line 745
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v7, 0x41500000    # 13.0f

    invoke-static {p0, v7}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v7

    const/high16 v8, 0x40d00000    # 6.5f

    invoke-static {p0, v8}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v8

    invoke-direct {v6, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 747
    iput v11, v6, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 748
    invoke-virtual {v4, v5, v6}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 749
    iget-object v5, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->f:Landroid/widget/LinearLayout;

    invoke-virtual {v5, v4, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 738
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 753
    :cond_1
    new-instance v0, Lcom/mobvista/sdk/m/b/d;

    invoke-direct {v0, p0}, Lcom/mobvista/sdk/m/b/d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->k:Lcom/mobvista/sdk/m/b/d;

    .line 754
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->k:Lcom/mobvista/sdk/m/b/d;

    invoke-virtual {v0, p0}, Lcom/mobvista/sdk/m/b/d;->a(Lcom/mobvista/sdk/m/b/e;)V

    .line 755
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v9, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 758
    iget-object v3, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->k:Lcom/mobvista/sdk/m/b/d;

    invoke-virtual {v2, v3, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 759
    const/high16 v0, 0x41000000    # 8.0f

    invoke-static {p0, v0}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->j:I

    .line 760
    new-instance v0, Landroid/widget/RelativeLayout;

    invoke-direct {v0, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->g:Landroid/widget/RelativeLayout;

    .line 761
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->g:Landroid/widget/RelativeLayout;

    iget v3, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->j:I

    iget v4, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->j:I

    iget v5, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->j:I

    invoke-virtual {v0, v3, v1, v4, v5}, Landroid/widget/RelativeLayout;->setPadding(IIII)V

    .line 764
    new-instance v0, Landroid/widget/RelativeLayout;

    invoke-direct {v0, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->h:Landroid/widget/RelativeLayout;

    .line 765
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->h:Landroid/widget/RelativeLayout;

    iget v3, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->j:I

    iget v4, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->j:I

    iget v5, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->j:I

    invoke-virtual {v0, v3, v1, v4, v5}, Landroid/widget/RelativeLayout;->setPadding(IIII)V

    .line 768
    new-instance v0, Landroid/widget/RelativeLayout;

    invoke-direct {v0, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->i:Landroid/widget/RelativeLayout;

    .line 769
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->i:Landroid/widget/RelativeLayout;

    iget v3, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->j:I

    iget v4, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->j:I

    iget v5, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->j:I

    invoke-virtual {v0, v3, v1, v4, v5}, Landroid/widget/RelativeLayout;->setPadding(IIII)V

    .line 772
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->k:Lcom/mobvista/sdk/m/b/d;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/b/d;->addView(Landroid/view/View;)V

    .line 773
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->k:Lcom/mobvista/sdk/m/b/d;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/b/d;->addView(Landroid/view/View;)V

    .line 774
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->k:Lcom/mobvista/sdk/m/b/d;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/b/d;->addView(Landroid/view/View;)V

    .line 775
    new-instance v0, Landroid/widget/RelativeLayout;

    invoke-direct {v0, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->t:Landroid/widget/RelativeLayout;

    .line 776
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->t:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v11}, Landroid/widget/RelativeLayout;->setGravity(I)V

    .line 777
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->t:Landroid/widget/RelativeLayout;

    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->i()Landroid/view/View;

    move-result-object v1

    new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v3, v10, v10}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 779
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->g:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->t:Landroid/widget/RelativeLayout;

    new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v3, v9, v9}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 782
    new-instance v0, Landroid/widget/RelativeLayout;

    invoke-direct {v0, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->x:Landroid/widget/RelativeLayout;

    .line 783
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->x:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v11}, Landroid/widget/RelativeLayout;->setGravity(I)V

    .line 784
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->x:Landroid/widget/RelativeLayout;

    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->i()Landroid/view/View;

    move-result-object v1

    new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v3, v10, v10}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 786
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->h:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->x:Landroid/widget/RelativeLayout;

    new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v3, v9, v9}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 789
    new-instance v0, Landroid/widget/RelativeLayout;

    invoke-direct {v0, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->B:Landroid/widget/RelativeLayout;

    .line 790
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->B:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v11}, Landroid/widget/RelativeLayout;->setGravity(I)V

    .line 791
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->B:Landroid/widget/RelativeLayout;

    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->i()Landroid/view/View;

    move-result-object v1

    new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v3, v10, v10}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 793
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->i:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->B:Landroid/widget/RelativeLayout;

    new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v3, v9, v9}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 796
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->k:Lcom/mobvista/sdk/m/b/d;

    iget v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->J:I

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/b/d;->a(I)V

    .line 797
    invoke-virtual {p0, v2}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->setContentView(Landroid/view/View;)V

    .line 798
    return-void
.end method

.method static synthetic h(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)V
    .locals 0

    .prologue
    .line 58
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->e()V

    return-void
.end method

.method private i()Landroid/view/View;
    .locals 6

    .prologue
    const/4 v5, -0x2

    .line 801
    const/high16 v0, 0x40c00000    # 6.0f

    invoke-static {p0, v0}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v0

    .line 802
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 803
    const v2, -0xa86a1b

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 804
    int-to-float v0, v0

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 805
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 806
    const/high16 v2, 0x41200000    # 10.0f

    invoke-static {p0, v2}, Lcom/mobvista/sdk/m/a/f/j;->a(Landroid/content/Context;F)I

    move-result v2

    .line 807
    div-int/lit8 v3, v2, 0x2

    div-int/lit8 v4, v2, 0x2

    invoke-virtual {v0, v2, v3, v2, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 808
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 809
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 810
    new-instance v1, Landroid/widget/ProgressBar;

    invoke-direct {v1, p0}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V

    .line 811
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 812
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 813
    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 814
    const-string/jumbo v2, "loading..."

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 815
    const/4 v2, -0x1

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 816
    const/high16 v2, 0x41600000    # 14.0f

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 817
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v2, v5, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 820
    const/16 v3, 0x10

    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 821
    invoke-virtual {v0, v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 823
    return-object v0
.end method

.method static synthetic i(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->G:Ljava/lang/String;

    return-object v0
.end method

.method private j()V
    .locals 3

    .prologue
    .line 885
    :try_start_0
    iget-boolean v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->F:Z

    if-eqz v0, :cond_1

    .line 913
    :cond_0
    :goto_0
    return-void

    .line 888
    :cond_1
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->D:Lcom/mobvista/sdk/m/b/a;

    if-nez v0, :cond_2

    .line 889
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->d:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    if-eqz v0, :cond_0

    .line 892
    new-instance v0, Lcom/mobvista/sdk/m/b/a;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->d:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-direct {v0, p0, v1}, Lcom/mobvista/sdk/m/b/a;-><init>(Landroid/content/Context;Lcom/mobvista/sdk/m/core/entity/CampaignEx;)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->D:Lcom/mobvista/sdk/m/b/a;

    .line 893
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->D:Lcom/mobvista/sdk/m/b/a;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/b/a;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    .line 896
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->D:Lcom/mobvista/sdk/m/b/a;

    invoke-virtual {v1}, Lcom/mobvista/sdk/m/b/a;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 897
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->D:Lcom/mobvista/sdk/m/b/a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/b/a;->requestWindowFeature(I)Z

    .line 898
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->D:Lcom/mobvista/sdk/m/b/a;

    new-instance v1, Lcom/mobvista/sdk/m/core/i;

    invoke-direct {v1, p0}, Lcom/mobvista/sdk/m/core/i;-><init>(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)V

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/b/a;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 908
    :cond_2
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->D:Lcom/mobvista/sdk/m/b/a;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->d:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/b/a;->a(Lcom/mobvista/sdk/m/core/entity/CampaignEx;)V

    .line 909
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->D:Lcom/mobvista/sdk/m/b/a;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/b/a;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 910
    :catch_0
    move-exception v0

    .line 911
    const-string/jumbo v1, ""

    const-string/jumbo v2, "Exception"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method static synthetic j(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)V
    .locals 0

    .prologue
    .line 58
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->j()V

    return-void
.end method

.method private k()V
    .locals 3

    .prologue
    .line 917
    :try_start_0
    iget-boolean v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->F:Z

    if-eqz v0, :cond_1

    .line 927
    :cond_0
    :goto_0
    return-void

    .line 921
    :cond_1
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->D:Lcom/mobvista/sdk/m/b/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->D:Lcom/mobvista/sdk/m/b/a;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/b/a;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 922
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->D:Lcom/mobvista/sdk/m/b/a;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/b/a;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 924
    :catch_0
    move-exception v0

    .line 925
    const-string/jumbo v1, ""

    const-string/jumbo v2, "Exception"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method static synthetic k(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)V
    .locals 0

    .prologue
    .line 58
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->k()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 629
    new-instance v0, Landroid/content/Intent;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "com.mobvista.sdk.m.ACTION_ACT_ORDER"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->G:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->I:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 630
    const-string/jumbo v1, "ORDER"

    const-string/jumbo v2, "CLICK_CANCEL"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 631
    invoke-virtual {p0, v0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->sendBroadcast(Landroid/content/Intent;)V

    .line 632
    return-void
.end method

.method public final a(I)V
    .locals 4

    .prologue
    const/4 v3, 0x4

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 933
    iget v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->a:I

    if-eq p1, v0, :cond_1

    .line 934
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 936
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->f:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 938
    iget v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->a:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 939
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->e:Landroid/widget/LinearLayout;

    iget v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->a:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 941
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->f:Landroid/widget/LinearLayout;

    iget v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->a:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 945
    :cond_0
    iput p1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->a:I

    .line 947
    :cond_1
    return-void
.end method

.method public final a(Lcom/mobvista/sdk/m/core/entity/CampaignEx;)V
    .locals 3

    .prologue
    .line 620
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->d:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    .line 621
    new-instance v0, Landroid/content/Intent;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "com.mobvista.sdk.m.ACTION_ACT_ORDER"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->G:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->I:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 622
    const-string/jumbo v1, "ORDER"

    const-string/jumbo v2, "INSTALL"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 623
    const-string/jumbo v1, "CAMPAIGN"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 625
    invoke-virtual {p0, v0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->sendBroadcast(Landroid/content/Intent;)V

    .line 626
    return-void
.end method

.method protected finalize()V
    .locals 2

    .prologue
    .line 951
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 952
    const-string/jumbo v0, ""

    const-string/jumbo v1, "finalize adact"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 953
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 123
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 125
    if-eqz p1, :cond_0

    .line 126
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->finish()V

    .line 128
    :cond_0
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 129
    const-string/jumbo v1, "BUNDLE_UNITID"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->G:Ljava/lang/String;

    .line 130
    const-string/jumbo v1, "BUNDLE_FBID"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->H:Ljava/lang/String;

    .line 131
    const-string/jumbo v1, "BUNDLE_TAB"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->J:I

    .line 132
    const-string/jumbo v1, "BUNDLE_KEY"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->I:I

    .line 134
    new-instance v0, Lcom/mobvista/sdk/m/core/k;

    invoke-direct {v0, p0}, Lcom/mobvista/sdk/m/core/k;-><init>(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->b:Lcom/mobvista/sdk/m/core/k;

    .line 135
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->b:Lcom/mobvista/sdk/m/core/k;

    new-instance v1, Landroid/content/IntentFilter;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "com.mobvista.sdk.m.ACTION_LOAD_DATA"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->G:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 137
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 138
    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "LAODING_SHOW"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->G:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 139
    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "LAODING_DISMISSS"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->G:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 140
    new-instance v1, Lcom/mobvista/sdk/m/core/j;

    invoke-direct {v1, p0}, Lcom/mobvista/sdk/m/core/j;-><init>(Lcom/mobvista/sdk/m/core/AdMobvistaAct;)V

    iput-object v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->c:Lcom/mobvista/sdk/m/core/j;

    .line 141
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->c:Lcom/mobvista/sdk/m/core/j;

    invoke-virtual {p0, v1, v0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 143
    invoke-static {p0}, Lcom/mobvista/sdk/m/core/c/f;->a(Landroid/content/Context;)Lcom/mobvista/sdk/m/core/c/f;

    move-result-object v0

    .line 144
    invoke-static {v0}, Lcom/mobvista/sdk/m/core/c/b;->a(Lcom/mobvista/sdk/m/a/a/a/a;)Lcom/mobvista/sdk/m/core/c/b;

    move-result-object v0

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->C:Lcom/mobvista/sdk/m/core/c/b;

    .line 145
    const-string/jumbo v0, "deleted"

    const-string/jumbo v1, "oncreate"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 146
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->C:Lcom/mobvista/sdk/m/core/c/b;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/c/b;->b()V

    .line 149
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->requestWindowFeature(I)Z

    .line 152
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->getWindow()Landroid/view/Window;

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const v2, -0x1a1f29

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 153
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->h()V

    .line 154
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->f()V

    .line 155
    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 828
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 829
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->F:Z

    .line 830
    invoke-static {}, Lcom/mobvista/sdk/m/a/e/a;->a()Lcom/mobvista/sdk/m/a/e/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/a/e/a;->b()V

    .line 831
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->m:Lcom/mobvista/sdk/m/core/a/b;

    if-eqz v0, :cond_0

    .line 832
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->m:Lcom/mobvista/sdk/m/core/a/b;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/a/b;->a()V

    .line 834
    :cond_0
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->g()V

    .line 835
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->b:Lcom/mobvista/sdk/m/core/k;

    invoke-virtual {p0, v0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 836
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->c:Lcom/mobvista/sdk/m/core/j;

    invoke-virtual {p0, v0}, Lcom/mobvista/sdk/m/core/AdMobvistaAct;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 837
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 160
    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 161
    return-void
.end method
