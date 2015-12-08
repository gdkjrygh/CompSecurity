.class public final Lcom/google/android/gms/ads/InterstitialAd;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/google/android/gms/ads/internal/client/zzaa;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/ads/internal/client/zzaa;

    invoke-direct {v0, p1}, Lcom/google/android/gms/ads/internal/client/zzaa;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->a:Lcom/google/android/gms/ads/internal/client/zzaa;

    return-void
.end method


# virtual methods
.method public final getAdListener()Lcom/google/android/gms/ads/AdListener;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->a:Lcom/google/android/gms/ads/internal/client/zzaa;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/zzaa;->getAdListener()Lcom/google/android/gms/ads/AdListener;

    move-result-object v0

    return-object v0
.end method

.method public final getAdUnitId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->a:Lcom/google/android/gms/ads/internal/client/zzaa;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/zzaa;->getAdUnitId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getInAppPurchaseListener()Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->a:Lcom/google/android/gms/ads/internal/client/zzaa;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/zzaa;->getInAppPurchaseListener()Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

    move-result-object v0

    return-object v0
.end method

.method public final getMediationAdapterClassName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->a:Lcom/google/android/gms/ads/internal/client/zzaa;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/zzaa;->getMediationAdapterClassName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final isLoaded()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->a:Lcom/google/android/gms/ads/internal/client/zzaa;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/zzaa;->isLoaded()Z

    move-result v0

    return v0
.end method

.method public final isLoading()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->a:Lcom/google/android/gms/ads/internal/client/zzaa;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/zzaa;->isLoading()Z

    move-result v0

    return v0
.end method

.method public final loadAd(Lcom/google/android/gms/ads/AdRequest;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->a:Lcom/google/android/gms/ads/internal/client/zzaa;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdRequest;->zzaF()Lcom/google/android/gms/ads/internal/client/zzy;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/client/zzaa;->zza(Lcom/google/android/gms/ads/internal/client/zzy;)V

    return-void
.end method

.method public final setAdListener(Lcom/google/android/gms/ads/AdListener;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->a:Lcom/google/android/gms/ads/internal/client/zzaa;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/zzaa;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V

    if-eqz p1, :cond_1

    instance-of v0, p1, Lcom/google/android/gms/ads/internal/client/zza;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->a:Lcom/google/android/gms/ads/internal/client/zzaa;

    check-cast p1, Lcom/google/android/gms/ads/internal/client/zza;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/zzaa;->zza(Lcom/google/android/gms/ads/internal/client/zza;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->a:Lcom/google/android/gms/ads/internal/client/zzaa;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/client/zzaa;->zza(Lcom/google/android/gms/ads/internal/client/zza;)V

    goto :goto_0
.end method

.method public final setAdUnitId(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->a:Lcom/google/android/gms/ads/internal/client/zzaa;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/zzaa;->setAdUnitId(Ljava/lang/String;)V

    return-void
.end method

.method public final setInAppPurchaseListener(Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->a:Lcom/google/android/gms/ads/internal/client/zzaa;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/zzaa;->setInAppPurchaseListener(Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;)V

    return-void
.end method

.method public final setPlayStorePurchaseParams(Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->a:Lcom/google/android/gms/ads/internal/client/zzaa;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/ads/internal/client/zzaa;->setPlayStorePurchaseParams(Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;Ljava/lang/String;)V

    return-void
.end method

.method public final show()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->a:Lcom/google/android/gms/ads/internal/client/zzaa;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/zzaa;->show()V

    return-void
.end method
