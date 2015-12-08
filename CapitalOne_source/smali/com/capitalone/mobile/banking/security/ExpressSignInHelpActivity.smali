.class public Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;
.super Landroid/app/Activity;
.source "ExpressSignInHelpActivity.java"


# static fields
.field public static final BACK_PRESSED_RESULT_CODE:I = -0x21524111


# instance fields
.field private appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    return-void
.end method

.method static synthetic access$000(Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;)V
    .locals 0
    .param p0, "x0"    # Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;

    .prologue
    .line 19
    invoke-direct {p0}, Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;->doBackAction()V

    return-void
.end method

.method private doBackAction()V
    .locals 1

    .prologue
    .line 83
    const v0, -0x21524111

    invoke-virtual {p0, v0}, Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;->setResult(I)V

    .line 84
    invoke-virtual {p0}, Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;->finish()V

    .line 85
    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 0

    .prologue
    .line 78
    invoke-direct {p0}, Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;->doBackAction()V

    .line 79
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 26
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 31
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    const/4 v3, 0x0

    invoke-direct {v0, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 32
    .local v0, "colorDrawable":Landroid/graphics/drawable/ColorDrawable;
    invoke-virtual {p0}, Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;->getWindow()Landroid/view/Window;

    move-result-object v2

    .line 33
    .local v2, "window":Landroid/view/Window;
    if-eqz v2, :cond_0

    .line 35
    invoke-virtual {v2, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 38
    :cond_0
    const v3, 0x7f03000a

    invoke-virtual {p0, v3}, Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;->setContentView(I)V

    .line 39
    const v3, 0x7f080026

    invoke-virtual {p0, v3}, Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    iput-object v3, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    .line 42
    const v3, 0x7f08004e

    invoke-virtual {p0, v3}, Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    invoke-static {v3}, Lcom/EnterpriseMobileBanking/AppHelper;->setCopyrightYear(Landroid/widget/TextView;)V

    .line 45
    const v3, 0x7f08001f

    invoke-virtual {p0, v3}, Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0900a3

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 46
    iget-object v3, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setNavOption(I)V

    .line 47
    iget-object v3, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    new-instance v4, Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity$1;

    invoke-direct {v4, p0}, Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity$1;-><init>(Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;)V

    invoke-virtual {v3, v4}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setOnGlobalButtonClick(Landroid/view/View$OnClickListener;)V

    .line 57
    iget-object v3, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    new-instance v4, Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity$2;

    invoke-direct {v4, p0}, Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity$2;-><init>(Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;)V

    invoke-virtual {v3, v4}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setOnNavOptionClick(Landroid/view/View$OnClickListener;)V

    .line 66
    const v3, 0x7f080062

    invoke-virtual {p0, v3}, Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/webkit/WebView;

    .line 67
    .local v1, "pattern_help_body_view":Landroid/webkit/WebView;
    const-string v3, "file:///android_asset/pattern_help.html"

    invoke-virtual {v1, v3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 68
    return-void
.end method

.method public returnToLogin(Landroid/view/View;)V
    .locals 2
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 71
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 72
    .local v0, "intent":Landroid/content/Intent;
    invoke-virtual {p0, v0}, Lcom/capitalone/mobile/banking/security/ExpressSignInHelpActivity;->startActivity(Landroid/content/Intent;)V

    .line 73
    return-void
.end method
