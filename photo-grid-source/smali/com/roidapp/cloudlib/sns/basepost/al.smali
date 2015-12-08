.class final Lcom/roidapp/cloudlib/sns/basepost/al;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/sns/basepost/at;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/basepost/ad;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/ad;)V
    .locals 0

    .prologue
    .line 438
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/al;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 9

    .prologue
    const-wide/16 v6, 0x1

    .line 492
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/al;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->getActivity()Landroid/support/v4/app/FragmentActivity;

    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/Comment/Send/Failed/Cancel"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 493
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/al;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/basepost/ad;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "SNS/Comment/Send/Failed/Cancel"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 496
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/al;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->i(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/HashSet;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/al;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->i(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/HashSet;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 497
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/al;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->i(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/HashSet;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 499
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/al;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->j(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 500
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    .line 501
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/al;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->j(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/a;

    .line 502
    iget-wide v4, v0, Lcom/roidapp/cloudlib/sns/b/a;->a:J

    cmp-long v0, v4, p1

    if-nez v0, :cond_2

    .line 503
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/al;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->j(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 507
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/al;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->k(Lcom/roidapp/cloudlib/sns/basepost/ad;)V

    .line 511
    :cond_1
    return-void

    .line 500
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method public final a(JLjava/lang/String;)V
    .locals 9

    .prologue
    const-wide/16 v6, 0x1

    .line 473
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/al;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->getActivity()Landroid/support/v4/app/FragmentActivity;

    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/Comment/Send/Failed/Retry"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 474
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/al;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/basepost/ad;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "SNS/Comment/Send/Failed/Retry"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 475
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/al;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0, p1, p2, p3}, Lcom/roidapp/cloudlib/sns/basepost/ad;->a(Lcom/roidapp/cloudlib/sns/basepost/ad;JLjava/lang/String;)V

    .line 477
    return-void
.end method

.method public final a(Lcom/roidapp/cloudlib/sns/b/x;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 442
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/al;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->e(Lcom/roidapp/cloudlib/sns/basepost/ad;)V

    .line 443
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/al;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->f(Lcom/roidapp/cloudlib/sns/basepost/ad;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 444
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/al;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->g(Lcom/roidapp/cloudlib/sns/basepost/ad;)V

    .line 446
    :cond_0
    if-eqz p1, :cond_2

    .line 447
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/al;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->h(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/b/x;

    move-result-object v0

    iget-wide v0, v0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-wide v2, p1, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 448
    iget-wide v0, p1, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-object v2, p1, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/sns/h/h;->a(JLjava/lang/String;Ljava/lang/String;)Lcom/roidapp/cloudlib/sns/h/h;

    move-result-object v0

    .line 449
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/h/h;->C()V

    .line 450
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/al;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->a(Lcom/roidapp/cloudlib/sns/main/b;)V

    .line 469
    :goto_0
    return-void

    .line 452
    :cond_1
    iget-wide v0, p1, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-object v2, p1, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/sns/h/h;->a(JLjava/lang/String;Ljava/lang/String;)Lcom/roidapp/cloudlib/sns/h/h;

    move-result-object v0

    .line 453
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/h/h;->C()V

    .line 454
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/al;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->a(Lcom/roidapp/cloudlib/sns/main/b;)V

    goto :goto_0

    .line 458
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/al;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->h(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/b/x;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 463
    invoke-static {p2}, Lcom/roidapp/cloudlib/sns/h/h;->b(Ljava/lang/String;)Lcom/roidapp/cloudlib/sns/h/h;

    move-result-object v0

    .line 464
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/h/h;->C()V

    .line 465
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/al;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->a(Lcom/roidapp/cloudlib/sns/main/b;)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 481
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/al;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->e(Lcom/roidapp/cloudlib/sns/basepost/ad;)V

    .line 482
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/al;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->f(Lcom/roidapp/cloudlib/sns/basepost/ad;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 483
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/al;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->g(Lcom/roidapp/cloudlib/sns/basepost/ad;)V

    .line 485
    :cond_0
    new-instance v0, Lcom/roidapp/cloudlib/sns/topic/e;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/sns/topic/e;-><init>()V

    .line 486
    const-string v1, "Comment_[tag]_Page"

    invoke-virtual {v0, p1, v1}, Lcom/roidapp/cloudlib/sns/topic/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 487
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/al;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->a(Lcom/roidapp/cloudlib/sns/main/b;)V

    .line 488
    return-void
.end method

.method public final b(J)Z
    .locals 3

    .prologue
    .line 515
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/al;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->i(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/HashSet;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/al;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->i(Lcom/roidapp/cloudlib/sns/basepost/ad;)Ljava/util/HashSet;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
