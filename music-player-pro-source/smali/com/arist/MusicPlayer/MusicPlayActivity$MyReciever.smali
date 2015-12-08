.class Lcom/arist/MusicPlayer/MusicPlayActivity$MyReciever;
.super Landroid/content/BroadcastReceiver;
.source "MusicPlayActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/arist/MusicPlayer/MusicPlayActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "MyReciever"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;


# direct methods
.method private constructor <init>(Lcom/arist/MusicPlayer/MusicPlayActivity;)V
    .locals 0

    .prologue
    .line 311
    iput-object p1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$MyReciever;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/arist/MusicPlayer/MusicPlayActivity;Lcom/arist/MusicPlayer/MusicPlayActivity$MyReciever;)V
    .locals 0

    .prologue
    .line 311
    invoke-direct {p0, p1}, Lcom/arist/MusicPlayer/MusicPlayActivity$MyReciever;-><init>(Lcom/arist/MusicPlayer/MusicPlayActivity;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 315
    const-string v0, "com.MediaPlayer.action.DESTORY"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 316
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$MyReciever;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    invoke-virtual {v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->finish()V

    .line 325
    :cond_0
    :goto_0
    return-void

    .line 317
    :cond_1
    const-string v0, "com.MediaPlayer.action.MUSIC_CHANGED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 318
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$MyReciever;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    # invokes: Lcom/arist/MusicPlayer/MusicPlayActivity;->updateView()V
    invoke-static {v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->access$7(Lcom/arist/MusicPlayer/MusicPlayActivity;)V

    .line 320
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$MyReciever;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    # getter for: Lcom/arist/MusicPlayer/MusicPlayActivity;->handler:Landroid/os/Handler;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->access$6(Lcom/arist/MusicPlayer/MusicPlayActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$MyReciever;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    # getter for: Lcom/arist/MusicPlayer/MusicPlayActivity;->handler:Landroid/os/Handler;
    invoke-static {v1}, Lcom/arist/MusicPlayer/MusicPlayActivity;->access$6(Lcom/arist/MusicPlayer/MusicPlayActivity;)Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 321
    :cond_2
    const-string v0, "com.MediaPlayer.action.STATUS_CHANGED"

    .line 322
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 323
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity$MyReciever;->this$0:Lcom/arist/MusicPlayer/MusicPlayActivity;

    # invokes: Lcom/arist/MusicPlayer/MusicPlayActivity;->updateView()V
    invoke-static {v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->access$7(Lcom/arist/MusicPlayer/MusicPlayActivity;)V

    goto :goto_0
.end method
