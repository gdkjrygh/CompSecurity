.class public final Lcom/roidapp/videolib/gl/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Landroid/opengl/GLSurfaceView$Renderer;

.field b:I

.field c:I

.field d:Landroid/graphics/Bitmap;

.field e:Ljavax/microedition/khronos/egl/EGL10;

.field f:Ljavax/microedition/khronos/egl/EGLDisplay;

.field g:[Ljavax/microedition/khronos/egl/EGLConfig;

.field h:Ljavax/microedition/khronos/egl/EGLConfig;

.field i:Ljavax/microedition/khronos/egl/EGLContext;

.field j:Ljavax/microedition/khronos/egl/EGLSurface;

.field k:Ljavax/microedition/khronos/opengles/GL10;

.field l:Ljava/lang/String;

.field m:Ljava/nio/IntBuffer;


# direct methods
.method public constructor <init>(II)V
    .locals 7

    .prologue
    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput p1, p0, Lcom/roidapp/videolib/gl/h;->b:I

    .line 59
    iput p2, p0, Lcom/roidapp/videolib/gl/h;->c:I

    .line 61
    const/4 v0, 0x2

    new-array v1, v0, [I

    .line 62
    const/4 v0, 0x5

    new-array v6, v0, [I

    const/4 v0, 0x0

    const/16 v2, 0x3057

    aput v2, v6, v0

    const/4 v0, 0x1

    iget v2, p0, Lcom/roidapp/videolib/gl/h;->b:I

    aput v2, v6, v0

    const/4 v0, 0x2

    const/16 v2, 0x3056

    aput v2, v6, v0

    const/4 v0, 0x3

    iget v2, p0, Lcom/roidapp/videolib/gl/h;->c:I

    aput v2, v6, v0

    const/4 v0, 0x4

    const/16 v2, 0x3038

    aput v2, v6, v0

    .line 69
    invoke-static {}, Ljavax/microedition/khronos/egl/EGLContext;->getEGL()Ljavax/microedition/khronos/egl/EGL;

    move-result-object v0

    check-cast v0, Ljavax/microedition/khronos/egl/EGL10;

    iput-object v0, p0, Lcom/roidapp/videolib/gl/h;->e:Ljavax/microedition/khronos/egl/EGL10;

    .line 70
    iget-object v0, p0, Lcom/roidapp/videolib/gl/h;->e:Ljavax/microedition/khronos/egl/EGL10;

    sget-object v2, Ljavax/microedition/khronos/egl/EGL10;->EGL_DEFAULT_DISPLAY:Ljava/lang/Object;

    invoke-interface {v0, v2}, Ljavax/microedition/khronos/egl/EGL10;->eglGetDisplay(Ljava/lang/Object;)Ljavax/microedition/khronos/egl/EGLDisplay;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/videolib/gl/h;->f:Ljavax/microedition/khronos/egl/EGLDisplay;

    .line 71
    iget-object v0, p0, Lcom/roidapp/videolib/gl/h;->e:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v2, p0, Lcom/roidapp/videolib/gl/h;->f:Ljavax/microedition/khronos/egl/EGLDisplay;

    invoke-interface {v0, v2, v1}, Ljavax/microedition/khronos/egl/EGL10;->eglInitialize(Ljavax/microedition/khronos/egl/EGLDisplay;[I)Z

    .line 1187
    const/16 v0, 0xf

    new-array v2, v0, [I

    fill-array-data v2, :array_0

    .line 1200
    const/4 v0, 0x1

    new-array v5, v0, [I

    .line 1201
    iget-object v0, p0, Lcom/roidapp/videolib/gl/h;->e:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Lcom/roidapp/videolib/gl/h;->f:Ljavax/microedition/khronos/egl/EGLDisplay;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-interface/range {v0 .. v5}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z

    .line 1202
    const/4 v0, 0x0

    aget v4, v5, v0

    .line 1203
    new-array v0, v4, [Ljavax/microedition/khronos/egl/EGLConfig;

    iput-object v0, p0, Lcom/roidapp/videolib/gl/h;->g:[Ljavax/microedition/khronos/egl/EGLConfig;

    .line 1204
    iget-object v0, p0, Lcom/roidapp/videolib/gl/h;->e:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Lcom/roidapp/videolib/gl/h;->f:Ljavax/microedition/khronos/egl/EGLDisplay;

    iget-object v3, p0, Lcom/roidapp/videolib/gl/h;->g:[Ljavax/microedition/khronos/egl/EGLConfig;

    invoke-interface/range {v0 .. v5}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z

    .line 1210
    iget-object v0, p0, Lcom/roidapp/videolib/gl/h;->g:[Ljavax/microedition/khronos/egl/EGLConfig;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    .line 72
    iput-object v0, p0, Lcom/roidapp/videolib/gl/h;->h:Ljavax/microedition/khronos/egl/EGLConfig;

    .line 78
    const/4 v0, 0x3

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    .line 82
    iget-object v1, p0, Lcom/roidapp/videolib/gl/h;->e:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v2, p0, Lcom/roidapp/videolib/gl/h;->f:Ljavax/microedition/khronos/egl/EGLDisplay;

    iget-object v3, p0, Lcom/roidapp/videolib/gl/h;->h:Ljavax/microedition/khronos/egl/EGLConfig;

    sget-object v4, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_CONTEXT:Ljavax/microedition/khronos/egl/EGLContext;

    invoke-interface {v1, v2, v3, v4, v0}, Ljavax/microedition/khronos/egl/EGL10;->eglCreateContext(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;Ljavax/microedition/khronos/egl/EGLContext;[I)Ljavax/microedition/khronos/egl/EGLContext;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/videolib/gl/h;->i:Ljavax/microedition/khronos/egl/EGLContext;

    .line 84
    iget-object v0, p0, Lcom/roidapp/videolib/gl/h;->e:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Lcom/roidapp/videolib/gl/h;->f:Ljavax/microedition/khronos/egl/EGLDisplay;

    iget-object v2, p0, Lcom/roidapp/videolib/gl/h;->h:Ljavax/microedition/khronos/egl/EGLConfig;

    invoke-interface {v0, v1, v2, v6}, Ljavax/microedition/khronos/egl/EGL10;->eglCreatePbufferSurface(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;[I)Ljavax/microedition/khronos/egl/EGLSurface;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/videolib/gl/h;->j:Ljavax/microedition/khronos/egl/EGLSurface;

    .line 85
    iget-object v0, p0, Lcom/roidapp/videolib/gl/h;->e:Ljavax/microedition/khronos/egl/EGL10;

    invoke-interface {v0}, Ljavax/microedition/khronos/egl/EGL10;->eglGetError()I

    move-result v0

    .line 86
    const/16 v1, 0x3000

    if-eq v0, v1, :cond_0

    .line 2163
    iget-object v0, p0, Lcom/roidapp/videolib/gl/h;->e:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Lcom/roidapp/videolib/gl/h;->f:Ljavax/microedition/khronos/egl/EGLDisplay;

    sget-object v2, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_SURFACE:Ljavax/microedition/khronos/egl/EGLSurface;

    sget-object v3, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_SURFACE:Ljavax/microedition/khronos/egl/EGLSurface;

    sget-object v4, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_CONTEXT:Ljavax/microedition/khronos/egl/EGLContext;

    invoke-interface {v0, v1, v2, v3, v4}, Ljavax/microedition/khronos/egl/EGL10;->eglMakeCurrent(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLContext;)Z

    .line 2166
    iget-object v0, p0, Lcom/roidapp/videolib/gl/h;->e:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Lcom/roidapp/videolib/gl/h;->f:Ljavax/microedition/khronos/egl/EGLDisplay;

    iget-object v2, p0, Lcom/roidapp/videolib/gl/h;->j:Ljavax/microedition/khronos/egl/EGLSurface;

    invoke-interface {v0, v1, v2}, Ljavax/microedition/khronos/egl/EGL10;->eglDestroySurface(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLSurface;)Z

    .line 2167
    iget-object v0, p0, Lcom/roidapp/videolib/gl/h;->e:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Lcom/roidapp/videolib/gl/h;->f:Ljavax/microedition/khronos/egl/EGLDisplay;

    iget-object v2, p0, Lcom/roidapp/videolib/gl/h;->i:Ljavax/microedition/khronos/egl/EGLContext;

    invoke-interface {v0, v1, v2}, Ljavax/microedition/khronos/egl/EGL10;->eglDestroyContext(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLContext;)Z

    .line 2168
    iget-object v0, p0, Lcom/roidapp/videolib/gl/h;->e:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Lcom/roidapp/videolib/gl/h;->f:Ljavax/microedition/khronos/egl/EGLDisplay;

    invoke-interface {v0, v1}, Ljavax/microedition/khronos/egl/EGL10;->eglTerminate(Ljavax/microedition/khronos/egl/EGLDisplay;)Z

    .line 88
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 92
    :cond_0
    iget-object v0, p0, Lcom/roidapp/videolib/gl/h;->e:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Lcom/roidapp/videolib/gl/h;->f:Ljavax/microedition/khronos/egl/EGLDisplay;

    iget-object v2, p0, Lcom/roidapp/videolib/gl/h;->j:Ljavax/microedition/khronos/egl/EGLSurface;

    iget-object v3, p0, Lcom/roidapp/videolib/gl/h;->j:Ljavax/microedition/khronos/egl/EGLSurface;

    iget-object v4, p0, Lcom/roidapp/videolib/gl/h;->i:Ljavax/microedition/khronos/egl/EGLContext;

    invoke-interface {v0, v1, v2, v3, v4}, Ljavax/microedition/khronos/egl/EGL10;->eglMakeCurrent(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLContext;)Z

    .line 94
    iget-object v0, p0, Lcom/roidapp/videolib/gl/h;->i:Ljavax/microedition/khronos/egl/EGLContext;

    invoke-virtual {v0}, Ljavax/microedition/khronos/egl/EGLContext;->getGL()Ljavax/microedition/khronos/opengles/GL;

    move-result-object v0

    check-cast v0, Ljavax/microedition/khronos/opengles/GL10;

    iput-object v0, p0, Lcom/roidapp/videolib/gl/h;->k:Ljavax/microedition/khronos/opengles/GL10;

    .line 97
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/videolib/gl/h;->l:Ljava/lang/String;

    .line 98
    return-void

    .line 1187
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

    .line 78
    :array_1
    .array-data 4
        0x3098
        0x2
        0x3038
    .end array-data
.end method


# virtual methods
.method public final a()Landroid/graphics/Bitmap;
    .locals 8

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 136
    iget-object v2, p0, Lcom/roidapp/videolib/gl/h;->a:Landroid/opengl/GLSurfaceView$Renderer;

    if-nez v2, :cond_0

    .line 137
    const-string v1, "PixelBuffer"

    const-string v2, "getBitmap: Renderer was not set."

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 159
    :goto_0
    return-object v0

    .line 142
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/videolib/gl/h;->l:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 143
    const-string v1, "PixelBuffer"

    const-string v2, "getBitmap: This thread does not own the OpenGL context."

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 149
    :cond_1
    iget-object v0, p0, Lcom/roidapp/videolib/gl/h;->a:Landroid/opengl/GLSurfaceView$Renderer;

    iget-object v2, p0, Lcom/roidapp/videolib/gl/h;->k:Ljavax/microedition/khronos/opengles/GL10;

    invoke-interface {v0, v2}, Landroid/opengl/GLSurfaceView$Renderer;->onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V

    .line 2248
    iget-object v0, p0, Lcom/roidapp/videolib/gl/h;->m:Ljava/nio/IntBuffer;

    invoke-virtual {v0}, Ljava/nio/IntBuffer;->rewind()Ljava/nio/Buffer;

    .line 2249
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2250
    iget-object v0, p0, Lcom/roidapp/videolib/gl/h;->k:Ljavax/microedition/khronos/opengles/GL10;

    iget v3, p0, Lcom/roidapp/videolib/gl/h;->b:I

    iget v4, p0, Lcom/roidapp/videolib/gl/h;->c:I

    const/16 v5, 0x1908

    const/16 v6, 0x1401

    iget-object v7, p0, Lcom/roidapp/videolib/gl/h;->m:Ljava/nio/IntBuffer;

    move v2, v1

    invoke-interface/range {v0 .. v7}, Ljavax/microedition/khronos/opengles/GL10;->glReadPixels(IIIIIILjava/nio/Buffer;)V

    .line 2260
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2262
    iget-object v0, p0, Lcom/roidapp/videolib/gl/h;->d:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/roidapp/videolib/gl/h;->m:Ljava/nio/IntBuffer;

    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->copyPixelsFromBuffer(Ljava/nio/Buffer;)V

    .line 2263
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 159
    iget-object v0, p0, Lcom/roidapp/videolib/gl/h;->d:Landroid/graphics/Bitmap;

    goto :goto_0
.end method

.method public final a(Landroid/opengl/GLSurfaceView$Renderer;)V
    .locals 4

    .prologue
    .line 101
    iput-object p1, p0, Lcom/roidapp/videolib/gl/h;->a:Landroid/opengl/GLSurfaceView$Renderer;

    .line 104
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/videolib/gl/h;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 105
    const-string v0, "PixelBuffer"

    const-string v1, "setRenderer: This thread does not own the OpenGL context."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 122
    :goto_0
    return-void

    .line 110
    :cond_0
    iget-object v0, p0, Lcom/roidapp/videolib/gl/h;->a:Landroid/opengl/GLSurfaceView$Renderer;

    iget-object v1, p0, Lcom/roidapp/videolib/gl/h;->k:Ljavax/microedition/khronos/opengles/GL10;

    iget-object v2, p0, Lcom/roidapp/videolib/gl/h;->h:Ljavax/microedition/khronos/egl/EGLConfig;

    invoke-interface {v0, v1, v2}, Landroid/opengl/GLSurfaceView$Renderer;->onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V

    .line 111
    iget-object v0, p0, Lcom/roidapp/videolib/gl/h;->a:Landroid/opengl/GLSurfaceView$Renderer;

    iget-object v1, p0, Lcom/roidapp/videolib/gl/h;->k:Ljavax/microedition/khronos/opengles/GL10;

    iget v2, p0, Lcom/roidapp/videolib/gl/h;->b:I

    iget v3, p0, Lcom/roidapp/videolib/gl/h;->c:I

    invoke-interface {v0, v1, v2, v3}, Landroid/opengl/GLSurfaceView$Renderer;->onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V

    .line 118
    iget v0, p0, Lcom/roidapp/videolib/gl/h;->b:I

    iget v1, p0, Lcom/roidapp/videolib/gl/h;->c:I

    mul-int/2addr v0, v1

    invoke-static {v0}, Ljava/nio/IntBuffer;->allocate(I)Ljava/nio/IntBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/videolib/gl/h;->m:Ljava/nio/IntBuffer;

    .line 119
    iget v0, p0, Lcom/roidapp/videolib/gl/h;->b:I

    iget v1, p0, Lcom/roidapp/videolib/gl/h;->c:I

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/videolib/gl/h;->d:Landroid/graphics/Bitmap;

    goto :goto_0
.end method

.method public final b()V
    .locals 5

    .prologue
    .line 174
    iget-object v0, p0, Lcom/roidapp/videolib/gl/h;->d:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/videolib/gl/h;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 175
    iget-object v0, p0, Lcom/roidapp/videolib/gl/h;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 176
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/videolib/gl/h;->d:Landroid/graphics/Bitmap;

    .line 178
    :cond_0
    iget-object v0, p0, Lcom/roidapp/videolib/gl/h;->e:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Lcom/roidapp/videolib/gl/h;->f:Ljavax/microedition/khronos/egl/EGLDisplay;

    sget-object v2, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_SURFACE:Ljavax/microedition/khronos/egl/EGLSurface;

    sget-object v3, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_SURFACE:Ljavax/microedition/khronos/egl/EGLSurface;

    sget-object v4, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_CONTEXT:Ljavax/microedition/khronos/egl/EGLContext;

    invoke-interface {v0, v1, v2, v3, v4}, Ljavax/microedition/khronos/egl/EGL10;->eglMakeCurrent(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLContext;)Z

    .line 181
    iget-object v0, p0, Lcom/roidapp/videolib/gl/h;->e:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Lcom/roidapp/videolib/gl/h;->f:Ljavax/microedition/khronos/egl/EGLDisplay;

    iget-object v2, p0, Lcom/roidapp/videolib/gl/h;->j:Ljavax/microedition/khronos/egl/EGLSurface;

    invoke-interface {v0, v1, v2}, Ljavax/microedition/khronos/egl/EGL10;->eglDestroySurface(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLSurface;)Z

    .line 182
    iget-object v0, p0, Lcom/roidapp/videolib/gl/h;->e:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Lcom/roidapp/videolib/gl/h;->f:Ljavax/microedition/khronos/egl/EGLDisplay;

    iget-object v2, p0, Lcom/roidapp/videolib/gl/h;->i:Ljavax/microedition/khronos/egl/EGLContext;

    invoke-interface {v0, v1, v2}, Ljavax/microedition/khronos/egl/EGL10;->eglDestroyContext(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLContext;)Z

    .line 183
    iget-object v0, p0, Lcom/roidapp/videolib/gl/h;->e:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Lcom/roidapp/videolib/gl/h;->f:Ljavax/microedition/khronos/egl/EGLDisplay;

    invoke-interface {v0, v1}, Ljavax/microedition/khronos/egl/EGL10;->eglTerminate(Ljavax/microedition/khronos/egl/EGLDisplay;)Z

    .line 184
    return-void
.end method
