.class Lcom/arist/MusicPlayer/MainActivity$20;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/MainActivity;->initListener()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/MusicPlayer/MainActivity;


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/MainActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$20;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 645
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4
    .param p1, "v"    # Landroid/view/View;
    .param p2, "event"    # Landroid/view/MotionEvent;

    .prologue
    const/4 v3, 0x0

    .line 647
    const/4 v1, 0x1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    if-ne v1, v2, :cond_0

    .line 648
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$20;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->seekTimer:Ljava/util/Timer;
    invoke-static {v1}, Lcom/arist/MusicPlayer/MainActivity;->access$48(Lcom/arist/MusicPlayer/MainActivity;)Ljava/util/Timer;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 649
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$20;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->seekTimer:Ljava/util/Timer;
    invoke-static {v1}, Lcom/arist/MusicPlayer/MainActivity;->access$48(Lcom/arist/MusicPlayer/MainActivity;)Ljava/util/Timer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Timer;->cancel()V

    .line 650
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.MediaPlayer.action.SEEK"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 651
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "seekProgress"

    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$20;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->seekProgress:I
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity;->access$50(Lcom/arist/MusicPlayer/MainActivity;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 652
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$20;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-virtual {v1, v0}, Lcom/arist/MusicPlayer/MainActivity;->sendBroadcast(Landroid/content/Intent;)V

    .line 653
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$20;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-static {v1, v3}, Lcom/arist/MusicPlayer/MainActivity;->access$49(Lcom/arist/MusicPlayer/MainActivity;Z)V

    .line 656
    .end local v0    # "intent":Landroid/content/Intent;
    :cond_0
    return v3
.end method
