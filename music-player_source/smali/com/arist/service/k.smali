.class final Lcom/arist/service/k;
.super Landroid/content/BroadcastReceiver;


# instance fields
.field final synthetic a:Lcom/arist/service/MusicPlayService;


# direct methods
.method constructor <init>(Lcom/arist/service/MusicPlayService;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/service/k;->a:Lcom/arist/service/MusicPlayService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    const/4 v2, 0x3

    const-string v0, "MusicPlayService"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/arist/c/a;->b:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arist/service/k;->a:Lcom/arist/service/MusicPlayService;

    invoke-virtual {v0}, Lcom/arist/service/MusicPlayService;->a()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    sget-object v0, Lcom/arist/c/a;->f:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/arist/service/k;->a:Lcom/arist/service/MusicPlayService;

    invoke-static {v0}, Lcom/arist/service/MusicPlayService;->b(Lcom/arist/service/MusicPlayService;)V

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/arist/c/a;->g:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/arist/service/k;->a:Lcom/arist/service/MusicPlayService;

    invoke-static {v0}, Lcom/arist/service/MusicPlayService;->a(Lcom/arist/service/MusicPlayService;)V

    goto :goto_0

    :cond_3
    sget-object v0, Lcom/arist/c/a;->e:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    :try_start_0
    const-string v0, "seekProgress"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    sget-object v1, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v1, v0}, Landroid/media/MediaPlayer;->seekTo(I)V

    sget v0, Lcom/arist/activity/MyApplication;->j:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    sget v0, Lcom/arist/activity/MyApplication;->j:I

    if-ne v0, v2, :cond_5

    :cond_4
    sget-object v0, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    :cond_5
    iget-object v0, p0, Lcom/arist/service/k;->a:Lcom/arist/service/MusicPlayService;

    new-instance v1, Landroid/content/Intent;

    sget-object v2, Lcom/arist/c/a;->l:Ljava/lang/String;

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/arist/service/MusicPlayService;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_6
    sget-object v0, Lcom/arist/c/a;->q:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, "MusicPlayService"

    const-string v1, "\u5df2\u6536\u5230\u9500\u6bc1\u5e7f\u64ad"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/arist/service/k;->a:Lcom/arist/service/MusicPlayService;

    invoke-virtual {v0}, Lcom/arist/service/MusicPlayService;->stopSelf()V

    goto :goto_0

    :cond_7
    sget-object v0, Lcom/arist/c/a;->s:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    const-string v0, "sleep_time"

    const-wide/16 v2, 0x0

    invoke-virtual {p2, v0, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    iget-object v2, p0, Lcom/arist/service/k;->a:Lcom/arist/service/MusicPlayService;

    invoke-static {v2, v0, v1}, Lcom/arist/service/MusicPlayService;->a(Lcom/arist/service/MusicPlayService;J)V

    goto/16 :goto_0

    :cond_8
    sget-object v0, Lcom/arist/c/a;->i:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    const-string v0, "MusicPlayService"

    const-string v1, "\u6e05\u9664\u901a\u77e5"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcom/arist/activity/MyApplication;->d()Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object v0, Lcom/arist/activity/MyApplication;->a:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    sput v2, Lcom/arist/activity/MyApplication;->j:I

    sget-object v0, Lcom/arist/activity/MyApplication;->q:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    sget-object v2, Lcom/arist/c/a;->l:Ljava/lang/String;

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    :cond_9
    iget-object v0, p0, Lcom/arist/service/k;->a:Lcom/arist/service/MusicPlayService;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/arist/service/MusicPlayService;->stopForeground(Z)V

    iget-object v0, p0, Lcom/arist/service/k;->a:Lcom/arist/service/MusicPlayService;

    invoke-static {v0}, Lcom/arist/service/MusicPlayService;->c(Lcom/arist/service/MusicPlayService;)Lcom/arist/service/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/service/o;->b()V

    iget-object v0, p0, Lcom/arist/service/k;->a:Lcom/arist/service/MusicPlayService;

    invoke-static {v0}, Lcom/arist/service/MusicPlayService;->d(Lcom/arist/service/MusicPlayService;)Landroid/media/AudioManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    goto/16 :goto_0

    :cond_a
    sget-object v0, Lcom/arist/c/a;->h:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/arist/service/k;->a:Lcom/arist/service/MusicPlayService;

    invoke-static {v0}, Lcom/arist/service/MusicPlayService;->e(Lcom/arist/service/MusicPlayService;)V

    goto/16 :goto_0

    :cond_b
    sget-object v0, Lcom/arist/c/a;->k:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/arist/service/MusicPlayService;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    sget-object v0, Lcom/arist/service/MusicPlayService;->a:Ljava/util/ArrayList;

    invoke-static {}, Lcom/arist/activity/MyApplication;->f()Lcom/arist/b/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_0
.end method
