.class public Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;
.super Lcom/facebook/base/activity/i;
.source "OrcaPartialUserUpgradeActivity.java"

# interfaces
.implements Lcom/facebook/analytics/d;


# instance fields
.field private p:Lcom/facebook/widget/titlebar/a;

.field private q:Lcom/facebook/prefs/shared/d;

.field private r:Lcom/facebook/c/s;

.field private s:Lcom/facebook/config/a/a;

.field private t:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private u:Landroid/content/ComponentName;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;)Lcom/facebook/prefs/shared/d;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;->q:Lcom/facebook/prefs/shared/d;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;->k()V

    return-void
.end method

.method static synthetic c(Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;->j()V

    return-void
.end method

.method static synthetic d(Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;)Lcom/facebook/c/s;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;->r:Lcom/facebook/c/s;

    return-object v0
.end method

.method private j()V
    .locals 2

    .prologue
    .line 161
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 162
    iget-object v1, p0, Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;->u:Landroid/content/ComponentName;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 163
    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 164
    iget-object v1, p0, Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;->r:Lcom/facebook/c/s;

    invoke-virtual {v1, v0, p0}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 165
    return-void
.end method

.method private k()V
    .locals 4

    .prologue
    .line 168
    invoke-virtual {p0}, Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 170
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v2, Lcom/facebook/o;->preference_dialog_install_fb4a_title:I

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    sget v2, Lcom/facebook/k;->orca_preferences_download_fb4a:I

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setInverseBackgroundForced(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/facebook/h;->download_arrow_orca:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/facebook/o;->preference_dialog_install_fb4a_confirm:I

    new-instance v2, Lcom/facebook/orca/prefs/am;

    invoke-direct {v2, p0}, Lcom/facebook/orca/prefs/am;-><init>(Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/facebook/o;->dialog_not_now:I

    new-instance v2, Lcom/facebook/orca/prefs/al;

    invoke-direct {v2, p0}, Lcom/facebook/orca/prefs/al;-><init>(Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 202
    return-void
.end method


# virtual methods
.method protected b(Landroid/os/Bundle;)V
    .locals 7

    .prologue
    .line 63
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->b(Landroid/os/Bundle;)V

    .line 65
    invoke-virtual {p0}, Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;->i()Lcom/facebook/inject/t;

    move-result-object v2

    .line 66
    const-class v0, Ljava/lang/Boolean;

    const-class v1, Lcom/facebook/orca/annotations/IsPartialAccount;

    invoke-virtual {v2, v0, v1}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;->t:Ljavax/inject/a;

    .line 67
    const-class v0, Landroid/content/ComponentName;

    const-class v1, Lcom/facebook/orca/threadlist/ForThreadListActivity;

    invoke-virtual {v2, v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ComponentName;

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;->u:Landroid/content/ComponentName;

    .line 69
    sget v0, Lcom/facebook/k;->orca_preferences_upgrade_partial_user:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;->setContentView(I)V

    .line 71
    invoke-static {p0}, Lcom/facebook/widget/titlebar/c;->a(Landroid/app/Activity;)Z

    .line 72
    sget v0, Lcom/facebook/i;->titlebar:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/titlebar/a;

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;->p:Lcom/facebook/widget/titlebar/a;

    .line 73
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;->p:Lcom/facebook/widget/titlebar/a;

    sget v1, Lcom/facebook/o;->preference_partial_user_upgrade_title:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->setTitle(Ljava/lang/String;)V

    .line 75
    sget v0, Lcom/facebook/i;->upgrade_webview:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    .line 76
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    .line 77
    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 79
    const-class v1, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/prefs/shared/d;

    iput-object v1, p0, Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;->q:Lcom/facebook/prefs/shared/d;

    .line 80
    const-class v1, Lcom/facebook/c/s;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/c/s;

    iput-object v1, p0, Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;->r:Lcom/facebook/c/s;

    .line 81
    const-class v1, Lcom/facebook/config/a/a;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/config/a/a;

    iput-object v1, p0, Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;->s:Lcom/facebook/config/a/a;

    .line 82
    const-class v1, Lcom/facebook/auth/b/a;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/auth/b/a;

    .line 83
    invoke-interface {v1}, Lcom/facebook/auth/b/a;->a()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/auth/viewercontext/ViewerContext;->b()Ljava/lang/String;

    move-result-object v3

    .line 84
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v4

    .line 86
    new-instance v1, Lcom/facebook/orca/prefs/ak;

    invoke-direct {v1, p0}, Lcom/facebook/orca/prefs/ak;-><init>(Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 126
    iget-object v1, p0, Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;->q:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/http/f/c;->j:Lcom/facebook/prefs/shared/ae;

    const-string v5, ""

    invoke-interface {v1, v2, v5}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 127
    iget-object v1, p0, Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;->q:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/http/f/c;->k:Lcom/facebook/prefs/shared/ae;

    const/4 v6, 0x0

    invoke-interface {v1, v2, v6}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 129
    const-string v1, "http"

    .line 130
    invoke-static {v2}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_0

    const-string v6, "sandbox"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 131
    :cond_0
    const-string v2, "facebook.com"

    .line 132
    const-string v1, "https"

    .line 135
    :cond_1
    new-instance v5, Landroid/net/Uri$Builder;

    invoke-direct {v5}, Landroid/net/Uri$Builder;-><init>()V

    invoke-virtual {v5, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "m."

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    const-string v2, "/messenger/upgrade_account"

    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    const-string v2, "access_token"

    invoke-virtual {v1, v2, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    const-string v2, "return_url"

    const-string v3, "fb://upgrade_complete"

    invoke-virtual {v1, v2, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    const-string v2, "locale"

    invoke-virtual {v1, v2, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    const-string v2, "cid"

    iget-object v3, p0, Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;->s:Lcom/facebook/config/a/a;

    invoke-virtual {v3}, Lcom/facebook/config/a/a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v2

    .line 144
    invoke-virtual {p0}, Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;->i()Lcom/facebook/inject/t;

    move-result-object v1

    const-class v3, Lcom/facebook/c/u;

    invoke-virtual {v1, v3}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/c/u;

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/facebook/c/u;->a(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 147
    return-void
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 58
    sget-object v0, Lcom/facebook/analytics/f/a;->ORCA_ROOT_PREFERENCE_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method

.method public onResume()V
    .locals 1

    .prologue
    .line 151
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onResume()V

    .line 152
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;->t:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 156
    invoke-direct {p0}, Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;->j()V

    .line 158
    :cond_0
    return-void
.end method
