.class Lorg/chromium/content/browser/accessibility/AccessibilityInjector$VibratorWrapper;
.super Ljava/lang/Object;
.source "AccessibilityInjector.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/content/browser/accessibility/AccessibilityInjector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "VibratorWrapper"
.end annotation


# static fields
.field private static final MAX_VIBRATE_DURATION_MS:J = 0x1388L


# instance fields
.field private final mVibrator:Landroid/os/Vibrator;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 357
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 358
    const-string v0, "vibrator"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Vibrator;

    iput-object v0, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector$VibratorWrapper;->mVibrator:Landroid/os/Vibrator;

    .line 359
    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1
    .annotation runtime Lorg/chromium/content/browser/JavascriptInterface;
    .end annotation

    .prologue
    .line 389
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector$VibratorWrapper;->mVibrator:Landroid/os/Vibrator;

    invoke-virtual {v0}, Landroid/os/Vibrator;->cancel()V

    .line 390
    return-void
.end method

.method public hasVibrator()Z
    .locals 1
    .annotation runtime Lorg/chromium/content/browser/JavascriptInterface;
    .end annotation

    .prologue
    .line 364
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector$VibratorWrapper;->mVibrator:Landroid/os/Vibrator;

    invoke-virtual {v0}, Landroid/os/Vibrator;->hasVibrator()Z

    move-result v0

    return v0
.end method

.method public vibrate(J)V
    .locals 3
    .param p1, "milliseconds"    # J
    .annotation runtime Lorg/chromium/content/browser/JavascriptInterface;
    .end annotation

    .prologue
    .line 370
    const-wide/16 v0, 0x1388

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    .line 371
    iget-object v0, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector$VibratorWrapper;->mVibrator:Landroid/os/Vibrator;

    invoke-virtual {v0, p1, p2}, Landroid/os/Vibrator;->vibrate(J)V

    .line 372
    return-void
.end method

.method public vibrate([JI)V
    .locals 6
    .param p1, "pattern"    # [J
    .param p2, "repeat"    # I
    .annotation runtime Lorg/chromium/content/browser/JavascriptInterface;
    .end annotation

    .prologue
    .line 377
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_0

    .line 378
    aget-wide v2, p1, v0

    const-wide/16 v4, 0x1388

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    aput-wide v2, p1, v0

    .line 377
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 381
    :cond_0
    const/4 p2, -0x1

    .line 383
    iget-object v1, p0, Lorg/chromium/content/browser/accessibility/AccessibilityInjector$VibratorWrapper;->mVibrator:Landroid/os/Vibrator;

    invoke-virtual {v1, p1, p2}, Landroid/os/Vibrator;->vibrate([JI)V

    .line 384
    return-void
.end method
