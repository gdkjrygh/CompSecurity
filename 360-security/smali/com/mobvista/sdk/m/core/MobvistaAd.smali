.class public Lcom/mobvista/sdk/m/core/MobvistaAd;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static mCachedMobvistaAdNative:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 102
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/mobvista/sdk/m/core/MobvistaAd;->mCachedMobvistaAdNative:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 23
    invoke-static {p0}, Lcom/mobvista/sdk/m/core/MobvistaAd;->b(Landroid/content/Context;)V

    return-void
.end method

.method private static b(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 56
    :try_start_0
    const-string/jumbo v0, "com.google.android.gms.ads.identifier.AdvertisingIdClient"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 57
    const-string/jumbo v0, "com.google.android.gms.ads.identifier.AdvertisingIdClient.Info"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 58
    invoke-static {p0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->getAdvertisingIdInfo(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    move-result-object v0

    .line 60
    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/f/b;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    :goto_0
    return-void

    .line 61
    :catch_0
    move-exception v0

    .line 62
    const-string/jumbo v0, "MobvistaAd"

    const-string/jumbo v1, "GET ADID ERROR TRY TO GET FROM GOOGLE PLAY APP"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 65
    :try_start_1
    new-instance v0, Lcom/mobvista/sdk/m/core/l;

    invoke-direct {v0}, Lcom/mobvista/sdk/m/core/l;-><init>()V

    invoke-virtual {v0, p0}, Lcom/mobvista/sdk/m/core/l;->a(Landroid/content/Context;)Lcom/mobvista/sdk/m/core/m;

    move-result-object v0

    .line 67
    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/m;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/f/b;->a(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 69
    :catch_1
    move-exception v0

    const-string/jumbo v0, "MobvistaAd"

    const-string/jumbo v1, "GET ADID FROM GOOGLE PLAY APP ERROR"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 29
    invoke-static {p1}, Lcom/mobvista/sdk/m/a/f/i;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Lcom/mobvista/sdk/m/a/f/i;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 30
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "appId and appKey can not be NUll."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 32
    :cond_1
    sput-object p1, Lcom/mobvista/sdk/m/core/p;->a:Ljava/lang/String;

    .line 33
    sput-object p2, Lcom/mobvista/sdk/m/core/p;->b:Ljava/lang/String;

    .line 36
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/f/g;->a(Landroid/content/Context;)V

    .line 37
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/f/b;->o(Landroid/content/Context;)Ljava/lang/String;

    .line 38
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/f/b;->p(Landroid/content/Context;)V

    .line 39
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/d/a/k;->a(Landroid/content/Context;)Lcom/mobvista/sdk/m/a/d/a/k;

    .line 41
    new-instance v0, Lcom/mobvista/sdk/m/core/r;

    invoke-direct {v0, p0}, Lcom/mobvista/sdk/m/core/r;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/r;->start()V

    .line 52
    return-void
.end method

.method public static newAdWallController(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Lcom/mobvista/sdk/m/core/MobvistaAdWall;
    .locals 2

    .prologue
    .line 84
    sget-object v0, Lcom/mobvista/sdk/m/core/p;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/f/i;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/mobvista/sdk/m/core/p;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/f/i;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 85
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "you should init first"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 87
    :cond_1
    new-instance v0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    invoke-direct {v0, p0, p1, p2}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static newNativeController(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Lcom/mobvista/sdk/m/core/MobvistaAdNative;
    .locals 2

    .prologue
    .line 76
    sget-object v0, Lcom/mobvista/sdk/m/core/p;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/f/i;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/mobvista/sdk/m/core/p;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/f/i;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 77
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "you should init first"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 79
    :cond_1
    new-instance v0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    invoke-direct {v0, p0, p1, p2}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static popPreloadedNativeAd(Ljava/lang/String;)Lcom/mobvista/sdk/m/core/MobvistaAdNative;
    .locals 2

    .prologue
    .line 105
    sget-object v1, Lcom/mobvista/sdk/m/core/MobvistaAd;->mCachedMobvistaAdNative:Ljava/util/HashMap;

    monitor-enter v1

    .line 106
    :try_start_0
    sget-object v0, Lcom/mobvista/sdk/m/core/MobvistaAd;->mCachedMobvistaAdNative:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    .line 107
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static preloadNativeAd(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 111
    invoke-static {p1}, Lcom/mobvista/sdk/m/a/f/i;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Lcom/mobvista/sdk/m/a/f/i;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 112
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v1, "unitId or FBPlacementId can\'t be empty!!!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 115
    :cond_1
    const-string/jumbo v0, "MobvistaAd"

    const-string/jumbo v1, "native preload start!"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 117
    sget-object v1, Lcom/mobvista/sdk/m/core/MobvistaAd;->mCachedMobvistaAdNative:Ljava/util/HashMap;

    monitor-enter v1

    .line 118
    :try_start_0
    sget-object v0, Lcom/mobvista/sdk/m/core/MobvistaAd;->mCachedMobvistaAdNative:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    invoke-static {p0, p1, p2}, Lcom/mobvista/sdk/m/core/MobvistaAd;->newNativeController(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    move-result-object v0

    .line 123
    new-instance v1, Lcom/mobvista/sdk/m/core/s;

    invoke-direct {v1, p1, v0}, Lcom/mobvista/sdk/m/core/s;-><init>(Ljava/lang/String;Lcom/mobvista/sdk/m/core/MobvistaAdNative;)V

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->loadAd(Lcom/mobvista/sdk/m/core/AdListener;)V

    .line 142
    return-void

    .line 119
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static release()V
    .locals 1

    .prologue
    .line 95
    invoke-static {}, Lcom/mobvista/sdk/m/a/e/a;->a()Lcom/mobvista/sdk/m/a/e/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/a/e/a;->c()V

    .line 96
    invoke-static {}, Lcom/mobvista/sdk/m/a/d/a/k;->a()V

    .line 98
    sget-object v0, Lcom/mobvista/sdk/m/core/MobvistaAd;->mCachedMobvistaAdNative:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 99
    const/4 v0, 0x0

    sput-object v0, Lcom/mobvista/sdk/m/core/MobvistaAd;->mCachedMobvistaAdNative:Ljava/util/HashMap;

    .line 100
    return-void
.end method


# virtual methods
.method public allowDirectDownload(Z)V
    .locals 0

    .prologue
    .line 91
    sput-boolean p1, Lcom/mobvista/sdk/m/core/ac;->a:Z

    .line 92
    return-void
.end method
