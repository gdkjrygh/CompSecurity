.class Lcom/arist/MusicPlayer/MusicPlayActivity$9;
.super Landroid/os/Handler;
.source "MusicPlayActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/MusicPlayActivity;->onCreate(Landroid/os/Bundle;)V
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
    iput-object p1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$9;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    .line 220
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/arist/MusicPlayer/MusicPlayActivity$9;)Lcom/arist/MusicPlayer/MusicPlayActivity;
    .locals 1

    .prologue
    .line 220
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$9;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    return-object v0
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 222
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 224
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$9;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$9;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    # invokes: Lcom/arist/MusicPlayer/MusicPlayActivity;->findLyric()Ljava/lang/String;
    invoke-static {v1}, Lcom/arist/MusicPlayer/MusicPlayActivity;->access$14(Lcom/arist/MusicPlayer/MusicPlayActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/arist/MusicPlayer/MusicPlayActivity;->access$15(Lcom/arist/MusicPlayer/MusicPlayActivity;Ljava/lang/String;)V

    .line 226
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$9;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    # getter for: Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricPath:Ljava/lang/String;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->access$16(Lcom/arist/MusicPlayer/MusicPlayActivity;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 227
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$9;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/arist/MusicPlayer/MusicPlayActivity;->access$17(Lcom/arist/MusicPlayer/MusicPlayActivity;Ljava/util/ArrayList;)V

    .line 228
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$9;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    # getter for: Lcom/arist/MusicPlayer/MusicPlayActivity;->handler:Landroid/os/Handler;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->access$6(Lcom/arist/MusicPlayer/MusicPlayActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$9;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    iget-object v1, v1, Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 247
    :goto_0
    return-void

    .line 231
    :cond_0
    new-instance v0, Lcom/arist/MusicPlayer/MusicPlayActivity$9$1;

    invoke-direct {v0, p0}, Lcom/arist/MusicPlayer/MusicPlayActivity$9$1;-><init>(Lcom/arist/MusicPlayer/MusicPlayActivity$9;)V

    .line 243
    invoke-virtual {v0}, Lcom/arist/MusicPlayer/MusicPlayActivity$9$1;->start()V

    .line 244
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$9;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    # invokes: Lcom/arist/MusicPlayer/MusicPlayActivity;->setLyric()V
    invoke-static {v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->access$19(Lcom/arist/MusicPlayer/MusicPlayActivity;)V

    .line 246
    :cond_1
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    goto :goto_0
.end method
