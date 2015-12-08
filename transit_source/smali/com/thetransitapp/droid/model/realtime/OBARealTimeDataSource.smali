.class public Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource;
.super Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;
.source "OBARealTimeDataSource.java"


# static fields
.field private static final serialVersionUID:J = 0x1L


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;-><init>()V

    return-void
.end method


# virtual methods
.method protected processScheduleResponse(Ljava/lang/Object;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)Ljava/util/List;
    .locals 9
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
    .line 17
    move-object v7, p1

    check-cast v7, LRaptureXML/RXMLElement;

    .line 19
    .local v7, "element":LRaptureXML/RXMLElement;
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .local v6, "predictions":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/thetransitapp/droid/model/realtime/Prediction;>;"
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource;->getRouteFilteringKeyPath()Ljava/lang/String;

    move-result-object v2

    .line 22
    .local v2, "routeFilteringKeyPath":Ljava/lang/String;
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource;->getStopFilteringKeyPath()Ljava/lang/String;

    move-result-object v3

    .line 23
    .local v3, "stopFilteringKeyPath":Ljava/lang/String;
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource;->getTimestampFormat()Lcom/thetransitapp/droid/util/DateFormatter;

    move-result-object v5

    .line 24
    .local v5, "formatter":Lcom/thetransitapp/droid/util/DateFormatter;
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource;->getPredictionsKeyPath()Ljava/lang/String;

    move-result-object v8

    new-instance v0, Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource$1;

    move-object v1, p0

    move-object v4, p2

    invoke-direct/range {v0 .. v6}, Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource$1;-><init>(Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource;Ljava/lang/String;Ljava/lang/String;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;Lcom/thetransitapp/droid/util/DateFormatter;Ljava/util/ArrayList;)V

    invoke-virtual {v7, v8, v0}, LRaptureXML/RXMLElement;->iterate(Ljava/lang/String;LRaptureXML/RXMLElement$Block;)V

    .line 47
    return-object v6
.end method
