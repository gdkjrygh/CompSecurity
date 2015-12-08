.class public final Lcom/roidapp/photogrid/release/ej;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field private a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private b:Landroid/widget/SeekBar;

.field private c:Landroid/widget/RelativeLayout;

.field private d:Lcom/roidapp/photogrid/release/ng;

.field private e:I

.field private f:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

.field private g:Lcom/roidapp/imagelib/filter/FilterListView;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 24
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 29
    iput-object v1, p0, Lcom/roidapp/photogrid/release/ej;->d:Lcom/roidapp/photogrid/release/ng;

    .line 31
    const/16 v0, 0x64

    iput v0, p0, Lcom/roidapp/photogrid/release/ej;->e:I

    .line 32
    iput-object v1, p0, Lcom/roidapp/photogrid/release/ej;->f:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ej;)Landroid/widget/SeekBar;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ej;->b:Landroid/widget/SeekBar;

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/ej;)I
    .locals 1

    .prologue
    .line 24
    const/16 v0, 0x64

    iput v0, p0, Lcom/roidapp/photogrid/release/ej;->e:I

    return v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/ej;)I
    .locals 1

    .prologue
    .line 24
    iget v0, p0, Lcom/roidapp/photogrid/release/ej;->e:I

    return v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/ej;)Lcom/roidapp/photogrid/release/ng;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ej;->d:Lcom/roidapp/photogrid/release/ng;

    return-object v0
.end method


# virtual methods
.method public final onAttach(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 36
    move-object v0, p1

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ej;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 37
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ej;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    instance-of v0, v0, Lcom/roidapp/photogrid/release/ng;

    if-eqz v0, :cond_0

    .line 38
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ej;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    check-cast v0, Lcom/roidapp/photogrid/release/ng;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ej;->d:Lcom/roidapp/photogrid/release/ng;

    .line 41
    :goto_0
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 42
    return-void

    .line 40
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ej;->d:Lcom/roidapp/photogrid/release/ng;

    goto :goto_0
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    .prologue
    const/16 v5, 0x64

    const/4 v1, 0x0

    .line 66
    const v0, 0x7f0300c3

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 68
    const v0, 0x7f0d031f

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ej;->c:Landroid/widget/RelativeLayout;

    .line 69
    const v0, 0x7f0d031e

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ej;->b:Landroid/widget/SeekBar;

    .line 70
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ej;->b:Landroid/widget/SeekBar;

    invoke-virtual {v0, p0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 1078
    new-instance v0, Lcom/roidapp/imagelib/filter/FilterListView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ej;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    const-string v4, ""

    invoke-direct {v0, v3, v4}, Lcom/roidapp/imagelib/filter/FilterListView;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ej;->g:Lcom/roidapp/imagelib/filter/FilterListView;

    .line 1079
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ej;->c:Landroid/widget/RelativeLayout;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ej;->g:Lcom/roidapp/imagelib/filter/FilterListView;

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 1080
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ej;->b:Landroid/widget/SeekBar;

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/widget/SeekBar;->setVisibility(I)V

    .line 1082
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ad()Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ej;->f:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 1083
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ae()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ej;->e:I

    .line 1084
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ej;->f:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ej;->f:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1085
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ej;->f:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    check-cast v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    .line 1086
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ej;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->c:Ljava/lang/String;

    .line 2041
    invoke-static {v3, v0}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    .line 1086
    if-nez v0, :cond_0

    .line 1087
    iput-object v1, p0, Lcom/roidapp/photogrid/release/ej;->f:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 1090
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ej;->f:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    if-eqz v0, :cond_2

    .line 1091
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ej;->f:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v0

    .line 1092
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ej;->f:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    invoke-interface {v1, v0}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 1100
    :goto_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ej;->f:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    invoke-virtual {v1, v3}, Lcom/roidapp/photogrid/release/ih;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V

    .line 1101
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ih;->a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 1103
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ej;->g:Lcom/roidapp/imagelib/filter/FilterListView;

    new-instance v3, Lcom/roidapp/photogrid/release/ek;

    invoke-direct {v3, p0}, Lcom/roidapp/photogrid/release/ek;-><init>(Lcom/roidapp/photogrid/release/ej;)V

    invoke-virtual {v1, v3}, Lcom/roidapp/imagelib/filter/FilterListView;->a(Lcom/roidapp/imagelib/filter/l;)V

    .line 1144
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ej;->f:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    .line 1145
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ej;->g:Lcom/roidapp/imagelib/filter/FilterListView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ej;->f:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    invoke-virtual {v1, v3, v0}, Lcom/roidapp/imagelib/filter/FilterListView;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 72
    :cond_1
    return-object v2

    .line 1097
    :cond_2
    iput v5, p0, Lcom/roidapp/photogrid/release/ej;->e:I

    .line 1098
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/ih;->l(I)V

    move-object v0, v1

    goto :goto_0
.end method

.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ej;->d:Lcom/roidapp/photogrid/release/ng;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/roidapp/photogrid/release/ej;->e:I

    if-eq v0, p2, :cond_0

    .line 47
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ej;->d:Lcom/roidapp/photogrid/release/ng;

    invoke-virtual {v0, p2}, Lcom/roidapp/photogrid/release/ng;->i(I)V

    .line 49
    :cond_0
    iput p2, p0, Lcom/roidapp/photogrid/release/ej;->e:I

    .line 50
    return-void
.end method

.method public final onResume()V
    .locals 1

    .prologue
    .line 152
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 153
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ej;->g:Lcom/roidapp/imagelib/filter/FilterListView;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/FilterListView;->c()V

    .line 154
    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .prologue
    .line 55
    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    .prologue
    .line 59
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ej;->d:Lcom/roidapp/photogrid/release/ng;

    if-eqz v0, :cond_0

    .line 60
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ej;->d:Lcom/roidapp/photogrid/release/ng;

    iget v1, p0, Lcom/roidapp/photogrid/release/ej;->e:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ng;->i(I)V

    .line 62
    :cond_0
    return-void
.end method
