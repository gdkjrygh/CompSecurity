.class Lorg/chromium/content/browser/VibrationProvider;
.super Ljava/lang/Object;
.source "VibrationProvider.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "content"
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "VibrationProvider"


# instance fields
.field private final mAudioManager:Landroid/media/AudioManager;

.field private final mHasVibratePermission:Z

.field private final mVibrator:Landroid/os/Vibrator;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    const-string v0, "audio"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    iput-object v0, p0, Lorg/chromium/content/browser/VibrationProvider;->mAudioManager:Landroid/media/AudioManager;

    .line 47
    const-string v0, "vibrator"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Vibrator;

    iput-object v0, p0, Lorg/chromium/content/browser/VibrationProvider;->mVibrator:Landroid/os/Vibrator;

    .line 48
    const-string v0, "android.permission.VIBRATE"

    invoke-virtual {p1, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lorg/chromium/content/browser/VibrationProvider;->mHasVibratePermission:Z

    .line 50
    iget-boolean v0, p0, Lorg/chromium/content/browser/VibrationProvider;->mHasVibratePermission:Z

    if-nez v0, :cond_0

    .line 51
    const-string v0, "VibrationProvider"

    const-string v1, "Failed to use vibrate API, requires VIBRATE permission."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    :cond_0
    return-void

    .line 48
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private cancelVibration()V
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 42
    iget-boolean v0, p0, Lorg/chromium/content/browser/VibrationProvider;->mHasVibratePermission:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/chromium/content/browser/VibrationProvider;->mVibrator:Landroid/os/Vibrator;

    invoke-virtual {v0}, Landroid/os/Vibrator;->cancel()V

    .line 43
    :cond_0
    return-void
.end method

.method private static create(Landroid/content/Context;)Lorg/chromium/content/browser/VibrationProvider;
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 29
    new-instance v0, Lorg/chromium/content/browser/VibrationProvider;

    invoke-direct {v0, p0}, Lorg/chromium/content/browser/VibrationProvider;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method private vibrate(J)V
    .locals 1
    .param p1, "milliseconds"    # J
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 34
    iget-object v0, p0, Lorg/chromium/content/browser/VibrationProvider;->mAudioManager:Landroid/media/AudioManager;

    invoke-virtual {v0}, Landroid/media/AudioManager;->getRingerMode()I

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lorg/chromium/content/browser/VibrationProvider;->mHasVibratePermission:Z

    if-eqz v0, :cond_0

    .line 36
    iget-object v0, p0, Lorg/chromium/content/browser/VibrationProvider;->mVibrator:Landroid/os/Vibrator;

    invoke-virtual {v0, p1, p2}, Landroid/os/Vibrator;->vibrate(J)V

    .line 38
    :cond_0
    return-void
.end method
