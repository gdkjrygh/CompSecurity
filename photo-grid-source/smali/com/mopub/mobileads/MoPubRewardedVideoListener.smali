.class public interface abstract Lcom/mopub/mobileads/MoPubRewardedVideoListener;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract onRewardedVideoClosed(Ljava/lang/String;)V
.end method

.method public abstract onRewardedVideoCompleted(Ljava/util/Set;Lcom/mopub/common/MoPubReward;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/mopub/common/MoPubReward;",
            ")V"
        }
    .end annotation
.end method

.method public abstract onRewardedVideoLoadFailure(Ljava/lang/String;Lcom/mopub/mobileads/MoPubErrorCode;)V
.end method

.method public abstract onRewardedVideoLoadSuccess(Ljava/lang/String;)V
.end method

.method public abstract onRewardedVideoPlaybackError(Ljava/lang/String;Lcom/mopub/mobileads/MoPubErrorCode;)V
.end method

.method public abstract onRewardedVideoStarted(Ljava/lang/String;)V
.end method
