.class final Lkik/android/chat/fragment/rv;
.super Lkik/android/util/bf;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/VideoTrimmingFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/VideoTrimmingFragment;)V
    .locals 0

    .prologue
    .line 268
    iput-object p1, p0, Lkik/android/chat/fragment/rv;->a:Lkik/android/chat/fragment/VideoTrimmingFragment;

    invoke-direct {p0}, Lkik/android/util/bf;-><init>()V

    return-void
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 268
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/rv;->a:Lkik/android/chat/fragment/VideoTrimmingFragment;

    new-instance v1, Lkik/android/chat/fragment/rw;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/rw;-><init>(Lkik/android/chat/fragment/rv;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/VideoTrimmingFragment;->b(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lkik/android/chat/fragment/rv;->a:Lkik/android/chat/fragment/VideoTrimmingFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/VideoTrimmingFragment;->_videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->getCurrentPosition()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lkik/android/chat/fragment/rv;->a:Lkik/android/chat/fragment/VideoTrimmingFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/VideoTrimmingFragment;->b(Lkik/android/chat/fragment/VideoTrimmingFragment;)F

    move-result v1

    const/high16 v2, 0x447a0000    # 1000.0f

    mul-float/2addr v1, v2

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/rv;->a:Lkik/android/chat/fragment/VideoTrimmingFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkik/android/chat/fragment/VideoTrimmingFragment;->a(Lkik/android/chat/fragment/VideoTrimmingFragment;Z)Z

    iget-object v0, p0, Lkik/android/chat/fragment/rv;->a:Lkik/android/chat/fragment/VideoTrimmingFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/VideoTrimmingFragment;->_videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->pause()V

    iget-object v0, p0, Lkik/android/chat/fragment/rv;->a:Lkik/android/chat/fragment/VideoTrimmingFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/VideoTrimmingFragment;->_videoView:Landroid/widget/VideoView;

    iget-object v1, p0, Lkik/android/chat/fragment/rv;->a:Lkik/android/chat/fragment/VideoTrimmingFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/VideoTrimmingFragment;->a(Lkik/android/chat/fragment/VideoTrimmingFragment;)F

    move-result v1

    float-to-int v1, v1

    mul-int/lit16 v1, v1, 0x3e8

    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->seekTo(I)V

    iget-object v0, p0, Lkik/android/chat/fragment/rv;->a:Lkik/android/chat/fragment/VideoTrimmingFragment;

    new-instance v1, Lkik/android/chat/fragment/rx;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/rx;-><init>(Lkik/android/chat/fragment/rv;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/VideoTrimmingFragment;->b(Ljava/lang/Runnable;)V

    :goto_0
    iget-object v0, p0, Lkik/android/chat/fragment/rv;->a:Lkik/android/chat/fragment/VideoTrimmingFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/VideoTrimmingFragment;->i(Lkik/android/chat/fragment/VideoTrimmingFragment;)Lkik/android/util/bf;

    const/4 v0, 0x0

    return-object v0

    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/rv;->a:Lkik/android/chat/fragment/VideoTrimmingFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/VideoTrimmingFragment;->_videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->isPlaying()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0
.end method
