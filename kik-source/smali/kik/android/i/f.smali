.class final Lkik/android/i/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x12
.end annotation


# instance fields
.field private a:Ljavax/microedition/khronos/egl/EGL10;

.field private b:Ljavax/microedition/khronos/egl/EGLDisplay;

.field private c:Ljavax/microedition/khronos/egl/EGLContext;

.field private d:Ljavax/microedition/khronos/egl/EGLSurface;

.field private e:Landroid/graphics/SurfaceTexture;

.field private f:Landroid/view/Surface;

.field private g:Ljava/lang/Object;

.field private h:Z

.field private i:Lkik/android/i/g;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lkik/android/i/f;->g:Ljava/lang/Object;

    .line 81
    new-instance v0, Lkik/android/i/g;

    invoke-direct {v0}, Lkik/android/i/g;-><init>()V

    iput-object v0, p0, Lkik/android/i/f;->i:Lkik/android/i/g;

    iget-object v0, p0, Lkik/android/i/f;->i:Lkik/android/i/g;

    invoke-virtual {v0}, Lkik/android/i/g;->b()V

    new-instance v0, Landroid/graphics/SurfaceTexture;

    iget-object v1, p0, Lkik/android/i/f;->i:Lkik/android/i/g;

    invoke-virtual {v1}, Lkik/android/i/g;->a()I

    move-result v1

    invoke-direct {v0, v1}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    iput-object v0, p0, Lkik/android/i/f;->e:Landroid/graphics/SurfaceTexture;

    iget-object v0, p0, Lkik/android/i/f;->e:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v0, p0}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    new-instance v0, Landroid/view/Surface;

    iget-object v1, p0, Lkik/android/i/f;->e:Landroid/graphics/SurfaceTexture;

    invoke-direct {v0, v1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iput-object v0, p0, Lkik/android/i/f;->f:Landroid/view/Surface;

    .line 82
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 170
    iget-object v0, p0, Lkik/android/i/f;->a:Ljavax/microedition/khronos/egl/EGL10;

    if-eqz v0, :cond_1

    .line 171
    iget-object v0, p0, Lkik/android/i/f;->a:Ljavax/microedition/khronos/egl/EGL10;

    invoke-interface {v0}, Ljavax/microedition/khronos/egl/EGL10;->eglGetCurrentContext()Ljavax/microedition/khronos/egl/EGLContext;

    move-result-object v0

    iget-object v1, p0, Lkik/android/i/f;->c:Ljavax/microedition/khronos/egl/EGLContext;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 173
    iget-object v0, p0, Lkik/android/i/f;->a:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Lkik/android/i/f;->b:Ljavax/microedition/khronos/egl/EGLDisplay;

    sget-object v2, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_SURFACE:Ljavax/microedition/khronos/egl/EGLSurface;

    sget-object v3, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_SURFACE:Ljavax/microedition/khronos/egl/EGLSurface;

    sget-object v4, Ljavax/microedition/khronos/egl/EGL10;->EGL_NO_CONTEXT:Ljavax/microedition/khronos/egl/EGLContext;

    invoke-interface {v0, v1, v2, v3, v4}, Ljavax/microedition/khronos/egl/EGL10;->eglMakeCurrent(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLSurface;Ljavax/microedition/khronos/egl/EGLContext;)Z

    .line 176
    :cond_0
    iget-object v0, p0, Lkik/android/i/f;->a:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Lkik/android/i/f;->b:Ljavax/microedition/khronos/egl/EGLDisplay;

    iget-object v2, p0, Lkik/android/i/f;->d:Ljavax/microedition/khronos/egl/EGLSurface;

    invoke-interface {v0, v1, v2}, Ljavax/microedition/khronos/egl/EGL10;->eglDestroySurface(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLSurface;)Z

    .line 177
    iget-object v0, p0, Lkik/android/i/f;->a:Ljavax/microedition/khronos/egl/EGL10;

    iget-object v1, p0, Lkik/android/i/f;->b:Ljavax/microedition/khronos/egl/EGLDisplay;

    iget-object v2, p0, Lkik/android/i/f;->c:Ljavax/microedition/khronos/egl/EGLContext;

    invoke-interface {v0, v1, v2}, Ljavax/microedition/khronos/egl/EGL10;->eglDestroyContext(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLContext;)Z

    .line 179
    :cond_1
    iget-object v0, p0, Lkik/android/i/f;->f:Landroid/view/Surface;

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 182
    iget-object v0, p0, Lkik/android/i/f;->e:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->release()V

    .line 184
    iput-object v5, p0, Lkik/android/i/f;->b:Ljavax/microedition/khronos/egl/EGLDisplay;

    .line 185
    iput-object v5, p0, Lkik/android/i/f;->c:Ljavax/microedition/khronos/egl/EGLContext;

    .line 186
    iput-object v5, p0, Lkik/android/i/f;->d:Ljavax/microedition/khronos/egl/EGLSurface;

    .line 187
    iput-object v5, p0, Lkik/android/i/f;->a:Ljavax/microedition/khronos/egl/EGL10;

    .line 188
    iput-object v5, p0, Lkik/android/i/f;->i:Lkik/android/i/g;

    .line 189
    iput-object v5, p0, Lkik/android/i/f;->f:Landroid/view/Surface;

    .line 190
    iput-object v5, p0, Lkik/android/i/f;->e:Landroid/graphics/SurfaceTexture;

    .line 191
    return-void
.end method

.method public final b()Landroid/view/Surface;
    .locals 1

    .prologue
    .line 212
    iget-object v0, p0, Lkik/android/i/f;->f:Landroid/view/Surface;

    return-object v0
.end method

.method public final c()Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 233
    iget-object v1, p0, Lkik/android/i/f;->g:Ljava/lang/Object;

    monitor-enter v1

    .line 235
    :cond_0
    :try_start_0
    iget-boolean v2, p0, Lkik/android/i/f;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_1

    .line 239
    :try_start_1
    iget-object v2, p0, Lkik/android/i/f;->g:Ljava/lang/Object;

    const-wide/16 v4, 0x1f4

    invoke-virtual {v2, v4, v5}, Ljava/lang/Object;->wait(J)V

    .line 240
    iget-boolean v2, p0, Lkik/android/i/f;->h:Z
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v2, :cond_0

    .line 241
    :try_start_2
    monitor-exit v1

    .line 256
    :goto_0
    return v0

    .line 246
    :catch_0
    move-exception v2

    monitor-exit v1

    goto :goto_0

    .line 251
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 250
    :cond_1
    const/4 v0, 0x0

    :try_start_3
    iput-boolean v0, p0, Lkik/android/i/f;->h:Z

    .line 251
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 253
    const-string v0, "before updateTexImage"

    invoke-static {v0}, Lkik/android/i/g;->a(Ljava/lang/String;)V

    .line 254
    iget-object v0, p0, Lkik/android/i/f;->e:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->updateTexImage()V

    .line 256
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final d()V
    .locals 2

    .prologue
    .line 264
    iget-object v0, p0, Lkik/android/i/f;->i:Lkik/android/i/g;

    iget-object v1, p0, Lkik/android/i/f;->e:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v0, v1}, Lkik/android/i/g;->a(Landroid/graphics/SurfaceTexture;)V

    .line 265
    return-void
.end method

.method public final onFrameAvailable(Landroid/graphics/SurfaceTexture;)V
    .locals 3

    .prologue
    .line 273
    iget-object v1, p0, Lkik/android/i/f;->g:Ljava/lang/Object;

    monitor-enter v1

    .line 274
    :try_start_0
    iget-boolean v0, p0, Lkik/android/i/f;->h:Z

    if-eqz v0, :cond_0

    .line 275
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v2, "mFrameAvailable already set, frame could be dropped"

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 279
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 277
    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lkik/android/i/f;->h:Z

    .line 278
    iget-object v0, p0, Lkik/android/i/f;->g:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 279
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method
