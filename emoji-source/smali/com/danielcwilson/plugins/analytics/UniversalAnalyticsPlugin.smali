.class public Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;
.super Lorg/apache/cordova/CordovaPlugin;
.source "UniversalAnalyticsPlugin.java"


# static fields
.field public static final ADD_DIMENSION:Ljava/lang/String; = "addCustomDimension"

.field public static final ADD_TRANSACTION:Ljava/lang/String; = "addTransaction"

.field public static final ADD_TRANSACTION_ITEM:Ljava/lang/String; = "addTransactionItem"

.field public static final DEBUG_MODE:Ljava/lang/String; = "debugMode"

.field public static final SET_USER_ID:Ljava/lang/String; = "setUserId"

.field public static final START_TRACKER:Ljava/lang/String; = "startTrackerWithId"

.field public static final TRACK_EVENT:Ljava/lang/String; = "trackEvent"

.field public static final TRACK_EXCEPTION:Ljava/lang/String; = "trackException"

.field public static final TRACK_TIMING:Ljava/lang/String; = "trackTiming"

.field public static final TRACK_VIEW:Ljava/lang/String; = "trackView"


# instance fields
.field public customDimensions:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public debugModeEnabled:Ljava/lang/Boolean;

.field public tracker:Lcom/google/android/gms/analytics/Tracker;

.field public trackerStarted:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 17
    invoke-direct {p0}, Lorg/apache/cordova/CordovaPlugin;-><init>()V

    .line 30
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->trackerStarted:Ljava/lang/Boolean;

    .line 31
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->debugModeEnabled:Ljava/lang/Boolean;

    .line 32
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->customDimensions:Ljava/util/HashMap;

    return-void
.end method

.method private addCustomDimension(Ljava/lang/String;Ljava/lang/String;Lorg/apache/cordova/CallbackContext;)V
    .locals 1
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;
    .param p3, "callbackContext"    # Lorg/apache/cordova/CallbackContext;

    .prologue
    .line 121
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 122
    iget-object v0, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->customDimensions:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    const-string v0, "custom dimension started"

    invoke-virtual {p3, v0}, Lorg/apache/cordova/CallbackContext;->success(Ljava/lang/String;)V

    .line 127
    :goto_0
    return-void

    .line 125
    :cond_0
    const-string v0, "Expected non-empty string arguments."

    invoke-virtual {p3, v0}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private addCustomDimensionsToTracker(Lcom/google/android/gms/analytics/Tracker;)V
    .locals 6
    .param p1, "tracker"    # Lcom/google/android/gms/analytics/Tracker;

    .prologue
    .line 130
    iget-object v3, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->customDimensions:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 131
    .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 132
    .local v1, "key":Ljava/lang/String;
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 134
    .local v2, "value":Ljava/lang/String;
    new-instance v3, Lcom/google/android/gms/analytics/HitBuilders$AppViewBuilder;

    invoke-direct {v3}, Lcom/google/android/gms/analytics/HitBuilders$AppViewBuilder;-><init>()V

    .line 136
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v3, v5, v2}, Lcom/google/android/gms/analytics/HitBuilders$AppViewBuilder;->setCustomDimension(ILjava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$HitBuilder;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/analytics/HitBuilders$AppViewBuilder;

    invoke-virtual {v3}, Lcom/google/android/gms/analytics/HitBuilders$AppViewBuilder;->build()Ljava/util/Map;

    move-result-object v3

    .line 134
    invoke-virtual {p1, v3}, Lcom/google/android/gms/analytics/Tracker;->send(Ljava/util/Map;)V

    goto :goto_0

    .line 138
    .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v1    # "key":Ljava/lang/String;
    .end local v2    # "value":Ljava/lang/String;
    :cond_0
    return-void
.end method

.method private addTransaction(Ljava/lang/String;Ljava/lang/String;DDDLjava/lang/String;Lorg/apache/cordova/CallbackContext;)V
    .locals 3
    .param p1, "id"    # Ljava/lang/String;
    .param p2, "affiliation"    # Ljava/lang/String;
    .param p3, "revenue"    # D
    .param p5, "tax"    # D
    .param p7, "shipping"    # D
    .param p9, "currencyCode"    # Ljava/lang/String;
    .param p10, "callbackContext"    # Lorg/apache/cordova/CallbackContext;

    .prologue
    .line 228
    iget-object v0, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->trackerStarted:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 229
    const-string v0, "Tracker not started"

    invoke-virtual {p10, v0}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    .line 249
    :goto_0
    return-void

    .line 233
    :cond_0
    iget-object v0, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->tracker:Lcom/google/android/gms/analytics/Tracker;

    invoke-direct {p0, v0}, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->addCustomDimensionsToTracker(Lcom/google/android/gms/analytics/Tracker;)V

    .line 235
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 236
    iget-object v0, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->tracker:Lcom/google/android/gms/analytics/Tracker;

    new-instance v1, Lcom/google/android/gms/analytics/HitBuilders$TransactionBuilder;

    invoke-direct {v1}, Lcom/google/android/gms/analytics/HitBuilders$TransactionBuilder;-><init>()V

    .line 238
    invoke-virtual {v1, p1}, Lcom/google/android/gms/analytics/HitBuilders$TransactionBuilder;->setTransactionId(Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$TransactionBuilder;

    move-result-object v1

    .line 239
    invoke-virtual {v1, p2}, Lcom/google/android/gms/analytics/HitBuilders$TransactionBuilder;->setAffiliation(Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$TransactionBuilder;

    move-result-object v1

    .line 240
    invoke-virtual {v1, p3, p4}, Lcom/google/android/gms/analytics/HitBuilders$TransactionBuilder;->setRevenue(D)Lcom/google/android/gms/analytics/HitBuilders$TransactionBuilder;

    move-result-object v1

    invoke-virtual {v1, p5, p6}, Lcom/google/android/gms/analytics/HitBuilders$TransactionBuilder;->setTax(D)Lcom/google/android/gms/analytics/HitBuilders$TransactionBuilder;

    move-result-object v1

    .line 241
    invoke-virtual {v1, p7, p8}, Lcom/google/android/gms/analytics/HitBuilders$TransactionBuilder;->setShipping(D)Lcom/google/android/gms/analytics/HitBuilders$TransactionBuilder;

    move-result-object v1

    .line 242
    invoke-virtual {v1, p9}, Lcom/google/android/gms/analytics/HitBuilders$TransactionBuilder;->setCurrencyCode(Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$TransactionBuilder;

    move-result-object v1

    .line 243
    invoke-virtual {v1}, Lcom/google/android/gms/analytics/HitBuilders$TransactionBuilder;->build()Ljava/util/Map;

    move-result-object v1

    .line 236
    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/Tracker;->send(Ljava/util/Map;)V

    .line 245
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Add Transaction: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p10, v0}, Lorg/apache/cordova/CallbackContext;->success(Ljava/lang/String;)V

    goto :goto_0

    .line 247
    :cond_1
    const-string v0, "Expected non-empty ID."

    invoke-virtual {p10, v0}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private addTransactionItem(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DJLjava/lang/String;Lorg/apache/cordova/CallbackContext;)V
    .locals 3
    .param p1, "id"    # Ljava/lang/String;
    .param p2, "name"    # Ljava/lang/String;
    .param p3, "sku"    # Ljava/lang/String;
    .param p4, "category"    # Ljava/lang/String;
    .param p5, "price"    # D
    .param p7, "quantity"    # J
    .param p9, "currencyCode"    # Ljava/lang/String;
    .param p10, "callbackContext"    # Lorg/apache/cordova/CallbackContext;

    .prologue
    .line 252
    iget-object v0, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->trackerStarted:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 253
    const-string v0, "Tracker not started"

    invoke-virtual {p10, v0}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    .line 276
    :goto_0
    return-void

    .line 257
    :cond_0
    iget-object v0, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->tracker:Lcom/google/android/gms/analytics/Tracker;

    invoke-direct {p0, v0}, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->addCustomDimensionsToTracker(Lcom/google/android/gms/analytics/Tracker;)V

    .line 259
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 261
    iget-object v0, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->tracker:Lcom/google/android/gms/analytics/Tracker;

    new-instance v1, Lcom/google/android/gms/analytics/HitBuilders$ItemBuilder;

    invoke-direct {v1}, Lcom/google/android/gms/analytics/HitBuilders$ItemBuilder;-><init>()V

    .line 263
    invoke-virtual {v1, p1}, Lcom/google/android/gms/analytics/HitBuilders$ItemBuilder;->setTransactionId(Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$ItemBuilder;

    move-result-object v1

    .line 264
    invoke-virtual {v1, p2}, Lcom/google/android/gms/analytics/HitBuilders$ItemBuilder;->setName(Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$ItemBuilder;

    move-result-object v1

    .line 265
    invoke-virtual {v1, p3}, Lcom/google/android/gms/analytics/HitBuilders$ItemBuilder;->setSku(Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$ItemBuilder;

    move-result-object v1

    .line 266
    invoke-virtual {v1, p4}, Lcom/google/android/gms/analytics/HitBuilders$ItemBuilder;->setCategory(Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$ItemBuilder;

    move-result-object v1

    .line 267
    invoke-virtual {v1, p5, p6}, Lcom/google/android/gms/analytics/HitBuilders$ItemBuilder;->setPrice(D)Lcom/google/android/gms/analytics/HitBuilders$ItemBuilder;

    move-result-object v1

    .line 268
    invoke-virtual {v1, p7, p8}, Lcom/google/android/gms/analytics/HitBuilders$ItemBuilder;->setQuantity(J)Lcom/google/android/gms/analytics/HitBuilders$ItemBuilder;

    move-result-object v1

    .line 269
    invoke-virtual {v1, p9}, Lcom/google/android/gms/analytics/HitBuilders$ItemBuilder;->setCurrencyCode(Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$ItemBuilder;

    move-result-object v1

    .line 270
    invoke-virtual {v1}, Lcom/google/android/gms/analytics/HitBuilders$ItemBuilder;->build()Ljava/util/Map;

    move-result-object v1

    .line 261
    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/Tracker;->send(Ljava/util/Map;)V

    .line 272
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Add Transaction Item: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p10, v0}, Lorg/apache/cordova/CallbackContext;->success(Ljava/lang/String;)V

    goto :goto_0

    .line 274
    :cond_1
    const-string v0, "Expected non-empty ID."

    invoke-virtual {p10, v0}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private debugMode(Lorg/apache/cordova/CallbackContext;)V
    .locals 2
    .param p1, "callbackContext"    # Lorg/apache/cordova/CallbackContext;

    .prologue
    .line 279
    iget-object v0, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/android/gms/analytics/GoogleAnalytics;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->getLogger()Lcom/google/android/gms/analytics/Logger;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/analytics/Logger;->setLogLevel(I)V

    .line 281
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->debugModeEnabled:Ljava/lang/Boolean;

    .line 282
    const-string v0, "debugMode enabled"

    invoke-virtual {p1, v0}, Lorg/apache/cordova/CallbackContext;->success(Ljava/lang/String;)V

    .line 283
    return-void
.end method

.method private setUserId(Ljava/lang/String;Lorg/apache/cordova/CallbackContext;)V
    .locals 2
    .param p1, "userId"    # Ljava/lang/String;
    .param p2, "callbackContext"    # Lorg/apache/cordova/CallbackContext;

    .prologue
    .line 286
    iget-object v0, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->trackerStarted:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 287
    const-string v0, "Tracker not started"

    invoke-virtual {p2, v0}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    .line 293
    :goto_0
    return-void

    .line 291
    :cond_0
    iget-object v0, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->tracker:Lcom/google/android/gms/analytics/Tracker;

    const-string v1, "&uid"

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 292
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Set user id"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lorg/apache/cordova/CallbackContext;->success(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private startTracker(Ljava/lang/String;Lorg/apache/cordova/CallbackContext;)V
    .locals 2
    .param p1, "id"    # Ljava/lang/String;
    .param p2, "callbackContext"    # Lorg/apache/cordova/CallbackContext;

    .prologue
    .line 110
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 111
    iget-object v0, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/android/gms/analytics/GoogleAnalytics;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/analytics/GoogleAnalytics;->newTracker(Ljava/lang/String;)Lcom/google/android/gms/analytics/Tracker;

    move-result-object v0

    iput-object v0, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->tracker:Lcom/google/android/gms/analytics/Tracker;

    .line 112
    const-string v0, "tracker started"

    invoke-virtual {p2, v0}, Lorg/apache/cordova/CallbackContext;->success(Ljava/lang/String;)V

    .line 113
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->trackerStarted:Ljava/lang/Boolean;

    .line 114
    iget-object v0, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/android/gms/analytics/GoogleAnalytics;

    move-result-object v0

    const/16 v1, 0x1e

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/GoogleAnalytics;->setLocalDispatchPeriod(I)V

    .line 118
    :goto_0
    return-void

    .line 116
    :cond_0
    const-string v0, "tracker id is not valid"

    invoke-virtual {p2, v0}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private trackEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLorg/apache/cordova/CallbackContext;)V
    .locals 2
    .param p1, "category"    # Ljava/lang/String;
    .param p2, "action"    # Ljava/lang/String;
    .param p3, "label"    # Ljava/lang/String;
    .param p4, "value"    # J
    .param p6, "callbackContext"    # Lorg/apache/cordova/CallbackContext;

    .prologue
    .line 161
    iget-object v0, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->trackerStarted:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 162
    const-string v0, "Tracker not started"

    invoke-virtual {p6, v0}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    .line 181
    :goto_0
    return-void

    .line 166
    :cond_0
    iget-object v0, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->tracker:Lcom/google/android/gms/analytics/Tracker;

    invoke-direct {p0, v0}, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->addCustomDimensionsToTracker(Lcom/google/android/gms/analytics/Tracker;)V

    .line 168
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 169
    iget-object v0, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->tracker:Lcom/google/android/gms/analytics/Tracker;

    new-instance v1, Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;

    invoke-direct {v1}, Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;-><init>()V

    .line 171
    invoke-virtual {v1, p1}, Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;->setCategory(Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;

    move-result-object v1

    .line 172
    invoke-virtual {v1, p2}, Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;->setAction(Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;

    move-result-object v1

    .line 173
    invoke-virtual {v1, p3}, Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;->setLabel(Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;

    move-result-object v1

    .line 174
    invoke-virtual {v1, p4, p5}, Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;->setValue(J)Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;

    move-result-object v1

    .line 175
    invoke-virtual {v1}, Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;->build()Ljava/util/Map;

    move-result-object v1

    .line 169
    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/Tracker;->send(Ljava/util/Map;)V

    .line 177
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Track Event: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p6, v0}, Lorg/apache/cordova/CallbackContext;->success(Ljava/lang/String;)V

    goto :goto_0

    .line 179
    :cond_1
    const-string v0, "Expected non-empty string arguments."

    invoke-virtual {p6, v0}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private trackException(Ljava/lang/String;Ljava/lang/Boolean;Lorg/apache/cordova/CallbackContext;)V
    .locals 3
    .param p1, "description"    # Ljava/lang/String;
    .param p2, "fatal"    # Ljava/lang/Boolean;
    .param p3, "callbackContext"    # Lorg/apache/cordova/CallbackContext;

    .prologue
    .line 184
    iget-object v0, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->trackerStarted:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 185
    const-string v0, "Tracker not started"

    invoke-virtual {p3, v0}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    .line 202
    :goto_0
    return-void

    .line 189
    :cond_0
    iget-object v0, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->tracker:Lcom/google/android/gms/analytics/Tracker;

    invoke-direct {p0, v0}, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->addCustomDimensionsToTracker(Lcom/google/android/gms/analytics/Tracker;)V

    .line 191
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 192
    iget-object v0, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->tracker:Lcom/google/android/gms/analytics/Tracker;

    new-instance v1, Lcom/google/android/gms/analytics/HitBuilders$ExceptionBuilder;

    invoke-direct {v1}, Lcom/google/android/gms/analytics/HitBuilders$ExceptionBuilder;-><init>()V

    .line 194
    invoke-virtual {v1, p1}, Lcom/google/android/gms/analytics/HitBuilders$ExceptionBuilder;->setDescription(Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$ExceptionBuilder;

    move-result-object v1

    .line 195
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/analytics/HitBuilders$ExceptionBuilder;->setFatal(Z)Lcom/google/android/gms/analytics/HitBuilders$ExceptionBuilder;

    move-result-object v1

    .line 196
    invoke-virtual {v1}, Lcom/google/android/gms/analytics/HitBuilders$ExceptionBuilder;->build()Ljava/util/Map;

    move-result-object v1

    .line 192
    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/Tracker;->send(Ljava/util/Map;)V

    .line 198
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Track Exception: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lorg/apache/cordova/CallbackContext;->success(Ljava/lang/String;)V

    goto :goto_0

    .line 200
    :cond_1
    const-string v0, "Expected non-empty string arguments."

    invoke-virtual {p3, v0}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private trackTiming(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lorg/apache/cordova/CallbackContext;)V
    .locals 2
    .param p1, "category"    # Ljava/lang/String;
    .param p2, "intervalInMilliseconds"    # J
    .param p4, "name"    # Ljava/lang/String;
    .param p5, "label"    # Ljava/lang/String;
    .param p6, "callbackContext"    # Lorg/apache/cordova/CallbackContext;

    .prologue
    .line 205
    iget-object v0, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->trackerStarted:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 206
    const-string v0, "Tracker not started"

    invoke-virtual {p6, v0}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    .line 225
    :goto_0
    return-void

    .line 210
    :cond_0
    iget-object v0, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->tracker:Lcom/google/android/gms/analytics/Tracker;

    invoke-direct {p0, v0}, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->addCustomDimensionsToTracker(Lcom/google/android/gms/analytics/Tracker;)V

    .line 212
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 213
    iget-object v0, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->tracker:Lcom/google/android/gms/analytics/Tracker;

    new-instance v1, Lcom/google/android/gms/analytics/HitBuilders$TimingBuilder;

    invoke-direct {v1}, Lcom/google/android/gms/analytics/HitBuilders$TimingBuilder;-><init>()V

    .line 215
    invoke-virtual {v1, p1}, Lcom/google/android/gms/analytics/HitBuilders$TimingBuilder;->setCategory(Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$TimingBuilder;

    move-result-object v1

    .line 216
    invoke-virtual {v1, p2, p3}, Lcom/google/android/gms/analytics/HitBuilders$TimingBuilder;->setValue(J)Lcom/google/android/gms/analytics/HitBuilders$TimingBuilder;

    move-result-object v1

    .line 217
    invoke-virtual {v1, p4}, Lcom/google/android/gms/analytics/HitBuilders$TimingBuilder;->setVariable(Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$TimingBuilder;

    move-result-object v1

    .line 218
    invoke-virtual {v1, p5}, Lcom/google/android/gms/analytics/HitBuilders$TimingBuilder;->setLabel(Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$TimingBuilder;

    move-result-object v1

    .line 219
    invoke-virtual {v1}, Lcom/google/android/gms/analytics/HitBuilders$TimingBuilder;->build()Ljava/util/Map;

    move-result-object v1

    .line 213
    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/Tracker;->send(Ljava/util/Map;)V

    .line 221
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Track Timing: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p6, v0}, Lorg/apache/cordova/CallbackContext;->success(Ljava/lang/String;)V

    goto :goto_0

    .line 223
    :cond_1
    const-string v0, "Expected non-empty string arguments."

    invoke-virtual {p6, v0}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private trackView(Ljava/lang/String;Lorg/apache/cordova/CallbackContext;)V
    .locals 2
    .param p1, "screenname"    # Ljava/lang/String;
    .param p2, "callbackContext"    # Lorg/apache/cordova/CallbackContext;

    .prologue
    .line 141
    iget-object v0, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->trackerStarted:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 142
    const-string v0, "Tracker not started"

    invoke-virtual {p2, v0}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    .line 158
    :goto_0
    return-void

    .line 146
    :cond_0
    iget-object v0, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->tracker:Lcom/google/android/gms/analytics/Tracker;

    invoke-direct {p0, v0}, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->addCustomDimensionsToTracker(Lcom/google/android/gms/analytics/Tracker;)V

    .line 148
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 149
    iget-object v0, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->tracker:Lcom/google/android/gms/analytics/Tracker;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/analytics/Tracker;->setScreenName(Ljava/lang/String;)V

    .line 150
    iget-object v0, p0, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->tracker:Lcom/google/android/gms/analytics/Tracker;

    new-instance v1, Lcom/google/android/gms/analytics/HitBuilders$AppViewBuilder;

    invoke-direct {v1}, Lcom/google/android/gms/analytics/HitBuilders$AppViewBuilder;-><init>()V

    .line 152
    invoke-virtual {v1}, Lcom/google/android/gms/analytics/HitBuilders$AppViewBuilder;->build()Ljava/util/Map;

    move-result-object v1

    .line 150
    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/Tracker;->send(Ljava/util/Map;)V

    .line 154
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Track Screen: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lorg/apache/cordova/CallbackContext;->success(Ljava/lang/String;)V

    goto :goto_0

    .line 156
    :cond_1
    const-string v0, "Expected one non-empty string argument."

    invoke-virtual {p2, v0}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)Z
    .locals 24
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "args"    # Lorg/json/JSONArray;
    .param p3, "callbackContext"    # Lorg/apache/cordova/CallbackContext;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 38
    const-string v4, "startTrackerWithId"

    move-object/from16 v0, p1

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 39
    const/4 v4, 0x0

    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v18

    .line 40
    .local v18, "id":Ljava/lang/String;
    move-object/from16 v0, p0

    move-object/from16 v1, v18

    move-object/from16 v2, p3

    invoke-direct {v0, v1, v2}, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->startTracker(Ljava/lang/String;Lorg/apache/cordova/CallbackContext;)V

    .line 41
    const/4 v4, 0x1

    .line 106
    .end local v18    # "id":Ljava/lang/String;
    :goto_0
    return v4

    .line 42
    :cond_0
    const-string v4, "trackView"

    move-object/from16 v0, p1

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 43
    const/4 v4, 0x0

    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v21

    .line 44
    .local v21, "screen":Ljava/lang/String;
    move-object/from16 v0, p0

    move-object/from16 v1, v21

    move-object/from16 v2, p3

    invoke-direct {v0, v1, v2}, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->trackView(Ljava/lang/String;Lorg/apache/cordova/CallbackContext;)V

    .line 45
    const/4 v4, 0x1

    goto :goto_0

    .line 46
    .end local v21    # "screen":Ljava/lang/String;
    :cond_1
    const-string v4, "trackEvent"

    move-object/from16 v0, p1

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 47
    invoke-virtual/range {p2 .. p2}, Lorg/json/JSONArray;->length()I

    move-result v20

    .line 48
    .local v20, "length":I
    if-lez v20, :cond_2

    .line 49
    const/4 v4, 0x0

    .line 50
    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v4, 0x1

    move/from16 v0, v20

    if-le v0, v4, :cond_3

    const/4 v4, 0x1

    .line 51
    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    :goto_1
    const/4 v4, 0x2

    move/from16 v0, v20

    if-le v0, v4, :cond_4

    const/4 v4, 0x2

    .line 52
    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    :goto_2
    const/4 v4, 0x3

    move/from16 v0, v20

    if-le v0, v4, :cond_5

    const/4 v4, 0x3

    .line 53
    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getLong(I)J

    move-result-wide v8

    :goto_3
    move-object/from16 v4, p0

    move-object/from16 v10, p3

    .line 49
    invoke-direct/range {v4 .. v10}, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->trackEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLorg/apache/cordova/CallbackContext;)V

    .line 56
    :cond_2
    const/4 v4, 0x1

    goto :goto_0

    .line 51
    :cond_3
    const-string v6, ""

    goto :goto_1

    .line 52
    :cond_4
    const-string v7, ""

    goto :goto_2

    .line 53
    :cond_5
    const-wide/16 v8, 0x0

    goto :goto_3

    .line 57
    .end local v20    # "length":I
    :cond_6
    const-string v4, "trackException"

    move-object/from16 v0, p1

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 58
    const/4 v4, 0x0

    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v16

    .line 59
    .local v16, "description":Ljava/lang/String;
    const/4 v4, 0x1

    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getBoolean(I)Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v17

    .line 60
    .local v17, "fatal":Ljava/lang/Boolean;
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    move-object/from16 v3, p3

    invoke-direct {v0, v1, v2, v3}, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->trackException(Ljava/lang/String;Ljava/lang/Boolean;Lorg/apache/cordova/CallbackContext;)V

    .line 61
    const/4 v4, 0x1

    goto/16 :goto_0

    .line 62
    .end local v16    # "description":Ljava/lang/String;
    .end local v17    # "fatal":Ljava/lang/Boolean;
    :cond_7
    const-string v4, "trackTiming"

    move-object/from16 v0, p1

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    .line 63
    invoke-virtual/range {p2 .. p2}, Lorg/json/JSONArray;->length()I

    move-result v20

    .line 64
    .restart local v20    # "length":I
    if-lez v20, :cond_8

    .line 65
    const/4 v4, 0x0

    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v4, 0x1

    move/from16 v0, v20

    if-le v0, v4, :cond_9

    const/4 v4, 0x1

    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getLong(I)J

    move-result-wide v6

    :goto_4
    const/4 v4, 0x2

    move/from16 v0, v20

    if-le v0, v4, :cond_a

    const/4 v4, 0x2

    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v8

    :goto_5
    const/4 v4, 0x3

    move/from16 v0, v20

    if-le v0, v4, :cond_b

    const/4 v4, 0x3

    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v9

    :goto_6
    move-object/from16 v4, p0

    move-object/from16 v10, p3

    invoke-direct/range {v4 .. v10}, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->trackTiming(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lorg/apache/cordova/CallbackContext;)V

    .line 67
    :cond_8
    const/4 v4, 0x1

    goto/16 :goto_0

    .line 65
    :cond_9
    const-wide/16 v6, 0x0

    goto :goto_4

    :cond_a
    const-string v8, ""

    goto :goto_5

    :cond_b
    const-string v9, ""

    goto :goto_6

    .line 68
    .end local v20    # "length":I
    :cond_c
    const-string v4, "addCustomDimension"

    move-object/from16 v0, p1

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    .line 69
    const/4 v4, 0x0

    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v19

    .line 70
    .local v19, "key":Ljava/lang/String;
    const/4 v4, 0x1

    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v23

    .line 71
    .local v23, "value":Ljava/lang/String;
    move-object/from16 v0, p0

    move-object/from16 v1, v19

    move-object/from16 v2, v23

    move-object/from16 v3, p3

    invoke-direct {v0, v1, v2, v3}, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->addCustomDimension(Ljava/lang/String;Ljava/lang/String;Lorg/apache/cordova/CallbackContext;)V

    .line 72
    const/4 v4, 0x1

    goto/16 :goto_0

    .line 73
    .end local v19    # "key":Ljava/lang/String;
    .end local v23    # "value":Ljava/lang/String;
    :cond_d
    const-string v4, "addTransaction"

    move-object/from16 v0, p1

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_14

    .line 74
    invoke-virtual/range {p2 .. p2}, Lorg/json/JSONArray;->length()I

    move-result v20

    .line 75
    .restart local v20    # "length":I
    if-lez v20, :cond_e

    .line 76
    const/4 v4, 0x0

    .line 77
    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    const/4 v4, 0x1

    move/from16 v0, v20

    if-le v0, v4, :cond_f

    const/4 v4, 0x1

    .line 78
    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    :goto_7
    const/4 v4, 0x2

    move/from16 v0, v20

    if-le v0, v4, :cond_10

    const/4 v4, 0x2

    .line 79
    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getDouble(I)D

    move-result-wide v8

    :goto_8
    const/4 v4, 0x3

    move/from16 v0, v20

    if-le v0, v4, :cond_11

    const/4 v4, 0x3

    .line 80
    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getDouble(I)D

    move-result-wide v10

    :goto_9
    const/4 v4, 0x4

    move/from16 v0, v20

    if-le v0, v4, :cond_12

    const/4 v4, 0x4

    .line 81
    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getDouble(I)D

    move-result-wide v12

    :goto_a
    const/4 v4, 0x5

    move/from16 v0, v20

    if-le v0, v4, :cond_13

    const/4 v4, 0x5

    .line 82
    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v14

    :goto_b
    move-object/from16 v5, p0

    move-object/from16 v15, p3

    .line 76
    invoke-direct/range {v5 .. v15}, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->addTransaction(Ljava/lang/String;Ljava/lang/String;DDDLjava/lang/String;Lorg/apache/cordova/CallbackContext;)V

    .line 85
    :cond_e
    const/4 v4, 0x1

    goto/16 :goto_0

    .line 78
    :cond_f
    const-string v7, ""

    goto :goto_7

    .line 79
    :cond_10
    const-wide/16 v8, 0x0

    goto :goto_8

    .line 80
    :cond_11
    const-wide/16 v10, 0x0

    goto :goto_9

    .line 81
    :cond_12
    const-wide/16 v12, 0x0

    goto :goto_a

    .line 82
    :cond_13
    const/4 v14, 0x0

    goto :goto_b

    .line 86
    .end local v20    # "length":I
    :cond_14
    const-string v4, "addTransactionItem"

    move-object/from16 v0, p1

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1c

    .line 87
    invoke-virtual/range {p2 .. p2}, Lorg/json/JSONArray;->length()I

    move-result v20

    .line 88
    .restart local v20    # "length":I
    if-lez v20, :cond_15

    .line 89
    const/4 v4, 0x0

    .line 90
    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    const/4 v4, 0x1

    move/from16 v0, v20

    if-le v0, v4, :cond_16

    const/4 v4, 0x1

    .line 91
    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    :goto_c
    const/4 v4, 0x2

    move/from16 v0, v20

    if-le v0, v4, :cond_17

    const/4 v4, 0x2

    .line 92
    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v8

    :goto_d
    const/4 v4, 0x3

    move/from16 v0, v20

    if-le v0, v4, :cond_18

    const/4 v4, 0x3

    .line 93
    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v9

    :goto_e
    const/4 v4, 0x4

    move/from16 v0, v20

    if-le v0, v4, :cond_19

    const/4 v4, 0x4

    .line 94
    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getDouble(I)D

    move-result-wide v10

    :goto_f
    const/4 v4, 0x5

    move/from16 v0, v20

    if-le v0, v4, :cond_1a

    const/4 v4, 0x5

    .line 95
    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getLong(I)J

    move-result-wide v12

    :goto_10
    const/4 v4, 0x6

    move/from16 v0, v20

    if-le v0, v4, :cond_1b

    const/4 v4, 0x6

    .line 96
    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v14

    :goto_11
    move-object/from16 v5, p0

    move-object/from16 v15, p3

    .line 89
    invoke-direct/range {v5 .. v15}, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->addTransactionItem(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DJLjava/lang/String;Lorg/apache/cordova/CallbackContext;)V

    .line 99
    :cond_15
    const/4 v4, 0x1

    goto/16 :goto_0

    .line 91
    :cond_16
    const-string v7, ""

    goto :goto_c

    .line 92
    :cond_17
    const-string v8, ""

    goto :goto_d

    .line 93
    :cond_18
    const-string v9, ""

    goto :goto_e

    .line 94
    :cond_19
    const-wide/16 v10, 0x0

    goto :goto_f

    .line 95
    :cond_1a
    const-wide/16 v12, 0x0

    goto :goto_10

    .line 96
    :cond_1b
    const/4 v14, 0x0

    goto :goto_11

    .line 100
    .end local v20    # "length":I
    :cond_1c
    const-string v4, "setUserId"

    move-object/from16 v0, p1

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1e

    .line 101
    const/4 v4, 0x0

    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v22

    .line 102
    .local v22, "userId":Ljava/lang/String;
    move-object/from16 v0, p0

    move-object/from16 v1, v22

    move-object/from16 v2, p3

    invoke-direct {v0, v1, v2}, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->setUserId(Ljava/lang/String;Lorg/apache/cordova/CallbackContext;)V

    .line 106
    .end local v22    # "userId":Ljava/lang/String;
    :cond_1d
    :goto_12
    const/4 v4, 0x0

    goto/16 :goto_0

    .line 103
    :cond_1e
    const-string v4, "debugMode"

    move-object/from16 v0, p1

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1d

    .line 104
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-direct {v0, v1}, Lcom/danielcwilson/plugins/analytics/UniversalAnalyticsPlugin;->debugMode(Lorg/apache/cordova/CallbackContext;)V

    goto :goto_12
.end method
