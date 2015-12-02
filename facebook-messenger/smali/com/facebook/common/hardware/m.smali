.class Lcom/facebook/common/hardware/m;
.super Landroid/content/BroadcastReceiver;
.source "OrcaNetworkManager.java"


# instance fields
.field final synthetic a:Lcom/facebook/common/hardware/k;


# direct methods
.method private constructor <init>(Lcom/facebook/common/hardware/k;)V
    .locals 0

    .prologue
    .line 82
    iput-object p1, p0, Lcom/facebook/common/hardware/m;->a:Lcom/facebook/common/hardware/k;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/common/hardware/k;Lcom/facebook/common/hardware/l;)V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0, p1}, Lcom/facebook/common/hardware/m;-><init>(Lcom/facebook/common/hardware/k;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 85
    invoke-virtual {p0}, Lcom/facebook/common/hardware/m;->isInitialStickyBroadcast()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    invoke-static {}, Lcom/facebook/common/hardware/k;->e()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Ignoring the event. It is a sticky broadcast "

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 108
    :goto_0
    return-void

    .line 92
    :cond_0
    const-string v0, "networkInfo"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/NetworkInfo;

    .line 94
    const-string v0, "otherNetwork"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/NetworkInfo;

    .line 96
    const-string v0, "isFailover"

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 98
    const-string v0, "noConnectivity"

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 102
    iget-object v0, p0, Lcom/facebook/common/hardware/m;->a:Lcom/facebook/common/hardware/k;

    invoke-static {v0}, Lcom/facebook/common/hardware/k;->a(Lcom/facebook/common/hardware/k;)Landroid/net/ConnectivityManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 104
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 105
    :goto_1
    invoke-static {}, Lcom/facebook/common/hardware/k;->e()Ljava/lang/Class;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Connectivity changed: connected="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 107
    iget-object v0, p0, Lcom/facebook/common/hardware/m;->a:Lcom/facebook/common/hardware/k;

    invoke-static {v0}, Lcom/facebook/common/hardware/k;->b(Lcom/facebook/common/hardware/k;)Lcom/facebook/base/broadcast/a;

    move-result-object v0

    const-string v1, "com.facebook.orca.ACTION_NETWORK_CONNECTIVITY_CHANGED"

    invoke-virtual {v0, v1}, Lcom/facebook/base/broadcast/a;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move v0, v1

    .line 104
    goto :goto_1
.end method
