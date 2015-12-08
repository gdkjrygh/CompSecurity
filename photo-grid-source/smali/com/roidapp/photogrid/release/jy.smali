.class final Lcom/roidapp/photogrid/release/jy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/baselib/view/j;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ImageSelector;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ImageSelector;)V
    .locals 0

    .prologue
    .line 747
    iput-object p1, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 831
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Lcom/roidapp/photogrid/release/ImageSelector;Z)Z

    .line 833
    return-void
.end method

.method public final a(F)V
    .locals 5

    .prologue
    const/4 v4, 0x4

    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 770
    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-nez v0, :cond_1

    .line 771
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0, v3}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Lcom/roidapp/photogrid/release/ImageSelector;Z)Z

    .line 772
    sget-object v0, Lcom/roidapp/photogrid/release/jv;->a:[I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->x(Lcom/roidapp/photogrid/release/ImageSelector;)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 822
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    sget v1, Lcom/roidapp/photogrid/release/ke;->a:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->b(Lcom/roidapp/photogrid/release/ImageSelector;I)I

    .line 827
    :goto_1
    return-void

    .line 774
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->v(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/release/la;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 775
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->v(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/release/la;

    move-result-object v0

    invoke-virtual {v0, v3, v2}, Lcom/roidapp/photogrid/release/la;->a(IZ)V

    .line 776
    const-string v0, "ImageSelector/initCloud"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 777
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->s(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/release/kp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/kp;->a()V

    .line 778
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->s(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/release/kp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/kp;->g()V

    .line 779
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->y(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/release/kt;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/kt;->b()V

    .line 780
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->z(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/ImageButton;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/ImageButton;->setVisibility(I)V

    goto :goto_0

    .line 784
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->v(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/release/la;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 785
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->v(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/release/la;

    move-result-object v0

    invoke-virtual {v0, v2, v2}, Lcom/roidapp/photogrid/release/la;->a(IZ)V

    .line 786
    const-string v0, "ImageSelector/initMyFolders"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 787
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->s(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/release/kp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/kp;->a()V

    .line 788
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->s(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/release/kp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/kp;->g()V

    .line 789
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->y(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/release/kt;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/kt;->c()V

    .line 790
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->z(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/ImageButton;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/ImageButton;->setVisibility(I)V

    goto :goto_0

    .line 794
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->v(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/release/la;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 795
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->v(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/release/la;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/la;->notifyDataSetChanged()V

    .line 796
    const-string v0, "ImageSelector/initRecent"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 797
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->s(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/release/kp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/kp;->a()V

    .line 798
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->s(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/release/kp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/kp;->g()V

    .line 799
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->y(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/release/kt;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/kt;->a(I)V

    .line 800
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->z(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/ImageButton;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/ImageButton;->setVisibility(I)V

    goto/16 :goto_0

    .line 804
    :pswitch_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->v(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/release/la;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 805
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->v(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/release/la;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/la;->notifyDataSetChanged()V

    .line 806
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->s(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/release/kp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/kp;->a()V

    .line 807
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->s(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/release/kp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/kp;->g()V

    .line 808
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->A(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->h(Lcom/roidapp/photogrid/release/ImageSelector;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 809
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->h(Lcom/roidapp/photogrid/release/ImageSelector;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Ljava/lang/String;I)V

    .line 810
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->k(Lcom/roidapp/photogrid/release/ImageSelector;)Ljava/util/List;

    move-result-object v0

    new-array v2, v3, [Lcom/roidapp/photogrid/release/ig;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/photogrid/release/ig;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 811
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->z(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/ImageButton;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/ImageButton;->setVisibility(I)V

    goto/16 :goto_0

    .line 816
    :pswitch_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->s(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/release/kp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/kp;->a()V

    .line 817
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->s(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/release/kp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/kp;->d()V

    goto/16 :goto_0

    .line 824
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Lcom/roidapp/photogrid/release/ImageSelector;Z)Z

    goto/16 :goto_1

    .line 772
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 751
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 752
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->u(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/ListView;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->u(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    if-nez v0, :cond_0

    .line 753
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->u(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/ListView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->v(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/release/la;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 754
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->w(Lcom/roidapp/photogrid/release/ImageSelector;)I

    move-result v0

    const/4 v1, 0x2

    if-le v0, v1, :cond_0

    .line 755
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->u(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/ListView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->w(Lcom/roidapp/photogrid/release/ImageSelector;)I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V

    .line 758
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    sget v1, Lcom/roidapp/photogrid/release/ke;->f:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->b(Lcom/roidapp/photogrid/release/ImageSelector;I)I

    .line 759
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->s(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/release/kp;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 760
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->s(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/release/kp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/kp;->b()V

    .line 761
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jy;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->s(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/release/kp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/kp;->c()V

    .line 766
    :cond_1
    return-void
.end method

.method public final b()V
    .locals 0

    .prologue
    .line 838
    return-void
.end method
