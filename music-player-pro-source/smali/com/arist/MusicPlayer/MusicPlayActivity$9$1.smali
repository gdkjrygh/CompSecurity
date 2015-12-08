.class Lcom/arist/MusicPlayer/MusicPlayActivity$9$1;
.super Ljava/lang/Thread;
.source "MusicPlayActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/MusicPlayActivity$9;->handleMessage(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/arist/MusicPlayer/MusicPlayActivity$9;


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/MusicPlayActivity$9;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$9$1;->this$1:Lcom/arist/MusicPlayer/MusicPlayActivity$9;

    .line 231
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 234
    :try_start_0
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$9$1;->this$1:Lcom/arist/MusicPlayer/MusicPlayActivity$9;

    # getter for: Lcom/arist/MusicPlayer/MusicPlayActivity$9;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MusicPlayActivity$9;->access$0(Lcom/arist/MusicPlayer/MusicPlayActivity$9;)Lcom/arist/MusicPlayer/MusicPlayActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$9$1;->this$1:Lcom/arist/MusicPlayer/MusicPlayActivity$9;

    # getter for: Lcom/arist/MusicPlayer/MusicPlayActivity$9;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;
    invoke-static {v1}, Lcom/arist/MusicPlayer/MusicPlayActivity$9;->access$0(Lcom/arist/MusicPlayer/MusicPlayActivity$9;)Lcom/arist/MusicPlayer/MusicPlayActivity;

    move-result-object v1

    # getter for: Lcom/arist/MusicPlayer/MusicPlayActivity;->lrcRead:Lcom/arist/util/LrcRead;
    invoke-static {v1}, Lcom/arist/MusicPlayer/MusicPlayActivity;->access$18(Lcom/arist/MusicPlayer/MusicPlayActivity;)Lcom/arist/util/LrcRead;

    move-result-object v1

    iget-object v2, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$9$1;->this$1:Lcom/arist/MusicPlayer/MusicPlayActivity$9;

    # getter for: Lcom/arist/MusicPlayer/MusicPlayActivity$9;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MusicPlayActivity$9;->access$0(Lcom/arist/MusicPlayer/MusicPlayActivity$9;)Lcom/arist/MusicPlayer/MusicPlayActivity;

    move-result-object v2

    # getter for: Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricPath:Ljava/lang/String;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MusicPlayActivity;->access$16(Lcom/arist/MusicPlayer/MusicPlayActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/arist/util/LrcRead;->Read(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/arist/MusicPlayer/MusicPlayActivity;->access$17(Lcom/arist/MusicPlayer/MusicPlayActivity;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 238
    :goto_0
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$9$1;->this$1:Lcom/arist/MusicPlayer/MusicPlayActivity$9;

    # getter for: Lcom/arist/MusicPlayer/MusicPlayActivity$9;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MusicPlayActivity$9;->access$0(Lcom/arist/MusicPlayer/MusicPlayActivity$9;)Lcom/arist/MusicPlayer/MusicPlayActivity;

    move-result-object v0

    # getter for: Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricList:Ljava/util/ArrayList;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->access$3(Lcom/arist/MusicPlayer/MusicPlayActivity;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 239
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$9$1;->this$1:Lcom/arist/MusicPlayer/MusicPlayActivity$9;

    # getter for: Lcom/arist/MusicPlayer/MusicPlayActivity$9;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MusicPlayActivity$9;->access$0(Lcom/arist/MusicPlayer/MusicPlayActivity$9;)Lcom/arist/MusicPlayer/MusicPlayActivity;

    move-result-object v0

    # getter for: Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricView:Lcom/arist/MyView/LyricView;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->access$4(Lcom/arist/MusicPlayer/MusicPlayActivity;)Lcom/arist/MyView/LyricView;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$9$1;->this$1:Lcom/arist/MusicPlayer/MusicPlayActivity$9;

    # getter for: Lcom/arist/MusicPlayer/MusicPlayActivity$9;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;
    invoke-static {v1}, Lcom/arist/MusicPlayer/MusicPlayActivity$9;->access$0(Lcom/arist/MusicPlayer/MusicPlayActivity$9;)Lcom/arist/MusicPlayer/MusicPlayActivity;

    move-result-object v1

    # getter for: Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricList:Ljava/util/ArrayList;
    invoke-static {v1}, Lcom/arist/MusicPlayer/MusicPlayActivity;->access$3(Lcom/arist/MusicPlayer/MusicPlayActivity;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/arist/MyView/LyricView;->setLyricList(Ljava/util/List;)V

    .line 241
    :cond_0
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$9$1;->this$1:Lcom/arist/MusicPlayer/MusicPlayActivity$9;

    # getter for: Lcom/arist/MusicPlayer/MusicPlayActivity$9;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MusicPlayActivity$9;->access$0(Lcom/arist/MusicPlayer/MusicPlayActivity$9;)Lcom/arist/MusicPlayer/MusicPlayActivity;

    move-result-object v0

    # getter for: Lcom/arist/MusicPlayer/MusicPlayActivity;->handler:Landroid/os/Handler;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->access$6(Lcom/arist/MusicPlayer/MusicPlayActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$9$1;->this$1:Lcom/arist/MusicPlayer/MusicPlayActivity$9;

    # getter for: Lcom/arist/MusicPlayer/MusicPlayActivity$9;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;
    invoke-static {v1}, Lcom/arist/MusicPlayer/MusicPlayActivity$9;->access$0(Lcom/arist/MusicPlayer/MusicPlayActivity$9;)Lcom/arist/MusicPlayer/MusicPlayActivity;

    move-result-object v1

    iget-object v1, v1, Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 242
    return-void

    .line 235
    :catch_0
    move-exception v0

    goto :goto_0
.end method
