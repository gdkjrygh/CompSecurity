.class public Lcom/capitalone/mobile/banking/security/MobileSecurityActivity;
.super Landroid/app/Activity;
.source "MobileSecurityActivity.java"


# instance fields
.field private appheader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 19
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/capitalone/mobile/banking/security/MobileSecurityActivity;->appheader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    return-void
.end method


# virtual methods
.method public finish()V
    .locals 0

    .prologue
    .line 63
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    .line 64
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 22
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 27
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    const/4 v3, 0x0

    invoke-direct {v0, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 28
    .local v0, "colorDrawable":Landroid/graphics/drawable/ColorDrawable;
    invoke-virtual {p0}, Lcom/capitalone/mobile/banking/security/MobileSecurityActivity;->getWindow()Landroid/view/Window;

    move-result-object v2

    .line 29
    .local v2, "window":Landroid/view/Window;
    if-eqz v2, :cond_0

    .line 31
    invoke-virtual {v2, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 34
    :cond_0
    const v3, 0x7f030018

    invoke-virtual {p0, v3}, Lcom/capitalone/mobile/banking/security/MobileSecurityActivity;->setContentView(I)V

    .line 35
    const v3, 0x7f080026

    invoke-virtual {p0, v3}, Lcom/capitalone/mobile/banking/security/MobileSecurityActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    iput-object v3, p0, Lcom/capitalone/mobile/banking/security/MobileSecurityActivity;->appheader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    .line 38
    const v3, 0x7f08004e

    invoke-virtual {p0, v3}, Lcom/capitalone/mobile/banking/security/MobileSecurityActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    invoke-static {v3}, Lcom/EnterpriseMobileBanking/AppHelper;->setCopyrightYear(Landroid/widget/TextView;)V

    .line 41
    iget-object v3, p0, Lcom/capitalone/mobile/banking/security/MobileSecurityActivity;->appheader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setNavOption(I)V

    .line 42
    iget-object v3, p0, Lcom/capitalone/mobile/banking/security/MobileSecurityActivity;->appheader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    invoke-virtual {v3}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->hideGlobalButton()V

    .line 43
    iget-object v3, p0, Lcom/capitalone/mobile/banking/security/MobileSecurityActivity;->appheader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    new-instance v4, Lcom/capitalone/mobile/banking/security/MobileSecurityActivity$1;

    invoke-direct {v4, p0}, Lcom/capitalone/mobile/banking/security/MobileSecurityActivity$1;-><init>(Lcom/capitalone/mobile/banking/security/MobileSecurityActivity;)V

    invoke-virtual {v3, v4}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setOnNavOptionClick(Landroid/view/View$OnClickListener;)V

    .line 52
    const v3, 0x7f0800b3

    invoke-virtual {p0, v3}, Lcom/capitalone/mobile/banking/security/MobileSecurityActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/webkit/WebView;

    .line 53
    .local v1, "mobile_security_body":Landroid/webkit/WebView;
    const-string v3, "file:///android_asset/mobile_security.html"

    invoke-virtual {v1, v3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 54
    return-void
.end method

.method public onStart()V
    .locals 0

    .prologue
    .line 57
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 59
    return-void
.end method
