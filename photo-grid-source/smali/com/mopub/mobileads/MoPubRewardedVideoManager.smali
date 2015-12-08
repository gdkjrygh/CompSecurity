.class public Lcom/mopub/mobileads/MoPubRewardedVideoManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;


# instance fields
.field private final b:Landroid/os/Handler;

.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Landroid/content/Context;

.field private final e:Lcom/mopub/mobileads/AdRequestStatusMapping;

.field private final f:Lcom/mopub/mobileads/al;

.field private g:Lcom/mopub/mobileads/MoPubRewardedVideoListener;

.field private final h:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/mopub/common/MediationSettings;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/Set",
            "<",
            "Lcom/mopub/common/MediationSettings;",
            ">;>;"
        }
    .end annotation
.end field

.field private final j:Landroid/os/Handler;

.field private final k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private varargs constructor <init>(Landroid/app/Activity;[Lcom/mopub/common/MediationSettings;)V
    .locals 2

    .prologue
    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->c:Ljava/lang/ref/WeakReference;

    .line 77
    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->d:Landroid/content/Context;

    .line 78
    new-instance v0, Lcom/mopub/mobileads/al;

    invoke-direct {v0}, Lcom/mopub/mobileads/al;-><init>()V

    iput-object v0, p0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->f:Lcom/mopub/mobileads/al;

    .line 79
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->b:Landroid/os/Handler;

    .line 80
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->h:Ljava/util/Set;

    .line 81
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->h:Ljava/util/Set;

    invoke-static {v0, p2}, Lcom/mopub/common/util/MoPubCollections;->addAllNonNull(Ljava/util/Collection;[Ljava/lang/Object;)V

    .line 82
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->i:Ljava/util/Map;

    .line 83
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->j:Landroid/os/Handler;

    .line 84
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->k:Ljava/util/Map;

    .line 86
    new-instance v0, Lcom/mopub/mobileads/AdRequestStatusMapping;

    invoke-direct {v0}, Lcom/mopub/mobileads/AdRequestStatusMapping;-><init>()V

    iput-object v0, p0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->e:Lcom/mopub/mobileads/AdRequestStatusMapping;

    .line 87
    return-void
.end method

.method static synthetic a(Lcom/mopub/mobileads/MoPubRewardedVideoManager;)Lcom/mopub/mobileads/MoPubRewardedVideoListener;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->g:Lcom/mopub/mobileads/MoPubRewardedVideoListener;

    return-object v0
.end method

.method static synthetic a()Lcom/mopub/mobileads/MoPubRewardedVideoManager;
    .locals 1

    .prologue
    .line 38
    sget-object v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    return-object v0
.end method

.method static synthetic a(Lcom/mopub/mobileads/MoPubRewardedVideoManager;Lcom/mopub/network/AdResponse;Ljava/lang/String;)V
    .locals 8

    .prologue
    .line 38
    .line 9269
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->e:Lcom/mopub/mobileads/AdRequestStatusMapping;

    invoke-virtual {p1}, Lcom/mopub/network/AdResponse;->getFailoverUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/mopub/network/AdResponse;->getImpressionTrackingUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/mopub/network/AdResponse;->getClickTrackingUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, p2, v1, v2, v3}, Lcom/mopub/mobileads/AdRequestStatusMapping;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 9274
    invoke-virtual {p1}, Lcom/mopub/network/AdResponse;->getAdTimeoutMillis()Ljava/lang/Integer;

    move-result-object v0

    .line 9275
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-gtz v1, :cond_2

    .line 9276
    :cond_0
    const/16 v0, 0x7530

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v1, v0

    .line 9279
    :goto_0
    invoke-virtual {p1}, Lcom/mopub/network/AdResponse;->getCustomEventClassName()Ljava/lang/String;

    move-result-object v2

    .line 9280
    if-nez v2, :cond_1

    .line 9281
    const-string v0, "Couldn\'t create custom event, class name was null."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->e(Ljava/lang/String;)V

    .line 9282
    sget-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->ADAPTER_CONFIGURATION_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

    invoke-direct {p0, p2, v0}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a(Ljava/lang/String;Lcom/mopub/mobileads/MoPubErrorCode;)V

    .line 9320
    :goto_1
    return-void

    .line 9288
    :cond_1
    :try_start_0
    const-class v0, Lcom/mopub/mobileads/CustomEventRewardedVideo;

    invoke-static {v2, v0}, Lcom/mopub/common/util/Reflection;->instantiateClassWithEmptyConstructor(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/mobileads/CustomEventRewardedVideo;

    .line 9294
    new-instance v3, Ljava/util/TreeMap;

    invoke-direct {v3}, Ljava/util/TreeMap;-><init>()V

    .line 9295
    const-string v4, "com_mopub_ad_unit_id"

    invoke-interface {v3, v4, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9298
    new-instance v3, Lcom/mopub/mobileads/y;

    invoke-direct {v3, p0, v0}, Lcom/mopub/mobileads/y;-><init>(Lcom/mopub/mobileads/MoPubRewardedVideoManager;Lcom/mopub/mobileads/CustomEventRewardedVideo;)V

    .line 9306
    iget-object v4, p0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->j:Landroid/os/Handler;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-long v6, v1

    invoke-virtual {v4, v3, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 9307
    iget-object v1, p0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->k:Ljava/util/Map;

    invoke-interface {v1, p2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9310
    iget-object v1, p0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {p1}, Lcom/mopub/network/AdResponse;->getServerExtras()Ljava/util/Map;

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/CustomEventRewardedVideo;->a(Landroid/app/Activity;)V

    .line 9312
    invoke-virtual {v0}, Lcom/mopub/mobileads/CustomEventRewardedVideo;->a()Lcom/mopub/mobileads/CustomEventRewardedVideo$CustomEventRewardedVideoListener;

    move-result-object v1

    .line 9314
    invoke-virtual {v0}, Lcom/mopub/mobileads/CustomEventRewardedVideo;->c()Ljava/lang/String;

    move-result-object v3

    .line 9315
    iget-object v4, p0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->f:Lcom/mopub/mobileads/al;

    invoke-virtual {v4, p2, v0, v1, v3}, Lcom/mopub/mobileads/al;->a(Ljava/lang/String;Lcom/mopub/mobileads/CustomEventRewardedVideo;Lcom/mopub/mobileads/CustomEventRewardedVideo$CustomEventRewardedVideoListener;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 9318
    :catch_0
    move-exception v0

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "Couldn\'t create custom event with class name %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    invoke-static {v0, v1, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->e(Ljava/lang/String;)V

    .line 9319
    sget-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->ADAPTER_CONFIGURATION_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

    invoke-direct {p0, p2, v0}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a(Ljava/lang/String;Lcom/mopub/mobileads/MoPubErrorCode;)V

    goto :goto_1

    :cond_2
    move-object v1, v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/mopub/mobileads/MoPubRewardedVideoManager;Lcom/mopub/volley/VolleyError;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 9324
    sget-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->INTERNAL_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

    .line 9325
    instance-of v1, p1, Lcom/mopub/network/MoPubNetworkError;

    if-eqz v1, :cond_0

    .line 9326
    check-cast p1, Lcom/mopub/network/MoPubNetworkError;

    .line 9327
    sget-object v0, Lcom/mopub/mobileads/ag;->a:[I

    invoke-virtual {p1}, Lcom/mopub/network/MoPubNetworkError;->getReason()Lcom/mopub/network/MoPubNetworkError$Reason;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mopub/network/MoPubNetworkError$Reason;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 9335
    sget-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->INTERNAL_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

    .line 9338
    :cond_0
    :goto_0
    invoke-direct {p0, p2, v0}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a(Ljava/lang/String;Lcom/mopub/mobileads/MoPubErrorCode;)V

    .line 38
    return-void

    .line 9330
    :pswitch_0
    sget-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->NO_FILL:Lcom/mopub/mobileads/MoPubErrorCode;

    goto :goto_0

    .line 9327
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic a(Lcom/mopub/mobileads/MoPubRewardedVideoManager;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 38
    .line 9353
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->k:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    .line 9354
    if-eqz v0, :cond_0

    .line 9355
    iget-object v1, p0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->j:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 38
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/mopub/mobileads/MoPubRewardedVideoManager;Ljava/lang/String;Lcom/mopub/mobileads/MoPubErrorCode;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0, p1, p2}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a(Ljava/lang/String;Lcom/mopub/mobileads/MoPubErrorCode;)V

    return-void
.end method

.method private static a(Ljava/lang/Runnable;)V
    .locals 1

    .prologue
    .line 469
    sget-object v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    if-eqz v0, :cond_0

    .line 470
    sget-object v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    iget-object v0, v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->b:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 472
    :cond_0
    return-void
.end method

.method private a(Ljava/lang/String;Lcom/mopub/mobileads/MoPubErrorCode;)V
    .locals 2

    .prologue
    .line 342
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->e:Lcom/mopub/mobileads/AdRequestStatusMapping;

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/AdRequestStatusMapping;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 343
    iget-object v1, p0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->e:Lcom/mopub/mobileads/AdRequestStatusMapping;

    invoke-virtual {v1, p1}, Lcom/mopub/mobileads/AdRequestStatusMapping;->a(Ljava/lang/String;)V

    .line 345
    if-eqz v0, :cond_1

    .line 346
    invoke-static {p1, v0}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 350
    :cond_0
    :goto_0
    return-void

    .line 347
    :cond_1
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->g:Lcom/mopub/mobileads/MoPubRewardedVideoListener;

    if-eqz v0, :cond_0

    .line 348
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->g:Lcom/mopub/mobileads/MoPubRewardedVideoListener;

    invoke-interface {v0, p1, p2}, Lcom/mopub/mobileads/MoPubRewardedVideoListener;->onRewardedVideoLoadFailure(Ljava/lang/String;Lcom/mopub/mobileads/MoPubErrorCode;)V

    goto :goto_0
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 212
    sget-object v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    if-nez v0, :cond_0

    .line 6475
    const-string v0, "MoPub rewarded video was not initialized. You must call MoPub.initializeRewardedVideo() before loading or attempting to play video ads."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->e(Ljava/lang/String;)V

    .line 234
    :goto_0
    return-void

    .line 217
    :cond_0
    sget-object v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    iget-object v0, v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->e:Lcom/mopub/mobileads/AdRequestStatusMapping;

    invoke-virtual {v0, p0}, Lcom/mopub/mobileads/AdRequestStatusMapping;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 218
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "Did not queue rewarded video request for ad unit %s. A request is already pending."

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 224
    :cond_1
    new-instance v0, Lcom/mopub/network/AdRequest;

    sget-object v2, Lcom/mopub/common/AdFormat;->REWARDED_VIDEO:Lcom/mopub/common/AdFormat;

    sget-object v1, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    iget-object v4, v1, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->d:Landroid/content/Context;

    new-instance v5, Lcom/mopub/mobileads/MoPubRewardedVideoManager$RewardedVideoRequestListener;

    sget-object v1, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    invoke-direct {v5, v1, p0}, Lcom/mopub/mobileads/MoPubRewardedVideoManager$RewardedVideoRequestListener;-><init>(Lcom/mopub/mobileads/MoPubRewardedVideoManager;Ljava/lang/String;)V

    move-object v1, p1

    move-object v3, p0

    invoke-direct/range {v0 .. v5}, Lcom/mopub/network/AdRequest;-><init>(Ljava/lang/String;Lcom/mopub/common/AdFormat;Ljava/lang/String;Landroid/content/Context;Lcom/mopub/network/AdRequest$Listener;)V

    .line 231
    sget-object v1, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    iget-object v1, v1, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->d:Landroid/content/Context;

    invoke-static {v1}, Lcom/mopub/network/Networking;->getRequestQueue(Landroid/content/Context;)Lcom/mopub/network/MoPubRequestQueue;

    move-result-object v1

    .line 232
    invoke-virtual {v1, v0}, Lcom/mopub/volley/RequestQueue;->add(Lcom/mopub/volley/Request;)Lcom/mopub/volley/Request;

    .line 233
    sget-object v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    iget-object v0, v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->e:Lcom/mopub/mobileads/AdRequestStatusMapping;

    invoke-virtual {v0, p0}, Lcom/mopub/mobileads/AdRequestStatusMapping;->b(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private static a(Ljava/lang/String;Lcom/mopub/mobileads/CustomEventRewardedVideo;)Z
    .locals 1

    .prologue
    .line 261
    sget-object v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    iget-object v0, v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->e:Lcom/mopub/mobileads/AdRequestStatusMapping;

    invoke-virtual {v0, p0}, Lcom/mopub/mobileads/AdRequestStatusMapping;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/mopub/mobileads/CustomEventRewardedVideo;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic b(Lcom/mopub/mobileads/MoPubRewardedVideoManager;)Lcom/mopub/mobileads/AdRequestStatusMapping;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->e:Lcom/mopub/mobileads/AdRequestStatusMapping;

    return-object v0
.end method

.method static synthetic c(Lcom/mopub/mobileads/MoPubRewardedVideoManager;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->d:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d(Lcom/mopub/mobileads/MoPubRewardedVideoManager;)Lcom/mopub/mobileads/al;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->f:Lcom/mopub/mobileads/al;

    return-object v0
.end method

.method public static getGlobalMediationSettings(Ljava/lang/Class;)Lcom/mopub/common/MediationSettings;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/mopub/common/MediationSettings;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 116
    sget-object v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    if-nez v0, :cond_0

    .line 2475
    const-string v0, "MoPub rewarded video was not initialized. You must call MoPub.initializeRewardedVideo() before loading or attempting to play video ads."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->e(Ljava/lang/String;)V

    move-object v0, v1

    .line 128
    :goto_0
    return-object v0

    .line 121
    :cond_0
    sget-object v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    iget-object v0, v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->h:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/common/MediationSettings;

    .line 123
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 124
    invoke-virtual {p0, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/common/MediationSettings;

    goto :goto_0

    :cond_2
    move-object v0, v1

    .line 128
    goto :goto_0
.end method

.method public static getInstanceMediationSettings(Ljava/lang/Class;Ljava/lang/String;)Lcom/mopub/common/MediationSettings;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/mopub/common/MediationSettings;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 143
    sget-object v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    if-nez v0, :cond_0

    .line 3475
    const-string v0, "MoPub rewarded video was not initialized. You must call MoPub.initializeRewardedVideo() before loading or attempting to play video ads."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->e(Ljava/lang/String;)V

    move-object v0, v1

    .line 161
    :goto_0
    return-object v0

    .line 148
    :cond_0
    sget-object v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    iget-object v0, v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->i:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    .line 150
    if-nez v0, :cond_1

    move-object v0, v1

    .line 151
    goto :goto_0

    .line 154
    :cond_1
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/common/MediationSettings;

    .line 156
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 157
    invoke-virtual {p0, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/common/MediationSettings;

    goto :goto_0

    :cond_3
    move-object v0, v1

    .line 161
    goto :goto_0
.end method

.method public static hasVideo(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 237
    sget-object v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    if-eqz v0, :cond_0

    .line 238
    sget-object v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    iget-object v0, v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->f:Lcom/mopub/mobileads/al;

    invoke-virtual {v0, p0}, Lcom/mopub/mobileads/al;->a(Ljava/lang/String;)Lcom/mopub/mobileads/CustomEventRewardedVideo;

    move-result-object v0

    .line 239
    invoke-static {p0, v0}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a(Ljava/lang/String;Lcom/mopub/mobileads/CustomEventRewardedVideo;)Z

    move-result v0

    .line 242
    :goto_0
    return v0

    .line 7475
    :cond_0
    const-string v0, "MoPub rewarded video was not initialized. You must call MoPub.initializeRewardedVideo() before loading or attempting to play video ads."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->e(Ljava/lang/String;)V

    .line 242
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static varargs declared-synchronized init(Landroid/app/Activity;[Lcom/mopub/common/MediationSettings;)V
    .locals 2

    .prologue
    .line 90
    const-class v1, Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    if-nez v0, :cond_0

    .line 91
    new-instance v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    invoke-direct {v0, p0, p1}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;-><init>(Landroid/app/Activity;[Lcom/mopub/common/MediationSettings;)V

    sput-object v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    :goto_0
    monitor-exit v1

    return-void

    .line 93
    :cond_0
    :try_start_1
    const-string v0, "Tried to call initializeRewardedVideo more than once. Only the first initialization call has any effect."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->e(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 90
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static varargs loadVideo(Ljava/lang/String;[Lcom/mopub/common/MediationSettings;)V
    .locals 4

    .prologue
    .line 185
    sget-object v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    if-nez v0, :cond_0

    .line 5475
    const-string v0, "MoPub rewarded video was not initialized. You must call MoPub.initializeRewardedVideo() before loading or attempting to play video ads."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->e(Ljava/lang/String;)V

    .line 209
    :goto_0
    return-void

    .line 193
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 194
    invoke-static {v0, p1}, Lcom/mopub/common/util/MoPubCollections;->addAllNonNull(Ljava/util/Collection;[Ljava/lang/Object;)V

    .line 195
    sget-object v1, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    iget-object v1, v1, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->i:Ljava/util/Map;

    invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    new-instance v0, Lcom/mopub/mobileads/WebViewAdUrlGenerator;

    sget-object v1, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    iget-object v1, v1, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->d:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/mopub/mobileads/WebViewAdUrlGenerator;-><init>(Landroid/content/Context;Z)V

    .line 198
    invoke-virtual {v0, p0}, Lcom/mopub/common/AdUrlGenerator;->withAdUnitId(Ljava/lang/String;)Lcom/mopub/common/AdUrlGenerator;

    move-result-object v0

    sget-object v1, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    iget-object v1, v1, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->d:Landroid/content/Context;

    invoke-static {}, Lcom/mopub/common/MoPub;->getLocationPrecision()I

    move-result v2

    invoke-static {}, Lcom/mopub/common/MoPub;->getLocationAwareness()Lcom/mopub/common/MoPub$LocationAwareness;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/mopub/common/LocationService;->getLastKnownLocation(Landroid/content/Context;ILcom/mopub/common/MoPub$LocationAwareness;)Landroid/location/Location;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mopub/common/AdUrlGenerator;->withLocation(Landroid/location/Location;)Lcom/mopub/common/AdUrlGenerator;

    move-result-object v0

    const-string v1, "ads.mopub.com"

    invoke-virtual {v0, v1}, Lcom/mopub/common/AdUrlGenerator;->generateUrlString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 208
    invoke-static {p0, v0}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static onRewardedVideoClicked(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/mopub/mobileads/CustomEventRewardedVideo;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 425
    new-instance v0, Lcom/mopub/mobileads/ad;

    invoke-direct {v0, p0, p1}, Lcom/mopub/mobileads/ad;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a(Ljava/lang/Runnable;)V

    .line 434
    return-void
.end method

.method public static onRewardedVideoClosed(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/mopub/mobileads/CustomEventRewardedVideo;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 438
    new-instance v0, Lcom/mopub/mobileads/ae;

    invoke-direct {v0, p0, p1}, Lcom/mopub/mobileads/ae;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a(Ljava/lang/Runnable;)V

    .line 446
    return-void
.end method

.method public static onRewardedVideoCompleted(Ljava/lang/Class;Ljava/lang/String;Lcom/mopub/common/MoPubReward;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/mopub/mobileads/CustomEventRewardedVideo;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/String;",
            "Lcom/mopub/common/MoPubReward;",
            ")V"
        }
    .end annotation

    .prologue
    .line 451
    new-instance v0, Lcom/mopub/mobileads/af;

    invoke-direct {v0, p0, p1, p2}, Lcom/mopub/mobileads/af;-><init>(Ljava/lang/Class;Ljava/lang/String;Lcom/mopub/common/MoPubReward;)V

    invoke-static {v0}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a(Ljava/lang/Runnable;)V

    .line 461
    return-void
.end method

.method public static onRewardedVideoLoadFailure(Ljava/lang/Class;Ljava/lang/String;Lcom/mopub/mobileads/MoPubErrorCode;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/mopub/mobileads/CustomEventRewardedVideo;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/String;",
            "Lcom/mopub/mobileads/MoPubErrorCode;",
            ")V"
        }
    .end annotation

    .prologue
    .line 385
    new-instance v0, Lcom/mopub/mobileads/aa;

    invoke-direct {v0, p0, p1, p2}, Lcom/mopub/mobileads/aa;-><init>(Ljava/lang/Class;Ljava/lang/String;Lcom/mopub/mobileads/MoPubErrorCode;)V

    invoke-static {v0}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a(Ljava/lang/Runnable;)V

    .line 392
    return-void
.end method

.method public static onRewardedVideoLoadSuccess(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/mopub/mobileads/CustomEventRewardedVideo;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 372
    new-instance v0, Lcom/mopub/mobileads/z;

    invoke-direct {v0, p0, p1}, Lcom/mopub/mobileads/z;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a(Ljava/lang/Runnable;)V

    .line 381
    return-void
.end method

.method public static onRewardedVideoPlaybackError(Ljava/lang/Class;Ljava/lang/String;Lcom/mopub/mobileads/MoPubErrorCode;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/mopub/mobileads/CustomEventRewardedVideo;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/String;",
            "Lcom/mopub/mobileads/MoPubErrorCode;",
            ")V"
        }
    .end annotation

    .prologue
    .line 412
    new-instance v0, Lcom/mopub/mobileads/ac;

    invoke-direct {v0, p0, p1, p2}, Lcom/mopub/mobileads/ac;-><init>(Ljava/lang/Class;Ljava/lang/String;Lcom/mopub/mobileads/MoPubErrorCode;)V

    invoke-static {v0}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a(Ljava/lang/Runnable;)V

    .line 421
    return-void
.end method

.method public static onRewardedVideoStarted(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/mopub/mobileads/CustomEventRewardedVideo;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 396
    new-instance v0, Lcom/mopub/mobileads/ab;

    invoke-direct {v0, p0, p1}, Lcom/mopub/mobileads/ab;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a(Ljava/lang/Runnable;)V

    .line 408
    return-void
.end method

.method public static setVideoListener(Lcom/mopub/mobileads/MoPubRewardedVideoListener;)V
    .locals 1

    .prologue
    .line 169
    sget-object v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    if-eqz v0, :cond_0

    .line 170
    sget-object v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    iput-object p0, v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->g:Lcom/mopub/mobileads/MoPubRewardedVideoListener;

    .line 174
    :goto_0
    return-void

    .line 4475
    :cond_0
    const-string v0, "MoPub rewarded video was not initialized. You must call MoPub.initializeRewardedVideo() before loading or attempting to play video ads."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->e(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static showVideo(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 247
    sget-object v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    if-eqz v0, :cond_1

    .line 248
    sget-object v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    iget-object v0, v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->f:Lcom/mopub/mobileads/al;

    invoke-virtual {v0, p0}, Lcom/mopub/mobileads/al;->a(Ljava/lang/String;)Lcom/mopub/mobileads/CustomEventRewardedVideo;

    move-result-object v0

    .line 249
    invoke-static {p0, v0}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a(Ljava/lang/String;Lcom/mopub/mobileads/CustomEventRewardedVideo;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 250
    sget-object v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    iget-object v0, v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->e:Lcom/mopub/mobileads/AdRequestStatusMapping;

    invoke-virtual {v0, p0}, Lcom/mopub/mobileads/AdRequestStatusMapping;->c(Ljava/lang/String;)V

    .line 258
    :goto_0
    return-void

    .line 253
    :cond_0
    sget-object v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    sget-object v1, Lcom/mopub/mobileads/MoPubErrorCode;->VIDEO_NOT_AVAILABLE:Lcom/mopub/mobileads/MoPubErrorCode;

    invoke-direct {v0, p0, v1}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a(Ljava/lang/String;Lcom/mopub/mobileads/MoPubErrorCode;)V

    goto :goto_0

    .line 8475
    :cond_1
    const-string v0, "MoPub rewarded video was not initialized. You must call MoPub.initializeRewardedVideo() before loading or attempting to play video ads."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->e(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static updateActivity(Landroid/app/Activity;)V
    .locals 2

    .prologue
    .line 99
    sget-object v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    if-eqz v0, :cond_0

    .line 100
    sget-object v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->a:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->c:Ljava/lang/ref/WeakReference;

    .line 104
    :goto_0
    return-void

    .line 1475
    :cond_0
    const-string v0, "MoPub rewarded video was not initialized. You must call MoPub.initializeRewardedVideo() before loading or attempting to play video ads."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->e(Ljava/lang/String;)V

    goto :goto_0
.end method
