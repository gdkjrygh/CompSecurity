.class public Lcom/capitalone/mobile/banking/security/ExpressSignInConfirmationActivity;
.super Landroid/app/Activity;
.source "ExpressSignInConfirmationActivity.java"


# instance fields
.field private appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInConfirmationActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    return-void
.end method


# virtual methods
.method public expressSignInConfirmationContinue(Landroid/view/View;)V
    .locals 1
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 86
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/capitalone/mobile/banking/security/ExpressSignInConfirmationActivity;->setResult(I)V

    .line 87
    invoke-virtual {p0}, Lcom/capitalone/mobile/banking/security/ExpressSignInConfirmationActivity;->finish()V

    .line 88
    return-void
.end method

.method public finish()V
    .locals 2

    .prologue
    .line 76
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    .line 77
    const/4 v0, 0x0

    const v1, 0x7f040004

    invoke-virtual {p0, v0, v1}, Lcom/capitalone/mobile/banking/security/ExpressSignInConfirmationActivity;->overridePendingTransition(II)V

    .line 79
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getApplicationLink()Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setSplashSuppress(Z)V

    .line 80
    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .prologue
    .line 67
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 69
    .local v0, "data":Landroid/content/Intent;
    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/capitalone/mobile/banking/security/ExpressSignInConfirmationActivity;->setResult(ILandroid/content/Intent;)V

    .line 70
    invoke-virtual {p0}, Lcom/capitalone/mobile/banking/security/ExpressSignInConfirmationActivity;->finish()V

    .line 71
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const/16 v6, 0x21

    .line 24
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 26
    const v4, 0x7f03000d

    invoke-virtual {p0, v4}, Lcom/capitalone/mobile/banking/security/ExpressSignInConfirmationActivity;->setContentView(I)V

    .line 29
    const v4, 0x7f080026

    invoke-virtual {p0, v4}, Lcom/capitalone/mobile/banking/security/ExpressSignInConfirmationActivity;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    iput-object v4, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInConfirmationActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    .line 30
    iget-object v4, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInConfirmationActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    const/4 v5, 0x2

    invoke-virtual {v4, v5}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setNavOption(I)V

    .line 31
    iget-object v4, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInConfirmationActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    invoke-virtual {v4}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->hideGlobalButton()V

    .line 32
    iget-object v4, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInConfirmationActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    new-instance v5, Lcom/capitalone/mobile/banking/security/ExpressSignInConfirmationActivity$1;

    invoke-direct {v5, p0}, Lcom/capitalone/mobile/banking/security/ExpressSignInConfirmationActivity$1;-><init>(Lcom/capitalone/mobile/banking/security/ExpressSignInConfirmationActivity;)V

    invoke-virtual {v4, v5}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setOnNavOptionClick(Landroid/view/View$OnClickListener;)V

    .line 41
    const v4, 0x7f080071

    invoke-virtual {p0, v4}, Lcom/capitalone/mobile/banking/security/ExpressSignInConfirmationActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/EnterpriseMobileBanking/Plugins/Components/CapitalOneTextView;

    .line 42
    .local v1, "introHeader":Lcom/EnterpriseMobileBanking/Plugins/Components/CapitalOneTextView;
    invoke-virtual {v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/CapitalOneTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 43
    .local v0, "headerText":Ljava/lang/String;
    const-string v4, "SM"

    invoke-virtual {v0, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    .line 44
    .local v3, "serviceMarkStart":I
    if-ltz v3, :cond_0

    .line 45
    new-instance v2, Landroid/text/SpannableStringBuilder;

    invoke-direct {v2, v0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 46
    .local v2, "sb":Landroid/text/SpannableStringBuilder;
    new-instance v4, Landroid/text/style/RelativeSizeSpan;

    const v5, 0x3f19999a    # 0.6f

    invoke-direct {v4, v5}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    add-int/lit8 v5, v3, 0x2

    invoke-virtual {v2, v4, v3, v5, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 47
    new-instance v4, Landroid/text/style/SuperscriptSpan;

    invoke-direct {v4}, Landroid/text/style/SuperscriptSpan;-><init>()V

    add-int/lit8 v5, v3, 0x2

    invoke-virtual {v2, v4, v3, v5, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 48
    invoke-virtual {v1, v2}, Lcom/EnterpriseMobileBanking/Plugins/Components/CapitalOneTextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    .end local v2    # "sb":Landroid/text/SpannableStringBuilder;
    :cond_0
    return-void
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 55
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 57
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->isAuthenticated()Z

    move-result v1

    if-nez v1, :cond_0

    .line 58
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 59
    .local v0, "timeout":Landroid/content/Intent;
    invoke-virtual {p0, v0}, Lcom/capitalone/mobile/banking/security/ExpressSignInConfirmationActivity;->sendBroadcast(Landroid/content/Intent;)V

    .line 61
    .end local v0    # "timeout":Landroid/content/Intent;
    :cond_0
    return-void
.end method
