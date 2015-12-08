.class Lcom/arist/MusicPlayer/MusicPlayActivity$2;
.super Ljava/lang/Object;
.source "MusicPlayActivity.java"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


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
    iput-object p1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$2;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 1
    .param p1, "seekBar"    # Landroid/widget/SeekBar;
    .param p2, "progress"    # I
    .param p3, "fromUser"    # Z

    .prologue
    .line 132
    if-eqz p3, :cond_0

    .line 133
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    if-nez v0, :cond_1

    .line 138
    :cond_0
    :goto_0
    return-void

    .line 136
    :cond_1
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p2}, Landroid/media/MediaPlayer;->seekTo(I)V

    goto :goto_0
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 1
    .param p1, "seekBar"    # Landroid/widget/SeekBar;

    .prologue
    .line 122
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    if-nez v0, :cond_0

    .line 127
    :goto_0
    return-void

    .line 126
    :cond_0
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    goto :goto_0
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2
    .param p1, "seekBar"    # Landroid/widget/SeekBar;

    .prologue
    .line 112
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    if-nez v0, :cond_0

    .line 118
    :goto_0
    return-void

    .line 116
    :cond_0
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {p1}, Landroid/widget/SeekBar;->getProgress()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 117
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    goto :goto_0
.end method
