.class Lcom/arist/MusicPlayer/ScanMusicActivity$5;
.super Ljava/util/TimerTask;
.source "ScanMusicActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/ScanMusicActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field progress:I

.field final synthetic this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

.field totalMusic:I


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/ScanMusicActivity;)V
    .locals 1

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$5;->this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

    .line 122
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 123
    const/4 v0, 0x0

    iput v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$5;->progress:I

    .line 124
    # getter for: Lcom/arist/MusicPlayer/ScanMusicActivity;->musicBiz:Lcom/arist/biz/MusicBiz;
    invoke-static {p1}, Lcom/arist/MusicPlayer/ScanMusicActivity;->access$3(Lcom/arist/MusicPlayer/ScanMusicActivity;)Lcom/arist/biz/MusicBiz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/biz/MusicBiz;->getTotalMusic()I

    move-result v0

    iput v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$5;->totalMusic:I

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    .line 127
    iget-object v1, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$5;->this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

    # getter for: Lcom/arist/MusicPlayer/ScanMusicActivity;->musicBiz:Lcom/arist/biz/MusicBiz;
    invoke-static {v1}, Lcom/arist/MusicPlayer/ScanMusicActivity;->access$3(Lcom/arist/MusicPlayer/ScanMusicActivity;)Lcom/arist/biz/MusicBiz;

    move-result-object v1

    invoke-virtual {v1}, Lcom/arist/biz/MusicBiz;->getCount()I

    move-result v0

    .line 128
    .local v0, "count":I
    iget v1, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$5;->totalMusic:I

    if-lez v1, :cond_1

    .line 129
    int-to-double v2, v0

    const-wide v4, 0x408f400000000000L    # 1000.0

    mul-double/2addr v2, v4

    iget v1, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$5;->totalMusic:I

    int-to-double v4, v1

    div-double/2addr v2, v4

    double-to-int v1, v2

    iput v1, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$5;->progress:I

    .line 132
    :goto_0
    iget-object v1, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$5;->this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

    # getter for: Lcom/arist/MusicPlayer/ScanMusicActivity;->pbScan:Landroid/widget/ProgressBar;
    invoke-static {v1}, Lcom/arist/MusicPlayer/ScanMusicActivity;->access$7(Lcom/arist/MusicPlayer/ScanMusicActivity;)Landroid/widget/ProgressBar;

    move-result-object v1

    iget v2, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$5;->progress:I

    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 133
    iget-object v1, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$5;->this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

    # getter for: Lcom/arist/MusicPlayer/ScanMusicActivity;->handler:Landroid/os/Handler;
    invoke-static {v1}, Lcom/arist/MusicPlayer/ScanMusicActivity;->access$5(Lcom/arist/MusicPlayer/ScanMusicActivity;)Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 134
    iget-object v1, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$5;->this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

    # getter for: Lcom/arist/MusicPlayer/ScanMusicActivity;->musicBiz:Lcom/arist/biz/MusicBiz;
    invoke-static {v1}, Lcom/arist/MusicPlayer/ScanMusicActivity;->access$3(Lcom/arist/MusicPlayer/ScanMusicActivity;)Lcom/arist/biz/MusicBiz;

    move-result-object v1

    invoke-virtual {v1}, Lcom/arist/biz/MusicBiz;->getCount()I

    move-result v1

    iget v2, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$5;->totalMusic:I

    if-ne v1, v2, :cond_0

    .line 135
    iget-object v1, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$5;->this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

    # getter for: Lcom/arist/MusicPlayer/ScanMusicActivity;->timer:Ljava/util/Timer;
    invoke-static {v1}, Lcom/arist/MusicPlayer/ScanMusicActivity;->access$6(Lcom/arist/MusicPlayer/ScanMusicActivity;)Ljava/util/Timer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Timer;->cancel()V

    .line 137
    :cond_0
    return-void

    .line 131
    :cond_1
    const/4 v1, 0x0

    iput v1, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$5;->progress:I

    goto :goto_0
.end method
