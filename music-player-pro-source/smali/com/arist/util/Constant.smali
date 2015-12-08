.class public Lcom/arist/util/Constant;
.super Ljava/lang/Object;
.source "Constant.java"


# static fields
.field public static final ACTION_ALBUM_PIC_CHANGED:Ljava/lang/String; = "com.MediaPlayer.action.ALBUM_PIC_CHANGED"

.field public static final ACTION_DESTORY:Ljava/lang/String; = "com.MediaPlayer.action.DESTORY"

.field public static final ACTION_DISS_DIALOG:Ljava/lang/String; = "com.MediaPlayer.action.DISS_DIALOG"

.field public static final ACTION_MEDIAPLAYER_INFO:Ljava/lang/String; = "com.MediaPlayer.action.MEDIAPLAYER_INFO"

.field public static final ACTION_MEDIA_BUTTON_PRESSED:Ljava/lang/String; = "com.MediaPlayer.action.MEDIA_BUTTON_PRESSED"

.field public static final ACTION_MEDIA_SCANNER_SCAN_DIR:Ljava/lang/String; = "android.intent.action.MEDIA_SCANNER_SCAN_DIR"

.field public static final ACTION_MUSIC_CHANGED:Ljava/lang/String; = "com.MediaPlayer.action.MUSIC_CHANGED"

.field public static final ACTION_NET_MUSIC_BUFFERING:Ljava/lang/String; = "com.MediaPlayer.action.NET_MUSIC_BUFFERING"

.field public static final ACTION_NET_PLAY:Ljava/lang/String; = "com.MediaPlayer.action.NET_PLAY"

.field public static final ACTION_NEXT:Ljava/lang/String; = "com.MediaPlayer.action.NEXT"

.field public static final ACTION_PLAY:Ljava/lang/String; = "com.MediaPlayer.action.PLAY"

.field public static final ACTION_PLAY_STATUS:Ljava/lang/String; = "com.MediaPlayer.action.PLAY_STATUS"

.field public static final ACTION_PREVIOUS:Ljava/lang/String; = "com.MediaPlayer.action.PREVIOUS"

.field public static final ACTION_SEEK:Ljava/lang/String; = "com.MediaPlayer.action.SEEK"

.field public static final ACTION_SET_PLAY_MODE:Ljava/lang/String; = "com.MediaPlayer.action.PALY_MODE"

.field public static final ACTION_SHOW_MUSICLIST:Ljava/lang/String; = "com.MediaPlayer.action.SHOW_MUSICLIST"

.field public static final ACTION_START_BUFFERING:Ljava/lang/String; = "start buffering"

.field public static final ACTION_START_SLEEP:Ljava/lang/String; = "com.MediaPlayer.action.START_SLEEP"

.field public static final ACTION_STAR_THREAD:Ljava/lang/String; = "com.MediaPlayer.action.STAR_THREA"

.field public static final ACTION_STATUS_CHANGED:Ljava/lang/String; = "com.MediaPlayer.action.STATUS_CHANGED"

.field public static final ACTION_STOP_BUFFERING:Ljava/lang/String; = "buffering complete"

.field public static final ACTION_UPDATE_NETMUEIC_VIEW:Ljava/lang/String; = "com.MediaPlayer.action.UPDATE_NETMUEIC_VIEW"

.field public static final ACTION_WIDGET_EXIT:Ljava/lang/String; = "com.MediaPlayer.action.WIDGET_EXIT"

.field public static final ACTION_WIDGET_NEXT:Ljava/lang/String; = "com.MediaPlayer.action.WIDGET_NEXT"

.field public static final ACTION_WIDGET_PLAY:Ljava/lang/String; = "com.MediaPlayer.action.WIDGET_PLAY"

.field public static final ACTION_WIDGET_PREVIOUS:Ljava/lang/String; = "com.MediaPlayer.action.WIDGET_PREVIOUS"

.field public static final BASE_ABLUM_CACHES_PATH:Ljava/lang/String;

.field public static final BASE_ABLUM_PATH:Ljava/lang/String;

.field public static final BASE_DOWNLOAD_PATH:Ljava/lang/String;

.field public static final BASE_FAV_PATH:Ljava/lang/String;

.field public static final BASE_FILE_PATH:Ljava/lang/String;

.field public static final BASE_LYRIC_PATH:Ljava/lang/String;

.field public static final DOWNLOAD_MUSIC_Format:Ljava/lang/String; = ".mp3"

.field public static final DOWNLOAD_PIC_Format:Ljava/lang/String; = ".jpg"

.field public static final LIST_CYCLE:I = 0x1

.field public static final LIST_ONCE:I = 0x3

.field public static final LIST_RAND:I = 0x4

.field public static final MENU_CONTEXT_DETAILS:I = 0x1

.field public static final MENU_CONTEXT_DOWNLOAD:I = 0x2

.field public static final MSG_TAG_UPDATE_PROGRESS:I = 0x6

.field public static final MUSIC_LIST_SEARCH:I = 0x8

.field public static final NET_MUSIC_LOADING:I = 0x7

.field public static final NET_MUSIC_SEARCH:I = 0x9

.field public static final NET_SEARCH_EMPTY:I = 0xa

.field public static final NOTIFY_MUSIC_PLAYER_ID:I = 0x1

.field public static final SEEK_UPDATE_NEXT:I = 0x1

.field public static final SEEK_UPDATE_PRE:I = 0x2

.field public static final SHOW_LYRIC:I = 0x3

.field public static final SINGLE_CYCLE:I = 0x2

.field public static final STATUS_NOT_PLAY:I = 0x1

.field public static final STATUS_PAUSE:I = 0x3

.field public static final STATUS_PLAYING:I = 0x2

.field public static final XML_PULL_FAILED:I = 0x5

.field public static final XML_PULL_SUCESS:I = 0x4

.field public static final albumButtonSelected:I = 0x3

.field public static final allMusicButtonSelected:I = 0x1

.field public static final artistButtonSelected:I = 0x2

.field public static final downloadButtonSelected:I = 0x7

.field public static final favritorButtonSelected:I = 0x5

.field public static final folderButtonSelected:I = 0x4

.field public static final musicFolderSelected:I = 0x6f

.field public static final recentAddButtonSelected:I = 0x6

.field public static final rootDir:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 50
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    .line 49
    sput-object v0, Lcom/arist/util/Constant;->rootDir:Ljava/lang/String;

    .line 51
    new-instance v0, Ljava/lang/StringBuilder;

    sget-object v1, Lcom/arist/util/Constant;->rootDir:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    const-string v1, "/MusicPlayer/lyrics/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/arist/util/Constant;->BASE_LYRIC_PATH:Ljava/lang/String;

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    sget-object v1, Lcom/arist/util/Constant;->rootDir:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    const-string v1, "/MusicPlayer/files/favorite.xml"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 53
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/arist/util/Constant;->BASE_FAV_PATH:Ljava/lang/String;

    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    sget-object v1, Lcom/arist/util/Constant;->rootDir:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "/MusicPlayer/files/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/arist/util/Constant;->BASE_FILE_PATH:Ljava/lang/String;

    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    sget-object v1, Lcom/arist/util/Constant;->rootDir:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    const-string v1, "/MusicPlayer/musics/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/arist/util/Constant;->BASE_DOWNLOAD_PATH:Ljava/lang/String;

    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    sget-object v1, Lcom/arist/util/Constant;->rootDir:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    const-string v1, "/MusicPlayer/albumimgs/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/arist/util/Constant;->BASE_ABLUM_PATH:Ljava/lang/String;

    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    sget-object v1, Lcom/arist/util/Constant;->rootDir:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    const-string v1, "/MusicPlayer/albumimgs_caches/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/arist/util/Constant;->BASE_ABLUM_CACHES_PATH:Ljava/lang/String;

    .line 100
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
