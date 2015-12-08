.class Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ENCODED_EVENTS_KEY:Ljava/lang/String; = "encoded_events"

.field public static final EVENT_COUNT_KEY:Ljava/lang/String; = "event_count"

.field public static final NUM_SKIPPED_KEY:Ljava/lang/String; = "num_skipped"


# instance fields
.field private final MAX_ACCUMULATED_LOG_EVENTS:I

.field private accumulatedEvents:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/appevents/AppEventsLogger$AppEvent;",
            ">;"
        }
    .end annotation
.end field

.field private anonymousAppDeviceGUID:Ljava/lang/String;

.field private attributionIdentifiers:Lcom/facebook/internal/AttributionIdentifiers;

.field private inFlightEvents:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/appevents/AppEventsLogger$AppEvent;",
            ">;"
        }
    .end annotation
.end field

.field private numSkippedEventsDueToFullBuffer:I

.field private packageName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/facebook/internal/AttributionIdentifiers;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 1164
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1148
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->accumulatedEvents:Ljava/util/List;

    .line 1149
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->inFlightEvents:Ljava/util/List;

    .line 1159
    const/16 v0, 0x3e8

    iput v0, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->MAX_ACCUMULATED_LOG_EVENTS:I

    .line 1165
    iput-object p1, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->attributionIdentifiers:Lcom/facebook/internal/AttributionIdentifiers;

    .line 1166
    iput-object p2, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->packageName:Ljava/lang/String;

    .line 1167
    iput-object p3, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->anonymousAppDeviceGUID:Ljava/lang/String;

    .line 1168
    return-void
.end method

.method private getStringAsByteArray(Ljava/lang/String;)[B
    .locals 3

    .prologue
    .line 1282
    const/4 v0, 0x0

    .line 1284
    :try_start_0
    const-string v1, "UTF-8"

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 1289
    :goto_0
    return-object v0

    .line 1285
    :catch_0
    move-exception v1

    .line 1287
    const-string v2, "Encoding exception: "

    invoke-static {v2, v1}, Lcom/facebook/internal/Utility;->logd(Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method private populateRequest(Lcom/facebook/GraphRequest;ILorg/json/JSONArray;Z)V
    .locals 4

    .prologue
    .line 1238
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 1240
    :try_start_0
    const-string v1, "event"

    const-string v2, "CUSTOM_APP_EVENTS"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1242
    iget v1, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->numSkippedEventsDueToFullBuffer:I

    if-lez v1, :cond_0

    .line 1243
    const-string v1, "num_skipped_events"

    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1246
    :cond_0
    iget-object v1, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->attributionIdentifiers:Lcom/facebook/internal/AttributionIdentifiers;

    iget-object v2, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->anonymousAppDeviceGUID:Ljava/lang/String;

    invoke-static {v0, v1, v2, p4}, Lcom/facebook/internal/Utility;->setAppEventAttributionParameters(Lorg/json/JSONObject;Lcom/facebook/internal/AttributionIdentifiers;Ljava/lang/String;Z)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1253
    :try_start_1
    # getter for: Lcom/facebook/appevents/AppEventsLogger;->applicationContext:Landroid/content/Context;
    invoke-static {}, Lcom/facebook/appevents/AppEventsLogger;->access$1000()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/internal/Utility;->setAppEventExtendedDeviceInfoParameters(Lorg/json/JSONObject;Landroid/content/Context;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 1260
    :goto_0
    :try_start_2
    const-string v1, "application_package_name"

    iget-object v2, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 1264
    :goto_1
    invoke-virtual {p1, v0}, Lcom/facebook/GraphRequest;->setGraphObject(Lorg/json/JSONObject;)V

    .line 1266
    invoke-virtual {p1}, Lcom/facebook/GraphRequest;->getParameters()Landroid/os/Bundle;

    move-result-object v0

    .line 1267
    if-nez v0, :cond_1

    .line 1268
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 1271
    :cond_1
    invoke-virtual {p3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1272
    if-eqz v1, :cond_2

    .line 1273
    const-string v2, "custom_events_file"

    invoke-direct {p0, v1}, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->getStringAsByteArray(Ljava/lang/String;)[B

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 1276
    invoke-virtual {p1, v1}, Lcom/facebook/GraphRequest;->setTag(Ljava/lang/Object;)V

    .line 1278
    :cond_2
    invoke-virtual {p1, v0}, Lcom/facebook/GraphRequest;->setParameters(Landroid/os/Bundle;)V

    .line 1279
    return-void

    :catch_0
    move-exception v1

    goto :goto_1

    :catch_1
    move-exception v1

    goto :goto_0
.end method


# virtual methods
.method public declared-synchronized accumulatePersistedEvents(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/appevents/AppEventsLogger$AppEvent;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1233
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->accumulatedEvents:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1234
    monitor-exit p0

    return-void

    .line 1233
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized addEvent(Lcom/facebook/appevents/AppEventsLogger$AppEvent;)V
    .locals 2

    .prologue
    .line 1173
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->accumulatedEvents:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->inFlightEvents:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    const/16 v1, 0x3e8

    if-lt v0, v1, :cond_0

    .line 1174
    iget v0, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->numSkippedEventsDueToFullBuffer:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->numSkippedEventsDueToFullBuffer:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1178
    :goto_0
    monitor-exit p0

    return-void

    .line 1176
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->accumulatedEvents:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 1173
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized clearInFlightAndStats(Z)V
    .locals 2

    .prologue
    .line 1185
    monitor-enter p0

    if-eqz p1, :cond_0

    .line 1186
    :try_start_0
    iget-object v0, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->accumulatedEvents:Ljava/util/List;

    iget-object v1, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->inFlightEvents:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1188
    :cond_0
    iget-object v0, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->inFlightEvents:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1189
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->numSkippedEventsDueToFullBuffer:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1190
    monitor-exit p0

    return-void

    .line 1185
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized getAccumulatedEventCount()I
    .locals 1

    .prologue
    .line 1181
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->accumulatedEvents:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized getEventsToPersist()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/appevents/AppEventsLogger$AppEvent;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1224
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->accumulatedEvents:Ljava/util/List;

    .line 1225
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->accumulatedEvents:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1226
    monitor-exit p0

    return-object v0

    .line 1224
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public populateRequest(Lcom/facebook/GraphRequest;ZZ)I
    .locals 5

    .prologue
    .line 1197
    monitor-enter p0

    .line 1198
    :try_start_0
    iget v1, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->numSkippedEventsDueToFullBuffer:I

    .line 1201
    iget-object v0, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->inFlightEvents:Ljava/util/List;

    iget-object v2, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->accumulatedEvents:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1202
    iget-object v0, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->accumulatedEvents:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1204
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 1205
    iget-object v0, p0, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->inFlightEvents:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/appevents/AppEventsLogger$AppEvent;

    .line 1206
    if-nez p2, :cond_1

    invoke-virtual {v0}, Lcom/facebook/appevents/AppEventsLogger$AppEvent;->getIsImplicit()Z

    move-result v4

    if-nez v4, :cond_0

    .line 1207
    :cond_1
    invoke-virtual {v0}, Lcom/facebook/appevents/AppEventsLogger$AppEvent;->getJSONObject()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    .line 1214
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 1211
    :cond_2
    :try_start_1
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-nez v0, :cond_3

    .line 1212
    const/4 v0, 0x0

    monitor-exit p0

    .line 1217
    :goto_1
    return v0

    .line 1214
    :cond_3
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1216
    invoke-direct {p0, p1, v1, v2, p3}, Lcom/facebook/appevents/AppEventsLogger$SessionEventsState;->populateRequest(Lcom/facebook/GraphRequest;ILorg/json/JSONArray;Z)V

    .line 1217
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v0

    goto :goto_1
.end method
