.class public Lorg/chromium/content/browser/InterstitialPageDelegateAndroid;
.super Ljava/lang/Object;
.source "InterstitialPageDelegateAndroid.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "content"
.end annotation


# instance fields
.field private mNativePtr:J


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2
    .param p1, "htmlContent"    # Ljava/lang/String;

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/InterstitialPageDelegateAndroid;->nativeInit(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lorg/chromium/content/browser/InterstitialPageDelegateAndroid;->mNativePtr:J

    .line 25
    return-void
.end method

.method private native nativeDontProceed(J)V
.end method

.method private native nativeInit(Ljava/lang/String;)J
.end method

.method private native nativeProceed(J)V
.end method

.method private onNativeDestroyed()V
    .locals 2
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 59
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/chromium/content/browser/InterstitialPageDelegateAndroid;->mNativePtr:J

    .line 60
    return-void
.end method


# virtual methods
.method protected commandReceived(Ljava/lang/String;)V
    .locals 0
    .param p1, "command"    # Ljava/lang/String;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 55
    return-void
.end method

.method protected dontProceed()V
    .locals 4

    .prologue
    .line 73
    iget-wide v0, p0, Lorg/chromium/content/browser/InterstitialPageDelegateAndroid;->mNativePtr:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lorg/chromium/content/browser/InterstitialPageDelegateAndroid;->mNativePtr:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/InterstitialPageDelegateAndroid;->nativeDontProceed(J)V

    .line 74
    :cond_0
    return-void
.end method

.method public getNative()J
    .locals 2

    .prologue
    .line 31
    iget-wide v0, p0, Lorg/chromium/content/browser/InterstitialPageDelegateAndroid;->mNativePtr:J

    return-wide v0
.end method

.method protected onDontProceed()V
    .locals 0
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 46
    return-void
.end method

.method protected onProceed()V
    .locals 0
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 39
    return-void
.end method

.method protected proceed()V
    .locals 4

    .prologue
    .line 66
    iget-wide v0, p0, Lorg/chromium/content/browser/InterstitialPageDelegateAndroid;->mNativePtr:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lorg/chromium/content/browser/InterstitialPageDelegateAndroid;->mNativePtr:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/content/browser/InterstitialPageDelegateAndroid;->nativeProceed(J)V

    .line 67
    :cond_0
    return-void
.end method
