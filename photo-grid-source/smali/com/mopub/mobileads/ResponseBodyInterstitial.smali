.class public abstract Lcom/mopub/mobileads/ResponseBodyInterstitial;
.super Lcom/mopub/mobileads/CustomEventInterstitial;
.source "SourceFile"


# instance fields
.field protected a:Landroid/content/Context;

.field protected b:Lcom/mopub/common/AdReport;

.field protected c:J

.field private d:Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Lcom/mopub/mobileads/CustomEventInterstitial;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract a(Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;)V
.end method

.method protected abstract a(Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public loadInterstitial(Landroid/content/Context;Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;Ljava/util/Map;Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 32
    iput-object p1, p0, Lcom/mopub/mobileads/ResponseBodyInterstitial;->a:Landroid/content/Context;

    .line 1072
    const-string v0, "Html-Response-Body"

    invoke-interface {p4, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    invoke-virtual {p0, p4}, Lcom/mopub/mobileads/ResponseBodyInterstitial;->a(Ljava/util/Map;)V

    .line 43
    :try_start_0
    const-string v0, "mopub-intent-ad-report"

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/common/AdReport;

    iput-object v0, p0, Lcom/mopub/mobileads/ResponseBodyInterstitial;->b:Lcom/mopub/common/AdReport;

    .line 44
    const-string v0, "broadcastIdentifier"

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    .line 45
    if-nez v0, :cond_1

    .line 46
    const-string v0, "Broadcast Identifier was not set in localExtras"

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->e(Ljava/lang/String;)V

    .line 47
    sget-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->INTERNAL_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

    invoke-interface {p2, v0}, Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;->onInterstitialFailed(Lcom/mopub/mobileads/MoPubErrorCode;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    :goto_0
    return-void

    .line 37
    :cond_0
    sget-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->NETWORK_INVALID_STATE:Lcom/mopub/mobileads/MoPubErrorCode;

    invoke-interface {p2, v0}, Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;->onInterstitialFailed(Lcom/mopub/mobileads/MoPubErrorCode;)V

    goto :goto_0

    .line 50
    :cond_1
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/mopub/mobileads/ResponseBodyInterstitial;->c:J
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_0

    .line 57
    new-instance v0, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;

    iget-wide v2, p0, Lcom/mopub/mobileads/ResponseBodyInterstitial;->c:J

    invoke-direct {v0, p2, v2, v3}, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;-><init>(Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;J)V

    iput-object v0, p0, Lcom/mopub/mobileads/ResponseBodyInterstitial;->d:Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;

    .line 59
    iget-object v0, p0, Lcom/mopub/mobileads/ResponseBodyInterstitial;->d:Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->register(Landroid/content/Context;)V

    .line 61
    invoke-virtual {p0, p2}, Lcom/mopub/mobileads/ResponseBodyInterstitial;->a(Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;)V

    goto :goto_0

    .line 52
    :catch_0
    move-exception v0

    const-string v0, "LocalExtras contained an incorrect type."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->e(Ljava/lang/String;)V

    .line 53
    sget-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->INTERNAL_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

    invoke-interface {p2, v0}, Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;->onInterstitialFailed(Lcom/mopub/mobileads/MoPubErrorCode;)V

    goto :goto_0
.end method

.method public onInvalidate()V
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/mopub/mobileads/ResponseBodyInterstitial;->d:Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;

    if-eqz v0, :cond_0

    .line 67
    iget-object v0, p0, Lcom/mopub/mobileads/ResponseBodyInterstitial;->d:Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;

    invoke-virtual {v0}, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->unregister()V

    .line 69
    :cond_0
    return-void
.end method

.method public abstract showInterstitial()V
.end method
