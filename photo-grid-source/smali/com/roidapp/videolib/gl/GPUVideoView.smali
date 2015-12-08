.class public Lcom/roidapp/videolib/gl/GPUVideoView;
.super Landroid/opengl/GLSurfaceView;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/roidapp/videolib/b/i;

.field private c:Lcom/roidapp/videolib/b/m;

.field private d:Lcom/roidapp/videolib/gl/f;

.field private e:Landroid/os/Handler;

.field private f:Ljava/lang/Runnable;

.field private g:Ljava/lang/Runnable;

.field private h:Lcom/roidapp/videolib/gl/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/16 v1, 0x8

    .line 54
    invoke-direct {p0, p1}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;)V

    .line 21
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->e:Landroid/os/Handler;

    .line 22
    new-instance v0, Lcom/roidapp/videolib/gl/b;

    invoke-direct {v0, p0}, Lcom/roidapp/videolib/gl/b;-><init>(Lcom/roidapp/videolib/gl/GPUVideoView;)V

    iput-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->f:Ljava/lang/Runnable;

    .line 29
    new-instance v0, Lcom/roidapp/videolib/gl/c;

    invoke-direct {v0, p0}, Lcom/roidapp/videolib/gl/c;-><init>(Lcom/roidapp/videolib/gl/GPUVideoView;)V

    iput-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->g:Ljava/lang/Runnable;

    .line 137
    sget-object v0, Lcom/roidapp/videolib/gl/d;->a:Lcom/roidapp/videolib/gl/d;

    iput-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->h:Lcom/roidapp/videolib/gl/d;

    .line 55
    invoke-static {p1}, Lcom/roidapp/videolib/gl/GPUVideoView;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 56
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "OpenGL ES 2.0 is not supported on this phone."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 58
    :cond_0
    iput-object p1, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->a:Landroid/content/Context;

    .line 59
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/roidapp/videolib/gl/GPUVideoView;->setEGLContextClientVersion(I)V

    .line 60
    const/16 v5, 0x10

    move-object v0, p0

    move v2, v1

    move v3, v1

    move v4, v1

    invoke-virtual/range {v0 .. v6}, Lcom/roidapp/videolib/gl/GPUVideoView;->setEGLConfigChooser(IIIIII)V

    .line 61
    invoke-virtual {p0}, Lcom/roidapp/videolib/gl/GPUVideoView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->setFormat(I)V

    .line 62
    new-instance v0, Lcom/roidapp/videolib/b/m;

    invoke-direct {v0, p1}, Lcom/roidapp/videolib/b/m;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->c:Lcom/roidapp/videolib/b/m;

    .line 63
    new-instance v0, Lcom/roidapp/videolib/b/i;

    iget-object v1, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->c:Lcom/roidapp/videolib/b/m;

    invoke-direct {v0, v1}, Lcom/roidapp/videolib/b/i;-><init>(Lcom/roidapp/videolib/b/m;)V

    iput-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->b:Lcom/roidapp/videolib/b/i;

    .line 64
    iget-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->b:Lcom/roidapp/videolib/b/i;

    invoke-virtual {v0, v6}, Lcom/roidapp/videolib/b/i;->a(Z)V

    .line 66
    iget-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->b:Lcom/roidapp/videolib/b/i;

    invoke-virtual {p0, v0}, Lcom/roidapp/videolib/gl/GPUVideoView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    .line 67
    invoke-virtual {p0, v6}, Lcom/roidapp/videolib/gl/GPUVideoView;->setRenderMode(I)V

    .line 68
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/16 v1, 0x8

    .line 38
    invoke-direct {p0, p1, p2}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 21
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->e:Landroid/os/Handler;

    .line 22
    new-instance v0, Lcom/roidapp/videolib/gl/b;

    invoke-direct {v0, p0}, Lcom/roidapp/videolib/gl/b;-><init>(Lcom/roidapp/videolib/gl/GPUVideoView;)V

    iput-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->f:Ljava/lang/Runnable;

    .line 29
    new-instance v0, Lcom/roidapp/videolib/gl/c;

    invoke-direct {v0, p0}, Lcom/roidapp/videolib/gl/c;-><init>(Lcom/roidapp/videolib/gl/GPUVideoView;)V

    iput-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->g:Ljava/lang/Runnable;

    .line 137
    sget-object v0, Lcom/roidapp/videolib/gl/d;->a:Lcom/roidapp/videolib/gl/d;

    iput-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->h:Lcom/roidapp/videolib/gl/d;

    .line 39
    invoke-static {p1}, Lcom/roidapp/videolib/gl/GPUVideoView;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 40
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "OpenGL ES 2.0 is not supported on this phone."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 42
    :cond_0
    iput-object p1, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->a:Landroid/content/Context;

    .line 43
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/roidapp/videolib/gl/GPUVideoView;->setEGLContextClientVersion(I)V

    .line 44
    const/16 v5, 0x10

    move-object v0, p0

    move v2, v1

    move v3, v1

    move v4, v1

    invoke-virtual/range {v0 .. v6}, Lcom/roidapp/videolib/gl/GPUVideoView;->setEGLConfigChooser(IIIIII)V

    .line 45
    invoke-virtual {p0}, Lcom/roidapp/videolib/gl/GPUVideoView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->setFormat(I)V

    .line 46
    new-instance v0, Lcom/roidapp/videolib/b/m;

    invoke-direct {v0, p1}, Lcom/roidapp/videolib/b/m;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->c:Lcom/roidapp/videolib/b/m;

    .line 47
    new-instance v0, Lcom/roidapp/videolib/b/i;

    iget-object v1, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->c:Lcom/roidapp/videolib/b/m;

    invoke-direct {v0, v1}, Lcom/roidapp/videolib/b/i;-><init>(Lcom/roidapp/videolib/b/m;)V

    iput-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->b:Lcom/roidapp/videolib/b/i;

    .line 48
    iget-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->b:Lcom/roidapp/videolib/b/i;

    invoke-virtual {v0, v6}, Lcom/roidapp/videolib/b/i;->a(Z)V

    .line 49
    iget-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->b:Lcom/roidapp/videolib/b/i;

    invoke-virtual {p0, v0}, Lcom/roidapp/videolib/gl/GPUVideoView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    .line 50
    invoke-virtual {p0, v6}, Lcom/roidapp/videolib/gl/GPUVideoView;->setRenderMode(I)V

    .line 51
    return-void
.end method

.method static synthetic a(Lcom/roidapp/videolib/gl/GPUVideoView;)Lcom/roidapp/videolib/b/i;
    .locals 1

    .prologue
    .line 15
    iget-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->b:Lcom/roidapp/videolib/b/i;

    return-object v0
.end method

.method private static a(Landroid/content/Context;)Z
    .locals 2

    .prologue
    .line 77
    const-string v0, "activity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    .line 79
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getDeviceConfigurationInfo()Landroid/content/pm/ConfigurationInfo;

    move-result-object v0

    .line 81
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
.method public final a()V
    .locals 1

    .prologue
    .line 92
    invoke-virtual {p0}, Lcom/roidapp/videolib/gl/GPUVideoView;->getRenderMode()I

    move-result v0

    if-nez v0, :cond_0

    .line 94
    iget-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->b:Lcom/roidapp/videolib/b/i;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/i;->d()V

    .line 95
    invoke-virtual {p0}, Lcom/roidapp/videolib/gl/GPUVideoView;->requestRender()V

    .line 97
    :cond_0
    return-void
.end method

.method public final a(F)V
    .locals 1

    .prologue
    .line 131
    iget-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->b:Lcom/roidapp/videolib/b/i;

    invoke-virtual {v0, p1}, Lcom/roidapp/videolib/b/i;->a(F)V

    .line 132
    return-void
.end method

.method public final a(I)V
    .locals 3

    .prologue
    .line 150
    iget-object v1, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->h:Lcom/roidapp/videolib/gl/d;

    monitor-enter v1

    .line 151
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->h:Lcom/roidapp/videolib/gl/d;

    sget-object v2, Lcom/roidapp/videolib/gl/d;->b:Lcom/roidapp/videolib/gl/d;

    if-eq v0, v2, :cond_0

    .line 152
    sget-object v0, Lcom/roidapp/videolib/gl/d;->b:Lcom/roidapp/videolib/gl/d;

    iput-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->h:Lcom/roidapp/videolib/gl/d;

    .line 154
    :cond_0
    iget-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->b:Lcom/roidapp/videolib/b/i;

    invoke-virtual {v0, p1}, Lcom/roidapp/videolib/b/i;->a(I)V

    .line 155
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/roidapp/videolib/gl/GPUVideoView;->setRenderMode(I)V

    .line 157
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(IZ)V
    .locals 1

    .prologue
    .line 100
    iget-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->c:Lcom/roidapp/videolib/b/m;

    if-eqz v0, :cond_0

    .line 102
    iget-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->c:Lcom/roidapp/videolib/b/m;

    invoke-virtual {v0, p1, p2}, Lcom/roidapp/videolib/b/m;->a(IZ)V

    .line 103
    invoke-virtual {p0}, Lcom/roidapp/videolib/gl/GPUVideoView;->requestRender()V

    .line 105
    :cond_0
    return-void
.end method

.method public final a(J)V
    .locals 3

    .prologue
    .line 139
    iget-object v1, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->h:Lcom/roidapp/videolib/gl/d;

    monitor-enter v1

    .line 140
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->h:Lcom/roidapp/videolib/gl/d;

    sget-object v2, Lcom/roidapp/videolib/gl/d;->b:Lcom/roidapp/videolib/gl/d;

    if-eq v0, v2, :cond_0

    .line 141
    sget-object v0, Lcom/roidapp/videolib/gl/d;->b:Lcom/roidapp/videolib/gl/d;

    iput-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->h:Lcom/roidapp/videolib/gl/d;

    .line 143
    :cond_0
    iget-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->b:Lcom/roidapp/videolib/b/i;

    invoke-virtual {v0, p1, p2}, Lcom/roidapp/videolib/b/i;->b(J)V

    .line 144
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/roidapp/videolib/gl/GPUVideoView;->setRenderMode(I)V

    .line 146
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(Landroid/os/Handler;)V
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->b:Lcom/roidapp/videolib/b/i;

    invoke-virtual {v0, p1}, Lcom/roidapp/videolib/b/i;->a(Landroid/os/Handler;)V

    .line 114
    return-void
.end method

.method public final a(Lcom/roidapp/videolib/gl/f;)V
    .locals 2

    .prologue
    .line 202
    iput-object p1, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->d:Lcom/roidapp/videolib/gl/f;

    .line 203
    iget-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->c:Lcom/roidapp/videolib/b/m;

    iget-object v1, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->d:Lcom/roidapp/videolib/gl/f;

    invoke-virtual {v0, v1}, Lcom/roidapp/videolib/b/m;->a(Lcom/roidapp/videolib/gl/f;)V

    .line 204
    return-void
.end method

.method public final b()V
    .locals 4

    .prologue
    .line 180
    iget-object v1, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->h:Lcom/roidapp/videolib/gl/d;

    monitor-enter v1

    .line 181
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->h:Lcom/roidapp/videolib/gl/d;

    sget-object v2, Lcom/roidapp/videolib/gl/d;->d:Lcom/roidapp/videolib/gl/d;

    if-eq v0, v2, :cond_0

    .line 182
    sget-object v0, Lcom/roidapp/videolib/gl/d;->d:Lcom/roidapp/videolib/gl/d;

    iput-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->h:Lcom/roidapp/videolib/gl/d;

    .line 184
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/roidapp/videolib/gl/GPUVideoView;->setRenderMode(I)V

    .line 185
    iget-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->b:Lcom/roidapp/videolib/b/i;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/i;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 187
    const-wide/16 v2, 0x14

    :try_start_1
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 193
    :goto_0
    :try_start_2
    monitor-exit v1

    return-void

    .line 190
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0

    .line 193
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final b(I)V
    .locals 1

    .prologue
    .line 167
    iget-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->b:Lcom/roidapp/videolib/b/i;

    invoke-virtual {v0, p1}, Lcom/roidapp/videolib/b/i;->b(I)V

    .line 168
    invoke-virtual {p0}, Lcom/roidapp/videolib/gl/GPUVideoView;->getRenderMode()I

    move-result v0

    if-nez v0, :cond_0

    .line 169
    invoke-virtual {p0}, Lcom/roidapp/videolib/gl/GPUVideoView;->requestRender()V

    .line 170
    :cond_0
    return-void
.end method

.method public final b(J)V
    .locals 1

    .prologue
    .line 161
    iget-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->b:Lcom/roidapp/videolib/b/i;

    invoke-virtual {v0, p1, p2}, Lcom/roidapp/videolib/b/i;->c(J)V

    .line 162
    invoke-virtual {p0}, Lcom/roidapp/videolib/gl/GPUVideoView;->getRenderMode()I

    move-result v0

    if-nez v0, :cond_0

    .line 163
    invoke-virtual {p0}, Lcom/roidapp/videolib/gl/GPUVideoView;->requestRender()V

    .line 164
    :cond_0
    return-void
.end method

.method public final c()V
    .locals 3

    .prologue
    .line 207
    iget-object v1, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->h:Lcom/roidapp/videolib/gl/d;

    monitor-enter v1

    .line 208
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->h:Lcom/roidapp/videolib/gl/d;

    sget-object v2, Lcom/roidapp/videolib/gl/d;->b:Lcom/roidapp/videolib/gl/d;

    if-ne v0, v2, :cond_1

    .line 209
    sget-object v0, Lcom/roidapp/videolib/gl/d;->c:Lcom/roidapp/videolib/gl/d;

    iput-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->h:Lcom/roidapp/videolib/gl/d;

    .line 210
    invoke-virtual {p0}, Lcom/roidapp/videolib/gl/GPUVideoView;->getRenderMode()I

    move-result v0

    if-eqz v0, :cond_0

    .line 211
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/roidapp/videolib/gl/GPUVideoView;->setRenderMode(I)V

    .line 212
    :cond_0
    iget-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->b:Lcom/roidapp/videolib/b/i;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/i;->b()V

    .line 214
    :cond_1
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final d()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 219
    iget-object v1, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->h:Lcom/roidapp/videolib/gl/d;

    monitor-enter v1

    .line 220
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->h:Lcom/roidapp/videolib/gl/d;

    sget-object v2, Lcom/roidapp/videolib/gl/d;->c:Lcom/roidapp/videolib/gl/d;

    if-ne v0, v2, :cond_1

    .line 221
    sget-object v0, Lcom/roidapp/videolib/gl/d;->b:Lcom/roidapp/videolib/gl/d;

    iput-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->h:Lcom/roidapp/videolib/gl/d;

    .line 222
    invoke-virtual {p0}, Lcom/roidapp/videolib/gl/GPUVideoView;->getRenderMode()I

    move-result v0

    if-eq v0, v3, :cond_0

    .line 223
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/roidapp/videolib/gl/GPUVideoView;->setRenderMode(I)V

    .line 224
    :cond_0
    iget-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->b:Lcom/roidapp/videolib/b/i;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/i;->c()V

    .line 226
    :cond_1
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final e()I
    .locals 1

    .prologue
    .line 252
    iget-object v0, p0, Lcom/roidapp/videolib/gl/GPUVideoView;->c:Lcom/roidapp/videolib/b/m;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/m;->g()I

    move-result v0

    return v0
.end method

.method public onPause()V
    .locals 0

    .prologue
    .line 239
    invoke-virtual {p0}, Lcom/roidapp/videolib/gl/GPUVideoView;->c()V

    .line 241
    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onPause()V

    .line 243
    return-void
.end method

.method public onResume()V
    .locals 0

    .prologue
    .line 247
    invoke-virtual {p0}, Lcom/roidapp/videolib/gl/GPUVideoView;->c()V

    .line 248
    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onResume()V

    .line 249
    return-void
.end method
