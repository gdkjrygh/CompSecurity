.class public Lcom/qihoo360/common/e/b;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public static a(Landroid/content/Context;)Z
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 26
    const-string/jumbo v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 27
    if-eqz v0, :cond_0

    .line 28
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getAllNetworkInfo()[Landroid/net/NetworkInfo;

    move-result-object v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    array-length v3, v2

    move v0, v1

    :goto_0
    if-lt v0, v3, :cond_1

    :cond_0
    move v0, v1

    .line 37
    :goto_1
    return v0

    .line 30
    :cond_1
    aget-object v4, v2, v0

    .line 31
    invoke-virtual {v4}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 32
    const/4 v0, 0x1

    goto :goto_1

    .line 30
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 42
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 43
    const-string/jumbo v1, "connectivity"

    .line 42
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 45
    const/4 v1, 0x0

    .line 47
    const/4 v2, 0x1

    :try_start_0
    invoke-virtual {v0, v2}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 55
    :goto_0
    if-eqz v0, :cond_0

    .line 56
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    .line 58
    :goto_1
    return v0

    .line 48
    :catch_0
    move-exception v0

    move-object v0, v1

    goto :goto_0

    .line 58
    :cond_0
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public static c(Landroid/content/Context;)B
    .locals 2

    .prologue
    const/16 v1, 0x9

    .line 64
    invoke-static {p0}, Lcom/qihoo360/common/e/b;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    .line 106
    :goto_0
    return v0

    .line 67
    :cond_0
    invoke-static {p0}, Lcom/qihoo360/common/e/b;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 68
    const/4 v0, 0x0

    goto :goto_0

    .line 71
    :cond_1
    const-string/jumbo v0, "phone"

    .line 70
    invoke-static {p0, v0}, Lcom/qihoo360/common/utils/ContextHelper;->getSystemService(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 72
    if-eqz v0, :cond_2

    .line 73
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkType()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :cond_2
    move v0, v1

    .line 106
    goto :goto_0

    .line 79
    :pswitch_0
    const/4 v0, 0x1

    goto :goto_0

    .line 99
    :pswitch_1
    const/4 v0, 0x2

    goto :goto_0

    .line 73
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
