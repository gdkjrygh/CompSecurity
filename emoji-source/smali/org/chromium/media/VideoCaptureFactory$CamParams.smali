.class Lorg/chromium/media/VideoCaptureFactory$CamParams;
.super Ljava/lang/Object;
.source "VideoCaptureFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/media/VideoCaptureFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "CamParams"
.end annotation


# instance fields
.field final mHeight:I

.field final mId:I

.field final mName:Ljava/lang/String;

.field final mWidth:I


# direct methods
.method constructor <init>(ILjava/lang/String;II)V
    .locals 0
    .param p1, "id"    # I
    .param p2, "name"    # Ljava/lang/String;
    .param p3, "width"    # I
    .param p4, "height"    # I

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput p1, p0, Lorg/chromium/media/VideoCaptureFactory$CamParams;->mId:I

    .line 39
    iput-object p2, p0, Lorg/chromium/media/VideoCaptureFactory$CamParams;->mName:Ljava/lang/String;

    .line 40
    iput p3, p0, Lorg/chromium/media/VideoCaptureFactory$CamParams;->mWidth:I

    .line 41
    iput p4, p0, Lorg/chromium/media/VideoCaptureFactory$CamParams;->mHeight:I

    .line 42
    return-void
.end method
