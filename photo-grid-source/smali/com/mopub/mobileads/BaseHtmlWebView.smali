.class public Lcom/mopub/mobileads/BaseHtmlWebView;
.super Lcom/mopub/mobileads/BaseWebView;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/mobileads/ViewGestureDetector$UserClickListener;


# instance fields
.field private final b:Lcom/mopub/mobileads/ViewGestureDetector;

.field private c:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/mopub/common/AdReport;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 21
    invoke-direct {p0, p1}, Lcom/mopub/mobileads/BaseWebView;-><init>(Landroid/content/Context;)V

    .line 1050
    invoke-virtual {p0, v2}, Lcom/mopub/mobileads/BaseHtmlWebView;->setHorizontalScrollBarEnabled(Z)V

    .line 1051
    invoke-virtual {p0, v2}, Lcom/mopub/mobileads/BaseHtmlWebView;->setHorizontalScrollbarOverlay(Z)V

    .line 1052
    invoke-virtual {p0, v2}, Lcom/mopub/mobileads/BaseHtmlWebView;->setVerticalScrollBarEnabled(Z)V

    .line 1053
    invoke-virtual {p0, v2}, Lcom/mopub/mobileads/BaseHtmlWebView;->setVerticalScrollbarOverlay(Z)V

    .line 1054
    invoke-virtual {p0}, Lcom/mopub/mobileads/BaseHtmlWebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 24
    invoke-virtual {p0}, Lcom/mopub/mobileads/BaseHtmlWebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 26
    new-instance v0, Lcom/mopub/mobileads/ViewGestureDetector;

    invoke-direct {v0, p1, p0, p2}, Lcom/mopub/mobileads/ViewGestureDetector;-><init>(Landroid/content/Context;Landroid/view/View;Lcom/mopub/common/AdReport;)V

    iput-object v0, p0, Lcom/mopub/mobileads/BaseHtmlWebView;->b:Lcom/mopub/mobileads/ViewGestureDetector;

    .line 27
    iget-object v0, p0, Lcom/mopub/mobileads/BaseHtmlWebView;->b:Lcom/mopub/mobileads/ViewGestureDetector;

    invoke-virtual {v0, p0}, Lcom/mopub/mobileads/ViewGestureDetector;->setUserClickListener(Lcom/mopub/mobileads/ViewGestureDetector$UserClickListener;)V

    .line 29
    invoke-static {}, Lcom/mopub/common/util/VersionCode;->currentApiLevel()Lcom/mopub/common/util/VersionCode;

    move-result-object v0

    sget-object v1, Lcom/mopub/common/util/VersionCode;->ICE_CREAM_SANDWICH:Lcom/mopub/common/util/VersionCode;

    invoke-virtual {v0, v1}, Lcom/mopub/common/util/VersionCode;->isAtLeast(Lcom/mopub/common/util/VersionCode;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 30
    invoke-virtual {p0, v3}, Lcom/mopub/mobileads/BaseHtmlWebView;->a(Z)V

    .line 32
    :cond_0
    invoke-virtual {p0, v2}, Lcom/mopub/mobileads/BaseHtmlWebView;->setBackgroundColor(I)V

    .line 33
    return-void
.end method

.method static synthetic a(Lcom/mopub/mobileads/BaseHtmlWebView;)Lcom/mopub/mobileads/ViewGestureDetector;
    .locals 1

    .prologue
    .line 16
    iget-object v0, p0, Lcom/mopub/mobileads/BaseHtmlWebView;->b:Lcom/mopub/mobileads/ViewGestureDetector;

    return-object v0
.end method


# virtual methods
.method final a(Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 58
    const-string v1, "http://ads.mopub.com/"

    const-string v3, "text/html"

    const-string v4, "utf-8"

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    invoke-virtual/range {v0 .. v5}, Lcom/mopub/mobileads/BaseHtmlWebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    return-void
.end method

.method public init(Z)V
    .locals 1

    .prologue
    .line 36
    .line 1063
    new-instance v0, Lcom/mopub/mobileads/k;

    invoke-direct {v0, p0, p1}, Lcom/mopub/mobileads/k;-><init>(Lcom/mopub/mobileads/BaseHtmlWebView;Z)V

    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/BaseHtmlWebView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 37
    return-void
.end method

.method public loadUrl(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 41
    if-nez p1, :cond_1

    .line 47
    :cond_0
    :goto_0
    return-void

    .line 43
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Loading url: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 44
    const-string v0, "javascript:"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 45
    invoke-super {p0, p1}, Lcom/mopub/mobileads/BaseWebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onResetUserClick()V
    .locals 1

    .prologue
    .line 80
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mopub/mobileads/BaseHtmlWebView;->c:Z

    .line 81
    return-void
.end method

.method public onUserClick()V
    .locals 1

    .prologue
    .line 75
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mopub/mobileads/BaseHtmlWebView;->c:Z

    .line 76
    return-void
.end method

.method public wasClicked()Z
    .locals 1

    .prologue
    .line 85
    iget-boolean v0, p0, Lcom/mopub/mobileads/BaseHtmlWebView;->c:Z

    return v0
.end method
