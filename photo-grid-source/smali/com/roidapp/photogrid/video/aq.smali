.class final Lcom/roidapp/photogrid/video/aq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/video/TrackSelector;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/TrackSelector;)V
    .locals 0

    .prologue
    .line 915
    iput-object p1, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 7
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
    const/4 v6, 0x1

    const/4 v5, 0x0

    const/16 v4, 0x8

    .line 921
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->D(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p3, v0, :cond_1

    .line 990
    :cond_0
    :goto_0
    return-void

    .line 924
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->E(Lcom/roidapp/photogrid/video/TrackSelector;)I

    move-result v0

    if-eq v0, p3, :cond_0

    .line 927
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->h(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/XListView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/XListView;->c()V

    .line 929
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->h(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/XListView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/XListView;->b()V

    .line 932
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0, p3}, Lcom/roidapp/photogrid/video/TrackSelector;->c(Lcom/roidapp/photogrid/video/TrackSelector;I)I

    .line 933
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->i(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/g;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->E(Lcom/roidapp/photogrid/video/TrackSelector;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/g;->a(I)V

    .line 935
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    sget v1, Lcom/roidapp/photogrid/video/bg;->e:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/video/TrackSelector;->d(Lcom/roidapp/photogrid/video/TrackSelector;I)I

    .line 936
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->G(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/baselib/view/FixedDrawerLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->F(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->f(Landroid/view/View;)V

    .line 937
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->l(Lcom/roidapp/photogrid/video/TrackSelector;)V

    .line 938
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->i(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/g;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->E(Lcom/roidapp/photogrid/video/TrackSelector;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/g;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/onlinemusic/Genre;

    .line 939
    iget-object v1, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget v2, v0, Lcom/roidapp/photogrid/video/onlinemusic/Genre;->genre_id:I

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/video/TrackSelector;->e(Lcom/roidapp/photogrid/video/TrackSelector;I)I

    .line 941
    iget-object v1, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v1, v1, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    if-eqz v1, :cond_2

    .line 942
    iget-object v1, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v2, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v2, v2, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    iget-object v3, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v3}, Lcom/roidapp/photogrid/video/TrackSelector;->e(Lcom/roidapp/photogrid/video/TrackSelector;)I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/video/q;->e(I)I

    move-result v2

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/video/TrackSelector;->a(Lcom/roidapp/photogrid/video/TrackSelector;I)I

    .line 944
    :cond_2
    iget-object v1, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->g(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/ad;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/ad;->a()V

    .line 945
    iget-object v1, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->h(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/XListView;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v2}, Lcom/roidapp/photogrid/video/TrackSelector;->g(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/ad;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/video/XListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 947
    iget-object v1, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v2, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/video/TrackSelector;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v5}, Lcom/roidapp/photogrid/video/TrackSelector;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "last_gener_id"

    iget-object v3, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v3}, Lcom/roidapp/photogrid/video/TrackSelector;->e(Lcom/roidapp/photogrid/video/TrackSelector;)I

    move-result v3

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 948
    iget-object v1, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->H(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/TextView;

    move-result-object v1

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/Genre;->genre_title:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 949
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->z(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/f;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/photogrid/video/f;->b()I

    move-result v0

    if-gtz v0, :cond_5

    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->z(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/f;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/photogrid/video/f;->c()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 950
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->j(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 951
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->h(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/XListView;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 952
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->h(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/XListView;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/roidapp/photogrid/video/XListView;->a(Z)V

    .line 958
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->e(Lcom/roidapp/photogrid/video/TrackSelector;)I

    move-result v0

    const v1, 0x989682

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->z(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/f;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->z(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/f;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/photogrid/video/f;->b()I

    move-result v0

    if-lez v0, :cond_6

    .line 959
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->h(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/XListView;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 960
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->h(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/XListView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/XListView;->a()V

    .line 968
    :cond_4
    :goto_2
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->b(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 969
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->g(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/ad;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/ad;->getCount()I

    move-result v0

    if-gtz v0, :cond_8

    .line 971
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->m(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 972
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->k(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 973
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->h(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/XListView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/XListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 974
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->h(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/XListView;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/roidapp/photogrid/video/XListView;->a(Z)V

    .line 981
    :goto_3
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->j(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 982
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->h(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/XListView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 983
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->h(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/XListView;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/roidapp/photogrid/video/XListView;->a(Z)V

    goto/16 :goto_0

    .line 955
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->j(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto/16 :goto_1

    .line 962
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->z(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/f;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->z(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/f;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/photogrid/video/f;->b()I

    move-result v0

    const/16 v1, 0xa

    if-ge v0, v1, :cond_7

    .line 963
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->a()V

    goto :goto_2

    .line 966
    :cond_7
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->h(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/XListView;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/roidapp/photogrid/video/XListView;->b(Z)V

    goto/16 :goto_2

    .line 976
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->m(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 977
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->k(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 978
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->r(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 979
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->q(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_3

    .line 986
    :cond_9
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->m(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 987
    iget-object v0, p0, Lcom/roidapp/photogrid/video/aq;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->k(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto/16 :goto_0
.end method
