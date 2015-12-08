.class public Ljp/co/cyberagent/android/gpuimage/GPUImage;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static __glMaxTextureSize:I


# instance fields
.field private final mContext:Landroid/content/Context;

.field private mCurrentBitmap:Landroid/graphics/Bitmap;

.field private mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

.field private mGlSurfaceView:Landroid/opengl/GLSurfaceView;

.field public final mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

.field private mScaleType:Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 64
    const/4 v0, 0x0

    sput v0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->__glMaxTextureSize:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;->CENTER_INSIDE:Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mScaleType:Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;

    .line 92
    invoke-direct {p0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->supportsOpenGLES2(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 93
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "OpenGL ES 2.0 is not supported on this phone."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 96
    :cond_0
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mContext:Landroid/content/Context;

    .line 97
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    invoke-direct {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;-><init>()V

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 98
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    invoke-direct {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    .line 99
    return-void
.end method

.method static synthetic access$000(Ljp/co/cyberagent/android/gpuimage/GPUImage;)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    return-object v0
.end method

.method static synthetic access$100(Ljp/co/cyberagent/android/gpuimage/GPUImage;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$400(Ljp/co/cyberagent/android/gpuimage/GPUImage;)I
    .locals 1

    .prologue
    .line 63
    invoke-direct {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->getOutputWidth()I

    move-result v0

    return v0
.end method

.method static synthetic access$500(Ljp/co/cyberagent/android/gpuimage/GPUImage;)I
    .locals 1

    .prologue
    .line 63
    invoke-direct {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->getOutputHeight()I

    move-result v0

    return v0
.end method

.method static synthetic access$600(Ljp/co/cyberagent/android/gpuimage/GPUImage;)Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mScaleType:Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;

    return-object v0
.end method

.method public static getBitmapForMultipleFilters(Landroid/graphics/Bitmap;Ljava/util/List;Ljp/co/cyberagent/android/gpuimage/GPUImage$ResponseListener;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Ljava/util/List",
            "<",
            "Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;",
            ">;",
            "Ljp/co/cyberagent/android/gpuimage/GPUImage$ResponseListener",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 490
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 505
    :goto_0
    return-void

    .line 493
    :cond_0
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    invoke-direct {v1, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    .line 494
    invoke-virtual {v1, p0, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->setImageBitmap(Landroid/graphics/Bitmap;Z)V

    .line 495
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    invoke-direct {v2, v0, v3}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;-><init>(II)V

    .line 496
    invoke-virtual {v2, v1}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    .line 498
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 499
    invoke-virtual {v1, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->setFilter(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    .line 500
    invoke-virtual {v2}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-interface {p2, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImage$ResponseListener;->response(Ljava/lang/Object;)V

    .line 501
    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->destroy()V

    goto :goto_1

    .line 503
    :cond_1
    invoke-virtual {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->deleteImage()V

    .line 504
    invoke-virtual {v2}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->destroy()V

    goto :goto_0
.end method

.method public static getGlMaxTextureSize()I
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 74
    sget v0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->__glMaxTextureSize:I

    if-gtz v0, :cond_0

    .line 75
    const/4 v0, 0x1

    new-array v0, v0, [I

    .line 76
    const/16 v1, 0xd33

    invoke-static {v1, v0, v2}, Landroid/opengl/GLES20;->glGetIntegerv(I[II)V

    .line 78
    aget v0, v0, v2

    sput v0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->__glMaxTextureSize:I

    .line 81
    :cond_0
    sget v0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->__glMaxTextureSize:I

    .line 83
    return v0
.end method

.method private getOutputHeight()I
    .locals 2

    .prologue
    .line 571
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->getFrameHeight()I

    move-result v0

    if-eqz v0, :cond_0

    .line 572
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->getFrameHeight()I

    move-result v0

    .line 579
    :goto_0
    return v0

    .line 573
    :cond_0
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mCurrentBitmap:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    .line 574
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mCurrentBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    goto :goto_0

    .line 576
    :cond_1
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mContext:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    .line 578
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 579
    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v0

    goto :goto_0
.end method

.method private getOutputWidth()I
    .locals 2

    .prologue
    .line 558
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->getFrameWidth()I

    move-result v0

    if-eqz v0, :cond_0

    .line 559
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->getFrameWidth()I

    move-result v0

    .line 566
    :goto_0
    return v0

    .line 560
    :cond_0
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mCurrentBitmap:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    .line 561
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mCurrentBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    goto :goto_0

    .line 563
    :cond_1
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mContext:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    .line 565
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 566
    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v0

    goto :goto_0
.end method

.method private getPath(Landroid/net/Uri;)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 317
    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    const-string v1, "_data"

    aput-object v1, v2, v0

    .line 320
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    move-object v1, p1

    move-object v4, v3

    move-object v5, v3

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 322
    const-string v1, "_data"

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v1

    .line 324
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 325
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 327
    :cond_0
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 328
    return-object v3
.end method

.method private setUpCameraGingerbread(Landroid/hardware/Camera;)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    .line 185
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->setUpSurfaceTexture(Landroid/hardware/Camera;)V

    .line 186
    return-void
.end method

.method private supportsOpenGLES2(Landroid/content/Context;)Z
    .locals 2

    .prologue
    .line 108
    const-string v0, "activity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    .line 110
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getDeviceConfigurationInfo()Landroid/content/pm/ConfigurationInfo;

    move-result-object v0

    .line 112
    iget v0, v0, Landroid/content/pm/ConfigurationInfo;->reqGlEsVersion:I

    const/high16 v1, 0x20000

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public clearDrawQueue()V
    .locals 1

    .prologue
    .line 206
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    if-eqz v0, :cond_0

    .line 207
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->getDrawQueue()Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Queue;->clear()V

    .line 208
    :cond_0
    return-void
.end method

.method public closeBlendMode()V
    .locals 1

    .prologue
    .line 313
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->closeBlendMode()V

    .line 314
    return-void
.end method

.method public deleteBufferDirectly()V
    .locals 1

    .prologue
    .line 287
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->deleteBufferDirectly()V

    .line 288
    return-void
.end method

.method public deleteCameraImage()V
    .locals 1

    .prologue
    .line 202
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    if-eqz v0, :cond_0

    .line 203
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->deleteCameraImage()V

    .line 204
    :cond_0
    return-void
.end method

.method public deleteFilter()V
    .locals 4

    .prologue
    .line 926
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImage$4;

    invoke-direct {v1, p0}, Ljp/co/cyberagent/android/gpuimage/GPUImage$4;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImage;)V

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->runOnDraw(Ljava/lang/Runnable;)V

    .line 936
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    monitor-enter v1

    .line 937
    :try_start_0
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->requestRender()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 939
    :try_start_1
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v2, v3}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 943
    :goto_0
    :try_start_2
    monitor-exit v1

    return-void

    .line 941
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0

    .line 943
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public deleteImage()V
    .locals 1

    .prologue
    .line 281
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->deleteImage()V

    .line 282
    const/4 v0, 0x0

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mCurrentBitmap:Landroid/graphics/Bitmap;

    .line 284
    return-void
.end method

.method public getBitmapWithFilterApplied()Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 337
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mCurrentBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->getBitmapWithFilterApplied(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public getBitmapWithFilterApplied(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 421
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mGlSurfaceView:Landroid/opengl/GLSurfaceView;

    if-eqz v0, :cond_0

    .line 422
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->deleteImage()V

    .line 423
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImage$3;

    invoke-direct {v1, p0}, Ljp/co/cyberagent/android/gpuimage/GPUImage$3;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImage;)V

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->runOnDraw(Ljava/lang/Runnable;)V

    .line 433
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    monitor-enter v1

    .line 434
    :try_start_0
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->requestRender()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 436
    :try_start_1
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 440
    :goto_0
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 443
    :cond_0
    new-instance v2, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    invoke-direct {v2, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    .line 444
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->NORMAL:Ljp/co/cyberagent/android/gpuimage/Rotation;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->isFlippedHorizontally()Z

    move-result v1

    iget-object v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->isFlippedVertically()Z

    move-result v3

    invoke-virtual {v2, v0, v1, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V

    .line 446
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mScaleType:Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;

    invoke-virtual {v2, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->setScaleType(Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;)V

    .line 447
    iput-boolean v4, v2, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mSave:Z

    .line 450
    :try_start_3
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    invoke-direct {v0, v1, v3}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;-><init>(II)V
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_1

    .line 462
    :goto_1
    invoke-virtual {v0, v2}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    .line 463
    invoke-virtual {v2, p1, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->setImageBitmap(Landroid/graphics/Bitmap;Z)V

    .line 464
    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    .line 465
    iget-object v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    invoke-virtual {v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->destroy()V

    .line 466
    invoke-virtual {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->deleteImage()V

    .line 467
    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->destroy()V

    .line 469
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    invoke-virtual {v0, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->setFilter(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    .line 470
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mCurrentBitmap:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mCurrentBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 471
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mCurrentBitmap:Landroid/graphics/Bitmap;

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->setImageBitmap(Landroid/graphics/Bitmap;Z)V

    .line 473
    :cond_1
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->requestRender()V

    move-object v0, v1

    .line 475
    :goto_2
    return-object v0

    .line 438
    :catch_0
    move-exception v0

    :try_start_4
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0

    .line 440
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0

    .line 452
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    .line 454
    :try_start_5
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    invoke-direct {v0, v1, v3}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;-><init>(II)V
    :try_end_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_1

    .line 456
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    .line 457
    const/4 v0, 0x0

    goto :goto_2
.end method

.method public getBitmapWithFilterApplied2(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 8

    .prologue
    const/4 v4, 0x1

    .line 349
    :try_start_0
    new-instance v6, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    invoke-direct {v6, v0, v1}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;-><init>(II)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 354
    new-instance v7, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    invoke-direct {v7, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    .line 356
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->NORMAL:Ljp/co/cyberagent/android/gpuimage/Rotation;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->isFlippedHorizontally()Z

    move-result v1

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->isFlippedVertically()Z

    move-result v2

    invoke-virtual {v7, v0, v1, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V

    .line 358
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mScaleType:Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;

    invoke-virtual {v7, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->setScaleType(Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;)V

    .line 359
    iput-boolean v4, v7, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mSave:Z

    .line 361
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    .line 362
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    .line 364
    invoke-virtual {v6, v7}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    .line 365
    invoke-virtual {v7, p1, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->setImageBitmap(Landroid/graphics/Bitmap;Z)V

    .line 366
    new-instance v5, Ljava/util/concurrent/Semaphore;

    const/4 v0, 0x0

    invoke-direct {v5, v0}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    .line 368
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImage$1;

    invoke-direct {v0, p0}, Ljp/co/cyberagent/android/gpuimage/GPUImage$1;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImage;)V

    invoke-virtual {v7, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->runOnDrawEnd(Ljava/lang/Runnable;)V

    .line 377
    invoke-virtual {v7}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->deleteImageEnd()V

    .line 378
    mul-int v0, v2, v3

    new-array v4, v0, [I

    .line 379
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImage$2;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Ljp/co/cyberagent/android/gpuimage/GPUImage$2;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImage;II[ILjava/util/concurrent/Semaphore;)V

    invoke-virtual {v7, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->runOnDrawEnd(Ljava/lang/Runnable;)V

    .line 398
    iget-object v0, v6, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mGL:Ljavax/microedition/khronos/opengles/GL10;

    invoke-virtual {v7, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V

    .line 401
    :try_start_1
    invoke-virtual {v5}, Ljava/util/concurrent/Semaphore;->acquire()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 407
    :goto_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v3, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 408
    invoke-static {v4}, Ljava/nio/IntBuffer;->wrap([I)Ljava/nio/IntBuffer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->copyPixelsFromBuffer(Ljava/nio/Buffer;)V

    .line 411
    :goto_1
    return-object v0

    .line 351
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_1

    .line 404
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0
.end method

.method public openBlendMode()V
    .locals 1

    .prologue
    .line 309
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->openBlendMode()V

    .line 310
    return-void
.end method

.method public pause()V
    .locals 2

    .prologue
    .line 211
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    if-eqz v0, :cond_0

    .line 212
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mPause:Z

    .line 213
    :cond_0
    return-void
.end method

.method public requestRender()V
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mGlSurfaceView:Landroid/opengl/GLSurfaceView;

    if-eqz v0, :cond_0

    .line 138
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mGlSurfaceView:Landroid/opengl/GLSurfaceView;

    invoke-virtual {v0}, Landroid/opengl/GLSurfaceView;->requestRender()V

    .line 140
    :cond_0
    return-void
.end method

.method public resume()V
    .locals 2

    .prologue
    .line 216
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    if-eqz v0, :cond_0

    .line 217
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    const/4 v1, 0x0

    iput-boolean v1, v0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mPause:Z

    .line 218
    :cond_0
    return-void
.end method

.method public runOnGLThread(Ljava/lang/Runnable;)V
    .locals 1

    .prologue
    .line 554
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->runOnDrawEnd(Ljava/lang/Runnable;)V

    .line 555
    return-void
.end method

.method public saveToPictures(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Ljp/co/cyberagent/android/gpuimage/GPUImage$OnPictureSavedListener;)V
    .locals 6
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 545
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImage;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Ljp/co/cyberagent/android/gpuimage/GPUImage$OnPictureSavedListener;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImage$SaveTask;->execute([Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;

    .line 546
    return-void
.end method

.method public saveToPictures(Ljava/lang/String;Ljava/lang/String;Ljp/co/cyberagent/android/gpuimage/GPUImage$OnPictureSavedListener;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 524
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mCurrentBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {p0, v0, p1, p2, p3}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->saveToPictures(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Ljp/co/cyberagent/android/gpuimage/GPUImage$OnPictureSavedListener;)V

    .line 525
    return-void
.end method

.method public setDrawEndListener(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$OnDrawEndListener;)V
    .locals 1

    .prologue
    .line 922
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->setDrawEndListener(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$OnDrawEndListener;)V

    .line 923
    return-void
.end method

.method public setDrawListener(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$OnDrawDoneListener;)V
    .locals 1

    .prologue
    .line 918
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->setDrawListener(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$OnDrawDoneListener;)V

    .line 919
    return-void
.end method

.method public setFilter(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V
    .locals 2

    .prologue
    .line 226
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 227
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->setFilter(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    .line 229
    return-void
.end method

.method public setGLSurfaceView(Landroid/opengl/GLSurfaceView;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/16 v1, 0x8

    .line 121
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mGlSurfaceView:Landroid/opengl/GLSurfaceView;

    .line 122
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mGlSurfaceView:Landroid/opengl/GLSurfaceView;

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Landroid/opengl/GLSurfaceView;->setEGLContextClientVersion(I)V

    .line 124
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mGlSurfaceView:Landroid/opengl/GLSurfaceView;

    const/16 v5, 0x10

    move v2, v1

    move v3, v1

    move v4, v1

    invoke-virtual/range {v0 .. v6}, Landroid/opengl/GLSurfaceView;->setEGLConfigChooser(IIIIII)V

    .line 125
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mGlSurfaceView:Landroid/opengl/GLSurfaceView;

    invoke-virtual {v0}, Landroid/opengl/GLSurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->setFormat(I)V

    .line 127
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mGlSurfaceView:Landroid/opengl/GLSurfaceView;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v0, v1}, Landroid/opengl/GLSurfaceView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    .line 129
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mGlSurfaceView:Landroid/opengl/GLSurfaceView;

    invoke-virtual {v0, v6}, Landroid/opengl/GLSurfaceView;->setRenderMode(I)V

    .line 131
    return-void
.end method

.method public setImage(Landroid/graphics/Bitmap;)V
    .locals 2

    .prologue
    .line 237
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mCurrentBitmap:Landroid/graphics/Bitmap;

    .line 238
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->setImageBitmap(Landroid/graphics/Bitmap;Z)V

    .line 239
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->requestRender()V

    .line 240
    return-void
.end method

.method public setImage(Landroid/graphics/Bitmap;Z)V
    .locals 1

    .prologue
    .line 248
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mCurrentBitmap:Landroid/graphics/Bitmap;

    .line 249
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v0, p1, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->setImageBitmap(Landroid/graphics/Bitmap;Z)V

    .line 250
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->requestRender()V

    .line 251
    return-void
.end method

.method public setImage(Landroid/net/Uri;)V
    .locals 2

    .prologue
    .line 296
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageUriTask;

    invoke-direct {v1, p0, p0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageUriTask;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImage;Ljp/co/cyberagent/android/gpuimage/GPUImage;Landroid/net/Uri;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 297
    return-void
.end method

.method public setImage(Ljava/io/File;Ljp/co/cyberagent/android/gpuimage/GPUImage$OnImageLoadDoneListener;)V
    .locals 2

    .prologue
    .line 305
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageFileTask;

    invoke-direct {v1, p0, p0, p1, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImage$LoadImageFileTask;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImage;Ljp/co/cyberagent/android/gpuimage/GPUImage;Ljava/io/File;Ljp/co/cyberagent/android/gpuimage/GPUImage$OnImageLoadDoneListener;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 306
    return-void
.end method

.method public setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;)V
    .locals 1

    .prologue
    .line 274
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;)V

    .line 275
    return-void
.end method

.method public setRotationCamera(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V
    .locals 1

    .prologue
    .line 190
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v0, p1, p2, p3}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->setRotationCamera(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V

    .line 191
    return-void
.end method

.method public setScaleType(Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;)V
    .locals 1

    .prologue
    .line 261
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mScaleType:Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;

    .line 262
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->setScaleType(Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;)V

    .line 263
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->deleteImage()V

    .line 264
    const/4 v0, 0x0

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mCurrentBitmap:Landroid/graphics/Bitmap;

    .line 265
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->requestRender()V

    .line 266
    return-void
.end method

.method public setUpCamera(Landroid/hardware/Camera;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 148
    invoke-virtual {p0, p1, v0, v0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->setUpCamera(Landroid/hardware/Camera;IZZ)V

    .line 149
    return-void
.end method

.method public setUpCamera(Landroid/hardware/Camera;IZZ)V
    .locals 2

    .prologue
    .line 162
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xa

    if-le v0, v1, :cond_0

    .line 163
    invoke-direct {p0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->setUpCameraGingerbread(Landroid/hardware/Camera;)V

    .line 168
    :goto_0
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->NORMAL:Ljp/co/cyberagent/android/gpuimage/Rotation;

    .line 169
    sparse-switch p2, :sswitch_data_0

    .line 180
    :goto_1
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {v1, v0, p3, p4}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->setRotationCamera(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V

    .line 181
    return-void

    .line 165
    :cond_0
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    invoke-virtual {p1, v0}, Landroid/hardware/Camera;->setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V

    .line 166
    invoke-virtual {p1}, Landroid/hardware/Camera;->startPreview()V

    goto :goto_0

    .line 171
    :sswitch_0
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->ROTATION_90:Ljp/co/cyberagent/android/gpuimage/Rotation;

    goto :goto_1

    .line 174
    :sswitch_1
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->ROTATION_180:Ljp/co/cyberagent/android/gpuimage/Rotation;

    goto :goto_1

    .line 177
    :sswitch_2
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->ROTATION_270:Ljp/co/cyberagent/android/gpuimage/Rotation;

    goto :goto_1

    .line 169
    :sswitch_data_0
    .sparse-switch
        0x5a -> :sswitch_0
        0xb4 -> :sswitch_1
        0x10e -> :sswitch_2
    .end sparse-switch
.end method

.method public startRender()V
    .locals 2

    .prologue
    .line 198
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mGlSurfaceView:Landroid/opengl/GLSurfaceView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/opengl/GLSurfaceView;->setRenderMode(I)V

    .line 199
    return-void
.end method

.method public stopRender()V
    .locals 2

    .prologue
    .line 194
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mGlSurfaceView:Landroid/opengl/GLSurfaceView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/opengl/GLSurfaceView;->setRenderMode(I)V

    .line 195
    return-void
.end method
