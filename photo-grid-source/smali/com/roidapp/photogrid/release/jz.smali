.class final Lcom/roidapp/photogrid/release/jz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ImageSelector;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ImageSelector;)V
    .locals 0

    .prologue
    .line 842
    iput-object p1, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 852
    packed-switch p3, :pswitch_data_0

    .line 882
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->u(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-eq p3, v0, :cond_1

    .line 885
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0, p3}, Lcom/roidapp/photogrid/release/ImageSelector;->c(Lcom/roidapp/photogrid/release/ImageSelector;I)I

    .line 886
    iget-object v1, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->u(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    invoke-interface {v0, p3}, Landroid/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->c(Lcom/roidapp/photogrid/release/ImageSelector;Ljava/lang/String;)Ljava/lang/String;

    .line 889
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->h(Lcom/roidapp/photogrid/release/ImageSelector;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 890
    if-lez v0, :cond_0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->h(Lcom/roidapp/photogrid/release/ImageSelector;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 891
    iget-object v1, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->h(Lcom/roidapp/photogrid/release/ImageSelector;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 892
    const-string v1, "PicsArt"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 893
    const-string v0, "PicsArt"

    invoke-static {v0}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;)V

    .line 904
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    sget v1, Lcom/roidapp/photogrid/release/ke;->e:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->b(Lcom/roidapp/photogrid/release/ImageSelector;I)I

    .line 905
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->r(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/baselib/view/FixedDrawerLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->q(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->f(Landroid/view/View;)V

    .line 912
    :cond_1
    :goto_1
    return-void

    .line 854
    :pswitch_0
    const-string v0, "cloudFragment"

    iget-object v1, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->B(Lcom/roidapp/photogrid/release/ImageSelector;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 855
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->r(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/baselib/view/FixedDrawerLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->q(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->f(Landroid/view/View;)V

    goto :goto_1

    .line 858
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0, p3}, Lcom/roidapp/photogrid/release/ImageSelector;->c(Lcom/roidapp/photogrid/release/ImageSelector;I)I

    .line 859
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    sget v1, Lcom/roidapp/photogrid/release/ke;->b:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->b(Lcom/roidapp/photogrid/release/ImageSelector;I)I

    .line 860
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->r(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/baselib/view/FixedDrawerLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->q(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->f(Landroid/view/View;)V

    goto :goto_1

    .line 863
    :pswitch_1
    const-string v0, "myfolder"

    iget-object v1, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->B(Lcom/roidapp/photogrid/release/ImageSelector;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 864
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->r(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/baselib/view/FixedDrawerLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->q(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->f(Landroid/view/View;)V

    goto :goto_1

    .line 867
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0, p3}, Lcom/roidapp/photogrid/release/ImageSelector;->c(Lcom/roidapp/photogrid/release/ImageSelector;I)I

    .line 868
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    sget v1, Lcom/roidapp/photogrid/release/ke;->c:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->b(Lcom/roidapp/photogrid/release/ImageSelector;I)I

    .line 869
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->r(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/baselib/view/FixedDrawerLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->q(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->f(Landroid/view/View;)V

    goto :goto_1

    .line 873
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->u(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-eq p3, v0, :cond_1

    .line 876
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0, p3}, Lcom/roidapp/photogrid/release/ImageSelector;->c(Lcom/roidapp/photogrid/release/ImageSelector;I)I

    .line 877
    iget-object v1, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->u(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    invoke-interface {v0, p3}, Landroid/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->c(Lcom/roidapp/photogrid/release/ImageSelector;Ljava/lang/String;)Ljava/lang/String;

    .line 878
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    sget v1, Lcom/roidapp/photogrid/release/ke;->d:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->b(Lcom/roidapp/photogrid/release/ImageSelector;I)I

    .line 879
    iget-object v0, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->r(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/baselib/view/FixedDrawerLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/jz;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->q(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->f(Landroid/view/View;)V

    goto/16 :goto_1

    .line 894
    :cond_4
    const-string v1, "Instagram"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 895
    const-string v0, "Instagram"

    invoke-static {v0}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 896
    :cond_5
    const-string v1, "Retrica"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 897
    const-string v0, "Retrica"

    invoke-static {v0}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 898
    :cond_6
    const-string v1, "LINEcamera"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 899
    const-string v0, "LINEcamera"

    invoke-static {v0}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 852
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
