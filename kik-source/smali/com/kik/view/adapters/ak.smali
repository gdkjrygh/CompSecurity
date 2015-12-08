.class public final Lcom/kik/view/adapters/ak;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/TextureView$SurfaceTextureListener;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xe
.end annotation


# instance fields
.field private a:Landroid/view/TextureView;

.field private b:Lkik/a/d/a/a;

.field private c:Landroid/media/MediaPlayer;

.field private d:Landroid/view/Surface;

.field private e:Lcom/kik/l/ab;

.field private f:Lcom/kik/android/a;

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:Z

.field private l:Landroid/media/MediaPlayer$OnCompletionListener;

.field private m:Landroid/media/MediaPlayer$OnPreparedListener;

.field private n:Landroid/media/MediaPlayer$OnErrorListener;

.field private o:Lkik/a/e/s;

.field private p:[B


# direct methods
.method public constructor <init>(Lkik/a/d/a/a;[BLcom/kik/l/ab;Lcom/kik/android/a;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-boolean v1, p0, Lcom/kik/view/adapters/ak;->g:Z

    .line 44
    iput-boolean v1, p0, Lcom/kik/view/adapters/ak;->h:Z

    .line 45
    iput-boolean v1, p0, Lcom/kik/view/adapters/ak;->i:Z

    .line 48
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/kik/view/adapters/ak;->j:Z

    .line 49
    iput-boolean v1, p0, Lcom/kik/view/adapters/ak;->k:Z

    .line 58
    iput-object p1, p0, Lcom/kik/view/adapters/ak;->b:Lkik/a/d/a/a;

    .line 59
    iput-object p2, p0, Lcom/kik/view/adapters/ak;->p:[B

    .line 60
    iput-object p3, p0, Lcom/kik/view/adapters/ak;->e:Lcom/kik/l/ab;

    .line 61
    iput-object p4, p0, Lcom/kik/view/adapters/ak;->f:Lcom/kik/android/a;

    .line 62
    return-void
.end method

.method static synthetic a(Lcom/kik/view/adapters/ak;Landroid/media/MediaPlayer;)Landroid/media/MediaPlayer;
    .locals 0

    .prologue
    .line 30
    iput-object p1, p0, Lcom/kik/view/adapters/ak;->c:Landroid/media/MediaPlayer;

    return-object p1
.end method

.method static synthetic a(Lcom/kik/view/adapters/ak;II)V
    .locals 9

    .prologue
    .line 30
    iget-object v0, p0, Lcom/kik/view/adapters/ak;->a:Landroid/view/TextureView;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/kik/view/adapters/ak;->a:Landroid/view/TextureView;

    invoke-virtual {v0}, Landroid/view/TextureView;->getWidth()I

    move-result v1

    iget-object v0, p0, Lcom/kik/view/adapters/ak;->a:Landroid/view/TextureView;

    invoke-virtual {v0}, Landroid/view/TextureView;->getHeight()I

    move-result v3

    if-le v1, v3, :cond_0

    if-lt p1, p2, :cond_1

    :cond_0
    if-ge v1, v3, :cond_2

    if-le p1, p2, :cond_2

    :cond_1
    move v8, p1

    move p1, p2

    move p2, v8

    :cond_2
    if-ge p2, p1, :cond_4

    int-to-double v4, p1

    int-to-double v6, p2

    div-double/2addr v4, v6

    int-to-double v6, v3

    mul-double/2addr v4, v6

    double-to-int v0, v4

    move v2, v3

    :goto_0
    sub-int v4, v1, v0

    div-int/lit8 v4, v4, 0x2

    sub-int v5, v3, v2

    div-int/lit8 v5, v5, 0x2

    new-instance v6, Landroid/graphics/Matrix;

    invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V

    iget-object v7, p0, Lcom/kik/view/adapters/ak;->a:Landroid/view/TextureView;

    invoke-virtual {v7, v6}, Landroid/view/TextureView;->getTransform(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    int-to-float v0, v0

    int-to-float v1, v1

    div-float/2addr v0, v1

    int-to-float v1, v2

    int-to-float v2, v3

    div-float/2addr v1, v2

    invoke-virtual {v6, v0, v1}, Landroid/graphics/Matrix;->setScale(FF)V

    int-to-float v0, v4

    int-to-float v1, v5

    invoke-virtual {v6, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    iget-object v0, p0, Lcom/kik/view/adapters/ak;->a:Landroid/view/TextureView;

    invoke-virtual {v0, v6}, Landroid/view/TextureView;->setTransform(Landroid/graphics/Matrix;)V

    :cond_3
    return-void

    :cond_4
    int-to-double v4, p2

    int-to-double v6, p1

    div-double/2addr v4, v6

    int-to-double v6, v1

    mul-double/2addr v4, v6

    double-to-int v0, v4

    move v2, v0

    move v0, v1

    goto :goto_0
.end method

.method private a(ZLandroid/media/MediaPlayer$OnPreparedListener;Landroid/media/MediaPlayer$OnCompletionListener;Landroid/media/MediaPlayer$OnErrorListener;Lkik/a/e/s;)V
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 144
    iget-object v0, p0, Lcom/kik/view/adapters/ak;->b:Lkik/a/d/a/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/view/adapters/ak;->a:Landroid/view/TextureView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/view/adapters/ak;->a:Landroid/view/TextureView;

    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    if-nez v0, :cond_1

    .line 145
    :cond_0
    const/4 v0, 0x0

    invoke-interface {p4, v0, v1, v1}, Landroid/media/MediaPlayer$OnErrorListener;->onError(Landroid/media/MediaPlayer;II)Z

    .line 248
    :goto_0
    return-void

    .line 149
    :cond_1
    new-instance v3, Landroid/view/Surface;

    iget-object v0, p0, Lcom/kik/view/adapters/ak;->a:Landroid/view/TextureView;

    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    invoke-direct {v3, v0}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 151
    if-eqz p1, :cond_2

    .line 152
    iget-object v0, p0, Lcom/kik/view/adapters/ak;->e:Lcom/kik/l/ab;

    iget-object v1, p0, Lcom/kik/view/adapters/ak;->b:Lkik/a/d/a/a;

    iget-object v2, p0, Lcom/kik/view/adapters/ak;->p:[B

    iget-object v4, p0, Lcom/kik/view/adapters/ak;->f:Lcom/kik/android/a;

    invoke-interface {v0, v1, v2, p5, v4}, Lcom/kik/l/ab;->b(Lkik/a/d/a/a;[BLkik/a/e/s;Lcom/kik/android/a;)Lcom/kik/g/p;

    move-result-object v0

    move-object v6, v0

    .line 157
    :goto_1
    new-instance v0, Lcom/kik/view/adapters/al;

    move-object v1, p0

    move-object v2, p4

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/kik/view/adapters/al;-><init>(Lcom/kik/view/adapters/ak;Landroid/media/MediaPlayer$OnErrorListener;Landroid/view/Surface;Landroid/media/MediaPlayer$OnPreparedListener;Landroid/media/MediaPlayer$OnCompletionListener;)V

    invoke-virtual {v6, v0}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0

    .line 155
    :cond_2
    iget-object v0, p0, Lcom/kik/view/adapters/ak;->e:Lcom/kik/l/ab;

    iget-object v1, p0, Lcom/kik/view/adapters/ak;->b:Lkik/a/d/a/a;

    iget-object v2, p0, Lcom/kik/view/adapters/ak;->p:[B

    iget-object v4, p0, Lcom/kik/view/adapters/ak;->f:Lcom/kik/android/a;

    invoke-interface {v0, v1, v2, p5, v4}, Lcom/kik/l/ab;->a(Lkik/a/d/a/a;[BLkik/a/e/s;Lcom/kik/android/a;)Lcom/kik/g/p;

    move-result-object v0

    move-object v6, v0

    goto :goto_1
.end method

.method static synthetic a(Lcom/kik/view/adapters/ak;)Z
    .locals 1

    .prologue
    .line 30
    iget-boolean v0, p0, Lcom/kik/view/adapters/ak;->h:Z

    return v0
.end method

.method static synthetic b(Lcom/kik/view/adapters/ak;)Landroid/view/TextureView;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/kik/view/adapters/ak;->a:Landroid/view/TextureView;

    return-object v0
.end method

.method static synthetic c(Lcom/kik/view/adapters/ak;)Landroid/media/MediaPlayer;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/kik/view/adapters/ak;->c:Landroid/media/MediaPlayer;

    return-object v0
.end method

.method static synthetic d(Lcom/kik/view/adapters/ak;)Z
    .locals 1

    .prologue
    .line 30
    iget-boolean v0, p0, Lcom/kik/view/adapters/ak;->i:Z

    return v0
.end method

.method static synthetic e(Lcom/kik/view/adapters/ak;)Z
    .locals 1

    .prologue
    .line 30
    iget-boolean v0, p0, Lcom/kik/view/adapters/ak;->j:Z

    return v0
.end method

.method static synthetic f(Lcom/kik/view/adapters/ak;)Z
    .locals 1

    .prologue
    .line 30
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/view/adapters/ak;->j:Z

    return v0
.end method

.method static synthetic g(Lcom/kik/view/adapters/ak;)Lkik/a/d/a/a;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/kik/view/adapters/ak;->b:Lkik/a/d/a/a;

    return-object v0
.end method

.method static synthetic h(Lcom/kik/view/adapters/ak;)Lcom/kik/l/ab;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/kik/view/adapters/ak;->e:Lcom/kik/l/ab;

    return-object v0
.end method


# virtual methods
.method public final a(Z)V
    .locals 0

    .prologue
    .line 88
    iput-boolean p1, p0, Lcom/kik/view/adapters/ak;->h:Z

    .line 89
    return-void
.end method

.method public final a(ZLandroid/view/TextureView;Landroid/media/MediaPlayer$OnPreparedListener;Landroid/media/MediaPlayer$OnCompletionListener;Landroid/media/MediaPlayer$OnErrorListener;Lkik/a/e/s;)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    .line 112
    iput-boolean v1, p0, Lcom/kik/view/adapters/ak;->h:Z

    .line 119
    iput-object p2, p0, Lcom/kik/view/adapters/ak;->a:Landroid/view/TextureView;

    .line 120
    iget-object v0, p0, Lcom/kik/view/adapters/ak;->a:Landroid/view/TextureView;

    invoke-virtual {v0, p0}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 122
    iput-object p4, p0, Lcom/kik/view/adapters/ak;->l:Landroid/media/MediaPlayer$OnCompletionListener;

    .line 123
    iput-object p3, p0, Lcom/kik/view/adapters/ak;->m:Landroid/media/MediaPlayer$OnPreparedListener;

    .line 124
    iput-object p5, p0, Lcom/kik/view/adapters/ak;->n:Landroid/media/MediaPlayer$OnErrorListener;

    .line 125
    iput-object p6, p0, Lcom/kik/view/adapters/ak;->o:Lkik/a/e/s;

    .line 126
    iput-boolean p1, p0, Lcom/kik/view/adapters/ak;->k:Z

    .line 128
    iget-object v0, p0, Lcom/kik/view/adapters/ak;->a:Landroid/view/TextureView;

    invoke-virtual {v0}, Landroid/view/TextureView;->isAvailable()Z

    move-result v0

    if-nez v0, :cond_0

    .line 130
    iput-boolean v1, p0, Lcom/kik/view/adapters/ak;->g:Z

    .line 136
    :goto_0
    return-void

    .line 133
    :cond_0
    iget-object v2, p0, Lcom/kik/view/adapters/ak;->m:Landroid/media/MediaPlayer$OnPreparedListener;

    iget-object v3, p0, Lcom/kik/view/adapters/ak;->l:Landroid/media/MediaPlayer$OnCompletionListener;

    iget-object v4, p0, Lcom/kik/view/adapters/ak;->n:Landroid/media/MediaPlayer$OnErrorListener;

    iget-object v5, p0, Lcom/kik/view/adapters/ak;->o:Lkik/a/e/s;

    move-object v0, p0

    move v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/kik/view/adapters/ak;->a(ZLandroid/media/MediaPlayer$OnPreparedListener;Landroid/media/MediaPlayer$OnCompletionListener;Landroid/media/MediaPlayer$OnErrorListener;Lkik/a/e/s;)V

    goto :goto_0
.end method

.method public final a()Z
    .locals 2

    .prologue
    const/high16 v1, 0x3f800000    # 1.0f

    .line 72
    iget-object v0, p0, Lcom/kik/view/adapters/ak;->c:Landroid/media/MediaPlayer;

    if-nez v0, :cond_0

    .line 73
    const/4 v0, 0x0

    .line 83
    :goto_0
    return v0

    .line 76
    :cond_0
    iget-object v0, p0, Lcom/kik/view/adapters/ak;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v0, v1, v1}, Landroid/media/MediaPlayer;->setVolume(FF)V

    .line 83
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 101
    iget-object v0, p0, Lcom/kik/view/adapters/ak;->c:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/view/adapters/ak;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 102
    iget-object v0, p0, Lcom/kik/view/adapters/ak;->c:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 105
    :cond_0
    return-void
.end method

.method public final b(Z)V
    .locals 0

    .prologue
    .line 93
    iput-boolean p1, p0, Lcom/kik/view/adapters/ak;->i:Z

    .line 94
    return-void
.end method

.method public final c()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 302
    iget-object v0, p0, Lcom/kik/view/adapters/ak;->c:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_1

    .line 303
    iget-object v0, p0, Lcom/kik/view/adapters/ak;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 304
    iget-object v0, p0, Lcom/kik/view/adapters/ak;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 306
    :cond_0
    iget-object v0, p0, Lcom/kik/view/adapters/ak;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 307
    iput-object v1, p0, Lcom/kik/view/adapters/ak;->c:Landroid/media/MediaPlayer;

    .line 310
    :cond_1
    iget-object v0, p0, Lcom/kik/view/adapters/ak;->d:Landroid/view/Surface;

    if-eqz v0, :cond_2

    .line 311
    iget-object v0, p0, Lcom/kik/view/adapters/ak;->d:Landroid/view/Surface;

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 312
    iput-object v1, p0, Lcom/kik/view/adapters/ak;->d:Landroid/view/Surface;

    .line 315
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/kik/view/adapters/ak;->j:Z

    .line 316
    return-void
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 320
    iget-object v0, p0, Lcom/kik/view/adapters/ak;->c:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/view/adapters/ak;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 6

    .prologue
    .line 326
    iget-boolean v0, p0, Lcom/kik/view/adapters/ak;->g:Z

    if-eqz v0, :cond_0

    .line 327
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/view/adapters/ak;->g:Z

    .line 328
    iget-boolean v1, p0, Lcom/kik/view/adapters/ak;->k:Z

    iget-object v2, p0, Lcom/kik/view/adapters/ak;->m:Landroid/media/MediaPlayer$OnPreparedListener;

    iget-object v3, p0, Lcom/kik/view/adapters/ak;->l:Landroid/media/MediaPlayer$OnCompletionListener;

    iget-object v4, p0, Lcom/kik/view/adapters/ak;->n:Landroid/media/MediaPlayer$OnErrorListener;

    iget-object v5, p0, Lcom/kik/view/adapters/ak;->o:Lkik/a/e/s;

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/kik/view/adapters/ak;->a(ZLandroid/media/MediaPlayer$OnPreparedListener;Landroid/media/MediaPlayer$OnCompletionListener;Landroid/media/MediaPlayer$OnErrorListener;Lkik/a/e/s;)V

    .line 330
    :cond_0
    return-void
.end method

.method public final onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 1

    .prologue
    .line 341
    invoke-virtual {p0}, Lcom/kik/view/adapters/ak;->c()V

    .line 342
    iget-object v0, p0, Lcom/kik/view/adapters/ak;->a:Landroid/view/TextureView;

    if-eqz v0, :cond_0

    .line 343
    iget-object v0, p0, Lcom/kik/view/adapters/ak;->a:Landroid/view/TextureView;

    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 344
    iget-object v0, p0, Lcom/kik/view/adapters/ak;->a:Landroid/view/TextureView;

    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->release()V

    .line 347
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/view/adapters/ak;->a:Landroid/view/TextureView;

    .line 348
    const/4 v0, 0x1

    return v0
.end method

.method public final onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    .prologue
    .line 336
    return-void
.end method

.method public final onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    .prologue
    .line 355
    return-void
.end method
