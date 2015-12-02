.class public Lcom/qihoo/security/receiver/NetworkReceiver;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method private a(Landroid/content/Context;I)Landroid/net/NetworkInfo$State;
    .locals 1

    .prologue
    .line 105
    const-string/jumbo v0, "connectivity"

    invoke-static {p1, v0}, Lcom/qihoo/security/locale/language/b;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 107
    invoke-virtual {v0, p2}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v0

    .line 108
    if-nez v0, :cond_0

    .line 109
    sget-object v0, Landroid/net/NetworkInfo$State;->UNKNOWN:Landroid/net/NetworkInfo$State;

    .line 111
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    move-result-object v0

    goto :goto_0
.end method

.method private a(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 117
    invoke-static {p1}, Lcom/qihoo/security/appbox/core/a;->a(Landroid/content/Context;)V

    .line 120
    invoke-static {}, Lcom/qihoo/security/support/b;->a()V

    .line 121
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 35
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 39
    const-string/jumbo v1, "android.net.wifi.WIFI_STATE_CHANGED"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 40
    const-string/jumbo v0, "wifi_state"

    invoke-static {p2, v0, v2}, Lcom/qihoo360/mobilesafe/b/h;->a(Landroid/content/Intent;Ljava/lang/String;I)I

    move-result v0

    .line 44
    packed-switch v0, :pswitch_data_0

    .line 101
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 55
    :pswitch_1
    invoke-direct {p0, p1}, Lcom/qihoo/security/receiver/NetworkReceiver;->a(Landroid/content/Context;)V

    goto :goto_0

    .line 63
    :cond_1
    const-string/jumbo v1, "android.net.wifi.STATE_CHANGE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 66
    :try_start_0
    const-string/jumbo v0, "networkInfo"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 70
    :goto_1
    if-eqz v0, :cond_0

    .line 71
    check-cast v0, Landroid/net/NetworkInfo;

    .line 72
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result v0

    .line 76
    if-eqz v0, :cond_0

    goto :goto_0

    .line 67
    :catch_0
    move-exception v0

    .line 68
    const/4 v0, 0x0

    goto :goto_1

    .line 82
    :cond_2
    const-string/jumbo v1, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 83
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/receiver/NetworkReceiver;->a(Landroid/content/Context;I)Landroid/net/NetworkInfo$State;

    move-result-object v0

    .line 88
    sget-object v1, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;

    if-ne v1, v0, :cond_3

    .line 89
    invoke-direct {p0, p1}, Lcom/qihoo/security/receiver/NetworkReceiver;->a(Landroid/content/Context;)V

    .line 92
    :cond_3
    invoke-direct {p0, p1, v2}, Lcom/qihoo/security/receiver/NetworkReceiver;->a(Landroid/content/Context;I)Landroid/net/NetworkInfo$State;

    move-result-object v0

    .line 97
    sget-object v1, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;

    if-ne v1, v0, :cond_0

    .line 98
    invoke-direct {p0, p1}, Lcom/qihoo/security/receiver/NetworkReceiver;->a(Landroid/content/Context;)V

    goto :goto_0

    .line 44
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
