.class public abstract Landroid/support/v7/widget/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final a:Landroid/util/SparseIntArray;

.field private b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 653
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 655
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/t;->a:Landroid/util/SparseIntArray;

    .line 657
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/widget/t;->b:Z

    return-void
.end method


# virtual methods
.method public abstract a(I)I
.end method

.method public a(II)I
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 732
    invoke-virtual {p0, p1}, Landroid/support/v7/widget/t;->a(I)I

    move-result v4

    .line 733
    if-ne v4, p2, :cond_1

    .line 759
    :cond_0
    :goto_0
    return v1

    .line 739
    :cond_1
    iget-boolean v0, p0, Landroid/support/v7/widget/t;->b:Z

    if-eqz v0, :cond_8

    iget-object v0, p0, Landroid/support/v7/widget/t;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v0}, Landroid/util/SparseIntArray;->size()I

    move-result v0

    if-lez v0, :cond_8

    .line 1764
    iget-object v0, p0, Landroid/support/v7/widget/t;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v0}, Landroid/util/SparseIntArray;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v2, v1

    .line 1766
    :goto_1
    if-gt v2, v0, :cond_3

    .line 1767
    add-int v3, v2, v0

    ushr-int/lit8 v3, v3, 0x1

    .line 1768
    iget-object v5, p0, Landroid/support/v7/widget/t;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v5, v3}, Landroid/util/SparseIntArray;->keyAt(I)I

    move-result v5

    .line 1769
    if-ge v5, p1, :cond_2

    .line 1770
    add-int/lit8 v2, v3, 0x1

    goto :goto_1

    .line 1772
    :cond_2
    add-int/lit8 v0, v3, -0x1

    .line 1774
    goto :goto_1

    .line 1775
    :cond_3
    add-int/lit8 v0, v2, -0x1

    .line 1776
    if-ltz v0, :cond_5

    iget-object v2, p0, Landroid/support/v7/widget/t;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v2}, Landroid/util/SparseIntArray;->size()I

    move-result v2

    if-ge v0, v2, :cond_5

    .line 1777
    iget-object v2, p0, Landroid/support/v7/widget/t;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseIntArray;->keyAt(I)I

    move-result v0

    .line 741
    :goto_2
    if-ltz v0, :cond_8

    .line 742
    iget-object v2, p0, Landroid/support/v7/widget/t;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseIntArray;->get(I)I

    move-result v2

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/t;->a(I)I

    move-result v3

    add-int/2addr v2, v3

    .line 743
    add-int/lit8 v0, v0, 0x1

    :goto_3
    move v3, v0

    .line 746
    :goto_4
    if-ge v3, p1, :cond_7

    .line 747
    invoke-virtual {p0, v3}, Landroid/support/v7/widget/t;->a(I)I

    move-result v0

    .line 748
    add-int/2addr v2, v0

    .line 749
    if-ne v2, p2, :cond_6

    move v0, v1

    .line 746
    :cond_4
    :goto_5
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    move v2, v0

    goto :goto_4

    .line 1779
    :cond_5
    const/4 v0, -0x1

    goto :goto_2

    .line 751
    :cond_6
    if-gt v2, p2, :cond_4

    move v0, v2

    goto :goto_5

    .line 756
    :cond_7
    add-int v0, v2, v4

    if-gt v0, p2, :cond_0

    move v1, v2

    .line 757
    goto :goto_0

    :cond_8
    move v0, v1

    move v2, v1

    goto :goto_3
.end method

.method final b(II)I
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 696
    iget-boolean v0, p0, Landroid/support/v7/widget/t;->b:Z

    if-nez v0, :cond_1

    .line 697
    invoke-virtual {p0, p1, p2}, Landroid/support/v7/widget/t;->a(II)I

    move-result v0

    .line 705
    :cond_0
    :goto_0
    return v0

    .line 699
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/t;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseIntArray;->get(II)I

    move-result v0

    .line 700
    if-ne v0, v1, :cond_0

    .line 703
    invoke-virtual {p0, p1, p2}, Landroid/support/v7/widget/t;->a(II)I

    move-result v0

    .line 704
    iget-object v1, p0, Landroid/support/v7/widget/t;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v1, p1, v0}, Landroid/util/SparseIntArray;->put(II)V

    goto :goto_0
.end method

.method public final c(II)I
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 793
    .line 795
    invoke-virtual {p0, p1}, Landroid/support/v7/widget/t;->a(I)I

    move-result v5

    move v4, v2

    move v0, v2

    move v3, v2

    .line 796
    :goto_0
    if-ge v4, p1, :cond_1

    .line 797
    invoke-virtual {p0, v4}, Landroid/support/v7/widget/t;->a(I)I

    move-result v1

    .line 798
    add-int/2addr v3, v1

    .line 799
    if-ne v3, p2, :cond_0

    .line 801
    add-int/lit8 v0, v0, 0x1

    move v1, v2

    .line 796
    :goto_1
    add-int/lit8 v3, v4, 0x1

    move v4, v3

    move v3, v1

    goto :goto_0

    .line 802
    :cond_0
    if-le v3, p2, :cond_3

    .line 805
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 808
    :cond_1
    add-int v1, v3, v5

    if-le v1, p2, :cond_2

    .line 809
    add-int/lit8 v0, v0, 0x1

    .line 811
    :cond_2
    return v0

    :cond_3
    move v1, v3

    goto :goto_1
.end method
