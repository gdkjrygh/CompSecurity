.class final Lcom/roidapp/photogrid/cloud/az;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/sns/upload/j;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/PGShareActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;)V
    .locals 0

    .prologue
    .line 566
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/az;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 570
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/upload/e;->b()I

    .line 571
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/az;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/upload/e;->c()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->a(Ljava/util/Collection;)V

    .line 572
    return-void
.end method

.method public final a(JI)V
    .locals 5

    .prologue
    const/16 v4, 0x8

    const/4 v3, 0x0

    .line 581
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/az;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->k(Lcom/roidapp/photogrid/cloud/PGShareActivity;)J

    move-result-wide v0

    cmp-long v0, v0, p1

    if-nez v0, :cond_2

    .line 582
    if-nez p3, :cond_0

    .line 583
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/az;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->g(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 584
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/az;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->l(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 585
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/az;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->m(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 586
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/az;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->m(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 587
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/az;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->l(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 588
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/az;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->n(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/az;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    const v2, 0x7f0700fa

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 589
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/az;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->n(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v0, v3, v3, v3}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/TextView;III)Z

    .line 612
    :goto_0
    return-void

    .line 592
    :cond_0
    const/16 v0, 0x64

    if-ge p3, v0, :cond_1

    .line 593
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/az;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->m(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/widget/ProgressBar;->setProgress(I)V

    goto :goto_0

    .line 596
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/az;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/az;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    const v2, 0x7f0700c1

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 597
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/az;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->n(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/az;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    const v2, 0x7f070060

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 598
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/az;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->n(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f020370

    invoke-static {v0, v1, v3, v3}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/TextView;III)Z

    .line 599
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/az;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    sget v1, Lcom/roidapp/cloudlib/sns/upload/b;->c:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->c(Lcom/roidapp/photogrid/cloud/PGShareActivity;I)I

    .line 600
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/az;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->g(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 601
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/az;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->l(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 602
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/az;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->m(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 603
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/az;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->l(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const v1, 0x7f0200c9

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 604
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/az;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->o(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/ScrollView;

    move-result-object v0

    invoke-virtual {v0, v3, v3}, Landroid/widget/ScrollView;->smoothScrollBy(II)V

    .line 605
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/az;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->o(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/ScrollView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ScrollView;->requestLayout()V

    goto :goto_0

    .line 609
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/az;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0, p1, p2, p3}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->a(Lcom/roidapp/photogrid/cloud/PGShareActivity;JI)Z

    goto/16 :goto_0
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 576
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/az;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/upload/e;->c()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->a(Ljava/util/Collection;)V

    .line 577
    return-void
.end method
