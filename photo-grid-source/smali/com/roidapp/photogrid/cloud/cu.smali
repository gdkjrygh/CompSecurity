.class final Lcom/roidapp/photogrid/cloud/cu;
.super Landroid/support/v4/app/FragmentPagerAdapter;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/template/c/f;",
            ">;"
        }
    .end annotation
.end field

.field private c:Landroid/content/Context;

.field private d:Landroid/support/v4/view/ViewPager;

.field private e:Landroid/widget/ImageView;

.field private f:Landroid/widget/ImageButton;

.field private g:Landroid/os/Handler;

.field private h:Landroid/widget/RelativeLayout;

.field private i:Landroid/widget/RelativeLayout;

.field private j:Landroid/widget/RelativeLayout;

.field private k:Lcom/roidapp/cloudlib/template/c/f;

.field private l:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)V
    .locals 1

    .prologue
    .line 597
    invoke-virtual {p1}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/support/v4/app/FragmentPagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;)V

    .line 586
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->b:Ljava/util/List;

    .line 598
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->a:Ljava/lang/ref/WeakReference;

    .line 599
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->l:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    .line 600
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->l:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    if-eqz v0, :cond_0

    .line 601
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->l:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->c:Landroid/content/Context;

    .line 602
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->l:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->a(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->d:Landroid/support/v4/view/ViewPager;

    .line 603
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->l:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->d(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Lcom/roidapp/cloudlib/template/b/c;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->g:Landroid/os/Handler;

    .line 604
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->d:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p0}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 605
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->l:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->i(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Landroid/widget/ImageView;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->e:Landroid/widget/ImageView;

    .line 606
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->l:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->j(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Landroid/widget/ImageButton;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->f:Landroid/widget/ImageButton;

    .line 607
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->l:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->k(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->h:Landroid/widget/RelativeLayout;

    .line 608
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->l:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->l(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->i:Landroid/widget/RelativeLayout;

    .line 609
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->l:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->m(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->j:Landroid/widget/RelativeLayout;

    .line 611
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/cu;)Ljava/util/List;
    .locals 1

    .prologue
    .line 583
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->b:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/roidapp/cloudlib/template/c/f;)V
    .locals 1

    .prologue
    .line 614
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->b:Ljava/util/List;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 615
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 616
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/cu;->notifyDataSetChanged()V

    .line 618
    :cond_0
    return-void
.end method

.method public final b(Lcom/roidapp/cloudlib/template/c/f;)V
    .locals 2

    .prologue
    const/4 v1, 0x2

    .line 621
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->b:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/template/c/f;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->k:Lcom/roidapp/cloudlib/template/c/f;

    .line 622
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->b:Ljava/util/List;

    invoke-interface {v0, v1, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 623
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/cu;->notifyDataSetChanged()V

    .line 624
    return-void
.end method

.method public final getCount()I
    .locals 1

    .prologue
    .line 641
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final getItem(I)Landroid/support/v4/app/Fragment;
    .locals 1

    .prologue
    .line 636
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 646
    invoke-virtual {p0, p1}, Lcom/roidapp/photogrid/cloud/cu;->getItem(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 647
    if-eqz v0, :cond_0

    .line 648
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    int-to-long v0, v0

    .line 650
    :goto_0
    return-wide v0

    :cond_0
    int-to-long v0, p1

    goto :goto_0
.end method

.method public final getItemPosition(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 628
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->k:Lcom/roidapp/cloudlib/template/c/f;

    if-ne p1, v0, :cond_0

    .line 629
    const/4 v0, -0x2

    .line 631
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentPagerAdapter;->getItemPosition(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0
.end method

.method public final onPageScrollStateChanged(I)V
    .locals 0

    .prologue
    .line 655
    return-void
.end method

.method public final onPageScrolled(IFI)V
    .locals 0

    .prologue
    .line 659
    return-void
.end method

.method public final onPageSelected(I)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 663
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->c:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->d:Landroid/support/v4/view/ViewPager;

    if-nez v0, :cond_1

    .line 722
    :cond_0
    :goto_0
    return-void

    .line 666
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->l:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    if-eqz v0, :cond_2

    .line 667
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->l:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->i()V

    .line 669
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->d:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 670
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->f:Landroid/widget/ImageButton;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->h:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->j:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->i:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_0

    .line 671
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 693
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->f:Landroid/widget/ImageButton;

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 694
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setSelected(Z)V

    .line 695
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setSelected(Z)V

    .line 696
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->j:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setSelected(Z)V

    .line 697
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->g:Landroid/os/Handler;

    check-cast v0, Lcom/roidapp/cloudlib/template/b/c;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/b/c;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 698
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->g:Landroid/os/Handler;

    const/16 v1, 0x2312

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 673
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->f:Landroid/widget/ImageButton;

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 674
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->j:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setSelected(Z)V

    .line 675
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setSelected(Z)V

    .line 676
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setSelected(Z)V

    .line 677
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->g:Landroid/os/Handler;

    check-cast v0, Lcom/roidapp/cloudlib/template/b/c;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/b/c;->e()Z

    move-result v0

    if-nez v0, :cond_3

    .line 678
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->g:Landroid/os/Handler;

    const/16 v1, 0x2314

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 680
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->e:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->e:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 681
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->e:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 682
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->c:Landroid/content/Context;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "TEMPLATE_STUFF_NEW"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto/16 :goto_0

    .line 704
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->f:Landroid/widget/ImageButton;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 705
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setSelected(Z)V

    .line 706
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->j:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setSelected(Z)V

    .line 707
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setSelected(Z)V

    .line 708
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->g:Landroid/os/Handler;

    check-cast v0, Lcom/roidapp/cloudlib/template/b/c;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/b/c;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 709
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cu;->g:Landroid/os/Handler;

    const/16 v1, 0x2310

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_0

    .line 671
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
