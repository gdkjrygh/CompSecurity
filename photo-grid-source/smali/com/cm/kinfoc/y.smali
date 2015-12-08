.class public final Lcom/cm/kinfoc/y;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;)I
    .locals 4

    .prologue
    const/4 v2, 0x1

    .line 394
    if-nez p0, :cond_0

    .line 468
    :goto_0
    return v2

    .line 397
    :cond_0
    const/4 v1, 0x0

    .line 400
    :try_start_0
    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 402
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 403
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 404
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    move-result v3

    .line 405
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getSubtype()I

    move-result v0

    .line 406
    if-ne v3, v2, :cond_1

    .line 407
    invoke-static {p0}, Lcom/cm/kinfoc/y;->c(Landroid/content/Context;)Z
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    if-eqz v0, :cond_3

    .line 408
    const/4 v2, 0x2

    goto :goto_0

    .line 410
    :cond_1
    if-nez v3, :cond_2

    .line 411
    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 422
    :pswitch_0
    const/4 v2, 0x4

    .line 423
    goto :goto_0

    .line 439
    :pswitch_1
    const/16 v2, 0x8

    .line 440
    goto :goto_0

    .line 443
    :pswitch_2
    const/16 v2, 0x10

    .line 444
    goto :goto_0

    :cond_2
    move v0, v2

    :goto_1
    move v2, v0

    .line 467
    goto :goto_0

    .line 464
    :catch_0
    move-exception v0

    const/16 v2, 0x20

    .line 467
    goto :goto_0

    .line 466
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move v2, v1

    goto :goto_0

    :cond_3
    move v0, v1

    goto :goto_1

    .line 411
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 149
    invoke-static {p0}, Lcom/cm/kinfoc/ag;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 151
    if-eqz p0, :cond_2

    .line 152
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    .line 154
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 155
    :goto_1
    rsub-int/lit8 v4, v0, 0x20

    if-ge v1, v4, :cond_0

    .line 156
    const/16 v4, 0x30

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 155
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 158
    :cond_0
    if-eqz v2, :cond_1

    .line 159
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    :cond_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 518
    if-nez p0, :cond_0

    .line 532
    :goto_0
    return v1

    .line 521
    :cond_0
    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 524
    :try_start_0
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 525
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_1

    .line 526
    const/4 v0, 0x1

    :goto_1
    move v1, v0

    .line 532
    goto :goto_0

    :catch_0
    move-exception v0

    :cond_1
    move v0, v1

    goto :goto_1
.end method

.method private static c(Landroid/content/Context;)Z
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 496
    if-nez p0, :cond_1

    .line 510
    :cond_0
    :goto_0
    return v2

    .line 499
    :cond_1
    const-string v0, "wifi"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    .line 501
    const/4 v1, 0x0

    .line 503
    :try_start_0
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 506
    :goto_1
    if-nez v1, :cond_2

    move v1, v2

    .line 507
    :goto_2
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    .line 508
    const/4 v2, 0x1

    goto :goto_0

    .line 506
    :cond_2
    invoke-virtual {v1}, Landroid/net/wifi/WifiInfo;->getIpAddress()I

    move-result v1

    goto :goto_2

    :catch_0
    move-exception v3

    goto :goto_1
.end method
