.class public final Landroid/support/v7/widget/RecyclerView$m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "m"
.end annotation


# instance fields
.field final a:Ljava/util/ArrayList;

.field final b:Ljava/util/ArrayList;

.field final synthetic c:Landroid/support/v7/widget/RecyclerView;

.field private d:Ljava/util/ArrayList;

.field private final e:Ljava/util/List;

.field private f:I

.field private g:Landroid/support/v7/widget/RecyclerView$l;

.field private h:Landroid/support/v7/widget/RecyclerView$r;


# direct methods
.method public constructor <init>(Landroid/support/v7/widget/RecyclerView;)V
    .locals 1

    .prologue
    .line 4151
    iput-object p1, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4152
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->a:Ljava/util/ArrayList;

    .line 4153
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->d:Ljava/util/ArrayList;

    .line 4155
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->b:Ljava/util/ArrayList;

    .line 4157
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->a:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->e:Ljava/util/List;

    .line 4160
    const/4 v0, 0x2

    iput v0, p0, Landroid/support/v7/widget/RecyclerView$m;->f:I

    return-void
.end method

.method static synthetic a(Landroid/support/v7/widget/RecyclerView$m;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 4151
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->d:Ljava/util/ArrayList;

    return-object v0
.end method

.method private a(Landroid/view/ViewGroup;Z)V
    .locals 4

    .prologue
    const/4 v3, 0x4

    .line 4478
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_1

    .line 4479
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 4480
    instance-of v2, v0, Landroid/view/ViewGroup;

    if-eqz v2, :cond_0

    .line 4481
    check-cast v0, Landroid/view/ViewGroup;

    const/4 v2, 0x1

    invoke-direct {p0, v0, v2}, Landroid/support/v7/widget/RecyclerView$m;->a(Landroid/view/ViewGroup;Z)V

    .line 4478
    :cond_0
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 4484
    :cond_1
    if-nez p2, :cond_2

    .line 4496
    :goto_1
    return-void

    .line 4488
    :cond_2
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    if-ne v0, v3, :cond_3

    .line 4489
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 4490
    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_1

    .line 4492
    :cond_3
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    .line 4493
    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 4494
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_1
.end method

.method private c(Landroid/support/v7/widget/RecyclerView$t;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 4627
    iget-object v0, p1, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    invoke-static {v0, v1}, Landroid/support/v4/view/ViewCompat;->setAccessibilityDelegate(Landroid/view/View;Landroid/support/v4/view/AccessibilityDelegateCompat;)V

    .line 4628
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->p(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$n;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->p(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$n;

    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$a;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$a;

    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/RecyclerView$q;->a(Landroid/support/v7/widget/RecyclerView$t;)V

    .line 4629
    :cond_2
    iput-object v1, p1, Landroid/support/v7/widget/RecyclerView$t;->i:Landroid/support/v7/widget/RecyclerView;

    .line 4630
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView$m;->d()Landroid/support/v7/widget/RecyclerView$l;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/RecyclerView$l;->a(Landroid/support/v7/widget/RecyclerView$t;)V

    .line 4631
    return-void
.end method

.method private d(I)Landroid/support/v7/widget/RecyclerView$t;
    .locals 11

    .prologue
    const/4 v1, 0x0

    const/16 v10, 0x20

    const/4 v2, 0x0

    .line 4703
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->d:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-nez v4, :cond_1

    :cond_0
    move-object v0, v1

    .line 4728
    :goto_0
    return-object v0

    :cond_1
    move v3, v2

    .line 4707
    :goto_1
    if-ge v3, v4, :cond_3

    .line 4708
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$t;

    .line 4709
    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->f()Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->c()I

    move-result v5

    if-ne v5, p1, :cond_2

    .line 4710
    invoke-virtual {v0, v10}, Landroid/support/v7/widget/RecyclerView$t;->b(I)V

    goto :goto_0

    .line 4707
    :cond_2
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    .line 4715
    :cond_3
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$a;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$a;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 4716
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->b:Landroid/support/v7/widget/a;

    invoke-virtual {v0, p1, v2}, Landroid/support/v7/widget/a;->a(II)I

    move-result v0

    .line 4717
    if-lez v0, :cond_5

    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v3}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$a;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v7/widget/RecyclerView$a;->a()I

    move-result v3

    if-ge v0, v3, :cond_5

    .line 4718
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$a;

    .line 4719
    :goto_2
    if-ge v2, v4, :cond_5

    .line 4720
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$t;

    .line 4721
    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->f()Z

    move-result v3

    if-nez v3, :cond_4

    iget-wide v6, v0, Landroid/support/v7/widget/RecyclerView$t;->d:J

    const-wide/16 v8, -0x1

    cmp-long v3, v6, v8

    if-nez v3, :cond_4

    .line 4722
    invoke-virtual {v0, v10}, Landroid/support/v7/widget/RecyclerView$t;->b(I)V

    goto :goto_0

    .line 4719
    :cond_4
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_2

    :cond_5
    move-object v0, v1

    .line 4728
    goto :goto_0
.end method

.method private e(I)Landroid/support/v7/widget/RecyclerView$t;
    .locals 8

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 4741
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v3, v2

    .line 4744
    :goto_0
    if-ge v3, v4, :cond_2

    .line 4745
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$t;

    .line 4746
    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->f()Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->c()I

    move-result v5

    if-ne v5, p1, :cond_1

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->i()Z

    move-result v5

    if-nez v5, :cond_1

    iget-object v5, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v5, v5, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-static {v5}, Landroid/support/v7/widget/RecyclerView$q;->e(Landroid/support/v7/widget/RecyclerView$q;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->m()Z

    move-result v5

    if-nez v5, :cond_1

    .line 4748
    :cond_0
    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView$t;->b(I)V

    .line 4784
    :goto_1
    return-object v0

    .line 4744
    :cond_1
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    .line 4759
    :cond_2
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v4, v0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/b;

    iget-object v0, v4, Landroid/support/v7/widget/b;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    move v3, v2

    :goto_2
    if-ge v3, v5, :cond_5

    iget-object v0, v4, Landroid/support/v7/widget/b;->c:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    iget-object v6, v4, Landroid/support/v7/widget/b;->a:Landroid/support/v7/widget/b$b;

    invoke-interface {v6, v0}, Landroid/support/v7/widget/b$b;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v6

    invoke-virtual {v6}, Landroid/support/v7/widget/RecyclerView$t;->c()I

    move-result v7

    if-ne v7, p1, :cond_4

    invoke-virtual {v6}, Landroid/support/v7/widget/RecyclerView$t;->i()Z

    move-result v6

    if-nez v6, :cond_4

    .line 4761
    :goto_3
    if-eqz v0, :cond_3

    .line 4763
    iget-object v3, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v3, v3, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/RecyclerView$e;

    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v4, v0}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/support/v7/widget/RecyclerView$e;->c(Landroid/support/v7/widget/RecyclerView$t;)V

    .line 4768
    :cond_3
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 4769
    :goto_4
    if-ge v2, v3, :cond_7

    .line 4770
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$t;

    .line 4773
    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->i()Z

    move-result v4

    if-nez v4, :cond_6

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->c()I

    move-result v4

    if-ne v4, p1, :cond_6

    .line 4774
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$m;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    .line 4759
    :cond_4
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_2

    :cond_5
    move-object v0, v1

    goto :goto_3

    .line 4769
    :cond_6
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_4

    :cond_7
    move-object v0, v1

    .line 4784
    goto :goto_1
.end method

.method private f(I)Landroid/support/v7/widget/RecyclerView$t;
    .locals 8

    .prologue
    const-wide/16 v6, -0x1

    .line 4789
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 4790
    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_3

    .line 4791
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$t;

    .line 4792
    iget-wide v2, v0, Landroid/support/v7/widget/RecyclerView$t;->d:J

    cmp-long v2, v2, v6

    if-nez v2, :cond_2

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->f()Z

    move-result v2

    if-nez v2, :cond_2

    .line 4793
    iget v2, v0, Landroid/support/v7/widget/RecyclerView$t;->e:I

    if-ne p1, v2, :cond_1

    .line 4794
    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView$t;->b(I)V

    .line 4795
    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4804
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView$q;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 4805
    const/4 v1, 0x2

    const/16 v2, 0xe

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/widget/RecyclerView$t;->a(II)V

    .line 4834
    :cond_0
    :goto_1
    return-object v0

    .line 4810
    :cond_1
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView$m;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 4813
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v3, v0, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/support/v7/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 4814
    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/RecyclerView$m;->b(Landroid/view/View;)V

    .line 4790
    :cond_2
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 4820
    :cond_3
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 4821
    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_2
    if-ltz v1, :cond_6

    .line 4822
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$t;

    .line 4823
    iget-wide v2, v0, Landroid/support/v7/widget/RecyclerView$t;->d:J

    cmp-long v2, v2, v6

    if-nez v2, :cond_5

    .line 4824
    iget v2, v0, Landroid/support/v7/widget/RecyclerView$t;->e:I

    if-ne p1, v2, :cond_4

    .line 4825
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView$m;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    .line 4829
    :cond_4
    invoke-virtual {p0, v1}, Landroid/support/v7/widget/RecyclerView$m;->c(I)V

    .line 4821
    :cond_5
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_2

    .line 4834
    :cond_6
    const/4 v0, 0x0

    goto :goto_1
.end method


# virtual methods
.method public final a(I)I
    .locals 3

    .prologue
    .line 4301
    if-ltz p1, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$q;->e()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 4302
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "invalid position "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ". State item count is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, v2, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView$q;->e()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4305
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$q;->a()Z

    move-result v0

    if-nez v0, :cond_2

    .line 4308
    :goto_0
    return p1

    :cond_2
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->b:Landroid/support/v7/widget/a;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/a;->a(I)I

    move-result p1

    goto :goto_0
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 4173
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4174
    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView$m;->c()V

    .line 4175
    return-void
.end method

.method final a(Landroid/support/v7/widget/RecyclerView$t;)V
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 4569
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView$t;->d()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p1, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 4570
    :cond_0
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Scrapped or attached views may not be recycled. isScrap:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView$t;->d()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " isAttached:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p1, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    if-eqz v4, :cond_1

    :goto_0
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1
    move v0, v1

    goto :goto_0

    .line 4576
    :cond_2
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView$t;->n()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 4577
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Tmp detached view should be removed from RecyclerView before it can be recycled: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4581
    :cond_3
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView$t;->b()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 4582
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4586
    :cond_4
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView$t;->a(Landroid/support/v7/widget/RecyclerView$t;)Z

    move-result v3

    .line 4588
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v2}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$a;

    move-result-object v2

    if-eqz v2, :cond_5

    if-eqz v3, :cond_5

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v2}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$a;

    .line 4597
    :cond_5
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView$t;->p()Z

    move-result v2

    if-eqz v2, :cond_a

    .line 4598
    const/16 v2, 0x4e

    invoke-virtual {p1, v2}, Landroid/support/v7/widget/RecyclerView$t;->a(I)Z

    move-result v2

    if-nez v2, :cond_9

    .line 4601
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView$m;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 4602
    iget v4, p0, Landroid/support/v7/widget/RecyclerView$m;->f:I

    if-ne v2, v4, :cond_6

    if-lez v2, :cond_6

    .line 4603
    invoke-virtual {p0, v1}, Landroid/support/v7/widget/RecyclerView$m;->c(I)V

    .line 4605
    :cond_6
    iget v4, p0, Landroid/support/v7/widget/RecyclerView$m;->f:I

    if-ge v2, v4, :cond_9

    .line 4606
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView$m;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v2, v0

    .line 4610
    :goto_1
    if-nez v2, :cond_8

    .line 4611
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$m;->c(Landroid/support/v7/widget/RecyclerView$t;)V

    move v1, v0

    move v0, v2

    .line 4620
    :goto_2
    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, v2, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v2, p1}, Landroid/support/v7/widget/RecyclerView$q;->a(Landroid/support/v7/widget/RecyclerView$t;)V

    .line 4621
    if-nez v0, :cond_7

    if-nez v1, :cond_7

    if-eqz v3, :cond_7

    .line 4622
    const/4 v0, 0x0

    iput-object v0, p1, Landroid/support/v7/widget/RecyclerView$t;->i:Landroid/support/v7/widget/RecyclerView;

    .line 4624
    :cond_7
    return-void

    :cond_8
    move v0, v2

    goto :goto_2

    :cond_9
    move v2, v1

    goto :goto_1

    :cond_a
    move v0, v1

    goto :goto_2
.end method

.method public final a(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 4511
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v0

    .line 4512
    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->n()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4513
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, Landroid/support/v7/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 4515
    :cond_0
    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 4516
    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->e()V

    .line 4520
    :cond_1
    :goto_0
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/RecyclerView$m;->a(Landroid/support/v7/widget/RecyclerView$t;)V

    .line 4521
    return-void

    .line 4517
    :cond_2
    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->f()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 4518
    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->g()V

    goto :goto_0
.end method

.method public final b(I)Landroid/view/View;
    .locals 11

    .prologue
    const/4 v3, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 4326
    if-ltz p1, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$q;->e()I

    move-result v0

    if-lt p1, v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid item position "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "). Item count:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, v2, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView$q;->e()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$q;->a()Z

    move-result v0

    if-eqz v0, :cond_1c

    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$m;->d(I)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v4

    if-eqz v4, :cond_3

    move v0, v1

    :goto_0
    move-object v10, v4

    move v4, v0

    move-object v0, v10

    :goto_1
    if-nez v0, :cond_1b

    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$m;->e(I)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v0

    if-eqz v0, :cond_1b

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->m()Z

    move-result v5

    if-nez v5, :cond_8

    iget v5, v0, Landroid/support/v7/widget/RecyclerView$t;->b:I

    if-ltz v5, :cond_2

    iget v5, v0, Landroid/support/v7/widget/RecyclerView$t;->b:I

    iget-object v6, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v6}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$a;

    move-result-object v6

    invoke-virtual {v6}, Landroid/support/v7/widget/RecyclerView$a;->a()I

    move-result v6

    if-lt v5, v6, :cond_4

    :cond_2
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Inconsistency detected. Invalid view holder adapter position"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    move v0, v2

    goto :goto_0

    :cond_4
    iget-object v5, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v5, v5, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v5}, Landroid/support/v7/widget/RecyclerView$q;->a()Z

    move-result v5

    if-nez v5, :cond_7

    iget-object v5, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v5}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$a;

    move-result-object v5

    iget v6, v0, Landroid/support/v7/widget/RecyclerView$t;->b:I

    invoke-virtual {v5, v6}, Landroid/support/v7/widget/RecyclerView$a;->a(I)I

    move-result v5

    iget v6, v0, Landroid/support/v7/widget/RecyclerView$t;->e:I

    if-eq v5, v6, :cond_7

    move v5, v2

    :goto_2
    if-nez v5, :cond_a

    const/4 v5, 0x4

    invoke-virtual {v0, v5}, Landroid/support/v7/widget/RecyclerView$t;->b(I)V

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->d()Z

    move-result v5

    if-eqz v5, :cond_9

    iget-object v5, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v6, v0, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    invoke-virtual {v5, v6, v2}, Landroid/support/v7/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->e()V

    :cond_5
    :goto_3
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/RecyclerView$m;->a(Landroid/support/v7/widget/RecyclerView$t;)V

    move-object v0, v3

    move v3, v4

    :goto_4
    if-nez v0, :cond_1a

    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v4, v4, Landroid/support/v7/widget/RecyclerView;->b:Landroid/support/v7/widget/a;

    invoke-virtual {v4, p1}, Landroid/support/v7/widget/a;->a(I)I

    move-result v4

    if-ltz v4, :cond_6

    iget-object v5, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v5}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$a;

    move-result-object v5

    invoke-virtual {v5}, Landroid/support/v7/widget/RecyclerView$a;->a()I

    move-result v5

    if-lt v4, v5, :cond_b

    :cond_6
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Inconsistency detected. Invalid item position "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "(offset:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ").state:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, v2, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView$q;->e()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    iget-object v5, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v5}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$a;

    move-result-object v5

    invoke-virtual {v5}, Landroid/support/v7/widget/RecyclerView$a;->b()Z

    move-result v5

    if-eqz v5, :cond_8

    iget-wide v6, v0, Landroid/support/v7/widget/RecyclerView$t;->d:J

    iget-object v5, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v5}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$a;

    const-wide/16 v8, -0x1

    cmp-long v5, v6, v8

    if-eqz v5, :cond_8

    move v5, v2

    goto :goto_2

    :cond_8
    move v5, v1

    goto :goto_2

    :cond_9
    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->f()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->g()V

    goto :goto_3

    :cond_a
    move v3, v1

    goto :goto_4

    :cond_b
    iget-object v5, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v5}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$a;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/support/v7/widget/RecyclerView$a;->a(I)I

    move-result v5

    iget-object v6, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v6}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$a;

    move-result-object v6

    invoke-virtual {v6}, Landroid/support/v7/widget/RecyclerView$a;->b()Z

    move-result v6

    if-eqz v6, :cond_c

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$a;

    invoke-direct {p0, v5}, Landroid/support/v7/widget/RecyclerView$m;->f(I)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v0

    if-eqz v0, :cond_c

    iput v4, v0, Landroid/support/v7/widget/RecyclerView$t;->b:I

    move v3, v1

    :cond_c
    if-nez v0, :cond_e

    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView$m;->h:Landroid/support/v7/widget/RecyclerView$r;

    if-eqz v4, :cond_e

    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView$m;->h:Landroid/support/v7/widget/RecyclerView$r;

    invoke-virtual {v4}, Landroid/support/v7/widget/RecyclerView$r;->a()Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_e

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v4}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v0

    if-nez v0, :cond_d

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "getViewForPositionAndType returned a view which does not have a ViewHolder"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->b()Z

    move-result v4

    if-eqz v4, :cond_e

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    if-nez v0, :cond_10

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView$m;->d()Landroid/support/v7/widget/RecyclerView$l;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/support/v7/widget/RecyclerView$l;->a(I)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v4

    if-eqz v4, :cond_f

    invoke-virtual {v4}, Landroid/support/v7/widget/RecyclerView$t;->o()V

    invoke-static {}, Landroid/support/v7/widget/RecyclerView;->h()Z

    move-result v0

    if-eqz v0, :cond_f

    iget-object v0, v4, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    instance-of v0, v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_f

    iget-object v0, v4, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    check-cast v0, Landroid/view/ViewGroup;

    invoke-direct {p0, v0, v2}, Landroid/support/v7/widget/RecyclerView$m;->a(Landroid/view/ViewGroup;Z)V

    :cond_f
    move-object v0, v4

    :cond_10
    if-nez v0, :cond_1a

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$a;

    move-result-object v0

    iget-object v4, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    const-string v6, "RV CreateView"

    invoke-static {v6}, Landroid/support/v4/os/TraceCompat;->beginSection(Ljava/lang/String;)V

    invoke-virtual {v0, v4, v5}, Landroid/support/v7/widget/RecyclerView$a;->a(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v0

    iput v5, v0, Landroid/support/v7/widget/RecyclerView$t;->e:I

    move v4, v3

    move-object v3, v0

    invoke-static {}, Landroid/support/v4/os/TraceCompat;->endSection()V

    :goto_5
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$q;->a()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-virtual {v3}, Landroid/support/v7/widget/RecyclerView$t;->l()Z

    move-result v0

    if-eqz v0, :cond_11

    iput p1, v3, Landroid/support/v7/widget/RecyclerView$t;->f:I

    move v5, v2

    :goto_6
    iget-object v0, v3, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-nez v0, :cond_16

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    iget-object v6, v3, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    invoke-virtual {v6, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :goto_7
    iput-object v3, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/RecyclerView$t;

    if-eqz v4, :cond_18

    if-eqz v5, :cond_18

    :goto_8
    iput-boolean v1, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->d:Z

    iget-object v0, v3, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    return-object v0

    :cond_11
    invoke-virtual {v3}, Landroid/support/v7/widget/RecyclerView$t;->l()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-virtual {v3}, Landroid/support/v7/widget/RecyclerView$t;->j()Z

    move-result v0

    if-nez v0, :cond_12

    invoke-virtual {v3}, Landroid/support/v7/widget/RecyclerView$t;->i()Z

    move-result v0

    if-eqz v0, :cond_19

    :cond_12
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->b:Landroid/support/v7/widget/a;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/a;->a(I)I

    move-result v0

    iget-object v5, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    iput-object v5, v3, Landroid/support/v7/widget/RecyclerView$t;->i:Landroid/support/v7/widget/RecyclerView;

    iget-object v5, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v5}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$a;

    move-result-object v5

    invoke-virtual {v5, v3, v0}, Landroid/support/v7/widget/RecyclerView$a;->b(Landroid/support/v7/widget/RecyclerView$t;I)V

    iget-object v0, v3, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    iget-object v5, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v5}, Landroid/support/v7/widget/RecyclerView;->n(Landroid/support/v7/widget/RecyclerView;)Landroid/view/accessibility/AccessibilityManager;

    move-result-object v5

    if-eqz v5, :cond_14

    iget-object v5, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v5}, Landroid/support/v7/widget/RecyclerView;->n(Landroid/support/v7/widget/RecyclerView;)Landroid/view/accessibility/AccessibilityManager;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v5

    if-eqz v5, :cond_14

    invoke-static {v0}, Landroid/support/v4/view/ViewCompat;->getImportantForAccessibility(Landroid/view/View;)I

    move-result v5

    if-nez v5, :cond_13

    invoke-static {v0, v1}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V

    :cond_13
    invoke-static {v0}, Landroid/support/v4/view/ViewCompat;->hasAccessibilityDelegate(Landroid/view/View;)Z

    move-result v5

    if-nez v5, :cond_14

    iget-object v5, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v5}, Landroid/support/v7/widget/RecyclerView;->o(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerViewAccessibilityDelegate;

    move-result-object v5

    iget-object v5, v5, Landroid/support/v7/widget/RecyclerViewAccessibilityDelegate;->b:Landroid/support/v4/view/AccessibilityDelegateCompat;

    invoke-static {v0, v5}, Landroid/support/v4/view/ViewCompat;->setAccessibilityDelegate(Landroid/view/View;Landroid/support/v4/view/AccessibilityDelegateCompat;)V

    :cond_14
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/RecyclerView$q;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$q;->a()Z

    move-result v0

    if-eqz v0, :cond_15

    iput p1, v3, Landroid/support/v7/widget/RecyclerView$t;->f:I

    :cond_15
    move v5, v1

    goto/16 :goto_6

    :cond_16
    iget-object v6, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v6, v0}, Landroid/support/v7/widget/RecyclerView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result v6

    if-nez v6, :cond_17

    iget-object v6, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v6, v0}, Landroid/support/v7/widget/RecyclerView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    iget-object v6, v3, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    invoke-virtual {v6, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_7

    :cond_17
    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    goto/16 :goto_7

    :cond_18
    move v1, v2

    goto/16 :goto_8

    :cond_19
    move v5, v2

    goto/16 :goto_6

    :cond_1a
    move v4, v3

    move-object v3, v0

    goto/16 :goto_5

    :cond_1b
    move v3, v4

    goto/16 :goto_4

    :cond_1c
    move-object v0, v3

    move v4, v2

    goto/16 :goto_1
.end method

.method public final b()Ljava/util/List;
    .locals 1

    .prologue
    .line 4196
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->e:Ljava/util/List;

    return-object v0
.end method

.method final b(Landroid/support/v7/widget/RecyclerView$t;)V
    .locals 1

    .prologue
    .line 4679
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView$t;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->i(Landroid/support/v7/widget/RecyclerView;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->d:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    .line 4680
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 4684
    :goto_0
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView$t;->b(Landroid/support/v7/widget/RecyclerView$t;)Landroid/support/v7/widget/RecyclerView$m;

    .line 4685
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView$t;->g()V

    .line 4686
    return-void

    .line 4682
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method final b(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 4639
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v0

    .line 4640
    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView$t;->b(Landroid/support/v7/widget/RecyclerView$t;)Landroid/support/v7/widget/RecyclerView$m;

    .line 4641
    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->g()V

    .line 4642
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/RecyclerView$m;->a(Landroid/support/v7/widget/RecyclerView$t;)V

    .line 4643
    return-void
.end method

.method final c()V
    .locals 1

    .prologue
    .line 4533
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 4534
    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    .line 4535
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/RecyclerView$m;->c(I)V

    .line 4534
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 4537
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4538
    return-void
.end method

.method final c(I)V
    .locals 1

    .prologue
    .line 4555
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$t;

    .line 4559
    invoke-direct {p0, v0}, Landroid/support/v7/widget/RecyclerView$m;->c(Landroid/support/v7/widget/RecyclerView$t;)V

    .line 4560
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 4561
    return-void
.end method

.method final c(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 4655
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$t;

    move-result-object v0

    .line 4656
    invoke-virtual {v0, p0}, Landroid/support/v7/widget/RecyclerView$t;->a(Landroid/support/v7/widget/RecyclerView$m;)V

    .line 4657
    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v1}, Landroid/support/v7/widget/RecyclerView;->i(Landroid/support/v7/widget/RecyclerView;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 4658
    :cond_0
    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->i()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->m()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$m;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v1}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/RecyclerView$a;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView$a;->b()Z

    move-result v1

    if-nez v1, :cond_1

    .line 4659
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4663
    :cond_1
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$m;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4670
    :goto_0
    return-void

    .line 4665
    :cond_2
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$m;->d:Ljava/util/ArrayList;

    if-nez v1, :cond_3

    .line 4666
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroid/support/v7/widget/RecyclerView$m;->d:Ljava/util/ArrayList;

    .line 4668
    :cond_3
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$m;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method final d()Landroid/support/v7/widget/RecyclerView$l;
    .locals 1

    .prologue
    .line 4942
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->g:Landroid/support/v7/widget/RecyclerView$l;

    if-nez v0, :cond_0

    .line 4943
    new-instance v0, Landroid/support/v7/widget/RecyclerView$l;

    invoke-direct {v0}, Landroid/support/v7/widget/RecyclerView$l;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->g:Landroid/support/v7/widget/RecyclerView$l;

    .line 4945
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->g:Landroid/support/v7/widget/RecyclerView$l;

    return-object v0
.end method

.method final e()V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 4993
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v2, v1

    .line 4994
    :goto_0
    if-ge v2, v3, :cond_0

    .line 4995
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$t;

    .line 4996
    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->a()V

    .line 4994
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 4998
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v2, v1

    .line 4999
    :goto_1
    if-ge v2, v3, :cond_1

    .line 5000
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$t;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->a()V

    .line 4999
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    .line 5002
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->d:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 5003
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 5004
    :goto_2
    if-ge v1, v2, :cond_2

    .line 5005
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$m;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$t;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->a()V

    .line 5004
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    .line 5008
    :cond_2
    return-void
.end method
