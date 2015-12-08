.class final Lkik/android/widget/er;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnVideoSizeChangedListener;


# instance fields
.field final synthetic a:Lkik/android/widget/WebVideoView;


# direct methods
.method constructor <init>(Lkik/android/widget/WebVideoView;)V
    .locals 0

    .prologue
    .line 281
    iput-object p1, p0, Lkik/android/widget/er;->a:Lkik/android/widget/WebVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onVideoSizeChanged(Landroid/media/MediaPlayer;II)V
    .locals 3

    .prologue
    .line 284
    iget-object v0, p0, Lkik/android/widget/er;->a:Lkik/android/widget/WebVideoView;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getVideoWidth()I

    move-result v1

    invoke-static {v0, v1}, Lkik/android/widget/WebVideoView;->a(Lkik/android/widget/WebVideoView;I)I

    .line 285
    iget-object v0, p0, Lkik/android/widget/er;->a:Lkik/android/widget/WebVideoView;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getVideoHeight()I

    move-result v1

    invoke-static {v0, v1}, Lkik/android/widget/WebVideoView;->b(Lkik/android/widget/WebVideoView;I)I

    .line 286
    iget-object v0, p0, Lkik/android/widget/er;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0}, Lkik/android/widget/WebVideoView;->a(Lkik/android/widget/WebVideoView;)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/er;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0}, Lkik/android/widget/WebVideoView;->b(Lkik/android/widget/WebVideoView;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 287
    iget-object v0, p0, Lkik/android/widget/er;->a:Lkik/android/widget/WebVideoView;

    invoke-virtual {v0}, Lkik/android/widget/WebVideoView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/er;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v1}, Lkik/android/widget/WebVideoView;->a(Lkik/android/widget/WebVideoView;)I

    move-result v1

    iget-object v2, p0, Lkik/android/widget/er;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v2}, Lkik/android/widget/WebVideoView;->b(Lkik/android/widget/WebVideoView;)I

    move-result v2

    invoke-interface {v0, v1, v2}, Landroid/view/SurfaceHolder;->setFixedSize(II)V

    .line 289
    :cond_0
    return-void
.end method
