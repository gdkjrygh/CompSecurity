.class public Lcom/mopub/mobileads/MoPubInterstitial;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/mobileads/q;


# instance fields
.field private a:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

.field private b:Lcom/mopub/mobileads/CustomEventInterstitialAdapter;

.field private c:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;

.field private d:Landroid/app/Activity;

.field private e:Ljava/lang/String;

.field private f:I

.field private g:Z

.field private h:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialListener;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Lcom/mopub/mobileads/MoPubInterstitial;->d:Landroid/app/Activity;

    .line 55
    iput-object p2, p0, Lcom/mopub/mobileads/MoPubInterstitial;->e:Ljava/lang/String;

    .line 57
    new-instance v0, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    iget-object v1, p0, Lcom/mopub/mobileads/MoPubInterstitial;->d:Landroid/app/Activity;

    invoke-direct {v0, p0, v1}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;-><init>(Lcom/mopub/mobileads/MoPubInterstitial;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->a:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    .line 58
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->a:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    iget-object v1, p0, Lcom/mopub/mobileads/MoPubInterstitial;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->setAdUnitId(Ljava/lang/String;)V

    .line 60
    sget v0, Lcom/mopub/mobileads/x;->NOT_READY$414e0682:I

    iput v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->f:I

    .line 62
    return-void
.end method

.method static synthetic a(Lcom/mopub/mobileads/MoPubInterstitial;)Lcom/mopub/mobileads/CustomEventInterstitialAdapter;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->b:Lcom/mopub/mobileads/CustomEventInterstitialAdapter;

    return-object v0
.end method

.method static synthetic a(Lcom/mopub/mobileads/MoPubInterstitial;Lcom/mopub/mobileads/CustomEventInterstitialAdapter;)Lcom/mopub/mobileads/CustomEventInterstitialAdapter;
    .locals 0

    .prologue
    .line 18
    iput-object p1, p0, Lcom/mopub/mobileads/MoPubInterstitial;->b:Lcom/mopub/mobileads/CustomEventInterstitialAdapter;

    return-object p1
.end method

.method static synthetic b(Lcom/mopub/mobileads/MoPubInterstitial;)Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->c:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;

    return-object v0
.end method

.method private b()V
    .locals 1

    .prologue
    .line 75
    sget v0, Lcom/mopub/mobileads/x;->NOT_READY$414e0682:I

    iput v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->f:I

    .line 77
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->b:Lcom/mopub/mobileads/CustomEventInterstitialAdapter;

    if-eqz v0, :cond_0

    .line 78
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->b:Lcom/mopub/mobileads/CustomEventInterstitialAdapter;

    invoke-virtual {v0}, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->c()V

    .line 79
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->b:Lcom/mopub/mobileads/CustomEventInterstitialAdapter;

    .line 82
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->g:Z

    .line 83
    return-void
.end method


# virtual methods
.method final a()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 107
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->a:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->b()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public customEventActionWillBegin()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 328
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->a:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->a:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->c()V

    .line 329
    :cond_0
    return-void
.end method

.method public customEventDidFailToLoadAd()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 323
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->a:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->a:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    sget-object v1, Lcom/mopub/mobileads/MoPubErrorCode;->UNSPECIFIED:Lcom/mopub/mobileads/MoPubErrorCode;

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->b(Lcom/mopub/mobileads/MoPubErrorCode;)V

    .line 324
    :cond_0
    return-void
.end method

.method public customEventDidLoadAd()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 318
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->a:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->a:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->a()V

    .line 319
    :cond_0
    return-void
.end method

.method public destroy()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 133
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->g:Z

    .line 135
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->b:Lcom/mopub/mobileads/CustomEventInterstitialAdapter;

    if-eqz v0, :cond_0

    .line 136
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->b:Lcom/mopub/mobileads/CustomEventInterstitialAdapter;

    invoke-virtual {v0}, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->c()V

    .line 137
    iput-object v1, p0, Lcom/mopub/mobileads/MoPubInterstitial;->b:Lcom/mopub/mobileads/CustomEventInterstitialAdapter;

    .line 140
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->a:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->setBannerAdListener(Lcom/mopub/mobileads/MoPubView$BannerAdListener;)V

    .line 141
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->a:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->destroy()V

    .line 142
    return-void
.end method

.method public forceRefresh()V
    .locals 1

    .prologue
    .line 70
    invoke-direct {p0}, Lcom/mopub/mobileads/MoPubInterstitial;->b()V

    .line 71
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->a:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->forceRefresh()V

    .line 72
    return-void
.end method

.method public getActivity()Landroid/app/Activity;
    .locals 1

    .prologue
    .line 125
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->d:Landroid/app/Activity;

    return-object v0
.end method

.method public getInterstitialAdListener()Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;
    .locals 1

    .prologue
    .line 149
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->c:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;

    return-object v0
.end method

.method public getKeywords()Ljava/lang/String;
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->a:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->getKeywords()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getListener()Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialListener;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 313
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->h:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialListener;

    return-object v0
.end method

.method public getLocalExtras()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 165
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->a:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->getLocalExtras()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getLocation()Landroid/location/Location;
    .locals 1

    .prologue
    .line 129
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->a:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->getLocation()Landroid/location/Location;

    move-result-object v0

    return-object v0
.end method

.method public getLocationAwareness()Lcom/mopub/common/LocationService$LocationAwareness;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 233
    invoke-static {}, Lcom/mopub/common/MoPub;->getLocationAwareness()Lcom/mopub/common/MoPub$LocationAwareness;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/LocationService$LocationAwareness;->fromMoPubLocationAwareness(Lcom/mopub/common/MoPub$LocationAwareness;)Lcom/mopub/common/LocationService$LocationAwareness;

    move-result-object v0

    return-object v0
.end method

.method public getLocationPrecision()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 243
    invoke-static {}, Lcom/mopub/common/MoPub;->getLocationPrecision()I

    move-result v0

    return v0
.end method

.method public getTesting()Z
    .locals 1

    .prologue
    .line 157
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->a:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->getTesting()Z

    move-result v0

    return v0
.end method

.method public isFacebookSupported()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 342
    const/4 v0, 0x0

    return v0
.end method

.method public isReady()Z
    .locals 2

    .prologue
    .line 86
    iget v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->f:I

    .line 1025
    sget v1, Lcom/mopub/mobileads/x;->NOT_READY$414e0682:I

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    .line 86
    goto :goto_0
.end method

.method public load()V
    .locals 1

    .prologue
    .line 65
    invoke-direct {p0}, Lcom/mopub/mobileads/MoPubInterstitial;->b()V

    .line 66
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->a:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->loadAd()V

    .line 67
    return-void
.end method

.method public onCustomEventInterstitialClicked()V
    .locals 1

    .prologue
    .line 206
    .line 4090
    iget-boolean v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->g:Z

    .line 206
    if-eqz v0, :cond_1

    .line 213
    :cond_0
    :goto_0
    return-void

    .line 208
    :cond_1
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->a:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->c()V

    .line 210
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->c:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;

    if-eqz v0, :cond_0

    .line 211
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->c:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;

    invoke-interface {v0, p0}, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;->onInterstitialClicked(Lcom/mopub/mobileads/MoPubInterstitial;)V

    goto :goto_0
.end method

.method public onCustomEventInterstitialDismissed()V
    .locals 1

    .prologue
    .line 217
    .line 5090
    iget-boolean v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->g:Z

    .line 217
    if-eqz v0, :cond_1

    .line 224
    :cond_0
    :goto_0
    return-void

    .line 219
    :cond_1
    sget v0, Lcom/mopub/mobileads/x;->NOT_READY$414e0682:I

    iput v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->f:I

    .line 221
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->c:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;

    if-eqz v0, :cond_0

    .line 222
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->c:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;

    invoke-interface {v0, p0}, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;->onInterstitialDismissed(Lcom/mopub/mobileads/MoPubInterstitial;)V

    goto :goto_0
.end method

.method public onCustomEventInterstitialFailed(Lcom/mopub/mobileads/MoPubErrorCode;)V
    .locals 1

    .prologue
    .line 187
    .line 2090
    iget-boolean v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->g:Z

    .line 187
    if-eqz v0, :cond_0

    .line 191
    :goto_0
    return-void

    .line 189
    :cond_0
    sget v0, Lcom/mopub/mobileads/x;->NOT_READY$414e0682:I

    iput v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->f:I

    .line 190
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->a:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->b(Lcom/mopub/mobileads/MoPubErrorCode;)V

    goto :goto_0
.end method

.method public onCustomEventInterstitialLoaded()V
    .locals 1

    .prologue
    .line 174
    iget-boolean v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->g:Z

    if-eqz v0, :cond_1

    .line 183
    :cond_0
    :goto_0
    return-void

    .line 176
    :cond_1
    sget v0, Lcom/mopub/mobileads/x;->CUSTOM_EVENT_AD_READY$414e0682:I

    iput v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->f:I

    .line 178
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->c:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;

    if-eqz v0, :cond_2

    .line 179
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->c:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;

    invoke-interface {v0, p0}, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;->onInterstitialLoaded(Lcom/mopub/mobileads/MoPubInterstitial;)V

    goto :goto_0

    .line 180
    :cond_2
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->h:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialListener;

    if-eqz v0, :cond_0

    .line 181
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->h:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialListener;

    invoke-interface {v0}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialListener;->OnInterstitialLoaded()V

    goto :goto_0
.end method

.method public onCustomEventInterstitialShown()V
    .locals 1

    .prologue
    .line 195
    .line 3090
    iget-boolean v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->g:Z

    .line 195
    if-eqz v0, :cond_1

    .line 202
    :cond_0
    :goto_0
    return-void

    .line 197
    :cond_1
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->a:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->a()V

    .line 199
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->c:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;

    if-eqz v0, :cond_0

    .line 200
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->c:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;

    invoke-interface {v0, p0}, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;->onInterstitialShown(Lcom/mopub/mobileads/MoPubInterstitial;)V

    goto :goto_0
.end method

.method public setFacebookSupported(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 335
    return-void
.end method

.method public setInterstitialAdListener(Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;)V
    .locals 0

    .prologue
    .line 145
    iput-object p1, p0, Lcom/mopub/mobileads/MoPubInterstitial;->c:Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;

    .line 146
    return-void
.end method

.method public setKeywords(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 117
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->a:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->setKeywords(Ljava/lang/String;)V

    .line 118
    return-void
.end method

.method public setListener(Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialListener;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 308
    iput-object p1, p0, Lcom/mopub/mobileads/MoPubInterstitial;->h:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialListener;

    .line 309
    return-void
.end method

.method public setLocalExtras(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 161
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->a:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->setLocalExtras(Ljava/util/Map;)V

    .line 162
    return-void
.end method

.method public setLocationAwareness(Lcom/mopub/common/LocationService$LocationAwareness;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 228
    invoke-virtual {p1}, Lcom/mopub/common/LocationService$LocationAwareness;->getNewLocationAwareness()Lcom/mopub/common/MoPub$LocationAwareness;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/MoPub;->setLocationAwareness(Lcom/mopub/common/MoPub$LocationAwareness;)V

    .line 229
    return-void
.end method

.method public setLocationPrecision(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 238
    invoke-static {p1}, Lcom/mopub/common/MoPub;->setLocationPrecision(I)V

    .line 239
    return-void
.end method

.method public setTesting(Z)V
    .locals 1

    .prologue
    .line 153
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->a:Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->setTesting(Z)V

    .line 154
    return-void
.end method

.method public show()Z
    .locals 2

    .prologue
    .line 94
    sget-object v0, Lcom/mopub/mobileads/w;->a:[I

    iget v1, p0, Lcom/mopub/mobileads/MoPubInterstitial;->f:I

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 99
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 1103
    :pswitch_0
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->b:Lcom/mopub/mobileads/CustomEventInterstitialAdapter;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial;->b:Lcom/mopub/mobileads/CustomEventInterstitialAdapter;

    invoke-virtual {v0}, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->b()V

    .line 97
    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    .line 94
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
