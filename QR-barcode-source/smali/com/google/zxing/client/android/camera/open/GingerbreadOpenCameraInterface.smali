.class public final Lcom/google/zxing/client/android/camera/open/GingerbreadOpenCameraInterface;
.super Ljava/lang/Object;
.source "GingerbreadOpenCameraInterface.java"

# interfaces
.implements Lcom/google/zxing/client/android/camera/open/OpenCameraInterface;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x9
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "GingerbreadOpenCamera"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public open()Landroid/hardware/Camera;
    .locals 7

    .prologue
    .line 38
    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    move-result v3

    .line 39
    .local v3, "numCameras":I
    if-nez v3, :cond_0

    .line 40
    const-string v4, "GingerbreadOpenCamera"

    const-string v5, "No cameras!"

    invoke-static {v4, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    const/4 v0, 0x0

    .line 63
    :goto_0
    return-object v0

    .line 44
    :cond_0
    const/4 v2, 0x0

    .line 45
    .local v2, "index":I
    :goto_1
    if-lt v2, v3, :cond_2

    .line 55
    :cond_1
    if-ge v2, v3, :cond_3

    .line 56
    const-string v4, "GingerbreadOpenCamera"

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Opening camera #"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    invoke-static {v2}, Landroid/hardware/Camera;->open(I)Landroid/hardware/Camera;

    move-result-object v0

    .line 58
    .local v0, "camera":Landroid/hardware/Camera;
    goto :goto_0

    .line 46
    .end local v0    # "camera":Landroid/hardware/Camera;
    :cond_2
    new-instance v1, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v1}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 47
    .local v1, "cameraInfo":Landroid/hardware/Camera$CameraInfo;
    invoke-static {v2, v1}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 48
    iget v4, v1, Landroid/hardware/Camera$CameraInfo;->facing:I

    if-eqz v4, :cond_1

    .line 51
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 59
    .end local v1    # "cameraInfo":Landroid/hardware/Camera$CameraInfo;
    :cond_3
    const-string v4, "GingerbreadOpenCamera"

    const-string v5, "No camera facing back; returning camera #0"

    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 60
    const/4 v4, 0x0

    invoke-static {v4}, Landroid/hardware/Camera;->open(I)Landroid/hardware/Camera;

    move-result-object v0

    .restart local v0    # "camera":Landroid/hardware/Camera;
    goto :goto_0
.end method
