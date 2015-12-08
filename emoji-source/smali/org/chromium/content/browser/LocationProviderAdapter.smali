.class public Lorg/chromium/content/browser/LocationProviderAdapter;
.super Ljava/lang/Object;
.source "LocationProviderAdapter.java"


# annotations
.annotation build Lorg/chromium/base/VisibleForTesting;
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private mImpl:Lorg/chromium/content/browser/LocationProviderFactory$LocationProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    const-class v0, Lorg/chromium/content/browser/LocationProviderAdapter;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/content/browser/LocationProviderAdapter;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    invoke-static {p1}, Lorg/chromium/content/browser/LocationProviderFactory;->get(Landroid/content/Context;)Lorg/chromium/content/browser/LocationProviderFactory$LocationProvider;

    move-result-object v0

    iput-object v0, p0, Lorg/chromium/content/browser/LocationProviderAdapter;->mImpl:Lorg/chromium/content/browser/LocationProviderFactory$LocationProvider;

    .line 31
    return-void
.end method

.method static synthetic access$000(Lorg/chromium/content/browser/LocationProviderAdapter;)Lorg/chromium/content/browser/LocationProviderFactory$LocationProvider;
    .locals 1
    .param p0, "x0"    # Lorg/chromium/content/browser/LocationProviderAdapter;

    .prologue
    .line 24
    iget-object v0, p0, Lorg/chromium/content/browser/LocationProviderAdapter;->mImpl:Lorg/chromium/content/browser/LocationProviderFactory$LocationProvider;

    return-object v0
.end method

.method static create(Landroid/content/Context;)Lorg/chromium/content/browser/LocationProviderAdapter;
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 35
    new-instance v0, Lorg/chromium/content/browser/LocationProviderAdapter;

    invoke-direct {v0, p0}, Lorg/chromium/content/browser/LocationProviderAdapter;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method private static native nativeNewErrorAvailable(Ljava/lang/String;)V
.end method

.method private static native nativeNewLocationAvailable(DDDZDZDZDZD)V
.end method

.method public static newErrorAvailable(Ljava/lang/String;)V
    .locals 0
    .param p0, "message"    # Ljava/lang/String;

    .prologue
    .line 88
    invoke-static {p0}, Lorg/chromium/content/browser/LocationProviderAdapter;->nativeNewErrorAvailable(Ljava/lang/String;)V

    .line 89
    return-void
.end method

.method public static newLocationAvailable(DDDZDZDZDZD)V
    .locals 0
    .param p0, "latitude"    # D
    .param p2, "longitude"    # D
    .param p4, "timestamp"    # D
    .param p6, "hasAltitude"    # Z
    .param p7, "altitude"    # D
    .param p9, "hasAccuracy"    # Z
    .param p10, "accuracy"    # D
    .param p12, "hasHeading"    # Z
    .param p13, "heading"    # D
    .param p15, "hasSpeed"    # Z
    .param p16, "speed"    # D

    .prologue
    .line 83
    invoke-static/range {p0 .. p17}, Lorg/chromium/content/browser/LocationProviderAdapter;->nativeNewLocationAvailable(DDDZDZDZDZD)V

    .line 85
    return-void
.end method


# virtual methods
.method public isRunning()Z
    .locals 1

    .prologue
    .line 74
    sget-boolean v0, Lorg/chromium/content/browser/LocationProviderAdapter;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-static {}, Lorg/chromium/base/ThreadUtils;->runningOnUiThread()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 75
    :cond_0
    iget-object v0, p0, Lorg/chromium/content/browser/LocationProviderAdapter;->mImpl:Lorg/chromium/content/browser/LocationProviderFactory$LocationProvider;

    invoke-interface {v0}, Lorg/chromium/content/browser/LocationProviderFactory$LocationProvider;->isRunning()Z

    move-result v0

    return v0
.end method

.method public start(Z)Z
    .locals 3
    .param p1, "gpsEnabled"    # Z
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 45
    new-instance v0, Ljava/util/concurrent/FutureTask;

    new-instance v1, Lorg/chromium/content/browser/LocationProviderAdapter$1;

    invoke-direct {v1, p0, p1}, Lorg/chromium/content/browser/LocationProviderAdapter$1;-><init>(Lorg/chromium/content/browser/LocationProviderAdapter;Z)V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    .line 51
    .local v0, "task":Ljava/util/concurrent/FutureTask;, "Ljava/util/concurrent/FutureTask<Ljava/lang/Void;>;"
    invoke-static {v0}, Lorg/chromium/base/ThreadUtils;->runOnUiThread(Ljava/util/concurrent/FutureTask;)Ljava/util/concurrent/FutureTask;

    .line 52
    const/4 v1, 0x1

    return v1
.end method

.method public stop()V
    .locals 3
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 60
    new-instance v0, Ljava/util/concurrent/FutureTask;

    new-instance v1, Lorg/chromium/content/browser/LocationProviderAdapter$2;

    invoke-direct {v1, p0}, Lorg/chromium/content/browser/LocationProviderAdapter$2;-><init>(Lorg/chromium/content/browser/LocationProviderAdapter;)V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    .line 66
    .local v0, "task":Ljava/util/concurrent/FutureTask;, "Ljava/util/concurrent/FutureTask<Ljava/lang/Void;>;"
    invoke-static {v0}, Lorg/chromium/base/ThreadUtils;->runOnUiThread(Ljava/util/concurrent/FutureTask;)Ljava/util/concurrent/FutureTask;

    .line 67
    return-void
.end method
