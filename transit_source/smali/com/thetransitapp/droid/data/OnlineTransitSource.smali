.class public Lcom/thetransitapp/droid/data/OnlineTransitSource;
.super Lcom/thetransitapp/droid/data/BaseOnlineSource;
.source "OnlineTransitSource.java"

# interfaces
.implements Lcom/thetransitapp/droid/data/TransitSource;


# instance fields
.field private database:Lcom/thetransitapp/droid/data/TransitDatabaseHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 38
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/thetransitapp/droid/data/BaseOnlineSource;-><init>(Z)V

    .line 39
    return-void
.end method

.method private fetchSchedule(Lcom/thetransitapp/droid/model/ScheduleRequest;)Ljava/util/List;
    .locals 13
    .param p1, "request"    # Lcom/thetransitapp/droid/model/ScheduleRequest;
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

    .prologue
    .line 297
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/ScheduleRequest;->getRoute()Lcom/thetransitapp/droid/model/Route;

    move-result-object v6

    .line 298
    .local v6, "route":Lcom/thetransitapp/droid/model/Route;
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/ScheduleRequest;->getStop()Lcom/thetransitapp/droid/model/Stop;

    move-result-object v10

    .line 299
    .local v10, "stop":Lcom/thetransitapp/droid/model/Stop;
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/ScheduleRequest;->getServiceDay()Lcom/thetransitapp/droid/model/ServiceDay;

    move-result-object v9

    .line 301
    .local v9, "serviceDay":Lcom/thetransitapp/droid/model/ServiceDay;
    new-instance v1, Ljava/lang/StringBuilder;

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-super {p0, v11, v12}, Lcom/thetransitapp/droid/data/BaseOnlineSource;->getBaseURL(ZLcom/google/android/gms/maps/model/LatLng;)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v1, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 302
    .local v1, "builder":Ljava/lang/StringBuilder;
    const-string v11, "/schedule?route_id="

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    invoke-virtual {v6}, Lcom/thetransitapp/droid/model/Route;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    const-string v11, "&feed_id="

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    invoke-virtual {v6}, Lcom/thetransitapp/droid/model/Route;->getFeedId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    const-string v11, "&stop_id="

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    invoke-virtual {v10}, Lcom/thetransitapp/droid/model/Stop;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    const-string v11, "&date="

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    const-string v11, "yyyy-MM-dd"

    invoke-virtual {v9}, Lcom/thetransitapp/droid/model/ServiceDay;->getDate()Ljava/util/Date;

    move-result-object v12

    invoke-static {v11, v12}, Landroid/text/format/DateFormat;->format(Ljava/lang/CharSequence;Ljava/util/Date;)Ljava/lang/CharSequence;

    move-result-object v11

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 311
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-super {p0, v11}, Lcom/thetransitapp/droid/data/BaseOnlineSource;->execute(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 315
    .local v5, "result":Lorg/json/JSONObject;
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 317
    .local v8, "schedules":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/Schedule;>;"
    const-string v11, "itineraries"

    invoke-virtual {v5, v11}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_0

    .line 318
    const-string v11, "itineraries"

    invoke-virtual {v5, v11}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 320
    .local v0, "array":Lorg/json/JSONArray;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v11

    if-lt v2, v11, :cond_1

    .line 331
    .end local v0    # "array":Lorg/json/JSONArray;
    .end local v2    # "i":I
    :cond_0
    return-object v8

    .line 321
    .restart local v0    # "array":Lorg/json/JSONArray;
    .restart local v2    # "i":I
    :cond_1
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 323
    .local v4, "itineraryObject":Lorg/json/JSONObject;
    const/4 v11, 0x1

    invoke-static {v4, v10, v11}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->createItinerary(Lorg/json/JSONObject;Lcom/thetransitapp/droid/model/Stop;Z)Lcom/thetransitapp/droid/model/Itinerary;

    move-result-object v3

    .line 325
    .local v3, "itinerary":Lcom/thetransitapp/droid/model/Itinerary;
    invoke-virtual {v3, v10, v9}, Lcom/thetransitapp/droid/model/Itinerary;->getSchedule(Lcom/thetransitapp/droid/model/Stop;Lcom/thetransitapp/droid/model/ServiceDay;)Lcom/thetransitapp/droid/model/Schedule;

    move-result-object v7

    .line 326
    .local v7, "schedule":Lcom/thetransitapp/droid/model/Schedule;
    invoke-virtual {v6, v3}, Lcom/thetransitapp/droid/model/Route;->addItinerary(Lcom/thetransitapp/droid/model/Itinerary;)V

    .line 327
    invoke-interface {v8, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 320
    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method

.method private findItinerary(Ljava/util/List;Ljava/lang/String;)Lcom/thetransitapp/droid/model/Itinerary;
    .locals 3
    .param p2, "id"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Itinerary;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/thetransitapp/droid/model/Itinerary;"
        }
    .end annotation

    .prologue
    .line 366
    .local p1, "itineraries":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/Itinerary;>;"
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    .line 372
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 366
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/Itinerary;

    .line 367
    .local v0, "itinerary":Lcom/thetransitapp/droid/model/Itinerary;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/Itinerary;->getItineraryId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0
.end method

.method private getSchedules(Ljava/util/List;Lcom/thetransitapp/droid/model/Stop;Lcom/thetransitapp/droid/model/ServiceDay;)Ljava/util/List;
    .locals 5
    .param p2, "stop"    # Lcom/thetransitapp/droid/model/Stop;
    .param p3, "serviceDay"    # Lcom/thetransitapp/droid/model/ServiceDay;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Itinerary;",
            ">;",
            "Lcom/thetransitapp/droid/model/Stop;",
            "Lcom/thetransitapp/droid/model/ServiceDay;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Schedule;",
            ">;"
        }
    .end annotation

    .prologue
    .line 275
    .local p1, "itineraries":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/Itinerary;>;"
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 278
    .local v2, "schedules":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/Schedule;>;"
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_0

    .line 283
    return-object v2

    .line 278
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/Itinerary;

    .line 279
    .local v0, "itinerary":Lcom/thetransitapp/droid/model/Itinerary;
    invoke-virtual {v0, p2, p3}, Lcom/thetransitapp/droid/model/Itinerary;->getSchedule(Lcom/thetransitapp/droid/model/Stop;Lcom/thetransitapp/droid/model/ServiceDay;)Lcom/thetransitapp/droid/model/Schedule;

    move-result-object v1

    .line 280
    .local v1, "schedule":Lcom/thetransitapp/droid/model/Schedule;
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method private implodeId(Ljava/util/List;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Itinerary;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 352
    .local p1, "itineraries":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/Itinerary;>;"
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 354
    .local v0, "builder":Ljava/lang/StringBuilder;
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_0

    .line 362
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    return-object v2

    .line 354
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/thetransitapp/droid/model/Itinerary;

    .line 355
    .local v1, "itinerary":Lcom/thetransitapp/droid/model/Itinerary;
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-lez v3, :cond_1

    .line 356
    const-string v3, ","

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    :cond_1
    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/Itinerary;->getItineraryId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0
.end method

.method private parseStops(Lorg/json/JSONArray;Lcom/thetransitapp/droid/model/Itinerary;Lcom/thetransitapp/droid/model/ServiceDay;)V
    .locals 8
    .param p1, "stopArray"    # Lorg/json/JSONArray;
    .param p2, "itinerary"    # Lcom/thetransitapp/droid/model/Itinerary;
    .param p3, "serviceDay"    # Lcom/thetransitapp/droid/model/ServiceDay;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    const/4 v7, 0x0

    .line 335
    new-instance v5, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 337
    .local v5, "stops":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/Stop;>;"
    const/4 v0, 0x0

    .local v0, "j":I
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v6

    if-lt v0, v6, :cond_0

    .line 348
    invoke-virtual {p2, v5}, Lcom/thetransitapp/droid/model/Itinerary;->setStops(Ljava/util/List;)V

    .line 349
    return-void

    .line 338
    :cond_0
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 339
    .local v4, "stopObject":Lorg/json/JSONObject;
    invoke-static {v4, p2, v7}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->createStop(Lorg/json/JSONObject;Lcom/thetransitapp/droid/model/Itinerary;Z)Lcom/thetransitapp/droid/model/Stop;

    move-result-object v3

    .line 340
    .local v3, "stop":Lcom/thetransitapp/droid/model/Stop;
    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 342
    const-string v6, "schedule_items"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 343
    .local v2, "scheduleArray":Lorg/json/JSONArray;
    invoke-static {v2, p2, v3, v7}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->createSchedule(Lorg/json/JSONArray;Lcom/thetransitapp/droid/model/Itinerary;Lcom/thetransitapp/droid/model/Stop;Z)Lcom/thetransitapp/droid/model/Schedule;

    move-result-object v1

    .line 345
    .local v1, "schedule":Lcom/thetransitapp/droid/model/Schedule;
    invoke-virtual {p2, v1, v3, p3}, Lcom/thetransitapp/droid/model/Itinerary;->addSchedule(Lcom/thetransitapp/droid/model/Schedule;Lcom/thetransitapp/droid/model/Stop;Lcom/thetransitapp/droid/model/ServiceDay;)V

    .line 337
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private shouldLoad(Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Schedule;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 287
    .local p1, "schedules":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/Schedule;>;"
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    .line 293
    const/4 v1, 0x1

    :goto_0
    return v1

    .line 287
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/Schedule;

    .line 288
    .local v0, "schedule":Lcom/thetransitapp/droid/model/Schedule;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/Schedule;->isComplete()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 289
    const/4 v1, 0x0

    goto :goto_0
.end method


# virtual methods
.method public fullSchedules(Lcom/thetransitapp/droid/model/ScheduleRequest;)Ljava/util/List;
    .locals 4
    .param p1, "request"    # Lcom/thetransitapp/droid/model/ScheduleRequest;
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

    .prologue
    .line 197
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/ScheduleRequest;->getRoute()Lcom/thetransitapp/droid/model/Route;

    move-result-object v2

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/Route;->getItineraries()Ljava/util/List;

    move-result-object v0

    .line 198
    .local v0, "itineraries":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/Itinerary;>;"
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/ScheduleRequest;->getStop()Lcom/thetransitapp/droid/model/Stop;

    move-result-object v2

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/ScheduleRequest;->getServiceDay()Lcom/thetransitapp/droid/model/ServiceDay;

    move-result-object v3

    invoke-direct {p0, v0, v2, v3}, Lcom/thetransitapp/droid/data/OnlineTransitSource;->getSchedules(Ljava/util/List;Lcom/thetransitapp/droid/model/Stop;Lcom/thetransitapp/droid/model/ServiceDay;)Ljava/util/List;

    move-result-object v1

    .line 200
    .local v1, "schedules":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/Schedule;>;"
    invoke-direct {p0, v1}, Lcom/thetransitapp/droid/data/OnlineTransitSource;->shouldLoad(Ljava/util/List;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 201
    invoke-direct {p0, p1}, Lcom/thetransitapp/droid/data/OnlineTransitSource;->fetchSchedule(Lcom/thetransitapp/droid/model/ScheduleRequest;)Ljava/util/List;

    move-result-object v1

    .line 204
    :cond_0
    return-object v1
.end method

.method public headsign(Lcom/thetransitapp/droid/model/Itinerary;Lcom/thetransitapp/droid/model/Stop;)Ljava/lang/String;
    .locals 1
    .param p1, "itinerary"    # Lcom/thetransitapp/droid/model/Itinerary;
    .param p2, "stop"    # Lcom/thetransitapp/droid/model/Stop;

    .prologue
    .line 192
    const/4 v0, 0x0

    return-object v0
.end method

.method public loadBundle(Landroid/location/Location;Z)Lcom/thetransitapp/droid/model/BundleResponse;
    .locals 11
    .param p1, "location"    # Landroid/location/Location;
    .param p2, "loadAll"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    const/4 v10, 0x0

    .line 210
    new-instance v1, Ljava/lang/StringBuilder;

    const/4 v8, 0x0

    invoke-super {p0, v8, v10}, Lcom/thetransitapp/droid/data/BaseOnlineSource;->getBaseURL(ZLcom/google/android/gms/maps/model/LatLng;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 211
    .local v1, "builder":Ljava/lang/StringBuilder;
    const-string v8, "/bundles?"

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    if-eqz p1, :cond_0

    .line 214
    const-string v8, "lat="

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v8

    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 216
    const-string v8, "&lon="

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v8

    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 218
    const-string v8, "&"

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    :cond_0
    if-nez p2, :cond_1

    if-nez p1, :cond_2

    .line 222
    :cond_1
    const-string v8, "all=1"

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-super {p0, v8}, Lcom/thetransitapp/droid/data/BaseOnlineSource;->execute(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v7

    .line 226
    .local v7, "result":Lorg/json/JSONObject;
    new-instance v6, Lcom/thetransitapp/droid/model/BundleResponse;

    invoke-direct {v6}, Lcom/thetransitapp/droid/model/BundleResponse;-><init>()V

    .line 228
    .local v6, "response":Lcom/thetransitapp/droid/model/BundleResponse;
    const-string v8, "bundles"

    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    .line 229
    const-string v8, "bundles"

    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 231
    .local v0, "array":Lorg/json/JSONArray;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v8

    if-lt v2, v8, :cond_5

    .line 236
    .end local v0    # "array":Lorg/json/JSONArray;
    .end local v2    # "i":I
    :cond_3
    const-string v8, "share_strings"

    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 237
    const-string v8, "share_strings"

    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 238
    .local v5, "messages":Lorg/json/JSONObject;
    invoke-virtual {v5}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v4

    .line 241
    .local v4, "keys":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_6

    .line 247
    .end local v4    # "keys":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    .end local v5    # "messages":Lorg/json/JSONObject;
    :cond_4
    return-object v6

    .line 232
    .restart local v0    # "array":Lorg/json/JSONArray;
    .restart local v2    # "i":I
    :cond_5
    invoke-virtual {v6}, Lcom/thetransitapp/droid/model/BundleResponse;->getBundles()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v9

    invoke-static {v9}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->createBundle(Lorg/json/JSONObject;)Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 231
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 242
    .end local v0    # "array":Lorg/json/JSONArray;
    .end local v2    # "i":I
    .restart local v4    # "keys":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    .restart local v5    # "messages":Lorg/json/JSONObject;
    :cond_6
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 243
    .local v3, "key":Ljava/lang/String;
    invoke-virtual {v6}, Lcom/thetransitapp/droid/model/BundleResponse;->getShareMessage()Ljava/util/Map;

    move-result-object v8

    invoke-static {v5, v3, v10}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v3, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1
.end method

.method public loadDetails(Lcom/thetransitapp/droid/model/DetailRequest;)Lcom/thetransitapp/droid/model/DetailRequest;
    .locals 14
    .param p1, "request"    # Lcom/thetransitapp/droid/model/DetailRequest;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    const/4 v13, 0x0

    const/4 v12, 0x0

    .line 120
    new-instance v9, Lcom/thetransitapp/droid/model/ServiceDay;

    invoke-direct {v9}, Lcom/thetransitapp/droid/model/ServiceDay;-><init>()V

    .line 122
    .local v9, "serviceDay":Lcom/thetransitapp/droid/model/ServiceDay;
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/DetailRequest;->getScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v11

    if-eqz v11, :cond_0

    .line 123
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/DetailRequest;->getScheduleItem()Lcom/thetransitapp/droid/model/ScheduleItem;

    move-result-object v11

    invoke-virtual {v11}, Lcom/thetransitapp/droid/model/ScheduleItem;->getServiceDay()Lcom/thetransitapp/droid/model/ServiceDay;

    move-result-object v9

    .line 126
    :cond_0
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/DetailRequest;->getItineraries()Ljava/util/List;

    move-result-object v4

    .line 127
    .local v4, "itineraries":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/Itinerary;>;"
    invoke-interface {v4, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/thetransitapp/droid/model/Itinerary;

    invoke-virtual {v11}, Lcom/thetransitapp/droid/model/Itinerary;->getRoute()Lcom/thetransitapp/droid/model/Route;

    move-result-object v8

    .line 129
    .local v8, "route":Lcom/thetransitapp/droid/model/Route;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-super {p0, v12, v13}, Lcom/thetransitapp/droid/data/BaseOnlineSource;->getBaseURL(ZLcom/google/android/gms/maps/model/LatLng;)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v1, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 130
    .local v1, "builder":Ljava/lang/StringBuilder;
    const-string v11, "/itineraries?route_id="

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    invoke-virtual {v8}, Lcom/thetransitapp/droid/model/Route;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    const-string v11, "&itinerary_ids="

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    invoke-direct {p0, v4}, Lcom/thetransitapp/droid/data/OnlineTransitSource;->implodeId(Ljava/util/List;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    const-string v11, "&feed_id="

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    invoke-virtual {v8}, Lcom/thetransitapp/droid/model/Route;->getFeedId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    const-string v11, "&date="

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    const-string v11, "yyyy-MM-dd"

    invoke-virtual {v9}, Lcom/thetransitapp/droid/model/ServiceDay;->getDate()Ljava/util/Date;

    move-result-object v12

    invoke-static {v11, v12}, Landroid/text/format/DateFormat;->format(Ljava/lang/CharSequence;Ljava/util/Date;)Ljava/lang/CharSequence;

    move-result-object v11

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 139
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-super {p0, v11}, Lcom/thetransitapp/droid/data/BaseOnlineSource;->execute(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v7

    .line 142
    .local v7, "result":Lorg/json/JSONObject;
    const-string v11, "itineraries"

    invoke-virtual {v7, v11}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_1

    .line 143
    const-string v11, "itineraries"

    invoke-virtual {v7, v11}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 145
    .local v0, "array":Lorg/json/JSONArray;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v11

    if-lt v2, v11, :cond_2

    .line 160
    .end local v0    # "array":Lorg/json/JSONArray;
    .end local v2    # "i":I
    :cond_1
    return-object p1

    .line 146
    .restart local v0    # "array":Lorg/json/JSONArray;
    .restart local v2    # "i":I
    :cond_2
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    .line 147
    .local v6, "itineraryObject":Lorg/json/JSONObject;
    const-string v11, "itinerary_id"

    invoke-virtual {v6, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 149
    .local v3, "id":Ljava/lang/String;
    invoke-direct {p0, v4, v3}, Lcom/thetransitapp/droid/data/OnlineTransitSource;->findItinerary(Ljava/util/List;Ljava/lang/String;)Lcom/thetransitapp/droid/model/Itinerary;

    move-result-object v5

    .line 151
    .local v5, "itinerary":Lcom/thetransitapp/droid/model/Itinerary;
    if-eqz v5, :cond_3

    .line 152
    const-string v11, "stops"

    invoke-virtual {v6, v11}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v10

    .line 154
    .local v10, "stopArray":Lorg/json/JSONArray;
    invoke-direct {p0, v10, v5, v9}, Lcom/thetransitapp/droid/data/OnlineTransitSource;->parseStops(Lorg/json/JSONArray;Lcom/thetransitapp/droid/model/Itinerary;Lcom/thetransitapp/droid/model/ServiceDay;)V

    .line 155
    const-string v11, "shape_data"

    invoke-static {v6, v11, v13}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v5, v11}, Lcom/thetransitapp/droid/model/Itinerary;->setShape(Ljava/lang/String;)V

    .line 145
    .end local v10    # "stopArray":Lorg/json/JSONArray;
    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method

.method public loadDetails(Lcom/thetransitapp/droid/model/ScheduleItem;)Lcom/thetransitapp/droid/model/ScheduleItem;
    .locals 9
    .param p1, "scheduleItem"    # Lcom/thetransitapp/droid/model/ScheduleItem;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    const/4 v8, 0x0

    .line 165
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/ScheduleItem;->getItinerary()Lcom/thetransitapp/droid/model/Itinerary;

    move-result-object v1

    .line 166
    .local v1, "itinerary":Lcom/thetransitapp/droid/model/Itinerary;
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/ScheduleItem;->getServiceDay()Lcom/thetransitapp/droid/model/ServiceDay;

    move-result-object v4

    .line 167
    .local v4, "serviceDay":Lcom/thetransitapp/droid/model/ServiceDay;
    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/Itinerary;->getRoute()Lcom/thetransitapp/droid/model/Route;

    move-result-object v3

    .line 169
    .local v3, "route":Lcom/thetransitapp/droid/model/Route;
    new-instance v0, Ljava/lang/StringBuilder;

    const/4 v6, 0x0

    invoke-super {p0, v6, v8}, Lcom/thetransitapp/droid/data/BaseOnlineSource;->getBaseURL(ZLcom/google/android/gms/maps/model/LatLng;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 170
    .local v0, "builder":Ljava/lang/StringBuilder;
    const-string v6, "/itinerary?trip_id="

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/ScheduleItem;->getTripId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    const-string v6, "&feed_id="

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/Route;->getFeedId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    const-string v6, "&date="

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    const-string v6, "yyyy-MM-dd"

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/ServiceDay;->getDate()Ljava/util/Date;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/text/format/DateFormat;->format(Ljava/lang/CharSequence;Ljava/util/Date;)Ljava/lang/CharSequence;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 177
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-super {p0, v6}, Lcom/thetransitapp/droid/data/BaseOnlineSource;->execute(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 179
    .local v2, "result":Lorg/json/JSONObject;
    const-string v6, "stops"

    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 180
    const-string v6, "stops"

    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    .line 182
    .local v5, "stopArray":Lorg/json/JSONArray;
    invoke-direct {p0, v5, v1, v4}, Lcom/thetransitapp/droid/data/OnlineTransitSource;->parseStops(Lorg/json/JSONArray;Lcom/thetransitapp/droid/model/Itinerary;Lcom/thetransitapp/droid/model/ServiceDay;)V

    .line 183
    const-string v6, "shape_data"

    invoke-static {v2, v6, v8}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/thetransitapp/droid/model/Itinerary;->setShape(Ljava/lang/String;)V

    .line 186
    .end local v5    # "stopArray":Lorg/json/JSONArray;
    :cond_0
    return-object p1
.end method

.method public loadLegal(Landroid/location/Location;)Ljava/util/List;
    .locals 7
    .param p1, "location"    # Landroid/location/Location;
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

    .prologue
    .line 252
    new-instance v1, Ljava/lang/StringBuilder;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-super {p0, v5, v6}, Lcom/thetransitapp/droid/data/BaseOnlineSource;->getBaseURL(ZLcom/google/android/gms/maps/model/LatLng;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 253
    .local v1, "builder":Ljava/lang/StringBuilder;
    const-string v5, "/legal?"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    const-string v5, "lat="

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v5

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 257
    const-string v5, "&lon="

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v5

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 260
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-super {p0, v5}, Lcom/thetransitapp/droid/data/BaseOnlineSource;->execute(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    .line 261
    .local v4, "result":Lorg/json/JSONObject;
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 263
    .local v2, "feeds":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/Feed;>;"
    const-string v5, "feeds"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 264
    const-string v5, "feeds"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 266
    .local v0, "array":Lorg/json/JSONArray;
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v5

    if-lt v3, v5, :cond_1

    .line 271
    .end local v0    # "array":Lorg/json/JSONArray;
    .end local v3    # "i":I
    :cond_0
    return-object v2

    .line 267
    .restart local v0    # "array":Lorg/json/JSONArray;
    .restart local v3    # "i":I
    :cond_1
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    invoke-static {v5}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->createFeed(Lorg/json/JSONObject;)Lcom/thetransitapp/droid/model/Feed;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 266
    add-int/lit8 v3, v3, 0x1

    goto :goto_0
.end method

.method public loadNearbyRoutes(Lcom/thetransitapp/droid/model/NearbyRoutesRequest;)Lcom/thetransitapp/droid/model/NearbyRoutesRequest;
    .locals 18
    .param p1, "request"    # Lcom/thetransitapp/droid/model/NearbyRoutesRequest;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SimpleDateFormat"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 44
    if-eqz p1, :cond_0

    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v14

    if-nez v14, :cond_1

    .line 115
    :cond_0
    :goto_0
    return-object p1

    .line 48
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v0, p0

    invoke-super {v0, v14, v15}, Lcom/thetransitapp/droid/data/BaseOnlineSource;->getBaseURL(ZLcom/google/android/gms/maps/model/LatLng;)Ljava/lang/String;

    move-result-object v14

    invoke-direct {v2, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .local v2, "builder":Ljava/lang/StringBuilder;
    const-string v14, "/routes?lat="

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v14

    invoke-virtual {v14}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLatitude()D

    move-result-wide v14

    invoke-virtual {v2, v14, v15}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 51
    const-string v14, "&lon="

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getPlacemark()Lcom/thetransitapp/droid/model/SimplePlacemark;

    move-result-object v14

    invoke-virtual {v14}, Lcom/thetransitapp/droid/model/SimplePlacemark;->getLongitude()D

    move-result-wide v14

    invoke-virtual {v2, v14, v15}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 54
    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isLoadInactives()Z

    move-result v14

    if-eqz v14, :cond_2

    .line 55
    const-string v14, "&inactives=true"

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getBannedModesParameter()Ljava/lang/String;

    move-result-object v14

    if-eqz v14, :cond_3

    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getBannedModesParameter()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/String;->isEmpty()Z

    move-result v14

    if-nez v14, :cond_3

    .line 59
    const-string v14, "&"

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->getBannedModesParameter()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    :cond_3
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    move-object/from16 v0, p0

    invoke-super {v0, v14}, Lcom/thetransitapp/droid/data/BaseOnlineSource;->execute(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v8

    .line 64
    .local v8, "result":Lorg/json/JSONObject;
    const-string v14, "error"

    const/4 v15, 0x0

    invoke-static {v8, v14, v15}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 66
    .local v5, "error":Ljava/lang/String;
    if-eqz v5, :cond_4

    .line 67
    invoke-static {v5}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->valueOf(Ljava/lang/String;)Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    move-result-object v14

    move-object/from16 v0, p1

    invoke-virtual {v0, v14}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->setError(Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;)V

    .line 68
    const-string v14, "title"

    const/4 v15, 0x0

    invoke-static {v8, v14, v15}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v0, p1

    invoke-virtual {v0, v14}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->setErrorTitle(Ljava/lang/String;)V

    .line 69
    const-string v14, "message"

    const/4 v15, 0x0

    invoke-static {v8, v14, v15}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v0, p1

    invoke-virtual {v0, v14}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->setErrorMessage(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 74
    :cond_4
    const-string v14, "time"

    const/4 v15, 0x0

    invoke-static {v8, v14, v15}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 76
    .local v12, "serverTime":Ljava/lang/String;
    if-eqz v12, :cond_5

    .line 77
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v14, "yyyy-MM-dd\'T\'HH:mm:ss\'Z\'"

    invoke-direct {v6, v14}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 78
    .local v6, "formatter":Ljava/text/SimpleDateFormat;
    const-string v14, "UTC"

    invoke-static {v14}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v14

    invoke-virtual {v6, v14}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 80
    invoke-virtual {v6, v12}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v11

    .line 81
    .local v11, "serverDate":Ljava/util/Date;
    const-string v14, "timezone"

    const-string v15, "GMT"

    invoke-static {v8, v14, v15}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v14

    .line 82
    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-virtual/range {v14 .. v16}, Ljava/util/TimeZone;->getDisplayName(ZI)Ljava/lang/String;

    move-result-object v13

    .line 83
    .local v13, "timezone":Ljava/lang/String;
    invoke-virtual {v11}, Ljava/util/Date;->getTime()J

    move-result-wide v14

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v16

    sub-long v14, v14, v16

    const-wide/16 v16, 0x3e8

    div-long v3, v14, v16

    .line 85
    .local v3, "delta":J
    const-wide/16 v14, 0x384

    cmp-long v14, v3, v14

    if-lez v14, :cond_5

    .line 86
    sget-object v14, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->TIME_DELTA_OUT:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    move-object/from16 v0, p1

    invoke-virtual {v0, v14}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->setError(Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;)V

    .line 87
    new-instance v14, Ljava/lang/StringBuilder;

    const/4 v15, 0x3

    .line 88
    const/16 v16, 0x3

    .line 87
    invoke-static/range {v15 .. v16}, Ljava/text/DateFormat;->getDateTimeInstance(II)Ljava/text/DateFormat;

    move-result-object v15

    .line 88
    invoke-virtual {v15, v11}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    const-string v15, " "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    .line 87
    move-object/from16 v0, p1

    invoke-virtual {v0, v14}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->setErrorMessage(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 94
    .end local v3    # "delta":J
    .end local v6    # "formatter":Ljava/text/SimpleDateFormat;
    .end local v11    # "serverDate":Ljava/util/Date;
    .end local v13    # "timezone":Ljava/lang/String;
    :cond_5
    const-string v14, "routes"

    invoke-virtual {v8, v14}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_0

    .line 95
    const-string v14, "routes"

    invoke-virtual {v8, v14}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 96
    .local v1, "array":Lorg/json/JSONArray;
    new-instance v10, Ljava/util/ArrayList;

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v14

    invoke-direct {v10, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 99
    .local v10, "routes":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/Route;>;"
    const/4 v7, 0x0

    .local v7, "i":I
    :goto_1
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v14

    if-lt v7, v14, :cond_6

    .line 108
    invoke-virtual/range {p1 .. p1}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->isLoadInactives()Z

    move-result v14

    if-eqz v14, :cond_8

    .line 109
    move-object/from16 v0, p1

    invoke-virtual {v0, v10}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->setInactiveRoutes(Ljava/util/List;)V

    goto/16 :goto_0

    .line 100
    :cond_6
    invoke-virtual {v1, v7}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v14

    invoke-static {v14}, Lcom/thetransitapp/droid/data/TransitSourceFactory;->createRoute(Lorg/json/JSONObject;)Lcom/thetransitapp/droid/model/Route;

    move-result-object v9

    .line 101
    .local v9, "route":Lcom/thetransitapp/droid/model/Route;
    if-eqz v9, :cond_7

    .line 102
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/thetransitapp/droid/data/OnlineTransitSource;->database:Lcom/thetransitapp/droid/data/TransitDatabaseHelper;

    invoke-virtual {v14, v9}, Lcom/thetransitapp/droid/data/TransitDatabaseHelper;->isFavorite(Lcom/thetransitapp/droid/model/Route;)Z

    move-result v14

    invoke-virtual {v9, v14}, Lcom/thetransitapp/droid/model/Route;->setFavorite(Z)V

    .line 104
    invoke-interface {v10, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    :cond_7
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 111
    .end local v9    # "route":Lcom/thetransitapp/droid/model/Route;
    :cond_8
    move-object/from16 v0, p1

    invoke-virtual {v0, v10}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest;->setRoutes(Ljava/util/List;)V

    goto/16 :goto_0
.end method
