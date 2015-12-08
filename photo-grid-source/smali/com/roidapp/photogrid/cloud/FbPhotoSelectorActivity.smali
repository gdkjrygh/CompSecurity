.class public Lcom/roidapp/photogrid/cloud/FbPhotoSelectorActivity;
.super Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/FbPhotoSelectorActivity;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/FbPhotoSelectorActivity;->l()V

    return-void
.end method

.method private l()V
    .locals 4

    .prologue
    .line 90
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/FbPhotoSelectorActivity;->l:Ljava/util/List;

    const/4 v2, 0x0

    new-array v2, v2, [Lcom/roidapp/photogrid/release/ig;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/photogrid/release/ig;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 91
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/cloud/FbPhotoSelectorActivity;->o:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->j(I)V

    .line 92
    invoke-static {}, Lcom/roidapp/cloudlib/common/a;->a()Lcom/roidapp/cloudlib/common/b;

    move-result-object v0

    .line 93
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 94
    const-string v2, "user_id"

    iget-object v3, v0, Lcom/roidapp/cloudlib/common/b;->d:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 95
    const-string v2, "user_name"

    iget-object v0, v0, Lcom/roidapp/cloudlib/common/b;->e:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 96
    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/cloud/FbPhotoSelectorActivity;->startActivity(Landroid/content/Intent;)V

    .line 97
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/FbPhotoSelectorActivity;->finish()V

    .line 98
    invoke-static {}, Lcom/roidapp/cloudlib/common/a;->b()V

    .line 99
    return-void
.end method


# virtual methods
.method protected final b()Lcom/roidapp/cloudlib/t;
    .locals 2

    .prologue
    .line 85
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/FbPhotoSelectorActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const v1, 0x7f0d0088

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;

    .line 86
    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 33
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 36
    invoke-static {p1}, Lcom/roidapp/photogrid/common/an;->b(Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 37
    const-string v0, "310"

    invoke-static {v0, p0}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    .line 72
    :cond_0
    :goto_0
    return-void

    .line 40
    :cond_1
    invoke-static {}, Lcom/roidapp/photogrid/common/ba;->a()Lcom/roidapp/photogrid/common/ba;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/photogrid/common/ba;->a(Landroid/app/Activity;)V

    .line 42
    const v0, 0x7f030018

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/FbPhotoSelectorActivity;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    :goto_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/FbPhotoSelectorActivity;->v:Z

    if-nez v0, :cond_0

    .line 49
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/FbPhotoSelectorActivity;->d()V

    .line 50
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/FbPhotoSelectorActivity;->e()V

    .line 51
    const v0, 0x7f0d008d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/FbPhotoSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/FbPhotoSelectorActivity;->a:Landroid/widget/TextView;

    .line 53
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/FbPhotoSelectorActivity;->a:Landroid/widget/TextView;

    new-instance v1, Lcom/roidapp/photogrid/cloud/af;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/cloud/af;-><init>(Lcom/roidapp/photogrid/cloud/FbPhotoSelectorActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 58
    const v0, 0x7f0d0089

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/FbPhotoSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    .line 59
    const/16 v1, 0xa5

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setAlpha(I)V

    .line 60
    new-instance v1, Lcom/roidapp/photogrid/cloud/ag;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/cloud/ag;-><init>(Lcom/roidapp/photogrid/cloud/FbPhotoSelectorActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1076
    invoke-static {}, Lcom/roidapp/cloudlib/common/a;->a()Lcom/roidapp/cloudlib/common/b;

    move-result-object v0

    .line 1077
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/FbPhotoSelectorActivity;->a:Landroid/widget/TextView;

    iget-object v0, v0, Lcom/roidapp/cloudlib/common/b;->c:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 68
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 69
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/FbPhotoSelectorActivity;->a([Lcom/roidapp/photogrid/release/ig;)V

    goto :goto_0

    .line 44
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 45
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/FbPhotoSelectorActivity;->v:Z

    .line 46
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    goto :goto_1
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 110
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 111
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/FbPhotoSelectorActivity;->i:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/FbPhotoSelectorActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    .line 112
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/FbPhotoSelectorActivity;->i:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 117
    :cond_0
    :goto_0
    invoke-super {p0, p1, p2}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0

    .line 114
    :cond_1
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/FbPhotoSelectorActivity;->l()V

    goto :goto_0
.end method

.method protected onStart()V
    .locals 0

    .prologue
    .line 105
    invoke-super {p0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->onStart()V

    .line 106
    return-void
.end method
