.class public Lcom/google/ads/AdLoader;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:J


# instance fields
.field private final b:Lcom/google/android/gms/ads/AdListener;

.field private final c:Lcom/google/ads/formats/NativeAppInstallAd$OnAppInstallAdLoadedListener;

.field private final d:Lcom/google/ads/formats/NativeContentAd$OnContentAdLoadedListener;

.field private final e:Landroid/content/Context;

.field private final f:Ljava/lang/String;

.field private final g:Lcom/google/ads/h;

.field private final h:Lcom/google/ads/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 103
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x5

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/google/ads/AdLoader;->a:J

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/google/ads/h;Lcom/google/ads/b;Ljava/lang/String;Lcom/google/android/gms/ads/AdListener;Lcom/google/ads/formats/NativeAppInstallAd$OnAppInstallAdLoadedListener;Lcom/google/ads/formats/NativeContentAd$OnContentAdLoadedListener;)V
    .locals 0

    .prologue
    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 133
    iput-object p1, p0, Lcom/google/ads/AdLoader;->e:Landroid/content/Context;

    .line 134
    iput-object p2, p0, Lcom/google/ads/AdLoader;->g:Lcom/google/ads/h;

    .line 135
    iput-object p3, p0, Lcom/google/ads/AdLoader;->h:Lcom/google/ads/b;

    .line 136
    iput-object p4, p0, Lcom/google/ads/AdLoader;->f:Ljava/lang/String;

    .line 137
    iput-object p5, p0, Lcom/google/ads/AdLoader;->b:Lcom/google/android/gms/ads/AdListener;

    .line 138
    iput-object p6, p0, Lcom/google/ads/AdLoader;->c:Lcom/google/ads/formats/NativeAppInstallAd$OnAppInstallAdLoadedListener;

    .line 139
    iput-object p7, p0, Lcom/google/ads/AdLoader;->d:Lcom/google/ads/formats/NativeContentAd$OnContentAdLoadedListener;

    .line 142
    invoke-direct {p0}, Lcom/google/ads/AdLoader;->a()V

    .line 143
    return-void
.end method

.method static synthetic a(Lcom/google/ads/AdLoader;)Lcom/google/ads/formats/NativeContentAd$OnContentAdLoadedListener;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/google/ads/AdLoader;->d:Lcom/google/ads/formats/NativeContentAd$OnContentAdLoadedListener;

    return-object v0
.end method

.method private a()V
    .locals 2

    .prologue
    .line 155
    :try_start_0
    new-instance v0, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v0

    const-class v1, Lcom/google/ads/mediation/admob/AdMobAdapter;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdRequest;->getNetworkExtrasBundle(Ljava/lang/Class;)Landroid/os/Bundle;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 162
    return-void

    .line 160
    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The Google native ads addon requires Google Play Services 4.4.52 or later."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private a(Landroid/os/Bundle;Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;)V
    .locals 4

    .prologue
    const/4 v2, 0x1

    .line 191
    invoke-virtual {p0, p1}, Lcom/google/ads/AdLoader;->a(Landroid/os/Bundle;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 192
    iget-object v0, p0, Lcom/google/ads/AdLoader;->b:Lcom/google/android/gms/ads/AdListener;

    if-eqz v0, :cond_0

    .line 193
    iget-object v0, p0, Lcom/google/ads/AdLoader;->b:Lcom/google/android/gms/ads/AdListener;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/ads/AdListener;->onAdFailedToLoad(I)V

    .line 208
    :cond_0
    :goto_0
    return-void

    .line 198
    :cond_1
    new-instance v0, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;

    iget-object v1, p0, Lcom/google/ads/AdLoader;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;-><init>(Landroid/content/Context;)V

    .line 199
    new-array v1, v2, [Lcom/google/android/gms/ads/AdSize;

    const/4 v2, 0x0

    sget-object v3, Lcom/google/android/gms/ads/AdSize;->BANNER:Lcom/google/android/gms/ads/AdSize;

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->setAdSizes([Lcom/google/android/gms/ads/AdSize;)V

    .line 200
    iget-object v1, p0, Lcom/google/ads/AdLoader;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->setAdUnitId(Ljava/lang/String;)V

    .line 202
    new-instance v1, Lcom/google/ads/AdLoader$RequestListener;

    invoke-direct {v1, p0, v0}, Lcom/google/ads/AdLoader$RequestListener;-><init>(Lcom/google/ads/AdLoader;Lcom/google/android/gms/ads/doubleclick/PublisherAdView;)V

    .line 203
    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->setAppEventListener(Lcom/google/android/gms/ads/doubleclick/AppEventListener;)V

    .line 204
    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V

    .line 206
    const-class v1, Lcom/google/ads/mediation/admob/AdMobAdapter;

    invoke-virtual {p2, v1, p1}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;->addNetworkExtrasBundle(Ljava/lang/Class;Landroid/os/Bundle;)Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;

    .line 207
    invoke-virtual {p2}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;->build()Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->loadAd(Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/google/ads/AdLoader;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/google/ads/AdLoader;->e:Landroid/content/Context;

    return-object v0
.end method

.method private b(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 1

    .prologue
    .line 146
    if-nez p1, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    goto :goto_0
.end method

.method static synthetic c(Lcom/google/ads/AdLoader;)Lcom/google/ads/h;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/google/ads/AdLoader;->g:Lcom/google/ads/h;

    return-object v0
.end method

.method static synthetic d(Lcom/google/ads/AdLoader;)Lcom/google/android/gms/ads/AdListener;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/google/ads/AdLoader;->b:Lcom/google/android/gms/ads/AdListener;

    return-object v0
.end method

.method static synthetic e(Lcom/google/ads/AdLoader;)Lcom/google/ads/formats/NativeAppInstallAd$OnAppInstallAdLoadedListener;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/google/ads/AdLoader;->c:Lcom/google/ads/formats/NativeAppInstallAd$OnAppInstallAdLoadedListener;

    return-object v0
.end method


# virtual methods
.method protected a(Landroid/os/AsyncTask;Lorg/json/JSONObject;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/os/AsyncTask",
            "<",
            "Lorg/json/JSONObject;",
            "Ljava/lang/Void;",
            "TT;>;",
            "Lorg/json/JSONObject;",
            ")V"
        }
    .end annotation

    .prologue
    .line 384
    const/4 v0, 0x1

    new-array v0, v0, [Lorg/json/JSONObject;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    invoke-virtual {p1, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 385
    return-void
.end method

.method protected a(Landroid/os/Bundle;)Z
    .locals 3

    .prologue
    .line 218
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 219
    iget-object v1, p0, Lcom/google/ads/AdLoader;->d:Lcom/google/ads/formats/NativeContentAd$OnContentAdLoadedListener;

    if-eqz v1, :cond_0

    .line 220
    const-string v1, "1"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 222
    :cond_0
    iget-object v1, p0, Lcom/google/ads/AdLoader;->c:Lcom/google/ads/formats/NativeAppInstallAd$OnAppInstallAdLoadedListener;

    if-eqz v1, :cond_1

    .line 223
    const-string v1, "2"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 227
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_2

    .line 228
    const-string v0, "Ads"

    const-string v1, "No ad format requested."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 229
    const/4 v0, 0x0

    .line 238
    :goto_0
    return v0

    .line 233
    :cond_2
    const-string v1, "native_templates"

    const-string v2, ","

    .line 235
    invoke-static {v2, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    .line 233
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    const-string v0, "native_version"

    const-string v1, "1"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    const-string v0, "native_addon"

    const-string v1, "1.0.2"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public loadAd(Lcom/google/android/gms/ads/AdRequest;)V
    .locals 2

    .prologue
    .line 170
    const-class v0, Lcom/google/ads/mediation/admob/AdMobAdapter;

    .line 171
    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/AdRequest;->getNetworkExtrasBundle(Ljava/lang/Class;)Landroid/os/Bundle;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/ads/AdLoader;->b(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    iget-object v1, p0, Lcom/google/ads/AdLoader;->h:Lcom/google/ads/b;

    .line 172
    invoke-virtual {v1, p1}, Lcom/google/ads/b;->a(Lcom/google/android/gms/ads/AdRequest;)Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;

    move-result-object v1

    .line 170
    invoke-direct {p0, v0, v1}, Lcom/google/ads/AdLoader;->a(Landroid/os/Bundle;Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;)V

    .line 173
    return-void
.end method

.method public loadAd(Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;)V
    .locals 2

    .prologue
    .line 180
    const-class v0, Lcom/google/ads/mediation/admob/AdMobAdapter;

    .line 181
    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;->getNetworkExtrasBundle(Ljava/lang/Class;)Landroid/os/Bundle;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/ads/AdLoader;->b(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    iget-object v1, p0, Lcom/google/ads/AdLoader;->h:Lcom/google/ads/b;

    .line 182
    invoke-virtual {v1, p1}, Lcom/google/ads/b;->a(Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;)Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;

    move-result-object v1

    .line 180
    invoke-direct {p0, v0, v1}, Lcom/google/ads/AdLoader;->a(Landroid/os/Bundle;Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;)V

    .line 183
    return-void
.end method
