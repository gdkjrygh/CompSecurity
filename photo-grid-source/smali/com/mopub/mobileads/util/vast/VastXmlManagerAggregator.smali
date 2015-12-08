.class public Lcom/mopub/mobileads/util/vast/VastXmlManagerAggregator;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Ljava/util/List",
        "<",
        "Lcom/mopub/mobileads/util/vast/b;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/mopub/mobileads/util/vast/e;",
            ">;"
        }
    .end annotation
.end field

.field private b:I


# direct methods
.method constructor <init>(Lcom/mopub/mobileads/util/vast/e;)V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 30
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/mopub/mobileads/util/vast/VastXmlManagerAggregator;->a:Ljava/lang/ref/WeakReference;

    .line 32
    return-void
.end method

.method private varargs a([Ljava/lang/String;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/mopub/mobileads/util/vast/b;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 36
    .line 39
    :try_start_0
    invoke-static {}, Lcom/mopub/common/HttpClient;->getHttpClient()Landroid/net/http/AndroidHttpClient;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 40
    if-eqz p1, :cond_5

    :try_start_1
    array-length v0, p1

    if-lez v0, :cond_5

    .line 41
    const/4 v0, 0x0

    aget-object v0, p1, v0

    .line 43
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 44
    :goto_0
    if-eqz v0, :cond_2

    :try_start_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_2

    invoke-virtual {p0}, Lcom/mopub/mobileads/util/vast/VastXmlManagerAggregator;->isCancelled()Z

    move-result v4

    if-nez v4, :cond_2

    .line 45
    new-instance v4, Lcom/mopub/mobileads/util/vast/b;

    invoke-direct {v4}, Lcom/mopub/mobileads/util/vast/b;-><init>()V

    .line 46
    invoke-virtual {v4, v0}, Lcom/mopub/mobileads/util/vast/b;->a(Ljava/lang/String;)V

    .line 47
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    invoke-virtual {v4}, Lcom/mopub/mobileads/util/vast/b;->a()Ljava/lang/String;

    move-result-object v0

    .line 1079
    if-eqz v0, :cond_1

    iget v4, p0, Lcom/mopub/mobileads/util/vast/VastXmlManagerAggregator;->b:I

    const/16 v5, 0x14

    if-ge v4, v5, :cond_1

    .line 1080
    iget v4, p0, Lcom/mopub/mobileads/util/vast/VastXmlManagerAggregator;->b:I

    add-int/lit8 v4, v4, 0x1

    iput v4, p0, Lcom/mopub/mobileads/util/vast/VastXmlManagerAggregator;->b:I

    .line 1082
    invoke-static {v0}, Lcom/mopub/common/HttpClient;->initializeHttpGet(Ljava/lang/String;)Lorg/apache/http/client/methods/HttpGet;

    move-result-object v0

    .line 1083
    invoke-virtual {v2, v0}, Landroid/net/http/AndroidHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v0

    .line 1084
    invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    .line 1085
    if-eqz v0, :cond_0

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/util/Strings;->fromStream(Ljava/io/InputStream;)Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    goto :goto_0

    :cond_1
    move-object v0, v1

    .line 1087
    goto :goto_0

    :cond_2
    move-object v0, v3

    .line 54
    :goto_1
    if-eqz v2, :cond_3

    .line 55
    invoke-virtual {v2}, Landroid/net/http/AndroidHttpClient;->close()V

    .line 59
    :cond_3
    :goto_2
    return-object v0

    .line 51
    :catch_0
    move-exception v0

    move-object v2, v1

    move-object v6, v0

    move-object v0, v1

    move-object v1, v6

    .line 52
    :goto_3
    :try_start_3
    const-string v3, "Failed to parse VAST XML"

    invoke-static {v3, v1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 54
    if-eqz v2, :cond_3

    .line 55
    invoke-virtual {v2}, Landroid/net/http/AndroidHttpClient;->close()V

    goto :goto_2

    .line 54
    :catchall_0
    move-exception v0

    move-object v2, v1

    :goto_4
    if-eqz v2, :cond_4

    .line 55
    invoke-virtual {v2}, Landroid/net/http/AndroidHttpClient;->close()V

    :cond_4
    throw v0

    .line 54
    :catchall_1
    move-exception v0

    goto :goto_4

    .line 51
    :catch_1
    move-exception v0

    move-object v6, v0

    move-object v0, v1

    move-object v1, v6

    goto :goto_3

    :catch_2
    move-exception v0

    move-object v1, v0

    move-object v0, v3

    goto :goto_3

    :cond_5
    move-object v0, v1

    goto :goto_1
.end method


# virtual methods
.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 18
    check-cast p1, [Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/mopub/mobileads/util/vast/VastXmlManagerAggregator;->a([Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected onCancelled()V
    .locals 2

    .prologue
    .line 72
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastXmlManagerAggregator;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/mobileads/util/vast/e;

    .line 73
    if-eqz v0, :cond_0

    .line 74
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/mopub/mobileads/util/vast/e;->onAggregationComplete(Ljava/util/List;)V

    .line 76
    :cond_0
    return-void
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 18
    check-cast p1, Ljava/util/List;

    .line 2064
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/VastXmlManagerAggregator;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/mobileads/util/vast/e;

    .line 2065
    if-eqz v0, :cond_0

    .line 2066
    invoke-interface {v0, p1}, Lcom/mopub/mobileads/util/vast/e;->onAggregationComplete(Ljava/util/List;)V

    .line 18
    :cond_0
    return-void
.end method
