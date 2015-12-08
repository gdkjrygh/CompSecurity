.class public Lorg/chromium/media/VideoCaptureTango;
.super Lorg/chromium/media/VideoCapture;
.source "VideoCaptureTango.java"


# static fields
.field private static final CAM_PARAMS:[Lorg/chromium/media/VideoCaptureFactory$CamParams;

.field private static final CHROMA_ZERO_LEVEL:B = 0x7ft

.field private static final DEPTH_CAMERA_ID:I = 0x0

.field private static final FISHEYE_CAMERA_ID:I = 0x1

.field private static final FOURMP_CAMERA_ID:I = 0x2

.field private static final SF_FULL_HEIGHT:I = 0x6d8

.field private static final SF_HEIGHT:I = 0x490

.field private static final SF_LINES_BIGIMAGE:I = 0x2d0

.field private static final SF_LINES_DEPTH:I = 0x3c

.field private static final SF_LINES_DEPTH_PADDED:I = 0x70

.field private static final SF_LINES_FISHEYE:I = 0xf0

.field private static final SF_LINES_HEADER:I = 0x10

.field private static final SF_LINES_RESERVED:I = 0x50

.field private static final SF_OFFSET_4MP_CHROMA:I = 0x70

.field private static final SF_WIDTH:I = 0x500

.field private static final TAG:Ljava/lang/String; = "VideoCaptureTango"


# instance fields
.field private mFrameBuffer:Ljava/nio/ByteBuffer;

.field private final mTangoCameraId:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x2

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 30
    const/4 v0, 0x3

    new-array v0, v0, [Lorg/chromium/media/VideoCaptureFactory$CamParams;

    new-instance v1, Lorg/chromium/media/VideoCaptureFactory$CamParams;

    const-string v2, "depth"

    const/16 v3, 0x140

    const/16 v4, 0xf0

    invoke-direct {v1, v5, v2, v3, v4}, Lorg/chromium/media/VideoCaptureFactory$CamParams;-><init>(ILjava/lang/String;II)V

    aput-object v1, v0, v5

    new-instance v1, Lorg/chromium/media/VideoCaptureFactory$CamParams;

    const-string v2, "fisheye"

    const/16 v3, 0x280

    const/16 v4, 0x1e0

    invoke-direct {v1, v6, v2, v3, v4}, Lorg/chromium/media/VideoCaptureFactory$CamParams;-><init>(ILjava/lang/String;II)V

    aput-object v1, v0, v6

    new-instance v1, Lorg/chromium/media/VideoCaptureFactory$CamParams;

    const-string v2, "4MP"

    const/16 v3, 0x500

    const/16 v4, 0x2d0

    invoke-direct {v1, v7, v2, v3, v4}, Lorg/chromium/media/VideoCaptureFactory$CamParams;-><init>(ILjava/lang/String;II)V

    aput-object v1, v0, v7

    sput-object v0, Lorg/chromium/media/VideoCaptureTango;->CAM_PARAMS:[Lorg/chromium/media/VideoCaptureFactory$CamParams;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;IJ)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "id"    # I
    .param p3, "nativeVideoCaptureDeviceAndroid"    # J

    .prologue
    .line 74
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p3, p4}, Lorg/chromium/media/VideoCapture;-><init>(Landroid/content/Context;IJ)V

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/chromium/media/VideoCaptureTango;->mFrameBuffer:Ljava/nio/ByteBuffer;

    .line 75
    iput p2, p0, Lorg/chromium/media/VideoCaptureTango;->mTangoCameraId:I

    .line 76
    return-void
.end method

.method static getCamParams(I)Lorg/chromium/media/VideoCaptureFactory$CamParams;
    .locals 1
    .param p0, "index"    # I

    .prologue
    .line 56
    sget-object v0, Lorg/chromium/media/VideoCaptureTango;->CAM_PARAMS:[Lorg/chromium/media/VideoCaptureFactory$CamParams;

    array-length v0, v0

    if-lt p0, v0, :cond_0

    const/4 v0, 0x0

    .line 57
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lorg/chromium/media/VideoCaptureTango;->CAM_PARAMS:[Lorg/chromium/media/VideoCaptureFactory$CamParams;

    aget-object v0, v0, p0

    goto :goto_0
.end method

.method static getDeviceSupportedFormats(I)[Lorg/chromium/media/VideoCapture$CaptureFormat;
    .locals 6
    .param p0, "id"    # I

    .prologue
    const v5, 0x32315659

    .line 61
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .local v0, "formatList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lorg/chromium/media/VideoCapture$CaptureFormat;>;"
    if-nez p0, :cond_1

    .line 63
    new-instance v1, Lorg/chromium/media/VideoCapture$CaptureFormat;

    const/16 v2, 0x140

    const/16 v3, 0xb4

    const/4 v4, 0x5

    invoke-direct {v1, v2, v3, v4, v5}, Lorg/chromium/media/VideoCapture$CaptureFormat;-><init>(IIII)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Lorg/chromium/media/VideoCapture$CaptureFormat;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lorg/chromium/media/VideoCapture$CaptureFormat;

    return-object v1

    .line 64
    :cond_1
    const/4 v1, 0x1

    if-ne p0, v1, :cond_2

    .line 65
    new-instance v1, Lorg/chromium/media/VideoCapture$CaptureFormat;

    const/16 v2, 0x280

    const/16 v3, 0x1e0

    const/16 v4, 0x1e

    invoke-direct {v1, v2, v3, v4, v5}, Lorg/chromium/media/VideoCapture$CaptureFormat;-><init>(IIII)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 66
    :cond_2
    const/4 v1, 0x2

    if-ne p0, v1, :cond_0

    .line 67
    new-instance v1, Lorg/chromium/media/VideoCapture$CaptureFormat;

    const/16 v2, 0x500

    const/16 v3, 0x2d0

    const/16 v4, 0x14

    invoke-direct {v1, v2, v3, v4, v5}, Lorg/chromium/media/VideoCapture$CaptureFormat;-><init>(IIII)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method static numberOfCameras()I
    .locals 1

    .prologue
    .line 52
    sget-object v0, Lorg/chromium/media/VideoCaptureTango;->CAM_PARAMS:[Lorg/chromium/media/VideoCaptureFactory$CamParams;

    array-length v0, v0

    return v0
.end method


# virtual methods
.method protected allocateBuffers()V
    .locals 2

    .prologue
    .line 92
    iget-object v0, p0, Lorg/chromium/media/VideoCaptureTango;->mCaptureFormat:Lorg/chromium/media/VideoCapture$CaptureFormat;

    iget v0, v0, Lorg/chromium/media/VideoCapture$CaptureFormat;->mWidth:I

    iget-object v1, p0, Lorg/chromium/media/VideoCaptureTango;->mCaptureFormat:Lorg/chromium/media/VideoCapture$CaptureFormat;

    iget v1, v1, Lorg/chromium/media/VideoCapture$CaptureFormat;->mHeight:I

    mul-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x3

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lorg/chromium/media/VideoCaptureTango;->mFrameBuffer:Ljava/nio/ByteBuffer;

    .line 96
    iget-object v0, p0, Lorg/chromium/media/VideoCaptureTango;->mFrameBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    const/16 v1, 0x7f

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([BB)V

    .line 97
    return-void
.end method

.method public onPreviewFrame([BLandroid/hardware/Camera;)V
    .locals 14
    .param p1, "data"    # [B
    .param p2, "camera"    # Landroid/hardware/Camera;

    .prologue
    .line 106
    iget-object v1, p0, Lorg/chromium/media/VideoCaptureTango;->mPreviewBufferLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 108
    :try_start_0
    iget-boolean v1, p0, Lorg/chromium/media/VideoCaptureTango;->mIsRunning:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 174
    iget-object v1, p0, Lorg/chromium/media/VideoCaptureTango;->mPreviewBufferLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 176
    :goto_0
    return-void

    .line 110
    :cond_0
    :try_start_1
    array-length v1, p1

    const v2, 0x223800

    if-ne v1, v2, :cond_6

    .line 111
    invoke-virtual {p0}, Lorg/chromium/media/VideoCaptureTango;->getDeviceOrientation()I

    move-result v6

    .line 112
    .local v6, "rotation":I
    iget v1, p0, Lorg/chromium/media/VideoCaptureTango;->mDeviceOrientation:I

    if-eq v6, v1, :cond_1

    .line 113
    iput v6, p0, Lorg/chromium/media/VideoCaptureTango;->mDeviceOrientation:I

    .line 115
    :cond_1
    iget v1, p0, Lorg/chromium/media/VideoCaptureTango;->mCameraFacing:I

    if-nez v1, :cond_2

    .line 116
    rsub-int v6, v6, 0x168

    .line 118
    :cond_2
    iget v1, p0, Lorg/chromium/media/VideoCaptureTango;->mCameraOrientation:I

    add-int/2addr v1, v6

    rem-int/lit16 v6, v1, 0x168

    .line 120
    iget v1, p0, Lorg/chromium/media/VideoCaptureTango;->mTangoCameraId:I

    if-nez v1, :cond_4

    .line 121
    const v10, 0x12c00

    .line 122
    .local v10, "sizeY":I
    const v13, 0x69000

    .line 130
    .local v13, "startY":I
    move v7, v13

    .local v7, "j":I
    :goto_1
    const v1, 0x8e800

    if-ge v7, v1, :cond_3

    .line 131
    add-int/lit8 v1, v7, 0x1

    aget-byte v1, p1, v1

    shl-int/lit8 v1, v1, 0x4

    aget-byte v2, p1, v7

    and-int/lit16 v2, v2, 0xf0

    shr-int/lit8 v2, v2, 0x4

    or-int/2addr v1, v2

    int-to-byte v0, v1

    .line 132
    .local v0, "depthsample":B
    iget-object v1, p0, Lorg/chromium/media/VideoCaptureTango;->mFrameBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 130
    add-int/lit8 v7, v7, 0x2

    goto :goto_1

    .line 134
    .end local v0    # "depthsample":B
    :cond_3
    const/4 v7, 0x0

    :goto_2
    iget-object v1, p0, Lorg/chromium/media/VideoCaptureTango;->mCaptureFormat:Lorg/chromium/media/VideoCapture$CaptureFormat;

    iget v1, v1, Lorg/chromium/media/VideoCapture$CaptureFormat;->mWidth:I

    iget-object v2, p0, Lorg/chromium/media/VideoCaptureTango;->mCaptureFormat:Lorg/chromium/media/VideoCapture$CaptureFormat;

    iget v2, v2, Lorg/chromium/media/VideoCapture$CaptureFormat;->mHeight:I

    mul-int/2addr v1, v2

    sub-int/2addr v1, v10

    if-ge v7, v1, :cond_5

    .line 136
    iget-object v1, p0, Lorg/chromium/media/VideoCaptureTango;->mFrameBuffer:Ljava/nio/ByteBuffer;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 135
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 138
    .end local v7    # "j":I
    .end local v10    # "sizeY":I
    .end local v13    # "startY":I
    :cond_4
    iget v1, p0, Lorg/chromium/media/VideoCaptureTango;->mTangoCameraId:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_7

    .line 139
    const v10, 0x4b000

    .line 140
    .restart local v10    # "sizeY":I
    const/16 v13, 0x5000

    .line 143
    .restart local v13    # "startY":I
    invoke-static {p1, v13, v10}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v1

    iget-object v2, p0, Lorg/chromium/media/VideoCaptureTango;->mFrameBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v10}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 169
    :cond_5
    :goto_3
    iget-object v1, p0, Lorg/chromium/media/VideoCaptureTango;->mFrameBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 170
    iget-wide v2, p0, Lorg/chromium/media/VideoCaptureTango;->mNativeVideoCaptureDeviceAndroid:J

    iget-object v1, p0, Lorg/chromium/media/VideoCaptureTango;->mFrameBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v4

    iget-object v1, p0, Lorg/chromium/media/VideoCaptureTango;->mFrameBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v5

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Lorg/chromium/media/VideoCaptureTango;->nativeOnFrameAvailable(J[BII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 174
    .end local v6    # "rotation":I
    .end local v10    # "sizeY":I
    .end local v13    # "startY":I
    :cond_6
    iget-object v1, p0, Lorg/chromium/media/VideoCaptureTango;->mPreviewBufferLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto/16 :goto_0

    .line 144
    .restart local v6    # "rotation":I
    :cond_7
    :try_start_2
    iget v1, p0, Lorg/chromium/media/VideoCaptureTango;->mTangoCameraId:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_8

    .line 145
    const v13, 0x8c000

    .line 147
    .restart local v13    # "startY":I
    const v10, 0xe1000

    .line 151
    .restart local v10    # "sizeY":I
    const/high16 v11, 0x190000

    .line 152
    .local v11, "startU":I
    const v8, 0x38400

    .line 153
    .local v8, "sizeU":I
    const v12, 0x1eb400

    .line 154
    .local v12, "startV":I
    const v9, 0x38400

    .line 159
    .local v9, "sizeV":I
    invoke-static {p1, v13, v10}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v1

    iget-object v2, p0, Lorg/chromium/media/VideoCaptureTango;->mFrameBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v10}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 161
    invoke-static {p1, v11, v8}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v1

    iget-object v2, p0, Lorg/chromium/media/VideoCaptureTango;->mFrameBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-virtual {v1, v2, v10, v8}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 163
    invoke-static {p1, v12, v9}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v1

    iget-object v2, p0, Lorg/chromium/media/VideoCaptureTango;->mFrameBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    const v3, 0x119400

    invoke-virtual {v1, v2, v3, v9}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    .line 174
    .end local v6    # "rotation":I
    .end local v8    # "sizeU":I
    .end local v9    # "sizeV":I
    .end local v10    # "sizeY":I
    .end local v11    # "startU":I
    .end local v12    # "startV":I
    .end local v13    # "startY":I
    :catchall_0
    move-exception v1

    iget-object v2, p0, Lorg/chromium/media/VideoCaptureTango;->mPreviewBufferLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v1

    .line 166
    .restart local v6    # "rotation":I
    :cond_8
    :try_start_3
    const-string v1, "VideoCaptureTango"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown camera, #id: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lorg/chromium/media/VideoCaptureTango;->mTangoCameraId:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 174
    iget-object v1, p0, Lorg/chromium/media/VideoCaptureTango;->mPreviewBufferLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto/16 :goto_0
.end method

.method protected setCaptureParameters(IIILandroid/hardware/Camera$Parameters;)V
    .locals 4
    .param p1, "width"    # I
    .param p2, "height"    # I
    .param p3, "frameRate"    # I
    .param p4, "cameraParameters"    # Landroid/hardware/Camera$Parameters;

    .prologue
    .line 81
    new-instance v0, Lorg/chromium/media/VideoCapture$CaptureFormat;

    sget-object v1, Lorg/chromium/media/VideoCaptureTango;->CAM_PARAMS:[Lorg/chromium/media/VideoCaptureFactory$CamParams;

    iget v2, p0, Lorg/chromium/media/VideoCaptureTango;->mTangoCameraId:I

    aget-object v1, v1, v2

    iget v1, v1, Lorg/chromium/media/VideoCaptureFactory$CamParams;->mWidth:I

    sget-object v2, Lorg/chromium/media/VideoCaptureTango;->CAM_PARAMS:[Lorg/chromium/media/VideoCaptureFactory$CamParams;

    iget v3, p0, Lorg/chromium/media/VideoCaptureTango;->mTangoCameraId:I

    aget-object v2, v2, v3

    iget v2, v2, Lorg/chromium/media/VideoCaptureFactory$CamParams;->mHeight:I

    const v3, 0x32315659

    invoke-direct {v0, v1, v2, p3, v3}, Lorg/chromium/media/VideoCapture$CaptureFormat;-><init>(IIII)V

    iput-object v0, p0, Lorg/chromium/media/VideoCaptureTango;->mCaptureFormat:Lorg/chromium/media/VideoCapture$CaptureFormat;

    .line 87
    const-string v0, "sf-mode"

    const-string v1, "all"

    invoke-virtual {p4, v0, v1}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    return-void
.end method

.method protected setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V
    .locals 1
    .param p1, "cb"    # Landroid/hardware/Camera$PreviewCallback;

    .prologue
    .line 101
    iget-object v0, p0, Lorg/chromium/media/VideoCaptureTango;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0, p1}, Landroid/hardware/Camera;->setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V

    .line 102
    return-void
.end method
