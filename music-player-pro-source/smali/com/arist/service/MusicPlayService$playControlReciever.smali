.class public Lcom/arist/service/MusicPlayService$playControlReciever;
.super Landroid/content/BroadcastReceiver;
.source "MusicPlayService.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/arist/service/MusicPlayService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "playControlReciever"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 89
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 92
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getInstance()Lcom/arist/MusicPlayer/MyApplication;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 93
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->musicList:Ljava/util/ArrayList;

    invoke-static {v0}, Lcom/arist/service/MusicPlayService;->access$2(Ljava/util/ArrayList;)V

    .line 94
    const-string v0, "com.MediaPlayer.action.WIDGET_PLAY"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 95
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->context:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    .line 96
    const-string v2, "com.MediaPlayer.action.PLAY"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 95
    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 116
    :cond_0
    :goto_0
    return-void

    .line 97
    :cond_1
    const-string v0, "com.MediaPlayer.action.WIDGET_NEXT"

    .line 98
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 98
    if-eqz v0, :cond_2

    .line 99
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->context:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    .line 100
    const-string v2, "com.MediaPlayer.action.NEXT"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 99
    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_0

    .line 102
    :cond_2
    const-string v0, "com.MediaPlayer.action.WIDGET_PREVIOUS"

    .line 103
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 103
    if-eqz v0, :cond_3

    .line 104
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->context:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    .line 105
    const-string v2, "com.MediaPlayer.action.PREVIOUS"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 104
    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_0

    .line 107
    :cond_3
    const-string v0, "com.MediaPlayer.action.WIDGET_EXIT"

    .line 108
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 108
    if-eqz v0, :cond_0

    .line 110
    invoke-static {}, Lcom/arist/notify/MyNotiofation;->clearNotification()V

    .line 112
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->context:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    .line 113
    const-string v2, "com.MediaPlayer.action.PLAY"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 112
    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_0
.end method
