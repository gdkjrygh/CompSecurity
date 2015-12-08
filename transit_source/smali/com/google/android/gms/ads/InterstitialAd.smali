.class public final Lcom/google/android/gms/ads/InterstitialAd;
.super Ljava/lang/Object;


# instance fields
.field private final dS:Lcom/google/android/gms/internal/av;

.field private dT:Lcom/google/android/gms/ads/AdListener;

.field private dU:Lcom/google/android/gms/internal/ac;

.field private dV:Ljava/lang/String;

.field private dW:Lcom/google/android/gms/ads/a;

.field private final mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/av;

    invoke-direct {v0}, Lcom/google/android/gms/internal/av;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->dS:Lcom/google/android/gms/internal/av;

    iput-object p1, p0, Lcom/google/android/gms/ads/InterstitialAd;->mContext:Landroid/content/Context;

    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->dV:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lcom/google/android/gms/ads/InterstitialAd;->d(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->mContext:Landroid/content/Context;

    new-instance v1, Lcom/google/android/gms/internal/x;

    invoke-direct {v1}, Lcom/google/android/gms/internal/x;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/ads/InterstitialAd;->dV:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/ads/InterstitialAd;->dS:Lcom/google/android/gms/internal/av;

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/internal/u;->a(Landroid/content/Context;Lcom/google/android/gms/internal/x;Ljava/lang/String;Lcom/google/android/gms/internal/av;)Lcom/google/android/gms/internal/ac;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->dU:Lcom/google/android/gms/internal/ac;

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->dT:Lcom/google/android/gms/ads/AdListener;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->dU:Lcom/google/android/gms/internal/ac;

    new-instance v1, Lcom/google/android/gms/internal/t;

    iget-object v2, p0, Lcom/google/android/gms/ads/InterstitialAd;->dT:Lcom/google/android/gms/ads/AdListener;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/t;-><init>(Lcom/google/android/gms/ads/AdListener;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ac;->a(Lcom/google/android/gms/internal/ab;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->dW:Lcom/google/android/gms/ads/a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->dU:Lcom/google/android/gms/internal/ac;

    new-instance v1, Lcom/google/android/gms/internal/z;

    iget-object v2, p0, Lcom/google/android/gms/ads/InterstitialAd;->dW:Lcom/google/android/gms/ads/a;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/z;-><init>(Lcom/google/android/gms/ads/a;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ac;->a(Lcom/google/android/gms/internal/ae;)V

    :cond_2
    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->dU:Lcom/google/android/gms/internal/ac;

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
.method public getAdListener()Lcom/google/android/gms/ads/AdListener;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->dT:Lcom/google/android/gms/ads/AdListener;

    return-object v0
.end method

.method public getAdUnitId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->dV:Ljava/lang/String;

    return-object v0
.end method

.method public isLoaded()Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/ads/InterstitialAd;->dU:Lcom/google/android/gms/internal/ac;

    if-nez v1, :cond_0

    :goto_0
    return v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/ads/InterstitialAd;->dU:Lcom/google/android/gms/internal/ac;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ac;->isReady()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Failed to check if ad is ready."

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/cn;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public loadAd(Lcom/google/android/gms/ads/AdRequest;)V
    .locals 3
    .param p1, "adRequest"    # Lcom/google/android/gms/ads/AdRequest;

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->dU:Lcom/google/android/gms/internal/ac;

    if-nez v0, :cond_0

    const-string v0, "loadAd"

    invoke-direct {p0, v0}, Lcom/google/android/gms/ads/InterstitialAd;->c(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->dU:Lcom/google/android/gms/internal/ac;

    new-instance v1, Lcom/google/android/gms/internal/v;

    iget-object v2, p0, Lcom/google/android/gms/ads/InterstitialAd;->mContext:Landroid/content/Context;

    invoke-direct {v1, v2, p1}, Lcom/google/android/gms/internal/v;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/AdRequest;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ac;->a(Lcom/google/android/gms/internal/v;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->dS:Lcom/google/android/gms/internal/av;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdRequest;->v()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/av;->c(Ljava/util/Map;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to load ad."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/cn;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public setAdListener(Lcom/google/android/gms/ads/AdListener;)V
    .locals 2
    .param p1, "adListener"    # Lcom/google/android/gms/ads/AdListener;

    .prologue
    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/ads/InterstitialAd;->dT:Lcom/google/android/gms/ads/AdListener;

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->dU:Lcom/google/android/gms/internal/ac;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/ads/InterstitialAd;->dU:Lcom/google/android/gms/internal/ac;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/t;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/t;-><init>(Lcom/google/android/gms/ads/AdListener;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ac;->a(Lcom/google/android/gms/internal/ab;)V
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

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/cn;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public setAdUnitId(Ljava/lang/String;)V
    .locals 2
    .param p1, "adUnitId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->dV:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The ad unit ID can only be set once on InterstitialAd."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/ads/InterstitialAd;->dV:Ljava/lang/String;

    return-void
.end method

.method public show()V
    .locals 2

    :try_start_0
    const-string v0, "show"

    invoke-direct {p0, v0}, Lcom/google/android/gms/ads/InterstitialAd;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/InterstitialAd;->dU:Lcom/google/android/gms/internal/ac;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ac;->showInterstitial()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to show interstitial."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/cn;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
