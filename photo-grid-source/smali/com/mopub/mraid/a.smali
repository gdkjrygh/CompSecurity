.class final Lcom/mopub/mraid/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/mraid/MraidController$MraidListener;


# instance fields
.field final synthetic a:Lcom/mopub/mraid/MraidBanner;


# direct methods
.method constructor <init>(Lcom/mopub/mraid/MraidBanner;)V
    .locals 0

    .prologue
    .line 54
    iput-object p1, p0, Lcom/mopub/mraid/a;->a:Lcom/mopub/mraid/MraidBanner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClose()V
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/mopub/mraid/a;->a:Lcom/mopub/mraid/MraidBanner;

    invoke-static {v0}, Lcom/mopub/mraid/MraidBanner;->a(Lcom/mopub/mraid/MraidBanner;)Lcom/mopub/mobileads/CustomEventBanner$CustomEventBannerListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/mopub/mobileads/CustomEventBanner$CustomEventBannerListener;->onBannerCollapsed()V

    .line 81
    return-void
.end method

.method public final onExpand()V
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/mopub/mraid/a;->a:Lcom/mopub/mraid/MraidBanner;

    invoke-static {v0}, Lcom/mopub/mraid/MraidBanner;->a(Lcom/mopub/mraid/MraidBanner;)Lcom/mopub/mobileads/CustomEventBanner$CustomEventBannerListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/mopub/mobileads/CustomEventBanner$CustomEventBannerListener;->onBannerExpanded()V

    .line 70
    iget-object v0, p0, Lcom/mopub/mraid/a;->a:Lcom/mopub/mraid/MraidBanner;

    invoke-static {v0}, Lcom/mopub/mraid/MraidBanner;->a(Lcom/mopub/mraid/MraidBanner;)Lcom/mopub/mobileads/CustomEventBanner$CustomEventBannerListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/mopub/mobileads/CustomEventBanner$CustomEventBannerListener;->onBannerClicked()V

    .line 71
    return-void
.end method

.method public final onFailedToLoad()V
    .locals 2

    .prologue
    .line 64
    iget-object v0, p0, Lcom/mopub/mraid/a;->a:Lcom/mopub/mraid/MraidBanner;

    invoke-static {v0}, Lcom/mopub/mraid/MraidBanner;->a(Lcom/mopub/mraid/MraidBanner;)Lcom/mopub/mobileads/CustomEventBanner$CustomEventBannerListener;

    move-result-object v0

    sget-object v1, Lcom/mopub/mobileads/MoPubErrorCode;->MRAID_LOAD_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

    invoke-interface {v0, v1}, Lcom/mopub/mobileads/CustomEventBanner$CustomEventBannerListener;->onBannerFailed(Lcom/mopub/mobileads/MoPubErrorCode;)V

    .line 65
    return-void
.end method

.method public final onLoaded(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 58
    invoke-static {p1}, Lcom/mopub/mobileads/AdViewController;->setShouldHonorServerDimensions(Landroid/view/View;)V

    .line 59
    iget-object v0, p0, Lcom/mopub/mraid/a;->a:Lcom/mopub/mraid/MraidBanner;

    invoke-static {v0}, Lcom/mopub/mraid/MraidBanner;->a(Lcom/mopub/mraid/MraidBanner;)Lcom/mopub/mobileads/CustomEventBanner$CustomEventBannerListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/mopub/mobileads/CustomEventBanner$CustomEventBannerListener;->onBannerLoaded(Landroid/view/View;)V

    .line 60
    return-void
.end method

.method public final onOpen()V
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lcom/mopub/mraid/a;->a:Lcom/mopub/mraid/MraidBanner;

    invoke-static {v0}, Lcom/mopub/mraid/MraidBanner;->a(Lcom/mopub/mraid/MraidBanner;)Lcom/mopub/mobileads/CustomEventBanner$CustomEventBannerListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/mopub/mobileads/CustomEventBanner$CustomEventBannerListener;->onBannerClicked()V

    .line 76
    return-void
.end method
