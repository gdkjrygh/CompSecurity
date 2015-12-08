.class Lcom/arist/MusicPlayer/MainActivity$2;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/arist/MusicPlayer/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/MusicPlayer/MainActivity;


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/MainActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$2;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 1324
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMediaScannerConnected()V
    .locals 3

    .prologue
    .line 1328
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$2;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->mediaScannerConnection:Landroid/media/MediaScannerConnection;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MainActivity;->access$3(Lcom/arist/MusicPlayer/MainActivity;)Landroid/media/MediaScannerConnection;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    sget-object v2, Lcom/arist/util/Constant;->BASE_DOWNLOAD_PATH:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1329
    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$2;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->downloadMusicName:Ljava/lang/String;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity;->access$4(Lcom/arist/MusicPlayer/MainActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".mp3"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 1328
    invoke-virtual {v0, v1, v2}, Landroid/media/MediaScannerConnection;->scanFile(Ljava/lang/String;Ljava/lang/String;)V

    .line 1330
    return-void
.end method

.method public onScanCompleted(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 2
    .param p1, "path"    # Ljava/lang/String;
    .param p2, "uri"    # Landroid/net/Uri;

    .prologue
    .line 1334
    new-instance v0, Ljava/lang/StringBuilder;

    sget-object v1, Lcom/arist/util/Constant;->BASE_DOWNLOAD_PATH:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$2;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->downloadMusicName:Ljava/lang/String;
    invoke-static {v1}, Lcom/arist/MusicPlayer/MainActivity;->access$4(Lcom/arist/MusicPlayer/MainActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1335
    const-string v1, ".mp3"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1334
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 1335
    if-eqz v0, :cond_0

    .line 1337
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$2;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->musicDao:Lcom/arist/dao/MusicDao;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MainActivity;->access$5(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/dao/MusicDao;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/dao/MusicDao;->deleteAllMusic()V

    .line 1338
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$2;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->folderDao:Lcom/arist/dao/MusicFolderDao;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MainActivity;->access$6(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/dao/MusicFolderDao;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/dao/MusicFolderDao;->deleteAllFolder()V

    .line 1339
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$2;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->musicBiz:Lcom/arist/biz/MusicBiz;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MainActivity;->access$7(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/biz/MusicBiz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/biz/MusicBiz;->addAllMusicToDB()I

    .line 1340
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$2;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->musicBiz:Lcom/arist/biz/MusicBiz;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MainActivity;->access$7(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/biz/MusicBiz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/biz/MusicBiz;->addMusicFolderToDB()I

    .line 1341
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$2;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # invokes: Lcom/arist/MusicPlayer/MainActivity;->resetSetMainGrid()V
    invoke-static {v0}, Lcom/arist/MusicPlayer/MainActivity;->access$8(Lcom/arist/MusicPlayer/MainActivity;)V

    .line 1343
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$2;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->mediaScannerConnection:Landroid/media/MediaScannerConnection;
    invoke-static {v0}, Lcom/arist/MusicPlayer/MainActivity;->access$3(Lcom/arist/MusicPlayer/MainActivity;)Landroid/media/MediaScannerConnection;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaScannerConnection;->disconnect()V

    .line 1345
    :cond_0
    return-void
.end method
