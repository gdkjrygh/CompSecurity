.class final Lcom/cmcm/adsdk/nativead/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/ads/formats/NativeContentAd$OnContentAdLoadedListener;


# instance fields
.field final synthetic a:Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;


# direct methods
.method constructor <init>(Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;)V
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lcom/cmcm/adsdk/nativead/b;->a:Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onContentAdLoaded(Lcom/google/android/gms/ads/formats/NativeContentAd;)V
    .locals 3

    .prologue
    .line 96
    const-string v0, "AdmobNativeLoader"

    const-string v1, "Admob NativeContentAd load sucess"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    new-instance v0, Lcom/cmcm/adsdk/nativead/j;

    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/b;->a:Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;

    iget-object v1, v1, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mPositionId:Ljava/lang/String;

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/b;->a:Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;

    iget-object v2, v2, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mNativeAdListener:Lcom/cmcm/adsdk/nativead/h;

    invoke-direct {v0, p1, v1, v2}, Lcom/cmcm/adsdk/nativead/j;-><init>(Lcom/google/android/gms/ads/formats/NativeAd;Ljava/lang/String;Lcom/cmcm/adsdk/nativead/h;)V

    .line 98
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/b;->a:Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;

    # getter for: Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mAdmobdPool:Ljava/util/List;
    invoke-static {v1}, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->access$300(Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/b;->a:Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;

    # invokes: Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->notifyAdSelected()V
    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->access$400(Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;)V

    .line 100
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/b;->a:Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;

    # getter for: Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->isLoading:Ljava/util/concurrent/atomic/AtomicBoolean;
    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->access$000(Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 101
    return-void
.end method
