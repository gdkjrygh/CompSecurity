.class Lorg/chromium/media/VideoCaptureAndroid$BuggyDeviceHack;
.super Ljava/lang/Object;
.source "VideoCaptureAndroid.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/media/VideoCaptureAndroid;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "BuggyDeviceHack"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/media/VideoCaptureAndroid$BuggyDeviceHack$IdAndSizes;
    }
.end annotation


# static fields
.field private static final CAPTURESIZE_BUGGY_DEVICE_LIST:[Lorg/chromium/media/VideoCaptureAndroid$BuggyDeviceHack$IdAndSizes;

.field private static final COLORSPACE_BUGGY_DEVICE_LIST:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 42
    new-array v0, v7, [Lorg/chromium/media/VideoCaptureAndroid$BuggyDeviceHack$IdAndSizes;

    new-instance v1, Lorg/chromium/media/VideoCaptureAndroid$BuggyDeviceHack$IdAndSizes;

    const-string v2, "Nexus 7"

    const-string v3, "flo"

    const/16 v4, 0x280

    const/16 v5, 0x1e0

    invoke-direct {v1, v2, v3, v4, v5}, Lorg/chromium/media/VideoCaptureAndroid$BuggyDeviceHack$IdAndSizes;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    aput-object v1, v0, v6

    sput-object v0, Lorg/chromium/media/VideoCaptureAndroid$BuggyDeviceHack;->CAPTURESIZE_BUGGY_DEVICE_LIST:[Lorg/chromium/media/VideoCaptureAndroid$BuggyDeviceHack$IdAndSizes;

    .line 46
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "SAMSUNG-SGH-I747"

    aput-object v1, v0, v6

    const-string v1, "ODROID-U2"

    aput-object v1, v0, v7

    sput-object v0, Lorg/chromium/media/VideoCaptureAndroid$BuggyDeviceHack;->COLORSPACE_BUGGY_DEVICE_LIST:[Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    return-void
.end method

.method static applyMinDimensions(Lorg/chromium/media/VideoCapture$CaptureFormat;)V
    .locals 6
    .param p0, "format"    # Lorg/chromium/media/VideoCapture$CaptureFormat;

    .prologue
    .line 53
    sget-object v0, Lorg/chromium/media/VideoCaptureAndroid$BuggyDeviceHack;->CAPTURESIZE_BUGGY_DEVICE_LIST:[Lorg/chromium/media/VideoCaptureAndroid$BuggyDeviceHack$IdAndSizes;

    .local v0, "arr$":[Lorg/chromium/media/VideoCaptureAndroid$BuggyDeviceHack$IdAndSizes;
    array-length v3, v0

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_0
    if-ge v2, v3, :cond_3

    aget-object v1, v0, v2

    .line 54
    .local v1, "buggyDevice":Lorg/chromium/media/VideoCaptureAndroid$BuggyDeviceHack$IdAndSizes;
    iget-object v4, v1, Lorg/chromium/media/VideoCaptureAndroid$BuggyDeviceHack$IdAndSizes;->mModel:Ljava/lang/String;

    sget-object v5, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, v1, Lorg/chromium/media/VideoCaptureAndroid$BuggyDeviceHack$IdAndSizes;->mDevice:Ljava/lang/String;

    sget-object v5, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 56
    iget v4, v1, Lorg/chromium/media/VideoCaptureAndroid$BuggyDeviceHack$IdAndSizes;->mMinWidth:I

    iget v5, p0, Lorg/chromium/media/VideoCapture$CaptureFormat;->mWidth:I

    if-le v4, v5, :cond_1

    iget v4, v1, Lorg/chromium/media/VideoCaptureAndroid$BuggyDeviceHack$IdAndSizes;->mMinWidth:I

    :goto_1
    iput v4, p0, Lorg/chromium/media/VideoCapture$CaptureFormat;->mWidth:I

    .line 58
    iget v4, v1, Lorg/chromium/media/VideoCaptureAndroid$BuggyDeviceHack$IdAndSizes;->mMinHeight:I

    iget v5, p0, Lorg/chromium/media/VideoCapture$CaptureFormat;->mHeight:I

    if-le v4, v5, :cond_2

    iget v4, v1, Lorg/chromium/media/VideoCaptureAndroid$BuggyDeviceHack$IdAndSizes;->mMinHeight:I

    :goto_2
    iput v4, p0, Lorg/chromium/media/VideoCapture$CaptureFormat;->mHeight:I

    .line 53
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 56
    :cond_1
    iget v4, p0, Lorg/chromium/media/VideoCapture$CaptureFormat;->mWidth:I

    goto :goto_1

    .line 58
    :cond_2
    iget v4, p0, Lorg/chromium/media/VideoCapture$CaptureFormat;->mHeight:I

    goto :goto_2

    .line 62
    .end local v1    # "buggyDevice":Lorg/chromium/media/VideoCaptureAndroid$BuggyDeviceHack$IdAndSizes;
    :cond_3
    return-void
.end method

.method static getImageFormat()I
    .locals 7

    .prologue
    const/16 v4, 0x11

    .line 65
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x10

    if-ge v5, v6, :cond_1

    .line 74
    .local v0, "arr$":[Ljava/lang/String;
    .local v2, "i$":I
    .local v3, "len$":I
    :cond_0
    :goto_0
    return v4

    .line 69
    .end local v0    # "arr$":[Ljava/lang/String;
    .end local v2    # "i$":I
    .end local v3    # "len$":I
    :cond_1
    sget-object v0, Lorg/chromium/media/VideoCaptureAndroid$BuggyDeviceHack;->COLORSPACE_BUGGY_DEVICE_LIST:[Ljava/lang/String;

    .restart local v0    # "arr$":[Ljava/lang/String;
    array-length v3, v0

    .restart local v3    # "len$":I
    const/4 v2, 0x0

    .restart local v2    # "i$":I
    :goto_1
    if-ge v2, v3, :cond_2

    aget-object v1, v0, v2

    .line 70
    .local v1, "buggyDevice":Ljava/lang/String;
    sget-object v5, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 69
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 74
    .end local v1    # "buggyDevice":Ljava/lang/String;
    :cond_2
    const v4, 0x32315659

    goto :goto_0
.end method
