.class Lorg/chromium/media/VideoCaptureFactory;
.super Ljava/lang/Object;
.source "VideoCaptureFactory.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;,
        Lorg/chromium/media/VideoCaptureFactory$CamParams;
    }
.end annotation

.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "media"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    return-void
.end method

.method static createVideoCapture(Landroid/content/Context;IJ)Lorg/chromium/media/VideoCapture;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "id"    # I
    .param p2, "nativeVideoCaptureDeviceAndroid"    # J
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 162
    # invokes: Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->isSpecialCamera(I)Z
    invoke-static {p1}, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->access$000(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 163
    new-instance v0, Lorg/chromium/media/VideoCaptureTango;

    # invokes: Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->toSpecialCameraId(I)I
    invoke-static {p1}, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->access$100(I)I

    move-result v1

    invoke-direct {v0, p0, v1, p2, p3}, Lorg/chromium/media/VideoCaptureTango;-><init>(Landroid/content/Context;IJ)V

    .line 166
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lorg/chromium/media/VideoCaptureAndroid;

    invoke-direct {v0, p0, p1, p2, p3}, Lorg/chromium/media/VideoCaptureAndroid;-><init>(Landroid/content/Context;IJ)V

    goto :goto_0
.end method

.method static getCaptureFormatFramerate(Lorg/chromium/media/VideoCapture$CaptureFormat;)I
    .locals 1
    .param p0, "format"    # Lorg/chromium/media/VideoCapture$CaptureFormat;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 191
    invoke-virtual {p0}, Lorg/chromium/media/VideoCapture$CaptureFormat;->getFramerate()I

    move-result v0

    return v0
.end method

.method static getCaptureFormatHeight(Lorg/chromium/media/VideoCapture$CaptureFormat;)I
    .locals 1
    .param p0, "format"    # Lorg/chromium/media/VideoCapture$CaptureFormat;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 186
    invoke-virtual {p0}, Lorg/chromium/media/VideoCapture$CaptureFormat;->getHeight()I

    move-result v0

    return v0
.end method

.method static getCaptureFormatPixelFormat(Lorg/chromium/media/VideoCapture$CaptureFormat;)I
    .locals 1
    .param p0, "format"    # Lorg/chromium/media/VideoCapture$CaptureFormat;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 196
    invoke-virtual {p0}, Lorg/chromium/media/VideoCapture$CaptureFormat;->getPixelFormat()I

    move-result v0

    return v0
.end method

.method static getCaptureFormatWidth(Lorg/chromium/media/VideoCapture$CaptureFormat;)I
    .locals 1
    .param p0, "format"    # Lorg/chromium/media/VideoCapture$CaptureFormat;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 181
    invoke-virtual {p0}, Lorg/chromium/media/VideoCapture$CaptureFormat;->getWidth()I

    move-result v0

    return v0
.end method

.method static getDeviceSupportedFormats(I)[Lorg/chromium/media/VideoCapture$CaptureFormat;
    .locals 1
    .param p0, "id"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 173
    # invokes: Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->isSpecialCamera(I)Z
    invoke-static {p0}, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->access$000(I)Z

    move-result v0

    if-eqz v0, :cond_0

    # invokes: Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->toSpecialCameraId(I)I
    invoke-static {p0}, Lorg/chromium/media/VideoCaptureFactory$ChromiumCameraInfo;->access$100(I)I

    move-result v0

    invoke-static {v0}, Lorg/chromium/media/VideoCaptureTango;->getDeviceSupportedFormats(I)[Lorg/chromium/media/VideoCapture$CaptureFormat;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {p0}, Lorg/chromium/media/VideoCaptureAndroid;->getDeviceSupportedFormats(I)[Lorg/chromium/media/VideoCapture$CaptureFormat;

    move-result-object v0

    goto :goto_0
.end method
