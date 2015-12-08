.class public Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader;
.super Ljava/lang/Object;
.source "HttpUrlDownloader.java"

# interfaces
.implements Lcom/koushikdutta/urlimageviewhelper/UrlDownloader;


# instance fields
.field private mRequestPropertiesCallback:Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$RequestPropertiesCallback;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader;)Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$RequestPropertiesCallback;
    .locals 1
    .param p0, "x0"    # Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader;

    .prologue
    .line 15
    iget-object v0, p0, Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader;->mRequestPropertiesCallback:Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$RequestPropertiesCallback;

    return-object v0
.end method


# virtual methods
.method public allowCache()Z
    .locals 1

    .prologue
    .line 81
    const/4 v0, 0x1

    return v0
.end method

.method public canDownloadUrl(Ljava/lang/String;)Z
    .locals 1
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 86
    const-string v0, "http"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public download(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/koushikdutta/urlimageviewhelper/UrlDownloader$UrlDownloaderCallback;Ljava/lang/Runnable;)V
    .locals 6
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "filename"    # Ljava/lang/String;
    .param p4, "callback"    # Lcom/koushikdutta/urlimageviewhelper/UrlDownloader$UrlDownloaderCallback;
    .param p5, "completion"    # Ljava/lang/Runnable;

    .prologue
    .line 29
    new-instance v0, Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader$1;

    move-object v1, p0

    move-object v2, p2

    move-object v3, p1

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader$1;-><init>(Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader;Ljava/lang/String;Landroid/content/Context;Lcom/koushikdutta/urlimageviewhelper/UrlDownloader$UrlDownloaderCallback;Ljava/lang/Runnable;)V

    .line 76
    .local v0, "downloader":Landroid/os/AsyncTask;, "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Ljava/lang/Void;>;"
    invoke-static {v0}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->executeTask(Landroid/os/AsyncTask;)V

    .line 77
    return-void
.end method

.method public getRequestPropertiesCallback()Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$RequestPropertiesCallback;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader;->mRequestPropertiesCallback:Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$RequestPropertiesCallback;

    return-object v0
.end method

.method public setRequestPropertiesCallback(Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$RequestPropertiesCallback;)V
    .locals 0
    .param p1, "callback"    # Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$RequestPropertiesCallback;

    .prologue
    .line 23
    iput-object p1, p0, Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader;->mRequestPropertiesCallback:Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$RequestPropertiesCallback;

    .line 24
    return-void
.end method
