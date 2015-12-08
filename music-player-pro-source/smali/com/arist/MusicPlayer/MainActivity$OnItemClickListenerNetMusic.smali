.class Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerNetMusic;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/arist/MusicPlayer/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "OnItemClickListenerNetMusic"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/widget/AdapterView$OnItemClickListener;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/MusicPlayer/MainActivity;


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/MainActivity;)V
    .locals 0

    .prologue
    .line 917
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerNetMusic;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4
    .param p2, "arg1"    # Landroid/view/View;
    .param p3, "position"    # I
    .param p4, "id"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 920
    .local p1, "arg0":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerNetMusic;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerNetMusic;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->netMusicAdapter:Lcom/arist/Adapter/NetMusicAdapter;
    invoke-static {v1}, Lcom/arist/MusicPlayer/MainActivity;->access$16(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/Adapter/NetMusicAdapter;

    move-result-object v1

    invoke-virtual {v1, p3}, Lcom/arist/Adapter/NetMusicAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/yong/jamendo/api/JamendoMusic;

    iput-object v1, v2, Lcom/arist/MusicPlayer/MainActivity;->currentNetMusic:Lcom/yong/jamendo/api/JamendoMusic;

    .line 922
    new-instance v1, Ljava/lang/StringBuilder;

    sget-object v2, Lcom/arist/util/Constant;->BASE_DOWNLOAD_PATH:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 923
    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerNetMusic;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    iget-object v2, v2, Lcom/arist/MusicPlayer/MainActivity;->currentNetMusic:Lcom/yong/jamendo/api/JamendoMusic;

    invoke-virtual {v2}, Lcom/yong/jamendo/api/JamendoMusic;->getMusic_name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 924
    const-string v2, ".mp3"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 922
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 926
    .local v0, "savePath":Ljava/lang/String;
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 928
    :try_start_0
    sget-object v1, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->reset()V

    .line 929
    sget-object v1, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v1, v0}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 930
    sget-object v1, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->prepare()V

    .line 931
    sget-object v1, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->start()V

    .line 932
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerNetMusic;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->musicDao:Lcom/arist/dao/MusicDao;
    invoke-static {v1}, Lcom/arist/MusicPlayer/MainActivity;->access$5(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/dao/MusicDao;

    move-result-object v1

    .line 933
    invoke-virtual {v1, v0}, Lcom/arist/dao/MusicDao;->getMusicByPath(Ljava/lang/String;)Lcom/arist/entity/Music;

    move-result-object v1

    .line 932
    invoke-static {v1}, Lcom/arist/MusicPlayer/MyApplication;->setCurrentMusic(Lcom/arist/entity/Music;)V

    .line 934
    const/4 v1, 0x1

    invoke-static {v1}, Lcom/arist/MusicPlayer/MyApplication;->setPlayNetMusic(Z)V

    .line 935
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerNetMusic;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    new-instance v2, Landroid/content/Intent;

    const-string v3, "com.MediaPlayer.action.STATUS_CHANGED"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/arist/MusicPlayer/MainActivity;->sendBroadcast(Landroid/content/Intent;)V

    .line 936
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerNetMusic;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    new-instance v2, Landroid/content/Intent;

    const-string v3, "com.MediaPlayer.action.MUSIC_CHANGED"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/arist/MusicPlayer/MainActivity;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 943
    :goto_0
    return-void

    .line 940
    :cond_0
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerNetMusic;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lcom/arist/MusicPlayer/MainActivity;->showDialog(I)V

    goto :goto_0

    .line 937
    :catch_0
    move-exception v1

    goto :goto_0
.end method
