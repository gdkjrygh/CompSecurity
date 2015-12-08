.class public Lcom/roidapp/photogrid/video/MusicPlayerService;
.super Landroid/app/Service;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;
.implements Landroid/media/MediaPlayer$OnErrorListener;
.implements Landroid/media/MediaPlayer$OnInfoListener;
.implements Landroid/media/MediaPlayer$OnPreparedListener;


# instance fields
.field private final a:Landroid/os/IBinder;

.field private b:Landroid/media/MediaPlayer;

.field private c:Landroid/os/HandlerThread;

.field private d:Landroid/os/Handler;

.field private e:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 23
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 36
    new-instance v0, Lcom/roidapp/photogrid/video/k;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/video/k;-><init>(Lcom/roidapp/photogrid/video/MusicPlayerService;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->a:Landroid/os/IBinder;

    .line 38
    iput-object v1, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->b:Landroid/media/MediaPlayer;

    .line 39
    iput-object v1, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->c:Landroid/os/HandlerThread;

    .line 40
    iput-object v1, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->d:Landroid/os/Handler;

    .line 98
    new-instance v0, Lcom/roidapp/photogrid/video/i;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/video/i;-><init>(Lcom/roidapp/photogrid/video/MusicPlayerService;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->e:Landroid/content/BroadcastReceiver;

    .line 243
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/video/MusicPlayerService;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->d:Landroid/os/Handler;

    return-object v0
.end method

.method private declared-synchronized a()V
    .locals 4

    .prologue
    .line 219
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->b:Landroid/media/MediaPlayer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    .line 241
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 221
    :cond_1
    :try_start_1
    iget-object v1, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->b:Landroid/media/MediaPlayer;

    .line 222
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->b:Landroid/media/MediaPlayer;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 224
    if-eqz v1, :cond_0

    .line 225
    const/4 v0, 0x0

    :try_start_2
    invoke-virtual {v1, v0}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 226
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 227
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/media/MediaPlayer;->setOnBufferingUpdateListener(Landroid/media/MediaPlayer$OnBufferingUpdateListener;)V

    .line 228
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/media/MediaPlayer;->setOnInfoListener(Landroid/media/MediaPlayer$OnInfoListener;)V

    .line 229
    invoke-virtual {v1}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 230
    invoke-virtual {v1}, Landroid/media/MediaPlayer;->stop()V

    .line 231
    :cond_2
    invoke-static {}, Lcom/roidapp/baselib/c/t;->b()Ljava/util/concurrent/AbstractExecutorService;

    move-result-object v0

    new-instance v2, Lcom/roidapp/photogrid/video/l;

    invoke-direct {v2, p0, v1}, Lcom/roidapp/photogrid/video/l;-><init>(Lcom/roidapp/photogrid/video/MusicPlayerService;Landroid/media/MediaPlayer;)V

    invoke-virtual {v0, v2}, Ljava/util/concurrent/AbstractExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 235
    :catch_0
    move-exception v0

    .line 236
    :try_start_3
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "System Player Error:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    if-eqz v1, :cond_0

    .line 238
    invoke-static {}, Lcom/roidapp/baselib/c/t;->b()Ljava/util/concurrent/AbstractExecutorService;

    move-result-object v0

    new-instance v2, Lcom/roidapp/photogrid/video/l;

    invoke-direct {v2, p0, v1}, Lcom/roidapp/photogrid/video/l;-><init>(Lcom/roidapp/photogrid/video/MusicPlayerService;Landroid/media/MediaPlayer;)V

    invoke-virtual {v0, v2}, Ljava/util/concurrent/AbstractExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 219
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/video/MusicPlayerService;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/video/MusicPlayerService;->a(Ljava/lang/String;)V

    return-void
.end method

.method private declared-synchronized a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 188
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/MusicPlayerService;->a()V

    .line 189
    iget-object v0, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->b:Landroid/media/MediaPlayer;

    if-nez v0, :cond_0

    .line 190
    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->b:Landroid/media/MediaPlayer;

    .line 191
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    .line 192
    iget-object v0, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 193
    iget-object v0, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 194
    iget-object v0, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnInfoListener(Landroid/media/MediaPlayer$OnInfoListener;)V

    .line 195
    iget-object v0, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 197
    const-string v0, "http://"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 198
    iget-object v0, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->b:Landroid/media/MediaPlayer;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    .line 202
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepareAsync()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 214
    :goto_1
    monitor-exit p0

    return-void

    .line 200
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 204
    :catch_0
    move-exception v0

    .line 205
    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "System Player Error:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 207
    :try_start_3
    iget-object v0, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->b:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_2

    .line 208
    iget-object v0, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 212
    :cond_2
    :goto_2
    const/4 v0, 0x0

    :try_start_4
    iput-object v0, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->b:Landroid/media/MediaPlayer;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_1

    .line 188
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :catch_1
    move-exception v0

    goto :goto_2
.end method

.method static synthetic b(Lcom/roidapp/photogrid/video/MusicPlayerService;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/MusicPlayerService;->a()V

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 95
    iget-object v0, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->a:Landroid/os/IBinder;

    return-object v0
.end method

.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 2

    .prologue
    .line 179
    .line 2273
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/MusicPlayerService;->a()V

    .line 180
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 181
    const-string v1, "MusicPlayerServic.onComplete"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 182
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/video/MusicPlayerService;->sendBroadcast(Landroid/content/Intent;)V

    .line 183
    return-void
.end method

.method public onCreate()V
    .locals 4

    .prologue
    .line 133
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 134
    const-string v1, "MusicPlayerService.PlayMusic"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 135
    const-string v1, "MusicPlayerService.StopMusic"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 137
    new-instance v1, Landroid/os/HandlerThread;

    const-string v2, "Music"

    invoke-direct {v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->c:Landroid/os/HandlerThread;

    .line 138
    iget-object v1, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->c:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->start()V

    .line 139
    new-instance v1, Landroid/os/Handler;

    iget-object v2, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->c:Landroid/os/HandlerThread;

    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v2

    new-instance v3, Lcom/roidapp/photogrid/video/j;

    invoke-direct {v3, p0}, Lcom/roidapp/photogrid/video/j;-><init>(Lcom/roidapp/photogrid/video/MusicPlayerService;)V

    invoke-direct {v1, v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v1, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->d:Landroid/os/Handler;

    .line 155
    iget-object v1, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->e:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v1, v0}, Lcom/roidapp/photogrid/video/MusicPlayerService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 156
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 166
    iget-object v0, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->d:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 167
    iget-object v0, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->d:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 168
    iget-object v0, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->d:Landroid/os/Handler;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->d:Landroid/os/Handler;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 169
    iget-object v0, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->c:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 170
    iput-object v3, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->d:Landroid/os/Handler;

    .line 171
    iput-object v3, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->c:Landroid/os/HandlerThread;

    .line 173
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/MusicPlayerService;->a()V

    .line 1273
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/MusicPlayerService;->a()V

    .line 175
    return-void
.end method

.method public onError(Landroid/media/MediaPlayer;II)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 45
    iget-object v1, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->b:Landroid/media/MediaPlayer;

    if-eq v1, p1, :cond_1

    .line 54
    :cond_0
    :goto_0
    return v0

    .line 47
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->b:Landroid/media/MediaPlayer;

    if-eqz v1, :cond_0

    .line 48
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/MusicPlayerService;->a()V

    .line 49
    new-instance v0, Landroid/content/Intent;

    const-string v1, "MusicPlayerService.onError"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 50
    const-string v1, "what"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 51
    const-string v1, "extra"

    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 52
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/video/MusicPlayerService;->sendBroadcast(Landroid/content/Intent;)V

    .line 54
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public onInfo(Landroid/media/MediaPlayer;II)Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 60
    iget-object v0, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->b:Landroid/media/MediaPlayer;

    if-eq v0, p1, :cond_1

    .line 68
    :cond_0
    :goto_0
    return v2

    .line 62
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->b:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 63
    new-instance v0, Landroid/content/Intent;

    const-string v1, "MusicPlayerService.onInfo"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 64
    const-string v1, "what"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 65
    const-string v1, "extra"

    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 66
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/video/MusicPlayerService;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method public onPrepared(Landroid/media/MediaPlayer;)V
    .locals 2

    .prologue
    .line 74
    iget-object v0, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->b:Landroid/media/MediaPlayer;

    if-eq v0, p1, :cond_1

    .line 81
    :cond_0
    :goto_0
    return-void

    .line 76
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->b:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 77
    iget-object v0, p0, Lcom/roidapp/photogrid/video/MusicPlayerService;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 78
    new-instance v0, Landroid/content/Intent;

    const-string v1, "MusicPlayerService.onPrepared"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 79
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/video/MusicPlayerService;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method public onStart(Landroid/content/Intent;I)V
    .locals 2

    .prologue
    .line 160
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "onStart() called, instance="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 161
    return-void
.end method
