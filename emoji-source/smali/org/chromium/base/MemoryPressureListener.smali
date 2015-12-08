.class public Lorg/chromium/base/MemoryPressureListener;
.super Ljava/lang/Object;
.source "MemoryPressureListener.java"


# static fields
.field private static final ACTION_LOW_MEMORY:Ljava/lang/String; = "org.chromium.base.ACTION_LOW_MEMORY"

.field private static final ACTION_TRIM_MEMORY:Ljava/lang/String; = "org.chromium.base.ACTION_TRIM_MEMORY"

.field private static final ACTION_TRIM_MEMORY_MODERATE:Ljava/lang/String; = "org.chromium.base.ACTION_TRIM_MEMORY_MODERATE"

.field private static final ACTION_TRIM_MEMORY_RUNNING_CRITICAL:Ljava/lang/String; = "org.chromium.base.ACTION_TRIM_MEMORY_RUNNING_CRITICAL"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(I)V
    .locals 0
    .param p0, "x0"    # I

    .prologue
    .line 18
    invoke-static {p0}, Lorg/chromium/base/MemoryPressureListener;->nativeOnMemoryPressure(I)V

    return-void
.end method

.method public static handleDebugIntent(Landroid/app/Activity;Ljava/lang/String;)Z
    .locals 1
    .param p0, "activity"    # Landroid/app/Activity;
    .param p1, "action"    # Ljava/lang/String;

    .prologue
    .line 70
    const-string v0, "org.chromium.base.ACTION_LOW_MEMORY"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 71
    invoke-static {p0}, Lorg/chromium/base/MemoryPressureListener;->simulateLowMemoryPressureSignal(Landroid/app/Activity;)V

    .line 83
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0

    .line 72
    :cond_0
    const-string v0, "org.chromium.base.ACTION_TRIM_MEMORY"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 73
    const/16 v0, 0x50

    invoke-static {p0, v0}, Lorg/chromium/base/MemoryPressureListener;->simulateTrimMemoryPressureSignal(Landroid/app/Activity;I)V

    goto :goto_0

    .line 74
    :cond_1
    const-string v0, "org.chromium.base.ACTION_TRIM_MEMORY_RUNNING_CRITICAL"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 75
    const/16 v0, 0x3c

    invoke-static {p0, v0}, Lorg/chromium/base/MemoryPressureListener;->simulateTrimMemoryPressureSignal(Landroid/app/Activity;I)V

    goto :goto_0

    .line 76
    :cond_2
    const-string v0, "org.chromium.base.ACTION_TRIM_MEMORY_MODERATE"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 77
    const/16 v0, 0xf

    invoke-static {p0, v0}, Lorg/chromium/base/MemoryPressureListener;->simulateTrimMemoryPressureSignal(Landroid/app/Activity;I)V

    goto :goto_0

    .line 80
    :cond_3
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public static maybeNotifyMemoryPresure(I)V
    .locals 1
    .param p0, "level"    # I

    .prologue
    .line 87
    const/16 v0, 0x50

    if-lt p0, v0, :cond_1

    .line 88
    const/4 v0, 0x2

    invoke-static {v0}, Lorg/chromium/base/MemoryPressureListener;->nativeOnMemoryPressure(I)V

    .line 95
    :cond_0
    :goto_0
    return-void

    .line 89
    :cond_1
    const/16 v0, 0x28

    if-ge p0, v0, :cond_2

    const/16 v0, 0xf

    if-ne p0, v0, :cond_0

    .line 93
    :cond_2
    const/4 v0, 0x0

    invoke-static {v0}, Lorg/chromium/base/MemoryPressureListener;->nativeOnMemoryPressure(I)V

    goto :goto_0
.end method

.method private static native nativeOnMemoryPressure(I)V
.end method

.method private static registerSystemCallback(Landroid/content/Context;)V
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 47
    new-instance v0, Lorg/chromium/base/MemoryPressureListener$1;

    invoke-direct {v0}, Lorg/chromium/base/MemoryPressureListener$1;-><init>()V

    invoke-virtual {p0, v0}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 63
    return-void
.end method

.method private static simulateLowMemoryPressureSignal(Landroid/app/Activity;)V
    .locals 1
    .param p0, "activity"    # Landroid/app/Activity;

    .prologue
    .line 101
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Application;->onLowMemory()V

    .line 102
    invoke-virtual {p0}, Landroid/app/Activity;->onLowMemory()V

    .line 103
    return-void
.end method

.method private static simulateTrimMemoryPressureSignal(Landroid/app/Activity;I)V
    .locals 1
    .param p0, "activity"    # Landroid/app/Activity;
    .param p1, "level"    # I

    .prologue
    .line 109
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/app/Application;->onTrimMemory(I)V

    .line 110
    invoke-virtual {p0, p1}, Landroid/app/Activity;->onTrimMemory(I)V

    .line 111
    return-void
.end method
