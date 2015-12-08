.class public Lkik/android/c/c;
.super Lkik/android/c/b;
.source "SourceFile"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# instance fields
.field e:Z

.field private final f:Landroid/view/SurfaceView;

.field private g:Landroid/hardware/Camera;

.field private final h:Landroid/os/Handler;

.field private i:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/view/SurfaceView;Landroid/os/Handler;Lkik/android/c/b$c;)V
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0}, Lkik/android/c/b;-><init>()V

    .line 22
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/c/c;->e:Z

    .line 66
    new-instance v0, Lkik/android/c/d;

    invoke-direct {v0, p0}, Lkik/android/c/d;-><init>(Lkik/android/c/c;)V

    iput-object v0, p0, Lkik/android/c/c;->i:Ljava/lang/Runnable;

    .line 29
    iput-object p1, p0, Lkik/android/c/c;->f:Landroid/view/SurfaceView;

    .line 30
    iget-object v0, p0, Lkik/android/c/c;->f:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-interface {v0, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 31
    iput-object p2, p0, Lkik/android/c/c;->h:Landroid/os/Handler;

    .line 32
    iput-object p3, p0, Lkik/android/c/c;->b:Lkik/android/c/b$c;

    .line 33
    return-void
.end method

.method static synthetic a(Lkik/android/c/c;)Landroid/hardware/Camera;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lkik/android/c/c;->g:Landroid/hardware/Camera;

    return-object v0
.end method

.method static synthetic b(Lkik/android/c/c;)Landroid/view/SurfaceView;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lkik/android/c/c;->f:Landroid/view/SurfaceView;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/hardware/Camera;)V
    .locals 4

    .prologue
    .line 108
    invoke-super {p0, p1}, Lkik/android/c/b;->a(Landroid/hardware/Camera;)V

    .line 109
    iput-object p1, p0, Lkik/android/c/c;->g:Landroid/hardware/Camera;

    .line 110
    iget-object v0, p0, Lkik/android/c/c;->h:Landroid/os/Handler;

    iget-object v1, p0, Lkik/android/c/c;->i:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 111
    iget-object v0, p0, Lkik/android/c/c;->h:Landroid/os/Handler;

    iget-object v1, p0, Lkik/android/c/c;->i:Ljava/lang/Runnable;

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 112
    return-void
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 38
    iget-boolean v0, p0, Lkik/android/c/c;->e:Z

    return v0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 123
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/c/c;->g:Landroid/hardware/Camera;

    .line 124
    return-void
.end method

.method public final c()Landroid/hardware/Camera;
    .locals 1

    .prologue
    .line 117
    iget-object v0, p0, Lkik/android/c/c;->g:Landroid/hardware/Camera;

    return-object v0
.end method

.method public final d()Landroid/view/Surface;
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Lkik/android/c/c;->f:Landroid/view/SurfaceView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/c/c;->f:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 129
    iget-object v0, p0, Lkik/android/c/c;->f:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v0

    .line 131
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lkik/android/c/c;->g:Landroid/hardware/Camera;

    invoke-virtual {p0, v0}, Lkik/android/c/c;->a(Landroid/hardware/Camera;)V

    .line 55
    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 2

    .prologue
    .line 44
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/c/c;->e:Z

    .line 45
    iget-object v0, p0, Lkik/android/c/c;->g:Landroid/hardware/Camera;

    invoke-virtual {p0, v0}, Lkik/android/c/c;->a(Landroid/hardware/Camera;)V

    .line 46
    const/16 v0, 0xe

    invoke-static {v0}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 47
    iget-object v0, p0, Lkik/android/c/c;->f:Landroid/view/SurfaceView;

    iget-object v1, p0, Lkik/android/c/c;->a:Landroid/view/View$OnTouchListener;

    invoke-virtual {v0, v1}, Landroid/view/SurfaceView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 49
    :cond_0
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 1

    .prologue
    .line 60
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/c/c;->e:Z

    .line 61
    iget-object v0, p0, Lkik/android/c/c;->b:Lkik/android/c/b$c;

    if-eqz v0, :cond_0

    .line 62
    iget-object v0, p0, Lkik/android/c/c;->b:Lkik/android/c/b$c;

    invoke-virtual {v0}, Lkik/android/c/b$c;->a()V

    .line 64
    :cond_0
    return-void
.end method
