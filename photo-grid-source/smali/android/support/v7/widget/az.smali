.class public final Landroid/support/v7/widget/az;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v7/widget/bi;",
            ">;"
        }
    .end annotation
.end field

.field final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v7/widget/bi;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic c:Landroid/support/v7/widget/RecyclerView;

.field private d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v7/widget/bi;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/support/v7/widget/bi;",
            ">;"
        }
    .end annotation
.end field

.field private f:I

.field private g:Landroid/support/v7/widget/ay;

.field private h:Landroid/support/v7/widget/bg;


# direct methods
.method public constructor <init>(Landroid/support/v7/widget/RecyclerView;)V
    .locals 1

    .prologue
    .line 4103
    iput-object p1, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4104
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/az;->a:Ljava/util/ArrayList;

    .line 4105
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/widget/az;->d:Ljava/util/ArrayList;

    .line 4107
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/az;->b:Ljava/util/ArrayList;

    .line 4109
    iget-object v0, p0, Landroid/support/v7/widget/az;->a:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/az;->e:Ljava/util/List;

    .line 4112
    const/4 v0, 0x2

    iput v0, p0, Landroid/support/v7/widget/az;->f:I

    return-void
.end method

.method private a(JI)Landroid/support/v7/widget/bi;
    .locals 5

    .prologue
    .line 4736
    iget-object v0, p0, Landroid/support/v7/widget/az;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 4737
    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_3

    .line 4738
    iget-object v0, p0, Landroid/support/v7/widget/az;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/bi;

    .line 17099
    iget-wide v2, v0, Landroid/support/v7/widget/bi;->d:J

    .line 4739
    cmp-long v2, v2, p1

    if-nez v2, :cond_2

    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->g()Z

    move-result v2

    if-nez v2, :cond_2

    .line 17106
    iget v2, v0, Landroid/support/v7/widget/bi;->e:I

    .line 4740
    if-ne p3, v2, :cond_1

    .line 4741
    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/bi;->a(I)V

    .line 4742
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->n()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4751
    iget-object v1, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v1}, Landroid/support/v7/widget/bf;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 4752
    const/4 v1, 0x2

    const/16 v2, 0xe

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/widget/bi;->a(II)V

    .line 4781
    :cond_0
    :goto_1
    return-object v0

    .line 4759
    :cond_1
    iget-object v2, p0, Landroid/support/v7/widget/az;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 4760
    iget-object v2, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v3, v0, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/support/v7/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 4761
    iget-object v0, v0, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/az;->b(Landroid/view/View;)V

    .line 4737
    :cond_2
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 4767
    :cond_3
    iget-object v0, p0, Landroid/support/v7/widget/az;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 4768
    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_2
    if-ltz v1, :cond_6

    .line 4769
    iget-object v0, p0, Landroid/support/v7/widget/az;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/bi;

    .line 18099
    iget-wide v2, v0, Landroid/support/v7/widget/bi;->d:J

    .line 4770
    cmp-long v2, v2, p1

    if-nez v2, :cond_5

    .line 18106
    iget v2, v0, Landroid/support/v7/widget/bi;->e:I

    .line 4771
    if-ne p3, v2, :cond_4

    .line 4773
    iget-object v2, p0, Landroid/support/v7/widget/az;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    .line 4777
    :cond_4
    invoke-virtual {p0, v1}, Landroid/support/v7/widget/az;->c(I)V

    .line 4768
    :cond_5
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_2

    .line 4781
    :cond_6
    const/4 v0, 0x0

    goto :goto_1
.end method

.method static synthetic a(Landroid/support/v7/widget/az;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 4103
    iget-object v0, p0, Landroid/support/v7/widget/az;->d:Ljava/util/ArrayList;

    return-object v0
.end method

.method private a(Landroid/view/ViewGroup;Z)V
    .locals 4

    .prologue
    const/4 v3, 0x4

    .line 4430
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_1

    .line 4431
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 4432
    instance-of v2, v0, Landroid/view/ViewGroup;

    if-eqz v2, :cond_0

    .line 4433
    check-cast v0, Landroid/view/ViewGroup;

    const/4 v2, 0x1

    invoke-direct {p0, v0, v2}, Landroid/support/v7/widget/az;->a(Landroid/view/ViewGroup;Z)V

    .line 4430
    :cond_0
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 4436
    :cond_1
    if-nez p2, :cond_2

    .line 4448
    :goto_1
    return-void

    .line 4440
    :cond_2
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    if-ne v0, v3, :cond_3

    .line 4441
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 4442
    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_1

    .line 4444
    :cond_3
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    .line 4445
    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 4446
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_1
.end method

.method private c(Landroid/support/v7/widget/bi;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 4574
    iget-object v0, p1, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    invoke-static {v0, v1}, Landroid/support/v4/view/ViewCompat;->setAccessibilityDelegate(Landroid/view/View;Landroid/support/v4/view/AccessibilityDelegateCompat;)V

    .line 13785
    iget-object v0, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->u(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/ba;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 13786
    iget-object v0, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->u(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/ba;

    .line 13788
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/al;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 13789
    iget-object v0, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/al;

    .line 13791
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    if-eqz v0, :cond_2

    .line 13792
    iget-object v0, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/bf;->a(Landroid/support/v7/widget/bi;)V

    .line 4576
    :cond_2
    iput-object v1, p1, Landroid/support/v7/widget/bi;->i:Landroid/support/v7/widget/RecyclerView;

    .line 4577
    invoke-virtual {p0}, Landroid/support/v7/widget/az;->d()Landroid/support/v7/widget/ay;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/ay;->a(Landroid/support/v7/widget/bi;)V

    .line 4578
    return-void
.end method

.method private d(I)Landroid/support/v7/widget/bi;
    .locals 11

    .prologue
    const/4 v1, 0x0

    const/16 v10, 0x20

    const/4 v2, 0x0

    .line 4650
    iget-object v0, p0, Landroid/support/v7/widget/az;->d:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/az;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-nez v4, :cond_1

    :cond_0
    move-object v0, v1

    .line 4675
    :goto_0
    return-object v0

    :cond_1
    move v3, v2

    .line 4654
    :goto_1
    if-ge v3, v4, :cond_3

    .line 4655
    iget-object v0, p0, Landroid/support/v7/widget/az;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/bi;

    .line 4656
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->g()Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->c()I

    move-result v5

    if-ne v5, p1, :cond_2

    .line 4657
    invoke-virtual {v0, v10}, Landroid/support/v7/widget/bi;->a(I)V

    goto :goto_0

    .line 4654
    :cond_2
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    .line 4662
    :cond_3
    iget-object v0, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/al;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/al;->k_()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 4663
    iget-object v0, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->b:Landroid/support/v7/widget/a;

    .line 14457
    invoke-virtual {v0, p1, v2}, Landroid/support/v7/widget/a;->a(II)I

    move-result v0

    .line 4664
    if-lez v0, :cond_5

    iget-object v3, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v3}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/al;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v7/widget/al;->a()I

    move-result v3

    if-ge v0, v3, :cond_5

    .line 4665
    iget-object v3, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v3}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/al;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/support/v7/widget/al;->b(I)J

    move-result-wide v6

    .line 4666
    :goto_2
    if-ge v2, v4, :cond_5

    .line 4667
    iget-object v0, p0, Landroid/support/v7/widget/az;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/bi;

    .line 4668
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->g()Z

    move-result v3

    if-nez v3, :cond_4

    .line 15099
    iget-wide v8, v0, Landroid/support/v7/widget/bi;->d:J

    .line 4668
    cmp-long v3, v8, v6

    if-nez v3, :cond_4

    .line 4669
    invoke-virtual {v0, v10}, Landroid/support/v7/widget/bi;->a(I)V

    goto :goto_0

    .line 4666
    :cond_4
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_2

    :cond_5
    move-object v0, v1

    .line 4675
    goto :goto_0
.end method

.method private e(I)Landroid/support/v7/widget/bi;
    .locals 8

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 4688
    iget-object v0, p0, Landroid/support/v7/widget/az;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v3, v2

    .line 4691
    :goto_0
    if-ge v3, v4, :cond_2

    .line 4692
    iget-object v0, p0, Landroid/support/v7/widget/az;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/bi;

    .line 4693
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->g()Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->c()I

    move-result v5

    if-ne v5, p1, :cond_1

    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->j()Z

    move-result v5

    if-nez v5, :cond_1

    iget-object v5, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v5, v5, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-static {v5}, Landroid/support/v7/widget/bf;->e(Landroid/support/v7/widget/bf;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->n()Z

    move-result v5

    if-nez v5, :cond_1

    .line 4701
    :cond_0
    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/bi;->a(I)V

    .line 4731
    :goto_1
    return-object v0

    .line 4691
    :cond_1
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    .line 4707
    :cond_2
    iget-object v0, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v4, v0, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    .line 15180
    iget-object v0, v4, Landroid/support/v7/widget/d;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    move v3, v2

    .line 15181
    :goto_2
    if-ge v3, v5, :cond_5

    .line 15182
    iget-object v0, v4, Landroid/support/v7/widget/d;->c:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 15183
    iget-object v6, v4, Landroid/support/v7/widget/d;->a:Landroid/support/v7/widget/f;

    invoke-interface {v6, v0}, Landroid/support/v7/widget/f;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v6

    .line 15184
    invoke-virtual {v6}, Landroid/support/v7/widget/bi;->c()I

    move-result v7

    if-ne v7, p1, :cond_4

    invoke-virtual {v6}, Landroid/support/v7/widget/bi;->j()Z

    move-result v6

    if-nez v6, :cond_4

    .line 4708
    :goto_3
    if-eqz v0, :cond_3

    .line 4710
    iget-object v3, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v3, v3, Landroid/support/v7/widget/RecyclerView;->d:Landroid/support/v7/widget/ap;

    iget-object v4, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v4, v0}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/support/v7/widget/ap;->c(Landroid/support/v7/widget/bi;)V

    .line 4715
    :cond_3
    iget-object v0, p0, Landroid/support/v7/widget/az;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 4716
    :goto_4
    if-ge v2, v3, :cond_7

    .line 4717
    iget-object v0, p0, Landroid/support/v7/widget/az;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/bi;

    .line 4720
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->j()Z

    move-result v4

    if-nez v4, :cond_6

    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->c()I

    move-result v4

    if-ne v4, p1, :cond_6

    .line 4722
    iget-object v1, p0, Landroid/support/v7/widget/az;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    .line 15181
    :cond_4
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_2

    :cond_5
    move-object v0, v1

    .line 15189
    goto :goto_3

    .line 4716
    :cond_6
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_4

    :cond_7
    move-object v0, v1

    .line 4731
    goto :goto_1
.end method


# virtual methods
.method public final a(I)I
    .locals 3

    .prologue
    .line 4253
    if-ltz p1, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v0}, Landroid/support/v7/widget/bf;->e()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 4254
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

    iget-object v2, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, v2, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v2}, Landroid/support/v7/widget/bf;->e()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4257
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v0}, Landroid/support/v7/widget/bf;->a()Z

    move-result v0

    if-nez v0, :cond_2

    .line 4260
    :goto_0
    return p1

    :cond_2
    iget-object v0, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->b:Landroid/support/v7/widget/a;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/a;->a(I)I

    move-result p1

    goto :goto_0
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 4125
    iget-object v0, p0, Landroid/support/v7/widget/az;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4126
    invoke-virtual {p0}, Landroid/support/v7/widget/az;->c()V

    .line 4127
    return-void
.end method

.method final a(Landroid/support/v7/widget/bi;)V
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 4521
    invoke-virtual {p1}, Landroid/support/v7/widget/bi;->e()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p1, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 4522
    :cond_0
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Scrapped or attached views may not be recycled. isScrap:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/support/v7/widget/bi;->e()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " isAttached:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p1, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

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

    .line 4528
    :cond_2
    invoke-virtual {p1}, Landroid/support/v7/widget/bi;->p()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 4529
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

    .line 4533
    :cond_3
    invoke-virtual {p1}, Landroid/support/v7/widget/bi;->b()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 4534
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4538
    :cond_4
    invoke-static {p1}, Landroid/support/v7/widget/bi;->a(Landroid/support/v7/widget/bi;)Z

    move-result v3

    .line 4540
    iget-object v2, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v2}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/al;

    move-result-object v2

    if-eqz v2, :cond_5

    if-eqz v3, :cond_5

    iget-object v2, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v2}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/al;

    .line 4545
    :cond_5
    invoke-virtual {p1}, Landroid/support/v7/widget/bi;->r()Z

    move-result v2

    if-eqz v2, :cond_a

    .line 4546
    invoke-virtual {p1}, Landroid/support/v7/widget/bi;->j()Z

    move-result v2

    if-nez v2, :cond_9

    invoke-virtual {p1}, Landroid/support/v7/widget/bi;->n()Z

    move-result v2

    if-nez v2, :cond_9

    invoke-virtual {p1}, Landroid/support/v7/widget/bi;->l()Z

    move-result v2

    if-nez v2, :cond_9

    .line 4548
    iget-object v2, p0, Landroid/support/v7/widget/az;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 4549
    iget v4, p0, Landroid/support/v7/widget/az;->f:I

    if-ne v2, v4, :cond_6

    if-lez v2, :cond_6

    .line 4550
    invoke-virtual {p0, v1}, Landroid/support/v7/widget/az;->c(I)V

    .line 4552
    :cond_6
    iget v4, p0, Landroid/support/v7/widget/az;->f:I

    if-ge v2, v4, :cond_9

    .line 4553
    iget-object v2, p0, Landroid/support/v7/widget/az;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v2, v0

    .line 4557
    :goto_1
    if-nez v2, :cond_8

    .line 4558
    invoke-direct {p0, p1}, Landroid/support/v7/widget/az;->c(Landroid/support/v7/widget/bi;)V

    move v1, v0

    move v0, v2

    .line 4567
    :goto_2
    iget-object v2, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, v2, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v2, p1}, Landroid/support/v7/widget/bf;->a(Landroid/support/v7/widget/bi;)V

    .line 4568
    if-nez v0, :cond_7

    if-nez v1, :cond_7

    if-eqz v3, :cond_7

    .line 4569
    const/4 v0, 0x0

    iput-object v0, p1, Landroid/support/v7/widget/bi;->i:Landroid/support/v7/widget/RecyclerView;

    .line 4571
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
    .line 4463
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v0

    .line 4464
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->p()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4465
    iget-object v1, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, Landroid/support/v7/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 4467
    :cond_0
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 4468
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->f()V

    .line 4472
    :cond_1
    :goto_0
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/az;->a(Landroid/support/v7/widget/bi;)V

    .line 4473
    return-void

    .line 4469
    :cond_2
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->g()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 4470
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->h()V

    goto :goto_0
.end method

.method public final b(I)Landroid/view/View;
    .locals 11

    .prologue
    const/4 v3, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 4278
    .line 8282
    if-ltz p1, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v0}, Landroid/support/v7/widget/bf;->e()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 8283
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

    iget-object v2, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, v2, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v2}, Landroid/support/v7/widget/bf;->e()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 8289
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v0}, Landroid/support/v7/widget/bf;->a()Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 8290
    invoke-direct {p0, p1}, Landroid/support/v7/widget/az;->d(I)Landroid/support/v7/widget/bi;

    move-result-object v4

    .line 8291
    if-eqz v4, :cond_3

    move v0, v1

    :goto_0
    move-object v10, v4

    move v4, v0

    move-object v0, v10

    .line 8294
    :goto_1
    if-nez v0, :cond_1b

    .line 8295
    invoke-direct {p0, p1}, Landroid/support/v7/widget/az;->e(I)Landroid/support/v7/widget/bi;

    move-result-object v0

    .line 8296
    if-eqz v0, :cond_1b

    .line 9162
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->n()Z

    move-result v5

    if-nez v5, :cond_8

    .line 9165
    iget v5, v0, Landroid/support/v7/widget/bi;->b:I

    if-ltz v5, :cond_2

    iget v5, v0, Landroid/support/v7/widget/bi;->b:I

    iget-object v6, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v6}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/al;

    move-result-object v6

    invoke-virtual {v6}, Landroid/support/v7/widget/al;->a()I

    move-result v6

    if-lt v5, v6, :cond_4

    .line 9166
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

    .line 8291
    goto :goto_0

    .line 9169
    :cond_4
    iget-object v5, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v5, v5, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v5}, Landroid/support/v7/widget/bf;->a()Z

    move-result v5

    if-nez v5, :cond_7

    .line 9171
    iget-object v5, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v5}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/al;

    move-result-object v5

    iget v6, v0, Landroid/support/v7/widget/bi;->b:I

    invoke-virtual {v5, v6}, Landroid/support/v7/widget/al;->a(I)I

    move-result v5

    .line 10106
    iget v6, v0, Landroid/support/v7/widget/bi;->e:I

    .line 9172
    if-eq v5, v6, :cond_7

    move v5, v2

    .line 8297
    :goto_2
    if-nez v5, :cond_a

    .line 8302
    const/4 v5, 0x4

    invoke-virtual {v0, v5}, Landroid/support/v7/widget/bi;->a(I)V

    .line 8303
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->e()Z

    move-result v5

    if-eqz v5, :cond_9

    .line 8304
    iget-object v5, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v6, v0, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    invoke-virtual {v5, v6, v2}, Landroid/support/v7/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 8305
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->f()V

    .line 8309
    :cond_5
    :goto_3
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/az;->a(Landroid/support/v7/widget/bi;)V

    move-object v0, v3

    move v3, v4

    .line 8317
    :goto_4
    if-nez v0, :cond_1a

    .line 8318
    iget-object v4, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v4, v4, Landroid/support/v7/widget/RecyclerView;->b:Landroid/support/v7/widget/a;

    invoke-virtual {v4, p1}, Landroid/support/v7/widget/a;->a(I)I

    move-result v4

    .line 8319
    if-ltz v4, :cond_6

    iget-object v5, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v5}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/al;

    move-result-object v5

    invoke-virtual {v5}, Landroid/support/v7/widget/al;->a()I

    move-result v5

    if-lt v4, v5, :cond_b

    .line 8320
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

    iget-object v2, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, v2, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v2}, Landroid/support/v7/widget/bf;->e()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 9176
    :cond_7
    iget-object v5, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v5}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/al;

    move-result-object v5

    invoke-virtual {v5}, Landroid/support/v7/widget/al;->k_()Z

    move-result v5

    if-eqz v5, :cond_8

    .line 11099
    iget-wide v6, v0, Landroid/support/v7/widget/bi;->d:J

    .line 9177
    iget-object v5, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v5}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/al;

    move-result-object v5

    iget v8, v0, Landroid/support/v7/widget/bi;->b:I

    invoke-virtual {v5, v8}, Landroid/support/v7/widget/al;->b(I)J

    move-result-wide v8

    cmp-long v5, v6, v8

    if-eqz v5, :cond_8

    move v5, v2

    goto/16 :goto_2

    :cond_8
    move v5, v1

    .line 9179
    goto/16 :goto_2

    .line 8306
    :cond_9
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->g()Z

    move-result v5

    if-eqz v5, :cond_5

    .line 8307
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->h()V

    goto :goto_3

    :cond_a
    move v3, v1

    .line 8313
    goto :goto_4

    .line 8325
    :cond_b
    iget-object v5, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v5}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/al;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/support/v7/widget/al;->a(I)I

    move-result v5

    .line 8327
    iget-object v6, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v6}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/al;

    move-result-object v6

    invoke-virtual {v6}, Landroid/support/v7/widget/al;->k_()Z

    move-result v6

    if-eqz v6, :cond_c

    .line 8328
    iget-object v0, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/al;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/support/v7/widget/al;->b(I)J

    move-result-wide v6

    invoke-direct {p0, v6, v7, v5}, Landroid/support/v7/widget/az;->a(JI)Landroid/support/v7/widget/bi;

    move-result-object v0

    .line 8329
    if-eqz v0, :cond_c

    .line 8331
    iput v4, v0, Landroid/support/v7/widget/bi;->b:I

    move v3, v1

    .line 8335
    :cond_c
    if-nez v0, :cond_e

    iget-object v4, p0, Landroid/support/v7/widget/az;->h:Landroid/support/v7/widget/bg;

    if-eqz v4, :cond_e

    .line 8338
    iget-object v4, p0, Landroid/support/v7/widget/az;->h:Landroid/support/v7/widget/bg;

    invoke-virtual {v4}, Landroid/support/v7/widget/bg;->a()Landroid/view/View;

    move-result-object v4

    .line 8340
    if-eqz v4, :cond_e

    .line 8341
    iget-object v0, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v4}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v0

    .line 8342
    if-nez v0, :cond_d

    .line 8343
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "getViewForPositionAndType returned a view which does not have a ViewHolder"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 8345
    :cond_d
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->b()Z

    move-result v4

    if-eqz v4, :cond_e

    .line 8346
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 8352
    :cond_e
    if-nez v0, :cond_10

    .line 8359
    invoke-virtual {p0}, Landroid/support/v7/widget/az;->d()Landroid/support/v7/widget/ay;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/support/v7/widget/ay;->a(I)Landroid/support/v7/widget/bi;

    move-result-object v4

    .line 8360
    if-eqz v4, :cond_f

    .line 8361
    invoke-virtual {v4}, Landroid/support/v7/widget/bi;->q()V

    .line 8362
    invoke-static {}, Landroid/support/v7/widget/RecyclerView;->i()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 11424
    iget-object v0, v4, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    instance-of v0, v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_f

    .line 11425
    iget-object v0, v4, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    check-cast v0, Landroid/view/ViewGroup;

    invoke-direct {p0, v0, v2}, Landroid/support/v7/widget/az;->a(Landroid/view/ViewGroup;Z)V

    :cond_f
    move-object v0, v4

    .line 8367
    :cond_10
    if-nez v0, :cond_1a

    .line 8368
    iget-object v0, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/al;

    move-result-object v0

    iget-object v4, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    .line 12061
    const-string v6, "RV CreateView"

    invoke-static {v6}, Landroid/support/v4/os/TraceCompat;->beginSection(Ljava/lang/String;)V

    .line 12062
    invoke-virtual {v0, v4, v5}, Landroid/support/v7/widget/al;->a(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/bi;

    move-result-object v0

    .line 12063
    iput v5, v0, Landroid/support/v7/widget/bi;->e:I

    move v4, v3

    move-object v3, v0

    .line 12064
    invoke-static {}, Landroid/support/v4/os/TraceCompat;->endSection()V

    .line 8375
    :goto_5
    iget-object v0, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v0}, Landroid/support/v7/widget/bf;->a()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-virtual {v3}, Landroid/support/v7/widget/bi;->m()Z

    move-result v0

    if-eqz v0, :cond_11

    .line 8377
    iput p1, v3, Landroid/support/v7/widget/bi;->f:I

    move v5, v2

    .line 8393
    :goto_6
    iget-object v0, v3, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 8395
    if-nez v0, :cond_16

    .line 8396
    iget-object v0, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    .line 8397
    iget-object v6, v3, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    invoke-virtual {v6, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 8404
    :goto_7
    iput-object v3, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/bi;

    .line 8405
    if-eqz v4, :cond_18

    if-eqz v5, :cond_18

    :goto_8
    iput-boolean v1, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->d:Z

    .line 8406
    iget-object v0, v3, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    .line 4278
    return-object v0

    .line 8378
    :cond_11
    invoke-virtual {v3}, Landroid/support/v7/widget/bi;->m()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-virtual {v3}, Landroid/support/v7/widget/bi;->k()Z

    move-result v0

    if-nez v0, :cond_12

    invoke-virtual {v3}, Landroid/support/v7/widget/bi;->j()Z

    move-result v0

    if-eqz v0, :cond_19

    .line 8383
    :cond_12
    iget-object v0, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->b:Landroid/support/v7/widget/a;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/a;->a(I)I

    move-result v0

    .line 8384
    iget-object v5, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    iput-object v5, v3, Landroid/support/v7/widget/bi;->i:Landroid/support/v7/widget/RecyclerView;

    .line 8385
    iget-object v5, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v5}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/al;

    move-result-object v5

    invoke-virtual {v5, v3, v0}, Landroid/support/v7/widget/al;->b(Landroid/support/v7/widget/bi;I)V

    .line 8386
    iget-object v0, v3, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    .line 12410
    iget-object v5, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v5}, Landroid/support/v7/widget/RecyclerView;->s(Landroid/support/v7/widget/RecyclerView;)Landroid/view/accessibility/AccessibilityManager;

    move-result-object v5

    if-eqz v5, :cond_14

    iget-object v5, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v5}, Landroid/support/v7/widget/RecyclerView;->s(Landroid/support/v7/widget/RecyclerView;)Landroid/view/accessibility/AccessibilityManager;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v5

    if-eqz v5, :cond_14

    .line 12411
    invoke-static {v0}, Landroid/support/v4/view/ViewCompat;->getImportantForAccessibility(Landroid/view/View;)I

    move-result v5

    if-nez v5, :cond_13

    .line 12413
    invoke-static {v0, v1}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V

    .line 12416
    :cond_13
    invoke-static {v0}, Landroid/support/v4/view/ViewCompat;->hasAccessibilityDelegate(Landroid/view/View;)Z

    move-result v5

    if-nez v5, :cond_14

    .line 12417
    iget-object v5, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v5}, Landroid/support/v7/widget/RecyclerView;->t(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/bj;

    move-result-object v5

    .line 13076
    iget-object v5, v5, Landroid/support/v7/widget/bj;->b:Landroid/support/v4/view/AccessibilityDelegateCompat;

    .line 12417
    invoke-static {v0, v5}, Landroid/support/v4/view/ViewCompat;->setAccessibilityDelegate(Landroid/view/View;Landroid/support/v4/view/AccessibilityDelegateCompat;)V

    .line 8388
    :cond_14
    iget-object v0, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-virtual {v0}, Landroid/support/v7/widget/bf;->a()Z

    move-result v0

    if-eqz v0, :cond_15

    .line 8389
    iput p1, v3, Landroid/support/v7/widget/bi;->f:I

    :cond_15
    move v5, v1

    goto/16 :goto_6

    .line 8398
    :cond_16
    iget-object v6, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v6, v0}, Landroid/support/v7/widget/RecyclerView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result v6

    if-nez v6, :cond_17

    .line 8399
    iget-object v6, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v6, v0}, Landroid/support/v7/widget/RecyclerView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    .line 8400
    iget-object v6, v3, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    invoke-virtual {v6, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_7

    .line 8402
    :cond_17
    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    goto/16 :goto_7

    :cond_18
    move v1, v2

    .line 8405
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
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Landroid/support/v7/widget/bi;",
            ">;"
        }
    .end annotation

    .prologue
    .line 4148
    iget-object v0, p0, Landroid/support/v7/widget/az;->e:Ljava/util/List;

    return-object v0
.end method

.method final b(Landroid/support/v7/widget/bi;)V
    .locals 1

    .prologue
    .line 4626
    invoke-virtual {p1}, Landroid/support/v7/widget/bi;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->i(Landroid/support/v7/widget/RecyclerView;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/az;->d:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    .line 4627
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/az;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 4631
    :goto_0
    invoke-static {p1}, Landroid/support/v7/widget/bi;->b(Landroid/support/v7/widget/bi;)Landroid/support/v7/widget/az;

    .line 4632
    invoke-virtual {p1}, Landroid/support/v7/widget/bi;->h()V

    .line 4633
    return-void

    .line 4629
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/az;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method final b(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 4586
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v0

    .line 4587
    invoke-static {v0}, Landroid/support/v7/widget/bi;->b(Landroid/support/v7/widget/bi;)Landroid/support/v7/widget/az;

    .line 4588
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->h()V

    .line 4589
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/az;->a(Landroid/support/v7/widget/bi;)V

    .line 4590
    return-void
.end method

.method final c()V
    .locals 1

    .prologue
    .line 4485
    iget-object v0, p0, Landroid/support/v7/widget/az;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 4486
    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    .line 4487
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/az;->c(I)V

    .line 4486
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 4489
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/az;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4490
    return-void
.end method

.method final c(I)V
    .locals 1

    .prologue
    .line 4507
    iget-object v0, p0, Landroid/support/v7/widget/az;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/bi;

    .line 4511
    invoke-direct {p0, v0}, Landroid/support/v7/widget/az;->c(Landroid/support/v7/widget/bi;)V

    .line 4512
    iget-object v0, p0, Landroid/support/v7/widget/az;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 4513
    return-void
.end method

.method final c(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 4602
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v0

    .line 4603
    invoke-virtual {v0, p0}, Landroid/support/v7/widget/bi;->a(Landroid/support/v7/widget/az;)V

    .line 4604
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->l()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v1}, Landroid/support/v7/widget/RecyclerView;->i(Landroid/support/v7/widget/RecyclerView;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 4605
    :cond_0
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->j()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->n()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Landroid/support/v7/widget/az;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v1}, Landroid/support/v7/widget/RecyclerView;->g(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/al;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v7/widget/al;->k_()Z

    move-result v1

    if-nez v1, :cond_1

    .line 4606
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4610
    :cond_1
    iget-object v1, p0, Landroid/support/v7/widget/az;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4617
    :goto_0
    return-void

    .line 4612
    :cond_2
    iget-object v1, p0, Landroid/support/v7/widget/az;->d:Ljava/util/ArrayList;

    if-nez v1, :cond_3

    .line 4613
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroid/support/v7/widget/az;->d:Ljava/util/ArrayList;

    .line 4615
    :cond_3
    iget-object v1, p0, Landroid/support/v7/widget/az;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method final d()Landroid/support/v7/widget/ay;
    .locals 1

    .prologue
    .line 4889
    iget-object v0, p0, Landroid/support/v7/widget/az;->g:Landroid/support/v7/widget/ay;

    if-nez v0, :cond_0

    .line 4890
    new-instance v0, Landroid/support/v7/widget/ay;

    invoke-direct {v0}, Landroid/support/v7/widget/ay;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/az;->g:Landroid/support/v7/widget/ay;

    .line 4892
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/az;->g:Landroid/support/v7/widget/ay;

    return-object v0
.end method

.method final e()V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 4939
    iget-object v0, p0, Landroid/support/v7/widget/az;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v2, v1

    .line 4940
    :goto_0
    if-ge v2, v3, :cond_0

    .line 4941
    iget-object v0, p0, Landroid/support/v7/widget/az;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/bi;

    .line 4942
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->a()V

    .line 4940
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 4944
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/az;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v2, v1

    .line 4945
    :goto_1
    if-ge v2, v3, :cond_1

    .line 4946
    iget-object v0, p0, Landroid/support/v7/widget/az;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/bi;

    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->a()V

    .line 4945
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    .line 4948
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/az;->d:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 4949
    iget-object v0, p0, Landroid/support/v7/widget/az;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 4950
    :goto_2
    if-ge v1, v2, :cond_2

    .line 4951
    iget-object v0, p0, Landroid/support/v7/widget/az;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/bi;

    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->a()V

    .line 4950
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    .line 4954
    :cond_2
    return-void
.end method
