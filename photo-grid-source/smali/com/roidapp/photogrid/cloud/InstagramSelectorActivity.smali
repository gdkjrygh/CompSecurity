.class public Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;
.super Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field private y:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;-><init>()V

    .line 28
    const-string v0, "InstagramSelectorActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;->a:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;->l()V

    return-void
.end method

.method private l()V
    .locals 3

    .prologue
    .line 107
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;->l:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 108
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;->l:Ljava/util/List;

    const/4 v2, 0x0

    new-array v2, v2, [Lcom/roidapp/photogrid/release/ig;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/photogrid/release/ig;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 110
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;->o:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->j(I)V

    .line 111
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 112
    const-class v1, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 113
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;->startActivity(Landroid/content/Intent;)V

    .line 114
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;->finish()V

    .line 115
    return-void
.end method


# virtual methods
.method protected final b()Lcom/roidapp/cloudlib/t;
    .locals 2

    .prologue
    .line 84
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const v1, 0x7f0d0088

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;

    .line 85
    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const v2, 0x7f070249

    const/4 v1, 0x1

    .line 33
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 36
    invoke-static {p1}, Lcom/roidapp/photogrid/common/an;->b(Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 37
    const-string v0, "340"

    invoke-static {v0, p0}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    .line 80
    :cond_0
    :goto_0
    return-void

    .line 40
    :cond_1
    invoke-static {}, Lcom/roidapp/photogrid/common/ba;->a()Lcom/roidapp/photogrid/common/ba;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/photogrid/common/ba;->a(Landroid/app/Activity;)V

    .line 42
    const v0, 0x7f03001c

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    :goto_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;->v:Z

    if-nez v0, :cond_0

    .line 49
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;->d()V

    .line 50
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;->e()V

    .line 51
    const v0, 0x7f0d008d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;->y:Landroid/widget/TextView;

    .line 52
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->f(Landroid/content/Context;)I

    move-result v0

    if-ne v0, v1, :cond_3

    .line 53
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 54
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 55
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;->y:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 63
    :goto_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;->y:Landroid/widget/TextView;

    new-instance v1, Lcom/roidapp/photogrid/cloud/an;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/cloud/an;-><init>(Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 68
    const v0, 0x7f0d0089

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    .line 69
    const/16 v1, 0xa5

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setAlpha(I)V

    .line 70
    new-instance v1, Lcom/roidapp/photogrid/cloud/ao;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/cloud/ao;-><init>(Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 76
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 77
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;->a([Lcom/roidapp/photogrid/release/ig;)V

    goto :goto_0

    .line 44
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 45
    iput-boolean v1, p0, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;->v:Z

    .line 46
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    goto :goto_1

    .line 57
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;->y:Landroid/widget/TextView;

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 60
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;->y:Landroid/widget/TextView;

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 94
    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    .line 95
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;->i:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 96
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;->i:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 100
    :goto_0
    const/4 v0, 0x1

    .line 102
    :goto_1
    return v0

    .line 98
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;->l()V

    goto :goto_0

    .line 102
    :cond_1
    invoke-super {p0, p1, p2}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_1
.end method

.method protected onStart()V
    .locals 0

    .prologue
    .line 90
    invoke-super {p0}, Lcom/roidapp/photogrid/cloud/SelectorBaseActivity;->onStart()V

    .line 91
    return-void
.end method
