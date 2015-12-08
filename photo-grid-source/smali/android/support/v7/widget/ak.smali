.class final Landroid/support/v7/widget/ak;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v7/widget/b;


# instance fields
.field final synthetic a:Landroid/support/v7/widget/RecyclerView;


# direct methods
.method constructor <init>(Landroid/support/v7/widget/RecyclerView;)V
    .locals 0

    .prologue
    .line 614
    iput-object p1, p0, Landroid/support/v7/widget/ak;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private c(Landroid/support/v7/widget/c;)V
    .locals 3

    .prologue
    .line 657
    iget v0, p1, Landroid/support/v7/widget/c;->a:I

    packed-switch v0, :pswitch_data_0

    .line 671
    :goto_0
    return-void

    .line 659
    :pswitch_0
    iget-object v0, p0, Landroid/support/v7/widget/ak;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->e(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/au;

    move-result-object v0

    iget v1, p1, Landroid/support/v7/widget/c;->b:I

    iget v2, p1, Landroid/support/v7/widget/c;->c:I

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/widget/au;->a(II)V

    goto :goto_0

    .line 662
    :pswitch_1
    iget-object v0, p0, Landroid/support/v7/widget/ak;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->e(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/au;

    move-result-object v0

    iget v1, p1, Landroid/support/v7/widget/c;->b:I

    iget v2, p1, Landroid/support/v7/widget/c;->c:I

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/widget/au;->b(II)V

    goto :goto_0

    .line 665
    :pswitch_2
    iget-object v0, p0, Landroid/support/v7/widget/ak;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->e(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/au;

    move-result-object v0

    iget v1, p1, Landroid/support/v7/widget/c;->b:I

    iget v2, p1, Landroid/support/v7/widget/c;->c:I

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/widget/au;->c(II)V

    goto :goto_0

    .line 668
    :pswitch_3
    iget-object v0, p0, Landroid/support/v7/widget/ak;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->e(Landroid/support/v7/widget/RecyclerView;)Landroid/support/v7/widget/au;

    move-result-object v0

    iget v1, p1, Landroid/support/v7/widget/c;->b:I

    iget v2, p1, Landroid/support/v7/widget/c;->c:I

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/widget/au;->d(II)V

    goto :goto_0

    .line 657
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method


# virtual methods
.method public final a(I)Landroid/support/v7/widget/bi;
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 617
    iget-object v3, p0, Landroid/support/v7/widget/ak;->a:Landroid/support/v7/widget/RecyclerView;

    .line 5450
    iget-object v1, v3, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v1}, Landroid/support/v7/widget/d;->b()I

    move-result v4

    .line 5451
    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v4, :cond_2

    .line 5452
    iget-object v1, v3, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/d;->c(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v1

    .line 5453
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/support/v7/widget/bi;->n()Z

    move-result v5

    if-nez v5, :cond_1

    .line 5455
    iget v5, v1, Landroid/support/v7/widget/bi;->b:I

    if-ne v5, p1, :cond_1

    .line 618
    :goto_1
    if-nez v1, :cond_3

    .line 629
    :cond_0
    :goto_2
    return-object v0

    .line 5451
    :cond_1
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_0

    :cond_2
    move-object v1, v0

    .line 5466
    goto :goto_1

    .line 623
    :cond_3
    iget-object v2, p0, Landroid/support/v7/widget/ak;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, v2, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    iget-object v3, v1, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    invoke-virtual {v2, v3}, Landroid/support/v7/widget/d;->b(Landroid/view/View;)Z

    move-result v2

    if-nez v2, :cond_0

    move-object v0, v1

    .line 629
    goto :goto_2
.end method

.method public final a(II)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 634
    iget-object v0, p0, Landroid/support/v7/widget/ak;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, p1, p2, v1}, Landroid/support/v7/widget/RecyclerView;->a(IIZ)V

    .line 635
    iget-object v0, p0, Landroid/support/v7/widget/ak;->a:Landroid/support/v7/widget/RecyclerView;

    iput-boolean v1, v0, Landroid/support/v7/widget/RecyclerView;->f:Z

    .line 636
    iget-object v0, p0, Landroid/support/v7/widget/ak;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-static {v0, p2}, Landroid/support/v7/widget/bf;->a(Landroid/support/v7/widget/bf;I)I

    .line 637
    return-void
.end method

.method public final a(Landroid/support/v7/widget/c;)V
    .locals 0

    .prologue
    .line 653
    invoke-direct {p0, p1}, Landroid/support/v7/widget/ak;->c(Landroid/support/v7/widget/c;)V

    .line 654
    return-void
.end method

.method public final b(II)V
    .locals 2

    .prologue
    .line 641
    iget-object v0, p0, Landroid/support/v7/widget/ak;->a:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Landroid/support/v7/widget/RecyclerView;->a(IIZ)V

    .line 642
    iget-object v0, p0, Landroid/support/v7/widget/ak;->a:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x1

    iput-boolean v1, v0, Landroid/support/v7/widget/RecyclerView;->f:Z

    .line 643
    return-void
.end method

.method public final b(Landroid/support/v7/widget/c;)V
    .locals 0

    .prologue
    .line 675
    invoke-direct {p0, p1}, Landroid/support/v7/widget/ak;->c(Landroid/support/v7/widget/c;)V

    .line 676
    return-void
.end method

.method public final c(II)V
    .locals 2

    .prologue
    .line 647
    iget-object v0, p0, Landroid/support/v7/widget/ak;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/widget/RecyclerView;->b(II)V

    .line 648
    iget-object v0, p0, Landroid/support/v7/widget/ak;->a:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x1

    iput-boolean v1, v0, Landroid/support/v7/widget/RecyclerView;->g:Z

    .line 649
    return-void
.end method

.method public final d(II)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v0, 0x0

    .line 680
    iget-object v2, p0, Landroid/support/v7/widget/ak;->a:Landroid/support/v7/widget/RecyclerView;

    .line 6167
    iget-object v1, v2, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v1}, Landroid/support/v7/widget/d;->b()I

    move-result v3

    move v1, v0

    .line 6168
    :goto_0
    if-ge v1, v3, :cond_1

    .line 6169
    iget-object v4, v2, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v4, v1}, Landroid/support/v7/widget/d;->c(I)Landroid/view/View;

    move-result-object v4

    invoke-static {v4}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v4

    .line 6170
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Landroid/support/v7/widget/bi;->b()Z

    move-result v5

    if-nez v5, :cond_0

    iget v5, v4, Landroid/support/v7/widget/bi;->b:I

    if-lt v5, p1, :cond_0

    .line 6175
    invoke-virtual {v4, p2, v0}, Landroid/support/v7/widget/bi;->a(IZ)V

    .line 6176
    iget-object v4, v2, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-static {v4, v6}, Landroid/support/v7/widget/bf;->a(Landroid/support/v7/widget/bf;Z)Z

    .line 6168
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 6179
    :cond_1
    iget-object v3, v2, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    .line 6833
    iget-object v1, v3, Landroid/support/v7/widget/az;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v1, v0

    .line 6834
    :goto_1
    if-ge v1, v4, :cond_3

    .line 6835
    iget-object v0, v3, Landroid/support/v7/widget/az;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/bi;

    .line 6836
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->c()I

    move-result v5

    if-lt v5, p1, :cond_2

    .line 6841
    invoke-virtual {v0, p2, v6}, Landroid/support/v7/widget/bi;->a(IZ)V

    .line 6834
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 6180
    :cond_3
    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    .line 681
    iget-object v0, p0, Landroid/support/v7/widget/ak;->a:Landroid/support/v7/widget/RecyclerView;

    iput-boolean v6, v0, Landroid/support/v7/widget/RecyclerView;->f:Z

    .line 682
    return-void
.end method

.method public final e(II)V
    .locals 11

    .prologue
    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v6, 0x0

    .line 686
    iget-object v7, p0, Landroid/support/v7/widget/ak;->a:Landroid/support/v7/widget/RecyclerView;

    .line 7133
    iget-object v0, v7, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v0}, Landroid/support/v7/widget/d;->b()I

    move-result v8

    .line 7135
    if-ge p1, p2, :cond_1

    move v0, v1

    move v3, p2

    move v4, p1

    :goto_0
    move v5, v6

    .line 7145
    :goto_1
    if-ge v5, v8, :cond_3

    .line 7146
    iget-object v9, v7, Landroid/support/v7/widget/RecyclerView;->c:Landroid/support/v7/widget/d;

    invoke-virtual {v9, v5}, Landroid/support/v7/widget/d;->c(I)Landroid/view/View;

    move-result-object v9

    invoke-static {v9}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Landroid/support/v7/widget/bi;

    move-result-object v9

    .line 7147
    if-eqz v9, :cond_0

    iget v10, v9, Landroid/support/v7/widget/bi;->b:I

    if-lt v10, v4, :cond_0

    iget v10, v9, Landroid/support/v7/widget/bi;->b:I

    if-gt v10, v3, :cond_0

    .line 7154
    iget v10, v9, Landroid/support/v7/widget/bi;->b:I

    if-ne v10, p1, :cond_2

    .line 7155
    sub-int v10, p2, p1

    invoke-virtual {v9, v10, v6}, Landroid/support/v7/widget/bi;->a(IZ)V

    .line 7160
    :goto_2
    iget-object v9, v7, Landroid/support/v7/widget/RecyclerView;->e:Landroid/support/v7/widget/bf;

    invoke-static {v9, v2}, Landroid/support/v7/widget/bf;->a(Landroid/support/v7/widget/bf;Z)Z

    .line 7145
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    move v0, v2

    move v3, p1

    move v4, p2

    .line 7142
    goto :goto_0

    .line 7157
    :cond_2
    invoke-virtual {v9, v0, v6}, Landroid/support/v7/widget/bi;->a(IZ)V

    goto :goto_2

    .line 7162
    :cond_3
    iget-object v8, v7, Landroid/support/v7/widget/RecyclerView;->a:Landroid/support/v7/widget/az;

    .line 7805
    if-ge p1, p2, :cond_5

    move v3, p2

    move v4, p1

    .line 7814
    :goto_3
    iget-object v0, v8, Landroid/support/v7/widget/az;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v9

    move v5, v6

    .line 7815
    :goto_4
    if-ge v5, v9, :cond_7

    .line 7816
    iget-object v0, v8, Landroid/support/v7/widget/az;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/bi;

    .line 7817
    if-eqz v0, :cond_4

    iget v10, v0, Landroid/support/v7/widget/bi;->b:I

    if-lt v10, v4, :cond_4

    iget v10, v0, Landroid/support/v7/widget/bi;->b:I

    if-gt v10, v3, :cond_4

    .line 7820
    iget v10, v0, Landroid/support/v7/widget/bi;->b:I

    if-ne v10, p1, :cond_6

    .line 7821
    sub-int v10, p2, p1

    invoke-virtual {v0, v10, v6}, Landroid/support/v7/widget/bi;->a(IZ)V

    .line 7815
    :cond_4
    :goto_5
    add-int/lit8 v0, v5, 0x1

    move v5, v0

    goto :goto_4

    :cond_5
    move v1, v2

    move v3, p1

    move v4, p2

    .line 7812
    goto :goto_3

    .line 7823
    :cond_6
    invoke-virtual {v0, v1, v6}, Landroid/support/v7/widget/bi;->a(IZ)V

    goto :goto_5

    .line 7163
    :cond_7
    invoke-virtual {v7}, Landroid/support/v7/widget/RecyclerView;->requestLayout()V

    .line 688
    iget-object v0, p0, Landroid/support/v7/widget/ak;->a:Landroid/support/v7/widget/RecyclerView;

    iput-boolean v2, v0, Landroid/support/v7/widget/RecyclerView;->f:Z

    .line 689
    return-void
.end method
