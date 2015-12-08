.class public Lcom/thetransitapp/droid/controller/FeedManager;
.super Ljava/lang/Object;
.source "FeedManager.java"

# interfaces
.implements Lcom/thetransitapp/droid/service/ServiceCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/thetransitapp/droid/controller/FeedManager$FeedManagerCallback;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/thetransitapp/droid/service/ServiceCallback",
        "<",
        "Lcom/thetransitapp/droid/model/BundleResponse;",
        ">;"
    }
.end annotation

.annotation runtime Ljavax/inject/Singleton;
.end annotation


# instance fields
.field private bundles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/TransitBundle;",
            ">;"
        }
    .end annotation
.end field

.field private callbacks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/controller/FeedManager$FeedManagerCallback;",
            ">;"
        }
    .end annotation
.end field

.field private closestBundle:Lcom/thetransitapp/droid/model/TransitBundle;

.field private final databaseHelper:Lcom/thetransitapp/droid/data/TransitDatabaseHelper;

.field private lastLocation:Landroid/location/Location;

.field private loadedAll:Z

.field private final preferences:Landroid/content/SharedPreferences;

.field private response:Lcom/thetransitapp/droid/model/BundleResponse;

.field private selectionChanged:Z


# direct methods
.method public constructor <init>(Landroid/app/Application;Lcom/thetransitapp/droid/data/TransitDatabaseHelper;Landroid/content/SharedPreferences;)V
    .locals 1
    .param p1, "application"    # Landroid/app/Application;
    .param p2, "databaseHelper"    # Lcom/thetransitapp/droid/data/TransitDatabaseHelper;
    .param p3, "preferences"    # Landroid/content/SharedPreferences;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation

    .prologue
    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/thetransitapp/droid/controller/FeedManager;->loadedAll:Z

    .line 53
    iput-object p2, p0, Lcom/thetransitapp/droid/controller/FeedManager;->databaseHelper:Lcom/thetransitapp/droid/data/TransitDatabaseHelper;

    .line 54
    iput-object p3, p0, Lcom/thetransitapp/droid/controller/FeedManager;->preferences:Landroid/content/SharedPreferences;

    .line 56
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/controller/FeedManager;->bundles:Ljava/util/List;

    .line 57
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/thetransitapp/droid/controller/FeedManager;->callbacks:Ljava/util/List;

    .line 58
    return-void
.end method

.method private notifyCallbacks()V
    .locals 5

    .prologue
    .line 118
    invoke-direct {p0}, Lcom/thetransitapp/droid/controller/FeedManager;->updateTimeZone()V

    .line 120
    iget-object v3, p0, Lcom/thetransitapp/droid/controller/FeedManager;->closestBundle:Lcom/thetransitapp/droid/model/TransitBundle;

    if-eqz v3, :cond_1

    .line 121
    const-string v3, "US"

    iget-object v4, p0, Lcom/thetransitapp/droid/controller/FeedManager;->closestBundle:Lcom/thetransitapp/droid/model/TransitBundle;

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/TransitBundle;->getCountryCode()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    .line 122
    .local v2, "isImperial":Z
    iget-object v3, p0, Lcom/thetransitapp/droid/controller/FeedManager;->preferences:Landroid/content/SharedPreferences;

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 124
    .local v1, "editor":Landroid/content/SharedPreferences$Editor;
    const-string v3, "useImperialSystem"

    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 126
    iget-object v3, p0, Lcom/thetransitapp/droid/controller/FeedManager;->closestBundle:Lcom/thetransitapp/droid/model/TransitBundle;

    invoke-virtual {v3}, Lcom/thetransitapp/droid/model/TransitBundle;->getServer()Lcom/thetransitapp/droid/model/TransitServer;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 127
    const-string v3, "router_id"

    iget-object v4, p0, Lcom/thetransitapp/droid/controller/FeedManager;->closestBundle:Lcom/thetransitapp/droid/model/TransitBundle;

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/TransitBundle;->getServer()Lcom/thetransitapp/droid/model/TransitServer;

    move-result-object v4

    invoke-virtual {v4}, Lcom/thetransitapp/droid/model/TransitServer;->getRouterId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 130
    :cond_0
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 133
    .end local v1    # "editor":Landroid/content/SharedPreferences$Editor;
    .end local v2    # "isImperial":Z
    :cond_1
    iget-object v3, p0, Lcom/thetransitapp/droid/controller/FeedManager;->callbacks:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_2

    .line 136
    return-void

    .line 133
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/controller/FeedManager$FeedManagerCallback;

    .line 134
    .local v0, "callback":Lcom/thetransitapp/droid/controller/FeedManager$FeedManagerCallback;
    invoke-interface {v0}, Lcom/thetransitapp/droid/controller/FeedManager$FeedManagerCallback;->feedUpdated()V

    goto :goto_0
.end method

.method private setClosestBundle()Lcom/thetransitapp/droid/model/TransitBundle;
    .locals 4

    .prologue
    .line 151
    iget-object v2, p0, Lcom/thetransitapp/droid/controller/FeedManager;->lastLocation:Landroid/location/Location;

    if-nez v2, :cond_0

    .line 152
    iget-object v2, p0, Lcom/thetransitapp/droid/controller/FeedManager;->bundles:Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/thetransitapp/droid/model/TransitBundle;

    .line 158
    :goto_0
    return-object v2

    .line 155
    :cond_0
    iget-object v1, p0, Lcom/thetransitapp/droid/controller/FeedManager;->lastLocation:Landroid/location/Location;

    .line 156
    .local v1, "location":Landroid/location/Location;
    invoke-virtual {p0, v1}, Lcom/thetransitapp/droid/controller/FeedManager;->closestBundleToLocation(Landroid/location/Location;)Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v0

    .local v0, "closest":Lcom/thetransitapp/droid/model/TransitBundle;
    move-object v2, v0

    .line 158
    goto :goto_0
.end method

.method private shouldLoad(Landroid/location/Location;)Z
    .locals 2
    .param p1, "location"    # Landroid/location/Location;

    .prologue
    .line 139
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/FeedManager;->lastLocation:Landroid/location/Location;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/thetransitapp/droid/controller/FeedManager;->lastLocation:Landroid/location/Location;

    invoke-virtual {v0, p1}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result v0

    const v1, 0x47c35000    # 100000.0f

    cmpl-float v0, v0, v1

    if-gtz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private updateTimeZone()V
    .locals 2

    .prologue
    .line 143
    invoke-direct {p0}, Lcom/thetransitapp/droid/controller/FeedManager;->setClosestBundle()Lcom/thetransitapp/droid/model/TransitBundle;

    move-result-object v0

    iput-object v0, p0, Lcom/thetransitapp/droid/controller/FeedManager;->closestBundle:Lcom/thetransitapp/droid/model/TransitBundle;

    .line 145
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/FeedManager;->closestBundle:Lcom/thetransitapp/droid/model/TransitBundle;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/thetransitapp/droid/controller/FeedManager;->closestBundle:Lcom/thetransitapp/droid/model/TransitBundle;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/TransitBundle;->getFeeds()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 146
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/FeedManager;->closestBundle:Lcom/thetransitapp/droid/model/TransitBundle;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/TransitBundle;->getFeeds()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/Feed;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/Feed;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v0

    invoke-static {v0}, Ljava/util/TimeZone;->setDefault(Ljava/util/TimeZone;)V

    .line 148
    :cond_0
    return-void
.end method


# virtual methods
.method public addFeedManagerCallback(Lcom/thetransitapp/droid/controller/FeedManager$FeedManagerCallback;)V
    .locals 1
    .param p1, "callback"    # Lcom/thetransitapp/droid/controller/FeedManager$FeedManagerCallback;

    .prologue
    .line 196
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/FeedManager;->callbacks:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 197
    return-void
.end method

.method public closestBundleToLocation(Landroid/location/Location;)Lcom/thetransitapp/droid/model/TransitBundle;
    .locals 11
    .param p1, "location"    # Landroid/location/Location;

    .prologue
    .line 162
    const/4 v2, 0x0

    .line 163
    .local v2, "closest":Lcom/thetransitapp/droid/model/TransitBundle;
    const-wide v5, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 166
    .local v5, "minDistance":D
    iget-object v8, p0, Lcom/thetransitapp/droid/controller/FeedManager;->bundles:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_0
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-nez v9, :cond_2

    .line 179
    if-eqz v2, :cond_1

    .line 180
    const/4 v8, 0x0

    iput-boolean v8, p0, Lcom/thetransitapp/droid/controller/FeedManager;->selectionChanged:Z

    .line 182
    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/TransitBundle;->getTransitModes()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-nez v9, :cond_3

    .line 187
    :cond_1
    return-object v2

    .line 166
    :cond_2
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/TransitBundle;

    .line 167
    .local v0, "bundle":Lcom/thetransitapp/droid/model/TransitBundle;
    new-instance v1, Landroid/location/Location;

    const-string v9, "Transit"

    invoke-direct {v1, v9}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    .line 168
    .local v1, "bundleLocation":Landroid/location/Location;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/TransitBundle;->getLatitude()D

    move-result-wide v9

    invoke-virtual {v1, v9, v10}, Landroid/location/Location;->setLatitude(D)V

    .line 169
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/TransitBundle;->getLongitude()D

    move-result-wide v9

    invoke-virtual {v1, v9, v10}, Landroid/location/Location;->setLongitude(D)V

    .line 171
    invoke-virtual {v1, p1}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result v9

    float-to-double v3, v9

    .line 173
    .local v3, "distance":D
    cmpg-double v9, v3, v5

    if-gez v9, :cond_0

    .line 174
    move-wide v5, v3

    .line 175
    move-object v2, v0

    goto :goto_0

    .line 182
    .end local v0    # "bundle":Lcom/thetransitapp/droid/model/TransitBundle;
    .end local v1    # "bundleLocation":Landroid/location/Location;
    .end local v3    # "distance":D
    :cond_3
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/thetransitapp/droid/model/TransitMode;

    .line 183
    .local v7, "mode":Lcom/thetransitapp/droid/model/TransitMode;
    iget-object v9, p0, Lcom/thetransitapp/droid/controller/FeedManager;->databaseHelper:Lcom/thetransitapp/droid/data/TransitDatabaseHelper;

    invoke-virtual {v9, v2, v7}, Lcom/thetransitapp/droid/data/TransitDatabaseHelper;->isTransitModeSlected(Lcom/thetransitapp/droid/model/TransitBundle;Lcom/thetransitapp/droid/model/TransitMode;)Z

    move-result v9

    invoke-virtual {v7, v9}, Lcom/thetransitapp/droid/model/TransitMode;->setSelected(Z)V

    goto :goto_1
.end method

.method public getBundles()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/TransitBundle;",
            ">;"
        }
    .end annotation

    .prologue
    .line 39
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/FeedManager;->bundles:Ljava/util/List;

    return-object v0
.end method

.method public getClosestBundle()Lcom/thetransitapp/droid/model/TransitBundle;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/FeedManager;->closestBundle:Lcom/thetransitapp/droid/model/TransitBundle;

    return-object v0
.end method

.method public getFeed(Lcom/thetransitapp/droid/model/Route;)Lcom/thetransitapp/droid/model/Feed;
    .locals 6
    .param p1, "route"    # Lcom/thetransitapp/droid/model/Route;

    .prologue
    .line 204
    iget-object v2, p0, Lcom/thetransitapp/droid/controller/FeedManager;->bundles:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    .line 212
    const/4 v1, 0x0

    :goto_0
    return-object v1

    .line 204
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/TransitBundle;

    .line 205
    .local v0, "bundle":Lcom/thetransitapp/droid/model/TransitBundle;
    invoke-virtual {v0}, Lcom/thetransitapp/droid/model/TransitBundle;->getFeeds()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/thetransitapp/droid/model/Feed;

    .line 206
    .local v1, "feed":Lcom/thetransitapp/droid/model/Feed;
    invoke-virtual {v1}, Lcom/thetransitapp/droid/model/Feed;->getFeedId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/Route;->getFeedId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_0
.end method

.method public getShareMessage()Ljava/lang/String;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DefaultLocale"
        }
    .end annotation

    .prologue
    .line 101
    const/4 v1, 0x0

    .line 103
    .local v1, "message":Ljava/lang/String;
    iget-object v2, p0, Lcom/thetransitapp/droid/controller/FeedManager;->response:Lcom/thetransitapp/droid/model/BundleResponse;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/thetransitapp/droid/controller/FeedManager;->response:Lcom/thetransitapp/droid/model/BundleResponse;

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/BundleResponse;->getShareMessage()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 104
    iget-object v2, p0, Lcom/thetransitapp/droid/controller/FeedManager;->response:Lcom/thetransitapp/droid/model/BundleResponse;

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/BundleResponse;->getShareMessage()Ljava/util/Map;

    move-result-object v2

    const-string v3, "en_us"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .end local v1    # "message":Ljava/lang/String;
    check-cast v1, Ljava/lang/String;

    .line 106
    .restart local v1    # "message":Ljava/lang/String;
    iget-object v2, p0, Lcom/thetransitapp/droid/controller/FeedManager;->response:Lcom/thetransitapp/droid/model/BundleResponse;

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/BundleResponse;->getShareMessage()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_2

    .line 114
    :cond_1
    :goto_0
    return-object v1

    .line 106
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 107
    .local v0, "key":Ljava/lang/String;
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 108
    iget-object v2, p0, Lcom/thetransitapp/droid/controller/FeedManager;->response:Lcom/thetransitapp/droid/model/BundleResponse;

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/BundleResponse;->getShareMessage()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .end local v1    # "message":Ljava/lang/String;
    check-cast v1, Ljava/lang/String;

    .line 109
    .restart local v1    # "message":Ljava/lang/String;
    goto :goto_0
.end method

.method public isReady()Z
    .locals 1

    .prologue
    .line 216
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/FeedManager;->bundles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public isSelectionChanged()Z
    .locals 1

    .prologue
    .line 48
    iget-boolean v0, p0, Lcom/thetransitapp/droid/controller/FeedManager;->selectionChanged:Z

    return v0
.end method

.method public onError(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0
    .param p1, "message"    # Ljava/lang/String;
    .param p2, "exception"    # Ljava/lang/Exception;

    .prologue
    .line 192
    invoke-direct {p0}, Lcom/thetransitapp/droid/controller/FeedManager;->notifyCallbacks()V

    .line 193
    return-void
.end method

.method public onResult(Lcom/thetransitapp/droid/model/BundleResponse;)V
    .locals 4
    .param p1, "result"    # Lcom/thetransitapp/droid/model/BundleResponse;

    .prologue
    .line 78
    iput-object p1, p0, Lcom/thetransitapp/droid/controller/FeedManager;->response:Lcom/thetransitapp/droid/model/BundleResponse;

    .line 80
    invoke-virtual {p1}, Lcom/thetransitapp/droid/model/BundleResponse;->getBundles()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_0

    .line 90
    invoke-direct {p0}, Lcom/thetransitapp/droid/controller/FeedManager;->notifyCallbacks()V

    .line 91
    return-void

    .line 80
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/TransitBundle;

    .line 81
    .local v0, "bundle":Lcom/thetransitapp/droid/model/TransitBundle;
    iget-object v2, p0, Lcom/thetransitapp/droid/controller/FeedManager;->bundles:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    .line 83
    .local v1, "index":I
    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    .line 84
    iget-object v2, p0, Lcom/thetransitapp/droid/controller/FeedManager;->bundles:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/thetransitapp/droid/model/TransitBundle;

    invoke-virtual {v2, v0}, Lcom/thetransitapp/droid/model/TransitBundle;->merge(Lcom/thetransitapp/droid/model/TransitBundle;)V

    goto :goto_0

    .line 86
    :cond_1
    iget-object v2, p0, Lcom/thetransitapp/droid/controller/FeedManager;->bundles:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Lcom/thetransitapp/droid/model/BundleResponse;

    invoke-virtual {p0, p1}, Lcom/thetransitapp/droid/controller/FeedManager;->onResult(Lcom/thetransitapp/droid/model/BundleResponse;)V

    return-void
.end method

.method public onSelectionChanged()V
    .locals 2

    .prologue
    .line 94
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/thetransitapp/droid/controller/FeedManager;->selectionChanged:Z

    .line 96
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/FeedManager;->databaseHelper:Lcom/thetransitapp/droid/data/TransitDatabaseHelper;

    iget-object v1, p0, Lcom/thetransitapp/droid/controller/FeedManager;->closestBundle:Lcom/thetransitapp/droid/model/TransitBundle;

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/data/TransitDatabaseHelper;->saveTransitModeSelection(Lcom/thetransitapp/droid/model/TransitBundle;)V

    .line 97
    return-void
.end method

.method public refresh(Landroid/location/Location;Landroid/content/Context;)V
    .locals 3
    .param p1, "location"    # Landroid/location/Location;
    .param p2, "context"    # Landroid/content/Context;

    .prologue
    const/4 v1, 0x1

    .line 61
    if-nez p1, :cond_0

    .line 62
    new-instance v0, Lcom/thetransitapp/droid/service/BundleTask;

    const/4 v2, 0x0

    invoke-direct {v0, p2, v2, v1, p0}, Lcom/thetransitapp/droid/service/BundleTask;-><init>(Landroid/content/Context;Landroid/location/Location;ZLcom/thetransitapp/droid/service/ServiceCallback;)V

    invoke-virtual {v0}, Lcom/thetransitapp/droid/service/BundleTask;->execute()V

    .line 74
    :goto_0
    return-void

    .line 63
    :cond_0
    invoke-direct {p0, p1}, Lcom/thetransitapp/droid/controller/FeedManager;->shouldLoad(Landroid/location/Location;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 64
    iput-object p1, p0, Lcom/thetransitapp/droid/controller/FeedManager;->lastLocation:Landroid/location/Location;

    .line 65
    invoke-direct {p0}, Lcom/thetransitapp/droid/controller/FeedManager;->updateTimeZone()V

    .line 67
    new-instance v2, Lcom/thetransitapp/droid/service/BundleTask;

    iget-boolean v0, p0, Lcom/thetransitapp/droid/controller/FeedManager;->loadedAll:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    :goto_1
    invoke-direct {v2, p2, p1, v0, p0}, Lcom/thetransitapp/droid/service/BundleTask;-><init>(Landroid/content/Context;Landroid/location/Location;ZLcom/thetransitapp/droid/service/ServiceCallback;)V

    invoke-virtual {v2}, Lcom/thetransitapp/droid/service/BundleTask;->execute()V

    .line 68
    iput-boolean v1, p0, Lcom/thetransitapp/droid/controller/FeedManager;->loadedAll:Z

    goto :goto_0

    :cond_1
    move v0, v1

    .line 67
    goto :goto_1

    .line 70
    :cond_2
    iput-object p1, p0, Lcom/thetransitapp/droid/controller/FeedManager;->lastLocation:Landroid/location/Location;

    .line 72
    invoke-direct {p0}, Lcom/thetransitapp/droid/controller/FeedManager;->notifyCallbacks()V

    goto :goto_0
.end method

.method public removeFeedManagerCallback(Lcom/thetransitapp/droid/controller/FeedManager$FeedManagerCallback;)V
    .locals 1
    .param p1, "callback"    # Lcom/thetransitapp/droid/controller/FeedManager$FeedManagerCallback;

    .prologue
    .line 200
    iget-object v0, p0, Lcom/thetransitapp/droid/controller/FeedManager;->callbacks:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 201
    return-void
.end method
