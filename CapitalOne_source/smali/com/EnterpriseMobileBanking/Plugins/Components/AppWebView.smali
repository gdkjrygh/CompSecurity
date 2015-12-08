.class public Lcom/EnterpriseMobileBanking/Plugins/Components/AppWebView;
.super Lorg/apache/cordova/CordovaWebView;
.source "AppWebView.java"


# instance fields
.field private mAppWebViewDisplayBlocked:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 19
    invoke-direct {p0, p1}, Lorg/apache/cordova/CordovaWebView;-><init>(Landroid/content/Context;)V

    .line 16
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppWebView;->mAppWebViewDisplayBlocked:Z

    .line 20
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 23
    invoke-direct {p0, p1, p2}, Lorg/apache/cordova/CordovaWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 16
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppWebView;->mAppWebViewDisplayBlocked:Z

    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    .line 27
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/cordova/CordovaWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 16
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppWebView;->mAppWebViewDisplayBlocked:Z

    .line 28
    return-void
.end method


# virtual methods
.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1, "ev"    # Landroid/view/MotionEvent;

    .prologue
    .line 61
    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppWebView;->mAppWebViewDisplayBlocked:Z

    if-nez v0, :cond_0

    .line 62
    invoke-super {p0, p1}, Lorg/apache/cordova/CordovaWebView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 64
    :goto_0
    return v0

    :cond_0
    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppWebView;->mAppWebViewDisplayBlocked:Z

    goto :goto_0
.end method

.method public ismAppWebViewDisplayBlocked()Z
    .locals 1

    .prologue
    .line 108
    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppWebView;->mAppWebViewDisplayBlocked:Z

    return v0
.end method

.method public loadUrl(Ljava/lang/String;)V
    .locals 3
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 83
    const-string v1, "about:blank"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "javascript:"

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 85
    :cond_0
    const-string v1, "file://"

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "javascript:"

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p0, p1}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppWebView;->isUrlWhiteListed(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 86
    :cond_1
    invoke-super {p0, p1}, Lorg/apache/cordova/CordovaWebView;->loadUrl(Ljava/lang/String;)V

    .line 100
    :cond_2
    :goto_0
    return-void

    .line 90
    :cond_3
    const-string v1, "url"

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppWebView;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 92
    .local v0, "initUrl":Ljava/lang/String;
    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppWebView;->getUrlsStackSize()I

    move-result v1

    if-lez v1, :cond_5

    .line 93
    :cond_4
    invoke-virtual {p0, p1}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppWebView;->loadUrlIntoView(Ljava/lang/String;)V

    goto :goto_0

    .line 97
    :cond_5
    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppWebView;->loadUrlIntoView(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3
    .param p1, "ev"    # Landroid/view/MotionEvent;

    .prologue
    const/4 v1, 0x1

    .line 32
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->showingMenu()Z

    move-result v0

    .line 34
    .local v0, "handled":Z
    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    if-ne v2, v1, :cond_1

    .line 35
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->hideMenu()V

    .line 40
    :goto_0
    if-nez v0, :cond_0

    invoke-super {p0, p1}, Lorg/apache/cordova/CordovaWebView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_0
    :goto_1
    return v1

    .line 37
    :cond_1
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppWebView;->requestFocus()Z

    goto :goto_0

    .line 40
    :cond_2
    const/4 v1, 0x0

    goto :goto_1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3
    .param p1, "ev"    # Landroid/view/MotionEvent;

    .prologue
    const/4 v1, 0x1

    .line 45
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->showingMenu()Z

    move-result v0

    .line 47
    .local v0, "handled":Z
    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    if-ne v2, v1, :cond_0

    .line 49
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->hideMenu()V

    .line 52
    :cond_0
    if-nez v0, :cond_1

    invoke-super {p0, p1}, Lorg/apache/cordova/CordovaWebView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    :goto_0
    return v1

    :cond_2
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public setmAppWebViewDisplayBlocked(Z)V
    .locals 0
    .param p1, "mAppWebViewDisplayBlocked"    # Z

    .prologue
    .line 112
    iput-boolean p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppWebView;->mAppWebViewDisplayBlocked:Z

    .line 113
    return-void
.end method
