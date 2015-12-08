.class Lcom/arist/MusicPlayer/MusicPlayActivity$1;
.super Ljava/lang/Object;
.source "MusicPlayActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/arist/MusicPlayer/MusicPlayActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/MusicPlayActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$1;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 64
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 66
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$1;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    # getter for: Lcom/arist/MusicPlayer/MusicPlayActivity;->musicProgress:Landroid/widget/SeekBar;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->access$0(Lcom/arist/MusicPlayer/MusicPlayActivity;)Landroid/widget/SeekBar;

    move-result-object v0

    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getMusicProgress()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 67
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$1;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    # getter for: Lcom/arist/MusicPlayer/MusicPlayActivity;->tvTotalTime:Landroid/widget/TextView;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->access$1(Lcom/arist/MusicPlayer/MusicPlayActivity;)Landroid/widget/TextView;

    move-result-object v0

    .line 68
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getMusicDuration()I

    move-result v1

    .line 67
    invoke-static {v1}, Lcom/arist/util/TimeFormat;->timeFormat(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$1;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    # getter for: Lcom/arist/MusicPlayer/MusicPlayActivity;->tvCurrentTime:Landroid/widget/TextView;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->access$2(Lcom/arist/MusicPlayer/MusicPlayActivity;)Landroid/widget/TextView;

    move-result-object v0

    .line 71
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getMusicProgress()I

    move-result v1

    .line 70
    invoke-static {v1}, Lcom/arist/util/TimeFormat;->timeFormat(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 74
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$1;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    iget-object v0, v0, Lcom/arist/MusicPlayer/MusicPlayActivity;->handlerUpdateSeekBar:Landroid/os/Handler;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$1;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    iget-object v1, v1, Lcom/arist/MusicPlayer/MusicPlayActivity;->updateSeekBarThread:Ljava/lang/Runnable;

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 76
    :cond_0
    return-void
.end method
