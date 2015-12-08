.class public Lcom/thetransitapp/droid/model/realtime/BARTRealTimeDataSource;
.super Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;
.source "BARTRealTimeDataSource.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x1L


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;-><init>()V

    return-void
.end method


# virtual methods
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
    .line 18
    move-object v8, p1

    check-cast v8, LRaptureXML/RXMLElement;

    .line 20
    .local v8, "element":LRaptureXML/RXMLElement;
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .local v5, "predictions":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/thetransitapp/droid/model/realtime/Prediction;>;"
    invoke-virtual {p0}, Lcom/thetransitapp/droid/model/realtime/BARTRealTimeDataSource;->getTimestampFormat()Lcom/thetransitapp/droid/util/DateFormatter;

    move-result-object v3

    .line 23
    .local v3, "formatter":Lcom/thetransitapp/droid/util/DateFormatter;
    const-string v0, "station"

    invoke-virtual {v8, v0}, LRaptureXML/RXMLElement;->child(Ljava/lang/String;)LRaptureXML/RXMLElement;

    move-result-object v0

    const-string v1, "etd"

    invoke-virtual {v0, v1}, LRaptureXML/RXMLElement;->children(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v7

    .line 24
    .local v7, "directions":Ljava/util/ArrayList;, "Ljava/util/ArrayList<LRaptureXML/RXMLElement;>;"
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 41
    return-object v5

    .line 24
    :cond_0
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LRaptureXML/RXMLElement;

    .line 25
    .local v6, "direction":LRaptureXML/RXMLElement;
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v4, 0x0

    .line 27
    .local v4, "directionTitle":Ljava/lang/String;
    :goto_1
    const-string v10, "estimate"

    new-instance v0, Lcom/thetransitapp/droid/model/realtime/BARTRealTimeDataSource$1;

    move-object v1, p0

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/thetransitapp/droid/model/realtime/BARTRealTimeDataSource$1;-><init>(Lcom/thetransitapp/droid/model/realtime/BARTRealTimeDataSource;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;Lcom/thetransitapp/droid/util/DateFormatter;Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-virtual {v6, v10, v0}, LRaptureXML/RXMLElement;->iterate(Ljava/lang/String;LRaptureXML/RXMLElement$Block;)V

    goto :goto_0

    .line 25
    .end local v4    # "directionTitle":Ljava/lang/String;
    :cond_1
    const-string v0, "destination"

    invoke-virtual {v6, v0}, LRaptureXML/RXMLElement;->child(Ljava/lang/String;)LRaptureXML/RXMLElement;

    move-result-object v0

    invoke-virtual {v0}, LRaptureXML/RXMLElement;->text()Ljava/lang/String;

    move-result-object v4

    goto :goto_1
.end method
