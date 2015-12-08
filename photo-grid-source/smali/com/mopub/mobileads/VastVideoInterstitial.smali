.class Lcom/mopub/mobileads/VastVideoInterstitial;
.super Lcom/mopub/mobileads/ResponseBodyInterstitial;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/mobileads/util/vast/VastManager$VastManagerListener;


# instance fields
.field private d:Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;

.field private e:Ljava/lang/String;

.field private f:Lcom/mopub/mobileads/util/vast/VastManager;

.field private g:Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Lcom/mopub/mobileads/ResponseBodyInterstitial;-><init>()V

    return-void
.end method


# virtual methods
.method protected final a(Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;)V
    .locals 2

    .prologue
    .line 24
    iput-object p1, p0, Lcom/mopub/mobileads/VastVideoInterstitial;->d:Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;

    .line 26
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoInterstitial;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/mopub/common/CacheService;->initializeDiskCache(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 27
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoInterstitial;->d:Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;

    sget-object v1, Lcom/mopub/mobileads/MoPubErrorCode;->VIDEO_CACHE_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

    invoke-interface {v0, v1}, Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;->onInterstitialFailed(Lcom/mopub/mobileads/MoPubErrorCode;)V

    .line 33
    :goto_0
    return-void

    .line 31
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoInterstitial;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/mopub/mobileads/factories/VastManagerFactory;->create(Landroid/content/Context;)Lcom/mopub/mobileads/util/vast/VastManager;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/mobileads/VastVideoInterstitial;->f:Lcom/mopub/mobileads/util/vast/VastManager;

    .line 32
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoInterstitial;->f:Lcom/mopub/mobileads/util/vast/VastManager;

    iget-object v1, p0, Lcom/mopub/mobileads/VastVideoInterstitial;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, p0}, Lcom/mopub/mobileads/util/vast/VastManager;->prepareVastVideoConfiguration(Ljava/lang/String;Lcom/mopub/mobileads/util/vast/VastManager$VastManagerListener;)V

    goto :goto_0
.end method

.method protected final a(Ljava/util/Map;)V
    .locals 1
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

    .prologue
    .line 19
    const-string v0, "Html-Response-Body"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/mopub/mobileads/VastVideoInterstitial;->e:Ljava/lang/String;

    .line 20
    return-void
.end method

.method public onInvalidate()V
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoInterstitial;->f:Lcom/mopub/mobileads/util/vast/VastManager;

    if-eqz v0, :cond_0

    .line 43
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoInterstitial;->f:Lcom/mopub/mobileads/util/vast/VastManager;

    invoke-virtual {v0}, Lcom/mopub/mobileads/util/vast/VastManager;->cancel()V

    .line 46
    :cond_0
    invoke-super {p0}, Lcom/mopub/mobileads/ResponseBodyInterstitial;->onInvalidate()V

    .line 47
    return-void
.end method

.method public onVastVideoConfigurationPrepared(Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;)V
    .locals 2

    .prologue
    .line 55
    if-nez p1, :cond_0

    .line 56
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoInterstitial;->d:Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;

    sget-object v1, Lcom/mopub/mobileads/MoPubErrorCode;->VIDEO_DOWNLOAD_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

    invoke-interface {v0, v1}, Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;->onInterstitialFailed(Lcom/mopub/mobileads/MoPubErrorCode;)V

    .line 62
    :goto_0
    return-void

    .line 60
    :cond_0
    iput-object p1, p0, Lcom/mopub/mobileads/VastVideoInterstitial;->g:Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;

    .line 61
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoInterstitial;->d:Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;

    invoke-interface {v0}, Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;->onInterstitialLoaded()V

    goto :goto_0
.end method

.method public showInterstitial()V
    .locals 4

    .prologue
    .line 37
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoInterstitial;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/mopub/mobileads/VastVideoInterstitial;->g:Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;

    iget-wide v2, p0, Lcom/mopub/mobileads/VastVideoInterstitial;->c:J

    invoke-static {v0, v1, v2, v3}, Lcom/mopub/mobileads/MraidVideoPlayerActivity;->a(Landroid/content/Context;Lcom/mopub/mobileads/util/vast/VastVideoConfiguration;J)V

    .line 38
    return-void
.end method
