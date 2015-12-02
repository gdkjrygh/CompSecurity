.class public Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;
.super Lcom/qihoo/security/app/BaseActivity;
.source "360Security"


# instance fields
.field private A:Lcom/qihoo/security/widget/TabPageIndicator;

.field private B:Lcom/qihoo/security/ui/b/a$f;

.field private y:Lcom/qihoo/security/widget/QihooViewPager;

.field private z:Lcom/qihoo/security/ui/fragment/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseActivity;-><init>()V

    return-void
.end method

.method private o()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 66
    invoke-virtual {p0}, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080059

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->c(I)V

    .line 67
    const v0, 0x7f0b0071

    invoke-virtual {p0, v0}, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/QihooViewPager;

    iput-object v0, p0, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->y:Lcom/qihoo/security/widget/QihooViewPager;

    .line 68
    const v0, 0x7f0b0070

    invoke-virtual {p0, v0}, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/TabPageIndicator;

    iput-object v0, p0, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->A:Lcom/qihoo/security/widget/TabPageIndicator;

    .line 69
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->y:Lcom/qihoo/security/widget/QihooViewPager;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/QihooViewPager;->setOffscreenPageLimit(I)V

    .line 70
    new-instance v0, Lcom/qihoo/security/ui/fragment/a;

    invoke-virtual {p0}, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->e()Landroid/support/v4/app/f;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/qihoo/security/ui/fragment/a;-><init>(Landroid/support/v4/app/f;)V

    iput-object v0, p0, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->z:Lcom/qihoo/security/ui/fragment/a;

    .line 71
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->z:Lcom/qihoo/security/ui/fragment/a;

    iget-object v1, p0, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->p:Landroid/content/Context;

    const v2, 0x7f0c00ab

    const-class v3, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/qihoo/security/ui/fragment/a;->a(Landroid/content/Context;ILjava/lang/Class;Landroid/os/Bundle;)V

    .line 72
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->z:Lcom/qihoo/security/ui/fragment/a;

    iget-object v1, p0, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->p:Landroid/content/Context;

    const v2, 0x7f0c00ac

    const-class v3, Lcom/qihoo/security/appbox/ui/fragment/AppsFragment;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/qihoo/security/ui/fragment/a;->a(Landroid/content/Context;ILjava/lang/Class;Landroid/os/Bundle;)V

    .line 73
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->z:Lcom/qihoo/security/ui/fragment/a;

    iget-object v1, p0, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->p:Landroid/content/Context;

    const v2, 0x7f0c00ad

    const-class v3, Lcom/qihoo/security/appbox/ui/fragment/GamesFragment;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/qihoo/security/ui/fragment/a;->a(Landroid/content/Context;ILjava/lang/Class;Landroid/os/Bundle;)V

    .line 75
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->y:Lcom/qihoo/security/widget/QihooViewPager;

    iget-object v1, p0, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->z:Lcom/qihoo/security/ui/fragment/a;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/QihooViewPager;->setAdapter(Landroid/support/v4/view/o;)V

    .line 76
    new-instance v0, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity$2;

    invoke-direct {v0, p0}, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity$2;-><init>(Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;)V

    .line 83
    iget-object v1, p0, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->A:Lcom/qihoo/security/widget/TabPageIndicator;

    iget-object v2, p0, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->y:Lcom/qihoo/security/widget/QihooViewPager;

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/qihoo/security/widget/TabPageIndicator;->a(Landroid/support/v4/view/ViewPager;Lcom/qihoo/security/widget/c;I)V

    .line 84
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->A:Lcom/qihoo/security/widget/TabPageIndicator;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/TabPageIndicator;->setTabSmoothScroll(Z)V

    .line 85
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->A:Lcom/qihoo/security/widget/TabPageIndicator;

    new-instance v1, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity$3;

    invoke-direct {v1, p0}, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity$3;-><init>(Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/TabPageIndicator;->setOnTabItemClickListener(Lcom/qihoo/security/widget/TabPageIndicator$b;)V

    .line 91
    return-void
.end method


# virtual methods
.method public finish()V
    .locals 3

    .prologue
    .line 104
    invoke-virtual {p0}, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 105
    if-eqz v0, :cond_0

    const-string/jumbo v1, "com.qihoo.security.lite.ACTION_APPBOX_SHORTCUT"

    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 106
    invoke-virtual {p0}, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/qihoo/security/appbox/ui/AppBoxActivity;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 108
    :cond_0
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->finish()V

    .line 109
    return-void
.end method

.method protected j()V
    .locals 3

    .prologue
    .line 95
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->j()V

    .line 96
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->r:Landroid/support/v7/app/ActionBar;

    if-eqz v0, :cond_0

    .line 97
    const v0, 0x7f0c01e4

    invoke-virtual {p0, v0}, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->b(I)V

    .line 98
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {p0}, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f080059

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->a(Landroid/graphics/drawable/Drawable;)V

    .line 100
    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    const v1, 0x7f030022

    .line 42
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 47
    invoke-static {}, Lcom/qihoo/security/ui/b/a;->a()Lcom/qihoo/security/ui/b/a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a;->b(I)Lcom/qihoo/security/ui/b/a$f;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->B:Lcom/qihoo/security/ui/b/a$f;

    .line 48
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->B:Lcom/qihoo/security/ui/b/a$f;

    if-nez v0, :cond_0

    .line 52
    new-instance v0, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity$1;-><init>(Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->B:Lcom/qihoo/security/ui/b/a$f;

    .line 58
    invoke-virtual {p0, v1}, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->setContentView(I)V

    .line 62
    :goto_0
    invoke-direct {p0}, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->o()V

    .line 63
    return-void

    .line 60
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->B:Lcom/qihoo/security/ui/b/a$f;

    iget-object v0, v0, Lcom/qihoo/security/ui/b/a$f;->b:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/appbox/ui/AppBoxSelfFuncActivity;->setContentView(Landroid/view/View;)V

    goto :goto_0
.end method
