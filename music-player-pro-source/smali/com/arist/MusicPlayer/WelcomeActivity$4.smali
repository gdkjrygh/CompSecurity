.class Lcom/arist/MusicPlayer/WelcomeActivity$4;
.super Ljava/lang/Thread;
.source "WelcomeActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/WelcomeActivity;->init()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/MusicPlayer/WelcomeActivity;

.field private final synthetic val$timer:Ljava/util/Timer;


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/WelcomeActivity;Ljava/util/Timer;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/MusicPlayer/WelcomeActivity$4;->this$0:Lcom/arist/MusicPlayer/WelcomeActivity;

    iput-object p2, p0, Lcom/arist/MusicPlayer/WelcomeActivity$4;->val$timer:Ljava/util/Timer;

    .line 110
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 112
    iget-object v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity$4;->this$0:Lcom/arist/MusicPlayer/WelcomeActivity;

    # invokes: Lcom/arist/MusicPlayer/WelcomeActivity;->updateMusicList()V
    invoke-static {v0}, Lcom/arist/MusicPlayer/WelcomeActivity;->access$5(Lcom/arist/MusicPlayer/WelcomeActivity;)V

    .line 113
    iget-object v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity$4;->this$0:Lcom/arist/MusicPlayer/WelcomeActivity;

    # getter for: Lcom/arist/MusicPlayer/WelcomeActivity;->handler:Landroid/os/Handler;
    invoke-static {v0}, Lcom/arist/MusicPlayer/WelcomeActivity;->access$6(Lcom/arist/MusicPlayer/WelcomeActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/MusicPlayer/WelcomeActivity$4;->this$0:Lcom/arist/MusicPlayer/WelcomeActivity;

    # getter for: Lcom/arist/MusicPlayer/WelcomeActivity;->handler:Landroid/os/Handler;
    invoke-static {v1}, Lcom/arist/MusicPlayer/WelcomeActivity;->access$6(Lcom/arist/MusicPlayer/WelcomeActivity;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 114
    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/arist/util/Constant;->rootDir:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/arist/util/LrcFileUtil;->moveLrcFile(Ljava/io/File;)V

    .line 115
    iget-object v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity$4;->this$0:Lcom/arist/MusicPlayer/WelcomeActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/arist/MusicPlayer/WelcomeActivity;->access$7(Lcom/arist/MusicPlayer/WelcomeActivity;Z)V

    .line 116
    iget-object v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity$4;->val$timer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 117
    iget-object v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity$4;->this$0:Lcom/arist/MusicPlayer/WelcomeActivity;

    # invokes: Lcom/arist/MusicPlayer/WelcomeActivity;->gotoMainActivity()V
    invoke-static {v0}, Lcom/arist/MusicPlayer/WelcomeActivity;->access$1(Lcom/arist/MusicPlayer/WelcomeActivity;)V

    .line 118
    return-void
.end method
