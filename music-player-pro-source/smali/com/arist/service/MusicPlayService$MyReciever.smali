.class Lcom/arist/service/MusicPlayService$MyReciever;
.super Landroid/content/BroadcastReceiver;
.source "MusicPlayService.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/arist/service/MusicPlayService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "MyReciever"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/service/MusicPlayService;


# direct methods
.method private constructor <init>(Lcom/arist/service/MusicPlayService;)V
    .locals 0

    .prologue
    .line 120
    iput-object p1, p0, Lcom/arist/service/MusicPlayService$MyReciever;->this$0:Lcom/arist/service/MusicPlayService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/arist/service/MusicPlayService;Lcom/arist/service/MusicPlayService$MyReciever;)V
    .locals 0

    .prologue
    .line 120
    invoke-direct {p0, p1}, Lcom/arist/service/MusicPlayService$MyReciever;-><init>(Lcom/arist/service/MusicPlayService;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    const/4 v2, 0x1

    const/4 v4, 0x0

    .line 124
    const-string v5, "com.MediaPlayer.action.PLAY"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 125
    iget-object v4, p0, Lcom/arist/service/MusicPlayService$MyReciever;->this$0:Lcom/arist/service/MusicPlayService;

    # invokes: Lcom/arist/service/MusicPlayService;->play()V
    invoke-static {v4}, Lcom/arist/service/MusicPlayService;->access$3(Lcom/arist/service/MusicPlayService;)V

    .line 223
    :cond_0
    :goto_0
    return-void

    .line 128
    :cond_1
    const-string v5, "com.MediaPlayer.action.PREVIOUS"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 129
    iget-object v4, p0, Lcom/arist/service/MusicPlayService$MyReciever;->this$0:Lcom/arist/service/MusicPlayService;

    # invokes: Lcom/arist/service/MusicPlayService;->previous()V
    invoke-static {v4}, Lcom/arist/service/MusicPlayService;->access$1(Lcom/arist/service/MusicPlayService;)V

    goto :goto_0

    .line 132
    :cond_2
    const-string v5, "com.MediaPlayer.action.NEXT"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 133
    iget-object v4, p0, Lcom/arist/service/MusicPlayService$MyReciever;->this$0:Lcom/arist/service/MusicPlayService;

    # invokes: Lcom/arist/service/MusicPlayService;->next()V
    invoke-static {v4}, Lcom/arist/service/MusicPlayService;->access$0(Lcom/arist/service/MusicPlayService;)V

    goto :goto_0

    .line 136
    :cond_3
    const-string v5, "com.MediaPlayer.action.SEEK"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 138
    :try_start_0
    iget-object v4, p0, Lcom/arist/service/MusicPlayService$MyReciever;->this$0:Lcom/arist/service/MusicPlayService;

    const-string v5, "seekProgress"

    const/4 v6, 0x0

    invoke-virtual {p2, v5, v6}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    invoke-static {v4, v5}, Lcom/arist/service/MusicPlayService;->access$4(Lcom/arist/service/MusicPlayService;I)V

    .line 139
    sget-object v4, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    iget-object v5, p0, Lcom/arist/service/MusicPlayService$MyReciever;->this$0:Lcom/arist/service/MusicPlayService;

    # getter for: Lcom/arist/service/MusicPlayService;->nowCurr:I
    invoke-static {v5}, Lcom/arist/service/MusicPlayService;->access$5(Lcom/arist/service/MusicPlayService;)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 141
    sget v4, Lcom/arist/MusicPlayer/MyApplication;->status:I

    const/4 v5, 0x2

    if-eq v4, v5, :cond_4

    .line 142
    sget v4, Lcom/arist/MusicPlayer/MyApplication;->status:I

    const/4 v5, 0x3

    if-ne v4, v5, :cond_0

    .line 143
    :cond_4
    sget-object v4, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v4}, Landroid/media/MediaPlayer;->start()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 145
    :catch_0
    move-exception v4

    goto :goto_0

    .line 149
    :cond_5
    const-string v5, "com.MediaPlayer.action.NET_PLAY"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 151
    const-string v4, "netMusic"

    invoke-virtual {p2, v4}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v3

    .line 150
    check-cast v3, Lcom/yong/jamendo/api/JamendoMusic;

    .line 152
    .local v3, "netMusic":Lcom/yong/jamendo/api/JamendoMusic;
    iget-object v4, p0, Lcom/arist/service/MusicPlayService$MyReciever;->this$0:Lcom/arist/service/MusicPlayService;

    invoke-virtual {v4, v3}, Lcom/arist/service/MusicPlayService;->playNetMusic(Lcom/yong/jamendo/api/JamendoMusic;)V

    .line 153
    invoke-static {v2}, Lcom/arist/MusicPlayer/MyApplication;->setPlayNetMusic(Z)V

    .line 154
    iget-object v4, p0, Lcom/arist/service/MusicPlayService$MyReciever;->this$0:Lcom/arist/service/MusicPlayService;

    new-instance v5, Landroid/content/Intent;

    const-string v6, "com.MediaPlayer.action.STATUS_CHANGED"

    invoke-direct {v5, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Lcom/arist/service/MusicPlayService;->sendBroadcast(Landroid/content/Intent;)V

    .line 155
    iget-object v4, p0, Lcom/arist/service/MusicPlayService$MyReciever;->this$0:Lcom/arist/service/MusicPlayService;

    new-instance v5, Landroid/content/Intent;

    const-string v6, "com.MediaPlayer.action.MUSIC_CHANGED"

    invoke-direct {v5, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Lcom/arist/service/MusicPlayService;->sendBroadcast(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 158
    .end local v3    # "netMusic":Lcom/yong/jamendo/api/JamendoMusic;
    :cond_6
    const-string v5, "com.MediaPlayer.action.DESTORY"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 159
    iget-object v4, p0, Lcom/arist/service/MusicPlayService$MyReciever;->this$0:Lcom/arist/service/MusicPlayService;

    # invokes: Lcom/arist/service/MusicPlayService;->stopMediaPlayer()V
    invoke-static {v4}, Lcom/arist/service/MusicPlayService;->access$6(Lcom/arist/service/MusicPlayService;)V

    .line 160
    iget-object v4, p0, Lcom/arist/service/MusicPlayService$MyReciever;->this$0:Lcom/arist/service/MusicPlayService;

    invoke-virtual {v4}, Lcom/arist/service/MusicPlayService;->stopSelf()V

    .line 161
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getInstance()Lcom/arist/MusicPlayer/MyApplication;

    move-result-object v4

    invoke-virtual {v4}, Lcom/arist/MusicPlayer/MyApplication;->exit()V

    goto/16 :goto_0

    .line 164
    :cond_7
    const-string v5, "com.MediaPlayer.action.MEDIA_BUTTON_PRESSED"

    .line 165
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v6

    .line 164
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    .line 165
    if-eqz v5, :cond_b

    .line 167
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getDefaultSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v5

    .line 168
    const-string v6, "headset_control_allow"

    .line 167
    invoke-interface {v5, v6, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    .line 168
    if-eqz v5, :cond_0

    .line 171
    const-string v5, "event_time"

    const-wide/16 v6, 0x0

    invoke-virtual {p2, v5, v6, v7}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    .line 173
    .local v0, "eventTime":J
    const-wide/16 v6, 0x320

    cmp-long v5, v0, v6

    if-lez v5, :cond_8

    .line 175
    .local v2, "isLongPress":Z
    :goto_1
    if-eqz v2, :cond_9

    .line 176
    iget-object v4, p0, Lcom/arist/service/MusicPlayService$MyReciever;->this$0:Lcom/arist/service/MusicPlayService;

    # invokes: Lcom/arist/service/MusicPlayService;->previous()V
    invoke-static {v4}, Lcom/arist/service/MusicPlayService;->access$1(Lcom/arist/service/MusicPlayService;)V

    goto/16 :goto_0

    .end local v2    # "isLongPress":Z
    :cond_8
    move v2, v4

    .line 173
    goto :goto_1

    .line 181
    .restart local v2    # "isLongPress":Z
    :cond_9
    iget-object v4, p0, Lcom/arist/service/MusicPlayService$MyReciever;->this$0:Lcom/arist/service/MusicPlayService;

    # invokes: Lcom/arist/service/MusicPlayService;->play()V
    invoke-static {v4}, Lcom/arist/service/MusicPlayService;->access$3(Lcom/arist/service/MusicPlayService;)V

    .line 184
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-object v6, p0, Lcom/arist/service/MusicPlayService$MyReciever;->this$0:Lcom/arist/service/MusicPlayService;

    # getter for: Lcom/arist/service/MusicPlayService;->lastBroadcastReceiveTime:J
    invoke-static {v6}, Lcom/arist/service/MusicPlayService;->access$7(Lcom/arist/service/MusicPlayService;)J

    move-result-wide v6

    sub-long/2addr v4, v6

    const-wide/16 v6, 0x5dc

    cmp-long v4, v4, v6

    if-gez v4, :cond_a

    .line 185
    iget-object v4, p0, Lcom/arist/service/MusicPlayService$MyReciever;->this$0:Lcom/arist/service/MusicPlayService;

    # invokes: Lcom/arist/service/MusicPlayService;->next()V
    invoke-static {v4}, Lcom/arist/service/MusicPlayService;->access$0(Lcom/arist/service/MusicPlayService;)V

    .line 187
    :cond_a
    iget-object v4, p0, Lcom/arist/service/MusicPlayService$MyReciever;->this$0:Lcom/arist/service/MusicPlayService;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-static {v4, v6, v7}, Lcom/arist/service/MusicPlayService;->access$8(Lcom/arist/service/MusicPlayService;J)V

    goto/16 :goto_0

    .line 193
    .end local v0    # "eventTime":J
    .end local v2    # "isLongPress":Z
    :cond_b
    const-string v5, "android.intent.action.HEADSET_PLUG"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    .line 196
    iget-object v5, p0, Lcom/arist/service/MusicPlayService$MyReciever;->this$0:Lcom/arist/service/MusicPlayService;

    # invokes: Lcom/arist/service/MusicPlayService;->getHeadSetState()Z
    invoke-static {v5}, Lcom/arist/service/MusicPlayService;->access$9(Lcom/arist/service/MusicPlayService;)Z

    move-result v5

    if-eqz v5, :cond_c

    .line 197
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getDefaultSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v5

    .line 198
    const-string v6, "headset_in_play"

    .line 197
    invoke-interface {v5, v6, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    .line 198
    if-eqz v4, :cond_0

    .line 200
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getInstance()Lcom/arist/MusicPlayer/MyApplication;

    move-result-object v4

    invoke-virtual {v4}, Lcom/arist/MusicPlayer/MyApplication;->isPlaying()Z

    move-result v4

    if-nez v4, :cond_0

    .line 201
    iget-object v4, p0, Lcom/arist/service/MusicPlayService$MyReciever;->this$0:Lcom/arist/service/MusicPlayService;

    # invokes: Lcom/arist/service/MusicPlayService;->play()V
    invoke-static {v4}, Lcom/arist/service/MusicPlayService;->access$3(Lcom/arist/service/MusicPlayService;)V

    goto/16 :goto_0

    .line 207
    :cond_c
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getDefaultSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v5

    .line 208
    const-string v6, "headset_out_stop"

    .line 207
    invoke-interface {v5, v6, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    .line 208
    if-eqz v4, :cond_0

    .line 210
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getInstance()Lcom/arist/MusicPlayer/MyApplication;

    move-result-object v4

    invoke-virtual {v4}, Lcom/arist/MusicPlayer/MyApplication;->isPlaying()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 211
    sget-object v4, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v4}, Landroid/media/MediaPlayer;->pause()V

    goto/16 :goto_0

    .line 219
    :cond_d
    const-string v4, "com.MediaPlayer.action.START_SLEEP"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 220
    iget-object v4, p0, Lcom/arist/service/MusicPlayService$MyReciever;->this$0:Lcom/arist/service/MusicPlayService;

    # invokes: Lcom/arist/service/MusicPlayService;->startSleep()V
    invoke-static {v4}, Lcom/arist/service/MusicPlayService;->access$10(Lcom/arist/service/MusicPlayService;)V

    goto/16 :goto_0
.end method
