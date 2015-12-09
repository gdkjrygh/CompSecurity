.class public Lcom/EnterpriseMobileBanking/AppViewClient;
.super Lorg/apache/cordova/CordovaWebViewClient;
.source "AppViewClient.java"


# static fields
.field private static TAG:Ljava/lang/String;


# instance fields
.field private dgLink:Lorg/apache/cordova/DroidGap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 22
    const-string v0, "AppViewClient"

    sput-object v0, Lcom/EnterpriseMobileBanking/AppViewClient;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lorg/apache/cordova/DroidGap;Lorg/apache/cordova/CordovaWebView;)V
    .locals 1
    .param p1, "ctx"    # Lorg/apache/cordova/DroidGap;
    .param p2, "webView"    # Lorg/apache/cordova/CordovaWebView;

    .prologue
    .line 27
    invoke-direct {p0, p1, p2}, Lorg/apache/cordova/CordovaWebViewClient;-><init>(Lorg/apache/cordova/api/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/AppViewClient;->dgLink:Lorg/apache/cordova/DroidGap;

    .line 28
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/AppViewClient;->dgLink:Lorg/apache/cordova/DroidGap;

    .line 29
    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 3
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    const v2, 0x7f0900a2

    .line 33
    invoke-static {v2}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 34
    const-string p2, ""

    .line 48
    :cond_0
    :goto_0
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->isAuthenticated()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 49
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/capitalone/mobile/banking/app/Application;

    invoke-virtual {v0}, Lcom/capitalone/mobile/banking/app/Application;->getSessionManager()Lcom/capitalone/mobile/banking/session/SessionManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/capitalone/mobile/banking/session/SessionManager;->resetTimeout()V

    .line 54
    :goto_1
    invoke-super {p0, p1, p2}, Lorg/apache/cordova/CordovaWebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 55
    return-void

    .line 37
    :cond_1
    const-string v0, "www/atm"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getLastLob()I

    move-result v0

    if-eqz v0, :cond_2

    .line 39
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->hideBackButton()V

    .line 40
    const v0, 0x7f090122

    invoke-static {v0}, Lcom/EnterpriseMobileBanking/AppHelper;->setSelectedMenuItem(I)V

    goto :goto_0

    .line 42
    :cond_2
    invoke-virtual {p1}, Landroid/webkit/WebView;->getProgress()I

    move-result v0

    const/16 v1, 0x64

    if-lt v0, v1, :cond_0

    const v0, 0x7f0900a1

    invoke-static {v0}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 44
    invoke-static {v2}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0

    .line 51
    :cond_3
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/capitalone/mobile/banking/app/Application;

    invoke-virtual {v0}, Lcom/capitalone/mobile/banking/app/Application;->getSessionManager()Lcom/capitalone/mobile/banking/session/SessionManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/capitalone/mobile/banking/session/SessionManager;->removeTimeout()V

    goto :goto_1
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "errorCode"    # I
    .param p3, "description"    # Ljava/lang/String;
    .param p4, "failingUrl"    # Ljava/lang/String;

    .prologue
    .line 60
    sget-object v0, Lcom/EnterpriseMobileBanking/AppViewClient;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ERROR: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    invoke-static {p2}, Lcom/EnterpriseMobileBanking/AppHelper;->genericError(I)V

    .line 62
    return-void
.end method

.method public onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .locals 3
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "handler"    # Landroid/webkit/SslErrorHandler;
    .param p3, "error"    # Landroid/net/http/SslError;

    .prologue
    .line 67
    sget-object v0, Lcom/EnterpriseMobileBanking/AppViewClient;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Received SSL error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p3}, Landroid/net/http/SslError;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    sget-object v0, Lcom/EnterpriseMobileBanking/Config;->MOBILE_CONFIG_BYPASS_SSL_ERRORS:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 70
    invoke-virtual {p2}, Landroid/webkit/SslErrorHandler;->proceed()V

    .line 72
    :cond_0
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 9
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 77
    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p2

    .line 78
    const-string v7, "http://"

    invoke-virtual {p2, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_0

    const-string v7, "https://"

    invoke-virtual {p2, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_4

    :cond_0
    move v3, v6

    .line 80
    .local v3, "overridden":Z
    :goto_0
    if-eqz v3, :cond_5

    .line 81
    const-string v7, "INGDirectApp.hideBusyIndicator();"

    invoke-static {v7}, Lcom/EnterpriseMobileBanking/AppHelper;->sendJavascript(Ljava/lang/String;)V

    .line 82
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    .line 83
    .local v4, "uriUrl":Landroid/net/Uri;
    new-instance v2, Landroid/content/Intent;

    const-string v7, "android.intent.action.VIEW"

    invoke-direct {v2, v7, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 84
    .local v2, "launchBrowser":Landroid/content/Intent;
    iget-object v7, p0, Lcom/EnterpriseMobileBanking/AppViewClient;->dgLink:Lorg/apache/cordova/DroidGap;

    const-string v8, ""

    invoke-static {v2, v8}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v8

    invoke-virtual {v7, v8}, Lorg/apache/cordova/DroidGap;->startActivity(Landroid/content/Intent;)V

    .line 111
    .end local v2    # "launchBrowser":Landroid/content/Intent;
    .end local v4    # "uriUrl":Landroid/net/Uri;
    :cond_1
    :goto_1
    if-nez v3, :cond_2

    invoke-super {p0, p1, p2}, Lorg/apache/cordova/CordovaWebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    :cond_2
    move v5, v6

    :cond_3
    return v5

    .end local v3    # "overridden":Z
    :cond_4
    move v3, v5

    .line 78
    goto :goto_0

    .line 86
    .restart local v3    # "overridden":Z
    :cond_5
    const-string v7, "expresssigninenrollment://"

    invoke-virtual {p2, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 88
    const/4 v3, 0x1

    .line 96
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getApplicationLink()Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    move-result-object v0

    .line 97
    .local v0, "enterpriseMobileBanking":Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;
    new-instance v1, Landroid/content/Intent;

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppContext()Landroid/content/Context;

    move-result-object v7

    const-class v8, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;

    invoke-direct {v1, v7, v8}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 102
    .local v1, "intent":Landroid/content/Intent;
    const/16 v7, 0x4d2

    invoke-virtual {v0, v1, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->startActivityForResult(Landroid/content/Intent;I)V

    .line 103
    const v7, 0x7f040007

    const/high16 v8, 0x7f040000

    invoke-virtual {v0, v7, v8}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->overridePendingTransition(II)V

    goto :goto_1

    .line 106
    .end local v0    # "enterpriseMobileBanking":Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;
    .end local v1    # "intent":Landroid/content/Intent;
    :cond_6
    const-string v7, "expresslogin://"

    invoke-virtual {p2, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 108
    const/4 v3, 0x1

    goto :goto_1
.end method
