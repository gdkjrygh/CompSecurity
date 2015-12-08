.class public Lcom/arist/MusicPlayer/ScanMusicActivity;
.super Landroid/app/Activity;
.source "ScanMusicActivity.java"


# instance fields
.field private btnScan:Landroid/widget/Button;

.field private folderDao:Lcom/arist/dao/MusicFolderDao;

.field private handler:Landroid/os/Handler;

.field private mainPref:Lcom/arist/util/MainGridPreference;

.field private musicBiz:Lcom/arist/biz/MusicBiz;

.field private musicDao:Lcom/arist/dao/MusicDao;

.field private pbScan:Landroid/widget/ProgressBar;

.field private thread:Ljava/lang/Thread;

.field private timer:Ljava/util/Timer;

.field private tvCount:Landroid/widget/TextView;

.field private tvTotal:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 30
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->timer:Ljava/util/Timer;

    .line 30
    return-void
.end method

.method static synthetic access$0(Lcom/arist/MusicPlayer/ScanMusicActivity;)Landroid/widget/Button;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->btnScan:Landroid/widget/Button;

    return-object v0
.end method

.method static synthetic access$1(Lcom/arist/MusicPlayer/ScanMusicActivity;)Ljava/lang/Thread;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->thread:Ljava/lang/Thread;

    return-object v0
.end method

.method static synthetic access$2(Lcom/arist/MusicPlayer/ScanMusicActivity;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->tvCount:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$3(Lcom/arist/MusicPlayer/ScanMusicActivity;)Lcom/arist/biz/MusicBiz;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->musicBiz:Lcom/arist/biz/MusicBiz;

    return-object v0
.end method

.method static synthetic access$4(Lcom/arist/MusicPlayer/ScanMusicActivity;)V
    .locals 0

    .prologue
    .line 190
    invoke-direct {p0}, Lcom/arist/MusicPlayer/ScanMusicActivity;->updateMusicList()V

    return-void
.end method

.method static synthetic access$5(Lcom/arist/MusicPlayer/ScanMusicActivity;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->handler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$6(Lcom/arist/MusicPlayer/ScanMusicActivity;)Ljava/util/Timer;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->timer:Ljava/util/Timer;

    return-object v0
.end method

.method static synthetic access$7(Lcom/arist/MusicPlayer/ScanMusicActivity;)Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->pbScan:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method private initMainGrid()V
    .locals 5

    .prologue
    .line 208
    :try_start_0
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->mainPref:Lcom/arist/util/MainGridPreference;

    iget-object v1, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->musicBiz:Lcom/arist/biz/MusicBiz;

    invoke-virtual {v1}, Lcom/arist/biz/MusicBiz;->getRecentAddMusic()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/util/MainGridPreference;->saveAdd(I)V

    .line 209
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->mainPref:Lcom/arist/util/MainGridPreference;

    iget-object v1, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->musicDao:Lcom/arist/dao/MusicDao;

    invoke-virtual {v1}, Lcom/arist/dao/MusicDao;->getAlbumNum()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/util/MainGridPreference;->saveAlbum(I)V

    .line 210
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->mainPref:Lcom/arist/util/MainGridPreference;

    iget-object v1, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->musicDao:Lcom/arist/dao/MusicDao;

    invoke-virtual {v1}, Lcom/arist/dao/MusicDao;->getAllMusic()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/util/MainGridPreference;->saveAllMusic(I)V

    .line 211
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->mainPref:Lcom/arist/util/MainGridPreference;

    iget-object v1, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->musicDao:Lcom/arist/dao/MusicDao;

    invoke-virtual {v1}, Lcom/arist/dao/MusicDao;->getArtistNum()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/util/MainGridPreference;->saveArtist(I)V

    .line 212
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->mainPref:Lcom/arist/util/MainGridPreference;

    iget-object v1, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->musicDao:Lcom/arist/dao/MusicDao;

    .line 213
    sget-object v2, Lcom/arist/util/Constant;->BASE_DOWNLOAD_PATH:Ljava/lang/String;

    const/4 v3, 0x0

    .line 214
    sget-object v4, Lcom/arist/util/Constant;->BASE_DOWNLOAD_PATH:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    .line 213
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 212
    invoke-virtual {v1, v2}, Lcom/arist/dao/MusicDao;->getMusic(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    .line 214
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 212
    invoke-virtual {v0, v1}, Lcom/arist/util/MainGridPreference;->saveDownload(I)V

    .line 215
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->mainPref:Lcom/arist/util/MainGridPreference;

    invoke-static {}, Lcom/arist/util/FavMusicXmlUtil;->getFavMusic()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/util/MainGridPreference;->saveFav(I)V

    .line 216
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->mainPref:Lcom/arist/util/MainGridPreference;

    iget-object v1, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->musicDao:Lcom/arist/dao/MusicDao;

    invoke-virtual {v1}, Lcom/arist/dao/MusicDao;->getFolder()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/util/MainGridPreference;->saveFolder(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 219
    :goto_0
    return-void

    .line 217
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private updateMusicList()V
    .locals 1

    .prologue
    .line 193
    :try_start_0
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->musicDao:Lcom/arist/dao/MusicDao;

    invoke-virtual {v0}, Lcom/arist/dao/MusicDao;->deleteAllMusic()V

    .line 194
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->folderDao:Lcom/arist/dao/MusicFolderDao;

    invoke-virtual {v0}, Lcom/arist/dao/MusicFolderDao;->deleteAllFolder()V

    .line 197
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->musicBiz:Lcom/arist/biz/MusicBiz;

    invoke-virtual {v0}, Lcom/arist/biz/MusicBiz;->addAllMusicToDB()I

    .line 198
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->musicBiz:Lcom/arist/biz/MusicBiz;

    invoke-virtual {v0}, Lcom/arist/biz/MusicBiz;->addMusicFolderToDB()I

    .line 200
    invoke-direct {p0}, Lcom/arist/MusicPlayer/ScanMusicActivity;->initMainGrid()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 203
    :goto_0
    return-void

    .line 201
    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 48
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 49
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/ScanMusicActivity;->requestWindowFeature(I)Z

    .line 50
    const v0, 0x7f030021

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/ScanMusicActivity;->setContentView(I)V

    .line 52
    new-instance v0, Lcom/arist/dao/MusicDao;

    invoke-direct {v0, p0}, Lcom/arist/dao/MusicDao;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->musicDao:Lcom/arist/dao/MusicDao;

    .line 53
    new-instance v0, Lcom/arist/dao/MusicFolderDao;

    invoke-direct {v0, p0}, Lcom/arist/dao/MusicFolderDao;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->folderDao:Lcom/arist/dao/MusicFolderDao;

    .line 54
    new-instance v0, Lcom/arist/util/MainGridPreference;

    invoke-direct {v0, p0}, Lcom/arist/util/MainGridPreference;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->mainPref:Lcom/arist/util/MainGridPreference;

    .line 55
    new-instance v0, Lcom/arist/biz/MusicBiz;

    invoke-direct {v0, p0}, Lcom/arist/biz/MusicBiz;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->musicBiz:Lcom/arist/biz/MusicBiz;

    .line 56
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->musicBiz:Lcom/arist/biz/MusicBiz;

    iget-object v1, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->musicDao:Lcom/arist/dao/MusicDao;

    invoke-virtual {v0, v1}, Lcom/arist/biz/MusicBiz;->setMusicDao(Lcom/arist/dao/MusicDao;)V

    .line 57
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->musicBiz:Lcom/arist/biz/MusicBiz;

    iget-object v1, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->folderDao:Lcom/arist/dao/MusicFolderDao;

    invoke-virtual {v0, v1}, Lcom/arist/biz/MusicBiz;->setFolderDao(Lcom/arist/dao/MusicFolderDao;)V

    .line 59
    const v0, 0x7f0d0099

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/ScanMusicActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->tvCount:Landroid/widget/TextView;

    .line 60
    const v0, 0x7f0d009a

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/ScanMusicActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->tvTotal:Landroid/widget/TextView;

    .line 61
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->tvTotal:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    const v2, 0x7f080070

    invoke-virtual {p0, v2}, Lcom/arist/MusicPlayer/ScanMusicActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 62
    iget-object v2, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->musicBiz:Lcom/arist/biz/MusicBiz;

    invoke-virtual {v2}, Lcom/arist/biz/MusicBiz;->getTotalMusic()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 63
    const v2, 0x7f08005d

    invoke-virtual {p0, v2}, Lcom/arist/MusicPlayer/ScanMusicActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 61
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 64
    const v0, 0x7f0d009b

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/ScanMusicActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->pbScan:Landroid/widget/ProgressBar;

    .line 65
    const v0, 0x7f0d009c

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/ScanMusicActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->btnScan:Landroid/widget/Button;

    .line 66
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->btnScan:Landroid/widget/Button;

    new-instance v1, Lcom/arist/MusicPlayer/ScanMusicActivity$1;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/ScanMusicActivity$1;-><init>(Lcom/arist/MusicPlayer/ScanMusicActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 78
    const v0, 0x7f0d0097

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/ScanMusicActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/arist/MusicPlayer/ScanMusicActivity$2;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/ScanMusicActivity$2;-><init>(Lcom/arist/MusicPlayer/ScanMusicActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 86
    new-instance v0, Lcom/arist/MusicPlayer/ScanMusicActivity$3;

    invoke-direct {v0, p0}, Lcom/arist/MusicPlayer/ScanMusicActivity$3;-><init>(Lcom/arist/MusicPlayer/ScanMusicActivity;)V

    iput-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->handler:Landroid/os/Handler;

    .line 110
    new-instance v0, Lcom/arist/MusicPlayer/ScanMusicActivity$4;

    invoke-direct {v0, p0}, Lcom/arist/MusicPlayer/ScanMusicActivity$4;-><init>(Lcom/arist/MusicPlayer/ScanMusicActivity;)V

    iput-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->thread:Ljava/lang/Thread;

    .line 121
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->timer:Ljava/util/Timer;

    .line 122
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->timer:Ljava/util/Timer;

    new-instance v1, Lcom/arist/MusicPlayer/ScanMusicActivity$5;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/ScanMusicActivity$5;-><init>(Lcom/arist/MusicPlayer/ScanMusicActivity;)V

    .line 138
    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x64

    .line 122
    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    .line 139
    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 165
    :try_start_0
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->thread:Ljava/lang/Thread;

    if-eqz v0, :cond_0

    .line 166
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->thread:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->stop()V

    .line 167
    :cond_0
    iget-object v0, p0, Lcom/arist/MusicPlayer/ScanMusicActivity;->timer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 170
    :goto_0
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 171
    return-void

    .line 168
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 5
    .param p1, "keyCode"    # I
    .param p2, "event"    # Landroid/view/KeyEvent;

    .prologue
    const v3, 0x7f080052

    const/4 v4, 0x1

    .line 143
    const/4 v1, 0x4

    if-ne p1, v1, :cond_0

    .line 144
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-ne v4, v1, :cond_0

    .line 145
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 146
    .local v0, "builder":Landroid/app/AlertDialog$Builder;
    invoke-virtual {p0, v3}, Lcom/arist/MusicPlayer/ScanMusicActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 147
    const v2, 0x108009b

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 148
    const v2, 0x7f080076

    invoke-virtual {p0, v2}, Lcom/arist/MusicPlayer/ScanMusicActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 149
    invoke-virtual {p0, v3}, Lcom/arist/MusicPlayer/ScanMusicActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 150
    new-instance v3, Lcom/arist/MusicPlayer/ScanMusicActivity$6;

    invoke-direct {v3, p0}, Lcom/arist/MusicPlayer/ScanMusicActivity$6;-><init>(Lcom/arist/MusicPlayer/ScanMusicActivity;)V

    .line 149
    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 156
    const v2, 0x7f080051

    invoke-virtual {p0, v2}, Lcom/arist/MusicPlayer/ScanMusicActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 157
    invoke-virtual {v1, v4}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V

    .line 159
    .end local v0    # "builder":Landroid/app/AlertDialog$Builder;
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v1

    return v1
.end method
