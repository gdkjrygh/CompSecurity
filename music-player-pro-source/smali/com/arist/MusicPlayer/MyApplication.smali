.class public Lcom/arist/MusicPlayer/MyApplication;
.super Landroid/app/Application;
.source "MyApplication.java"


# static fields
.field public static context:Landroid/content/Context;

.field private static currentMusic:Lcom/arist/entity/Music;

.field public static currentPage:I

.field public static currentPosition:I

.field private static defaultPref:Landroid/content/SharedPreferences;

.field public static instance:Lcom/arist/MusicPlayer/MyApplication;

.field public static isplayNetMusic:Z

.field public static lrcColor:Landroid/graphics/Color;

.field public static lrcSize:I

.field public static mediaPlayer:Landroid/media/MediaPlayer;

.field public static musicAlbum:Ljava/lang/String;

.field public static musicData:Ljava/lang/String;

.field public static musicDuration:I

.field public static musicList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/Music;",
            ">;"
        }
    .end annotation
.end field

.field public static musicPref:Lcom/arist/util/MusicPreference;

.field public static musicProgress:I

.field public static playMode:I

.field public static showList:Z

.field public static status:I

.field public static timer:Ljava/util/Timer;

.field public static timerStartService:Ljava/util/Timer;


# instance fields
.field public activityList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private musicDao:Lcom/arist/dao/MusicDao;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 51
    const/4 v0, 0x1

    sput v0, Lcom/arist/MusicPlayer/MyApplication;->status:I

    .line 53
    sput-boolean v1, Lcom/arist/MusicPlayer/MyApplication;->showList:Z

    .line 54
    sput-boolean v1, Lcom/arist/MusicPlayer/MyApplication;->isplayNetMusic:Z

    .line 155
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/arist/MusicPlayer/MyApplication;->musicList:Ljava/util/ArrayList;

    .line 172
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 238
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    .line 31
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/arist/MusicPlayer/MyApplication;->activityList:Ljava/util/List;

    .line 240
    return-void
.end method

.method public static getCurrentMusic()Lcom/arist/entity/Music;
    .locals 2

    .prologue
    .line 138
    sget-boolean v0, Lcom/arist/MusicPlayer/MyApplication;->isplayNetMusic:Z

    if-eqz v0, :cond_0

    .line 139
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->currentMusic:Lcom/arist/entity/Music;

    .line 144
    :goto_0
    return-object v0

    .line 141
    :cond_0
    sget v0, Lcom/arist/MusicPlayer/MyApplication;->currentPosition:I

    sget-object v1, Lcom/arist/MusicPlayer/MyApplication;->musicList:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 142
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->musicList:Ljava/util/ArrayList;

    sget v1, Lcom/arist/MusicPlayer/MyApplication;->currentPosition:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/entity/Music;

    sput-object v0, Lcom/arist/MusicPlayer/MyApplication;->currentMusic:Lcom/arist/entity/Music;

    .line 144
    :cond_1
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->currentMusic:Lcom/arist/entity/Music;

    goto :goto_0
.end method

.method public static getCurrentPage()I
    .locals 1

    .prologue
    .line 122
    sget v0, Lcom/arist/MusicPlayer/MyApplication;->currentPage:I

    return v0
.end method

.method public static getCurrentPosition()I
    .locals 1

    .prologue
    .line 130
    sget v0, Lcom/arist/MusicPlayer/MyApplication;->currentPosition:I

    return v0
.end method

.method public static getDefaultSharedPreferences()Landroid/content/SharedPreferences;
    .locals 1

    .prologue
    .line 57
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    sput-object v0, Lcom/arist/MusicPlayer/MyApplication;->defaultPref:Landroid/content/SharedPreferences;

    .line 58
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->defaultPref:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public static getInstance()Lcom/arist/MusicPlayer/MyApplication;
    .locals 1

    .prologue
    .line 244
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->instance:Lcom/arist/MusicPlayer/MyApplication;

    if-nez v0, :cond_0

    .line 245
    new-instance v0, Lcom/arist/MusicPlayer/MyApplication;

    invoke-direct {v0}, Lcom/arist/MusicPlayer/MyApplication;-><init>()V

    sput-object v0, Lcom/arist/MusicPlayer/MyApplication;->instance:Lcom/arist/MusicPlayer/MyApplication;

    .line 246
    :cond_0
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->instance:Lcom/arist/MusicPlayer/MyApplication;

    return-object v0
.end method

.method public static getMusicAlbum()Ljava/lang/String;
    .locals 1

    .prologue
    .line 75
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->currentMusic:Lcom/arist/entity/Music;

    if-nez v0, :cond_0

    .line 76
    const-string v0, ""

    .line 78
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->currentMusic:Lcom/arist/entity/Music;

    invoke-virtual {v0}, Lcom/arist/entity/Music;->getAlbum()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static getMusicAlbumId()I
    .locals 1

    .prologue
    .line 61
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->currentMusic:Lcom/arist/entity/Music;

    if-nez v0, :cond_0

    .line 62
    const/4 v0, -0x1

    .line 64
    :goto_0
    return v0

    :cond_0
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->currentMusic:Lcom/arist/entity/Music;

    invoke-virtual {v0}, Lcom/arist/entity/Music;->getAlbumId()I

    move-result v0

    goto :goto_0
.end method

.method public static getMusicArtist()Ljava/lang/String;
    .locals 1

    .prologue
    .line 82
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->currentMusic:Lcom/arist/entity/Music;

    if-nez v0, :cond_0

    .line 83
    const-string v0, ""

    .line 85
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->currentMusic:Lcom/arist/entity/Music;

    invoke-virtual {v0}, Lcom/arist/entity/Music;->getArtist()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static getMusicData()Ljava/lang/String;
    .locals 1

    .prologue
    .line 105
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->currentMusic:Lcom/arist/entity/Music;

    if-nez v0, :cond_0

    .line 106
    const-string v0, ""

    .line 108
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->currentMusic:Lcom/arist/entity/Music;

    invoke-virtual {v0}, Lcom/arist/entity/Music;->getData()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static getMusicDuration()I
    .locals 2

    .prologue
    const v0, 0x493e0

    .line 96
    sget-object v1, Lcom/arist/MusicPlayer/MyApplication;->currentMusic:Lcom/arist/entity/Music;

    if-nez v1, :cond_1

    .line 101
    :cond_0
    :goto_0
    return v0

    .line 98
    :cond_1
    sget-object v1, Lcom/arist/MusicPlayer/MyApplication;->currentMusic:Lcom/arist/entity/Music;

    invoke-virtual {v1}, Lcom/arist/entity/Music;->getDuration()I

    move-result v1

    if-eqz v1, :cond_0

    .line 101
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->currentMusic:Lcom/arist/entity/Music;

    invoke-virtual {v0}, Lcom/arist/entity/Music;->getDuration()I

    move-result v0

    goto :goto_0
.end method

.method public static getMusicFolderPath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 68
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->currentMusic:Lcom/arist/entity/Music;

    if-nez v0, :cond_0

    .line 69
    const-string v0, ""

    .line 71
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->currentMusic:Lcom/arist/entity/Music;

    invoke-virtual {v0}, Lcom/arist/entity/Music;->getFolderPath()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static getMusicProgress()I
    .locals 1

    .prologue
    .line 112
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v0

    return v0
.end method

.method public static getMusicTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 89
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->currentMusic:Lcom/arist/entity/Music;

    if-nez v0, :cond_0

    .line 90
    const-string v0, ""

    .line 92
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->currentMusic:Lcom/arist/entity/Music;

    invoke-virtual {v0}, Lcom/arist/entity/Music;->getTitle()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static getWallpaperId()I
    .locals 3

    .prologue
    .line 279
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->defaultPref:Landroid/content/SharedPreferences;

    const-string v1, "wallpaper_id"

    const v2, 0x7f020005

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public static setCurrentMusic(Lcom/arist/entity/Music;)V
    .locals 0
    .param p0, "currentMusic"    # Lcom/arist/entity/Music;

    .prologue
    .line 148
    sput-object p0, Lcom/arist/MusicPlayer/MyApplication;->currentMusic:Lcom/arist/entity/Music;

    .line 149
    return-void
.end method

.method public static setCurrentPage(I)V
    .locals 0
    .param p0, "currentPage"    # I

    .prologue
    .line 126
    sput p0, Lcom/arist/MusicPlayer/MyApplication;->currentPage:I

    .line 127
    return-void
.end method

.method public static setCurrentPosition(I)V
    .locals 0
    .param p0, "currentPosition"    # I

    .prologue
    .line 134
    sput p0, Lcom/arist/MusicPlayer/MyApplication;->currentPosition:I

    .line 135
    return-void
.end method

.method public static setPlayNetMusic(Z)V
    .locals 0
    .param p0, "isPlayNetMusic"    # Z

    .prologue
    .line 152
    sput-boolean p0, Lcom/arist/MusicPlayer/MyApplication;->isplayNetMusic:Z

    .line 153
    return-void
.end method

.method public static setWallpaperId(I)V
    .locals 2
    .param p0, "resId"    # I

    .prologue
    .line 283
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->defaultPref:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "wallpaper_id"

    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 284
    return-void
.end method

.method private sortMusicList(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/Music;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 287
    .local p1, "musics":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/Music;>;"
    new-instance v0, Lcom/arist/MusicPlayer/MyApplication$3;

    invoke-direct {v0, p0}, Lcom/arist/MusicPlayer/MyApplication$3;-><init>(Lcom/arist/MusicPlayer/MyApplication;)V

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 296
    return-void
.end method


# virtual methods
.method public addActivity(Landroid/app/Activity;)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 251
    iget-object v0, p0, Lcom/arist/MusicPlayer/MyApplication;->activityList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 252
    return-void
.end method

.method public append(Lcom/arist/entity/Music;)V
    .locals 1
    .param p1, "music"    # Lcom/arist/entity/Music;

    .prologue
    .line 272
    if-eqz p1, :cond_0

    .line 273
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->musicList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 275
    :cond_0
    return-void
.end method

.method public append(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/Music;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 265
    .local p1, "musicList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/Music;>;"
    if-eqz p1, :cond_0

    .line 266
    invoke-virtual {p1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 268
    :cond_0
    return-void
.end method

.method public exit()V
    .locals 3

    .prologue
    .line 256
    iget-object v1, p0, Lcom/arist/MusicPlayer/MyApplication;->activityList:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    .line 260
    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/System;->exit(I)V

    .line 261
    return-void

    .line 256
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    .line 257
    .local v0, "activity":Landroid/app/Activity;
    if-eqz v0, :cond_0

    .line 258
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    goto :goto_0
.end method

.method public getmusicList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/Music;",
            ">;"
        }
    .end annotation

    .prologue
    .line 159
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->musicList:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 160
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 161
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->musicList:Ljava/util/ArrayList;

    goto :goto_0
.end method

.method public isPlaying()Z
    .locals 1

    .prologue
    .line 116
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    if-nez v0, :cond_0

    .line 117
    const/4 v0, 0x0

    .line 118
    :goto_0
    return v0

    :cond_0
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    goto :goto_0
.end method

.method public onCreate()V
    .locals 7

    .prologue
    .line 176
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 178
    invoke-virtual {p0}, Lcom/arist/MusicPlayer/MyApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcom/arist/MusicPlayer/MyApplication;->context:Landroid/content/Context;

    .line 179
    sput-object p0, Lcom/arist/MusicPlayer/MyApplication;->instance:Lcom/arist/MusicPlayer/MyApplication;

    .line 181
    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    sput-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 182
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setAudioStreamType(I)V

    .line 184
    new-instance v0, Lcom/arist/dao/MusicDao;

    sget-object v1, Lcom/arist/MusicPlayer/MyApplication;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/arist/dao/MusicDao;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/arist/MusicPlayer/MyApplication;->musicDao:Lcom/arist/dao/MusicDao;

    .line 186
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    sput-object v0, Lcom/arist/MusicPlayer/MyApplication;->defaultPref:Landroid/content/SharedPreferences;

    .line 187
    new-instance v0, Lcom/arist/util/MusicPreference;

    sget-object v1, Lcom/arist/MusicPlayer/MyApplication;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/arist/util/MusicPreference;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/arist/MusicPlayer/MyApplication;->musicPref:Lcom/arist/util/MusicPreference;

    .line 188
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->musicPref:Lcom/arist/util/MusicPreference;

    invoke-virtual {v0}, Lcom/arist/util/MusicPreference;->getPosition()I

    move-result v0

    sput v0, Lcom/arist/MusicPlayer/MyApplication;->currentPosition:I

    .line 189
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->musicPref:Lcom/arist/util/MusicPreference;

    invoke-virtual {v0}, Lcom/arist/util/MusicPreference;->getData()Ljava/lang/String;

    move-result-object v6

    .line 190
    .local v6, "musicData":Ljava/lang/String;
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->musicPref:Lcom/arist/util/MusicPreference;

    invoke-virtual {v0}, Lcom/arist/util/MusicPreference;->getProgress()I

    move-result v0

    sput v0, Lcom/arist/MusicPlayer/MyApplication;->musicProgress:I

    .line 191
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->musicPref:Lcom/arist/util/MusicPreference;

    invoke-virtual {v0}, Lcom/arist/util/MusicPreference;->getPlayMode()I

    move-result v0

    sput v0, Lcom/arist/MusicPlayer/MyApplication;->playMode:I

    .line 193
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 194
    iget-object v0, p0, Lcom/arist/MusicPlayer/MyApplication;->musicDao:Lcom/arist/dao/MusicDao;

    invoke-virtual {v0, v6}, Lcom/arist/dao/MusicDao;->getMusicByPath(Ljava/lang/String;)Lcom/arist/entity/Music;

    move-result-object v0

    sput-object v0, Lcom/arist/MusicPlayer/MyApplication;->currentMusic:Lcom/arist/entity/Music;

    .line 197
    :try_start_0
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    sget-object v1, Lcom/arist/MusicPlayer/MyApplication;->currentMusic:Lcom/arist/entity/Music;

    invoke-virtual {v1}, Lcom/arist/entity/Music;->getData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 198
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V

    .line 199
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    sget v1, Lcom/arist/MusicPlayer/MyApplication;->musicProgress:I

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 201
    iget-object v0, p0, Lcom/arist/MusicPlayer/MyApplication;->musicDao:Lcom/arist/dao/MusicDao;

    sget-object v1, Lcom/arist/MusicPlayer/MyApplication;->currentMusic:Lcom/arist/entity/Music;

    invoke-virtual {v1}, Lcom/arist/entity/Music;->getFolderPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/arist/dao/MusicDao;->getMusic(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    sput-object v0, Lcom/arist/MusicPlayer/MyApplication;->musicList:Ljava/util/ArrayList;

    .line 202
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->musicList:Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Lcom/arist/MusicPlayer/MyApplication;->sortMusicList(Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 212
    :goto_0
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    sput-object v0, Lcom/arist/MusicPlayer/MyApplication;->timerStartService:Ljava/util/Timer;

    .line 213
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->timerStartService:Ljava/util/Timer;

    new-instance v1, Lcom/arist/MusicPlayer/MyApplication$1;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MyApplication$1;-><init>(Lcom/arist/MusicPlayer/MyApplication;)V

    .line 219
    const-wide/16 v2, 0x7d0

    .line 213
    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 222
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    sput-object v0, Lcom/arist/MusicPlayer/MyApplication;->timer:Ljava/util/Timer;

    .line 223
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->timer:Ljava/util/Timer;

    new-instance v1, Lcom/arist/MusicPlayer/MyApplication$2;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MyApplication$2;-><init>(Lcom/arist/MusicPlayer/MyApplication;)V

    .line 234
    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x1f4

    .line 223
    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    .line 236
    return-void

    .line 207
    :cond_0
    const/4 v0, 0x0

    sput-object v0, Lcom/arist/MusicPlayer/MyApplication;->currentMusic:Lcom/arist/entity/Music;

    .line 208
    const/4 v0, 0x0

    sput v0, Lcom/arist/MusicPlayer/MyApplication;->currentPosition:I

    goto :goto_0

    .line 204
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public setMusicList(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/Music;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 166
    .local p1, "musicList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/Music;>;"
    if-nez p1, :cond_0

    .line 167
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/arist/MusicPlayer/MyApplication;->musicList:Ljava/util/ArrayList;

    .line 170
    :goto_0
    return-void

    .line 169
    :cond_0
    sput-object p1, Lcom/arist/MusicPlayer/MyApplication;->musicList:Ljava/util/ArrayList;

    goto :goto_0
.end method
