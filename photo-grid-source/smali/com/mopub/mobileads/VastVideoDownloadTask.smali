.class public Lcom/mopub/mobileads/VastVideoDownloadTask;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/mopub/mobileads/VastVideoDownloadTask$VastVideoDownloadTaskListener;


# direct methods
.method public constructor <init>(Lcom/mopub/mobileads/VastVideoDownloadTask$VastVideoDownloadTaskListener;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/mopub/mobileads/VastVideoDownloadTask;->a:Lcom/mopub/mobileads/VastVideoDownloadTask$VastVideoDownloadTaskListener;

    .line 28
    return-void
.end method

.method private static varargs a([Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 32
    if-eqz p0, :cond_0

    aget-object v0, p0, v1

    if-nez v0, :cond_2

    .line 33
    :cond_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 60
    :cond_1
    :goto_0
    return-object v0

    .line 36
    :cond_2
    aget-object v0, p0, v1

    .line 37
    const/4 v1, 0x0

    .line 39
    :try_start_0
    invoke-static {}, Lcom/mopub/common/HttpClient;->getHttpClient()Landroid/net/http/AndroidHttpClient;

    move-result-object v1

    .line 40
    invoke-static {v0}, Lcom/mopub/common/HttpClient;->initializeHttpGet(Ljava/lang/String;)Lorg/apache/http/client/methods/HttpGet;

    move-result-object v2

    .line 41
    invoke-virtual {v1, v2}, Landroid/net/http/AndroidHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v2

    .line 43
    if-eqz v2, :cond_3

    invoke-interface {v2}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v3

    if-nez v3, :cond_4

    .line 44
    :cond_3
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Obtained null response from video url: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    :catch_0
    move-exception v0

    .line 56
    :try_start_1
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to download video: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 57
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 59
    if-eqz v1, :cond_1

    .line 60
    invoke-virtual {v1}, Landroid/net/http/AndroidHttpClient;->close()V

    goto :goto_0

    .line 47
    :cond_4
    :try_start_2
    invoke-interface {v2}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v3

    invoke-interface {v3}, Lorg/apache/http/HttpEntity;->getContentLength()J

    move-result-wide v4

    const-wide/32 v6, 0x1900000

    cmp-long v3, v4, v6

    if-lez v3, :cond_6

    .line 48
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Video exceeded max download size"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 59
    :catchall_0
    move-exception v0

    if-eqz v1, :cond_5

    .line 60
    invoke-virtual {v1}, Landroid/net/http/AndroidHttpClient;->close()V

    :cond_5
    throw v0

    .line 51
    :cond_6
    :try_start_3
    new-instance v3, Ljava/io/BufferedInputStream;

    invoke-interface {v2}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v2

    invoke-interface {v2}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 52
    invoke-static {v0, v3}, Lcom/mopub/common/CacheService;->putToDiskCache(Ljava/lang/String;Ljava/io/InputStream;)Z

    move-result v0

    .line 53
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 54
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-object v0

    .line 59
    if-eqz v1, :cond_1

    .line 60
    invoke-virtual {v1}, Landroid/net/http/AndroidHttpClient;->close()V

    goto/16 :goto_0
.end method

.method private a(Ljava/lang/Boolean;)V
    .locals 2

    .prologue
    .line 72
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoDownloadTask;->a:Lcom/mopub/mobileads/VastVideoDownloadTask$VastVideoDownloadTaskListener;

    if-eqz v0, :cond_0

    .line 73
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoDownloadTask;->a:Lcom/mopub/mobileads/VastVideoDownloadTask$VastVideoDownloadTaskListener;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-interface {v0, v1}, Lcom/mopub/mobileads/VastVideoDownloadTask$VastVideoDownloadTaskListener;->onComplete(Z)V

    .line 75
    :cond_0
    return-void
.end method


# virtual methods
.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 17
    check-cast p1, [Ljava/lang/String;

    invoke-static {p1}, Lcom/mopub/mobileads/VastVideoDownloadTask;->a([Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected onCancelled()V
    .locals 1

    .prologue
    .line 67
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/mopub/mobileads/VastVideoDownloadTask;->a(Ljava/lang/Boolean;)V

    .line 68
    return-void
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 17
    check-cast p1, Ljava/lang/Boolean;

    invoke-direct {p0, p1}, Lcom/mopub/mobileads/VastVideoDownloadTask;->a(Ljava/lang/Boolean;)V

    return-void
.end method
