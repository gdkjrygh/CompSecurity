.class Lcom/arist/MusicPlayer/ScanMusicActivity$4;
.super Ljava/lang/Thread;
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
.field final synthetic this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/ScanMusicActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$4;->this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

    .line 110
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 112
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$4;->this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

    # invokes: Lcom/arist/MusicPlayer/ScanMusicActivity;->updateMusicList()V
    invoke-static {v0}, Lcom/arist/MusicPlayer/ScanMusicActivity;->access$4(Lcom/arist/MusicPlayer/ScanMusicActivity;)V

    .line 113
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$4;->this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

    # getter for: Lcom/arist/MusicPlayer/ScanMusicActivity;->handler:Landroid/os/Handler;
    invoke-static {v0}, Lcom/arist/MusicPlayer/ScanMusicActivity;->access$5(Lcom/arist/MusicPlayer/ScanMusicActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 114
    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/arist/util/Constant;->rootDir:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/arist/util/LrcFileUtil;->moveLrcFile(Ljava/io/File;)V

    .line 115
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$4;->this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

    # getter for: Lcom/arist/MusicPlayer/ScanMusicActivity;->handler:Landroid/os/Handler;
    invoke-static {v0}, Lcom/arist/MusicPlayer/ScanMusicActivity;->access$5(Lcom/arist/MusicPlayer/ScanMusicActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 116
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity$4;->this$0:Lcom/arist/MusicPlayer/ScanMusicActivity;

    # getter for: Lcom/arist/MusicPlayer/ScanMusicActivity;->timer:Ljava/util/Timer;
    invoke-static {v0}, Lcom/arist/MusicPlayer/ScanMusicActivity;->access$6(Lcom/arist/MusicPlayer/ScanMusicActivity;)Ljava/util/Timer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 117
    return-void
.end method
