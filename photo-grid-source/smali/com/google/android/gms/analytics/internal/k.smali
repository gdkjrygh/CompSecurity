.class Lcom/google/android/gms/analytics/internal/k;
.super Landroid/content/BroadcastReceiver;


# static fields
.field static final a:Ljava/lang/String;


# instance fields
.field private final b:Lcom/google/android/gms/analytics/internal/aa;

.field private c:Z

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/analytics/internal/k;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/analytics/internal/k;->a:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/analytics/internal/aa;)V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/bl;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/analytics/internal/k;->b:Lcom/google/android/gms/analytics/internal/aa;

    return-void
.end method

.method private e()V
    .locals 1

    .prologue
    .line 0
    .line 5000
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/k;->b:Lcom/google/android/gms/analytics/internal/aa;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/aa;->e()Lcom/google/android/gms/analytics/internal/j;

    .line 6000
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/k;->b:Lcom/google/android/gms/analytics/internal/aa;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/aa;->h()Lcom/google/android/gms/analytics/internal/s;

    .line 0
    return-void
.end method

.method private f()Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 0
    .line 11000
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/k;->b:Lcom/google/android/gms/analytics/internal/aa;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/aa;->a()Landroid/content/Context;

    move-result-object v0

    .line 0
    const-string v2, "connectivity"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    :try_start_0
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    move v0, v1

    goto :goto_0

    :catch_0
    move-exception v0

    move v0, v1

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 0
    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/k;->e()V

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/internal/k;->c:Z

    if-eqz v0, :cond_0

    :goto_0
    return-void

    .line 4000
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/k;->b:Lcom/google/android/gms/analytics/internal/aa;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/aa;->a()Landroid/content/Context;

    move-result-object v0

    .line 0
    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    const-string v1, "com.google.analytics.RADIO_POWERED"

    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/content/IntentFilter;->addCategory(Ljava/lang/String;)V

    invoke-virtual {v0, p0, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/k;->f()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/analytics/internal/k;->d:Z

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/k;->b:Lcom/google/android/gms/analytics/internal/aa;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/aa;->e()Lcom/google/android/gms/analytics/internal/j;

    move-result-object v0

    const-string v1, "Registering connectivity change receiver. Network connected"

    iget-boolean v2, p0, Lcom/google/android/gms/analytics/internal/k;->d:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/analytics/internal/j;->a(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/analytics/internal/k;->c:Z

    goto :goto_0
.end method

.method public final b()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 0
    .line 7000
    iget-boolean v0, p0, Lcom/google/android/gms/analytics/internal/k;->c:Z

    .line 0
    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/k;->b:Lcom/google/android/gms/analytics/internal/aa;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/aa;->e()Lcom/google/android/gms/analytics/internal/j;

    move-result-object v0

    const-string v1, "Unregistering connectivity change receiver"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/internal/j;->b(Ljava/lang/String;)V

    iput-boolean v2, p0, Lcom/google/android/gms/analytics/internal/k;->c:Z

    iput-boolean v2, p0, Lcom/google/android/gms/analytics/internal/k;->d:Z

    .line 8000
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/k;->b:Lcom/google/android/gms/analytics/internal/aa;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/aa;->a()Landroid/content/Context;

    move-result-object v0

    .line 0
    :try_start_0
    invoke-virtual {v0, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 9000
    iget-object v1, p0, Lcom/google/android/gms/analytics/internal/k;->b:Lcom/google/android/gms/analytics/internal/aa;

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/aa;->e()Lcom/google/android/gms/analytics/internal/j;

    move-result-object v1

    .line 0
    const-string v2, "Failed to unregister the network broadcast receiver"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/analytics/internal/j;->e(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public final c()V
    .locals 4

    .prologue
    .line 0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xa

    if-gt v0, v1, :cond_0

    :goto_0
    return-void

    .line 10000
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/k;->b:Lcom/google/android/gms/analytics/internal/aa;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/aa;->a()Landroid/content/Context;

    move-result-object v0

    .line 0
    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.google.analytics.RADIO_POWERED"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    sget-object v2, Lcom/google/android/gms/analytics/internal/k;->a:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->sendOrderedBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final d()Z
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/internal/k;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/k;->b:Lcom/google/android/gms/analytics/internal/aa;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/aa;->e()Lcom/google/android/gms/analytics/internal/j;

    move-result-object v0

    const-string v1, "Connectivity unknown. Receiver not registered"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/internal/j;->e(Ljava/lang/String;)V

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/analytics/internal/k;->d:Z

    return v0
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .prologue
    .line 0
    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/k;->e()V

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/analytics/internal/k;->b:Lcom/google/android/gms/analytics/internal/aa;

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/aa;->e()Lcom/google/android/gms/analytics/internal/j;

    move-result-object v1

    const-string v2, "NetworkBroadcastReceiver received action"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/analytics/internal/j;->a(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/k;->f()Z

    move-result v0

    iget-boolean v1, p0, Lcom/google/android/gms/analytics/internal/k;->d:Z

    if-eq v1, v0, :cond_0

    iput-boolean v0, p0, Lcom/google/android/gms/analytics/internal/k;->d:Z

    .line 1000
    iget-object v1, p0, Lcom/google/android/gms/analytics/internal/k;->b:Lcom/google/android/gms/analytics/internal/aa;

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/aa;->h()Lcom/google/android/gms/analytics/internal/s;

    move-result-object v1

    .line 0
    invoke-virtual {v1, v0}, Lcom/google/android/gms/analytics/internal/s;->a(Z)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const-string v1, "com.google.analytics.RADIO_POWERED"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v0, Lcom/google/android/gms/analytics/internal/k;->a:Ljava/lang/String;

    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2000
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/k;->b:Lcom/google/android/gms/analytics/internal/aa;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/aa;->h()Lcom/google/android/gms/analytics/internal/s;

    move-result-object v0

    .line 3000
    const-string v1, "Radio powered up"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/internal/s;->b(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/s;->c()V

    goto :goto_0

    .line 0
    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/analytics/internal/k;->b:Lcom/google/android/gms/analytics/internal/aa;

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/aa;->e()Lcom/google/android/gms/analytics/internal/j;

    move-result-object v1

    const-string v2, "NetworkBroadcastReceiver received unknown action"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/analytics/internal/j;->d(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0
.end method
