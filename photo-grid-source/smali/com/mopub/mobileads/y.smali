.class final Lcom/mopub/mobileads/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/mopub/mobileads/CustomEventRewardedVideo;

.field final synthetic b:Lcom/mopub/mobileads/MoPubRewardedVideoManager;


# direct methods
.method constructor <init>(Lcom/mopub/mobileads/MoPubRewardedVideoManager;Lcom/mopub/mobileads/CustomEventRewardedVideo;)V
    .locals 0

    .prologue
    .line 298
    iput-object p1, p0, Lcom/mopub/mobileads/y;->b:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    iput-object p2, p0, Lcom/mopub/mobileads/y;->a:Lcom/mopub/mobileads/CustomEventRewardedVideo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 301
    const-string v0, "Custom Event failed to load rewarded video in a timely fashion."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 302
    iget-object v0, p0, Lcom/mopub/mobileads/y;->a:Lcom/mopub/mobileads/CustomEventRewardedVideo;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/mobileads/y;->a:Lcom/mopub/mobileads/CustomEventRewardedVideo;

    invoke-virtual {v1}, Lcom/mopub/mobileads/CustomEventRewardedVideo;->c()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/mopub/mobileads/MoPubErrorCode;->NETWORK_TIMEOUT:Lcom/mopub/mobileads/MoPubErrorCode;

    invoke-static {v0, v1, v2}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->onRewardedVideoLoadFailure(Ljava/lang/Class;Ljava/lang/String;Lcom/mopub/mobileads/MoPubErrorCode;)V

    .line 304
    return-void
.end method
