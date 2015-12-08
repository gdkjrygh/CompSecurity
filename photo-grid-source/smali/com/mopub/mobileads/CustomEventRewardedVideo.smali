.class public abstract Lcom/mopub/mobileads/CustomEventRewardedVideo;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    return-void
.end method


# virtual methods
.method protected abstract a()Lcom/mopub/mobileads/CustomEventRewardedVideo$CustomEventRewardedVideoListener;
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation
.end method

.method final a(Landroid/app/Activity;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            ")V"
        }
    .end annotation

    .prologue
    .line 71
    :try_start_0
    invoke-virtual {p0}, Lcom/mopub/mobileads/CustomEventRewardedVideo;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 72
    invoke-static {p1}, Lcom/mopub/common/MoPubLifecycleManager;->getInstance(Landroid/app/Activity;)Lcom/mopub/common/MoPubLifecycleManager;

    move-result-object v0

    invoke-virtual {p0}, Lcom/mopub/mobileads/CustomEventRewardedVideo;->b()Lcom/mopub/common/LifecycleListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mopub/common/MoPubLifecycleManager;->addLifecycleListener(Lcom/mopub/common/LifecycleListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    :cond_0
    :goto_0
    return-void

    .line 76
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->e(Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected abstract b()Lcom/mopub/common/LifecycleListener;
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation
.end method

.method protected abstract c()Ljava/lang/String;
.end method

.method protected abstract d()Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Z"
        }
    .end annotation
.end method

.method protected abstract e()Z
.end method
