.class Lcom/arist/MusicPlayer/MainActivity$19$1;
.super Ljava/util/TimerTask;
.source "MainActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/MainActivity$19;->onLongClick(Landroid/view/View;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field i:I

.field final synthetic this$1:Lcom/arist/MusicPlayer/MainActivity$19;


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/MainActivity$19;)V
    .locals 1

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$19$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$19;

    .line 629
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 630
    const/4 v0, 0x1

    iput v0, p0, Lcom/arist/MusicPlayer/MainActivity$19$1;->i:I

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 633
    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$19$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$19;

    # getter for: Lcom/arist/MusicPlayer/MainActivity$19;->this$0:Lcom/arist/MusicPlayer/MainActivity;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity$19;->access$0(Lcom/arist/MusicPlayer/MainActivity$19;)Lcom/arist/MusicPlayer/MainActivity;

    move-result-object v2

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->handler:Landroid/os/Handler;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity;->access$23(Lcom/arist/MusicPlayer/MainActivity;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 634
    .local v1, "msg":Landroid/os/Message;
    const/4 v2, 0x1

    iput v2, v1, Landroid/os/Message;->what:I

    .line 635
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 636
    .local v0, "bundle":Landroid/os/Bundle;
    const-string v2, "text"

    iget v3, p0, Lcom/arist/MusicPlayer/MainActivity$19$1;->i:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/arist/MusicPlayer/MainActivity$19$1;->i:I

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 637
    invoke-virtual {v1, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 638
    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$19$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$19;

    # getter for: Lcom/arist/MusicPlayer/MainActivity$19;->this$0:Lcom/arist/MusicPlayer/MainActivity;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity$19;->access$0(Lcom/arist/MusicPlayer/MainActivity$19;)Lcom/arist/MusicPlayer/MainActivity;

    move-result-object v2

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->handler:Landroid/os/Handler;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity;->access$23(Lcom/arist/MusicPlayer/MainActivity;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 639
    return-void
.end method
