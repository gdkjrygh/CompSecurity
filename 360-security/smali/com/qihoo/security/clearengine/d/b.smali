.class public Lcom/qihoo/security/clearengine/d/b;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public static a(Landroid/content/Context;)I
    .locals 5

    .prologue
    const/4 v2, 0x2

    const/4 v1, 0x1

    .line 25
    const/4 v3, 0x0

    .line 27
    const-string/jumbo v0, "connectivity"

    .line 26
    invoke-static {p0, v0}, Lcom/qihoo/security/clearengine/d/b;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 28
    if-eqz v0, :cond_3

    .line 30
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 31
    if-eqz v0, :cond_3

    .line 33
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    move-result v4

    if-ne v4, v1, :cond_0

    move v0, v1

    .line 53
    :goto_0
    return v0

    .line 37
    :cond_0
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    move-result v4

    if-nez v4, :cond_3

    .line 39
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getSubtype()I

    move-result v0

    .line 40
    if-eq v0, v2, :cond_1

    if-eq v0, v1, :cond_1

    .line 41
    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    :cond_1
    move v0, v2

    .line 44
    goto :goto_0

    .line 47
    :cond_2
    const/4 v0, 0x3

    goto :goto_0

    :cond_3
    move v0, v3

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 19
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 63
    .line 64
    const-string/jumbo v0, "connectivity"

    .line 63
    invoke-static {p0, v0}, Lcom/qihoo/security/clearengine/d/b;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 65
    if-eqz v0, :cond_1

    .line 67
    const/4 v3, 0x1

    :try_start_0
    invoke-virtual {v0, v3}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v0

    .line 68
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    .line 73
    :goto_0
    return v0

    :cond_0
    move v0, v2

    .line 68
    goto :goto_0

    .line 69
    :catch_0
    move-exception v0

    :cond_1
    move v0, v2

    .line 73
    goto :goto_0
.end method
