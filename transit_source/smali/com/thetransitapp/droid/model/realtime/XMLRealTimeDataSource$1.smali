.class Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;
.super Ljava/lang/Object;
.source "XMLRealTimeDataSource.java"

# interfaces
.implements LRaptureXML/RXMLElement$Block;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;->processScheduleResponse(Ljava/lang/Object;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;

.field private final synthetic val$cancelledKeyPath:Ljava/lang/String;

.field private final synthetic val$dataSource:Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;

.field private final synthetic val$dateKeyPath:Ljava/lang/String;

.field private final synthetic val$destinationKeyPath:Ljava/lang/String;

.field private final synthetic val$formatter:Lcom/thetransitapp/droid/util/DateFormatter;

.field private final synthetic val$itinerary:Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

.field private final synthetic val$predictions:Ljava/util/ArrayList;

.field private final synthetic val$routeFilteringKeyPath:Ljava/lang/String;

.field private final synthetic val$scheduleBasedKeyPath:Ljava/lang/String;

.field private final synthetic val$stopFilteringKeyPath:Ljava/lang/String;

.field private final synthetic val$timestampKeyPath:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;Ljava/lang/String;Ljava/lang/String;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;Ljava/lang/String;Ljava/lang/String;Lcom/thetransitapp/droid/util/DateFormatter;Ljava/lang/String;Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->this$0:Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;

    iput-object p2, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->val$routeFilteringKeyPath:Ljava/lang/String;

    iput-object p3, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->val$stopFilteringKeyPath:Ljava/lang/String;

    iput-object p4, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->val$itinerary:Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    iput-object p5, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->val$timestampKeyPath:Ljava/lang/String;

    iput-object p6, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->val$dateKeyPath:Ljava/lang/String;

    iput-object p7, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->val$formatter:Lcom/thetransitapp/droid/util/DateFormatter;

    iput-object p8, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->val$scheduleBasedKeyPath:Ljava/lang/String;

    iput-object p9, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->val$dataSource:Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;

    iput-object p10, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->val$cancelledKeyPath:Ljava/lang/String;

    iput-object p11, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->val$destinationKeyPath:Ljava/lang/String;

    iput-object p12, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->val$predictions:Ljava/util/ArrayList;

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public block(LRaptureXML/RXMLElement;)V
    .locals 9
    .param p1, "element"    # LRaptureXML/RXMLElement;

    .prologue
    .line 45
    iget-object v6, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->this$0:Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;

    iget-object v7, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->val$routeFilteringKeyPath:Ljava/lang/String;

    invoke-virtual {v6, p1, v7}, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;->objectAtKeyPath(LRaptureXML/RXMLElement;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 46
    .local v3, "routeValue":Ljava/lang/String;
    iget-object v6, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->this$0:Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;

    iget-object v7, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->val$stopFilteringKeyPath:Ljava/lang/String;

    invoke-virtual {v6, p1, v7}, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;->objectAtKeyPath(LRaptureXML/RXMLElement;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 48
    .local v4, "stopValue":Ljava/lang/String;
    if-eqz v3, :cond_0

    iget-object v6, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->val$itinerary:Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    invoke-virtual {v6}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRealTimeRouteId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 49
    if-eqz v4, :cond_0

    iget-object v6, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->val$itinerary:Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    invoke-virtual {v6}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRealTimeStopId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 51
    :cond_0
    iget-object v6, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->val$timestampKeyPath:Ljava/lang/String;

    if-eqz v6, :cond_6

    .line 52
    iget-object v6, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->this$0:Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;

    iget-object v7, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->val$timestampKeyPath:Ljava/lang/String;

    invoke-virtual {v6, p1, v7}, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;->objectAtKeyPath(LRaptureXML/RXMLElement;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 56
    .local v0, "dateString":Ljava/lang/String;
    :goto_0
    iget-object v6, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->val$dateKeyPath:Ljava/lang/String;

    if-eqz v6, :cond_1

    if-eqz v0, :cond_1

    .line 57
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v7, " "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->this$0:Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;

    iget-object v8, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->val$dateKeyPath:Ljava/lang/String;

    invoke-virtual {v7, p1, v8}, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;->objectAtKeyPath(LRaptureXML/RXMLElement;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 59
    :cond_1
    if-eqz v0, :cond_5

    .line 60
    iget-object v6, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->val$formatter:Lcom/thetransitapp/droid/util/DateFormatter;

    invoke-virtual {v6, v0}, Lcom/thetransitapp/droid/util/DateFormatter;->format(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    .line 61
    .local v1, "departure":Ljava/util/Date;
    if-eqz v1, :cond_5

    .line 62
    new-instance v2, Lcom/thetransitapp/droid/model/realtime/Prediction;

    invoke-direct {v2}, Lcom/thetransitapp/droid/model/realtime/Prediction;-><init>()V

    .line 64
    .local v2, "prediction":Lcom/thetransitapp/droid/model/realtime/Prediction;
    invoke-virtual {v2, v1}, Lcom/thetransitapp/droid/model/realtime/Prediction;->setStopTime(Ljava/util/Date;)V

    .line 65
    iget-object v6, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->val$scheduleBasedKeyPath:Ljava/lang/String;

    if-eqz v6, :cond_2

    .line 66
    iget-object v6, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->this$0:Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;

    iget-object v7, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->val$scheduleBasedKeyPath:Ljava/lang/String;

    invoke-virtual {v6, p1, v7}, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;->objectAtKeyPath(LRaptureXML/RXMLElement;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 67
    .local v5, "value":Ljava/lang/String;
    iget-object v6, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->val$dataSource:Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;

    invoke-virtual {v6, v5}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->valueMatchScheduleBased(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v2, v6}, Lcom/thetransitapp/droid/model/realtime/Prediction;->setScheduleBased(Z)V

    .line 70
    .end local v5    # "value":Ljava/lang/String;
    :cond_2
    iget-object v6, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->val$cancelledKeyPath:Ljava/lang/String;

    if-eqz v6, :cond_3

    .line 71
    iget-object v6, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->this$0:Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;

    iget-object v7, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->val$cancelledKeyPath:Ljava/lang/String;

    invoke-virtual {v6, p1, v7}, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;->objectAtKeyPath(LRaptureXML/RXMLElement;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 72
    .restart local v5    # "value":Ljava/lang/String;
    iget-object v6, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->val$dataSource:Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;

    invoke-virtual {v6, v5}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->valueMatchCancelled(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v2, v6}, Lcom/thetransitapp/droid/model/realtime/Prediction;->setCancelled(Z)V

    .line 75
    .end local v5    # "value":Ljava/lang/String;
    :cond_3
    iget-object v6, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->val$destinationKeyPath:Ljava/lang/String;

    if-eqz v6, :cond_4

    .line 76
    iget-object v6, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->this$0:Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;

    iget-object v7, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->val$destinationKeyPath:Ljava/lang/String;

    invoke-virtual {v6, p1, v7}, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource;->objectAtKeyPath(LRaptureXML/RXMLElement;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 77
    .restart local v5    # "value":Ljava/lang/String;
    invoke-virtual {v2, v5}, Lcom/thetransitapp/droid/model/realtime/Prediction;->setTripHeadsign(Ljava/lang/String;)V

    .line 80
    .end local v5    # "value":Ljava/lang/String;
    :cond_4
    iget-object v6, p0, Lcom/thetransitapp/droid/model/realtime/XMLRealTimeDataSource$1;->val$predictions:Ljava/util/ArrayList;

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .end local v0    # "dateString":Ljava/lang/String;
    .end local v1    # "departure":Ljava/util/Date;
    .end local v2    # "prediction":Lcom/thetransitapp/droid/model/realtime/Prediction;
    :cond_5
    return-void

    .line 54
    :cond_6
    invoke-virtual {p1}, LRaptureXML/RXMLElement;->text()Ljava/lang/String;

    move-result-object v0

    .restart local v0    # "dateString":Ljava/lang/String;
    goto :goto_0
.end method
