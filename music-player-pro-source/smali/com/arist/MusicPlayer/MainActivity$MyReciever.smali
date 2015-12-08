.class Lcom/arist/MusicPlayer/MainActivity$MyReciever;
.super Landroid/content/BroadcastReceiver;
.source "MainActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/arist/MusicPlayer/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "MyReciever"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/MusicPlayer/MainActivity;


# direct methods
.method private constructor <init>(Lcom/arist/MusicPlayer/MainActivity;)V
    .locals 0

    .prologue
    .line 1274
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$MyReciever;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/arist/MusicPlayer/MainActivity;Lcom/arist/MusicPlayer/MainActivity$MyReciever;)V
    .locals 0

    .prologue
    .line 1274
    invoke-direct {p0, p1}, Lcom/arist/MusicPlayer/MainActivity$MyReciever;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    const/4 v7, 0x1

    .line 1278
    const-string v3, "com.MediaPlayer.action.MEDIAPLAYER_INFO"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 1279
    const-string v3, "musicProgress"

    const/4 v4, 0x0

    invoke-virtual {p2, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    .line 1280
    .local v1, "currentTime":I
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity$MyReciever;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->seeking:Z
    invoke-static {v3}, Lcom/arist/MusicPlayer/MainActivity;->access$17(Lcom/arist/MusicPlayer/MainActivity;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 1281
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity$MyReciever;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->musicProgressMain:Landroid/widget/ProgressBar;
    invoke-static {v3}, Lcom/arist/MusicPlayer/MainActivity;->access$18(Lcom/arist/MusicPlayer/MainActivity;)Landroid/widget/ProgressBar;

    move-result-object v3

    mul-int/lit16 v4, v1, 0x3e8

    .line 1282
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getMusicDuration()I

    move-result v5

    div-int/2addr v4, v5

    .line 1281
    invoke-virtual {v3, v4}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 1318
    .end local v1    # "currentTime":I
    :cond_0
    :goto_0
    return-void

    .line 1284
    :cond_1
    const-string v3, "com.MediaPlayer.action.MUSIC_CHANGED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 1285
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity$MyReciever;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # invokes: Lcom/arist/MusicPlayer/MainActivity;->updateView()V
    invoke-static {v3}, Lcom/arist/MusicPlayer/MainActivity;->access$19(Lcom/arist/MusicPlayer/MainActivity;)V

    .line 1286
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity$MyReciever;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->musicAdapter:Lcom/arist/Adapter/MusicAdapter;
    invoke-static {v3}, Lcom/arist/MusicPlayer/MainActivity;->access$15(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/Adapter/MusicAdapter;

    move-result-object v3

    invoke-virtual {v3}, Lcom/arist/Adapter/MusicAdapter;->notifyDataSetChanged()V

    goto :goto_0

    .line 1287
    :cond_2
    const-string v3, "com.MediaPlayer.action.STATUS_CHANGED"

    .line 1288
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 1289
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity$MyReciever;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-virtual {v3}, Lcom/arist/MusicPlayer/MainActivity;->updatePlayStatusView()V

    goto :goto_0

    .line 1290
    :cond_3
    const-string v3, "com.MediaPlayer.action.UPDATE_NETMUEIC_VIEW"

    .line 1291
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 1290
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    .line 1291
    if-eqz v3, :cond_4

    .line 1292
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity$MyReciever;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    const-string v4, "name"

    invoke-virtual {p2, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/arist/MusicPlayer/MainActivity;->access$20(Lcom/arist/MusicPlayer/MainActivity;Ljava/lang/String;)V

    .line 1293
    const-string v3, "albumName"

    invoke-virtual {p2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1295
    .local v0, "albumName":Ljava/lang/String;
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity$MyReciever;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 1296
    new-instance v4, Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/arist/MusicPlayer/MainActivity$MyReciever;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->downloadMusicName:Ljava/lang/String;
    invoke-static {v5}, Lcom/arist/MusicPlayer/MainActivity;->access$4(Lcom/arist/MusicPlayer/MainActivity;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, ".mp3"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 1297
    const-string v5, " "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/arist/MusicPlayer/MainActivity$MyReciever;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    const v6, 0x7f080082

    invoke-virtual {v5, v6}, Lcom/arist/MusicPlayer/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 1296
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 1294
    invoke-static {v3, v4, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v3

    .line 1298
    invoke-virtual {v3}, Landroid/widget/Toast;->show()V

    .line 1301
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity$MyReciever;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    new-instance v4, Landroid/media/MediaScannerConnection;

    .line 1302
    sget-object v5, Lcom/arist/MusicPlayer/MyApplication;->context:Landroid/content/Context;

    iget-object v6, p0, Lcom/arist/MusicPlayer/MainActivity$MyReciever;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->mediaScannerConnectionClient:Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;
    invoke-static {v6}, Lcom/arist/MusicPlayer/MainActivity;->access$21(Lcom/arist/MusicPlayer/MainActivity;)Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Landroid/media/MediaScannerConnection;-><init>(Landroid/content/Context;Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;)V

    .line 1301
    invoke-static {v3, v4}, Lcom/arist/MusicPlayer/MainActivity;->access$22(Lcom/arist/MusicPlayer/MainActivity;Landroid/media/MediaScannerConnection;)V

    .line 1303
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity$MyReciever;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->mediaScannerConnection:Landroid/media/MediaScannerConnection;
    invoke-static {v3}, Lcom/arist/MusicPlayer/MainActivity;->access$3(Lcom/arist/MusicPlayer/MainActivity;)Landroid/media/MediaScannerConnection;

    move-result-object v3

    invoke-virtual {v3}, Landroid/media/MediaScannerConnection;->connect()V

    .line 1306
    new-instance v3, Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/arist/MusicPlayer/MainActivity$MyReciever;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->downloadMusicName:Ljava/lang/String;
    invoke-static {v4}, Lcom/arist/MusicPlayer/MainActivity;->access$4(Lcom/arist/MusicPlayer/MainActivity;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, "-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 1307
    const-string v4, ".jpg"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 1306
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/arist/util/BitmapService;->copyCachBmp(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 1311
    .end local v0    # "albumName":Ljava/lang/String;
    :cond_4
    const-string v3, "com.MediaPlayer.action.NET_MUSIC_BUFFERING"

    .line 1312
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 1311
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    .line 1312
    if-eqz v3, :cond_0

    .line 1313
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity$MyReciever;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->handler:Landroid/os/Handler;
    invoke-static {v3}, Lcom/arist/MusicPlayer/MainActivity;->access$23(Lcom/arist/MusicPlayer/MainActivity;)Landroid/os/Handler;

    move-result-object v3

    invoke-virtual {v3}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v2

    .line 1314
    .local v2, "msg":Landroid/os/Message;
    const/4 v3, 0x7

    iput v3, v2, Landroid/os/Message;->what:I

    .line 1315
    iput v7, v2, Landroid/os/Message;->arg1:I

    .line 1316
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity$MyReciever;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->handler:Landroid/os/Handler;
    invoke-static {v3}, Lcom/arist/MusicPlayer/MainActivity;->access$23(Lcom/arist/MusicPlayer/MainActivity;)Landroid/os/Handler;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_0
.end method
