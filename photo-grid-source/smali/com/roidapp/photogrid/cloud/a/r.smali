.class final Lcom/roidapp/photogrid/cloud/a/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/a/q;

.field private b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/String;

.field private d:I

.field private e:Z


# direct methods
.method private constructor <init>(Lcom/roidapp/photogrid/cloud/a/q;Z)V
    .locals 4

    .prologue
    .line 542
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/a/r;->a:Lcom/roidapp/photogrid/cloud/a/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 543
    iget-object v0, p1, Lcom/roidapp/photogrid/cloud/a/q;->f:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p1, Lcom/roidapp/photogrid/cloud/a/q;->f:Ljava/lang/String;

    const-string v2, "/"

    const-string v3, "_"

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "__"

    const-string v2, "_"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/a/r;->c:Ljava/lang/String;

    .line 544
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/r;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Page"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;II)V

    .line 545
    iput-boolean p2, p0, Lcom/roidapp/photogrid/cloud/a/r;->e:Z

    .line 546
    return-void

    .line 543
    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method synthetic constructor <init>(Lcom/roidapp/photogrid/cloud/a/q;ZB)V
    .locals 0

    .prologue
    .line 536
    invoke-direct {p0, p1, p2}, Lcom/roidapp/photogrid/cloud/a/r;-><init>(Lcom/roidapp/photogrid/cloud/a/q;Z)V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/a/r;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 536
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/r;->c:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final onScroll(Landroid/widget/AbsListView;III)V
    .locals 10

    .prologue
    const/4 v9, 0x5

    const/4 v2, 0x0

    .line 697
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/r;->a:Lcom/roidapp/photogrid/cloud/a/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/a/q;->a(Lcom/roidapp/photogrid/cloud/a/q;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_6

    if-eqz p3, :cond_6

    if-eqz p1, :cond_6

    .line 698
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/r;->b:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 699
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/r;->a:Lcom/roidapp/photogrid/cloud/a/q;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/a/q;->a(Lcom/roidapp/photogrid/cloud/a/q;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/a/r;->b:Ljava/util/Set;

    .line 700
    :cond_0
    check-cast p1, Landroid/widget/ListView;

    invoke-virtual {p1}, Landroid/widget/ListView;->getHeaderViewsCount()I

    move-result v0

    .line 701
    sub-int v0, p2, v0

    .line 703
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/r;->a:Lcom/roidapp/photogrid/cloud/a/q;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/a/q;->a(Lcom/roidapp/photogrid/cloud/a/q;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v6

    move v4, v0

    move v5, v2

    :goto_0
    if-ge v5, p3, :cond_6

    .line 704
    if-ltz v4, :cond_2

    .line 706
    if-ge v4, v6, :cond_6

    .line 709
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/r;->a:Lcom/roidapp/photogrid/cloud/a/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/a/q;->a(Lcom/roidapp/photogrid/cloud/a/q;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/cloud/a/l;

    .line 711
    if-eqz v0, :cond_2

    iget-boolean v1, v0, Lcom/roidapp/photogrid/cloud/a/l;->f:Z

    if-nez v1, :cond_2

    .line 713
    const/4 v1, 0x0

    .line 715
    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/a/l;->d()I

    move-result v3

    packed-switch v3, :pswitch_data_0

    :cond_1
    move v0, v2

    .line 759
    :goto_1
    if-eqz v1, :cond_2

    .line 760
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    .line 761
    iget-object v7, p0, Lcom/roidapp/photogrid/cloud/a/r;->b:Ljava/util/Set;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    .line 762
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v8, p0, Lcom/roidapp/photogrid/cloud/a/r;->c:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v9, v0}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;II)V

    .line 763
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/r;->b:Ljava/util/Set;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 703
    :cond_2
    add-int/lit8 v1, v5, 0x1

    add-int/lit8 v0, v4, 0x1

    move v4, v0

    move v5, v1

    goto :goto_0

    .line 717
    :pswitch_0
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v9, :cond_4

    .line 718
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/r;->a:Lcom/roidapp/photogrid/cloud/a/q;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/cloud/a/q;->b:Z

    if-nez v0, :cond_3

    .line 719
    const-string v0, "Filter"

    move-object v1, v0

    move v0, v2

    goto :goto_1

    .line 720
    :cond_3
    const-string v0, "Retouch"

    move-object v1, v0

    move v0, v2

    goto :goto_1

    .line 721
    :cond_4
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v0, :cond_1

    .line 722
    const-string v0, "Template"

    move-object v1, v0

    move v0, v2

    goto :goto_1

    .line 725
    :pswitch_1
    const-string v0, "Sticker"

    move-object v1, v0

    move v0, v2

    .line 726
    goto :goto_1

    .line 728
    :pswitch_2
    const-string v0, "mode"

    move-object v1, v0

    move v0, v2

    .line 729
    goto :goto_1

    .line 731
    :pswitch_3
    iget v3, p0, Lcom/roidapp/photogrid/cloud/a/r;->d:I

    if-nez v3, :cond_5

    .line 733
    const-string v3, "adCard1"

    move-object v1, v0

    .line 734
    check-cast v1, Lcom/roidapp/photogrid/cloud/a/a;

    iget v1, v1, Lcom/roidapp/photogrid/cloud/a/a;->b:I

    .line 735
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/r;->d:I

    move v0, v1

    move-object v1, v3

    goto :goto_1

    .line 736
    :cond_5
    iget v3, p0, Lcom/roidapp/photogrid/cloud/a/r;->d:I

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v7

    if-eq v3, v7, :cond_1

    .line 738
    const-string v3, "adCard2"

    move-object v1, v0

    .line 739
    check-cast v1, Lcom/roidapp/photogrid/cloud/a/a;

    iget v1, v1, Lcom/roidapp/photogrid/cloud/a/a;->b:I

    .line 740
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/r;->d:I

    move v0, v1

    move-object v1, v3

    goto/16 :goto_1

    .line 744
    :pswitch_4
    const-string v0, "CMBackup"

    move-object v1, v0

    move v0, v2

    .line 745
    goto/16 :goto_1

    .line 747
    :pswitch_5
    const-string v0, "followUS"

    move-object v1, v0

    move v0, v2

    .line 748
    goto/16 :goto_1

    .line 750
    :pswitch_6
    const-string v0, "home"

    move-object v1, v0

    move v0, v2

    .line 751
    goto/16 :goto_1

    .line 753
    :pswitch_7
    const-string v0, "Starcard"

    move-object v1, v0

    move v0, v2

    .line 754
    goto/16 :goto_1

    .line 756
    :pswitch_8
    const-string v0, "FBInvite"

    move-object v1, v0

    move v0, v2

    goto/16 :goto_1

    .line 769
    :cond_6
    return-void

    .line 715
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_6
        :pswitch_5
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method

.method public final onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 1

    .prologue
    .line 684
    const/4 v0, 0x1

    if-ne v0, p2, :cond_0

    .line 685
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/r;->a:Lcom/roidapp/photogrid/cloud/a/q;

    iget-object v0, v0, Lcom/roidapp/photogrid/cloud/a/q;->d:Lcom/roidapp/photogrid/release/ParentActivity;

    if-eqz v0, :cond_0

    .line 686
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/r;->a:Lcom/roidapp/photogrid/cloud/a/q;

    iget-object v0, v0, Lcom/roidapp/photogrid/cloud/a/q;->d:Lcom/roidapp/photogrid/release/ParentActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ParentActivity;->getCurrentFocus()Landroid/view/View;

    move-result-object v0

    .line 687
    if-eqz v0, :cond_0

    .line 688
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 693
    :cond_0
    return-void
.end method
