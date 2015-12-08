.class final Lcom/roidapp/photogrid/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/k;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/k;)V
    .locals 0

    .prologue
    .line 456
    iput-object p1, p0, Lcom/roidapp/photogrid/l;->a:Lcom/roidapp/photogrid/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 10

    .prologue
    const/4 v3, 0x5

    const/4 v9, 0x1

    const/4 v8, 0x0

    const-wide/16 v6, 0x1

    .line 459
    iget-object v0, p0, Lcom/roidapp/photogrid/l;->a:Lcom/roidapp/photogrid/k;

    invoke-static {v0}, Lcom/roidapp/photogrid/k;->a(Lcom/roidapp/photogrid/k;)Lcom/roidapp/photogrid/MainPage;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/l;->a:Lcom/roidapp/photogrid/k;

    invoke-static {v0}, Lcom/roidapp/photogrid/k;->a(Lcom/roidapp/photogrid/k;)Lcom/roidapp/photogrid/MainPage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 512
    :cond_0
    :goto_0
    return-void

    .line 460
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 496
    :sswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/l;->a:Lcom/roidapp/photogrid/k;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/k;->getActivity()Landroid/support/v4/app/FragmentActivity;

    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/PopularUser/Click"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 497
    iget-object v0, p0, Lcom/roidapp/photogrid/l;->a:Lcom/roidapp/photogrid/k;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/k;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "SNS"

    const-string v2, "click"

    const-string v3, "SNS/PopularUser/Click"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 498
    iget-object v0, p0, Lcom/roidapp/photogrid/l;->a:Lcom/roidapp/photogrid/k;

    new-instance v1, Lcom/roidapp/cloudlib/sns/c/c;

    invoke-direct {v1}, Lcom/roidapp/cloudlib/sns/c/c;-><init>()V

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/k;->a(Lcom/roidapp/cloudlib/sns/main/b;)V

    goto :goto_0

    .line 462
    :sswitch_1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/template/TemplateInfo;

    .line 463
    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->a()Lcom/roidapp/cloudlib/template/b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/template/b;->c(Lcom/roidapp/cloudlib/template/TemplateInfo;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 464
    const-string v1, "MainPage_template_card"

    const/4 v2, 0x3

    invoke-static {v1, v2, v3}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;II)V

    .line 465
    iget-object v1, p0, Lcom/roidapp/photogrid/l;->a:Lcom/roidapp/photogrid/k;

    invoke-static {v1}, Lcom/roidapp/photogrid/k;->e(Lcom/roidapp/photogrid/k;)Lcom/roidapp/cloudlib/template/b/c;

    move-result-object v1

    const/16 v2, 0x2324

    invoke-static {v1, v2, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    .line 468
    :cond_2
    const-string v1, "MainPage_template_card"

    const/4 v2, 0x2

    invoke-static {v1, v2, v3}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;II)V

    .line 471
    const v1, 0x7f0d0120

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 472
    const v2, 0x7f0d0121

    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ProgressBar;

    .line 473
    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 474
    invoke-virtual {v2, v8}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 477
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/template/j;->c(J)V

    .line 479
    invoke-static {}, Lcom/roidapp/cloudlib/ads/s;->d()Z

    .line 481
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 482
    const/16 v1, 0x2319

    iput v1, v0, Landroid/os/Message;->what:I

    .line 483
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 484
    iget-object v1, p0, Lcom/roidapp/photogrid/l;->a:Lcom/roidapp/photogrid/k;

    invoke-static {v1}, Lcom/roidapp/photogrid/k;->e(Lcom/roidapp/photogrid/k;)Lcom/roidapp/cloudlib/template/b/c;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/template/b/c;->sendMessage(Landroid/os/Message;)Z

    .line 485
    invoke-virtual {p1, v8}, Landroid/view/View;->setEnabled(Z)V

    goto/16 :goto_0

    .line 489
    :sswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/l;->a:Lcom/roidapp/photogrid/k;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/k;->getActivity()Landroid/support/v4/app/FragmentActivity;

    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/PopularPost/Click"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 490
    iget-object v0, p0, Lcom/roidapp/photogrid/l;->a:Lcom/roidapp/photogrid/k;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/k;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "SNS"

    const-string v2, "click"

    const-string v3, "SNS/PopularPost/Click"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 491
    new-instance v0, Lcom/roidapp/cloudlib/sns/topic/a/b;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/sns/topic/a/b;-><init>()V

    .line 492
    iget-object v1, p0, Lcom/roidapp/photogrid/l;->a:Lcom/roidapp/photogrid/k;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/k;->a(Lcom/roidapp/cloudlib/sns/main/b;)V

    goto/16 :goto_0

    .line 502
    :sswitch_3
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 503
    iget-object v1, p0, Lcom/roidapp/photogrid/l;->a:Lcom/roidapp/photogrid/k;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/k;->getActivity()Landroid/support/v4/app/FragmentActivity;

    const-string v1, "SNS"

    const-string v2, "click"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "SNS/PopularTags/Click/"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v4, v0, v8

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v1, v2, v3}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 504
    iget-object v1, p0, Lcom/roidapp/photogrid/l;->a:Lcom/roidapp/photogrid/k;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/k;->getActivity()Landroid/support/v4/app/FragmentActivity;

    const-string v1, "SNS"

    const-string v2, "click"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "SNS/PopularTagsColor/Click/"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v4, v0, v9

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v1, v2, v3}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 505
    iget-object v1, p0, Lcom/roidapp/photogrid/l;->a:Lcom/roidapp/photogrid/k;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/k;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, "SNS"

    const-string v3, "click"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "SNS/PopularTags/Click/"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v5, v0, v8

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {v1, v2, v3, v4, v5}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 506
    iget-object v1, p0, Lcom/roidapp/photogrid/l;->a:Lcom/roidapp/photogrid/k;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/k;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, "SNS"

    const-string v3, "click"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "SNS/PopularTagsColor/Click/"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v5, v0, v9

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {v1, v2, v3, v4, v5}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 507
    new-instance v1, Lcom/roidapp/cloudlib/sns/topic/e;

    invoke-direct {v1}, Lcom/roidapp/cloudlib/sns/topic/e;-><init>()V

    .line 508
    aget-object v0, v0, v8

    const-string v2, "Explore_Hashtag_%s_Page"

    invoke-virtual {v1, v0, v2}, Lcom/roidapp/cloudlib/sns/topic/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 509
    iget-object v0, p0, Lcom/roidapp/photogrid/l;->a:Lcom/roidapp/photogrid/k;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/k;->a(Lcom/roidapp/cloudlib/sns/main/b;)V

    goto/16 :goto_0

    .line 460
    :sswitch_data_0
    .sparse-switch
        0x7f0d0000 -> :sswitch_0
        0x7f0d0001 -> :sswitch_2
        0x7f0d011a -> :sswitch_3
        0x7f0d011f -> :sswitch_1
    .end sparse-switch
.end method
