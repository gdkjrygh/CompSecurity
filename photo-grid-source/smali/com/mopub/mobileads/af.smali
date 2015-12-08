.class final Lcom/mopub/mobileads/af;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/Class;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/mopub/common/MoPubReward;


# direct methods
.method constructor <init>(Ljava/lang/Class;Ljava/lang/String;Lcom/mopub/common/MoPubReward;)V
    .locals 0

    .prologue
    .line 451
    iput-object p1, p0, Lcom/mopub/mobileads/af;->a:Ljava/lang/Class;

    iput-object p2, p0, Lcom/mopub/mobileads/af;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/mopub/mobileads/af;->c:Lcom/mopub/common/MoPubReward;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 454
    invoke-static {}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a()Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->d(Lcom/mopub/mobileads/MoPubRewardedVideoManager;)Lcom/mopub/mobileads/al;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/mobileads/af;->a:Ljava/lang/Class;

    iget-object v2, p0, Lcom/mopub/mobileads/af;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/mopub/mobileads/al;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/Set;

    move-result-object v0

    .line 455
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 456
    invoke-static {}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a()Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a(Lcom/mopub/mobileads/MoPubRewardedVideoManager;)Lcom/mopub/mobileads/MoPubRewardedVideoListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 457
    invoke-static {}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a()Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a(Lcom/mopub/mobileads/MoPubRewardedVideoManager;)Lcom/mopub/mobileads/MoPubRewardedVideoListener;

    move-result-object v0

    iget-object v2, p0, Lcom/mopub/mobileads/af;->c:Lcom/mopub/common/MoPubReward;

    invoke-interface {v0, v1, v2}, Lcom/mopub/mobileads/MoPubRewardedVideoListener;->onRewardedVideoCompleted(Ljava/util/Set;Lcom/mopub/common/MoPubReward;)V

    .line 459
    :cond_0
    return-void
.end method
