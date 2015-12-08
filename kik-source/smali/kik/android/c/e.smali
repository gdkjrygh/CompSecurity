.class public Lkik/android/c/e;
.super Lkik/android/c/b;
.source "SourceFile"

# interfaces
.implements Landroid/view/TextureView$SurfaceTextureListener;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xe
.end annotation


# instance fields
.field e:Z

.field private final f:Landroid/view/TextureView;

.field private g:Landroid/hardware/Camera;


# direct methods
.method public constructor <init>(Landroid/view/TextureView;Lkik/android/c/b$c;)V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0}, Lkik/android/c/b;-><init>()V

    .line 27
    iput-object p1, p0, Lkik/android/c/e;->f:Landroid/view/TextureView;

    .line 28
    iget-object v0, p0, Lkik/android/c/e;->f:Landroid/view/TextureView;

    invoke-virtual {v0, p0}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 29
    iput-object p2, p0, Lkik/android/c/e;->b:Lkik/android/c/b$c;

    .line 30
    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/Camera;)V
    .locals 1

    .prologue
    .line 86
    invoke-super {p0, p1}, Lkik/android/c/b;->a(Landroid/hardware/Camera;)V

    .line 87
    iput-object p1, p0, Lkik/android/c/e;->g:Landroid/hardware/Camera;

    .line 88
    if-eqz p1, :cond_0

    iget-boolean v0, p0, Lkik/android/c/e;->e:Z

    if-nez v0, :cond_1

    .line 105
    :cond_0
    :goto_0
    return-void

    .line 91
    :cond_1
    iget-object v0, p0, Lkik/android/c/e;->f:Landroid/view/TextureView;

    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    .line 92
    if-eqz v0, :cond_0

    .line 96
    :try_start_0
    invoke-virtual {p1, v0}, Landroid/hardware/Camera;->setPreviewTexture(Landroid/graphics/SurfaceTexture;)V

    .line 97
    invoke-virtual {p1}, Landroid/hardware/Camera;->startPreview()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 99
    :catch_0
    move-exception v0

    :goto_1
    invoke-static {v0}, Lkik/android/util/bx;->c(Ljava/lang/Throwable;)V

    .line 101
    iget-object v0, p0, Lkik/android/c/e;->c:Lkik/android/c/b$b;

    if-eqz v0, :cond_0

    .line 102
    iget-object v0, p0, Lkik/android/c/e;->c:Lkik/android/c/b$b;

    invoke-virtual {v0}, Lkik/android/c/b$b;->a()V

    goto :goto_0

    .line 99
    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 35
    iget-boolean v0, p0, Lkik/android/c/e;->e:Z

    return v0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 80
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/c/e;->g:Landroid/hardware/Camera;

    .line 81
    return-void
.end method

.method public final c()Landroid/hardware/Camera;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lkik/android/c/e;->g:Landroid/hardware/Camera;

    return-object v0
.end method

.method public onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 2

    .prologue
    .line 41
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/c/e;->e:Z

    .line 42
    iget-object v0, p0, Lkik/android/c/e;->g:Landroid/hardware/Camera;

    invoke-virtual {p0, v0}, Lkik/android/c/e;->a(Landroid/hardware/Camera;)V

    .line 43
    const/16 v0, 0xe

    invoke-static {v0}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 44
    iget-object v0, p0, Lkik/android/c/e;->f:Landroid/view/TextureView;

    iget-object v1, p0, Lkik/android/c/e;->a:Landroid/view/View$OnTouchListener;

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 46
    :cond_0
    return-void
.end method

.method public onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 1

    .prologue
    .line 57
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/c/e;->e:Z

    .line 58
    iget-object v0, p0, Lkik/android/c/e;->b:Lkik/android/c/b$c;

    if-eqz v0, :cond_0

    .line 59
    iget-object v0, p0, Lkik/android/c/e;->b:Lkik/android/c/b$c;

    invoke-virtual {v0}, Lkik/android/c/b$c;->a()V

    .line 61
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/SurfaceTexture;->release()V

    .line 62
    const/4 v0, 0x1

    return v0
.end method

.method public onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lkik/android/c/e;->g:Landroid/hardware/Camera;

    invoke-virtual {p0, v0}, Lkik/android/c/e;->a(Landroid/hardware/Camera;)V

    .line 52
    return-void
.end method

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    .prologue
    .line 69
    return-void
.end method
