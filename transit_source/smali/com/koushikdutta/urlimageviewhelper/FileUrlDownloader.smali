.class public Lcom/koushikdutta/urlimageviewhelper/FileUrlDownloader;
.super Ljava/lang/Object;
.source "FileUrlDownloader.java"

# interfaces
.implements Lcom/koushikdutta/urlimageviewhelper/UrlDownloader;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public allowCache()Z
    .locals 1

    .prologue
    .line 36
    const/4 v0, 0x0

    return v0
.end method

.method public canDownloadUrl(Ljava/lang/String;)Z
    .locals 1
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 41
    const-string v0, "file:/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public download(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/koushikdutta/urlimageviewhelper/UrlDownloader$UrlDownloaderCallback;Ljava/lang/Runnable;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "filename"    # Ljava/lang/String;
    .param p4, "callback"    # Lcom/koushikdutta/urlimageviewhelper/UrlDownloader$UrlDownloaderCallback;
    .param p5, "completion"    # Ljava/lang/Runnable;

    .prologue
    .line 12
    new-instance v0, Lcom/koushikdutta/urlimageviewhelper/FileUrlDownloader$1;

    invoke-direct {v0, p0, p4, p2, p5}, Lcom/koushikdutta/urlimageviewhelper/FileUrlDownloader$1;-><init>(Lcom/koushikdutta/urlimageviewhelper/FileUrlDownloader;Lcom/koushikdutta/urlimageviewhelper/UrlDownloader$UrlDownloaderCallback;Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 31
    .local v0, "downloader":Landroid/os/AsyncTask;, "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Ljava/lang/Void;>;"
    invoke-static {v0}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->executeTask(Landroid/os/AsyncTask;)V

    .line 32
    return-void
.end method
