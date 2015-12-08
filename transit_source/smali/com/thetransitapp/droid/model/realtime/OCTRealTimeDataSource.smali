.class public Lcom/thetransitapp/droid/model/realtime/OCTRealTimeDataSource;
.super Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;
.source "OCTRealTimeDataSource.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x1L


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;-><init>()V

    return-void
.end method


# virtual methods
.method protected fetchPredictionForURL(Landroid/content/Context;Ljava/lang/String;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource$RealTimeCallback;)V
    .locals 8
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "itinerary"    # Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
    .param p4, "callback"    # Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource$RealTimeCallback;

    .prologue
    .line 26
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {p3, v1}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->setPredictionsFetchDate(Ljava/util/Date;)V

    .line 28
    new-instance v2, Lorg/apache/http/client/methods/HttpPost;

    invoke-direct {v2, p2}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 31
    .local v2, "postRequest":Lorg/apache/http/client/methods/HttpPost;
    :try_start_0
    new-instance v7, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-direct {v7, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 32
    .local v7, "nameValuePairs":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "appID"

    const-string v4, "2229ac35"

    invoke-direct {v1, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v7, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 33
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "apiKey"

    const-string v4, "13e1d761176e8be185b62c362d9376c3"

    invoke-direct {v1, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v7, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "routeNo"

    invoke-virtual {p3}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRealTimeRouteId()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v7, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "stopNo"

    invoke-virtual {p3}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRealTimeStopId()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v7, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    new-instance v1, Lorg/apache/http/client/entity/UrlEncodedFormEntity;

    invoke-direct {v1, v7}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;)V

    invoke-virtual {v2, v1}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 37
    const-string v1, "Content-Type"

    const-string v3, "application/x-www-form-urlencoded"

    invoke-virtual {v2, v1, v3}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .end local v7    # "nameValuePairs":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
    :goto_0
    new-instance v0, Lcom/thetransitapp/droid/model/realtime/RealTimeFetchTask;

    move-object v1, p1

    move-object v3, p0

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/thetransitapp/droid/model/realtime/RealTimeFetchTask;-><init>(Landroid/content/Context;Lorg/apache/http/client/methods/HttpRequestBase;Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource$RealTimeCallback;)V

    .line 44
    .local v0, "task":Lcom/thetransitapp/droid/model/realtime/RealTimeFetchTask;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/realtime/RealTimeFetchTask;->execute()V

    .line 45
    return-void

    .line 38
    .end local v0    # "task":Lcom/thetransitapp/droid/model/realtime/RealTimeFetchTask;
    :catch_0
    move-exception v6

    .line 39
    .local v6, "e":Ljava/io/UnsupportedEncodingException;
    const-class v1, Lcom/thetransitapp/droid/model/realtime/OCTRealTimeDataSource;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 40
    invoke-static {v6}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method protected processScheduleResponse(Ljava/lang/Object;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)Ljava/util/List;
    .locals 3
    .param p1, "object"    # Ljava/lang/Object;
    .param p2, "itinerary"    # Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/realtime/Prediction;",
            ">;"
        }
    .end annotation

    .prologue
    .line 49
    move-object v0, p1

    check-cast v0, LRaptureXML/RXMLElement;

    .line 50
    .local v0, "element":LRaptureXML/RXMLElement;
    const-string v2, "//*[local-name() = \'Route\']"

    invoke-virtual {v0, v2}, LRaptureXML/RXMLElement;->childrenWithRootXPath(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    .line 52
    .local v1, "trips":Ljava/util/ArrayList;, "Ljava/util/ArrayList<LRaptureXML/RXMLElement;>;"
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_0

    .line 53
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-super {p0, v2, p2}, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;->processScheduleResponse(Ljava/lang/Object;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)Ljava/util/List;

    move-result-object v2

    .line 55
    :goto_0
    return-object v2

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    goto :goto_0
.end method
