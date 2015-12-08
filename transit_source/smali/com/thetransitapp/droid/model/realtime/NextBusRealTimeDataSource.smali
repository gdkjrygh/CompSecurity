.class public Lcom/thetransitapp/droid/model/realtime/NextBusRealTimeDataSource;
.super Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;
.source "NextBusRealTimeDataSource.java"


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private agencyTag:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;-><init>()V

    return-void
.end method


# virtual methods
.method public getAgencyTag()Ljava/lang/String;
    .locals 1

    .prologue
    .line 14
    iget-object v0, p0, Lcom/thetransitapp/droid/model/realtime/NextBusRealTimeDataSource;->agencyTag:Ljava/lang/String;

    return-object v0
.end method

.method protected processScheduleResponse(Ljava/lang/Object;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)Ljava/util/List;
    .locals 11
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
    .line 23
    move-object v4, p1

    check-cast v4, LRaptureXML/RXMLElement;

    .line 24
    .local v4, "element":LRaptureXML/RXMLElement;
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .local v6, "predictions":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/thetransitapp/droid/model/realtime/Prediction;>;"
    const-string v8, "predictions"

    invoke-virtual {v4, v8}, LRaptureXML/RXMLElement;->children(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v7

    .line 28
    .local v7, "predictionsElements":Ljava/util/ArrayList;, "Ljava/util/ArrayList<LRaptureXML/RXMLElement;>;"
    if-eqz v7, :cond_0

    .line 29
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .local v3, "directions":Ljava/util/ArrayList;, "Ljava/util/ArrayList<LRaptureXML/RXMLElement;>;"
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-nez v9, :cond_1

    .line 35
    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getCurrentHeadsign()Ljava/lang/String;

    move-result-object v0

    .line 37
    .local v0, "currentItineraryName":Ljava/lang/String;
    if-eqz v0, :cond_0

    .line 38
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-nez v9, :cond_2

    .line 61
    .end local v0    # "currentItineraryName":Ljava/lang/String;
    .end local v3    # "directions":Ljava/util/ArrayList;, "Ljava/util/ArrayList<LRaptureXML/RXMLElement;>;"
    :cond_0
    return-object v6

    .line 31
    .restart local v3    # "directions":Ljava/util/ArrayList;, "Ljava/util/ArrayList<LRaptureXML/RXMLElement;>;"
    :cond_1
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LRaptureXML/RXMLElement;

    .line 32
    .local v5, "predictionElement":LRaptureXML/RXMLElement;
    const-string v9, "direction"

    invoke-virtual {v5, v9}, LRaptureXML/RXMLElement;->children(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v9

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 38
    .end local v5    # "predictionElement":LRaptureXML/RXMLElement;
    .restart local v0    # "currentItineraryName":Ljava/lang/String;
    :cond_2
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LRaptureXML/RXMLElement;

    .line 39
    .local v1, "direction":LRaptureXML/RXMLElement;
    const-string v9, "title"

    invoke-virtual {v1, v9}, LRaptureXML/RXMLElement;->attribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 41
    .local v2, "directionTitle":Ljava/lang/String;
    const-string v9, "prediction"

    new-instance v10, Lcom/thetransitapp/droid/model/realtime/NextBusRealTimeDataSource$1;

    invoke-direct {v10, p0, v2, v6}, Lcom/thetransitapp/droid/model/realtime/NextBusRealTimeDataSource$1;-><init>(Lcom/thetransitapp/droid/model/realtime/NextBusRealTimeDataSource;Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-virtual {v1, v9, v10}, LRaptureXML/RXMLElement;->iterate(Ljava/lang/String;LRaptureXML/RXMLElement$Block;)V

    goto :goto_1
.end method

.method public setAgencyTag(Ljava/lang/String;)V
    .locals 0
    .param p1, "agencyTag"    # Ljava/lang/String;

    .prologue
    .line 15
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/NextBusRealTimeDataSource;->agencyTag:Ljava/lang/String;

    return-void
.end method
