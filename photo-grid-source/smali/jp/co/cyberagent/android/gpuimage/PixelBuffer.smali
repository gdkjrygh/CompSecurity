.class public Ljp/co/cyberagent/android/gpuimage/PixelBuffer;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final LIST_CONFIGS:Z = false

.field static final TAG:Ljava/lang/String; = "PixelBuffer"


# instance fields
.field mBitmap:Landroid/graphics/Bitmap;

.field mEGL:Ljavax/microedition/khronos/egl/EGL10;

.field mEGLConfig:Ljavax/microedition/khronos/egl/EGLConfig;

.field mEGLConfigs:[Ljavax/microedition/khronos/egl/EGLConfig;

.field mEGLContext:Ljavax/microedition/khronos/egl/EGLContext;

.field mEGLDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

.field mEGLSurface:Ljavax/microedition/khronos/egl/EGLSurface;

.field mGL:Ljavax/microedition/khronos/opengles/GL10;

.field mHeight:I

.field mRenderer:Landroid/opengl/GLSurfaceView$Renderer;

.field mThreadOwner:Ljava/lang/String;

.field mWidth:I


# direct methods
.method public constructor <init>(II)V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mWidth:I

    .line 58
    iput p2, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mHeight:I

    .line 60
    new-array v1, v4, [I

    .line 61
    const/4 v0, 0x5

    new-array v2, v0, [I

    const/4 v0, 0x0

    const/16 v3, 0x3057

    aput v3, v2, v0

    const/4 v0, 0x1

    iget v3, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mWidth:I

    aput v3, v2, v0

    const/16 v0, 0x3056

    aput v0, v2, v4

    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mHeight:I

    aput v0, v2, v5

    const/4 v0, 0x4

    const/16 v3, 0x3038

    aput v3, v2, v0

    .line 68
    invoke-static {}, Ljavax/microedition/khronos/egl/EGLContext;->getEGL()Ljavax/microedition/khronos/egl/EGL;

    move-result-object v0

    check-cast v0, Ljavax/microedition/khronos/egl/EGL10;

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGL:Ljavax/microedition/khronos/egl/EGL10;

    .line 69
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGL:Ljavax/microedition/khronos/egl/EGL10;

    sget-object v3, Ljavax/microedition/khronos/egl/EGL10;->EGL_DEFAULT_DISPLAY:Ljava/lang/Object;

    invoke-interface {v0, v3}, Ljavax/microedition/khronos/egl/EGL10;->eglGetDisplay(Ljava/lang/Object;)Ljavax/microedition/khronos/egl/EGLDisplay;

    move-result-object v0

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    .line 70
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGL:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v3, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    invoke-interface {v0, v3, v1}, Ljavax/microedition/khronos/egl/EGL10;->eglInitialize(Ljavax/microedition/khronos/egl/EGLDisplay;[I)Z

    .line 71
    invoke-direct {p0}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->chooseConfig()Ljavax/microedition/khronos/egl/EGLConfig;

    move-result-object v0

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLConfig:Ljavax/microedition/khronos/egl/EGLConfig;

    .line 77
    new-array v0, v5, [I

    fill-array-data v0, :array_0

    .line 81
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGL:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v3, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    iget-object v4, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLConfig:Ljavax/microedition/khronos/egl/EGLConfig;

    sget-object v5, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_CONTEXT:Ljavax/microedition/khronos/egl/EGLContext;

    invoke-interface {v1, v3, v4, v5, v0}, Ljavax/microedition/khronos/egl/EGL10;->eglCreateContext(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;Ljavax/microedition/khronos/egl/EGLContext;[I)Ljavax/microedition/khronos/egl/EGLContext;

    move-result-object v0

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLContext:Ljavax/microedition/khronos/egl/EGLContext;

    .line 83
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGL:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    iget-object v3, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLConfig:Ljavax/microedition/khronos/egl/EGLConfig;

    invoke-interface {v0, v1, v3, v2}, Ljavax/microedition/khronos/egl/EGL10;->eglCreatePbufferSurface(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;[I)Ljavax/microedition/khronos/egl/EGLSurface;

    move-result-object v0

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLSurface:Ljavax/microedition/khronos/egl/EGLSurface;

    .line 84
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGL:Ljavax/microedition/khronos/egl/EGL10;

    invoke-interface {v0}, Ljavax/microedition/khronos/egl/EGL10;->eglGetError()I

    move-result v0

    .line 85
    const/16 v1, 0x3000

    if-eq v0, v1, :cond_0

    .line 86
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->destroyEGL()V

    .line 87
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 91
    :cond_0
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGL:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLSurface:Ljavax/microedition/khronos/egl/EGLSurface;

    iget-object v3, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLSurface:Ljavax/microedition/khronos/egl/EGLSurface;

    iget-object v4, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLContext:Ljavax/microedition/khronos/egl/EGLContext;

    invoke-interface {v0, v1, v2, v3, v4}, Ljavax/microedition/khronos/egl/EGL10;->eglMakeCurrent(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLContext;)Z

    .line 93
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLContext:Ljavax/microedition/khronos/egl/EGLContext;

    invoke-virtual {v0}, Ljavax/microedition/khronos/egl/EGLContext;->getGL()Ljavax/microedition/khronos/opengles/GL;

    move-result-object v0

    check-cast v0, Ljavax/microedition/khronos/opengles/GL10;

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mGL:Ljavax/microedition/khronos/opengles/GL10;

    .line 96
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mThreadOwner:Ljava/lang/String;

    .line 97
    return-void

    .line 77
    :array_0
    .array-data 4
        0x3098
        0x2
        0x3038
    .end array-data
.end method

.method private chooseConfig()Ljavax/microedition/khronos/egl/EGLConfig;
    .locals 12

    .prologue
    const/4 v4, 0x0

    .line 169
    const/16 v0, 0xf

    new-array v2, v0, [I

    fill-array-data v2, :array_0

    .line 182
    const/4 v0, 0x1

    new-array v5, v0, [I

    .line 183
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGL:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    const/4 v3, 0x0

    invoke-interface/range {v0 .. v5}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z

    .line 184
    aget v10, v5, v4

    .line 185
    new-array v0, v10, [Ljavax/microedition/khronos/egl/EGLConfig;

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLConfigs:[Ljavax/microedition/khronos/egl/EGLConfig;

    .line 186
    iget-object v6, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGL:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v7, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    iget-object v9, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLConfigs:[Ljavax/microedition/khronos/egl/EGLConfig;

    move-object v8, v2

    move-object v11, v5

    invoke-interface/range {v6 .. v11}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z

    .line 192
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLConfigs:[Ljavax/microedition/khronos/egl/EGLConfig;

    aget-object v0, v0, v4

    return-object v0

    .line 169
    nop

    :array_0
    .array-data 4
        0x3025
        0x0
        0x3026
        0x0
        0x3024
        0x8
        0x3023
        0x8
        0x3022
        0x8
        0x3021
        0x8
        0x3040
        0x4
        0x3038
    .end array-data
.end method

.method private convertToBitmap()V
    .locals 10

    .prologue
    const/4 v8, 0x0

    .line 242
    :try_start_0
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mWidth:I

    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mHeight:I

    mul-int/2addr v0, v1

    new-array v9, v0, [I

    .line 243
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mWidth:I

    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mHeight:I

    mul-int/2addr v0, v1

    invoke-static {v0}, Ljava/nio/IntBuffer;->allocate(I)Ljava/nio/IntBuffer;

    move-result-object v7

    .line 244
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mGL:Ljavax/microedition/khronos/opengles/GL10;

    const/4 v1, 0x0

    const/4 v2, 0x0

    iget v3, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mWidth:I

    iget v4, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mHeight:I

    const/16 v5, 0x1908

    const/16 v6, 0x1401

    invoke-interface/range {v0 .. v7}, Ljavax/microedition/khronos/opengles/GL10;->glReadPixels(IIIIIILjava/nio/Buffer;)V

    .line 246
    invoke-virtual {v7}, Ljava/nio/IntBuffer;->array()[I

    move-result-object v2

    move v1, v8

    .line 249
    :goto_0
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mHeight:I

    if-ge v1, v0, :cond_1

    move v0, v8

    .line 250
    :goto_1
    iget v3, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mWidth:I

    if-ge v0, v3, :cond_0

    .line 251
    iget v3, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mHeight:I

    sub-int/2addr v3, v1

    add-int/lit8 v3, v3, -0x1

    iget v4, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mWidth:I

    mul-int/2addr v3, v4

    add-int/2addr v3, v0

    iget v4, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mWidth:I

    mul-int/2addr v4, v1

    add-int/2addr v4, v0

    aget v4, v2, v4

    aput v4, v9, v3

    .line 250
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 249
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 254
    :cond_1
    invoke-virtual {v7}, Ljava/nio/IntBuffer;->clear()Ljava/nio/Buffer;

    .line 255
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mWidth:I

    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mHeight:I

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mBitmap:Landroid/graphics/Bitmap;

    .line 256
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mBitmap:Landroid/graphics/Bitmap;

    invoke-static {v9}, Ljava/nio/IntBuffer;->wrap([I)Ljava/nio/IntBuffer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->copyPixelsFromBuffer(Ljava/nio/Buffer;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 267
    :cond_2
    :goto_2
    return-void

    .line 259
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 260
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mBitmap:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_2

    .line 261
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 262
    const/4 v0, 0x0

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mBitmap:Landroid/graphics/Bitmap;

    goto :goto_2
.end method

.method private convertToBitmapOnlyForS4()V
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 222
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mWidth:I

    iget v2, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mWidth:I

    rem-int/lit8 v2, v2, 0x8

    sub-int v3, v0, v2

    .line 223
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mHeight:I

    mul-int/2addr v0, v3

    new-array v8, v0, [I

    .line 224
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mHeight:I

    mul-int/2addr v0, v3

    invoke-static {v0}, Ljava/nio/IntBuffer;->allocate(I)Ljava/nio/IntBuffer;

    move-result-object v7

    .line 225
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mGL:Ljavax/microedition/khronos/opengles/GL10;

    iget v4, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mHeight:I

    const/16 v5, 0x1908

    const/16 v6, 0x1401

    move v2, v1

    invoke-interface/range {v0 .. v7}, Ljavax/microedition/khronos/opengles/GL10;->glReadPixels(IIIIIILjava/nio/Buffer;)V

    .line 227
    invoke-virtual {v7}, Ljava/nio/IntBuffer;->array()[I

    move-result-object v4

    move v0, v1

    .line 230
    :goto_0
    iget v2, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mHeight:I

    if-ge v0, v2, :cond_1

    move v2, v1

    .line 231
    :goto_1
    if-ge v2, v3, :cond_0

    .line 232
    iget v5, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mHeight:I

    sub-int/2addr v5, v0

    add-int/lit8 v5, v5, -0x1

    mul-int/2addr v5, v3

    add-int/2addr v5, v2

    mul-int v6, v0, v3

    add-int/2addr v6, v2

    aget v6, v4, v6

    aput v6, v8, v5

    .line 231
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 230
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 236
    :cond_1
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mHeight:I

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mBitmap:Landroid/graphics/Bitmap;

    .line 237
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mBitmap:Landroid/graphics/Bitmap;

    invoke-static {v8}, Ljava/nio/IntBuffer;->wrap([I)Ljava/nio/IntBuffer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->copyPixelsFromBuffer(Ljava/nio/Buffer;)V

    .line 238
    return-void
.end method

.method private getConfigAttrib(Ljavax/microedition/khronos/egl/EGLConfig;I)I
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 216
    const/4 v1, 0x1

    new-array v1, v1, [I

    .line 217
    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGL:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v3, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    invoke-interface {v2, v3, p1, p2, v1}, Ljavax/microedition/khronos/egl/EGL10;->eglGetConfigAttrib(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z

    move-result v2

    if-eqz v2, :cond_0

    aget v0, v1, v0

    :cond_0
    return v0
.end method

.method private listConfig()V
    .locals 12

    .prologue
    .line 196
    const-string v0, "PixelBuffer"

    const-string v1, "Config List {"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 198
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLConfigs:[Ljavax/microedition/khronos/egl/EGLConfig;

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    .line 202
    const/16 v4, 0x3025

    invoke-direct {p0, v3, v4}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->getConfigAttrib(Ljavax/microedition/khronos/egl/EGLConfig;I)I

    move-result v4

    .line 203
    const/16 v5, 0x3026

    invoke-direct {p0, v3, v5}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->getConfigAttrib(Ljavax/microedition/khronos/egl/EGLConfig;I)I

    move-result v5

    .line 204
    const/16 v6, 0x3024

    invoke-direct {p0, v3, v6}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->getConfigAttrib(Ljavax/microedition/khronos/egl/EGLConfig;I)I

    move-result v6

    .line 205
    const/16 v7, 0x3023

    invoke-direct {p0, v3, v7}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->getConfigAttrib(Ljavax/microedition/khronos/egl/EGLConfig;I)I

    move-result v7

    .line 206
    const/16 v8, 0x3022

    invoke-direct {p0, v3, v8}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->getConfigAttrib(Ljavax/microedition/khronos/egl/EGLConfig;I)I

    move-result v8

    .line 207
    const/16 v9, 0x3021

    invoke-direct {p0, v3, v9}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->getConfigAttrib(Ljavax/microedition/khronos/egl/EGLConfig;I)I

    move-result v3

    .line 208
    const-string v9, "PixelBuffer"

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "    <d,s,r,g,b,a> = <"

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v10, ","

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ","

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ","

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ","

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ","

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ">"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v9, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 198
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 212
    :cond_0
    const-string v0, "PixelBuffer"

    const-string v1, "}"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 213
    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 5

    .prologue
    .line 157
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mRenderer:Landroid/opengl/GLSurfaceView$Renderer;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mGL:Ljavax/microedition/khronos/opengles/GL10;

    invoke-interface {v0, v1}, Landroid/opengl/GLSurfaceView$Renderer;->onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V

    .line 158
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mRenderer:Landroid/opengl/GLSurfaceView$Renderer;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mGL:Ljavax/microedition/khronos/opengles/GL10;

    invoke-interface {v0, v1}, Landroid/opengl/GLSurfaceView$Renderer;->onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V

    .line 160
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGL:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    sget-object v2, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_SURFACE:Ljavax/microedition/khronos/egl/EGLSurface;

    sget-object v3, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_SURFACE:Ljavax/microedition/khronos/egl/EGLSurface;

    sget-object v4, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_CONTEXT:Ljavax/microedition/khronos/egl/EGLContext;

    invoke-interface {v0, v1, v2, v3, v4}, Ljavax/microedition/khronos/egl/EGL10;->eglMakeCurrent(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLContext;)Z

    .line 163
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGL:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLSurface:Ljavax/microedition/khronos/egl/EGLSurface;

    invoke-interface {v0, v1, v2}, Ljavax/microedition/khronos/egl/EGL10;->eglDestroySurface(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLSurface;)Z

    .line 164
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGL:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLContext:Ljavax/microedition/khronos/egl/EGLContext;

    invoke-interface {v0, v1, v2}, Ljavax/microedition/khronos/egl/EGL10;->eglDestroyContext(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLContext;)Z

    .line 165
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGL:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    invoke-interface {v0, v1}, Ljavax/microedition/khronos/egl/EGL10;->eglTerminate(Ljavax/microedition/khronos/egl/EGLDisplay;)Z

    .line 166
    return-void
.end method

.method public destroyEGL()V
    .locals 5

    .prologue
    .line 148
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGL:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    sget-object v2, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_SURFACE:Ljavax/microedition/khronos/egl/EGLSurface;

    sget-object v3, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_SURFACE:Ljavax/microedition/khronos/egl/EGLSurface;

    sget-object v4, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_CONTEXT:Ljavax/microedition/khronos/egl/EGLContext;

    invoke-interface {v0, v1, v2, v3, v4}, Ljavax/microedition/khronos/egl/EGL10;->eglMakeCurrent(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLContext;)Z

    .line 151
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGL:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLSurface:Ljavax/microedition/khronos/egl/EGLSurface;

    invoke-interface {v0, v1, v2}, Ljavax/microedition/khronos/egl/EGL10;->eglDestroySurface(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLSurface;)Z

    .line 152
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGL:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLContext:Ljavax/microedition/khronos/egl/EGLContext;

    invoke-interface {v0, v1, v2}, Ljavax/microedition/khronos/egl/EGL10;->eglDestroyContext(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLContext;)Z

    .line 153
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGL:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLDisplay:Ljavax/microedition/khronos/egl/EGLDisplay;

    invoke-interface {v0, v1}, Ljavax/microedition/khronos/egl/EGL10;->eglTerminate(Ljavax/microedition/khronos/egl/EGLDisplay;)Z

    .line 154
    return-void
.end method

.method public getBitmap()Landroid/graphics/Bitmap;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 123
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mRenderer:Landroid/opengl/GLSurfaceView$Renderer;

    if-nez v1, :cond_0

    .line 124
    const-string v1, "PixelBuffer"

    const-string v2, "getBitmap: Renderer was not set."

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 144
    :goto_0
    return-object v0

    .line 129
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mThreadOwner:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 130
    const-string v1, "PixelBuffer"

    const-string v2, "getBitmap: This thread does not own the OpenGL context."

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 136
    :cond_1
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mRenderer:Landroid/opengl/GLSurfaceView$Renderer;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mGL:Ljavax/microedition/khronos/opengles/GL10;

    invoke-interface {v0, v1}, Landroid/opengl/GLSurfaceView$Renderer;->onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V

    .line 137
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mRenderer:Landroid/opengl/GLSurfaceView$Renderer;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mGL:Ljavax/microedition/khronos/opengles/GL10;

    invoke-interface {v0, v1}, Landroid/opengl/GLSurfaceView$Renderer;->onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V

    .line 139
    const-string v0, "GT-I9502"

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->phoneModel(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "GT-I9500"

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->phoneModel(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "GT-I9505"

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->phoneModel(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "GT-I9508"

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->phoneModel(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "GT-I959"

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->phoneModel(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 140
    :cond_2
    invoke-direct {p0}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->convertToBitmapOnlyForS4()V

    .line 144
    :goto_1
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mBitmap:Landroid/graphics/Bitmap;

    goto :goto_0

    .line 142
    :cond_3
    invoke-direct {p0}, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->convertToBitmap()V

    goto :goto_1
.end method

.method public phoneModel(Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 114
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 115
    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 117
    invoke-virtual {v0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v1, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    .line 118
    :goto_0
    return v0

    .line 117
    :cond_1
    const/4 v0, 0x0

    .line 118
    goto :goto_0
.end method

.method public setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V
    .locals 4

    .prologue
    .line 100
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mRenderer:Landroid/opengl/GLSurfaceView$Renderer;

    .line 103
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mThreadOwner:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 104
    const-string v0, "PixelBuffer"

    const-string v1, "setRenderer: This thread does not own the OpenGL context."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 111
    :goto_0
    return-void

    .line 109
    :cond_0
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mRenderer:Landroid/opengl/GLSurfaceView$Renderer;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mGL:Ljavax/microedition/khronos/opengles/GL10;

    iget-object v2, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mEGLConfig:Ljavax/microedition/khronos/egl/EGLConfig;

    invoke-interface {v0, v1, v2}, Landroid/opengl/GLSurfaceView$Renderer;->onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V

    .line 110
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mRenderer:Landroid/opengl/GLSurfaceView$Renderer;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mGL:Ljavax/microedition/khronos/opengles/GL10;

    iget v2, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mWidth:I

    iget v3, p0, Ljp/co/cyberagent/android/gpuimage/PixelBuffer;->mHeight:I

    invoke-interface {v0, v1, v2, v3}, Landroid/opengl/GLSurfaceView$Renderer;->onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V

    goto :goto_0
.end method
