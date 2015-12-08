.class public Lcom/mopub/mobileads/MraidActivity;
.super Lcom/mopub/mobileads/l;
.source "SourceFile"


# instance fields
.field private b:Lcom/mopub/mraid/MraidController;

.field private c:Lcom/mopub/mraid/MraidWebViewDebugListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Lcom/mopub/mobileads/l;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/mopub/mobileads/MraidActivity;)Lcom/mopub/mraid/MraidController;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/mopub/mobileads/MraidActivity;->b:Lcom/mopub/mraid/MraidController;

    return-object v0
.end method

.method public static preRenderHtml(Landroid/content/Context;Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 45
    new-instance v0, Lcom/mopub/mobileads/BaseWebView;

    invoke-direct {v0, p0}, Lcom/mopub/mobileads/BaseWebView;-><init>(Landroid/content/Context;)V

    .line 47
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/mopub/mobileads/BaseWebView;->a(Z)V

    .line 48
    new-instance v2, Lcom/mopub/mobileads/MraidActivity$1;

    invoke-direct {v2, p1}, Lcom/mopub/mobileads/MraidActivity$1;-><init>(Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;)V

    invoke-virtual {v0, v2}, Lcom/mopub/mobileads/BaseWebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 69
    const-string v3, "text/html"

    const-string v4, "UTF-8"

    move-object v2, p2

    move-object v5, v1

    invoke-virtual/range {v0 .. v5}, Lcom/mopub/mobileads/BaseWebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    return-void
.end method

.method public static start(Landroid/content/Context;Lcom/mopub/common/AdReport;Ljava/lang/String;J)V
    .locals 3

    .prologue
    .line 73
    .line 1084
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/mopub/mobileads/MraidActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1085
    const-string v1, "Html-Response-Body"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1086
    const-string v1, "broadcastIdentifier"

    invoke-virtual {v0, v1, p3, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 1087
    const-string v1, "mopub-intent-ad-report"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 1088
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 75
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method public getAdView()Landroid/view/View;
    .locals 4

    .prologue
    .line 94
    invoke-virtual {p0}, Lcom/mopub/mobileads/MraidActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "Html-Response-Body"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 95
    if-nez v0, :cond_0

    .line 96
    const-string v0, "MraidActivity received a null HTML body. Finishing the activity."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->w(Ljava/lang/String;)V

    .line 97
    invoke-virtual {p0}, Lcom/mopub/mobileads/MraidActivity;->finish()V

    .line 98
    new-instance v0, Landroid/view/View;

    invoke-direct {v0, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 151
    :goto_0
    return-object v0

    .line 101
    :cond_0
    new-instance v1, Lcom/mopub/mraid/MraidController;

    iget-object v2, p0, Lcom/mopub/mobileads/MraidActivity;->a:Lcom/mopub/common/AdReport;

    sget-object v3, Lcom/mopub/mraid/PlacementType;->INTERSTITIAL:Lcom/mopub/mraid/PlacementType;

    invoke-direct {v1, p0, v2, v3}, Lcom/mopub/mraid/MraidController;-><init>(Landroid/content/Context;Lcom/mopub/common/AdReport;Lcom/mopub/mraid/PlacementType;)V

    iput-object v1, p0, Lcom/mopub/mobileads/MraidActivity;->b:Lcom/mopub/mraid/MraidController;

    .line 104
    iget-object v1, p0, Lcom/mopub/mobileads/MraidActivity;->b:Lcom/mopub/mraid/MraidController;

    iget-object v2, p0, Lcom/mopub/mobileads/MraidActivity;->c:Lcom/mopub/mraid/MraidWebViewDebugListener;

    invoke-virtual {v1, v2}, Lcom/mopub/mraid/MraidController;->setDebugListener(Lcom/mopub/mraid/MraidWebViewDebugListener;)V

    .line 105
    iget-object v1, p0, Lcom/mopub/mobileads/MraidActivity;->b:Lcom/mopub/mraid/MraidController;

    new-instance v2, Lcom/mopub/mobileads/aj;

    invoke-direct {v2, p0}, Lcom/mopub/mobileads/aj;-><init>(Lcom/mopub/mobileads/MraidActivity;)V

    invoke-virtual {v1, v2}, Lcom/mopub/mraid/MraidController;->setMraidListener(Lcom/mopub/mraid/MraidController$MraidListener;)V

    .line 140
    iget-object v1, p0, Lcom/mopub/mobileads/MraidActivity;->b:Lcom/mopub/mraid/MraidController;

    new-instance v2, Lcom/mopub/mobileads/ak;

    invoke-direct {v2, p0}, Lcom/mopub/mobileads/ak;-><init>(Lcom/mopub/mobileads/MraidActivity;)V

    invoke-virtual {v1, v2}, Lcom/mopub/mraid/MraidController;->setUseCustomCloseListener(Lcom/mopub/mraid/MraidController$UseCustomCloseListener;)V

    .line 150
    iget-object v1, p0, Lcom/mopub/mobileads/MraidActivity;->b:Lcom/mopub/mraid/MraidController;

    invoke-virtual {v1, v0}, Lcom/mopub/mraid/MraidController;->loadContent(Ljava/lang/String;)V

    .line 151
    iget-object v0, p0, Lcom/mopub/mobileads/MraidActivity;->b:Lcom/mopub/mraid/MraidController;

    invoke-virtual {v0}, Lcom/mopub/mraid/MraidController;->getAdContainer()Landroid/widget/FrameLayout;

    move-result-object v0

    goto :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/high16 v3, 0x1000000

    .line 156
    invoke-super {p0, p1}, Lcom/mopub/mobileads/l;->onCreate(Landroid/os/Bundle;)V

    .line 157
    invoke-virtual {p0}, Lcom/mopub/mobileads/MraidActivity;->a()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-string v2, "com.mopub.action.interstitial.show"

    invoke-static {p0, v0, v1, v2}, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->a(Landroid/content/Context;JLjava/lang/String;)V

    .line 159
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    .line 160
    invoke-virtual {p0}, Lcom/mopub/mobileads/MraidActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v3, v3}, Landroid/view/Window;->setFlags(II)V

    .line 164
    :cond_0
    return-void
.end method

.method protected onDestroy()V
    .locals 3

    .prologue
    .line 184
    iget-object v0, p0, Lcom/mopub/mobileads/MraidActivity;->b:Lcom/mopub/mraid/MraidController;

    if-eqz v0, :cond_0

    .line 185
    iget-object v0, p0, Lcom/mopub/mobileads/MraidActivity;->b:Lcom/mopub/mraid/MraidController;

    invoke-virtual {v0}, Lcom/mopub/mraid/MraidController;->destroy()V

    .line 188
    :cond_0
    invoke-virtual {p0}, Lcom/mopub/mobileads/MraidActivity;->a()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-string v2, "com.mopub.action.interstitial.dismiss"

    invoke-static {p0, v0, v1, v2}, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->a(Landroid/content/Context;JLjava/lang/String;)V

    .line 189
    invoke-super {p0}, Lcom/mopub/mobileads/l;->onDestroy()V

    .line 190
    return-void
.end method

.method protected onPause()V
    .locals 2

    .prologue
    .line 168
    iget-object v0, p0, Lcom/mopub/mobileads/MraidActivity;->b:Lcom/mopub/mraid/MraidController;

    if-eqz v0, :cond_0

    .line 169
    iget-object v0, p0, Lcom/mopub/mobileads/MraidActivity;->b:Lcom/mopub/mraid/MraidController;

    invoke-virtual {p0}, Lcom/mopub/mobileads/MraidActivity;->isFinishing()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/mopub/mraid/MraidController;->pause(Z)V

    .line 171
    :cond_0
    invoke-super {p0}, Lcom/mopub/mobileads/l;->onPause()V

    .line 172
    return-void
.end method

.method protected onResume()V
    .locals 1

    .prologue
    .line 176
    invoke-super {p0}, Lcom/mopub/mobileads/l;->onResume()V

    .line 177
    iget-object v0, p0, Lcom/mopub/mobileads/MraidActivity;->b:Lcom/mopub/mraid/MraidController;

    if-eqz v0, :cond_0

    .line 178
    iget-object v0, p0, Lcom/mopub/mobileads/MraidActivity;->b:Lcom/mopub/mraid/MraidController;

    invoke-virtual {v0}, Lcom/mopub/mraid/MraidController;->resume()V

    .line 180
    :cond_0
    return-void
.end method

.method public setDebugListener(Lcom/mopub/mraid/MraidWebViewDebugListener;)V
    .locals 1
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .prologue
    .line 194
    iput-object p1, p0, Lcom/mopub/mobileads/MraidActivity;->c:Lcom/mopub/mraid/MraidWebViewDebugListener;

    .line 195
    iget-object v0, p0, Lcom/mopub/mobileads/MraidActivity;->b:Lcom/mopub/mraid/MraidController;

    if-eqz v0, :cond_0

    .line 196
    iget-object v0, p0, Lcom/mopub/mobileads/MraidActivity;->b:Lcom/mopub/mraid/MraidController;

    invoke-virtual {v0, p1}, Lcom/mopub/mraid/MraidController;->setDebugListener(Lcom/mopub/mraid/MraidWebViewDebugListener;)V

    .line 198
    :cond_0
    return-void
.end method
