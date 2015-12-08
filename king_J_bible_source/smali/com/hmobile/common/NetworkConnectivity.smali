.class public Lcom/hmobile/common/NetworkConnectivity;
.super Ljava/lang/Object;
.source "NetworkConnectivity.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static isConnected()Z
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 14
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->getContext()Landroid/content/Context;

    move-result-object v4

    .line 15
    const-string v5, "connectivity"

    invoke-virtual {v4, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 13
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 16
    .local v0, "cm":Landroid/net/ConnectivityManager;
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v2

    .line 18
    .local v2, "netInfo":Landroid/net/NetworkInfo;
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/net/NetworkInfo;->isConnected()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v4

    if-eqz v4, :cond_0

    .line 19
    const/4 v3, 0x1

    .line 24
    .end local v2    # "netInfo":Landroid/net/NetworkInfo;
    :cond_0
    :goto_0
    return v3

    .line 23
    :catch_0
    move-exception v1

    .line 24
    .local v1, "e":Ljava/lang/Exception;
    goto :goto_0
.end method
