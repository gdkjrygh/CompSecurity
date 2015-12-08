.class final Lcom/mixpanel/android/mpmetrics/a$b$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/mpmetrics/a$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/mixpanel/android/mpmetrics/a$b;

.field private b:Lcom/mixpanel/android/mpmetrics/u;

.field private c:J

.field private d:Z

.field private final e:Lcom/mixpanel/android/mpmetrics/g;


# direct methods
.method public constructor <init>(Lcom/mixpanel/android/mpmetrics/a$b;Landroid/os/Looper;)V
    .locals 3

    .prologue
    .line 226
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    .line 227
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 228
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->b:Lcom/mixpanel/android/mpmetrics/u;

    .line 229
    new-instance v0, Lcom/mixpanel/android/mpmetrics/g;

    iget-object v1, p1, Lcom/mixpanel/android/mpmetrics/a$b;->a:Lcom/mixpanel/android/mpmetrics/a;

    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/a;->a(Lcom/mixpanel/android/mpmetrics/a;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p1, Lcom/mixpanel/android/mpmetrics/a$b;->a:Lcom/mixpanel/android/mpmetrics/a;

    invoke-static {v2}, Lcom/mixpanel/android/mpmetrics/a;->b(Lcom/mixpanel/android/mpmetrics/a;)Lcom/mixpanel/android/mpmetrics/t;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/mixpanel/android/mpmetrics/g;-><init>(Landroid/content/Context;Lcom/mixpanel/android/mpmetrics/t;)V

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->e:Lcom/mixpanel/android/mpmetrics/g;

    .line 230
    iget-object v0, p1, Lcom/mixpanel/android/mpmetrics/a$b;->a:Lcom/mixpanel/android/mpmetrics/a;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/a;->b(Lcom/mixpanel/android/mpmetrics/a;)Lcom/mixpanel/android/mpmetrics/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/t;->d()Z

    move-result v0

    iput-boolean v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->d:Z

    .line 231
    iget-object v0, p1, Lcom/mixpanel/android/mpmetrics/a$b;->a:Lcom/mixpanel/android/mpmetrics/a;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/a;->b(Lcom/mixpanel/android/mpmetrics/a;)Lcom/mixpanel/android/mpmetrics/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/t;->b()I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->c:J

    .line 232
    new-instance v0, Lcom/mixpanel/android/mpmetrics/ak;

    iget-object v1, p1, Lcom/mixpanel/android/mpmetrics/a$b;->a:Lcom/mixpanel/android/mpmetrics/a;

    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/a;->a(Lcom/mixpanel/android/mpmetrics/a;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/mixpanel/android/mpmetrics/ak;-><init>(Landroid/content/Context;)V

    invoke-static {p1, v0}, Lcom/mixpanel/android/mpmetrics/a$b;->a(Lcom/mixpanel/android/mpmetrics/a$b;Lcom/mixpanel/android/mpmetrics/ak;)Lcom/mixpanel/android/mpmetrics/ak;

    .line 233
    return-void
.end method

.method private a()Lorg/json/JSONObject;
    .locals 4

    .prologue
    .line 457
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 459
    const-string v0, "mp_lib"

    const-string v2, "android"

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 460
    const-string v0, "$lib_version"

    const-string v2, "4.4.1"

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 463
    const-string v0, "$os"

    const-string v2, "Android"

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 464
    const-string v2, "$os_version"

    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    if-nez v0, :cond_7

    const-string v0, "UNKNOWN"

    :goto_0
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 466
    const-string v2, "$manufacturer"

    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    if-nez v0, :cond_8

    const-string v0, "UNKNOWN"

    :goto_1
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 467
    const-string v2, "$brand"

    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    if-nez v0, :cond_9

    const-string v0, "UNKNOWN"

    :goto_2
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 468
    const-string v2, "$model"

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    if-nez v0, :cond_a

    const-string v0, "UNKNOWN"

    :goto_3
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 471
    :try_start_0
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    iget-object v0, v0, Lcom/mixpanel/android/mpmetrics/a$b;->a:Lcom/mixpanel/android/mpmetrics/a;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/a;->a(Lcom/mixpanel/android/mpmetrics/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->isGooglePlayServicesAvailable(Landroid/content/Context;)I
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 472
    packed-switch v0, :pswitch_data_0

    .line 493
    :goto_4
    :pswitch_0
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/a$b;->d(Lcom/mixpanel/android/mpmetrics/a$b;)Lcom/mixpanel/android/mpmetrics/ak;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/ak;->d()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 494
    const-string v2, "$screen_dpi"

    iget v3, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 495
    const-string v2, "$screen_height"

    iget v3, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 496
    const-string v2, "$screen_width"

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 498
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/a$b;->d(Lcom/mixpanel/android/mpmetrics/a$b;)Lcom/mixpanel/android/mpmetrics/ak;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/ak;->a()Ljava/lang/String;

    move-result-object v0

    .line 499
    if-eqz v0, :cond_0

    .line 500
    const-string v2, "$app_version"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 502
    :cond_0
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/a$b;->d(Lcom/mixpanel/android/mpmetrics/a$b;)Lcom/mixpanel/android/mpmetrics/ak;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/ak;->b()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 503
    if-eqz v0, :cond_1

    .line 504
    const-string v2, "$has_nfc"

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 506
    :cond_1
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/a$b;->d(Lcom/mixpanel/android/mpmetrics/a$b;)Lcom/mixpanel/android/mpmetrics/ak;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/ak;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 507
    if-eqz v0, :cond_2

    .line 508
    const-string v2, "$has_telephone"

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 510
    :cond_2
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/a$b;->d(Lcom/mixpanel/android/mpmetrics/a$b;)Lcom/mixpanel/android/mpmetrics/ak;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/ak;->e()Ljava/lang/String;

    move-result-object v0

    .line 511
    if-eqz v0, :cond_3

    .line 512
    const-string v2, "$carrier"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 514
    :cond_3
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/a$b;->d(Lcom/mixpanel/android/mpmetrics/a$b;)Lcom/mixpanel/android/mpmetrics/ak;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/ak;->f()Ljava/lang/Boolean;

    move-result-object v0

    .line 515
    if-eqz v0, :cond_4

    .line 516
    const-string v2, "$wifi"

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 518
    :cond_4
    invoke-static {}, Lcom/mixpanel/android/mpmetrics/ak;->g()Ljava/lang/Boolean;

    move-result-object v0

    .line 519
    if-eqz v0, :cond_5

    .line 520
    const-string v2, "$bluetooth_enabled"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 522
    :cond_5
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/a$b;->d(Lcom/mixpanel/android/mpmetrics/a$b;)Lcom/mixpanel/android/mpmetrics/ak;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/ak;->h()Ljava/lang/String;

    move-result-object v0

    .line 523
    if-eqz v0, :cond_6

    .line 524
    const-string v2, "$bluetooth_version"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 526
    :cond_6
    return-object v1

    .line 464
    :cond_7
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    goto/16 :goto_0

    .line 466
    :cond_8
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    goto/16 :goto_1

    .line 467
    :cond_9
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    goto/16 :goto_2

    .line 468
    :cond_a
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    goto/16 :goto_3

    .line 474
    :pswitch_1
    :try_start_1
    const-string v0, "$google_play_services"

    const-string v2, "available"

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_4

    .line 490
    :catch_0
    move-exception v0

    const-string v0, "$google_play_services"

    const-string v2, "not included"

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_4

    .line 477
    :pswitch_2
    :try_start_2
    const-string v0, "$google_play_services"

    const-string v2, "missing"

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_4

    .line 480
    :pswitch_3
    const-string v0, "$google_play_services"

    const-string v2, "out of date"

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_4

    .line 483
    :pswitch_4
    const-string v0, "$google_play_services"

    const-string v2, "disabled"

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_4

    .line 486
    :pswitch_5
    const-string v0, "$google_play_services"

    const-string v2, "invalid"

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_4

    .line 472
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_5
    .end packed-switch
.end method

.method private a(Lcom/mixpanel/android/mpmetrics/a$a;)Lorg/json/JSONObject;
    .locals 6

    .prologue
    .line 530
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 531
    invoke-virtual {p1}, Lcom/mixpanel/android/mpmetrics/a$a;->b()Lorg/json/JSONObject;

    move-result-object v2

    .line 532
    invoke-direct {p0}, Lcom/mixpanel/android/mpmetrics/a$b$a;->a()Lorg/json/JSONObject;

    move-result-object v3

    .line 533
    const-string v0, "token"

    invoke-virtual {p1}, Lcom/mixpanel/android/mpmetrics/a$a;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 534
    if-eqz v2, :cond_0

    .line 535
    invoke-virtual {v2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 536
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 537
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 540
    :cond_0
    const-string v0, "event"

    invoke-virtual {p1}, Lcom/mixpanel/android/mpmetrics/a$a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 541
    const-string v0, "properties"

    invoke-virtual {v1, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 542
    return-object v1
.end method

.method private a(Lcom/mixpanel/android/mpmetrics/u;)V
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 375
    invoke-static {}, Lcom/mixpanel/android/mpmetrics/a;->b()Lcom/mixpanel/android/mpmetrics/ae;

    .line 376
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    iget-object v0, v0, Lcom/mixpanel/android/mpmetrics/a$b;->a:Lcom/mixpanel/android/mpmetrics/a;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/a;->a(Lcom/mixpanel/android/mpmetrics/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/ae;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 377
    const-string v0, "Not flushing data to Mixpanel because the device is not connected to the internet."

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/a;->a(Ljava/lang/String;)V

    .line 391
    :goto_0
    return-void

    .line 381
    :cond_0
    const-string v0, "Sending records to Mixpanel"

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/a;->a(Ljava/lang/String;)V

    .line 382
    iget-boolean v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->d:Z

    if-eqz v0, :cond_1

    .line 383
    sget-object v0, Lcom/mixpanel/android/mpmetrics/u$b;->a:Lcom/mixpanel/android/mpmetrics/u$b;

    new-array v1, v4, [Ljava/lang/String;

    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    iget-object v2, v2, Lcom/mixpanel/android/mpmetrics/a$b;->a:Lcom/mixpanel/android/mpmetrics/a;

    invoke-static {v2}, Lcom/mixpanel/android/mpmetrics/a;->b(Lcom/mixpanel/android/mpmetrics/a;)Lcom/mixpanel/android/mpmetrics/t;

    move-result-object v2

    invoke-virtual {v2}, Lcom/mixpanel/android/mpmetrics/t;->f()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v3

    invoke-direct {p0, p1, v0, v1}, Lcom/mixpanel/android/mpmetrics/a$b$a;->a(Lcom/mixpanel/android/mpmetrics/u;Lcom/mixpanel/android/mpmetrics/u$b;[Ljava/lang/String;)V

    .line 384
    sget-object v0, Lcom/mixpanel/android/mpmetrics/u$b;->b:Lcom/mixpanel/android/mpmetrics/u$b;

    new-array v1, v4, [Ljava/lang/String;

    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    iget-object v2, v2, Lcom/mixpanel/android/mpmetrics/a$b;->a:Lcom/mixpanel/android/mpmetrics/a;

    invoke-static {v2}, Lcom/mixpanel/android/mpmetrics/a;->b(Lcom/mixpanel/android/mpmetrics/a;)Lcom/mixpanel/android/mpmetrics/t;

    move-result-object v2

    invoke-virtual {v2}, Lcom/mixpanel/android/mpmetrics/t;->g()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v3

    invoke-direct {p0, p1, v0, v1}, Lcom/mixpanel/android/mpmetrics/a$b$a;->a(Lcom/mixpanel/android/mpmetrics/u;Lcom/mixpanel/android/mpmetrics/u$b;[Ljava/lang/String;)V

    goto :goto_0

    .line 386
    :cond_1
    sget-object v0, Lcom/mixpanel/android/mpmetrics/u$b;->a:Lcom/mixpanel/android/mpmetrics/u$b;

    new-array v1, v5, [Ljava/lang/String;

    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    iget-object v2, v2, Lcom/mixpanel/android/mpmetrics/a$b;->a:Lcom/mixpanel/android/mpmetrics/a;

    .line 387
    invoke-static {v2}, Lcom/mixpanel/android/mpmetrics/a;->b(Lcom/mixpanel/android/mpmetrics/a;)Lcom/mixpanel/android/mpmetrics/t;

    move-result-object v2

    invoke-virtual {v2}, Lcom/mixpanel/android/mpmetrics/t;->f()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    iget-object v2, v2, Lcom/mixpanel/android/mpmetrics/a$b;->a:Lcom/mixpanel/android/mpmetrics/a;

    invoke-static {v2}, Lcom/mixpanel/android/mpmetrics/a;->b(Lcom/mixpanel/android/mpmetrics/a;)Lcom/mixpanel/android/mpmetrics/t;

    move-result-object v2

    invoke-virtual {v2}, Lcom/mixpanel/android/mpmetrics/t;->i()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v4

    .line 386
    invoke-direct {p0, p1, v0, v1}, Lcom/mixpanel/android/mpmetrics/a$b$a;->a(Lcom/mixpanel/android/mpmetrics/u;Lcom/mixpanel/android/mpmetrics/u$b;[Ljava/lang/String;)V

    .line 388
    sget-object v0, Lcom/mixpanel/android/mpmetrics/u$b;->b:Lcom/mixpanel/android/mpmetrics/u$b;

    new-array v1, v5, [Ljava/lang/String;

    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    iget-object v2, v2, Lcom/mixpanel/android/mpmetrics/a$b;->a:Lcom/mixpanel/android/mpmetrics/a;

    .line 389
    invoke-static {v2}, Lcom/mixpanel/android/mpmetrics/a;->b(Lcom/mixpanel/android/mpmetrics/a;)Lcom/mixpanel/android/mpmetrics/t;

    move-result-object v2

    invoke-virtual {v2}, Lcom/mixpanel/android/mpmetrics/t;->g()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    iget-object v2, v2, Lcom/mixpanel/android/mpmetrics/a$b;->a:Lcom/mixpanel/android/mpmetrics/a;

    invoke-static {v2}, Lcom/mixpanel/android/mpmetrics/a;->b(Lcom/mixpanel/android/mpmetrics/a;)Lcom/mixpanel/android/mpmetrics/t;

    move-result-object v2

    invoke-virtual {v2}, Lcom/mixpanel/android/mpmetrics/t;->j()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v4

    .line 388
    invoke-direct {p0, p1, v0, v1}, Lcom/mixpanel/android/mpmetrics/a$b$a;->a(Lcom/mixpanel/android/mpmetrics/u;Lcom/mixpanel/android/mpmetrics/u$b;[Ljava/lang/String;)V

    goto :goto_0
.end method

.method private a(Lcom/mixpanel/android/mpmetrics/u;Lcom/mixpanel/android/mpmetrics/u$b;[Ljava/lang/String;)V
    .locals 11

    .prologue
    const/4 v4, 0x0

    const/4 v1, 0x1

    .line 394
    invoke-static {}, Lcom/mixpanel/android/mpmetrics/a;->b()Lcom/mixpanel/android/mpmetrics/ae;

    .line 395
    invoke-virtual {p1, p2}, Lcom/mixpanel/android/mpmetrics/u;->a(Lcom/mixpanel/android/mpmetrics/u$b;)[Ljava/lang/String;

    move-result-object v0

    .line 397
    if-eqz v0, :cond_2

    .line 398
    aget-object v5, v0, v4

    .line 399
    aget-object v6, v0, v1

    .line 401
    invoke-static {v6}, Lcom/mixpanel/android/a/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 402
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 403
    new-instance v2, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "data"

    invoke-direct {v2, v3, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v7, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 404
    sget-boolean v0, Lcom/mixpanel/android/mpmetrics/t;->a:Z

    if-eqz v0, :cond_0

    .line 405
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "verbose"

    const-string v3, "1"

    invoke-direct {v0, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 410
    :cond_0
    array-length v8, p3

    move v3, v4

    move v2, v1

    :goto_0
    if-ge v3, v8, :cond_6

    aget-object v9, p3, v3

    .line 412
    :try_start_0
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/a$b;->d(Lcom/mixpanel/android/mpmetrics/a$b;)Lcom/mixpanel/android/mpmetrics/ak;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/ak;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v7, v0}, Lcom/mixpanel/android/mpmetrics/ae;->a(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3

    move-result-object v0

    .line 414
    if-nez v0, :cond_3

    .line 415
    :try_start_1
    sget-boolean v0, Lcom/mixpanel/android/mpmetrics/t;->a:Z

    if-eqz v0, :cond_1

    .line 416
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Response was null, unexpected failure posting to "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3

    .line 443
    :cond_1
    :goto_1
    if-eqz v1, :cond_5

    .line 444
    const-string v0, "Not retrying this batch of events, deleting them from DB."

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/a;->a(Ljava/lang/String;)V

    .line 445
    invoke-virtual {p1, v5, p2}, Lcom/mixpanel/android/mpmetrics/u;->a(Ljava/lang/String;Lcom/mixpanel/android/mpmetrics/u$b;)V

    .line 453
    :cond_2
    :goto_2
    return-void

    .line 421
    :cond_3
    :try_start_2
    new-instance v2, Ljava/lang/String;

    const-string v10, "UTF-8"

    invoke-direct {v2, v0, v10}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/net/MalformedURLException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    .line 426
    :try_start_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v10, "Successfully posted to "

    invoke-direct {v0, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v10, ": \n"

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/a;->a(Ljava/lang/String;)V

    .line 427
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v10, "Response was "

    invoke-direct {v0, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/a;->a(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/net/MalformedURLException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_1

    .line 430
    :catch_0
    move-exception v0

    .line 431
    :goto_3
    const-string v2, "MixpanelAPI"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Out of memory when posting to "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    .line 422
    :catch_1
    move-exception v0

    .line 423
    :try_start_4
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v10, "UTF not supported on this platform?"

    invoke-direct {v2, v10, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/net/MalformedURLException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 433
    :catch_2
    move-exception v0

    .line 434
    :goto_4
    const-string v2, "MixpanelAPI"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Cannot interpret "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " as a URL."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_1

    .line 437
    :catch_3
    move-exception v0

    sget-boolean v0, Lcom/mixpanel/android/mpmetrics/t;->a:Z

    if-eqz v0, :cond_4

    .line 438
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Cannot post message to "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 410
    :cond_4
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    move v2, v4

    goto/16 :goto_0

    .line 447
    :cond_5
    const-string v0, "Retrying this batch of events."

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/a;->a(Ljava/lang/String;)V

    .line 448
    invoke-static {}, Lcom/mixpanel/android/mpmetrics/a;->d()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/mixpanel/android/mpmetrics/a$b$a;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 449
    invoke-static {}, Lcom/mixpanel/android/mpmetrics/a;->d()I

    move-result v0

    iget-wide v2, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->c:J

    invoke-virtual {p0, v0, v2, v3}, Lcom/mixpanel/android/mpmetrics/a$b$a;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_2

    .line 433
    :catch_4
    move-exception v0

    move v1, v2

    goto :goto_4

    .line 430
    :catch_5
    move-exception v0

    move v1, v2

    goto :goto_3

    :cond_6
    move v1, v2

    goto/16 :goto_1
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 6

    .prologue
    .line 237
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->b:Lcom/mixpanel/android/mpmetrics/u;

    if-nez v0, :cond_0

    .line 238
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    iget-object v0, v0, Lcom/mixpanel/android/mpmetrics/a$b;->a:Lcom/mixpanel/android/mpmetrics/a;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/a;->a(Lcom/mixpanel/android/mpmetrics/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/a;->b(Landroid/content/Context;)Lcom/mixpanel/android/mpmetrics/u;

    move-result-object v0

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->b:Lcom/mixpanel/android/mpmetrics/u;

    .line 239
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->b:Lcom/mixpanel/android/mpmetrics/u;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    iget-object v1, v1, Lcom/mixpanel/android/mpmetrics/a$b;->a:Lcom/mixpanel/android/mpmetrics/a;

    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/a;->b(Lcom/mixpanel/android/mpmetrics/a;)Lcom/mixpanel/android/mpmetrics/t;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/t;->c()I

    move-result v1

    int-to-long v4, v1

    sub-long/2addr v2, v4

    sget-object v1, Lcom/mixpanel/android/mpmetrics/u$b;->a:Lcom/mixpanel/android/mpmetrics/u$b;

    invoke-virtual {v0, v2, v3, v1}, Lcom/mixpanel/android/mpmetrics/u;->a(JLcom/mixpanel/android/mpmetrics/u$b;)V

    .line 240
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->b:Lcom/mixpanel/android/mpmetrics/u;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    iget-object v1, v1, Lcom/mixpanel/android/mpmetrics/a$b;->a:Lcom/mixpanel/android/mpmetrics/a;

    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/a;->b(Lcom/mixpanel/android/mpmetrics/a;)Lcom/mixpanel/android/mpmetrics/t;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/t;->c()I

    move-result v1

    int-to-long v4, v1

    sub-long/2addr v2, v4

    sget-object v1, Lcom/mixpanel/android/mpmetrics/u$b;->b:Lcom/mixpanel/android/mpmetrics/u$b;

    invoke-virtual {v0, v2, v3, v1}, Lcom/mixpanel/android/mpmetrics/u;->a(JLcom/mixpanel/android/mpmetrics/u$b;)V

    .line 244
    :cond_0
    const/4 v2, -0x1

    .line 246
    :try_start_0
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/mixpanel/android/mpmetrics/a;->c()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 247
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    .line 248
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Changing flush interval to "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/a;->a(Ljava/lang/String;)V

    .line 249
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->c:J

    .line 250
    invoke-static {}, Lcom/mixpanel/android/mpmetrics/a;->d()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/mixpanel/android/mpmetrics/a$b$a;->removeMessages(I)V

    move v0, v2

    .line 305
    :goto_0
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    iget-object v1, v1, Lcom/mixpanel/android/mpmetrics/a$b;->a:Lcom/mixpanel/android/mpmetrics/a;

    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/a;->b(Lcom/mixpanel/android/mpmetrics/a;)Lcom/mixpanel/android/mpmetrics/t;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/t;->a()I

    move-result v1

    if-lt v0, v1, :cond_b

    .line 306
    const-string v0, "Flushing queue due to bulk upload limit"

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/a;->a(Ljava/lang/String;)V

    .line 307
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/a$b;->a(Lcom/mixpanel/android/mpmetrics/a$b;)V

    .line 308
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->b:Lcom/mixpanel/android/mpmetrics/u;

    invoke-direct {p0, v0}, Lcom/mixpanel/android/mpmetrics/a$b$a;->a(Lcom/mixpanel/android/mpmetrics/u;)V

    .line 332
    :cond_1
    :goto_1
    return-void

    .line 252
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/mixpanel/android/mpmetrics/a;->e()I

    move-result v1

    if-ne v0, v1, :cond_3

    .line 253
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    .line 254
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Setting fallback to "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/a;->a(Ljava/lang/String;)V

    .line 255
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->d:Z

    move v0, v2

    .line 256
    goto :goto_0

    .line 257
    :cond_3
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/mixpanel/android/mpmetrics/a;->f()I

    move-result v1

    if-ne v0, v1, :cond_4

    .line 258
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lorg/json/JSONObject;

    .line 260
    const-string v1, "Queuing people record for sending later"

    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/a;->a(Ljava/lang/String;)V

    .line 261
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "    "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/a;->a(Ljava/lang/String;)V

    .line 263
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->b:Lcom/mixpanel/android/mpmetrics/u;

    sget-object v2, Lcom/mixpanel/android/mpmetrics/u$b;->b:Lcom/mixpanel/android/mpmetrics/u$b;

    invoke-virtual {v1, v0, v2}, Lcom/mixpanel/android/mpmetrics/u;->a(Lorg/json/JSONObject;Lcom/mixpanel/android/mpmetrics/u$b;)I

    move-result v0

    goto :goto_0

    .line 265
    :cond_4
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/mixpanel/android/mpmetrics/a;->g()I

    move-result v1

    if-ne v0, v1, :cond_5

    .line 266
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/mixpanel/android/mpmetrics/a$a;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_3

    .line 268
    :try_start_1
    invoke-direct {p0, v0}, Lcom/mixpanel/android/mpmetrics/a$b$a;->a(Lcom/mixpanel/android/mpmetrics/a$a;)Lorg/json/JSONObject;

    move-result-object v1

    .line 269
    const-string v3, "Queuing event for sending later"

    invoke-static {v3}, Lcom/mixpanel/android/mpmetrics/a;->a(Ljava/lang/String;)V

    .line 270
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "    "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/mixpanel/android/mpmetrics/a;->a(Ljava/lang/String;)V

    .line 271
    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->b:Lcom/mixpanel/android/mpmetrics/u;

    sget-object v4, Lcom/mixpanel/android/mpmetrics/u$b;->a:Lcom/mixpanel/android/mpmetrics/u$b;

    invoke-virtual {v3, v1, v4}, Lcom/mixpanel/android/mpmetrics/u;->a(Lorg/json/JSONObject;Lcom/mixpanel/android/mpmetrics/u$b;)I
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_3

    move-result v0

    goto/16 :goto_0

    .line 272
    :catch_0
    move-exception v1

    .line 273
    :try_start_2
    const-string v3, "MixpanelAPI"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Exception tracking event "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/a$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move v0, v2

    .line 275
    goto/16 :goto_0

    .line 276
    :cond_5
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/mixpanel/android/mpmetrics/a;->d()I

    move-result v1

    if-ne v0, v1, :cond_6

    .line 277
    const-string v0, "Flushing queue due to scheduled or forced flush"

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/a;->a(Ljava/lang/String;)V

    .line 278
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/a$b;->a(Lcom/mixpanel/android/mpmetrics/a$b;)V

    .line 279
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->e:Lcom/mixpanel/android/mpmetrics/g;

    invoke-static {}, Lcom/mixpanel/android/mpmetrics/a;->b()Lcom/mixpanel/android/mpmetrics/ae;

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/g;->a()V

    .line 280
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->b:Lcom/mixpanel/android/mpmetrics/u;

    invoke-direct {p0, v0}, Lcom/mixpanel/android/mpmetrics/a$b$a;->a(Lcom/mixpanel/android/mpmetrics/u;)V

    move v0, v2

    goto/16 :goto_0

    .line 282
    :cond_6
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/mixpanel/android/mpmetrics/a;->h()I

    move-result v1

    if-ne v0, v1, :cond_7

    .line 283
    const-string v0, "Installing a check for surveys and in app notifications"

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/a;->a(Ljava/lang/String;)V

    .line 284
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/mixpanel/android/mpmetrics/h;

    .line 285
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->e:Lcom/mixpanel/android/mpmetrics/g;

    invoke-virtual {v1, v0}, Lcom/mixpanel/android/mpmetrics/g;->a(Lcom/mixpanel/android/mpmetrics/h;)V

    .line 286
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->e:Lcom/mixpanel/android/mpmetrics/g;

    invoke-static {}, Lcom/mixpanel/android/mpmetrics/a;->b()Lcom/mixpanel/android/mpmetrics/ae;

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/g;->a()V

    move v0, v2

    .line 287
    goto/16 :goto_0

    .line 288
    :cond_7
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/mixpanel/android/mpmetrics/a;->i()I

    move-result v1

    if-ne v0, v1, :cond_9

    .line 289
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_3

    .line 290
    :try_start_3
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    iget-object v1, v1, Lcom/mixpanel/android/mpmetrics/a$b;->a:Lcom/mixpanel/android/mpmetrics/a;

    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/a;->a(Lcom/mixpanel/android/mpmetrics/a;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result v1

    if-eqz v1, :cond_8

    move v0, v2

    goto/16 :goto_0

    :cond_8
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    iget-object v1, v1, Lcom/mixpanel/android/mpmetrics/a$b;->a:Lcom/mixpanel/android/mpmetrics/a;

    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/a;->a(Lcom/mixpanel/android/mpmetrics/a;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/gcm/GoogleCloudMessaging;->getInstance(Landroid/content/Context;)Lcom/google/android/gms/gcm/GoogleCloudMessaging;

    move-result-object v1

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    invoke-virtual {v1, v3}, Lcom/google/android/gms/gcm/GoogleCloudMessaging;->register([Ljava/lang/String;)Ljava/lang/String;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_3

    move-result-object v0

    :try_start_4
    new-instance v1, Lcom/mixpanel/android/mpmetrics/b;

    invoke-direct {v1, p0, v0}, Lcom/mixpanel/android/mpmetrics/b;-><init>(Lcom/mixpanel/android/mpmetrics/a$b$a;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/v;->a(Lcom/mixpanel/android/mpmetrics/v$a;)V

    move v0, v2

    .line 291
    goto/16 :goto_0

    .line 290
    :catch_1
    move-exception v0

    move v0, v2

    goto/16 :goto_0

    :catch_2
    move-exception v0

    const-string v0, "MixpanelAPI"

    const-string v1, "Google play services were not part of this build, push notifications cannot be registered or delivered"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move v0, v2

    goto/16 :goto_0

    .line 292
    :cond_9
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/mixpanel/android/mpmetrics/a;->j()I

    move-result v1

    if-ne v0, v1, :cond_a

    .line 293
    const-string v0, "MixpanelAPI"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Worker received a hard kill. Dumping all events and force-killing. Thread id "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getId()J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 294
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/a$b;->b(Lcom/mixpanel/android/mpmetrics/a$b;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_3

    .line 295
    :try_start_5
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->b:Lcom/mixpanel/android/mpmetrics/u;

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/u;->a()V

    .line 296
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/a$b;->c(Lcom/mixpanel/android/mpmetrics/a$b;)Landroid/os/Handler;

    .line 297
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->quit()V

    .line 298
    monitor-exit v1

    move v0, v2

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw v0
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_3

    .line 321
    :catch_3
    move-exception v0

    .line 322
    const-string v1, "MixpanelAPI"

    const-string v2, "Worker threw an unhandled exception"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 323
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/a$b;->b(Lcom/mixpanel/android/mpmetrics/a$b;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 324
    :try_start_7
    iget-object v2, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->a:Lcom/mixpanel/android/mpmetrics/a$b;

    invoke-static {v2}, Lcom/mixpanel/android/mpmetrics/a$b;->c(Lcom/mixpanel/android/mpmetrics/a$b;)Landroid/os/Handler;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 326
    :try_start_8
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/Looper;->quit()V

    .line 327
    const-string v2, "MixpanelAPI"

    const-string v3, "Mixpanel will not process any more analytics messages"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 331
    :goto_2
    :try_start_9
    monitor-exit v1

    goto/16 :goto_1

    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    throw v0

    .line 300
    :cond_a
    :try_start_a
    const-string v0, "MixpanelAPI"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Unexpected message received by Mixpanel worker: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move v0, v2

    goto/16 :goto_0

    .line 309
    :cond_b
    if-lez v0, :cond_1

    invoke-static {}, Lcom/mixpanel/android/mpmetrics/a;->d()I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/mixpanel/android/mpmetrics/a$b$a;->hasMessages(I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 316
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Queue depth "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " - Adding flush in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->c:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/a;->a(Ljava/lang/String;)V

    .line 317
    iget-wide v0, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->c:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    .line 318
    invoke-static {}, Lcom/mixpanel/android/mpmetrics/a;->d()I

    move-result v0

    iget-wide v2, p0, Lcom/mixpanel/android/mpmetrics/a$b$a;->c:J

    invoke-virtual {p0, v0, v2, v3}, Lcom/mixpanel/android/mpmetrics/a$b$a;->sendEmptyMessageDelayed(IJ)Z
    :try_end_a
    .catch Ljava/lang/RuntimeException; {:try_start_a .. :try_end_a} :catch_3

    goto/16 :goto_1

    .line 328
    :catch_4
    move-exception v0

    .line 329
    :try_start_b
    const-string v2, "MixpanelAPI"

    const-string v3, "Could not halt looper"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    goto :goto_2
.end method
