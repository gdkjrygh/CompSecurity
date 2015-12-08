.class public interface abstract Lcom/thetransitapp/droid/data/TransitSource;
.super Ljava/lang/Object;
.source "TransitSource.java"


# virtual methods
.method public abstract fullSchedules(Lcom/thetransitapp/droid/model/ScheduleRequest;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/thetransitapp/droid/model/ScheduleRequest;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Schedule;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public abstract headsign(Lcom/thetransitapp/droid/model/Itinerary;Lcom/thetransitapp/droid/model/Stop;)Ljava/lang/String;
.end method

.method public abstract loadBundle(Landroid/location/Location;Z)Lcom/thetransitapp/droid/model/BundleResponse;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public abstract loadDetails(Lcom/thetransitapp/droid/model/DetailRequest;)Lcom/thetransitapp/droid/model/DetailRequest;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public abstract loadDetails(Lcom/thetransitapp/droid/model/ScheduleItem;)Lcom/thetransitapp/droid/model/ScheduleItem;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public abstract loadLegal(Landroid/location/Location;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/location/Location;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Feed;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public abstract loadNearbyRoutes(Lcom/thetransitapp/droid/model/NearbyRoutesRequest;)Lcom/thetransitapp/droid/model/NearbyRoutesRequest;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method
