.class public final Lcom/google/android/gms/internal/av;
.super Ljava/lang/Object;


# instance fields
.field private lQ:Lcom/google/android/gms/ads/AdListener;

.field private mB:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

.field private mC:Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;

.field private final mContext:Landroid/content/Context;

.field private mh:Lcom/google/android/gms/ads/doubleclick/AppEventListener;

.field private mj:Ljava/lang/String;

.field private final mw:Lcom/google/android/gms/internal/bs;

.field private final mx:Lcom/google/android/gms/internal/ak;

.field private my:Lcom/google/android/gms/internal/aq;

.field private mz:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ak;->aF()Lcom/google/android/gms/internal/ak;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/av;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ak;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ak;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/bs;

    invoke-direct {v0}, Lcom/google/android/gms/internal/bs;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/av;->mw:Lcom/google/android/gms/internal/bs;

    iput-object p1, p0, Lcom/google/android/gms/internal/av;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/av;->mx:Lcom/google/android/gms/internal/ak;

    return-void
.end method

.method private k(Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/av;->mj:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/av;->l(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/av;->mContext:Landroid/content/Context;

    new-instance v1, Lcom/google/android/gms/internal/al;

    invoke-direct {v1}, Lcom/google/android/gms/internal/al;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/internal/av;->mj:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/av;->mw:Lcom/google/android/gms/internal/bs;

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ah;->a(Landroid/content/Context;Lcom/google/android/gms/internal/al;Ljava/lang/String;Lcom/google/android/gms/internal/bs;)Lcom/google/android/gms/internal/aq;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/av;->my:Lcom/google/android/gms/internal/aq;

    iget-object v0, p0, Lcom/google/android/gms/internal/av;->lQ:Lcom/google/android/gms/ads/AdListener;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/av;->my:Lcom/google/android/gms/internal/aq;

    new-instance v1, Lcom/google/android/gms/internal/ag;

    iget-object v2, p0, Lcom/google/android/gms/internal/av;->lQ:Lcom/google/android/gms/ads/AdListener;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ag;-><init>(Lcom/google/android/gms/ads/AdListener;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/aq;->a(Lcom/google/android/gms/internal/ap;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/av;->mh:Lcom/google/android/gms/ads/doubleclick/AppEventListener;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/av;->my:Lcom/google/android/gms/internal/aq;

    new-instance v1, Lcom/google/android/gms/internal/an;

    iget-object v2, p0, Lcom/google/android/gms/internal/av;->mh:Lcom/google/android/gms/ads/doubleclick/AppEventListener;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/an;-><init>(Lcom/google/android/gms/ads/doubleclick/AppEventListener;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/aq;->a(Lcom/google/android/gms/internal/as;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/av;->mB:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/av;->my:Lcom/google/android/gms/internal/aq;

    new-instance v1, Lcom/google/android/gms/internal/dh;

    iget-object v2, p0, Lcom/google/android/gms/internal/av;->mB:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/dh;-><init>(Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/aq;->a(Lcom/google/android/gms/internal/dc;)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/av;->mC:Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/av;->my:Lcom/google/android/gms/internal/aq;

    new-instance v1, Lcom/google/android/gms/internal/dl;

    iget-object v2, p0, Lcom/google/android/gms/internal/av;->mC:Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/dl;-><init>(Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/av;->mz:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/aq;->a(Lcom/google/android/gms/internal/dg;Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method private l(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/av;->my:Lcom/google/android/gms/internal/aq;

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
.method public a(Lcom/google/android/gms/internal/at;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/av;->my:Lcom/google/android/gms/internal/aq;

    if-nez v0, :cond_0

    const-string v0, "loadAd"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/av;->k(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/av;->my:Lcom/google/android/gms/internal/aq;

    iget-object v1, p0, Lcom/google/android/gms/internal/av;->mx:Lcom/google/android/gms/internal/ak;

    iget-object v2, p0, Lcom/google/android/gms/internal/av;->mContext:Landroid/content/Context;

    invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/internal/ak;->a(Landroid/content/Context;Lcom/google/android/gms/internal/at;)Lcom/google/android/gms/internal/ai;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/aq;->a(Lcom/google/android/gms/internal/ai;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/av;->mw:Lcom/google/android/gms/internal/bs;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/at;->aI()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/bs;->c(Ljava/util/Map;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to load ad."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/eu;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public getAdListener()Lcom/google/android/gms/ads/AdListener;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/av;->lQ:Lcom/google/android/gms/ads/AdListener;

    return-object v0
.end method

.method public getAdUnitId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/av;->mj:Ljava/lang/String;

    return-object v0
.end method

.method public getAppEventListener()Lcom/google/android/gms/ads/doubleclick/AppEventListener;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/av;->mh:Lcom/google/android/gms/ads/doubleclick/AppEventListener;

    return-object v0
.end method

.method public getInAppPurchaseListener()Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/av;->mB:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

    return-object v0
.end method

.method public isLoaded()Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/av;->my:Lcom/google/android/gms/internal/aq;

    if-nez v1, :cond_0

    :goto_0
    return v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/av;->my:Lcom/google/android/gms/internal/aq;

    invoke-interface {v1}, Lcom/google/android/gms/internal/aq;->isReady()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Failed to check if ad is ready."

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/eu;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public setAdListener(Lcom/google/android/gms/ads/AdListener;)V
    .locals 2
    .param p1, "adListener"    # Lcom/google/android/gms/ads/AdListener;

    .prologue
    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/av;->lQ:Lcom/google/android/gms/ads/AdListener;

    iget-object v0, p0, Lcom/google/android/gms/internal/av;->my:Lcom/google/android/gms/internal/aq;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/av;->my:Lcom/google/android/gms/internal/aq;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ag;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ag;-><init>(Lcom/google/android/gms/ads/AdListener;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/aq;->a(Lcom/google/android/gms/internal/ap;)V
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

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/eu;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public setAdUnitId(Ljava/lang/String;)V
    .locals 2
    .param p1, "adUnitId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/av;->mj:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The ad unit ID can only be set once on InterstitialAd."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/av;->mj:Ljava/lang/String;

    return-void
.end method

.method public setAppEventListener(Lcom/google/android/gms/ads/doubleclick/AppEventListener;)V
    .locals 2
    .param p1, "appEventListener"    # Lcom/google/android/gms/ads/doubleclick/AppEventListener;

    .prologue
    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/av;->mh:Lcom/google/android/gms/ads/doubleclick/AppEventListener;

    iget-object v0, p0, Lcom/google/android/gms/internal/av;->my:Lcom/google/android/gms/internal/aq;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/av;->my:Lcom/google/android/gms/internal/aq;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/an;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/an;-><init>(Lcom/google/android/gms/ads/doubleclick/AppEventListener;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/aq;->a(Lcom/google/android/gms/internal/as;)V
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

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/eu;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public setInAppPurchaseListener(Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;)V
    .locals 2
    .param p1, "inAppPurchaseListener"    # Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/av;->mC:Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Play store purchase parameter has already been set."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/av;->mB:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

    iget-object v0, p0, Lcom/google/android/gms/internal/av;->my:Lcom/google/android/gms/internal/aq;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/av;->my:Lcom/google/android/gms/internal/aq;

    if-eqz p1, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/dh;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/dh;-><init>(Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/aq;->a(Lcom/google/android/gms/internal/dc;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_1
    return-void

    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set the InAppPurchaseListener."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/eu;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public setPlayStorePurchaseParams(Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;Ljava/lang/String;)V
    .locals 2
    .param p1, "playStorePurchaseListener"    # Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;
    .param p2, "publicKey"    # Ljava/lang/String;

    .prologue
    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/av;->mC:Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;

    iget-object v0, p0, Lcom/google/android/gms/internal/av;->my:Lcom/google/android/gms/internal/aq;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/av;->my:Lcom/google/android/gms/internal/aq;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/dl;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/dl;-><init>(Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;)V

    :goto_0
    invoke-interface {v1, v0, p2}, Lcom/google/android/gms/internal/aq;->a(Lcom/google/android/gms/internal/dg;Ljava/lang/String;)V
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

    const-string v1, "Failed to set the play store purchase parameter."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/eu;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public show()V
    .locals 2

    :try_start_0
    const-string v0, "show"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/av;->l(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/av;->my:Lcom/google/android/gms/internal/aq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/aq;->showInterstitial()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to show interstitial."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/eu;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
