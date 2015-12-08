.class final Lcom/cmcm/adsdk/nativead/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/nativeads/MoPubNative$MoPubNativeListener;


# instance fields
.field final synthetic a:Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;


# direct methods
.method constructor <init>(Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;)V
    .locals 0

    .prologue
    .line 111
    iput-object p1, p0, Lcom/cmcm/adsdk/nativead/i;->a:Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onNativeClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 127
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/i;->a:Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;

    iget-object v0, v0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mNativeAdListener:Lcom/cmcm/adsdk/nativead/h;

    if-eqz v0, :cond_0

    .line 128
    const-string v0, "MopubNativeAdLoader"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Mopub handleClickAdtitle:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/i;->a:Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;

    # getter for: Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mCurrentAd:Lcom/cmcm/a/a/a;
    invoke-static {v2}, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->access$000(Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;)Lcom/cmcm/a/a/a;

    move-result-object v2

    invoke-interface {v2}, Lcom/cmcm/a/a/a;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/i;->a:Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;

    iget-object v0, v0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mNativeAdListener:Lcom/cmcm/adsdk/nativead/h;

    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/i;->a:Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;

    # getter for: Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mCurrentAd:Lcom/cmcm/a/a/a;
    invoke-static {v1}, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->access$000(Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;)Lcom/cmcm/a/a/a;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/cmcm/adsdk/nativead/h;->b(Lcom/cmcm/a/a/a;)V

    .line 130
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    const-string v1, "com.mopub.ad"

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/i;->a:Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;

    iget-object v2, v2, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mPositionId:Ljava/lang/String;

    const/16 v3, 0xbbb

    invoke-virtual {v0, v1, v2, v3}, Lcom/picksinit/b;->doRecommendAdClickReport(Ljava/lang/String;Ljava/lang/String;I)V

    .line 132
    :cond_0
    return-void
.end method

.method public final onNativeFail(Lcom/mopub/nativeads/NativeErrorCode;)V
    .locals 3

    .prologue
    .line 149
    const-string v0, "MopubNativeAdLoader"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Mopub adFailedToLoad"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mopub/nativeads/NativeErrorCode;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/i;->a:Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;

    const/4 v1, 0x0

    # setter for: Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->isLoading:Z
    invoke-static {v0, v1}, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->access$102(Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;Z)Z

    .line 151
    const-string v0, "MopubNativeAdLoader"

    const-string v1, "isLoading set false"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    const-string v0, "MopubNativeAdLoader"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "isLoading :"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/i;->a:Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;

    # getter for: Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->isLoading:Z
    invoke-static {v2}, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->access$100(Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/i;->a:Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;

    invoke-virtual {p1}, Lcom/mopub/nativeads/NativeErrorCode;->name()Ljava/lang/String;

    move-result-object v1

    # invokes: Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->notifyFailed(Ljava/lang/String;)V
    invoke-static {v0, v1}, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->access$400(Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;Ljava/lang/String;)V

    .line 155
    return-void
.end method

.method public final onNativeImpression(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 115
    const-string v0, "MopubNativeAdLoader"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Mopub handleImpressionAdtitle:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/i;->a:Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;

    # getter for: Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mCurrentAd:Lcom/cmcm/a/a/a;
    invoke-static {v2}, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->access$000(Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;)Lcom/cmcm/a/a/a;

    move-result-object v2

    invoke-interface {v2}, Lcom/cmcm/a/a/a;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/i;->a:Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;

    # getter for: Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mCurrentAd:Lcom/cmcm/a/a/a;
    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->access$000(Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;)Lcom/cmcm/a/a/a;

    move-result-object v0

    instance-of v0, v0, Lcom/cmcm/adsdk/nativead/d;

    if-eqz v0, :cond_0

    .line 117
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/i;->a:Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;

    # getter for: Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mCurrentAd:Lcom/cmcm/a/a/a;
    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->access$000(Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;)Lcom/cmcm/a/a/a;

    move-result-object v0

    check-cast v0, Lcom/cmcm/adsdk/nativead/d;

    iget-boolean v0, v0, Lcom/cmcm/adsdk/nativead/d;->a:Z

    if-nez v0, :cond_0

    .line 118
    const-string v0, "MopubNativeAdLoader"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Mopub title:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/i;->a:Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;

    # getter for: Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mCurrentAd:Lcom/cmcm/a/a/a;
    invoke-static {v2}, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->access$000(Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;)Lcom/cmcm/a/a/a;

    move-result-object v2

    invoke-interface {v2}, Lcom/cmcm/a/a/a;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is a new ad or has setReUse"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    const-string v1, "com.mopub.ad"

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/i;->a:Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;

    iget-object v2, v2, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mPositionId:Ljava/lang/String;

    const/16 v3, 0xbbb

    invoke-virtual {v0, v1, v2, v3}, Lcom/picksinit/b;->doRecommendAdViewReport(Ljava/lang/String;Ljava/lang/String;I)V

    .line 120
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/i;->a:Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;

    # getter for: Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mCurrentAd:Lcom/cmcm/a/a/a;
    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->access$000(Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;)Lcom/cmcm/a/a/a;

    move-result-object v0

    check-cast v0, Lcom/cmcm/adsdk/nativead/d;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/cmcm/adsdk/nativead/d;->a:Z

    .line 123
    :cond_0
    return-void
.end method

.method public final onNativeLoad(Lcom/mopub/nativeads/NativeResponse;)V
    .locals 4

    .prologue
    .line 136
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/i;->a:Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;

    const/4 v1, 0x0

    # setter for: Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->isLoading:Z
    invoke-static {v0, v1}, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->access$102(Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;Z)Z

    .line 137
    if-eqz p1, :cond_0

    .line 138
    const-string v0, "MopubNativeAdLoader"

    const-string v1, "loadAd success"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    new-instance v0, Lcom/cmcm/adsdk/nativead/v;

    invoke-direct {v0, p1}, Lcom/cmcm/adsdk/nativead/v;-><init>(Lcom/mopub/nativeads/NativeResponse;)V

    .line 140
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/i;->a:Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;

    # getter for: Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mMopubAdPool:Ljava/util/List;
    invoke-static {v1}, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->access$200(Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 141
    const-string v1, "MopubNativeAdLoader"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "adpool add ad title:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/cmcm/adsdk/nativead/v;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ",adpool size :"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/i;->a:Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;

    # getter for: Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mMopubAdPool:Ljava/util/List;
    invoke-static {v2}, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->access$200(Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    :cond_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/i;->a:Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;

    # invokes: Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->notifyAdSelected()V
    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->access$300(Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;)V

    .line 145
    return-void
.end method
