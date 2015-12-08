.class public Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;
.super Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;->l()V

    return-void
.end method

.method static synthetic b(Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;)V
    .locals 2

    .prologue
    .line 33
    .line 1108
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/cloudlib/AccountMgrActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v1, 0x2

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 33
    return-void
.end method

.method private l()V
    .locals 3

    .prologue
    .line 112
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;->b:Lcom/roidapp/cloudlib/t;

    check-cast v0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 113
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;->l:Ljava/util/List;

    const/4 v2, 0x0

    new-array v2, v2, [Lcom/roidapp/photogrid/release/ig;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/photogrid/release/ig;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 114
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;->o:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->j(I)V

    .line 116
    :cond_0
    return-void
.end method


# virtual methods
.method protected final b()Lcom/roidapp/cloudlib/t;
    .locals 2

    .prologue
    .line 99
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const v1, 0x7f0d0088

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    .line 100
    return-object v0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .prologue
    .line 134
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 135
    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 136
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->x(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 137
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 138
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/al;->d()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;->startActivity(Landroid/content/Intent;)V

    .line 139
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;->finish()V

    .line 142
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/16 v2, 0xa5

    .line 39
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 42
    invoke-static {p1}, Lcom/roidapp/photogrid/common/an;->b(Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 43
    const-string v0, "300"

    invoke-static {v0, p0}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    .line 92
    :cond_0
    :goto_0
    return-void

    .line 46
    :cond_1
    invoke-static {}, Lcom/roidapp/photogrid/common/ba;->a()Lcom/roidapp/photogrid/common/ba;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/photogrid/common/ba;->a(Landroid/app/Activity;)V

    .line 48
    const v0, 0x7f030015

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    :goto_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;->v:Z

    if-nez v0, :cond_0

    .line 55
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;->d()V

    .line 56
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;->e()V

    .line 57
    const v0, 0x7f0d008d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;->a:Landroid/widget/TextView;

    .line 58
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->x(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 59
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 60
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;->a:Landroid/widget/TextView;

    const v1, 0x7f07006e

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 65
    :goto_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;->a:Landroid/widget/TextView;

    new-instance v1, Lcom/roidapp/photogrid/cloud/x;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/cloud/x;-><init>(Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 71
    const v0, 0x7f0d0089

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    .line 72
    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setAlpha(I)V

    .line 73
    new-instance v1, Lcom/roidapp/photogrid/cloud/y;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/cloud/y;-><init>(Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 79
    const v0, 0x7f0d008a

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    .line 80
    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setAlpha(I)V

    .line 81
    new-instance v1, Lcom/roidapp/photogrid/cloud/z;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/cloud/z;-><init>(Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 88
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 89
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;->a([Lcom/roidapp/photogrid/release/ig;)V

    goto :goto_0

    .line 50
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 51
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;->v:Z

    .line 52
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    goto :goto_1

    .line 62
    :cond_2
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;->a:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 121
    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    .line 122
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;->i:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 123
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;->i:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 127
    :goto_0
    const/4 v0, 0x1

    .line 129
    :goto_1
    return v0

    .line 125
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;->l()V

    goto :goto_0

    .line 129
    :cond_1
    invoke-super {p0, p1, p2}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_1
.end method

.method protected onStart()V
    .locals 0

    .prologue
    .line 105
    invoke-super {p0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->onStart()V

    .line 106
    return-void
.end method
