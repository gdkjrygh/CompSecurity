.class abstract Lcom/mopub/mobileads/ah;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<+",
            "Lcom/mopub/mobileads/CustomEventRewardedVideo;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/mopub/mobileads/CustomEventRewardedVideo;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 489
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 490
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 491
    invoke-static {p2}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 492
    iput-object p1, p0, Lcom/mopub/mobileads/ah;->a:Ljava/lang/Class;

    .line 493
    iput-object p2, p0, Lcom/mopub/mobileads/ah;->b:Ljava/lang/String;

    .line 494
    return-void
.end method


# virtual methods
.method protected abstract a(Ljava/lang/String;)V
.end method

.method public run()V
    .locals 3

    .prologue
    .line 500
    invoke-static {}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a()Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->d(Lcom/mopub/mobileads/MoPubRewardedVideoManager;)Lcom/mopub/mobileads/al;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/mobileads/ah;->a:Ljava/lang/Class;

    iget-object v2, p0, Lcom/mopub/mobileads/ah;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/mopub/mobileads/al;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/Set;

    move-result-object v0

    .line 502
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 503
    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/ah;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 505
    :cond_0
    return-void
.end method
