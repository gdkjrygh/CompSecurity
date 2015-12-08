.class Lcom/thetransitapp/droid/model/realtime/NextBusRealTimeDataSource$1;
.super Ljava/lang/Object;
.source "NextBusRealTimeDataSource.java"

# interfaces
.implements LRaptureXML/RXMLElement$Block;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/model/realtime/NextBusRealTimeDataSource;->processScheduleResponse(Ljava/lang/Object;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/model/realtime/NextBusRealTimeDataSource;

.field private final synthetic val$directionTitle:Ljava/lang/String;

.field private final synthetic val$predictions:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/model/realtime/NextBusRealTimeDataSource;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/NextBusRealTimeDataSource$1;->this$0:Lcom/thetransitapp/droid/model/realtime/NextBusRealTimeDataSource;

    iput-object p2, p0, Lcom/thetransitapp/droid/model/realtime/NextBusRealTimeDataSource$1;->val$directionTitle:Ljava/lang/String;

    iput-object p3, p0, Lcom/thetransitapp/droid/model/realtime/NextBusRealTimeDataSource$1;->val$predictions:Ljava/util/ArrayList;

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public block(LRaptureXML/RXMLElement;)V
    .locals 6
    .param p1, "element"    # LRaptureXML/RXMLElement;

    .prologue
    .line 44
    const-string v4, "branch"

    invoke-virtual {p1, v4}, LRaptureXML/RXMLElement;->attribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 45
    .local v0, "branchCode":Ljava/lang/String;
    const-string v4, "epochTime"

    invoke-virtual {p1, v4}, LRaptureXML/RXMLElement;->attributeAsDouble(Ljava/lang/String;)D

    move-result-wide v4

    double-to-long v1, v4

    .line 47
    .local v1, "epochTime":J
    new-instance v3, Lcom/thetransitapp/droid/model/realtime/Prediction;

    invoke-direct {v3}, Lcom/thetransitapp/droid/model/realtime/Prediction;-><init>()V

    .line 48
    .local v3, "prediction":Lcom/thetransitapp/droid/model/realtime/Prediction;
    const-string v4, "isScheduleBased"

    invoke-virtual {p1, v4}, LRaptureXML/RXMLElement;->attribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v4

    invoke-virtual {v3, v4}, Lcom/thetransitapp/droid/model/realtime/Prediction;->setScheduleBased(Z)V

    .line 49
    new-instance v4, Ljava/util/Date;

    invoke-direct {v4, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v3, v4}, Lcom/thetransitapp/droid/model/realtime/Prediction;->setStopTime(Ljava/util/Date;)V

    .line 50
    iget-object v4, p0, Lcom/thetransitapp/droid/model/realtime/NextBusRealTimeDataSource$1;->val$directionTitle:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/thetransitapp/droid/model/realtime/Prediction;->setTripHeadsign(Ljava/lang/String;)V

    .line 51
    invoke-virtual {v3, v0}, Lcom/thetransitapp/droid/model/realtime/Prediction;->setBranch(Ljava/lang/String;)V

    .line 52
    const-string v4, "dirTag"

    invoke-virtual {p1, v4}, LRaptureXML/RXMLElement;->attribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/thetransitapp/droid/model/realtime/Prediction;->setDirectionTag(Ljava/lang/String;)V

    .line 54
    iget-object v4, p0, Lcom/thetransitapp/droid/model/realtime/NextBusRealTimeDataSource$1;->val$predictions:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    return-void
.end method
