.class public final Lcom/google/zxing/client/android/camera/exposure/ExposureManager;
.super Lcom/google/zxing/client/android/common/PlatformSupportManager;
.source "ExposureManager.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/zxing/client/android/common/PlatformSupportManager",
        "<",
        "Lcom/google/zxing/client/android/camera/exposure/ExposureInterface;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 24
    const-class v0, Lcom/google/zxing/client/android/camera/exposure/ExposureInterface;

    new-instance v1, Lcom/google/zxing/client/android/camera/exposure/DefaultExposureInterface;

    invoke-direct {v1}, Lcom/google/zxing/client/android/camera/exposure/DefaultExposureInterface;-><init>()V

    invoke-direct {p0, v0, v1}, Lcom/google/zxing/client/android/common/PlatformSupportManager;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 25
    const/16 v0, 0x8

    const-string v1, "com.google.zxing.client.android.camera.exposure.FroyoExposureInterface"

    invoke-virtual {p0, v0, v1}, Lcom/google/zxing/client/android/camera/exposure/ExposureManager;->addImplementationClass(ILjava/lang/String;)V

    .line 26
    return-void
.end method
