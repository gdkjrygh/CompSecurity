.class public final Lcom/google/zxing/client/android/camera/exposure/FroyoExposureInterface;
.super Ljava/lang/Object;
.source "FroyoExposureInterface.java"

# interfaces
.implements Lcom/google/zxing/client/android/camera/exposure/ExposureInterface;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x8
.end annotation


# static fields
.field private static final MAX_EXPOSURE_COMPENSATION:F = 1.5f

.field private static final MIN_EXPOSURE_COMPENSATION:F

.field private static final TAG:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 26
    const-class v0, Lcom/google/zxing/client/android/camera/exposure/FroyoExposureInterface;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/zxing/client/android/camera/exposure/FroyoExposureInterface;->TAG:Ljava/lang/String;

    .line 29
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public setExposure(Landroid/hardware/Camera$Parameters;Z)V
    .locals 7
    .param p1, "parameters"    # Landroid/hardware/Camera$Parameters;
    .param p2, "lightOn"    # Z

    .prologue
    .line 33
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getMinExposureCompensation()I

    move-result v2

    .line 34
    .local v2, "minExposure":I
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getMaxExposureCompensation()I

    move-result v1

    .line 35
    .local v1, "maxExposure":I
    if-nez v2, :cond_0

    if-eqz v1, :cond_2

    .line 36
    :cond_0
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getExposureCompensationStep()F

    move-result v3

    .line 38
    .local v3, "step":F
    if-eqz p2, :cond_1

    .line 40
    const/4 v4, 0x0

    div-float/2addr v4, v3

    float-to-int v4, v4

    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 45
    .local v0, "desiredCompensation":I
    :goto_0
    sget-object v4, Lcom/google/zxing/client/android/camera/exposure/FroyoExposureInterface;->TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Setting exposure compensation to "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " / "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    int-to-float v6, v0

    mul-float/2addr v6, v3

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    invoke-virtual {p1, v0}, Landroid/hardware/Camera$Parameters;->setExposureCompensation(I)V

    .line 50
    .end local v0    # "desiredCompensation":I
    .end local v3    # "step":F
    :goto_1
    return-void

    .line 43
    .restart local v3    # "step":F
    :cond_1
    const/high16 v4, 0x3fc00000    # 1.5f

    div-float/2addr v4, v3

    float-to-int v4, v4

    invoke-static {v4, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .restart local v0    # "desiredCompensation":I
    goto :goto_0

    .line 48
    .end local v0    # "desiredCompensation":I
    .end local v3    # "step":F
    :cond_2
    sget-object v4, Lcom/google/zxing/client/android/camera/exposure/FroyoExposureInterface;->TAG:Ljava/lang/String;

    const-string v5, "Camera does not support exposure compensation"

    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1
.end method
