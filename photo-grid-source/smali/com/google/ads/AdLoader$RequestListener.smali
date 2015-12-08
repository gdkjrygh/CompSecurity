.class Lcom/google/ads/AdLoader$RequestListener;
.super Lcom/google/android/gms/ads/AdListener;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/ads/doubleclick/AppEventListener;
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/ads/AdLoader;

.field private final b:Ljava/lang/Object;

.field private c:Lcom/google/android/gms/ads/doubleclick/PublisherAdView;


# direct methods
.method public constructor <init>(Lcom/google/ads/AdLoader;Lcom/google/android/gms/ads/doubleclick/PublisherAdView;)V
    .locals 1

    .prologue
    .line 250
    iput-object p1, p0, Lcom/google/ads/AdLoader$RequestListener;->a:Lcom/google/ads/AdLoader;

    invoke-direct {p0}, Lcom/google/android/gms/ads/AdListener;-><init>()V

    .line 247
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/ads/AdLoader$RequestListener;->b:Ljava/lang/Object;

    .line 251
    iput-object p2, p0, Lcom/google/ads/AdLoader$RequestListener;->c:Lcom/google/android/gms/ads/doubleclick/PublisherAdView;

    .line 252
    return-void
.end method

.method private a()Z
    .locals 2

    .prologue
    .line 372
    iget-object v1, p0, Lcom/google/ads/AdLoader$RequestListener;->b:Ljava/lang/Object;

    monitor-enter v1

    .line 373
    :try_start_0
    iget-object v0, p0, Lcom/google/ads/AdLoader$RequestListener;->c:Lcom/google/android/gms/ads/doubleclick/PublisherAdView;

    if-nez v0, :cond_0

    .line 374
    const/4 v0, 0x0

    monitor-exit v1

    .line 378
    :goto_0
    return v0

    .line 376
    :cond_0
    iget-object v0, p0, Lcom/google/ads/AdLoader$RequestListener;->c:Lcom/google/android/gms/ads/doubleclick/PublisherAdView;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->destroy()V

    .line 377
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/ads/AdLoader$RequestListener;->c:Lcom/google/android/gms/ads/doubleclick/PublisherAdView;

    .line 378
    const/4 v0, 0x1

    monitor-exit v1

    goto :goto_0

    .line 379
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method public onAdFailedToLoad(I)V
    .locals 3

    .prologue
    .line 342
    const-string v0, "Ads"

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x1d

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Error loading ad: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 343
    invoke-direct {p0}, Lcom/google/ads/AdLoader$RequestListener;->a()Z

    .line 344
    iget-object v0, p0, Lcom/google/ads/AdLoader$RequestListener;->a:Lcom/google/ads/AdLoader;

    invoke-static {v0}, Lcom/google/ads/AdLoader;->d(Lcom/google/ads/AdLoader;)Lcom/google/android/gms/ads/AdListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 345
    iget-object v0, p0, Lcom/google/ads/AdLoader$RequestListener;->a:Lcom/google/ads/AdLoader;

    invoke-static {v0}, Lcom/google/ads/AdLoader;->d(Lcom/google/ads/AdLoader;)Lcom/google/android/gms/ads/AdListener;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/AdListener;->onAdFailedToLoad(I)V

    .line 347
    :cond_0
    return-void
.end method

.method public onAdLoaded()V
    .locals 4

    .prologue
    .line 351
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sget-wide v2, Lcom/google/ads/AdLoader;->a:J

    invoke-virtual {v0, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 352
    return-void
.end method

.method public onAppEvent(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 258
    invoke-direct {p0}, Lcom/google/ads/AdLoader$RequestListener;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 338
    :goto_0
    return-void

    .line 262
    :cond_0
    const-string v0, "native_ad_failure"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 263
    const-string v0, "Ads"

    const-string v1, "Received malformed native ad response."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 264
    invoke-virtual {p0, v6}, Lcom/google/ads/AdLoader$RequestListener;->onAdFailedToLoad(I)V

    goto :goto_0

    .line 268
    :cond_1
    const-string v0, "native_ad_content"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 269
    const-string v1, "Ads"

    const-string v2, "Received an unexpected app event: "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 270
    invoke-virtual {p0, v6}, Lcom/google/ads/AdLoader$RequestListener;->onAdFailedToLoad(I)V

    goto :goto_0

    .line 269
    :cond_2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 293
    :cond_3
    :try_start_0
    const-string v0, "\u2713"

    .line 294
    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_4

    new-instance v0, Lorg/json/JSONObject;

    new-instance v1, Ljava/lang/String;

    const-string v2, "iso8859_1"

    .line 295
    invoke-virtual {p2, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v2

    const-string v3, "utf-8"

    invoke-direct {v1, v2, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 297
    :goto_2
    const-string v1, "ads"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 299
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-gtz v1, :cond_5

    .line 300
    const-string v0, "Ads"

    const-string v1, "No ads in ad response."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 301
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/ads/AdLoader$RequestListener;->onAdFailedToLoad(I)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 331
    :catch_0
    move-exception v0

    .line 332
    const-string v1, "Ads"

    const-string v2, "Unsupported encoding.."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 333
    invoke-virtual {p0, v6}, Lcom/google/ads/AdLoader$RequestListener;->onAdFailedToLoad(I)V

    goto :goto_0

    .line 295
    :cond_4
    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    .line 334
    :catch_1
    move-exception v0

    .line 335
    const-string v1, "Ads"

    const-string v2, "Malformed native ad response."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 336
    invoke-virtual {p0, v6}, Lcom/google/ads/AdLoader$RequestListener;->onAdFailedToLoad(I)V

    goto/16 :goto_0

    .line 305
    :cond_5
    const/4 v1, 0x0

    :try_start_2
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v1

    .line 306
    const-string v0, "template_id"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 309
    const-string v2, "1"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, p0, Lcom/google/ads/AdLoader$RequestListener;->a:Lcom/google/ads/AdLoader;

    invoke-static {v2}, Lcom/google/ads/AdLoader;->a(Lcom/google/ads/AdLoader;)Lcom/google/ads/formats/NativeContentAd$OnContentAdLoadedListener;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 310
    new-instance v0, Lcom/google/ads/k;

    iget-object v2, p0, Lcom/google/ads/AdLoader$RequestListener;->a:Lcom/google/ads/AdLoader;

    .line 311
    invoke-static {v2}, Lcom/google/ads/AdLoader;->b(Lcom/google/ads/AdLoader;)Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/google/ads/AdLoader$RequestListener;->a:Lcom/google/ads/AdLoader;

    .line 312
    invoke-static {v3}, Lcom/google/ads/AdLoader;->c(Lcom/google/ads/AdLoader;)Lcom/google/ads/h;

    move-result-object v3

    iget-object v4, p0, Lcom/google/ads/AdLoader$RequestListener;->a:Lcom/google/ads/AdLoader;

    .line 313
    invoke-static {v4}, Lcom/google/ads/AdLoader;->d(Lcom/google/ads/AdLoader;)Lcom/google/android/gms/ads/AdListener;

    move-result-object v4

    iget-object v5, p0, Lcom/google/ads/AdLoader$RequestListener;->a:Lcom/google/ads/AdLoader;

    .line 314
    invoke-static {v5}, Lcom/google/ads/AdLoader;->a(Lcom/google/ads/AdLoader;)Lcom/google/ads/formats/NativeContentAd$OnContentAdLoadedListener;

    move-result-object v5

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/ads/k;-><init>(Landroid/content/Context;Lcom/google/ads/h;Lcom/google/android/gms/ads/AdListener;Lcom/google/ads/formats/NativeContentAd$OnContentAdLoadedListener;)V

    .line 329
    :goto_3
    iget-object v2, p0, Lcom/google/ads/AdLoader$RequestListener;->a:Lcom/google/ads/AdLoader;

    invoke-virtual {v2, v0, v1}, Lcom/google/ads/AdLoader;->a(Landroid/os/AsyncTask;Lorg/json/JSONObject;)V

    goto/16 :goto_0

    .line 315
    :cond_6
    const-string v2, "2"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object v2, p0, Lcom/google/ads/AdLoader$RequestListener;->a:Lcom/google/ads/AdLoader;

    .line 316
    invoke-static {v2}, Lcom/google/ads/AdLoader;->e(Lcom/google/ads/AdLoader;)Lcom/google/ads/formats/NativeAppInstallAd$OnAppInstallAdLoadedListener;

    move-result-object v2

    if-eqz v2, :cond_7

    .line 317
    new-instance v0, Lcom/google/ads/j;

    iget-object v2, p0, Lcom/google/ads/AdLoader$RequestListener;->a:Lcom/google/ads/AdLoader;

    .line 318
    invoke-static {v2}, Lcom/google/ads/AdLoader;->b(Lcom/google/ads/AdLoader;)Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/google/ads/AdLoader$RequestListener;->a:Lcom/google/ads/AdLoader;

    .line 319
    invoke-static {v3}, Lcom/google/ads/AdLoader;->c(Lcom/google/ads/AdLoader;)Lcom/google/ads/h;

    move-result-object v3

    iget-object v4, p0, Lcom/google/ads/AdLoader$RequestListener;->a:Lcom/google/ads/AdLoader;

    .line 320
    invoke-static {v4}, Lcom/google/ads/AdLoader;->d(Lcom/google/ads/AdLoader;)Lcom/google/android/gms/ads/AdListener;

    move-result-object v4

    iget-object v5, p0, Lcom/google/ads/AdLoader$RequestListener;->a:Lcom/google/ads/AdLoader;

    .line 321
    invoke-static {v5}, Lcom/google/ads/AdLoader;->e(Lcom/google/ads/AdLoader;)Lcom/google/ads/formats/NativeAppInstallAd$OnAppInstallAdLoadedListener;

    move-result-object v5

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/ads/j;-><init>(Landroid/content/Context;Lcom/google/ads/h;Lcom/google/android/gms/ads/AdListener;Lcom/google/ads/formats/NativeAppInstallAd$OnAppInstallAdLoadedListener;)V

    goto :goto_3

    .line 323
    :cond_7
    const-string v1, "Ads"

    const-string v2, "Unknown ad type: "

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_4
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 324
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/ads/AdLoader$RequestListener;->onAdFailedToLoad(I)V

    goto/16 :goto_0

    .line 323
    :cond_8
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_4
.end method

.method public run()V
    .locals 2

    .prologue
    .line 359
    invoke-direct {p0}, Lcom/google/ads/AdLoader$RequestListener;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 365
    :goto_0
    return-void

    .line 363
    :cond_0
    const-string v0, "Ads"

    const-string v1, "Ad loaded, but no app event was fired."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 364
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/ads/AdLoader$RequestListener;->onAdFailedToLoad(I)V

    goto :goto_0
.end method
