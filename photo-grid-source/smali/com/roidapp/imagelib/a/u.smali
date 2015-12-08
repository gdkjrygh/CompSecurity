.class final Lcom/roidapp/imagelib/a/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:I

.field final synthetic b:I

.field final synthetic c:Lcom/roidapp/imagelib/a/i;

.field private d:F

.field private e:I

.field private f:I

.field private g:F

.field private h:F


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/a/i;II)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 638
    iput-object p1, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    iput p2, p0, Lcom/roidapp/imagelib/a/u;->a:I

    iput p3, p0, Lcom/roidapp/imagelib/a/u;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 640
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/roidapp/imagelib/a/u;->d:F

    .line 641
    iput v1, p0, Lcom/roidapp/imagelib/a/u;->e:I

    .line 642
    iput v1, p0, Lcom/roidapp/imagelib/a/u;->f:I

    .line 644
    const/high16 v0, 0x41200000    # 10.0f

    iput v0, p0, Lcom/roidapp/imagelib/a/u;->h:F

    return-void
.end method

.method private static a(Landroid/view/MotionEvent;)F
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 647
    invoke-virtual {p0, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    invoke-virtual {p0, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    sub-float/2addr v0, v1

    .line 648
    invoke-virtual {p0, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    invoke-virtual {p0, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v2

    sub-float/2addr v1, v2

    .line 649
    mul-float/2addr v0, v0

    mul-float/2addr v1, v1

    add-float/2addr v0, v1

    invoke-static {v0}, Landroid/util/FloatMath;->sqrt(F)F

    move-result v0

    return v0
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 12

    .prologue
    const-wide/16 v10, 0x7d0

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 655
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    :pswitch_0
    move v0, v2

    .line 758
    :goto_1
    return v0

    .line 658
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->k(Lcom/roidapp/imagelib/a/i;)Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    .line 659
    goto :goto_1

    .line 660
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->l(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/ah;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->l(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/a/ah;->k()Z

    move-result v0

    if-nez v0, :cond_2

    .line 661
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->l(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/ah;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 662
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->l(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/a/ah;->g()V

    .line 665
    :cond_2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/a/u;->g:F

    .line 666
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0, v1}, Lcom/roidapp/imagelib/a/i;->b(Lcom/roidapp/imagelib/a/i;Z)Z

    goto :goto_0

    .line 669
    :pswitch_2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    .line 670
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    .line 671
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->l(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/ah;

    move-result-object v0

    if-nez v0, :cond_3

    move v0, v1

    .line 672
    goto :goto_1

    .line 673
    :cond_3
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->l(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/a/ah;->o()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->k(Lcom/roidapp/imagelib/a/i;)Z

    move-result v0

    if-nez v0, :cond_4

    iget v0, p0, Lcom/roidapp/imagelib/a/u;->e:I

    if-ne v0, v2, :cond_5

    .line 674
    :cond_4
    iput v1, p0, Lcom/roidapp/imagelib/a/u;->e:I

    move v0, v1

    .line 675
    goto :goto_1

    .line 677
    :cond_5
    iget v0, p0, Lcom/roidapp/imagelib/a/u;->g:F

    sub-float v0, v3, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v5, p0, Lcom/roidapp/imagelib/a/u;->h:F

    cmpg-float v0, v0, v5

    if-gez v0, :cond_c

    .line 678
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->l(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/ah;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 680
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->m(Lcom/roidapp/imagelib/a/i;)J

    move-result-wide v8

    sub-long/2addr v6, v8

    cmp-long v0, v6, v10

    if-gtz v0, :cond_6

    move v0, v2

    .line 681
    goto/16 :goto_1

    .line 684
    :cond_6
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->l(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/a/ah;->k()Z

    move-result v0

    if-nez v0, :cond_9

    .line 685
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->n(Lcom/roidapp/imagelib/a/i;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 686
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->n(Lcom/roidapp/imagelib/a/i;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v5, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v5}, Lcom/roidapp/imagelib/a/i;->o(Lcom/roidapp/imagelib/a/i;)Landroid/view/animation/Animation;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 687
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->l(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/ah;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Lcom/roidapp/imagelib/a/ah;->a(FF)V

    .line 688
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->n(Lcom/roidapp/imagelib/a/i;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 691
    iget v5, p0, Lcom/roidapp/imagelib/a/u;->a:I

    div-int/lit8 v5, v5, 0x2

    int-to-float v5, v5

    sub-float/2addr v3, v5

    float-to-int v3, v3

    iput v3, v0, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 692
    iget v3, p0, Lcom/roidapp/imagelib/a/u;->b:I

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    sub-float v3, v4, v3

    float-to-int v3, v3

    iput v3, v0, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 693
    iget v3, v0, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    iget v4, p0, Lcom/roidapp/imagelib/a/u;->a:I

    add-int/2addr v3, v4

    iget-object v4, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v4}, Lcom/roidapp/imagelib/a/i;->p(Lcom/roidapp/imagelib/a/i;)I

    move-result v4

    if-le v3, v4, :cond_7

    .line 694
    iget-object v3, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v3}, Lcom/roidapp/imagelib/a/i;->p(Lcom/roidapp/imagelib/a/i;)I

    move-result v3

    iget v4, v0, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    iget v5, p0, Lcom/roidapp/imagelib/a/u;->a:I

    add-int/2addr v4, v5

    sub-int/2addr v3, v4

    iput v3, v0, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I

    .line 696
    :cond_7
    iget v3, v0, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    iget v4, p0, Lcom/roidapp/imagelib/a/u;->b:I

    add-int/2addr v3, v4

    iget-object v4, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v4}, Lcom/roidapp/imagelib/a/i;->q(Lcom/roidapp/imagelib/a/i;)I

    move-result v4

    if-le v3, v4, :cond_8

    .line 697
    iget-object v3, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v3}, Lcom/roidapp/imagelib/a/i;->q(Lcom/roidapp/imagelib/a/i;)I

    move-result v3

    iget v4, v0, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    iget v5, p0, Lcom/roidapp/imagelib/a/u;->b:I

    add-int/2addr v4, v5

    sub-int/2addr v3, v4

    iput v3, v0, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    .line 700
    :cond_8
    iget-object v3, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v3}, Lcom/roidapp/imagelib/a/i;->n(Lcom/roidapp/imagelib/a/i;)Landroid/widget/ImageView;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 701
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->s(Lcom/roidapp/imagelib/a/i;)Landroid/os/Handler;

    move-result-object v0

    iget-object v3, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v3}, Lcom/roidapp/imagelib/a/i;->r(Lcom/roidapp/imagelib/a/i;)Ljava/lang/Runnable;

    move-result-object v3

    const-wide/16 v4, 0x12c

    invoke-virtual {v0, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 703
    :cond_9
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->l(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/a/ah;->j()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 704
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->t(Lcom/roidapp/imagelib/a/i;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 705
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->t(Lcom/roidapp/imagelib/a/i;)Landroid/widget/RelativeLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v1}, Lcom/roidapp/imagelib/a/i;->o(Lcom/roidapp/imagelib/a/i;)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 706
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->s(Lcom/roidapp/imagelib/a/i;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v1}, Lcom/roidapp/imagelib/a/i;->u(Lcom/roidapp/imagelib/a/i;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1, v10, v11}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 708
    :cond_a
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {v0, v4, v5}, Lcom/roidapp/imagelib/a/i;->a(Lcom/roidapp/imagelib/a/i;J)J

    .line 720
    :cond_b
    :goto_2
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->s(Lcom/roidapp/imagelib/a/i;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v1}, Lcom/roidapp/imagelib/a/i;->v(Lcom/roidapp/imagelib/a/i;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1, v10, v11}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_0

    .line 711
    :cond_c
    iget v0, p0, Lcom/roidapp/imagelib/a/u;->g:F

    sub-float v0, v3, v0

    iget v4, p0, Lcom/roidapp/imagelib/a/u;->h:F

    cmpl-float v0, v0, v4

    if-lez v0, :cond_d

    .line 712
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->h(Lcom/roidapp/imagelib/a/i;)Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->isShown()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 713
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->c(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/filter/FilterListView;

    move-result-object v0

    sget-object v1, Lcom/roidapp/imagelib/a/h;->j:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    sget-object v3, Lcom/roidapp/imagelib/a/h;->k:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    invoke-virtual {v0, v1, v3, v2}, Lcom/roidapp/imagelib/filter/FilterListView;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;Z)V

    goto :goto_2

    .line 715
    :cond_d
    iget v0, p0, Lcom/roidapp/imagelib/a/u;->g:F

    sub-float v0, v3, v0

    iget v3, p0, Lcom/roidapp/imagelib/a/u;->h:F

    neg-float v3, v3

    cmpg-float v0, v0, v3

    if-gez v0, :cond_b

    .line 716
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->h(Lcom/roidapp/imagelib/a/i;)Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->isShown()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 717
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->c(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/filter/FilterListView;

    move-result-object v0

    sget-object v3, Lcom/roidapp/imagelib/a/h;->j:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    sget-object v4, Lcom/roidapp/imagelib/a/h;->k:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    invoke-virtual {v0, v3, v4, v1}, Lcom/roidapp/imagelib/filter/FilterListView;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;Z)V

    goto :goto_2

    .line 723
    :pswitch_3
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->l(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/ah;

    move-result-object v0

    if-eqz v0, :cond_e

    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->l(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/a/ah;->j()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 724
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->s(Lcom/roidapp/imagelib/a/i;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v1}, Lcom/roidapp/imagelib/a/i;->u(Lcom/roidapp/imagelib/a/i;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1, v10, v11}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 726
    :cond_e
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->s(Lcom/roidapp/imagelib/a/i;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v1}, Lcom/roidapp/imagelib/a/i;->v(Lcom/roidapp/imagelib/a/i;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1, v10, v11}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_0

    .line 729
    :pswitch_4
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->l(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/ah;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 730
    invoke-static {p2}, Lcom/roidapp/imagelib/a/u;->a(Landroid/view/MotionEvent;)F

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/a/u;->d:F

    .line 731
    iput v2, p0, Lcom/roidapp/imagelib/a/u;->e:I

    .line 732
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->l(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/a/ah;->h()I

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/a/u;->f:I

    .line 733
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->l(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/a/ah;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 734
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->t(Lcom/roidapp/imagelib/a/i;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 735
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->t(Lcom/roidapp/imagelib/a/i;)Landroid/widget/RelativeLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v1}, Lcom/roidapp/imagelib/a/i;->o(Lcom/roidapp/imagelib/a/i;)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    goto/16 :goto_0

    .line 740
    :pswitch_5
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->l(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/ah;

    move-result-object v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/roidapp/imagelib/a/u;->e:I

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->l(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/a/ah;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_0

    .line 741
    invoke-static {p2}, Lcom/roidapp/imagelib/a/u;->a(Landroid/view/MotionEvent;)F

    move-result v0

    .line 742
    iget v1, p0, Lcom/roidapp/imagelib/a/u;->d:F

    div-float/2addr v0, v1

    .line 744
    iget-object v1, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v1}, Lcom/roidapp/imagelib/a/i;->l(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/ah;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/imagelib/a/ah;->i()I

    move-result v1

    int-to-float v1, v1

    const/high16 v3, 0x41200000    # 10.0f

    div-float/2addr v1, v3

    .line 745
    const/high16 v3, 0x3f800000    # 1.0f

    cmpl-float v3, v0, v3

    if-ltz v3, :cond_f

    .line 746
    iget v3, p0, Lcom/roidapp/imagelib/a/u;->f:I

    int-to-float v3, v3

    mul-float/2addr v0, v1

    add-float/2addr v0, v3

    .line 750
    :goto_3
    iget-object v1, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v1}, Lcom/roidapp/imagelib/a/i;->l(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/ah;

    move-result-object v1

    float-to-int v0, v0

    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/a/ah;->a(I)V

    .line 751
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->l(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/a/ah;->h()I

    move-result v0

    sput v0, Lcom/roidapp/imagelib/a/h;->i:I

    .line 752
    iget-object v0, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->w(Lcom/roidapp/imagelib/a/i;)Landroid/widget/SeekBar;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/imagelib/a/u;->c:Lcom/roidapp/imagelib/a/i;

    invoke-static {v1}, Lcom/roidapp/imagelib/a/i;->l(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/ah;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/imagelib/a/ah;->h()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    goto/16 :goto_0

    .line 748
    :cond_f
    iget v3, p0, Lcom/roidapp/imagelib/a/u;->f:I

    int-to-float v3, v3

    div-float v0, v1, v0

    sub-float v0, v3, v0

    goto :goto_3

    .line 655
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_5
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method
