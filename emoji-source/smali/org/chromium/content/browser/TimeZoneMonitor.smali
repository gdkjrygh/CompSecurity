.class Lorg/chromium/content/browser/TimeZoneMonitor;
.super Ljava/lang/Object;
.source "TimeZoneMonitor.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "content"
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "TimeZoneMonitor"


# instance fields
.field private final mAppContext:Landroid/content/Context;

.field private final mBroadcastReceiver:Landroid/content/BroadcastReceiver;

.field private final mFilter:Landroid/content/IntentFilter;

.field private mNativePtr:J


# direct methods
.method private constructor <init>(Landroid/content/Context;J)V
    .locals 4
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "nativePtr"    # J

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.TIMEZONE_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lorg/chromium/content/browser/TimeZoneMonitor;->mFilter:Landroid/content/IntentFilter;

    .line 25
    new-instance v0, Lorg/chromium/content/browser/TimeZoneMonitor$1;

    invoke-direct {v0, p0}, Lorg/chromium/content/browser/TimeZoneMonitor$1;-><init>(Lorg/chromium/content/browser/TimeZoneMonitor;)V

    iput-object v0, p0, Lorg/chromium/content/browser/TimeZoneMonitor;->mBroadcastReceiver:Landroid/content/BroadcastReceiver;

    .line 44
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lorg/chromium/content/browser/TimeZoneMonitor;->mAppContext:Landroid/content/Context;

    .line 45
    iput-wide p2, p0, Lorg/chromium/content/browser/TimeZoneMonitor;->mNativePtr:J

    .line 46
    iget-object v0, p0, Lorg/chromium/content/browser/TimeZoneMonitor;->mAppContext:Landroid/content/Context;

    iget-object v1, p0, Lorg/chromium/content/browser/TimeZoneMonitor;->mBroadcastReceiver:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lorg/chromium/content/browser/TimeZoneMonitor;->mFilter:Landroid/content/IntentFilter;

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 47
    return-void
.end method

.method static synthetic access$000(Lorg/chromium/content/browser/TimeZoneMonitor;)J
    .locals 2
    .param p0, "x0"    # Lorg/chromium/content/browser/TimeZoneMonitor;

    .prologue
    .line 20
    iget-wide v0, p0, Lorg/chromium/content/browser/TimeZoneMonitor;->mNativePtr:J

    return-wide v0
.end method

.method static synthetic access$100(Lorg/chromium/content/browser/TimeZoneMonitor;J)V
    .locals 1
    .param p0, "x0"    # Lorg/chromium/content/browser/TimeZoneMonitor;
    .param p1, "x1"    # J

    .prologue
    .line 20
    invoke-direct {p0, p1, p2}, Lorg/chromium/content/browser/TimeZoneMonitor;->nativeTimeZoneChangedFromJava(J)V

    return-void
.end method

.method static getInstance(Landroid/content/Context;J)Lorg/chromium/content/browser/TimeZoneMonitor;
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "nativePtr"    # J
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 51
    new-instance v0, Lorg/chromium/content/browser/TimeZoneMonitor;

    invoke-direct {v0, p0, p1, p2}, Lorg/chromium/content/browser/TimeZoneMonitor;-><init>(Landroid/content/Context;J)V

    return-object v0
.end method

.method private native nativeTimeZoneChangedFromJava(J)V
.end method


# virtual methods
.method stop()V
    .locals 2
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 59
    iget-object v0, p0, Lorg/chromium/content/browser/TimeZoneMonitor;->mAppContext:Landroid/content/Context;

    iget-object v1, p0, Lorg/chromium/content/browser/TimeZoneMonitor;->mBroadcastReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 60
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/chromium/content/browser/TimeZoneMonitor;->mNativePtr:J

    .line 61
    return-void
.end method
