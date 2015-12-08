.class public Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/Camera$PreviewCallback;
.implements Landroid/opengl/GLSurfaceView$Renderer;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xb
.end annotation


# static fields
.field static final CUBE:[F

.field public static final NO_IMAGE:I = -0x1


# instance fields
.field private cameraParams:Landroid/hardware/Camera$Parameters;

.field private mAddedPadding:I

.field protected mDrawEndListener:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$OnDrawEndListener;

.field protected mDrawListener:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$OnDrawDoneListener;

.field private mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

.field private mFlipHorizontal:Z

.field private mFlipVertical:Z

.field private final mGLCubeBuffer:Ljava/nio/FloatBuffer;

.field private mGLRgbBuffer:Ljava/nio/IntBuffer;

.field private final mGLTextureBuffer:Ljava/nio/FloatBuffer;

.field private mGLTextureId:I

.field public mGalaxyYCapture:Z

.field private mImageHeight:I

.field private mImageWidth:I

.field private mOutputHeight:I

.field private mOutputWidth:I

.field public mPause:Z

.field private mRotation:Ljp/co/cyberagent/android/gpuimage/Rotation;

.field private final mRunOnDraw:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private final mRunOnDrawEnd:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field public mSave:Z

.field private mScaleType:Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;

.field public final mSurfaceChangedWaiter:Ljava/lang/Object;

.field private mSurfaceTexture:Landroid/graphics/SurfaceTexture;

.field public waiter:Ljava/util/concurrent/Semaphore;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 49
    const/16 v0, 0x8

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    sput-object v0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->CUBE:[F

    return-void

    :array_0
    .array-data 4
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mSurfaceChangedWaiter:Ljava/lang/Object;

    .line 60
    const/4 v0, -0x1

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLTextureId:I

    .line 61
    const/4 v0, 0x0

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    .line 77
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;->CENTER_INSIDE:Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mScaleType:Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;

    .line 81
    iput-boolean v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGalaxyYCapture:Z

    .line 82
    iput-boolean v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mSave:Z

    .line 83
    iput-boolean v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mPause:Z

    .line 98
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 99
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mRunOnDraw:Ljava/util/Queue;

    .line 100
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mRunOnDrawEnd:Ljava/util/Queue;

    .line 102
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->CUBE:[F

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLCubeBuffer:Ljava/nio/FloatBuffer;

    .line 105
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLCubeBuffer:Ljava/nio/FloatBuffer;

    sget-object v1, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->CUBE:[F

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 107
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/util/TextureRotationUtil;->TEXTURE_NO_ROTATION:[F

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLTextureBuffer:Ljava/nio/FloatBuffer;

    .line 110
    sget-object v0, Ljp/co/cyberagent/android/gpuimage/Rotation;->NORMAL:Ljp/co/cyberagent/android/gpuimage/Rotation;

    invoke-virtual {p0, v0, v2, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V

    .line 111
    return-void
.end method

.method static synthetic access$000(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)I
    .locals 1

    .prologue
    .line 47
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mImageWidth:I

    return v0
.end method

.method static synthetic access$002(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;I)I
    .locals 0

    .prologue
    .line 47
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mImageWidth:I

    return p1
.end method

.method static synthetic access$100(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)I
    .locals 1

    .prologue
    .line 47
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mImageHeight:I

    return v0
.end method

.method static synthetic access$1000(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)I
    .locals 1

    .prologue
    .line 47
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mOutputHeight:I

    return v0
.end method

.method static synthetic access$102(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;I)I
    .locals 0

    .prologue
    .line 47
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mImageHeight:I

    return p1
.end method

.method static synthetic access$1102(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;I)I
    .locals 0

    .prologue
    .line 47
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mAddedPadding:I

    return p1
.end method

.method static synthetic access$200(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->deleteTextureImage()V

    return-void
.end method

.method static synthetic access$300(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)Ljava/nio/IntBuffer;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLRgbBuffer:Ljava/nio/IntBuffer;

    return-object v0
.end method

.method static synthetic access$302(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;Ljava/nio/IntBuffer;)Ljava/nio/IntBuffer;
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLRgbBuffer:Ljava/nio/IntBuffer;

    return-object p1
.end method

.method static synthetic access$400(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)I
    .locals 1

    .prologue
    .line 47
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLTextureId:I

    return v0
.end method

.method static synthetic access$402(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;I)I
    .locals 0

    .prologue
    .line 47
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLTextureId:I

    return p1
.end method

.method static synthetic access$500(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->adjustImageScaling()V

    return-void
.end method

.method static synthetic access$600(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)Landroid/graphics/SurfaceTexture;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    return-object v0
.end method

.method static synthetic access$602(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;Landroid/graphics/SurfaceTexture;)Landroid/graphics/SurfaceTexture;
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mSurfaceTexture:Landroid/graphics/SurfaceTexture;

    return-object p1
.end method

.method static synthetic access$702(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;Landroid/hardware/Camera$Parameters;)Landroid/hardware/Camera$Parameters;
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->cameraParams:Landroid/hardware/Camera$Parameters;

    return-object p1
.end method

.method static synthetic access$800(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    return-object v0
.end method

.method static synthetic access$802(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    return-object p1
.end method

.method static synthetic access$900(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)I
    .locals 1

    .prologue
    .line 47
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mOutputWidth:I

    return v0
.end method

.method private addDistance(FF)F
    .locals 1

    .prologue
    .line 477
    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-nez v0, :cond_0

    :goto_0
    return p2

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    sub-float p2, v0, p2

    goto :goto_0
.end method

.method private adjustImageScaling()V
    .locals 12

    .prologue
    const/4 v10, 0x3

    const/4 v9, 0x2

    const/4 v8, 0x1

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v7, 0x0

    .line 431
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mOutputWidth:I

    int-to-float v1, v0

    .line 432
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mOutputHeight:I

    int-to-float v0, v0

    .line 433
    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mRotation:Ljp/co/cyberagent/android/gpuimage/Rotation;

    sget-object v3, Ljp/co/cyberagent/android/gpuimage/Rotation;->ROTATION_270:Ljp/co/cyberagent/android/gpuimage/Rotation;

    if-eq v2, v3, :cond_0

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mRotation:Ljp/co/cyberagent/android/gpuimage/Rotation;

    sget-object v3, Ljp/co/cyberagent/android/gpuimage/Rotation;->ROTATION_90:Ljp/co/cyberagent/android/gpuimage/Rotation;

    if-ne v2, v3, :cond_1

    .line 434
    :cond_0
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mOutputHeight:I

    int-to-float v1, v0

    .line 435
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mOutputWidth:I

    int-to-float v0, v0

    .line 438
    :cond_1
    iget v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mImageWidth:I

    int-to-float v2, v2

    div-float v2, v1, v2

    .line 439
    iget v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mImageHeight:I

    int-to-float v3, v3

    div-float v3, v0, v3

    .line 440
    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v2

    .line 441
    iget v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mImageWidth:I

    int-to-float v3, v3

    mul-float/2addr v3, v2

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    .line 442
    iget v4, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mImageHeight:I

    int-to-float v4, v4

    mul-float/2addr v2, v4

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 444
    int-to-float v3, v3

    div-float/2addr v3, v1

    .line 445
    int-to-float v1, v2

    div-float v4, v1, v0

    .line 447
    sget-object v2, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->CUBE:[F

    .line 448
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mRotation:Ljp/co/cyberagent/android/gpuimage/Rotation;

    iget-boolean v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mFlipHorizontal:Z

    iget-boolean v5, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mFlipVertical:Z

    invoke-static {v0, v1, v5}, Ljp/co/cyberagent/android/gpuimage/util/TextureRotationUtil;->getRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)[F

    move-result-object v1

    .line 449
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mScaleType:Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;

    sget-object v5, Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;->CENTER_CROP:Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;

    if-ne v0, v5, :cond_2

    .line 450
    div-float v0, v6, v3

    sub-float v0, v6, v0

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v0, v3

    .line 451
    div-float v0, v6, v4

    sub-float v0, v6, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, v0, v4

    .line 452
    const/16 v0, 0x8

    new-array v0, v0, [F

    aget v5, v1, v7

    invoke-direct {p0, v5, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->addDistance(FF)F

    move-result v5

    aput v5, v0, v7

    aget v5, v1, v8

    invoke-direct {p0, v5, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->addDistance(FF)F

    move-result v5

    aput v5, v0, v8

    aget v5, v1, v9

    invoke-direct {p0, v5, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->addDistance(FF)F

    move-result v5

    aput v5, v0, v9

    aget v5, v1, v10

    invoke-direct {p0, v5, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->addDistance(FF)F

    move-result v5

    aput v5, v0, v10

    const/4 v5, 0x4

    const/4 v6, 0x4

    aget v6, v1, v6

    invoke-direct {p0, v6, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->addDistance(FF)F

    move-result v6

    aput v6, v0, v5

    const/4 v5, 0x5

    const/4 v6, 0x5

    aget v6, v1, v6

    invoke-direct {p0, v6, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->addDistance(FF)F

    move-result v6

    aput v6, v0, v5

    const/4 v5, 0x6

    const/4 v6, 0x6

    aget v6, v1, v6

    invoke-direct {p0, v6, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->addDistance(FF)F

    move-result v3

    aput v3, v0, v5

    const/4 v3, 0x7

    const/4 v5, 0x7

    aget v1, v1, v5

    invoke-direct {p0, v1, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->addDistance(FF)F

    move-result v1

    aput v1, v0, v3

    move-object v1, v2

    .line 470
    :goto_0
    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLCubeBuffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v2}, Ljava/nio/FloatBuffer;->clear()Ljava/nio/Buffer;

    .line 471
    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLCubeBuffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v2, v1}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 472
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLTextureBuffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v1}, Ljava/nio/FloatBuffer;->clear()Ljava/nio/Buffer;

    .line 473
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLTextureBuffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v1, v0}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 474
    return-void

    .line 459
    :cond_2
    iget-boolean v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGalaxyYCapture:Z

    if-nez v0, :cond_3

    .line 460
    const/16 v0, 0x8

    new-array v0, v0, [F

    sget-object v2, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->CUBE:[F

    aget v2, v2, v7

    div-float/2addr v2, v4

    aput v2, v0, v7

    sget-object v2, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->CUBE:[F

    aget v2, v2, v8

    div-float/2addr v2, v3

    aput v2, v0, v8

    sget-object v2, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->CUBE:[F

    aget v2, v2, v9

    div-float/2addr v2, v4

    aput v2, v0, v9

    sget-object v2, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->CUBE:[F

    aget v2, v2, v10

    div-float/2addr v2, v3

    aput v2, v0, v10

    const/4 v2, 0x4

    sget-object v5, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->CUBE:[F

    const/4 v6, 0x4

    aget v5, v5, v6

    div-float/2addr v5, v4

    aput v5, v0, v2

    const/4 v2, 0x5

    sget-object v5, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->CUBE:[F

    const/4 v6, 0x5

    aget v5, v5, v6

    div-float/2addr v5, v3

    aput v5, v0, v2

    const/4 v2, 0x6

    sget-object v5, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->CUBE:[F

    const/4 v6, 0x6

    aget v5, v5, v6

    div-float v4, v5, v4

    aput v4, v0, v2

    const/4 v2, 0x7

    sget-object v4, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->CUBE:[F

    const/4 v5, 0x7

    aget v4, v4, v5

    div-float v3, v4, v3

    aput v3, v0, v2

    move-object v11, v1

    move-object v1, v0

    move-object v0, v11

    goto :goto_0

    :cond_3
    move-object v0, v1

    move-object v1, v2

    goto :goto_0
.end method

.method private deleteTextureImage()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    const/4 v2, -0x1

    .line 189
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLTextureId:I

    if-eq v0, v2, :cond_0

    .line 190
    new-array v0, v4, [I

    .line 191
    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLTextureId:I

    aput v1, v0, v3

    .line 192
    invoke-static {v4, v0, v3}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    .line 193
    iput v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLTextureId:I

    .line 195
    :cond_0
    return-void
.end method

.method private runAll(Ljava/util/Queue;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Queue",
            "<",
            "Ljava/lang/Runnable;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 173
    monitor-enter p1

    .line 174
    :goto_0
    :try_start_0
    invoke-interface {p1}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 175
    invoke-interface {p1}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 177
    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method


# virtual methods
.method public closeBlendMode()V
    .locals 1

    .prologue
    .line 337
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$8;

    invoke-direct {v0, p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$8;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)V

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->runOnDraw(Ljava/lang/Runnable;)V

    .line 344
    return-void
.end method

.method protected deleteBufferDirectly()V
    .locals 1

    .prologue
    .line 181
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLRgbBuffer:Ljava/nio/IntBuffer;

    if-eqz v0, :cond_0

    .line 182
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLRgbBuffer:Ljava/nio/IntBuffer;

    invoke-virtual {v0}, Ljava/nio/IntBuffer;->clear()Ljava/nio/Buffer;

    .line 183
    const/4 v0, 0x0

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLRgbBuffer:Ljava/nio/IntBuffer;

    .line 186
    :cond_0
    return-void
.end method

.method public deleteCameraImage()V
    .locals 1

    .prologue
    .line 262
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$3;

    invoke-direct {v0, p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$3;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)V

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->runOnDraw(Ljava/lang/Runnable;)V

    .line 270
    return-void
.end method

.method public deleteImage()V
    .locals 1

    .prologue
    .line 290
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$5;

    invoke-direct {v0, p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$5;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)V

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->runOnDraw(Ljava/lang/Runnable;)V

    .line 304
    return-void
.end method

.method public deleteImageEnd()V
    .locals 1

    .prologue
    .line 307
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$6;

    invoke-direct {v0, p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$6;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)V

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->runOnDrawEnd(Ljava/lang/Runnable;)V

    .line 317
    return-void
.end method

.method public destroy()V
    .locals 1

    .prologue
    .line 321
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->deleteImage()V

    .line 322
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->destroy()V

    .line 323
    :cond_0
    return-void
.end method

.method public getDrawQueue()Ljava/util/Queue;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Queue",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation

    .prologue
    .line 523
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mRunOnDraw:Ljava/util/Queue;

    monitor-enter v1

    .line 524
    :try_start_0
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mRunOnDraw:Ljava/util/Queue;

    monitor-exit v1

    return-object v0

    .line 525
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected getFrameHeight()I
    .locals 1

    .prologue
    .line 427
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mOutputHeight:I

    return v0
.end method

.method protected getFrameWidth()I
    .locals 1

    .prologue
    .line 423
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mOutputWidth:I

    return v0
.end method

.method public getRotation()Ljp/co/cyberagent/android/gpuimage/Rotation;
    .locals 1

    .prologue
    .line 499
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mRotation:Ljp/co/cyberagent/android/gpuimage/Rotation;

    return-object v0
.end method

.method public isFlippedHorizontally()Z
    .locals 1

    .prologue
    .line 503
    iget-boolean v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mFlipHorizontal:Z

    return v0
.end method

.method public isFlippedVertically()Z
    .locals 1

    .prologue
    .line 507
    iget-boolean v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mFlipVertical:Z

    return v0
.end method

.method public onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongCall"
        }
    .end annotation

    .prologue
    const v1, 0x3e1cac08    # 0.153f

    .line 151
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v1, v1, v1, v0}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 152
    const/16 v0, 0x4100

    invoke-static {v0}, Landroid/opengl/GLES20;->glClear(I)V

    .line 153
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mRunOnDraw:Ljava/util/Queue;

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->runAll(Ljava/util/Queue;)V

    .line 154
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLTextureId:I

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLCubeBuffer:Ljava/nio/FloatBuffer;

    iget-object v3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGLTextureBuffer:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v1, v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onDraw(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V

    .line 155
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mRunOnDrawEnd:Ljava/util/Queue;

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->runAll(Ljava/util/Queue;)V

    .line 164
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mDrawListener:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$OnDrawDoneListener;

    if-eqz v0, :cond_0

    .line 165
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mDrawListener:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$OnDrawDoneListener;

    invoke-interface {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$OnDrawDoneListener;->onDrawLoadDone()V

    .line 167
    :cond_0
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mDrawEndListener:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$OnDrawEndListener;

    if-eqz v0, :cond_1

    .line 168
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mDrawEndListener:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$OnDrawEndListener;

    invoke-interface {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$OnDrawEndListener;->onDrawEnd()V

    .line 170
    :cond_1
    return-void
.end method

.method public onPreviewFrame([BLandroid/hardware/Camera;)V
    .locals 2

    .prologue
    .line 200
    iget-boolean v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mPause:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mRunOnDraw:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->cameraParams:Landroid/hardware/Camera$Parameters;

    if-eqz v0, :cond_0

    .line 201
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->cameraParams:Landroid/hardware/Camera$Parameters;

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;

    move-result-object v0

    .line 203
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mRunOnDraw:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Queue;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 204
    new-instance v1, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;

    invoke-direct {v1, p0, v0, p1, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$1;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;Landroid/hardware/Camera$Size;[BLandroid/hardware/Camera;)V

    invoke-virtual {p0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->runOnDraw(Ljava/lang/Runnable;)V

    .line 238
    :cond_0
    return-void
.end method

.method public onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 135
    iput p2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mOutputWidth:I

    .line 136
    iput p3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mOutputHeight:I

    .line 137
    invoke-static {v0, v0, p2, p3}, Landroid/opengl/GLES20;->glViewport(IIII)V

    .line 138
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->getProgram()I

    move-result v0

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 139
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    invoke-virtual {v0, p2, p3}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onOutputSizeChanged(II)V

    .line 140
    invoke-direct {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->adjustImageScaling()V

    .line 141
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mSurfaceChangedWaiter:Ljava/lang/Object;

    monitor-enter v1

    .line 142
    :try_start_0
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mSurfaceChangedWaiter:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 143
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V
    .locals 2

    .prologue
    const v1, 0x3e1cac08    # 0.153f

    .line 123
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v1, v1, v1, v0}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 124
    const/16 v0, 0xb71

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisable(I)V

    .line 130
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mFilter:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->init()V

    .line 131
    return-void
.end method

.method public openBlendMode()V
    .locals 1

    .prologue
    .line 326
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$7;

    invoke-direct {v0, p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$7;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;)V

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->runOnDraw(Ljava/lang/Runnable;)V

    .line 334
    return-void
.end method

.method protected runOnDraw(Ljava/lang/Runnable;)V
    .locals 2

    .prologue
    .line 511
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mRunOnDraw:Ljava/util/Queue;

    monitor-enter v1

    .line 512
    :try_start_0
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mRunOnDraw:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 513
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected runOnDrawEnd(Ljava/lang/Runnable;)V
    .locals 2

    .prologue
    .line 517
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mRunOnDrawEnd:Ljava/util/Queue;

    monitor-enter v1

    .line 518
    :try_start_0
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mRunOnDrawEnd:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 519
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setDrawEndListener(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$OnDrawEndListener;)V
    .locals 0

    .prologue
    .line 118
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mDrawEndListener:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$OnDrawEndListener;

    .line 119
    return-void
.end method

.method public setDrawListener(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$OnDrawDoneListener;)V
    .locals 0

    .prologue
    .line 114
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mDrawListener:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$OnDrawDoneListener;

    .line 115
    return-void
.end method

.method public setFilter(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V
    .locals 1

    .prologue
    .line 273
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$4;

    invoke-direct {v0, p0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$4;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->runOnDraw(Ljava/lang/Runnable;)V

    .line 287
    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 347
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->setImageBitmap(Landroid/graphics/Bitmap;Z)V

    .line 348
    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;Z)V
    .locals 1

    .prologue
    .line 385
    if-nez p1, :cond_0

    .line 416
    :goto_0
    return-void

    .line 389
    :cond_0
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$10;

    invoke-direct {v0, p0, p1, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$10;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;Landroid/graphics/Bitmap;Z)V

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->runOnDraw(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public setImageThumbnailBitmap(Landroid/graphics/Bitmap;Z)V
    .locals 1

    .prologue
    .line 351
    if-nez p1, :cond_0

    .line 382
    :goto_0
    return-void

    .line 355
    :cond_0
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$9;

    invoke-direct {v0, p0, p1, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$9;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;Landroid/graphics/Bitmap;Z)V

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->runOnDraw(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;)V
    .locals 0

    .prologue
    .line 486
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mRotation:Ljp/co/cyberagent/android/gpuimage/Rotation;

    .line 488
    invoke-direct {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->adjustImageScaling()V

    .line 489
    return-void
.end method

.method public setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V
    .locals 0

    .prologue
    .line 493
    iput-boolean p2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mFlipHorizontal:Z

    .line 494
    iput-boolean p3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mFlipVertical:Z

    .line 495
    invoke-virtual {p0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;)V

    .line 496
    return-void
.end method

.method public setRotationCamera(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V
    .locals 0

    .prologue
    .line 482
    invoke-virtual {p0, p1, p3, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->setRotation(Ljp/co/cyberagent/android/gpuimage/Rotation;ZZ)V

    .line 483
    return-void
.end method

.method public setScaleType(Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;)V
    .locals 0

    .prologue
    .line 419
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mScaleType:Ljp/co/cyberagent/android/gpuimage/GPUImage$ScaleType;

    .line 420
    return-void
.end method

.method public setUpSurfaceTexture(Landroid/hardware/Camera;)V
    .locals 1

    .prologue
    .line 241
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$2;

    invoke-direct {v0, p0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer$2;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;Landroid/hardware/Camera;)V

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->runOnDraw(Ljava/lang/Runnable;)V

    .line 259
    return-void
.end method
