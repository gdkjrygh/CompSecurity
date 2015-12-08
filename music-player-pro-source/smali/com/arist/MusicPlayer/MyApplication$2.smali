.class Lcom/arist/MusicPlayer/MyApplication$2;
.super Ljava/util/TimerTask;
.source "MyApplication.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/MyApplication;->onCreate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/MusicPlayer/MyApplication;


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/MyApplication;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/MusicPlayer/MyApplication$2;->this$0:Lcom/arist/MusicPlayer/MyApplication;

    .line 223
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 226
    sget-object v1, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 227
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 228
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "com.MediaPlayer.action.MEDIAPLAYER_INFO"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 229
    sget-object v1, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v1

    sput v1, Lcom/arist/MusicPlayer/MyApplication;->musicProgress:I

    .line 230
    const-string v1, "musicProgress"

    sget v2, Lcom/arist/MusicPlayer/MyApplication;->musicProgress:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 231
    iget-object v1, p0, Lcom/arist/MusicPlayer/MyApplication$2;->this$0:Lcom/arist/MusicPlayer/MyApplication;

    invoke-virtual {v1}, Lcom/arist/MusicPlayer/MyApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 233
    .end local v0    # "intent":Landroid/content/Intent;
    :cond_0
    return-void
.end method
