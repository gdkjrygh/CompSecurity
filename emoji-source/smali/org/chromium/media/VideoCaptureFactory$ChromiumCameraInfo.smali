.class Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;
.super Ljava/lang/Object;
.source "VideoCaptureFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/media/VideoCaptureFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ChromiumCameraInfo"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final SPECIAL_DEVICE_LIST:[[Ljava/lang/String;

.field private static final TAG:Ljava/lang/String; = "ChromiumCameraInfo"

.field private static sNumberOfSystemCameras:I


# instance fields
.field private final mCameraInfo:Landroid/hardware/Camera$CameraInfo;

.field private final mId:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 45
    const-class v0, Lorg/chromium/media/VideoCaptureFactory;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    sput-boolean v0, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->$assertionsDisabled:Z

    .line 51
    new-array v0, v1, [[Ljava/lang/String;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/String;

    const-string v4, "Peanut"

    aput-object v4, v3, v2

    const-string v4, "peanut"

    aput-object v4, v3, v1

    aput-object v3, v0, v2

    sput-object v0, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->SPECIAL_DEVICE_LIST:[[Ljava/lang/String;

    .line 56
    const/4 v0, -0x1

    sput v0, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->sNumberOfSystemCameras:I

    return-void

    :cond_0
    move v0, v2

    .line 45
    goto :goto_0
.end method

.method private constructor <init>(I)V
    .locals 1
    .param p1, "index"    # I

    .prologue
    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    iput p1, p0, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->mId:I

    .line 79
    invoke-static {p1}, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->isSpecialCamera(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->mCameraInfo:Landroid/hardware/Camera$CameraInfo;

    .line 80
    return-void

    .line 79
    :cond_0
    iget v0, p0, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->mId:I

    invoke-direct {p0, v0}, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->getCameraInfo(I)Landroid/hardware/Camera$CameraInfo;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic access$000(I)Z
    .locals 1
    .param p0, "x0"    # I

    .prologue
    .line 45
    invoke-static {p0}, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->isSpecialCamera(I)Z

    move-result v0

    return v0
.end method

.method static synthetic access$100(I)I
    .locals 1
    .param p0, "x0"    # I

    .prologue
    .line 45
    invoke-static {p0}, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->toSpecialCameraId(I)I

    move-result v0

    return v0
.end method

.method private static getAt(I)Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;
    .locals 1
    .param p0, "index"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
        value = "ChromiumCameraInfo"
    .end annotation

    .prologue
    .line 111
    new-instance v0, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;

    invoke-direct {v0, p0}, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;-><init>(I)V

    return-object v0
.end method

.method private getCameraInfo(I)Landroid/hardware/Camera$CameraInfo;
    .locals 5
    .param p1, "id"    # I

    .prologue
    .line 146
    new-instance v0, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v0}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 149
    .local v0, "cameraInfo":Landroid/hardware/Camera$CameraInfo;
    :try_start_0
    invoke-static {p1, v0}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 154
    .end local v0    # "cameraInfo":Landroid/hardware/Camera$CameraInfo;
    :goto_0
    return-object v0

    .line 150
    .restart local v0    # "cameraInfo":Landroid/hardware/Camera$CameraInfo;
    :catch_0
    move-exception v1

    .line 151
    .local v1, "ex":Ljava/lang/RuntimeException;
    const-string v2, "ChromiumCameraInfo"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getCameraInfo: android.hardware.Camera.getCameraInfo: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 152
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private getDeviceName()Ljava/lang/String;
    .locals 4
    .annotation build Lorg/chromium/base/CalledByNative;
        value = "ChromiumCameraInfo"
    .end annotation

    .prologue
    const/4 v3, 0x1

    .line 121
    iget v0, p0, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->mId:I

    invoke-static {v0}, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->isSpecialCamera(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 122
    iget v0, p0, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->mId:I

    invoke-static {v0}, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->toSpecialCameraId(I)I

    move-result v0

    invoke-static {v0}, Lorg/chromium/media/VideoCaptureTango;->getCamParams(I)Lorg/chromium/media/VideoCaptureFactory$CamParams;

    move-result-object v0

    iget-object v0, v0, Lorg/chromium/media/VideoCaptureFactory$CamParams;->mName:Ljava/lang/String;

    .line 130
    :goto_0
    return-object v0

    .line 124
    :cond_0
    iget-object v0, p0, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->mCameraInfo:Landroid/hardware/Camera$CameraInfo;

    if-nez v0, :cond_1

    .line 125
    const-string v0, ""

    goto :goto_0

    .line 127
    :cond_1
    const-string v1, "ChromiumCameraInfo"

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Camera enumerated: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v0, p0, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->mCameraInfo:Landroid/hardware/Camera$CameraInfo;

    iget v0, v0, Landroid/hardware/Camera$CameraInfo;->facing:I

    if-ne v0, v3, :cond_2

    const-string v0, "front"

    :goto_1
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 130
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "camera "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->mId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", facing "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v0, p0, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->mCameraInfo:Landroid/hardware/Camera$CameraInfo;

    iget v0, v0, Landroid/hardware/Camera$CameraInfo;->facing:I

    if-ne v0, v3, :cond_3

    const-string v0, "front"

    :goto_2
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 127
    :cond_2
    const-string v0, "back"

    goto :goto_1

    .line 130
    :cond_3
    const-string v0, "back"

    goto :goto_2
.end method

.method private getId()I
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
        value = "ChromiumCameraInfo"
    .end annotation

    .prologue
    .line 116
    iget v0, p0, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->mId:I

    return v0
.end method

.method private static getNumberOfCameras(Landroid/content/Context;)I
    .locals 3
    .param p0, "appContext"    # Landroid/content/Context;
    .annotation build Lorg/chromium/base/CalledByNative;
        value = "ChromiumCameraInfo"
    .end annotation

    .prologue
    .line 89
    sget v0, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->sNumberOfSystemCameras:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 90
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.permission.CAMERA"

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_1

    .line 93
    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    move-result v0

    sput v0, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->sNumberOfSystemCameras:I

    .line 100
    :cond_0
    :goto_0
    invoke-static {}, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->isSpecialDevice()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 101
    const-string v0, "ChromiumCameraInfo"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Special device: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 102
    sget v0, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->sNumberOfSystemCameras:I

    invoke-static {}, Lorg/chromium/media/VideoCaptureTango;->numberOfCameras()I

    move-result v1

    add-int/2addr v0, v1

    .line 105
    :goto_1
    return v0

    .line 95
    :cond_1
    const/4 v0, 0x0

    sput v0, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->sNumberOfSystemCameras:I

    .line 96
    const-string v0, "ChromiumCameraInfo"

    const-string v1, "Missing android.permission.CAMERA permission, no system camera available."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 105
    :cond_2
    sget v0, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->sNumberOfSystemCameras:I

    goto :goto_1
.end method

.method private getOrientation()I
    .locals 2
    .annotation build Lorg/chromium/base/CalledByNative;
        value = "ChromiumCameraInfo"
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 138
    iget v1, p0, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->mId:I

    invoke-static {v1}, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->isSpecialCamera(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 141
    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v1, p0, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->mCameraInfo:Landroid/hardware/Camera$CameraInfo;

    if-eqz v1, :cond_0

    iget-object v0, p0, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->mCameraInfo:Landroid/hardware/Camera$CameraInfo;

    iget v0, v0, Landroid/hardware/Camera$CameraInfo;->orientation:I

    goto :goto_0
.end method

.method private static isSpecialCamera(I)Z
    .locals 1
    .param p0, "id"    # I

    .prologue
    .line 69
    sget v0, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->sNumberOfSystemCameras:I

    if-lt p0, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static isSpecialDevice()Z
    .locals 8

    .prologue
    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 59
    sget-object v0, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->SPECIAL_DEVICE_LIST:[[Ljava/lang/String;

    .local v0, "arr$":[[Ljava/lang/String;
    array-length v3, v0

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_0
    if-ge v2, v3, :cond_1

    aget-object v1, v0, v2

    .line 60
    .local v1, "device":[Ljava/lang/String;
    aget-object v6, v1, v5

    sget-object v7, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_0

    aget-object v6, v1, v4

    sget-object v7, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 65
    .end local v1    # "device":[Ljava/lang/String;
    :goto_1
    return v4

    .line 59
    .restart local v1    # "device":[Ljava/lang/String;
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .end local v1    # "device":[Ljava/lang/String;
    :cond_1
    move v4, v5

    .line 65
    goto :goto_1
.end method

.method private static toSpecialCameraId(I)I
    .locals 1
    .param p0, "id"    # I

    .prologue
    .line 73
    sget-boolean v0, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-static {p0}, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->isSpecialCamera(I)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 74
    :cond_0
    sget v0, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->sNumberOfSystemCameras:I

    sub-int v0, p0, v0

    return v0
.end method
