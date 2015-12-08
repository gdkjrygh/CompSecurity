.class public Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;
.super Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;)V
    .locals 3

    .prologue
    .line 1107
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;->l:Ljava/util/List;

    const/4 v2, 0x0

    new-array v2, v2, [Lcom/roidapp/photogrid/release/ig;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/photogrid/release/ig;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 1108
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;->o:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->j(I)V

    .line 1109
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 1110
    const-class v1, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1111
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;->startActivity(Landroid/content/Intent;)V

    .line 1112
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;->finish()V

    .line 26
    return-void
.end method


# virtual methods
.method protected final b()Lcom/roidapp/cloudlib/t;
    .locals 2

    .prologue
    .line 78
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const v1, 0x7f0d0088

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/flickr/FlickrPhotoFragment;

    .line 79
    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 31
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 34
    invoke-static {p1}, Lcom/roidapp/photogrid/common/an;->b(Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 35
    const-string v0, "320"

    invoke-static {v0, p0}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    .line 74
    :cond_0
    :goto_0
    return-void

    .line 39
    :cond_1
    invoke-static {}, Lcom/roidapp/photogrid/common/ba;->a()Lcom/roidapp/photogrid/common/ba;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/photogrid/common/ba;->a(Landroid/app/Activity;)V

    .line 41
    const v0, 0x7f030019

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    :goto_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;->v:Z

    if-nez v0, :cond_0

    .line 48
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;->d()V

    .line 49
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;->e()V

    .line 50
    const v0, 0x7f0d008d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;->a:Landroid/widget/TextView;

    .line 51
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->j(Landroid/content/Context;)I

    move-result v0

    if-nez v0, :cond_2

    .line 52
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;->a:Landroid/widget/TextView;

    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 57
    :goto_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;->a:Landroid/widget/TextView;

    new-instance v1, Lcom/roidapp/photogrid/cloud/ah;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/cloud/ah;-><init>(Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 62
    const v0, 0x7f0d0089

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    .line 63
    const/16 v1, 0xa5

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setAlpha(I)V

    .line 64
    new-instance v1, Lcom/roidapp/photogrid/cloud/ai;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/cloud/ai;-><init>(Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 70
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 71
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;->a([Lcom/roidapp/photogrid/release/ig;)V

    goto :goto_0

    .line 43
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 44
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;->v:Z

    .line 45
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    goto :goto_1

    .line 54
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;->a:Landroid/widget/TextView;

    const v1, 0x7f070249

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 88
    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    .line 89
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;->i:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 90
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;->i:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 94
    :goto_0
    const/4 v0, 0x1

    .line 96
    :goto_1
    return v0

    .line 1100
    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1101
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;->startActivity(Landroid/content/Intent;)V

    .line 1102
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;->finish()V

    goto :goto_0

    .line 96
    :cond_1
    invoke-super {p0, p1, p2}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_1
.end method

.method protected onStart()V
    .locals 0

    .prologue
    .line 84
    invoke-super {p0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->onStart()V

    .line 85
    return-void
.end method
