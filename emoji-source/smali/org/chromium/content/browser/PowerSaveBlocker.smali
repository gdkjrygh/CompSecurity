.class Lorg/chromium/content/browser/PowerSaveBlocker;
.super Ljava/lang/Object;
.source "PowerSaveBlocker.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static applyBlock(Lorg/chromium/ui/base/ViewAndroid;)V
    .locals 0
    .param p0, "view"    # Lorg/chromium/ui/base/ViewAndroid;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 13
    invoke-virtual {p0}, Lorg/chromium/ui/base/ViewAndroid;->incrementKeepScreenOnCount()V

    .line 14
    return-void
.end method

.method private static removeBlock(Lorg/chromium/ui/base/ViewAndroid;)V
    .locals 0
    .param p0, "view"    # Lorg/chromium/ui/base/ViewAndroid;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 18
    invoke-virtual {p0}, Lorg/chromium/ui/base/ViewAndroid;->decrementKeepScreenOnCount()V

    .line 19
    return-void
.end method
