.class public Ljp/co/cyberagent/android/gpuimage/GPUImageView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field private bGalaxyYSeries:Z

.field private mContext:Landroid/content/Context;

.field private mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

.field public mForceSize:Ljp/co/cyberagent/android/gpuimage/GPUImageView$Size;

.field private mGLSurfaceView:Landroid/opengl/GLSurfaceView;

.field private mGPUImage:Ljp/co/cyberagent/android/gpuimage/GPUImage;

.field private mPictureListener:Ljp/co/cyberagent/android/gpuimage/GPUImageView$OnPictureSavedListener;

.field private mRatio:F

.field private mSaveTask:Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;

.field private mfile:Ljava/io/File;

.field private mlistener:Ljp/co/cyberagent/android/gpuimage/GPUImage$OnImageLoadDoneListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 54
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 43
    iput-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mForceSize:Ljp/co/cyberagent/android/gpuimage/GPUImageView$Size;

    .line 44
    const/4 v0, 0x0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mRatio:F

    .line 45
    iput-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mfile:Ljava/io/File;

    .line 50
    const/4 v0, 0x0

    iput-boolean v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->bGalaxyYSeries:Z

    .line 55
    invoke-direct {p0, p1, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 56
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 59
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 43
    iput-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mForceSize:Ljp/co/cyberagent/android/gpuimage/GPUImageView$Size;

    .line 44
    const/4 v0, 0x0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mRatio:F

    .line 45
    iput-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mfile:Ljava/io/File;

    .line 50
    const/4 v0, 0x0

    iput-boolean v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->bGalaxyYSeries:Z

    .line 60
    invoke-direct {p0, p1, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 61
    return-void
.end method

.method static synthetic access$000(Ljp/co/cyberagent/android/gpuimage/GPUImageView;)Landroid/opengl/GLSurfaceView;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGLSurfaceView:Landroid/opengl/GLSurfaceView;

    return-object v0
.end method

.method private init(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    .line 64
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$GPUImageGLSurfaceView;

    invoke-direct {v0, p0, p1, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImageView$GPUImageGLSurfaceView;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageView;Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGLSurfaceView:Landroid/opengl/GLSurfaceView;

    .line 65
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGLSurfaceView:Landroid/opengl/GLSurfaceView;

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->addView(Landroid/view/View;)V

    .line 66
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImage;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGPUImage:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    .line 67
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGPUImage:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGLSurfaceView:Landroid/opengl/GLSurfaceView;

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->setGLSurfaceView(Landroid/opengl/GLSurfaceView;)V

    .line 68
    return-void
.end method


# virtual methods
.method public cancelSavePicturesTask()V
    .locals 2

    .prologue
    .line 288
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mSaveTask:Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;->cancel(Z)Z

    .line 289
    return-void
.end method

.method public capture()Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    .line 415
    new-instance v5, Ljava/util/concurrent/Semaphore;

    const/4 v0, 0x0

    invoke-direct {v5, v0}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    .line 417
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGLSurfaceView:Landroid/opengl/GLSurfaceView;

    invoke-virtual {v0}, Landroid/opengl/GLSurfaceView;->getMeasuredWidth()I

    move-result v2

    .line 418
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGLSurfaceView:Landroid/opengl/GLSurfaceView;

    invoke-virtual {v0}, Landroid/opengl/GLSurfaceView;->getMeasuredHeight()I

    move-result v3

    .line 421
    mul-int v0, v2, v3

    new-array v4, v0, [I

    .line 422
    iget-object v6, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGPUImage:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$3;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageView$3;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageView;II[ILjava/util/concurrent/Semaphore;)V

    invoke-virtual {v6, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->runOnGLThread(Ljava/lang/Runnable;)V

    .line 438
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->requestRender()V

    .line 439
    invoke-virtual {v5}, Ljava/util/concurrent/Semaphore;->acquire()V

    .line 441
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v3, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 442
    invoke-static {v4}, Ljava/nio/IntBuffer;->wrap([I)Ljava/nio/IntBuffer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->copyPixelsFromBuffer(Ljava/nio/Buffer;)V

    .line 443
    return-object v0
.end method

.method public capture(II)Landroid/graphics/Bitmap;
    .locals 6

    .prologue
    .line 300
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 301
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Do not call this method from the UI thread!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 304
    :cond_0
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$Size;

    invoke-direct {v0, p1, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImageView$Size;-><init>(II)V

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mForceSize:Ljp/co/cyberagent/android/gpuimage/GPUImageView$Size;

    .line 306
    new-instance v1, Ljava/util/concurrent/Semaphore;

    const/4 v0, 0x0

    invoke-direct {v1, v0}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    .line 309
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGPUImage:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    iget-object v0, v0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    const/4 v2, 0x1

    iput-boolean v2, v0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGalaxyYCapture:Z

    .line 340
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$1;

    invoke-direct {v0, p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView$1;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageView;)V

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->post(Ljava/lang/Runnable;)Z

    .line 351
    :try_start_0
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGPUImage:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    iget-object v0, v0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    iget-object v2, v0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mSurfaceChangedWaiter:Ljava/lang/Object;

    monitor-enter v2
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 352
    :try_start_1
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGPUImage:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    iget-object v0, v0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    iget-object v0, v0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mSurfaceChangedWaiter:Ljava/lang/Object;

    const-wide/16 v4, 0xbb8

    invoke-virtual {v0, v4, v5}, Ljava/lang/Object;->wait(J)V

    .line 353
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 367
    :goto_0
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGPUImage:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageView$2;

    invoke-direct {v2, p0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageView$2;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageView;Ljava/util/concurrent/Semaphore;)V

    invoke-virtual {v0, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->runOnGLThread(Ljava/lang/Runnable;)V

    .line 373
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->requestRender()V

    .line 374
    invoke-virtual {v1}, Ljava/util/concurrent/Semaphore;->acquire()V

    .line 375
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->capture()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 406
    return-object v0

    .line 353
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v0
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0

    .line 355
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0
.end method

.method public closeBlendMode()V
    .locals 1

    .prologue
    .line 247
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGPUImage:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->closeBlendMode()V

    .line 248
    return-void
.end method

.method public deleteImage()V
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGPUImage:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->deleteImage()V

    .line 80
    return-void
.end method

.method public getFilter()Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
    .locals 1

    .prologue
    .line 187
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    return-object v0
.end method

.method public getGPUImage()Ljp/co/cyberagent/android/gpuimage/GPUImage;
    .locals 1

    .prologue
    .line 119
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGPUImage:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    return-object v0
.end method

.method public onAttachedToWindow()V
    .locals 0

    .prologue
    .line 124
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 125
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 130
    :try_start_0
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 134
    :goto_0
    return-void

    .line 132
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method protected onMeasure(II)V
    .locals 5

    .prologue
    const/high16 v4, 0x40000000    # 2.0f

    .line 87
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mRatio:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    .line 88
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 89
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 93
    int-to-float v2, v0

    iget v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mRatio:F

    div-float/2addr v2, v3

    int-to-float v3, v1

    cmpg-float v2, v2, v3

    if-gez v2, :cond_0

    .line 95
    int-to-float v1, v0

    iget v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mRatio:F

    div-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 101
    :goto_0
    invoke-static {v0, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 102
    invoke-static {v1, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 103
    invoke-super {p0, v0, v1}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 107
    :goto_1
    return-void

    .line 98
    :cond_0
    int-to-float v0, v1

    iget v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mRatio:F

    mul-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    goto :goto_0

    .line 105
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    goto :goto_1
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 450
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGLSurfaceView:Landroid/opengl/GLSurfaceView;

    invoke-virtual {v0}, Landroid/opengl/GLSurfaceView;->onPause()V

    .line 451
    return-void
.end method

.method public onResume()V
    .locals 3

    .prologue
    .line 457
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGLSurfaceView:Landroid/opengl/GLSurfaceView;

    invoke-virtual {v0}, Landroid/opengl/GLSurfaceView;->onResume()V

    .line 458
    iget-boolean v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->bGalaxyYSeries:Z

    if-nez v0, :cond_0

    .line 459
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGPUImage:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->deleteImage()V

    .line 460
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGPUImage:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mfile:Ljava/io/File;

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mlistener:Ljp/co/cyberagent/android/gpuimage/GPUImage$OnImageLoadDoneListener;

    invoke-virtual {v0, v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->setImage(Ljava/io/File;Ljp/co/cyberagent/android/gpuimage/GPUImage$OnImageLoadDoneListener;)V

    .line 463
    :cond_0
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    if-eqz v0, :cond_1

    .line 464
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->setFilter(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    .line 467
    :cond_1
    return-void
.end method

.method public openBlendMode()V
    .locals 1

    .prologue
    .line 243
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGPUImage:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->openBlendMode()V

    .line 244
    return-void
.end method

.method public releaseGLSurfaceView()V
    .locals 1

    .prologue
    .line 110
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGPUImage:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->deleteImage()V

    .line 111
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGPUImage:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->deleteFilter()V

    .line 112
    return-void
.end method

.method public requestRender()V
    .locals 1

    .prologue
    .line 238
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGLSurfaceView:Landroid/opengl/GLSurfaceView;

    invoke-virtual {v0}, Landroid/opengl/GLSurfaceView;->requestRender()V

    .line 239
    return-void
.end method

.method public saveToPictures(Ljava/lang/String;Ljava/lang/String;IILjp/co/cyberagent/android/gpuimage/GPUImageView$OnPictureSavedListener;)V
    .locals 7

    .prologue
    .line 283
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageView;Ljava/lang/String;Ljava/lang/String;IILjp/co/cyberagent/android/gpuimage/GPUImageView$OnPictureSavedListener;)V

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mSaveTask:Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;

    .line 284
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mSaveTask:Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;->execute([Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;

    .line 285
    return-void
.end method

.method public saveToPictures(Ljava/lang/String;Ljava/lang/String;Ljp/co/cyberagent/android/gpuimage/GPUImageView$OnPictureSavedListener;)V
    .locals 2

    .prologue
    .line 263
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;

    invoke-direct {v0, p0, p1, p2, p3}, Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageView;Ljava/lang/String;Ljava/lang/String;Ljp/co/cyberagent/android/gpuimage/GPUImageView$OnPictureSavedListener;)V

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mSaveTask:Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;

    .line 264
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mSaveTask:Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageView$SaveTask;->execute([Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;

    .line 265
    return-void
.end method

.method public setDrawEndListener(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$OnDrawEndListener;)V
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGPUImage:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {v0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->setDrawEndListener(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$OnDrawEndListener;)V

    .line 76
    return-void
.end method

.method public setDrawListener(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$OnDrawDoneListener;)V
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGPUImage:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {v0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->setDrawListener(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$OnDrawDoneListener;)V

    .line 72
    return-void
.end method

.method public setFile(Ljava/io/File;Ljp/co/cyberagent/android/gpuimage/GPUImage$OnImageLoadDoneListener;)V
    .locals 0

    .prologue
    .line 233
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mfile:Ljava/io/File;

    .line 234
    iput-object p2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mlistener:Ljp/co/cyberagent/android/gpuimage/GPUImage$OnImageLoadDoneListener;

    .line 235
    return-void
.end method

.method public setFilter(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V
    .locals 1

    .prologue
    .line 168
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 169
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGPUImage:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {v0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->setFilter(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    .line 171
    return-void
.end method

.method public setFilterNoApply(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V
    .locals 0

    .prologue
    .line 179
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 180
    return-void
.end method

.method public setGalaxyYSeries(Z)V
    .locals 0

    .prologue
    .line 83
    iput-boolean p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->bGalaxyYSeries:Z

    .line 84
    return-void
.end method

.method public setImage(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 196
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGPUImage:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {v0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->setImage(Landroid/graphics/Bitmap;)V

    .line 197
    return-void
.end method

.method public setImage(Landroid/graphics/Bitmap;Z)V
    .locals 1

    .prologue
    .line 205
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGPUImage:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {v0, p1, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->setImage(Landroid/graphics/Bitmap;Z)V

    .line 206
    return-void
.end method

.method public setImage(Landroid/net/Uri;)V
    .locals 1

    .prologue
    .line 215
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGPUImage:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {v0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->setImage(Landroid/net/Uri;)V

    .line 216
    return-void
.end method

.method public setImage(Ljava/io/File;Ljp/co/cyberagent/android/gpuimage/GPUImage$OnImageLoadDoneListener;)V
    .locals 1

    .prologue
    .line 224
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGPUImage:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {v0, p1, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->setImage(Ljava/io/File;Ljp/co/cyberagent/android/gpuimage/GPUImage$OnImageLoadDoneListener;)V

    .line 225
    return-void
.end method

.method public setRatio(F)V
    .locals 1

    .prologue
    .line 138
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mRatio:F

    .line 139
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGLSurfaceView:Landroid/opengl/GLSurfaceView;

    invoke-virtual {v0}, Landroid/opengl/GLSurfaceView;->requestLayout()V

    .line 140
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGPUImage:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->deleteImage()V

    .line 141
    return-void
.end method

.method public setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;)V
    .locals 1

    .prologue
    .line 158
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGPUImage:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {v0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;)V

    .line 159
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->requestRender()V

    .line 160
    return-void
.end method

.method public setScaleType(Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;)V
    .locals 1

    .prologue
    .line 149
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->mGPUImage:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {v0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->setScaleType(Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;)V

    .line 150
    return-void
.end method
