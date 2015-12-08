.class Lcom/arist/MusicPlayer/MusicPlayActivity$3;
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
    iput-object p1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$3;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    .line 252
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 254
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$3;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    # getter for: Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricList:Ljava/util/ArrayList;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->access$3(Lcom/arist/MusicPlayer/MusicPlayActivity;)Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_1

    .line 255
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$3;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    # getter for: Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricView:Lcom/arist/MyView/LyricView;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->access$4(Lcom/arist/MusicPlayer/MusicPlayActivity;)Lcom/arist/MyView/LyricView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/MyView/LyricView;->clearText()V

    .line 264
    :cond_0
    :goto_0
    return-void

    .line 257
    :cond_1
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$3;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    # getter for: Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricView:Lcom/arist/MyView/LyricView;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->access$4(Lcom/arist/MusicPlayer/MusicPlayActivity;)Lcom/arist/MyView/LyricView;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/arist/MyView/LyricView;->setText(Ljava/lang/CharSequence;)V

    .line 258
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$3;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    # getter for: Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricView:Lcom/arist/MyView/LyricView;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->access$4(Lcom/arist/MusicPlayer/MusicPlayActivity;)Lcom/arist/MyView/LyricView;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$3;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    invoke-virtual {v1}, Lcom/arist/MusicPlayer/MusicPlayActivity;->getIndex()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/MyView/LyricView;->setIndex(I)V

    .line 259
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$3;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    # getter for: Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricView:Lcom/arist/MyView/LyricView;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->access$4(Lcom/arist/MusicPlayer/MusicPlayActivity;)Lcom/arist/MyView/LyricView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/MyView/LyricView;->invalidate()V

    .line 260
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$3;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    # getter for: Lcom/arist/MusicPlayer/MusicPlayActivity;->isFront:Z
    invoke-static {v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->access$5(Lcom/arist/MusicPlayer/MusicPlayActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 261
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$3;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    # getter for: Lcom/arist/MusicPlayer/MusicPlayActivity;->handler:Landroid/os/Handler;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->access$6(Lcom/arist/MusicPlayer/MusicPlayActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$3;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    iget-object v1, v1, Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricRunnable:Ljava/lang/Runnable;

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method
