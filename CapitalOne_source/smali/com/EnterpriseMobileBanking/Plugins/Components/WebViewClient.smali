.class public Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;
.super Landroid/webkit/WebViewClient;
.source "WebViewClient.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "WebViewClient"


# instance fields
.field private appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

.field private busyInd:Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;

.field private redirectWithinApp:Z


# direct methods
.method public constructor <init>(Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)V
    .locals 1
    .param p1, "appLink"    # Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    .prologue
    .line 41
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    .line 36
    new-instance v0, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;

    invoke-direct {v0}, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;-><init>()V

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->busyInd:Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;

    .line 42
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    .line 43
    return-void
.end method

.method static synthetic access$000(Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;)Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;

    .prologue
    .line 30
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    return-object v0
.end method

.method public static findUrlIndexFromTopOfStack(Landroid/webkit/WebView;Ljava/lang/String;)I
    .locals 8
    .param p0, "webView"    # Landroid/webkit/WebView;
    .param p1, "findMe"    # Ljava/lang/String;

    .prologue
    const/4 v4, -0x1

    .line 733
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 765
    :cond_0
    :goto_0
    return v4

    .line 737
    :cond_1
    invoke-virtual {p0}, Landroid/webkit/WebView;->copyBackForwardList()Landroid/webkit/WebBackForwardList;

    move-result-object v3

    .line 739
    .local v3, "webBackForwardList":Landroid/webkit/WebBackForwardList;
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_1
    invoke-virtual {v3}, Landroid/webkit/WebBackForwardList;->getSize()I

    move-result v5

    if-ge v1, v5, :cond_2

    .line 740
    const-string v5, "WebViewClient"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "checking webBackForwardList("

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "): "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v3, v1}, Landroid/webkit/WebBackForwardList;->getItemAtIndex(I)Landroid/webkit/WebHistoryItem;

    move-result-object v7

    invoke-virtual {v7}, Landroid/webkit/WebHistoryItem;->getUrl()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 739
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 743
    :cond_2
    invoke-virtual {v3}, Landroid/webkit/WebBackForwardList;->getCurrentIndex()I

    move-result v0

    .line 744
    .local v0, "currentIndex":I
    invoke-virtual {v3, v0}, Landroid/webkit/WebBackForwardList;->getItemAtIndex(I)Landroid/webkit/WebHistoryItem;

    move-result-object v5

    invoke-virtual {v5}, Landroid/webkit/WebHistoryItem;->getUrl()Ljava/lang/String;

    move-result-object v2

    .line 745
    .local v2, "url":Ljava/lang/String;
    const-string v5, "migration"

    invoke-virtual {v2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_3

    const-string v5, "stateId=username"

    invoke-virtual {v2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 747
    const/4 v4, -0x2

    goto :goto_0

    .line 750
    :cond_3
    if-eqz v3, :cond_0

    .line 752
    const-string v5, "WebViewClient"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "currentIndex: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 753
    const-string v5, "WebViewClient"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "currentUrl: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 754
    add-int/lit8 v1, v0, -0x1

    :goto_2
    if-ltz v1, :cond_0

    .line 756
    const-string v5, "WebViewClient"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "currentIndex / 0: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " / 0"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 757
    invoke-virtual {v3, v1}, Landroid/webkit/WebBackForwardList;->getItemAtIndex(I)Landroid/webkit/WebHistoryItem;

    move-result-object v5

    invoke-virtual {v5}, Landroid/webkit/WebHistoryItem;->getUrl()Ljava/lang/String;

    move-result-object v2

    .line 758
    const-string v5, "WebViewClient"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "currentUrl: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 759
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 761
    sub-int v4, v0, v1

    goto/16 :goto_0

    .line 754
    :cond_4
    add-int/lit8 v1, v1, -0x1

    goto :goto_2
.end method

.method public static getTrimedUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    .line 661
    if-nez p0, :cond_1

    .line 662
    const-string p0, ""

    .line 666
    .end local p0    # "str":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object p0

    .line 663
    .restart local p0    # "str":Ljava/lang/String;
    :cond_1
    const-string v0, "/"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 664
    const/4 v0, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method private launchIntent(Landroid/content/Intent;)V
    .locals 4
    .param p1, "i"    # Landroid/content/Intent;

    .prologue
    .line 688
    const-string v2, ""

    invoke-static {p1, v2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    .line 691
    .local v0, "chooser":Landroid/content/Intent;
    :try_start_0
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    iget-object v2, v2, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->ctx:Lorg/apache/cordova/api/LegacyContext;

    if-nez v2, :cond_0

    .line 693
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 721
    :goto_0
    return-void

    .line 695
    :cond_0
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    iget-object v2, v2, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->ctx:Lorg/apache/cordova/api/LegacyContext;

    invoke-virtual {v2, v0}, Lorg/apache/cordova/api/LegacyContext;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 698
    :catch_0
    move-exception v1

    .line 700
    .local v1, "e":Landroid/content/ActivityNotFoundException;
    const-string v2, "WebViewClient"

    invoke-virtual {v1}, Landroid/content/ActivityNotFoundException;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method public onFormResubmission(Landroid/webkit/WebView;Landroid/os/Message;Landroid/os/Message;)V
    .locals 0
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "dontResend"    # Landroid/os/Message;
    .param p3, "resend"    # Landroid/os/Message;

    .prologue
    .line 656
    invoke-virtual {p3}, Landroid/os/Message;->sendToTarget()V

    .line 657
    return-void
.end method

.method public onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 3
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 116
    if-eqz p2, :cond_0

    const v0, 0x7f09010d

    invoke-static {v0}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const v0, 0x7f09010e

    invoke-static {v0}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 118
    :cond_1
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    const-string v1, "INGDirectApp.goToErrorPage();"

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendJavascript(Ljava/lang/String;)V

    .line 119
    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V

    .line 121
    const-string v0, "WebViewClient"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Bad Url: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    :goto_0
    return-void

    .line 123
    :cond_2
    const-string v0, "/tuning"

    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_3

    .line 124
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    const-string v1, "Ext.dispatch({controller: \'LogoutController\',action: \'signout\',params: \'TransiteDown\'});"

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendJavascript(Ljava/lang/String;)V

    .line 125
    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V

    goto :goto_0

    .line 128
    :cond_3
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 13
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    const v12, 0x7f0900a2

    const/16 v11, 0x64

    const/4 v10, 0x4

    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 135
    const-string v5, "WebViewClient"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "onPageFinished: url: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " -- view.getUrl(): "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    const v5, 0x7f09014b

    invoke-static {v5}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    if-ltz v5, :cond_1

    .line 378
    :cond_0
    :goto_0
    return-void

    .line 140
    :cond_1
    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 142
    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v5

    const-string v6, "migration"

    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v5

    const-string v6, "stateId=confirmation"

    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 143
    const-string v5, "window.plugins.nativeCache.remove(CacheKeys.cif, Ext.emptyFn, Ext.emptyFn);"

    invoke-static {v5}, Lcom/EnterpriseMobileBanking/AppHelper;->sendJavascript(Ljava/lang/String;)V

    .line 144
    const-string v5, "window.plugins.nativeCache.remove(CacheKeys.maskedCif, Ext.emptyFn, Ext.emptyFn);"

    invoke-static {v5}, Lcom/EnterpriseMobileBanking/AppHelper;->sendJavascript(Ljava/lang/String;)V

    .line 148
    :cond_2
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->isAuthenticated()Z

    move-result v3

    .line 151
    .local v3, "resetTimeout":Z
    invoke-virtual {p1}, Landroid/webkit/WebView;->getProgress()I

    move-result v5

    if-ne v5, v11, :cond_3

    iget-object v5, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->busyInd:Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;

    invoke-virtual {v5}, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->isVisible()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 153
    iget-object v5, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->busyInd:Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;

    invoke-virtual {v5}, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->hide()V

    .line 156
    :cond_3
    invoke-static {v8}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setThirdPartyTimer(Z)V

    .line 159
    invoke-static {p2}, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->getTrimedUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/EnterpriseMobileBanking/AppHelper;->getURLAttributes(Ljava/lang/String;)Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;

    move-result-object v0

    .line 160
    .local v0, "attr":Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;
    if-eqz v0, :cond_9

    .line 162
    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->getMode()Ljava/lang/String;

    move-result-object v4

    .line 164
    .local v4, "sMode":Ljava/lang/String;
    const-string v5, "quiet"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 166
    const-string v5, "WebViewClient"

    const-string v6, "onPageFinished: quiet mode returning..."

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    invoke-virtual {p1}, Landroid/webkit/WebView;->getProgress()I

    move-result v5

    if-ne v5, v11, :cond_0

    iget-object v5, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->busyInd:Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;

    invoke-virtual {v5}, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->isVisible()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 170
    iget-object v5, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->busyInd:Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;

    invoke-virtual {v5}, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->hide()V

    goto :goto_0

    .line 174
    :cond_4
    const-string v5, "rewards"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 178
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    check-cast v5, Lcom/capitalone/mobile/banking/app/Application;

    invoke-virtual {v5}, Lcom/capitalone/mobile/banking/app/Application;->getSessionManager()Lcom/capitalone/mobile/banking/session/SessionManager;

    move-result-object v5

    invoke-virtual {v5}, Lcom/capitalone/mobile/banking/session/SessionManager;->removeTimeout()V

    .line 179
    invoke-static {v9}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setThirdPartyTimer(Z)V

    .line 180
    const/4 v3, 0x0

    .line 181
    const-string v5, "WebViewClient"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "onPageFinished: loaded rewards: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    monitor-enter v0

    .line 183
    const/4 v2, 0x0

    .line 184
    .local v2, "logoutMatch":Z
    if-eqz p2, :cond_6

    .line 186
    :try_start_0
    const-string v5, "LogOut.aspx"

    invoke-virtual {p2, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_5

    const-string v5, "timeout.html"

    invoke-virtual {p2, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 187
    :cond_5
    const/4 v2, 0x1

    .line 190
    :cond_6
    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->isTimeout()Z

    move-result v5

    if-nez v5, :cond_7

    if-nez v2, :cond_7

    .line 191
    const/4 v5, 0x1

    invoke-virtual {v0, v5}, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->setTimedOut(Z)V

    .line 192
    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->cancelTimer()V

    .line 193
    new-instance v5, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$1;

    invoke-direct {v5, p0, p1}, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$1;-><init>(Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;Landroid/webkit/WebView;)V

    invoke-virtual {p1, v5}, Landroid/webkit/WebView;->post(Ljava/lang/Runnable;)Z

    .line 201
    :cond_7
    monitor-exit v0

    goto/16 :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v5

    .line 205
    .end local v2    # "logoutMatch":Z
    :cond_8
    const-string v5, "products_360"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    .line 208
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->showBackButton()V

    goto/16 :goto_0

    .line 212
    .end local v4    # "sMode":Ljava/lang/String;
    :cond_9
    const-string v5, "timeout.html"

    invoke-virtual {p2, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_a

    .line 220
    const-string v5, "app.returnToLogin(\'\', \'timeout\');"

    invoke-static {v5}, Lcom/EnterpriseMobileBanking/AppHelper;->sendJavascript(Ljava/lang/String;)V

    .line 224
    :cond_a
    invoke-static {v12}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_22

    invoke-static {v12}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_22

    .line 227
    const v5, 0x7f09010f

    invoke-static {v5}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_15

    .line 228
    const-string v5, "WebViewClient"

    const-string v6, "loading login.vm javascript"

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    new-instance v5, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$2;

    invoke-direct {v5, p0, p1}, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$2;-><init>(Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;Landroid/webkit/WebView;)V

    invoke-virtual {p1, v5}, Landroid/webkit/WebView;->post(Ljava/lang/Runnable;)Z

    .line 236
    const-string v5, "WebViewClient"

    const-string v6, "finished loading login.vm javascript"

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 253
    :cond_b
    :goto_1
    invoke-virtual {p1}, Landroid/webkit/WebView;->getTag()Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_c

    invoke-virtual {p1}, Landroid/webkit/WebView;->getTag()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_c

    .line 254
    const-string v5, "WebViewClient"

    const-string v6, "%%%%%%% main clearing history"

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    invoke-virtual {p1}, Landroid/webkit/WebView;->clearHistory()V

    .line 256
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {p1, v5}, Landroid/webkit/WebView;->setTag(Ljava/lang/Object;)V

    .line 259
    :cond_c
    const-string v5, "/cardActivation"

    invoke-virtual {p2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_d

    const-string v5, "banking/activateCheckbook?execution="

    invoke-virtual {p2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_d

    const-string v5, "/openAccountFastAppMobileWeb3000Stash"

    invoke-virtual {p2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_d

    const-string v5, "coafAccountManagement"

    invoke-virtual {p2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_d

    const-string v5, "coafTransacHistory"

    invoke-virtual {p2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_17

    :cond_d
    const-string v5, "account_summary.vm"

    invoke-virtual {p2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_17

    .line 265
    const-string v5, "WebViewClient"

    const-string v6, "Back button shown for activate card or checkbook"

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 266
    invoke-virtual {p1}, Landroid/webkit/WebView;->clearHistory()V

    .line 267
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->showBackButton()V

    .line 323
    :cond_e
    :goto_2
    const-string v5, "myaccount/banking/eoFastappA"

    invoke-virtual {p2, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    if-ltz v5, :cond_f

    .line 325
    iget-object v5, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    const-string v6, "Ext.dispatch({controller: \'MenuController\', action: \'updateMenu\'});"

    invoke-virtual {v5, v6}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendJavascript(Ljava/lang/String;)V

    .line 328
    :cond_f
    invoke-virtual {p1}, Landroid/webkit/WebView;->hasFocus()Z

    move-result v5

    if-nez v5, :cond_10

    invoke-virtual {p1}, Landroid/webkit/WebView;->getVisibility()I

    move-result v5

    if-nez v5, :cond_10

    .line 329
    invoke-virtual {p1}, Landroid/webkit/WebView;->requestFocus()Z

    .line 330
    invoke-virtual {p1}, Landroid/webkit/WebView;->requestLayout()V

    .line 333
    :cond_10
    iget-object v5, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    const-string v6, "COFBridge.updateLastAccessed();"

    invoke-virtual {v5, v6}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendJavascript(Ljava/lang/String;)V

    .line 336
    iget-boolean v5, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->redirectWithinApp:Z

    if-nez v5, :cond_11

    .line 337
    iget-object v5, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    const-string v6, "INGDirectApp.hideBusyIndicator();"

    invoke-virtual {v5, v6}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendJavascript(Ljava/lang/String;)V

    .line 345
    :cond_11
    :goto_3
    const-string v5, "lp-deposits"

    invoke-virtual {p2, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    if-ltz v5, :cond_12

    .line 346
    iget-object v5, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    const-string v6, "gotoMenuPage(\'RDCController|index\');"

    invoke-virtual {v5, v6}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendJavascript(Ljava/lang/String;)V

    .line 347
    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V

    .line 348
    const-string v5, "about:blank"

    invoke-virtual {p1, v5}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 352
    :cond_12
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x15

    if-lt v5, v6, :cond_14

    .line 353
    const-string v5, "rewards"

    invoke-static {v5}, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->getTrimedUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/EnterpriseMobileBanking/AppHelper;->getURLAttributes(Ljava/lang/String;)Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;

    move-result-object v0

    .line 354
    if-eqz v0, :cond_14

    if-eqz p2, :cond_14

    .line 355
    monitor-enter v0

    .line 356
    :try_start_1
    const-string v5, "ApplicationError.aspx"

    invoke-virtual {p2, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_13

    .line 357
    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->cancelTimer()V

    .line 358
    const-string v5, "WebViewClient"

    const-string v6, "Cancel rewards timer"

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 359
    new-instance v5, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$5;

    invoke-direct {v5, p0, p1}, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$5;-><init>(Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;Landroid/webkit/WebView;)V

    invoke-virtual {p1, v5}, Landroid/webkit/WebView;->post(Ljava/lang/Runnable;)Z

    .line 367
    :cond_13
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 373
    :cond_14
    if-eqz v3, :cond_23

    .line 374
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    check-cast v5, Lcom/capitalone/mobile/banking/app/Application;

    invoke-virtual {v5}, Lcom/capitalone/mobile/banking/app/Application;->getSessionManager()Lcom/capitalone/mobile/banking/session/SessionManager;

    move-result-object v5

    invoke-virtual {v5}, Lcom/capitalone/mobile/banking/session/SessionManager;->resetTimeout()V

    goto/16 :goto_0

    .line 237
    :cond_15
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getIsFreezeCardFlow()Z

    move-result v5

    if-eqz v5, :cond_16

    .line 238
    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v5

    const-string v6, "freezeCard=true"

    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_b

    .line 239
    invoke-virtual {p1, v10}, Landroid/webkit/WebView;->setVisibility(I)V

    goto/16 :goto_1

    .line 243
    :cond_16
    new-instance v5, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$3;

    invoke-direct {v5, p0, p1}, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$3;-><init>(Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;Landroid/webkit/WebView;)V

    invoke-virtual {p1, v5}, Landroid/webkit/WebView;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_1

    .line 269
    :cond_17
    const-string v5, "account_summary.vm"

    invoke-virtual {p2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_19

    const-string v5, "coafPaymentConfirmation"

    invoke-virtual {p2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_19

    const-string v5, "openAccountFastAppMobileWeb3000"

    invoke-virtual {p2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_18

    const-string v5, "stateId=fundAccount"

    invoke-virtual {p2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_19

    :cond_18
    const-string v5, "eoFastappA"

    invoke-virtual {p2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_1a

    const-string v5, "stateId=validateCustomerInfo"

    invoke-virtual {p2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_19

    const-string v5, "stateId=ineligible"

    invoke-virtual {p2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_1a

    .line 273
    :cond_19
    const-string v5, "WebViewClient"

    const-string v6, "Hide back button/show menu button for account summary, coaf payment confirmation, fast apps, always."

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->hideBackButton()V

    goto/16 :goto_2

    .line 276
    :cond_1a
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getIsFreezeCardFlow()Z

    move-result v5

    if-eqz v5, :cond_1e

    .line 277
    const-string v5, "stateId=transactions"

    invoke-virtual {p2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_1b

    .line 278
    invoke-virtual {p1, v10}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 280
    const-string v5, "WebViewClient"

    const-string v6, "Doing programmatic click on accountDetailDebitCard!"

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    const-string v5, "javascript:window.location=accountDetailDebitCard"

    invoke-virtual {p1, v5}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 284
    :cond_1b
    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v5

    const-string v6, "/accountDetailDebitCard"

    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v5

    const-string v6, "stateId=debitTabRender"

    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_e

    .line 286
    const-string v5, "javascript:document.getElementById(\'inPage_navigation_point\').remove();"

    invoke-virtual {p1, v5}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 287
    const-string v5, "stateId=activateStart"

    invoke-virtual {p2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_1c

    const-string v5, "stateId=deactivateStart"

    invoke-virtual {p2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_1d

    .line 289
    :cond_1c
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->showBackButton()V

    .line 291
    :cond_1d
    invoke-virtual {p1, v8}, Landroid/webkit/WebView;->setVisibility(I)V

    goto/16 :goto_2

    .line 297
    :cond_1e
    const v5, 0x7f090112

    invoke-static {v5}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_1f

    const-string v5, "coafPayment"

    invoke-virtual {p2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_1f

    const-string v5, "/migration"

    invoke-virtual {p2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_20

    .line 300
    :cond_1f
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->showBackButton()V

    goto/16 :goto_2

    .line 304
    :cond_20
    const v5, 0x7f09011f

    invoke-static {v5}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_21

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getLastLob()I

    move-result v5

    if-eqz v5, :cond_21

    .line 305
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->hideBackButton()V

    goto/16 :goto_2

    .line 309
    :cond_21
    const v5, 0x7f090111

    invoke-static {v5}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_e

    .line 310
    const-string v1, "javascript: if (typeof mobileAppBackButtonEnabled === \'undefined\') { webview.backButtonActive(false) } else { webview.backButtonActive(mobileAppBackButtonEnabled)}; (function( elements ){ for( var i=0; i<elements.length; i++ ) { var ele = elements[i]; if( ele.target && ele.target == \'_blank\' ) { ele.href +=\'_0targetBlank0\'; }} return; })(document.body.getElementsByTagName( \'a\' ));"

    .line 312
    .local v1, "jsCommand":Ljava/lang/String;
    invoke-virtual {p1}, Landroid/webkit/WebView;->getHandler()Landroid/os/Handler;

    move-result-object v5

    new-instance v6, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$4;

    invoke-direct {v6, p0, p1}, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$4;-><init>(Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;Landroid/webkit/WebView;)V

    invoke-virtual {v5, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_2

    .line 341
    .end local v1    # "jsCommand":Ljava/lang/String;
    :cond_22
    const-string v5, "WebViewClient"

    const-string v6, "%%%%%%% else clearing history"

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 342
    invoke-virtual {p1}, Landroid/webkit/WebView;->clearHistory()V

    .line 343
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {p1, v5}, Landroid/webkit/WebView;->setTag(Ljava/lang/Object;)V

    goto/16 :goto_3

    .line 367
    :catchall_1
    move-exception v5

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v5

    .line 376
    :cond_23
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    check-cast v5, Lcom/capitalone/mobile/banking/app/Application;

    invoke-virtual {v5}, Lcom/capitalone/mobile/banking/app/Application;->getSessionManager()Lcom/capitalone/mobile/banking/session/SessionManager;

    move-result-object v5

    invoke-virtual {v5}, Lcom/capitalone/mobile/banking/session/SessionManager;->removeTimeout()V

    goto/16 :goto_0
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 12
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "favicon"    # Landroid/graphics/Bitmap;

    .prologue
    const v11, 0x7f090115

    const v10, 0x7f0900a2

    const/4 v9, 0x0

    const/16 v8, 0x8

    const/4 v7, 0x1

    .line 382
    const-string v4, "#"

    invoke-virtual {p2, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "execution"

    invoke-virtual {p2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    const-string v4, "stateId"

    invoke-virtual {p2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 383
    new-instance v4, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$6;

    invoke-direct {v4, p0, p1}, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$6;-><init>(Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;Landroid/webkit/WebView;)V

    invoke-virtual {p1, v4}, Landroid/webkit/WebView;->post(Ljava/lang/Runnable;)Z

    .line 472
    :goto_0
    return-void

    .line 393
    :cond_0
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 394
    .local v2, "requestedResource":Landroid/net/Uri;
    const/4 v0, 0x0

    .line 395
    .local v0, "landingPageUrl":Ljava/lang/String;
    iput-boolean v9, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->redirectWithinApp:Z

    .line 397
    const-string v4, "WebViewClient"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "onPageStarted: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 400
    const-string v4, "freezeCard=true"

    invoke-virtual {p2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 401
    invoke-static {v7}, Lcom/EnterpriseMobileBanking/AppHelper;->setIsFreezeCardFlow(Z)V

    .line 402
    const/4 v4, 0x4

    invoke-virtual {p1, v4}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 405
    :cond_1
    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_6

    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f090113

    invoke-static {v5}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f090114

    invoke-static {v5}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f090112

    invoke-static {v5}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 407
    :cond_2
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {p1, v4}, Landroid/webkit/WebView;->setTag(Ljava/lang/Object;)V

    .line 413
    :cond_3
    :goto_1
    if-eqz p2, :cond_8

    invoke-static {v10}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    .line 414
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    const-string v5, "INGDirectApp.showBusyIndicator();"

    invoke-virtual {v4, v5}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendJavascript(Ljava/lang/String;)V

    .line 415
    invoke-static {v11}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getProductsUri()Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4}, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->findUrlIndexFromTopOfStack(Landroid/webkit/WebView;Ljava/lang/String;)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_4

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getLastLob()I

    move-result v4

    const v5, 0x7f080081

    if-ne v4, v5, :cond_5

    .line 416
    :cond_4
    invoke-static {v11}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 417
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Ext.dispatch({controller: \'LoginController\',action: \'index\', params: {landingPage: \'"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "\'}});"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendJavascript(Ljava/lang/String;)V

    .line 420
    invoke-static {v10}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 424
    :cond_5
    invoke-virtual {v2}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_8

    invoke-virtual {v2}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v4

    const-string v5, "account_summary.vm"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_8

    .line 425
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getTransiteView()Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;

    move-result-object v4

    invoke-virtual {v4, v8}, Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;->setVisibility(I)V

    .line 426
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    const-string v5, "Ext.dispatch({controller: \'MenuController\',action: \'updateMenu\'});"

    invoke-virtual {v4, v5}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendJavascript(Ljava/lang/String;)V

    .line 427
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    const-string v5, "mobileAppBackButtonEnabled=false; lastFlow=null; Ext.dispatch({controller: \'AccountSummaryController\',action: \'index\'});"

    invoke-virtual {v4, v5}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendJavascript(Ljava/lang/String;)V

    .line 428
    iput-boolean v7, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->redirectWithinApp:Z

    .line 429
    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V

    .line 430
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->hideBackButton()V

    goto/16 :goto_0

    .line 408
    :cond_6
    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_7

    const-string v4, "products"

    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 410
    :cond_7
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {p1, v4}, Landroid/webkit/WebView;->setTag(Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 435
    :cond_8
    const-string v4, "lp-deposits"

    invoke-virtual {p2, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    if-ltz v4, :cond_9

    .line 436
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    const-string v5, "gotoMenuPage(\'RDCController|index\');"

    invoke-virtual {v4, v5}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendJavascript(Ljava/lang/String;)V

    .line 437
    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V

    .line 438
    const-string v4, "about:blank"

    invoke-virtual {p1, v4}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 442
    :cond_9
    const v4, 0x7f090116

    invoke-static {v4}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_a

    .line 444
    const-string v4, "WebViewClient"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "TRIGGER REWARDS LOGOUT..."

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 445
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    const-string v5, "javascript:(function(){var e = document.createEvent(\'Events\');e.initEvent(\'logout\', false, false);document.dispatchEvent(e);})()"

    invoke-virtual {v4, v5}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendJavascript(Ljava/lang/String;)V

    .line 446
    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V

    .line 450
    :cond_a
    const-string v4, "_0targetBlank0"

    invoke-virtual {p2, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    if-gez v4, :cond_b

    invoke-static {p2}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->allowedtoOpenOutOfApp(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_b

    const v4, 0x7f09014b

    invoke-static {v4}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    if-ltz v4, :cond_c

    .line 451
    :cond_b
    invoke-virtual {p1, v8}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 452
    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V

    .line 453
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    const-string v5, "INGDirectApp.hideBusyIndicator();"

    invoke-virtual {v4, v5}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendJavascript(Ljava/lang/String;)V

    .line 454
    const-string v4, "_0targetBlank0"

    const-string v5, ""

    invoke-virtual {p2, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p2

    .line 455
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    .line 456
    .local v3, "uriUrl":Landroid/net/Uri;
    new-instance v1, Landroid/content/Intent;

    const-string v4, "android.intent.action.VIEW"

    invoke-direct {v1, v4, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 457
    .local v1, "launchBrowser":Landroid/content/Intent;
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    iget-object v4, v4, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->ctx:Lorg/apache/cordova/api/LegacyContext;

    if-nez v4, :cond_e

    .line 458
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppContext()Landroid/content/Context;

    move-result-object v4

    const-string v5, ""

    invoke-static {v1, v5}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 461
    :goto_2
    const-string v4, "webview"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "_0targetBlank0: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "_0targetBlank0"

    invoke-virtual {p2, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "allowedtoOpenOutOfApp "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {p2}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->allowedtoOpenOutOfApp(Ljava/lang/String;)Z

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/EnterpriseMobileBanking/Utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 464
    .end local v1    # "launchBrowser":Landroid/content/Intent;
    .end local v3    # "uriUrl":Landroid/net/Uri;
    :cond_c
    const-string v4, "migration?stateId=done"

    invoke-virtual {p2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_d

    .line 465
    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V

    .line 466
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getTransiteView()Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;

    move-result-object v4

    invoke-virtual {v4, v8}, Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;->setVisibility(I)V

    .line 467
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    const-string v5, "postLoginSuccess();"

    invoke-virtual {v4, v5}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendJavascript(Ljava/lang/String;)V

    .line 470
    :cond_d
    const-string v4, "WebViewClient"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "onPageStarted DONE: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 460
    .restart local v1    # "launchBrowser":Landroid/content/Intent;
    .restart local v3    # "uriUrl":Landroid/net/Uri;
    :cond_e
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    iget-object v4, v4, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->ctx:Lorg/apache/cordova/api/LegacyContext;

    const-string v5, ""

    invoke-static {v1, v5}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v5

    invoke-virtual {v4, v5}, Lorg/apache/cordova/api/LegacyContext;->startActivity(Landroid/content/Intent;)V

    goto :goto_2
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 8
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "errorCode"    # I
    .param p3, "description"    # Ljava/lang/String;
    .param p4, "failingUrl"    # Ljava/lang/String;

    .prologue
    .line 48
    const-string v5, "WebViewClient"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "ERROR: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ": "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "("

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ")"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    if-nez p1, :cond_0

    .line 108
    :goto_0
    return-void

    .line 54
    :cond_0
    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V

    .line 56
    invoke-virtual {p1}, Landroid/webkit/WebView;->getOriginalUrl()Ljava/lang/String;

    move-result-object v3

    .line 57
    .local v3, "pStr":Ljava/lang/String;
    if-nez v3, :cond_1

    .line 58
    move-object v3, p4

    .line 60
    :cond_1
    invoke-static {v3}, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->getTrimedUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/EnterpriseMobileBanking/AppHelper;->getURLAttributes(Ljava/lang/String;)Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;

    move-result-object v0

    .line 61
    .local v0, "attr":Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;
    if-eqz v0, :cond_4

    .line 63
    const-string v5, "WebViewClient"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "************** attr.getMode() "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->getMode()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " *********************"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->getMode()Ljava/lang/String;

    move-result-object v5

    const-string v6, "quiet"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 66
    const-string v5, "WebViewClient"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "QUIET MODE DETECTED - NO REPORTING: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ": "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "("

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ")"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 69
    :cond_2
    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->getMode()Ljava/lang/String;

    move-result-object v5

    const-string v6, "rewards"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 71
    monitor-enter v0

    .line 73
    const/4 v5, 0x1

    :try_start_0
    invoke-virtual {v0, v5}, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->setTimedOut(Z)V

    .line 74
    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->cancelTimer()V

    .line 75
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->handleError()V

    goto/16 :goto_0

    .line 75
    :catchall_0
    move-exception v5

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v5

    .line 79
    :cond_3
    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->getMode()Ljava/lang/String;

    move-result-object v5

    const-string v6, "products_360"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 81
    invoke-virtual {p1}, Landroid/webkit/WebView;->goBack()V

    .line 82
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppContext()Landroid/content/Context;

    move-result-object v2

    .line 83
    .local v2, "ctx":Landroid/content/Context;
    const-string v5, ""

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f090126

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6, v2}, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin;->alertOK(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    goto/16 :goto_0

    .line 89
    .end local v2    # "ctx":Landroid/content/Context;
    :cond_4
    const/4 v1, 0x0

    .line 90
    .local v1, "bPreloadFlag":Z
    const-string v4, "preload.aspx"

    .line 91
    .local v4, "preloadToken":Ljava/lang/String;
    if-eqz p1, :cond_6

    .line 92
    if-eqz p4, :cond_5

    .line 93
    const-string v5, "preload.aspx"

    invoke-virtual {p4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    .line 95
    :cond_5
    if-nez v1, :cond_6

    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_6

    .line 96
    invoke-virtual {p1}, Landroid/webkit/WebView;->getOriginalUrl()Ljava/lang/String;

    move-result-object v5

    const-string v6, "preload.aspx"

    invoke-virtual {v5, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    .line 99
    :cond_6
    if-eqz v1, :cond_7

    .line 100
    const-string v5, "WebViewClient"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "ERROR: Rewards preload detected: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ": "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "("

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ")"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 104
    .end local v1    # "bPreloadFlag":Z
    .end local v4    # "preloadToken":Ljava/lang/String;
    :cond_7
    const/16 v5, 0x8

    invoke-virtual {p1, v5}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 105
    const v5, 0x7f0900a2

    invoke-static {v5}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 107
    iget-object v5, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    const-string v6, "try {INGDirectApp.goToErrorPage();catch(err){}"

    invoke-virtual {v5, v6}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendJavascript(Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method public onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .locals 3
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "handler"    # Landroid/webkit/SslErrorHandler;
    .param p3, "error"    # Landroid/net/http/SslError;

    .prologue
    .line 672
    const-string v0, "WebViewClient"

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

    .line 673
    sget-object v0, Lcom/EnterpriseMobileBanking/Config;->MOBILE_CONFIG_BYPASS_SSL_ERRORS:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 675
    invoke-virtual {p2}, Landroid/webkit/SslErrorHandler;->proceed()V

    .line 677
    :cond_0
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 22
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 477
    const/4 v11, 0x0

    .line 479
    .local v11, "overridden":Z
    const-string v18, "WebViewClient"

    new-instance v19, Ljava/lang/StringBuilder;

    invoke-direct/range {v19 .. v19}, Ljava/lang/StringBuilder;-><init>()V

    const-string v20, "shouldOverrideUrlLoading() : "

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    move-object/from16 v0, v19

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v18 .. v19}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 481
    const-string v18, "stateId=confirmAccount"

    move-object/from16 v0, p2

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v18

    if-ltz v18, :cond_0

    const-string v18, "stateId=confirmAccountNx"

    move-object/from16 v0, p2

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v18

    const/16 v19, -0x1

    move/from16 v0, v18

    move/from16 v1, v19

    if-ne v0, v1, :cond_0

    .line 482
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->hideBackButton()V

    .line 485
    :cond_0
    const-string v18, "lp-deposits"

    move-object/from16 v0, p2

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v18

    if-ltz v18, :cond_1

    .line 486
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    move-object/from16 v18, v0

    const-string v19, "gotoMenuPage(\'RDCController|index\');"

    invoke-virtual/range {v18 .. v19}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendJavascript(Ljava/lang/String;)V

    .line 487
    invoke-virtual/range {p1 .. p1}, Landroid/webkit/WebView;->stopLoading()V

    .line 488
    const-string v18, "about:blank"

    move-object/from16 v0, p1

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 489
    const/4 v11, 0x1

    .line 492
    :cond_1
    const-string v18, "WebViewClient"

    new-instance v19, Ljava/lang/StringBuilder;

    invoke-direct/range {v19 .. v19}, Ljava/lang/StringBuilder;-><init>()V

    const-string v20, "shouldOverrideUrlLoading-view.getUrl(): "

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {p1 .. p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v20

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v18 .. v19}, Lcom/EnterpriseMobileBanking/Utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 498
    invoke-static/range {p1 .. p1}, Lcom/EnterpriseMobileBanking/AppHelper;->fixupUserAgentString(Landroid/webkit/WebView;)V

    .line 500
    const-string v3, "www/atm"

    .line 502
    .local v3, "atmLink":Ljava/lang/String;
    invoke-static/range {p2 .. p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v14

    .line 503
    .local v14, "requestedResource":Landroid/net/Uri;
    const v18, 0x7f090118

    invoke-static/range {v18 .. v18}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v14}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v19

    invoke-virtual/range {v18 .. v19}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v18

    if-eqz v18, :cond_5

    .line 505
    const-string v18, "WebViewClient"

    const-string v19, "Redirecting due to account summary VM"

    invoke-static/range {v18 .. v19}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 506
    sget v18, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v19, 0x12

    move/from16 v0, v18

    move/from16 v1, v19

    if-le v0, v1, :cond_2

    .line 507
    const/16 v18, 0x1

    .line 639
    :goto_0
    return v18

    .line 509
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    move-object/from16 v18, v0

    const-string v19, "mobileAppBackButtonEnabled=false; lastFlow=null; Ext.dispatch({controller: \'AccountSummaryController\',action: \'index\'});"

    invoke-virtual/range {v18 .. v19}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendJavascript(Ljava/lang/String;)V

    .line 510
    invoke-virtual/range {p1 .. p1}, Landroid/webkit/WebView;->stopLoading()V

    .line 511
    const/4 v11, 0x1

    .line 634
    :cond_3
    :goto_1
    const-string v18, "stateId=done"

    move-object/from16 v0, p2

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v18

    if-eqz v18, :cond_4

    sget v18, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v19, 0x12

    move/from16 v0, v18

    move/from16 v1, v19

    if-le v0, v1, :cond_4

    .line 635
    const/4 v11, 0x1

    .line 638
    :cond_4
    const-string v18, "WebViewClient"

    new-instance v19, Ljava/lang/StringBuilder;

    invoke-direct/range {v19 .. v19}, Ljava/lang/StringBuilder;-><init>()V

    const-string v20, "shouldOverrideUrlLoading: "

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    move-object/from16 v0, v19

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v18 .. v19}, Lcom/EnterpriseMobileBanking/Utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    move/from16 v18, v11

    .line 639
    goto :goto_0

    .line 514
    :cond_5
    const-string v18, "bankapp://"

    move-object/from16 v0, p2

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v18

    if-eqz v18, :cond_6

    .line 515
    const-string v18, "WebViewClient"

    const-string v19, "Bankapp:// detected"

    invoke-static/range {v18 .. v19}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 516
    const-string v18, "bankapp://"

    const-string v19, ""

    move-object/from16 v0, p2

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v18

    const-string v19, "_"

    invoke-virtual/range {v18 .. v19}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v10

    .line 518
    .local v10, "list":[Ljava/lang/String;
    const-string v18, "WebViewClient"

    new-instance v19, Ljava/lang/StringBuilder;

    invoke-direct/range {v19 .. v19}, Ljava/lang/StringBuilder;-><init>()V

    const-string v20, "Controller:"

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    const/16 v20, 0x0

    aget-object v20, v10, v20

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v18 .. v19}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 519
    const-string v18, "WebViewClient"

    new-instance v19, Ljava/lang/StringBuilder;

    invoke-direct/range {v19 .. v19}, Ljava/lang/StringBuilder;-><init>()V

    const-string v20, "Action:"

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    const/16 v20, 0x1

    aget-object v20, v10, v20

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v18 .. v19}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 520
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    move-object/from16 v18, v0

    new-instance v19, Ljava/lang/StringBuilder;

    invoke-direct/range {v19 .. v19}, Ljava/lang/StringBuilder;-><init>()V

    const-string v20, "Ext.dispatch({controller: \'"

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    const/16 v20, 0x0

    aget-object v20, v10, v20

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    const-string v20, "\',action: \'"

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    const/16 v20, 0x1

    aget-object v20, v10, v20

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    const-string v20, "\'});"

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    invoke-virtual/range {v18 .. v19}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendJavascript(Ljava/lang/String;)V

    .line 521
    const/4 v11, 0x1

    .line 522
    goto/16 :goto_1

    .line 523
    .end local v10    # "list":[Ljava/lang/String;
    :cond_6
    const v18, 0x7f090119

    invoke-static/range {v18 .. v18}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v18

    move-object/from16 v0, p2

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v18

    if-ltz v18, :cond_7

    .line 524
    const-string v18, "browser_preference_redirect"

    const-string v19, "login"

    move-object/from16 v0, p2

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v16

    .line 525
    .local v16, "uriUrl":Landroid/net/Uri;
    new-instance v8, Landroid/content/Intent;

    const-string v18, "android.intent.action.VIEW"

    move-object/from16 v0, v18

    move-object/from16 v1, v16

    invoke-direct {v8, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 526
    .local v8, "launchBrowser":Landroid/content/Intent;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    move-object/from16 v18, v0

    move-object/from16 v0, v18

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->ctx:Lorg/apache/cordova/api/LegacyContext;

    move-object/from16 v18, v0

    const-string v19, ""

    move-object/from16 v0, v19

    invoke-static {v8, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v19

    invoke-virtual/range {v18 .. v19}, Lorg/apache/cordova/api/LegacyContext;->startActivity(Landroid/content/Intent;)V

    .line 527
    const-string v18, "WebViewClient"

    const-string v19, "browser_preference_redirect: "

    invoke-static/range {v18 .. v19}, Lcom/EnterpriseMobileBanking/Utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 528
    const/4 v11, 0x1

    .line 529
    goto/16 :goto_1

    .line 530
    .end local v8    # "launchBrowser":Landroid/content/Intent;
    .end local v16    # "uriUrl":Landroid/net/Uri;
    :cond_7
    const v18, 0x7f090115

    invoke-static/range {v18 .. v18}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v18

    move-object/from16 v0, p2

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v18

    if-eqz v18, :cond_9

    const v18, 0x7f090110

    invoke-static/range {v18 .. v18}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v18

    move-object/from16 v0, p2

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v18

    if-ltz v18, :cond_9

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getLastLob()I

    move-result v18

    const v19, 0x7f080081

    move/from16 v0, v18

    move/from16 v1, v19

    if-eq v0, v1, :cond_9

    .line 531
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->forceShow()V

    .line 532
    invoke-static/range {p2 .. p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v16

    .line 533
    .restart local v16    # "uriUrl":Landroid/net/Uri;
    const/4 v6, 0x0

    .line 534
    .local v6, "landingPage":Ljava/lang/String;
    const v18, 0x7f08009c

    invoke-static/range {v18 .. v18}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v18

    move-object/from16 v0, v16

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 535
    .local v13, "queryParam":Ljava/lang/String;
    if-eqz v13, :cond_8

    .line 536
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 537
    .local v15, "sb":Ljava/lang/StringBuilder;
    sget-object v18, Lcom/EnterpriseMobileBanking/AppHelper;->LOB_START_PAGES:Ljava/util/Map;

    const v19, 0x7f09008f

    invoke-static/range {v19 .. v19}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v19

    invoke-interface/range {v18 .. v19}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Ljava/lang/String;

    move-object/from16 v0, v18

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 538
    const-string v18, "?redCarpetDest="

    move-object/from16 v0, v18

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 539
    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 540
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 542
    .end local v15    # "sb":Ljava/lang/StringBuilder;
    :cond_8
    const v18, 0x7f09008f

    invoke-static/range {v18 .. v18}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-static {v0, v6}, Lcom/EnterpriseMobileBanking/AppHelper;->switchLobFinish(Ljava/lang/String;Ljava/lang/String;)V

    .line 543
    const/4 v11, 0x1

    .line 544
    goto/16 :goto_1

    .line 545
    .end local v6    # "landingPage":Ljava/lang/String;
    .end local v13    # "queryParam":Ljava/lang/String;
    .end local v16    # "uriUrl":Landroid/net/Uri;
    :cond_9
    const v18, 0x7f09011a

    invoke-static/range {v18 .. v18}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v18

    move-object/from16 v0, p2

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v18

    if-ltz v18, :cond_a

    .line 546
    invoke-virtual/range {p1 .. p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 548
    :cond_a
    const v18, 0x7f09011b

    invoke-static/range {v18 .. v18}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v18

    move-object/from16 v0, p2

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v18

    if-ltz v18, :cond_e

    .line 549
    new-instance v4, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;

    const/16 v18, 0x0

    move-object/from16 v0, v18

    invoke-direct {v4, v0}, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;-><init>(Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)V

    .line 550
    .local v4, "helper":Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;
    const-string v18, "products_360"

    move-object/from16 v0, v18

    invoke-virtual {v4, v0}, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->setMode(Ljava/lang/String;)V

    .line 551
    const-string v12, ""

    .line 552
    .local v12, "productsUrl":Ljava/lang/String;
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getLastLob()I

    move-result v18

    const v19, 0x7f080081

    move/from16 v0, v18

    move/from16 v1, v19

    if-ne v0, v1, :cond_d

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->isAuthenticated()Z

    move-result v18

    if-eqz v18, :cond_d

    .line 554
    const-string v18, "WebViewClient"

    const-string v19, "loading auth url"

    invoke-static/range {v18 .. v19}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 555
    const-string v18, "SP_PRODUCTS_360_PRODUCTS_AUTH_URL"

    invoke-static/range {v18 .. v18}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticRead(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 563
    :goto_2
    if-eqz v12, :cond_b

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v18

    if-nez v18, :cond_c

    .line 565
    :cond_b
    const v18, 0x7f09011e

    invoke-static/range {v18 .. v18}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v12

    .line 568
    :cond_c
    invoke-static {v12}, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->getTrimedUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-static {v0, v4}, Lcom/EnterpriseMobileBanking/AppHelper;->addURLAttributes(Ljava/lang/String;Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;)Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;

    .line 569
    move-object/from16 v0, p1

    invoke-virtual {v0, v12}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 570
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->busyInd:Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;

    move-object/from16 v18, v0

    invoke-virtual/range {v18 .. v18}, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->show()V

    .line 571
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->busyInd:Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;

    move-object/from16 v18, v0

    new-instance v19, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$7;

    move-object/from16 v0, v19

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct {v0, v1, v2}, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient$7;-><init>(Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;Landroid/webkit/WebView;)V

    invoke-virtual/range {v18 .. v19}, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    goto/16 :goto_1

    .line 559
    :cond_d
    const-string v18, "WebViewClient"

    const-string v19, "loading unauth url"

    invoke-static/range {v18 .. v19}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 560
    const-string v18, "SP_PRODUCTS_360_PRODUCTS_URL"

    invoke-static/range {v18 .. v18}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticRead(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    goto :goto_2

    .line 580
    .end local v4    # "helper":Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;
    .end local v12    # "productsUrl":Ljava/lang/String;
    :cond_e
    move-object/from16 v0, p2

    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v18

    if-ltz v18, :cond_12

    .line 581
    const/4 v11, 0x1

    .line 583
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getLastLob()I

    move-result v7

    .line 584
    .local v7, "lastLob":I
    if-nez v7, :cond_f

    .line 586
    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x1

    const/16 v21, 0x0

    invoke-static/range {v18 .. v21}, Lcom/EnterpriseMobileBanking/AppHelper;->switchATM(Landroid/view/View;ZZLjava/lang/String;)V

    .line 602
    :goto_3
    const v18, 0x7f090122

    invoke-static/range {v18 .. v18}, Lcom/EnterpriseMobileBanking/AppHelper;->setSelectedMenuItem(I)V

    goto/16 :goto_1

    .line 588
    :cond_f
    const v18, 0x7f080081

    move/from16 v0, v18

    if-ne v7, v0, :cond_11

    .line 590
    const-string v18, "SP_PRODUCTS_BRANCH_URL"

    invoke-static/range {v18 .. v18}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticRead(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v16

    .line 591
    .restart local v16    # "uriUrl":Landroid/net/Uri;
    new-instance v8, Landroid/content/Intent;

    const-string v18, "android.intent.action.VIEW"

    move-object/from16 v0, v18

    move-object/from16 v1, v16

    invoke-direct {v8, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 592
    .restart local v8    # "launchBrowser":Landroid/content/Intent;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    move-object/from16 v18, v0

    move-object/from16 v0, v18

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->ctx:Lorg/apache/cordova/api/LegacyContext;

    move-object/from16 v18, v0

    if-nez v18, :cond_10

    .line 593
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppContext()Landroid/content/Context;

    move-result-object v18

    const-string v19, ""

    move-object/from16 v0, v19

    invoke-static {v8, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v19

    invoke-virtual/range {v18 .. v19}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_3

    .line 595
    :cond_10
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    move-object/from16 v18, v0

    move-object/from16 v0, v18

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->ctx:Lorg/apache/cordova/api/LegacyContext;

    move-object/from16 v18, v0

    const-string v19, ""

    move-object/from16 v0, v19

    invoke-static {v8, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v19

    invoke-virtual/range {v18 .. v19}, Lorg/apache/cordova/api/LegacyContext;->startActivity(Landroid/content/Intent;)V

    goto :goto_3

    .line 599
    .end local v8    # "launchBrowser":Landroid/content/Intent;
    .end local v16    # "uriUrl":Landroid/net/Uri;
    :cond_11
    const v18, 0x7f08009e

    invoke-static/range {v18 .. v18}, Lcom/EnterpriseMobileBanking/AppHelper;->findAppViewById(I)Landroid/view/View;

    move-result-object v17

    .line 600
    .local v17, "v":Landroid/view/View;
    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v0, v17

    move/from16 v1, v18

    move/from16 v2, v19

    invoke-static {v0, v1, v2, v3}, Lcom/EnterpriseMobileBanking/AppHelper;->switchATM(Landroid/view/View;ZZLjava/lang/String;)V

    goto :goto_3

    .line 604
    .end local v7    # "lastLob":I
    .end local v17    # "v":Landroid/view/View;
    :cond_12
    const-string v18, "_0targetBlank0"

    move-object/from16 v0, p2

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v18

    if-gez v18, :cond_13

    invoke-static/range {p2 .. p2}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->allowedtoOpenOutOfApp(Ljava/lang/String;)Z

    move-result v18

    if-eqz v18, :cond_15

    .line 605
    :cond_13
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    move-object/from16 v18, v0

    const-string v19, "INGDirectApp.hideBusyIndicator();"

    invoke-virtual/range {v18 .. v19}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->sendJavascript(Ljava/lang/String;)V

    .line 606
    const-string v18, "_0targetBlank0"

    const-string v19, ""

    move-object/from16 v0, p2

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p2

    .line 607
    invoke-static/range {p2 .. p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v16

    .line 608
    .restart local v16    # "uriUrl":Landroid/net/Uri;
    new-instance v8, Landroid/content/Intent;

    const-string v18, "android.intent.action.VIEW"

    move-object/from16 v0, v18

    move-object/from16 v1, v16

    invoke-direct {v8, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 609
    .restart local v8    # "launchBrowser":Landroid/content/Intent;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    move-object/from16 v18, v0

    move-object/from16 v0, v18

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->ctx:Lorg/apache/cordova/api/LegacyContext;

    move-object/from16 v18, v0

    if-nez v18, :cond_14

    .line 610
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppContext()Landroid/content/Context;

    move-result-object v18

    const-string v19, ""

    move-object/from16 v0, v19

    invoke-static {v8, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v19

    invoke-virtual/range {v18 .. v19}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 613
    :goto_4
    const-string v18, "WebViewClient"

    new-instance v19, Ljava/lang/StringBuilder;

    invoke-direct/range {v19 .. v19}, Ljava/lang/StringBuilder;-><init>()V

    const-string v20, "_0targetBlank0: "

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    const-string v20, "_0targetBlank0"

    move-object/from16 v0, p2

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v20

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v19

    const-string v20, "allowedtoOpenOutOfApp "

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-static/range {p2 .. p2}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->allowedtoOpenOutOfApp(Ljava/lang/String;)Z

    move-result v20

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v18 .. v19}, Lcom/EnterpriseMobileBanking/Utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 614
    const/4 v11, 0x1

    .line 615
    goto/16 :goto_1

    .line 612
    :cond_14
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->appLink:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    move-object/from16 v18, v0

    move-object/from16 v0, v18

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->ctx:Lorg/apache/cordova/api/LegacyContext;

    move-object/from16 v18, v0

    const-string v19, ""

    move-object/from16 v0, v19

    invoke-static {v8, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v19

    invoke-virtual/range {v18 .. v19}, Lorg/apache/cordova/api/LegacyContext;->startActivity(Landroid/content/Intent;)V

    goto :goto_4

    .line 616
    .end local v8    # "launchBrowser":Landroid/content/Intent;
    .end local v16    # "uriUrl":Landroid/net/Uri;
    :cond_15
    const-string v18, "tel:"

    move-object/from16 v0, p2

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v18

    if-eqz v18, :cond_16

    .line 618
    new-instance v9, Landroid/content/Intent;

    const-string v18, "android.intent.action.DIAL"

    invoke-static/range {p2 .. p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v19

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-direct {v9, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 619
    .local v9, "launchTel":Landroid/content/Intent;
    move-object/from16 v0, p0

    invoke-direct {v0, v9}, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->launchIntent(Landroid/content/Intent;)V

    .line 620
    const/4 v11, 0x1

    .line 621
    goto/16 :goto_1

    .line 622
    .end local v9    # "launchTel":Landroid/content/Intent;
    :cond_16
    const-string v18, "mailto:"

    move-object/from16 v0, p2

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v18

    if-eqz v18, :cond_3

    .line 624
    const-string v18, "mailto:"

    const-string v19, ""

    move-object/from16 v0, p2

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 625
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    .line 627
    new-instance v5, Landroid/content/Intent;

    const-string v18, "android.intent.action.SEND"

    move-object/from16 v0, v18

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 628
    .local v5, "i":Landroid/content/Intent;
    const v18, 0x7f090104

    invoke-static/range {v18 .. v18}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v18

    const-string v19, "android.intent.extra.EMAIL"

    const/16 v20, 0x1

    move/from16 v0, v20

    new-array v0, v0, [Ljava/lang/String;

    move-object/from16 v20, v0

    const/16 v21, 0x0

    aput-object p2, v20, v21

    invoke-virtual/range {v18 .. v20}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 630
    move-object/from16 v0, p0

    invoke-direct {v0, v5}, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->launchIntent(Landroid/content/Intent;)V

    .line 631
    const/4 v11, 0x1

    goto/16 :goto_1
.end method
