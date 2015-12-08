.class Lcom/thetransitapp/droid/model/realtime/BARTRealTimeDataSource$1;
.super Ljava/lang/Object;
.source "BARTRealTimeDataSource.java"

# interfaces
.implements LRaptureXML/RXMLElement$Block;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/model/realtime/BARTRealTimeDataSource;->processScheduleResponse(Ljava/lang/Object;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/model/realtime/BARTRealTimeDataSource;

.field private final synthetic val$directionTitle:Ljava/lang/String;

.field private final synthetic val$formatter:Lcom/thetransitapp/droid/util/DateFormatter;

.field private final synthetic val$itinerary:Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

.field private final synthetic val$predictions:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/model/realtime/BARTRealTimeDataSource;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;Lcom/thetransitapp/droid/util/DateFormatter;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/BARTRealTimeDataSource$1;->this$0:Lcom/thetransitapp/droid/model/realtime/BARTRealTimeDataSource;

    iput-object p2, p0, Lcom/thetransitapp/droid/model/realtime/BARTRealTimeDataSource$1;->val$itinerary:Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    iput-object p3, p0, Lcom/thetransitapp/droid/model/realtime/BARTRealTimeDataSource$1;->val$formatter:Lcom/thetransitapp/droid/util/DateFormatter;

    iput-object p4, p0, Lcom/thetransitapp/droid/model/realtime/BARTRealTimeDataSource$1;->val$directionTitle:Ljava/lang/String;

    iput-object p5, p0, Lcom/thetransitapp/droid/model/realtime/BARTRealTimeDataSource$1;->val$predictions:Ljava/util/ArrayList;

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public block(LRaptureXML/RXMLElement;)V
    .locals 3
    .param p1, "element"    # LRaptureXML/RXMLElement;

    .prologue
    .line 31
    const-string v1, "color"

    invoke-virtual {p1, v1}, LRaptureXML/RXMLElement;->child(Ljava/lang/String;)LRaptureXML/RXMLElement;

    move-result-object v1

    invoke-virtual {v1}, LRaptureXML/RXMLElement;->text()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/thetransitapp/droid/model/realtime/BARTRealTimeDataSource$1;->val$itinerary:Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;->getRealTimeRouteId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 32
    new-instance v0, Lcom/thetransitapp/droid/model/realtime/Prediction;

    invoke-direct {v0}, Lcom/thetransitapp/droid/model/realtime/Prediction;-><init>()V

    .line 33
    .local v0, "prediction":Lcom/thetransitapp/droid/model/realtime/Prediction;
    iget-object v1, p0, Lcom/thetransitapp/droid/model/realtime/BARTRealTimeDataSource$1;->val$formatter:Lcom/thetransitapp/droid/util/DateFormatter;

    const-string v2, "minutes"

    invoke-virtual {p1, v2}, LRaptureXML/RXMLElement;->child(Ljava/lang/String;)LRaptureXML/RXMLElement;

    move-result-object v2

    invoke-virtual {v2}, LRaptureXML/RXMLElement;->text()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/thetransitapp/droid/util/DateFormatter;->format(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/model/realtime/Prediction;->setStopTime(Ljava/util/Date;)V

    .line 34
    iget-object v1, p0, Lcom/thetransitapp/droid/model/realtime/BARTRealTimeDataSource$1;->val$directionTitle:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/model/realtime/Prediction;->setTripHeadsign(Ljava/lang/String;)V

    .line 35
    iget-object v1, p0, Lcom/thetransitapp/droid/model/realtime/BARTRealTimeDataSource$1;->val$predictions:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .end local v0    # "prediction":Lcom/thetransitapp/droid/model/realtime/Prediction;
    :cond_0
    return-void
.end method
