.class Lorg/chromium/ui/gl/SurfaceTexturePlatformWrapper;
.super Ljava/lang/Object;
.source "SurfaceTexturePlatformWrapper.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "gfx"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final TAG:Ljava/lang/String; = "SurfaceTexturePlatformWrapper"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 18
    const-class v0, Lorg/chromium/ui/gl/SurfaceTexturePlatformWrapper;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/ui/gl/SurfaceTexturePlatformWrapper;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static attachToGLContext(Landroid/graphics/SurfaceTexture;I)V
    .locals 2
    .param p0, "surfaceTexture"    # Landroid/graphics/SurfaceTexture;
    .param p1, "texName"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 75
    sget-boolean v0, Lorg/chromium/ui/gl/SurfaceTexturePlatformWrapper;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 76
    :cond_0
    invoke-virtual {p0, p1}, Landroid/graphics/SurfaceTexture;->attachToGLContext(I)V

    .line 77
    return-void
.end method

.method private static create(I)Landroid/graphics/SurfaceTexture;
    .locals 1
    .param p0, "textureId"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 25
    new-instance v0, Landroid/graphics/SurfaceTexture;

    invoke-direct {v0, p0}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    return-object v0
.end method

.method private static createSingleBuffered(I)Landroid/graphics/SurfaceTexture;
    .locals 2
    .param p0, "textureId"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 30
    sget-boolean v0, Lorg/chromium/ui/gl/SurfaceTexturePlatformWrapper;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-ge v0, v1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 31
    :cond_0
    new-instance v0, Landroid/graphics/SurfaceTexture;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Landroid/graphics/SurfaceTexture;-><init>(IZ)V

    return-object v0
.end method

.method private static destroy(Landroid/graphics/SurfaceTexture;)V
    .locals 1
    .param p0, "surfaceTexture"    # Landroid/graphics/SurfaceTexture;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 36
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    .line 37
    invoke-virtual {p0}, Landroid/graphics/SurfaceTexture;->release()V

    .line 38
    return-void
.end method

.method private static detachFromGLContext(Landroid/graphics/SurfaceTexture;)V
    .locals 2
    .param p0, "surfaceTexture"    # Landroid/graphics/SurfaceTexture;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 81
    sget-boolean v0, Lorg/chromium/ui/gl/SurfaceTexturePlatformWrapper;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 82
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/SurfaceTexture;->detachFromGLContext()V

    .line 83
    return-void
.end method

.method private static getTransformMatrix(Landroid/graphics/SurfaceTexture;[F)V
    .locals 0
    .param p0, "surfaceTexture"    # Landroid/graphics/SurfaceTexture;
    .param p1, "matrix"    # [F
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 70
    invoke-virtual {p0, p1}, Landroid/graphics/SurfaceTexture;->getTransformMatrix([F)V

    .line 71
    return-void
.end method

.method private static releaseTexImage(Landroid/graphics/SurfaceTexture;)V
    .locals 2
    .param p0, "surfaceTexture"    # Landroid/graphics/SurfaceTexture;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 58
    sget-boolean v0, Lorg/chromium/ui/gl/SurfaceTexturePlatformWrapper;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-ge v0, v1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 59
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/SurfaceTexture;->releaseTexImage()V

    .line 60
    return-void
.end method

.method private static setDefaultBufferSize(Landroid/graphics/SurfaceTexture;II)V
    .locals 0
    .param p0, "surfaceTexture"    # Landroid/graphics/SurfaceTexture;
    .param p1, "width"    # I
    .param p2, "height"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 65
    invoke-virtual {p0, p1, p2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 66
    return-void
.end method

.method private static setFrameAvailableCallback(Landroid/graphics/SurfaceTexture;J)V
    .locals 1
    .param p0, "surfaceTexture"    # Landroid/graphics/SurfaceTexture;
    .param p1, "nativeSurfaceTextureListener"    # J
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 43
    new-instance v0, Lorg/chromium/ui/gl/SurfaceTextureListener;

    invoke-direct {v0, p1, p2}, Lorg/chromium/ui/gl/SurfaceTextureListener;-><init>(J)V

    invoke-virtual {p0, v0}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    .line 45
    return-void
.end method

.method private static updateTexImage(Landroid/graphics/SurfaceTexture;)V
    .locals 3
    .param p0, "surfaceTexture"    # Landroid/graphics/SurfaceTexture;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 50
    :try_start_0
    invoke-virtual {p0}, Landroid/graphics/SurfaceTexture;->updateTexImage()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    :goto_0
    return-void

    .line 51
    :catch_0
    move-exception v0

    .line 52
    .local v0, "e":Ljava/lang/RuntimeException;
    const-string v1, "SurfaceTexturePlatformWrapper"

    const-string v2, "Error calling updateTexImage"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method
