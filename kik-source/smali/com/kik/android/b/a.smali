.class public final Lcom/kik/android/b/a;
.super Lcom/kik/g/ao;
.source "SourceFile"


# static fields
.field private static a:Ljava/util/concurrent/ScheduledExecutorService;

.field private static final b:Lorg/c/b;

.field private static c:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field private d:Landroid/os/PowerManager$WakeLock;

.field private e:Landroid/net/wifi/WifiManager$WifiLock;

.field private final f:Ljava/lang/String;

.field private final g:Landroid/net/ConnectivityManager;

.field private final h:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private i:Landroid/os/PowerManager;

.field private j:Landroid/content/Context;

.field private final k:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 39
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    sput-object v0, Lcom/kik/android/b/a;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 40
    const-string v0, "KikWakeLock"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lcom/kik/android/b/a;->b:Lorg/c/b;

    .line 41
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lcom/kik/android/b/a;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 45
    invoke-direct {p0}, Lcom/kik/g/ao;-><init>()V

    .line 104
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/kik/android/b/a;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 167
    new-instance v0, Lcom/kik/android/b/c;

    invoke-direct {v0, p0}, Lcom/kik/android/b/c;-><init>(Lcom/kik/android/b/a;)V

    iput-object v0, p0, Lcom/kik/android/b/a;->k:Landroid/content/BroadcastReceiver;

    .line 46
    iput-object p2, p0, Lcom/kik/android/b/a;->f:Ljava/lang/String;

    .line 47
    iput-object p1, p0, Lcom/kik/android/b/a;->j:Landroid/content/Context;

    .line 48
    const-string v0, "power"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    iput-object v0, p0, Lcom/kik/android/b/a;->i:Landroid/os/PowerManager;

    .line 50
    iget-object v0, p0, Lcom/kik/android/b/a;->i:Landroid/os/PowerManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p2}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/android/b/a;->d:Landroid/os/PowerManager$WakeLock;

    .line 54
    iget-object v0, p0, Lcom/kik/android/b/a;->d:Landroid/os/PowerManager$WakeLock;

    if-eqz v0, :cond_0

    .line 55
    iget-object v0, p0, Lcom/kik/android/b/a;->d:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0, v2}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    .line 58
    :cond_0
    const-string v0, "wifi"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    .line 60
    const/4 v1, 0x3

    invoke-virtual {v0, v1, p2}, Landroid/net/wifi/WifiManager;->createWifiLock(ILjava/lang/String;)Landroid/net/wifi/WifiManager$WifiLock;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/android/b/a;->e:Landroid/net/wifi/WifiManager$WifiLock;

    .line 63
    iget-object v0, p0, Lcom/kik/android/b/a;->e:Landroid/net/wifi/WifiManager$WifiLock;

    if-eqz v0, :cond_1

    .line 64
    iget-object v0, p0, Lcom/kik/android/b/a;->e:Landroid/net/wifi/WifiManager$WifiLock;

    invoke-virtual {v0, v2}, Landroid/net/wifi/WifiManager$WifiLock;->setReferenceCounted(Z)V

    .line 68
    :cond_1
    const-string v0, "connectivity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    iput-object v0, p0, Lcom/kik/android/b/a;->g:Landroid/net/ConnectivityManager;

    .line 69
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;B)V
    .locals 0

    .prologue
    .line 73
    invoke-direct {p0, p1, p2}, Lcom/kik/android/b/a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 74
    return-void
.end method

.method static synthetic a(Lcom/kik/android/b/a;Z)V
    .locals 1

    .prologue
    .line 37
    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lcom/kik/android/b/a;->a(ZZ)V

    return-void
.end method

.method private a(ZZ)V
    .locals 4

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 136
    if-eqz p1, :cond_2

    if-nez p2, :cond_2

    move v0, v1

    .line 137
    :goto_0
    iget-object v3, p0, Lcom/kik/android/b/a;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v3

    .line 139
    if-nez v3, :cond_4

    if-eqz v0, :cond_4

    .line 140
    sget-object v0, Lcom/kik/android/b/a;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    .line 141
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    iget-object v0, p0, Lcom/kik/android/b/a;->e:Landroid/net/wifi/WifiManager$WifiLock;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/android/b/a;->g:Landroid/net/ConnectivityManager;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/kik/android/b/a;->g:Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    if-ne v0, v1, :cond_3

    :goto_1
    if-eqz v1, :cond_0

    .line 144
    iget-object v0, p0, Lcom/kik/android/b/a;->e:Landroid/net/wifi/WifiManager$WifiLock;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$WifiLock;->acquire()V

    .line 147
    :cond_0
    iget-object v0, p0, Lcom/kik/android/b/a;->d:Landroid/os/PowerManager$WakeLock;

    if-eqz v0, :cond_1

    .line 148
    iget-object v0, p0, Lcom/kik/android/b/a;->d:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 165
    :cond_1
    :goto_2
    return-void

    :cond_2
    move v0, v2

    .line 136
    goto :goto_0

    :cond_3
    move v1, v2

    .line 143
    goto :goto_1

    .line 152
    :cond_4
    if-eqz v3, :cond_1

    if-nez v0, :cond_1

    .line 153
    sget-object v0, Lcom/kik/android/b/a;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    .line 154
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 156
    iget-object v0, p0, Lcom/kik/android/b/a;->e:Landroid/net/wifi/WifiManager$WifiLock;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/kik/android/b/a;->e:Landroid/net/wifi/WifiManager$WifiLock;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$WifiLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 157
    iget-object v0, p0, Lcom/kik/android/b/a;->e:Landroid/net/wifi/WifiManager$WifiLock;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$WifiLock;->release()V

    .line 160
    :cond_5
    iget-object v0, p0, Lcom/kik/android/b/a;->d:Landroid/os/PowerManager$WakeLock;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/kik/android/b/a;->d:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 161
    iget-object v0, p0, Lcom/kik/android/b/a;->d:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    goto :goto_2
.end method

.method static synthetic c()Lorg/c/b;
    .locals 1

    .prologue
    .line 37
    sget-object v0, Lcom/kik/android/b/a;->b:Lorg/c/b;

    return-object v0
.end method


# virtual methods
.method public final a(J)Lcom/kik/g/ar;
    .locals 5

    .prologue
    .line 86
    invoke-virtual {p0}, Lcom/kik/android/b/a;->f()Lcom/kik/g/ar;

    move-result-object v0

    .line 87
    sget-object v1, Lcom/kik/android/b/a;->a:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lcom/kik/android/b/b;

    invoke-direct {v2, p0, v0}, Lcom/kik/android/b/b;-><init>(Lcom/kik/android/b/a;Lcom/kik/g/ar;)V

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v2, p1, p2, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 97
    return-object v0
.end method

.method protected final a()V
    .locals 3

    .prologue
    .line 112
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.SCREEN_ON"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 113
    const-string v1, "android.intent.action.SCREEN_OFF"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 114
    iget-object v1, p0, Lcom/kik/android/b/a;->j:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/android/b/a;->k:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 117
    const/4 v0, 0x1

    iget-object v1, p0, Lcom/kik/android/b/a;->i:Landroid/os/PowerManager;

    invoke-virtual {v1}, Landroid/os/PowerManager;->isScreenOn()Z

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/kik/android/b/a;->a(ZZ)V

    .line 119
    invoke-super {p0}, Lcom/kik/g/ao;->a()V

    .line 120
    return-void
.end method

.method protected final b()V
    .locals 2

    .prologue
    .line 125
    invoke-super {p0}, Lcom/kik/g/ao;->b()V

    .line 128
    iget-object v0, p0, Lcom/kik/android/b/a;->j:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/android/b/a;->k:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 131
    const/4 v0, 0x0

    iget-object v1, p0, Lcom/kik/android/b/a;->i:Landroid/os/PowerManager;

    invoke-virtual {v1}, Landroid/os/PowerManager;->isScreenOn()Z

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/kik/android/b/a;->a(ZZ)V

    .line 132
    return-void
.end method
