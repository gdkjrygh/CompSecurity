.class public Lcom/roidapp/photogrid/cloud/GoogleSearchSelectorActivity;
.super Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/GoogleSearchSelectorActivity;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/GoogleSearchSelectorActivity;->l()V

    return-void
.end method

.method private l()V
    .locals 3

    .prologue
    .line 111
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/GoogleSearchSelectorActivity;->l:Ljava/util/List;

    const/4 v2, 0x0

    new-array v2, v2, [Lcom/roidapp/photogrid/release/ig;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/photogrid/release/ig;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 112
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/cloud/GoogleSearchSelectorActivity;->o:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->j(I)V

    .line 113
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 114
    const-string v1, "fromCloud"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 115
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/al;->d()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 116
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/GoogleSearchSelectorActivity;->startActivity(Landroid/content/Intent;)V

    .line 117
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/GoogleSearchSelectorActivity;->finish()V

    .line 118
    return-void
.end method


# virtual methods
.method protected final b()Lcom/roidapp/cloudlib/t;
    .locals 2

    .prologue
    .line 87
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/GoogleSearchSelectorActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const v1, 0x7f0d0088

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;

    .line 88
    return-object v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 36
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 39
    invoke-static {p1}, Lcom/roidapp/photogrid/common/an;->b(Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 40
    const-string v0, "330"

    invoke-static {v0, p0}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    .line 80
    :cond_0
    :goto_0
    return-void

    .line 43
    :cond_1
    invoke-static {}, Lcom/roidapp/photogrid/common/ba;->a()Lcom/roidapp/photogrid/common/ba;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/photogrid/common/ba;->a(Landroid/app/Activity;)V

    .line 45
    const v0, 0x7f03001b

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/GoogleSearchSelectorActivity;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    :goto_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/GoogleSearchSelectorActivity;->v:Z

    if-nez v0, :cond_0

    .line 52
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/GoogleSearchSelectorActivity;->d()V

    .line 53
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/GoogleSearchSelectorActivity;->e()V

    .line 54
    const v0, 0x7f0d008d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/GoogleSearchSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 55
    const v1, 0x7f070092

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 57
    new-instance v1, Lcom/roidapp/photogrid/cloud/al;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/cloud/al;-><init>(Lcom/roidapp/photogrid/cloud/GoogleSearchSelectorActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 62
    const v0, 0x7f0d0089

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/GoogleSearchSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    .line 63
    const/16 v1, 0xa5

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setAlpha(I)V

    .line 64
    new-instance v1, Lcom/roidapp/photogrid/cloud/am;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/cloud/am;-><init>(Lcom/roidapp/photogrid/cloud/GoogleSearchSelectorActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 70
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 71
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/GoogleSearchSelectorActivity;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 74
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/GoogleSearchSelectorActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "firstCreate"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 76
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/GoogleSearchSelectorActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x24

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 77
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/GoogleSearchSelectorActivity;->b:Lcom/roidapp/cloudlib/t;

    check-cast v0, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->h()V

    goto :goto_0

    .line 47
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 48
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/GoogleSearchSelectorActivity;->v:Z

    .line 49
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    goto :goto_1
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 98
    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    .line 99
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/GoogleSearchSelectorActivity;->i:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/GoogleSearchSelectorActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 100
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/GoogleSearchSelectorActivity;->i:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 104
    :goto_0
    const/4 v0, 0x1

    .line 106
    :goto_1
    return v0

    .line 102
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/GoogleSearchSelectorActivity;->l()V

    goto :goto_0

    .line 106
    :cond_1
    invoke-super {p0, p1, p2}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_1
.end method

.method protected onStart()V
    .locals 0

    .prologue
    .line 94
    invoke-super {p0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->onStart()V

    .line 95
    return-void
.end method
