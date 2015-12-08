.class Lcom/arist/MusicPlayer/MainActivity$33;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/MainActivity;->showNewMusicConfirmPlayDlg()Landroid/app/Dialog;
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
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$33;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 1561
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 7
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    .line 1566
    new-instance v4, Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/arist/MusicPlayer/MainActivity$33;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v5, v5, Lcom/arist/MusicPlayer/MainActivity;->currentNetMusic:Lcom/yong/jamendo/api/JamendoMusic;

    .line 1567
    invoke-virtual {v5}, Lcom/yong/jamendo/api/JamendoMusic;->getMusic_name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1568
    const-string v5, "-"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 1569
    iget-object v5, p0, Lcom/arist/MusicPlayer/MainActivity$33;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v5, v5, Lcom/arist/MusicPlayer/MainActivity;->currentNetMusic:Lcom/yong/jamendo/api/JamendoMusic;

    invoke-virtual {v5}, Lcom/yong/jamendo/api/JamendoMusic;->getAlbum_name()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 1570
    const-string v5, ".jpg"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 1566
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 1573
    .local v3, "picString":Ljava/lang/String;
    new-instance v4, Ljava/lang/StringBuilder;

    sget-object v5, Lcom/arist/util/Constant;->BASE_ABLUM_CACHES_PATH:Ljava/lang/String;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1574
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 1573
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 1575
    new-instance v5, Ljava/lang/StringBuilder;

    sget-object v6, Lcom/arist/util/Constant;->BASE_ABLUM_PATH:Ljava/lang/String;

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 1572
    invoke-static {v4, v5}, Lcom/arist/util/BitmapService;->copyBitmap(Ljava/lang/String;Ljava/lang/String;)V

    .line 1578
    :try_start_0
    new-instance v2, Lcom/arist/entity/Music;

    invoke-direct {v2}, Lcom/arist/entity/Music;-><init>()V

    .line 1579
    .local v2, "music":Lcom/arist/entity/Music;
    iget-object v4, p0, Lcom/arist/MusicPlayer/MainActivity$33;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v4, v4, Lcom/arist/MusicPlayer/MainActivity;->currentNetMusic:Lcom/yong/jamendo/api/JamendoMusic;

    .line 1580
    invoke-virtual {v4}, Lcom/yong/jamendo/api/JamendoMusic;->getAlbum_name()Ljava/lang/String;

    move-result-object v4

    .line 1579
    invoke-virtual {v2, v4}, Lcom/arist/entity/Music;->setAlbum(Ljava/lang/String;)V

    .line 1581
    iget-object v4, p0, Lcom/arist/MusicPlayer/MainActivity$33;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v4, v4, Lcom/arist/MusicPlayer/MainActivity;->currentNetMusic:Lcom/yong/jamendo/api/JamendoMusic;

    .line 1582
    invoke-virtual {v4}, Lcom/yong/jamendo/api/JamendoMusic;->getArtistName()Ljava/lang/String;

    move-result-object v4

    .line 1581
    invoke-virtual {v2, v4}, Lcom/arist/entity/Music;->setArtist(Ljava/lang/String;)V

    .line 1583
    iget-object v4, p0, Lcom/arist/MusicPlayer/MainActivity$33;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v4, v4, Lcom/arist/MusicPlayer/MainActivity;->currentNetMusic:Lcom/yong/jamendo/api/JamendoMusic;

    .line 1584
    invoke-virtual {v4}, Lcom/yong/jamendo/api/JamendoMusic;->getDuration()I

    move-result v4

    mul-int/lit16 v4, v4, 0x3e8

    .line 1583
    invoke-virtual {v2, v4}, Lcom/arist/entity/Music;->setDuration(I)V

    .line 1585
    iget-object v4, p0, Lcom/arist/MusicPlayer/MainActivity$33;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v4, v4, Lcom/arist/MusicPlayer/MainActivity;->currentNetMusic:Lcom/yong/jamendo/api/JamendoMusic;

    .line 1586
    invoke-virtual {v4}, Lcom/yong/jamendo/api/JamendoMusic;->getMusic_name()Ljava/lang/String;

    move-result-object v4

    .line 1585
    invoke-virtual {v2, v4}, Lcom/arist/entity/Music;->setTitle(Ljava/lang/String;)V

    .line 1587
    invoke-static {v2}, Lcom/arist/MusicPlayer/MyApplication;->setCurrentMusic(Lcom/arist/entity/Music;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1591
    .end local v2    # "music":Lcom/arist/entity/Music;
    :goto_0
    new-instance v0, Landroid/content/Intent;

    .line 1592
    const-string v4, "com.MediaPlayer.action.NET_PLAY"

    .line 1591
    invoke-direct {v0, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1593
    .local v0, "intent":Landroid/content/Intent;
    const-string v4, "netMusic"

    iget-object v5, p0, Lcom/arist/MusicPlayer/MainActivity$33;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v5, v5, Lcom/arist/MusicPlayer/MainActivity;->currentNetMusic:Lcom/yong/jamendo/api/JamendoMusic;

    invoke-virtual {v0, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 1594
    iget-object v4, p0, Lcom/arist/MusicPlayer/MainActivity$33;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-virtual {v4, v0}, Lcom/arist/MusicPlayer/MainActivity;->sendBroadcast(Landroid/content/Intent;)V

    .line 1596
    iget-object v4, p0, Lcom/arist/MusicPlayer/MainActivity$33;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->handler:Landroid/os/Handler;
    invoke-static {v4}, Lcom/arist/MusicPlayer/MainActivity;->access$23(Lcom/arist/MusicPlayer/MainActivity;)Landroid/os/Handler;

    move-result-object v4

    invoke-virtual {v4}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 1597
    .local v1, "msg":Landroid/os/Message;
    const/4 v4, 0x7

    iput v4, v1, Landroid/os/Message;->what:I

    .line 1598
    const/4 v4, 0x0

    iput v4, v1, Landroid/os/Message;->arg1:I

    .line 1599
    iget-object v4, p0, Lcom/arist/MusicPlayer/MainActivity$33;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->handler:Landroid/os/Handler;
    invoke-static {v4}, Lcom/arist/MusicPlayer/MainActivity;->access$23(Lcom/arist/MusicPlayer/MainActivity;)Landroid/os/Handler;

    move-result-object v4

    invoke-virtual {v4, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1600
    iget-object v4, p0, Lcom/arist/MusicPlayer/MainActivity$33;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 1601
    const v5, 0x7f08007c

    const/4 v6, 0x1

    .line 1600
    invoke-static {v4, v5, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v4

    .line 1602
    invoke-virtual {v4}, Landroid/widget/Toast;->show()V

    .line 1603
    return-void

    .line 1588
    .end local v0    # "intent":Landroid/content/Intent;
    .end local v1    # "msg":Landroid/os/Message;
    :catch_0
    move-exception v4

    goto :goto_0
.end method
