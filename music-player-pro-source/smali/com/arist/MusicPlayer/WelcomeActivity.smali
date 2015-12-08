.class public Lcom/arist/MusicPlayer/WelcomeActivity;
.super Landroid/app/Activity;
.source "WelcomeActivity.java"


# instance fields
.field private biz:Lcom/arist/biz/MusicBiz;

.field private flag:Z

.field private folderDao:Lcom/arist/dao/MusicFolderDao;

.field private handler:Landroid/os/Handler;

.field private mainPref:Lcom/arist/util/MainGridPreference;

.field private musicDao:Lcom/arist/dao/MusicDao;

.field private pbWelcome:Landroid/widget/ProgressBar;

.field private tvWelcome:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 34
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->flag:Z

    .line 28
    return-void
.end method

.method static synthetic access$0(Lcom/arist/MusicPlayer/WelcomeActivity;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->tvWelcome:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$1(Lcom/arist/MusicPlayer/WelcomeActivity;)V
    .locals 0

    .prologue
    .line 146
    invoke-direct {p0}, Lcom/arist/MusicPlayer/WelcomeActivity;->gotoMainActivity()V

    return-void
.end method

.method static synthetic access$2(Lcom/arist/MusicPlayer/WelcomeActivity;)Lcom/arist/biz/MusicBiz;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->biz:Lcom/arist/biz/MusicBiz;

    return-object v0
.end method

.method static synthetic access$3(Lcom/arist/MusicPlayer/WelcomeActivity;)Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->pbWelcome:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic access$4(Lcom/arist/MusicPlayer/WelcomeActivity;)Z
    .locals 1

    .prologue
    .line 34
    iget-boolean v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->flag:Z

    return v0
.end method

.method static synthetic access$5(Lcom/arist/MusicPlayer/WelcomeActivity;)V
    .locals 0

    .prologue
    .line 133
    invoke-direct {p0}, Lcom/arist/MusicPlayer/WelcomeActivity;->updateMusicList()V

    return-void
.end method

.method static synthetic access$6(Lcom/arist/MusicPlayer/WelcomeActivity;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->handler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$7(Lcom/arist/MusicPlayer/WelcomeActivity;Z)V
    .locals 0

    .prologue
    .line 34
    iput-boolean p1, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->flag:Z

    return-void
.end method

.method private gotoMainActivity()V
    .locals 3

    .prologue
    .line 147
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/arist/MusicPlayer/MainActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 148
    .local v0, "intent":Landroid/content/Intent;
    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/WelcomeActivity;->startActivity(Landroid/content/Intent;)V

    .line 149
    const v1, 0x7f040009

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Lcom/arist/MusicPlayer/WelcomeActivity;->overridePendingTransition(II)V

    .line 150
    invoke-virtual {p0}, Lcom/arist/MusicPlayer/WelcomeActivity;->finish()V

    .line 151
    return-void
.end method

.method private init()V
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 82
    iget-object v1, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->tvWelcome:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 83
    iget-object v1, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->pbWelcome:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 85
    new-instance v1, Lcom/arist/dao/MusicDao;

    invoke-direct {v1, p0}, Lcom/arist/dao/MusicDao;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->musicDao:Lcom/arist/dao/MusicDao;

    .line 86
    new-instance v1, Lcom/arist/dao/MusicFolderDao;

    invoke-direct {v1, p0}, Lcom/arist/dao/MusicFolderDao;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->folderDao:Lcom/arist/dao/MusicFolderDao;

    .line 87
    new-instance v1, Lcom/arist/biz/MusicBiz;

    invoke-direct {v1, p0}, Lcom/arist/biz/MusicBiz;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->biz:Lcom/arist/biz/MusicBiz;

    .line 89
    iget-object v1, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->biz:Lcom/arist/biz/MusicBiz;

    iget-object v2, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->musicDao:Lcom/arist/dao/MusicDao;

    invoke-virtual {v1, v2}, Lcom/arist/biz/MusicBiz;->setMusicDao(Lcom/arist/dao/MusicDao;)V

    .line 90
    iget-object v1, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->biz:Lcom/arist/biz/MusicBiz;

    iget-object v2, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->folderDao:Lcom/arist/dao/MusicFolderDao;

    invoke-virtual {v1, v2}, Lcom/arist/biz/MusicBiz;->setFolderDao(Lcom/arist/dao/MusicFolderDao;)V

    .line 93
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    .line 94
    .local v0, "timer":Ljava/util/Timer;
    new-instance v1, Lcom/arist/MusicPlayer/WelcomeActivity$3;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/WelcomeActivity$3;-><init>(Lcom/arist/MusicPlayer/WelcomeActivity;)V

    .line 107
    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x1f4

    .line 94
    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    .line 110
    new-instance v1, Lcom/arist/MusicPlayer/WelcomeActivity$4;

    invoke-direct {v1, p0, v0}, Lcom/arist/MusicPlayer/WelcomeActivity$4;-><init>(Lcom/arist/MusicPlayer/WelcomeActivity;Ljava/util/Timer;)V

    .line 119
    invoke-virtual {v1}, Lcom/arist/MusicPlayer/WelcomeActivity$4;->start()V

    .line 120
    return-void
.end method

.method private initMainGrid()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 124
    iget-object v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->mainPref:Lcom/arist/util/MainGridPreference;

    iget-object v1, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->biz:Lcom/arist/biz/MusicBiz;

    invoke-virtual {v1}, Lcom/arist/biz/MusicBiz;->getRecentAddMusic()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/util/MainGridPreference;->saveAdd(I)V

    .line 125
    iget-object v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->mainPref:Lcom/arist/util/MainGridPreference;

    iget-object v1, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->musicDao:Lcom/arist/dao/MusicDao;

    invoke-virtual {v1}, Lcom/arist/dao/MusicDao;->getAlbumNum()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/util/MainGridPreference;->saveAlbum(I)V

    .line 126
    iget-object v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->mainPref:Lcom/arist/util/MainGridPreference;

    iget-object v1, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->musicDao:Lcom/arist/dao/MusicDao;

    invoke-virtual {v1}, Lcom/arist/dao/MusicDao;->getAllMusic()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/util/MainGridPreference;->saveAllMusic(I)V

    .line 127
    iget-object v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->mainPref:Lcom/arist/util/MainGridPreference;

    iget-object v1, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->musicDao:Lcom/arist/dao/MusicDao;

    invoke-virtual {v1}, Lcom/arist/dao/MusicDao;->getArtistNum()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/util/MainGridPreference;->saveArtist(I)V

    .line 128
    iget-object v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->mainPref:Lcom/arist/util/MainGridPreference;

    invoke-virtual {v0, v2}, Lcom/arist/util/MainGridPreference;->saveDownload(I)V

    .line 129
    iget-object v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->mainPref:Lcom/arist/util/MainGridPreference;

    invoke-virtual {v0, v2}, Lcom/arist/util/MainGridPreference;->saveFav(I)V

    .line 130
    iget-object v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->mainPref:Lcom/arist/util/MainGridPreference;

    iget-object v1, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->musicDao:Lcom/arist/dao/MusicDao;

    invoke-virtual {v1}, Lcom/arist/dao/MusicDao;->getFolder()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/util/MainGridPreference;->saveFolder(I)V

    .line 131
    return-void
.end method

.method private updateMusicList()V
    .locals 1

    .prologue
    .line 135
    iget-object v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->musicDao:Lcom/arist/dao/MusicDao;

    invoke-virtual {v0}, Lcom/arist/dao/MusicDao;->deleteAllMusic()V

    .line 136
    iget-object v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->folderDao:Lcom/arist/dao/MusicFolderDao;

    invoke-virtual {v0}, Lcom/arist/dao/MusicFolderDao;->deleteAllFolder()V

    .line 139
    iget-object v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->biz:Lcom/arist/biz/MusicBiz;

    invoke-virtual {v0}, Lcom/arist/biz/MusicBiz;->addAllMusicToDB()I

    .line 140
    iget-object v0, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->biz:Lcom/arist/biz/MusicBiz;

    invoke-virtual {v0}, Lcom/arist/biz/MusicBiz;->addMusicFolderToDB()I

    .line 143
    invoke-direct {p0}, Lcom/arist/MusicPlayer/WelcomeActivity;->initMainGrid()V

    .line 144
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const/16 v3, 0x400

    const/4 v2, 0x1

    .line 43
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 44
    invoke-virtual {p0, v2}, Lcom/arist/MusicPlayer/WelcomeActivity;->requestWindowFeature(I)Z

    .line 45
    invoke-virtual {p0}, Lcom/arist/MusicPlayer/WelcomeActivity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1, v3, v3}, Landroid/view/Window;->setFlags(II)V

    .line 47
    const v1, 0x7f030026

    invoke-virtual {p0, v1}, Lcom/arist/MusicPlayer/WelcomeActivity;->setContentView(I)V

    .line 49
    const v1, 0x7f0d00b2

    invoke-virtual {p0, v1}, Lcom/arist/MusicPlayer/WelcomeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->tvWelcome:Landroid/widget/TextView;

    .line 50
    const v1, 0x7f0d00b3

    invoke-virtual {p0, v1}, Lcom/arist/MusicPlayer/WelcomeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ProgressBar;

    iput-object v1, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->pbWelcome:Landroid/widget/ProgressBar;

    .line 52
    invoke-virtual {p0}, Lcom/arist/MusicPlayer/WelcomeActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 53
    .local v0, "pref":Landroid/content/SharedPreferences;
    new-instance v1, Lcom/arist/util/MainGridPreference;

    invoke-direct {v1, p0}, Lcom/arist/util/MainGridPreference;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->mainPref:Lcom/arist/util/MainGridPreference;

    .line 54
    new-instance v1, Lcom/arist/MusicPlayer/WelcomeActivity$1;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/WelcomeActivity$1;-><init>(Lcom/arist/MusicPlayer/WelcomeActivity;)V

    iput-object v1, p0, Lcom/arist/MusicPlayer/WelcomeActivity;->handler:Landroid/os/Handler;

    .line 61
    const-string v1, "isFirstUse"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 63
    invoke-direct {p0}, Lcom/arist/MusicPlayer/WelcomeActivity;->init()V

    .line 64
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "isFirstUse"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 78
    :goto_0
    return-void

    .line 67
    :cond_0
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    new-instance v2, Lcom/arist/MusicPlayer/WelcomeActivity$2;

    invoke-direct {v2, p0}, Lcom/arist/MusicPlayer/WelcomeActivity$2;-><init>(Lcom/arist/MusicPlayer/WelcomeActivity;)V

    .line 76
    const-wide/16 v4, 0x3e8

    .line 67
    invoke-virtual {v1, v2, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method
