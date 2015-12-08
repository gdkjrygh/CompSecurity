.class public final Lcom/google/android/gms/internal/au;
.super Ljava/lang/Object;


# instance fields
.field private lF:Lcom/google/android/gms/ads/AdListener;

.field private lV:Lcom/google/android/gms/ads/doubleclick/AppEventListener;

.field private lX:Ljava/lang/String;

.field private final mContext:Landroid/content/Context;

.field private final ml:Lcom/google/android/gms/internal/bp;

.field private final mm:Lcom/google/android/gms/internal/aj;

.field private mn:Lcom/google/android/gms/internal/ap;

.field private mp:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/aj;->az()Lcom/google/android/gms/internal/aj;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/au;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/aj;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/aj;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/bp;

    invoke-direct {v0}, Lcom/google/android/gms/internal/bp;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/au;->ml:Lcom/google/android/gms/internal/bp;

    iput-object p1, p0, Lcom/google/android/gms/internal/au;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/au;->mm:Lcom/google/android/gms/internal/aj;

    return-void
.end method

.method private k(Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/au;->lX:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/au;->l(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/au;->mContext:Landroid/content/Context;

    new-instance v1, Lcom/google/android/gms/internal/ak;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ak;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/internal/au;->lX:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/au;->ml:Lcom/google/android/gms/internal/bp;

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ag;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ak;Ljava/lang/String;Lcom/google/android/gms/internal/bp;)Lcom/google/android/gms/internal/ap;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/au;->mn:Lcom/google/android/gms/internal/ap;

    iget-object v0, p0, Lcom/google/android/gms/internal/au;->lF:Lcom/google/android/gms/ads/AdListener;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/au;->mn:Lcom/google/android/gms/internal/ap;

    new-instance v1, Lcom/google/android/gms/internal/af;

    iget-object v2, p0, Lcom/google/android/gms/internal/au;->lF:Lcom/google/android/gms/ads/AdListener;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/af;-><init>(Lcom/google/android/gms/ads/AdListener;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ap;->a(Lcom/google/android/gms/internal/ao;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/au;->lV:Lcom/google/android/gms/ads/doubleclick/AppEventListener;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/au;->mn:Lcom/google/android/gms/internal/ap;

    new-instance v1, Lcom/google/android/gms/internal/am;

    iget-object v2, p0, Lcom/google/android/gms/internal/au;->lV:Lcom/google/android/gms/ads/doubleclick/AppEventListener;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/am;-><init>(Lcom/google/android/gms/ads/doubleclick/AppEventListener;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ap;->a(Lcom/google/android/gms/internal/ar;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/au;->mp:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/au;->mn:Lcom/google/android/gms/internal/ap;

    new-instance v1, Lcom/google/android/gms/internal/cp;

    iget-object v2, p0, Lcom/google/android/gms/internal/au;->mp:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/cp;-><init>(Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ap;->a(Lcom/google/android/gms/internal/co;)V

    :cond_3
    return-void
.end method

.method private l(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/au;->mn:Lcom/google/android/gms/internal/ap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The ad unit ID must be set on InterstitialAd before "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is called."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/as;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/au;->mn:Lcom/google/android/gms/internal/ap;

    if-nez v0, :cond_0

    const-string v0, "loadAd"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/au;->k(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/au;->mn:Lcom/google/android/gms/internal/ap;

    iget-object v1, p0, Lcom/google/android/gms/internal/au;->mm:Lcom/google/android/gms/internal/aj;

    iget-object v2, p0, Lcom/google/android/gms/internal/au;->mContext:Landroid/content/Context;

    invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/internal/aj;->a(Landroid/content/Context;Lcom/google/android/gms/internal/as;)Lcom/google/android/gms/internal/ah;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ap;->a(Lcom/google/android/gms/internal/ah;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/au;->ml:Lcom/google/android/gms/internal/bp;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/as;->aC()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/bp;->c(Ljava/util/Map;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/au;->ml:Lcom/google/android/gms/internal/bp;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/as;->aD()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/bp;->d(Ljava/util/Map;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to load ad."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/dw;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public getAdListener()Lcom/google/android/gms/ads/AdListener;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/au;->lF:Lcom/google/android/gms/ads/AdListener;

    return-object v0
.end method

.method public getAdUnitId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/au;->lX:Ljava/lang/String;

    return-object v0
.end method

.method public getAppEventListener()Lcom/google/android/gms/ads/doubleclick/AppEventListener;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/au;->lV:Lcom/google/android/gms/ads/doubleclick/AppEventListener;

    return-object v0
.end method

.method public getInAppPurchaseListener()Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/au;->mp:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

    return-object v0
.end method

.method public isLoaded()Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/au;->mn:Lcom/google/android/gms/internal/ap;

    if-nez v1, :cond_0

    :goto_0
    return v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/au;->mn:Lcom/google/android/gms/internal/ap;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ap;->isReady()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Failed to check if ad is ready."

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/dw;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public setAdListener(Lcom/google/android/gms/ads/AdListener;)V
    .locals 2
    .param p1, "adListener"    # Lcom/google/android/gms/ads/AdListener;

    .prologue
    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/au;->lF:Lcom/google/android/gms/ads/AdListener;

    iget-object v0, p0, Lcom/google/android/gms/internal/au;->mn:Lcom/google/android/gms/internal/ap;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/au;->mn:Lcom/google/android/gms/internal/ap;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/af;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/af;-><init>(Lcom/google/android/gms/ads/AdListener;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ap;->a(Lcom/google/android/gms/internal/ao;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set the AdListener."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/dw;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public setAdUnitId(Ljava/lang/String;)V
    .locals 2
    .param p1, "adUnitId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/au;->lX:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The ad unit ID can only be set once on InterstitialAd."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/au;->lX:Ljava/lang/String;

    return-void
.end method

.method public setAppEventListener(Lcom/google/android/gms/ads/doubleclick/AppEventListener;)V
    .locals 2
    .param p1, "appEventListener"    # Lcom/google/android/gms/ads/doubleclick/AppEventListener;

    .prologue
    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/au;->lV:Lcom/google/android/gms/ads/doubleclick/AppEventListener;

    iget-object v0, p0, Lcom/google/android/gms/internal/au;->mn:Lcom/google/android/gms/internal/ap;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/au;->mn:Lcom/google/android/gms/internal/ap;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/am;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/am;-><init>(Lcom/google/android/gms/ads/doubleclick/AppEventListener;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ap;->a(Lcom/google/android/gms/internal/ar;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set the AppEventListener."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/dw;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public setInAppPurchaseListener(Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;)V
    .locals 2
    .param p1, "inAppPurchaseListener"    # Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

    .prologue
    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/au;->mp:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

    iget-object v0, p0, Lcom/google/android/gms/internal/au;->mn:Lcom/google/android/gms/internal/ap;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/au;->mn:Lcom/google/android/gms/internal/ap;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/cp;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/cp;-><init>(Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ap;->a(Lcom/google/android/gms/internal/co;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set the InAppPurchaseListener."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/dw;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public show()V
    .locals 2

    :try_start_0
    const-string v0, "show"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/au;->l(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/au;->mn:Lcom/google/android/gms/internal/ap;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ap;->showInterstitial()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to show interstitial."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/dw;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
