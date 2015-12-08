.class public final Lcom/roidapp/imagelib/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lcom/roidapp/imagelib/a/g;

.field private b:Landroid/app/Activity;

.field private c:Ljp/co/cyberagent/android/gpuimage/GPUImage;

.field private d:Landroid/opengl/GLSurfaceView;

.field private e:Lcom/roidapp/imagelib/filter/bi;

.field private f:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

.field private g:I

.field private h:I

.field private i:Lcom/roidapp/imagelib/a/f;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/a/a;->a:Lcom/roidapp/imagelib/a/g;

    .line 39
    iput-object p1, p0, Lcom/roidapp/imagelib/a/a;->b:Landroid/app/Activity;

    .line 40
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/roidapp/imagelib/a/a;->g:I

    .line 41
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v0, p0, Lcom/roidapp/imagelib/a/a;->h:I

    .line 42
    return-void
.end method

.method static synthetic a(Lcom/roidapp/imagelib/a/a;)Landroid/opengl/GLSurfaceView;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->d:Landroid/opengl/GLSurfaceView;

    return-object v0
.end method

.method private a(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V
    .locals 2

    .prologue
    .line 160
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bi;->h()Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    .line 161
    if-eqz v0, :cond_0

    if-eqz v0, :cond_1

    if-eq p1, v0, :cond_1

    .line 162
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0, p1}, Lcom/roidapp/imagelib/filter/bi;->a(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    .line 163
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->c:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    if-eqz v0, :cond_1

    .line 164
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->c:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    iget-object v1, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/bi;->h()Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->setFilter(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    .line 165
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->c:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->requestRender()V

    .line 168
    :cond_1
    return-void
.end method


# virtual methods
.method public final a(II)Landroid/graphics/Bitmap;
    .locals 6

    .prologue
    .line 242
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 243
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Do not call this method from the UI thread!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 246
    :cond_0
    new-instance v0, Lcom/roidapp/imagelib/a/g;

    invoke-direct {v0, p1, p2}, Lcom/roidapp/imagelib/a/g;-><init>(II)V

    iput-object v0, p0, Lcom/roidapp/imagelib/a/a;->a:Lcom/roidapp/imagelib/a/g;

    .line 248
    new-instance v1, Ljava/util/concurrent/Semaphore;

    const/4 v0, 0x0

    invoke-direct {v1, v0}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    .line 250
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->c:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    iget-object v0, v0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    const/4 v2, 0x1

    iput-boolean v2, v0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mGalaxyYCapture:Z

    .line 252
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->d:Landroid/opengl/GLSurfaceView;

    new-instance v2, Lcom/roidapp/imagelib/a/b;

    invoke-direct {v2, p0}, Lcom/roidapp/imagelib/a/b;-><init>(Lcom/roidapp/imagelib/a/a;)V

    invoke-virtual {v0, v2}, Landroid/opengl/GLSurfaceView;->post(Ljava/lang/Runnable;)Z

    .line 263
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->c:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    iget-object v0, v0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    iget-object v2, v0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mSurfaceChangedWaiter:Ljava/lang/Object;

    monitor-enter v2
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 264
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->c:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    iget-object v0, v0, Ljp/co/cyberagent/android/gpuimage/GPUImage;->mRenderer:Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;

    iget-object v0, v0, Ljp/co/cyberagent/android/gpuimage/GPUImageRenderer;->mSurfaceChangedWaiter:Ljava/lang/Object;

    const-wide/16 v4, 0xbb8

    invoke-virtual {v0, v4, v5}, Ljava/lang/Object;->wait(J)V

    .line 265
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 271
    :goto_0
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->c:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    new-instance v2, Lcom/roidapp/imagelib/a/c;

    invoke-direct {v2, p0, v1}, Lcom/roidapp/imagelib/a/c;-><init>(Lcom/roidapp/imagelib/a/a;Ljava/util/concurrent/Semaphore;)V

    invoke-virtual {v0, v2}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->runOnGLThread(Ljava/lang/Runnable;)V

    .line 1401
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->d:Landroid/opengl/GLSurfaceView;

    invoke-virtual {v0}, Landroid/opengl/GLSurfaceView;->requestRender()V

    .line 278
    invoke-virtual {v1}, Ljava/util/concurrent/Semaphore;->acquire()V

    .line 279
    invoke-virtual {p0}, Lcom/roidapp/imagelib/a/a;->h()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 282
    return-object v0

    .line 265
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

    .line 267
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0
.end method

.method public final a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 175
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bi;->c()V

    .line 176
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0, p1}, Lcom/roidapp/imagelib/filter/bi;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->c:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->startRender()V

    .line 85
    return-void
.end method

.method public final a(I)V
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0, p1}, Lcom/roidapp/imagelib/filter/bi;->a(I)V

    .line 81
    return-void
.end method

.method public final a(ILcom/roidapp/imagelib/a/e;)V
    .locals 2

    .prologue
    .line 225
    new-instance v0, Lcom/roidapp/imagelib/a/f;

    invoke-direct {v0, p0, p1, p2}, Lcom/roidapp/imagelib/a/f;-><init>(Lcom/roidapp/imagelib/a/a;ILcom/roidapp/imagelib/a/e;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/a/a;->i:Lcom/roidapp/imagelib/a/f;

    .line 226
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->i:Lcom/roidapp/imagelib/a/f;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/a/f;->execute([Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;

    .line 227
    return-void
.end method

.method public final a(IZZ)V
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0, p1, p2, p3}, Lcom/roidapp/imagelib/filter/bi;->a(IZZ)V

    .line 67
    return-void
.end method

.method public final a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V
    .locals 6

    .prologue
    .line 126
    invoke-interface {p1}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->a()I

    move-result v1

    .line 127
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/bi;->b(I)V

    .line 128
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0, p1}, Lcom/roidapp/imagelib/filter/bi;->a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 129
    instance-of v0, p1, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    if-eqz v0, :cond_0

    .line 130
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    check-cast p1, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    iget v1, p0, Lcom/roidapp/imagelib/a/a;->g:I

    iget v2, p0, Lcom/roidapp/imagelib/a/a;->h:I

    iget-object v3, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v3}, Lcom/roidapp/imagelib/filter/bi;->g()Lcom/roidapp/imagelib/b/b;

    move-result-object v3

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/roidapp/imagelib/filter/bi;->a(Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;IILcom/roidapp/imagelib/b/b;)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/a/a;->f:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 133
    :goto_0
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->f:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    iget-object v1, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/bi;->d()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->setDarkCorner(Z)V

    .line 134
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->f:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/a/a;->a(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    .line 135
    return-void

    .line 132
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    iget v2, p0, Lcom/roidapp/imagelib/a/a;->g:I

    iget v3, p0, Lcom/roidapp/imagelib/a/a;->h:I

    iget-object v4, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v4}, Lcom/roidapp/imagelib/filter/bi;->g()Lcom/roidapp/imagelib/b/b;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/imagelib/filter/bi;->a(IIILcom/roidapp/imagelib/b/b;Z)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/a/a;->f:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    goto :goto_0
.end method

.method public final a(Ljp/co/cyberagent/android/gpuimage/GPUImage;Landroid/opengl/GLSurfaceView;)V
    .locals 6

    .prologue
    const/4 v2, 0x1

    const/4 v5, 0x0

    .line 45
    iput-object p1, p0, Lcom/roidapp/imagelib/a/a;->c:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    .line 46
    iput-object p2, p0, Lcom/roidapp/imagelib/a/a;->d:Landroid/opengl/GLSurfaceView;

    .line 47
    new-instance v0, Lcom/roidapp/imagelib/filter/bi;

    iget-object v1, p0, Lcom/roidapp/imagelib/a/a;->b:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lcom/roidapp/imagelib/filter/bi;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    .line 48
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0, v5}, Lcom/roidapp/imagelib/filter/bi;->b(I)V

    .line 49
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    new-instance v1, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    invoke-direct {v1, v5}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>(B)V

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/bi;->a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 50
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/filter/bi;->c(Z)V

    .line 51
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bi;->b()V

    .line 52
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/filter/bi;->a(Z)V

    .line 53
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bi;->e()V

    .line 54
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    new-instance v1, Lcom/roidapp/imagelib/b/b;

    invoke-direct {v1}, Lcom/roidapp/imagelib/b/b;-><init>()V

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/bi;->a(Lcom/roidapp/imagelib/b/b;)V

    .line 55
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    iget-object v1, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/bi;->f()I

    move-result v1

    iget v2, p0, Lcom/roidapp/imagelib/a/a;->g:I

    iget v3, p0, Lcom/roidapp/imagelib/a/a;->h:I

    iget-object v4, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v4}, Lcom/roidapp/imagelib/filter/bi;->g()Lcom/roidapp/imagelib/b/b;

    move-result-object v4

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/imagelib/filter/bi;->a(IIILcom/roidapp/imagelib/b/b;Z)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/a/a;->f:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 56
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->f:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    invoke-virtual {v0, v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->setDarkCorner(Z)V

    .line 57
    return-void
.end method

.method public final a(Z)V
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0, p1}, Lcom/roidapp/imagelib/filter/bi;->b(Z)V

    .line 61
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->f:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    invoke-virtual {v0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->setDarkCorner(Z)V

    .line 62
    return-void
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bi;->f()I

    move-result v0

    return v0
.end method

.method public final b(I)V
    .locals 1

    .prologue
    .line 149
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0, p1}, Lcom/roidapp/imagelib/filter/bi;->a(I)V

    .line 150
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bi;->j()V

    .line 151
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->c:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->requestRender()V

    .line 152
    return-void
.end method

.method public final b(Z)V
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0, p1}, Lcom/roidapp/imagelib/filter/bi;->a(Z)V

    .line 77
    return-void
.end method

.method public final c()V
    .locals 6

    .prologue
    .line 115
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bi;->i()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v0

    .line 116
    instance-of v1, v0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    if-eqz v1, :cond_0

    .line 117
    iget-object v1, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    check-cast v0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    iget v2, p0, Lcom/roidapp/imagelib/a/a;->g:I

    iget v3, p0, Lcom/roidapp/imagelib/a/a;->h:I

    iget-object v4, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v4}, Lcom/roidapp/imagelib/filter/bi;->g()Lcom/roidapp/imagelib/b/b;

    move-result-object v4

    invoke-virtual {v1, v0, v2, v3, v4}, Lcom/roidapp/imagelib/filter/bi;->a(Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;IILcom/roidapp/imagelib/b/b;)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/a/a;->f:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 121
    :goto_0
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->f:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    iget-object v1, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/bi;->d()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->setDarkCorner(Z)V

    .line 122
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->f:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/a/a;->a(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    .line 123
    return-void

    .line 119
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    iget-object v1, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/bi;->f()I

    move-result v1

    iget v2, p0, Lcom/roidapp/imagelib/a/a;->g:I

    iget v3, p0, Lcom/roidapp/imagelib/a/a;->h:I

    iget-object v4, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v4}, Lcom/roidapp/imagelib/filter/bi;->g()Lcom/roidapp/imagelib/b/b;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/imagelib/filter/bi;->a(IIILcom/roidapp/imagelib/b/b;Z)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/a/a;->f:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    goto :goto_0
.end method

.method public final c(I)V
    .locals 1

    .prologue
    .line 155
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0, p1}, Lcom/roidapp/imagelib/filter/bi;->a(I)V

    .line 156
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bi;->j()V

    .line 157
    return-void
.end method

.method public final c(Z)V
    .locals 6

    .prologue
    .line 138
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0, p1}, Lcom/roidapp/imagelib/filter/bi;->b(Z)V

    .line 139
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bi;->i()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v0

    .line 140
    instance-of v1, v0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    if-eqz v1, :cond_0

    .line 141
    iget-object v1, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    check-cast v0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    iget v2, p0, Lcom/roidapp/imagelib/a/a;->g:I

    iget v3, p0, Lcom/roidapp/imagelib/a/a;->h:I

    iget-object v4, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v4}, Lcom/roidapp/imagelib/filter/bi;->g()Lcom/roidapp/imagelib/b/b;

    move-result-object v4

    invoke-virtual {v1, v0, v2, v3, v4}, Lcom/roidapp/imagelib/filter/bi;->a(Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;IILcom/roidapp/imagelib/b/b;)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/a/a;->f:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 144
    :goto_0
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->f:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    invoke-virtual {v0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->setDarkCorner(Z)V

    .line 145
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->f:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/a/a;->a(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    .line 146
    return-void

    .line 143
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    iget-object v1, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/bi;->f()I

    move-result v1

    iget v2, p0, Lcom/roidapp/imagelib/a/a;->g:I

    iget v3, p0, Lcom/roidapp/imagelib/a/a;->h:I

    iget-object v4, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v4}, Lcom/roidapp/imagelib/filter/bi;->g()Lcom/roidapp/imagelib/b/b;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/imagelib/filter/bi;->a(IIILcom/roidapp/imagelib/b/b;Z)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/a/a;->f:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    goto :goto_0
.end method

.method public final d()Lcom/roidapp/imagelib/b/b;
    .locals 1

    .prologue
    .line 171
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bi;->g()Lcom/roidapp/imagelib/b/b;

    move-result-object v0

    return-object v0
.end method

.method public final e()V
    .locals 1

    .prologue
    .line 180
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->d:Landroid/opengl/GLSurfaceView;

    if-eqz v0, :cond_0

    .line 181
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->c:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->deleteBufferDirectly()V

    .line 182
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->c:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->deleteImage()V

    .line 183
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->c:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->deleteFilter()V

    .line 185
    :cond_0
    return-void
.end method

.method public final f()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;
    .locals 1

    .prologue
    .line 188
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->e:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bi;->i()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v0

    return-object v0
.end method

.method public final g()V
    .locals 2

    .prologue
    .line 230
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->i:Lcom/roidapp/imagelib/a/f;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/a/f;->cancel(Z)Z

    .line 231
    return-void
.end method

.method public final h()Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    .line 291
    new-instance v5, Ljava/util/concurrent/Semaphore;

    const/4 v0, 0x0

    invoke-direct {v5, v0}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    .line 293
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->d:Landroid/opengl/GLSurfaceView;

    invoke-virtual {v0}, Landroid/opengl/GLSurfaceView;->getMeasuredWidth()I

    move-result v2

    .line 294
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->d:Landroid/opengl/GLSurfaceView;

    invoke-virtual {v0}, Landroid/opengl/GLSurfaceView;->getMeasuredHeight()I

    move-result v3

    .line 297
    mul-int v0, v2, v3

    new-array v4, v0, [I

    .line 298
    iget-object v6, p0, Lcom/roidapp/imagelib/a/a;->c:Ljp/co/cyberagent/android/gpuimage/GPUImage;

    new-instance v0, Lcom/roidapp/imagelib/a/d;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/imagelib/a/d;-><init>(Lcom/roidapp/imagelib/a/a;II[ILjava/util/concurrent/Semaphore;)V

    invoke-virtual {v6, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImage;->runOnGLThread(Ljava/lang/Runnable;)V

    .line 2401
    iget-object v0, p0, Lcom/roidapp/imagelib/a/a;->d:Landroid/opengl/GLSurfaceView;

    invoke-virtual {v0}, Landroid/opengl/GLSurfaceView;->requestRender()V

    .line 315
    invoke-virtual {v5}, Ljava/util/concurrent/Semaphore;->acquire()V

    .line 317
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v3, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 318
    invoke-static {v4}, Ljava/nio/IntBuffer;->wrap([I)Ljava/nio/IntBuffer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->copyPixelsFromBuffer(Ljava/nio/Buffer;)V

    .line 319
    return-object v0
.end method
