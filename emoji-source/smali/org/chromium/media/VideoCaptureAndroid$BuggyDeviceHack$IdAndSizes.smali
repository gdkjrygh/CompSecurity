.class Lorg/chromium/media/VideoCaptureAndroid$BuggyDeviceHack$IdAndSizes;
.super Ljava/lang/Object;
.source "VideoCaptureAndroid.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/media/VideoCaptureAndroid$BuggyDeviceHack;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "IdAndSizes"
.end annotation


# instance fields
.field public final mDevice:Ljava/lang/String;

.field public final mMinHeight:I

.field public final mMinWidth:I

.field public final mModel:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0
    .param p1, "model"    # Ljava/lang/String;
    .param p2, "device"    # Ljava/lang/String;
    .param p3, "minWidth"    # I
    .param p4, "minHeight"    # I

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lorg/chromium/media/VideoCaptureAndroid$BuggyDeviceHack$IdAndSizes;->mModel:Ljava/lang/String;

    .line 32
    iput-object p2, p0, Lorg/chromium/media/VideoCaptureAndroid$BuggyDeviceHack$IdAndSizes;->mDevice:Ljava/lang/String;

    .line 33
    iput p3, p0, Lorg/chromium/media/VideoCaptureAndroid$BuggyDeviceHack$IdAndSizes;->mMinWidth:I

    .line 34
    iput p4, p0, Lorg/chromium/media/VideoCaptureAndroid$BuggyDeviceHack$IdAndSizes;->mMinHeight:I

    .line 35
    return-void
.end method
