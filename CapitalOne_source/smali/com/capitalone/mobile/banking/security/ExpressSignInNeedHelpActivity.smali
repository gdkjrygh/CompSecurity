.class public Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;
.super Landroid/app/Activity;
.source "ExpressSignInNeedHelpActivity.java"


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

    iput-object v0, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    return-void
.end method

.method static synthetic access$000(Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;)Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;
    .locals 1
    .param p0, "x0"    # Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;

    .prologue
    .line 19
    iget-object v0, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    return-object v0
.end method


# virtual methods
.method public finish()V
    .locals 2

    .prologue
    .line 108
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    .line 109
    const/4 v0, 0x0

    const v1, 0x7f040004

    invoke-virtual {p0, v0, v1}, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;->overridePendingTransition(II)V

    .line 112
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 14
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const v13, 0x3f19999a    # 0.6f

    const/16 v12, 0x21

    .line 25
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 26
    const v9, 0x7f03000e

    invoke-virtual {p0, v9}, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;->setContentView(I)V

    .line 28
    const v9, 0x7f080026

    invoke-virtual {p0, v9}, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    iput-object v9, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    .line 31
    const v9, 0x7f08001f

    invoke-virtual {p0, v9}, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    const v11, 0x7f0900a3

    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    iget-object v9, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    const/4 v10, 0x2

    invoke-virtual {v9, v10}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setNavOption(I)V

    .line 33
    iget-object v9, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    invoke-virtual {v9}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->hideGlobalButton()V

    .line 34
    iget-object v9, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    const/4 v10, 0x1

    invoke-virtual {v9, v10}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setAppHeaderDisabled(Z)V

    .line 35
    iget-object v9, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    new-instance v10, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity$1;

    invoke-direct {v10, p0}, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity$1;-><init>(Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;)V

    invoke-virtual {v9, v10}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setOnNavOptionClick(Landroid/view/View$OnClickListener;)V

    .line 47
    const v9, 0x7f080077

    invoke-virtual {p0, v9}, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 48
    .local v4, "needHelpBodyText":Landroid/widget/TextView;
    invoke-virtual {v4}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 49
    .local v0, "BodyText":Ljava/lang/String;
    new-instance v6, Landroid/text/SpannableStringBuilder;

    invoke-direct {v6, v0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 50
    .local v6, "sb":Landroid/text/SpannableStringBuilder;
    const-string v7, "SM"

    .line 51
    .local v7, "serviceMark":Ljava/lang/String;
    invoke-static {v6, v7}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v1

    .line 52
    .local v1, "index":I
    :goto_0
    if-ltz v1, :cond_0

    .line 53
    new-instance v9, Landroid/text/style/RelativeSizeSpan;

    invoke-direct {v9, v13}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    add-int/lit8 v10, v1, 0x2

    invoke-virtual {v6, v9, v1, v10, v12}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 54
    new-instance v9, Landroid/text/style/SuperscriptSpan;

    invoke-direct {v9}, Landroid/text/style/SuperscriptSpan;-><init>()V

    add-int/lit8 v10, v1, 0x2

    invoke-virtual {v6, v9, v1, v10, v12}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 55
    const-string v9, "SM"

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v10

    add-int/2addr v10, v1

    invoke-static {v6, v9, v10}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v1

    goto :goto_0

    .line 57
    :cond_0
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 61
    const v9, 0x7f080079

    invoke-virtual {p0, v9}, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 62
    .local v5, "needHelpLinkText":Landroid/widget/TextView;
    invoke-virtual {v5}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 63
    .local v2, "linkText":Ljava/lang/String;
    const-string v9, "SM"

    invoke-virtual {v2, v9}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v8

    .line 64
    .local v8, "serviceMarkStart":I
    if-ltz v8, :cond_1

    .line 65
    new-instance v3, Landroid/text/SpannableStringBuilder;

    invoke-direct {v3, v2}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 66
    .local v3, "linksb":Landroid/text/SpannableStringBuilder;
    new-instance v9, Landroid/text/style/RelativeSizeSpan;

    invoke-direct {v9, v13}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    add-int/lit8 v10, v8, 0x2

    invoke-virtual {v3, v9, v8, v10, v12}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 67
    new-instance v9, Landroid/text/style/SuperscriptSpan;

    invoke-direct {v9}, Landroid/text/style/SuperscriptSpan;-><init>()V

    add-int/lit8 v10, v8, 0x2

    invoke-virtual {v3, v9, v8, v10, v12}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 68
    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    .end local v3    # "linksb":Landroid/text/SpannableStringBuilder;
    :cond_1
    return-void
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 74
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 76
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->isAuthenticated()Z

    move-result v1

    if-nez v1, :cond_0

    .line 77
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 78
    .local v0, "timeout":Landroid/content/Intent;
    invoke-virtual {p0, v0}, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;->sendBroadcast(Landroid/content/Intent;)V

    .line 80
    .end local v0    # "timeout":Landroid/content/Intent;
    :cond_0
    return-void
.end method

.method public onStart()V
    .locals 4

    .prologue
    .line 94
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 98
    iget-object v0, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    new-instance v1, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity$2;

    invoke-direct {v1, p0}, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity$2;-><init>(Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;)V

    invoke-virtual {p0}, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0b0003

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 104
    return-void
.end method

.method public sureSwipeSettings(Landroid/view/View;)V
    .locals 3
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 86
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 87
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "SuppressSplash"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 88
    const-string v1, "sureSwipeSettings"

    const-string v2, "sureSwipeSettingsPage"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 89
    const/16 v1, 0x7d0

    invoke-virtual {p0, v1, v0}, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;->setResult(ILandroid/content/Intent;)V

    .line 90
    invoke-virtual {p0}, Lcom/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity;->finish()V

    .line 91
    return-void
.end method
