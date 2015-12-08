.class Lcom/arist/MusicPlayer/MainActivity$13$1;
.super Ljava/util/TimerTask;
.source "MainActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/MainActivity$13;->onClick(Landroid/content/DialogInterface;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/arist/MusicPlayer/MainActivity$13;

.field private final synthetic val$sleepTimeMillis:J


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/MainActivity$13;J)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$13$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$13;

    iput-wide p2, p0, Lcom/arist/MusicPlayer/MainActivity$13$1;->val$sleepTimeMillis:J

    .line 435
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 438
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/arist/MusicPlayer/MainActivity$13$1;->val$sleepTimeMillis:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 439
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$13$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$13;

    # getter for: Lcom/arist/MusicPlayer/MainActivity$13;->this$0:Lcom/arist/MusicPlayer/MainActivity;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MainActivity$13;->access$0(Lcom/arist/MusicPlayer/MainActivity$13;)Lcom/arist/MusicPlayer/MainActivity;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    .line 440
    const-string v2, "com.MediaPlayer.action.START_SLEEP"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 439
    invoke-virtual {v0, v1}, Lcom/arist/MusicPlayer/MainActivity;->sendBroadcast(Landroid/content/Intent;)V

    .line 441
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$13$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$13;

    # getter for: Lcom/arist/MusicPlayer/MainActivity$13;->this$0:Lcom/arist/MusicPlayer/MainActivity;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MainActivity$13;->access$0(Lcom/arist/MusicPlayer/MainActivity$13;)Lcom/arist/MusicPlayer/MainActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/MusicPlayer/MainActivity;->finish()V

    .line 442
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$13$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$13;

    # getter for: Lcom/arist/MusicPlayer/MainActivity$13;->this$0:Lcom/arist/MusicPlayer/MainActivity;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MainActivity$13;->access$0(Lcom/arist/MusicPlayer/MainActivity$13;)Lcom/arist/MusicPlayer/MainActivity;

    move-result-object v0

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->sleepTimer:Ljava/util/Timer;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MainActivity;->access$39(Lcom/arist/MusicPlayer/MainActivity;)Ljava/util/Timer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 444
    :cond_0
    return-void
.end method
