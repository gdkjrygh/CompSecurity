.class public Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;
.super Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;
.source "XMLRealTimeDataSource.java"


# static fields
.field private static final serialVersionUID:J = 0x1L


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;-><init>()V

    return-void
.end method


# virtual methods
.method protected objectAtKeyPath(LRaptureXML/RXMLElement;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "element"    # LRaptureXML/RXMLElement;
    .param p2, "keyPath"    # Ljava/lang/String;

    .prologue
    const/4 v1, 0x0

    .line 97
    if-nez p2, :cond_1

    .line 110
    :cond_0
    :goto_0
    return-object v1

    .line 100
    :cond_1
    const-string v2, ".."

    invoke-virtual {p2, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "//"

    invoke-virtual {p2, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 101
    :cond_2
    invoke-virtual {p1, p2}, LRaptureXML/RXMLElement;->childrenWithRootXPath(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 103
    .local v0, "children":Ljava/util/ArrayList;, "Ljava/util/ArrayList<LRaptureXML/RXMLElement;>;"
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 104
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LRaptureXML/RXMLElement;

    invoke-virtual {v1}, LRaptureXML/RXMLElement;->text()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 107
    .end local v0    # "children":Ljava/util/ArrayList;, "Ljava/util/ArrayList<LRaptureXML/RXMLElement;>;"
    :cond_3
    invoke-virtual {p1, p2}, LRaptureXML/RXMLElement;->child(Ljava/lang/String;)LRaptureXML/RXMLElement;

    move-result-object v1

    invoke-virtual {v1}, LRaptureXML/RXMLElement;->text()Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method

.method public parseStream(Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 2
    .param p1, "inputStream"    # Ljava/io/InputStream;

    .prologue
    .line 20
    invoke-static {p1}, Lcom/thetransitapp/droid/util/ServiceUtility;->convertStreamToString(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v1

    .line 22
    .local v1, "result":Ljava/lang/String;
    new-instance v0, LRaptureXML/RXMLElement;

    invoke-direct {v0, v1}, LRaptureXML/RXMLElement;-><init>(Ljava/lang/String;)V

    .line 23
    .local v0, "element":LRaptureXML/RXMLElement;
    return-object v0
.end method

.method protected processScheduleResponse(Ljava/lang/Object;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)Ljava/util/List;
    .locals 14
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
    .line 28
    move-object v13, p1

    check-cast v13, LRaptureXML/RXMLElement;

    .line 30
    .local v13, "element":LRaptureXML/RXMLElement;
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .local v12, "predictions":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/thetransitapp/droid/model/realtime/Prediction;>;"
    move-object v9, p0

    .line 33
    .local v9, "dataSource":Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;->getRouteFilteringKeyPath()Ljava/lang/String;

    move-result-object v2

    .line 34
    .local v2, "routeFilteringKeyPath":Ljava/lang/String;
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;->getStopFilteringKeyPath()Ljava/lang/String;

    move-result-object v3

    .line 35
    .local v3, "stopFilteringKeyPath":Ljava/lang/String;
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;->getTimestampKeyPath()Ljava/lang/String;

    move-result-object v5

    .line 36
    .local v5, "timestampKeyPath":Ljava/lang/String;
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;->getDateKeyPath()Ljava/lang/String;

    move-result-object v6

    .line 37
    .local v6, "dateKeyPath":Ljava/lang/String;
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;->getScheduleBasedKeyPath()Ljava/lang/String;

    move-result-object v8

    .line 38
    .local v8, "scheduleBasedKeyPath":Ljava/lang/String;
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;->getCancelledKeyPath()Ljava/lang/String;

    move-result-object v10

    .line 39
    .local v10, "cancelledKeyPath":Ljava/lang/String;
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;->getDestinationFilteringKeyPath()Ljava/lang/String;

    move-result-object v11

    .line 40
    .local v11, "destinationKeyPath":Ljava/lang/String;
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;->getTimestampFormat()Lcom/thetransitapp/droid/util/DateFormatter;

    move-result-object v7

    .line 42
    .local v7, "formatter":Lcom/thetransitapp/droid/util/DateFormatter;
    new-instance v0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;

    move-object v1, p0

    move-object/from16 v4, p2

    invoke-direct/range {v0 .. v12}, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;-><init>(Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;Ljava/lang/String;Ljava/lang/String;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;Ljava/lang/String;Ljava/lang/String;Lcom/thetransitapp/droid/util/DateFormatter;Ljava/lang/String;Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 87
    .local v0, "block":LRaptureXML/RXMLElement$Block;
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;->getPredictionsKeyPath()Ljava/lang/String;

    move-result-object v1

    const-string v4, "//"

    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 88
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;->getPredictionsKeyPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13, v1, v0}, LRaptureXML/RXMLElement;->iterateWithRootXPath(Ljava/lang/String;LRaptureXML/RXMLElement$Block;)V

    .line 93
    :goto_0
    return-object v12

    .line 90
    :cond_0
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;->getPredictionsKeyPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13, v1, v0}, LRaptureXML/RXMLElement;->iterate(Ljava/lang/String;LRaptureXML/RXMLElement$Block;)V

    goto :goto_0
.end method
