.class Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource$1;
.super Ljava/lang/Object;
.source "OBARealTimeDataSource.java"

# interfaces
.implements LRaptureXML/RXMLElement$Block;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource;->processScheduleResponse(Ljava/lang/Object;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource;

.field private final synthetic val$formatter:Lcom/thetransitapp/droid/util/DateFormatter;

.field private final synthetic val$itinerary:Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

.field private final synthetic val$predictions:Ljava/util/ArrayList;

.field private final synthetic val$routeFilteringKeyPath:Ljava/lang/String;

.field private final synthetic val$stopFilteringKeyPath:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource;Ljava/lang/String;Ljava/lang/String;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;Lcom/thetransitapp/droid/util/DateFormatter;Ljava/util/ArrayList;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource$1;->this$0:Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource;

    iput-object p2, p0, Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource$1;->val$routeFilteringKeyPath:Ljava/lang/String;

    iput-object p3, p0, Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource$1;->val$stopFilteringKeyPath:Ljava/lang/String;

    iput-object p4, p0, Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource$1;->val$itinerary:Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    iput-object p5, p0, Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource$1;->val$formatter:Lcom/thetransitapp/droid/util/DateFormatter;

    iput-object p6, p0, Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource$1;->val$predictions:Ljava/util/ArrayList;

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public block(LRaptureXML/RXMLElement;)V
    .locals 9
    .param p1, "element"    # LRaptureXML/RXMLElement;

    .prologue
    .line 27
    iget-object v5, p0, Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource$1;->this$0:Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource;

    iget-object v6, p0, Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource$1;->val$routeFilteringKeyPath:Ljava/lang/String;

    invoke-virtual {v5, p1, v6}, Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource;->objectAtKeyPath(LRaptureXML/RXMLElement;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 28
    .local v2, "routeValue":Ljava/lang/String;
    iget-object v5, p0, Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource$1;->this$0:Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource;

    iget-object v6, p0, Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource$1;->val$stopFilteringKeyPath:Ljava/lang/String;

    invoke-virtual {v5, p1, v6}, Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource;->objectAtKeyPath(LRaptureXML/RXMLElement;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 30
    .local v4, "stopValue":Ljava/lang/String;
    if-eqz v2, :cond_0

    iget-object v5, p0, Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource$1;->val$itinerary:Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRealTimeRouteId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 31
    if-eqz v4, :cond_0

    iget-object v5, p0, Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource$1;->val$itinerary:Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    invoke-virtual {v5}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRealTimeStopId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 32
    :cond_0
    const-string v5, "predictedDepartureTime"

    invoke-virtual {p1, v5}, LRaptureXML/RXMLElement;->child(Ljava/lang/String;)LRaptureXML/RXMLElement;

    move-result-object v5

    invoke-virtual {v5}, LRaptureXML/RXMLElement;->text()Ljava/lang/String;

    move-result-object v0

    .line 33
    .local v0, "predictedDepartureTime":Ljava/lang/String;
    const-string v5, "scheduledDepartureTime"

    invoke-virtual {p1, v5}, LRaptureXML/RXMLElement;->child(Ljava/lang/String;)LRaptureXML/RXMLElement;

    move-result-object v5

    invoke-virtual {v5}, LRaptureXML/RXMLElement;->text()Ljava/lang/String;

    move-result-object v3

    .line 35
    .local v3, "scheduledDepartureTime":Ljava/lang/String;
    new-instance v1, Lcom/thetransitapp/droid/model/realtime/Prediction;

    invoke-direct {v1}, Lcom/thetransitapp/droid/model/realtime/Prediction;-><init>()V

    .line 36
    .local v1, "prediction":Lcom/thetransitapp/droid/model/realtime/Prediction;
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v5, v5, v7

    if-eqz v5, :cond_2

    .line 37
    iget-object v5, p0, Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource$1;->val$formatter:Lcom/thetransitapp/droid/util/DateFormatter;

    invoke-virtual {v5, v0}, Lcom/thetransitapp/droid/util/DateFormatter;->format(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/thetransitapp/droid/model/realtime/Prediction;->setStopTime(Ljava/util/Date;)V

    .line 42
    :goto_0
    iget-object v5, p0, Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource$1;->val$predictions:Ljava/util/ArrayList;

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .end local v0    # "predictedDepartureTime":Ljava/lang/String;
    .end local v1    # "prediction":Lcom/thetransitapp/droid/model/realtime/Prediction;
    .end local v3    # "scheduledDepartureTime":Ljava/lang/String;
    :cond_1
    return-void

    .line 39
    .restart local v0    # "predictedDepartureTime":Ljava/lang/String;
    .restart local v1    # "prediction":Lcom/thetransitapp/droid/model/realtime/Prediction;
    .restart local v3    # "scheduledDepartureTime":Ljava/lang/String;
    :cond_2
    iget-object v5, p0, Lcom/thetransitapp/droid/model/realtime/OBARealTimeDataSource$1;->val$formatter:Lcom/thetransitapp/droid/util/DateFormatter;

    invoke-virtual {v5, v3}, Lcom/thetransitapp/droid/util/DateFormatter;->format(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/thetransitapp/droid/model/realtime/Prediction;->setStopTime(Ljava/util/Date;)V

    .line 40
    const/4 v5, 0x1

    invoke-virtual {v1, v5}, Lcom/thetransitapp/droid/model/realtime/Prediction;->setScheduleBased(Z)V

    goto :goto_0
.end method
