.class final Lkik/android/widget/ex;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# instance fields
.field final synthetic a:Lkik/android/widget/WebVideoView;


# direct methods
.method constructor <init>(Lkik/android/widget/WebVideoView;)V
    .locals 0

    .prologue
    .line 449
    iput-object p1, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 5

    .prologue
    const/4 v4, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 453
    iget-object v0, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0, p3}, Lkik/android/widget/WebVideoView;->f(Lkik/android/widget/WebVideoView;I)I

    .line 454
    iget-object v0, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0, p4}, Lkik/android/widget/WebVideoView;->g(Lkik/android/widget/WebVideoView;I)I

    .line 455
    iget-object v0, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0, p1}, Lkik/android/widget/WebVideoView;->a(Lkik/android/widget/WebVideoView;Landroid/view/SurfaceHolder;)Landroid/view/SurfaceHolder;

    .line 456
    iget-object v0, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0}, Lkik/android/widget/WebVideoView;->l(Lkik/android/widget/WebVideoView;)I

    move-result v0

    if-ne v0, v4, :cond_2

    move v0, v1

    .line 457
    :goto_0
    iget-object v3, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v3}, Lkik/android/widget/WebVideoView;->a(Lkik/android/widget/WebVideoView;)I

    move-result v3

    if-ne v3, p3, :cond_3

    iget-object v3, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v3}, Lkik/android/widget/WebVideoView;->b(Lkik/android/widget/WebVideoView;)I

    move-result v3

    if-ne v3, p4, :cond_3

    .line 458
    :goto_1
    iget-object v2, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v2}, Lkik/android/widget/WebVideoView;->g(Lkik/android/widget/WebVideoView;)Landroid/media/MediaPlayer;

    move-result-object v2

    if-eqz v2, :cond_1

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    .line 459
    iget-object v0, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0}, Lkik/android/widget/WebVideoView;->m(Lkik/android/widget/WebVideoView;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 460
    iget-object v0, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    iget-object v1, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v1}, Lkik/android/widget/WebVideoView;->m(Lkik/android/widget/WebVideoView;)I

    move-result v1

    invoke-virtual {v0, v1}, Lkik/android/widget/WebVideoView;->a(I)V

    .line 462
    :cond_0
    iget-object v0, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0}, Lkik/android/widget/WebVideoView;->n(Lkik/android/widget/WebVideoView;)I

    move-result v0

    if-eq v0, v4, :cond_1

    .line 463
    iget-object v0, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    invoke-virtual {v0}, Lkik/android/widget/WebVideoView;->a()V

    .line 466
    :cond_1
    return-void

    :cond_2
    move v0, v2

    .line 456
    goto :goto_0

    :cond_3
    move v1, v2

    .line 457
    goto :goto_1
.end method

.method public final surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 3

    .prologue
    .line 470
    iget-object v0, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0, p1}, Lkik/android/widget/WebVideoView;->a(Lkik/android/widget/WebVideoView;Landroid/view/SurfaceHolder;)Landroid/view/SurfaceHolder;

    .line 471
    iget-object v0, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    iget-object v1, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v1}, Lkik/android/widget/WebVideoView;->g(Lkik/android/widget/WebVideoView;)Landroid/media/MediaPlayer;

    move-result-object v1

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->getVideoWidth()I

    move-result v1

    invoke-static {v0, v1}, Lkik/android/widget/WebVideoView;->a(Lkik/android/widget/WebVideoView;I)I

    .line 472
    iget-object v0, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    iget-object v1, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v1}, Lkik/android/widget/WebVideoView;->g(Lkik/android/widget/WebVideoView;)Landroid/media/MediaPlayer;

    move-result-object v1

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->getVideoHeight()I

    move-result v1

    invoke-static {v0, v1}, Lkik/android/widget/WebVideoView;->b(Lkik/android/widget/WebVideoView;I)I

    .line 473
    iget-object v0, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0}, Lkik/android/widget/WebVideoView;->a(Lkik/android/widget/WebVideoView;)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0}, Lkik/android/widget/WebVideoView;->b(Lkik/android/widget/WebVideoView;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 474
    iget-object v0, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    invoke-virtual {v0}, Lkik/android/widget/WebVideoView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v1}, Lkik/android/widget/WebVideoView;->a(Lkik/android/widget/WebVideoView;)I

    move-result v1

    iget-object v2, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v2}, Lkik/android/widget/WebVideoView;->b(Lkik/android/widget/WebVideoView;)I

    move-result v2

    invoke-interface {v0, v1, v2}, Landroid/view/SurfaceHolder;->setFixedSize(II)V

    .line 477
    :cond_0
    iget-object v0, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0}, Lkik/android/widget/WebVideoView;->g(Lkik/android/widget/WebVideoView;)Landroid/media/MediaPlayer;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v1}, Lkik/android/widget/WebVideoView;->o(Lkik/android/widget/WebVideoView;)Landroid/view/SurfaceHolder;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setDisplay(Landroid/view/SurfaceHolder;)V

    .line 478
    iget-object v0, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0}, Lkik/android/widget/WebVideoView;->g(Lkik/android/widget/WebVideoView;)Landroid/media/MediaPlayer;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setScreenOnWhilePlaying(Z)V

    .line 479
    iget-object v0, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0}, Lkik/android/widget/WebVideoView;->o(Lkik/android/widget/WebVideoView;)Landroid/view/SurfaceHolder;

    move-result-object v0

    const/4 v1, 0x3

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->setType(I)V

    .line 480
    iget-object v0, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0}, Lkik/android/widget/WebVideoView;->p(Lkik/android/widget/WebVideoView;)V

    .line 481
    iget-object v0, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0}, Lkik/android/widget/WebVideoView;->q(Lkik/android/widget/WebVideoView;)V

    .line 482
    return-void
.end method

.method public final surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 2

    .prologue
    .line 487
    iget-object v0, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    iget-object v1, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    invoke-virtual {v1}, Lkik/android/widget/WebVideoView;->d()I

    move-result v1

    invoke-static {v0, v1}, Lkik/android/widget/WebVideoView;->h(Lkik/android/widget/WebVideoView;I)I

    .line 488
    iget-object v0, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkik/android/widget/WebVideoView;->a(Lkik/android/widget/WebVideoView;Landroid/view/SurfaceHolder;)Landroid/view/SurfaceHolder;

    .line 489
    iget-object v0, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0}, Lkik/android/widget/WebVideoView;->h(Lkik/android/widget/WebVideoView;)Lkik/android/widget/VideoController;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 490
    iget-object v0, p0, Lkik/android/widget/ex;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0}, Lkik/android/widget/WebVideoView;->h(Lkik/android/widget/WebVideoView;)Lkik/android/widget/VideoController;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/widget/VideoController;->c()V

    .line 491
    :cond_0
    return-void
.end method
