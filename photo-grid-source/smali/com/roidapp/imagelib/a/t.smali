.class final Lcom/roidapp/imagelib/a/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/imagelib/filter/l;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/a/i;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/a/i;)V
    .locals 0

    .prologue
    .line 545
    iput-object p1, p0, Lcom/roidapp/imagelib/a/t;->a:Lcom/roidapp/imagelib/a/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/String;)V
    .locals 6

    .prologue
    const/16 v2, 0x8

    const/4 v1, 0x0

    .line 548
    if-nez p1, :cond_2

    .line 549
    iget-object v0, p0, Lcom/roidapp/imagelib/a/t;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->f(Lcom/roidapp/imagelib/a/i;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 556
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/a/t;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->g(Lcom/roidapp/imagelib/a/i;)Landroid/widget/SeekBar;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/SeekBar;->setVisibility(I)V

    .line 559
    :goto_0
    iget-object v0, p0, Lcom/roidapp/imagelib/a/t;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->g(Lcom/roidapp/imagelib/a/i;)Landroid/widget/SeekBar;

    move-result-object v0

    sget v2, Lcom/roidapp/imagelib/a/h;->h:I

    invoke-virtual {v0, v2}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 560
    iget-object v0, p0, Lcom/roidapp/imagelib/a/t;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->i(Lcom/roidapp/imagelib/a/i;)Landroid/widget/CheckedTextView;

    move-result-object v2

    if-lez p1, :cond_3

    const/4 v0, 0x1

    :goto_1
    invoke-virtual {v2, v0}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    .line 561
    iget-object v0, p0, Lcom/roidapp/imagelib/a/t;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->d(Lcom/roidapp/imagelib/a/i;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->isShown()Z

    move-result v0

    if-nez v0, :cond_1

    .line 562
    iget-object v0, p0, Lcom/roidapp/imagelib/a/t;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->d(Lcom/roidapp/imagelib/a/i;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 563
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/a/t;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->d(Lcom/roidapp/imagelib/a/i;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/roidapp/imagelib/c;->b:I

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 564
    iget-object v1, p0, Lcom/roidapp/imagelib/a/t;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v1}, Lcom/roidapp/imagelib/a/i;->d(Lcom/roidapp/imagelib/a/i;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 565
    iget-object v1, p0, Lcom/roidapp/imagelib/a/t;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v1}, Lcom/roidapp/imagelib/a/i;->d(Lcom/roidapp/imagelib/a/i;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/TextView;->clearAnimation()V

    .line 566
    iget-object v1, p0, Lcom/roidapp/imagelib/a/t;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v1}, Lcom/roidapp/imagelib/a/i;->d(Lcom/roidapp/imagelib/a/i;)Landroid/widget/TextView;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/imagelib/a/t;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v2}, Lcom/roidapp/imagelib/a/i;->j(Lcom/roidapp/imagelib/a/i;)Ljava/lang/Runnable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 567
    iget-object v1, p0, Lcom/roidapp/imagelib/a/t;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v1}, Lcom/roidapp/imagelib/a/i;->d(Lcom/roidapp/imagelib/a/i;)Landroid/widget/TextView;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/imagelib/a/t;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v2}, Lcom/roidapp/imagelib/a/i;->j(Lcom/roidapp/imagelib/a/i;)Ljava/lang/Runnable;

    move-result-object v2

    const-wide/16 v4, 0x5dc

    invoke-virtual {v1, v2, v4, v5}, Landroid/widget/TextView;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 568
    iget-object v1, p0, Lcom/roidapp/imagelib/a/t;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v1}, Lcom/roidapp/imagelib/a/i;->d(Lcom/roidapp/imagelib/a/i;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 569
    return-void

    .line 551
    :cond_2
    iget-object v0, p0, Lcom/roidapp/imagelib/a/t;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->h(Lcom/roidapp/imagelib/a/i;)Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 553
    iget-object v0, p0, Lcom/roidapp/imagelib/a/t;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->g(Lcom/roidapp/imagelib/a/i;)Landroid/widget/SeekBar;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setVisibility(I)V

    goto/16 :goto_0

    :cond_3
    move v0, v1

    .line 560
    goto :goto_1
.end method

.method public final a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V
    .locals 2

    .prologue
    .line 583
    invoke-interface {p2}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->a()I

    move-result v0

    sput v0, Lcom/roidapp/imagelib/a/h;->d:I

    .line 584
    const/16 v0, 0x64

    sput v0, Lcom/roidapp/imagelib/a/h;->h:I

    .line 585
    sput-object p1, Lcom/roidapp/imagelib/a/h;->j:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 586
    sput-object p2, Lcom/roidapp/imagelib/a/h;->k:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 588
    iget-object v0, p0, Lcom/roidapp/imagelib/a/t;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->a(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/a;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/roidapp/imagelib/a/a;->a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 589
    iget-object v0, p0, Lcom/roidapp/imagelib/a/t;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->a(Lcom/roidapp/imagelib/a/i;)Lcom/roidapp/imagelib/a/a;

    move-result-object v0

    sget v1, Lcom/roidapp/imagelib/a/h;->h:I

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/a/a;->c(I)V

    .line 590
    return-void
.end method

.method public final a(Z)V
    .locals 2

    .prologue
    .line 573
    if-eqz p1, :cond_0

    .line 574
    iget-object v0, p0, Lcom/roidapp/imagelib/a/t;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->g(Lcom/roidapp/imagelib/a/i;)Landroid/widget/SeekBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setVisibility(I)V

    .line 579
    :goto_0
    return-void

    .line 576
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/a/t;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->g(Lcom/roidapp/imagelib/a/i;)Landroid/widget/SeekBar;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setVisibility(I)V

    goto :goto_0
.end method
