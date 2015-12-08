.class Lcom/arist/service/MusicPlayService$3;
.super Ljava/lang/Object;
.source "MusicPlayService.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnPreparedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/service/MusicPlayService;->playNetMusic(Lcom/yong/jamendo/api/JamendoMusic;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/service/MusicPlayService;


# direct methods
.method constructor <init>(Lcom/arist/service/MusicPlayService;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/service/MusicPlayService$3;->this$0:Lcom/arist/service/MusicPlayService;

    .line 470
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPrepared(Landroid/media/MediaPlayer;)V
    .locals 2
    .param p1, "mp"    # Landroid/media/MediaPlayer;

    .prologue
    .line 473
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->start()V

    .line 474
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/media/MediaPlayer;->setLooping(Z)V

    .line 475
    new-instance v0, Landroid/content/Intent;

    .line 476
    const-string v1, "com.MediaPlayer.action.NET_MUSIC_BUFFERING"

    .line 475
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 477
    .local v0, "intent":Landroid/content/Intent;
    iget-object v1, p0, Lcom/arist/service/MusicPlayService$3;->this$0:Lcom/arist/service/MusicPlayService;

    invoke-virtual {v1, v0}, Lcom/arist/service/MusicPlayService;->sendBroadcast(Landroid/content/Intent;)V

    .line 479
    iget-object v1, p0, Lcom/arist/service/MusicPlayService$3;->this$0:Lcom/arist/service/MusicPlayService;

    invoke-virtual {v1}, Lcom/arist/service/MusicPlayService;->startNotificationHandler()V

    .line 480
    return-void
.end method
