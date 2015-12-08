.class final Lcom/mopub/mobileads/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;


# instance fields
.field final synthetic a:Lcom/mopub/mobileads/MoPubActivity;


# direct methods
.method constructor <init>(Lcom/mopub/mobileads/MoPubActivity;)V
    .locals 0

    .prologue
    .line 126
    iput-object p1, p0, Lcom/mopub/mobileads/t;->a:Lcom/mopub/mobileads/MoPubActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onInterstitialClicked()V
    .locals 4

    .prologue
    .line 144
    iget-object v0, p0, Lcom/mopub/mobileads/t;->a:Lcom/mopub/mobileads/MoPubActivity;

    iget-object v1, p0, Lcom/mopub/mobileads/t;->a:Lcom/mopub/mobileads/MoPubActivity;

    invoke-virtual {v1}, Lcom/mopub/mobileads/MoPubActivity;->a()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const-string v1, "com.mopub.action.interstitial.click"

    invoke-static {v0, v2, v3, v1}, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->a(Landroid/content/Context;JLjava/lang/String;)V

    .line 145
    return-void
.end method

.method public final onInterstitialDismissed()V
    .locals 0

    .prologue
    .line 153
    return-void
.end method

.method public final onInterstitialFailed(Lcom/mopub/mobileads/MoPubErrorCode;)V
    .locals 4

    .prologue
    .line 134
    iget-object v0, p0, Lcom/mopub/mobileads/t;->a:Lcom/mopub/mobileads/MoPubActivity;

    iget-object v1, p0, Lcom/mopub/mobileads/t;->a:Lcom/mopub/mobileads/MoPubActivity;

    invoke-virtual {v1}, Lcom/mopub/mobileads/MoPubActivity;->a()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const-string v1, "com.mopub.action.interstitial.fail"

    invoke-static {v0, v2, v3, v1}, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->a(Landroid/content/Context;JLjava/lang/String;)V

    .line 135
    iget-object v0, p0, Lcom/mopub/mobileads/t;->a:Lcom/mopub/mobileads/MoPubActivity;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubActivity;->finish()V

    .line 136
    return-void
.end method

.method public final onInterstitialLoaded()V
    .locals 2

    .prologue
    .line 129
    iget-object v0, p0, Lcom/mopub/mobileads/t;->a:Lcom/mopub/mobileads/MoPubActivity;

    invoke-static {v0}, Lcom/mopub/mobileads/MoPubActivity;->a(Lcom/mopub/mobileads/MoPubActivity;)Lcom/mopub/mobileads/HtmlInterstitialWebView;

    move-result-object v0

    sget-object v1, Lcom/mopub/mobileads/n;->WEB_VIEW_DID_APPEAR:Lcom/mopub/mobileads/n;

    invoke-virtual {v1}, Lcom/mopub/mobileads/n;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/HtmlInterstitialWebView;->loadUrl(Ljava/lang/String;)V

    .line 130
    return-void
.end method

.method public final onInterstitialShown()V
    .locals 0

    .prologue
    .line 140
    return-void
.end method

.method public final onLeaveApplication()V
    .locals 0

    .prologue
    .line 149
    return-void
.end method
