.class public Lcom/arist/service/MusicPlayService;
.super Landroid/app/Service;
.source "MusicPlayService.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/arist/service/MusicPlayService$InCallListener;,
        Lcom/arist/service/MusicPlayService$MyReciever;,
        Lcom/arist/service/MusicPlayService$playControlReciever;
    }
.end annotation


# static fields
.field public static SongNamekeywords:[Ljava/lang/String;

.field private static musicList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/Music;",
            ">;"
        }
    .end annotation
.end field

.field public static sInstance:Lcom/arist/service/MusicPlayService;

.field private static final sWait:[Ljava/lang/Object;


# instance fields
.field private currentPosition:I

.field equizePreferService:Lyong/powerfull/equalizer/PreferenceService;

.field private handler:Landroid/os/Handler;

.field private lastBroadcastReceiveTime:J

.field private lastMusic:Lcom/arist/entity/Music;

.field public mCallListener:Lcom/arist/service/MusicPlayService$InCallListener;

.field public mEqualizer:Lyong/powerfull/equalizer/CompatEq;

.field private mReceiver:Lcom/arist/service/MusicPlayService$MyReciever;

.field private mSensorEventListener:Landroid/hardware/SensorEventListener;

.field private manager:Landroid/app/NotificationManager;

.field private musicComplet:Z

.field private nowCurr:I

.field private planeModeSet:I

.field private sensorManager:Landroid/hardware/SensorManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/arist/service/MusicPlayService;->musicList:Ljava/util/ArrayList;

    .line 60
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    sput-object v0, Lcom/arist/service/MusicPlayService;->sWait:[Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 41
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 48
    iput v2, p0, Lcom/arist/service/MusicPlayService;->nowCurr:I

    .line 51
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/arist/service/MusicPlayService;->lastBroadcastReceiveTime:J

    .line 268
    iput-boolean v2, p0, Lcom/arist/service/MusicPlayService;->musicComplet:Z

    .line 644
    new-instance v0, Lcom/arist/service/MusicPlayService$1;

    invoke-direct {v0, p0}, Lcom/arist/service/MusicPlayService$1;-><init>(Lcom/arist/service/MusicPlayService;)V

    iput-object v0, p0, Lcom/arist/service/MusicPlayService;->mSensorEventListener:Landroid/hardware/SensorEventListener;

    .line 41
    return-void
.end method

.method static synthetic access$0(Lcom/arist/service/MusicPlayService;)V
    .locals 0

    .prologue
    .line 597
    invoke-direct {p0}, Lcom/arist/service/MusicPlayService;->next()V

    return-void
.end method

.method static synthetic access$1(Lcom/arist/service/MusicPlayService;)V
    .locals 0

    .prologue
    .line 570
    invoke-direct {p0}, Lcom/arist/service/MusicPlayService;->previous()V

    return-void
.end method

.method static synthetic access$10(Lcom/arist/service/MusicPlayService;)V
    .locals 0

    .prologue
    .line 228
    invoke-direct {p0}, Lcom/arist/service/MusicPlayService;->startSleep()V

    return-void
.end method

.method static synthetic access$11(Lcom/arist/service/MusicPlayService;Z)V
    .locals 0

    .prologue
    .line 268
    iput-boolean p1, p0, Lcom/arist/service/MusicPlayService;->musicComplet:Z

    return-void
.end method

.method static synthetic access$12(Lcom/arist/service/MusicPlayService;)Landroid/app/NotificationManager;
    .locals 1

    .prologue
    .line 269
    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->manager:Landroid/app/NotificationManager;

    return-object v0
.end method

.method static synthetic access$2(Ljava/util/ArrayList;)V
    .locals 0

    .prologue
    .line 44
    sput-object p0, Lcom/arist/service/MusicPlayService;->musicList:Ljava/util/ArrayList;

    return-void
.end method

.method static synthetic access$3(Lcom/arist/service/MusicPlayService;)V
    .locals 0

    .prologue
    .line 489
    invoke-direct {p0}, Lcom/arist/service/MusicPlayService;->play()V

    return-void
.end method

.method static synthetic access$4(Lcom/arist/service/MusicPlayService;I)V
    .locals 0

    .prologue
    .line 48
    iput p1, p0, Lcom/arist/service/MusicPlayService;->nowCurr:I

    return-void
.end method

.method static synthetic access$5(Lcom/arist/service/MusicPlayService;)I
    .locals 1

    .prologue
    .line 48
    iget v0, p0, Lcom/arist/service/MusicPlayService;->nowCurr:I

    return v0
.end method

.method static synthetic access$6(Lcom/arist/service/MusicPlayService;)V
    .locals 0

    .prologue
    .line 627
    invoke-direct {p0}, Lcom/arist/service/MusicPlayService;->stopMediaPlayer()V

    return-void
.end method

.method static synthetic access$7(Lcom/arist/service/MusicPlayService;)J
    .locals 2

    .prologue
    .line 51
    iget-wide v0, p0, Lcom/arist/service/MusicPlayService;->lastBroadcastReceiveTime:J

    return-wide v0
.end method

.method static synthetic access$8(Lcom/arist/service/MusicPlayService;J)V
    .locals 1

    .prologue
    .line 51
    iput-wide p1, p0, Lcom/arist/service/MusicPlayService;->lastBroadcastReceiveTime:J

    return-void
.end method

.method static synthetic access$9(Lcom/arist/service/MusicPlayService;)Z
    .locals 1

    .prologue
    .line 250
    invoke-direct {p0}, Lcom/arist/service/MusicPlayService;->getHeadSetState()Z

    move-result v0

    return v0
.end method

.method public static get(Landroid/content/Context;)Lcom/arist/service/MusicPlayService;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 374
    sget-object v0, Lcom/arist/service/MusicPlayService;->sInstance:Lcom/arist/service/MusicPlayService;

    if-nez v0, :cond_0

    .line 375
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/arist/service/MusicPlayService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 377
    :goto_0
    sget-object v0, Lcom/arist/service/MusicPlayService;->sInstance:Lcom/arist/service/MusicPlayService;

    if-eqz v0, :cond_1

    .line 387
    :cond_0
    sget-object v0, Lcom/arist/service/MusicPlayService;->sInstance:Lcom/arist/service/MusicPlayService;

    return-object v0

    .line 379
    :cond_1
    :try_start_0
    sget-object v1, Lcom/arist/service/MusicPlayService;->sWait:[Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 380
    :try_start_1
    sget-object v0, Lcom/arist/service/MusicPlayService;->sWait:[Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V

    .line 379
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 382
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private getHeadSetState()Z
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 251
    new-instance v0, Ljava/io/File;

    const-string v4, "/sys/class/switch/h2w/state"

    invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 252
    .local v0, "file":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 254
    :try_start_0
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v4, Ljava/io/FileReader;

    invoke-direct {v4, v0}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 255
    .local v1, "in":Ljava/io/BufferedReader;
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    .line 256
    .local v2, "str":Ljava/lang/String;
    const-string v4, "1"

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v4

    if-eqz v4, :cond_0

    .line 258
    const/4 v3, 0x1

    .line 265
    .end local v1    # "in":Ljava/io/BufferedReader;
    .end local v2    # "str":Ljava/lang/String;
    :cond_0
    :goto_0
    return v3

    .line 262
    :catch_0
    move-exception v4

    goto :goto_0
.end method

.method public static hasInstance()Z
    .locals 1

    .prologue
    .line 394
    sget-object v0, Lcom/arist/service/MusicPlayService;->sInstance:Lcom/arist/service/MusicPlayService;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private next()V
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 598
    invoke-static {v0}, Lcom/arist/MusicPlayer/MyApplication;->setPlayNetMusic(Z)V

    .line 599
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getCurrentPosition()I

    move-result v1

    iput v1, p0, Lcom/arist/service/MusicPlayService;->currentPosition:I

    .line 600
    sget v1, Lcom/arist/MusicPlayer/MyApplication;->playMode:I

    packed-switch v1, :pswitch_data_0

    .line 623
    :cond_0
    :goto_0
    iget v0, p0, Lcom/arist/service/MusicPlayService;->currentPosition:I

    invoke-static {v0}, Lcom/arist/MusicPlayer/MyApplication;->setCurrentPosition(I)V

    .line 624
    invoke-direct {p0}, Lcom/arist/service/MusicPlayService;->play()V

    .line 625
    return-void

    .line 602
    :pswitch_0
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    sget-object v1, Lcom/arist/service/MusicPlayService;->musicList:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    iput v0, p0, Lcom/arist/service/MusicPlayService;->currentPosition:I

    goto :goto_0

    .line 605
    :pswitch_1
    iget v1, p0, Lcom/arist/service/MusicPlayService;->currentPosition:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/arist/service/MusicPlayService;->currentPosition:I

    sget-object v2, Lcom/arist/service/MusicPlayService;->musicList:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-le v1, v2, :cond_1

    :goto_1
    iput v0, p0, Lcom/arist/service/MusicPlayService;->currentPosition:I

    goto :goto_0

    .line 606
    :cond_1
    iget v0, p0, Lcom/arist/service/MusicPlayService;->currentPosition:I

    goto :goto_1

    .line 609
    :pswitch_2
    iget v1, p0, Lcom/arist/service/MusicPlayService;->currentPosition:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/arist/service/MusicPlayService;->currentPosition:I

    sget-object v2, Lcom/arist/service/MusicPlayService;->musicList:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-le v1, v2, :cond_0

    .line 610
    iput v0, p0, Lcom/arist/service/MusicPlayService;->currentPosition:I

    .line 611
    invoke-direct {p0}, Lcom/arist/service/MusicPlayService;->stopMediaPlayer()V

    goto :goto_0

    .line 616
    :pswitch_3
    iget-boolean v1, p0, Lcom/arist/service/MusicPlayService;->musicComplet:Z

    if-nez v1, :cond_0

    .line 619
    iget v1, p0, Lcom/arist/service/MusicPlayService;->currentPosition:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/arist/service/MusicPlayService;->currentPosition:I

    sget-object v2, Lcom/arist/service/MusicPlayService;->musicList:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-le v1, v2, :cond_2

    :goto_2
    iput v0, p0, Lcom/arist/service/MusicPlayService;->currentPosition:I

    goto :goto_0

    .line 620
    :cond_2
    iget v0, p0, Lcom/arist/service/MusicPlayService;->currentPosition:I

    goto :goto_2

    .line 600
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method private play()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x2

    .line 490
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setLooping(Z)V

    .line 491
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->musicList:Ljava/util/ArrayList;

    sput-object v0, Lcom/arist/service/MusicPlayService;->musicList:Ljava/util/ArrayList;

    .line 492
    sget-object v0, Lcom/arist/service/MusicPlayService;->musicList:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/arist/service/MusicPlayService;->musicList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 495
    :try_start_0
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getCurrentMusic()Lcom/arist/entity/Music;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/entity/Music;->getData()Ljava/lang/String;

    move-result-object v0

    .line 496
    iget-object v1, p0, Lcom/arist/service/MusicPlayService;->lastMusic:Lcom/arist/entity/Music;

    invoke-virtual {v1}, Lcom/arist/entity/Music;->getData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 497
    sget-object v0, Lcom/arist/service/MusicPlayService;->musicList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 499
    iget-boolean v0, p0, Lcom/arist/service/MusicPlayService;->musicComplet:Z

    if-eqz v0, :cond_3

    .line 500
    sget v0, Lcom/arist/MusicPlayer/MyApplication;->playMode:I

    if-ne v0, v2, :cond_3

    .line 501
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/arist/service/MusicPlayService;->musicComplet:Z

    .line 502
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 504
    :try_start_1
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 506
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getCurrentMusic()Lcom/arist/entity/Music;

    move-result-object v1

    invoke-virtual {v1}, Lcom/arist/entity/Music;->getData()Ljava/lang/String;

    move-result-object v1

    .line 505
    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 507
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V

    .line 508
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 509
    const/4 v0, 0x2

    sput v0, Lcom/arist/MusicPlayer/MyApplication;->status:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 544
    :cond_0
    :goto_0
    :try_start_2
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.MediaPlayer.action.STATUS_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/arist/service/MusicPlayService;->sendBroadcast(Landroid/content/Intent;)V

    .line 546
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.MediaPlayer.action.ALBUM_PIC_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/arist/service/MusicPlayService;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 551
    :cond_1
    :goto_1
    invoke-virtual {p0}, Lcom/arist/service/MusicPlayService;->startNotificationHandler()V

    .line 553
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getCurrentMusic()Lcom/arist/entity/Music;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 554
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getCurrentMusic()Lcom/arist/entity/Music;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/service/MusicPlayService;->lastMusic:Lcom/arist/entity/Music;

    .line 555
    :cond_2
    return-void

    .line 514
    :cond_3
    :try_start_3
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getInstance()Lcom/arist/MusicPlayer/MyApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/MusicPlayer/MyApplication;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 515
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 516
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 517
    const/4 v0, 0x3

    sput v0, Lcom/arist/MusicPlayer/MyApplication;->status:I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_0

    .line 547
    :catch_0
    move-exception v0

    goto :goto_1

    .line 523
    :cond_4
    :try_start_4
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 524
    const/4 v0, 0x2

    sput v0, Lcom/arist/MusicPlayer/MyApplication;->status:I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_0

    .line 525
    :catch_1
    move-exception v0

    goto :goto_0

    .line 532
    :cond_5
    :try_start_5
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    .line 533
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 534
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getCurrentMusic()Lcom/arist/entity/Music;

    move-result-object v1

    invoke-virtual {v1}, Lcom/arist/entity/Music;->getData()Ljava/lang/String;

    move-result-object v1

    .line 533
    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 535
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V

    .line 536
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 537
    const/4 v0, 0x2

    sput v0, Lcom/arist/MusicPlayer/MyApplication;->status:I

    .line 538
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.MediaPlayer.action.MUSIC_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/arist/service/MusicPlayService;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_0

    .line 540
    :catch_2
    move-exception v0

    goto :goto_0

    .line 510
    :catch_3
    move-exception v0

    goto :goto_0
.end method

.method private previous()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 571
    invoke-static {v1}, Lcom/arist/MusicPlayer/MyApplication;->setPlayNetMusic(Z)V

    .line 572
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getCurrentPosition()I

    move-result v0

    iput v0, p0, Lcom/arist/service/MusicPlayService;->currentPosition:I

    .line 573
    sget-object v0, Lcom/arist/service/MusicPlayService;->musicList:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/arist/service/MusicPlayService;->musicList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 574
    sget v0, Lcom/arist/MusicPlayer/MyApplication;->playMode:I

    packed-switch v0, :pswitch_data_0

    .line 591
    :cond_0
    :goto_0
    iget v0, p0, Lcom/arist/service/MusicPlayService;->currentPosition:I

    invoke-static {v0}, Lcom/arist/MusicPlayer/MyApplication;->setCurrentPosition(I)V

    .line 592
    invoke-direct {p0}, Lcom/arist/service/MusicPlayService;->play()V

    .line 594
    :cond_1
    return-void

    .line 576
    :pswitch_0
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    sget-object v1, Lcom/arist/service/MusicPlayService;->musicList:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    iput v0, p0, Lcom/arist/service/MusicPlayService;->currentPosition:I

    goto :goto_0

    .line 579
    :pswitch_1
    iget v0, p0, Lcom/arist/service/MusicPlayService;->currentPosition:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/arist/service/MusicPlayService;->currentPosition:I

    if-gez v0, :cond_2

    sget-object v0, Lcom/arist/service/MusicPlayService;->musicList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_1
    iput v0, p0, Lcom/arist/service/MusicPlayService;->currentPosition:I

    goto :goto_0

    .line 580
    :cond_2
    iget v0, p0, Lcom/arist/service/MusicPlayService;->currentPosition:I

    goto :goto_1

    .line 583
    :pswitch_2
    iget v0, p0, Lcom/arist/service/MusicPlayService;->currentPosition:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/arist/service/MusicPlayService;->currentPosition:I

    if-gez v0, :cond_0

    .line 584
    iput v1, p0, Lcom/arist/service/MusicPlayService;->currentPosition:I

    goto :goto_0

    .line 587
    :pswitch_3
    iget v0, p0, Lcom/arist/service/MusicPlayService;->currentPosition:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/arist/service/MusicPlayService;->currentPosition:I

    if-gez v0, :cond_3

    sget-object v0, Lcom/arist/service/MusicPlayService;->musicList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_2
    iput v0, p0, Lcom/arist/service/MusicPlayService;->currentPosition:I

    goto :goto_0

    .line 588
    :cond_3
    iget v0, p0, Lcom/arist/service/MusicPlayService;->currentPosition:I

    goto :goto_2

    .line 574
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method private startSleep()V
    .locals 5

    .prologue
    .line 230
    .line 231
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getDefaultSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v2

    const-string v3, "sleep_mode"

    const-string v4, "1"

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 230
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    iput v2, p0, Lcom/arist/service/MusicPlayService;->planeModeSet:I

    .line 232
    iget v2, p0, Lcom/arist/service/MusicPlayService;->planeModeSet:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    .line 235
    :try_start_0
    invoke-virtual {p0}, Lcom/arist/service/MusicPlayService;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 237
    .local v0, "cr":Landroid/content/ContentResolver;
    const-string v2, "airplane_mode_on"

    invoke-static {v0, v2}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v2

    .line 236
    if-nez v2, :cond_0

    .line 239
    const-string v2, "airplane_mode_on"

    const/4 v3, 0x1

    .line 238
    invoke-static {v0, v2, v3}, Landroid/provider/Settings$System;->putInt(Landroid/content/ContentResolver;Ljava/lang/String;I)Z

    .line 240
    new-instance v1, Landroid/content/Intent;

    .line 241
    const-string v2, "android.intent.action.AIRPLANE_MODE"

    .line 240
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 242
    .local v1, "onIntent":Landroid/content/Intent;
    invoke-virtual {p0, v1}, Lcom/arist/service/MusicPlayService;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 247
    .end local v0    # "cr":Landroid/content/ContentResolver;
    .end local v1    # "onIntent":Landroid/content/Intent;
    :cond_0
    :goto_0
    return-void

    .line 244
    :catch_0
    move-exception v2

    goto :goto_0
.end method

.method private stopMediaPlayer()V
    .locals 1

    .prologue
    .line 628
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    if-nez v0, :cond_0

    .line 639
    :goto_0
    return-void

    .line 630
    :cond_0
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-nez v0, :cond_1

    .line 632
    :try_start_0
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V

    .line 633
    const/4 v0, 0x1

    sput v0, Lcom/arist/MusicPlayer/MyApplication;->status:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 637
    :cond_1
    :goto_1
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 638
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    goto :goto_0

    .line 634
    :catch_0
    move-exception v0

    goto :goto_1
.end method


# virtual methods
.method public getindex(Ljava/lang/String;)I
    .locals 3
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 453
    const/4 v1, 0x0

    .line 454
    .local v1, "index":I
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    sget-object v2, Lcom/arist/service/MusicPlayService;->musicList:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lt v0, v2, :cond_0

    .line 460
    :goto_1
    return v1

    .line 455
    :cond_0
    sget-object v2, Lcom/arist/service/MusicPlayService;->musicList:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/arist/entity/Music;

    invoke-virtual {v2}, Lcom/arist/entity/Music;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 456
    move v1, v0

    .line 457
    goto :goto_1

    .line 454
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 86
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 20

    .prologue
    .line 274
    invoke-super/range {p0 .. p0}, Landroid/app/Service;->onCreate()V

    .line 277
    const/4 v2, 0x1

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/arist/service/MusicPlayService;->stopForeground(Z)V

    .line 278
    sget-object v2, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    if-nez v2, :cond_0

    .line 279
    new-instance v2, Landroid/media/MediaPlayer;

    invoke-direct {v2}, Landroid/media/MediaPlayer;-><init>()V

    sput-object v2, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 281
    :cond_0
    new-instance v2, Lcom/arist/service/MusicPlayService$MyReciever;

    const/4 v3, 0x0

    move-object/from16 v0, p0

    invoke-direct {v2, v0, v3}, Lcom/arist/service/MusicPlayService$MyReciever;-><init>(Lcom/arist/service/MusicPlayService;Lcom/arist/service/MusicPlayService$MyReciever;)V

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/arist/service/MusicPlayService;->mReceiver:Lcom/arist/service/MusicPlayService$MyReciever;

    .line 282
    sget-object v2, Lcom/arist/MusicPlayer/MyApplication;->musicList:Ljava/util/ArrayList;

    sput-object v2, Lcom/arist/service/MusicPlayService;->musicList:Ljava/util/ArrayList;

    .line 284
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getCurrentMusic()Lcom/arist/entity/Music;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 285
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getCurrentMusic()Lcom/arist/entity/Music;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/arist/service/MusicPlayService;->lastMusic:Lcom/arist/entity/Music;

    .line 291
    :goto_0
    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/arist/service/MusicPlayService;->handler:Landroid/os/Handler;

    .line 293
    const-string v2, "notification"

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/arist/service/MusicPlayService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/NotificationManager;

    .line 292
    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/arist/service/MusicPlayService;->manager:Landroid/app/NotificationManager;

    .line 295
    invoke-virtual/range {p0 .. p0}, Lcom/arist/service/MusicPlayService;->startNotificationHandler()V

    .line 298
    sget-object v2, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 299
    new-instance v3, Lcom/arist/service/MusicPlayService$2;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lcom/arist/service/MusicPlayService$2;-><init>(Lcom/arist/service/MusicPlayService;)V

    invoke-virtual {v2, v3}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 310
    :try_start_0
    new-instance v2, Lcom/arist/service/MusicPlayService$InCallListener;

    const/4 v3, 0x0

    move-object/from16 v0, p0

    invoke-direct {v2, v0, v3}, Lcom/arist/service/MusicPlayService$InCallListener;-><init>(Lcom/arist/service/MusicPlayService;Lcom/arist/service/MusicPlayService$InCallListener;)V

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/arist/service/MusicPlayService;->mCallListener:Lcom/arist/service/MusicPlayService$InCallListener;

    .line 311
    const-string v2, "phone"

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/arist/service/MusicPlayService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Landroid/telephony/TelephonyManager;

    .line 312
    .local v19, "telephonyManager":Landroid/telephony/TelephonyManager;
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/arist/service/MusicPlayService;->mCallListener:Lcom/arist/service/MusicPlayService$InCallListener;

    .line 313
    const/16 v3, 0x20

    .line 312
    move-object/from16 v0, v19

    invoke-virtual {v0, v2, v3}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_3

    .line 319
    .end local v19    # "telephonyManager":Landroid/telephony/TelephonyManager;
    :goto_1
    new-instance v2, Lyong/powerfull/equalizer/PreferenceService;

    .line 320
    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Lyong/powerfull/equalizer/PreferenceService;-><init>(Landroid/content/Context;)V

    .line 319
    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/arist/service/MusicPlayService;->equizePreferService:Lyong/powerfull/equalizer/PreferenceService;

    .line 321
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/arist/service/MusicPlayService;->equizePreferService:Lyong/powerfull/equalizer/PreferenceService;

    invoke-virtual {v2}, Lyong/powerfull/equalizer/PreferenceService;->getPreferences00()Ljava/util/Map;

    move-result-object v14

    .line 322
    .local v14, "params00":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/arist/service/MusicPlayService;->equizePreferService:Lyong/powerfull/equalizer/PreferenceService;

    invoke-virtual {v2}, Lyong/powerfull/equalizer/PreferenceService;->getPreferences01()Ljava/util/Map;

    move-result-object v15

    .line 323
    .local v15, "params11":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/arist/service/MusicPlayService;->equizePreferService:Lyong/powerfull/equalizer/PreferenceService;

    invoke-virtual {v2}, Lyong/powerfull/equalizer/PreferenceService;->getPreferences02()Ljava/util/Map;

    move-result-object v16

    .line 324
    .local v16, "params22":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/arist/service/MusicPlayService;->equizePreferService:Lyong/powerfull/equalizer/PreferenceService;

    invoke-virtual {v2}, Lyong/powerfull/equalizer/PreferenceService;->getPreferences03()Ljava/util/Map;

    move-result-object v17

    .line 325
    .local v17, "params33":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/arist/service/MusicPlayService;->equizePreferService:Lyong/powerfull/equalizer/PreferenceService;

    invoke-virtual {v2}, Lyong/powerfull/equalizer/PreferenceService;->getPreferences04()Ljava/util/Map;

    move-result-object v18

    .line 327
    .local v18, "params44":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const/4 v3, 0x0

    const-string v2, "progress0"

    invoke-interface {v14, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v3, v2}, Lyong/powerfull/equalizer/EquzeHelper;->setEe(II)V

    .line 328
    const/4 v3, 0x1

    const-string v2, "progress1"

    invoke-interface {v15, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v3, v2}, Lyong/powerfull/equalizer/EquzeHelper;->setEe(II)V

    .line 329
    const/4 v3, 0x2

    const-string v2, "progress2"

    move-object/from16 v0, v16

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v3, v2}, Lyong/powerfull/equalizer/EquzeHelper;->setEe(II)V

    .line 330
    const/4 v3, 0x3

    const-string v2, "progress3"

    move-object/from16 v0, v17

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v3, v2}, Lyong/powerfull/equalizer/EquzeHelper;->setEe(II)V

    .line 331
    const/4 v3, 0x4

    const-string v2, "progress4"

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v3, v2}, Lyong/powerfull/equalizer/EquzeHelper;->setEe(II)V

    .line 333
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x9

    if-lt v2, v3, :cond_1

    .line 335
    :try_start_1
    new-instance v2, Lyong/powerfull/equalizer/CompatEq;

    sget-object v3, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-direct {v2, v3}, Lyong/powerfull/equalizer/CompatEq;-><init>(Landroid/media/MediaPlayer;)V

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/arist/service/MusicPlayService;->mEqualizer:Lyong/powerfull/equalizer/CompatEq;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_2

    .line 338
    :try_start_2
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/arist/service/MusicPlayService;->mEqualizer:Lyong/powerfull/equalizer/CompatEq;

    const/4 v3, 0x0

    .line 339
    const/4 v4, 0x0

    invoke-static {v4}, Lyong/powerfull/equalizer/EquzeHelper;->getEe(I)I

    move-result v4

    int-to-short v4, v4

    .line 338
    invoke-virtual {v2, v3, v4}, Lyong/powerfull/equalizer/CompatEq;->setBandLevel(SS)V

    .line 340
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/arist/service/MusicPlayService;->mEqualizer:Lyong/powerfull/equalizer/CompatEq;

    const/4 v3, 0x1

    .line 341
    const/4 v4, 0x1

    invoke-static {v4}, Lyong/powerfull/equalizer/EquzeHelper;->getEe(I)I

    move-result v4

    int-to-short v4, v4

    .line 340
    invoke-virtual {v2, v3, v4}, Lyong/powerfull/equalizer/CompatEq;->setBandLevel(SS)V

    .line 342
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/arist/service/MusicPlayService;->mEqualizer:Lyong/powerfull/equalizer/CompatEq;

    const/4 v3, 0x2

    .line 343
    const/4 v4, 0x2

    invoke-static {v4}, Lyong/powerfull/equalizer/EquzeHelper;->getEe(I)I

    move-result v4

    int-to-short v4, v4

    .line 342
    invoke-virtual {v2, v3, v4}, Lyong/powerfull/equalizer/CompatEq;->setBandLevel(SS)V

    .line 344
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/arist/service/MusicPlayService;->mEqualizer:Lyong/powerfull/equalizer/CompatEq;

    const/4 v3, 0x3

    .line 345
    const/4 v4, 0x3

    invoke-static {v4}, Lyong/powerfull/equalizer/EquzeHelper;->getEe(I)I

    move-result v4

    int-to-short v4, v4

    .line 344
    invoke-virtual {v2, v3, v4}, Lyong/powerfull/equalizer/CompatEq;->setBandLevel(SS)V

    .line 346
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/arist/service/MusicPlayService;->mEqualizer:Lyong/powerfull/equalizer/CompatEq;

    const/4 v3, 0x4

    .line 347
    const/4 v4, 0x4

    invoke-static {v4}, Lyong/powerfull/equalizer/EquzeHelper;->getEe(I)I

    move-result v4

    int-to-short v4, v4

    .line 346
    invoke-virtual {v2, v3, v4}, Lyong/powerfull/equalizer/CompatEq;->setBandLevel(SS)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_2 .. :try_end_2} :catch_2

    .line 364
    :cond_1
    :goto_2
    sput-object p0, Lcom/arist/service/MusicPlayService;->sInstance:Lcom/arist/service/MusicPlayService;

    .line 365
    sget-object v3, Lcom/arist/service/MusicPlayService;->sWait:[Ljava/lang/Object;

    monitor-enter v3

    .line 366
    :try_start_3
    sget-object v2, Lcom/arist/service/MusicPlayService;->sWait:[Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    .line 365
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 368
    return-void

    .line 287
    .end local v14    # "params00":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v15    # "params11":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v16    # "params22":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v17    # "params33":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v18    # "params44":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    :cond_2
    new-instance v2, Lcom/arist/entity/Music;

    const/16 v3, 0x2b67

    const-string v4, "title"

    const-string v5, "dataLast"

    const-wide/16 v6, 0x6f

    const/16 v8, 0x6f

    .line 288
    const-string v9, "albumTest"

    const/16 v10, 0xb

    const-string v11, "11"

    const-string v12, "11"

    invoke-direct/range {v2 .. v12}, Lcom/arist/entity/Music;-><init>(ILjava/lang/String;Ljava/lang/String;JILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 287
    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/arist/service/MusicPlayService;->lastMusic:Lcom/arist/entity/Music;

    goto/16 :goto_0

    .line 349
    .restart local v14    # "params00":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    .restart local v15    # "params11":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    .restart local v16    # "params22":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    .restart local v17    # "params33":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    .restart local v18    # "params44":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    :catch_0
    move-exception v13

    .line 350
    .local v13, "e":Ljava/lang/Exception;
    :try_start_4
    invoke-virtual {v13}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_2

    .line 353
    .end local v13    # "e":Ljava/lang/Exception;
    :catch_1
    move-exception v13

    .line 354
    .local v13, "e":Ljava/lang/IllegalArgumentException;
    invoke-virtual/range {p0 .. p0}, Lcom/arist/service/MusicPlayService;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    .line 355
    const-string v3, "Does not support this device"

    const/4 v4, 0x1

    .line 354
    invoke-static {v2, v3, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    .line 356
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    goto :goto_2

    .line 357
    .end local v13    # "e":Ljava/lang/IllegalArgumentException;
    :catch_2
    move-exception v13

    .line 358
    .local v13, "e":Ljava/lang/UnsupportedOperationException;
    invoke-virtual/range {p0 .. p0}, Lcom/arist/service/MusicPlayService;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    .line 359
    const-string v3, "The device does not support the Equalizer function"

    .line 360
    const/4 v4, 0x1

    .line 358
    invoke-static {v2, v3, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    .line 360
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    goto :goto_2

    .line 365
    .end local v13    # "e":Ljava/lang/UnsupportedOperationException;
    :catchall_0
    move-exception v2

    :try_start_5
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v2

    .line 314
    .end local v14    # "params00":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v15    # "params11":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v16    # "params22":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v17    # "params33":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v18    # "params44":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    :catch_3
    move-exception v2

    goto/16 :goto_1
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 441
    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->mReceiver:Lcom/arist/service/MusicPlayService$MyReciever;

    invoke-virtual {p0, v0}, Lcom/arist/service/MusicPlayService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 442
    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->sensorManager:Landroid/hardware/SensorManager;

    if-eqz v0, :cond_0

    .line 443
    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->sensorManager:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/arist/service/MusicPlayService;->mSensorEventListener:Landroid/hardware/SensorEventListener;

    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 444
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/arist/service/MusicPlayService;->sensorManager:Landroid/hardware/SensorManager;

    .line 446
    :cond_0
    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->manager:Landroid/app/NotificationManager;

    if-eqz v0, :cond_1

    .line 447
    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->manager:Landroid/app/NotificationManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

    .line 448
    :cond_1
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 449
    return-void
.end method

.method public onStart(Landroid/content/Intent;I)V
    .locals 6
    .param p1, "intent"    # Landroid/content/Intent;
    .param p2, "startId"    # I

    .prologue
    .line 400
    invoke-super {p0, p1, p2}, Landroid/app/Service;->onStart(Landroid/content/Intent;I)V

    .line 402
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 403
    .local v0, "filter":Landroid/content/IntentFilter;
    const-string v2, "com.MediaPlayer.action.PLAY"

    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 404
    const-string v2, "com.MediaPlayer.action.NET_PLAY"

    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 405
    const-string v2, "com.MediaPlayer.action.DESTORY"

    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 406
    const-string v2, "com.MediaPlayer.action.SEEK"

    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 407
    const-string v2, "com.MediaPlayer.action.PREVIOUS"

    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 408
    const-string v2, "com.MediaPlayer.action.NEXT"

    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 409
    const-string v2, "com.MediaPlayer.action.MEDIA_BUTTON_PRESSED"

    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 410
    const-string v2, "android.intent.action.HEADSET_PLUG"

    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 411
    const-string v2, "com.MediaPlayer.action.START_SLEEP"

    invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 412
    iget-object v2, p0, Lcom/arist/service/MusicPlayService;->mReceiver:Lcom/arist/service/MusicPlayService$MyReciever;

    invoke-virtual {p0, v2, v0}, Lcom/arist/service/MusicPlayService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 415
    const-string v2, "sensor"

    invoke-virtual {p0, v2}, Lcom/arist/service/MusicPlayService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/hardware/SensorManager;

    iput-object v2, p0, Lcom/arist/service/MusicPlayService;->sensorManager:Landroid/hardware/SensorManager;

    .line 416
    iget-object v2, p0, Lcom/arist/service/MusicPlayService;->sensorManager:Landroid/hardware/SensorManager;

    iget-object v3, p0, Lcom/arist/service/MusicPlayService;->mSensorEventListener:Landroid/hardware/SensorEventListener;

    .line 417
    iget-object v4, p0, Lcom/arist/service/MusicPlayService;->sensorManager:Landroid/hardware/SensorManager;

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v4

    .line 418
    const/4 v5, 0x3

    .line 416
    invoke-virtual {v2, v3, v4, v5}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 421
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getDefaultSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v2

    .line 422
    const-string v3, "play_music"

    const/4 v4, 0x0

    .line 421
    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    .line 423
    .local v1, "play":Z
    if-eqz v1, :cond_0

    .line 425
    :try_start_0
    sget-object v2, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 426
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getCurrentMusic()Lcom/arist/entity/Music;

    move-result-object v3

    invoke-virtual {v3}, Lcom/arist/entity/Music;->getData()Ljava/lang/String;

    move-result-object v3

    .line 425
    invoke-virtual {v2, v3}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 427
    sget-object v2, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v2}, Landroid/media/MediaPlayer;->prepare()V

    .line 428
    sget-object v2, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    sget v3, Lcom/arist/MusicPlayer/MyApplication;->musicProgress:I

    invoke-virtual {v2, v3}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 429
    sget-object v2, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v2}, Landroid/media/MediaPlayer;->start()V

    .line 430
    const/4 v2, 0x2

    sput v2, Lcom/arist/MusicPlayer/MyApplication;->status:I

    .line 432
    new-instance v2, Landroid/content/Intent;

    const-string v3, "com.MediaPlayer.action.MUSIC_CHANGED"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v2}, Lcom/arist/service/MusicPlayService;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 436
    :cond_0
    :goto_0
    return-void

    .line 433
    :catch_0
    move-exception v2

    goto :goto_0
.end method

.method public playNetMusic(Lcom/yong/jamendo/api/JamendoMusic;)V
    .locals 2
    .param p1, "netMusic"    # Lcom/yong/jamendo/api/JamendoMusic;

    .prologue
    .line 466
    :try_start_0
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    .line 467
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {p1}, Lcom/yong/jamendo/api/JamendoMusic;->getAudio_link()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 468
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepareAsync()V

    .line 469
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 470
    new-instance v1, Lcom/arist/service/MusicPlayService$3;

    invoke-direct {v1, p0}, Lcom/arist/service/MusicPlayService$3;-><init>(Lcom/arist/service/MusicPlayService;)V

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 484
    :goto_0
    return-void

    .line 482
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public startNotificationHandler()V
    .locals 4

    .prologue
    .line 558
    iget-object v0, p0, Lcom/arist/service/MusicPlayService;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/arist/service/MusicPlayService$4;

    invoke-direct {v1, p0}, Lcom/arist/service/MusicPlayService$4;-><init>(Lcom/arist/service/MusicPlayService;)V

    .line 566
    const-wide/16 v2, 0x64

    .line 558
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 567
    return-void
.end method
