.class Lcrittercism/android/bw$g;
.super Ljava/lang/Object;

# interfaces
.implements Lcrittercism/android/bv;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcrittercism/android/bw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "g"
.end annotation


# instance fields
.field private a:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>(I)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 573
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 571
    iput-object v4, p0, Lcrittercism/android/bw$g;->a:Lorg/json/JSONObject;

    .line 574
    invoke-static {}, Lcrittercism/android/bw;->b()Landroid/content/Context;

    .line 575
    invoke-static {}, Lcrittercism/android/bw;->c()Lcrittercism/android/bf;

    .line 577
    invoke-static {}, Lcrittercism/android/bw;->c()Lcrittercism/android/bf;

    move-result-object v0

    iget-boolean v0, v0, Lcrittercism/android/bf;->c:Z

    if-eqz v0, :cond_1

    .line 578
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lcrittercism/android/bw$g;->a:Lorg/json/JSONObject;

    .line 579
    invoke-static {}, Lcrittercism/android/bw;->b()Landroid/content/Context;

    move-result-object v0

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 580
    invoke-virtual {v0, p1}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v1

    .line 586
    if-eqz v1, :cond_3

    .line 587
    :try_start_0
    iget-object v0, p0, Lcrittercism/android/bw$g;->a:Lorg/json/JSONObject;

    const-string v2, "available"

    invoke-virtual {v1}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 588
    iget-object v0, p0, Lcrittercism/android/bw$g;->a:Lorg/json/JSONObject;

    const-string v2, "connected"

    invoke-virtual {v1}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 589
    invoke-virtual {v1}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    .line 591
    iget-object v0, p0, Lcrittercism/android/bw$g;->a:Lorg/json/JSONObject;

    const-string v2, "connecting"

    invoke-virtual {v1}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z

    move-result v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 593
    :cond_0
    iget-object v0, p0, Lcrittercism/android/bw$g;->a:Lorg/json/JSONObject;

    const-string v2, "failover"

    invoke-virtual {v1}, Landroid/net/NetworkInfo;->isFailover()Z

    move-result v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 594
    if-nez p1, :cond_2

    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, p0, Lcrittercism/android/bw$g;->a:Lorg/json/JSONObject;

    const-string v2, "roaming"

    invoke-virtual {v1}, Landroid/net/NetworkInfo;->isRoaming()Z

    move-result v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 602
    :cond_1
    :goto_1
    return-void

    .line 594
    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    .line 596
    :cond_3
    const/4 v0, 0x0

    iput-object v0, p0, Lcrittercism/android/bw$g;->a:Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 599
    :catch_0
    move-exception v0

    iput-object v4, p0, Lcrittercism/android/bw$g;->a:Lorg/json/JSONObject;

    .line 600
    invoke-static {}, Lcrittercism/android/dx;->c()V

    goto :goto_1
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 611
    const/4 v0, 0x0

    return-object v0
.end method

.method public final synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 570
    invoke-virtual {p0}, Lcrittercism/android/bw$g;->c()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public c()Lorg/json/JSONObject;
    .locals 1

    .prologue
    .line 616
    iget-object v0, p0, Lcrittercism/android/bw$g;->a:Lorg/json/JSONObject;

    return-object v0
.end method
