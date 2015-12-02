.class public Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;
.super Lcom/facebook/base/fragment/AbstractNavigableFragment;
.source "UpgradeScreenOrcaFragment.java"

# interfaces
.implements Lcom/facebook/analytics/d;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private c:Lcom/facebook/config/a/a;

.field private d:Lcom/facebook/appconfig/m;

.field private e:Lcom/facebook/orca/activity/m;

.field private f:Landroid/widget/Button;

.field private g:Landroid/widget/Button;

.field private h:Lcom/facebook/fbservice/ops/BlueServiceFragment;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 36
    const-class v0, Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;

    sput-object v0, Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Lcom/facebook/base/fragment/AbstractNavigableFragment;-><init>()V

    return-void
.end method

.method private O()V
    .locals 1

    .prologue
    .line 124
    iget-object v0, p0, Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;->e:Lcom/facebook/orca/activity/m;

    invoke-virtual {v0}, Lcom/facebook/orca/activity/m;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 125
    const-class v0, Lcom/facebook/auth/login/SilentLoginFragment;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;->a(Ljava/lang/Class;)V

    .line 127
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;->O()V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;->c()V

    return-void
.end method

.method private c()V
    .locals 3

    .prologue
    .line 110
    iget-object v0, p0, Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;->d:Lcom/facebook/appconfig/m;

    invoke-virtual {v0}, Lcom/facebook/appconfig/m;->e()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 111
    iget-object v0, p0, Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;->d:Lcom/facebook/appconfig/m;

    invoke-virtual {v0}, Lcom/facebook/appconfig/m;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 116
    :goto_0
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;->d(Landroid/content/Intent;)V

    .line 117
    return-void

    .line 113
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;->c:Lcom/facebook/config/a/a;

    invoke-virtual {v0}, Lcom/facebook/config/a/a;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic c(Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;->d()V

    return-void
.end method

.method private d()V
    .locals 1

    .prologue
    .line 120
    const-class v0, Lcom/facebook/auth/login/LogoutFragment;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;->a(Ljava/lang/Class;)V

    .line 121
    return-void
.end method


# virtual methods
.method public A()V
    .locals 3

    .prologue
    .line 92
    invoke-super {p0}, Lcom/facebook/base/fragment/AbstractNavigableFragment;->A()V

    .line 93
    sget-object v0, Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;->a:Ljava/lang/Class;

    const-string v1, "Resuming UpgradeScreenFragment"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 94
    iget-object v0, p0, Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;->h:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 96
    iget-object v0, p0, Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;->h:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    sget-object v1, Lcom/facebook/config/background/f;->a:Lcom/facebook/fbservice/service/OperationType;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    .line 101
    :cond_0
    return-void
.end method

.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .prologue
    .line 70
    sget v0, Lcom/facebook/k;->upgrade_screen:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 71
    invoke-virtual {p0}, Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;->l()Landroid/support/v4/app/i;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/widget/titlebar/c;->a(Landroid/app/Activity;)Z

    .line 72
    sget v0, Lcom/facebook/i;->upgrade_button:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;->f:Landroid/widget/Button;

    .line 73
    sget v0, Lcom/facebook/i;->log_out_button:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;->g:Landroid/widget/Button;

    .line 74
    iget-object v0, p0, Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;->f:Landroid/widget/Button;

    new-instance v2, Lcom/facebook/orca/auth/f;

    invoke-direct {v2, p0}, Lcom/facebook/orca/auth/f;-><init>(Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;)V

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 80
    iget-object v0, p0, Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;->g:Landroid/widget/Button;

    new-instance v2, Lcom/facebook/orca/auth/g;

    invoke-direct {v2, p0}, Lcom/facebook/orca/auth/g;-><init>(Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;)V

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 87
    return-object v1
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 47
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/AbstractNavigableFragment;->d(Landroid/os/Bundle;)V

    .line 49
    invoke-virtual {p0}, Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;->S()Lcom/facebook/inject/t;

    move-result-object v1

    .line 50
    const-class v0, Lcom/facebook/config/a/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/a/a;

    iput-object v0, p0, Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;->c:Lcom/facebook/config/a/a;

    .line 51
    const-class v0, Lcom/facebook/appconfig/m;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/appconfig/m;

    iput-object v0, p0, Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;->d:Lcom/facebook/appconfig/m;

    .line 52
    const-class v0, Lcom/facebook/orca/activity/m;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/activity/m;

    iput-object v0, p0, Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;->e:Lcom/facebook/orca/activity/m;

    .line 54
    const-string v0, "fetchAppConfig"

    invoke-static {p0, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Lcom/facebook/fbservice/ops/BlueServiceFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;->h:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    .line 55
    iget-object v0, p0, Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;->h:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    new-instance v1, Lcom/facebook/orca/auth/e;

    invoke-direct {v1, p0}, Lcom/facebook/orca/auth/e;-><init>(Lcom/facebook/orca/auth/UpgradeScreenOrcaFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/h;)V

    .line 65
    return-void
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 105
    sget-object v0, Lcom/facebook/analytics/f/a;->UPGRADE_SCREEN_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method
