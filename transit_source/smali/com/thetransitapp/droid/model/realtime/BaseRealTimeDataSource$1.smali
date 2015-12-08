.class Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource$1;
.super Ljava/lang/Object;
.source "BaseRealTimeDataSource.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;->assignRegularPredictions(Ljava/util/List;Lcom/thetransitapp/droid/model/viewmodel/MergedItinerary;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/thetransitapp/droid/model/realtime/Prediction;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource$1;->this$0:Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource;

    .line 236
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/thetransitapp/droid/model/realtime/Prediction;Lcom/thetransitapp/droid/model/realtime/Prediction;)I
    .locals 2
    .param p1, "arg0"    # Lcom/thetransitapp/droid/model/realtime/Prediction;
    .param p2, "arg1"    # Lcom/thetransitapp/droid/model/realtime/Prediction;

    .prologue
    .line 239
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getStopTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {p2}, Lcom/thetransitapp/droid/model/realtime/Prediction;->getStopTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 1
    check-cast p1, Lcom/thetransitapp/droid/model/realtime/Prediction;

    check-cast p2, Lcom/thetransitapp/droid/model/realtime/Prediction;

    invoke-virtual {p0, p1, p2}, Lcom/thetransitapp/droid/model/realtime/BaseRealTimeDataSource$1;->compare(Lcom/thetransitapp/droid/model/realtime/Prediction;Lcom/thetransitapp/droid/model/realtime/Prediction;)I

    move-result v0

    return v0
.end method
