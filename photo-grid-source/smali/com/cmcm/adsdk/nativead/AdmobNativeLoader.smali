.class public Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;
.super Lcom/cmcm/adsdk/nativead/w;
.source "SourceFile"


# static fields
.field public static final ADMOB_PKGNAME:Ljava/lang/String; = "com.admob.native"

.field private static final ADMOB_RES:I = 0xbba

.field private static final TAG:Ljava/lang/String; = "AdmobNativeLoader"


# instance fields
.field private isLoading:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private mAdmobUniId:Ljava/lang/String;

.field private mAdmobdPool:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/cmcm/a/a/a;",
            ">;"
        }
    .end annotation
.end field

.field private mCurrentAd:Lcom/cmcm/a/a/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 29
    const-string v0, "ab"

    invoke-direct {p0, p1, p2, v0}, Lcom/cmcm/adsdk/nativead/w;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->isLoading:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 30
    iput-object p3, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mAdmobUniId:Ljava/lang/String;

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mAdmobdPool:Ljava/util/List;

    .line 32
    return-void
.end method

.method static synthetic access$000(Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->isLoading:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method static synthetic access$100(Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0, p1}, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->notifyFailed(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$200(Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;)Lcom/cmcm/a/a/a;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mCurrentAd:Lcom/cmcm/a/a/a;

    return-object v0
.end method

.method static synthetic access$300(Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;)Ljava/util/List;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mAdmobdPool:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$400(Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->notifyAdSelected()V

    return-void
.end method

.method private hasAdmobSDK()Z
    .locals 1

    .prologue
    .line 54
    :try_start_0
    const-string v0, "com.google.android.gms.ads.AdLoader"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 55
    const-string v0, "com.google.android.gms.ads.AdListener"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 56
    const-string v0, "com.google.android.gms.ads.AdRequest"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    const/4 v0, 0x1

    :goto_0
    return v0

    .line 58
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method private hasValidAd()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 152
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mAdmobdPool:Ljava/util/List;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mAdmobdPool:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 156
    :cond_0
    :goto_0
    return v0

    .line 155
    :cond_1
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mAdmobdPool:Ljava/util/List;

    invoke-virtual {p0, v1}, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->removeExpiredAds(Ljava/util/List;)V

    .line 156
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mAdmobdPool:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method private loadAdmobAd()V
    .locals 3

    .prologue
    .line 65
    invoke-static {}, Lcom/cmcm/adsdk/a;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 66
    const-string v0, "AdmobNativeLoader"

    const-string v1, "sdk has stop work"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    :goto_0
    return-void

    .line 69
    :cond_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mAdmobUniId:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 70
    const-string v0, "AdmobNativeLoader"

    const-string v1, "admob is empty"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    const-string v0, "10003"

    invoke-direct {p0, v0}, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->notifyFailed(Ljava/lang/String;)V

    goto :goto_0

    .line 74
    :cond_1
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mContext:Landroid/content/Context;

    if-nez v0, :cond_2

    .line 75
    const-string v0, "AdmobNativeLoader"

    const-string v1, "Context is null"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    const-string v0, "10003"

    invoke-direct {p0, v0}, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->notifyFailed(Ljava/lang/String;)V

    goto :goto_0

    .line 79
    :cond_2
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->isLoading:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 80
    const-string v0, "AdmobNativeLoader"

    const-string v1, "isLoading ,avoid repeat load"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 83
    :cond_3
    new-instance v0, Lcom/google/android/gms/ads/AdLoader$Builder;

    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mAdmobUniId:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/ads/AdLoader$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v1, Lcom/cmcm/adsdk/nativead/c;

    invoke-direct {v1, p0}, Lcom/cmcm/adsdk/nativead/c;-><init>(Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdLoader$Builder;->forAppInstallAd(Lcom/google/android/gms/ads/formats/NativeAppInstallAd$OnAppInstallAdLoadedListener;)Lcom/google/android/gms/ads/AdLoader$Builder;

    move-result-object v0

    new-instance v1, Lcom/cmcm/adsdk/nativead/b;

    invoke-direct {v1, p0}, Lcom/cmcm/adsdk/nativead/b;-><init>(Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdLoader$Builder;->forContentAd(Lcom/google/android/gms/ads/formats/NativeContentAd$OnContentAdLoadedListener;)Lcom/google/android/gms/ads/AdLoader$Builder;

    move-result-object v0

    new-instance v1, Lcom/cmcm/adsdk/nativead/a;

    invoke-direct {v1, p0}, Lcom/cmcm/adsdk/nativead/a;-><init>(Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdLoader$Builder;->withAdListener(Lcom/google/android/gms/ads/AdListener;)Lcom/google/android/gms/ads/AdLoader$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdLoader$Builder;->build()Lcom/google/android/gms/ads/AdLoader;

    move-result-object v0

    .line 125
    new-instance v1, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v1}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    invoke-virtual {v1}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdLoader;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    .line 126
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->isLoading:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_0
.end method

.method private notifyAdSelected()V
    .locals 2

    .prologue
    .line 136
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mNativeAdListener:Lcom/cmcm/adsdk/nativead/h;

    if-eqz v0, :cond_0

    .line 137
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->hasValidAd()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 138
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mAdmobdPool:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/a/a/a;

    .line 139
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mNativeAdListener:Lcom/cmcm/adsdk/nativead/h;

    invoke-interface {v1, v0}, Lcom/cmcm/adsdk/nativead/h;->a(Lcom/cmcm/a/a/a;)V

    .line 142
    :cond_0
    return-void
.end method

.method private notifyFailed(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 146
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mNativeAdListener:Lcom/cmcm/adsdk/nativead/h;

    if-eqz v0, :cond_0

    .line 147
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mNativeAdListener:Lcom/cmcm/adsdk/nativead/h;

    invoke-virtual {p0}, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->getAdName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/cmcm/adsdk/nativead/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    :cond_0
    return-void
.end method

.method private preloadAdmob()V
    .locals 1

    .prologue
    .line 130
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->hasAdmobSDK()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 131
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->loadAdmobAd()V

    .line 133
    :cond_0
    return-void
.end method


# virtual methods
.method public getAd()Lcom/cmcm/a/a/a;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 162
    const-string v1, "AdmobNativeLoader"

    const-string v2, "getAd"

    invoke-static {v1, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    invoke-static {}, Lcom/cmcm/adsdk/a;->d()Z

    move-result v1

    if-nez v1, :cond_0

    .line 164
    const-string v1, "AdmobNativeLoader"

    const-string v2, "sdk has stop work"

    invoke-static {v1, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    :goto_0
    return-object v0

    .line 168
    :cond_0
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->hasValidAd()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 169
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mAdmobdPool:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/a/a/a;

    .line 170
    const-string v1, "AdmobNativeLoader"

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

    iget-object v3, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mAdmobdPool:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    :cond_1
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mAdmobdPool:Ljava/util/List;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mAdmobdPool:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 173
    const-string v1, "AdmobNativeLoader"

    const-string v2, "ad pool is Empty to preload Ad"

    invoke-static {v1, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->preloadAdmob()V

    .line 176
    :cond_2
    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mCurrentAd:Lcom/cmcm/a/a/a;

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

    .line 190
    const-string v1, "AdmobNativeLoader"

    const-string v3, "getAdList"

    invoke-static {v1, v3}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    invoke-static {}, Lcom/cmcm/adsdk/a;->d()Z

    move-result v1

    if-nez v1, :cond_1

    .line 192
    const-string v1, "AdmobNativeLoader"

    const-string v2, "sdk has stop work"

    invoke-static {v1, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    :cond_0
    :goto_0
    return-object v0

    .line 195
    :cond_1
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->hasValidAd()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 198
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move v1, v2

    .line 199
    :goto_1
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mAdmobdPool:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 200
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mAdmobdPool:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/a/a/a;

    .line 201
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 199
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 203
    :cond_2
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mAdmobdPool:Ljava/util/List;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mAdmobdPool:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 204
    const-string v0, "AdmobNativeLoader"

    const-string v1, "ad pool is Empty to preload Ad"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->preloadAdmob()V

    :cond_3
    move-object v0, v3

    .line 207
    goto :goto_0
.end method

.method public loadAd()V
    .locals 2

    .prologue
    .line 36
    const-string v0, "AdmobNativeLoader"

    const-string v1, "loadAd admob"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->hasValidAd()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 38
    const-string v0, "AdmobNativeLoader"

    const-string v1, "ad pool has admob ad "

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->notifyAdSelected()V

    .line 48
    :goto_0
    return-void

    .line 41
    :cond_0
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->hasAdmobSDK()Z

    move-result v0

    if-nez v0, :cond_1

    .line 42
    const-string v0, "AdmobNativeLoader"

    const-string v1, "admob sdk non-exist "

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    const-string v0, "10003"

    invoke-direct {p0, v0}, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->notifyFailed(Ljava/lang/String;)V

    goto :goto_0

    .line 45
    :cond_1
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->loadAdmobAd()V

    goto :goto_0
.end method

.method protected removeAdFromPool(Lcom/cmcm/a/a/a;)V
    .locals 3

    .prologue
    .line 182
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mAdmobdPool:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 183
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mAdmobdPool:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 184
    const-string v0, "AdmobNativeLoader"

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

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/AdmobNativeLoader;->mAdmobdPool:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    :cond_0
    return-void
.end method
