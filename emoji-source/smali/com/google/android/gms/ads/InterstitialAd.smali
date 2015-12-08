.class public final Lcom/google/android/gms/ads/InterstitialAd;
.super Ljava/lang/Object;


# instance fields
.field private final ky:Lcom/google/android/gms/internal/av;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/av;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/av;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->ky:Lcom/google/android/gms/internal/av;

    return-void
.end method


# virtual methods
.method public getAdListener()Lcom/google/android/gms/ads/AdListener;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->ky:Lcom/google/android/gms/internal/av;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/av;->getAdListener()Lcom/google/android/gms/ads/AdListener;

    move-result-object v0

    return-object v0
.end method

.method public getAdUnitId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->ky:Lcom/google/android/gms/internal/av;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/av;->getAdUnitId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getInAppPurchaseListener()Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->ky:Lcom/google/android/gms/internal/av;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/av;->getInAppPurchaseListener()Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

    move-result-object v0

    return-object v0
.end method

.method public isLoaded()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->ky:Lcom/google/android/gms/internal/av;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/av;->isLoaded()Z

    move-result v0

    return v0
.end method

.method public loadAd(Lcom/google/android/gms/ads/AdRequest;)V
    .locals 2
    .param p1, "adRequest"    # Lcom/google/android/gms/ads/AdRequest;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->ky:Lcom/google/android/gms/internal/av;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdRequest;->T()Lcom/google/android/gms/internal/at;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/av;->a(Lcom/google/android/gms/internal/at;)V

    return-void
.end method

.method public setAdListener(Lcom/google/android/gms/ads/AdListener;)V
    .locals 1
    .param p1, "adListener"    # Lcom/google/android/gms/ads/AdListener;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->ky:Lcom/google/android/gms/internal/av;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/av;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V

    return-void
.end method

.method public setAdUnitId(Ljava/lang/String;)V
    .locals 1
    .param p1, "adUnitId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->ky:Lcom/google/android/gms/internal/av;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/av;->setAdUnitId(Ljava/lang/String;)V

    return-void
.end method

.method public setInAppPurchaseListener(Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;)V
    .locals 1
    .param p1, "inAppPurchaseListener"    # Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->ky:Lcom/google/android/gms/internal/av;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/av;->setInAppPurchaseListener(Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;)V

    return-void
.end method

.method public setPlayStorePurchaseParams(Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;Ljava/lang/String;)V
    .locals 1
    .param p1, "playStorePurchaseListener"    # Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;
    .param p2, "publicKey"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->ky:Lcom/google/android/gms/internal/av;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/av;->setPlayStorePurchaseParams(Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;Ljava/lang/String;)V

    return-void
.end method

.method public show()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->ky:Lcom/google/android/gms/internal/av;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/av;->show()V

    return-void
.end method
