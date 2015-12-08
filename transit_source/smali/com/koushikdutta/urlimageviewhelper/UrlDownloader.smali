.class public interface abstract Lcom/koushikdutta/urlimageviewhelper/UrlDownloader;
.super Ljava/lang/Object;
.source "UrlDownloader.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/koushikdutta/urlimageviewhelper/UrlDownloader$UrlDownloaderCallback;
    }
.end annotation


# virtual methods
.method public abstract allowCache()Z
.end method

.method public abstract canDownloadUrl(Ljava/lang/String;)Z
.end method

.method public abstract download(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/koushikdutta/urlimageviewhelper/UrlDownloader$UrlDownloaderCallback;Ljava/lang/Runnable;)V
.end method
