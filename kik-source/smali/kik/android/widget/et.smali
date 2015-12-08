.class final Lkik/android/widget/et;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# instance fields
.field final synthetic a:Lkik/android/widget/WebVideoView;


# direct methods
.method constructor <init>(Lkik/android/widget/WebVideoView;)V
    .locals 0

    .prologue
    .line 334
    iput-object p1, p0, Lkik/android/widget/et;->a:Lkik/android/widget/WebVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCompletion(Landroid/media/MediaPlayer;)V
    .locals 2

    .prologue
    const/4 v1, 0x5

    .line 337
    iget-object v0, p0, Lkik/android/widget/et;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0, v1}, Lkik/android/widget/WebVideoView;->c(Lkik/android/widget/WebVideoView;I)I

    .line 338
    iget-object v0, p0, Lkik/android/widget/et;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0, v1}, Lkik/android/widget/WebVideoView;->d(Lkik/android/widget/WebVideoView;I)I

    .line 339
    iget-object v0, p0, Lkik/android/widget/et;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0}, Lkik/android/widget/WebVideoView;->h(Lkik/android/widget/WebVideoView;)Lkik/android/widget/VideoController;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 340
    iget-object v0, p0, Lkik/android/widget/et;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0}, Lkik/android/widget/WebVideoView;->h(Lkik/android/widget/WebVideoView;)Lkik/android/widget/VideoController;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/widget/VideoController;->c()V

    .line 342
    :cond_0
    iget-object v0, p0, Lkik/android/widget/et;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0}, Lkik/android/widget/WebVideoView;->i(Lkik/android/widget/WebVideoView;)Landroid/media/MediaPlayer$OnCompletionListener;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 343
    iget-object v0, p0, Lkik/android/widget/et;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0}, Lkik/android/widget/WebVideoView;->i(Lkik/android/widget/WebVideoView;)Landroid/media/MediaPlayer$OnCompletionListener;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/et;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v1}, Lkik/android/widget/WebVideoView;->g(Lkik/android/widget/WebVideoView;)Landroid/media/MediaPlayer;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/media/MediaPlayer$OnCompletionListener;->onCompletion(Landroid/media/MediaPlayer;)V

    .line 345
    :cond_1
    return-void
.end method
