.class public abstract Lorg/chromium/media/VideoCapture;
.super Ljava/lang/Object;
.source "VideoCapture.java"

# interfaces
.implements Landroid/hardware/Camera$PreviewCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/media/VideoCapture$CaptureFormat;
    }
.end annotation

.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "media"
.end annotation


# static fields
.field protected static final GL_TEXTURE_EXTERNAL_OES:I = 0x8d65

.field private static final TAG:Ljava/lang/String; = "VideoCapture"


# instance fields
.field protected mCamera:Landroid/hardware/Camera;

.field protected mCameraFacing:I

.field protected mCameraOrientation:I

.field protected mCaptureFormat:Lorg/chromium/media/VideoCapture$CaptureFormat;

.field protected mContext:Landroid/content/Context;

.field protected mDeviceOrientation:I

.field protected mGlTextures:[I

.field protected mId:I

.field protected mIsRunning:Z

.field protected mNativeVideoCaptureDeviceAndroid:J

.field protected mPreviewBufferLock:Ljava/util/concurrent/locks/ReentrantLock;

.field protected mSurfaceTexture:Landroid/graphics/SurfaceTexture;


# direct methods
.method constructor <init>(Landroid/content/Context;IJ)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "id"    # I
    .param p3, "nativeVideoCaptureDeviceAndroid"    # J

    .prologue
    const/4 v1, 0x0

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object v1, p0, Lorg/chromium/media/VideoCapture;->mCaptureFormat:Lorg/chromium/media/VideoCapture$CaptureFormat;

    .line 63
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lorg/chromium/media/VideoCapture;->mPreviewBufferLock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 64
    iput-object v1, p0, Lorg/chromium/media/VideoCapture;->mContext:Landroid/content/Context;

    .line 66
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/chromium/media/VideoCapture;->mIsRunning:Z

    .line 71
    iput-object v1, p0, Lorg/chromium/media/VideoCapture;->mGlTextures:[I

    .line 72
    iput-object v1, p0, Lorg/chromium/media/VideoCapture;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    .line 83
    iput-object p1, p0, Lorg/chromium/media/VideoCapture;->mContext:Landroid/content/Context;

    .line 84
    iput p2, p0, Lorg/chromium/media/VideoCapture;->mId:I

    .line 85
    iput-wide p3, p0, Lorg/chromium/media/VideoCapture;->mNativeVideoCaptureDeviceAndroid:J

    .line 86
    return-void
.end method

.method private getCameraInfo(I)Landroid/hardware/Camera$CameraInfo;
    .locals 5
    .param p1, "id"    # I

    .prologue
    .line 372
    new-instance v0, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v0}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 374
    .local v0, "cameraInfo":Landroid/hardware/Camera$CameraInfo;
    :try_start_0
    invoke-static {p1, v0}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 379
    .end local v0    # "cameraInfo":Landroid/hardware/Camera$CameraInfo;
    :goto_0
    return-object v0

    .line 375
    .restart local v0    # "cameraInfo":Landroid/hardware/Camera$CameraInfo;
    :catch_0
    move-exception v1

    .line 376
    .local v1, "ex":Ljava/lang/RuntimeException;
    const-string v2, "VideoCapture"

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

    .line 377
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected static getCameraParameters(Landroid/hardware/Camera;)Landroid/hardware/Camera$Parameters;
    .locals 5
    .param p0, "camera"    # Landroid/hardware/Camera;

    .prologue
    .line 362
    :try_start_0
    invoke-virtual {p0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 368
    :goto_0
    return-object v1

    .line 363
    :catch_0
    move-exception v0

    .line 364
    .local v0, "ex":Ljava/lang/RuntimeException;
    const-string v2, "VideoCapture"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getCameraParameters: android.hardware.Camera.getParameters: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 365
    invoke-virtual {p0}, Landroid/hardware/Camera;->release()V

    .line 366
    const/4 v1, 0x0

    goto :goto_0
.end method


# virtual methods
.method allocate(III)Z
    .locals 20
    .param p1, "width"    # I
    .param p2, "height"    # I
    .param p3, "frameRate"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 90
    const-string v17, "VideoCapture"

    new-instance v18, Ljava/lang/StringBuilder;

    invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V

    const-string v19, "allocate: requested ("

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    move-object/from16 v0, v18

    move/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v18

    const-string v19, "x"

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    move-object/from16 v0, v18

    move/from16 v1, p2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v18

    const-string v19, ")@"

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    move-object/from16 v0, v18

    move/from16 v1, p3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v18

    const-string v19, "fps"

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v17 .. v18}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 93
    :try_start_0
    move-object/from16 v0, p0

    iget v0, v0, Lorg/chromium/media/VideoCapture;->mId:I

    move/from16 v17, v0

    invoke-static/range {v17 .. v17}, Landroid/hardware/Camera;->open(I)Landroid/hardware/Camera;

    move-result-object v17

    move-object/from16 v0, v17

    move-object/from16 v1, p0

    iput-object v0, v1, Lorg/chromium/media/VideoCapture;->mCamera:Landroid/hardware/Camera;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 99
    move-object/from16 v0, p0

    iget v0, v0, Lorg/chromium/media/VideoCapture;->mId:I

    move/from16 v17, v0

    move-object/from16 v0, p0

    move/from16 v1, v17

    invoke-direct {v0, v1}, Lorg/chromium/media/VideoCapture;->getCameraInfo(I)Landroid/hardware/Camera$CameraInfo;

    move-result-object v2

    .line 100
    .local v2, "cameraInfo":Landroid/hardware/Camera$CameraInfo;
    if-nez v2, :cond_0

    .line 101
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/media/VideoCapture;->mCamera:Landroid/hardware/Camera;

    move-object/from16 v17, v0

    invoke-virtual/range {v17 .. v17}, Landroid/hardware/Camera;->release()V

    .line 102
    const/16 v17, 0x0

    move-object/from16 v0, v17

    move-object/from16 v1, p0

    iput-object v0, v1, Lorg/chromium/media/VideoCapture;->mCamera:Landroid/hardware/Camera;

    .line 103
    const/16 v17, 0x0

    .line 213
    .end local v2    # "cameraInfo":Landroid/hardware/Camera$CameraInfo;
    :goto_0
    return v17

    .line 94
    :catch_0
    move-exception v4

    .line 95
    .local v4, "ex":Ljava/lang/RuntimeException;
    const-string v17, "VideoCapture"

    new-instance v18, Ljava/lang/StringBuilder;

    invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V

    const-string v19, "allocate: Camera.open: "

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v17 .. v18}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 96
    const/16 v17, 0x0

    goto :goto_0

    .line 106
    .end local v4    # "ex":Ljava/lang/RuntimeException;
    .restart local v2    # "cameraInfo":Landroid/hardware/Camera$CameraInfo;
    :cond_0
    iget v0, v2, Landroid/hardware/Camera$CameraInfo;->orientation:I

    move/from16 v17, v0

    move/from16 v0, v17

    move-object/from16 v1, p0

    iput v0, v1, Lorg/chromium/media/VideoCapture;->mCameraOrientation:I

    .line 107
    iget v0, v2, Landroid/hardware/Camera$CameraInfo;->facing:I

    move/from16 v17, v0

    move/from16 v0, v17

    move-object/from16 v1, p0

    iput v0, v1, Lorg/chromium/media/VideoCapture;->mCameraFacing:I

    .line 108
    invoke-virtual/range {p0 .. p0}, Lorg/chromium/media/VideoCapture;->getDeviceOrientation()I

    move-result v17

    move/from16 v0, v17

    move-object/from16 v1, p0

    iput v0, v1, Lorg/chromium/media/VideoCapture;->mDeviceOrientation:I

    .line 109
    const-string v17, "VideoCapture"

    new-instance v18, Ljava/lang/StringBuilder;

    invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V

    const-string v19, "allocate: orientation dev="

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    move-object/from16 v0, p0

    iget v0, v0, Lorg/chromium/media/VideoCapture;->mDeviceOrientation:I

    move/from16 v19, v0

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v18

    const-string v19, ", cam="

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    move-object/from16 v0, p0

    iget v0, v0, Lorg/chromium/media/VideoCapture;->mCameraOrientation:I

    move/from16 v19, v0

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v18

    const-string v19, ", facing="

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    move-object/from16 v0, p0

    iget v0, v0, Lorg/chromium/media/VideoCapture;->mCameraFacing:I

    move/from16 v19, v0

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v17 .. v18}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 112
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/media/VideoCapture;->mCamera:Landroid/hardware/Camera;

    move-object/from16 v17, v0

    invoke-static/range {v17 .. v17}, Lorg/chromium/media/VideoCapture;->getCameraParameters(Landroid/hardware/Camera;)Landroid/hardware/Camera$Parameters;

    move-result-object v15

    .line 113
    .local v15, "parameters":Landroid/hardware/Camera$Parameters;
    if-nez v15, :cond_1

    .line 114
    const/16 v17, 0x0

    move-object/from16 v0, v17

    move-object/from16 v1, p0

    iput-object v0, v1, Lorg/chromium/media/VideoCapture;->mCamera:Landroid/hardware/Camera;

    .line 115
    const/16 v17, 0x0

    goto/16 :goto_0

    .line 120
    :cond_1
    invoke-virtual {v15}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewFpsRange()Ljava/util/List;

    move-result-object v10

    .line 121
    .local v10, "listFpsRange":Ljava/util/List;, "Ljava/util/List<[I>;"
    if-eqz v10, :cond_2

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v17

    if-nez v17, :cond_3

    .line 122
    :cond_2
    const-string v17, "VideoCapture"

    const-string v18, "allocate: no fps range found"

    invoke-static/range {v17 .. v18}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 123
    const/16 v17, 0x0

    goto/16 :goto_0

    .line 125
    :cond_3
    move/from16 v0, p3

    mul-int/lit16 v7, v0, 0x3e8

    .line 127
    .local v7, "frameRateInMs":I
    const/16 v17, 0x0

    move/from16 v0, v17

    invoke-interface {v10, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [I

    .line 128
    .local v5, "fpsMinMax":[I
    const/16 v17, 0x0

    aget v17, v5, v17

    move/from16 v0, v17

    add-int/lit16 v0, v0, 0x3e7

    move/from16 v17, v0

    move/from16 v0, v17

    div-int/lit16 v14, v0, 0x3e8

    .line 129
    .local v14, "newFrameRate":I
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    .local v8, "i$":Ljava/util/Iterator;
    :cond_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_5

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [I

    .line 130
    .local v6, "fpsRange":[I
    const/16 v17, 0x0

    aget v17, v6, v17

    move/from16 v0, v17

    if-gt v0, v7, :cond_4

    const/16 v17, 0x1

    aget v17, v6, v17

    move/from16 v0, v17

    if-gt v7, v0, :cond_4

    .line 131
    move-object v5, v6

    .line 132
    move/from16 v14, p3

    .line 136
    .end local v6    # "fpsRange":[I
    :cond_5
    move/from16 p3, v14

    .line 137
    const-string v17, "VideoCapture"

    new-instance v18, Ljava/lang/StringBuilder;

    invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V

    const-string v19, "allocate: fps set to "

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    move-object/from16 v0, v18

    move/from16 v1, p3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v17 .. v18}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 140
    invoke-virtual {v15}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewSizes()Ljava/util/List;

    move-result-object v9

    .line 142
    .local v9, "listCameraSize":Ljava/util/List;, "Ljava/util/List<Landroid/hardware/Camera$Size;>;"
    const v13, 0x7fffffff

    .line 143
    .local v13, "minDiff":I
    move/from16 v12, p1

    .line 144
    .local v12, "matchedWidth":I
    move/from16 v11, p2

    .line 145
    .local v11, "matchedHeight":I
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_6
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_7

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Landroid/hardware/Camera$Size;

    .line 146
    .local v16, "size":Landroid/hardware/Camera$Size;
    move-object/from16 v0, v16

    iget v0, v0, Landroid/hardware/Camera$Size;->width:I

    move/from16 v17, v0

    sub-int v17, v17, p1

    invoke-static/range {v17 .. v17}, Ljava/lang/Math;->abs(I)I

    move-result v17

    move-object/from16 v0, v16

    iget v0, v0, Landroid/hardware/Camera$Size;->height:I

    move/from16 v18, v0

    sub-int v18, v18, p2

    invoke-static/range {v18 .. v18}, Ljava/lang/Math;->abs(I)I

    move-result v18

    add-int v3, v17, v18

    .line 148
    .local v3, "diff":I
    const-string v17, "VideoCapture"

    new-instance v18, Ljava/lang/StringBuilder;

    invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V

    const-string v19, "allocate: supported ("

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    move-object/from16 v0, v16

    iget v0, v0, Landroid/hardware/Camera$Size;->width:I

    move/from16 v19, v0

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v18

    const-string v19, ", "

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    move-object/from16 v0, v16

    iget v0, v0, Landroid/hardware/Camera$Size;->height:I

    move/from16 v19, v0

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v18

    const-string v19, "), diff="

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v17 .. v18}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 154
    if-ge v3, v13, :cond_6

    move-object/from16 v0, v16

    iget v0, v0, Landroid/hardware/Camera$Size;->width:I

    move/from16 v17, v0

    rem-int/lit8 v17, v17, 0x20

    if-nez v17, :cond_6

    .line 155
    move v13, v3

    .line 156
    move-object/from16 v0, v16

    iget v12, v0, Landroid/hardware/Camera$Size;->width:I

    .line 157
    move-object/from16 v0, v16

    iget v11, v0, Landroid/hardware/Camera$Size;->height:I

    goto :goto_1

    .line 160
    .end local v3    # "diff":I
    .end local v16    # "size":Landroid/hardware/Camera$Size;
    :cond_7
    const v17, 0x7fffffff

    move/from16 v0, v17

    if-ne v13, v0, :cond_8

    .line 161
    const-string v17, "VideoCapture"

    const-string v18, "allocate: can not find a multiple-of-32 resolution"

    invoke-static/range {v17 .. v18}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 162
    const/16 v17, 0x0

    goto/16 :goto_0

    .line 164
    :cond_8
    const-string v17, "VideoCapture"

    new-instance v18, Ljava/lang/StringBuilder;

    invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V

    const-string v19, "allocate: matched ("

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v18

    const-string v19, "x"

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v18

    const-string v19, ")"

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v17 .. v18}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 166
    invoke-virtual {v15}, Landroid/hardware/Camera$Parameters;->isVideoStabilizationSupported()Z

    move-result v17

    if-eqz v17, :cond_9

    .line 167
    const-string v17, "VideoCapture"

    new-instance v18, Ljava/lang/StringBuilder;

    invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V

    const-string v19, "Image stabilization supported, currently: "

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual {v15}, Landroid/hardware/Camera$Parameters;->getVideoStabilization()Z

    move-result v19

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v18

    const-string v19, ", setting it."

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v17 .. v18}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 169
    const/16 v17, 0x1

    move/from16 v0, v17

    invoke-virtual {v15, v0}, Landroid/hardware/Camera$Parameters;->setVideoStabilization(Z)V

    .line 174
    :goto_2
    move-object/from16 v0, p0

    move/from16 v1, p3

    invoke-virtual {v0, v12, v11, v1, v15}, Lorg/chromium/media/VideoCapture;->setCaptureParameters(IIILandroid/hardware/Camera$Parameters;)V

    .line 175
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/media/VideoCapture;->mCaptureFormat:Lorg/chromium/media/VideoCapture$CaptureFormat;

    move-object/from16 v17, v0

    move-object/from16 v0, v17

    iget v0, v0, Lorg/chromium/media/VideoCapture$CaptureFormat;->mWidth:I

    move/from16 v17, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/media/VideoCapture;->mCaptureFormat:Lorg/chromium/media/VideoCapture$CaptureFormat;

    move-object/from16 v18, v0

    move-object/from16 v0, v18

    iget v0, v0, Lorg/chromium/media/VideoCapture$CaptureFormat;->mHeight:I

    move/from16 v18, v0

    move/from16 v0, v17

    move/from16 v1, v18

    invoke-virtual {v15, v0, v1}, Landroid/hardware/Camera$Parameters;->setPreviewSize(II)V

    .line 177
    const/16 v17, 0x0

    aget v17, v5, v17

    const/16 v18, 0x1

    aget v18, v5, v18

    move/from16 v0, v17

    move/from16 v1, v18

    invoke-virtual {v15, v0, v1}, Landroid/hardware/Camera$Parameters;->setPreviewFpsRange(II)V

    .line 178
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/media/VideoCapture;->mCaptureFormat:Lorg/chromium/media/VideoCapture$CaptureFormat;

    move-object/from16 v17, v0

    move-object/from16 v0, v17

    iget v0, v0, Lorg/chromium/media/VideoCapture$CaptureFormat;->mPixelFormat:I

    move/from16 v17, v0

    move/from16 v0, v17

    invoke-virtual {v15, v0}, Landroid/hardware/Camera$Parameters;->setPreviewFormat(I)V

    .line 180
    :try_start_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/media/VideoCapture;->mCamera:Landroid/hardware/Camera;

    move-object/from16 v17, v0

    move-object/from16 v0, v17

    invoke-virtual {v0, v15}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 188
    const/16 v17, 0x1

    move/from16 v0, v17

    new-array v0, v0, [I

    move-object/from16 v17, v0

    move-object/from16 v0, v17

    move-object/from16 v1, p0

    iput-object v0, v1, Lorg/chromium/media/VideoCapture;->mGlTextures:[I

    .line 190
    const/16 v17, 0x1

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/media/VideoCapture;->mGlTextures:[I

    move-object/from16 v18, v0

    const/16 v19, 0x0

    invoke-static/range {v17 .. v19}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 191
    const v17, 0x8d65

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/media/VideoCapture;->mGlTextures:[I

    move-object/from16 v18, v0

    const/16 v19, 0x0

    aget v18, v18, v19

    invoke-static/range {v17 .. v18}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 193
    const v17, 0x8d65

    const/16 v18, 0x2801

    const v19, 0x46180400    # 9729.0f

    invoke-static/range {v17 .. v19}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 195
    const v17, 0x8d65

    const/16 v18, 0x2800

    const v19, 0x46180400    # 9729.0f

    invoke-static/range {v17 .. v19}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 198
    const v17, 0x8d65

    const/16 v18, 0x2802

    const v19, 0x812f

    invoke-static/range {v17 .. v19}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 200
    const v17, 0x8d65

    const/16 v18, 0x2803

    const v19, 0x812f

    invoke-static/range {v17 .. v19}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 203
    new-instance v17, Landroid/graphics/SurfaceTexture;

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/media/VideoCapture;->mGlTextures:[I

    move-object/from16 v18, v0

    const/16 v19, 0x0

    aget v18, v18, v19

    invoke-direct/range {v17 .. v18}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    move-object/from16 v0, v17

    move-object/from16 v1, p0

    iput-object v0, v1, Lorg/chromium/media/VideoCapture;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    .line 204
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/media/VideoCapture;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    move-object/from16 v17, v0

    const/16 v18, 0x0

    invoke-virtual/range {v17 .. v18}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    .line 206
    :try_start_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/media/VideoCapture;->mCamera:Landroid/hardware/Camera;

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/chromium/media/VideoCapture;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    move-object/from16 v18, v0

    invoke-virtual/range {v17 .. v18}, Landroid/hardware/Camera;->setPreviewTexture(Landroid/graphics/SurfaceTexture;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 212
    invoke-virtual/range {p0 .. p0}, Lorg/chromium/media/VideoCapture;->allocateBuffers()V

    .line 213
    const/16 v17, 0x1

    goto/16 :goto_0

    .line 171
    :cond_9
    const-string v17, "VideoCapture"

    const-string v18, "Image stabilization not supported."

    invoke-static/range {v17 .. v18}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_2

    .line 181
    :catch_1
    move-exception v4

    .line 182
    .restart local v4    # "ex":Ljava/lang/RuntimeException;
    const-string v17, "VideoCapture"

    new-instance v18, Ljava/lang/StringBuilder;

    invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V

    const-string v19, "setParameters: "

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v17 .. v18}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 183
    const/16 v17, 0x0

    goto/16 :goto_0

    .line 207
    .end local v4    # "ex":Ljava/lang/RuntimeException;
    :catch_2
    move-exception v4

    .line 208
    .local v4, "ex":Ljava/io/IOException;
    const-string v17, "VideoCapture"

    new-instance v18, Ljava/lang/StringBuilder;

    invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V

    const-string v19, "allocate: "

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v17 .. v18}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 209
    const/16 v17, 0x0

    goto/16 :goto_0
.end method

.method abstract allocateBuffers()V
.end method

.method public deallocate()V
    .locals 4
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 266
    iget-object v1, p0, Lorg/chromium/media/VideoCapture;->mCamera:Landroid/hardware/Camera;

    if-nez v1, :cond_0

    .line 281
    :goto_0
    return-void

    .line 269
    :cond_0
    invoke-virtual {p0}, Lorg/chromium/media/VideoCapture;->stopCapture()I

    .line 271
    :try_start_0
    iget-object v1, p0, Lorg/chromium/media/VideoCapture;->mCamera:Landroid/hardware/Camera;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/hardware/Camera;->setPreviewTexture(Landroid/graphics/SurfaceTexture;)V

    .line 272
    iget-object v1, p0, Lorg/chromium/media/VideoCapture;->mGlTextures:[I

    if-eqz v1, :cond_1

    .line 273
    const/4 v1, 0x1

    iget-object v2, p0, Lorg/chromium/media/VideoCapture;->mGlTextures:[I

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    .line 274
    :cond_1
    const/4 v1, 0x0

    iput-object v1, p0, Lorg/chromium/media/VideoCapture;->mCaptureFormat:Lorg/chromium/media/VideoCapture$CaptureFormat;

    .line 275
    iget-object v1, p0, Lorg/chromium/media/VideoCapture;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v1}, Landroid/hardware/Camera;->release()V

    .line 276
    const/4 v1, 0x0

    iput-object v1, p0, Lorg/chromium/media/VideoCapture;->mCamera:Landroid/hardware/Camera;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 277
    :catch_0
    move-exception v0

    .line 278
    .local v0, "ex":Ljava/io/IOException;
    const-string v1, "VideoCapture"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deallocate: failed to deallocate camera, "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public getColorspace()I
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 316
    iget-object v0, p0, Lorg/chromium/media/VideoCapture;->mCaptureFormat:Lorg/chromium/media/VideoCapture$CaptureFormat;

    iget v0, v0, Lorg/chromium/media/VideoCapture$CaptureFormat;->mPixelFormat:I

    sparse-switch v0, :sswitch_data_0

    .line 323
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 318
    :sswitch_0
    const v0, 0x32315659

    goto :goto_0

    .line 320
    :sswitch_1
    const/16 v0, 0x11

    goto :goto_0

    .line 316
    :sswitch_data_0
    .sparse-switch
        0x11 -> :sswitch_1
        0x32315659 -> :sswitch_0
    .end sparse-switch
.end method

.method protected getDeviceOrientation()I
    .locals 4

    .prologue
    .line 328
    const/4 v0, 0x0

    .line 329
    .local v0, "orientation":I
    iget-object v2, p0, Lorg/chromium/media/VideoCapture;->mContext:Landroid/content/Context;

    if-eqz v2, :cond_0

    .line 330
    iget-object v2, p0, Lorg/chromium/media/VideoCapture;->mContext:Landroid/content/Context;

    const-string v3, "window"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/WindowManager;

    .line 332
    .local v1, "wm":Landroid/view/WindowManager;
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Display;->getRotation()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    .line 344
    const/4 v0, 0x0

    .line 348
    .end local v1    # "wm":Landroid/view/WindowManager;
    :cond_0
    :goto_0
    return v0

    .line 334
    .restart local v1    # "wm":Landroid/view/WindowManager;
    :pswitch_0
    const/16 v0, 0x5a

    .line 335
    goto :goto_0

    .line 337
    :pswitch_1
    const/16 v0, 0xb4

    .line 338
    goto :goto_0

    .line 340
    :pswitch_2
    const/16 v0, 0x10e

    .line 341
    goto :goto_0

    .line 332
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public native nativeOnFrameAvailable(J[BII)V
.end method

.method public queryFrameRate()I
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 311
    iget-object v0, p0, Lorg/chromium/media/VideoCapture;->mCaptureFormat:Lorg/chromium/media/VideoCapture$CaptureFormat;

    iget v0, v0, Lorg/chromium/media/VideoCapture$CaptureFormat;->mFramerate:I

    return v0
.end method

.method public queryHeight()I
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 306
    iget-object v0, p0, Lorg/chromium/media/VideoCapture;->mCaptureFormat:Lorg/chromium/media/VideoCapture$CaptureFormat;

    iget v0, v0, Lorg/chromium/media/VideoCapture$CaptureFormat;->mHeight:I

    return v0
.end method

.method public queryWidth()I
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 301
    iget-object v0, p0, Lorg/chromium/media/VideoCapture;->mCaptureFormat:Lorg/chromium/media/VideoCapture$CaptureFormat;

    iget v0, v0, Lorg/chromium/media/VideoCapture$CaptureFormat;->mWidth:I

    return v0
.end method

.method abstract setCaptureParameters(IIILandroid/hardware/Camera$Parameters;)V
.end method

.method abstract setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V
.end method

.method public startCapture()I
    .locals 5
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    const/4 v2, 0x0

    const/4 v1, -0x1

    .line 218
    iget-object v3, p0, Lorg/chromium/media/VideoCapture;->mCamera:Landroid/hardware/Camera;

    if-nez v3, :cond_0

    .line 219
    const-string v2, "VideoCapture"

    const-string v3, "startCapture: camera is null"

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 239
    :goto_0
    return v1

    .line 223
    :cond_0
    iget-object v3, p0, Lorg/chromium/media/VideoCapture;->mPreviewBufferLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 225
    :try_start_0
    iget-boolean v3, p0, Lorg/chromium/media/VideoCapture;->mIsRunning:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_1

    .line 230
    iget-object v1, p0, Lorg/chromium/media/VideoCapture;->mPreviewBufferLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    move v1, v2

    goto :goto_0

    .line 228
    :cond_1
    const/4 v3, 0x1

    :try_start_1
    iput-boolean v3, p0, Lorg/chromium/media/VideoCapture;->mIsRunning:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 230
    iget-object v3, p0, Lorg/chromium/media/VideoCapture;->mPreviewBufferLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 232
    invoke-virtual {p0, p0}, Lorg/chromium/media/VideoCapture;->setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V

    .line 234
    :try_start_2
    iget-object v3, p0, Lorg/chromium/media/VideoCapture;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v3}, Landroid/hardware/Camera;->startPreview()V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    move v1, v2

    .line 239
    goto :goto_0

    .line 230
    :catchall_0
    move-exception v1

    iget-object v2, p0, Lorg/chromium/media/VideoCapture;->mPreviewBufferLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v1

    .line 235
    :catch_0
    move-exception v0

    .line 236
    .local v0, "ex":Ljava/lang/RuntimeException;
    const-string v2, "VideoCapture"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "startCapture: Camera.startPreview: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public stopCapture()I
    .locals 3
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 244
    iget-object v0, p0, Lorg/chromium/media/VideoCapture;->mCamera:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    .line 245
    const-string v0, "VideoCapture"

    const-string v1, "stopCapture: camera is null"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 261
    :goto_0
    return v2

    .line 249
    :cond_0
    iget-object v0, p0, Lorg/chromium/media/VideoCapture;->mPreviewBufferLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 251
    :try_start_0
    iget-boolean v0, p0, Lorg/chromium/media/VideoCapture;->mIsRunning:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    .line 256
    iget-object v0, p0, Lorg/chromium/media/VideoCapture;->mPreviewBufferLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_0

    .line 254
    :cond_1
    const/4 v0, 0x0

    :try_start_1
    iput-boolean v0, p0, Lorg/chromium/media/VideoCapture;->mIsRunning:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 256
    iget-object v0, p0, Lorg/chromium/media/VideoCapture;->mPreviewBufferLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 259
    iget-object v0, p0, Lorg/chromium/media/VideoCapture;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V

    .line 260
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/chromium/media/VideoCapture;->setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V

    goto :goto_0

    .line 256
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lorg/chromium/media/VideoCapture;->mPreviewBufferLock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
.end method
