.class public Lcom/thetransitapp/droid/model/realtime/RealTimeFetchTask;
.super Lcom/thetransitapp/droid/service/BaseServiceTask;
.source "RealTimeFetchTask.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/thetransitapp/droid/service/BaseServiceTask",
        "<",
        "Ljava/util/List",
        "<",
        "Lcom/thetransitapp/droid/model/realtime/Prediction;",
        ">;>;"
    }
.end annotation


# instance fields
.field private callback:Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource$RealTimeCallback;

.field private dataSource:Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;

.field private itinerary:Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

.field private request:Lorg/apache/http/client/methods/HttpRequestBase;

.field private result:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/realtime/Prediction;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lorg/apache/http/client/methods/HttpRequestBase;Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource$RealTimeCallback;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "request"    # Lorg/apache/http/client/methods/HttpRequestBase;
    .param p3, "dataSource"    # Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;
    .param p4, "itinerary"    # Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
    .param p5, "callback"    # Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource$RealTimeCallback;

    .prologue
    .line 30
    invoke-direct {p0, p1}, Lcom/thetransitapp/droid/service/BaseServiceTask;-><init>(Landroid/content/Context;)V

    .line 31
    iput-object p4, p0, Lcom/thetransitapp/droid/model/realtime/RealTimeFetchTask;->itinerary:Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    .line 32
    iput-object p5, p0, Lcom/thetransitapp/droid/model/realtime/RealTimeFetchTask;->callback:Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource$RealTimeCallback;

    .line 33
    iput-object p3, p0, Lcom/thetransitapp/droid/model/realtime/RealTimeFetchTask;->dataSource:Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;

    .line 34
    iput-object p2, p0, Lcom/thetransitapp/droid/model/realtime/RealTimeFetchTask;->request:Lorg/apache/http/client/methods/HttpRequestBase;

    .line 35
    return-void
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 1
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/RealTimeFetchTask;->call()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public call()Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/realtime/Prediction;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    const/4 v7, 0x0

    .line 39
    const-string v8, "Calling URL"

    iget-object v9, p0, Lcom/thetransitapp/droid/model/realtime/RealTimeFetchTask;->request:Lorg/apache/http/client/methods/HttpRequestBase;

    invoke-virtual {v9}, Lorg/apache/http/client/methods/HttpRequestBase;->getURI()Ljava/net/URI;

    move-result-object v9

    invoke-virtual {v9}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    invoke-static {v7}, Landroid/net/http/AndroidHttpClient;->newInstance(Ljava/lang/String;)Landroid/net/http/AndroidHttpClient;

    move-result-object v0

    .line 42
    .local v0, "client":Landroid/net/http/AndroidHttpClient;
    iget-object v5, p0, Lcom/thetransitapp/droid/model/realtime/RealTimeFetchTask;->request:Lorg/apache/http/client/methods/HttpRequestBase;

    .line 45
    .local v5, "request":Lorg/apache/http/client/methods/HttpRequestBase;
    :try_start_0
    invoke-static {v5}, Landroid/net/http/AndroidHttpClient;->modifyRequestToAcceptGzipResponse(Lorg/apache/http/HttpRequest;)V

    .line 46
    invoke-virtual {v0, v5}, Landroid/net/http/AndroidHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v3

    .line 48
    .local v3, "httpResponse":Lorg/apache/http/HttpResponse;
    invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v8

    invoke-interface {v8}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v8

    const/16 v9, 0x12c

    if-lt v8, v9, :cond_2

    .line 49
    new-instance v8, Lorg/apache/http/HttpException;

    invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v9

    invoke-interface {v9}, Lorg/apache/http/StatusLine;->getReasonPhrase()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Lorg/apache/http/HttpException;-><init>(Ljava/lang/String;)V

    throw v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    .end local v3    # "httpResponse":Lorg/apache/http/HttpResponse;
    :catch_0
    move-exception v1

    .line 63
    .local v1, "e":Ljava/lang/Exception;
    if-eqz v0, :cond_0

    .line 64
    invoke-virtual {v0}, Landroid/net/http/AndroidHttpClient;->close()V

    .line 67
    :cond_0
    instance-of v8, v1, Lorg/apache/http/HttpException;

    if-nez v8, :cond_1

    .line 68
    const-class v8, Lcom/thetransitapp/droid/model/realtime/RealTimeFetchTask;

    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 69
    invoke-static {v1}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    .line 72
    .end local v1    # "e":Ljava/lang/Exception;
    :cond_1
    :goto_0
    return-object v7

    .line 52
    .restart local v3    # "httpResponse":Lorg/apache/http/HttpResponse;
    :cond_2
    :try_start_1
    invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v2

    .line 53
    .local v2, "entity":Lorg/apache/http/HttpEntity;
    if-eqz v2, :cond_1

    .line 54
    invoke-static {v2}, Landroid/net/http/AndroidHttpClient;->getUngzippedContent(Lorg/apache/http/HttpEntity;)Ljava/io/InputStream;

    move-result-object v4

    .line 55
    .local v4, "input":Ljava/io/InputStream;
    iget-object v8, p0, Lcom/thetransitapp/droid/model/realtime/RealTimeFetchTask;->dataSource:Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;

    invoke-virtual {v8, v4}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->parseStream(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v6

    .line 56
    .local v6, "value":Ljava/lang/Object;
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V

    .line 57
    invoke-virtual {v0}, Landroid/net/http/AndroidHttpClient;->close()V

    .line 59
    iget-object v8, p0, Lcom/thetransitapp/droid/model/realtime/RealTimeFetchTask;->dataSource:Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;

    iget-object v9, p0, Lcom/thetransitapp/droid/model/realtime/RealTimeFetchTask;->itinerary:Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    invoke-virtual {v8, v6, v9}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->processScheduleResponse(Ljava/lang/Object;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)Ljava/util/List;

    move-result-object v8

    iput-object v8, p0, Lcom/thetransitapp/droid/model/realtime/RealTimeFetchTask;->result:Ljava/util/List;

    .line 60
    iget-object v7, p0, Lcom/thetransitapp/droid/model/realtime/RealTimeFetchTask;->result:Ljava/util/List;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method

.method protected onFinally()V
    .locals 3

    .prologue
    .line 77
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/RealTimeFetchTask;->result:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 78
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/RealTimeFetchTask;->dataSource:Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;

    iget-object v1, p0, Lcom/thetransitapp/droid/model/realtime/RealTimeFetchTask;->result:Ljava/util/List;

    iget-object v2, p0, Lcom/thetransitapp/droid/model/realtime/RealTimeFetchTask;->itinerary:Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    invoke-virtual {v0, v1, v2}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->assignPredictionsWithScheduleItems(Ljava/util/List;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)V

    .line 81
    :cond_0
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/RealTimeFetchTask;->callback:Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource$RealTimeCallback;

    if-eqz v0, :cond_1

    .line 82
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/RealTimeFetchTask;->callback:Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource$RealTimeCallback;

    invoke-interface {v0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource$RealTimeCallback;->didAssignRealTime()V

    .line 83
    :cond_1
    return-void
.end method
