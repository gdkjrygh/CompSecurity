.class public Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;
.super Lcom/cmcm/adsdk/nativead/w;
.source "SourceFile"


# static fields
.field private static final MUPUB_PKG_NAME:Ljava/lang/String; = "com.mopub.ad"

.field private static final TAG:Ljava/lang/String; = "MopubNativeAdLoader"

.field private static sSharedPreferences:Landroid/content/SharedPreferences;


# instance fields
.field private final MOPUB_RES:I

.field private final PREFS_NAME:Ljava/lang/String;

.field private isLoading:Z

.field private mCurrentAd:Lcom/cmcm/a/a/a;

.field private mMopubAdPool:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/cmcm/a/a/a;",
            ">;"
        }
    .end annotation
.end field

.field private mMopubUniId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 42
    const-string v0, "mp"

    invoke-direct {p0, p1, p2, v0}, Lcom/cmcm/adsdk/nativead/w;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    const/16 v0, 0xbbb

    iput v0, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->MOPUB_RES:I

    .line 37
    iput-boolean v2, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->isLoading:Z

    .line 38
    const-string v0, "cmcmadsdk_config"

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->PREFS_NAME:Ljava/lang/String;

    .line 43
    iput-object p3, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mMopubUniId:Ljava/lang/String;

    .line 44
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mContext:Landroid/content/Context;

    const-string v1, "cmcmadsdk_config"

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    sput-object v0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->sSharedPreferences:Landroid/content/SharedPreferences;

    .line 46
    return-void
.end method

.method static synthetic access$000(Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;)Lcom/cmcm/a/a/a;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mCurrentAd:Lcom/cmcm/a/a/a;

    return-object v0
.end method

.method static synthetic access$100(Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;)Z
    .locals 1

    .prologue
    .line 30
    iget-boolean v0, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->isLoading:Z

    return v0
.end method

.method static synthetic access$102(Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;Z)Z
    .locals 0

    .prologue
    .line 30
    iput-boolean p1, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->isLoading:Z

    return p1
.end method

.method static synthetic access$200(Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;)Ljava/util/List;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mMopubAdPool:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$300(Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->notifyAdSelected()V

    return-void
.end method

.method static synthetic access$400(Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0, p1}, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->notifyFailed(Ljava/lang/String;)V

    return-void
.end method

.method private hasValidAd()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 176
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mMopubAdPool:Ljava/util/List;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mMopubAdPool:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 180
    :cond_0
    :goto_0
    return v0

    .line 179
    :cond_1
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mMopubAdPool:Ljava/util/List;

    invoke-virtual {p0, v1}, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->removeExpiredAds(Ljava/util/List;)V

    .line 180
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mMopubAdPool:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method private loadMopubAd()V
    .locals 5

    .prologue
    .line 61
    invoke-static {}, Lcom/cmcm/adsdk/a;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 62
    const-string v0, "MopubNativeAdLoader"

    const-string v1, "sdk has stop work"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    :goto_0
    return-void

    .line 65
    :cond_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mMopubUniId:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 66
    const-string v0, "MopubNativeAdLoader"

    const-string v1, "MopubUniId is empty"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    const-string v0, "10003"

    invoke-direct {p0, v0}, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->notifyFailed(Ljava/lang/String;)V

    goto :goto_0

    .line 70
    :cond_1
    iget-boolean v0, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->isLoading:Z

    if-eqz v0, :cond_2

    .line 71
    const-string v0, "MopubNativeAdLoader"

    const-string v1, "isLoading ,avoid repeat load"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 74
    :cond_2
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mMopubAdPool:Ljava/util/List;

    if-nez v0, :cond_3

    .line 75
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mMopubAdPool:Ljava/util/List;

    .line 77
    :cond_3
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mContext:Landroid/content/Context;

    if-nez v0, :cond_4

    .line 78
    const-string v0, "MopubNativeAdLoader"

    const-string v1, "Context is null"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    const-string v0, "10003"

    invoke-direct {p0, v0}, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->notifyFailed(Ljava/lang/String;)V

    goto :goto_0

    .line 82
    :cond_4
    new-instance v0, Lcom/mopub/nativeads/MoPubNative;

    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mMopubUniId:Ljava/lang/String;

    new-instance v3, Lcom/cmcm/adsdk/nativead/i;

    invoke-direct {v3, p0}, Lcom/cmcm/adsdk/nativead/i;-><init>(Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/nativeads/MoPubNative;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/mopub/nativeads/MoPubNative$MoPubNativeListener;)V

    .line 83
    invoke-static {}, Lcom/cleanmaster/gaid/AdvertisingIdHelper;->getInstance()Lcom/cleanmaster/gaid/AdvertisingIdHelper;

    move-result-object v1

    invoke-virtual {v1}, Lcom/cleanmaster/gaid/AdvertisingIdHelper;->getGAId()Ljava/lang/String;

    move-result-object v1

    .line 84
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 85
    invoke-static {}, Lcom/cleanmaster/gaid/AdvertisingIdHelper;->getInstance()Lcom/cleanmaster/gaid/AdvertisingIdHelper;

    move-result-object v2

    invoke-virtual {v2}, Lcom/cleanmaster/gaid/AdvertisingIdHelper;->getTrackFlag()Z

    move-result v2

    .line 86
    iget-object v3, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mContext:Landroid/content/Context;

    invoke-static {v3}, Lcom/mopub/common/ClientMetadata;->getInstance(Landroid/content/Context;)Lcom/mopub/common/ClientMetadata;

    move-result-object v3

    .line 87
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_5

    .line 88
    invoke-virtual {v3, v1, v2}, Lcom/mopub/common/ClientMetadata;->setAdvertisingInfo(Ljava/lang/String;Z)V

    .line 90
    :cond_5
    const-string v1, "MopubNativeAdLoader"

    const-string v2, "request,set is loading"

    invoke-static {v1, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->isLoading:Z

    .line 103
    invoke-virtual {v0}, Lcom/mopub/nativeads/MoPubNative;->makeRequest()V

    goto :goto_0
.end method

.method private notifyAdSelected()V
    .locals 2

    .prologue
    .line 160
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mNativeAdListener:Lcom/cmcm/adsdk/nativead/h;

    if-eqz v0, :cond_0

    .line 161
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->hasValidAd()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 162
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mMopubAdPool:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/a/a/a;

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mCurrentAd:Lcom/cmcm/a/a/a;

    .line 163
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mNativeAdListener:Lcom/cmcm/adsdk/nativead/h;

    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mCurrentAd:Lcom/cmcm/a/a/a;

    invoke-interface {v0, v1}, Lcom/cmcm/adsdk/nativead/h;->a(Lcom/cmcm/a/a/a;)V

    .line 166
    :cond_0
    return-void
.end method

.method private notifyFailed(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 169
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mNativeAdListener:Lcom/cmcm/adsdk/nativead/h;

    if-eqz v0, :cond_0

    .line 170
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mNativeAdListener:Lcom/cmcm/adsdk/nativead/h;

    invoke-virtual {p0}, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->getAdName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/cmcm/adsdk/nativead/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    :cond_0
    return-void
.end method

.method private preloadMopubAd()V
    .locals 0

    .prologue
    .line 107
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->loadMopubAd()V

    .line 108
    return-void
.end method


# virtual methods
.method public getAd()Lcom/cmcm/a/a/a;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 186
    const-string v1, "MopubNativeAdLoader"

    const-string v2, "getAd"

    invoke-static {v1, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    invoke-static {}, Lcom/cmcm/adsdk/a;->d()Z

    move-result v1

    if-nez v1, :cond_1

    .line 188
    const-string v1, "MopubNativeAdLoader"

    const-string v2, "sdk has stop work"

    invoke-static {v1, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    :cond_0
    :goto_0
    return-object v0

    .line 192
    :cond_1
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->hasValidAd()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 193
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mMopubAdPool:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/a/a/a;

    .line 194
    const-string v1, "MopubNativeAdLoader"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "adpool romove ad title:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v0}, Lcom/cmcm/a/a/a;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",adpool size :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mMopubAdPool:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mCurrentAd:Lcom/cmcm/a/a/a;

    .line 197
    :cond_2
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mMopubAdPool:Ljava/util/List;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mMopubAdPool:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 198
    const-string v1, "MopubNativeAdLoader"

    const-string v2, "ad pool is Empty to preload Ad"

    invoke-static {v1, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->preloadMopubAd()V

    goto :goto_0
.end method

.method protected getAdList(I)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List",
            "<",
            "Lcom/cmcm/a/a/a;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    const/4 v2, 0x0

    .line 214
    const-string v1, "MopubNativeAdLoader"

    const-string v3, "getAdList"

    invoke-static {v1, v3}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    invoke-static {}, Lcom/cmcm/adsdk/a;->d()Z

    move-result v1

    if-nez v1, :cond_1

    .line 216
    const-string v1, "MopubNativeAdLoader"

    const-string v2, "sdk has stop work"

    invoke-static {v1, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 231
    :cond_0
    :goto_0
    return-object v0

    .line 219
    :cond_1
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->hasValidAd()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 222
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move v1, v2

    .line 223
    :goto_1
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mMopubAdPool:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 224
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mMopubAdPool:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/a/a/a;

    .line 225
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 223
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 227
    :cond_2
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mMopubAdPool:Ljava/util/List;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mMopubAdPool:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 228
    const-string v0, "MopubNativeAdLoader"

    const-string v1, "ad pool is Empty to preload Ad"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->preloadMopubAd()V

    :cond_3
    move-object v0, v3

    .line 231
    goto :goto_0
.end method

.method public loadAd()V
    .locals 2

    .prologue
    .line 50
    const-string v0, "MopubNativeAdLoader"

    const-string v1, "loadAd mopub"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->hasValidAd()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 52
    const-string v0, "MopubNativeAdLoader"

    const-string v1, "ad pool has mopub ad "

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->notifyAdSelected()V

    .line 57
    :goto_0
    return-void

    .line 55
    :cond_0
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->loadMopubAd()V

    goto :goto_0
.end method

.method protected removeAdFromPool(Lcom/cmcm/a/a/a;)V
    .locals 3

    .prologue
    .line 206
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mMopubAdPool:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 207
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mMopubAdPool:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 208
    const-string v0, "MopubNativeAdLoader"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "adpool remove ad title: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/cmcm/a/a/a;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",adpool size:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/MopubNativeAdLoader;->mMopubAdPool:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    :cond_0
    return-void
.end method
