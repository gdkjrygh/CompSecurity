.class Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader$1;
.super Landroid/os/AsyncTask;
.source "HttpUrlDownloader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader;->download(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/koushikdutta/urlimageviewhelper/UrlDownloader$UrlDownloaderCallback;Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader;

.field final synthetic val$callback:Lcom/koushikdutta/urlimageviewhelper/UrlDownloader$UrlDownloaderCallback;

.field final synthetic val$completion:Ljava/lang/Runnable;

.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$url:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader;Ljava/lang/String;Landroid/content/Context;Lcom/koushikdutta/urlimageviewhelper/UrlDownloader$UrlDownloaderCallback;Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 29
    iput-object p1, p0, Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader$1;->this$0:Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader;

    iput-object p2, p0, Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader$1;->val$url:Ljava/lang/String;

    iput-object p3, p0, Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader$1;->val$context:Landroid/content/Context;

    iput-object p4, p0, Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader$1;->val$callback:Lcom/koushikdutta/urlimageviewhelper/UrlDownloader$UrlDownloaderCallback;

    iput-object p5, p0, Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader$1;->val$completion:Ljava/lang/Runnable;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # [Ljava/lang/Object;

    .prologue
    .line 29
    check-cast p1, [Ljava/lang/Void;

    .end local p1    # "x0":[Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader$1;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 12
    .param p1, "params"    # [Ljava/lang/Void;

    .prologue
    const/4 v11, 0x0

    .line 33
    const/4 v2, 0x0

    .line 35
    .local v2, "is":Ljava/io/InputStream;
    :try_start_0
    iget-object v5, p0, Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader$1;->val$url:Ljava/lang/String;

    .line 38
    .local v5, "thisUrl":Ljava/lang/String;
    :goto_0
    new-instance v6, Ljava/net/URL;

    invoke-direct {v6, v5}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 39
    .local v6, "u":Ljava/net/URL;
    invoke-virtual {v6}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v7

    check-cast v7, Ljava/net/HttpURLConnection;

    .line 40
    .local v7, "urlConnection":Ljava/net/HttpURLConnection;
    const/4 v8, 0x1

    invoke-virtual {v7, v8}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 42
    iget-object v8, p0, Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader$1;->this$0:Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader;

    # getter for: Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader;->mRequestPropertiesCallback:Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$RequestPropertiesCallback;
    invoke-static {v8}, Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader;->access$000(Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader;)Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$RequestPropertiesCallback;

    move-result-object v8

    if-eqz v8, :cond_0

    .line 43
    iget-object v8, p0, Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader$1;->this$0:Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader;

    # getter for: Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader;->mRequestPropertiesCallback:Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$RequestPropertiesCallback;
    invoke-static {v8}, Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader;->access$000(Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader;)Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$RequestPropertiesCallback;

    move-result-object v8

    iget-object v9, p0, Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader$1;->val$context:Landroid/content/Context;

    iget-object v10, p0, Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader$1;->val$url:Ljava/lang/String;

    invoke-interface {v8, v9, v10}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$RequestPropertiesCallback;->getHeadersForRequest(Landroid/content/Context;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    .line 44
    .local v4, "props":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lorg/apache/http/NameValuePair;>;"
    if-eqz v4, :cond_0

    .line 45
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/apache/http/NameValuePair;

    .line 46
    .local v3, "pair":Lorg/apache/http/NameValuePair;
    invoke-interface {v3}, Lorg/apache/http/NameValuePair;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v3}, Lorg/apache/http/NameValuePair;->getValue()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 64
    .end local v1    # "i$":Ljava/util/Iterator;
    .end local v3    # "pair":Lorg/apache/http/NameValuePair;
    .end local v4    # "props":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lorg/apache/http/NameValuePair;>;"
    .end local v5    # "thisUrl":Ljava/lang/String;
    .end local v6    # "u":Ljava/net/URL;
    .end local v7    # "urlConnection":Ljava/net/HttpURLConnection;
    :catch_0
    move-exception v0

    .line 65
    .local v0, "e":Ljava/lang/Throwable;
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 66
    .end local v0    # "e":Ljava/lang/Throwable;
    :goto_2
    return-object v11

    .line 51
    .restart local v5    # "thisUrl":Ljava/lang/String;
    .restart local v6    # "u":Ljava/net/URL;
    .restart local v7    # "urlConnection":Ljava/net/HttpURLConnection;
    :cond_0
    :try_start_1
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v8

    const/16 v9, 0x12e

    if-eq v8, v9, :cond_1

    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v8

    const/16 v9, 0x12d

    if-eq v8, v9, :cond_1

    .line 56
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v8

    const/16 v9, 0xc8

    if-eq v8, v9, :cond_2

    .line 57
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Response Code: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    new-array v9, v9, [Ljava/lang/Object;

    invoke-static {v8, v9}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;->clog(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 53
    :cond_1
    const-string v8, "Location"

    invoke-virtual {v7, v8}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 54
    goto/16 :goto_0

    .line 60
    :cond_2
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    .line 61
    iget-object v8, p0, Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader$1;->val$callback:Lcom/koushikdutta/urlimageviewhelper/UrlDownloader$UrlDownloaderCallback;

    iget-object v9, p0, Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader$1;->this$0:Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader;

    const/4 v10, 0x0

    invoke-interface {v8, v9, v2, v10}, Lcom/koushikdutta/urlimageviewhelper/UrlDownloader$UrlDownloaderCallback;->onDownloadComplete(Lcom/koushikdutta/urlimageviewhelper/UrlDownloader;Ljava/io/InputStream;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 29
    check-cast p1, Ljava/lang/Void;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader$1;->onPostExecute(Ljava/lang/Void;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Void;)V
    .locals 1
    .param p1, "result"    # Ljava/lang/Void;

    .prologue
    .line 72
    iget-object v0, p0, Lcom/koushikdutta/urlimageviewhelper/HttpUrlDownloader$1;->val$completion:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 73
    return-void
.end method
