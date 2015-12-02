.class public Lcom/facebook/e/c;
.super Ljava/lang/Object;
.source "DeviceConditionHelper.java"

# interfaces
.implements Lcom/facebook/base/c;


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/net/ConnectivityManager;

.field private final c:Lcom/facebook/common/time/a;

.field private final d:Lcom/facebook/prefs/shared/d;

.field private e:Lcom/facebook/c/k;

.field private f:Lcom/facebook/e/g;

.field private g:J

.field private h:Lcom/facebook/prefs/shared/f;

.field private i:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/net/ConnectivityManager;Lcom/facebook/common/time/a;Lcom/facebook/prefs/shared/d;)V
    .locals 2

    .prologue
    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    sget-object v0, Lcom/facebook/e/g;->WIFI_UNKNOWN:Lcom/facebook/e/g;

    iput-object v0, p0, Lcom/facebook/e/c;->f:Lcom/facebook/e/g;

    .line 57
    iput-object p1, p0, Lcom/facebook/e/c;->a:Landroid/content/Context;

    .line 58
    iput-object p2, p0, Lcom/facebook/e/c;->b:Landroid/net/ConnectivityManager;

    .line 59
    iput-object p3, p0, Lcom/facebook/e/c;->c:Lcom/facebook/common/time/a;

    .line 60
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/e/c;->g:J

    .line 61
    iput-object p4, p0, Lcom/facebook/e/c;->d:Lcom/facebook/prefs/shared/d;

    .line 62
    return-void
.end method

.method static synthetic a(Lcom/facebook/e/c;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/facebook/e/c;->e()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/e/c;Lcom/facebook/e/g;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0, p1}, Lcom/facebook/e/c;->a(Lcom/facebook/e/g;)V

    return-void
.end method

.method private declared-synchronized a(Lcom/facebook/e/g;)V
    .locals 1

    .prologue
    .line 229
    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/facebook/e/c;->f:Lcom/facebook/e/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 230
    monitor-exit p0

    return-void

    .line 229
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private d()V
    .locals 2

    .prologue
    .line 152
    invoke-virtual {p0}, Lcom/facebook/e/c;->c()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 157
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 158
    sget-object v0, Lcom/facebook/e/g;->WIFI_ON:Lcom/facebook/e/g;

    invoke-direct {p0, v0}, Lcom/facebook/e/c;->a(Lcom/facebook/e/g;)V

    .line 163
    :goto_0
    return-void

    .line 160
    :cond_0
    sget-object v0, Lcom/facebook/e/g;->WIFI_OFF:Lcom/facebook/e/g;

    invoke-direct {p0, v0}, Lcom/facebook/e/c;->a(Lcom/facebook/e/g;)V

    goto :goto_0
.end method

.method private e()V
    .locals 3

    .prologue
    .line 233
    iget-object v0, p0, Lcom/facebook/e/c;->d:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/prefs/shared/aj;->K:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/e/c;->i:Z

    .line 236
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .prologue
    .line 66
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 67
    const-string v1, "android.net.wifi.supplicant.CONNECTION_CHANGE"

    new-instance v2, Lcom/facebook/e/d;

    invoke-direct {v2, p0}, Lcom/facebook/e/d;-><init>(Lcom/facebook/e/c;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    const-string v1, "android.net.wifi.STATE_CHANGE"

    new-instance v2, Lcom/facebook/e/e;

    invoke-direct {v2, p0}, Lcom/facebook/e/e;-><init>(Lcom/facebook/e/c;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    new-instance v1, Lcom/facebook/c/k;

    invoke-direct {v1, v0}, Lcom/facebook/c/k;-><init>(Ljava/util/Map;)V

    iput-object v1, p0, Lcom/facebook/e/c;->e:Lcom/facebook/c/k;

    .line 93
    iget-object v0, p0, Lcom/facebook/e/c;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/facebook/e/c;->e:Lcom/facebook/c/k;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.net.wifi.supplicant.CONNECTION_CHANGE"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 96
    iget-object v0, p0, Lcom/facebook/e/c;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/facebook/e/c;->e:Lcom/facebook/c/k;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.net.wifi.STATE_CHANGE"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 99
    new-instance v0, Lcom/facebook/e/f;

    invoke-direct {v0, p0}, Lcom/facebook/e/f;-><init>(Lcom/facebook/e/c;)V

    iput-object v0, p0, Lcom/facebook/e/c;->h:Lcom/facebook/prefs/shared/f;

    .line 108
    iget-object v0, p0, Lcom/facebook/e/c;->d:Lcom/facebook/prefs/shared/d;

    iget-object v1, p0, Lcom/facebook/e/c;->h:Lcom/facebook/prefs/shared/f;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/f;)V

    .line 109
    invoke-direct {p0}, Lcom/facebook/e/c;->e()V

    .line 110
    return-void
.end method

.method public a(Z)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 130
    iget-boolean v1, p0, Lcom/facebook/e/c;->i:Z

    if-eqz v1, :cond_1

    .line 138
    :cond_0
    :goto_0
    return v0

    .line 134
    :cond_1
    if-nez p1, :cond_2

    iget-object v1, p0, Lcom/facebook/e/c;->f:Lcom/facebook/e/g;

    sget-object v2, Lcom/facebook/e/g;->WIFI_UNKNOWN:Lcom/facebook/e/g;

    if-ne v1, v2, :cond_3

    .line 135
    :cond_2
    invoke-direct {p0}, Lcom/facebook/e/c;->d()V

    .line 138
    :cond_3
    iget-object v1, p0, Lcom/facebook/e/c;->f:Lcom/facebook/e/g;

    sget-object v2, Lcom/facebook/e/g;->WIFI_ON:Lcom/facebook/e/g;

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 116
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/e/c;->a(Z)Z

    move-result v0

    return v0
.end method

.method public c()Landroid/net/NetworkInfo;
    .locals 2

    .prologue
    .line 142
    const/4 v0, 0x0

    .line 144
    :try_start_0
    iget-object v1, p0, Lcom/facebook/e/c;->b:Landroid/net/ConnectivityManager;

    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 148
    :goto_0
    return-object v0

    .line 145
    :catch_0
    move-exception v1

    goto :goto_0
.end method
