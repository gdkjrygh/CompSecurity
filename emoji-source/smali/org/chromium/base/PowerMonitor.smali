.class public Lorg/chromium/base/PowerMonitor;
.super Ljava/lang/Object;
.source "PowerMonitor.java"

# interfaces
.implements Lorg/chromium/base/ApplicationStatus$ApplicationStateListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/base/PowerMonitor$LazyHolder;
    }
.end annotation

.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "base::android"
.end annotation


# static fields
.field private static final SUSPEND_DELAY_MS:J = 0xea60L

.field private static sInstance:Lorg/chromium/base/PowerMonitor;

.field private static final sSuspendTask:Ljava/lang/Runnable;


# instance fields
.field private final mHandler:Landroid/os/Handler;

.field private mIsBatteryPower:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 33
    new-instance v0, Lorg/chromium/base/PowerMonitor$1;

    invoke-direct {v0}, Lorg/chromium/base/PowerMonitor$1;-><init>()V

    sput-object v0, Lorg/chromium/base/PowerMonitor;->sSuspendTask:Ljava/lang/Runnable;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .prologue
    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lorg/chromium/base/PowerMonitor;->mHandler:Landroid/os/Handler;

    .line 64
    return-void
.end method

.method synthetic constructor <init>(Lorg/chromium/base/PowerMonitor$1;)V
    .locals 0
    .param p1, "x0"    # Lorg/chromium/base/PowerMonitor$1;

    .prologue
    .line 19
    invoke-direct {p0}, Lorg/chromium/base/PowerMonitor;-><init>()V

    return-void
.end method

.method static synthetic access$100()V
    .locals 0

    .prologue
    .line 19
    invoke-static {}, Lorg/chromium/base/PowerMonitor;->nativeOnMainActivitySuspended()V

    return-void
.end method

.method public static create(Landroid/content/Context;)V
    .locals 3
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 53
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 54
    sget-object v2, Lorg/chromium/base/PowerMonitor;->sInstance:Lorg/chromium/base/PowerMonitor;

    if-nez v2, :cond_0

    .line 55
    # getter for: Lorg/chromium/base/PowerMonitor$LazyHolder;->INSTANCE:Lorg/chromium/base/PowerMonitor;
    invoke-static {}, Lorg/chromium/base/PowerMonitor$LazyHolder;->access$200()Lorg/chromium/base/PowerMonitor;

    move-result-object v2

    sput-object v2, Lorg/chromium/base/PowerMonitor;->sInstance:Lorg/chromium/base/PowerMonitor;

    .line 56
    sget-object v2, Lorg/chromium/base/PowerMonitor;->sInstance:Lorg/chromium/base/PowerMonitor;

    invoke-static {v2}, Lorg/chromium/base/ApplicationStatus;->registerApplicationStateListener(Lorg/chromium/base/ApplicationStatus$ApplicationStateListener;)V

    .line 57
    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 58
    .local v1, "ifilter":Landroid/content/IntentFilter;
    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v0

    .line 59
    .local v0, "batteryStatusIntent":Landroid/content/Intent;
    invoke-static {v0}, Lorg/chromium/base/PowerMonitor;->onBatteryChargingChanged(Landroid/content/Intent;)V

    .line 61
    .end local v0    # "batteryStatusIntent":Landroid/content/Intent;
    .end local v1    # "ifilter":Landroid/content/IntentFilter;
    :cond_0
    return-void
.end method

.method public static createForTests(Landroid/content/Context;)V
    .locals 1
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 44
    # getter for: Lorg/chromium/base/PowerMonitor$LazyHolder;->INSTANCE:Lorg/chromium/base/PowerMonitor;
    invoke-static {}, Lorg/chromium/base/PowerMonitor$LazyHolder;->access$200()Lorg/chromium/base/PowerMonitor;

    move-result-object v0

    sput-object v0, Lorg/chromium/base/PowerMonitor;->sInstance:Lorg/chromium/base/PowerMonitor;

    .line 45
    return-void
.end method

.method private static isBatteryPower()Z
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 92
    sget-object v0, Lorg/chromium/base/PowerMonitor;->sInstance:Lorg/chromium/base/PowerMonitor;

    iget-boolean v0, v0, Lorg/chromium/base/PowerMonitor;->mIsBatteryPower:Z

    return v0
.end method

.method private static native nativeOnBatteryChargingChanged()V
.end method

.method private static native nativeOnMainActivityResumed()V
.end method

.method private static native nativeOnMainActivitySuspended()V
.end method

.method public static onBatteryChargingChanged(Landroid/content/Intent;)V
    .locals 4
    .param p0, "intent"    # Landroid/content/Intent;

    .prologue
    const/4 v1, 0x1

    .line 67
    sget-object v2, Lorg/chromium/base/PowerMonitor;->sInstance:Lorg/chromium/base/PowerMonitor;

    if-nez v2, :cond_0

    .line 77
    :goto_0
    return-void

    .line 72
    :cond_0
    const-string v2, "plugged"

    const/4 v3, -0x1

    invoke-virtual {p0, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 74
    .local v0, "chargePlug":I
    sget-object v2, Lorg/chromium/base/PowerMonitor;->sInstance:Lorg/chromium/base/PowerMonitor;

    const/4 v3, 0x2

    if-eq v0, v3, :cond_1

    if-eq v0, v1, :cond_1

    :goto_1
    iput-boolean v1, v2, Lorg/chromium/base/PowerMonitor;->mIsBatteryPower:Z

    .line 76
    invoke-static {}, Lorg/chromium/base/PowerMonitor;->nativeOnBatteryChargingChanged()V

    goto :goto_0

    .line 74
    :cond_1
    const/4 v1, 0x0

    goto :goto_1
.end method


# virtual methods
.method public onApplicationStateChange(I)V
    .locals 4
    .param p1, "newState"    # I

    .prologue
    .line 81
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 83
    iget-object v0, p0, Lorg/chromium/base/PowerMonitor;->mHandler:Landroid/os/Handler;

    sget-object v1, Lorg/chromium/base/PowerMonitor;->sSuspendTask:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 84
    invoke-static {}, Lorg/chromium/base/PowerMonitor;->nativeOnMainActivityResumed()V

    .line 88
    :cond_0
    :goto_0
    return-void

    .line 85
    :cond_1
    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 86
    iget-object v0, p0, Lorg/chromium/base/PowerMonitor;->mHandler:Landroid/os/Handler;

    sget-object v1, Lorg/chromium/base/PowerMonitor;->sSuspendTask:Ljava/lang/Runnable;

    const-wide/32 v2, 0xea60

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method
