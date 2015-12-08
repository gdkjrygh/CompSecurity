.class public final Lcom/roidapp/baselib/hlistview/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/baselib/hlistview/AbsHListView;

.field private b:I

.field private c:[Landroid/view/View;

.field private d:[Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private e:I

.field private f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private h:Landroid/support/v4/util/SparseArrayCompat;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/SparseArrayCompat",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/roidapp/baselib/hlistview/AbsHListView;)V
    .locals 1

    .prologue
    .line 5453
    iput-object p1, p0, Lcom/roidapp/baselib/hlistview/n;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5467
    const/4 v0, 0x0

    new-array v0, v0, [Landroid/view/View;

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->c:[Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 5498
    iget v0, p0, Lcom/roidapp/baselib/hlistview/n;->e:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    .line 5499
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/n;->f:Ljava/util/ArrayList;

    .line 5500
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v2, v1

    .line 5501
    :goto_0
    if-ge v2, v4, :cond_2

    .line 5502
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->forceLayout()V

    .line 5501
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 5505
    :cond_0
    iget v4, p0, Lcom/roidapp/baselib/hlistview/n;->e:I

    move v3, v1

    .line 5506
    :goto_1
    if-ge v3, v4, :cond_2

    .line 5507
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->d:[Ljava/util/ArrayList;

    aget-object v5, v0, v3

    .line 5508
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    move v2, v1

    .line 5509
    :goto_2
    if-ge v2, v6, :cond_1

    .line 5510
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->forceLayout()V

    .line 5509
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_2

    .line 5506
    :cond_1
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    .line 5514
    :cond_2
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->h:Landroid/support/v4/util/SparseArrayCompat;

    if-eqz v0, :cond_3

    .line 5515
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->h:Landroid/support/v4/util/SparseArrayCompat;

    invoke-virtual {v0}, Landroid/support/v4/util/SparseArrayCompat;->size()I

    move-result v2

    .line 5516
    :goto_3
    if-ge v1, v2, :cond_3

    .line 5517
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->h:Landroid/support/v4/util/SparseArrayCompat;

    invoke-virtual {v0, v1}, Landroid/support/v4/util/SparseArrayCompat;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->forceLayout()V

    .line 5516
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_3

    .line 5520
    :cond_3
    return-void
.end method

.method public final a(I)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 5484
    if-gtz p1, :cond_0

    .line 5485
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t have a viewTypeCount < 1"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 5488
    :cond_0
    new-array v2, p1, [Ljava/util/ArrayList;

    move v0, v1

    .line 5489
    :goto_0
    if-ge v0, p1, :cond_1

    .line 5490
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    aput-object v3, v2, v0

    .line 5489
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 5492
    :cond_1
    iput p1, p0, Lcom/roidapp/baselib/hlistview/n;->e:I

    .line 5493
    aget-object v0, v2, v1

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->f:Ljava/util/ArrayList;

    .line 5494
    iput-object v2, p0, Lcom/roidapp/baselib/hlistview/n;->d:[Ljava/util/ArrayList;

    .line 5495
    return-void
.end method

.method public final a(II)V
    .locals 5

    .prologue
    .line 5560
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->c:[Landroid/view/View;

    array-length v0, v0

    if-ge v0, p1, :cond_0

    .line 5561
    new-array v0, p1, [Landroid/view/View;

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->c:[Landroid/view/View;

    .line 5563
    :cond_0
    iput p2, p0, Lcom/roidapp/baselib/hlistview/n;->b:I

    .line 5565
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/n;->c:[Landroid/view/View;

    .line 5566
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p1, :cond_2

    .line 5567
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 5568
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/hlistview/AbsHListView$LayoutParams;

    .line 5570
    if-eqz v0, :cond_1

    iget v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView$LayoutParams;->a:I

    const/4 v4, -0x2

    if-eq v0, v4, :cond_1

    .line 5573
    aput-object v3, v2, v1

    .line 5566
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 5576
    :cond_2
    return-void
.end method

.method public final a(Landroid/view/View;I)V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 5641
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/hlistview/AbsHListView$LayoutParams;

    .line 5642
    if-nez v0, :cond_1

    .line 5685
    :cond_0
    :goto_0
    return-void

    .line 5646
    :cond_1
    iput p2, v0, Lcom/roidapp/baselib/hlistview/AbsHListView$LayoutParams;->d:I

    .line 5650
    iget v4, v0, Lcom/roidapp/baselib/hlistview/AbsHListView$LayoutParams;->a:I

    .line 5652
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x10

    if-lt v0, v3, :cond_7

    invoke-virtual {p1}, Landroid/view/View;->hasTransientState()Z

    move-result v0

    move v3, v0

    .line 6523
    :goto_1
    if-ltz v4, :cond_8

    move v0, v1

    .line 5654
    :goto_2
    if-eqz v0, :cond_2

    if-eqz v3, :cond_9

    .line 5655
    :cond_2
    const/4 v0, -0x2

    if-ne v4, v0, :cond_3

    if-eqz v3, :cond_5

    .line 5656
    :cond_3
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->g:Ljava/util/ArrayList;

    if-nez v0, :cond_4

    .line 5657
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->g:Ljava/util/ArrayList;

    .line 5659
    :cond_4
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 5661
    :cond_5
    if-eqz v3, :cond_0

    .line 5662
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->h:Landroid/support/v4/util/SparseArrayCompat;

    if-nez v0, :cond_6

    .line 5663
    new-instance v0, Landroid/support/v4/util/SparseArrayCompat;

    invoke-direct {v0}, Landroid/support/v4/util/SparseArrayCompat;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->h:Landroid/support/v4/util/SparseArrayCompat;

    .line 5665
    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->onStartTemporaryDetach()V

    .line 5666
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->h:Landroid/support/v4/util/SparseArrayCompat;

    invoke-virtual {v0, p2, p1}, Landroid/support/v4/util/SparseArrayCompat;->put(ILjava/lang/Object;)V

    goto :goto_0

    :cond_7
    move v3, v2

    .line 5652
    goto :goto_1

    :cond_8
    move v0, v2

    .line 6523
    goto :goto_2

    .line 5671
    :cond_9
    invoke-virtual {p1}, Landroid/view/View;->onStartTemporaryDetach()V

    .line 5672
    iget v0, p0, Lcom/roidapp/baselib/hlistview/n;->e:I

    if-ne v0, v1, :cond_a

    .line 5673
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 5678
    :goto_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    .line 5679
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setAccessibilityDelegate(Landroid/view/View$AccessibilityDelegate;)V

    goto :goto_0

    .line 5675
    :cond_a
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->d:[Ljava/util/ArrayList;

    aget-object v0, v0, v4

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3
.end method

.method public final b(I)Landroid/view/View;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 5586
    iget v0, p0, Lcom/roidapp/baselib/hlistview/n;->b:I

    sub-int v2, p1, v0

    .line 5587
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/n;->c:[Landroid/view/View;

    .line 5588
    if-ltz v2, :cond_0

    array-length v0, v3

    if-ge v2, v0, :cond_0

    .line 5589
    aget-object v0, v3, v2

    .line 5590
    aput-object v1, v3, v2

    .line 5593
    :goto_0
    return-object v0

    :cond_0
    move-object v0, v1

    goto :goto_0
.end method

.method public final b()V
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 5530
    iget v0, p0, Lcom/roidapp/baselib/hlistview/n;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 5531
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/n;->f:Ljava/util/ArrayList;

    .line 5532
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 5533
    :goto_0
    if-ge v2, v3, :cond_2

    .line 5534
    iget-object v4, p0, Lcom/roidapp/baselib/hlistview/n;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    add-int/lit8 v0, v3, -0x1

    sub-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-static {v4, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(Lcom/roidapp/baselib/hlistview/AbsHListView;Landroid/view/View;)V

    .line 5533
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 5537
    :cond_0
    iget v4, p0, Lcom/roidapp/baselib/hlistview/n;->e:I

    move v3, v2

    .line 5538
    :goto_1
    if-ge v3, v4, :cond_2

    .line 5539
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->d:[Ljava/util/ArrayList;

    aget-object v5, v0, v3

    .line 5540
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    move v1, v2

    .line 5541
    :goto_2
    if-ge v1, v6, :cond_1

    .line 5542
    iget-object v7, p0, Lcom/roidapp/baselib/hlistview/n;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    add-int/lit8 v0, v6, -0x1

    sub-int/2addr v0, v1

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-static {v7, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->b(Lcom/roidapp/baselib/hlistview/AbsHListView;Landroid/view/View;)V

    .line 5541
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    .line 5538
    :cond_1
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    .line 5546
    :cond_2
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->h:Landroid/support/v4/util/SparseArrayCompat;

    if-eqz v0, :cond_3

    .line 5547
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->h:Landroid/support/v4/util/SparseArrayCompat;

    invoke-virtual {v0}, Landroid/support/v4/util/SparseArrayCompat;->clear()V

    .line 5549
    :cond_3
    return-void
.end method

.method final c(I)Landroid/view/View;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 5597
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/n;->h:Landroid/support/v4/util/SparseArrayCompat;

    if-nez v1, :cond_1

    .line 5606
    :cond_0
    :goto_0
    return-object v0

    .line 5600
    :cond_1
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/n;->h:Landroid/support/v4/util/SparseArrayCompat;

    invoke-virtual {v1, p1}, Landroid/support/v4/util/SparseArrayCompat;->indexOfKey(I)I

    move-result v1

    .line 5601
    if-ltz v1, :cond_0

    .line 5604
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->h:Landroid/support/v4/util/SparseArrayCompat;

    invoke-virtual {v0, v1}, Landroid/support/v4/util/SparseArrayCompat;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 5605
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/n;->h:Landroid/support/v4/util/SparseArrayCompat;

    invoke-virtual {v2, v1}, Landroid/support/v4/util/SparseArrayCompat;->removeAt(I)V

    goto :goto_0
.end method

.method final c()V
    .locals 1

    .prologue
    .line 5613
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->h:Landroid/support/v4/util/SparseArrayCompat;

    if-eqz v0, :cond_0

    .line 5614
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->h:Landroid/support/v4/util/SparseArrayCompat;

    invoke-virtual {v0}, Landroid/support/v4/util/SparseArrayCompat;->clear()V

    .line 5616
    :cond_0
    return-void
.end method

.method final d(I)Landroid/view/View;
    .locals 2

    .prologue
    .line 5622
    iget v0, p0, Lcom/roidapp/baselib/hlistview/n;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 5623
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->f:Ljava/util/ArrayList;

    invoke-static {v0, p1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(Ljava/util/ArrayList;I)Landroid/view/View;

    move-result-object v0

    .line 5630
    :goto_0
    return-object v0

    .line 5625
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/AbsHListView;->j:Landroid/widget/ListAdapter;

    invoke-interface {v0, p1}, Landroid/widget/ListAdapter;->getItemViewType(I)I

    move-result v0

    .line 5626
    if-ltz v0, :cond_1

    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/n;->d:[Ljava/util/ArrayList;

    array-length v1, v1

    if-ge v0, v1, :cond_1

    .line 5627
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/n;->d:[Ljava/util/ArrayList;

    aget-object v0, v1, v0

    invoke-static {v0, p1}, Lcom/roidapp/baselib/hlistview/AbsHListView;->a(Ljava/util/ArrayList;I)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 5630
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final d()V
    .locals 4

    .prologue
    .line 5691
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->g:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 5699
    :goto_0
    return-void

    .line 5694
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 5695
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    if-ge v1, v2, :cond_1

    .line 5696
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/n;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-static {v3, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->c(Lcom/roidapp/baselib/hlistview/AbsHListView;Landroid/view/View;)V

    .line 5695
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 5698
    :cond_1
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    goto :goto_0
.end method

.method public final e()V
    .locals 12
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    const/4 v11, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 5706
    iget-object v8, p0, Lcom/roidapp/baselib/hlistview/n;->c:[Landroid/view/View;

    .line 5708
    iget v0, p0, Lcom/roidapp/baselib/hlistview/n;->e:I

    if-le v0, v2, :cond_5

    move v1, v2

    .line 5710
    :goto_0
    iget-object v4, p0, Lcom/roidapp/baselib/hlistview/n;->f:Ljava/util/ArrayList;

    .line 5711
    array-length v0, v8

    .line 5712
    add-int/lit8 v0, v0, -0x1

    move v7, v0

    :goto_1
    if-ltz v7, :cond_a

    .line 5713
    aget-object v9, v8, v7

    .line 5714
    if-eqz v9, :cond_4

    .line 5715
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/hlistview/AbsHListView$LayoutParams;

    .line 5716
    iget v10, v0, Lcom/roidapp/baselib/hlistview/AbsHListView$LayoutParams;->a:I

    .line 5718
    aput-object v11, v8, v7

    .line 5720
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x10

    if-lt v5, v6, :cond_6

    invoke-virtual {v9}, Landroid/view/View;->hasTransientState()Z

    move-result v5

    move v6, v5

    .line 7523
    :goto_2
    if-ltz v10, :cond_7

    move v5, v2

    .line 5721
    :goto_3
    if-eqz v5, :cond_0

    if-eqz v6, :cond_8

    .line 5723
    :cond_0
    const/4 v0, -0x2

    if-ne v10, v0, :cond_1

    if-eqz v6, :cond_2

    .line 5725
    :cond_1
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    invoke-static {v0, v9}, Lcom/roidapp/baselib/hlistview/AbsHListView;->d(Lcom/roidapp/baselib/hlistview/AbsHListView;Landroid/view/View;)V

    .line 5727
    :cond_2
    if-eqz v6, :cond_4

    .line 5728
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->h:Landroid/support/v4/util/SparseArrayCompat;

    if-nez v0, :cond_3

    .line 5729
    new-instance v0, Landroid/support/v4/util/SparseArrayCompat;

    invoke-direct {v0}, Landroid/support/v4/util/SparseArrayCompat;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->h:Landroid/support/v4/util/SparseArrayCompat;

    .line 5731
    :cond_3
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->h:Landroid/support/v4/util/SparseArrayCompat;

    iget v5, p0, Lcom/roidapp/baselib/hlistview/n;->b:I

    add-int/2addr v5, v7

    invoke-virtual {v0, v5, v9}, Landroid/support/v4/util/SparseArrayCompat;->put(ILjava/lang/Object;)V

    .line 5712
    :cond_4
    :goto_4
    add-int/lit8 v0, v7, -0x1

    move v7, v0

    goto :goto_1

    :cond_5
    move v1, v3

    .line 5708
    goto :goto_0

    :cond_6
    move v6, v3

    .line 5720
    goto :goto_2

    :cond_7
    move v5, v3

    .line 7523
    goto :goto_3

    .line 5736
    :cond_8
    if-eqz v1, :cond_9

    .line 5737
    iget-object v4, p0, Lcom/roidapp/baselib/hlistview/n;->d:[Ljava/util/ArrayList;

    aget-object v4, v4, v10

    .line 5739
    :cond_9
    invoke-virtual {v9}, Landroid/view/View;->onStartTemporaryDetach()V

    .line 5740
    iget v5, p0, Lcom/roidapp/baselib/hlistview/n;->b:I

    add-int/2addr v5, v7

    iput v5, v0, Lcom/roidapp/baselib/hlistview/AbsHListView$LayoutParams;->d:I

    .line 5741
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 5743
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0xe

    if-lt v0, v5, :cond_4

    .line 5744
    invoke-virtual {v9, v11}, Landroid/view/View;->setAccessibilityDelegate(Landroid/view/View$AccessibilityDelegate;)V

    goto :goto_4

    .line 7762
    :cond_a
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->c:[Landroid/view/View;

    array-length v5, v0

    .line 7763
    iget v6, p0, Lcom/roidapp/baselib/hlistview/n;->e:I

    .line 7764
    iget-object v7, p0, Lcom/roidapp/baselib/hlistview/n;->d:[Ljava/util/ArrayList;

    move v4, v3

    .line 7765
    :goto_5
    if-ge v4, v6, :cond_c

    .line 7766
    aget-object v8, v7, v4

    .line 7767
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 7768
    sub-int v9, v0, v5

    .line 7769
    add-int/lit8 v0, v0, -0x1

    move v1, v3

    .line 7770
    :goto_6
    if-ge v1, v9, :cond_b

    .line 7771
    iget-object v10, p0, Lcom/roidapp/baselib/hlistview/n;->a:Lcom/roidapp/baselib/hlistview/AbsHListView;

    add-int/lit8 v2, v0, -0x1

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-static {v10, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView;->e(Lcom/roidapp/baselib/hlistview/AbsHListView;Landroid/view/View;)V

    .line 7770
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    move v0, v2

    goto :goto_6

    .line 7765
    :cond_b
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_5

    .line 7775
    :cond_c
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->h:Landroid/support/v4/util/SparseArrayCompat;

    if-eqz v0, :cond_e

    .line 7776
    :goto_7
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->h:Landroid/support/v4/util/SparseArrayCompat;

    invoke-virtual {v0}, Landroid/support/v4/util/SparseArrayCompat;->size()I

    move-result v0

    if-ge v3, v0, :cond_e

    .line 7777
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->h:Landroid/support/v4/util/SparseArrayCompat;

    invoke-virtual {v0, v3}, Landroid/support/v4/util/SparseArrayCompat;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 7780
    invoke-virtual {v0}, Landroid/view/View;->hasTransientState()Z

    move-result v0

    if-nez v0, :cond_d

    .line 7781
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->h:Landroid/support/v4/util/SparseArrayCompat;

    invoke-virtual {v0, v3}, Landroid/support/v4/util/SparseArrayCompat;->removeAt(I)V

    .line 7782
    add-int/lit8 v3, v3, -0x1

    .line 7776
    :cond_d
    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    .line 5754
    :cond_e
    return-void
.end method

.method final e(I)V
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 5811
    iget v0, p0, Lcom/roidapp/baselib/hlistview/n;->e:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    .line 5812
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/n;->f:Ljava/util/ArrayList;

    .line 5813
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v2, v1

    .line 5814
    :goto_0
    if-ge v2, v4, :cond_2

    .line 5815
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setDrawingCacheBackgroundColor(I)V

    .line 5814
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 5818
    :cond_0
    iget v4, p0, Lcom/roidapp/baselib/hlistview/n;->e:I

    move v3, v1

    .line 5819
    :goto_1
    if-ge v3, v4, :cond_2

    .line 5820
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/n;->d:[Ljava/util/ArrayList;

    aget-object v5, v0, v3

    .line 5821
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    move v2, v1

    .line 5822
    :goto_2
    if-ge v2, v6, :cond_1

    .line 5823
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setDrawingCacheBackgroundColor(I)V

    .line 5822
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_2

    .line 5819
    :cond_1
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    .line 5828
    :cond_2
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/n;->c:[Landroid/view/View;

    .line 5829
    array-length v3, v2

    move v0, v1

    .line 5830
    :goto_3
    if-ge v0, v3, :cond_4

    .line 5831
    aget-object v1, v2, v0

    .line 5832
    if-eqz v1, :cond_3

    .line 5833
    invoke-virtual {v1, p1}, Landroid/view/View;->setDrawingCacheBackgroundColor(I)V

    .line 5830
    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 5836
    :cond_4
    return-void
.end method
