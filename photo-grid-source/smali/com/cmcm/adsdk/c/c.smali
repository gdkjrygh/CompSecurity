.class public final Lcom/cmcm/adsdk/c/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 38
    const-string v0, "content://telephony/carriers/preferapn"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/cmcm/adsdk/c/c;->a:Landroid/net/Uri;

    return-void
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 251
    if-eqz p0, :cond_1

    .line 252
    :try_start_0
    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 254
    if-eqz v0, :cond_1

    .line 255
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 257
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 259
    const-string v0, "NetUtil"

    const-string v2, "isNetworkAvailable"

    invoke-static {v0, v2}, Lcom/cmcm/adsdk/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    const/4 v0, 0x1

    .line 270
    :goto_0
    return v0

    .line 262
    :cond_0
    const-string v0, "NetUtil"

    const-string v2, "isNetworkAvailable fail"

    invoke-static {v0, v2}, Lcom/cmcm/adsdk/j;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move v0, v1

    .line 263
    goto :goto_0

    .line 267
    :catch_0
    move-exception v0

    .line 268
    const-string v2, "NetUtil"

    invoke-static {v2, v0}, Lcom/cmcm/adsdk/j;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    move v0, v1

    .line 270
    goto :goto_0
.end method
