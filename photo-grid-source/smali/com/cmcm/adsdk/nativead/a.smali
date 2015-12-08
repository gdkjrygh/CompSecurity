.class final Lcom/cmcm/adsdk/nativead/a;
.super Lcom/google/android/gms/ads/AdListener;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;


# direct methods
.method constructor <init>(Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;)V
    .locals 0

    .prologue
    .line 102
    iput-object p1, p0, Lcom/cmcm/adsdk/nativead/a;->a:Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;

    invoke-direct {p0}, Lcom/google/android/gms/ads/AdListener;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAdFailedToLoad(I)V
    .locals 3

    .prologue
    .line 105
    const-string v0, "AdmobNativeLoader"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Admob ad load fail errorCode:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/a;->a:Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;

    # getter for: Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->isLoading:Ljava/util/concurrent/atomic/AtomicBoolean;
    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->access$000(Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 107
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/a;->a:Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    # invokes: Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->notifyFailed(Ljava/lang/String;)V
    invoke-static {v0, v1}, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->access$100(Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;Ljava/lang/String;)V

    .line 108
    return-void
.end method

.method public final onAdOpened()V
    .locals 4

    .prologue
    .line 112
    const-string v0, "AdmobNativeLoader"

    const-string v1, "admob report click"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    const-string v1, "com.admob.native"

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/a;->a:Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;

    iget-object v2, v2, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mPositionId:Ljava/lang/String;

    const/16 v3, 0xbba

    invoke-virtual {v0, v1, v2, v3}, Lcom/picksinit/b;->doRecommendAdClickReport(Ljava/lang/String;Ljava/lang/String;I)V

    .line 114
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/a;->a:Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;

    iget-object v0, v0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mNativeAdListener:Lcom/cmcm/adsdk/nativead/h;

    if-eqz v0, :cond_0

    .line 115
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/a;->a:Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;

    iget-object v0, v0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mNativeAdListener:Lcom/cmcm/adsdk/nativead/h;

    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/a;->a:Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;

    # getter for: Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mCurrentAd:Lcom/cmcm/a/a/a;
    invoke-static {v1}, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->access$200(Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;)Lcom/cmcm/a/a/a;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/cmcm/adsdk/nativead/h;->b(Lcom/cmcm/a/a/a;)V

    .line 117
    :cond_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/a;->a:Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;

    # getter for: Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mCurrentAd:Lcom/cmcm/a/a/a;
    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->access$200(Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;)Lcom/cmcm/a/a/a;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/a;->a:Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;

    # getter for: Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mCurrentAd:Lcom/cmcm/a/a/a;
    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->access$200(Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;)Lcom/cmcm/a/a/a;

    move-result-object v0

    instance-of v0, v0, Lcom/cmcm/adsdk/nativead/d;

    if-eqz v0, :cond_1

    .line 118
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/a;->a:Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;

    # getter for: Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mCurrentAd:Lcom/cmcm/a/a/a;
    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->access$200(Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;)Lcom/cmcm/a/a/a;

    move-result-object v0

    check-cast v0, Lcom/cmcm/adsdk/nativead/d;

    invoke-virtual {v0}, Lcom/cmcm/adsdk/nativead/d;->b()Lcom/cmcm/a/a/b;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 119
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/a;->a:Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;

    # getter for: Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mCurrentAd:Lcom/cmcm/a/a/a;
    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->access$200(Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;)Lcom/cmcm/a/a/a;

    .line 120
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/a;->a:Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;

    # getter for: Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mCurrentAd:Lcom/cmcm/a/a/a;
    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->access$200(Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;)Lcom/cmcm/a/a/a;

    .line 123
    :cond_1
    return-void
.end method
