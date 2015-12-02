.class public Lcom/facebook/common/hardware/k;
.super Ljava/lang/Object;
.source "OrcaNetworkManager.java"

# interfaces
.implements Lcom/facebook/base/c;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Landroid/net/ConnectivityManager;

.field private final d:Landroid/net/wifi/WifiManager;

.field private final e:Lcom/facebook/base/broadcast/a;

.field private f:Lcom/facebook/common/hardware/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    const-class v0, Lcom/facebook/common/hardware/k;

    sput-object v0, Lcom/facebook/common/hardware/k;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/net/ConnectivityManager;Landroid/net/wifi/WifiManager;Lcom/facebook/base/broadcast/a;)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/facebook/common/hardware/k;->b:Landroid/content/Context;

    .line 42
    iput-object p2, p0, Lcom/facebook/common/hardware/k;->c:Landroid/net/ConnectivityManager;

    .line 43
    iput-object p3, p0, Lcom/facebook/common/hardware/k;->d:Landroid/net/wifi/WifiManager;

    .line 44
    iput-object p4, p0, Lcom/facebook/common/hardware/k;->e:Lcom/facebook/base/broadcast/a;

    .line 45
    return-void
.end method

.method static synthetic a(Lcom/facebook/common/hardware/k;)Landroid/net/ConnectivityManager;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/facebook/common/hardware/k;->c:Landroid/net/ConnectivityManager;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/common/hardware/k;)Lcom/facebook/base/broadcast/a;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/facebook/common/hardware/k;->e:Lcom/facebook/base/broadcast/a;

    return-object v0
.end method

.method static synthetic e()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 21
    sget-object v0, Lcom/facebook/common/hardware/k;->a:Ljava/lang/Class;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 4

    .prologue
    .line 49
    new-instance v0, Lcom/facebook/common/hardware/m;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/common/hardware/m;-><init>(Lcom/facebook/common/hardware/k;Lcom/facebook/common/hardware/l;)V

    iput-object v0, p0, Lcom/facebook/common/hardware/k;->f:Lcom/facebook/common/hardware/m;

    .line 50
    iget-object v0, p0, Lcom/facebook/common/hardware/k;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/facebook/common/hardware/k;->f:Lcom/facebook/common/hardware/m;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 52
    return-void
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/common/hardware/k;->c:Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 60
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Landroid/net/NetworkInfo;
    .locals 1

    .prologue
    .line 68
    invoke-virtual {p0}, Lcom/facebook/common/hardware/k;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/common/hardware/k;->c:Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()I
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/facebook/common/hardware/k;->d:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v0

    .line 77
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getRssi()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/high16 v0, -0x80000000

    goto :goto_0
.end method
