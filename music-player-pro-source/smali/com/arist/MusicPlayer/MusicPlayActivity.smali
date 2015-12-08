.class public Lcom/arist/MusicPlayer/MusicPlayActivity;
.super Landroid/app/Activity;
.source "MusicPlayActivity.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/arist/MusicPlayer/MusicPlayActivity$MyReciever;
    }
.end annotation


# instance fields
.field private ablamImage:Landroid/widget/ImageView;

.field private btnNext:Landroid/widget/ImageButton;

.field private btnPlay:Landroid/widget/ImageButton;

.field private btnPlayList:Landroid/widget/ImageButton;

.field private btnPlayMode:Landroid/widget/ImageButton;

.field private btnPrevious:Landroid/widget/ImageButton;

.field private files:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field private handler:Landroid/os/Handler;

.field handlerUpdateSeekBar:Landroid/os/Handler;

.field private index:I

.field private isFront:Z

.field private layout:Landroid/widget/RelativeLayout;

.field private lrcRead:Lcom/arist/util/LrcRead;

.field private lyricCurrentTime:I

.field private lyricList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/Lyric;",
            ">;"
        }
    .end annotation
.end field

.field private lyricPath:Ljava/lang/String;

.field lyricRunnable:Ljava/lang/Runnable;

.field private lyricTotalTime:I

.field private lyricView:Lcom/arist/MyView/LyricView;

.field mReciever:Lcom/arist/MusicPlayer/MusicPlayActivity$MyReciever;

.field private mSeekBarChangeListener:Landroid/widget/SeekBar$OnSeekBarChangeListener;

.field private musicProgress:Landroid/widget/SeekBar;

.field private playModeArr:[I

.field private playModeStrArr:[Ljava/lang/String;

.field private tvCurrentTime:Landroid/widget/TextView;

.field private tvMusicArtist:Landroid/widget/TextView;

.field private tvMusicName:Landroid/widget/TextView;

.field private tvTotalTime:Landroid/widget/TextView;

.field updateSeekBarThread:Ljava/lang/Runnable;

.field private visualizer:Lyong/powerfull/equalizer/VisualizerView;


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x4

    const/4 v1, 0x0

    .line 46
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 61
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->handlerUpdateSeekBar:Landroid/os/Handler;

    .line 62
    new-instance v0, Lcom/arist/MusicPlayer/MusicPlayActivity$1;

    invoke-direct {v0, p0}, Lcom/arist/MusicPlayer/MusicPlayActivity$1;-><init>(Lcom/arist/MusicPlayer/MusicPlayActivity;)V

    iput-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->updateSeekBarThread:Ljava/lang/Runnable;

    .line 108
    new-instance v0, Lcom/arist/MusicPlayer/MusicPlayActivity$2;

    invoke-direct {v0, p0}, Lcom/arist/MusicPlayer/MusicPlayActivity$2;-><init>(Lcom/arist/MusicPlayer/MusicPlayActivity;)V

    iput-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->mSeekBarChangeListener:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    .line 141
    iput v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricCurrentTime:I

    .line 142
    iput v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricTotalTime:I

    .line 144
    iput v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->index:I

    .line 251
    iput-boolean v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->isFront:Z

    .line 252
    new-instance v0, Lcom/arist/MusicPlayer/MusicPlayActivity$3;

    invoke-direct {v0, p0}, Lcom/arist/MusicPlayer/MusicPlayActivity$3;-><init>(Lcom/arist/MusicPlayer/MusicPlayActivity;)V

    iput-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricRunnable:Ljava/lang/Runnable;

    .line 267
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->mReciever:Lcom/arist/MusicPlayer/MusicPlayActivity$MyReciever;

    .line 328
    new-array v0, v2, [I

    fill-array-data v0, :array_0

    .line 330
    iput-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->playModeArr:[I

    .line 331
    new-array v0, v2, [Ljava/lang/String;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->playModeStrArr:[Ljava/lang/String;

    .line 46
    return-void

    .line 328
    :array_0
    .array-data 4
        0x7f020047
        0x7f02004a
        0x7f020046
        0x7f02004c
    .end array-data
.end method

.method static synthetic access$0(Lcom/arist/MusicPlayer/MusicPlayActivity;)Landroid/widget/SeekBar;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->musicProgress:Landroid/widget/SeekBar;

    return-object v0
.end method

.method static synthetic access$1(Lcom/arist/MusicPlayer/MusicPlayActivity;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->tvTotalTime:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$10(Lcom/arist/MusicPlayer/MusicPlayActivity;)V
    .locals 0

    .prologue
    .line 377
    invoke-direct {p0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->doPlayNext()V

    return-void
.end method

.method static synthetic access$11(Lcom/arist/MusicPlayer/MusicPlayActivity;)[Ljava/lang/String;
    .locals 1

    .prologue
    .line 331
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->playModeStrArr:[Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$12(Lcom/arist/MusicPlayer/MusicPlayActivity;)Landroid/widget/ImageButton;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->btnPlayMode:Landroid/widget/ImageButton;

    return-object v0
.end method

.method static synthetic access$13(Lcom/arist/MusicPlayer/MusicPlayActivity;)[I
    .locals 1

    .prologue
    .line 328
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->playModeArr:[I

    return-object v0
.end method

.method static synthetic access$14(Lcom/arist/MusicPlayer/MusicPlayActivity;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 386
    invoke-direct {p0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->findLyric()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$15(Lcom/arist/MusicPlayer/MusicPlayActivity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 205
    iput-object p1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricPath:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$16(Lcom/arist/MusicPlayer/MusicPlayActivity;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 205
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricPath:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$17(Lcom/arist/MusicPlayer/MusicPlayActivity;Ljava/util/ArrayList;)V
    .locals 0

    .prologue
    .line 145
    iput-object p1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricList:Ljava/util/ArrayList;

    return-void
.end method

.method static synthetic access$18(Lcom/arist/MusicPlayer/MusicPlayActivity;)Lcom/arist/util/LrcRead;
    .locals 1

    .prologue
    .line 143
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->lrcRead:Lcom/arist/util/LrcRead;

    return-object v0
.end method

.method static synthetic access$19(Lcom/arist/MusicPlayer/MusicPlayActivity;)V
    .locals 0

    .prologue
    .line 428
    invoke-direct {p0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->setLyric()V

    return-void
.end method

.method static synthetic access$2(Lcom/arist/MusicPlayer/MusicPlayActivity;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->tvCurrentTime:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$3(Lcom/arist/MusicPlayer/MusicPlayActivity;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 145
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricList:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$4(Lcom/arist/MusicPlayer/MusicPlayActivity;)Lcom/arist/MyView/LyricView;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricView:Lcom/arist/MyView/LyricView;

    return-object v0
.end method

.method static synthetic access$5(Lcom/arist/MusicPlayer/MusicPlayActivity;)Z
    .locals 1

    .prologue
    .line 251
    iget-boolean v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->isFront:Z

    return v0
.end method

.method static synthetic access$6(Lcom/arist/MusicPlayer/MusicPlayActivity;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 204
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->handler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$7(Lcom/arist/MusicPlayer/MusicPlayActivity;)V
    .locals 0

    .prologue
    .line 334
    invoke-direct {p0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->updateView()V

    return-void
.end method

.method static synthetic access$8(Lcom/arist/MusicPlayer/MusicPlayActivity;)V
    .locals 0

    .prologue
    .line 365
    invoke-direct {p0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->doPlay()V

    return-void
.end method

.method static synthetic access$9(Lcom/arist/MusicPlayer/MusicPlayActivity;)V
    .locals 0

    .prologue
    .line 371
    invoke-direct {p0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->doPlayPre()V

    return-void
.end method

.method private doPlay()V
    .locals 2

    .prologue
    .line 366
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 367
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "com.MediaPlayer.action.PLAY"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 368
    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->sendBroadcast(Landroid/content/Intent;)V

    .line 369
    return-void
.end method

.method private doPlayNext()V
    .locals 2

    .prologue
    .line 378
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 379
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "com.MediaPlayer.action.NEXT"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 380
    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->sendBroadcast(Landroid/content/Intent;)V

    .line 381
    return-void
.end method

.method private doPlayPre()V
    .locals 2

    .prologue
    .line 372
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 373
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "com.MediaPlayer.action.PREVIOUS"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 374
    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->sendBroadcast(Landroid/content/Intent;)V

    .line 375
    return-void
.end method

.method private findLyric()Ljava/lang/String;
    .locals 4

    .prologue
    .line 387
    const/4 v1, 0x0

    .line 388
    .local v1, "path":Ljava/lang/String;
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getMusicTitle()Ljava/lang/String;

    move-result-object v0

    .line 390
    .local v0, "musicTitle":Ljava/lang/String;
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->files:Ljava/util/ArrayList;

    .line 391
    iget-object v2, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->lrcRead:Lcom/arist/util/LrcRead;

    invoke-virtual {v2, v0}, Lcom/arist/util/LrcRead;->findLyric(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    iput-object v2, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->files:Ljava/util/ArrayList;

    .line 392
    iget-object v2, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->files:Ljava/util/ArrayList;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->files:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_0

    .line 393
    iget-object v2, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->files:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    .line 394
    const-string v2, "info"

    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 396
    :cond_0
    return-object v1
.end method

.method private setLyric()V
    .locals 3

    .prologue
    const/16 v2, 0xff

    .line 429
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricView:Lcom/arist/MyView/LyricView;

    sget-object v1, Lcom/arist/MusicPlayer/MyApplication;->musicPref:Lcom/arist/util/MusicPreference;

    invoke-virtual {v1}, Lcom/arist/util/MusicPreference;->getLrcSize()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/arist/MyView/LyricView;->setTextSize(F)V

    .line 430
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->musicPref:Lcom/arist/util/MusicPreference;

    const/16 v1, 0x64

    invoke-static {v1, v2, v2, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/util/MusicPreference;->saveLrcColor(I)V

    .line 431
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricView:Lcom/arist/MyView/LyricView;

    sget-object v1, Lcom/arist/MusicPlayer/MyApplication;->musicPref:Lcom/arist/util/MusicPreference;

    invoke-virtual {v1}, Lcom/arist/util/MusicPreference;->getLrcColor()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/MyView/LyricView;->setColor(I)V

    .line 432
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->musicPref:Lcom/arist/util/MusicPreference;

    invoke-static {v2, v2, v2, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/util/MusicPreference;->saveHightLightColor(I)V

    .line 434
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricView:Lcom/arist/MyView/LyricView;

    .line 435
    sget-object v1, Lcom/arist/MusicPlayer/MyApplication;->musicPref:Lcom/arist/util/MusicPreference;

    invoke-virtual {v1}, Lcom/arist/util/MusicPreference;->getHighLightColor()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/MyView/LyricView;->setHighlightColor(I)V

    .line 436
    return-void
.end method

.method private updateView()V
    .locals 5

    .prologue
    .line 335
    iget-object v2, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->tvMusicName:Landroid/widget/TextView;

    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getMusicTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 336
    iget-object v2, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->tvMusicArtist:Landroid/widget/TextView;

    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getMusicArtist()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 338
    iget-object v2, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->musicProgress:Landroid/widget/SeekBar;

    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getMusicDuration()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setMax(I)V

    .line 339
    iget-object v2, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->musicProgress:Landroid/widget/SeekBar;

    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getMusicProgress()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 343
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getCurrentMusic()Lcom/arist/entity/Music;

    move-result-object v2

    .line 342
    invoke-static {v2}, Lcom/arist/util/AlbumPicUtil;->getAlbumBitmap(Lcom/arist/entity/Music;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 344
    .local v1, "bmpSource":Landroid/graphics/Bitmap;
    const/4 v0, 0x0

    .line 346
    .local v0, "bmpReflect":Landroid/graphics/Bitmap;
    if-eqz v1, :cond_0

    .line 347
    invoke-static {v1}, Lcom/arist/util/AlbumPicUtil;->createReflectedImage(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 348
    iget-object v2, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->ablamImage:Landroid/widget/ImageView;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 357
    :goto_0
    sget v2, Lcom/arist/MusicPlayer/MyApplication;->status:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 358
    iget-object v2, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->btnPlay:Landroid/widget/ImageButton;

    const v3, 0x7f020050

    invoke-virtual {v2, v3}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 362
    :goto_1
    iget-object v2, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->btnPlayMode:Landroid/widget/ImageButton;

    iget-object v3, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->playModeArr:[I

    sget v4, Lcom/arist/MusicPlayer/MyApplication;->playMode:I

    add-int/lit8 v4, v4, -0x1

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 363
    return-void

    .line 350
    :cond_0
    invoke-virtual {p0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 351
    const v3, 0x7f020017

    .line 350
    invoke-static {v2, v3}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 352
    invoke-static {v1}, Lcom/arist/util/AlbumPicUtil;->createReflectedImage(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 353
    iget-object v2, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->ablamImage:Landroid/widget/ImageView;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 360
    :cond_1
    iget-object v2, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->btnPlay:Landroid/widget/ImageButton;

    const v3, 0x7f020052

    invoke-virtual {v2, v3}, Landroid/widget/ImageButton;->setImageResource(I)V

    goto :goto_1
.end method


# virtual methods
.method public getIndex()I
    .locals 4

    .prologue
    .line 400
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getMusicProgress()I

    move-result v1

    iput v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricCurrentTime:I

    .line 401
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getMusicDuration()I

    move-result v1

    iput v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricTotalTime:I

    .line 402
    iget v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricCurrentTime:I

    iget v2, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricTotalTime:I

    if-ge v1, v2, :cond_0

    .line 403
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    iget-object v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricList:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt v0, v1, :cond_2

    .line 425
    .end local v0    # "i":I
    :cond_0
    iget v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->index:I

    :cond_1
    return v0

    .line 405
    .restart local v0    # "i":I
    :cond_2
    iget-object v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricList:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_4

    .line 407
    iget v2, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricCurrentTime:I

    iget-object v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricList:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/arist/entity/Lyric;

    invoke-virtual {v1}, Lcom/arist/entity/Lyric;->getLyricTime()I

    move-result v1

    if-ge v2, v1, :cond_3

    .line 408
    if-eqz v0, :cond_1

    .line 412
    :cond_3
    iget v2, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricCurrentTime:I

    iget-object v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricList:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/arist/entity/Lyric;

    invoke-virtual {v1}, Lcom/arist/entity/Lyric;->getLyricTime()I

    move-result v1

    if-le v2, v1, :cond_4

    .line 413
    iget v2, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricCurrentTime:I

    iget-object v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricList:Ljava/util/ArrayList;

    add-int/lit8 v3, v0, 0x1

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/arist/entity/Lyric;

    .line 414
    invoke-virtual {v1}, Lcom/arist/entity/Lyric;->getLyricTime()I

    move-result v1

    if-lt v2, v1, :cond_1

    .line 419
    :cond_4
    iget-object v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricList:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_5

    .line 420
    iget v2, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricCurrentTime:I

    iget-object v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricList:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/arist/entity/Lyric;

    invoke-virtual {v1}, Lcom/arist/entity/Lyric;->getLyricTime()I

    move-result v1

    if-gt v2, v1, :cond_1

    .line 403
    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public initData()V
    .locals 2

    .prologue
    .line 148
    new-instance v0, Lcom/arist/util/LrcRead;

    invoke-direct {v0}, Lcom/arist/util/LrcRead;-><init>()V

    iput-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->lrcRead:Lcom/arist/util/LrcRead;

    .line 149
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->tvMusicName:Landroid/widget/TextView;

    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getMusicTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 150
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->tvMusicArtist:Landroid/widget/TextView;

    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getMusicArtist()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 151
    invoke-virtual {p0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 152
    const v1, 0x7f0b0002

    .line 151
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->playModeStrArr:[Ljava/lang/String;

    .line 153
    return-void
.end method

.method public initListener()V
    .locals 2

    .prologue
    .line 157
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->btnPlay:Landroid/widget/ImageButton;

    new-instance v1, Lcom/arist/MusicPlayer/MusicPlayActivity$4;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MusicPlayActivity$4;-><init>(Lcom/arist/MusicPlayer/MusicPlayActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 164
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->btnPrevious:Landroid/widget/ImageButton;

    new-instance v1, Lcom/arist/MusicPlayer/MusicPlayActivity$5;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MusicPlayActivity$5;-><init>(Lcom/arist/MusicPlayer/MusicPlayActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 171
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->btnNext:Landroid/widget/ImageButton;

    new-instance v1, Lcom/arist/MusicPlayer/MusicPlayActivity$6;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MusicPlayActivity$6;-><init>(Lcom/arist/MusicPlayer/MusicPlayActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 178
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->btnPlayList:Landroid/widget/ImageButton;

    new-instance v1, Lcom/arist/MusicPlayer/MusicPlayActivity$7;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MusicPlayActivity$7;-><init>(Lcom/arist/MusicPlayer/MusicPlayActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 191
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->btnPlayMode:Landroid/widget/ImageButton;

    new-instance v1, Lcom/arist/MusicPlayer/MusicPlayActivity$8;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MusicPlayActivity$8;-><init>(Lcom/arist/MusicPlayer/MusicPlayActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 202
    return-void
.end method

.method public initView()V
    .locals 2

    .prologue
    .line 80
    const v0, 0x7f0d007c

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->layout:Landroid/widget/RelativeLayout;

    .line 81
    const v0, 0x7f0d002f

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->btnPlayList:Landroid/widget/ImageButton;

    .line 82
    const v0, 0x7f0d002e

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->btnPlayMode:Landroid/widget/ImageButton;

    .line 83
    const v0, 0x7f0d002b

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->btnPrevious:Landroid/widget/ImageButton;

    .line 84
    const v0, 0x7f0d002c

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->btnPlay:Landroid/widget/ImageButton;

    .line 85
    const v0, 0x7f0d002d

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->btnNext:Landroid/widget/ImageButton;

    .line 87
    const v0, 0x7f0d0084

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->tvMusicName:Landroid/widget/TextView;

    .line 88
    const v0, 0x7f0d0083

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->tvMusicArtist:Landroid/widget/TextView;

    .line 89
    const v0, 0x7f0d0082

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->ablamImage:Landroid/widget/ImageView;

    .line 91
    const v0, 0x7f0d0086

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/arist/MyView/LyricView;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->lyricView:Lcom/arist/MyView/LyricView;

    .line 92
    const v0, 0x7f0d007f

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->tvCurrentTime:Landroid/widget/TextView;

    .line 93
    const v0, 0x7f0d0080

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->tvTotalTime:Landroid/widget/TextView;

    .line 94
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->tvCurrentTime:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-static {v1}, Lcom/arist/util/TimeFormat;->timeFormat(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 96
    const v0, 0x7f0d007e

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->musicProgress:Landroid/widget/SeekBar;

    .line 97
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->musicProgress:Landroid/widget/SeekBar;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->mSeekBarChangeListener:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 99
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_0

    .line 101
    const v0, 0x7f0d006a

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lyong/powerfull/equalizer/VisualizerView;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->visualizer:Lyong/powerfull/equalizer/VisualizerView;

    .line 103
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->visualizer:Lyong/powerfull/equalizer/VisualizerView;

    sget-object v1, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 104
    invoke-virtual {v1}, Landroid/media/MediaPlayer;->getAudioSessionId()I

    move-result v1

    .line 103
    invoke-virtual {v0, v1}, Lyong/powerfull/equalizer/VisualizerView;->setupVisualizerFx(I)V

    .line 106
    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 209
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 210
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->requestWindowFeature(I)Z

    .line 211
    const v0, 0x7f03001c

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->setContentView(I)V

    .line 212
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getInstance()Lcom/arist/MusicPlayer/MyApplication;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/arist/MusicPlayer/MyApplication;->addActivity(Landroid/app/Activity;)V

    .line 213
    invoke-virtual {p0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->initView()V

    .line 214
    invoke-virtual {p0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->initData()V

    .line 215
    invoke-virtual {p0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->initListener()V

    .line 218
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->handlerUpdateSeekBar:Landroid/os/Handler;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->updateSeekBarThread:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 220
    new-instance v0, Lcom/arist/MusicPlayer/MusicPlayActivity$9;

    invoke-direct {v0, p0}, Lcom/arist/MusicPlayer/MusicPlayActivity$9;-><init>(Lcom/arist/MusicPlayer/MusicPlayActivity;)V

    iput-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->handler:Landroid/os/Handler;

    .line 249
    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 301
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->mReciever:Lcom/arist/MusicPlayer/MusicPlayActivity$MyReciever;

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 303
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->visualizer:Lyong/powerfull/equalizer/VisualizerView;

    if-eqz v0, :cond_0

    .line 304
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->visualizer:Lyong/powerfull/equalizer/VisualizerView;

    invoke-virtual {v0}, Lyong/powerfull/equalizer/VisualizerView;->releaseVisualizerFx()V

    .line 307
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 308
    return-void
.end method

.method protected onPause()V
    .locals 1

    .prologue
    .line 295
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->isFront:Z

    .line 296
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 297
    return-void
.end method

.method protected onResume()V
    .locals 4

    .prologue
    const/4 v3, 0x3

    const/4 v2, 0x1

    .line 283
    invoke-direct {p0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->updateView()V

    .line 284
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->layout:Landroid/widget/RelativeLayout;

    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getWallpaperId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 285
    sget v0, Lcom/arist/MusicPlayer/MyApplication;->status:I

    if-eq v0, v2, :cond_0

    .line 286
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->handler:Landroid/os/Handler;

    invoke-virtual {v1, v3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 287
    :cond_0
    iput-boolean v2, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->isFront:Z

    .line 288
    invoke-direct {p0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->setLyric()V

    .line 289
    iget-object v0, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->handler:Landroid/os/Handler;

    invoke-virtual {v1, v3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 290
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 291
    return-void
.end method

.method protected onStart()V
    .locals 3

    .prologue
    .line 271
    new-instance v1, Lcom/arist/MusicPlayer/MusicPlayActivity$MyReciever;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/arist/MusicPlayer/MusicPlayActivity$MyReciever;-><init>(Lcom/arist/MusicPlayer/MusicPlayActivity;Lcom/arist/MusicPlayer/MusicPlayActivity$MyReciever;)V

    iput-object v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->mReciever:Lcom/arist/MusicPlayer/MusicPlayActivity$MyReciever;

    .line 272
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 273
    .local v0, "filter":Landroid/content/IntentFilter;
    const-string v1, "com.MediaPlayer.action.DESTORY"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 274
    const-string v1, "com.MediaPlayer.action.MEDIAPLAYER_INFO"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 275
    const-string v1, "com.MediaPlayer.action.MUSIC_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 276
    const-string v1, "com.MediaPlayer.action.STATUS_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 277
    iget-object v1, p0, Lcom/arist/MusicPlayer/MusicPlayActivity;->mReciever:Lcom/arist/MusicPlayer/MusicPlayActivity$MyReciever;

    invoke-virtual {p0, v1, v0}, Lcom/arist/MusicPlayer/MusicPlayActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 278
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 279
    return-void
.end method
