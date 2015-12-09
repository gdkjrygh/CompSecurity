.class public Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;
.super Landroid/app/Activity;
.source "ExpressSignInIntroActivity.java"


# instance fields
.field private appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

.field private expressSignInPreference:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    return-void
.end method

.method static synthetic access$000(Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;)Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;
    .locals 1
    .param p0, "x0"    # Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;

    .prologue
    .line 28
    iget-object v0, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    return-object v0
.end method


# virtual methods
.method public declineSureSwipeAction(Landroid/view/View;)V
    .locals 3
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 161
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 162
    .local v0, "data":Landroid/content/Intent;
    const-string v1, "LockPatternAction"

    const-string v2, "DECLINE"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 163
    iget-object v1, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->expressSignInPreference:Ljava/lang/String;

    const-string v2, "ASK_LATER"

    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 165
    const-string v1, "DeclineSureSwipe"

    const-string v2, "NEVER"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 172
    :goto_0
    const/4 v1, -0x1

    invoke-virtual {p0, v1, v0}, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->setResult(ILandroid/content/Intent;)V

    .line 173
    invoke-virtual {p0}, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->finish()V

    .line 174
    return-void

    .line 170
    :cond_0
    const-string v1, "DeclineSureSwipe"

    const-string v2, "ASK_LATER"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0
.end method

.method public expressSignInCreatePattern(Landroid/view/View;)V
    .locals 3
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 150
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/capitalone/mobile/banking/security/LockPatternActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 151
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "lockpattern_mode"

    sget-object v2, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->CreatePattern:Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;

    invoke-virtual {v2}, Lgroup/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 152
    const-string v1, "AppHeaderNavOption"

    const-string v2, "CLOSE"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 153
    const-string v1, "isSlideUpOffer"

    const-string v2, "true"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 154
    const/16 v1, 0x840

    invoke-virtual {p0, v0, v1}, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 155
    return-void
.end method

.method public finish()V
    .locals 2

    .prologue
    .line 132
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    .line 133
    const/4 v0, 0x0

    const v1, 0x7f040004

    invoke-virtual {p0, v0, v1}, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->overridePendingTransition(II)V

    .line 137
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 0
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .prologue
    .line 141
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 142
    invoke-virtual {p0, p2, p3}, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->setResult(ILandroid/content/Intent;)V

    .line 143
    invoke-virtual {p0}, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->finish()V

    .line 144
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 15
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 34
    invoke-super/range {p0 .. p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 39
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v11, 0x0

    invoke-direct {v1, v11}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 40
    .local v1, "colorDrawable":Landroid/graphics/drawable/ColorDrawable;
    invoke-virtual {p0}, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->getWindow()Landroid/view/Window;

    move-result-object v10

    .line 41
    .local v10, "window":Landroid/view/Window;
    if-eqz v10, :cond_0

    .line 43
    invoke-virtual {v10, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 46
    :cond_0
    const v11, 0x7f03000b

    invoke-virtual {p0, v11}, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->setContentView(I)V

    .line 47
    const v11, 0x7f080026

    invoke-virtual {p0, v11}, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->findViewById(I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    iput-object v11, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    .line 50
    iget-object v11, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    const/4 v12, 0x2

    invoke-virtual {v11, v12}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setNavOption(I)V

    .line 51
    iget-object v11, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    invoke-virtual {v11}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->hideGlobalButton()V

    .line 52
    iget-object v11, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    const/4 v12, 0x1

    invoke-virtual {v11, v12}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setAppHeaderDisabled(Z)V

    .line 53
    iget-object v11, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    new-instance v12, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity$1;

    invoke-direct {v12, p0}, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity$1;-><init>(Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;)V

    invoke-virtual {v11, v12}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setOnNavOptionClick(Landroid/view/View$OnClickListener;)V

    .line 65
    invoke-virtual {p0}, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->getIntent()Landroid/content/Intent;

    move-result-object v11

    const-string v12, "expressSignInPreference"

    invoke-virtual {v11, v12}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    iput-object v11, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->expressSignInPreference:Ljava/lang/String;

    .line 66
    iget-object v11, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->expressSignInPreference:Ljava/lang/String;

    const-string v12, "ASK_LATER"

    invoke-static {v11, v12}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_1

    .line 67
    const v11, 0x7f08006c

    invoke-virtual {p0, v11}, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 68
    .local v0, "DeclineButton":Landroid/widget/Button;
    const v11, 0x7f0900c8

    invoke-virtual {v0, v11}, Landroid/widget/Button;->setText(I)V

    .line 73
    .end local v0    # "DeclineButton":Landroid/widget/Button;
    :cond_1
    const v11, 0x7f080067

    invoke-virtual {p0, v11}, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/EnterpriseMobileBanking/Plugins/Components/CapitalOneTextView;

    .line 74
    .local v3, "introHeader":Lcom/EnterpriseMobileBanking/Plugins/Components/CapitalOneTextView;
    invoke-virtual {v3}, Lcom/EnterpriseMobileBanking/Plugins/Components/CapitalOneTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 75
    .local v2, "headerText":Ljava/lang/String;
    const-string v11, "SM"

    invoke-virtual {v2, v11}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v9

    .line 76
    .local v9, "serviceMarkStart":I
    if-ltz v9, :cond_2

    .line 77
    new-instance v7, Landroid/text/SpannableStringBuilder;

    invoke-direct {v7, v2}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 78
    .local v7, "sb":Landroid/text/SpannableStringBuilder;
    new-instance v11, Landroid/text/style/RelativeSizeSpan;

    const v12, 0x3f19999a    # 0.6f

    invoke-direct {v11, v12}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    add-int/lit8 v12, v9, 0x2

    const/16 v13, 0x21

    invoke-virtual {v7, v11, v9, v12, v13}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 80
    new-instance v11, Landroid/text/style/SuperscriptSpan;

    invoke-direct {v11}, Landroid/text/style/SuperscriptSpan;-><init>()V

    add-int/lit8 v12, v9, 0x2

    const/16 v13, 0x21

    invoke-virtual {v7, v11, v9, v12, v13}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 82
    invoke-virtual {v3, v7}, Lcom/EnterpriseMobileBanking/Plugins/Components/CapitalOneTextView;->setText(Ljava/lang/CharSequence;)V

    .line 86
    .end local v7    # "sb":Landroid/text/SpannableStringBuilder;
    :cond_2
    const v11, 0x7f08006a

    invoke-virtual {p0, v11}, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 87
    .local v4, "introHeaderTextView":Landroid/widget/TextView;
    invoke-virtual {v4}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .line 88
    .local v5, "introText":Ljava/lang/String;
    const v11, 0x7f0900cb

    invoke-virtual {p0, v11}, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 89
    .local v6, "moreText":Ljava/lang/String;
    new-instance v8, Landroid/text/SpannableStringBuilder;

    invoke-direct {v8, v6}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 90
    .local v8, "sbtext":Landroid/text/SpannableStringBuilder;
    new-instance v11, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity$2;

    invoke-direct {v11, p0, v4}, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity$2;-><init>(Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;Landroid/widget/TextView;)V

    const/4 v12, 0x0

    invoke-virtual {v8}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v13

    const/16 v14, 0x21

    invoke-virtual {v8, v11, v12, v13, v14}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 101
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 102
    invoke-virtual {v4, v8}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    .line 103
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v11

    invoke-virtual {v4, v11}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 104
    return-void
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 108
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 110
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->isAuthenticated()Z

    move-result v1

    if-nez v1, :cond_0

    .line 111
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 112
    .local v0, "timeout":Landroid/content/Intent;
    invoke-virtual {p0, v0}, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->sendBroadcast(Landroid/content/Intent;)V

    .line 114
    .end local v0    # "timeout":Landroid/content/Intent;
    :cond_0
    return-void
.end method

.method public onStart()V
    .locals 4

    .prologue
    .line 117
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 121
    iget-object v0, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->appHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    new-instance v1, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity$3;

    invoke-direct {v1, p0}, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity$3;-><init>(Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;)V

    invoke-virtual {p0}, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0b0003

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 128
    return-void
.end method
