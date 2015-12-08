.class final Lkik/android/widget/es;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnPreparedListener;


# instance fields
.field final synthetic a:Lkik/android/widget/WebVideoView;


# direct methods
.method constructor <init>(Lkik/android/widget/WebVideoView;)V
    .locals 0

    .prologue
    .line 292
    iput-object p1, p0, Lkik/android/widget/es;->a:Lkik/android/widget/WebVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPrepared(Landroid/media/MediaPlayer;)V
    .locals 2

    .prologue
    .line 295
    iget-object v0, p0, Lkik/android/widget/es;->a:Lkik/android/widget/WebVideoView;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lkik/android/widget/WebVideoView;->c(Lkik/android/widget/WebVideoView;I)I

    .line 296
    iget-object v0, p0, Lkik/android/widget/es;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0}, Lkik/android/widget/WebVideoView;->c(Lkik/android/widget/WebVideoView;)Z

    .line 297
    iget-object v0, p0, Lkik/android/widget/es;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0}, Lkik/android/widget/WebVideoView;->d(Lkik/android/widget/WebVideoView;)Z

    .line 298
    iget-object v0, p0, Lkik/android/widget/es;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0}, Lkik/android/widget/WebVideoView;->e(Lkik/android/widget/WebVideoView;)Z

    .line 300
    iget-object v0, p0, Lkik/android/widget/es;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0}, Lkik/android/widget/WebVideoView;->f(Lkik/android/widget/WebVideoView;)Landroid/media/MediaPlayer$OnPreparedListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 301
    iget-object v0, p0, Lkik/android/widget/es;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0}, Lkik/android/widget/WebVideoView;->f(Lkik/android/widget/WebVideoView;)Landroid/media/MediaPlayer$OnPreparedListener;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/es;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v1}, Lkik/android/widget/WebVideoView;->g(Lkik/android/widget/WebVideoView;)Landroid/media/MediaPlayer;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/media/MediaPlayer$OnPreparedListener;->onPrepared(Landroid/media/MediaPlayer;)V

    .line 303
    :cond_0
    return-void
.end method
